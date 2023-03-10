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
 * @author johnlenz@google.com (John Lenz)
 */
public class RemoveUnusedClassPropertiesTest extends CompilerTestCase {

  private static final String EXTERNS =
      "var window;\n" +
      "function alert(a) {}\n" +
      "var EXT = {};" +
      "EXT.ext;";

  public RemoveUnusedClassPropertiesTest() {
    super(EXTERNS);
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new RemoveUnusedClassProperties(compiler);
  }


public void testJSCompiler_renameProperty556() { 
     testSame("this.a = 2; x[JSCompiler_renameProperty('a')]"); 
     testSame("this.a = 2; JSCompiler_renameProperty('a')"); 
 } 


public void testForIn870() { 
     test("this.y = 1;for (var a in x) { alert(x[a]) }", "1;for (var a in x) { alert(x[a]) }"); 
 } 


public void testInc11045() { 
     test("this.x++", "0"); 
     testSame("x = (this.x++)"); 
     testSame("this.x++; x = this.x;"); 
     test("--this.x", "0"); 
     testSame("x = (--this.x)"); 
     testSame("--this.x; x = this.x;"); 
 } 


public void testAssignOp21292() { 
     test("this.a += 2, f()", "2, f()"); 
     test("x = (this.a += 2, f())", "x = (2, f())"); 
     testSame("x = (f(), this.a += 2)"); 
 } 

  

  

  

  

  

  


  

  

  

  

  

  

  

  
}
