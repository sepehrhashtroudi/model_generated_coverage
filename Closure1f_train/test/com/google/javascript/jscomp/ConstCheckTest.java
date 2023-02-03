/*
 * Copyright 2007 The Closure Compiler Authors.
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
 * Tests {@link ConstCheck}.
 *
 */
public class ConstCheckTest extends CompilerTestCase {

  public ConstCheckTest() {
    enableNormalize();
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return new ConstCheck(compiler);
  }

  @Override
  public int getNumRepetitions() {
    return 1;
  }


public void testConstantDefinition170() { 
     testSame("var XYZ = 1;"); 
 } 


public void testConstantRedefinedInLocalScopeOutOfOrder605() { 
     testError("function f() { XYZ = 2; } var XYZ = 1;"); 
 } 


public void testAbbreviatedShiftAssignment1732() { 
     testError("var XYZ = 1; XYZ >>= 2;"); 
 } 


public void testAbbreviatedBitAssignment1778() { 
     testError("var XYZ = 1; XYZ |= 2;"); 
 } 


public void testConstantPostIncremented21581() { 
     testError("var a$b$XYZ = 1; a$b$XYZ++;"); 
 } 


public void testConstantPreDecremented21665() { 
     testError("var a$b$XYZ = 1; a$b$XYZ--;"); 
 } 


public void testAbbreviatedArithmeticAssignment21708() { 
     testError("var a$b$XYZ = 1; a$b$XYZ %= 2;"); 
 } 


public void testAbbreviatedBitAssignment21770() { 
     testError("var a$b$XYZ = 1; a$b$XYZ &= 2;"); 
 } 


public void testAbbreviatedShiftAssignment22138() { 
     testError("var a$b$XYZ = 1; a$b$XYZ <<= 2;"); 
 } 


public void testAbbreviatedArithmeticAssignment12266() { 
     testError("var XYZ = 1; XYZ += 2;"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testError(String js) {
    test(js, null, ConstCheck.CONST_REASSIGNED_VALUE_ERROR);
  }
}
