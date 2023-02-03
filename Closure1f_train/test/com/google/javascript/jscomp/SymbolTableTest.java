/*
 * Copyright 2011 The Closure Compiler Authors.
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

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.SymbolTable.Reference;
import com.google.javascript.jscomp.SymbolTable.Symbol;
import com.google.javascript.jscomp.SymbolTable.SymbolScope;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Token;

import junit.framework.TestCase;

import java.util.List;
import java.util.Set;

/**
 * @author nicksantos@google.com (Nick Santos)
 */
public class SymbolTableTest extends TestCase {

  private static final String EXTERNS = CompilerTypeTestCase.DEFAULT_EXTERNS +
      "\nfunction customExternFn(customExternArg) {}";

  private CompilerOptions options;

  @Override
  public void setUp() throws Exception {
    super.setUp();

    options = new CompilerOptions();
    options.setCodingConvention(new ClosureCodingConvention());
    CompilationLevel.SIMPLE_OPTIMIZATIONS.setOptionsForCompilationLevel(
        options);
    WarningLevel.VERBOSE.setOptionsForWarningLevel(options);
    options.ideMode = true;
  }


public void testRemovalOfNamespacedReferencesOfProperties59() throws Exception { 
     SymbolTable table = createSymbolTable("/** @constructor */ var DomHelper = function(){};" + "/** method */ DomHelper.method = function() {};"); 
     Symbol domHelper = getGlobalVar(table, "DomHelper"); 
     assertNotNull(domHelper); 
     Symbol domHelperNamespacedMethod = getGlobalVar(table, "DomHelper.method"); 
     assertEquals("method", domHelperNamespacedMethod.getName()); 
     Symbol domHelperMethod = domHelper.getPropertyScope().getSlot("method"); 
     assertNotNull(domHelperMethod); 
 } 


public void testMethodReferencesMissingTypeInfo253() throws Exception { 
     SymbolTable table = createSymbolTable("/**\n" + " * @constructor\n" + " * @extends {Missing}\n" + " */ var DomHelper = function(){};\n" + "/** method */ DomHelper.prototype.method = function() {\n" + "  this.method();\n" + "};\n" + "function f() { " + "  (new DomHelper()).method();\n" + "};"); 
     Symbol method = getGlobalVar(table, "DomHelper.prototype.method"); 
     assertEquals(3, Iterables.size(table.getReferences(method))); 
 } 


public void testPrototypeReferences5285() throws Exception { 
     SymbolTable table = createSymbolTable("var goog = {}; /** @constructor */ goog.Foo = function() {};"); 
     Symbol fooPrototype = getGlobalVar(table, "goog.Foo.prototype"); 
     assertNotNull(fooPrototype); 
     List<Reference> refs = table.getReferenceList(fooPrototype); 
     assertEquals(1, refs.size()); 
     assertEquals(Token.GETPROP, refs.get(0).getNode().getType()); 
     assertEquals(refs.get(0).getNode(), table.getReferenceList(getGlobalVar(table, "goog.Foo")).get(0).getNode()); 
 } 


public void testMissingConstructorTag490() { 
     SymbolTable table = createSymbolTable("function F() {" + "  this.field1 = 3;" + "}" + "F.prototype.method1 = function() {" + "  this.field1 = 5;" + "};" + "(new F()).method1();"); 
     assertNull(getGlobalVar(table, "F.prototype.field1")); 
     Symbol sym = getGlobalVar(table, "F.prototype.method1"); 
     assertEquals(1, table.getReferenceList(sym).size()); 
 } 


public void testFieldReferences643() throws Exception { 
     SymbolTable table = createSymbolTable("/** @constructor */ var DomHelper = function(){" + "  /** @type {number} */ this.field = 3;" + "};" + "function f() { " + "  return (new DomHelper()).field + (new DomHelper()).field; };"); 
     Symbol field = getGlobalVar(table, "DomHelper.prototype.field"); 
     assertEquals(3, Iterables.size(table.getReferences(field))); 
 } 


public void testDeclarationDisagreement784() { 
     SymbolTable table = createSymbolTable("/** @const */ var goog = goog || {};\n" + "/** @param {!Function} x */\n" + "goog.addSingletonGetter2 = function(x) {};\n" + "/** Wakka wakka wakka */\n" + "goog.addSingletonGetter = goog.addSingletonGetter2;\n" + "/** @param {!Function} x */\n" + "goog.addSingletonGetter = function(x) {};\n"); 
     Symbol method = getGlobalVar(table, "goog.addSingletonGetter"); 
     List<Reference> refs = table.getReferenceList(method); 
     assertEquals(2, refs.size()); 
     assertEquals(7, method.getDeclaration().getNode().getLineno()); 
     assertEquals(5, refs.get(1).getNode().getLineno()); 
 } 


public void testGoogRequireReferences899() throws Exception { 
     SymbolTable table = createSymbolTable("var goog = {};" + "goog.provide = function() {};" + "goog.require = function() {};" + "goog.provide('goog.dom');" + "goog.require('goog.dom');"); 
     Symbol goog = getGlobalVar(table, "goog"); 
     assertNotNull(goog); 
     assertEquals(8, Iterables.size(table.getReferences(goog))); 
 } 


public void testGlobalVarInExterns900() throws Exception { 
     SymbolTable table = createSymbolTable("customExternFn(1);"); 
     Symbol fn = getGlobalVar(table, "customExternFn"); 
     List<Reference> refs = table.getReferenceList(fn); 
     assertEquals(2, refs.size()); 
     SymbolScope scope = table.getEnclosingScope(refs.get(0).getNode()); 
     assertTrue(scope.isGlobalScope()); 
     assertEquals(SymbolTable.GLOBAL_THIS, table.getSymbolForScope(scope).getName()); 
 } 


public void testReferencesInJSDocType1030() { 
     SymbolTable table = createSymbolTable("/** @constructor */ function Foo() {}\n" + "/** @type {Foo} */ var x;\n" + "/** @param {Foo} x */ function f(x) {}\n" + "/** @return {function(): Foo} */ function g() {}\n" + "/**\n" + " * @constructor\n" + " * @extends {Foo}\n" + " */ function Sub() {}"); 
     Symbol foo = getGlobalVar(table, "Foo"); 
     assertNotNull(foo); 
     List<Reference> refs = table.getReferenceList(foo); 
     assertEquals(5, refs.size()); 
     assertEquals(1, refs.get(0).getNode().getLineno()); 
     assertEquals(29, refs.get(0).getNode().getCharno()); 
     assertEquals(3, refs.get(0).getNode().getLength()); 
     assertEquals(2, refs.get(1).getNode().getLineno()); 
     assertEquals(11, refs.get(1).getNode().getCharno()); 
     assertEquals(3, refs.get(2).getNode().getLineno()); 
     assertEquals(12, refs.get(2).getNode().getCharno()); 
     assertEquals(4, refs.get(3).getNode().getLineno()); 
     assertEquals(25, refs.get(3).getNode().getCharno()); 
     assertEquals(7, refs.get(4).getNode().getLineno()); 
     assertEquals(13, refs.get(4).getNode().getCharno()); 
 } 


public void testTypeCheckingOff1063() { 
     options = new CompilerOptions(); 
     SymbolTable table = createSymbolTable("/** @contstructor */" + "function F() {" + "  this.field1 = 3;" + "}" + "F.prototype.method1 = function() {" + "  this.field1 = 5;" + "};" + "(new F()).method1();"); 
     assertNull(getGlobalVar(table, "F.prototype.field1")); 
     assertNull(getGlobalVar(table, "F.prototype.method1")); 
     Symbol sym = getGlobalVar(table, "F"); 
     assertEquals(3, table.getReferenceList(sym).size()); 
 } 


public void testLocalVarInExterns1280() throws Exception { 
     SymbolTable table = createSymbolTable(""); 
     Symbol arg = getLocalVar(table, "customExternArg"); 
     List<Reference> refs = table.getReferenceList(arg); 
     assertEquals(1, refs.size()); 
     Symbol fn = getGlobalVar(table, "customExternFn"); 
     SymbolScope scope = table.getEnclosingScope(refs.get(0).getNode()); 
     assertFalse(scope.isGlobalScope()); 
     assertEquals(fn, table.getSymbolForScope(scope)); 
 } 


public void testPrototypeReferences1293() throws Exception { 
     SymbolTable table = createSymbolTable("/** @constructor */ function DomHelper() {}" + "DomHelper.prototype.method = function() {};"); 
     Symbol prototype = getGlobalVar(table, "DomHelper.prototype"); 
     assertNotNull(prototype); 
     List<Reference> refs = table.getReferenceList(prototype); 
     assertEquals(refs.toString(), 2, refs.size()); 
 } 


public void testPrototypeReferences41453() throws Exception { 
     SymbolTable table = createSymbolTable("/** @constructor */ function Foo() {}" + "Foo.prototype = {bar: 3}"); 
     Symbol fooPrototype = getGlobalVar(table, "Foo.prototype"); 
     assertNotNull(fooPrototype); 
     List<Reference> refs = Lists.newArrayList(table.getReferences(fooPrototype)); 
     assertEquals(1, refs.size()); 
     assertEquals(Token.GETPROP, refs.get(0).getNode().getType()); 
     assertEquals("Foo.prototype", refs.get(0).getNode().getQualifiedName()); 
 } 


public void testSymbolsForType1557() throws Exception { 
     SymbolTable table = createSymbolTable("function random() { return 1; }" + "/** @constructor */ function Foo() {}" + "/** @constructor */ function Bar() {}" + "var x = random() ? new Foo() : new Bar();"); 
     Symbol x = getGlobalVar(table, "x"); 
     Symbol foo = getGlobalVar(table, "Foo"); 
     Symbol bar = getGlobalVar(table, "Bar"); 
     Symbol fooPrototype = getGlobalVar(table, "Foo.prototype"); 
     Symbol fn = getGlobalVar(table, "Function"); 
     Symbol obj = getGlobalVar(table, "Object"); 
     assertEquals(Lists.newArrayList(foo, bar), table.getAllSymbolsForTypeOf(x)); 
     assertEquals(Lists.newArrayList(fn), table.getAllSymbolsForTypeOf(foo)); 
     assertEquals(Lists.newArrayList(foo), table.getAllSymbolsForTypeOf(fooPrototype)); 
     assertEquals(foo, table.getSymbolDeclaredBy(foo.getType().toMaybeFunctionType())); 
 } 


public void testGlobalThisPropertyReferences1592() throws Exception { 
     SymbolTable table = createSymbolTable("/** @constructor */ function Foo() {} this.Foo;"); 
     Symbol foo = getGlobalVar(table, "Foo"); 
     assertNotNull(foo); 
     List<Reference> refs = table.getReferenceList(foo); 
     assertEquals(2, refs.size()); 
 } 


public void testGlobalRichObjectReference1793() throws Exception { 
     SymbolTable table = createSymbolTable("/** @constructor */\n" + "function A(){};\n" + "/** @type {?A} */ A.prototype.b;\n" + "/** @type {A} */ var a = new A();\n" + "function g() {\n" + "  return a.b ? 'x' : 'y';\n" + "}\n" + "(function() {\n" + "  var x; if (x) { x = a.b.b; } else { x = a.b.c; }\n" + "  return x;\n" + "})();\n"); 
     Symbol ab = getGlobalVar(table, "a.b"); 
     assertNull(ab); 
     Symbol propB = getGlobalVar(table, "A.prototype.b"); 
     assertNotNull(propB); 
     assertEquals(5, table.getReferenceList(propB).size()); 
 } 


public void testMethodInAnonObject11959() throws Exception { 
     SymbolTable table = createSymbolTable("var a = {}; a.b = {}; a.b.c = function() {};"); 
     Symbol a = getGlobalVar(table, "a"); 
     Symbol ab = getGlobalVar(table, "a.b"); 
     Symbol abc = getGlobalVar(table, "a.b.c"); 
     assertNotNull(abc); 
     assertEquals(1, table.getReferenceList(abc).size()); 
     assertEquals("{b: {c: function (): undefined}}", a.getType().toString()); 
     assertEquals("{c: function (): undefined}", ab.getType().toString()); 
     assertEquals("function (): undefined", abc.getType().toString()); 
 } 


public void testInnerEnum2104() throws Exception { 
     SymbolTable table = createSymbolTable("var goog = {}; goog.ui = {};" + "  /** @constructor */\n" + "goog.ui.Zippy = function() {};\n" + "/** @enum {string} */\n" + "goog.ui.Zippy.EventType = { TOGGLE: 'toggle' };\n"); 
     Symbol eventType = getGlobalVar(table, "goog.ui.Zippy.EventType"); 
     assertNotNull(eventType); 
     assertTrue(eventType.getType().isEnumType()); 
     Symbol toggle = getGlobalVar(table, "goog.ui.Zippy.EventType.TOGGLE"); 
     assertNotNull(toggle); 
 } 


public void testGlobalThisReferences32289() throws Exception { 
     SymbolTable table = createSymbolTable("this.foo = {}; this.foo.bar = {};"); 
     Symbol global = getGlobalVar(table, "*global*"); 
     assertNotNull(global); 
     List<Reference> refs = table.getReferenceList(global); 
     assertEquals(2, refs.size()); 
 } 


public void testMultipleExtends2308() { 
     SymbolTable table = createSymbolTable("/** @const */ var goog = goog || {};\n" + "goog.inherits = function(x, y) {};\n" + "/** @constructor */\n" + "goog.A = function() { this.fieldA = this.constructor; };\n" + "/** @constructor */ goog.A.FooA = function() {};\n" + "/** @return {void} */ goog.A.prototype.methodA = function() {};\n" + "/**\n" + " * @constructor\n" + " * @extends {goog.A}\n" + " */\n" + "goog.B = function() { this.fieldB = this.constructor; };\n" + "goog.inherits(goog.B, goog.A);\n" + "/** @return {void} */ goog.B.prototype.methodB = function() {};\n" + "/**\n" + " * @constructor\n" + " * @extends {goog.A}\n" + " */\n" + "goog.B2 = function() { this.fieldB = this.constructor; };\n" + "goog.inherits(goog.B2, goog.A);\n" + "/** @constructor */ goog.B2.FooB = function() {};\n" + "/** @return {void} */ goog.B2.prototype.methodB = function() {};\n" + "/**\n" + " * @constructor\n" + " * @extends {goog.B}\n" + " */\n" + "goog.C = function() { this.fieldC = this.constructor; };\n" + "goog.inherits(goog.C, goog.B);\n" + "/** @constructor */ goog.C.FooC = function() {};\n" + "/** @return {void} */ goog.C.prototype.methodC = function() {};\n"); 
     Symbol bCtor = getGlobalVar(table, "goog.B.prototype.constructor"); 
     assertNotNull(bCtor); 
     List<Reference> bRefs = table.getReferenceList(bCtor); 
     assertEquals(2, bRefs.size()); 
     assertEquals(11, bCtor.getDeclaration().getNode().getLineno()); 
     Symbol cCtor = getGlobalVar(table, "goog.C.prototype.constructor"); 
     assertNotNull(cCtor); 
     List<Reference> cRefs = table.getReferenceList(cCtor); 
     assertEquals(2, cRefs.size()); 
     assertEquals(26, cCtor.getDeclaration().getNode().getLineno()); 
 } 


public void testJSDocOnlySymbol2342() throws Exception { 
     SymbolTable table = createSymbolTable("/**\n" + " * @param {number} x\n" + " * @param y\n" + " */\n" + "var a;"); 
     Symbol x = getDocVar(table, "x"); 
     assertNotNull(x); 
     assertEquals("number", x.getType().toString()); 
     assertEquals(1, table.getReferenceList(x).size()); 
     Symbol y = getDocVar(table, "y"); 
     assertNotNull(x); 
     assertEquals(null, y.getType()); 
     assertEquals(1, table.getReferenceList(y).size()); 
 } 


public void testGoogScopeReferences2344() throws Exception { 
     SymbolTable table = createSymbolTable("var goog = {};" + "goog.scope = function() {};" + "goog.scope(function() {});"); 
     Symbol googScope = getGlobalVar(table, "goog.scope"); 
     assertNotNull(googScope); 
     assertEquals(2, Iterables.size(table.getReferences(googScope))); 
 } 


public void testIncompleteNamespacedReferences2367() throws Exception { 
     SymbolTable table = createSymbolTable("/** @constructor */\n" + "goog.dom.DomHelper = function(){};\n" + "var y = goog.dom.DomHelper;\n"); 
     Symbol goog = getGlobalVar(table, "goog"); 
     assertNotNull(goog); 
     assertEquals(2, table.getReferenceList(goog).size()); 
     Symbol googDom = getGlobalVar(table, "goog.dom"); 
     assertNotNull(googDom); 
     assertEquals(2, table.getReferenceList(googDom).size()); 
     Symbol googDomHelper = getGlobalVar(table, "goog.dom.DomHelper"); 
     assertNotNull(googDomHelper); 
     assertEquals(2, Iterables.size(table.getReferences(googDomHelper))); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertSymmetricOrdering(
      Ordering<Symbol> ordering, Symbol first, Symbol second) {
    assertTrue(ordering.compare(first, first) == 0);
    assertTrue(ordering.compare(second, second) == 0);
    assertTrue(ordering.compare(first, second) < 0);
    assertTrue(ordering.compare(second, first) > 0);
  }

  private Symbol getGlobalVar(SymbolTable table, String name) {
    return table.getGlobalScope().getQualifiedSlot(name);
  }

  private Symbol getDocVar(SymbolTable table, String name) {
    for (Symbol sym : table.getAllSymbols()) {
      if (sym.isDocOnlyParameter() && sym.getName().equals(name)) {
        return sym;
      }
    }
    return null;
  }

  private Symbol getLocalVar(SymbolTable table, String name) {
    for (SymbolScope scope : table.getAllScopes()) {
      if (!scope.isGlobalScope() && scope.isLexicalScope() &&
          scope.getQualifiedSlot(name) != null) {
        return scope.getQualifiedSlot(name);
      }
    }
    return null;
  }

  /** Returns all non-extern vars. */
  private List<Symbol> getVars(SymbolTable table) {
    List<Symbol> result = Lists.newArrayList();
    for (Symbol symbol : table.getAllSymbols()) {
      if (symbol.getDeclaration() != null &&
          !symbol.getDeclaration().getNode().isFromExterns()) {
        result.add(symbol);
      }
    }
    return result;
  }

  private SymbolTable createSymbolTable(String input) {
    List<SourceFile> inputs = Lists.newArrayList(
        SourceFile.fromCode("in1", input));
    List<SourceFile> externs = Lists.newArrayList(
        SourceFile.fromCode("externs1", EXTERNS));

    Compiler compiler = new Compiler();
    compiler.compile(externs, inputs, options);
    return assertSymbolTableValid(compiler.buildKnownSymbolTable());
  }

  /**
   * Asserts that the symbol table meets some invariants.
   * Returns the same table for easy chaining.
   */
  private SymbolTable assertSymbolTableValid(SymbolTable table) {
    Set<Symbol> allSymbols = Sets.newHashSet(table.getAllSymbols());
    for (Symbol sym : table.getAllSymbols()) {
      // Make sure that grabbing the symbol's scope and looking it up
      // again produces the same symbol.
      assertEquals(sym, table.getScope(sym).getQualifiedSlot(sym.getName()));

      for (Reference ref : table.getReferences(sym)) {
        // Make sure that the symbol and reference are mutually linked.
        assertEquals(sym, ref.getSymbol());
      }

      Symbol scope = table.getSymbolForScope(table.getScope(sym));
      assertTrue(
          "The symbol's scope is a zombie scope that shouldn't exist.\n" +
          "Symbol: " + sym + "\n" +
          "Scope: " + table.getScope(sym),
          scope == null || allSymbols.contains(scope));
    }

    // Make sure that the global "this" is declared at the first input root.
    Symbol global = getGlobalVar(table, SymbolTable.GLOBAL_THIS);
    assertNotNull(global);
    assertNotNull(global.getDeclaration());
    assertEquals(Token.SCRIPT, global.getDeclaration().getNode().getType());

    List<Reference> globalRefs = table.getReferenceList(global);

    // The main reference list should never contain the synthetic declaration
    // for the global root.
    assertFalse(globalRefs.contains(global.getDeclaration()));

    return table;
  }
}
