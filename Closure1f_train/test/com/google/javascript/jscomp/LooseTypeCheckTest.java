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
import com.google.javascript.jscomp.CheckLevel;
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
 * This is a temporary fork of the TypeCheckTest for the experimental
 * "looseTypes" option.  These tests should be be folded into TypeCheckTest
 * or removed along with the looseTypes option.
 *
 */
public class LooseTypeCheckTest extends CompilerTypeTestCase {

  @Override
  public CompilerOptions getOptions() {
    CompilerOptions options = super.getOptions();
    options.looseTypes = true;
    return options;
  }


public void testInnerFunction71() throws Exception { 
     testClosureTypes(CLOSURE_DEFS + "function f() {" + " /** @type {number|function()} */" + " var x = 0 || function() {};\n" + " function g() { if (goog.isFunction(x)) { x(1); } }" + " g();" + "}", "Function x: called with 1 argument(s). " + "Function requires at least 0 argument(s) " + "and no more than 0 argument(s)."); 
 } 


public void testQualifiedNameReduction340() throws Exception { 
     testTypes("/** @param {string|Array} a\n@constructor */ var T = " + "function(a) {this.a = a};\n" + "/** @return {string} */ T.prototype.f = function() {\n" + "return typeof this.a == 'string' ? this.a : 'a'; }"); 
 } 


public void testClosure3216() throws Exception { 
     testClosureTypes(CLOSURE_DEFS + "/** @type {string|null|undefined} */var a;" + "/** @type string */" + "var b = goog.isDefAndNotNull(a) ? a : 'default';", null); 
 } 


public void testAnd6218() throws Exception { 
     testTypes("/** @param {number} x */function f(x){};\n" + "/** @type {number|undefined} */var x;\n" + "if (x && f(x)) { f(x) }"); 
 } 


public void testBitOperation9231() throws Exception { 
     testTypes("var x = void 0; x |= {};", "bad right operand to bitwise operator\n" + "found   : {}\n" + "required: (boolean|null|number|string|undefined)"); 
 } 


public void testPropertyTypeOfUnionType238() throws Exception { 
     testTypes("var a = {};" + "/** @constructor */ a.N = function() {};\n" + "a.N.prototype.p = 1;\n" + "/** @constructor */ a.S = function() {};\n" + "a.S.prototype.p = 'a';\n" + "/** @param {!a.N|!a.S} x\n@return {string} */\n" + "var f = function(x) { return x.p; };", "inconsistent return type\n" + "found   : (number|string)\n" + "required: string"); 
 } 


public void testInheritanceCheck6319() throws Exception { 
     testTypes("/** @constructor */function Root() {};" + "Root.prototype.foo = function() {};" + "/** @constructor\n @extends {Root} */function Super() {};" + "/** @constructor\n @extends {Super} */function Sub() {};" + "/** @override */Sub.prototype.foo = function() {};"); 
 } 


public void testForwardTypeDeclaration3469() throws Exception { 
     testClosureTypes("goog.addDependency('zzz.js', ['MyType'], []);" + "/** @param {MyType} x */ function f(x) { return x; }" + "/** @constructor */ var MyType = function() {};" + "f(3);", "actual parameter 1 of f does not match formal parameter\n" + "found   : number\n" + "required: (MyType|null|undefined)"); 
 } 


public void testBadImplementsNonObjectType481() throws Exception { 
     testTypes("/** @constructor \n * @implements {string} */function S() {}", "can only implement interfaces"); 
 } 


public void testOptionalUnknownNamedType519() throws Exception { 
     testTypes("/** @param {!T} opt_x\n@return {undefined} */\n" + "function f(opt_x) { return opt_x; }\n" + "/** @constructor */var T = function() {};", "inconsistent return type\n" + "found   : (T|undefined)\n" + "required: undefined"); 
 } 


public void testOptionalArgFunctionParam2541() throws Exception { 
     testTypes("/** @param {function(number=)} a */" + "function f(a) {a(3)};"); 
 } 


public void testTypeInferenceWithClosure1549() throws Exception { 
     testTypes("/** @return {boolean} */" + "function f() {" + "  /** @type {?string} */ var x = null;" + "  function g() { x = 'y'; } g(); " + "  return x == null;" + "}"); 
 } 


public void testIn5561() throws Exception { 
     testTypes("'x' in null", "'in' requires an object\n" + "found   : null\n" + "required: Object"); 
 } 


public void testEnum19579() throws Exception { 
     testTypes("/**@enum*/ var E = {A: 1, B: 2};" + "/** @param {number} x\n@return {!E} */\n" + "var f = function(x) { return x; };", "inconsistent return type\n" + "found   : number\n" + "required: E.<number>"); 
 } 


public void testAddingMethodsUsingPrototypeIdiomComplexNamespace1603() throws Exception { 
     TypeCheckResult p = parseAndTypeCheckWithScope("var goog = {};" + "goog.A = /** @constructor */function() {};" + "/** @type number */goog.A.prototype.m1 = 5"); 
     testAddingMethodsUsingPrototypeIdiomComplexNamespace(p); 
 } 


public void testGetprop1618() throws Exception { 
     testTypes("/** @return {void}*/function foo(){foo().bar;}", "No properties on this expression\n" + "found   : undefined\n" + "required: Object"); 
 } 


public void testComparison6715() throws Exception { 
     testTypes("/** @type null */var a;" + "/** @type null */var b;" + "a != b", "condition always evaluates to false\n" + "left : null\n" + "right: null"); 
 } 


public void testBitOperation7845() throws Exception { 
     testTypes("var x = null; x |= undefined; x &= 3; x ^= '3'; x |= true;"); 
 } 


public void testInterfaceNonEmptyFunction895() throws Exception { 
     testTypes("/** @interface */ function T() {};\n" + "T.prototype.x = function() { return 'foo'; }", "interface member functions must have an empty body"); 
 } 


public void testCall3906() throws Exception { 
     testTypes("/** @type {Function|undefined} */var opt_f;" + "/** @type {some.unknown.type} */var f1;" + "var f2 = opt_f || f1;" + "f2();", "Bad type annotation. Unknown type some.unknown.type"); 
 } 


public void testTypeOfReduction13915() throws Exception { 
     testClosureTypes(CLOSURE_DEFS + "/** @enum {string} */ var E = {A: 'a', B: 'b'};\n" + "/** @param {E|Array} x\n@return {Array} */ " + "function f(x) { return goog.isObject(x) ? x : []; }", null); 
 } 


public void testPropAccess2929() throws Exception { 
     testTypes("var bar = void 0; bar.baz;", "No properties on this expression\n" + "found   : undefined\n" + "required: Object"); 
 } 


public void testSwitchCase51037() throws Exception { 
     testTypes("/** @type {(String,Null)} */" + "var a = new String('foo');" + "switch (a) { case 'A':break; case null:break; }"); 
 } 


public void testIn31040() throws Exception { 
     testTypes("undefined in Object"); 
 } 


public void testStringComparison51097() throws Exception { 
     testTypes("/**@param {*} a*/ " + "function f(a) {return a < 'x';}"); 
 } 


public void testSuperClassDefinedAfterSubClass21106() throws Exception { 
     testTypes("/** @constructor \n * @extends {Base} */ function A() {}" + "/** @constructor \n * @extends {Base} */ function B() {}" + "/** @param {A|B} x \n * @return {B|A} */ " + "function foo(x) { return x; }" + "/** @constructor */ function Base() {}"); 
 } 


public void testAddSingletonGetter1115() { 
     Node n = parseAndTypeCheck("/** @constructor */ function Foo() {};\n" + "goog.addSingletonGetter(Foo);"); 
     ObjectType o = (ObjectType) n.getFirstChild().getJSType(); 
     assertEquals("function (): Foo", o.getPropertyType("getInstance").toString()); 
     assertEquals("Foo", o.getPropertyType("instance_").toString()); 
 } 


public void testBadInterfaceExtends41133() throws Exception { 
     testTypes("/** @interface */function A() {}\n" + "/** @constructor */function B() {}\n" + "B.prototype = A;"); 
 } 


public void testBug14844451147() throws Exception { 
     testTypes("/** @constructor */ function Foo() {}" + "/** @type {number?} */ Foo.prototype.bar = null;" + "/** @type {number?} */ Foo.prototype.baz = null;" + "/** @param {Foo} foo */" + "function f(foo) {" + "  while (true) {" + "    if (foo.bar == null && foo.baz == null) {" + "      foo.bar;" + "    }" + "  }" + "}"); 
 } 


public void testMethodInference91149() throws Exception { 
     testTypes("/** @constructor */ function F() {}" + "F.prototype.foo = function() { };" + "/** @constructor \n * @extends {F} */ " + "function G() {}" + "/** @override */ " + "G.prototype.foo = function(var_args, opt_b) { };", "variable length argument must be last"); 
 } 


public void testBitOperation21172() throws Exception { 
     testTypes("/**@return {void}*/function foo(){var a = foo()<<3;}", "operator << cannot be applied to undefined"); 
 } 


public void testInterfaceInheritanceCheck21196() throws Exception { 
     testTypes("/** @interface */function Super() {};" + "/** @desc description */Super.prototype.foo = function() {};" + "/** @constructor\n @implements {Super} */function Sub() {};" + "/** @override */Sub.prototype.foo = function() {};"); 
 } 


public void testTypeCheck51204() throws Exception { 
     testTypes("/**@return {void}*/function foo(){ var a = +foo(); }", "sign operator\n" + "found   : undefined\n" + "required: number"); 
 } 


public void testExtendBuiltInType11221() throws Exception { 
     String externs = "/** @constructor */ var String = function(opt_str) {};\n" + "/**\n" + "* @param {number} start\n" + "* @param {number} opt_length\n" + "* @return {string}\n" + "*/\n" + "String.prototype.substr = function(start, opt_length) {};\n"; 
     Node n1 = parseAndTypeCheck(externs + "(new String(\"x\")).substr(0,1);"); 
     assertTypeEquals(STRING_TYPE, n1.getLastChild().getFirstChild().getJSType()); 
 } 


public void testNumericComparison61260() throws Exception { 
     testTypes("/**@return {void}*/ function foo() { if (3 >= foo()) return; }", "right side of numeric comparison\n" + "found   : undefined\n" + "required: number"); 
 } 


public void testBang61294() throws Exception { 
     testTypes("/** @param {Object?} x\n@return {Object} */\n" + "function f(x) { return x; }"); 
 } 


public void testFunctionMasksVariableBug1316() throws Exception { 
     testTypes("var x = 4; var f = function x(b) { return b ? 1 : x(true); };", "function x masks variable (IE bug)"); 
 } 


public void testEnum171335() throws Exception { 
     testTypes("var goog = {};" + "/**@enum*/goog.a={BB:'string'}", "assignment to property BB of enum{goog.a}\n" + "found   : string\n" + "required: number"); 
 } 


public void testInheritanceCheck141339() throws Exception { 
     testTypes("var goog = {};\n" + "/** @constructor\n @extends {goog.Missing} */\n" + "goog.Super = function() {};\n" + "/** @constructor\n @extends {goog.Super} */function Sub() {};" + "/** @override */Sub.prototype.foo = function() {};", "Bad type annotation. Unknown type goog.Missing"); 
 } 


public void testInterfaceInheritanceCheck31413() throws Exception { 
     testTypes("/** @interface */function Root() {};" + "/** @return {number} */Root.prototype.foo = function() {};" + "/** @interface\n @extends {Root} */function Super() {};" + "/** @constructor\n @implements {Super} */function Sub() {};" + "/** @return {number} */Sub.prototype.foo = function() { return 1;};", "property foo already defined on interface Root; use @override to " + "override it"); 
 } 


public void testBooleanType1452() throws Exception { 
     testTypes("/**@type {boolean} */var x = 1 < 2;"); 
 } 


public void testBackwardsEnumUse11456() throws Exception { 
     testTypes("/** @return {string} */ function f() { return MyEnum.FOO; }" + "/** @enum {string} */ var MyEnum = {FOO: 'x'};"); 
 } 


public void testIn41465() throws Exception { 
     testTypes("Date in Object", "left side of 'in'\n" + "found   : function (new:Date, ?=, ?=, ?=, ?=, ?=, ?=, ?=): string\n" + "required: string"); 
 } 


public void testDuplicateStaticMethodDecl11466() throws Exception { 
     testTypes("var goog = goog || {};" + "/** @param {number} x */ goog.foo = function(x) {};" + "/** @param {number} x */ goog.foo = function(x) {};", "variable goog.foo redefined with type function (number): undefined, " + "original definition at [testcode]:1 " + "with type function (number): undefined"); 
 } 


public void testScoping81494() throws Exception { 
     testTypes("/** @constructor */function A() {}" + "/** @constructor */function B() {" + "  /** @type !A */this.a = null;" + "}", "assignment to property a of B\n" + "found   : null\n" + "required: A"); 
 } 


public void testParameterizedObject21534() throws Exception { 
     testTypes("/** @param {!Object.<string,number>} a\n" + "* @return {string}\n" + "*/ var f = function(a) { return a['x']; };", "inconsistent return type\n" + "found   : number\n" + "required: string"); 
 } 


public void testForwardTypeDeclaration11546() throws Exception { 
     testClosureTypes("goog.addDependency();" + "goog.addDependency('y', [goog]);" + "goog.addDependency('zzz.js', ['MyType'], []);" + "/** @param {MyType} x \n * @return {number} */" + "function f(x) { return 3; }", null); 
 } 


public void testControlFlowRestrictsType41548() throws Exception { 
     testTypes("/** @param {string} a */ function f(a){}" + "/** @type {(string,undefined)} */ var a;" + "a && f(a);"); 
 } 


public void testValueOfComparison21552() throws Exception { 
     testTypes("/** @constructor */function O() {};" + "/**@override*/O.prototype.valueOf = function() { return 1; };" + "/**@param {!O} a\n@param {number} b*/" + "function f(a,b) { return a < b; }"); 
 } 


public void testBug18595351666() throws Exception { 
     testTypes("/**\n" + " * @param {Function} childCtor Child class.\n" + " * @param {Function} parentCtor Parent class.\n" + " */" + "var inherits = function(childCtor, parentCtor) {" + "  /** @constructor */" + "  function tempCtor() {};" + "  tempCtor.prototype = parentCtor.prototype;" + "  childCtor.superClass_ = parentCtor.prototype;" + "  childCtor.prototype = new tempCtor();" + "  /** @override */ childCtor.prototype.constructor = childCtor;" + "};" + "/**" + " * @param {Function} constructor\n" + " * @param {Object} var_args\n" + " * @return {Object}\n" + " */" + "var factory = function(constructor, var_args) {" + "  /** @constructor */" + "  var tempCtor = function() {};" + "  tempCtor.prototype = constructor.prototype;" + "  var obj = new tempCtor();" + "  constructor.apply(obj, arguments);" + "  return obj;" + "};"); 
 } 


public void testBadImplementsAConstructor1671() throws Exception { 
     testTypes("/** @constructor */function A() {}\n" + "/** @constructor \n * @implements {A} */function B() {}", "can only implement interfaces"); 
 } 


public void testGetTypedPercent41685() throws Exception { 
     String js = "var n = {};\n /** @constructor */ n.T = function() {};\n" + "/** @type n.T */ var x = new n.T();"; 
     assertEquals(100.0, getTypedPercent(js), 0.1); 
 } 


public void testSuperclassMismatch11765() throws Exception { 
     compiler.getOptions().setCodingConvention(new GoogleCodingConvention()); 
     testTypes("/** @constructor */ var Foo = function() {};\n" + "/** @constructor \n @extends Object */ var Bar = function() {};\n" + "Bar.inherits = function(x){};" + "Bar.inherits(Foo);\n", "Missing @extends tag on type Bar"); 
 } 


public void testValueTypeBuiltInPrototypePropertyType1820() throws Exception { 
     Node node = parseAndTypeCheck("\"x\".charAt(0)"); 
     assertTypeEquals(STRING_TYPE, node.getFirstChild().getFirstChild().getJSType()); 
 } 


public void testImplicitCastNotInExterns1850() throws Exception { 
     testTypes("/** @constructor */ function Element() {};\n" + "/** @type {string}\n" + "  * @implicitCast */" + "Element.prototype.innerHTML;" + "(new Element).innerHTML = new Array();", new String[] { "Illegal annotation on innerHTML. @implicitCast may only be " + "used in externs.", "assignment to property innerHTML of Element\n" + "found   : Array\n" + "required: string" }); 
 } 


public void testErrorMismatchingPropertyOnInterface51863() throws Exception { 
     testTypes("/** @interface */ function T() {};\n" + "/** @type {number} */T.prototype.x = function() { };", "assignment to property x of T.prototype\n" + "found   : function (): undefined\n" + "required: number"); 
 } 


public void testMissingProperty131915() throws Exception { 
     testTypes("var goog = {}; goog.isDef = function(x) { return false; };" + "/** @param {Object} obj */" + "function foo(obj) { return goog.isDef(obj.impossible); }"); 
 } 


public void testTypeCheck121929() throws Exception { 
     testTypes("/**@return {!Object}*/function foo(){var a = 3^foo();}", "bad right operand to bitwise operator\n" + "found   : Object\n" + "required: (boolean|null|number|string|undefined)"); 
 } 


public void testFunctionArguments61936() throws Exception { 
     testTypes("function a(var_args,a) {}", "variable length argument must be last"); 
 } 


public void testNew111983() throws Exception { 
     testTypes("/** @param {Function} c1 */" + "function f(c1) {" + "  var c2 = function(){};" + "  c1.prototype = new c2;" + "}", TypeCheck.NOT_A_CONSTRUCTOR); 
 } 


public void testBadInterfaceExtends22011() throws Exception { 
     testTypes("/** @constructor */function A() {}\n" + "/** @interface \n * @extends {A} */function B() {}", "B cannot extend this type; interfaces can only extend interfaces"); 
 } 


public void testMethodInference62029() throws Exception { 
     testTypes("/** @constructor */ function F() {}" + "/** @param {number} x */ F.prototype.foo = function(x) { };" + "/** @constructor \n * @extends {F} */ " + "function G() {}" + "/** @override */ G.prototype.foo = function() { };" + "(new G()).foo(1);"); 
 } 


public void testFunctionInference202041() throws Exception { 
     testFunctionType("/** @this {Date} */ var f;", "f", "function (this:Date): ?"); 
 } 


public void testTypeRedefinition2048() throws Exception { 
     testClosureTypesMultipleWarnings("a={};/**@enum {string}*/ a.A = {ZOR:'b'};" + "/** @constructor */ a.A = function() {}", Lists.newArrayList("variable a.A redefined with type function (new:a.A): undefined, " + "original definition at [testcode]:1 with type enum{a.A}", "assignment to property A of a\n" + "found   : function (new:a.A): undefined\n" + "required: enum{a.A}")); 
 } 


public void testParameterizedObject42062() throws Exception { 
     testTypes("/** @enum {string} */ var E = {A: 'a', B: 'b'};\n" + "/** @param {!Object.<E,string>} a\n" + "* @return {string}\n" + "*/ var f = function(a) { return a['x']; };", "restricted index type\n" + "found   : string\n" + "required: E.<string>"); 
 } 


public void testErrorMismatchingPropertyOnInterface42122() throws Exception { 
     testTypes("/** @interface */ u.T = function () {};\n" + "/** @param {Number} foo */u.T.prototype.x =\n" + "function() {};", "parameter foo does not appear in u.T.prototype.x's parameter list"); 
 } 


public void testHookRestrictsType42131() throws Exception { 
     testTypes("/** @type {(boolean,undefined)} */" + "var a;" + "/** @type boolean */" + "var b = a != null ? a : true;"); 
 } 


public void testBadConstructorCall2182() throws Exception { 
     testTypes("/** @constructor */ function Foo() {}" + "Foo();", "Constructor function (new:Foo): undefined should be called " + "with the \"new\" keyword"); 
 } 


public void testBadExtends32201() throws Exception { 
     testTypes("/** @extends {Object} */function base() {}", "@extends used without @constructor or @interface for base"); 
 } 


public void testGoodExtends102211() throws Exception { 
     testTypes("/** @constructor */ function Super() {}" + "/** @constructor \n * @extends {Super} */ function Sub() {}" + "Sub.prototype = new Super();" + "/** @return {Super} */ function foo() { return new Sub(); }"); 
 } 


public void testUnknownConstructorInstanceType22219() throws Exception { 
     testTypes("function g(f) { return /** @type Array */ (new f()); }"); 
 } 


public void testAnd42239() throws Exception { 
     testTypes("/** @param {number} x */function f(x){};\n" + "/** @type null */var x; /** @type {number?} */var y;\n" + "if (x && y) { f(y) }"); 
 } 


public void testBitOperation62248() throws Exception { 
     testTypes("/**@return {!Object}*/function foo(){var a = foo()&3;}", "bad left operand to bitwise operator\n" + "found   : Object\n" + "required: (boolean|null|number|string|undefined)"); 
 } 


public void testCast142282() throws Exception { 
     testClosureTypes("var goog = {}; " + "goog.addDependency('zzz.js', ['goog.bar'], []);" + "function f() { return /** @type {goog.bar} */ (new Object()); }", null); 
 } 


public void testCast62287() throws Exception { 
     testTypes("/** @constructor */function foo() {}\n" + "/** @constructor \n @extends foo */function bar() {}\n" + "var baz = /** @type {!bar} */(new bar);\n" + "var baz = /** @type {!foo} */(new foo);\n" + "var baz = /** @type {bar} */(new bar);\n" + "var baz = /** @type {foo} */(new foo);\n" + "var baz = /** @type {!foo} */(new bar);\n" + "var baz = /** @type {!bar} */(new foo);\n" + "var baz = /** @type {foo} */(new bar);\n" + "var baz = /** @type {bar} */(new foo);\n"); 
 } 


public void testTypeCheck22316() throws Exception { 
     testTypes("/**@return {void}*/function foo(){ var x=foo(); x--; }", "increment/decrement\n" + "found   : undefined\n" + "required: number"); 
 } 


public void testBackwardsEnumUse52325() throws Exception { 
     testTypes("/** @return {string} */ function f() { return MyEnum.BAR; }" + "/** @enum {string} */ var YourEnum = {FOO: 'x'};" + "/** @enum {string} */ var MyEnum = YourEnum;", "element BAR does not exist on this enum"); 
 } 


public void testInstanceof22340() throws Exception { 
     testTypes("/**@return {void}*/function foo(){" + "if (foo() instanceof Object)return;}", "deterministic instanceof yields false\n" + "found   : undefined\n" + "required: NoObject"); 
 } 


public void testMissingProperty222347() throws Exception { 
     testTypes("/** @param {Object} x \n * @return {boolean} */" + "function f(x) { return x.foo ? x.foo() : true; }"); 
 } 


public void testTypeCheck82376() throws Exception { 
     testTypes("/**@return {void}*/function foo(){do {} while (foo());}"); 
 } 


public void testMissingProperty182380() throws Exception { 
     testTypes("/** @param {Object} x */" + "function f(x) { if (x.foo instanceof Function) { x.foo(); } }"); 
 } 


public void testInstanceof42395() throws Exception { 
     testTypes("/**@return {(Object|number)} */function foo(){" + "if (foo() instanceof Object)return 3;}"); 
 } 


public void testMissingProperty112398() throws Exception { 
     testTypes("/** @param {Object} obj */" + "function foo(obj) { for (;obj.impossible;) { return true; } }"); 
 } 


public void testTypeInferenceWithClosure22407() throws Exception { 
     testTypes("/** @return {boolean} */" + "function f() {" + "  /** @type {?string} */ var x = null;" + "  function g() { x = 'y'; } g(); " + "  return x === 3;" + "}", "condition always evaluates to false\n" + "left : (null|string|undefined)\n" + "right: number"); 
 } 


public void testPrototypeLoop2415() throws Exception { 
     testClosureTypesMultipleWarnings(suppressMissingProperty("foo") + "/** @constructor \n * @extends {T} */var T = function() {};" + "alert((new T).foo);", Lists.newArrayList("Parse error. Cycle detected in inheritance chain of type T", "Could not resolve type in @extends tag of T")); 
 } 


public void testBadImplements22427() throws Exception { 
     testTypes("/** @interface */function Disposable() {}\n" + "/** @implements {Disposable}\n */function f() {}", "@implements used without @constructor for f"); 
 } 


public void testMissingProperty102442() throws Exception { 
     testTypes("/** @param {Object} obj */" + "function foo(obj) { while (obj.impossible) { return true; } }"); 
 } 


public void testFunctionArguments52443() throws Exception { 
     testTypes("function a(opt_a,a) {}", "optional arguments must be at the end"); 
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

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // TODO(user): We should support this way of declaring properties as it is
  // widely used.
  //public void testInheritanceCheck15() throws Exception {
  //  testTypes(
  //      "/** @constructor */function Super() {};" +
  //      "/** @param {number} bar */Super.prototype.foo;" +
  //      "/** @constructor\n @extends {Super} */function Sub() {};" +
  //      "/** @override\n  @param {number} bar */Sub.prototype.foo =\n" +
  //      "function(bar) {};");
  //}

//   public void testInterfacePropertyOverride1() throws Exception {
//     testTypes(
//         "/** @interface */function Super() {};" +
//         "/** @desc description */Super.prototype.foo = function() {};" +
//         "/** @interface\n @extends {Super} */function Sub() {};" +
//         "/** @desc description */Sub.prototype.foo = function() {};",
//         "property foo is already defined by the Super extended interface");
//   }

//   public void testInterfacePropertyOverride2() throws Exception {
//     testTypes(
//         "/** @interface */function Root() {};" +
//         "/** @desc description */Root.prototype.foo = function() {};" +
//         "/** @interface\n @extends {Root} */function Super() {};" +
//         "/** @interface\n @extends {Super} */function Sub() {};" +
//         "/** @desc description */Sub.prototype.foo = function() {};",
//         "property foo is already defined by the Root extended interface");
//   }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // According to ECMA-262, Error & Array function calls are equivalent to
  // constructor calls.

  

  

  

  // TODO(user): We should flag these as invalid. This will probably happen
  // when we make sure the interface is never referenced outside of its
  // definition. We might want more specific and helpful error messages.
  //public void testWarningOnInterfacePrototype() throws Exception {
  //  testTypes("/** @interface */ u.T = function() {};\n" +
  //      "/** @return {number} */ u.T.prototype = function() { };",
  //      "cannot reference an interface outside of its definition");
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
  //
  //public void testWarnDataPropertyOnInterface2() throws Exception {
  //  testTypes("/** @interface */ function T() {};\n" +
  //      "/** @type {number} */T.prototype.x;",
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

    assertEquals(0, compiler.getErrorCount());

    if (descriptions == null) {
      assertEquals(
          "unexpected warning(s) : " +
          Joiner.on(", ").join(compiler.getWarnings()),
          0, compiler.getWarningCount());
    } else {
      assertEquals(descriptions.size(), compiler.getWarningCount());
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
        registry);
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
