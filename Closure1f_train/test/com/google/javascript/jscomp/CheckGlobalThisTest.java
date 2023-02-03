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
 * Tests {@link CheckGlobalThis}.
 */
public class CheckGlobalThisTest extends CompilerTestCase {
  public CheckGlobalThisTest() {
    this.parseTypeInfo = true;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new CombinedCompilerPass(
        compiler, new CheckGlobalThis(compiler));
  }

  private void testFailure(String js) {
    testSame(js, CheckGlobalThis.GLOBAL_THIS);
  }


public void testIssue182b997() { 
     testFailure("var NS = {write: function() { this.foo = 3; }};"); 
 } 


public void testStaticFunction71242() { 
     testSame("var a = function() { return function() { this.x = 8; } }"); 
 } 


public void testGlobalThis61301() { 
     testSame("a = this;"); 
 } 


public void testLendsAnnotation31520() { 
     testSame("/** @constructor */ function F() {}" + "dojo.declare(F, /** @lends {F.prototype} */ (" + "    {foo: function() { return this.foo; }}));"); 
 } 


public void testMethod12188() { 
     testSame("A.prototype.m1 = function() { this.m2 = 5; }"); 
 } 


public void testIssue182d2244() { 
     testSame("function Foo() {} " + "Foo.prototype = {write: function() { this.foo = 3; }};"); 
 } 


public void testConstructor12441() { 
     testSame("/** @constructor */function A() { this.m2 = 5; }"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
