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

/**
 * Tests for the interaction between multiple peephole passes.
 */
public class PeepholeIntegrationTest extends CompilerTestCase {

  private boolean late = true;

  // TODO(user): Remove this when we no longer need to do string comparison.
  private PeepholeIntegrationTest(boolean compareAsTree) {
    super("", compareAsTree);
  }

  public PeepholeIntegrationTest() {
    super("");
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    this.late = false;
    enableLineNumberCheck(true);

    // TODO(nicksantos): Turn this on. There are some normalizations
    // that cause weirdness here.
    disableNormalize();
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    PeepholeOptimizationsPass peepholePass =
      new PeepholeOptimizationsPass(compiler,
        new PeepholeSubstituteAlternateSyntax(late),
        new PeepholeRemoveDeadCode(),
        new PeepholeFoldConstants(late)
      );

    return peepholePass;
  }

  @Override
  protected int getNumRepetitions() {
    // Reduce this to 2 if we get better expression evaluators.
    return 4;
  }

  private void foldSame(String js) {
    testSame(js);
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }

  // TODO(user): This is same as fold() except it uses string comparison. Any
  // test that needs tell us where a folding is constructing an invalid AST.
  private void assertResultString(String js, String expected) {
    PeepholeIntegrationTest scTest = new PeepholeIntegrationTest(false);

    scTest.disableNormalize();

    scTest.test(js, expected);
  }


public void testFoldBitwiseOpStringCompareIntegration88() { 
     assertResultString("while(-1 | 0){}", "while(1);"); 
 } 


public void testFoldOneChildBlocksIntegration219() { 
     fold("function f(){switch(foo()){default:{break}}}", "function f(){foo()}"); 
     fold("function f(){switch(x){default:{break}}}", "function f(){}"); 
     fold("function f(){switch(x){default:x;case 1:return 2}}", "function f(){switch(x){default:case 1:return 2}}"); 
     fold("if(x){if(true){foo();foo()}else{bar();bar()}}", "if(x){foo();foo()}"); 
     fold("if(x){if(false){foo();foo()}else{bar();bar()}}", "if(x){bar();bar()}"); 
     fold("if(x()){}", "x()"); 
     fold("if(x()){} else {x()}", "x()||x()"); 
     fold("if(x){}", ""); 
     fold("if(a()){A()} else if (b()) {} else {C()}", "a()?A():b()||C()"); 
     fold("if(a()){} else if (b()) {} else {C()}", "a()||b()||C()"); 
     fold("if(a()){A()} else if (b()) {} else if (c()) {} else{D()}", "a()?A():b()||c()||D()"); 
     fold("if(a()){} else if (b()) {} else if (c()) {} else{D()}", "a()||b()||c()||D()"); 
     fold("if(a()){A()} else if (b()) {} else if (c()) {} else{}", "a()?A():b()||c()"); 
     fold("function foo(){if(x()){}}", "function foo(){x()}"); 
 } 


public void testFoldUselessDoIntegration1250() { 
     test("do { foo() } while(!true);", "foo()"); 
     fold("do { foo() } while(void 0);", "foo()"); 
     fold("do { foo() } while(undefined);", "foo()"); 
     fold("do { foo() } while(!void 0);", "do { foo() } while(1);"); 
     test("if(foo())do {foo()} while(false) else bar()", "foo()?foo():bar()"); 
 } 


public void testFoldLogicalOpIntegration1516() { 
     test("if(x && true) z()", "x&&z()"); 
     test("if(x && false) z()", ""); 
     fold("if(x || 3) z()", "z()"); 
     fold("if(x || false) z()", "x&&z()"); 
     test("if(x==y && false) z()", ""); 
     fold("if(y() || x || 3) z()", "(y()||1)&&z()"); 
 } 


public void testNoNormalizeLabeledExpr2381() { 
     enableNormalize(true); 
     foldSame("var x; foo:{x = 3;}"); 
     foldSame("var x; foo:x = 3;"); 
 } 


public void testCommaSplitingConstantCondition2387() { 
     late = false; 
     fold("(b=0,b=1);if(b)x=b;", "b=0;b=1;x=b;"); 
     fold("(b=0,b=1);if(b)x=b;", "b=0;b=1;x=b;"); 
 } 

  

  /** Check that removing blocks with 1 child works */
  

  

  /** Test a particularly hairy edge case. */
  

  /** Try to minimize returns */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
