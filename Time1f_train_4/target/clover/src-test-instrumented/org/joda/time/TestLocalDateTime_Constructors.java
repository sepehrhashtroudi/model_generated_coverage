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
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Constructors extends TestCase {static class __CLR4_4_1kejkejle6rjci5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,26579,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_MOSCOW = GregorianChronology.getInstance(MOSCOW);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_MOSCOW = MOSCOW.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    
    private long MILLIS_OF_DAY =
        10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L;
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;

    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1kejkejle6rjci5.R.inc(26443);
        __CLR4_4_1kejkejle6rjci5.R.inc(26444);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kejkejle6rjci5.R.inc(26445);
        __CLR4_4_1kejkejle6rjci5.R.inc(26446);return new TestSuite(TestLocalDateTime_Constructors.class);
    }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}}

    public TestLocalDateTime_Constructors(String name) {
        super(name);__CLR4_4_1kejkejle6rjci5.R.inc(26448);try{__CLR4_4_1kejkejle6rjci5.R.inc(26447);
    }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kejkejle6rjci5.R.inc(26449);
        __CLR4_4_1kejkejle6rjci5.R.inc(26450);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kejkejle6rjci5.R.inc(26451);zone = DateTimeZone.getDefault();
        __CLR4_4_1kejkejle6rjci5.R.inc(26452);DateTimeZone.setDefault(MOSCOW);
    }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kejkejle6rjci5.R.inc(26453);
        __CLR4_4_1kejkejle6rjci5.R.inc(26454);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kejkejle6rjci5.R.inc(26455);DateTimeZone.setDefault(zone);
        __CLR4_4_1kejkejle6rjci5.R.inc(26456);zone = null;
    }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_ObjectLocalDateTime1242() throws Throwable {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129f4lykex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalDateTime1242",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129f4lykex() throws Throwable{try{__CLR4_4_1kejkejle6rjci5.R.inc(26457); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26458);LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26459);LocalDateTime test = new LocalDateTime(dt); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26460);assertEquals(BUDDHIST_UTC, test.getChronology()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26461);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26462);assertEquals(5, test.getMonthOfYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26463);assertEquals(6, test.getDayOfMonth()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26464);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26465);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26466);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26467);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testConstructor1284() throws Throwable {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzxhfwkf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor1284",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzxhfwkf8() throws Throwable{try{__CLR4_4_1kejkejle6rjci5.R.inc(26468); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26469);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26470);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26471);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26472);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26473);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26474);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26475);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26476);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26477);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26478);assertEquals(test, LocalDateTime.now()); 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1285() throws Throwable {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14laet9kfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_DateTimeZone1285",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14laet9kfj() throws Throwable{try{__CLR4_4_1kejkejle6rjci5.R.inc(26479); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26480);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26481);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26482);LocalDateTime test = new LocalDateTime(LONDON); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26483);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26484);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26485);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26486);assertEquals(8, test.getDayOfMonth()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26487);assertEquals(23, test.getHourOfDay()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26488);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26489);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26490);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26491);assertEquals(test, LocalDateTime.now(LONDON)); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26492);test = new LocalDateTime(PARIS); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26493);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26494);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26495);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26496);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26497);assertEquals(0, test.getHourOfDay()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26498);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26499);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26500);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26501);assertEquals(test, LocalDateTime.now(PARIS)); 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testConstructor_Chronology1286() throws Throwable {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18hdh1nkg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Chronology1286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18hdh1nkg6() throws Throwable{try{__CLR4_4_1kejkejle6rjci5.R.inc(26502); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26503);LocalDateTime test = new LocalDateTime(GREGORIAN_PARIS); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26504);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26505);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26506);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26507);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26508);assertEquals(10 + OFFSET_PARIS, test.getHourOfDay()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26509);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26510);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26511);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26512);assertEquals(test, LocalDateTime.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testParse_noFormatter1287() throws Throwable {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ojrn3ikgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testParse_noFormatter1287",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ojrn3ikgh() throws Throwable{try{__CLR4_4_1kejkejle6rjci5.R.inc(26513); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26514);assertEquals(new LocalDateTime(2010, 6, 30, 1, 20), LocalDateTime.parse("2010-06-30T01:20")); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26515);assertEquals(new LocalDateTime(2010, 1, 2, 14, 50, 30, 432), LocalDateTime.parse("2010-002T14:50:30.432")); 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testFactory_fromCalendarFields_null1288() throws Exception {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yirhrukgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromCalendarFields_null1288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yirhrukgk() throws Exception{try{__CLR4_4_1kejkejle6rjci5.R.inc(26516); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26517);try { 
         __CLR4_4_1kejkejle6rjci5.R.inc(26518);LocalDateTime.fromCalendarFields((Calendar) null); 
         __CLR4_4_1kejkejle6rjci5.R.inc(26519);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testFactory_fromDateFields_before19701289() throws Exception {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x4b9hskgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_before19701289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x4b9hskgo() throws Exception{try{__CLR4_4_1kejkejle6rjci5.R.inc(26520); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26521);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26522);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26523);LocalDateTime expected = new LocalDateTime(1969, 2, 3, 4, 5, 6, 7); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26524);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testFactory_fromDateFields_null1290() throws Exception {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mtf3ilkgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_null1290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mtf3ilkgt() throws Exception{try{__CLR4_4_1kejkejle6rjci5.R.inc(26525); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26526);try { 
         __CLR4_4_1kejkejle6rjci5.R.inc(26527);LocalDateTime.fromDateFields((Date) null); 
         __CLR4_4_1kejkejle6rjci5.R.inc(26528);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testFactory_fromDateFields_after19701291() throws Exception {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163ceeikgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_after19701291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163ceeikgx() throws Exception{try{__CLR4_4_1kejkejle6rjci5.R.inc(26529); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26530);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26531);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26532);LocalDateTime expected = new LocalDateTime(1970, 2, 3, 4, 5, 6, 7); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26533);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testConstructor_nullDateTimeZone1292() throws Throwable {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12qx2rqkh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullDateTimeZone1292",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12qx2rqkh2() throws Throwable{try{__CLR4_4_1kejkejle6rjci5.R.inc(26534); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26535);LocalDateTime test = new LocalDateTime((DateTimeZone) null); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26536);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26537);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26538);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26539);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26540);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26541);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26542);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26543);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testConstructor_long_nullDateTimeZone1294() throws Throwable {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9hhc3khc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long_nullDateTimeZone1294",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9hhc3khc() throws Throwable{try{__CLR4_4_1kejkejle6rjci5.R.inc(26544); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26545);LocalDateTime test = new LocalDateTime(TEST_TIME1, (DateTimeZone) null); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26546);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26547);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26548);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26549);assertEquals(6, test.getDayOfMonth()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26550);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26551);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26552);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26553);assertEquals(0, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testConstructor_Object_nullDateTimeZone1295() throws Throwable {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b7u9nkhm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_nullDateTimeZone1295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b7u9nkhm() throws Throwable{try{__CLR4_4_1kejkejle6rjci5.R.inc(26554); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26555);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26556);LocalDateTime test = new LocalDateTime(date, (DateTimeZone) null); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26557);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26558);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26559);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26560);assertEquals(6, test.getDayOfMonth()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26561);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26562);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26563);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26564);assertEquals(0, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testConstructor_ObjectStringEx61296() throws Throwable {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17cpinzkhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx61296",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17cpinzkhx() throws Throwable{try{__CLR4_4_1kejkejle6rjci5.R.inc(26565); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26566);try { 
         __CLR4_4_1kejkejle6rjci5.R.inc(26567);new LocalDateTime("10:20:30.040+14:00"); 
         __CLR4_4_1kejkejle6rjci5.R.inc(26568);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int_int1297() throws Throwable {__CLR4_4_1kejkejle6rjci5.R.globalSliceStart(getClass().getName(),26569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eanedqki1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kejkejle6rjci5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kejkejle6rjci5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_int_int_int1297",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eanedqki1() throws Throwable{try{__CLR4_4_1kejkejle6rjci5.R.inc(26569); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26570);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26571);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26572);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26573);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26574);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26575);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26576);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26577);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kejkejle6rjci5.R.inc(26578);assertEquals(0, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kejkejle6rjci5.R.flushNeeded();}} 

    

    

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
