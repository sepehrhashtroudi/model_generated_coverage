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

import com.google.javascript.rhino.Node;

/**
 * @author johnlenz@google.com (John Lenz)
 */
public class MinimizeExitPointsTest extends CompilerTestCase {

  @Override
  public void setUp() {
    super.enableLineNumberCheck(true);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node js) {
        NodeTraversal.traverse(compiler, js, new MinimizeExitPoints(compiler));
      }
    };
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  void foldSame(String js) {
    testSame(js);
  }

  void fold(String js, String expected) {
    test(js, expected);
  }

  void fold(String js, String expected, DiagnosticType warning) {
    test(js, expected, warning);
  }


public void testDoContinueOptimization274() throws Exception { 
     fold("do{if(x)continue; x=3; continue; }while(true)", "do if(x); else x=3; while(true)"); 
     foldSame("do{a();continue;b()}while(true)"); 
     fold("do{if(true){a();continue;}else;b();}while(true)", "do{if(true){a();}else{b();}}while(true)"); 
     fold("do{if(false){a();continue;}else;b();continue;}while(true)", "do{if(false){a();}else{b();}}while(true)"); 
     fold("do{if(a()){b();continue;}else;c();}while(true)", "do{if(a()){b();}else{c()}}while(true)"); 
     fold("do{if(a()){b();}else{c();continue;}}while(true)", "do{if(a()){b();}else{c();}}while(true)"); 
     fold("do{if(a()){b();continue;}else;}while(true)", "do{if(a()){b();}else;}while(true)"); 
     fold("do{if(a()){continue;}else{continue;} continue;}while(true)", "do{if(a()){}else{}}while(true)"); 
     fold("do{if(a()){continue;}else{continue;} b();}while(true)", "do{if(a()){}else{continue; b();}}while(true)"); 
     fold("do{while(a())continue;}while(true)", "do while(a());while(true)"); 
     fold("do{for(x in a())continue}while(true)", "do for(x in a());while(true)"); 
     fold("do{while(a())break;}while(true)", "do while(a())break;while(true)"); 
     fold("do for(x in a())break;while(true)", "do for(x in a())break;while(true)"); 
     fold("do{try{continue;}catch(e){continue;}}while(true)", "do{try{}catch(e){}}while(true)"); 
     fold("do{try{if(a()){continue;}else{continue;}" + "continue;}catch(e){}}while(true)", "do{try{if(a()){}else{}}catch(e){}}while(true)"); 
     fold("do{g:continue}while(true)", "do{}while(true)"); 
     fold("do{g:if(a()){continue;}else{continue;} continue;}while(true)", "do{g:if(a());else;}while(true)"); 
     fold("do { foo(); continue; } while(false)", "do { foo(); } while(false)"); 
     fold("do { foo(); break; } while(false)", "do { foo(); } while(false)"); 
 } 


public void testFunctionReturnOptimization597() throws Exception { 
     fold("function f(){if(a()){b();if(c())return;}}", "function f(){if(a()){b();if(c());}}"); 
     fold("function f(){if(x)return; x=3; return; }", "function f(){if(x); else x=3}"); 
     fold("function f(){if(true){a();return;}else;b();}", "function f(){if(true){a();}else{b();}}"); 
     fold("function f(){if(false){a();return;}else;b();return;}", "function f(){if(false){a();}else{b();}}"); 
     fold("function f(){if(a()){b();return;}else;c();}", "function f(){if(a()){b();}else{c();}}"); 
     fold("function f(){if(a()){b()}else{c();return;}}", "function f(){if(a()){b()}else{c();}}"); 
     fold("function f(){if(a()){b();return;}else;}", "function f(){if(a()){b();}else;}"); 
     fold("function f(){if(a()){return;}else{return;} return;}", "function f(){if(a()){}else{}}"); 
     fold("function f(){if(a()){return;}else{return;} b();}", "function f(){if(a()){}else{return;b()}}"); 
     fold("function f(){while(a())return;}", "function f(){while(a())return}"); 
     foldSame("function f(){for(x in a())return}"); 
     fold("function f(){while(a())break;}", "function f(){while(a())break}"); 
     foldSame("function f(){for(x in a())break}"); 
     fold("function f(){try{return;}catch(e){return;}finally{return}}", "function f(){try{}catch(e){}finally{}}"); 
     fold("function f(){try{return;}catch(e){return;}}", "function f(){try{}catch(e){}}"); 
     fold("function f(){try{return;}finally{return;}}", "function f(){try{}finally{}}"); 
     fold("function f(){try{if(a()){return;}else{return;} return;}catch(e){}}", "function f(){try{if(a()){}else{}}catch(e){}}"); 
     fold("function f(){g:return}", "function f(){}"); 
     fold("function f(){g:if(a()){return;}else{return;} return;}", "function f(){g:if(a()){}else{}}"); 
     fold("function f(){try{g:if(a()){} return;}finally{return}}", "function f(){try{g:if(a()){}}finally{}}"); 
 } 


public void testBreakOptimization2005() throws Exception { 
     fold("f:{if(true){a();break f;}else;b();}", "f:{if(true){a()}else{b()}}"); 
     fold("f:{if(false){a();break f;}else;b();break f;}", "f:{if(false){a()}else{b()}}"); 
     fold("f:{if(a()){b();break f;}else;c();}", "f:{if(a()){b();}else{c();}}"); 
     fold("f:{if(a()){b()}else{c();break f;}}", "f:{if(a()){b()}else{c();}}"); 
     fold("f:{if(a()){b();break f;}else;}", "f:{if(a()){b();}else;}"); 
     fold("f:{if(a()){break f;}else;}", "f:{if(a()){}else;}"); 
     fold("f:while(a())break f;", "f:while(a())break f"); 
     foldSame("f:for(x in a())break f"); 
     fold("f:{while(a())break;}", "f:{while(a())break;}"); 
     foldSame("f:{for(x in a())break}"); 
     fold("f:try{break f;}catch(e){break f;}", "f:try{}catch(e){}"); 
     fold("f:try{if(a()){break f;}else{break f;} break f;}catch(e){}", "f:try{if(a()){}else{}}catch(e){}"); 
     fold("f:g:break f", ""); 
     fold("f:g:{if(a()){break f;}else{break f;} break f;}", "f:g:{if(a()){}else{}}"); 
 } 


public void testCodeMotionDoesntBreakFunctionHoisting2196() throws Exception { 
     fold("function f() { if (x) return; foo(); function foo() {} }", "function f() { if (x); else { function foo() {} foo(); } }"); 
 } 

  

  

  

  

  

  
}
