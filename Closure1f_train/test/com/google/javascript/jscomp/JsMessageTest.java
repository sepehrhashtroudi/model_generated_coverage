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

package com.google.javascript.jscomp;

import junit.framework.*;

/**
 * @author anatol@google.com (Anatol Pomazau)
 */
public class JsMessageTest extends TestCase {


public void testHashValues1181() { 
     final String EMPTY = ""; 
     final String VAL = "Hello, world"; 
     final long ANSWER_STRING_64 = 0x43ec5d9731515874L; 
     final long ANSWER_EMPTY_64 = 0x468d9ea2c42361aaL; 
     assertEquals(ANSWER_STRING_64, JsMessage.Hash.hash64(VAL)); 
     assertEquals(ANSWER_EMPTY_64, JsMessage.Hash.hash64(EMPTY)); 
 } 


public void testIsEmpty1243() { 
     assertTrue(new JsMessage.Builder().build().isEmpty()); 
     assertTrue(new JsMessage.Builder().appendStringPart("").build().isEmpty()); 
     assertTrue(new JsMessage.Builder().appendStringPart("").appendStringPart("").build().isEmpty()); 
     assertFalse(new JsMessage.Builder().appendStringPart("s").appendStringPart("").build().isEmpty()); 
     assertFalse(new JsMessage.Builder().appendPlaceholderReference("3").build().isEmpty()); 
 } 

  

  

  
}
