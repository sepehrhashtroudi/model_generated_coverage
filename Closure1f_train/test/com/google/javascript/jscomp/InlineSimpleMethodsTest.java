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

public class InlineSimpleMethodsTest extends CompilerTestCase {

  public InlineSimpleMethodsTest() {
    super("", false);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    super.enableLineNumberCheck(true);
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new InlineSimpleMethods(compiler);
  }

  /**
   * Helper for tests that expects definitions to remain unchanged, such
   * that {@code definitions+js} is converted to {@code definitions+expected}.
   */
  private void testWithPrefix(String definitions, String js, String expected) {
    test(definitions + js, definitions + expected);
  }


public void testNoInlineOfExternMethods3211() { 
     testSame("var external={};external.bar=function(){};", "function Foo(){}Foo.prototype.bar=function(){};(new Foo).bar()", (DiagnosticType) null); 
 } 


public void testNoWarn329() { 
     testSame("function Foo(){}" + "Foo.prototype.bar=function(opt_a,b){var x=1};" + "var x=new Foo;x.bar()"); 
     testSame("function Foo(){}" + "Foo.prototype.bar=function(var_args,b){var x=1};" + "var x=new Foo;x.bar()"); 
 } 


public void testObjectLitExtern380() { 
     String externs = "window.bridge={_sip:function(){}};"; 
     testSame(externs, "window.bridge._sip()", null); 
 } 


public void testIssue2508576_21011() { 
     testSame("({a:function(){},b:x()}).a(\"a\")"); 
 } 


public void testObjectLit1041() { 
     testSame("Foo.prototype.bar=function(){return this.baz_};" + "var blah={bar:function(){}};" + "(new Foo).bar()"); 
 } 


public void testNestedProperties1091() { 
     testWithPrefix("function Foo(){}" + "Foo.prototype.bar=function(){return this.baz.ooka};", "(new Foo).bar()", "(new Foo).baz.ooka"); 
 } 


public void testNoInlineOfDangerousProperty1317() { 
     testSame("function Foo(){this.bar=3}" + "Foo.prototype.bar=function(){};" + "var x=new Foo;var y=x.bar()"); 
 } 


public void testSkipComplexMethods1417() { 
     testWithPrefix("function Foo(){}" + "Foo.prototype.bar=function(){return this.baz};" + "Foo.prototype.condy=function(){return this.baz?this.baz:1};", "var x=(new Foo).argy()", "var x=(new Foo).argy()"); 
 } 


public void testSimpleGetterInline11645() { 
     testSame("function Foo(){}" + "Foo.prototype={get bar(){return this.baz}};" + "var x=(new Foo).bar;var y=(new Foo).bar"); 
     testSame("function Foo(){}" + "Foo.prototype={get bar(){return this.baz}};" + "var x=(new Foo).bar();var y=(new Foo).bar()"); 
 } 


public void testSimpleInline21700() { 
     testWithPrefix("function Foo(){}" + "Foo.prototype={bar:function(){return this.baz}};", "var x=(new Foo).bar();var y=(new Foo).bar();", "var x=(new Foo).baz;var y=(new Foo).baz"); 
 } 


public void testSimpleSetterInline11892() { 
     testSame("function Foo(){}" + "Foo.prototype={set bar(a){return this.baz}};" + "var x=(new Foo).bar;var y=(new Foo).bar"); 
     testSame("function Foo(){}" + "Foo.prototype={set bar(a){return this.baz}};" + "var x=(new Foo).bar();var y=(new Foo).bar()"); 
 } 


public void testIssue2508576_31956() { 
     test("({a:function(){},b:alert}).a(\"a\")", ""); 
 } 


public void testEmptyMethodInlineWithSideEffects1962() { 
     testWithPrefix("function Foo(){}" + "Foo.prototype.bar=function(){};", "(new Foo).bar();var y=new Foo;y.bar(new Foo)", "(new Foo).bar();var y=new Foo;y.bar(new Foo)"); 
 } 


public void testSameNamesSameDefinitions2194() { 
     testWithPrefix("function A(){}" + "A.prototype.g=function(){return this.a};" + "function B(){}" + "B.prototype.g=function(){return this.a};", "var x=(new A).g();" + "var y=(new B).g();" + "var a=new A;" + "var ag=a.g();", "var x=(new A).a;" + "var y=(new B).a;" + "var a=new A;" + "var ag=a.a"); 
 } 


public void testEmptyMethodInlineInAssign12259() { 
     testWithPrefix("function Foo(){}" + "Foo.prototype.bar=function(){};", "var x=new Foo;var y=x.bar()", "var x=new Foo;var y=void 0"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Don't warn about argument naming conventions (this is done in another pass)
  //   opt_ parameters must not be followed by non-optional parameters.
  //   var_args must be last
  

  

  

  

  

  

  

  

  

  
}
