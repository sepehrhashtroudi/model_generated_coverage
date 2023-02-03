/*
 * Copyright 2007 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.javascript.jscomp;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;

import java.util.Arrays;
import java.util.Collection;

public class SemanticReverseAbstractInterpreterTest
    extends CompilerTypeTestCase {
  private CodingConvention codingConvention = new GoogleCodingConvention();
  private ReverseAbstractInterpreter interpreter;
  private Scope functionScope;

  @Override
  protected void setUp() throws Exception {
    super.setUp();

    interpreter = new SemanticReverseAbstractInterpreter(
        codingConvention, registry);
  }

  public FlowScope newScope() {
    Scope globalScope = Scope.createGlobalScope(new Node(Token.EMPTY));
    functionScope = new Scope(globalScope, new Node(Token.EMPTY));
    return LinkedFlowScope.createEntryLattice(functionScope);
  }

  /**
   * Tests reverse interpretation of a NAME expression.
   */

@SuppressWarnings("unchecked") 
 public void testInstanceOf314() { 
     FlowScope blind = newScope(); 
     testBinop(blind, Token.INSTANCEOF, createVar(blind, "x", OBJECT_TYPE), createVar(blind, "s", STRING_OBJECT_FUNCTION_TYPE), Sets.newHashSet(new TypedName("x", STRING_OBJECT_TYPE), new TypedName("s", STRING_OBJECT_FUNCTION_TYPE)), Sets.newHashSet(new TypedName("x", OBJECT_TYPE), new TypedName("s", STRING_OBJECT_FUNCTION_TYPE))); 
 } 


@SuppressWarnings("unchecked") 
 public void testEqCondition2255() throws Exception { 
     FlowScope blind = newScope(); 
     testBinop(blind, Token.NE, createNull(), createVar(blind, "a", createUnionType(BOOLEAN_TYPE, VOID_TYPE)), Sets.newHashSet(new TypedName("a", BOOLEAN_TYPE)), Sets.newHashSet(new TypedName("a", VOID_TYPE))); 
 } 


@SuppressWarnings("unchecked") 
 public void testInstanceOf4497() { 
     FlowScope blind = newScope(); 
     testBinop(blind, Token.INSTANCEOF, createVar(blind, "x", ALL_TYPE), createVar(blind, "s", STRING_OBJECT_FUNCTION_TYPE), Sets.newHashSet(new TypedName("x", STRING_OBJECT_TYPE), new TypedName("s", STRING_OBJECT_FUNCTION_TYPE)), Sets.newHashSet(new TypedName("s", STRING_OBJECT_FUNCTION_TYPE))); 
 } 


@SuppressWarnings("unchecked") 
 public void testTypeof3676() { 
     FlowScope blind = newScope(); 
     testBinop(blind, Token.EQ, new Node(Token.TYPEOF, createVar(blind, "a", OBJECT_NUMBER_STRING_BOOLEAN)), Node.newString("function"), Sets.newHashSet(new TypedName("a", U2U_CONSTRUCTOR_TYPE)), Sets.newHashSet(new TypedName("a", OBJECT_NUMBER_STRING_BOOLEAN))); 
 } 


@SuppressWarnings("unchecked") 
 public void testEqCondition3684() throws Exception { 
     FlowScope blind = newScope(); 
     JSType nullableOptionalNumber = createUnionType(NULL_TYPE, VOID_TYPE, NUMBER_TYPE); 
     JSType nullUndefined = createUnionType(VOID_TYPE, NULL_TYPE); 
     testBinop(blind, Token.EQ, createVar(blind, "a", nullableOptionalNumber), createNull(), Sets.newHashSet(new TypedName("a", nullUndefined)), Sets.newHashSet(new TypedName("a", NUMBER_TYPE))); 
 } 


public void testNegatedNameCondition815() throws Exception { 
     FlowScope blind = newScope(); 
     Node a = createVar(blind, "a", createNullableType(STRING_TYPE)); 
     Node condition = new Node(Token.NOT); 
     condition.addChildToBack(a); 
     FlowScope informedTrue = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blind, true); 
     assertTypeEquals(createNullableType(STRING_TYPE), getVarType(informedTrue, "a")); 
     FlowScope informedFalse = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blind, false); 
     assertTypeEquals(STRING_TYPE, getVarType(informedFalse, "a")); 
 } 


@SuppressWarnings("unchecked") 
 public void testAnd918() { 
     FlowScope blind = newScope(); 
     testBinop(blind, Token.AND, createVar(blind, "b", createUnionType(STRING_TYPE, NULL_TYPE)), createVar(blind, "a", createUnionType(NUMBER_TYPE, VOID_TYPE)), Sets.newHashSet(new TypedName("a", NUMBER_TYPE), new TypedName("b", STRING_TYPE)), Sets.newHashSet(new TypedName("a", createUnionType(NUMBER_TYPE, VOID_TYPE)), new TypedName("b", createUnionType(STRING_TYPE, NULL_TYPE)))); 
 } 


@SuppressWarnings("unchecked") 
 public void testInequalitiesCondition2974() { 
     for (int op : Arrays.asList(Token.LT, Token.GT, Token.LE, Token.GE)) { 
         FlowScope blind = newScope(); 
         testBinop(blind, op, createVar(blind, "a", createUnionType(STRING_TYPE, NUMBER_TYPE, VOID_TYPE)), createVar(blind, "b", createUnionType(NUMBER_TYPE, NULL_TYPE)), Sets.newHashSet(new TypedName("a", createUnionType(STRING_TYPE, NUMBER_TYPE)), new TypedName("b", createUnionType(NUMBER_TYPE, NULL_TYPE))), Sets.newHashSet(new TypedName("a", createUnionType(STRING_TYPE, NUMBER_TYPE, VOID_TYPE)), new TypedName("b", createUnionType(NUMBER_TYPE, NULL_TYPE)))); 
     } 
 } 


@SuppressWarnings("unchecked") 
 public void testInstanceOf991() { 
     FlowScope blind = newScope(); 
     testBinop(blind, Token.INSTANCEOF, createVar(blind, "x", UNKNOWN_TYPE), createVar(blind, "s", STRING_OBJECT_FUNCTION_TYPE), Sets.newHashSet(new TypedName("x", STRING_OBJECT_TYPE), new TypedName("s", STRING_OBJECT_FUNCTION_TYPE)), Sets.newHashSet(new TypedName("s", STRING_OBJECT_FUNCTION_TYPE))); 
 } 


@SuppressWarnings("unchecked") 
 public void testShneCondition51711() throws Exception { 
     FlowScope blind = newScope(); 
     testBinop(blind, Token.SHNE, createVar(blind, "a", createUnionType(NULL_TYPE, VOID_TYPE)), createVar(blind, "b", createUnionType(NULL_TYPE)), Sets.newHashSet(new TypedName("a", VOID_TYPE), new TypedName("b", NULL_TYPE)), Sets.newHashSet(new TypedName("a", NULL_TYPE), new TypedName("b", NULL_TYPE))); 
 } 


@SuppressWarnings("unchecked") 
 public void testInstanceOf21747() { 
     FlowScope blind = newScope(); 
     testBinop(blind, Token.INSTANCEOF, createVar(blind, "x", createUnionType(STRING_OBJECT_TYPE, NUMBER_OBJECT_TYPE)), createVar(blind, "s", STRING_OBJECT_FUNCTION_TYPE), Sets.newHashSet(new TypedName("x", STRING_OBJECT_TYPE), new TypedName("s", STRING_OBJECT_FUNCTION_TYPE)), Sets.newHashSet(new TypedName("x", NUMBER_OBJECT_TYPE), new TypedName("s", STRING_OBJECT_FUNCTION_TYPE))); 
 } 


@SuppressWarnings("unchecked") 
 public void testSheqCondition21942() throws Exception { 
     FlowScope blind = newScope(); 
     testBinop(blind, Token.SHEQ, createNumber(56), createVar(blind, "a", createUnionType(STRING_TYPE, NUMBER_TYPE)), Sets.newHashSet(new TypedName("a", NUMBER_TYPE)), Sets.newHashSet(new TypedName("a", createUnionType(STRING_TYPE, NUMBER_TYPE)))); 
 } 


@SuppressWarnings("unchecked") 
 public void testAssignCondition12270() throws Exception { 
     FlowScope blind = newScope(); 
     testBinop(blind, Token.ASSIGN, createVar(blind, "a", createNullableType(OBJECT_TYPE)), createVar(blind, "b", createNullableType(OBJECT_TYPE)), Sets.newHashSet(new TypedName("a", OBJECT_TYPE), new TypedName("b", OBJECT_TYPE)), Sets.newHashSet(new TypedName("a", NULL_TYPE), new TypedName("b", NULL_TYPE))); 
 } 


@SuppressWarnings("unchecked") 
 public void testEqCondition42288() throws Exception { 
     FlowScope blind = newScope(); 
     testBinop(blind, Token.EQ, createVar(blind, "a", VOID_TYPE), createVar(blind, "b", VOID_TYPE), Sets.newHashSet(new TypedName("a", VOID_TYPE), new TypedName("b", VOID_TYPE)), Sets.newHashSet(new TypedName("a", NO_TYPE), new TypedName("b", NO_TYPE))); 
 } 

  

  /**
   * Tests reverse interpretation of a NOT(NAME) expression.
   */
  

  /**
   * Tests reverse interpretation of a ASSIGN expression.
   */
  

  /**
   * Tests reverse interpretation of a SHEQ(NAME, NUMBER) expression.
   */
  

  /**
   * Tests reverse interpretation of a SHEQ(NUMBER, NAME) expression.
   */
  

  /**
   * Tests reverse interpretation of a SHEQ(NAME, NAME) expression.
   */
  

  

  

  

  /**
   * Tests reverse interpretation of a SHNE(NAME, NUMBER) expression.
   */
  

  /**
   * Tests reverse interpretation of a SHNE(NUMBER, NAME) expression.
   */
  

  /**
   * Tests reverse interpretation of a SHNE(NAME, NAME) expression.
   */
  

  

  

  

  /**
   * Tests reverse interpretation of a EQ(NAME, NULL) expression.
   */
  

  /**
   * Tests reverse interpretation of a NE(NULL, NAME) expression.
   */
  

  /**
   * Tests reverse interpretation of a EQ(NAME, NULL) expression.
   */
  

  /**
   * Tests reverse interpretation of two undefineds.
   */
  

  /**
   * Tests reverse interpretation of a COMPARE(NAME, NUMBER) expression,
   * where COMPARE can be LE, LT, GE or GT.
   */
  

  /**
   * Tests reverse interpretation of a COMPARE(NAME, NAME) expression,
   * where COMPARE can be LE, LT, GE or GT.
   */
  

  /**
   * Tests reverse interpretation of a COMPARE(NUMBER-untyped, NAME) expression,
   * where COMPARE can be LE, LT, GE or GT.
   */
  

  

  

  

  

  

  

  

  

  

  private void testBinop(FlowScope blind, int binop, Node left, Node right,
      Collection<TypedName> trueOutcome,
      Collection<TypedName> falseOutcome) {
    Node condition = new Node(binop);
    condition.addChildToBack(left);
    condition.addChildToBack(right);

    // true outcome.
    FlowScope informedTrue = interpreter.
        getPreciserScopeKnowingConditionOutcome(condition, blind, true);
    for (TypedName p : trueOutcome) {
      assertTypeEquals(p.name, p.type, getVarType(informedTrue, p.name));
    }

    // false outcome.
    FlowScope informedFalse = interpreter.
        getPreciserScopeKnowingConditionOutcome(condition, blind, false);
    for (TypedName p : falseOutcome) {
      assertTypeEquals(p.type, getVarType(informedFalse, p.name));
    }
  }

  private Node createNull() {
    Node n = new Node(Token.NULL);
    n.setJSType(NULL_TYPE);
    return n;
  }

  private Node createNumber(int n) {
    Node number = createUntypedNumber(n);
    number.setJSType(NUMBER_TYPE);
    return number;
  }

  private Node createUntypedNumber(int n) {
    return Node.newNumber(n);
  }

  private JSType getVarType(FlowScope scope, String name) {
    return scope.getSlot(name).getType();
  }

  private Node createVar(FlowScope scope, String name, JSType type) {
    Node n = Node.newString(Token.NAME, name);
    functionScope.declare(name, n, null, null);
    ((LinkedFlowScope) scope).inferSlotType(name, type);
    n.setJSType(type);
    return n;
  }

  private static class TypedName {
    private final String name;
    private final JSType type;

    private TypedName(String name, JSType type) {
      this.name = name;
      this.type = type;
    }
  }
}
