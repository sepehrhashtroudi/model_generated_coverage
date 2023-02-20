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
public class TestLocalTime_Constructors extends TestCase {static class __CLR4_4_1l8ll8lle6qe9pv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,27585,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27525);
        __CLR4_4_1l8ll8lle6qe9pv.R.inc(27526);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27527);
        __CLR4_4_1l8ll8lle6qe9pv.R.inc(27528);return new TestSuite(TestLocalTime_Constructors.class);
    }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}}

    public TestLocalTime_Constructors(String name) {
        super(name);__CLR4_4_1l8ll8lle6qe9pv.R.inc(27530);try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27529);
    }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27531);
        __CLR4_4_1l8ll8lle6qe9pv.R.inc(27532);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1l8ll8lle6qe9pv.R.inc(27533);zone = DateTimeZone.getDefault();
        __CLR4_4_1l8ll8lle6qe9pv.R.inc(27534);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1l8ll8lle6qe9pv.R.inc(27535);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27536);
        __CLR4_4_1l8ll8lle6qe9pv.R.inc(27537);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1l8ll8lle6qe9pv.R.inc(27538);DateTimeZone.setDefault(zone);
        __CLR4_4_1l8ll8lle6qe9pv.R.inc(27539);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1l8ll8lle6qe9pv.R.inc(27540);zone = null;
    }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */

public void testConstructor_ObjectString_DateTimeZoneNewYork138() throws Throwable {__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceStart(getClass().getName(),27541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rkj1ppl91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8ll8lle6qe9pv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString_DateTimeZoneNewYork138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rkj1ppl91() throws Throwable{try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27541); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27542);LocalTime test = new LocalTime("04:20", NEW_YORK); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27543);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27544);assertEquals(4, test.getHourOfDay()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27545);assertEquals(20, test.getMinuteOfHour()); 
 }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}} 


public void testConstructor960() throws Throwable {__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceStart(getClass().getName(),27546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16j2qhel96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8ll8lle6qe9pv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor960",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16j2qhel96() throws Throwable{try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27546); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27547);LocalTime test = new LocalTime(); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27548);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27549);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27550);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27551);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27552);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27553);assertEquals(test, LocalTime.now()); 
 }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}} 


public void testConstructor_Chronology961() throws Throwable {__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceStart(getClass().getName(),27554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zawnf8l9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8ll8lle6qe9pv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Chronology961",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zawnf8l9e() throws Throwable{try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27554); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27555);LocalTime test = new LocalTime(JULIAN_LONDON); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27556);assertEquals(JULIAN_UTC, test.getChronology()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27557);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27558);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27559);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27560);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27561);assertEquals(test, LocalTime.now(JULIAN_LONDON)); 
 }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}} 


public void testParse_noFormatter962() throws Throwable {__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceStart(getClass().getName(),27562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1woc8j3l9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8ll8lle6qe9pv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testParse_noFormatter962",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1woc8j3l9m() throws Throwable{try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27562); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27563);assertEquals(new LocalTime(1, 20), LocalTime.parse("01:20")); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27564);assertEquals(new LocalTime(14, 50, 30, 432), LocalTime.parse("14:50:30.432")); 
 }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}} 


public void testParse_formatter963() throws Throwable {__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceStart(getClass().getName(),27565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd3h8vl9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8ll8lle6qe9pv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testParse_formatter963",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd3h8vl9p() throws Throwable{try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27565); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27566);DateTimeFormatter f = DateTimeFormat.forPattern("HH mm").withChronology(ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27567);assertEquals(new LocalTime(13, 30), LocalTime.parse("13 30", f)); 
 }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}} 


public void testFactory_FromDateFields_after1970964() throws Exception {__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceStart(getClass().getName(),27568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19i89jcl9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8ll8lle6qe9pv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_after1970964",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19i89jcl9s() throws Exception{try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27568); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27569);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27570);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27571);LocalTime expected = new LocalTime(4, 5, 6, 7); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27572);assertEquals(expected, LocalTime.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}} 


public void testFactory_FromDateFields_null965() throws Exception {__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceStart(getClass().getName(),27573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzidwvl9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8ll8lle6qe9pv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_null965",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzidwvl9x() throws Exception{try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27573); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27574);try { 
         __CLR4_4_1l8ll8lle6qe9pv.R.inc(27575);LocalTime.fromDateFields((Date) null); 
         __CLR4_4_1l8ll8lle6qe9pv.R.inc(27576);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}} 


public void testConstructor_ObjectLocalTime967() throws Throwable {__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceStart(getClass().getName(),27577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u78rpdla1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8ll8lle6qe9pv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8ll8lle6qe9pv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectLocalTime967",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u78rpdla1() throws Throwable{try{__CLR4_4_1l8ll8lle6qe9pv.R.inc(27577); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27578);LocalTime time = new LocalTime(10, 20, 30, 40, BUDDHIST_UTC); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27579);LocalTime test = new LocalTime(time); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27580);assertEquals(BUDDHIST_UTC, test.getChronology()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27581);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27582);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27583);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1l8ll8lle6qe9pv.R.inc(27584);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1l8ll8lle6qe9pv.R.flushNeeded();}} 

    

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
