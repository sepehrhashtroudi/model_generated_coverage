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

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.collect.TreeMultiset;
import com.google.javascript.jscomp.DefinitionsRemover.Definition;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Collection;
import java.util.Set;

/**
 * Tests for {@link SimpleDefinitionFinder}
 *
 */
public class SimpleDefinitionFinderTest extends CompilerTestCase {
  Set<String> found = Sets.newTreeSet();

  @Override
  protected int getNumRepetitions() {
    // run pass once.
    return 1;
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
    found.clear();
  }


public void testObjectLitInExterns1582() { 
     checkDefinitions("var goog = {};" + "/** @type {number} */ goog.HYBRID;" + "/** @enum */ goog.Enum = {HYBRID: 0, ROADMAP: 1};", "goog.HYBRID; goog.Enum.ROADMAP;", ImmutableSet.of("DEF GETPROP goog.Enum -> EXTERN <null>", "DEF GETPROP goog.HYBRID -> EXTERN <null>", "DEF NAME goog -> EXTERN <null>", "DEF STRING_KEY null -> EXTERN NUMBER", "USE GETPROP goog.Enum -> [EXTERN <null>]", "USE GETPROP goog.Enum.ROADMAP -> [EXTERN NUMBER]", "USE GETPROP goog.HYBRID -> [EXTERN <null>, EXTERN NUMBER]", "USE NAME goog -> [EXTERN <null>]")); 
 } 


public void testFunctionArgumentsInExterns1999() throws Exception { 
     final String DEF = "var f = function(arg1, arg2){}"; 
     final String USE = "f(1, 2)"; 
     checkDefinitionsInJs(DEF + ";" + USE, ImmutableSet.of("DEF NAME f -> FUNCTION", "DEF NAME arg1 -> <null>", "DEF NAME arg2 -> <null>", "USE NAME f -> [FUNCTION]")); 
     checkDefinitions(DEF, USE, ImmutableSet.of("DEF NAME f -> EXTERN FUNCTION", "USE NAME f -> [EXTERN FUNCTION]")); 
 } 


public void testDefineNumber2141() throws Exception { 
     checkDefinitionsInJs("var a = 1", ImmutableSet.of("DEF NAME a -> NUMBER")); 
     checkDefinitionsInJs("a = 1", ImmutableSet.of("DEF NAME a -> NUMBER")); 
     checkDefinitionsInJs("a.b = 1", ImmutableSet.of("DEF GETPROP a.b -> NUMBER")); 
     checkDefinitionsInJs("a[\"b\"] = 1", ImmutableSet.<String>of()); 
     checkDefinitionsInJs("f().b = 1", ImmutableSet.of("DEF GETPROP null -> NUMBER")); 
     checkDefinitionsInJs("({a : 1}); o.a", ImmutableSet.of("DEF STRING_KEY null -> NUMBER", "USE GETPROP o.a -> [NUMBER]")); 
     checkDefinitionsInJs("({'a' : 1}); o['a']", ImmutableSet.<String>of("DEF STRING_KEY null -> NUMBER")); 
     checkDefinitionsInJs("({1 : 1}); o[1]", ImmutableSet.<String>of("DEF STRING_KEY null -> NUMBER")); 
     checkDefinitionsInJs("var a = {b : 1}; a.b", ImmutableSet.of("DEF NAME a -> <null>", "DEF STRING_KEY null -> NUMBER", "USE NAME a -> [<null>]", "USE GETPROP a.b -> [NUMBER]")); 
 } 


public void testMultipleDefinition2205() throws Exception { 
     checkDefinitionsInJs("a = 1; a = 2; a", ImmutableSet.of("DEF NAME a -> NUMBER", "USE NAME a -> [NUMBER x 2]")); 
     checkDefinitionsInJs("a = 1; a = 'a'; a", ImmutableSet.of("DEF NAME a -> NUMBER", "DEF NAME a -> STRING", "USE NAME a -> [NUMBER, STRING]")); 
     checkDefinitionsInJs("a = 1; b = 2; a = b; a", ImmutableSet.of("DEF NAME a -> <null>", "DEF NAME a -> NUMBER", "DEF NAME b -> NUMBER", "USE NAME a -> [<null>, NUMBER]", "USE NAME b -> [NUMBER]")); 
     checkDefinitionsInJs("a = 1; b = 2; c = b; c = a; c", ImmutableSet.of("DEF NAME a -> NUMBER", "DEF NAME b -> NUMBER", "DEF NAME c -> <null>", "USE NAME a -> [NUMBER]", "USE NAME b -> [NUMBER]", "USE NAME c -> [<null> x 2]")); 
     checkDefinitionsInJs("function f(){} f()", ImmutableSet.of("DEF NAME f -> FUNCTION", "USE NAME f -> [FUNCTION]")); 
     checkDefinitionsInJs("function f(){} f.call(null)", ImmutableSet.of("DEF NAME f -> FUNCTION", "USE NAME f -> [FUNCTION]", "USE GETPROP f.call -> [FUNCTION]")); 
     checkDefinitionsInJs("function f(){} f.apply(null, [])", ImmutableSet.of("DEF NAME f -> FUNCTION", "USE NAME f -> [FUNCTION]", "USE GETPROP f.apply -> [FUNCTION]")); 
     checkDefinitionsInJs("function f(){} f.foobar()", ImmutableSet.of("DEF NAME f -> FUNCTION", "USE NAME f -> [FUNCTION]")); 
     checkDefinitionsInJs("function f(){} f(); f.call(null)", ImmutableSet.of("DEF NAME f -> FUNCTION", "USE NAME f -> [FUNCTION]", "USE GETPROP f.call -> [FUNCTION]")); 
 } 


public void testCallInExterns2311() { 
     checkDefinitionsInExterns("var goog = {};" + "/** @constructor */ goog.Response = function() {};" + "goog.Response.prototype.get;" + "goog.Response.prototype.get().get;", ImmutableSet.of("DEF GETPROP goog.Response -> EXTERN FUNCTION", "DEF GETPROP goog.Response.prototype.get -> EXTERN <null>", "DEF GETPROP null -> EXTERN <null>", "DEF NAME goog -> EXTERN <null>", "USE GETPROP goog.Response -> [EXTERN FUNCTION]", "USE GETPROP goog.Response.prototype.get -> [EXTERN <null> x 2]", "USE NAME goog -> [EXTERN <null>]")); 
 } 

  

  

  

  

  

  

  

  

  

  

  void checkDefinitionsInExterns(String externs, Set<String> expected) {
    checkDefinitions(externs, "", expected);
  }

  void checkDefinitionsInJs(String js, Set<String> expected) {
    checkDefinitions("", js, expected);
  }

  void checkDefinitions(String externs, String source, Set<String> expected) {
    testSame(externs, source, null);
    assertEquals(expected, found);
    found.clear();
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new SimpleDefinitionEnumerator(compiler);
  }

  /**
   * Run SimpleDefinitionFinder, then gather a list of definitions.
   */
  private class SimpleDefinitionEnumerator
      extends AbstractPostOrderCallback implements CompilerPass {
    private final SimpleDefinitionFinder passUnderTest;
    private final Compiler compiler;

    SimpleDefinitionEnumerator(Compiler compiler) {
      this.passUnderTest = new SimpleDefinitionFinder(compiler);
      this.compiler = compiler;
    }

      @Override
      public void process(Node externs, Node root) {
          passUnderTest.process(externs, root);
          NodeTraversal.traverse(compiler, externs, this);
          NodeTraversal.traverse(compiler, root, this);

          for (DefinitionSite defSite : passUnderTest.getDefinitionSites()) {
              Node node = defSite.node;
              Definition definition = defSite.definition;
              StringBuilder sb = new StringBuilder();
              sb.append("DEF ");
              sb.append(Token.name(node.getType()));
              sb.append(" ");
              sb.append(node.getQualifiedName());
              sb.append(" -> ");

              if (definition.isExtern()) {
                  sb.append("EXTERN ");
              }

              Node rValue = definition.getRValue();
              if (rValue != null) {
                  sb.append(Token.name(rValue.getType()));
              } else {
                  sb.append("<null>");
              }

              found.add(sb.toString());
          }

      }
      @Override
      public void visit(NodeTraversal traversal, Node node, Node parent) {
          Collection<Definition> defs =
                  passUnderTest.getDefinitionsReferencedAt(node);
          if (defs != null) {
              StringBuilder sb = new StringBuilder();
              sb.append("USE ");
              sb.append(Token.name(node.getType()));
              sb.append(" ");
              sb.append(node.getQualifiedName());
              sb.append(" -> ");
              Multiset<String> defstrs = TreeMultiset.create();
              for (Definition def : defs) {
                  String defstr;

                  Node rValue = def.getRValue();
                  if (rValue != null) {
                      defstr = Token.name(rValue.getType());
                  } else {
                      defstr = "<null>";
                  }

                  if (def.isExtern()) {
                      defstr = "EXTERN " + defstr;
                  }

                  defstrs.add(defstr);
              }

              sb.append(defstrs.toString());
              found.add(sb.toString());
          }
      }
    

    
  }



}
