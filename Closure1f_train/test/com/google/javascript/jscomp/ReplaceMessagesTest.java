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

import static com.google.javascript.jscomp.JsMessage.Style.RELAX;
import static com.google.javascript.jscomp.JsMessageVisitor.MESSAGE_TREE_MALFORMED;

import com.google.common.collect.Maps;
import com.google.javascript.jscomp.JsMessage.Style;

import java.util.Map;

/**
 * Test which checks that replacer works correctly.
 *
 */
public class ReplaceMessagesTest extends CompilerTestCase {

  private Map<String, JsMessage> messages;
  private Style style = RELAX;
  private boolean strictReplacement;

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new ReplaceMessages(compiler,
        new SimpleMessageBundle(), false, style, strictReplacement);
  }

  @Override
  protected int getNumRepetitions() {
    // No longer valid on the second run.
    return 1;
  }

  @Override
  protected void setUp()  {
    messages = Maps.newHashMap();
    strictReplacement = false;
    style = RELAX;
  }


public void testBadPlaceholderReferenceInReplacement692() { 
     registerMessage(new JsMessage.Builder("MSG_K").appendPlaceholderReference("amount").build()); 
     test("var MSG_K = goog.getMsg('Hi {$jane}', {jane: x});", "var MSG_K = goog.getMsg('Hi {$jane}', {jane: x});", MESSAGE_TREE_MALFORMED); 
 } 


public void testLegacyStylePlaceholderNameInLowerUnderscoreCase848() { 
     registerMessage(new JsMessage.Builder("MSG_F").appendStringPart("Sum: $").appendPlaceholderReference("amt_earned").build()); 
     style = Style.LEGACY; 
     test("var MSG_F = function(amt_earned) {return amt_earned + 'x'};", "var MSG_F=function(amt_earned){return\"Sum: $\"+amt_earned}"); 
 } 


public void testNoUseFallback2909() { 
     registerMessage(new JsMessage.Builder("MSG_C").appendStringPart("translated").build()); 
     test("/** @desc d */\n" + "var MSG_A = goog.getMsg('msg A');" + "/** @desc d */\n" + "var MSG_B = goog.getMsg('msg B');" + "var x = goog.getMsgWithFallback(MSG_A, MSG_B);", "var MSG_A = 'msg A';" + "var MSG_B = 'msg B';" + "var x = MSG_A;"); 
 } 


public void testStrictModeAndMessageReplacementAbsentInNonEmptyBundle1380() { 
     registerMessage(new JsMessage.Builder("MSG_J").appendStringPart("One ").appendPlaceholderReference("measly").appendStringPart(" ph").build()); 
     strictReplacement = true; 
     test("var MSG_E = 'Hello';", "var MSG_E = 'Hello';", ReplaceMessages.BUNDLE_DOES_NOT_HAVE_THE_MESSAGE); 
 } 


public void testSimpleMessageReplacementMissing1401() { 
     style = Style.LEGACY; 
     test("/** @desc d */\n" + "var MSG_E = 'd*6a0@z>t';", "var MSG_E = 'd*6a0@z>t'"); 
 } 


public void testUseFallback1507() { 
     registerMessage(new JsMessage.Builder("MSG_B").appendStringPart("translated").build()); 
     test("/** @desc d */\n" + "var MSG_A = goog.getMsg('msg A');" + "/** @desc d */\n" + "var MSG_B = goog.getMsg('msg B');" + "var x = goog.getMsgWithFallback(MSG_A, MSG_B);", "var MSG_A = 'msg A';" + "var MSG_B = 'translated';" + "var x = MSG_B;"); 
 } 


public void testHookReplacement1706() { 
     registerMessage(new JsMessage.Builder("MSG_F").appendStringPart("#").appendPlaceholderReference("amount").appendStringPart(".").build()); 
     test("/** @desc d */\n" + "var MSG_F = goog.getMsg('${$amount}', {amount: (a ? b : c)});", "var MSG_F=\"#\"+((a?b:c)+\".\")"); 
 } 


public void testAddReplacement1738() { 
     registerMessage(new JsMessage.Builder("MSG_G").appendPlaceholderReference("amount").build()); 
     test("/** @desc d */\n" + "var MSG_G = goog.getMsg('${$amount}', {amount: x + ''});", "var MSG_G=x+\"\""); 
 } 


public void testLegacyStyleNoPlaceholdersVarSyntax1797() { 
     registerMessage(new JsMessage.Builder("MSG_A").appendStringPart("Hi\nthere").build()); 
     style = Style.LEGACY; 
     test("var MSG_A = 'd*6a0@z>t';", "var MSG_A=\"Hi\\nthere\""); 
 } 


public void testBadFallbackSyntax31829() { 
     test("/** @desc d */\n" + "var MSG_A = goog.getMsg('asdf');" + "var x = goog.getMsgWithFallback(MSG_A, y);", null, JsMessageVisitor.FALLBACK_ARG_ERROR); 
 } 


public void testBadFallbackSyntax42060() { 
     test("/** @desc d */\n" + "var MSG_A = goog.getMsg('asdf');" + "var x = goog.getMsgWithFallback(y, MSG_A);", null, JsMessageVisitor.FALLBACK_ARG_ERROR); 
 } 


public void testBadFallbackSyntax12199() { 
     test("/** @desc d */\n" + "var MSG_A = goog.getMsg('asdf');" + "var x = goog.getMsgWithFallback(MSG_A);", null, JsMessageVisitor.BAD_FALLBACK_SYNTAX); 
 } 


public void testQualifiedMessageName2209() { 
     registerMessage(new JsMessage.Builder("MSG_J").appendStringPart("One ").appendPlaceholderReference("measly").appendStringPart(" ph").build()); 
     test("/** @desc d */\n" + "a.b.c.MSG_J = goog.getMsg('asdf {$measly}', {measly: x});", "a.b.c.MSG_J=\"One \"+(x+\" ph\")"); 
 } 


public void testLegacyStyleBadPlaceholderReferenceInReplacemen2437() { 
     registerMessage(new JsMessage.Builder("MSG_B").appendStringPart("Ola, ").appendPlaceholderReference("chimp").build()); 
     test("var MSG_B = function(chump) {return chump + 'x'};", "var MSG_B = function(chump) {return chump + 'x'};", JsMessageVisitor.MESSAGE_TREE_MALFORMED); 
 } 

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void registerMessage(JsMessage message) {
    messages.put(message.getKey(), message);
  }

  private class SimpleMessageBundle implements MessageBundle {

    @Override
    public JsMessage getMessage(String id) {
      return messages.get(id);
    }

    @Override
    public Iterable<JsMessage> getAllMessages() {
      return messages.values();
    }

    @Override
    public JsMessage.IdGenerator idGenerator() {
      return null;
    }
  }
}
