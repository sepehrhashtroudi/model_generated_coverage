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

import static com.google.javascript.jscomp.JsMessage.Style.RELAX;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import junit.framework.TestCase;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Unit test for {@link JsMessageExtractor}.
 *
 */
public class JsMessageExtractorTest extends TestCase {

  private Collection<JsMessage> extractMessages(String... js) {
    try {
      String sourceCode = Joiner.on("\n").join(js);
      return new JsMessageExtractor(null, RELAX)
          .extractMessages(SourceFile.fromCode("testcode", sourceCode));
    } catch (IOException e) {
      fail(e.getMessage());
      return null;
    }
  }

  private JsMessage extractMessage(String... js) {
    Collection<JsMessage> messages = extractMessages(js);
    assertEquals(1, messages.size());
    return messages.iterator().next();
  }


public void testExtractMixedMessages105() { 
     Iterator<JsMessage> msgs = extractMessages("var MSG_MONEY = function(amount) {", "  return 'You owe $' + amount +", "         ' to the credit card company.';", "};", "var MSG_TIME = goog.getMsg('You need to finish your work in ' +", "                           '{$duration} hours.', {'duration': d});", "var MSG_NAG = 'Clean your room.\\n\\nWash your clothes.';", "var MSG_NAG_HELP = 'Just some ' +", "                   'nags.';").iterator(); 
     assertEquals(new JsMessage.Builder("MSG_MONEY").appendStringPart("You owe $").appendPlaceholderReference("amount").appendStringPart(" to the credit card company.").build(), msgs.next()); 
     assertEquals(new JsMessage.Builder("MSG_TIME").appendStringPart("You need to finish your work in ").appendPlaceholderReference("duration").appendStringPart(" hours.").build(), msgs.next()); 
     assertEquals(new JsMessage.Builder("MSG_NAG").appendStringPart("Clean your room.\n\nWash your clothes.").setDesc("Just some nags.").build(), msgs.next()); 
 } 


public void testDuplicateUnnamedVariables435() { 
     Collection<JsMessage> msgs = extractMessages("function a() {", "  var MSG_UNNAMED_2 = goog.getMsg('foo');", "}", "function b() {", "  var MSG_UNNAMED_2 = goog.getMsg('bar');", "}"); 
     assertEquals(2, msgs.size()); 
     final Iterator<JsMessage> iter = msgs.iterator(); 
     assertEquals("foo", iter.next().toString()); 
     assertEquals("bar", iter.next().toString()); 
 } 


public void testMeaningAnnotation1154() { 
     List<JsMessage> msgs = Lists.newArrayList(extractMessages("var MSG_UNNAMED_1 = goog.getMsg('foo');", "var MSG_UNNAMED_2 = goog.getMsg('foo');")); 
     assertEquals(2, msgs.size()); 
     assertTrue(msgs.get(0).getId().equals(msgs.get(1).getId())); 
     assertEquals(msgs.get(0), msgs.get(1)); 
     msgs = Lists.newArrayList(extractMessages("var MSG_UNNAMED_1 = goog.getMsg('foo');", "/** @meaning bar */ var MSG_UNNAMED_2 = goog.getMsg('foo');")); 
     assertEquals(2, msgs.size()); 
     assertFalse(msgs.get(0).getId().equals(msgs.get(1).getId())); 
 } 


public void testSyntaxError11432() { 
     try { 
         extractMessage("if (true) {}}"); 
         fail("Expected exception"); 
     } catch (RuntimeException e) { 
         assertTrue(e.getMessage().contains("JSCompiler errors\n")); 
         assertTrue(e.getMessage().contains("testcode:1: ERROR - Parse error. syntax error\n")); 
         assertTrue(e.getMessage().contains("if (true) {}}\n")); 
     } 
 } 


public void testExtractOldStyleMessage11927() { 
     assertEquals(new JsMessage.Builder("MSG_SILLY").appendStringPart("silly test message").setDesc("Description.").build(), extractMessage("var MSG_SILLY_HELP = 'Description.';", "var MSG_SILLY = 'silly test message';")); 
 } 


public void testExtractNewStyleMessage22157() { 
     assertEquals(new JsMessage.Builder("MSG_WELCOME").appendStringPart("Hi ").appendPlaceholderReference("userName").appendStringPart("! Welcome to ").appendPlaceholderReference("product").appendStringPart(".").setDesc("The welcome message.").setIsHidden(true).build(), extractMessage("/**", " * @desc The welcome", " *   message.", " *", " * @hidden", " */", "var MSG_WELCOME = goog.getMsg(", "    'Hi {$userName}! Welcome to {$product}.',", "    {userName: someUserName, product: getProductName()});")); 
 } 

  

  

  

  

  

  

  

  

  

  

  private void assertEquals(JsMessage expected, JsMessage actual) {
    assertEquals(expected.getId(), actual.getId());
    assertEquals(expected.getKey(), actual.getKey());
    assertEquals(expected.parts(), actual.parts());
    assertEquals(expected.placeholders(), actual.placeholders());
    assertEquals(expected.getDesc(), actual.getDesc());
    assertEquals(expected.isHidden(), actual.isHidden());
    assertEquals(expected.getMeaning(), actual.getMeaning());
  }
}
