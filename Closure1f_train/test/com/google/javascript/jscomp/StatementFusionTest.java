/*
 * Copyright 2011 The Closure Compiler Authors.
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
 * Unit tests for {@link StatementFusion}.
 *
 */
public class StatementFusionTest extends CompilerTestCase  {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    enableLineNumberCheck(true);
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    PeepholeOptimizationsPass peepholePass =
      new PeepholeOptimizationsPass(compiler, new StatementFusion());

    return peepholePass;
  }


public void testFoldBlockWithStatements5() { 
     fuse("a;b;c", "a,b,c"); 
     fuse("a();b();c();", "a(),b(),c()"); 
     fuse("a(),b();c(),d()", "a(),b(),c(),d()"); 
     fuse("a();b(),c(),d()", "a(),b(),c(),d()"); 
     fuse("a(),b(),c();d()", "a(),b(),c(),d()"); 
 } 


public void testNothingToDo352() { 
     fuseSame(""); 
     fuseSame("a"); 
     fuseSame("a()"); 
     fuseSame("if(a()){}"); 
 } 


public void testFuseIntoForIn698() { 
     fuse("a;b;c;for(x in y){}", "for(x in a,b,c,y){}"); 
     fuseSame("a();for(var x = b() in y){}"); 
 } 


public void testNoFuseIntoWhile1279() { 
     fuseSame("a;b;c;while(x){}"); 
 } 


public void testFoldBlockThrow1420() { 
     fuse("a;b;c;throw x", "throw a,b,c,x"); 
     fuse("a;b;c;throw x+y", "throw a,b,c,x+y"); 
     fuseSame("a;b;c;throw x;a;b;c"); 
 } 


public void testFoldBlockIntoIf1477() { 
     fuse("a;b;c;if(x){}", "if(a,b,c,x){}"); 
     fuse("a;b;c;if(x,y){}else{}", "if(a,b,c,x,y){}else{}"); 
     fuse("a;b;c;if(x,y){}", "if(a,b,c,x,y){}"); 
     fuse("a;b;c;if(x,y,z){}", "if(a,b,c,x,y,z){}"); 
     fuseSame("a();if(a()){}a()"); 
 } 


public void testFoldBlockReturn1947() { 
     fuse("a;b;c;return x", "return a,b,c,x"); 
     fuse("a;b;c;return x+y", "return a,b,c,x+y"); 
     fuseSame("a;b;c;return x;a;b;c"); 
 } 


public void testFoldSwitch2354() { 
     fuse("a;b;c;switch(x){}", "switch(a,b,c,x){}"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  private void fuse(String before, String after) {
    test("function F(){if(CONDITION){" + before + "}}",
         "function F(){if(CONDITION){" + after + "}}");
  }

  private void fuseSame(String code) {
    fuse(code, code);
  }
}
