/*
 * Copyright 2006 The Closure Compiler Authors.
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
 * Tests for {@link RemoveUnusedPrototypeProperties}.
 *
 * @author nicksantos@google.com (Nick Santos)
 */
public class RemoveUnusedPrototypePropertiesTest extends CompilerTestCase {
  private static final String EXTERNS =
      "IFoo.prototype.bar; var mExtern; mExtern.bExtern; mExtern['cExtern'];";

  private boolean canRemoveExterns = false;
  private boolean anchorUnusedVars = false;

  public RemoveUnusedPrototypePropertiesTest() {
    super(EXTERNS);
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new RemoveUnusedPrototypeProperties(compiler,
        canRemoveExterns, anchorUnusedVars);
  }

  @Override
  public void setUp() {
    anchorUnusedVars = false;
    canRemoveExterns = false;
  }


public void testAliasing7146() { 
     testSame("function e(){}" + "e.prototype['alias1'] = e.prototype.method1 = " + "function(){this.method2()};" + "e.prototype.method2 = function(){};"); 
 } 


public void testAnalyzePrototypeProperties263() { 
     test("function e(){}" + "e.prototype.a = function(){};" + "e.prototype.b = function(){};" + "var x = new e; x.a()", "function e(){}" + "e.prototype.a = function(){};" + "var x = new e; x.a()"); 
     test("function e(){}" + "e.prototype = {a: function(){}, b: function(){}};" + "var x=new e; x.a()", "function e(){}" + "e.prototype = {a: function(){}};" + "var x = new e; x.a()"); 
     test("function e(){}" + "e.prototype.a = function(){};" + "e.prototype.bExtern = function(){};" + "var x = new e;x.a()", "function e(){}" + "e.prototype.a = function(){};" + "e.prototype.bExtern = function(){};" + "var x = new e; x.a()"); 
     test("function e(){}" + "e.prototype = {a: function(){}, bExtern: function(){}};" + "var x = new e; x.a()", "function e(){}" + "e.prototype = {a: function(){}, bExtern: function(){}};" + "var x = new e; x.a()"); 
 } 


public void testPropertyReferenceGraph339() { 
     String constructor = "function Foo() {}"; 
     String defA = "Foo.prototype.a = function() { Foo.superClass_.a.call(this); };"; 
     String defB = "Foo.prototype.b = function() { this.a(); };"; 
     String defC = "Foo.prototype.c = function() { " + "Foo.superClass_.c.call(this); this.b(); this.a(); };"; 
     String defD = "Foo.prototype.d = function() { this.c(); };"; 
     String defE = "Foo.prototype.e = function() { this.a(); this.f(); };"; 
     String defF = "Foo.prototype.f = function() { };"; 
     String fullClassDef = constructor + defA + defB + defC + defD + defE + defF; 
     test(fullClassDef, ""); 
     String callA = "(new Foo()).a();"; 
     String callB = "(new Foo()).b();"; 
     String callC = "(new Foo()).c();"; 
     String callD = "(new Foo()).d();"; 
     String callE = "(new Foo()).e();"; 
     String callF = "(new Foo()).f();"; 
     test(fullClassDef + callA, constructor + defA + callA); 
     test(fullClassDef + callB, constructor + defA + defB + callB); 
     test(fullClassDef + callC, constructor + defA + defB + defC + callC); 
     test(fullClassDef + callD, constructor + defA + defB + defC + defD + callD); 
     test(fullClassDef + callE, constructor + defA + defE + defF + callE); 
     test(fullClassDef + callF, constructor + defF + callF); 
     test(fullClassDef + callA + callC, constructor + defA + defB + defC + callA + callC); 
     test(fullClassDef + callB + callC, constructor + defA + defB + defC + callB + callC); 
     test(fullClassDef + callA + callB + callC, constructor + defA + defB + defC + callA + callB + callC); 
 } 


public void testExportedMethodsByNamingConvention1455() { 
     String classAndItsMethodAliasedAsExtern = "function Foo() {}" + "Foo.prototype.method = function() {};" + "Foo.prototype.unused = function() {};" + "var _externInstance = new Foo();" + "Foo.prototype._externMethod = Foo.prototype.method"; 
     String compiled = "function Foo(){}" + "Foo.prototype.method = function(){};" + "var _externInstance = new Foo;" + "Foo.prototype._externMethod = Foo.prototype.method"; 
     test(classAndItsMethodAliasedAsExtern, compiled); 
 } 


public void testAliasing22032() { 
     test("function e(){}" + "e.prototype.method1 = function(){};" + "e.prototype.alias1 = e.prototype.method1;" + "(new e).method1()", "function e(){}" + "e.prototype.method1 = function(){};" + "(new e).method1()"); 
     test("function e(){}" + "e.prototype.method1 = function(){};" + "e.prototype.alias1 = e.prototype.method1;" + "(new e).alias1()", "function e(){}" + "e.prototype.method1 = function(){};" + "e.prototype.alias1 = e.prototype.method1;" + "(new e).alias1()"); 
 } 


public void testGetter12267() { 
     test("function Foo() {}" + "Foo.prototype = { " + "  get methodA() {}," + "  get methodB() { x(); }" + "};" + "function x() { (new Foo).methodA; }", "function Foo() {}" + "Foo.prototype = {};"); 
     anchorUnusedVars = true; 
     test("function Foo() {}" + "Foo.prototype = { " + "  get methodA() {}," + "  get methodB() { x(); }" + "};" + "function x() { (new Foo).methodA; }", "function Foo() {}" + "Foo.prototype = { " + "  get methodA() {}" + "};" + "function x() { (new Foo).methodA; }"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

}
