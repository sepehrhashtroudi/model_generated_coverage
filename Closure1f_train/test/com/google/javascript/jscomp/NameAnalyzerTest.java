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

import com.google.javascript.rhino.Node;

/**
 * Tests for {@link NameAnalyzer}
 *
 */
public class NameAnalyzerTest extends CompilerTestCase {

  private static String kExterns =
      "var window, top;" +
      "var document;" +
      "var Function;" +
      "var Array;" +
      "var externfoo; methods.externfoo;";

  public NameAnalyzerTest() {
    super(kExterns);
  }

  @Override
  protected void setUp() {
    super.enableNormalize();
    super.enableLineNumberCheck(true);
  }

  @Override
  protected int getNumRepetitions() {
    // pass reaches steady state after 1 iteration.
    return 1;
  }


public void testSetterInForStruct86() { 
     test("var i = 0, j = 0, k = 0; for (i = 1, j = i, k = 2; i = 0;);", "var i = 0; for(i = 1, i , 2; i = 0;);"); 
 } 


public void testNestedAssign227() { 
     test("var a, b = a = 1; foo(b)", "var b = 1; foo(b)"); 
 } 


public void testUnhandledTopNode49() { 
     testSame("function Foo() {}; Foo.prototype.isBar = function() {};" + "function Bar() {}; Bar.prototype.isFoo = function() {};" + "var foo = new Foo(); var bar = new Bar();" + "var cond = foo.isBar() && bar.isFoo();" + "if (cond) {window.alert('hello');}"); 
 } 


public void testAliasInstanceof5124() { 
     test("function Foo() {}" + "function Bar() {}" + "var b = x ? Foo : Bar;" + "var y = new Foo();" + "if (y instanceof b) {}", "function Foo() {}" + "var y = new Foo;" + "if (false){}"); 
 } 


public void testRhsReference1254() { 
     testSame("var a = 1; a"); 
 } 


public void testDoNotChangeReferencedLocalScopedInstanceOf397() { 
     testSame("function Foo() {}; externfoo.x = new Foo();" + "function Bar() { if (x instanceof Foo) { window.alert(x); } };" + "externfoo.y = new Bar();"); 
 } 


public void testNamespacedClass1402() { 
     test("var foo = {};foo.bar = {};foo.bar.prototype.baz = {}", ""); 
 } 


public void testAssignWithHook8445() { 
     test("function Foo(){} var foo = null;" + "var f = window.a ? new Foo() : foo;", "function Foo(){}" + "window.a && new Foo()"); 
 } 


public void testSingletonGetter3463() { 
     testSame("function Foo() {} goog$addSingletonGetter(Foo);" + "this.x = Foo.getInstance();"); 
 } 


public void testGetElem3527() { 
     testSame("var foo = {'i': 0, 'j': 1}; foo['k'] = 2; top.foo = foo;"); 
 } 


public void testUnintendedUseOfInheritsInLocalScope2528() { 
     testSame("goog.mixin = function() {}; " + "var x = {}; var y = {}; (function() { goog.mixin(x, y); })();"); 
 } 


public void testIf2614() { 
     test("var e = false;var foo = {};if(e)foo.bar=function(){};", "var e = false;if(e);"); 
 } 


public void testRemoveDeclaration4726() { 
     testSame("var a,b,c; c = a = b = {}; a.x = 1;alert(c.x);"); 
 } 


public void testRemoveInstanceOfWithReferencedMethod738() { 
     test("function Foo() {}; Foo.prototype.isBar = function() {};" + "var x; if (x instanceof Foo) { window.alert(x.isBar()); }", ";var x; if (false) { window.alert(x.isBar()); }"); 
 } 


public void testRefChain8753() { 
     test("var a = 1; var b = a; var c = b; var d = f()[b] ? g() : 0", "var a = 1; var b = a; f()[b] && g()"); 
 } 


public void testNamespacedClass3826() { 
     test("var a = {}; a.b = function() {}; a.b.prototype = {x: function() {}};", ""); 
 } 


public void testSetterInForIn3862() { 
     testSame("var foo = {}; var bar; for(e in bar = foo.a); bar.b = 3"); 
 } 


public void testSetterInDoWhilePredicate888() { 
     testSame("var a = 1;" + "var Class = function() {}; " + "do {} while(Class.property_ = a);"); 
 } 


public void testClassDefinedInObjectLit4917() { 
     test("var data = {};" + "data.baz = {bar: {Foo: function() {}}};" + "data.baz.bar.Foo.prototype.toString = function() {};", ""); 
 } 


public void testRefChain23923() { 
     test("var a = {}; var b = a[1] || f()", "var a = {}; a[1] || f()"); 
 } 


public void testIf5925() { 
     test("var e = false, f;var foo = {};if(f = e + 1)foo.bar=function(){};", "var e = false;if(e + 1);"); 
 } 


public void testIssue874a961() { 
     testSame("var a = a || {};\n" + "var b = a;\n" + "b.View = b.View || {}\n" + "var c = b.View;\n" + "c.Editor = function f(d, e) {\n" + "  return d + e\n" + "};\n" + "window.ImageEditor.View.Editor = a.View.Editor;"); 
 } 


public void testMixin71024() { 
     test("this.a = {}; var b = {}; var c = {}; var goog = {};" + "goog.mixin = function() {};" + "var d = goog.mixin(c.prototype, a.prototype) + " + "goog.mixin(b.prototype, a.prototype);" + "new b()", "this.a = {}; var b = {}; var goog = {};" + "goog.mixin = function() {};" + "goog.mixin(b.prototype, a.prototype);" + "new b()"); 
 } 


public void testGetElemOnThis1104() { 
     testSame("var a = 3; this['foo'] = a;"); 
     testSame("this['foo'] = 3;"); 
 } 


public void testIssue2841139() { 
     test("var goog = {};" + "goog.inherits = function(x, y) {};" + "var ns = {};" + "/** @constructor */" + "ns.PageSelectionModel = function() {};" + "/** @constructor */" + "ns.PageSelectionModel.FooEvent = function() {};" + "/** @constructor */" + "ns.PageSelectionModel.SelectEvent = function() {};" + "goog.inherits(ns.PageSelectionModel.ChangeEvent," + "    ns.PageSelectionModel.FooEvent);", ""); 
 } 


public void testPropertyDefinedInGlobalScope1231() { 
     testSame("function Foo() {}; var x = new Foo(); x.cssClass = 'bar';" + "window.alert(x);"); 
 } 


public void testNoRemoveWindowPropertyAlias31248() { 
     testSame("var self_ = window;\n" + "self_['qs'] = function() {};"); 
 } 


public void testSetterInForStruct101389() { 
     test("var Class = function() {}; " + "for (var i = 1; Class.property_ = 0; i = 2);", "for (; 0;);"); 
 } 


public void testSetterInWhilePredicate1451() { 
     test("var a = 1;" + "var Class = function() {}; " + "while (Class.property_ = a);", "var a = 1; for (;a;) {}"); 
 } 


public void testShortCircuit51464() { 
     test("var a = b() && 1", "b()"); 
 } 


public void testNoRemoveWindowPropertyAlias5a1600() { 
     test("var self_; self_ = window || {};\n" + "self_['qs'] = function() {};", ""); 
 } 


public void testAnonymous81631() { 
     testSame("var foo;" + "(function (){ var g=function(){ externfoo = foo; }; g(); })();"); 
 } 


public void testSetterInForStruct151635() { 
     test("var Class = function() {}; " + "for (var i = 1; 0; Class.prototype.property_ = 0);", "for (; 0; 0);"); 
 } 


public void testNoSideEffectAnnotation131653() { 
     test("/**@nosideeffects*/function c(){}", "var a = new c", "", null, null); 
 } 


public void testNoRemovePrototypeDefinitionsOutsideGlobalScope11656() { 
     testSame("function f(arg){}" + "" + "(function(){" + "  var O = {};" + "  O.prototype = 'foo';" + "  f(O);" + "})()"); 
 } 


public void testIssue838a1676() { 
     testSame("var z = window['z'] || (window['z'] = {});\n" + "z['hello'] = 'Hello';\n" + "z['world'] = 'World';"); 
 } 


public void testNoRemoveAlias31853() { 
     testSame("var x = {}; function f() { return x; };" + "var map = {}\n" + "map[1] = f();\n" + "map[1].style.display = 'block';"); 
 } 


public void testAssignWithHook31926() { 
     testSame("function Foo(){} var foo = null; var f = {};" + "f.b = window.a ? " + "    function () {return new Foo()} : function () {return foo}; f.b()"); 
 } 


public void testRhsAssign51984() { 
     test("var a = 3, foo, bar; foo || (bar = a)", "var a = 3, foo; foo || a"); 
 } 


public void testConditionallyDefinedFunction12042() { 
     testSame("var g; externfoo.x || (externfoo.x = function() { g; })"); 
 } 


public void testRemoveDeclaration62174() { 
     test("var a,b,c; c = a = b = 'str';use(b)", "var b;b='str';use(b)"); 
 } 


public void testNoSideEffectAnnotation142269() { 
     String common = "function c(){};" + "c.prototype.f = /**@nosideeffects*/function(){};"; 
     test(common, "var o = new c; var a = o.f()", "new c", null, null); 
 } 


public void testAssignWithHook52352() { 
     testSame("function Foo(){} var foo = null; var f = {};" + "f.b = window.a ? function () {return new Foo()} :" + "    window.b ? function () {return foo} :" + "    function() { return Foo }; f.b()"); 
 } 


public void testVarReferencedInClassDefinedInObjectLit22358() { 
     testSame("var ref = 3;" + "var data = {Foo: function() { this.x = ref; }," + "            Bar: function() {}};" + "window.Bar = data.Bar;"); 
 } 


public void testRefChain62439() { 
     test("var a = 1; var b = a; var c = b; var d = c ? f() : g()", "var a = 1; var b = a; var c = b; c ? f() : g()"); 
 } 

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  


  

  

  

  

  

  /**
   * Expressions that cannot be attributed to any enclosing dependency
   * scope should be treated as global references.
   * @bug 1739062
   */
  

  

  

  

  /**
   * Do not "prototype" property of variables that are not being
   * tracked (because they are local).
   * @bug 1809442
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

 

  

  

  

  

  

  

  

  

  



  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // We cannot leave x.a.prototype there because it will
  // fail sanity var check.
  

  

  

  

  


  

  

  

  

  

  

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new MarkNoSideEffectCallsAndNameAnalyzerRunner(compiler);
  }

  private class MarkNoSideEffectCallsAndNameAnalyzerRunner
      implements CompilerPass {
    MarkNoSideEffectCalls markNoSideEffectCalls;
    NameAnalyzer analyzer;
    MarkNoSideEffectCallsAndNameAnalyzerRunner(Compiler compiler) {
      this.markNoSideEffectCalls = new MarkNoSideEffectCalls(compiler);
      this.analyzer = new NameAnalyzer(compiler, true);
    }

    @Override
    public void process(Node externs, Node root) {
      markNoSideEffectCalls.process(externs, root);
      analyzer.process(externs, root);
    }
  }
}
