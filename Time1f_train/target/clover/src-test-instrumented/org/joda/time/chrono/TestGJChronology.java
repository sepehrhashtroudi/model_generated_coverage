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
public class TestGJChronology extends TestCase {static class __CLR4_4_1re3re3lc8axepx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,35647,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1re3re3lc8axepx.R.inc(35499);
        __CLR4_4_1re3re3lc8axepx.R.inc(35500);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1re3re3lc8axepx.R.inc(35501);
        __CLR4_4_1re3re3lc8axepx.R.inc(35502);return new TestSuite(TestGJChronology.class);
    }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}}

    public TestGJChronology(String name) {
        super(name);__CLR4_4_1re3re3lc8axepx.R.inc(35504);try{__CLR4_4_1re3re3lc8axepx.R.inc(35503);
    }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1re3re3lc8axepx.R.inc(35505);
        __CLR4_4_1re3re3lc8axepx.R.inc(35506);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1re3re3lc8axepx.R.inc(35507);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1re3re3lc8axepx.R.inc(35508);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1re3re3lc8axepx.R.inc(35509);originalLocale = Locale.getDefault();
        __CLR4_4_1re3re3lc8axepx.R.inc(35510);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1re3re3lc8axepx.R.inc(35511);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1re3re3lc8axepx.R.inc(35512);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1re3re3lc8axepx.R.inc(35513);
        __CLR4_4_1re3re3lc8axepx.R.inc(35514);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1re3re3lc8axepx.R.inc(35515);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1re3re3lc8axepx.R.inc(35516);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1re3re3lc8axepx.R.inc(35517);Locale.setDefault(originalLocale);
        __CLR4_4_1re3re3lc8axepx.R.inc(35518);originalDateTimeZone = null;
        __CLR4_4_1re3re3lc8axepx.R.inc(35519);originalTimeZone = null;
        __CLR4_4_1re3re3lc8axepx.R.inc(35520);originalLocale = null;
    }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testMaximumValue61() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p4h4ezrep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testMaximumValue61",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p4h4ezrep(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35521); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35522);DateMidnight dt = new DateMidnight(1570, 1, 1, GJChronology.getInstance()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35523);while ((((dt.getYear() < 1590)&&(__CLR4_4_1re3re3lc8axepx.R.iget(35524)!=0|true))||(__CLR4_4_1re3re3lc8axepx.R.iget(35525)==0&false))) {{ 
         __CLR4_4_1re3re3lc8axepx.R.inc(35526);dt = dt.plusDays(1); 
         __CLR4_4_1re3re3lc8axepx.R.inc(35527);YearMonthDay ymd = dt.toYearMonthDay(); 
         __CLR4_4_1re3re3lc8axepx.R.inc(35528);assertEquals(dt.year().getMaximumValue(), ymd.year().getMaximumValue()); 
         __CLR4_4_1re3re3lc8axepx.R.inc(35529);assertEquals(dt.monthOfYear().getMaximumValue(), ymd.monthOfYear().getMaximumValue()); 
         __CLR4_4_1re3re3lc8axepx.R.inc(35530);assertEquals(dt.dayOfMonth().getMaximumValue(), ymd.dayOfMonth().getMaximumValue()); 
     } 
 }}finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testCutoverAddWeeks74() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcbn6irez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddWeeks74",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcbn6irez(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35531); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35532);testAdd("1582-01-01", DurationFieldType.weeks(), 1, "1582-01-08"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35533);testAdd("1583-01-01", DurationFieldType.weeks(), 1, "1583-01-08"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35534);testAdd("1582-10-01", DurationFieldType.weeks(), 2, "1582-10-25"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35535);testAdd("1582-W01-1", DurationFieldType.weeks(), 51, "1583-W01-1"); 
 }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testSubtractDays209() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdovffrf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testSubtractDays209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdovffrf4(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35536); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35537);DateTime dt = new DateTime(1112306400000L, GJChronology.getInstance(DateTimeZone.forID("Europe/Berlin"))); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35538);YearMonthDay ymd = dt.toYearMonthDay(); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35539);while ((((ymd.toDateTimeAtMidnight().getDayOfWeek() != DateTimeConstants.MONDAY)&&(__CLR4_4_1re3re3lc8axepx.R.iget(35540)!=0|true))||(__CLR4_4_1re3re3lc8axepx.R.iget(35541)==0&false))) {{ 
         __CLR4_4_1re3re3lc8axepx.R.inc(35542);ymd = ymd.minus(Period.days(1)); 
     } 
 }}finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testToString240() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i8gknrrfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testToString240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i8gknrrfb(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35543); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35544);assertEquals("GJChronology[Europe/London]", GJChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35545);assertEquals("GJChronology[Asia/Tokyo]", GJChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35546);assertEquals("GJChronology[Europe/London]", GJChronology.getInstance().toString()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35547);assertEquals("GJChronology[UTC]", GJChronology.getInstanceUTC().toString()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35548);assertEquals("GJChronology[UTC,cutover=1970-01-01]", GJChronology.getInstance(DateTimeZone.UTC, 0L, 4).toString()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35549);assertEquals("GJChronology[UTC,cutover=1970-01-01T00:00:00.001Z,mdfw=2]", GJChronology.getInstance(DateTimeZone.UTC, 1L, 2).toString()); 
 }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testCutoverAddYears298() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12pqp33rfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddYears298",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12pqp33rfi(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35550); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35551);testAdd("1582-01-01", DurationFieldType.years(), 1, "1583-01-01"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35552);testAdd("1582-02-15", DurationFieldType.years(), 1, "1583-02-15"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35553);testAdd("1582-02-28", DurationFieldType.years(), 1, "1583-02-28"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35554);testAdd("1582-03-01", DurationFieldType.years(), 1, "1583-03-01"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35555);testAdd("1582-09-30", DurationFieldType.years(), 1, "1583-09-30"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35556);testAdd("1582-10-01", DurationFieldType.years(), 1, "1583-10-01"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35557);testAdd("1582-10-04", DurationFieldType.years(), 1, "1583-10-04"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35558);testAdd("1582-10-15", DurationFieldType.years(), 1, "1583-10-15"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35559);testAdd("1582-10-16", DurationFieldType.years(), 1, "1583-10-16"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35560);testAdd("1580-01-01", DurationFieldType.years(), 4, "1584-01-01"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35561);testAdd("1580-02-29", DurationFieldType.years(), 4, "1584-02-29"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35562);testAdd("1580-10-01", DurationFieldType.years(), 4, "1584-10-01"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35563);testAdd("1580-10-10", DurationFieldType.years(), 4, "1584-10-10"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35564);testAdd("1580-10-15", DurationFieldType.years(), 4, "1584-10-15"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35565);testAdd("1580-12-31", DurationFieldType.years(), 4, "1584-12-31"); 
 }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testEquality431() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17odtebrfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testEquality431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17odtebrfy(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35566); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35567);assertSame(GJChronology.getInstance(TOKYO), GJChronology.getInstance(TOKYO)); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35568);assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(LONDON)); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35569);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance(PARIS)); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35570);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstanceUTC()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35571);assertSame(GJChronology.getInstance(), GJChronology.getInstance(LONDON)); 
 }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testTimeOfDayAdd592() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198lgh2rg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testTimeOfDayAdd592",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198lgh2rg4(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35572); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35573);TimeOfDay start = new TimeOfDay(12, 30, GJChronology.getInstance()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35574);TimeOfDay end = new TimeOfDay(10, 30, GJChronology.getInstance()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35575);assertEquals(end, start.plusHours(22)); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35576);assertEquals(start, end.minusHours(22)); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35577);assertEquals(end, start.plusMinutes(22 * 60)); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35578);assertEquals(start, end.minusMinutes(22 * 60)); 
 }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testCutoverAddWeekyears998() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1mxiergb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddWeekyears998",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1mxiergb(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35579); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35580);testAdd("1582-W01-1", DurationFieldType.weekyears(), 1, "1583-W01-1"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35581);testAdd("1582-W39-1", DurationFieldType.weekyears(), 1, "1583-W39-1"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35582);testAdd("1583-W45-1", DurationFieldType.weekyears(), 1, "1584-W45-1"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35583);testAdd("1580-W01-1", DurationFieldType.weekyears(), 4, "1584-W01-1"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35584);testAdd("1580-W30-7", DurationFieldType.weekyears(), 4, "1584-W30-7"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35585);testAdd("1580-W50-7", DurationFieldType.weekyears(), 4, "1584-W50-7"); 
 }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testIllegalDates1129() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmqob3rgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testIllegalDates1129",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmqob3rgi(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35586); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35587);try { 
         __CLR4_4_1re3re3lc8axepx.R.inc(35588);new DateTime(1582, 10, 5, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC)); 
         __CLR4_4_1re3re3lc8axepx.R.inc(35589);fail("Constructed illegal date"); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1re3re3lc8axepx.R.inc(35590);try { 
         __CLR4_4_1re3re3lc8axepx.R.inc(35591);new DateTime(1582, 10, 14, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC)); 
         __CLR4_4_1re3re3lc8axepx.R.inc(35592);fail("Constructed illegal date"); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testCutoverAddMonths1138() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118e2ecrgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddMonths1138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118e2ecrgp(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35593); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35594);testAdd("1582-01-01", DurationFieldType.months(), 1, "1582-02-01"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35595);testAdd("1582-01-01", DurationFieldType.months(), 6, "1582-07-01"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35596);testAdd("1582-01-01", DurationFieldType.months(), 12, "1583-01-01"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35597);testAdd("1582-11-15", DurationFieldType.months(), 1, "1582-12-15"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35598);testAdd("1582-09-04", DurationFieldType.months(), 2, "1582-11-04"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35599);testAdd("1582-09-05", DurationFieldType.months(), 2, "1582-11-05"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35600);testAdd("1582-09-10", DurationFieldType.months(), 2, "1582-11-10"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35601);testAdd("1582-09-15", DurationFieldType.months(), 2, "1582-11-15"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35602);testAdd("1580-01-01", DurationFieldType.months(), 48, "1584-01-01"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35603);testAdd("1580-02-29", DurationFieldType.months(), 48, "1584-02-29"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35604);testAdd("1580-10-01", DurationFieldType.months(), 48, "1584-10-01"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35605);testAdd("1580-10-10", DurationFieldType.months(), 48, "1584-10-10"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35606);testAdd("1580-10-15", DurationFieldType.months(), 48, "1584-10-15"); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35607);testAdd("1580-12-31", DurationFieldType.months(), 48, "1584-12-31"); 
 }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testPartialGetAsText1149() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpqz0urh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testPartialGetAsText1149",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpqz0urh4(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35608); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35609);GJChronology chrono = GJChronology.getInstance(TOKYO); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35610);assertEquals("January", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsText()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35611);assertEquals("Jan", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsShortText()); 
 }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testLeapYearRulesConstructionInvalid1321() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ioy1xqrh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstructionInvalid1321",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ioy1xqrh8(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35612); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35613);try { 
         __CLR4_4_1re3re3lc8axepx.R.inc(35614);new DateMidnight(1500, 2, 30, GJChronology.getInstanceUTC()); 
         __CLR4_4_1re3re3lc8axepx.R.inc(35615);fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testLeapYearRulesConstruction1616() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15903s2rhc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstruction1616",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15903s2rhc(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35616); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35617);DateMidnight dt = new DateMidnight(1500, 2, 29, GJChronology.getInstanceUTC()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35618);assertEquals(dt.getYear(), 1500); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35619);assertEquals(dt.getMonthOfYear(), 2); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35620);assertEquals(dt.getDayOfMonth(), 29); 
 }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 


public void testFactory_Zone_RI1619() {__CLR4_4_1re3re3lc8axepx.R.globalSliceStart(getClass().getName(),35621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zbk3wprhh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1re3re3lc8axepx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1re3re3lc8axepx.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone_RI1619",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zbk3wprhh(){try{__CLR4_4_1re3re3lc8axepx.R.inc(35621); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35622);GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L)); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35623);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35624);assertEquals(new Instant(0L), chrono.getGregorianCutover()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35625);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, new Instant(0L)).getClass()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35626);DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35627);chrono = GJChronology.getInstance(TOKYO, null); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35628);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1re3re3lc8axepx.R.inc(35629);assertEquals(cutover.toInstant(), chrono.getGregorianCutover()); 
 }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}} 

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {try{__CLR4_4_1re3re3lc8axepx.R.inc(35630);
        __CLR4_4_1re3re3lc8axepx.R.inc(35631);assertEquals(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                     new DateTime(year, month, day, hour, minute, second, millis,
                                  GJChronology.getInstance(DateTimeZone.UTC)));
    }finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}}

    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1re3re3lc8axepx.R.inc(35632);
        __CLR4_4_1re3re3lc8axepx.R.inc(35633);DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1re3re3lc8axepx.R.inc(35634);DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1re3re3lc8axepx.R.inc(35635);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1re3re3lc8axepx.R.inc(35636);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1re3re3lc8axepx.R.inc(35637);DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1re3re3lc8axepx.R.inc(35638);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1re3re3lc8axepx.R.inc(35639);assertEquals(amt, diff);
        
        __CLR4_4_1re3re3lc8axepx.R.inc(35640);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1re3re3lc8axepx.R.iget(35641)!=0|true))||(__CLR4_4_1re3re3lc8axepx.R.iget(35642)==0&false))) {{
            __CLR4_4_1re3re3lc8axepx.R.inc(35643);YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1re3re3lc8axepx.R.inc(35644);YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1re3re3lc8axepx.R.inc(35645);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1re3re3lc8axepx.R.inc(35646);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1re3re3lc8axepx.R.flushNeeded();}}

    

    

    

    

    

}
