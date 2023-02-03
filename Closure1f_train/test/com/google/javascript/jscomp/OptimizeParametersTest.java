/*
 * Copyright 2009 The Closure Compiler Authors.
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

/**
 * Tests for {@link OptimizeParameters}
 *
 */
public class OptimizeParametersTest extends CompilerTestCase {
  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return new OptimizeParameters(compiler);
  }

  @Override
  public void setUp() {
    super.enableNormalize();
    super.enableLineNumberCheck(false);
  }


public void testNoRemoval240() { 
     testSame("function foo(p1) { } foo(1); foo(2)"); 
     testSame("function foo(p1) { } foo(1,2); foo(3,4)"); 
 } 


public void testMultipleUnknown373() { 
     String src = "var goog1 = {};" + "goog1.foo = function () { };" + "var goog2 = {};" + "goog2.foo = function (p1) { };" + "var x = getGoog();" + "x.foo()"; 
     String expected = "var goog1 = {};" + "goog1.foo = function () { };" + "var goog2 = {};" + "goog2.foo = function () { var p1 };" + "var x = getGoog();" + "x.foo()"; 
     testSame(src); 
 } 


public void testMutableValues4501() { 
     testSame("var x; var y; var z;" + "function foo(p1, p2, p3) {}" + "foo(x(), y(), z()); foo(x(),y(),3)"); 
     testSame("var x; var y; var z;" + "function foo(p1, p2, p3) {}" + "foo(x, y(), z()); foo(x,y(),3)"); 
     test("var x; var y; var z;" + "function foo(p1, p2, p3) {}" + "foo([], y(), z()); foo([],y(),3)", "var x; var y; var z;" + "function foo(p2, p3) {var p1=[]}" + "foo(y(), z()); foo(y(),3)"); 
 } 


public void testSimpleRemoval538() { 
     test("function foo(p1) { } foo(); foo()", "function foo() {var p1;} foo(); foo()"); 
     test("function foo(p1) { } foo(1); foo(1)", "function foo() {var p1 = 1;} foo(); foo()"); 
     test("function foo(p1) { } foo(1,2); foo(1,4)", "function foo() {var p1 = 1;} foo(2); foo(4)"); 
 } 


public void testNoArgumentRemovalNonEqualNodes653() { 
     testSame("function foo(a){}; foo('bar'); foo('baz');"); 
     testSame("function foo(a){}; foo(1.0); foo(2.0);"); 
     testSame("function foo(a){}; foo(true); foo(false);"); 
     testSame("var a = 1, b = 2; function foo(a){}; foo(a); foo(b);"); 
     testSame("function foo(a){}; foo(/&/g); foo(/</g);"); 
 } 


public void testOptimizeThis1088() { 
     String src = "function foo() {" + "var bar = function (a, b) {};" + "this.bar = function (a, b) {};" + "this.bar(3);" + "bar(2);}"; 
     String expected = "function foo() {" + "var bar = function () {var b; var a = 2;};" + "this.bar = function () {var b; var a = 3;};" + "this.bar();" + "bar();}"; 
     test(src, expected); 
 } 


public void testDoNotOptimizeWhenArgumentsPassedAsParameter1185() { 
     testSame("function foo(a) {}; foo(arguments)"); 
     testSame("function foo(a) {}; foo(arguments[0])"); 
     test("function foo(a, b) {}; foo(arguments, 1)", "function foo(a) {var b = 1}; foo(arguments)"); 
     test("function foo(a, b) {}; foo(arguments)", "function foo(a) {var b}; foo(arguments)"); 
 } 


public void testRemoveConstantArgument1205() { 
     test("function foo(p1, p2) {}; foo(1,2); foo(2,2);", "function foo(p1) {var p2 = 2}; foo(1); foo(2)"); 
     testSame("function foo(p1, p2) {}; foo(1); foo(2,3);"); 
     test("function foo(a,b,c){}; foo(1, 2, 3); foo(1, 2, 4); foo(2, 2, 3)", "function foo(a,c){var b=2}; foo(1, 3); foo(1, 4); foo(2, 3)"); 
     test("function foo(a) {}; foo(1); foo(1.0);", "function foo() {var a = 1;}; foo(); foo();"); 
     String src = "/** @constructor */" + "function Person(){}; Person.prototype.run = function(a, b) {};" + "Person.run(1, 'a'); Person.run(2, 'a')"; 
     String expected = "function Person(){}; Person.prototype.run = " + "function(a) {var b = 'a'};" + "Person.run(1); Person.run(2)"; 
     test(src, expected); 
 } 


public void testShadows1308() { 
     testSame("function foo(a) {}" + "var x;" + "function f() {" + "  var x;" + "  function g() {" + "    foo(x());" + "  }" + "};" + "foo(x())"); 
 } 


public void testMutableValues11319() { 
     test("function foo(p1) {} foo()", "function foo() {var p1} foo()"); 
     test("function foo(p1) {} foo(1)", "function foo() {var p1=1} foo()"); 
     test("function foo(p1) {} foo([])", "function foo() {var p1=[]} foo()"); 
     test("function foo(p1) {} foo({})", "function foo() {var p1={}} foo()"); 
     test("var x;function foo(p1) {} foo(x)", "var x;function foo() {var p1=x} foo()"); 
     test("var x;function foo(p1) {} foo(x())", "var x;function foo() {var p1=x()} foo()"); 
     test("var x;function foo(p1) {} foo(new x())", "var x;function foo() {var p1=new x()} foo()"); 
     test("var x;function foo(p1) {} foo('' + x)", "var x;function foo() {var p1='' + x} foo()"); 
     testSame("function foo(p1) {} foo(this)"); 
     testSame("function foo(p1) {} foo(arguments)"); 
     testSame("function foo(p1) {} foo(function(){})"); 
     testSame("function foo(p1) {} (function () {var x;foo(x)})()"); 
 } 


public void testOptimizeOnlyImmutableValues1365() { 
     test("function foo(a) {}; foo(undefined);", "function foo() {var a = undefined}; foo()"); 
     test("function foo(a) {}; foo(null);", "function foo() {var a = null}; foo()"); 
     test("function foo(a) {}; foo(1);", "function foo() {var a = 1}; foo()"); 
     test("function foo(a) {}; foo('abc');", "function foo() {var a = 'abc'}; foo()"); 
     test("var foo = function(a) {}; foo(undefined);", "var foo = function() {var a = undefined}; foo()"); 
     test("var foo = function(a) {}; foo(null);", "var foo = function() {var a = null}; foo()"); 
     test("var foo = function(a) {}; foo(1);", "var foo = function() {var a = 1}; foo()"); 
     test("var foo = function(a) {}; foo('abc');", "var foo = function() {var a = 'abc'}; foo()"); 
 } 


public void testNoOptimizationForExternsFunctions1791() { 
     testSame("function _foo(x, y, z){}; _foo(1);"); 
 } 


public void testDoNotOptimizeJSCompiler_renameProperty1805() { 
     testSame("function JSCompiler_renameProperty(a) {return a};" + "JSCompiler_renameProperty('a');"); 
 } 


public void testMutableValues52061() { 
     test("var x; var y; var z;" + "function foo(p1, p2) {}" + "new foo(new x(), y()); new foo(new x(),y())", "var x; var y; var z;" + "function foo() {var p1=new x(); var p2=y()}" + "new foo(); new foo()"); 
     test("var x; var y; var z;" + "function foo(p1, p2) {}" + "new foo(x(), y()); new foo(x(),y())", "var x; var y; var z;" + "function foo() {var p1=x(); var p2=y()}" + "new foo(); new foo()"); 
     testSame("var x; var y; var z;" + "function foo(p1, p2, p3) {}" + "new foo(x(), y(), z()); new foo(x(),y(),3)"); 
     testSame("var x; var y; var z;" + "function foo(p1, p2, p3) {}" + "new foo(x, y(), z()); new foo(x,y(),3)"); 
     test("var x; var y; var z;" + "function foo(p1, p2, p3) {}" + "new foo([], y(), z()); new foo([],y(),3)", "var x; var y; var z;" + "function foo(p2, p3) {var p1=[]}" + "new foo(y(), z()); new foo(y(),3)"); 
 } 


public void testNamelessParameter22167() { 
     test("f(g(),h()); function f(){}", "f(); function f(){g();h()}"); 
 } 


public void testAliasMethodsDontGetOptimize22193() { 
     String src = "var foo = function(a, b) {};" + "var bar = foo;" + "foo(1);" + "bar(2,3);"; 
     testSame(src); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
