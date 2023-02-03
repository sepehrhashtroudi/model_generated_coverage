/*
 * Copyright 2004 The Closure Compiler Authors.
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

import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

import junit.framework.TestCase;

import java.util.Collection;
import java.util.Set;

/**
 * Tests for NodeUtil
 */
public class NodeUtilTest extends TestCase {

  private static Node parse(String js) {
    Compiler compiler = new Compiler();
    compiler.initCompilerOptionsIfTesting();
    compiler.getOptions().setLanguageIn(LanguageMode.ECMASCRIPT5);
    Node n = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    return n;
  }

  static Node getNode(String js) {
    Node root = parse("var a=(" + js + ");");
    Node expr = root.getFirstChild();
    Node var = expr.getFirstChild();
    return var.getFirstChild();
  }


public void testIsNameReferenceCount63() { 
     assertTrue(NodeUtil.isNameReferenced(parse("function foo(){}"), "foo")); 
     assertTrue(NodeUtil.isNameReferenced(parse("var foo = function(){}"), "foo")); 
     assertFalse(NodeUtil.isNameReferenced(parse("function foo(){}"), "undefined")); 
     assertTrue(NodeUtil.isNameReferenced(parse("undefined"), "undefined")); 
     assertTrue(NodeUtil.isNameReferenced(parse("undefined;function foo(){}(undefined)"), "undefined")); 
     assertTrue(NodeUtil.isNameReferenced(parse("goo.foo"), "goo")); 
     assertFalse(NodeUtil.isNameReferenced(parse("goo.foo"), "foo")); 
 } 


public void testLocalValue167() throws Exception { 
     assertFalse(testLocalValue("x")); 
     assertFalse(testLocalValue("x()")); 
     assertFalse(testLocalValue("this")); 
     assertFalse(testLocalValue("arguments")); 
     assertFalse(testLocalValue("new x()")); 
     assertFalse(testLocalValue("(new x()).y")); 
     assertFalse(testLocalValue("(new x())['y']")); 
     assertTrue(testLocalValue("null")); 
     assertTrue(testLocalValue("undefined")); 
     assertTrue(testLocalValue("Infinity")); 
     assertTrue(testLocalValue("NaN")); 
     assertTrue(testLocalValue("1")); 
     assertTrue(testLocalValue("'a'")); 
     assertTrue(testLocalValue("true")); 
     assertTrue(testLocalValue("false")); 
     assertTrue(testLocalValue("[]")); 
     assertTrue(testLocalValue("{}")); 
     assertTrue(testLocalValue("[x]")); 
     assertTrue(testLocalValue("{'a':x}")); 
     assertTrue(testLocalValue("++x")); 
     assertTrue(testLocalValue("--x")); 
     assertFalse(testLocalValue("x++")); 
     assertFalse(testLocalValue("x--")); 
     assertTrue(testLocalValue("x=1")); 
     assertFalse(testLocalValue("x=[]")); 
     assertFalse(testLocalValue("x=y")); 
     assertTrue(testLocalValue("x+=y")); 
     assertTrue(testLocalValue("x*=y")); 
     assertTrue(testLocalValue("x==y")); 
     assertTrue(testLocalValue("x!=y")); 
     assertTrue(testLocalValue("x>y")); 
     assertTrue(testLocalValue("(1,2)")); 
     assertTrue(testLocalValue("(x,1)")); 
     assertFalse(testLocalValue("(x,y)")); 
     assertTrue(testLocalValue("1||2")); 
     assertFalse(testLocalValue("x||1")); 
     assertFalse(testLocalValue("x||y")); 
     assertFalse(testLocalValue("1||y")); 
     assertTrue(testLocalValue("1&&2")); 
     assertFalse(testLocalValue("x&&1")); 
     assertFalse(testLocalValue("x&&y")); 
     assertFalse(testLocalValue("1&&y")); 
     assertTrue(testLocalValue("x?1:2")); 
     assertFalse(testLocalValue("x?x:2")); 
     assertFalse(testLocalValue("x?1:x")); 
     assertFalse(testLocalValue("x?x:y")); 
     assertTrue(testLocalValue("!y")); 
     assertTrue(testLocalValue("~y")); 
     assertTrue(testLocalValue("y + 1")); 
     assertTrue(testLocalValue("y + z")); 
     assertTrue(testLocalValue("y * z")); 
     assertTrue(testLocalValue("'a' in x")); 
     assertTrue(testLocalValue("typeof x")); 
     assertTrue(testLocalValue("x instanceof y")); 
     assertTrue(testLocalValue("void x")); 
     assertTrue(testLocalValue("void 0")); 
     assertFalse(testLocalValue("{}.x")); 
     assertTrue(testLocalValue("{}.toString()")); 
     assertTrue(testLocalValue("o.toString()")); 
     assertFalse(testLocalValue("o.valueOf()")); 
     assertTrue(testLocalValue("delete a.b")); 
 } 


public void testGetArrayStringValue99() { 
     assertEquals("", NodeUtil.getStringValue(getNode("[]"))); 
     assertEquals("", NodeUtil.getStringValue(getNode("['']"))); 
     assertEquals("", NodeUtil.getStringValue(getNode("[null]"))); 
     assertEquals("", NodeUtil.getStringValue(getNode("[undefined]"))); 
     assertEquals("", NodeUtil.getStringValue(getNode("[void 0]"))); 
     assertEquals("NaN", NodeUtil.getStringValue(getNode("[NaN]"))); 
     assertEquals(",", NodeUtil.getStringValue(getNode("[,'']"))); 
     assertEquals(",,", NodeUtil.getStringValue(getNode("[[''],[''],['']]"))); 
     assertEquals("1,2", NodeUtil.getStringValue(getNode("[[1.0],[2.0]]"))); 
     assertEquals(null, NodeUtil.getStringValue(getNode("[a]"))); 
     assertEquals(null, NodeUtil.getStringValue(getNode("[1,a]"))); 
 } 


public void testMayEffectMutableState100() { 
     assertMutableState(true, "i++"); 
     assertMutableState(true, "[b, [a, i++]]"); 
     assertMutableState(true, "i=3"); 
     assertMutableState(true, "[0, i=3]"); 
     assertMutableState(true, "b()"); 
     assertMutableState(true, "void b()"); 
     assertMutableState(true, "[1, b()]"); 
     assertMutableState(true, "b.b=4"); 
     assertMutableState(true, "b.b--"); 
     assertMutableState(true, "i--"); 
     assertMutableState(true, "a[0][i=4]"); 
     assertMutableState(true, "a += 3"); 
     assertMutableState(true, "a, b, z += 4"); 
     assertMutableState(true, "a ? c : d++"); 
     assertMutableState(true, "a + c++"); 
     assertMutableState(true, "a + c - d()"); 
     assertMutableState(true, "a + c - d()"); 
     assertMutableState(true, "function foo() {}"); 
     assertMutableState(true, "while(true);"); 
     assertMutableState(true, "if(true){a()}"); 
     assertMutableState(false, "if(true){a}"); 
     assertMutableState(true, "(function() { })"); 
     assertMutableState(true, "(function() { i++ })"); 
     assertMutableState(true, "[function a(){}]"); 
     assertMutableState(false, "a"); 
     assertMutableState(true, "[b, c [d, [e]]]"); 
     assertMutableState(true, "({a: x, b: y, c: z})"); 
     assertMutableState(true, "/abc/gi"); 
     assertMutableState(false, "'a'"); 
     assertMutableState(false, "0"); 
     assertMutableState(false, "a + c"); 
     assertMutableState(false, "'c' + a[0]"); 
     assertMutableState(false, "a[0][1]"); 
     assertMutableState(false, "'a' + c"); 
     assertMutableState(false, "'a' + a.name"); 
     assertMutableState(false, "1, 2, 3"); 
     assertMutableState(false, "a, b, 3"); 
     assertMutableState(true, "(function(a, b) {  })"); 
     assertMutableState(false, "a ? c : d"); 
     assertMutableState(false, "'1' + navigator.userAgent"); 
     assertMutableState(true, "new RegExp('foobar', 'i')"); 
     assertMutableState(true, "new RegExp(SomethingWacky(), 'i')"); 
     assertMutableState(true, "new Array()"); 
     assertMutableState(true, "new Array"); 
     assertMutableState(true, "new Array(4)"); 
     assertMutableState(true, "new Array('a', 'b', 'c')"); 
     assertMutableState(true, "new SomeClassINeverHeardOf()"); 
 } 


public void testMayHaveSideEffects157() { 
     assertSideEffect(true, "i++"); 
     assertSideEffect(true, "[b, [a, i++]]"); 
     assertSideEffect(true, "i=3"); 
     assertSideEffect(true, "[0, i=3]"); 
     assertSideEffect(true, "b()"); 
     assertSideEffect(true, "[1, b()]"); 
     assertSideEffect(true, "b.b=4"); 
     assertSideEffect(true, "b.b--"); 
     assertSideEffect(true, "i--"); 
     assertSideEffect(true, "a[0][i=4]"); 
     assertSideEffect(true, "a += 3"); 
     assertSideEffect(true, "a, b, z += 4"); 
     assertSideEffect(true, "a ? c : d++"); 
     assertSideEffect(true, "a + c++"); 
     assertSideEffect(true, "a + c - d()"); 
     assertSideEffect(true, "a + c - d()"); 
     assertSideEffect(true, "function foo() {}"); 
     assertSideEffect(true, "while(true);"); 
     assertSideEffect(true, "if(true){a()}"); 
     assertSideEffect(false, "if(true){a}"); 
     assertSideEffect(false, "(function() { })"); 
     assertSideEffect(false, "(function() { i++ })"); 
     assertSideEffect(false, "[function a(){}]"); 
     assertSideEffect(false, "a"); 
     assertSideEffect(false, "[b, c [d, [e]]]"); 
     assertSideEffect(false, "({a: x, b: y, c: z})"); 
     assertSideEffect(false, "/abc/gi"); 
     assertSideEffect(false, "'a'"); 
     assertSideEffect(false, "0"); 
     assertSideEffect(false, "a + c"); 
     assertSideEffect(false, "'c' + a[0]"); 
     assertSideEffect(false, "a[0][1]"); 
     assertSideEffect(false, "'a' + c"); 
     assertSideEffect(false, "'a' + a.name"); 
     assertSideEffect(false, "1, 2, 3"); 
     assertSideEffect(false, "a, b, 3"); 
     assertSideEffect(false, "(function(a, b) {  })"); 
     assertSideEffect(false, "a ? c : d"); 
     assertSideEffect(false, "'1' + navigator.userAgent"); 
     assertSideEffect(false, "new RegExp('foobar', 'i')"); 
     assertSideEffect(true, "new RegExp(SomethingWacky(), 'i')"); 
     assertSideEffect(false, "new Array()"); 
     assertSideEffect(false, "new Array"); 
     assertSideEffect(false, "new Array(4)"); 
     assertSideEffect(false, "new Array('a', 'b', 'c')"); 
     assertSideEffect(true, "new SomeClassINeverHeardOf()"); 
     assertSideEffect(true, "new SomeClassINeverHeardOf()"); 
     assertSideEffect(false, "({}).foo = 4"); 
     assertSideEffect(false, "([]).foo = 4"); 
     assertSideEffect(false, "(function() {}).foo = 4"); 
     assertSideEffect(true, "this.foo = 4"); 
     assertSideEffect(true, "a.foo = 4"); 
     assertSideEffect(true, "(function() { return n; })().foo = 4"); 
     assertSideEffect(true, "([]).foo = bar()"); 
     assertSideEffect(false, "undefined"); 
     assertSideEffect(false, "void 0"); 
     assertSideEffect(true, "void foo()"); 
     assertSideEffect(false, "-Infinity"); 
     assertSideEffect(false, "Infinity"); 
     assertSideEffect(false, "NaN"); 
     assertSideEffect(false, "({}||[]).foo = 2;"); 
     assertSideEffect(false, "(true ? {} : []).foo = 2;"); 
     assertSideEffect(false, "({},[]).foo = 2;"); 
     assertSideEffect(true, "delete a.b"); 
 } 


public void testRegExpSideEffect183() { 
     assertSideEffect(false, "/abc/gi", true); 
     assertSideEffect(false, "/abc/gi", false); 
     assertSideEffect(true, "(/abc/gi).test('')", true); 
     assertSideEffect(false, "(/abc/gi).test('')", false); 
     assertSideEffect(true, "(/abc/gi).test(a)", true); 
     assertSideEffect(false, "(/abc/gi).test(b)", false); 
     assertSideEffect(true, "(/abc/gi).exec('')", true); 
     assertSideEffect(false, "(/abc/gi).exec('')", false); 
     assertSideEffect(true, "(/abc/gi).foo('')", true); 
     assertSideEffect(true, "(/abc/gi).foo('')", false); 
     assertSideEffect(true, "''.match('a')", true); 
     assertSideEffect(false, "''.match('a')", false); 
     assertSideEffect(true, "''.match(/(a)/)", true); 
     assertSideEffect(false, "''.match(/(a)/)", false); 
     assertSideEffect(true, "''.replace('a')", true); 
     assertSideEffect(false, "''.replace('a')", false); 
     assertSideEffect(true, "''.search('a')", true); 
     assertSideEffect(false, "''.search('a')", false); 
     assertSideEffect(true, "''.split('a')", true); 
     assertSideEffect(false, "''.split('a')", false); 
     assertSideEffect(true, "''.foo('a')", true); 
     assertSideEffect(true, "''.foo('a')", false); 
     assertSideEffect(true, "''.match(a)", true); 
     assertSideEffect(true, "''.match(a)", false); 
 } 


public void testRemoveVarChild337() { 
     Compiler compiler = new Compiler(); 
     Node actual = parse("var foo, goo, hoo"); 
     Node varNode = actual.getFirstChild(); 
     Node nameNode = varNode.getFirstChild(); 
     NodeUtil.removeChild(varNode, nameNode); 
     String expected = "var goo, hoo"; 
     String difference = parse(expected).checkTreeEquals(actual); 
     if (difference != null) { 
         assertTrue("Nodes do not match:\n" + difference, false); 
     } 
     actual = parse("var foo, goo, hoo"); 
     varNode = actual.getFirstChild(); 
     nameNode = varNode.getFirstChild().getNext(); 
     NodeUtil.removeChild(varNode, nameNode); 
     expected = "var foo, hoo"; 
     difference = parse(expected).checkTreeEquals(actual); 
     if (difference != null) { 
         assertTrue("Nodes do not match:\n" + difference, false); 
     } 
     actual = parse("var foo, hoo"); 
     varNode = actual.getFirstChild(); 
     nameNode = varNode.getFirstChild().getNext(); 
     NodeUtil.removeChild(varNode, nameNode); 
     expected = "var foo"; 
     difference = parse(expected).checkTreeEquals(actual); 
     if (difference != null) { 
         assertTrue("Nodes do not match:\n" + difference, false); 
     } 
     actual = parse("var hoo"); 
     varNode = actual.getFirstChild(); 
     nameNode = varNode.getFirstChild(); 
     NodeUtil.removeChild(varNode, nameNode); 
     expected = ""; 
     difference = parse(expected).checkTreeEquals(actual); 
     if (difference != null) { 
         assertTrue("Nodes do not match:\n" + difference, false); 
     } 
 } 


public void testGetExpressionBooleanValue348() { 
     assertImpureBooleanTrue("a=true"); 
     assertImpureBooleanFalse("a=false"); 
     assertImpureBooleanTrue("a=(false,true)"); 
     assertImpureBooleanFalse("a=(true,false)"); 
     assertImpureBooleanTrue("a=(false || true)"); 
     assertImpureBooleanFalse("a=(true && false)"); 
     assertImpureBooleanTrue("a=!(true && false)"); 
     assertImpureBooleanTrue("a,true"); 
     assertImpureBooleanFalse("a,false"); 
     assertImpureBooleanTrue("true||false"); 
     assertImpureBooleanFalse("false||false"); 
     assertImpureBooleanTrue("true&&true"); 
     assertImpureBooleanFalse("true&&false"); 
     assertImpureBooleanFalse("!true"); 
     assertImpureBooleanTrue("!false"); 
     assertImpureBooleanTrue("!''"); 
     assertImpureBooleanUnknown("a *= 2"); 
     assertImpureBooleanUnknown("2 + 2"); 
     assertImpureBooleanTrue("a=1"); 
     assertImpureBooleanTrue("a=/a/"); 
     assertImpureBooleanTrue("a={}"); 
     assertImpureBooleanTrue("true"); 
     assertImpureBooleanTrue("10"); 
     assertImpureBooleanTrue("'0'"); 
     assertImpureBooleanTrue("/a/"); 
     assertImpureBooleanTrue("{}"); 
     assertImpureBooleanTrue("[]"); 
     assertImpureBooleanFalse("false"); 
     assertImpureBooleanFalse("null"); 
     assertImpureBooleanFalse("0"); 
     assertImpureBooleanFalse("''"); 
     assertImpureBooleanFalse("undefined"); 
     assertImpureBooleanFalse("void 0"); 
     assertImpureBooleanFalse("void foo()"); 
     assertImpureBooleanTrue("a?true:true"); 
     assertImpureBooleanFalse("a?false:false"); 
     assertImpureBooleanUnknown("a?true:false"); 
     assertImpureBooleanUnknown("a?true:foo()"); 
     assertImpureBooleanUnknown("b"); 
     assertImpureBooleanUnknown("-'0.0'"); 
     assertImpureBooleanTrue("{a:foo()}"); 
     assertImpureBooleanTrue("[foo()]"); 
 } 


public void testLocalValue2356() { 
     Node newExpr = getNode("new x()"); 
     assertFalse(NodeUtil.evaluatesToLocalValue(newExpr)); 
     Preconditions.checkState(newExpr.isNew()); 
     Node.SideEffectFlags flags = new Node.SideEffectFlags(); 
     flags.clearAllFlags(); 
     newExpr.setSideEffectFlags(flags.valueOf()); 
     assertTrue(NodeUtil.evaluatesToLocalValue(newExpr)); 
     flags.clearAllFlags(); 
     flags.setMutatesThis(); 
     newExpr.setSideEffectFlags(flags.valueOf()); 
     assertTrue(NodeUtil.evaluatesToLocalValue(newExpr)); 
     flags.clearAllFlags(); 
     flags.setReturnsTainted(); 
     newExpr.setSideEffectFlags(flags.valueOf()); 
     assertTrue(NodeUtil.evaluatesToLocalValue(newExpr)); 
     flags.clearAllFlags(); 
     flags.setThrows(); 
     newExpr.setSideEffectFlags(flags.valueOf()); 
     assertFalse(NodeUtil.evaluatesToLocalValue(newExpr)); 
     flags.clearAllFlags(); 
     flags.setMutatesArguments(); 
     newExpr.setSideEffectFlags(flags.valueOf()); 
     assertFalse(NodeUtil.evaluatesToLocalValue(newExpr)); 
     flags.clearAllFlags(); 
     flags.setMutatesGlobalState(); 
     newExpr.setSideEffectFlags(flags.valueOf()); 
     assertFalse(NodeUtil.evaluatesToLocalValue(newExpr)); 
 } 


public void testRemoveTryChild1381() { 
     Node actual = parse("try {foo()} catch(e) {} finally {}"); 
     Node tryNode = actual.getFirstChild(); 
     Node tryBlock = tryNode.getFirstChild(); 
     Node catchBlocks = tryNode.getFirstChild().getNext(); 
     Node finallyBlock = tryNode.getLastChild(); 
     NodeUtil.removeChild(tryNode, finallyBlock); 
     String expected = "try {foo()} catch(e) {}"; 
     String difference = parse(expected).checkTreeEquals(actual); 
     if (difference != null) { 
         assertTrue("Nodes do not match:\n" + difference, false); 
     } 
 } 


public void testGetNumberValue413() { 
     assertEquals(1.0, NodeUtil.getNumberValue(getNode("'\\uFEFF1'"))); 
     assertEquals(0.0, NodeUtil.getNumberValue(getNode("''"))); 
     assertEquals(0.0, NodeUtil.getNumberValue(getNode("' '"))); 
     assertEquals(0.0, NodeUtil.getNumberValue(getNode("' \\t'"))); 
     assertEquals(0.0, NodeUtil.getNumberValue(getNode("'+0'"))); 
     assertEquals(-0.0, NodeUtil.getNumberValue(getNode("'-0'"))); 
     assertEquals(2.0, NodeUtil.getNumberValue(getNode("'+2'"))); 
     assertEquals(-1.6, NodeUtil.getNumberValue(getNode("'-1.6'"))); 
     assertEquals(16.0, NodeUtil.getNumberValue(getNode("'16'"))); 
     assertEquals(16.0, NodeUtil.getNumberValue(getNode("' 16 '"))); 
     assertEquals(16.0, NodeUtil.getNumberValue(getNode("' 16 '"))); 
     assertEquals(12300.0, NodeUtil.getNumberValue(getNode("'123e2'"))); 
     assertEquals(12300.0, NodeUtil.getNumberValue(getNode("'123E2'"))); 
     assertEquals(1.23, NodeUtil.getNumberValue(getNode("'123e-2'"))); 
     assertEquals(1.23, NodeUtil.getNumberValue(getNode("'123E-2'"))); 
     assertEquals(-1.23, NodeUtil.getNumberValue(getNode("'-123e-2'"))); 
     assertEquals(-1.23, NodeUtil.getNumberValue(getNode("'-123E-2'"))); 
     assertEquals(1.23, NodeUtil.getNumberValue(getNode("'+123e-2'"))); 
     assertEquals(1.23, NodeUtil.getNumberValue(getNode("'+123E-2'"))); 
     assertEquals(12300.0, NodeUtil.getNumberValue(getNode("'+123e+2'"))); 
     assertEquals(12300.0, NodeUtil.getNumberValue(getNode("'+123E+2'"))); 
     assertEquals(15.0, NodeUtil.getNumberValue(getNode("'0xf'"))); 
     assertEquals(15.0, NodeUtil.getNumberValue(getNode("'0xF'"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("'-0xf'"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("'-0xF'"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("'+0xf'"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("'+0xF'"))); 
     assertEquals(16.0, NodeUtil.getNumberValue(getNode("'0X10'"))); 
     assertEquals(Double.NaN, NodeUtil.getNumberValue(getNode("'0X10.8'"))); 
     assertEquals(77.0, NodeUtil.getNumberValue(getNode("'077'"))); 
     assertEquals(-77.0, NodeUtil.getNumberValue(getNode("'-077'"))); 
     assertEquals(-77.5, NodeUtil.getNumberValue(getNode("'-077.5'"))); 
     assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(getNode("'-Infinity'"))); 
     assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(getNode("'Infinity'"))); 
     assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(getNode("'+Infinity'"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("'-infinity'"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("'infinity'"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("'+infinity'"))); 
     assertEquals(Double.NaN, NodeUtil.getNumberValue(getNode("'NaN'"))); 
     assertEquals(Double.NaN, NodeUtil.getNumberValue(getNode("'some unknown string'"))); 
     assertEquals(Double.NaN, NodeUtil.getNumberValue(getNode("'123 blah'"))); 
     assertEquals(1.0, NodeUtil.getNumberValue(getNode("1"))); 
     assertEquals(-1.0, NodeUtil.getNumberValue(getNode("-1"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("+1"))); 
     assertEquals(22.0, NodeUtil.getNumberValue(getNode("22"))); 
     assertEquals(18.0, NodeUtil.getNumberValue(getNode("022"))); 
     assertEquals(34.0, NodeUtil.getNumberValue(getNode("0x22"))); 
     assertEquals(1.0, NodeUtil.getNumberValue(getNode("true"))); 
     assertEquals(0.0, NodeUtil.getNumberValue(getNode("false"))); 
     assertEquals(0.0, NodeUtil.getNumberValue(getNode("null"))); 
     assertEquals(Double.NaN, NodeUtil.getNumberValue(getNode("void 0"))); 
     assertEquals(Double.NaN, NodeUtil.getNumberValue(getNode("void f"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("void f()"))); 
     assertEquals(Double.NaN, NodeUtil.getNumberValue(getNode("NaN"))); 
     assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(getNode("Infinity"))); 
     assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(getNode("-Infinity"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("infinity"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("-infinity"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("x"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("x.y"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("1/2"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("1-2"))); 
     assertEquals(null, NodeUtil.getNumberValue(getNode("+1"))); 
 } 


public void testValidNames462() { 
     assertTrue(NodeUtil.isValidPropertyName("a")); 
     assertTrue(NodeUtil.isValidPropertyName("a3")); 
     assertFalse(NodeUtil.isValidPropertyName("3a")); 
     assertFalse(NodeUtil.isValidPropertyName("a.")); 
     assertFalse(NodeUtil.isValidPropertyName(".a")); 
     assertFalse(NodeUtil.isValidPropertyName("a.b")); 
     assertFalse(NodeUtil.isValidPropertyName("true")); 
     assertFalse(NodeUtil.isValidPropertyName("a.true")); 
     assertFalse(NodeUtil.isValidPropertyName("a..b")); 
     assertTrue(NodeUtil.isValidSimpleName("a")); 
     assertTrue(NodeUtil.isValidSimpleName("a3")); 
     assertFalse(NodeUtil.isValidSimpleName("3a")); 
     assertFalse(NodeUtil.isValidSimpleName("a.")); 
     assertFalse(NodeUtil.isValidSimpleName(".a")); 
     assertFalse(NodeUtil.isValidSimpleName("a.b")); 
     assertFalse(NodeUtil.isValidSimpleName("true")); 
     assertFalse(NodeUtil.isValidSimpleName("a.true")); 
     assertFalse(NodeUtil.isValidSimpleName("a..b")); 
     assertTrue(NodeUtil.isValidQualifiedName("a")); 
     assertTrue(NodeUtil.isValidQualifiedName("a3")); 
     assertFalse(NodeUtil.isValidQualifiedName("3a")); 
     assertFalse(NodeUtil.isValidQualifiedName("a.")); 
     assertFalse(NodeUtil.isValidQualifiedName(".a")); 
     assertTrue(NodeUtil.isValidQualifiedName("a.b")); 
     assertFalse(NodeUtil.isValidQualifiedName("true")); 
     assertFalse(NodeUtil.isValidQualifiedName("a.true")); 
     assertFalse(NodeUtil.isValidQualifiedName("a..b")); 
 } 


public void testIsLiteralOrConstValue583() { 
     assertLiteralAndImmutable(getNode("10")); 
     assertLiteralAndImmutable(getNode("-10")); 
     assertLiteralButNotImmutable(getNode("[10, 20]")); 
     assertLiteralButNotImmutable(getNode("{'a': 20}")); 
     assertLiteralButNotImmutable(getNode("[10, , 1.0, [undefined], 'a']")); 
     assertLiteralButNotImmutable(getNode("/abc/")); 
     assertLiteralAndImmutable(getNode("\"string\"")); 
     assertLiteralAndImmutable(getNode("'aaa'")); 
     assertLiteralAndImmutable(getNode("null")); 
     assertLiteralAndImmutable(getNode("undefined")); 
     assertLiteralAndImmutable(getNode("void 0")); 
     assertNotLiteral(getNode("abc")); 
     assertNotLiteral(getNode("[10, foo(), 20]")); 
     assertNotLiteral(getNode("foo()")); 
     assertNotLiteral(getNode("c + d")); 
     assertNotLiteral(getNode("{'a': foo()}")); 
     assertNotLiteral(getNode("void foo()")); 
 } 


public void testGetNearestFunctionName630() { 
     testFunctionName("(function() {})()", null); 
     testFunctionName("function a() {}", "a"); 
     testFunctionName("(function a() {})", "a"); 
     testFunctionName("({a:function () {}})", "a"); 
     testFunctionName("({get a() {}})", "a"); 
     testFunctionName("({set a(b) {}})", "a"); 
     testFunctionName("({set a(b) {}})", "a"); 
     testFunctionName("({1:function () {}})", "1"); 
     testFunctionName("var a = function a() {}", "a"); 
     testFunctionName("var a;a = function a() {}", "a"); 
     testFunctionName("var o;o.a = function a() {}", "o.a"); 
     testFunctionName("this.a = function a() {}", "this.a"); 
 } 


public void testMayBeString642() { 
     assertFalse(NodeUtil.mayBeString(getNode("1"))); 
     assertFalse(NodeUtil.mayBeString(getNode("true"))); 
     assertFalse(NodeUtil.mayBeString(getNode("+true"))); 
     assertFalse(NodeUtil.mayBeString(getNode("+1"))); 
     assertFalse(NodeUtil.mayBeString(getNode("-1"))); 
     assertFalse(NodeUtil.mayBeString(getNode("-Infinity"))); 
     assertFalse(NodeUtil.mayBeString(getNode("Infinity"))); 
     assertFalse(NodeUtil.mayBeString(getNode("NaN"))); 
     assertFalse(NodeUtil.mayBeString(getNode("undefined"))); 
     assertFalse(NodeUtil.mayBeString(getNode("void 0"))); 
     assertFalse(NodeUtil.mayBeString(getNode("null"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a << b"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a >> b"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a >>> b"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a == b"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a != b"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a === b"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a !== b"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a < b"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a > b"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a <= b"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a >= b"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a in b"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a instanceof b"))); 
     assertTrue(NodeUtil.mayBeString(getNode("'a'"))); 
     assertTrue(NodeUtil.mayBeString(getNode("'a'+b"))); 
     assertTrue(NodeUtil.mayBeString(getNode("a+'b'"))); 
     assertTrue(NodeUtil.mayBeString(getNode("a+b"))); 
     assertTrue(NodeUtil.mayBeString(getNode("a()"))); 
     assertTrue(NodeUtil.mayBeString(getNode("''.a"))); 
     assertTrue(NodeUtil.mayBeString(getNode("a.b"))); 
     assertTrue(NodeUtil.mayBeString(getNode("a.b()"))); 
     assertTrue(NodeUtil.mayBeString(getNode("a().b()"))); 
     assertTrue(NodeUtil.mayBeString(getNode("new a()"))); 
     assertFalse(NodeUtil.mayBeString(getNode("1 && 2"))); 
     assertFalse(NodeUtil.mayBeString(getNode("1 || 2"))); 
     assertFalse(NodeUtil.mayBeString(getNode("1 ? 2 : 3"))); 
     assertFalse(NodeUtil.mayBeString(getNode("1,2"))); 
     assertFalse(NodeUtil.mayBeString(getNode("a=1"))); 
     assertFalse(NodeUtil.mayBeString(getNode("1+1"))); 
     assertFalse(NodeUtil.mayBeString(getNode("true+true"))); 
     assertFalse(NodeUtil.mayBeString(getNode("null+null"))); 
     assertFalse(NodeUtil.mayBeString(getNode("NaN+NaN"))); 
     assertTrue(NodeUtil.mayBeString(getNode("([1,2])"))); 
     assertTrue(NodeUtil.mayBeString(getNode("({a:1})"))); 
     assertTrue(NodeUtil.mayBeString(getNode("({}+1)"))); 
     assertTrue(NodeUtil.mayBeString(getNode("(1+{})"))); 
     assertTrue(NodeUtil.mayBeString(getNode("([]+1)"))); 
     assertTrue(NodeUtil.mayBeString(getNode("(1+[])"))); 
 } 


public void testIsControlStructureCodeBlock679() { 
     Node root = parse("if (x) foo(); else boo();"); 
     Node ifNode = root.getFirstChild(); 
     Node ifCondition = ifNode.getFirstChild(); 
     Node ifCase = ifNode.getFirstChild().getNext(); 
     Node elseCase = ifNode.getLastChild(); 
     assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, ifCondition)); 
     assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, ifCase)); 
     assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, elseCase)); 
 } 


public void testGetSourceName737() { 
     Node n = new Node(Token.BLOCK); 
     Node parent = new Node(Token.BLOCK, n); 
     parent.setSourceFileForTesting("foo"); 
     assertEquals("foo", NodeUtil.getSourceName(n)); 
 } 


public void testIsExecutedExactlyOnce806() { 
     assertEquals(true, executedOnceTestCase("x;")); 
     assertEquals(true, executedOnceTestCase("x && 1;")); 
     assertEquals(false, executedOnceTestCase("1 && x;")); 
     assertEquals(false, executedOnceTestCase("1 && (x && 1);")); 
     assertEquals(true, executedOnceTestCase("x || 1;")); 
     assertEquals(false, executedOnceTestCase("1 || x;")); 
     assertEquals(false, executedOnceTestCase("1 && (x || 1);")); 
     assertEquals(true, executedOnceTestCase("x ? 1 : 2;")); 
     assertEquals(false, executedOnceTestCase("1 ? 1 : x;")); 
     assertEquals(false, executedOnceTestCase("1 ? x : 2;")); 
     assertEquals(false, executedOnceTestCase("1 && (x ? 1 : 2);")); 
     assertEquals(true, executedOnceTestCase("if (x) {}")); 
     assertEquals(false, executedOnceTestCase("if (true) {x;}")); 
     assertEquals(false, executedOnceTestCase("if (true) {} else {x;}")); 
     assertEquals(false, executedOnceTestCase("if (1) { if (x) {} }")); 
     assertEquals(true, executedOnceTestCase("for(x;;){}")); 
     assertEquals(false, executedOnceTestCase("for(;x;){}")); 
     assertEquals(false, executedOnceTestCase("for(;;x){}")); 
     assertEquals(false, executedOnceTestCase("for(;;){x;}")); 
     assertEquals(false, executedOnceTestCase("if (1) { for(x;;){} }")); 
     assertEquals(false, executedOnceTestCase("for(x in {}){}")); 
     assertEquals(true, executedOnceTestCase("for({}.a in x){}")); 
     assertEquals(false, executedOnceTestCase("for({}.a in {}){x}")); 
     assertEquals(false, executedOnceTestCase("if (1) { for(x in {}){} }")); 
     assertEquals(true, executedOnceTestCase("switch (x) {}")); 
     assertEquals(false, executedOnceTestCase("switch (1) {case x:}")); 
     assertEquals(false, executedOnceTestCase("switch (1) {case 1: x}")); 
     assertEquals(false, executedOnceTestCase("switch (1) {default: x}")); 
     assertEquals(false, executedOnceTestCase("if (1) { switch (x) {} }")); 
     assertEquals(false, executedOnceTestCase("while (x) {}")); 
     assertEquals(false, executedOnceTestCase("while (1) {x}")); 
     assertEquals(false, executedOnceTestCase("do {} while (x)")); 
     assertEquals(false, executedOnceTestCase("do {x} while (1)")); 
     assertEquals(false, executedOnceTestCase("try {x} catch (e) {}")); 
     assertEquals(false, executedOnceTestCase("try {} catch (e) {x}")); 
     assertEquals(true, executedOnceTestCase("try {} finally {x}")); 
     assertEquals(false, executedOnceTestCase("if (1) { try {} finally {x} }")); 
 } 


public void testGetNodeTypeReferenceCount814() { 
     assertEquals(0, NodeUtil.getNodeTypeReferenceCount(parse("function foo(){}"), Token.THIS, Predicates.<Node>alwaysTrue())); 
     assertEquals(1, NodeUtil.getNodeTypeReferenceCount(parse("this"), Token.THIS, Predicates.<Node>alwaysTrue())); 
     assertEquals(2, NodeUtil.getNodeTypeReferenceCount(parse("this;function foo(){}(this)"), Token.THIS, Predicates.<Node>alwaysTrue())); 
 } 


public void testIsBooleanResult907() { 
     assertFalse(NodeUtil.isBooleanResult(getNode("1"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("true"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("+true"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("+1"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("-1"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("-Infinity"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("Infinity"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("NaN"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("undefined"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("void 0"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("a << b"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("a >> b"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("a >>> b"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a == b"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a != b"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a === b"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a !== b"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a < b"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a > b"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a <= b"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a >= b"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a in b"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a instanceof b"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("'a'"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("'a'+b"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("a+'b'"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("a+b"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("a()"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("''.a"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("a.b"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("a.b()"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("a().b()"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("new a()"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("delete a"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("([true,false])"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("({a:true})"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("true && false"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("true || false"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a ? true : false"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a,true"))); 
     assertTrue(NodeUtil.isBooleanResult(getNode("a=true"))); 
     assertFalse(NodeUtil.isBooleanResult(getNode("a=1"))); 
 } 


public void testRemoveChildBlock926() { 
     Node actual = parse("{{x()}}"); 
     Node outerBlockNode = actual.getFirstChild(); 
     Node innerBlockNode = outerBlockNode.getFirstChild(); 
     innerBlockNode.setIsSyntheticBlock(true); 
     NodeUtil.removeChild(outerBlockNode, innerBlockNode); 
     String expected = "{{}}"; 
     String difference = parse(expected).checkTreeEquals(actual); 
     if (difference != null) { 
         assertTrue("Nodes do not match:\n" + difference, false); 
     } 
 } 


public void testGetVarsDeclaredInBranch953() { 
     Compiler compiler = new Compiler(); 
     assertNodeNames(Sets.newHashSet("foo"), NodeUtil.getVarsDeclaredInBranch(parse("var foo;"))); 
     assertNodeNames(Sets.newHashSet("foo", "goo"), NodeUtil.getVarsDeclaredInBranch(parse("var foo,goo;"))); 
     assertNodeNames(Sets.<String>newHashSet(), NodeUtil.getVarsDeclaredInBranch(parse("foo();"))); 
     assertNodeNames(Sets.<String>newHashSet(), NodeUtil.getVarsDeclaredInBranch(parse("function f(){var foo;}"))); 
     assertNodeNames(Sets.newHashSet("goo"), NodeUtil.getVarsDeclaredInBranch(parse("var goo;function f(){var foo;}"))); 
 } 


public void testCallSideEffects1060() { 
     Node callExpr = getNode("new x().method()"); 
     assertTrue(NodeUtil.functionCallHasSideEffects(callExpr)); 
     Node newExpr = callExpr.getFirstChild().getFirstChild(); 
     Preconditions.checkState(newExpr.isNew()); 
     Node.SideEffectFlags flags = new Node.SideEffectFlags(); 
     flags.clearAllFlags(); 
     newExpr.setSideEffectFlags(flags.valueOf()); 
     flags.clearAllFlags(); 
     callExpr.setSideEffectFlags(flags.valueOf()); 
     assertTrue(NodeUtil.evaluatesToLocalValue(callExpr)); 
     assertFalse(NodeUtil.functionCallHasSideEffects(callExpr)); 
     assertFalse(NodeUtil.mayHaveSideEffects(callExpr)); 
     flags.clearAllFlags(); 
     newExpr.setSideEffectFlags(flags.valueOf()); 
     flags.clearAllFlags(); 
     flags.setMutatesThis(); 
     callExpr.setSideEffectFlags(flags.valueOf()); 
     assertTrue(NodeUtil.evaluatesToLocalValue(callExpr)); 
     assertFalse(NodeUtil.functionCallHasSideEffects(callExpr)); 
     assertFalse(NodeUtil.mayHaveSideEffects(callExpr)); 
     flags.clearAllFlags(); 
     newExpr.setSideEffectFlags(flags.valueOf()); 
     flags.clearAllFlags(); 
     flags.setMutatesThis(); 
     flags.setReturnsTainted(); 
     callExpr.setSideEffectFlags(flags.valueOf()); 
     assertFalse(NodeUtil.evaluatesToLocalValue(callExpr)); 
     assertFalse(NodeUtil.functionCallHasSideEffects(callExpr)); 
     assertFalse(NodeUtil.mayHaveSideEffects(callExpr)); 
     flags.clearAllFlags(); 
     newExpr.setSideEffectFlags(flags.valueOf()); 
     flags.clearAllFlags(); 
     flags.setReturnsTainted(); 
     callExpr.setSideEffectFlags(flags.valueOf()); 
     assertFalse(NodeUtil.evaluatesToLocalValue(callExpr)); 
     assertFalse(NodeUtil.functionCallHasSideEffects(callExpr)); 
     assertFalse(NodeUtil.mayHaveSideEffects(callExpr)); 
     flags.clearAllFlags(); 
     flags.setMutatesGlobalState(); 
     newExpr.setSideEffectFlags(flags.valueOf()); 
     flags.clearAllFlags(); 
     callExpr.setSideEffectFlags(flags.valueOf()); 
     assertTrue(NodeUtil.evaluatesToLocalValue(callExpr)); 
     assertFalse(NodeUtil.functionCallHasSideEffects(callExpr)); 
     assertTrue(NodeUtil.mayHaveSideEffects(callExpr)); 
 } 


public void testRemoveTryChild51125() { 
     Node actual = parse("try {foo()} catch(e) {} finally {}"); 
     Node tryNode = actual.getFirstChild(); 
     Node tryBlock = tryNode.getFirstChild(); 
     Node catchBlocks = tryNode.getFirstChild().getNext(); 
     Node catchBlock = catchBlocks.getFirstChild(); 
     Node finallyBlock = tryNode.getLastChild(); 
     NodeUtil.removeChild(catchBlocks, catchBlock); 
     String expected = "try {foo()} finally {}"; 
     String difference = parse(expected).checkTreeEquals(actual); 
     if (difference != null) { 
         assertTrue("Nodes do not match:\n" + difference, false); 
     } 
 } 


public void testMergeBlock11160() { 
     Compiler compiler = new Compiler(); 
     Node actual = parse("{{a();b();}}"); 
     Node parentBlock = actual.getFirstChild(); 
     Node childBlock = parentBlock.getFirstChild(); 
     assertTrue(NodeUtil.tryMergeBlock(childBlock)); 
     String expected = "{a();b();}"; 
     String difference = parse(expected).checkTreeEquals(actual); 
     assertNull("Nodes do not match:\n" + difference, difference); 
 } 


public void testValidDefine1183() { 
     assertTrue(testValidDefineValue("1")); 
     assertTrue(testValidDefineValue("-3")); 
     assertTrue(testValidDefineValue("true")); 
     assertTrue(testValidDefineValue("false")); 
     assertTrue(testValidDefineValue("'foo'")); 
     assertFalse(testValidDefineValue("x")); 
     assertFalse(testValidDefineValue("null")); 
     assertFalse(testValidDefineValue("undefined")); 
     assertFalse(testValidDefineValue("NaN")); 
     assertTrue(testValidDefineValue("!true")); 
     assertTrue(testValidDefineValue("-true")); 
     assertTrue(testValidDefineValue("1 & 8")); 
     assertTrue(testValidDefineValue("1 + 8")); 
     assertTrue(testValidDefineValue("'a' + 'b'")); 
     assertFalse(testValidDefineValue("1 & foo")); 
 } 


public void testContainsFunctionDeclaration1359() { 
     assertTrue(NodeUtil.containsFunction(getNode("function foo(){}"))); 
     assertTrue(NodeUtil.containsFunction(getNode("(b?function(){}:null)"))); 
     assertFalse(NodeUtil.containsFunction(getNode("(b?foo():null)"))); 
     assertFalse(NodeUtil.containsFunction(getNode("foo()"))); 
 } 


public void testRemoveLabelChild11381() { 
     Compiler compiler = new Compiler(); 
     Node actual = parse("foo: goo()"); 
     Node labelNode = actual.getFirstChild(); 
     Node callExpressNode = labelNode.getLastChild(); 
     NodeUtil.removeChild(labelNode, callExpressNode); 
     String expected = ""; 
     String difference = parse(expected).checkTreeEquals(actual); 
     if (difference != null) { 
         assertTrue("Nodes do not match:\n" + difference, false); 
     } 
 } 


public void testIsObjectLiteralKey11444() throws Exception { 
     testIsObjectLiteralKey(parseExpr("({})"), false); 
     testIsObjectLiteralKey(parseExpr("a"), false); 
     testIsObjectLiteralKey(parseExpr("'a'"), false); 
     testIsObjectLiteralKey(parseExpr("1"), false); 
     testIsObjectLiteralKey(parseExpr("({a: 1})").getFirstChild(), true); 
     testIsObjectLiteralKey(parseExpr("({1: 1})").getFirstChild(), true); 
     testIsObjectLiteralKey(parseExpr("({get a(){}})").getFirstChild(), true); 
     testIsObjectLiteralKey(parseExpr("({set a(b){}})").getFirstChild(), true); 
 } 


public void testGetBooleanValue1545() { 
     assertPureBooleanTrue("true"); 
     assertPureBooleanTrue("10"); 
     assertPureBooleanTrue("'0'"); 
     assertPureBooleanTrue("/a/"); 
     assertPureBooleanTrue("{}"); 
     assertPureBooleanTrue("[]"); 
     assertPureBooleanFalse("false"); 
     assertPureBooleanFalse("null"); 
     assertPureBooleanFalse("0"); 
     assertPureBooleanFalse("''"); 
     assertPureBooleanFalse("undefined"); 
     assertPureBooleanFalse("void 0"); 
     assertPureBooleanUnknown("void foo()"); 
     assertPureBooleanUnknown("b"); 
     assertPureBooleanUnknown("-'0.0'"); 
     assertPureBooleanUnknown("{a:foo()}"); 
     assertPureBooleanUnknown("[foo()]"); 
 } 


public void testObjectMethodSideEffects1633() { 
     assertSideEffect(false, "o.toString()"); 
     assertSideEffect(false, "o.valueOf()"); 
     assertSideEffect(true, "o.watch()"); 
 } 


public void testMergeBlock31647() { 
     Compiler compiler = new Compiler(); 
     String code = "foo:{a();boo()}"; 
     Node actual = parse("foo:{a();boo()}"); 
     Node parentLabel = actual.getFirstChild(); 
     Node childBlock = parentLabel.getLastChild(); 
     assertFalse(NodeUtil.tryMergeBlock(childBlock)); 
     String expected = code; 
     String difference = parse(expected).checkTreeEquals(actual); 
     assertNull("Nodes do not match:\n" + difference, difference); 
 } 


public void testReferencesThis1721() { 
     assertTrue(NodeUtil.referencesThis(parse("this"))); 
     assertFalse(NodeUtil.referencesThis(parse("function foo(){this}"))); 
     Node n = parse("function foo(){this}").getFirstChild(); 
     assertEquals(n.getType(), Token.FUNCTION); 
     assertTrue(NodeUtil.referencesThis(n)); 
     assertTrue(NodeUtil.referencesThis(parse("b?this:null"))); 
     assertFalse(NodeUtil.referencesThis(parse("a"))); 
     n = parse("function foo(){}").getFirstChild(); 
     assertEquals(n.getType(), Token.FUNCTION); 
     assertFalse(NodeUtil.referencesThis(n)); 
     assertFalse(NodeUtil.referencesThis(parse("(b?foo():null)"))); 
 } 


public void testGetStringValue1734() { 
     assertEquals("true", NodeUtil.getStringValue(getNode("true"))); 
     assertEquals("10", NodeUtil.getStringValue(getNode("10"))); 
     assertEquals("1", NodeUtil.getStringValue(getNode("1.0"))); 
     assertEquals("0", NodeUtil.getStringValue(getNode("'0'"))); 
     assertEquals(null, NodeUtil.getStringValue(getNode("/a/"))); 
     assertEquals("[object Object]", NodeUtil.getStringValue(getNode("{}"))); 
     assertEquals("", NodeUtil.getStringValue(getNode("[]"))); 
     assertEquals("false", NodeUtil.getStringValue(getNode("false"))); 
     assertEquals("null", NodeUtil.getStringValue(getNode("null"))); 
     assertEquals("0", NodeUtil.getStringValue(getNode("0"))); 
     assertEquals("", NodeUtil.getStringValue(getNode("''"))); 
     assertEquals("undefined", NodeUtil.getStringValue(getNode("undefined"))); 
     assertEquals("undefined", NodeUtil.getStringValue(getNode("void 0"))); 
     assertEquals("undefined", NodeUtil.getStringValue(getNode("void foo()"))); 
     assertEquals("NaN", NodeUtil.getStringValue(getNode("NaN"))); 
     assertEquals("Infinity", NodeUtil.getStringValue(getNode("Infinity"))); 
     assertEquals(null, NodeUtil.getStringValue(getNode("x"))); 
 } 


public void testIsNaN1789() { 
     assertEquals(true, NodeUtil.isNaN(getNode("NaN"))); 
     assertEquals(false, NodeUtil.isNaN(getNode("Infinity"))); 
     assertEquals(false, NodeUtil.isNaN(getNode("x"))); 
     assertEquals(true, NodeUtil.isNaN(getNode("0/0"))); 
     assertEquals(false, NodeUtil.isNaN(getNode("1/0"))); 
     assertEquals(false, NodeUtil.isNaN(getNode("0/1"))); 
     assertEquals(false, NodeUtil.isNaN(IR.number(0.0))); 
 } 


public void testIsFunctionExpression1898() { 
     assertContainsAnonFunc(true, "(function(){})"); 
     assertContainsAnonFunc(true, "[function a(){}]"); 
     assertContainsAnonFunc(false, "{x: function a(){}}"); 
     assertContainsAnonFunc(true, "(function a(){})()"); 
     assertContainsAnonFunc(true, "x = function a(){};"); 
     assertContainsAnonFunc(true, "var x = function a(){};"); 
     assertContainsAnonFunc(true, "if (function a(){});"); 
     assertContainsAnonFunc(true, "while (function a(){});"); 
     assertContainsAnonFunc(true, "do; while (function a(){});"); 
     assertContainsAnonFunc(true, "for (function a(){};;);"); 
     assertContainsAnonFunc(true, "for (;function a(){};);"); 
     assertContainsAnonFunc(true, "for (;;function a(){});"); 
     assertContainsAnonFunc(true, "for (p in function a(){});"); 
     assertContainsAnonFunc(true, "with (function a(){}) {}"); 
     assertContainsAnonFunc(false, "function a(){}"); 
     assertContainsAnonFunc(false, "if (x) function a(){};"); 
     assertContainsAnonFunc(false, "if (x) { function a(){} }"); 
     assertContainsAnonFunc(false, "if (x); else function a(){};"); 
     assertContainsAnonFunc(false, "while (x) function a(){};"); 
     assertContainsAnonFunc(false, "do function a(){} while (0);"); 
     assertContainsAnonFunc(false, "for (;;) function a(){}"); 
     assertContainsAnonFunc(false, "for (p in o) function a(){};"); 
     assertContainsAnonFunc(false, "with (x) function a(){}"); 
 } 


public void testRemoveForChild2071() { 
     Compiler compiler = new Compiler(); 
     Node actual = parse("for(var a=0;a<0;a++)foo()"); 
     Node forNode = actual.getFirstChild(); 
     Node child = forNode.getFirstChild(); 
     NodeUtil.removeChild(forNode, child); 
     String expected = "for(;a<0;a++)foo()"; 
     String difference = parse(expected).checkTreeEquals(actual); 
     assertNull("Nodes do not match:\n" + difference, difference); 
     actual = parse("for(var a=0;a<0;a++)foo()"); 
     forNode = actual.getFirstChild(); 
     child = forNode.getFirstChild().getNext(); 
     NodeUtil.removeChild(forNode, child); 
     expected = "for(var a=0;;a++)foo()"; 
     difference = parse(expected).checkTreeEquals(actual); 
     assertNull("Nodes do not match:\n" + difference, difference); 
     actual = parse("for(var a=0;a<0;a++)foo()"); 
     forNode = actual.getFirstChild(); 
     child = forNode.getFirstChild().getNext().getNext(); 
     NodeUtil.removeChild(forNode, child); 
     expected = "for(var a=0;a<0;)foo()"; 
     difference = parse(expected).checkTreeEquals(actual); 
     assertNull("Nodes do not match:\n" + difference, difference); 
     actual = parse("for(var a=0;a<0;a++)foo()"); 
     forNode = actual.getFirstChild(); 
     child = forNode.getLastChild(); 
     NodeUtil.removeChild(forNode, child); 
     expected = "for(var a=0;a<0;a++);"; 
     difference = parse(expected).checkTreeEquals(actual); 
     assertNull("Nodes do not match:\n" + difference, difference); 
     actual = parse("for(a in ack)foo();"); 
     forNode = actual.getFirstChild(); 
     child = forNode.getLastChild(); 
     NodeUtil.removeChild(forNode, child); 
     expected = "for(a in ack);"; 
     difference = parse(expected).checkTreeEquals(actual); 
     assertNull("Nodes do not match:\n" + difference, difference); 
 } 


public void testRemoveTryChild42149() { 
     Node actual = parse("try {foo()} catch(e) {} finally {}"); 
     Node tryNode = actual.getFirstChild(); 
     Node tryBlock = tryNode.getFirstChild(); 
     Node catchBlocks = tryNode.getFirstChild().getNext(); 
     Node catchBlock = catchBlocks.getFirstChild(); 
     Node finallyBlock = tryNode.getLastChild(); 
     NodeUtil.removeChild(tryNode, catchBlocks); 
     String expected = "try {foo()} finally {}"; 
     String difference = parse(expected).checkTreeEquals(actual); 
     if (difference != null) { 
         assertTrue("Nodes do not match:\n" + difference, false); 
     } 
 } 


public void testGetNameReferenceCount2217() { 
     assertEquals(0, NodeUtil.getNameReferenceCount(parse("function foo(){}"), "undefined")); 
     assertEquals(1, NodeUtil.getNameReferenceCount(parse("undefined"), "undefined")); 
     assertEquals(2, NodeUtil.getNameReferenceCount(parse("undefined;function foo(){}(undefined)"), "undefined")); 
     assertEquals(1, NodeUtil.getNameReferenceCount(parse("goo.foo"), "goo")); 
     assertEquals(0, NodeUtil.getNameReferenceCount(parse("goo.foo"), "foo")); 
     assertEquals(1, NodeUtil.getNameReferenceCount(parse("function foo(){}"), "foo")); 
     assertEquals(1, NodeUtil.getNameReferenceCount(parse("var foo = function(){}"), "foo")); 
 } 

  

  public void assertLiteralAndImmutable(Node n) {
    assertTrue(NodeUtil.isLiteralValue(n, true));
    assertTrue(NodeUtil.isLiteralValue(n, false));
    assertTrue(NodeUtil.isImmutableValue(n));
  }

  public void assertLiteralButNotImmutable(Node n) {
    assertTrue(NodeUtil.isLiteralValue(n, true));
    assertTrue(NodeUtil.isLiteralValue(n, false));
    assertFalse(NodeUtil.isImmutableValue(n));
  }

  public void assertNotLiteral(Node n) {
    assertFalse(NodeUtil.isLiteralValue(n, true));
    assertFalse(NodeUtil.isLiteralValue(n, false));
    assertFalse(NodeUtil.isImmutableValue(n));
  }

  

  private void assertPureBooleanTrue(String val) {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(getNode(val)));
  }

  private void assertPureBooleanFalse(String val) {
    assertEquals(
        TernaryValue.FALSE, NodeUtil.getPureBooleanValue(getNode(val)));
  }

  private void assertPureBooleanUnknown(String val) {
    assertEquals(
        TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(getNode(val)));
  }

  

  private void assertImpureBooleanTrue(String val) {
    assertEquals(TernaryValue.TRUE,
        NodeUtil.getImpureBooleanValue(getNode(val)));
  }

  private void assertImpureBooleanFalse(String val) {
    assertEquals(TernaryValue.FALSE,
        NodeUtil.getImpureBooleanValue(getNode(val)));
  }

  private void assertImpureBooleanUnknown(String val) {
    assertEquals(TernaryValue.UNKNOWN,
        NodeUtil.getImpureBooleanValue(getNode(val)));
  }

  

  

  

  private Node parseExpr(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
    Node root = compiler.parseTestCode(js);
    return root.getFirstChild().getFirstChild();
  }

  private void testIsObjectLiteralKey(Node node, boolean expected) {
    assertEquals(expected, NodeUtil.isObjectLitKey(node, node.getParent()));
  }

  

  

  

  

  

  private void testGetFunctionName(Node function, String name) {
    assertEquals(Token.FUNCTION, function.getType());
    assertEquals(name, NodeUtil.getFunctionName(function));
  }

  

  private void assertSideEffect(boolean se, String js) {
    Node n = parse(js);
    assertEquals(se, NodeUtil.mayHaveSideEffects(n.getFirstChild()));
  }

  private void assertSideEffect(boolean se, String js, boolean globalRegExp) {
    Node n = parse(js);
    Compiler compiler = new Compiler();
    compiler.setHasRegExpGlobalReferences(globalRegExp);
    assertEquals(se, NodeUtil.mayHaveSideEffects(n.getFirstChild(), compiler));
  }

  

  

  

  private void assertMutableState(boolean se, String js) {
    Node n = parse(js);
    assertEquals(se, NodeUtil.mayEffectMutableState(n.getFirstChild()));
  }

  


  

  private void assertContainsAnonFunc(boolean expected, String js) {
    Node funcParent = findParentOfFuncDescendant(parse(js));
    assertNotNull("Expected function node in parse tree of: " + js, funcParent);
    Node funcNode = getFuncChild(funcParent);
    assertEquals(expected, NodeUtil.isFunctionExpression(funcNode));
  }

  private Node findParentOfFuncDescendant(Node n) {
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      if (c.isFunction()) {
        return n;
      }
      Node result = findParentOfFuncDescendant(c);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  private Node getFuncChild(Node n) {
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      if (c.isFunction()) {
        return c;
      }
    }
    return null;
  }

  

  

  

  


  

  

  private void assertNodeNames(Set<String> nodeNames, Collection<Node> nodes) {
    Set<String> actualNames = Sets.newHashSet();
    for (Node node : nodes) {
      actualNames.add(node.getString());
    }
    assertEquals(nodeNames, actualNames);
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private boolean testLocalValue(String js) {
    return NodeUtil.evaluatesToLocalValue(getNode(js));
  }

  

  private boolean testValidDefineValue(String js) {
    Node script = parse("var test = " + js + ";");
    Node var = script.getFirstChild();
    Node name = var.getFirstChild();
    Node value = name.getFirstChild();

    ImmutableSet<String> defines = ImmutableSet.of();
    return NodeUtil.isValidDefineValue(value, defines);
  }

  

  

  

  

  

  

  

  

  

  private boolean executedOnceTestCase(String code) {
    Node ast = parse(code);
    Node nameNode = getNameNode(ast, "x");
    return NodeUtil.isExecutedExactlyOnce(nameNode);
  }

  private String getFunctionLValue(String js) {
    Node lVal = NodeUtil.getBestLValue(getFunctionNode(js));
    return lVal == null ? null : lVal.getString();
  }

  static void testFunctionName(String js, String expected) {
    assertEquals(
        expected,
        NodeUtil.getNearestFunctionName(getFunctionNode(js)));
  }

  static Node getFunctionNode(String js) {
    Node root = parse(js);
    return getFunctionNode(root);
  }

  static Node getFunctionNode(Node n) {
    if (n.isFunction()) {
      return n;
    }
    for (Node c : n.children()) {
      Node result = getFunctionNode(c);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  static Node getNameNode(Node n, String name) {
    if (n.isName() && n.getString().equals(name)) {
      return n;
    }
    for (Node c : n.children()) {
      Node result = getNameNode(c, name);
      if (result != null) {
        return result;
      }
    }
    return null;
  }
}
