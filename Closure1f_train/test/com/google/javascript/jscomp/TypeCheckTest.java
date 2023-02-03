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

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.testing.Asserts;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Tests {@link TypeCheck}.
 *
 */
public class TypeCheckTest extends CompilerTypeTestCase {

  private CheckLevel reportMissingOverrides = CheckLevel.WARNING;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    reportMissingOverrides = CheckLevel.WARNING;
  }


public void testDfa712() throws Exception { 
     testTypes("/** @constructor */ var T = function() {};\n" + "/** @type {Date?} */ T.prototype.x = null;\n" + "/** @param {!T} t */ function f(t) {\n" + "if (!t.x) { return; }\n" + "/** @type {!Date} */ var e = t.x;\n}"); 
 } 


public void testWarnDataPropertyOnInterface326() throws Exception { 
     testTypes("/** @interface */ u.T = function () {};\n" + "/** @type {number} */u.T.prototype.x = 1;", "interface members can only be empty property declarations, " + "empty functions, or goog.abstractMethod"); 
 } 


public void testInterfaceInheritanceCheck133() throws Exception { 
     testTypes("/** @interface */function Super() {};" + "/** @desc description */Super.prototype.foo = function() {};" + "/** @constructor\n @implements {Super} */function Sub() {};" + "Sub.prototype.foo = function() {};", "property foo already defined on interface Super; use @override to " + "override it"); 
 } 


public void testOverriddenParams434() throws Exception { 
     testTypes("/** @constructor */ function Foo() {}" + "/** @type {function(...[number])} */" + "Foo.prototype.bar = function(var_args) {};" + "/**\n" + " * @constructor\n" + " * @extends {Foo}\n" + " */ function SubFoo() {}" + "/**\n" + " * @type {function(number)}\n" + " * @override\n" + " */" + "SubFoo.prototype.bar = function(x) {};", "mismatch of the bar property type and the type of the " + "property it overrides from superclass Foo\n" + "original: function (...[number]): ?\n" + "override: function (number): ?"); 
 } 


public void testPropAccess480() throws Exception { 
     testTypes("/** @param {*} x */ function f(x) { return x['hi']; }"); 
 } 


public void testBooleanReduction4115() throws Exception { 
     testTypes("/** @param {Object} x\n @return {Object} */" + "(function(x) { return null || x || null ; })"); 
 } 


public void testConstructorType12139() throws Exception { 
     testTypes("/**\n" + " * @constructor\n" + " * @struct\n" + " */\n" + "function Bar() {}\n" + "Bar.prototype = {};\n", "Bar cannot extend this type; " + "structs can only extend structs"); 
 } 


public void testNoTypeCheck7156() throws Exception { 
     testTypes("var foo;" + "foo = /** @notypecheck */function bar() { new 4 }"); 
 } 


public void testInOnStruct188() throws Exception { 
     testTypes("/**\n" + " * @constructor\n" + " * @struct\n" + " */" + "function Foo() {}\n" + "if ('prop' in (new Foo())) {}", "Cannot use the IN operator with structs"); 
 } 


public void testCast5a204() throws Exception { 
     testTypes("/** @constructor */function foo() {}\n" + "/** @constructor */function bar() {}\n" + "var barInstance = new bar;\n" + "var baz = /** @type {!foo} */(barInstance);\n", "invalid cast - must be a subtype or supertype\n" + "from: bar\n" + "to  : foo"); 
 } 


public void testLends5207() throws Exception { 
     testTypes("function extend(x, y) {}" + "/** @constructor */ function Foo() {}" + "extend(Foo, {bar: 1});" + "alert((new Foo()).bar);", "Property bar never defined on Foo"); 
 } 


public void testForwardTypeDeclaration6266() throws Exception { 
     testClosureTypesMultipleWarnings("goog.addDependency('zzz.js', ['MyType'], []);" + "/**\n" + " * @constructor\n" + " * @implements {MyType}\n" + " */ var YourType = function() {};" + "/** @override */ YourType.prototype.method = function() {};", Lists.newArrayList("Could not resolve type in @implements tag of YourType", "property method not defined on any superclass of YourType")); 
 } 


public void testObjectLiteralDeclaration7293() throws Exception { 
     testTypes("var x = {};" + "/**\n" + " * @type {function(boolean): undefined}\n" + " */ x.abc = function(x) {};" + "x = {" + "  /**\n" + "   * @param {boolean} x\n" + "   * @suppress {duplicate}\n" + "   */" + "  abc: function(x) {}" + "};"); 
 } 


public void testBug7701884330() throws Exception { 
     testTypes("/**\n" + " * @param {Array.<T>} x\n" + " * @param {function(T)} y\n" + " * @template T\n" + " */\n" + "var forEach = function(x, y) {\n" + "  for (var i = 0; i < x.length; i++) y(x[i]);\n" + "};" + "/** @param {number} x */" + "function f(x) {}" + "/** @param {?} x */" + "function h(x) {" + "  var top = null;" + "  forEach(x, function(z) { top = z; });" + "  if (top) f(top);" + "}"); 
 } 


public void testInterfaceAssignment7366() throws Exception { 
     testTypes("/** @interface */var I1 = function() {};\n" + "/** @interface\n@extends {I1}*/var I2 = function() {};\n" + "/** @constructor\n@implements {I2}*/var T = function() {};\n" + "var t = new T();\n" + "/** @type {I1} */var i1 = t;\n" + "/** @type {I2} */var i2 = t;\n" + "i1 = i2;\n"); 
 } 


public void testObjLitDef2a377() throws Exception { 
     testTypes("var x = {/** @param {number} b */ set a(b){} };\n" + "x.a = 'a';", "assignment to property a of x\n" + "found   : string\n" + "required: number"); 
 } 


public void testBooleanReduction2385() throws Exception { 
     testTypes("/** @param {string} s\n @return {string} */" + "(function(s) { return ((s == 'a') && s) || 'b'; })"); 
 } 


public void testAnnotatedPropertyOnInterface4393() throws Exception { 
     testTypes(CLOSURE_DEFS + "/** @interface */ function T() {};\n" + "/** @return {number} */ T.prototype.f = goog.abstractMethod;"); 
 } 


public void testSwitchCase3424() throws Exception { 
     testTypes("/** @type String */" + "var a = new String('foo');" + "switch (a) { case 'A': }"); 
 } 


public void testTypeCheckStandaloneAST429() throws Exception { 
     Node n = compiler.parseTestCode("function Foo() { }"); 
     typeCheck(n); 
     MemoizedScopeCreator scopeCreator = new MemoizedScopeCreator(new TypedScopeCreator(compiler)); 
     Scope topScope = scopeCreator.createScope(n, null); 
     Node second = compiler.parseTestCode("new Foo"); 
     Node externs = new Node(Token.BLOCK); 
     Node externAndJsRoot = new Node(Token.BLOCK, externs, second); 
     externAndJsRoot.setIsSyntheticBlock(true); 
     new TypeCheck(compiler, new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry), registry, topScope, scopeCreator, CheckLevel.WARNING, CheckLevel.OFF).process(null, second); 
     assertEquals(1, compiler.getWarningCount()); 
     assertEquals("cannot instantiate non-constructor", compiler.getWarnings()[0].description); 
 } 


public void testCall8431() throws Exception { 
     testTypes("/** @type {Function|number} */var f;f();", "(Function|number) expressions are " + "not callable"); 
 } 


public void testLends2450() throws Exception { 
     testTypes("function extend(x, y) {}" + "/** @constructor */ function Foo() {}" + "extend(Foo, /** @lends {Foob} */ ({bar: 1}));", "Variable Foob not declared before @lends annotation."); 
 } 


public void testConstructorType4509() throws Exception { 
     testTypes("/**@constructor*/function Foo(){\n" + "/**@type{!Number}*/this.bar = new Number(5);\n" + "}\n" + "/**@type{!Foo}*/var f = new Foo();\n" + "/**@type{!String}*/var n = f.bar;", "initializing variable\n" + "found   : Number\n" + "required: String"); 
 } 


public void testGoodImplements6521() throws Exception { 
     testTypes("var myNullFunction = function() {};" + "/** @interface */\n" + "goog.Disposable = function() {};" + "/** @return {number} */" + "goog.Disposable.prototype.dispose = myNullFunction;" + "/** @implements {goog.Disposable}\n * @constructor */" + "goog.SubDisposable = function() {};" + "/** @return {number} \n @override */ " + "goog.SubDisposable.prototype.dispose = function() { return 0; };"); 
 } 


public void testTemplateType5534() throws Exception { 
     testTypes("/**" + " * @param {Array.<T>} arr \n" + " * @param {?function(T)} f \n" + " * @return {T} \n" + " * @template T\n" + " */\n" + "function fn(arr, f) { return arr[0]; }\n" + "/** @param {Array.<number>} arr */ function g(arr) {" + "  /** @type {!Object} */ var x = fn.call(null, arr, null);" + "}", "initializing variable\n" + "found   : number\n" + "required: Object"); 
 } 


public void testIssue483593() throws Exception { 
     testTypes("/** @constructor */ function C() {" + "  /** @type {?Array} */ this.a = [];" + "}" + "C.prototype.f = function() {" + "  if (this.a.length > 0) {" + "    g(this.a);" + "  }" + "};" + "/** @param {number} a */ function g(a) {}", "actual parameter 1 of g does not match formal parameter\n" + "found   : Array\n" + "required: number"); 
 } 


public void testCast16599() throws Exception { 
     testTypes("for (var i = 0; i < 10; i++) {" + "var x = /** @type {Object|number} */ (" + "  {/** @type {string} */ foo: 3});" + "}", "assignment to property foo of Object\n" + "found   : number\n" + "required: string"); 
 } 


public void testForwardTypeDeclaration5629() throws Exception { 
     testClosureTypes("goog.addDependency('zzz.js', ['MyType'], []);" + "/**\n" + " * @constructor\n" + " * @extends {MyType}\n" + " */ var YourType = function() {};" + "/** @override */ YourType.prototype.method = function() {};", "Could not resolve type in @extends tag of YourType"); 
 } 


public void testTypeInferenceWithNoEntry1651() throws Exception { 
     testTypes("/** @param {number} x */ function f(x) {}" + "/** @constructor */ function Foo() {}" + "Foo.prototype.init = function() {" + "  /** @type {?{baz: number}} */ this.bar = {baz: 3};" + "};" + "/**\n" + " * @extends {Foo}\n" + " * @constructor\n" + " */" + "function SubFoo() {}" + "/** Method */" + "SubFoo.prototype.method = function() {" + "  for (var i = 0; i < 10; i++) {" + "    f(this.bar);" + "    f(this.bar.baz);" + "  }" + "};", "actual parameter 1 of f does not match formal parameter\n" + "found   : (null|{baz: number})\n" + "required: number"); 
 } 


public void testNumericComparison2662() throws Exception { 
     testTypes("/**@param {!Object} a*/ function f(a) {return a < 3;}", "left side of numeric comparison\n" + "found   : Object\n" + "required: number"); 
 } 


public void testExtendedInterfacePropertiesCompatibility4683() throws Exception { 
     testTypes("/** @interface */function Int0() {};" + "/** @interface \n @extends {Int0} */ function Int1() {};" + "/** @type {number} */" + "Int0.prototype.foo;" + "/** @interface */function Int2() {};" + "/** @interface \n @extends {Int2} */ function Int3() {};" + "/** @type {string} */" + "Int2.prototype.foo;" + "/** @interface \n @extends {Int1} \n @extends {Int3} */" + "function Int4() {};", "Interface Int4 has a property foo with incompatible types in its " + "super interfaces Int0 and Int2"); 
 } 


public void testGetpropDict1693() throws Exception { 
     testTypes("/**\n" + " * @constructor\n" + " * @dict\n" + " */" + "function Dict1(){ this['prop'] = 123; }" + "/** @param{Dict1} x */" + "function takesDict(x) { return x.prop; }", "Cannot do '.' access on a dict"); 
 } 


public void testThisTypeOfFunction1724() throws Exception { 
     testTypes("/** @type {function(this:Object)} */ function f() {}" + "f();"); 
 } 


public void testWhileRestrictsType2733() throws Exception { 
     testTypes("/** @param {number?} x\n@return {number}*/\n" + "function f(x) {\n/** @type {number} */var y = 0;" + "while (x) {\n" + "y = x;\n" + "x = x-1;\n}\n" + "return y;}"); 
 } 


public void testBitOperation4750() throws Exception { 
     testTypes("/**@return {void}*/function foo(){var a = foo()>>>3;}", "operator >>> cannot be applied to undefined"); 
 } 


public void testInstanceof1764() throws Exception { 
     testTypes("function foo(){" + "if (bar instanceof 3)return;}", "instanceof requires an object\n" + "found   : number\n" + "required: Object"); 
 } 


public void testInheritanceCheck13798() throws Exception { 
     testTypes("var goog = {};\n" + "/** @constructor\n @extends {goog.Missing} */function Sub() {};" + "/** @override */Sub.prototype.foo = function() {};", "Bad type annotation. Unknown type goog.Missing"); 
 } 


public void testTemplatedThisType1799() throws Exception { 
     testTypes("/** @constructor */\n" + "function Foo() {}\n" + "/**\n" + " * @this {T}\n" + " * @return {T}\n" + " * @template T\n" + " */\n" + "Foo.prototype.method = function() {};\n" + "/**\n" + " * @constructor\n" + " * @extends {Foo}\n" + " */\n" + "function Bar() {}\n" + "var g = new Bar().method();\n" + "/**\n" + " * @param {number} a\n" + " */\n" + "function compute(a) {};\n" + "compute(g);\n", "actual parameter 1 of compute does not match formal parameter\n" + "found   : Bar\n" + "required: number"); 
 } 


public void testQualifiedNameReduction5c831() throws Exception { 
     testTypes("/** @return {string} */ var f = function() {\n" + "var x = {/** @type {number} */ a:0 };\n" + "return (x.a) ? (x.a) : 'a'; }", "inconsistent return type\n" + "found   : (number|string)\n" + "required: string"); 
 } 


public void testBadInterfaceExtends1836() throws Exception { 
     testTypes("/** @interface \n * @extends {nonExistent} */function A() {}", "Bad type annotation. Unknown type nonExistent"); 
 } 


public void testTemplateType4839() throws Exception { 
     testTypes("/**" + " * @param {...T} p\n" + " * @return {T} \n" + " * @template T\n" + " */\n" + "function fn(p) { return p; }\n" + "/** @type {!Object} */ var x;" + "x = fn(3, null);", "assignment\n" + "found   : (null|number)\n" + "required: Object"); 
 } 


public void testGetprop4854() throws Exception { 
     testTypes("var x = null; x.prop = 3;", "No properties on this expression\n" + "found   : null\n" + "required: Object"); 
 } 


public void testForIn2857() throws Exception { 
     testTypes("/** @param {boolean} x */ function f(x) {}" + "/** @enum {string} */ var E = {FOO: 'bar'};" + "/** @type {Object.<E, string>} */ var obj = {};" + "var k = null;" + "for (k in obj) {" + "  f(k);" + "}", "actual parameter 1 of f does not match formal parameter\n" + "found   : E.<string>\n" + "required: boolean"); 
 } 


public void testBug1943776861() throws Exception { 
     testTypes("/** @return  {{foo: Array}} */" + "function bar() {" + "  return {foo: []};" + "}"); 
 } 


public void testQualifiedNameInference11880() throws Exception { 
     testTypes("/** @constructor */ function Foo() {}" + "function f() {" + "  var x = new Foo();" + "  x.onload = function() {" + "    x.onload = null;" + "  };" + "}"); 
 } 


public void testNullAnd919() throws Exception { 
     testTypes("/** @type null */var x;\n" + "/** @type number */var r = x && x;", "initializing variable\n" + "found   : null\n" + "required: number"); 
 } 


public void testStringComparison2976() throws Exception { 
     testTypes("/**@param {Object} a*/ function f(a) {return a < 'x';}"); 
 } 


public void testParameterizedTypeSubtypes2992() throws Exception { 
     JSType arrayOfNumber = createParameterizedType(ARRAY_TYPE, NUMBER_TYPE); 
     JSType arrayOfString = createParameterizedType(ARRAY_TYPE, STRING_TYPE); 
     assertFalse(arrayOfString.isSubtype(createUnionType(arrayOfNumber, NULL_VOID))); 
 } 


public void testFunctionBind31002() throws Exception { 
     testTypes("/** @type {function(number, string): boolean} */" + "function f(x, y) { return true; }" + "f.bind(null, 3)(true);", "actual parameter 1 of function does not match formal parameter\n" + "found   : boolean\n" + "required: string"); 
 } 


public void testDuplicateStaticPropertyDecl11050() throws Exception { 
     testTypes("var goog = goog || {};" + "/** @type {Foo} */ goog.foo;" + "/** @type {Foo} */ goog.foo;" + "/** @constructor */ function Foo() {}"); 
 } 


public void testGetpropDict21100() throws Exception { 
     testTypes("/**\n" + " * @constructor\n" + " * @dict\n" + " */" + "function Dict1(){ this['prop'] = 123; }" + "/**\n" + " * @constructor\n" + " * @extends {Dict1}\n" + " */" + "function Dict1kid(){ this['prop'] = 123; }" + "/** @param{Dict1kid} x */" + "function takesDict(x) { return x.prop; }", "Cannot do '.' access on a dict"); 
 } 


public void testRecordType71114() throws Exception { 
     testTypes("/** @return {{prop: (number|undefined)}} x */" + "function f() { var x = {}; g(x); return x; }" + "/** @param {number} x */" + "function g(x) {}", "actual parameter 1 of g does not match formal parameter\n" + "found   : {prop: (number|undefined)}\n" + "required: number"); 
 } 


public void testArrayAccess61137() throws Exception { 
     testTypes("var bar = null[1];", "only arrays or objects can be accessed\n" + "found   : null\n" + "required: Object"); 
 } 


public void testMultipleExtendsInterface41141() throws Exception { 
     testTypes("/** @interface */function Int0() {};" + "/** @interface */function Int1() {};" + "/** @interface \n @extends {Int0} \n @extends {Int1} \n" + " @extends {number} */" + "function Int2() {};" + "/** @constructor\n @implements {Int2} */function Foo() {};", "Int2 @extends non-object type number"); 
 } 


public void testControlFlowRestrictsType81146() throws Exception { 
     testTypes("/** @param {undefined} a */ function f(a){}" + "/** @type {(!Array,undefined)} */ var a;" + "if (a || f(a)) {}"); 
 } 


public void testLends71151() throws Exception { 
     testTypes("function extend(x, y) {}" + "/** @constructor */ function Foo() {}" + "extend(Foo, /** @lends {Foo.prototype|Foo} */ ({bar: 1}));", "Bad type annotation. expected closing }"); 
 } 


public void testTypeOfReduction91164() throws Exception { 
     testClosureTypes(CLOSURE_DEFS + "/** @param {!Array|string} x\n@return {string} */\n" + "function f(x) {\n" + "return goog.isArray(x) ? 'a' : x;\n" + "}", null); 
 } 


public void testTypeOfReduction151169() throws Exception { 
     testClosureTypes(CLOSURE_DEFS + "function f(x) { " + "  return typeof arguments[0] == 'string' ? arguments[0] : 0;" + "}", null); 
 } 


public void testPropertyInference31175() throws Exception { 
     testTypes("/** @constructor */ function F() { this.x_ = true; }" + "F.prototype.baz = function() { this.x_ = 3; };" + "/** @return {string} */" + "F.prototype.bar = function() { if (this.x_) return this.x_; };", "inconsistent return type\n" + "found   : (boolean|number)\n" + "required: string"); 
 } 


public void testComparison21177() throws Exception { 
     testTypes("/**@type number*/var a;" + "/**@type !Date */var b;" + "if (a!==b) {}", "condition always evaluates to true\n" + "left : number\n" + "right: Date"); 
 } 


public void testCall51180() throws Exception { 
     testTypes("/**@param {!RegExp} a*/var foo = function bar(a){ foo('abc'); }", "actual parameter 1 of foo does not match formal parameter\n" + "found   : string\n" + "required: RegExp"); 
 } 


public void testTypeCheck131187() throws Exception { 
     testTypes("/**@type {!Number|!String}*/var i; i=/xx/;", "assignment\n" + "found   : RegExp\n" + "required: (Number|String)"); 
 } 


public void testInferredReturn51192() throws Exception { 
     testTypes("/** @return {string} */" + "function f() {" + "  var x = function() {};" + "  x = /** @type {function(): number} */ (function() { return 3; });" + "  return x();" + "}", "inconsistent return type\n" + "found   : number\n" + "required: string"); 
 } 


public void testAdd41214() throws Exception { 
     testTypes("/** @type {number} */ var a = 5;" + "/** @type {string} */ var b = 'b';" + "/** @type {string} */ var c = a + b;"); 
 } 


public void testSetprop101215() throws Exception { 
     testTypes("/** \n" + " * @constructor \n" + " * @struct \n" + " */ \n" + "function Square(side) { \n" + "  this.side = side; \n" + "} \n" + "Square.prototype = /** @struct */ {\n" + "  area: function() { return this.side * this.side; }\n" + "};\n" + "Square.prototype.id = function(x) { return x; };\n", "Cannot add a property to a struct instance " + "after it is constructed."); 
 } 


public void testGoodExtends151216() throws Exception { 
     testTypes(CLOSURE_DEFS + "/** @constructor */ function OldType() {}" + "/** @param {?function(new:OldType)} f */ function g(f) {" + "  /**\n" + "    * @constructor\n" + "    * @extends {OldType}\n" + "    */\n" + "  function NewType() {};" + "  goog.inherits(NewType, f);" + "  NewType.prototype.method = function() {" + "    NewType.superClass_.foo.call(this);" + "  };" + "}", "Property foo never defined on OldType.prototype"); 
 } 


public void testIssue611235() throws Exception { 
     testTypes("var ns = {};" + "(function() {" + "  /** @param {string} b */" + "  ns.a = function(b) {};" + "})();" + "function d() {" + "  ns.a(123);" + "}", "actual parameter 1 of ns.a does not match formal parameter\n" + "found   : number\n" + "required: string"); 
 } 


public void testIssue7251236() throws Exception { 
     testTypes("/** @typedef {{name: string}} */ var RecordType1;" + "/** @typedef {{name2: string}} */ var RecordType2;" + "/** @param {RecordType1} rec */ function f(rec) {" + "  alert(rec.name2);" + "}", "Property name2 never defined on rec"); 
 } 


public void testCast331310() throws Exception { 
     testTypes("/** @constructor */ function C() {}\n" + "/** @type {null|undefined} */ var x ;\n" + "var y = /** @type {string?|undefined} */(x);"); 
     testTypes("/** @constructor */ function C() {}\n" + "/** @type {null|undefined} */ var x ;\n" + "var y = /** @type {string|undefined} */(x);"); 
     testTypes("/** @constructor */ function C() {}\n" + "/** @type {null|undefined} */ var x ;\n" + "var y = /** @type {string?} */(x);"); 
     testTypes("/** @constructor */ function C() {}\n" + "/** @type {null|undefined} */ var x ;\n" + "var y = /** @type {null} */(x);"); 
 } 


public void testNumericComparison31318() throws Exception { 
     testTypes("/**@param {string} a*/ function f(a) {return a < 3;}"); 
 } 


public void testIIFE11351() throws Exception { 
     testTypes("var namespace = {};" + "/** @type {number} */ namespace.prop = 3;" + "(function(ns) {" + "  ns.prop = true;" + "})(namespace);", "assignment to property prop of ns\n" + "found   : boolean\n" + "required: number"); 
 } 


public void testImplicitCast1375() throws Exception { 
     testTypes("/** @constructor */ function Element() {};\n" + "/** @type {string}\n" + "  * @implicitCast */" + "Element.prototype.innerHTML;", "(new Element).innerHTML = new Array();", null, false); 
 } 


public void testMultipleExtendsInterface21388() throws Exception { 
     testTypes("/** @interface */function Int0() {};" + "/** @interface */function Int1() {};" + "/** @desc description */Int0.prototype.foo = function() {};" + "/** @interface \n @extends {Int0} \n @extends {Int1} */" + "function Int2() {};" + "/** @constructor\n @implements {Int2} */function Foo() {};", "property foo on interface Int0 is not implemented by type Foo"); 
 } 


public void testBackwardsInferenceGoogArrayFilter11404() throws Exception { 
     testClosureTypes(CLOSURE_DEFS + "/** @type {Array.<string>} */" + "var arr;\n" + "/** @type {!Array.<number>} */" + "var result = goog.array.filter(" + "   arr," + "   function(item,index,src) {return false;});", "initializing variable\n" + "found   : Array.<string>\n" + "required: Array.<number>"); 
 } 


public void testBadImplements31405() throws Exception { 
     testTypes("var goog = {};" + "/** @type {!Function} */ goog.abstractMethod = function(){};" + "/** @interface */ var Disposable = goog.abstractMethod;" + "Disposable.prototype.method = goog.abstractMethod;" + "/** @implements {Disposable}\n * @constructor */function f() {}", "property method on interface Disposable is not implemented by type f"); 
 } 


public void testGetelemStruct21412() throws Exception { 
     testTypes("/**\n" + " * @constructor\n" + " * @struct\n" + " */" + "function Struct1(){ this.prop = 123; }" + "/**\n" + " * @constructor\n" + " * @extends {Struct1}" + " */" + "function Struct1kid(){ this.prop = 123; }" + "/** @param{Struct1kid} x */" + "function takesStruct2(x) { return x['prop']; }", "Cannot do '[]' access on a struct"); 
 } 


public void testMissingProperty211431() throws Exception { 
     testTypes("/** @param {Object} x */" + "function f(x) { x.foo && x.foo(); }"); 
 } 


public void testImplementsExtendsLoop1439() throws Exception { 
     testClosureTypesMultipleWarnings(suppressMissingProperty("foo") + "/** @constructor \n * @implements {F} */var G = function() {};" + "/** @constructor \n * @extends {G} */var F = function() {};" + "alert((new F).foo);", Lists.newArrayList("Parse error. Cycle detected in inheritance chain of type F")); 
 } 


public void testGetelemStruct71468() throws Exception { 
     testTypes("/**\n" + " * @constructor\n" + " * @struct\n" + " */\n" + "function Foo() {}\n" + "function Bar() {}\n" + "Bar.prototype = new Foo();\n" + "Bar.prototype['someprop'] = 123;\n", "Cannot do '[]' access on a struct"); 
 } 


public void testInferredReturn41474() throws Exception { 
     testTypes("var x = function() {};" + "x = /** @type {function(): number} */ (function() { return 3; });", "assignment\n" + "found   : function (): number\n" + "required: function (): undefined"); 
 } 


public void testConstructorAlias61481() throws Exception { 
     testTypes("/** @constructor */ var Foo = function() {};" + "/** @constructor */ var FooAlias = Foo;" + "/** @return {Foo} */ function foo() { " + "  return new FooAlias(); }"); 
 } 


public void testGenerics11486() throws Exception { 
     String FN_DECL = "/** \n" + " * @param {T} x \n" + " * @param {function(T):T} y \n" + " * @template T\n" + " */ \n" + "function f(x,y) { return y(x); }\n"; 
     testTypes(FN_DECL + "/** @type {string} */" + "var out;" + "/** @type {string} */" + "var result = f('hi', function(x){ out = x; return x; });"); 
     testTypes(FN_DECL + "/** @type {string} */" + "var out;" + "var result = f(0, function(x){ out = x; return x; });", "assignment\n" + "found   : number\n" + "required: string"); 
     testTypes(FN_DECL + "var out;" + "/** @type {string} */" + "var result = f(0, function(x){ out = x; return x; });", "assignment\n" + "found   : number\n" + "required: string"); 
 } 


public void testRecordType31487() throws Exception { 
     testTypes("/** @param {{prop: number}} x */" + "function f(x) {}" + "f({prop: 'x'});", "actual parameter 1 of f does not match formal parameter\n" + "found   : {prop: (number|string)}\n" + "required: {prop: number}"); 
 } 


public void testNoPersistentTypeInferenceForFunctionProperties1490() throws Exception { 
     testTypes("/** @param {Function} o\n@param {string} x */\n" + "function s1(o,x) { o.x = x; }\n" + "/** @param {Function} o\n@return {string} */\n" + "function g1(o) { return typeof o.x == 'undefined' ? '' : o.x; }\n" + "/** @param {Function} o\n@param {number} x */\n" + "function s2(o,x) { o.x = x; }\n" + "/** @param {Function} o\n@return {number} */\n" + "function g2(o) { return typeof o.x == 'undefined' ? 0 : o.x; }"); 
 } 


public void testIssue6881504() throws Exception { 
     testTypes("/** @const */ var SOME_DEFAULT =\n" + "    /** @type {TwoNumbers} */ ({first: 1, second: 2});\n" + "/**\n" + "* Class defining an interface with two numbers.\n" + "* @interface\n" + "*/\n" + "function TwoNumbers() {}\n" + "/** @type number */\n" + "TwoNumbers.prototype.first;\n" + "/** @type number */\n" + "TwoNumbers.prototype.second;\n" + "/** @return {number} */ function f() { return SOME_DEFAULT; }", "inconsistent return type\n" + "found   : (TwoNumbers|null)\n" + "required: number"); 
 } 


public void testInterfaceInheritanceCheck81512() throws Exception { 
     testTypes("/** @constructor\n @implements {Super} */function Sub() {};" + "/** @override */Sub.prototype.foo = function() {};", new String[] { "Bad type annotation. Unknown type Super", "property foo not defined on any superclass of Sub" }); 
 } 


public void testUndefinedNode1525() throws Exception { 
     Node p = new Node(Token.ADD); 
     Node n = Node.newString(Token.NAME, "undefined"); 
     p.addChildToBack(n); 
     p.addChildToBack(Node.newNumber(5)); 
     typeCheck(p); 
     assertTypeEquals(VOID_TYPE, n.getJSType()); 
 } 


public void testInnerFunction101526() throws Exception { 
     testTypes("function f() {" + "  /** @type {?number} */ var x = null;" + "  /** @return {string} */" + "  function g() {" + "    if (!x) {" + "      x = 1;" + "    }" + "    return x;" + "  }" + "}", "inconsistent return type\n" + "found   : number\n" + "required: string"); 
 } 


public void testUnionTemplateThisType1536() throws Exception { 
     testTypes("/** @constructor */ function F() {}" + "/** @return {F|Array} */ function g() { return []; }" + "/** @param {F} x */ function h(x) { }" + "/**\n" + "* @param {T} x\n" + "* @param {function(this:T, ...)} y\n" + "* @template T\n" + "*/\n" + "function f(x, y) {}\n" + "f(g(), function() { h(this); });", "actual parameter 1 of h does not match formal parameter\n" + "found   : (Array|F|null)\n" + "required: (F|null)"); 
 } 


public void testParameterized51541() throws Exception { 
     testTypes("/**\n" + " * @param {Object.<T>} obj\n" + " * @return {boolean|undefined}\n" + " * @template T\n" + " */\n" + "var some = function(obj) {" + "  for (var key in obj) if (obj[key]) return true;" + "};" + "/** @return {!Array} */ function f() { return []; }" + "/** @return {!Array.<string>} */ function g() { return []; }" + "some(f());\n" + "some(g());\n"); 
 } 


public void testInterfaceExtendsResolution1542() throws Exception { 
     testTypes("/** @interface \n @extends {A} */ function B() {};\n" + "/** @constructor \n @implements {B} */ function C() {};\n" + "/** @interface */ function A() {};"); 
 } 


public void testObjectLiteralDeclaration11554() throws Exception { 
     testTypes("var x = {" + "/** @type {boolean} */ abc: true," + "/** @type {number} */ 'def': 0," + "/** @type {string} */ 3: 'fgh'" + "};"); 
 } 


public void testDuplicateRecordFields21559() throws Exception { 
     testTypes("/**" + "* @param {{name:string,number:x,number:y}} a" + " */" + "function f(a) {};", new String[] { "Bad type annotation. Unknown type x", "Parse error. Duplicate record field number", "Bad type annotation. Unknown type y" }); 
 } 


public void testCatchExpression21569() throws Exception { 
     testTypes("function fn() {" + "  /** @type {number} */" + "  var out = 0;" + "  /** @type {string} */" + "  var e;" + "  try {\n" + "    foo();\n" + "  } catch (e) {\n" + "    out = e;" + "  }" + "}\n"); 
 } 


public void testDirectPrototypeAssignment31572() throws Exception { 
     testTypes("/** @constructor */ var MainWidgetCreator = function() {};" + "/** @param {Function} ctor */" + "function createMainWidget(ctor) {" + "  /** @constructor */ function tempCtor() {};" + "  tempCtor.prototype = ctor.prototype;" + "  MainWidgetCreator.superClass_ = ctor.prototype;" + "  MainWidgetCreator.prototype = new tempCtor();" + "}"); 
 } 


public void testSetprop71573() throws Exception { 
     testTypes("/**\n" + " * @constructor\n" + " * @struct\n" + " */\n" + "function Foo() {\n" + "  var t = this;\n" + "  t.x = 123;\n" + "}", "Cannot add a property to a struct instance " + "after it is constructed."); 
 } 


public void testBitOperation11586() throws Exception { 
     testTypes("/**@return {void}*/function foo(){ ~foo(); }", "operator ~ cannot be applied to undefined"); 
 } 


public void testTypeInferenceWithNoEntry21619() throws Exception { 
     testClosureTypes(CLOSURE_DEFS + "/** @param {number} x */ function f(x) {}" + "/** @param {!Object} x */ function g(x) {}" + "/** @constructor */ function Foo() {}" + "Foo.prototype.init = function() {" + "  /** @type {?{baz: number}} */ this.bar = {baz: 3};" + "};" + "/**\n" + " * @extends {Foo}\n" + " * @constructor\n" + " */" + "function SubFoo() {}" + "/** Method */" + "SubFoo.prototype.method = function() {" + "  for (var i = 0; i < 10; i++) {" + "    f(this.bar);" + "    goog.asserts.assert(this.bar);" + "    g(this.bar);" + "  }" + "};", "actual parameter 1 of f does not match formal parameter\n" + "found   : (null|{baz: number})\n" + "required: number"); 
 } 


public void testFunctionLiteralDefinedThisArgument21620() throws Exception { 
     testTypes("" + "/** @param {string} x */ function f(x) {}" + "/**\n" + " * @param {?function(this:T, ...)} fn\n" + " * @param {T=} opt_obj\n" + " * @template T\n" + " */\n" + "function baz(fn, opt_obj) {}\n" + "function g() { baz(function() { f(this.length); }, []); }", "actual parameter 1 of f does not match formal parameter\n" + "found   : number\n" + "required: string"); 
 } 


public void testCast111627() throws Exception { 
     testTypes("var goog = {}; goog.foo = {};" + "function f() { return /** @type {goog.foo} */ (new Object()); }", "Bad type annotation. Unknown type goog.foo"); 
 } 


public void testThisTypeOfFunction41668() throws Exception { 
     testTypes("/** @constructor */ function F() {}" + "F.prototype.moveTo = function(x, y) {};" + "F.prototype.lineTo = function(x, y) {};" + "function demo() {" + "  var path = new F();" + "  var points = [[1,1], [2,2]];" + "  for (var i = 0; i < points.length; i++) {" + "    (i == 0 ? path.moveTo : path.lineTo)(" + "       points[i][0], points[i][1]);" + "  }" + "}", "\"function (this:F, ?, ?): undefined\" " + "must be called with a \"this\" type"); 
 } 


public void testBug9014551672() throws Exception { 
     testTypes("/** @return {(number,undefined)} */ function a() { return 3; }" + "var b = undefined === a()"); 
     testTypes("/** @return {(number,undefined)} */ function a() { return 3; }" + "var b = a() === undefined"); 
 } 


public void testBadInterfaceExtends31697() throws Exception { 
     testTypes("/** @interface */function A() {}\n" + "/** @constructor \n * @extends {A} */function B() {}", "B cannot extend this type; constructors can only extend constructors"); 
 } 


public void testIIFE41742() throws Exception { 
     testTypes("/** @const */ var namespace = {};" + "(function(ns) {" + "  /**\n" + "   * @constructor\n" + "   * @param {number} x\n" + "   */\n" + "   ns.Ctor = function(x) {};" + "})(namespace);" + "new namespace.Ctor(true);", "actual parameter 1 of namespace.Ctor " + "does not match formal parameter\n" + "found   : boolean\n" + "required: number"); 
 } 


public void testInheritanceCheck31761() throws Exception { 
     testTypes("/** @constructor */function Super() {};" + "Super.prototype.foo = function() {};" + "/** @constructor\n @extends {Super} */function Sub() {};" + "Sub.prototype.foo = function() {};", "property foo already defined on superclass Super; " + "use @override to override it"); 
 } 


public void testFunctionInference71777() throws Exception { 
     testFunctionType("/** @this Date */function f(a,b,c,var_args) {}", "function (this:Date, ?, ?, ?, ...[?]): undefined"); 
 } 


public void testTypeCheckCustomExterns21784() throws Exception { 
     testTypes(DEFAULT_EXTERNS + "/** @enum {string} */ var Enum = {FOO: 1, BAR: 1};", "/** @param {Enum} x */ function f(x) {} f(Enum.FOO); f(true);", "actual parameter 1 of f does not match formal parameter\n" + "found   : boolean\n" + "required: Enum.<string>", false); 
 } 


public void testEnum81785() throws Exception { 
     testClosureTypesMultipleWarnings("/** @enum */var a=8;", Lists.newArrayList("enum initializer must be an object literal or an enum", "initializing variable\n" + "found   : number\n" + "required: enum{a}")); 
 } 


public void testSwitchCase11786() throws Exception { 
     testTypes("/**@type number*/var a;" + "/**@type string*/var b;" + "switch(a){case b:;}", "case expression doesn't match switch\n" + "found   : string\n" + "required: number"); 
 } 


public void testInheritanceCheck21788() throws Exception { 
     testTypes("/** @constructor */function Super() {};" + "/** @constructor\n @extends {Super} */function Sub() {};" + "/** @override */Sub.prototype.foo = function() {};", "property foo not defined on any superclass of Sub"); 
 } 


public void testInterfacePropertyOverride11792() throws Exception { 
     testTypes("/** @interface */function Super() {};" + "/** @desc description */Super.prototype.foo = function() {};" + "/** @interface\n @extends {Super} */function Sub() {};" + "/** @desc description */Sub.prototype.foo = function() {};"); 
 } 


public void testLends81807() throws Exception { 
     testTypes("function extend(x, y) {}" + "/** @type {number} */ var Foo = 3;" + "extend(Foo, /** @lends {Foo} */ ({bar: 1}));", "May only lend properties to object types. Foo has type number."); 
 } 


public void testFunctionBind41821() throws Exception { 
     testTypes("/** @param {...number} x */" + "function f(x) {}" + "f.bind(null, 3, 3, 3)(true);", "actual parameter 1 of function does not match formal parameter\n" + "found   : boolean\n" + "required: (number|undefined)"); 
 } 


public void testGoodExtends161827() throws Exception { 
     testTypes(CLOSURE_DEFS + "/** @param {Function} f */ function g(f) {" + "  /** @constructor */ function NewType() {};" + "  goog.inherits(f, NewType);" + "  (new NewType());" + "}"); 
 } 


public void testCatchExpression11828() throws Exception { 
     testTypes("function fn() {" + "  /** @type {number} */" + "  var out = 0;" + "  try {\n" + "    foo();\n" + "  } catch (/** @type {string} */ e) {\n" + "    out = e;" + "  }" + "}\n", "assignment\n" + "found   : string\n" + "required: number"); 
 } 


public void testQualifiedNameInference131844() throws Exception { 
     testTypes("/** @constructor */ function Foo() {}" + "function f(z) {" + "  var x = new Foo();" + "  if (z) {" + "    x.onload = function() {};" + "  } else {" + "    x.onload = null;" + "  };" + "}"); 
 } 


public void testQualifiedNameInference121878() throws Exception { 
     testTypes("/** @param {function(this:Object)} x */ function f(x) {}" + "/** @constructor */ function Foo() {" + "  /** @type {number} */ this.bar = 3;" + "  f(function() { this.bar = true; });" + "}"); 
 } 


public void testDataPropertyOnInterface21879() throws Exception { 
     reportMissingOverrides = CheckLevel.OFF; 
     testTypes("/** @interface */ function T() {};\n" + "/** @type {number} */T.prototype.x;\n" + "/** @constructor \n" + " *  @implements {T} \n" + " */\n" + "function C() {}\n" + "C.prototype.x = 'foo';", "mismatch of the x property type and the type of the property it " + "overrides from interface T\n" + "original: number\n" + "override: string"); 
 } 


public void testBadStruct1885() throws Exception { 
     testTypes("/** @struct */function Struct1() {}", "@struct used without @constructor for Struct1"); 
 } 


public void testGlobalThis2b1904() throws Exception { 
     testTypes("/** @constructor */ function Bindow() {}" + "/** @param {string} msg */ " + "Bindow.prototype.alert = function(msg) {};" + "/** @return {number} */ this.alert = function() { return 3; };" + "(new Bindow()).alert(this.alert())", "actual parameter 1 of Bindow.prototype.alert " + "does not match formal parameter\n" + "found   : number\n" + "required: string"); 
 } 


public void testQualifiedNameReduction81918() throws Exception { 
     testTypes("/** @return {string} */ var f = function() {\n" + "var x = {get a() {return 'a'}};\n" + "return x.a ? x.a : 'a'; }"); 
 } 


public void testInterfaceExtendsLoop1925() throws Exception { 
     testClosureTypesMultipleWarnings(suppressMissingProperty("foo") + "/** @interface \n * @extends {F} */var G = function() {};" + "/** @interface \n * @extends {G} */var F = function() {};", Lists.newArrayList("Could not resolve type in @extends tag of G")); 
 } 


public void testInferredParam51934() throws Exception { 
     reportMissingOverrides = CheckLevel.OFF; 
     testTypes("/** @param {string} x */ function f(x) {}" + "/** @constructor */ function Foo() {}" + "/** @param {...number} x */ Foo.prototype.bar = function(x) {};" + "/** @constructor \n * @extends {Foo} */ function SubFoo() {}" + "/** @param {number=} x \n * @param {...number} y  */ " + "SubFoo.prototype.bar = " + "    function(x, y) { f(x); }; (new SubFoo()).bar();", "actual parameter 1 of f does not match formal parameter\n" + "found   : (number|undefined)\n" + "required: string"); 
 } 


public void testBadInterfaceExtendsNonExistentInterfaces1939() throws Exception { 
     String js = "/** @interface \n" + " * @extends {nonExistent1} \n" + " * @extends {nonExistent2} \n" + " */function A() {}"; 
     String[] expectedWarnings = { "Bad type annotation. Unknown type nonExistent1", "Bad type annotation. Unknown type nonExistent2" }; 
     testTypes(js, expectedWarnings); 
 } 


public void testTypeOfReduction161948() throws Exception { 
     testClosureTypes(CLOSURE_DEFS + "/** @interface */ function I() {}\n" + "/**\n" + " * @param {*} x\n" + " * @return {I}\n" + " */\n" + "function f(x) { " + "  if(goog.isObject(x)) {" + "    return /** @type {I} */(x);" + "  }" + "  return null;" + "}", null); 
 } 


public void testEnum391954() throws Exception { 
     testTypes("/** @enum {Number} */ var MyEnum = {FOO: new Number(1)};" + "/** @param {MyEnum} x \n * @return {number} */" + "function f(x) { return x == MyEnum.FOO && MyEnum.FOO == x; }", "inconsistent return type\n" + "found   : boolean\n" + "required: number"); 
 } 


public void testBug23418121955() throws Exception { 
     testTypes("/** @interface */" + "function EventTarget() {}" + "/** @constructor \n * @implements {EventTarget} */" + "function Node() {}" + "/** @type {number} */ Node.prototype.index;" + "/** @param {EventTarget} x \n * @return {string} */" + "function foo(x) { return x.index; }"); 
 } 


public void testBadDict1968() throws Exception { 
     testTypes("/** @dict */function Dict1() {}", "@dict used without @constructor for Dict1"); 
 } 


public void testGoogBind21972() throws Exception { 
     testClosureTypes("var goog = {}; goog.bind = function(var_args) {};" + "/** @type {function(boolean): boolean} */" + "function f(x, y) { return true; }" + "f(goog.bind(f, null, 'x')());", null); 
 } 


public void testSetprop61975() throws Exception { 
     testTypes("/**\n" + " * @constructor\n" + " * @struct\n" + " */\n" + "function Foo() {}\n" + "/**\n" + " * @constructor\n" + " * @param{Foo} f\n" + " */\n" + "function Bar(f) { f.x = 123; }", "Cannot add a property to a struct instance " + "after it is constructed."); 
 } 


public void testSetprop91982() throws Exception { 
     testTypes("/**\n" + " * @constructor\n" + " * @struct\n" + " */\n" + "function Foo() {}\n" + "(new Foo()).x += 123;", new String[] { "Property x never defined on Foo", "Cannot add a property to a struct instance " + "after it is constructed." }); 
 } 


public void testMissingProperty351987() throws Exception { 
     testTypes("/** @constructor */ function Foo() {}" + "/** @constructor */ function Bar() {}" + "/** @constructor */ function Baz() {}" + "/** @param {Foo|Bar} x */ function f(x) { x.specialProp = 1; }" + "/** @param {Bar|Baz} x */ function g(x) { return x.specialProp; }"); 
 } 


public void testDeleteOperator21989() throws Exception { 
     testTypes("var obj = {};" + "/** \n" + " * @param {string} x\n" + " * @return {Object} */ function f(x) { return obj; }" + "/** @param {?number} x */ function g(x) {" + "  if (x) { delete f(x)['a']; }" + "}", "actual parameter 1 of f does not match formal parameter\n" + "found   : number\n" + "required: string"); 
 } 


public void testAdd102013() throws Exception { 
     testTypes(suppressMissingProperty("e", "f") + "/** @type {number} */ var a = 5;" + "/** @type {string} */ var c = a + d.e.f;"); 
 } 


public void testCast272022() throws Exception { 
     testTypes("/** @interface */ function I() {}\n" + "/** @constructor */ function C() {}\n" + "var x = new C();\n" + "var y = /** @type {I} */(x);"); 
 } 


public void testMissingProperty302038() throws Exception { 
     testTypes("/** @return {*} */" + "function f() {" + " return {};" + "}" + "f().a = 3;" + "/** @param {Object} y */ function g(y) { return y.a; }"); 
 } 


public void testVar92052() throws Exception { 
     testTypes("/** @enum */var a;", "enum initializer must be an object literal or an enum"); 
 } 


public void testResolvingNamedTypes2053() throws Exception { 
     String js = "" + "/** @constructor */\n" + "var Foo = function() {}\n" + "/** @param {number} a */\n" + "Foo.prototype.foo = function(a) {\n" + "  return this.baz().toString();\n" + "};\n" + "/** @return {Baz} */\n" + "Foo.prototype.baz = function() { return new Baz(); };\n" + "/** @constructor\n" + "  * @extends Foo */\n" + "var Bar = function() {};" + "/** @constructor */\n" + "var Baz = function() {};"; 
     assertEquals(100.0, getTypedPercent(js), 0.1); 
 } 


public void testBitOperation32055() throws Exception { 
     testTypes("/**@return {void}*/function foo(){var a = 3<<foo();}", "operator << cannot be applied to undefined"); 
 } 


public void testConstructorType112063() throws Exception { 
     testTypes("/** @constructor */" + "function NonDict() {}" + "/**\n" + " * @constructor\n" + " * @dict\n" + " * @extends{NonDict}\n" + " */" + "function NonDictKid() {}", "NonDictKid cannot extend this type; " + "dicts can only extend dicts"); 
 } 


public void testForwardTypeDeclaration82088() throws Exception { 
     testClosureTypes("goog.addDependency('zzz.js', ['MyType'], []);" + "/** @param {MyType} x */" + "function f(x) { return x.name == undefined; }", null); 
 } 


public void testInterfaceInheritanceCheck102108() throws Exception { 
     testTypes("/** @interface */ function I() {}" + "/** @return {number} */ I.prototype.bar = function() {};" + "/** @constructor */ function F() {}" + "/** @return {number} */ F.prototype.foo = function() {return 3; };" + "/** @constructor \n * @extends {F} \n * @implements {I} */ " + "function G() {}" + "/** @return {number} \n * @override */ " + "G.prototype.bar = G.prototype.foo;" + "/** @return {string} */ function f() { return new G().bar(); }", "inconsistent return type\n" + "found   : number\n" + "required: string"); 
 } 


public void testMissingProperty192126() throws Exception { 
     testTypes("/** @param {Object} x */" + "function f(x) { if (x.bar) { if (x.foo) {} } else { x.foo(); } }", "Property foo never defined on Object"); 
 } 


public void testMissingProperty332132() throws Exception { 
     testTypes("/** @param {Object} x */" + "function f(x) { !x.foo || x.foo(); }"); 
 } 


public void testFunctionBind12148() throws Exception { 
     testTypes("/** @type {function(string, number): boolean} */" + "function f(x, y) { return true; }" + "f.bind(null, 3);", "actual parameter 2 of f.bind does not match formal parameter\n" + "found   : number\n" + "required: string"); 
 } 


public void testObjLitDef72151() throws Exception { 
     testTypes("var lit = /** @dict */ { x: 1 };", "Illegal key, the object literal is a dict"); 
 } 


public void testOverriddenReturn12187() throws Exception { 
     testTypes("/** @constructor */ function Foo() {}" + "/** @return {Object} */ Foo.prototype.bar = " + "    function() { return {}; };" + "/** @constructor \n * @extends {Foo} */ function SubFoo() {}" + "/** @return {SubFoo}\n * @override */ SubFoo.prototype.bar = " + "    function() { return new Foo(); }", "inconsistent return type\n" + "found   : Foo\n" + "required: (SubFoo|null)"); 
 } 


public void testConstructorType102189() throws Exception { 
     testTypes("/** @constructor */" + "function NonStr() {}" + "/**\n" + " * @constructor\n" + " * @struct\n" + " * @extends{NonStr}\n" + " */" + "function NonStrKid() {}", "NonStrKid cannot extend this type; " + "structs can only extend structs"); 
 } 


public void testMissingProperty172195() throws Exception { 
     testTypes("/** @param {Object} x */" + "function f(x) { if (typeof x.foo == 'function') { x.foo(); } }"); 
 } 


public void testMultipleExtendsInterface62198() throws Exception { 
     testTypes("/** @interface */function Super1() {};" + "/** @interface */function Super2() {};" + "/** @param {number} bar */Super2.prototype.foo = function(bar) {};" + "/** @interface\n @extends {Super1}\n " + "@extends {Super2} */function Sub() {};" + "/** @override\n @param {string} bar */Sub.prototype.foo =\n" + "function(bar) {};", "mismatch of the foo property type and the type of the property it " + "overrides from superclass Super2\n" + "original: function (this:Super2, number): undefined\n" + "override: function (this:Sub, string): undefined"); 
 } 


public void testEnum12202() throws Exception { 
     testTypes("/**@enum*/var a={BB:1,CC:2};\n" + "/**@type {a}*/var d;d=a.BB;"); 
 } 


public void testEnum382228() throws Exception { 
     testTypes("/** @enum {MyEnum} */ var MyEnum = {};" + "/** @param {MyEnum} x */ function f(x) {}", "Parse error. Cycle detected in inheritance chain " + "of type MyEnum"); 
 } 


public void testTypeof22236() throws Exception { 
     testTypes("function f(){ if (typeof 123 == 'numbr') return 321; }", "unknown type: numbr"); 
 } 


public void testIssue7002241() throws Exception { 
     testTypes("/**\n" + " * @param {{text: string}} opt_data\n" + " * @return {string}\n" + " */\n" + "function temp1(opt_data) {\n" + "  return opt_data.text;\n" + "}\n" + "\n" + "/**\n" + " * @param {{activity: (boolean|number|string|null|Object)}} opt_data\n" + " * @return {string}\n" + " */\n" + "function temp2(opt_data) {\n" + "  /** @notypecheck */\n" + "  function __inner() {\n" + "    return temp1(opt_data.activity);\n" + "  }\n" + "  return __inner();\n" + "}\n" + "\n" + "/**\n" + " * @param {{n: number, text: string, b: boolean}} opt_data\n" + " * @return {string}\n" + " */\n" + "function temp3(opt_data) {\n" + "  return 'n: ' + opt_data.n + ', t: ' + opt_data.text + '.';\n" + "}\n" + "\n" + "function callee() {\n" + "  var output = temp3({\n" + "    n: 0,\n" + "    text: 'a string',\n" + "    b: true\n" + "  })\n" + "  alert(output);\n" + "}\n" + "\n" + "callee();"); 
 } 


public void testBug19407692247() throws Exception { 
     testTypes("/** @return {!Object} */ " + "function proto(obj) { return obj.prototype; }" + "/** @constructor */ function Map() {}" + "/**\n" + " * @constructor\n" + " * @extends {Map}\n" + " */" + "function Map2() { Map.call(this); };" + "Map2.prototype = proto(Map);"); 
 } 


public void testBadImplements42249() throws Exception { 
     testTypes("/** @interface */function Disposable() {}\n" + "/** @implements {Disposable}\n * @interface */function f() {}", "f cannot implement this type; an interface can only extend, " + "but not implement interfaces"); 
 } 


public void testDfa112261() throws Exception { 
     testTypes("/** @param {string} opt_x\n@return {string} */\n" + "function f(opt_x) { if (!opt_x) { " + "throw new Error('x cannot be empty'); } return opt_x; }"); 
 } 


public void testVar72272() throws Exception { 
     testTypes("/** @type number */var a, b;", "declaration of multiple variables with shared type information"); 
 } 


public void testCircularTypeDef2275() throws Exception { 
     testTypes("var goog = {};" + "/** @typedef {number|Array.<goog.Bar>} */ goog.Bar;" + "/** @param {goog.Bar} x */ function f(x) {}" + "f(3); f([3]); f([[3]]);"); 
 } 


public void testArrayAccess32293() throws Exception { 
     testTypes("var bar = [];" + "/** @return {void} */function baz(){};" + "var foo = bar[baz()];", "array access\n" + "found   : undefined\n" + "required: number"); 
 } 


public void testGetprop32314() throws Exception { 
     testTypes("/** @constructor */ " + "function Foo() { /** @type {?Object} */ this.x = null; }" + "Foo.prototype.initX = function() { this.x = {foo: 1}; };" + "Foo.prototype.bar = function() {" + "  if (this.x == null) { this.initX(); alert(this.x.foo); }" + "};"); 
 } 


public void testInterfaceAssignment82330() throws Exception { 
     testTypes("/** @interface */var I = function() {};\n" + "/** @type {I} */var i;\n" + "/** @type {Object} */var o = i;\n" + "new Object().prototype = i.prototype;"); 
 } 


public void testTypeDef22343() throws Exception { 
     testTypes("var goog = {};" + "/** @typedef {number} */ goog.Bar;" + "/** @param {goog.Bar} x */ function f(x) {}" + "f('3');", "actual parameter 1 of f does not match formal parameter\n" + "found   : string\n" + "required: number"); 
 } 


public void testActiveXObject2346() throws Exception { 
     testTypes("/** @type {Object} */ var x = new ActiveXObject();" + "/** @type { {impossibleProperty} } */ var y = new ActiveXObject();"); 
 } 


public void testIn22349() throws Exception { 
     testTypes("3 in Object"); 
 } 


public void testQualifiedNameReduction102369() throws Exception { 
     testTypes("/** @return {string} */ var f = function() {\n" + "var x = { /** @param {number} b */ set a(b) {}};\n" + "return x.a ? x.a : 'a'; }", "inconsistent return type\n" + "found   : (number|string)\n" + "required: string"); 
 } 


public void testDirectPrototypeAssign2377() throws Exception { 
     testTypes("/** @constructor */ function Foo() {}" + "/** @constructor */ function Bar() {}" + "/** @type {Array} */ Bar.prototype = new Foo()"); 
 } 


public void testMethodInference72385() throws Exception { 
     testTypes("/** @constructor */ function F() {}" + "F.prototype.foo = function() { };" + "/** @constructor \n * @extends {F} */ " + "function G() {}" + "/** @override */ G.prototype.foo = function(x, y) { };", "mismatch of the foo property type and the type of the property " + "it overrides from superclass F\n" + "original: function (this:F): undefined\n" + "override: function (this:G, ?, ?): undefined"); 
 } 


public void testObjLitDef62417() throws Exception { 
     testTypes("var lit = /** @struct */ { 'x': 1 };", "Illegal key, the object literal is a struct"); 
 } 


public void testAnonymousType32420() throws Exception { 
     testTypes("function f() { return {}; }" + "/** @enum */\n" + "f().bar = {FOO: 1};"); 
 } 


public void testForinOnStruct2432() throws Exception { 
     testTypes("/**\n" + " * @constructor\n" + " * @struct\n" + " */" + "function Foo() {}\n" + "for (var prop in (new Foo())) {}", "Cannot use the IN operator with structs"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  


  


  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

   

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Tests the type of a function definition. The function defined by
   * {@code functionDef} should be named {@code "f"}.
   */
  private void testFunctionType(String functionDef, String functionType)
      throws Exception {
    testFunctionType(functionDef, "f", functionType);
  }

  /**
   * Tests the type of a function definition. The function defined by
   * {@code functionDef} should be named {@code functionName}.
   */
  private void testFunctionType(String functionDef, String functionName,
      String functionType) throws Exception {
    // using the variable initialization check to verify the function's type
    testTypes(
        functionDef +
        "/** @type number */var a=" + functionName + ";",
        "initializing variable\n" +
        "found   : " + functionType + "\n" +
        "required: number");
  }

  /**
   * Tests the type of a function definition in externs.
   * The function defined by {@code functionDef} should be
   * named {@code functionName}.
   */
  private void testExternFunctionType(String functionDef, String functionName,
      String functionType) throws Exception {
    testTypes(
        functionDef,
        "/** @type number */var a=" + functionName + ";",
        "initializing variable\n" +
        "found   : " + functionType + "\n" +
        "required: number", false);
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  // TODO(nicksantos): change this to something that makes sense.
//   public void testComparison1() throws Exception {
//     testTypes("/**@type null */var a;" +
//         "/**@type !Date */var b;" +
//         "if (a==b) {}",
//         "condition always evaluates to false\n" +
//         "left : null\n" +
//         "right: Date");
//   }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Test that type inference continues with the right side,
   * when no short-circuiting is possible.
   * See bugid 1205387 for more details.
   */
  

  /**
   * @see #testOr4()
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Tests that the || operator is type checked correctly, that is of
   * the type of the first argument or of the second argument. See
   * bugid 592170 for more details.
   */
  

  /**
   * Tests that undefined can be compared shallowly to a value of type
   * (number,undefined) regardless of the side on which the undefined
   * value is.
   */
  

  /**
   * Tests that the match method of strings returns nullable arrays.
   */
  

  /**
   * Tests that named types play nicely with subtyping.
   */
  

  /**
   * Tests that assigning two untyped functions to a variable whose type is
   * inferred and calling this variable is legal.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Type checks a NAME node and retrieve its type.
   */
  private JSType testNameNode(String name) {
    Node node = Node.newString(Token.NAME, name);
    Node parent = new Node(Token.SCRIPT, node);
    parent.setInputId(new InputId("code"));

    Node externs = new Node(Token.SCRIPT);
    externs.setInputId(new InputId("externs"));

    Node externAndJsRoot = new Node(Token.BLOCK, externs, parent);
    externAndJsRoot.setIsSyntheticBlock(true);

    makeTypeCheck().processForTesting(null, parent);
    return node.getJSType();
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testAddingMethodsUsingPrototypeIdiomComplexNamespace(
      TypeCheckResult p) {
    ObjectType goog = (ObjectType) p.scope.getVar("goog").getType();
    assertEquals(NATIVE_PROPERTIES_COUNT + 1, goog.getPropertiesCount());
    JSType googA = goog.getPropertyType("A");
    assertNotNull(googA);
    assertTrue(googA instanceof FunctionType);
    FunctionType googAFunction = (FunctionType) googA;
    ObjectType classA = googAFunction.getInstanceType();
    assertEquals(NATIVE_PROPERTIES_COUNT + 1, classA.getPropertiesCount());
    checkObjectType(classA, "m1", NUMBER_TYPE);
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // According to ECMA-262, Error & Array function calls are equivalent to
  // constructor calls.

  

  

  

  // TODO(user): We should flag these as invalid. This will probably happen
  // when we make sure the interface is never referenced outside of its
  // definition. We might want more specific and helpful error messages.
  //public void testWarningOnInterfacePrototype() throws Exception {
  //  testTypes("/** @interface */ u.T = function() {};\n" +
  //      "/** @return {number} */ u.T.prototype = function() { };",
  //      "e of its definition");
  //}
  //
  //public void testBadPropertyOnInterface1() throws Exception {
  //  testTypes("/** @interface */ u.T = function() {};\n" +
  //      "/** @return {number} */ u.T.f = function() { return 1;};",
  //      "cannot reference an interface outside of its definition");
  //}
  //
  //public void testBadPropertyOnInterface2() throws Exception {
  //  testTypes("/** @interface */ function T() {};\n" +
  //      "/** @return {number} */ T.f = function() { return 1;};",
  //      "cannot reference an interface outside of its definition");
  //}
  //
  //public void testBadPropertyOnInterface3() throws Exception {
  //  testTypes("/** @interface */ u.T = function() {}; u.T.x",
  //      "cannot reference an interface outside of its definition");
  //}
  //
  //public void testBadPropertyOnInterface4() throws Exception {
  //  testTypes("/** @interface */ function T() {}; T.x;",
  //      "cannot reference an interface outside of its definition");
  //}

  

  

  

  

  // TODO(user): If we want to support this syntax we have to warn about
  // missing annotations.
  //public void testWarnUnannotatedPropertyOnInterface1() throws Exception {
  //  testTypes("/** @interface */ u.T = function () {}; u.T.prototype.x;",
  //      "interface property x is not annotated");
  //}
  //
  //public void testWarnUnannotatedPropertyOnInterface2() throws Exception {
  //  testTypes("/** @interface */ function T() {}; T.prototype.x;",
  //      "interface property x is not annotated");
  //}

  

  

  // TODO(user): If we want to support this syntax we have to warn about
  // the invalid type of the interface member.
  //public void testWarnDataPropertyOnInterface1() throws Exception {
  //  testTypes("/** @interface */ u.T = function () {};\n" +
  //      "/** @type {number} */u.T.prototype.x;",
  //      "interface members can only be plain functions");
  //}

  

  

  

  

  

  

  // TODO(user): If we want to support this syntax we should warn about the
  // mismatching types in the two tests below.
  //public void testErrorMismatchingPropertyOnInterface1() throws Exception {
  //  testTypes("/** @interface */ u.T = function () {};\n" +
  //      "/** @param {Number} foo */u.T.prototype.x =\n" +
  //      "/** @param {String} foo */function(foo) {};",
  //      "found   : \n" +
  //      "required: ");
  //}
  //
  //public void testErrorMismatchingPropertyOnInterface2() throws Exception {
  //  testTypes("/** @interface */ function T() {};\n" +
  //      "/** @return {number} */T.prototype.x =\n" +
  //      "/** @return {string} */function() {};",
  //      "found   : \n" +
  //      "required: ");
  //}

  // TODO(user): We should warn about this (bar is missing an annotation). We
  // probably don't want to warn about all missing parameter annotations, but
  // we should be as strict as possible regarding interfaces.
  //public void testErrorMismatchingPropertyOnInterface3() throws Exception {
  //  testTypes("/** @interface */ u.T = function () {};\n" +
  //      "/** @param {Number} foo */u.T.prototype.x =\n" +
  //      "function(foo, bar) {};",
  //      "found   : \n" +
  //      "required: ");
  //}

  

  

  

  

  

  

  

  

  

  

  

  

  

  // In all testResolutionViaRegistry* tests, since u is unknown, u.T can only
  // be resolved via the registry and not via properties.

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private double getTypedPercent(String js) throws Exception {
    Node n = compiler.parseTestCode(js);

    Node externs = new Node(Token.BLOCK);
    Node externAndJsRoot = new Node(Token.BLOCK, externs, n);
    externAndJsRoot.setIsSyntheticBlock(true);

    TypeCheck t = makeTypeCheck();
    t.processForTesting(null, n);
    return t.getTypedPercent();
  }

  private ObjectType getInstanceType(Node js1Node) {
    JSType type = js1Node.getFirstChild().getJSType();
    assertNotNull(type);
    assertTrue(type instanceof FunctionType);
    FunctionType functionType = (FunctionType) type;
    assertTrue(functionType.isConstructor());
    return functionType.getInstanceType();
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void checkObjectType(ObjectType objectType, String propertyName,
        JSType expectedType) {
    assertTrue("Expected " + objectType.getReferenceName() +
        " to have property " +
        propertyName, objectType.hasProperty(propertyName));
    assertTypeEquals("Expected " + objectType.getReferenceName() +
        "'s property " +
        propertyName + " to have type " + expectedType,
        expectedType, objectType.getPropertyType(propertyName));
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testTypes(String js) throws Exception {
    testTypes(js, (String) null);
  }

  private void testTypes(String js, String description) throws Exception {
    testTypes(js, description, false);
  }

  private void testTypes(String js, DiagnosticType type) throws Exception {
    testTypes(js, type.format(), false);
  }

  private void testClosureTypes(String js, String description)
      throws Exception {
    testClosureTypesMultipleWarnings(js,
        description == null ? null : Lists.newArrayList(description));
  }

  private void testClosureTypesMultipleWarnings(
      String js, List<String> descriptions) throws Exception {
    Node n = compiler.parseTestCode(js);
    Node externs = new Node(Token.BLOCK);
    Node externAndJsRoot = new Node(Token.BLOCK, externs, n);
    externAndJsRoot.setIsSyntheticBlock(true);

    assertEquals("parsing error: " +
        Joiner.on(", ").join(compiler.getErrors()),
        0, compiler.getErrorCount());

    // For processing goog.addDependency for forward typedefs.
    new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR)
        .process(null, n);

    CodingConvention convention = compiler.getCodingConvention();
    new TypeCheck(compiler,
        new ClosureReverseAbstractInterpreter(
            convention, registry).append(
                new SemanticReverseAbstractInterpreter(
                    convention, registry))
            .getFirst(),
        registry)
        .processForTesting(null, n);

    assertEquals(
        "unexpected error(s) : " +
        Joiner.on(", ").join(compiler.getErrors()),
        0, compiler.getErrorCount());

    if (descriptions == null) {
      assertEquals(
          "unexpected warning(s) : " +
          Joiner.on(", ").join(compiler.getWarnings()),
          0, compiler.getWarningCount());
    } else {
      assertEquals(
          "unexpected warning(s) : " +
          Joiner.on(", ").join(compiler.getWarnings()),
          descriptions.size(), compiler.getWarningCount());
      Set<String> actualWarningDescriptions = Sets.newHashSet();
      for (int i = 0; i < descriptions.size(); i++) {
        actualWarningDescriptions.add(compiler.getWarnings()[i].description);
      }
      assertEquals(
          Sets.newHashSet(descriptions), actualWarningDescriptions);
    }
  }

  void testTypes(String js, String description, boolean isError)
      throws Exception {
    testTypes(DEFAULT_EXTERNS, js, description, isError);
  }

  void testTypes(String externs, String js, String description, boolean isError)
      throws Exception {
    Node n = parseAndTypeCheck(externs, js);

    JSError[] errors = compiler.getErrors();
    if (description != null && isError) {
      assertTrue("expected an error", errors.length > 0);
      assertEquals(description, errors[0].description);
      errors = Arrays.asList(errors).subList(1, errors.length).toArray(
          new JSError[errors.length - 1]);
    }
    if (errors.length > 0) {
      fail("unexpected error(s):\n" + Joiner.on("\n").join(errors));
    }

    JSError[] warnings = compiler.getWarnings();
    if (description != null && !isError) {
      assertTrue("expected a warning", warnings.length > 0);
      assertEquals(description, warnings[0].description);
      warnings = Arrays.asList(warnings).subList(1, warnings.length).toArray(
          new JSError[warnings.length - 1]);
    }
    if (warnings.length > 0) {
      fail("unexpected warnings(s):\n" + Joiner.on("\n").join(warnings));
    }
  }

  /**
   * Parses and type checks the JavaScript code.
   */
  private Node parseAndTypeCheck(String js) {
    return parseAndTypeCheck(DEFAULT_EXTERNS, js);
  }

  private Node parseAndTypeCheck(String externs, String js) {
    return parseAndTypeCheckWithScope(externs, js).root;
  }

  /**
   * Parses and type checks the JavaScript code and returns the Scope used
   * whilst type checking.
   */
  private TypeCheckResult parseAndTypeCheckWithScope(String js) {
    return parseAndTypeCheckWithScope(DEFAULT_EXTERNS, js);
  }

  private TypeCheckResult parseAndTypeCheckWithScope(
      String externs, String js) {
    compiler.init(
        Lists.newArrayList(SourceFile.fromCode("[externs]", externs)),
        Lists.newArrayList(SourceFile.fromCode("[testcode]", js)),
        compiler.getOptions());

    Node n = compiler.getInput(new InputId("[testcode]")).getAstRoot(compiler);
    Node externsNode = compiler.getInput(new InputId("[externs]"))
        .getAstRoot(compiler);
    Node externAndJsRoot = new Node(Token.BLOCK, externsNode, n);
    externAndJsRoot.setIsSyntheticBlock(true);

    assertEquals("parsing error: " +
        Joiner.on(", ").join(compiler.getErrors()),
        0, compiler.getErrorCount());

    Scope s = makeTypeCheck().processForTesting(externsNode, n);
    return new TypeCheckResult(n, s);
  }

  private Node typeCheck(Node n) {
    Node externsNode = new Node(Token.BLOCK);
    Node externAndJsRoot = new Node(Token.BLOCK, externsNode, n);
    externAndJsRoot.setIsSyntheticBlock(true);

    makeTypeCheck().processForTesting(null, n);
    return n;
  }

  private TypeCheck makeTypeCheck() {
    return new TypeCheck(
        compiler,
        new SemanticReverseAbstractInterpreter(
            compiler.getCodingConvention(), registry),
        registry,
        reportMissingOverrides,
        CheckLevel.OFF);
  }

  void testTypes(String js, String[] warnings) throws Exception {
    Node n = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    Node externsNode = new Node(Token.BLOCK);
    Node externAndJsRoot = new Node(Token.BLOCK, externsNode, n);

    makeTypeCheck().processForTesting(null, n);
    assertEquals(0, compiler.getErrorCount());
    if (warnings != null) {
      assertEquals(warnings.length, compiler.getWarningCount());
      JSError[] messages = compiler.getWarnings();
      for (int i = 0; i < warnings.length && i < compiler.getWarningCount();
           i++) {
        assertEquals(warnings[i], messages[i].description);
      }
    } else {
      assertEquals(0, compiler.getWarningCount());
    }
  }

  String suppressMissingProperty(String ... props) {
    String result = "function dummy(x) { ";
    for (String prop : props) {
      result += "x." + prop + " = 3;";
    }
    return result + "}";
  }

  private static class TypeCheckResult {
    private final Node root;
    private final Scope scope;

    private TypeCheckResult(Node root, Scope scope) {
      this.root = root;
      this.scope = scope;
    }
  }
}
