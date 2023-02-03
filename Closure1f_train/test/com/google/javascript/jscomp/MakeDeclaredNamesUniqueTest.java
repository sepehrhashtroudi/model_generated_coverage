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

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer;
import com.google.javascript.rhino.Node;

/**
 * @author johnlenz@google.com (John Lenz)
 */
public class MakeDeclaredNamesUniqueTest extends CompilerTestCase {

  private boolean useDefaultRenamer = false;
  private boolean invert = false;
  private boolean removeConst = false;
  private final String localNamePrefix = "unique_";

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    if (!invert) {
      return new CompilerPass() {
        @Override
        public void process(Node externs, Node root) {
          compiler.resetUniqueNameId();
          MakeDeclaredNamesUnique renamer = null;
          if (useDefaultRenamer) {
            renamer = new MakeDeclaredNamesUnique();
          } else {
            renamer = new MakeDeclaredNamesUnique(
                new InlineRenamer(
                    compiler.getUniqueNameIdSupplier(),
                    localNamePrefix,
                    removeConst));
          }
          NodeTraversal.traverseRoots(
              compiler, Lists.newArrayList(externs, root), renamer);
        }
      };
    } else {
      return MakeDeclaredNamesUnique.getContextualRenameInverter(compiler);
    }
  }

  @Override
  protected int getNumRepetitions() {
    // The normalize pass is only run once.
    return 1;
  }

  @Override
  public void setUp() {
    removeConst = false;
    invert = false;
    useDefaultRenamer = false;
  }

  private void testWithInversion(String original, String expected) {
    invert = false;
    test(original, expected);
    invert = true;
    test(expected, original);
    invert = false;
  }

  private void testSameWithInversion(String externs, String original) {
    invert = false;
    testSame(externs, original, null);
    invert = true;
    testSame(externs, original, null);
    invert = false;
  }

  private void testSameWithInversion(String original) {
    testSameWithInversion("", original);
  }

  private String wrapInFunction(String s) {
    return "function f(){" + s + "}";
  }

  private void testInFunction(String original, String expected) {
    test(wrapInFunction(original), wrapInFunction(expected));
  }


public void testMakeLocalNamesUniqueWithContext575() { 
     this.useDefaultRenamer = true; 
     testWithInversion("function f(){var f; f = 1}", "function f(){var f$$1; f$$1 = 1}"); 
     testWithInversion("function f(f){f = 1}", "function f(f$$1){f$$1 = 1}"); 
     testWithInversion("function f(f){var f; f = 1}", "function f(f$$1){var f$$1; f$$1 = 1}"); 
     test("var fn = function f(){var f; f = 1}", "var fn = function f(){var f$$1; f$$1 = 1}"); 
     test("var fn = function f(f){f = 1}", "var fn = function f(f$$1){f$$1 = 1}"); 
     test("var fn = function f(f){var f; f = 1}", "var fn = function f(f$$1){var f$$1; f$$1 = 1}"); 
 } 


public void testOnlyInversion4433() { 
     invert = true; 
     test("function x1() {" + "  var a$$0;" + "  function x2() {" + "    var a;a$$0++" + "  }" + "}", "function x1() {" + "  var a$$1;" + "  function x2() {" + "    var a;a$$1++" + "  }" + "}"); 
 } 


public void testMakeLocalNamesUniqueWithContext2781() { 
     this.useDefaultRenamer = true; 
     testSameWithInversion("var a;"); 
     testSameWithInversion("a;"); 
     testWithInversion("var a;function foo(a){var b;a}", "var a;function foo(a$$1){var b;a$$1}"); 
     testWithInversion("var a;function foo(){var b;a}function boo(){var b;a}", "var a;function foo(){var b;a}function boo(){var b$$1;a}"); 
     testWithInversion("function foo(a){var b}" + "function boo(a){var b}", "function foo(a){var b}" + "function boo(a$$1){var b$$1}"); 
     testWithInversion("var a = function foo(){foo()};var b = function foo(){foo()};", "var a = function foo(){foo()};var b = function foo$$1(){foo$$1()};"); 
     testWithInversion("try { } catch(e) {e;}", "try { } catch(e) {e;}"); 
     test("try { } catch(e) {e;}; try { } catch(e) {e;}", "try { } catch(e) {e;}; try { } catch(e$$1) {e$$1;}"); 
     test("try { } catch(e) {e; try { } catch(e) {e;}};", "try { } catch(e) {e; try { } catch(e$$1) {e$$1;} }; "); 
 } 


public void testConstRemovingRename2969() { 
     removeConst = true; 
     test("var CONST = 3; var b = CONST;", "var CONST$$unique_0 = 3; var b$$unique_1 = CONST$$unique_0;"); 
 } 


public void testConstRemovingRename11716() { 
     removeConst = true; 
     test("(function () {var CONST = 3; var ACONST$$1 = 2;})", "(function () {var CONST$$unique_0 = 3; var ACONST$$unique_1 = 2;})"); 
 } 

  

  

  



  

  

  

  

  

  

  

  

  

  
}
