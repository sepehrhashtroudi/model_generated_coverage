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
package org.apache.commons.lang3.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.lang3.Validate;

/**
 * <p>FastDatePrinter is a fast and thread-safe version of
 * {@link java.text.SimpleDateFormat}.</p>
 *
 * <p>This class can be used as a direct replacement to
 * {@code SimpleDateFormat} in most formatting situations.
 * This class is especially useful in multi-threaded server environments.
 * {@code SimpleDateFormat} is not thread-safe in any JDK version,
 * nor will it be as Sun have closed the bug/RFE.
 * </p>
 *
 * <p>Only formatting is supported, but all patterns are compatible with
 * SimpleDateFormat (except time zones and some year patterns - see below).</p>
 *
 * <p>Java 1.4 introduced a new pattern letter, {@code 'Z'}, to represent
 * time zones in RFC822 format (eg. {@code +0800} or {@code -1100}).
 * This pattern letter can be used here (on all JDK versions).</p>
 *
 * <p>In addition, the pattern {@code 'ZZ'} has been made to represent
 * ISO8601 full format time zones (eg. {@code +08:00} or {@code -11:00}).
 * This introduces a minor incompatibility with Java 1.4, but at a gain of
 * useful functionality.</p>
 *
 * <p>Javadoc cites for the year pattern: <i>For formatting, if the number of
 * pattern letters is 2, the year is truncated to 2 digits; otherwise it is
 * interpreted as a number.</i> Starting with Java 1.7 a pattern of 'Y' or
 * 'YYY' will be formatted as '2003', while it was '03' in former Java
 * versions. FastDatePrinter implements the behavior of Java 7.</p>
 *
 * @since 3.2
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FastDatePrinter implements DatePrinter, Serializable {public static class __CLR4_4_1ecyecyldni84im{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,19078,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // A lot of the speed in this class comes from caching, but some comes
    // from the special int to StringBuffer conversion.
    //
    // The following produces a padded 2 digit number:
    //   buffer.append((char)(value / 10 + '0'));
    //   buffer.append((char)(value % 10 + '0'));
    //
    // Note that the fastest append to StringBuffer is a single char (used here).
    // Note that Integer.toString() is not called, the conversion is simply
    // taking the value and adding (mathematically) the ASCII value for '0'.
    // So, don't change this code! It works and is very fast.

    /**
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;

    /**
     * FULL locale dependent date or time style.
     */
    public static final int FULL = DateFormat.FULL;
    /**
     * LONG locale dependent date or time style.
     */
    public static final int LONG = DateFormat.LONG;
    /**
     * MEDIUM locale dependent date or time style.
     */
    public static final int MEDIUM = DateFormat.MEDIUM;
    /**
     * SHORT locale dependent date or time style.
     */
    public static final int SHORT = DateFormat.SHORT;

    /**
     * The pattern.
     */
    private final String mPattern;
    /**
     * The time zone.
     */
    private final TimeZone mTimeZone;
    /**
     * The locale.
     */
    private final Locale mLocale;
    /**
     * The parsed rules.
     */
    private transient Rule[] mRules;
    /**
     * The estimated maximum length.
     */
    private transient int mMaxLengthEstimate;

    // Constructor
    //-----------------------------------------------------------------------
    /**
     * <p>Constructs a new FastDatePrinter.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern
     * @param timeZone  non-null time zone to use
     * @param locale  non-null locale to use
     * @throws NullPointerException if pattern, timeZone, or locale is null.
     */
    protected FastDatePrinter(final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_4_1ecyecyldni84im.R.inc(18610);
        __CLR4_4_1ecyecyldni84im.R.inc(18611);mPattern = pattern;
        __CLR4_4_1ecyecyldni84im.R.inc(18612);mTimeZone = timeZone;
        __CLR4_4_1ecyecyldni84im.R.inc(18613);mLocale = locale;

        __CLR4_4_1ecyecyldni84im.R.inc(18614);init();
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /**
     * <p>Initializes the instance for first use.</p>
     */
    private void init() {try{__CLR4_4_1ecyecyldni84im.R.inc(18615);
        __CLR4_4_1ecyecyldni84im.R.inc(18616);final List<Rule> rulesList = parsePattern();
        __CLR4_4_1ecyecyldni84im.R.inc(18617);mRules = rulesList.toArray(new Rule[rulesList.size()]);

        __CLR4_4_1ecyecyldni84im.R.inc(18618);int len = 0;
        __CLR4_4_1ecyecyldni84im.R.inc(18619);for (int i=mRules.length; (((--i >= 0)&&(__CLR4_4_1ecyecyldni84im.R.iget(18620)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18621)==0&false)); ) {{
            __CLR4_4_1ecyecyldni84im.R.inc(18622);len += mRules[i].estimateLength();
        }

        }__CLR4_4_1ecyecyldni84im.R.inc(18623);mMaxLengthEstimate = len;
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    // Parse the pattern
    //-----------------------------------------------------------------------
    /**
     * <p>Returns a list of Rules given a pattern.</p>
     *
     * @return a {@code List} of Rule objects
     * @throws IllegalArgumentException if pattern is invalid
     */
    protected List<Rule> parsePattern() {try{__CLR4_4_1ecyecyldni84im.R.inc(18624);
        __CLR4_4_1ecyecyldni84im.R.inc(18625);final DateFormatSymbols symbols = new DateFormatSymbols(mLocale);
        __CLR4_4_1ecyecyldni84im.R.inc(18626);final List<Rule> rules = new ArrayList<Rule>();

        __CLR4_4_1ecyecyldni84im.R.inc(18627);final String[] ERAs = symbols.getEras();
        __CLR4_4_1ecyecyldni84im.R.inc(18628);final String[] months = symbols.getMonths();
        __CLR4_4_1ecyecyldni84im.R.inc(18629);final String[] shortMonths = symbols.getShortMonths();
        __CLR4_4_1ecyecyldni84im.R.inc(18630);final String[] weekdays = symbols.getWeekdays();
        __CLR4_4_1ecyecyldni84im.R.inc(18631);final String[] shortWeekdays = symbols.getShortWeekdays();
        __CLR4_4_1ecyecyldni84im.R.inc(18632);final String[] AmPmStrings = symbols.getAmPmStrings();

        __CLR4_4_1ecyecyldni84im.R.inc(18633);final int length = mPattern.length();
        __CLR4_4_1ecyecyldni84im.R.inc(18634);final int[] indexRef = new int[1];

        __CLR4_4_1ecyecyldni84im.R.inc(18635);for (int i = 0; (((i < length)&&(__CLR4_4_1ecyecyldni84im.R.iget(18636)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18637)==0&false)); i++) {{
            __CLR4_4_1ecyecyldni84im.R.inc(18638);indexRef[0] = i;
            __CLR4_4_1ecyecyldni84im.R.inc(18639);final String token = parseToken(mPattern, indexRef);
            __CLR4_4_1ecyecyldni84im.R.inc(18640);i = indexRef[0];

            __CLR4_4_1ecyecyldni84im.R.inc(18641);final int tokenLen = token.length();
            __CLR4_4_1ecyecyldni84im.R.inc(18642);if ((((tokenLen == 0)&&(__CLR4_4_1ecyecyldni84im.R.iget(18643)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18644)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(18645);break;
            }

            }__CLR4_4_1ecyecyldni84im.R.inc(18646);Rule rule;
            __CLR4_4_1ecyecyldni84im.R.inc(18647);final char c = token.charAt(0);

            boolean __CLB4_4_1_bool0=false;__CLR4_4_1ecyecyldni84im.R.inc(18648);switch (c) {
            case 'G':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18649);__CLB4_4_1_bool0=true;} // era designator (text)
                __CLR4_4_1ecyecyldni84im.R.inc(18650);rule = new TextField(Calendar.ERA, ERAs);
                __CLR4_4_1ecyecyldni84im.R.inc(18651);break;
            case 'y':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18652);__CLB4_4_1_bool0=true;} // year (number)
                __CLR4_4_1ecyecyldni84im.R.inc(18653);if ((((tokenLen == 2)&&(__CLR4_4_1ecyecyldni84im.R.iget(18654)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18655)==0&false))) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18656);rule = TwoDigitYearField.INSTANCE;
                } }else {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18657);rule = selectNumberRule(Calendar.YEAR, (((tokenLen < 4 )&&(__CLR4_4_1ecyecyldni84im.R.iget(18658)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18659)==0&false))? 4 : tokenLen);
                }
                }__CLR4_4_1ecyecyldni84im.R.inc(18660);break;
            case 'M':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18661);__CLB4_4_1_bool0=true;} // month in year (text and number)
                __CLR4_4_1ecyecyldni84im.R.inc(18662);if ((((tokenLen >= 4)&&(__CLR4_4_1ecyecyldni84im.R.iget(18663)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18664)==0&false))) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18665);rule = new TextField(Calendar.MONTH, months);
                } }else {__CLR4_4_1ecyecyldni84im.R.inc(18666);if ((((tokenLen == 3)&&(__CLR4_4_1ecyecyldni84im.R.iget(18667)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18668)==0&false))) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18669);rule = new TextField(Calendar.MONTH, shortMonths);
                } }else {__CLR4_4_1ecyecyldni84im.R.inc(18670);if ((((tokenLen == 2)&&(__CLR4_4_1ecyecyldni84im.R.iget(18671)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18672)==0&false))) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18673);rule = TwoDigitMonthField.INSTANCE;
                } }else {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18674);rule = UnpaddedMonthField.INSTANCE;
                }
                }}}__CLR4_4_1ecyecyldni84im.R.inc(18675);break;
            case 'd':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18676);__CLB4_4_1_bool0=true;} // day in month (number)
                __CLR4_4_1ecyecyldni84im.R.inc(18677);rule = selectNumberRule(Calendar.DAY_OF_MONTH, tokenLen);
                __CLR4_4_1ecyecyldni84im.R.inc(18678);break;
            case 'h':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18679);__CLB4_4_1_bool0=true;} // hour in am/pm (number, 1..12)
                __CLR4_4_1ecyecyldni84im.R.inc(18680);rule = new TwelveHourField(selectNumberRule(Calendar.HOUR, tokenLen));
                __CLR4_4_1ecyecyldni84im.R.inc(18681);break;
            case 'H':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18682);__CLB4_4_1_bool0=true;} // hour in day (number, 0..23)
                __CLR4_4_1ecyecyldni84im.R.inc(18683);rule = selectNumberRule(Calendar.HOUR_OF_DAY, tokenLen);
                __CLR4_4_1ecyecyldni84im.R.inc(18684);break;
            case 'm':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18685);__CLB4_4_1_bool0=true;} // minute in hour (number)
                __CLR4_4_1ecyecyldni84im.R.inc(18686);rule = selectNumberRule(Calendar.MINUTE, tokenLen);
                __CLR4_4_1ecyecyldni84im.R.inc(18687);break;
            case 's':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18688);__CLB4_4_1_bool0=true;} // second in minute (number)
                __CLR4_4_1ecyecyldni84im.R.inc(18689);rule = selectNumberRule(Calendar.SECOND, tokenLen);
                __CLR4_4_1ecyecyldni84im.R.inc(18690);break;
            case 'S':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18691);__CLB4_4_1_bool0=true;} // millisecond (number)
                __CLR4_4_1ecyecyldni84im.R.inc(18692);rule = selectNumberRule(Calendar.MILLISECOND, tokenLen);
                __CLR4_4_1ecyecyldni84im.R.inc(18693);break;
            case 'E':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18694);__CLB4_4_1_bool0=true;} // day in week (text)
                __CLR4_4_1ecyecyldni84im.R.inc(18695);rule = new TextField(Calendar.DAY_OF_WEEK, (((tokenLen < 4 )&&(__CLR4_4_1ecyecyldni84im.R.iget(18696)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18697)==0&false))? shortWeekdays : weekdays);
                __CLR4_4_1ecyecyldni84im.R.inc(18698);break;
            case 'D':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18699);__CLB4_4_1_bool0=true;} // day in year (number)
                __CLR4_4_1ecyecyldni84im.R.inc(18700);rule = selectNumberRule(Calendar.DAY_OF_YEAR, tokenLen);
                __CLR4_4_1ecyecyldni84im.R.inc(18701);break;
            case 'F':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18702);__CLB4_4_1_bool0=true;} // day of week in month (number)
                __CLR4_4_1ecyecyldni84im.R.inc(18703);rule = selectNumberRule(Calendar.DAY_OF_WEEK_IN_MONTH, tokenLen);
                __CLR4_4_1ecyecyldni84im.R.inc(18704);break;
            case 'w':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18705);__CLB4_4_1_bool0=true;} // week in year (number)
                __CLR4_4_1ecyecyldni84im.R.inc(18706);rule = selectNumberRule(Calendar.WEEK_OF_YEAR, tokenLen);
                __CLR4_4_1ecyecyldni84im.R.inc(18707);break;
            case 'W':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18708);__CLB4_4_1_bool0=true;} // week in month (number)
                __CLR4_4_1ecyecyldni84im.R.inc(18709);rule = selectNumberRule(Calendar.WEEK_OF_MONTH, tokenLen);
                __CLR4_4_1ecyecyldni84im.R.inc(18710);break;
            case 'a':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18711);__CLB4_4_1_bool0=true;} // am/pm marker (text)
                __CLR4_4_1ecyecyldni84im.R.inc(18712);rule = new TextField(Calendar.AM_PM, AmPmStrings);
                __CLR4_4_1ecyecyldni84im.R.inc(18713);break;
            case 'k':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18714);__CLB4_4_1_bool0=true;} // hour in day (1..24)
                __CLR4_4_1ecyecyldni84im.R.inc(18715);rule = new TwentyFourHourField(selectNumberRule(Calendar.HOUR_OF_DAY, tokenLen));
                __CLR4_4_1ecyecyldni84im.R.inc(18716);break;
            case 'K':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18717);__CLB4_4_1_bool0=true;} // hour in am/pm (0..11)
                __CLR4_4_1ecyecyldni84im.R.inc(18718);rule = selectNumberRule(Calendar.HOUR, tokenLen);
                __CLR4_4_1ecyecyldni84im.R.inc(18719);break;
            case 'z':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18720);__CLB4_4_1_bool0=true;} // time zone (text)
                __CLR4_4_1ecyecyldni84im.R.inc(18721);if ((((tokenLen >= 4)&&(__CLR4_4_1ecyecyldni84im.R.iget(18722)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18723)==0&false))) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18724);rule = new TimeZoneNameRule(mTimeZone, mLocale, TimeZone.LONG);
                } }else {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18725);rule = new TimeZoneNameRule(mTimeZone, mLocale, TimeZone.SHORT);
                }
                }__CLR4_4_1ecyecyldni84im.R.inc(18726);break;
            case 'Z':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18727);__CLB4_4_1_bool0=true;} // time zone (value)
                __CLR4_4_1ecyecyldni84im.R.inc(18728);if ((((tokenLen == 1)&&(__CLR4_4_1ecyecyldni84im.R.iget(18729)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18730)==0&false))) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18731);rule = TimeZoneNumberRule.INSTANCE_NO_COLON;
                } }else {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18732);rule = TimeZoneNumberRule.INSTANCE_COLON;
                }
                }__CLR4_4_1ecyecyldni84im.R.inc(18733);break;
            case '\'':if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18734);__CLB4_4_1_bool0=true;} // literal text
                __CLR4_4_1ecyecyldni84im.R.inc(18735);final String sub = token.substring(1);
                __CLR4_4_1ecyecyldni84im.R.inc(18736);if ((((sub.length() == 1)&&(__CLR4_4_1ecyecyldni84im.R.iget(18737)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18738)==0&false))) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18739);rule = new CharacterLiteral(sub.charAt(0));
                } }else {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18740);rule = new StringLiteral(sub);
                }
                }__CLR4_4_1ecyecyldni84im.R.inc(18741);break;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecyldni84im.R.inc(18742);__CLB4_4_1_bool0=true;}
                __CLR4_4_1ecyecyldni84im.R.inc(18743);throw new IllegalArgumentException("Illegal pattern component: " + token);
            }

            __CLR4_4_1ecyecyldni84im.R.inc(18744);rules.add(rule);
        }

        }__CLR4_4_1ecyecyldni84im.R.inc(18745);return rules;
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /**
     * <p>Performs the parsing of tokens.</p>
     *
     * @param pattern  the pattern
     * @param indexRef  index references
     * @return parsed token
     */
    protected String parseToken(final String pattern, final int[] indexRef) {try{__CLR4_4_1ecyecyldni84im.R.inc(18746);
        __CLR4_4_1ecyecyldni84im.R.inc(18747);final StringBuilder buf = new StringBuilder();

        __CLR4_4_1ecyecyldni84im.R.inc(18748);int i = indexRef[0];
        __CLR4_4_1ecyecyldni84im.R.inc(18749);final int length = pattern.length();

        __CLR4_4_1ecyecyldni84im.R.inc(18750);char c = pattern.charAt(i);
        __CLR4_4_1ecyecyldni84im.R.inc(18751);if ((((c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')&&(__CLR4_4_1ecyecyldni84im.R.iget(18752)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18753)==0&false))) {{
            // Scan a run of the same character, which indicates a time
            // pattern.
            __CLR4_4_1ecyecyldni84im.R.inc(18754);buf.append(c);

            __CLR4_4_1ecyecyldni84im.R.inc(18755);while ((((i + 1 < length)&&(__CLR4_4_1ecyecyldni84im.R.iget(18756)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18757)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(18758);final char peek = pattern.charAt(i + 1);
                __CLR4_4_1ecyecyldni84im.R.inc(18759);if ((((peek == c)&&(__CLR4_4_1ecyecyldni84im.R.iget(18760)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18761)==0&false))) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18762);buf.append(c);
                    __CLR4_4_1ecyecyldni84im.R.inc(18763);i++;
                } }else {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18764);break;
                }
            }}
        }} }else {{
            // This will identify token as text.
            __CLR4_4_1ecyecyldni84im.R.inc(18765);buf.append('\'');

            __CLR4_4_1ecyecyldni84im.R.inc(18766);boolean inLiteral = false;

            __CLR4_4_1ecyecyldni84im.R.inc(18767);for (; (((i < length)&&(__CLR4_4_1ecyecyldni84im.R.iget(18768)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18769)==0&false)); i++) {{
                __CLR4_4_1ecyecyldni84im.R.inc(18770);c = pattern.charAt(i);

                __CLR4_4_1ecyecyldni84im.R.inc(18771);if ((((c == '\'')&&(__CLR4_4_1ecyecyldni84im.R.iget(18772)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18773)==0&false))) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18774);if ((((i + 1 < length && pattern.charAt(i + 1) == '\'')&&(__CLR4_4_1ecyecyldni84im.R.iget(18775)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18776)==0&false))) {{
                        // '' is treated as escaped '
                        __CLR4_4_1ecyecyldni84im.R.inc(18777);i++;
                        __CLR4_4_1ecyecyldni84im.R.inc(18778);buf.append(c);
                    } }else {{
                        __CLR4_4_1ecyecyldni84im.R.inc(18779);inLiteral = !inLiteral;
                    }
                }} }else {__CLR4_4_1ecyecyldni84im.R.inc(18780);if ((((!inLiteral &&
                         (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'))&&(__CLR4_4_1ecyecyldni84im.R.iget(18781)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18782)==0&false))) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18783);i--;
                    __CLR4_4_1ecyecyldni84im.R.inc(18784);break;
                } }else {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18785);buf.append(c);
                }
            }}}
        }}

        }__CLR4_4_1ecyecyldni84im.R.inc(18786);indexRef[0] = i;
        __CLR4_4_1ecyecyldni84im.R.inc(18787);return buf.toString();
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /**
     * <p>Gets an appropriate rule for the padding required.</p>
     *
     * @param field  the field to get a rule for
     * @param padding  the padding required
     * @return a new rule with the correct padding
     */
    protected NumberRule selectNumberRule(final int field, final int padding) {try{__CLR4_4_1ecyecyldni84im.R.inc(18788);
        boolean __CLB4_4_1_bool1=false;__CLR4_4_1ecyecyldni84im.R.inc(18789);switch (padding) {
        case 1:if (!__CLB4_4_1_bool1) {__CLR4_4_1ecyecyldni84im.R.inc(18790);__CLB4_4_1_bool1=true;}
            __CLR4_4_1ecyecyldni84im.R.inc(18791);return new UnpaddedNumberField(field);
        case 2:if (!__CLB4_4_1_bool1) {__CLR4_4_1ecyecyldni84im.R.inc(18792);__CLB4_4_1_bool1=true;}
            __CLR4_4_1ecyecyldni84im.R.inc(18793);return new TwoDigitNumberField(field);
        default:if (!__CLB4_4_1_bool1) {__CLR4_4_1ecyecyldni84im.R.inc(18794);__CLB4_4_1_bool1=true;}
            __CLR4_4_1ecyecyldni84im.R.inc(18795);return new PaddedNumberField(field, padding);
        }
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    // Format methods
    //-----------------------------------------------------------------------
    /**
     * <p>Formats a {@code Date}, {@code Calendar} or
     * {@code Long} (milliseconds) object.</p>
     *
     * @param obj  the object to format
     * @param toAppendTo  the buffer to append to
     * @param pos  the position - ignored
     * @return the buffer passed in
     */
    @Override
    public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_4_1ecyecyldni84im.R.inc(18796);
        __CLR4_4_1ecyecyldni84im.R.inc(18797);if ((((obj instanceof Date)&&(__CLR4_4_1ecyecyldni84im.R.iget(18798)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18799)==0&false))) {{
            __CLR4_4_1ecyecyldni84im.R.inc(18800);return format((Date) obj, toAppendTo);
        } }else {__CLR4_4_1ecyecyldni84im.R.inc(18801);if ((((obj instanceof Calendar)&&(__CLR4_4_1ecyecyldni84im.R.iget(18802)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18803)==0&false))) {{
            __CLR4_4_1ecyecyldni84im.R.inc(18804);return format((Calendar) obj, toAppendTo);
        } }else {__CLR4_4_1ecyecyldni84im.R.inc(18805);if ((((obj instanceof Long)&&(__CLR4_4_1ecyecyldni84im.R.iget(18806)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18807)==0&false))) {{
            __CLR4_4_1ecyecyldni84im.R.inc(18808);return format(((Long) obj).longValue(), toAppendTo);
        } }else {{
            __CLR4_4_1ecyecyldni84im.R.inc(18809);throw new IllegalArgumentException("Unknown class: " +
                ((((obj == null )&&(__CLR4_4_1ecyecyldni84im.R.iget(18810)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18811)==0&false))? "<null>" : obj.getClass().getName()));
        }
    }}}}finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(long)
     */
    @Override
    public String format(final long millis) {try{__CLR4_4_1ecyecyldni84im.R.inc(18812);
        __CLR4_4_1ecyecyldni84im.R.inc(18813);final Calendar c = newCalendar();  // hard code GregorianCalendar
        __CLR4_4_1ecyecyldni84im.R.inc(18814);c.setTimeInMillis(millis);
        __CLR4_4_1ecyecyldni84im.R.inc(18815);return applyRulesToString(c);
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    private String applyRulesToString(final Calendar c) {try{__CLR4_4_1ecyecyldni84im.R.inc(18816);
        __CLR4_4_1ecyecyldni84im.R.inc(18817);return applyRules(c, new StringBuffer(mMaxLengthEstimate)).toString();
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    private GregorianCalendar newCalendar() {try{__CLR4_4_1ecyecyldni84im.R.inc(18818);
        // hard code GregorianCalendar
        __CLR4_4_1ecyecyldni84im.R.inc(18819);return new GregorianCalendar(mTimeZone, mLocale);
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date)
     */
    @Override
    public String format(final Date date) {try{__CLR4_4_1ecyecyldni84im.R.inc(18820);
        __CLR4_4_1ecyecyldni84im.R.inc(18821);final Calendar c = newCalendar();  // hard code GregorianCalendar
        __CLR4_4_1ecyecyldni84im.R.inc(18822);c.setTime(date);
        __CLR4_4_1ecyecyldni84im.R.inc(18823);return applyRulesToString(c);
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar)
     */
    @Override
    public String format(final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(18824);
        __CLR4_4_1ecyecyldni84im.R.inc(18825);return format(calendar, new StringBuffer(mMaxLengthEstimate)).toString();
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(long, java.lang.StringBuffer)
     */
    @Override
    public StringBuffer format(final long millis, final StringBuffer buf) {try{__CLR4_4_1ecyecyldni84im.R.inc(18826);
        __CLR4_4_1ecyecyldni84im.R.inc(18827);return format(new Date(millis), buf);
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date, java.lang.StringBuffer)
     */
    @Override
    public StringBuffer format(final Date date, final StringBuffer buf) {try{__CLR4_4_1ecyecyldni84im.R.inc(18828);
        __CLR4_4_1ecyecyldni84im.R.inc(18829);final Calendar c = newCalendar();  // hard code GregorianCalendar
        __CLR4_4_1ecyecyldni84im.R.inc(18830);c.setTime(date);
        __CLR4_4_1ecyecyldni84im.R.inc(18831);return applyRules(c, buf);
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar, java.lang.StringBuffer)
     */
    @Override
    public StringBuffer format(final Calendar calendar, final StringBuffer buf) {try{__CLR4_4_1ecyecyldni84im.R.inc(18832);
        __CLR4_4_1ecyecyldni84im.R.inc(18833);return applyRules(calendar, buf);
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /**
     * <p>Performs the formatting by applying the rules to the
     * specified calendar.</p>
     *
     * @param calendar  the calendar to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     */
    protected StringBuffer applyRules(final Calendar calendar, final StringBuffer buf) {try{__CLR4_4_1ecyecyldni84im.R.inc(18834);
        __CLR4_4_1ecyecyldni84im.R.inc(18835);for (final Rule rule : mRules) {{
            __CLR4_4_1ecyecyldni84im.R.inc(18836);rule.appendTo(buf, calendar);
        }
        }__CLR4_4_1ecyecyldni84im.R.inc(18837);return buf;
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    // Accessors
    //-----------------------------------------------------------------------
    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#getPattern()
     */
    @Override
    public String getPattern() {try{__CLR4_4_1ecyecyldni84im.R.inc(18838);
        __CLR4_4_1ecyecyldni84im.R.inc(18839);return mPattern;
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#getTimeZone()
     */
    @Override
    public TimeZone getTimeZone() {try{__CLR4_4_1ecyecyldni84im.R.inc(18840);
        __CLR4_4_1ecyecyldni84im.R.inc(18841);return mTimeZone;
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#getLocale()
     */
    @Override
    public Locale getLocale() {try{__CLR4_4_1ecyecyldni84im.R.inc(18842);
        __CLR4_4_1ecyecyldni84im.R.inc(18843);return mLocale;
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /**
     * <p>Gets an estimate for the maximum string length that the
     * formatter will produce.</p>
     *
     * <p>The actual formatted length will almost always be less than or
     * equal to this amount.</p>
     *
     * @return the maximum formatted length
     */
    public int getMaxLengthEstimate() {try{__CLR4_4_1ecyecyldni84im.R.inc(18844);
        __CLR4_4_1ecyecyldni84im.R.inc(18845);return mMaxLengthEstimate;
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    // Basics
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two objects for equality.</p>
     *
     * @param obj  the object to compare to
     * @return {@code true} if equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_1ecyecyldni84im.R.inc(18846);
        __CLR4_4_1ecyecyldni84im.R.inc(18847);if ((((obj instanceof FastDatePrinter == false)&&(__CLR4_4_1ecyecyldni84im.R.iget(18848)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18849)==0&false))) {{
            __CLR4_4_1ecyecyldni84im.R.inc(18850);return false;
        }
        }__CLR4_4_1ecyecyldni84im.R.inc(18851);final FastDatePrinter other = (FastDatePrinter) obj;
        __CLR4_4_1ecyecyldni84im.R.inc(18852);return mPattern.equals(other.mPattern)
            && mTimeZone.equals(other.mTimeZone) 
            && mLocale.equals(other.mLocale);
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /**
     * <p>Returns a hashcode compatible with equals.</p>
     *
     * @return a hashcode compatible with equals
     */
    @Override
    public int hashCode() {try{__CLR4_4_1ecyecyldni84im.R.inc(18853);
        __CLR4_4_1ecyecyldni84im.R.inc(18854);return mPattern.hashCode() + 13 * (mTimeZone.hashCode() + 13 * mLocale.hashCode());
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /**
     * <p>Gets a debugging string version of this formatter.</p>
     *
     * @return a debugging string
     */
    @Override
    public String toString() {try{__CLR4_4_1ecyecyldni84im.R.inc(18855);
        __CLR4_4_1ecyecyldni84im.R.inc(18856);return "FastDatePrinter[" + mPattern + "," + mLocale + "," + mTimeZone.getID() + "]";
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    // Serializing
    //-----------------------------------------------------------------------
    /**
     * Create the object after serialization. This implementation reinitializes the
     * transient properties.
     *
     * @param in ObjectInputStream from which the object is being deserialized.
     * @throws IOException if there is an IO issue.
     * @throws ClassNotFoundException if a class cannot be found.
     */
    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {try{__CLR4_4_1ecyecyldni84im.R.inc(18857);
        __CLR4_4_1ecyecyldni84im.R.inc(18858);in.defaultReadObject();
        __CLR4_4_1ecyecyldni84im.R.inc(18859);init();
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    // Rules
    //-----------------------------------------------------------------------
    /**
     * <p>Inner class defining a rule.</p>
     */
    private interface Rule {
        /**
         * Returns the estimated lentgh of the result.
         *
         * @return the estimated length
         */
        int estimateLength();

        /**
         * Appends the value of the specified calendar to the output buffer based on the rule implementation.
         *
         * @param buffer the output buffer
         * @param calendar calendar to be appended
         */
        void appendTo(StringBuffer buffer, Calendar calendar);
    }

    /**
     * <p>Inner class defining a numeric rule.</p>
     */
    private interface NumberRule extends Rule {
        /**
         * Appends the specified value to the output buffer based on the rule implementation.
         *
         * @param buffer the output buffer
         * @param value the value to be appended
         */
        void appendTo(StringBuffer buffer, int value);
    }

    /**
     * <p>Inner class to output a constant single character.</p>
     */
    private static class CharacterLiteral implements Rule {
        private final char mValue;

        /**
         * Constructs a new instance of {@code CharacterLiteral}
         * to hold the specified value.
         *
         * @param value the character literal
         */
        CharacterLiteral(final char value) {try{__CLR4_4_1ecyecyldni84im.R.inc(18860);
            __CLR4_4_1ecyecyldni84im.R.inc(18861);mValue = value;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(18862);
            __CLR4_4_1ecyecyldni84im.R.inc(18863);return 1;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(18864);
            __CLR4_4_1ecyecyldni84im.R.inc(18865);buffer.append(mValue);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a constant string.</p>
     */
    private static class StringLiteral implements Rule {
        private final String mValue;

        /**
         * Constructs a new instance of {@code StringLiteral}
         * to hold the specified value.
         *
         * @param value the string literal
         */
        StringLiteral(final String value) {try{__CLR4_4_1ecyecyldni84im.R.inc(18866);
            __CLR4_4_1ecyecyldni84im.R.inc(18867);mValue = value;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(18868);
            __CLR4_4_1ecyecyldni84im.R.inc(18869);return mValue.length();
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(18870);
            __CLR4_4_1ecyecyldni84im.R.inc(18871);buffer.append(mValue);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output one of a set of values.</p>
     */
    private static class TextField implements Rule {
        private final int mField;
        private final String[] mValues;

        /**
         * Constructs an instance of {@code TextField}
         * with the specified field and values.
         *
         * @param field the field
         * @param values the field values
         */
        TextField(final int field, final String[] values) {try{__CLR4_4_1ecyecyldni84im.R.inc(18872);
            __CLR4_4_1ecyecyldni84im.R.inc(18873);mField = field;
            __CLR4_4_1ecyecyldni84im.R.inc(18874);mValues = values;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(18875);
            __CLR4_4_1ecyecyldni84im.R.inc(18876);int max = 0;
            __CLR4_4_1ecyecyldni84im.R.inc(18877);for (int i=mValues.length; (((--i >= 0)&&(__CLR4_4_1ecyecyldni84im.R.iget(18878)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18879)==0&false)); ) {{
                __CLR4_4_1ecyecyldni84im.R.inc(18880);final int len = mValues[i].length();
                __CLR4_4_1ecyecyldni84im.R.inc(18881);if ((((len > max)&&(__CLR4_4_1ecyecyldni84im.R.iget(18882)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18883)==0&false))) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18884);max = len;
                }
            }}
            }__CLR4_4_1ecyecyldni84im.R.inc(18885);return max;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(18886);
            __CLR4_4_1ecyecyldni84im.R.inc(18887);buffer.append(mValues[calendar.get(mField)]);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output an unpadded number.</p>
     */
    private static class UnpaddedNumberField implements NumberRule {
        private final int mField;

        /**
         * Constructs an instance of {@code UnpadedNumberField} with the specified field.
         *
         * @param field the field
         */
        UnpaddedNumberField(final int field) {try{__CLR4_4_1ecyecyldni84im.R.inc(18888);
            __CLR4_4_1ecyecyldni84im.R.inc(18889);mField = field;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(18890);
            __CLR4_4_1ecyecyldni84im.R.inc(18891);return 4;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(18892);
            __CLR4_4_1ecyecyldni84im.R.inc(18893);appendTo(buffer, calendar.get(mField));
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_4_1ecyecyldni84im.R.inc(18894);
            __CLR4_4_1ecyecyldni84im.R.inc(18895);if ((((value < 10)&&(__CLR4_4_1ecyecyldni84im.R.iget(18896)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18897)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(18898);buffer.append((char)(value + '0'));
            } }else {__CLR4_4_1ecyecyldni84im.R.inc(18899);if ((((value < 100)&&(__CLR4_4_1ecyecyldni84im.R.iget(18900)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18901)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(18902);buffer.append((char)(value / 10 + '0'));
                __CLR4_4_1ecyecyldni84im.R.inc(18903);buffer.append((char)(value % 10 + '0'));
            } }else {{
                __CLR4_4_1ecyecyldni84im.R.inc(18904);buffer.append(Integer.toString(value));
            }
        }}}finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output an unpadded month.</p>
     */
    private static class UnpaddedMonthField implements NumberRule {
        static final UnpaddedMonthField INSTANCE = new UnpaddedMonthField();

        /**
         * Constructs an instance of {@code UnpaddedMonthField}.
         *
         */
        UnpaddedMonthField() {
            super();__CLR4_4_1ecyecyldni84im.R.inc(18906);try{__CLR4_4_1ecyecyldni84im.R.inc(18905);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(18907);
            __CLR4_4_1ecyecyldni84im.R.inc(18908);return 2;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(18909);
            __CLR4_4_1ecyecyldni84im.R.inc(18910);appendTo(buffer, calendar.get(Calendar.MONTH) + 1);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_4_1ecyecyldni84im.R.inc(18911);
            __CLR4_4_1ecyecyldni84im.R.inc(18912);if ((((value < 10)&&(__CLR4_4_1ecyecyldni84im.R.iget(18913)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18914)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(18915);buffer.append((char)(value + '0'));
            } }else {{
                __CLR4_4_1ecyecyldni84im.R.inc(18916);buffer.append((char)(value / 10 + '0'));
                __CLR4_4_1ecyecyldni84im.R.inc(18917);buffer.append((char)(value % 10 + '0'));
            }
        }}finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a padded number.</p>
     */
    private static class PaddedNumberField implements NumberRule {
        private final int mField;
        private final int mSize;

        /**
         * Constructs an instance of {@code PaddedNumberField}.
         *
         * @param field the field
         * @param size size of the output field
         */
        PaddedNumberField(final int field, final int size) {try{__CLR4_4_1ecyecyldni84im.R.inc(18918);
            __CLR4_4_1ecyecyldni84im.R.inc(18919);if ((((size < 3)&&(__CLR4_4_1ecyecyldni84im.R.iget(18920)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18921)==0&false))) {{
                // Should use UnpaddedNumberField or TwoDigitNumberField.
                __CLR4_4_1ecyecyldni84im.R.inc(18922);throw new IllegalArgumentException();
            }
            }__CLR4_4_1ecyecyldni84im.R.inc(18923);mField = field;
            __CLR4_4_1ecyecyldni84im.R.inc(18924);mSize = size;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(18925);
            __CLR4_4_1ecyecyldni84im.R.inc(18926);return 4;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(18927);
            __CLR4_4_1ecyecyldni84im.R.inc(18928);appendTo(buffer, calendar.get(mField));
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_4_1ecyecyldni84im.R.inc(18929);
            __CLR4_4_1ecyecyldni84im.R.inc(18930);if ((((value < 100)&&(__CLR4_4_1ecyecyldni84im.R.iget(18931)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18932)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(18933);for (int i = mSize; (((--i >= 2)&&(__CLR4_4_1ecyecyldni84im.R.iget(18934)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18935)==0&false)); ) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18936);buffer.append('0');
                }
                }__CLR4_4_1ecyecyldni84im.R.inc(18937);buffer.append((char)(value / 10 + '0'));
                __CLR4_4_1ecyecyldni84im.R.inc(18938);buffer.append((char)(value % 10 + '0'));
            } }else {{
                __CLR4_4_1ecyecyldni84im.R.inc(18939);int digits;
                __CLR4_4_1ecyecyldni84im.R.inc(18940);if ((((value < 1000)&&(__CLR4_4_1ecyecyldni84im.R.iget(18941)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18942)==0&false))) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18943);digits = 3;
                } }else {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18944);Validate.isTrue(value > -1, "Negative values should not be possible", value);
                    __CLR4_4_1ecyecyldni84im.R.inc(18945);digits = Integer.toString(value).length();
                }
                }__CLR4_4_1ecyecyldni84im.R.inc(18946);for (int i = mSize; (((--i >= digits)&&(__CLR4_4_1ecyecyldni84im.R.iget(18947)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18948)==0&false)); ) {{
                    __CLR4_4_1ecyecyldni84im.R.inc(18949);buffer.append('0');
                }
                }__CLR4_4_1ecyecyldni84im.R.inc(18950);buffer.append(Integer.toString(value));
            }
        }}finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a two digit number.</p>
     */
    private static class TwoDigitNumberField implements NumberRule {
        private final int mField;

        /**
         * Constructs an instance of {@code TwoDigitNumberField} with the specified field.
         *
         * @param field the field
         */
        TwoDigitNumberField(final int field) {try{__CLR4_4_1ecyecyldni84im.R.inc(18951);
            __CLR4_4_1ecyecyldni84im.R.inc(18952);mField = field;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(18953);
            __CLR4_4_1ecyecyldni84im.R.inc(18954);return 2;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(18955);
            __CLR4_4_1ecyecyldni84im.R.inc(18956);appendTo(buffer, calendar.get(mField));
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_4_1ecyecyldni84im.R.inc(18957);
            __CLR4_4_1ecyecyldni84im.R.inc(18958);if ((((value < 100)&&(__CLR4_4_1ecyecyldni84im.R.iget(18959)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18960)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(18961);buffer.append((char)(value / 10 + '0'));
                __CLR4_4_1ecyecyldni84im.R.inc(18962);buffer.append((char)(value % 10 + '0'));
            } }else {{
                __CLR4_4_1ecyecyldni84im.R.inc(18963);buffer.append(Integer.toString(value));
            }
        }}finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a two digit year.</p>
     */
    private static class TwoDigitYearField implements NumberRule {
        static final TwoDigitYearField INSTANCE = new TwoDigitYearField();

        /**
         * Constructs an instance of {@code TwoDigitYearField}.
         */
        TwoDigitYearField() {
            super();__CLR4_4_1ecyecyldni84im.R.inc(18965);try{__CLR4_4_1ecyecyldni84im.R.inc(18964);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(18966);
            __CLR4_4_1ecyecyldni84im.R.inc(18967);return 2;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(18968);
            __CLR4_4_1ecyecyldni84im.R.inc(18969);appendTo(buffer, calendar.get(Calendar.YEAR) % 100);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_4_1ecyecyldni84im.R.inc(18970);
            __CLR4_4_1ecyecyldni84im.R.inc(18971);buffer.append((char)(value / 10 + '0'));
            __CLR4_4_1ecyecyldni84im.R.inc(18972);buffer.append((char)(value % 10 + '0'));
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a two digit month.</p>
     */
    private static class TwoDigitMonthField implements NumberRule {
        static final TwoDigitMonthField INSTANCE = new TwoDigitMonthField();

        /**
         * Constructs an instance of {@code TwoDigitMonthField}.
         */
        TwoDigitMonthField() {
            super();__CLR4_4_1ecyecyldni84im.R.inc(18974);try{__CLR4_4_1ecyecyldni84im.R.inc(18973);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(18975);
            __CLR4_4_1ecyecyldni84im.R.inc(18976);return 2;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(18977);
            __CLR4_4_1ecyecyldni84im.R.inc(18978);appendTo(buffer, calendar.get(Calendar.MONTH) + 1);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_4_1ecyecyldni84im.R.inc(18979);
            __CLR4_4_1ecyecyldni84im.R.inc(18980);buffer.append((char)(value / 10 + '0'));
            __CLR4_4_1ecyecyldni84im.R.inc(18981);buffer.append((char)(value % 10 + '0'));
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output the twelve hour field.</p>
     */
    private static class TwelveHourField implements NumberRule {
        private final NumberRule mRule;

        /**
         * Constructs an instance of {@code TwelveHourField} with the specified
         * {@code NumberRule}.
         *
         * @param rule the rule
         */
        TwelveHourField(final NumberRule rule) {try{__CLR4_4_1ecyecyldni84im.R.inc(18982);
            __CLR4_4_1ecyecyldni84im.R.inc(18983);mRule = rule;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(18984);
            __CLR4_4_1ecyecyldni84im.R.inc(18985);return mRule.estimateLength();
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(18986);
            __CLR4_4_1ecyecyldni84im.R.inc(18987);int value = calendar.get(Calendar.HOUR);
            __CLR4_4_1ecyecyldni84im.R.inc(18988);if ((((value == 0)&&(__CLR4_4_1ecyecyldni84im.R.iget(18989)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(18990)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(18991);value = calendar.getLeastMaximum(Calendar.HOUR) + 1;
            }
            }__CLR4_4_1ecyecyldni84im.R.inc(18992);mRule.appendTo(buffer, value);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_4_1ecyecyldni84im.R.inc(18993);
            __CLR4_4_1ecyecyldni84im.R.inc(18994);mRule.appendTo(buffer, value);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output the twenty four hour field.</p>
     */
    private static class TwentyFourHourField implements NumberRule {
        private final NumberRule mRule;

        /**
         * Constructs an instance of {@code TwentyFourHourField} with the specified
         * {@code NumberRule}.
         *
         * @param rule the rule
         */
        TwentyFourHourField(final NumberRule rule) {try{__CLR4_4_1ecyecyldni84im.R.inc(18995);
            __CLR4_4_1ecyecyldni84im.R.inc(18996);mRule = rule;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(18997);
            __CLR4_4_1ecyecyldni84im.R.inc(18998);return mRule.estimateLength();
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(18999);
            __CLR4_4_1ecyecyldni84im.R.inc(19000);int value = calendar.get(Calendar.HOUR_OF_DAY);
            __CLR4_4_1ecyecyldni84im.R.inc(19001);if ((((value == 0)&&(__CLR4_4_1ecyecyldni84im.R.iget(19002)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(19003)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(19004);value = calendar.getMaximum(Calendar.HOUR_OF_DAY) + 1;
            }
            }__CLR4_4_1ecyecyldni84im.R.inc(19005);mRule.appendTo(buffer, value);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_4_1ecyecyldni84im.R.inc(19006);
            __CLR4_4_1ecyecyldni84im.R.inc(19007);mRule.appendTo(buffer, value);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------

    private static ConcurrentMap<TimeZoneDisplayKey, String> cTimeZoneDisplayCache =
        new ConcurrentHashMap<TimeZoneDisplayKey, String>(7);
    /**
     * <p>Gets the time zone display name, using a cache for performance.</p>
     *
     * @param tz  the zone to query
     * @param daylight  true if daylight savings
     * @param style  the style to use {@code TimeZone.LONG} or {@code TimeZone.SHORT}
     * @param locale  the locale to use
     * @return the textual name of the time zone
     */
    static String getTimeZoneDisplay(final TimeZone tz, final boolean daylight, final int style, final Locale locale) {try{__CLR4_4_1ecyecyldni84im.R.inc(19008);
        __CLR4_4_1ecyecyldni84im.R.inc(19009);final TimeZoneDisplayKey key = new TimeZoneDisplayKey(tz, daylight, style, locale);
        __CLR4_4_1ecyecyldni84im.R.inc(19010);String value = cTimeZoneDisplayCache.get(key);
        __CLR4_4_1ecyecyldni84im.R.inc(19011);if ((((value == null)&&(__CLR4_4_1ecyecyldni84im.R.iget(19012)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(19013)==0&false))) {{
            // This is a very slow call, so cache the results.
            __CLR4_4_1ecyecyldni84im.R.inc(19014);value = tz.getDisplayName(daylight, style, locale);
            __CLR4_4_1ecyecyldni84im.R.inc(19015);final String prior = cTimeZoneDisplayCache.putIfAbsent(key, value);
            __CLR4_4_1ecyecyldni84im.R.inc(19016);if ((((prior != null)&&(__CLR4_4_1ecyecyldni84im.R.iget(19017)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(19018)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(19019);value= prior;
            }
        }}
        }__CLR4_4_1ecyecyldni84im.R.inc(19020);return value;
    }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

    /**
     * <p>Inner class to output a time zone name.</p>
     */
    private static class TimeZoneNameRule implements Rule {
        private final Locale mLocale;
        private final int mStyle;
        private final String mStandard;
        private final String mDaylight;

        /**
         * Constructs an instance of {@code TimeZoneNameRule} with the specified properties.
         *
         * @param timeZone the time zone
         * @param locale the locale
         * @param style the style
         */
        TimeZoneNameRule(final TimeZone timeZone, final Locale locale, final int style) {try{__CLR4_4_1ecyecyldni84im.R.inc(19021);
            __CLR4_4_1ecyecyldni84im.R.inc(19022);mLocale = locale;
            __CLR4_4_1ecyecyldni84im.R.inc(19023);mStyle = style;
            
            __CLR4_4_1ecyecyldni84im.R.inc(19024);mStandard = getTimeZoneDisplay(timeZone, false, style, locale);
            __CLR4_4_1ecyecyldni84im.R.inc(19025);mDaylight = getTimeZoneDisplay(timeZone, true, style, locale);
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(19026);
            // We have no access to the Calendar object that will be passed to
            // appendTo so base estimate on the TimeZone passed to the
            // constructor
            __CLR4_4_1ecyecyldni84im.R.inc(19027);return Math.max(mStandard.length(), mDaylight.length());
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(19028);
            __CLR4_4_1ecyecyldni84im.R.inc(19029);final TimeZone zone = calendar.getTimeZone();
            __CLR4_4_1ecyecyldni84im.R.inc(19030);if ((((zone.useDaylightTime()
                    && calendar.get(Calendar.DST_OFFSET) != 0)&&(__CLR4_4_1ecyecyldni84im.R.iget(19031)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(19032)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(19033);buffer.append(getTimeZoneDisplay(zone, true, mStyle, mLocale));
            } }else {{
                __CLR4_4_1ecyecyldni84im.R.inc(19034);buffer.append(getTimeZoneDisplay(zone, false, mStyle, mLocale));
            }
        }}finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a time zone as a number {@code +/-HHMM}
     * or {@code +/-HH:MM}.</p>
     */
    private static class TimeZoneNumberRule implements Rule {
        static final TimeZoneNumberRule INSTANCE_COLON = new TimeZoneNumberRule(true);
        static final TimeZoneNumberRule INSTANCE_NO_COLON = new TimeZoneNumberRule(false);

        final boolean mColon;

        /**
         * Constructs an instance of {@code TimeZoneNumberRule} with the specified properties.
         *
         * @param colon add colon between HH and MM in the output if {@code true}
         */
        TimeZoneNumberRule(final boolean colon) {try{__CLR4_4_1ecyecyldni84im.R.inc(19035);
            __CLR4_4_1ecyecyldni84im.R.inc(19036);mColon = colon;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_4_1ecyecyldni84im.R.inc(19037);
            __CLR4_4_1ecyecyldni84im.R.inc(19038);return 5;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_4_1ecyecyldni84im.R.inc(19039);
            __CLR4_4_1ecyecyldni84im.R.inc(19040);int offset = calendar.get(Calendar.ZONE_OFFSET) + calendar.get(Calendar.DST_OFFSET);

            __CLR4_4_1ecyecyldni84im.R.inc(19041);if ((((offset < 0)&&(__CLR4_4_1ecyecyldni84im.R.iget(19042)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(19043)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(19044);buffer.append('-');
                __CLR4_4_1ecyecyldni84im.R.inc(19045);offset = -offset;
            } }else {{
                __CLR4_4_1ecyecyldni84im.R.inc(19046);buffer.append('+');
            }

            }__CLR4_4_1ecyecyldni84im.R.inc(19047);final int hours = offset / (60 * 60 * 1000);
            __CLR4_4_1ecyecyldni84im.R.inc(19048);buffer.append((char)(hours / 10 + '0'));
            __CLR4_4_1ecyecyldni84im.R.inc(19049);buffer.append((char)(hours % 10 + '0'));

            __CLR4_4_1ecyecyldni84im.R.inc(19050);if ((((mColon)&&(__CLR4_4_1ecyecyldni84im.R.iget(19051)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(19052)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(19053);buffer.append(':');
            }

            }__CLR4_4_1ecyecyldni84im.R.inc(19054);final int minutes = offset / (60 * 1000) - 60 * hours;
            __CLR4_4_1ecyecyldni84im.R.inc(19055);buffer.append((char)(minutes / 10 + '0'));
            __CLR4_4_1ecyecyldni84im.R.inc(19056);buffer.append((char)(minutes % 10 + '0'));
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }

    // ----------------------------------------------------------------------
    /**
     * <p>Inner class that acts as a compound key for time zone names.</p>
     */
    private static class TimeZoneDisplayKey {
        private final TimeZone mTimeZone;
        private final int mStyle;
        private final Locale mLocale;

        /**
         * Constructs an instance of {@code TimeZoneDisplayKey} with the specified properties.
         *
         * @param timeZone the time zone
         * @param daylight adjust the style for daylight saving time if {@code true}
         * @param style the timezone style
         * @param locale the timezone locale
         */
        TimeZoneDisplayKey(final TimeZone timeZone,
                           final boolean daylight, int style, final Locale locale) {try{__CLR4_4_1ecyecyldni84im.R.inc(19057);
            __CLR4_4_1ecyecyldni84im.R.inc(19058);mTimeZone = timeZone;
            __CLR4_4_1ecyecyldni84im.R.inc(19059);if ((((daylight)&&(__CLR4_4_1ecyecyldni84im.R.iget(19060)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(19061)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(19062);style |= 0x80000000;
            }
            }__CLR4_4_1ecyecyldni84im.R.inc(19063);mStyle = style;
            __CLR4_4_1ecyecyldni84im.R.inc(19064);mLocale = locale;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {try{__CLR4_4_1ecyecyldni84im.R.inc(19065);
            __CLR4_4_1ecyecyldni84im.R.inc(19066);return (mStyle * 31 + mLocale.hashCode() ) * 31 + mTimeZone.hashCode();
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(final Object obj) {try{__CLR4_4_1ecyecyldni84im.R.inc(19067);
            __CLR4_4_1ecyecyldni84im.R.inc(19068);if ((((this == obj)&&(__CLR4_4_1ecyecyldni84im.R.iget(19069)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(19070)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(19071);return true;
            }
            }__CLR4_4_1ecyecyldni84im.R.inc(19072);if ((((obj instanceof TimeZoneDisplayKey)&&(__CLR4_4_1ecyecyldni84im.R.iget(19073)!=0|true))||(__CLR4_4_1ecyecyldni84im.R.iget(19074)==0&false))) {{
                __CLR4_4_1ecyecyldni84im.R.inc(19075);final TimeZoneDisplayKey other = (TimeZoneDisplayKey)obj;
                __CLR4_4_1ecyecyldni84im.R.inc(19076);return
                    mTimeZone.equals(other.mTimeZone) &&
                    mStyle == other.mStyle &&
                    mLocale.equals(other.mLocale);
            }
            }__CLR4_4_1ecyecyldni84im.R.inc(19077);return false;
        }finally{__CLR4_4_1ecyecyldni84im.R.flushNeeded();}}
    }
}
