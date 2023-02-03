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

import com.google.common.collect.Maps;

import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.Node;

import java.util.Map;

/**
 * Unit test for AmbiguateProperties Compiler pass.
 *
 */
public class AmbiguatePropertiesTest extends CompilerTestCase {
  private AmbiguateProperties lastPass;

  private static final String EXTERNS =
      "Function.prototype.call=function(){};" +
      "Function.prototype.inherits=function(){};" +
      "prop.toString;" +
      "var google = { gears: { factory: {}, workerPool: {} } };";

  public AmbiguatePropertiesTest() {
    super(EXTERNS);
    enableNormalize();
    enableTypeCheck(CheckLevel.WARNING);
    enableClosurePass();
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        lastPass = new AmbiguateProperties(compiler, new char[]{'$'});
        lastPass.process(externs, root);
      }
    };
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  @Override
  protected CompilerOptions getOptions() {
    // no missing properties check
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    return options;
  }


public void testOneVar2155() { 
     testSame("/** @constructor */ var Foo = function(){};" + "Foo.prototype = {b: 0};"); 
 } 


public void testExternedPropertyName428() { 
     test("/** @constructor */ var Bar = function(){};" + "/** @override */ Bar.prototype.toString = function(){};" + "Bar.prototype.func = function(){};" + "var bar = new Bar();" + "bar.toString();", "var Bar = function(){};" + "Bar.prototype.toString = function(){};" + "Bar.prototype.a = function(){};" + "var bar = new Bar();" + "bar.toString();"); 
 } 


public void testStaticAndSubInstanceProperties588() { 
     String js = "" + "/** @constructor */ var Foo = function(){};\n" + "Foo.x=0;\n" + "/** @constructor \n @extends Foo */ var Bar = function(){};\n" + "goog.inherits(Bar, Foo);\n" + "Bar.y=0;\n" + "Bar.prototype.z=0;\n"; 
     String output = "" + "/** @constructor */ var Foo = function(){};\n" + "Foo.a=0;\n" + "/** @constructor \n @extends Foo */ var Bar = function(){};\n" + "goog.inherits(Bar, Foo);\n" + "Bar.a=0;\n" + "Bar.prototype.a=0;\n"; 
     test(js, output); 
 } 


public void testSetQuotedPropertyOfThis612() { 
     testSame("this['prop'] = 'bar';"); 
 } 


public void testImplementsAndExtends760() { 
     String js = "" + "/** @interface */ function Foo() {}\n" + "/**\n" + " * @constructor\n" + " */\n" + "function Bar(){}\n" + "Bar.prototype.y = function() { return 3; };\n" + "/**\n" + " * @constructor\n" + " * @extends {Bar}\n" + " * @implements {Foo}\n" + " */\n" + "function SubBar(){ }\n" + "/** @param {Foo} x */ function f(x) { x.z = 3; }\n" + "/** @param {SubBar} x */ function g(x) { x.z = 3; }"; 
     String output = "" + "function Foo(){}\n" + "function Bar(){}\n" + "Bar.prototype.b = function() { return 3; };\n" + "function SubBar(){}\n" + "function f(x) { x.a = 3; }\n" + "function g(x) { x.a = 3; }"; 
     test(js, output); 
 } 


public void testTypeMismatch1034() { 
     testSame(EXTERNS, "/** @constructor */var Foo = function(){};\n" + "/** @constructor */var Bar = function(){};\n" + "Foo.prototype.b = 0;\n" + "/** @type {Foo} */\n" + "var F = new Bar();", TypeValidator.TYPE_MISMATCH_WARNING, "initializing variable\n" + "found   : Bar\n" + "required: (Foo|null)"); 
 } 


public void testUnion1178() { 
     String js = "" + "/** @constructor */ var Foo = function(){};\n" + "/** @constructor */ var Bar = function(){};\n" + "Foo.prototype.foodoo=0;\n" + "Bar.prototype.bardoo=0;\n" + "/** @type {Foo|Bar} */\n" + "var U;\n" + "U.joint;" + "U.joint"; 
     String output = "" + "var Foo = function(){};\n" + "var Bar = function(){};\n" + "Foo.prototype.b=0;\n" + "Bar.prototype.b=0;\n" + "var U;\n" + "U.a;" + "U.a"; 
     test(js, output); 
 } 


public void testPropertyOfObjectOfUnknownType1198() { 
     testSame("var foo = x(); foo.prop = '';"); 
 } 


public void testStaticAndInstanceMethodWithSameName1232() { 
     test("/** @constructor */function Bar(){}; Bar.getA = function(){}; " + "Bar.prototype.getA = function(){}; Bar.getA();" + "var bar = new Bar(); bar.getA();", "function Bar(){}; Bar.a = function(){};" + "Bar.prototype.a = function(){}; Bar.a();" + "var bar = new Bar(); bar.a();"); 
 } 


public void testTwoVar21709() { 
     String js = "" + "/** @constructor */ var Foo = function(){};\n" + "Foo.prototype={z:0, z:1, x:0};\n"; 
     testSame(js); 
 } 


public void testRenamingMap2024() { 
     String js = "" + "/** @constructor */ var Foo = function(){};\n" + "Foo.prototype.z=0;\n" + "Foo.prototype.z=0;\n" + "Foo.prototype.x=0;\n" + "Foo.prototype.y=0;"; 
     String output = "" + "var Foo = function(){};\n" + "Foo.prototype.a=0;\n" + "Foo.prototype.a=0;\n" + "Foo.prototype.b=0;\n" + "Foo.prototype.c=0;"; 
     test(js, output); 
     Map<String, String> answerMap = Maps.newHashMap(); 
     answerMap.put("x", "b"); 
     answerMap.put("y", "c"); 
     answerMap.put("z", "a"); 
     assertEquals(answerMap, lastPass.getRenamingMap()); 
 } 


public void testPrototypePropertiesAsObjLitKeys22081() { 
     testSame("/** @constructor */ function Bar() {};" + "Bar.prototype = {2: function(){}, 'getA': function(){}};"); 
 } 


public void testQuotedPrototypeProperty2155() { 
     testSame("/** @constructor */ function Bar() {};" + "Bar.prototype['getA'] = function(){};" + "var bar = new Bar();" + "bar['getA']();"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
