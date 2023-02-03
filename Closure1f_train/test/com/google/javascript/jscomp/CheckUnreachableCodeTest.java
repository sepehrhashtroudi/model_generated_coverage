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

import com.google.javascript.jscomp.CheckLevel;

/**
 * Tests for {@link CheckUnreachableCode}.
 *
 */
public class CheckUnreachableCodeTest extends CompilerTestCase {
  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new CombinedCompilerPass(compiler,
        new CheckUnreachableCode(compiler, CheckLevel.ERROR));
  }


public void testVarDeclaration52() { 
     assertUnreachable("function f() { return; var x = 1 }"); 
     assertUnreachable("function f() { return; var x }"); 
 } 


public void testCorrectIfReturns472() { 
     testSame("function f() { if (x) { return } }"); 
     testSame("function f() { if (x) { return } return }"); 
     testSame("function f() { if (x) { if (y) { return } } else { return }}"); 
     testSame("function f()" + "{ if (x) { if (y) { return } return } else { return }}"); 
 } 


public void testInCorrectIfReturns846() { 
     assertUnreachable("function f() { if (x) { return } else { return } return }"); 
 } 


public void testInfiniteLoop1654() { 
     testSame("while (true) { foo(); break; }"); 
     assertUnreachable("while(true) {} foo()"); 
 } 


public void testUnreachableLoop1903() { 
     assertUnreachable("while(false) {}"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertUnreachable(String js) {
    test(js, js, CheckUnreachableCode.UNREACHABLE_CODE);
  }
}
