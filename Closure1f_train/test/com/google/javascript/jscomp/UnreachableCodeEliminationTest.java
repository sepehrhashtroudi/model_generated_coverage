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

/**
 * Test for {@link UnreachableCodeElimination}.
 *
 */
public class UnreachableCodeEliminationTest extends CompilerTestCase {
  private boolean removeNoOpStatements = true;

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new UnreachableCodeElimination(compiler, removeNoOpStatements);
  }

  @Override public void setUp() throws Exception {
    super.setUp();
    removeNoOpStatements = true;
  }


public void testTryCatchFinally390() { 
     testSame("try {foo()} catch (e) {bar()}"); 
     testSame("try { try {foo()} catch (e) {bar()}} catch (x) {bar()}"); 
     test("try {var x = 1} catch (e) {e()}", "try {var x = 1} finally {}"); 
     test("try {var x = 1} catch (e) {e()} finally {x()}", " try {var x = 1}                 finally {x()}"); 
     test("try {var x = 1} catch (e) {e()} finally {}", "try {var x = 1} finally {}"); 
     testSame("try {var x = 1} finally {x()}"); 
     testSame("try {var x = 1} finally {}"); 
     test("function f() {return; try{var x = 1}catch(e){} }", "function f() {var x;}"); 
 } 


public void testIssue4177428_continue449() { 
     test("f = function() {\n" + "  var action;\n" + "  a: do {\n" + "    var proto = null;\n" + "    try {\n" + "      proto = new Proto\n" + "    } finally {\n" + "      action = proto;\n" + "      continue a\n" + "    }\n" + "  } while(false)\n" + "  alert(action)\n" + "};", "f = function() {\n" + "  var action;\n" + "  a: do {\n" + "    var proto = null;\n" + "    try {\n" + "      proto = new Proto\n" + "    } finally {\n" + "      action = proto;\n" + "    }\n" + "  } while (false)\n" + "  alert(action)\n" + "};"); 
 } 


public void testForInLoop459() { 
     testSame("for(var x in y) {}"); 
 } 


public void testRemoveDo590() { 
     test("do { print(1); break } while(1)", "do { print(1); break } while(1)"); 
     test("while(1) { break; do { print(1); break } while(1) }", "while(1) { break; do {} while(1) }"); 
 } 


public void testUselessUnconditionalReturn1094() { 
     test("function foo() { return }", " function foo() { }"); 
     test("function foo() { return; return; x=1 }", "function foo() { }"); 
     test("function foo() { return; return; var x=1}", "function foo() {var x}"); 
     test("function foo() { return; function bar() {} }", "function foo() {         function bar() {} }"); 
     testSame("function foo() { return 5 }"); 
     test("function f() {switch (a) { case 'a': return}}", "function f() {switch (a) { case 'a': }}"); 
     testSame("function f() {switch (a) { case 'a': case foo(): }}"); 
     testSame("function f() {switch (a) {" + " default: return; case 'a': alert(1)}}"); 
     testSame("function f() {switch (a) {" + " case 'a': return; default: alert(1)}}"); 
 } 


public void testUnlessUnconditonalBreak1394() { 
     test("switch (a) { case 'a': break }", "switch (a) { case 'a': }"); 
     test("switch (a) { case 'a': break; case foo(): }", "switch (a) { case 'a':        case foo(): }"); 
     test("switch (a) { default: break; case 'a': }", "switch (a) { default:        case 'a': }"); 
     testSame("switch (a) { case 'a': alert(a); break; default: alert(a); }"); 
     testSame("switch (a) { default: alert(a); break; case 'a': alert(a); }"); 
     test("X: {switch (a) { case 'a': break X}}", "X: {switch (a) { case 'a': }}"); 
     testSame("X: {switch (a) { case 'a': if (a()) {break X}  a = 1}}"); 
     test("X: {switch (a) { case 'a': if (a()) {break X}}}", "X: {switch (a) { case 'a': if (a()) {}}}"); 
     test("X: {switch (a) { case 'a': if (a()) {break X}}}", "X: {switch (a) { case 'a': if (a()) {}}}"); 
     testSame("do { break } while(1);"); 
     testSame("for(;1;) { break }"); 
 } 


public void testIssue5215541_deadVarDeclar1533() { 
     testSame("throw 1; var x"); 
     testSame("throw 1; function x() {}"); 
     testSame("throw 1; var x; var y;"); 
     test("throw 1; var x = foo", "var x; throw 1"); 
 } 


public void testIssue3111555() { 
     test("function a(b) {\n" + "  switch (b.v) {\n" + "    case 'SWITCH':\n" + "      if (b.i >= 0) {\n" + "        return b.o;\n" + "      } else {\n" + "        return;\n" + "      }\n" + "      break;\n" + "  }\n" + "}", "function a(b) {\n" + "  switch (b.v) {\n" + "    case 'SWITCH':\n" + "      if (b.i >= 0) {\n" + "        return b.o;\n" + "      } else {\n" + "      }\n" + "  }\n" + "}"); 
 } 


public void testRemoveUselessLiteralValueStatements1841() { 
     test("true;", ""); 
     test("'hi';", ""); 
     test("if (x) 1;", ""); 
     test("while (x) 1;", "while (x);"); 
     test("do 1; while (x);", "do ; while (x);"); 
     test("for (;;) 1;", "for (;;);"); 
     test("switch(x){case 1:true;case 2:'hi';default:true}", "switch(x){case 1:case 2:default:}"); 
 } 


public void testIssue4177428b2331() { 
     test("f = function() {\n" + "  var action;\n" + "  a: {\n" + "    var proto = null;\n" + "    try {\n" + "    try {\n" + "      proto = new Proto\n" + "    } finally {\n" + "      action = proto;\n" + "      break a\n" + "    }\n" + "    } finally {\n" + "    }\n" + "  }\n" + "  alert(action)\n" + "};", "f = function() {\n" + "  var action;\n" + "  a: {\n" + "    var proto = null;\n" + "    try {\n" + "    try {\n" + "      proto = new Proto\n" + "    } finally {\n" + "      action = proto;\n" + "      break a\n" + "    }\n" + "    } finally {\n" + "    }\n" + "  }\n" + "  alert(action)\n" + "};"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
