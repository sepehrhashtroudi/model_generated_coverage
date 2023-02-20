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
public class TestEthiopicChronology extends TestCase {static class __CLR4_4_1poupoule6rcmhf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,33446,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1poupoule6rcmhf.R.inc(33294);
        __CLR4_4_1poupoule6rcmhf.R.inc(33295);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1poupoule6rcmhf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1poupoule6rcmhf.R.inc(33296);
        __CLR4_4_1poupoule6rcmhf.R.inc(33297);SKIP = 1 * MILLIS_PER_DAY;
        __CLR4_4_1poupoule6rcmhf.R.inc(33298);return new TestSuite(TestEthiopicChronology.class);
    }finally{__CLR4_4_1poupoule6rcmhf.R.flushNeeded();}}

    public TestEthiopicChronology(String name) {
        super(name);__CLR4_4_1poupoule6rcmhf.R.inc(33300);try{__CLR4_4_1poupoule6rcmhf.R.inc(33299);
    }finally{__CLR4_4_1poupoule6rcmhf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1poupoule6rcmhf.R.inc(33301);
        __CLR4_4_1poupoule6rcmhf.R.inc(33302);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1poupoule6rcmhf.R.inc(33303);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1poupoule6rcmhf.R.inc(33304);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1poupoule6rcmhf.R.inc(33305);originalLocale = Locale.getDefault();
        __CLR4_4_1poupoule6rcmhf.R.inc(33306);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1poupoule6rcmhf.R.inc(33307);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1poupoule6rcmhf.R.inc(33308);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1poupoule6rcmhf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1poupoule6rcmhf.R.inc(33309);
        __CLR4_4_1poupoule6rcmhf.R.inc(33310);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1poupoule6rcmhf.R.inc(33311);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1poupoule6rcmhf.R.inc(33312);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1poupoule6rcmhf.R.inc(33313);Locale.setDefault(originalLocale);
        __CLR4_4_1poupoule6rcmhf.R.inc(33314);originalDateTimeZone = null;
        __CLR4_4_1poupoule6rcmhf.R.inc(33315);originalTimeZone = null;
        __CLR4_4_1poupoule6rcmhf.R.inc(33316);originalLocale = null;
    }finally{__CLR4_4_1poupoule6rcmhf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testDurationMonth307() {__CLR4_4_1poupoule6rcmhf.R.globalSliceStart(getClass().getName(),33317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qd0luvpph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1poupoule6rcmhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1poupoule6rcmhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationMonth307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qd0luvpph(){try{__CLR4_4_1poupoule6rcmhf.R.inc(33317); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33318);DateTime dt11 = new DateTime(1999, 11, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33319);DateTime dt12 = new DateTime(1999, 12, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33320);DateTime dt13 = new DateTime(1999, 13, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33321);DateTime dt01 = new DateTime(2000, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33322);DurationField fld = dt11.monthOfYear().getDurationField(); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33323);assertEquals(ETHIOPIC_UTC.months(), fld); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33324);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33325);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33326);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33327);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33328);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33329);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33330);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33331);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33332);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33333);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33334);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33335);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33336);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33337);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33338);assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33339);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33340);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33341);assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33342);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33343);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33344);assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33345);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33346);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33347);assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33348);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33349);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33350);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33351);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33352);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33353);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33354);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33355);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L)); 
 }finally{__CLR4_4_1poupoule6rcmhf.R.flushNeeded();}} 


public void testWithUTC751() {__CLR4_4_1poupoule6rcmhf.R.globalSliceStart(getClass().getName(),33356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uuyp76pqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1poupoule6rcmhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1poupoule6rcmhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testWithUTC751",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uuyp76pqk(){try{__CLR4_4_1poupoule6rcmhf.R.inc(33356); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33357);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33358);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33359);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33360);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance().withUTC()); 
 }finally{__CLR4_4_1poupoule6rcmhf.R.flushNeeded();}} 


public void testFactory_Zone752() {__CLR4_4_1poupoule6rcmhf.R.globalSliceStart(getClass().getName(),33361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z10u9kpqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1poupoule6rcmhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1poupoule6rcmhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testFactory_Zone752",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z10u9kpqp(){try{__CLR4_4_1poupoule6rcmhf.R.inc(33361); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33362);assertEquals(TOKYO, EthiopicChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33363);assertEquals(PARIS, EthiopicChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33364);assertEquals(LONDON, EthiopicChronology.getInstance(null).getZone()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33365);assertSame(EthiopicChronology.class, EthiopicChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1poupoule6rcmhf.R.flushNeeded();}} 


public void testDurationFields753() {__CLR4_4_1poupoule6rcmhf.R.globalSliceStart(getClass().getName(),33366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ryrodpqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1poupoule6rcmhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1poupoule6rcmhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationFields753",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ryrodpqu(){try{__CLR4_4_1poupoule6rcmhf.R.inc(33366); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33367);final EthiopicChronology ethiopic = EthiopicChronology.getInstance(); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33368);assertEquals("eras", ethiopic.eras().getName()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33369);assertEquals("centuries", ethiopic.centuries().getName()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33370);assertEquals("years", ethiopic.years().getName()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33371);assertEquals("weekyears", ethiopic.weekyears().getName()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33372);assertEquals("months", ethiopic.months().getName()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33373);assertEquals("weeks", ethiopic.weeks().getName()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33374);assertEquals("days", ethiopic.days().getName()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33375);assertEquals("halfdays", ethiopic.halfdays().getName()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33376);assertEquals("hours", ethiopic.hours().getName()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33377);assertEquals("minutes", ethiopic.minutes().getName()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33378);assertEquals("seconds", ethiopic.seconds().getName()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33379);assertEquals("millis", ethiopic.millis().getName()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33380);assertEquals(false, ethiopic.eras().isSupported()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33381);assertEquals(true, ethiopic.centuries().isSupported()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33382);assertEquals(true, ethiopic.years().isSupported()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33383);assertEquals(true, ethiopic.weekyears().isSupported()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33384);assertEquals(true, ethiopic.months().isSupported()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33385);assertEquals(true, ethiopic.weeks().isSupported()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33386);assertEquals(true, ethiopic.days().isSupported()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33387);assertEquals(true, ethiopic.halfdays().isSupported()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33388);assertEquals(true, ethiopic.hours().isSupported()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33389);assertEquals(true, ethiopic.minutes().isSupported()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33390);assertEquals(true, ethiopic.seconds().isSupported()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33391);assertEquals(true, ethiopic.millis().isSupported()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33392);assertEquals(false, ethiopic.centuries().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33393);assertEquals(false, ethiopic.years().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33394);assertEquals(false, ethiopic.weekyears().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33395);assertEquals(false, ethiopic.months().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33396);assertEquals(false, ethiopic.weeks().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33397);assertEquals(false, ethiopic.days().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33398);assertEquals(false, ethiopic.halfdays().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33399);assertEquals(true, ethiopic.hours().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33400);assertEquals(true, ethiopic.minutes().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33401);assertEquals(true, ethiopic.seconds().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33402);assertEquals(true, ethiopic.millis().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33403);final EthiopicChronology ethiopicUTC = EthiopicChronology.getInstanceUTC(); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33404);assertEquals(false, ethiopicUTC.centuries().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33405);assertEquals(false, ethiopicUTC.years().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33406);assertEquals(false, ethiopicUTC.weekyears().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33407);assertEquals(false, ethiopicUTC.months().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33408);assertEquals(true, ethiopicUTC.weeks().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33409);assertEquals(true, ethiopicUTC.days().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33410);assertEquals(true, ethiopicUTC.halfdays().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33411);assertEquals(true, ethiopicUTC.hours().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33412);assertEquals(true, ethiopicUTC.minutes().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33413);assertEquals(true, ethiopicUTC.seconds().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33414);assertEquals(true, ethiopicUTC.millis().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33415);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33416);final EthiopicChronology ethiopicGMT = EthiopicChronology.getInstance(gmt); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33417);assertEquals(false, ethiopicGMT.centuries().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33418);assertEquals(false, ethiopicGMT.years().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33419);assertEquals(false, ethiopicGMT.weekyears().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33420);assertEquals(false, ethiopicGMT.months().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33421);assertEquals(true, ethiopicGMT.weeks().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33422);assertEquals(true, ethiopicGMT.days().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33423);assertEquals(true, ethiopicGMT.halfdays().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33424);assertEquals(true, ethiopicGMT.hours().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33425);assertEquals(true, ethiopicGMT.minutes().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33426);assertEquals(true, ethiopicGMT.seconds().isPrecise()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33427);assertEquals(true, ethiopicGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1poupoule6rcmhf.R.flushNeeded();}} 


public void testWithZone754() {__CLR4_4_1poupoule6rcmhf.R.globalSliceStart(getClass().getName(),33428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdqgrdpsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1poupoule6rcmhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1poupoule6rcmhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testWithZone754",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdqgrdpsk(){try{__CLR4_4_1poupoule6rcmhf.R.inc(33428); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33429);assertSame(EthiopicChronology.getInstance(TOKYO), EthiopicChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33430);assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33431);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33432);assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33433);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33434);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1poupoule6rcmhf.R.flushNeeded();}} 


public void testSampleDateWithZone755() {__CLR4_4_1poupoule6rcmhf.R.globalSliceStart(getClass().getName(),33435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tfyvxepsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1poupoule6rcmhf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1poupoule6rcmhf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testSampleDateWithZone755",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tfyvxepsr(){try{__CLR4_4_1poupoule6rcmhf.R.inc(33435); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33436);DateTime dt = new DateTime(2004, 6, 9, 12, 0, 0, 0, PARIS).withChronology(ETHIOPIC_UTC); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33437);assertEquals(EthiopicChronology.EE, dt.getEra()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33438);assertEquals(1996, dt.getYear()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33439);assertEquals(1996, dt.getYearOfEra()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33440);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33441);assertEquals(2, dt.getDayOfMonth()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33442);assertEquals(10, dt.getHourOfDay()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33443);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33444);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1poupoule6rcmhf.R.inc(33445);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1poupoule6rcmhf.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

}
