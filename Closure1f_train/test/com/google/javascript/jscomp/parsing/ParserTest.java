/*
 * Copyright 2007 The Closure Compiler Authors.
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

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.jscomp.testing.TestErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class ParserTest extends BaseJSTypeTestCase {
  private static final String SUSPICIOUS_COMMENT_WARNING =
      IRFactory.SUSPICIOUS_COMMENT_WARNING;

  private static final String TRAILING_COMMA_MESSAGE =
      ScriptRuntime.getMessage0("msg.extra.trailing.comma");

  private static final String BAD_PROPERTY_MESSAGE =
      ScriptRuntime.getMessage0("msg.bad.prop");

  private static final String MISSING_GT_MESSAGE =
      "Bad type annotation. " +
      com.google.javascript.rhino.ScriptRuntime.getMessage0(
          "msg.jsdoc.missing.gt");

  private static final String MISPLACED_TYPE_ANNOTATION =
      IRFactory.MISPLACED_TYPE_ANNOTATION;

  private Config.LanguageMode mode;
  private boolean isIdeMode = false;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mode = LanguageMode.ECMASCRIPT3;
    isIdeMode = false;
  }


public void testJSDocAttachment6506() throws Exception { 
     Node functionNode = parse("var a = /** @param {number} index */5;" + "/** @return boolean */function f(index){}").getFirstChild().getNext(); 
     assertEquals(Token.FUNCTION, functionNode.getType()); 
     JSDocInfo info = functionNode.getJSDocInfo(); 
     assertNotNull(info); 
     assertFalse(info.hasParameter("index")); 
     assertTrue(info.hasReturnType()); 
     assertTypeEquals(UNKNOWN_TYPE, info.getReturnType()); 
 } 


public void testGetter636() { 
     mode = LanguageMode.ECMASCRIPT3; 
     parseError("var x = {get 1(){}};", IRFactory.GETTER_ERROR_MESSAGE); 
     parseError("var x = {get 'a'(){}};", IRFactory.GETTER_ERROR_MESSAGE); 
     parseError("var x = {get a(){}};", IRFactory.GETTER_ERROR_MESSAGE); 
     mode = LanguageMode.ECMASCRIPT5; 
     parse("var x = {get 1(){}};"); 
     parse("var x = {get 'a'(){}};"); 
     parse("var x = {get a(){}};"); 
     parseError("var x = {get a(b){}};", "getters may not have parameters"); 
 } 


public void testLinenoCharnoLe721() throws Exception { 
     testLinenoCharnoBinop("<="); 
 } 


public void testDestructuringAssignForbidden937() { 
     parseError("var [x, y] = foo();", "destructuring assignment forbidden"); 
 } 


public void testLinenoCharnoDiv970() throws Exception { 
     testLinenoCharnoBinop("/"); 
 } 


public void testSetter1275() { 
     mode = LanguageMode.ECMASCRIPT3; 
     parseError("var x = {set 1(x){}};", IRFactory.SETTER_ERROR_MESSAGE); 
     parseError("var x = {set 'a'(x){}};", IRFactory.SETTER_ERROR_MESSAGE); 
     parseError("var x = {set a(x){}};", IRFactory.SETTER_ERROR_MESSAGE); 
     mode = LanguageMode.ECMASCRIPT5; 
     parse("var x = {set 1(x){}};"); 
     parse("var x = {set 'a'(x){}};"); 
     parse("var x = {set a(x){}};"); 
     parseError("var x = {set a(){}};", "setters must have exactly one parameter"); 
 } 


public void testLinenoCharnoGe1637() throws Exception { 
     testLinenoCharnoBinop(">="); 
 } 


public void testCatchClauseForbidden1771() { 
     parseError("try { } catch (e if true) {}", "Catch clauses are not supported"); 
 } 


public void testIncorrectJSDocDoesNotAlterJSParsing61845() throws Exception { 
     assertNodeEquality(parse("C.prototype.say=function(nums) {alert(nums.join(','));};"), parse("/** @param {bool!*%E$} */" + "C.prototype.say=function(nums) {alert(nums.join(','));};", "Bad type annotation. expected closing }", "Bad type annotation. expecting a variable name in a @param tag")); 
 } 


public void testConstForbidden1875() { 
     parseError("const x = 3;", "Unsupported syntax: CONST"); 
 } 


public void testUnnamedFunctionStatement2136() { 
     parseError("function() {};", "unnamed function statement"); 
     parseError("if (true) { function() {}; }", "unnamed function statement"); 
     parse("function f() {};"); 
     parse("(function f() {});"); 
     parse("(function () {});"); 
 } 


public void testMisplacedTypeAnnotation22220() { 
     parse("var o = /** @type {string} */ getValue();", MISPLACED_TYPE_ANNOTATION); 
 } 


public void testJSDocAttachment112242() { 
     Node varNode = parse("/** @type {{x : number, 'y' : string, z}} */var a;").getFirstChild(); 
     assertEquals(Token.VAR, varNode.getType()); 
     JSDocInfo info = varNode.getJSDocInfo(); 
     assertNotNull(info); 
     assertTypeEquals(createRecordTypeBuilder().addProperty("x", NUMBER_TYPE, null).addProperty("y", STRING_TYPE, null).addProperty("z", UNKNOWN_TYPE, null).build(), info.getType()); 
     Node nameNode = varNode.getFirstChild(); 
     assertEquals(Token.NAME, nameNode.getType()); 
     assertNull(nameNode.getJSDocInfo()); 
 } 


public void testForEach2328() { 
     parseError("function f(stamp, status) {\n" + "  for each ( var curTiming in this.timeLog.timings ) {\n" + "    if ( curTiming.callId == stamp ) {\n" + "      curTiming.flag = status;\n" + "      break;\n" + "    }\n" + "  }\n" + "};", "unsupported language extension: for each"); 
 } 


public void testReservedKeywords2405() { 
     boolean isIdeMode = false; 
     mode = LanguageMode.ECMASCRIPT3; 
     parseError("var boolean;", "missing variable name"); 
     parseError("function boolean() {};", "missing ( before function parameters."); 
     parseError("boolean = 1;", "identifier is a reserved word"); 
     parseError("class = 1;", "identifier is a reserved word"); 
     parseError("public = 2;", "identifier is a reserved word"); 
     mode = LanguageMode.ECMASCRIPT5; 
     parse("var boolean;"); 
     parse("function boolean() {};"); 
     parse("boolean = 1;"); 
     parseError("class = 1;", "identifier is a reserved word"); 
     parse("public = 2;"); 
     mode = LanguageMode.ECMASCRIPT5_STRICT; 
     parse("var boolean;"); 
     parse("function boolean() {};"); 
     parse("boolean = 1;"); 
     parseError("class = 1;", "identifier is a reserved word"); 
     parseError("public = 2;", "identifier is a reserved word"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testLinenoCharnoBinop(String binop) {
    Node op = parse("var a = 89 " + binop + " 76").getFirstChild().
        getFirstChild().getFirstChild();

    assertEquals(1, op.getLineno());
    assertEquals(8, op.getCharno());
  }

  

  

  

  

  

  /**
   * Tests that a JSDoc comment in an unexpected place of the code does not
   * propagate to following code due to {@link JSDocInfo} aggregation.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertNodeEquality(Node expected, Node found) {
    String message = expected.checkTreeEquals(found);
    if (message != null) {
      fail(message);
    }
  }

  

  private Node createScript(Node n) {
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(n);
    return script;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Verify that the given code has the given parse errors.
   * @return If in IDE mode, returns a partial tree.
   */
  private Node parseError(String string, String... errors) {
    TestErrorReporter testErrorReporter = new TestErrorReporter(errors, null);
    Node script = null;
    try {
      StaticSourceFile file = new SimpleSourceFile("input", false);
      script = ParserRunner.parse(
          file, string, ParserRunner.createConfig(isIdeMode, mode, false),
          testErrorReporter, Logger.getAnonymousLogger()).ast;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    // verifying that all warnings were seen
    assertTrue(testErrorReporter.hasEncounteredAllErrors());
    assertTrue(testErrorReporter.hasEncounteredAllWarnings());

    return script;
  }

  private Node parse(String string, String... warnings) {
    TestErrorReporter testErrorReporter = new TestErrorReporter(null, warnings);
    Node script = null;
    try {
      StaticSourceFile file = new SimpleSourceFile("input", false);
      script = ParserRunner.parse(
          file, string, ParserRunner.createConfig(true, mode, false),
          testErrorReporter, Logger.getAnonymousLogger()).ast;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    // verifying that all warnings were seen
    assertTrue(testErrorReporter.hasEncounteredAllErrors());
    assertTrue(testErrorReporter.hasEncounteredAllWarnings());

    return script;
  }

  private static class ParserResult {
    private final String code;
    private final Node node;

    private ParserResult(String code, Node node) {
      this.code = code;
      this.node = node;
    }
  }
}
