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

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import junit.framework.TestCase;

import java.util.Set;

import javax.annotation.Nullable;

/**
 * Unit tests for ExpressionDecomposer
 * @author johnlenz@google.com (John Lenz)
 */
public class ExpressionDecomposerTest extends TestCase {
  // Note: functions "foo" and "goo" are external functions
  // in the helper.


public void testExposeExpression289() { 
     helperExposeExpression("x = 1 || foo()", "foo", "var temp$$0; if (temp$$0 = 1); else temp$$0 = foo(); x = temp$$0;"); 
 } 


public void testExposePlusEquals2265() { 
     helperExposeExpression("var x = {}; x.a += foo() + 1", "foo", "var x = {}; var temp_const$$0 = x;" + "var temp_const$$1 = temp_const$$0.a;" + "temp_const$$0.a = temp_const$$1 + (foo() + 1);"); 
     helperExposeExpression("var x = {}; y = (x.a += foo()) + x.a", "foo", "var x = {}; var temp_const$$0 = x;" + "var temp_const$$1 = temp_const$$0.a;" + "y = (temp_const$$0.a = temp_const$$1 + foo()) + x.a"); 
 } 


public void testMoveExpression9409() { 
     helperMoveExpression("x = foo() || 1", "foo", "var result$$0 = foo(); x = result$$0 || 1"); 
 } 


public void testMoveExpression7471() { 
     helperMoveExpression("function f(){ return foo();}", "foo", "function f(){ var result$$0 = foo(); return result$$0;}"); 
 } 


public void testExposeExpression4850() { 
     helperExposeExpression("goo() && foo()", "foo", "if (goo()) foo();"); 
 } 


public void testMoveExpression3871() { 
     helperMoveExpression("var x = foo()", "foo", "var result$$0 = foo(); var x = result$$0;"); 
 } 


public void testCanExposeExpression11445() { 
     helperCanExposeExpression(DecompositionType.UNDECOMPOSABLE, "while(foo());", "foo"); 
     helperCanExposeExpression(DecompositionType.UNDECOMPOSABLE, "while(x = goo()&&foo()){}", "foo"); 
     helperCanExposeExpression(DecompositionType.UNDECOMPOSABLE, "while(x += goo()&&foo()){}", "foo"); 
     helperCanExposeExpression(DecompositionType.UNDECOMPOSABLE, "do{}while(foo());", "foo"); 
     helperCanExposeExpression(DecompositionType.UNDECOMPOSABLE, "for(;foo(););", "foo"); 
     helperCanExposeExpression(DecompositionType.UNDECOMPOSABLE, "for(;;foo());", "foo"); 
     helperCanExposeExpression(DecompositionType.UNDECOMPOSABLE, "switch(1){case foo():;}", "foo"); 
 } 


public void testCanExposeExpression61519() { 
     helperCanExposeExpression(DecompositionType.UNDECOMPOSABLE, "z:if (goo.a(1, foo()));", "foo"); 
 } 


public void testExposeExpression111719() { 
     helperExposeExpression("if (goo(1, goo(2), (1 ? foo() : 0)));", "foo", "var temp_const$$1 = goo;" + "var temp_const$$0 = goo(2);" + "var temp$$2;" + "if (1) temp$$2 = foo(); else temp$$2 = 0;" + "if (temp_const$$1(1, temp_const$$0, temp$$2));"); 
 } 


public void testCanExposeExpression81986() { 
     helperCanExposeExpression(DecompositionType.DECOMPOSABLE, "HangoutStarter.prototype.launchHangout = function() {\n" + "  var self = a.b;\n" + "  var myUrl = new goog.Uri(getDomServices_(self).getDomHelper()." + "getWindow().location.href);\n" + "};", "getDomServices_"); 
     helperExposeExpression("HangoutStarter.prototype.launchHangout = function() {\n" + "  var self = a.b;\n" + "  var myUrl = new goog.Uri(getDomServices_(self).getDomHelper()." + "getWindow().location.href);\n" + "};", "getDomServices_", "HangoutStarter.prototype.launchHangout = function() {" + "  var self = a.b;" + "  var temp_const$$0 = goog.Uri;" + "  var myUrl = new temp_const$$0(getDomServices_(self)." + "      getDomHelper().getWindow().location.href)}"); 
     helperMoveExpression("HangoutStarter.prototype.launchHangout = function() {" + "  var self = a.b;" + "  var temp_const$$0 = goog.Uri;" + "  var myUrl = new temp_const$$0(getDomServices_(self)." + "      getDomHelper().getWindow().location.href)}", "getDomServices_", "HangoutStarter.prototype.launchHangout = function() {" + "  var self=a.b;" + "  var temp_const$$0=goog.Uri;" + "  var result$$0=getDomServices_(self);" + "  var myUrl=new temp_const$$0(result$$0.getDomHelper()." + "      getWindow().location.href)}"); 
 } 


public void testMoveExpression62075() { 
     helperMoveExpression("switch(1 + foo()){}", "foo", "var result$$0 = foo(); switch(1 + result$$0){}"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /* Decomposition tests. */

  

  

  

  

  

  

  

  

  

  

  

  // Simple name on LHS of assignment-op.
  

  // Structure on LHS of assignment-op.
  

  // Constant object on LHS of assignment-op.
  

  // Function all on LHS of assignment-op.
  

  // Test multiple levels
  

  

  /** Test case helpers. */

  private void helperCanExposeExpression(
      DecompositionType expectedResult,
      String code,
      String fnName
      ) {
    helperCanExposeExpression(expectedResult, code, fnName, null);
  }

  private void helperCanExposeFunctionExpression(
      DecompositionType expectedResult, String code, int call) {
    Compiler compiler = getCompiler();
    Set<String> knownConstants = Sets.newHashSet();
    ExpressionDecomposer decomposer = new ExpressionDecomposer(
        compiler, compiler.getUniqueNameIdSupplier(), knownConstants);
    Node tree = parse(compiler, code);
    assertNotNull(tree);

    Node externsRoot = parse(compiler,
        "function goo() {}" +
        "function foo() {}");
    assertNotNull(externsRoot);
    Node mainRoot = tree;

    Node callSite = findCall(tree, null, 2);
    assertNotNull("Call " + call + " was not found.", callSite);

    compiler.resetUniqueNameId();
    DecompositionType result = decomposer.canExposeExpression(
        callSite);
    assertEquals(expectedResult, result);
  }

  private void helperCanExposeExpression(
      DecompositionType expectedResult,
      String code,
      String fnName,
      Set<String> knownConstants
      ) {
    Compiler compiler = getCompiler();
    if (knownConstants == null) {
      knownConstants = Sets.newHashSet();
    }
    ExpressionDecomposer decomposer = new ExpressionDecomposer(
        compiler, compiler.getUniqueNameIdSupplier(), knownConstants);
    Node tree = parse(compiler, code);
    assertNotNull(tree);

    Node externsRoot = parse(compiler,
        "function goo() {}" +
        "function foo() {}");
    assertNotNull(externsRoot);
    Node mainRoot = tree;

    Node callSite = findCall(tree, fnName);
    assertNotNull("Call to " + fnName + " was not found.", callSite);

    compiler.resetUniqueNameId();
    DecompositionType result = decomposer.canExposeExpression(
        callSite);
    assertEquals(expectedResult, result);
  }

  private void helperExposeExpression(
      String code,
      String fnName,
      String expectedResult
      ) {
    helperExposeExpression(
        code, fnName, expectedResult, null);
  }

  private void validateSourceInfo(Compiler compiler, Node subtree) {
    (new LineNumberCheck(compiler)).setCheckSubTree(subtree);
    // Source information problems are reported as compiler errors.
    if (compiler.getErrorCount() != 0) {
      String msg = "Error encountered: ";
      for (JSError err : compiler.getErrors()) {
        msg += err.toString() + "\n";
      }
      assertTrue(msg, compiler.getErrorCount() == 0);
    }
  }

  private void helperExposeExpression(
      String code,
      String fnName,
      String expectedResult,
      Set<String> knownConstants
      ) {
    Compiler compiler = getCompiler();
    if (knownConstants == null) {
      knownConstants = Sets.newHashSet();
    }
    ExpressionDecomposer decomposer = new ExpressionDecomposer(
        compiler, compiler.getUniqueNameIdSupplier(), knownConstants);
    decomposer.setTempNamePrefix("temp");
    decomposer.setResultNamePrefix("result");
    Node expectedRoot = parse(compiler, expectedResult);
    Node tree = parse(compiler, code);
    assertNotNull(tree);

    Node externsRoot = new Node(Token.EMPTY);
    Node mainRoot = tree;

    Node callSite = findCall(tree, fnName);
    assertNotNull("Call to " + fnName + " was not found.", callSite);

    DecompositionType result = decomposer.canExposeExpression(callSite);
    assertTrue(result == DecompositionType.DECOMPOSABLE);

    compiler.resetUniqueNameId();
    decomposer.exposeExpression(callSite);
    validateSourceInfo(compiler, tree);
    String explanation = expectedRoot.checkTreeEquals(tree);
    assertNull("\nExpected: " + compiler.toSource(expectedRoot) +
        "\nResult: " + compiler.toSource(tree) +
        "\n" + explanation, explanation);
  }

  private void helperMoveExpression(
      String code,
      String fnName,
      String expectedResult
      ) {
    helperMoveExpression(
        code, fnName, expectedResult, null);
  }

  private void helperMoveExpression(
      String code,
      String fnName,
      String expectedResult,
      Set<String> knownConstants
      ) {
    Compiler compiler = getCompiler();
    if (knownConstants == null) {
      knownConstants = Sets.newHashSet();
    }

    ExpressionDecomposer decomposer = new ExpressionDecomposer(
        compiler, compiler.getUniqueNameIdSupplier(), knownConstants);
    decomposer.setTempNamePrefix("temp");
    decomposer.setResultNamePrefix("result");
    Node expectedRoot = parse(compiler, expectedResult);
    Node tree = parse(compiler, code);
    assertNotNull(tree);

    Node externsRoot = new Node(Token.EMPTY);
    Node mainRoot = tree;

    Node callSite = findCall(tree, fnName);
    assertNotNull("Call to " + fnName + " was not found.", callSite);

    compiler.resetUniqueNameId();
    decomposer.moveExpression(callSite);
    validateSourceInfo(compiler, tree);
    String explanation = expectedRoot.checkTreeEquals(tree);
    assertNull("\nExpected: " + compiler.toSource(expectedRoot) +
        "\nResult: " + compiler.toSource(tree) +
        "\n" + explanation, explanation);
  }

  private static Compiler getCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    options.setCodingConvention(new GoogleCodingConvention());
    compiler.initOptions(options);
    return compiler;
  }

  private static Node findCall(Node n, String name) {
    return findCall(n, name, 1);
  }

  /**
   * @param name The name to look for.
   * @param call The call to look for.
   * @return The return the Nth CALL node to name found in a pre-order
   * traversal.
   */
  private static Node findCall(
      Node root, @Nullable final String name, final int call) {
    class Find {
      int found = 0;
      Node find(Node n) {
        if (n.isCall()) {
          Node callee = n.getFirstChild();
          if (name == null || (callee.isName()
              && callee.getString().equals(name))) {
            found++;
            if (found == call) {
              return n;
            }
          }
        }

        for (Node c : n.children()) {
          Node result = find(c);
          if (result != null) {
            return result;
          }
        }

        return null;
      }
    }

    return (new Find()).find(root);
  }

  private static Node parse(Compiler compiler, String js) {
    Node n = Normalize.parseAndNormalizeTestCode(compiler, js, "");
    assertEquals(0, compiler.getErrorCount());
    return n;
  }
}
