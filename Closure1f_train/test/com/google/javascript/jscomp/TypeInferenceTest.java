/*
 * Copyright 2008 The Closure Compiler Authors.
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

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_RESOLVED_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.testing.Asserts;

import junit.framework.TestCase;

import java.util.Map;

/**
 * Tests {@link TypeInference}.
 *
 */
public class TypeInferenceTest extends TestCase {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Map<String, JSType> assumptions;
  private JSType assumedThisType;
  private FlowScope returnScope;
  private static final Map<String, AssertionFunctionSpec>
      ASSERTION_FUNCTION_MAP = Maps.newHashMap();
  static {
    for (AssertionFunctionSpec func :
        new ClosureCodingConvention().getAssertionFunctions()) {
      ASSERTION_FUNCTION_MAP.put(func.getFunctionName(), func);
    }
  }

  @Override
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setClosurePass(true);
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    assumptions = Maps.newHashMap();
    returnScope = null;
  }

  private void assumingThisType(JSType type) {
    assumedThisType = type;
  }

  private void assuming(String name, JSType type) {
    assumptions.put(name, type);
  }

  private void assuming(String name, JSTypeNative type) {
    assuming(name, registry.getNativeType(type));
  }

  private void inFunction(String js) {
    // Parse the body of the function.
    String thisBlock = assumedThisType == null
        ? ""
        : "/** @this {" + assumedThisType + "} */";
    Node root = compiler.parseTestCode(
        "(" + thisBlock + " function() {" + js + "});");
    assertEquals("parsing error: " +
        Joiner.on(", ").join(compiler.getErrors()),
        0, compiler.getErrorCount());

    Node n = root.getFirstChild().getFirstChild();
    // Create the scope with the assumptions.
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope assumedScope = scopeCreator.createScope(
        n, scopeCreator.createScope(root, null));
    for (Map.Entry<String,JSType> entry : assumptions.entrySet()) {
      assumedScope.declare(entry.getKey(), null, entry.getValue(), null, false);
    }
    // Create the control graph.
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, false);
    cfa.process(null, n);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    // Create a simple reverse abstract interpreter.
    ReverseAbstractInterpreter rai = compiler.getReverseAbstractInterpreter();
    // Do the type inference by data-flow analysis.
    TypeInference dfa = new TypeInference(compiler, cfg, rai, assumedScope,
        ASSERTION_FUNCTION_MAP);
    dfa.analyze();
    // Get the scope of the implicit return.
    BranchedFlowState<FlowScope> rtnState =
        cfg.getImplicitReturn().getAnnotation();
    returnScope = rtnState.getIn();
  }

  private JSType getType(String name) {
    assertTrue("The return scope should not be null.", returnScope != null);
    StaticSlot<JSType> var = returnScope.getSlot(name);
    assertTrue("The variable " + name + " is missing from the scope.",
        var != null);
    return var.getType();
  }

  private void verify(String name, JSType type) {
    Asserts.assertTypeEquals("Mismatch for " + name, type, getType(name));
  }

  private void verify(String name, JSTypeNative type) {
    verify(name, registry.getNativeType(type));
  }

  private void verifySubtypeOf(String name, JSType type) {
    JSType varType = getType(name);
    assertTrue("The variable " + name + " is missing a type.", varType != null);
    assertTrue("The type " + varType + " of variable " + name +
        " is not a subtype of " + type +".",  varType.isSubtype(type));
  }

  private void verifySubtypeOf(String name, JSTypeNative type) {
    verifySubtypeOf(name, registry.getNativeType(type));
  }

  private EnumType createEnumType(String name, JSTypeNative elemType) {
    return createEnumType(name, registry.getNativeType(elemType));
  }

  private EnumType createEnumType(String name, JSType elemType) {
    return registry.createEnumType(name, null, elemType);
  }

  private JSType createUndefinableType(JSTypeNative type) {
    return registry.createUnionType(
        registry.getNativeType(type), registry.getNativeType(VOID_TYPE));
  }

  private JSType createNullableType(JSTypeNative type) {
    return createNullableType(registry.getNativeType(type));
  }

  private JSType createNullableType(JSType type) {
    return registry.createNullableType(type);
  }

  private JSType createUnionType(JSTypeNative type1, JSTypeNative type2) {
    return registry.createUnionType(
        registry.getNativeType(type1), registry.getNativeType(type2));
  }


public void testArrayLit41() { 
     assuming("x", createNullableType(OBJECT_TYPE)); 
     inFunction("var y = 3; if (x) { x = [y = x]; }"); 
     verify("x", createUnionType(NULL_TYPE, ARRAY_TYPE)); 
     verify("y", createUnionType(NUMBER_TYPE, OBJECT_TYPE)); 
 } 


public void testAssertNumber2113() { 
     JSType startType = createNullableType(ALL_TYPE); 
     assuming("x", startType); 
     inFunction("goog.asserts.assertNumber(x + x); out1 = x;"); 
     verify("out1", startType); 
 } 


public void testAssert5196() { 
     JSType startType = createNullableType(OBJECT_TYPE); 
     assuming("x", startType); 
     assuming("y", startType); 
     inFunction("goog.asserts.assert(x || y); out1 = x; out2 = y;"); 
     verify("out1", startType); 
     verify("out2", startType); 
 } 


public void testSwitch4259() { 
     assuming("x", ALL_TYPE); 
     inFunction("var y = null; switch (typeof x) {\n" + "case 'string':\n" + "case 'number':\n" + "  y = x;\n" + "  return;\n" + "default:\n" + "  y = 1;\n" + "}\n"); 
     verify("y", createUnionType(NUMBER_TYPE, STRING_TYPE)); 
 } 


public void testObjectLit294() { 
     inFunction("var x = {}; var out = x.a;"); 
     verify("out", UNKNOWN_TYPE); 
     inFunction("var x = {a:1}; var out = x.a;"); 
     verify("out", NUMBER_TYPE); 
     inFunction("var x = {a:1}; var out = x.a; x.a = 'string'; var out2 = x.a;"); 
     verify("out", NUMBER_TYPE); 
     verify("out2", STRING_TYPE); 
     inFunction("var x = { get a() {return 1} }; var out = x.a;"); 
     verify("out", UNKNOWN_TYPE); 
     inFunction("var x = {" + "  /** @return {number} */ get a() {return 1}" + "};" + "var out = x.a;"); 
     verify("out", NUMBER_TYPE); 
     inFunction("var x = { set a(b) {} }; var out = x.a;"); 
     verify("out", UNKNOWN_TYPE); 
     inFunction("var x = { " + "/** @param {number} b */ set a(b) {} };" + "var out = x.a;"); 
     verify("out", NUMBER_TYPE); 
 } 


public void testUnary338() { 
     assuming("x", NUMBER_TYPE); 
     inFunction("var y = +x;"); 
     verify("y", NUMBER_TYPE); 
     inFunction("var z = -x;"); 
     verify("z", NUMBER_TYPE); 
 } 


public void testIssue785455() { 
     inFunction("/** @param {string|{prop: (string|undefined)}} x */" + "function f(x) {}" + "var out = {};" + "f(out);"); 
     assertEquals("{prop: (string|undefined)}", getType("out").toString()); 
 } 


public void testUnknownType1489() { 
     inFunction("var y = 3; y = x;"); 
     verify("y", UNKNOWN_TYPE); 
 } 


public void testPropertyInference2515() { 
     ObjectType thisType = registry.createAnonymousObjectType(null); 
     thisType.defineDeclaredProperty("foo", createUndefinableType(STRING_TYPE), null); 
     assumingThisType(thisType); 
     inFunction("var y = 1; this.foo = 'x'; y = this.foo;"); 
     verify("y", STRING_TYPE); 
 } 


public void testAssertTypeofProp542() { 
     assuming("x", createNullableType(OBJECT_TYPE)); 
     inFunction("goog.asserts.assert(typeof x.prop != 'undefined');" + "out = x.prop;"); 
     verify("out", CHECKED_UNKNOWN_TYPE); 
 } 


public void testAssert1a763() { 
     JSType startType = createNullableType(OBJECT_TYPE); 
     assuming("x", startType); 
     inFunction("out1 = x; goog.asserts.assert(x !== null); out2 = x;"); 
     verify("out1", startType); 
     verify("out2", OBJECT_TYPE); 
 } 


public void testFor2903() { 
     assuming("y", OBJECT_TYPE); 
     inFunction("var x = null; var i = null; for (i in y) { x = 1; }"); 
     verify("x", createNullableType(NUMBER_TYPE)); 
     verify("i", createNullableType(STRING_TYPE)); 
 } 


public void testAssertInstanceof5920() { 
     JSType startType = registry.getNativeType(ALL_TYPE); 
     assuming("x", startType); 
     inFunction("out1 = x; goog.asserts.assertInstanceof(x, String); var r = x;"); 
     verify("out1", startType); 
     verify("x", STRING_OBJECT_TYPE); 
 } 


public void testThrownExpression1127() { 
     inFunction("var x = 'foo'; " + "try { throw new Error(x = 3); } catch (ex) {}"); 
     verify("x", NUMBER_TYPE); 
 } 


public void testFor51241() { 
     assuming("y", parameterize(getNativeObjectType(ARRAY_TYPE), getNativeType(NUMBER_TYPE))); 
     inFunction("var x = null; for (var i = 0; i < y.length; i++) { x = y[i]; }"); 
     verify("x", createNullableType(NUMBER_TYPE)); 
     verify("i", NUMBER_TYPE); 
 } 


public void testIsDefAndNoResolvedType1322() { 
     JSType startType = createUndefinableType(NO_RESOLVED_TYPE); 
     assuming("x", startType); 
     inFunction("out1 = x;" + "if (goog.isDef(x)) { out2a = x; out2b = x.length; out2c = x; }" + "out3 = x;" + "if (goog.isDef(x)) { out4 = x; }"); 
     verify("out1", startType); 
     verify("out2a", NO_RESOLVED_TYPE); 
     verify("out2b", CHECKED_UNKNOWN_TYPE); 
     verify("out2c", NO_RESOLVED_TYPE); 
     verify("out3", startType); 
     verify("out4", NO_RESOLVED_TYPE); 
 } 


public void testShortCircuitingAnd1324() { 
     assuming("x", NUMBER_TYPE); 
     inFunction("var y = null; if (x && (y = 3)) { }"); 
     verify("y", createNullableType(NUMBER_TYPE)); 
 } 


public void testHook1342() { 
     assuming("x", createNullableType(OBJECT_TYPE)); 
     inFunction("var y = x ? x : {};"); 
     verifySubtypeOf("y", OBJECT_TYPE); 
 } 


public void testFor41383() { 
     assuming("x", createNullableType(OBJECT_TYPE)); 
     inFunction("var y = {};\n" + "if (x) { for (var i = 0; i < 10; i++) { break; } y = x; }"); 
     verifySubtypeOf("y", OBJECT_TYPE); 
 } 


public void testFor61454() { 
     assuming("y", getNativeObjectType(ARRAY_TYPE)); 
     inFunction("var x = null;" + "for (var i = 0; i < y.length; i++) { " + " if (y[i] == 'z') { x = y[i]; } " + "}"); 
     verify("x", getNativeType(UNKNOWN_TYPE)); 
     verify("i", NUMBER_TYPE); 
 } 


public void testAssertObject21483() { 
     JSType startType = createNullableType(ARRAY_TYPE); 
     assuming("x", startType); 
     inFunction("out1 = x; goog.asserts.assertObject(x); out2 = x;"); 
     verify("out1", startType); 
     verify("out2", ARRAY_TYPE); 
 } 


public void testComparison1502() { 
     inFunction("var x = 'foo'; var y = (x = 3) < 4;"); 
     verify("x", NUMBER_TYPE); 
     inFunction("var x = 'foo'; var y = (x = 3) > 4;"); 
     verify("x", NUMBER_TYPE); 
     inFunction("var x = 'foo'; var y = (x = 3) <= 4;"); 
     verify("x", NUMBER_TYPE); 
     inFunction("var x = 'foo'; var y = (x = 3) >= 4;"); 
     verify("x", NUMBER_TYPE); 
 } 


public void testAssertInstanceof11609() { 
     JSType startType = createNullableType(ALL_TYPE); 
     assuming("x", startType); 
     inFunction("out1 = x; goog.asserts.assertInstanceof(x); out2 = x;"); 
     verify("out1", startType); 
     verify("out2", OBJECT_TYPE); 
 } 


public void testPropertyInference31798() { 
     ObjectType thisType = registry.createAnonymousObjectType(null); 
     thisType.defineDeclaredProperty("foo", createUndefinableType(STRING_TYPE), null); 
     assumingThisType(thisType); 
     inFunction("var y = 1; this.foo = x; y = this.foo;"); 
     verify("y", CHECKED_UNKNOWN_TYPE); 
 } 


public void testInnerFunction21814() { 
     inFunction("var x = 1; var f = function() { x = null; };"); 
     verify("x", NUMBER_TYPE); 
 } 


public void testAssignAdd1839() { 
     assuming("x", NUMBER_TYPE); 
     inFunction("x += '5';"); 
     verify("x", STRING_TYPE); 
 } 


public void testCast21874() { 
     inFunction("/** @return {boolean} */" + "Object.prototype.method = function() { return true; };" + "var x = /** @type {Object} */ (this).method;"); 
     verify("x", registry.createFunctionType(registry.getNativeObjectType(OBJECT_TYPE), registry.getNativeType(BOOLEAN_TYPE), ImmutableList.<JSType>of())); 
 } 


public void testFor31941() { 
     assuming("y", OBJECT_TYPE); 
     inFunction("var x = null; var i = null; for (var i in y) { x = 1; }"); 
     verify("x", createNullableType(NUMBER_TYPE)); 
     verify("i", createNullableType(STRING_TYPE)); 
 } 


public void testAssert32124() { 
     JSType startType = createNullableType(OBJECT_TYPE); 
     assuming("x", startType); 
     assuming("y", startType); 
     inFunction("out1 = x; goog.asserts.assert(x && y); out2 = x; out3 = y;"); 
     verify("out1", startType); 
     verify("out2", OBJECT_TYPE); 
     verify("out3", OBJECT_TYPE); 
 } 


public void testAdd22277() { 
     assuming("x", NUMBER_TYPE); 
     inFunction("var y = x + '5';"); 
     verify("y", STRING_TYPE); 
 } 


public void testInstanceOf62283() { 
     JSType startType = registry.getNativeType(UNKNOWN_TYPE); 
     assuming("x", startType); 
     inFunction("out1 = x; if (x instanceof String) out2 = x;"); 
     verify("out1", startType); 
     verify("out2", STRING_OBJECT_TYPE); 
 } 


public void testAssignInCondition2373() { 
     assuming("x", createNullableType(NUMBER_TYPE)); 
     inFunction("var y; if (!(y = x)) { y = 3; }"); 
     verify("y", NUMBER_TYPE); 
 } 


public void testEnumRAI42393() { 
     JSType enumType = createEnumType("MyEnum", createUnionType(STRING_TYPE, NUMBER_TYPE)).getElementsType(); 
     assuming("x", enumType); 
     inFunction("var y = null; if (typeof x == 'number') y = x;"); 
     verify("y", createNullableType(NUMBER_TYPE)); 
 } 


public void testEnumRAI32424() { 
     JSType enumType = createEnumType("MyEnum", NUMBER_TYPE).getElementsType(); 
     assuming("x", enumType); 
     inFunction("var y = null; if (x && typeof x == 'number') y = x;"); 
     verify("y", createNullableType(enumType)); 
 } 


public void testAdd12454() { 
     assuming("x", NUMBER_TYPE); 
     inFunction("var y = x + 5;"); 
     verify("y", NUMBER_TYPE); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private ObjectType getNativeObjectType(JSTypeNative t) {
    return registry.getNativeObjectType(t);
  }

  private JSType getNativeType(JSTypeNative t) {
    return registry.getNativeType(t);
  }

  private JSType parameterize(ObjectType objType, JSType t) {
    return registry.createParameterizedType(objType, t);
  }
}
