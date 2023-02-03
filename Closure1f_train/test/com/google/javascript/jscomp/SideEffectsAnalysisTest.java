/*
 * Copyright 2010 The Closure Compiler Authors.
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

import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstractionMode;
import com.google.javascript.rhino.Node;

/**
 * Tests for {@link SideEffectsAnalysis}.
 *
 * @author dcc@google.com (Devin Coughlin)
 *
 */
public class SideEffectsAnalysisTest extends CompilerTestCase {

  private static final String SHARED_EXTERNS = "var arguments = [];";

  LocationAbstractionMode currentLocationAbstractionIdentifier;

  SideEffectsAnalysis currentAnalysis = null;

  Compiler currentCompiler = null;

  Node currentJsRoot = null;

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    currentCompiler = compiler;

    currentAnalysis = new SideEffectsAnalysis(compiler,
        currentLocationAbstractionIdentifier);

    return new CompilerPass() {

      @Override
      public void process(Node externs, Node root) {

        if (currentLocationAbstractionIdentifier ==
          LocationAbstractionMode.VISIBILITY_BASED) {

          // Run var when using the visibility abstraction
          // because it is unsound if it fails.

          final VarCheck varCheck = new VarCheck(compiler);

          varCheck.process(externs, root);
        }

        currentAnalysis.process(externs, root);

      }
    };
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();

    currentAnalysis = null;
    currentCompiler = null;
  }


public void testVisibilityMoveCalls235() { 
     assertUnsafeMoveVisibility("var x = {};" + "var g = function(){};" + "function f(){" + "var y;" + "src: g();" + "env: x;" + "dest: 3;" + "}"); 
     assertUnsafeMoveVisibility("var x = {};" + "var g = function(){};" + "function f(){" + "var y;" + "src: x;" + "env: g();" + "dest: 3;" + "}"); 
 } 


public void testVisibilityUnsafeMoves267() { 
     assertUnsafeMoveVisibility("var x,y; src: x++; env: y; dest: 3;"); 
     assertUnsafeMoveVisibility("function f() {" + "var x,y; src: x++; env: y; dest: 3;" + "}"); 
     assertUnsafeMoveVisibility("function f() {" + "var x,y; src: x++; env: y; dest: 3;" + "function inner() {" + "x; y;" + "}" + "}"); 
     assertUnsafeMoveVisibility("var x,y; src: x.a++; env: y.b; dest: 3;"); 
     assertUnsafeMoveVisibility("var x,y; src: y; env: x++; dest: 3;"); 
     assertUnsafeMoveVisibility("function f() {" + "var x,y; src: x; env: y++; dest: 3;" + "}"); 
     assertUnsafeMoveVisibility("function f() {" + "var x,y; src: x; env: y++; dest: 3;" + "function inner() {" + "x; y;" + "}" + "}"); 
     assertUnsafeMoveVisibility("var x,y; src: x.a; env: y.b++; dest: 3;"); 
     assertUnsafeMoveVisibility("var x,y; src: x = 7; env: y = 3; dest: 3;"); 
     assertUnsafeMoveVisibility("function f() {" + "var x,y; src: x = 7; env: y = 3; dest: 3;" + "}"); 
     assertUnsafeMoveVisibility("function f() {" + "var x,y; src: x = 7; env: y = 3; dest: 3;" + "function inner() {" + "x; y;" + "}" + "}"); 
     assertUnsafeMoveVisibility("var x,y; src: x.a = 7; env: y.b = 3; dest: 3;"); 
 } 


public void testMovedSideEffectsMustHaveSameControlFlow530() { 
     assertSafeMoveVisibility("var a;" + "function f() {" + "var l;" + "if (l) {" + "src: a++;" + "env: 3;" + "dest: 3;" + "}" + "}"); 
     assertUnsafeMoveVisibility("var a;" + "function f() {" + "var l;" + "if (l) {" + "src: a++;" + "env: 3;" + "}" + "if (l) {" + "dest: 3;" + "}" + "}"); 
     assertUnsafeMoveVisibility("var a;" + "function f() {" + "var l;" + "if (l) {" + "src: a++;" + "env: 3;" + "} else {" + "dest: 3;" + "}" + "}"); 
     assertSafeMoveVisibility("var a;" + "function f() {" + "var l;" + "while (l) {" + "src: a++;" + "env: 3;" + "dest: 3;" + "}" + "}"); 
     assertUnsafeMoveVisibility("var a;" + "function f() {" + "var l;" + "while (l) {" + "src: a++;" + "env: l;" + "break;" + "dest: 3;" + "}" + "}"); 
     assertUnsafeMoveVisibility("var a;" + "function f() {" + "var l;" + "while (l) {" + "src: a++;" + "env: 3;" + "continue;" + "dest: 3;" + "}" + "}"); 
     assertUnsafeMoveVisibility("var a;" + "function f() {" + "var l;" + "while (l) {" + "src: a++;" + "env: 3;" + "return;" + "dest: 3;" + "}" + "}"); 
     assertSafeMoveVisibility("var a;" + "function f() {" + "var l;" + "do {" + "src: a++;" + "env: 3;" + "dest: 3;" + "} while(l)" + "}"); 
     assertUnsafeMoveVisibility("var a;" + "function f() {" + "var l;" + "do {" + "src: a++;" + "env: 3;" + "} while(l)" + "dest: 3;" + "}"); 
     assertUnsafeMoveVisibility("var a;" + "function f() {" + "var l;" + "switch(l) {" + "case 17:" + "src: a++;" + "env: 3;" + "dest: 3;" + "break;" + "}" + "}"); 
     assertUnsafeMoveVisibility("var a;" + "function f() {" + "var l;" + "switch(l) {" + "case 17:" + "src: a++;" + "env: 3;" + "break;" + "case 18:" + "dest: 3;" + "break;" + "}" + "}"); 
     assertUnsafeMoveVisibility("var a;" + "function f() {" + "src: a++;" + "env: 3;" + "}" + "function g() {" + "dest: 3;" + "}"); 
 } 


public void testDegenerateSafeMoves621() { 
     assertSafeMoveDegenerate("src: 1; env: ; dest: 3;"); 
     assertSafeMoveDegenerate("src: 1; env: 2; dest: 3;"); 
     assertSafeMoveDegenerate("src: 1; env: x; dest: 3;"); 
     assertSafeMoveDegenerate("src: x; env: 1; dest: 3;"); 
     assertSafeMoveDegenerate("src: 1; env: x++; dest: 3;"); 
     assertSafeMoveDegenerate("src: x++; env: 1; dest: 3;"); 
 } 


public void testVisibilityMergesParametersWithHeap1108() { 
     assertUnsafeMoveVisibility("var x = {};" + "function f(y){" + "src: x[0]++;" + "env: y;" + "dest: 3;" + "}"); 
     assertUnsafeMoveVisibility("var x = {};" + "function f(y){" + "src: x[0];" + "env: y++;" + "dest: 3;" + "}"); 
     assertUnsafeMoveVisibility("var x = {};" + "function f(y){" + "src: arguments[0]++;" + "env: y;" + "dest: 3;" + "}"); 
     assertUnsafeMoveVisibility("var x = {};" + "function f(y){" + "src: arguments[0];" + "env: y++;" + "dest: 3;" + "}"); 
 } 


public void testVisibilitySafeMoves2368() { 
     assertSafeMoveVisibility("src: 1; env: ; dest: 3;"); 
     assertSafeMoveVisibility("src: 1; env: 2; dest: 3;"); 
     assertSafeMoveVisibility("var x; src: 1; env: x; dest: 3;"); 
     assertSafeMoveVisibility("var x; src: x; env: 1; dest: 3;"); 
     assertSafeMoveVisibility("var x; src: 1; env: x++; dest: 3;"); 
     assertSafeMoveVisibility("var x; src: x++; env: 1; dest: 3;"); 
     assertSafeMoveVisibility("var x;" + "function f(){" + "var y;" + "src: x;" + "env: y++;" + "dest: 3;" + "}"); 
     assertSafeMoveVisibility("var x;" + "function f(){" + "var y;" + "src: x++;" + "env: y;" + "dest: 3;" + "}"); 
     assertSafeMoveVisibility("var x;" + "var y;" + "function f(){" + "var y;" + "src: x;" + "env: y++;" + "dest: 3;" + "}"); 
     assertSafeMoveVisibility("var x;" + "var y;" + "function f(){" + "var y;" + "src: x++;" + "env: y;" + "dest: 3;" + "}"); 
     assertSafeMoveVisibility("function f(){" + "var x;" + "var y;" + "src: x;" + "env: y++;" + "dest: 3;" + "function inner() {" + "x" + "}" + "}"); 
     assertSafeMoveVisibility("function f(){" + "var x;" + "var y;" + "src: x++;" + "env: y;" + "dest: 3;" + "function inner() {" + "x" + "}" + "}"); 
     assertSafeMoveVisibility("var x = {};" + "function f(){" + "var y;" + "src: x.a;" + "env: y++;" + "dest: 3;" + "}"); 
     assertSafeMoveVisibility("var x = {};" + "function f(){" + "var y;" + "src: x.a++;" + "env: y;" + "dest: 3;" + "}"); 
     assertSafeMoveVisibility("var x = {};" + "src: x.a;" + "env: (function() {" + "x.a++;" + "});" + "dest: 3;"); 
     assertSafeMoveVisibility("var x = {};" + "src: x.a++;" + "env: (function() {" + "x.a;" + "});" + "dest: 3;"); 
 } 

  

  

  

  

  

  

  

  private SideEffectsAnalysis.AbstractMotionEnvironment environment(
      Node ...nodes) {

    return new SideEffectsAnalysis.RawMotionEnvironment(
        ImmutableSet.copyOf(nodes));
  }

  private void assertMove(LocationAbstractionMode abstraction,
      String src,
      boolean expected) {
    SideEffectsAnalysis analysis = compileAndRun(src, abstraction);

    Node sourceNode = findLabeledStatement("src");
    Node environmentNode = findLabeledStatement("env");
    Node destinationNode = findLabeledStatement("dest");

    boolean result = analysis.safeToMoveBefore(sourceNode,
        environment(environmentNode), destinationNode);

    if (expected) {
      assertTrue(result);
    } else {
      assertFalse(result);
    }
  }

  private void assertSafeMoveDegenerate(String src) {
    assertMove(LocationAbstractionMode.DEGENERATE, src, true);
  }

  private void assertUnsafeMoveDegenerate(String src) {
    assertMove(LocationAbstractionMode.DEGENERATE, src, false);
  }

  private void assertSafeMoveVisibility(String src) {
    assertMove(LocationAbstractionMode.VISIBILITY_BASED, src, true);
  }

  private void assertUnsafeMoveVisibility(String src) {
    assertMove(LocationAbstractionMode.VISIBILITY_BASED, src, false);
  }

  private SideEffectsAnalysis compileAndRun(String js,
      LocationAbstractionMode locationAbstractionIdentifier) {

    currentLocationAbstractionIdentifier = locationAbstractionIdentifier;

    testSame(SHARED_EXTERNS, js, null);

    currentJsRoot = currentCompiler.jsRoot;

    return currentAnalysis;
  }

  // Shamelessly stolen from NameReferenceGraphConstructionTest
  private Node findLabeledStatement(String label) {
    LabeledStatementSearcher s = new LabeledStatementSearcher(label);

    new NodeTraversal(currentCompiler, s).traverse(currentCompiler.jsRoot);
    assertNotNull("Label " + label + " should be in the source code", s.found);

    return s.found;
  }

  /**
   * Quick traversal to find a given labeled statement in the AST.
   *
   * Given "foo", finds the statement a = x in
   * foo: a = x;
   */
  private class LabeledStatementSearcher extends AbstractPostOrderCallback {
    Node found = null;
    final String target;

    LabeledStatementSearcher(String target) {
      this.target = target;
    }
    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      if (n.isLabel() &&
          target.equals(n.getFirstChild().getString())) {

        found = n.getLastChild();
      }
    }
  }
}
