/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods
 *
 * @version $Id$
 */
public class StringUtilsSubstringTest  {
    private static final String FOO = "foo";
    private static final String BAR = "bar";
    private static final String BAZ = "baz";
    private static final String FOOBAR = "foobar";
    private static final String SENTENCE = "foo bar baz";

    //-----------------------------------------------------------------------

@Test
public void testSubstring_StringInt1026() { 
     assertEquals(null, StringUtils.substring(null, 0)); 
     assertEquals("", StringUtils.substring("", 0)); 
     assertEquals("", StringUtils.substring("", 2)); 
     assertEquals("", StringUtils.substring(SENTENCE, 80)); 
     assertEquals(BAZ, StringUtils.substring(SENTENCE, 8)); 
     assertEquals(BAZ, StringUtils.substring(SENTENCE, -3)); 
     assertEquals(SENTENCE, StringUtils.substring(SENTENCE, 0)); 
     assertEquals("abc", StringUtils.substring("abc", -4)); 
     assertEquals("abc", StringUtils.substring("abc", -3)); 
     assertEquals("bc", StringUtils.substring("abc", -2)); 
     assertEquals("c", StringUtils.substring("abc", -1)); 
     assertEquals("abc", StringUtils.substring("abc", 0)); 
     assertEquals("bc", StringUtils.substring("abc", 1)); 
     assertEquals("c", StringUtils.substring("abc", 2)); 
     assertEquals("", StringUtils.substring("abc", 3)); 
     assertEquals("", StringUtils.substring("abc", 4)); 
 }
@Test
public void testLeft_String1027() { 
     assertSame(null, StringUtils.left(null, -1)); 
     assertSame(null, StringUtils.left(null, 0)); 
     assertSame(null, StringUtils.left(null, 2)); 
     assertEquals("", StringUtils.left("", -1)); 
     assertEquals("", StringUtils.left("", 0)); 
     assertEquals("", StringUtils.left("", 2)); 
     assertEquals("", StringUtils.left(FOOBAR, -1)); 
     assertEquals("", StringUtils.left(FOOBAR, 0)); 
     assertEquals(FOO, StringUtils.left(FOOBAR, 3)); 
     assertSame(FOOBAR, StringUtils.left(FOOBAR, 80)); 
 }
@Test
public void testRight_String1028() { 
     assertSame(null, StringUtils.right(null, -1)); 
     assertSame(null, StringUtils.right(null, 0)); 
     assertSame(null, StringUtils.right(null, 2)); 
     assertEquals("", StringUtils.right("", -1)); 
     assertEquals("", StringUtils.right("", 0)); 
     assertEquals("", StringUtils.right("", 2)); 
     assertEquals("", StringUtils.right(FOOBAR, -1)); 
     assertEquals("", StringUtils.right(FOOBAR, 0)); 
     assertEquals(BAR, StringUtils.right(FOOBAR, 3)); 
     assertSame(FOOBAR, StringUtils.right(FOOBAR, 80)); 
 }
@Test
public void testMid_String1029() { 
     assertSame(null, StringUtils.mid(null, -1, 0)); 
     assertSame(null, StringUtils.mid(null, 0, -1)); 
     assertSame(null, StringUtils.mid(null, 3, 0)); 
     assertSame(null, StringUtils.mid(null, 3, 2)); 
     assertEquals("", StringUtils.mid("", 0, -1)); 
     assertEquals("", StringUtils.mid("", 0, 0)); 
     assertEquals("", StringUtils.mid("", 0, 2)); 
     assertEquals("", StringUtils.mid(FOOBAR, 3, -1)); 
     assertEquals("", StringUtils.mid(FOOBAR, 3, 0)); 
     assertEquals("b", StringUtils.mid(FOOBAR, 3, 1)); 
     assertEquals(FOO, StringUtils.mid(FOOBAR, 0, 3)); 
     assertEquals(BAR, StringUtils.mid(FOOBAR, 3, 3)); 
     assertEquals(FOOBAR, StringUtils.mid(FOOBAR, 0, 80)); 
     assertEquals(BAR, StringUtils.mid(FOOBAR, 3, 80)); 
     assertEquals("", StringUtils.mid(FOOBAR, 9, 3)); 
     assertEquals(FOO, StringUtils.mid(FOOBAR, -1, 3)); 
 }
@Test
public void testSubstringBefore_StringString1030() { 
     assertEquals("foo", StringUtils.substringBefore("fooXXbarXXbaz", "XX")); 
     assertEquals(null, StringUtils.substringBefore(null, null)); 
     assertEquals(null, StringUtils.substringBefore(null, "")); 
     assertEquals(null, StringUtils.substringBefore(null, "XX")); 
     assertEquals("", StringUtils.substringBefore("", null)); 
     assertEquals("", StringUtils.substringBefore("", "")); 
     assertEquals("", StringUtils.substringBefore("", "XX")); 
     assertEquals("foo", StringUtils.substringBefore("foo", null)); 
     assertEquals("foo", StringUtils.substringBefore("foo", "b")); 
     assertEquals("f", StringUtils.substringBefore("foot", "o")); 
     assertEquals("", StringUtils.substringBefore("abc", "a")); 
     assertEquals("a", StringUtils.substringBefore("abcba", "b")); 
     assertEquals("ab", StringUtils.substringBefore("abc", "c")); 
     assertEquals("", StringUtils.substringBefore("abc", "")); 
 }
@Test
public void testSubstringAfter_StringString1031() { 
     assertEquals("barXXbaz", StringUtils.substringAfter("fooXXbarXXbaz", "XX")); 
     assertEquals(null, StringUtils.substringAfter(null, null)); 
     assertEquals(null, StringUtils.substringAfter(null, "")); 
     assertEquals(null, StringUtils.substringAfter(null, "XX")); 
     assertEquals("", StringUtils.substringAfter("", null)); 
     assertEquals("", StringUtils.substringAfter("", "")); 
     assertEquals("", StringUtils.substringAfter("", "XX")); 
     assertEquals("", StringUtils.substringAfter("foo", null)); 
     assertEquals("ot", StringUtils.substringAfter("foot", "o")); 
     assertEquals("bc", StringUtils.substringAfter("abc", "a")); 
     assertEquals("cba", StringUtils.substringAfter("abcba", "b")); 
     assertEquals("", StringUtils.substringAfter("abc", "c")); 
     assertEquals("abc", StringUtils.substringAfter("abc", "")); 
     assertEquals("", StringUtils.substringAfter("abc", "d")); 
 }
@Test
public void testSubstringBeforeLast_StringString1032() { 
     assertEquals("fooXXbar", StringUtils.substringBeforeLast("fooXXbarXXbaz", "XX")); 
     assertEquals(null, StringUtils.substringBeforeLast(null, null)); 
     assertEquals(null, StringUtils.substringBeforeLast(null, "")); 
     assertEquals(null, StringUtils.substringBeforeLast(null, "XX")); 
     assertEquals("", StringUtils.substringBeforeLast("", null)); 
     assertEquals("", StringUtils.substringBeforeLast("", "")); 
     assertEquals("", StringUtils.substringBeforeLast("", "XX")); 
     assertEquals("foo", StringUtils.substringBeforeLast("foo", null)); 
     assertEquals("foo", StringUtils.substringBeforeLast("foo", "b")); 
     assertEquals("fo", StringUtils.substringBeforeLast("foo", "o")); 
     assertEquals("abc\r\n", StringUtils.substringBeforeLast("abc\r\n", "d")); 
     assertEquals("abc", StringUtils.substringBeforeLast("abcdabc", "d")); 
     assertEquals("abcdabc", StringUtils.substringBeforeLast("abcdabcd", "d")); 
     assertEquals("a", StringUtils.substringBeforeLast("abc", "b")); 
     assertEquals("abc ", StringUtils.substringBeforeLast("abc \n", "\n")); 
     assertEquals("a", StringUtils.substringBeforeLast("a", null)); 
     assertEquals("a", StringUtils.substringBeforeLast("a", "")); 
     assertEquals("", StringUtils.substringBeforeLast("a", "a")); 
 }
@Test
public void testSubstringBetween_StringString1033() { 
     assertEquals(null, StringUtils.substringBetween(null, "tag")); 
     assertEquals("", StringUtils.substringBetween("", "")); 
     assertEquals(null, StringUtils.substringBetween("", "abc")); 
     assertEquals("", StringUtils.substringBetween("    ", " ")); 
     assertEquals(null, StringUtils.substringBetween("abc", null)); 
     assertEquals("", StringUtils.substringBetween("abc", "")); 
     assertEquals(null, StringUtils.substringBetween("abc", "a")); 
     assertEquals("bc", StringUtils.substringBetween("abca", "a")); 
     assertEquals("bc", StringUtils.substringBetween("abcabca", "a")); 
     assertEquals("bar", StringUtils.substringBetween("\nbar\n", "\n")); 
 }
@Test
public void testCountMatches_String1077() { 
     assertEquals(0, StringUtils.countMatches(null, null)); 
     assertEquals(0, StringUtils.countMatches("blah", null)); 
     assertEquals(0, StringUtils.countMatches(null, "DD")); 
     assertEquals(0, StringUtils.countMatches("x", "")); 
     assertEquals(0, StringUtils.countMatches("", "")); 
     assertEquals(3, StringUtils.countMatches("one long someone sentence of one", "one")); 
     assertEquals(0, StringUtils.countMatches("one long someone sentence of one", "two")); 
     assertEquals(4, StringUtils.countMatches("oooooooooooo", "ooo")); 
 }
    
    
    
           
    
    
    
    
    
    
    //-----------------------------------------------------------------------
    
    
    

    
    
            
        
    //-----------------------------------------------------------------------
    
            
    

   /**
     * Tests the substringsBetween method that returns an String Array of substrings.
     */
    

    //-----------------------------------------------------------------------
    

}
