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

import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;

import junit.framework.AssertionFailedError;

import org.apache.commons.lang3.SystemUtils;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.DateUtils}.
 *
 */
public class DateUtilsTest {static class __CLR4_4_1gpbgpbldni8526{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,21756,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long MILLIS_TEST;
    static {try{__CLR4_4_1gpbgpbldni8526.R.inc(21647);
        __CLR4_4_1gpbgpbldni8526.R.inc(21648);final GregorianCalendar cal = new GregorianCalendar(2000, 6, 5, 4, 3, 2);
        __CLR4_4_1gpbgpbldni8526.R.inc(21649);cal.set(Calendar.MILLISECOND, 1);
        __CLR4_4_1gpbgpbldni8526.R.inc(21650);MILLIS_TEST = cal.getTime().getTime();
        __CLR4_4_1gpbgpbldni8526.R.inc(21651);System.out.println("DateUtilsTest: Default Locale="+Locale.getDefault());
    }finally{__CLR4_4_1gpbgpbldni8526.R.flushNeeded();}}

    DateFormat dateParser = null;
    DateFormat dateTimeParser = null;
    DateFormat timeZoneDateParser = null;
    Date dateAmPm1 = null;
    Date dateAmPm2 = null;
    Date dateAmPm3 = null;
    Date dateAmPm4 = null;
    Date date0 = null;
    Date date1 = null;
    Date date2 = null;
    Date date3 = null;
    Date date4 = null;
    Date date5 = null;
    Date date6 = null;
    Date date7 = null;
    Date date8 = null;
    Calendar calAmPm1 = null;
    Calendar calAmPm2 = null;
    Calendar calAmPm3 = null;
    Calendar calAmPm4 = null;
    Calendar cal1 = null;
    Calendar cal2 = null;
    Calendar cal3 = null;
    Calendar cal4 = null;
    Calendar cal5 = null;
    Calendar cal6 = null;
    Calendar cal7 = null;
    Calendar cal8 = null;
    TimeZone zone = null;
    TimeZone defaultZone = null;


    @Before
    public void setUp() throws Exception {try{__CLR4_4_1gpbgpbldni8526.R.inc(21652);


        __CLR4_4_1gpbgpbldni8526.R.inc(21653);dateParser = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        __CLR4_4_1gpbgpbldni8526.R.inc(21654);dateTimeParser = new SimpleDateFormat("MMM dd, yyyy H:mm:ss.SSS", Locale.ENGLISH);

        __CLR4_4_1gpbgpbldni8526.R.inc(21655);dateAmPm1 = dateTimeParser.parse("February 3, 2002 01:10:00.000");
        __CLR4_4_1gpbgpbldni8526.R.inc(21656);dateAmPm2 = dateTimeParser.parse("February 3, 2002 11:10:00.000");
        __CLR4_4_1gpbgpbldni8526.R.inc(21657);dateAmPm3 = dateTimeParser.parse("February 3, 2002 13:10:00.000");
        __CLR4_4_1gpbgpbldni8526.R.inc(21658);dateAmPm4 = dateTimeParser.parse("February 3, 2002 19:10:00.000");
        __CLR4_4_1gpbgpbldni8526.R.inc(21659);date0 = dateTimeParser.parse("February 3, 2002 12:34:56.789");
        __CLR4_4_1gpbgpbldni8526.R.inc(21660);date1 = dateTimeParser.parse("February 12, 2002 12:34:56.789");
        __CLR4_4_1gpbgpbldni8526.R.inc(21661);date2 = dateTimeParser.parse("November 18, 2001 1:23:11.321");
        __CLR4_4_1gpbgpbldni8526.R.inc(21662);defaultZone = TimeZone.getDefault();
        __CLR4_4_1gpbgpbldni8526.R.inc(21663);zone = TimeZone.getTimeZone("MET");
        __CLR4_4_1gpbgpbldni8526.R.inc(21664);TimeZone.setDefault(zone);
        __CLR4_4_1gpbgpbldni8526.R.inc(21665);dateTimeParser.setTimeZone(zone);
        __CLR4_4_1gpbgpbldni8526.R.inc(21666);date3 = dateTimeParser.parse("March 30, 2003 05:30:45.000");
        __CLR4_4_1gpbgpbldni8526.R.inc(21667);date4 = dateTimeParser.parse("March 30, 2003 01:10:00.000");
        __CLR4_4_1gpbgpbldni8526.R.inc(21668);date5 = dateTimeParser.parse("March 30, 2003 01:40:00.000");
        __CLR4_4_1gpbgpbldni8526.R.inc(21669);date6 = dateTimeParser.parse("March 30, 2003 02:10:00.000");
        __CLR4_4_1gpbgpbldni8526.R.inc(21670);date7 = dateTimeParser.parse("March 30, 2003 02:40:00.000");
        __CLR4_4_1gpbgpbldni8526.R.inc(21671);date8 = dateTimeParser.parse("October 26, 2003 05:30:45.000");
        __CLR4_4_1gpbgpbldni8526.R.inc(21672);dateTimeParser.setTimeZone(defaultZone);
        __CLR4_4_1gpbgpbldni8526.R.inc(21673);TimeZone.setDefault(defaultZone);
        __CLR4_4_1gpbgpbldni8526.R.inc(21674);calAmPm1 = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21675);calAmPm1.setTime(dateAmPm1);
        __CLR4_4_1gpbgpbldni8526.R.inc(21676);calAmPm2 = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21677);calAmPm2.setTime(dateAmPm2);
        __CLR4_4_1gpbgpbldni8526.R.inc(21678);calAmPm3 = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21679);calAmPm3.setTime(dateAmPm3);
        __CLR4_4_1gpbgpbldni8526.R.inc(21680);calAmPm4 = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21681);calAmPm4.setTime(dateAmPm4);
        __CLR4_4_1gpbgpbldni8526.R.inc(21682);cal1 = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21683);cal1.setTime(date1);
        __CLR4_4_1gpbgpbldni8526.R.inc(21684);cal2 = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21685);cal2.setTime(date2);
        __CLR4_4_1gpbgpbldni8526.R.inc(21686);TimeZone.setDefault(zone);
        __CLR4_4_1gpbgpbldni8526.R.inc(21687);cal3 = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21688);cal3.setTime(date3);
        __CLR4_4_1gpbgpbldni8526.R.inc(21689);cal4 = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21690);cal4.setTime(date4);
        __CLR4_4_1gpbgpbldni8526.R.inc(21691);cal5 = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21692);cal5.setTime(date5);
        __CLR4_4_1gpbgpbldni8526.R.inc(21693);cal6 = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21694);cal6.setTime(date6);
        __CLR4_4_1gpbgpbldni8526.R.inc(21695);cal7 = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21696);cal7.setTime(date7);
        __CLR4_4_1gpbgpbldni8526.R.inc(21697);cal8 = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21698);cal8.setTime(date8);
        __CLR4_4_1gpbgpbldni8526.R.inc(21699);TimeZone.setDefault(defaultZone);
    }finally{__CLR4_4_1gpbgpbldni8526.R.flushNeeded();}}

    //-----------------------------------------------------------------------
@Test
public void testSetSeconds1052() throws ParseException {__CLR4_4_1gpbgpbldni8526.R.globalSliceStart(getClass().getName(),21700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jix57ygqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gpbgpbldni8526.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gpbgpbldni8526.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetSeconds1052",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jix57ygqs() throws ParseException{try{__CLR4_4_1gpbgpbldni8526.R.inc(21700); __CLR4_4_1gpbgpbldni8526.R.inc(21701);Date sec = DateUtils.parseDate("23:59:59", "US"); __CLR4_4_1gpbgpbldni8526.R.inc(21702);assertEquals(23, sec.getTime()); __CLR4_4_1gpbgpbldni8526.R.inc(21703);Date sec2 = DateUtils.parseDate("23:59:59", "US"); __CLR4_4_1gpbgpbldni8526.R.inc(21704);assertEquals(23, sec2.getTime()); __CLR4_4_1gpbgpbldni8526.R.inc(21705);Date sec3 = DateUtils.parseDate("23:59:59", "US"); __CLR4_4_1gpbgpbldni8526.R.inc(21706);assertEquals(23, sec3.getTime()); __CLR4_4_1gpbgpbldni8526.R.inc(21707);Date sec4 = DateUtils.parseDate("23:59:59", "US"); __CLR4_4_1gpbgpbldni8526.R.inc(21708);assertEquals(23, sec4.getTime()); __CLR4_4_1gpbgpbldni8526.R.inc(21709);Date sec5 = DateUtils.parseDate("23:59:59", "US");
}finally{__CLR4_4_1gpbgpbldni8526.R.flushNeeded();}}

    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    // LANG-486
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    // -----------------------------------------------------------------------
    

    // -----------------------------------------------------------------------
    

    // -----------------------------------------------------------------------
    

    // -----------------------------------------------------------------------
    

    // -----------------------------------------------------------------------
    

    // -----------------------------------------------------------------------
    

    // -----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void assertDate(final Date date, final int year, final int month, final int day, final int hour, final int min, final int sec, final int mil) throws Exception {try{__CLR4_4_1gpbgpbldni8526.R.inc(21710);
        __CLR4_4_1gpbgpbldni8526.R.inc(21711);final GregorianCalendar cal = new GregorianCalendar();
        __CLR4_4_1gpbgpbldni8526.R.inc(21712);cal.setTime(date);
        __CLR4_4_1gpbgpbldni8526.R.inc(21713);assertEquals(year, cal.get(Calendar.YEAR));
        __CLR4_4_1gpbgpbldni8526.R.inc(21714);assertEquals(month, cal.get(Calendar.MONTH));
        __CLR4_4_1gpbgpbldni8526.R.inc(21715);assertEquals(day, cal.get(Calendar.DAY_OF_MONTH));
        __CLR4_4_1gpbgpbldni8526.R.inc(21716);assertEquals(hour, cal.get(Calendar.HOUR_OF_DAY));
        __CLR4_4_1gpbgpbldni8526.R.inc(21717);assertEquals(min, cal.get(Calendar.MINUTE));
        __CLR4_4_1gpbgpbldni8526.R.inc(21718);assertEquals(sec, cal.get(Calendar.SECOND));
        __CLR4_4_1gpbgpbldni8526.R.inc(21719);assertEquals(mil, cal.get(Calendar.MILLISECOND));
    }finally{__CLR4_4_1gpbgpbldni8526.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Tests various values with the round method
     */
    

    /**
     * Tests the Changes Made by LANG-346 to the DateUtils.modify() private method invoked
     * by DateUtils.round().
     */
    

    /**
     * Tests various values with the trunc method
     */
    

    /**
     * Tests for LANG-59
     *
     * see http://issues.apache.org/jira/browse/LANG-59
     */
    

    // http://issues.apache.org/jira/browse/LANG-530
    
    
    /**
     * Tests various values with the ceiling method
     */
    

    /**
     * Tests the iterator exceptions
     */
    

    /**
     * Tests the calendar iterator for week ranges
     */
    
            
    /**
     * Tests the calendar iterator for month-based ranges
     */
    

    

    // Parse German date with English Locale
    

    

    // Parse English date with German Locale
    
    
    // Parse German date with English Locale, specifying German Locale override
    
    
    /**
     * This checks that this is a 7 element iterator of Calendar objects
     * that are dates (no time), and exactly 1 day spaced after each other.
     */
    private static void assertWeekIterator(final Iterator<?> it, final Calendar start) {try{__CLR4_4_1gpbgpbldni8526.R.inc(21720);
        __CLR4_4_1gpbgpbldni8526.R.inc(21721);final Calendar end = (Calendar) start.clone();
        __CLR4_4_1gpbgpbldni8526.R.inc(21722);end.add(Calendar.DATE, 6);

        __CLR4_4_1gpbgpbldni8526.R.inc(21723);assertWeekIterator(it, start, end);
    }finally{__CLR4_4_1gpbgpbldni8526.R.flushNeeded();}}

    /**
     * Convenience method for when working with Date objects
     */
    private static void assertWeekIterator(final Iterator<?> it, final Date start, final Date end) {try{__CLR4_4_1gpbgpbldni8526.R.inc(21724);
        __CLR4_4_1gpbgpbldni8526.R.inc(21725);final Calendar calStart = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21726);calStart.setTime(start);
        __CLR4_4_1gpbgpbldni8526.R.inc(21727);final Calendar calEnd = Calendar.getInstance();
        __CLR4_4_1gpbgpbldni8526.R.inc(21728);calEnd.setTime(end);

        __CLR4_4_1gpbgpbldni8526.R.inc(21729);assertWeekIterator(it, calStart, calEnd);
    }finally{__CLR4_4_1gpbgpbldni8526.R.flushNeeded();}}

    /**
     * This checks that this is a 7 divisble iterator of Calendar objects
     * that are dates (no time), and exactly 1 day spaced after each other
     * (in addition to the proper start and stop dates)
     */
    private static void assertWeekIterator(final Iterator<?> it, final Calendar start, final Calendar end) {try{__CLR4_4_1gpbgpbldni8526.R.inc(21730);
        __CLR4_4_1gpbgpbldni8526.R.inc(21731);Calendar cal = (Calendar) it.next();
        __CLR4_4_1gpbgpbldni8526.R.inc(21732);assertCalendarsEquals("", start, cal, 0);
        __CLR4_4_1gpbgpbldni8526.R.inc(21733);Calendar last = null;
        __CLR4_4_1gpbgpbldni8526.R.inc(21734);int count = 1;
        __CLR4_4_1gpbgpbldni8526.R.inc(21735);while ((((it.hasNext())&&(__CLR4_4_1gpbgpbldni8526.R.iget(21736)!=0|true))||(__CLR4_4_1gpbgpbldni8526.R.iget(21737)==0&false))) {{
            //Check this is just a date (no time component)
            __CLR4_4_1gpbgpbldni8526.R.inc(21738);assertCalendarsEquals("", cal, DateUtils.truncate(cal, Calendar.DATE), 0);

            __CLR4_4_1gpbgpbldni8526.R.inc(21739);last = cal;
            __CLR4_4_1gpbgpbldni8526.R.inc(21740);cal = (Calendar) it.next();
            __CLR4_4_1gpbgpbldni8526.R.inc(21741);count++;

            //Check that this is one day more than the last date
            __CLR4_4_1gpbgpbldni8526.R.inc(21742);last.add(Calendar.DATE, 1);
            __CLR4_4_1gpbgpbldni8526.R.inc(21743);assertCalendarsEquals("", last, cal, 0);
        }
        }__CLR4_4_1gpbgpbldni8526.R.inc(21744);if ((((count % 7 != 0)&&(__CLR4_4_1gpbgpbldni8526.R.iget(21745)!=0|true))||(__CLR4_4_1gpbgpbldni8526.R.iget(21746)==0&false))) {{
            __CLR4_4_1gpbgpbldni8526.R.inc(21747);throw new AssertionFailedError("There were " + count + " days in this iterator");
        }
        }__CLR4_4_1gpbgpbldni8526.R.inc(21748);assertCalendarsEquals("", end, cal, 0);
    }finally{__CLR4_4_1gpbgpbldni8526.R.flushNeeded();}}

    /**
     * Used to check that Calendar objects are close enough
     * delta is in milliseconds
     */
    private static void assertCalendarsEquals(final String message, final Calendar cal1, final Calendar cal2, final long delta) {try{__CLR4_4_1gpbgpbldni8526.R.inc(21749);
        __CLR4_4_1gpbgpbldni8526.R.inc(21750);if ((((Math.abs(cal1.getTime().getTime() - cal2.getTime().getTime()) > delta)&&(__CLR4_4_1gpbgpbldni8526.R.iget(21751)!=0|true))||(__CLR4_4_1gpbgpbldni8526.R.iget(21752)==0&false))) {{
            __CLR4_4_1gpbgpbldni8526.R.inc(21753);throw new AssertionFailedError(
                    message + " expected " + cal1.getTime() + " but got " + cal2.getTime());
        }
    }}finally{__CLR4_4_1gpbgpbldni8526.R.flushNeeded();}}

    void warn(final String msg) {try{__CLR4_4_1gpbgpbldni8526.R.inc(21754);
        __CLR4_4_1gpbgpbldni8526.R.inc(21755);System.err.println(msg);
    }finally{__CLR4_4_1gpbgpbldni8526.R.flushNeeded();}}
}

