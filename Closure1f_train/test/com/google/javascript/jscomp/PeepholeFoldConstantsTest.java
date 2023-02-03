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
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.Node;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Tests for {@link PeepholeFoldConstants} in isolation. Tests for
 * the interaction of multiple peephole passes are in
 * {@link PeepholeIntegrationTest}.
 */
public class PeepholeFoldConstantsTest extends CompilerTestCase {

  private boolean late;

  // TODO(user): Remove this when we no longer need to do string comparison.
  private PeepholeFoldConstantsTest(boolean compareAsTree) {
    super("", compareAsTree);
  }

  public PeepholeFoldConstantsTest() {
    super("");
  }

  @Override
  public void setUp() {
    late = false;
    enableLineNumberCheck(true);
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    CompilerPass peepholePass = new PeepholeOptimizationsPass(compiler,
          new PeepholeFoldConstants(late));
    return peepholePass;
  }

  @Override
  protected int getNumRepetitions() {
    // Reduce this to 1 if we get better expression evaluators.
    return 2;
  }

  private void foldSame(String js) {
    testSame(js);
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }

  private void fold(String js, String expected, DiagnosticType warning) {
    test(js, expected, null, warning);
  }

  // TODO(user): This is same as fold() except it uses string comparison. Any
  // test that needs tell us where a folding is constructing an invalid AST.
  private void assertResultString(String js, String expected) {
    PeepholeFoldConstantsTest scTest = new PeepholeFoldConstantsTest(false);

    scTest.test(js, expected);
  }


public void testFoldArithmetic217() { 
     foldSame("x = y + 10 + 20"); 
     foldSame("x = y / 2 / 4"); 
     fold("x = y * 2.25 * 3", "x = y * 6.75"); 
     fold("z = x * y", "z = x * y"); 
     fold("x = y * 5", "x = y * 5"); 
     fold("x = y + (z * 24 * 60 * 60 * 1000)", "x = y + z * 864E5"); 
 } 


public void testFoldBitwiseOp31() { 
     fold("x = 1 & 1", "x = 1"); 
     fold("x = 1 & 2", "x = 0"); 
     fold("x = 3 & 1", "x = 1"); 
     fold("x = 3 & 3", "x = 3"); 
     fold("x = 1 | 1", "x = 1"); 
     fold("x = 1 | 2", "x = 3"); 
     fold("x = 3 | 1", "x = 3"); 
     fold("x = 3 | 3", "x = 3"); 
     fold("x = 1 ^ 1", "x = 0"); 
     fold("x = 1 ^ 2", "x = 3"); 
     fold("x = 3 ^ 1", "x = 2"); 
     fold("x = 3 ^ 3", "x = 0"); 
     fold("x = -1 & 0", "x = 0"); 
     fold("x = 0 & -1", "x = 0"); 
     fold("x = 1 & 4", "x = 0"); 
     fold("x = 2 & 3", "x = 2"); 
     fold("x = 1 & 1.1", "x = 1"); 
     fold("x = 1.1 & 1", "x = 1"); 
     fold("x = 1 & 3000000000", "x = 0"); 
     fold("x = 3000000000 & 1", "x = 0"); 
     fold("x = 1 | 4", "x = 5"); 
     fold("x = 1 | 3", "x = 3"); 
     fold("x = 1 | 1.1", "x = 1"); 
     foldSame("x = 1 | 3E9"); 
     fold("x = 1 | 3000000001", "x = -1294967295"); 
 } 


public void testAssignOpsEarly69() { 
     late = false; 
     foldSame("x=x+y"); 
     foldSame("x=y+x"); 
     foldSame("x=x*y"); 
     foldSame("x=y*x"); 
     foldSame("x.y=x.y+z"); 
     foldSame("next().x = next().x + 1"); 
     foldSame("x=x-y"); 
     foldSame("x=y-x"); 
     foldSame("x=x|y"); 
     foldSame("x=y|x"); 
     foldSame("x=x*y"); 
     foldSame("x=y*x"); 
     foldSame("x.y=x.y+z"); 
     foldSame("next().x = next().x + 1"); 
     fold("({a:1}).a = ({a:1}).a + 1", "({a:1}).a = 2"); 
 } 


public void testStringAdd122() { 
     fold("x = 'a' + \"bc\"", "x = \"abc\""); 
     fold("x = 'a' + 5", "x = \"a5\""); 
     fold("x = 5 + 'a'", "x = \"5a\""); 
     fold("x = 'a' + ''", "x = \"a\""); 
     fold("x = \"a\" + foo()", "x = \"a\"+foo()"); 
     fold("x = foo() + 'a' + 'b'", "x = foo()+\"ab\""); 
     fold("x = (foo() + 'a') + 'b'", "x = foo()+\"ab\""); 
     fold("x = foo() + 'a' + 'b' + 'cd' + bar()", "x = foo()+\"abcd\"+bar()"); 
     fold("x = foo() + 2 + 'b'", "x = foo()+2+\"b\""); 
     fold("x = foo() + 'a' + 2", "x = foo()+\"a2\""); 
     fold("x = '' + null", "x = \"null\""); 
     fold("x = true + '' + false", "x = \"truefalse\""); 
     fold("x = '' + []", "x = ''"); 
 } 


public void testUnaryOps132() { 
     foldSame("!foo()"); 
     foldSame("~foo()"); 
     foldSame("-foo()"); 
     fold("a=!true", "a=false"); 
     fold("a=!10", "a=false"); 
     fold("a=!false", "a=true"); 
     fold("a=!foo()", "a=!foo()"); 
     fold("a=-0", "a=-0.0"); 
     fold("a=-(0)", "a=-0.0"); 
     fold("a=-Infinity", "a=-Infinity"); 
     fold("a=-NaN", "a=NaN"); 
     fold("a=-foo()", "a=-foo()"); 
     fold("a=~~0", "a=0"); 
     fold("a=~~10", "a=10"); 
     fold("a=~-7", "a=6"); 
     fold("a=+true", "a=1"); 
     fold("a=+10", "a=10"); 
     fold("a=+false", "a=0"); 
     foldSame("a=+foo()"); 
     foldSame("a=+f"); 
     fold("a=+(f?true:false)", "a=+(f?1:0)"); 
     fold("a=+0", "a=0"); 
     fold("a=+Infinity", "a=Infinity"); 
     fold("a=+NaN", "a=NaN"); 
     fold("a=+-7", "a=-7"); 
     fold("a=+.5", "a=.5"); 
     fold("a=~0x100000000", "a=~0x100000000", PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE); 
     fold("a=~-0x100000000", "a=~-0x100000000", PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE); 
     testSame("a=~.5", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND); 
 } 


public void testUnaryOpsStringCompare214() { 
     assertResultString("a=-1", "a=-1"); 
     assertResultString("a=~0", "a=-1"); 
     assertResultString("a=~1", "a=-2"); 
     assertResultString("a=~101", "a=-102"); 
 } 


public void testFoldObjectLiteralRef1251() { 
     testSame("var x = ({a:foo(),b:bar()}).a"); 
     testSame("var x = ({a:1,b:bar()}).a"); 
     testSame("function f() { return {b:foo(), a:2}.a; }"); 
     testSame("({a:x}).a = 1"); 
     test("({a:x}).a += 1", "({a:x}).a = x + 1"); 
     testSame("({a:x}).a ++"); 
     testSame("({a:x}).a --"); 
     testSame("({a:function(){return this}}).a"); 
     testSame("({get a() {return this}}).a"); 
     testSame("({set a(b) {return this}}).a"); 
     testSame("({}).a"); 
     testSame("({}).a"); 
     testSame("({set a(b) {}}).a"); 
     test("({a:1,set a(b) {}}).a", "1"); 
     test("({get a() {}}).a", "(function (){})()"); 
     test("({get a() {},set a(b) {}}).a", "(function (){})()"); 
     test("var x = ({a:function(){return 1}}).a", "var x = function(){return 1}"); 
     test("var x = ({a:1}).a", "var x = 1"); 
     test("var x = ({a:1, a:2}).a", "var x = 2"); 
     test("var x = ({a:1, a:foo()}).a", "var x = foo()"); 
     test("var x = ({a:foo()}).a", "var x = foo()"); 
     test("function f() { return {a:1, b:2}.a; }", "function f() { return 1; }"); 
     test("var x = ({'a':1})['a']", "var x = 1"); 
 } 


public void testFoldGetElem318() { 
     fold("x = [,10][0]", "x = void 0"); 
     fold("x = [10, 20][0]", "x = 10"); 
     fold("x = [10, 20][1]", "x = 20"); 
     testSame("x = [10, 20][0.5]", PeepholeFoldConstants.INVALID_GETELEM_INDEX_ERROR); 
     testSame("x = [10, 20][-1]", PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR); 
     testSame("x = [10, 20][2]", PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR); 
     foldSame("x = [foo(), 0][1]"); 
     fold("x = [0, foo()][1]", "x = foo()"); 
     foldSame("x = [0, foo()][0]"); 
 } 


public void testFoldBitShifts334() { 
     fold("x = 1 << 0", "x = 1"); 
     fold("x = -1 << 0", "x = -1"); 
     fold("x = 1 << 1", "x = 2"); 
     fold("x = 3 << 1", "x = 6"); 
     fold("x = 1 << 8", "x = 256"); 
     fold("x = 1 >> 0", "x = 1"); 
     fold("x = -1 >> 0", "x = -1"); 
     fold("x = 1 >> 1", "x = 0"); 
     fold("x = 2 >> 1", "x = 1"); 
     fold("x = 5 >> 1", "x = 2"); 
     fold("x = 127 >> 3", "x = 15"); 
     fold("x = 3 >> 1", "x = 1"); 
     fold("x = 3 >> 2", "x = 0"); 
     fold("x = 10 >> 1", "x = 5"); 
     fold("x = 10 >> 2", "x = 2"); 
     fold("x = 10 >> 5", "x = 0"); 
     fold("x = 10 >>> 1", "x = 5"); 
     fold("x = 10 >>> 2", "x = 2"); 
     fold("x = 10 >>> 5", "x = 0"); 
     fold("x = -1 >>> 1", "x = 2147483647"); 
     fold("x = -1 >>> 0", "x = 4294967295"); 
     fold("x = -2 >>> 0", "x = 4294967294"); 
     testSame("3000000000 << 1", PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE); 
     testSame("1 << 32", PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS); 
     testSame("1 << -1", PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS); 
     testSame("3000000000 >> 1", PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE); 
     testSame("1 >> 32", PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS); 
     testSame("1.5 << 0", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND); 
     testSame("1 << .5", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND); 
     testSame("1.5 >>> 0", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND); 
     testSame("1 >>> .5", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND); 
     testSame("1.5 >> 0", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND); 
     testSame("1 >> .5", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND); 
 } 


public void testFoldComparison3345() { 
     fold("x = !1 == !0", "x = false"); 
     fold("x = !0 == !0", "x = true"); 
     fold("x = !1 == !1", "x = true"); 
     fold("x = !1 == null", "x = false"); 
     fold("x = !1 == !0", "x = false"); 
     fold("x = !0 == null", "x = false"); 
     fold("!0 == !0", "true"); 
     fold("!1 == null", "false"); 
     fold("!1 == !0", "false"); 
     fold("!0 == null", "false"); 
     fold("x = !0 === !0", "x = true"); 
     fold("x = !1 === !1", "x = true"); 
     fold("x = !1 === null", "x = false"); 
     fold("x = !1 === !0", "x = false"); 
     fold("x = !0 === null", "x = false"); 
     fold("!0 === !0", "true"); 
     fold("!1 === null", "false"); 
     fold("!1 === !0", "false"); 
     fold("!0 === null", "false"); 
 } 


public void testIssue601374() { 
     testSame("'\\v' == 'v'"); 
     testSame("'v' == '\\v'"); 
     testSame("'\\u000B' == '\\v'"); 
 } 


public void testCommutativeOperators376() { 
     late = true; 
     List<String> operators = ImmutableList.of("==", "!=", "===", "!==", "*", "|", "&", "^"); 
     for (int iOperandA = 0; iOperandA < LITERAL_OPERANDS.size(); iOperandA++) { 
         for (int iOperandB = iOperandA; iOperandB < LITERAL_OPERANDS.size(); iOperandB++) { 
             for (int iOp = 0; iOp < operators.size(); iOp++) { 
                 String a = LITERAL_OPERANDS.get(iOperandA); 
                 String b = LITERAL_OPERANDS.get(iOperandB); 
                 String op = operators.get(iOp); 
                 assertSameResultsOrUncollapsed(join(a, op, b), join(b, op, a)); 
             } 
         } 
     } 
 } 


public void testFoldLiteralsTypeMismatches392() { 
     fold("true == true", "true"); 
     fold("true == false", "false"); 
     fold("true == null", "false"); 
     fold("false == null", "false"); 
     fold("null <= null", "true"); 
     fold("null >= null", "true"); 
     fold("null > null", "false"); 
     fold("null < null", "false"); 
     fold("false >= null", "true"); 
     fold("false <= null", "true"); 
     fold("false > null", "false"); 
     fold("false < null", "false"); 
     fold("true >= null", "true"); 
     fold("true <= null", "false"); 
     fold("true > null", "true"); 
     fold("true < null", "false"); 
     fold("true >= false", "true"); 
     fold("true <= false", "false"); 
     fold("true > false", "true"); 
     fold("true < false", "false"); 
 } 


public void testFoldArithmetic407() { 
     fold("x = 10 + 20", "x = 30"); 
     fold("x = 2 / 4", "x = 0.5"); 
     fold("x = 2.25 * 3", "x = 6.75"); 
     fold("z = x * y", "z = x * y"); 
     fold("x = y * 5", "x = y * 5"); 
     fold("x = 1 / 0", "x = 1 / 0"); 
     fold("x = 3 % 2", "x = 1"); 
     fold("x = 3 % -2", "x = 1"); 
     fold("x = -1 % 3", "x = -1"); 
     fold("x = 1 % 0", "x = 1 % 0"); 
 } 


public void testInvertibleOperators453() { 
     Map<String, String> inverses = ImmutableMap.<String, String>builder().put("==", "!=").put("===", "!==").put("<=", ">").put("<", ">=").put(">=", "<").put(">", "<=").put("!=", "==").put("!==", "===").build(); 
     Set<String> comparators = ImmutableSet.of("<=", "<", ">=", ">"); 
     Set<String> equalitors = ImmutableSet.of("==", "==="); 
     Set<String> uncomparables = ImmutableSet.of("undefined", "void 0"); 
     List<String> operators = ImmutableList.copyOf(inverses.values()); 
     for (int iOperandA = 0; iOperandA < LITERAL_OPERANDS.size(); iOperandA++) { 
         for (int iOperandB = 0; iOperandB < LITERAL_OPERANDS.size(); iOperandB++) { 
             for (int iOp = 0; iOp < operators.size(); iOp++) { 
                 String a = LITERAL_OPERANDS.get(iOperandA); 
                 String b = LITERAL_OPERANDS.get(iOperandB); 
                 String op = operators.get(iOp); 
                 String inverse = inverses.get(op); 
                 if (comparators.contains(op) && (uncomparables.contains(a) || uncomparables.contains(b))) { 
                     assertSameResults(join(a, op, b), "false"); 
                     assertSameResults(join(a, inverse, b), "false"); 
                 } else if (a.equals(b) && equalitors.contains(op)) { 
                     if (a.equals("NaN") || a.equals("Infinity") || a.equals("-Infinity")) { 
                         foldSame(join(a, op, b)); 
                         foldSame(join(a, inverse, b)); 
                     } else { 
                         assertSameResults(join(a, op, b), "true"); 
                         assertSameResults(join(a, inverse, b), "false"); 
                     } 
                 } else { 
                     assertNotSameResults(join(a, op, b), join(a, inverse, b)); 
                 } 
             } 
         } 
     } 
 } 


public void testFoldStringLength470() { 
     fold("x = ''.length", "x = 0"); 
     fold("x = '123'.length", "x = 3"); 
     fold("x = '123\u01dc'.length", "x = 4"); 
 } 


public void testFoldArrayLength562() { 
     fold("x = [].length", "x = 0"); 
     fold("x = [1,2,3].length", "x = 3"); 
     fold("x = [a,b].length", "x = 2"); 
     fold("x = [,,1].length", "x = 3"); 
     fold("x = [foo(), 0].length", "x = [foo(),0].length"); 
     fold("x = y.length", "x = y.length"); 
 } 


public void testFoldBitShiftsStringCompare608() { 
     assertResultString("x = -1 << 1", "x=-2"); 
     assertResultString("x = -1 << 8", "x=-256"); 
     assertResultString("x = -1 >> 1", "x=-1"); 
     assertResultString("x = -2 >> 1", "x=-1"); 
     assertResultString("x = -1 >> 0", "x=-1"); 
 } 


public void testIssue821613() { 
     foldSame("var a =(Math.random()>0.5? '1' : 2 ) + 3 + 4;"); 
     foldSame("var a = ((Math.random() ? 0 : 1) ||" + "(Math.random()>0.5? '1' : 2 )) + 3 + 4;"); 
 } 


public void testUndefinedComparison1640() { 
     fold("undefined == undefined", "true"); 
     fold("undefined == null", "true"); 
     fold("undefined == void 0", "true"); 
     fold("undefined == 0", "false"); 
     fold("undefined == 1", "false"); 
     fold("undefined == 'hi'", "false"); 
     fold("undefined == true", "false"); 
     fold("undefined == false", "false"); 
     fold("undefined === undefined", "true"); 
     fold("undefined === null", "false"); 
     fold("undefined === void 0", "true"); 
     foldSame("undefined == this"); 
     foldSame("undefined == x"); 
     fold("undefined != undefined", "false"); 
     fold("undefined != null", "false"); 
     fold("undefined != void 0", "false"); 
     fold("undefined != 0", "true"); 
     fold("undefined != 1", "true"); 
     fold("undefined != 'hi'", "true"); 
     fold("undefined != true", "true"); 
     fold("undefined != false", "true"); 
     fold("undefined !== undefined", "false"); 
     fold("undefined !== void 0", "false"); 
     fold("undefined !== null", "true"); 
     foldSame("undefined != this"); 
     foldSame("undefined != x"); 
     fold("undefined < undefined", "false"); 
     fold("undefined > undefined", "false"); 
     fold("undefined >= undefined", "false"); 
     fold("undefined <= undefined", "false"); 
     fold("0 < undefined", "false"); 
     fold("true > undefined", "false"); 
     fold("'hi' >= undefined", "false"); 
     fold("null <= undefined", "false"); 
     fold("undefined < 0", "false"); 
     fold("undefined > true", "false"); 
     fold("undefined >= 'hi'", "false"); 
     fold("undefined <= null", "false"); 
     fold("null == undefined", "true"); 
     fold("0 == undefined", "false"); 
     fold("1 == undefined", "false"); 
     fold("'hi' == undefined", "false"); 
     fold("true == undefined", "false"); 
     fold("false == undefined", "false"); 
     fold("null === undefined", "false"); 
     fold("void 0 === undefined", "true"); 
     fold("undefined == NaN", "false"); 
     fold("NaN == undefined", "false"); 
     fold("undefined == Infinity", "false"); 
     fold("Infinity == undefined", "false"); 
     fold("undefined == -Infinity", "false"); 
     fold("-Infinity == undefined", "false"); 
     fold("({}) == undefined", "false"); 
     fold("undefined == ({})", "false"); 
     fold("([]) == undefined", "false"); 
     fold("undefined == ([])", "false"); 
     fold("(/a/g) == undefined", "false"); 
     fold("undefined == (/a/g)", "false"); 
     fold("(function(){}) == undefined", "false"); 
     fold("undefined == (function(){})", "false"); 
     fold("undefined != NaN", "true"); 
     fold("NaN != undefined", "true"); 
     fold("undefined != Infinity", "true"); 
     fold("Infinity != undefined", "true"); 
     fold("undefined != -Infinity", "true"); 
     fold("-Infinity != undefined", "true"); 
     fold("({}) != undefined", "true"); 
     fold("undefined != ({})", "true"); 
     fold("([]) != undefined", "true"); 
     fold("undefined != ([])", "true"); 
     fold("(/a/g) != undefined", "true"); 
     fold("undefined != (/a/g)", "true"); 
     fold("(function(){}) != undefined", "true"); 
     fold("undefined != (function(){})", "true"); 
     foldSame("this == undefined"); 
     foldSame("x == undefined"); 
 } 


public void testFoldObjectLiteralRef2655() { 
     late = false; 
     test("({a:x}).a += 1", "({a:x}).a = x + 1"); 
     late = true; 
     testSame("({a:x}).a += 1"); 
 } 


public void testAssignOpsLate670() { 
     late = true; 
     fold("x=x+y", "x+=y"); 
     foldSame("x=y+x"); 
     fold("x=x*y", "x*=y"); 
     fold("x=y*x", "x*=y"); 
     fold("x.y=x.y+z", "x.y+=z"); 
     foldSame("next().x = next().x + 1"); 
     fold("x=x-y", "x-=y"); 
     foldSame("x=y-x"); 
     fold("x=x|y", "x|=y"); 
     fold("x=y|x", "x|=y"); 
     fold("x=x*y", "x*=y"); 
     fold("x=y*x", "x*=y"); 
     fold("x.y=x.y+z", "x.y+=z"); 
     foldSame("next().x = next().x + 1"); 
     fold("({a:1}).a = ({a:1}).a + 1", "({a:1}).a = 2"); 
 } 


public void testFoldSimpleArithmeticOp807() { 
     foldSame("x*NaN"); 
     foldSame("NaN/y"); 
     foldSame("f(x)-0"); 
     foldSame("f(x)*1"); 
     foldSame("1*f(x)"); 
     foldSame("0+a+b"); 
     foldSame("0-a-b"); 
     foldSame("a+b-0"); 
     foldSame("(1+x)*NaN"); 
     foldSame("(1+f(x))*NaN"); 
 } 


public void testFoldTypeof852() { 
     fold("x = typeof 1", "x = \"number\""); 
     fold("x = typeof 'foo'", "x = \"string\""); 
     fold("x = typeof true", "x = \"boolean\""); 
     fold("x = typeof false", "x = \"boolean\""); 
     fold("x = typeof null", "x = \"object\""); 
     fold("x = typeof undefined", "x = \"undefined\""); 
     fold("x = typeof void 0", "x = \"undefined\""); 
     fold("x = typeof []", "x = \"object\""); 
     fold("x = typeof [1]", "x = \"object\""); 
     fold("x = typeof [1,[]]", "x = \"object\""); 
     fold("x = typeof {}", "x = \"object\""); 
     fold("x = typeof function() {}", "x = 'function'"); 
     foldSame("x = typeof[1,[foo()]]"); 
     foldSame("x = typeof{bathwater:baby()}"); 
 } 


public void testFoldInstanceOf876() { 
     fold("64 instanceof Object", "false"); 
     fold("64 instanceof Number", "false"); 
     fold("'' instanceof Object", "false"); 
     fold("'' instanceof String", "false"); 
     fold("true instanceof Object", "false"); 
     fold("true instanceof Boolean", "false"); 
     fold("!0 instanceof Object", "false"); 
     fold("!0 instanceof Boolean", "false"); 
     fold("false instanceof Object", "false"); 
     fold("null instanceof Object", "false"); 
     fold("undefined instanceof Object", "false"); 
     fold("NaN instanceof Object", "false"); 
     fold("Infinity instanceof Object", "false"); 
     fold("[] instanceof Object", "true"); 
     fold("({}) instanceof Object", "true"); 
     foldSame("new Foo() instanceof Object"); 
     foldSame("[] instanceof Foo"); 
     foldSame("({}) instanceof Foo"); 
     fold("(function() {}) instanceof Object", "true"); 
     foldSame("x instanceof Foo"); 
 } 


public void testUndefinedComparison3952() { 
     fold("\"123\" !== undefined", "true"); 
     fold("\"123\" === undefined", "false"); 
     fold("undefined !== \"123\"", "true"); 
     fold("undefined === \"123\"", "false"); 
 } 


public void testNullComparison11089() { 
     fold("null == undefined", "true"); 
     fold("null == null", "true"); 
     fold("null == void 0", "true"); 
     fold("null == 0", "false"); 
     fold("null == 1", "false"); 
     fold("null == 'hi'", "false"); 
     fold("null == true", "false"); 
     fold("null == false", "false"); 
     fold("null === undefined", "false"); 
     fold("null === null", "true"); 
     fold("null === void 0", "false"); 
     foldSame("null == this"); 
     foldSame("null == x"); 
     fold("null != undefined", "false"); 
     fold("null != null", "false"); 
     fold("null != void 0", "false"); 
     fold("null != 0", "true"); 
     fold("null != 1", "true"); 
     fold("null != 'hi'", "true"); 
     fold("null != true", "true"); 
     fold("null != false", "true"); 
     fold("null !== undefined", "true"); 
     fold("null !== void 0", "true"); 
     fold("null !== null", "false"); 
     foldSame("null != this"); 
     foldSame("null != x"); 
     fold("null < null", "false"); 
     fold("null > null", "false"); 
     fold("null >= null", "true"); 
     fold("null <= null", "true"); 
     foldSame("0 < null"); 
     fold("true > null", "true"); 
     foldSame("'hi' >= null"); 
     fold("null <= null", "true"); 
     foldSame("null < 0"); 
     fold("null > true", "false"); 
     foldSame("null >= 'hi'"); 
     fold("null <= null", "true"); 
     fold("null == null", "true"); 
     fold("0 == null", "false"); 
     fold("1 == null", "false"); 
     fold("'hi' == null", "false"); 
     fold("true == null", "false"); 
     fold("false == null", "false"); 
     fold("null === null", "true"); 
     fold("void 0 === null", "false"); 
     fold("null == NaN", "false"); 
     fold("NaN == null", "false"); 
     fold("null == Infinity", "false"); 
     fold("Infinity == null", "false"); 
     fold("null == -Infinity", "false"); 
     fold("-Infinity == null", "false"); 
     fold("({}) == null", "false"); 
     fold("null == ({})", "false"); 
     fold("([]) == null", "false"); 
     fold("null == ([])", "false"); 
     fold("(/a/g) == null", "false"); 
     fold("null == (/a/g)", "false"); 
     fold("(function(){}) == null", "false"); 
     fold("null == (function(){})", "false"); 
     fold("null != NaN", "true"); 
     fold("NaN != null", "true"); 
     fold("null != Infinity", "true"); 
     fold("Infinity != null", "true"); 
     fold("null != -Infinity", "true"); 
     fold("-Infinity != null", "true"); 
     fold("({}) != null", "true"); 
     fold("null != ({})", "true"); 
     fold("([]) != null", "true"); 
     fold("null != ([])", "true"); 
     fold("(/a/g) != null", "true"); 
     fold("null != (/a/g)", "true"); 
     fold("(function(){}) != null", "true"); 
     fold("null != (function(){})", "true"); 
     foldSame("({a:f()}) == null"); 
     foldSame("null == ({a:f()})"); 
     foldSame("([f()]) == null"); 
     foldSame("null == ([f()])"); 
     foldSame("this == null"); 
     foldSame("x == null"); 
 } 


public void testNotFoldBackToTrueFalse1092() { 
     late = false; 
     fold("!0", "true"); 
     fold("!1", "false"); 
     fold("!3", "false"); 
     late = true; 
     foldSame("!0"); 
     foldSame("!1"); 
     fold("!3", "false"); 
     foldSame("false"); 
     foldSame("true"); 
 } 


public void testIEString1117() { 
     testSame("!+'\\v1'"); 
 } 


public void testFoldLeftChildConcat1268() { 
     foldSame("x +5 + \"1\""); 
     fold("x+\"5\" + \"1\"", "x + \"51\""); 
     fold("\"a\"+(\"b\"+c)", "\"ab\"+c"); 
 } 


public void testFoldVoid1278() { 
     foldSame("void 0"); 
     fold("void 1", "void 0"); 
     fold("void x", "void 0"); 
     fold("void x()", "void x()"); 
 } 


public void testFoldLiteralsAsNumbers1354() { 
     fold("x/'12'", "x/12"); 
     fold("x/('12'+'6')", "x/126"); 
     fold("true*x", "1*x"); 
     fold("x/false", "x/0"); 
 } 


public void testFoldLogicalOp1378() { 
     fold("x = true && x", "x = x"); 
     foldSame("x = [foo()] && x"); 
     fold("x = false && x", "x = false"); 
     fold("x = true || x", "x = true"); 
     fold("x = false || x", "x = x"); 
     fold("x = 0 && x", "x = 0"); 
     fold("x = 3 || x", "x = 3"); 
     fold("x = false || 0", "x = 0"); 
     fold("a = x && true", "a=x&&true"); 
     fold("a = x && false", "a=x&&false"); 
     fold("a = x || 3", "a=x||3"); 
     fold("a = x || false", "a=x||false"); 
     fold("a = b ? c : x || false", "a=b?c:x||false"); 
     fold("a = b ? x || false : c", "a=b?x||false:c"); 
     fold("a = b ? c : x && true", "a=b?c:x&&true"); 
     fold("a = b ? x && true : c", "a=b?x&&true:c"); 
     foldSame("a = x || false ? b : c"); 
     foldSame("a = x && true ? b : c"); 
     fold("x = foo() || true || bar()", "x = foo()||true"); 
     fold("x = foo() || false || bar()", "x = foo()||bar()"); 
     fold("x = foo() || true && bar()", "x = foo()||bar()"); 
     fold("x = foo() || false && bar()", "x = foo()||false"); 
     fold("x = foo() && false && bar()", "x = foo()&&false"); 
     fold("x = foo() && true && bar()", "x = foo()&&bar()"); 
     fold("x = foo() && false || bar()", "x = foo()&&false||bar()"); 
     fold("1 && b()", "b()"); 
     fold("a() && (1 && b())", "a() && b()"); 
     fold("(a() && 1) && b()", "(a() && 1) && b()"); 
     foldSame("x = foo() && true || bar()"); 
     foldSame("foo() && true || bar()"); 
 } 


public void testFoldComparison21426() { 
     fold("x = 0 === 0", "x = true"); 
     fold("x = 1 === 2", "x = false"); 
     fold("x = 'abc' === 'def'", "x = false"); 
     fold("x = 'abc' === 'abc'", "x = true"); 
     fold("x = \"\" === ''", "x = true"); 
     fold("x = foo() === bar()", "x = foo()===bar()"); 
     fold("x = 1 !== 0", "x = true"); 
     fold("x = 'abc' !== 'def'", "x = true"); 
     fold("x = 'a' !== 'a'", "x = false"); 
     fold("x = y === y", "x = y===y"); 
     fold("x = true === true", "x = true"); 
     fold("x = false === false", "x = true"); 
     fold("x = false === null", "x = false"); 
     fold("x = false === true", "x = false"); 
     fold("x = true === null", "x = false"); 
     fold("0 === 0", "true"); 
     fold("1 === 2", "false"); 
     fold("'abc' === 'def'", "false"); 
     fold("'abc' === 'abc'", "true"); 
     fold("\"\" === ''", "true"); 
     foldSame("foo() === bar()"); 
     foldSame("1 === '1'"); 
     foldSame("1 === true"); 
     foldSame("1 !== '1'"); 
     foldSame("1 !== true"); 
     fold("1 !== 0", "true"); 
     fold("'abc' !== 'def'", "true"); 
     fold("'a' !== 'a'", "false"); 
     foldSame("x === x"); 
     fold("true === true", "true"); 
     fold("false === null", "false"); 
     fold("false === true", "false"); 
     fold("true === null", "false"); 
 } 


public void testFoldArithmeticInfinity1489() { 
     fold("x=-Infinity-2", "x=-Infinity"); 
     fold("x=Infinity-2", "x=Infinity"); 
     fold("x=Infinity*5", "x=Infinity"); 
 } 


public void testFoldLiteralNames1528() { 
     foldSame("NaN == NaN"); 
     foldSame("Infinity == Infinity"); 
     foldSame("Infinity == NaN"); 
     fold("undefined == NaN", "false"); 
     fold("undefined == Infinity", "false"); 
     foldSame("Infinity >= Infinity"); 
     foldSame("NaN >= NaN"); 
 } 


public void testFoldComplex1762() { 
     fold("x = (3 / 1.0) + (1 * 2)", "x = 5"); 
     fold("x = (1 == 1.0) && foo() && true", "x = foo()&&true"); 
     fold("x = 'abc' + 5 + 10", "x = \"abc510\""); 
 } 


public void testFoldArithmeticStringComp1802() { 
     assertResultString("x = 10 - 20", "x=-10"); 
 } 


public void testIssue5221895() { 
     testSame("[][1] = 1;"); 
 } 


public void testConvertToNumberNegativeInf2070() { 
     foldSame("var x = 3 * (r ? Infinity : -Infinity);"); 
 } 


public void testFoldBitwiseOp22106() { 
     fold("x = y & 1 & 1", "x = y & 1"); 
     fold("x = y & 1 & 2", "x = y & 0"); 
     fold("x = y & 3 & 1", "x = y & 1"); 
     fold("x = 3 & y & 1", "x = y & 1"); 
     fold("x = y & 3 & 3", "x = y & 3"); 
     fold("x = 3 & y & 3", "x = y & 3"); 
     fold("x = y | 1 | 1", "x = y | 1"); 
     fold("x = y | 1 | 2", "x = y | 3"); 
     fold("x = y | 3 | 1", "x = y | 3"); 
     fold("x = 3 | y | 1", "x = y | 3"); 
     fold("x = y | 3 | 3", "x = y | 3"); 
     fold("x = 3 | y | 3", "x = y | 3"); 
     fold("x = y ^ 1 ^ 1", "x = y ^ 0"); 
     fold("x = y ^ 1 ^ 2", "x = y ^ 3"); 
     fold("x = y ^ 3 ^ 1", "x = y ^ 2"); 
     fold("x = 3 ^ y ^ 1", "x = y ^ 2"); 
     fold("x = y ^ 3 ^ 3", "x = y ^ 0"); 
     fold("x = 3 ^ y ^ 3", "x = y ^ 0"); 
     fold("x = Infinity | NaN", "x=0"); 
     fold("x = 12 | NaN", "x=12"); 
 } 


public void testFoldArithmetic32213() { 
     fold("x = null * undefined", "x = NaN"); 
     fold("x = null * 1", "x = 0"); 
     fold("x = (null - 1) * 2", "x = -2"); 
     fold("x = (null + 1) * 2", "x = 2"); 
 } 


public void testFoldLeftChildOp2302() { 
     fold("x * Infinity * 2", "x * Infinity"); 
     foldSame("x - Infinity - 2"); 
     foldSame("x - 1 + Infinity"); 
     foldSame("x - 2 + 1"); 
     foldSame("x - 2 + 3"); 
     foldSame("1 + x - 2 + 1"); 
     foldSame("1 + x - 2 + 3"); 
     foldSame("1 + x - 2 + 3 - 1"); 
     foldSame("f(x)-0"); 
     foldSame("x-0-0"); 
     foldSame("x+2-2+2"); 
     foldSame("x+2-2+2-2"); 
     foldSame("x-2+2"); 
     foldSame("x-2+2-2"); 
     foldSame("x-2+2-2+2"); 
     foldSame("1+x-0-NaN"); 
     foldSame("1+f(x)-0-NaN"); 
     foldSame("1+x-0+NaN"); 
     foldSame("1+f(x)-0+NaN"); 
     foldSame("1+x+NaN"); 
     foldSame("x+2-2"); 
     foldSame("x+2"); 
     foldSame("x-2"); 
 } 


public void testFoldMixed2421() { 
     fold("''+[1]", "'1'"); 
     foldSame("false+[]"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // ===, !== comparison tests
  

  

  

  

  

  

  

  

  

  

  

 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static final List<String> LITERAL_OPERANDS =
      ImmutableList.of(
          "null",
          "undefined",
          "void 0",
          "true",
          "false",
          "!0",
          "!1",
          "0",
          "1",
          "''",
          "'123'",
          "'abc'",
          "'def'",
          "NaN",
          "Infinity",
          // TODO(nicksantos): Add more literals
          "-Infinity"
          //"({})",
          // "[]"
          //"[0]",
          //"Object",
          //"(function() {})"
          );

  

  

  

  private String join(String operandA, String op, String operandB) {
    return operandA + " " + op + " " + operandB;
  }

  private void assertSameResultsOrUncollapsed(String exprA, String exprB) {
    String resultA = process(exprA);
    String resultB = process(exprB);  // TODO: why is nothing done with this?
    if (resultA.equals(print(exprA))) {
      foldSame(exprA);
      foldSame(exprB);
    } else {
      assertSameResults(exprA, exprB);
    }
  }

  private void assertSameResults(String exprA, String exprB) {
    assertEquals(
        "Expressions did not fold the same\nexprA: " +
        exprA + "\nexprB: " + exprB,
        process(exprA), process(exprB));
  }

  private void assertNotSameResults(String exprA, String exprB) {
    assertFalse(
        "Expressions folded the same\nexprA: " +
        exprA + "\nexprB: " + exprB,
        process(exprA).equals(process(exprB)));
  }

  private String process(String js) {
    return printHelper(js, true);
  }

  private String print(String js) {
    return printHelper(js, false);
  }

  private String printHelper(String js, boolean runProcessor) {
    Compiler compiler = createCompiler();
    CompilerOptions options = getOptions();
    compiler.init(
        ImmutableList.<SourceFile>of(),
        ImmutableList.of(SourceFile.fromCode("testcode", js)),
        options);
    Node root = compiler.parseInputs();
    assertTrue("Unexpected parse error(s): " +
        Joiner.on("\n").join(compiler.getErrors()) +
        "\nEXPR: " + js,
        root != null);
    Node externsRoot = root.getFirstChild();
    Node mainRoot = externsRoot.getNext();
    if (runProcessor) {
      getProcessor(compiler).process(externsRoot, mainRoot);
    }
    return compiler.toSource(mainRoot);
  }
}
