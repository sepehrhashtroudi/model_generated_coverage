/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Constructors extends TestCase {static class __CLR4_4_1l7gl7gle6qsf0j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,27568,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final JulianChronology JULIAN_LONDON = JulianChronology.getInstance(LONDON);
    private static final JulianChronology JULIAN_PARIS = JulianChronology.getInstance(PARIS);
    private static final JulianChronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_LONDON = LONDON.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;

    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27484);
        __CLR4_4_1l7gl7gle6qsf0j.R.inc(27485);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27486);
        __CLR4_4_1l7gl7gle6qsf0j.R.inc(27487);return new TestSuite(TestLocalTime_Constructors.class);
    }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}}

    public TestLocalTime_Constructors(String name) {
        super(name);__CLR4_4_1l7gl7gle6qsf0j.R.inc(27489);try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27488);
    }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27490);
        __CLR4_4_1l7gl7gle6qsf0j.R.inc(27491);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1l7gl7gle6qsf0j.R.inc(27492);zone = DateTimeZone.getDefault();
        __CLR4_4_1l7gl7gle6qsf0j.R.inc(27493);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1l7gl7gle6qsf0j.R.inc(27494);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27495);
        __CLR4_4_1l7gl7gle6qsf0j.R.inc(27496);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1l7gl7gle6qsf0j.R.inc(27497);DateTimeZone.setDefault(zone);
        __CLR4_4_1l7gl7gle6qsf0j.R.inc(27498);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1l7gl7gle6qsf0j.R.inc(27499);zone = null;
    }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */

public void testConstructor942() throws Throwable {__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceStart(getClass().getName(),27500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1omgwyel7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7gl7gle6qsf0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor942",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1omgwyel7w() throws Throwable{try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27500); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27501);LocalTime test = new LocalTime(); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27502);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27503);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27504);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27505);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27506);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27507);assertEquals(test, LocalTime.now()); 
 }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}} 


public void testConstructor_DateTimeZone943() throws Throwable {__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceStart(getClass().getName(),27508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15is65bl84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7gl7gle6qsf0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_DateTimeZone943",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15is65bl84() throws Throwable{try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27508); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27509);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27510);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27511);LocalTime test = new LocalTime(LONDON); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27512);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27513);assertEquals(23, test.getHourOfDay()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27514);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27515);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27516);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27517);assertEquals(test, LocalTime.now(LONDON)); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27518);test = new LocalTime(PARIS); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27519);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27520);assertEquals(0, test.getHourOfDay()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27521);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27522);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27523);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27524);assertEquals(test, LocalTime.now(PARIS)); 
 }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}} 


public void testConstructor_Chronology944() throws Throwable {__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceStart(getClass().getName(),27525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyii5rl8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7gl7gle6qsf0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Chronology944",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyii5rl8l() throws Throwable{try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27525); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27526);LocalTime test = new LocalTime(JULIAN_LONDON); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27527);assertEquals(JULIAN_UTC, test.getChronology()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27528);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27529);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27530);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27531);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27532);assertEquals(test, LocalTime.now(JULIAN_LONDON)); 
 }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}} 


public void testParse_noFormatter945() throws Throwable {__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceStart(getClass().getName(),27533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bby39ml8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7gl7gle6qsf0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testParse_noFormatter945",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bby39ml8t() throws Throwable{try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27533); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27534);assertEquals(new LocalTime(1, 20), LocalTime.parse("01:20")); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27535);assertEquals(new LocalTime(14, 50, 30, 432), LocalTime.parse("14:50:30.432")); 
 }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}} 


public void testParse_formatter946() throws Throwable {__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceStart(getClass().getName(),27536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0pbzel8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7gl7gle6qsf0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testParse_formatter946",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0pbzel8w() throws Throwable{try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27536); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27537);DateTimeFormatter f = DateTimeFormat.forPattern("HH mm").withChronology(ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27538);assertEquals(new LocalTime(13, 30), LocalTime.parse("13 30", f)); 
 }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}} 


public void testFactoryMillisOfDay_long947() throws Throwable {__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceStart(getClass().getName(),27539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14p629bl8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7gl7gle6qsf0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactoryMillisOfDay_long947",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14p629bl8z() throws Throwable{try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27539); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27540);LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27541);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27542);assertEquals(1, test.getHourOfDay()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27543);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27544);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27545);assertEquals(4, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}} 


public void testFactory_FromCalendarFields_Calendar948() throws Exception {__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceStart(getClass().getName(),27546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ro9v1rl96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7gl7gle6qsf0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromCalendarFields_Calendar948",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ro9v1rl96() throws Exception{try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27546); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27547);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27548);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27549);LocalTime expected = new LocalTime(4, 5, 6, 7); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27550);assertEquals(expected, LocalTime.fromCalendarFields(cal)); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27551);try { 
         __CLR4_4_1l7gl7gle6qsf0j.R.inc(27552);LocalTime.fromCalendarFields((Calendar) null); 
         __CLR4_4_1l7gl7gle6qsf0j.R.inc(27553);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}} 


public void testFactory_FromDateFields_null949() throws Exception {__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceStart(getClass().getName(),27554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17lvq53l9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7gl7gle6qsf0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_null949",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17lvq53l9e() throws Exception{try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27554); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27555);try { 
         __CLR4_4_1l7gl7gle6qsf0j.R.inc(27556);LocalTime.fromDateFields((Date) null); 
         __CLR4_4_1l7gl7gle6qsf0j.R.inc(27557);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}} 


public void testConstructor_long_DateTimeZone_2952() throws Throwable {__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceStart(getClass().getName(),27558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1450zt5l9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7gl7gle6qsf0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7gl7gle6qsf0j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long_DateTimeZone_2952",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1450zt5l9i() throws Throwable{try{__CLR4_4_1l7gl7gle6qsf0j.R.inc(27558); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27559);DateTime dt = new DateTime(2007, 6, 9, 1, 2, 3, 4, PARIS); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27560);DateTime dtUTC = new DateTime(1970, 1, 1, 1, 2, 3, 4, DateTimeZone.UTC); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27561);LocalTime test = new LocalTime(dt.getMillis(), PARIS); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27562);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27563);assertEquals(1, test.getHourOfDay()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27564);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27565);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27566);assertEquals(4, test.getMillisOfSecond()); 
     __CLR4_4_1l7gl7gle6qsf0j.R.inc(27567);assertEquals(dtUTC.getMillis(), test.getLocalMillis()); 
 }finally{__CLR4_4_1l7gl7gle6qsf0j.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}
