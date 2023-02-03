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
 * Unit tests for {@link CoalesceVariableNames}
 *
 */
public class CoalesceVariableNamesTest extends CompilerTestCase {
  // The spacing in this file is not exactly standard but it greatly helps
  // picking out which variable names are merged.

  private boolean usePseudoName = false;

  @Override
  protected int getNumRepetitions() {
   return 1;
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(true);
    usePseudoName = false;
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node js) {
        NodeTraversal.traverse(compiler, js,
            new CoalesceVariableNames(compiler, usePseudoName));
      }
    };
  }


public void testSimple10() { 
     inFunction("var x; var y; x=1; x; y=1; y; return y", "var x;        x=1; x; x=1; x; return x"); 
     inFunction("var x,y; x=1; x; y=1; y", "var x  ; x=1; x; x=1; x"); 
     inFunction("var x,y; x=1; y=2; y; x"); 
     inFunction("y=0; var x, y; y; x=0; x", "y=0; var y   ; y; y=0;y"); 
     inFunction("var x,y; x=1; y=x; y", "var x  ; x=1; x=x; x"); 
     inFunction("var x,y; x=1; y=x+1; y", "var x  ; x=1; x=x+1; x"); 
     inFunction("x=1; x; y=2; y; var x; var y", "x=1; x; x=2; x; var x"); 
     inFunction("var x=1; var y=x+1; return y", "var x=1;     x=x+1; return x"); 
     inFunction("var x=1; var y=0; x+=1; y"); 
     inFunction("var x=1; x+=1; var y=0; y", "var x=1; x+=1;     x=0; x"); 
     inFunction("var x=1; foo(bar(x+=1)); var y=0; y", "var x=1; foo(bar(x+=1));     x=0; x"); 
     inFunction("var y, x=1; f(x+=1, y)"); 
     inFunction("var x; var y; y += 1, y, x = 1; x"); 
 } 


public void testLoops91() { 
     inFunction("var x; while(1) { x; x = 1; var y = 1; y }"); 
     inFunction("var y = 1; y; while(1) { var x = 1; x }", "var y = 1; y; while(1) {     y = 1; y }"); 
 } 


public void testForIn559() { 
     inFunction("var x = 1, k; x;      ; for (var y in k) { y }", "var x = 1, k; x;      ; for (var y in k) { y }"); 
     inFunction("var x = 1, k; x; y = 1; for (var y in k) { y }", "var x = 1, k; x; x = 1; for (    x in k) { x }"); 
 } 


public void testParameter4863() { 
     test("function FUNC(x, y) {var a,b; y; a=0; a; x; b=0; b}", "function FUNC(x, y) {var a; y; a=0; a; x; a=0; a}"); 
 } 


public void testUsePseduoNames1398() { 
     usePseudoName = true; 
     inFunction("var x   = 0; print(x  ); var   y = 1; print(  y)", "var x_y = 0; print(x_y);     x_y = 1; print(x_y)"); 
     inFunction("var x_y = 1; var x   = 0; print(x  ); var     y = 1;" + "print(  y); print(x_y);", "var x_y = 1; var x_y$ = 0; print(x_y$);     x_y$ = 1;" + "" + "print(x_y$); print(x_y);"); 
     inFunction("var x_y = 1; function f() {" + "var x    = 0; print(x  ); var y = 1; print( y);" + "print(x_y);}", "var x_y = 1; function f() {" + "var x_y$ = 0; print(x_y$); x_y$ = 1; print(x_y$);" + "print(x_y);}"); 
     inFunction("var x   = 0; print(x  ); var   y = 1; print(  y); " + "var closure_var; function bar() { print(closure_var); }", "var x_y = 0; print(x_y);     x_y = 1; print(x_y); " + "var closure_var; function bar() { print(closure_var); }"); 
 } 


public void testParameter21920() { 
     test("function FUNC(x,y) {x = 0; x; y = 0; y}"); 
     test("function FUNC(x,y,z) {x = 0; x; y = 0; z = 0; z}"); 
 } 


public void testParameter2010() { 
     test("function FUNC(param) {var x = 0; x}", "function FUNC(param) {param = 0; param}"); 
 } 


public void testSwitchCase2210() { 
     inFunction("var x = 1; switch(x) { case 1: var y; case 2: } y = 1; y", "var x = 1; switch(x) { case 1:        case 2: } x = 1; x"); 
 } 


public void testMaxVars2425() { 
     String code = ""; 
     for (int i = 0; i < LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE + 1; i++) { 
         code += String.format("var x%d = 0; print(x%d);", i, i); 
     } 
     inFunction(code); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Sometimes live range can be cross even within a VAR declaration.
  

  

  

  

  

  

  private void inFunction(String src) {
    inFunction(src, src);
  }

  private void inFunction(String src, String expected) {
    test("function FUNC(){" + src + "}",
         "function FUNC(){" + expected + "}");
  }

  private void test(String src) {
    test(src, src);
  }
}
