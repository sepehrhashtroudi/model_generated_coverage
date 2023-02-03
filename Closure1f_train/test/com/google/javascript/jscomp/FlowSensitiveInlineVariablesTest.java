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

import com.google.javascript.rhino.Node;

/**
 * Unit tests for {@link FlowSensitiveInlineVariables}.
 *
 */
public class FlowSensitiveInlineVariablesTest extends CompilerTestCase  {

  public static final String EXTERN_FUNCTIONS = "" +
      "var print;\n" +
      "/** @nosideeffects */ function noSFX() {} \n" +
      "                      function hasSFX() {} \n";

  public FlowSensitiveInlineVariablesTest() {
    enableNormalize(true);
  }

  @Override
  public int getNumRepetitions() {
    // Test repeatedly inline.
    return 3;
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    //return new FlowSensitiveInlineVariables(compiler);
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        (new MarkNoSideEffectCalls(compiler)).process(externs, root);
        (new FlowSensitiveInlineVariables(compiler)).process(externs, root);
      }
    };
  }


public void testDoNotInlineWithinLoop230() { 
     noInline("var y = noSFX(); do { var z = y.foo(); } while (true);"); 
 } 


public void testMultiUseInSameCfgNode577() { 
     noInline("var x; x = 1; print(x) || print (x);"); 
 } 


public void testNoInlineArrayLits734() { 
     noInline("var x = []; print(x)"); 
 } 


public void testAssignmentBeforeDefinition742() { 
     inline("x = 1; var x = 0; print(x)", "x = 1; var x; print(0)"); 
 } 


public void testInlineExpressions41012() { 
     noInline("var a,b,x; x=a+b, x=a-b; print(x)"); 
 } 


public void testDoNotInlineCatchExpression41023() { 
     noInline("try {\n" + " stuff();\n" + "} catch (e) {\n" + " x = e;\n" + " print(x);\n" + "}"); 
 } 


public void testNoInlineGetProp31081() { 
     inline("var x = function(){1 * a.b.c}; print(x);", "var x; print(function(){1 * a.b.c});"); 
 } 


public void testInlineExpressions11110() { 
     inline("var a, b; var x = a+b; print(x)", "var a, b; var x; print(a+b)"); 
 } 


public void testForIn1135() { 
     noInline("var x; var y = {}; for(x in y){}"); 
     noInline("var x; var y = {}; var z; for(x in z = y){print(z)}"); 
     noInline("var x; var y = {}; var z; for(x in y){print(z)}"); 
 } 


public void testDoNotInlineCatchExpression1a1392() { 
     noInline("var a;\n" + "try {\n" + "  throw Error(\"\");\n" + "}catch(err) {" + "   a = err + 1;\n" + "}\n" + "return a.stack\n"); 
 } 


public void testNoInlineObjectLits1410() { 
     noInline("var x = {}; print(x)"); 
 } 


public void testDoNotInlineCatchExpression31469() { 
     noInline("var a;\n" + "try {\n" + "  throw Error(\"\");\n" + "} catch(err) {" + "  err = x;\n" + "  a = err;\n" + "}\n" + "return a.stack\n"); 
 } 


public void testInlineExpressions51492() { 
     noInline("var a; var x = a = 1; print(x)"); 
 } 


public void testNoInlineRegExpLits1523() { 
     noInline("var x = /y/; print(x)"); 
 } 


public void testSimpleForIn1722() { 
     inline("var a,b,x = a in b; x", "var a,b,x; a in b"); 
     noInline("var a, b; var x = a in b; print(1); x"); 
     noInline("var a,b,x = a in b; delete a[b]; x"); 
 } 


public void testInlineExpression71813() { 
     noInline("var x = foo() + 1; bar(); print(x)"); 
     noInline("var x = foo() + 1; print(x)"); 
 } 


public void testMultiDefinitionsInSameCfgNode1905() { 
     noInline("var x; (x = 1) || (x = 2); print(x)"); 
     noInline("var x; x = (1 || (x = 2)); print(x)"); 
     noInline("var x;(x = 1) && (x = 2); print(x)"); 
     noInline("var x;x = (1 && (x = 2)); print(x)"); 
     noInline("var x; x = 1 , x = 2; print(x)"); 
 } 


public void testExported1943() { 
     noInline("var _x = 1; print(_x)"); 
 } 


public void testDoNotInlineIntoLhsOfAssign2056() { 
     noInline("var x = 1; x += 3;"); 
 } 


public void testCanInlineAcrossNoSideEffect2185() { 
     noInline("var y; var x = noSFX(y), z = noSFX(); noSFX(); noSFX(), print(x)"); 
 } 


public void testInlineArguments2305() { 
     testSame("function _func(x) { print(x) }"); 
     testSame("function _func(x,y) { if(y) { x = 1 }; print(x) }"); 
     test("function f(x, y) { x = 1; print(x) }", "function f(x, y) { print(1) }"); 
     test("function f(x, y) { if (y) { x = 1; print(x) }}", "function f(x, y) { if (y) { print(1) }}"); 
 } 


public void testDoNotInlineCatchExpression22319() { 
     noInline("var a;\n" + "try {\n" + "  if (x) {throw Error(\"\");}\n" + "}catch(err) {" + "   a = err;\n" + "}\n" + "return a.stack\n"); 
 } 


public void testMultiUse2333() { 
     noInline("var x; x = 1; print(x); print (x);"); 
 } 


public void testTransitiveDependencies22455() { 
     test("function f(x) { var a = x; var b = a; var c = b; x = 3; return c; }", "function f(x) { var a    ; var b = x; var c    ; x = 3; return b; }"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // TODO(user): These should be inlinable.
  

  // TODO(user): These should be inlinable.
  

  // TODO(user): These should be inlinable.
  

  // TODO(user): These should be inlinable after the REGEX checks.
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void noInline(String input) {
    inline(input, input);
  }

  private void inline(String input, String expected) {
    test(EXTERN_FUNCTIONS, "function _func() {" + input + "}",
        "function _func() {" + expected + "}", null, null);
  }
}
