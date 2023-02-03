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
 * Unit tests for {#link {@link PeepholeReplaceKnownMethods}
 *
 */
public class PeepholeReplaceKnownMethodsTest extends CompilerTestCase {

  private boolean late = true;

  public PeepholeReplaceKnownMethodsTest() {
    super("");
  }

  @Override
  public void setUp() {
    enableLineNumberCheck(true);
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    CompilerPass peepholePass = new PeepholeOptimizationsPass(compiler,
          new PeepholeReplaceKnownMethods(late));
    return peepholePass;
  }


public void testFoldParseNumbers101() { 
     enableNormalize(); 
     enableEcmaScript5(true); 
     fold("x = parseInt('123')", "x = 123"); 
     fold("x = parseInt(' 123')", "x = 123"); 
     fold("x = parseInt('123', 10)", "x = 123"); 
     fold("x = parseInt('0xA')", "x = 10"); 
     fold("x = parseInt('0xA', 16)", "x = 10"); 
     fold("x = parseInt('07', 8)", "x = 7"); 
     fold("x = parseInt('08')", "x = 8"); 
     fold("x = parseInt('0')", "x = 0"); 
     fold("x = parseFloat('0')", "x = 0"); 
     fold("x = parseFloat('1.23')", "x = 1.23"); 
     fold("x = parseFloat('1.2300')", "x = 1.23"); 
     fold("x = parseFloat(' 0.3333')", "x = 0.3333"); 
     fold("x = parseFloat('0100')", "x = 100"); 
     fold("x = parseFloat('0100.000')", "x = 100"); 
     fold("x = parseInt(' 0xF', 16)", "x = 15"); 
     fold("x = parseInt(' F', 16)", "x = 15"); 
     fold("x = parseInt('17', 8)", "x = 15"); 
     fold("x = parseInt('015', 10)", "x = 15"); 
     fold("x = parseInt('1111', 2)", "x = 15"); 
     fold("x = parseInt('12', 13)", "x = 15"); 
     fold("x = parseInt(021, 8)", "x = 15"); 
     fold("x = parseInt(15.99, 10)", "x = 15"); 
     fold("x = parseFloat('3.14')", "x = 3.14"); 
     fold("x = parseFloat(3.14)", "x = 3.14"); 
     foldSame("x = parseInt('FXX123', 16)"); 
     foldSame("x = parseInt('15*3', 10)"); 
     foldSame("x = parseInt('15e2', 10)"); 
     foldSame("x = parseInt('15px', 10)"); 
     foldSame("x = parseInt('-0x08')"); 
     foldSame("x = parseInt('1', -1)"); 
     foldSame("x = parseFloat('3.14more non-digit characters')"); 
     foldSame("x = parseFloat('314e-2')"); 
     foldSame("x = parseFloat('0.0314E+2')"); 
     foldSame("x = parseFloat('3.333333333333333333333333')"); 
     foldSame("x = parseInt('0xa', 10)"); 
     foldSame("x = parseInt('')"); 
     enableEcmaScript5(false); 
     foldSame("x = parseInt('08')"); 
 } 


public void testStringJoinAdd258() { 
     fold("x = ['a', 'b', 'c'].join('')", "x = \"abc\""); 
     fold("x = [].join(',')", "x = \"\""); 
     fold("x = ['a'].join(',')", "x = \"a\""); 
     fold("x = ['a', 'b', 'c'].join(',')", "x = \"a,b,c\""); 
     fold("x = ['a', foo, 'b', 'c'].join(',')", "x = [\"a\",foo,\"b,c\"].join()"); 
     fold("x = [foo, 'a', 'b', 'c'].join(',')", "x = [foo,\"a,b,c\"].join()"); 
     fold("x = ['a', 'b', 'c', foo].join(',')", "x = [\"a,b,c\",foo].join()"); 
     fold("x = ['a=', 5].join('')", "x = \"a=5\""); 
     fold("x = ['a', '5'].join(7)", "x = \"a75\""); 
     fold("x = ['a=', false].join('')", "x = \"a=false\""); 
     fold("x = ['a', '5'].join(true)", "x = \"atrue5\""); 
     fold("x = ['a', '5'].join(false)", "x = \"afalse5\""); 
     fold("x = ['a', '5', 'c'].join('a very very very long chain')", "x = [\"a\",\"5\",\"c\"].join(\"a very very very long chain\")"); 
     foldSame("x = ['', foo].join('-')"); 
     foldSame("x = ['', foo, ''].join()"); 
     fold("x = ['', '', foo, ''].join(',')", "x = [',', foo, ''].join()"); 
     fold("x = ['', '', foo, '', ''].join(',')", "x = [',', foo, ','].join()"); 
     fold("x = ['', '', foo, '', '', bar].join(',')", "x = [',', foo, ',', bar].join()"); 
     fold("x = [1,2,3].join('abcdef')", "x = '1abcdef2abcdef3'"); 
     fold("x = [1,2].join()", "x = '1,2'"); 
     fold("x = [null,undefined,''].join(',')", "x = ',,'"); 
     fold("x = [null,undefined,0].join(',')", "x = ',,0'"); 
     foldSame("x = [[1,2],[3,4]].join()"); 
 } 


public void testFoldStringSubstr264() { 
     fold("x = 'abcde'.substr(0,2)", "x = 'ab'"); 
     fold("x = 'abcde'.substr(1,2)", "x = 'bc'"); 
     fold("x = 'abcde'['substr'](1,3)", "x = 'bcd'"); 
     fold("x = 'abcde'.substr(2)", "x = 'cde'"); 
     foldSame("x = 'abcde'.substr(-1)"); 
     foldSame("x = 'abcde'.substr(1, -2)"); 
     foldSame("x = 'abcde'.substr(1, 2, 3)"); 
     foldSame("x = 'a'.substr(0, 2)"); 
 } 


public void testFoldStringSplit342() { 
     late = false; 
     fold("x = 'abcde'.split('foo')", "x = ['abcde']"); 
     fold("x = 'abcde'.split()", "x = ['abcde']"); 
     fold("x = 'abcde'.split(null)", "x = ['abcde']"); 
     fold("x = 'a b c d e'.split(' ')", "x = ['a','b','c','d','e']"); 
     fold("x = 'a b c d e'.split(' ', 0)", "x = []"); 
     fold("x = 'abcde'.split('cd')", "x = ['ab','e']"); 
     fold("x = 'a b c d e'.split(' ', 1)", "x = ['a']"); 
     fold("x = 'a b c d e'.split(' ', 3)", "x = ['a','b','c']"); 
     fold("x = 'a b c d e'.split(null, 1)", "x = ['a b c d e']"); 
     fold("x = 'aaaaa'.split('a')", "x = ['', '', '', '', '', '']"); 
     fold("x = 'xyx'.split('x')", "x = ['', 'y', '']"); 
     fold("x = 'abcde'.split('')", "x = ['a','b','c','d','e']"); 
     fold("x = 'abcde'.split('', 3)", "x = ['a','b','c']"); 
     fold("x = ''.split('')", "x = []"); 
     fold("x = 'aaa'.split('aaa')", "x = ['','']"); 
     fold("x = ' '.split(' ')", "x = ['','']"); 
     foldSame("x = 'abcde'.split(/ /)"); 
     foldSame("x = 'abcde'.split(' ', -1)"); 
     late = true; 
     foldSame("x = 'a b c d e'.split(' ')"); 
 } 


public void testStringJoinAddSparse547() { 
     fold("x = [,,'a'].join(',')", "x = ',,a'"); 
 } 


public void testFoldStringCharCodeAt574() { 
     fold("x = 'abcde'.charCodeAt(0)", "x = 97"); 
     fold("x = 'abcde'.charCodeAt(1)", "x = 98"); 
     fold("x = 'abcde'.charCodeAt(2)", "x = 99"); 
     fold("x = 'abcde'.charCodeAt(3)", "x = 100"); 
     fold("x = 'abcde'.charCodeAt(4)", "x = 101"); 
     foldSame("x = 'abcde'.charCodeAt(5)"); 
     foldSame("x = 'abcde'.charCodeAt(-1)"); 
     foldSame("x = 'abcde'.charCodeAt(y)"); 
     foldSame("x = 'abcde'.charCodeAt()"); 
     foldSame("x = 'abcde'.charCodeAt(0, ++z)"); 
     foldSame("x = 'abcde'.charCodeAt(null)"); 
     foldSame("x = 'abcde'.charCodeAt(true)"); 
     fold("x = '\\ud834\udd1e'.charCodeAt(0)", "x = 55348"); 
     fold("x = '\\ud834\udd1e'.charCodeAt(1)", "x = 56606"); 
 } 


public void testJoinBug624() { 
     fold("var x = [].join();", "var x = '';"); 
     fold("var x = [x].join();", "var x = '' + x;"); 
     foldSame("var x = [x,y].join();"); 
     foldSame("var x = [x,y,z].join();"); 
     foldSame("shape['matrix'] = [\n" + "    Number(headingCos2).toFixed(4),\n" + "    Number(-headingSin2).toFixed(4),\n" + "    Number(headingSin2 * yScale).toFixed(4),\n" + "    Number(headingCos2 * yScale).toFixed(4),\n" + "    0,\n" + "    0\n" + "  ].join()"); 
 } 


public void testToUpper1016() { 
     fold("'a'.toUpperCase()", "'A'"); 
     fold("'A'.toUpperCase()", "'A'"); 
     fold("'aBcDe'.toUpperCase()", "'ABCDE'"); 
 } 


public void testStringIndexOf1019() { 
     fold("x = 'abcdef'.indexOf('b')", "x = 1"); 
     fold("x = 'abcdefbe'.indexOf('b', 2)", "x = 6"); 
     fold("x = 'abcdef'.indexOf('bcd')", "x = 1"); 
     fold("x = 'abcdefsdfasdfbcdassd'.indexOf('bcd', 4)", "x = 13"); 
     fold("x = 'abcdef'.lastIndexOf('b')", "x = 1"); 
     fold("x = 'abcdefbe'.lastIndexOf('b')", "x = 6"); 
     fold("x = 'abcdefbe'.lastIndexOf('b', 5)", "x = 1"); 
     fold("x = 'abc1def'.indexOf(1)", "x = 3"); 
     fold("x = 'abcNaNdef'.indexOf(NaN)", "x = 3"); 
     fold("x = 'abcundefineddef'.indexOf(undefined)", "x = 3"); 
     fold("x = 'abcnulldef'.indexOf(null)", "x = 3"); 
     fold("x = 'abctruedef'.indexOf(true)", "x = 3"); 
     foldSame("x = NaN.indexOf('bcd')"); 
     foldSame("x = undefined.indexOf('bcd')"); 
     foldSame("x = null.indexOf('bcd')"); 
     foldSame("x = true.indexOf('bcd')"); 
     foldSame("x = false.indexOf('bcd')"); 
     foldSame("x = 'abcdef'.indexOf(/b./)"); 
     foldSame("x = 'abcdef'.indexOf({a:2})"); 
     foldSame("x = 'abcdef'.indexOf([1,2])"); 
 } 


public void testFoldStringSubstring1035() { 
     fold("x = 'abcde'.substring(0,2)", "x = 'ab'"); 
     fold("x = 'abcde'.substring(1,2)", "x = 'b'"); 
     fold("x = 'abcde'['substring'](1,3)", "x = 'bc'"); 
     fold("x = 'abcde'.substring(2)", "x = 'cde'"); 
     foldSame("x = 'abcde'.substring(-1)"); 
     foldSame("x = 'abcde'.substring(1, -2)"); 
     foldSame("x = 'abcde'.substring(1, 2, 3)"); 
     foldSame("x = 'a'.substring(0, 2)"); 
 } 


public void testToLower1550() { 
     fold("'A'.toLowerCase()", "'a'"); 
     fold("'a'.toLowerCase()", "'a'"); 
     fold("'aBcDe'.toLowerCase()", "'abcde'"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  @Override
  protected int getNumRepetitions() {
    // Reduce this to 2 if we get better expression evaluators.
    return 2;
  }

  private void foldSame(String js) {
    testSame(js);
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }
}
