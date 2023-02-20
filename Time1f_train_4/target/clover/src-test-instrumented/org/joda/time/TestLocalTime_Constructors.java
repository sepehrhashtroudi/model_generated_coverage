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
public class TestLocalTime_Constructors extends TestCase {static class __CLR4_4_1lallalle6rjclp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,27699,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lallalle6rjclp.R.inc(27597);
        __CLR4_4_1lallalle6rjclp.R.inc(27598);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lallalle6rjclp.R.inc(27599);
        __CLR4_4_1lallalle6rjclp.R.inc(27600);return new TestSuite(TestLocalTime_Constructors.class);
    }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}}

    public TestLocalTime_Constructors(String name) {
        super(name);__CLR4_4_1lallalle6rjclp.R.inc(27602);try{__CLR4_4_1lallalle6rjclp.R.inc(27601);
    }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lallalle6rjclp.R.inc(27603);
        __CLR4_4_1lallalle6rjclp.R.inc(27604);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lallalle6rjclp.R.inc(27605);zone = DateTimeZone.getDefault();
        __CLR4_4_1lallalle6rjclp.R.inc(27606);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lallalle6rjclp.R.inc(27607);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lallalle6rjclp.R.inc(27608);
        __CLR4_4_1lallalle6rjclp.R.inc(27609);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lallalle6rjclp.R.inc(27610);DateTimeZone.setDefault(zone);
        __CLR4_4_1lallalle6rjclp.R.inc(27611);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1lallalle6rjclp.R.inc(27612);zone = null;
    }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */

public void testConstructor_ObjectString_DateTimeZoneNewYork137() throws Throwable {__CLR4_4_1lallalle6rjclp.R.globalSliceStart(getClass().getName(),27613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obj2x8lb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lallalle6rjclp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lallalle6rjclp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString_DateTimeZoneNewYork137",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obj2x8lb1() throws Throwable{try{__CLR4_4_1lallalle6rjclp.R.inc(27613); 
     __CLR4_4_1lallalle6rjclp.R.inc(27614);LocalTime test = new LocalTime("04:20", NEW_YORK); 
     __CLR4_4_1lallalle6rjclp.R.inc(27615);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27616);assertEquals(4, test.getHourOfDay()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27617);assertEquals(20, test.getMinuteOfHour()); 
 }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}} 


public void testConstructor969() throws Throwable {__CLR4_4_1lallalle6rjclp.R.globalSliceStart(getClass().getName(),27618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z91mdhlb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lallalle6rjclp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lallalle6rjclp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor969",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z91mdhlb6() throws Throwable{try{__CLR4_4_1lallalle6rjclp.R.inc(27618); 
     __CLR4_4_1lallalle6rjclp.R.inc(27619);LocalTime test = new LocalTime(); 
     __CLR4_4_1lallalle6rjclp.R.inc(27620);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27621);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27622);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27623);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27624);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27625);assertEquals(test, LocalTime.now()); 
 }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}} 


public void testConstructor_DateTimeZone970() throws Throwable {__CLR4_4_1lallalle6rjclp.R.globalSliceStart(getClass().getName(),27626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uol4rlbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lallalle6rjclp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lallalle6rjclp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_DateTimeZone970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uol4rlbe() throws Throwable{try{__CLR4_4_1lallalle6rjclp.R.inc(27626); 
     __CLR4_4_1lallalle6rjclp.R.inc(27627);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON); 
     __CLR4_4_1lallalle6rjclp.R.inc(27628);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27629);LocalTime test = new LocalTime(LONDON); 
     __CLR4_4_1lallalle6rjclp.R.inc(27630);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27631);assertEquals(23, test.getHourOfDay()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27632);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27633);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27634);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27635);assertEquals(test, LocalTime.now(LONDON)); 
     __CLR4_4_1lallalle6rjclp.R.inc(27636);test = new LocalTime(PARIS); 
     __CLR4_4_1lallalle6rjclp.R.inc(27637);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27638);assertEquals(0, test.getHourOfDay()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27639);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27640);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27641);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27642);assertEquals(test, LocalTime.now(PARIS)); 
 }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}} 


public void testConstructor_Chronology971() throws Throwable {__CLR4_4_1lallalle6rjclp.R.globalSliceStart(getClass().getName(),27643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15l1qvplbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lallalle6rjclp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lallalle6rjclp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Chronology971",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15l1qvplbv() throws Throwable{try{__CLR4_4_1lallalle6rjclp.R.inc(27643); 
     __CLR4_4_1lallalle6rjclp.R.inc(27644);LocalTime test = new LocalTime(JULIAN_LONDON); 
     __CLR4_4_1lallalle6rjclp.R.inc(27645);assertEquals(JULIAN_UTC, test.getChronology()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27646);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27647);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27648);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27649);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27650);assertEquals(test, LocalTime.now(JULIAN_LONDON)); 
 }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}} 


public void testParse_noFormatter972() throws Throwable {__CLR4_4_1lallalle6rjclp.R.globalSliceStart(getClass().getName(),27651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12yhbzklc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lallalle6rjclp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lallalle6rjclp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testParse_noFormatter972",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12yhbzklc3() throws Throwable{try{__CLR4_4_1lallalle6rjclp.R.inc(27651); 
     __CLR4_4_1lallalle6rjclp.R.inc(27652);assertEquals(new LocalTime(1, 20), LocalTime.parse("01:20")); 
     __CLR4_4_1lallalle6rjclp.R.inc(27653);assertEquals(new LocalTime(14, 50, 30, 432), LocalTime.parse("14:50:30.432")); 
 }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}} 


public void testParse_formatter973() throws Throwable {__CLR4_4_1lallalle6rjclp.R.globalSliceStart(getClass().getName(),27654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n8kpclc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lallalle6rjclp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lallalle6rjclp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testParse_formatter973",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n8kpclc6() throws Throwable{try{__CLR4_4_1lallalle6rjclp.R.inc(27654); 
     __CLR4_4_1lallalle6rjclp.R.inc(27655);DateTimeFormatter f = DateTimeFormat.forPattern("HH mm").withChronology(ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1lallalle6rjclp.R.inc(27656);assertEquals(new LocalTime(13, 30), LocalTime.parse("13 30", f)); 
 }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}} 


public void testFactoryMillisOfDay_long974() throws Throwable {__CLR4_4_1lallalle6rjclp.R.globalSliceStart(getClass().getName(),27657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2mtjdlc9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lallalle6rjclp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lallalle6rjclp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactoryMillisOfDay_long974",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2mtjdlc9() throws Throwable{try{__CLR4_4_1lallalle6rjclp.R.inc(27657); 
     __CLR4_4_1lallalle6rjclp.R.inc(27658);LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1); 
     __CLR4_4_1lallalle6rjclp.R.inc(27659);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27660);assertEquals(1, test.getHourOfDay()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27661);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27662);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27663);assertEquals(4, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}} 


public void testFactory_FromCalendarFields_Calendar975() throws Exception {__CLR4_4_1lallalle6rjclp.R.globalSliceStart(getClass().getName(),27664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzdfnblcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lallalle6rjclp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lallalle6rjclp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromCalendarFields_Calendar975",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzdfnblcg() throws Exception{try{__CLR4_4_1lallalle6rjclp.R.inc(27664); 
     __CLR4_4_1lallalle6rjclp.R.inc(27665);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1lallalle6rjclp.R.inc(27666);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1lallalle6rjclp.R.inc(27667);LocalTime expected = new LocalTime(4, 5, 6, 7); 
     __CLR4_4_1lallalle6rjclp.R.inc(27668);assertEquals(expected, LocalTime.fromCalendarFields(cal)); 
     __CLR4_4_1lallalle6rjclp.R.inc(27669);try { 
         __CLR4_4_1lallalle6rjclp.R.inc(27670);LocalTime.fromCalendarFields((Calendar) null); 
         __CLR4_4_1lallalle6rjclp.R.inc(27671);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}} 


public void testFactory_FromDateFields_after1970976() throws Exception {__CLR4_4_1lallalle6rjclp.R.globalSliceStart(getClass().getName(),27672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pb0ybblco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lallalle6rjclp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lallalle6rjclp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_after1970976",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pb0ybblco() throws Exception{try{__CLR4_4_1lallalle6rjclp.R.inc(27672); 
     __CLR4_4_1lallalle6rjclp.R.inc(27673);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1lallalle6rjclp.R.inc(27674);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1lallalle6rjclp.R.inc(27675);LocalTime expected = new LocalTime(4, 5, 6, 7); 
     __CLR4_4_1lallalle6rjclp.R.inc(27676);assertEquals(expected, LocalTime.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}} 


public void testFactory_FromDateFields_null977() throws Exception {__CLR4_4_1lallalle6rjclp.R.globalSliceStart(getClass().getName(),27677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j8cg7mlct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lallalle6rjclp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lallalle6rjclp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_null977",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j8cg7mlct() throws Exception{try{__CLR4_4_1lallalle6rjclp.R.inc(27677); 
     __CLR4_4_1lallalle6rjclp.R.inc(27678);try { 
         __CLR4_4_1lallalle6rjclp.R.inc(27679);LocalTime.fromDateFields((Date) null); 
         __CLR4_4_1lallalle6rjclp.R.inc(27680);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}} 


public void testConstructor_long_DateTimeZone_2980() throws Throwable {__CLR4_4_1lallalle6rjclp.R.globalSliceStart(getClass().getName(),27681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17hfq9elcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lallalle6rjclp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lallalle6rjclp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long_DateTimeZone_2980",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17hfq9elcx() throws Throwable{try{__CLR4_4_1lallalle6rjclp.R.inc(27681); 
     __CLR4_4_1lallalle6rjclp.R.inc(27682);DateTime dt = new DateTime(2007, 6, 9, 1, 2, 3, 4, PARIS); 
     __CLR4_4_1lallalle6rjclp.R.inc(27683);DateTime dtUTC = new DateTime(1970, 1, 1, 1, 2, 3, 4, DateTimeZone.UTC); 
     __CLR4_4_1lallalle6rjclp.R.inc(27684);LocalTime test = new LocalTime(dt.getMillis(), PARIS); 
     __CLR4_4_1lallalle6rjclp.R.inc(27685);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27686);assertEquals(1, test.getHourOfDay()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27687);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27688);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27689);assertEquals(4, test.getMillisOfSecond()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27690);assertEquals(dtUTC.getMillis(), test.getLocalMillis()); 
 }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}} 


public void testConstructor_ObjectLocalTime981() throws Throwable {__CLR4_4_1lallalle6rjclp.R.globalSliceStart(getClass().getName(),27691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qh8mvld7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lallalle6rjclp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lallalle6rjclp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectLocalTime981",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qh8mvld7() throws Throwable{try{__CLR4_4_1lallalle6rjclp.R.inc(27691); 
     __CLR4_4_1lallalle6rjclp.R.inc(27692);LocalTime time = new LocalTime(10, 20, 30, 40, BUDDHIST_UTC); 
     __CLR4_4_1lallalle6rjclp.R.inc(27693);LocalTime test = new LocalTime(time); 
     __CLR4_4_1lallalle6rjclp.R.inc(27694);assertEquals(BUDDHIST_UTC, test.getChronology()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27695);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27696);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27697);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1lallalle6rjclp.R.inc(27698);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1lallalle6rjclp.R.flushNeeded();}} 

    

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
