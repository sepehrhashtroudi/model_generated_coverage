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

public class RenamePrototypesTest extends CompilerTestCase {

  private static final String EXTERNS = "var js_version;js_version.toString;";
  private VariableMap prevUsedRenameMap;
  private RenamePrototypes renamePrototypes;

  public RenamePrototypesTest() {
    super(EXTERNS);
    enableNormalize();
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return renamePrototypes =
        new RenamePrototypes(compiler, true, null, prevUsedRenameMap);
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();

    prevUsedRenameMap = null;
  }

  @Override
  protected int getNumRepetitions() {
    // The RenamePrototypes pass should only be run once over a parse tree.
    return 1;
  }


public void testStableSimple2173() { 
     testStable("Bar.prototype['getFoo']=function(){};Bar.getFoo(b);" + "Bar.prototype['getBaz']=function(){}", "Bar.prototype['a']=function(){};Bar.a(b);" + "Bar.prototype['b']=function(){}", "Bar.prototype['getFoo']=function(){};Bar.getFoo(b);" + "Bar.prototype['getBar']=function(){};" + "Bar.prototype['getBaz']=function(){}", "Bar.prototype['a']=function(){};Bar.a(b);" + "Bar.prototype['c']=function(){};" + "Bar.prototype['b']=function(){}"); 
 } 


public void testStableSimple3272() { 
     testStable("Bar.prototype={'getFoo':function(){}," + "'getBar':function(){}};b.getFoo()", "Bar.prototype={'a':function(){}, 'b':function(){}};b.a()", "Bar.prototype={'getFoo':function(){}," + "'getBaz':function(){},'getBar':function(){}};b.getFoo()", "Bar.prototype={'a':function(){}, " + "'c':function(){}, 'b':function(){}};b.a()"); 
 }
public void testStable(String input1, String expected1,
                       String input2, String expected2) {
    test(input1, expected1);
    prevUsedRenameMap = renamePrototypes.getPropertyMap();
    test(input2, expected2);
}

public void testPropertyNameThatIsBothObjLitKeyAndPrototypeProperty725() { 
     test("x.prototype.myprop=function(){};y={myprop:0};z.myprop", "x.prototype.myprop=function(){};y={myprop:0};z.myprop"); 
     test("x.prototype.myprop_=function(){};y={myprop_:0};z.myprop_", "x.prototype.a=function(){};y={a:0};z.a"); 
 } 


public void testStableTrickyExternedMethods1161() { 
     test("Bar.prototype={'toString':function(){}," + "'getBar':function(){}};b.toString()", "Bar.prototype={'toString':function(){}," + "'a':function(){}};b.toString()"); 
     prevUsedRenameMap = renamePrototypes.getPropertyMap(); 
     String externs = EXTERNS + "prop.a;"; 
     test(externs, "Bar.prototype={'toString':function(){}," + "'getBar':function(){}};b.toString()", "Bar.prototype={'toString':function(){}," + "'b':function(){}};b.toString()", null, null); 
 } 


public void testRenameProperties1751() { 
     test("var foo; foo.prop_='bar'", "var foo;foo.a='bar'"); 
     test("this.prop_='bar'", "this.a='bar'"); 
     test("this.prop='bar'", "this.prop='bar'"); 
     test("this['prop_']='bar'", "this['a']='bar'"); 
     test("this['prop']='bar'", "this['prop']='bar'"); 
     test("var foo={prop1_: 'bar',prop2_: 'baz'};", "var foo={a:'bar',b:'baz'}"); 
 } 


public void testRenamePrototypes11919() { 
     test("Bar.prototype={'getFoo':function(){},2:function(){}}", "Bar.prototype={'a':function(){},2:function(){}}"); 
 } 


public void testRenamePrototypes22365() { 
     test("Bar.prototype.getFoo=function(){};Bar.getFoo(b);" + "Bar.prototype.getBaz=function(){}", "Bar.prototype.a=function(){};Bar.a(b);" + "Bar.prototype.b=function(){}"); 
     test("Bar.prototype['getFoo']=function(){};Bar.getFoo(b);" + "Bar.prototype['getBaz']=function(){}", "Bar.prototype['a']=function(){};Bar.a(b);" + "Bar.prototype['b']=function(){}"); 
     test("Bar.prototype={'getFoo':function(){},2:function(){}}", "Bar.prototype={'a':function(){},2:function(){}}"); 
     test("Bar.prototype={'getFoo':function(){}," + "'getBar':function(){}};b.getFoo()", "Bar.prototype={'a':function(){}," + "'b':function(){}};b.a()"); 
     test("Bar.prototype={'B':function(){}," + "'getBar':function(){}};b.getBar()", "Bar.prototype={'b':function(){}," + "'a':function(){}};b.a()"); 
     test("Bar.prototype={'a':function(){}," + "'b':function(){}};b.b()", "Bar.prototype={'b':function(){}," + "'a':function(){}};b.a()"); 
     test("Bar.prototype={'_getFoo':function(){}," + "'getBar':function(){}};b._getFoo()", "Bar.prototype={'_getFoo':function(){}," + "'a':function(){}};b._getFoo()"); 
     test("Bar.prototype={'toString':function(){}," + "'getBar':function(){}};b.toString()", "Bar.prototype={'toString':function(){}," + "'a':function(){}};b.toString()"); 
     test("Bar.prototype.foo=function(){}" + ";bar.foo();bar.a", "Bar.prototype.b=function(){}" + ";bar.b();bar.a"); 
 } 

  

  

  

  /**
   * Test renaming private properties (end with underscores) and test to make
   * sure we don't rename other properties.
   */
  

  /**
   * Tests a potential tricky interaction between prototype renaming and
   * property renaming.
   */
  

  

  

  

  

  

  

  

  
}
