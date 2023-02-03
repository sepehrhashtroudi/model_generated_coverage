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

/**
 * Unit tests for {@link OptimizeArgumentsArray}.
 *
 */
public class OptimizeArgumentsArrayTest extends CompilerTestCase {

  public OptimizeArgumentsArrayTest() {
    /*
     * arguments is a builtin variable of the javascript language and
     * OptimizeArgumentsArray does not make any attempt to resolve it. However,
     * I am leaving "var arguments" in the externs to emulate the current
     * behavior we have for JS compilation where var arguments in defined in
     * externs/es3.js as extern.
     */
    super("var arguments, alert" /* Externs */);
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(false);
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new OptimizeArgumentsArray(compiler, "p");
  }


public void testSimple21() { 
     test("function foo()   { alert(arguments[0]); }", "function foo(p0) { alert(p0); }"); 
 } 


public void testNoOptimizationWhenArgumentIsUsedAsFunctionCall408() { 
     testSame("function f() {arguments[0]()}"); 
 } 


public void testInnerFunctionsWithNamedArgumentInInnerFunction580() { 
     test("function f() { function b(x   ) { arguments[1] }}", "function f() { function b(x,p0) {           p0 }}"); 
     test("function f(  ) { function b(x) { }  arguments[0] }", "function f(p0) { function b(x) { }            p0 }"); 
     test("function f( )  { arguments[0]; function b(x   ) { arguments[1] }}", "function f(p1) {           p1; function b(x,p0) {           p0 }}"); 
 } 


public void testNoVarArgs775() { 
     testSame("function f(a,b,c) { alert(a + b + c) }"); 
     test("function f(a,b,c) { alert(arguments[0]) }", "function f(a,b,c) { alert(a) }"); 
 } 


public void testOneRequired1884() { 
     test("function foo(req0, var_args) { alert(req0 + arguments[1]); }", "function foo(req0, var_args) { alert(req0 + var_args); }"); 
 } 


public void testMissingVarArgs2146() { 
     testSame("function f() { alert(arguments[x]) }"); 
 } 


public void testNoOptimizationWhenGetProp2396() { 
     testSame("function f() { arguments[0]; arguments.size }"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
