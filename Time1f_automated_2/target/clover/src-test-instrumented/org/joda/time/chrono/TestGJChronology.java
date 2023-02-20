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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.Period;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for GJChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGJChronology extends TestCase {static class __CLR4_4_1kedkedle6nl8jk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,26534,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1kedkedle6nl8jk.R.inc(26437);
        __CLR4_4_1kedkedle6nl8jk.R.inc(26438);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kedkedle6nl8jk.R.inc(26439);
        __CLR4_4_1kedkedle6nl8jk.R.inc(26440);return new TestSuite(TestGJChronology.class);
    }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}

    public TestGJChronology(String name) {
        super(name);__CLR4_4_1kedkedle6nl8jk.R.inc(26442);try{__CLR4_4_1kedkedle6nl8jk.R.inc(26441);
    }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kedkedle6nl8jk.R.inc(26443);
        __CLR4_4_1kedkedle6nl8jk.R.inc(26444);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kedkedle6nl8jk.R.inc(26445);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1kedkedle6nl8jk.R.inc(26446);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1kedkedle6nl8jk.R.inc(26447);originalLocale = Locale.getDefault();
        __CLR4_4_1kedkedle6nl8jk.R.inc(26448);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kedkedle6nl8jk.R.inc(26449);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1kedkedle6nl8jk.R.inc(26450);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kedkedle6nl8jk.R.inc(26451);
        __CLR4_4_1kedkedle6nl8jk.R.inc(26452);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kedkedle6nl8jk.R.inc(26453);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1kedkedle6nl8jk.R.inc(26454);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1kedkedle6nl8jk.R.inc(26455);Locale.setDefault(originalLocale);
        __CLR4_4_1kedkedle6nl8jk.R.inc(26456);originalDateTimeZone = null;
        __CLR4_4_1kedkedle6nl8jk.R.inc(26457);originalTimeZone = null;
        __CLR4_4_1kedkedle6nl8jk.R.inc(26458);originalLocale = null;
    }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testCutoverAddYears61() {__CLR4_4_1kedkedle6nl8jk.R.globalSliceStart(getClass().getName(),26459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmnnlnkez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6nl8jk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6nl8jk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddYears61",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmnnlnkez(){try{__CLR4_4_1kedkedle6nl8jk.R.inc(26459); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26460);testAdd("1582-01-01", DurationFieldType.years(), 1, "1583-01-01"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26461);testAdd("1582-02-15", DurationFieldType.years(), 1, "1583-02-15"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26462);testAdd("1582-02-28", DurationFieldType.years(), 1, "1583-02-28"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26463);testAdd("1582-03-01", DurationFieldType.years(), 1, "1583-03-01"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26464);testAdd("1582-09-30", DurationFieldType.years(), 1, "1583-09-30"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26465);testAdd("1582-10-01", DurationFieldType.years(), 1, "1583-10-01"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26466);testAdd("1582-10-04", DurationFieldType.years(), 1, "1583-10-04"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26467);testAdd("1582-10-15", DurationFieldType.years(), 1, "1583-10-15"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26468);testAdd("1582-10-16", DurationFieldType.years(), 1, "1583-10-16"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26469);testAdd("1580-01-01", DurationFieldType.years(), 4, "1584-01-01"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26470);testAdd("1580-02-29", DurationFieldType.years(), 4, "1584-02-29"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26471);testAdd("1580-10-01", DurationFieldType.years(), 4, "1584-10-01"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26472);testAdd("1580-10-10", DurationFieldType.years(), 4, "1584-10-10"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26473);testAdd("1580-10-15", DurationFieldType.years(), 4, "1584-10-15"); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26474);testAdd("1580-12-31", DurationFieldType.years(), 4, "1584-12-31"); 
 }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}
public void testFactory_Zone62() {__CLR4_4_1kedkedle6nl8jk.R.globalSliceStart(getClass().getName(),26475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18fhz3qkff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6nl8jk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6nl8jk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone62",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18fhz3qkff(){try{__CLR4_4_1kedkedle6nl8jk.R.inc(26475); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26476);assertEquals(TOKYO, GJChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26477);assertEquals(PARIS, GJChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26478);assertEquals(LONDON, GJChronology.getInstance(null).getZone()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26479);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}
public void testFactory_Zone_RI63() {__CLR4_4_1kedkedle6nl8jk.R.globalSliceStart(getClass().getName(),26480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15yvp2fkfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6nl8jk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6nl8jk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone_RI63",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15yvp2fkfk(){try{__CLR4_4_1kedkedle6nl8jk.R.inc(26480); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26481);GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L)); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26482);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26483);assertEquals(new Instant(0L), chrono.getGregorianCutover()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26484);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO).getClass()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26485);DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26486);chrono = GJChronology.getInstance(TOKYO, null); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26487);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26488);assertEquals(cutover.toInstant(), chrono.getGregorianCutover()); 
 }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}
public void testFactory_Zone_RI65() {__CLR4_4_1kedkedle6nl8jk.R.globalSliceStart(getClass().getName(),26489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgvmndkft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6nl8jk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6nl8jk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone_RI65",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgvmndkft(){try{__CLR4_4_1kedkedle6nl8jk.R.inc(26489); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26490);GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L)); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26491);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26492);assertEquals(new Instant(0L), chrono.getGregorianCutover()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26493);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, new Instant(0L)).getClass()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26494);DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26495);chrono = GJChronology.getInstance(TOKYO, null); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26496);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26497);assertEquals(cutover.toInstant(), chrono.getGregorianCutover()); 
 }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}
public void testWithZone69() {__CLR4_4_1kedkedle6nl8jk.R.globalSliceStart(getClass().getName(),26498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1naw19qkg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6nl8jk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6nl8jk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testWithZone69",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1naw19qkg2(){try{__CLR4_4_1kedkedle6nl8jk.R.inc(26498); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26499);assertSame(GJChronology.getInstance(TOKYO), GJChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26500);assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26501);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26502);assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26503);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26504);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}
public void testLeapYearRulesConstruction71() {__CLR4_4_1kedkedle6nl8jk.R.globalSliceStart(getClass().getName(),26505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174j3rikg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6nl8jk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6nl8jk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstruction71",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174j3rikg9(){try{__CLR4_4_1kedkedle6nl8jk.R.inc(26505); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26506);DateMidnight dt = new DateMidnight(1500, 2, 29, GJChronology.getInstanceUTC()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26507);assertEquals(dt.getYear(), 1500); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26508);assertEquals(dt.getMonthOfYear(), 2); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26509);assertEquals(dt.getDayOfMonth(), 29); 
 }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}
public void testTimeOfDayAdd72() {__CLR4_4_1kedkedle6nl8jk.R.globalSliceStart(getClass().getName(),26510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyw1gdkge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6nl8jk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6nl8jk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testTimeOfDayAdd72",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyw1gdkge(){try{__CLR4_4_1kedkedle6nl8jk.R.inc(26510); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26511);TimeOfDay start = new TimeOfDay(12, 30, GJChronology.getInstance()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26512);TimeOfDay end = new TimeOfDay(10, 30, GJChronology.getInstance()); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26513);assertEquals(end, start.plusHours(22)); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26514);assertEquals(start, end.minusHours(22)); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26515);assertEquals(end, start.plusMinutes(22 * 60)); 
     __CLR4_4_1kedkedle6nl8jk.R.inc(26516);assertEquals(start, end.minusMinutes(22 * 60)); 
 }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {try{__CLR4_4_1kedkedle6nl8jk.R.inc(26517);
        __CLR4_4_1kedkedle6nl8jk.R.inc(26518);assertEquals(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                     new DateTime(year, month, day, hour, minute, second, millis,
                                  GJChronology.getInstance(DateTimeZone.UTC)));
    }finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}

    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1kedkedle6nl8jk.R.inc(26519);
        __CLR4_4_1kedkedle6nl8jk.R.inc(26520);DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1kedkedle6nl8jk.R.inc(26521);DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1kedkedle6nl8jk.R.inc(26522);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1kedkedle6nl8jk.R.inc(26523);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1kedkedle6nl8jk.R.inc(26524);DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1kedkedle6nl8jk.R.inc(26525);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1kedkedle6nl8jk.R.inc(26526);assertEquals(amt, diff);
        
        __CLR4_4_1kedkedle6nl8jk.R.inc(26527);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1kedkedle6nl8jk.R.iget(26528)!=0|true))||(__CLR4_4_1kedkedle6nl8jk.R.iget(26529)==0&false))) {{
            __CLR4_4_1kedkedle6nl8jk.R.inc(26530);YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1kedkedle6nl8jk.R.inc(26531);YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1kedkedle6nl8jk.R.inc(26532);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1kedkedle6nl8jk.R.inc(26533);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1kedkedle6nl8jk.R.flushNeeded();}}

    

    

    

    

    

}
