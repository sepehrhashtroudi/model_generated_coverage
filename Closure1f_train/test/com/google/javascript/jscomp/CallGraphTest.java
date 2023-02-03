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

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CallGraph.Callsite;
import com.google.javascript.jscomp.CallGraph.Function;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Tests for CallGraph.
 *
 * @author dcc@google.com (Devin Coughlin)
 */
public class CallGraphTest extends CompilerTestCase {

  private CallGraph currentProcessor;

  private boolean createForwardCallGraph;
  private boolean createBackwardCallGraph;

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    // We store the new callgraph so it can be tested later
    currentProcessor = new CallGraph(compiler, createForwardCallGraph,
        createBackwardCallGraph);

    return currentProcessor;
  }

  static final String SHARED_EXTERNS =
      "var ExternalFunction = function(a) {}\n" +
      "var externalnamespace = {}\n" +
      "externalnamespace.prop = function(){};\n";


public void testGetDirectedGraph_forwardOnBackward82() { 
     String source = "function A(){B()};\n" + "function B(){C();D()}\n" + "function C(){B()};\n" + "function D(){};\n" + "function E(){C()};\n" + "function X(){Y()};\n" + "function Y(){Z()};\n" + "function Z(){};" + "B();\n"; 
     CallGraph callgraph = compileAndRunBackward(source); 
     final Set<Function> reachableFunctions = Sets.newHashSet(); 
     reachableFunctions.add(callgraph.getMainFunction()); 
     reachableFunctions.add(callgraph.getUniqueFunctionWithName("X")); 
     EdgeCallback<CallGraph.Function, CallGraph.Callsite> edgeCallback = new EdgeCallback<CallGraph.Function, CallGraph.Callsite>() { 
  
         @Override 
         public boolean traverseEdge(Function caller, Callsite callsite, Function callee) { 
             boolean changed; 
             if (reachableFunctions.contains(caller)) { 
                 changed = reachableFunctions.add(callee); 
             } else { 
                 changed = false; 
             } 
             return changed; 
         } 
     }; 
     FixedPointGraphTraversal.newTraversal(edgeCallback).computeFixedPoint(callgraph.getForwardDirectedGraph()); 
     assertEquals(7, reachableFunctions.size()); 
     assertTrue(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("B"))); 
     assertTrue(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("C"))); 
     assertTrue(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("D"))); 
     assertTrue(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("X"))); 
     assertTrue(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("Y"))); 
     assertTrue(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("Z"))); 
     assertTrue(reachableFunctions.contains(callgraph.getMainFunction())); 
     assertFalse(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("A"))); 
     assertFalse(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("E"))); 
 } 


public void testGetDirectedGraph_forwardOnForward171() { 
     String source = "function A(){B()};\n" + "function B(){C();D()}\n" + "function C(){B()};\n" + "function D(){};\n" + "function E(){C()};\n" + "function X(){Y()};\n" + "function Y(){Z()};\n" + "function Z(){};" + "B();\n"; 
     CallGraph callgraph = compileAndRunForward(source); 
     final Set<Function> reachableFunctions = Sets.newHashSet(); 
     reachableFunctions.add(callgraph.getMainFunction()); 
     reachableFunctions.add(callgraph.getUniqueFunctionWithName("X")); 
     EdgeCallback<CallGraph.Function, CallGraph.Callsite> edgeCallback = new EdgeCallback<CallGraph.Function, CallGraph.Callsite>() { 
  
         @Override 
         public boolean traverseEdge(Function caller, Callsite callsite, Function callee) { 
             boolean changed; 
             if (reachableFunctions.contains(caller)) { 
                 changed = reachableFunctions.add(callee); 
             } else { 
                 changed = false; 
             } 
             return changed; 
         } 
     }; 
     FixedPointGraphTraversal.newTraversal(edgeCallback).computeFixedPoint(callgraph.getForwardDirectedGraph()); 
     assertEquals(7, reachableFunctions.size()); 
     assertTrue(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("B"))); 
     assertTrue(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("C"))); 
     assertTrue(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("D"))); 
     assertTrue(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("X"))); 
     assertTrue(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("Y"))); 
     assertTrue(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("Z"))); 
     assertTrue(reachableFunctions.contains(callgraph.getMainFunction())); 
     assertFalse(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("A"))); 
     assertFalse(reachableFunctions.contains(callgraph.getUniqueFunctionWithName("E"))); 
 } 


public void testGetDirectedGraph_backwardOnForward268() { 
     String source = "function A(){};\n" + "function B(){ExternalFunction(6); C(); D();}\n" + "function C(){B(); A();};\n" + "function D(){A();};\n" + "function E(){C()};\n" + "A();\n"; 
     CallGraph callgraph = compileAndRunForward(source); 
     final Set<Function> poisonedFunctions = Sets.newHashSet(); 
     for (Callsite callsite : callgraph.getAllCallsites()) { 
         if (callsite.hasExternTarget()) { 
             poisonedFunctions.add(callsite.getContainingFunction()); 
         } 
     } 
     EdgeCallback<CallGraph.Function, CallGraph.Callsite> edgeCallback = new EdgeCallback<CallGraph.Function, CallGraph.Callsite>() { 
  
         @Override 
         public boolean traverseEdge(Function callee, Callsite callsite, Function caller) { 
             boolean changed; 
             if (poisonedFunctions.contains(callee)) { 
                 changed = poisonedFunctions.add(caller); 
             } else { 
                 changed = false; 
             } 
             return changed; 
         } 
     }; 
     FixedPointGraphTraversal.newTraversal(edgeCallback).computeFixedPoint(callgraph.getBackwardDirectedGraph()); 
     assertEquals(3, poisonedFunctions.size()); 
     assertTrue(poisonedFunctions.contains(callgraph.getUniqueFunctionWithName("B"))); 
     assertTrue(poisonedFunctions.contains(callgraph.getUniqueFunctionWithName("C"))); 
     assertTrue(poisonedFunctions.contains(callgraph.getUniqueFunctionWithName("E"))); 
 } 


public void testFunctionGetIsExposedToCallOrApply309() { 
     String source = "function A(){};\n" + "function B(){};\n" + "function C(){};\n" + "var x;\n" + "A.call(x);\n" + "B.apply(x);\n" + "C();\n"; 
     CallGraph callGraph = compileAndRunForward(source); 
     Function functionA = callGraph.getUniqueFunctionWithName("A"); 
     Function functionB = callGraph.getUniqueFunctionWithName("B"); 
     Function functionC = callGraph.getUniqueFunctionWithName("C"); 
     assertTrue(functionA.isExposedToCallOrApply()); 
     assertTrue(functionB.isExposedToCallOrApply()); 
     assertFalse(functionC.isExposedToCallOrApply()); 
 } 


public void testFunctionGetAstNode1111() { 
     String source = "function A(){};\n" + "A();\n"; 
     CallGraph callgraph = compileAndRunForward(source); 
     CallGraph.Function mainFunction = callgraph.getMainFunction(); 
     assertTrue(mainFunction.getAstNode().isBlock()); 
     CallGraph.Function functionA = callgraph.getUniqueFunctionWithName("A"); 
     assertTrue(functionA.getAstNode().isFunction()); 
     assertEquals("A", NodeUtil.getFunctionName(functionA.getAstNode())); 
 } 


public void testGetFunctionForAstNode1122() { 
     String source = "function A() {};\n"; 
     CallGraph callgraph = compileAndRunForward(source); 
     CallGraph.Function functionA = callgraph.getUniqueFunctionWithName("A"); 
     Node functionANode = functionA.getAstNode(); 
     assertEquals(functionA, callgraph.getFunctionForAstNode(functionANode)); 
 } 


public void testCallsiteHasUnknownTarget1240() { 
     String source = "var A = externalnamespace.prop;\n" + "function B(){A();};\n" + "B();\n"; 
     CallGraph callgraph = compileAndRunForward(source); 
     Function mainFunction = callgraph.getMainFunction(); 
     Function functionB = callgraph.getUniqueFunctionWithName("B"); 
     Callsite callInMain = mainFunction.getCallsitesInFunction().iterator().next(); 
     assertFalse(callInMain.hasUnknownTarget()); 
     assertEquals("B", callInMain.getAstNode().getFirstChild().getString()); 
     Callsite callInB = functionB.getCallsitesInFunction().iterator().next(); 
     assertTrue(callInB.hasUnknownTarget()); 
     assertEquals(0, callInB.getPossibleTargets().size()); 
 } 


public void testFunctionGetIsAliased1245() { 
     String source = "function A(){};\n" + "var ns = {};\n" + "ns.B = function() {};\n" + "var C = function() {}\n" + "var D = function() {}\n" + "var aliasA = A;\n" + "var aliasB = ns.B;\n" + "var aliasC = C;\n" + "D();"; 
     compileAndRunForward(source); 
     assertFunctionAliased(true, "A"); 
     assertFunctionAliased(true, "ns.B"); 
     assertFunctionAliased(true, "C"); 
     assertFunctionAliased(false, "D"); 
     source = "function A(){};\n" + "var ns = {};\n" + "ns.B = function() {};\n" + "var C = function() {}\n" + "ns.D = function() {}\n" + "var aliasA;\n" + "aliasA = A;\n" + "var aliasB = {};\n" + "aliasB.foo = ns.B;\n" + "var aliasC;\n" + "aliasC = C;\n" + "ns.D();"; 
     compileAndRunForward(source); 
     assertFunctionAliased(true, "A"); 
     assertFunctionAliased(true, "ns.B"); 
     assertFunctionAliased(true, "C"); 
     assertFunctionAliased(false, "ns.D"); 
     source = "function A(){};\n" + "var ns = {};\n" + "ns.B = function() {};\n" + "var C = function() {}\n" + "function D() {}\n" + "var foo = function(a) {}\n" + "foo(A);\n" + "foo(ns.B)\n" + "foo(C);\n" + "D();"; 
     compileAndRunForward(source); 
     assertFunctionAliased(true, "A"); 
     assertFunctionAliased(true, "ns.B"); 
     assertFunctionAliased(true, "C"); 
     assertFunctionAliased(false, "D"); 
     source = "function A(){};\n" + "var ns = {};\n" + "ns.B = function() {};\n" + "var C = function() {}\n" + "A();\n" + "ns.B();\n" + "C();\n"; 
     compileAndRunForward(source); 
     assertFunctionAliased(false, "A"); 
     assertFunctionAliased(false, "ns.B"); 
     assertFunctionAliased(false, "C"); 
     source = "function A(){};\n" + "var ns = {};\n" + "ns.B = function() {};\n" + "var C = function() {}\n" + "A.foo;\n" + "ns.B.prototype;\n" + "C[0];\n"; 
     compileAndRunForward(source); 
     assertFunctionAliased(false, "A"); 
     assertFunctionAliased(false, "ns.B"); 
     assertFunctionAliased(false, "C"); 
 } 


public void testGetAllCallsitesContainsGlobalSite1368() { 
     String source = "function A(){}\n" + "A();\n"; 
     CallGraph callgraph = compileAndRunBackward(source); 
     Collection<CallGraph.Callsite> allCallsites = callgraph.getAllCallsites(); 
     assertEquals(1, allCallsites.size()); 
     Node callsiteNode = allCallsites.iterator().next().getAstNode(); 
     assertEquals(Token.CALL, callsiteNode.getType()); 
     assertEquals("A", callsiteNode.getFirstChild().getString()); 
 } 


public void testFunctionIsMain1403() { 
     String source = "function A(){};\n" + "A();\n"; 
     CallGraph callgraph = compileAndRunForward(source); 
     CallGraph.Function mainFunction = callgraph.getMainFunction(); 
     assertTrue(mainFunction.isMain()); 
     assertNotNull(mainFunction.getBodyNode()); 
     assertTrue(mainFunction.getBodyNode().isBlock()); 
     CallGraph.Function functionA = callgraph.getUniqueFunctionWithName("A"); 
     assertFalse(functionA.isMain()); 
 } 


public void testFunctionGetBodyNode1642() { 
     String source = "function A(){};\n" + "A();\n"; 
     CallGraph callgraph = compileAndRunForward(source); 
     CallGraph.Function mainFunction = callgraph.getMainFunction(); 
     assertEquals(mainFunction.getAstNode(), mainFunction.getBodyNode()); 
     CallGraph.Function functionA = callgraph.getUniqueFunctionWithName("A"); 
     assertTrue(functionA.getBodyNode().isBlock()); 
     assertEquals(NodeUtil.getFunctionBody(functionA.getAstNode()), functionA.getBodyNode()); 
 } 


public void testGetCallsiteForAstNode1655() { 
     String source = "function A() {B()};\n" + "function B(){};\n"; 
     CallGraph callgraph = compileAndRunBackward(source); 
     CallGraph.Function functionA = callgraph.getUniqueFunctionWithName("A"); 
     CallGraph.Callsite callToB = functionA.getCallsitesInFunction().iterator().next(); 
     Node callsiteNode = callToB.getAstNode(); 
     assertEquals(callToB, callgraph.getCallsiteForAstNode(callsiteNode)); 
 } 


public void testThrowForBackwardOpOnForwardGraph1816() { 
     String source = "function A(){B()};\n" + "function B(){C();C();};\n" + "function C(){C()};\n" + "A();\n"; 
     CallGraph callgraph = compileAndRunForward(source); 
     Function functionA = callgraph.getUniqueFunctionWithName("A"); 
     UnsupportedOperationException caughtException = null; 
     try { 
         functionA.getCallsitesPossiblyTargetingFunction(); 
     } catch (UnsupportedOperationException e) { 
         caughtException = e; 
     } 
     assertNotNull(caughtException); 
 } 


public void testGetAllFunctions2089() { 
     String source = "function A() {}\n" + "var B = function() {\n" + "(function C(){A()})()\n" + "};\n"; 
     CallGraph callgraph = compileAndRunForward(source); 
     Collection<CallGraph.Function> functions = callgraph.getAllFunctions(); 
     assertEquals(4, functions.size()); 
     CallGraph.Function functionA = callgraph.getUniqueFunctionWithName("A"); 
     CallGraph.Function functionB = callgraph.getUniqueFunctionWithName("B"); 
     CallGraph.Function functionC = callgraph.getUniqueFunctionWithName("C"); 
     assertEquals("A", NodeUtil.getFunctionName(functionA.getAstNode())); 
     assertEquals("B", NodeUtil.getFunctionName(functionB.getAstNode())); 
     assertEquals("C", NodeUtil.getFunctionName(functionC.getAstNode())); 
 } 


public void testGetAllFunctionsContainsAnonymousFunction2253() { 
     String source = "var A = function(){(function(){})();};\n"; 
     CallGraph callgraph = compileAndRunForward(source); 
     Collection<CallGraph.Function> allFunctions = callgraph.getAllFunctions(); 
     assertEquals(3, allFunctions.size()); 
     assertTrue(allFunctions.contains(callgraph.getUniqueFunctionWithName("A"))); 
     assertTrue(allFunctions.contains(callgraph.getUniqueFunctionWithName(null))); 
     assertTrue(allFunctions.contains(callgraph.getMainFunction())); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Test getting a backward directed graph on a backward call graph
   * and propagating over it.
   */
  

  /**
   * Test getting a backward directed graph on a forward call graph
   * and propagating over it.
   */
  

  /**
   * Test getting a forward directed graph on a forward call graph
   * and propagating over it.
   */
  

  /**
   * Test getting a backward directed graph on a forward call graph
   * and propagating over it.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Helper function that, given a collection of callsites, returns a
   * collection of the names of the target expression nodes, e.g.
   * if the callsites are [A(), B.b()], the collection returned is
   * ["A", "B"].
   *
   * This makes it easier to test methods that return collections of callsites.
   *
   * An exception is thrown if the callsite target is not a simple name
   * (e.g. "a.bar()").
   */
  private List<String> getCallsiteTargetNames(Collection<Callsite>
      callsites) {
    List<String> result = Lists.newArrayList();

    for (Callsite callsite : callsites) {
      Node targetExpressionNode = callsite.getAstNode().getFirstChild();
      if (targetExpressionNode.isName()) {
        result.add(targetExpressionNode.getString());
      } else {
        throw new IllegalStateException("Called getCallsiteTargetNames() on " +
            "a complex callsite.");
      }
    }

    return result;
  }

  private void assertFunctionAliased(boolean aliased, String name) {
    Function function = currentProcessor.getUniqueFunctionWithName(name);

    assertEquals(aliased, function.isAliased());
  }

  private CallGraph compileAndRunBackward(String js) {
    return compileAndRun(SHARED_EXTERNS, js, false, true);
  }

  private CallGraph compileAndRunForward(String js) {
    return compileAndRun(SHARED_EXTERNS, js, true, false);
  }

  private CallGraph compileAndRun(String externs,
      String js,
      boolean forward,
      boolean backward) {

    createBackwardCallGraph = backward;
    createForwardCallGraph = forward;

    testSame(externs, js, null);

    return currentProcessor;
  }
}
