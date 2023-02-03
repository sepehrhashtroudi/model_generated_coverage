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

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * These Unit-tests will check all possible extremes when using some rounding-methods of DateUtils.
 * The extremes are tested at the switch-point in milliseconds
 * 
 * According to the implementation SEMI_MONTH will either round/truncate to the 1st or 16th
 * When rounding Calendar.MONTH it depends on the number of days within that month.
 * A month with 28 days will be rounded up from the 15th
 * A month with 29 or 30 days will be rounded up from the 16th
 * A month with 31 days will be rounded up from the 17th
 * 
 * @since 3.0
 * @version $Id$
 */
public class DateUtilsRoundingTest {static class __CLR4_4_1g7sg7sldnigh0b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,21099,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    DateFormat dateTimeParser;
    
    Date januaryOneDate;
    Date targetYearDate;
    //No targetMonths, these must be tested for every type of month(28-31 days)
    Date targetDateDate, targetDayOfMonthDate, targetAmDate, targetPmDate;
    Date targetHourOfDayDate, targetHourDate;
    Date targetMinuteDate;
    Date targetSecondDate;
    Date targetMilliSecondDate;

    Calendar januaryOneCalendar;
    FastDateFormat fdf = DateFormatUtils.ISO_DATETIME_FORMAT;


    @Before
    public void setUp() throws Exception {try{__CLR4_4_1g7sg7sldnigh0b.R.inc(21016);

        __CLR4_4_1g7sg7sldnigh0b.R.inc(21017);dateTimeParser = new SimpleDateFormat("MMM dd, yyyy H:mm:ss.SSS", Locale.ENGLISH);
        
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21018);targetYearDate = dateTimeParser.parse("January 1, 2007 0:00:00.000");
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21019);targetDateDate = targetDayOfMonthDate = dateTimeParser.parse("June 1, 2008 0:00:00.000");
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21020);targetAmDate =  dateTimeParser.parse("June 1, 2008 0:00:00.000");
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21021);targetPmDate = dateTimeParser.parse("June 1, 2008 12:00:00.000");
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21022);targetHourDate = dateTimeParser.parse("June 1, 2008 8:00:00.000");
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21023);targetHourOfDayDate = dateTimeParser.parse("June 1, 2008 8:00:00.000");
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21024);targetMinuteDate =  dateTimeParser.parse("June 1, 2008 8:15:00.000");
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21025);targetSecondDate =  dateTimeParser.parse("June 1, 2008 8:15:14.000");
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21026);targetMilliSecondDate =  dateTimeParser.parse("June 1, 2008 8:15:14.231");
        
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21027);januaryOneDate = dateTimeParser.parse("January 1, 2008 0:00:00.000");
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21028);januaryOneCalendar = Calendar.getInstance();
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21029);januaryOneCalendar.setTime(januaryOneDate);
    }finally{__CLR4_4_1g7sg7sldnigh0b.R.flushNeeded();}}

    /**
     * Tests DateUtils.round()-method with Calendar.Year
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.MONTH
     * Includes rounding months with 28, 29, 30 and 31 days
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with DateUtils.SEMI_MONTH
     * Includes rounding months with 28, 29, 30 and 31 days, each with first and second half 
     * Includes rounding to January 1
     *      
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.DATE
     * Includes rounding the extremes of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.DAY_OF_MONTH
     * Includes rounding the extremes of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.AM_PM
     * Includes rounding the extremes of both AM and PM of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.HOUR_OF_DAY
     * Includes rounding the extremes of one hour 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.HOUR
     * Includes rounding the extremes of one hour 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.MINUTE
     * Includes rounding the extremes of one minute 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.SECOND
     * Includes rounding the extremes of one second 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.MILLISECOND
     * Includes rounding the extremes of one second 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.YEAR
     * 
     * @throws Exception
     * @since 3.0
     */
    

    /**
     * Test DateUtils.truncate()-method with Calendar.MONTH
     * 
     * @throws Exception
     * @since 3.0
     */
    

    /**
     * Test DateUtils.truncate()-method with DateUtils.SEMI_MONTH
     * Includes truncating months with 28, 29, 30 and 31 days, each with first and second half
     * 
     * @throws Exception
     * @since 3.0
     */
    

    /**
     * Test DateUtils.truncate()-method with Calendar.DATE
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.DAY_OF_MONTH
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.AM_PM
     * Includes truncating the extremes of both AM and PM of one day 
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.HOUR
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.HOUR_OF_DAY
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.MINUTE
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.SECOND
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.SECOND
     * 
     * @throws Exception
     * @since 3.0
     */
    
        
    /**
     * When using this basetest all extremes are tested.<br> 
     * It will test the Date, Calendar and Object-implementation<br>
     * lastRoundDownDate should round down to roundedDownDate<br>
     * lastRoundDownDate + 1 millisecond should round up to roundedUpDate
     * 
     * @param roundedUpDate the next rounded date after <strong>roundedDownDate</strong> when using <strong>calendarField</strong>
     * @param roundedDownDate the result if <strong>lastRoundDownDate</strong> was rounded with <strong>calendarField</strong>
     * @param lastRoundDownDate rounding this value with <strong>calendarField</strong> will result in <strong>roundedDownDate</strong>
     * @param calendarField
     * @since 3.0
     */
    protected void baseRoundTest(final Date roundedUpDate, final Date roundedDownDate, final Date lastRoundDownDate, final int calendarField) {try{__CLR4_4_1g7sg7sldnigh0b.R.inc(21030);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21031);final Date firstRoundUpDate = DateUtils.addMilliseconds(lastRoundDownDate, 1);
        
        //Date-comparison
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21032);assertEquals(roundedDownDate, DateUtils.round(roundedDownDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21033);assertEquals(roundedUpDate, DateUtils.round(roundedUpDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21034);assertEquals(roundedDownDate, DateUtils.round(lastRoundDownDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21035);assertEquals(roundedUpDate, DateUtils.round(firstRoundUpDate, calendarField));
        
        //Calendar-initiations
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21036);Calendar roundedUpCalendar, roundedDownCalendar, lastRoundDownCalendar, firstRoundUpCalendar; 
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21037);roundedDownCalendar = Calendar.getInstance();
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21038);roundedUpCalendar = Calendar.getInstance();
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21039);lastRoundDownCalendar = Calendar.getInstance();
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21040);firstRoundUpCalendar = Calendar.getInstance();
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21041);roundedDownCalendar.setTime(roundedDownDate);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21042);roundedUpCalendar.setTime(roundedUpDate);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21043);lastRoundDownCalendar.setTime(lastRoundDownDate);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21044);firstRoundUpCalendar.setTime(firstRoundUpDate);

        //Calendar-comparison
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21045);assertEquals(roundedDownCalendar, DateUtils.round(roundedDownCalendar, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21046);assertEquals(roundedUpCalendar, DateUtils.round(roundedUpCalendar, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21047);assertEquals(roundedDownCalendar, DateUtils.round(lastRoundDownCalendar, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21048);assertEquals(roundedUpCalendar, DateUtils.round(firstRoundUpCalendar, calendarField));

        //Object-comparison
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21049);assertEquals(roundedDownDate, DateUtils.round((Object) roundedDownDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21050);assertEquals(roundedUpDate, DateUtils.round((Object) roundedUpDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21051);assertEquals(roundedDownDate, DateUtils.round((Object) lastRoundDownDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21052);assertEquals(roundedUpDate, DateUtils.round((Object) firstRoundUpDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21053);assertEquals(roundedDownDate, DateUtils.round((Object) roundedDownCalendar, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21054);assertEquals(roundedUpDate, DateUtils.round((Object) roundedUpCalendar, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21055);assertEquals(roundedDownDate, DateUtils.round((Object) lastRoundDownDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21056);assertEquals(roundedUpDate, DateUtils.round((Object) firstRoundUpDate, calendarField));
    }finally{__CLR4_4_1g7sg7sldnigh0b.R.flushNeeded();}}
    
    /**
     * When using this basetest all extremes are tested.<br> 
     * It will test the Date, Calendar and Object-implementation<br>
     * lastTruncateDate should round down to truncatedDate<br>
     * lastTruncateDate + 1 millisecond should never round down to truncatedDate
     * 
     * @param truncatedDate expected Date when <strong>lastTruncateDate</strong> is truncated with <strong>calendarField</strong>
     * @param lastTruncateDate the last possible Date which will truncate to <strong>truncatedDate</strong> with <strong>calendarField</strong>
     * @param calendarField a Calendar.field value
     * @since 3.0
     */
    protected void baseTruncateTest(final Date truncatedDate, final Date lastTruncateDate, final int calendarField) {try{__CLR4_4_1g7sg7sldnigh0b.R.inc(21057);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21058);final Date nextTruncateDate = DateUtils.addMilliseconds(lastTruncateDate, 1);
        
        //Date-comparison
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21059);assertEquals("Truncating "+ fdf.format(truncatedDate) +" as Date with CalendarField-value "+ calendarField +" must return itself", truncatedDate, DateUtils.truncate(truncatedDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21060);assertEquals(truncatedDate, DateUtils.truncate(lastTruncateDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21061);assertFalse(fdf.format(lastTruncateDate) +" is not an extreme when truncating as Date with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate(nextTruncateDate, calendarField)));
        
        //Calendar-initiations
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21062);Calendar truncatedCalendar, lastTruncateCalendar, nextTruncateCalendar; 
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21063);truncatedCalendar = Calendar.getInstance();
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21064);lastTruncateCalendar = Calendar.getInstance();
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21065);nextTruncateCalendar = Calendar.getInstance();
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21066);truncatedCalendar.setTime(truncatedDate);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21067);lastTruncateCalendar.setTime(lastTruncateDate);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21068);nextTruncateCalendar.setTime(nextTruncateDate);

        //Calendar-comparison
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21069);assertEquals("Truncating "+ fdf.format(truncatedCalendar) +" as Calendar with CalendarField-value "+ calendarField +" must return itself", truncatedCalendar, DateUtils.truncate(truncatedCalendar, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21070);assertEquals(truncatedCalendar, DateUtils.truncate(lastTruncateCalendar, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21071);assertFalse(fdf.format(lastTruncateCalendar) +" is not an extreme when truncating as Calendar with CalendarField-value "+ calendarField, truncatedCalendar.equals(DateUtils.truncate(nextTruncateCalendar, calendarField)));

        //Object-comparison
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21072);assertEquals("Truncating "+ fdf.format(truncatedDate) +" as Date cast to Object with CalendarField-value "+ calendarField +" must return itself as Date", truncatedDate, DateUtils.truncate((Object) truncatedDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21073);assertEquals(truncatedDate, DateUtils.truncate((Object) lastTruncateDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21074);assertFalse(fdf.format(lastTruncateDate) +" is not an extreme when truncating as Date cast to Object with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate((Object) nextTruncateDate, calendarField)));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21075);assertEquals("Truncating "+ fdf.format(truncatedCalendar) +" as Calendar cast to Object with CalendarField-value "+ calendarField +" must return itself as Date", truncatedDate, DateUtils.truncate((Object) truncatedCalendar, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21076);assertEquals(truncatedDate, DateUtils.truncate((Object) lastTruncateCalendar, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21077);assertFalse(fdf.format(lastTruncateCalendar) +" is not an extreme when truncating as Calendar cast to Object with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate((Object) nextTruncateCalendar, calendarField)));
    }finally{__CLR4_4_1g7sg7sldnigh0b.R.flushNeeded();}}
    
    /**
     * 
     * Any January 1 could be considered as the ultimate extreme.
     * Instead of comparing the results if the input has a difference of 1 millisecond we check the output to be exactly January first. 
     * 
     * @param minDate
     * @param maxDate
     * @param calendarField
     * @since 3.0
     */
    protected void roundToJanuaryFirst(final Date minDate, final Date maxDate, final int calendarField) {try{__CLR4_4_1g7sg7sldnigh0b.R.inc(21078);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21079);assertEquals("Rounding "+ fdf.format(januaryOneDate) +" as Date with CalendarField-value "+ calendarField +" must return itself", januaryOneDate, DateUtils.round(januaryOneDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21080);assertEquals(januaryOneDate, DateUtils.round(minDate, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21081);assertEquals(januaryOneDate, DateUtils.round(maxDate, calendarField));
        
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21082);final Calendar minCalendar = Calendar.getInstance();
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21083);minCalendar.setTime(minDate);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21084);final Calendar maxCalendar = Calendar.getInstance();
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21085);maxCalendar.setTime(maxDate);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21086);assertEquals("Rounding "+ fdf.format(januaryOneCalendar) +" as Date with CalendarField-value "+ calendarField +" must return itself", januaryOneCalendar, DateUtils.round(januaryOneCalendar, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21087);assertEquals(januaryOneCalendar, DateUtils.round(minCalendar, calendarField));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21088);assertEquals(januaryOneCalendar, DateUtils.round(maxCalendar, calendarField));

        __CLR4_4_1g7sg7sldnigh0b.R.inc(21089);final Date toPrevRoundDate = DateUtils.addMilliseconds(minDate, -1);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21090);final Date toNextRoundDate = DateUtils.addMilliseconds(maxDate, 1);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21091);assertFalse(fdf.format(minDate) +" is not an lower-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toPrevRoundDate, calendarField)));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21092);assertFalse(fdf.format(maxDate) +" is not an upper-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toNextRoundDate, calendarField)));
        
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21093);final Calendar toPrevRoundCalendar = Calendar.getInstance();
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21094);toPrevRoundCalendar.setTime(toPrevRoundDate);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21095);final Calendar toNextRoundCalendar = Calendar.getInstance();
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21096);toNextRoundCalendar.setTime(toNextRoundDate);
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21097);assertFalse(fdf.format(minCalendar) +" is not an lower-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toPrevRoundDate, calendarField)));
        __CLR4_4_1g7sg7sldnigh0b.R.inc(21098);assertFalse(fdf.format(maxCalendar) +" is not an upper-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toNextRoundDate, calendarField)));
    }finally{__CLR4_4_1g7sg7sldnigh0b.R.flushNeeded();}}
}
