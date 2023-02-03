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

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import static com.google.javascript.jscomp.JsMessage.Style;
import static com.google.javascript.jscomp.JsMessage.Style.CLOSURE;
import static com.google.javascript.jscomp.JsMessage.Style.LEGACY;
import static com.google.javascript.jscomp.JsMessage.Style.RELAX;
import static com.google.javascript.jscomp.JsMessageVisitor.isLowerCamelCaseWithNumericSuffixes;
import static com.google.javascript.jscomp.JsMessageVisitor.toLowerCamelCaseWithNumericSuffixes;
import com.google.javascript.rhino.Node;

import junit.framework.TestCase;

import java.util.List;

/**
 * Test for {@link JsMessageVisitor}.
 *
 * @author anatol@google.com (Anatol Pomazau)
 */
public class JsMessageVisitorTest extends TestCase {

  private Compiler compiler;
  private List<JsMessage> messages;
  private boolean allowLegacyMessages;

  @Override
  protected void setUp() throws Exception {
    messages = Lists.newLinkedList();
    allowLegacyMessages = true;
  }


public void testExternalMessage102() { 
     extractMessagesSafely("var MSG_EXTERNAL_111 = goog.getMsg('Hello World');"); 
     assertEquals(0, compiler.getWarningCount()); 
     assertEquals(1, messages.size()); 
     assertTrue(messages.get(0).isExternal()); 
     assertEquals("111", messages.get(0).getId()); 
 } 


public void testLegacyFormatParametizedFunction175() { 
     extractMessagesSafely("var MSG_SILLY = function(one, two) {" + "  return one + ', ' + two + ', buckle my shoe';" + "};"); 
     assertEquals(1, messages.size()); 
     JsMessage msg = messages.get(0); 
     assertEquals("MSG_SILLY", msg.getKey()); 
     assertEquals(null, msg.getDesc()); 
     assertEquals("{$one}, {$two}, buckle my shoe", msg.toString()); 
 } 


public void testHugeMessage378() { 
     extractMessagesSafely("/**" + " * @desc A message with lots of stuff.\n" + " * @hidden\n" + " */" + "var MSG_HUGE = goog.getMsg(" + "    '{$startLink_1}Google{$endLink}' +" + "    '{$startLink_2}blah{$endLink}{$boo}{$foo_001}{$boo}' +" + "    '{$foo_002}{$xxx_001}{$image}{$image_001}{$xxx_002}'," + "    {'startLink_1': '<a href=http://www.google.com/>'," + "     'endLink': '</a>'," + "     'startLink_2': '<a href=\"' + opt_data.url + '\">'," + "     'boo': opt_data.boo," + "     'foo_001': opt_data.foo," + "     'foo_002': opt_data.boo.foo," + "     'xxx_001': opt_data.boo + opt_data.foo," + "     'image': htmlTag7," + "     'image_001': opt_data.image," + "     'xxx_002': foo.callWithOnlyTopLevelKeys(" + "         bogusFn, opt_data, null, 'bogusKey1'," + "         opt_data.moo, 'bogusKey2', param10)});"); 
     assertEquals(1, messages.size()); 
     JsMessage msg = messages.get(0); 
     assertEquals("MSG_HUGE", msg.getKey()); 
     assertEquals("A message with lots of stuff.", msg.getDesc()); 
     assertTrue(msg.isHidden()); 
     assertEquals("{$startLink_1}Google{$endLink}{$startLink_2}blah{$endLink}" + "{$boo}{$foo_001}{$boo}{$foo_002}{$xxx_001}{$image}" + "{$image_001}{$xxx_002}", msg.toString()); 
 } 


public void testErrorWhenUsingMsgPrefixWithFallback437() { 
     extractMessages("/** @desc Hello */ var MSG_HELLO_1 = goog.getMsg('hello');\n" + "/** @desc Hello */ var MSG_HELLO_2 = goog.getMsg('hello');\n" + "/** @desc Hello */ " + "var MSG_HELLO_3 = goog.getMsgWithFallback(MSG_HELLO_1, MSG_HELLO_2);"); 
     assertOneError(JsMessageVisitor.MESSAGE_TREE_MALFORMED); 
 } 


public void testDuplicateMessageError447() { 
     extractMessages("(function () {/** @desc Hello */ var MSG_HELLO = goog.getMsg('a')})" + "(function () {/** @desc Hello2 */ var MSG_HELLO = goog.getMsg('a')})"); 
     assertEquals(0, compiler.getWarningCount()); 
     assertOneError(JsMessageVisitor.MESSAGE_DUPLICATE_KEY); 
 } 


public void testUnexistedPlaceholders507() { 
     extractMessages("var MSG_FOO = goog.getMsg('{$foo}:', {});"); 
     assertEquals(0, messages.size()); 
     JSError[] errors = compiler.getErrors(); 
     assertEquals(1, errors.length); 
     JSError error = errors[0]; 
     assertEquals(JsMessageVisitor.MESSAGE_TREE_MALFORMED, error.getType()); 
     assertEquals("Message parse tree malformed. Unrecognized message " + "placeholder referenced: foo", error.description); 
 } 


public void testEmptyMessage743() { 
     extractMessagesSafely("var MSG_EMPTY = '';"); 
     assertEquals(1, messages.size()); 
     JsMessage msg = messages.get(0); 
     assertEquals("MSG_EMPTY", msg.getKey()); 
     assertEquals("", msg.toString()); 
 } 


public void testJsMessageOnProperty783() { 
     extractMessagesSafely("/** @desc a */ " + "pint.sub.MSG_MENU_MARK_AS_UNREAD = goog.getMsg('a')"); 
     assertEquals(0, compiler.getWarningCount()); 
     assertEquals(1, messages.size()); 
     JsMessage msg = messages.get(0); 
     assertEquals("MSG_MENU_MARK_AS_UNREAD", msg.getKey()); 
     assertEquals("a", msg.getDesc()); 
 } 


public void testToLowerCamelCaseWithNumericSuffixes853() { 
     assertEquals("name", toLowerCamelCaseWithNumericSuffixes("NAME")); 
     assertEquals("a4Letter", toLowerCamelCaseWithNumericSuffixes("A4_LETTER")); 
     assertEquals("startSpan_1_23", toLowerCamelCaseWithNumericSuffixes("START_SPAN_1_23")); 
 } 


public void testLegacyFormatDescription887() { 
     extractMessagesSafely("var MSG_SILLY = 'silly test message';\n" + "var MSG_SILLY_HELP = 'help text';"); 
     assertEquals(1, messages.size()); 
     JsMessage msg = messages.get(0); 
     assertEquals("MSG_SILLY", msg.getKey()); 
     assertEquals("help text", msg.getDesc()); 
     assertEquals("silly test message", msg.toString()); 
 } 


public void testCamelcasePlaceholderNamesAreOk1307() { 
     extractMessagesSafely("var MSG_WITH_CAMELCASE = goog.getMsg(" + "'Slide {$slideNumber}:', {'slideNumber': opt_index + 1});"); 
     assertEquals(1, messages.size()); 
     JsMessage msg = messages.get(0); 
     assertEquals("MSG_WITH_CAMELCASE", msg.getKey()); 
     assertEquals("Slide {$slideNumber}:", msg.toString()); 
     List<CharSequence> parts = msg.parts(); 
     assertEquals(3, parts.size()); 
     assertEquals("slideNumber", ((JsMessage.PlaceholderReference) parts.get(1)).getName()); 
 } 


public void testLegacyMessageWithDescAnnotation1331() { 
     extractMessagesSafely("/** @desc The description */ var MSG_A = 'The Message';"); 
     assertEquals(1, messages.size()); 
     assertEquals(1, compiler.getWarningCount()); 
     JsMessage msg = messages.get(0); 
     assertEquals("MSG_A", msg.getKey()); 
     assertEquals("The Message", msg.toString()); 
     assertEquals("The description", msg.getDesc()); 
 } 


public void testUnnamedGoogleMessage1416() { 
     extractMessagesSafely("var MSG_UNNAMED_2 = goog.getMsg('Hullo');"); 
     assertEquals(1, messages.size()); 
     JsMessage msg = messages.get(0); 
     assertEquals(null, msg.getDesc()); 
     assertEquals("MSG_16LJMYKCXT84X", msg.getKey()); 
     assertEquals("MSG_16LJMYKCXT84X", msg.getId()); 
 } 


public void testMsgVarWithIncorrectRightSide1461() { 
     extractMessages("var MSG_SILLY = 0;"); 
     assertEquals(1, compiler.getErrors().length); 
     JSError error = compiler.getErrors()[0]; 
     assertEquals("Message parse tree malformed. Cannot parse value of " + "message MSG_SILLY", error.description); 
 } 


public void testUnusedReferenesAreNotOK1547() { 
     extractMessages("/** @desc AA */ " + "var MSG_FOO = goog.getMsg('lalala:', {foo:1});"); 
     assertEquals(0, messages.size()); 
     JSError[] errors = compiler.getErrors(); 
     assertEquals(1, errors.length); 
     JSError error = errors[0]; 
     assertEquals(JsMessageVisitor.MESSAGE_TREE_MALFORMED, error.getType()); 
     assertEquals("Message parse tree malformed. Unused message placeholder: " + "foo", error.description); 
 } 


public void testMsgVarWithoutAssignment1571() { 
     extractMessages("var MSG_SILLY;"); 
     assertEquals(1, compiler.getErrors().length); 
     JSError error = compiler.getErrors()[0]; 
     assertEquals(JsMessageVisitor.MESSAGE_HAS_NO_VALUE, error.getType()); 
 } 


public void testDuplicatePlaceHoldersAreBad1794() { 
     extractMessages("var MSG_FOO = goog.getMsg(" + "'{$foo}:', {'foo': 1, 'foo' : 2});"); 
     assertEquals(0, messages.size()); 
     JSError[] errors = compiler.getErrors(); 
     assertEquals(1, errors.length); 
     JSError error = errors[0]; 
     assertEquals(JsMessageVisitor.MESSAGE_TREE_MALFORMED, error.getType()); 
     assertEquals("Message parse tree malformed. Duplicate placeholder " + "name: foo", error.description); 
 } 


public void testMessageWithoutDescription1831() { 
     extractMessagesSafely("var MSG_HELLO = goog.getMsg('a')"); 
     assertEquals(1, compiler.getWarningCount()); 
     assertEquals(1, messages.size()); 
     JsMessage msg = messages.get(0); 
     assertEquals("MSG_HELLO", msg.getKey()); 
     assertEquals(JsMessageVisitor.MESSAGE_HAS_NO_DESCRIPTION, compiler.getWarnings()[0].getType()); 
 } 


public void testConcatOfStrings1995() { 
     extractMessagesSafely("var MSG_NOTEMPTY = 'aa' + 'bbb' \n + ' ccc';"); 
     assertEquals(1, messages.size()); 
     JsMessage msg = messages.get(0); 
     assertEquals("MSG_NOTEMPTY", msg.getKey()); 
     assertEquals("aabbb ccc", msg.toString()); 
 } 


public void testOrphanedJsMessage2130() { 
     extractMessagesSafely("goog.getMsg('a')"); 
     assertEquals(1, compiler.getWarningCount()); 
     assertEquals(0, messages.size()); 
     JSError warn = compiler.getWarnings()[0]; 
     assertEquals(JsMessageVisitor.MESSAGE_NODE_IS_ORPHANED, warn.getType()); 
 } 


public void testIncorrectMessageReporting2173() { 
     extractMessages("var MSG_HELLO = goog.getMsg('a' + + 'b')"); 
     assertEquals(1, compiler.getErrorCount()); 
     assertEquals(0, compiler.getWarningCount()); 
     assertEquals(0, messages.size()); 
     JSError mailformedTreeError = compiler.getErrors()[0]; 
     assertEquals(JsMessageVisitor.MESSAGE_TREE_MALFORMED, mailformedTreeError.getType()); 
     assertEquals("Message parse tree malformed. " + "STRING or ADD node expected; found: POS", mailformedTreeError.description); 
 } 


public void testRegularVarWithoutAssignment2315() { 
     extractMessagesSafely("var SILLY;"); 
     assertTrue(messages.isEmpty()); 
 } 


public void testIncorrectMessage2399() { 
     extractMessages("DP_DatePicker.MSG_DATE_SELECTION = {};"); 
     assertEquals(0, messages.size()); 
     assertEquals(1, compiler.getErrors().length); 
     JSError error = compiler.getErrors()[0]; 
     assertEquals("Message parse tree malformed. " + "Message must be initialized using goog.getMsg function.", error.description); 
 } 


public void testWithNonCamelcasePlaceholderNamesAreNotOk2423() { 
     extractMessages("var MSG_WITH_CAMELCASE = goog.getMsg(" + "'Slide {$slide_number}:', {'slide_number': opt_index + 1});"); 
     assertEquals(0, messages.size()); 
     JSError[] errors = compiler.getErrors(); 
     assertEquals(1, errors.length); 
     JSError error = errors[0]; 
     assertEquals(JsMessageVisitor.MESSAGE_TREE_MALFORMED, error.getType()); 
     assertEquals("Message parse tree malformed. Placeholder name not in " + "lowerCamelCase: slide_number", error.description); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void theseAreLegacyMessageNames(JsMessageVisitor visitor) {
    assertTrue(visitor.isMessageName("MSG_HELLO", false));
    assertTrue(visitor.isMessageName("MSG_", false));

    assertFalse(visitor.isMessageName("MSG_HELP", false));
    assertFalse(visitor.isMessageName("MSG_FOO_HELP", false));
    assertFalse(visitor.isMessageName("_FOO_HELP", false));
    assertFalse(visitor.isMessageName("MSGFOOP", false));
  }

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertOneError(DiagnosticType type) {
    String errors = Joiner.on("\n").join(compiler.getErrors());
    assertEquals("There should be one error. " + errors,
        1, compiler.getErrorCount());
    JSError error = compiler.getErrors()[0];
    assertEquals(type, error.getType());
  }

  private void extractMessagesSafely(String input) {
    extractMessages(input);
    JSError[] errors = compiler.getErrors();
    assertEquals(
        "Unexpected error(s): " + Joiner.on("\n").join(compiler.getErrors()),
        0, compiler.getErrorCount());
  }

  private void extractMessages(String input) {
    compiler = new Compiler();
    Node root = compiler.parseTestCode(input);
    JsMessageVisitor visitor = new CollectMessages(compiler);
    visitor.process(null, root);
  }

  private class CollectMessages extends JsMessageVisitor {

    private CollectMessages(Compiler compiler) {
      super(compiler, true, Style.getFromParams(true, allowLegacyMessages),
            null);
    }

    @Override
    protected void processJsMessage(JsMessage message,
        JsMessageDefinition definition) {
      messages.add(message);
    }
  }

  private class DummyJsVisitor extends JsMessageVisitor {

    private DummyJsVisitor(Style style) {
      super(null, true, style, null);
    }

    @Override
    protected void processJsMessage(JsMessage message,
        JsMessageDefinition definition) {
      // no-op
    }
  }
}
