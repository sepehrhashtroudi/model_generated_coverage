/*
 * Copyright 2010 The Closure Compiler Authors.
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
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.SpecializeModule.SpecializationState;
import com.google.javascript.rhino.Node;

/**
 * Tests for {@link SpecializeModule}.
 *
 * @author dcc@google.com (Devin Coughlin)
 */
public class SpecializeModuleTest extends CompilerTestCase {

  private static final String SHARED_EXTERNS = "var alert = function() {}";

  public SpecializeModuleTest() {
    super(SHARED_EXTERNS);
  }

  private PassFactory inlineFunctions =
      new PassFactory("inlineFunctions", true) {
    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
      return new InlineFunctions(compiler,
          compiler.getUniqueNameIdSupplier(), true, false, true, true, true);
    }
  };

  private PassFactory removeUnusedPrototypeProperties =
    new PassFactory("removeUnusedPrototypeProperties", true) {
    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
      return new RemoveUnusedPrototypeProperties(compiler, false, false);
    }
  };

  private PassFactory devirtualizePrototypeMethods =
    new PassFactory("devirtualizePrototypeMethods", true) {
    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
      return new DevirtualizePrototypeMethods(compiler);
    }
  };

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    final SpecializeModule specializeModule = new SpecializeModule(compiler,
        devirtualizePrototypeMethods, inlineFunctions,
        removeUnusedPrototypeProperties);

    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        specializeModule.process(externs, root);

        /* Make sure variables are declared before used */
        new VarCheck(compiler).process(externs, root);
      }
    };
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();

    enableNormalize();
  }


public void testSpecializeInlineWithRegularFunctions7() { 
     JSModule[] modules = createModuleStar("function A() {alert(B());A()}" + "function B() {return 6}" + "A();", "B = function() {return 7};" + "A();"); 
     test(modules, new String[] { "function A() {alert(6);A()}" + "A();" + "var B;", "A = function() {alert(B());A()};" + "B = function() {return 6};" + "B = function() {return 7};" + "A();" }); 
 } 


public void testSpecializeInlineWithNamespaces176() { 
     JSModule[] modules = createModuleStar("var ns = {};" + "ns.A = function() {alert(B());ns.A()};" + "var B = function() {return 6};" + "ns.A();", "B = function() {return 7};" + "ns.A();"); 
     test(modules, new String[] { "var ns = {};" + "ns.A = function() {alert(6);ns.A()};" + "ns.A();" + "var B;", "ns.A = function() {alert(B());ns.A()};" + "B = function() {return 6};" + "B = function() {return 7};" + "ns.A();" }); 
 } 


public void testSpecializeDevirtualizePrototypeMethodsWithInline440() { 
     JSModule[] modules = createModuleStar("/** @constructor */" + "var Foo = function(){};" + "Foo.prototype.a = function() {return 7};" + "var x = new Foo();" + "var z = x.a();", ""); 
     test(modules, new String[] { "var Foo = function(){};" + "var x = new Foo();" + "var z = 7;", "Foo.prototype.a = function() {return 7};" }); 
 } 


public void testSpecializeCascadedInline567() { 
     JSModule[] modules = createModuleStar("var A = function() {alert(B());A()};" + "var B = function() {return C()};" + "var C = function() {return 6};" + "A();", "B = function() {return 7};" + "A();"); 
     test(modules, new String[] { "var A = function() {alert(6);A()};" + "A();" + "var B, C;", "A = function() {alert(B());A()};" + "B = function() {return C()};" + "C = function() {return 6};" + "B = function() {return 7};" + "A();" }); 
 } 


public void testSpecializeDevirtualizePrototypeMethods587() { 
     JSModule[] modules = createModuleStar("/** @constructor */" + "var Foo = function(){};" + "Foo.prototype.a = function() {this.a();return 7};" + "Foo.prototype.b = function() {this.a()};" + "var x = new Foo();" + "x.a();", ""); 
     test(modules, new String[] { "var Foo = function(){};" + "var JSCompiler_StaticMethods_a =" + "function(JSCompiler_StaticMethods_a$self) {" + "JSCompiler_StaticMethods_a(JSCompiler_StaticMethods_a$self);" + "return 7" + "};" + "var x = new Foo();" + "JSCompiler_StaticMethods_a(x);", "Foo.prototype.a = function() {this.a();return 7};" + "Foo.prototype.b = function() {this.a()};" }); 
 } 


public void testDontSpecializeAliasedFunctions_remove_unused_properties759() { 
     JSModule[] modules = createModuleStar("var Foo = function(){};" + "Foo.prototype.a = function() {this.a()};" + "Foo.prototype.b = function() {return 6};" + "var aliasB = Foo.prototype.b;" + "Foo.prototype.c = function() {return 7};" + "Foo.prototype.d = function() {return 7};" + "var aliasA = Foo.prototype.a;" + "var x = new Foo();" + "x.a();" + "var aliasC = (new Foo).c", ""); 
     test(modules, new String[] { "var Foo = function(){};" + "Foo.prototype.a = function() {this.a()};" + "Foo.prototype.b = function() {return 6};" + "var aliasB = Foo.prototype.b;" + "Foo.prototype.c = function() {return 7};" + "var aliasA = Foo.prototype.a;" + "var x = new Foo();" + "x.a();" + "var aliasC = (new Foo).c", "Foo.prototype.d = function() {return 7};" }); 
 } 


public void testDontSpecializeAliasedFunctions_inline1377() { 
     JSModule[] modules = createModuleStar("function A() {alert(B());A()}" + "function B() {return 6}" + "var aliasA = A;" + "A();", "B = function() {return 7};" + "B();"); 
     test(modules, new String[] { "function A() {alert(B());A()}" + "function B() {return 6}" + "var aliasA = A;" + "A();", "B = function() {return 7};" + "B();" }); 
 } 


public void testSpecializeRemoveUnusedProperties2027() { 
     JSModule[] modules = createModuleStar("var Foo = function(){};" + "Foo.prototype.a = function() {this.a()};" + "Foo.prototype.b = function() {return 6};" + "Foo.prototype.c = function() {return 7};" + "var aliasA = Foo.prototype.a;" + "var x = new Foo();" + "x.a();", ""); 
     test(modules, new String[] { "var Foo = function(){};" + "Foo.prototype.a = function() {this.a()};" + "var aliasA = Foo.prototype.a;" + "var x = new Foo();" + "x.a();", "Foo.prototype.b = function() {return 6};" + "Foo.prototype.c = function() {return 7};" }); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Tests for {@link SpecializeModule.SpecializationState}.
   */
  public static class SpecializeModuleSpecializationStateTest
      extends CompilerTestCase {

    Compiler lastCompiler;

    SpecializationState lastState;

    @Override
    public CompilerPass getProcessor(final Compiler compiler) {
      lastCompiler = compiler;

      return new CompilerPass() {

        @Override
        public void process(Node externs, Node root) {
          SimpleDefinitionFinder defFinder =
              new SimpleDefinitionFinder(compiler);

          defFinder.process(externs, root);

          SimpleFunctionAliasAnalysis functionAliasAnalysis =
              new SimpleFunctionAliasAnalysis();

          functionAliasAnalysis.analyze(defFinder);

          lastState = new SpecializationState(functionAliasAnalysis);
        }
      };
    }

    

    

    

    private Node findFunction(String name) {
      FunctionFinder f = new FunctionFinder(name);
      new NodeTraversal(lastCompiler, f).traverse(lastCompiler.jsRoot);
      assertNotNull("Couldn't find " + name, f.found);
      return f.found;
    }

    /**
     * Quick Traversal to find a given function in the AST.
     */
    private class FunctionFinder extends AbstractPostOrderCallback {
      Node found = null;
      final String target;

      FunctionFinder(String target) {
        this.target = target;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.isFunction()
            && target.equals(NodeUtil.getFunctionName(n))) {
          found = n;
        }
      }
    }
  }
}
