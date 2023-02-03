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
public class DateUtilsRoundingTest {static class __CLR4_4_1gm8gm8ldni851z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,21647,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    public void setUp() throws Exception {try{__CLR4_4_1gm8gm8ldni851z.R.inc(21536);

        __CLR4_4_1gm8gm8ldni851z.R.inc(21537);dateTimeParser = new SimpleDateFormat("MMM dd, yyyy H:mm:ss.SSS", Locale.ENGLISH);
        
        __CLR4_4_1gm8gm8ldni851z.R.inc(21538);targetYearDate = dateTimeParser.parse("January 1, 2007 0:00:00.000");
        __CLR4_4_1gm8gm8ldni851z.R.inc(21539);targetDateDate = targetDayOfMonthDate = dateTimeParser.parse("June 1, 2008 0:00:00.000");
        __CLR4_4_1gm8gm8ldni851z.R.inc(21540);targetAmDate =  dateTimeParser.parse("June 1, 2008 0:00:00.000");
        __CLR4_4_1gm8gm8ldni851z.R.inc(21541);targetPmDate = dateTimeParser.parse("June 1, 2008 12:00:00.000");
        __CLR4_4_1gm8gm8ldni851z.R.inc(21542);targetHourDate = dateTimeParser.parse("June 1, 2008 8:00:00.000");
        __CLR4_4_1gm8gm8ldni851z.R.inc(21543);targetHourOfDayDate = dateTimeParser.parse("June 1, 2008 8:00:00.000");
        __CLR4_4_1gm8gm8ldni851z.R.inc(21544);targetMinuteDate =  dateTimeParser.parse("June 1, 2008 8:15:00.000");
        __CLR4_4_1gm8gm8ldni851z.R.inc(21545);targetSecondDate =  dateTimeParser.parse("June 1, 2008 8:15:14.000");
        __CLR4_4_1gm8gm8ldni851z.R.inc(21546);targetMilliSecondDate =  dateTimeParser.parse("June 1, 2008 8:15:14.231");
        
        __CLR4_4_1gm8gm8ldni851z.R.inc(21547);januaryOneDate = dateTimeParser.parse("January 1, 2008 0:00:00.000");
        __CLR4_4_1gm8gm8ldni851z.R.inc(21548);januaryOneCalendar = Calendar.getInstance();
        __CLR4_4_1gm8gm8ldni851z.R.inc(21549);januaryOneCalendar.setTime(januaryOneDate);
    }finally{__CLR4_4_1gm8gm8ldni851z.R.flushNeeded();}}

    /**
     * Tests DateUtils.round()-method with Calendar.Year
     * 
     * @throws Exception
     * @since 3.0
     */
@Test
public void modify() {__CLR4_4_1gm8gm8ldni851z.R.globalSliceStart(getClass().getName(),21550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18b6ybjgmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gm8gm8ldni851z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gm8gm8ldni851z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.modify",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18b6ybjgmm(){try{__CLR4_4_1gm8gm8ldni851z.R.inc(21550); __CLR4_4_1gm8gm8ldni851z.R.inc(21551);final Calendar cal = Calendar.getInstance(); __CLR4_4_1gm8gm8ldni851z.R.inc(21552);cal.set(Calendar.YEAR, 280000000); __CLR4_4_1gm8gm8ldni851z.R.inc(21553);cal.set(Calendar.MONTH, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21554);cal.set(Calendar.DAY_OF_MONTH, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21555);cal.set(Calendar.HOUR_OF_DAY, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21556);cal.set(Calendar.MINUTE, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21557);cal.set(Calendar.SECOND, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21558);cal.set(Calendar.MILLISECOND, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21559);cal.set(Calendar.SECOND, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21560);cal.set(Calendar.MILLISECOND, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21561);cal.set(Calendar.SECOND, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21562);cal.set(Calendar.MILLISECOND, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21563);cal.set(Calendar.SECOND, 1);
}finally{__CLR4_4_1gm8gm8ldni851z.R.flushNeeded();}}

//@Test
//public void modify() { final Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR, 280000000); cal.set(Calendar.SECOND, 0); cal.set(Calendar.MILLISECOND, 0); cal.set(Calendar.HOUR_OF_DAY, 0); cal.set(Calendar.MINUTE, 0); cal.set(Calendar.SECOND, 0); cal.set(Calendar.MILLISECOND, 0); cal.set(Calendar.MILLISECOND, 0); cal.set(Calendar.SECOND, 0); cal.set(Calendar.HOUR_OF_DAY, 0); cal.set(Calendar.MINUTE, 0); cal.set(Calendar.SECOND, 0);
//}

//@Test
//public void modify() { final Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR, 280000000); cal.set(Calendar.MINUTE, 0); cal.set(Calendar.SECOND, 0); cal.set(Calendar.MILLISECOND, 0); cal.set(Calendar.HOUR_OF_DAY, 0); cal.set(Calendar.MINUTE, 0); cal.set(Calendar.SECOND, 0); cal.set(Calendar.MILLISECOND, 0); cal.set(Calendar.HOUR_OF_DAY, 0); cal.set(Calendar.MINUTE, 0); cal.set(Calendar.SECOND, 0); cal.set(Calendar.MILLISECOND, 0);
//}

@Test
public void testModify671() {__CLR4_4_1gm8gm8ldni851z.R.globalSliceStart(getClass().getName(),21564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ahl5hxgn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gm8gm8ldni851z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gm8gm8ldni851z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testModify671",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ahl5hxgn0(){try{__CLR4_4_1gm8gm8ldni851z.R.inc(21564); __CLR4_4_1gm8gm8ldni851z.R.inc(21565);final Calendar cal = Calendar.getInstance(); __CLR4_4_1gm8gm8ldni851z.R.inc(21566);cal.set(Calendar.YEAR, 280000000); __CLR4_4_1gm8gm8ldni851z.R.inc(21567);cal.set(Calendar.MONTH, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21568);cal.set(Calendar.DAY_OF_MONTH, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21569);cal.set(Calendar.HOUR_OF_DAY, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21570);cal.set(Calendar.MINUTE, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21571);cal.set(Calendar.SECOND, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21572);cal.set(Calendar.MILLISECOND, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21573);cal.set(Calendar.SECOND, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21574);cal.set(Calendar.MILLISECOND, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21575);cal.set(Calendar.SECOND, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21576);cal.set(Calendar.SECOND, 1); __CLR4_4_1gm8gm8ldni851z.R.inc(21577);cal.set(Calendar.SECOND, 1);
}finally{__CLR4_4_1gm8gm8ldni851z.R.flushNeeded();}}

    
    
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
    protected void baseRoundTest(final Date roundedUpDate, final Date roundedDownDate, final Date lastRoundDownDate, final int calendarField) {try{__CLR4_4_1gm8gm8ldni851z.R.inc(21578);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21579);final Date firstRoundUpDate = DateUtils.addMilliseconds(lastRoundDownDate, 1);
        
        //Date-comparison
        __CLR4_4_1gm8gm8ldni851z.R.inc(21580);assertEquals(roundedDownDate, DateUtils.round(roundedDownDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21581);assertEquals(roundedUpDate, DateUtils.round(roundedUpDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21582);assertEquals(roundedDownDate, DateUtils.round(lastRoundDownDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21583);assertEquals(roundedUpDate, DateUtils.round(firstRoundUpDate, calendarField));
        
        //Calendar-initiations
        __CLR4_4_1gm8gm8ldni851z.R.inc(21584);Calendar roundedUpCalendar, roundedDownCalendar, lastRoundDownCalendar, firstRoundUpCalendar; 
        __CLR4_4_1gm8gm8ldni851z.R.inc(21585);roundedDownCalendar = Calendar.getInstance();
        __CLR4_4_1gm8gm8ldni851z.R.inc(21586);roundedUpCalendar = Calendar.getInstance();
        __CLR4_4_1gm8gm8ldni851z.R.inc(21587);lastRoundDownCalendar = Calendar.getInstance();
        __CLR4_4_1gm8gm8ldni851z.R.inc(21588);firstRoundUpCalendar = Calendar.getInstance();
        __CLR4_4_1gm8gm8ldni851z.R.inc(21589);roundedDownCalendar.setTime(roundedDownDate);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21590);roundedUpCalendar.setTime(roundedUpDate);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21591);lastRoundDownCalendar.setTime(lastRoundDownDate);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21592);firstRoundUpCalendar.setTime(firstRoundUpDate);

        //Calendar-comparison
        __CLR4_4_1gm8gm8ldni851z.R.inc(21593);assertEquals(roundedDownCalendar, DateUtils.round(roundedDownCalendar, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21594);assertEquals(roundedUpCalendar, DateUtils.round(roundedUpCalendar, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21595);assertEquals(roundedDownCalendar, DateUtils.round(lastRoundDownCalendar, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21596);assertEquals(roundedUpCalendar, DateUtils.round(firstRoundUpCalendar, calendarField));

        //Object-comparison
        __CLR4_4_1gm8gm8ldni851z.R.inc(21597);assertEquals(roundedDownDate, DateUtils.round((Object) roundedDownDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21598);assertEquals(roundedUpDate, DateUtils.round((Object) roundedUpDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21599);assertEquals(roundedDownDate, DateUtils.round((Object) lastRoundDownDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21600);assertEquals(roundedUpDate, DateUtils.round((Object) firstRoundUpDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21601);assertEquals(roundedDownDate, DateUtils.round((Object) roundedDownCalendar, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21602);assertEquals(roundedUpDate, DateUtils.round((Object) roundedUpCalendar, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21603);assertEquals(roundedDownDate, DateUtils.round((Object) lastRoundDownDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21604);assertEquals(roundedUpDate, DateUtils.round((Object) firstRoundUpDate, calendarField));
    }finally{__CLR4_4_1gm8gm8ldni851z.R.flushNeeded();}}
    
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
    protected void baseTruncateTest(final Date truncatedDate, final Date lastTruncateDate, final int calendarField) {try{__CLR4_4_1gm8gm8ldni851z.R.inc(21605);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21606);final Date nextTruncateDate = DateUtils.addMilliseconds(lastTruncateDate, 1);
        
        //Date-comparison
        __CLR4_4_1gm8gm8ldni851z.R.inc(21607);assertEquals("Truncating "+ fdf.format(truncatedDate) +" as Date with CalendarField-value "+ calendarField +" must return itself", truncatedDate, DateUtils.truncate(truncatedDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21608);assertEquals(truncatedDate, DateUtils.truncate(lastTruncateDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21609);assertFalse(fdf.format(lastTruncateDate) +" is not an extreme when truncating as Date with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate(nextTruncateDate, calendarField)));
        
        //Calendar-initiations
        __CLR4_4_1gm8gm8ldni851z.R.inc(21610);Calendar truncatedCalendar, lastTruncateCalendar, nextTruncateCalendar; 
        __CLR4_4_1gm8gm8ldni851z.R.inc(21611);truncatedCalendar = Calendar.getInstance();
        __CLR4_4_1gm8gm8ldni851z.R.inc(21612);lastTruncateCalendar = Calendar.getInstance();
        __CLR4_4_1gm8gm8ldni851z.R.inc(21613);nextTruncateCalendar = Calendar.getInstance();
        __CLR4_4_1gm8gm8ldni851z.R.inc(21614);truncatedCalendar.setTime(truncatedDate);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21615);lastTruncateCalendar.setTime(lastTruncateDate);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21616);nextTruncateCalendar.setTime(nextTruncateDate);

        //Calendar-comparison
        __CLR4_4_1gm8gm8ldni851z.R.inc(21617);assertEquals("Truncating "+ fdf.format(truncatedCalendar) +" as Calendar with CalendarField-value "+ calendarField +" must return itself", truncatedCalendar, DateUtils.truncate(truncatedCalendar, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21618);assertEquals(truncatedCalendar, DateUtils.truncate(lastTruncateCalendar, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21619);assertFalse(fdf.format(lastTruncateCalendar) +" is not an extreme when truncating as Calendar with CalendarField-value "+ calendarField, truncatedCalendar.equals(DateUtils.truncate(nextTruncateCalendar, calendarField)));

        //Object-comparison
        __CLR4_4_1gm8gm8ldni851z.R.inc(21620);assertEquals("Truncating "+ fdf.format(truncatedDate) +" as Date cast to Object with CalendarField-value "+ calendarField +" must return itself as Date", truncatedDate, DateUtils.truncate((Object) truncatedDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21621);assertEquals(truncatedDate, DateUtils.truncate((Object) lastTruncateDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21622);assertFalse(fdf.format(lastTruncateDate) +" is not an extreme when truncating as Date cast to Object with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate((Object) nextTruncateDate, calendarField)));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21623);assertEquals("Truncating "+ fdf.format(truncatedCalendar) +" as Calendar cast to Object with CalendarField-value "+ calendarField +" must return itself as Date", truncatedDate, DateUtils.truncate((Object) truncatedCalendar, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21624);assertEquals(truncatedDate, DateUtils.truncate((Object) lastTruncateCalendar, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21625);assertFalse(fdf.format(lastTruncateCalendar) +" is not an extreme when truncating as Calendar cast to Object with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate((Object) nextTruncateCalendar, calendarField)));
    }finally{__CLR4_4_1gm8gm8ldni851z.R.flushNeeded();}}
    
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
    protected void roundToJanuaryFirst(final Date minDate, final Date maxDate, final int calendarField) {try{__CLR4_4_1gm8gm8ldni851z.R.inc(21626);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21627);assertEquals("Rounding "+ fdf.format(januaryOneDate) +" as Date with CalendarField-value "+ calendarField +" must return itself", januaryOneDate, DateUtils.round(januaryOneDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21628);assertEquals(januaryOneDate, DateUtils.round(minDate, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21629);assertEquals(januaryOneDate, DateUtils.round(maxDate, calendarField));
        
        __CLR4_4_1gm8gm8ldni851z.R.inc(21630);final Calendar minCalendar = Calendar.getInstance();
        __CLR4_4_1gm8gm8ldni851z.R.inc(21631);minCalendar.setTime(minDate);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21632);final Calendar maxCalendar = Calendar.getInstance();
        __CLR4_4_1gm8gm8ldni851z.R.inc(21633);maxCalendar.setTime(maxDate);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21634);assertEquals("Rounding "+ fdf.format(januaryOneCalendar) +" as Date with CalendarField-value "+ calendarField +" must return itself", januaryOneCalendar, DateUtils.round(januaryOneCalendar, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21635);assertEquals(januaryOneCalendar, DateUtils.round(minCalendar, calendarField));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21636);assertEquals(januaryOneCalendar, DateUtils.round(maxCalendar, calendarField));

        __CLR4_4_1gm8gm8ldni851z.R.inc(21637);final Date toPrevRoundDate = DateUtils.addMilliseconds(minDate, -1);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21638);final Date toNextRoundDate = DateUtils.addMilliseconds(maxDate, 1);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21639);assertFalse(fdf.format(minDate) +" is not an lower-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toPrevRoundDate, calendarField)));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21640);assertFalse(fdf.format(maxDate) +" is not an upper-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toNextRoundDate, calendarField)));
        
        __CLR4_4_1gm8gm8ldni851z.R.inc(21641);final Calendar toPrevRoundCalendar = Calendar.getInstance();
        __CLR4_4_1gm8gm8ldni851z.R.inc(21642);toPrevRoundCalendar.setTime(toPrevRoundDate);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21643);final Calendar toNextRoundCalendar = Calendar.getInstance();
        __CLR4_4_1gm8gm8ldni851z.R.inc(21644);toNextRoundCalendar.setTime(toNextRoundDate);
        __CLR4_4_1gm8gm8ldni851z.R.inc(21645);assertFalse(fdf.format(minCalendar) +" is not an lower-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toPrevRoundDate, calendarField)));
        __CLR4_4_1gm8gm8ldni851z.R.inc(21646);assertFalse(fdf.format(maxCalendar) +" is not an upper-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toNextRoundDate, calendarField)));
    }finally{__CLR4_4_1gm8gm8ldni851z.R.flushNeeded();}}
}
