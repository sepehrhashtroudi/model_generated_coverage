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

import com.google.common.collect.ImmutableSet;

import java.util.*;

/**
 * Tests for {@link AliasStrings}.
 *
 */
public class AliasStringsTest extends CompilerTestCase {

  private static final String EXTERNS = "alert";
  private static final Set<String> ALL_STRINGS = null;

  private Set<String> strings = ALL_STRINGS;
  private JSModuleGraph moduleGraph = null;
  private boolean hashReduction = false;

  public AliasStringsTest() {
    super(EXTERNS);
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(false);
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    AliasStrings pass =
        new AliasStrings(compiler, moduleGraph, strings, "(?i)secret", false);
    if (hashReduction)
      pass.unitTestHashReductionMask = 0;
    return pass;
  }


public void testStringsThatAreGlobalVarValues276() { 
     strings = ALL_STRINGS; 
     testSame("var foo='foo'; var bar='';"); 
     testSame("var foo=['foo','bar'];"); 
     testSame("var foo=['foo',['bar']];"); 
     test("var foo=['foo', 'bar'];function bar() {return 'foo';}", "var $$S_foo='foo';" + "var foo=[$$S_foo, 'bar'];function bar() {return $$S_foo;}"); 
     testSame("var foo={'foo': 'bar'};"); 
     testSame("var foo={'foo': {'bar': 'baz'}};"); 
     test("var foo={'foo': 'bar'};function bar() {return 'foo';}", "var $$S_foo='foo';var foo={'foo': 'bar'};" + "function bar() {return $$S_foo;}"); 
     test("var foo={'foo': 'foo'};function bar() {return 'foo';}", "var $$S_foo='foo';" + "var foo={'foo': $$S_foo};function bar() {return $$S_foo;}"); 
 } 


public void testObjectLiterals610() { 
     strings = ImmutableSet.of("px", "!@#$%^&*()"); 
     test("var foo={px:435}", "var foo={px:435}"); 
     test("var foo={'px':435}", "var foo={'px':435}"); 
     test("bar=function f(){return {'px':435}}", "bar=function f(){return {'px':435}}"); 
     test("function f() {var foo={bar:'!@#$%^&*()'}}", "var $$S_$21$40$23$24$25$5e$26$2a$28$29='!@#$%^&*()';" + "function f() {var foo={bar:$$S_$21$40$23$24$25$5e$26$2a$28$29}}"); 
     test("function f() {var foo={px:435,foo:'px',bar:'baz'}}", "var $$S_px='px';" + "function f() {var foo={px:435,foo:$$S_px,bar:'baz'}}"); 
 } 


public void testGetProp1055() { 
     strings = ImmutableSet.of("px", "width"); 
     testSame("function f(){element.style.px=1234}"); 
     test("function f(){shape.width.units='px'}", "var $$S_px='px';function f(){shape.width.units=$$S_px}"); 
     test("function f(){shape['width'].units='pt'}", "var $$S_width='width';" + "function f(){shape[$$S_width].units='pt'}"); 
 } 


public void testLongStableAliasHashCollision1503() { 
     strings = ALL_STRINGS; 
     hashReduction = true; 
     test("f('Antidisestablishmentarianism');" + "f('Antidisestablishmentarianism');" + "f('Antidisestablishmentarianismo');" + "f('Antidisestablishmentarianismo');", "var $$S_Antidisestablishment_0=" + "  'Antidisestablishmentarianism';" + "var $$S_Antidisestablishment_0_1=" + "  'Antidisestablishmentarianismo';" + "f($$S_Antidisestablishment_0);" + "f($$S_Antidisestablishment_0);" + "f($$S_Antidisestablishment_0_1);" + "f($$S_Antidisestablishment_0_1);"); 
 } 


public void testBlackList1698() { 
     test("(function (){var f=\'sec ret\';g=\"TOPseCreT\"})", "var $$S_sec$20ret='sec ret';" + "(function (){var f=$$S_sec$20ret;g=\"TOPseCreT\"})"); 
 } 


public void testEmptyModules1766() { 
     JSModule[] modules = createModuleStar("", "function foo() { f('good') }", "function foo() { f('good') }"); 
     moduleGraph = new JSModuleGraph(modules); 
     test(modules, new String[] { "var $$S_good='good'", "function foo() {f($$S_good)}", "function foo() {f($$S_good)}" }); 
     moduleGraph = null; 
 } 


public void testStringsInModules21924() { 
     strings = ALL_STRINGS; 
     JSModule[] modules = createModuleBush("function g() { alert('ciao'); }", "function h(a) { alert('h:' + a); }", "h('ciao' + 'adios');", "g();"); 
     moduleGraph = new JSModuleGraph(modules); 
     test(modules, new String[] { "var $$S_ciao = 'ciao';" + "function g() { alert($$S_ciao); }", "var $$S_h$3a = 'h:';" + "function h(a) { alert($$S_h$3a + a); }", "h($$S_ciao + 'adios');", "g();" }); 
     moduleGraph = null; 
 } 


public void testStringsInModules1944() { 
     strings = ALL_STRINGS; 
     JSModule[] modules = createModuleBush("function f(a) { alert('f:' + a); }" + "function g() { alert('ciao'); }", "f('-------hi-------');" + "f('bye');" + "function h(a) { alert('h:' + a); }", "f('-------hi-------');" + "h('ciao' + '------adios------');" + "(function() { alert('zzz'); })();", "f('-------hi-------'); alert('------adios------');" + "h('-----peaches-----'); h('-----peaches-----');"); 
     moduleGraph = new JSModuleGraph(modules); 
     test(modules, new String[] { "var $$S_ciao = 'ciao';" + "var $$S_f$3a = 'f:';" + "function f(a) { alert($$S_f$3a + a); }" + "function g() { alert($$S_ciao); }", "var $$S_$2d$2d$2d$2d$2d$2d$2dhi$2d$2d$2d$2d$2d$2d$2d" + " = '-------hi-------';" + "var $$S_$2d$2d$2d$2d$2d$2d_adios$2d$2d$2d$2d$2d$2d" + " = '------adios------'; " + "var $$S_h$3a = 'h:';" + "f($$S_$2d$2d$2d$2d$2d$2d$2dhi$2d$2d$2d$2d$2d$2d$2d);" + "f('bye');" + "function h(a) { alert($$S_h$3a + a); }", "var $$S_zzz = 'zzz';" + "f($$S_$2d$2d$2d$2d$2d$2d$2dhi$2d$2d$2d$2d$2d$2d$2d);" + "h($$S_ciao + $$S_$2d$2d$2d$2d$2d$2d_adios$2d$2d$2d$2d$2d$2d);" + "(function() { alert($$S_zzz) })();", "var $$S_$2d$2d$2d$2d$2dpeaches$2d$2d$2d$2d$2d" + " = '-----peaches-----';" + "f($$S_$2d$2d$2d$2d$2d$2d$2dhi$2d$2d$2d$2d$2d$2d$2d);" + "alert($$S_$2d$2d$2d$2d$2d$2d_adios$2d$2d$2d$2d$2d$2d);" + "h($$S_$2d$2d$2d$2d$2dpeaches$2d$2d$2d$2d$2d);" + "h($$S_$2d$2d$2d$2d$2dpeaches$2d$2d$2d$2d$2d);" }); 
     moduleGraph = null; 
 } 

  

  

  

  

  

  

  

  

  

  


  

  

  


  
}
