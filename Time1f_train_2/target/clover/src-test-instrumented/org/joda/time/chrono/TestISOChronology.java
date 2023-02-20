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
public class TestISOChronology extends TestCase {static class __CLR4_4_1pympymle6qsff1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,33796,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1pympymle6qsff1.R.inc(33646);
        __CLR4_4_1pympymle6qsff1.R.inc(33647);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pympymle6qsff1.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pympymle6qsff1.R.inc(33648);
        __CLR4_4_1pympymle6qsff1.R.inc(33649);return new TestSuite(TestISOChronology.class);
    }finally{__CLR4_4_1pympymle6qsff1.R.flushNeeded();}}

    public TestISOChronology(String name) {
        super(name);__CLR4_4_1pympymle6qsff1.R.inc(33651);try{__CLR4_4_1pympymle6qsff1.R.inc(33650);
    }finally{__CLR4_4_1pympymle6qsff1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pympymle6qsff1.R.inc(33652);
        __CLR4_4_1pympymle6qsff1.R.inc(33653);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pympymle6qsff1.R.inc(33654);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pympymle6qsff1.R.inc(33655);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pympymle6qsff1.R.inc(33656);originalLocale = Locale.getDefault();
        __CLR4_4_1pympymle6qsff1.R.inc(33657);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pympymle6qsff1.R.inc(33658);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pympymle6qsff1.R.inc(33659);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pympymle6qsff1.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pympymle6qsff1.R.inc(33660);
        __CLR4_4_1pympymle6qsff1.R.inc(33661);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pympymle6qsff1.R.inc(33662);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pympymle6qsff1.R.inc(33663);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pympymle6qsff1.R.inc(33664);Locale.setDefault(originalLocale);
        __CLR4_4_1pympymle6qsff1.R.inc(33665);originalDateTimeZone = null;
        __CLR4_4_1pympymle6qsff1.R.inc(33666);originalTimeZone = null;
        __CLR4_4_1pympymle6qsff1.R.inc(33667);originalLocale = null;
    }finally{__CLR4_4_1pympymle6qsff1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPartialDayOfYearAdd264() {__CLR4_4_1pympymle6qsff1.R.globalSliceStart(getClass().getName(),33668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0pa47pz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pympymle6qsff1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pympymle6qsff1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testPartialDayOfYearAdd264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0pa47pz8(){try{__CLR4_4_1pympymle6qsff1.R.inc(33668); 
     __CLR4_4_1pympymle6qsff1.R.inc(33669);Partial start = new Partial().with(DateTimeFieldType.year(), 2000).with(DateTimeFieldType.dayOfYear(), 366); 
     __CLR4_4_1pympymle6qsff1.R.inc(33670);Partial end = new Partial().with(DateTimeFieldType.year(), 2004).with(DateTimeFieldType.dayOfYear(), 366); 
     __CLR4_4_1pympymle6qsff1.R.inc(33671);assertEquals(end, start.withFieldAdded(DurationFieldType.days(), 365 + 365 + 365 + 366)); 
     __CLR4_4_1pympymle6qsff1.R.inc(33672);assertEquals(start, end.withFieldAdded(DurationFieldType.days(), -(365 + 365 + 365 + 366))); 
 }finally{__CLR4_4_1pympymle6qsff1.R.flushNeeded();}} 


public void testFactory_Zone265() {__CLR4_4_1pympymle6qsff1.R.globalSliceStart(getClass().getName(),33673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f43eytpzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pympymle6qsff1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pympymle6qsff1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testFactory_Zone265",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f43eytpzd(){try{__CLR4_4_1pympymle6qsff1.R.inc(33673); 
     __CLR4_4_1pympymle6qsff1.R.inc(33674);assertEquals(TOKYO, ISOChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33675);assertEquals(PARIS, ISOChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33676);assertEquals(LONDON, ISOChronology.getInstance(null).getZone()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33677);assertSame(ISOChronology.class, ISOChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1pympymle6qsff1.R.flushNeeded();}} 


public void testDurationFields267() {__CLR4_4_1pympymle6qsff1.R.globalSliceStart(getClass().getName(),33678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gv129xpzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pympymle6qsff1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pympymle6qsff1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testDurationFields267",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gv129xpzi(){try{__CLR4_4_1pympymle6qsff1.R.inc(33678); 
     __CLR4_4_1pympymle6qsff1.R.inc(33679);final ISOChronology iso = ISOChronology.getInstance(); 
     __CLR4_4_1pympymle6qsff1.R.inc(33680);assertEquals("eras", iso.eras().getName()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33681);assertEquals("centuries", iso.centuries().getName()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33682);assertEquals("years", iso.years().getName()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33683);assertEquals("weekyears", iso.weekyears().getName()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33684);assertEquals("months", iso.months().getName()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33685);assertEquals("weeks", iso.weeks().getName()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33686);assertEquals("days", iso.days().getName()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33687);assertEquals("halfdays", iso.halfdays().getName()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33688);assertEquals("hours", iso.hours().getName()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33689);assertEquals("minutes", iso.minutes().getName()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33690);assertEquals("seconds", iso.seconds().getName()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33691);assertEquals("millis", iso.millis().getName()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33692);assertEquals(false, iso.eras().isSupported()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33693);assertEquals(true, iso.centuries().isSupported()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33694);assertEquals(true, iso.years().isSupported()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33695);assertEquals(true, iso.weekyears().isSupported()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33696);assertEquals(true, iso.months().isSupported()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33697);assertEquals(true, iso.weeks().isSupported()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33698);assertEquals(true, iso.days().isSupported()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33699);assertEquals(true, iso.halfdays().isSupported()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33700);assertEquals(true, iso.hours().isSupported()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33701);assertEquals(true, iso.minutes().isSupported()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33702);assertEquals(true, iso.seconds().isSupported()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33703);assertEquals(true, iso.millis().isSupported()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33704);assertEquals(false, iso.centuries().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33705);assertEquals(false, iso.years().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33706);assertEquals(false, iso.weekyears().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33707);assertEquals(false, iso.months().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33708);assertEquals(false, iso.weeks().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33709);assertEquals(false, iso.days().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33710);assertEquals(false, iso.halfdays().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33711);assertEquals(true, iso.hours().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33712);assertEquals(true, iso.minutes().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33713);assertEquals(true, iso.seconds().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33714);assertEquals(true, iso.millis().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33715);final ISOChronology isoUTC = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1pympymle6qsff1.R.inc(33716);assertEquals(false, isoUTC.centuries().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33717);assertEquals(false, isoUTC.years().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33718);assertEquals(false, isoUTC.weekyears().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33719);assertEquals(false, isoUTC.months().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33720);assertEquals(true, isoUTC.weeks().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33721);assertEquals(true, isoUTC.days().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33722);assertEquals(true, isoUTC.halfdays().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33723);assertEquals(true, isoUTC.hours().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33724);assertEquals(true, isoUTC.minutes().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33725);assertEquals(true, isoUTC.seconds().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33726);assertEquals(true, isoUTC.millis().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33727);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1pympymle6qsff1.R.inc(33728);final ISOChronology isoGMT = ISOChronology.getInstance(gmt); 
     __CLR4_4_1pympymle6qsff1.R.inc(33729);assertEquals(false, isoGMT.centuries().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33730);assertEquals(false, isoGMT.years().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33731);assertEquals(false, isoGMT.weekyears().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33732);assertEquals(false, isoGMT.months().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33733);assertEquals(true, isoGMT.weeks().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33734);assertEquals(true, isoGMT.days().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33735);assertEquals(true, isoGMT.halfdays().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33736);assertEquals(true, isoGMT.hours().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33737);assertEquals(true, isoGMT.minutes().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33738);assertEquals(true, isoGMT.seconds().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33739);assertEquals(true, isoGMT.millis().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33740);final DateTimeZone offset = DateTimeZone.forOffsetHours(1); 
     __CLR4_4_1pympymle6qsff1.R.inc(33741);final ISOChronology isoOffset1 = ISOChronology.getInstance(offset); 
     __CLR4_4_1pympymle6qsff1.R.inc(33742);assertEquals(false, isoOffset1.centuries().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33743);assertEquals(false, isoOffset1.years().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33744);assertEquals(false, isoOffset1.weekyears().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33745);assertEquals(false, isoOffset1.months().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33746);assertEquals(true, isoOffset1.weeks().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33747);assertEquals(true, isoOffset1.days().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33748);assertEquals(true, isoOffset1.halfdays().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33749);assertEquals(true, isoOffset1.hours().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33750);assertEquals(true, isoOffset1.minutes().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33751);assertEquals(true, isoOffset1.seconds().isPrecise()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33752);assertEquals(true, isoOffset1.millis().isPrecise()); 
 }finally{__CLR4_4_1pympymle6qsff1.R.flushNeeded();}} 


public void testToString268() {__CLR4_4_1pympymle6qsff1.R.globalSliceStart(getClass().getName(),33753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wn223hq1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pympymle6qsff1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pympymle6qsff1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testToString268",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wn223hq1l(){try{__CLR4_4_1pympymle6qsff1.R.inc(33753); 
     __CLR4_4_1pympymle6qsff1.R.inc(33754);assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33755);assertEquals("ISOChronology[Asia/Tokyo]", ISOChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33756);assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance().toString()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33757);assertEquals("ISOChronology[UTC]", ISOChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1pympymle6qsff1.R.flushNeeded();}} 


public void testMinYear1113() {__CLR4_4_1pympymle6qsff1.R.globalSliceStart(getClass().getName(),33758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5rqw6q1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pympymle6qsff1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pympymle6qsff1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testMinYear1113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5rqw6q1q(){try{__CLR4_4_1pympymle6qsff1.R.inc(33758); 
     __CLR4_4_1pympymle6qsff1.R.inc(33759);final ISOChronology chrono = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1pympymle6qsff1.R.inc(33760);final int minYear = chrono.year().getMinimumValue(); 
     __CLR4_4_1pympymle6qsff1.R.inc(33761);DateTime start = new DateTime(minYear, 1, 1, 0, 0, 0, 0, chrono); 
     __CLR4_4_1pympymle6qsff1.R.inc(33762);DateTime end = new DateTime(minYear, 12, 31, 23, 59, 59, 999, chrono); 
     __CLR4_4_1pympymle6qsff1.R.inc(33763);assertTrue(start.getMillis() < 0); 
     __CLR4_4_1pympymle6qsff1.R.inc(33764);assertTrue(end.getMillis() > start.getMillis()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33765);assertEquals(minYear, start.getYear()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33766);assertEquals(minYear, end.getYear()); 
     __CLR4_4_1pympymle6qsff1.R.inc(33767);long delta = end.getMillis() - start.getMillis(); 
     __CLR4_4_1pympymle6qsff1.R.inc(33768);long expectedDelta = ((((start.year().isLeap() )&&(__CLR4_4_1pympymle6qsff1.R.iget(33769)!=0|true))||(__CLR4_4_1pympymle6qsff1.R.iget(33770)==0&false))? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1; 
     __CLR4_4_1pympymle6qsff1.R.inc(33771);assertEquals(expectedDelta, delta); 
     __CLR4_4_1pympymle6qsff1.R.inc(33772);assertEquals(start, new DateTime(minYear + "-01-01T00:00:00.000Z", chrono)); 
     __CLR4_4_1pympymle6qsff1.R.inc(33773);assertEquals(end, new DateTime(minYear + "-12-31T23:59:59.999Z", chrono)); 
     __CLR4_4_1pympymle6qsff1.R.inc(33774);try { 
         __CLR4_4_1pympymle6qsff1.R.inc(33775);start.minusYears(1); 
         __CLR4_4_1pympymle6qsff1.R.inc(33776);fail(); 
     } catch (IllegalFieldValueException e) { 
     } 
     __CLR4_4_1pympymle6qsff1.R.inc(33777);try { 
         __CLR4_4_1pympymle6qsff1.R.inc(33778);end.minusYears(1); 
         __CLR4_4_1pympymle6qsff1.R.inc(33779);fail(); 
     } catch (IllegalFieldValueException e) { 
     } 
     __CLR4_4_1pympymle6qsff1.R.inc(33780);assertEquals(minYear - 1, chrono.year().get(Long.MIN_VALUE)); 
 }finally{__CLR4_4_1pympymle6qsff1.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1pympymle6qsff1.R.inc(33781);
        __CLR4_4_1pympymle6qsff1.R.inc(33782);DateTime dtStart = new DateTime(start, ISOChronology.getInstanceUTC());
        __CLR4_4_1pympymle6qsff1.R.inc(33783);DateTime dtEnd = new DateTime(end, ISOChronology.getInstanceUTC());
        __CLR4_4_1pympymle6qsff1.R.inc(33784);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1pympymle6qsff1.R.inc(33785);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1pympymle6qsff1.R.inc(33786);DurationField field = type.getField(ISOChronology.getInstanceUTC());
        __CLR4_4_1pympymle6qsff1.R.inc(33787);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1pympymle6qsff1.R.inc(33788);assertEquals(amt, diff);
        
        __CLR4_4_1pympymle6qsff1.R.inc(33789);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1pympymle6qsff1.R.iget(33790)!=0|true))||(__CLR4_4_1pympymle6qsff1.R.iget(33791)==0&false))) {{
            __CLR4_4_1pympymle6qsff1.R.inc(33792);YearMonthDay ymdStart = new YearMonthDay(start, ISOChronology.getInstanceUTC());
            __CLR4_4_1pympymle6qsff1.R.inc(33793);YearMonthDay ymdEnd = new YearMonthDay(end, ISOChronology.getInstanceUTC());
            __CLR4_4_1pympymle6qsff1.R.inc(33794);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1pympymle6qsff1.R.inc(33795);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1pympymle6qsff1.R.flushNeeded();}}

    

    

    

}
