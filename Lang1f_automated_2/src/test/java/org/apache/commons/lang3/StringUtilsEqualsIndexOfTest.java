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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Locale;

import org.hamcrest.core.IsNot;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods
 *
 * @version $Id$
 */
public class StringUtilsEqualsIndexOfTest  {
    private static final String BAR = "bar";
    /**
     * Supplementary character U+20000
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharU20000 = "\uD840\uDC00";
    /**
     * Supplementary character U+20001
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharU20001 = "\uD840\uDC01";
    /**
     * Incomplete supplementary character U+20000, high surrogate only.
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharUSuppCharHigh = "\uDC00";

    /**
     * Incomplete supplementary character U+20000, low surrogate only.
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharUSuppCharLow = "\uD840";

    private static final String FOO = "foo";

    private static final String FOOBAR = "foobar";

    private static final String[] FOOBAR_SUB_ARRAY = new String[] {"ob", "ba"};

@Test
public void testEquals416() { 
     assertTrue(StringUtils.equals(null, null)); 
     assertTrue(StringUtils.equals(FOO, FOO)); 
     assertTrue(StringUtils.equals(FOO, new String(new char[] { 'f', 'o', 'o' }))); 
     assertTrue(StringUtils.equals(FOO, new String(new char[] { 'f', 'O', 'O' }))); 
     assertFalse(StringUtils.equals(FOO, BAR)); 
     assertFalse(StringUtils.equals(FOO, null)); 
     assertFalse(StringUtils.equals(null, FOO)); 
     assertTrue(StringUtils.equals("", "")); 
     assertFalse(StringUtils.equals("abcd", "abcd ")); 
 }
@Test
public void testLastIndexOfIgnoreCase_String419() { 
     assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, null)); 
     assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "")); 
     assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "a")); 
     assertEquals(0, StringUtils.lastIndexOfIgnoreCase("", "")); 
     assertEquals(8, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "")); 
     assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "a")); 
     assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A")); 
     assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "b")); 
     assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B")); 
     assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "ab")); 
     assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB")); 
     assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("ab", "AAB")); 
     assertEquals(0, StringUtils.lastIndexOfIgnoreCase("aab", "AAB")); 
 }
@Test
public void testContains_String421() { 
     assertFalse(StringUtils.contains(null, null)); 
     assertFalse(StringUtils.contains(null, "")); 
     assertFalse(StringUtils.contains(null, "ab")); 
     assertFalse(StringUtils.contains("", null)); 
     assertFalse(StringUtils.contains("", "")); 
     assertFalse(StringUtils.contains("", "ab")); 
     assertFalse(StringUtils.contains("zzabyycdxx", "za")); 
     assertFalse(StringUtils.contains("zzabyycdxx", "by")); 
     assertFalse(StringUtils.contains("ab", "z")); 
 }
@Test
public void testContains_String422() { 
     assertFalse(StringUtils.contains(null, null)); 
     assertFalse(StringUtils.contains(null, "")); 
     assertFalse(StringUtils.contains(null, "a")); 
     assertFalse(StringUtils.contains("", null)); 
     assertFalse(StringUtils.contains("", "")); 
     assertFalse(StringUtils.contains("", "a")); 
     assertFalse(StringUtils.contains("abc", null)); 
     assertFalse(StringUtils.contains("abc", "")); 
     assertTrue(StringUtils.contains("abc", "a")); 
     assertTrue(StringUtils.contains("abc", "b")); 
     assertTrue(StringUtils.contains("abc", "c")); 
     assertFalse(StringUtils.contains("abc", "d")); 
     assertFalse(StringUtils.contains("abc", null)); 
     assertFalse(StringUtils.contains("abc", "e")); 
     assertTrue(StringUtils.contains("abc", "f")); 
     assertTrue(StringUtils.contains("abc", "g")); 
     assertFalse(StringUtils.contains("abc", "z")); 
 }
@Test
public void testContainsWhitespace_String423() { 
     assertFalse(StringUtils.containsWhitespace(null)); 
     assertFalse(StringUtils.containsWhitespace("")); 
     assertFalse(StringUtils.containsWhitespace(" ")); 
     assertTrue(StringUtils.containsWhitespace("\t \n \t")); 
     assertFalse(StringUtils.containsWhitespace("\t aa\n \t")); 
     assertTrue(StringUtils.containsWhitespace(" ")); 
     assertFalse(StringUtils.containsWhitespace(" a ")); 
     assertFalse(StringUtils.containsWhitespace("a  ")); 
     assertFalse(StringUtils.containsWhitespace("  a")); 
     assertFalse(StringUtils.containsWhitespace("aba")); 
     assertTrue(StringUtils.containsWhitespace(StringUtilsTest.WHITESPACE)); 
     assertFalse(StringUtils.containsWhitespace(StringUtilsTest.NON_WHITESPACE)); 
 }
@Test
public void testContainsWhitespace_String424() { 
     assertFalse(StringUtils.containsWhitespace(null)); 
     assertFalse(StringUtils.containsWhitespace(StringUtils.EMPTY)); 
     assertTrue(StringUtils.containsWhitespace("")); 
     assertTrue(StringUtils.containsWhitespace(" ")); 
     assertFalse(StringUtils.containsWhitespace("\t \n \t")); 
     assertFalse(StringUtils.containsWhitespace("\t aa\n \t")); 
     assertTrue(StringUtils.containsWhitespace(" ")); 
     assertFalse(StringUtils.containsWhitespace(" a ")); 
     assertFalse(StringUtils.containsWhitespace("a  ")); 
     assertFalse(StringUtils.containsWhitespace("  a")); 
     assertFalse(StringUtils.containsWhitespace("aba")); 
     assertTrue(StringUtils.containsWhitespace(StringUtilsTest.WHITESPACE)); 
     assertFalse(StringUtils.containsWhitespace(StringUtilsTest.NON_WHITESPACE)); 
 }
@Test
public void testIndexOfAnyBut_StringStringWithSupplementaryChars425() { 
     assertEquals(0, StringUtils.indexOfAnyBut(CharU20000 + CharU20001, CharU20000)); 
     assertEquals(2, StringUtils.indexOfAnyBut(CharU20000 + CharU20001, CharU20001)); 
     assertEquals(0, StringUtils.indexOfAnyBut(CharU20000, CharU20000)); 
     assertEquals(-1, StringUtils.indexOfAnyBut(CharU20000, CharU20001)); 
 }
@Test
public void testLastIndexOfAny_StringStringArray426() { 
     assertEquals(-1, StringUtils.lastIndexOfAny(null, (String[]) null)); 
     assertEquals(-1, StringUtils.lastIndexOfAny(null, FOOBAR_SUB_ARRAY)); 
     assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, (String[]) null)); 
     assertEquals(2, StringUtils.lastIndexOfAny(FOOBAR, FOOBAR_SUB_ARRAY)); 
     assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, new String[0])); 
     assertEquals(-1, StringUtils.lastIndexOfAny(null, new String[0])); 
     assertEquals(-1, StringUtils.lastIndexOfAny("", new String[0])); 
     assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, new String[] { "llll" })); 
     assertEquals(0, StringUtils.lastIndexOfAny(FOOBAR, new String[] { "" })); 
     assertEquals(0, StringUtils.lastIndexOfAny("", new String[] { "" })); 
     assertEquals(-1, StringUtils.lastIndexOfAny("", new String[] { "a" })); 
     assertEquals(-1, StringUtils.lastIndexOfAny("", new String[] { null })); 
     assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, new String[] { null })); 
     assertEquals(-1, StringUtils.lastIndexOfAny(null, new String[] { null })); 
 }
    

    

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    

    

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    

    

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    

    

    

    

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    

    

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    

    

    

    

    // The purpose of this class is to test StringUtils#equals(CharSequence, CharSequence)
    // with a CharSequence implementation whose equals(Object) override requires that the
    // other object be an instance of CustomCharSequence, even though, as char sequences,
    // `seq` may equal the other object.
    private static class CustomCharSequence implements CharSequence {
        private final CharSequence seq;

        public CustomCharSequence(final CharSequence seq) {
            this.seq = seq;
        }

        @Override
        public char charAt(final int index) {
            return seq.charAt(index);
        }

        @Override
        public int length() {
            return seq.length();
        }

        @Override
        public CharSequence subSequence(final int start, final int end) {
            return new CustomCharSequence(seq.subSequence(start, end));
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == null || !(obj instanceof CustomCharSequence)) {
                return false;
            }
            final CustomCharSequence other = (CustomCharSequence) obj;
            return seq.equals(other.seq);
        }

        @Override
        public int hashCode() {
            return seq.hashCode();
        }

        @Override
        public String toString() {
            return seq.toString();
        }
    }

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    

    

    

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

}
