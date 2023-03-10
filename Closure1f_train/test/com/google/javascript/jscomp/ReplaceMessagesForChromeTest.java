/*
 * Copyright 2012 The Closure Compiler Authors.
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

import com.google.javascript.jscomp.JsMessage.Style;

/**
 * Test which checks that replacer works correctly.
 *
 */
public class ReplaceMessagesForChromeTest extends CompilerTestCase {

  private Style style = RELAX;

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new ReplaceMessagesForChrome(compiler,
        new GoogleJsMessageIdGenerator(null), false, style);
  }

  @Override
  protected int getNumRepetitions() {
    // No longer valid on the second run.
    return 1;
  }

  @Override
  protected void setUp()  {
    style = RELAX;
  }


public void testReplaceExternalMessage161() { 
     test("/** @desc A message that was extracted with SoyMsgExtractor. */\n" + "var MSG_EXTERNAL_1357902468 = goog.getMsg('Hello world');", "var MSG_EXTERNAL_1357902468 = chrome.i18n.getMessage('1357902468');"); 
 } 


public void testReplaceTwoPlaceholders394() { 
     test("/** @desc A message with two placeholders. */\n" + "var MSG_D = goog.getMsg('{$greeting}, {$name}', " + "{greeting: 'Hi', name: 'Tyler'});", "var MSG_D=chrome.i18n.getMessage('3605047247574980322', " + "['Hi', 'Tyler']);"); 
     test("/** @desc A message with two placeholders, but their order is\n" + " * reversed in the object literal. (Shouldn't make a difference.)\n" + " */\n" + "var MSG_E = goog.getMsg('{$greeting}, {$name}!', " + "{name: 'Tyler', greeting: 'Hi'});", "var MSG_E=chrome.i18n.getMessage('691522386483664339', " + "['Hi', 'Tyler']);"); 
 } 


public void testReplaceSinglePlaceholder1384() { 
     test("/** @desc A message with one placeholder. */\n" + "var MSG_C = goog.getMsg('Hello, {$name}', {name: 'Tyler'});", "var MSG_C=chrome.i18n.getMessage('4985325380591528435', ['Tyler']);"); 
 } 


public void testReplaceSimpleMessage1810() { 
     test("/** @desc A simple message. */\n" + "var MSG_A = goog.getMsg('Hello world');", "var MSG_A=chrome.i18n.getMessage('8660696502365331902');"); 
     test("/** @desc A message attached to an object. */\n" + "foo.bar.MSG_B = goog.getMsg('Goodbye world');", "foo.bar.MSG_B=chrome.i18n.getMessage('2356086230621084760');"); 
 } 

  

  

  

  

  

  
}
