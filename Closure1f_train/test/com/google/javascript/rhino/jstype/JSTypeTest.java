/*
 *
 * ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is Rhino code, released
 * May 6, 1999.
 *
 * The Initial Developer of the Original Code is
 * Netscape Communications Corporation.
 * Portions created by the Initial Developer are Copyright (C) 1997-1999
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Nick Santos
 *
 * Alternatively, the contents of this file may be used under the terms of
 * the GNU General Public License Version 2 or later (the "GPL"), in which
 * case the provisions of the GPL are applicable instead of those above. If
 * you wish to allow use of your version of this file only under the terms of
 * the GPL and not to allow others to use your version of this file under the
 * MPL, indicate your decision by deleting the provisions above and replacing
 * them with the notice and other provisions required by the GPL. If you do
 * not delete the provisions above, a recipient may use your version of this
 * file under either the MPL or the GPL.
 *
 * ***** END LICENSE BLOCK ***** */

package com.google.javascript.rhino.jstype;

import static com.google.javascript.rhino.jstype.TernaryValue.FALSE;
import static com.google.javascript.rhino.jstype.TernaryValue.TRUE;
import static com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.JSType.TypePair;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import com.google.javascript.rhino.testing.Asserts;
import com.google.javascript.rhino.testing.AbstractStaticScope;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;
import com.google.javascript.rhino.testing.MapBasedScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO(nicksantos): Split some of this up into per-class unit tests.
public class JSTypeTest extends BaseJSTypeTestCase {
  private FunctionType dateMethod;
  private FunctionType functionType;
  private NamedType unresolvedNamedType;
  private FunctionType googBar;
  private FunctionType googSubBar;
  private FunctionType googSubSubBar;
  private ObjectType googBarInst;
  private ObjectType googSubBarInst;
  private ObjectType googSubSubBarInst;
  private NamedType namedGoogBar;
  private ObjectType subclassOfUnresolvedNamedType;
  private FunctionType subclassCtor;
  private FunctionType interfaceType;
  private ObjectType interfaceInstType;
  private FunctionType subInterfaceType;
  private ObjectType subInterfaceInstType;
  private JSType recordType;
  private EnumType enumType;
  private EnumElementType elementsType;
  private NamedType forwardDeclaredNamedType;

  private static final StaticScope<JSType> EMPTY_SCOPE =
      MapBasedScope.emptyScope();

  /**
   * A non exhaustive list of representative types used to test simple
   * properties that should hold for all types (such as the reflexivity
   * of subtyping).
   */
  private List<JSType> types;

  @Override
  protected void setUp() throws Exception {
    super.setUp();

    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("a", NUMBER_TYPE, null);
    builder.addProperty("b", STRING_TYPE, null);
    recordType = builder.build();

    enumType = new EnumType(registry, "Enum", null, NUMBER_TYPE);
    elementsType = enumType.getElementsType();
    functionType = new FunctionBuilder(registry)
        .withReturnType(NUMBER_TYPE)
        .build();
    dateMethod = new FunctionBuilder(registry)
        .withParamsNode(new Node(Token.PARAM_LIST))
        .withReturnType(NUMBER_TYPE)
        .withTypeOfThis(DATE_TYPE)
        .build();
    unresolvedNamedType =
        new NamedType(registry, "not.resolved.named.type", null, -1, -1);
    namedGoogBar = new NamedType(registry, "goog.Bar", null, -1, -1);

    subclassCtor =
        new FunctionType(registry, null, null, createArrowType(null),
            null, null, true, false);
    subclassCtor.setPrototypeBasedOn(unresolvedNamedType);
    subclassOfUnresolvedNamedType = subclassCtor.getInstanceType();

    interfaceType = FunctionType.forInterface(registry, "Interface", null);
    interfaceInstType = interfaceType.getInstanceType();

    subInterfaceType = FunctionType.forInterface(
        registry, "SubInterface", null);
    subInterfaceType.setExtendedInterfaces(
        Lists.<ObjectType>newArrayList(interfaceInstType));
    subInterfaceInstType = subInterfaceType.getInstanceType();

    googBar = registry.createConstructorType(
        "goog.Bar", null, null, null, null);
    googBar.getPrototype().defineDeclaredProperty("date", DATE_TYPE,
        null);
    googBar.setImplementedInterfaces(
        Lists.<ObjectType>newArrayList(interfaceInstType));
    googBarInst = googBar.getInstanceType();

    googSubBar = registry.createConstructorType(
        "googSubBar", null, null, null, null);
    googSubBar.setPrototypeBasedOn(googBar.getInstanceType());
    googSubBarInst = googSubBar.getInstanceType();

    googSubSubBar = registry.createConstructorType(
        "googSubSubBar", null, null, null, null);
    googSubSubBar.setPrototypeBasedOn(googSubBar.getInstanceType());
    googSubSubBarInst = googSubSubBar.getInstanceType();

    final ObjectType googObject = registry.createAnonymousObjectType(null);
    googObject.defineDeclaredProperty("Bar", googBar, null);

    namedGoogBar.resolve(null, new AbstractStaticScope<JSType>() {
          @Override
          public StaticSlot<JSType> getSlot(String name) {
            if ("goog".equals(name)) {
              return new SimpleSlot("goog", googObject, false);
            } else {
              return null;
            }
          }
        });
    assertNotNull(namedGoogBar.getImplicitPrototype());

    forwardDeclaredNamedType =
        new NamedType(registry, "forwardDeclared", "source", 1, 0);
    registry.forwardDeclareType("forwardDeclared");
    forwardDeclaredNamedType.resolve(
        new SimpleErrorReporter(), EMPTY_SCOPE);

    types = ImmutableList.of(
        NO_OBJECT_TYPE,
        NO_RESOLVED_TYPE,
        NO_TYPE,
        BOOLEAN_OBJECT_TYPE,
        BOOLEAN_TYPE,
        STRING_OBJECT_TYPE,
        STRING_TYPE,
        VOID_TYPE,
        UNKNOWN_TYPE,
        NULL_TYPE,
        NUMBER_OBJECT_TYPE,
        NUMBER_TYPE,
        DATE_TYPE,
        ERROR_TYPE,
        SYNTAX_ERROR_TYPE,
        dateMethod,
        functionType,
        unresolvedNamedType,
        googBar,
        googSubBar,
        googSubSubBar,
        namedGoogBar,
        googBar.getInstanceType(),
        subclassOfUnresolvedNamedType,
        subclassCtor,
        recordType,
        enumType,
        elementsType,
        googBar,
        googSubBar,
        forwardDeclaredNamedType);
  }

  /**
   * Tests the behavior of the top constructor type.
   */

@SuppressWarnings("checked") 
 public void testRestrictedTypeGivenToBoolean56() { 
     assertTypeEquals(BOOLEAN_TYPE, BOOLEAN_TYPE.getRestrictedTypeGivenToBooleanOutcome(true)); 
     assertTypeEquals(BOOLEAN_TYPE, BOOLEAN_TYPE.getRestrictedTypeGivenToBooleanOutcome(false)); 
     assertTypeEquals(NO_TYPE, NULL_TYPE.getRestrictedTypeGivenToBooleanOutcome(true)); 
     assertTypeEquals(NULL_TYPE, NULL_TYPE.getRestrictedTypeGivenToBooleanOutcome(false)); 
     assertTypeEquals(NUMBER_TYPE, NUMBER_TYPE.getRestrictedTypeGivenToBooleanOutcome(true)); 
     assertTypeEquals(NUMBER_TYPE, NUMBER_TYPE.getRestrictedTypeGivenToBooleanOutcome(false)); 
     assertTypeEquals(STRING_TYPE, STRING_TYPE.getRestrictedTypeGivenToBooleanOutcome(true)); 
     assertTypeEquals(STRING_TYPE, STRING_TYPE.getRestrictedTypeGivenToBooleanOutcome(false)); 
     assertTypeEquals(STRING_OBJECT_TYPE, STRING_OBJECT_TYPE.getRestrictedTypeGivenToBooleanOutcome(true)); 
     assertTypeEquals(NO_TYPE, STRING_OBJECT_TYPE.getRestrictedTypeGivenToBooleanOutcome(false)); 
     assertTypeEquals(NO_TYPE, VOID_TYPE.getRestrictedTypeGivenToBooleanOutcome(true)); 
     assertTypeEquals(VOID_TYPE, VOID_TYPE.getRestrictedTypeGivenToBooleanOutcome(false)); 
     assertTypeEquals(NO_OBJECT_TYPE, NO_OBJECT_TYPE.getRestrictedTypeGivenToBooleanOutcome(true)); 
     assertTypeEquals(NO_TYPE, NO_OBJECT_TYPE.getRestrictedTypeGivenToBooleanOutcome(false)); 
     assertTypeEquals(NO_TYPE, NO_TYPE.getRestrictedTypeGivenToBooleanOutcome(true)); 
     assertTypeEquals(NO_TYPE, NO_TYPE.getRestrictedTypeGivenToBooleanOutcome(false)); 
     assertTypeEquals(ALL_TYPE, ALL_TYPE.getRestrictedTypeGivenToBooleanOutcome(true)); 
     assertTypeEquals(ALL_TYPE, ALL_TYPE.getRestrictedTypeGivenToBooleanOutcome(false)); 
     assertTypeEquals(CHECKED_UNKNOWN_TYPE, UNKNOWN_TYPE.getRestrictedTypeGivenToBooleanOutcome(true)); 
     assertTypeEquals(UNKNOWN_TYPE, UNKNOWN_TYPE.getRestrictedTypeGivenToBooleanOutcome(false)); 
     UnionType nullableStringValue = (UnionType) createNullableType(STRING_TYPE); 
     assertTypeEquals(STRING_TYPE, nullableStringValue.getRestrictedTypeGivenToBooleanOutcome(true)); 
     assertTypeEquals(nullableStringValue, nullableStringValue.getRestrictedTypeGivenToBooleanOutcome(false)); 
     UnionType nullableStringObject = (UnionType) createNullableType(STRING_OBJECT_TYPE); 
     assertTypeEquals(STRING_OBJECT_TYPE, nullableStringObject.getRestrictedTypeGivenToBooleanOutcome(true)); 
     assertTypeEquals(NULL_TYPE, nullableStringObject.getRestrictedTypeGivenToBooleanOutcome(false)); 
 } 


public void testInvalidTemplatizedType153() throws Exception { 
     FunctionType templatizedCtor = registry.createConstructorType("TestingType", null, null, UNKNOWN_TYPE, ImmutableList.of("A", "B")); 
     boolean exceptionThrown = false; 
     try { 
         JSType templatizedInstance = registry.createTemplatizedType(templatizedCtor.getInstanceType(), ImmutableList.of(NUMBER_TYPE, STRING_TYPE, BOOLEAN_TYPE)); 
     } catch (IllegalArgumentException e) { 
         exceptionThrown = true; 
     } 
     assertTrue(exceptionThrown); 
 } 


public void testNullType172() throws Exception { 
     assertFalse(NULL_TYPE.isArrayType()); 
     assertFalse(NULL_TYPE.isBooleanValueType()); 
     assertFalse(NULL_TYPE.isDateType()); 
     assertFalse(NULL_TYPE.isEnumElementType()); 
     assertFalse(NULL_TYPE.isNamedType()); 
     assertTrue(NULL_TYPE.isNullType()); 
     assertFalse(NULL_TYPE.isNumber()); 
     assertFalse(NULL_TYPE.isNumberObjectType()); 
     assertFalse(NULL_TYPE.isNumberValueType()); 
     assertFalse(NULL_TYPE.isFunctionPrototypeType()); 
     assertFalse(NULL_TYPE.isRegexpType()); 
     assertFalse(NULL_TYPE.isString()); 
     assertFalse(NULL_TYPE.isStringObjectType()); 
     assertFalse(NULL_TYPE.isStringValueType()); 
     assertFalse(NULL_TYPE.isEnumType()); 
     assertFalse(NULL_TYPE.isUnionType()); 
     assertFalse(NULL_TYPE.isStruct()); 
     assertFalse(NULL_TYPE.isDict()); 
     assertFalse(NULL_TYPE.isAllType()); 
     assertFalse(NULL_TYPE.isVoidType()); 
     assertFalse(NULL_TYPE.isConstructor()); 
     assertFalse(NULL_TYPE.isInstanceType()); 
     assertNull(NULL_TYPE.autoboxesTo()); 
     assertFalse(NULL_TYPE.isSubtype(NO_OBJECT_TYPE)); 
     assertFalse(NULL_TYPE.isSubtype(NO_TYPE)); 
     assertTrue(NULL_TYPE.isSubtype(NULL_TYPE)); 
     assertTrue(NULL_TYPE.isSubtype(ALL_TYPE)); 
     assertFalse(NULL_TYPE.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(NULL_TYPE.isSubtype(NUMBER_TYPE)); 
     assertFalse(NULL_TYPE.isSubtype(functionType)); 
     assertFalse(NULL_TYPE.isSubtype(OBJECT_TYPE)); 
     assertFalse(NULL_TYPE.isSubtype(DATE_TYPE)); 
     assertFalse(NULL_TYPE.isSubtype(REGEXP_TYPE)); 
     assertFalse(NULL_TYPE.isSubtype(ARRAY_TYPE)); 
     assertTrue(NULL_TYPE.isSubtype(UNKNOWN_TYPE)); 
     assertTrue(NULL_TYPE.isSubtype(createNullableType(NO_OBJECT_TYPE))); 
     assertTrue(NULL_TYPE.isSubtype(createNullableType(NO_TYPE))); 
     assertTrue(NULL_TYPE.isSubtype(createNullableType(NULL_TYPE))); 
     assertTrue(NULL_TYPE.isSubtype(createNullableType(ALL_TYPE))); 
     assertTrue(NULL_TYPE.isSubtype(createNullableType(STRING_OBJECT_TYPE))); 
     assertTrue(NULL_TYPE.isSubtype(createNullableType(NUMBER_TYPE))); 
     assertTrue(NULL_TYPE.isSubtype(createNullableType(functionType))); 
     assertTrue(NULL_TYPE.isSubtype(createNullableType(OBJECT_TYPE))); 
     assertTrue(NULL_TYPE.isSubtype(createNullableType(DATE_TYPE))); 
     assertTrue(NULL_TYPE.isSubtype(createNullableType(REGEXP_TYPE))); 
     assertTrue(NULL_TYPE.isSubtype(createNullableType(ARRAY_TYPE))); 
     assertFalse(NULL_TYPE.canBeCalled()); 
     assertCanTestForEqualityWith(NULL_TYPE, NO_TYPE); 
     assertCanTestForEqualityWith(NULL_TYPE, NO_OBJECT_TYPE); 
     assertCanTestForEqualityWith(NULL_TYPE, ALL_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, ARRAY_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, BOOLEAN_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, BOOLEAN_OBJECT_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, DATE_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, ERROR_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, EVAL_ERROR_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, functionType); 
     assertCannotTestForEqualityWith(NULL_TYPE, NULL_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, NUMBER_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, NUMBER_OBJECT_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, OBJECT_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, URI_ERROR_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, RANGE_ERROR_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, REFERENCE_ERROR_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, REGEXP_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, STRING_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, STRING_OBJECT_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, SYNTAX_ERROR_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, TYPE_ERROR_TYPE); 
     assertCannotTestForEqualityWith(NULL_TYPE, VOID_TYPE); 
     assertTrue(NULL_TYPE.canTestForShallowEqualityWith(NO_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(BOOLEAN_OBJECT_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(functionType)); 
     assertTrue(NULL_TYPE.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(NULL_TYPE.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertFalse(NULL_TYPE.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertTrue(NULL_TYPE.canTestForShallowEqualityWith(createNullableType(STRING_OBJECT_TYPE))); 
     assertTypeEquals(NULL_TYPE, NULL_TYPE.getLeastSupertype(NULL_TYPE)); 
     assertTypeEquals(ALL_TYPE, NULL_TYPE.getLeastSupertype(ALL_TYPE)); 
     assertTypeEquals(createNullableType(STRING_OBJECT_TYPE), NULL_TYPE.getLeastSupertype(STRING_OBJECT_TYPE)); 
     assertTypeEquals(createNullableType(NUMBER_TYPE), NULL_TYPE.getLeastSupertype(NUMBER_TYPE)); 
     assertTypeEquals(createNullableType(functionType), NULL_TYPE.getLeastSupertype(functionType)); 
     assertTypeEquals(createNullableType(OBJECT_TYPE), NULL_TYPE.getLeastSupertype(OBJECT_TYPE)); 
     assertTypeEquals(createNullableType(DATE_TYPE), NULL_TYPE.getLeastSupertype(DATE_TYPE)); 
     assertTypeEquals(createNullableType(REGEXP_TYPE), NULL_TYPE.getLeastSupertype(REGEXP_TYPE)); 
     assertTrue(NULL_TYPE.matchesInt32Context()); 
     assertTrue(NULL_TYPE.matchesNumberContext()); 
     assertFalse(NULL_TYPE.matchesObjectContext()); 
     assertTrue(NULL_TYPE.matchesStringContext()); 
     assertTrue(NULL_TYPE.matchesUint32Context()); 
     assertFalse(NULL_TYPE.matchesObjectContext()); 
     assertEquals("null", NULL_TYPE.toString()); 
     assertTrue(NULL_TYPE.hasDisplayName()); 
     assertEquals("null", NULL_TYPE.getDisplayName()); 
     Asserts.assertResolvesToSame(NULL_TYPE); 
     assertTrue(NULL_TYPE.isSubtype(createUnionType(forwardDeclaredNamedType, NULL_TYPE))); 
     assertTypeEquals(createUnionType(forwardDeclaredNamedType, NULL_TYPE), NULL_TYPE.getGreatestSubtype(createUnionType(forwardDeclaredNamedType, NULL_TYPE))); 
     assertFalse(NULL_TYPE.isNominalConstructor()); 
     assertTrue(NULL_TYPE.differsFrom(UNKNOWN_TYPE)); 
 } 


public void testRecordTypeGreatestSubType1184() { 
     RecordTypeBuilder builder = new RecordTypeBuilder(registry); 
     builder.addProperty("d", NUMBER_TYPE, null); 
     builder.addProperty("e", STRING_TYPE, null); 
     builder.addProperty("f", STRING_TYPE, null); 
     JSType subRecordType = builder.build(); 
     JSType subtype = recordType.getGreatestSubtype(subRecordType); 
     builder = new RecordTypeBuilder(registry); 
     builder.addProperty("d", NUMBER_TYPE, null); 
     builder.addProperty("e", STRING_TYPE, null); 
     builder.addProperty("f", STRING_TYPE, null); 
     builder.addProperty("a", NUMBER_TYPE, null); 
     builder.addProperty("b", STRING_TYPE, null); 
     assertTypeEquals(subtype, builder.build()); 
 } 


public void testRecordSubtypeChain209() throws Exception { 
     RecordTypeBuilder builder = new RecordTypeBuilder(registry); 
     builder.addProperty("a", STRING_TYPE, null); 
     JSType aType = builder.build(); 
     builder = new RecordTypeBuilder(registry); 
     builder.addProperty("a", STRING_TYPE, null); 
     builder.addProperty("b", STRING_TYPE, null); 
     JSType abType = builder.build(); 
     builder = new RecordTypeBuilder(registry); 
     builder.addProperty("a", STRING_TYPE, null); 
     builder.addProperty("c", STRING_TYPE, null); 
     JSType acType = builder.build(); 
     JSType abOrAcType = registry.createUnionType(abType, acType); 
     builder = new RecordTypeBuilder(registry); 
     builder.addProperty("a", STRING_TYPE, null); 
     builder.addProperty("b", STRING_TYPE, null); 
     builder.addProperty("c", NUMBER_TYPE, null); 
     JSType abcType = builder.build(); 
     List<JSType> typeChain = Lists.newArrayList(registry.getNativeType(JSTypeNative.ALL_TYPE), registry.getNativeType(JSTypeNative.OBJECT_PROTOTYPE), registry.getNativeType(JSTypeNative.OBJECT_TYPE), aType, abOrAcType, abType, abcType, registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), registry.getNativeType(JSTypeNative.NO_TYPE)); 
     verifySubtypeChain(typeChain); 
 } 


public void testObjectType335() throws Exception { 
     PrototypeObjectType objectType = new PrototypeObjectType(registry, null, null); 
     assertFalse(objectType.isAllType()); 
     assertFalse(objectType.isArrayType()); 
     assertFalse(objectType.isDateType()); 
     assertFalse(objectType.isFunctionPrototypeType()); 
     assertTrue(objectType.getImplicitPrototype() == OBJECT_TYPE); 
     assertTrue(objectType.isSubtype(ALL_TYPE)); 
     assertFalse(objectType.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(objectType.isSubtype(NUMBER_TYPE)); 
     assertFalse(objectType.isSubtype(functionType)); 
     assertFalse(objectType.isSubtype(NULL_TYPE)); 
     assertFalse(objectType.isSubtype(DATE_TYPE)); 
     assertTrue(objectType.isSubtype(OBJECT_TYPE)); 
     assertTrue(objectType.isSubtype(unresolvedNamedType)); 
     assertFalse(objectType.isSubtype(namedGoogBar)); 
     assertFalse(objectType.isSubtype(REGEXP_TYPE)); 
     assertNull(objectType.autoboxesTo()); 
     assertCanTestForEqualityWith(objectType, NUMBER_TYPE); 
     assertFalse(objectType.matchesInt32Context()); 
     assertFalse(objectType.matchesNumberContext()); 
     assertTrue(objectType.matchesObjectContext()); 
     assertFalse(objectType.matchesStringContext()); 
     assertFalse(objectType.matchesUint32Context()); 
     assertFalse(objectType.isNullable()); 
     assertTrue(createNullableType(objectType).isNullable()); 
     assertEquals("{...}", objectType.toString()); 
     assertEquals(null, objectType.getDisplayName()); 
     assertFalse(objectType.hasReferenceName()); 
     assertEquals("anObject", new PrototypeObjectType(registry, "anObject", null).getDisplayName()); 
     Asserts.assertResolvesToSame(objectType); 
 } 


@SuppressWarnings("checked") 
 public void testGetTypesUnderInequality3350() { 
     UnionType stringNumber = (UnionType) createUnionType(NUMBER_TYPE, STRING_TYPE); 
     testGetTypesUnderInequality(stringNumber, NUMBER_TYPE, stringNumber, NUMBER_TYPE); 
     testGetTypesUnderInequality(stringNumber, STRING_TYPE, stringNumber, STRING_TYPE); 
 } 


public void testAllType404() throws Exception { 
     assertFalse(ALL_TYPE.isArrayType()); 
     assertFalse(ALL_TYPE.isBooleanValueType()); 
     assertFalse(ALL_TYPE.isDateType()); 
     assertFalse(ALL_TYPE.isEnumElementType()); 
     assertFalse(ALL_TYPE.isNamedType()); 
     assertFalse(ALL_TYPE.isNullType()); 
     assertFalse(ALL_TYPE.isNumber()); 
     assertFalse(ALL_TYPE.isNumberObjectType()); 
     assertFalse(ALL_TYPE.isNumberValueType()); 
     assertFalse(ALL_TYPE.isObject()); 
     assertFalse(ALL_TYPE.isFunctionPrototypeType()); 
     assertFalse(ALL_TYPE.isRegexpType()); 
     assertFalse(ALL_TYPE.isString()); 
     assertFalse(ALL_TYPE.isStringObjectType()); 
     assertFalse(ALL_TYPE.isStringValueType()); 
     assertFalse(ALL_TYPE.isEnumType()); 
     assertFalse(ALL_TYPE.isUnionType()); 
     assertFalse(ALL_TYPE.isStruct()); 
     assertFalse(ALL_TYPE.isDict()); 
     assertTrue(ALL_TYPE.isAllType()); 
     assertFalse(ALL_TYPE.isVoidType()); 
     assertFalse(ALL_TYPE.isConstructor()); 
     assertFalse(ALL_TYPE.isInstanceType()); 
     assertFalse(ALL_TYPE.isSubtype(NO_TYPE)); 
     assertFalse(ALL_TYPE.isSubtype(NO_OBJECT_TYPE)); 
     assertTrue(ALL_TYPE.isSubtype(ALL_TYPE)); 
     assertFalse(ALL_TYPE.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(ALL_TYPE.isSubtype(NUMBER_TYPE)); 
     assertFalse(ALL_TYPE.isSubtype(functionType)); 
     assertFalse(ALL_TYPE.isSubtype(recordType)); 
     assertFalse(ALL_TYPE.isSubtype(NULL_TYPE)); 
     assertFalse(ALL_TYPE.isSubtype(OBJECT_TYPE)); 
     assertFalse(ALL_TYPE.isSubtype(DATE_TYPE)); 
     assertTrue(ALL_TYPE.isSubtype(unresolvedNamedType)); 
     assertFalse(ALL_TYPE.isSubtype(namedGoogBar)); 
     assertFalse(ALL_TYPE.isSubtype(REGEXP_TYPE)); 
     assertFalse(ALL_TYPE.isSubtype(VOID_TYPE)); 
     assertTrue(ALL_TYPE.isSubtype(UNKNOWN_TYPE)); 
     assertFalse(ALL_TYPE.canBeCalled()); 
     assertCanTestForEqualityWith(ALL_TYPE, ALL_TYPE); 
     assertCanTestForEqualityWith(ALL_TYPE, STRING_OBJECT_TYPE); 
     assertCanTestForEqualityWith(ALL_TYPE, NUMBER_TYPE); 
     assertCanTestForEqualityWith(ALL_TYPE, functionType); 
     assertCanTestForEqualityWith(ALL_TYPE, recordType); 
     assertCanTestForEqualityWith(ALL_TYPE, VOID_TYPE); 
     assertCanTestForEqualityWith(ALL_TYPE, OBJECT_TYPE); 
     assertCanTestForEqualityWith(ALL_TYPE, DATE_TYPE); 
     assertCanTestForEqualityWith(ALL_TYPE, REGEXP_TYPE); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(NO_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(BOOLEAN_OBJECT_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(functionType)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(recordType)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertTrue(ALL_TYPE.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertFalse(ALL_TYPE.isNullable()); 
     assertTypeEquals(ALL_TYPE, ALL_TYPE.getLeastSupertype(ALL_TYPE)); 
     assertTypeEquals(ALL_TYPE, ALL_TYPE.getLeastSupertype(UNKNOWN_TYPE)); 
     assertTypeEquals(ALL_TYPE, ALL_TYPE.getLeastSupertype(STRING_OBJECT_TYPE)); 
     assertTypeEquals(ALL_TYPE, ALL_TYPE.getLeastSupertype(NUMBER_TYPE)); 
     assertTypeEquals(ALL_TYPE, ALL_TYPE.getLeastSupertype(functionType)); 
     assertTypeEquals(ALL_TYPE, ALL_TYPE.getLeastSupertype(OBJECT_TYPE)); 
     assertTypeEquals(ALL_TYPE, ALL_TYPE.getLeastSupertype(DATE_TYPE)); 
     assertTypeEquals(ALL_TYPE, ALL_TYPE.getLeastSupertype(REGEXP_TYPE)); 
     assertFalse(ALL_TYPE.matchesInt32Context()); 
     assertFalse(ALL_TYPE.matchesNumberContext()); 
     assertTrue(ALL_TYPE.matchesObjectContext()); 
     assertTrue(ALL_TYPE.matchesStringContext()); 
     assertFalse(ALL_TYPE.matchesUint32Context()); 
     assertEquals("*", ALL_TYPE.toString()); 
     assertTrue(ALL_TYPE.hasDisplayName()); 
     assertEquals("<Any Type>", ALL_TYPE.getDisplayName()); 
     Asserts.assertResolvesToSame(ALL_TYPE); 
     assertFalse(ALL_TYPE.isNominalConstructor()); 
 } 


public void testRecordTypeGreatestSubType7406() { 
     RecordTypeBuilder builder = new RecordTypeBuilder(registry); 
     builder.addProperty("x", NUMBER_TYPE, null); 
     JSType recordType = builder.build(); 
     U2U_CONSTRUCTOR_TYPE.defineDeclaredProperty("x", STRING_TYPE, null); 
     assertTypeEquals(NO_OBJECT_TYPE, recordType.getGreatestSubtype(U2U_CONSTRUCTOR_TYPE)); 
 } 


public void testSymmetryOfGreatestSubtype525() { 
     List<JSType> listA = getTypesToTestForSymmetry(); 
     List<JSType> listB = getTypesToTestForSymmetry(); 
     for (JSType typeA : listA) { 
         for (JSType typeB : listB) { 
             JSType aOnB = typeA.getGreatestSubtype(typeB); 
             JSType bOnA = typeB.getGreatestSubtype(typeA); 
             assertTrue(String.format("getGreatestSubtype not symmetrical:\n" + "typeA: %s\ntypeB: %s\n" + "a.getGreatestSubtype(b): %s\n" + "b.getGreatestSubtype(a): %s\n", typeA, typeB, aOnB, bOnA), aOnB.isEquivalentTo(bOnA)); 
         } 
     } 
 } 


public void testGreatestSubtypeSimpleTypes550() { 
     assertTypeEquals(ARRAY_TYPE, ARRAY_TYPE.getGreatestSubtype(ALL_TYPE)); 
     assertTypeEquals(ARRAY_TYPE, ALL_TYPE.getGreatestSubtype(ARRAY_TYPE)); 
     assertTypeEquals(NO_OBJECT_TYPE, REGEXP_TYPE.getGreatestSubtype(NO_OBJECT_TYPE)); 
     assertTypeEquals(NO_OBJECT_TYPE, NO_OBJECT_TYPE.getGreatestSubtype(REGEXP_TYPE)); 
     assertTypeEquals(NO_OBJECT_TYPE, ARRAY_TYPE.getGreatestSubtype(STRING_OBJECT_TYPE)); 
     assertTypeEquals(NO_TYPE, ARRAY_TYPE.getGreatestSubtype(NUMBER_TYPE)); 
     assertTypeEquals(NO_OBJECT_TYPE, ARRAY_TYPE.getGreatestSubtype(functionType)); 
     assertTypeEquals(STRING_OBJECT_TYPE, STRING_OBJECT_TYPE.getGreatestSubtype(OBJECT_TYPE)); 
     assertTypeEquals(STRING_OBJECT_TYPE, OBJECT_TYPE.getGreatestSubtype(STRING_OBJECT_TYPE)); 
     assertTypeEquals(NO_OBJECT_TYPE, ARRAY_TYPE.getGreatestSubtype(DATE_TYPE)); 
     assertTypeEquals(NO_OBJECT_TYPE, ARRAY_TYPE.getGreatestSubtype(REGEXP_TYPE)); 
     assertTypeEquals(EVAL_ERROR_TYPE, ERROR_TYPE.getGreatestSubtype(EVAL_ERROR_TYPE)); 
     assertTypeEquals(EVAL_ERROR_TYPE, EVAL_ERROR_TYPE.getGreatestSubtype(ERROR_TYPE)); 
     assertTypeEquals(NO_TYPE, NULL_TYPE.getGreatestSubtype(ERROR_TYPE)); 
     assertTypeEquals(UNKNOWN_TYPE, NUMBER_TYPE.getGreatestSubtype(UNKNOWN_TYPE)); 
     assertTypeEquals(NO_RESOLVED_TYPE, NO_OBJECT_TYPE.getGreatestSubtype(forwardDeclaredNamedType)); 
     assertTypeEquals(NO_RESOLVED_TYPE, forwardDeclaredNamedType.getGreatestSubtype(NO_OBJECT_TYPE)); 
 } 


public void testStringValueType578() throws Exception { 
     assertFalse(STRING_TYPE.isArrayType()); 
     assertFalse(STRING_TYPE.isBooleanObjectType()); 
     assertFalse(STRING_TYPE.isBooleanValueType()); 
     assertFalse(STRING_TYPE.isDateType()); 
     assertFalse(STRING_TYPE.isEnumElementType()); 
     assertFalse(STRING_TYPE.isNamedType()); 
     assertFalse(STRING_TYPE.isNullType()); 
     assertFalse(STRING_TYPE.isNumber()); 
     assertFalse(STRING_TYPE.isNumberObjectType()); 
     assertFalse(STRING_TYPE.isNumberValueType()); 
     assertFalse(STRING_TYPE.isFunctionPrototypeType()); 
     assertFalse(STRING_TYPE.isRegexpType()); 
     assertTrue(STRING_TYPE.isString()); 
     assertFalse(STRING_TYPE.isStringObjectType()); 
     assertTrue(STRING_TYPE.isStringValueType()); 
     assertFalse(STRING_TYPE.isEnumType()); 
     assertFalse(STRING_TYPE.isUnionType()); 
     assertFalse(STRING_TYPE.isStruct()); 
     assertFalse(STRING_TYPE.isDict()); 
     assertFalse(STRING_TYPE.isAllType()); 
     assertFalse(STRING_TYPE.isVoidType()); 
     assertFalse(STRING_TYPE.isConstructor()); 
     assertFalse(STRING_TYPE.isInstanceType()); 
     assertTypeEquals(STRING_OBJECT_TYPE, STRING_TYPE.autoboxesTo()); 
     assertTypeEquals(STRING_TYPE, STRING_OBJECT_TYPE.unboxesTo()); 
     assertTrue(STRING_TYPE.isSubtype(ALL_TYPE)); 
     assertFalse(STRING_TYPE.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(STRING_TYPE.isSubtype(NUMBER_TYPE)); 
     assertFalse(STRING_TYPE.isSubtype(OBJECT_TYPE)); 
     assertFalse(STRING_TYPE.isSubtype(NUMBER_TYPE)); 
     assertFalse(STRING_TYPE.isSubtype(DATE_TYPE)); 
     assertFalse(STRING_TYPE.isSubtype(REGEXP_TYPE)); 
     assertFalse(STRING_TYPE.isSubtype(ARRAY_TYPE)); 
     assertTrue(STRING_TYPE.isSubtype(STRING_TYPE)); 
     assertTrue(STRING_TYPE.isSubtype(UNKNOWN_TYPE)); 
     assertFalse(STRING_TYPE.canBeCalled()); 
     assertCanTestForEqualityWith(STRING_TYPE, ALL_TYPE); 
     assertCanTestForEqualityWith(STRING_TYPE, STRING_OBJECT_TYPE); 
     assertCannotTestForEqualityWith(STRING_TYPE, functionType); 
     assertCanTestForEqualityWith(STRING_TYPE, OBJECT_TYPE); 
     assertCanTestForEqualityWith(STRING_TYPE, NUMBER_TYPE); 
     assertCanTestForEqualityWith(STRING_TYPE, BOOLEAN_TYPE); 
     assertCanTestForEqualityWith(STRING_TYPE, BOOLEAN_OBJECT_TYPE); 
     assertCanTestForEqualityWith(STRING_TYPE, DATE_TYPE); 
     assertCanTestForEqualityWith(STRING_TYPE, REGEXP_TYPE); 
     assertCanTestForEqualityWith(STRING_TYPE, ARRAY_TYPE); 
     assertCanTestForEqualityWith(STRING_TYPE, UNKNOWN_TYPE); 
     assertTrue(STRING_TYPE.canTestForShallowEqualityWith(NO_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(BOOLEAN_OBJECT_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(functionType)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertTrue(STRING_TYPE.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(STRING_TYPE.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertFalse(STRING_TYPE.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertTrue(STRING_TYPE.canTestForShallowEqualityWith(UNKNOWN_TYPE)); 
     assertTrue(STRING_TYPE.matchesInt32Context()); 
     assertTrue(STRING_TYPE.matchesNumberContext()); 
     assertTrue(STRING_TYPE.matchesObjectContext()); 
     assertTrue(STRING_TYPE.matchesStringContext()); 
     assertTrue(STRING_TYPE.matchesUint32Context()); 
     assertFalse(STRING_TYPE.isNullable()); 
     assertTrue(createNullableType(STRING_TYPE).isNullable()); 
     assertEquals("string", STRING_TYPE.toString()); 
     assertTrue(STRING_TYPE.hasDisplayName()); 
     assertEquals("string", STRING_TYPE.getDisplayName()); 
     assertTypeEquals(NUMBER_TYPE, STRING_TYPE.findPropertyType("length")); 
     assertEquals(null, STRING_TYPE.findPropertyType("unknownProperty")); 
     Asserts.assertResolvesToSame(STRING_TYPE); 
     assertFalse(STRING_TYPE.isNominalConstructor()); 
 } 


public void testNumberObjectType582() throws Exception { 
     assertFalse(NUMBER_OBJECT_TYPE.isArrayType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isBooleanObjectType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isBooleanValueType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isDateType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isEnumElementType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isNamedType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isNullType()); 
     assertTrue(NUMBER_OBJECT_TYPE.isNumber()); 
     assertTrue(NUMBER_OBJECT_TYPE.isNumberObjectType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isNumberValueType()); 
     assertTrue(NUMBER_OBJECT_TYPE.isObject()); 
     assertFalse(NUMBER_OBJECT_TYPE.isFunctionPrototypeType()); 
     assertTrue(NUMBER_OBJECT_TYPE.getImplicitPrototype().isFunctionPrototypeType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isRegexpType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isString()); 
     assertFalse(NUMBER_OBJECT_TYPE.isStringObjectType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isStringValueType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isEnumType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isUnionType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isStruct()); 
     assertFalse(NUMBER_OBJECT_TYPE.isDict()); 
     assertFalse(NUMBER_OBJECT_TYPE.isAllType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isVoidType()); 
     assertFalse(NUMBER_OBJECT_TYPE.isConstructor()); 
     assertTrue(NUMBER_OBJECT_TYPE.isInstanceType()); 
     assertTypeEquals(NUMBER_OBJECT_TYPE, NUMBER_TYPE.autoboxesTo()); 
     assertTypeEquals(NUMBER_TYPE, NUMBER_OBJECT_TYPE.unboxesTo()); 
     assertTrue(NUMBER_OBJECT_TYPE.isSubtype(ALL_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.isSubtype(NUMBER_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.isSubtype(functionType)); 
     assertFalse(NUMBER_OBJECT_TYPE.isSubtype(NULL_TYPE)); 
     assertTrue(NUMBER_OBJECT_TYPE.isSubtype(OBJECT_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.isSubtype(DATE_TYPE)); 
     assertTrue(NUMBER_OBJECT_TYPE.isSubtype(unresolvedNamedType)); 
     assertFalse(NUMBER_OBJECT_TYPE.isSubtype(namedGoogBar)); 
     assertTrue(NUMBER_OBJECT_TYPE.isSubtype(createUnionType(NUMBER_OBJECT_TYPE, NULL_TYPE))); 
     assertFalse(NUMBER_OBJECT_TYPE.isSubtype(createUnionType(NUMBER_TYPE, NULL_TYPE))); 
     assertTrue(NUMBER_OBJECT_TYPE.isSubtype(UNKNOWN_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canBeCalled()); 
     assertCanTestForEqualityWith(NUMBER_OBJECT_TYPE, NO_TYPE); 
     assertCanTestForEqualityWith(NUMBER_OBJECT_TYPE, NO_OBJECT_TYPE); 
     assertCanTestForEqualityWith(NUMBER_OBJECT_TYPE, ALL_TYPE); 
     assertCanTestForEqualityWith(NUMBER_OBJECT_TYPE, NUMBER_TYPE); 
     assertCanTestForEqualityWith(NUMBER_OBJECT_TYPE, STRING_OBJECT_TYPE); 
     assertCanTestForEqualityWith(NUMBER_OBJECT_TYPE, functionType); 
     assertCanTestForEqualityWith(NUMBER_OBJECT_TYPE, elementsType); 
     assertCannotTestForEqualityWith(NUMBER_OBJECT_TYPE, VOID_TYPE); 
     assertCanTestForEqualityWith(NUMBER_OBJECT_TYPE, OBJECT_TYPE); 
     assertCanTestForEqualityWith(NUMBER_OBJECT_TYPE, DATE_TYPE); 
     assertCanTestForEqualityWith(NUMBER_OBJECT_TYPE, REGEXP_TYPE); 
     assertCanTestForEqualityWith(NUMBER_OBJECT_TYPE, ARRAY_TYPE); 
     assertTrue(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(NO_TYPE)); 
     assertTrue(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(BOOLEAN_OBJECT_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(functionType)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertTrue(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertTrue(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertFalse(NUMBER_OBJECT_TYPE.isNullable()); 
     assertTypeEquals(ALL_TYPE, NUMBER_OBJECT_TYPE.getLeastSupertype(ALL_TYPE)); 
     assertTypeEquals(createUnionType(NUMBER_OBJECT_TYPE, STRING_OBJECT_TYPE), NUMBER_OBJECT_TYPE.getLeastSupertype(STRING_OBJECT_TYPE)); 
     assertTypeEquals(createUnionType(NUMBER_OBJECT_TYPE, NUMBER_TYPE), NUMBER_OBJECT_TYPE.getLeastSupertype(NUMBER_TYPE)); 
     assertTypeEquals(createUnionType(NUMBER_OBJECT_TYPE, functionType), NUMBER_OBJECT_TYPE.getLeastSupertype(functionType)); 
     assertTypeEquals(OBJECT_TYPE, NUMBER_OBJECT_TYPE.getLeastSupertype(OBJECT_TYPE)); 
     assertTypeEquals(createUnionType(NUMBER_OBJECT_TYPE, DATE_TYPE), NUMBER_OBJECT_TYPE.getLeastSupertype(DATE_TYPE)); 
     assertTypeEquals(createUnionType(NUMBER_OBJECT_TYPE, REGEXP_TYPE), NUMBER_OBJECT_TYPE.getLeastSupertype(REGEXP_TYPE)); 
     assertTrue(NUMBER_OBJECT_TYPE.matchesInt32Context()); 
     assertTrue(NUMBER_OBJECT_TYPE.matchesNumberContext()); 
     assertTrue(NUMBER_OBJECT_TYPE.matchesObjectContext()); 
     assertTrue(NUMBER_OBJECT_TYPE.matchesStringContext()); 
     assertTrue(NUMBER_OBJECT_TYPE.matchesUint32Context()); 
     assertEquals("Number", NUMBER_OBJECT_TYPE.toString()); 
     assertTrue(NUMBER_OBJECT_TYPE.hasDisplayName()); 
     assertEquals("Number", NUMBER_OBJECT_TYPE.getDisplayName()); 
     assertTrue(NUMBER_OBJECT_TYPE.isNativeObjectType()); 
     Asserts.assertResolvesToSame(NUMBER_OBJECT_TYPE); 
 } 


public void testParameterizedTypeRelations687() throws Exception { 
     JSType objectOfString = createParameterizedType(OBJECT_TYPE, STRING_TYPE); 
     JSType arrayOfString = createParameterizedType(ARRAY_TYPE, STRING_TYPE); 
     JSType arrayOfNumber = createParameterizedType(ARRAY_TYPE, NUMBER_TYPE); 
     JSType arrayOfUnknown = createParameterizedType(ARRAY_TYPE, UNKNOWN_TYPE); 
     assertTypeEquals(OBJECT_TYPE, JSType.getLeastSupertype(arrayOfString, OBJECT_TYPE)); 
     assertTypeEquals(OBJECT_TYPE, JSType.getLeastSupertype(OBJECT_TYPE, arrayOfString)); 
     assertTypeEquals(ARRAY_TYPE, JSType.getLeastSupertype(arrayOfString, ARRAY_TYPE)); 
     assertTypeEquals(ARRAY_TYPE, JSType.getLeastSupertype(ARRAY_TYPE, arrayOfString)); 
     assertEquals("(Array|Object.<string>)", JSType.getLeastSupertype(objectOfString, ARRAY_TYPE).toString()); 
     assertEquals("(Array|Object.<string>)", JSType.getLeastSupertype(ARRAY_TYPE, objectOfString).toString()); 
     assertEquals("Array", JSType.getLeastSupertype(arrayOfString, arrayOfNumber).toString()); 
     assertEquals("Array", JSType.getLeastSupertype(arrayOfNumber, arrayOfString).toString()); 
     assertTypeEquals(arrayOfString, JSType.getLeastSupertype(arrayOfString, arrayOfString)); 
     assertEquals("(Array.<string>|Object.<string>)", JSType.getLeastSupertype(objectOfString, arrayOfString).toString()); 
     assertEquals("(Array.<string>|Object.<string>)", JSType.getLeastSupertype(arrayOfString, objectOfString).toString()); 
     assertTypeEquals(objectOfString, JSType.getGreatestSubtype(OBJECT_TYPE, objectOfString)); 
     assertTypeEquals(objectOfString, JSType.getGreatestSubtype(objectOfString, OBJECT_TYPE)); 
     assertTypeEquals(ARRAY_TYPE, JSType.getGreatestSubtype(objectOfString, ARRAY_TYPE)); 
     assertTypeEquals(JSType.getGreatestSubtype(objectOfString, arrayOfString), NO_OBJECT_TYPE); 
     assertTypeEquals(JSType.getGreatestSubtype(OBJECT_TYPE, arrayOfString), arrayOfString); 
 } 


public void testNoObjectType744() throws Exception { 
     assertTrue(NO_OBJECT_TYPE.isNoObjectType()); 
     assertFalse(NO_OBJECT_TYPE.isNoType()); 
     assertFalse(NO_OBJECT_TYPE.isArrayType()); 
     assertFalse(NO_OBJECT_TYPE.isBooleanValueType()); 
     assertFalse(NO_OBJECT_TYPE.isDateType()); 
     assertFalse(NO_OBJECT_TYPE.isEnumElementType()); 
     assertFalse(NO_OBJECT_TYPE.isNullType()); 
     assertFalse(NO_OBJECT_TYPE.isNamedType()); 
     assertFalse(NO_OBJECT_TYPE.isNullType()); 
     assertTrue(NO_OBJECT_TYPE.isNumber()); 
     assertFalse(NO_OBJECT_TYPE.isNumberObjectType()); 
     assertFalse(NO_OBJECT_TYPE.isNumberValueType()); 
     assertTrue(NO_OBJECT_TYPE.isObject()); 
     assertFalse(NO_OBJECT_TYPE.isFunctionPrototypeType()); 
     assertFalse(NO_OBJECT_TYPE.isRegexpType()); 
     assertTrue(NO_OBJECT_TYPE.isString()); 
     assertFalse(NO_OBJECT_TYPE.isStringObjectType()); 
     assertFalse(NO_OBJECT_TYPE.isStringValueType()); 
     assertFalse(NO_OBJECT_TYPE.isEnumType()); 
     assertFalse(NO_OBJECT_TYPE.isUnionType()); 
     assertFalse(NO_OBJECT_TYPE.isStruct()); 
     assertFalse(NO_OBJECT_TYPE.isDict()); 
     assertFalse(NO_OBJECT_TYPE.isAllType()); 
     assertFalse(NO_OBJECT_TYPE.isVoidType()); 
     assertTrue(NO_OBJECT_TYPE.isConstructor()); 
     assertFalse(NO_OBJECT_TYPE.isInstanceType()); 
     assertFalse(NO_OBJECT_TYPE.isSubtype(NO_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(NO_OBJECT_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(ARRAY_TYPE)); 
     assertFalse(NO_OBJECT_TYPE.isSubtype(BOOLEAN_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(BOOLEAN_OBJECT_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(DATE_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(EVAL_ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(functionType)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(recordType)); 
     assertFalse(NO_OBJECT_TYPE.isSubtype(NULL_TYPE)); 
     assertFalse(NO_OBJECT_TYPE.isSubtype(NUMBER_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(NUMBER_OBJECT_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(OBJECT_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(URI_ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(RANGE_ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(REFERENCE_ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(REGEXP_TYPE)); 
     assertFalse(NO_OBJECT_TYPE.isSubtype(STRING_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(STRING_OBJECT_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(SYNTAX_ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(TYPE_ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(ALL_TYPE)); 
     assertFalse(NO_OBJECT_TYPE.isSubtype(VOID_TYPE)); 
     assertCannotTestForEqualityWith(NO_OBJECT_TYPE, NO_TYPE); 
     assertCannotTestForEqualityWith(NO_OBJECT_TYPE, NO_OBJECT_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, ALL_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, ARRAY_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, BOOLEAN_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, BOOLEAN_OBJECT_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, DATE_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, EVAL_ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, functionType); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, recordType); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, NULL_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, NUMBER_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, NUMBER_OBJECT_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, OBJECT_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, URI_ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, RANGE_ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, REFERENCE_ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, REGEXP_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, STRING_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, STRING_OBJECT_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, SYNTAX_ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, TYPE_ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_OBJECT_TYPE, VOID_TYPE); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(NO_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertFalse(NO_OBJECT_TYPE.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(BOOLEAN_OBJECT_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(functionType)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(recordType)); 
     assertFalse(NO_OBJECT_TYPE.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertFalse(NO_OBJECT_TYPE.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertFalse(NO_OBJECT_TYPE.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(NO_OBJECT_TYPE.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertFalse(NO_OBJECT_TYPE.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertFalse(NO_OBJECT_TYPE.isNullable()); 
     assertTrue(NO_OBJECT_TYPE.isObject()); 
     assertTrue(NO_OBJECT_TYPE.matchesInt32Context()); 
     assertTrue(NO_OBJECT_TYPE.matchesNumberContext()); 
     assertTrue(NO_OBJECT_TYPE.matchesObjectContext()); 
     assertTrue(NO_OBJECT_TYPE.matchesStringContext()); 
     assertTrue(NO_OBJECT_TYPE.matchesUint32Context()); 
     assertEquals("NoObject", NO_OBJECT_TYPE.toString()); 
     assertFalse(NO_OBJECT_TYPE.hasDisplayName()); 
     assertEquals(null, NO_OBJECT_TYPE.getDisplayName()); 
     assertTypeEquals(NO_TYPE, NO_OBJECT_TYPE.getPropertyType("anyProperty")); 
     Asserts.assertResolvesToSame(NO_OBJECT_TYPE); 
     assertFalse(NO_OBJECT_TYPE.isNominalConstructor()); 
 } 


public void testForwardDeclaredNamedTypeEquals767() { 
     NamedType a = new NamedType(registry, "typeA", "source", 1, 0); 
     NamedType b = new NamedType(registry, "typeA", "source", 1, 0); 
     registry.forwardDeclareType("typeA"); 
     assertTypeEquals(a, b); 
     a.resolve(null, EMPTY_SCOPE); 
     assertTrue(a.isResolved()); 
     assertFalse(b.isResolved()); 
     assertTypeEquals(a, b); 
     assertFalse(a.isEquivalentTo(UNKNOWN_TYPE)); 
     assertFalse(b.isEquivalentTo(UNKNOWN_TYPE)); 
     assertTrue(a.isEmptyType()); 
     assertFalse(a.isNoType()); 
     assertTrue(a.isNoResolvedType()); 
 } 


public void testGetPropertyNames796() throws Exception { 
     ObjectType sup = registry.createObjectType(registry.createAnonymousObjectType(null)); 
     ObjectType sub = registry.createObjectType(sup); 
     sup.defineProperty("base", null, false, null); 
     sub.defineProperty("sub", null, false, null); 
     assertEquals(Sets.newHashSet("isPrototypeOf", "toLocaleString", "propertyIsEnumerable", "toString", "valueOf", "hasOwnProperty", "constructor", "base", "sub"), sub.getPropertyNames()); 
     assertEquals(Sets.newHashSet("isPrototypeOf", "toLocaleString", "propertyIsEnumerable", "toString", "valueOf", "hasOwnProperty", "constructor", "base"), sup.getPropertyNames()); 
     assertEquals(Sets.newHashSet(), NO_OBJECT_TYPE.getPropertyNames()); 
 } 


public void testObjectTypePropertiesCount809() throws Exception { 
     ObjectType sup = registry.createAnonymousObjectType(null); 
     int nativeProperties = sup.getPropertiesCount(); 
     sup.defineDeclaredProperty("a", DATE_TYPE, null); 
     assertEquals(nativeProperties + 1, sup.getPropertiesCount()); 
     sup.defineDeclaredProperty("b", DATE_TYPE, null); 
     assertEquals(nativeProperties + 2, sup.getPropertiesCount()); 
     ObjectType sub = registry.createObjectType(sup); 
     assertEquals(nativeProperties + 2, sub.getPropertiesCount()); 
 } 


public void testCreateAnonymousObjectType2816() throws Exception { 
     ObjectType anonymous = registry.createAnonymousObjectType(null); 
     anonymous.defineDeclaredProperty("a", NUMBER_TYPE, null); 
     anonymous.defineDeclaredProperty("b", NUMBER_TYPE, null); 
     anonymous.defineDeclaredProperty("c", NUMBER_TYPE, null); 
     anonymous.defineDeclaredProperty("d", NUMBER_TYPE, null); 
     anonymous.defineDeclaredProperty("e", NUMBER_TYPE, null); 
     anonymous.defineDeclaredProperty("f", NUMBER_TYPE, null); 
     assertEquals("{a: number, b: number, c: number, d: number, ...}", anonymous.toString()); 
 } 


public void testFunctionTypeRepresentation832() { 
     assertEquals("function (number, string): boolean", registry.createFunctionType(BOOLEAN_TYPE, false, NUMBER_TYPE, STRING_TYPE).toString()); 
     assertEquals("function (new:Array, ...[*]): Array", ARRAY_FUNCTION_TYPE.toString()); 
     assertEquals("function (new:Boolean, *=): boolean", BOOLEAN_OBJECT_FUNCTION_TYPE.toString()); 
     assertEquals("function (new:Number, *=): number", NUMBER_OBJECT_FUNCTION_TYPE.toString()); 
     assertEquals("function (new:String, *=): string", STRING_OBJECT_FUNCTION_TYPE.toString()); 
     assertEquals("function (...[number]): boolean", registry.createFunctionType(BOOLEAN_TYPE, true, NUMBER_TYPE).toString()); 
     assertEquals("function (number, ...[string]): boolean", registry.createFunctionType(BOOLEAN_TYPE, true, NUMBER_TYPE, STRING_TYPE).toString()); 
     assertEquals("function (this:Date, number): (boolean|number|string)", new FunctionBuilder(registry).withParamsNode(registry.createParameters(NUMBER_TYPE)).withReturnType(NUMBER_STRING_BOOLEAN).withTypeOfThis(DATE_TYPE).build().toString()); 
 } 


public void testStringObjectEnumType834() throws Exception { 
     EnumElementType stringEnum = new EnumType(registry, "Enum", null, STRING_OBJECT_TYPE).getElementsType(); 
     assertTypeEquals(NUMBER_TYPE, stringEnum.getPropertyType("length")); 
     assertTypeEquals(NUMBER_TYPE, stringEnum.findPropertyType("length")); 
     assertEquals(true, stringEnum.hasProperty("length")); 
     assertTypeEquals(STRING_OBJECT_FUNCTION_TYPE, stringEnum.getConstructor()); 
 } 


public void testSymmetryOfTestForEquality837() { 
     List<JSType> listA = getTypesToTestForSymmetry(); 
     List<JSType> listB = getTypesToTestForSymmetry(); 
     for (JSType typeA : listA) { 
         for (JSType typeB : listB) { 
             TernaryValue aOnB = typeA.testForEquality(typeB); 
             TernaryValue bOnA = typeB.testForEquality(typeA); 
             assertTrue(String.format("testForEquality not symmetrical:\n" + "typeA: %s\ntypeB: %s\n" + "a.testForEquality(b): %s\n" + "b.testForEquality(a): %s\n", typeA, typeB, aOnB, bOnA), aOnB == bOnA); 
         } 
     } 
 } 


public void testGetAndSetJSDocInfoWithNamedType883() throws Exception { 
     JSDocInfo info = new JSDocInfo(); 
     info.setDeprecated(true); 
     assertNull(namedGoogBar.getOwnPropertyJSDocInfo("X")); 
     namedGoogBar.setPropertyJSDocInfo("X", info); 
     assertTrue(namedGoogBar.getOwnPropertyJSDocInfo("X").isDeprecated()); 
     assertPropertyTypeInferred(namedGoogBar, "X"); 
     assertTypeEquals(UNKNOWN_TYPE, namedGoogBar.getPropertyType("X")); 
 } 


public void testRecordAndObjectChain3921() throws Exception { 
     RecordTypeBuilder builder = new RecordTypeBuilder(registry); 
     builder.addProperty("date", UNKNOWN_TYPE, null); 
     JSType hasUnknownDateProperty = builder.build(); 
     List<JSType> typeChain = Lists.newArrayList(registry.getNativeType(JSTypeNative.OBJECT_TYPE), hasUnknownDateProperty, googBar.getInstanceType(), registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), registry.getNativeType(JSTypeNative.NO_TYPE)); 
     verifySubtypeChain(typeChain); 
 } 


public void testEnumType940() throws Exception { 
     EnumType enumType = new EnumType(registry, "Enum", null, NUMBER_TYPE); 
     assertFalse(enumType.isArrayType()); 
     assertFalse(enumType.isBooleanObjectType()); 
     assertFalse(enumType.isBooleanValueType()); 
     assertFalse(enumType.isDateType()); 
     assertFalse(enumType.isEnumElementType()); 
     assertFalse(enumType.isNamedType()); 
     assertFalse(enumType.isNullType()); 
     assertFalse(enumType.isNumberObjectType()); 
     assertFalse(enumType.isNumberValueType()); 
     assertFalse(enumType.isFunctionPrototypeType()); 
     assertFalse(enumType.isRegexpType()); 
     assertFalse(enumType.isStringObjectType()); 
     assertFalse(enumType.isStringValueType()); 
     assertTrue(enumType.isEnumType()); 
     assertFalse(enumType.isUnionType()); 
     assertFalse(enumType.isStruct()); 
     assertFalse(enumType.isDict()); 
     assertFalse(enumType.isAllType()); 
     assertFalse(enumType.isVoidType()); 
     assertFalse(enumType.isConstructor()); 
     assertFalse(enumType.isInstanceType()); 
     assertTrue(enumType.isSubtype(ALL_TYPE)); 
     assertFalse(enumType.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(enumType.isSubtype(NUMBER_TYPE)); 
     assertFalse(enumType.isSubtype(functionType)); 
     assertFalse(enumType.isSubtype(NULL_TYPE)); 
     assertTrue(enumType.isSubtype(OBJECT_TYPE)); 
     assertFalse(enumType.isSubtype(DATE_TYPE)); 
     assertTrue(enumType.isSubtype(unresolvedNamedType)); 
     assertFalse(enumType.isSubtype(namedGoogBar)); 
     assertFalse(enumType.isSubtype(REGEXP_TYPE)); 
     assertFalse(enumType.canBeCalled()); 
     assertCanTestForEqualityWith(enumType, ALL_TYPE); 
     assertCanTestForEqualityWith(enumType, STRING_OBJECT_TYPE); 
     assertCanTestForEqualityWith(enumType, NUMBER_TYPE); 
     assertCanTestForEqualityWith(enumType, functionType); 
     assertCannotTestForEqualityWith(enumType, VOID_TYPE); 
     assertCanTestForEqualityWith(enumType, OBJECT_TYPE); 
     assertCanTestForEqualityWith(enumType, DATE_TYPE); 
     assertCanTestForEqualityWith(enumType, REGEXP_TYPE); 
     assertTrue(enumType.canTestForShallowEqualityWith(NO_TYPE)); 
     assertTrue(enumType.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertTrue(enumType.canTestForShallowEqualityWith(enumType)); 
     assertFalse(enumType.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(functionType)); 
     assertFalse(enumType.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertTrue(enumType.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(enumType.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertFalse(enumType.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertFalse(enumType.isNullable()); 
     assertFalse(enumType.matchesInt32Context()); 
     assertFalse(enumType.matchesNumberContext()); 
     assertTrue(enumType.matchesObjectContext()); 
     assertTrue(enumType.matchesStringContext()); 
     assertFalse(enumType.matchesUint32Context()); 
     assertEquals("enum{Enum}", enumType.toString()); 
     assertTrue(enumType.hasDisplayName()); 
     assertEquals("Enum", enumType.getDisplayName()); 
     assertEquals("AnotherEnum", new EnumType(registry, "AnotherEnum", null, NUMBER_TYPE).getDisplayName()); 
     assertFalse(new EnumType(registry, null, null, NUMBER_TYPE).hasDisplayName()); 
     Asserts.assertResolvesToSame(enumType); 
 } 


public void testGoogBar944() throws Exception { 
     assertTrue(namedGoogBar.isInstanceType()); 
     assertFalse(googBar.isInstanceType()); 
     assertFalse(namedGoogBar.isConstructor()); 
     assertTrue(googBar.isConstructor()); 
     assertTrue(googBar.getInstanceType().isInstanceType()); 
     assertTrue(namedGoogBar.getConstructor().isConstructor()); 
     assertTrue(namedGoogBar.getImplicitPrototype().isFunctionPrototypeType()); 
     assertTypeCanAssignToItself(googBar); 
     assertTypeCanAssignToItself(namedGoogBar); 
     googBar.isSubtype(namedGoogBar); 
     namedGoogBar.isSubtype(googBar); 
     assertTypeEquals(googBar, googBar); 
     assertTypeNotEquals(googBar, googSubBar); 
     Asserts.assertResolvesToSame(googBar); 
     Asserts.assertResolvesToSame(googSubBar); 
 } 


public void testSymmetryOfLeastSupertype948() { 
     List<JSType> listA = getTypesToTestForSymmetry(); 
     List<JSType> listB = getTypesToTestForSymmetry(); 
     for (JSType typeA : listA) { 
         for (JSType typeB : listB) { 
             JSType aOnB = typeA.getLeastSupertype(typeB); 
             JSType bOnA = typeB.getLeastSupertype(typeA); 
             assertTrue(String.format("getLeastSupertype not symmetrical:\n" + "typeA: %s\ntypeB: %s\n" + "a.getLeastSupertype(b): %s\n" + "b.getLeastSupertype(a): %s\n", typeA, typeB, aOnB, bOnA), aOnB.isEquivalentTo(bOnA)); 
         } 
     } 
 } 


public void testIsTemplatedType949() throws Exception { 
     assertTrue(new TemplateType(registry, "T").hasAnyTemplateTypes()); 
     assertFalse(ARRAY_TYPE.hasAnyTemplateTypes()); 
     assertTrue(registry.createParameterizedType(ARRAY_TYPE, new TemplateType(registry, "T")).hasAnyTemplateTypes()); 
     assertFalse(registry.createParameterizedType(ARRAY_TYPE, STRING_TYPE).hasAnyTemplateTypes()); 
     assertTrue(new FunctionBuilder(registry).withReturnType(new TemplateType(registry, "T")).build().hasAnyTemplateTypes()); 
     assertTrue(new FunctionBuilder(registry).withTypeOfThis(new TemplateType(registry, "T")).build().hasAnyTemplateTypes()); 
     assertFalse(new FunctionBuilder(registry).withReturnType(STRING_TYPE).build().hasAnyTemplateTypes()); 
     assertTrue(registry.createUnionType(NULL_TYPE, new TemplateType(registry, "T"), STRING_TYPE).hasAnyTemplateTypes()); 
     assertFalse(registry.createUnionType(NULL_TYPE, ARRAY_TYPE, STRING_TYPE).hasAnyTemplateTypes()); 
 } 


public void testEnumElementType964() throws Exception { 
     assertFalse(elementsType.isArrayType()); 
     assertFalse(elementsType.isBooleanObjectType()); 
     assertFalse(elementsType.isBooleanValueType()); 
     assertFalse(elementsType.isDateType()); 
     assertTrue(elementsType.isEnumElementType()); 
     assertFalse(elementsType.isNamedType()); 
     assertFalse(elementsType.isNullType()); 
     assertFalse(elementsType.isNumberObjectType()); 
     assertFalse(elementsType.isNumberValueType()); 
     assertFalse(elementsType.isFunctionPrototypeType()); 
     assertFalse(elementsType.isRegexpType()); 
     assertFalse(elementsType.isStringObjectType()); 
     assertFalse(elementsType.isStringValueType()); 
     assertFalse(elementsType.isEnumType()); 
     assertFalse(elementsType.isUnionType()); 
     assertFalse(elementsType.isStruct()); 
     assertFalse(elementsType.isDict()); 
     assertFalse(elementsType.isAllType()); 
     assertFalse(elementsType.isVoidType()); 
     assertFalse(elementsType.isConstructor()); 
     assertFalse(elementsType.isInstanceType()); 
     assertTrue(elementsType.isSubtype(ALL_TYPE)); 
     assertFalse(elementsType.isSubtype(STRING_OBJECT_TYPE)); 
     assertTrue(elementsType.isSubtype(NUMBER_TYPE)); 
     assertFalse(elementsType.isSubtype(functionType)); 
     assertFalse(elementsType.isSubtype(NULL_TYPE)); 
     assertFalse(elementsType.isSubtype(OBJECT_TYPE)); 
     assertFalse(elementsType.isSubtype(DATE_TYPE)); 
     assertTrue(elementsType.isSubtype(unresolvedNamedType)); 
     assertFalse(elementsType.isSubtype(namedGoogBar)); 
     assertFalse(elementsType.isSubtype(REGEXP_TYPE)); 
     assertFalse(elementsType.canBeCalled()); 
     assertCanTestForEqualityWith(elementsType, ALL_TYPE); 
     assertCanTestForEqualityWith(elementsType, STRING_OBJECT_TYPE); 
     assertCanTestForEqualityWith(elementsType, NUMBER_TYPE); 
     assertCanTestForEqualityWith(elementsType, NUMBER_OBJECT_TYPE); 
     assertCanTestForEqualityWith(elementsType, elementsType); 
     assertCannotTestForEqualityWith(elementsType, functionType); 
     assertCannotTestForEqualityWith(elementsType, VOID_TYPE); 
     assertCanTestForEqualityWith(elementsType, OBJECT_TYPE); 
     assertCanTestForEqualityWith(elementsType, DATE_TYPE); 
     assertCanTestForEqualityWith(elementsType, REGEXP_TYPE); 
     assertTrue(elementsType.canTestForShallowEqualityWith(NO_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertTrue(elementsType.canTestForShallowEqualityWith(elementsType)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(functionType)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertTrue(elementsType.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(elementsType.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertFalse(elementsType.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertFalse(elementsType.isNullable()); 
     assertTrue(elementsType.matchesInt32Context()); 
     assertTrue(elementsType.matchesNumberContext()); 
     assertTrue(elementsType.matchesObjectContext()); 
     assertTrue(elementsType.matchesStringContext()); 
     assertTrue(elementsType.matchesUint32Context()); 
     assertEquals("Enum.<number>", elementsType.toString()); 
     assertTrue(elementsType.hasDisplayName()); 
     assertEquals("Enum", elementsType.getDisplayName()); 
     Asserts.assertResolvesToSame(elementsType); 
 } 


public void testWeirdBug1008() { 
     assertTypeNotEquals(googBar, googBar.getInstanceType()); 
     assertFalse(googBar.isSubtype(googBar.getInstanceType())); 
     assertFalse(googBar.getInstanceType().isSubtype(googBar)); 
 } 


public void testNullableNamedTypeChain1017() throws Exception { 
     List<JSType> typeChain = Lists.newArrayList(registry.getNativeType(JSTypeNative.ALL_TYPE), registry.createOptionalNullableType(registry.getNativeType(JSTypeNative.OBJECT_PROTOTYPE)), registry.createOptionalNullableType(registry.getNativeType(JSTypeNative.OBJECT_TYPE)), registry.createOptionalNullableType(googBar.getPrototype()), registry.createOptionalNullableType(googBar.getInstanceType()), registry.createNullableType(googSubBar.getPrototype()), registry.createNullableType(googSubBar.getInstanceType()), googSubSubBar.getPrototype(), googSubSubBar.getInstanceType(), registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), registry.getNativeType(JSTypeNative.NO_TYPE)); 
     verifySubtypeChain(typeChain); 
 } 


public void testRegisterProperty1046() { 
     int i = 0; 
     List<JSType> allObjects = Lists.newArrayList(); 
     for (JSType type : types) { 
         String propName = "ALF" + i++; 
         if (type instanceof ObjectType) { 
             ObjectType objType = (ObjectType) type; 
             objType.defineDeclaredProperty(propName, UNKNOWN_TYPE, null); 
             objType.defineDeclaredProperty("allHaz", UNKNOWN_TYPE, null); 
             assertTypeEquals(type, registry.getGreatestSubtypeWithProperty(type, propName)); 
             List<JSType> typesWithProp = Lists.newArrayList(registry.getTypesWithProperty(propName)); 
             String message = type.toString(); 
             assertEquals(message, 1, typesWithProp.size()); 
             assertTypeEquals(type, typesWithProp.get(0)); 
             assertTypeEquals(NO_TYPE, registry.getGreatestSubtypeWithProperty(type, "GRRR")); 
             allObjects.add(type); 
         } 
     } 
     assertTypeListEquals(registry.getTypesWithProperty("GRRR"), Lists.newArrayList(NO_TYPE)); 
     assertTypeListEquals(allObjects, registry.getTypesWithProperty("allHaz")); 
 } 


public void testBooleanValueType1066() throws Exception { 
     assertFalse(BOOLEAN_TYPE.isArrayType()); 
     assertFalse(BOOLEAN_TYPE.isBooleanObjectType()); 
     assertTrue(BOOLEAN_TYPE.isBooleanValueType()); 
     assertFalse(BOOLEAN_TYPE.isDateType()); 
     assertFalse(BOOLEAN_TYPE.isEnumElementType()); 
     assertFalse(BOOLEAN_TYPE.isNamedType()); 
     assertFalse(BOOLEAN_TYPE.isNullType()); 
     assertFalse(BOOLEAN_TYPE.isNumberObjectType()); 
     assertFalse(BOOLEAN_TYPE.isNumberValueType()); 
     assertFalse(BOOLEAN_TYPE.isFunctionPrototypeType()); 
     assertFalse(BOOLEAN_TYPE.isRegexpType()); 
     assertFalse(BOOLEAN_TYPE.isStringObjectType()); 
     assertFalse(BOOLEAN_TYPE.isStringValueType()); 
     assertFalse(BOOLEAN_TYPE.isEnumType()); 
     assertFalse(BOOLEAN_TYPE.isUnionType()); 
     assertFalse(BOOLEAN_TYPE.isStruct()); 
     assertFalse(BOOLEAN_TYPE.isDict()); 
     assertFalse(BOOLEAN_TYPE.isAllType()); 
     assertFalse(BOOLEAN_TYPE.isVoidType()); 
     assertFalse(BOOLEAN_TYPE.isConstructor()); 
     assertFalse(BOOLEAN_TYPE.isInstanceType()); 
     assertTypeEquals(BOOLEAN_OBJECT_TYPE, BOOLEAN_TYPE.autoboxesTo()); 
     assertTypeEquals(BOOLEAN_TYPE, BOOLEAN_OBJECT_TYPE.unboxesTo()); 
     assertTrue(BOOLEAN_TYPE.isSubtype(ALL_TYPE)); 
     assertFalse(BOOLEAN_TYPE.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(BOOLEAN_TYPE.isSubtype(NUMBER_TYPE)); 
     assertFalse(BOOLEAN_TYPE.isSubtype(functionType)); 
     assertFalse(BOOLEAN_TYPE.isSubtype(NULL_TYPE)); 
     assertFalse(BOOLEAN_TYPE.isSubtype(OBJECT_TYPE)); 
     assertFalse(BOOLEAN_TYPE.isSubtype(DATE_TYPE)); 
     assertTrue(BOOLEAN_TYPE.isSubtype(unresolvedNamedType)); 
     assertFalse(BOOLEAN_TYPE.isSubtype(namedGoogBar)); 
     assertFalse(BOOLEAN_TYPE.isSubtype(REGEXP_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canBeCalled()); 
     assertCanTestForEqualityWith(BOOLEAN_TYPE, ALL_TYPE); 
     assertCanTestForEqualityWith(BOOLEAN_TYPE, STRING_OBJECT_TYPE); 
     assertCanTestForEqualityWith(BOOLEAN_TYPE, NUMBER_TYPE); 
     assertCannotTestForEqualityWith(BOOLEAN_TYPE, functionType); 
     assertCannotTestForEqualityWith(BOOLEAN_TYPE, VOID_TYPE); 
     assertCanTestForEqualityWith(BOOLEAN_TYPE, OBJECT_TYPE); 
     assertCanTestForEqualityWith(BOOLEAN_TYPE, DATE_TYPE); 
     assertCanTestForEqualityWith(BOOLEAN_TYPE, REGEXP_TYPE); 
     assertCanTestForEqualityWith(BOOLEAN_TYPE, UNKNOWN_TYPE); 
     assertTrue(BOOLEAN_TYPE.canTestForShallowEqualityWith(NO_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertTrue(BOOLEAN_TYPE.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(BOOLEAN_OBJECT_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(functionType)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(BOOLEAN_TYPE.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertTrue(BOOLEAN_TYPE.canTestForShallowEqualityWith(UNKNOWN_TYPE)); 
     assertFalse(BOOLEAN_TYPE.isNullable()); 
     assertTrue(BOOLEAN_TYPE.matchesInt32Context()); 
     assertTrue(BOOLEAN_TYPE.matchesNumberContext()); 
     assertTrue(BOOLEAN_TYPE.matchesObjectContext()); 
     assertTrue(BOOLEAN_TYPE.matchesStringContext()); 
     assertTrue(BOOLEAN_TYPE.matchesUint32Context()); 
     assertEquals("boolean", BOOLEAN_TYPE.toString()); 
     assertTrue(BOOLEAN_TYPE.hasDisplayName()); 
     assertEquals("boolean", BOOLEAN_TYPE.getDisplayName()); 
     Asserts.assertResolvesToSame(BOOLEAN_TYPE); 
 } 


public void testMixedParameterizedTypeChain1076() throws Exception { 
     JSType arrayOfNoType = createParameterizedType(ARRAY_TYPE, NO_TYPE); 
     JSType arrayOfString = createParameterizedType(ARRAY_TYPE, STRING_TYPE); 
     JSType objectOfString = createParameterizedType(OBJECT_TYPE, STRING_TYPE); 
     JSType objectOfStringOrNumber = createParameterizedType(OBJECT_TYPE, createUnionType(STRING_TYPE, NUMBER_TYPE)); 
     JSType objectOfAllType = createParameterizedType(OBJECT_TYPE, ALL_TYPE); 
     List<JSType> typeChain = Lists.newArrayList(registry.getNativeType(JSTypeNative.ALL_TYPE), registry.getNativeType(JSTypeNative.OBJECT_TYPE), objectOfAllType, objectOfStringOrNumber, objectOfString, arrayOfString, arrayOfNoType, registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), registry.getNativeType(JSTypeNative.NO_TYPE)); 
     verifySubtypeChain(typeChain, false); 
 } 


public void testAnonymousEnumElementChain1171() throws Exception { 
     ObjectType enumElemType = registry.createEnumType("typeB", null, registry.createAnonymousObjectType(null)).getElementsType(); 
     List<JSType> typeChain = Lists.newArrayList(ALL_TYPE, createNullableType(OBJECT_TYPE), OBJECT_TYPE, enumElemType, registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), registry.getNativeType(JSTypeNative.NO_TYPE)); 
     verifySubtypeChain(typeChain); 
 } 


public void testUnknownType1197() throws Exception { 
     assertFalse(UNKNOWN_TYPE.isArrayType()); 
     assertFalse(UNKNOWN_TYPE.isBooleanObjectType()); 
     assertFalse(UNKNOWN_TYPE.isBooleanValueType()); 
     assertFalse(UNKNOWN_TYPE.isDateType()); 
     assertFalse(UNKNOWN_TYPE.isEnumElementType()); 
     assertFalse(UNKNOWN_TYPE.isNamedType()); 
     assertFalse(UNKNOWN_TYPE.isNullType()); 
     assertFalse(UNKNOWN_TYPE.isNumberObjectType()); 
     assertFalse(UNKNOWN_TYPE.isNumberValueType()); 
     assertTrue(UNKNOWN_TYPE.isObject()); 
     assertFalse(UNKNOWN_TYPE.isFunctionPrototypeType()); 
     assertFalse(UNKNOWN_TYPE.isRegexpType()); 
     assertFalse(UNKNOWN_TYPE.isStringObjectType()); 
     assertFalse(UNKNOWN_TYPE.isStringValueType()); 
     assertFalse(UNKNOWN_TYPE.isEnumType()); 
     assertFalse(UNKNOWN_TYPE.isUnionType()); 
     assertFalse(UNKNOWN_TYPE.isStruct()); 
     assertFalse(UNKNOWN_TYPE.isDict()); 
     assertTrue(UNKNOWN_TYPE.isUnknownType()); 
     assertFalse(UNKNOWN_TYPE.isVoidType()); 
     assertFalse(UNKNOWN_TYPE.isConstructor()); 
     assertFalse(UNKNOWN_TYPE.isInstanceType()); 
     assertNull(UNKNOWN_TYPE.autoboxesTo()); 
     assertTrue(UNKNOWN_TYPE.isSubtype(UNKNOWN_TYPE)); 
     assertTrue(UNKNOWN_TYPE.isSubtype(STRING_TYPE)); 
     assertTrue(UNKNOWN_TYPE.isSubtype(NUMBER_TYPE)); 
     assertTrue(UNKNOWN_TYPE.isSubtype(functionType)); 
     assertTrue(UNKNOWN_TYPE.isSubtype(recordType)); 
     assertTrue(UNKNOWN_TYPE.isSubtype(NULL_TYPE)); 
     assertTrue(UNKNOWN_TYPE.isSubtype(OBJECT_TYPE)); 
     assertTrue(UNKNOWN_TYPE.isSubtype(DATE_TYPE)); 
     assertTrue(UNKNOWN_TYPE.isSubtype(namedGoogBar)); 
     assertTrue(UNKNOWN_TYPE.isSubtype(unresolvedNamedType)); 
     assertTrue(UNKNOWN_TYPE.isSubtype(REGEXP_TYPE)); 
     assertTrue(UNKNOWN_TYPE.isSubtype(VOID_TYPE)); 
     assertTrue(UNKNOWN_TYPE.canBeCalled()); 
     assertCanTestForEqualityWith(UNKNOWN_TYPE, UNKNOWN_TYPE); 
     assertCanTestForEqualityWith(UNKNOWN_TYPE, STRING_TYPE); 
     assertCanTestForEqualityWith(UNKNOWN_TYPE, NUMBER_TYPE); 
     assertCanTestForEqualityWith(UNKNOWN_TYPE, functionType); 
     assertCanTestForEqualityWith(UNKNOWN_TYPE, recordType); 
     assertCanTestForEqualityWith(UNKNOWN_TYPE, VOID_TYPE); 
     assertCanTestForEqualityWith(UNKNOWN_TYPE, OBJECT_TYPE); 
     assertCanTestForEqualityWith(UNKNOWN_TYPE, DATE_TYPE); 
     assertCanTestForEqualityWith(UNKNOWN_TYPE, REGEXP_TYPE); 
     assertCanTestForEqualityWith(UNKNOWN_TYPE, BOOLEAN_TYPE); 
     assertTrue(UNKNOWN_TYPE.canTestForShallowEqualityWith(UNKNOWN_TYPE)); 
     assertTrue(UNKNOWN_TYPE.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertTrue(UNKNOWN_TYPE.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertTrue(UNKNOWN_TYPE.canTestForShallowEqualityWith(functionType)); 
     assertTrue(UNKNOWN_TYPE.canTestForShallowEqualityWith(recordType)); 
     assertTrue(UNKNOWN_TYPE.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertTrue(UNKNOWN_TYPE.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertTrue(UNKNOWN_TYPE.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertTrue(UNKNOWN_TYPE.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertTrue(UNKNOWN_TYPE.isNullable()); 
     assertTypeEquals(UNKNOWN_TYPE, UNKNOWN_TYPE.getLeastSupertype(UNKNOWN_TYPE)); 
     assertTypeEquals(UNKNOWN_TYPE, UNKNOWN_TYPE.getLeastSupertype(STRING_TYPE)); 
     assertTypeEquals(UNKNOWN_TYPE, UNKNOWN_TYPE.getLeastSupertype(NUMBER_TYPE)); 
     assertTypeEquals(UNKNOWN_TYPE, UNKNOWN_TYPE.getLeastSupertype(functionType)); 
     assertTypeEquals(UNKNOWN_TYPE, UNKNOWN_TYPE.getLeastSupertype(OBJECT_TYPE)); 
     assertTypeEquals(UNKNOWN_TYPE, UNKNOWN_TYPE.getLeastSupertype(DATE_TYPE)); 
     assertTypeEquals(UNKNOWN_TYPE, UNKNOWN_TYPE.getLeastSupertype(REGEXP_TYPE)); 
     assertTrue(UNKNOWN_TYPE.matchesInt32Context()); 
     assertTrue(UNKNOWN_TYPE.matchesNumberContext()); 
     assertTrue(UNKNOWN_TYPE.matchesObjectContext()); 
     assertTrue(UNKNOWN_TYPE.matchesStringContext()); 
     assertTrue(UNKNOWN_TYPE.matchesUint32Context()); 
     assertPropertyTypeUnknown(UNKNOWN_TYPE, "XXX"); 
     assertEquals("?", UNKNOWN_TYPE.toString()); 
     assertTrue(UNKNOWN_TYPE.hasDisplayName()); 
     assertEquals("Unknown", UNKNOWN_TYPE.getDisplayName()); 
     Asserts.assertResolvesToSame(UNKNOWN_TYPE); 
     assertFalse(UNKNOWN_TYPE.isNominalConstructor()); 
     assertEquals(UNKNOWN_TYPE, UNKNOWN_TYPE.getPropertyType("abc")); 
 } 


public void testRecordTypeGreatestSubType21230() { 
     RecordTypeBuilder builder = new RecordTypeBuilder(registry); 
     JSType subRecordType = builder.build(); 
     JSType subtype = recordType.getGreatestSubtype(subRecordType); 
     builder = new RecordTypeBuilder(registry); 
     builder.addProperty("a", NUMBER_TYPE, null); 
     builder.addProperty("b", STRING_TYPE, null); 
     assertTypeEquals(subtype, builder.build()); 
 } 


public void testRecordTypeGreatestSubType61244() { 
     RecordTypeBuilder builder = new RecordTypeBuilder(registry); 
     builder.addProperty("x", UNKNOWN_TYPE, null); 
     JSType recordType = builder.build(); 
     assertTypeEquals(NO_OBJECT_TYPE, recordType.getGreatestSubtype(U2U_CONSTRUCTOR_TYPE)); 
     U2U_CONSTRUCTOR_TYPE.defineDeclaredProperty("x", STRING_TYPE, null); 
     assertTypeEquals(U2U_CONSTRUCTOR_TYPE, recordType.getGreatestSubtype(U2U_CONSTRUCTOR_TYPE)); 
     assertTypeEquals(U2U_CONSTRUCTOR_TYPE, U2U_CONSTRUCTOR_TYPE.getGreatestSubtype(recordType)); 
 } 


public void testRegExpType1311() throws Exception { 
     assertFalse(REGEXP_TYPE.isNoType()); 
     assertFalse(REGEXP_TYPE.isNoObjectType()); 
     assertFalse(REGEXP_TYPE.isArrayType()); 
     assertFalse(REGEXP_TYPE.isBooleanValueType()); 
     assertFalse(REGEXP_TYPE.isDateType()); 
     assertFalse(REGEXP_TYPE.isEnumElementType()); 
     assertFalse(REGEXP_TYPE.isNamedType()); 
     assertFalse(REGEXP_TYPE.isNullType()); 
     assertFalse(REGEXP_TYPE.isNumberValueType()); 
     assertFalse(REGEXP_TYPE.isFunctionPrototypeType()); 
     assertTrue(REGEXP_TYPE.getImplicitPrototype().isFunctionPrototypeType()); 
     assertTrue(REGEXP_TYPE.isRegexpType()); 
     assertFalse(REGEXP_TYPE.isStringValueType()); 
     assertFalse(REGEXP_TYPE.isEnumType()); 
     assertFalse(REGEXP_TYPE.isUnionType()); 
     assertFalse(REGEXP_TYPE.isStruct()); 
     assertFalse(REGEXP_TYPE.isDict()); 
     assertFalse(REGEXP_TYPE.isAllType()); 
     assertFalse(REGEXP_TYPE.isVoidType()); 
     assertNull(REGEXP_TYPE.autoboxesTo()); 
     assertFalse(REGEXP_TYPE.isSubtype(NO_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(NO_OBJECT_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(ARRAY_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(BOOLEAN_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(BOOLEAN_OBJECT_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(DATE_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(ERROR_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(EVAL_ERROR_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(functionType)); 
     assertFalse(REGEXP_TYPE.isSubtype(NULL_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(NUMBER_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(NUMBER_OBJECT_TYPE)); 
     assertTrue(REGEXP_TYPE.isSubtype(OBJECT_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(URI_ERROR_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(RANGE_ERROR_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(REFERENCE_ERROR_TYPE)); 
     assertTrue(REGEXP_TYPE.isSubtype(REGEXP_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(STRING_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(SYNTAX_ERROR_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(TYPE_ERROR_TYPE)); 
     assertTrue(REGEXP_TYPE.isSubtype(ALL_TYPE)); 
     assertFalse(REGEXP_TYPE.isSubtype(VOID_TYPE)); 
     assertTrue(REGEXP_TYPE.canBeCalled()); 
     assertCanTestForEqualityWith(REGEXP_TYPE, ALL_TYPE); 
     assertCanTestForEqualityWith(REGEXP_TYPE, STRING_OBJECT_TYPE); 
     assertCanTestForEqualityWith(REGEXP_TYPE, NUMBER_TYPE); 
     assertCanTestForEqualityWith(REGEXP_TYPE, functionType); 
     assertCannotTestForEqualityWith(REGEXP_TYPE, VOID_TYPE); 
     assertCanTestForEqualityWith(REGEXP_TYPE, OBJECT_TYPE); 
     assertCanTestForEqualityWith(REGEXP_TYPE, DATE_TYPE); 
     assertCanTestForEqualityWith(REGEXP_TYPE, REGEXP_TYPE); 
     assertCanTestForEqualityWith(REGEXP_TYPE, ARRAY_TYPE); 
     assertTrue(REGEXP_TYPE.canTestForShallowEqualityWith(NO_TYPE)); 
     assertTrue(REGEXP_TYPE.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(BOOLEAN_OBJECT_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(functionType)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertTrue(REGEXP_TYPE.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertTrue(REGEXP_TYPE.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(REGEXP_TYPE.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertFalse(REGEXP_TYPE.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertFalse(REGEXP_TYPE.isNullable()); 
     assertTrue(createNullableType(REGEXP_TYPE).isNullable()); 
     assertTypeEquals(ALL_TYPE, REGEXP_TYPE.getLeastSupertype(ALL_TYPE)); 
     assertTypeEquals(createUnionType(REGEXP_TYPE, STRING_OBJECT_TYPE), REGEXP_TYPE.getLeastSupertype(STRING_OBJECT_TYPE)); 
     assertTypeEquals(createUnionType(REGEXP_TYPE, NUMBER_TYPE), REGEXP_TYPE.getLeastSupertype(NUMBER_TYPE)); 
     assertTypeEquals(createUnionType(REGEXP_TYPE, functionType), REGEXP_TYPE.getLeastSupertype(functionType)); 
     assertTypeEquals(OBJECT_TYPE, REGEXP_TYPE.getLeastSupertype(OBJECT_TYPE)); 
     assertTypeEquals(createUnionType(DATE_TYPE, REGEXP_TYPE), REGEXP_TYPE.getLeastSupertype(DATE_TYPE)); 
     assertTypeEquals(REGEXP_TYPE, REGEXP_TYPE.getLeastSupertype(REGEXP_TYPE)); 
     assertEquals(9, REGEXP_TYPE.getImplicitPrototype().getPropertiesCount()); 
     assertEquals(14, REGEXP_TYPE.getPropertiesCount()); 
     assertReturnTypeEquals(REGEXP_TYPE, REGEXP_TYPE.getPropertyType("constructor")); 
     assertReturnTypeEquals(createNullableType(ARRAY_TYPE), REGEXP_TYPE.getPropertyType("exec")); 
     assertReturnTypeEquals(BOOLEAN_TYPE, REGEXP_TYPE.getPropertyType("test")); 
     assertReturnTypeEquals(STRING_TYPE, REGEXP_TYPE.getPropertyType("toString")); 
     assertTypeEquals(STRING_TYPE, REGEXP_TYPE.getPropertyType("source")); 
     assertTypeEquals(BOOLEAN_TYPE, REGEXP_TYPE.getPropertyType("global")); 
     assertTypeEquals(BOOLEAN_TYPE, REGEXP_TYPE.getPropertyType("ignoreCase")); 
     assertTypeEquals(BOOLEAN_TYPE, REGEXP_TYPE.getPropertyType("multiline")); 
     assertTypeEquals(NUMBER_TYPE, REGEXP_TYPE.getPropertyType("lastIndex")); 
     assertFalse(REGEXP_TYPE.matchesInt32Context()); 
     assertFalse(REGEXP_TYPE.matchesNumberContext()); 
     assertTrue(REGEXP_TYPE.matchesObjectContext()); 
     assertTrue(REGEXP_TYPE.matchesStringContext()); 
     assertFalse(REGEXP_TYPE.matchesUint32Context()); 
     assertEquals("RegExp", REGEXP_TYPE.toString()); 
     assertTrue(REGEXP_TYPE.hasDisplayName()); 
     assertEquals("RegExp", REGEXP_TYPE.getDisplayName()); 
     assertTrue(REGEXP_TYPE.isNativeObjectType()); 
     Asserts.assertResolvesToSame(REGEXP_TYPE); 
     assertFalse(REGEXP_TYPE.isNominalConstructor()); 
     assertTrue(REGEXP_TYPE.getConstructor().isNominalConstructor()); 
 } 


public void testSupertypeOfProxiedFunctionTypes1400() { 
     ObjectType fn1 = new FunctionBuilder(registry).withParamsNode(new Node(Token.PARAM_LIST)).withReturnType(NUMBER_TYPE).build(); 
     ObjectType fn2 = new FunctionBuilder(registry).withParamsNode(new Node(Token.PARAM_LIST)).withReturnType(STRING_TYPE).build(); 
     ObjectType p1 = new ProxyObjectType(registry, fn1); 
     ObjectType p2 = new ProxyObjectType(registry, fn2); 
     ObjectType supremum = new FunctionBuilder(registry).withParamsNode(new Node(Token.PARAM_LIST)).withReturnType(registry.createUnionType(STRING_TYPE, NUMBER_TYPE)).build(); 
     assertTypeEquals(fn1.getLeastSupertype(fn2), p1.getLeastSupertype(p2)); 
     assertTypeEquals(supremum, fn1.getLeastSupertype(fn2)); 
     assertTypeEquals(supremum, fn1.getLeastSupertype(p2)); 
     assertTypeEquals(supremum, p1.getLeastSupertype(fn2)); 
     assertTypeEquals(supremum, p1.getLeastSupertype(p2)); 
 } 


public void testVoidType1423() throws Exception { 
     assertTrue(VOID_TYPE.isSubtype(ALL_TYPE)); 
     assertFalse(VOID_TYPE.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(VOID_TYPE.isSubtype(REGEXP_TYPE)); 
     assertNull(VOID_TYPE.autoboxesTo()); 
     assertCanTestForEqualityWith(VOID_TYPE, ALL_TYPE); 
     assertCannotTestForEqualityWith(VOID_TYPE, REGEXP_TYPE); 
     assertTrue(VOID_TYPE.canTestForShallowEqualityWith(NO_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(BOOLEAN_OBJECT_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(functionType)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertFalse(VOID_TYPE.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(VOID_TYPE.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertTrue(VOID_TYPE.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertTrue(VOID_TYPE.canTestForShallowEqualityWith(createUnionType(NUMBER_TYPE, VOID_TYPE))); 
     assertFalse(VOID_TYPE.matchesInt32Context()); 
     assertFalse(VOID_TYPE.matchesNumberContext()); 
     assertFalse(VOID_TYPE.matchesObjectContext()); 
     assertTrue(VOID_TYPE.matchesStringContext()); 
     assertFalse(VOID_TYPE.matchesUint32Context()); 
     Asserts.assertResolvesToSame(VOID_TYPE); 
 } 


public void testGetAndSetJSDocInfoWithObjectTypes1449() throws Exception { 
     ObjectType sup = registry.createObjectType(registry.createAnonymousObjectType(null)); 
     ObjectType sub = registry.createObjectType(sup); 
     JSDocInfo deprecated = new JSDocInfo(); 
     deprecated.setDeprecated(true); 
     JSDocInfo privateInfo = new JSDocInfo(); 
     privateInfo.setVisibility(Visibility.PRIVATE); 
     sup.defineProperty("X", NUMBER_TYPE, true, null); 
     sup.setPropertyJSDocInfo("X", privateInfo); 
     sub.defineProperty("X", NUMBER_TYPE, true, null); 
     sub.setPropertyJSDocInfo("X", deprecated); 
     assertFalse(sup.getOwnPropertyJSDocInfo("X").isDeprecated()); 
     assertEquals(Visibility.PRIVATE, sup.getOwnPropertyJSDocInfo("X").getVisibility()); 
     assertTypeEquals(NUMBER_TYPE, sup.getPropertyType("X")); 
     assertTrue(sub.getOwnPropertyJSDocInfo("X").isDeprecated()); 
     assertNull(sub.getOwnPropertyJSDocInfo("X").getVisibility()); 
     assertTypeEquals(NUMBER_TYPE, sub.getPropertyType("X")); 
 } 


public void testNoType1531() throws Exception { 
     assertFalse(NO_TYPE.isNoObjectType()); 
     assertTrue(NO_TYPE.isNoType()); 
     assertFalse(NO_TYPE.isArrayType()); 
     assertFalse(NO_TYPE.isBooleanValueType()); 
     assertFalse(NO_TYPE.isDateType()); 
     assertFalse(NO_TYPE.isEnumElementType()); 
     assertFalse(NO_TYPE.isNullType()); 
     assertFalse(NO_TYPE.isNamedType()); 
     assertFalse(NO_TYPE.isNullType()); 
     assertTrue(NO_TYPE.isNumber()); 
     assertFalse(NO_TYPE.isNumberObjectType()); 
     assertFalse(NO_TYPE.isNumberValueType()); 
     assertTrue(NO_TYPE.isObject()); 
     assertFalse(NO_TYPE.isFunctionPrototypeType()); 
     assertFalse(NO_TYPE.isRegexpType()); 
     assertTrue(NO_TYPE.isString()); 
     assertFalse(NO_TYPE.isStringObjectType()); 
     assertFalse(NO_TYPE.isStringValueType()); 
     assertFalse(NO_TYPE.isEnumType()); 
     assertFalse(NO_TYPE.isUnionType()); 
     assertFalse(NO_TYPE.isStruct()); 
     assertFalse(NO_TYPE.isDict()); 
     assertFalse(NO_TYPE.isAllType()); 
     assertFalse(NO_TYPE.isVoidType()); 
     assertTrue(NO_TYPE.isConstructor()); 
     assertFalse(NO_TYPE.isInstanceType()); 
     assertTrue(NO_TYPE.isSubtype(NO_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(NO_OBJECT_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(ARRAY_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(BOOLEAN_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(BOOLEAN_OBJECT_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(DATE_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(ERROR_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(EVAL_ERROR_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(functionType)); 
     assertTrue(NO_TYPE.isSubtype(NULL_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(NUMBER_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(NUMBER_OBJECT_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(OBJECT_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(URI_ERROR_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(RANGE_ERROR_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(REFERENCE_ERROR_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(REGEXP_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(STRING_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(STRING_OBJECT_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(SYNTAX_ERROR_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(TYPE_ERROR_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(ALL_TYPE)); 
     assertTrue(NO_TYPE.isSubtype(VOID_TYPE)); 
     assertCannotTestForEqualityWith(NO_TYPE, NO_TYPE); 
     assertCannotTestForEqualityWith(NO_TYPE, NO_OBJECT_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, ARRAY_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, BOOLEAN_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, BOOLEAN_OBJECT_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, DATE_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, EVAL_ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, functionType); 
     assertCanTestForEqualityWith(NO_TYPE, NULL_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, NUMBER_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, NUMBER_OBJECT_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, OBJECT_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, URI_ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, RANGE_ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, REFERENCE_ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, REGEXP_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, STRING_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, STRING_OBJECT_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, SYNTAX_ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, TYPE_ERROR_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, ALL_TYPE); 
     assertCanTestForEqualityWith(NO_TYPE, VOID_TYPE); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(NO_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(BOOLEAN_OBJECT_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(functionType)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertTrue(NO_TYPE.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertTrue(NO_TYPE.isNullable()); 
     assertTrue(NO_TYPE.isObject()); 
     assertTrue(NO_TYPE.matchesInt32Context()); 
     assertTrue(NO_TYPE.matchesNumberContext()); 
     assertTrue(NO_TYPE.matchesObjectContext()); 
     assertTrue(NO_TYPE.matchesStringContext()); 
     assertTrue(NO_TYPE.matchesUint32Context()); 
     assertEquals("None", NO_TYPE.toString()); 
     assertEquals(null, NO_TYPE.getDisplayName()); 
     assertFalse(NO_TYPE.hasDisplayName()); 
     assertTypeEquals(NO_TYPE, NO_TYPE.getPropertyType("anyProperty")); 
     Asserts.assertResolvesToSame(NO_TYPE); 
     assertFalse(NO_TYPE.isNominalConstructor()); 
 } 


public void testFunctionSubtypeChain1549() throws Exception { 
     List<JSType> typeChain = Lists.newArrayList(registry.getNativeType(JSTypeNative.ALL_TYPE), registry.getNativeType(JSTypeNative.OBJECT_PROTOTYPE), registry.getNativeType(JSTypeNative.OBJECT_TYPE), registry.getNativeType(JSTypeNative.FUNCTION_PROTOTYPE), registry.getNativeType(JSTypeNative.GREATEST_FUNCTION_TYPE), dateMethod, registry.getNativeType(JSTypeNative.LEAST_FUNCTION_TYPE), registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), registry.getNativeType(JSTypeNative.NO_TYPE)); 
     verifySubtypeChain(typeChain); 
 } 


public void testGetAndSetJSDocInfoWithNoType1561() throws Exception { 
     JSDocInfo deprecated = new JSDocInfo(); 
     deprecated.setDeprecated(true); 
     NO_TYPE.setPropertyJSDocInfo("X", deprecated); 
     assertNull(NO_TYPE.getOwnPropertyJSDocInfo("X")); 
 } 


public void testFunctionType1595() throws Exception { 
     assertTrue(functionType.isObject()); 
     assertFalse(functionType.isFunctionPrototypeType()); 
     assertTrue(functionType.getImplicitPrototype().getImplicitPrototype().isFunctionPrototypeType()); 
     assertTrue(functionType.isSubtype(ALL_TYPE)); 
     assertFalse(functionType.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(functionType.isSubtype(NUMBER_TYPE)); 
     assertFalse(functionType.isSubtype(DATE_TYPE)); 
     assertFalse(functionType.isSubtype(REGEXP_TYPE)); 
     assertTrue(functionType.isSubtype(UNKNOWN_TYPE)); 
     assertTrue(functionType.isSubtype(U2U_CONSTRUCTOR_TYPE)); 
     assertNull(functionType.autoboxesTo()); 
     assertTrue(functionType.canBeCalled()); 
     assertCanTestForEqualityWith(functionType, ALL_TYPE); 
     assertCanTestForEqualityWith(functionType, STRING_OBJECT_TYPE); 
     assertCanTestForEqualityWith(functionType, functionType); 
     assertCanTestForEqualityWith(functionType, OBJECT_TYPE); 
     assertCannotTestForEqualityWith(functionType, NUMBER_TYPE); 
     assertCanTestForEqualityWith(functionType, DATE_TYPE); 
     assertCanTestForEqualityWith(functionType, REGEXP_TYPE); 
     assertTrue(functionType.canTestForShallowEqualityWith(NO_TYPE)); 
     assertTrue(functionType.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(BOOLEAN_OBJECT_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertTrue(functionType.canTestForShallowEqualityWith(functionType)); 
     assertFalse(functionType.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertTrue(functionType.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(functionType.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertFalse(functionType.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertTrue(functionType.canTestForShallowEqualityWith(UNKNOWN_TYPE)); 
     assertFalse(functionType.matchesInt32Context()); 
     assertFalse(functionType.matchesNumberContext()); 
     assertTrue(functionType.matchesObjectContext()); 
     assertFalse(functionType.matchesStringContext()); 
     assertFalse(functionType.matchesUint32Context()); 
     assertTrue(functionType.hasProperty("prototype")); 
     assertPropertyTypeInferred(functionType, "prototype"); 
     Asserts.assertResolvesToSame(functionType); 
     assertEquals("aFunctionName", new FunctionBuilder(registry).withName("aFunctionName").build().getDisplayName()); 
 } 


@SuppressWarnings("checked") 
 public void testGetTypesUnderEquality41599() { 
     UnionType stringNumber = (UnionType) createUnionType(NUMBER_TYPE, STRING_TYPE); 
     testGetTypeUnderEquality(stringNumber, STRING_TYPE, stringNumber, STRING_TYPE); 
     testGetTypeUnderEquality(stringNumber, NUMBER_TYPE, stringNumber, NUMBER_TYPE); 
 } 


public void testTestForEquality1618() { 
     compare(TRUE, NO_OBJECT_TYPE, NO_OBJECT_TYPE); 
     compare(UNKNOWN, ALL_TYPE, ALL_TYPE); 
     compare(TRUE, NO_TYPE, NO_TYPE); 
     compare(UNKNOWN, NO_RESOLVED_TYPE, NO_RESOLVED_TYPE); 
     compare(UNKNOWN, NO_OBJECT_TYPE, NUMBER_TYPE); 
     compare(UNKNOWN, ALL_TYPE, NUMBER_TYPE); 
     compare(UNKNOWN, NO_TYPE, NUMBER_TYPE); 
     compare(FALSE, NULL_TYPE, BOOLEAN_TYPE); 
     compare(TRUE, NULL_TYPE, NULL_TYPE); 
     compare(FALSE, NULL_TYPE, NUMBER_TYPE); 
     compare(FALSE, NULL_TYPE, OBJECT_TYPE); 
     compare(FALSE, NULL_TYPE, STRING_TYPE); 
     compare(TRUE, NULL_TYPE, VOID_TYPE); 
     compare(UNKNOWN, NULL_TYPE, createUnionType(UNKNOWN_TYPE, VOID_TYPE)); 
     compare(UNKNOWN, NULL_TYPE, createUnionType(OBJECT_TYPE, VOID_TYPE)); 
     compare(UNKNOWN, NULL_TYPE, unresolvedNamedType); 
     compare(UNKNOWN, NULL_TYPE, createUnionType(unresolvedNamedType, DATE_TYPE)); 
     compare(FALSE, VOID_TYPE, REGEXP_TYPE); 
     compare(TRUE, VOID_TYPE, VOID_TYPE); 
     compare(UNKNOWN, VOID_TYPE, createUnionType(REGEXP_TYPE, VOID_TYPE)); 
     compare(UNKNOWN, NUMBER_TYPE, BOOLEAN_TYPE); 
     compare(UNKNOWN, NUMBER_TYPE, NUMBER_TYPE); 
     compare(UNKNOWN, NUMBER_TYPE, OBJECT_TYPE); 
     compare(UNKNOWN, ARRAY_TYPE, BOOLEAN_TYPE); 
     compare(UNKNOWN, OBJECT_TYPE, BOOLEAN_TYPE); 
     compare(UNKNOWN, OBJECT_TYPE, STRING_TYPE); 
     compare(UNKNOWN, STRING_TYPE, STRING_TYPE); 
     compare(UNKNOWN, STRING_TYPE, BOOLEAN_TYPE); 
     compare(UNKNOWN, STRING_TYPE, NUMBER_TYPE); 
     compare(FALSE, STRING_TYPE, VOID_TYPE); 
     compare(FALSE, STRING_TYPE, NULL_TYPE); 
     compare(FALSE, STRING_TYPE, createUnionType(NULL_TYPE, VOID_TYPE)); 
     compare(UNKNOWN, UNKNOWN_TYPE, BOOLEAN_TYPE); 
     compare(UNKNOWN, UNKNOWN_TYPE, NULL_TYPE); 
     compare(UNKNOWN, UNKNOWN_TYPE, VOID_TYPE); 
     compare(FALSE, U2U_CONSTRUCTOR_TYPE, BOOLEAN_TYPE); 
     compare(FALSE, U2U_CONSTRUCTOR_TYPE, NUMBER_TYPE); 
     compare(FALSE, U2U_CONSTRUCTOR_TYPE, STRING_TYPE); 
     compare(FALSE, U2U_CONSTRUCTOR_TYPE, VOID_TYPE); 
     compare(FALSE, U2U_CONSTRUCTOR_TYPE, NULL_TYPE); 
     compare(UNKNOWN, U2U_CONSTRUCTOR_TYPE, OBJECT_TYPE); 
     compare(UNKNOWN, U2U_CONSTRUCTOR_TYPE, ALL_TYPE); 
     compare(UNKNOWN, NULL_TYPE, subclassOfUnresolvedNamedType); 
     JSType functionAndNull = createUnionType(NULL_TYPE, dateMethod); 
     compare(UNKNOWN, functionAndNull, dateMethod); 
     compare(UNKNOWN, NULL_TYPE, NO_TYPE); 
     compare(UNKNOWN, VOID_TYPE, NO_TYPE); 
     compare(UNKNOWN, NULL_TYPE, unresolvedNamedType); 
     compare(UNKNOWN, VOID_TYPE, unresolvedNamedType); 
     compare(TRUE, NO_TYPE, NO_TYPE); 
 } 


public void testCanCastTo1622() { 
     assertTrue(ALL_TYPE.canCastTo(NULL_TYPE)); 
     assertTrue(ALL_TYPE.canCastTo(VOID_TYPE)); 
     assertTrue(ALL_TYPE.canCastTo(STRING_TYPE)); 
     assertTrue(ALL_TYPE.canCastTo(NUMBER_TYPE)); 
     assertTrue(ALL_TYPE.canCastTo(BOOLEAN_TYPE)); 
     assertTrue(ALL_TYPE.canCastTo(OBJECT_TYPE)); 
     assertFalse(NUMBER_TYPE.canCastTo(NULL_TYPE)); 
     assertFalse(NUMBER_TYPE.canCastTo(VOID_TYPE)); 
     assertFalse(NUMBER_TYPE.canCastTo(STRING_TYPE)); 
     assertTrue(NUMBER_TYPE.canCastTo(NUMBER_TYPE)); 
     assertFalse(NUMBER_TYPE.canCastTo(BOOLEAN_TYPE)); 
     assertFalse(NUMBER_TYPE.canCastTo(OBJECT_TYPE)); 
     assertFalse(STRING_TYPE.canCastTo(NULL_TYPE)); 
     assertFalse(STRING_TYPE.canCastTo(VOID_TYPE)); 
     assertTrue(STRING_TYPE.canCastTo(STRING_TYPE)); 
     assertFalse(STRING_TYPE.canCastTo(NUMBER_TYPE)); 
     assertFalse(STRING_TYPE.canCastTo(BOOLEAN_TYPE)); 
     assertFalse(STRING_TYPE.canCastTo(OBJECT_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canCastTo(NULL_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canCastTo(VOID_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canCastTo(STRING_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canCastTo(NUMBER_TYPE)); 
     assertTrue(BOOLEAN_TYPE.canCastTo(BOOLEAN_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canCastTo(OBJECT_TYPE)); 
     assertFalse(OBJECT_TYPE.canCastTo(NULL_TYPE)); 
     assertFalse(OBJECT_TYPE.canCastTo(VOID_TYPE)); 
     assertFalse(OBJECT_TYPE.canCastTo(STRING_TYPE)); 
     assertFalse(OBJECT_TYPE.canCastTo(NUMBER_TYPE)); 
     assertFalse(OBJECT_TYPE.canCastTo(BOOLEAN_TYPE)); 
     assertTrue(OBJECT_TYPE.canCastTo(OBJECT_TYPE)); 
     assertFalse(BOOLEAN_TYPE.canCastTo(OBJECT_NUMBER_STRING)); 
     assertFalse(OBJECT_NUMBER_STRING.canCastTo(BOOLEAN_TYPE)); 
     assertFalse(ARRAY_TYPE.canCastTo(U2U_FUNCTION_TYPE)); 
     assertFalse(U2U_FUNCTION_TYPE.canCastTo(ARRAY_TYPE)); 
     assertFalse(NULL_VOID.canCastTo(ARRAY_TYPE)); 
     assertTrue(NULL_VOID.canCastTo(createUnionType(ARRAY_TYPE, NULL_TYPE))); 
     assertTrue(ARRAY_FUNCTION_TYPE.canCastTo(BOOLEAN_OBJECT_FUNCTION_TYPE)); 
 } 


public void testFunctionPrototypeAndImplicitPrototype21628() { 
     FunctionType constructor = registry.createConstructorType(null, null, null, null); 
     ObjectType instance = constructor.getInstanceType(); 
     ObjectType prototype = registry.createAnonymousObjectType(null); 
     prototype.defineDeclaredProperty("foo", DATE_TYPE, null); 
     constructor.defineDeclaredProperty("prototype", prototype, null); 
     assertEquals(NATIVE_PROPERTIES_COUNT + 1, instance.getPropertiesCount()); 
 } 


public void testNamedTypeHasOwnProperty1675() throws Exception { 
     namedGoogBar.getImplicitPrototype().defineProperty("base", null, false, null); 
     namedGoogBar.defineProperty("sub", null, false, null); 
     assertFalse(namedGoogBar.hasOwnProperty("base")); 
     assertTrue(namedGoogBar.hasProperty("base")); 
     assertTrue(namedGoogBar.hasOwnProperty("sub")); 
     assertTrue(namedGoogBar.hasProperty("sub")); 
 } 


public void testCheckedUnknownType1695() throws Exception { 
     assertPropertyTypeUnknown(CHECKED_UNKNOWN_TYPE, "XXX"); 
     assertEquals("??", CHECKED_UNKNOWN_TYPE.toString()); 
     assertTrue(CHECKED_UNKNOWN_TYPE.hasDisplayName()); 
     assertEquals("Unknown", CHECKED_UNKNOWN_TYPE.getDisplayName()); 
     Asserts.assertResolvesToSame(CHECKED_UNKNOWN_TYPE); 
     assertFalse(CHECKED_UNKNOWN_TYPE.isNominalConstructor()); 
     assertEquals(CHECKED_UNKNOWN_TYPE, CHECKED_UNKNOWN_TYPE.getPropertyType("abc")); 
 } 


public void testRecordTypeLeastSuperType21720() { 
     RecordTypeBuilder builder = new RecordTypeBuilder(registry); 
     builder.addProperty("e", NUMBER_TYPE, null); 
     builder.addProperty("b", STRING_TYPE, null); 
     builder.addProperty("c", STRING_TYPE, null); 
     JSType otherRecordType = builder.build(); 
     assertTypeEquals(registry.createUnionType(recordType, otherRecordType), recordType.getLeastSupertype(otherRecordType)); 
 } 


public void testGetTypesUnderEquality61759() { 
     JSType optNullNumber = createUnionType(VOID_TYPE, NULL_TYPE, NUMBER_TYPE); 
     testGetTypeUnderEquality(optNullNumber, NULL_TYPE, createUnionType(NULL_TYPE, VOID_TYPE), NULL_TYPE); 
 } 


public void testPartiallyTemplatizedType1819() throws Exception { 
     FunctionType templatizedCtor = registry.createConstructorType("TestingType", null, null, UNKNOWN_TYPE, ImmutableList.of("A", "B")); 
     JSType templatizedInstance = registry.createTemplatizedType(templatizedCtor.getInstanceType(), ImmutableList.of(NUMBER_TYPE)); 
     assertTrue(templatizedInstance.isTemplatized()); 
     assertTrue(templatizedInstance.hasTemplatizedType("A")); 
     assertTrue(templatizedInstance.hasTemplatizedType("B")); 
     assertFalse(templatizedInstance.hasTemplatizedType("C")); 
     assertEquals(NUMBER_TYPE, templatizedInstance.getTemplatizedType("A")); 
     assertEquals(UNKNOWN_TYPE, templatizedInstance.getTemplatizedType("B")); 
     assertEquals(UNKNOWN_TYPE, templatizedInstance.getTemplatizedType("C")); 
     assertEquals("TestingType.<number,?>", templatizedInstance.toString()); 
 } 


public void testGreatestSubtypeWithProperty1854() { 
     ObjectType foo = registry.createObjectType("foo", null, OBJECT_TYPE); 
     ObjectType bar = registry.createObjectType("bar", null, namedGoogBar); 
     foo.defineDeclaredProperty("propz", UNKNOWN_TYPE, null); 
     bar.defineDeclaredProperty("propz", UNKNOWN_TYPE, null); 
     assertTypeEquals(bar, registry.getGreatestSubtypeWithProperty(namedGoogBar, "propz")); 
 } 


public void testRecordTypeGreatestSubType41856() { 
     RecordTypeBuilder builder = new RecordTypeBuilder(registry); 
     builder.addProperty("a", STRING_TYPE, null); 
     builder.addProperty("b", STRING_TYPE, null); 
     builder.addProperty("c", STRING_TYPE, null); 
     JSType subRecordType = builder.build(); 
     JSType subtype = recordType.getGreatestSubtype(subRecordType); 
     assertTypeEquals(subtype, NO_TYPE); 
 } 


public void testUniversalConstructorType1886() throws Exception { 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isNoObjectType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isNoType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isArrayType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isBooleanValueType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isDateType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isEnumElementType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isNullType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isNamedType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isNullType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isNumber()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isNumberObjectType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isNumberValueType()); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.isObject()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isFunctionPrototypeType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isRegexpType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isString()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isStringObjectType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isStringValueType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isEnumType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isUnionType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isStruct()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isDict()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isAllType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isVoidType()); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.isConstructor()); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.isInstanceType()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(NO_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(NO_OBJECT_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(ARRAY_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(BOOLEAN_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(BOOLEAN_OBJECT_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(DATE_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(ERROR_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(EVAL_ERROR_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.isSubtype(functionType)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(recordType)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(NULL_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(NUMBER_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(NUMBER_OBJECT_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.isSubtype(OBJECT_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(URI_ERROR_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(RANGE_ERROR_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(REFERENCE_ERROR_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(REGEXP_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(STRING_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(SYNTAX_ERROR_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(TYPE_ERROR_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.isSubtype(ALL_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isSubtype(VOID_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(NO_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(NO_OBJECT_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(ALL_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(ARRAY_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(BOOLEAN_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(BOOLEAN_OBJECT_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(DATE_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(ERROR_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(EVAL_ERROR_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(functionType)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(recordType)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(NULL_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(NUMBER_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(OBJECT_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(URI_ERROR_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(RANGE_ERROR_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(REGEXP_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(STRING_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(STRING_OBJECT_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(TYPE_ERROR_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForEqualityWith(VOID_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(NO_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(NO_OBJECT_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(ARRAY_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(BOOLEAN_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(BOOLEAN_OBJECT_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(DATE_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(ERROR_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(EVAL_ERROR_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(functionType)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(recordType)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(NULL_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(NUMBER_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(NUMBER_OBJECT_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(OBJECT_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(URI_ERROR_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(RANGE_ERROR_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(REFERENCE_ERROR_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(REGEXP_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(STRING_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(STRING_OBJECT_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(SYNTAX_ERROR_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(TYPE_ERROR_TYPE)); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(ALL_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.canTestForShallowEqualityWith(VOID_TYPE)); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.isNullable()); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.isObject()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.matchesInt32Context()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.matchesNumberContext()); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.matchesObjectContext()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.matchesStringContext()); 
     assertFalse(U2U_CONSTRUCTOR_TYPE.matchesUint32Context()); 
     assertEquals("Function", U2U_CONSTRUCTOR_TYPE.toString()); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.hasDisplayName()); 
     assertEquals("Function", U2U_CONSTRUCTOR_TYPE.getDisplayName()); 
     assertTypeEquals(UNKNOWN_TYPE, U2U_CONSTRUCTOR_TYPE.getPropertyType("anyProperty")); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.isNativeObjectType()); 
     Asserts.assertResolvesToSame(U2U_CONSTRUCTOR_TYPE); 
     assertTrue(U2U_CONSTRUCTOR_TYPE.isNominalConstructor()); 
 } 


@SuppressWarnings("checked") 
 public void testGetTypesUnderInequality41890() throws Exception { 
     UnionType nullableOptionalNumber = (UnionType) createUnionType(NULL_TYPE, VOID_TYPE, NUMBER_TYPE); 
     testGetTypesUnderInequality(nullableOptionalNumber, NULL_TYPE, NUMBER_TYPE, NULL_TYPE); 
 } 


public void testEnumTypeChain1923() throws Exception { 
     List<JSType> typeChain = Lists.newArrayList(registry.getNativeType(JSTypeNative.ALL_TYPE), registry.getNativeType(JSTypeNative.OBJECT_PROTOTYPE), registry.getNativeType(JSTypeNative.OBJECT_TYPE), enumType, registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), registry.getNativeType(JSTypeNative.NO_TYPE)); 
     verifySubtypeChain(typeChain); 
 } 


public void testCreateRecordType1997() throws Exception { 
     Map<String, RecordProperty> properties = new HashMap<String, RecordProperty>(); 
     properties.put("hello", new RecordProperty(NUMBER_TYPE, null)); 
     JSType recordType = registry.createRecordType(properties); 
     assertEquals("{hello: number}", recordType.toString()); 
 } 


public void testNamedGoogBar2050() throws Exception { 
     assertFalse(namedGoogBar.isFunctionPrototypeType()); 
     assertTrue(namedGoogBar.getImplicitPrototype().isFunctionPrototypeType()); 
     assertTrue(namedGoogBar.isSubtype(ALL_TYPE)); 
     assertFalse(namedGoogBar.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(namedGoogBar.isSubtype(NUMBER_TYPE)); 
     assertFalse(namedGoogBar.isSubtype(functionType)); 
     assertFalse(namedGoogBar.isSubtype(NULL_TYPE)); 
     assertTrue(namedGoogBar.isSubtype(OBJECT_TYPE)); 
     assertFalse(namedGoogBar.isSubtype(DATE_TYPE)); 
     assertTrue(namedGoogBar.isSubtype(namedGoogBar)); 
     assertTrue(namedGoogBar.isSubtype(unresolvedNamedType)); 
     assertFalse(namedGoogBar.isSubtype(REGEXP_TYPE)); 
     assertFalse(namedGoogBar.isSubtype(ARRAY_TYPE)); 
     assertNull(namedGoogBar.autoboxesTo()); 
     assertTypeEquals(DATE_TYPE, namedGoogBar.getPropertyType("date")); 
     assertFalse(namedGoogBar.isNativeObjectType()); 
     assertFalse(namedGoogBar.getImplicitPrototype().isNativeObjectType()); 
     JSType resolvedNamedGoogBar = Asserts.assertValidResolve(namedGoogBar); 
     assertNotSame(resolvedNamedGoogBar, namedGoogBar); 
     assertSame(resolvedNamedGoogBar, googBar.getInstanceType()); 
 } 


public void testTypeOfThisIsProxied2221() { 
     ObjectType fnType = new FunctionBuilder(registry).withReturnType(NUMBER_TYPE).withTypeOfThis(OBJECT_TYPE).build(); 
     ObjectType proxyType = new ProxyObjectType(registry, fnType); 
     assertTypeEquals(fnType.getTypeOfThis(), proxyType.getTypeOfThis()); 
 } 


public void testFunctionUnionSubtypeChain2298() throws Exception { 
     List<JSType> typeChain = Lists.newArrayList(createUnionType(OBJECT_TYPE, STRING_TYPE), createUnionType(GREATEST_FUNCTION_TYPE, googBarInst, STRING_TYPE), createUnionType(STRING_TYPE, registry.createFunctionType(createUnionType(STRING_TYPE, NUMBER_TYPE)), googBarInst), createUnionType(registry.createFunctionType(NUMBER_TYPE), googSubBarInst), LEAST_FUNCTION_TYPE, NO_OBJECT_TYPE, NO_TYPE); 
     verifySubtypeChain(typeChain); 
 } 


public void testDefineProperties2382() { 
     ObjectType prototype = googBar.getPrototype(); 
     ObjectType instance = googBar.getInstanceType(); 
     assertTypeEquals(instance.getImplicitPrototype(), prototype); 
     assertTrue(prototype.defineDeclaredProperty("declared", NUMBER_TYPE, null)); 
     assertFalse(prototype.defineDeclaredProperty("declared", NUMBER_TYPE, null)); 
     assertFalse(instance.defineDeclaredProperty("declared", NUMBER_TYPE, null)); 
     assertTypeEquals(NUMBER_TYPE, instance.getPropertyType("declared")); 
     assertTrue(prototype.defineInferredProperty("inferred1", STRING_TYPE, null)); 
     assertTrue(prototype.defineInferredProperty("inferred1", NUMBER_TYPE, null)); 
     assertTypeEquals(createUnionType(NUMBER_TYPE, STRING_TYPE), instance.getPropertyType("inferred1")); 
     assertTrue(prototype.defineInferredProperty("inferred2", STRING_TYPE, null)); 
     assertTrue(instance.defineInferredProperty("inferred2", NUMBER_TYPE, null)); 
     assertTypeEquals(createUnionType(NUMBER_TYPE, STRING_TYPE), instance.getPropertyType("inferred2")); 
     assertTrue(prototype.defineInferredProperty("prop", STRING_TYPE, null)); 
     assertTrue(instance.defineDeclaredProperty("prop", NUMBER_TYPE, null)); 
     assertTypeEquals(NUMBER_TYPE, instance.getPropertyType("prop")); 
     assertTypeEquals(STRING_TYPE, prototype.getPropertyType("prop")); 
 } 


public void testReflexivityOfGreatestSubtype2406() { 
     List<JSType> list = getTypesToTestForSymmetry(); 
     for (JSType type : list) { 
         assertTypeEquals("getGreatestSubtype not reflexive", type, type.getGreatestSubtype(type)); 
     } 
 } 

  

  /**
   * Tests the behavior of the Bottom Object type.
   */
  

  /**
   * Tests the behavior of the Bottom type.
   */
  

  /**
   * Tests the behavior of the unresolved Bottom type.
   */
  

  /**
   * Tests the behavior of the Array type.
   */
  

  /**
   * Tests the behavior of the unknown type.
   */
  

  /**
   * Tests the behavior of the checked unknown type.
   */
  

  /**
   * Tests the behavior of the unknown type.
   */
  

  /**
   * Tests the behavior of the Object type (the object
   * at the top of the JavaScript hierarchy).
   */
  

  /**
   * Tests the behavior of the number value type.
   */
  

  /**
   * Tests the behavior of the number value type.
   */
  

  /**
   * Tests the behavior of the null type.
   */
  

  /**
   * Tests the behavior of the Date type.
   */
  

  /**
   * Tests the behavior of the RegExp type.
   */
  

  /**
   * Tests the behavior of the string object type.
   */
  

  /**
   * Tests the behavior of the string value type.
   */
  

  private void assertPropertyTypeDeclared(ObjectType ownerType, String prop) {
    assertTrue(ownerType.isPropertyTypeDeclared(prop));
    assertFalse(ownerType.isPropertyTypeInferred(prop));
  }

  private void assertPropertyTypeInferred(ObjectType ownerType, String prop) {
    assertFalse(ownerType.isPropertyTypeDeclared(prop));
    assertTrue(ownerType.isPropertyTypeInferred(prop));
  }

  private void assertPropertyTypeUnknown(ObjectType ownerType, String prop) {
    assertFalse(ownerType.isPropertyTypeDeclared(prop));
    assertFalse(ownerType.isPropertyTypeInferred(prop));
    assertTrue(ownerType.getPropertyType(prop).isUnknownType());
  }

  private void assertReturnTypeEquals(JSType expectedReturnType,
      JSType function) {
    assertTrue(function instanceof FunctionType);
    assertTypeEquals(expectedReturnType,
        ((FunctionType) function).getReturnType());
  }


  /**
   * Tests the behavior of record types.
   */
  

  /**
   * Tests the behavior of the instance of Function.
   */
  

  /**
   * Tests the behavior of functional types.
   */
  

  /**
   * Tests the subtyping relation of record types.
   */
  

  /**
   * Tests the subtyping relation of record types when an object has
   * an inferred property..
   */
  

  /**
   * Tests the getLeastSupertype method for record types.
   */
  

  

  

  

  /**
   * Tests the getGreatestSubtype method for record types.
   */
  

  

  

  

  

  

  
  

  /**
   * Tests the "apply" method on the function type.
   */
  

  /**
   * Tests the "call" method on the function type.
   */
  

  /**
   * Tests the representation of function types.
   */
  

  /**
   * Tests relationships between structural function types.
   */
  

  

  /**
   * Tests relationships between structural function types.
   */
  

  /**
   * Tests that defining a property of a function's {@code prototype} adds the
   * property to it instance type.
   */
  

  /**
   * Tests that replacing a function's {@code prototype} changes the visible
   * properties of its instance type.
   */
  

  /** Tests assigning JsDoc on a prototype property. */
  

  /**
   * Tests the behavior of the void type.
   */
  

  /**
   * Tests the behavior of the boolean type.
   */
  

  /**
   * Tests the behavior of the Boolean type.
   */
  

  /**
   * Tests the behavior of the enum type.
   */
  

  /**
   * Tests the behavior of the enum element type.
   */
  

  

  


  /**
   * Tests object types.
   */
  

  /**
   * Tests the goog.Bar type.
   */
  

  /**
   * Tests how properties are counted for object types.
   */
  

  /**
   * Tests how properties are defined.
   */
  

  /**
   * Tests that properties are correctly counted even when shadowing occurs.
   */
  

  /**
   * Tests the named type goog.Bar.
   */
  

  /**
   * Tests the prototype chaining of native objects.
   */
  

  /**
   * Tests that function instances have their constructor pointer back at the
   * function that created them.
   */
  

  /**
   * Tests that the method {@link JSType#canTestForEqualityWith(JSType)} handles
   * special corner cases.
   */
  

  /**
   * Tests the {@link JSType#testForEquality(JSType)} method.
   */
  

  private void compare(TernaryValue r, JSType t1, JSType t2) {
    assertEquals(r, t1.testForEquality(t2));
    assertEquals(r, t2.testForEquality(t1));
  }

  private void assertCanTestForEqualityWith(JSType t1, JSType t2) {
    assertTrue(t1.canTestForEqualityWith(t2));
    assertTrue(t2.canTestForEqualityWith(t1));
  }

  private void assertCannotTestForEqualityWith(JSType t1, JSType t2) {
    assertFalse(t1.canTestForEqualityWith(t2));
    assertFalse(t2.canTestForEqualityWith(t1));
  }

  /**
   * Tests the subtyping relationships among simple types.
   */
  

  /**
   * Tests that the Object type is the greatest element (top) of the object
   * hierarchy.
   */
  

  

  

  

  

  

  

  

  /**
   * Types to test for symmetrical relationships.
   */
  private List<JSType> getTypesToTestForSymmetry() {
    return Lists.newArrayList(
        UNKNOWN_TYPE,
        NULL_TYPE,
        VOID_TYPE,
        NUMBER_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        OBJECT_TYPE,
        U2U_CONSTRUCTOR_TYPE,
        LEAST_FUNCTION_TYPE,
        GREATEST_FUNCTION_TYPE,
        ALL_TYPE,
        NO_TYPE,
        NO_OBJECT_TYPE,
        NO_RESOLVED_TYPE,
        createUnionType(BOOLEAN_TYPE, STRING_TYPE),
        createUnionType(NUMBER_TYPE, STRING_TYPE),
        createUnionType(NULL_TYPE, dateMethod),
        createUnionType(UNKNOWN_TYPE, dateMethod),
        createUnionType(namedGoogBar, dateMethod),
        createUnionType(NULL_TYPE, unresolvedNamedType),
        enumType,
        elementsType,
        dateMethod,
        functionType,
        unresolvedNamedType,
        googBar,
        namedGoogBar,
        googBar.getInstanceType(),
        namedGoogBar,
        subclassOfUnresolvedNamedType,
        subclassCtor,
        recordType,
        forwardDeclaredNamedType,
        createUnionType(forwardDeclaredNamedType, NULL_TYPE),
        createParameterizedType(OBJECT_TYPE, STRING_TYPE),
        createParameterizedType(OBJECT_TYPE, NUMBER_TYPE),
        createParameterizedType(ARRAY_TYPE, STRING_TYPE),
        createParameterizedType(ARRAY_TYPE, NUMBER_TYPE),
        createUnionType(
            createParameterizedType(ARRAY_TYPE, BOOLEAN_TYPE), NULL_TYPE),
        createUnionType(
            createParameterizedType(OBJECT_TYPE, BOOLEAN_TYPE), NULL_TYPE)
        );
  }

  

  /**
   * Tests that getLeastSupertype is a symmetric relation.
   */
  

  

  /**
   * Tests that getGreatestSubtype is a symmetric relation.
   */
  

  /**
   * Tests that getLeastSupertype is a reflexive relation.
   */
  

  /**
   * Tests that getGreatestSubtype is a reflexive relation.
   */
  

  /**
   * Tests {@link JSType#getLeastSupertype(JSType)} for unresolved named types.
   */
  

  

  

  /** Tests the subclass of an unresolved named type */
  

  /**
   * Tests that Proxied FunctionTypes behave the same over getLeastSupertype and
   * getGreatestSubtype as non proxied FunctionTypes
   */
  

  

  /**
   * Tests the {@link NamedType#equals} function, which had a bug in it.
   */
  

  /**
   * Tests the {@link NamedType#equals} function against other types.
   */
  

  /**
   * Tests the {@link NamedType#equals} function against other types
   * when it's forward-declared.
   */
  

  

  /**
   * Tests {@link JSType#getGreatestSubtype(JSType)} on simple types.
   */
  

  /**
   * Tests that a derived class extending a type via a named type is a subtype
   * of it.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Tests that the given chain of types has a total ordering defined
   * by the subtype relationship, with types at the top of the lattice
   * listed first.
   *
   * Also verifies that the infimum of any two types on the chain
   * is the lower type, and the supremum of any two types on the chain
   * is the higher type.
   */
  public void verifySubtypeChain(List<JSType> typeChain) throws Exception {
    verifySubtypeChain(typeChain, true);
  }

    public void verifySubtypeChain(List<JSType> typeChain,
                                   boolean checkSubtyping) throws Exception {
        // Ugh. This wouldn't require so much copy-and-paste if we had a functional
        // programming language.
        for (int i = 0; i < typeChain.size(); i++) {
            for (int j = 0; j < typeChain.size(); j++) {
                JSType typeI = typeChain.get(i);
                JSType typeJ = typeChain.get(j);

                JSType namedTypeI = getNamedWrapper("TypeI", typeI);
                JSType namedTypeJ = getNamedWrapper("TypeJ", typeJ);
                JSType proxyTypeI = new ProxyObjectType(registry, typeI);
                JSType proxyTypeJ = new ProxyObjectType(registry, typeJ);

                if (i == j) {
                    assertTrue(typeI + " should equal itself",
                            typeI.isEquivalentTo(typeI));
                    assertTrue("Named " + typeI + " should equal itself",
                            namedTypeI.isEquivalentTo(namedTypeI));
                    assertTrue("Proxy " + typeI + " should equal itself",
                            proxyTypeI.isEquivalentTo(proxyTypeI));
                } else {
                    assertFalse(typeI + " should not equal " + typeJ,
                            typeI.isEquivalentTo(typeJ));
                    assertFalse("Named " + typeI + " should not equal " + typeJ,
                            namedTypeI.isEquivalentTo(namedTypeJ));
                    assertFalse("Proxy " + typeI + " should not equal " + typeJ,
                            proxyTypeI.isEquivalentTo(proxyTypeJ));
                }

                assertTrue(typeJ + " should be castable to " + typeI,
                        typeJ.canCastTo(typeI));
                assertTrue(typeJ + " should be castable to Named " + namedTypeI,
                        typeJ.canCastTo(namedTypeI));
                assertTrue(typeJ + " should be castable to Proxy " + proxyTypeI,
                        typeJ.canCastTo(proxyTypeI));

                assertTrue(
                        "Named " + typeJ + " should be castable to " + typeI,
                        namedTypeJ.canCastTo(typeI));
                assertTrue(
                        "Named " + typeJ + " should be castable to Named " + typeI,
                        namedTypeJ.canCastTo(namedTypeI));
                assertTrue(
                        "Named " + typeJ + " should be castable to Proxy " + typeI,
                        namedTypeJ.canCastTo(proxyTypeI));

                assertTrue(
                        "Proxy " + typeJ + " should be castable to " + typeI,
                        proxyTypeJ.canCastTo(typeI));
                assertTrue(
                        "Proxy " + typeJ + " should be castable to Named " + typeI,
                        proxyTypeJ.canCastTo(namedTypeI));
                assertTrue(
                        "Proxy " + typeJ + " should be castable to Proxy " + typeI,
                        proxyTypeJ.canCastTo(proxyTypeI));

                if (checkSubtyping) {
                    if (i <= j) {
                        assertTrue(typeJ + " should be a subtype of " + typeI,
                                typeJ.isSubtype(typeI));
                        assertTrue(
                                "Named " + typeJ + " should be a subtype of Named " + typeI,
                                namedTypeJ.isSubtype(namedTypeI));
                        assertTrue(
                                "Proxy " + typeJ + " should be a subtype of Proxy " + typeI,
                                proxyTypeJ.isSubtype(proxyTypeI));
                    } else {
                        assertFalse(typeJ + " should not be a subtype of " + typeI,
                                typeJ.isSubtype(typeI));
                        assertFalse(
                                "Named " + typeJ + " should not be a subtype of Named " + typeI,
                                namedTypeJ.isSubtype(namedTypeI));
                        assertFalse(
                                "Named " + typeJ + " should not be a subtype of Named " + typeI,
                                proxyTypeJ.isSubtype(proxyTypeI));
                    }

                    JSType expectedSupremum = i < j ? typeI : typeJ;
                    JSType expectedInfimum = i > j ? typeI : typeJ;

                    assertTypeEquals(
                            expectedSupremum + " should be the least supertype of " + typeI +
                                    " and " + typeJ,
                            expectedSupremum, typeI.getLeastSupertype(typeJ));

                    // TODO(nicksantos): Should these tests pass?
                    //assertTypeEquals(
                    //    expectedSupremum + " should be the least supertype of Named " +
                    //    typeI + " and Named " + typeJ,
                    //    expectedSupremum, namedTypeI.getLeastSupertype(namedTypeJ));
                    //assertTypeEquals(
                    //    expectedSupremum + " should be the least supertype of Proxy " +
                    //    typeI + " and Proxy " + typeJ,
                    //    expectedSupremum, proxyTypeI.getLeastSupertype(proxyTypeJ));

                    assertTypeEquals(
                            expectedInfimum + " should be the greatest subtype of " + typeI +
                                    " and " + typeJ,
                            expectedInfimum, typeI.getGreatestSubtype(typeJ));

                    // TODO(nicksantos): Should these tests pass?
                    //assertTypeEquals(
                    //    expectedInfimum + " should be the greatest subtype of Named " +
                    //    typeI + " and Named " + typeJ,
                    //    expectedInfimum, namedTypeI.getGreatestSubtype(namedTypeJ));
                    //assertTypeEquals(
                    //    expectedInfimum + " should be the greatest subtype of Proxy " +
                    //    typeI + " and Proxy " + typeJ,
                    //    expectedInfimum, proxyTypeI.getGreatestSubtype(proxyTypeJ));
                }
            }
        }
    }

  JSType getNamedWrapper(String name, JSType jstype) {
    // Normally, there is no way to create a Named NoType alias so
    // avoid confusing things by doing it here..
    if (!jstype.isNoType()) {
      NamedType namedWrapper = new NamedType(
          registry, name, "[testcode]", -1, -1);
      namedWrapper.setReferencedType(jstype);
      return namedWrapper;
    } else {
      return jstype;
    }
  }

  /**
   * Tests the behavior of
   * {@link JSType#getRestrictedTypeGivenToBooleanOutcome(boolean)}.
   */
  

  

  

  /**
   * Tests
   * {@link JSTypeRegistry#getGreatestSubtypeWithProperty(JSType, String)}.
   */
  

  

  

  

  

  

  

  

  

  private void testGetTypeUnderEquality(
      JSType t1, JSType t2, JSType t1Eq, JSType t2Eq) {
    // creating the pairs
    TypePair p12 = t1.getTypesUnderEquality(t2);
    TypePair p21 = t2.getTypesUnderEquality(t1);

    // t1Eq
    assertTypeEquals(t1Eq, p12.typeA);
    assertTypeEquals(t1Eq, p21.typeB);

    // t2Eq
    assertTypeEquals(t2Eq, p12.typeB);
    assertTypeEquals(t2Eq, p21.typeA);
  }

  

  

  

  

  private void testGetTypesUnderInequality(
      JSType t1, JSType t2, JSType t1Eq, JSType t2Eq) {
    // creating the pairs
    TypePair p12 = t1.getTypesUnderInequality(t2);
    TypePair p21 = t2.getTypesUnderInequality(t1);

    // t1Eq
    assertTypeEquals(t1Eq, p12.typeA);
    assertTypeEquals(t1Eq, p21.typeB);

    // t2Eq
    assertTypeEquals(t2Eq, p12.typeB);
    assertTypeEquals(t2Eq, p21.typeA);
  }


  /**
   * Tests the factory method
   * {@link JSTypeRegistry#createRecordType}.
   */
  

  /**
   * Tests the factory method {@link JSTypeRegistry#createOptionalType(JSType)}.
   */
  

  public void assertUnionContains(UnionType union, JSType type) {
    assertTrue(union + " should contain " + type, union.contains(type));
  }

  /**
   * Tests the factory method
   * {@link JSTypeRegistry#createAnonymousObjectType}}.
   */
  

  /**
   * Tests the factory method
   * {@link JSTypeRegistry#createAnonymousObjectType}} and adds
   * some properties to it.
   */
  

  /**
   * Tests the factory methods
   * {@link JSTypeRegistry#createObjectType(ObjectType)}} and
   * {@link JSTypeRegistry#createObjectType(String, Node, ObjectType)}}.
   */
  

  /**
   * Tests {@code (U2U_CONSTRUCTOR,undefined) <: (U2U_CONSTRUCTOR,undefined)}.
   */
  

  /**
   * Tests {@code U2U_FUNCTION_TYPE <: U2U_CONSTRUCTOR} and
   * {@code U2U_FUNCTION_TYPE <: (U2U_CONSTRUCTOR,undefined)}.
   */
  

  /**
   * Assert that a type can assign to itself.
   */
  private void assertTypeCanAssignToItself(JSType type) {
    assertTrue(type.isSubtype(type));
  }

  /**
   * Tests that hasOwnProperty returns true when a property is defined directly
   * on a class and false if the property is defined on the supertype or not at
   * all.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static boolean containsType(
      Iterable<? extends JSType> types, JSType type) {
    for (JSType alt : types) {
      if (alt.isEquivalentTo(type)) {
        return true;
      }
    }
    return false;
  }

  private static boolean assertTypeListEquals(
      Iterable<? extends JSType> typeListA,
      Iterable<? extends JSType> typeListB) {
    for (JSType alt : typeListA) {
      assertTrue(
          "List : " + typeListA + "\n" +
          "does not contain: " + alt,
          containsType(typeListA, alt));
    }
    for (JSType alt : typeListB) {
      assertTrue(
          "List : " + typeListB + "\n" +
          "does not contain: " + alt,
          containsType(typeListB, alt));
    }
    return false;
  }

  private ArrowType createArrowType(Node params) {
    return registry.createArrowType(params);
  }
}
