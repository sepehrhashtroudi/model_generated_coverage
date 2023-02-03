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

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/**
 * <p>A suite of utilities surrounding the use of the
 * {@link java.util.Calendar} and {@link java.util.Date} object.</p>
 * 
 * <p>DateUtils contains a lot of common methods considering manipulations
 * of Dates or Calendars. Some methods require some extra explanation.
 * The truncate, ceiling and round methods could be considered the Math.floor(),
 * Math.ceil() or Math.round versions for dates
 * This way date-fields will be ignored in bottom-up order.
 * As a complement to these methods we've introduced some fragment-methods.
 * With these methods the Date-fields will be ignored in top-down order.
 * Since a date without a year is not a valid date, you have to decide in what
 * kind of date-field you want your result, for instance milliseconds or days.
 * </p>
 *
 * @since 2.0
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DateUtils {public static class __CLR4_4_1dcadcaldnigggb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,17823,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Number of milliseconds in a standard second.
     * @since 2.1
     */
    public static final long MILLIS_PER_SECOND = 1000;
    /**
     * Number of milliseconds in a standard minute.
     * @since 2.1
     */
    public static final long MILLIS_PER_MINUTE = 60 * MILLIS_PER_SECOND;
    /**
     * Number of milliseconds in a standard hour.
     * @since 2.1
     */
    public static final long MILLIS_PER_HOUR = 60 * MILLIS_PER_MINUTE;
    /**
     * Number of milliseconds in a standard day.
     * @since 2.1
     */
    public static final long MILLIS_PER_DAY = 24 * MILLIS_PER_HOUR;

    /**
     * This is half a month, so this represents whether a date is in the top
     * or bottom half of the month.
     */
    public static final int SEMI_MONTH = 1001;

    private static final int[][] fields = {
            {Calendar.MILLISECOND},
            {Calendar.SECOND},
            {Calendar.MINUTE},
            {Calendar.HOUR_OF_DAY, Calendar.HOUR},
            {Calendar.DATE, Calendar.DAY_OF_MONTH, Calendar.AM_PM 
                /* Calendar.DAY_OF_YEAR, Calendar.DAY_OF_WEEK, Calendar.DAY_OF_WEEK_IN_MONTH */
            },
            {Calendar.MONTH, DateUtils.SEMI_MONTH},
            {Calendar.YEAR},
            {Calendar.ERA}};

    /**
     * A week range, starting on Sunday.
     */
    public static final int RANGE_WEEK_SUNDAY = 1;
    /**
     * A week range, starting on Monday.
     */
    public static final int RANGE_WEEK_MONDAY = 2;
    /**
     * A week range, starting on the day focused.
     */
    public static final int RANGE_WEEK_RELATIVE = 3;
    /**
     * A week range, centered around the day focused.
     */
    public static final int RANGE_WEEK_CENTER = 4;
    /**
     * A month range, the week starting on Sunday.
     */
    public static final int RANGE_MONTH_SUNDAY = 5;
    /**
     * A month range, the week starting on Monday.
     */
    public static final int RANGE_MONTH_MONDAY = 6;

    /**
     * Constant marker for truncating.
     * @since 3.0
     */
    private static final int MODIFY_TRUNCATE = 0;
    /**
     * Constant marker for rounding.
     * @since 3.0
     */
    private static final int MODIFY_ROUND = 1;
    /**
     * Constant marker for ceiling.
     * @since 3.0
     */
    private static final int MODIFY_CEILING = 2;

    /**
     * <p>{@code DateUtils} instances should NOT be constructed in
     * standard programming. Instead, the static methods on the class should
     * be used, such as {@code DateUtils.parseDate(str);}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public DateUtils() {
        super();__CLR4_4_1dcadcaldnigggb.R.inc(17291);try{__CLR4_4_1dcadcaldnigggb.R.inc(17290);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks if two date objects are on the same day ignoring time.</p>
     *
     * <p>28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.
     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.
     * </p>
     * 
     * @param date1  the first date, not altered, not null
     * @param date2  the second date, not altered, not null
     * @return true if they represent the same day
     * @throws IllegalArgumentException if either date is <code>null</code>
     * @since 2.1
     */
    public static boolean isSameDay(final Date date1, final Date date2) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17292);
        __CLR4_4_1dcadcaldnigggb.R.inc(17293);if ((((date1 == null || date2 == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17294)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17295)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17296);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17297);final Calendar cal1 = Calendar.getInstance();
        __CLR4_4_1dcadcaldnigggb.R.inc(17298);cal1.setTime(date1);
        __CLR4_4_1dcadcaldnigggb.R.inc(17299);final Calendar cal2 = Calendar.getInstance();
        __CLR4_4_1dcadcaldnigggb.R.inc(17300);cal2.setTime(date2);
        __CLR4_4_1dcadcaldnigggb.R.inc(17301);return isSameDay(cal1, cal2);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * <p>Checks if two calendar objects are on the same day ignoring time.</p>
     *
     * <p>28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.
     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.
     * </p>
     * 
     * @param cal1  the first calendar, not altered, not null
     * @param cal2  the second calendar, not altered, not null
     * @return true if they represent the same day
     * @throws IllegalArgumentException if either calendar is <code>null</code>
     * @since 2.1
     */
    public static boolean isSameDay(final Calendar cal1, final Calendar cal2) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17302);
        __CLR4_4_1dcadcaldnigggb.R.inc(17303);if ((((cal1 == null || cal2 == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17304)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17305)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17306);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17307);return (cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) &&
                cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR));
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks if two date objects represent the same instant in time.</p>
     *
     * <p>This method compares the long millisecond time of the two objects.</p>
     * 
     * @param date1  the first date, not altered, not null
     * @param date2  the second date, not altered, not null
     * @return true if they represent the same millisecond instant
     * @throws IllegalArgumentException if either date is <code>null</code>
     * @since 2.1
     */
    public static boolean isSameInstant(final Date date1, final Date date2) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17308);
        __CLR4_4_1dcadcaldnigggb.R.inc(17309);if ((((date1 == null || date2 == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17310)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17311)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17312);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17313);return date1.getTime() == date2.getTime();
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * <p>Checks if two calendar objects represent the same instant in time.</p>
     *
     * <p>This method compares the long millisecond time of the two objects.</p>
     * 
     * @param cal1  the first calendar, not altered, not null
     * @param cal2  the second calendar, not altered, not null
     * @return true if they represent the same millisecond instant
     * @throws IllegalArgumentException if either date is <code>null</code>
     * @since 2.1
     */
    public static boolean isSameInstant(final Calendar cal1, final Calendar cal2) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17314);
        __CLR4_4_1dcadcaldnigggb.R.inc(17315);if ((((cal1 == null || cal2 == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17316)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17317)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17318);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17319);return cal1.getTime().getTime() == cal2.getTime().getTime();
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks if two calendar objects represent the same local time.</p>
     *
     * <p>This method compares the values of the fields of the two objects.
     * In addition, both calendars must be the same of the same type.</p>
     * 
     * @param cal1  the first calendar, not altered, not null
     * @param cal2  the second calendar, not altered, not null
     * @return true if they represent the same millisecond instant
     * @throws IllegalArgumentException if either date is <code>null</code>
     * @since 2.1
     */
    public static boolean isSameLocalTime(final Calendar cal1, final Calendar cal2) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17320);
        __CLR4_4_1dcadcaldnigggb.R.inc(17321);if ((((cal1 == null || cal2 == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17322)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17323)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17324);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17325);return (cal1.get(Calendar.MILLISECOND) == cal2.get(Calendar.MILLISECOND) &&
                cal1.get(Calendar.SECOND) == cal2.get(Calendar.SECOND) &&
                cal1.get(Calendar.MINUTE) == cal2.get(Calendar.MINUTE) &&
                cal1.get(Calendar.HOUR_OF_DAY) == cal2.get(Calendar.HOUR_OF_DAY) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR) &&
                cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) &&
                cal1.getClass() == cal2.getClass());
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Parses a string representing a date by trying a variety of different parsers.</p>
     * 
     * <p>The parse will try each parse pattern in turn.
     * A parse is only deemed successful if it parses the whole of the input string.
     * If no parse patterns match, a ParseException is thrown.</p>
     * The parser will be lenient toward the parsed date.
     * 
     * @param str  the date to parse, not null
     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null
     * @return the parsed date
     * @throws IllegalArgumentException if the date string or pattern array is null
     * @throws ParseException if none of the date patterns were suitable (or there were none)
     */
    public static Date parseDate(final String str, final String... parsePatterns) throws ParseException {try{__CLR4_4_1dcadcaldnigggb.R.inc(17326);
        __CLR4_4_1dcadcaldnigggb.R.inc(17327);return parseDate(str, null, parsePatterns);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * <p>Parses a string representing a date by trying a variety of different parsers,
     * using the default date format symbols for the given locale.</p>
     * 
     * <p>The parse will try each parse pattern in turn.
     * A parse is only deemed successful if it parses the whole of the input string.
     * If no parse patterns match, a ParseException is thrown.</p>
     * The parser will be lenient toward the parsed date.
     * 
     * @param str  the date to parse, not null
     * @param locale the locale whose date format symbols should be used. If <code>null</code>,
     * the system locale is used (as per {@link #parseDate(String, String...)}).
     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null
     * @return the parsed date
     * @throws IllegalArgumentException if the date string or pattern array is null
     * @throws ParseException if none of the date patterns were suitable (or there were none)
     * @since 3.2
     */
    public static Date parseDate(final String str, final Locale locale, final String... parsePatterns) throws ParseException {try{__CLR4_4_1dcadcaldnigggb.R.inc(17328);
        __CLR4_4_1dcadcaldnigggb.R.inc(17329);return parseDateWithLeniency(str, locale, parsePatterns, true);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}    

  //-----------------------------------------------------------------------
    /**
     * <p>Parses a string representing a date by trying a variety of different parsers.</p>
     * 
     * <p>The parse will try each parse pattern in turn.
     * A parse is only deemed successful if it parses the whole of the input string.
     * If no parse patterns match, a ParseException is thrown.</p>
     * The parser parses strictly - it does not allow for dates such as "February 942, 1996". 
     * 
     * @param str  the date to parse, not null
     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null
     * @return the parsed date
     * @throws IllegalArgumentException if the date string or pattern array is null
     * @throws ParseException if none of the date patterns were suitable
     * @since 2.5
     */
    public static Date parseDateStrictly(final String str, final String... parsePatterns) throws ParseException {try{__CLR4_4_1dcadcaldnigggb.R.inc(17330);
        __CLR4_4_1dcadcaldnigggb.R.inc(17331);return parseDateStrictly(str, null, parsePatterns);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * <p>Parses a string representing a date by trying a variety of different parsers,
     * using the default date format symbols for the given locale..</p>
     * 
     * <p>The parse will try each parse pattern in turn.
     * A parse is only deemed successful if it parses the whole of the input string.
     * If no parse patterns match, a ParseException is thrown.</p>
     * The parser parses strictly - it does not allow for dates such as "February 942, 1996". 
     * 
     * @param str  the date to parse, not null
     * @param locale the locale whose date format symbols should be used. If <code>null</code>,
     * the system locale is used (as per {@link #parseDateStrictly(String, String...)}).
     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null
     * @return the parsed date
     * @throws IllegalArgumentException if the date string or pattern array is null
     * @throws ParseException if none of the date patterns were suitable
     * @since 3.2
     */
    public static Date parseDateStrictly(final String str, final Locale locale, final String... parsePatterns) throws ParseException {try{__CLR4_4_1dcadcaldnigggb.R.inc(17332);
        __CLR4_4_1dcadcaldnigggb.R.inc(17333);return parseDateWithLeniency(str, null, parsePatterns, false);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}    

    /**
     * <p>Parses a string representing a date by trying a variety of different parsers.</p>
     * 
     * <p>The parse will try each parse pattern in turn.
     * A parse is only deemed successful if it parses the whole of the input string.
     * If no parse patterns match, a ParseException is thrown.</p>
     * 
     * @param str  the date to parse, not null
     * @param locale the locale to use when interpretting the pattern, can be null in which
     * case the default system locale is used
     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null
     * @param lenient Specify whether or not date/time parsing is to be lenient.
     * @return the parsed date
     * @throws IllegalArgumentException if the date string or pattern array is null
     * @throws ParseException if none of the date patterns were suitable
     * @see java.util.Calender#isLenient()
     */
    private static Date parseDateWithLeniency(
            final String str, final Locale locale, final String[] parsePatterns, final boolean lenient) throws ParseException {try{__CLR4_4_1dcadcaldnigggb.R.inc(17334);
        __CLR4_4_1dcadcaldnigggb.R.inc(17335);if ((((str == null || parsePatterns == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17336)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17337)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17338);throw new IllegalArgumentException("Date and Patterns must not be null");
        }
        
        }__CLR4_4_1dcadcaldnigggb.R.inc(17339);SimpleDateFormat parser;
        __CLR4_4_1dcadcaldnigggb.R.inc(17340);if ((((locale == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17341)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17342)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17343);parser = new SimpleDateFormat();
        } }else {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17344);parser = new SimpleDateFormat("", locale);
        }
        
        }__CLR4_4_1dcadcaldnigggb.R.inc(17345);parser.setLenient(lenient);
        __CLR4_4_1dcadcaldnigggb.R.inc(17346);final ParsePosition pos = new ParsePosition(0);
        __CLR4_4_1dcadcaldnigggb.R.inc(17347);for (final String parsePattern : parsePatterns) {{

            __CLR4_4_1dcadcaldnigggb.R.inc(17348);String pattern = parsePattern;

            // LANG-530 - need to make sure 'ZZ' output doesn't get passed to SimpleDateFormat
            __CLR4_4_1dcadcaldnigggb.R.inc(17349);if ((((parsePattern.endsWith("ZZ"))&&(__CLR4_4_1dcadcaldnigggb.R.iget(17350)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17351)==0&false))) {{
                __CLR4_4_1dcadcaldnigggb.R.inc(17352);pattern = pattern.substring(0, pattern.length() - 1);
            }
            
            }__CLR4_4_1dcadcaldnigggb.R.inc(17353);parser.applyPattern(pattern);
            __CLR4_4_1dcadcaldnigggb.R.inc(17354);pos.setIndex(0);

            __CLR4_4_1dcadcaldnigggb.R.inc(17355);String str2 = str;
            // LANG-530 - need to make sure 'ZZ' output doesn't hit SimpleDateFormat as it will ParseException
            __CLR4_4_1dcadcaldnigggb.R.inc(17356);if ((((parsePattern.endsWith("ZZ"))&&(__CLR4_4_1dcadcaldnigggb.R.iget(17357)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17358)==0&false))) {{
                __CLR4_4_1dcadcaldnigggb.R.inc(17359);str2 = str.replaceAll("([-+][0-9][0-9]):([0-9][0-9])$", "$1$2"); 
            }

            }__CLR4_4_1dcadcaldnigggb.R.inc(17360);final Date date = parser.parse(str2, pos);
            __CLR4_4_1dcadcaldnigggb.R.inc(17361);if ((((date != null && pos.getIndex() == str2.length())&&(__CLR4_4_1dcadcaldnigggb.R.iget(17362)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17363)==0&false))) {{
                __CLR4_4_1dcadcaldnigggb.R.inc(17364);return date;
            }
        }}
        }__CLR4_4_1dcadcaldnigggb.R.inc(17365);throw new ParseException("Unable to parse the date: " + str, -1);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of years to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addYears(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17366);
        __CLR4_4_1dcadcaldnigggb.R.inc(17367);return add(date, Calendar.YEAR, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of months to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addMonths(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17368);
        __CLR4_4_1dcadcaldnigggb.R.inc(17369);return add(date, Calendar.MONTH, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of weeks to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addWeeks(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17370);
        __CLR4_4_1dcadcaldnigggb.R.inc(17371);return add(date, Calendar.WEEK_OF_YEAR, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of days to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addDays(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17372);
        __CLR4_4_1dcadcaldnigggb.R.inc(17373);return add(date, Calendar.DAY_OF_MONTH, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of hours to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addHours(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17374);
        __CLR4_4_1dcadcaldnigggb.R.inc(17375);return add(date, Calendar.HOUR_OF_DAY, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of minutes to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addMinutes(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17376);
        __CLR4_4_1dcadcaldnigggb.R.inc(17377);return add(date, Calendar.MINUTE, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of seconds to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addSeconds(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17378);
        __CLR4_4_1dcadcaldnigggb.R.inc(17379);return add(date, Calendar.SECOND, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of milliseconds to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addMilliseconds(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17380);
        __CLR4_4_1dcadcaldnigggb.R.inc(17381);return add(date, Calendar.MILLISECOND, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param calendarField  the calendar field to add to
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    private static Date add(final Date date, final int calendarField, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17382);
        __CLR4_4_1dcadcaldnigggb.R.inc(17383);if ((((date == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17384)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17385)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17386);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17387);final Calendar c = Calendar.getInstance();
        __CLR4_4_1dcadcaldnigggb.R.inc(17388);c.setTime(date);
        __CLR4_4_1dcadcaldnigggb.R.inc(17389);c.add(calendarField, amount);
        __CLR4_4_1dcadcaldnigggb.R.inc(17390);return c.getTime();
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Sets the years field to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setYears(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17391);
        __CLR4_4_1dcadcaldnigggb.R.inc(17392);return set(date, Calendar.YEAR, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the months field to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setMonths(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17393);
        __CLR4_4_1dcadcaldnigggb.R.inc(17394);return set(date, Calendar.MONTH, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the day of month field to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setDays(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17395);
        __CLR4_4_1dcadcaldnigggb.R.inc(17396);return set(date, Calendar.DAY_OF_MONTH, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the hours field to a date returning a new object.  Hours range 
     * from  0-23.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setHours(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17397);
        __CLR4_4_1dcadcaldnigggb.R.inc(17398);return set(date, Calendar.HOUR_OF_DAY, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the minute field to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setMinutes(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17399);
        __CLR4_4_1dcadcaldnigggb.R.inc(17400);return set(date, Calendar.MINUTE, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Sets the seconds field to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setSeconds(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17401);
        __CLR4_4_1dcadcaldnigggb.R.inc(17402);return set(date, Calendar.SECOND, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the miliseconds field to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setMilliseconds(final Date date, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17403);
        __CLR4_4_1dcadcaldnigggb.R.inc(17404);return set(date, Calendar.MILLISECOND, amount);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}} 
    
    //-----------------------------------------------------------------------
    /**
     * Sets the specified field to a date returning a new object.  
     * This does not use a lenient calendar.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param calendarField  the {@code Calendar} field to set the amount to
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    private static Date set(final Date date, final int calendarField, final int amount) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17405);
        __CLR4_4_1dcadcaldnigggb.R.inc(17406);if ((((date == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17407)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17408)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17409);throw new IllegalArgumentException("The date must not be null");
        }
        // getInstance() returns a new object, so this method is thread safe.
        }__CLR4_4_1dcadcaldnigggb.R.inc(17410);final Calendar c = Calendar.getInstance();
        __CLR4_4_1dcadcaldnigggb.R.inc(17411);c.setLenient(false);
        __CLR4_4_1dcadcaldnigggb.R.inc(17412);c.setTime(date);
        __CLR4_4_1dcadcaldnigggb.R.inc(17413);c.set(calendarField, amount);
        __CLR4_4_1dcadcaldnigggb.R.inc(17414);return c.getTime();
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}   

    //-----------------------------------------------------------------------
    /**
     * Converts a {@code Date} into a {@code Calendar}. 
     * 
     * @param date the date to convert to a Calendar
     * @return the created Calendar
     * @throws NullPointerException if null is passed in
     * @since 3.0
     */
    public static Calendar toCalendar(final Date date) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17415);
        __CLR4_4_1dcadcaldnigggb.R.inc(17416);final Calendar c = Calendar.getInstance();
        __CLR4_4_1dcadcaldnigggb.R.inc(17417);c.setTime(date);
        __CLR4_4_1dcadcaldnigggb.R.inc(17418);return c;
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * <p>Rounds a date, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if this was passed with HOUR, it would return
     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it
     * would return 1 April 2002 0:00:00.000.</p>
     * 
     * <p>For a date in a timezone that handles the change to daylight
     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.
     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a 
     * date that crosses this time would produce the following values:
     * <ul>
     * <li>March 30, 2003 01:10 rounds to March 30, 2003 01:00</li>
     * <li>March 30, 2003 01:40 rounds to March 30, 2003 03:00</li>
     * <li>March 30, 2003 02:10 rounds to March 30, 2003 03:00</li>
     * <li>March 30, 2003 02:40 rounds to March 30, 2003 04:00</li>
     * </ul>
     * </p>
     * 
     * @param date  the date to work with, not null
     * @param field  the field from {@code Calendar} or {@code SEMI_MONTH}
     * @return the different rounded date, not null
     * @throws ArithmeticException if the year is over 280 million
     */
    public static Date round(final Date date, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17419);
        __CLR4_4_1dcadcaldnigggb.R.inc(17420);if ((((date == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17421)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17422)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17423);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17424);final Calendar gval = Calendar.getInstance();
        __CLR4_4_1dcadcaldnigggb.R.inc(17425);gval.setTime(date);
        __CLR4_4_1dcadcaldnigggb.R.inc(17426);modify(gval, field, MODIFY_ROUND);
        __CLR4_4_1dcadcaldnigggb.R.inc(17427);return gval.getTime();
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * <p>Rounds a date, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if this was passed with HOUR, it would return
     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it
     * would return 1 April 2002 0:00:00.000.</p>
     * 
     * <p>For a date in a timezone that handles the change to daylight
     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.
     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a 
     * date that crosses this time would produce the following values:
     * <ul>
     * <li>March 30, 2003 01:10 rounds to March 30, 2003 01:00</li>
     * <li>March 30, 2003 01:40 rounds to March 30, 2003 03:00</li>
     * <li>March 30, 2003 02:10 rounds to March 30, 2003 03:00</li>
     * <li>March 30, 2003 02:40 rounds to March 30, 2003 04:00</li>
     * </ul>
     * </p>
     * 
     * @param date  the date to work with, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different rounded date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ArithmeticException if the year is over 280 million
     */
    public static Calendar round(final Calendar date, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17428);
        __CLR4_4_1dcadcaldnigggb.R.inc(17429);if ((((date == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17430)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17431)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17432);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17433);final Calendar rounded = (Calendar) date.clone();
        __CLR4_4_1dcadcaldnigggb.R.inc(17434);modify(rounded, field, MODIFY_ROUND);
        __CLR4_4_1dcadcaldnigggb.R.inc(17435);return rounded;
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * <p>Rounds a date, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if this was passed with HOUR, it would return
     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it
     * would return 1 April 2002 0:00:00.000.</p>
     * 
     * <p>For a date in a timezone that handles the change to daylight
     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.
     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a 
     * date that crosses this time would produce the following values:
     * <ul>
     * <li>March 30, 2003 01:10 rounds to March 30, 2003 01:00</li>
     * <li>March 30, 2003 01:40 rounds to March 30, 2003 03:00</li>
     * <li>March 30, 2003 02:10 rounds to March 30, 2003 03:00</li>
     * <li>March 30, 2003 02:40 rounds to March 30, 2003 04:00</li>
     * </ul>
     * </p>
     * 
     * @param date  the date to work with, either {@code Date} or {@code Calendar}, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different rounded date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}
     * @throws ArithmeticException if the year is over 280 million
     */
    public static Date round(final Object date, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17436);
        __CLR4_4_1dcadcaldnigggb.R.inc(17437);if ((((date == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17438)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17439)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17440);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17441);if ((((date instanceof Date)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17442)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17443)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17444);return round((Date) date, field);
        } }else {__CLR4_4_1dcadcaldnigggb.R.inc(17445);if ((((date instanceof Calendar)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17446)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17447)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17448);return round((Calendar) date, field).getTime();
        } }else {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17449);throw new ClassCastException("Could not round " + date);
        }
    }}}finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Truncates a date, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar
     * 2002 13:00:00.000.  If this was passed with MONTH, it would
     * return 1 Mar 2002 0:00:00.000.</p>
     * 
     * @param date  the date to work with, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different truncated date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ArithmeticException if the year is over 280 million
     */
    public static Date truncate(final Date date, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17450);
        __CLR4_4_1dcadcaldnigggb.R.inc(17451);if ((((date == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17452)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17453)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17454);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17455);final Calendar gval = Calendar.getInstance();
        __CLR4_4_1dcadcaldnigggb.R.inc(17456);gval.setTime(date);
        __CLR4_4_1dcadcaldnigggb.R.inc(17457);modify(gval, field, MODIFY_TRUNCATE);
        __CLR4_4_1dcadcaldnigggb.R.inc(17458);return gval.getTime();
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * <p>Truncates a date, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar
     * 2002 13:00:00.000.  If this was passed with MONTH, it would
     * return 1 Mar 2002 0:00:00.000.</p>
     * 
     * @param date  the date to work with, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different truncated date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ArithmeticException if the year is over 280 million
     */
    public static Calendar truncate(final Calendar date, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17459);
        __CLR4_4_1dcadcaldnigggb.R.inc(17460);if ((((date == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17461)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17462)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17463);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17464);final Calendar truncated = (Calendar) date.clone();
        __CLR4_4_1dcadcaldnigggb.R.inc(17465);modify(truncated, field, MODIFY_TRUNCATE);
        __CLR4_4_1dcadcaldnigggb.R.inc(17466);return truncated;
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * <p>Truncates a date, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar
     * 2002 13:00:00.000.  If this was passed with MONTH, it would
     * return 1 Mar 2002 0:00:00.000.</p>
     * 
     * @param date  the date to work with, either {@code Date} or {@code Calendar}, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different truncated date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}
     * @throws ArithmeticException if the year is over 280 million
     */
    public static Date truncate(final Object date, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17467);
        __CLR4_4_1dcadcaldnigggb.R.inc(17468);if ((((date == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17469)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17470)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17471);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17472);if ((((date instanceof Date)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17473)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17474)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17475);return truncate((Date) date, field);
        } }else {__CLR4_4_1dcadcaldnigggb.R.inc(17476);if ((((date instanceof Calendar)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17477)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17478)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17479);return truncate((Calendar) date, field).getTime();
        } }else {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17480);throw new ClassCastException("Could not truncate " + date);
        }
    }}}finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
  //-----------------------------------------------------------------------
    /**
     * <p>Gets a date ceiling, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar
     * 2002 14:00:00.000.  If this was passed with MONTH, it would
     * return 1 Apr 2002 0:00:00.000.</p>
     * 
     * @param date  the date to work with, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different ceil date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ArithmeticException if the year is over 280 million
     * @since 2.5
     */
    public static Date ceiling(final Date date, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17481);
        __CLR4_4_1dcadcaldnigggb.R.inc(17482);if ((((date == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17483)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17484)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17485);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17486);final Calendar gval = Calendar.getInstance();
        __CLR4_4_1dcadcaldnigggb.R.inc(17487);gval.setTime(date);
        __CLR4_4_1dcadcaldnigggb.R.inc(17488);modify(gval, field, MODIFY_CEILING);
        __CLR4_4_1dcadcaldnigggb.R.inc(17489);return gval.getTime();
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * <p>Gets a date ceiling, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar
     * 2002 14:00:00.000.  If this was passed with MONTH, it would
     * return 1 Apr 2002 0:00:00.000.</p>
     * 
     * @param date  the date to work with, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different ceil date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ArithmeticException if the year is over 280 million
     * @since 2.5
     */
    public static Calendar ceiling(final Calendar date, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17490);
        __CLR4_4_1dcadcaldnigggb.R.inc(17491);if ((((date == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17492)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17493)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17494);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17495);final Calendar ceiled = (Calendar) date.clone();
        __CLR4_4_1dcadcaldnigggb.R.inc(17496);modify(ceiled, field, MODIFY_CEILING);
        __CLR4_4_1dcadcaldnigggb.R.inc(17497);return ceiled;
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * <p>Gets a date ceiling, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar
     * 2002 14:00:00.000.  If this was passed with MONTH, it would
     * return 1 Apr 2002 0:00:00.000.</p>
     * 
     * @param date  the date to work with, either {@code Date} or {@code Calendar}, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different ceil date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}
     * @throws ArithmeticException if the year is over 280 million
     * @since 2.5
     */
    public static Date ceiling(final Object date, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17498);
        __CLR4_4_1dcadcaldnigggb.R.inc(17499);if ((((date == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17500)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17501)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17502);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17503);if ((((date instanceof Date)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17504)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17505)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17506);return ceiling((Date) date, field);
        } }else {__CLR4_4_1dcadcaldnigggb.R.inc(17507);if ((((date instanceof Calendar)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17508)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17509)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17510);return ceiling((Calendar) date, field).getTime();
        } }else {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17511);throw new ClassCastException("Could not find ceiling of for type: " + date.getClass());
        }
    }}}finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Internal calculation method.</p>
     * 
     * @param val  the calendar, not null
     * @param field  the field constant
     * @param modType  type to truncate, round or ceiling
     * @throws ArithmeticException if the year is over 280 million
     */
    private static void modify(final Calendar val, final int field, final int modType) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17512);
        __CLR4_4_1dcadcaldnigggb.R.inc(17513);if ((((val.get(Calendar.YEAR) > 280000000)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17514)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17515)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17516);throw new ArithmeticException("Calendar value too large for accurate calculations");
        }
        
        }__CLR4_4_1dcadcaldnigggb.R.inc(17517);if ((((field == Calendar.MILLISECOND)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17518)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17519)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17520);return;
        }

        // ----------------- Fix for LANG-59 ---------------------- START ---------------
        // see http://issues.apache.org/jira/browse/LANG-59
        //
        // Manually truncate milliseconds, seconds and minutes, rather than using
        // Calendar methods.

        }__CLR4_4_1dcadcaldnigggb.R.inc(17521);final Date date = val.getTime();
        __CLR4_4_1dcadcaldnigggb.R.inc(17522);long time = date.getTime();
        __CLR4_4_1dcadcaldnigggb.R.inc(17523);boolean done = false;

        // truncate milliseconds
        __CLR4_4_1dcadcaldnigggb.R.inc(17524);final int millisecs = val.get(Calendar.MILLISECOND);
        __CLR4_4_1dcadcaldnigggb.R.inc(17525);if ((((MODIFY_TRUNCATE == modType || millisecs < 500)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17526)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17527)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17528);time = time - millisecs;
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17529);if ((((field == Calendar.SECOND)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17530)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17531)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17532);done = true;
        }

        // truncate seconds
        }__CLR4_4_1dcadcaldnigggb.R.inc(17533);final int seconds = val.get(Calendar.SECOND);
        __CLR4_4_1dcadcaldnigggb.R.inc(17534);if ((((!done && (MODIFY_TRUNCATE == modType || seconds < 30))&&(__CLR4_4_1dcadcaldnigggb.R.iget(17535)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17536)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17537);time = time - (seconds * 1000L);
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17538);if ((((field == Calendar.MINUTE)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17539)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17540)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17541);done = true;
        }

        // truncate minutes
        }__CLR4_4_1dcadcaldnigggb.R.inc(17542);final int minutes = val.get(Calendar.MINUTE);
        __CLR4_4_1dcadcaldnigggb.R.inc(17543);if ((((!done && (MODIFY_TRUNCATE == modType || minutes < 30))&&(__CLR4_4_1dcadcaldnigggb.R.iget(17544)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17545)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17546);time = time - (minutes * 60000L);
        }

        // reset time
        }__CLR4_4_1dcadcaldnigggb.R.inc(17547);if ((((date.getTime() != time)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17548)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17549)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17550);date.setTime(time);
            __CLR4_4_1dcadcaldnigggb.R.inc(17551);val.setTime(date);
        }
        // ----------------- Fix for LANG-59 ----------------------- END ----------------

        }__CLR4_4_1dcadcaldnigggb.R.inc(17552);boolean roundUp = false;
        __CLR4_4_1dcadcaldnigggb.R.inc(17553);for (final int[] aField : fields) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17554);for (final int element : aField) {{
                __CLR4_4_1dcadcaldnigggb.R.inc(17555);if ((((element == field)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17556)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17557)==0&false))) {{
                    //This is our field... we stop looping
                    __CLR4_4_1dcadcaldnigggb.R.inc(17558);if ((((modType == MODIFY_CEILING || (modType == MODIFY_ROUND && roundUp))&&(__CLR4_4_1dcadcaldnigggb.R.iget(17559)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17560)==0&false))) {{
                        __CLR4_4_1dcadcaldnigggb.R.inc(17561);if ((((field == DateUtils.SEMI_MONTH)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17562)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17563)==0&false))) {{
                            //This is a special case that's hard to generalize
                            //If the date is 1, we round up to 16, otherwise
                            //  we subtract 15 days and add 1 month
                            __CLR4_4_1dcadcaldnigggb.R.inc(17564);if ((((val.get(Calendar.DATE) == 1)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17565)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17566)==0&false))) {{
                                __CLR4_4_1dcadcaldnigggb.R.inc(17567);val.add(Calendar.DATE, 15);
                            } }else {{
                                __CLR4_4_1dcadcaldnigggb.R.inc(17568);val.add(Calendar.DATE, -15);
                                __CLR4_4_1dcadcaldnigggb.R.inc(17569);val.add(Calendar.MONTH, 1);
                            }
// ----------------- Fix for LANG-440 ---------------------- START ---------------
                        }} }else {__CLR4_4_1dcadcaldnigggb.R.inc(17570);if ((((field == Calendar.AM_PM)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17571)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17572)==0&false))) {{
                            // This is a special case
                            // If the time is 0, we round up to 12, otherwise
                            //  we subtract 12 hours and add 1 day
                            __CLR4_4_1dcadcaldnigggb.R.inc(17573);if ((((val.get(Calendar.HOUR_OF_DAY) == 0)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17574)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17575)==0&false))) {{
                                __CLR4_4_1dcadcaldnigggb.R.inc(17576);val.add(Calendar.HOUR_OF_DAY, 12);
                            } }else {{
                                __CLR4_4_1dcadcaldnigggb.R.inc(17577);val.add(Calendar.HOUR_OF_DAY, -12);
                                __CLR4_4_1dcadcaldnigggb.R.inc(17578);val.add(Calendar.DATE, 1);
                            }
// ----------------- Fix for LANG-440 ---------------------- END ---------------
                        }} }else {{
                            //We need at add one to this field since the
                            //  last number causes us to round up
                            __CLR4_4_1dcadcaldnigggb.R.inc(17579);val.add(aField[0], 1);
                        }
                    }}}
                    }__CLR4_4_1dcadcaldnigggb.R.inc(17580);return;
                }
            }}
            //We have various fields that are not easy roundings
            }__CLR4_4_1dcadcaldnigggb.R.inc(17581);int offset = 0;
            __CLR4_4_1dcadcaldnigggb.R.inc(17582);boolean offsetSet = false;
            //These are special types of fields that require different rounding rules
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1dcadcaldnigggb.R.inc(17583);switch (field) {
                case DateUtils.SEMI_MONTH:if (!__CLB4_4_1_bool0) {__CLR4_4_1dcadcaldnigggb.R.inc(17584);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1dcadcaldnigggb.R.inc(17585);if ((((aField[0] == Calendar.DATE)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17586)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17587)==0&false))) {{
                        //If we're going to drop the DATE field's value,
                        //  we want to do this our own way.
                        //We need to subtrace 1 since the date has a minimum of 1
                        __CLR4_4_1dcadcaldnigggb.R.inc(17588);offset = val.get(Calendar.DATE) - 1;
                        //If we're above 15 days adjustment, that means we're in the
                        //  bottom half of the month and should stay accordingly.
                        __CLR4_4_1dcadcaldnigggb.R.inc(17589);if ((((offset >= 15)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17590)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17591)==0&false))) {{
                            __CLR4_4_1dcadcaldnigggb.R.inc(17592);offset -= 15;
                        }
                        //Record whether we're in the top or bottom half of that range
                        }__CLR4_4_1dcadcaldnigggb.R.inc(17593);roundUp = offset > 7;
                        __CLR4_4_1dcadcaldnigggb.R.inc(17594);offsetSet = true;
                    }
                    }__CLR4_4_1dcadcaldnigggb.R.inc(17595);break;
                case Calendar.AM_PM:if (!__CLB4_4_1_bool0) {__CLR4_4_1dcadcaldnigggb.R.inc(17596);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1dcadcaldnigggb.R.inc(17597);if ((((aField[0] == Calendar.HOUR_OF_DAY)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17598)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17599)==0&false))) {{
                        //If we're going to drop the HOUR field's value,
                        //  we want to do this our own way.
                        __CLR4_4_1dcadcaldnigggb.R.inc(17600);offset = val.get(Calendar.HOUR_OF_DAY);
                        __CLR4_4_1dcadcaldnigggb.R.inc(17601);if ((((offset >= 12)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17602)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17603)==0&false))) {{
                            __CLR4_4_1dcadcaldnigggb.R.inc(17604);offset -= 12;
                        }
                        }__CLR4_4_1dcadcaldnigggb.R.inc(17605);roundUp = offset >= 6;
                        __CLR4_4_1dcadcaldnigggb.R.inc(17606);offsetSet = true;
                    }
                    }__CLR4_4_1dcadcaldnigggb.R.inc(17607);break;
            }
            __CLR4_4_1dcadcaldnigggb.R.inc(17608);if ((((!offsetSet)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17609)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17610)==0&false))) {{
                __CLR4_4_1dcadcaldnigggb.R.inc(17611);final int min = val.getActualMinimum(aField[0]);
                __CLR4_4_1dcadcaldnigggb.R.inc(17612);final int max = val.getActualMaximum(aField[0]);
                //Calculate the offset from the minimum allowed value
                __CLR4_4_1dcadcaldnigggb.R.inc(17613);offset = val.get(aField[0]) - min;
                //Set roundUp if this is more than half way between the minimum and maximum
                __CLR4_4_1dcadcaldnigggb.R.inc(17614);roundUp = offset > ((max - min) / 2);
            }
            //We need to remove this field
            }__CLR4_4_1dcadcaldnigggb.R.inc(17615);if ((((offset != 0)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17616)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17617)==0&false))) {{
                __CLR4_4_1dcadcaldnigggb.R.inc(17618);val.set(aField[0], val.get(aField[0]) - offset);
            }
        }}
        }__CLR4_4_1dcadcaldnigggb.R.inc(17619);throw new IllegalArgumentException("The field " + field + " is not supported");

    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Constructs an <code>Iterator</code> over each day in a date
     * range defined by a focus date and range style.</p>
     *
     * <p>For instance, passing Thursday, July 4, 2002 and a
     * <code>RANGE_MONTH_SUNDAY</code> will return an <code>Iterator</code>
     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,
     * 2002, returning a Calendar instance for each intermediate day.</p>
     *
     * <p>This method provides an iterator that returns Calendar objects.
     * The days are progressed using {@link Calendar#add(int, int)}.</p>
     *
     * @param focus  the date to work with, not null
     * @param rangeStyle  the style constant to use. Must be one of
     * {@link DateUtils#RANGE_MONTH_SUNDAY}, 
     * {@link DateUtils#RANGE_MONTH_MONDAY},
     * {@link DateUtils#RANGE_WEEK_SUNDAY},
     * {@link DateUtils#RANGE_WEEK_MONDAY},
     * {@link DateUtils#RANGE_WEEK_RELATIVE},
     * {@link DateUtils#RANGE_WEEK_CENTER}
     * @return the date iterator, not null, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws IllegalArgumentException if the rangeStyle is invalid
     */
    public static Iterator<Calendar> iterator(final Date focus, final int rangeStyle) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17620);
        __CLR4_4_1dcadcaldnigggb.R.inc(17621);if ((((focus == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17622)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17623)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17624);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17625);final Calendar gval = Calendar.getInstance();
        __CLR4_4_1dcadcaldnigggb.R.inc(17626);gval.setTime(focus);
        __CLR4_4_1dcadcaldnigggb.R.inc(17627);return iterator(gval, rangeStyle);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * <p>Constructs an <code>Iterator</code> over each day in a date
     * range defined by a focus date and range style.</p>
     *
     * <p>For instance, passing Thursday, July 4, 2002 and a
     * <code>RANGE_MONTH_SUNDAY</code> will return an <code>Iterator</code>
     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,
     * 2002, returning a Calendar instance for each intermediate day.</p>
     *
     * <p>This method provides an iterator that returns Calendar objects.
     * The days are progressed using {@link Calendar#add(int, int)}.</p>
     *
     * @param focus  the date to work with, not null
     * @param rangeStyle  the style constant to use. Must be one of
     * {@link DateUtils#RANGE_MONTH_SUNDAY}, 
     * {@link DateUtils#RANGE_MONTH_MONDAY},
     * {@link DateUtils#RANGE_WEEK_SUNDAY},
     * {@link DateUtils#RANGE_WEEK_MONDAY},
     * {@link DateUtils#RANGE_WEEK_RELATIVE},
     * {@link DateUtils#RANGE_WEEK_CENTER}
     * @return the date iterator, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws IllegalArgumentException if the rangeStyle is invalid
     */
    public static Iterator<Calendar> iterator(final Calendar focus, final int rangeStyle) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17628);
        __CLR4_4_1dcadcaldnigggb.R.inc(17629);if ((((focus == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17630)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17631)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17632);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17633);Calendar start = null;
        __CLR4_4_1dcadcaldnigggb.R.inc(17634);Calendar end = null;
        __CLR4_4_1dcadcaldnigggb.R.inc(17635);int startCutoff = Calendar.SUNDAY;
        __CLR4_4_1dcadcaldnigggb.R.inc(17636);int endCutoff = Calendar.SATURDAY;
        boolean __CLB4_4_1_bool1=false;__CLR4_4_1dcadcaldnigggb.R.inc(17637);switch (rangeStyle) {
            case RANGE_MONTH_SUNDAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1dcadcaldnigggb.R.inc(17638);__CLB4_4_1_bool1=true;}
            case RANGE_MONTH_MONDAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1dcadcaldnigggb.R.inc(17639);__CLB4_4_1_bool1=true;}
                //Set start to the first of the month
                __CLR4_4_1dcadcaldnigggb.R.inc(17640);start = truncate(focus, Calendar.MONTH);
                //Set end to the last of the month
                __CLR4_4_1dcadcaldnigggb.R.inc(17641);end = (Calendar) start.clone();
                __CLR4_4_1dcadcaldnigggb.R.inc(17642);end.add(Calendar.MONTH, 1);
                __CLR4_4_1dcadcaldnigggb.R.inc(17643);end.add(Calendar.DATE, -1);
                //Loop start back to the previous sunday or monday
                __CLR4_4_1dcadcaldnigggb.R.inc(17644);if ((((rangeStyle == RANGE_MONTH_MONDAY)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17645)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17646)==0&false))) {{
                    __CLR4_4_1dcadcaldnigggb.R.inc(17647);startCutoff = Calendar.MONDAY;
                    __CLR4_4_1dcadcaldnigggb.R.inc(17648);endCutoff = Calendar.SUNDAY;
                }
                }__CLR4_4_1dcadcaldnigggb.R.inc(17649);break;
            case RANGE_WEEK_SUNDAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1dcadcaldnigggb.R.inc(17650);__CLB4_4_1_bool1=true;}
            case RANGE_WEEK_MONDAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1dcadcaldnigggb.R.inc(17651);__CLB4_4_1_bool1=true;}
            case RANGE_WEEK_RELATIVE:if (!__CLB4_4_1_bool1) {__CLR4_4_1dcadcaldnigggb.R.inc(17652);__CLB4_4_1_bool1=true;}
            case RANGE_WEEK_CENTER:if (!__CLB4_4_1_bool1) {__CLR4_4_1dcadcaldnigggb.R.inc(17653);__CLB4_4_1_bool1=true;}
                //Set start and end to the current date
                __CLR4_4_1dcadcaldnigggb.R.inc(17654);start = truncate(focus, Calendar.DATE);
                __CLR4_4_1dcadcaldnigggb.R.inc(17655);end = truncate(focus, Calendar.DATE);
                boolean __CLB4_4_1_bool2=false;__CLR4_4_1dcadcaldnigggb.R.inc(17656);switch (rangeStyle) {
                    case RANGE_WEEK_SUNDAY:if (!__CLB4_4_1_bool2) {__CLR4_4_1dcadcaldnigggb.R.inc(17657);__CLB4_4_1_bool2=true;}
                        //already set by default
                        __CLR4_4_1dcadcaldnigggb.R.inc(17658);break;
                    case RANGE_WEEK_MONDAY:if (!__CLB4_4_1_bool2) {__CLR4_4_1dcadcaldnigggb.R.inc(17659);__CLB4_4_1_bool2=true;}
                        __CLR4_4_1dcadcaldnigggb.R.inc(17660);startCutoff = Calendar.MONDAY;
                        __CLR4_4_1dcadcaldnigggb.R.inc(17661);endCutoff = Calendar.SUNDAY;
                        __CLR4_4_1dcadcaldnigggb.R.inc(17662);break;
                    case RANGE_WEEK_RELATIVE:if (!__CLB4_4_1_bool2) {__CLR4_4_1dcadcaldnigggb.R.inc(17663);__CLB4_4_1_bool2=true;}
                        __CLR4_4_1dcadcaldnigggb.R.inc(17664);startCutoff = focus.get(Calendar.DAY_OF_WEEK);
                        __CLR4_4_1dcadcaldnigggb.R.inc(17665);endCutoff = startCutoff - 1;
                        __CLR4_4_1dcadcaldnigggb.R.inc(17666);break;
                    case RANGE_WEEK_CENTER:if (!__CLB4_4_1_bool2) {__CLR4_4_1dcadcaldnigggb.R.inc(17667);__CLB4_4_1_bool2=true;}
                        __CLR4_4_1dcadcaldnigggb.R.inc(17668);startCutoff = focus.get(Calendar.DAY_OF_WEEK) - 3;
                        __CLR4_4_1dcadcaldnigggb.R.inc(17669);endCutoff = focus.get(Calendar.DAY_OF_WEEK) + 3;
                        __CLR4_4_1dcadcaldnigggb.R.inc(17670);break;
                }
                __CLR4_4_1dcadcaldnigggb.R.inc(17671);break;
            default:if (!__CLB4_4_1_bool1) {__CLR4_4_1dcadcaldnigggb.R.inc(17672);__CLB4_4_1_bool1=true;}
                __CLR4_4_1dcadcaldnigggb.R.inc(17673);throw new IllegalArgumentException("The range style " + rangeStyle + " is not valid.");
        }
        __CLR4_4_1dcadcaldnigggb.R.inc(17674);if ((((startCutoff < Calendar.SUNDAY)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17675)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17676)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17677);startCutoff += 7;
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17678);if ((((startCutoff > Calendar.SATURDAY)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17679)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17680)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17681);startCutoff -= 7;
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17682);if ((((endCutoff < Calendar.SUNDAY)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17683)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17684)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17685);endCutoff += 7;
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17686);if ((((endCutoff > Calendar.SATURDAY)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17687)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17688)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17689);endCutoff -= 7;
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17690);while ((((start.get(Calendar.DAY_OF_WEEK) != startCutoff)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17691)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17692)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17693);start.add(Calendar.DATE, -1);
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17694);while ((((end.get(Calendar.DAY_OF_WEEK) != endCutoff)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17695)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17696)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17697);end.add(Calendar.DATE, 1);
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17698);return new DateIterator(start, end);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * <p>Constructs an <code>Iterator</code> over each day in a date
     * range defined by a focus date and range style.</p>
     *
     * <p>For instance, passing Thursday, July 4, 2002 and a
     * <code>RANGE_MONTH_SUNDAY</code> will return an <code>Iterator</code>
     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,
     * 2002, returning a Calendar instance for each intermediate day.</p>
     *
     * @param focus  the date to work with, either {@code Date} or {@code Calendar}, not null
     * @param rangeStyle  the style constant to use. Must be one of the range
     * styles listed for the {@link #iterator(Calendar, int)} method.
     * @return the date iterator, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}
     */
    public static Iterator<?> iterator(final Object focus, final int rangeStyle) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17699);
        __CLR4_4_1dcadcaldnigggb.R.inc(17700);if ((((focus == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17701)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17702)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17703);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17704);if ((((focus instanceof Date)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17705)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17706)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17707);return iterator((Date) focus, rangeStyle);
        } }else {__CLR4_4_1dcadcaldnigggb.R.inc(17708);if ((((focus instanceof Calendar)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17709)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17710)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17711);return iterator((Calendar) focus, rangeStyle);
        } }else {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17712);throw new ClassCastException("Could not iterate based on " + focus);
        }
    }}}finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of milliseconds within the 
     * fragment. All datefields greater than the fragment will be ignored.</p>
     * 
     * <p>Asking the milliseconds of any date will only return the number of milliseconds
     * of the current second (resulting in a number between 0 and 999). This 
     * method will retrieve the number of milliseconds for any fragment. 
     * For example, if you want to calculate the number of milliseconds past today, 
     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will
     * be all milliseconds of the past hour(s), minutes(s) and second(s).</p>
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a SECOND field will return 0.</p> 
     * 
     * <p>
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538 (10*1000 + 538)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in milliseconds)</li>
     * </ul>
     * </p>
     * 
     * @param date the date to work with, not null
     * @param fragment the {@code Calendar} field part of date to calculate 
     * @return number of milliseconds within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInMilliseconds(final Date date, final int fragment) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17713);
        __CLR4_4_1dcadcaldnigggb.R.inc(17714);return getFragment(date, fragment, Calendar.MILLISECOND);    
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of seconds within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the seconds of any date will only return the number of seconds
     * of the current minute (resulting in a number between 0 and 59). This 
     * method will retrieve the number of seconds for any fragment. 
     * For example, if you want to calculate the number of seconds past today, 
     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will
     * be all seconds of the past hour(s) and minutes(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a SECOND field will return 0.</p> 
     * 
     * <p>
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10
     *   (equivalent to deprecated date.getSeconds())</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10
     *   (equivalent to deprecated date.getSeconds())</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110
     *   (7*3600 + 15*60 + 10)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in seconds)</li>
     * </ul>
     * </p>
     * 
     * @param date the date to work with, not null
     * @param fragment the {@code Calendar} field part of date to calculate 
     * @return number of seconds within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInSeconds(final Date date, final int fragment) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17715);
        __CLR4_4_1dcadcaldnigggb.R.inc(17716);return getFragment(date, fragment, Calendar.SECOND);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of minutes within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the minutes of any date will only return the number of minutes
     * of the current hour (resulting in a number between 0 and 59). This 
     * method will retrieve the number of minutes for any fragment. 
     * For example, if you want to calculate the number of minutes past this month, 
     * your fragment is Calendar.MONTH. The result will be all minutes of the 
     * past day(s) and hour(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a MINUTE field will return 0.</p> 
     * 
     * <p>
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15
     *   (equivalent to deprecated date.getMinutes())</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15
     *   (equivalent to deprecated date.getMinutes())</li>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in minutes)</li>
     * </ul>
     * </p>
     * 
     * @param date the date to work with, not null
     * @param fragment the {@code Calendar} field part of date to calculate 
     * @return number of minutes within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInMinutes(final Date date, final int fragment) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17717);
        __CLR4_4_1dcadcaldnigggb.R.inc(17718);return getFragment(date, fragment, Calendar.MINUTE);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of hours within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the hours of any date will only return the number of hours
     * of the current day (resulting in a number between 0 and 23). This 
     * method will retrieve the number of hours for any fragment. 
     * For example, if you want to calculate the number of hours past this month, 
     * your fragment is Calendar.MONTH. The result will be all hours of the 
     * past day(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a HOUR field will return 0.</p> 
     * 
     * <p>
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7
     *   (equivalent to deprecated date.getHours())</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7
     *   (equivalent to deprecated date.getHours())</li>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in hours)</li>
     * </ul>
     * </p>
     * 
     * @param date the date to work with, not null
     * @param fragment the {@code Calendar} field part of date to calculate 
     * @return number of hours within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInHours(final Date date, final int fragment) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17719);
        __CLR4_4_1dcadcaldnigggb.R.inc(17720);return getFragment(date, fragment, Calendar.HOUR_OF_DAY);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of days within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the days of any date will only return the number of days
     * of the current month (resulting in a number between 1 and 31). This 
     * method will retrieve the number of days for any fragment. 
     * For example, if you want to calculate the number of days past this year, 
     * your fragment is Calendar.YEAR. The result will be all days of the 
     * past month(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a DAY field will return 0.</p> 
     *  
     * <p>
     * <ul>
     *  <li>January 28, 2008 with Calendar.MONTH as fragment will return 28
     *   (equivalent to deprecated date.getDay())</li>
     *  <li>February 28, 2008 with Calendar.MONTH as fragment will return 28
     *   (equivalent to deprecated date.getDay())</li>
     *  <li>January 28, 2008 with Calendar.YEAR as fragment will return 28</li>
     *  <li>February 28, 2008 with Calendar.YEAR as fragment will return 59</li>
     *  <li>January 28, 2008 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in days)</li>
     * </ul>
     * </p>
     * 
     * @param date the date to work with, not null
     * @param fragment the {@code Calendar} field part of date to calculate 
     * @return number of days  within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInDays(final Date date, final int fragment) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17721);
        __CLR4_4_1dcadcaldnigggb.R.inc(17722);return getFragment(date, fragment, Calendar.DAY_OF_YEAR);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * <p>Returns the number of milliseconds within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the milliseconds of any date will only return the number of milliseconds
     * of the current second (resulting in a number between 0 and 999). This 
     * method will retrieve the number of milliseconds for any fragment. 
     * For example, if you want to calculate the number of seconds past today, 
     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will
     * be all seconds of the past hour(s), minutes(s) and second(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a MILLISECOND field will return 0.</p> 
     * 
     * <p>
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538
     *   (equivalent to calendar.get(Calendar.MILLISECOND))</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538
     *   (equivalent to calendar.get(Calendar.MILLISECOND))</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538
     *   (10*1000 + 538)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in milliseconds)</li>
     * </ul>
     * </p>
     * 
     * @param calendar the calendar to work with, not null
     * @param fragment the {@code Calendar} field part of calendar to calculate 
     * @return number of milliseconds within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
  public static long getFragmentInMilliseconds(final Calendar calendar, final int fragment) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17723);
    __CLR4_4_1dcadcaldnigggb.R.inc(17724);return getFragment(calendar, fragment, Calendar.MILLISECOND);
  }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    /**
     * <p>Returns the number of seconds within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the seconds of any date will only return the number of seconds
     * of the current minute (resulting in a number between 0 and 59). This 
     * method will retrieve the number of seconds for any fragment. 
     * For example, if you want to calculate the number of seconds past today, 
     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will
     * be all seconds of the past hour(s) and minutes(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a SECOND field will return 0.</p> 
     * 
     * <p>
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10
     *   (equivalent to calendar.get(Calendar.SECOND))</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10
     *   (equivalent to calendar.get(Calendar.SECOND))</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110
     *   (7*3600 + 15*60 + 10)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in seconds)</li>
     * </ul>
     * </p>
     * 
     * @param calendar the calendar to work with, not null
     * @param fragment the {@code Calendar} field part of calendar to calculate 
     * @return number of seconds within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInSeconds(final Calendar calendar, final int fragment) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17725);
        __CLR4_4_1dcadcaldnigggb.R.inc(17726);return getFragment(calendar, fragment, Calendar.SECOND);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of minutes within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the minutes of any date will only return the number of minutes
     * of the current hour (resulting in a number between 0 and 59). This 
     * method will retrieve the number of minutes for any fragment. 
     * For example, if you want to calculate the number of minutes past this month, 
     * your fragment is Calendar.MONTH. The result will be all minutes of the 
     * past day(s) and hour(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a MINUTE field will return 0.</p> 
     * 
     * <p>
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15
     *   (equivalent to calendar.get(Calendar.MINUTES))</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15
     *   (equivalent to calendar.get(Calendar.MINUTES))</li>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in minutes)</li>
     * </ul>
     * </p>
     * 
     * @param calendar the calendar to work with, not null
     * @param fragment the {@code Calendar} field part of calendar to calculate 
     * @return number of minutes within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInMinutes(final Calendar calendar, final int fragment) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17727);
        __CLR4_4_1dcadcaldnigggb.R.inc(17728);return getFragment(calendar, fragment, Calendar.MINUTE);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of hours within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the hours of any date will only return the number of hours
     * of the current day (resulting in a number between 0 and 23). This 
     * method will retrieve the number of hours for any fragment. 
     * For example, if you want to calculate the number of hours past this month, 
     * your fragment is Calendar.MONTH. The result will be all hours of the 
     * past day(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a HOUR field will return 0.</p> 
     *  
     * <p>
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7
     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7
     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))</li>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in hours)</li>
     * </ul>
     * </p>
     *  
     * @param calendar the calendar to work with, not null
     * @param fragment the {@code Calendar} field part of calendar to calculate 
     * @return number of hours within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInHours(final Calendar calendar, final int fragment) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17729);
        __CLR4_4_1dcadcaldnigggb.R.inc(17730);return getFragment(calendar, fragment, Calendar.HOUR_OF_DAY);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of days within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the days of any date will only return the number of days
     * of the current month (resulting in a number between 1 and 31). This 
     * method will retrieve the number of days for any fragment. 
     * For example, if you want to calculate the number of days past this year, 
     * your fragment is Calendar.YEAR. The result will be all days of the 
     * past month(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a DAY field will return 0.</p> 
     * 
     * <p>
     * <ul>
     *  <li>January 28, 2008 with Calendar.MONTH as fragment will return 28
     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))</li>
     *  <li>February 28, 2008 with Calendar.MONTH as fragment will return 28
     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))</li>
     *  <li>January 28, 2008 with Calendar.YEAR as fragment will return 28
     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))</li>
     *  <li>February 28, 2008 with Calendar.YEAR as fragment will return 59
     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))</li>
     *  <li>January 28, 2008 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in days)</li>
     * </ul>
     * </p>
     * 
     * @param calendar the calendar to work with, not null
     * @param fragment the {@code Calendar} field part of calendar to calculate 
     * @return number of days within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInDays(final Calendar calendar, final int fragment) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17731);
        __CLR4_4_1dcadcaldnigggb.R.inc(17732);return getFragment(calendar, fragment, Calendar.DAY_OF_YEAR);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    /**
     * Gets a Date fragment for any unit.
     * 
     * @param date the date to work with, not null
     * @param fragment the Calendar field part of date to calculate 
     * @param unit the {@code Calendar} field defining the unit
     * @return number of units within the fragment of the date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    private static long getFragment(final Date date, final int fragment, final int unit) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17733);
        __CLR4_4_1dcadcaldnigggb.R.inc(17734);if((((date == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17735)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17736)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17737);throw  new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17738);final Calendar calendar = Calendar.getInstance();
        __CLR4_4_1dcadcaldnigggb.R.inc(17739);calendar.setTime(date);
        __CLR4_4_1dcadcaldnigggb.R.inc(17740);return getFragment(calendar, fragment, unit);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * Gets a Calendar fragment for any unit.
     * 
     * @param calendar the calendar to work with, not null
     * @param fragment the Calendar field part of calendar to calculate 
     * @param unit the {@code Calendar} field defining the unit
     * @return number of units within the fragment of the calendar
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    private static long getFragment(final Calendar calendar, final int fragment, final int unit) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17741);
        __CLR4_4_1dcadcaldnigggb.R.inc(17742);if((((calendar == null)&&(__CLR4_4_1dcadcaldnigggb.R.iget(17743)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17744)==0&false))) {{
            __CLR4_4_1dcadcaldnigggb.R.inc(17745);throw  new IllegalArgumentException("The date must not be null"); 
        }
        }__CLR4_4_1dcadcaldnigggb.R.inc(17746);final long millisPerUnit = getMillisPerUnit(unit);
        __CLR4_4_1dcadcaldnigggb.R.inc(17747);long result = 0;
        
        // Fragments bigger than a day require a breakdown to days
        boolean __CLB4_4_1_bool3=false;__CLR4_4_1dcadcaldnigggb.R.inc(17748);switch (fragment) {
            case Calendar.YEAR:if (!__CLB4_4_1_bool3) {__CLR4_4_1dcadcaldnigggb.R.inc(17749);__CLB4_4_1_bool3=true;}
                __CLR4_4_1dcadcaldnigggb.R.inc(17750);result += (calendar.get(Calendar.DAY_OF_YEAR) * MILLIS_PER_DAY) / millisPerUnit;
                __CLR4_4_1dcadcaldnigggb.R.inc(17751);break;
            case Calendar.MONTH:if (!__CLB4_4_1_bool3) {__CLR4_4_1dcadcaldnigggb.R.inc(17752);__CLB4_4_1_bool3=true;}
                __CLR4_4_1dcadcaldnigggb.R.inc(17753);result += (calendar.get(Calendar.DAY_OF_MONTH) * MILLIS_PER_DAY) / millisPerUnit;
                __CLR4_4_1dcadcaldnigggb.R.inc(17754);break;
        }

        boolean __CLB4_4_1_bool4=false;__CLR4_4_1dcadcaldnigggb.R.inc(17755);switch (fragment) {
            // Number of days already calculated for these cases
            case Calendar.YEAR:if (!__CLB4_4_1_bool4) {__CLR4_4_1dcadcaldnigggb.R.inc(17756);__CLB4_4_1_bool4=true;}
            case Calendar.MONTH:if (!__CLB4_4_1_bool4) {__CLR4_4_1dcadcaldnigggb.R.inc(17757);__CLB4_4_1_bool4=true;}
            
            // The rest of the valid cases
            case Calendar.DAY_OF_YEAR:if (!__CLB4_4_1_bool4) {__CLR4_4_1dcadcaldnigggb.R.inc(17758);__CLB4_4_1_bool4=true;}
            case Calendar.DATE:if (!__CLB4_4_1_bool4) {__CLR4_4_1dcadcaldnigggb.R.inc(17759);__CLB4_4_1_bool4=true;}
                __CLR4_4_1dcadcaldnigggb.R.inc(17760);result += (calendar.get(Calendar.HOUR_OF_DAY) * MILLIS_PER_HOUR) / millisPerUnit;
                //$FALL-THROUGH$
            case Calendar.HOUR_OF_DAY:if (!__CLB4_4_1_bool4) {__CLR4_4_1dcadcaldnigggb.R.inc(17761);__CLB4_4_1_bool4=true;}
                __CLR4_4_1dcadcaldnigggb.R.inc(17762);result += (calendar.get(Calendar.MINUTE) * MILLIS_PER_MINUTE) / millisPerUnit;
                //$FALL-THROUGH$
            case Calendar.MINUTE:if (!__CLB4_4_1_bool4) {__CLR4_4_1dcadcaldnigggb.R.inc(17763);__CLB4_4_1_bool4=true;}
                __CLR4_4_1dcadcaldnigggb.R.inc(17764);result += (calendar.get(Calendar.SECOND) * MILLIS_PER_SECOND) / millisPerUnit;
                //$FALL-THROUGH$
            case Calendar.SECOND:if (!__CLB4_4_1_bool4) {__CLR4_4_1dcadcaldnigggb.R.inc(17765);__CLB4_4_1_bool4=true;}
                __CLR4_4_1dcadcaldnigggb.R.inc(17766);result += (calendar.get(Calendar.MILLISECOND) * 1) / millisPerUnit;
                __CLR4_4_1dcadcaldnigggb.R.inc(17767);break;
            case Calendar.MILLISECOND:if (!__CLB4_4_1_bool4) {__CLR4_4_1dcadcaldnigggb.R.inc(17768);__CLB4_4_1_bool4=true;} __CLR4_4_1dcadcaldnigggb.R.inc(17769);break;//never useful
                default:if (!__CLB4_4_1_bool4) {__CLR4_4_1dcadcaldnigggb.R.inc(17770);__CLB4_4_1_bool4=true;} __CLR4_4_1dcadcaldnigggb.R.inc(17771);throw new IllegalArgumentException("The fragment " + fragment + " is not supported");
        }
        __CLR4_4_1dcadcaldnigggb.R.inc(17772);return result;
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    
    /**
     * Determines if two calendars are equal up to no more than the specified 
     * most significant field.
     * 
     * @param cal1 the first calendar, not <code>null</code>
     * @param cal2 the second calendar, not <code>null</code>
     * @param field the field from {@code Calendar}
     * @return <code>true</code> if equal; otherwise <code>false</code>
     * @throws IllegalArgumentException if any argument is <code>null</code>
     * @see #truncate(Calendar, int)
     * @see #truncatedEquals(Date, Date, int)
     * @since 3.0
     */
    public static boolean truncatedEquals(final Calendar cal1, final Calendar cal2, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17773);
        __CLR4_4_1dcadcaldnigggb.R.inc(17774);return truncatedCompareTo(cal1, cal2, field) == 0;
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * Determines if two dates are equal up to no more than the specified 
     * most significant field.
     * 
     * @param date1 the first date, not <code>null</code>
     * @param date2 the second date, not <code>null</code>
     * @param field the field from {@code Calendar}
     * @return <code>true</code> if equal; otherwise <code>false</code>
     * @throws IllegalArgumentException if any argument is <code>null</code>
     * @see #truncate(Date, int)
     * @see #truncatedEquals(Calendar, Calendar, int)
     * @since 3.0
     */
    public static boolean truncatedEquals(final Date date1, final Date date2, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17775);
        __CLR4_4_1dcadcaldnigggb.R.inc(17776);return truncatedCompareTo(date1, date2, field) == 0;
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * Determines how two calendars compare up to no more than the specified 
     * most significant field.
     * 
     * @param cal1 the first calendar, not <code>null</code>
     * @param cal2 the second calendar, not <code>null</code>
     * @param field the field from {@code Calendar}
     * @return a negative integer, zero, or a positive integer as the first 
     * calendar is less than, equal to, or greater than the second.
     * @throws IllegalArgumentException if any argument is <code>null</code>
     * @see #truncate(Calendar, int)
     * @see #truncatedCompareTo(Date, Date, int)
     * @since 3.0
     */
    public static int truncatedCompareTo(final Calendar cal1, final Calendar cal2, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17777);
        __CLR4_4_1dcadcaldnigggb.R.inc(17778);final Calendar truncatedCal1 = truncate(cal1, field);
        __CLR4_4_1dcadcaldnigggb.R.inc(17779);final Calendar truncatedCal2 = truncate(cal2, field);
        __CLR4_4_1dcadcaldnigggb.R.inc(17780);return truncatedCal1.compareTo(truncatedCal2);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * Determines how two dates compare up to no more than the specified 
     * most significant field.
     * 
     * @param date1 the first date, not <code>null</code>
     * @param date2 the second date, not <code>null</code>
     * @param field the field from <code>Calendar</code>
     * @return a negative integer, zero, or a positive integer as the first 
     * date is less than, equal to, or greater than the second.
     * @throws IllegalArgumentException if any argument is <code>null</code>
     * @see #truncate(Calendar, int)
     * @see #truncatedCompareTo(Date, Date, int)
     * @since 3.0
     */
    public static int truncatedCompareTo(final Date date1, final Date date2, final int field) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17781);
        __CLR4_4_1dcadcaldnigggb.R.inc(17782);final Date truncatedDate1 = truncate(date1, field);
        __CLR4_4_1dcadcaldnigggb.R.inc(17783);final Date truncatedDate2 = truncate(date2, field);
        __CLR4_4_1dcadcaldnigggb.R.inc(17784);return truncatedDate1.compareTo(truncatedDate2);
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    /**
     * Returns the number of milliseconds of a {@code Calendar} field, if this is a constant value.
     * This handles millisecond, second, minute, hour and day (even though days can very in length).
     * 
     * @param unit  a {@code Calendar} field constant which is a valid unit for a fragment
     * @return the number of milliseconds in the field
     * @throws IllegalArgumentException if date can't be represented in milliseconds
     * @since 2.4 
     */
    private static long getMillisPerUnit(final int unit) {try{__CLR4_4_1dcadcaldnigggb.R.inc(17785);
        __CLR4_4_1dcadcaldnigggb.R.inc(17786);long result = Long.MAX_VALUE;
        boolean __CLB4_4_1_bool5=false;__CLR4_4_1dcadcaldnigggb.R.inc(17787);switch (unit) {
            case Calendar.DAY_OF_YEAR:if (!__CLB4_4_1_bool5) {__CLR4_4_1dcadcaldnigggb.R.inc(17788);__CLB4_4_1_bool5=true;}
            case Calendar.DATE:if (!__CLB4_4_1_bool5) {__CLR4_4_1dcadcaldnigggb.R.inc(17789);__CLB4_4_1_bool5=true;}
                __CLR4_4_1dcadcaldnigggb.R.inc(17790);result = MILLIS_PER_DAY;
                __CLR4_4_1dcadcaldnigggb.R.inc(17791);break;
            case Calendar.HOUR_OF_DAY:if (!__CLB4_4_1_bool5) {__CLR4_4_1dcadcaldnigggb.R.inc(17792);__CLB4_4_1_bool5=true;}
                __CLR4_4_1dcadcaldnigggb.R.inc(17793);result = MILLIS_PER_HOUR;
                __CLR4_4_1dcadcaldnigggb.R.inc(17794);break;
            case Calendar.MINUTE:if (!__CLB4_4_1_bool5) {__CLR4_4_1dcadcaldnigggb.R.inc(17795);__CLB4_4_1_bool5=true;}
                __CLR4_4_1dcadcaldnigggb.R.inc(17796);result = MILLIS_PER_MINUTE;
                __CLR4_4_1dcadcaldnigggb.R.inc(17797);break;
            case Calendar.SECOND:if (!__CLB4_4_1_bool5) {__CLR4_4_1dcadcaldnigggb.R.inc(17798);__CLB4_4_1_bool5=true;}
                __CLR4_4_1dcadcaldnigggb.R.inc(17799);result = MILLIS_PER_SECOND;
                __CLR4_4_1dcadcaldnigggb.R.inc(17800);break;
            case Calendar.MILLISECOND:if (!__CLB4_4_1_bool5) {__CLR4_4_1dcadcaldnigggb.R.inc(17801);__CLB4_4_1_bool5=true;}
                __CLR4_4_1dcadcaldnigggb.R.inc(17802);result = 1;
                __CLR4_4_1dcadcaldnigggb.R.inc(17803);break;
            default:if (!__CLB4_4_1_bool5) {__CLR4_4_1dcadcaldnigggb.R.inc(17804);__CLB4_4_1_bool5=true;} __CLR4_4_1dcadcaldnigggb.R.inc(17805);throw new IllegalArgumentException("The unit " + unit + " cannot be represented is milleseconds");
        }
        __CLR4_4_1dcadcaldnigggb.R.inc(17806);return result;
    }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Date iterator.</p>
     */
    static class DateIterator implements Iterator<Calendar> {
        private final Calendar endFinal;
        private final Calendar spot;
        
        /**
         * Constructs a DateIterator that ranges from one date to another. 
         *
         * @param startFinal start date (inclusive)
         * @param endFinal end date (inclusive)
         */
        DateIterator(final Calendar startFinal, final Calendar endFinal) {
            super();__CLR4_4_1dcadcaldnigggb.R.inc(17808);try{__CLR4_4_1dcadcaldnigggb.R.inc(17807);
            __CLR4_4_1dcadcaldnigggb.R.inc(17809);this.endFinal = endFinal;
            __CLR4_4_1dcadcaldnigggb.R.inc(17810);spot = startFinal;
            __CLR4_4_1dcadcaldnigggb.R.inc(17811);spot.add(Calendar.DATE, -1);
        }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

        /**
         * Has the iterator not reached the end date yet?
         *
         * @return <code>true</code> if the iterator has yet to reach the end date
         */
        @Override
        public boolean hasNext() {try{__CLR4_4_1dcadcaldnigggb.R.inc(17812);
            __CLR4_4_1dcadcaldnigggb.R.inc(17813);return spot.before(endFinal);
        }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

        /**
         * Return the next calendar in the iteration
         *
         * @return Object calendar for the next date
         */
        @Override
        public Calendar next() {try{__CLR4_4_1dcadcaldnigggb.R.inc(17814);
            __CLR4_4_1dcadcaldnigggb.R.inc(17815);if ((((spot.equals(endFinal))&&(__CLR4_4_1dcadcaldnigggb.R.iget(17816)!=0|true))||(__CLR4_4_1dcadcaldnigggb.R.iget(17817)==0&false))) {{
                __CLR4_4_1dcadcaldnigggb.R.inc(17818);throw new NoSuchElementException();
            }
            }__CLR4_4_1dcadcaldnigggb.R.inc(17819);spot.add(Calendar.DATE, 1);
            __CLR4_4_1dcadcaldnigggb.R.inc(17820);return (Calendar) spot.clone();
        }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}

        /**
         * Always throws UnsupportedOperationException.
         * 
         * @throws UnsupportedOperationException
         * @see java.util.Iterator#remove()
         */
        @Override
        public void remove() {try{__CLR4_4_1dcadcaldnigggb.R.inc(17821);
            __CLR4_4_1dcadcaldnigggb.R.inc(17822);throw new UnsupportedOperationException();
        }finally{__CLR4_4_1dcadcaldnigggb.R.flushNeeded();}}
    }

}
