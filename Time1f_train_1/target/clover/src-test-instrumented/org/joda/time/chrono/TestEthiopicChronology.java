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

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for EthiopicChronology.
 *
 * @author Stephen Colebourne
 */
public class TestEthiopicChronology extends TestCase {static class __CLR4_4_1pt7pt7le6qeada{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,33668,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology ETHIOPIC_UTC = EthiopicChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1pt7pt7le6qeada.R.inc(33451);
        __CLR4_4_1pt7pt7le6qeada.R.inc(33452);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pt7pt7le6qeada.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pt7pt7le6qeada.R.inc(33453);
        __CLR4_4_1pt7pt7le6qeada.R.inc(33454);SKIP = 1 * MILLIS_PER_DAY;
        __CLR4_4_1pt7pt7le6qeada.R.inc(33455);return new TestSuite(TestEthiopicChronology.class);
    }finally{__CLR4_4_1pt7pt7le6qeada.R.flushNeeded();}}

    public TestEthiopicChronology(String name) {
        super(name);__CLR4_4_1pt7pt7le6qeada.R.inc(33457);try{__CLR4_4_1pt7pt7le6qeada.R.inc(33456);
    }finally{__CLR4_4_1pt7pt7le6qeada.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pt7pt7le6qeada.R.inc(33458);
        __CLR4_4_1pt7pt7le6qeada.R.inc(33459);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pt7pt7le6qeada.R.inc(33460);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pt7pt7le6qeada.R.inc(33461);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pt7pt7le6qeada.R.inc(33462);originalLocale = Locale.getDefault();
        __CLR4_4_1pt7pt7le6qeada.R.inc(33463);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pt7pt7le6qeada.R.inc(33464);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pt7pt7le6qeada.R.inc(33465);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pt7pt7le6qeada.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pt7pt7le6qeada.R.inc(33466);
        __CLR4_4_1pt7pt7le6qeada.R.inc(33467);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pt7pt7le6qeada.R.inc(33468);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pt7pt7le6qeada.R.inc(33469);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pt7pt7le6qeada.R.inc(33470);Locale.setDefault(originalLocale);
        __CLR4_4_1pt7pt7le6qeada.R.inc(33471);originalDateTimeZone = null;
        __CLR4_4_1pt7pt7le6qeada.R.inc(33472);originalTimeZone = null;
        __CLR4_4_1pt7pt7le6qeada.R.inc(33473);originalLocale = null;
    }finally{__CLR4_4_1pt7pt7le6qeada.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testDurationMonth294() {__CLR4_4_1pt7pt7le6qeada.R.globalSliceStart(getClass().getName(),33474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1235bbuptu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt7pt7le6qeada.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt7pt7le6qeada.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationMonth294",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1235bbuptu(){try{__CLR4_4_1pt7pt7le6qeada.R.inc(33474); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33475);DateTime dt11 = new DateTime(1999, 11, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33476);DateTime dt12 = new DateTime(1999, 12, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33477);DateTime dt13 = new DateTime(1999, 13, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33478);DateTime dt01 = new DateTime(2000, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33479);DurationField fld = dt11.monthOfYear().getDurationField(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33480);assertEquals(ETHIOPIC_UTC.months(), fld); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33481);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33482);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33483);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33484);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33485);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33486);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33487);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33488);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33489);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33490);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33491);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33492);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33493);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33494);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33495);assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33496);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33497);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33498);assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33499);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33500);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33501);assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33502);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33503);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33504);assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33505);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33506);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33507);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33508);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33509);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33510);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33511);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33512);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L)); 
 }finally{__CLR4_4_1pt7pt7le6qeada.R.flushNeeded();}} 


public void testFactory_Zone752() {__CLR4_4_1pt7pt7le6qeada.R.globalSliceStart(getClass().getName(),33513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z10u9kpux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt7pt7le6qeada.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt7pt7le6qeada.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testFactory_Zone752",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z10u9kpux(){try{__CLR4_4_1pt7pt7le6qeada.R.inc(33513); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33514);assertEquals(TOKYO, EthiopicChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33515);assertEquals(PARIS, EthiopicChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33516);assertEquals(LONDON, EthiopicChronology.getInstance(null).getZone()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33517);assertSame(EthiopicChronology.class, EthiopicChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1pt7pt7le6qeada.R.flushNeeded();}} 


public void testDurationFields753() {__CLR4_4_1pt7pt7le6qeada.R.globalSliceStart(getClass().getName(),33518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ryrodpv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt7pt7le6qeada.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt7pt7le6qeada.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationFields753",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ryrodpv2(){try{__CLR4_4_1pt7pt7le6qeada.R.inc(33518); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33519);final EthiopicChronology ethiopic = EthiopicChronology.getInstance(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33520);assertEquals("eras", ethiopic.eras().getName()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33521);assertEquals("centuries", ethiopic.centuries().getName()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33522);assertEquals("years", ethiopic.years().getName()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33523);assertEquals("weekyears", ethiopic.weekyears().getName()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33524);assertEquals("months", ethiopic.months().getName()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33525);assertEquals("weeks", ethiopic.weeks().getName()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33526);assertEquals("days", ethiopic.days().getName()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33527);assertEquals("halfdays", ethiopic.halfdays().getName()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33528);assertEquals("hours", ethiopic.hours().getName()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33529);assertEquals("minutes", ethiopic.minutes().getName()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33530);assertEquals("seconds", ethiopic.seconds().getName()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33531);assertEquals("millis", ethiopic.millis().getName()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33532);assertEquals(false, ethiopic.eras().isSupported()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33533);assertEquals(true, ethiopic.centuries().isSupported()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33534);assertEquals(true, ethiopic.years().isSupported()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33535);assertEquals(true, ethiopic.weekyears().isSupported()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33536);assertEquals(true, ethiopic.months().isSupported()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33537);assertEquals(true, ethiopic.weeks().isSupported()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33538);assertEquals(true, ethiopic.days().isSupported()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33539);assertEquals(true, ethiopic.halfdays().isSupported()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33540);assertEquals(true, ethiopic.hours().isSupported()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33541);assertEquals(true, ethiopic.minutes().isSupported()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33542);assertEquals(true, ethiopic.seconds().isSupported()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33543);assertEquals(true, ethiopic.millis().isSupported()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33544);assertEquals(false, ethiopic.centuries().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33545);assertEquals(false, ethiopic.years().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33546);assertEquals(false, ethiopic.weekyears().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33547);assertEquals(false, ethiopic.months().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33548);assertEquals(false, ethiopic.weeks().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33549);assertEquals(false, ethiopic.days().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33550);assertEquals(false, ethiopic.halfdays().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33551);assertEquals(true, ethiopic.hours().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33552);assertEquals(true, ethiopic.minutes().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33553);assertEquals(true, ethiopic.seconds().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33554);assertEquals(true, ethiopic.millis().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33555);final EthiopicChronology ethiopicUTC = EthiopicChronology.getInstanceUTC(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33556);assertEquals(false, ethiopicUTC.centuries().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33557);assertEquals(false, ethiopicUTC.years().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33558);assertEquals(false, ethiopicUTC.weekyears().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33559);assertEquals(false, ethiopicUTC.months().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33560);assertEquals(true, ethiopicUTC.weeks().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33561);assertEquals(true, ethiopicUTC.days().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33562);assertEquals(true, ethiopicUTC.halfdays().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33563);assertEquals(true, ethiopicUTC.hours().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33564);assertEquals(true, ethiopicUTC.minutes().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33565);assertEquals(true, ethiopicUTC.seconds().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33566);assertEquals(true, ethiopicUTC.millis().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33567);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33568);final EthiopicChronology ethiopicGMT = EthiopicChronology.getInstance(gmt); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33569);assertEquals(false, ethiopicGMT.centuries().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33570);assertEquals(false, ethiopicGMT.years().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33571);assertEquals(false, ethiopicGMT.weekyears().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33572);assertEquals(false, ethiopicGMT.months().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33573);assertEquals(true, ethiopicGMT.weeks().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33574);assertEquals(true, ethiopicGMT.days().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33575);assertEquals(true, ethiopicGMT.halfdays().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33576);assertEquals(true, ethiopicGMT.hours().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33577);assertEquals(true, ethiopicGMT.minutes().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33578);assertEquals(true, ethiopicGMT.seconds().isPrecise()); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33579);assertEquals(true, ethiopicGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1pt7pt7le6qeada.R.flushNeeded();}} 


public void testWithZone754() {__CLR4_4_1pt7pt7le6qeada.R.globalSliceStart(getClass().getName(),33580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdqgrdpws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt7pt7le6qeada.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt7pt7le6qeada.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testWithZone754",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdqgrdpws(){try{__CLR4_4_1pt7pt7le6qeada.R.inc(33580); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33581);assertSame(EthiopicChronology.getInstance(TOKYO), EthiopicChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33582);assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33583);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33584);assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33585);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33586);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1pt7pt7le6qeada.R.flushNeeded();}} 


public void testCalendar755() {__CLR4_4_1pt7pt7le6qeada.R.globalSliceStart(getClass().getName(),33587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdpyfipwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt7pt7le6qeada.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt7pt7le6qeada.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testCalendar755",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdpyfipwz(){try{__CLR4_4_1pt7pt7le6qeada.R.inc(33587); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33588);if ((((TestAll.FAST)&&(__CLR4_4_1pt7pt7le6qeada.R.iget(33589)!=0|true))||(__CLR4_4_1pt7pt7le6qeada.R.iget(33590)==0&false))) {{ 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33591);return; 
     } 
     }__CLR4_4_1pt7pt7le6qeada.R.inc(33592);System.out.println("\nTestEthiopicChronology.testCalendar"); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33593);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33594);long millis = epoch.getMillis(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33595);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33596);DateTimeField dayOfWeek = ETHIOPIC_UTC.dayOfWeek(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33597);DateTimeField dayOfYear = ETHIOPIC_UTC.dayOfYear(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33598);DateTimeField dayOfMonth = ETHIOPIC_UTC.dayOfMonth(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33599);DateTimeField monthOfYear = ETHIOPIC_UTC.monthOfYear(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33600);DateTimeField year = ETHIOPIC_UTC.year(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33601);DateTimeField yearOfEra = ETHIOPIC_UTC.yearOfEra(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33602);DateTimeField era = ETHIOPIC_UTC.era(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33603);int expectedDOW = new DateTime(8, 8, 29, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek(); 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33604);int expectedDOY = 1; 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33605);int expectedDay = 1; 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33606);int expectedMonth = 1; 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33607);int expectedYear = 1; 
     __CLR4_4_1pt7pt7le6qeada.R.inc(33608);while ((((millis < end)&&(__CLR4_4_1pt7pt7le6qeada.R.iget(33609)!=0|true))||(__CLR4_4_1pt7pt7le6qeada.R.iget(33610)==0&false))) {{ 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33611);int dowValue = dayOfWeek.get(millis); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33612);int doyValue = dayOfYear.get(millis); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33613);int dayValue = dayOfMonth.get(millis); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33614);int monthValue = monthOfYear.get(millis); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33615);int yearValue = year.get(millis); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33616);int yearOfEraValue = yearOfEra.get(millis); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33617);int monthLen = dayOfMonth.getMaximumValue(millis); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33618);if ((((monthValue < 1 || monthValue > 13)&&(__CLR4_4_1pt7pt7le6qeada.R.iget(33619)!=0|true))||(__CLR4_4_1pt7pt7le6qeada.R.iget(33620)==0&false))) {{ 
             __CLR4_4_1pt7pt7le6qeada.R.inc(33621);fail("Bad month: " + millis); 
         } 
         }__CLR4_4_1pt7pt7le6qeada.R.inc(33622);assertEquals(1, era.get(millis)); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33623);assertEquals("EE", era.getAsText(millis)); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33624);assertEquals("EE", era.getAsShortText(millis)); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33625);assertEquals(expectedYear, yearValue); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33626);assertEquals(expectedYear, yearOfEraValue); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33627);assertEquals(expectedMonth, monthValue); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33628);assertEquals(expectedDay, dayValue); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33629);assertEquals(expectedDOW, dowValue); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33630);assertEquals(expectedDOY, doyValue); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33631);assertEquals(yearValue % 4 == 3, year.isLeap(millis)); 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33632);if ((((monthValue == 13)&&(__CLR4_4_1pt7pt7le6qeada.R.iget(33633)!=0|true))||(__CLR4_4_1pt7pt7le6qeada.R.iget(33634)==0&false))) {{ 
             __CLR4_4_1pt7pt7le6qeada.R.inc(33635);assertEquals(yearValue % 4 == 3, monthOfYear.isLeap(millis)); 
             __CLR4_4_1pt7pt7le6qeada.R.inc(33636);if ((((yearValue % 4 == 3)&&(__CLR4_4_1pt7pt7le6qeada.R.iget(33637)!=0|true))||(__CLR4_4_1pt7pt7le6qeada.R.iget(33638)==0&false))) {{ 
                 __CLR4_4_1pt7pt7le6qeada.R.inc(33639);assertEquals(6, monthLen); 
             } }else {{ 
                 __CLR4_4_1pt7pt7le6qeada.R.inc(33640);assertEquals(5, monthLen); 
             } 
         }} }else {{ 
             __CLR4_4_1pt7pt7le6qeada.R.inc(33641);assertEquals(30, monthLen); 
         } 
         }__CLR4_4_1pt7pt7le6qeada.R.inc(33642);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1; 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33643);expectedDay++; 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33644);expectedDOY++; 
         __CLR4_4_1pt7pt7le6qeada.R.inc(33645);if ((((expectedDay == 31 && expectedMonth < 13)&&(__CLR4_4_1pt7pt7le6qeada.R.iget(33646)!=0|true))||(__CLR4_4_1pt7pt7le6qeada.R.iget(33647)==0&false))) {{ 
             __CLR4_4_1pt7pt7le6qeada.R.inc(33648);expectedDay = 1; 
             __CLR4_4_1pt7pt7le6qeada.R.inc(33649);expectedMonth++; 
         } }else {__CLR4_4_1pt7pt7le6qeada.R.inc(33650);if ((((expectedMonth == 13)&&(__CLR4_4_1pt7pt7le6qeada.R.iget(33651)!=0|true))||(__CLR4_4_1pt7pt7le6qeada.R.iget(33652)==0&false))) {{ 
             __CLR4_4_1pt7pt7le6qeada.R.inc(33653);if ((((expectedYear % 4 == 3 && expectedDay == 7)&&(__CLR4_4_1pt7pt7le6qeada.R.iget(33654)!=0|true))||(__CLR4_4_1pt7pt7le6qeada.R.iget(33655)==0&false))) {{ 
                 __CLR4_4_1pt7pt7le6qeada.R.inc(33656);expectedDay = 1; 
                 __CLR4_4_1pt7pt7le6qeada.R.inc(33657);expectedMonth = 1; 
                 __CLR4_4_1pt7pt7le6qeada.R.inc(33658);expectedYear++; 
                 __CLR4_4_1pt7pt7le6qeada.R.inc(33659);expectedDOY = 1; 
             } }else {__CLR4_4_1pt7pt7le6qeada.R.inc(33660);if ((((expectedYear % 4 != 3 && expectedDay == 6)&&(__CLR4_4_1pt7pt7le6qeada.R.iget(33661)!=0|true))||(__CLR4_4_1pt7pt7le6qeada.R.iget(33662)==0&false))) {{ 
                 __CLR4_4_1pt7pt7le6qeada.R.inc(33663);expectedDay = 1; 
                 __CLR4_4_1pt7pt7le6qeada.R.inc(33664);expectedMonth = 1; 
                 __CLR4_4_1pt7pt7le6qeada.R.inc(33665);expectedYear++; 
                 __CLR4_4_1pt7pt7le6qeada.R.inc(33666);expectedDOY = 1; 
             } 
         }}} 
         }}__CLR4_4_1pt7pt7le6qeada.R.inc(33667);millis += SKIP; 
     } 
 }}finally{__CLR4_4_1pt7pt7le6qeada.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

}
