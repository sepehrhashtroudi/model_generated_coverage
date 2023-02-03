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
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;
import com.google.javascript.rhino.testing.TestErrorReporter;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Unit test for the Compiler DisambiguateProperties pass.
 *
 */
public class DisambiguatePropertiesTest extends CompilerTestCase {
  private DisambiguateProperties<?> lastPass;
  private boolean runTightenTypes;

  public DisambiguatePropertiesTest() {
    parseTypeInfo = true;
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    super.enableNormalize(true);
    super.enableTypeCheck(CheckLevel.WARNING);
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {

    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        Map<String, CheckLevel> propertiesToErrorFor =
            Maps.<String, CheckLevel>newHashMap();
        propertiesToErrorFor.put("foobar", CheckLevel.ERROR);

        if (runTightenTypes) {
          TightenTypes tightener = new TightenTypes(compiler);
          tightener.process(externs, root);
          lastPass = DisambiguateProperties.forConcreteTypeSystem(compiler,
              tightener, propertiesToErrorFor);
        } else {
          // This must be created after type checking is run as it depends on
          // any mismatches found during checking.
          lastPass = DisambiguateProperties.forJSTypeSystem(
              compiler, propertiesToErrorFor);
        }

        lastPass.process(externs, root);
      }
    };
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }


public void testClosureInherits96() { 
     String js = "" + "var goog = {};" + "/* @param {Function} childCtor Child class.\n" + " * @param {Function} parentCtor Parent class. */\n" + "goog.inherits = function(childCtor, parentCtor) {\n" + "  /** @constructor */\n" + "  function tempCtor() {};\n" + "  tempCtor.prototype = parentCtor.prototype;\n" + "  childCtor.superClass_ = parentCtor.prototype;\n" + "  childCtor.prototype = new tempCtor();\n" + "  childCtor.prototype.constructor = childCtor;\n" + "};" + "/** @constructor */ function Top() {}\n" + "Top.prototype.f = function() {};" + "/** @constructor \n@extends Top*/ function Foo() {}\n" + "goog.inherits(Foo, Top);\n" + "/** @override */\n" + "Foo.prototype.f = function() {" + "  Foo.superClass_.f();" + "};\n" + "/** @constructor \n* @extends Foo */ function Bar() {}\n" + "goog.inherits(Bar, Foo);\n" + "/** @override */\n" + "Bar.prototype.f = function() {" + "  Bar.superClass_.f();" + "};\n" + "(new Bar).f();\n"; 
     testSets(false, js, "{f=[[Top.prototype]]}"); 
     testSets(true, js, "{constructor=[[Bar.prototype, Foo.prototype]], " + "f=[[Bar.prototype], [Foo.prototype], [Top.prototype]]}"); 
 } 


public void testInterfaceOfSuperclass114() { 
     String js = "" + "/** @interface */ function I() {};\n" + "I.prototype.a;\n" + "/** @constructor \n @implements I */ function Foo() {};\n" + "Foo.prototype.a;\n" + "/** @constructor \n @extends Foo */ function Bar() {};\n" + "Bar.prototype.a;\n" + "/** @type Bar */\n" + "var B = new Bar;" + "B.a = 0"; 
     testSets(false, js, "{a=[[Foo.prototype, I.prototype]]}"); 
     testSets(true, js, "{a=[[Bar.prototype], [Foo.prototype], [I.prototype]]}"); 
 } 


public void testScopedType165() { 
     String js = "" + "var g = {};\n" + "/** @constructor */ g.Foo = function() {}\n" + "g.Foo.prototype.a = 0;" + "/** @constructor */ g.Bar = function() {}\n" + "g.Bar.prototype.a = 0;"; 
     String output = "" + "var g={};" + "g.Foo=function(){};" + "g.Foo.prototype.g_Foo_prototype$a=0;" + "g.Bar=function(){};" + "g.Bar.prototype.g_Bar_prototype$a=0;"; 
     testSets(false, js, output, "{a=[[g.Bar.prototype], [g.Foo.prototype]]}"); 
     testSets(true, js, output, "{a=[[g.Bar.prototype], [g.Foo.prototype]]}"); 
 } 


public void testSkipNativeObjectMethod208() { 
     String externs = "" + "/** @constructor \n @param {*} opt_v */ function Object(opt_v) {}" + "Object.prototype.hasOwnProperty;"; 
     String js = "" + "/** @constructor */ function Foo(){};" + "(new Foo).hasOwnProperty('x');"; 
     testSets(false, externs, js, js, "{}"); 
     testSets(true, externs, js, js, "{}"); 
 } 


public void testMismatchForbiddenInvalidation311() { 
     test("/** @constructor */ function F() {}" + "/** @type {number} */ F.prototype.foobar = 3;" + "/** @return {number} */ function g() { return new F(); }", null, DisambiguateProperties.Warnings.INVALIDATION); 
     assertTrue(getLastCompiler().getErrors()[0].toString().contains("Consider fixing errors")); 
 } 


public void testUnknownType333() { 
     String js = "" + "/** @constructor */ var Foo = function() {};\n" + "/** @constructor */ var Bar = function() {};\n" + "/** @return {?} */ function fun() {}\n" + "Foo.prototype.a = fun();\n" + "fun().a;\n" + "Bar.prototype.a = 0;"; 
     String ttOutput = "" + "var Foo=function(){};\n" + "var Bar=function(){};\n" + "function fun(){}\n" + "Foo.prototype.Foo_prototype$a=fun();\n" + "fun().Unique$1$a;\n" + "Bar.prototype.Bar_prototype$a=0;"; 
     testSets(false, js, js, "{}"); 
     testSets(true, BaseJSTypeTestCase.ALL_NATIVE_EXTERN_TYPES, js, ttOutput, "{a=[[Bar.prototype], [Foo.prototype], [Unique$1]]}"); 
 } 


public void testInterfaceUnionWithCtor543() { 
     String js = "" + "/** @interface */ function I() {};\n" + "/** @type {!Function} */ I.prototype.addEventListener;\n" + "/** @constructor \n * @implements {I} */ function Impl() {};\n" + "/** @type {!Function} */ Impl.prototype.addEventListener;" + "/** @constructor */ function C() {};\n" + "/** @type {!Function} */ C.prototype.addEventListener;" + "/** @param {C|I} x */" + "function f(x) { x.addEventListener(); };\n" + "f(new C()); f(new Impl());"; 
     testSets(false, js, js, "{addEventListener=[[C.prototype, I.prototype, Impl.prototype]]}"); 
     String tightenedOutput = "" + "function I() {};\n" + "I.prototype.I_prototype$addEventListener;\n" + "function Impl() {};\n" + "Impl.prototype.C_prototype$addEventListener;" + "function C() {};\n" + "C.prototype.C_prototype$addEventListener;" + "/** @param {C|I} x */" + "function f(x) { x.C_prototype$addEventListener(); };\n" + "f(new C()); f(new Impl());"; 
     testSets(true, js, tightenedOutput, "{addEventListener=[[C.prototype, Impl.prototype], [I.prototype]]}"); 
 } 


public void testExtendNativeType718() { 
     String externs = "" + "/** @constructor \n @return {string} */" + "function Date(opt_1, opt_2, opt_3, opt_4, opt_5, opt_6, opt_7) {}" + "/** @override */ Date.prototype.toString = function() {}"; 
     String js = "" + "/** @constructor\n @extends {Date} */ function SuperDate() {};\n" + "(new SuperDate).toString();"; 
     testSets(true, externs, js, js, "{}"); 
     testSets(false, externs, js, js, "{}"); 
 } 


public void testBadCast841() { 
     String js = "/** @constructor */ function Foo() {};\n" + "Foo.prototype.a = 0;\n" + "/** @constructor */ function Bar() {};\n" + "Bar.prototype.a = 0;\n" + "var a = /** @type {!Foo} */ (new Bar);\n" + "a.a = 4;"; 
     testSets(false, "", js, js, "{}", TypeValidator.INVALID_CAST, "invalid cast - must be a subtype or supertype\n" + "from: Bar\n" + "to  : Foo"); 
 } 


public void testOneType3869() { 
     String js = "" + "/** @constructor */ function Foo() {}\n" + "Foo.prototype = { get a() {return  0}," + "                  set a(b) {} };\n" + "/** @type Foo */\n" + "var F = new Foo;\n" + "F.a = 0;"; 
     String expected = "{a=[[Foo.prototype]]}"; 
     testSets(false, js, js, expected); 
     testSets(true, js, js, expected); 
 } 


public void testEnum1039() { 
     String js = "" + "/** @enum {string} */ var En = {\n" + "  A: 'first',\n" + "  B: 'second'\n" + "};\n" + "var EA = En.A;\n" + "var EB = En.B;\n" + "/** @constructor */ function Foo(){};\n" + "Foo.prototype.A = 0;\n" + "Foo.prototype.B = 0;\n"; 
     String output = "" + "var En={A:'first',B:'second'};" + "var EA=En.A;" + "var EB=En.B;" + "function Foo(){};" + "Foo.prototype.Foo_prototype$A=0;" + "Foo.prototype.Foo_prototype$B=0"; 
     String ttOutput = "" + "var En={A:'first',B:'second'};" + "var EA=En.A;" + "var EB=En.B;" + "function Foo(){};" + "Foo.prototype.Foo_prototype$A=0;" + "Foo.prototype.Foo_prototype$B=0"; 
     testSets(false, js, output, "{A=[[Foo.prototype]], B=[[Foo.prototype]]}"); 
     testSets(true, js, ttOutput, "{A=[[Foo.prototype]], B=[[Foo.prototype]]}"); 
 } 


public void testSupertypeReferenceOfSubtypeProperty1051() { 
     String externs = "" + "/** @constructor */ function Ext() {}" + "Ext.prototype.a;"; 
     String js = "" + "/** @constructor */ function Foo() {}\n" + "/** @constructor \n@extends Foo*/ function Bar() {}\n" + "Bar.prototype.a;\n" + "/** @param {Foo} foo */" + "function foo(foo) {\n" + "  var x = foo.a;\n" + "}\n"; 
     String result = "" + "function Foo() {}\n" + "function Bar() {}\n" + "Bar.prototype.Bar_prototype$a;\n" + "function foo(foo$$1) {\n" + "  var x = foo$$1.Bar_prototype$a;\n" + "}\n"; 
     testSets(false, externs, js, result, "{a=[[Bar.prototype]]}"); 
 } 


public void testIgnoreUnknownType1131() { 
     String js = "" + "/** @constructor */\n" + "function Foo() {}\n" + "Foo.prototype.blah = 3;\n" + "/** @type {Foo} */\n" + "var F = new Foo;\n" + "F.blah = 0;\n" + "var U = function() { return {} };\n" + "U().blah();"; 
     String expected = "" + "function Foo(){}Foo.prototype.blah=3;var F = new Foo;F.blah=0;" + "var U=function(){return{}};U().blah()"; 
     testSets(false, js, expected, "{}"); 
     testSets(true, BaseJSTypeTestCase.ALL_NATIVE_EXTERN_TYPES, js, expected, "{}"); 
 } 


public void testMultipleInterfaces1191() { 
     String js = "" + "/** @interface */ function I() {};\n" + "/** @interface */ function I2() {};\n" + "I2.prototype.a;\n" + "/** @constructor \n @implements I \n @implements I2 */" + "function Foo() {};\n" + "/** @override */" + "Foo.prototype.a = 0;\n" + "(new Foo).a = 0"; 
     testSets(false, js, "{a=[[Foo.prototype, I2.prototype]]}"); 
     testSets(true, js, "{a=[[Foo.prototype], [I2.prototype]]}"); 
 } 


public void testObjectLiteralReflected1201() { 
     String js = "" + "var goog = {};" + "goog.reflect = {};" + "goog.reflect.object = function(x, y) { return y; };" + "/** @constructor */ function F() {}" + "/** @type {number} */ F.prototype.foo = 3;" + "/** @constructor */ function G() {}" + "/** @type {number} */ G.prototype.foo = 3;" + "goog.reflect.object(F, {foo: 5});"; 
     String result = "" + "var goog = {};" + "goog.reflect = {};" + "goog.reflect.object = function(x, y) { return y; };" + "function F() {}" + "F.prototype.F_prototype$foo = 3;" + "function G() {}" + "G.prototype.G_prototype$foo = 3;" + "goog.reflect.object(F, {F_prototype$foo: 5});"; 
     testSets(false, js, result, "{foo=[[F.prototype], [G.prototype]]}"); 
     testSets(true, js, result, "{foo=[[F.prototype], [G.prototype]]}"); 
 } 


public void testEnumOfObjects1265() { 
     String js = "" + "/** @constructor */ function Formatter() {}" + "Formatter.prototype.format = function() {};" + "/** @constructor */ function Unrelated() {}" + "Unrelated.prototype.format = function() {};" + "/** @enum {!Formatter} */ var Enum = {\n" + "  A: new Formatter()\n" + "};\n" + "Enum.A.format();\n"; 
     String output = "" + "/** @constructor */ function Formatter() {}" + "Formatter.prototype.Formatter_prototype$format = function() {};" + "/** @constructor */ function Unrelated() {}" + "Unrelated.prototype.Unrelated_prototype$format = function() {};" + "/** @enum {!Formatter} */ var Enum = {\n" + "  A: new Formatter()\n" + "};\n" + "Enum.A.Formatter_prototype$format();\n"; 
     testSets(false, js, output, "{format=[[Formatter.prototype], [Unrelated.prototype]]}"); 
 } 


public void testErrorOnProtectedProperty1458() { 
     test("function addSingletonGetter(foo) { foo.foobar = 'a'; };", null, DisambiguateProperties.Warnings.INVALIDATION); 
     assertTrue(getLastCompiler().getErrors()[0].toString().contains("foobar")); 
 } 


public void testNamedType1508() { 
     String js = "" + "var g = {};" + "/** @constructor \n @extends g.Late */ var Foo = function() {}\n" + "Foo.prototype.a = 0;" + "/** @constructor */ var Bar = function() {}\n" + "Bar.prototype.a = 0;" + "/** @constructor */ g.Late = function() {}"; 
     String output = "" + "var g={};" + "var Foo=function(){};" + "Foo.prototype.Foo_prototype$a=0;" + "var Bar=function(){};" + "Bar.prototype.Bar_prototype$a=0;" + "g.Late = function(){}"; 
     testSets(false, js, output, "{a=[[Bar.prototype], [Foo.prototype]]}"); 
     testSets(true, js, output, "{a=[[Bar.prototype], [Foo.prototype]]}"); 
 } 


public void testStringFunction1740() { 
     String externs = "/**@constructor\n@param {*} opt_str \n @return {string}*/" + "function String(opt_str) {};\n" + "/** @override \n @return {string} */\n" + "String.prototype.toString = function() { };\n"; 
     String js = "" + "/** @constructor */ function Foo() {};\n" + "Foo.prototype.foo = function() {};\n" + "String.prototype.foo = function() {};\n" + "var a = 'str'.toString().foo();\n"; 
     String output = "" + "function Foo() {};\n" + "Foo.prototype.Foo_prototype$foo = function() {};\n" + "String.prototype.String_prototype$foo = function() {};\n" + "var a = 'str'.toString().String_prototype$foo();\n"; 
     testSets(false, externs, js, output, "{foo=[[Foo.prototype], [String.prototype]]}"); 
     testSets(true, externs, js, output, "{foo=[[Foo.prototype], [String.prototype]]}"); 
 } 


public void testUnionTypeInvalidation1867() { 
     String externs = "" + "/** @constructor */ function Baz() {}" + "Baz.prototype.a"; 
     String js = "" + "/** @constructor */ function Ind() {this.a=0}\n" + "/** @constructor */ function Foo() {}\n" + "Foo.prototype.a = 0;\n" + "/** @constructor */ function Bar() {}\n" + "Bar.prototype.a = 0;\n" + "/** @type {Foo|Bar} */\n" + "var F = new Foo;\n" + "F.a = 1\n;" + "F = new Bar;\n" + "/** @type {Baz} */\n" + "var Z = new Baz;\n" + "Z.a = 1\n;" + "/** @type {Bar|Baz} */\n" + "var B = new Baz;\n" + "B.a = 1;\n" + "B = new Bar;\n"; 
     String output = "" + "function Ind() { this.Ind$a = 0; }" + "function Foo() {}" + "Foo.prototype.a = 0;" + "function Bar() {}" + "Bar.prototype.a = 0;" + "var F = new Foo;" + "F.a = 1;" + "F = new Bar;" + "var Z = new Baz;" + "Z.a = 1;" + "var B = new Baz;" + "B.a = 1;" + "B = new Bar;"; 
     String ttOutput = "" + "function Ind() { this.Unique$1$a = 0; }" + "function Foo() {}" + "Foo.prototype.a = 0;" + "function Bar() {}" + "Bar.prototype.a = 0;" + "var F = new Foo;" + "F.a = 1;" + "F = new Bar;" + "var Z = new Baz;" + "Z.a = 1;" + "var B = new Baz;" + "B.a = 1;" + "B = new Bar;"; 
     testSets(false, externs, js, output, "{a=[[Ind]]}"); 
     testSets(true, externs, js, ttOutput, "{a=[[Unique$1]]}"); 
 } 


public void testEnumOfObjects21868() { 
     String js = "" + "/** @constructor */ function Formatter() {}" + "Formatter.prototype.format = function() {};" + "/** @constructor */ function Unrelated() {}" + "Unrelated.prototype.format = function() {};" + "/** @enum {?Formatter} */ var Enum = {\n" + "  A: new Formatter(),\n" + "  B: new Formatter()\n" + "};\n" + "function f() {\n" + "  var formatter = window.toString() ? Enum.A : Enum.B;\n" + "  formatter.format();\n" + "}"; 
     String output = "" + "/** @constructor */ function Formatter() {}" + "Formatter.prototype.format = function() {};" + "/** @constructor */ function Unrelated() {}" + "Unrelated.prototype.format = function() {};" + "/** @enum {?Formatter} */ var Enum = {\n" + "  A: new Formatter(),\n" + "  B: new Formatter()\n" + "};\n" + "function f() {\n" + "  var formatter = window.toString() ? Enum.A : Enum.B;\n" + "  formatter.format();\n" + "}"; 
     testSets(false, js, output, "{}"); 
 } 


public void testUnionType1877() { 
     String js = "" + "/** @constructor */ function Foo() {}\n" + "Foo.prototype.a = 0;" + "/** @constructor */ function Bar() {}\n" + "Bar.prototype.a = 0;" + "/** @type {Bar|Foo} */\n" + "var B = new Bar;\n" + "B.a = 0;\n" + "B = new Foo;\n" + "B.a = 0;\n" + "/** @constructor */ function Baz() {}\n" + "Baz.prototype.a = 0;\n"; 
     testSets(false, js, "{a=[[Bar.prototype, Foo.prototype], [Baz.prototype]]}"); 
     testSets(true, js, "{a=[[Bar.prototype, Foo.prototype], [Baz.prototype]]}"); 
 } 


public void testObjectLiteralNotRenamed1917() { 
     String js = "" + "var F = {a:'a', b:'b'};" + "F.a = 'z';"; 
     testSets(false, js, js, "{}"); 
     testSets(true, js, js, "{}"); 
 } 


public void testUntypedExterns2140() { 
     String externs = BaseJSTypeTestCase.ALL_NATIVE_EXTERN_TYPES + "var window;" + "window.alert = function() {x};"; 
     String js = "" + "/** @constructor */ function Foo() {}\n" + "Foo.prototype.a = 0;\n" + "Foo.prototype.alert = 0;\n" + "Foo.prototype.window = 0;\n" + "/** @constructor */ function Bar() {}\n" + "Bar.prototype.a = 0;\n" + "Bar.prototype.alert = 0;\n" + "Bar.prototype.window = 0;\n" + "window.alert();"; 
     String output = "" + "function Foo(){}" + "Foo.prototype.Foo_prototype$a=0;" + "Foo.prototype.alert=0;" + "Foo.prototype.Foo_prototype$window=0;" + "function Bar(){}" + "Bar.prototype.Bar_prototype$a=0;" + "Bar.prototype.alert=0;" + "Bar.prototype.Bar_prototype$window=0;" + "window.alert();"; 
     testSets(false, externs, js, output, "{a=[[Bar.prototype], [Foo.prototype]]" + ", window=[[Bar.prototype], [Foo.prototype]]}"); 
     testSets(true, externs, js, output, "{a=[[Bar.prototype], [Foo.prototype]]," + " window=[[Bar.prototype], [Foo.prototype]]}"); 
 } 


public void testMismatchInvalidation2153() { 
     String js = "" + "/** @constructor */ function Foo() {}\n" + "Foo.prototype.a = 0;\n" + "/** @constructor */ function Bar() {}\n" + "Bar.prototype.a = 0;\n" + "/** @type Foo */\n" + "var F = new Bar;\n" + "F.a = 0;"; 
     testSets(false, "", js, js, "{}", TypeValidator.TYPE_MISMATCH_WARNING, "initializing variable\n" + "found   : Bar\n" + "required: (Foo|null)"); 
     testSets(true, "", js, js, "{}", TypeValidator.TYPE_MISMATCH_WARNING, "initializing variable\n" + "found   : Bar\n" + "required: (Foo|null)"); 
 } 


public void testInvalidatingInterface2175() { 
     String js = "" + "/** @interface */ function I2() {};\n" + "I2.prototype.a;\n" + "/** @constructor */ function Bar() {}\n" + "/** @type I */\n" + "var i = new Bar;\n" + "/** @constructor \n @implements I \n @implements I2 */" + "function Foo() {};\n" + "/** @override */\n" + "Foo.prototype.a = 0;\n" + "(new Foo).a = 0;" + "/** @interface */ function I() {};\n" + "I.prototype.a;\n"; 
     testSets(false, js, "{}", TypeValidator.TYPE_MISMATCH_WARNING); 
     testSets(true, js, "{}", TypeValidator.TYPE_MISMATCH_WARNING); 
 } 


public void testUnionTypeTwoFields2191() { 
     String js = "" + "/** @constructor */ function Foo() {}\n" + "Foo.prototype.a = 0;\n" + "Foo.prototype.b = 0;\n" + "/** @constructor */ function Bar() {}\n" + "Bar.prototype.a = 0;\n" + "Bar.prototype.b = 0;\n" + "/** @type {Foo|Bar} */\n" + "var B = new Bar;\n" + "B.a = 0;\n" + "B.b = 0;\n" + "B = new Foo;\n" + "/** @constructor */ function Baz() {}\n" + "Baz.prototype.a = 0;\n" + "Baz.prototype.b = 0;\n"; 
     String output = "" + "function Foo(){}" + "Foo.prototype.Bar_prototype$a=0;" + "Foo.prototype.Bar_prototype$b=0;" + "function Bar(){}" + "Bar.prototype.Bar_prototype$a=0;" + "Bar.prototype.Bar_prototype$b=0;" + "var B=new Bar;" + "B.Bar_prototype$a=0;" + "B.Bar_prototype$b=0;" + "function Baz(){}" + "Baz.prototype.a$Baz_prototype=0;" + "Baz.prototype.b$Baz_prototype=0;"; 
     testSets(false, js, "{a=[[Bar.prototype, Foo.prototype], [Baz.prototype]]," + " b=[[Bar.prototype, Foo.prototype], [Baz.prototype]]}"); 
     testSets(true, js, "{a=[[Bar.prototype, Foo.prototype], [Baz.prototype]]," + " b=[[Bar.prototype, Foo.prototype], [Baz.prototype]]}"); 
 } 


public void testStaticProperty2326() { 
     String js = "" + "/** @constructor */ function Foo() {} \n" + "/** @constructor */ function Bar() {}\n" + "Foo.a = 0;" + "Bar.a = 0;"; 
     String output = "" + "function Foo(){}" + "function Bar(){}" + "Foo.function__new_Foo___undefined$a = 0;" + "Bar.function__new_Bar___undefined$a = 0;"; 
     testSets(false, js, output, "{a=[[function (new:Bar): undefined]," + " [function (new:Foo): undefined]]}"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Tests that the type based version skips renaming on types that have a
   * mismatch, and the type tightened version continues to work as normal.
   */
  

  

  

  

  

  

  

  

  

  @SuppressWarnings("unchecked")
  private void testSets(boolean runTightenTypes, String js, String expected,
      String fieldTypes) {
    this.runTightenTypes = runTightenTypes;
    test(js, expected);
    assertEquals(
        fieldTypes, mapToString(lastPass.getRenamedTypesForTesting()));
  }

  @SuppressWarnings("unchecked")
  private void testSets(boolean runTightenTypes, String externs, String js,
       String expected, String fieldTypes) {
    testSets(runTightenTypes, externs, js, expected, fieldTypes, null, null);
  }

  @SuppressWarnings("unchecked")
  private void testSets(boolean runTightenTypes, String externs, String js,
       String expected, String fieldTypes, DiagnosticType warning,
       String description) {
    this.runTightenTypes = runTightenTypes;
    test(externs, js, expected, null, warning, description);
    assertEquals(
        fieldTypes, mapToString(lastPass.getRenamedTypesForTesting()));
  }

  /**
   * Compiles the code and checks that the set of types for each field matches
   * the expected value.
   *
   * <p>The format for the set of types for fields is:
   * {field=[[Type1, Type2]]}
   */
  private void testSets(boolean runTightenTypes, String js, String fieldTypes) {
    this.runTightenTypes = runTightenTypes;
    test(js, null, null, null);
    assertEquals(fieldTypes, mapToString(lastPass.getRenamedTypesForTesting()));
  }

  /**
   * Compiles the code and checks that the set of types for each field matches
   * the expected value.
   *
   * <p>The format for the set of types for fields is:
   * {field=[[Type1, Type2]]}
   */
  private void testSets(boolean runTightenTypes, String js, String fieldTypes,
      DiagnosticType warning) {
    this.runTightenTypes = runTightenTypes;
    test(js, null, null, warning);
    assertEquals(fieldTypes, mapToString(lastPass.getRenamedTypesForTesting()));
  }

  /** Sorts the map and converts to a string for comparison purposes. */
  private <T> String mapToString(Multimap<String, Collection<T>> map) {
    TreeMap<String, String> retMap = Maps.newTreeMap();
    for (String key : map.keySet()) {
      TreeSet<String> treeSet = Sets.newTreeSet();
      for (Collection<T> collection : map.get(key)) {
        Set<String> subSet = Sets.newTreeSet();
        for (T type : collection) {
          subSet.add(type.toString());
        }
        treeSet.add(subSet.toString());
      }
      retMap.put(key, treeSet.toString());
    }
    return retMap.toString();
  }
}
