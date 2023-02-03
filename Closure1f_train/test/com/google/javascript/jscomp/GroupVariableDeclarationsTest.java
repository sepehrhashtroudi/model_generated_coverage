/*
 * Copyright 2010 The Closure Compiler Authors.
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

public class GroupVariableDeclarationsTest extends CompilerTestCase {

  @Override
  protected void setUp() {
    super.enableLineNumberCheck(false);
  }


public void testGroupingInitializedVarsInScope202() { 
     test("var a = 1; f1(); var b = 2;", "var a = 1, b; f1(); b = 2;"); 
     test("var a = \"mangoes\"; f1(); alert(a); var b = 2;", "var a = \"mangoes\", b; f1(); alert(a); b = 2;"); 
     test("var a = 1; {var c = 34; alert(c);} var b = 2;", "var a = 1, c, b; {c = 34; alert(c);} b = 2;"); 
     test("var a = 1; var b = 1; f1(); f2(); var c = 3; var d = 4;", "var a = 1, b, c, d; b = 1; f1(); f2(); c = 3; d = 4;"); 
     test("var a = 1; var b = 2; var c; f1(); f2(); var d = 4, e;", "var a = 1, b, c, d, e; b = 2; f1(); f2(); d = 4;"); 
     test("var a = 1, b = 2, c; f1(); f2(); var d; var e = 6; " + "f3(); f4(); var f; var g; var h = a + b;", "var a = 1, b = 2, c, d, e, f, g, h; f1(); f2(); e = 6; " + "f3(); f4(); h = a + b;"); 
 } 


public void testGroupingVarsInForAndForInLoops1224() { 
     test("var a = 1; for (var x = 0; x < 10; ++x) {a++;} var y;", "var a = 1, x, y; for (x = 0; x < 10; ++x) {a++;}"); 
     test("var a = 1, x; for (x = 0; x < 10; ++x) {a++;} var y;", "var a = 1, x, y; for (x = 0; x < 10; ++x) {a++;}"); 
     test("var a = 1, x; for (x; x < 10; ++x) {a++;} var y;", "var a = 1, x, y; for (x; x < 10; ++x) {a++;}"); 
     test("var a = 1; for (; a < 10; ++a) {alert(a);} var y;", "var a = 1, y; for (; a < 10; ++a) {alert(a);}"); 
     test("var a = 1; for (var x; x < 10; ++x) {a += 2;} var y = 5;", "var a = 1, x, y; for (; x < 10; ++x) {a += 2;} y = 5;"); 
     test("var a = 1; " + "for (var a1 = 0, a2 = 10; a1 < 10 && a2 > 0; ++a1, --a2) {}" + "var x = 5;", "var a = 1, x;" + "for (var a1 = 0, a2 = 10; a1 < 10 && a2 > 0; ++a1, --a2) {} " + "x = 5;"); 
     test("var a = 1; " + "for (var a1 = 0, a2; a1 < 10 && a2 > 0; ++a1, --a2) {}" + "var x = 5;", "var a = 1, a1, a2, x;" + "for (a1 = 0; a1 < 10 && a2 > 0; ++a1, --a2) {}" + "x = 5;"); 
     test("var a = 1; " + "for (var a1, a2; a1 < 10 && a2 > 0; ++a1, --a2) {}" + "var x = 5;", "var a = 1, a1, a2, x;" + "for (; a1 < 10 && a2 > 0; ++a1, --a2) {}" + "x = 5;"); 
     test("var a = [1, 2, 3, 4]; for (var z in a) {alert(z);} var y;", "var a = [1, 2, 3, 4], z, y; for (z in a) {alert(z);}"); 
     test("var a = [1, 2, 3, 4]; for (var z in a) {alert(z);} var y = 5;", "var a = [1, 2, 3, 4], z, y; for (z in a) {alert(z);} y = 5;"); 
     test("var a; for (var z in a = [1, 2, 3, 4]) {alert(z);} var y, x = 5;", "var a, z, y, x; for (z in a = [1, 2, 3, 4]) {alert(z);} x = 5;"); 
     test("var a; for (var z = 1 in a = [1, 2, 3, 4]) {alert(z);} var y, x = 5;", "var a, y, x; for (var z = 1 in a = [1, 2, 3, 4]) {alert(z);} x = 5;"); 
     test("var a, z; for (z in a = [1, 2, 3, 4]) {alert(z);} var y, x = 5;", "var a, z, y, x; for (z in a = [1, 2, 3, 4]) {alert(z);} x = 5;"); 
 } 

  

  

  

  

  

  

  

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new GroupVariableDeclarations(compiler);
  }
}
