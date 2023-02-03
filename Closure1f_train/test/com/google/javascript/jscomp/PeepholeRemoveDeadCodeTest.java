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

import com.google.javascript.rhino.Node;

/**
 * Tests for PeepholeRemoveDeadCodeTest in isolation. Tests for the interaction
 * of multiple peephole passes are in PeepholeIntegrationTest.
 */
public class PeepholeRemoveDeadCodeTest extends CompilerTestCase {

  private static final String MATH =
      "/** @const */ var Math = {};" +
      "/** @nosideeffects */ Math.random = function(){};" +
      "/** @nosideeffects */ Math.sin = function(){};";

  public PeepholeRemoveDeadCodeTest() {
    super(MATH);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    enableLineNumberCheck(true);
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        SimpleDefinitionFinder definitionFinder =
            new SimpleDefinitionFinder(compiler);
        definitionFinder.process(externs, root);
        new PureFunctionIdentifier(compiler, definitionFinder)
            .process(externs, root);
        PeepholeOptimizationsPass peepholePass =
            new PeepholeOptimizationsPass(
                compiler, new PeepholeRemoveDeadCode());
        peepholePass.process(externs, root);
      }
    };
  }

  @Override
  protected int getNumRepetitions() {
    // Reduce this to 2 if we get better expression evaluators.
    return 2;
  }

  private void foldSame(String js) {
    testSame(js);
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }


public void testConstantConditionWithSideEffect147() { 
     fold("if (b=true) x=1;", "b=true;x=1"); 
     fold("if (b=/ab/) x=1;", "b=/ab/;x=1"); 
     fold("if (b=/ab/){ x=1; } else { x=2; }", "b=/ab/;x=1"); 
     fold("var b;b=/ab/;if(b)x=1;", "var b;b=/ab/;x=1"); 
     foldSame("var b;b=f();if(b)x=1;"); 
     fold("var b=/ab/;if(b)x=1;", "var b=/ab/;x=1"); 
     foldSame("var b=f();if(b)x=1;"); 
     foldSame("b=b++;if(b)x=b;"); 
     fold("(b=0,b=1);if(b)x=b;", "b=0,b=1;if(b)x=b;"); 
     fold("b=1;if(foo,b)x=b;", "b=1;x=b;"); 
     foldSame("b=1;if(foo=1,b)x=b;"); 
 } 


public void testHook7116() { 
     test("a() ? 1 : b()", "a() || b()"); 
 } 


public void testRemoveInControlStructure3321() { 
     test("for(1;2;3) 4", "for(;;);"); 
 } 


public void testFoldUselessDo332() { 
     fold("do { foo() } while(false);", "foo()"); 
     fold("do { foo() } while(void 0);", "foo()"); 
     fold("do { foo() } while(undefined);", "foo()"); 
     fold("do { foo() } while(true);", "do { foo() } while(true);"); 
     fold("do { var a = 0; } while(false);", "var a=0"); 
     fold("do { var a = 0; } while(!{a:foo()});", "var a=0;foo()"); 
     foldSame("do { foo(); continue; } while(0)"); 
     foldSame("do { foo(); break; } while(0)"); 
 } 


public void testNoRemoveThrow2389() { 
     testSame("function f(){throw a}"); 
 } 


public void testHook576() { 
     fold("true ? a() : b()", "a()"); 
     fold("false ? a() : b()", "b()"); 
     fold("a() ? b() : true", "a() && b()"); 
     fold("a() ? true : b()", "a() || b()"); 
     fold("(a = true) ? b() : c()", "a = true, b()"); 
     fold("(a = false) ? b() : c()", "a = false, c()"); 
     fold("do {f()} while((a = true) ? b() : c())", "do {f()} while((a = true) , b())"); 
     fold("do {f()} while((a = false) ? b() : c())", "do {f()} while((a = false) , c())"); 
     fold("var x = (true) ? 1 : 0", "var x=1"); 
     fold("var y = (true) ? ((false) ? 12 : (cond ? 1 : 2)) : 13", "var y=cond?1:2"); 
     foldSame("var z=x?void 0:y()"); 
     foldSame("z=x?void 0:y()"); 
     foldSame("z*=x?void 0:y()"); 
     foldSame("var z=x?y():void 0"); 
     foldSame("(w?x:void 0).y=z"); 
     foldSame("(w?x:void 0).y+=z"); 
     fold("y = (x ? void 0 : void 0)", "y = void 0"); 
     fold("y = (x ? f() : f())", "y = f()"); 
 } 


public void testIf650() { 
     fold("if (1){ x=1; } else { x = 2;}", "x=1"); 
     fold("if (false){ x = 1; } else { x = 2; }", "x=2"); 
     fold("if (undefined){ x = 1; } else { x = 2; }", "x=2"); 
     fold("if (null){ x = 1; } else { x = 2; }", "x=2"); 
     fold("if (void 0){ x = 1; } else { x = 2; }", "x=2"); 
     fold("if (void foo()){ x = 1; } else { x = 2; }", "foo();x=2"); 
     fold("if (false){ x = 1; } else if (true) { x = 3; } else { x = 2; }", "x=3"); 
     fold("if (x){ x = 1; } else if (false) { x = 3; }", "if(x)x=1"); 
 } 


public void testFoldUselessFor681() { 
     fold("for(;false;) { foo() }", ""); 
     fold("for(;void 0;) { foo() }", ""); 
     fold("for(;undefined;) { foo() }", ""); 
     fold("for(;true;) foo() ", "for(;;) foo() "); 
     foldSame("for(;;) foo()"); 
     fold("for(;false;) { var a = 0; }", "var a"); 
     fold("for(;false;) { foo(); continue }", ""); 
 } 


public void testRemovePrototypeGet1702() { 
     test("var a = {};a.prototype.b", "var a = {}"); 
 } 


public void testVarLifting736() { 
     fold("if(true)var a", "var a"); 
     fold("if(false)var a", "var a"); 
 } 


public void testRemoveFromLabel2889() { 
     test("LBL: foo() + 1 + bar()", "LBL: foo(),bar()"); 
 } 


public void testRemoveNamespaceGet2892() { 
     test("var a = {};a.b=1;a.b", "var a = {};a.b=1"); 
 } 


public void testRemoveFromLabel1933() { 
     test("LBL: void 0", "LBL: {}"); 
 } 


public void testHook61144() { 
     test("a() ? b() : 2", "a() && b()"); 
 } 


public void testFoldBlock1156() { 
     fold("{{foo()}}", "foo()"); 
     fold("{foo();{}}", "foo()"); 
     fold("{{foo()}{}}", "foo()"); 
     fold("{{foo()}{bar()}}", "foo();bar()"); 
     fold("{if(false)foo(); {bar()}}", "bar()"); 
     fold("{if(false)if(false)if(false)foo(); {bar()}}", "bar()"); 
     fold("{'hi'}", ""); 
     fold("{x==3}", ""); 
     fold("{ (function(){x++}) }", ""); 
     fold("function f(){return;}", "function f(){return;}"); 
     fold("function f(){return 3;}", "function f(){return 3}"); 
     fold("function f(){if(x)return; x=3; return; }", "function f(){if(x)return; x=3; return; }"); 
     fold("{x=3;;;y=2;;;}", "x=3;y=2"); 
     fold("while(x()){x}", "while(x());"); 
     fold("while(x()){x()}", "while(x())x()"); 
     fold("for(x=0;x<100;x++){x}", "for(x=0;x<100;x++);"); 
     fold("for(x in y){x}", "for(x in y);"); 
 } 


public void testTryCatchFinally1229() { 
     testSame("try {foo()} catch (e) {bar()}"); 
     testSame("try { try {foo()} catch (e) {bar()}} catch (x) {bar()}"); 
     test("try {var x = 1} finally {}", "var x = 1;"); 
     testSame("try {var x = 1} finally {x()}"); 
     test("function f() { return; try{var x = 1}finally{} }", "function f() { return; var x = 1; }"); 
     test("try {} finally {x()}", "x()"); 
     test("try {} catch (e) { bar()} finally {x()}", "x()"); 
     test("try {} catch (e) { bar()}", ""); 
     test("try {} catch (e) { var a = 0; } finally {x()}", "var a; x()"); 
     test("try {} catch (e) {}", ""); 
     test("try {} finally {}", ""); 
     test("try {} catch (e) {} finally {}", ""); 
 } 


public void testNoRemoveCall21288() { 
     test("a()+b()", "a(),b()"); 
 } 


public void testFoldUselessWhile1306() { 
     fold("while(false) { foo() }", ""); 
     fold("while(void 0) { foo() }", ""); 
     fold("while(undefined) { foo() }", ""); 
     foldSame("while(true) foo()"); 
     fold("while(false) { var a = 0; }", "var a"); 
     fold("while(false) { foo(); continue }", ""); 
     fold("while(0) { foo() }", ""); 
 } 


public void testShortCircuit21332() { 
     test("1 && a() && 2", "1 && a()"); 
 } 


public void testNoRemoveInherits41450() { 
     test("this.a = {}; var b = {}; b.inherits(a) + 1;", "this.a = {}; var b = {}; b.inherits(a)"); 
 } 


public void testFoldBlocksWithManyChildren1460() { 
     fold("function f() { if (false) {} }", "function f(){}"); 
     fold("function f() { { if (false) {} if (true) {} {} } }", "function f(){}"); 
     fold("{var x; var y; var z; function f() { { var a; { var b; } } } }", "var x;var y;var z;function f(){var a;var b}"); 
 } 


public void testRemoveInControlStructure21462() { 
     test("while(2) 1", "while(2);"); 
 } 


public void testHook81889() { 
     testSame("a() ? b() : c()"); 
 } 


public void testHook52034() { 
     test("a() ? 1 : 2", "a()"); 
 } 


public void testConstantConditionWithSideEffect22078() { 
     fold("(b=true)?x=1:x=2;", "b=true,x=1"); 
     fold("(b=false)?x=1:x=2;", "b=false,x=2"); 
     fold("if (b=/ab/) x=1;", "b=/ab/;x=1"); 
     fold("var b;b=/ab/;(b)?x=1:x=2;", "var b;b=/ab/;x=1"); 
     foldSame("var b;b=f();(b)?x=1:x=2;"); 
     fold("var b=/ab/;(b)?x=1:x=2;", "var b=/ab/;x=1"); 
     foldSame("var b=f();(b)?x=1:x=2;"); 
 } 


public void testFoldAssign2137() { 
     test("x=x", ""); 
     testSame("x=xy"); 
     testSame("x=x + 1"); 
     testSame("x.a=x.a"); 
     test("var y=(x=x)", "var y=x"); 
     test("y=1 + (x=x)", "y=1 + x"); 
 } 


public void testRemoveUselessOps2306() { 
     fold("Math.random()", ""); 
     fold("Math.random(f() + g())", "f(),g();"); 
     fold("Math.random(f(),g(),h())", "f(),g(),h();"); 
     foldSame("f();"); 
     foldSame("(function () { f(); })();"); 
     fold("(function () {})();", ""); 
     fold("(function () {});", ""); 
     fold("(function f() {});", ""); 
     fold("(function () {foo();});", ""); 
     fold("+f()", "f()"); 
     fold("a=(+f(),g())", "a=(f(),g())"); 
     fold("a=(true,g())", "a=g()"); 
     fold("f(),true", "f()"); 
     fold("f() + g()", "f(),g()"); 
     fold("for(;;+f()){}", "for(;;f()){}"); 
     fold("for(+f();;g()){}", "for(f();;g()){}"); 
     fold("for(;;Math.random(f(),g(),h())){}", "for(;;f(),g(),h()){}"); 
     fold("g() && +f()", "g() && f()"); 
     fold("g() || +f()", "g() || f()"); 
     fold("x ? g() : +f()", "x ? g() : f()"); 
     fold("+x()", "x()"); 
     fold("+x() * 2", "x()"); 
     fold("-(+x() * 2)", "x()"); 
     fold("2 -(+x() * 2)", "x()"); 
     fold("x().foo", "x()"); 
     foldSame("x().foo()"); 
     foldSame("x++"); 
     foldSame("++x"); 
     foldSame("x--"); 
     foldSame("--x"); 
     foldSame("x = 2"); 
     foldSame("x *= 2"); 
     foldSame("function f() {}"); 
     foldSame("var x;"); 
 } 


public void testNoSimplifyFunctionArgs32451() { 
     testSame("1 && foo(a() ? b() : 1 + c())"); 
 } 

  

  /** Try to remove spurious blocks with multiple children */
  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // TODO(johnlenz): Consider adding a post optimization pass to
  // convert OR into HOOK to save parentheses when the operator
  // precedents would require them.
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
