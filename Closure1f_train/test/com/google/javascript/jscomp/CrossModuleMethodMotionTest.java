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
 * Tests for {@link CrossModuleMethodMotion}.
 *
 * @author nicksantos@google.com (Nick Santos)
 */
public class CrossModuleMethodMotionTest extends CompilerTestCase {
  private static final String EXTERNS =
      "IFoo.prototype.bar; var mExtern; mExtern.bExtern; mExtern['cExtern'];";

  private boolean canMoveExterns = false;

  private final String STUB_DECLARATIONS =
      CrossModuleMethodMotion.STUB_DECLARATIONS;

  public CrossModuleMethodMotionTest() {
    super(EXTERNS);
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new CrossModuleMethodMotion(
        compiler, new CrossModuleMethodMotion.IdGenerator(), canMoveExterns);
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(true);
    canMoveExterns = false;
  }


public void testMovePrototypeMethod3641() { 
     testSame(createModuleChain("function Foo() {}" + "Foo.prototype = { get method() {} };", "(new Foo).method()")); 
 } 


public void testMovePrototypeRecursiveMethod1207() { 
     test(createModuleChain("function Foo() {}" + "Foo.prototype.baz = function() { this.baz(); };", "(new Foo).baz()"), new String[] { STUB_DECLARATIONS + "function Foo() {}" + "Foo.prototype.baz = JSCompiler_stubMethod(0);", "Foo.prototype.baz = JSCompiler_unstubMethod(0, " + "    function() { this.baz(); });" + "(new Foo).baz()" }); 
 } 


public void testPrototypeOfThisAssign1800() { 
     testSame(createModuleChain("/** @constructor */" + "function F() {}" + "this.prototype.foo = function() {};", "(new F()).foo();")); 
 } 


public void testMovePrototypeMethod21974() { 
     test(createModuleChain("function Foo() {}" + "Foo.prototype = { method: function() {} };", "(new Foo).method()"), new String[] { STUB_DECLARATIONS + "function Foo() {}" + "Foo.prototype = { method: JSCompiler_stubMethod(0) };", "Foo.prototype.method = " + "    JSCompiler_unstubMethod(0, function() {});" + "(new Foo).method()" }); 
 } 


public void testMoveMethodsInRightOrder2026() { 
     test(createModuleChain("function Foo() {}" + "Foo.prototype.baz = function() { return 1; };" + "Foo.prototype.baz = function() { return 2; };", "(new Foo).baz()"), new String[] { STUB_DECLARATIONS + "function Foo() {}" + "Foo.prototype.baz = JSCompiler_stubMethod(1);" + "Foo.prototype.baz = JSCompiler_stubMethod(0);", "Foo.prototype.baz = " + "JSCompiler_unstubMethod(1, function() { return 1; });" + "Foo.prototype.baz = " + "JSCompiler_unstubMethod(0, function() { return 2; });" + "(new Foo).baz()" }); 
 } 


public void testIssue6002280() { 
     testSame(createModuleChain("var jQuery1 = (function() {\n" + "  var jQuery2 = function() {};\n" + "  var theLoneliestNumber = 1;\n" + "  jQuery2.prototype = {\n" + "    size: function() {\n" + "      return theLoneliestNumber;\n" + "    }\n" + "  };\n" + "  return jQuery2;\n" + "})();\n", "(function() {" + "  var div = jQuery1('div');" + "  div.size();" + "})();")); 
 } 


public void testCantMovePrototypeProp2430() { 
     testSame(createModuleChain("function Foo() {}" + "Foo.prototype.baz = goog.nullFunction;", "(new Foo).baz()")); 
 } 

  

  

  

  

  

  

  

  

  

  
// Defects4J: flaky method
//   public void testTwoMethods() {
//     test(createModuleChain(
//              "function Foo() {}" +
//              "Foo.prototype.baz = function() {};",
//              // Module 2
//              "Foo.prototype.callBaz = function() { this.baz(); }",
//              // Module 3
//              "(new Foo).callBaz()"),
//          new String[] {
//              STUB_DECLARATIONS +
//              "function Foo() {}" +
//              "Foo.prototype.baz = JSCompiler_stubMethod(1);",
//              // Module 2
//              "Foo.prototype.callBaz = JSCompiler_stubMethod(0);",
//              // Module 3
//              "Foo.prototype.baz = JSCompiler_unstubMethod(1, function() {});" +
//              "Foo.prototype.callBaz = " +
//              "  JSCompiler_unstubMethod(0, function() { this.baz(); });" +
//              "(new Foo).callBaz()"
//          });
//   }

  

  

  // Read of closure variable disables method motions.
  

  // Read of global variable is fine.
  

  
// Defects4J: flaky method
//   public void testClosureVariableReads3() {
//     test(createModuleChain(
//             "function Foo() {}" +
//             "Foo.prototype.b1 = function() {" +
//             "  Foo.prototype.b2 = function() {" +
//             "    var x = 1;" +
//             "    Foo.prototype.b3 = function() {" +
//             "      x;" +
//             "    }" +
//             "  }" +
//             "};",
//             // Module 2
//             "var y = new Foo(); y.b1();",
//             // Module 3
//             "y = new Foo(); z.b2();",
//             // Module 4
//             "y = new Foo(); z.b3();"
//             ),
//          new String[] {
//            STUB_DECLARATIONS +
//            "function Foo() {}" +
//            "Foo.prototype.b1 = JSCompiler_stubMethod(0);",
//            // Module 2
//            "Foo.prototype.b1 = JSCompiler_unstubMethod(0, function() {" +
//            "  Foo.prototype.b2 = JSCompiler_stubMethod(1);" +
//            "});" +
//            "var y = new Foo(); y.b1();",
//            // Module 3
//            "Foo.prototype.b2 = JSCompiler_unstubMethod(1, function() {" +
//            "  var x = 1;" +
//            "  Foo.prototype.b3 = function() {" +
//            "    x;" +
//            "  }" +
//            "});" +
//            "y = new Foo(); z.b2();",
//            // Module 4
//            "y = new Foo(); z.b3();"
//         });
//   }

  // Read of global variable is fine.
  

  // Read of a local is fine.
  

  // An anonymous inner function reading a closure variable is fine.
  

  

  

  

  

  

  
}
