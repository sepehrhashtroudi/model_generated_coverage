/*
 * Copyright 2004 The Closure Compiler Authors.
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
 * Tests for {@link PeepholeSubstituteAlternateSyntax} in isolation.
 * Tests for the interaction of multiple peephole passes are in
 * PeepholeIntegrationTest.
 */
public class PeepholeSubstituteAlternateSyntaxTest extends CompilerTestCase {

  // Externs for built-in constructors
  // Needed for testFoldLiteralObjectConstructors(),
  // testFoldLiteralArrayConstructors() and testFoldRegExp...()
  private static final String FOLD_CONSTANTS_TEST_EXTERNS =
      "var Object = function f(){};\n" +
      "var RegExp = function f(a){};\n" +
      "var Array = function f(a){};\n";

  private boolean late = true;

  // TODO(user): Remove this when we no longer need to do string comparison.
  private PeepholeSubstituteAlternateSyntaxTest(boolean compareAsTree) {
    super(FOLD_CONSTANTS_TEST_EXTERNS, compareAsTree);
  }

  public PeepholeSubstituteAlternateSyntaxTest() {
    super(FOLD_CONSTANTS_TEST_EXTERNS);
  }

  @Override
  public void setUp() throws Exception {
    late = true;
    super.setUp();
    enableLineNumberCheck(true);
    disableNormalize();
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    CompilerPass peepholePass =
      new PeepholeOptimizationsPass(compiler,
          new PeepholeSubstituteAlternateSyntax(late))
      .setRetraverseOnChange(false);

    return peepholePass;
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  private void foldSame(String js) {
    testSame(js);
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }

  void assertResultString(String js, String expected) {
    assertResultString(js, expected, false);
  }

  // TODO(user): This is same as fold() except it uses string comparison. Any
  // test that needs tell us where a folding is constructing an invalid AST.
  void assertResultString(String js, String expected, boolean normalize) {
    PeepholeSubstituteAlternateSyntaxTest scTest
        = new PeepholeSubstituteAlternateSyntaxTest(false);

    if (normalize) {
      scTest.enableNormalize();
    } else {
      scTest.disableNormalize();
    }

    scTest.test(js, expected);
  }

  /** Check that removing blocks with 1 child works */

public void testFoldReturns29() { 
     fold("function f(){if(x)return 1;else return 2}", "function f(){return x?1:2}"); 
     fold("function f(){if(x)return 1;return 2}", "function f(){return x?1:2}"); 
     fold("function f(){if(x)return;return 2}", "function f(){return x?void 0:2}"); 
     fold("function f(){if(x)return 1+x;else return 2-x}", "function f(){return x?1+x:2-x}"); 
     fold("function f(){if(x)return 1+x;return 2-x}", "function f(){return x?1+x:2-x}"); 
     fold("function f(){if(x)return y += 1;else return y += 2}", "function f(){return x?(y+=1):(y+=2)}"); 
     fold("function f(){if(x)return;else return 2-x}", "function f(){if(x);else return 2-x}"); 
     fold("function f(){if(x)return;return 2-x}", "function f(){return x?void 0:2-x}"); 
     fold("function f(){if(x)return x;else return}", "function f(){if(x)return x;{}}"); 
     fold("function f(){if(x)return x;return}", "function f(){if(x)return x}"); 
     foldSame("function f(){for(var x in y) { return x.y; } return k}"); 
 } 


public void testFoldAssignments39() { 
     fold("function f(){if(x)y=3;else y=4;}", "function f(){y=x?3:4}"); 
     fold("function f(){if(x)y=1+a;else y=2+a;}", "function f(){y=x?1+a:2+a}"); 
     fold("function f(){if(x)y+=1;else y+=2;}", "function f(){y+=x?1:2}"); 
     fold("function f(){if(x)y-=1;else y-=2;}", "function f(){y-=x?1:2}"); 
     fold("function f(){if(x)y%=1;else y%=2;}", "function f(){y%=x?1:2}"); 
     fold("function f(){if(x)y|=1;else y|=2;}", "function f(){y|=x?1:2}"); 
     foldSame("function f(){x ? y-=1 : y+=2}"); 
     foldSame("function f(){x ? y-=1 : z-=1}"); 
     foldSame("function f(){x ? y().a=3 : y().a=4}"); 
 } 


public void testFoldOneChildBlocks143() { 
     late = false; 
     fold("function f(){if(x)a();x=3}", "function f(){x&&a();x=3}"); 
     fold("function f(){if(x){a()}x=3}", "function f(){x&&a();x=3}"); 
     fold("function f(){if(x){return 3}}", "function f(){if(x)return 3}"); 
     fold("function f(){if(x){a()}}", "function f(){x&&a()}"); 
     fold("function f(){if(x){throw 1}}", "function f(){if(x)throw 1;}"); 
     fold("function f(){if(x){foo()}}", "function f(){x&&foo()}"); 
     fold("function f(){if(x){foo()}else{bar()}}", "function f(){x?foo():bar()}"); 
     fold("function f(){if(x){a.b=1}}", "function f(){if(x)a.b=1}"); 
     fold("function f(){if(x){a.b*=1}}", "function f(){x&&(a.b*=1)}"); 
     fold("function f(){if(x){a.b+=1}}", "function f(){x&&(a.b+=1)}"); 
     fold("function f(){if(x){++a.b}}", "function f(){x&&++a.b}"); 
     fold("function f(){if(x){a.foo()}}", "function f(){x&&a.foo()}"); 
     fold("function f(){try{foo()}catch(e){bar(e)}finally{baz()}}", "function f(){try{foo()}catch(e){bar(e)}finally{baz()}}"); 
     fold("function f(){switch(x){case 1:break}}", "function f(){switch(x){case 1:break}}"); 
     fold("function f(){if(e1){do foo();while(e2)}else foo2()}", "function f(){if(e1){do foo();while(e2)}else foo2()}"); 
     fold("if(x){do{foo()}while(y)}else bar()", "if(x){do foo();while(y)}else bar()"); 
     fold("function f(){if(x){if(y)foo()}}", "function f(){x&&y&&foo()}"); 
     fold("function f(){if(x){if(y)foo();else bar()}}", "function f(){x&&(y?foo():bar())}"); 
     fold("function f(){if(x){if(y)foo()}else bar()}", "function f(){x?y&&foo():bar()}"); 
     fold("function f(){if(x){if(y)foo();else bar()}else{baz()}}", "function f(){x?y?foo():bar():baz()}"); 
     fold("if(e1){while(e2){if(e3){foo()}}}else{bar()}", "if(e1)while(e2)e3&&foo();else bar()"); 
     fold("if(e1){with(e2){if(e3){foo()}}}else{bar()}", "if(e1)with(e2)e3&&foo();else bar()"); 
     fold("if(a||b){if(c||d){var x;}}", "if(a||b)if(c||d)var x"); 
     fold("if(x){ if(y){var x;}else{var z;} }", "if(x)if(y)var x;else var z"); 
     fold("if(x){ if(y){var x;}else{var z;} }else{var w}", "if(x)if(y)var x;else var z;else var w"); 
     fold("if (x) {var x;}else { if (y) { var y;} }", "if(x)var x;else if(y)var y"); 
     fold("if(a){if(b){f1();f2();}else if(c){f3();}}else {if(d){f4();}}", "if(a)if(b){f1();f2()}else c&&f3();else d&&f4()"); 
     fold("function f(){foo()}", "function f(){foo()}"); 
     fold("switch(x){case y: foo()}", "switch(x){case y:foo()}"); 
     fold("try{foo()}catch(ex){bar()}finally{baz()}", "try{foo()}catch(ex){bar()}finally{baz()}"); 
 } 


public void testSplitCommaExpressions160() { 
     late = false; 
     foldSame("while (foo(), !0) boo()"); 
     foldSame("var a = (foo(), !0);"); 
     foldSame("a = (foo(), !0);"); 
     foldSame("a:a(),b()"); 
     fold("(x=2), foo()", "x=2; foo()"); 
     fold("foo(), boo();", "foo(); boo()"); 
     fold("(a(), b()), (c(), d());", "a(); b(); (c(), d());"); 
     fold("a(); b(); (c(), d());", "a(); b(); c(); d();"); 
     fold("foo(), true", "foo();true"); 
     fold("foo();true", "foo();1"); 
     fold("function x(){foo(), !0}", "function x(){foo(); !0}"); 
     fold("function x(){foo(); !0}", "function x(){foo(); 1}"); 
 } 


public void testMinimizeExprCondition227() { 
     fold("(x ? true : false) && y()", "x&&y()"); 
     fold("(x ? false : true) && y()", "(!x)&&y()"); 
     fold("(x ? true : y) && y()", "(x || y)&&y()"); 
     fold("(x ? y : false) && y()", "(x && y)&&y()"); 
     fold("(x && true) && y()", "x && y()"); 
     fold("(x && false) && y()", "0&&y()"); 
     fold("(x || true) && y()", "1&&y()"); 
     fold("(x || false) && y()", "x&&y()"); 
 } 


public void testIssue291278() { 
     fold("if (true) { f.onchange(); }", "if (1) f.onchange();"); 
     foldSame("if (f) { f.onchange(); }"); 
     foldSame("if (f) { f.bar(); } else { f.onchange(); }"); 
     fold("if (f) { f.bonchange(); }", "f && f.bonchange();"); 
     foldSame("if (f) { f['x'](); }"); 
 } 


public void testSubsituteBreakForThrow344() { 
     foldSame("function f() { while(x) { throw Error }}"); 
     fold("function f() { while(x) { throw Error } throw Error }", "function f() { while(x) { break } throw Error}"); 
     foldSame("function f() { while(x) { throw Error(1) } throw Error(2)}"); 
     foldSame("function f() { while(x) { throw Error(1) } return Error(2)}"); 
     foldSame("function f() { while(x) { throw 5 } }"); 
     foldSame("function f() { a: { throw 5 } }"); 
     fold("function f() { while(x) { throw 5}  throw 5}", "function f() { while(x) { break }   throw 5}"); 
     fold("function f() { while(x) { throw x}  throw x}", "function f() { while(x) { break }   throw x}"); 
     foldSame("function f() { while(x) { if (y) { throw Error }}}"); 
     fold("function f() { while(x) { if (y) { throw Error }} throw Error}", "function f() { while(x) { if (y) { break }} throw Error}"); 
     fold("function f() { while(x) { if (y) { throw 5 }} throw 5}", "function f() { while(x) { if (y) { break    }} throw 5}"); 
     fold("function f() { while(x) { if (y) { throw x } x = 1} throw x}", "function f() { while(x) { if (y) { break    } x = 1} throw x}"); 
     fold("function f() { while(x) { if (y) { throw x } throw x} throw x}", "function f() { while(x) { if (y) {} break }throw x}"); 
     foldSame("function f() { while(x) { while (y) { throw Error } } }"); 
     foldSame("function f() { while(1) { throw 7}  throw 5}"); 
     foldSame("function f() {" + "  try { while(x) {throw f()}} catch (e) { } throw f()}"); 
     foldSame("function f() {" + "  try { while(x) {throw f()}} finally {alert(1)} throw f()}"); 
     fold("function f() {" + "  try { while(x) { throw f() } throw f() } catch (e) { } }", "function f() {" + "  try { while(x) { break } throw f() } catch (e) { } }"); 
     foldSame("function f() {" + "  try { while(x) { throw foo() } } finally { alert(1) } " + "  throw foo()}"); 
     fold("function f() {" + "  try { while(x) { throw 1 } } finally { alert(1) } throw 1}", "function f() {" + "  try { while(x) { break    } } finally { alert(1) } throw 1}"); 
     foldSame("function f() { try{ throw a } finally { a = 2 } throw a; }"); 
     fold("function f() { switch(a){ case 1: throw a; default: g();} throw a;}", "function f() { switch(a){ case 1: break; default: g();} throw a; }"); 
 } 


public void testBindToCall2403() { 
     test("(goog$bind(f))()", "f()"); 
     test("(goog$bind(f,a))()", "f.call(a)"); 
     test("(goog$bind(f,a,b))()", "f.call(a,b)"); 
     test("(goog$bind(f))(a)", "f(a)"); 
     test("(goog$bind(f,a))(b)", "f.call(a,b)"); 
     test("(goog$bind(f,a,b))(c)", "f.call(a,b,c)"); 
     test("(goog$partial(f))()", "f()"); 
     test("(goog$partial(f,a))()", "f(a)"); 
     test("(goog$partial(f,a,b))()", "f(a,b)"); 
     test("(goog$partial(f))(a)", "f(a)"); 
     test("(goog$partial(f,a))(b)", "f(a,b)"); 
     test("(goog$partial(f,a,b))(c)", "f(a,b,c)"); 
     testSame("(goog$bind(f)).call(g)"); 
 } 


public void testNotCond520() { 
     fold("function f(){if(!x)foo()}", "function f(){x||foo()}"); 
     fold("function f(){if(!x)b=1}", "function f(){x||(b=1)}"); 
     fold("if(!x)z=1;else if(y)z=2", "if(x){y&&(z=2);}else{z=1;}"); 
     fold("if(x)y&&(z=2);else z=1;", "x ? y&&(z=2) : z=1"); 
     foldSame("function f(){if(!(x=1))a.b=1}"); 
 } 


public void testComma1532() { 
     late = false; 
     fold("1, 2", "1; 2"); 
     fold("1; 2", "1; 1"); 
     late = true; 
     foldSame("1, 2"); 
 } 


public void testRemoveDuplicateReturn540() { 
     fold("function f() { return; }", "function f(){}"); 
     foldSame("function f() { return a; }"); 
     fold("function f() { if (x) { return a } return a; }", "function f() { if (x) {} return a; }"); 
     foldSame("function f() { try { if (x) { return a } } catch(e) {} return a; }"); 
     foldSame("function f() { try { if (x) {} } catch(e) {} return 1; }"); 
     foldSame("function f() { try { if (x) { return a } } finally { a++ } return a; }"); 
     fold("function f() { try { if (x) { return 1 } } finally {} return 1; }", "function f() { try { if (x) {} } finally {} return 1; }"); 
     fold("function f() { switch(a){ case 1: return a; } return a; }", "function f() { switch(a){ case 1: } return a; }"); 
     fold("function f() { switch(a){ " + "  case 1: return a; case 2: return a; } return a; }", "function f() { switch(a){ " + "  case 1: break; case 2: } return a; }"); 
 } 


public void testFoldConditionalVarDeclaration573() { 
     fold("if(x) var y=1;else y=2", "var y=x?1:2"); 
     fold("if(x) y=1;else var y=2", "var y=x?1:2"); 
     foldSame("if(x) var y = 1; z = 2"); 
     foldSame("if(x||y) y = 1; var z = 2"); 
     foldSame("if(x) { var y = 1; print(y)} else y = 2 "); 
     foldSame("if(x) var y = 1; else {y = 2; print(y)}"); 
 } 


public void testFoldLiteralArrayConstructors595() { 
     enableNormalize(); 
     fold("x = new Array", "x = []"); 
     fold("x = new Array()", "x = []"); 
     fold("x = Array()", "x = []"); 
     fold("x = new Array(0)", "x = []"); 
     fold("x = Array(0)", "x = []"); 
     fold("x = new Array(\"a\")", "x = [\"a\"]"); 
     fold("x = Array(\"a\")", "x = [\"a\"]"); 
     fold("x = new Array(7)", "x = Array(7)"); 
     fold("x = Array(7)", "x = Array(7)"); 
     fold("x = new Array(y)", "x = Array(y)"); 
     fold("x = Array(y)", "x = Array(y)"); 
     fold("x = new Array(foo())", "x = Array(foo())"); 
     fold("x = Array(foo())", "x = Array(foo())"); 
     fold("x = new Array(1, 2, 3, 4)", "x = [1, 2, 3, 4]"); 
     fold("x = Array(1, 2, 3, 4)", "x = [1, 2, 3, 4]"); 
     fold("x = new Array('a', 1, 2, 'bc', 3, {}, 'abc')", "x = ['a', 1, 2, 'bc', 3, {}, 'abc']"); 
     fold("x = Array('a', 1, 2, 'bc', 3, {}, 'abc')", "x = ['a', 1, 2, 'bc', 3, {}, 'abc']"); 
     fold("x = new Array(Array(1, '2', 3, '4'))", "x = [[1, '2', 3, '4']]"); 
     fold("x = Array(Array(1, '2', 3, '4'))", "x = [[1, '2', 3, '4']]"); 
     fold("x = new Array(Object(), Array(\"abc\", Object(), Array(Array())))", "x = [{}, [\"abc\", {}, [[]]]]"); 
     fold("x = new Array(Object(), Array(\"abc\", Object(), Array(Array())))", "x = [{}, [\"abc\", {}, [[]]]]"); 
     disableNormalize(); 
     foldSame("x = new Array"); 
     foldSame("x = new Array()"); 
     foldSame("x = Array()"); 
     foldSame("x = new Array(0)"); 
     foldSame("x = Array(0)"); 
     foldSame("x = new Array(\"a\")"); 
     foldSame("x = Array(\"a\")"); 
     foldSame("x = new Array(7)"); 
     foldSame("x = Array(7)"); 
     foldSame("x = new Array(foo())"); 
     foldSame("x = Array(foo())"); 
     foldSame("x = new Array(1, 2, 3, 4)"); 
     foldSame("x = Array(1, 2, 3, 4)"); 
     foldSame("x = new Array('a', 1, 2, 'bc', 3, {}, 'abc')"); 
     foldSame("x = Array('a', 1, 2, 'bc', 3, {}, 'abc')"); 
     foldSame("x = new Array(Array(1, '2', 3, '4'))"); 
     foldSame("x = Array(Array(1, '2', 3, '4'))"); 
     foldSame("x = new Array(" + "Object(), Array(\"abc\", Object(), Array(Array())))"); 
     foldSame("x = new Array(" + "Object(), Array(\"abc\", Object(), Array(Array())))"); 
 } 


public void testMinimizeWhileCondition659() { 
     fold("while(!!true) foo()", "while(1) foo()"); 
     fold("while(!!x) foo()", "while(x) foo()"); 
     fold("while(!(!x&&!y)) foo()", "while(x||y) foo()"); 
     fold("while(x||!!y) foo()", "while(x||y) foo()"); 
     fold("while(!(!!x&&y)) foo()", "while(!x||!y) foo()"); 
     fold("while(!(!x&&y)) foo()", "while(x||!y) foo()"); 
     fold("while(!(x||!y)) foo()", "while(!x&&y) foo()"); 
     fold("while(!(x||y)) foo()", "while(!x&&!y) foo()"); 
     fold("while(!(!x||y-z)) foo()", "while(x&&!(y-z)) foo()"); 
     fold("while(!(!(x/y)||z+w)) foo()", "while(x/y&&!(z+w)) foo()"); 
     foldSame("while(!(x+y||z)) foo()"); 
     foldSame("while(!(x&&y*z)) foo()"); 
     fold("while(!(!!x&&y)) foo()", "while(!x||!y) foo()"); 
     fold("while(x&&!0) foo()", "while(x) foo()"); 
     fold("while(x||!1) foo()", "while(x) foo()"); 
     fold("while(!((x,y)&&z)) foo()", "while(!(x,y)||!z) foo()"); 
 } 


public void testVersionSpecificRegExpQuirks695() { 
     enableNormalize(); 
     enableEcmaScript5(false); 
     fold("x = new RegExp(\"foobar\", \"g\")", "x = RegExp(\"foobar\",\"g\")"); 
     fold("x = new RegExp(\"foobar\", \"ig\")", "x = RegExp(\"foobar\",\"ig\")"); 
     enableEcmaScript5(true); 
     fold("x = new RegExp(\"foobar\", \"ig\")", "x = /foobar/ig"); 
     enableEcmaScript5(false); 
     fold("x = new RegExp(\"\\u2028\")", "x = RegExp(\"\\u2028\")"); 
     fold("x = new RegExp(\"\\\\\\\\u2028\")", "x = /\\\\u2028/"); 
     enableEcmaScript5(true); 
     fold("x = new RegExp(\"\\u2028\\u2029\")", "x = /\\u2028\\u2029/"); 
     fold("x = new RegExp(\"\\\\u2028\")", "x = /\\u2028/"); 
     fold("x = new RegExp(\"\\\\\\\\u2028\")", "x = /\\\\u2028/"); 
 } 


public void testStringArraySplitting708() { 
     testSame("var x=['1','2','3','4']"); 
     testSame("var x=['1','2','3','4','5']"); 
     test("var x=['1','2','3','4','5','6']", "var x='123456'.split('')"); 
     test("var x=['1','2','3','4','5','00']", "var x='1 2 3 4 5 00'.split(' ')"); 
     test("var x=['1','2','3','4','5','6','7']", "var x='1234567'.split('')"); 
     test("var x=['1','2','3','4','5','6','00']", "var x='1 2 3 4 5 6 00'.split(' ')"); 
     test("var x=[' ,',',',',',',',',',',']", "var x=' ,;,;,;,;,;,'.split(';')"); 
     test("var x=[',,',' ',',',',',',',',']", "var x=',,; ;,;,;,;,'.split(';')"); 
     test("var x=['a,',' ',',',',',',',',']", "var x='a,; ;,;,;,;,'.split(';')"); 
     testSame("var x=[',', ' ', ';', '{', '}']"); 
 } 


public void testFoldReturnResult766() { 
     fold("function f(){return false;}", "function f(){return !1}"); 
     foldSame("function f(){return null;}"); 
     fold("function f(){return void 0;}", "function f(){return}"); 
     fold("function f(){return;}", "function f(){}"); 
     foldSame("function f(){return void foo();}"); 
     fold("function f(){return undefined;}", "function f(){return}"); 
     fold("function f(){if(a()){return undefined;}}", "function f(){if(a()){return}}"); 
 } 


public void testFoldRegExpConstructor802() { 
     enableNormalize(); 
     fold("x = new RegExp", "x = RegExp()"); 
     fold("x = new RegExp(\"\")", "x = RegExp(\"\")"); 
     fold("x = new RegExp(\"\", \"i\")", "x = RegExp(\"\",\"i\")"); 
     testSame("x = RegExp(\"foobar\", \"bogus\")", PeepholeSubstituteAlternateSyntax.INVALID_REGULAR_EXPRESSION_FLAGS); 
     fold("x = new RegExp(\"foobar\")", "x = /foobar/"); 
     fold("x = RegExp(\"foobar\")", "x = /foobar/"); 
     fold("x = new RegExp(\"foobar\", \"i\")", "x = /foobar/i"); 
     fold("x = new RegExp(\"\\\\.\", \"i\")", "x = /\\./i"); 
     fold("x = new RegExp(\"/\", \"\")", "x = /\\//"); 
     fold("x = new RegExp(\"[/]\", \"\")", "x = /[/]/"); 
     fold("x = new RegExp(\"///\", \"\")", "x = /\\/\\/\\//"); 
     fold("x = new RegExp(\"\\\\\\/\", \"\")", "x = /\\//"); 
     fold("x = new RegExp(\"\\n\")", "x = /\\n/"); 
     fold("x = new RegExp('\\\\\\r')", "x = /\\r/"); 
     String longRegexp = ""; 
     for (int i = 0; i < 200; i++) longRegexp += "x"; 
     foldSame("x = RegExp(\"" + longRegexp + "\")"); 
     disableNormalize(); 
     foldSame("x = new RegExp(\"foobar\")"); 
 } 


public void testCombineIfs1891() { 
     fold("function f() {if (x) return 1; if (y) return 1}", "function f() {if (x||y) return 1;}"); 
     fold("function f() {if (x) return 1; if (y) foo(); else return 1}", "function f() {if ((!x)&&y) foo(); else return 1;}"); 
 } 


public void testRemoveDuplicateStatements897() { 
     fold("if (a) { x = 1; x++ } else { x = 2; x++ }", "x=(a) ? 1 : 2; x++"); 
     fold("if (a) { x = 1; x++; y += 1; z = pi; }" + " else  { x = 2; x++; y += 1; z = pi; }", "x=(a) ? 1 : 2; x++; y += 1; z = pi;"); 
     fold("function z() {" + "if (a) { foo(); return !0 } else { goo(); return !0 }" + "}", "function z() {(a) ? foo() : goo(); return !0}"); 
     fold("function z() {if (a) { foo(); x = true; return true " + "} else { goo(); x = true; return true }}", "function z() {(a) ? foo() : goo(); x = !0; return !0}"); 
     fold("function z() {" + "  if (a) { bar(); foo(); return true }" + "    else { bar(); goo(); return true }" + "}", "function z() {" + "  if (a) { bar(); foo(); }" + "    else { bar(); goo(); }" + "  return !0;" + "}"); 
 } 


public void testFoldNot954() { 
     fold("while(!(x==y)){a=b;}", "while(x!=y){a=b;}"); 
     fold("while(!(x!=y)){a=b;}", "while(x==y){a=b;}"); 
     fold("while(!(x===y)){a=b;}", "while(x!==y){a=b;}"); 
     fold("while(!(x!==y)){a=b;}", "while(x===y){a=b;}"); 
     foldSame("while(!(x>y)){a=b;}"); 
     foldSame("while(!(x>=y)){a=b;}"); 
     foldSame("while(!(x<y)){a=b;}"); 
     foldSame("while(!(x<=y)){a=b;}"); 
     foldSame("while(!(x<=NaN)){a=b;}"); 
     fold("x = !(y() && true)", "x = !y()"); 
     fold("x = !true", "x = !1"); 
 } 


public void testMinimizeForCondition986() { 
     fold("for(;!!true;) foo()", "for(;1;) foo()"); 
     fold("for(!!true;;) foo()", "for(!0;;) foo()"); 
     fold("for(;!!x;) foo()", "for(;x;) foo()"); 
     foldSame("for(a in b) foo()"); 
     foldSame("for(a in {}) foo()"); 
     foldSame("for(a in []) foo()"); 
     fold("for(a in !!true) foo()", "for(a in !0) foo()"); 
 } 


public void testSimpleFunctionCall1071() { 
     test("var a = String(23)", "var a = '' + 23"); 
     test("var a = String('hello')", "var a = '' + 'hello'"); 
     testSame("var a = String('hello', bar());"); 
     testSame("var a = String({valueOf: function() { return 1; }});"); 
 } 


public void testFoldLoopBreakLate1119() { 
     late = true; 
     fold("for(;;) if (a) break", "for(;!a;);"); 
     foldSame("for(;;) if (a) { f(); break }"); 
     fold("for(;;) if (a) break; else f()", "for(;!a;) { { f(); } }"); 
     fold("for(;a;) if (b) break", "for(;a && !b;);"); 
     fold("for(;a;) { if (b) break; if (c) break; }", "for(;(a && !b);) if (c) break;"); 
     fold("for(;(a && !b);) if (c) break;", "for(;(a && !b) && !c;);"); 
     enableNormalize(true); 
     fold("while(true) if (a) break", "for(;1&&!a;);"); 
 } 


public void testCombineIfs31353() { 
     foldSame("function f() {if (x) return 1; if (y) {g();f()}}"); 
 } 


public void testUndefined1442() { 
     foldSame("var x = undefined"); 
     foldSame("function f(f) {var undefined=2;var x = undefined;}"); 
     this.enableNormalize(); 
     fold("var x = undefined", "var x=void 0"); 
     foldSame("var undefined = 1;" + "function f() {var undefined=2;var x = undefined;}"); 
     foldSame("function f(undefined) {}"); 
     foldSame("try {} catch(undefined) {}"); 
     foldSame("for (undefined in {}) {}"); 
     foldSame("undefined++;"); 
     fold("undefined += undefined;", "undefined += void 0;"); 
 } 


public void testFoldLoopBreakEarly1524() { 
     late = false; 
     foldSame("for(;;) if (a) break"); 
     foldSame("for(;;) if (a) { f(); break }"); 
     foldSame("for(;;) if (a) break; else f()"); 
     foldSame("for(;a;) if (b) break"); 
     foldSame("for(;a;) { if (b) break; if (c) break; }"); 
     foldSame("while(1) if (a) break"); 
     enableNormalize(true); 
     foldSame("while(1) if (a) break"); 
 } 


public void testRemoveElseCause31649() { 
     testSame("function f() { a:{if (x) break a; else f() } }"); 
     testSame("function f() { if (x) { a:{ break a } } else f() }"); 
     testSame("function f() { if (x) a:{ break a } else f() }"); 
 } 


public void testRemoveElseCause11657() { 
     test("function f() { if (x) throw 1; else f() }", "function f() { if (x) throw 1; { f() } }"); 
 } 


public void testNestedIfCombine2002() { 
     fold("if(x)if(y){while(1){}}", "if(x&&y){while(1){}}"); 
     fold("if(x||z)if(y){while(1){}}", "if((x||z)&&y){while(1){}}"); 
     fold("if(x)if(y||z){while(1){}}", "if((x)&&(y||z)){while(1){}}"); 
     foldSame("if(x||z)if(y||z){while(1){}}"); 
     fold("if(x)if(y){if(z){while(1){}}}", "if(x&&y&&z){while(1){}}"); 
 } 


public void testFoldLogicalOpStringCompare2035() { 
     assertResultString("if(foo() && false) z()", "foo()&&0&&z()"); 
 } 


public void testAndParenthesesCount2364() { 
     fold("function f(){if(x||y)a.foo()}", "function f(){(x||y)&&a.foo()}"); 
     fold("function f(){if(x.a)x.a=0}", "function f(){x.a&&(x.a=0)}"); 
     foldSame("function f(){if(x()||y()){x()||y()}}"); 
 } 


public void testRemoveElseCause22402() { 
     test("function f() { if (x) return 1; else f() }", "function f() { if (x) return 1; { f() } }"); 
     test("function f() { if (x) return; else f() }", "function f() { if (x) {} else { f() } }"); 
     testSame("function f() { if (x) return; f() }"); 
 } 


public void testFoldTrueFalse2460() { 
     fold("x = true", "x = !0"); 
     fold("x = false", "x = !1"); 
 } 

  

  /** Try to minimize returns */
  

  

  

  


  /** Try to minimize assignments */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  
  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  private static class StringCompareTestCase extends CompilerTestCase {

    StringCompareTestCase() {
      super("", false);
    }

    @Override
    protected CompilerPass getProcessor(Compiler compiler) {
      CompilerPass peepholePass =
        new PeepholeOptimizationsPass(compiler,
            new PeepholeSubstituteAlternateSyntax(false));
      return peepholePass;
    }

    


  }
}
