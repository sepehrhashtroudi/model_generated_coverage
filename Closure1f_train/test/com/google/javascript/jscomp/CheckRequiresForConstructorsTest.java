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

import static com.google.javascript.jscomp.CheckRequiresForConstructors.MISSING_REQUIRE_WARNING;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Result;

/**
 * Tests for {@link CheckRequiresForConstructors}.
 *
 */
public class CheckRequiresForConstructorsTest extends CompilerTestCase {
  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new CheckRequiresForConstructors(compiler, CheckLevel.WARNING);
  }


public void testShouldWarnWhenInstantiatingGlobalClassesFromGlobalScope544() { 
     String good = "/** @constructor */ function Baz(){}; " + "Baz.prototype.bar = function(){return new Baz();};"; 
     String bad = "var baz = new Baz()"; 
     String[] js = new String[] { good, bad }; 
     String warning = "'Baz' used but not goog.require'd"; 
     test(js, js, null, MISSING_REQUIRE_WARNING, warning); 
 } 


public void testNoWarningsForThisConstructor663() { 
     String js = "var goog = {};" + "/** @constructor */goog.Foo = function() {};" + "goog.Foo.bar = function() {" + "  return new this.constructor; " + "};"; 
     testSame(js); 
 } 


public void testNewNodesWithMoreThanOneFile855() { 
     String[] js = new String[] { "var goog = {};" + "/** @constructor */ function Bar() {}" + "goog.require('Bar');", "var bar = new Bar();" }; 
     String warning = "'Bar' used but not goog.require'd"; 
     test(js, js, null, MISSING_REQUIRE_WARNING, warning); 
 } 


public void testPassWithLocalVariables1174() { 
     String js = "/** @constructor */ var nodeCreator = function() {};" + "var newNode = new nodeCreator();"; 
     testSame(js); 
 } 


public void testPassWithOneNewOuterClassWithUpperPrefix1615() { 
     String js = "var goog = {};" + "goog.require('goog.foo.IDBar'); var bar = new goog.foo.IDBar.Baz();"; 
     testSame(js); 
 } 


public void testFailWithNestedNewNodes2023() { 
     String[] js = new String[] { "var goog = {}; goog.require('goog.foo.Bar'); " + "var str = new goog.foo.Bar(new goog.foo.Baz('5')); " }; 
     String warning = "'goog.foo.Baz' used but not goog.require'd"; 
     test(js, js, null, MISSING_REQUIRE_WARNING, warning); 
 } 


public void testRequiresAreCaughtBeforeProcessed2119() { 
     String js = "var foo = {}; var bar = new foo.bar.goo();"; 
     SourceFile input = SourceFile.fromCode("foo.js", js); 
     Compiler compiler = new Compiler(); 
     CompilerOptions opts = new CompilerOptions(); 
     opts.checkRequires = CheckLevel.WARNING; 
     opts.closurePass = true; 
     Result result = compiler.compile(ImmutableList.<SourceFile>of(), ImmutableList.of(input), opts); 
     JSError[] warnings = result.warnings; 
     assertNotNull(warnings); 
     assertTrue(warnings.length > 0); 
     String expectation = "'foo.bar.goo' used but not goog.require'd"; 
     for (JSError warning : warnings) { 
         if (expectation.equals(warning.description)) { 
             return; 
         } 
     } 
     fail("Could not find the following warning:" + expectation); 
 } 


public void testFailWithLocalVariableInMoreThanOneFile2255() { 
     String localVar = "/** @constructor */ function tempCtor() {}" + "function baz(){" + " /** @constructor */ function tempCtor() {}; " + "var foo = new tempCtor();}"; 
     String[] js = new String[] { localVar, " var foo = new tempCtor();" }; 
     String warning = "'tempCtor' used but not goog.require'd"; 
     test(js, js, null, MISSING_REQUIRE_WARNING, warning); 
 } 


public void testBug20624872375() { 
     testSame("var goog = {};" + "/** @constructor */goog.Foo = function() {" + "  /** @constructor */ this.x_ = function() {};" + "  this.y_ = new this.x_();" + "};"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
