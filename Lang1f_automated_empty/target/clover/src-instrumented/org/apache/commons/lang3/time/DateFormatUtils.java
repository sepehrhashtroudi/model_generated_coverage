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

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * <p>Date and time formatting utilities and constants.</p>
 *
 * <p>Formatting is performed using the thread-safe
 * {@link org.apache.commons.lang3.time.FastDateFormat} class.</p>
 *
 * <p>Note that the JDK has a bug wherein calling Calendar.get(int) will 
 * override any previously called Calendar.clear() calls. See LANG-755.</p>
 *
 * @since 2.0
 * @version $Id$
 */
public class DateFormatUtils {public static class __CLR4_4_1dbadbaldniggev{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,17290,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The UTC time zone (often referred to as GMT).
     * This is private as it is mutable.
     */
    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("GMT");
    /**
     * ISO8601 formatter for date-time without time zone.
     * The format used is <tt>yyyy-MM-dd'T'HH:mm:ss</tt>.
     */
    public static final FastDateFormat ISO_DATETIME_FORMAT
            = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss");

    /**
     * ISO8601 formatter for date-time with time zone.
     * The format used is <tt>yyyy-MM-dd'T'HH:mm:ssZZ</tt>.
     */
    public static final FastDateFormat ISO_DATETIME_TIME_ZONE_FORMAT
            = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ssZZ");

    /**
     * ISO8601 formatter for date without time zone.
     * The format used is <tt>yyyy-MM-dd</tt>.
     */
    public static final FastDateFormat ISO_DATE_FORMAT
            = FastDateFormat.getInstance("yyyy-MM-dd");

    /**
     * ISO8601-like formatter for date with time zone.
     * The format used is <tt>yyyy-MM-ddZZ</tt>.
     * This pattern does not comply with the formal ISO8601 specification
     * as the standard does not allow a time zone  without a time.
     */
    public static final FastDateFormat ISO_DATE_TIME_ZONE_FORMAT
            = FastDateFormat.getInstance("yyyy-MM-ddZZ");

    /**
     * ISO8601 formatter for time without time zone.
     * The format used is <tt>'T'HH:mm:ss</tt>.
     */
    public static final FastDateFormat ISO_TIME_FORMAT
            = FastDateFormat.getInstance("'T'HH:mm:ss");

    /**
     * ISO8601 formatter for time with time zone.
     * The format used is <tt>'T'HH:mm:ssZZ</tt>.
     */
    public static final FastDateFormat ISO_TIME_TIME_ZONE_FORMAT
            = FastDateFormat.getInstance("'T'HH:mm:ssZZ");

    /**
     * ISO8601-like formatter for time without time zone.
     * The format used is <tt>HH:mm:ss</tt>.
     * This pattern does not comply with the formal ISO8601 specification
     * as the standard requires the 'T' prefix for times.
     */
    public static final FastDateFormat ISO_TIME_NO_T_FORMAT
            = FastDateFormat.getInstance("HH:mm:ss");

    /**
     * ISO8601-like formatter for time with time zone.
     * The format used is <tt>HH:mm:ssZZ</tt>.
     * This pattern does not comply with the formal ISO8601 specification
     * as the standard requires the 'T' prefix for times.
     */
    public static final FastDateFormat ISO_TIME_NO_T_TIME_ZONE_FORMAT
            = FastDateFormat.getInstance("HH:mm:ssZZ");

    /**
     * SMTP (and probably other) date headers.
     * The format used is <tt>EEE, dd MMM yyyy HH:mm:ss Z</tt> in US locale.
     */
    public static final FastDateFormat SMTP_DATETIME_FORMAT
            = FastDateFormat.getInstance("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);

    //-----------------------------------------------------------------------
    /**
     * <p>DateFormatUtils instances should NOT be constructed in standard programming.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public DateFormatUtils() {
        super();__CLR4_4_1dbadbaldniggev.R.inc(17255);try{__CLR4_4_1dbadbaldniggev.R.inc(17254);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a date/time into a specific pattern using the UTC time zone.</p>
     * 
     * @param millis  the date to format expressed in milliseconds
     * @param pattern  the pattern to use to format the date, not null
     * @return the formatted date
     */
    public static String formatUTC(final long millis, final String pattern) {try{__CLR4_4_1dbadbaldniggev.R.inc(17256);
        __CLR4_4_1dbadbaldniggev.R.inc(17257);return format(new Date(millis), pattern, UTC_TIME_ZONE, null);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a date/time into a specific pattern using the UTC time zone.</p>
     * 
     * @param date  the date to format, not null
     * @param pattern  the pattern to use to format the date, not null
     * @return the formatted date
     */
    public static String formatUTC(final Date date, final String pattern) {try{__CLR4_4_1dbadbaldniggev.R.inc(17258);
        __CLR4_4_1dbadbaldniggev.R.inc(17259);return format(date, pattern, UTC_TIME_ZONE, null);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}
    
    /**
     * <p>Formats a date/time into a specific pattern using the UTC time zone.</p>
     * 
     * @param millis  the date to format expressed in milliseconds
     * @param pattern  the pattern to use to format the date, not null
     * @param locale  the locale to use, may be <code>null</code>
     * @return the formatted date
     */
    public static String formatUTC(final long millis, final String pattern, final Locale locale) {try{__CLR4_4_1dbadbaldniggev.R.inc(17260);
        __CLR4_4_1dbadbaldniggev.R.inc(17261);return format(new Date(millis), pattern, UTC_TIME_ZONE, locale);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a date/time into a specific pattern using the UTC time zone.</p>
     * 
     * @param date  the date to format, not null
     * @param pattern  the pattern to use to format the date, not null
     * @param locale  the locale to use, may be <code>null</code>
     * @return the formatted date
     */
    public static String formatUTC(final Date date, final String pattern, final Locale locale) {try{__CLR4_4_1dbadbaldniggev.R.inc(17262);
        __CLR4_4_1dbadbaldniggev.R.inc(17263);return format(date, pattern, UTC_TIME_ZONE, locale);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}
    
    /**
     * <p>Formats a date/time into a specific pattern.</p>
     * 
     * @param millis  the date to format expressed in milliseconds
     * @param pattern  the pattern to use to format the date, not null
     * @return the formatted date
     */
    public static String format(final long millis, final String pattern) {try{__CLR4_4_1dbadbaldniggev.R.inc(17264);
        __CLR4_4_1dbadbaldniggev.R.inc(17265);return format(new Date(millis), pattern, null, null);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a date/time into a specific pattern.</p>
     * 
     * @param date  the date to format, not null
     * @param pattern  the pattern to use to format the date, not null
     * @return the formatted date
     */
    public static String format(final Date date, final String pattern) {try{__CLR4_4_1dbadbaldniggev.R.inc(17266);
        __CLR4_4_1dbadbaldniggev.R.inc(17267);return format(date, pattern, null, null);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a calendar into a specific pattern.</p>
     * 
     * @param calendar  the calendar to format, not null
     * @param pattern  the pattern to use to format the calendar, not null
     * @return the formatted calendar
     * @see FastDateFormat#format(Calendar)
     * @since 2.4
     */
    public static String format(final Calendar calendar, final String pattern) {try{__CLR4_4_1dbadbaldniggev.R.inc(17268);
        __CLR4_4_1dbadbaldniggev.R.inc(17269);return format(calendar, pattern, null, null);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}
    
    /**
     * <p>Formats a date/time into a specific pattern in a time zone.</p>
     * 
     * @param millis  the time expressed in milliseconds
     * @param pattern  the pattern to use to format the date, not null
     * @param timeZone  the time zone  to use, may be <code>null</code>
     * @return the formatted date
     */
    public static String format(final long millis, final String pattern, final TimeZone timeZone) {try{__CLR4_4_1dbadbaldniggev.R.inc(17270);
        __CLR4_4_1dbadbaldniggev.R.inc(17271);return format(new Date(millis), pattern, timeZone, null);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a date/time into a specific pattern in a time zone.</p>
     * 
     * @param date  the date to format, not null
     * @param pattern  the pattern to use to format the date, not null
     * @param timeZone  the time zone  to use, may be <code>null</code>
     * @return the formatted date
     */
    public static String format(final Date date, final String pattern, final TimeZone timeZone) {try{__CLR4_4_1dbadbaldniggev.R.inc(17272);
        __CLR4_4_1dbadbaldniggev.R.inc(17273);return format(date, pattern, timeZone, null);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a calendar into a specific pattern in a time zone.</p>
     * 
     * @param calendar  the calendar to format, not null
     * @param pattern  the pattern to use to format the calendar, not null
     * @param timeZone  the time zone  to use, may be <code>null</code>
     * @return the formatted calendar
     * @see FastDateFormat#format(Calendar)
     * @since 2.4
     */
    public static String format(final Calendar calendar, final String pattern, final TimeZone timeZone) {try{__CLR4_4_1dbadbaldniggev.R.inc(17274);
        __CLR4_4_1dbadbaldniggev.R.inc(17275);return format(calendar, pattern, timeZone, null);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a date/time into a specific pattern in a locale.</p>
     * 
     * @param millis  the date to format expressed in milliseconds
     * @param pattern  the pattern to use to format the date, not null
     * @param locale  the locale to use, may be <code>null</code>
     * @return the formatted date
     */
    public static String format(final long millis, final String pattern, final Locale locale) {try{__CLR4_4_1dbadbaldniggev.R.inc(17276);
        __CLR4_4_1dbadbaldniggev.R.inc(17277);return format(new Date(millis), pattern, null, locale);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a date/time into a specific pattern in a locale.</p>
     * 
     * @param date  the date to format, not null
     * @param pattern  the pattern to use to format the date, not null
     * @param locale  the locale to use, may be <code>null</code>
     * @return the formatted date
     */
    public static String format(final Date date, final String pattern, final Locale locale) {try{__CLR4_4_1dbadbaldniggev.R.inc(17278);
        __CLR4_4_1dbadbaldniggev.R.inc(17279);return format(date, pattern, null, locale);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a calendar into a specific pattern in a locale.</p>
     * 
     * @param calendar  the calendar to format, not null
     * @param pattern  the pattern to use to format the calendar, not null
     * @param locale  the locale to use, may be <code>null</code>
     * @return the formatted calendar
     * @see FastDateFormat#format(Calendar)
     * @since 2.4
     */
    public static String format(final Calendar calendar, final String pattern, final Locale locale) {try{__CLR4_4_1dbadbaldniggev.R.inc(17280);
        __CLR4_4_1dbadbaldniggev.R.inc(17281);return format(calendar, pattern, null, locale);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a date/time into a specific pattern in a time zone  and locale.</p>
     * 
     * @param millis  the date to format expressed in milliseconds
     * @param pattern  the pattern to use to format the date, not null
     * @param timeZone  the time zone  to use, may be <code>null</code>
     * @param locale  the locale to use, may be <code>null</code>
     * @return the formatted date
     */
    public static String format(final long millis, final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_4_1dbadbaldniggev.R.inc(17282);
        __CLR4_4_1dbadbaldniggev.R.inc(17283);return format(new Date(millis), pattern, timeZone, locale);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a date/time into a specific pattern in a time zone  and locale.</p>
     * 
     * @param date  the date to format, not null
     * @param pattern  the pattern to use to format the date, not null, not null
     * @param timeZone  the time zone  to use, may be <code>null</code>
     * @param locale  the locale to use, may be <code>null</code>
     * @return the formatted date
     */
    public static String format(final Date date, final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_4_1dbadbaldniggev.R.inc(17284);
        __CLR4_4_1dbadbaldniggev.R.inc(17285);final FastDateFormat df = FastDateFormat.getInstance(pattern, timeZone, locale);
        __CLR4_4_1dbadbaldniggev.R.inc(17286);return df.format(date);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

    /**
     * <p>Formats a calendar into a specific pattern in a time zone  and locale.</p>
     * 
     * @param calendar  the calendar to format, not null
     * @param pattern  the pattern to use to format the calendar, not null
     * @param timeZone  the time zone  to use, may be <code>null</code>
     * @param locale  the locale to use, may be <code>null</code>
     * @return the formatted calendar
     * @see FastDateFormat#format(Calendar)
     * @since 2.4
     */
    public static String format(final Calendar calendar, final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_4_1dbadbaldniggev.R.inc(17287);
        __CLR4_4_1dbadbaldniggev.R.inc(17288);final FastDateFormat df = FastDateFormat.getInstance(pattern, timeZone, locale);
        __CLR4_4_1dbadbaldniggev.R.inc(17289);return df.format(calendar);
    }finally{__CLR4_4_1dbadbaldniggev.R.flushNeeded();}}

}
