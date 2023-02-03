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

package com.google.javascript.jscomp.parsing;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.jscomp.testing.TestErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;

/**
 * Tests {@link IRFactory}.
 */
public class IRFactoryTest extends BaseJSTypeTestCase {

  private LanguageMode mode = LanguageMode.ECMASCRIPT3;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mode = LanguageMode.ECMASCRIPT3;
  }


public void testLabel262() { 
     testNewParser("l: while (f()) { if (g()) { continue l; } }", "SCRIPT 1 [source_file: FileName.js] [length: 43]\n" + "    LABEL 1 [source_file: FileName.js] [length: 2]\n" + "        LABEL_NAME l 1 [source_file: FileName.js] [length: 2]\n" + "        WHILE 1 [source_file: FileName.js] [length: 40]\n" + "            CALL 1 [source_file: FileName.js] [length: 3]\n" + "                NAME f 1 [source_file: FileName.js] [length: 1]\n" + "            BLOCK 1 [source_file: FileName.js] [length: 28]\n" + "                IF 1 [source_file: FileName.js] [length: 24]\n" + "                    CALL 1 [source_file: FileName.js] [length: 3]\n" + "                        NAME g 1 [source_file: FileName.js] [length: 1]\n" + "                    BLOCK 1 [source_file: FileName.js] [length: 15]\n" + "                        CONTINUE 1 [source_file: FileName.js] [length: 11]\n" + "                            LABEL_NAME l 1 [source_file: FileName.js] [length: 1]\n"); 
 } 


public void testTryWithoutFinallyLocation306() { 
     Node root = newParse("try {\n" + "  var x = 1;\n" + "} catch (ex) {\n" + "  var y = 2;\n" + "}\n"); 
     Node tryStmt = root.getFirstChild(); 
     Node tryBlock = tryStmt.getFirstChild(); 
     Node catchBlock = tryBlock.getNext(); 
     Node catchStmt = catchBlock.getFirstChild(); 
     Node exceptionVar = catchStmt.getFirstChild(); 
     Node exceptionBlock = exceptionVar.getNext(); 
     Node varDecl = exceptionBlock.getFirstChild(); 
     assertNodePosition(1, 0, tryStmt); 
     assertNodePosition(1, 4, tryBlock); 
     assertNodePosition(3, 0, catchBlock); 
     assertNodePosition(3, 2, catchStmt); 
     assertNodePosition(3, 9, exceptionVar); 
     assertNodePosition(3, 13, exceptionBlock); 
     assertNodePosition(4, 2, varDecl); 
 } 


public void testLabel315() { 
     testNewParser("foo: bar", "SCRIPT 1 [source_file: FileName.js] [length: 8]\n" + "    LABEL 1 [source_file: FileName.js] [length: 4]\n" + "        LABEL_NAME foo 1 [source_file: FileName.js] [length: 4]\n" + "        EXPR_RESULT 1 [source_file: FileName.js] [length: 3]\n" + "            NAME bar 1 [source_file: FileName.js] [length: 3]\n"); 
 } 


public void testFunctionParamLocation341() { 
     Node root = newParse("function\n" + "     foo(a,\n" + "     b,\n" + "     c)\n" + "{}\n"); 
     Node function = root.getFirstChild(); 
     Node functionName = function.getFirstChild(); 
     Node params = functionName.getNext(); 
     Node param1 = params.getFirstChild(); 
     Node param2 = param1.getNext(); 
     Node param3 = param2.getNext(); 
     Node body = params.getNext(); 
     assertNodePosition(1, 0, function); 
     assertNodePosition(2, 5, functionName); 
     assertNodePosition(2, 8, params); 
     assertNodePosition(2, 9, param1); 
     assertNodePosition(3, 5, param2); 
     assertNodePosition(4, 5, param3); 
     assertNodePosition(5, 0, body); 
 } 


public void testObjectLiteral2360() { 
     newParse("var o = {a: 1}"); 
 } 


public void testNestedOr365() { 
     Node root = newParse("if (a && \n" + "    b() || \n" + "    /* comment */\n" + "    c) {\n" + "}\n"); 
     Node ifStmt = root.getFirstChild(); 
     Node orClause = ifStmt.getFirstChild(); 
     Node andClause = orClause.getFirstChild(); 
     Node cName = andClause.getNext(); 
     assertNodePosition(1, 0, ifStmt); 
     assertNodePosition(1, 4, orClause); 
     assertNodePosition(1, 4, andClause); 
     assertNodePosition(4, 4, cName); 
 } 


public void testObjectLiteral7370() { 
     mode = LanguageMode.ECMASCRIPT5; 
     testNewParser("({get 1() {}})", "SCRIPT 1 [source_file: FileName.js] [length: 14]\n" + "    EXPR_RESULT 1 [source_file: FileName.js] [length: 13]\n" + "        OBJECTLIT 1 [source_file: FileName.js] [length: 12]\n" + "            GETTER_DEF 1 1 [quoted: 1] [source_file: FileName.js] [length: 1]\n" + "                FUNCTION  1 [source_file: FileName.js] [length: 6]\n" + "                    NAME  1 [source_file: FileName.js]\n" + "                    PARAM_LIST 1 [source_file: FileName.js]\n" + "                    BLOCK 1 [source_file: FileName.js] [length: 2]\n"); 
 } 


public void testSwitchLocation383() { 
     Node root = newParse("switch (a) {\n" + "  //{\n" + "   case 1:\n" + "     b++;\n" + "   case 2:\n" + "   default:\n" + "     b--;\n" + "  }\n"); 
     Node switchStmt = root.getFirstChild(); 
     Node switchVar = switchStmt.getFirstChild(); 
     Node firstCase = switchVar.getNext(); 
     Node caseArg = firstCase.getFirstChild(); 
     Node caseBody = caseArg.getNext(); 
     Node caseExprStmt = caseBody.getFirstChild(); 
     Node incrExpr = caseExprStmt.getFirstChild(); 
     Node incrVar = incrExpr.getFirstChild(); 
     Node secondCase = firstCase.getNext(); 
     Node defaultCase = secondCase.getNext(); 
     assertNodePosition(1, 0, switchStmt); 
     assertNodePosition(1, 8, switchVar); 
     assertNodePosition(3, 3, firstCase); 
     assertNodePosition(3, 8, caseArg); 
     assertNodePosition(3, 3, caseBody); 
     assertNodePosition(4, 5, caseExprStmt); 
     assertNodePosition(4, 5, incrExpr); 
     assertNodePosition(4, 5, incrVar); 
     assertNodePosition(5, 3, secondCase); 
     assertNodePosition(6, 3, defaultCase); 
 } 


public void testLabel3384() { 
     testNewParser("Foo:Bar:X:{ break Bar; }", "SCRIPT 1 [source_file: FileName.js] [length: 24]\n" + "    LABEL 1 [source_file: FileName.js] [length: 4]\n" + "        LABEL_NAME Foo 1 [source_file: FileName.js] [length: 4]\n" + "        LABEL 1 [source_file: FileName.js] [length: 4]\n" + "            LABEL_NAME Bar 1 [source_file: FileName.js] [length: 4]\n" + "            LABEL 1 [source_file: FileName.js] [length: 2]\n" + "                LABEL_NAME X 1 [source_file: FileName.js] [length: 2]\n" + "                BLOCK 1 [source_file: FileName.js] [length: 14]\n" + "                    BREAK 1 [source_file: FileName.js] [length: 10]\n" + "                        LABEL_NAME Bar 1 [source_file: FileName.js] [length: 3]\n"); 
 } 


public void testObjectLiteral8439() { 
     mode = LanguageMode.ECMASCRIPT5; 
     testNewParser("({set 1(a) {}})", "SCRIPT 1 [source_file: FileName.js] [length: 15]\n" + "    EXPR_RESULT 1 [source_file: FileName.js] [length: 14]\n" + "        OBJECTLIT 1 [source_file: FileName.js] [length: 13]\n" + "            SETTER_DEF 1 1 [quoted: 1] [source_file: FileName.js] [length: 1]\n" + "                FUNCTION  1 [source_file: FileName.js] [length: 7]\n" + "                    NAME  1 [source_file: FileName.js]\n" + "                    PARAM_LIST 1 [source_file: FileName.js]\n" + "                        NAME a 1 [source_file: FileName.js] [length: 1]\n" + "                    BLOCK 1 [source_file: FileName.js] [length: 2]\n"); 
 } 


public void testRegexpLocation563() { 
     Node root = newParse("var path =\n" + "replace(\n" + "/a/g," + "'/');\n"); 
     Node firstVarDecl = root.getFirstChild(); 
     Node firstVar = firstVarDecl.getFirstChild(); 
     Node callNode = firstVar.getFirstChild(); 
     Node fnName = callNode.getFirstChild(); 
     Node regexObject = fnName.getNext(); 
     Node aString = regexObject.getFirstChild(); 
     Node endRegexString = regexObject.getNext(); 
     assertNodePosition(1, 0, firstVarDecl); 
     assertNodePosition(1, 4, 4, firstVar); 
     assertNodePosition(2, 0, 18, callNode); 
     assertNodePosition(2, 0, 7, fnName); 
     assertNodePosition(3, 0, regexObject); 
     assertNodePosition(3, 0, aString); 
     assertNodePosition(3, 5, endRegexString); 
 } 


public void testMultilineBitTestLocation628() { 
     Node root = newParse("if (\n" + "      ((a \n" + "        | 3 \n" + "       ) == \n" + "       (b \n" + "        & 2)) && \n" + "      ((a \n" + "         ^ 0xffff) \n" + "       != \n" + "       (c \n" + "        << 1))) {\n" + "}\n"); 
     Node ifStmt = root.getFirstChild(); 
     Node andTest = ifStmt.getFirstChild(); 
     Node eqTest = andTest.getFirstChild(); 
     Node notEqTest = eqTest.getNext(); 
     Node bitOrTest = eqTest.getFirstChild(); 
     Node bitAndTest = bitOrTest.getNext(); 
     Node bitXorTest = notEqTest.getFirstChild(); 
     Node bitShiftTest = bitXorTest.getNext(); 
     assertNodePosition(1, 0, ifStmt); 
     assertNodePosition(2, 8, eqTest); 
     assertNodePosition(7, 8, notEqTest); 
     assertNodePosition(2, 8, bitOrTest); 
     assertNodePosition(5, 8, bitAndTest); 
     assertNodePosition(7, 8, bitXorTest); 
     assertNodePosition(10, 8, bitShiftTest); 
 } 


public void testIfLocation700() { 
     Node root = newParse("if\n" + "  (a == 3)\n" + "{\n" + "  b = 0;\n" + "}\n" + "  else\n" + "{\n" + "  c = 1;\n" + "}\n"); 
     Node ifStmt = root.getFirstChild(); 
     Node eqClause = ifStmt.getFirstChild(); 
     Node thenClause = eqClause.getNext(); 
     Node elseClause = thenClause.getNext(); 
     assertNodePosition(1, 0, ifStmt); 
     assertNodePosition(2, 3, eqClause); 
     assertNodePosition(3, 0, thenClause); 
     assertNodePosition(7, 0, elseClause); 
 } 


public void testArrayLiteral2748() throws Exception { 
     testNewParser("[a, , b]", "SCRIPT 1 [source_file: FileName.js] [length: 8]\n" + "    EXPR_RESULT 1 [source_file: FileName.js] [length: 8]\n" + "        ARRAYLIT 1 [source_file: FileName.js] [length: 8]\n" + "            NAME a 1 [source_file: FileName.js] [length: 1]\n" + "            EMPTY 1 [source_file: FileName.js] [length: 1]\n" + "            NAME b 1 [source_file: FileName.js] [length: 1]\n"); 
 } 


public void testAssignmentValidation786() { 
     testNoParseError("x=1"); 
     testNoParseError("x.y=1"); 
     testNoParseError("f().y=1"); 
     testParseError("(x||y)=1", INVALID_ASSIGNMENT_TARGET); 
     testParseError("(x?y:z)=1", INVALID_ASSIGNMENT_TARGET); 
     testParseError("f()=1", INVALID_ASSIGNMENT_TARGET); 
     testNoParseError("x+=1"); 
     testNoParseError("x.y+=1"); 
     testNoParseError("f().y+=1"); 
     testParseError("(x||y)+=1", INVALID_ASSIGNMENT_TARGET); 
     testParseError("(x?y:z)+=1", INVALID_ASSIGNMENT_TARGET); 
     testParseError("f()+=1", INVALID_ASSIGNMENT_TARGET); 
     testParseError("f()++", INVALID_INCREMENT_TARGET); 
     testParseError("f()--", INVALID_DECREMENT_TARGET); 
     testParseError("++f()", INVALID_INCREMENT_TARGET); 
     testParseError("--f()", INVALID_DECREMENT_TARGET); 
 } 


public void testNegation2791() { 
     testNewParser("-2", "SCRIPT 1 [source_file: FileName.js] [length: 2]\n" + "    EXPR_RESULT 1 [source_file: FileName.js] [length: 2]\n" + "        NUMBER -2.0 1 [source_file: FileName.js] [length: 1]\n"); 
 } 


public void testReturnLocation927() { 
     Node root = newParse("function\n" + "    foo(\n" + "    a,\n" + "    b,\n" + "    c) {\n" + "    return\n" + "    4;\n" + "}\n"); 
     Node function = root.getFirstChild(); 
     Node functionName = function.getFirstChild(); 
     Node params = functionName.getNext(); 
     Node body = params.getNext(); 
     Node returnStmt = body.getFirstChild(); 
     Node exprStmt = returnStmt.getNext(); 
     Node returnVal = exprStmt.getFirstChild(); 
     assertNodePosition(6, 4, returnStmt); 
     assertNodePosition(7, 4, exprStmt); 
     assertNodePosition(7, 4, returnVal); 
 } 


public void testObjectLitLocation963() { 
     Node root = newParse("var foo =\n" + "{ \n" + "'A' : 'A', \n" + "'B' : 'B', \n" + "'C' :\n" + "    'C' \n" + "};\n"); 
     Node firstVarDecl = root.getFirstChild(); 
     Node firstVar = firstVarDecl.getFirstChild(); 
     Node firstObjectLit = firstVar.getFirstChild(); 
     Node firstKey = firstObjectLit.getFirstChild(); 
     Node firstValue = firstKey.getFirstChild(); 
     Node secondKey = firstKey.getNext(); 
     Node secondValue = secondKey.getFirstChild(); 
     Node thirdKey = secondKey.getNext(); 
     Node thirdValue = thirdKey.getFirstChild(); 
     assertNodePosition(1, 4, firstVar); 
     assertNodePosition(2, 0, firstObjectLit); 
     assertNodePosition(3, 0, firstKey); 
     assertNodePosition(3, 6, firstValue); 
     assertNodePosition(4, 0, secondKey); 
     assertNodePosition(4, 6, secondValue); 
     assertNodePosition(5, 0, thirdKey); 
     assertNodePosition(6, 4, thirdValue); 
 } 


public void testObjectLiteral61083() { 
     testNewParser("({1: true})", "SCRIPT 1 [source_file: FileName.js] [length: 11]\n" + "    EXPR_RESULT 1 [source_file: FileName.js] [length: 10]\n" + "        OBJECTLIT 1 [source_file: FileName.js] [length: 9]\n" + "            STRING_KEY 1 1 [quoted: 1] [source_file: FileName.js] [length: 1]\n" + "                TRUE 1 [source_file: FileName.js] [length: 4]\n"); 
 } 


public void testTryLocation1226() { 
     Node root = newParse("try {\n" + "  var x = 1;\n" + "} catch\n" + "   (err)\n" + "{\n" + "} finally {\n" + "  var y = 2;\n" + "}\n"); 
     Node tryStmt = root.getFirstChild(); 
     Node tryBlock = tryStmt.getFirstChild(); 
     Node catchBlock = tryBlock.getNext(); 
     Node catchVarBlock = catchBlock.getFirstChild(); 
     Node catchVar = catchVarBlock.getFirstChild(); 
     Node finallyBlock = catchBlock.getNext(); 
     Node finallyStmt = finallyBlock.getFirstChild(); 
     assertNodePosition(1, 0, tryStmt); 
     assertNodePosition(1, 4, tryBlock); 
     assertNodePosition(3, 2, catchVarBlock); 
     assertNodePosition(4, 4, catchVar); 
     assertNodePosition(3, 0, catchBlock); 
     assertNodePosition(6, 10, finallyBlock); 
     assertNodePosition(7, 2, finallyStmt); 
 } 


public void testCommaLocation1407() { 
     Node root = newParse("a,\n" + "b,\n" + "c;\n"); 
     Node statement = root.getFirstChild(); 
     Node comma1 = statement.getFirstChild(); 
     Node comma2 = comma1.getFirstChild(); 
     Node cRef = comma2.getNext(); 
     Node aRef = comma2.getFirstChild(); 
     Node bRef = aRef.getNext(); 
     assertNodePosition(1, 0, comma2); 
     assertNodePosition(1, 0, aRef); 
     assertNodePosition(2, 0, bRef); 
     assertNodePosition(3, 0, cRef); 
 } 


public void testNewLocationMultiLine1435() { 
     Node root = newParse("new   \n" + "c();\n"); 
     Node exprStmt = root.getFirstChild(); 
     Node newExpr = exprStmt.getFirstChild(); 
     assertNodePosition(1, 0, 10, newExpr); 
 } 


public void testDelete41436() { 
     testParseError("delete 'x';", "Invalid delete operand. Only properties can be deleted."); 
 } 


public void testLinenoFor1568() { 
     Node root = newParse("for(\n" + ";\n" + ";\n" + ") {\n" + "}\n"); 
     Node forNode = root.getFirstChild(); 
     Node initClause = forNode.getFirstChild(); 
     Node condClause = initClause.getNext(); 
     Node incrClause = condClause.getNext(); 
     assertNodePosition(1, 0, forNode); 
     assertNodePosition(2, 0, initClause); 
     assertNodePosition(3, 0, condClause); 
 } 


public void testTryWithoutCatchLocation1589() { 
     Node root = newParse("try {\n" + "  var x = 1;\n" + "} finally {\n" + "  var y = 2;\n" + "}\n"); 
     Node tryStmt = root.getFirstChild(); 
     Node tryBlock = tryStmt.getFirstChild(); 
     Node catchBlock = tryBlock.getNext(); 
     Node finallyBlock = catchBlock.getNext(); 
     Node finallyStmt = finallyBlock.getFirstChild(); 
     assertNodePosition(1, 0, tryStmt); 
     assertNodePosition(1, 4, tryBlock); 
     assertNodePosition(3, 0, catchBlock); 
     assertNodePosition(3, 10, finallyBlock); 
     assertNodePosition(4, 2, finallyStmt); 
 } 


public void testNegation31612() { 
     testNewParser("1 - -2", "SCRIPT 1 [source_file: FileName.js] [length: 6]\n" + "    EXPR_RESULT 1 [source_file: FileName.js] [length: 6]\n" + "        SUB 1 [source_file: FileName.js] [length: 6]\n" + "            NUMBER 1.0 1 [source_file: FileName.js] [length: 1]\n" + "            NUMBER -2.0 1 [source_file: FileName.js] [length: 1]\n"); 
 } 


public void testNegation11693() { 
     testNewParser("-a", "SCRIPT 1 [source_file: FileName.js] [length: 2]\n" + "    EXPR_RESULT 1 [source_file: FileName.js] [length: 2]\n" + "        NEG 1 [source_file: FileName.js] [length: 2]\n" + "            NAME a 1 [source_file: FileName.js] [length: 1]\n"); 
 } 


public void testBinaryExprLocation1743() { 
     Node root = newParse("var d = a\n" + "    + \n" + "    b;\n" + "var\n" + "    e =\n" + "    a +\n" + "    c;\n" + "var f = b\n" + "    / c;\n"); 
     Node firstVarDecl = root.getFirstChild(); 
     Node firstVar = firstVarDecl.getFirstChild(); 
     Node firstVarAdd = firstVar.getFirstChild(); 
     Node secondVarDecl = firstVarDecl.getNext(); 
     Node secondVar = secondVarDecl.getFirstChild(); 
     Node secondVarAdd = secondVar.getFirstChild(); 
     Node thirdVarDecl = secondVarDecl.getNext(); 
     Node thirdVar = thirdVarDecl.getFirstChild(); 
     Node thirdVarAdd = thirdVar.getFirstChild(); 
     assertNodePosition(1, 0, firstVarDecl); 
     assertNodePosition(1, 4, firstVar); 
     assertNodePosition(1, 8, firstVarAdd); 
     assertNodePosition(1, 8, firstVarAdd.getFirstChild()); 
     assertNodePosition(3, 4, firstVarAdd.getLastChild()); 
     assertNodePosition(4, 0, secondVarDecl); 
     assertNodePosition(5, 4, secondVar); 
     assertNodePosition(6, 4, secondVarAdd); 
     assertNodePosition(6, 4, secondVarAdd.getFirstChild()); 
     assertNodePosition(7, 4, secondVarAdd.getLastChild()); 
     assertNodePosition(8, 0, thirdVarDecl); 
     assertNodePosition(8, 4, thirdVar); 
     assertNodePosition(8, 8, thirdVarAdd); 
     assertNodePosition(8, 8, thirdVarAdd.getFirstChild()); 
     assertNodePosition(9, 6, thirdVarAdd.getLastChild()); 
 } 


public void testDelete11965() { 
     testNoParseError("delete a.b;"); 
 } 


public void testStrictScript2058() throws Exception { 
     assertNull(newParse("").getDirectives()); 
     assertEquals(Sets.newHashSet("use strict"), newParse("'use strict'").getDirectives()); 
 } 


public void testCompareLocation2243() { 
     Node root = newParse("a\n" + "<\n" + "b\n"); 
     Node condClause = root.getFirstChild().getFirstChild(); 
     Node lhs = condClause.getFirstChild(); 
     Node rhs = lhs.getNext(); 
     assertNodePosition(1, 0, condClause); 
     assertNodePosition(1, 0, lhs); 
     assertNodePosition(3, 0, rhs); 
 } 


public void testDelete22361() { 
     testNoParseError("delete a['b'];"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  // The old and new parser produce different results now with labels, and
  // named breaks and continues, so disable these tests.
  

  

  

  

  

  

  

  

  

  

  

  

  

  

   

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  final String INVALID_ASSIGNMENT_TARGET = "invalid assignment target";
  final String INVALID_INCREMENT_TARGET = "invalid increment target";
  final String INVALID_DECREMENT_TARGET = "invalid decrement target";

  final String INVALID_INC_OPERAND = "Invalid increment operand";
  final String INVALID_DEC_OPERAND = "Invalid decrement operand";

  

  private void testNoParseError(String string) {
    testParseError(string, (String)null);
  }

  private void testParseError(String string, String error) {
    testParseError(string, error == null ? null : new String[] { error });
  }

  private void testParseError(String string, String[] errors) {
    Node root = newParse(string, new TestErrorReporter(errors, null));
    assertTrue("unexpected warnings reported",
        errorReporter.hasEncounteredAllWarnings());
    assertTrue("expected error were not reported",
        errorReporter.hasEncounteredAllErrors());
  }

  private void assertMarkerPosition(Node n, int lineno, int charno) {
    int count = 0;
    for (JSDocInfo.Marker marker : n.getJSDocInfo().getMarkers()) {
      assertEquals(lineno, marker.getAnnotation().getStartLine());
      assertEquals(charno, marker.getAnnotation().getPositionOnStartLine());
      count++;
    }
    assertEquals(1, count);
  }

  private void assertNodePosition(int lineno, int charno, Node n) {
    assertEquals("Line number", lineno, n.getLineno());
    assertEquals("Column position", charno, n.getCharno());
  }

  private void assertNodePosition(int lineno, int charno, int length, Node n) {
    assertEquals("Line number", lineno, n.getLineno());
    assertEquals("Column position", charno, n.getCharno());
    assertEquals("Length", length, n.getLength());
  }


  private void testNewParser(String code, String expected) {
    String actual = newParse(code).toStringTree();
    assertEquals(expected, actual);
  }

  private Node newParse(String string) {
    return newParse(string, new TestErrorReporter(null, null));
  }

  private Node newParse(String string, TestErrorReporter errorReporter) {
    CompilerEnvirons environment = new CompilerEnvirons();

    environment.setRecordingComments(true);
    environment.setRecordingLocalJsDocComments(true);

    Parser p = new Parser(environment);
    AstRoot script = p.parse(string, null, 1);

    Config config = ParserRunner.createConfig(true, mode, false);
    Node root = IRFactory.transformTree(
        script, SourceFile.fromCode("FileName.js", string), string, config, errorReporter);

    return root;
  }
}
