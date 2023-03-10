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
 * Tests for {@link CreateSyntheticBlocks}
 *
 */
public class CreateSyntheticBlocksTest extends CompilerTestCase {
  private static final String START_MARKER = "startMarker";
  private static final String END_MARKER = "endMarker";

  public CreateSyntheticBlocksTest() {
    // Can't use compare as a tree because of the added synthetic blocks.
    super("", false);
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(false);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node js) {
        new CreateSyntheticBlocks(compiler, START_MARKER, END_MARKER).process(
            externs, js);
        NodeTraversal.traverse(compiler, js, new MinimizeExitPoints(compiler));

        new PeepholeOptimizationsPass(compiler,
            new PeepholeRemoveDeadCode(),
            new PeepholeSubstituteAlternateSyntax(true),
            new PeepholeFoldConstants(true))
            .process(externs, js);
        new MinimizeExitPoints(compiler).process(externs, js);

        new Denormalize(compiler).process(externs, js);
      }
    };
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  // TODO(johnlenz): Add tests to the IntegrationTest.


public void testContainingBlockPreservation162() { 
     testSame("if(y){startMarker();x();endMarker()}"); 
 } 


public void testInvalid2539() { 
     test("false && endMarker()", "", null, CreateSyntheticBlocks.INVALID_MARKER_USAGE); 
 } 


public void testFoldWithMarkers1626() { 
     testSame("function f(){startMarker();if(x)return;endMarker();y()}"); 
 } 


public void testDenormalize1052() { 
     testSame("startMarker();for(;;);endMarker()"); 
 } 


public void testUnmatchedEndMarker11963() { 
     testSame("endMarker()", CreateSyntheticBlocks.UNMATCHED_END_MARKER); 
 } 


public void testUnmatchedStartMarker1970() { 
     testSame("startMarker()", CreateSyntheticBlocks.UNMATCHED_START_MARKER); 
 } 


public void testInvalid12097() { 
     test("startMarker() && true", "startMarker()", null, CreateSyntheticBlocks.INVALID_MARKER_USAGE); 
 } 


public void testUnmatchedEndMarker22292() { 
     test("if(y){startMarker();x()}endMarker()", "if(y){startMarker();x()}endMarker()", null, CreateSyntheticBlocks.UNMATCHED_END_MARKER); 
 } 

  

  

  

  

  

  

  

  

  

  


  

  

  
}
