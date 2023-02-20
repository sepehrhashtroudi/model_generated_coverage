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
public class TestLocalTime_Constructors extends TestCase {static class __CLR4_4_1iodiodle6ndplt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,24274,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1iodiodle6ndplt.R.inc(24205);
        __CLR4_4_1iodiodle6ndplt.R.inc(24206);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iodiodle6ndplt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iodiodle6ndplt.R.inc(24207);
        __CLR4_4_1iodiodle6ndplt.R.inc(24208);return new TestSuite(TestLocalTime_Constructors.class);
    }finally{__CLR4_4_1iodiodle6ndplt.R.flushNeeded();}}

    public TestLocalTime_Constructors(String name) {
        super(name);__CLR4_4_1iodiodle6ndplt.R.inc(24210);try{__CLR4_4_1iodiodle6ndplt.R.inc(24209);
    }finally{__CLR4_4_1iodiodle6ndplt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iodiodle6ndplt.R.inc(24211);
        __CLR4_4_1iodiodle6ndplt.R.inc(24212);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iodiodle6ndplt.R.inc(24213);zone = DateTimeZone.getDefault();
        __CLR4_4_1iodiodle6ndplt.R.inc(24214);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1iodiodle6ndplt.R.inc(24215);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1iodiodle6ndplt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iodiodle6ndplt.R.inc(24216);
        __CLR4_4_1iodiodle6ndplt.R.inc(24217);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iodiodle6ndplt.R.inc(24218);DateTimeZone.setDefault(zone);
        __CLR4_4_1iodiodle6ndplt.R.inc(24219);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1iodiodle6ndplt.R.inc(24220);zone = null;
    }finally{__CLR4_4_1iodiodle6ndplt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
public void testConstructor_DateTimeZone454() throws Throwable {__CLR4_4_1iodiodle6ndplt.R.globalSliceStart(getClass().getName(),24221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwrwh0iot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iodiodle6ndplt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iodiodle6ndplt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_DateTimeZone454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwrwh0iot() throws Throwable{try{__CLR4_4_1iodiodle6ndplt.R.inc(24221); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24222);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24223);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24224);LocalTime test = new LocalTime(LONDON); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24225);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24226);assertEquals(2005, test.getHourOfDay()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24227);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24228);assertEquals(8, test.getSecondOfMinute()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24229);assertEquals(59, test.getMillisOfSecond()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24230);assertEquals(test, LocalTime.now(LONDON)); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24231);test = new LocalTime(PARIS); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24232);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24233);assertEquals(2005, test.getHourOfDay()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24234);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24235);assertEquals(9, test.getSecondOfMinute()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24236);assertEquals(test, LocalTime.now(PARIS)); 
 }finally{__CLR4_4_1iodiodle6ndplt.R.flushNeeded();}}
public void testFactory_FromMillisOfDay_long1455() throws Throwable {__CLR4_4_1iodiodle6ndplt.R.globalSliceStart(getClass().getName(),24237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1md5193ip9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iodiodle6ndplt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iodiodle6ndplt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromMillisOfDay_long1455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1md5193ip9() throws Throwable{try{__CLR4_4_1iodiodle6ndplt.R.inc(24237); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24238);LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24239);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24240);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24241);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24242);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24243);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1iodiodle6ndplt.R.flushNeeded();}}
public void testFactoryMillisOfDay_long1456() throws Throwable {__CLR4_4_1iodiodle6ndplt.R.globalSliceStart(getClass().getName(),24244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w6d127ipg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iodiodle6ndplt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iodiodle6ndplt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactoryMillisOfDay_long1456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w6d127ipg() throws Throwable{try{__CLR4_4_1iodiodle6ndplt.R.inc(24244); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24245);LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24246);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24247);assertEquals(1, test.getHourOfDay()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24248);assertEquals(2, test.getMinuteOfHour()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24249);assertEquals(3, test.getSecondOfMinute()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24250);assertEquals(4, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1iodiodle6ndplt.R.flushNeeded();}}
public void testFactory_FromCalendarFields457() throws Exception {__CLR4_4_1iodiodle6ndplt.R.globalSliceStart(getClass().getName(),24251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gszkd1ipn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iodiodle6ndplt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iodiodle6ndplt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromCalendarFields457",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gszkd1ipn() throws Exception{try{__CLR4_4_1iodiodle6ndplt.R.inc(24251); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24252);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24253);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24254);LocalTime expected = new LocalTime(4, 5, 6, 7); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24255);assertEquals(expected, LocalTime.fromCalendarFields(cal)); 
 }finally{__CLR4_4_1iodiodle6ndplt.R.flushNeeded();}}
public void testFactory_FromCalendarFields_null458() throws Exception {__CLR4_4_1iodiodle6ndplt.R.globalSliceStart(getClass().getName(),24256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfi7q8ips();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iodiodle6ndplt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iodiodle6ndplt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromCalendarFields_null458",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfi7q8ips() throws Exception{try{__CLR4_4_1iodiodle6ndplt.R.inc(24256); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24257);try { 
         __CLR4_4_1iodiodle6ndplt.R.inc(24258);LocalTime.fromCalendarFields((Calendar) null); 
         __CLR4_4_1iodiodle6ndplt.R.inc(24259);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iodiodle6ndplt.R.flushNeeded();}}
public void testConstructor_nullDateTimeZone460() throws Throwable {__CLR4_4_1iodiodle6ndplt.R.globalSliceStart(getClass().getName(),24260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qbjwwipw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iodiodle6ndplt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iodiodle6ndplt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullDateTimeZone460",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qbjwwipw() throws Throwable{try{__CLR4_4_1iodiodle6ndplt.R.inc(24260); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24261);LocalTime test = new LocalTime((DateTimeZone) null); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24262);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24263);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24264);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24265);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24266);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1iodiodle6ndplt.R.flushNeeded();}}
public void testConstructor_long_nullDateTimeZone462() throws Throwable {__CLR4_4_1iodiodle6ndplt.R.globalSliceStart(getClass().getName(),24267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ih70zhiq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iodiodle6ndplt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iodiodle6ndplt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long_nullDateTimeZone462",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ih70zhiq3() throws Throwable{try{__CLR4_4_1iodiodle6ndplt.R.inc(24267); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24268);LocalTime test = new LocalTime(TEST_TIME1, (DateTimeZone) null); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24269);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24270);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24271);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24272);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1iodiodle6ndplt.R.inc(24273);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1iodiodle6ndplt.R.flushNeeded();}}
    

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
