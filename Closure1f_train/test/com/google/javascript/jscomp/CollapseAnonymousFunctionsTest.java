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


/**
 * Tests for {@link CollapseAnonymousFunctions}
 *
 */
public class CollapseAnonymousFunctionsTest extends CompilerTestCase {
  public CollapseAnonymousFunctionsTest() {
    this.enableNormalize();
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new CollapseAnonymousFunctions(compiler);
  }


public void testLocalScope2395() { 
     test("function f(){ var x = function(){}; return x }", "function f(){ function x(){} return x }"); 
 } 


public void testLocalScopeOnly1421() { 
     test("if (x) var f = function(){ var g = function(){} }", "if (x) var f = function(){ function g(){} }"); 
 } 


public void testRecursiveInternal1536() { 
     testSame("var f = function foo() { foo() }"); 
 } 


public void testRecursiveExternal12324() { 
     test("var f = function foo() { f() }", "function f() { f() }"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
