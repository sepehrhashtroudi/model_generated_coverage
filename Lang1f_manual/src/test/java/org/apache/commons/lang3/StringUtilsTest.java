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

//import static com.sun.tools.javac.parser.Tokens.TokenKind.BAR;
//import static org.apache.commons.lang3.ObjectUtilsTest.FOO;
//import static org.apache.commons.lang3.StringUtilsStartsEndsWithTest.FOOBAR;
//import static org.apache.commons.lang3.StringUtilsStartsEndsWithTest.foobar;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

import org.apache.commons.lang3.text.WordUtils;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils}.
 *
 * @version $Id$
 */
public class StringUtilsTest {
    
    static final String WHITESPACE;
    static final String NON_WHITESPACE;
    static final String TRIMMABLE;
    static final String NON_TRIMMABLE;
    private static final String FOOBAR = null;
    private static final long BAR = 10;
    private static final String FOO = null;

    static {
        String ws = "";
        String nws = "";
        String tr = "";
        String ntr = "";
        for (int i = 0; i < Character.MAX_VALUE; i++) {
            if (Character.isWhitespace((char) i)) {
                ws += String.valueOf((char) i);
                if (i > 32) {
                    ntr += String.valueOf((char) i);
                }
            } else if (i < 40) {
                nws += String.valueOf((char) i);
            }
        }
        for (int i = 0; i <= 32; i++) {
            tr += String.valueOf((char) i);
        }
        WHITESPACE = ws;
        NON_WHITESPACE = nws;
        TRIMMABLE = tr;
        NON_TRIMMABLE = ntr;
    }

    public static final String[] ARRAY_LIST = { "foo", "bar", "baz" };
    public static final String[] EMPTY_ARRAY_LIST = {};
    public static final String[] NULL_ARRAY_LIST = {null};
    private static final Object[] NULL_TO_STRING_LIST = {
        new Object(){
            @Override
            public String toString() {
                return null;
            }
        }
    };
    private static final String[] MIXED_ARRAY_LIST = {null, "", "foo"};
    private static final Object[] MIXED_TYPE_LIST = {"foo", Long.valueOf(2L)};
    private static final long[] LONG_PRIM_LIST = {1, 2};
    private static final int[] INT_PRIM_LIST = {1, 2};
    private static final byte[] BYTE_PRIM_LIST = {1, 2};
    private static final short[] SHORT_PRIM_LIST = {1, 2};
    private static final char[] CHAR_PRIM_LIST = {'1', '2'};
    private static final float[] FLOAT_PRIM_LIST = {1, 2};
    private static final double[] DOUBLE_PRIM_LIST = {1, 2};

    private static final String SEPARATOR = ",";
    public static final char   SEPARATOR_CHAR = ';';

    private static final String TEXT_LIST = "foo,bar,baz";
    public static final String TEXT_LIST_CHAR = "foo;bar;baz";
    private static final String TEXT_LIST_NOSEP = "foobarbaz";

    private static final String FOO_UNCAP = "foo";
    private static final String FOO_CAP = "Foo";

    private static final String SENTENCE_UNCAP = "foo bar baz";
    private static final String SENTENCE_CAP = "Foo Bar Baz";
    private CharSequence foobar;

    //-----------------------------------------------------------------------
@Test
public void testSplitPreserveAllTokens_StringChar6() {
    assertArrayEquals(null, StringUtils.splitPreserveAllTokens(null, '.'));
    assertEquals(0, StringUtils.splitPreserveAllTokens("", '.').length);
    String str = "a.b. c";
    String[] res = StringUtils.splitPreserveAllTokens(str, '.');
    assertEquals(3, res.length);
    assertEquals("a", res[0]);
    assertEquals("b", res[1]);
    assertEquals(" c", res[2]);
    str = "a.b.. c";
    res = StringUtils.splitPreserveAllTokens(str, '.');
    assertEquals(4, res.length);
    assertEquals("a", res[0]);
    assertEquals("b", res[1]);
    assertEquals("", res[2]);
    assertEquals(" c", res[3]);
    str = ".a.";
    res = StringUtils.splitPreserveAllTokens(str, '.');
    assertEquals(3, res.length);
    assertEquals("", res[0]);
    assertEquals("a", res[1]);
    assertEquals("", res[2]);
    str = ".a..";
    res = StringUtils.splitPreserveAllTokens(str, '.');
    assertEquals(4, res.length);
    assertEquals("", res[0]);
    assertEquals("a", res[1]);
    assertEquals("", res[2]);
    assertEquals("", res[3]);
    str = "..a.";
    res = StringUtils.splitPreserveAllTokens(str, '.');
    assertEquals(4, res.length);
    assertEquals("", res[0]);
    assertEquals("", res[1]);
    assertEquals("a", res[2]);
}
@Test
public void testDifferenceAt_StringString10() { 
     assertEquals(-1, StringUtils.indexOfDifference(null, null)); 
     assertEquals(0, StringUtils.indexOfDifference(null, "i am a robot")); 
     assertEquals(-1, StringUtils.indexOfDifference("", "")); 
     assertEquals(0, StringUtils.indexOfDifference("", "abc")); 
     assertEquals(0, StringUtils.indexOfDifference("abc", "")); 
     assertEquals(0, StringUtils.indexOfDifference("i am a machine", null)); 
     assertEquals(7, StringUtils.indexOfDifference("i am a machine", "i am a robot")); 
     assertEquals(-1, StringUtils.indexOfDifference("foo", "foo")); 
     assertEquals(0, StringUtils.indexOfDifference("i am a robot", "you are a robot")); 
 }
@Test
public void testSwapCase_String19() { 
     assertEquals(null, StringUtils.swapCase(null)); 
     assertEquals("", StringUtils.swapCase("")); 
     assertEquals("  ", StringUtils.swapCase("  ")); 
     assertEquals("i", StringUtils.swapCase("I")); 
     assertEquals("I", StringUtils.swapCase("i")); 
     assertEquals("I AM HERE 123", StringUtils.swapCase("i am here 123")); 
     assertEquals("i aM hERE 123", StringUtils.swapCase("I Am Here 123")); 
     assertEquals("I AM here 123", StringUtils.swapCase("i am HERE 123")); 
     assertEquals("i am here 123", StringUtils.swapCase("I AM HERE 123")); 
     final String test = "This String contains a TitleCase character: \u01C8"; 
     final String expect = "tHIS sTRING CONTAINS A tITLEcASE CHARACTER: \u01C9"; 
     assertEquals(expect, StringUtils.swapCase(test)); 
 }
@Test
public void testSplitPreserveAllTokens_StringString_StringStringInt25() {
        assertArrayEquals(null, StringUtils.splitPreserveAllTokens(null, "."));
        assertArrayEquals(null, StringUtils.splitPreserveAllTokens(null, ".", 3));
        assertEquals(0, StringUtils.splitPreserveAllTokens("", ".").length);
        assertEquals(0, StringUtils.splitPreserveAllTokens("", ".", 3).length);
//        innerTestSplitPreserveAllTokens('.', ".", ' ');
//        innerTestSplitPreserveAllTokens('.', ".", ',');
//        innerTestSplitPreserveAllTokens('.', ".,", 'x');
        for (int i = 0; i < WHITESPACE.length(); i++) {
            for (int j = 0; j < NON_WHITESPACE.length(); j++) {
//                innerTestSplitPreserveAllTokens(WHITESPACE.charAt(i), null, NON_WHITESPACE.charAt(j));
//                innerTestSplitPreserveAllTokens(WHITESPACE.charAt(i), String.valueOf(WHITESPACE.charAt(i)), NON_WHITESPACE.charAt(j));
            }
        }
        {
            String[] results;
            final String[] expectedResults = {"ab", "de fg"};
            results = StringUtils.splitPreserveAllTokens("ab de fg", null, 2);
            assertEquals(expectedResults.length, results.length);
            for (int i = 0; i < expectedResults.length; i++) {
                assertEquals(expectedResults[i], results[i]);
            }
        }
        {
            String[] results;
            final String[] expectedResults = {"ab", "  de fg"};
            results = StringUtils.splitPreserveAllTokens("ab   de fg", null, 2);
            assertEquals(expectedResults.length, results.length);
        }
    }
@Test
public void testRightPad_StringIntString36() { 
     assertEquals(null, StringUtils.rightPad(null, 5, "-+")); 
     assertEquals("     ", StringUtils.rightPad("", 5, " ")); 
     assertEquals(null, StringUtils.rightPad(null, 8, null)); 
     assertEquals("abc-+-+", StringUtils.rightPad("abc", 7, "-+")); 
     assertEquals("abc-+~", StringUtils.rightPad("abc", 6, "-+~")); 
     assertEquals("abc-+", StringUtils.rightPad("abc", 5, "-+~")); 
     assertEquals("abc", StringUtils.rightPad("abc", 2, " ")); 
     assertEquals("abc", StringUtils.rightPad("abc", -1, " ")); 
     assertEquals("abc  ", StringUtils.rightPad("abc", 5, null)); 
     assertEquals("abc  ", StringUtils.rightPad("abc", 5, "")); 
 }
@Test
public void testRemoveEndIgnoreCase39() { 
     assertNull("removeEndIgnoreCase(null, null)", StringUtils.removeEndIgnoreCase(null, null)); 
     assertNull("removeEndIgnoreCase(null, \"\")", StringUtils.removeEndIgnoreCase(null, "")); 
     assertNull("removeEndIgnoreCase(null, \"a\")", StringUtils.removeEndIgnoreCase(null, "a")); 
     assertEquals("removeEndIgnoreCase(\"\", null)", StringUtils.removeEndIgnoreCase("", null), ""); 
     assertEquals("removeEndIgnoreCase(\"\", \"\")", StringUtils.removeEndIgnoreCase("", ""), ""); 
     assertEquals("removeEndIgnoreCase(\"\", \"a\")", StringUtils.removeEndIgnoreCase("", "a"), ""); 
     assertEquals("removeEndIgnoreCase(\"www.domain.com\", \"www.\")", StringUtils.removeEndIgnoreCase("www.domain.com", "www."), "domain.com"); 
     assertEquals("removeEndIgnoreCase(\"domain.com\", \"www.\")", StringUtils.removeEndIgnoreCase("domain.com", "www."), "domain.com"); 
     assertEquals("removeEndIgnoreCase(\"domain.com\", \"\")", StringUtils.removeEndIgnoreCase("domain.com", ""), "domain.com"); 
     assertEquals("removeEndIgnoreCase(\"domain.com\", null)", StringUtils.removeEndIgnoreCase("domain.com", null), "domain.com"); 
     assertEquals("removeEndIgnoreCase(\"www.domain.com\", \"WWW.\")", StringUtils.removeEndIgnoreCase("www.domain.com", "WWW."), "domain.com"); 
 }
@Test
public void testGetLevenshteinDistance_StringString46() { 
     assertEquals(0, StringUtils.getLevenshteinDistance("", "")); 
     assertEquals(1, StringUtils.getLevenshteinDistance("", "a")); 
     assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "")); 
     assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog")); 
     assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant")); 
     assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo")); 
     assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant")); 
     assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz")); 
     assertEquals(8, StringUtils.getLevenshteinDistance("zzzzzzzz", "hippo")); 
     assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo")); 
     try { 
         @SuppressWarnings("unused") 
         final int d = StringUtils.getLevenshteinDistance("a", null); 
         fail("expecting IllegalArgumentException"); 
     } catch (final IllegalArgumentException ex) { 
     } 
     try { 
         @SuppressWarnings("unused") 
         final int d = StringUtils.getLevenshteinDistance(null, "a"); 
         fail("expecting IllegalArgumentException"); 
     } catch (final IllegalArgumentException ex) { 
     } 
 }
@Test
public void testJoin_IterableChar70() { 
     assertEquals(null, StringUtils.join((Iterable<?>) null, null)); 
     assertEquals(TEXT_LIST_CHAR, StringUtils.join(Arrays.asList(ARRAY_LIST), null)); 
     assertEquals(TEXT_LIST_CHAR, StringUtils.join(Arrays.asList(ARRAY_LIST), "")); 
     assertEquals("", StringUtils.join(Arrays.asList(NULL_ARRAY_LIST), null)); 
     assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), null)); 
     assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), "")); 
     assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), SEPARATOR)); 
     assertEquals(TEXT_LIST, StringUtils.join(Arrays.asList(ARRAY_LIST), SEPARATOR)); 
 }
@Test
public void testReplace_StringStringArrayStringArray79() {
    assertNull(StringUtils.replaceEach(null, new String[]{"a"}, new String[]{"b"}));
    assertEquals(StringUtils.replaceEach("", new String[]{"a"}, new String[]{"b"}), "");
    assertEquals(StringUtils.replaceEach("aba", null, null), "aba");
    assertEquals(StringUtils.replaceEach("aba", new String[0], null), "aba");
    assertEquals(StringUtils.replaceEach("aba", null, new String[0]), "aba");
    assertEquals(StringUtils.replaceEach("aba", new String[]{"a"}, null), "aba");
    assertEquals(StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""}), "b");
    assertEquals(StringUtils.replaceEach("aba", new String[]{null}, new String[]{"a"}), "aba");
    assertEquals(StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}), "wcte");
    assertEquals(StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}), "dcte");
    assertEquals("bcc", StringUtils.replaceEach("abc", new String[]{"a", "b"}, new String[]{"b", "c"}));
}
     @Test
public void testSplitByWholeString_StringStringBooleanInt99() {
         assertArrayEquals(null, StringUtils.splitByWholeSeparatorPreserveAllTokens(null, ".", 3));
         assertEquals(0, StringUtils.splitByWholeSeparatorPreserveAllTokens("", ".", 3).length);
         final String stringToSplitOnNulls = "ab   de fg";
         final String[] splitOnNullExpectedResults = {"ab", "de", "fg"};
         final String[] splitOnNullResults = StringUtils.splitByWholeSeparatorPreserveAllTokens(stringToSplitOnNulls, null, 2);
         assertEquals(splitOnNullExpectedResults.length, splitOnNullResults.length);
         for (int i = 0; i < splitOnNullExpectedResults.length; i += 1) {
             assertEquals(splitOnNullExpectedResults[i], splitOnNullResults[i]);
         }
         final String stringToSplitOnCharactersAndString = "abstemiouslyaeiouyabstemiously";
         final String[] splitOnStringExpectedResults = {"abstemiously", "abstemiously"};
         final String[] splitOnStringResults = StringUtils.splitByWholeSeparatorPreserveAllTokens(stringToSplitOnCharactersAndString, "aeiouy", 2);
         assertEquals(splitOnStringExpectedResults.length, splitOnStringResults.length);
         for (int i = 0; i < splitOnStringExpectedResults.length; i++) {
             assertEquals(splitOnStringExpectedResults[i], splitOnStringResults[i]);
         }
         final String[] splitWithMultipleSeparatorExpectedResults = {"ab", "cd", "ef"};
         final String[] splitWithMultipleSeparator = StringUtils.splitByWholeSeparator("ab:cd::ef", ":", 2);
         assertEquals(splitWithMultipleSeparatorExpectedResults.length, splitWithMultipleSeparator.length);
         for (int i = 0; i < splitWithMultipleSeparatorExpectedResults.length; i++){}
     }
@Test
public void testJoin_ArrayOfDoubles113() { 
     assertEquals(null, StringUtils.join((double[]) null, ',')); 
     assertEquals("1.0;2.0", StringUtils.join(DOUBLE_PRIM_LIST, SEPARATOR_CHAR)); 
     assertEquals("2.0", StringUtils.join(DOUBLE_PRIM_LIST, SEPARATOR_CHAR, 1, 2)); 
 }
@Test
public void testReverseDelimited_StringChar156() { 
     assertEquals(null, StringUtils.reverseDelimited(null, '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("ab", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("a", StringUtils.reverseDelimited("a", '.')); 
     assertEquals("ab", StringUtils.reverseDelimited("ab", '.')); 
     assertEquals("a", StringUtils.reverseDelimited("a", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("a", StringUtils.reverseDelimited("a", '.')); 
     assertEquals("qd", StringUtils.reverseDelimited("queued", 'u')); 
     assertEquals("queued", StringUtils.reverseDelimited("queued", 'z')); 
 }
@Test
public void testSplit_StringChar157() {
    assertArrayEquals(null, StringUtils.split(null, '.'));
    assertEquals(0, StringUtils.split("", '.').length);
    String str = "a.b. c";
    String[] res = StringUtils.split(str, '.');
    assertEquals(3, res.length);
    assertEquals("a", res[0]);
    assertEquals("b", res[1]);
    assertEquals(" c", res[2]);
    str = "a.b.. c";
    res = StringUtils.split(str, '.');
    assertEquals(4, res.length);
    assertEquals("a", res[0]);
    assertEquals("b", res[1]);
    assertEquals("", res[2]);
    assertEquals(" c", res[3]);
    str = ".a.";
    res = StringUtils.split(str, '.');
    assertEquals(3, res.length);
    assertEquals("", res[0]);
    assertEquals("a", res[1]);
    assertEquals("", res[2]);
    str = ".a..";
    res = StringUtils.split(str, '.');
    assertEquals(4, res.length);
    assertEquals("", res[0]);
    assertEquals("a", res[1]);
    assertEquals("", res[2]);
    assertEquals("", res[3]);
    str = "..a.";
    res = StringUtils.split(str, '.');
    assertEquals(4, res.length);
    assertEquals("", res[0]);
    assertEquals("", res[1]);
    assertEquals("", res[2]);
    assertEquals("a", res[3]);
    assertEquals("", res[4]);
    str = "..a.";
}
@Test
public void testReverseDelimited_StringChar158() { 
     assertEquals(null, StringUtils.reverseDelimited(null, '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("ab", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("foo", StringUtils.reverseDelimited("foo", '.')); 
     assertEquals("f", StringUtils.reverseDelimited("foot", '.')); 
     assertEquals("", StringUtils.reverseDelimited("abc", '.')); 
     assertEquals("a", StringUtils.reverseDelimited("a", '.')); 
     assertEquals("ab", StringUtils.reverseDelimited("ab", '.')); 
     assertEquals("ab", StringUtils.reverseDelimited("abc", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("a", StringUtils.reverseDelimited("a", '.')); 
     assertEquals("qd", StringUtils.reverseDelimited("queued", 'u')); 
     assertEquals("queued", StringUtils.reverseDelimited("queued", 'z')); 
 }
@Test
public void testReverseDelimited_StringChar159() { 
     assertEquals(null, StringUtils.reverseDelimited(null, '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("ab", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("a", StringUtils.reverseDelimited("a", '.')); 
     assertEquals("ab", StringUtils.reverseDelimited("ab", '.')); 
     assertEquals("a", StringUtils.reverseDelimited("a", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("a", StringUtils.reverseDelimited("a", '.')); 
     assertEquals("qd", StringUtils.reverseDelimited("queued", 'u')); 
     assertEquals("queued", StringUtils.reverseDelimited("queued", 'z')); 
 }
@Test
public void testReverseDelimited_StringChar160() { 
     assertEquals(null, StringUtils.reverseDelimited(null, '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("ab", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited("", '.')); 
     assertEquals("", StringUtils.reverseDelimited(FOOBAR, '.'));
     assertEquals("", StringUtils.reverseDelimited(FOOBAR, '.'));
     assertEquals(BAR, StringUtils.reverseDelimited(FOOBAR, '.'));
     assertEquals(FOOBAR, StringUtils.reverseDelimited(FOOBAR, '.')); 
     assertEquals(FOOBAR, StringUtils.reverseDelimited(FOOBAR, '.')); 
     assertEquals("", StringUtils.reverseDelimited(null, '.')); 
 }
@Test
public void testDifference_StringString166() { 
     assertEquals(null, StringUtils.difference(null, null)); 
     assertEquals(null, StringUtils.difference(null, "any")); 
     assertEquals("", StringUtils.difference("", null)); 
     assertEquals("", StringUtils.difference("", "any")); 
     assertEquals("", StringUtils.difference("foo", null)); 
     assertEquals("", StringUtils.difference("foo", "bar")); 
     assertEquals("", StringUtils.difference(FOO, FOO)); 
     assertEquals("", StringUtils.difference(FOO, new String(new char[] { 'f', 'o', 'o' }))); 
     assertEquals("", StringUtils.difference(FOO, new String(new char[] { 'f', 'O', 'O' }))); 
     assertEquals("f", StringUtils.difference(FOO, String.valueOf(BAR)));
     assertEquals("", StringUtils.difference(FOO, null)); 
     assertEquals("", StringUtils.difference(null, FOO)); 
     assertEquals("", StringUtils.difference("", "")); 
     assertEquals("", StringUtils.difference("", "any")); 
 }
@Test
public void testDifference_StringString167() { 
     assertEquals(null, StringUtils.difference(null, null)); 
     assertEquals(null, StringUtils.difference(null, "any")); 
     assertEquals("", StringUtils.difference("", null)); 
     assertEquals("", StringUtils.difference("", "any")); 
     assertEquals("", StringUtils.difference("foo", null)); 
     assertEquals("", StringUtils.difference("foo", "bar")); 
     assertEquals("", StringUtils.difference(FOO, FOO)); 
     assertEquals("", StringUtils.difference(FOO, new String(new char[] { 'f', 'o', 'o' }))); 
     assertEquals("", StringUtils.difference(FOO, new String(new char[] { 'f', 'O', 'O' }))); 
     assertEquals("", StringUtils.difference(FOO, String.valueOf(BAR)));
     assertEquals("", StringUtils.difference(FOO, null)); 
     assertEquals("", StringUtils.difference(null, FOO)); 
     assertEquals("", StringUtils.difference("", "")); 
     assertEquals("", StringUtils.difference("", "any")); 
 }
@Test
public void testDifference_StringString168() { 
     assertEquals(null, StringUtils.difference(null, null)); 
     assertEquals(null, StringUtils.difference(null, "any")); 
     assertEquals("", StringUtils.difference("", null)); 
     assertEquals("", StringUtils.difference("", "any")); 
     assertEquals("", StringUtils.difference("", "any")); 
     assertEquals("", StringUtils.difference("", "any")); 
     assertEquals("", StringUtils.difference(FOOBAR, FOO)); 
     assertEquals("", StringUtils.difference(FOOBAR, FOO)); 
     assertEquals(FOO, StringUtils.difference(FOOBAR, FOO)); 
     assertEquals(BAR, StringUtils.difference(FOOBAR, FOO)); 
     assertEquals(FOOBAR, StringUtils.difference(FOOBAR, FOO)); 
     assertEquals(FOOBAR, StringUtils.difference(FOOBAR, FOO)); 
     assertEquals(FOOBAR, StringUtils.difference(FOOBAR, FOO)); 
     assertEquals(BAR, StringUtils.difference(FOOBAR, FOO)); 
     assertEquals(FOOBAR, StringUtils.difference(FOOBAR, FOO)); 
 }
@Test
public void testDifference_StringString169() { 
     assertEquals(null, StringUtils.difference(null, null)); 
     assertEquals(null, StringUtils.difference(null, "any")); 
     assertEquals("", StringUtils.difference("", null)); 
     assertEquals("", StringUtils.difference("", "any")); 
     assertEquals("", StringUtils.difference("foo", null)); 
     assertEquals("", StringUtils.difference("foo", "bar")); 
     assertEquals("", StringUtils.difference(FOO, FOO)); 
     assertEquals("", StringUtils.difference(FOO, new String(new char[] { 'f', 'o', 'o' }))); 
     assertEquals("", StringUtils.difference(FOO, new String(new char[] { 'f', 'O', 'O' }))); 
     assertEquals("", StringUtils.difference(null, FOO)); 
     assertEquals("", StringUtils.difference("", "")); 
     assertEquals("", StringUtils.difference("", "any")); 
     assertEquals("", StringUtils.difference("foo", "bar")); 
     assertEquals("f", StringUtils.difference("foot", "o")); 
     assertEquals("", StringUtils.difference("abc", "abcd")); 
     assertEquals("abcd", StringUtils.difference("abcde", "abcd ")); 
     assertEquals("", StringUtils.difference("abcde", "abcd ")); 
     assertEquals("", StringUtils.difference("abcde", "xyz")); 
     assertEquals("", StringUtils.difference("xyz", "abcde")); 
     assertEquals("i am a ", StringUtils.difference("i am a machine", "i am a robot")); 
 }
@Test
public void testSplitPreserveAllTokens_StringString_StringStringInt216() {
    assertArrayEquals(null, StringUtils.splitPreserveAllTokens(null, "."));
    assertEquals(0, StringUtils.splitPreserveAllTokens("", ".").length);
    String str = "a.b. c";
    String[] res = StringUtils.splitPreserveAllTokens(str, ".");
    assertEquals(3, res.length);
    assertEquals("a", res[0]);
    assertEquals("b", res[1]);
    assertEquals(" c", res[2]);
    str = "a.b.. c";
    res = StringUtils.splitPreserveAllTokens(str, ".");
    assertEquals(4, res.length);
    assertEquals("a", res[0]);
    assertEquals("b", res[1]);
    assertEquals("", res[2]);
    assertEquals(" c", res[3]);
    str = ".a.";
    res = StringUtils.splitPreserveAllTokens(str, ".");
    assertEquals(3, res.length);
    assertEquals("", res[0]);
    assertEquals("a", res[1]);
    assertEquals("", res[2]);
    str = ".a..";
    res = StringUtils.splitPreserveAllTokens(str, ".");
    assertEquals(4, res.length);
    assertEquals("", res[0]);
    assertEquals("a", res[1]);
    assertEquals("", res[2]);
    assertEquals("", res[3]);
    str = "..a.";
    res = StringUtils.splitPreserveAllTokens(str, ".");
    assertEquals(4, res.length);
    assertEquals("", res[0]);
    assertEquals("", res[1]);
    assertEquals("a", res[2]);
}
@Test
public void testSplit_StringString_StringStringInt217() {
    assertArrayEquals(null, StringUtils.split(null, "."));
    assertArrayEquals(null, StringUtils.split(null, ".", 3));
    assertEquals(0, StringUtils.split("", ".").length);
    assertEquals(0, StringUtils.split("", ".", 3).length);
//    innerTestSplit("", ".", ' ');
//    innerTestSplit(".", ".", ' ');
//    innerTestSplit(".", ".", ',');
//    innerTestSplit(".", ".,", 'x');
    for (int i = 0; i < WHITESPACE.length(); i++) {
        for (int j = 0; j < NON_WHITESPACE.length(); j++) {
            innerTestSplit(WHITESPACE.charAt(i), null, NON_WHITESPACE.charAt(j));
            innerTestSplit(WHITESPACE.charAt(i), String.valueOf(WHITESPACE.charAt(i)), NON_WHITESPACE.charAt(j));
        }
    }
    {
        String[] results;
        final String[] expectedResults = {"ab", "de fg"};
        results = StringUtils.split("ab de fg", null, 2);
        assertEquals(expectedResults.length, results.length);
        for (int i = 0; i < expectedResults.length; i++) {
            assertEquals(expectedResults[i], results[i]);
        }
    }
    {
        String[] results;
        final String[] expectedResults = {"ab", "  de fg"};
        results = StringUtils.split("ab   de fg", null, 2);
        assertEquals(expectedResults.length, results.length);
    }
}
@Test
public void testSplit_StringString_StringStringInt218() {
     assertArrayEquals(null, StringUtils.split(null, "."));
     assertArrayEquals(null, StringUtils.split(null, ".", 3));
     assertEquals(0, StringUtils.split("", ".").length);
     assertEquals(0, StringUtils.split("", ".", 3).length);
//     innerTestSplit(".", ".", ' ');
//     innerTestSplit(".", ".", ' ');
//     innerTestSplit(".", ".", ',');
//     innerTestSplit(".", ".,", 'x');
     for (int i = 0; i < WHITESPACE.length(); i++) {
         for (int j = 0; j < NON_WHITESPACE.length(); j++) {
             innerTestSplit(WHITESPACE.charAt(i), null, NON_WHITESPACE.charAt(j));
             innerTestSplit(WHITESPACE.charAt(i), String.valueOf(WHITESPACE.charAt(i)), NON_WHITESPACE.charAt(j));
         }
     }
     {
         String[] results;
         final String[] expectedResults = { "ab", "de fg" };
         results = StringUtils.split("ab de fg", null, 2);
         assertEquals(expectedResults.length, results.length);
         for (int i = 0; i < expectedResults.length; i++) {
             assertEquals(expectedResults[i], results[i]);
         }
     }
    {
        String[] results;
        final String[] expectedResults = {"ab", "  de fg"};
        results = StringUtils.split("ab   de fg", null, 2);
        assertEquals(expectedResults.length, results.length);
    }}
@Test
public void testCenter_StringInt244() {
     assertEquals(null, StringUtils.center(null, -1));
     assertEquals(null, StringUtils.center(null, 4));
     assertEquals("    ", StringUtils.center("", 4));
     assertEquals("ab", StringUtils.center("ab", 0));
     assertEquals("ab", StringUtils.center("ab", -1));
     assertEquals("ab", StringUtils.center("ab", 1));
     assertEquals("    ", StringUtils.center("", 4));
     assertEquals(" ab ", StringUtils.center("ab", 4));
     assertEquals("abcd", StringUtils.center("abcd", 2));
     assertEquals(" a  ", StringUtils.center("a", 4));
     assertEquals("  a  ", StringUtils.center("a", 5));
 }
@Test
public void testLeftPad_StringIntChar245() {
     assertEquals(null, StringUtils.leftPad(null, 5, ' '));
     assertEquals("     ", StringUtils.leftPad("", 5, ' '));
     assertEquals("  abc", StringUtils.leftPad("abc", 5, ' '));
     assertEquals("xxabc", StringUtils.leftPad("abc", 5, 'x'));
     assertEquals("\uffff\uffffabc", StringUtils.leftPad("abc", 5, '\uffff'));
     assertEquals("abc", StringUtils.leftPad("abc", 2, ' '));
     final String str = StringUtils.leftPad("aaa", 10000, 'a');
     assertEquals(10000, str.length());
     assertTrue(StringUtils.containsOnly(str, new char[] { 'a' }));
 }
@Test
public void testEndsWithIgnoreCase258() {
    assertTrue("endsWithIgnoreCase(null, null)", StringUtils.endsWithIgnoreCase(null, (String) null));
    assertFalse("endsWithIgnoreCase(FOOBAR, null)", StringUtils.endsWithIgnoreCase(FOOBAR, (String) null));
    assertFalse("endsWithIgnoreCase(null, FOO)", StringUtils.endsWithIgnoreCase(null, FOO));
    assertTrue("endsWithIgnoreCase(FOOBAR, \"\")", StringUtils.endsWithIgnoreCase(FOOBAR, ""));
    assertFalse("endsWithIgnoreCase(foobar, foo)", StringUtils.endsWithIgnoreCase(foobar, StringUtilsStartsEndsWithTest.foo));
    assertFalse("endsWithIgnoreCase(FOOBAR, FOO)", StringUtils.endsWithIgnoreCase(FOOBAR, FOO));
    assertFalse("endsWithIgnoreCase(foobar, FOO)", StringUtils.endsWithIgnoreCase(foobar, FOO));
    assertFalse("endsWithIgnoreCase(FOOBAR, foo)", StringUtils.endsWithIgnoreCase(FOOBAR, StringUtilsStartsEndsWithTest.foo));
    assertFalse("endsWithIgnoreCase(foo, foobar)", StringUtils.endsWithIgnoreCase(StringUtilsStartsEndsWithTest.foo, foobar));
    assertFalse("endsWithIgnoreCase(foo, foobar)", StringUtils.endsWithIgnoreCase(FOOBAR, foobar));
    assertTrue("endsWithIgnoreCase(foobar, bar)", StringUtils.endsWithIgnoreCase(foobar, FOOBAR));
    assertTrue("endsWithIgnoreCase(FOOBAR, BAR)", StringUtils.endsWithIgnoreCase(FOOBAR, FOOBAR));
    assertFalse("endsWithIgnoreCase(foobar, BAR)", StringUtils.endsWithIgnoreCase(foobar, FOOBAR));
    assertFalse("endsWithIgnoreCase(FOOBAR, bar)", StringUtils.endsWithIgnoreCase(FOOBAR, FOOBAR));
    assertTrue("endsWithIgnoreCase(FOOBAR, BAR)", StringUtils.endsWithIgnoreCase(FOOBAR, FOOBAR));
}
@Test
public void testGetLevenshteinDistance_StringString276() {
     assertEquals(-1, StringUtils.getLevenshteinDistance("", null, 0));
     assertEquals(-1, StringUtils.getLevenshteinDistance("", "", 0));
     assertEquals(-1, StringUtils.getLevenshteinDistance("", "a", 0));
     assertEquals(-1, StringUtils.getLevenshteinDistance("", "a", 2));
     assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
     assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
     assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
     assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
     assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant"));
     assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz"));
     assertEquals(8, StringUtils.getLevenshteinDistance("zzzzzzzz", "hippo"));
     assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo"));
     try {
         @SuppressWarnings("unused")
         final int d = StringUtils.getLevenshteinDistance("a", null, 0);
         fail("expecting IllegalArgumentException");
     } catch (final IllegalArgumentException ex) {
     }
     try {
         @SuppressWarnings("unused")
         final int d = StringUtils.getLevenshteinDistance(null, "a", 0);
         fail("expecting IllegalArgumentException");
     } catch (final IllegalArgumentException ex) {
     }
 }
@Test
public void testGetLevenshteinDistance_StringString277() {
     assertEquals(-1, StringUtils.getLevenshteinDistance("", null, 0));
     assertEquals(-1, StringUtils.getLevenshteinDistance("", "", 0));
     assertEquals(0, StringUtils.getLevenshteinDistance("", "a", 0));
     assertEquals(0, StringUtils.getLevenshteinDistance("", "a", 2));
     assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
     assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
     assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
     assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
     assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant"));
     assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz"));
     assertEquals(8, StringUtils.getLevenshteinDistance("zzzzzzzz", "hippo"));
     assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo"));
     try {
         @SuppressWarnings("unused")
         final int d = StringUtils.getLevenshteinDistance("a", null, 0);
         fail("expecting IllegalArgumentException");
     } catch (final IllegalArgumentException ex) {
     }
     try {
         @SuppressWarnings("unused")
         final int d = StringUtils.getLevenshteinDistance(null, "a", 0);
         fail("expecting IllegalArgumentException");
     } catch (final IllegalArgumentException ex) {
     }
 }
@Test
public void testGetLevenshteinDistance_StringString278() {
     assertEquals(-1, StringUtils.getLevenshteinDistance(null, null));
     assertEquals(-1, StringUtils.getLevenshteinDistance("", null));
     assertEquals(-1, StringUtils.getLevenshteinDistance("", "a"));
     assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
     assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
     assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
     assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
     assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
     assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
     assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant"));
     assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz"));
     assertEquals(8, StringUtils.getLevenshteinDistance("zzzzzzzz", "hippo"));
     assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo"));
     try {
         @SuppressWarnings("unused")
         final int d = StringUtils.getLevenshteinDistance("a", null);
         fail("expecting IllegalArgumentException");
     } catch (final IllegalArgumentException ex) {
     }
     try {
         @SuppressWarnings("unused")
         final int d = StringUtils.getLevenshteinDistance(null, "a");
         fail("expecting IllegalArgumentException");
     } catch (final IllegalArgumentException ex) {
     }
 }
@Test
public void testJoin_IteratorString375() {
     assertEquals(null, StringUtils.join((Iterator<?>) null, null));
     assertEquals(TEXT_LIST_NOSEP, StringUtils.join(Arrays.asList(ARRAY_LIST).iterator(), null));
     assertEquals(TEXT_LIST_NOSEP, StringUtils.join(Arrays.asList(ARRAY_LIST).iterator(), ""));
     assertEquals("foo", StringUtils.join(Collections.singleton("foo").iterator(), "x"));
     assertEquals("foo", StringUtils.join(Collections.singleton("foo").iterator(), null));
     assertEquals("", StringUtils.join(Arrays.asList(NULL_ARRAY_LIST).iterator(), null));
     assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST).iterator(), ""));
     assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST).iterator(), SEPARATOR));
     assertEquals(TEXT_LIST, StringUtils.join(Arrays.asList(ARRAY_LIST).iterator(), SEPARATOR));
 }
@Test
public void testJoin_IterableString376() {
     assertEquals(null, StringUtils.join((Iterable<?>) null, null));
     assertEquals(TEXT_LIST_NOSEP, StringUtils.join(Arrays.asList(ARRAY_LIST), null));
     assertEquals(TEXT_LIST_NOSEP, StringUtils.join(Arrays.asList(ARRAY_LIST), ""));
     assertEquals("foo", StringUtils.join(Collections.singleton("foo"), "x"));
     assertEquals("foo", StringUtils.join(Collections.singleton("foo"), null));
     assertEquals("", StringUtils.join(Arrays.asList(NULL_ARRAY_LIST), null));
     assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), null));
     assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), ""));
     assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), SEPARATOR));
     assertEquals(TEXT_LIST, StringUtils.join(Arrays.asList(ARRAY_LIST), SEPARATOR));
 }
@Test
public void testReplace_StringStringArrayStringArray404() {
    assertNull(StringUtils.replaceEachRepeatedly(null, new String[]{"a"}, new String[]{"b"}));
    assertEquals(StringUtils.replaceEachRepeatedly("", new String[]{"a"}, new String[]{"b"}), "");
    assertEquals(StringUtils.replaceEachRepeatedly("aba", null, null), "aba");
    assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[0], null), "aba");
    assertEquals(StringUtils.replaceEachRepeatedly("aba", null, new String[0]), "aba");
    assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[]{"a"}, null), "aba");
    assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[]{"a"}, new String[]{""}), "b");
    assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[]{null}, new String[]{"a"}), "aba");
    assertEquals(StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}), "wcte");
    assertEquals(StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}), "dcte");
    assertEquals("bcc", StringUtils.replaceEachRepeatedly("abc", new String[]{"a", "b"}, new String[]{"b", "c"}));
}
@Test
public void testReplaceEachRepeatedly_StringStringArrayStringArray405() {
    assertNull(StringUtils.replaceEachRepeatedly(null, new String[]{"a"}, new String[]{"b"}));
    assertEquals(StringUtils.replaceEachRepeatedly("", new String[]{"a"}, new String[]{"b"}), "");
    assertEquals(StringUtils.replaceEachRepeatedly("aba", null, null), "aba");
    assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[0], null), "aba");
    assertEquals(StringUtils.replaceEachRepeatedly("aba", null, new String[0]), "aba");
    assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[]{"a"}, null), "aba");
    assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[]{"a"}, new String[]{""}), "aba");
    assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[]{null}, new String[]{"a"}), "aba");
    assertEquals(StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}), "wcte");
    assertEquals(StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}), "dcte");
    assertEquals("bcc", StringUtils.replaceEachRepeatedly("abc", new String[]{"a", "b"}, new String[]{"b", "c"}));
}
@Test
public void testSplitByWholeString_StringStringBooleanInt426() {
    assertArrayEquals(null, StringUtils.splitByWholeSeparator(null, ".", 3));
    assertEquals(0, StringUtils.splitByWholeSeparator("", ".", 3).length);
    final String stringToSplitOnNulls = "ab   de fg";
    final String[] splitOnNullExpectedResults = {"ab", "de fg"};
    final String[] splitOnNullResults = StringUtils.splitByWholeSeparator(stringToSplitOnNulls, null, 2);
    assertEquals(splitOnNullExpectedResults.length, splitOnNullResults.length);
    for (int i = 0; i < splitOnNullExpectedResults.length; i += 1) {
        assertEquals(splitOnNullExpectedResults[i], splitOnNullResults[i]);
    }
    final String stringToSplitOnCharactersAndString = "abstemiouslyaeiouyabstemiously";
    final String[] splitOnStringExpectedResults = {"abstemiously", "abstemiously"};
    final String[] splitOnStringResults = StringUtils.splitByWholeSeparator(stringToSplitOnCharactersAndString, "aeiouy", 2);
    assertEquals(splitOnStringExpectedResults.length, splitOnStringResults.length);
    for (int i = 0; i < splitOnStringExpectedResults.length; i += 1) {
        assertEquals(splitOnStringExpectedResults[i], splitOnStringResults[i]);
    }
    final String[] splitWithMultipleSeparatorExpectedResults = {"ab", "cd", "ef"};
    final String[] splitWithMultipleSeparator = StringUtils.splitByWholeSeparator("ab:cd::ef", String.valueOf(2));
    assertEquals(splitWithMultipleSeparatorExpectedResults.length, splitWithMultipleSeparator.length);
}
@Test
public void testSplitByWholeString_StringStringBooleanInt427() {
     assertArrayEquals(null, StringUtils.splitByWholeSeparator(null, ".", 3));
     assertEquals(0, StringUtils.splitByWholeSeparator("", ".", 3).length);
     final String stringToSplitOnNulls = "ab   de fg";
     final String[] splitOnNullExpectedResults = { "ab", "de", "fg" };
     final String[] splitOnNullResults = StringUtils.splitByWholeSeparator(stringToSplitOnNulls, null, 2);
     assertEquals(splitOnNullExpectedResults.length, splitOnNullResults.length);
     for (int i = 0; i < splitOnNullExpectedResults.length; i += 1) {
         assertEquals(splitOnNullExpectedResults[i], splitOnNullResults[i]);
     }
     final String stringToSplitOnCharactersAndString = "abstemiouslyaeiouyabstemiously";
     final String[] splitOnStringExpectedResults = { "abstemiously", "abstemiously" };
     final String[] splitOnStringResults = StringUtils.splitByWholeSeparator(stringToSplitOnCharactersAndString, "aeiouy", 2);
     assertEquals(splitOnStringExpectedResults.length, splitOnStringResults.length);
     for (int i = 0; i < splitOnStringExpectedResults.length; i += 1) {
         assertEquals(splitOnStringExpectedResults[i], splitOnStringResults[i]);
     }
     final String[] splitWithMultipleSeparatorExpectedResults = { "ab", "cd", "ef" };
     final String[] splitWithMultipleSeparator = StringUtils.splitByWholeSeparator("ab:cd::ef", ":", 2);
     assertEquals(splitWithMultipleSeparatorExpectedResults.length, splitWithMultipleSeparator.length);
     for (int i = 0; i < splitWithMultipleSeparatorExpectedResults.length; i++) {
     }}



    //-----------------------------------------------------------------------




    //-----------------------------------------------------------------------




































    private void innerTestSplit(final char separator, final String sepStr, final char noMatch) {
        final String msg = "Failed on separator hex(" + Integer.toHexString(separator) +
            "), noMatch hex(" + Integer.toHexString(noMatch) + "), sepStr(" + sepStr + ")";

        final String str = "a" + separator + "b" + separator + separator + noMatch + "c";
        String[] res;
        // (str, sepStr)
        res = StringUtils.split(str, sepStr);
        assertEquals(msg, 3, res.length);
        assertEquals(msg, "a", res[0]);
        assertEquals(msg, "b", res[1]);
        assertEquals(msg, noMatch + "c", res[2]);

        final String str2 = separator + "a" + separator;
        res = StringUtils.split(str2, sepStr);
        assertEquals(msg, 1, res.length);
        assertEquals(msg, "a", res[0]);

        res = StringUtils.split(str, sepStr, -1);
        assertEquals(msg, 3, res.length);
        assertEquals(msg, "a", res[0]);
        assertEquals(msg, "b", res[1]);
        assertEquals(msg, noMatch + "c", res[2]);

        res = StringUtils.split(str, sepStr, 0);
        assertEquals(msg, 3, res.length);
        assertEquals(msg, "a", res[0]);
        assertEquals(msg, "b", res[1]);
        assertEquals(msg, noMatch + "c", res[2]);

        res = StringUtils.split(str, sepStr, 1);
        assertEquals(msg, 1, res.length);
        assertEquals(msg, str, res[0]);

        res = StringUtils.split(str, sepStr, 2);
        assertEquals(msg, 2, res.length);
        assertEquals(msg, "a", res[0]);
        assertEquals(msg, str.substring(2), res[1]);
    }













    private void innerTestSplitPreserveAllTokens(final char separator, final String sepStr, final char noMatch) {
        final String msg = "Failed on separator hex(" + Integer.toHexString(separator) +
            "), noMatch hex(" + Integer.toHexString(noMatch) + "), sepStr(" + sepStr + ")";

        final String str = "a" + separator + "b" + separator + separator + noMatch + "c";
        String[] res;
        // (str, sepStr)
        res = StringUtils.splitPreserveAllTokens(str, sepStr);
        assertEquals(msg, 4, res.length);
        assertEquals(msg, "a", res[0]);
        assertEquals(msg, "b", res[1]);
        assertEquals(msg, "", res[2]);
        assertEquals(msg, noMatch + "c", res[3]);

        final String str2 = separator + "a" + separator;
        res = StringUtils.splitPreserveAllTokens(str2, sepStr);
        assertEquals(msg, 3, res.length);
        assertEquals(msg, "", res[0]);
        assertEquals(msg, "a", res[1]);
        assertEquals(msg, "", res[2]);

        res = StringUtils.splitPreserveAllTokens(str, sepStr, -1);
        assertEquals(msg, 4, res.length);
        assertEquals(msg, "a", res[0]);
        assertEquals(msg, "b", res[1]);
        assertEquals(msg, "", res[2]);
        assertEquals(msg, noMatch + "c", res[3]);

        res = StringUtils.splitPreserveAllTokens(str, sepStr, 0);
        assertEquals(msg, 4, res.length);
        assertEquals(msg, "a", res[0]);
        assertEquals(msg, "b", res[1]);
        assertEquals(msg, "", res[2]);
        assertEquals(msg, noMatch + "c", res[3]);

        res = StringUtils.splitPreserveAllTokens(str, sepStr, 1);
        assertEquals(msg, 1, res.length);
        assertEquals(msg, str, res[0]);

        res = StringUtils.splitPreserveAllTokens(str, sepStr, 2);
        assertEquals(msg, 2, res.length);
        assertEquals(msg, "a", res[0]);
        assertEquals(msg, str.substring(2), res[1]);
    }



















    /**
     * Test method for 'StringUtils.replaceEach(String, String[], String[])'
     */


    /**
     * Test method for 'StringUtils.replaceEachRepeatedly(String, String[], String[])'
     */
















    //-----------------------------------------------------------------------






    //-----------------------------------------------------------------------














    //-----------------------------------------------------------------------






    //-----------------------------------------------------------------------




    //-----------------------------------------------------------------------




















    //-----------------------------------------------------------------------




    private void assertAbbreviateWithOffset(final String expected, final int offset, final int maxWidth) {
        final String abcdefghijklmno = "abcdefghijklmno";
        final String message = "abbreviate(String,int,int) failed";
        final String actual = StringUtils.abbreviate(abcdefghijklmno, offset, maxWidth);
        if (offset >= 0 && offset < abcdefghijklmno.length()) {
            assertTrue(message + " -- should contain offset character",
                    actual.indexOf((char)('a'+offset)) != -1);
        }
        assertTrue(message + " -- should not be greater than maxWidth",
                actual.length() <= maxWidth);
        assertEquals(message, expected, actual);
    }



    //-----------------------------------------------------------------------




    //-----------------------------------------------------------------------




    /**
     * A sanity check for {@link StringUtils#EMPTY}.
     */


    /**
     * Test for {@link StringUtils#isAllLowerCase(CharSequence)}.
     */


    /**
     * Test for {@link StringUtils#isAllUpperCase(CharSequence)}.
     */






















    // Methods on StringUtils that are immutable in spirit (i.e. calculate the length)
    // should take a CharSequence parameter. Methods that are mutable in spirit (i.e. capitalize)
    // should take a String or String[] parameter and return String or String[].
    // This test enforces that this is done.


    /**
     * Tests {@link StringUtils#toString(byte[], String)}
     *
     * @throws UnsupportedEncodingException
     * @see StringUtils#toString(byte[], String)
     */




    /**
     * Tests LANG-858.
     *
     * @throws Exception
     */




    /**
     * Tests {@code appendIfMissing}.
     */


    /**
     * Tests {@code appendIfMissingIgnoreCase}.
     */


    /**
     * Tests {@code prependIfMissing}.
     */


    /**
     * Tests {@code prependIfMissingIgnoreCase}.
     */

}
