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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Tokenizes a string based based on delimiters (separators)
 * and supporting quoting and ignored character concepts.
 * <p>
 * This class can split a String into many smaller strings. It aims
 * to do a similar job to {@link java.util.StringTokenizer StringTokenizer},
 * however it offers much more control and flexibility including implementing
 * the <code>ListIterator</code> interface. By default, it is set up
 * like <code>StringTokenizer</code>.
 * <p>
 * The input String is split into a number of <i>tokens</i>.
 * Each token is separated from the next String by a <i>delimiter</i>.
 * One or more delimiter characters must be specified.
 * <p>
 * Each token may be surrounded by quotes.
 * The <i>quote</i> matcher specifies the quote character(s).
 * A quote may be escaped within a quoted section by duplicating itself.
 * <p>
 * Between each token and the delimiter are potentially characters that need trimming.
 * The <i>trimmer</i> matcher specifies these characters.
 * One usage might be to trim whitespace characters.
 * <p>
 * At any point outside the quotes there might potentially be invalid characters.
 * The <i>ignored</i> matcher specifies these characters to be removed.
 * One usage might be to remove new line characters.
 * <p>
 * Empty tokens may be removed or returned as null.
 * <pre>
 * "a,b,c"         - Three tokens "a","b","c"   (comma delimiter)
 * " a, b , c "    - Three tokens "a","b","c"   (default CSV processing trims whitespace)
 * "a, ", b ,", c" - Three tokens "a, " , " b ", ", c" (quoted text untouched)
 * </pre>
 * <p>
 *
 * This tokenizer has the following properties and options:
 *
 * <table>
 *  <tr>
 *   <th>Property</th><th>Type</th><th>Default</th>
 *  </tr>
 *  <tr>
 *   <td>delim</td><td>CharSetMatcher</td><td>{ \t\n\r\f}</td>
 *  </tr>
 *  <tr>
 *   <td>quote</td><td>NoneMatcher</td><td>{}</td>
 *  </tr>
 *  <tr>
 *   <td>ignore</td><td>NoneMatcher</td><td>{}</td>
 *  </tr>
 *  <tr>
 *   <td>emptyTokenAsNull</td><td>boolean</td><td>false</td>
 *  </tr>
 *  <tr>
 *   <td>ignoreEmptyTokens</td><td>boolean</td><td>true</td>
 *  </tr>
 * </table>
 *
 * @since 2.2
 * @version $Id$
 */
public class StrTokenizer implements ListIterator<String>, Cloneable {public static class __CLR4_4_1cn6cn6ldniggc3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,16743,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final StrTokenizer CSV_TOKENIZER_PROTOTYPE;
    private static final StrTokenizer TSV_TOKENIZER_PROTOTYPE;
    static {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16386);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16387);CSV_TOKENIZER_PROTOTYPE = new StrTokenizer();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16388);CSV_TOKENIZER_PROTOTYPE.setDelimiterMatcher(StrMatcher.commaMatcher());
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16389);CSV_TOKENIZER_PROTOTYPE.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16390);CSV_TOKENIZER_PROTOTYPE.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16391);CSV_TOKENIZER_PROTOTYPE.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16392);CSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16393);CSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);

        __CLR4_4_1cn6cn6ldniggc3.R.inc(16394);TSV_TOKENIZER_PROTOTYPE = new StrTokenizer();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16395);TSV_TOKENIZER_PROTOTYPE.setDelimiterMatcher(StrMatcher.tabMatcher());
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16396);TSV_TOKENIZER_PROTOTYPE.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16397);TSV_TOKENIZER_PROTOTYPE.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16398);TSV_TOKENIZER_PROTOTYPE.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16399);TSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16400);TSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /** The text to work on. */
    private char chars[];
    /** The parsed tokens */
    private String tokens[];
    /** The current iteration position */
    private int tokenPos;

    /** The delimiter matcher */
    private StrMatcher delimMatcher = StrMatcher.splitMatcher();
    /** The quote matcher */
    private StrMatcher quoteMatcher = StrMatcher.noneMatcher();
    /** The ignored matcher */
    private StrMatcher ignoredMatcher = StrMatcher.noneMatcher();
    /** The trimmer matcher */
    private StrMatcher trimmerMatcher = StrMatcher.noneMatcher();

    /** Whether to return empty tokens as null */
    private boolean emptyAsNull = false;
    /** Whether to ignore empty tokens */
    private boolean ignoreEmptyTokens = true;

    //-----------------------------------------------------------------------

    /**
     * Returns a clone of <code>CSV_TOKENIZER_PROTOTYPE</code>.
     * 
     * @return a clone of <code>CSV_TOKENIZER_PROTOTYPE</code>.
     */
    private static StrTokenizer getCSVClone() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16401);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16402);return (StrTokenizer) CSV_TOKENIZER_PROTOTYPE.clone();
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Comma Separated Value strings
     * initializing it with the given input.  The default for CSV processing
     * will be trim whitespace from both ends (which can be overridden with
     * the setTrimmer method).
     * <p>
     * You must call a "reset" method to set the string which you want to parse.
     * @return a new tokenizer instance which parses Comma Separated Value strings
     */
    public static StrTokenizer getCSVInstance() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16403);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16404);return getCSVClone();
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Comma Separated Value strings
     * initializing it with the given input.  The default for CSV processing
     * will be trim whitespace from both ends (which can be overridden with
     * the setTrimmer method).
     *
     * @param input  the text to parse
     * @return a new tokenizer instance which parses Comma Separated Value strings
     */
    public static StrTokenizer getCSVInstance(final String input) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16405);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16406);final StrTokenizer tok = getCSVClone();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16407);tok.reset(input);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16408);return tok;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Comma Separated Value strings
     * initializing it with the given input.  The default for CSV processing
     * will be trim whitespace from both ends (which can be overridden with
     * the setTrimmer method).
     *
     * @param input  the text to parse
     * @return a new tokenizer instance which parses Comma Separated Value strings
     */
    public static StrTokenizer getCSVInstance(final char[] input) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16409);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16410);final StrTokenizer tok = getCSVClone();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16411);tok.reset(input);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16412);return tok;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Returns a clone of <code>TSV_TOKENIZER_PROTOTYPE</code>.
     * 
     * @return a clone of <code>TSV_TOKENIZER_PROTOTYPE</code>.
     */
    private static StrTokenizer getTSVClone() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16413);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16414);return (StrTokenizer) TSV_TOKENIZER_PROTOTYPE.clone();
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}


    /**
     * Gets a new tokenizer instance which parses Tab Separated Value strings.
     * The default for CSV processing will be trim whitespace from both ends
     * (which can be overridden with the setTrimmer method).
     * <p>
     * You must call a "reset" method to set the string which you want to parse.
     * @return a new tokenizer instance which parses Tab Separated Value strings.
     */
    public static StrTokenizer getTSVInstance() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16415);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16416);return getTSVClone();
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Tab Separated Value strings.
     * The default for CSV processing will be trim whitespace from both ends
     * (which can be overridden with the setTrimmer method).
     * @param input  the string to parse
     * @return a new tokenizer instance which parses Tab Separated Value strings.
     */
    public static StrTokenizer getTSVInstance(final String input) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16417);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16418);final StrTokenizer tok = getTSVClone();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16419);tok.reset(input);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16420);return tok;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Tab Separated Value strings.
     * The default for CSV processing will be trim whitespace from both ends
     * (which can be overridden with the setTrimmer method).
     * @param input  the string to parse
     * @return a new tokenizer instance which parses Tab Separated Value strings.
     */
    public static StrTokenizer getTSVInstance(final char[] input) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16421);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16422);final StrTokenizer tok = getTSVClone();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16423);tok.reset(input);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16424);return tok;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a tokenizer splitting on space, tab, newline and formfeed
     * as per StringTokenizer, but with no text to tokenize.
     * <p>
     * This constructor is normally used with {@link #reset(String)}.
     */
    public StrTokenizer() {
        super();__CLR4_4_1cn6cn6ldniggc3.R.inc(16426);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16425);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16427);this.chars = null;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on space, tab, newline and formfeed
     * as per StringTokenizer.
     *
     * @param input  the string which is to be parsed
     */
    public StrTokenizer(final String input) {
        super();__CLR4_4_1cn6cn6ldniggc3.R.inc(16429);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16428);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16430);if ((((input != null)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16431)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16432)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16433);chars = input.toCharArray();
        } }else {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16434);chars = null;
        }
    }}finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified delimiter character.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter character
     */
    public StrTokenizer(final String input, final char delim) {
        this(input);__CLR4_4_1cn6cn6ldniggc3.R.inc(16436);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16435);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16437);setDelimiterChar(delim);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified delimiter string.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter string
     */
    public StrTokenizer(final String input, final String delim) {
        this(input);__CLR4_4_1cn6cn6ldniggc3.R.inc(16439);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16438);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16440);setDelimiterString(delim);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting using the specified delimiter matcher.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter matcher
     */
    public StrTokenizer(final String input, final StrMatcher delim) {
        this(input);__CLR4_4_1cn6cn6ldniggc3.R.inc(16442);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16441);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16443);setDelimiterMatcher(delim);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified delimiter character
     * and handling quotes using the specified quote character.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter character
     * @param quote  the field quoted string character
     */
    public StrTokenizer(final String input, final char delim, final char quote) {
        this(input, delim);__CLR4_4_1cn6cn6ldniggc3.R.inc(16445);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16444);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16446);setQuoteChar(quote);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting using the specified delimiter matcher
     * and handling quotes using the specified quote matcher.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter matcher
     * @param quote  the field quoted string matcher
     */
    public StrTokenizer(final String input, final StrMatcher delim, final StrMatcher quote) {
        this(input, delim);__CLR4_4_1cn6cn6ldniggc3.R.inc(16448);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16447);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16449);setQuoteMatcher(quote);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on space, tab, newline and formfeed
     * as per StringTokenizer.
     *
     * @param input  the string which is to be parsed, not cloned
     */
    public StrTokenizer(final char[] input) {
        super();__CLR4_4_1cn6cn6ldniggc3.R.inc(16451);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16450);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16452);this.chars = ArrayUtils.clone(input);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified character.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim the field delimiter character
     */
    public StrTokenizer(final char[] input, final char delim) {
        this(input);__CLR4_4_1cn6cn6ldniggc3.R.inc(16454);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16453);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16455);setDelimiterChar(delim);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified string.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim the field delimiter string
     */
    public StrTokenizer(final char[] input, final String delim) {
        this(input);__CLR4_4_1cn6cn6ldniggc3.R.inc(16457);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16456);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16458);setDelimiterString(delim);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting using the specified delimiter matcher.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim  the field delimiter matcher
     */
    public StrTokenizer(final char[] input, final StrMatcher delim) {
        this(input);__CLR4_4_1cn6cn6ldniggc3.R.inc(16460);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16459);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16461);setDelimiterMatcher(delim);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified delimiter character
     * and handling quotes using the specified quote character.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim  the field delimiter character
     * @param quote  the field quoted string character
     */
    public StrTokenizer(final char[] input, final char delim, final char quote) {
        this(input, delim);__CLR4_4_1cn6cn6ldniggc3.R.inc(16463);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16462);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16464);setQuoteChar(quote);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting using the specified delimiter matcher
     * and handling quotes using the specified quote matcher.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim  the field delimiter character
     * @param quote  the field quoted string character
     */
    public StrTokenizer(final char[] input, final StrMatcher delim, final StrMatcher quote) {
        this(input, delim);__CLR4_4_1cn6cn6ldniggc3.R.inc(16466);try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16465);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16467);setQuoteMatcher(quote);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    // API
    //-----------------------------------------------------------------------
    /**
     * Gets the number of tokens found in the String.
     *
     * @return the number of matched tokens
     */
    public int size() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16468);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16469);checkTokenized();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16470);return tokens.length;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets the next token from the String.
     * Equivalent to {@link #next()} except it returns null rather than
     * throwing {@link NoSuchElementException} when no tokens remain.
     *
     * @return the next sequential token, or null when no more tokens are found
     */
    public String nextToken() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16471);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16472);if ((((hasNext())&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16473)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16474)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16475);return tokens[tokenPos++];
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16476);return null;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets the previous token from the String.
     *
     * @return the previous sequential token, or null when no more tokens are found
     */
    public String previousToken() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16477);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16478);if ((((hasPrevious())&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16479)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16480)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16481);return tokens[--tokenPos];
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16482);return null;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets a copy of the full token list as an independent modifiable array.
     *
     * @return the tokens as a String array
     */
    public String[] getTokenArray() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16483);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16484);checkTokenized();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16485);return tokens.clone();
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets a copy of the full token list as an independent modifiable list.
     *
     * @return the tokens as a String array
     */
    public List<String> getTokenList() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16486);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16487);checkTokenized();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16488);final List<String> list = new ArrayList<String>(tokens.length);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16489);for (final String element : tokens) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16490);list.add(element);
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16491);return list;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Resets this tokenizer, forgetting all parsing and iteration already completed.
     * <p>
     * This method allows the same tokenizer to be reused for the same String.
     *
     * @return this, to enable chaining
     */
    public StrTokenizer reset() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16492);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16493);tokenPos = 0;
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16494);tokens = null;
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16495);return this;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Reset this tokenizer, giving it a new input string to parse.
     * In this manner you can re-use a tokenizer with the same settings
     * on multiple input lines.
     *
     * @param input  the new string to tokenize, null sets no text to parse
     * @return this, to enable chaining
     */
    public StrTokenizer reset(final String input) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16496);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16497);reset();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16498);if ((((input != null)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16499)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16500)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16501);this.chars = input.toCharArray();
        } }else {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16502);this.chars = null;
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16503);return this;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Reset this tokenizer, giving it a new input string to parse.
     * In this manner you can re-use a tokenizer with the same settings
     * on multiple input lines.
     *
     * @param input  the new character array to tokenize, not cloned, null sets no text to parse
     * @return this, to enable chaining
     */
    public StrTokenizer reset(final char[] input) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16504);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16505);reset();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16506);this.chars = ArrayUtils.clone(input);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16507);return this;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    // ListIterator
    //-----------------------------------------------------------------------
    /**
     * Checks whether there are any more tokens.
     *
     * @return true if there are more tokens
     */
    @Override
    public boolean hasNext() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16508);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16509);checkTokenized();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16510);return tokenPos < tokens.length;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets the next token.
     *
     * @return the next String token
     * @throws NoSuchElementException if there are no more elements
     */
    @Override
    public String next() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16511);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16512);if ((((hasNext())&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16513)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16514)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16515);return tokens[tokenPos++];
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16516);throw new NoSuchElementException();
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets the index of the next token to return.
     *
     * @return the next token index
     */
    @Override
    public int nextIndex() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16517);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16518);return tokenPos;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Checks whether there are any previous tokens that can be iterated to.
     *
     * @return true if there are previous tokens
     */
    @Override
    public boolean hasPrevious() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16519);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16520);checkTokenized();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16521);return tokenPos > 0;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets the token previous to the last returned token.
     *
     * @return the previous token
     */
    @Override
    public String previous() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16522);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16523);if ((((hasPrevious())&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16524)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16525)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16526);return tokens[--tokenPos];
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16527);throw new NoSuchElementException();
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Gets the index of the previous token.
     *
     * @return the previous token index
     */
    @Override
    public int previousIndex() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16528);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16529);return tokenPos - 1;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Unsupported ListIterator operation.
     *
     * @throws UnsupportedOperationException always
     */
    @Override
    public void remove() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16530);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16531);throw new UnsupportedOperationException("remove() is unsupported");
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Unsupported ListIterator operation.
     * @param obj this parameter ignored.
     * @throws UnsupportedOperationException always
     */
    @Override
    public void set(final String obj) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16532);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16533);throw new UnsupportedOperationException("set() is unsupported");
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Unsupported ListIterator operation.
     * @param obj this parameter ignored.
     * @throws UnsupportedOperationException always
     */
    @Override
    public void add(final String obj) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16534);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16535);throw new UnsupportedOperationException("add() is unsupported");
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    // Implementation
    //-----------------------------------------------------------------------
    /**
     * Checks if tokenization has been done, and if not then do it.
     */
    private void checkTokenized() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16536);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16537);if ((((tokens == null)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16538)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16539)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16540);if ((((chars == null)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16541)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16542)==0&false))) {{
                // still call tokenize as subclass may do some work
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16543);final List<String> split = tokenize(null, 0, 0);
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16544);tokens = split.toArray(new String[split.size()]);
            } }else {{
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16545);final List<String> split = tokenize(chars, 0, chars.length);
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16546);tokens = split.toArray(new String[split.size()]);
            }
        }}
    }}finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Internal method to performs the tokenization.
     * <p>
     * Most users of this class do not need to call this method. This method
     * will be called automatically by other (public) methods when required.
     * <p>
     * This method exists to allow subclasses to add code before or after the
     * tokenization. For example, a subclass could alter the character array,
     * offset or count to be parsed, or call the tokenizer multiple times on
     * multiple strings. It is also be possible to filter the results.
     * <p>
     * <code>StrTokenizer</code> will always pass a zero offset and a count
     * equal to the length of the array to this method, however a subclass
     * may pass other values, or even an entirely different array.
     * 
     * @param chars  the character array being tokenized, may be null
     * @param offset  the start position within the character array, must be valid
     * @param count  the number of characters to tokenize, must be valid
     * @return the modifiable list of String tokens, unmodifiable if null array or zero count
     */
    protected List<String> tokenize(final char[] chars, final int offset, final int count) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16547);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16548);if ((((chars == null || count == 0)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16549)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16550)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16551);return Collections.emptyList();
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16552);final StrBuilder buf = new StrBuilder();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16553);final List<String> tokens = new ArrayList<String>();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16554);int pos = offset;
        
        // loop around the entire buffer
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16555);while ((((pos >= 0 && pos < count)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16556)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16557)==0&false))) {{
            // find next token
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16558);pos = readNextToken(chars, pos, count, buf, tokens);
            
            // handle case where end of string is a delimiter
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16559);if ((((pos >= count)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16560)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16561)==0&false))) {{
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16562);addToken(tokens, "");
            }
        }}
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16563);return tokens;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Adds a token to a list, paying attention to the parameters we've set.
     *
     * @param list  the list to add to
     * @param tok  the token to add
     */
    private void addToken(final List<String> list, String tok) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16564);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16565);if ((((StringUtils.isEmpty(tok))&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16566)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16567)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16568);if ((((isIgnoreEmptyTokens())&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16569)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16570)==0&false))) {{
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16571);return;
            }
            }__CLR4_4_1cn6cn6ldniggc3.R.inc(16572);if ((((isEmptyTokenAsNull())&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16573)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16574)==0&false))) {{
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16575);tok = null;
            }
        }}
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16576);list.add(tok);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Reads character by character through the String to get the next token.
     *
     * @param chars  the character array being tokenized
     * @param start  the first character of field
     * @param len  the length of the character array being tokenized
     * @param workArea  a temporary work area
     * @param tokens  the list of parsed tokens
     * @return the starting position of the next field (the character
     *  immediately after the delimiter), or -1 if end of string found
     */
    private int readNextToken(final char[] chars, int start, final int len, final StrBuilder workArea, final List<String> tokens) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16577);
        // skip all leading whitespace, unless it is the
        // field delimiter or the quote character
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16578);while ((((start < len)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16579)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16580)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16581);final int removeLen = Math.max(
                    getIgnoredMatcher().isMatch(chars, start, start, len),
                    getTrimmerMatcher().isMatch(chars, start, start, len));
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16582);if ((((removeLen == 0 ||
                getDelimiterMatcher().isMatch(chars, start, start, len) > 0 ||
                getQuoteMatcher().isMatch(chars, start, start, len) > 0)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16583)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16584)==0&false))) {{
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16585);break;
            }
            }__CLR4_4_1cn6cn6ldniggc3.R.inc(16586);start += removeLen;
        }
        
        // handle reaching end
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16587);if ((((start >= len)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16588)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16589)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16590);addToken(tokens, "");
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16591);return -1;
        }
        
        // handle empty token
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16592);final int delimLen = getDelimiterMatcher().isMatch(chars, start, start, len);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16593);if ((((delimLen > 0)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16594)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16595)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16596);addToken(tokens, "");
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16597);return start + delimLen;
        }
        
        // handle found token
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16598);final int quoteLen = getQuoteMatcher().isMatch(chars, start, start, len);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16599);if ((((quoteLen > 0)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16600)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16601)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16602);return readWithQuotes(chars, start + quoteLen, len, workArea, tokens, start, quoteLen);
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16603);return readWithQuotes(chars, start, len, workArea, tokens, 0, 0);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Reads a possibly quoted string token.
     *
     * @param chars  the character array being tokenized
     * @param start  the first character of field
     * @param len  the length of the character array being tokenized
     * @param workArea  a temporary work area
     * @param tokens  the list of parsed tokens
     * @param quoteStart  the start position of the matched quote, 0 if no quoting
     * @param quoteLen  the length of the matched quote, 0 if no quoting
     * @return the starting position of the next field (the character
     *  immediately after the delimiter, or if end of string found,
     *  then the length of string
     */
    private int readWithQuotes(final char[] chars, final int start, final int len, final StrBuilder workArea, 
                               final List<String> tokens, final int quoteStart, final int quoteLen) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16604);
        // Loop until we've found the end of the quoted
        // string or the end of the input
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16605);workArea.clear();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16606);int pos = start;
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16607);boolean quoting = quoteLen > 0;
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16608);int trimStart = 0;
        
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16609);while ((((pos < len)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16610)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16611)==0&false))) {{
            // quoting mode can occur several times throughout a string
            // we must switch between quoting and non-quoting until we
            // encounter a non-quoted delimiter, or end of string
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16612);if ((((quoting)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16613)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16614)==0&false))) {{
                // In quoting mode
                
                // If we've found a quote character, see if it's
                // followed by a second quote.  If so, then we need
                // to actually put the quote character into the token
                // rather than end the token.
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16615);if ((((isQuote(chars, pos, len, quoteStart, quoteLen))&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16616)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16617)==0&false))) {{
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16618);if ((((isQuote(chars, pos + quoteLen, len, quoteStart, quoteLen))&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16619)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16620)==0&false))) {{
                        // matched pair of quotes, thus an escaped quote
                        __CLR4_4_1cn6cn6ldniggc3.R.inc(16621);workArea.append(chars, pos, quoteLen);
                        __CLR4_4_1cn6cn6ldniggc3.R.inc(16622);pos += quoteLen * 2;
                        __CLR4_4_1cn6cn6ldniggc3.R.inc(16623);trimStart = workArea.size();
                        __CLR4_4_1cn6cn6ldniggc3.R.inc(16624);continue;
                    }
                    
                    // end of quoting
                    }__CLR4_4_1cn6cn6ldniggc3.R.inc(16625);quoting = false;
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16626);pos += quoteLen;
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16627);continue;
                }
                
                // copy regular character from inside quotes
                }__CLR4_4_1cn6cn6ldniggc3.R.inc(16628);workArea.append(chars[pos++]);
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16629);trimStart = workArea.size();
                
            } }else {{
                // Not in quoting mode
                
                // check for delimiter, and thus end of token
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16630);final int delimLen = getDelimiterMatcher().isMatch(chars, pos, start, len);
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16631);if ((((delimLen > 0)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16632)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16633)==0&false))) {{
                    // return condition when end of token found
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16634);addToken(tokens, workArea.substring(0, trimStart));
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16635);return pos + delimLen;
                }
                
                // check for quote, and thus back into quoting mode
                }__CLR4_4_1cn6cn6ldniggc3.R.inc(16636);if ((((quoteLen > 0 && isQuote(chars, pos, len, quoteStart, quoteLen))&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16637)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16638)==0&false))) {{
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16639);quoting = true;
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16640);pos += quoteLen;
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16641);continue;
                }
                
                // check for ignored (outside quotes), and ignore
                }__CLR4_4_1cn6cn6ldniggc3.R.inc(16642);final int ignoredLen = getIgnoredMatcher().isMatch(chars, pos, start, len);
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16643);if ((((ignoredLen > 0)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16644)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16645)==0&false))) {{
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16646);pos += ignoredLen;
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16647);continue;
                }
                
                // check for trimmed character
                // don't yet know if its at the end, so copy to workArea
                // use trimStart to keep track of trim at the end
                }__CLR4_4_1cn6cn6ldniggc3.R.inc(16648);final int trimmedLen = getTrimmerMatcher().isMatch(chars, pos, start, len);
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16649);if ((((trimmedLen > 0)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16650)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16651)==0&false))) {{
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16652);workArea.append(chars, pos, trimmedLen);
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16653);pos += trimmedLen;
                    __CLR4_4_1cn6cn6ldniggc3.R.inc(16654);continue;
                }
                
                // copy regular character from outside quotes
                }__CLR4_4_1cn6cn6ldniggc3.R.inc(16655);workArea.append(chars[pos++]);
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16656);trimStart = workArea.size();
            }
        }}
        
        // return condition when end of string found
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16657);addToken(tokens, workArea.substring(0, trimStart));
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16658);return -1;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Checks if the characters at the index specified match the quote
     * already matched in readNextToken().
     *
     * @param chars  the character array being tokenized
     * @param pos  the position to check for a quote
     * @param len  the length of the character array being tokenized
     * @param quoteStart  the start position of the matched quote, 0 if no quoting
     * @param quoteLen  the length of the matched quote, 0 if no quoting
     * @return true if a quote is matched
     */
    private boolean isQuote(final char[] chars, final int pos, final int len, final int quoteStart, final int quoteLen) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16659);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16660);for (int i = 0; (((i < quoteLen)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16661)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16662)==0&false)); i++) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16663);if ((((pos + i >= len || chars[pos + i] != chars[quoteStart + i])&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16664)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16665)==0&false))) {{
                __CLR4_4_1cn6cn6ldniggc3.R.inc(16666);return false;
            }
        }}
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16667);return true;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    // Delimiter
    //-----------------------------------------------------------------------
    /**
     * Gets the field delimiter matcher.
     *
     * @return the delimiter matcher in use
     */
    public StrMatcher getDelimiterMatcher() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16668);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16669);return this.delimMatcher;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Sets the field delimiter matcher.
     * <p>
     * The delimitier is used to separate one token from another.
     *
     * @param delim  the delimiter matcher to use
     * @return this, to enable chaining
     */
    public StrTokenizer setDelimiterMatcher(final StrMatcher delim) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16670);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16671);if ((((delim == null)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16672)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16673)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16674);this.delimMatcher = StrMatcher.noneMatcher();
        } }else {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16675);this.delimMatcher = delim;
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16676);return this;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Sets the field delimiter character.
     *
     * @param delim  the delimiter character to use
     * @return this, to enable chaining
     */
    public StrTokenizer setDelimiterChar(final char delim) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16677);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16678);return setDelimiterMatcher(StrMatcher.charMatcher(delim));
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Sets the field delimiter string.
     *
     * @param delim  the delimiter string to use
     * @return this, to enable chaining
     */
    public StrTokenizer setDelimiterString(final String delim) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16679);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16680);return setDelimiterMatcher(StrMatcher.stringMatcher(delim));
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    // Quote
    //-----------------------------------------------------------------------
    /**
     * Gets the quote matcher currently in use.
     * <p>
     * The quote character is used to wrap data between the tokens.
     * This enables delimiters to be entered as data.
     * The default value is '"' (double quote).
     *
     * @return the quote matcher in use
     */
    public StrMatcher getQuoteMatcher() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16681);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16682);return quoteMatcher;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Set the quote matcher to use.
     * <p>
     * The quote character is used to wrap data between the tokens.
     * This enables delimiters to be entered as data.
     *
     * @param quote  the quote matcher to use, null ignored
     * @return this, to enable chaining
     */
    public StrTokenizer setQuoteMatcher(final StrMatcher quote) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16683);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16684);if ((((quote != null)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16685)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16686)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16687);this.quoteMatcher = quote;
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16688);return this;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Sets the quote character to use.
     * <p>
     * The quote character is used to wrap data between the tokens.
     * This enables delimiters to be entered as data.
     *
     * @param quote  the quote character to use
     * @return this, to enable chaining
     */
    public StrTokenizer setQuoteChar(final char quote) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16689);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16690);return setQuoteMatcher(StrMatcher.charMatcher(quote));
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    // Ignored
    //-----------------------------------------------------------------------
    /**
     * Gets the ignored character matcher.
     * <p>
     * These characters are ignored when parsing the String, unless they are
     * within a quoted region.
     * The default value is not to ignore anything.
     *
     * @return the ignored matcher in use
     */
    public StrMatcher getIgnoredMatcher() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16691);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16692);return ignoredMatcher;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Set the matcher for characters to ignore.
     * <p>
     * These characters are ignored when parsing the String, unless they are
     * within a quoted region.
     *
     * @param ignored  the ignored matcher to use, null ignored
     * @return this, to enable chaining
     */
    public StrTokenizer setIgnoredMatcher(final StrMatcher ignored) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16693);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16694);if ((((ignored != null)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16695)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16696)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16697);this.ignoredMatcher = ignored;
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16698);return this;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Set the character to ignore.
     * <p>
     * This character is ignored when parsing the String, unless it is
     * within a quoted region.
     *
     * @param ignored  the ignored character to use
     * @return this, to enable chaining
     */
    public StrTokenizer setIgnoredChar(final char ignored) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16699);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16700);return setIgnoredMatcher(StrMatcher.charMatcher(ignored));
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    // Trimmer
    //-----------------------------------------------------------------------
    /**
     * Gets the trimmer character matcher.
     * <p>
     * These characters are trimmed off on each side of the delimiter
     * until the token or quote is found.
     * The default value is not to trim anything.
     *
     * @return the trimmer matcher in use
     */
    public StrMatcher getTrimmerMatcher() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16701);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16702);return trimmerMatcher;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Sets the matcher for characters to trim.
     * <p>
     * These characters are trimmed off on each side of the delimiter
     * until the token or quote is found.
     *
     * @param trimmer  the trimmer matcher to use, null ignored
     * @return this, to enable chaining
     */
    public StrTokenizer setTrimmerMatcher(final StrMatcher trimmer) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16703);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16704);if ((((trimmer != null)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16705)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16706)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16707);this.trimmerMatcher = trimmer;
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16708);return this;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets whether the tokenizer currently returns empty tokens as null.
     * The default for this property is false.
     *
     * @return true if empty tokens are returned as null
     */
    public boolean isEmptyTokenAsNull() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16709);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16710);return this.emptyAsNull;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Sets whether the tokenizer should return empty tokens as null.
     * The default for this property is false.
     *
     * @param emptyAsNull  whether empty tokens are returned as null
     * @return this, to enable chaining
     */
    public StrTokenizer setEmptyTokenAsNull(final boolean emptyAsNull) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16711);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16712);this.emptyAsNull = emptyAsNull;
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16713);return this;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets whether the tokenizer currently ignores empty tokens.
     * The default for this property is true.
     *
     * @return true if empty tokens are not returned
     */
    public boolean isIgnoreEmptyTokens() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16714);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16715);return ignoreEmptyTokens;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Sets whether the tokenizer should ignore and not return empty tokens.
     * The default for this property is true.
     *
     * @param ignoreEmptyTokens  whether empty tokens are not returned
     * @return this, to enable chaining
     */
    public StrTokenizer setIgnoreEmptyTokens(final boolean ignoreEmptyTokens) {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16716);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16717);this.ignoreEmptyTokens = ignoreEmptyTokens;
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16718);return this;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the String content that the tokenizer is parsing.
     *
     * @return the string content being parsed
     */
    public String getContent() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16719);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16720);if ((((chars == null)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16721)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16722)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16723);return null;
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16724);return new String(chars);
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new instance of this Tokenizer. The new instance is reset so
     * that it will be at the start of the token list.
     * If a {@link CloneNotSupportedException} is caught, return <code>null</code>.
     * 
     * @return a new instance of this Tokenizer which has been reset.
     */
    @Override
    public Object clone() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16725);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16726);try {
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16727);return cloneReset();
        } catch (final CloneNotSupportedException ex) {
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16728);return null;
        }
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    /**
     * Creates a new instance of this Tokenizer. The new instance is reset so that
     * it will be at the start of the token list.
     * 
     * @return a new instance of this Tokenizer which has been reset.
     * @throws CloneNotSupportedException if there is a problem cloning
     */
    Object cloneReset() throws CloneNotSupportedException {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16729);
        // this method exists to enable 100% test coverage
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16730);final StrTokenizer cloned = (StrTokenizer) super.clone();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16731);if ((((cloned.chars != null)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16732)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16733)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16734);cloned.chars = cloned.chars.clone();
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16735);cloned.reset();
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16736);return cloned;
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the String content that the tokenizer is parsing.
     *
     * @return the string content being parsed
     */
    @Override
    public String toString() {try{__CLR4_4_1cn6cn6ldniggc3.R.inc(16737);
        __CLR4_4_1cn6cn6ldniggc3.R.inc(16738);if ((((tokens == null)&&(__CLR4_4_1cn6cn6ldniggc3.R.iget(16739)!=0|true))||(__CLR4_4_1cn6cn6ldniggc3.R.iget(16740)==0&false))) {{
            __CLR4_4_1cn6cn6ldniggc3.R.inc(16741);return "StrTokenizer[not tokenized yet]";
        }
        }__CLR4_4_1cn6cn6ldniggc3.R.inc(16742);return "StrTokenizer" + getTokenList();
    }finally{__CLR4_4_1cn6cn6ldniggc3.R.flushNeeded();}}

}
