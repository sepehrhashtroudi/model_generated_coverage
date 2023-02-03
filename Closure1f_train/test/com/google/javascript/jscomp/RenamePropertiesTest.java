/*
 * Copyright 2005 The Closure Compiler Authors.
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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

/**
 * {@link RenameProperties} tests.
 *
 */
public class RenamePropertiesTest extends CompilerTestCase {

  private static final String EXTERNS =
      "var window;" +
      "prop.toString;" +
      "var google = { gears: { factory: {}, workerPool: {} } };";

  private RenameProperties renameProperties;

  private static boolean generatePseudoNames = false;

  private static boolean useAffinity = false;

  private VariableMap prevUsedPropertyMap = null;


  public RenamePropertiesTest() {
    super(EXTERNS);
    enableNormalize();
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();

    prevUsedPropertyMap = null;
    useAffinity = false;
  }

  @Override protected int getNumRepetitions() {
    // The RenameProperties pass should only be run once over a parse tree.
    return 1;
  }


public void testRenamePropertiesFunctionCall2473() { 
     test("var foo = {myProp: 0}; " + "f(JSCompiler_renameProperty('otherProp.myProp.someProp')); " + "foo.myProp = 1; foo.theirProp = 2; foo.yourProp = 3;", "var foo = {a: 0}; f('b.a.c'); " + "foo.a = 1; foo.d = 2; foo.e = 3;"); 
 } 


public void testPrototypePropertiesAsObjLitKeys2499() { 
     testSame("Bar.prototype = {get 2(){}}; bar[2];"); 
     testSame("Bar.prototype = {get 'a'(){}}; bar['a'];"); 
     test("Bar.prototype = {get getA(){}}; bar.getA;", "Bar.prototype = {get a(){}}; bar.a;"); 
 } 


public void testPropertyAffinity514() { 
     useAffinity = true; 
     test("var foo={};foo.x=1;foo.y=2;foo.z=3;" + "function f1() { foo.z; foo.z; foo.z; foo.y}" + "function f2() {                      foo.x}", "var foo={};foo.c=1;foo.b=2;foo.a=3;" + "function f1() { foo.a; foo.a; foo.a; foo.b}" + "function f2() {                      foo.c}"); 
     test("var foo={};foo.x=1;foo.y=2;foo.z=3;" + "function f1() { foo.z; foo.z; foo.z; foo.y}" + "function f2() { foo.z; foo.z; foo.z; foo.x}", "var foo={};foo.b=1;foo.c=2;foo.a=3;" + "function f1() { foo.a; foo.a; foo.a; foo.c}" + "function f2() { foo.a; foo.a; foo.a; foo.b}"); 
 } 


public void testRemoveRenameFunctionStubs21262() { 
     test("function JSCompiler_renameProperty(x) { return x; }" + "var foo = {myProp: 0}; f(foo[JSCompiler_renameProperty('myProp')]);", "var foo = {a: 0}; f(foo['a']);"); 
 } 


public void testGeneratePseudoNames2418() { 
     generatePseudoNames = true; 
     test("var foo={}; foo.bar=1; foo['abc']=2", "var foo={}; foo.$bar$=1; foo['abc']=2"); 
     generatePseudoNames = false; 
 } 


public void testStableWithTrickyExternsChanges2440() { 
     test("Bar.prototype = {b: function(){}, a: function(){}}; bar.b();", "Bar.prototype = {a: function(){}, b: function(){}}; bar.a();"); 
     prevUsedPropertyMap = renameProperties.getPropertyMap(); 
     String externs = EXTERNS + "prop.b;"; 
     test(externs, "Bar.prototype = {new_f: function(){}, b: function(){}, " + "a: function(){}};bar.b();", "Bar.prototype = {c:function(){}, b:function(){}, a:function(){}};" + "bar.b();", null, null); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testStableRenaming(String input1, String expected1,
                                  String input2, String expected2) {
    test(input1, expected1);
    prevUsedPropertyMap = renameProperties.getPropertyMap();
    test(input2, expected2);
  }

  private Compiler compileModules(String externs, JSModule[] modules) {
    SourceFile externsInput = SourceFile.fromCode("externs", externs);

    CompilerOptions options = new CompilerOptions();
    options.propertyRenaming = PropertyRenamingPolicy.ALL_UNQUOTED;

    Compiler compiler = new Compiler();
    compiler.compileModules(
        ImmutableList.of(externsInput), Lists.newArrayList(modules), options);
    return compiler;
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return renameProperties =
        new RenameProperties(compiler, useAffinity, generatePseudoNames,
                             prevUsedPropertyMap);
  }
}
