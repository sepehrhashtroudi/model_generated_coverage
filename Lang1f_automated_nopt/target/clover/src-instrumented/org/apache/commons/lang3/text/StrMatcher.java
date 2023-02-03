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
package org.apache.commons.lang3.text;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

/**
 * A matcher class that can be queried to determine if a character array
 * portion matches.
 * <p>
 * This class comes complete with various factory methods.
 * If these do not suffice, you can subclass and implement your own matcher.
 *
 * @since 2.2
 * @version $Id$
 */
public abstract class StrMatcher {public static class __CLR4_4_1cbdcbdldni849q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,16053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Matches the comma character.
     */
    private static final StrMatcher COMMA_MATCHER = new CharMatcher(',');
    /**
     * Matches the tab character.
     */
    private static final StrMatcher TAB_MATCHER = new CharMatcher('\t');
    /**
     * Matches the space character.
     */
    private static final StrMatcher SPACE_MATCHER = new CharMatcher(' ');
    /**
     * Matches the same characters as StringTokenizer,
     * namely space, tab, newline, formfeed.
     */
    private static final StrMatcher SPLIT_MATCHER = new CharSetMatcher(" \t\n\r\f".toCharArray());
    /**
     * Matches the String trim() whitespace characters.
     */
    private static final StrMatcher TRIM_MATCHER = new TrimMatcher();
    /**
     * Matches the double quote character.
     */
    private static final StrMatcher SINGLE_QUOTE_MATCHER = new CharMatcher('\'');
    /**
     * Matches the double quote character.
     */
    private static final StrMatcher DOUBLE_QUOTE_MATCHER = new CharMatcher('"');
    /**
     * Matches the single or double quote character.
     */
    private static final StrMatcher QUOTE_MATCHER = new CharSetMatcher("'\"".toCharArray());
    /**
     * Matches no characters.
     */
    private static final StrMatcher NONE_MATCHER = new NoMatcher();

    // -----------------------------------------------------------------------

    /**
     * Returns a matcher which matches the comma character.
     *
     * @return a matcher for a comma
     */
    public static StrMatcher commaMatcher() {try{__CLR4_4_1cbdcbdldni849q.R.inc(15961);
        __CLR4_4_1cbdcbdldni849q.R.inc(15962);return COMMA_MATCHER;
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Returns a matcher which matches the tab character.
     *
     * @return a matcher for a tab
     */
    public static StrMatcher tabMatcher() {try{__CLR4_4_1cbdcbdldni849q.R.inc(15963);
        __CLR4_4_1cbdcbdldni849q.R.inc(15964);return TAB_MATCHER;
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Returns a matcher which matches the space character.
     *
     * @return a matcher for a space
     */
    public static StrMatcher spaceMatcher() {try{__CLR4_4_1cbdcbdldni849q.R.inc(15965);
        __CLR4_4_1cbdcbdldni849q.R.inc(15966);return SPACE_MATCHER;
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Matches the same characters as StringTokenizer,
     * namely space, tab, newline and formfeed.
     *
     * @return the split matcher
     */
    public static StrMatcher splitMatcher() {try{__CLR4_4_1cbdcbdldni849q.R.inc(15967);
        __CLR4_4_1cbdcbdldni849q.R.inc(15968);return SPLIT_MATCHER;
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Matches the String trim() whitespace characters.
     *
     * @return the trim matcher
     */
    public static StrMatcher trimMatcher() {try{__CLR4_4_1cbdcbdldni849q.R.inc(15969);
        __CLR4_4_1cbdcbdldni849q.R.inc(15970);return TRIM_MATCHER;
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Returns a matcher which matches the single quote character.
     *
     * @return a matcher for a single quote
     */
    public static StrMatcher singleQuoteMatcher() {try{__CLR4_4_1cbdcbdldni849q.R.inc(15971);
        __CLR4_4_1cbdcbdldni849q.R.inc(15972);return SINGLE_QUOTE_MATCHER;
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Returns a matcher which matches the double quote character.
     *
     * @return a matcher for a double quote
     */
    public static StrMatcher doubleQuoteMatcher() {try{__CLR4_4_1cbdcbdldni849q.R.inc(15973);
        __CLR4_4_1cbdcbdldni849q.R.inc(15974);return DOUBLE_QUOTE_MATCHER;
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Returns a matcher which matches the single or double quote character.
     *
     * @return a matcher for a single or double quote
     */
    public static StrMatcher quoteMatcher() {try{__CLR4_4_1cbdcbdldni849q.R.inc(15975);
        __CLR4_4_1cbdcbdldni849q.R.inc(15976);return QUOTE_MATCHER;
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Matches no characters.
     *
     * @return a matcher that matches nothing
     */
    public static StrMatcher noneMatcher() {try{__CLR4_4_1cbdcbdldni849q.R.inc(15977);
        __CLR4_4_1cbdcbdldni849q.R.inc(15978);return NONE_MATCHER;
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Constructor that creates a matcher from a character.
     *
     * @param ch  the character to match, must not be null
     * @return a new Matcher for the given char
     */
    public static StrMatcher charMatcher(final char ch) {try{__CLR4_4_1cbdcbdldni849q.R.inc(15979);
        __CLR4_4_1cbdcbdldni849q.R.inc(15980);return new CharMatcher(ch);
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Constructor that creates a matcher from a set of characters.
     *
     * @param chars  the characters to match, null or empty matches nothing
     * @return a new matcher for the given char[]
     */
    public static StrMatcher charSetMatcher(final char... chars) {try{__CLR4_4_1cbdcbdldni849q.R.inc(15981);
        __CLR4_4_1cbdcbdldni849q.R.inc(15982);if ((((chars == null || chars.length == 0)&&(__CLR4_4_1cbdcbdldni849q.R.iget(15983)!=0|true))||(__CLR4_4_1cbdcbdldni849q.R.iget(15984)==0&false))) {{
            __CLR4_4_1cbdcbdldni849q.R.inc(15985);return NONE_MATCHER;
        }
        }__CLR4_4_1cbdcbdldni849q.R.inc(15986);if ((((chars.length == 1)&&(__CLR4_4_1cbdcbdldni849q.R.iget(15987)!=0|true))||(__CLR4_4_1cbdcbdldni849q.R.iget(15988)==0&false))) {{
            __CLR4_4_1cbdcbdldni849q.R.inc(15989);return new CharMatcher(chars[0]);
        }
        }__CLR4_4_1cbdcbdldni849q.R.inc(15990);return new CharSetMatcher(chars);
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Constructor that creates a matcher from a string representing a set of characters.
     *
     * @param chars  the characters to match, null or empty matches nothing
     * @return a new Matcher for the given characters
     */
    public static StrMatcher charSetMatcher(final String chars) {try{__CLR4_4_1cbdcbdldni849q.R.inc(15991);
        __CLR4_4_1cbdcbdldni849q.R.inc(15992);if ((((StringUtils.isEmpty(chars))&&(__CLR4_4_1cbdcbdldni849q.R.iget(15993)!=0|true))||(__CLR4_4_1cbdcbdldni849q.R.iget(15994)==0&false))) {{
            __CLR4_4_1cbdcbdldni849q.R.inc(15995);return NONE_MATCHER;
        }
        }__CLR4_4_1cbdcbdldni849q.R.inc(15996);if ((((chars.length() == 1)&&(__CLR4_4_1cbdcbdldni849q.R.iget(15997)!=0|true))||(__CLR4_4_1cbdcbdldni849q.R.iget(15998)==0&false))) {{
            __CLR4_4_1cbdcbdldni849q.R.inc(15999);return new CharMatcher(chars.charAt(0));
        }
        }__CLR4_4_1cbdcbdldni849q.R.inc(16000);return new CharSetMatcher(chars.toCharArray());
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Constructor that creates a matcher from a string.
     *
     * @param str  the string to match, null or empty matches nothing
     * @return a new Matcher for the given String
     */
    public static StrMatcher stringMatcher(final String str) {try{__CLR4_4_1cbdcbdldni849q.R.inc(16001);
        __CLR4_4_1cbdcbdldni849q.R.inc(16002);if ((((StringUtils.isEmpty(str))&&(__CLR4_4_1cbdcbdldni849q.R.iget(16003)!=0|true))||(__CLR4_4_1cbdcbdldni849q.R.iget(16004)==0&false))) {{
            __CLR4_4_1cbdcbdldni849q.R.inc(16005);return NONE_MATCHER;
        }
        }__CLR4_4_1cbdcbdldni849q.R.inc(16006);return new StringMatcher(str);
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructor.
     */
    protected StrMatcher() {
        super();__CLR4_4_1cbdcbdldni849q.R.inc(16008);try{__CLR4_4_1cbdcbdldni849q.R.inc(16007);
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    /**
     * Returns the number of matching characters, zero for no match.
     * <p>
     * This method is called to check for a match.
     * The parameter <code>pos</code> represents the current position to be
     * checked in the string <code>buffer</code> (a character array which must
     * not be changed).
     * The API guarantees that <code>pos</code> is a valid index for <code>buffer</code>.
     * <p>
     * The character array may be larger than the active area to be matched.
     * Only values in the buffer between the specifed indices may be accessed.
     * <p>
     * The matching code may check one character or many.
     * It may check characters preceding <code>pos</code> as well as those
     * after, so long as no checks exceed the bounds specified.
     * <p>
     * It must return zero for no match, or a positive number if a match was found.
     * The number indicates the number of characters that matched.
     *
     * @param buffer  the text content to match against, do not change
     * @param pos  the starting position for the match, valid for buffer
     * @param bufferStart  the first active index in the buffer, valid for buffer
     * @param bufferEnd  the end index (exclusive) of the active buffer, valid for buffer
     * @return the number of matching characters, zero for no match
     */
    public abstract int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd);

    /**
     * Returns the number of matching characters, zero for no match.
     * <p>
     * This method is called to check for a match.
     * The parameter <code>pos</code> represents the current position to be
     * checked in the string <code>buffer</code> (a character array which must
     * not be changed).
     * The API guarantees that <code>pos</code> is a valid index for <code>buffer</code>.
     * <p>
     * The matching code may check one character or many.
     * It may check characters preceding <code>pos</code> as well as those after.
     * <p>
     * It must return zero for no match, or a positive number if a match was found.
     * The number indicates the number of characters that matched.
     *
     * @param buffer  the text content to match against, do not change
     * @param pos  the starting position for the match, valid for buffer
     * @return the number of matching characters, zero for no match
     * @since 2.4
     */
    public int isMatch(final char[] buffer, final int pos) {try{__CLR4_4_1cbdcbdldni849q.R.inc(16009);
        __CLR4_4_1cbdcbdldni849q.R.inc(16010);return isMatch(buffer, pos, 0, buffer.length);
    }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Class used to define a set of characters for matching purposes.
     */
    static final class CharSetMatcher extends StrMatcher {
        /** The set of characters to match. */
        private final char[] chars;

        /**
         * Constructor that creates a matcher from a character array.
         *
         * @param chars  the characters to match, must not be null
         */
        CharSetMatcher(final char chars[]) {
            super();__CLR4_4_1cbdcbdldni849q.R.inc(16012);try{__CLR4_4_1cbdcbdldni849q.R.inc(16011);
            __CLR4_4_1cbdcbdldni849q.R.inc(16013);this.chars = chars.clone();
            __CLR4_4_1cbdcbdldni849q.R.inc(16014);Arrays.sort(this.chars);
        }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

        /**
         * Returns whether or not the given character matches.
         *
         * @param buffer  the text content to match against, do not change
         * @param pos  the starting position for the match, valid for buffer
         * @param bufferStart  the first active index in the buffer, valid for buffer
         * @param bufferEnd  the end index of the active buffer, valid for buffer
         * @return the number of matching characters, zero for no match
         */
        @Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_4_1cbdcbdldni849q.R.inc(16015);
            __CLR4_4_1cbdcbdldni849q.R.inc(16016);return (((Arrays.binarySearch(chars, buffer[pos]) >= 0 )&&(__CLR4_4_1cbdcbdldni849q.R.iget(16017)!=0|true))||(__CLR4_4_1cbdcbdldni849q.R.iget(16018)==0&false))? 1 : 0;
        }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Class used to define a character for matching purposes.
     */
    static final class CharMatcher extends StrMatcher {
        /** The character to match. */
        private final char ch;

        /**
         * Constructor that creates a matcher that matches a single character.
         *
         * @param ch  the character to match
         */
        CharMatcher(final char ch) {
            super();__CLR4_4_1cbdcbdldni849q.R.inc(16020);try{__CLR4_4_1cbdcbdldni849q.R.inc(16019);
            __CLR4_4_1cbdcbdldni849q.R.inc(16021);this.ch = ch;
        }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

        /**
         * Returns whether or not the given character matches.
         *
         * @param buffer  the text content to match against, do not change
         * @param pos  the starting position for the match, valid for buffer
         * @param bufferStart  the first active index in the buffer, valid for buffer
         * @param bufferEnd  the end index of the active buffer, valid for buffer
         * @return the number of matching characters, zero for no match
         */
        @Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_4_1cbdcbdldni849q.R.inc(16022);
            __CLR4_4_1cbdcbdldni849q.R.inc(16023);return (((ch == buffer[pos] )&&(__CLR4_4_1cbdcbdldni849q.R.iget(16024)!=0|true))||(__CLR4_4_1cbdcbdldni849q.R.iget(16025)==0&false))? 1 : 0;
        }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Class used to define a set of characters for matching purposes.
     */
    static final class StringMatcher extends StrMatcher {
        /** The string to match, as a character array. */
        private final char[] chars;

        /**
         * Constructor that creates a matcher from a String.
         *
         * @param str  the string to match, must not be null
         */
        StringMatcher(final String str) {
            super();__CLR4_4_1cbdcbdldni849q.R.inc(16027);try{__CLR4_4_1cbdcbdldni849q.R.inc(16026);
            __CLR4_4_1cbdcbdldni849q.R.inc(16028);chars = str.toCharArray();
        }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

        /**
         * Returns whether or not the given text matches the stored string.
         *
         * @param buffer  the text content to match against, do not change
         * @param pos  the starting position for the match, valid for buffer
         * @param bufferStart  the first active index in the buffer, valid for buffer
         * @param bufferEnd  the end index of the active buffer, valid for buffer
         * @return the number of matching characters, zero for no match
         */
        @Override
        public int isMatch(final char[] buffer, int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_4_1cbdcbdldni849q.R.inc(16029);
            __CLR4_4_1cbdcbdldni849q.R.inc(16030);final int len = chars.length;
            __CLR4_4_1cbdcbdldni849q.R.inc(16031);if ((((pos + len > bufferEnd)&&(__CLR4_4_1cbdcbdldni849q.R.iget(16032)!=0|true))||(__CLR4_4_1cbdcbdldni849q.R.iget(16033)==0&false))) {{
                __CLR4_4_1cbdcbdldni849q.R.inc(16034);return 0;
            }
            }__CLR4_4_1cbdcbdldni849q.R.inc(16035);for (int i = 0; (((i < chars.length)&&(__CLR4_4_1cbdcbdldni849q.R.iget(16036)!=0|true))||(__CLR4_4_1cbdcbdldni849q.R.iget(16037)==0&false)); i++, pos++) {{
                __CLR4_4_1cbdcbdldni849q.R.inc(16038);if ((((chars[i] != buffer[pos])&&(__CLR4_4_1cbdcbdldni849q.R.iget(16039)!=0|true))||(__CLR4_4_1cbdcbdldni849q.R.iget(16040)==0&false))) {{
                    __CLR4_4_1cbdcbdldni849q.R.inc(16041);return 0;
                }
            }}
            }__CLR4_4_1cbdcbdldni849q.R.inc(16042);return len;
        }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Class used to match no characters.
     */
    static final class NoMatcher extends StrMatcher {

        /**
         * Constructs a new instance of <code>NoMatcher</code>.
         */
        NoMatcher() {
            super();__CLR4_4_1cbdcbdldni849q.R.inc(16044);try{__CLR4_4_1cbdcbdldni849q.R.inc(16043);
        }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

        /**
         * Always returns <code>false</code>.
         *
         * @param buffer  the text content to match against, do not change
         * @param pos  the starting position for the match, valid for buffer
         * @param bufferStart  the first active index in the buffer, valid for buffer
         * @param bufferEnd  the end index of the active buffer, valid for buffer
         * @return the number of matching characters, zero for no match
         */
        @Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_4_1cbdcbdldni849q.R.inc(16045);
            __CLR4_4_1cbdcbdldni849q.R.inc(16046);return 0;
        }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Class used to match whitespace as per trim().
     */
    static final class TrimMatcher extends StrMatcher {

        /**
         * Constructs a new instance of <code>TrimMatcher</code>.
         */
        TrimMatcher() {
            super();__CLR4_4_1cbdcbdldni849q.R.inc(16048);try{__CLR4_4_1cbdcbdldni849q.R.inc(16047);
        }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}

        /**
         * Returns whether or not the given character matches.
         *
         * @param buffer  the text content to match against, do not change
         * @param pos  the starting position for the match, valid for buffer
         * @param bufferStart  the first active index in the buffer, valid for buffer
         * @param bufferEnd  the end index of the active buffer, valid for buffer
         * @return the number of matching characters, zero for no match
         */
        @Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_4_1cbdcbdldni849q.R.inc(16049);
            __CLR4_4_1cbdcbdldni849q.R.inc(16050);return (((buffer[pos] <= 32 )&&(__CLR4_4_1cbdcbdldni849q.R.iget(16051)!=0|true))||(__CLR4_4_1cbdcbdldni849q.R.iget(16052)==0&false))? 1 : 0;
        }finally{__CLR4_4_1cbdcbdldni849q.R.flushNeeded();}}
    }

}
