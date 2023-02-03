/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
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

import java.io.UnsupportedEncodingException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * <p>Operations on {@link java.lang.String} that are
 * {@code null} safe.</p>
 *
 * <ul>
 *  <li><b>IsEmpty/IsBlank</b>
 *      - checks if a String contains text</li>
 *  <li><b>Trim/Strip</b>
 *      - removes leading and trailing whitespace</li>
 *  <li><b>Equals</b>
 *      - compares two strings null-safe</li>
 *  <li><b>startsWith</b>
 *      - check if a String starts with a prefix null-safe</li>
 *  <li><b>endsWith</b>
 *      - check if a String ends with a suffix null-safe</li>
 *  <li><b>IndexOf/LastIndexOf/Contains</b>
 *      - null-safe index-of checks
 *  <li><b>IndexOfAny/LastIndexOfAny/IndexOfAnyBut/LastIndexOfAnyBut</b>
 *      - index-of any of a set of Strings</li>
 *  <li><b>ContainsOnly/ContainsNone/ContainsAny</b>
 *      - does String contains only/none/any of these characters</li>
 *  <li><b>Substring/Left/Right/Mid</b>
 *      - null-safe substring extractions</li>
 *  <li><b>SubstringBefore/SubstringAfter/SubstringBetween</b>
 *      - substring extraction relative to other strings</li>
 *  <li><b>Split/Join</b>
 *      - splits a String into an array of substrings and vice versa</li>
 *  <li><b>Remove/Delete</b>
 *      - removes part of a String</li>
 *  <li><b>Replace/Overlay</b>
 *      - Searches a String and replaces one String with another</li>
 *  <li><b>Chomp/Chop</b>
 *      - removes the last part of a String</li>
 *  <li><b>AppendIfMissing</b>
 *      - appends a suffix to the end of the String if not present</li>
 *  <li><b>PrependIfMissing</b>
 *      - prepends a prefix to the start of the String if not present</li>
 *  <li><b>LeftPad/RightPad/Center/Repeat</b>
 *      - pads a String</li>
 *  <li><b>UpperCase/LowerCase/SwapCase/Capitalize/Uncapitalize</b>
 *      - changes the case of a String</li>
 *  <li><b>CountMatches</b>
 *      - counts the number of occurrences of one String in another</li>
 *  <li><b>IsAlpha/IsNumeric/IsWhitespace/IsAsciiPrintable</b>
 *      - checks the characters in a String</li>
 *  <li><b>DefaultString</b>
 *      - protects against a null input String</li>
 *  <li><b>Reverse/ReverseDelimited</b>
 *      - reverses a String</li>
 *  <li><b>Abbreviate</b>
 *      - abbreviates a string using ellipsis</li>
 *  <li><b>Difference</b>
 *      - compares Strings and reports on their differences</li>
 *  <li><b>LevenshteinDistance</b>
 *      - the number of changes needed to change one String into another</li>
 * </ul>
 *
 * <p>The {@code StringUtils} class defines certain words related to
 * String handling.</p>
 *
 * <ul>
 *  <li>null - {@code null}</li>
 *  <li>empty - a zero-length string ({@code ""})</li>
 *  <li>space - the space character ({@code ' '}, char 32)</li>
 *  <li>whitespace - the characters defined by {@link Character#isWhitespace(char)}</li>
 *  <li>trim - the characters &lt;= 32 as in {@link String#trim()}</li>
 * </ul>
 *
 * <p>{@code StringUtils} handles {@code null} input Strings quietly.
 * That is to say that a {@code null} input will return {@code null}.
 * Where a {@code boolean} or {@code int} is being returned
 * details vary by method.</p>
 *
 * <p>A side effect of the {@code null} handling is that a
 * {@code NullPointerException} should be considered a bug in
 * {@code StringUtils}.</p>
 *
 * <p>Methods in this class give sample code to explain their operation.
 * The symbol {@code *} is used to indicate any input including {@code null}.</p>
 *
 * <p>#ThreadSafe#</p>
 * @see java.lang.String
 * @since 1.0
 * @version $Id$
 */
//@Immutable
@java.lang.SuppressWarnings({"fallthrough"}) public class StringUtils {public static class __CLR4_4_14dm4dmldnigfmq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,8178,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Performance testing notes (JDK 1.4, Jul03, scolebourne)
    // Whitespace:
    // Character.isWhitespace() is faster than WHITESPACE.indexOf()
    // where WHITESPACE is a string of all whitespace characters
    //
    // Character access:
    // String.charAt(n) versus toCharArray(), then array[n]
    // String.charAt(n) is about 15% worse for a 10K string
    // They are about equal for a length 50 string
    // String.charAt(n) is about 4 times better for a length 3 string
    // String.charAt(n) is best bet overall
    //
    // Append:
    // String.concat about twice as fast as StringBuffer.append
    // (not sure who tested this)

    /**
     * A String for a space character.
     * 
     * @since 3.2
     */
    public static final String SPACE = " ";

    /**
     * The empty String {@code ""}.
     * @since 2.0
     */
    public static final String EMPTY = "";

    /**
     * A String for linefeed LF ("\n").
     * 
     * @see <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.6">JLF: Escape Sequences
     *      for Character and String Literals</a>
     * @since 3.2
     */
    public static final String LF = "\n";

    /**
     * A String for carriage return CR ("\r").
     * 
     * @see <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.6">JLF: Escape Sequences
     *      for Character and String Literals</a>
     * @since 3.2
     */
    public static final String CR = "\r";
    
    /**
     * Represents a failed index search.
     * @since 2.1
     */
    public static final int INDEX_NOT_FOUND = -1;

    /**
     * <p>The maximum size to which the padding constant(s) can expand.</p>
     */
    private static final int PAD_LIMIT = 8192;

    /**
     * A regex pattern for recognizing blocks of whitespace characters.
     * The apparent convolutedness of the pattern serves the purpose of
     * ignoring "blocks" consisting of only a single space:  the pattern
     * is used only to normalize whitespace, condensing "blocks" down to a
     * single space, thus matching the same would likely cause a great
     * many noop replacements.
     */
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("(?: \\s|[\\s&&[^ ]])\\s*");

    /**
     * <p>{@code StringUtils} instances should NOT be constructed in
     * standard programming. Instead, the class should be used as
     * {@code StringUtils.trim(" foo ");}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public StringUtils() {
        super();__CLR4_4_14dm4dmldnigfmq.R.inc(5675);try{__CLR4_4_14dm4dmldnigfmq.R.inc(5674);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Empty checks
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if a CharSequence is empty ("") or null.</p>
     *
     * <pre>
     * StringUtils.isEmpty(null)      = true
     * StringUtils.isEmpty("")        = true
     * StringUtils.isEmpty(" ")       = false
     * StringUtils.isEmpty("bob")     = false
     * StringUtils.isEmpty("  bob  ") = false
     * </pre>
     *
     * <p>NOTE: This method changed in Lang version 2.0.
     * It no longer trims the CharSequence.
     * That functionality is available in isBlank().</p>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is empty or null
     * @since 3.0 Changed signature from isEmpty(String) to isEmpty(CharSequence)
     */
    public static boolean isEmpty(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5676);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5677);return cs == null || cs.length() == 0;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if a CharSequence is not empty ("") and not null.</p>
     *
     * <pre>
     * StringUtils.isNotEmpty(null)      = false
     * StringUtils.isNotEmpty("")        = false
     * StringUtils.isNotEmpty(" ")       = true
     * StringUtils.isNotEmpty("bob")     = true
     * StringUtils.isNotEmpty("  bob  ") = true
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is not empty and not null
     * @since 3.0 Changed signature from isNotEmpty(String) to isNotEmpty(CharSequence)
     */
    public static boolean isNotEmpty(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5678);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5679);return !StringUtils.isEmpty(cs);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if a CharSequence is whitespace, empty ("") or null.</p>
     *
     * <pre>
     * StringUtils.isBlank(null)      = true
     * StringUtils.isBlank("")        = true
     * StringUtils.isBlank(" ")       = true
     * StringUtils.isBlank("bob")     = false
     * StringUtils.isBlank("  bob  ") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is null, empty or whitespace
     * @since 2.0
     * @since 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)
     */
    public static boolean isBlank(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5680);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5681);int strLen;
        __CLR4_4_14dm4dmldnigfmq.R.inc(5682);if (cs == null || (strLen = cs.length()) == 0) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5685);return true;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5686);for (int i = 0; (((i < strLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5687)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5688)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5689);if ((((Character.isWhitespace(cs.charAt(i)) == false)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5690)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5691)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(5692);return false;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5693);return true;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if a CharSequence is not empty (""), not null and not whitespace only.</p>
     *
     * <pre>
     * StringUtils.isNotBlank(null)      = false
     * StringUtils.isNotBlank("")        = false
     * StringUtils.isNotBlank(" ")       = false
     * StringUtils.isNotBlank("bob")     = true
     * StringUtils.isNotBlank("  bob  ") = true
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is
     *  not empty and not null and not whitespace
     * @since 2.0
     * @since 3.0 Changed signature from isNotBlank(String) to isNotBlank(CharSequence)
     */
    public static boolean isNotBlank(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5694);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5695);return !StringUtils.isBlank(cs);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Trim
    //-----------------------------------------------------------------------
    /**
     * <p>Removes control characters (char &lt;= 32) from both
     * ends of this String, handling {@code null} by returning
     * {@code null}.</p>
     *
     * <p>The String is trimmed using {@link String#trim()}.
     * Trim removes start and end characters &lt;= 32.
     * To strip whitespace use {@link #strip(String)}.</p>
     *
     * <p>To trim your choice of characters, use the
     * {@link #strip(String, String)} methods.</p>
     *
     * <pre>
     * StringUtils.trim(null)          = null
     * StringUtils.trim("")            = ""
     * StringUtils.trim("     ")       = ""
     * StringUtils.trim("abc")         = "abc"
     * StringUtils.trim("    abc    ") = "abc"
     * </pre>
     *
     * @param str  the String to be trimmed, may be null
     * @return the trimmed string, {@code null} if null String input
     */
    public static String trim(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5696);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5697);return (((str == null )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5698)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5699)==0&false))? null : str.trim();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Removes control characters (char &lt;= 32) from both
     * ends of this String returning {@code null} if the String is
     * empty ("") after the trim or if it is {@code null}.
     *
     * <p>The String is trimmed using {@link String#trim()}.
     * Trim removes start and end characters &lt;= 32.
     * To strip whitespace use {@link #stripToNull(String)}.</p>
     *
     * <pre>
     * StringUtils.trimToNull(null)          = null
     * StringUtils.trimToNull("")            = null
     * StringUtils.trimToNull("     ")       = null
     * StringUtils.trimToNull("abc")         = "abc"
     * StringUtils.trimToNull("    abc    ") = "abc"
     * </pre>
     *
     * @param str  the String to be trimmed, may be null
     * @return the trimmed String,
     *  {@code null} if only chars &lt;= 32, empty or null String input
     * @since 2.0
     */
    public static String trimToNull(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5700);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5701);final String ts = trim(str);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5702);return (((isEmpty(ts) )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5703)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5704)==0&false))? null : ts;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Removes control characters (char &lt;= 32) from both
     * ends of this String returning an empty String ("") if the String
     * is empty ("") after the trim or if it is {@code null}.
     *
     * <p>The String is trimmed using {@link String#trim()}.
     * Trim removes start and end characters &lt;= 32.
     * To strip whitespace use {@link #stripToEmpty(String)}.</p>
     *
     * <pre>
     * StringUtils.trimToEmpty(null)          = ""
     * StringUtils.trimToEmpty("")            = ""
     * StringUtils.trimToEmpty("     ")       = ""
     * StringUtils.trimToEmpty("abc")         = "abc"
     * StringUtils.trimToEmpty("    abc    ") = "abc"
     * </pre>
     *
     * @param str  the String to be trimmed, may be null
     * @return the trimmed String, or an empty String if {@code null} input
     * @since 2.0
     */
    public static String trimToEmpty(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5705);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5706);return (((str == null )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5707)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5708)==0&false))? EMPTY : str.trim();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Stripping
    //-----------------------------------------------------------------------
    /**
     * <p>Strips whitespace from the start and end of a String.</p>
     *
     * <p>This is similar to {@link #trim(String)} but removes whitespace.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.strip(null)     = null
     * StringUtils.strip("")       = ""
     * StringUtils.strip("   ")    = ""
     * StringUtils.strip("abc")    = "abc"
     * StringUtils.strip("  abc")  = "abc"
     * StringUtils.strip("abc  ")  = "abc"
     * StringUtils.strip(" abc ")  = "abc"
     * StringUtils.strip(" ab c ") = "ab c"
     * </pre>
     *
     * @param str  the String to remove whitespace from, may be null
     * @return the stripped String, {@code null} if null String input
     */
    public static String strip(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5709);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5710);return strip(str, null);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Strips whitespace from the start and end of a String  returning
     * {@code null} if the String is empty ("") after the strip.</p>
     *
     * <p>This is similar to {@link #trimToNull(String)} but removes whitespace.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripToNull(null)     = null
     * StringUtils.stripToNull("")       = null
     * StringUtils.stripToNull("   ")    = null
     * StringUtils.stripToNull("abc")    = "abc"
     * StringUtils.stripToNull("  abc")  = "abc"
     * StringUtils.stripToNull("abc  ")  = "abc"
     * StringUtils.stripToNull(" abc ")  = "abc"
     * StringUtils.stripToNull(" ab c ") = "ab c"
     * </pre>
     *
     * @param str  the String to be stripped, may be null
     * @return the stripped String,
     *  {@code null} if whitespace, empty or null String input
     * @since 2.0
     */
    public static String stripToNull(String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5711);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5712);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5713)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5714)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5715);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5716);str = strip(str, null);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5717);return (((str.isEmpty() )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5718)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5719)==0&false))? null : str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Strips whitespace from the start and end of a String  returning
     * an empty String if {@code null} input.</p>
     *
     * <p>This is similar to {@link #trimToEmpty(String)} but removes whitespace.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripToEmpty(null)     = ""
     * StringUtils.stripToEmpty("")       = ""
     * StringUtils.stripToEmpty("   ")    = ""
     * StringUtils.stripToEmpty("abc")    = "abc"
     * StringUtils.stripToEmpty("  abc")  = "abc"
     * StringUtils.stripToEmpty("abc  ")  = "abc"
     * StringUtils.stripToEmpty(" abc ")  = "abc"
     * StringUtils.stripToEmpty(" ab c ") = "ab c"
     * </pre>
     *
     * @param str  the String to be stripped, may be null
     * @return the trimmed String, or an empty String if {@code null} input
     * @since 2.0
     */
    public static String stripToEmpty(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5720);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5721);return (((str == null )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5722)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5723)==0&false))? EMPTY : strip(str, null);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Strips any of a set of characters from the start and end of a String.
     * This is similar to {@link String#trim()} but allows the characters
     * to be stripped to be controlled.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * An empty string ("") input returns the empty string.</p>
     *
     * <p>If the stripChars String is {@code null}, whitespace is
     * stripped as defined by {@link Character#isWhitespace(char)}.
     * Alternatively use {@link #strip(String)}.</p>
     *
     * <pre>
     * StringUtils.strip(null, *)          = null
     * StringUtils.strip("", *)            = ""
     * StringUtils.strip("abc", null)      = "abc"
     * StringUtils.strip("  abc", null)    = "abc"
     * StringUtils.strip("abc  ", null)    = "abc"
     * StringUtils.strip(" abc ", null)    = "abc"
     * StringUtils.strip("  abcyx", "xyz") = "  abc"
     * </pre>
     *
     * @param str  the String to remove characters from, may be null
     * @param stripChars  the characters to remove, null treated as whitespace
     * @return the stripped String, {@code null} if null String input
     */
    public static String strip(String str, final String stripChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5724);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5725);if ((((isEmpty(str))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5726)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5727)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5728);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5729);str = stripStart(str, stripChars);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5730);return stripEnd(str, stripChars);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Strips any of a set of characters from the start of a String.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * An empty string ("") input returns the empty string.</p>
     *
     * <p>If the stripChars String is {@code null}, whitespace is
     * stripped as defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripStart(null, *)          = null
     * StringUtils.stripStart("", *)            = ""
     * StringUtils.stripStart("abc", "")        = "abc"
     * StringUtils.stripStart("abc", null)      = "abc"
     * StringUtils.stripStart("  abc", null)    = "abc"
     * StringUtils.stripStart("abc  ", null)    = "abc  "
     * StringUtils.stripStart(" abc ", null)    = "abc "
     * StringUtils.stripStart("yxabc  ", "xyz") = "abc  "
     * </pre>
     *
     * @param str  the String to remove characters from, may be null
     * @param stripChars  the characters to remove, null treated as whitespace
     * @return the stripped String, {@code null} if null String input
     */
    public static String stripStart(final String str, final String stripChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5731);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5732);int strLen;
        __CLR4_4_14dm4dmldnigfmq.R.inc(5733);if (str == null || (strLen = str.length()) == 0) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5736);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5737);int start = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(5738);if ((((stripChars == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5739)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5740)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5741);while ((((start != strLen && Character.isWhitespace(str.charAt(start)))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5742)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5743)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(5744);start++;
            }
        }} }else {__CLR4_4_14dm4dmldnigfmq.R.inc(5745);if ((((stripChars.isEmpty())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5746)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5747)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5748);return str;
        } }else {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5749);while ((((start != strLen && stripChars.indexOf(str.charAt(start)) != INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5750)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5751)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(5752);start++;
            }
        }}
        }}__CLR4_4_14dm4dmldnigfmq.R.inc(5753);return str.substring(start);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Strips any of a set of characters from the end of a String.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * An empty string ("") input returns the empty string.</p>
     *
     * <p>If the stripChars String is {@code null}, whitespace is
     * stripped as defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripEnd(null, *)          = null
     * StringUtils.stripEnd("", *)            = ""
     * StringUtils.stripEnd("abc", "")        = "abc"
     * StringUtils.stripEnd("abc", null)      = "abc"
     * StringUtils.stripEnd("  abc", null)    = "  abc"
     * StringUtils.stripEnd("abc  ", null)    = "abc"
     * StringUtils.stripEnd(" abc ", null)    = " abc"
     * StringUtils.stripEnd("  abcyx", "xyz") = "  abc"
     * StringUtils.stripEnd("120.00", ".0")   = "12"
     * </pre>
     *
     * @param str  the String to remove characters from, may be null
     * @param stripChars  the set of characters to remove, null treated as whitespace
     * @return the stripped String, {@code null} if null String input
     */
    public static String stripEnd(final String str, final String stripChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5754);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5755);int end;
        __CLR4_4_14dm4dmldnigfmq.R.inc(5756);if (str == null || (end = str.length()) == 0) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5759);return str;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(5760);if ((((stripChars == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5761)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5762)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5763);while ((((end != 0 && Character.isWhitespace(str.charAt(end - 1)))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5764)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5765)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(5766);end--;
            }
        }} }else {__CLR4_4_14dm4dmldnigfmq.R.inc(5767);if ((((stripChars.isEmpty())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5768)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5769)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5770);return str;
        } }else {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5771);while ((((end != 0 && stripChars.indexOf(str.charAt(end - 1)) != INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5772)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5773)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(5774);end--;
            }
        }}
        }}__CLR4_4_14dm4dmldnigfmq.R.inc(5775);return str.substring(0, end);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // StripAll
    //-----------------------------------------------------------------------
    /**
     * <p>Strips whitespace from the start and end of every String in an array.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>A new array is returned each time, except for length zero.
     * A {@code null} array will return {@code null}.
     * An empty array will return itself.
     * A {@code null} array entry will be ignored.</p>
     *
     * <pre>
     * StringUtils.stripAll(null)             = null
     * StringUtils.stripAll([])               = []
     * StringUtils.stripAll(["abc", "  abc"]) = ["abc", "abc"]
     * StringUtils.stripAll(["abc  ", null])  = ["abc", null]
     * </pre>
     *
     * @param strs  the array to remove whitespace from, may be null
     * @return the stripped Strings, {@code null} if null array input
     */
    public static String[] stripAll(final String... strs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5776);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5777);return stripAll(strs, null);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Strips any of a set of characters from the start and end of every
     * String in an array.</p>
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>A new array is returned each time, except for length zero.
     * A {@code null} array will return {@code null}.
     * An empty array will return itself.
     * A {@code null} array entry will be ignored.
     * A {@code null} stripChars will strip whitespace as defined by
     * {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripAll(null, *)                = null
     * StringUtils.stripAll([], *)                  = []
     * StringUtils.stripAll(["abc", "  abc"], null) = ["abc", "abc"]
     * StringUtils.stripAll(["abc  ", null], null)  = ["abc", null]
     * StringUtils.stripAll(["abc  ", null], "yz")  = ["abc  ", null]
     * StringUtils.stripAll(["yabcz", null], "yz")  = ["abc", null]
     * </pre>
     *
     * @param strs  the array to remove characters from, may be null
     * @param stripChars  the characters to remove, null treated as whitespace
     * @return the stripped Strings, {@code null} if null array input
     */
    public static String[] stripAll(final String[] strs, final String stripChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5778);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5779);int strsLen;
        __CLR4_4_14dm4dmldnigfmq.R.inc(5780);if (strs == null || (strsLen = strs.length) == 0) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5783);return strs;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5784);final String[] newArr = new String[strsLen];
        __CLR4_4_14dm4dmldnigfmq.R.inc(5785);for (int i = 0; (((i < strsLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5786)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5787)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5788);newArr[i] = strip(strs[i], stripChars);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5789);return newArr;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Removes diacritics (~= accents) from a string. The case will not be altered.</p>
     * <p>For instance, '&agrave;' will be replaced by 'a'.</p>
     * <p>Note that ligatures will be left as is.</p>
     *
     * <pre>
     * StringUtils.stripAccents(null)                = null
     * StringUtils.stripAccents("")                  = ""
     * StringUtils.stripAccents("control")           = "control"
     * StringUtils.stripAccents("&eacute;clair")     = "eclair"
     * </pre>
     *
     * @param input String to be stripped
     * @return input text with diacritics removed
     *
     * @since 3.0
     */
    // See also Lucene's ASCIIFoldingFilter (Lucene 2.9) that replaces accented characters by their unaccented equivalent (and uncommitted bug fix: https://issues.apache.org/jira/browse/LUCENE-1343?focusedCommentId=12858907&page=com.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#action_12858907).
    public static String stripAccents(final String input) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5790);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5791);if((((input == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5792)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5793)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5794);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5795);final Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");//$NON-NLS-1$
        __CLR4_4_14dm4dmldnigfmq.R.inc(5796);final String decomposed = Normalizer.normalize(input, Normalizer.Form.NFD);
        // Note that this doesn't correctly remove ligatures...
        __CLR4_4_14dm4dmldnigfmq.R.inc(5797);return pattern.matcher(decomposed).replaceAll("");//$NON-NLS-1$
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Equals
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two CharSequences, returning {@code true} if they represent
     * equal sequences of characters.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringUtils.equals(null, null)   = true
     * StringUtils.equals(null, "abc")  = false
     * StringUtils.equals("abc", null)  = false
     * StringUtils.equals("abc", "abc") = true
     * StringUtils.equals("abc", "ABC") = false
     * </pre>
     *
     * @see Object#equals(Object)
     * @param cs1  the first CharSequence, may be {@code null}
     * @param cs2  the second CharSequence, may be {@code null}
     * @return {@code true} if the CharSequences are equal (case-sensitive), or both {@code null}
     * @since 3.0 Changed signature from equals(String, String) to equals(CharSequence, CharSequence)
     */
    public static boolean equals(final CharSequence cs1, final CharSequence cs2) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5798);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5799);if ((((cs1 == cs2)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5800)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5801)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5802);return true;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5803);if ((((cs1 == null || cs2 == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5804)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5805)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5806);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5807);if ((((cs1 instanceof String && cs2 instanceof String)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5808)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5809)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5810);return cs1.equals(cs2);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5811);return CharSequenceUtils.regionMatches(cs1, false, 0, cs2, 0, Math.max(cs1.length(), cs2.length()));
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Compares two CharSequences, returning {@code true} if they represent
     * equal sequences of characters, ignoring case.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered equal. Comparison is case insensitive.</p>
     *
     * <pre>
     * StringUtils.equalsIgnoreCase(null, null)   = true
     * StringUtils.equalsIgnoreCase(null, "abc")  = false
     * StringUtils.equalsIgnoreCase("abc", null)  = false
     * StringUtils.equalsIgnoreCase("abc", "abc") = true
     * StringUtils.equalsIgnoreCase("abc", "ABC") = true
     * </pre>
     *
     * @param str1  the first CharSequence, may be null
     * @param str2  the second CharSequence, may be null
     * @return {@code true} if the CharSequence are equal, case insensitive, or
     *  both {@code null}
     * @since 3.0 Changed signature from equalsIgnoreCase(String, String) to equalsIgnoreCase(CharSequence, CharSequence)
     */
    public static boolean equalsIgnoreCase(final CharSequence str1, final CharSequence str2) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5812);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5813);if ((((str1 == null || str2 == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5814)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5815)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5816);return str1 == str2;
        } }else {__CLR4_4_14dm4dmldnigfmq.R.inc(5817);if ((((str1 == str2)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5818)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5819)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5820);return true;
        } }else {__CLR4_4_14dm4dmldnigfmq.R.inc(5821);if ((((str1.length() != str2.length())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5822)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5823)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5824);return false;
        } }else {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5825);return CharSequenceUtils.regionMatches(str1, true, 0, str2, 0, str1.length());
        }
    }}}}finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the first index within a CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(int, int)} if possible.</p>
     *
     * <p>A {@code null} or empty ("") CharSequence will return {@code INDEX_NOT_FOUND (-1)}.</p>
     *
     * <pre>
     * StringUtils.indexOf(null, *)         = -1
     * StringUtils.indexOf("", *)           = -1
     * StringUtils.indexOf("aabaabaa", 'a') = 0
     * StringUtils.indexOf("aabaabaa", 'b') = 2
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @return the first index of the search character,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from indexOf(String, int) to indexOf(CharSequence, int)
     */
    public static int indexOf(final CharSequence seq, final int searchChar) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5826);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5827);if ((((isEmpty(seq))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5828)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5829)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5830);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5831);return CharSequenceUtils.indexOf(seq, searchChar, 0);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Finds the first index within a CharSequence from a start position,
     * handling {@code null}.
     * This method uses {@link String#indexOf(int, int)} if possible.</p>
     *
     * <p>A {@code null} or empty ("") CharSequence will return {@code (INDEX_NOT_FOUND) -1}.
     * A negative start position is treated as zero.
     * A start position greater than the string length returns {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOf(null, *, *)          = -1
     * StringUtils.indexOf("", *, *)            = -1
     * StringUtils.indexOf("aabaabaa", 'b', 0)  = 2
     * StringUtils.indexOf("aabaabaa", 'b', 3)  = 5
     * StringUtils.indexOf("aabaabaa", 'b', 9)  = -1
     * StringUtils.indexOf("aabaabaa", 'b', -1) = 2
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @param startPos  the start position, negative treated as zero
     * @return the first index of the search character (always &ge; startPos),
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from indexOf(String, int, int) to indexOf(CharSequence, int, int)
     */
    public static int indexOf(final CharSequence seq, final int searchChar, final int startPos) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5832);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5833);if ((((isEmpty(seq))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5834)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5835)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5836);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5837);return CharSequenceUtils.indexOf(seq, searchChar, startPos);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Finds the first index within a CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String, int)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOf(null, *)          = -1
     * StringUtils.indexOf(*, null)          = -1
     * StringUtils.indexOf("", "")           = 0
     * StringUtils.indexOf("", *)            = -1 (except when * = "")
     * StringUtils.indexOf("aabaabaa", "a")  = 0
     * StringUtils.indexOf("aabaabaa", "b")  = 2
     * StringUtils.indexOf("aabaabaa", "ab") = 1
     * StringUtils.indexOf("aabaabaa", "")   = 0
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from indexOf(String, String) to indexOf(CharSequence, CharSequence)
     */
    public static int indexOf(final CharSequence seq, final CharSequence searchSeq) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5838);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5839);if ((((seq == null || searchSeq == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5840)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5841)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5842);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5843);return CharSequenceUtils.indexOf(seq, searchSeq, 0);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Finds the first index within a CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String, int)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position is treated as zero.
     * An empty ("") search CharSequence always matches.
     * A start position greater than the string length only matches
     * an empty search CharSequence.</p>
     *
     * <pre>
     * StringUtils.indexOf(null, *, *)          = -1
     * StringUtils.indexOf(*, null, *)          = -1
     * StringUtils.indexOf("", "", 0)           = 0
     * StringUtils.indexOf("", *, 0)            = -1 (except when * = "")
     * StringUtils.indexOf("aabaabaa", "a", 0)  = 0
     * StringUtils.indexOf("aabaabaa", "b", 0)  = 2
     * StringUtils.indexOf("aabaabaa", "ab", 0) = 1
     * StringUtils.indexOf("aabaabaa", "b", 3)  = 5
     * StringUtils.indexOf("aabaabaa", "b", 9)  = -1
     * StringUtils.indexOf("aabaabaa", "b", -1) = 2
     * StringUtils.indexOf("aabaabaa", "", 2)   = 2
     * StringUtils.indexOf("abc", "", 9)        = 3
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @param startPos  the start position, negative treated as zero
     * @return the first index of the search CharSequence (always &ge; startPos),
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from indexOf(String, String, int) to indexOf(CharSequence, CharSequence, int)
     */
    public static int indexOf(final CharSequence seq, final CharSequence searchSeq, final int startPos) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5844);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5845);if ((((seq == null || searchSeq == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5846)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5847)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5848);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5849);return CharSequenceUtils.indexOf(seq, searchSeq, startPos);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Finds the n-th index within a CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.ordinalIndexOf(null, *, *)          = -1
     * StringUtils.ordinalIndexOf(*, null, *)          = -1
     * StringUtils.ordinalIndexOf("", "", *)           = 0
     * StringUtils.ordinalIndexOf("aabaabaa", "a", 1)  = 0
     * StringUtils.ordinalIndexOf("aabaabaa", "a", 2)  = 1
     * StringUtils.ordinalIndexOf("aabaabaa", "b", 1)  = 2
     * StringUtils.ordinalIndexOf("aabaabaa", "b", 2)  = 5
     * StringUtils.ordinalIndexOf("aabaabaa", "ab", 1) = 1
     * StringUtils.ordinalIndexOf("aabaabaa", "ab", 2) = 4
     * StringUtils.ordinalIndexOf("aabaabaa", "", 1)   = 0
     * StringUtils.ordinalIndexOf("aabaabaa", "", 2)   = 0
     * </pre>
     *
     * <p>Note that 'head(CharSequence str, int n)' may be implemented as: </p>
     *
     * <pre>
     *   str.substring(0, lastOrdinalIndexOf(str, "\n", n))
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param ordinal  the n-th {@code searchStr} to find
     * @return the n-th index of the search CharSequence,
     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input
     * @since 2.1
     * @since 3.0 Changed signature from ordinalIndexOf(String, String, int) to ordinalIndexOf(CharSequence, CharSequence, int)
     */
    public static int ordinalIndexOf(final CharSequence str, final CharSequence searchStr, final int ordinal) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5850);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5851);return ordinalIndexOf(str, searchStr, ordinal, false);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Finds the n-th index within a String, handling {@code null}.
     * This method uses {@link String#indexOf(String)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.</p>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param ordinal  the n-th {@code searchStr} to find
     * @param lastIndex true if lastOrdinalIndexOf() otherwise false if ordinalIndexOf()
     * @return the n-th index of the search CharSequence,
     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input
     */
    // Shared code between ordinalIndexOf(String,String,int) and lastOrdinalIndexOf(String,String,int)
    private static int ordinalIndexOf(final CharSequence str, final CharSequence searchStr, final int ordinal, final boolean lastIndex) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5852);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5853);if ((((str == null || searchStr == null || ordinal <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5854)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5855)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5856);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5857);if ((((searchStr.length() == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5858)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5859)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5860);return (((lastIndex )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5861)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5862)==0&false))? str.length() : 0;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5863);int found = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(5864);int index = (((lastIndex )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5865)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5866)==0&false))? str.length() : INDEX_NOT_FOUND;
        __CLR4_4_14dm4dmldnigfmq.R.inc(5867);do {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5868);if ((((lastIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5869)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5870)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(5871);index = CharSequenceUtils.lastIndexOf(str, searchStr, index - 1);
            } }else {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(5872);index = CharSequenceUtils.indexOf(str, searchStr, index + 1);
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(5873);if ((((index < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5874)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5875)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(5876);return index;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(5877);found++;
        } }while ((((found < ordinal)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5878)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5879)==0&false)));
        __CLR4_4_14dm4dmldnigfmq.R.inc(5880);return index;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Case in-sensitive find of the first index within a CharSequence.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position is treated as zero.
     * An empty ("") search CharSequence always matches.
     * A start position greater than the string length only matches
     * an empty search CharSequence.</p>
     *
     * <pre>
     * StringUtils.indexOfIgnoreCase(null, *)          = -1
     * StringUtils.indexOfIgnoreCase(*, null)          = -1
     * StringUtils.indexOfIgnoreCase("", "")           = 0
     * StringUtils.indexOfIgnoreCase("aabaabaa", "a")  = 0
     * StringUtils.indexOfIgnoreCase("aabaabaa", "b")  = 2
     * StringUtils.indexOfIgnoreCase("aabaabaa", "ab") = 1
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} string input
     * @since 2.5
     * @since 3.0 Changed signature from indexOfIgnoreCase(String, String) to indexOfIgnoreCase(CharSequence, CharSequence)
     */
    public static int indexOfIgnoreCase(final CharSequence str, final CharSequence searchStr) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5881);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5882);return indexOfIgnoreCase(str, searchStr, 0);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Case in-sensitive find of the first index within a CharSequence
     * from the specified position.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position is treated as zero.
     * An empty ("") search CharSequence always matches.
     * A start position greater than the string length only matches
     * an empty search CharSequence.</p>
     *
     * <pre>
     * StringUtils.indexOfIgnoreCase(null, *, *)          = -1
     * StringUtils.indexOfIgnoreCase(*, null, *)          = -1
     * StringUtils.indexOfIgnoreCase("", "", 0)           = 0
     * StringUtils.indexOfIgnoreCase("aabaabaa", "A", 0)  = 0
     * StringUtils.indexOfIgnoreCase("aabaabaa", "B", 0)  = 2
     * StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 0) = 1
     * StringUtils.indexOfIgnoreCase("aabaabaa", "B", 3)  = 5
     * StringUtils.indexOfIgnoreCase("aabaabaa", "B", 9)  = -1
     * StringUtils.indexOfIgnoreCase("aabaabaa", "B", -1) = 2
     * StringUtils.indexOfIgnoreCase("aabaabaa", "", 2)   = 2
     * StringUtils.indexOfIgnoreCase("abc", "", 9)        = 3
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param startPos  the start position, negative treated as zero
     * @return the first index of the search CharSequence (always &ge; startPos),
     *  -1 if no match or {@code null} string input
     * @since 2.5
     * @since 3.0 Changed signature from indexOfIgnoreCase(String, String, int) to indexOfIgnoreCase(CharSequence, CharSequence, int)
     */
    public static int indexOfIgnoreCase(final CharSequence str, final CharSequence searchStr, int startPos) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5883);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5884);if ((((str == null || searchStr == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5885)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5886)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5887);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5888);if ((((startPos < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5889)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5890)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5891);startPos = 0;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5892);final int endLimit = str.length() - searchStr.length() + 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(5893);if ((((startPos > endLimit)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5894)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5895)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5896);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5897);if ((((searchStr.length() == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5898)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5899)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5900);return startPos;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5901);for (int i = startPos; (((i < endLimit)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5902)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5903)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5904);if ((((CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, searchStr.length()))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5905)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5906)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(5907);return i;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5908);return INDEX_NOT_FOUND;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // LastIndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the last index within a CharSequence, handling {@code null}.
     * This method uses {@link String#lastIndexOf(int)} if possible.</p>
     *
     * <p>A {@code null} or empty ("") CharSequence will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.lastIndexOf(null, *)         = -1
     * StringUtils.lastIndexOf("", *)           = -1
     * StringUtils.lastIndexOf("aabaabaa", 'a') = 7
     * StringUtils.lastIndexOf("aabaabaa", 'b') = 5
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @return the last index of the search character,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from lastIndexOf(String, int) to lastIndexOf(CharSequence, int)
     */
    public static int lastIndexOf(final CharSequence seq, final int searchChar) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5909);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5910);if ((((isEmpty(seq))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5911)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5912)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5913);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5914);return CharSequenceUtils.lastIndexOf(seq, searchChar, seq.length());
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Finds the last index within a CharSequence from a start position,
     * handling {@code null}.
     * This method uses {@link String#lastIndexOf(int, int)} if possible.</p>
     *
     * <p>A {@code null} or empty ("") CharSequence will return {@code -1}.
     * A negative start position returns {@code -1}.
     * A start position greater than the string length searches the whole string.
     * The search starts at the startPos and works backwards; matches starting after the start
     * position are ignored.
     * </p>
     *
     * <pre>
     * StringUtils.lastIndexOf(null, *, *)          = -1
     * StringUtils.lastIndexOf("", *,  *)           = -1
     * StringUtils.lastIndexOf("aabaabaa", 'b', 8)  = 5
     * StringUtils.lastIndexOf("aabaabaa", 'b', 4)  = 2
     * StringUtils.lastIndexOf("aabaabaa", 'b', 0)  = -1
     * StringUtils.lastIndexOf("aabaabaa", 'b', 9)  = 5
     * StringUtils.lastIndexOf("aabaabaa", 'b', -1) = -1
     * StringUtils.lastIndexOf("aabaabaa", 'a', 0)  = 0
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @param startPos  the start position
     * @return the last index of the search character (always &le; startPos),
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from lastIndexOf(String, int, int) to lastIndexOf(CharSequence, int, int)
     */
    public static int lastIndexOf(final CharSequence seq, final int searchChar, final int startPos) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5915);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5916);if ((((isEmpty(seq))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5917)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5918)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5919);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5920);return CharSequenceUtils.lastIndexOf(seq, searchChar, startPos);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Finds the last index within a CharSequence, handling {@code null}.
     * This method uses {@link String#lastIndexOf(String)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.lastIndexOf(null, *)          = -1
     * StringUtils.lastIndexOf(*, null)          = -1
     * StringUtils.lastIndexOf("", "")           = 0
     * StringUtils.lastIndexOf("aabaabaa", "a")  = 7
     * StringUtils.lastIndexOf("aabaabaa", "b")  = 5
     * StringUtils.lastIndexOf("aabaabaa", "ab") = 4
     * StringUtils.lastIndexOf("aabaabaa", "")   = 8
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @return the last index of the search String,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from lastIndexOf(String, String) to lastIndexOf(CharSequence, CharSequence)
     */
    public static int lastIndexOf(final CharSequence seq, final CharSequence searchSeq) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5921);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5922);if ((((seq == null || searchSeq == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5923)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5924)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5925);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5926);return CharSequenceUtils.lastIndexOf(seq, searchSeq, seq.length());
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Finds the n-th last index within a String, handling {@code null}.
     * This method uses {@link String#lastIndexOf(String)}.</p>
     *
     * <p>A {@code null} String will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.lastOrdinalIndexOf(null, *, *)          = -1
     * StringUtils.lastOrdinalIndexOf(*, null, *)          = -1
     * StringUtils.lastOrdinalIndexOf("", "", *)           = 0
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 1)  = 7
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 2)  = 6
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 1)  = 5
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 2)  = 2
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 1) = 4
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 2) = 1
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1)   = 8
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "", 2)   = 8
     * </pre>
     *
     * <p>Note that 'tail(CharSequence str, int n)' may be implemented as: </p>
     *
     * <pre>
     *   str.substring(lastOrdinalIndexOf(str, "\n", n) + 1)
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param ordinal  the n-th last {@code searchStr} to find
     * @return the n-th last index of the search CharSequence,
     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input
     * @since 2.5
     * @since 3.0 Changed signature from lastOrdinalIndexOf(String, String, int) to lastOrdinalIndexOf(CharSequence, CharSequence, int)
     */
    public static int lastOrdinalIndexOf(final CharSequence str, final CharSequence searchStr, final int ordinal) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5927);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5928);return ordinalIndexOf(str, searchStr, ordinal, true);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Finds the last index within a CharSequence, handling {@code null}.
     * This method uses {@link String#lastIndexOf(String, int)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position returns {@code -1}.
     * An empty ("") search CharSequence always matches unless the start position is negative.
     * A start position greater than the string length searches the whole string.
     * The search starts at the startPos and works backwards; matches starting after the start
     * position are ignored.
     * </p>
     *
     * <pre>
     * StringUtils.lastIndexOf(null, *, *)          = -1
     * StringUtils.lastIndexOf(*, null, *)          = -1
     * StringUtils.lastIndexOf("aabaabaa", "a", 8)  = 7
     * StringUtils.lastIndexOf("aabaabaa", "b", 8)  = 5
     * StringUtils.lastIndexOf("aabaabaa", "ab", 8) = 4
     * StringUtils.lastIndexOf("aabaabaa", "b", 9)  = 5
     * StringUtils.lastIndexOf("aabaabaa", "b", -1) = -1
     * StringUtils.lastIndexOf("aabaabaa", "a", 0)  = 0
     * StringUtils.lastIndexOf("aabaabaa", "b", 0)  = -1
     * StringUtils.lastIndexOf("aabaabaa", "b", 1)  = -1
     * StringUtils.lastIndexOf("aabaabaa", "b", 2)  = 2
     * StringUtils.lastIndexOf("aabaabaa", "ba", 2)  = -1
     * StringUtils.lastIndexOf("aabaabaa", "ba", 2)  = 2
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @param startPos  the start position, negative treated as zero
     * @return the last index of the search CharSequence (always &le; startPos),
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from lastIndexOf(String, String, int) to lastIndexOf(CharSequence, CharSequence, int)
     */
    public static int lastIndexOf(final CharSequence seq, final CharSequence searchSeq, final int startPos) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5929);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5930);if ((((seq == null || searchSeq == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5931)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5932)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5933);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5934);return CharSequenceUtils.lastIndexOf(seq, searchSeq, startPos);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Case in-sensitive find of the last index within a CharSequence.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position returns {@code -1}.
     * An empty ("") search CharSequence always matches unless the start position is negative.
     * A start position greater than the string length searches the whole string.</p>
     *
     * <pre>
     * StringUtils.lastIndexOfIgnoreCase(null, *)          = -1
     * StringUtils.lastIndexOfIgnoreCase(*, null)          = -1
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A")  = 7
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B")  = 5
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB") = 4
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} string input
     * @since 2.5
     * @since 3.0 Changed signature from lastIndexOfIgnoreCase(String, String) to lastIndexOfIgnoreCase(CharSequence, CharSequence)
     */
    public static int lastIndexOfIgnoreCase(final CharSequence str, final CharSequence searchStr) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5935);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5936);if ((((str == null || searchStr == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5937)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5938)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5939);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5940);return lastIndexOfIgnoreCase(str, searchStr, str.length());
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Case in-sensitive find of the last index within a CharSequence
     * from the specified position.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position returns {@code -1}.
     * An empty ("") search CharSequence always matches unless the start position is negative.
     * A start position greater than the string length searches the whole string.
     * The search starts at the startPos and works backwards; matches starting after the start
     * position are ignored.
     * </p>
     *
     * <pre>
     * StringUtils.lastIndexOfIgnoreCase(null, *, *)          = -1
     * StringUtils.lastIndexOfIgnoreCase(*, null, *)          = -1
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 8)  = 7
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 8)  = 5
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB", 8) = 4
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 9)  = 5
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", -1) = -1
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 0)  = 0
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 0)  = -1
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param startPos  the start position
     * @return the last index of the search CharSequence (always &le; startPos),
     *  -1 if no match or {@code null} input
     * @since 2.5
     * @since 3.0 Changed signature from lastIndexOfIgnoreCase(String, String, int) to lastIndexOfIgnoreCase(CharSequence, CharSequence, int)
     */
    public static int lastIndexOfIgnoreCase(final CharSequence str, final CharSequence searchStr, int startPos) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5941);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5942);if ((((str == null || searchStr == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5943)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5944)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5945);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5946);if ((((startPos > str.length() - searchStr.length())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5947)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5948)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5949);startPos = str.length() - searchStr.length();
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5950);if ((((startPos < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5951)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5952)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5953);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5954);if ((((searchStr.length() == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5955)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5956)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5957);return startPos;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(5958);for (int i = startPos; (((i >= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5959)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5960)==0&false)); i--) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5961);if ((((CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, searchStr.length()))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5962)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5963)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(5964);return i;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5965);return INDEX_NOT_FOUND;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Contains
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if CharSequence contains a search character, handling {@code null}.
     * This method uses {@link String#indexOf(int)} if possible.</p>
     *
     * <p>A {@code null} or empty ("") CharSequence will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.contains(null, *)    = false
     * StringUtils.contains("", *)      = false
     * StringUtils.contains("abc", 'a') = true
     * StringUtils.contains("abc", 'z') = false
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @return true if the CharSequence contains the search character,
     *  false if not or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from contains(String, int) to contains(CharSequence, int)
     */
    public static boolean contains(final CharSequence seq, final int searchChar) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5966);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5967);if ((((isEmpty(seq))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5968)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5969)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5970);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5971);return CharSequenceUtils.indexOf(seq, searchChar, 0) >= 0;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if CharSequence contains a search CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.contains(null, *)     = false
     * StringUtils.contains(*, null)     = false
     * StringUtils.contains("", "")      = true
     * StringUtils.contains("abc", "")   = true
     * StringUtils.contains("abc", "a")  = true
     * StringUtils.contains("abc", "z")  = false
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @return true if the CharSequence contains the search CharSequence,
     *  false if not or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from contains(String, String) to contains(CharSequence, CharSequence)
     */
    public static boolean contains(final CharSequence seq, final CharSequence searchSeq) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5972);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5973);if ((((seq == null || searchSeq == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5974)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5975)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5976);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5977);return CharSequenceUtils.indexOf(seq, searchSeq, 0) >= 0;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if CharSequence contains a search CharSequence irrespective of case,
     * handling {@code null}. Case-insensitivity is defined as by
     * {@link String#equalsIgnoreCase(String)}.
     *
     * <p>A {@code null} CharSequence will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.contains(null, *) = false
     * StringUtils.contains(*, null) = false
     * StringUtils.contains("", "") = true
     * StringUtils.contains("abc", "") = true
     * StringUtils.contains("abc", "a") = true
     * StringUtils.contains("abc", "z") = false
     * StringUtils.contains("abc", "A") = true
     * StringUtils.contains("abc", "Z") = false
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @return true if the CharSequence contains the search CharSequence irrespective of
     * case or false if not or {@code null} string input
     * @since 3.0 Changed signature from containsIgnoreCase(String, String) to containsIgnoreCase(CharSequence, CharSequence)
     */
    public static boolean containsIgnoreCase(final CharSequence str, final CharSequence searchStr) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5978);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5979);if ((((str == null || searchStr == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5980)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5981)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5982);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5983);final int len = searchStr.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(5984);final int max = str.length() - len;
        __CLR4_4_14dm4dmldnigfmq.R.inc(5985);for (int i = 0; (((i <= max)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5986)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5987)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5988);if ((((CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, len))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5989)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5990)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(5991);return true;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5992);return false;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Check whether the given CharSequence contains any whitespace characters.
     * @param seq the CharSequence to check (may be {@code null})
     * @return {@code true} if the CharSequence is not empty and
     * contains at least 1 whitespace character
     * @see java.lang.Character#isWhitespace
     * @since 3.0
     */
    // From org.springframework.util.StringUtils, under Apache License 2.0
    public static boolean containsWhitespace(final CharSequence seq) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(5993);
        __CLR4_4_14dm4dmldnigfmq.R.inc(5994);if ((((isEmpty(seq))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(5995)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(5996)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(5997);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(5998);final int strLen = seq.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(5999);for (int i = 0; (((i < strLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6000)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6001)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6002);if ((((Character.isWhitespace(seq.charAt(i)))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6003)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6004)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6005);return true;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6006);return false;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // IndexOfAny chars
    //-----------------------------------------------------------------------
    /**
     * <p>Search a CharSequence to find the first index of any
     * character in the given set of characters.</p>
     *
     * <p>A {@code null} String will return {@code -1}.
     * A {@code null} or zero length search array will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOfAny(null, *)                = -1
     * StringUtils.indexOfAny("", *)                  = -1
     * StringUtils.indexOfAny(*, null)                = -1
     * StringUtils.indexOfAny(*, [])                  = -1
     * StringUtils.indexOfAny("zzabyycdxx",['z','a']) = 0
     * StringUtils.indexOfAny("zzabyycdxx",['b','y']) = 3
     * StringUtils.indexOfAny("aba", ['z'])           = -1
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     * @since 3.0 Changed signature from indexOfAny(String, char[]) to indexOfAny(CharSequence, char...)
     */
    public static int indexOfAny(final CharSequence cs, final char... searchChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6007);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6008);if ((((isEmpty(cs) || ArrayUtils.isEmpty(searchChars))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6009)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6010)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6011);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6012);final int csLen = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6013);final int csLast = csLen - 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6014);final int searchLen = searchChars.length;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6015);final int searchLast = searchLen - 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6016);for (int i = 0; (((i < csLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6017)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6018)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6019);final char ch = cs.charAt(i);
            __CLR4_4_14dm4dmldnigfmq.R.inc(6020);for (int j = 0; (((j < searchLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6021)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6022)==0&false)); j++) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6023);if ((((searchChars[j] == ch)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6024)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6025)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6026);if ((((i < csLast && j < searchLast && Character.isHighSurrogate(ch))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6027)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6028)==0&false))) {{
                        // ch is a supplementary character
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6029);if ((((searchChars[j + 1] == cs.charAt(i + 1))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6030)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6031)==0&false))) {{
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6032);return i;
                        }
                    }} }else {{
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6033);return i;
                    }
                }}
            }}
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6034);return INDEX_NOT_FOUND;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Search a CharSequence to find the first index of any
     * character in the given set of characters.</p>
     *
     * <p>A {@code null} String will return {@code -1}.
     * A {@code null} search string will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOfAny(null, *)            = -1
     * StringUtils.indexOfAny("", *)              = -1
     * StringUtils.indexOfAny(*, null)            = -1
     * StringUtils.indexOfAny(*, "")              = -1
     * StringUtils.indexOfAny("zzabyycdxx", "za") = 0
     * StringUtils.indexOfAny("zzabyycdxx", "by") = 3
     * StringUtils.indexOfAny("aba","z")          = -1
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     * @since 3.0 Changed signature from indexOfAny(String, String) to indexOfAny(CharSequence, String)
     */
    public static int indexOfAny(final CharSequence cs, final String searchChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6035);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6036);if ((((isEmpty(cs) || isEmpty(searchChars))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6037)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6038)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6039);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6040);return indexOfAny(cs, searchChars.toCharArray());
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // ContainsAny
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if the CharSequence contains any character in the given
     * set of characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.
     * A {@code null} or zero length search array will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.containsAny(null, *)                = false
     * StringUtils.containsAny("", *)                  = false
     * StringUtils.containsAny(*, null)                = false
     * StringUtils.containsAny(*, [])                  = false
     * StringUtils.containsAny("zzabyycdxx",['z','a']) = true
     * StringUtils.containsAny("zzabyycdxx",['b','y']) = true
     * StringUtils.containsAny("aba", ['z'])           = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the {@code true} if any of the chars are found,
     * {@code false} if no match or null input
     * @since 2.4
     * @since 3.0 Changed signature from containsAny(String, char[]) to containsAny(CharSequence, char...)
     */
    public static boolean containsAny(final CharSequence cs, final char... searchChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6041);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6042);if ((((isEmpty(cs) || ArrayUtils.isEmpty(searchChars))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6043)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6044)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6045);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6046);final int csLength = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6047);final int searchLength = searchChars.length;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6048);final int csLast = csLength - 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6049);final int searchLast = searchLength - 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6050);for (int i = 0; (((i < csLength)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6051)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6052)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6053);final char ch = cs.charAt(i);
            __CLR4_4_14dm4dmldnigfmq.R.inc(6054);for (int j = 0; (((j < searchLength)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6055)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6056)==0&false)); j++) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6057);if ((((searchChars[j] == ch)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6058)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6059)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6060);if ((((Character.isHighSurrogate(ch))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6061)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6062)==0&false))) {{
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6063);if ((((j == searchLast)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6064)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6065)==0&false))) {{
                            // missing low surrogate, fine, like String.indexOf(String)
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6066);return true;
                        }
                        }__CLR4_4_14dm4dmldnigfmq.R.inc(6067);if ((((i < csLast && searchChars[j + 1] == cs.charAt(i + 1))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6068)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6069)==0&false))) {{
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6070);return true;
                        }
                    }} }else {{
                        // ch is in the Basic Multilingual Plane
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6071);return true;
                    }
                }}
            }}
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6072);return false;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Checks if the CharSequence contains any character in the given set of characters.
     * </p>
     *
     * <p>
     * A {@code null} CharSequence will return {@code false}. A {@code null} search CharSequence will return
     * {@code false}.
     * </p>
     *
     * <pre>
     * StringUtils.containsAny(null, *)            = false
     * StringUtils.containsAny("", *)              = false
     * StringUtils.containsAny(*, null)            = false
     * StringUtils.containsAny(*, "")              = false
     * StringUtils.containsAny("zzabyycdxx", "za") = true
     * StringUtils.containsAny("zzabyycdxx", "by") = true
     * StringUtils.containsAny("aba","z")          = false
     * </pre>
     *
     * @param cs
     *            the CharSequence to check, may be null
     * @param searchChars
     *            the chars to search for, may be null
     * @return the {@code true} if any of the chars are found, {@code false} if no match or null input
     * @since 2.4
     * @since 3.0 Changed signature from containsAny(String, String) to containsAny(CharSequence, CharSequence)
     */
    public static boolean containsAny(final CharSequence cs, final CharSequence searchChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6073);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6074);if ((((searchChars == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6075)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6076)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6077);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6078);return containsAny(cs, CharSequenceUtils.toCharArray(searchChars));
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // IndexOfAnyBut chars
    //-----------------------------------------------------------------------
    /**
     * <p>Searches a CharSequence to find the first index of any
     * character not in the given set of characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A {@code null} or zero length search array will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOfAnyBut(null, *)                              = -1
     * StringUtils.indexOfAnyBut("", *)                                = -1
     * StringUtils.indexOfAnyBut(*, null)                              = -1
     * StringUtils.indexOfAnyBut(*, [])                                = -1
     * StringUtils.indexOfAnyBut("zzabyycdxx", new char[] {'z', 'a'} ) = 3
     * StringUtils.indexOfAnyBut("aba", new char[] {'z'} )             = 0
     * StringUtils.indexOfAnyBut("aba", new char[] {'a', 'b'} )        = -1

     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     * @since 3.0 Changed signature from indexOfAnyBut(String, char[]) to indexOfAnyBut(CharSequence, char...)
     */
    public static int indexOfAnyBut(final CharSequence cs, final char... searchChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6079);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6080);if ((((isEmpty(cs) || ArrayUtils.isEmpty(searchChars))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6081)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6082)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6083);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6084);final int csLen = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6085);final int csLast = csLen - 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6086);final int searchLen = searchChars.length;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6087);final int searchLast = searchLen - 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6088);outer:
        for (int i = 0; (((i < csLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6089)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6090)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6091);final char ch = cs.charAt(i);
            __CLR4_4_14dm4dmldnigfmq.R.inc(6092);for (int j = 0; (((j < searchLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6093)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6094)==0&false)); j++) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6095);if ((((searchChars[j] == ch)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6096)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6097)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6098);if ((((i < csLast && j < searchLast && Character.isHighSurrogate(ch))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6099)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6100)==0&false))) {{
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6101);if ((((searchChars[j + 1] == cs.charAt(i + 1))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6102)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6103)==0&false))) {{
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6104);continue outer;
                        }
                    }} }else {{
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6105);continue outer;
                    }
                }}
            }}
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6106);return i;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6107);return INDEX_NOT_FOUND;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Search a CharSequence to find the first index of any
     * character not in the given set of characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A {@code null} or empty search string will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOfAnyBut(null, *)            = -1
     * StringUtils.indexOfAnyBut("", *)              = -1
     * StringUtils.indexOfAnyBut(*, null)            = -1
     * StringUtils.indexOfAnyBut(*, "")              = -1
     * StringUtils.indexOfAnyBut("zzabyycdxx", "za") = 3
     * StringUtils.indexOfAnyBut("zzabyycdxx", "")   = -1
     * StringUtils.indexOfAnyBut("aba","ab")         = -1
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     * @since 3.0 Changed signature from indexOfAnyBut(String, String) to indexOfAnyBut(CharSequence, CharSequence)
     */
    public static int indexOfAnyBut(final CharSequence seq, final CharSequence searchChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6108);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6109);if ((((isEmpty(seq) || isEmpty(searchChars))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6110)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6111)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6112);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6113);final int strLen = seq.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6114);for (int i = 0; (((i < strLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6115)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6116)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6117);final char ch = seq.charAt(i);
            __CLR4_4_14dm4dmldnigfmq.R.inc(6118);final boolean chFound = CharSequenceUtils.indexOf(searchChars, ch, 0) >= 0;
            __CLR4_4_14dm4dmldnigfmq.R.inc(6119);if ((((i + 1 < strLen && Character.isHighSurrogate(ch))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6120)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6121)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6122);final char ch2 = seq.charAt(i + 1);
                __CLR4_4_14dm4dmldnigfmq.R.inc(6123);if ((((chFound && CharSequenceUtils.indexOf(searchChars, ch2, 0) < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6124)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6125)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6126);return i;
                }
            }} }else {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6127);if ((((!chFound)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6128)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6129)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6130);return i;
                }
            }}
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6131);return INDEX_NOT_FOUND;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // ContainsOnly
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if the CharSequence contains only certain characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.
     * A {@code null} valid character array will return {@code false}.
     * An empty CharSequence (length()=0) always returns {@code true}.</p>
     *
     * <pre>
     * StringUtils.containsOnly(null, *)       = false
     * StringUtils.containsOnly(*, null)       = false
     * StringUtils.containsOnly("", *)         = true
     * StringUtils.containsOnly("ab", '')      = false
     * StringUtils.containsOnly("abab", 'abc') = true
     * StringUtils.containsOnly("ab1", 'abc')  = false
     * StringUtils.containsOnly("abz", 'abc')  = false
     * </pre>
     *
     * @param cs  the String to check, may be null
     * @param valid  an array of valid chars, may be null
     * @return true if it only contains valid chars and is non-null
     * @since 3.0 Changed signature from containsOnly(String, char[]) to containsOnly(CharSequence, char...)
     */
    public static boolean containsOnly(final CharSequence cs, final char... valid) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6132);
        // All these pre-checks are to maintain API with an older version
        __CLR4_4_14dm4dmldnigfmq.R.inc(6133);if ((((valid == null || cs == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6134)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6135)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6136);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6137);if ((((cs.length() == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6138)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6139)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6140);return true;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6141);if ((((valid.length == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6142)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6143)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6144);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6145);return indexOfAnyBut(cs, valid) == INDEX_NOT_FOUND;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only certain characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.
     * A {@code null} valid character String will return {@code false}.
     * An empty String (length()=0) always returns {@code true}.</p>
     *
     * <pre>
     * StringUtils.containsOnly(null, *)       = false
     * StringUtils.containsOnly(*, null)       = false
     * StringUtils.containsOnly("", *)         = true
     * StringUtils.containsOnly("ab", "")      = false
     * StringUtils.containsOnly("abab", "abc") = true
     * StringUtils.containsOnly("ab1", "abc")  = false
     * StringUtils.containsOnly("abz", "abc")  = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param validChars  a String of valid chars, may be null
     * @return true if it only contains valid chars and is non-null
     * @since 2.0
     * @since 3.0 Changed signature from containsOnly(String, String) to containsOnly(CharSequence, String)
     */
    public static boolean containsOnly(final CharSequence cs, final String validChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6146);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6147);if ((((cs == null || validChars == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6148)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6149)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6150);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6151);return containsOnly(cs, validChars.toCharArray());
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // ContainsNone
    //-----------------------------------------------------------------------
    /**
     * <p>Checks that the CharSequence does not contain certain characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code true}.
     * A {@code null} invalid character array will return {@code true}.
     * An empty CharSequence (length()=0) always returns true.</p>
     *
     * <pre>
     * StringUtils.containsNone(null, *)       = true
     * StringUtils.containsNone(*, null)       = true
     * StringUtils.containsNone("", *)         = true
     * StringUtils.containsNone("ab", '')      = true
     * StringUtils.containsNone("abab", 'xyz') = true
     * StringUtils.containsNone("ab1", 'xyz')  = true
     * StringUtils.containsNone("abz", 'xyz')  = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  an array of invalid chars, may be null
     * @return true if it contains none of the invalid chars, or is null
     * @since 2.0
     * @since 3.0 Changed signature from containsNone(String, char[]) to containsNone(CharSequence, char...)
     */
    public static boolean containsNone(final CharSequence cs, final char... searchChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6152);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6153);if ((((cs == null || searchChars == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6154)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6155)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6156);return true;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6157);final int csLen = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6158);final int csLast = csLen - 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6159);final int searchLen = searchChars.length;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6160);final int searchLast = searchLen - 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6161);for (int i = 0; (((i < csLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6162)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6163)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6164);final char ch = cs.charAt(i);
            __CLR4_4_14dm4dmldnigfmq.R.inc(6165);for (int j = 0; (((j < searchLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6166)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6167)==0&false)); j++) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6168);if ((((searchChars[j] == ch)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6169)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6170)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6171);if ((((Character.isHighSurrogate(ch))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6172)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6173)==0&false))) {{
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6174);if ((((j == searchLast)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6175)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6176)==0&false))) {{
                            // missing low surrogate, fine, like String.indexOf(String)
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6177);return false;
                        }
                        }__CLR4_4_14dm4dmldnigfmq.R.inc(6178);if ((((i < csLast && searchChars[j + 1] == cs.charAt(i + 1))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6179)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6180)==0&false))) {{
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6181);return false;
                        }
                    }} }else {{
                        // ch is in the Basic Multilingual Plane
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6182);return false;
                    }
                }}
            }}
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6183);return true;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks that the CharSequence does not contain certain characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code true}.
     * A {@code null} invalid character array will return {@code true}.
     * An empty String ("") always returns true.</p>
     *
     * <pre>
     * StringUtils.containsNone(null, *)       = true
     * StringUtils.containsNone(*, null)       = true
     * StringUtils.containsNone("", *)         = true
     * StringUtils.containsNone("ab", "")      = true
     * StringUtils.containsNone("abab", "xyz") = true
     * StringUtils.containsNone("ab1", "xyz")  = true
     * StringUtils.containsNone("abz", "xyz")  = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param invalidChars  a String of invalid chars, may be null
     * @return true if it contains none of the invalid chars, or is null
     * @since 2.0
     * @since 3.0 Changed signature from containsNone(String, String) to containsNone(CharSequence, String)
     */
    public static boolean containsNone(final CharSequence cs, final String invalidChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6184);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6185);if ((((cs == null || invalidChars == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6186)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6187)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6188);return true;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6189);return containsNone(cs, invalidChars.toCharArray());
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // IndexOfAny strings
    //-----------------------------------------------------------------------
    /**
     * <p>Find the first index of any of a set of potential substrings.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A {@code null} or zero length search array will return {@code -1}.
     * A {@code null} search array entry will be ignored, but a search
     * array containing "" will return {@code 0} if {@code str} is not
     * null. This method uses {@link String#indexOf(String)} if possible.</p>
     *
     * <pre>
     * StringUtils.indexOfAny(null, *)                     = -1
     * StringUtils.indexOfAny(*, null)                     = -1
     * StringUtils.indexOfAny(*, [])                       = -1
     * StringUtils.indexOfAny("zzabyycdxx", ["ab","cd"])   = 2
     * StringUtils.indexOfAny("zzabyycdxx", ["cd","ab"])   = 2
     * StringUtils.indexOfAny("zzabyycdxx", ["mn","op"])   = -1
     * StringUtils.indexOfAny("zzabyycdxx", ["zab","aby"]) = 1
     * StringUtils.indexOfAny("zzabyycdxx", [""])          = 0
     * StringUtils.indexOfAny("", [""])                    = 0
     * StringUtils.indexOfAny("", ["a"])                   = -1
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStrs  the CharSequences to search for, may be null
     * @return the first index of any of the searchStrs in str, -1 if no match
     * @since 3.0 Changed signature from indexOfAny(String, String[]) to indexOfAny(CharSequence, CharSequence...)
     */
    public static int indexOfAny(final CharSequence str, final CharSequence... searchStrs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6190);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6191);if ((((str == null || searchStrs == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6192)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6193)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6194);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6195);final int sz = searchStrs.length;

        // String's can't have a MAX_VALUEth index.
        __CLR4_4_14dm4dmldnigfmq.R.inc(6196);int ret = Integer.MAX_VALUE;

        __CLR4_4_14dm4dmldnigfmq.R.inc(6197);int tmp = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6198);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6199)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6200)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6201);final CharSequence search = searchStrs[i];
            __CLR4_4_14dm4dmldnigfmq.R.inc(6202);if ((((search == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6203)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6204)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6205);continue;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6206);tmp = CharSequenceUtils.indexOf(str, search, 0);
            __CLR4_4_14dm4dmldnigfmq.R.inc(6207);if ((((tmp == INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6208)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6209)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6210);continue;
            }

            }__CLR4_4_14dm4dmldnigfmq.R.inc(6211);if ((((tmp < ret)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6212)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6213)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6214);ret = tmp;
            }
        }}

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6215);return (((ret == Integer.MAX_VALUE )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6216)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6217)==0&false))? INDEX_NOT_FOUND : ret;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Find the latest index of any of a set of potential substrings.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A {@code null} search array will return {@code -1}.
     * A {@code null} or zero length search array entry will be ignored,
     * but a search array containing "" will return the length of {@code str}
     * if {@code str} is not null. This method uses {@link String#indexOf(String)} if possible</p>
     *
     * <pre>
     * StringUtils.lastIndexOfAny(null, *)                   = -1
     * StringUtils.lastIndexOfAny(*, null)                   = -1
     * StringUtils.lastIndexOfAny(*, [])                     = -1
     * StringUtils.lastIndexOfAny(*, [null])                 = -1
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["ab","cd"]) = 6
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["cd","ab"]) = 6
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["mn","op"]) = -1
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["mn","op"]) = -1
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["mn",""])   = 10
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStrs  the CharSequences to search for, may be null
     * @return the last index of any of the CharSequences, -1 if no match
     * @since 3.0 Changed signature from lastIndexOfAny(String, String[]) to lastIndexOfAny(CharSequence, CharSequence)
     */
    public static int lastIndexOfAny(final CharSequence str, final CharSequence... searchStrs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6218);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6219);if ((((str == null || searchStrs == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6220)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6221)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6222);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6223);final int sz = searchStrs.length;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6224);int ret = INDEX_NOT_FOUND;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6225);int tmp = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6226);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6227)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6228)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6229);final CharSequence search = searchStrs[i];
            __CLR4_4_14dm4dmldnigfmq.R.inc(6230);if ((((search == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6231)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6232)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6233);continue;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6234);tmp = CharSequenceUtils.lastIndexOf(str, search, str.length());
            __CLR4_4_14dm4dmldnigfmq.R.inc(6235);if ((((tmp > ret)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6236)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6237)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6238);ret = tmp;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6239);return ret;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Substring
    //-----------------------------------------------------------------------
    /**
     * <p>Gets a substring from the specified String avoiding exceptions.</p>
     *
     * <p>A negative start position can be used to start {@code n}
     * characters from the end of the String.</p>
     *
     * <p>A {@code null} String will return {@code null}.
     * An empty ("") String will return "".</p>
     *
     * <pre>
     * StringUtils.substring(null, *)   = null
     * StringUtils.substring("", *)     = ""
     * StringUtils.substring("abc", 0)  = "abc"
     * StringUtils.substring("abc", 2)  = "c"
     * StringUtils.substring("abc", 4)  = ""
     * StringUtils.substring("abc", -2) = "bc"
     * StringUtils.substring("abc", -4) = "abc"
     * </pre>
     *
     * @param str  the String to get the substring from, may be null
     * @param start  the position to start from, negative means
     *  count back from the end of the String by this many characters
     * @return substring from start position, {@code null} if null String input
     */
    public static String substring(final String str, int start) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6240);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6241);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6242)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6243)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6244);return null;
        }

        // handle negatives, which means last n characters
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6245);if ((((start < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6246)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6247)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6248);start = str.length() + start; // remember start is negative
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6249);if ((((start < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6250)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6251)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6252);start = 0;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6253);if ((((start > str.length())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6254)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6255)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6256);return EMPTY;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6257);return str.substring(start);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Gets a substring from the specified String avoiding exceptions.</p>
     *
     * <p>A negative start position can be used to start/end {@code n}
     * characters from the end of the String.</p>
     *
     * <p>The returned substring starts with the character in the {@code start}
     * position and ends before the {@code end} position. All position counting is
     * zero-based -- i.e., to start at the beginning of the string use
     * {@code start = 0}. Negative start and end positions can be used to
     * specify offsets relative to the end of the String.</p>
     *
     * <p>If {@code start} is not strictly to the left of {@code end}, ""
     * is returned.</p>
     *
     * <pre>
     * StringUtils.substring(null, *, *)    = null
     * StringUtils.substring("", * ,  *)    = "";
     * StringUtils.substring("abc", 0, 2)   = "ab"
     * StringUtils.substring("abc", 2, 0)   = ""
     * StringUtils.substring("abc", 2, 4)   = "c"
     * StringUtils.substring("abc", 4, 6)   = ""
     * StringUtils.substring("abc", 2, 2)   = ""
     * StringUtils.substring("abc", -2, -1) = "b"
     * StringUtils.substring("abc", -4, 2)  = "ab"
     * </pre>
     *
     * @param str  the String to get the substring from, may be null
     * @param start  the position to start from, negative means
     *  count back from the end of the String by this many characters
     * @param end  the position to end at (exclusive), negative means
     *  count back from the end of the String by this many characters
     * @return substring from start position to end position,
     *  {@code null} if null String input
     */
    public static String substring(final String str, int start, int end) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6258);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6259);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6260)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6261)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6262);return null;
        }

        // handle negatives
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6263);if ((((end < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6264)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6265)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6266);end = str.length() + end; // remember end is negative
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6267);if ((((start < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6268)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6269)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6270);start = str.length() + start; // remember start is negative
        }

        // check length next
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6271);if ((((end > str.length())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6272)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6273)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6274);end = str.length();
        }

        // if start is greater than end, return ""
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6275);if ((((start > end)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6276)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6277)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6278);return EMPTY;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6279);if ((((start < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6280)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6281)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6282);start = 0;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6283);if ((((end < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6284)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6285)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6286);end = 0;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6287);return str.substring(start, end);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Left/Right/Mid
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the leftmost {@code len} characters of a String.</p>
     *
     * <p>If {@code len} characters are not available, or the
     * String is {@code null}, the String will be returned without
     * an exception. An empty String is returned if len is negative.</p>
     *
     * <pre>
     * StringUtils.left(null, *)    = null
     * StringUtils.left(*, -ve)     = ""
     * StringUtils.left("", *)      = ""
     * StringUtils.left("abc", 0)   = ""
     * StringUtils.left("abc", 2)   = "ab"
     * StringUtils.left("abc", 4)   = "abc"
     * </pre>
     *
     * @param str  the String to get the leftmost characters from, may be null
     * @param len  the length of the required String
     * @return the leftmost characters, {@code null} if null String input
     */
    public static String left(final String str, final int len) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6288);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6289);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6290)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6291)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6292);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6293);if ((((len < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6294)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6295)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6296);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6297);if ((((str.length() <= len)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6298)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6299)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6300);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6301);return str.substring(0, len);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Gets the rightmost {@code len} characters of a String.</p>
     *
     * <p>If {@code len} characters are not available, or the String
     * is {@code null}, the String will be returned without an
     * an exception. An empty String is returned if len is negative.</p>
     *
     * <pre>
     * StringUtils.right(null, *)    = null
     * StringUtils.right(*, -ve)     = ""
     * StringUtils.right("", *)      = ""
     * StringUtils.right("abc", 0)   = ""
     * StringUtils.right("abc", 2)   = "bc"
     * StringUtils.right("abc", 4)   = "abc"
     * </pre>
     *
     * @param str  the String to get the rightmost characters from, may be null
     * @param len  the length of the required String
     * @return the rightmost characters, {@code null} if null String input
     */
    public static String right(final String str, final int len) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6302);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6303);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6304)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6305)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6306);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6307);if ((((len < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6308)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6309)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6310);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6311);if ((((str.length() <= len)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6312)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6313)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6314);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6315);return str.substring(str.length() - len);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Gets {@code len} characters from the middle of a String.</p>
     *
     * <p>If {@code len} characters are not available, the remainder
     * of the String will be returned without an exception. If the
     * String is {@code null}, {@code null} will be returned.
     * An empty String is returned if len is negative or exceeds the
     * length of {@code str}.</p>
     *
     * <pre>
     * StringUtils.mid(null, *, *)    = null
     * StringUtils.mid(*, *, -ve)     = ""
     * StringUtils.mid("", 0, *)      = ""
     * StringUtils.mid("abc", 0, 2)   = "ab"
     * StringUtils.mid("abc", 0, 4)   = "abc"
     * StringUtils.mid("abc", 2, 4)   = "c"
     * StringUtils.mid("abc", 4, 2)   = ""
     * StringUtils.mid("abc", -2, 2)  = "ab"
     * </pre>
     *
     * @param str  the String to get the characters from, may be null
     * @param pos  the position to start from, negative treated as zero
     * @param len  the length of the required String
     * @return the middle characters, {@code null} if null String input
     */
    public static String mid(final String str, int pos, final int len) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6316);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6317);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6318)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6319)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6320);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6321);if ((((len < 0 || pos > str.length())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6322)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6323)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6324);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6325);if ((((pos < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6326)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6327)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6328);pos = 0;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6329);if ((((str.length() <= pos + len)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6330)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6331)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6332);return str.substring(pos);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6333);return str.substring(pos, pos + len);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // SubStringAfter/SubStringBefore
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the substring before the first occurrence of a separator.
     * The separator is not returned.</p>
     *
     * <p>A {@code null} string input will return {@code null}.
     * An empty ("") string input will return the empty string.
     * A {@code null} separator will return the input string.</p>
     *
     * <p>If nothing is found, the string input is returned.</p>
     *
     * <pre>
     * StringUtils.substringBefore(null, *)      = null
     * StringUtils.substringBefore("", *)        = ""
     * StringUtils.substringBefore("abc", "a")   = ""
     * StringUtils.substringBefore("abcba", "b") = "a"
     * StringUtils.substringBefore("abc", "c")   = "ab"
     * StringUtils.substringBefore("abc", "d")   = "abc"
     * StringUtils.substringBefore("abc", "")    = ""
     * StringUtils.substringBefore("abc", null)  = "abc"
     * </pre>
     *
     * @param str  the String to get a substring from, may be null
     * @param separator  the String to search for, may be null
     * @return the substring before the first occurrence of the separator,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String substringBefore(final String str, final String separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6334);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6335);if ((((isEmpty(str) || separator == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6336)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6337)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6338);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6339);if ((((separator.isEmpty())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6340)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6341)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6342);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6343);final int pos = str.indexOf(separator);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6344);if ((((pos == INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6345)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6346)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6347);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6348);return str.substring(0, pos);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Gets the substring after the first occurrence of a separator.
     * The separator is not returned.</p>
     *
     * <p>A {@code null} string input will return {@code null}.
     * An empty ("") string input will return the empty string.
     * A {@code null} separator will return the empty string if the
     * input string is not {@code null}.</p>
     *
     * <p>If nothing is found, the empty string is returned.</p>
     *
     * <pre>
     * StringUtils.substringAfter(null, *)      = null
     * StringUtils.substringAfter("", *)        = ""
     * StringUtils.substringAfter(*, null)      = ""
     * StringUtils.substringAfter("abc", "a")   = "bc"
     * StringUtils.substringAfter("abcba", "b") = "cba"
     * StringUtils.substringAfter("abc", "c")   = ""
     * StringUtils.substringAfter("abc", "d")   = ""
     * StringUtils.substringAfter("abc", "")    = "abc"
     * </pre>
     *
     * @param str  the String to get a substring from, may be null
     * @param separator  the String to search for, may be null
     * @return the substring after the first occurrence of the separator,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String substringAfter(final String str, final String separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6349);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6350);if ((((isEmpty(str))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6351)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6352)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6353);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6354);if ((((separator == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6355)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6356)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6357);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6358);final int pos = str.indexOf(separator);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6359);if ((((pos == INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6360)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6361)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6362);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6363);return str.substring(pos + separator.length());
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Gets the substring before the last occurrence of a separator.
     * The separator is not returned.</p>
     *
     * <p>A {@code null} string input will return {@code null}.
     * An empty ("") string input will return the empty string.
     * An empty or {@code null} separator will return the input string.</p>
     *
     * <p>If nothing is found, the string input is returned.</p>
     *
     * <pre>
     * StringUtils.substringBeforeLast(null, *)      = null
     * StringUtils.substringBeforeLast("", *)        = ""
     * StringUtils.substringBeforeLast("abcba", "b") = "abc"
     * StringUtils.substringBeforeLast("abc", "c")   = "ab"
     * StringUtils.substringBeforeLast("a", "a")     = ""
     * StringUtils.substringBeforeLast("a", "z")     = "a"
     * StringUtils.substringBeforeLast("a", null)    = "a"
     * StringUtils.substringBeforeLast("a", "")      = "a"
     * </pre>
     *
     * @param str  the String to get a substring from, may be null
     * @param separator  the String to search for, may be null
     * @return the substring before the last occurrence of the separator,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String substringBeforeLast(final String str, final String separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6364);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6365);if ((((isEmpty(str) || isEmpty(separator))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6366)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6367)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6368);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6369);final int pos = str.lastIndexOf(separator);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6370);if ((((pos == INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6371)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6372)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6373);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6374);return str.substring(0, pos);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Gets the substring after the last occurrence of a separator.
     * The separator is not returned.</p>
     *
     * <p>A {@code null} string input will return {@code null}.
     * An empty ("") string input will return the empty string.
     * An empty or {@code null} separator will return the empty string if
     * the input string is not {@code null}.</p>
     *
     * <p>If nothing is found, the empty string is returned.</p>
     *
     * <pre>
     * StringUtils.substringAfterLast(null, *)      = null
     * StringUtils.substringAfterLast("", *)        = ""
     * StringUtils.substringAfterLast(*, "")        = ""
     * StringUtils.substringAfterLast(*, null)      = ""
     * StringUtils.substringAfterLast("abc", "a")   = "bc"
     * StringUtils.substringAfterLast("abcba", "b") = "a"
     * StringUtils.substringAfterLast("abc", "c")   = ""
     * StringUtils.substringAfterLast("a", "a")     = ""
     * StringUtils.substringAfterLast("a", "z")     = ""
     * </pre>
     *
     * @param str  the String to get a substring from, may be null
     * @param separator  the String to search for, may be null
     * @return the substring after the last occurrence of the separator,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String substringAfterLast(final String str, final String separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6375);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6376);if ((((isEmpty(str))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6377)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6378)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6379);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6380);if ((((isEmpty(separator))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6381)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6382)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6383);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6384);final int pos = str.lastIndexOf(separator);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6385);if ((((pos == INDEX_NOT_FOUND || pos == str.length() - separator.length())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6386)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6387)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6388);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6389);return str.substring(pos + separator.length());
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Substring between
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the String that is nested in between two instances of the
     * same String.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} tag returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.substringBetween(null, *)            = null
     * StringUtils.substringBetween("", "")             = ""
     * StringUtils.substringBetween("", "tag")          = null
     * StringUtils.substringBetween("tagabctag", null)  = null
     * StringUtils.substringBetween("tagabctag", "")    = ""
     * StringUtils.substringBetween("tagabctag", "tag") = "abc"
     * </pre>
     *
     * @param str  the String containing the substring, may be null
     * @param tag  the String before and after the substring, may be null
     * @return the substring, {@code null} if no match
     * @since 2.0
     */
    public static String substringBetween(final String str, final String tag) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6390);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6391);return substringBetween(str, tag, tag);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Gets the String that is nested in between two Strings.
     * Only the first match is returned.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} open/close returns {@code null} (no match).
     * An empty ("") open and close returns an empty string.</p>
     *
     * <pre>
     * StringUtils.substringBetween("wx[b]yz", "[", "]") = "b"
     * StringUtils.substringBetween(null, *, *)          = null
     * StringUtils.substringBetween(*, null, *)          = null
     * StringUtils.substringBetween(*, *, null)          = null
     * StringUtils.substringBetween("", "", "")          = ""
     * StringUtils.substringBetween("", "", "]")         = null
     * StringUtils.substringBetween("", "[", "]")        = null
     * StringUtils.substringBetween("yabcz", "", "")     = ""
     * StringUtils.substringBetween("yabcz", "y", "z")   = "abc"
     * StringUtils.substringBetween("yabczyabcz", "y", "z")   = "abc"
     * </pre>
     *
     * @param str  the String containing the substring, may be null
     * @param open  the String before the substring, may be null
     * @param close  the String after the substring, may be null
     * @return the substring, {@code null} if no match
     * @since 2.0
     */
    public static String substringBetween(final String str, final String open, final String close) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6392);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6393);if ((((str == null || open == null || close == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6394)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6395)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6396);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6397);final int start = str.indexOf(open);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6398);if ((((start != INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6399)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6400)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6401);final int end = str.indexOf(close, start + open.length());
            __CLR4_4_14dm4dmldnigfmq.R.inc(6402);if ((((end != INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6403)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6404)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6405);return str.substring(start + open.length(), end);
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6406);return null;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Searches a String for substrings delimited by a start and end tag,
     * returning all matching substrings in an array.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} open/close returns {@code null} (no match).
     * An empty ("") open/close returns {@code null} (no match).</p>
     *
     * <pre>
     * StringUtils.substringsBetween("[a][b][c]", "[", "]") = ["a","b","c"]
     * StringUtils.substringsBetween(null, *, *)            = null
     * StringUtils.substringsBetween(*, null, *)            = null
     * StringUtils.substringsBetween(*, *, null)            = null
     * StringUtils.substringsBetween("", "[", "]")          = []
     * </pre>
     *
     * @param str  the String containing the substrings, null returns null, empty returns empty
     * @param open  the String identifying the start of the substring, empty returns null
     * @param close  the String identifying the end of the substring, empty returns null
     * @return a String Array of substrings, or {@code null} if no match
     * @since 2.3
     */
    public static String[] substringsBetween(final String str, final String open, final String close) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6407);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6408);if ((((str == null || isEmpty(open) || isEmpty(close))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6409)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6410)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6411);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6412);final int strLen = str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6413);if ((((strLen == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6414)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6415)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6416);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6417);final int closeLen = close.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6418);final int openLen = open.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6419);final List<String> list = new ArrayList<String>();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6420);int pos = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6421);while ((((pos < strLen - closeLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6422)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6423)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6424);int start = str.indexOf(open, pos);
            __CLR4_4_14dm4dmldnigfmq.R.inc(6425);if ((((start < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6426)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6427)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6428);break;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6429);start += openLen;
            __CLR4_4_14dm4dmldnigfmq.R.inc(6430);final int end = str.indexOf(close, start);
            __CLR4_4_14dm4dmldnigfmq.R.inc(6431);if ((((end < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6432)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6433)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6434);break;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6435);list.add(str.substring(start, end));
            __CLR4_4_14dm4dmldnigfmq.R.inc(6436);pos = end + closeLen;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6437);if ((((list.isEmpty())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6438)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6439)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6440);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6441);return list.toArray(new String [list.size()]);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Nested extraction
    //-----------------------------------------------------------------------

    // Splitting
    //-----------------------------------------------------------------------
    /**
     * <p>Splits the provided text into an array, using whitespace as the
     * separator.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as one separator.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.split(null)       = null
     * StringUtils.split("")         = []
     * StringUtils.split("abc def")  = ["abc", "def"]
     * StringUtils.split("abc  def") = ["abc", "def"]
     * StringUtils.split(" abc ")    = ["abc"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @return an array of parsed Strings, {@code null} if null String input
     */
    public static String[] split(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6442);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6443);return split(str, null, -1);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator specified.
     * This is an alternative to using StringTokenizer.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as one separator.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.split(null, *)         = null
     * StringUtils.split("", *)           = []
     * StringUtils.split("a.b.c", '.')    = ["a", "b", "c"]
     * StringUtils.split("a..b.c", '.')   = ["a", "b", "c"]
     * StringUtils.split("a:b:c", '.')    = ["a:b:c"]
     * StringUtils.split("a b c", ' ')    = ["a", "b", "c"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separatorChar  the character used as the delimiter
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.0
     */
    public static String[] split(final String str, final char separatorChar) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6444);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6445);return splitWorker(str, separatorChar, false);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separators specified.
     * This is an alternative to using StringTokenizer.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as one separator.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separatorChars splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.split(null, *)         = null
     * StringUtils.split("", *)           = []
     * StringUtils.split("abc def", null) = ["abc", "def"]
     * StringUtils.split("abc def", " ")  = ["abc", "def"]
     * StringUtils.split("abc  def", " ") = ["abc", "def"]
     * StringUtils.split("ab:cd:ef", ":") = ["ab", "cd", "ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separatorChars  the characters used as the delimiters,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String input
     */
    public static String[] split(final String str, final String separatorChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6446);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6447);return splitWorker(str, separatorChars, -1, false);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array with a maximum length,
     * separators specified.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as one separator.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separatorChars splits on whitespace.</p>
     *
     * <p>If more than {@code max} delimited substrings are found, the last
     * returned string includes all characters after the first {@code max - 1}
     * returned strings (including separator characters).</p>
     *
     * <pre>
     * StringUtils.split(null, *, *)            = null
     * StringUtils.split("", *, *)              = []
     * StringUtils.split("ab cd ef", null, 0)   = ["ab", "cd", "ef"]
     * StringUtils.split("ab   cd ef", null, 0) = ["ab", "cd", "ef"]
     * StringUtils.split("ab:cd:ef", ":", 0)    = ["ab", "cd", "ef"]
     * StringUtils.split("ab:cd:ef", ":", 2)    = ["ab", "cd:ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separatorChars  the characters used as the delimiters,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the
     *  array. A zero or negative value implies no limit
     * @return an array of parsed Strings, {@code null} if null String input
     */
    public static String[] split(final String str, final String separatorChars, final int max) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6448);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6449);return splitWorker(str, separatorChars, max, false);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator string specified.</p>
     *
     * <p>The separator(s) will not be included in the returned String array.
     * Adjacent separators are treated as one separator.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separator splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitByWholeSeparator(null, *)               = null
     * StringUtils.splitByWholeSeparator("", *)                 = []
     * StringUtils.splitByWholeSeparator("ab de fg", null)      = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparator("ab   de fg", null)    = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparator("ab:cd:ef", ":")       = ["ab", "cd", "ef"]
     * StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-") = ["ab", "cd", "ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String was input
     */
    public static String[] splitByWholeSeparator(final String str, final String separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6450);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6451);return splitByWholeSeparatorWorker( str, separator, -1, false ) ;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator string specified.
     * Returns a maximum of {@code max} substrings.</p>
     *
     * <p>The separator(s) will not be included in the returned String array.
     * Adjacent separators are treated as one separator.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separator splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitByWholeSeparator(null, *, *)               = null
     * StringUtils.splitByWholeSeparator("", *, *)                 = []
     * StringUtils.splitByWholeSeparator("ab de fg", null, 0)      = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparator("ab   de fg", null, 0)    = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 2)       = ["ab", "cd:ef"]
     * StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 5) = ["ab", "cd", "ef"]
     * StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 2) = ["ab", "cd-!-ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the returned
     *  array. A zero or negative value implies no limit.
     * @return an array of parsed Strings, {@code null} if null String was input
     */
    public static String[] splitByWholeSeparator( final String str, final String separator, final int max ) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6452);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6453);return splitByWholeSeparatorWorker(str, separator, max, false);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator string specified. </p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separator splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *)               = null
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("", *)                 = []
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", null)      = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null)    = ["ab", "", "", "de", "fg"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":")       = ["ab", "cd", "ef"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-cd-!-ef", "-!-") = ["ab", "cd", "ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String was input
     * @since 2.4
     */
    public static String[] splitByWholeSeparatorPreserveAllTokens(final String str, final String separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6454);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6455);return splitByWholeSeparatorWorker(str, separator, -1, true);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator string specified.
     * Returns a maximum of {@code max} substrings.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separator splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *, *)               = null
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("", *, *)                 = []
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", null, 0)      = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null, 0)    = ["ab", "", "", "de", "fg"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":", 2)       = ["ab", "cd:ef"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-cd-!-ef", "-!-", 5) = ["ab", "cd", "ef"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-cd-!-ef", "-!-", 2) = ["ab", "cd-!-ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the returned
     *  array. A zero or negative value implies no limit.
     * @return an array of parsed Strings, {@code null} if null String was input
     * @since 2.4
     */
    public static String[] splitByWholeSeparatorPreserveAllTokens(final String str, final String separator, final int max) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6456);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6457);return splitByWholeSeparatorWorker(str, separator, max, true);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Performs the logic for the {@code splitByWholeSeparatorPreserveAllTokens} methods.
     *
     * @param str  the String to parse, may be {@code null}
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the returned
     *  array. A zero or negative value implies no limit.
     * @param preserveAllTokens if {@code true}, adjacent separators are
     * treated as empty token separators; if {@code false}, adjacent
     * separators are treated as one separator.
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.4
     */
    private static String[] splitByWholeSeparatorWorker(
            final String str, final String separator, final int max, final boolean preserveAllTokens) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6458);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6459);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6460)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6461)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6462);return null;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6463);final int len = str.length();

        __CLR4_4_14dm4dmldnigfmq.R.inc(6464);if ((((len == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6465)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6466)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6467);return ArrayUtils.EMPTY_STRING_ARRAY;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6468);if ((((separator == null || EMPTY.equals(separator))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6469)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6470)==0&false))) {{
            // Split on whitespace.
            __CLR4_4_14dm4dmldnigfmq.R.inc(6471);return splitWorker(str, null, max, preserveAllTokens);
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6472);final int separatorLength = separator.length();

        __CLR4_4_14dm4dmldnigfmq.R.inc(6473);final ArrayList<String> substrings = new ArrayList<String>();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6474);int numberOfSubstrings = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6475);int beg = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6476);int end = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6477);while ((((end < len)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6478)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6479)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6480);end = str.indexOf(separator, beg);

            __CLR4_4_14dm4dmldnigfmq.R.inc(6481);if ((((end > -1)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6482)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6483)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6484);if ((((end > beg)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6485)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6486)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6487);numberOfSubstrings += 1;

                    __CLR4_4_14dm4dmldnigfmq.R.inc(6488);if ((((numberOfSubstrings == max)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6489)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6490)==0&false))) {{
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6491);end = len;
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6492);substrings.add(str.substring(beg));
                    } }else {{
                        // The following is OK, because String.substring( beg, end ) excludes
                        // the character at the position 'end'.
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6493);substrings.add(str.substring(beg, end));

                        // Set the starting point for the next search.
                        // The following is equivalent to beg = end + (separatorLength - 1) + 1,
                        // which is the right calculation:
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6494);beg = end + separatorLength;
                    }
                }} }else {{
                    // We found a consecutive occurrence of the separator, so skip it.
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6495);if ((((preserveAllTokens)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6496)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6497)==0&false))) {{
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6498);numberOfSubstrings += 1;
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6499);if ((((numberOfSubstrings == max)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6500)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6501)==0&false))) {{
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6502);end = len;
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6503);substrings.add(str.substring(beg));
                        } }else {{
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6504);substrings.add(EMPTY);
                        }
                    }}
                    }__CLR4_4_14dm4dmldnigfmq.R.inc(6505);beg = end + separatorLength;
                }
            }} }else {{
                // String.substring( beg ) goes from 'beg' to the end of the String.
                __CLR4_4_14dm4dmldnigfmq.R.inc(6506);substrings.add(str.substring(beg));
                __CLR4_4_14dm4dmldnigfmq.R.inc(6507);end = len;
            }
        }}

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6508);return substrings.toArray(new String[substrings.size()]);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    /**
     * <p>Splits the provided text into an array, using whitespace as the
     * separator, preserving all tokens, including empty tokens created by
     * adjacent separators. This is an alternative to using StringTokenizer.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.splitPreserveAllTokens(null)       = null
     * StringUtils.splitPreserveAllTokens("")         = []
     * StringUtils.splitPreserveAllTokens("abc def")  = ["abc", "def"]
     * StringUtils.splitPreserveAllTokens("abc  def") = ["abc", "", "def"]
     * StringUtils.splitPreserveAllTokens(" abc ")    = ["", "abc", ""]
     * </pre>
     *
     * @param str  the String to parse, may be {@code null}
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.1
     */
    public static String[] splitPreserveAllTokens(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6509);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6510);return splitWorker(str, null, -1, true);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator specified,
     * preserving all tokens, including empty tokens created by adjacent
     * separators. This is an alternative to using StringTokenizer.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.splitPreserveAllTokens(null, *)         = null
     * StringUtils.splitPreserveAllTokens("", *)           = []
     * StringUtils.splitPreserveAllTokens("a.b.c", '.')    = ["a", "b", "c"]
     * StringUtils.splitPreserveAllTokens("a..b.c", '.')   = ["a", "", "b", "c"]
     * StringUtils.splitPreserveAllTokens("a:b:c", '.')    = ["a:b:c"]
     * StringUtils.splitPreserveAllTokens("a\tb\nc", null) = ["a", "b", "c"]
     * StringUtils.splitPreserveAllTokens("a b c", ' ')    = ["a", "b", "c"]
     * StringUtils.splitPreserveAllTokens("a b c ", ' ')   = ["a", "b", "c", ""]
     * StringUtils.splitPreserveAllTokens("a b c  ", ' ')   = ["a", "b", "c", "", ""]
     * StringUtils.splitPreserveAllTokens(" a b c", ' ')   = ["", a", "b", "c"]
     * StringUtils.splitPreserveAllTokens("  a b c", ' ')  = ["", "", a", "b", "c"]
     * StringUtils.splitPreserveAllTokens(" a b c ", ' ')  = ["", a", "b", "c", ""]
     * </pre>
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChar  the character used as the delimiter,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.1
     */
    public static String[] splitPreserveAllTokens(final String str, final char separatorChar) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6511);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6512);return splitWorker(str, separatorChar, true);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Performs the logic for the {@code split} and
     * {@code splitPreserveAllTokens} methods that do not return a
     * maximum array length.
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChar the separate character
     * @param preserveAllTokens if {@code true}, adjacent separators are
     * treated as empty token separators; if {@code false}, adjacent
     * separators are treated as one separator.
     * @return an array of parsed Strings, {@code null} if null String input
     */
    private static String[] splitWorker(final String str, final char separatorChar, final boolean preserveAllTokens) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6513);
        // Performance tuned for 2.0 (JDK1.4)

        __CLR4_4_14dm4dmldnigfmq.R.inc(6514);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6515)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6516)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6517);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6518);final int len = str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6519);if ((((len == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6520)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6521)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6522);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6523);final List<String> list = new ArrayList<String>();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6524);int i = 0, start = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6525);boolean match = false;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6526);boolean lastMatch = false;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6527);while ((((i < len)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6528)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6529)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6530);if ((((str.charAt(i) == separatorChar)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6531)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6532)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6533);if ((((match || preserveAllTokens)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6534)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6535)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6536);list.add(str.substring(start, i));
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6537);match = false;
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6538);lastMatch = true;
                }
                }__CLR4_4_14dm4dmldnigfmq.R.inc(6539);start = ++i;
                __CLR4_4_14dm4dmldnigfmq.R.inc(6540);continue;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6541);lastMatch = false;
            __CLR4_4_14dm4dmldnigfmq.R.inc(6542);match = true;
            __CLR4_4_14dm4dmldnigfmq.R.inc(6543);i++;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6544);if ((((match || preserveAllTokens && lastMatch)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6545)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6546)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6547);list.add(str.substring(start, i));
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6548);return list.toArray(new String[list.size()]);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separators specified,
     * preserving all tokens, including empty tokens created by adjacent
     * separators. This is an alternative to using StringTokenizer.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separatorChars splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitPreserveAllTokens(null, *)           = null
     * StringUtils.splitPreserveAllTokens("", *)             = []
     * StringUtils.splitPreserveAllTokens("abc def", null)   = ["abc", "def"]
     * StringUtils.splitPreserveAllTokens("abc def", " ")    = ["abc", "def"]
     * StringUtils.splitPreserveAllTokens("abc  def", " ")   = ["abc", "", def"]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef", ":")   = ["ab", "cd", "ef"]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef:", ":")  = ["ab", "cd", "ef", ""]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef::", ":") = ["ab", "cd", "ef", "", ""]
     * StringUtils.splitPreserveAllTokens("ab::cd:ef", ":")  = ["ab", "", cd", "ef"]
     * StringUtils.splitPreserveAllTokens(":cd:ef", ":")     = ["", cd", "ef"]
     * StringUtils.splitPreserveAllTokens("::cd:ef", ":")    = ["", "", cd", "ef"]
     * StringUtils.splitPreserveAllTokens(":cd:ef:", ":")    = ["", cd", "ef", ""]
     * </pre>
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChars  the characters used as the delimiters,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.1
     */
    public static String[] splitPreserveAllTokens(final String str, final String separatorChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6549);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6550);return splitWorker(str, separatorChars, -1, true);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array with a maximum length,
     * separators specified, preserving all tokens, including empty tokens
     * created by adjacent separators.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * Adjacent separators are treated as one separator.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separatorChars splits on whitespace.</p>
     *
     * <p>If more than {@code max} delimited substrings are found, the last
     * returned string includes all characters after the first {@code max - 1}
     * returned strings (including separator characters).</p>
     *
     * <pre>
     * StringUtils.splitPreserveAllTokens(null, *, *)            = null
     * StringUtils.splitPreserveAllTokens("", *, *)              = []
     * StringUtils.splitPreserveAllTokens("ab de fg", null, 0)   = ["ab", "cd", "ef"]
     * StringUtils.splitPreserveAllTokens("ab   de fg", null, 0) = ["ab", "cd", "ef"]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 0)    = ["ab", "cd", "ef"]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 2)    = ["ab", "cd:ef"]
     * StringUtils.splitPreserveAllTokens("ab   de fg", null, 2) = ["ab", "  de fg"]
     * StringUtils.splitPreserveAllTokens("ab   de fg", null, 3) = ["ab", "", " de fg"]
     * StringUtils.splitPreserveAllTokens("ab   de fg", null, 4) = ["ab", "", "", "de fg"]
     * </pre>
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChars  the characters used as the delimiters,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the
     *  array. A zero or negative value implies no limit
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.1
     */
    public static String[] splitPreserveAllTokens(final String str, final String separatorChars, final int max) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6551);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6552);return splitWorker(str, separatorChars, max, true);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Performs the logic for the {@code split} and
     * {@code splitPreserveAllTokens} methods that return a maximum array
     * length.
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChars the separate character
     * @param max  the maximum number of elements to include in the
     *  array. A zero or negative value implies no limit.
     * @param preserveAllTokens if {@code true}, adjacent separators are
     * treated as empty token separators; if {@code false}, adjacent
     * separators are treated as one separator.
     * @return an array of parsed Strings, {@code null} if null String input
     */
    private static String[] splitWorker(final String str, final String separatorChars, final int max, final boolean preserveAllTokens) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6553);
        // Performance tuned for 2.0 (JDK1.4)
        // Direct code is quicker than StringTokenizer.
        // Also, StringTokenizer uses isSpace() not isWhitespace()

        __CLR4_4_14dm4dmldnigfmq.R.inc(6554);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6555)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6556)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6557);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6558);final int len = str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6559);if ((((len == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6560)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6561)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6562);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6563);final List<String> list = new ArrayList<String>();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6564);int sizePlus1 = 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6565);int i = 0, start = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6566);boolean match = false;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6567);boolean lastMatch = false;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6568);if ((((separatorChars == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6569)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6570)==0&false))) {{
            // Null separator means use whitespace
            __CLR4_4_14dm4dmldnigfmq.R.inc(6571);while ((((i < len)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6572)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6573)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6574);if ((((Character.isWhitespace(str.charAt(i)))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6575)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6576)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6577);if ((((match || preserveAllTokens)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6578)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6579)==0&false))) {{
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6580);lastMatch = true;
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6581);if ((((sizePlus1++ == max)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6582)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6583)==0&false))) {{
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6584);i = len;
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6585);lastMatch = false;
                        }
                        }__CLR4_4_14dm4dmldnigfmq.R.inc(6586);list.add(str.substring(start, i));
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6587);match = false;
                    }
                    }__CLR4_4_14dm4dmldnigfmq.R.inc(6588);start = ++i;
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6589);continue;
                }
                }__CLR4_4_14dm4dmldnigfmq.R.inc(6590);lastMatch = false;
                __CLR4_4_14dm4dmldnigfmq.R.inc(6591);match = true;
                __CLR4_4_14dm4dmldnigfmq.R.inc(6592);i++;
            }
        }} }else {__CLR4_4_14dm4dmldnigfmq.R.inc(6593);if ((((separatorChars.length() == 1)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6594)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6595)==0&false))) {{
            // Optimise 1 character case
            __CLR4_4_14dm4dmldnigfmq.R.inc(6596);final char sep = separatorChars.charAt(0);
            __CLR4_4_14dm4dmldnigfmq.R.inc(6597);while ((((i < len)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6598)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6599)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6600);if ((((str.charAt(i) == sep)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6601)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6602)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6603);if ((((match || preserveAllTokens)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6604)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6605)==0&false))) {{
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6606);lastMatch = true;
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6607);if ((((sizePlus1++ == max)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6608)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6609)==0&false))) {{
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6610);i = len;
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6611);lastMatch = false;
                        }
                        }__CLR4_4_14dm4dmldnigfmq.R.inc(6612);list.add(str.substring(start, i));
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6613);match = false;
                    }
                    }__CLR4_4_14dm4dmldnigfmq.R.inc(6614);start = ++i;
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6615);continue;
                }
                }__CLR4_4_14dm4dmldnigfmq.R.inc(6616);lastMatch = false;
                __CLR4_4_14dm4dmldnigfmq.R.inc(6617);match = true;
                __CLR4_4_14dm4dmldnigfmq.R.inc(6618);i++;
            }
        }} }else {{
            // standard case
            __CLR4_4_14dm4dmldnigfmq.R.inc(6619);while ((((i < len)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6620)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6621)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6622);if ((((separatorChars.indexOf(str.charAt(i)) >= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6623)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6624)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6625);if ((((match || preserveAllTokens)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6626)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6627)==0&false))) {{
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6628);lastMatch = true;
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6629);if ((((sizePlus1++ == max)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6630)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6631)==0&false))) {{
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6632);i = len;
                            __CLR4_4_14dm4dmldnigfmq.R.inc(6633);lastMatch = false;
                        }
                        }__CLR4_4_14dm4dmldnigfmq.R.inc(6634);list.add(str.substring(start, i));
                        __CLR4_4_14dm4dmldnigfmq.R.inc(6635);match = false;
                    }
                    }__CLR4_4_14dm4dmldnigfmq.R.inc(6636);start = ++i;
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6637);continue;
                }
                }__CLR4_4_14dm4dmldnigfmq.R.inc(6638);lastMatch = false;
                __CLR4_4_14dm4dmldnigfmq.R.inc(6639);match = true;
                __CLR4_4_14dm4dmldnigfmq.R.inc(6640);i++;
            }
        }}
        }}__CLR4_4_14dm4dmldnigfmq.R.inc(6641);if ((((match || preserveAllTokens && lastMatch)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6642)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6643)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6644);list.add(str.substring(start, i));
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6645);return list.toArray(new String[list.size()]);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits a String by Character type as returned by
     * {@code java.lang.Character.getType(char)}. Groups of contiguous
     * characters of the same type are returned as complete tokens.
     * <pre>
     * StringUtils.splitByCharacterType(null)         = null
     * StringUtils.splitByCharacterType("")           = []
     * StringUtils.splitByCharacterType("ab de fg")   = ["ab", " ", "de", " ", "fg"]
     * StringUtils.splitByCharacterType("ab   de fg") = ["ab", "   ", "de", " ", "fg"]
     * StringUtils.splitByCharacterType("ab:cd:ef")   = ["ab", ":", "cd", ":", "ef"]
     * StringUtils.splitByCharacterType("number5")    = ["number", "5"]
     * StringUtils.splitByCharacterType("fooBar")     = ["foo", "B", "ar"]
     * StringUtils.splitByCharacterType("foo200Bar")  = ["foo", "200", "B", "ar"]
     * StringUtils.splitByCharacterType("ASFRules")   = ["ASFR", "ules"]
     * </pre>
     * @param str the String to split, may be {@code null}
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.4
     */
    public static String[] splitByCharacterType(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6646);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6647);return splitByCharacterType(str, false);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits a String by Character type as returned by
     * {@code java.lang.Character.getType(char)}. Groups of contiguous
     * characters of the same type are returned as complete tokens, with the
     * following exception: the character of type
     * {@code Character.UPPERCASE_LETTER}, if any, immediately
     * preceding a token of type {@code Character.LOWERCASE_LETTER}
     * will belong to the following token rather than to the preceding, if any,
     * {@code Character.UPPERCASE_LETTER} token.
     * <pre>
     * StringUtils.splitByCharacterTypeCamelCase(null)         = null
     * StringUtils.splitByCharacterTypeCamelCase("")           = []
     * StringUtils.splitByCharacterTypeCamelCase("ab de fg")   = ["ab", " ", "de", " ", "fg"]
     * StringUtils.splitByCharacterTypeCamelCase("ab   de fg") = ["ab", "   ", "de", " ", "fg"]
     * StringUtils.splitByCharacterTypeCamelCase("ab:cd:ef")   = ["ab", ":", "cd", ":", "ef"]
     * StringUtils.splitByCharacterTypeCamelCase("number5")    = ["number", "5"]
     * StringUtils.splitByCharacterTypeCamelCase("fooBar")     = ["foo", "Bar"]
     * StringUtils.splitByCharacterTypeCamelCase("foo200Bar")  = ["foo", "200", "Bar"]
     * StringUtils.splitByCharacterTypeCamelCase("ASFRules")   = ["ASF", "Rules"]
     * </pre>
     * @param str the String to split, may be {@code null}
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.4
     */
    public static String[] splitByCharacterTypeCamelCase(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6648);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6649);return splitByCharacterType(str, true);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Splits a String by Character type as returned by
     * {@code java.lang.Character.getType(char)}. Groups of contiguous
     * characters of the same type are returned as complete tokens, with the
     * following exception: if {@code camelCase} is {@code true},
     * the character of type {@code Character.UPPERCASE_LETTER}, if any,
     * immediately preceding a token of type {@code Character.LOWERCASE_LETTER}
     * will belong to the following token rather than to the preceding, if any,
     * {@code Character.UPPERCASE_LETTER} token.
     * @param str the String to split, may be {@code null}
     * @param camelCase whether to use so-called "camel-case" for letter types
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.4
     */
    private static String[] splitByCharacterType(final String str, final boolean camelCase) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6650);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6651);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6652)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6653)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6654);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6655);if ((((str.isEmpty())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6656)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6657)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6658);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6659);final char[] c = str.toCharArray();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6660);final List<String> list = new ArrayList<String>();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6661);int tokenStart = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6662);int currentType = Character.getType(c[tokenStart]);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6663);for (int pos = tokenStart + 1; (((pos < c.length)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6664)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6665)==0&false)); pos++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6666);final int type = Character.getType(c[pos]);
            __CLR4_4_14dm4dmldnigfmq.R.inc(6667);if ((((type == currentType)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6668)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6669)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6670);continue;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6671);if ((((camelCase && type == Character.LOWERCASE_LETTER && currentType == Character.UPPERCASE_LETTER)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6672)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6673)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6674);final int newTokenStart = pos - 1;
                __CLR4_4_14dm4dmldnigfmq.R.inc(6675);if ((((newTokenStart != tokenStart)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6676)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6677)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6678);list.add(new String(c, tokenStart, newTokenStart - tokenStart));
                    __CLR4_4_14dm4dmldnigfmq.R.inc(6679);tokenStart = newTokenStart;
                }
            }} }else {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6680);list.add(new String(c, tokenStart, pos - tokenStart));
                __CLR4_4_14dm4dmldnigfmq.R.inc(6681);tokenStart = pos;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6682);currentType = type;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6683);list.add(new String(c, tokenStart, c.length - tokenStart));
        __CLR4_4_14dm4dmldnigfmq.R.inc(6684);return list.toArray(new String[list.size()]);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Joining
    //-----------------------------------------------------------------------
    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No separator is added to the joined String.
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null)            = null
     * StringUtils.join([])              = ""
     * StringUtils.join([null])          = ""
     * StringUtils.join(["a", "b", "c"]) = "abc"
     * StringUtils.join([null, "", "a"]) = "a"
     * </pre>
     *
     * @param <T> the specific type of values to join together
     * @param elements  the values to join together, may be null
     * @return the joined String, {@code null} if null array input
     * @since 2.0
     * @since 3.0 Changed signature to use varargs
     */
    public static <T> String join(final T... elements) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6685);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6686);return join(elements, null);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join(["a", "b", "c"], ';')  = "a;b;c"
     * StringUtils.join(["a", "b", "c"], null) = "abc"
     * StringUtils.join([null, "", "a"], ';')  = ";;a"
     * </pre>
     *
     * @param array  the array of values to join together, may be null
     * @param separator  the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 2.0
     */
    public static String join(final Object[] array, final char separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6687);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6688);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6689)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6690)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6691);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6692);return join(array, separator, 0, array.length);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final long[] array, final char separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6693);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6694);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6695)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6696)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6697);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6698);return join(array, separator, 0, array.length);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final int[] array, final char separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6699);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6700);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6701)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6702)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6703);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6704);return join(array, separator, 0, array.length);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final short[] array, final char separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6705);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6706);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6707)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6708)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6709);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6710);return join(array, separator, 0, array.length);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final byte[] array, final char separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6711);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6712);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6713)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6714)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6715);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6716);return join(array, separator, 0, array.length);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final char[] array, final char separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6717);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6718);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6719)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6720)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6721);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6722);return join(array, separator, 0, array.length);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final float[] array, final char separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6723);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6724);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6725)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6726)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6727);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6728);return join(array, separator, 0, array.length);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final double[] array, final char separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6729);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6730);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6731)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6732)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6733);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6734);return join(array, separator, 0, array.length);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}


    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join(["a", "b", "c"], ';')  = "a;b;c"
     * StringUtils.join(["a", "b", "c"], null) = "abc"
     * StringUtils.join([null, "", "a"], ';')  = ";;a"
     * </pre>
     *
     * @param array  the array of values to join together, may be null
     * @param separator  the separator character to use
     * @param startIndex the first index to start joining from.  It is
     * an error to pass in an end index past the end of the array
     * @param endIndex the index to stop joining from (exclusive). It is
     * an error to pass in an end index past the end of the array
     * @return the joined String, {@code null} if null array input
     * @since 2.0
     */
    public static String join(final Object[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6735);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6736);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6737)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6738)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6739);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6740);final int noOfItems = endIndex - startIndex;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6741);if ((((noOfItems <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6742)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6743)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6744);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6745);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6746);for (int i = startIndex; (((i < endIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6747)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6748)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6749);if ((((i > startIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6750)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6751)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6752);buf.append(separator);
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6753);if ((((array[i] != null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6754)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6755)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6756);buf.append(array[i]);
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6757);return buf.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final long[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6758);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6759);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6760)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6761)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6762);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6763);final int noOfItems = endIndex - startIndex;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6764);if ((((noOfItems <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6765)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6766)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6767);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6768);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6769);for (int i = startIndex; (((i < endIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6770)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6771)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6772);if ((((i > startIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6773)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6774)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6775);buf.append(separator);
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6776);buf.append(array[i]);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6777);return buf.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final int[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6778);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6779);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6780)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6781)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6782);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6783);final int noOfItems = endIndex - startIndex;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6784);if ((((noOfItems <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6785)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6786)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6787);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6788);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6789);for (int i = startIndex; (((i < endIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6790)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6791)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6792);if ((((i > startIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6793)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6794)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6795);buf.append(separator);
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6796);buf.append(array[i]);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6797);return buf.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final byte[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6798);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6799);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6800)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6801)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6802);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6803);final int noOfItems = endIndex - startIndex;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6804);if ((((noOfItems <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6805)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6806)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6807);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6808);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6809);for (int i = startIndex; (((i < endIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6810)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6811)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6812);if ((((i > startIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6813)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6814)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6815);buf.append(separator);
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6816);buf.append(array[i]);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6817);return buf.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final short[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6818);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6819);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6820)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6821)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6822);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6823);final int noOfItems = endIndex - startIndex;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6824);if ((((noOfItems <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6825)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6826)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6827);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6828);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6829);for (int i = startIndex; (((i < endIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6830)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6831)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6832);if ((((i > startIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6833)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6834)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6835);buf.append(separator);
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6836);buf.append(array[i]);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6837);return buf.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final char[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6838);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6839);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6840)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6841)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6842);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6843);final int noOfItems = endIndex - startIndex;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6844);if ((((noOfItems <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6845)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6846)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6847);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6848);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6849);for (int i = startIndex; (((i < endIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6850)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6851)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6852);if ((((i > startIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6853)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6854)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6855);buf.append(separator);
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6856);buf.append(array[i]);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6857);return buf.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final double[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6858);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6859);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6860)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6861)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6862);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6863);final int noOfItems = endIndex - startIndex;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6864);if ((((noOfItems <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6865)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6866)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6867);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6868);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6869);for (int i = startIndex; (((i < endIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6870)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6871)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6872);if ((((i > startIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6873)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6874)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6875);buf.append(separator);
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6876);buf.append(array[i]);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6877);return buf.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final float[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6878);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6879);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6880)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6881)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6882);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6883);final int noOfItems = endIndex - startIndex;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6884);if ((((noOfItems <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6885)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6886)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6887);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6888);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6889);for (int i = startIndex; (((i < endIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6890)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6891)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6892);if ((((i > startIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6893)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6894)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6895);buf.append(separator);
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6896);buf.append(array[i]);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6897);return buf.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}


    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null, *)                = null
     * StringUtils.join([], *)                  = ""
     * StringUtils.join([null], *)              = ""
     * StringUtils.join(["a", "b", "c"], "--")  = "a--b--c"
     * StringUtils.join(["a", "b", "c"], null)  = "abc"
     * StringUtils.join(["a", "b", "c"], "")    = "abc"
     * StringUtils.join([null, "", "a"], ',')   = ",,a"
     * </pre>
     *
     * @param array  the array of values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @return the joined String, {@code null} if null array input
     */
    public static String join(final Object[] array, final String separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6898);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6899);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6900)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6901)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6902);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6903);return join(array, separator, 0, array.length);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null, *, *, *)                = null
     * StringUtils.join([], *, *, *)                  = ""
     * StringUtils.join([null], *, *, *)              = ""
     * StringUtils.join(["a", "b", "c"], "--", 0, 3)  = "a--b--c"
     * StringUtils.join(["a", "b", "c"], "--", 1, 3)  = "b--c"
     * StringUtils.join(["a", "b", "c"], "--", 2, 3)  = "c"
     * StringUtils.join(["a", "b", "c"], "--", 2, 2)  = ""
     * StringUtils.join(["a", "b", "c"], null, 0, 3)  = "abc"
     * StringUtils.join(["a", "b", "c"], "", 0, 3)    = "abc"
     * StringUtils.join([null, "", "a"], ',', 0, 3)   = ",,a"
     * </pre>
     *
     * @param array  the array of values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @param startIndex the first index to start joining from.
     * @param endIndex the index to stop joining from (exclusive).
     * @return the joined String, {@code null} if null array input; or the empty string
     * if {@code endIndex - startIndex <= 0}. The number of joined entries is given by
     * {@code endIndex - startIndex}
     * @throws ArrayIndexOutOfBoundsException ife<br/>
     * {@code startIndex < 0} or <br/>
     * {@code startIndex >= array.length()} or <br/>
     * {@code endIndex < 0} or <br/>
     * {@code endIndex > array.length()} 
     */
    public static String join(final Object[] array, String separator, final int startIndex, final int endIndex) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6904);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6905);if ((((array == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6906)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6907)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6908);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6909);if ((((separator == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6910)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6911)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6912);separator = EMPTY;
        }

        // endIndex - startIndex > 0:   Len = NofStrings *(len(firstString) + len(separator))
        //           (Assuming that all Strings are roughly equally long)
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6913);final int noOfItems = endIndex - startIndex;
        __CLR4_4_14dm4dmldnigfmq.R.inc(6914);if ((((noOfItems <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6915)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6916)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6917);return EMPTY;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6918);final StringBuilder buf = new StringBuilder(noOfItems * 16);

        __CLR4_4_14dm4dmldnigfmq.R.inc(6919);for (int i = startIndex; (((i < endIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6920)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6921)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6922);if ((((i > startIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6923)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6924)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6925);buf.append(separator);
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6926);if ((((array[i] != null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6927)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6928)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6929);buf.append(array[i]);
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6930);return buf.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided {@code Iterator} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list. Null objects or empty
     * strings within the iteration are represented by empty strings.</p>
     *
     * <p>See the examples here: {@link #join(Object[],char)}. </p>
     *
     * @param iterator  the {@code Iterator} of values to join together, may be null
     * @param separator  the separator character to use
     * @return the joined String, {@code null} if null iterator input
     * @since 2.0
     */
    public static String join(final Iterator<?> iterator, final char separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6931);

        // handle null, zero and one elements before building a buffer
        __CLR4_4_14dm4dmldnigfmq.R.inc(6932);if ((((iterator == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6933)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6934)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6935);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6936);if ((((!iterator.hasNext())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6937)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6938)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6939);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6940);final Object first = iterator.next();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6941);if ((((!iterator.hasNext())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6942)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6943)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6944);return ObjectUtils.toString(first);
        }

        // two or more elements
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6945);final StringBuilder buf = new StringBuilder(256); // Java default is 16, probably too small
        __CLR4_4_14dm4dmldnigfmq.R.inc(6946);if ((((first != null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6947)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6948)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6949);buf.append(first);
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6950);while ((((iterator.hasNext())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6951)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6952)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6953);buf.append(separator);
            __CLR4_4_14dm4dmldnigfmq.R.inc(6954);final Object obj = iterator.next();
            __CLR4_4_14dm4dmldnigfmq.R.inc(6955);if ((((obj != null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6956)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6957)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6958);buf.append(obj);
            }
        }}

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6959);return buf.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided {@code Iterator} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").</p>
     *
     * <p>See the examples here: {@link #join(Object[],String)}. </p>
     *
     * @param iterator  the {@code Iterator} of values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @return the joined String, {@code null} if null iterator input
     */
    public static String join(final Iterator<?> iterator, final String separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6960);

        // handle null, zero and one elements before building a buffer
        __CLR4_4_14dm4dmldnigfmq.R.inc(6961);if ((((iterator == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6962)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6963)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6964);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6965);if ((((!iterator.hasNext())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6966)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6967)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6968);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6969);final Object first = iterator.next();
        __CLR4_4_14dm4dmldnigfmq.R.inc(6970);if ((((!iterator.hasNext())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6971)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6972)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6973);return ObjectUtils.toString(first);
        }

        // two or more elements
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6974);final StringBuilder buf = new StringBuilder(256); // Java default is 16, probably too small
        __CLR4_4_14dm4dmldnigfmq.R.inc(6975);if ((((first != null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6976)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6977)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6978);buf.append(first);
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(6979);while ((((iterator.hasNext())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6980)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6981)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6982);if ((((separator != null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6983)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6984)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6985);buf.append(separator);
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(6986);final Object obj = iterator.next();
            __CLR4_4_14dm4dmldnigfmq.R.inc(6987);if ((((obj != null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6988)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6989)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(6990);buf.append(obj);
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6991);return buf.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided {@code Iterable} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list. Null objects or empty
     * strings within the iteration are represented by empty strings.</p>
     *
     * <p>See the examples here: {@link #join(Object[],char)}. </p>
     *
     * @param iterable  the {@code Iterable} providing the values to join together, may be null
     * @param separator  the separator character to use
     * @return the joined String, {@code null} if null iterator input
     * @since 2.3
     */
    public static String join(final Iterable<?> iterable, final char separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6992);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6993);if ((((iterable == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(6994)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(6995)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(6996);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(6997);return join(iterable.iterator(), separator);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided {@code Iterable} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").</p>
     *
     * <p>See the examples here: {@link #join(Object[],String)}. </p>
     *
     * @param iterable  the {@code Iterable} providing the values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @return the joined String, {@code null} if null iterator input
     * @since 2.3
     */
    public static String join(final Iterable<?> iterable, final String separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(6998);
        __CLR4_4_14dm4dmldnigfmq.R.inc(6999);if ((((iterable == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7000)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7001)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7002);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7003);return join(iterable.iterator(), separator);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Delete
    //-----------------------------------------------------------------------
    /**
     * <p>Deletes all whitespaces from a String as defined by
     * {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.deleteWhitespace(null)         = null
     * StringUtils.deleteWhitespace("")           = ""
     * StringUtils.deleteWhitespace("abc")        = "abc"
     * StringUtils.deleteWhitespace("   ab  c  ") = "abc"
     * </pre>
     *
     * @param str  the String to delete whitespace from, may be null
     * @return the String without whitespaces, {@code null} if null String input
     */
    public static String deleteWhitespace(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7004);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7005);if ((((isEmpty(str))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7006)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7007)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7008);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7009);final int sz = str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7010);final char[] chs = new char[sz];
        __CLR4_4_14dm4dmldnigfmq.R.inc(7011);int count = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7012);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7013)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7014)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7015);if ((((!Character.isWhitespace(str.charAt(i)))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7016)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7017)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7018);chs[count++] = str.charAt(i);
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7019);if ((((count == sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7020)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7021)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7022);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7023);return new String(chs, 0, count);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Remove
    //-----------------------------------------------------------------------
    /**
     * <p>Removes a substring only if it is at the beginning of a source string,
     * otherwise returns the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} search string will return the source string.</p>
     *
     * <pre>
     * StringUtils.removeStart(null, *)      = null
     * StringUtils.removeStart("", *)        = ""
     * StringUtils.removeStart(*, null)      = *
     * StringUtils.removeStart("www.domain.com", "www.")   = "domain.com"
     * StringUtils.removeStart("domain.com", "www.")       = "domain.com"
     * StringUtils.removeStart("www.domain.com", "domain") = "www.domain.com"
     * StringUtils.removeStart("abc", "")    = "abc"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.1
     */
    public static String removeStart(final String str, final String remove) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7024);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7025);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7026)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7027)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7028);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7029);if ((((str.startsWith(remove))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7030)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7031)==0&false))){{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7032);return str.substring(remove.length());
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7033);return str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Case insensitive removal of a substring if it is at the beginning of a source string,
     * otherwise returns the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} search string will return the source string.</p>
     *
     * <pre>
     * StringUtils.removeStartIgnoreCase(null, *)      = null
     * StringUtils.removeStartIgnoreCase("", *)        = ""
     * StringUtils.removeStartIgnoreCase(*, null)      = *
     * StringUtils.removeStartIgnoreCase("www.domain.com", "www.")   = "domain.com"
     * StringUtils.removeStartIgnoreCase("www.domain.com", "WWW.")   = "domain.com"
     * StringUtils.removeStartIgnoreCase("domain.com", "www.")       = "domain.com"
     * StringUtils.removeStartIgnoreCase("www.domain.com", "domain") = "www.domain.com"
     * StringUtils.removeStartIgnoreCase("abc", "")    = "abc"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for (case insensitive) and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.4
     */
    public static String removeStartIgnoreCase(final String str, final String remove) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7034);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7035);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7036)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7037)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7038);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7039);if ((((startsWithIgnoreCase(str, remove))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7040)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7041)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7042);return str.substring(remove.length());
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7043);return str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Removes a substring only if it is at the end of a source string,
     * otherwise returns the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} search string will return the source string.</p>
     *
     * <pre>
     * StringUtils.removeEnd(null, *)      = null
     * StringUtils.removeEnd("", *)        = ""
     * StringUtils.removeEnd(*, null)      = *
     * StringUtils.removeEnd("www.domain.com", ".com.")  = "www.domain.com"
     * StringUtils.removeEnd("www.domain.com", ".com")   = "www.domain"
     * StringUtils.removeEnd("www.domain.com", "domain") = "www.domain.com"
     * StringUtils.removeEnd("abc", "")    = "abc"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.1
     */
    public static String removeEnd(final String str, final String remove) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7044);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7045);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7046)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7047)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7048);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7049);if ((((str.endsWith(remove))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7050)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7051)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7052);return str.substring(0, str.length() - remove.length());
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7053);return str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Case insensitive removal of a substring if it is at the end of a source string,
     * otherwise returns the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} search string will return the source string.</p>
     *
     * <pre>
     * StringUtils.removeEndIgnoreCase(null, *)      = null
     * StringUtils.removeEndIgnoreCase("", *)        = ""
     * StringUtils.removeEndIgnoreCase(*, null)      = *
     * StringUtils.removeEndIgnoreCase("www.domain.com", ".com.")  = "www.domain.com"
     * StringUtils.removeEndIgnoreCase("www.domain.com", ".com")   = "www.domain"
     * StringUtils.removeEndIgnoreCase("www.domain.com", "domain") = "www.domain.com"
     * StringUtils.removeEndIgnoreCase("abc", "")    = "abc"
     * StringUtils.removeEndIgnoreCase("www.domain.com", ".COM") = "www.domain")
     * StringUtils.removeEndIgnoreCase("www.domain.COM", ".com") = "www.domain")
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for (case insensitive) and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.4
     */
    public static String removeEndIgnoreCase(final String str, final String remove) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7054);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7055);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7056)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7057)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7058);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7059);if ((((endsWithIgnoreCase(str, remove))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7060)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7061)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7062);return str.substring(0, str.length() - remove.length());
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7063);return str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Removes all occurrences of a substring from within the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} remove string will return the source string.
     * An empty ("") remove string will return the source string.</p>
     *
     * <pre>
     * StringUtils.remove(null, *)        = null
     * StringUtils.remove("", *)          = ""
     * StringUtils.remove(*, null)        = *
     * StringUtils.remove(*, "")          = *
     * StringUtils.remove("queued", "ue") = "qd"
     * StringUtils.remove("queued", "zz") = "queued"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.1
     */
    public static String remove(final String str, final String remove) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7064);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7065);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7066)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7067)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7068);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7069);return replace(str, remove, EMPTY, -1);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Removes all occurrences of a character from within the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.</p>
     *
     * <pre>
     * StringUtils.remove(null, *)       = null
     * StringUtils.remove("", *)         = ""
     * StringUtils.remove("queued", 'u') = "qeed"
     * StringUtils.remove("queued", 'z') = "queued"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the char to search for and remove, may be null
     * @return the substring with the char removed if found,
     *  {@code null} if null String input
     * @since 2.1
     */
    public static String remove(final String str, final char remove) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7070);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7071);if ((((isEmpty(str) || str.indexOf(remove) == INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7072)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7073)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7074);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7075);final char[] chars = str.toCharArray();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7076);int pos = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7077);for (int i = 0; (((i < chars.length)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7078)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7079)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7080);if ((((chars[i] != remove)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7081)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7082)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7083);chars[pos++] = chars[i];
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7084);return new String(chars, 0, pos);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Replacing
    //-----------------------------------------------------------------------
    /**
     * <p>Replaces a String with another String inside a larger String, once.</p>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replaceOnce(null, *, *)        = null
     * StringUtils.replaceOnce("", *, *)          = ""
     * StringUtils.replaceOnce("any", null, *)    = "any"
     * StringUtils.replaceOnce("any", *, null)    = "any"
     * StringUtils.replaceOnce("any", "", *)      = "any"
     * StringUtils.replaceOnce("aba", "a", null)  = "aba"
     * StringUtils.replaceOnce("aba", "a", "")    = "ba"
     * StringUtils.replaceOnce("aba", "a", "z")   = "zba"
     * </pre>
     *
     * @see #replace(String text, String searchString, String replacement, int max)
     * @param text  text to search and replace in, may be null
     * @param searchString  the String to search for, may be null
     * @param replacement  the String to replace with, may be null
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     */
    public static String replaceOnce(final String text, final String searchString, final String replacement) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7085);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7086);return replace(text, searchString, replacement, 1);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Replaces each substring of the source String that matches the given regular expression with the given
     * replacement using the {@link Pattern#DOTALL} option. DOTALL is also know as single-line mode in Perl. This call
     * is also equivalent to:
     * <ul>
     * <li>{@code source.replaceAll(&quot;(?s)&quot; + regex, replacement)}</li>
     * <li>{@code Pattern.compile(regex, Pattern.DOTALL).matcher(source).replaceAll(replacement)}</li>
     * </ul>
     * 
     * @param source
     *            the source string
     * @param regex
     *            the regular expression to which this string is to be matched
     * @param replacement
     *            the string to be substituted for each match
     * @return The resulting {@code String}
     * @see String#replaceAll(String, String)
     * @see Pattern#DOTALL
     * @since 3.2
     */
    public static String replacePattern(final String source, final String regex, final String replacement) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7087);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7088);return Pattern.compile(regex, Pattern.DOTALL).matcher(source).replaceAll(replacement);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Removes each substring of the source String that matches the given regular expression using the DOTALL option.
     * 
     * @param source
     *            the source string
     * @param regex
     *            the regular expression to which this string is to be matched
     * @return The resulting {@code String}
     * @see String#replaceAll(String, String)
     * @see Pattern#DOTALL
     * @since 3.2
     */
    public static String removePattern(final String source, final String regex) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7089);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7090);return replacePattern(source, regex, StringUtils.EMPTY);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Replaces all occurrences of a String within another String.</p>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replace(null, *, *)        = null
     * StringUtils.replace("", *, *)          = ""
     * StringUtils.replace("any", null, *)    = "any"
     * StringUtils.replace("any", *, null)    = "any"
     * StringUtils.replace("any", "", *)      = "any"
     * StringUtils.replace("aba", "a", null)  = "aba"
     * StringUtils.replace("aba", "a", "")    = "b"
     * StringUtils.replace("aba", "a", "z")   = "zbz"
     * </pre>
     *
     * @see #replace(String text, String searchString, String replacement, int max)
     * @param text  text to search and replace in, may be null
     * @param searchString  the String to search for, may be null
     * @param replacement  the String to replace it with, may be null
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     */
    public static String replace(final String text, final String searchString, final String replacement) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7091);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7092);return replace(text, searchString, replacement, -1);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Replaces a String with another String inside a larger String,
     * for the first {@code max} values of the search String.</p>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replace(null, *, *, *)         = null
     * StringUtils.replace("", *, *, *)           = ""
     * StringUtils.replace("any", null, *, *)     = "any"
     * StringUtils.replace("any", *, null, *)     = "any"
     * StringUtils.replace("any", "", *, *)       = "any"
     * StringUtils.replace("any", *, *, 0)        = "any"
     * StringUtils.replace("abaa", "a", null, -1) = "abaa"
     * StringUtils.replace("abaa", "a", "", -1)   = "b"
     * StringUtils.replace("abaa", "a", "z", 0)   = "abaa"
     * StringUtils.replace("abaa", "a", "z", 1)   = "zbaa"
     * StringUtils.replace("abaa", "a", "z", 2)   = "zbza"
     * StringUtils.replace("abaa", "a", "z", -1)  = "zbzz"
     * </pre>
     *
     * @param text  text to search and replace in, may be null
     * @param searchString  the String to search for, may be null
     * @param replacement  the String to replace it with, may be null
     * @param max  maximum number of values to replace, or {@code -1} if no maximum
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     */
    public static String replace(final String text, final String searchString, final String replacement, int max) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7093);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7094);if ((((isEmpty(text) || isEmpty(searchString) || replacement == null || max == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7095)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7096)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7097);return text;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7098);int start = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7099);int end = text.indexOf(searchString, start);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7100);if ((((end == INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7101)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7102)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7103);return text;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7104);final int replLength = searchString.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7105);int increase = replacement.length() - replLength;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7106);increase = (((increase < 0 )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7107)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7108)==0&false))? 0 : increase;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7109);increase *= (((max < 0 )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7110)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7111)==0&false))? 16 : (((max > 64 )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7112)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7113)==0&false))? 64 : max;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7114);final StringBuilder buf = new StringBuilder(text.length() + increase);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7115);while ((((end != INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7116)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7117)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7118);buf.append(text.substring(start, end)).append(replacement);
            __CLR4_4_14dm4dmldnigfmq.R.inc(7119);start = end + replLength;
            __CLR4_4_14dm4dmldnigfmq.R.inc(7120);if ((((--max == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7121)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7122)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7123);break;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(7124);end = text.indexOf(searchString, start);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7125);buf.append(text.substring(start));
        __CLR4_4_14dm4dmldnigfmq.R.inc(7126);return buf.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Replaces all occurrences of Strings within another String.
     * </p>
     *
     * <p>
     * A {@code null} reference passed to this method is a no-op, or if
     * any "search string" or "string to replace" is null, that replace will be
     * ignored. This will not repeat. For repeating replaces, call the
     * overloaded method.
     * </p>
     *
     * <pre>
     *  StringUtils.replaceEach(null, *, *)        = null
     *  StringUtils.replaceEach("", *, *)          = ""
     *  StringUtils.replaceEach("aba", null, null) = "aba"
     *  StringUtils.replaceEach("aba", new String[0], null) = "aba"
     *  StringUtils.replaceEach("aba", null, new String[0]) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, null)  = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""})  = "b"
     *  StringUtils.replaceEach("aba", new String[]{null}, new String[]{"a"})  = "aba"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"})  = "wcte"
     *  (example of how it does not repeat)
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"})  = "dcte"
     * </pre>
     *
     * @param text
     *            text to search and replace in, no-op if null
     * @param searchList
     *            the Strings to search for, no-op if null
     * @param replacementList
     *            the Strings to replace them with, no-op if null
     * @return the text with any replacements processed, {@code null} if
     *         null String input
     * @throws IllegalArgumentException
     *             if the lengths of the arrays are not the same (null is ok,
     *             and/or size 0)
     * @since 2.4
     */
    public static String replaceEach(final String text, final String[] searchList, final String[] replacementList) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7127);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7128);return replaceEach(text, searchList, replacementList, false, 0);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Replaces all occurrences of Strings within another String.
     * </p>
     *
     * <p>
     * A {@code null} reference passed to this method is a no-op, or if
     * any "search string" or "string to replace" is null, that replace will be
     * ignored. 
     * </p>
     *
     * <pre>
     *  StringUtils.replaceEach(null, *, *, *) = null
     *  StringUtils.replaceEach("", *, *, *) = ""
     *  StringUtils.replaceEach("aba", null, null, *) = "aba"
     *  StringUtils.replaceEach("aba", new String[0], null, *) = "aba"
     *  StringUtils.replaceEach("aba", null, new String[0], *) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, null, *) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""}, *) = "b"
     *  StringUtils.replaceEach("aba", new String[]{null}, new String[]{"a"}, *) = "aba"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}, *) = "wcte"
     *  (example of how it repeats)
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}, false) = "dcte"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}, true) = "tcte"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"}, true) = IllegalStateException
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"}, false) = "dcabe"
     * </pre>
     *
     * @param text
     *            text to search and replace in, no-op if null
     * @param searchList
     *            the Strings to search for, no-op if null
     * @param replacementList
     *            the Strings to replace them with, no-op if null
     * @return the text with any replacements processed, {@code null} if
     *         null String input
     * @throws IllegalStateException
     *             if the search is repeating and there is an endless loop due
     *             to outputs of one being inputs to another
     * @throws IllegalArgumentException
     *             if the lengths of the arrays are not the same (null is ok,
     *             and/or size 0)
     * @since 2.4
     */
    public static String replaceEachRepeatedly(final String text, final String[] searchList, final String[] replacementList) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7129);
        // timeToLive should be 0 if not used or nothing to replace, else it's
        // the length of the replace array
        __CLR4_4_14dm4dmldnigfmq.R.inc(7130);final int timeToLive = (((searchList == null )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7131)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7132)==0&false))? 0 : searchList.length;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7133);return replaceEach(text, searchList, replacementList, true, timeToLive);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Replaces all occurrences of Strings within another String.
     * </p>
     *
     * <p>
     * A {@code null} reference passed to this method is a no-op, or if
     * any "search string" or "string to replace" is null, that replace will be
     * ignored.
     * </p>
     *
     * <pre>
     *  StringUtils.replaceEach(null, *, *, *) = null
     *  StringUtils.replaceEach("", *, *, *) = ""
     *  StringUtils.replaceEach("aba", null, null, *) = "aba"
     *  StringUtils.replaceEach("aba", new String[0], null, *) = "aba"
     *  StringUtils.replaceEach("aba", null, new String[0], *) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, null, *) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""}, *) = "b"
     *  StringUtils.replaceEach("aba", new String[]{null}, new String[]{"a"}, *) = "aba"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}, *) = "wcte"
     *  (example of how it repeats)
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}, false) = "dcte"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}, true) = "tcte"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"}, *) = IllegalStateException
     * </pre>
     *
     * @param text
     *            text to search and replace in, no-op if null
     * @param searchList
     *            the Strings to search for, no-op if null
     * @param replacementList
     *            the Strings to replace them with, no-op if null
     * @param repeat if true, then replace repeatedly
     *       until there are no more possible replacements or timeToLive < 0
     * @param timeToLive
     *            if less than 0 then there is a circular reference and endless
     *            loop
     * @return the text with any replacements processed, {@code null} if
     *         null String input
     * @throws IllegalStateException
     *             if the search is repeating and there is an endless loop due
     *             to outputs of one being inputs to another
     * @throws IllegalArgumentException
     *             if the lengths of the arrays are not the same (null is ok,
     *             and/or size 0)
     * @since 2.4
     */
    private static String replaceEach(
            final String text, final String[] searchList, final String[] replacementList, final boolean repeat, final int timeToLive) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7134);

        // mchyzer Performance note: This creates very few new objects (one major goal)
        // let me know if there are performance requests, we can create a harness to measure

        __CLR4_4_14dm4dmldnigfmq.R.inc(7135);if ((((text == null || text.isEmpty() || searchList == null ||
                searchList.length == 0 || replacementList == null || replacementList.length == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7136)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7137)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7138);return text;
        }

        // if recursing, this shouldn't be less than 0
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7139);if ((((timeToLive < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7140)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7141)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7142);throw new IllegalStateException("Aborting to protect against StackOverflowError - " +
                                            "output of one loop is the input of another");
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7143);final int searchLength = searchList.length;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7144);final int replacementLength = replacementList.length;

        // make sure lengths are ok, these need to be equal
        __CLR4_4_14dm4dmldnigfmq.R.inc(7145);if ((((searchLength != replacementLength)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7146)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7147)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7148);throw new IllegalArgumentException("Search and Replace array lengths don't match: "
                + searchLength
                + " vs "
                + replacementLength);
        }

        // keep track of which still have matches
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7149);final boolean[] noMoreMatchesForReplIndex = new boolean[searchLength];

        // index on index that the match was found
        __CLR4_4_14dm4dmldnigfmq.R.inc(7150);int textIndex = -1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7151);int replaceIndex = -1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7152);int tempIndex = -1;

        // index of replace array that will replace the search string found
        // NOTE: logic duplicated below START
        __CLR4_4_14dm4dmldnigfmq.R.inc(7153);for (int i = 0; (((i < searchLength)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7154)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7155)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7156);if ((((noMoreMatchesForReplIndex[i] || searchList[i] == null ||
                    searchList[i].isEmpty() || replacementList[i] == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7157)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7158)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7159);continue;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(7160);tempIndex = text.indexOf(searchList[i]);

            // see if we need to keep searching for this
            __CLR4_4_14dm4dmldnigfmq.R.inc(7161);if ((((tempIndex == -1)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7162)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7163)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7164);noMoreMatchesForReplIndex[i] = true;
            } }else {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7165);if ((((textIndex == -1 || tempIndex < textIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7166)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7167)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(7168);textIndex = tempIndex;
                    __CLR4_4_14dm4dmldnigfmq.R.inc(7169);replaceIndex = i;
                }
            }}
        }}
        // NOTE: logic mostly below END

        // no search strings found, we are done
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7170);if ((((textIndex == -1)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7171)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7172)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7173);return text;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7174);int start = 0;

        // get a good guess on the size of the result buffer so it doesn't have to double if it goes over a bit
        __CLR4_4_14dm4dmldnigfmq.R.inc(7175);int increase = 0;

        // count the replacement text elements that are larger than their corresponding text being replaced
        __CLR4_4_14dm4dmldnigfmq.R.inc(7176);for (int i = 0; (((i < searchList.length)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7177)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7178)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7179);if ((((searchList[i] == null || replacementList[i] == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7180)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7181)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7182);continue;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(7183);final int greater = replacementList[i].length() - searchList[i].length();
            __CLR4_4_14dm4dmldnigfmq.R.inc(7184);if ((((greater > 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7185)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7186)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7187);increase += 3 * greater; // assume 3 matches
            }
        }}
        // have upper-bound at 20% increase, then let Java take over
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7188);increase = Math.min(increase, text.length() / 5);

        __CLR4_4_14dm4dmldnigfmq.R.inc(7189);final StringBuilder buf = new StringBuilder(text.length() + increase);

        __CLR4_4_14dm4dmldnigfmq.R.inc(7190);while ((((textIndex != -1)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7191)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7192)==0&false))) {{

            __CLR4_4_14dm4dmldnigfmq.R.inc(7193);for (int i = start; (((i < textIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7194)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7195)==0&false)); i++) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7196);buf.append(text.charAt(i));
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(7197);buf.append(replacementList[replaceIndex]);

            __CLR4_4_14dm4dmldnigfmq.R.inc(7198);start = textIndex + searchList[replaceIndex].length();

            __CLR4_4_14dm4dmldnigfmq.R.inc(7199);textIndex = -1;
            __CLR4_4_14dm4dmldnigfmq.R.inc(7200);replaceIndex = -1;
            __CLR4_4_14dm4dmldnigfmq.R.inc(7201);tempIndex = -1;
            // find the next earliest match
            // NOTE: logic mostly duplicated above START
            __CLR4_4_14dm4dmldnigfmq.R.inc(7202);for (int i = 0; (((i < searchLength)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7203)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7204)==0&false)); i++) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7205);if ((((noMoreMatchesForReplIndex[i] || searchList[i] == null ||
                        searchList[i].isEmpty() || replacementList[i] == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7206)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7207)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(7208);continue;
                }
                }__CLR4_4_14dm4dmldnigfmq.R.inc(7209);tempIndex = text.indexOf(searchList[i], start);

                // see if we need to keep searching for this
                __CLR4_4_14dm4dmldnigfmq.R.inc(7210);if ((((tempIndex == -1)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7211)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7212)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(7213);noMoreMatchesForReplIndex[i] = true;
                } }else {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(7214);if ((((textIndex == -1 || tempIndex < textIndex)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7215)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7216)==0&false))) {{
                        __CLR4_4_14dm4dmldnigfmq.R.inc(7217);textIndex = tempIndex;
                        __CLR4_4_14dm4dmldnigfmq.R.inc(7218);replaceIndex = i;
                    }
                }}
            }}
            // NOTE: logic duplicated above END

        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7219);final int textLength = text.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7220);for (int i = start; (((i < textLength)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7221)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7222)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7223);buf.append(text.charAt(i));
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7224);final String result = buf.toString();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7225);if ((((!repeat)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7226)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7227)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7228);return result;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7229);return replaceEach(result, searchList, replacementList, repeat, timeToLive - 1);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Replace, character based
    //-----------------------------------------------------------------------
    /**
     * <p>Replaces all occurrences of a character in a String with another.
     * This is a null-safe version of {@link String#replace(char, char)}.</p>
     *
     * <p>A {@code null} string input returns {@code null}.
     * An empty ("") string input returns an empty string.</p>
     *
     * <pre>
     * StringUtils.replaceChars(null, *, *)        = null
     * StringUtils.replaceChars("", *, *)          = ""
     * StringUtils.replaceChars("abcba", 'b', 'y') = "aycya"
     * StringUtils.replaceChars("abcba", 'z', 'y') = "abcba"
     * </pre>
     *
     * @param str  String to replace characters in, may be null
     * @param searchChar  the character to search for, may be null
     * @param replaceChar  the character to replace, may be null
     * @return modified String, {@code null} if null string input
     * @since 2.0
     */
    public static String replaceChars(final String str, final char searchChar, final char replaceChar) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7230);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7231);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7232)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7233)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7234);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7235);return str.replace(searchChar, replaceChar);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Replaces multiple characters in a String in one go.
     * This method can also be used to delete characters.</p>
     *
     * <p>For example:<br />
     * <code>replaceChars(&quot;hello&quot;, &quot;ho&quot;, &quot;jy&quot;) = jelly</code>.</p>
     *
     * <p>A {@code null} string input returns {@code null}.
     * An empty ("") string input returns an empty string.
     * A null or empty set of search characters returns the input string.</p>
     *
     * <p>The length of the search characters should normally equal the length
     * of the replace characters.
     * If the search characters is longer, then the extra search characters
     * are deleted.
     * If the search characters is shorter, then the extra replace characters
     * are ignored.</p>
     *
     * <pre>
     * StringUtils.replaceChars(null, *, *)           = null
     * StringUtils.replaceChars("", *, *)             = ""
     * StringUtils.replaceChars("abc", null, *)       = "abc"
     * StringUtils.replaceChars("abc", "", *)         = "abc"
     * StringUtils.replaceChars("abc", "b", null)     = "ac"
     * StringUtils.replaceChars("abc", "b", "")       = "ac"
     * StringUtils.replaceChars("abcba", "bc", "yz")  = "ayzya"
     * StringUtils.replaceChars("abcba", "bc", "y")   = "ayya"
     * StringUtils.replaceChars("abcba", "bc", "yzx") = "ayzya"
     * </pre>
     *
     * @param str  String to replace characters in, may be null
     * @param searchChars  a set of characters to search for, may be null
     * @param replaceChars  a set of characters to replace, may be null
     * @return modified String, {@code null} if null string input
     * @since 2.0
     */
    public static String replaceChars(final String str, final String searchChars, String replaceChars) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7236);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7237);if ((((isEmpty(str) || isEmpty(searchChars))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7238)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7239)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7240);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7241);if ((((replaceChars == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7242)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7243)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7244);replaceChars = EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7245);boolean modified = false;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7246);final int replaceCharsLength = replaceChars.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7247);final int strLength = str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7248);final StringBuilder buf = new StringBuilder(strLength);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7249);for (int i = 0; (((i < strLength)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7250)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7251)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7252);final char ch = str.charAt(i);
            __CLR4_4_14dm4dmldnigfmq.R.inc(7253);final int index = searchChars.indexOf(ch);
            __CLR4_4_14dm4dmldnigfmq.R.inc(7254);if ((((index >= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7255)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7256)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7257);modified = true;
                __CLR4_4_14dm4dmldnigfmq.R.inc(7258);if ((((index < replaceCharsLength)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7259)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7260)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(7261);buf.append(replaceChars.charAt(index));
                }
            }} }else {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7262);buf.append(ch);
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7263);if ((((modified)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7264)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7265)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7266);return buf.toString();
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7267);return str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Overlay
    //-----------------------------------------------------------------------
    /**
     * <p>Overlays part of a String with another String.</p>
     *
     * <p>A {@code null} string input returns {@code null}.
     * A negative index is treated as zero.
     * An index greater than the string length is treated as the string length.
     * The start index is always the smaller of the two indices.</p>
     *
     * <pre>
     * StringUtils.overlay(null, *, *, *)            = null
     * StringUtils.overlay("", "abc", 0, 0)          = "abc"
     * StringUtils.overlay("abcdef", null, 2, 4)     = "abef"
     * StringUtils.overlay("abcdef", "", 2, 4)       = "abef"
     * StringUtils.overlay("abcdef", "", 4, 2)       = "abef"
     * StringUtils.overlay("abcdef", "zzzz", 2, 4)   = "abzzzzef"
     * StringUtils.overlay("abcdef", "zzzz", 4, 2)   = "abzzzzef"
     * StringUtils.overlay("abcdef", "zzzz", -1, 4)  = "zzzzef"
     * StringUtils.overlay("abcdef", "zzzz", 2, 8)   = "abzzzz"
     * StringUtils.overlay("abcdef", "zzzz", -2, -3) = "zzzzabcdef"
     * StringUtils.overlay("abcdef", "zzzz", 8, 10)  = "abcdefzzzz"
     * </pre>
     *
     * @param str  the String to do overlaying in, may be null
     * @param overlay  the String to overlay, may be null
     * @param start  the position to start overlaying at
     * @param end  the position to stop overlaying before
     * @return overlayed String, {@code null} if null String input
     * @since 2.0
     */
    public static String overlay(final String str, String overlay, int start, int end) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7268);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7269);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7270)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7271)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7272);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7273);if ((((overlay == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7274)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7275)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7276);overlay = EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7277);final int len = str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7278);if ((((start < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7279)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7280)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7281);start = 0;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7282);if ((((start > len)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7283)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7284)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7285);start = len;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7286);if ((((end < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7287)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7288)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7289);end = 0;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7290);if ((((end > len)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7291)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7292)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7293);end = len;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7294);if ((((start > end)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7295)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7296)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7297);final int temp = start;
            __CLR4_4_14dm4dmldnigfmq.R.inc(7298);start = end;
            __CLR4_4_14dm4dmldnigfmq.R.inc(7299);end = temp;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7300);return new StringBuilder(len + start - end + overlay.length() + 1)
            .append(str.substring(0, start))
            .append(overlay)
            .append(str.substring(end))
            .toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Chomping
    //-----------------------------------------------------------------------
    /**
     * <p>Removes one newline from end of a String if it's there,
     * otherwise leave it alone.  A newline is &quot;{@code \n}&quot;,
     * &quot;{@code \r}&quot;, or &quot;{@code \r\n}&quot;.</p>
     *
     * <p>NOTE: This method changed in 2.0.
     * It now more closely matches Perl chomp.</p>
     *
     * <pre>
     * StringUtils.chomp(null)          = null
     * StringUtils.chomp("")            = ""
     * StringUtils.chomp("abc \r")      = "abc "
     * StringUtils.chomp("abc\n")       = "abc"
     * StringUtils.chomp("abc\r\n")     = "abc"
     * StringUtils.chomp("abc\r\n\r\n") = "abc\r\n"
     * StringUtils.chomp("abc\n\r")     = "abc\n"
     * StringUtils.chomp("abc\n\rabc")  = "abc\n\rabc"
     * StringUtils.chomp("\r")          = ""
     * StringUtils.chomp("\n")          = ""
     * StringUtils.chomp("\r\n")        = ""
     * </pre>
     *
     * @param str  the String to chomp a newline from, may be null
     * @return String without newline, {@code null} if null String input
     */
    public static String chomp(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7301);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7302);if ((((isEmpty(str))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7303)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7304)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7305);return str;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7306);if ((((str.length() == 1)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7307)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7308)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7309);final char ch = str.charAt(0);
            __CLR4_4_14dm4dmldnigfmq.R.inc(7310);if ((((ch == CharUtils.CR || ch == CharUtils.LF)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7311)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7312)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7313);return EMPTY;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(7314);return str;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7315);int lastIdx = str.length() - 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7316);final char last = str.charAt(lastIdx);

        __CLR4_4_14dm4dmldnigfmq.R.inc(7317);if ((((last == CharUtils.LF)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7318)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7319)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7320);if ((((str.charAt(lastIdx - 1) == CharUtils.CR)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7321)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7322)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7323);lastIdx--;
            }
        }} }else {__CLR4_4_14dm4dmldnigfmq.R.inc(7324);if ((((last != CharUtils.CR)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7325)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7326)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7327);lastIdx++;
        }
        }}__CLR4_4_14dm4dmldnigfmq.R.inc(7328);return str.substring(0, lastIdx);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Removes {@code separator} from the end of
     * {@code str} if it's there, otherwise leave it alone.</p>
     *
     * <p>NOTE: This method changed in version 2.0.
     * It now more closely matches Perl chomp.
     * For the previous behavior, use {@link #substringBeforeLast(String, String)}.
     * This method uses {@link String#endsWith(String)}.</p>
     *
     * <pre>
     * StringUtils.chomp(null, *)         = null
     * StringUtils.chomp("", *)           = ""
     * StringUtils.chomp("foobar", "bar") = "foo"
     * StringUtils.chomp("foobar", "baz") = "foobar"
     * StringUtils.chomp("foo", "foo")    = ""
     * StringUtils.chomp("foo ", "foo")   = "foo "
     * StringUtils.chomp(" foo", "foo")   = " "
     * StringUtils.chomp("foo", "foooo")  = "foo"
     * StringUtils.chomp("foo", "")       = "foo"
     * StringUtils.chomp("foo", null)     = "foo"
     * </pre>
     *
     * @param str  the String to chomp from, may be null
     * @param separator  separator String, may be null
     * @return String without trailing separator, {@code null} if null String input
     * @deprecated This feature will be removed in Lang 4.0, use {@link StringUtils#removeEnd(String, String)} instead
     */
    @Deprecated
    public static String chomp(final String str, final String separator) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7329);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7330);return removeEnd(str,separator);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Chopping
    //-----------------------------------------------------------------------
    /**
     * <p>Remove the last character from a String.</p>
     *
     * <p>If the String ends in {@code \r\n}, then remove both
     * of them.</p>
     *
     * <pre>
     * StringUtils.chop(null)          = null
     * StringUtils.chop("")            = ""
     * StringUtils.chop("abc \r")      = "abc "
     * StringUtils.chop("abc\n")       = "abc"
     * StringUtils.chop("abc\r\n")     = "abc"
     * StringUtils.chop("abc")         = "ab"
     * StringUtils.chop("abc\nabc")    = "abc\nab"
     * StringUtils.chop("a")           = ""
     * StringUtils.chop("\r")          = ""
     * StringUtils.chop("\n")          = ""
     * StringUtils.chop("\r\n")        = ""
     * </pre>
     *
     * @param str  the String to chop last character from, may be null
     * @return String without last character, {@code null} if null String input
     */
    public static String chop(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7331);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7332);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7333)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7334)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7335);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7336);final int strLen = str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7337);if ((((strLen < 2)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7338)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7339)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7340);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7341);final int lastIdx = strLen - 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7342);final String ret = str.substring(0, lastIdx);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7343);final char last = str.charAt(lastIdx);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7344);if ((((last == CharUtils.LF && ret.charAt(lastIdx - 1) == CharUtils.CR)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7345)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7346)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7347);return ret.substring(0, lastIdx - 1);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7348);return ret;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------

    // Padding
    //-----------------------------------------------------------------------
    /**
     * <p>Repeat a String {@code repeat} times to form a
     * new String.</p>
     *
     * <pre>
     * StringUtils.repeat(null, 2) = null
     * StringUtils.repeat("", 0)   = ""
     * StringUtils.repeat("", 2)   = ""
     * StringUtils.repeat("a", 3)  = "aaa"
     * StringUtils.repeat("ab", 2) = "abab"
     * StringUtils.repeat("a", -2) = ""
     * </pre>
     *
     * @param str  the String to repeat, may be null
     * @param repeat  number of times to repeat str, negative treated as zero
     * @return a new String consisting of the original String repeated,
     *  {@code null} if null String input
     */
    public static String repeat(final String str, final int repeat) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7349);
        // Performance tuned for 2.0 (JDK1.4)

        __CLR4_4_14dm4dmldnigfmq.R.inc(7350);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7351)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7352)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7353);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7354);if ((((repeat <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7355)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7356)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7357);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7358);final int inputLength = str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7359);if ((((repeat == 1 || inputLength == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7360)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7361)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7362);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7363);if ((((inputLength == 1 && repeat <= PAD_LIMIT)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7364)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7365)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7366);return repeat(str.charAt(0), repeat);
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7367);final int outputLength = inputLength * repeat;
        boolean __CLB4_4_1_bool0=false;__CLR4_4_14dm4dmldnigfmq.R.inc(7368);switch (inputLength) {
            case 1 :if (!__CLB4_4_1_bool0) {__CLR4_4_14dm4dmldnigfmq.R.inc(7369);__CLB4_4_1_bool0=true;}
                __CLR4_4_14dm4dmldnigfmq.R.inc(7370);return repeat(str.charAt(0), repeat);
            case 2 :if (!__CLB4_4_1_bool0) {__CLR4_4_14dm4dmldnigfmq.R.inc(7371);__CLB4_4_1_bool0=true;}
                __CLR4_4_14dm4dmldnigfmq.R.inc(7372);final char ch0 = str.charAt(0);
                __CLR4_4_14dm4dmldnigfmq.R.inc(7373);final char ch1 = str.charAt(1);
                __CLR4_4_14dm4dmldnigfmq.R.inc(7374);final char[] output2 = new char[outputLength];
                __CLR4_4_14dm4dmldnigfmq.R.inc(7375);for (int i = repeat * 2 - 2; (((i >= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7376)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7377)==0&false)); i--, i--) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(7378);output2[i] = ch0;
                    __CLR4_4_14dm4dmldnigfmq.R.inc(7379);output2[i + 1] = ch1;
                }
                }__CLR4_4_14dm4dmldnigfmq.R.inc(7380);return new String(output2);
            default :if (!__CLB4_4_1_bool0) {__CLR4_4_14dm4dmldnigfmq.R.inc(7381);__CLB4_4_1_bool0=true;}
                __CLR4_4_14dm4dmldnigfmq.R.inc(7382);final StringBuilder buf = new StringBuilder(outputLength);
                __CLR4_4_14dm4dmldnigfmq.R.inc(7383);for (int i = 0; (((i < repeat)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7384)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7385)==0&false)); i++) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(7386);buf.append(str);
                }
                }__CLR4_4_14dm4dmldnigfmq.R.inc(7387);return buf.toString();
        }
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Repeat a String {@code repeat} times to form a
     * new String, with a String separator injected each time. </p>
     *
     * <pre>
     * StringUtils.repeat(null, null, 2) = null
     * StringUtils.repeat(null, "x", 2)  = null
     * StringUtils.repeat("", null, 0)   = ""
     * StringUtils.repeat("", "", 2)     = ""
     * StringUtils.repeat("", "x", 3)    = "xxx"
     * StringUtils.repeat("?", ", ", 3)  = "?, ?, ?"
     * </pre>
     *
     * @param str        the String to repeat, may be null
     * @param separator  the String to inject, may be null
     * @param repeat     number of times to repeat str, negative treated as zero
     * @return a new String consisting of the original String repeated,
     *  {@code null} if null String input
     * @since 2.5
     */
    public static String repeat(final String str, final String separator, final int repeat) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7388);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7389);if((((str == null || separator == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7390)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7391)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7392);return repeat(str, repeat);
        }
        // given that repeat(String, int) is quite optimized, better to rely on it than try and splice this into it
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7393);final String result = repeat(str + separator, repeat);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7394);return removeEnd(result, separator);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Returns padding using the specified delimiter repeated
     * to a given length.</p>
     *
     * <pre>
     * StringUtils.repeat('e', 0)  = ""
     * StringUtils.repeat('e', 3)  = "eee"
     * StringUtils.repeat('e', -2) = ""
     * </pre>
     *
     * <p>Note: this method doesn't not support padding with
     * <a href="http://www.unicode.org/glossary/#supplementary_character">Unicode Supplementary Characters</a>
     * as they require a pair of {@code char}s to be represented.
     * If you are needing to support full I18N of your applications
     * consider using {@link #repeat(String, int)} instead.
     * </p>
     *
     * @param ch  character to repeat
     * @param repeat  number of times to repeat char, negative treated as zero
     * @return String with repeated character
     * @see #repeat(String, int)
     */
    public static String repeat(final char ch, final int repeat) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7395);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7396);final char[] buf = new char[repeat];
        __CLR4_4_14dm4dmldnigfmq.R.inc(7397);for (int i = repeat - 1; (((i >= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7398)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7399)==0&false)); i--) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7400);buf[i] = ch;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7401);return new String(buf);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Right pad a String with spaces (' ').</p>
     *
     * <p>The String is padded to the size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.rightPad(null, *)   = null
     * StringUtils.rightPad("", 3)     = "   "
     * StringUtils.rightPad("bat", 3)  = "bat"
     * StringUtils.rightPad("bat", 5)  = "bat  "
     * StringUtils.rightPad("bat", 1)  = "bat"
     * StringUtils.rightPad("bat", -1) = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @return right padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
    public static String rightPad(final String str, final int size) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7402);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7403);return rightPad(str, size, ' ');
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Right pad a String with a specified character.</p>
     *
     * <p>The String is padded to the size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.rightPad(null, *, *)     = null
     * StringUtils.rightPad("", 3, 'z')     = "zzz"
     * StringUtils.rightPad("bat", 3, 'z')  = "bat"
     * StringUtils.rightPad("bat", 5, 'z')  = "batzz"
     * StringUtils.rightPad("bat", 1, 'z')  = "bat"
     * StringUtils.rightPad("bat", -1, 'z') = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padChar  the character to pad with
     * @return right padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String rightPad(final String str, final int size, final char padChar) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7404);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7405);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7406)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7407)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7408);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7409);final int pads = size - str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7410);if ((((pads <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7411)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7412)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7413);return str; // returns original String when possible
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7414);if ((((pads > PAD_LIMIT)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7415)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7416)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7417);return rightPad(str, size, String.valueOf(padChar));
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7418);return str.concat(repeat(padChar, pads));
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Right pad a String with a specified String.</p>
     *
     * <p>The String is padded to the size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.rightPad(null, *, *)      = null
     * StringUtils.rightPad("", 3, "z")      = "zzz"
     * StringUtils.rightPad("bat", 3, "yz")  = "bat"
     * StringUtils.rightPad("bat", 5, "yz")  = "batyz"
     * StringUtils.rightPad("bat", 8, "yz")  = "batyzyzy"
     * StringUtils.rightPad("bat", 1, "yz")  = "bat"
     * StringUtils.rightPad("bat", -1, "yz") = "bat"
     * StringUtils.rightPad("bat", 5, null)  = "bat  "
     * StringUtils.rightPad("bat", 5, "")    = "bat  "
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padStr  the String to pad with, null or empty treated as single space
     * @return right padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
    public static String rightPad(final String str, final int size, String padStr) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7419);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7420);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7421)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7422)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7423);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7424);if ((((isEmpty(padStr))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7425)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7426)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7427);padStr = SPACE;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7428);final int padLen = padStr.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7429);final int strLen = str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7430);final int pads = size - strLen;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7431);if ((((pads <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7432)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7433)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7434);return str; // returns original String when possible
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7435);if ((((padLen == 1 && pads <= PAD_LIMIT)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7436)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7437)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7438);return rightPad(str, size, padStr.charAt(0));
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7439);if ((((pads == padLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7440)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7441)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7442);return str.concat(padStr);
        } }else {__CLR4_4_14dm4dmldnigfmq.R.inc(7443);if ((((pads < padLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7444)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7445)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7446);return str.concat(padStr.substring(0, pads));
        } }else {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7447);final char[] padding = new char[pads];
            __CLR4_4_14dm4dmldnigfmq.R.inc(7448);final char[] padChars = padStr.toCharArray();
            __CLR4_4_14dm4dmldnigfmq.R.inc(7449);for (int i = 0; (((i < pads)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7450)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7451)==0&false)); i++) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7452);padding[i] = padChars[i % padLen];
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(7453);return str.concat(new String(padding));
        }
    }}}finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Left pad a String with spaces (' ').</p>
     *
     * <p>The String is padded to the size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.leftPad(null, *)   = null
     * StringUtils.leftPad("", 3)     = "   "
     * StringUtils.leftPad("bat", 3)  = "bat"
     * StringUtils.leftPad("bat", 5)  = "  bat"
     * StringUtils.leftPad("bat", 1)  = "bat"
     * StringUtils.leftPad("bat", -1) = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @return left padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
    public static String leftPad(final String str, final int size) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7454);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7455);return leftPad(str, size, ' ');
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Left pad a String with a specified character.</p>
     *
     * <p>Pad to a size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.leftPad(null, *, *)     = null
     * StringUtils.leftPad("", 3, 'z')     = "zzz"
     * StringUtils.leftPad("bat", 3, 'z')  = "bat"
     * StringUtils.leftPad("bat", 5, 'z')  = "zzbat"
     * StringUtils.leftPad("bat", 1, 'z')  = "bat"
     * StringUtils.leftPad("bat", -1, 'z') = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padChar  the character to pad with
     * @return left padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String leftPad(final String str, final int size, final char padChar) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7456);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7457);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7458)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7459)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7460);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7461);final int pads = size - str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7462);if ((((pads <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7463)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7464)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7465);return str; // returns original String when possible
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7466);if ((((pads > PAD_LIMIT)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7467)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7468)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7469);return leftPad(str, size, String.valueOf(padChar));
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7470);return repeat(padChar, pads).concat(str);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Left pad a String with a specified String.</p>
     *
     * <p>Pad to a size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.leftPad(null, *, *)      = null
     * StringUtils.leftPad("", 3, "z")      = "zzz"
     * StringUtils.leftPad("bat", 3, "yz")  = "bat"
     * StringUtils.leftPad("bat", 5, "yz")  = "yzbat"
     * StringUtils.leftPad("bat", 8, "yz")  = "yzyzybat"
     * StringUtils.leftPad("bat", 1, "yz")  = "bat"
     * StringUtils.leftPad("bat", -1, "yz") = "bat"
     * StringUtils.leftPad("bat", 5, null)  = "  bat"
     * StringUtils.leftPad("bat", 5, "")    = "  bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padStr  the String to pad with, null or empty treated as single space
     * @return left padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
    public static String leftPad(final String str, final int size, String padStr) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7471);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7472);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7473)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7474)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7475);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7476);if ((((isEmpty(padStr))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7477)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7478)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7479);padStr = SPACE;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7480);final int padLen = padStr.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7481);final int strLen = str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7482);final int pads = size - strLen;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7483);if ((((pads <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7484)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7485)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7486);return str; // returns original String when possible
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7487);if ((((padLen == 1 && pads <= PAD_LIMIT)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7488)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7489)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7490);return leftPad(str, size, padStr.charAt(0));
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7491);if ((((pads == padLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7492)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7493)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7494);return padStr.concat(str);
        } }else {__CLR4_4_14dm4dmldnigfmq.R.inc(7495);if ((((pads < padLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7496)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7497)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7498);return padStr.substring(0, pads).concat(str);
        } }else {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7499);final char[] padding = new char[pads];
            __CLR4_4_14dm4dmldnigfmq.R.inc(7500);final char[] padChars = padStr.toCharArray();
            __CLR4_4_14dm4dmldnigfmq.R.inc(7501);for (int i = 0; (((i < pads)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7502)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7503)==0&false)); i++) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7504);padding[i] = padChars[i % padLen];
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(7505);return new String(padding).concat(str);
        }
    }}}finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Gets a CharSequence length or {@code 0} if the CharSequence is
     * {@code null}.
     *
     * @param cs
     *            a CharSequence or {@code null}
     * @return CharSequence length or {@code 0} if the CharSequence is
     *         {@code null}.
     * @since 2.4
     * @since 3.0 Changed signature from length(String) to length(CharSequence)
     */
    public static int length(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7506);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7507);return (((cs == null )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7508)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7509)==0&false))? 0 : cs.length();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Centering
    //-----------------------------------------------------------------------
    /**
     * <p>Centers a String in a larger String of size {@code size}
     * using the space character (' ').<p>
     *
     * <p>If the size is less than the String length, the String is returned.
     * A {@code null} String returns {@code null}.
     * A negative size is treated as zero.</p>
     *
     * <p>Equivalent to {@code center(str, size, " ")}.</p>
     *
     * <pre>
     * StringUtils.center(null, *)   = null
     * StringUtils.center("", 4)     = "    "
     * StringUtils.center("ab", -1)  = "ab"
     * StringUtils.center("ab", 4)   = " ab "
     * StringUtils.center("abcd", 2) = "abcd"
     * StringUtils.center("a", 4)    = " a  "
     * </pre>
     *
     * @param str  the String to center, may be null
     * @param size  the int size of new String, negative treated as zero
     * @return centered String, {@code null} if null String input
     */
    public static String center(final String str, final int size) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7510);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7511);return center(str, size, ' ');
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Centers a String in a larger String of size {@code size}.
     * Uses a supplied character as the value to pad the String with.</p>
     *
     * <p>If the size is less than the String length, the String is returned.
     * A {@code null} String returns {@code null}.
     * A negative size is treated as zero.</p>
     *
     * <pre>
     * StringUtils.center(null, *, *)     = null
     * StringUtils.center("", 4, ' ')     = "    "
     * StringUtils.center("ab", -1, ' ')  = "ab"
     * StringUtils.center("ab", 4, ' ')   = " ab "
     * StringUtils.center("abcd", 2, ' ') = "abcd"
     * StringUtils.center("a", 4, ' ')    = " a  "
     * StringUtils.center("a", 4, 'y')    = "yayy"
     * </pre>
     *
     * @param str  the String to center, may be null
     * @param size  the int size of new String, negative treated as zero
     * @param padChar  the character to pad the new String with
     * @return centered String, {@code null} if null String input
     * @since 2.0
     */
    public static String center(String str, final int size, final char padChar) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7512);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7513);if ((((str == null || size <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7514)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7515)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7516);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7517);final int strLen = str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7518);final int pads = size - strLen;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7519);if ((((pads <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7520)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7521)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7522);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7523);str = leftPad(str, strLen + pads / 2, padChar);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7524);str = rightPad(str, size, padChar);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7525);return str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Centers a String in a larger String of size {@code size}.
     * Uses a supplied String as the value to pad the String with.</p>
     *
     * <p>If the size is less than the String length, the String is returned.
     * A {@code null} String returns {@code null}.
     * A negative size is treated as zero.</p>
     *
     * <pre>
     * StringUtils.center(null, *, *)     = null
     * StringUtils.center("", 4, " ")     = "    "
     * StringUtils.center("ab", -1, " ")  = "ab"
     * StringUtils.center("ab", 4, " ")   = " ab "
     * StringUtils.center("abcd", 2, " ") = "abcd"
     * StringUtils.center("a", 4, " ")    = " a  "
     * StringUtils.center("a", 4, "yz")   = "yayz"
     * StringUtils.center("abc", 7, null) = "  abc  "
     * StringUtils.center("abc", 7, "")   = "  abc  "
     * </pre>
     *
     * @param str  the String to center, may be null
     * @param size  the int size of new String, negative treated as zero
     * @param padStr  the String to pad the new String with, must not be null or empty
     * @return centered String, {@code null} if null String input
     * @throws IllegalArgumentException if padStr is {@code null} or empty
     */
    public static String center(String str, final int size, String padStr) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7526);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7527);if ((((str == null || size <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7528)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7529)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7530);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7531);if ((((isEmpty(padStr))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7532)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7533)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7534);padStr = SPACE;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7535);final int strLen = str.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7536);final int pads = size - strLen;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7537);if ((((pads <= 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7538)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7539)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7540);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7541);str = leftPad(str, strLen + pads / 2, padStr);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7542);str = rightPad(str, size, padStr);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7543);return str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Case conversion
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a String to upper case as per {@link String#toUpperCase()}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.upperCase(null)  = null
     * StringUtils.upperCase("")    = ""
     * StringUtils.upperCase("aBc") = "ABC"
     * </pre>
     *
     * <p><strong>Note:</strong> As described in the documentation for {@link String#toUpperCase()},
     * the result of this method is affected by the current locale.
     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}
     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).</p>
     *
     * @param str  the String to upper case, may be null
     * @return the upper cased String, {@code null} if null String input
     */
    public static String upperCase(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7544);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7545);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7546)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7547)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7548);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7549);return str.toUpperCase();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Converts a String to upper case as per {@link String#toUpperCase(Locale)}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.upperCase(null, Locale.ENGLISH)  = null
     * StringUtils.upperCase("", Locale.ENGLISH)    = ""
     * StringUtils.upperCase("aBc", Locale.ENGLISH) = "ABC"
     * </pre>
     *
     * @param str  the String to upper case, may be null
     * @param locale  the locale that defines the case transformation rules, must not be null
     * @return the upper cased String, {@code null} if null String input
     * @since 2.5
     */
    public static String upperCase(final String str, final Locale locale) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7550);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7551);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7552)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7553)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7554);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7555);return str.toUpperCase(locale);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Converts a String to lower case as per {@link String#toLowerCase()}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.lowerCase(null)  = null
     * StringUtils.lowerCase("")    = ""
     * StringUtils.lowerCase("aBc") = "abc"
     * </pre>
     *
     * <p><strong>Note:</strong> As described in the documentation for {@link String#toLowerCase()},
     * the result of this method is affected by the current locale.
     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}
     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).</p>
     *
     * @param str  the String to lower case, may be null
     * @return the lower cased String, {@code null} if null String input
     */
    public static String lowerCase(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7556);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7557);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7558)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7559)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7560);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7561);return str.toLowerCase();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Converts a String to lower case as per {@link String#toLowerCase(Locale)}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.lowerCase(null, Locale.ENGLISH)  = null
     * StringUtils.lowerCase("", Locale.ENGLISH)    = ""
     * StringUtils.lowerCase("aBc", Locale.ENGLISH) = "abc"
     * </pre>
     *
     * @param str  the String to lower case, may be null
     * @param locale  the locale that defines the case transformation rules, must not be null
     * @return the lower cased String, {@code null} if null String input
     * @since 2.5
     */
    public static String lowerCase(final String str, final Locale locale) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7562);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7563);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7564)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7565)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7566);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7567);return str.toLowerCase(locale);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Capitalizes a String changing the first letter to title case as
     * per {@link Character#toTitleCase(char)}. No other letters are changed.</p>
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#capitalize(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.capitalize(null)  = null
     * StringUtils.capitalize("")    = ""
     * StringUtils.capitalize("cat") = "Cat"
     * StringUtils.capitalize("cAt") = "CAt"
     * </pre>
     *
     * @param str the String to capitalize, may be null
     * @return the capitalized String, {@code null} if null String input
     * @see org.apache.commons.lang3.text.WordUtils#capitalize(String)
     * @see #uncapitalize(String)
     * @since 2.0
     */
    public static String capitalize(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7568);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7569);int strLen;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7570);if (str == null || (strLen = str.length()) == 0) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7573);return str;
        }
        
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7574);char firstChar = str.charAt(0);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7575);if ((((Character.isTitleCase(firstChar))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7576)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7577)==0&false))) {{
        	// already capitalized
        	__CLR4_4_14dm4dmldnigfmq.R.inc(7578);return str;
        }
        
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7579);return new StringBuilder(strLen)
            .append(Character.toTitleCase(firstChar))
            .append(str.substring(1))
            .toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Uncapitalizes a String changing the first letter to title case as
     * per {@link Character#toLowerCase(char)}. No other letters are changed.</p>
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#uncapitalize(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.uncapitalize(null)  = null
     * StringUtils.uncapitalize("")    = ""
     * StringUtils.uncapitalize("Cat") = "cat"
     * StringUtils.uncapitalize("CAT") = "cAT"
     * </pre>
     *
     * @param str the String to uncapitalize, may be null
     * @return the uncapitalized String, {@code null} if null String input
     * @see org.apache.commons.lang3.text.WordUtils#uncapitalize(String)
     * @see #capitalize(String)
     * @since 2.0
     */
    public static String uncapitalize(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7580);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7581);int strLen;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7582);if (str == null || (strLen = str.length()) == 0) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7585);return str;
        }
        
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7586);char firstChar = str.charAt(0);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7587);if ((((Character.isLowerCase(firstChar))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7588)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7589)==0&false))) {{
        	// already uncapitalized
        	__CLR4_4_14dm4dmldnigfmq.R.inc(7590);return str;
        }
        
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7591);return new StringBuilder(strLen)
            .append(Character.toLowerCase(firstChar))
            .append(str.substring(1))
            .toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Swaps the case of a String changing upper and title case to
     * lower case, and lower case to upper case.</p>
     *
     * <ul>
     *  <li>Upper case character converts to Lower case</li>
     *  <li>Title case character converts to Lower case</li>
     *  <li>Lower case character converts to Upper case</li>
     * </ul>
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#swapCase(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.swapCase(null)                 = null
     * StringUtils.swapCase("")                   = ""
     * StringUtils.swapCase("The dog has a BONE") = "tHE DOG HAS A bone"
     * </pre>
     *
     * <p>NOTE: This method changed in Lang version 2.0.
     * It no longer performs a word based algorithm.
     * If you only use ASCII, you will notice no change.
     * That functionality is available in org.apache.commons.lang3.text.WordUtils.</p>
     *
     * @param str  the String to swap case, may be null
     * @return the changed String, {@code null} if null String input
     */
    public static String swapCase(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7592);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7593);if ((((StringUtils.isEmpty(str))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7594)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7595)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7596);return str;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7597);final char[] buffer = str.toCharArray();

        __CLR4_4_14dm4dmldnigfmq.R.inc(7598);for (int i = 0; (((i < buffer.length)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7599)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7600)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7601);final char ch = buffer[i];
            __CLR4_4_14dm4dmldnigfmq.R.inc(7602);if ((((Character.isUpperCase(ch))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7603)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7604)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7605);buffer[i] = Character.toLowerCase(ch);
            } }else {__CLR4_4_14dm4dmldnigfmq.R.inc(7606);if ((((Character.isTitleCase(ch))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7607)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7608)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7609);buffer[i] = Character.toLowerCase(ch);
            } }else {__CLR4_4_14dm4dmldnigfmq.R.inc(7610);if ((((Character.isLowerCase(ch))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7611)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7612)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7613);buffer[i] = Character.toUpperCase(ch);
            }
        }}}}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7614);return new String(buffer);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Count matches
    //-----------------------------------------------------------------------
    /**
     * <p>Counts how many times the substring appears in the larger string.</p>
     *
     * <p>A {@code null} or empty ("") String input returns {@code 0}.</p>
     *
     * <pre>
     * StringUtils.countMatches(null, *)       = 0
     * StringUtils.countMatches("", *)         = 0
     * StringUtils.countMatches("abba", null)  = 0
     * StringUtils.countMatches("abba", "")    = 0
     * StringUtils.countMatches("abba", "a")   = 2
     * StringUtils.countMatches("abba", "ab")  = 1
     * StringUtils.countMatches("abba", "xxx") = 0
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param sub  the substring to count, may be null
     * @return the number of occurrences, 0 if either CharSequence is {@code null}
     * @since 3.0 Changed signature from countMatches(String, String) to countMatches(CharSequence, CharSequence)
     */
    public static int countMatches(final CharSequence str, final CharSequence sub) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7615);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7616);if ((((isEmpty(str) || isEmpty(sub))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7617)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7618)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7619);return 0;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7620);int count = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7621);int idx = 0;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7622);while ((idx = CharSequenceUtils.indexOf(str, sub, idx)) != INDEX_NOT_FOUND) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7625);count++;
            __CLR4_4_14dm4dmldnigfmq.R.inc(7626);idx += sub.length();
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7627);return count;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Character Tests
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if the CharSequence contains only Unicode letters.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.isAlpha(null)   = false
     * StringUtils.isAlpha("")     = false
     * StringUtils.isAlpha("  ")   = false
     * StringUtils.isAlpha("abc")  = true
     * StringUtils.isAlpha("ab2c") = false
     * StringUtils.isAlpha("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains letters, and is non-null
     * @since 3.0 Changed signature from isAlpha(String) to isAlpha(CharSequence)
     * @since 3.0 Changed "" to return false and not true
     */
    public static boolean isAlpha(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7628);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7629);if ((((cs == null || cs.length() == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7630)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7631)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7632);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7633);final int sz = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7634);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7635)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7636)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7637);if ((((Character.isLetter(cs.charAt(i)) == false)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7638)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7639)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7640);return false;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7641);return true;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode letters and
     * space (' ').</p>
     *
     * <p>{@code null} will return {@code false}
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isAlphaSpace(null)   = false
     * StringUtils.isAlphaSpace("")     = true
     * StringUtils.isAlphaSpace("  ")   = true
     * StringUtils.isAlphaSpace("abc")  = true
     * StringUtils.isAlphaSpace("ab c") = true
     * StringUtils.isAlphaSpace("ab2c") = false
     * StringUtils.isAlphaSpace("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains letters and space,
     *  and is non-null
     * @since 3.0 Changed signature from isAlphaSpace(String) to isAlphaSpace(CharSequence)
     */
    public static boolean isAlphaSpace(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7642);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7643);if ((((cs == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7644)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7645)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7646);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7647);final int sz = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7648);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7649)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7650)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7651);if ((((Character.isLetter(cs.charAt(i)) == false && cs.charAt(i) != ' ')&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7652)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7653)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7654);return false;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7655);return true;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode letters or digits.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.isAlphanumeric(null)   = false
     * StringUtils.isAlphanumeric("")     = false
     * StringUtils.isAlphanumeric("  ")   = false
     * StringUtils.isAlphanumeric("abc")  = true
     * StringUtils.isAlphanumeric("ab c") = false
     * StringUtils.isAlphanumeric("ab2c") = true
     * StringUtils.isAlphanumeric("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains letters or digits,
     *  and is non-null
     * @since 3.0 Changed signature from isAlphanumeric(String) to isAlphanumeric(CharSequence)
     * @since 3.0 Changed "" to return false and not true
     */
    public static boolean isAlphanumeric(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7656);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7657);if ((((cs == null || cs.length() == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7658)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7659)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7660);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7661);final int sz = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7662);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7663)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7664)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7665);if ((((Character.isLetterOrDigit(cs.charAt(i)) == false)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7666)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7667)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7668);return false;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7669);return true;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode letters, digits
     * or space ({@code ' '}).</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isAlphanumericSpace(null)   = false
     * StringUtils.isAlphanumericSpace("")     = true
     * StringUtils.isAlphanumericSpace("  ")   = true
     * StringUtils.isAlphanumericSpace("abc")  = true
     * StringUtils.isAlphanumericSpace("ab c") = true
     * StringUtils.isAlphanumericSpace("ab2c") = true
     * StringUtils.isAlphanumericSpace("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains letters, digits or space,
     *  and is non-null
     * @since 3.0 Changed signature from isAlphanumericSpace(String) to isAlphanumericSpace(CharSequence)
     */
    public static boolean isAlphanumericSpace(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7670);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7671);if ((((cs == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7672)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7673)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7674);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7675);final int sz = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7676);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7677)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7678)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7679);if ((((Character.isLetterOrDigit(cs.charAt(i)) == false && cs.charAt(i) != ' ')&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7680)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7681)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7682);return false;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7683);return true;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only ASCII printable characters.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isAsciiPrintable(null)     = false
     * StringUtils.isAsciiPrintable("")       = true
     * StringUtils.isAsciiPrintable(" ")      = true
     * StringUtils.isAsciiPrintable("Ceki")   = true
     * StringUtils.isAsciiPrintable("ab2c")   = true
     * StringUtils.isAsciiPrintable("!ab-c~") = true
     * StringUtils.isAsciiPrintable(" ") = true
     * StringUtils.isAsciiPrintable("!") = true
     * StringUtils.isAsciiPrintable("~") = true
     * StringUtils.isAsciiPrintable("") = false
     * StringUtils.isAsciiPrintable("Ceki G\u00fclc\u00fc") = false
     * </pre>
     *
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if every character is in the range
     *  32 thru 126
     * @since 2.1
     * @since 3.0 Changed signature from isAsciiPrintable(String) to isAsciiPrintable(CharSequence)
     */
    public static boolean isAsciiPrintable(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7684);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7685);if ((((cs == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7686)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7687)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7688);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7689);final int sz = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7690);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7691)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7692)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7693);if ((((CharUtils.isAsciiPrintable(cs.charAt(i)) == false)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7694)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7695)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7696);return false;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7697);return true;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode digits.
     * A decimal point is not a Unicode digit and returns false.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <p>Note that the method does not allow for a leading sign, either positive or negative.
     * Also, if a String passes the numeric test, it may still generate a NumberFormatException
     * when parsed by Integer.parseInt or Long.parseLong, e.g. if the value is outside the range
     * for int or long respectively.</p>
     *
     * <pre>
     * StringUtils.isNumeric(null)   = false
     * StringUtils.isNumeric("")     = false
     * StringUtils.isNumeric("  ")   = false
     * StringUtils.isNumeric("123")  = true
     * StringUtils.isNumeric("12 3") = false
     * StringUtils.isNumeric("ab2c") = false
     * StringUtils.isNumeric("12-3") = false
     * StringUtils.isNumeric("12.3") = false
     * StringUtils.isNumeric("-123") = false
     * StringUtils.isNumeric("+123") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains digits, and is non-null
     * @since 3.0 Changed signature from isNumeric(String) to isNumeric(CharSequence)
     * @since 3.0 Changed "" to return false and not true
     */
    public static boolean isNumeric(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7698);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7699);if ((((cs == null || cs.length() == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7700)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7701)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7702);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7703);final int sz = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7704);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7705)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7706)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7707);if ((((Character.isDigit(cs.charAt(i)) == false)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7708)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7709)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7710);return false;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7711);return true;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode digits or space
     * ({@code ' '}).
     * A decimal point is not a Unicode digit and returns false.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isNumericSpace(null)   = false
     * StringUtils.isNumericSpace("")     = true
     * StringUtils.isNumericSpace("  ")   = true
     * StringUtils.isNumericSpace("123")  = true
     * StringUtils.isNumericSpace("12 3") = true
     * StringUtils.isNumericSpace("ab2c") = false
     * StringUtils.isNumericSpace("12-3") = false
     * StringUtils.isNumericSpace("12.3") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains digits or space,
     *  and is non-null
     * @since 3.0 Changed signature from isNumericSpace(String) to isNumericSpace(CharSequence)
     */
    public static boolean isNumericSpace(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7712);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7713);if ((((cs == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7714)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7715)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7716);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7717);final int sz = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7718);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7719)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7720)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7721);if ((((Character.isDigit(cs.charAt(i)) == false && cs.charAt(i) != ' ')&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7722)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7723)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7724);return false;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7725);return true;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only whitespace.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isWhitespace(null)   = false
     * StringUtils.isWhitespace("")     = true
     * StringUtils.isWhitespace("  ")   = true
     * StringUtils.isWhitespace("abc")  = false
     * StringUtils.isWhitespace("ab2c") = false
     * StringUtils.isWhitespace("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains whitespace, and is non-null
     * @since 2.0
     * @since 3.0 Changed signature from isWhitespace(String) to isWhitespace(CharSequence)
     */
    public static boolean isWhitespace(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7726);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7727);if ((((cs == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7728)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7729)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7730);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7731);final int sz = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7732);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7733)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7734)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7735);if ((((Character.isWhitespace(cs.charAt(i)) == false)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7736)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7737)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7738);return false;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7739);return true;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only lowercase characters.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.isAllLowerCase(null)   = false
     * StringUtils.isAllLowerCase("")     = false
     * StringUtils.isAllLowerCase("  ")   = false
     * StringUtils.isAllLowerCase("abc")  = true
     * StringUtils.isAllLowerCase("abC") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains lowercase characters, and is non-null
     * @since 2.5
     * @since 3.0 Changed signature from isAllLowerCase(String) to isAllLowerCase(CharSequence)
     */
    public static boolean isAllLowerCase(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7740);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7741);if ((((cs == null || isEmpty(cs))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7742)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7743)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7744);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7745);final int sz = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7746);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7747)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7748)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7749);if ((((Character.isLowerCase(cs.charAt(i)) == false)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7750)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7751)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7752);return false;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7753);return true;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only uppercase characters.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty String (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.isAllUpperCase(null)   = false
     * StringUtils.isAllUpperCase("")     = false
     * StringUtils.isAllUpperCase("  ")   = false
     * StringUtils.isAllUpperCase("ABC")  = true
     * StringUtils.isAllUpperCase("aBC") = false
     * </pre>
     *
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if only contains uppercase characters, and is non-null
     * @since 2.5
     * @since 3.0 Changed signature from isAllUpperCase(String) to isAllUpperCase(CharSequence)
     */
    public static boolean isAllUpperCase(final CharSequence cs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7754);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7755);if ((((cs == null || isEmpty(cs))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7756)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7757)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7758);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7759);final int sz = cs.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7760);for (int i = 0; (((i < sz)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7761)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7762)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7763);if ((((Character.isUpperCase(cs.charAt(i)) == false)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7764)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7765)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7766);return false;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7767);return true;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Defaults
    //-----------------------------------------------------------------------
    /**
     * <p>Returns either the passed in String,
     * or if the String is {@code null}, an empty String ("").</p>
     *
     * <pre>
     * StringUtils.defaultString(null)  = ""
     * StringUtils.defaultString("")    = ""
     * StringUtils.defaultString("bat") = "bat"
     * </pre>
     *
     * @see ObjectUtils#toString(Object)
     * @see String#valueOf(Object)
     * @param str  the String to check, may be null
     * @return the passed in String, or the empty String if it
     *  was {@code null}
     */
    public static String defaultString(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7768);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7769);return (((str == null )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7770)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7771)==0&false))? EMPTY : str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Returns either the passed in String, or if the String is
     * {@code null}, the value of {@code defaultStr}.</p>
     *
     * <pre>
     * StringUtils.defaultString(null, "NULL")  = "NULL"
     * StringUtils.defaultString("", "NULL")    = ""
     * StringUtils.defaultString("bat", "NULL") = "bat"
     * </pre>
     *
     * @see ObjectUtils#toString(Object,String)
     * @see String#valueOf(Object)
     * @param str  the String to check, may be null
     * @param defaultStr  the default String to return
     *  if the input is {@code null}, may be null
     * @return the passed in String, or the default if it was {@code null}
     */
    public static String defaultString(final String str, final String defaultStr) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7772);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7773);return (((str == null )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7774)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7775)==0&false))? defaultStr : str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Returns either the passed in CharSequence, or if the CharSequence is
     * whitespace, empty ("") or {@code null}, the value of {@code defaultStr}.</p>
     *
     * <pre>
     * StringUtils.defaultIfBlank(null, "NULL")  = "NULL"
     * StringUtils.defaultIfBlank("", "NULL")    = "NULL"
     * StringUtils.defaultIfBlank(" ", "NULL")   = "NULL"
     * StringUtils.defaultIfBlank("bat", "NULL") = "bat"
     * StringUtils.defaultIfBlank("", null)      = null
     * </pre>
     * @param <T> the specific kind of CharSequence
     * @param str the CharSequence to check, may be null
     * @param defaultStr  the default CharSequence to return
     *  if the input is whitespace, empty ("") or {@code null}, may be null
     * @return the passed in CharSequence, or the default
     * @see StringUtils#defaultString(String, String)
     */
    public static <T extends CharSequence> T defaultIfBlank(final T str, final T defaultStr) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7776);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7777);return (((StringUtils.isBlank(str) )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7778)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7779)==0&false))? defaultStr : str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Returns either the passed in CharSequence, or if the CharSequence is
     * empty or {@code null}, the value of {@code defaultStr}.</p>
     *
     * <pre>
     * StringUtils.defaultIfEmpty(null, "NULL")  = "NULL"
     * StringUtils.defaultIfEmpty("", "NULL")    = "NULL"
     * StringUtils.defaultIfEmpty(" ", "NULL")   = " "
     * StringUtils.defaultIfEmpty("bat", "NULL") = "bat"
     * StringUtils.defaultIfEmpty("", null)      = null
     * </pre>
     * @param <T> the specific kind of CharSequence
     * @param str  the CharSequence to check, may be null
     * @param defaultStr  the default CharSequence to return
     *  if the input is empty ("") or {@code null}, may be null
     * @return the passed in CharSequence, or the default
     * @see StringUtils#defaultString(String, String)
     */
    public static <T extends CharSequence> T defaultIfEmpty(final T str, final T defaultStr) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7780);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7781);return (((StringUtils.isEmpty(str) )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7782)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7783)==0&false))? defaultStr : str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Reversing
    //-----------------------------------------------------------------------
    /**
     * <p>Reverses a String as per {@link StringBuilder#reverse()}.</p>
     *
     * <p>A {@code null} String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.reverse(null)  = null
     * StringUtils.reverse("")    = ""
     * StringUtils.reverse("bat") = "tab"
     * </pre>
     *
     * @param str  the String to reverse, may be null
     * @return the reversed String, {@code null} if null String input
     */
    public static String reverse(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7784);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7785);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7786)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7787)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7788);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7789);return new StringBuilder(str).reverse().toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Reverses a String that is delimited by a specific character.</p>
     *
     * <p>The Strings between the delimiters are not reversed.
     * Thus java.lang.String becomes String.lang.java (if the delimiter
     * is {@code '.'}).</p>
     *
     * <pre>
     * StringUtils.reverseDelimited(null, *)      = null
     * StringUtils.reverseDelimited("", *)        = ""
     * StringUtils.reverseDelimited("a.b.c", 'x') = "a.b.c"
     * StringUtils.reverseDelimited("a.b.c", ".") = "c.b.a"
     * </pre>
     *
     * @param str  the String to reverse, may be null
     * @param separatorChar  the separator character to use
     * @return the reversed String, {@code null} if null String input
     * @since 2.0
     */
    public static String reverseDelimited(final String str, final char separatorChar) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7790);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7791);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7792)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7793)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7794);return null;
        }
        // could implement manually, but simple way is to reuse other,
        // probably slower, methods.
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7795);final String[] strs = split(str, separatorChar);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7796);ArrayUtils.reverse(strs);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7797);return join(strs, separatorChar);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Abbreviating
    //-----------------------------------------------------------------------
    /**
     * <p>Abbreviates a String using ellipses. This will turn
     * "Now is the time for all good men" into "Now is the time for..."</p>
     *
     * <p>Specifically:
     * <ul>
     *   <li>If {@code str} is less than {@code maxWidth} characters
     *       long, return it.</li>
     *   <li>Else abbreviate it to {@code (substring(str, 0, max-3) + "...")}.</li>
     *   <li>If {@code maxWidth} is less than {@code 4}, throw an
     *       {@code IllegalArgumentException}.</li>
     *   <li>In no case will it return a String of length greater than
     *       {@code maxWidth}.</li>
     * </ul>
     * </p>
     *
     * <pre>
     * StringUtils.abbreviate(null, *)      = null
     * StringUtils.abbreviate("", 4)        = ""
     * StringUtils.abbreviate("abcdefg", 6) = "abc..."
     * StringUtils.abbreviate("abcdefg", 7) = "abcdefg"
     * StringUtils.abbreviate("abcdefg", 8) = "abcdefg"
     * StringUtils.abbreviate("abcdefg", 4) = "a..."
     * StringUtils.abbreviate("abcdefg", 3) = IllegalArgumentException
     * </pre>
     *
     * @param str  the String to check, may be null
     * @param maxWidth  maximum length of result String, must be at least 4
     * @return abbreviated String, {@code null} if null String input
     * @throws IllegalArgumentException if the width is too small
     * @since 2.0
     */
    public static String abbreviate(final String str, final int maxWidth) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7798);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7799);return abbreviate(str, 0, maxWidth);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Abbreviates a String using ellipses. This will turn
     * "Now is the time for all good men" into "...is the time for..."</p>
     *
     * <p>Works like {@code abbreviate(String, int)}, but allows you to specify
     * a "left edge" offset.  Note that this left edge is not necessarily going to
     * be the leftmost character in the result, or the first character following the
     * ellipses, but it will appear somewhere in the result.
     *
     * <p>In no case will it return a String of length greater than
     * {@code maxWidth}.</p>
     *
     * <pre>
     * StringUtils.abbreviate(null, *, *)                = null
     * StringUtils.abbreviate("", 0, 4)                  = ""
     * StringUtils.abbreviate("abcdefghijklmno", -1, 10) = "abcdefg..."
     * StringUtils.abbreviate("abcdefghijklmno", 0, 10)  = "abcdefg..."
     * StringUtils.abbreviate("abcdefghijklmno", 1, 10)  = "abcdefg..."
     * StringUtils.abbreviate("abcdefghijklmno", 4, 10)  = "abcdefg..."
     * StringUtils.abbreviate("abcdefghijklmno", 5, 10)  = "...fghi..."
     * StringUtils.abbreviate("abcdefghijklmno", 6, 10)  = "...ghij..."
     * StringUtils.abbreviate("abcdefghijklmno", 8, 10)  = "...ijklmno"
     * StringUtils.abbreviate("abcdefghijklmno", 10, 10) = "...ijklmno"
     * StringUtils.abbreviate("abcdefghijklmno", 12, 10) = "...ijklmno"
     * StringUtils.abbreviate("abcdefghij", 0, 3)        = IllegalArgumentException
     * StringUtils.abbreviate("abcdefghij", 5, 6)        = IllegalArgumentException
     * </pre>
     *
     * @param str  the String to check, may be null
     * @param offset  left edge of source String
     * @param maxWidth  maximum length of result String, must be at least 4
     * @return abbreviated String, {@code null} if null String input
     * @throws IllegalArgumentException if the width is too small
     * @since 2.0
     */
    public static String abbreviate(final String str, int offset, final int maxWidth) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7800);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7801);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7802)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7803)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7804);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7805);if ((((maxWidth < 4)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7806)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7807)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7808);throw new IllegalArgumentException("Minimum abbreviation width is 4");
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7809);if ((((str.length() <= maxWidth)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7810)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7811)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7812);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7813);if ((((offset > str.length())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7814)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7815)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7816);offset = str.length();
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7817);if ((((str.length() - offset < maxWidth - 3)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7818)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7819)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7820);offset = str.length() - (maxWidth - 3);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7821);final String abrevMarker = "...";
        __CLR4_4_14dm4dmldnigfmq.R.inc(7822);if ((((offset <= 4)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7823)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7824)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7825);return str.substring(0, maxWidth - 3) + abrevMarker;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7826);if ((((maxWidth < 7)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7827)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7828)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7829);throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7830);if ((((offset + maxWidth - 3 < str.length())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7831)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7832)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7833);return abrevMarker + abbreviate(str.substring(offset), maxWidth - 3);
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7834);return abrevMarker + str.substring(str.length() - (maxWidth - 3));
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Abbreviates a String to the length passed, replacing the middle characters with the supplied
     * replacement String.</p>
     *
     * <p>This abbreviation only occurs if the following criteria is met:
     * <ul>
     * <li>Neither the String for abbreviation nor the replacement String are null or empty </li>
     * <li>The length to truncate to is less than the length of the supplied String</li>
     * <li>The length to truncate to is greater than 0</li>
     * <li>The abbreviated String will have enough room for the length supplied replacement String
     * and the first and last characters of the supplied String for abbreviation</li>
     * </ul>
     * Otherwise, the returned String will be the same as the supplied String for abbreviation.
     * </p>
     *
     * <pre>
     * StringUtils.abbreviateMiddle(null, null, 0)      = null
     * StringUtils.abbreviateMiddle("abc", null, 0)      = "abc"
     * StringUtils.abbreviateMiddle("abc", ".", 0)      = "abc"
     * StringUtils.abbreviateMiddle("abc", ".", 3)      = "abc"
     * StringUtils.abbreviateMiddle("abcdef", ".", 4)     = "ab.f"
     * </pre>
     *
     * @param str  the String to abbreviate, may be null
     * @param middle the String to replace the middle characters with, may be null
     * @param length the length to abbreviate {@code str} to.
     * @return the abbreviated String if the above criteria is met, or the original String supplied for abbreviation.
     * @since 2.5
     */
    public static String abbreviateMiddle(final String str, final String middle, final int length) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7835);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7836);if ((((isEmpty(str) || isEmpty(middle))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7837)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7838)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7839);return str;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7840);if ((((length >= str.length() || length < middle.length()+2)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7841)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7842)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7843);return str;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7844);final int targetSting = length-middle.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(7845);final int startOffset = targetSting/2+targetSting%2;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7846);final int endOffset = str.length()-targetSting/2;

        __CLR4_4_14dm4dmldnigfmq.R.inc(7847);final StringBuilder builder = new StringBuilder(length);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7848);builder.append(str.substring(0,startOffset));
        __CLR4_4_14dm4dmldnigfmq.R.inc(7849);builder.append(middle);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7850);builder.append(str.substring(endOffset));

        __CLR4_4_14dm4dmldnigfmq.R.inc(7851);return builder.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Difference
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two Strings, and returns the portion where they differ.
     * More precisely, return the remainder of the second String,
     * starting from where it's different from the first. This means that 
     * the difference between "abc" and "ab" is the empty String and not "c". </p>
     *
     * <p>For example,
     * {@code difference("i am a machine", "i am a robot") -> "robot"}.</p>
     *
     * <pre>
     * StringUtils.difference(null, null) = null
     * StringUtils.difference("", "") = ""
     * StringUtils.difference("", "abc") = "abc"
     * StringUtils.difference("abc", "") = ""
     * StringUtils.difference("abc", "abc") = ""
     * StringUtils.difference("abc", "ab") = ""
     * StringUtils.difference("ab", "abxyz") = "xyz"
     * StringUtils.difference("abcde", "abxyz") = "xyz"
     * StringUtils.difference("abcde", "xyz") = "xyz"
     * </pre>
     *
     * @param str1  the first String, may be null
     * @param str2  the second String, may be null
     * @return the portion of str2 where it differs from str1; returns the
     * empty String if they are equal
     * @see #indexOfDifference(CharSequence,CharSequence)
     * @since 2.0
     */
    public static String difference(final String str1, final String str2) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7852);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7853);if ((((str1 == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7854)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7855)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7856);return str2;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7857);if ((((str2 == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7858)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7859)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7860);return str1;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7861);final int at = indexOfDifference(str1, str2);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7862);if ((((at == INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7863)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7864)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7865);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7866);return str2.substring(at);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Compares two CharSequences, and returns the index at which the
     * CharSequences begin to differ.</p>
     *
     * <p>For example,
     * {@code indexOfDifference("i am a machine", "i am a robot") -> 7}</p>
     *
     * <pre>
     * StringUtils.indexOfDifference(null, null) = -1
     * StringUtils.indexOfDifference("", "") = -1
     * StringUtils.indexOfDifference("", "abc") = 0
     * StringUtils.indexOfDifference("abc", "") = 0
     * StringUtils.indexOfDifference("abc", "abc") = -1
     * StringUtils.indexOfDifference("ab", "abxyz") = 2
     * StringUtils.indexOfDifference("abcde", "abxyz") = 2
     * StringUtils.indexOfDifference("abcde", "xyz") = 0
     * </pre>
     *
     * @param cs1  the first CharSequence, may be null
     * @param cs2  the second CharSequence, may be null
     * @return the index where cs1 and cs2 begin to differ; -1 if they are equal
     * @since 2.0
     * @since 3.0 Changed signature from indexOfDifference(String, String) to
     * indexOfDifference(CharSequence, CharSequence)
     */
    public static int indexOfDifference(final CharSequence cs1, final CharSequence cs2) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7867);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7868);if ((((cs1 == cs2)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7869)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7870)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7871);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7872);if ((((cs1 == null || cs2 == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7873)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7874)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7875);return 0;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7876);int i;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7877);for (i = 0; (((i < cs1.length() && i < cs2.length())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7878)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7879)==0&false)); ++i) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7880);if ((((cs1.charAt(i) != cs2.charAt(i))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7881)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7882)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7883);break;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7884);if ((((i < cs2.length() || i < cs1.length())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7885)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7886)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7887);return i;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7888);return INDEX_NOT_FOUND;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Compares all CharSequences in an array and returns the index at which the
     * CharSequences begin to differ.</p>
     *
     * <p>For example,
     * <code>indexOfDifference(new String[] {"i am a machine", "i am a robot"}) -> 7</code></p>
     *
     * <pre>
     * StringUtils.indexOfDifference(null) = -1
     * StringUtils.indexOfDifference(new String[] {}) = -1
     * StringUtils.indexOfDifference(new String[] {"abc"}) = -1
     * StringUtils.indexOfDifference(new String[] {null, null}) = -1
     * StringUtils.indexOfDifference(new String[] {"", ""}) = -1
     * StringUtils.indexOfDifference(new String[] {"", null}) = 0
     * StringUtils.indexOfDifference(new String[] {"abc", null, null}) = 0
     * StringUtils.indexOfDifference(new String[] {null, null, "abc"}) = 0
     * StringUtils.indexOfDifference(new String[] {"", "abc"}) = 0
     * StringUtils.indexOfDifference(new String[] {"abc", ""}) = 0
     * StringUtils.indexOfDifference(new String[] {"abc", "abc"}) = -1
     * StringUtils.indexOfDifference(new String[] {"abc", "a"}) = 1
     * StringUtils.indexOfDifference(new String[] {"ab", "abxyz"}) = 2
     * StringUtils.indexOfDifference(new String[] {"abcde", "abxyz"}) = 2
     * StringUtils.indexOfDifference(new String[] {"abcde", "xyz"}) = 0
     * StringUtils.indexOfDifference(new String[] {"xyz", "abcde"}) = 0
     * StringUtils.indexOfDifference(new String[] {"i am a machine", "i am a robot"}) = 7
     * </pre>
     *
     * @param css  array of CharSequences, entries may be null
     * @return the index where the strings begin to differ; -1 if they are all equal
     * @since 2.4
     * @since 3.0 Changed signature from indexOfDifference(String...) to indexOfDifference(CharSequence...)
     */
    public static int indexOfDifference(final CharSequence... css) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7889);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7890);if ((((css == null || css.length <= 1)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7891)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7892)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7893);return INDEX_NOT_FOUND;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7894);boolean anyStringNull = false;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7895);boolean allStringsNull = true;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7896);final int arrayLen = css.length;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7897);int shortestStrLen = Integer.MAX_VALUE;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7898);int longestStrLen = 0;

        // find the min and max string lengths; this avoids checking to make
        // sure we are not exceeding the length of the string each time through
        // the bottom loop.
        __CLR4_4_14dm4dmldnigfmq.R.inc(7899);for (int i = 0; (((i < arrayLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7900)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7901)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7902);if ((((css[i] == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7903)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7904)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7905);anyStringNull = true;
                __CLR4_4_14dm4dmldnigfmq.R.inc(7906);shortestStrLen = 0;
            } }else {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7907);allStringsNull = false;
                __CLR4_4_14dm4dmldnigfmq.R.inc(7908);shortestStrLen = Math.min(css[i].length(), shortestStrLen);
                __CLR4_4_14dm4dmldnigfmq.R.inc(7909);longestStrLen = Math.max(css[i].length(), longestStrLen);
            }
        }}

        // handle lists containing all nulls or all empty strings
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7910);if ((((allStringsNull || longestStrLen == 0 && !anyStringNull)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7911)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7912)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7913);return INDEX_NOT_FOUND;
        }

        // handle lists containing some nulls or some empty strings
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7914);if ((((shortestStrLen == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7915)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7916)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7917);return 0;
        }

        // find the position with the first difference across all strings
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7918);int firstDiff = -1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(7919);for (int stringPos = 0; (((stringPos < shortestStrLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7920)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7921)==0&false)); stringPos++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7922);final char comparisonChar = css[0].charAt(stringPos);
            __CLR4_4_14dm4dmldnigfmq.R.inc(7923);for (int arrayPos = 1; (((arrayPos < arrayLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7924)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7925)==0&false)); arrayPos++) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7926);if ((((css[arrayPos].charAt(stringPos) != comparisonChar)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7927)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7928)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(7929);firstDiff = stringPos;
                    __CLR4_4_14dm4dmldnigfmq.R.inc(7930);break;
                }
            }}
            }__CLR4_4_14dm4dmldnigfmq.R.inc(7931);if ((((firstDiff != -1)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7932)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7933)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7934);break;
            }
        }}

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7935);if ((((firstDiff == -1 && shortestStrLen != longestStrLen)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7936)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7937)==0&false))) {{
            // we compared all of the characters up to the length of the
            // shortest string and didn't find a match, but the string lengths
            // vary, so return the length of the shortest string.
            __CLR4_4_14dm4dmldnigfmq.R.inc(7938);return shortestStrLen;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7939);return firstDiff;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Compares all Strings in an array and returns the initial sequence of
     * characters that is common to all of them.</p>
     *
     * <p>For example,
     * <code>getCommonPrefix(new String[] {"i am a machine", "i am a robot"}) -> "i am a "</code></p>
     *
     * <pre>
     * StringUtils.getCommonPrefix(null) = ""
     * StringUtils.getCommonPrefix(new String[] {}) = ""
     * StringUtils.getCommonPrefix(new String[] {"abc"}) = "abc"
     * StringUtils.getCommonPrefix(new String[] {null, null}) = ""
     * StringUtils.getCommonPrefix(new String[] {"", ""}) = ""
     * StringUtils.getCommonPrefix(new String[] {"", null}) = ""
     * StringUtils.getCommonPrefix(new String[] {"abc", null, null}) = ""
     * StringUtils.getCommonPrefix(new String[] {null, null, "abc"}) = ""
     * StringUtils.getCommonPrefix(new String[] {"", "abc"}) = ""
     * StringUtils.getCommonPrefix(new String[] {"abc", ""}) = ""
     * StringUtils.getCommonPrefix(new String[] {"abc", "abc"}) = "abc"
     * StringUtils.getCommonPrefix(new String[] {"abc", "a"}) = "a"
     * StringUtils.getCommonPrefix(new String[] {"ab", "abxyz"}) = "ab"
     * StringUtils.getCommonPrefix(new String[] {"abcde", "abxyz"}) = "ab"
     * StringUtils.getCommonPrefix(new String[] {"abcde", "xyz"}) = ""
     * StringUtils.getCommonPrefix(new String[] {"xyz", "abcde"}) = ""
     * StringUtils.getCommonPrefix(new String[] {"i am a machine", "i am a robot"}) = "i am a "
     * </pre>
     *
     * @param strs  array of String objects, entries may be null
     * @return the initial sequence of characters that are common to all Strings
     * in the array; empty String if the array is null, the elements are all null
     * or if there is no common prefix.
     * @since 2.4
     */
    public static String getCommonPrefix(final String... strs) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7940);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7941);if ((((strs == null || strs.length == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7942)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7943)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7944);return EMPTY;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(7945);final int smallestIndexOfDiff = indexOfDifference(strs);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7946);if ((((smallestIndexOfDiff == INDEX_NOT_FOUND)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7947)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7948)==0&false))) {{
            // all strings were identical
            __CLR4_4_14dm4dmldnigfmq.R.inc(7949);if ((((strs[0] == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7950)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7951)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(7952);return EMPTY;
            }
            }__CLR4_4_14dm4dmldnigfmq.R.inc(7953);return strs[0];
        } }else {__CLR4_4_14dm4dmldnigfmq.R.inc(7954);if ((((smallestIndexOfDiff == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7955)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7956)==0&false))) {{
            // there were no common initial characters
            __CLR4_4_14dm4dmldnigfmq.R.inc(7957);return EMPTY;
        } }else {{
            // we found a common initial character sequence
            __CLR4_4_14dm4dmldnigfmq.R.inc(7958);return strs[0].substring(0, smallestIndexOfDiff);
        }
    }}}finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // Misc
    //-----------------------------------------------------------------------
    /**
     * <p>Find the Levenshtein distance between two Strings.</p>
     *
     * <p>This is the number of changes needed to change one String into
     * another, where each change is a single character modification (deletion,
     * insertion or substitution).</p>
     *
     * <p>The previous implementation of the Levenshtein distance algorithm
     * was from <a href="http://www.merriampark.com/ld.htm">http://www.merriampark.com/ld.htm</a></p>
     *
     * <p>Chas Emerick has written an implementation in Java, which avoids an OutOfMemoryError
     * which can occur when my Java implementation is used with very large strings.<br>
     * This implementation of the Levenshtein distance algorithm
     * is from <a href="http://www.merriampark.com/ldjava.htm">http://www.merriampark.com/ldjava.htm</a></p>
     *
     * <pre>
     * StringUtils.getLevenshteinDistance(null, *)             = IllegalArgumentException
     * StringUtils.getLevenshteinDistance(*, null)             = IllegalArgumentException
     * StringUtils.getLevenshteinDistance("","")               = 0
     * StringUtils.getLevenshteinDistance("","a")              = 1
     * StringUtils.getLevenshteinDistance("aaapppp", "")       = 7
     * StringUtils.getLevenshteinDistance("frog", "fog")       = 1
     * StringUtils.getLevenshteinDistance("fly", "ant")        = 3
     * StringUtils.getLevenshteinDistance("elephant", "hippo") = 7
     * StringUtils.getLevenshteinDistance("hippo", "elephant") = 7
     * StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz") = 8
     * StringUtils.getLevenshteinDistance("hello", "hallo")    = 1
     * </pre>
     *
     * @param s  the first String, must not be null
     * @param t  the second String, must not be null
     * @return result distance
     * @throws IllegalArgumentException if either String input {@code null}
     * @since 3.0 Changed signature from getLevenshteinDistance(String, String) to
     * getLevenshteinDistance(CharSequence, CharSequence)
     */
    public static int getLevenshteinDistance(CharSequence s, CharSequence t) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(7959);
        __CLR4_4_14dm4dmldnigfmq.R.inc(7960);if ((((s == null || t == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7961)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7962)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7963);throw new IllegalArgumentException("Strings must not be null");
        }

        /*
           The difference between this impl. and the previous is that, rather
           than creating and retaining a matrix of size s.length() + 1 by t.length() + 1,
           we maintain two single-dimensional arrays of length s.length() + 1.  The first, d,
           is the 'current working' distance array that maintains the newest distance cost
           counts as we iterate through the characters of String s.  Each time we increment
           the index of String t we are comparing, d is copied to p, the second int[].  Doing so
           allows us to retain the previous cost counts as required by the algorithm (taking
           the minimum of the cost count to the left, up one, and diagonally up and to the left
           of the current cost count being calculated).  (Note that the arrays aren't really
           copied anymore, just switched...this is clearly much better than cloning an array
           or doing a System.arraycopy() each time  through the outer loop.)

           Effectively, the difference between the two implementations is this one does not
           cause an out of memory condition when calculating the LD over two very large strings.
         */

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7964);int n = s.length(); // length of s
        __CLR4_4_14dm4dmldnigfmq.R.inc(7965);int m = t.length(); // length of t

        __CLR4_4_14dm4dmldnigfmq.R.inc(7966);if ((((n == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7967)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7968)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7969);return m;
        } }else {__CLR4_4_14dm4dmldnigfmq.R.inc(7970);if ((((m == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7971)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7972)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7973);return n;
        }

        }}__CLR4_4_14dm4dmldnigfmq.R.inc(7974);if ((((n > m)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7975)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7976)==0&false))) {{
            // swap the input strings to consume less memory
            __CLR4_4_14dm4dmldnigfmq.R.inc(7977);final CharSequence tmp = s;
            __CLR4_4_14dm4dmldnigfmq.R.inc(7978);s = t;
            __CLR4_4_14dm4dmldnigfmq.R.inc(7979);t = tmp;
            __CLR4_4_14dm4dmldnigfmq.R.inc(7980);n = m;
            __CLR4_4_14dm4dmldnigfmq.R.inc(7981);m = t.length();
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7982);int p[] = new int[n + 1]; //'previous' cost array, horizontally
        __CLR4_4_14dm4dmldnigfmq.R.inc(7983);int d[] = new int[n + 1]; // cost array, horizontally
        __CLR4_4_14dm4dmldnigfmq.R.inc(7984);int _d[]; //placeholder to assist in swapping p and d

        // indexes into strings s and t
        __CLR4_4_14dm4dmldnigfmq.R.inc(7985);int i; // iterates through s
        __CLR4_4_14dm4dmldnigfmq.R.inc(7986);int j; // iterates through t

        __CLR4_4_14dm4dmldnigfmq.R.inc(7987);char t_j; // jth character of t

        __CLR4_4_14dm4dmldnigfmq.R.inc(7988);int cost; // cost

        __CLR4_4_14dm4dmldnigfmq.R.inc(7989);for (i = 0; (((i <= n)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7990)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7991)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7992);p[i] = i;
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(7993);for (j = 1; (((j <= m)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7994)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(7995)==0&false)); j++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(7996);t_j = t.charAt(j - 1);
            __CLR4_4_14dm4dmldnigfmq.R.inc(7997);d[0] = j;

            __CLR4_4_14dm4dmldnigfmq.R.inc(7998);for (i = 1; (((i <= n)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(7999)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8000)==0&false)); i++) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(8001);cost = (((s.charAt(i - 1) == t_j )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8002)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8003)==0&false))? 0 : 1;
                // minimum of cell to the left+1, to the top+1, diagonally left and up +cost
                __CLR4_4_14dm4dmldnigfmq.R.inc(8004);d[i] = Math.min(Math.min(d[i - 1] + 1, p[i] + 1), p[i - 1] + cost);
            }

            // copy current distance counts to 'previous row' distance counts
            }__CLR4_4_14dm4dmldnigfmq.R.inc(8005);_d = p;
            __CLR4_4_14dm4dmldnigfmq.R.inc(8006);p = d;
            __CLR4_4_14dm4dmldnigfmq.R.inc(8007);d = _d;
        }

        // our last action in the above loop was to switch d and p, so p now
        // actually has the most recent cost counts
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8008);return p[n];
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Find the Levenshtein distance between two Strings if it's less than or equal to a given 
     * threshold.</p>
     *
     * <p>This is the number of changes needed to change one String into
     * another, where each change is a single character modification (deletion,
     * insertion or substitution).</p>
     *
     * <p>This implementation follows from Algorithms on Strings, Trees and Sequences by Dan Gusfield
     * and Chas Emerick's implementation of the Levenshtein distance algorithm from
     * <a href="http://www.merriampark.com/ld.htm">http://www.merriampark.com/ld.htm</a></p>
     *
     * <pre>
     * StringUtils.getLevenshteinDistance(null, *, *)             = IllegalArgumentException
     * StringUtils.getLevenshteinDistance(*, null, *)             = IllegalArgumentException
     * StringUtils.getLevenshteinDistance(*, *, -1)               = IllegalArgumentException
     * StringUtils.getLevenshteinDistance("","", 0)               = 0
     * StringUtils.getLevenshteinDistance("aaapppp", "", 8)       = 7
     * StringUtils.getLevenshteinDistance("aaapppp", "", 7)       = 7
     * StringUtils.getLevenshteinDistance("aaapppp", "", 6))      = -1
     * StringUtils.getLevenshteinDistance("elephant", "hippo", 7) = 7
     * StringUtils.getLevenshteinDistance("elephant", "hippo", 6) = -1
     * StringUtils.getLevenshteinDistance("hippo", "elephant", 7) = 7
     * StringUtils.getLevenshteinDistance("hippo", "elephant", 6) = -1
     * </pre>
     *
     * @param s  the first String, must not be null
     * @param t  the second String, must not be null
     * @param threshold the target threshold, must not be negative
     * @return result distance, or {@code -1} if the distance would be greater than the threshold
     * @throws IllegalArgumentException if either String input {@code null} or negative threshold
     */
    public static int getLevenshteinDistance(CharSequence s, CharSequence t, final int threshold) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8009);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8010);if ((((s == null || t == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8011)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8012)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8013);throw new IllegalArgumentException("Strings must not be null");
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8014);if ((((threshold < 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8015)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8016)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8017);throw new IllegalArgumentException("Threshold must not be negative");
        }

        /*
        This implementation only computes the distance if it's less than or equal to the
        threshold value, returning -1 if it's greater.  The advantage is performance: unbounded
        distance is O(nm), but a bound of k allows us to reduce it to O(km) time by only 
        computing a diagonal stripe of width 2k + 1 of the cost table.
        It is also possible to use this to compute the unbounded Levenshtein distance by starting
        the threshold at 1 and doubling each time until the distance is found; this is O(dm), where
        d is the distance.
        
        One subtlety comes from needing to ignore entries on the border of our stripe
        eg.
        p[] = |#|#|#|*
        d[] =  *|#|#|#|
        We must ignore the entry to the left of the leftmost member
        We must ignore the entry above the rightmost member
        
        Another subtlety comes from our stripe running off the matrix if the strings aren't
        of the same size.  Since string s is always swapped to be the shorter of the two, 
        the stripe will always run off to the upper right instead of the lower left of the matrix.
        
        As a concrete example, suppose s is of length 5, t is of length 7, and our threshold is 1.
        In this case we're going to walk a stripe of length 3.  The matrix would look like so:
        
           1 2 3 4 5
        1 |#|#| | | |
        2 |#|#|#| | |
        3 | |#|#|#| |
        4 | | |#|#|#|
        5 | | | |#|#|
        6 | | | | |#|
        7 | | | | | |

        Note how the stripe leads off the table as there is no possible way to turn a string of length 5
        into one of length 7 in edit distance of 1.
        
        Additionally, this implementation decreases memory usage by using two 
        single-dimensional arrays and swapping them back and forth instead of allocating
        an entire n by m matrix.  This requires a few minor changes, such as immediately returning 
        when it's detected that the stripe has run off the matrix and initially filling the arrays with
        large values so that entries we don't compute are ignored.

        See Algorithms on Strings, Trees and Sequences by Dan Gusfield for some discussion.
         */

        }__CLR4_4_14dm4dmldnigfmq.R.inc(8018);int n = s.length(); // length of s
        __CLR4_4_14dm4dmldnigfmq.R.inc(8019);int m = t.length(); // length of t

        // if one string is empty, the edit distance is necessarily the length of the other
        __CLR4_4_14dm4dmldnigfmq.R.inc(8020);if ((((n == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8021)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8022)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8023);return (((m <= threshold )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8024)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8025)==0&false))? m : -1;
        } }else {__CLR4_4_14dm4dmldnigfmq.R.inc(8026);if ((((m == 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8027)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8028)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8029);return (((n <= threshold )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8030)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8031)==0&false))? n : -1;
        }

        }}__CLR4_4_14dm4dmldnigfmq.R.inc(8032);if ((((n > m)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8033)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8034)==0&false))) {{
            // swap the two strings to consume less memory
            __CLR4_4_14dm4dmldnigfmq.R.inc(8035);final CharSequence tmp = s;
            __CLR4_4_14dm4dmldnigfmq.R.inc(8036);s = t;
            __CLR4_4_14dm4dmldnigfmq.R.inc(8037);t = tmp;
            __CLR4_4_14dm4dmldnigfmq.R.inc(8038);n = m;
            __CLR4_4_14dm4dmldnigfmq.R.inc(8039);m = t.length();
        }

        }__CLR4_4_14dm4dmldnigfmq.R.inc(8040);int p[] = new int[n + 1]; // 'previous' cost array, horizontally
        __CLR4_4_14dm4dmldnigfmq.R.inc(8041);int d[] = new int[n + 1]; // cost array, horizontally
        __CLR4_4_14dm4dmldnigfmq.R.inc(8042);int _d[]; // placeholder to assist in swapping p and d

        // fill in starting table values
        __CLR4_4_14dm4dmldnigfmq.R.inc(8043);final int boundary = Math.min(n, threshold) + 1;
        __CLR4_4_14dm4dmldnigfmq.R.inc(8044);for (int i = 0; (((i < boundary)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8045)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8046)==0&false)); i++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8047);p[i] = i;
        }
        // these fills ensure that the value above the rightmost entry of our 
        // stripe will be ignored in following loop iterations
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8048);Arrays.fill(p, boundary, p.length, Integer.MAX_VALUE);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8049);Arrays.fill(d, Integer.MAX_VALUE);

        // iterates through t
        __CLR4_4_14dm4dmldnigfmq.R.inc(8050);for (int j = 1; (((j <= m)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8051)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8052)==0&false)); j++) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8053);final char t_j = t.charAt(j - 1); // jth character of t
            __CLR4_4_14dm4dmldnigfmq.R.inc(8054);d[0] = j;

            // compute stripe indices, constrain to array size
            __CLR4_4_14dm4dmldnigfmq.R.inc(8055);final int min = Math.max(1, j - threshold);
            __CLR4_4_14dm4dmldnigfmq.R.inc(8056);final int max = Math.min(n, j + threshold);

            // the stripe may lead off of the table if s and t are of different sizes
            __CLR4_4_14dm4dmldnigfmq.R.inc(8057);if ((((min > max)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8058)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8059)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(8060);return -1;
            }

            // ignore entry left of leftmost
            }__CLR4_4_14dm4dmldnigfmq.R.inc(8061);if ((((min > 1)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8062)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8063)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(8064);d[min - 1] = Integer.MAX_VALUE;
            }

            // iterates through [min, max] in s
            }__CLR4_4_14dm4dmldnigfmq.R.inc(8065);for (int i = min; (((i <= max)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8066)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8067)==0&false)); i++) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(8068);if ((((s.charAt(i - 1) == t_j)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8069)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8070)==0&false))) {{
                    // diagonally left and up
                    __CLR4_4_14dm4dmldnigfmq.R.inc(8071);d[i] = p[i - 1];
                } }else {{
                    // 1 + minimum of cell to the left, to the top, diagonally left and up
                    __CLR4_4_14dm4dmldnigfmq.R.inc(8072);d[i] = 1 + Math.min(Math.min(d[i - 1], p[i]), p[i - 1]);
                }
            }}

            // copy current distance counts to 'previous row' distance counts
            }__CLR4_4_14dm4dmldnigfmq.R.inc(8073);_d = p;
            __CLR4_4_14dm4dmldnigfmq.R.inc(8074);p = d;
            __CLR4_4_14dm4dmldnigfmq.R.inc(8075);d = _d;
        }

        // if p[n] is greater than the threshold, there's no guarantee on it being the correct
        // distance
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8076);if ((((p[n] <= threshold)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8077)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8078)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8079);return p[n];
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8080);return -1;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // startsWith
    //-----------------------------------------------------------------------

    /**
     * <p>Check if a CharSequence starts with a specified prefix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringUtils.startsWith(null, null)      = true
     * StringUtils.startsWith(null, "abc")     = false
     * StringUtils.startsWith("abcdef", null)  = false
     * StringUtils.startsWith("abcdef", "abc") = true
     * StringUtils.startsWith("ABCDEF", "abc") = false
     * </pre>
     *
     * @see java.lang.String#startsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param prefix the prefix to find, may be null
     * @return {@code true} if the CharSequence starts with the prefix, case sensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from startsWith(String, String) to startsWith(CharSequence, CharSequence)
     */
    public static boolean startsWith(final CharSequence str, final CharSequence prefix) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8081);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8082);return startsWith(str, prefix, false);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Case insensitive check if a CharSequence starts with a specified prefix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case insensitive.</p>
     *
     * <pre>
     * StringUtils.startsWithIgnoreCase(null, null)      = true
     * StringUtils.startsWithIgnoreCase(null, "abc")     = false
     * StringUtils.startsWithIgnoreCase("abcdef", null)  = false
     * StringUtils.startsWithIgnoreCase("abcdef", "abc") = true
     * StringUtils.startsWithIgnoreCase("ABCDEF", "abc") = true
     * </pre>
     *
     * @see java.lang.String#startsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param prefix the prefix to find, may be null
     * @return {@code true} if the CharSequence starts with the prefix, case insensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from startsWithIgnoreCase(String, String) to startsWithIgnoreCase(CharSequence, CharSequence)
     */
    public static boolean startsWithIgnoreCase(final CharSequence str, final CharSequence prefix) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8083);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8084);return startsWith(str, prefix, true);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Check if a CharSequence starts with a specified prefix (optionally case insensitive).</p>
     *
     * @see java.lang.String#startsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param prefix the prefix to find, may be null
     * @param ignoreCase indicates whether the compare should ignore case
     *  (case insensitive) or not.
     * @return {@code true} if the CharSequence starts with the prefix or
     *  both {@code null}
     */
    private static boolean startsWith(final CharSequence str, final CharSequence prefix, final boolean ignoreCase) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8085);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8086);if ((((str == null || prefix == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8087)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8088)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8089);return str == null && prefix == null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8090);if ((((prefix.length() > str.length())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8091)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8092)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8093);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8094);return CharSequenceUtils.regionMatches(str, ignoreCase, 0, prefix, 0, prefix.length());
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Check if a CharSequence starts with any of an array of specified strings.</p>
     *
     * <pre>
     * StringUtils.startsWithAny(null, null)      = false
     * StringUtils.startsWithAny(null, new String[] {"abc"})  = false
     * StringUtils.startsWithAny("abcxyz", null)     = false
     * StringUtils.startsWithAny("abcxyz", new String[] {""}) = false
     * StringUtils.startsWithAny("abcxyz", new String[] {"abc"}) = true
     * StringUtils.startsWithAny("abcxyz", new String[] {null, "xyz", "abc"}) = true
     * </pre>
     *
     * @param string  the CharSequence to check, may be null
     * @param searchStrings the CharSequences to find, may be null or empty
     * @return {@code true} if the CharSequence starts with any of the the prefixes, case insensitive, or
     *  both {@code null}
     * @since 2.5
     * @since 3.0 Changed signature from startsWithAny(String, String[]) to startsWithAny(CharSequence, CharSequence...)
     */
    public static boolean startsWithAny(final CharSequence string, final CharSequence... searchStrings) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8095);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8096);if ((((isEmpty(string) || ArrayUtils.isEmpty(searchStrings))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8097)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8098)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8099);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8100);for (final CharSequence searchString : searchStrings) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8101);if ((((StringUtils.startsWith(string, searchString))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8102)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8103)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(8104);return true;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8105);return false;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    // endsWith
    //-----------------------------------------------------------------------

    /**
     * <p>Check if a CharSequence ends with a specified suffix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringUtils.endsWith(null, null)      = true
     * StringUtils.endsWith(null, "def")     = false
     * StringUtils.endsWith("abcdef", null)  = false
     * StringUtils.endsWith("abcdef", "def") = true
     * StringUtils.endsWith("ABCDEF", "def") = false
     * StringUtils.endsWith("ABCDEF", "cde") = false
     * </pre>
     *
     * @see java.lang.String#endsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param suffix the suffix to find, may be null
     * @return {@code true} if the CharSequence ends with the suffix, case sensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from endsWith(String, String) to endsWith(CharSequence, CharSequence)
     */
    public static boolean endsWith(final CharSequence str, final CharSequence suffix) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8106);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8107);return endsWith(str, suffix, false);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Case insensitive check if a CharSequence ends with a specified suffix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case insensitive.</p>
     *
     * <pre>
     * StringUtils.endsWithIgnoreCase(null, null)      = true
     * StringUtils.endsWithIgnoreCase(null, "def")     = false
     * StringUtils.endsWithIgnoreCase("abcdef", null)  = false
     * StringUtils.endsWithIgnoreCase("abcdef", "def") = true
     * StringUtils.endsWithIgnoreCase("ABCDEF", "def") = true
     * StringUtils.endsWithIgnoreCase("ABCDEF", "cde") = false
     * </pre>
     *
     * @see java.lang.String#endsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param suffix the suffix to find, may be null
     * @return {@code true} if the CharSequence ends with the suffix, case insensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from endsWithIgnoreCase(String, String) to endsWithIgnoreCase(CharSequence, CharSequence)
     */
    public static boolean endsWithIgnoreCase(final CharSequence str, final CharSequence suffix) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8108);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8109);return endsWith(str, suffix, true);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Check if a CharSequence ends with a specified suffix (optionally case insensitive).</p>
     *
     * @see java.lang.String#endsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param suffix the suffix to find, may be null
     * @param ignoreCase indicates whether the compare should ignore case
     *  (case insensitive) or not.
     * @return {@code true} if the CharSequence starts with the prefix or
     *  both {@code null}
     */
    private static boolean endsWith(final CharSequence str, final CharSequence suffix, final boolean ignoreCase) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8110);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8111);if ((((str == null || suffix == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8112)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8113)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8114);return str == null && suffix == null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8115);if ((((suffix.length() > str.length())&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8116)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8117)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8118);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8119);final int strOffset = str.length() - suffix.length();
        __CLR4_4_14dm4dmldnigfmq.R.inc(8120);return CharSequenceUtils.regionMatches(str, ignoreCase, strOffset, suffix, 0, suffix.length());
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>
     * Similar to <a
     * href="http://www.w3.org/TR/xpath/#function-normalize-space">http://www.w3.org/TR/xpath/#function-normalize
     * -space</a>
     * </p>
     * <p>
     * The function returns the argument string with whitespace normalized by using
     * <code>{@link #trim(String)}</code> to remove leading and trailing whitespace
     * and then replacing sequences of whitespace characters by a single space.
     * </p>
     * In XML Whitespace characters are the same as those allowed by the <a
     * href="http://www.w3.org/TR/REC-xml/#NT-S">S</a> production, which is S ::= (#x20 | #x9 | #xD | #xA)+
     * <p>
     * Java's regexp pattern \s defines whitespace as [ \t\n\x0B\f\r]
     * <p>
     * For reference:
     * <ul>
     * <li>\x0B = vertical tab</li>
     * <li>\f = #xC = form feed</li>
     * <li>#x20 = space</li>
     * <li>#x9 = \t</li>
     * <li>#xA = \n</li>
     * <li>#xD = \r</li>
     * </ul>
     * </p>
     * <p>
     * The difference is that Java's whitespace includes vertical tab and form feed, which this functional will also
     * normalize. Additionally <code>{@link #trim(String)}</code> removes control characters (char &lt;= 32) from both
     * ends of this String.
     * </p>
     *
     * @see Pattern
     * @see #trim(String)
     * @see <a
     *      href="http://www.w3.org/TR/xpath/#function-normalize-space">http://www.w3.org/TR/xpath/#function-normalize-space</a>
     * @param str the source String to normalize whitespaces from, may be null
     * @return the modified string with whitespace normalized, {@code null} if null String input
     *
     * @since 3.0
     */
    public static String normalizeSpace(final String str) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8121);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8122);if ((((str == null)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8123)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8124)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8125);return null;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8126);return WHITESPACE_PATTERN.matcher(trim(str)).replaceAll(SPACE);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * <p>Check if a CharSequence ends with any of an array of specified strings.</p>
     *
     * <pre>
     * StringUtils.endsWithAny(null, null)      = false
     * StringUtils.endsWithAny(null, new String[] {"abc"})  = false
     * StringUtils.endsWithAny("abcxyz", null)     = false
     * StringUtils.endsWithAny("abcxyz", new String[] {""}) = true
     * StringUtils.endsWithAny("abcxyz", new String[] {"xyz"}) = true
     * StringUtils.endsWithAny("abcxyz", new String[] {null, "xyz", "abc"}) = true
     * </pre>
     *
     * @param string  the CharSequence to check, may be null
     * @param searchStrings the CharSequences to find, may be null or empty
     * @return {@code true} if the CharSequence ends with any of the the prefixes, case insensitive, or
     *  both {@code null}
     * @since 3.0
     */
    public static boolean endsWithAny(final CharSequence string, final CharSequence... searchStrings) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8127);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8128);if ((((isEmpty(string) || ArrayUtils.isEmpty(searchStrings))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8129)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8130)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8131);return false;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8132);for (final CharSequence searchString : searchStrings) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8133);if ((((StringUtils.endsWith(string, searchString))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8134)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8135)==0&false))) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(8136);return true;
            }
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8137);return false;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Appends the suffix to the end of the string if the string does not
     * already end in the suffix.
     *
     * @param str The string.
     * @param suffix The suffix to append to the end of the string.
     * @param ignoreCase Indicates whether the compare should ignore case.
     * @param suffixes Additional suffixes that are valid terminators (optional).
     *
     * @return A new String if suffix was appened, the same string otherwise.
     */
    private static String appendIfMissing(final String str, final CharSequence suffix, final boolean ignoreCase, final CharSequence... suffixes) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8138);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8139);if ((((str == null || isEmpty(suffix) || endsWith(str, suffix, ignoreCase))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8140)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8141)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8142);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8143);if ((((suffixes != null && suffixes.length > 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8144)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8145)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8146);for (final CharSequence s : suffixes) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(8147);if ((((endsWith(str, s, ignoreCase))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8148)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8149)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(8150);return str;
                }
            }}
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8151);return str + suffix.toString();
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Appends the suffix to the end of the string if the string does not
     * already end with any the suffixes.
     *
     * <pre>
     * StringUtils.appendIfMissing(null, null) = null
     * StringUtils.appendIfMissing("abc", null) = "abc"
     * StringUtils.appendIfMissing("", "xyz") = "xyz"
     * StringUtils.appendIfMissing("abc", "xyz") = "abcxyz"
     * StringUtils.appendIfMissing("abcxyz", "xyz") = "abcxyz"
     * StringUtils.appendIfMissing("abcXYZ", "xyz") = "abcXYZxyz"
     * </pre>
     * <p>With additional suffixes,</p>
     * <pre>
     * StringUtils.appendIfMissing(null, null, null) = null
     * StringUtils.appendIfMissing("abc", null, null) = "abc"
     * StringUtils.appendIfMissing("", "xyz", null) = "xyz"
     * StringUtils.appendIfMissing("abc", "xyz", new CharSequence[]{null}) = "abcxyz"
     * StringUtils.appendIfMissing("abc", "xyz", "") = "abc"
     * StringUtils.appendIfMissing("abc", "xyz", "mno") = "abcxyz"
     * StringUtils.appendIfMissing("abcxyz", "xyz", "mno") = "abcxyz"
     * StringUtils.appendIfMissing("abcmno", "xyz", "mno") = "abcmno"
     * StringUtils.appendIfMissing("abcXYZ", "xyz", "mno") = "abcXYZxyz"
     * StringUtils.appendIfMissing("abcMNO", "xyz", "mno") = "abcMNOxyz"
     * </pre>
     *
     * @param str The string.
     * @param suffix The suffix to append to the end of the string.
     * @param suffixes Additional suffixes that are valid terminators.
     *
     * @return A new String if suffix was appened, the same string otherwise.
     *
     * @since 3.2
     */
    public static String appendIfMissing(final String str, final CharSequence suffix, final CharSequence... suffixes) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8152);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8153);return appendIfMissing(str, suffix, false, suffixes);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Appends the suffix to the end of the string if the string does not
     * already end, case insensitive, with any of the suffixes.
     *
     * <pre>
     * StringUtils.appendIfMissingIgnoreCase(null, null) = null
     * StringUtils.appendIfMissingIgnoreCase("abc", null) = "abc"
     * StringUtils.appendIfMissingIgnoreCase("", "xyz") = "xyz"
     * StringUtils.appendIfMissingIgnoreCase("abc", "xyz") = "abcxyz"
     * StringUtils.appendIfMissingIgnoreCase("abcxyz", "xyz") = "abcxyz"
     * StringUtils.appendIfMissingIgnoreCase("abcXYZ", "xyz") = "abcXYZ"
     * </pre>
     * <p>With additional suffixes,</p>
     * <pre>
     * StringUtils.appendIfMissingIgnoreCase(null, null, null) = null
     * StringUtils.appendIfMissingIgnoreCase("abc", null, null) = "abc"
     * StringUtils.appendIfMissingIgnoreCase("", "xyz", null) = "xyz"
     * StringUtils.appendIfMissingIgnoreCase("abc", "xyz", new CharSequence[]{null}) = "abcxyz"
     * StringUtils.appendIfMissingIgnoreCase("abc", "xyz", "") = "abc"
     * StringUtils.appendIfMissingIgnoreCase("abc", "xyz", "mno") = "axyz"
     * StringUtils.appendIfMissingIgnoreCase("abcxyz", "xyz", "mno") = "abcxyz"
     * StringUtils.appendIfMissingIgnoreCase("abcmno", "xyz", "mno") = "abcmno"
     * StringUtils.appendIfMissingIgnoreCase("abcXYZ", "xyz", "mno") = "abcXYZ"
     * StringUtils.appendIfMissingIgnoreCase("abcMNO", "xyz", "mno") = "abcMNO"
     * </pre>
     *
     * @param str The string.
     * @param suffix The suffix to append to the end of the string.
     * @param suffixes Additional suffixes that are valid terminators.
     *
     * @return A new String if suffix was appened, the same string otherwise.
     *
     * @since 3.2
     */
    public static String appendIfMissingIgnoreCase(final String str, final CharSequence suffix, final CharSequence... suffixes) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8154);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8155);return appendIfMissing(str, suffix, true, suffixes);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Prepends the prefix to the start of the string if the string does not
     * already start with any of the prefixes.
     *
     * @param str The string.
     * @param prefix The prefix to prepend to the start of the string.
     * @param ignoreCase Indicates whether the compare should ignore case.
     * @param prefixes Additional prefixes that are valid (optional).
     *
     * @return A new String if prefix was prepended, the same string otherwise.
     */
    private static String prependIfMissing(final String str, final CharSequence prefix, final boolean ignoreCase, final CharSequence... prefixes) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8156);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8157);if ((((str == null || isEmpty(prefix) || startsWith(str, prefix, ignoreCase))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8158)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8159)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8160);return str;
        }
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8161);if ((((prefixes != null && prefixes.length > 0)&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8162)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8163)==0&false))) {{
            __CLR4_4_14dm4dmldnigfmq.R.inc(8164);for (final CharSequence p : prefixes) {{
                __CLR4_4_14dm4dmldnigfmq.R.inc(8165);if ((((startsWith(str, p, ignoreCase))&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8166)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8167)==0&false))) {{
                    __CLR4_4_14dm4dmldnigfmq.R.inc(8168);return str;
                }
            }}
        }}
        }__CLR4_4_14dm4dmldnigfmq.R.inc(8169);return prefix.toString() + str;
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Prepends the prefix to the start of the string if the string does not
     * already start with any of the prefixes.
     *
     * <pre>
     * StringUtils.prependIfMissing(null, null) = null
     * StringUtils.prependIfMissing("abc", null) = "abc"
     * StringUtils.prependIfMissing("", "xyz") = "xyz"
     * StringUtils.prependIfMissing("abc", "xyz") = "xyzabc"
     * StringUtils.prependIfMissing("xyzabc", "xyz") = "xyzabc"
     * StringUtils.prependIfMissing("XYZabc", "xyz") = "xyzXYZabc"
     * </pre>
     * <p>With additional prefixes,</p>
     * <pre>
     * StringUtils.prependIfMissing(null, null, null) = null
     * StringUtils.prependIfMissing("abc", null, null) = "abc"
     * StringUtils.prependIfMissing("", "xyz", null) = "xyz"
     * StringUtils.prependIfMissing("abc", "xyz", new CharSequence[]{null}) = "xyzabc"
     * StringUtils.prependIfMissing("abc", "xyz", "") = "abc"
     * StringUtils.prependIfMissing("abc", "xyz", "mno") = "xyzabc"
     * StringUtils.prependIfMissing("xyzabc", "xyz", "mno") = "xyzabc"
     * StringUtils.prependIfMissing("mnoabc", "xyz", "mno") = "mnoabc"
     * StringUtils.prependIfMissing("XYZabc", "xyz", "mno") = "xyzXYZabc"
     * StringUtils.prependIfMissing("MNOabc", "xyz", "mno") = "xyzMNOabc"
     * </pre>
     *
     * @param str The string.
     * @param prefix The prefix to prepend to the start of the string.
     * @param prefixes Additional prefixes that are valid.
     *
     * @return A new String if prefix was prepended, the same string otherwise.
     *
     * @since 3.2
     */
    public static String prependIfMissing(final String str, final CharSequence prefix, final CharSequence... prefixes) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8170);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8171);return prependIfMissing(str, prefix, false, prefixes);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Prepends the prefix to the start of the string if the string does not
     * already start, case insensitive, with any of the prefixes.
     *
     * <pre>
     * StringUtils.prependIfMissingIgnoreCase(null, null) = null
     * StringUtils.prependIfMissingIgnoreCase("abc", null) = "abc"
     * StringUtils.prependIfMissingIgnoreCase("", "xyz") = "xyz"
     * StringUtils.prependIfMissingIgnoreCase("abc", "xyz") = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("xyzabc", "xyz") = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("XYZabc", "xyz") = "XYZabc"
     * </pre>
     * <p>With additional prefixes,</p>
     * <pre>
     * StringUtils.prependIfMissingIgnoreCase(null, null, null) = null
     * StringUtils.prependIfMissingIgnoreCase("abc", null, null) = "abc"
     * StringUtils.prependIfMissingIgnoreCase("", "xyz", null) = "xyz"
     * StringUtils.prependIfMissingIgnoreCase("abc", "xyz", new CharSequence[]{null}) = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("abc", "xyz", "") = "abc"
     * StringUtils.prependIfMissingIgnoreCase("abc", "xyz", "mno") = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("xyzabc", "xyz", "mno") = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("mnoabc", "xyz", "mno") = "mnoabc"
     * StringUtils.prependIfMissingIgnoreCase("XYZabc", "xyz", "mno") = "XYZabc"
     * StringUtils.prependIfMissingIgnoreCase("MNOabc", "xyz", "mno") = "MNOabc"
     * </pre>
     *
     * @param str The string.
     * @param prefix The prefix to prepend to the start of the string.
     * @param prefixes Additional prefixes that are valid (optional).
     *
     * @return A new String if prefix was prepended, the same string otherwise.
     *
     * @since 3.2
     */
    public static String prependIfMissingIgnoreCase(final String str, final CharSequence prefix, final CharSequence... prefixes) {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8172);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8173);return prependIfMissing(str, prefix, true, prefixes);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

    /**
     * Converts a <code>byte[]</code> to a String using the specified character encoding.
     * 
     * @param bytes
     *            the byte array to read from
     * @param charsetName
     *            the encoding to use, if null then use the platform default
     * @return a new String
     * @throws UnsupportedEncodingException
     *             If the named charset is not supported
     * @throws NullPointerException
     *             if the input is null
     * @since 3.1
     */
    public static String toString(final byte[] bytes, final String charsetName) throws UnsupportedEncodingException {try{__CLR4_4_14dm4dmldnigfmq.R.inc(8174);
        __CLR4_4_14dm4dmldnigfmq.R.inc(8175);return (((charsetName == null )&&(__CLR4_4_14dm4dmldnigfmq.R.iget(8176)!=0|true))||(__CLR4_4_14dm4dmldnigfmq.R.iget(8177)==0&false))? new String(bytes) : new String(bytes, charsetName);
    }finally{__CLR4_4_14dm4dmldnigfmq.R.flushNeeded();}}

}
