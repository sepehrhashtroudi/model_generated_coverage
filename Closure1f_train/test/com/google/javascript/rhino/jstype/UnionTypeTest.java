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

import com.google.javascript.rhino.testing.BaseJSTypeTestCase;
import com.google.javascript.rhino.testing.Asserts;

public class UnionTypeTest extends BaseJSTypeTestCase {
  private NamedType unresolvedNamedType;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    unresolvedNamedType =
        new NamedType(registry, "not.resolved.named.type", null, -1, -1);
  }

  /**
   * Assert that a type can assign to itself.
   */
  private void assertTypeCanAssignToItself(JSType type) {
    assertTrue(type.isSubtype(type));
  }

  /**
   * Tests the behavior of variants type.
   */

@SuppressWarnings("checked") 
 public void testGreatestSubtypeUnionTypes3140() { 
     UnionType nullableOptionalNumber = (UnionType) createUnionType(NULL_TYPE, VOID_TYPE, NUMBER_TYPE); 
     UnionType nullUndefined = (UnionType) createUnionType(VOID_TYPE, NULL_TYPE); 
     Asserts.assertTypeEquals(nullUndefined, nullUndefined.getGreatestSubtype(nullableOptionalNumber)); 
     Asserts.assertTypeEquals(nullUndefined, nullableOptionalNumber.getGreatestSubtype(nullUndefined)); 
 } 


public void testCollapseUnion4328() { 
     assertEquals("*", registry.createUnionType(OBJECT_TYPE, STRING_TYPE).collapseUnion().toString()); 
     assertEquals("*", registry.createUnionType(STRING_TYPE, OBJECT_TYPE).collapseUnion().toString()); 
 } 


public void testGreatestSubtypeUnionTypes5461() throws Exception { 
     JSType errUnion = createUnionType(EVAL_ERROR_TYPE, URI_ERROR_TYPE); 
     Asserts.assertTypeEquals(NO_OBJECT_TYPE, errUnion.getGreatestSubtype(STRING_OBJECT_TYPE)); 
 } 


public void testProxyUnionType703() throws Exception { 
     UnionType stringOrNumber = (UnionType) createUnionType(NUMBER_TYPE, STRING_TYPE); 
     UnionType stringOrBoolean = (UnionType) createUnionType(BOOLEAN_TYPE, STRING_TYPE); 
     assertEquals("(boolean|number|string)", stringOrNumber.getLeastSupertype(stringOrBoolean).toString()); 
     assertEquals("string", stringOrNumber.getGreatestSubtype(stringOrBoolean).toString()); 
     assertEquals(TernaryValue.UNKNOWN, stringOrNumber.testForEquality(stringOrBoolean)); 
     assertEquals("(number|string)", stringOrNumber.getTypesUnderEquality(stringOrBoolean).typeA.toString()); 
     assertEquals("string", stringOrNumber.getTypesUnderShallowEquality(stringOrBoolean).typeA.toString()); 
     assertEquals("(number|string)", stringOrNumber.getTypesUnderInequality(stringOrBoolean).typeA.toString()); 
     assertEquals("(number|string)", stringOrNumber.getTypesUnderShallowInequality(stringOrBoolean).typeA.toString()); 
     ObjectType stringOrNumberProxy = new ProxyObjectType(registry, stringOrNumber); 
     ObjectType stringOrBooleanProxy = new ProxyObjectType(registry, stringOrBoolean); 
     assertEquals("(boolean|number|string)", stringOrNumberProxy.getLeastSupertype(stringOrBooleanProxy).toString()); 
     assertEquals("string", stringOrNumberProxy.getGreatestSubtype(stringOrBooleanProxy).toString()); 
     assertEquals(TernaryValue.UNKNOWN, stringOrNumberProxy.testForEquality(stringOrBooleanProxy)); 
     assertEquals("(number|string)", stringOrNumberProxy.getTypesUnderEquality(stringOrBooleanProxy).typeA.toString()); 
     assertEquals("string", stringOrNumberProxy.getTypesUnderShallowEquality(stringOrBooleanProxy).typeA.toString()); 
     assertEquals("(number|string)", stringOrNumberProxy.getTypesUnderInequality(stringOrBooleanProxy).typeA.toString()); 
     assertEquals("(number|string)", stringOrNumberProxy.getTypesUnderShallowInequality(stringOrBooleanProxy).typeA.toString()); 
 } 


public void testCollapseUnion3960() { 
     assertEquals("Object", registry.createUnionType(ARRAY_TYPE, DATE_TYPE).collapseUnion().toString()); 
     assertEquals("Object", registry.createUnionType(ARRAY_TYPE, OBJECT_TYPE).collapseUnion().toString()); 
     assertEquals("Error", registry.createUnionType(ERROR_TYPE, RANGE_ERROR_TYPE).collapseUnion().toString()); 
     assertEquals("Error", registry.createUnionType(EVAL_ERROR_TYPE, RANGE_ERROR_TYPE).collapseUnion().toString()); 
     assertEquals("Error", registry.createUnionType(EVAL_ERROR_TYPE, RANGE_ERROR_TYPE, TYPE_ERROR_TYPE).collapseUnion().toString()); 
 } 


@SuppressWarnings("checked") 
 public void testUnionType1457() throws Exception { 
     UnionType nullOrString = (UnionType) createUnionType(NULL_TYPE, STRING_OBJECT_TYPE); 
     UnionType stringOrNull = (UnionType) createUnionType(STRING_OBJECT_TYPE, NULL_TYPE); 
     Asserts.assertTypeEquals(nullOrString, stringOrNull); 
     Asserts.assertTypeEquals(stringOrNull, nullOrString); 
     assertTypeCanAssignToItself(createUnionType(VOID_TYPE, NUMBER_TYPE)); 
     assertTypeCanAssignToItself(createUnionType(NUMBER_TYPE, STRING_TYPE, OBJECT_TYPE)); 
     assertTypeCanAssignToItself(createUnionType(NUMBER_TYPE, BOOLEAN_TYPE)); 
     assertTypeCanAssignToItself(createUnionType(VOID_TYPE)); 
     UnionType nullOrUnknown = (UnionType) createUnionType(NULL_TYPE, unresolvedNamedType); 
     assertTrue(nullOrUnknown.isUnknownType()); 
     Asserts.assertTypeEquals(nullOrUnknown, NULL_TYPE.getLeastSupertype(nullOrUnknown)); 
     Asserts.assertTypeEquals(nullOrUnknown, nullOrUnknown.getLeastSupertype(NULL_TYPE)); 
     Asserts.assertTypeEquals(UNKNOWN_TYPE, NULL_TYPE.getGreatestSubtype(nullOrUnknown)); 
     Asserts.assertTypeEquals(UNKNOWN_TYPE, nullOrUnknown.getGreatestSubtype(NULL_TYPE)); 
     assertTrue(NULL_TYPE.differsFrom(nullOrUnknown)); 
     assertTrue(nullOrUnknown.differsFrom(NULL_TYPE)); 
     assertFalse(nullOrUnknown.differsFrom(unresolvedNamedType)); 
     assertTrue(NULL_TYPE.isSubtype(nullOrUnknown)); 
     assertTrue(unresolvedNamedType.isSubtype(nullOrUnknown)); 
     assertTrue(nullOrUnknown.isSubtype(NULL_TYPE)); 
     Asserts.assertTypeEquals(unresolvedNamedType, nullOrUnknown.restrictByNotNullOrUndefined()); 
     Asserts.assertTypeEquals(NUMBER_TYPE, nullOrString.findPropertyType("length")); 
     assertEquals(null, nullOrString.findPropertyType("lengthx")); 
     Asserts.assertResolvesToSame(nullOrString); 
 } 


@SuppressWarnings("checked") 
 public void testSpecialUnionCanAssignTo1648() throws Exception { 
     UnionType numbers = (UnionType) createUnionType(NUMBER_TYPE, NUMBER_OBJECT_TYPE); 
     assertFalse(numbers.isSubtype(NUMBER_TYPE)); 
     assertFalse(numbers.isSubtype(NUMBER_OBJECT_TYPE)); 
     assertFalse(numbers.isSubtype(EVAL_ERROR_TYPE)); 
     UnionType strings = (UnionType) createUnionType(STRING_OBJECT_TYPE, STRING_TYPE); 
     assertFalse(strings.isSubtype(STRING_TYPE)); 
     assertFalse(strings.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(strings.isSubtype(DATE_TYPE)); 
     UnionType booleans = (UnionType) createUnionType(BOOLEAN_OBJECT_TYPE, BOOLEAN_TYPE); 
     assertFalse(booleans.isSubtype(BOOLEAN_TYPE)); 
     assertFalse(booleans.isSubtype(BOOLEAN_OBJECT_TYPE)); 
     assertFalse(booleans.isSubtype(REGEXP_TYPE)); 
     JSType unknown = createUnionType(UNKNOWN_TYPE, DATE_TYPE); 
     assertTrue(unknown.isSubtype(STRING_TYPE)); 
     UnionType stringDate = (UnionType) createUnionType(STRING_OBJECT_TYPE, DATE_TYPE); 
     assertTrue(stringDate.isSubtype(OBJECT_TYPE)); 
     assertFalse(stringDate.isSubtype(STRING_OBJECT_TYPE)); 
     assertFalse(stringDate.isSubtype(DATE_TYPE)); 
 } 


@SuppressWarnings("checked") 
 public void testCreateUnionType1914() throws Exception { 
     UnionType optNumber = (UnionType) registry.createUnionType(NUMBER_TYPE, DATE_TYPE); 
     assertTrue(optNumber.contains(NUMBER_TYPE)); 
     assertTrue(optNumber.contains(DATE_TYPE)); 
     UnionType optUnion = (UnionType) registry.createUnionType(REGEXP_TYPE, registry.createUnionType(STRING_OBJECT_TYPE, DATE_TYPE)); 
     assertTrue(optUnion.contains(DATE_TYPE)); 
     assertTrue(optUnion.contains(STRING_OBJECT_TYPE)); 
     assertTrue(optUnion.contains(REGEXP_TYPE)); 
 } 


public void testSubtypingUnionTypes2030() throws Exception { 
     assertTrue(BOOLEAN_TYPE.isSubtype(createUnionType(BOOLEAN_TYPE, STRING_TYPE))); 
     assertTrue(createUnionType(BOOLEAN_TYPE, STRING_TYPE).isSubtype(createUnionType(BOOLEAN_TYPE, STRING_TYPE))); 
     assertTrue(createUnionType(BOOLEAN_TYPE, STRING_TYPE).isSubtype(createUnionType(BOOLEAN_TYPE, STRING_TYPE, NULL_TYPE))); 
     assertTrue(createUnionType(BOOLEAN_TYPE, STRING_TYPE).isSubtype(createUnionType(BOOLEAN_TYPE, STRING_TYPE, NULL_TYPE))); 
     assertTrue(createUnionType(BOOLEAN_TYPE).isSubtype(createUnionType(BOOLEAN_TYPE, STRING_TYPE, NULL_TYPE))); 
     assertTrue(createUnionType(STRING_TYPE).isSubtype(createUnionType(BOOLEAN_TYPE, STRING_TYPE, NULL_TYPE))); 
     assertTrue(createUnionType(STRING_TYPE, NULL_TYPE).isSubtype(ALL_TYPE)); 
     assertTrue(createUnionType(DATE_TYPE, REGEXP_TYPE).isSubtype(OBJECT_TYPE)); 
     assertTrue(createUnionType(URI_ERROR_TYPE, EVAL_ERROR_TYPE).isSubtype(ERROR_TYPE)); 
     assertTrue(createUnionType(URI_ERROR_TYPE, EVAL_ERROR_TYPE).isSubtype(OBJECT_TYPE)); 
     assertFalse(createUnionType(STRING_TYPE, NULL_TYPE).isSubtype(NO_TYPE)); 
     assertFalse(createUnionType(STRING_TYPE, NULL_TYPE).isSubtype(NO_OBJECT_TYPE)); 
     assertFalse(createUnionType(NO_OBJECT_TYPE, NULL_TYPE).isSubtype(OBJECT_TYPE)); 
     assertTrue(NUMBER_TYPE.isSubtype(OBJECT_NUMBER_STRING)); 
     assertTrue(OBJECT_TYPE.isSubtype(OBJECT_NUMBER_STRING)); 
     assertTrue(STRING_TYPE.isSubtype(OBJECT_NUMBER_STRING)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(OBJECT_NUMBER_STRING)); 
     assertTrue(NUMBER_TYPE.isSubtype(NUMBER_STRING_BOOLEAN)); 
     assertTrue(BOOLEAN_TYPE.isSubtype(NUMBER_STRING_BOOLEAN)); 
     assertTrue(STRING_TYPE.isSubtype(NUMBER_STRING_BOOLEAN)); 
     assertTrue(NUMBER_TYPE.isSubtype(OBJECT_NUMBER_STRING_BOOLEAN)); 
     assertTrue(OBJECT_TYPE.isSubtype(OBJECT_NUMBER_STRING_BOOLEAN)); 
     assertTrue(STRING_TYPE.isSubtype(OBJECT_NUMBER_STRING_BOOLEAN)); 
     assertTrue(BOOLEAN_TYPE.isSubtype(OBJECT_NUMBER_STRING_BOOLEAN)); 
     assertTrue(NO_OBJECT_TYPE.isSubtype(OBJECT_NUMBER_STRING_BOOLEAN)); 
 } 


public void testGetRestrictedUnion12049() throws Exception { 
     UnionType numStr = (UnionType) createUnionType(NUMBER_TYPE, STRING_TYPE); 
     Asserts.assertTypeEquals(STRING_TYPE, numStr.getRestrictedUnion(NUMBER_TYPE)); 
 } 

  

  /**
   * Tests {@link JSType#getGreatestSubtype(JSType)} on union types.
   */
  

  /**
   * Tests {@link JSType#getGreatestSubtype(JSType)} on union types.
   */
  

  /**
   * Tests {@link JSType#getGreatestSubtype(JSType)} on union types.
   */
  

  /**
   * Tests {@link JSType#getGreatestSubtype(JSType)} on union types.
   */
  

  /**
   * Tests {@link JSType#getGreatestSubtype(JSType)} on union types.
   */
  

  /**
   * Tests subtyping of union types.
   */
  

  /**
   * Tests that special union types can assign to other types.  Unions
   * containing the unknown type should be able to assign to any other
   * type.
   */
  

  /**
   * Tests the factory method
   * {@link JSTypeRegistry#createUnionType(JSType...)}.
   */
  


  

  

  

  

  

  

  

  

  

  

  
}
