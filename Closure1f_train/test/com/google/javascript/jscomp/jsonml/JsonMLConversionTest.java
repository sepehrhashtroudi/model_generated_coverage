/*
 * Copyright 2010 The Closure Compiler Authors.
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

package com.google.javascript.jscomp.jsonml;

import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerPass;
import com.google.javascript.jscomp.CompilerTestCase;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.jsonml.Writer;
import com.google.javascript.jscomp.jsonml.JsonML;
import com.google.javascript.jscomp.jsonml.JsonMLAst;
import com.google.javascript.jscomp.jsonml.JsonMLUtil;

import com.google.javascript.rhino.Node;

import com.google.caja.parser.js.JsonMLParser;

/**
 * Tests for parsing JsonML to AST and vice versa.
 * @author dhans@google.com (Daniel Hans)
 *
 */
public class JsonMLConversionTest extends CompilerTestCase {

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return null; // unused
  }

  @Override
  public void setUp() {
    enableEcmaScript5(true);
  }

  private void testJsonMLToAstConversion(String js) throws Exception {
    JsonML jsonml = JsonMLParser.parse(js);
    Node root = parseExpectedJs(js);
    Node ast = root.getFirstChild();
    Preconditions.checkState(ast.getType() == Token.SCRIPT);

    testJsonMLToAstConversion(ast, jsonml, js);
  }

  private void testJsonMLToAstConversion(Node astRoot, JsonML jsonmlRoot,
      String js) {
    Compiler compiler = new Compiler();
    JsonMLAst ast = new JsonMLAst(jsonmlRoot);
    Node resultAstRoot = ast.getAstRoot(compiler);

    String explanation = resultAstRoot.checkTreeEquals(astRoot);
    assertNull("JsonML -> AST converter returned incorect result for " + js
       + "\n" + explanation, explanation);
  }

  private void testAstToJsonMLConverstion(Node astRoot, JsonML jsonmlRoot,
      String js) {
    JsonML resultJsonMLRoot = (new Writer()).processAst(astRoot);
    String explanation = JsonMLUtil.compare(resultJsonMLRoot, jsonmlRoot);
    assertNull("AST -> JsonML converter returned incorrect result for " + js +
        "\n" + explanation, explanation);
  }

  private void testConversion(String js) throws Exception {
    JsonML jsonml = JsonMLParser.parse(js);
    Node root = parseExpectedJs(js);
    Node ast = root.getFirstChild();
    Preconditions.checkState(ast.getType() == Token.SCRIPT);

    testJsonMLToAstConversion(ast, jsonml, js);

    jsonml = JsonMLParser.parse(js);
    testAstToJsonMLConverstion(ast, jsonml, js);
  }


public void testLogicalExpr110() throws Exception { 
     testConversion("a && b"); 
     testConversion("a || b"); 
     testConversion("a && b || c"); 
     testConversion("a && (b || c)"); 
     testConversion("f(x) && (function (x) {" + "return x % 2 == 0 })(z) || z % 3 == 0 ? true : false"); 
 } 


public void testUnaryExpressions239() throws Exception { 
     testConversion("!x"); 
     testConversion("!null"); 
     testConversion("!3.14"); 
     testConversion("!true"); 
     testConversion("~x"); 
     testConversion("~null"); 
     testConversion("~3.14"); 
     testConversion("~true"); 
     testConversion("+x"); 
     testConversion("+null"); 
     testConversion("+3.14"); 
     testConversion("+true"); 
     testConversion("-x"); 
     testConversion("-null"); 
     testConversion("-true"); 
     testConversion("!~+-z"); 
     testConversion("void x"); 
     testConversion("void null"); 
     testConversion("void void !x"); 
     testConversion("void (x + 1)"); 
 } 


public void testSwitch283() throws Exception { 
     testConversion("switch (x) {}"); 
     testConversion("switch (x) {case 'a':}"); 
     testConversion("switch (x) {case 'a':case 'b':}"); 
     testConversion("switch (x) {case 'a':case 'b': x}"); 
     testConversion("switch (x) {case 'a':case 'b': {;}}"); 
     testConversion("switch (x) {case 'a':case 'b': f()}"); 
     testConversion("switch (x) {case 'x': case 'y': {;} case 'a':case 'b': f()}"); 
     testConversion("switch (x) {case 'a': f(x)}"); 
     testConversion("switch (x) {case 'a': {f()} {g(x)}}"); 
     testConversion("switch (x) {case 'a': f(); g(x)}"); 
     testConversion("switch (x) {default: ;}"); 
     testConversion("switch (x) {default:case 'a': ;}"); 
     testConversion("switch (x) {case 'a':case'b':default: f()}"); 
     testConversion("switch (x) {default:f(x); g(); case 'a': ; case 'b': g(x)}"); 
     testConversion("switch (x) {case 'a': default: {f(x); g(z)} case 'b': g(x)}"); 
     testConversion("switch (x) {case x: {;}}"); 
 } 


public void testWith297() throws Exception { 
     testConversion("with ({}) {}"); 
     testConversion("with ({}) {;}"); 
     testConversion("with (x) {}"); 
     testConversion("with (x) {f(x)}"); 
     testConversion("with ({a: function f() {}}) {f(1)}"); 
     testConversion("with ({z: function f() {2 + 3; q = 2 + 3; var v = y * z;" + "g = function(a) {true; var b = a + 1; return a * a}}}) {f(1)}"); 
     testConversion("with (x in X) {x++}"); 
 } 


public void testObject419() throws Exception { 
     testConversion("x = {}"); 
     testConversion("var x = {}"); 
     testConversion("x = {x: 1, y: 2}"); 
     testConversion("x = {x: null}"); 
     testConversion("x = {a: function f() {}}"); 
     testConversion("x = {a: f()}"); 
     testConversion("x = {a: function f() {2 + 3; q = 2 + 3; var v = y * z; " + "g = function(a) {true; var b = a + 1; return a * a}}}"); 
     testConversion("x = {get a() {return 1}}"); 
     testConversion("x = {set a(b) {}}"); 
 } 


public void testTry492() throws Exception { 
     testConversion("try {} catch (e) {}"); 
     testConversion("try {;} catch (e) {;}"); 
     testConversion("try {var x = 0; y / x} catch (e) {f(e)}"); 
     testConversion("try {2 + 3; q = 2 + 3; var v = y * z; " + "g = function(a) {true; var b = a + 1; h(q); return a * a}; " + "h(q)} catch (e) {f(x)}"); 
     testConversion("try {} finally {}"); 
     testConversion("try {;} finally {;}"); 
     testConversion("try {var x = 0; y / x} finally {f(y)}"); 
     testConversion("try {2 + 3; q = 2 + 3; var v = y * z; " + "g = function(a) {true; var b = a + 1; h(q); return a * a}; " + "h(q)} finally {f(x)}"); 
     testConversion("try {} catch (e) {} finally {}"); 
     testConversion("try {;} catch (e) {;} finally {;}"); 
     testConversion("try {var x = 0; y / x} catch (e) {;} finally {;}"); 
     testConversion("try {2 + 3; q = 2 + 3; var v = y * z; " + "g = function(a) {true; var b = a + 1; h(q); return a * a}; h(q)} " + "catch (e) {f(x)} finally {f(x)}"); 
 } 


public void testDirectives601() throws Exception { 
     testConversion("'use strict'"); 
     testConversion("function foo() {'use strict'}"); 
     testConversion("'use strict'; function foo() {'use strict'}"); 
 } 


public void testDelete604() throws Exception { 
     testConversion("delete a"); 
     testConversion("delete a.x"); 
     testConversion("delete a[0]"); 
     testConversion("delete a.x[0]"); 
 } 


public void testReturnStatement627() throws Exception { 
     testConversion("x = function f() {return}"); 
     testConversion("x = function f() {return 1}"); 
     testConversion("x = function f() {return 2 + 3 / 4}"); 
     testConversion("x = function f() {return function() {}}"); 
     testConversion("x = function f() {var y = 2; " + "return function() {return y * 3}}"); 
     testConversion("x = function f() {z = 2 + 3; " + "return (function(z) {return z * y})(z)}"); 
 } 


public void testType673() throws Exception { 
     testConversion("undefined"); 
     testConversion("null"); 
     testConversion("0"); 
     testConversion("+0"); 
     testConversion("0.0"); 
     testConversion("3.14"); 
     testConversion("+3.14"); 
     testConversion("true"); 
     testConversion("false"); 
 } 


public void testThis712() throws Exception { 
     testConversion("this"); 
     testConversion("var x = this"); 
     testConversion("this.foo()"); 
     testConversion("var x = this.foo()"); 
     testConversion("this.bar"); 
     testConversion("var x = this.bar()"); 
     testConversion("switch(this) {}"); 
     testConversion("x + this"); 
 } 


public void testRegExp723() throws Exception { 
     testConversion("/ab/"); 
     testConversion("/ab/g"); 
     testConversion("x = /ab/"); 
     testConversion("x = /ab/g"); 
     testConversion("var x = /ab/"); 
     testConversion("var x = /ab/g"); 
     testConversion("function f() {" + "/ab/; var x = /ab/; (function g() {/ab/; var x = /ab/})()}"); 
     testConversion("var f = function () {return /ab/g;}"); 
 } 


public void testThrow741() throws Exception { 
     testConversion("throw e"); 
     testConversion("throw 2 + 3 * 4"); 
     testConversion("throw (function () {2 + 3; q = 2 + 3; var v = y * z; " + "g = function(a) {true; var b = a + 1; return a * a}})()"); 
     testConversion("throw f(x)"); 
     testConversion("throw f(f(f(x)))"); 
     testConversion("throw (f(f(x), y))()"); 
 } 


public void testNew756() throws Exception { 
     testConversion("new A"); 
     testConversion("new A()"); 
     testConversion("new A(x, y, z)"); 
     testConversion("new A(f(x), g(y), h(z))"); 
     testConversion("new A(x, new B(x, y), z)"); 
     testConversion("new A(1), new B()"); 
     testConversion("new A, B"); 
     testConversion("x = new A(a)"); 
     testConversion("var x = new A(a, b)"); 
     testConversion("var x = new A(1), y = new B()"); 
 } 


public void testArray1773() throws Exception { 
     testConversion("[,]"); 
 } 


public void testFunctions833() throws Exception { 
     testConversion("(function () {})"); 
     testConversion("(function (x, y) {})"); 
     testConversion("(function () {})()"); 
     testConversion("(function (x, y) {})()"); 
     testConversion("[ function f() {} ]"); 
     testConversion("var f = function f() {};"); 
     testConversion("for (function f() {};true;) {}"); 
     testConversion("x = (function (x, y) {})"); 
     testConversion("function f() {}"); 
     testConversion("for (;true;) { function f() {} }"); 
     testConversion("function f() {;}"); 
     testConversion("function f() {x}"); 
     testConversion("function f() {x;y;z}"); 
     testConversion("function f() {{}}"); 
 } 


public void testCalls843() throws Exception { 
     testConversion("f()"); 
     testConversion("f(1)"); 
     testConversion("f('a')"); 
     testConversion("f(true)"); 
     testConversion("f(null)"); 
     testConversion("f(undefined)"); 
     testConversion("f(a + b)"); 
     testConversion("f(g(h(a)) * h(g(u(z('a')))))"); 
     testConversion("x = f()"); 
     testConversion("x = f(1)"); 
     testConversion("x = f(a + b)"); 
     testConversion("x = f(g(h(a)) * h(g(u(z('a')))))"); 
     testConversion("String('a')"); 
     testConversion("Number(1)"); 
     testConversion("Boolean(0)"); 
     testConversion("Object()"); 
     testConversion("Array('a', 1, false, null, Object(), String('a'))"); 
     testConversion("(function() {})()"); 
     testConversion("(function(x) {})(x)"); 
     testConversion("(function(x) {var y = x << 1; return y})(x)"); 
     testConversion("(function(x) {y = x << 1; return y})(x)"); 
     testConversion("var x = (function(x) {y = x << 1; return y})(x)"); 
     testConversion("var x = (function(x) {return x << 1})(x)"); 
     testConversion("eval()"); 
     testConversion("eval('x')"); 
     testConversion("x = eval('x')"); 
     testConversion("var x = eval('x')"); 
     testConversion("eval(Template('foo${bar}baz')); var Template;"); 
     testConversion("a.x()"); 
     testConversion("a[x]()"); 
     testConversion("z = a.x()"); 
     testConversion("var z = a.x()"); 
     testConversion("z = a[x]()"); 
     testConversion("z = a['x']()"); 
     testConversion("var z = a[x]()"); 
     testConversion("var z = a['x']()"); 
     testConversion("a.x(y)"); 
     testConversion("a[x](y)"); 
     testConversion("a['x'](y)"); 
     testConversion("a[x](y, z, 'a', null, true, f(y))"); 
     testConversion("a['x'](y, z, 'a', null, true, f(y))"); 
     testConversion("a[b[c[d]]()].x"); 
     testConversion("(f())()"); 
     testConversion("(f(x))(y)"); 
     testConversion("(f = getFn())()"); 
 } 


public void testAssignOperators864() throws Exception { 
     testConversion("x += 1, x -= 1, x *= 1, x /= 1, x %= 1"); 
     testConversion("x |= 1, x ^= x, x &= 0"); 
     testConversion("x <<= 1, x >>= 1, x >>>= 1"); 
     testConversion("y = x += 1"); 
 } 


public void testWhile901() throws Exception { 
     testConversion("while (true) {;}"); 
     testConversion("while (true) {f()}"); 
     testConversion("while (f(x, y)) {break;}"); 
     testConversion("while (f(f(f(x, y)))) {}"); 
     testConversion("while ((f(f(f(x, y))))()) {}"); 
     testConversion("while (x--) {2 + 3; q = 2 + 3; var v = y * z; " + "g = function(a) {true; var b = a + 1; return a * a}}"); 
 } 


public void testOperators1047() throws Exception { 
     testConversion("x instanceof Null"); 
     testConversion("!x instanceof A"); 
     testConversion("!(x instanceof A)"); 
     testConversion("'a' in x"); 
     testConversion("if('a' in x) {f(x)}"); 
     testConversion("undefined in A"); 
     testConversion("!(Number(1) in [2, 3, 4])"); 
     testConversion("true ? x : y"); 
     testConversion("(function() {var y = 2 + 3 * 4; return y >> 1})() ? x : y"); 
 } 


public void testTypeof1057() throws Exception { 
     testConversion("typeof undefined"); 
     testConversion("typeof null"); 
     testConversion("typeof 1"); 
     testConversion("typeof 'a'"); 
     testConversion("typeof false"); 
     testConversion("typeof Null()"); 
     testConversion("typeof Number(1)"); 
     testConversion("typeof String('a')"); 
     testConversion("typeof Boolean(0)"); 
     testConversion("typeof x"); 
     testConversion("typeof new A()"); 
     testConversion("typeof new A(x)"); 
     testConversion("typeof f(x)"); 
     testConversion("typeof (function() {})()"); 
     testConversion("typeof 2 + 3 * 4"); 
     testConversion("typeof typeof x"); 
     testConversion("typeof typeof typeof x"); 
 } 


public void testForIn1179() throws Exception { 
     testConversion("for (var i in x) {}"); 
     testConversion("for (var i in x) {;}"); 
     testConversion("for (var i in x) {f(x)}"); 
     testConversion("s: for(var i in x) {if (i > 5) {break s}}"); 
     testConversion("for (var i in x) {if (i % 2) {" + "continue} else {var x = i / 3; f(x)}}"); 
     testConversion("for (var i in x) {2 + 3; q = 2 + 3; var v = y * z; " + "g = function(a) {true; var b = a + 1; return a * a}}"); 
     testConversion("for (i in x) {}"); 
     testConversion("for (i in x) {;}"); 
     testConversion("for (i in x) {f(x)}"); 
     testConversion("s: for (i in x) {if (i > 5) {break s}}"); 
     testConversion("for (i in x) {if (i % 2) {" + "continue} else {var x = i / 3; f(x)}}"); 
     testConversion("for (i in x) {2 + 3; q = 2 + 3; var v = y * z; " + "g = function(a) {true; var b = a + 1; return a * a}}"); 
 } 


public void testDoWhile1334() throws Exception { 
     testConversion("do {} while (true)"); 
     testConversion("do {;} while (true)"); 
     testConversion("do {} while (f(x, y))"); 
     testConversion("do {} while (f(f(f(x, y))))"); 
     testConversion("do {} while ((f(f(f(x, y))))())"); 
     testConversion("do {2 + 3; q = 2 + 3; var v = y * z;" + "g = function(a) {true; var b = a + 1; return a * a}} while (--x)"); 
 } 


public void testLabels2092() throws Exception { 
     testConversion("s: ;"); 
     testConversion("s: {;}"); 
     testConversion("s: while(true) {;}"); 
     testConversion("s: switch (x) {case 'a': break s;}"); 
 } 

  

  

  

  

  
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
