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

import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import junit.framework.TestCase;

import java.util.Set;

/**
 * @author johnlenz@google.com (John Lenz)
 */
public class FunctionToBlockMutatorTest extends TestCase {


public void testMutateValueReturnWithoutResultAssignment199() { 
     helperMutate("function foo(){return true;}; foo();", "{true;}", "foo", null); 
 } 


public void testMutateNoValueReturnWithoutResultAssignment200() { 
     helperMutate("function foo(){return;}; foo();", "{}", "foo", null); 
 } 


public void testMutateWithMultipleReturns705() { 
     helperMutate("function foo(){ if (0) {return 0} else {return 1} };" + "var result=foo();", "{" + "JSCompiler_inline_label_foo_0:{" + "if(0) {" + "result=0; break JSCompiler_inline_label_foo_0" + "} else {" + "result=1; break JSCompiler_inline_label_foo_0" + "} result=void 0" + "}" + "}", "foo", true, false); 
 } 


public void testMutate8972() { 
     helperMutate("function foo(a){return a+a;}; foo(x++);", "{var a$$inline_0 = x++;" + "a$$inline_0 + a$$inline_0;}", "foo", null); 
 } 


public void testMutateFunctionDefinition1274() { 
     helperMutate("function foo(a){function g(){}}; foo(1);", "{var g$$inline_1=function(){};}", "foo", null); 
 } 


public void testMutateCallInLoopVars11638() { 
     boolean callInLoop = false; 
     helperMutate("function foo(a){var B = bar(); a;}; foo(1);", "{var B$$inline_1=bar(); 1;}", "foo", null, false, callInLoop); 
     callInLoop = true; 
     helperMutate("function foo(a){var B = bar(); a;}; foo(1);", "{var B$$inline_1 = bar(); 1;}", "foo", null, false, callInLoop); 
 } 


public void testMutateInitializeUninitializedVars11690() { 
     helperMutate("function foo(a){var b;return a;}; foo(1);", "{var b$$inline_1=void 0;1}", "foo", null, false, true); 
 } 


public void testMutateValueReturnWithResultAssignment1745() { 
     helperMutate("function foo(){return true;}; var x=foo();", "{x=true}", "foo", "x", true, false); 
 } 


public void testMutateNoValueReturnWithResultAssignment2338() { 
     helperMutate("function foo(){return;}; var result = foo();", "{result = void 0}", "foo"); 
 } 

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  public void helperMutate(
      String code, final String expectedResult, final String fnName) {
    helperMutate(code, expectedResult, fnName, false, false);
  }

  public void helperMutate(
      String code, final String expectedResult, final String fnName,
      final boolean needsDefaultResult,
      final boolean isCallInLoop) {
    helperMutate(code, expectedResult, fnName,
        "result", needsDefaultResult, isCallInLoop);
  }

  public void helperMutate(
      String code, final String expectedResult, final String fnName,
      final String resultName) {
    helperMutate(code, expectedResult, fnName, resultName, false, false);
  }
    public void helperMutate(
            String code, final String expectedResult, final String fnName,
            final String resultName,
            final boolean needsDefaultResult,
            final boolean isCallInLoop) {
        final Compiler compiler = new Compiler();
        final FunctionToBlockMutator mutator = new FunctionToBlockMutator(
                compiler, compiler.getUniqueNameIdSupplier());
        Node expectedRoot = parse(compiler, expectedResult);
        Preconditions.checkState(compiler.getErrorCount() == 0);
        final Node expected = expectedRoot.getFirstChild();
        final Node tree = parse(compiler, code);
        Preconditions.checkState(compiler.getErrorCount() == 0);

        Node externsRoot = new Node(Token.EMPTY);
        Node mainRoot = tree;
        MarkNoSideEffectCalls mark = new MarkNoSideEffectCalls(compiler);
        mark.process(externsRoot, mainRoot);

        final Node fnNode = findFunction(tree, fnName);
        final Set<String> unsafe =
                FunctionArgumentInjector.findModifiedParameters(fnNode);

        // Fake precondition.
        compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

        // inline tester
        Method tester = new Method() {
            @Override
            public boolean call(NodeTraversal t, Node n, Node parent) {

                Node result = mutator.mutate(
                        fnName, fnNode, n, resultName,
                        needsDefaultResult, isCallInLoop);
                validateSourceInfo(compiler, result);
                String explanation = expected.checkTreeEquals(result);
                assertNull("\nExpected: " + compiler.toSource(expected) +
                        "\nResult: " + compiler.toSource(result) +
                        "\n" + explanation, explanation);
                return true;
            }
        };

        compiler.resetUniqueNameId();
        TestCallback test = new TestCallback(fnName, tester);
        NodeTraversal.traverse(compiler, tree, test);
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

  

  interface Method {
    boolean call(NodeTraversal t, Node n, Node parent);
  }

  class TestCallback implements Callback {

    private final String callname;
    private final Method method;
    private boolean complete = false;

    TestCallback(String callname, Method method) {
      this.callname = callname;
      this.method = method;
    }

    @Override
    public boolean shouldTraverse(
        NodeTraversal nodeTraversal, Node n, Node parent) {
      return !complete;
    }

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      if (n.isCall()) {
        Node first = n.getFirstChild();
        if (first.isName() &&
            first.getString().equals(callname)) {
          complete = method.call(t, n, parent);
        }
      }

      if (parent == null) {
        assertTrue(complete);
      }
    }
  }

  private static Node findFunction(Node n, String name) {
    if (n.isFunction()) {
      if (n.getFirstChild().getString().equals(name)) {
        return n;
      }
    }

    for (Node c : n.children()) {
      Node result = findFunction(c, name);
      if (result != null) {
        return result;
      }
    }

    return null;
  }

  private static Node parse(Compiler compiler, String js) {
    Node n = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    return n;
  }
}
