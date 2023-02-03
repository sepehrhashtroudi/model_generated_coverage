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

import static com.google.javascript.jscomp.TypedScopeCreator.CTOR_INITIALIZER;
import static com.google.javascript.jscomp.TypedScopeCreator.IFACE_INITIALIZER;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.testing.Asserts;

import java.util.Deque;

/**
 * Tests for {@link TypedScopeCreator} and {@link TypeInference}. Admittedly,
 * the name is a bit of a misnomer.
 * @author nicksantos@google.com (Nick Santos)
 */
public class TypedScopeCreatorTest extends CompilerTestCase {

  private JSTypeRegistry registry;
  private Scope globalScope;
  private Scope lastLocalScope;

  @Override
  public int getNumRepetitions() {
    return 1;
  }

  private final Callback callback = new AbstractPostOrderCallback() {
    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      Scope s = t.getScope();
      if (s.isGlobal()) {
        globalScope = s;
      } else {
        lastLocalScope = s;
      }
    }
  };

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    registry = compiler.getTypeRegistry();
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        MemoizedScopeCreator scopeCreator =
            new MemoizedScopeCreator(new TypedScopeCreator(compiler));
        Scope topScope = scopeCreator.createScope(root.getParent(), null);
        (new TypeInferencePass(
            compiler, compiler.getReverseAbstractInterpreter(),
            topScope, scopeCreator)).process(externs, root);
        NodeTraversal t = new NodeTraversal(
            compiler, callback, scopeCreator);
        t.traverseRoots(Lists.newArrayList(externs, root));
      }
    };
  }


public void testCollectedFunctionStub94() { 
     testSame("/** @constructor */ function f() { " + "  /** @return {number} */ this.foo;" + "}" + "var x = new f();"); 
     ObjectType x = (ObjectType) findNameType("x", globalScope); 
     assertEquals("f", x.toString()); 
     assertTrue(x.hasProperty("foo")); 
     assertEquals("function (this:f): number", x.getPropertyType("foo").toString()); 
     assertFalse(x.isPropertyTypeInferred("foo")); 
 } 


public void testEnumAlias98() { 
     testSame("/** @enum */ var Foo = {BAR: 1}; " + "/** @enum */ var FooAlias = Foo; var f = FooAlias;"); 
     assertEquals("Foo.<number>", registry.getType("FooAlias").toString()); 
     Asserts.assertTypeEquals(registry.getType("FooAlias"), registry.getType("Foo")); 
     ObjectType f = (ObjectType) findNameType("f", globalScope); 
     assertTrue(f.hasProperty("BAR")); 
     assertEquals("Foo.<number>", f.getPropertyType("BAR").toString()); 
     assertTrue(f instanceof EnumType); 
 } 


public void testTemplateType7b134() { 
     testSame("var goog = {};\n" + "goog.array = {};\n" + "/**\n" + " * @param {Array.<T>} arr\n" + " * @param {function(this:S, !T, number, !Array.<T>):boolean} f\n" + " * @param {!S=} opt_obj\n" + " * @return {!Array.<T>}\n" + " * @template T,S\n" + " */\n" + "goog.array.filter = function(arr, f, opt_obj) {\n" + "  var res = [];\n" + "  for (var i = 0; i < arr.length; i++) {\n" + "     if (f.call(opt_obj, arr[i], i, arr)) {\n" + "        res.push(val);\n" + "     }\n" + "  }\n" + "  return res;\n" + "}" + "/** @constructor */\n" + "function Foo() {}\n" + "/** @type {Array.<string>} */\n" + "var arr = [];\n" + "var result = goog.array.filter(arr," + "  function(a,b,c) {var self=this;}, new Foo());"); 
     assertEquals("Foo", findNameType("self", lastLocalScope).toString()); 
     assertEquals("string", findNameType("a", lastLocalScope).toString()); 
     assertEquals("number", findNameType("b", lastLocalScope).toString()); 
     assertEquals("Array.<string>", findNameType("c", lastLocalScope).toString()); 
     assertEquals("Array.<string>", findNameType("result", globalScope).toString()); 
 } 


public void testGlobalQualifiedNameInLocalScope138() { 
     testSame("var ns = {}; " + "(function() { " + "    /** @param {number} x */ ns.foo = function(x) {}; })();" + "(function() { ns.foo(3); })();"); 
     assertNotNull(globalScope.getVar("ns.foo")); 
     assertEquals("function (number): undefined", globalScope.getVar("ns.foo").getType().toString()); 
 } 


public void testGlobalThis2441() { 
     testSame("/** @constructor */ function Window() {}" + "Window.prototype = {alert: function() {}};" + "var x = this;"); 
     ObjectType x = (ObjectType) (globalScope.getVar("x").getType()); 
     FunctionType windowCtor = (FunctionType) (globalScope.getVar("Window").getType()); 
     assertEquals("global this", x.toString()); 
     assertTrue(x.isSubtype(windowCtor.getInstanceType())); 
     assertFalse(x.isEquivalentTo(windowCtor.getInstanceType())); 
     assertTrue(x.hasProperty("alert")); 
 } 


public void testNamespacedEnum503() { 
     testSame("var goog = {}; goog.ui = {};" + "/** @constructor */goog.ui.Zippy = function() {};" + "/** @enum{string} */goog.ui.Zippy.EventType = { TOGGLE: 'toggle' };" + "var x = goog.ui.Zippy.EventType;" + "var y = goog.ui.Zippy.EventType.TOGGLE;"); 
     ObjectType x = (ObjectType) findNameType("x", globalScope); 
     assertTrue(x.isEnumType()); 
     assertTrue(x.hasProperty("TOGGLE")); 
     assertEquals("enum{goog.ui.Zippy.EventType}", x.getReferenceName()); 
     ObjectType y = (ObjectType) findNameType("y", globalScope); 
     assertTrue(y.isSubtype(getNativeType(STRING_TYPE))); 
     assertTrue(y.isEnumElementType()); 
     assertEquals("goog.ui.Zippy.EventType", y.getReferenceName()); 
 } 


public void testStubsInExterns4631() { 
     testSame("Extern.prototype.foo;" + "/** @constructor */ function Extern() {}", "", null); 
     JSType e = globalScope.getVar("Extern").getType(); 
     assertEquals("function (new:Extern): ?", e.toString()); 
     ObjectType externProto = ((FunctionType) e).getPrototype(); 
     assertTrue(globalScope.getRootNode().toStringTree(), externProto.hasOwnProperty("foo")); 
     assertTrue(externProto.isPropertyTypeInferred("foo")); 
     assertEquals("?", externProto.getPropertyType("foo").toString()); 
     assertTrue(externProto.isPropertyInExterns("foo")); 
 } 


public void testAbstractMethod4740() { 
     testSame("/** @type {!Function} */ var abstractMethod;" + "/** @constructor */ function Foo() {}" + "Foo.prototype = {/** @param {number} x */ bar: abstractMethod};"); 
     assertEquals("Function", findNameType("abstractMethod", globalScope).toString()); 
     FunctionType ctor = (FunctionType) findNameType("Foo", globalScope); 
     ObjectType instance = ctor.getInstanceType(); 
     assertEquals("Foo", instance.toString()); 
     ObjectType proto = instance.getImplicitPrototype(); 
     assertEquals("Foo.prototype", proto.toString()); 
     assertEquals("function (this:Foo, number): ?", proto.getPropertyType("bar").toString()); 
 } 


public void testNamespacedConstructorAlias752() { 
     testSame("var goog = {};" + "/** @constructor */ goog.Foo = function() {};" + "/** @constructor */ goog.FooAlias = goog.Foo;"); 
     assertEquals("goog.Foo", registry.getType("goog.FooAlias").toString()); 
     Asserts.assertTypeEquals(registry.getType("goog.Foo"), registry.getType("goog.FooAlias")); 
 } 


public void testPrototypeInit818() { 
     testSame("/** @constructor */ var Foo = function() {};" + "Foo.prototype = {bar: 1}; var foo = new Foo();"); 
     ObjectType foo = (ObjectType) findNameType("foo", globalScope); 
     assertTrue(foo.hasProperty("bar")); 
     assertEquals("number", foo.getPropertyType("bar").toString()); 
     assertTrue(foo.isPropertyTypeInferred("bar")); 
 } 


public void testTypesInExterns890() throws Exception { 
     testSame(CompilerTypeTestCase.DEFAULT_EXTERNS, "", null); 
     Var v = globalScope.getVar("Object"); 
     FunctionType obj = (FunctionType) v.getType(); 
     assertEquals("function (new:Object, *=): ?", obj.toString()); 
     assertNotNull(v.getNode()); 
     assertNotNull(v.input); 
 } 


public void testConstructorNode905() { 
     testSame("var goog = {}; /** @constructor */ goog.Foo = function() {};"); 
     ObjectType ctor = (ObjectType) (findNameType("goog.Foo", globalScope)); 
     assertNotNull(ctor); 
     assertTrue(ctor.isConstructor()); 
     assertEquals("function (new:goog.Foo): undefined", ctor.toString()); 
 } 


public void testDeclaredCatchExpression2942() { 
     testSame("try {} catch (/** @type {string} */ e) {}"); 
     assertEquals("string", globalScope.getVar("e").getType().toString()); 
 } 


public void testBogusPrototypeInit977() { 
     testSame("/** @const */ var goog = {}; " + "goog.F = {}; /** @const */ goog.F.prototype = {};" + "/** @constructor */ goog.F = function() {};"); 
 } 


public void testDeclaredConstType31095() throws Exception { 
     testSame("/** @const */ var x = {};" + "/** @const */ x.z = 'hi';" + "function f() { var y = x.z; }"); 
     JSType yType = lastLocalScope.getVar("y").getType(); 
     assertEquals("string", yType.toString()); 
 } 


public void testBadObjectLiteralCast21132() { 
     testSame("goog.reflect.object(A.B, {})", TypedScopeCreator.CONSTRUCTOR_EXPECTED); 
 } 


public void testObjectLiteralCast1140() { 
     testSame("/** @constructor */ A.B = function() {}\n" + "A.B.prototype.isEnabled = true;\n" + "goog.reflect.object(A.B, {isEnabled: 3})\n" + "var x = (new A.B()).isEnabled;"); 
     assertEquals("A.B", findTokenType(Token.OBJECTLIT, globalScope).toString()); 
     assertEquals("boolean", findNameType("x", globalScope).toString()); 
 } 


public void testCollectedCtorProperty1166() { 
     testSame("/** @constructor */ function f() { " + "  /** @type {number} */ this.foo = 3;" + "}" + "var x = new f();"); 
     ObjectType x = (ObjectType) findNameType("x", globalScope); 
     assertEquals("f", x.toString()); 
     assertTrue(x.hasProperty("foo")); 
     assertEquals("number", x.getPropertyType("foo").toString()); 
     assertFalse(x.isPropertyTypeInferred("foo")); 
 } 


public void testDeclaredConstType51190() throws Exception { 
     testSame("/** @const */ var goog = goog || {};" + "/** @const */ var foo = goog || {};" + "function f() { var y = goog; var z = foo; }"); 
     JSType yType = lastLocalScope.getVar("y").getType(); 
     assertEquals("{}", yType.toString()); 
     JSType zType = lastLocalScope.getVar("z").getType(); 
     assertEquals("?", zType.toString()); 
 } 


public void testConstructorProperty1256() { 
     testSame("var foo = {}; /** @constructor */ foo.Bar = function() {};"); 
     ObjectType foo = (ObjectType) findNameType("foo", globalScope); 
     assertTrue(foo.hasProperty("Bar")); 
     assertFalse(foo.isPropertyTypeInferred("Bar")); 
     JSType fooBar = foo.getPropertyType("Bar"); 
     assertEquals("function (new:foo.Bar): undefined", fooBar.toString()); 
     Asserts.assertTypeCollectionEquals(Lists.newArrayList(foo), registry.getTypesWithProperty("Bar")); 
 } 


public void testNamespacedFunctionStubLocal1355() { 
     testSame("(function() {" + "var goog = {};" + "/** @param {number} x */ goog.foo;" + "});"); 
     ObjectType goog = (ObjectType) findNameType("goog", lastLocalScope); 
     assertTrue(goog.hasProperty("foo")); 
     assertEquals("function (number): ?", goog.getPropertyType("foo").toString()); 
     assertTrue(goog.isPropertyTypeDeclared("foo")); 
     Asserts.assertTypeEquals(lastLocalScope.getVar("goog.foo").getType(), goog.getPropertyType("foo")); 
 } 


public void testTemplateType71515() { 
     testSame("var goog = {};\n" + "goog.array = {};\n" + "/**\n" + " * @param {Array.<T>} arr\n" + " * @param {function(this:S, !T, number, !Array.<!T>):boolean} f\n" + " * @param {!S=} opt_obj\n" + " * @return {!Array.<T>}\n" + " * @template T,S\n" + " */\n" + "goog.array.filter = function(arr, f, opt_obj) {\n" + "  var res = [];\n" + "  for (var i = 0; i < arr.length; i++) {\n" + "     if (f.call(opt_obj, arr[i], i, arr)) {\n" + "        res.push(val);\n" + "     }\n" + "  }\n" + "  return res;\n" + "}" + "/** @constructor */\n" + "function Foo() {}\n" + "/** @type {Array.<string>} */\n" + "var arr = [];\n" + "var result = goog.array.filter(arr," + "  function(a,b,c) {var self=this;}, new Foo());"); 
     assertEquals("Foo", findNameType("self", lastLocalScope).toString()); 
     assertEquals("string", findNameType("a", lastLocalScope).toString()); 
     assertEquals("number", findNameType("b", lastLocalScope).toString()); 
     assertEquals("Array.<string>", findNameType("c", lastLocalScope).toString()); 
     assertEquals("Array.<string>", findNameType("result", globalScope).toString()); 
 } 


public void testPropertiesOnInterface21588() throws Exception { 
     testSame("/** @interface */ var I = function() {};" + "I.prototype = {baz: function(){}};" + "/** @type {number} */ I.prototype.bar;"); 
     Var i = globalScope.getVar("I"); 
     assertEquals("function (this:I): ?", i.getType().toString()); 
     assertTrue(i.getType().isInterface()); 
     ObjectType iPrototype = (ObjectType) ((ObjectType) i.getType()).getPropertyType("prototype"); 
     assertEquals("I.prototype", iPrototype.toString()); 
     assertTrue(iPrototype.isFunctionPrototypeType()); 
     assertEquals("number", iPrototype.getPropertyType("bar").toString()); 
     assertEquals("function (this:I): undefined", iPrototype.getPropertyType("baz").toString()); 
     assertNull(globalScope.getVar("I.prototype")); 
 } 


public void testInferredProperty31607() { 
     testSame("var foo = { /** @type {number} */ get Bar() { return 3 } };"); 
     ObjectType foo = (ObjectType) findNameType("foo", globalScope); 
     assertTrue(foo.toString(), foo.hasProperty("Bar")); 
     assertEquals("?", foo.getPropertyType("Bar").toString()); 
     assertTrue(foo.isPropertyTypeInferred("Bar")); 
 } 


public void testStubProperty1658() { 
     testSame("function Foo() {}; Foo.bar;"); 
     ObjectType foo = (ObjectType) globalScope.getVar("Foo").getType(); 
     assertFalse(foo.hasProperty("bar")); 
     Asserts.assertTypeEquals(registry.getNativeType(UNKNOWN_TYPE), foo.getPropertyType("bar")); 
     Asserts.assertTypeCollectionEquals(Lists.newArrayList(foo), registry.getTypesWithProperty("bar")); 
 } 


public void testMethodBeforeFunction11681() throws Exception { 
     testSame("var y = Window.prototype;" + "Window.prototype.alert = function(message) {};" + "/** @constructor */ function Window() {}\n" + "var window = new Window(); \n" + "var x = window;"); 
     ObjectType x = (ObjectType) findNameType("x", globalScope); 
     assertEquals("Window", x.toString()); 
     assertTrue(x.getImplicitPrototype().hasOwnProperty("alert")); 
     assertEquals("function (this:Window, ?): undefined", x.getPropertyType("alert").toString()); 
     assertTrue(x.isPropertyTypeDeclared("alert")); 
     ObjectType y = (ObjectType) findNameType("y", globalScope); 
     assertEquals("function (this:Window, ?): undefined", y.getPropertyType("alert").toString()); 
 } 


public void testTemplateType11707() { 
     testSame("/**\n" + " * @param {function(this:T, ...)} fn\n" + " * @param {T} thisObj\n" + " * @template T\n" + " */\n" + "function bind(fn, thisObj) {}" + "/** @constructor */\n" + "function Foo() {}\n" + "/** @return {number} */\n" + "Foo.prototype.baz = function() {};\n" + "bind(function() { var g = this; var f = this.baz(); }, new Foo());"); 
     assertEquals("Foo", findNameType("g", lastLocalScope).toString()); 
     assertEquals("number", findNameType("f", lastLocalScope).toString()); 
 } 


public void testClosureParameterTypesWithJSDoc1741() { 
     testSame("/**\n" + " * @param {function(!Object)} bar\n" + " */\n" + "function foo(bar) {}\n" + "foo((/** @type {function(string)} */" + "function(baz) { var f = baz; }))\n"); 
     assertEquals("string", findNameType("f", lastLocalScope).toString()); 
 } 


public void testReturnTypeInference51799() { 
     testSame("function f() { if (true) { return 1; } }"); 
     assertEquals("function (): ?", findNameType("f", globalScope).toString()); 
 } 


public void testLiteralTypesInferred1855() { 
     testSame("null + true + false + 0 + '' + {}"); 
     assertEquals("null", findTokenType(Token.NULL, globalScope).toString()); 
     assertEquals("boolean", findTokenType(Token.TRUE, globalScope).toString()); 
     assertEquals("boolean", findTokenType(Token.FALSE, globalScope).toString()); 
     assertEquals("number", findTokenType(Token.NUMBER, globalScope).toString()); 
     assertEquals("string", findTokenType(Token.STRING, globalScope).toString()); 
     assertEquals("{}", findTokenType(Token.OBJECTLIT, globalScope).toString()); 
 } 


public void testDuplicateExternProperty21873() { 
     testSame("/** @constructor */ function Foo() {}" + "/** @type {number} */ Foo.prototype.bar;" + "Foo.prototype.bar; var x = (new Foo).bar;", null); 
     assertEquals("number", findNameType("x", globalScope).toString()); 
 } 


public void testTemplateType41973() { 
     testSame("/**\n" + " * @param {T} x\n" + " * @return {T}\n" + " * @template T\n" + " */\n" + "function f(x) {\n" + "  return x;\n" + "}" + "/** @type {!Array.<string>} */\n" + "var arr = [];\n" + "(function () {var result = f(arr);})();"); 
     JSType resultType = findNameType("result", lastLocalScope); 
     assertEquals("Array.<string>", resultType.toString()); 
 } 


public void testInferredProperty42012() { 
     testSame("var foo = { /** @type {number} */ set Bar(a) {} };"); 
     ObjectType foo = (ObjectType) findNameType("foo", globalScope); 
     assertTrue(foo.toString(), foo.hasProperty("Bar")); 
     assertEquals("?", foo.getPropertyType("Bar").toString()); 
     assertTrue(foo.isPropertyTypeInferred("Bar")); 
 } 


public void testBadCtorInit12020() throws Exception { 
     testSame("/** @constructor */ var f;", CTOR_INITIALIZER); 
 } 


public void testStubsInExterns2045() { 
     testSame("/** @constructor */ function Extern() {}" + "Extern.prototype.bar;" + "var e = new Extern(); e.baz;", "/** @constructor */ function Foo() {}" + "Foo.prototype.bar;" + "var f = new Foo(); f.baz;", null); 
     ObjectType e = (ObjectType) globalScope.getVar("e").getType(); 
     assertEquals("?", e.getPropertyType("bar").toString()); 
     assertEquals("?", e.getPropertyType("baz").toString()); 
     ObjectType f = (ObjectType) globalScope.getVar("f").getType(); 
     assertEquals("?", f.getPropertyType("bar").toString()); 
     assertFalse(f.hasProperty("baz")); 
 } 


public void testBadObjectLiteralCast12072() { 
     testSame("/** @constructor */ A.B = function() {}\n" + "goog.reflect.object(A.B, 1)", ClosureCodingConvention.OBJECTLIT_EXPECTED); 
 } 


public void testTemplateType62134() { 
     testSame("/**\n" + " * @param {Array.<T>|string|undefined} arr\n" + " * @return {!Array.<T>}\n" + " * @template T\n" + " */\n" + "function f(arr) {\n" + "  return arr;\n" + "}" + "/** @type {Array.<string>} */\n" + "var arr = [];\n" + "var result = f(arr);"); 
     assertEquals("Array.<string>", findNameTypeStr("result", globalScope)); 
 } 


public void testTemplateType102171() { 
     testSame("/** @constructor */\n" + "function Foo() {}\n" + "\n" + "/**\n" + " * @this {T}\n" + " * @return {T} fn\n" + " * @template T\n" + " */\n" + "Foo.prototype.method = function() {var g = this;};\n"); 
     assertEquals("T", findNameType("g", lastLocalScope).toString()); 
 } 


public void testFunctionInOr2291() throws Exception { 
     testSame("/** @param {number} x */ var f = Math.random() || " + "function(x) {};"); 
     assertEquals("number", lastLocalScope.getVar("x").getType().toString()); 
 } 


public void testPropertyDeclarationOnRecordType2321() { 
     testSame("/** @type {{foo: number}} */ var a = {foo: 3};" + "/** @type {number} */ a.name = 0;"); 
     assertEquals("number", globalScope.getVar("a.name").getType().toString()); 
     ObjectType a = (ObjectType) (globalScope.getVar("a").getType()); 
     assertEquals("{foo: number}", a.toString()); 
     assertFalse(a.hasProperty("name")); 
 } 


public void testTemplateType4b2416() { 
     testSame("/**\n" + " * @param {function(T):void} x\n" + " * @return {T}\n" + " * @template T\n" + " */\n" + "function f(x) {\n" + "  return x;\n" + "}" + "/** @param {string} x */\n" + "var g = function(x){};\n" + "(function () {var result = f(g);})();"); 
     JSType resultType = findNameType("result", lastLocalScope); 
     assertEquals("string", resultType.toString()); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // TODO(johnlenz): A syntax for stubs using object literals?

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private JSType findNameType(final String name, Scope scope) {
    return findTypeOnMatchedNode(new Predicate<Node>() {
      @Override public boolean apply(Node n) {
        return name.equals(n.getQualifiedName());
      }
    }, scope);
  }

  private String findNameTypeStr(final String name, Scope scope) {
    return findNameType(name, scope).toString();
  }

  private JSType findTokenType(final int type, Scope scope) {
    return findTypeOnMatchedNode(new Predicate<Node>() {
      @Override public boolean apply(Node n) {
        return type == n.getType();
      }
    }, scope);
  }

  private JSType findTypeOnMatchedNode(Predicate<Node> matcher, Scope scope) {
    Node root = scope.getRootNode();
    Deque<Node> queue = Lists.newLinkedList();
    queue.push(root);
    while (!queue.isEmpty()) {
      Node current = queue.pop();
      if (matcher.apply(current) &&
          current.getJSType() != null) {
        return current.getJSType();
      }

      for (Node child : current.children()) {
        queue.push(child);
      }
    }
    return null;
  }

  private JSType getNativeType(JSTypeNative type) {
    return registry.getNativeType(type);
  }

  private ObjectType getNativeObjectType(JSTypeNative type) {
    return (ObjectType) registry.getNativeType(type);
  }
}
