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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Partial;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for ISOChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestISOChronology extends TestCase {static class __CLR4_4_1rkgrkglc8axeqp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,35885,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1rkgrkglc8axeqp.R.inc(35728);
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35729);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rkgrkglc8axeqp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rkgrkglc8axeqp.R.inc(35730);
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35731);return new TestSuite(TestISOChronology.class);
    }finally{__CLR4_4_1rkgrkglc8axeqp.R.flushNeeded();}}

    public TestISOChronology(String name) {
        super(name);__CLR4_4_1rkgrkglc8axeqp.R.inc(35733);try{__CLR4_4_1rkgrkglc8axeqp.R.inc(35732);
    }finally{__CLR4_4_1rkgrkglc8axeqp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rkgrkglc8axeqp.R.inc(35734);
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35735);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35736);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35737);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35738);originalLocale = Locale.getDefault();
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35739);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35740);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35741);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1rkgrkglc8axeqp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rkgrkglc8axeqp.R.inc(35742);
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35743);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35744);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35745);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35746);Locale.setDefault(originalLocale);
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35747);originalDateTimeZone = null;
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35748);originalTimeZone = null;
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35749);originalLocale = null;
    }finally{__CLR4_4_1rkgrkglc8axeqp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPartialDayOfYearAdd27() {__CLR4_4_1rkgrkglc8axeqp.R.globalSliceStart(getClass().getName(),35750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkfvosrl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rkgrkglc8axeqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rkgrkglc8axeqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testPartialDayOfYearAdd27",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkfvosrl2(){try{__CLR4_4_1rkgrkglc8axeqp.R.inc(35750); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35751);Partial start = new Partial().with(DateTimeFieldType.year(), 2000).with(DateTimeFieldType.dayOfYear(), 366); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35752);Partial end = new Partial().with(DateTimeFieldType.year(), 2004).with(DateTimeFieldType.dayOfYear(), 366); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35753);assertEquals(end, start.withFieldAdded(DurationFieldType.days(), 365 + 365 + 365 + 366)); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35754);assertEquals(start, end.withFieldAdded(DurationFieldType.days(), -(365 + 365 + 365 + 366))); 
 }finally{__CLR4_4_1rkgrkglc8axeqp.R.flushNeeded();}} 


public void testDurationFields480() {__CLR4_4_1rkgrkglc8axeqp.R.globalSliceStart(getClass().getName(),35755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fjzljorl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rkgrkglc8axeqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rkgrkglc8axeqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testDurationFields480",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fjzljorl7(){try{__CLR4_4_1rkgrkglc8axeqp.R.inc(35755); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35756);final ISOChronology iso = ISOChronology.getInstance(); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35757);assertEquals("eras", iso.eras().getName()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35758);assertEquals("centuries", iso.centuries().getName()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35759);assertEquals("years", iso.years().getName()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35760);assertEquals("weekyears", iso.weekyears().getName()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35761);assertEquals("months", iso.months().getName()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35762);assertEquals("weeks", iso.weeks().getName()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35763);assertEquals("days", iso.days().getName()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35764);assertEquals("halfdays", iso.halfdays().getName()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35765);assertEquals("hours", iso.hours().getName()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35766);assertEquals("minutes", iso.minutes().getName()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35767);assertEquals("seconds", iso.seconds().getName()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35768);assertEquals("millis", iso.millis().getName()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35769);assertEquals(false, iso.eras().isSupported()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35770);assertEquals(true, iso.centuries().isSupported()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35771);assertEquals(true, iso.years().isSupported()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35772);assertEquals(true, iso.weekyears().isSupported()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35773);assertEquals(true, iso.months().isSupported()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35774);assertEquals(true, iso.weeks().isSupported()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35775);assertEquals(true, iso.days().isSupported()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35776);assertEquals(true, iso.halfdays().isSupported()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35777);assertEquals(true, iso.hours().isSupported()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35778);assertEquals(true, iso.minutes().isSupported()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35779);assertEquals(true, iso.seconds().isSupported()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35780);assertEquals(true, iso.millis().isSupported()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35781);assertEquals(false, iso.centuries().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35782);assertEquals(false, iso.years().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35783);assertEquals(false, iso.weekyears().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35784);assertEquals(false, iso.months().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35785);assertEquals(false, iso.weeks().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35786);assertEquals(false, iso.days().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35787);assertEquals(false, iso.halfdays().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35788);assertEquals(true, iso.hours().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35789);assertEquals(true, iso.minutes().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35790);assertEquals(true, iso.seconds().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35791);assertEquals(true, iso.millis().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35792);final ISOChronology isoUTC = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35793);assertEquals(false, isoUTC.centuries().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35794);assertEquals(false, isoUTC.years().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35795);assertEquals(false, isoUTC.weekyears().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35796);assertEquals(false, isoUTC.months().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35797);assertEquals(true, isoUTC.weeks().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35798);assertEquals(true, isoUTC.days().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35799);assertEquals(true, isoUTC.halfdays().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35800);assertEquals(true, isoUTC.hours().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35801);assertEquals(true, isoUTC.minutes().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35802);assertEquals(true, isoUTC.seconds().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35803);assertEquals(true, isoUTC.millis().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35804);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35805);final ISOChronology isoGMT = ISOChronology.getInstance(gmt); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35806);assertEquals(false, isoGMT.centuries().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35807);assertEquals(false, isoGMT.years().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35808);assertEquals(false, isoGMT.weekyears().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35809);assertEquals(false, isoGMT.months().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35810);assertEquals(true, isoGMT.weeks().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35811);assertEquals(true, isoGMT.days().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35812);assertEquals(true, isoGMT.halfdays().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35813);assertEquals(true, isoGMT.hours().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35814);assertEquals(true, isoGMT.minutes().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35815);assertEquals(true, isoGMT.seconds().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35816);assertEquals(true, isoGMT.millis().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35817);final DateTimeZone offset = DateTimeZone.forOffsetHours(1); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35818);final ISOChronology isoOffset1 = ISOChronology.getInstance(offset); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35819);assertEquals(false, isoOffset1.centuries().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35820);assertEquals(false, isoOffset1.years().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35821);assertEquals(false, isoOffset1.weekyears().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35822);assertEquals(false, isoOffset1.months().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35823);assertEquals(true, isoOffset1.weeks().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35824);assertEquals(true, isoOffset1.days().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35825);assertEquals(true, isoOffset1.halfdays().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35826);assertEquals(true, isoOffset1.hours().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35827);assertEquals(true, isoOffset1.minutes().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35828);assertEquals(true, isoOffset1.seconds().isPrecise()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35829);assertEquals(true, isoOffset1.millis().isPrecise()); 
 }finally{__CLR4_4_1rkgrkglc8axeqp.R.flushNeeded();}} 


public void testMinYear538() {__CLR4_4_1rkgrkglc8axeqp.R.globalSliceStart(getClass().getName(),35830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnvsisrna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rkgrkglc8axeqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rkgrkglc8axeqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testMinYear538",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnvsisrna(){try{__CLR4_4_1rkgrkglc8axeqp.R.inc(35830); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35831);final ISOChronology chrono = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35832);final int minYear = chrono.year().getMinimumValue(); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35833);DateTime start = new DateTime(minYear, 1, 1, 0, 0, 0, 0, chrono); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35834);DateTime end = new DateTime(minYear, 12, 31, 23, 59, 59, 999, chrono); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35835);assertTrue(start.getMillis() < 0); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35836);assertTrue(end.getMillis() > start.getMillis()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35837);assertEquals(minYear, start.getYear()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35838);assertEquals(minYear, end.getYear()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35839);long delta = end.getMillis() - start.getMillis(); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35840);long expectedDelta = ((((start.year().isLeap() )&&(__CLR4_4_1rkgrkglc8axeqp.R.iget(35841)!=0|true))||(__CLR4_4_1rkgrkglc8axeqp.R.iget(35842)==0&false))? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1; 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35843);assertEquals(expectedDelta, delta); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35844);assertEquals(start, new DateTime(minYear + "-01-01T00:00:00.000Z", chrono)); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35845);assertEquals(end, new DateTime(minYear + "-12-31T23:59:59.999Z", chrono)); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35846);try { 
         __CLR4_4_1rkgrkglc8axeqp.R.inc(35847);start.minusYears(1); 
         __CLR4_4_1rkgrkglc8axeqp.R.inc(35848);fail(); 
     } catch (IllegalFieldValueException e) { 
     } 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35849);try { 
         __CLR4_4_1rkgrkglc8axeqp.R.inc(35850);end.minusYears(1); 
         __CLR4_4_1rkgrkglc8axeqp.R.inc(35851);fail(); 
     } catch (IllegalFieldValueException e) { 
     } 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35852);assertEquals(minYear - 1, chrono.year().get(Long.MIN_VALUE)); 
 }finally{__CLR4_4_1rkgrkglc8axeqp.R.flushNeeded();}} 


public void testToString637() {__CLR4_4_1rkgrkglc8axeqp.R.globalSliceStart(getClass().getName(),35853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12q6o77rnx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rkgrkglc8axeqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rkgrkglc8axeqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testToString637",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12q6o77rnx(){try{__CLR4_4_1rkgrkglc8axeqp.R.inc(35853); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35854);assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35855);assertEquals("ISOChronology[Asia/Tokyo]", ISOChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35856);assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance().toString()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35857);assertEquals("ISOChronology[UTC]", ISOChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1rkgrkglc8axeqp.R.flushNeeded();}} 


public void testFactory_Zone1563() {__CLR4_4_1rkgrkglc8axeqp.R.globalSliceStart(getClass().getName(),35858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qohe85ro2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rkgrkglc8axeqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rkgrkglc8axeqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testFactory_Zone1563",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qohe85ro2(){try{__CLR4_4_1rkgrkglc8axeqp.R.inc(35858); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35859);assertEquals(TOKYO, ISOChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35860);assertEquals(PARIS, ISOChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35861);assertEquals(LONDON, ISOChronology.getInstance(null).getZone()); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35862);assertSame(ISOChronology.class, ISOChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1rkgrkglc8axeqp.R.flushNeeded();}} 


public void testWithZone1607() {__CLR4_4_1rkgrkglc8axeqp.R.globalSliceStart(getClass().getName(),35863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdlw21ro7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rkgrkglc8axeqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rkgrkglc8axeqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testWithZone1607",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdlw21ro7(){try{__CLR4_4_1rkgrkglc8axeqp.R.inc(35863); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35864);assertSame(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35865);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35866);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35867);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35868);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1rkgrkglc8axeqp.R.inc(35869);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1rkgrkglc8axeqp.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1rkgrkglc8axeqp.R.inc(35870);
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35871);DateTime dtStart = new DateTime(start, ISOChronology.getInstanceUTC());
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35872);DateTime dtEnd = new DateTime(end, ISOChronology.getInstanceUTC());
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35873);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35874);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1rkgrkglc8axeqp.R.inc(35875);DurationField field = type.getField(ISOChronology.getInstanceUTC());
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35876);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35877);assertEquals(amt, diff);
        
        __CLR4_4_1rkgrkglc8axeqp.R.inc(35878);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1rkgrkglc8axeqp.R.iget(35879)!=0|true))||(__CLR4_4_1rkgrkglc8axeqp.R.iget(35880)==0&false))) {{
            __CLR4_4_1rkgrkglc8axeqp.R.inc(35881);YearMonthDay ymdStart = new YearMonthDay(start, ISOChronology.getInstanceUTC());
            __CLR4_4_1rkgrkglc8axeqp.R.inc(35882);YearMonthDay ymdEnd = new YearMonthDay(end, ISOChronology.getInstanceUTC());
            __CLR4_4_1rkgrkglc8axeqp.R.inc(35883);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1rkgrkglc8axeqp.R.inc(35884);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1rkgrkglc8axeqp.R.flushNeeded();}}

    

    

    

}
