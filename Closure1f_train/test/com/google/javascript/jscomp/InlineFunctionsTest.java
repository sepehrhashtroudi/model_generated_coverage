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
 * Inline function tests.
 * @author johnlenz@google.com (john lenz)
 */
public class InlineFunctionsTest extends CompilerTestCase {
  boolean allowGlobalFunctionInlining = true;
  boolean allowBlockInlining = true;
  final boolean allowExpressionDecomposition = true;
  final boolean allowFunctionExpressionInlining = true;
  final boolean allowLocalFunctionInlining = true;
  boolean assumeStrictThis = false;
  boolean assumeMinimumCapture = false;

  public InlineFunctionsTest() {
    this.enableNormalize();
    this.enableMarkNoSideEffects();
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    super.enableLineNumberCheck(true);
    allowGlobalFunctionInlining = true;
    allowBlockInlining = true;
    assumeStrictThis = false;
    assumeMinimumCapture = false;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    compiler.resetUniqueNameId();
    return new InlineFunctions(
        compiler,
        compiler.getUniqueNameIdSupplier(),
        allowGlobalFunctionInlining,
        allowLocalFunctionInlining,
        allowBlockInlining,
        assumeStrictThis,
        assumeMinimumCapture);
  }

  /**
   * Returns the number of times the pass should be run before results are
   * verified.
   */
  @Override
  protected int getNumRepetitions() {
    // Some inlining can only be done in multiple passes.
    return 3;
  }


public void testInlineBlockMutableArgs437() { 
     test("function foo(x){x+x}foo({})", "{var x$$inline_0={};" + "x$$inline_0+x$$inline_0}"); 
 } 


public void testCostBasedInlining372() { 
     test("function foo(a,b){return a+b}" + "var b=foo;" + "function _t1(){return foo(1,2)}" + "function _t2(){return foo(2,3)}", "function foo(a,b){return a+b}" + "var b=foo;" + "function _t1(){return 1+2}" + "function _t2(){return 2+3}"); 
 } 


public void testShadowVariables16129() { 
     assumeMinimumCapture = false; 
     test("var a=3;" + "function foo(){return a}" + "(function(){var a=5;(function(){foo()})()})()", "var a=3;" + "{var a$$inline_0=5;{a}}"); 
     assumeMinimumCapture = true; 
     test("var a=3;" + "function foo(){return a}" + "(function(){var a=5;(function(){foo()})()})()", "var a=3;" + "{var a$$inline_1=5;{a}}"); 
 } 


public void testFunctionExpressionCallInlining11d185() { 
     assumeMinimumCapture = false; 
     testSame("function _x() {" + "  eval();" + "  ((function(){return function(){foo()}})())();" + "}"); 
     assumeMinimumCapture = true; 
     test("function _x() {" + "  eval();" + "  ((function(){return function(){foo()}})())();" + "}", "function _x() {" + "  eval();" + "  {foo()}" + "}"); 
 } 


public void testInlineWithThis5262() { 
     assumeStrictThis = false; 
     testSame("function f(){} f.call(g());"); 
     assumeStrictThis = true; 
     test("function f(){} f.call(g());", "{var JSCompiler_inline_this_0=g()}"); 
 } 


public void testCostBasedInliningComplex4581() { 
     testSame("function foo(a,b){a+b+a+b}" + "var b=foo;" + "function _t1(){foo(1,2)}" + "function _t2(){foo(2,3)}"); 
 } 


public void testFunctionExpressionOmega634() { 
     test("(function (f){f(f)})(function(f){f(f)})", "{var f$$inline_0=function(f$$1){f$$1(f$$1)};" + "{{f$$inline_0(f$$inline_0)}}}"); 
 } 


public void testComplexFunctionWithFunctionDefinition2a872() { 
     assumeMinimumCapture = false; 
     testSame("(function(){" + "var f = function(a){call(function(){return a})};f()})()"); 
     assumeMinimumCapture = true; 
     test("(function(){" + "var f = function(a){call(function(){return a})};f()})()", "{{var a$$inline_0=void 0;call(function(){return a$$inline_0})}}"); 
 } 


public void testNoInlineOfNonGlobalFunction1930() { 
     test("var g;function _f(){function g(){return 0}}" + "function _h(){return g()}", "var g;function _f(){}" + "function _h(){return g()}"); 
 } 


public void testInlineFunctions9978() { 
     test("function INC(x){return x++}" + "var y=INC(i)", "var y;{var x$$inline_0=i;" + "y=x$$inline_0++}"); 
 } 


public void testCostBasedInlining11988() { 
     test("function f(a){return a + a;}" + "var a = f(f(1))", "var a;" + "{var a$$inline_0=1+1;" + "a=a$$inline_0+a$$inline_0}"); 
 } 


public void testReplacePropertyFunction1026() { 
     test("function f(x) {return x} " + "foo(window, f); f(1)", "function f(x) {return x} " + "foo(window, f); 1"); 
     testSame("function f(x) {return x} " + "new JSCompiler_ObjectPropertyString(window, f); f(1)"); 
 } 


public void testShadowVariables41028() { 
     test("var a=0;" + "function foo(){return 3+a}" + "function _bar(a){a=foo(4)+a}", "var a=0;function _bar(a$$1){" + "a$$1=" + "3+a+a$$1}"); 
 } 


public void testCrossModuleInlining31253() { 
     testSame(createModuleChain("foo()", "function foo(){return f(1)+g(2)+h(3);}", "foo()")); 
     test(createModuleChain("foo()", "function foo(){return f();}", "foo()"), new String[] { "f();", "", "f();" }); 
 } 


public void testFunctionExpressionYCombinator1254() { 
     assumeMinimumCapture = false; 
     testSame("var factorial = ((function(M) {\n" + "      return ((function(f) {\n" + "                 return M(function(arg) {\n" + "                            return (f(f))(arg);\n" + "                            })\n" + "               })\n" + "              (function(f) {\n" + "                 return M(function(arg) {\n" + "                            return (f(f))(arg);\n" + "                           })\n" + "                 }));\n" + "     })\n" + "    (function(f) {\n" + "       return function(n) {\n" + "        if (n === 0)\n" + "          return 1;\n" + "        else\n" + "          return n * f(n - 1);\n" + "       };\n" + "     }));\n" + "\n" + "factorial(5)\n"); 
     assumeMinimumCapture = true; 
     test("var factorial = ((function(M) {\n" + "      return ((function(f) {\n" + "                 return M(function(arg) {\n" + "                            return (f(f))(arg);\n" + "                            })\n" + "               })\n" + "              (function(f) {\n" + "                 return M(function(arg) {\n" + "                            return (f(f))(arg);\n" + "                           })\n" + "                 }));\n" + "     })\n" + "    (function(f) {\n" + "       return function(n) {\n" + "        if (n === 0)\n" + "          return 1;\n" + "        else\n" + "          return n * f(n - 1);\n" + "       };\n" + "     }));\n" + "\n" + "factorial(5)\n", "var factorial;\n" + "{\n" + "var M$$inline_4 = function(f$$2) {\n" + "  return function(n){if(n===0)return 1;else return n*f$$2(n-1)}\n" + "};\n" + "{\n" + "var f$$inline_0=function(f$$inline_7){\n" + "  return M$$inline_4(\n" + "    function(arg$$inline_8){\n" + "      return f$$inline_7(f$$inline_7)(arg$$inline_8)\n" + "     })\n" + "};\n" + "factorial=M$$inline_4(\n" + "  function(arg$$inline_1){\n" + "    return f$$inline_0(f$$inline_0)(arg$$inline_1)\n" + "});\n" + "}\n" + "}" + "factorial(5)"); 
 } 


public void testLocalFunctionInlining51360() { 
     testSame("function _f(){ function g() {this;} g() }"); 
 } 


public void testIssue7281402() { 
     String f = "var f = function() { return false; };"; 
     StringBuilder calls = new StringBuilder(); 
     StringBuilder folded = new StringBuilder(); 
     for (int i = 0; i < 30; i++) { 
         calls.append("if (!f()) alert('x');"); 
         folded.append("if (!false) alert('x');"); 
     } 
     test(f + calls, folded.toString()); 
 } 


public void testInlineFunctions291495() { 
     test("var window = {}; function foo(){window.bar++; return 3;}" + "var x = {a: alert(), b: alert2(), c: foo(2)};", "var window = {};" + "var JSCompiler_temp_const$$1 = alert();" + "var JSCompiler_temp_const$$0 = alert2();" + "var JSCompiler_inline_result$$2;" + "{" + " window.bar++;" + " JSCompiler_inline_result$$2 = 3;}" + "var x = {" + "  a: JSCompiler_temp_const$$1," + "  b: JSCompiler_temp_const$$0," + "  c: JSCompiler_inline_result$$2" + "};"); 
 } 


public void testInlineWithThis61551() { 
     assumeStrictThis = false; 
     testSame("function f(){this} f.call(new g);"); 
     assumeStrictThis = true; 
     test("function f(){this} f.call(new g);", "{var JSCompiler_inline_this_0=new g;JSCompiler_inline_this_0}"); 
 } 


public void testFunctionExpressionCallInlining81613() { 
     test("a:(function(){}).call(this)", "a:void 0"); 
 } 


public void testInlineFunctions311634() { 
     test("function foo(){ lab:{4;} }" + "lab:{foo();}", "lab:{{JSCompiler_inline_label_0:{4}}}"); 
 } 


public void testAnonymous21787() { 
     testSame("(function(){eval();(function(){var b=a;a++;alert(b)})()})();"); 
 } 


public void testInlineFunctions211835() { 
     test("function foo(a, b){return a+b}" + "function bar(d){return c}" + "var d=bar(foo(1,e))", "var d;{d=c}"); 
 } 


public void testComplexNoInline11881() { 
     testSame("function f(){a()}while(z=f())continue"); 
 } 


public void testFunctionExpressionCallInlining32040() { 
     test("var a = (function(){return foo(this)}).call(this)", "var a = foo(this)"); 
 } 


public void testRenamePropertyFunction2105() { 
     testSame("function JSCompiler_renameProperty(x) {return x} " + "JSCompiler_renameProperty('foo')"); 
 } 


public void testInlineFunctions102118() { 
     test("function INC(x){return x++}" + "var y=INC(i);y=INC(i)", "var y;" + "{var x$$inline_0=i;" + "y=x$$inline_0++}" + "{var x$$inline_2=i;" + "y=x$$inline_2++}"); 
 } 


public void testInlineFunctionWithArgsMismatch12165() { 
     test("function f(g) { return g; } f();", "void 0"); 
 } 


public void testCostBasedInlining12254() { 
     testSame("function foo(a){return a}" + "foo=new Function(\"return 1\");" + "foo(1)"); 
 } 


public void testComplexInlineInExpresssions32284() { 
     test("function f(){a()}c=z=f()", "var JSCompiler_inline_result$$0;" + "{a();JSCompiler_inline_result$$0=void 0;}" + "c=z=JSCompiler_inline_result$$0"); 
 } 


public void testFunctionExpressionCallInlining22310() { 
     test("(function(){foo(this)}).call(this)", "{foo(this)}"); 
 } 


public void testIssue4232313() { 
     assumeMinimumCapture = false; 
     test("(function($) {\n" + "  $.fn.multicheck = function(options) {\n" + "    initialize.call(this, options);\n" + "  };\n" + "\n" + "  function initialize(options) {\n" + "    options.checkboxes = $(this).siblings(':checkbox');\n" + "    preload_check_all.call(this);\n" + "  }\n" + "\n" + "  function preload_check_all() {\n" + "    $(this).data('checkboxes');\n" + "  }\n" + "})(jQuery)", "(function($){" + "  $.fn.multicheck=function(options$$1){" + "    {" + "     options$$1.checkboxes=$(this).siblings(\":checkbox\");" + "     {" + "       $(this).data(\"checkboxes\")" + "     }" + "    }" + "  }" + "})(jQuery)"); 
     assumeMinimumCapture = true; 
     test("(function($) {\n" + "  $.fn.multicheck = function(options) {\n" + "    initialize.call(this, options);\n" + "  };\n" + "\n" + "  function initialize(options) {\n" + "    options.checkboxes = $(this).siblings(':checkbox');\n" + "    preload_check_all.call(this);\n" + "  }\n" + "\n" + "  function preload_check_all() {\n" + "    $(this).data('checkboxes');\n" + "  }\n" + "})(jQuery)", "{var $$$inline_0=jQuery;\n" + "$$$inline_0.fn.multicheck=function(options$$inline_4){\n" + "  {options$$inline_4.checkboxes=" + "$$$inline_0(this).siblings(\":checkbox\");\n" + "  {$$$inline_0(this).data(\"checkboxes\")}" + "  }\n" + "}\n" + "}"); 
 } 


public void testShadowVariables52345() { 
     allowBlockInlining = false; 
     testSame("var a=0;" + "function foo(){var a=4;return 3+a}" + "function _bar(a){a=foo(4)+a}"); 
 } 


public void testInlineNeverOverrideNewValues2379() { 
     test("function f(a){return++a<++a}f(1)", "{var a$$inline_0=1;" + "++a$$inline_0<++a$$inline_0}"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Test redefinition of parameter name.
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // http://en.wikipedia.org/wiki/Fixed_point_combinator#Y_combinator
  

  

  

  

  

  

  

  private static class StringCompare extends CompilerTestCase {
    private boolean allowGlobalFunctionInlining = true;

    StringCompare() {
      super("", false);
      this.enableNormalize();
      this.enableMarkNoSideEffects();
    }

    @Override
    public void setUp() throws Exception {
      super.setUp();
      super.enableLineNumberCheck(true);
      allowGlobalFunctionInlining = true;
    }

    @Override
    protected CompilerPass getProcessor(Compiler compiler) {
      compiler.resetUniqueNameId();
      return new InlineFunctions(
          compiler,
          compiler.getUniqueNameIdSupplier(),
          allowGlobalFunctionInlining,
          true,  // allowLocalFunctionInlining
          true,  // allowBlockInlining
          true,  // assumeStrictThis
          true); // assumeMinimumCapture
    }

    
  }

  

  

  

  

  

  


  

  

  // Inline a single reference function into deeper modules
  

  // Inline a single reference function into shallow modules, only if it
  // is cheaper than the call itself.
  

  // Inline a multi-reference functions into shallow modules, only if it
  // is cheaper than the call itself.
  
  
  

}
