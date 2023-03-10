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
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;

import java.util.Deque;


/**
 * Tests for {@link InferJSDocInfo}.
 * @author nicksantos@google.com (Nick Santos)
 */
// TODO(nicksantos): A lot of this code is duplicated from
// TypedScopeCreatorTest. We should create a common test harness for
// assertions about type information.
public class InferJSDocInfoTest extends CompilerTestCase {

  private Scope globalScope;

  @Override
  public int getNumRepetitions() {
    return 1;
  }

  @Override
  protected CompilerOptions getOptions() {
    CompilerOptions options = super.getOptions();
    options.ideMode = true;
    return options;
  }

  private final Callback callback = new AbstractPostOrderCallback() {
    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      Scope s = t.getScope();
      if (s.isGlobal()) {
        globalScope = s;
      }
    }
  };

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        MemoizedScopeCreator scopeCreator =
            new MemoizedScopeCreator(new TypedScopeCreator(compiler));
        Scope topScope = scopeCreator.createScope(root.getParent(), null);
        (new TypeInferencePass(
            compiler, compiler.getReverseAbstractInterpreter(),
            topScope, scopeCreator)).process(externs, root);
        NodeTraversal t = new NodeTraversal(
            compiler, callback, scopeCreator);
        t.traverseRoots(Lists.newArrayList(externs, root));
        (new InferJSDocInfo(compiler)).process(externs, root);
      }
    };
  }


public void testNativeCtor220() { 
     testSame("/** Object. \n * @param {*=} x \n * @constructor */ " + "function Object(x) {};", "var x = new Object();" + "/** Another object. */ var y = new Object();", null); 
     assertEquals("Object.", findGlobalNameType("x").getJSDocInfo().getBlockDescription()); 
     assertEquals("Object.", findGlobalNameType("y").getJSDocInfo().getBlockDescription()); 
     assertEquals("Object.", globalScope.getVar("y").getType().getJSDocInfo().getBlockDescription()); 
 } 


public void testStructuralFunctions801() { 
     testSame("/** Object. \n * @param {*=} x \n * @constructor */ " + "function Object(x) {};", "/** Function. \n * @param {*} x */ " + "function fn(x) {};" + "var goog = {};" + "/** Another object. \n * @type {Object} */ goog.x = new Object();" + "/** Another function. \n * @param {number} x */ goog.y = fn;", null); 
     assertEquals("(Object|null)", globalScope.getVar("goog.x").getType().toString()); 
     assertEquals("Object.", globalScope.getVar("goog.x").getType().restrictByNotNullOrUndefined().getJSDocInfo().getBlockDescription()); 
     assertEquals("Another function.", globalScope.getVar("goog.y").getType().getJSDocInfo().getBlockDescription()); 
 } 


public void testInterface1113() { 
     testSame("/** An interface. \n * @interface */ function Foo() {}" + "var f = new Foo();" + "/** @type {number} */ f.bar = 4;"); 
     ObjectType type = (ObjectType) globalScope.getVar("Foo").getType(); 
     assertEquals("An interface.", type.getJSDocInfo().getBlockDescription()); 
 } 


public void testNamespacedCtor2215() { 
     testSame("var goog = {};" + "/** Hello! \n * @constructor */ goog.Foo = function() {};" + "goog.Foo.bar = goog.Foo;" + "/** Bye! \n * @param {string=} opt_x */" + "goog.Foo.prototype.baz = goog.Foo;" + "/** Blargh */ var x = new goog.Foo();"); 
     assertEquals("Hello!", findGlobalNameType("x").getJSDocInfo().getBlockDescription()); 
     assertEquals("Hello!", findGlobalNameType("goog.Foo").getJSDocInfo().getBlockDescription()); 
     assertEquals("Hello!", findGlobalNameType("goog.Foo.bar").getJSDocInfo().getBlockDescription()); 
     assertEquals("Hello!", findGlobalNameType("goog.Foo.prototype.baz").getJSDocInfo().getBlockDescription()); 
     ObjectType proto = (ObjectType) findGlobalNameType("goog.Foo.prototype"); 
     assertEquals("Bye!", proto.getPropertyType("baz").getJSDocInfo().getBlockDescription()); 
 } 

  

  

  

  

  

  

  private JSType findGlobalNameType(String name) {
    return findNameType(name, globalScope);
  }

  private JSType findNameType(String name, Scope scope) {
    Node root = scope.getRootNode();
    Deque<Node> queue = Lists.newLinkedList();
    queue.push(root);
    while (!queue.isEmpty()) {
      Node current = queue.pop();
      if (name.equals(current.getQualifiedName()) &&
          current.getJSType() != null) {
        return current.getJSType();
      }

      for (Node child : current.children()) {
        queue.push(child);
      }
    }
    return null;
  }
}
