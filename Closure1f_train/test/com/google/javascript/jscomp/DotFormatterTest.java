/*
 * Copyright 2007 The Closure Compiler Authors.
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
import com.google.javascript.rhino.Token;

import junit.framework.TestCase;

public class DotFormatterTest extends TestCase {
  /**
   * Tests that keys are assigned sequentially.
   */

public void testToDotSimple367() throws Exception { 
     Node ast = new Node(Token.BITOR); 
     String expected = "digraph AST {\n" + "  node [color=lightblue2, style=filled];\n" + "  node0 [label=\"BITOR\"];\n" + "}\n"; 
     test(expected, ast); 
 } 


public void testToDot3Elements475() throws Exception { 
     Node ast = new Node(Token.BLOCK); 
     ast.addChildToBack(new Node(Token.NAME)); 
     ast.addChildToBack(new Node(Token.STRING)); 
     String expected = "digraph AST {\n" + "  node [color=lightblue2, style=filled];\n" + "  node0 [label=\"BLOCK\"];\n" + "  node1 [label=\"NAME\"];\n" + "  node0 -> node1 [weight=1];\n" + "  node2 [label=\"STRING\"];\n" + "  node0 -> node2 [weight=1];\n" + "}\n"; 
     test(expected, ast); 
 } 


public void testKeyAssignementSequential552() throws Exception { 
     DotFormatter dot = DotFormatter.newInstanceForTesting(); 
     assertEquals(0, dot.key(new Node(Token.BLOCK))); 
     assertEquals(1, dot.key(new Node(Token.BLOCK))); 
     assertEquals(2, dot.key(new Node(Token.BLOCK))); 
     assertEquals(3, dot.key(new Node(Token.BLOCK))); 
     assertEquals(4, dot.key(new Node(Token.BLOCK))); 
 } 

  

  /**
   * Tests that keys are assigned once per node.
   */
  

  /**
   * Tests the formatting (simple tree).
   */
  

  /**
   * Tests the formatting (3 element tree).
   */
  

  private void test(String expected, Node ast) {
    try {
      assertEquals(expected, DotFormatter.toDot(ast));
    } catch (java.io.IOException e) {
      fail("Tests failed with IOExceptions");
    }
  }
}
