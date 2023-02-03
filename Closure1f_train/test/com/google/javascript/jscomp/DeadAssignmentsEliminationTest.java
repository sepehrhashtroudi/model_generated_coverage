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

import com.google.javascript.rhino.Node;

/**
 * Tests for {@link DeadAssignmentsElimination}.
 *
 */
public class DeadAssignmentsEliminationTest extends CompilerTestCase {

  public DeadAssignmentsEliminationTest() {
    super("var extern;");
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(true);
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node js) {
        NodeTraversal.traverse(
            compiler, js, new DeadAssignmentsElimination(compiler));
      }
    };
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }


public void testIssue297g181() { 
     test("function f(a) {" + " var b = h((b=1) - (b = g(b)));" + " return b;" + "};", "function f(a) {" + " var b = h((b=1) - (b = g(b)));" + " return b;" + "};"); 
 } 


public void testForIn298() { 
     inFunction("var x = {}; for (var y in x) { y() }"); 
     inFunction("var x, y, z; x = {}; z = {}; for (y in x = z) { y() }", "var x, y, z;   ({}); z = {}; for (y in z)     { y() }"); 
     inFunction("var x, y, z; x = {}; z = {}; for (y[z=1] in z) { y() }", "var x, y, z;   ({}); z = {}; for (y[z=1] in z) { y() }"); 
     inFunction("var x, y, z; x = {}; z = {}; for (x in z) { x() }"); 
 } 


public void testIssue297f322() { 
     test("function f(a) {" + " h((a=1) - (a = g(a)));" + "};", "function f(a) {" + " h((a=1) - (g(a)));" + "};"); 
 } 


public void testErrorHandling423() { 
     inFunction("var x; try{ x=1 } catch(e){ x=2 }; x"); 
     inFunction("var x; try{ x=1 } catch(e){ x=2 }", "var x;try{ 1 } catch(e) { 2 }"); 
     inFunction("var x; try{ x=1 } finally { x=2 }; x", "var x;try{ 1 } finally{ x=2 }; x"); 
     inFunction("var x; while(1) { try{x=1;break}finally{x} }"); 
     inFunction("var x; try{throw 1} catch(e){x=2} finally{x}"); 
     inFunction("var x; try{x=1;throw 1;x} finally{x=2}; x", "var x; try{1;throw 1;x} finally{x=2}; x"); 
 } 


public void testLoops657() { 
     inFunction("for(var a=0; a<10; a++) {}"); 
     inFunction("var x; for(var a=0; a<10; a++) {x=a}; a(x)"); 
     inFunction("var x; for(var a=0; x=a<10; a++) {}", "var x; for(var a=0; a<10; a++) {}"); 
     inFunction("var x; for(var a=0; a<10; x=a) {}", "var x; for(var a=0; a<10; a) {}"); 
     inFunction("var x; for(var a=0; a<10; x=a,a++) {}", "var x; for(var a=0; a<10; a,a++) {}"); 
     inFunction("var x; for(var a=0; a<10; a++,x=a) {}", "var x; for(var a=0; a<10; a++,a) {}"); 
     inFunction("var x;for(var a=0; a<10; a++) {x=1}", "var x;for(var a=0; a<10; a++) {1}"); 
     inFunction("var x; x=1; do{x=2}while(0); x", "var x; 1; do{x=2}while(0); x"); 
     inFunction("var x; x=1; while(1){x=2}; x"); 
 } 


public void testAssignmentSamples885() { 
     inFunction("var x = 2;"); 
     inFunction("var x = 2; x++;", "var x=2; void 0"); 
     inFunction("var x; x=x++;", "var x;x++"); 
     inFunction("var x; x+=1;", "var x;x+1"); 
 } 


public void testDeadIncrement956() { 
     inFunction("var x; x ++", "var x; void 0"); 
     inFunction("var x; x --", "var x; void 0"); 
 } 


public void testIssue297a1258() { 
     testSame("function f(p) {" + " var x;" + " return ((x=p.id) && (x=parseInt(x.substr(1))) && x>0);" + "}; f('');"); 
 } 


public void testNestedReassignments1271() { 
     inFunction("var a; a = (a = 1)", "var a; 1"); 
     inFunction("var a; a = (a *= 2)", "var a; a*2"); 
     inFunction("var a; a = (a++)", "var a; a++"); 
     inFunction("var a; a = (++a)", "var a; ++a"); 
     inFunction("var a; a = (b = (a = 1))", "var a; b = 1"); 
     inFunction("var a; a = (b = (a *= 2))", "var a; b = a * 2"); 
     inFunction("var a; a = (b = (a++))", "var a; b=a++"); 
     inFunction("var a; a = (b = (++a))", "var a; b=++a"); 
     inFunction("var a,b; a = (b = (a = 1))", "var a,b; 1"); 
     inFunction("var a,b; a = (b = (a *= 2))", "var a,b; a * 2"); 
     inFunction("var a,b; a = (b = (a++))", "var a,b; a++"); 
     inFunction("var a,b; a = (b = (++a))", "var a,b; ++a"); 
     inFunction("var a; a += (a++)", "var a; a + a++"); 
     inFunction("var a; a += (++a)", "var a; a+ (++a)"); 
     inFunction("var a,b; a += (b = (a = 1))", "var a,b; a + 1"); 
     inFunction("var a,b; a += (b = (a *= 2))", "var a,b; a + (a * 2)"); 
     inFunction("var a,b; a += (b = (a++))", "var a,b; a + a++"); 
     inFunction("var a,b; a += (b = (++a))", "var a,b; a+(++a)"); 
 } 


public void testMutipleDeadAssignmentsButAlivePartiallyWithinTheExpression1296() { 
     inFunction("var x; x = 1, x = 2, x = 3, x = 4, x = 5," + "  print(x), x = 0, print(x), x = 101;", "var x; 1, 2, 3, 4, x = 5, print(x), x = 0, print(x), 101;"); 
 } 


public void testIssue384b1337() { 
     inFunction(" var a, b;\n" + " (f(b = true) || f(b = false)) ? (a = b) : (a = null);\n" + " return a;"); 
 } 


public void testIssue297b1470() { 
     test("function f() {" + " var x;" + " return (x='') && (x = x.substr(1));" + "};", "function f() {" + " var x;" + " return (x='') && (x.substr(1));" + "};"); 
 } 


public void testAssignmentOpUsedAsCondition1478() { 
     inFunction("var x; if(x += foo()) {}", "var x; if(x +  foo()) {}"); 
     inFunction("var x; if((x += foo()) > 1) {}", "var x; if((x +  foo()) > 1) {}"); 
     inFunction("var x; while((x += foo()) > 1) {}"); 
     inFunction("var x; for(;--x;){}"); 
     inFunction("var x; for(;x--;){}"); 
     inFunction("var x; for(;x -= 1;){}"); 
     inFunction("var x; for(;x = 0;){}", "var x; for(;0;){}"); 
     inFunction("var x; for(;;--x){}"); 
     inFunction("var x; for(;;x--){}"); 
     inFunction("var x; for(;;x -= 1){}"); 
     inFunction("var x; for(;;x = 0){}", "var x; for(;;0){}"); 
     inFunction("var x; for(--x;;){}", "var x; for(;;){}"); 
     inFunction("var x; for(x--;;){}", "var x; for(;;){}"); 
     inFunction("var x; for(x -= 1;;){}", "var x; for(x - 1;;){}"); 
     inFunction("var x; for(x = 0;;){}", "var x; for(0;;){}"); 
 } 


public void testIssue297d1629() { 
     test("function f(a) {" + " return (a=1) && (a = f(a));" + "};", "function f(a) {" + " return (a=1) && (f(a));" + "};"); 
 } 


public void testIdentityAssignments1717() { 
     inFunction("var x; x=x", "var x; x"); 
 } 


public void testAssignToExtern1865() { 
     inFunction("extern = true;"); 
 } 


public void testInnerFunctions21949() { 
     inFunction("var x = 0; print(x); x = 1; var y = function(){}; y()"); 
 } 


public void testMultiPaths1976() { 
     inFunction("var x,y; if(x)y=1;", "var x,y; if(x)1;"); 
     inFunction("var x,y; if(x)y=1; y=2; x(y)", "var x,y; if(x)1; y=2; x(y)"); 
     inFunction("var x; switch(x) { case(1): x=1; break; } x"); 
     inFunction("var x; switch(x) { case(1): x=1; break; }", "var x; switch(x) { case(1): 1; break; }"); 
 } 


public void testInExpression22286() { 
     inFunction("var a; a = 1; if ((a = 2) || (a = 3) || (a)) {}", "var a; a = 1; if ((    2) || (a = 3) || (a)) {}"); 
     inFunction("var a; (a = 1) || (a = 2)", "var a; 1 || 2"); 
     inFunction("var a; (a = 1) || (a = 2); return a"); 
     inFunction("var a; a = 1; a ? a = 2 : a;", "var a; a = 1; a ?     2 : a;"); 
     inFunction("var a; a = 1; a ? a = 2 : a; return a"); 
     inFunction("var a; a = 1; a ? a : a = 2;", "var a; a = 1; a ? a : 2;"); 
     inFunction("var a; a = 1; a ? a : a =2; return a"); 
     inFunction("var a; (a = 1) ? a = 2 : a = 3;", "var a;      1  ?     2 :     3;"); 
     inFunction("var a; (a = 1) ? a = 2 : a = 3; return a"); 
 } 

  

  

  

  

  

  

  

  

  /**
   * BUG #1358904
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  private void inFunction(String src) {
    inFunction(src, src);
  }

  private void inFunction(String src, String expected) {
    test("function FUNC(param1, param2){" + src + "}",
         "function FUNC(param1, param2){" + expected + "}");
  }

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  
}
