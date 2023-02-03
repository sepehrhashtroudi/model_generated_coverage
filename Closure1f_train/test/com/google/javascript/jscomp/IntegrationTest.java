/*
 * Copyright 2009 The Closure Compiler Authors.
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

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * Tests for {@link PassFactory}.
 *
 * @author nicksantos@google.com (Nick Santos)
 */
public class IntegrationTest extends IntegrationTestCase {

  private static final String CLOSURE_BOILERPLATE =
      "/** @define {boolean} */ var COMPILED = false; var goog = {};" +
      "goog.exportSymbol = function() {};";

  private static final String CLOSURE_COMPILED =
      "var COMPILED = true; var goog$exportSymbol = function() {};";


public void testBug1949424_v213() { 
     CompilerOptions options = createCompilerOptions(); 
     options.collapseProperties = true; 
     options.closurePass = true; 
     test(options, CLOSURE_BOILERPLATE + "goog.provide('FOO.BAR'); FOO.BAR = 3;", CLOSURE_COMPILED + "var FOO$BAR = 3;"); 
 } 


public void testCheckReferencesOn23() { 
     CompilerOptions options = createCompilerOptions(); 
     options.aggressiveVarCheck = CheckLevel.ERROR; 
     test(options, "x = 3; var x = 5;", VariableReferenceCheck.UNDECLARED_REFERENCE); 
 } 


public void testRenamePrefixNamespaceActivatesMoveFunctionDeclarations38() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "var x = f; function f() { return 3; }"; 
     testSame(options, code); 
     assertFalse(options.moveFunctionDeclarations); 
     options.renamePrefixNamespace = "_"; 
     test(options, code, "_.f = function() { return 3; }; _.x = _.f;"); 
 } 


public void testMemoizedTypedScopeCreator125() { 
     CompilerOptions options = createCompilerOptions(); 
     options.checkTypes = true; 
     options.ambiguateProperties = true; 
     options.propertyRenaming = PropertyRenamingPolicy.ALL_UNQUOTED; 
     test(options, "function someTest() {\n" + "  /** @constructor */\n" + "  function Foo() { this.instProp = 3; }\n" + "  Foo.prototype.protoProp = function(a, b) {};\n" + "  /** @constructor\n @extends Foo */\n" + "  function Bar() {}\n" + "  goog.inherits(Bar, Foo);\n" + "  var o = new Bar();\n" + "  o.protoProp(o.protoProp, o.instProp);\n" + "}", "function someTest() {\n" + "  function Foo() { this.b = 3; }\n" + "  function Bar() {}\n" + "  Foo.prototype.a = function(a, b) {};\n" + "  goog.c(Bar, Foo);\n" + "  var o = new Bar();\n" + "  o.a(o.a, o.b);\n" + "}"); 
 } 


public void testAllChecksOn169() { 
     CompilerOptions options = createCompilerOptions(); 
     options.checkSuspiciousCode = true; 
     options.checkControlStructures = true; 
     options.checkRequires = CheckLevel.ERROR; 
     options.checkProvides = CheckLevel.ERROR; 
     options.generateExports = true; 
     options.exportTestFunctions = true; 
     options.closurePass = true; 
     options.checkMissingGetCssNameLevel = CheckLevel.ERROR; 
     options.checkMissingGetCssNameBlacklist = "goog"; 
     options.syntheticBlockStartMarker = "synStart"; 
     options.syntheticBlockEndMarker = "synEnd"; 
     options.checkSymbols = true; 
     options.aggressiveVarCheck = CheckLevel.ERROR; 
     options.processObjectPropertyString = true; 
     options.collapseProperties = true; 
     test(options, CLOSURE_BOILERPLATE, CLOSURE_COMPILED); 
 } 


public void testNegativeZero189() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel.ADVANCED_OPTIMIZATIONS.setOptionsForCompilationLevel(options); 
     test(options, "function bar(x) { return x; }\n" + "function foo(x) { print(x / bar(0));\n" + "                 print(x / bar(-0)); }\n" + "foo(3);", "print(3/0);print(3/-0);"); 
 } 


public void testCheckConstants2195() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel level = CompilationLevel.SIMPLE_OPTIMIZATIONS; 
     level.setOptionsForCompilationLevel(options); 
     WarningLevel warnings = WarningLevel.DEFAULT; 
     warnings.setOptionsForWarningLevel(options); 
     String code = "" + "var foo;\n" + "/** @const */\n" + "var x = 1; foo(); x = 2;\n"; 
     test(options, code, ConstCheck.CONST_REASSIGNED_VALUE_ERROR); 
 } 


public void testStrictWarningsGuardEmergencyMode210() throws Exception { 
     CompilerOptions options = createCompilerOptions(); 
     options.checkTypes = true; 
     options.addWarningsGuard(new StrictWarningsGuard()); 
     options.useEmergencyFailSafe(); 
     Compiler compiler = compile(options, "/** @return {number} */ function f() { return true; }"); 
     assertEquals(0, compiler.getErrors().length); 
     assertEquals(1, compiler.getWarnings().length); 
 } 


public void testAliasKeywords221() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "function f() { return true + true + true + true + true + true; }"; 
     String expected = "var JSCompiler_alias_TRUE = true;" + "function f() { return JSCompiler_alias_TRUE + " + "    JSCompiler_alias_TRUE + JSCompiler_alias_TRUE + " + "    JSCompiler_alias_TRUE + JSCompiler_alias_TRUE + " + "    JSCompiler_alias_TRUE; }"; 
     testSame(options, code); 
     options.aliasKeywords = true; 
     test(options, code, expected); 
 } 


public void testIssue598229() { 
     CompilerOptions options = createCompilerOptions(); 
     options.setLanguageIn(LanguageMode.ECMASCRIPT5_STRICT); 
     WarningLevel.VERBOSE.setOptionsForWarningLevel(options); 
     options.setLanguageIn(LanguageMode.ECMASCRIPT5); 
     String code = "'use strict';\n" + "function App() {}\n" + "App.prototype = {\n" + "  get appData() { return this.appData_; },\n" + "  set appData(data) { this.appData_ = data; }\n" + "};"; 
     Compiler compiler = compile(options, code); 
     testSame(options, code); 
 } 


public void testOptimizeParameters249() { 
     String code = "function f(a) { return a; } f(true);"; 
     CompilerOptions options = createCompilerOptions(); 
     testSame(options, code); 
     options.optimizeParameters = true; 
     test(options, code, "function f() { var a = true; return a;} f();"); 
 } 


public void testRecoverOnBadExterns269() throws Exception { 
     CompilerOptions options = createCompilerOptions(); 
     options.aliasExternals = true; 
     externs = ImmutableList.of(SourceFile.fromCode("externs", "extern.foo")); 
     test(options, "var extern; " + "function f() { return extern + extern + extern + extern; }", "var extern; " + "function f() { return extern + extern + extern + extern; }", VarCheck.UNDEFINED_EXTERN_VAR_ERROR); 
 } 


public void testInlineProperties280() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel level = CompilationLevel.ADVANCED_OPTIMIZATIONS; 
     level.setOptionsForCompilationLevel(options); 
     level.setTypeBasedOptimizationOptions(options); 
     String code = "" + "var ns = {};\n" + "/** @constructor */\n" + "ns.C = function () {this.someProperty = 1}\n" + "alert(new ns.C().someProperty + new ns.C().someProperty);\n"; 
     assertTrue(options.inlineProperties); 
     assertTrue(options.collapseProperties); 
     test(options, code, "alert(2);"); 
 } 


public void testRegExp1340() { 
     CompilerOptions options = createCompilerOptions(); 
     options.foldConstants = true; 
     String code = "/(a)/.test(\"a\");"; 
     testSame(options, code); 
     options.computeFunctionSideEffects = true; 
     String expected = ""; 
     test(options, code, expected); 
 } 


public void testFlowSensitiveInlineVariables2353() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel.SIMPLE_OPTIMIZATIONS.setOptionsForCompilationLevel(options); 
     test(options, "function f () {\n" + "    var ab = 0;\n" + "    ab += '-';\n" + "    alert(ab);\n" + "}", "function f () {\n" + "    alert('0-');\n" + "}"); 
 } 


public void testIssue724399() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel.ADVANCED_OPTIMIZATIONS.setOptionsForCompilationLevel(options); 
     String code = "isFunction = function(functionToCheck) {" + "  var getType = {};" + "  return functionToCheck && " + "      getType.toString.apply(functionToCheck) === " + "     '[object Function]';" + "};"; 
     String result = "isFunction=function(a){var b={};" + "return a&&\"[object Function]\"===b.b.a(a)}"; 
     test(options, code, result); 
 } 


public void testCoalesceVariableNames420() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "function f() {var x = 3; var y = x; var z = y; return z;}"; 
     testSame(options, code); 
     options.coalesceVariableNames = true; 
     test(options, code, "function f() {var x = 3; x = x; x = x; return x;}"); 
 } 


public void testExtractPrototypeMemberDeclarations474() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "var f = function() {};"; 
     String expected = "var a; var b = function() {}; a = b.prototype;"; 
     for (int i = 0; i < 10; i++) { 
         code += "f.prototype.a = " + i + ";"; 
         expected += "a.a = " + i + ";"; 
     } 
     testSame(options, code); 
     options.extractPrototypeMemberDeclarations = true; 
     options.variableRenaming = VariableRenamingPolicy.ALL; 
     test(options, code, expected); 
     options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC; 
     options.variableRenaming = VariableRenamingPolicy.OFF; 
     testSame(options, code); 
 } 


public void testConvertToDottedProperties488() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "function f() { return this['bar']; } f.prototype.bar = 3;"; 
     String expected = "function f() { return this.bar; } f.prototype.a = 3;"; 
     testSame(options, code); 
     options.convertToDottedProperties = true; 
     options.propertyRenaming = PropertyRenamingPolicy.ALL_UNQUOTED; 
     test(options, code, expected); 
 } 


public void testNameAnonymousFunctions551() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "var f = function() {};"; 
     testSame(options, code); 
     options.anonymousFunctionNaming = AnonymousFunctionNamingPolicy.MAPPED; 
     test(options, code, "var f = function $() {}"); 
     assertNotNull(lastCompiler.getResult().namedAnonFunctionMap); 
     options.anonymousFunctionNaming = AnonymousFunctionNamingPolicy.UNMAPPED; 
     test(options, code, "var f = function $f$() {}"); 
     assertNull(lastCompiler.getResult().namedAnonFunctionMap); 
 } 


public void testBrokenNameSpace594() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "var goog; goog.provide('i.am.on.a.Horse');" + "i.am.on.a.Horse = function() {};" + "i.am.on.a.Horse.prototype.x = function() {};" + "i.am.on.a.Boat.prototype.y = function() {}"; 
     options.closurePass = true; 
     options.collapseProperties = true; 
     options.smartNameRemoval = true; 
     test(options, code, ""); 
 } 


public void testBug1956277661() { 
     CompilerOptions options = createCompilerOptions(); 
     options.collapseProperties = true; 
     options.inlineVariables = true; 
     test(options, "var CONST = {}; CONST.bar = null;" + "function f(url) { CONST.bar = url; }", "var CONST$bar = null; function f(url) { CONST$bar = url; }"); 
 } 


public void testInferTypes675() { 
     CompilerOptions options = createCompilerOptions(); 
     options.inferTypes = true; 
     options.checkTypes = false; 
     options.closurePass = true; 
     test(options, CLOSURE_BOILERPLATE + "goog.provide('Foo'); /** @enum */ Foo = {a: 3};", TypeCheck.ENUM_NOT_CONSTANT); 
     assertTrue(lastCompiler.getErrorManager().getTypedPercent() == 0); 
     test(options, "/** @type {number} */ var n = window.name;", "var n = window.name;"); 
     assertTrue(lastCompiler.getErrorManager().getTypedPercent() == 0); 
 } 


public void testGoogDefineClass3716() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel level = CompilationLevel.ADVANCED_OPTIMIZATIONS; 
     level.setOptionsForCompilationLevel(options); 
     level.setTypeBasedOptimizationOptions(options); 
     WarningLevel warnings = WarningLevel.VERBOSE; 
     warnings.setOptionsForWarningLevel(options); 
     String code = "" + "var C = goog.defineClass(null, {\n" + "  /** @constructor */\n" + "  constructor: function () {\n" + "    /** @type {number} */\n" + "    this.someProperty = 1},\n" + "  /** @param {string} a */\n" + "  someMethod: function (a) {}\n" + "});" + "var x = new C();\n" + "x.someMethod(x.someProperty);\n"; 
     assertTrue(options.inlineProperties); 
     assertTrue(options.collapseProperties); 
     test(options, code, TypeValidator.TYPE_MISMATCH_WARNING); 
 } 


public void testVarDeclarationsIntoFor729() { 
     CompilerOptions options = createCompilerOptions(); 
     options.collapseVariableDeclarations = false; 
     String code = "var a = 1; for (var b = 2; ;) {}"; 
     testSame(options, code); 
     options.collapseVariableDeclarations = true; 
     test(options, code, "for (var a = 1, b = 2; ;) {}"); 
 } 


public void testGoogDefineClass1811() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel level = CompilationLevel.ADVANCED_OPTIMIZATIONS; 
     level.setOptionsForCompilationLevel(options); 
     level.setTypeBasedOptimizationOptions(options); 
     String code = "" + "var ns = {};\n" + "ns.C = goog.defineClass(null, {\n" + "  /** @constructor */\n" + "  constructor: function () {this.someProperty = 1}\n" + "});\n" + "alert(new ns.C().someProperty + new ns.C().someProperty);\n"; 
     assertTrue(options.inlineProperties); 
     assertTrue(options.collapseProperties); 
     test(options, code, "alert(2);"); 
 } 


public void testCompilerDoesNotBlowUpIfUndefinedSymbols867() { 
     CompilerOptions options = createCompilerOptions(); 
     options.checkSymbols = true; 
     options.setWarningLevel(DiagnosticGroup.forType(VarCheck.UNDEFINED_VAR_ERROR), CheckLevel.OFF); 
     testSame(options, "var x = {foo: y};"); 
 } 


public void testChainedCalls914() { 
     CompilerOptions options = createCompilerOptions(); 
     options.chainCalls = true; 
     test(options, "/** @constructor */ function Foo() {} " + "Foo.prototype.bar = function() { return this; }; " + "var f = new Foo();" + "f.bar(); " + "f.bar(); ", "function Foo() {} " + "Foo.prototype.bar = function() { return this; }; " + "var f = new Foo();" + "f.bar().bar();"); 
 } 


public void testLanguageMode957() { 
     CompilerOptions options = createCompilerOptions(); 
     options.setLanguageIn(LanguageMode.ECMASCRIPT3); 
     String code = "var a = {get f(){}}"; 
     Compiler compiler = compile(options, code); 
     checkUnexpectedErrorsOrWarnings(compiler, 1); 
     assertEquals("JSC_PARSE_ERROR. Parse error. " + "getters are not supported in older versions of JS. " + "If you are targeting newer versions of JS, " + "set the appropriate language_in option. " + "at i0 line 1 : 0", compiler.getErrors()[0].toString()); 
     options.setLanguageIn(LanguageMode.ECMASCRIPT5); 
     testSame(options, code); 
     options.setLanguageIn(LanguageMode.ECMASCRIPT5_STRICT); 
     testSame(options, code); 
 } 


public void testFoldLocals71003() { 
     CompilerOptions options = createCompilerOptions(); 
     options.foldConstants = true; 
     String code = "" + "function InternalWidget(){return [];}" + "Array.prototype.internalGo = function (){this.x = 2};" + "InternalWidget().internalGo();"; 
     testSame(options, code); 
     options.computeFunctionSideEffects = true; 
     String optimized = "" + "function InternalWidget(){return [];}" + "Array.prototype.internalGo = function (){this.x = 2};"; 
     test(options, code, optimized); 
 } 


public void testBug24101221009() { 
     CompilerOptions options = createCompilerOptions(); 
     options.generateExports = true; 
     options.closurePass = true; 
     test(options, "var goog = {};" + "function F() {}" + "/** @export */ function G() { goog.base(this); } " + "goog.inherits(G, F);", "var goog = {};" + "function F() {}" + "function G() { F.call(this); } " + "goog.inherits(G, F); goog.exportSymbol('G', G);"); 
 } 


public void testAlwaysRunSafetyCheck1075() { 
     CompilerOptions options = createCompilerOptions(); 
     options.checkSymbols = false; 
     options.customPasses = ArrayListMultimap.create(); 
     options.customPasses.put(CustomPassExecutionTime.BEFORE_OPTIMIZATIONS, new CompilerPass() { 
  
         @Override 
         public void process(Node externs, Node root) { 
             Node var = root.getLastChild().getFirstChild(); 
             assertEquals(Token.VAR, var.getType()); 
             var.detachFromParent(); 
         } 
     }); 
     try { 
         test(options, "var x = 3; function f() { return x + z; }", "function f() { return x + z; }"); 
         fail("Expected run-time exception"); 
     } catch (RuntimeException e) { 
         assertTrue(e.getMessage().indexOf("Unexpected variable x") != -1); 
     } 
 } 


public void testIncompleteFunction21079() { 
     CompilerOptions options = createCompilerOptions(); 
     options.ideMode = true; 
     DiagnosticType[] warnings = new DiagnosticType[] { RhinoErrorReporter.PARSE_ERROR, RhinoErrorReporter.PARSE_ERROR, RhinoErrorReporter.PARSE_ERROR, RhinoErrorReporter.PARSE_ERROR, RhinoErrorReporter.PARSE_ERROR, RhinoErrorReporter.PARSE_ERROR }; 
     test(options, new String[] { "function hi" }, new String[] { "function hi() {}" }, warnings); 
 } 


public void testSuppressEs5StrictWarning1080() { 
     CompilerOptions options = createCompilerOptions(); 
     options.setWarningLevel(DiagnosticGroups.ES5_STRICT, CheckLevel.WARNING); 
     test(options, "/** @suppress{es5Strict} */\n" + "function f() { var arguments; }", "function f() {}"); 
 } 


public void testRenameLabels1107() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "longLabel: for(;true;) { break longLabel; }"; 
     String expected = "a: for(;true;) { break a; }"; 
     testSame(options, code); 
     options.labelRenaming = true; 
     test(options, code, expected); 
 } 


public void testIssue901112() { 
     CompilerOptions options = createCompilerOptions(); 
     options.foldConstants = true; 
     options.inlineVariables = true; 
     options.removeDeadCode = true; 
     test(options, "var x; x && alert(1);", ""); 
 } 


public void testRenamePrefix1130() { 
     String code = "var x = {}; function f(y) {}"; 
     CompilerOptions options = createCompilerOptions(); 
     options.renamePrefix = "G_"; 
     options.variableRenaming = VariableRenamingPolicy.ALL; 
     test(options, code, "var G_={}; function G_a(a) {}"); 
 } 


public void testExportTestFunctionsOn1285() { 
     CompilerOptions options = createCompilerOptions(); 
     options.exportTestFunctions = true; 
     test(options, "function testFoo1286() {}", "/** @export */ function testFoo1287() {}" + "goog.exportSymbol('testFoo', testFoo);"); 
 } 


public void testPropertyRenaming1358() { 
     CompilerOptions options = createCompilerOptions(); 
     options.propertyAffinity = true; 
     String code = "function f() { return this.foo + this['bar'] + this.Baz; }" + "f.prototype.bar = 3; f.prototype.Baz = 3;"; 
     String heuristic = "function f() { return this.foo + this['bar'] + this.a; }" + "f.prototype.bar = 3; f.prototype.a = 3;"; 
     String aggHeuristic = "function f() { return this.foo + this['b'] + this.a; } " + "f.prototype.b = 3; f.prototype.a = 3;"; 
     String all = "function f() { return this.b + this['bar'] + this.a; }" + "f.prototype.c = 3; f.prototype.a = 3;"; 
     testSame(options, code); 
     options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC; 
     test(options, code, heuristic); 
     options.propertyRenaming = PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC; 
     test(options, code, aggHeuristic); 
     options.propertyRenaming = PropertyRenamingPolicy.ALL_UNQUOTED; 
     test(options, code, all); 
 } 


public void testOptimizeArgumentsArray1361() { 
     String code = "function f() { return arguments[0]; }"; 
     CompilerOptions options = createCompilerOptions(); 
     testSame(options, code); 
     options.optimizeArgumentsArray = true; 
     String argName = "JSCompiler_OptimizeArgumentsArray_p0"; 
     test(options, code, "function f(" + argName + ") { return " + argName + "; }"); 
 } 


public void testExtraAnnotationNames1415() { 
     CompilerOptions options = createCompilerOptions(); 
     options.setExtraAnnotationNames(Sets.newHashSet("TagA", "TagB")); 
     test(options, "/** @TagA */ var f = new Foo(); /** @TagB */ f.bar();", "var f = new Foo(); f.bar();"); 
 } 


public void testTightenTypesWithoutTypeCheck1501() { 
     CompilerOptions options = createCompilerOptions(); 
     options.tightenTypes = true; 
     test(options, "", DefaultPassConfig.TIGHTEN_TYPES_WITHOUT_TYPE_CHECK); 
 } 


public void testNamelessParameter1538() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel.ADVANCED_OPTIMIZATIONS.setOptionsForCompilationLevel(options); 
     String code = "var impl_0;" + "$load($init());" + "function $load(){" + "  window['f'] = impl_0;" + "}" + "function $init() {" + "  impl_0 = {};" + "}"; 
     String result = "window.f = {};"; 
     test(options, code, result); 
 } 


public void testLanguageMode21584() { 
     CompilerOptions options = createCompilerOptions(); 
     options.setLanguageIn(LanguageMode.ECMASCRIPT3); 
     options.setWarningLevel(DiagnosticGroups.ES5_STRICT, CheckLevel.OFF); 
     String code = "var a  = 2; delete a;"; 
     testSame(options, code); 
     options.setLanguageIn(LanguageMode.ECMASCRIPT5); 
     testSame(options, code); 
     options.setLanguageIn(LanguageMode.ECMASCRIPT5_STRICT); 
     test(options, code, code, StrictModeCheck.DELETE_VARIABLE); 
 } 


public void testProcessDefinesAlwaysOn1601() { 
     test(createCompilerOptions(), "/** @define {boolean} */ var HI = true; HI = false;", "var HI = false;false;"); 
 } 


public void testSingletonGetter11608() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel.ADVANCED_OPTIMIZATIONS.setOptionsForCompilationLevel(options); 
     options.setCodingConvention(new ClosureCodingConvention()); 
     test(options, "/** @const */\n" + "var goog = goog || {};\n" + "goog.addSingletonGetter = function(ctor) {\n" + "  ctor.getInstance = function() {\n" + "    return ctor.instance_ || (ctor.instance_ = new ctor());\n" + "  };\n" + "};" + "function Foo() {}\n" + "goog.addSingletonGetter(Foo);" + "Foo.prototype.bar = 1;" + "function Bar() {}\n" + "goog.addSingletonGetter(Bar);" + "Bar.prototype.bar = 1;", ""); 
 } 


public void testSuppressCastWarning1643() { 
     CompilerOptions options = createCompilerOptions(); 
     options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING); 
     normalizeResults = true; 
     test(options, "function f() { var xyz = /** @type {string} */ (0); }", DiagnosticType.warning("JSC_INVALID_CAST", "invalid cast")); 
     testSame(options, "/** @suppress{cast} */\n" + "function f() { var xyz = /** @type {string} */ (0); }"); 
 } 


public void testRenamePrefixNamespace1650() { 
     String code = "var x = {}; x.FOO = 5; x.bar = 3;"; 
     CompilerOptions options = createCompilerOptions(); 
     testSame(options, code); 
     options.collapseProperties = true; 
     options.renamePrefixNamespace = "_"; 
     test(options, code, "_.x$FOO = 5; _.x$bar = 3;"); 
 } 


public void testRenameVars21696() { 
     CompilerOptions options = createCompilerOptions(); 
     options.variableRenaming = VariableRenamingPolicy.ALL; 
     String code = "var abc = 3; function f() { window['a'] = 5; }"; 
     String noexport = "var a = 3;   function b() { window['a'] = 5; }"; 
     String export = "var b = 3;   function c() { window['a'] = 5; }"; 
     options.reserveRawExports = false; 
     test(options, code, noexport); 
     options.reserveRawExports = true; 
     test(options, code, export); 
 } 


public void testMissingReturn1705() { 
     String code = "/** @return {number} */ function f() { if (f) { return 3; } }"; 
     CompilerOptions options = createCompilerOptions(); 
     testSame(options, code); 
     options.checkMissingReturn = CheckLevel.ERROR; 
     testSame(options, code); 
     options.checkTypes = true; 
     test(options, code, CheckMissingReturn.MISSING_RETURN_STATEMENT); 
 } 


public void testTypeCheckingWithSyntheticBlocks1714() { 
     CompilerOptions options = createCompilerOptions(); 
     options.syntheticBlockStartMarker = "synStart"; 
     options.syntheticBlockEndMarker = "synEnd"; 
     options.checkTypes = true; 
     testSame(options, "/** @param {number} x */ function f(x) {}" + "function g() {" + " synStart('foo');" + " var progress = 1;" + " f(progress);" + " synEnd('foo');" + "}"); 
 } 


public void testProvidedNamespaceIsConst21739() { 
     CompilerOptions options = createCompilerOptions(); 
     options.closurePass = true; 
     options.inlineConstantVars = true; 
     options.collapseProperties = true; 
     test(options, "var goog = {}; goog.provide('foo.bar'); " + "function f() { foo.bar = {};}", "var foo$bar = {};" + "function f() { foo$bar = {}; }", ConstCheck.CONST_REASSIGNED_VALUE_ERROR); 
 } 


public void testConstructorCycle1756() { 
     CompilerOptions options = createCompilerOptions(); 
     options.checkTypes = true; 
     test(options, "/** @return {function()} */ var AsyncTestCase = function() {};\n" + "/**\n" + " * @constructor\n" + " */ Foo = /** @type {function(new:Foo)} */ (AyncTestCase());", RhinoErrorReporter.PARSE_ERROR); 
 } 


public void testSuppressCheckProvidesWarning1763() { 
     CompilerOptions options = createCompilerOptions(); 
     options.setWarningLevel(DiagnosticGroups.CHECK_PROVIDES, CheckLevel.WARNING); 
     options.setCheckProvides(CheckLevel.WARNING); 
     testSame(options, "/** @constructor\n" + " *  @suppress{checkProvides} */\n" + "function f() {}"); 
 } 


public void testRenamePrefixNamespaceProtectSideEffects1768() { 
     String code = "var x = null; try { +x.FOO; } catch (e) {}"; 
     CompilerOptions options = createCompilerOptions(); 
     testSame(options, code); 
     CompilationLevel.SIMPLE_OPTIMIZATIONS.setOptionsForCompilationLevel(options); 
     options.renamePrefixNamespace = "_"; 
     test(options, code, "_.x = null; try { +_.x.FOO; } catch (e) {}"); 
 } 


public void testFoldConstants1776() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "if (true) { window.foo(); }"; 
     testSame(options, code); 
     options.foldConstants = true; 
     test(options, code, "window.foo();"); 
 } 


public void testCheckProvidesWarning1783() { 
     CompilerOptions options = createCompilerOptions(); 
     options.setWarningLevel(DiagnosticGroups.CHECK_PROVIDES, CheckLevel.WARNING); 
     options.setCheckProvides(CheckLevel.WARNING); 
     test(options, "/** @constructor */\n" + "function f() { var arguments; }", DiagnosticType.warning("JSC_MISSING_PROVIDE", "missing goog.provide(''{0}'')")); 
 } 


public void testDeadAssignmentsElimination1804() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "function f() { var x = 3; 4; x = 5; return x; } f(); "; 
     testSame(options, code); 
     options.deadAssignmentElimination = true; 
     testSame(options, code); 
     options.removeUnusedVars = true; 
     test(options, code, "function f() { var x = 3; 4; x = 5; return x; } f();"); 
 } 


public void testInlineVariables1808() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "function foo() {} var x = 3; foo(x);"; 
     testSame(options, code); 
     options.inlineVariables = true; 
     test(options, code, "(function foo() {})(3);"); 
     options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC; 
     test(options, code, DefaultPassConfig.CANNOT_USE_PROTOTYPE_AND_VAR); 
 } 


public void testsyntheticBlockOnDeadAssignments1809() { 
     CompilerOptions options = createCompilerOptions(); 
     options.deadAssignmentElimination = true; 
     options.removeUnusedVars = true; 
     options.syntheticBlockStartMarker = "START"; 
     options.syntheticBlockEndMarker = "END"; 
     test(options, "var x; x = 1; START(); x = 1;END();x()", "var x; x = 1;{START();{x = 1}END()}x()"); 
 } 


public void testCollapseProperties21900() { 
     String code = "var x = {}; x.FOO = 5; x.bar = 3;"; 
     CompilerOptions options = createCompilerOptions(); 
     testSame(options, code); 
     options.collapseProperties = true; 
     options.collapseObjectLiterals = true; 
     test(options, code, "var x$FOO = 5; var x$bar = 3;"); 
 } 


public void testIssue7871901() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel level = CompilationLevel.SIMPLE_OPTIMIZATIONS; 
     level.setOptionsForCompilationLevel(options); 
     WarningLevel warnings = WarningLevel.DEFAULT; 
     warnings.setOptionsForWarningLevel(options); 
     String code = "" + "function some_function() {\n" + "  var fn1;\n" + "  var fn2;\n" + "\n" + "  if (any_expression) {\n" + "    fn2 = external_ref;\n" + "    fn1 = function (content) {\n" + "      return fn2();\n" + "    }\n" + "  }\n" + "\n" + "  return {\n" + "    method1: function () {\n" + "      if (fn1) fn1();\n" + "      return true;\n" + "    },\n" + "    method2: function () {\n" + "      return false;\n" + "    }\n" + "  }\n" + "}"; 
     String result = "" + "function some_function() {\n" + "  var a, b;\n" + "  any_expression && (b = external_ref, a = function(a) {\n" + "    return b()\n" + "  });\n" + "  return{method1:function() {\n" + "    a && a();\n" + "    return !0\n" + "  }, method2:function() {\n" + "    return !1\n" + "  }}\n" + "}\n" + ""; 
     test(options, code, result); 
 } 


public void testHiddenSideEffect1946() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel.ADVANCED_OPTIMIZATIONS.setOptionsForCompilationLevel(options); 
     options.setAliasExternals(true); 
     String code = "window.offsetWidth;"; 
     String result = "window.offsetWidth;"; 
     test(options, code, result); 
 } 


public void testReplaceCssNames1951() { 
     CompilerOptions options = createCompilerOptions(); 
     options.closurePass = true; 
     options.gatherCssNames = true; 
     test(options, "/** @define {boolean} */\n" + "var COMPILED = false;\n" + "goog.setCssNameMapping({'foo':'bar'});\n" + "function getCss() {\n" + "  return goog.getCssName('foo');\n" + "}", "var COMPILED = true;\n" + "function getCss() {\n" + "  return \"bar\";" + "}"); 
     assertEquals(ImmutableMap.of("foo", new Integer(1)), lastCompiler.getPassConfig().getIntermediateState().cssNames); 
 } 


public void testBug19623801977() { 
     CompilerOptions options = createCompilerOptions(); 
     options.collapseProperties = true; 
     options.inlineVariables = true; 
     options.generateExports = true; 
     test(options, CLOSURE_BOILERPLATE + "/** @export */ goog.CONSTANT = 1;" + "var x = goog.CONSTANT;", "(function() {})('goog.CONSTANT', 1);" + "var x = 1;"); 
 } 


public void testClosurePassPreservesJsDoc1993() { 
     CompilerOptions options = createCompilerOptions(); 
     options.checkTypes = true; 
     options.closurePass = true; 
     test(options, CLOSURE_BOILERPLATE + "goog.provide('Foo'); /** @constructor */ Foo = function() {};" + "var x = new Foo();", "var COMPILED=true;var goog={};goog.exportSymbol=function(){};" + "var Foo=function(){};var x=new Foo"); 
     test(options, CLOSURE_BOILERPLATE + "goog.provide('Foo'); /** @enum */ Foo = {a: 3};", TypeCheck.ENUM_NOT_CONSTANT); 
 } 


public void testNameAnonymousFunctionsWithVarRemoval1996() { 
     CompilerOptions options = createCompilerOptions(); 
     options.setRemoveUnusedVariables(CompilerOptions.Reach.LOCAL_ONLY); 
     options.setInlineVariables(true); 
     String code = "var f = function longName() {}; var g = function() {};" + "function longerName() {} var i = longerName;"; 
     test(options, code, "var f = function() {}; var g = function() {}; " + "var i = function() {};"); 
     options.anonymousFunctionNaming = AnonymousFunctionNamingPolicy.MAPPED; 
     test(options, code, "var f = function longName() {}; var g = function $() {};" + "var i = function longerName(){};"); 
     assertNotNull(lastCompiler.getResult().namedAnonFunctionMap); 
     options.anonymousFunctionNaming = AnonymousFunctionNamingPolicy.UNMAPPED; 
     test(options, code, "var f = function longName() {}; var g = function $g$() {};" + "var i = function longerName(){};"); 
     assertNull(lastCompiler.getResult().namedAnonFunctionMap); 
 } 


public void testProvidedNamespaceIsConst51998() { 
     CompilerOptions options = createCompilerOptions(); 
     options.closurePass = true; 
     options.inlineConstantVars = true; 
     options.collapseProperties = true; 
     test(options, "var goog = {}; goog.provide('foo.Bar'); " + "foo = {}; foo.Bar = {};", "var foo = {}; foo = {}; foo.Bar = {};"); 
 } 


public void testBug25926592046() { 
     CompilerOptions options = createCompilerOptions(); 
     options.closurePass = true; 
     options.checkTypes = true; 
     options.checkMissingGetCssNameLevel = CheckLevel.WARNING; 
     options.checkMissingGetCssNameBlacklist = "foo"; 
     test(options, "var goog = {};\n" + "/**\n" + " * @param {string} className\n" + " * @param {string=} opt_modifier\n" + " * @return {string}\n" + "*/\n" + "goog.getCssName = function(className, opt_modifier) {}\n" + "var x = goog.getCssName(123, 'a');", TypeValidator.TYPE_MISMATCH_WARNING); 
 } 


public void testCheckRequiresOn2054() { 
     CompilerOptions options = createCompilerOptions(); 
     options.checkRequires = CheckLevel.ERROR; 
     test(options, new String[] { "/** @constructor */ function Foo() {}", "new Foo();" }, CheckRequiresForConstructors.MISSING_REQUIRE_WARNING); 
 } 


public void testInlineGettersWithAmbiguate2059() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "/** @constructor */" + "function Foo() {}" + "/** @type {number} */ Foo.prototype.field;" + "Foo.prototype.getField = function() { return this.field; };" + "/** @constructor */" + "function Bar() {}" + "/** @type {string} */ Bar.prototype.field;" + "Bar.prototype.getField = function() { return this.field; };" + "new Foo().getField();" + "new Bar().getField();"; 
     testSame(options, code); 
     options.inlineGetters = true; 
     test(options, code, "function Foo() {}" + "Foo.prototype.field;" + "Foo.prototype.getField = function() { return this.field; };" + "function Bar() {}" + "Bar.prototype.field;" + "Bar.prototype.getField = function() { return this.field; };" + "new Foo().field;" + "new Bar().field;"); 
     options.checkTypes = true; 
     options.ambiguateProperties = true; 
     testSame(options, code); 
 } 


public void testAliasAllStrings2115() { 
     CompilerOptions options = createCompilerOptions(); 
     String code = "function f() { return 'a'; }"; 
     String expected = "var $$S_a = 'a'; function f() { return $$S_a; }"; 
     testSame(options, code); 
     options.aliasAllStrings = true; 
     test(options, code, expected); 
 } 


public void testCheckGlobalNames2147() { 
     CompilerOptions options = createCompilerOptions(); 
     options.checkGlobalNamesLevel = CheckLevel.ERROR; 
     test(options, "var x = {}; var y = x.z;", CheckGlobalNames.UNDEFINED_NAME_WARNING); 
 } 


public void testDisambiguateProperties2154() { 
     String code = "/** @constructor */ function Foo(){} Foo.prototype.bar = 3;" + "/** @constructor */ function Baz(){} Baz.prototype.bar = 3;"; 
     CompilerOptions options = createCompilerOptions(); 
     testSame(options, code); 
     options.disambiguateProperties = true; 
     options.checkTypes = true; 
     test(options, code, "function Foo(){} Foo.prototype.Foo_prototype$bar = 3;" + "function Baz(){} Baz.prototype.Baz_prototype$bar = 3;"); 
 } 


public void testBadBreakStatementInIdeMode2218() { 
     CompilerOptions options = createCompilerOptions(); 
     options.ideMode = true; 
     options.checkTypes = true; 
     test(options, "function f() { try { } catch(e) { break; } }", RhinoErrorReporter.PARSE_ERROR); 
 } 


public void testIssue7302227() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel.ADVANCED_OPTIMIZATIONS.setOptionsForCompilationLevel(options); 
     String code = "/** @constructor */function A() {this.foo = 0; Object.seal(this);}\n" + "/** @constructor */function B() {this.a = new A();}\n" + "B.prototype.dostuff = function() {this.a.foo++;alert('hi');}\n" + "new B().dostuff();\n"; 
     test(options, code, "function a(){this.b=0;Object.seal(this)}" + "(new function(){this.a=new a}).a.b++;" + "alert(\"hi\")"); 
     options.removeUnusedClassProperties = true; 
     test(options, code, "function a(){Object.seal(this)}" + "(new function(){this.a=new a}).a.b++;" + "alert(\"hi\")"); 
 } 


public void testCheckSymbolsOn2276() { 
     CompilerOptions options = createCompilerOptions(); 
     options.checkSymbols = true; 
     test(options, "x = 3;", VarCheck.UNDEFINED_VAR_ERROR); 
 } 


public void testMarkNoSideEffects2304() { 
     String testCode = "noSideEffects();"; 
     CompilerOptions options = createCompilerOptions(); 
     options.removeDeadCode = true; 
     testSame(options, testCode); 
     options.markNoSideEffectCalls = true; 
     test(options, testCode, ""); 
 } 


public void testExpose2404() { 
     CompilerOptions options = createCompilerOptions(); 
     CompilationLevel.ADVANCED_OPTIMIZATIONS.setOptionsForCompilationLevel(options); 
     test(options, "var x = {eeny: 1, /** @expose */ meeny: 2};" + "/** @constructor */ var Foo = function() {};" + "/** @expose */  Foo.prototype.miny = 3;" + "Foo.prototype.moe = 4;" + "function moe(a, b) { return a.meeny + b.miny; }" + "window['x'] = x;" + "window['Foo'] = Foo;" + "window['moe'] = moe;", "function a(){}" + "a.prototype.miny=3;" + "window.x={a:1,meeny:2};" + "window.Foo=a;" + "window.moe=function(b,c){" + "  return b.meeny+c.miny" + "}"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // This tests that the TypedScopeCreator is memoized so that it only creates a
  // Scope object once for each scope. If, when type inference requests a scope,
  // it creates a new one, then multiple JSType objects end up getting created
  // for the same local type, and ambiguate will rename the last statement to
  // o.a(o.a, o.a), which is bad.
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Make sure that if we change variables which are constant to have
  // $$constant appended to their names, we remove that tag before
  // we finish.
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
// Defects4J: flaky method
//   public void testManyAdds() {
//     CompilerOptions options = createCompilerOptions();
//     CompilationLevel level = CompilationLevel.SIMPLE_OPTIMIZATIONS;
//     level.setOptionsForCompilationLevel(options);
//     WarningLevel warnings = WarningLevel.VERBOSE;
//     warnings.setOptionsForWarningLevel(options);
// 
//     int numAdds = 4750;
//     StringBuilder original = new StringBuilder("var x = 0");
//     for (int i = 0; i < numAdds; i++) {
//       original.append(" + 1");
//     }
//     original.append(";");
//     test(options, original.toString(), "var x = " + numAdds + ";");
//   }

  /** Creates a CompilerOptions object with google coding conventions. */
  @Override
  protected CompilerOptions createCompilerOptions() {
    CompilerOptions options = new CompilerOptions();
    options.setCodingConvention(new GoogleCodingConvention());
    return options;
  }
}
