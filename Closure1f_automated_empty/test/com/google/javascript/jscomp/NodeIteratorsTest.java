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

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope;
import com.google.javascript.jscomp.NodeIterators.LocalVarMotion;

import java.util.Iterator;
import java.util.List;
import junit.framework.TestCase;

/**
 * Tests for NodeIterators.
 * @author nicksantos@google.com (Nick Santos)
 */
public class NodeIteratorsTest extends TestCase {

  // In each test, we find the declaration of "X" in the local scope,
  // construct a list of all nodes where X is guaranteed to retain its
  // original value, and compare those nodes against an expected list of
  // tokens.

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Parses the given code, finds the variable X in the global scope, and runs
   * the VarMotion iterator. Asserts that the iteration order matches the
   * tokens given.
   */
  private void testVarMotionWithCode(String code, int ... expectedTokens) {
    List<Integer> expectedList = Lists.newArrayList();
    for (int token : expectedTokens) {
      expectedList.add(token);
    }
    testVarMotionWithCode(code, expectedList);
  }

  /**
   * @see #testVarMotionWithCode(String, int ...)
   */
  private void testVarMotionWithCode(String code,
      List<Integer> expectedTokens) {
    List<Node> ancestors = Lists.newArrayList();

    // Add an empty node to the beginning of the code and start there.
    Node root = (new Compiler()).parseTestCode(";" + code);
    for (Node n = root; n != null; n = n.getFirstChild()) {
      ancestors.add(0, n);
    }

    FunctionlessLocalScope searchIt = new FunctionlessLocalScope(
        ancestors.toArray(new Node[ancestors.size()]));

    boolean found = false;
    while (searchIt.hasNext()) {
      Node n = searchIt.next();
      if (n.isName() &&
          searchIt.currentParent().isVar() &&
          n.getString().equals("X")) {
        found = true;
        break;
      }
    }

    assertTrue("Variable X not found! " + root.toStringTree(), found);

    List<Node> currentAncestors = searchIt.currentAncestors();
    assert(currentAncestors.size() >= 3);
    Iterator<Node> moveIt = LocalVarMotion.forVar(
        currentAncestors.get(0),
        currentAncestors.get(1),
        currentAncestors.get(2));
    List<Integer> actualTokens = Lists.newArrayList();
    while (moveIt.hasNext()) {
      actualTokens.add(moveIt.next().getType());
    }

    assertEquals(expectedTokens, actualTokens);
  }
}
