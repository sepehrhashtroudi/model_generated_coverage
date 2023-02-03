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
 * Verifies that valid candidates for object literals are inlined as
 * expected, and invalid candidates are not touched.
 *
 */
public class InlineObjectLiteralsTest extends CompilerTestCase {

  public InlineObjectLiteralsTest() {
    enableNormalize();
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(true);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new InlineObjectLiterals(
        compiler,
        compiler.getUniqueNameIdSupplier());
  }

  // Test object literal -> variable inlining


public void testObject2220() { 
     testLocal("while(1) { var a = {y:1}; if (b) a.x = 2; f(a.y, a.x);}", "for(;1;){" + " var JSCompiler_object_inline_y_0=1;" + " var JSCompiler_object_inline_x_1;" + " if(b) JSCompiler_object_inline_x_1=2;" + " f(JSCompiler_object_inline_y_0,JSCompiler_object_inline_x_1)" + "}"); 
     testLocal("var a; while (1) { f(a.x, a.y); a = {x:1, y:1};}", "var a; while (1) { f(a.x, a.y); a = {x:1, y:1};}"); 
 } 


public void testObject1a104() { 
     testLocal("var a; a = {x:x, y:y}; f(a.x, a.y);", "var JSCompiler_object_inline_x_0;" + "var JSCompiler_object_inline_y_1;" + "(JSCompiler_object_inline_x_0=x," + "JSCompiler_object_inline_y_1=y, true);" + "f(JSCompiler_object_inline_x_0, JSCompiler_object_inline_y_1);"); 
 } 


public void testObject15898() { 
     testSameLocal("x = x || {}; f(x.a);"); 
 } 


public void testObject91043() { 
     testSameLocal("function f(a,b) {" + "  var x = {a:a,b:b}; x.a(); return x.b;" + "}"); 
     testLocal("function f(a,b) {" + "  var x = {a:a,b:b}; g(x.a); x = {a:a,b:2}; return x.b;" + "}", "function f(a,b) {" + "  var JSCompiler_object_inline_a_0 = a;" + "  var JSCompiler_object_inline_b_1 = b;" + "  g(JSCompiler_object_inline_a_0);" + "  JSCompiler_object_inline_a_0 = a," + "  JSCompiler_object_inline_b_1=2," + "  true;" + "  return JSCompiler_object_inline_b_1" + "}"); 
     testLocal("function f(a,b) { " + "  var x = {a:a,b:b}; g(x.a); x.b = x.c = 2; return x.b; " + "}", "function f(a,b) { " + "  var JSCompiler_object_inline_a_0=a;" + "  var JSCompiler_object_inline_b_1=b; " + "  var JSCompiler_object_inline_c_2;" + "  g(JSCompiler_object_inline_a_0);" + "  JSCompiler_object_inline_b_1=JSCompiler_object_inline_c_2=2;" + "  return JSCompiler_object_inline_b_1" + "}"); 
 } 


public void testObject101327() { 
     testLocal("var x; var b = f(); x = {a:a, b:b}; if(x.a) g(x.b);", "var JSCompiler_object_inline_a_0;" + "var JSCompiler_object_inline_b_1;" + "var b = f();" + "JSCompiler_object_inline_a_0=a,JSCompiler_object_inline_b_1=b,true;" + "if(JSCompiler_object_inline_a_0) g(JSCompiler_object_inline_b_1)"); 
     testLocal("var x = {}; var b = f(); x = {a:a, b:b}; if(x.a) g(x.b) + x.c", "var x = {}; var b = f(); x = {a:a, b:b}; if(x.a) g(x.b) + x.c"); 
     testLocal("var x; var b = f(); x = {a:a, b:b}; x.c = c; if(x.a) g(x.b) + x.c", "var JSCompiler_object_inline_a_0;" + "var JSCompiler_object_inline_b_1;" + "var JSCompiler_object_inline_c_2;" + "var b = f();" + "JSCompiler_object_inline_a_0 = a,JSCompiler_object_inline_b_1 = b, " + "  JSCompiler_object_inline_c_2=void 0,true;" + "JSCompiler_object_inline_c_2 = c;" + "if (JSCompiler_object_inline_a_0)" + "  g(JSCompiler_object_inline_b_1) + JSCompiler_object_inline_c_2;"); 
     testLocal("var x = {a:a}; if (b) x={b:b}; f(x.a||x.b);", "var JSCompiler_object_inline_a_0 = a;" + "var JSCompiler_object_inline_b_1;" + "if(b) JSCompiler_object_inline_b_1 = b," + "      JSCompiler_object_inline_a_0 = void 0," + "      true;" + "f(JSCompiler_object_inline_a_0 || JSCompiler_object_inline_b_1)"); 
     testLocal("var x; var y = 5; x = {a:a, b:b, c:c}; if (b) x={b:b}; f(x.a||x.b);", "var JSCompiler_object_inline_a_0;" + "var JSCompiler_object_inline_b_1;" + "var JSCompiler_object_inline_c_2;" + "var y=5;" + "JSCompiler_object_inline_a_0=a," + "JSCompiler_object_inline_b_1=b," + "JSCompiler_object_inline_c_2=c," + "true;" + "if (b) JSCompiler_object_inline_b_1=b," + "       JSCompiler_object_inline_a_0=void 0," + "       JSCompiler_object_inline_c_2=void 0," + "       true;" + "f(JSCompiler_object_inline_a_0||JSCompiler_object_inline_b_1)"); 
 } 


public void testObject141590() { 
     testSameLocal("var x = {a:1}; if ('a' in x) { f(); }"); 
     testSameLocal("var x = {a:1}; for (var y in x) { f(y); }"); 
 } 


public void testObject131596() { 
     testSameLocal("var x = {a:1, b:2}; x = {a:3, b:x.a};"); 
 } 


public void testBug5452264() { 
     testLocal("var a = {}", ""); 
     testLocal("var a; a = {}", "true"); 
 } 


public void testNoInlineDeletedProperties2412() { 
     testSameLocal("var foo = {bar:1};" + "delete foo.bar;" + "return foo.bar;"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private final String LOCAL_PREFIX = "function local(){";
  private final String LOCAL_POSTFIX = "}";

  private void testLocal(String code, String result) {
    test(LOCAL_PREFIX + code + LOCAL_POSTFIX,
         LOCAL_PREFIX + result + LOCAL_POSTFIX);
  }

  private void testSameLocal(String code) {
    testLocal(code, code);
  }
}
