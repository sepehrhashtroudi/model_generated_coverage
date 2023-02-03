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

import static com.google.javascript.jscomp.CollapseProperties.UNSAFE_THIS;

import com.google.javascript.rhino.Node;

/**
 * Tests for {@link CollapseProperties}.
 *
 */
public class CollapsePropertiesTest extends CompilerTestCase {

  private static String EXTERNS =
      "var window; function alert(s) {} function parseInt(s) {}" +
      "/** @constructor */ function String() {}";

  private boolean collapsePropertiesOnExternTypes = false;

  public CollapsePropertiesTest() {
    super(EXTERNS);
  }

  @Override public CompilerPass getProcessor(Compiler compiler) {
    return new CollapseProperties(
        compiler, collapsePropertiesOnExternTypes, true);
  }

  @Override
  public void setUp() {
    enableLineNumberCheck(true);
    enableNormalize(true);
  }

  @Override public int getNumRepetitions() {
    return 1;
  }


public void testIssue389361() { 
     test("function alias() {}" + "var dojo = {};" + "dojo.gfx = {};" + "dojo.declare = function() {};" + "/** @constructor */" + "dojo.gfx.Shape = function() {};" + "dojo.gfx.Shape = dojo.declare('dojo.gfx.Shape');" + "alias(dojo);", "function alias() {}" + "var dojo = {};" + "dojo.gfx = {};" + "dojo.declare = function() {};" + "/** @constructor */" + "var dojo$gfx$Shape = function() {};" + "dojo$gfx$Shape = dojo.declare('dojo.gfx.Shape');" + "alias(dojo);", null, CollapseProperties.UNSAFE_NAMESPACE_WARNING); 
 } 


public void testObjLitDefinedInLocalScopeIsLeftAlone410() { 
     test("var a = {}; a.b = function() {};" + "a.b.prototype.f_ = function() {" + "  var x = { p: '', q: '', r: ''}; var y = x.q;" + "};", "var a$b = function() {};" + "a$b.prototype.f_ = function() {" + "  var x = { p: '', q: '', r: ''}; var y = x.q;" + "};"); 
 } 


public void testCrashInNestedAssign511() { 
     test("var a = {}; if (a.b = function() {}) a.b();", "var a$b; if (a$b=function() {}) { a$b(); }"); 
 } 


public void testAddPropertyToFunctionInLocalScopeDepth1619() { 
     test("function a() {} function f() { a.c = 5; return a.c; }", "function a() {} var a$c; function f() { a$c = 5; return a$c; }"); 
 } 


public void testChainedAssignments4686() { 
     test("var x = {}; a = b = x.y;", "var x = {}; a = b = x.y;"); 
 } 


public void testInlineAliasWithModifications810() { 
     testSame("var x = 10; function f() { var y = x; x++; alert(y)} "); 
     testSame("var x = 10; function f() { var y = x; x+=1; alert(y)} "); 
     test("var x = {}; x.x = 10; function f() {var y=x.x; x.x++; alert(y)}", "var x$x = 10; function f() {var y=x$x; x$x++; alert(y)}"); 
     test("var x = {}; x.x = 10; function f() {var y=x.x; x.x+=1; alert(y)}", "var x$x = 10; function f() {var y=x$x; x$x+=1; alert(y)}"); 
 } 


public void testTwiceDefinedGlobalNameDepth2828() { 
     test("var a = {}; a.b = {}; function f() { a.b.c(); }" + "a.b = function() {}; a.b.c = function() {};", "var a$b = {}; function f() { a$b.c(); }" + "a$b = function() {}; a$b.c = function() {};"); 
 } 


public void testDecrement912() { 
     test("var a = {}; a.b = 5; a.b--; a.b = 5", "var a$b = 5; a$b--; a$b = 5"); 
 } 


public void testLocalAlias4987() { 
     test("var a = {b: 3}; var c = {d: 5}; " + "function f() { var x = a; var y = c; f(x.b); f(y.d); }", "var a$b = 3; var c$d = 5; " + "function f() { var x = null; var y = null; f(a$b); f(c$d);}"); 
 } 


public void testGlobalObjectDeclaredToPreserveItsPreviousValue11042() { 
     test("var a = a ? a : {}; a.c = 1;", "var a = a ? a : {}; var a$c = 1;"); 
 } 


public void testDelete11209() { 
     testSame("var foo = {};" + "foo.bar = 3;" + "delete foo.bar;"); 
 } 


public void testGlobalObjectNameInBooleanExpressionDepth1_21299() { 
     test("var a = {b: 0}; a.c = 1; if (!(a && a.c)) x();", "var a$b = 0; var a = {}; var a$c = 1; if (!(a && a$c)) x();"); 
 } 


public void testDelete91300() { 
     testSame("var x = {};" + "x.foo = {};" + "x.foo.bar = 3;" + "delete x.foo;"); 
 } 


public void testObjLitAssignedInTernaryExpression21325() { 
     testSame("a = x ? {b: 0} : {b: 1}; var c = a.b;"); 
 } 


public void testBug19743711346() { 
     test("/** @enum {Object} */ var Foo = {A: {c: 2}, B: {c: 3}};" + "for (var key in Foo) {}", "var Foo$A = {c: 2}; var Foo$B = {c: 3};" + "var Foo = {A: Foo$A, B: Foo$B};" + "for (var key in Foo) {}"); 
 } 


public void testGlobalVarSetToObjLitConditionally21517() { 
     test("if (x) var a = {b: 0}; var c = a.b; var d = a.c;", "if (x){ var a$b = 0; var a = {}; }var c = a$b; var d = a.c;"); 
 } 


public void testAliasCreatedForEnumOfObjects21562() { 
     test("var a = {}; " + "/** @enum {Object} */ a.b = {c: {d: 1}}; a.b.c.d;" + "searchEnum(a.b);", "var a$b$c = {d: 1};var a$b = {c: a$b$c}; a$b$c.d; " + "searchEnum(a$b)"); 
 } 


public void testTypedef21602() { 
     test("var foo = {};" + "/** @typedef {number} */ foo.Bar.Baz;" + "foo.Bar = function() {};", "var foo$Bar$Baz; var foo$Bar = function(){};"); 
 } 


public void testCallToRedefinedFunction1684() { 
     test("var a = {}; a.b = function(){}; a.b = function(){}; a.b();", "var a$b = function(){}; a$b = function(){}; a$b();"); 
 } 


public void testDelete111688() { 
     test("var x = {};" + "x.foo = {};" + "/** @constructor */ x.foo.Bar = function() {};" + "delete x.foo;", "var x = {};" + "x.foo = {};" + "var x$foo$Bar = function() {};" + "delete x.foo;", null, CollapseProperties.NAMESPACE_REDEFINED_WARNING); 
 } 


public void testObjLitDeclarationWithSet11790() { 
     testSame("var a = {set b(a){}};"); 
 } 


public void testPrototypePropertySetToAnObjectLiteral1817() { 
     test("var a = {b: function(){}}; a.b.prototype.c = {d: 0};", "var a$b = function(){}; a$b.prototype.c = {d: 0};"); 
 } 


public void testNamespaceResetInLocalScope21860() { 
     test("var a = {}; function f() { a = {}; }" + " /** @constructor */a.b = function() {};", "var a = {}; function f() { a = {}; }" + " var a$b = function() {};", null, CollapseProperties.NAMESPACE_REDEFINED_WARNING); 
 } 


public void testAliasCreatedForEnumDepth1_11909() { 
     test("/** @enum */ var a = {b: 0}; var c = a; c.b = 1; a.b != c.b;", "var a$b = 0; var a = {b: a$b}; var c = a; c.b = 1; a$b != c.b;"); 
 } 


public void testNoInlineGetpropIntoCall1930() { 
     test("var b = x; function f() { var a = b; a(); }", "var b = x; function f() { var a = null; b(); }"); 
     test("var b = {}; b.c = x; function f() { var a = b.c; a(); }", "var b$c = x; function f() { var a = null; b$c(); }"); 
 } 


public void testDelete71967() { 
     test("var x = {};" + "x.foo = {bar: 3};" + "delete x.foo.bar;", "var x$foo = {bar: 3};" + "delete x$foo.bar;"); 
 } 


public void testPropWithDollarSign21969() { 
     test("var a = {$: function(){}}", "var a$$0 = function(){};"); 
 } 


public void testAliasCreatedForCtorDepth1_11991() { 
     test("/** @constructor */ var a = function(){}; a.b = 1; " + "var c = a; c.b = 2; a.b != c.b;", "var a = function(){}; var a$b = 1; var c = a; c.b = 2; a$b != c.b;"); 
 } 


public void testObjLitDeclarationWithDuplicateKeys2001() { 
     test("var a = {b: 0, b: 1}; var c = a.b;", "var a$b = 0; var a$b = 1; var c = a$b;", SyntacticScopeCreator.VAR_MULTIPLY_DECLARED_ERROR); 
 } 


public void testGlobalObjectNameInBooleanExpressionDepth1_32095() { 
     test("var a = {b: 0}; a.c = 1; while (a || a.c) x();", "var a$b = 0; var a = {}; var a$c = 1; while (a || a$c) x();"); 
 } 


public void testAddPropertyToChildOfUncollapsibleFunctionInLocalScope2128() { 
     testSame("function a() {} a.b = {x: 0}; var c = a;" + "(function() {a.b.y = 0;})(); a.b.y;"); 
 } 


public void testObjLitAssignmentDepth42143() { 
     test("var a = {}; a.b = {}; a.b.c = {}; a.b.c.d = {e: 1, f: 2}; " + "var g = a.b.c.d.e", "var a$b$c$d$e = 1; var a$b$c$d$f = 2; var g = a$b$c$d$e"); 
 } 


public void testCollapsePropertyOnExternType2296() { 
     collapsePropertiesOnExternTypes = true; 
     test("String.myFunc = function() {}; String.myFunc();", "var String$myFunc = function() {}; String$myFunc()"); 
 } 


public void testStaticFunctionReferencingThis32303() { 
     test("var a = {b: function() {this.c}};", "var a$b = function() { this.c };", null, UNSAFE_THIS); 
 } 


public void testGlobalVarSetToObjLitConditionally1b2335() { 
     test("if (x) var a = {b: 0}; var c = x ? a.b : 0;", "if (x) var a$b = 0; var c = x ? a$b : 0;"); 
 } 


public void testCollapseForEachWithoutExterns2411() { 
     collapsePropertiesOnExternTypes = true; 
     test("/** @constructor */function Array(){};\n", "if (!Array.forEach) {\n" + "  Array.forEach = function() {};\n" + "}", "if (!Array$forEach) {\n" + "  var Array$forEach = function() {};\n" + "}", null, null); 
 } 


public void testObjLitWithUsedNumericKey2445() { 
     testSame("a = {40: {}, c: {}}; var d = a[40]; var e = a.c;"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private final String COMMON_ENUM =
        "/** @enum {Object} */ var Foo = {A: {c: 2}, B: {c: 3}};";

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
