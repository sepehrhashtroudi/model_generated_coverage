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

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;

/**
 * Tests for LinkedFlowScope.
 * @author nicksantos@google.com (Nick Santos)
 */
public class LinkedFlowScopeTest extends CompilerTypeTestCase {

  private final Node blockNode = new Node(Token.BLOCK);
  private final Node functionNode = new Node(Token.FUNCTION);
  private final int LONG_CHAIN_LENGTH = 1050;

  private Scope globalScope;
  private Scope localScope;
  @SuppressWarnings("unused")
  private FlowScope globalEntry;
  private FlowScope localEntry;

  @Override
  public void setUp() throws Exception {
    super.setUp();

    globalScope = Scope.createGlobalScope(blockNode);
    globalScope.declare("globalA", null, null, null);
    globalScope.declare("globalB", null, null, null);

    localScope = new Scope(globalScope, functionNode);
    localScope.declare("localA", null, null, null);
    localScope.declare("localB", null, null, null);

    globalEntry = LinkedFlowScope.createEntryLattice(globalScope);
    localEntry = LinkedFlowScope.createEntryLattice(localScope);
  }


public void testDiffer11199() { 
     FlowScope childA = localEntry.createChildFlowScope(); 
     childA.inferSlotType("localB", NUMBER_TYPE); 
     FlowScope childAB = childA.createChildFlowScope(); 
     childAB.inferSlotType("localB", STRING_TYPE); 
     FlowScope childABC = childAB.createChildFlowScope(); 
     childABC.inferSlotType("localA", BOOLEAN_TYPE); 
     FlowScope childB = childAB.createChildFlowScope(); 
     childB.inferSlotType("localB", STRING_TYPE); 
     FlowScope childBC = childB.createChildFlowScope(); 
     childBC.inferSlotType("localA", NO_TYPE); 
     assertScopesSame(childAB, childB); 
     assertScopesDiffer(childABC, childBC); 
     assertScopesDiffer(childABC, childB); 
     assertScopesDiffer(childAB, childBC); 
     assertScopesDiffer(childA, childAB); 
     assertScopesDiffer(childA, childABC); 
     assertScopesDiffer(childA, childB); 
     assertScopesDiffer(childA, childBC); 
 } 


public void testFindUniqueSlot1281() { 
     FlowScope childA = localEntry.createChildFlowScope(); 
     childA.inferSlotType("localB", NUMBER_TYPE); 
     FlowScope childAB = childA.createChildFlowScope(); 
     childAB.inferSlotType("localB", STRING_TYPE); 
     FlowScope childABC = childAB.createChildFlowScope(); 
     childABC.inferSlotType("localA", BOOLEAN_TYPE); 
     assertNull(childABC.findUniqueRefinedSlot(childABC)); 
     assertTypeEquals(BOOLEAN_TYPE, childABC.findUniqueRefinedSlot(childAB).getType()); 
     assertNull(childABC.findUniqueRefinedSlot(childA)); 
     assertNull(childABC.findUniqueRefinedSlot(localEntry)); 
     assertTypeEquals(STRING_TYPE, childAB.findUniqueRefinedSlot(childA).getType()); 
     assertTypeEquals(STRING_TYPE, childAB.findUniqueRefinedSlot(localEntry).getType()); 
     assertTypeEquals(NUMBER_TYPE, childA.findUniqueRefinedSlot(localEntry).getType()); 
 } 


public void testLongChain31338() { 
     FlowScope chainA = localEntry.createChildFlowScope(); 
     FlowScope chainB = localEntry.createChildFlowScope(); 
     for (int i = 0; i < LONG_CHAIN_LENGTH * 7; i++) { 
         if (i % 7 == 0) { 
             int j = i / 7; 
             localScope.declare("local" + j, null, null, null); 
             chainA.inferSlotType("local" + j, j % 2 == 0 ? NUMBER_TYPE : BOOLEAN_TYPE); 
             chainB.inferSlotType("local" + j, j % 3 == 0 ? STRING_TYPE : BOOLEAN_TYPE); 
         } 
         chainA = chainA.createChildFlowScope(); 
         chainB = chainB.createChildFlowScope(); 
     } 
     verifyLongChains(chainA, chainB); 
 } 


public void testJoin21357() { 
     FlowScope childA = localEntry.createChildFlowScope(); 
     childA.inferSlotType("localA", STRING_TYPE); 
     FlowScope childB = localEntry.createChildFlowScope(); 
     childB.inferSlotType("globalB", BOOLEAN_TYPE); 
     assertTypeEquals(STRING_TYPE, childA.getSlot("localA").getType()); 
     assertTypeEquals(BOOLEAN_TYPE, childB.getSlot("globalB").getType()); 
     assertNull(childB.getSlot("localB").getType()); 
     FlowScope joined = join(childB, childA); 
     assertTypeEquals(STRING_TYPE, joined.getSlot("localA").getType()); 
     assertTypeEquals(BOOLEAN_TYPE, joined.getSlot("globalB").getType()); 
     joined = join(childA, childB); 
     assertTypeEquals(STRING_TYPE, joined.getSlot("localA").getType()); 
     assertTypeEquals(BOOLEAN_TYPE, joined.getSlot("globalB").getType()); 
     assertEquals("Join should be symmetric", join(childB, childA), join(childA, childB)); 
 } 


public void testJoin31527() { 
     localScope.declare("localC", null, STRING_TYPE, null); 
     localScope.declare("localD", null, STRING_TYPE, null); 
     FlowScope childA = localEntry.createChildFlowScope(); 
     childA.inferSlotType("localC", NUMBER_TYPE); 
     FlowScope childB = localEntry.createChildFlowScope(); 
     childA.inferSlotType("localD", BOOLEAN_TYPE); 
     FlowScope joined = join(childB, childA); 
     assertTypeEquals(createUnionType(STRING_TYPE, NUMBER_TYPE), joined.getSlot("localC").getType()); 
     assertTypeEquals(createUnionType(STRING_TYPE, BOOLEAN_TYPE), joined.getSlot("localD").getType()); 
     joined = join(childA, childB); 
     assertTypeEquals(createUnionType(STRING_TYPE, NUMBER_TYPE), joined.getSlot("localC").getType()); 
     assertTypeEquals(createUnionType(STRING_TYPE, BOOLEAN_TYPE), joined.getSlot("localD").getType()); 
     assertEquals("Join should be symmetric", join(childB, childA), join(childA, childB)); 
 } 

  

  

  

  

  /**
   * Create a long chain of flow scopes where each link in the chain
   * contains one slot.
   */
  

  /**
   * Create a long chain of flow scopes where each link in the chain
   * contains 7 slots.
   */
  

  /**
   * Create a long chain of flow scopes where every 4 links in the chain
   * contain a slot.
   */
  

  // Common chain verification for testLongChainN for all N.
  private void verifyLongChains(FlowScope chainA, FlowScope chainB) {
    FlowScope joined = join(chainA, chainB);
    for (int i = 0; i < LONG_CHAIN_LENGTH; i++) {
      assertTypeEquals(
          i % 2 == 0 ? NUMBER_TYPE : BOOLEAN_TYPE,
          chainA.getSlot("local" + i).getType());
      assertTypeEquals(
          i % 3 == 0 ? STRING_TYPE : BOOLEAN_TYPE,
          chainB.getSlot("local" + i).getType());

      JSType joinedSlotType = joined.getSlot("local" + i).getType();
      if (i % 6 == 0) {
        assertTypeEquals(createUnionType(STRING_TYPE, NUMBER_TYPE), joinedSlotType);
      } else if (i % 2 == 0) {
        assertTypeEquals(createUnionType(NUMBER_TYPE, BOOLEAN_TYPE),
            joinedSlotType);
      } else if (i % 3 == 0) {
        assertTypeEquals(createUnionType(STRING_TYPE, BOOLEAN_TYPE),
            joinedSlotType);
      } else {
        assertTypeEquals(BOOLEAN_TYPE, joinedSlotType);
      }
    }

    assertScopesDiffer(chainA, chainB);
    assertScopesDiffer(chainA, joined);
    assertScopesDiffer(chainB, joined);
  }

  

  

  

  private void assertScopesDiffer(FlowScope a, FlowScope b) {
    assertFalse(a.equals(b));
    assertFalse(b.equals(a));
    assertEquals(a, a);
    assertEquals(b, b);
  }

  private void assertScopesSame(FlowScope a, FlowScope b) {
    assertEquals(a, b);
    assertEquals(b, a);
    assertEquals(a, a);
    assertEquals(b, b);
  }

  @SuppressWarnings("unchecked")
  private FlowScope join(FlowScope a, FlowScope b) {
    return (new LinkedFlowScope.FlowScopeJoinOp()).apply(
        Lists.newArrayList(a, b));
  }
}
