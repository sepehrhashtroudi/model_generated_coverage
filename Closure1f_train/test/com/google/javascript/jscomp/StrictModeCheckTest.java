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

public class StrictModeCheckTest extends CompilerTestCase {
  private static final String EXTERNS = "var arguments; function eval(str) {}";

  private boolean noVarCheck;
  private boolean noCajaChecks;

  public StrictModeCheckTest() {
    super(EXTERNS);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    noVarCheck = false;
    noCajaChecks = false;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new StrictModeCheck(compiler, noVarCheck, noCajaChecks);
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }


public void testArguments5194() { 
     testSame("var o = {arguments: 3};"); 
 } 


public void testDuplicateObjectLiteralKey303() { 
     testSame("var o = {a: 1, b: 2, c: 3};"); 
     testSame("var x = { get a() {}, set a(p) {} };"); 
     testSame("var o = {a: 1, b: 2, a: 3};", StrictModeCheck.DUPLICATE_OBJECT_KEY); 
     testSame("var x = { get a() {}, get a() {} };", StrictModeCheck.DUPLICATE_OBJECT_KEY); 
     testSame("var x = { get a() {}, a: 1 };", StrictModeCheck.DUPLICATE_OBJECT_KEY); 
     testSame("var x = { set a(p) {}, a: 1 };", StrictModeCheck.DUPLICATE_OBJECT_KEY); 
     testSame("'use strict';\n" + "function App() {}\n" + "App.prototype = {\n" + "  get appData() { return this.appData_; },\n" + "  set appData(data) { this.appData_ = data; }\n" + "};"); 
 } 


public void testArguments860() { 
     testSame("function foo(arguments) {}", StrictModeCheck.ARGUMENTS_DECLARATION); 
 } 


public void testEval71044() { 
     testSame("var o = {eval: 3};"); 
 } 


public void testEval81134() { 
     testSame("var a; eval: while (true) { a = 3; }"); 
 } 


public void testDeleteArgument1443() { 
     testSame("function b(a) { delete a; }", StrictModeCheck.DELETE_VARIABLE); 
 } 


public void testIllegalName91532() { 
     test("a__: while (true) { var b = 3; }", null, StrictModeCheck.ILLEGAL_NAME); 
 } 


public void testIllegalName21587() { 
     test("function a__() {}", null, StrictModeCheck.ILLEGAL_NAME); 
 } 


public void testIllegalName61682() { 
     test("function f(obj) { return obj.a__; }", null, StrictModeCheck.ILLEGAL_NAME); 
 } 


public void testEval61871() { 
     testSame("try {} catch (eval) {}", StrictModeCheck.EVAL_DECLARATION); 
 } 


public void testEvalAssignment21916() { 
     test("function foo() { eval = []; }", null, StrictModeCheck.EVAL_USE); 
 } 


public void testIllegalName51935() { 
     noVarCheck = true; 
     test("var a = b__;", null, StrictModeCheck.ILLEGAL_NAME); 
 } 


public void testAssignToArguments2009() { 
     testSame("function foo() { arguments = []; }", StrictModeCheck.ARGUMENTS_ASSIGNMENT); 
 } 


public void testUnknownVariable22086() { 
     testSame("a: while (true) { a = 3; }", StrictModeCheck.UNKNOWN_VARIABLE); 
 } 


public void testIllegalName82096() { 
     test("var o = {a__: 3};", null, StrictModeCheck.ILLEGAL_NAME); 
     test("var o = {b: 3, a__: 4};", null, StrictModeCheck.ILLEGAL_NAME); 
     test("var o = {b: 3, get a__() {}};", null, StrictModeCheck.ILLEGAL_NAME); 
     test("var o = {b: 3, set a__(c) {}};", null, StrictModeCheck.ILLEGAL_NAME); 
 } 


public void testEvalAssignment2263() { 
     noCajaChecks = true; 
     testSame("function foo() { eval = []; }", StrictModeCheck.EVAL_ASSIGNMENT); 
 } 


public void testFunctionDecl22278() { 
     test("{function g() {}}", null, StrictModeCheck.BAD_FUNCTION_DECLARATION); 
 } 


public void testEval42359() { 
     testSame("function foo() { var eval = 3; }", StrictModeCheck.EVAL_DECLARATION); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private String inFn(String body) {
    return "function func() {" + body + "}";
  }
}
