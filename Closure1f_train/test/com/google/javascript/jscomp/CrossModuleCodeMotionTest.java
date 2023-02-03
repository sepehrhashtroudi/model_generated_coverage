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

/**
 * Tests for {@link CrossModuleCodeMotion}.
 *
 */
public class CrossModuleCodeMotionTest extends CompilerTestCase {

  private static final String EXTERNS = "alert";

  public CrossModuleCodeMotionTest() {
    super(EXTERNS);
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(true);
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return new CrossModuleCodeMotion(compiler, compiler.getModuleGraph());
  }


public void testNoMoveSideEffectProperty149() { 
     testSame(createModuleChain("function Foo(){} " + "Foo.prototype.bar = createSomething();", "new Foo();")); 
 } 


public void testStubMethodMovement2438() { 
     test(createModuleChain("function Foo(){} " + "Foo.prototype.bar = JSCompiler_unstubMethod(x);", "new Foo();"), new String[] { "", "function Foo(){} " + "Foo.prototype.bar = JSCompiler_unstubMethod(x);" + "new Foo();" }); 
 } 


public void testClone1620() { 
     test(createModuleChain("function f(){} f.prototype.clone = function() { return new f };", "var a = (new f).clone();"), new String[] { "", "function f(){} f.prototype.clone = function() { return new f() };" + "var a = (new f).clone();" }); 
 } 


public void testAssignMovement701() { 
     test(createModuleChain("var f = 3;" + "f = 5;", "var h = f;"), new String[] { "", "var f = 3;" + "f = 5;" + "var h = f;" }); 
     testSame(createModuleChain("var f = 3;" + "var g = f = 5;", "var h = f;")); 
 } 


public void testFunctionMovement6704() { 
     JSModule[] modules = createModuleChain("function f(){return 1}", "var a = f();", "var b = f();"); 
     test(modules, new String[] { "", "function f(){return 1}" + "var a = f();", "var b = f();" }); 
 } 


public void testClassMovement2934() { 
     test(createModuleChain("function f(){} f.prototype.bar=3; f.prototype.baz=5;", "f.prototype.baq = 7;", "f.prototype.baz = 9;", "var a = new f();"), new String[] { "", "", "function f(){} f.prototype.bar=3; f.prototype.baz=5;" + "f.prototype.baq = 7;" + "f.prototype.baz = 9;", "var a = new f();" }); 
 } 


public void testLiteralMovement3965() { 
     test(createModuleChain("var f = ['hi', function() {}];", "var h = f;"), new String[] { "", "var f = ['hi', function() {}];" + "var h = f;" }); 
 } 


public void testVarMovement71238() { 
     testSame(createModuleStar("function f() {g();}", "function g(){};")); 
 } 


public void testLiteralMovement21579() { 
     testSame(createModuleChain("var f = {'hi': 'mom', 'bye': goog.nullFunction};", "var h = f;")); 
 } 


public void testFunctionMovement5b1801() { 
     JSModule[] modules = createModuleStar("var f = function(n){return (n<1)?1:f(n-1)};", "var a = f(4);"); 
     test(modules, new String[] { "", "var f = function(n){return (n<1)?1:f(n-1)};" + "var a = f(4);" }); 
 } 


public void testClassMovement61899() { 
     test(createModuleChain("function Foo(){} function Bar(){} goog.inherits(Bar, Foo);" + "new Foo();", "new Bar();"), new String[] { "function Foo(){} new Foo();", "function Bar(){} goog.inherits(Bar, Foo); new Bar();" }); 
 } 


public void testBug41180052018() { 
     testSame(createModuleChain("var m = 1;\n" + "(function () {\n" + " var x = 1;\n" + " m = function() { return x };\n" + "})();\n", "m();")); 
 } 


public void testFunctionNonMovement12031() { 
     testSame(createModuleStar("function f(){};f.prototype.bar=new f;" + "if(a)function f2(){}" + "{{while(a)function f3(){}}}", "var a = new f();f2();f3();")); 
 } 


public void testClassMovement12356() { 
     test(createModuleStar("function f(){} f.prototype.bar=function (){};", "var a = new f();"), new String[] { "", "function f(){} f.prototype.bar=function (){};" + "var a = new f();" }); 
 } 


public void testFunctionMovement52386() { 
     JSModule[] modules = createModuleStar("function f(n){return (n<1)?1:f(n-1)}", "var a = f(4);"); 
     test(modules, new String[] { "", "function f(n){return (n<1)?1:f(n-1)}" + "var a = f(4);" }); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  


  

  

  

  

  

  

  

  

  
}
