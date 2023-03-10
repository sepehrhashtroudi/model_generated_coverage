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

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;

/**
 * Tests for {@link RuntimeTypeCheck}.
 *
 */
public class RuntimeTypeCheckTest extends CompilerTestCase {

  public RuntimeTypeCheckTest() {
    super("/** @const */ var undefined;");
    enableTypeCheck(CheckLevel.WARNING);
  }

  @Override
  protected void setUp() {
    super.enableLineNumberCheck(false);
    enableNormalize();
  }


public void testNativeClass130() { 
     testChecks("/** @param {!String} x */ function f(x) {}", "function f(x) {" + "  $jscomp.typecheck.checkType(x, " + "      [$jscomp.typecheck.externClassChecker('String')]);" + "}"); 
 } 


public void testExtendedInterface223() { 
     testChecks("/** @interface */function I() {}" + "/** @interface\n@extends {I} */function J() {}" + "/** @param {!I} i */function f(i) {}" + "/** @constructor\n@implements {J} */function C() {}", "function I() {}" + "function J() {}" + "function f(i) {" + "  $jscomp.typecheck.checkType(i, " + "      [$jscomp.typecheck.interfaceChecker('I')])" + "}" + "function C() {}" + "C.prototype['instance_of__C'] = true;" + "C.prototype['implements__I'] = true;" + "C.prototype['implements__J'] = true;"); 
 } 


public void testImplementedInterface417() { 
     testChecks("/** @interface */function I() {}" + "/** @param {!I} i */function f(i) {}" + "/** @constructor\n@implements {I} */function C() {}", "function I() {}" + "function f(i) {" + "  $jscomp.typecheck.checkType(i, " + "      [$jscomp.typecheck.interfaceChecker('I')])" + "}" + "function C() {}" + "C.prototype['instance_of__C'] = true;" + "C.prototype['implements__I'] = true;"); 
 } 


public void testUnion586() { 
     testChecks("/** @param {number|string} x */ function f(x) {}", "function f(x) {" + "  $jscomp.typecheck.checkType(x, [" + "      $jscomp.typecheck.valueChecker('number'), " + "      $jscomp.typecheck.valueChecker('string')" + "]);" + "}"); 
 } 


public void testSkipParamOK747() { 
     testChecks("/** @param {*} i\n@param {string} j*/ function f(i, j) {}", "function f(i, j) {" + "  $jscomp.typecheck.checkType(j, " + "      [$jscomp.typecheck.valueChecker('string')]);" + "}"); 
 } 


public void testValueWithInnerFn1228() { 
     testChecks("/** @param {number} i */ function f(i) { function g() {} }", "function f(i) {" + "  function g() {}" + "  $jscomp.typecheck.checkType(i, " + "      [$jscomp.typecheck.valueChecker('number')]);" + "}"); 
 } 


public void testReturnNothing1269() { 
     testChecks("function f() { return; }", "function f() { return; }"); 
 } 


public void testImplementedInterfaceOrderingGoogInherits1704() { 
     testChecks("var goog = {}; goog.inherits = function(x, y) {};" + "/** @interface */function I() {}" + "/** @param {!I} i */function f(i) {}" + "/** @constructor */function B() {}" + "/** @constructor\n@extends {B}\n@implements {I} */function C() {}" + "goog.inherits(C, B);" + "C.prototype.f = function() {};", "var goog = {}; goog.inherits = function(x, y) {};" + "function I() {}" + "function f(i) {" + "  $jscomp.typecheck.checkType(i, " + "      [$jscomp.typecheck.interfaceChecker('I')])" + "}" + "function B() {}" + "B.prototype['instance_of__B'] = true;" + "function C() {}" + "goog.inherits(C, B);" + "C.prototype['instance_of__C'] = true;" + "C.prototype['implements__I'] = true;" + "C.prototype.f = function() {};"); 
 } 


public void testReturn1754() { 
     testChecks("/** @return {string} */ function f() { return 'x'; }", "function f() {" + "  return $jscomp.typecheck.checkType('x', " + "      [$jscomp.typecheck.valueChecker('string')]);" + "}"); 
 } 


public void testQualifiedClass1815() { 
     testChecks("var goog = {}; /** @constructor */goog.Foo = function() {};" + "/** @param {!goog.Foo} x */ function f(x) {}", "var goog = {}; goog.Foo = function() {};" + "goog.Foo.prototype['instance_of__goog.Foo'] = true;" + "function f(x) {" + "  $jscomp.typecheck.checkType(x, " + "    [$jscomp.typecheck.classChecker('goog.Foo')]);" + "}"); 
 } 


public void testInnerClasses2073() { 
     testChecks("function f() { /** @constructor */ function inner() {} }" + "function g() { /** @constructor */ function inner() {} }", "function f() {" + "  /** @constructor */ function inner() {}" + "  inner.prototype['instance_of__inner'] = true;" + "}" + "function g() {" + "  /** @constructor */ function inner$$1() {}" + "  inner$$1.prototype['instance_of__inner$$1'] = true;" + "}"); 
 } 


public void testFunctionType2098() { 
     testChecks("/** @type {!Function} */function f() {}", "function f() {}"); 
 } 


public void testNullValue2262() { 
     testChecks("/** @param {null} i */ function f(i) {}", "function f(i) {" + "  $jscomp.typecheck.checkType(i, [$jscomp.typecheck.nullChecker]);" + "}"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testChecks(String js, String expected) {
    Compiler compiler = new Compiler();
    compiler.init(Lists.<SourceFile>newArrayList(),
                  Lists.<SourceFile>newArrayList(),
                  new CompilerOptions());
    Node base = compiler.loadLibraryCode("base");
    Node typeCheck = compiler.loadLibraryCode("runtime_type_check");
    test(js,
         compiler.toSource(base) + ";"
         + compiler.toSource(typeCheck) + ";"
         + expected);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new RuntimeTypeCheck(compiler, null);
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }
}
