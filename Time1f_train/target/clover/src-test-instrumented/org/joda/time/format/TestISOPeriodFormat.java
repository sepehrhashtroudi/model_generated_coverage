/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * This class is a Junit unit test for ISOPeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISOPeriodFormat extends TestCase {static class __CLR4_4_1vzwvzwlc8axf62{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,41558,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final Period PERIOD = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    private static final Period EMPTY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0);
    private static final Period YEAR_DAY_PERIOD = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
    private static final Period EMPTY_YEAR_DAY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime());
    private static final Period TIME_PERIOD = new Period(0, 0, 0, 0, 5, 6, 7, 8);
    private static final Period DATE_PERIOD = new Period(1, 2, 3, 4, 0, 0, 0, 0);

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

    public static void main(String[] args) {try{__CLR4_4_1vzwvzwlc8axf62.R.inc(41468);
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41469);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1vzwvzwlc8axf62.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1vzwvzwlc8axf62.R.inc(41470);
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41471);return new TestSuite(TestISOPeriodFormat.class);
    }finally{__CLR4_4_1vzwvzwlc8axf62.R.flushNeeded();}}

    public TestISOPeriodFormat(String name) {
        super(name);__CLR4_4_1vzwvzwlc8axf62.R.inc(41473);try{__CLR4_4_1vzwvzwlc8axf62.R.inc(41472);
    }finally{__CLR4_4_1vzwvzwlc8axf62.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1vzwvzwlc8axf62.R.inc(41474);
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41475);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41476);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41477);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41478);originalLocale = Locale.getDefault();
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41479);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41480);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41481);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1vzwvzwlc8axf62.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1vzwvzwlc8axf62.R.inc(41482);
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41483);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41484);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41485);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41486);Locale.setDefault(originalLocale);
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41487);originalDateTimeZone = null;
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41488);originalTimeZone = null;
        __CLR4_4_1vzwvzwlc8axf62.R.inc(41489);originalLocale = null;
    }finally{__CLR4_4_1vzwvzwlc8axf62.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormatStandard_negative421() {__CLR4_4_1vzwvzwlc8axf62.R.globalSliceStart(getClass().getName(),41490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zb75gw0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vzwvzwlc8axf62.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vzwvzwlc8axf62.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatStandard_negative421",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zb75gw0i(){try{__CLR4_4_1vzwvzwlc8axf62.R.inc(41490); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41491);Period p = new Period(-1, -2, -3, -4, -5, -6, -7, -8); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41492);assertEquals("P-1Y-2M-3W-4DT-5H-6M-7.008S", ISOPeriodFormat.standard().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41493);p = Period.years(-54); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41494);assertEquals("P-54Y", ISOPeriodFormat.standard().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41495);p = Period.seconds(4).withMillis(-8); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41496);assertEquals("PT3.992S", ISOPeriodFormat.standard().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41497);p = Period.seconds(-4).withMillis(8); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41498);assertEquals("PT-3.992S", ISOPeriodFormat.standard().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41499);p = Period.seconds(-23); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41500);assertEquals("PT-23S", ISOPeriodFormat.standard().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41501);p = Period.millis(-8); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41502);assertEquals("PT-0.008S", ISOPeriodFormat.standard().print(p)); 
 }finally{__CLR4_4_1vzwvzwlc8axf62.R.flushNeeded();}} 


public void testSubclassableConstructor426() {__CLR4_4_1vzwvzwlc8axf62.R.globalSliceStart(getClass().getName(),41503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlqbfbw0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vzwvzwlc8axf62.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vzwvzwlc8axf62.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testSubclassableConstructor426",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlqbfbw0v(){try{__CLR4_4_1vzwvzwlc8axf62.R.inc(41503); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41504);ISOPeriodFormat f = new ISOPeriodFormat() { 
     }; 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41505);assertNotNull(f); 
 }finally{__CLR4_4_1vzwvzwlc8axf62.R.flushNeeded();}} 


public void testFormatAlternateWithWeeks501() {__CLR4_4_1vzwvzwlc8axf62.R.globalSliceStart(getClass().getName(),41506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r55zp1w0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vzwvzwlc8axf62.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vzwvzwlc8axf62.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateWithWeeks501",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r55zp1w0y(){try{__CLR4_4_1vzwvzwlc8axf62.R.inc(41506); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41507);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41508);assertEquals("P0001W0304T050607.008", ISOPeriodFormat.alternateWithWeeks().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41509);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41510);assertEquals("P0001W0304T050607", ISOPeriodFormat.alternateWithWeeks().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41511);p = new Period(0); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41512);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41513);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41514);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41515);assertEquals("P0001W0004T050607.008", ISOPeriodFormat.alternateWithWeeks().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41516);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41517);assertEquals("P0001W0304T000000", ISOPeriodFormat.alternateWithWeeks().print(DATE_PERIOD)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41518);assertEquals("P0000W0000T050607.008", ISOPeriodFormat.alternateWithWeeks().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1vzwvzwlc8axf62.R.flushNeeded();}} 


public void testFormatAlternateExtended726() {__CLR4_4_1vzwvzwlc8axf62.R.globalSliceStart(getClass().getName(),41519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140pjp4w1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vzwvzwlc8axf62.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vzwvzwlc8axf62.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateExtended726",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140pjp4w1b(){try{__CLR4_4_1vzwvzwlc8axf62.R.inc(41519); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41520);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41521);assertEquals("P0001-02-04T05:06:07.008", ISOPeriodFormat.alternateExtended().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41522);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41523);assertEquals("P0001-02-04T05:06:07", ISOPeriodFormat.alternateExtended().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41524);p = new Period(0); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41525);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41526);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41527);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41528);assertEquals("P0001-00-04T05:06:07.008", ISOPeriodFormat.alternateExtended().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41529);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41530);assertEquals("P0001-02-04T00:00:00", ISOPeriodFormat.alternateExtended().print(DATE_PERIOD)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41531);assertEquals("P0000-00-00T05:06:07.008", ISOPeriodFormat.alternateExtended().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1vzwvzwlc8axf62.R.flushNeeded();}} 


public void testFormatAlternate764() {__CLR4_4_1vzwvzwlc8axf62.R.globalSliceStart(getClass().getName(),41532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1wgsrw1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vzwvzwlc8axf62.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vzwvzwlc8axf62.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternate764",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1wgsrw1o(){try{__CLR4_4_1vzwvzwlc8axf62.R.inc(41532); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41533);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41534);assertEquals("P00010204T050607.008", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41535);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41536);assertEquals("P00010204T050607", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41537);p = new Period(0); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41538);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41539);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41540);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41541);assertEquals("P00010004T050607.008", ISOPeriodFormat.alternate().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41542);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41543);assertEquals("P00010204T000000", ISOPeriodFormat.alternate().print(DATE_PERIOD)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41544);assertEquals("P00000000T050607.008", ISOPeriodFormat.alternate().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1vzwvzwlc8axf62.R.flushNeeded();}} 


public void testFormatAlternateExtendedWithWeeks1318() {__CLR4_4_1vzwvzwlc8axf62.R.globalSliceStart(getClass().getName(),41545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aa997jw21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vzwvzwlc8axf62.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vzwvzwlc8axf62.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateExtendedWithWeeks1318",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aa997jw21(){try{__CLR4_4_1vzwvzwlc8axf62.R.inc(41545); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41546);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41547);assertEquals("P0001-W03-04T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41548);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41549);assertEquals("P0001-W03-04T05:06:07", ISOPeriodFormat.alternateExtendedWithWeeks().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41550);p = new Period(0); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41551);assertEquals("P0000-W00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41552);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41553);assertEquals("P0000-W00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(p)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41554);assertEquals("P0001-W00-04T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41555);assertEquals("P0000-W00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41556);assertEquals("P0001-W03-04T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(DATE_PERIOD)); 
     __CLR4_4_1vzwvzwlc8axf62.R.inc(41557);assertEquals("P0000-W00-00T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1vzwvzwlc8axf62.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
