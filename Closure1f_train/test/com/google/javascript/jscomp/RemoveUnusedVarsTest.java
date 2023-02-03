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


public class RemoveUnusedVarsTest extends CompilerTestCase {

  private boolean removeGlobal;
  private boolean preserveFunctionExpressionNames;
  private boolean modifyCallSites;

  public RemoveUnusedVarsTest() {
    super("function alert() {}");
    enableNormalize();
  }

  @Override
  public void setUp() {
    removeGlobal = true;
    preserveFunctionExpressionNames = false;
    modifyCallSites = false;
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new RemoveUnusedVars(
        compiler, removeGlobal, preserveFunctionExpressionNames,
        modifyCallSites);
  }


public void testCallSiteInteraction178() { 
     this.modifyCallSites = true; 
     testSame("var b=function(){return};b()"); 
     testSame("var b=function(c){return c};b(1)"); 
     test("var b=function(c){};b.call(null, x)", "var b=function(){};b.call(null)"); 
     test("var b=function(c){};b.apply(null, x)", "var b=function(){};b.apply(null, x)"); 
     test("var b=function(c){return};b(1)", "var b=function(){return};b()"); 
     test("var b=function(c){return};b(1,2)", "var b=function(){return};b()"); 
     test("var b=function(c){return};b(1,2);b(3,4)", "var b=function(){return};b();b()"); 
     test("var b=function(c,d){return d};b(1,2);b(3,4);b.length", "var b=function(c,d){return d};b(0,2);b(0,4);b.length"); 
     test("var b=function(c){return};b(1,2);b(3,new x())", "var b=function(){return};b();b(new x())"); 
     test("var b=function(c){return};b(1,2);b(new x(),4)", "var b=function(){return};b();b(new x())"); 
     test("var b=function(c,d){return d};b(1,2);b(new x(),4)", "var b=function(c,d){return d};b(0,2);b(new x(),4)"); 
     test("var b=function(c,d,e){return d};b(1,2,3);b(new x(),4,new x())", "var b=function(c,d){return d};b(0,2);b(new x(),4,new x())"); 
     test("var b=function(c,d){b(1,2);return d};b(3,4);b(5,6)", "var b=function(d){b(2);return d};b(4);b(6)"); 
     testSame("var b=function(c){return arguments};b(1,2);b(3,4)"); 
     test("var b=function(c,d){return};b(1,2)", "var b=function(){return};b()"); 
     testSame("var b=function(c,d){return c+d};b(1,2)"); 
     test("var b=function(e,f,c,d){return c+d};b(1,2)", "var b=function(c,d){return c+d};b()"); 
     test("var b=function(c,d,e,f){return c+d};b(1,2)", "var b=function(c,d){return c+d};b(1,2)"); 
     test("var b=function(e,c,f,d,g){return c+d};b(1,2)", "var b=function(c,d){return c+d};b(2)"); 
     test("var b=function(c,d){};var b=function(e,f){};b(1,2)", "var b=function(){};var b=function(){};b(1,2)"); 
 } 


public void testRemoveInheritedClass10222() { 
     test("function goog$inherits(){}" + "/**@constructor*/function a(){}" + "/**@constructor*/function b(){}" + "goog$inherits(b,a); new a;" + "var c = a; var d = a.g; new b", "function goog$inherits(){}" + "function a(){} function b(){} goog$inherits(b,a); new a; new b"); 
 } 


public void testUnusedPropAssign1b246() { 
     test("var x = {}; x.foo = alert();", "alert()"); 
 } 


public void testVarInControlStructure443() { 
     test("if (true) var b = 3;", "if(true);"); 
     test("if (true) var b = 3; else var c = 5;", "if(true);else;"); 
     test("while (true) var b = 3;", "while(true);"); 
     test("for (;;) var b = 3;", "for(;;);"); 
     test("do var b = 3; while(true)", "do;while(true)"); 
     test("with (true) var b = 3;", "with(true);"); 
     test("f: var b = 3;", "f:{}"); 
 } 


public void testNestedAssign1728() { 
     test("var b = null; var a = (b = 3); alert(a);", "var a = 3; alert(a);"); 
 } 


public void testRemoveUnusedVarsPossibleNpeCase812() { 
     this.modifyCallSites = true; 
     test("var a = [];" + "var register = function(callback) {a[0] = callback};" + "register(function(transformer) {});" + "register(function(transformer) {});", "var register=function(){};register();register()"); 
 } 


public void testUsedPropAssign4877() { 
     test("var y = foo(); var x = {}; x.foo = 3; y[x.foo] = 5;", "var y=foo();var x={};x.foo=3;y[x.foo]=5"); 
 } 


public void testRemoveInheritedClass3998() { 
     testSame("/**@constructor*/function a(){}" + "/**@constructor*/function b(){}" + "goog$inherits(b,a); new b"); 
 } 


public void testDoNotOptimizeJSCompiler_renameProperty1145() { 
     this.modifyCallSites = true; 
     test("function JSCompiler_renameProperty(a) {};" + "JSCompiler_renameProperty('a');", "function JSCompiler_renameProperty() {};" + "JSCompiler_renameProperty('a');"); 
 } 


public void testDependencies1b1150() { 
     test("var a = 3; var b = alert(function() { alert(a); });", "var a=3;alert(function(){alert(a)})"); 
 } 


public void testDoNotOptimizeSetters1195() { 
     testSame("({set s(a) {}})"); 
 } 


public void testReflectedMethods1233() { 
     this.modifyCallSites = true; 
     testSame("/** @constructor */" + "function Foo() {}" + "Foo.prototype.handle = function(x, y) { alert(y); };" + "var x = goog.reflect.object(Foo, {handle: 1});" + "for (var i in x) { x[i].call(x); }" + "window['Foo'] = Foo;"); 
 } 


public void testUnusedPropAssign2b1347() { 
     test("var x = {}; x[alert()] = alert();", "alert(),alert()"); 
 } 


public void testRemoveSingletonClass11499() { 
     test("function goog$addSingletonGetter(a){}" + "/**@constructor*/function a(){}" + "goog$addSingletonGetter(a);", ""); 
 } 


public void testCallSiteInteraction_contructors1677() { 
     this.modifyCallSites = true; 
     test("var Ctor1=function(a,b){return a};" + "var Ctor2=function(a,b){Ctor1.call(this,a,b)};" + "goog$inherits(Ctor2, Ctor1);" + "new Ctor2(1,2)", "var Ctor1=function(a){return a};" + "var Ctor2=function(a){Ctor1.call(this,a)};" + "goog$inherits(Ctor2, Ctor1);" + "new Ctor2(1)"); 
 } 


public void testUnusedPropAssign61678() { 
     test("var x = function() {}; x.prototype.bar = function() {};", ""); 
 } 


public void testUnusedAssign52037() { 
     test("var z = function f() { f = 3; }; z();", "var z=function(){};z()"); 
 } 


public void testRemoveInheritedClass72043() { 
     test("function goog$mixin(){}" + "/**@constructor*/function a(){alert(goog$mixin(a, a))}" + "/**@constructor*/function b(){}" + "goog$mixin(b.prototype,a.prototype); new a", "function goog$mixin(){}" + "function a(){alert(goog$mixin(a, a))} new a"); 
 } 


public void testUnusedAssign12074() { 
     test("var x = 3; x = 5;", ""); 
 } 


public void testUsedPropAssign92117() { 
     testSame("var x = {}; x.foo = newNodeInDom(doc); x.foo.innerHTML = 'new test';"); 
 } 


public void testIssue618_22145() { 
     this.removeGlobal = false; 
     testSame("var b;\n" + "a.push(b = []);\n" + "b[0] = 1;\n"); 
 } 


public void testRemoveUnusedVars2208() { 
     test("var a;var b=3;var c=function(){};var x=A();var y; var z;" + "function A(){B()} function B(){C(b)} function C(){} " + "function X(){Y()} function Y(z){Z(x)} function Z(){y} " + "P=function(){A()}; " + "try{0}catch(e){a}", "var a;var b=3;A();function A(){B()}" + "function B(){C(b)}" + "function C(){}" + "P=function(){A()}" + ";try{0}catch(e){a}"); 
     test("var i=0;var j=0;if(i>0){var k=1;}", "var i=0;if(i>0);"); 
     test("for (var i in booyah) {" + "  if (i > 0) x += ', ';" + "  var arg = 'foo';" + "  if (arg.length > 40) {" + "    var unused = 'bar';" + "    arg = arg.substr(0, 40) + '...';" + "  }" + "  x += arg;" + "}", "for(var i in booyah){if(i>0)x+=\", \";" + "var arg=\"foo\";if(arg.length>40)arg=arg.substr(0,40)+\"...\";" + "x+=arg}"); 
     test("function A(){}" + "if(0){function B(){}}win.setTimeout(function(){A()})", "function A(){}" + "if(0);win.setTimeout(function(){A()})"); 
     test("function A(){A()}function B(){B()}B()", "function B(){B()}B()"); 
     test("var x,y=2,z=3;A(x);B(z);var a,b,c=4;C()", "var x,z=3;A(x);B(z);C()"); 
     test("for(var i=0,j=0;i<10;){}" + "for(var x=0,y=0;;y++){}" + "for(var a,b;;){a}" + "for(var c,d;;);" + "for(var item in items){}", "for(var i=0;i<10;);" + "for(var y=0;;y++);" + "for(var a;;)a;" + "for(;;);" + "for(var item in items);"); 
     test("var a,b,c,d;var e=[b,c];var x=e[3];var f=[d];print(f[0])", "var d;var f=[d];print(f[0])"); 
     test("var x;function A(){var x;B()}function B(){print(x)}A()", "var x;function A(){B()}function B(){print(x)}A()"); 
     test("function A(){var x;return function(){print(x)}}A()", "function A(){var x;return function(){print(x)}}A()"); 
     test("function A(){}function B(){" + "var c,d,e,f,g,h;" + "function C(){print(c)}" + "var handler=function(){print(d)};" + "var handler2=function(){handler()};" + "e=function(){print(e)};" + "if(1){function G(){print(g)}}" + "arr=[function(){print(h)}];" + "return function(){print(f)}}B()", "function B(){" + "var f,h;" + "if(1);" + "arr=[function(){print(h)}];" + "return function(){print(f)}}B()"); 
     test("var a,b=1; function _A1() {this.foo(a)}", "var a;function _A1(){this.foo(a)}"); 
     test("undefinedVar = 1", "undefinedVar=1"); 
     test("var a,b=foo(),c=i++,d;var e=boo();var f;print(d);", "foo(); i++; var d; boo(); print(d)"); 
     test("var a,b=foo()", "foo()"); 
     test("var b=foo(),a", "foo()"); 
     test("var a,b=foo(a)", "var a; foo(a);"); 
 } 


public void testNestedAssign32431() { 
     test("var b = 0; var z; z = z = b = 1; alert(b);", "var b = 0; b = 1; alert(b);"); 
 } 


public void testIssue168b2448() { 
     removeGlobal = false; 
     test("function a(){" + "  (function(x){ b(); })(1);" + "}" + "function b(){" + "  a();" + "}", "function a(){(function(x){b()})(1)}" + "function b(){a()}"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
