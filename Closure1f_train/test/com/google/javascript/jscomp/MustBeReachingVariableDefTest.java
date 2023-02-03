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

import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import junit.framework.TestCase;

/**
 * Tests for {@link MustBeReachingVariableDef}.
 *
 */
public class MustBeReachingVariableDefTest extends TestCase {

  private MustBeReachingVariableDef defUse = null;
  private Node def = null;
  private Node use = null;

  public static final String EXTERNS = "var goog = {}";


public void testArgumentsObjectModifications111() { 
     computeDefUse("D: param1 = 1; arguments[0] = 2; U: param1"); 
     assertNotSame(def, defUse.getDefNode("param1", use)); 
 } 


public void testArgumentsObjectEscaped688() { 
     computeDefUse("D: param1 = 1; var x = arguments; x[0] = 2; U: param1"); 
     assertNotSame(def, defUse.getDefNode("param1", use)); 
 } 


public void testMergeDefinitions731() { 
     assertNotMatch("var x,y; D: y = x + x; if(x) { x = 1 }; U:y"); 
 } 


public void testMergesWithOneDefinition971() { 
     assertNotMatch("var x,y; while(y) { if (y) { print(x) } else { D: x = 1 } } U:x"); 
 } 


public void testConditional1036() { 
     assertMatch("var x=0,y; D:(x=1)&&y; U:x"); 
     assertNotMatch("var x=0,y; D:y&&(x=1); U:x"); 
 } 


public void testIncAndDec1105() { 
     assertMatch("var x; D: x++; U: x"); 
     assertMatch("var x; D: x--; U: x"); 
 } 


public void testLoops1126() { 
     assertNotMatch("var x=0; while(a){ D:x=1 }; U:x"); 
     assertNotMatch("var x=0; for(;;) { D:x=1 }; U:x"); 
     assertMatch("D:var x=1; while(a) { U:x }"); 
     assertMatch("D:var x=1; for(;;)  { U:x }"); 
 } 


public void testArgumentsObjectEscapedDependents1176() { 
     assertNotMatch("param1=1; var x; D:x=param1; var y=arguments; U:x"); 
 } 


public void testExterns1182() { 
     assertNotMatch("D: goog = {}; U: goog"); 
 } 


public void testExpressionVariableReassignment1395() { 
     assertMatch("var a,b; D: var x = a + b; U:x"); 
     assertNotMatch("var a,b,c; D: var x = a + b; a = 1; U:x"); 
     assertNotMatch("var a,b,c; D: var x = a + b; f(b = 1); U:x"); 
     assertMatch("var a,b,c; D: var x = a + b; c = 1; U:x"); 
     assertNotMatch("var a,b,c; D: var x = a + b; c ? a = 1 : 0; U:x"); 
 } 


public void testRedefinitionUsingItself2366() { 
     assertMatch("var x = 1; D: x = x + 1; U:x;"); 
     assertNotMatch("var x = 1; D: x = x + 1; x = 1; U:x;"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * The use of x at U: is the definition of x at D:.
   */
  private void assertMatch(String src) {
    computeDefUse(src);
    assertSame(def, defUse.getDefNode("x", use));
  }

  /**
   * The use of x at U: is not the definition of x at D:.
   */
  private void assertNotMatch(String src) {
    computeDefUse(src);
    assertNotSame(def, defUse.getDefNode("x", use));
  }

  /**
   * Computes reaching definition on given source.
   */
  private void computeDefUse(String src) {
    Compiler compiler = new Compiler();
    src = "function _FUNCTION(param1, param2){" + src + "}";
    Node externs = compiler.parseTestCode(EXTERNS);
    Node root = compiler.parseTestCode(src).getFirstChild();
    assertEquals(0, compiler.getErrorCount());
    Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, root);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    defUse = new MustBeReachingVariableDef(cfg, scope, compiler);
    defUse.analyze();
    def = null;
    use = null;
    new NodeTraversal(compiler,new LabelFinder()).traverse(root);
    assertNotNull("Code should have an instruction labeled D", def);
    assertNotNull("Code should have an instruction labeled U", use);
  }

  /**
   * Finds the D: and U: label and store which node they point to.
   */
  private class LabelFinder extends AbstractPostOrderCallback {
    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      if (n.isLabel()) {
        if (n.getFirstChild().getString().equals("D")) {
          def = n.getLastChild();
        } else if (n.getFirstChild().getString().equals("U")) {
          use = n.getLastChild();
        }
      }
    }
  }
}
