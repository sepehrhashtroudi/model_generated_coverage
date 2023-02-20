/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Properties extends TestCase {static class __CLR4_4_1kgqkgqle6rcl2e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,26630,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final CopticChronology COPTIC_UTC = CopticChronology.getInstanceUTC();

    private int MILLIS_OF_DAY =
        (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L);
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 4L * DateTimeConstants.MILLIS_PER_HOUR
        + 5L * DateTimeConstants.MILLIS_PER_MINUTE
        + 6L * DateTimeConstants.MILLIS_PER_SECOND
        + 7L;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1kgqkgqle6rcl2e.R.inc(26522);
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26523);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kgqkgqle6rcl2e.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kgqkgqle6rcl2e.R.inc(26524);
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26525);return new TestSuite(TestLocalDateTime_Properties.class);
    }finally{__CLR4_4_1kgqkgqle6rcl2e.R.flushNeeded();}}

    public TestLocalDateTime_Properties(String name) {
        super(name);__CLR4_4_1kgqkgqle6rcl2e.R.inc(26527);try{__CLR4_4_1kgqkgqle6rcl2e.R.inc(26526);
    }finally{__CLR4_4_1kgqkgqle6rcl2e.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kgqkgqle6rcl2e.R.inc(26528);
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26529);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26530);zone = DateTimeZone.getDefault();
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26531);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26532);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26533);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kgqkgqle6rcl2e.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kgqkgqle6rcl2e.R.inc(26534);
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26535);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26536);DateTimeZone.setDefault(zone);
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26537);zone = null;
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26538);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26539);systemDefaultLocale = null;
    }finally{__CLR4_4_1kgqkgqle6rcl2e.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyAddWrapFieldToCopyMilli463() {__CLR4_4_1kgqkgqle6rcl2e.R.globalSliceStart(getClass().getName(),26540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rby569kh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgqkgqle6rcl2e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgqkgqle6rcl2e.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyMilli463",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rby569kh8(){try{__CLR4_4_1kgqkgqle6rcl2e.R.inc(26540); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26541);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26542);LocalDateTime copy = test.millisOfSecond().addWrapFieldToCopy(9); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26543);check(test, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26544);check(copy, 2005, 6, 9, 10, 20, 30, 49); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26545);copy = test.millisOfSecond().addWrapFieldToCopy(995); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26546);check(copy, 2005, 6, 9, 10, 20, 30, 35); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26547);copy = test.millisOfSecond().addWrapFieldToCopy(-47); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26548);check(copy, 2005, 6, 9, 10, 20, 30, 993); 
 }finally{__CLR4_4_1kgqkgqle6rcl2e.R.flushNeeded();}} 


public void testPropertyHashCode919() {__CLR4_4_1kgqkgqle6rcl2e.R.globalSliceStart(getClass().getName(),26549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oc9g92khh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgqkgqle6rcl2e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgqkgqle6rcl2e.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyHashCode919",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oc9g92khh(){try{__CLR4_4_1kgqkgqle6rcl2e.R.inc(26549); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26550);LocalDateTime test1 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26551);LocalDateTime test2 = new LocalDateTime(2005, 11, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26552);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26553);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26554);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26555);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 }finally{__CLR4_4_1kgqkgqle6rcl2e.R.flushNeeded();}} 


public void testPropertyAddToCopyMonth1290() {__CLR4_4_1kgqkgqle6rcl2e.R.globalSliceStart(getClass().getName(),26556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmw5xkho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgqkgqle6rcl2e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgqkgqle6rcl2e.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyMonth1290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmw5xkho(){try{__CLR4_4_1kgqkgqle6rcl2e.R.inc(26556); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26557);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26558);LocalDateTime copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26559);check(test, 1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26560);check(copy, 1972, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26561);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26562);check(copy, 1973, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26563);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26564);check(copy, 1972, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26565);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26566);check(copy, 1971, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26567);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26568);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26569);check(copy, 1972, 2, 29, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26570);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26571);check(copy, 1972, 3, 31, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26572);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26573);check(copy, 1972, 4, 30, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26574);test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26575);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26576);check(copy, 1971, 2, 28, 10, 20, 30, 40); 
 }finally{__CLR4_4_1kgqkgqle6rcl2e.R.flushNeeded();}} 


public void testPropertyWithMaxMinValueHour1329() {__CLR4_4_1kgqkgqle6rcl2e.R.globalSliceStart(getClass().getName(),26577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aamwaki9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgqkgqle6rcl2e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgqkgqle6rcl2e.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueHour1329",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aamwaki9(){try{__CLR4_4_1kgqkgqle6rcl2e.R.inc(26577); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26578);LocalDateTime test = new LocalDateTime(2005, 6, 9, 0, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26579);check(test.hourOfDay().withMaximumValue(), 2005, 6, 9, 23, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26580);check(test.hourOfDay().withMinimumValue(), 2005, 6, 9, 0, 20, 30, 40); 
 }finally{__CLR4_4_1kgqkgqle6rcl2e.R.flushNeeded();}} 


public void testPropertyRoundHour1332() {__CLR4_4_1kgqkgqle6rcl2e.R.globalSliceStart(getClass().getName(),26581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12hbqp9kid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgqkgqle6rcl2e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgqkgqle6rcl2e.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyRoundHour1332",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12hbqp9kid(){try{__CLR4_4_1kgqkgqle6rcl2e.R.inc(26581); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26582);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26583);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26584);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26585);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26586);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26587);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26588);test = new LocalDateTime(2005, 6, 9, 10, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26589);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26590);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26591);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26592);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26593);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26594);test = new LocalDateTime(2005, 6, 9, 10, 30); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26595);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26596);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26597);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26598);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26599);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26600);test = new LocalDateTime(2005, 6, 9, 11, 30); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26601);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26602);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26603);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26604);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26605);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 12, 0, 0, 0); 
 }finally{__CLR4_4_1kgqkgqle6rcl2e.R.flushNeeded();}} 


public void testPropertyGetMilli1367() {__CLR4_4_1kgqkgqle6rcl2e.R.globalSliceStart(getClass().getName(),26606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k5bpe0kj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgqkgqle6rcl2e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgqkgqle6rcl2e.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMilli1367",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k5bpe0kj2(){try{__CLR4_4_1kgqkgqle6rcl2e.R.inc(26606); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26607);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26608);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26609);assertEquals("millisOfSecond", test.millisOfSecond().getName()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26610);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26611);assertSame(test, test.millisOfSecond().getLocalDateTime()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26612);assertEquals(40, test.millisOfSecond().get()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26613);assertEquals("40", test.millisOfSecond().getAsString()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26614);assertEquals("40", test.millisOfSecond().getAsText()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26615);assertEquals("40", test.millisOfSecond().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26616);assertEquals("40", test.millisOfSecond().getAsShortText()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26617);assertEquals("40", test.millisOfSecond().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26618);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26619);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField()); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26620);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null)); 
     __CLR4_4_1kgqkgqle6rcl2e.R.inc(26621);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1kgqkgqle6rcl2e.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1kgqkgqle6rcl2e.R.inc(26622);
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26623);assertEquals(year, test.getYear());
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26624);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26625);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26626);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26627);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26628);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1kgqkgqle6rcl2e.R.inc(26629);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1kgqkgqle6rcl2e.R.flushNeeded();}}
}
