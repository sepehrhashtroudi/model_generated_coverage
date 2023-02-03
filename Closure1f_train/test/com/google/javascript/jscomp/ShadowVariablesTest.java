/*
 * Copyright 2011 The Closure Compiler Authors.
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
 * Unit tests for {@link ShadowVariables}.
 *
 *
 */
public class ShadowVariablesTest extends CompilerTestCase{
  // Use pseudo names to make test easier to read.
  private boolean generatePseudoNames = false;
  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
      return new RenameVars(
          compiler, "", false, false,
          generatePseudoNames, true, null, null, null);
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    generatePseudoNames = false;
  }


public void testShadowBleedInFunctionName416() { 
     generatePseudoNames = true; 
     test("function  foo  () { function  b  ( y  ) { y  }  b  ;  b  ;}", "function $foo$$() { function $b$$($b$$) {$b$$} $b$$; $b$$;}"); 
 } 


public void testSharingAcrossInnerScopes975() { 
     test("function f() {var f=function g(){g()}; var x=function y(){y()}}", "function c() {var d=function a(){a()}; var e=function b(){b()}}"); 
     test("function f(x) { return x ? function(y){} : function(z) {} }", "function b(a) { return a ? function(a){} : function(a) {} }"); 
 } 


public void testNoShadowReferencedVariables1027() { 
     generatePseudoNames = true; 
     test("function  f1  () { var  x  ; x  ; x  ; x  ;" + "  return function  f2  ( y  ) {" + "    return function  f3  () { x  } }}", "function $f1$$() { var $x$$;$x$$;$x$$;$x$$;" + "  return function $f2$$($y$$) {" + "    return function $f3$$() {$x$$} }}"); 
 } 


public void testExportedLocal12015() { 
     test("function f(a) { a();a();a(); return function($super){} }", "function b(a) { a();a();a(); return function($super){} }"); 
 } 


public void testNoShadowLessPopularName2360() { 
     generatePseudoNames = true; 
     test("function  f1  ( x  ) {" + "  function  f2  ( y  ) {}  x  ; x  ;}" + "function  f3  ( i  ) {" + "  var  k  ; var  j  ; j  ; j  ; j  ; j  ; j  ; j  ;}", "function $f1$$($x$$) {" + "  function $f2$$($y$$) {} $x$$;$x$$;}" + "function $f3$$($i$$) {" + "  var $k$$; var $j$$;$j$$;$j$$;$j$$;$j$$;$j$$;$j$$;}"); 
 } 

  

  

  /**
   * If we have a choice, pick out the most used variable to shadow.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
