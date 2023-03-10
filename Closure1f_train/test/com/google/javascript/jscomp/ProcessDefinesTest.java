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

import static com.google.javascript.jscomp.SyntacticScopeCreator.VAR_MULTIPLY_DECLARED_ERROR;

import com.google.common.collect.Maps;
import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Map;

/**
 * @author nicksantos@google.com (Nick Santos)
 */
public class ProcessDefinesTest extends CompilerTestCase {

  public ProcessDefinesTest() {
    super("var externMethod;");

    // ProcessDefines emits warnings if the user tries to re-define a constant,
    // but the constant is not defined anywhere in the binary.
    allowSourcelessWarnings();
  }

  private Map<String, Node> overrides = Maps.newHashMap();
  private GlobalNamespace namespace;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    overrides.clear();
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new ProcessDefinesWithInjectedNamespace(compiler);
  }

  @Override
  protected int getNumRepetitions() {
    // Only do one repetition, so that we can make sure the first pass keeps
    // GlobalNamespace up to date.
    return 1;
  }

  /**
   * Helper for tests that expects definitions to remain unchanged, such
   * that {@code definitions+js} is converted to {@code definitions+expected}.
   */
  private void testWithPrefix(String definitions, String js, String expected) {
    test(definitions + js, definitions + expected);
  }


public void testDefineWithBadValue219() { 
     test("/** @define {string} */ var DEF = 'x' + y;", null, ProcessDefines.INVALID_DEFINE_INIT_ERROR); 
 } 


public void testReassignAfterRef426() { 
     test("/** @define {boolean} */var DEF=true;var x = DEF;DEF=false", null, ProcessDefines.DEFINE_NOT_ASSIGNABLE_ERROR); 
 } 


public void testNamespacedDefine3817() { 
     overrides.put("a.B", new Node(Token.TRUE)); 
     test("var a = {};", "var a = {};", null, ProcessDefines.UNKNOWN_DEFINE_WARNING); 
 } 


public void testNamespacedDefine1879() { 
     test("var a = {}; /** @define {boolean} */ a.B = false; a.B = true;", "var a = {}; a.B = true; true;"); 
     Name aDotB = namespace.getNameIndex().get("a.B"); 
     assertEquals(1, aDotB.getRefs().size()); 
     assertEquals(1, aDotB.globalSets); 
     assertNotNull(aDotB.getDeclaration()); 
 } 


public void testReassignAfterCall1227() { 
     test("/** @define {boolean} */var DEF=true;externMethod();DEF=false", null, ProcessDefines.DEFINE_NOT_ASSIGNABLE_ERROR); 
 } 


public void testAssignInNonGlobalScope1387() { 
     test("/** @define {boolean} */var DEF=true;function foo() {DEF=false};", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
 } 


public void testDeclareInNonGlobalScope1730() { 
     test("function foo() {/** @define {boolean} */var DEF=true;};", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
 } 


public void testDefineBadType1753() { 
     test("/** @define {Object} */ var DEF = {}", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
 } 


public void testAssignBeforeDeclaration11883() { 
     test("DEF=false;var b=false,/** @define {boolean} */DEF=true,c=false", null, ProcessDefines.INVALID_DEFINE_INIT_ERROR); 
 } 


public void testReassignAfterRefInConditional2064() { 
     test("/** @define {boolean} */var DEF=true;" + "if (false) {var x=DEF} DEF=false;", null, ProcessDefines.DEFINE_NOT_ASSIGNABLE_ERROR); 
 } 


public void testDuplicateVar2164() { 
     test("/** @define {boolean} */ var DEF = false; var DEF = true;", null, VAR_MULTIPLY_DECLARED_ERROR); 
 } 


public void testDefineAssignmentInLoop2170() { 
     test("/** @define {boolean} */var DEF=true;var x=0;while (x) {DEF=false;}", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
 } 


public void testAssignBeforeDeclaration22268() { 
     overrides.put("DEF_OVERRIDE_TO_TRUE", new Node(Token.TRUE)); 
     test("DEF_OVERRIDE_TO_TRUE = 3;" + "/** @define {boolean|number} */ var DEF_OVERRIDE_TO_TRUE = false;", null, ProcessDefines.INVALID_DEFINE_INIT_ERROR); 
 } 


public void testDefineWithDependentValue2294() { 
     test("/** @define {boolean} */ var BASE = false;\n" + "/** @define {boolean} */ var DEF = !BASE;", "var BASE=false;var DEF=!BASE"); 
     test("var a = {};\n" + "/** @define {boolean} */ a.BASE = false;\n" + "/** @define {boolean} */ a.DEF = !a.BASE;", "var a={};a.BASE=false;a.DEF=!a.BASE"); 
 } 

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  private class ProcessDefinesWithInjectedNamespace implements CompilerPass {
    private final Compiler compiler;

    public ProcessDefinesWithInjectedNamespace(Compiler compiler) {
      this.compiler = compiler;
    }

    @Override
    public void process(Node externs, Node js) {
      namespace = new GlobalNamespace(compiler, js);
      new ProcessDefines(compiler, overrides)
          .injectNamespace(namespace)
          .process(externs, js);
    }
  }
}
