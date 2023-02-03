

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

public class PeepholeCollectPropertyAssignmentsTest extends CompilerTestCase {

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new PeepholeOptimizationsPass(
        compiler, new PeepholeCollectPropertyAssignments());
  }


  public final void testArrayOptimization2137() {
    test("var a; a = []; a[0] = 1; a[1] = 2; a[2] = 3;", "var a; a = [1, 2, 3];");
  }


  public final void testObjectOptimization2400() {
    test("var o; o = {}; o.x = 0; o['y'] = 1; o[2] = 2;", "var o; o = { x: 0, \"y\": 1, \"2\": 2 };");
  }


  public final void testFractionalArrayIndex11393() {
    testSame("var a = []; a[0.5] = 1;");
  }


  public final void testArrayOptimization31475() {
    testSame("var a; a.b = []; a.b[0] = 1; a.b[1] = 2; a.b[2] = 3;");
  }


  public final void testArrayTooSparseOptimization21659() {
    test("var a; a = []; a[0] = 1; a[1] = 2; a[100] = 4;", "var a; a = [1, 2]; a[100] = 4;");
  }


  public final void testArrayOutOfOrder1669() {
    test("var a = []; a[1] = 1; a[0] = 0;", "var a = [0, 1];");
    test("var a; a = []; a[1] = 1; a[0] = 0;", "var a; a = [0, 1];");
    testSame("var x = 0; var a = []; a[1] = x++; a[0] = x++;");
    testSame("var x; x = 0; var a = []; a[1] = x++; a[0] = x++;");
  }


  public final void testMultipleNames21767() {
    test("var b; b = []; b[0] = 2; var a = []; a[0] = 1;", "var b; b = [2]; var a = [1];");
  }


  public final void testForwardReference22099() {
    test("var a; a = []; a[0] = 1; a[1] = a;", "var a; a = [1]; a[1] = a;");
  }


  public final void testFractionalArrayIndex22300() {
    testSame("var a; a = []; a[0.5] = 1;");
  }


  public final void testArrayReassignedInValue12309() {
    test("var a = []; a[0] = 1; a[1] = (a = []); a[3] = 4;", "var a = [1]; a[1] = (a = []); a[3] = 4;");
  }


  public final void testNegativeArrayIndex22449() {
    testSame("var a; a = []; a[-1] = 1;");
  }

}
