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

import com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType;
import com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.TightenTypes.ConcreteSlot;

import com.google.javascript.rhino.testing.BaseJSTypeTestCase;

/**
 * Unit test for the TightenTypes pass.
 *
 */
public class TightenTypesTest extends CompilerTestCase {
  private TightenTypes tt;

  public TightenTypesTest() {
    parseTypeInfo = true;
    enableTypeCheck(CheckLevel.WARNING);
    enableNormalize(true);
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return (tt = new TightenTypes(compiler));
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  @Override
  protected CompilerOptions getOptions() {
    return new CompilerOptions(); // no missing properties check
  }


public void testExternSubTypesForObject163() { 
     testSame(BaseJSTypeTestCase.ALL_NATIVE_EXTERN_TYPES + "/** @constructor */ function A() {};\n" + "/** @constructor \n@extends A */ function B() {};\n" + "/** @return {Object} */ " + "Object.prototype.eval = function(code) {};\n" + "/** @type {Object} */\n" + "A.prototype.a;\n" + "/** @return {Object} */\n" + "A.prototype.b = function(){};\n", "var a = (new A).b()", null, null); 
     assertType("(A,ActiveXObject,Array,B,Boolean,Date,Error,EvalError," + "Function,Number,Object," + "RangeError,ReferenceError,RegExp,String,SyntaxError," + "TypeError,URIError)", getType("a")); 
 } 


public void testTopLevelVariables242() { 
     testSame("/** @constructor */ function Foo() {}\n" + "var a = new Foo();\n" + "var b = a;\n"); 
     assertTrue(getType("Foo").isFunction()); 
     assertTrue(getType("a").isInstance()); 
     assertType("function (this:Foo): ()", getType("Foo")); 
     assertType("Foo", getType("a")); 
     assertType("Foo", getType("b")); 
     testSame("/** @constructor */ function Foo() {}\n" + "/** @constructor */ function Bar() {}\n" + "var a = new Foo();\n" + "a = new Bar();\n" + "var b = a;\n"); 
     assertTrue(getType("a").isUnion()); 
     assertType("(Bar,Foo)", getType("a")); 
     assertType("Bar", getType("b")); 
 } 


public void testSetTimeout302() { 
     testSame("/** @constructor */ function Window() {};\n" + "Window.prototype.setTimeout = function(f, t) {};\n" + "/** @type Window */ var window;", "/** @constructor*/ function A() {}\n" + "A.prototype.handle = function() { foo(); };\n" + "function foo() {}\n" + "window.setTimeout((new A).handle, 3);", null); 
     assertTrue(isCalled(getType("foo"))); 
 } 


public void testImplicitPropCallWithArgs434() { 
     testSame("/** @constructor */ function Window() {};\n" + "/** @constructor */ function EventListener() {};\n" + "/** @param {string} t\n" + "  * @param {EventListener|function(Event)} f */\n" + "Window.prototype.addEventListener = function(t, f) {};\n" + "/** @constructor */ function Event() {};", "function foo(evt) {};\n" + "(new Window).addEventListener('click', foo);", null); 
     assertTrue(isCalled(getType("foo"))); 
     assertType("Event", getParamType(getType("foo"), 0)); 
 } 


public void testCallPrototypeFunction442() { 
     testSame("/** @constructor */ function Foo() {}\n" + "Foo.prototype.a = function() { return new A; }\n" + "Foo.prototype.a = function() { return new A; };\n" + "/** @constructor \n @extends Foo */ function Bar() {}\n" + "/** @override */" + "Bar.prototype.a = function() { return new B; };\n" + "/** @constructor */ function A() {};\n" + "/** @constructor */ function B() {};\n" + "var ret = Foo.prototype.a.call(new Bar);"); 
     assertType("A", getType("ret")); 
 } 


public void testObjectLiteralTraversal568() { 
     testSame("var foo = function() {}\n" + "function bar() { return { 'a': foo()} };\n" + "bar();"); 
     assertTrue(isCalled(getType("foo"))); 
 } 


public void testThis658() { 
     testSame("/** @constructor */ function Foo() {}\n" + "Foo.prototype.foo = function() { return this; }\n" + "var a = new Foo();\n" + "var b = a.foo();\n"); 
     assertType("Foo", getType("a")); 
     assertType("Foo", getType("b")); 
 } 


public void testImplicitCallFromPropertyOfAllType669() { 
     testSame("/** @constructor */ function Element() {};\n" + "/** @type {function(this:Element,Event)} */\n" + "Element.prototype.onclick;\n" + "/** @constructor */ function Event() {};", "function foo(evt) {};\n" + "var elems = [];\n" + "var elem = elems[0];\n" + "elem.onclick = foo;", null); 
     assertTrue(isCalled(getType("foo"))); 
     assertType("Event", getParamType(getType("foo"), 0)); 
     assertType("Element", getThisType(getType("foo").toFunction())); 
 } 


public void testCallFunctionWithArgs671() { 
     testSame("/** @constructor */ function Foo(o) { this.a = o; }\n" + "/** @constructor \n @extends Foo */ function Bar() {\n" + "  Foo.call(this, new A());\n" + "}\n" + "/** @constructor */ function A() {};\n" + "var b = new Bar;"); 
     assertTrue(isCalled(getType("Foo"))); 
     assertTrue(isCalled(getType("A"))); 
     ConcreteType barType = getThisType(getType("Bar")); 
     assertType("A", getPropertyType(barType, "a")); 
     ConcreteType fooType = getThisType(getType("Foo")); 
     assertType("A", getPropertyType(fooType, "a")); 
 } 


public void testGetElem3946() { 
     testSame(BaseJSTypeTestCase.ALL_NATIVE_EXTERN_TYPES, "/** @constructor */ function Foo() {}\n" + "/** @constructor */ function Bar() {}\n" + "/** @constructor */ function Baz() {\n" + "  this.arr = [];\n" + "}\n" + "function foo(anarr) {" + "}\n" + "var ar = [];\n" + "foo(ar);\n", null); 
     assertType("Array", getType("ar")); 
 } 


public void testFunctionToString1329() { 
     testSame("/** @constructor */ function Foo() {}\n" + "/** @constructor \n * @extends Foo */\n" + "function Bar() { Foo.call(this); }\n" + "var a = function(a) { return new Foo; };\n;" + "a(new Foo);\n" + "a(new Bar);\n" + "new Bar;"); 
     assertType("function ((Bar,Foo)): Foo", getType("a")); 
     assertType("function (this:(Bar,Foo)): ()", getType("Foo")); 
     assertType("function (this:Bar): ()", getType("Bar")); 
 } 


public void testAnd1343() { 
     testSame("/** @constructor */ function Foo() {}\n" + "/** @constructor */ function Bar() {}\n" + "var a = (new Foo && new Bar);\n"); 
     assertType("Bar", getType("a")); 
 } 


public void testRestrictToInterfaceCast1363() { 
     testSame("/** @constructor \n @implements Int */ function Foo() {};\n" + "/** @interface */ function Int() {};\n" + "var a = [];\n" + "var foo = (/** @type {Int} */ a[0]);\n" + "new Foo"); 
     assertType("Foo", getType("foo")); 
 } 


public void testHook1370() { 
     testSame("/** @constructor */ function Foo() {}\n" + "/** @constructor */ function Bar() {}\n" + "var a = (1+1 == 2) ? new Foo : new Bar;\n"); 
     assertType("(Bar,Foo)", getType("a")); 
 } 


public void testComma1476() { 
     testSame("/** @constructor */ function Foo() {b=new Foo()}\n" + "var b;" + "/** @constructor */ function Bar() {}\n" + "var a = (new Foo, new Bar);\n"); 
     assertType("Bar", getType("a")); 
     assertType("Foo", getType("b")); 
 } 


public void testUntypedImplicitCallFromProperty1640() { 
     testSame("/** @constructor */ function Element() {};\n" + "/** @type {?function(Event)} */Element.prototype.onclick;\n" + "/** @constructor */ function Event() {};" + "/** @return {Event} */ Event.prototype.erv;", " function foo(evt) { return bar(evt); };\n" + "function bar(a) { return a.type() }\n" + "/** @type Object */ var ar = new Element;\n" + "ar.onclick = foo;", null); 
     assertTrue(isCalled(getType("foo"))); 
     assertTrue(isCalled(getType("bar"))); 
     assertType("Event", getParamType(getType("foo"), 0)); 
     assertType("Event", getParamType(getType("bar"), 0)); 
     assertType("Element", getThisType(getType("foo").toFunction())); 
 } 


public void testArrayAssignments1849() { 
     testSame("/** @constructor */ function Foo() {}\n" + "var a = [];\n" + "function foo() { return []; }\n" + "(a.length == 0 ? a : foo())[0] = new Foo;\n" + "var b = a[0];\n" + "var c = foo()[0];\n"); 
     assertType("(Array,Foo)", getType("b")); 
     assertType("(Array,Foo)", getType("c")); 
 } 


public void testGetProp1979() { 
     testSame("/** @constructor */ function Foo() {\n" + "  this.foo = new A();\n" + "}\n" + "/** @constructor */ function Bar() {\n" + "  this.foo = new B();\n" + "}\n" + "/** @constructor */ function Baz() {}\n" + "/** @constructor */ function A() {}\n" + "/** @constructor */ function B() {}\n" + "/** @type {Foo} */ var foo = new Foo();\n" + "/** @type {Bar} */ var bar = new Bar();\n" + "/** @type {Baz} */ var baz = new Baz();\n" + "var a = foo || bar || baz\n" + "var b = a.foo;\n"); 
     assertType("(A,B)", getType("b")); 
 } 


public void testCatchStatement2082() { 
     testSame(BaseJSTypeTestCase.ALL_NATIVE_EXTERN_TYPES, "/** @constructor */ function Bar() {}\n" + "function bar() { try { } catch (e) { return e; } }\n" + "/** @constructor\n@extends{Error}*/ function ID10TError() {}\n" + "var a = bar(); throw new ID10TError();\n", null, null); 
     assertType("(Error,EvalError,ID10TError,RangeError,ReferenceError," + "SyntaxError,TypeError,URIError)", getType("a")); 
 } 


public void testRestrictToCastWithNonInstantiatedTypes2318() { 
     testSame("/** @constructor */ function Super() {}\n" + "/** @constructor \n @extends {Super} */ function Foo() {};\n" + "Foo.prototype.blah = function() { foofunc() };\n" + "/** @constructor \n @extends {Super} */ function Bar() {};\n" + "Bar.prototype.blah = function() { barfunc() };\n" + "function barfunc() {}\n" + "function foofunc() {}\n" + "var a = [];\n" + "var u = /** @type {Super} */ (a[0]);\n" + "u.blah()\n" + "new Foo"); 
     assertTrue(isCalled(getType("foofunc"))); 
     assertFalse(isCalled(getType("barfunc"))); 
     assertType("Array", getType("a")); 
 } 


public void testImplicitPropCall2394() { 
     testSame("/** @constructor */ function Window() {};\n" + "/** @param {function()} f \n@param {number} */\n" + "Window.prototype.setTimeout = function(f, d) {};", "function foo() {};\n" + "(new Window).setTimeout(foo, 20);", null); 
     assertTrue(isCalled(getType("foo"))); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertType(String expected, ConcreteType type) {
    assertEquals(expected, type.toString());
  }

  /** Returns the type of the given variable in the top-most scope. */
  private ConcreteType getType(String var) {
    assertNotNull(tt.getTopScope().getSlot(var));
    return tt.getTopScope().getSlot(var).getType();
  }

  /** Returns the variable for the given parameter of the given function. */
  private ConcreteSlot getParamVar(ConcreteType funType, int param) {
    assertTrue(funType.isFunction());
    return (ConcreteSlot)
        ((ConcreteFunctionType) funType).getParameterSlot(param);
  }

  /** Returns the type of the given parameter of the given function. */
  private ConcreteType getParamType(ConcreteType funType, int param) {
    ConcreteSlot paramVar = getParamVar(funType, param);
    return (paramVar != null) ? paramVar.getType() : ConcreteType.NONE;
  }

  /** Returns the variable for the this variable of the given function. */
  private ConcreteSlot getThisSlot(ConcreteType funType) {
    assertTrue(funType.isFunction());
    return (ConcreteSlot) ((ConcreteFunctionType) funType).getThisSlot();
  }

  /** Returns the type of the this variable of the given function. */
  private ConcreteType getThisType(ConcreteType funType) {
    return getThisSlot(funType).getType();
  }

  /** Returns the prototype type of the given function. */
  private ConcreteType getFunctionPrototype(ConcreteType funType) {
    assertTrue(funType.isFunction());
    return ((ConcreteFunctionType) funType).getPrototypeType();
  }

  /**
   * Returns the variable for the property with the give name on the given
   * instance type.
   */
  private ConcreteSlot getPropertyVar(ConcreteType instType, String name) {
    assertTrue(instType.isInstance());
    return (ConcreteSlot)
        ((ConcreteInstanceType) instType).getPropertySlot(name);
  }

  /** Returns the type of the property with the give name on the given type. */
  private ConcreteType getPropertyType(ConcreteType instType, String name) {
    return getPropertyVar(instType, name).getType();
  }

  /** Returns whether the given function is called. */
  private boolean isCalled(ConcreteType funType) {
    assertTrue(funType.isFunction());
    ConcreteSlot callVar = (ConcreteSlot)
        ((ConcreteFunctionType) funType).getCallSlot();
    return !callVar.getType().isNone();
  }
}
