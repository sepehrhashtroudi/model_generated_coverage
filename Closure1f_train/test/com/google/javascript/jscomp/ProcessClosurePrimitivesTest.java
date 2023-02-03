/*
 * Copyright 2006 The Closure Compiler Authors.
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
import com.google.javascript.jscomp.CheckLevel;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.BASE_CLASS_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.DUPLICATE_NAMESPACE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.EXPECTED_OBJECTLIT_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.FUNCTION_NAMESPACE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_PROVIDE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_STYLE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.LATE_PROVIDE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.MISSING_PROVIDE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.NULL_ARGUMENT_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.XMODULE_REQUIRE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_CSS_RENAMING_MAP;

/**
 * Tests for {@link ProcessClosurePrimitives}.
 *
 */
public class ProcessClosurePrimitivesTest extends CompilerTestCase {
  private String additionalCode;
  private String additionalEndCode;
  private boolean addAdditionalNamespace;

  public ProcessClosurePrimitivesTest() {
    enableLineNumberCheck(true);
  }

  @Override protected void setUp() {
    additionalCode = null;
    additionalEndCode = null;
    addAdditionalNamespace = false;
  }

  @Override public CompilerPass getProcessor(final Compiler compiler) {
    if ((additionalCode == null) && (additionalEndCode == null)) {
      return new ProcessClosurePrimitives(
          compiler, null, CheckLevel.ERROR);
    } else {
      return new CompilerPass() {
        @Override
        public void process(Node externs, Node root) {
          // Process the original code.
          new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF)
              .process(externs, root);

          // Inject additional code at the beginning.
          if (additionalCode != null) {
            SourceFile file =
                SourceFile.fromCode("additionalcode", additionalCode);
            Node scriptNode = root.getFirstChild();
            Node newScriptNode = new CompilerInput(file).getAstRoot(compiler);
            if (addAdditionalNamespace) {
              newScriptNode.getFirstChild()
                  .putBooleanProp(Node.IS_NAMESPACE, true);
            }
            while (newScriptNode.getLastChild() != null) {
              Node lastChild = newScriptNode.getLastChild();
              newScriptNode.removeChild(lastChild);
              scriptNode.addChildBefore(lastChild, scriptNode.getFirstChild());
            }
          }

          // Inject additional code at the end.
          if (additionalEndCode != null) {
            SourceFile file =
                SourceFile.fromCode("additionalendcode", additionalEndCode);
            Node scriptNode = root.getFirstChild();
            Node newScriptNode = new CompilerInput(file).getAstRoot(compiler);
            if (addAdditionalNamespace) {
              newScriptNode.getFirstChild()
                  .putBooleanProp(Node.IS_NAMESPACE, true);
            }
            while (newScriptNode.getFirstChild() != null) {
              Node firstChild = newScriptNode.getFirstChild();
              newScriptNode.removeChild(firstChild);
              scriptNode.addChildToBack(firstChild);
            }
          }

          // Process the tree a second time.
          new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR)
              .process(externs, root);
        }
      };
    }
  }

  @Override public int getNumRepetitions() {
    return 1;
  }


public void testSetCssNameMappingValidity22() { 
     test("goog.setCssNameMapping({'a': 'b', 'a-a': 'c'})", "", null, INVALID_CSS_RENAMING_MAP); 
     test("goog.setCssNameMapping({'a': 'b', 'a-a': 'c'}, 'BY_WHOLE')", "", null, INVALID_CSS_RENAMING_MAP); 
     test("goog.setCssNameMapping({foo:'bar'}, 'UNKNOWN');", "", INVALID_STYLE_ERROR); 
 } 


public void testValidBase6170() { 
     test("var goog = {}; goog.Foo = function() { goog.base(this); }; " + "goog.inherits(goog.Foo, goog.BaseFoo);", "var goog = {}; goog.Foo = function() { goog.BaseFoo.call(this); }; " + "goog.inherits(goog.Foo, goog.BaseFoo);"); 
 } 


public void testInvalidProvide205() { 
     test("goog.provide('a.class');", null, INVALID_PROVIDE_ERROR); 
 } 


public void testImplicitProvideInIndependentModules355() { 
     test(createModuleStar("", "goog.provide('apps.A');", "goog.provide('apps.B');"), new String[] { "var apps = {};", "apps.A = {};", "apps.B = {};" }); 
 } 


public void testProvideOrder3a369() { 
     test("goog.provide('a.b');" + "a.b = function(x,y) {};" + "goog.provide('a.b.c');" + "a.b.c;", "var a = {};" + "a.b = function(x,y) {};" + "a.b.c = {};" + "a.b.c;"); 
 } 


public void testSetCssNameMappingNonStringValueReturnsError388() { 
     test("var BAR = {foo:'bar'}; goog.setCssNameMapping(BAR);", "", EXPECTED_OBJECTLIT_ERROR); 
     test("goog.setCssNameMapping([]);", "", EXPECTED_OBJECTLIT_ERROR); 
     test("goog.setCssNameMapping(false);", "", EXPECTED_OBJECTLIT_ERROR); 
     test("goog.setCssNameMapping(null);", "", EXPECTED_OBJECTLIT_ERROR); 
     test("goog.setCssNameMapping(undefined);", "", EXPECTED_OBJECTLIT_ERROR); 
     test("var BAR = 'bar'; goog.setCssNameMapping({foo:BAR});", "", NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR); 
     test("goog.setCssNameMapping({foo:6});", "", NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR); 
     test("goog.setCssNameMapping({foo:false});", "", NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR); 
     test("goog.setCssNameMapping({foo:null});", "", NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR); 
     test("goog.setCssNameMapping({foo:undefined});", "", NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR); 
 } 


public void testInvalidBase4398() { 
     test(String.format(METHOD_FORMAT, "goog.base(this, 'bar');"), null, BASE_CLASS_ERROR); 
 } 


public void testSimpleDottedAdditionalProvide496() { 
     additionalCode = "goog.provide('a.b.B'); a.b.B = {};"; 
     test("goog.provide('c.d.D'); c.d.D = {};", "var a={};a.b={};a.b.B={};var c={};c.d={};c.d.D={};"); 
 } 


public void testLateProvides522() { 
     test("goog.require('foo'); goog.provide('foo');", "var foo={};", LATE_PROVIDE_ERROR); 
     test("goog.require('foo.bar'); goog.provide('foo.bar');", "var foo={}; foo.bar={};", LATE_PROVIDE_ERROR); 
     test("goog.provide('foo.bar'); goog.require('foo'); goog.provide('foo');", "var foo={}; foo.bar={};", LATE_PROVIDE_ERROR); 
 } 


public void testBadCrossModuleRequire526() { 
     test(createModuleStar("", "goog.provide('goog.ui');", "goog.require('goog.ui');"), new String[] { "", "goog.ui = {};", "" }, null, XMODULE_REQUIRE_ERROR); 
 } 


public void testProvideErrorCases625() { 
     test("goog.provide();", "", NULL_ARGUMENT_ERROR); 
     test("goog.provide(5);", "", INVALID_ARGUMENT_ERROR); 
     test("goog.provide([]);", "", INVALID_ARGUMENT_ERROR); 
     test("goog.provide({});", "", INVALID_ARGUMENT_ERROR); 
     test("goog.provide('foo', 'bar');", "", TOO_MANY_ARGUMENTS_ERROR); 
     test("goog.provide('foo'); goog.provide('foo');", "", DUPLICATE_NAMESPACE_ERROR); 
     test("goog.provide('foo.bar'); goog.provide('foo'); goog.provide('foo');", "", DUPLICATE_NAMESPACE_ERROR); 
 } 


public void testGoodCrossModuleRequire1719() { 
     test(createModuleStar("goog.provide('goog.ui');", "", "goog.require('goog.ui');"), new String[] { "goog.ui = {};", "", "" }); 
 } 


public void testInvalidBase1782() { 
     test("goog.base(this, 'method');", null, BASE_CLASS_ERROR); 
 } 


public void testMissingRequireWithAdditionalProvide1116() { 
     additionalCode = "goog.provide('b.B'); b.B = {};"; 
     test("goog.require('b.C'); goog.provide('a.A'); a.A = {};", "var b={};b.B={};var a={};a.A={};", MISSING_PROVIDE_ERROR); 
 } 


public void testAddDependency1385() { 
     test("goog.addDependency('x.js', ['A', 'B'], []);", "0"); 
     Compiler compiler = getLastCompiler(); 
     assertTrue(compiler.getTypeRegistry().isForwardDeclaredType("A")); 
     assertTrue(compiler.getTypeRegistry().isForwardDeclaredType("B")); 
     assertFalse(compiler.getTypeRegistry().isForwardDeclaredType("C")); 
 } 


public void testRemovalOfProvidedObjLit1422() { 
     test("goog.provide('foo'); foo = 0;", "var foo = 0;"); 
     test("goog.provide('foo'); foo = {a: 0};", "var foo = {a: 0};"); 
     test("goog.provide('foo'); foo = function(){};", "var foo = function(){};"); 
     test("goog.provide('foo'); var foo = 0;", "var foo = 0;"); 
     test("goog.provide('foo'); var foo = {a: 0};", "var foo = {a: 0};"); 
     test("goog.provide('foo'); var foo = function(){};", "var foo = function(){};"); 
     test("goog.provide('foo.bar.Baz'); foo.bar.Baz=function(){};", "var foo={}; foo.bar={}; foo.bar.Baz=function(){};"); 
     test("goog.provide('foo.bar.moo'); foo.bar.moo={E:1,S:2};", "var foo={}; foo.bar={}; foo.bar.moo={E:1,S:2};"); 
     test("goog.provide('foo.bar.moo'); foo.bar.moo={E:1}; foo.bar.moo={E:2};", "var foo={}; foo.bar={}; foo.bar.moo={E:1}; foo.bar.moo={E:2};"); 
 } 


public void testValidBase31440() { 
     test(String.format(METHOD_FORMAT, "return goog.base(this, 'method');"), String.format(METHOD_FORMAT, "return Foo.superClass_.method.call(this)")); 
 } 


public void testInvalidBase91518() { 
     test("var goog = {}; goog.Foo = function() { goog.base(this); }", null, BASE_CLASS_ERROR); 
 } 


public void testProvideInIndependentModules41674() { 
     test(createModuleStar("goog.provide('apps');", "goog.provide('apps.foo.bar.B');", "goog.provide('apps.foo.bar.C');"), new String[] { "var apps = {};apps.foo = {};apps.foo.bar = {}", "apps.foo.bar.B = {};", "apps.foo.bar.C = {};" }); 
 } 


public void testNoStubForProvidedTypedef41772() { 
     test("goog.provide('x.y.z'); /** @typedef {number} */ x.y.z;", "var x = {}; x.y = {}; x.y.z;"); 
 } 


public void testInvalidBase81861() { 
     test("var Foo = function() { goog.base(this); }", null, BASE_CLASS_ERROR); 
 } 


public void testReorderedProvides2083() { 
     additionalCode = "a.B = {};"; 
     addAdditionalNamespace = true; 
     test("goog.provide('a.A'); a.A = {};", "var a={};a.B={};a.A={};"); 
 } 


public void testOverlappingDottedAdditionalProvide2101() { 
     additionalCode = "goog.provide('a.b.B'); a.b.B = {};"; 
     test("goog.provide('a.b.C'); a.b.C = {};", "var a={};a.b={};a.b.B={};a.b.C={};"); 
 } 


public void testInvalidBase32102() { 
     test(String.format(METHOD_FORMAT, "goog.base();"), null, BASE_CLASS_ERROR); 
 } 


public void testValidSetCssNameMapping2235() { 
     test("goog.setCssNameMapping({foo:'bar',\"biz\":'baz'});", ""); 
     CssRenamingMap map = getLastCompiler().getCssRenamingMap(); 
     assertNotNull(map); 
     assertEquals("bar", map.get("foo")); 
     assertEquals("baz", map.get("biz")); 
 } 


public void testProvideInIndependentModules12251() { 
     test(createModuleStar("goog.provide('apps');", "goog.provide('apps.foo');", "goog.provide('apps.foo.B');"), new String[] { "var apps = {}; apps.foo = {};", "", "apps.foo.B = {};" }); 
 } 


public void testInvalidBase72348() { 
     test("function Foo() { goog.base(this); }", null, BASE_CLASS_ERROR); 
 } 


public void testProvidedDeclaredFunctionError2403() { 
     test("goog.provide('foo'); function foo(){}", null, FUNCTION_NAMESPACE_ERROR); 
 } 


public void testInvalidBase62450() { 
     test(String.format(METHOD_FORMAT, "goog.base.call(null, this, 'method');"), null, BASE_CLASS_ERROR); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Tests providing additional code with non-overlapping var namespace.
  

  // Same as above, but with the additional code added after the original.
  

  // Tests providing additional code with non-overlapping dotted namespace.
  

  // Tests providing additional code with overlapping var namespace.
  

  // Tests providing additional code with overlapping var namespace.
  

  // Tests providing additional code with overlapping dotted namespace.
  

  // Tests that a require of additional code generates no error.
  

  // Tests that a require not in additional code generates (only) one error.
  

  // Tests that a require in additional code generates no error.
  

  // Tests a case where code is reordered after processing provides and then
  // provides are processed again.
  

  // Another version of above.
  

  // Provide a name before the definition of the class providing the
  // parent namespace.
  

  // Provide a name after the definition of the class providing the
  // parent namespace.
  

  // Provide a name after the definition of the class providing the
  // parent namespace.
  

  

  

  

  

  private static final String METHOD_FORMAT =
      "function Foo() {} Foo.prototype.method = function() { %s };";

  private static final String FOO_INHERITS =
      "goog.inherits(Foo, BaseFoo);";

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
