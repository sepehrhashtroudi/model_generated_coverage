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
public class DateUtilsTest {static class __CLR4_4_1ga3ga3ldnigh0h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,21198,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long MILLIS_TEST;
    static {try{__CLR4_4_1ga3ga3ldnigh0h.R.inc(21099);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21100);final GregorianCalendar cal = new GregorianCalendar(2000, 6, 5, 4, 3, 2);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21101);cal.set(Calendar.MILLISECOND, 1);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21102);MILLIS_TEST = cal.getTime().getTime();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21103);System.out.println("DateUtilsTest: Default Locale="+Locale.getDefault());
    }finally{__CLR4_4_1ga3ga3ldnigh0h.R.flushNeeded();}}

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
    public void setUp() throws Exception {try{__CLR4_4_1ga3ga3ldnigh0h.R.inc(21104);


        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21105);dateParser = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21106);dateTimeParser = new SimpleDateFormat("MMM dd, yyyy H:mm:ss.SSS", Locale.ENGLISH);

        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21107);dateAmPm1 = dateTimeParser.parse("February 3, 2002 01:10:00.000");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21108);dateAmPm2 = dateTimeParser.parse("February 3, 2002 11:10:00.000");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21109);dateAmPm3 = dateTimeParser.parse("February 3, 2002 13:10:00.000");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21110);dateAmPm4 = dateTimeParser.parse("February 3, 2002 19:10:00.000");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21111);date0 = dateTimeParser.parse("February 3, 2002 12:34:56.789");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21112);date1 = dateTimeParser.parse("February 12, 2002 12:34:56.789");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21113);date2 = dateTimeParser.parse("November 18, 2001 1:23:11.321");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21114);defaultZone = TimeZone.getDefault();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21115);zone = TimeZone.getTimeZone("MET");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21116);TimeZone.setDefault(zone);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21117);dateTimeParser.setTimeZone(zone);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21118);date3 = dateTimeParser.parse("March 30, 2003 05:30:45.000");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21119);date4 = dateTimeParser.parse("March 30, 2003 01:10:00.000");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21120);date5 = dateTimeParser.parse("March 30, 2003 01:40:00.000");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21121);date6 = dateTimeParser.parse("March 30, 2003 02:10:00.000");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21122);date7 = dateTimeParser.parse("March 30, 2003 02:40:00.000");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21123);date8 = dateTimeParser.parse("October 26, 2003 05:30:45.000");
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21124);dateTimeParser.setTimeZone(defaultZone);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21125);TimeZone.setDefault(defaultZone);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21126);calAmPm1 = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21127);calAmPm1.setTime(dateAmPm1);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21128);calAmPm2 = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21129);calAmPm2.setTime(dateAmPm2);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21130);calAmPm3 = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21131);calAmPm3.setTime(dateAmPm3);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21132);calAmPm4 = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21133);calAmPm4.setTime(dateAmPm4);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21134);cal1 = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21135);cal1.setTime(date1);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21136);cal2 = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21137);cal2.setTime(date2);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21138);TimeZone.setDefault(zone);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21139);cal3 = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21140);cal3.setTime(date3);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21141);cal4 = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21142);cal4.setTime(date4);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21143);cal5 = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21144);cal5.setTime(date5);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21145);cal6 = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21146);cal6.setTime(date6);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21147);cal7 = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21148);cal7.setTime(date7);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21149);cal8 = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21150);cal8.setTime(date8);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21151);TimeZone.setDefault(defaultZone);
    }finally{__CLR4_4_1ga3ga3ldnigh0h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    
    
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
    private void assertDate(final Date date, final int year, final int month, final int day, final int hour, final int min, final int sec, final int mil) throws Exception {try{__CLR4_4_1ga3ga3ldnigh0h.R.inc(21152);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21153);final GregorianCalendar cal = new GregorianCalendar();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21154);cal.setTime(date);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21155);assertEquals(year, cal.get(Calendar.YEAR));
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21156);assertEquals(month, cal.get(Calendar.MONTH));
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21157);assertEquals(day, cal.get(Calendar.DAY_OF_MONTH));
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21158);assertEquals(hour, cal.get(Calendar.HOUR_OF_DAY));
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21159);assertEquals(min, cal.get(Calendar.MINUTE));
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21160);assertEquals(sec, cal.get(Calendar.SECOND));
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21161);assertEquals(mil, cal.get(Calendar.MILLISECOND));
    }finally{__CLR4_4_1ga3ga3ldnigh0h.R.flushNeeded();}}

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
    private static void assertWeekIterator(final Iterator<?> it, final Calendar start) {try{__CLR4_4_1ga3ga3ldnigh0h.R.inc(21162);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21163);final Calendar end = (Calendar) start.clone();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21164);end.add(Calendar.DATE, 6);

        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21165);assertWeekIterator(it, start, end);
    }finally{__CLR4_4_1ga3ga3ldnigh0h.R.flushNeeded();}}

    /**
     * Convenience method for when working with Date objects
     */
    private static void assertWeekIterator(final Iterator<?> it, final Date start, final Date end) {try{__CLR4_4_1ga3ga3ldnigh0h.R.inc(21166);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21167);final Calendar calStart = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21168);calStart.setTime(start);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21169);final Calendar calEnd = Calendar.getInstance();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21170);calEnd.setTime(end);

        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21171);assertWeekIterator(it, calStart, calEnd);
    }finally{__CLR4_4_1ga3ga3ldnigh0h.R.flushNeeded();}}

    /**
     * This checks that this is a 7 divisble iterator of Calendar objects
     * that are dates (no time), and exactly 1 day spaced after each other
     * (in addition to the proper start and stop dates)
     */
    private static void assertWeekIterator(final Iterator<?> it, final Calendar start, final Calendar end) {try{__CLR4_4_1ga3ga3ldnigh0h.R.inc(21172);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21173);Calendar cal = (Calendar) it.next();
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21174);assertCalendarsEquals("", start, cal, 0);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21175);Calendar last = null;
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21176);int count = 1;
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21177);while ((((it.hasNext())&&(__CLR4_4_1ga3ga3ldnigh0h.R.iget(21178)!=0|true))||(__CLR4_4_1ga3ga3ldnigh0h.R.iget(21179)==0&false))) {{
            //Check this is just a date (no time component)
            __CLR4_4_1ga3ga3ldnigh0h.R.inc(21180);assertCalendarsEquals("", cal, DateUtils.truncate(cal, Calendar.DATE), 0);

            __CLR4_4_1ga3ga3ldnigh0h.R.inc(21181);last = cal;
            __CLR4_4_1ga3ga3ldnigh0h.R.inc(21182);cal = (Calendar) it.next();
            __CLR4_4_1ga3ga3ldnigh0h.R.inc(21183);count++;

            //Check that this is one day more than the last date
            __CLR4_4_1ga3ga3ldnigh0h.R.inc(21184);last.add(Calendar.DATE, 1);
            __CLR4_4_1ga3ga3ldnigh0h.R.inc(21185);assertCalendarsEquals("", last, cal, 0);
        }
        }__CLR4_4_1ga3ga3ldnigh0h.R.inc(21186);if ((((count % 7 != 0)&&(__CLR4_4_1ga3ga3ldnigh0h.R.iget(21187)!=0|true))||(__CLR4_4_1ga3ga3ldnigh0h.R.iget(21188)==0&false))) {{
            __CLR4_4_1ga3ga3ldnigh0h.R.inc(21189);throw new AssertionFailedError("There were " + count + " days in this iterator");
        }
        }__CLR4_4_1ga3ga3ldnigh0h.R.inc(21190);assertCalendarsEquals("", end, cal, 0);
    }finally{__CLR4_4_1ga3ga3ldnigh0h.R.flushNeeded();}}

    /**
     * Used to check that Calendar objects are close enough
     * delta is in milliseconds
     */
    private static void assertCalendarsEquals(final String message, final Calendar cal1, final Calendar cal2, final long delta) {try{__CLR4_4_1ga3ga3ldnigh0h.R.inc(21191);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21192);if ((((Math.abs(cal1.getTime().getTime() - cal2.getTime().getTime()) > delta)&&(__CLR4_4_1ga3ga3ldnigh0h.R.iget(21193)!=0|true))||(__CLR4_4_1ga3ga3ldnigh0h.R.iget(21194)==0&false))) {{
            __CLR4_4_1ga3ga3ldnigh0h.R.inc(21195);throw new AssertionFailedError(
                    message + " expected " + cal1.getTime() + " but got " + cal2.getTime());
        }
    }}finally{__CLR4_4_1ga3ga3ldnigh0h.R.flushNeeded();}}

    void warn(final String msg) {try{__CLR4_4_1ga3ga3ldnigh0h.R.inc(21196);
        __CLR4_4_1ga3ga3ldnigh0h.R.inc(21197);System.err.println(msg);
    }finally{__CLR4_4_1ga3ga3ldnigh0h.R.flushNeeded();}}
}

