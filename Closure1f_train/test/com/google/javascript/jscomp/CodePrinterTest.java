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

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import junit.framework.TestCase;

import java.util.List;

public class CodePrinterTest extends TestCase {
  boolean trustedStrings = true;

  @Override public void setUp() {
    trustedStrings = true;
  }

  Node parse(String js) {
    return parse(js, false);
  }

  Node parse(String js, boolean checkTypes) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setTrustedStrings(trustedStrings);

    // Allow getters and setters.
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
    Node n = compiler.parseTestCode(js);

    if (checkTypes) {
      DefaultPassConfig passConfig = new DefaultPassConfig(null);
      CompilerPass typeResolver = passConfig.resolveTypes.create(compiler);
      Node externs = new Node(Token.SCRIPT);
      externs.setInputId(new InputId("externs"));
      Node externAndJsRoot = new Node(Token.BLOCK, externs, n);
      externAndJsRoot.setIsSyntheticBlock(true);
      typeResolver.process(externs, n);
      CompilerPass inferTypes = passConfig.inferTypes.create(compiler);
      inferTypes.process(externs, n);
    }

    checkUnexpectedErrorsOrWarnings(compiler, 0);
    return n;
  }

  private static void checkUnexpectedErrorsOrWarnings(
      Compiler compiler, int expected) {
    int actual = compiler.getErrors().length + compiler.getWarnings().length;
    if (actual != expected) {
      String msg = "";
      for (JSError err : compiler.getErrors()) {
        msg += "Error:" + err.toString() + "\n";
      }
      for (JSError err : compiler.getWarnings()) {
        msg += "Warning:" + err.toString() + "\n";
      }
      assertEquals("Unexpected warnings or errors.\n " + msg, expected, actual);
    }
  }

  String parsePrint(String js, boolean prettyprint, int lineThreshold) {
    CompilerOptions options = new CompilerOptions();
    options.setTrustedStrings(trustedStrings);
    options.setPrettyPrint(prettyprint);
    options.setLineLengthThreshold(lineThreshold);
    return new CodePrinter.Builder(parse(js)).setCompilerOptions(options)
        .build();
  }

  String parsePrint(String js, boolean prettyprint, boolean lineBreak,
      int lineThreshold) {
    CompilerOptions options = new CompilerOptions();
    options.setTrustedStrings(trustedStrings);
    options.setPrettyPrint(prettyprint);
    options.setLineLengthThreshold(lineThreshold);
    options.setLineBreak(lineBreak);
    return new CodePrinter.Builder(parse(js)).setCompilerOptions(options)
        .build();
  }

  String parsePrint(String js, boolean prettyprint, boolean lineBreak,
      boolean preferLineBreakAtEof, int lineThreshold) {
    CompilerOptions options = new CompilerOptions();
    options.setTrustedStrings(trustedStrings);
    options.setPrettyPrint(prettyprint);
    options.setLineLengthThreshold(lineThreshold);
    options.setPreferLineBreakAtEndOfFile(preferLineBreakAtEof);
    options.setLineBreak(lineBreak);
    return new CodePrinter.Builder(parse(js)).setCompilerOptions(options)
        .build();
  }

  String parsePrint(String js, boolean prettyprint, boolean lineBreak,
      int lineThreshold, boolean outputTypes) {
    CompilerOptions options = new CompilerOptions();
    options.setTrustedStrings(trustedStrings);
    options.setPrettyPrint(prettyprint);
    options.setLineLengthThreshold(lineThreshold);
    options.setLineBreak(lineBreak);
    return new CodePrinter.Builder(parse(js, true)).setCompilerOptions(options)
        .setOutputTypes(outputTypes)
        .build();
  }

  String parsePrint(String js, boolean prettyprint, boolean lineBreak,
                    int lineThreshold, boolean outputTypes,
                    boolean tagAsStrict) {
    CompilerOptions options = new CompilerOptions();
    options.setTrustedStrings(trustedStrings);
    options.setPrettyPrint(prettyprint);
    options.setLineLengthThreshold(lineThreshold);
    options.setLineBreak(lineBreak);
    return new CodePrinter.Builder(parse(js, true)).setCompilerOptions(options)
        .setOutputTypes(outputTypes)
        .setTagAsStrict(tagAsStrict)
        .build();
  }


  String printNode(Node n) {
    CompilerOptions options = new CompilerOptions();
    options.setLineLengthThreshold(CodePrinter.DEFAULT_LINE_LENGTH_THRESHOLD);
    return new CodePrinter.Builder(n).setCompilerOptions(options).build();
  }

  void assertPrintNode(String expectedJs, Node ast) {
    assertEquals(expectedJs, printNode(ast));
  }


public void testPrint32() { 
     assertPrint("10 + a + b", "10+a+b"); 
     assertPrint("10 + (30*50)", "10+30*50"); 
     assertPrint("with(x) { x + 3; }", "with(x)x+3"); 
     assertPrint("\"aa'a\"", "\"aa'a\""); 
     assertPrint("\"aa\\\"a\"", "'aa\"a'"); 
     assertPrint("function foo()\n{return 10;}", "function foo(){return 10}"); 
     assertPrint("a instanceof b", "a instanceof b"); 
     assertPrint("typeof(a)", "typeof a"); 
     assertPrint("var foo = x ? { a : 1 } : {a: 3, b:4, \"default\": 5, \"foo-bar\": 6}", "var foo=x?{a:1}:{a:3,b:4,\"default\":5,\"foo-bar\":6}"); 
     assertPrint("function foo(){throw 'error';}", "function foo(){throw\"error\";}"); 
     assertPrint("if (true) function foo(){return}", "if(true){function foo(){return}}"); 
     assertPrint("var x = 10; { var y = 20; }", "var x=10;var y=20"); 
     assertPrint("while (x-- > 0);", "while(x-- >0);"); 
     assertPrint("x-- >> 1", "x-- >>1"); 
     assertPrint("(function () {})(); ", "(function(){})()"); 
     assertPrint("var a,b,c,d;a || (b&& c) && (a || d)", "var a,b,c,d;a||b&&c&&(a||d)"); 
     assertPrint("var a,b,c; a || (b || c); a * (b * c); a | (b | c)", "var a,b,c;a||b||c;a*b*c;a|b|c"); 
     assertPrint("var a,b,c; a / b / c;a / (b / c); a - (b - c);", "var a,b,c;a/b/c;a/(b/c);a-(b-c)"); 
     assertPrint("var a,b; a = b = 3;", "var a,b;a=b=3"); 
     assertPrint("var a,b,c,d; a = (b = c = (d = 3));", "var a,b,c,d;a=b=c=d=3"); 
     assertPrint("var a,b,c; a += (b = c += 3);", "var a,b,c;a+=b=c+=3"); 
     assertPrint("var a,b,c; a *= (b -= c);", "var a,b,c;a*=b-=c"); 
     assertPrint("a ? delete b[0] : 3", "a?delete b[0]:3"); 
     assertPrint("(delete a[0])/10", "delete a[0]/10"); 
     assertPrint("new A", "new A"); 
     assertPrint("new A()", "new A"); 
     assertPrint("new A('x')", "new A(\"x\")"); 
     assertPrint("new A().a()", "(new A).a()"); 
     assertPrint("(new A).a()", "(new A).a()"); 
     assertPrint("new A('y').a()", "(new A(\"y\")).a()"); 
     assertPrint("new A.B", "new A.B"); 
     assertPrint("new A.B()", "new A.B"); 
     assertPrint("new A.B('z')", "new A.B(\"z\")"); 
     assertPrint("(new A.B).a()", "(new A.B).a()"); 
     assertPrint("new A.B().a()", "(new A.B).a()"); 
     assertPrint("new A.B('w').a()", "(new A.B(\"w\")).a()"); 
     assertPrint("x + +y", "x+ +y"); 
     assertPrint("x - (-y)", "x- -y"); 
     assertPrint("x++ +y", "x++ +y"); 
     assertPrint("x-- -y", "x-- -y"); 
     assertPrint("x++ -y", "x++-y"); 
     assertPrint("foo:for(;;){break foo;}", "foo:for(;;)break foo"); 
     assertPrint("foo:while(1){continue foo;}", "foo:while(1)continue foo"); 
     assertPrint("({})", "({})"); 
     assertPrint("var x = {};", "var x={}"); 
     assertPrint("({}).x", "({}).x"); 
     assertPrint("({})['x']", "({})[\"x\"]"); 
     assertPrint("({}) instanceof Object", "({})instanceof Object"); 
     assertPrint("({}) || 1", "({})||1"); 
     assertPrint("1 || ({})", "1||{}"); 
     assertPrint("({}) ? 1 : 2", "({})?1:2"); 
     assertPrint("0 ? ({}) : 2", "0?{}:2"); 
     assertPrint("0 ? 1 : ({})", "0?1:{}"); 
     assertPrint("typeof ({})", "typeof{}"); 
     assertPrint("f({})", "f({})"); 
     assertPrint("(function(){})", "(function(){})"); 
     assertPrint("(function(){})()", "(function(){})()"); 
     assertPrint("(function(){})instanceof Object", "(function(){})instanceof Object"); 
     assertPrint("(function(){}).bind().call()", "(function(){}).bind().call()"); 
     assertPrint("var x = function() { };", "var x=function(){}"); 
     assertPrint("var x = function() { }();", "var x=function(){}()"); 
     assertPrint("(function() {}), 2", "(function(){}),2"); 
     assertPrint("(function f(){})", "(function f(){})"); 
     assertPrint("function f(){}", "function f(){}"); 
     assertPrint("({ 'a': 4, '\\u0100': 4 })", "({\"a\":4,\"\\u0100\":4})"); 
     assertPrint("({ a: 4, '\\u0100': 4 })", "({a:4,\"\\u0100\":4})"); 
     assertPrint("if (true) { alert();}", "if(true)alert()"); 
     assertPrint("if (false) {} else {alert(\"a\");}", "if(false);else alert(\"a\")"); 
     assertPrint("for(;;) { alert();};", "for(;;)alert()"); 
     assertPrint("do { alert(); } while(true);", "do alert();while(true)"); 
     assertPrint("myLabel: { alert();}", "myLabel:alert()"); 
     assertPrint("myLabel: for(;;) continue myLabel;", "myLabel:for(;;)continue myLabel"); 
     assertPrint("if (true) var x; x = 4;", "if(true)var x;x=4"); 
     assertPrint("\\u00fb", "\\u00fb"); 
     assertPrint("\\u00fa=1", "\\u00fa=1"); 
     assertPrint("function \\u00f9(){}", "function \\u00f9(){}"); 
     assertPrint("x.\\u00f8", "x.\\u00f8"); 
     assertPrint("x.\\u00f8", "x.\\u00f8"); 
     assertPrint("abc\\u4e00\\u4e01jkl", "abc\\u4e00\\u4e01jkl"); 
     assertPrint("! ! true", "!!true"); 
     assertPrint("!(!(true))", "!!true"); 
     assertPrint("typeof(void(0))", "typeof void 0"); 
     assertPrint("typeof(void(!0))", "typeof void!0"); 
     assertPrint("+ - + + - + 3", "+-+ +-+3"); 
     assertPrint("+(--x)", "+--x"); 
     assertPrint("-(++x)", "-++x"); 
     assertPrint("-(--x)", "- --x"); 
     assertPrint("!(~~5)", "!~~5"); 
     assertPrint("~(a/b)", "~(a/b)"); 
     assertPrint("new (foo.bar()).factory(baz)", "new (foo.bar().factory)(baz)"); 
     assertPrint("new (bar()).factory(baz)", "new (bar().factory)(baz)"); 
     assertPrint("new (new foobar(x)).factory(baz)", "new (new foobar(x)).factory(baz)"); 
     assertPrint("a ? b : (c ? d : e)", "a?b:c?d:e"); 
     assertPrint("a ? (b ? c : d) : e", "a?b?c:d:e"); 
     assertPrint("(a ? b : c) ? d : e", "(a?b:c)?d:e"); 
     assertPrint("if (x) if (y); else;", "if(x)if(y);else;"); 
     assertPrint("a,b,c", "a,b,c"); 
     assertPrint("(a,b),c", "a,b,c"); 
     assertPrint("a,(b,c)", "a,b,c"); 
     assertPrint("x=a,b,c", "x=a,b,c"); 
     assertPrint("x=(a,b),c", "x=(a,b),c"); 
     assertPrint("x=a,(b,c)", "x=a,b,c"); 
     assertPrint("x=a,y=b,z=c", "x=a,y=b,z=c"); 
     assertPrint("x=(a,y=b,z=c)", "x=(a,y=b,z=c)"); 
     assertPrint("x=[a,b,c,d]", "x=[a,b,c,d]"); 
     assertPrint("x=[(a,b,c),d]", "x=[(a,b,c),d]"); 
     assertPrint("x=[(a,(b,c)),d]", "x=[(a,b,c),d]"); 
     assertPrint("x=[a,(b,c,d)]", "x=[a,(b,c,d)]"); 
     assertPrint("var x=(a,b)", "var x=(a,b)"); 
     assertPrint("var x=a,b,c", "var x=a,b,c"); 
     assertPrint("var x=(a,b),c", "var x=(a,b),c"); 
     assertPrint("var x=a,b=(c,d)", "var x=a,b=(c,d)"); 
     assertPrint("foo(a,b,c,d)", "foo(a,b,c,d)"); 
     assertPrint("foo((a,b,c),d)", "foo((a,b,c),d)"); 
     assertPrint("foo((a,(b,c)),d)", "foo((a,b,c),d)"); 
     assertPrint("f(a+b,(c,d,(e,f,g)))", "f(a+b,(c,d,e,f,g))"); 
     assertPrint("({}) , 1 , 2", "({}),1,2"); 
     assertPrint("({}) , {} , {}", "({}),{},{}"); 
     assertPrint("if (x){}", "if(x);"); 
     assertPrint("if(x);", "if(x);"); 
     assertPrint("if(x)if(y);", "if(x)if(y);"); 
     assertPrint("if(x){if(y);}", "if(x)if(y);"); 
     assertPrint("if(x){if(y){};;;}", "if(x)if(y);"); 
     assertPrint("if(x){;;function y(){};;}", "if(x){function y(){}}"); 
 } 


public void testParsePrintParse51() { 
     testReparse("3;"); 
     testReparse("var a = b;"); 
     testReparse("var x, y, z;"); 
     testReparse("try { foo() } catch(e) { bar() }"); 
     testReparse("try { foo() } catch(e) { bar() } finally { stuff() }"); 
     testReparse("try { foo() } finally { stuff() }"); 
     testReparse("throw 'me'"); 
     testReparse("function foo(a) { return a + 4; }"); 
     testReparse("function foo() { return; }"); 
     testReparse("var a = function(a, b) { foo(); return a + b; }"); 
     testReparse("b = [3, 4, 'paul', \"Buchhe it\",,5];"); 
     testReparse("v = (5, 6, 7, 8)"); 
     testReparse("d = 34.0; x = 0; y = .3; z = -22"); 
     testReparse("d = -x; t = !x + ~y;"); 
     testReparse("'hi'; /* just a test */ stuff(a,b) \n" + " foo(); // and another \n" + " bar();"); 
     testReparse("a = b++ + ++c; a = b++-++c; a = - --b; a = - ++b;"); 
     testReparse("a++; b= a++; b = ++a; b = a--; b = --a; a+=2; b-=5"); 
     testReparse("a = (2 + 3) * 4;"); 
     testReparse("a = 1 + (2 + 3) + 4;"); 
     testReparse("x = a ? b : c; x = a ? (b,3,5) : (foo(),bar());"); 
     testReparse("a = b | c || d ^ e " + "&& f & !g != h << i <= j < k >>> l > m * n % !o"); 
     testReparse("a == b; a != b; a === b; a == b == a;" + " (a == b) == a; a == (b == a);"); 
     testReparse("if (a > b) a = b; if (b < 3) a = 3; else c = 4;"); 
     testReparse("if (a == b) { a++; } if (a == 0) { a++; } else { a --; }"); 
     testReparse("for (var i in a) b += i;"); 
     testReparse("for (var i = 0; i < 10; i++){ b /= 2;" + " if (b == 2)break;else continue;}"); 
     testReparse("for (x = 0; x < 10; x++) a /= 2;"); 
     testReparse("for (;;) a++;"); 
     testReparse("while(true) { blah(); }while(true) blah();"); 
     testReparse("do stuff(); while(a>b);"); 
     testReparse("[0, null, , true, false, this];"); 
     testReparse("s.replace(/absc/, 'X').replace(/ab/gi, 'Y');"); 
     testReparse("new Foo; new Bar(a, b,c);"); 
     testReparse("with(foo()) { x = z; y = t; } with(bar()) a = z;"); 
     testReparse("delete foo['bar']; delete foo;"); 
     testReparse("var x = { 'a':'paul', 1:'3', 2:(3,4) };"); 
     testReparse("switch(a) { case 2: case 3: stuff(); break;" + "case 4: morestuff(); break; default: done();}"); 
     testReparse("x = foo['bar'] + foo['my stuff'] + foo[bar] + f.stuff;"); 
     testReparse("a.v = b.v; x['foo'] = y['zoo'];"); 
     testReparse("'test' in x; 3 in x; a in x;"); 
     testReparse("'foo\"bar' + \"foo'c\" + 'stuff\\n and \\\\more'"); 
     testReparse("x.__proto__;"); 
 } 


public void testFunctionWithCall95() { 
     assertPrint("var user = new function() {" + "alert(\"foo\")}", "var user=new function(){" + "alert(\"foo\")}"); 
     assertPrint("var user = new function() {" + "this.name = \"foo\";" + "this.local = function(){alert(this.name)};}", "var user=new function(){" + "this.name=\"foo\";" + "this.local=function(){alert(this.name)}}"); 
 } 


public void testPrettyPrinter317() { 
     assertPrettyPrint("(function(){})();", "(function() {\n})();\n"); 
     assertPrettyPrint("var a = (function() {});alert(a);", "var a = function() {\n};\nalert(a);\n"); 
     assertPrettyPrint("if (1) {}", "if(1) {\n" + "}\n"); 
     assertPrettyPrint("if (1) {alert(\"\");}", "if(1) {\n" + "  alert(\"\")\n" + "}\n"); 
     assertPrettyPrint("if (1)alert(\"\");", "if(1) {\n" + "  alert(\"\")\n" + "}\n"); 
     assertPrettyPrint("if (1) {alert();alert();}", "if(1) {\n" + "  alert();\n" + "  alert()\n" + "}\n"); 
     assertPrettyPrint("label: alert();", "label:alert();\n"); 
     assertPrettyPrint("if (1) alert();", "if(1) {\n" + "  alert()\n" + "}\n"); 
     assertPrettyPrint("for (;;) alert();", "for(;;) {\n" + "  alert()\n" + "}\n"); 
     assertPrettyPrint("while (1) alert();", "while(1) {\n" + "  alert()\n" + "}\n"); 
     assertPrettyPrint("if (1) {} else {alert(a);}", "if(1) {\n" + "}else {\n  alert(a)\n}\n"); 
     assertPrettyPrint("if (1) alert(a); else alert(b);", "if(1) {\n" + "  alert(a)\n" + "}else {\n" + "  alert(b)\n" + "}\n"); 
     assertPrettyPrint("for(;;) { alert();}", "for(;;) {\n" + "  alert()\n" + "}\n"); 
     assertPrettyPrint("for(;;) {}", "for(;;) {\n" + "}\n"); 
     assertPrettyPrint("for(;;) { alert(); alert(); }", "for(;;) {\n" + "  alert();\n" + "  alert()\n" + "}\n"); 
     assertPrettyPrint("do { alert(); } while(true);", "do {\n" + "  alert()\n" + "}while(true);\n"); 
     assertPrettyPrint("myLabel: { alert();}", "myLabel: {\n" + "  alert()\n" + "}\n"); 
     assertPrettyPrint("myLabel: for(;;) continue myLabel;", "myLabel:for(;;) {\n" + "  continue myLabel\n" + "}\n"); 
     assertPrettyPrint("var a;", "var a;\n"); 
 } 


public void testStringEscapeSequences482() { 
     assertPrintSame("var x=\"\\b\""); 
     assertPrintSame("var x=\"\\f\""); 
     assertPrintSame("var x=\"\\n\""); 
     assertPrintSame("var x=\"\\r\""); 
     assertPrintSame("var x=\"\\t\""); 
     assertPrintSame("var x=\"\\v\""); 
     assertPrint("var x=\"\\\"\"", "var x='\"'"); 
     assertPrint("var x=\"\\\'\"", "var x=\"'\""); 
     assertPrint("var x=\"\\u000A\"", "var x=\"\\n\""); 
     assertPrint("var x=\"\\u000D\"", "var x=\"\\r\""); 
     assertPrintSame("var x=\"\\u2028\""); 
     assertPrintSame("var x=\"\\u2029\""); 
     assertPrintSame("var x=/\\b/"); 
     assertPrintSame("var x=/\\f/"); 
     assertPrintSame("var x=/\\n/"); 
     assertPrintSame("var x=/\\r/"); 
     assertPrintSame("var x=/\\t/"); 
     assertPrintSame("var x=/\\v/"); 
     assertPrintSame("var x=/\\u000A/"); 
     assertPrintSame("var x=/\\u000D/"); 
     assertPrintSame("var x=/\\u2028/"); 
     assertPrintSame("var x=/\\u2029/"); 
 } 


public void testTypeAnnotationsImplements517() { 
     assertTypeAnnotations("var a = {};" + "/** @constructor */ a.Foo = function(){};\n" + "/** @interface */ a.I = function(){};\n" + "/** @interface */ a.I2 = function(){};\n" + "/** @constructor \n @extends {a.Foo}\n" + " * @implements {a.I} \n @implements {a.I2}\n" + "*/ a.Bar = function(){}", "var a = {};\n" + "/**\n * @return {undefined}\n * @constructor\n */\n" + "a.Foo = function() {\n};\n" + "/**\n * @interface\n */\n" + "a.I = function() {\n};\n" + "/**\n * @interface\n */\n" + "a.I2 = function() {\n};\n" + "/**\n * @return {undefined}\n * @extends {a.Foo}\n" + " * @implements {a.I}\n" + " * @implements {a.I2}\n * @constructor\n */\n" + "a.Bar = function() {\n};\n"); 
 } 


public void testPreferLineBreakAtEndOfFile565() { 
     assertLineBreakAtEndOfFile("\"1234567890\";", "\"1234567890\"", "\"1234567890\""); 
     assertLineBreakAtEndOfFile("\"123456789012345678901234567890\";\"1234567890\"", "\"123456789012345678901234567890\";\n\"1234567890\"", "\"123456789012345678901234567890\"; \"1234567890\";\n"); 
     assertLineBreakAtEndOfFile("var12345678901234567890123456 instanceof Object;", "var12345678901234567890123456 instanceof\nObject", "var12345678901234567890123456 instanceof Object;\n"); 
     assertLineBreakAtEndOfFile("\"1234567890\";\"12345678901234567890\";", "\"1234567890\";\"12345678901234567890\"", "\"1234567890\";\"12345678901234567890\";\n"); 
     assertLineBreakAtEndOfFile("\"123456789012345678901234567890\";\"12345678901234567890\";", "\"123456789012345678901234567890\";\n\"12345678901234567890\"", "\"123456789012345678901234567890\";\n\"12345678901234567890\";\n"); 
 } 


public void testManyCommas566() { 
     int numCommas = 10000; 
     List<String> numbers = Lists.newArrayList("0", "1"); 
     Node current = new Node(Token.COMMA, Node.newNumber(0), Node.newNumber(1)); 
     for (int i = 2; i < numCommas; i++) { 
         current = new Node(Token.COMMA, current); 
         int num = i % 1000; 
         numbers.add(String.valueOf(num)); 
         current.addChildToBack(Node.newNumber(num)); 
     } 
     String expected = Joiner.on(",").join(numbers); 
     String actual = printNode(current).replace("\n", ""); 
     assertEquals(expected, actual); 
 } 


public void testU2UFunctionTypeAnnotation596() { 
     assertTypeAnnotations("/** @type {!Function} */ var x = function() {}", "/**\n * @constructor\n */\nvar x = function() {\n};\n"); 
 } 


public void testPrettyPrinter4847() { 
     assertPrettyPrint("function f() {}if (1) {alert();}", "function f() {\n" + "}\n" + "if(1) {\n" + "  alert()\n" + "}\n"); 
     assertPrettyPrint("var f = function() {};if (1) {alert();}", "var f = function() {\n" + "};\n" + "if(1) {\n" + "  alert()\n" + "}\n"); 
     assertPrettyPrint("(function() {})();if (1) {alert();}", "(function() {\n" + "})();\n" + "if(1) {\n" + "  alert()\n" + "}\n"); 
     assertPrettyPrint("(function() {alert();alert();})();if (1) {alert();}", "(function() {\n" + "  alert();\n" + "  alert()\n" + "})();\n" + "if(1) {\n" + "  alert()\n" + "}\n"); 
 } 


public void testTypeAnnotations982() { 
     assertTypeAnnotations("/** @constructor */ function Foo(){}", "/**\n * @return {undefined}\n * @constructor\n */\n" + "function Foo() {\n}\n"); 
 } 


public void testTypeAnnotationsInterface1014() { 
     assertTypeAnnotations("var a = {};" + "/** @interface */ a.Foo = function(){};" + "/** @interface \n @extends {a.Foo} */ a.Bar = function(){}", "var a = {};\n" + "/**\n * @interface\n */\n" + "a.Foo = function() {\n};\n" + "/**\n * @extends {a.Foo}\n" + " * @interface\n */\n" + "a.Bar = function() {\n};\n"); 
 } 


public void testLiteralProperty1153() { 
     assertPrint("(64).toString()", "(64).toString()"); 
 } 


public void testPrettyPrinter31200() { 
     assertPrettyPrint("try {} catch(e) {}if (1) {alert();alert();}", "try {\n" + "}catch(e) {\n" + "}\n" + "if(1) {\n" + "  alert();\n" + "  alert()\n" + "}\n"); 
     assertPrettyPrint("try {} finally {}if (1) {alert();alert();}", "try {\n" + "}finally {\n" + "}\n" + "if(1) {\n" + "  alert();\n" + "  alert()\n" + "}\n"); 
     assertPrettyPrint("try {} catch(e) {} finally {} if (1) {alert();alert();}", "try {\n" + "}catch(e) {\n" + "}finally {\n" + "}\n" + "if(1) {\n" + "  alert();\n" + "  alert()\n" + "}\n"); 
 } 


public void testTypeAnnotationsDispatcher21350() { 
     assertTypeAnnotations("var a = {};\n" + "/** \n" + " * @constructor \n" + " */\n" + "a.Foo = function(){}\n" + "/**\n" + " * @javadispatch\n" + " */\n" + "a.Foo.prototype.foo = function() {};", "var a = {};\n" + "/**\n" + " * @return {undefined}\n" + " * @constructor\n" + " */\n" + "a.Foo = function() {\n" + "};\n" + "/**\n" + " * @return {undefined}\n" + " * @javadispatch\n" + " */\n" + "a.Foo.prototype.foo = function() {\n" + "};\n"); 
 } 


public void testBreakUntrustedStrings1382() { 
     trustedStrings = false; 
     assertPrint("'<script>'", "\"\\x3cscript\\x3e\""); 
     assertPrint("'</script>'", "\"\\x3c/script\\x3e\""); 
     assertPrint("\"</script> </SCRIPT>\"", "\"\\x3c/script\\x3e \\x3c/SCRIPT\\x3e\""); 
     assertPrint("'-->'", "\"--\\x3e\""); 
     assertPrint("']]>'", "\"]]\\x3e\""); 
     assertPrint("' --></script>'", "\" --\\x3e\\x3c/script\\x3e\""); 
     assertPrint("/--> <\\/script>/g", "/--\\x3e <\\/script>/g"); 
     assertPrint("'<!-- I am a string -->'", "\"\\x3c!-- I am a string --\\x3e\""); 
     assertPrint("'<=&>'", "\"\\x3c\\x3d\\x26\\x3e\""); 
     assertPrint("/(?=x)/", "/(?=x)/"); 
 } 


public void testEnumAnnotation21391() { 
     assertTypeAnnotations("var goog = goog || {};" + "/** @enum {string} */ goog.Enum = {FOO: 'x', BAR: 'y'};" + "/** @const */ goog.Enum2 = goog.x ? {} : goog.Enum;", "var goog = goog || {};\n" + "/** @enum {string} */\ngoog.Enum = {FOO:\"x\", BAR:\"y\"};\n" + "/** @type {(Object|{})} */\ngoog.Enum2 = goog.x ? {} : goog.Enum;\n"); 
 } 


public void testMinusNegativeZero1558() { 
     assertPrint("x- -0", "x- -0"); 
 } 


public void testEnumAnnotation11811() { 
     assertTypeAnnotations("/** @enum {string} */ var Enum = {FOO: 'x', BAR: 'y'};", "/** @enum {string} */\nvar Enum = {FOO:\"x\", BAR:\"y\"};\n"); 
 } 


public void testPrintScript1823() { 
     Node ast = new Node(Token.SCRIPT, new Node(Token.EXPR_RESULT, Node.newString("f")), new Node(Token.EXPR_RESULT, Node.newString("g"))); 
     String result = new CodePrinter.Builder(ast).setPrettyPrint(true).build(); 
     assertEquals("\"f\";\n\"g\";\n", result); 
 } 


public void testZero1932() { 
     assertPrint("var x ='\\0';", "var x=\"\\x00\""); 
     assertPrint("var x ='\\x00';", "var x=\"\\x00\""); 
     assertPrint("var x ='\\u0000';", "var x=\"\\x00\""); 
     assertPrint("var x ='\\u00003';", "var x=\"\\x003\""); 
 } 


public void testExponents2016() { 
     assertPrintNumber("1", 1); 
     assertPrintNumber("10", 10); 
     assertPrintNumber("100", 100); 
     assertPrintNumber("1E3", 1000); 
     assertPrintNumber("1E4", 10000); 
     assertPrintNumber("1E5", 100000); 
     assertPrintNumber("-1", -1); 
     assertPrintNumber("-10", -10); 
     assertPrintNumber("-100", -100); 
     assertPrintNumber("-1E3", -1000); 
     assertPrintNumber("-12341234E4", -123412340000L); 
     assertPrintNumber("1E18", 1000000000000000000L); 
     assertPrintNumber("1E5", 100000.0); 
     assertPrintNumber("100000.1", 100000.1); 
     assertPrintNumber("1E-6", 0.000001); 
     assertPrintNumber("-0x38d7ea4c68001", -0x38d7ea4c68001L); 
     assertPrintNumber("0x38d7ea4c68001", 0x38d7ea4c68001L); 
 } 


public void testObjectLit22068() { 
     assertPrint("var x={1:1}", "var x={1:1}"); 
     assertPrint("var x={'1':1}", "var x={1:1}"); 
     assertPrint("var x={'1.0':1}", "var x={\"1.0\":1}"); 
     assertPrint("var x={1.5:1}", "var x={\"1.5\":1}"); 
 } 


public void testStrict2135() { 
     String result = parsePrint("var x", false, false, 0, false, true); 
     assertEquals("'use strict';var x", result); 
 } 


public void testLineLength2144() { 
     assertLineLength("var aba,bcb,cdc", "var aba,bcb," + "\ncdc"); 
     assertLineLength("\"foo\"+\"bar,baz,bomb\"+\"whee\"+\";long-string\"\n+\"aaa\"", "\"foo\"+\"bar,baz,bomb\"+" + "\n\"whee\"+\";long-string\"+" + "\n\"aaa\""); 
     assertLineLength("var abazaba=1234", "var abazaba=" + "\n1234"); 
     assertLineLength("var abab=1;var bab=2", "var abab=1;" + "\nvar bab=2"); 
     assertLineLength("var a=/some[reg](ex),with.*we?rd|chars/i;var b=a", "var a=/some[reg](ex),with.*we?rd|chars/i;" + "\nvar b=a"); 
     assertLineLength("var a=\"foo,{bar};baz\";var b=a", "var a=\"foo,{bar};baz\";" + "\nvar b=a"); 
     assertLineLength("var a=\"a\";a++;var b=\"bbb\";", "var a=\"a\";a++;\n" + "var b=\"bbb\""); 
 } 


public void testObjectLit32156() { 
     assertPrint("var x={3E9:1}", "var x={3E9:1}"); 
     assertPrint("var x={'3000000000':1}", "var x={3E9:1}"); 
     assertPrint("var x={'3000000001':1}", "var x={3000000001:1}"); 
     assertPrint("var x={'6000000001':1}", "var x={6000000001:1}"); 
     assertPrint("var x={\"12345678901234567\":1}", "var x={\"12345678901234567\":1}"); 
 } 


public void testEmitUnknownParamTypesAsAllType2190() { 
     assertTypeAnnotations("var a = function(x) {}", "/**\n" + " * @param {*} x\n" + " * @return {undefined}\n" + " */\n" + "var a = function(x) {\n};\n"); 
 } 


public void testLineBreak2229() { 
     assertLineBreak("function a() {}\n" + "function b() {}", "function a(){}\n" + "function b(){}\n"); 
     assertLineBreak("var a = {};\n" + "a.foo = function () {}\n" + "function b() {}", "var a={};a.foo=function(){};\n" + "function b(){}\n"); 
     assertLineBreak("var a = {\n" + "  b: function() {},\n" + "  c: function() {}\n" + "};\n" + "alert(a);", "var a={b:function(){},\n" + "c:function(){}};\n" + "alert(a)"); 
 } 


public void testBreakTrustedStrings2258() { 
     assertPrint("'<script>'", "\"<script>\""); 
     assertPrint("'</script>'", "\"\\x3c/script>\""); 
     assertPrint("\"</script> </SCRIPT>\"", "\"\\x3c/script> \\x3c/SCRIPT>\""); 
     assertPrint("'-->'", "\"--\\x3e\""); 
     assertPrint("']]>'", "\"]]\\x3e\""); 
     assertPrint("' --></script>'", "\" --\\x3e\\x3c/script>\""); 
     assertPrint("/--> <\\/script>/g", "/--\\x3e <\\/script>/g"); 
     assertPrint("'<!-- I am a string -->'", "\"\\x3c!-- I am a string --\\x3e\""); 
     assertPrint("'<=&>'", "\"<=&>\""); 
 } 


public void testArrayLiteral2341() { 
     assertPrint("var x = [,];", "var x=[,]"); 
     assertPrint("var x = [,,];", "var x=[,,]"); 
     assertPrint("var x = [,s,,];", "var x=[,s,,]"); 
     assertPrint("var x = [,s];", "var x=[,s]"); 
     assertPrint("var x = [s,];", "var x=[s]"); 
 } 


public void testIssue6202410() { 
     assertPrint("alert(/ / / / /);", "alert(/ // / /)"); 
     assertPrint("alert(/ // / /);", "alert(/ // / /)"); 
 } 

  

  

  

  

  

  

  

  private void assertPrint(String js, String expected) {
    parse(expected); // validate the expected string is valid JS
    assertEquals(expected,
        parsePrint(js, false, CodePrinter.DEFAULT_LINE_LENGTH_THRESHOLD));
  }

  private void assertPrintSame(String js) {
    assertPrint(js, js);
  }

  // Make sure that the code generator doesn't associate an
  // else clause with the wrong if clause.
  

  

  private void assertLineBreak(String js, String expected) {
    assertEquals(expected,
        parsePrint(js, false, true,
            CodePrinter.DEFAULT_LINE_LENGTH_THRESHOLD));
  }

  

  private void assertLineBreakAtEndOfFile(String js,
      String expectedWithoutBreakAtEnd, String expectedWithBreakAtEnd) {
    assertEquals(expectedWithoutBreakAtEnd,
        parsePrint(js, false, false, false, 30));
    assertEquals(expectedWithBreakAtEnd,
        parsePrint(js, false, false, true, 30));
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertPrettyPrint(String js, String expected) {
    assertEquals(expected,
        parsePrint(js, true, false,
            CodePrinter.DEFAULT_LINE_LENGTH_THRESHOLD));
  }

  private void assertTypeAnnotations(String js, String expected) {
    assertEquals(expected,
        parsePrint(js, true, false,
            CodePrinter.DEFAULT_LINE_LENGTH_THRESHOLD, true));
  }

  

  

  

  private void assertLineLength(String js, String expected) {
    assertEquals(expected,
        parsePrint(js, false, true, 10));
  }

  

  private void testReparse(String code) {
    Compiler compiler = new Compiler();
    Node parse1 = parse(code);
    Node parse2 = parse(new CodePrinter.Builder(parse1).build());
    String explanation = parse1.checkTreeEquals(parse2);
    assertNull("\nExpected: " + compiler.toSource(parse1) +
        "\nResult: " + compiler.toSource(parse2) +
        "\n" + explanation, explanation);
  }

  

  

  

  // Make sure to test as both a String and a Node, because
  // negative numbers do not parse consistently from strings.
  private void assertPrintNumber(String expected, double number) {
    assertPrint(String.valueOf(number), expected);
    assertPrintNode(expected, Node.newNumber(number));
  }

  private void assertPrintNumber(String expected, int number) {
    assertPrint(String.valueOf(number), expected);
    assertPrintNode(expected, Node.newNumber(number));
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
