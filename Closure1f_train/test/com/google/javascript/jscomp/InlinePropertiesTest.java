/*
 * Copyright 2012 The Closure Compiler Authors.
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


/**
 * @author johnlenz@google.com (John Lenz)
 */
public class InlinePropertiesTest extends CompilerTestCase {

  private static final String EXTERNS =
      "Function.prototype.call=function(){};" +
      "Function.prototype.inherits=function(){};" +
      "prop.toString;" +
      "var google = { gears: { factory: {}, workerPool: {} } };";

  public InlinePropertiesTest() {
    super(EXTERNS);
    enableNormalize();
    enableTypeCheck(CheckLevel.WARNING);
    enableClosurePass();
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new InlineProperties(compiler);
  }


public void testNonConstructorClassProp1484() { 
     testSame("function C() {\n" + "  this.foo = 1;\n" + "  return this;\n" + "}\n" + "C().foo;"); 
 } 


public void testConstClassProps2827() { 
     testSame("/** @constructor */\n" + "function C() {\n" + "  this.foo = 1;\n" + "}\n" + "C.foo;"); 
 } 


public void testConstPrototypeProp11005() { 
     test("/** @constructor */\n" + "function C() {}\n" + "C.prototype.foo = 1;\n" + "new C().foo;\n", "function C() {}\n" + "C.prototype.foo = 1;\n" + "new C(), 1;\n"); 
 } 


public void testNonConstClassProp21059() { 
     testSame("/** @constructor */\n" + "function C() {\n" + "  this.foo = 1;\n" + "}\n" + "var x = new C();\n" + "alert(x.foo);\n" + "x.foo = 2;"); 
 } 


public void testConditionalClassProp11760() { 
     testSame("/** @constructor */\n" + "function C() {\n" + "  if (false) this.foo = 1;\n" + "}\n" + "new C().foo;"); 
 } 


public void testNonConstClassProp12414() { 
     testSame("/** @constructor */\n" + "function C() {\n" + "  this.foo = 1;\n" + "}\n" + "var x = new C();\n" + "alert(x.foo);\n" + "delete x.foo;"); 
 } 

  

  


  

  


  

  

  

  

  

  

  

  

  
}
