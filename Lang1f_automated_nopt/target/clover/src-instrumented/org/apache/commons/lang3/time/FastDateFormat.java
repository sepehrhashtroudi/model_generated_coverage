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

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * <p>FastDateFormat is a fast and thread-safe version of
 * {@link java.text.SimpleDateFormat}.</p>
 *
 * <p>This class can be used as a direct replacement to
 * {@code SimpleDateFormat} in most formatting and parsing situations.
 * This class is especially useful in multi-threaded server environments.
 * {@code SimpleDateFormat} is not thread-safe in any JDK version,
 * nor will it be as Sun have closed the bug/RFE.
 * </p>
 *
 * <p>All patterns are compatible with
 * SimpleDateFormat (except time zones and some year patterns - see below).</p>
 * 
 * <p>Since 3.2, FastDateFormat supports parsing as well as printing.</p>
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
 * versions. FastDateFormat implements the behavior of Java 7.</p>
 *
 * @since 2.0
 * @version $Id$
 */
public class FastDateFormat extends Format implements DateParser, DatePrinter {public static class __CLR4_4_1e1xe1xldni84gk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,18293,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 2L;

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

    private static final FormatCache<FastDateFormat> cache= new FormatCache<FastDateFormat>() {
        @Override
        protected FastDateFormat createInstance(final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18213);
            __CLR4_4_1e1xe1xldni84gk.R.inc(18214);return new FastDateFormat(pattern, timeZone, locale);
        }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}
    };

    private final FastDatePrinter printer;
    private final FastDateParser parser;
    
    //-----------------------------------------------------------------------
    /**
     * <p>Gets a formatter instance using the default pattern in the
     * default locale.</p>
     *
     * @return a date/time formatter
     */
    public static FastDateFormat getInstance() {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18215);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18216);return cache.getInstance();
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets a formatter instance using the specified pattern in the
     * default locale.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @return a pattern based date/time formatter
     * @throws IllegalArgumentException if pattern is invalid
     */
    public static FastDateFormat getInstance(final String pattern) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18217);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18218);return cache.getInstance(pattern, null, null);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets a formatter instance using the specified pattern and
     * time zone.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date
     * @return a pattern based date/time formatter
     * @throws IllegalArgumentException if pattern is invalid
     */
    public static FastDateFormat getInstance(final String pattern, final TimeZone timeZone) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18219);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18220);return cache.getInstance(pattern, timeZone, null);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets a formatter instance using the specified pattern and
     * locale.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param locale  optional locale, overrides system locale
     * @return a pattern based date/time formatter
     * @throws IllegalArgumentException if pattern is invalid
     */
    public static FastDateFormat getInstance(final String pattern, final Locale locale) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18221);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18222);return cache.getInstance(pattern, null, locale);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets a formatter instance using the specified pattern, time zone
     * and locale.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date
     * @param locale  optional locale, overrides system locale
     * @return a pattern based date/time formatter
     * @throws IllegalArgumentException if pattern is invalid
     *  or {@code null}
     */
    public static FastDateFormat getInstance(final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18223);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18224);return cache.getInstance(pattern, timeZone, locale);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Gets a date formatter instance using the specified style in the
     * default time zone and locale.</p>
     *
     * @param style  date style: FULL, LONG, MEDIUM, or SHORT
     * @return a localized standard date formatter
     * @throws IllegalArgumentException if the Locale has no date
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getDateInstance(final int style) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18225);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18226);return cache.getDateInstance(style, null, null);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets a date formatter instance using the specified style and
     * locale in the default time zone.</p>
     *
     * @param style  date style: FULL, LONG, MEDIUM, or SHORT
     * @param locale  optional locale, overrides system locale
     * @return a localized standard date formatter
     * @throws IllegalArgumentException if the Locale has no date
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getDateInstance(final int style, final Locale locale) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18227);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18228);return cache.getDateInstance(style, null, locale);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets a date formatter instance using the specified style and
     * time zone in the default locale.</p>
     *
     * @param style  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date
     * @return a localized standard date formatter
     * @throws IllegalArgumentException if the Locale has no date
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getDateInstance(final int style, final TimeZone timeZone) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18229);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18230);return cache.getDateInstance(style, timeZone, null);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}
    
    /**
     * <p>Gets a date formatter instance using the specified style, time
     * zone and locale.</p>
     *
     * @param style  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date
     * @param locale  optional locale, overrides system locale
     * @return a localized standard date formatter
     * @throws IllegalArgumentException if the Locale has no date
     *  pattern defined
     */
    public static FastDateFormat getDateInstance(final int style, final TimeZone timeZone, final Locale locale) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18231);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18232);return cache.getDateInstance(style, timeZone, locale);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Gets a time formatter instance using the specified style in the
     * default time zone and locale.</p>
     *
     * @param style  time style: FULL, LONG, MEDIUM, or SHORT
     * @return a localized standard time formatter
     * @throws IllegalArgumentException if the Locale has no time
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getTimeInstance(final int style) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18233);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18234);return cache.getTimeInstance(style, null, null);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets a time formatter instance using the specified style and
     * locale in the default time zone.</p>
     *
     * @param style  time style: FULL, LONG, MEDIUM, or SHORT
     * @param locale  optional locale, overrides system locale
     * @return a localized standard time formatter
     * @throws IllegalArgumentException if the Locale has no time
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getTimeInstance(final int style, final Locale locale) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18235);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18236);return cache.getTimeInstance(style, null, locale);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets a time formatter instance using the specified style and
     * time zone in the default locale.</p>
     *
     * @param style  time style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted time
     * @return a localized standard time formatter
     * @throws IllegalArgumentException if the Locale has no time
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getTimeInstance(final int style, final TimeZone timeZone) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18237);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18238);return cache.getTimeInstance(style, timeZone, null);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets a time formatter instance using the specified style, time
     * zone and locale.</p>
     *
     * @param style  time style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted time
     * @param locale  optional locale, overrides system locale
     * @return a localized standard time formatter
     * @throws IllegalArgumentException if the Locale has no time
     *  pattern defined
     */
    public static FastDateFormat getTimeInstance(final int style, final TimeZone timeZone, final Locale locale) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18239);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18240);return cache.getTimeInstance(style, timeZone, locale);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Gets a date/time formatter instance using the specified style
     * in the default time zone and locale.</p>
     *
     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT
     * @return a localized standard date/time formatter
     * @throws IllegalArgumentException if the Locale has no date/time
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18241);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18242);return cache.getDateTimeInstance(dateStyle, timeStyle, null, null);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets a date/time formatter instance using the specified style and
     * locale in the default time zone.</p>
     *
     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT
     * @param locale  optional locale, overrides system locale
     * @return a localized standard date/time formatter
     * @throws IllegalArgumentException if the Locale has no date/time
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final Locale locale) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18243);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18244);return cache.getDateTimeInstance(dateStyle, timeStyle, null, locale);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets a date/time formatter instance using the specified style and
     * time zone in the default locale.</p>
     *
     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date
     * @return a localized standard date/time formatter
     * @throws IllegalArgumentException if the Locale has no date/time
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final TimeZone timeZone) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18245);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18246);return getDateTimeInstance(dateStyle, timeStyle, timeZone, null);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}
    /**
     * <p>Gets a date/time formatter instance using the specified style,
     * time zone and locale.</p>
     *
     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date
     * @param locale  optional locale, overrides system locale
     * @return a localized standard date/time formatter
     * @throws IllegalArgumentException if the Locale has no date/time
     *  pattern defined
     */
    public static FastDateFormat getDateTimeInstance(
            final int dateStyle, final int timeStyle, final TimeZone timeZone, final Locale locale) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18247);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18248);return cache.getDateTimeInstance(dateStyle, timeStyle, timeZone, locale);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    // Constructor
    //-----------------------------------------------------------------------
    /**
     * <p>Constructs a new FastDateFormat.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern
     * @param timeZone  non-null time zone to use
     * @param locale  non-null locale to use
     * @throws NullPointerException if pattern, timeZone, or locale is null.
     */
    protected FastDateFormat(final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18249);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18250);printer= new FastDatePrinter(pattern, timeZone, locale);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18251);parser= new FastDateParser(pattern, timeZone, locale);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

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
    public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18252);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18253);return printer.format(obj, toAppendTo, pos);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Formats a millisecond {@code long} value.</p>
     *
     * @param millis  the millisecond value to format
     * @return the formatted string
     * @since 2.1
     */
    @Override
    public String format(final long millis) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18254);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18255);return printer.format(millis);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Formats a {@code Date} object using a {@code GregorianCalendar}.</p>
     *
     * @param date  the date to format
     * @return the formatted string
     */
    @Override
    public String format(final Date date) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18256);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18257);return printer.format(date);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Formats a {@code Calendar} object.</p>
     *
     * @param calendar  the calendar to format
     * @return the formatted string
     */
    @Override
    public String format(final Calendar calendar) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18258);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18259);return printer.format(calendar);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Formats a milliseond {@code long} value into the
     * supplied {@code StringBuffer}.</p>
     *
     * @param millis  the millisecond value to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     * @since 2.1
     */
    @Override
    public StringBuffer format(final long millis, final StringBuffer buf) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18260);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18261);return printer.format(millis, buf);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Formats a {@code Date} object into the
     * supplied {@code StringBuffer} using a {@code GregorianCalendar}.</p>
     *
     * @param date  the date to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     */
    @Override
    public StringBuffer format(final Date date, final StringBuffer buf) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18262);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18263);return printer.format(date, buf);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Formats a {@code Calendar} object into the
     * supplied {@code StringBuffer}.</p>
     *
     * @param calendar  the calendar to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     */
    @Override
    public StringBuffer format(final Calendar calendar, final StringBuffer buf) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18264);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18265);return printer.format(calendar, buf);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    // Parsing
    //-----------------------------------------------------------------------

    
    /* (non-Javadoc)
     * @see DateParser#parse(java.lang.String)
     */
    @Override
    public Date parse(final String source) throws ParseException {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18266);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18267);return parser.parse(source);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see DateParser#parse(java.lang.String, java.text.ParsePosition)
     */
    @Override
    public Date parse(final String source, final ParsePosition pos) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18268);
            __CLR4_4_1e1xe1xldni84gk.R.inc(18269);return parser.parse(source, pos);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)
     */
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18270);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18271);return parser.parseObject(source, pos);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    // Accessors
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the pattern used by this formatter.</p>
     *
     * @return the pattern, {@link java.text.SimpleDateFormat} compatible
     */
    @Override
    public String getPattern() {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18272);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18273);return printer.getPattern();
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets the time zone used by this formatter.</p>
     *
     * <p>This zone is always used for {@code Date} formatting. </p>
     *
     * @return the time zone
     */
    @Override
    public TimeZone getTimeZone() {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18274);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18275);return printer.getTimeZone();
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets the locale used by this formatter.</p>
     *
     * @return the locale
     */
    @Override
    public Locale getLocale() {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18276);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18277);return printer.getLocale();
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets an estimate for the maximum string length that the
     * formatter will produce.</p>
     *
     * <p>The actual formatted length will almost always be less than or
     * equal to this amount.</p>
     *
     * @return the maximum formatted length
     */
    public int getMaxLengthEstimate() {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18278);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18279);return printer.getMaxLengthEstimate();
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    // Basics
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two objects for equality.</p>
     *
     * @param obj  the object to compare to
     * @return {@code true} if equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18280);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18281);if ((((obj instanceof FastDateFormat == false)&&(__CLR4_4_1e1xe1xldni84gk.R.iget(18282)!=0|true))||(__CLR4_4_1e1xe1xldni84gk.R.iget(18283)==0&false))) {{
            __CLR4_4_1e1xe1xldni84gk.R.inc(18284);return false;
        }
        }__CLR4_4_1e1xe1xldni84gk.R.inc(18285);final FastDateFormat other = (FastDateFormat) obj;
        // no need to check parser, as it has same invariants as printer
        __CLR4_4_1e1xe1xldni84gk.R.inc(18286);return printer.equals(other.printer);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Returns a hashcode compatible with equals.</p>
     *
     * @return a hashcode compatible with equals
     */
    @Override
    public int hashCode() {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18287);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18288);return printer.hashCode();
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}

    /**
     * <p>Gets a debugging string version of this formatter.</p>
     *
     * @return a debugging string
     */
    @Override
    public String toString() {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18289);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18290);return "FastDateFormat[" + printer.getPattern() + "," + printer.getLocale() + "," + printer.getTimeZone().getID() + "]";
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}


    /**
     * <p>Performs the formatting by applying the rules to the
     * specified calendar.</p>
     *
     * @param calendar  the calendar to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     */
    protected StringBuffer applyRules(final Calendar calendar, final StringBuffer buf) {try{__CLR4_4_1e1xe1xldni84gk.R.inc(18291);
        __CLR4_4_1e1xe1xldni84gk.R.inc(18292);return printer.applyRules(calendar, buf);
    }finally{__CLR4_4_1e1xe1xldni84gk.R.flushNeeded();}}


}
