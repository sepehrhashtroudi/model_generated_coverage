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

package com.google.javascript.jscomp.graph;

import com.google.javascript.jscomp.graph.Graph;
import com.google.javascript.jscomp.graph.GraphColoring;
import com.google.javascript.jscomp.graph.LinkedUndirectedGraph;
import com.google.javascript.jscomp.graph.GraphNode;
import com.google.javascript.jscomp.graph.Graph.GraphEdge;
import com.google.javascript.jscomp.graph.GraphColoring.Color;
import com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring;

import junit.framework.TestCase;

import java.util.Comparator;

/**
 * Tests for {@link GraphColoring}.
 *
 */
public class GraphColoringTest extends TestCase {


public void testNoEdge600() { 
     Graph<String, String> graph = LinkedUndirectedGraph.create(); 
     for (int i = 0; i < 5; i++) { 
         graph.createNode("Node " + i); 
         GraphColoring<String, String> coloring = new GreedyGraphColoring<String, String>(graph); 
         assertEquals(1, coloring.color()); 
         validateColoring(graph); 
         for (int j = 0; j < i; j++) { 
             assertEquals("Node 0", coloring.getPartitionSuperNode("Node 0")); 
         } 
     } 
 } 


public void testTwoFullyConnected1303() { 
     final int count = 100; 
     Graph<String, String> graph = LinkedUndirectedGraph.create(); 
     for (int i = 0; i < count; i++) { 
         graph.createNode("Node Left " + i); 
         graph.createNode("Node Right " + i); 
         for (int j = 0; j < count; j++) { 
             graph.createNode("Node Left " + j); 
             graph.createNode("Node Right " + j); 
             if (i != j) { 
                 graph.connect("Node Left " + i, null, "Node Left " + j); 
                 graph.connect("Node Right " + i, null, "Node Right " + j); 
             } 
         } 
     } 
     assertEquals(count, new GreedyGraphColoring<String, String>(graph).color()); 
     validateColoring(graph); 
     for (int i = 0; i < count; i++) { 
         graph.connect("Node Left " + i, null, "Node Right " + i); 
     } 
     assertEquals(count, new GreedyGraphColoring<String, String>(graph).color()); 
     validateColoring(graph); 
 } 


public void testGreedy2204() { 
     Graph<String, String> graph = LinkedUndirectedGraph.create(); 
     graph.createNode("A"); 
     graph.createNode("B"); 
     graph.createNode("C"); 
     graph.createNode("D"); 
     graph.connect("A", "--", "C"); 
     graph.connect("B", "--", "C"); 
     graph.connect("B", "--", "D"); 
     GraphColoring<String, String> coloring = new GreedyGraphColoring<String, String>(graph); 
     assertEquals(2, coloring.color()); 
     validateColoring(graph); 
     assertEquals("A", coloring.getPartitionSuperNode("A")); 
     assertEquals("A", coloring.getPartitionSuperNode("B")); 
     assertEquals("C", coloring.getPartitionSuperNode("C")); 
 } 

  

  

  

  

  

  

  

  /**
   * Validate that each node has been colored and connected nodes have different
   * coloring.
   */
  private static <N, E> void validateColoring(Graph<N, E> graph) {
    for (GraphNode<N, E> node : graph.getNodes()) {
      assertTrue(node.getAnnotation() != null);
    }
    for (GraphEdge<N, E> edge : graph.getEdges()) {
      Color c1 = edge.getNodeA().getAnnotation();
      Color c2 = edge.getNodeB().getAnnotation();
      assertTrue(c1 != null);
      assertTrue(c2 != null);
      assertTrue(!c1.equals(c2));
    }
  }
}
