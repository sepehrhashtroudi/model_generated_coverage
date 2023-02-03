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
 * Verifies that valid candidates for inlining are inlined, but
 * that no dangerous inlining occurs.
 *
 * @author kushal@google.com (Kushal Dave)
 */
public class InlineVariablesTest extends CompilerTestCase {

  private boolean inlineAllStrings = false;
  private boolean inlineLocalsOnly = false;

  public InlineVariablesTest() {
    enableNormalize();
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(true);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new InlineVariables(
        compiler,
        (inlineLocalsOnly)
            ? InlineVariables.Mode.LOCALS_ONLY
            : InlineVariables.Mode.ALL,
        inlineAllStrings);
  }

  @Override
  public void tearDown() {
    inlineAllStrings = false;
    inlineLocalsOnly = false;
  }

  // Test respect for scopes and blocks


public void testInlineFunctionDeclaration92() { 
     test("var f = function () {}; var a = f;", "var a = function () {};"); 
     test("var f = function () {}; foo(); var a = f;", "foo(); var a = function () {};"); 
     test("var f = function () {}; foo(f);", "foo(function () {});"); 
     testSame("var f = function () {}; function g() {var a = f;}"); 
     testSame("var f = function () {}; function g() {h(f);}"); 
 } 


public void testInlineAliases1236() { 
     test("var x = this.foo(); this.bar(); var y = x; this.baz(y);", "var x = this.foo(); this.bar(); this.baz(x);"); 
 } 


public void testDoNotCrossDelete273() { 
     testSame("var x = {}; var y = x.a; delete x.a; var z = y;"); 
 } 


public void testInlineFunctionAlias1a372() { 
     test("function f(x) {}" + "var y = f;" + "g();" + "y();y();", "var y = function f(x) {};" + "g();" + "y();y();"); 
 } 


public void testInlineIntoTryCatch411() { 
     test("var a = true; " + "try { var b = a; } " + "catch (e) { var c = a + b; var d = true; } " + "finally { var f = a + b + c + d; }", "try { var b = true; } " + "catch (e) { var c = true + b; var d = true; } " + "finally { var f = true + b + c + d; }"); 
 } 


public void testNoInlineIntoNestedNamedFunctions468() { 
     testSame("f(); var x = false; function f() { if (false) { alert(x); } };"); 
 } 


public void testImmutableWithSingleReferenceAfterInitialzation498() { 
     test("var a; a = 1;", "1;"); 
     test("var a; if (a = 1) { alert(3); }", "if (1) { alert(3); }"); 
     test("var a; switch (a = 1) {}", "switch(1) {}"); 
     test("var a; function f(){ return a = 1; }", "function f(){ return 1; }"); 
     test("function f(){ var a; return a = 1; }", "function f(){ return 1; }"); 
     test("var a; with (a = 1) { alert(3); }", "with (1) { alert(3); }"); 
     test("var a; b = (a = 1);", "b = 1;"); 
     test("var a; while(a = 1) { alert(3); }", "while(1) { alert(3); }"); 
     test("var a; for(;a = 1;) { alert(3); }", "for(;1;) { alert(3); }"); 
     test("var a; do {} while(a = 1) { alert(3); }", "do {} while(1) { alert(3); }"); 
 } 


public void testInlineAcrossModules548() { 
     test(createModules("var a = 2;", "var b = a;"), new String[] { "", "var b = 2;" }); 
 } 


public void testInlineInFunction5717() { 
     testSame("function baz() { " + "var a = (foo = new obj());" + "foo.x();" + "result = a;" + "}"); 
 } 


public void testThisAlias851() { 
     test("function f() { var a = this; a.y(); a.z(); }", "function f() { this.y(); this.z(); }"); 
 } 


public void testInsideIfConditional873() { 
     test("var a = foo(); if (a) { alert(3); }", "if (foo()) { alert(3); }"); 
     test("var a; a = foo(); if (a) { alert(3); }", "if (foo()) { alert(3); }"); 
 } 


public void testDoNotEnterFinally1038() { 
     testSame("try { throw e; var x = 1; } catch (e) {} " + "finally  { var z = x; } "); 
 } 


public void testIssue378ModifiedArguments21067() { 
     testSame("function g(callback) {\n" + "  /** @const */\n" + "  var f = callback;\n" + "  arguments[0] = this;\n" + "  f.apply(this, arguments);\n" + "}"); 
 } 


public void testInlineCatchAlias21333() { 
     test("try {" + "} catch (e) {" + "  var y; y = e;" + "  g();" + "  y;y;" + "}", "try {" + "} catch (e) {" + "  e;" + "  g();" + "  e;e;" + "}"); 
 } 


public void testInlineUndefined11692() { 
     test("var x; x;", "void 0;"); 
 } 


public void testForIn1750() { 
     testSame("for (var i in j) { var c = i; }"); 
     testSame("var i = 0; for (i in j) ;"); 
     testSame("var i = 0; for (i in j) { var c = i; }"); 
     testSame("i = 0; for (var i in j) { var c = i; }"); 
     testSame("var j = {'key':'value'}; for (var i in j) {print(i)};"); 
 } 


public void testOnlyReadAtInitialization1836() { 
     test("var a; a = foo();", "foo();"); 
     test("var a; if (a = foo()) { alert(3); }", "if (foo()) { alert(3); }"); 
     test("var a; switch (a = foo()) {}", "switch(foo()) {}"); 
     test("var a; function f(){ return a = foo(); }", "function f(){ return foo(); }"); 
     test("function f(){ var a; return a = foo(); }", "function f(){ return foo(); }"); 
     test("var a; with (a = foo()) { alert(3); }", "with (foo()) { alert(3); }"); 
     test("var a; b = (a = foo());", "b = foo();"); 
     test("var a; while(a = foo()) { alert(3); }", "while(foo()) { alert(3); }"); 
     test("var a; for(;a = foo();) { alert(3); }", "for(;foo();) { alert(3); }"); 
     test("var a; do {} while(a = foo()) { alert(3); }", "do {} while(foo()) { alert(3); }"); 
 } 


public void testInsideOrBranch1864() { 
     testSame("var a = foo(); 1 || alert(a);"); 
 } 


public void testNoInlineAliases61978() { 
     testSame("var x = this.foo(); this.bar(); var y = x; this.bing();" + "this.baz(y); y = 3;"); 
 } 


public void testInlineAliases2d1988() { 
     test("var x; x = this.foo(); this.bar(); " + "function f() { var y; y = x; this.baz(y); }", "var x; x = this.foo(); this.bar(); function f() { this.baz(x); }"); 
 } 


public void testNoInlineGetpropIntoCall2021() { 
     test("var a = b; a();", "b();"); 
     test("var a = b.c; f(a);", "f(b.c);"); 
     testSame("var a = b.c; a();"); 
 } 


public void testNoInlineOutOfBranch2080() { 
     testSame("if (true) var x = null; var y = x;"); 
 } 


public void testInsideHookConditional2123() { 
     test("var a = foo(); a ? alert(1) : alert(3)", "foo() ? alert(1) : alert(3)"); 
 } 


public void testInlineUndefined22133() { 
     testSame("var x; x++;"); 
 } 


public void testIssue378EscapedArguments32158() { 
     test("function g(callback) {\n" + "  var f = callback;\n" + "  f.apply(this, arguments);\n" + "}\n", "function g(callback) {\n" + "  callback.apply(this, arguments);\n" + "}\n"); 
 } 


public void test23885312181() { 
     testSame("var f = function () {};" + "var g = function () {};" + "goog.inherits(f, g);"); 
     testSame("var f = function () {};" + "var g = function () {};" + "goog$inherits(f, g);"); 
 } 


public void testThisEscapedAlias2252() { 
     testSame("function f() { var a = this; var g = function() { a.y(); }; a.z(); }"); 
 } 


public void testRecursiveFunction12353() { 
     testSame("var x = 0; (function x() { return x ? x() : 3; })();"); 
 } 


public void testSingleReferenceAfterInitialzation2456() { 
     test("var a; a = foo();a;", "foo();"); 
     testSame("var a; if (a = foo()) { alert(3); } a;"); 
     testSame("var a; switch (a = foo()) {} a;"); 
     testSame("var a; function f(){ return a = foo(); } a;"); 
     testSame("function f(){ var a; return a = foo(); a;}"); 
     testSame("var a; with (a = foo()) { alert(3); } a;"); 
     testSame("var a; b = (a = foo()); a;"); 
     testSame("var a; while(a = foo()) { alert(3); } a;"); 
     testSame("var a; for(;a = foo();) { alert(3); } a;"); 
     testSame("var a; do {} while(a = foo()) { alert(3); } a;"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Test movement of constant values

  

  


  // Test tricky declarations and references

  

  

  // Test movement of values that have (may) side effects

  

  


  // Test movement of values that are complex but lack side effects

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Make sure that we still inline constants that are not provably
  // written before they're read.
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
