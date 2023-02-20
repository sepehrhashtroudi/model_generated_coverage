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
public class TestLocalTime_Constructors extends TestCase {static class __CLR4_4_1l5jl5jle6rcl76{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,27491,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1l5jl5jle6rcl76.R.inc(27415);
        __CLR4_4_1l5jl5jle6rcl76.R.inc(27416);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l5jl5jle6rcl76.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l5jl5jle6rcl76.R.inc(27417);
        __CLR4_4_1l5jl5jle6rcl76.R.inc(27418);return new TestSuite(TestLocalTime_Constructors.class);
    }finally{__CLR4_4_1l5jl5jle6rcl76.R.flushNeeded();}}

    public TestLocalTime_Constructors(String name) {
        super(name);__CLR4_4_1l5jl5jle6rcl76.R.inc(27420);try{__CLR4_4_1l5jl5jle6rcl76.R.inc(27419);
    }finally{__CLR4_4_1l5jl5jle6rcl76.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1l5jl5jle6rcl76.R.inc(27421);
        __CLR4_4_1l5jl5jle6rcl76.R.inc(27422);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1l5jl5jle6rcl76.R.inc(27423);zone = DateTimeZone.getDefault();
        __CLR4_4_1l5jl5jle6rcl76.R.inc(27424);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1l5jl5jle6rcl76.R.inc(27425);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1l5jl5jle6rcl76.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1l5jl5jle6rcl76.R.inc(27426);
        __CLR4_4_1l5jl5jle6rcl76.R.inc(27427);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1l5jl5jle6rcl76.R.inc(27428);DateTimeZone.setDefault(zone);
        __CLR4_4_1l5jl5jle6rcl76.R.inc(27429);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1l5jl5jle6rcl76.R.inc(27430);zone = null;
    }finally{__CLR4_4_1l5jl5jle6rcl76.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */

public void testConstructor_ObjectString_DateTimeZoneNewYork132() throws Throwable {__CLR4_4_1l5jl5jle6rcl76.R.globalSliceStart(getClass().getName(),27431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182j8yvl5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l5jl5jle6rcl76.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l5jl5jle6rcl76.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString_DateTimeZoneNewYork132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182j8yvl5z() throws Throwable{try{__CLR4_4_1l5jl5jle6rcl76.R.inc(27431); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27432);LocalTime test = new LocalTime("04:20", NEW_YORK); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27433);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27434);assertEquals(4, test.getHourOfDay()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27435);assertEquals(20, test.getMinuteOfHour()); 
 }finally{__CLR4_4_1l5jl5jle6rcl76.R.flushNeeded();}} 


public void testConstructor_DateTimeZone946() throws Throwable {__CLR4_4_1l5jl5jle6rcl76.R.globalSliceStart(getClass().getName(),27436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1487q84l64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l5jl5jle6rcl76.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l5jl5jle6rcl76.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_DateTimeZone946",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1487q84l64() throws Throwable{try{__CLR4_4_1l5jl5jle6rcl76.R.inc(27436); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27437);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27438);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27439);LocalTime test = new LocalTime(LONDON); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27440);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27441);assertEquals(23, test.getHourOfDay()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27442);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27443);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27444);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27445);assertEquals(test, LocalTime.now(LONDON)); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27446);test = new LocalTime(PARIS); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27447);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27448);assertEquals(0, test.getHourOfDay()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27449);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27450);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27451);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27452);assertEquals(test, LocalTime.now(PARIS)); 
 }finally{__CLR4_4_1l5jl5jle6rcl76.R.flushNeeded();}} 


public void testFactoryMillisOfDay_long947() throws Throwable {__CLR4_4_1l5jl5jle6rcl76.R.globalSliceStart(getClass().getName(),27453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14p629bl6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l5jl5jle6rcl76.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l5jl5jle6rcl76.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactoryMillisOfDay_long947",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14p629bl6l() throws Throwable{try{__CLR4_4_1l5jl5jle6rcl76.R.inc(27453); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27454);LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27455);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27456);assertEquals(1, test.getHourOfDay()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27457);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27458);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27459);assertEquals(4, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1l5jl5jle6rcl76.R.flushNeeded();}} 


public void testFactory_FromCalendarFields_Calendar948() throws Exception {__CLR4_4_1l5jl5jle6rcl76.R.globalSliceStart(getClass().getName(),27460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ro9v1rl6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l5jl5jle6rcl76.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l5jl5jle6rcl76.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromCalendarFields_Calendar948",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ro9v1rl6s() throws Exception{try{__CLR4_4_1l5jl5jle6rcl76.R.inc(27460); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27461);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27462);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27463);LocalTime expected = new LocalTime(4, 5, 6, 7); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27464);assertEquals(expected, LocalTime.fromCalendarFields(cal)); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27465);try { 
         __CLR4_4_1l5jl5jle6rcl76.R.inc(27466);LocalTime.fromCalendarFields((Calendar) null); 
         __CLR4_4_1l5jl5jle6rcl76.R.inc(27467);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l5jl5jle6rcl76.R.flushNeeded();}} 


public void testFactory_FromDateFields_after1970949() throws Exception {__CLR4_4_1l5jl5jle6rcl76.R.globalSliceStart(getClass().getName(),27468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xohpldl70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l5jl5jle6rcl76.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l5jl5jle6rcl76.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_after1970949",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xohpldl70() throws Exception{try{__CLR4_4_1l5jl5jle6rcl76.R.inc(27468); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27469);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27470);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27471);LocalTime expected = new LocalTime(4, 5, 6, 7); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27472);assertEquals(expected, LocalTime.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1l5jl5jle6rcl76.R.flushNeeded();}} 


public void testConstructor_long_DateTimeZone_2952() throws Throwable {__CLR4_4_1l5jl5jle6rcl76.R.globalSliceStart(getClass().getName(),27473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1450zt5l75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l5jl5jle6rcl76.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l5jl5jle6rcl76.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long_DateTimeZone_2952",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1450zt5l75() throws Throwable{try{__CLR4_4_1l5jl5jle6rcl76.R.inc(27473); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27474);DateTime dt = new DateTime(2007, 6, 9, 1, 2, 3, 4, PARIS); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27475);DateTime dtUTC = new DateTime(1970, 1, 1, 1, 2, 3, 4, DateTimeZone.UTC); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27476);LocalTime test = new LocalTime(dt.getMillis(), PARIS); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27477);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27478);assertEquals(1, test.getHourOfDay()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27479);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27480);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27481);assertEquals(4, test.getMillisOfSecond()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27482);assertEquals(dtUTC.getMillis(), test.getLocalMillis()); 
 }finally{__CLR4_4_1l5jl5jle6rcl76.R.flushNeeded();}} 


public void testConstructor_ObjectLocalTime954() throws Throwable {__CLR4_4_1l5jl5jle6rcl76.R.globalSliceStart(getClass().getName(),27483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11d0hctl7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l5jl5jle6rcl76.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l5jl5jle6rcl76.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectLocalTime954",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11d0hctl7f() throws Throwable{try{__CLR4_4_1l5jl5jle6rcl76.R.inc(27483); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27484);LocalTime time = new LocalTime(10, 20, 30, 40, BUDDHIST_UTC); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27485);LocalTime test = new LocalTime(time); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27486);assertEquals(BUDDHIST_UTC, test.getChronology()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27487);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27488);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27489);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1l5jl5jle6rcl76.R.inc(27490);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1l5jl5jle6rcl76.R.flushNeeded();}} 

    

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
