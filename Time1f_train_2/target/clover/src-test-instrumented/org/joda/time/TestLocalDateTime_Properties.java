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
public class TestLocalDateTime_Properties extends TestCase {static class __CLR4_4_1kedkedle6qsey7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,26580,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kedkedle6qsey7.R.inc(26437);
        __CLR4_4_1kedkedle6qsey7.R.inc(26438);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kedkedle6qsey7.R.inc(26439);
        __CLR4_4_1kedkedle6qsey7.R.inc(26440);return new TestSuite(TestLocalDateTime_Properties.class);
    }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}}

    public TestLocalDateTime_Properties(String name) {
        super(name);__CLR4_4_1kedkedle6qsey7.R.inc(26442);try{__CLR4_4_1kedkedle6qsey7.R.inc(26441);
    }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kedkedle6qsey7.R.inc(26443);
        __CLR4_4_1kedkedle6qsey7.R.inc(26444);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kedkedle6qsey7.R.inc(26445);zone = DateTimeZone.getDefault();
        __CLR4_4_1kedkedle6qsey7.R.inc(26446);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1kedkedle6qsey7.R.inc(26447);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kedkedle6qsey7.R.inc(26448);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kedkedle6qsey7.R.inc(26449);
        __CLR4_4_1kedkedle6qsey7.R.inc(26450);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kedkedle6qsey7.R.inc(26451);DateTimeZone.setDefault(zone);
        __CLR4_4_1kedkedle6qsey7.R.inc(26452);zone = null;
        __CLR4_4_1kedkedle6qsey7.R.inc(26453);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kedkedle6qsey7.R.inc(26454);systemDefaultLocale = null;
    }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyAddWrapFieldToCopyMilli428() {__CLR4_4_1kedkedle6qsey7.R.globalSliceStart(getClass().getName(),26455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149dl2ekev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6qsey7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6qsey7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyMilli428",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149dl2ekev(){try{__CLR4_4_1kedkedle6qsey7.R.inc(26455); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26456);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26457);LocalDateTime copy = test.millisOfSecond().addWrapFieldToCopy(9); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26458);check(test, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26459);check(copy, 2005, 6, 9, 10, 20, 30, 49); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26460);copy = test.millisOfSecond().addWrapFieldToCopy(995); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26461);check(copy, 2005, 6, 9, 10, 20, 30, 35); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26462);copy = test.millisOfSecond().addWrapFieldToCopy(-47); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26463);check(copy, 2005, 6, 9, 10, 20, 30, 993); 
 }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}} 


public void testPropertyGetMonth528() {__CLR4_4_1kedkedle6qsey7.R.globalSliceStart(getClass().getName(),26464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14jtl8vkf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6qsey7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6qsey7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMonth528",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14jtl8vkf4(){try{__CLR4_4_1kedkedle6qsey7.R.inc(26464); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26465);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26466);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26467);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26468);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26469);assertSame(test, test.monthOfYear().getLocalDateTime()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26470);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26471);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26472);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26473);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26474);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26475);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26476);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26477);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26478);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26479);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26480);test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26481);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26482);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}} 


public void testPropertyCompareToDay912() {__CLR4_4_1kedkedle6qsey7.R.globalSliceStart(getClass().getName(),26483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c26qm6kfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6qsey7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6qsey7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToDay912",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c26qm6kfn(){try{__CLR4_4_1kedkedle6qsey7.R.inc(26483); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26484);LocalDateTime test1 = new LocalDateTime(TEST_TIME1); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26485);LocalDateTime test2 = new LocalDateTime(TEST_TIME2); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26486);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26487);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26488);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26489);try { 
         __CLR4_4_1kedkedle6qsey7.R.inc(26490);test1.dayOfMonth().compareTo((ReadablePartial) null); 
         __CLR4_4_1kedkedle6qsey7.R.inc(26491);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kedkedle6qsey7.R.inc(26492);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26493);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26494);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26495);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26496);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26497);try { 
         __CLR4_4_1kedkedle6qsey7.R.inc(26498);test1.dayOfMonth().compareTo((ReadableInstant) null); 
         __CLR4_4_1kedkedle6qsey7.R.inc(26499);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}} 


public void testPropertyAddToCopyMonth1282() {__CLR4_4_1kedkedle6qsey7.R.globalSliceStart(getClass().getName(),26500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me82sokg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6qsey7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6qsey7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyMonth1282",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me82sokg4(){try{__CLR4_4_1kedkedle6qsey7.R.inc(26500); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26501);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26502);LocalDateTime copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26503);check(test, 1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26504);check(copy, 1972, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26505);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26506);check(copy, 1973, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26507);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26508);check(copy, 1972, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26509);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26510);check(copy, 1971, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26511);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26512);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26513);check(copy, 1972, 2, 29, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26514);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26515);check(copy, 1972, 3, 31, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26516);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26517);check(copy, 1972, 4, 30, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26518);test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26519);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26520);check(copy, 1971, 2, 28, 10, 20, 30, 40); 
 }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}} 


public void testPropertySetCopyYear1317() {__CLR4_4_1kedkedle6qsey7.R.globalSliceStart(getClass().getName(),26521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113ywckkgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6qsey7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6qsey7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyYear1317",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113ywckkgp(){try{__CLR4_4_1kedkedle6qsey7.R.inc(26521); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26522);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26523);LocalDateTime copy = test.year().setCopy(12); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26524);check(test, 1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26525);check(copy, 12, 6, 9, 10, 20, 30, 40); 
 }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}} 


public void testPropertyGetMinute1318() {__CLR4_4_1kedkedle6qsey7.R.globalSliceStart(getClass().getName(),26526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dap225kgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6qsey7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6qsey7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMinute1318",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dap225kgu(){try{__CLR4_4_1kedkedle6qsey7.R.inc(26526); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26527);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26528);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26529);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26530);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26531);assertSame(test, test.minuteOfHour().getLocalDateTime()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26532);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26533);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26534);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26535);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26536);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26537);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26538);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26539);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26540);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26541);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}} 


public void testPropertySetTextSecond1319() {__CLR4_4_1kedkedle6qsey7.R.globalSliceStart(getClass().getName(),26542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157iygjkha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6qsey7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6qsey7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetTextSecond1319",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157iygjkha(){try{__CLR4_4_1kedkedle6qsey7.R.inc(26542); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26543);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26544);LocalDateTime copy = test.secondOfMinute().setCopy("12"); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26545);check(test, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26546);check(copy, 2005, 6, 9, 10, 20, 12, 40); 
 }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}} 


public void testPropertyRoundHour1321() {__CLR4_4_1kedkedle6qsey7.R.globalSliceStart(getClass().getName(),26547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zg6m19khf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kedkedle6qsey7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kedkedle6qsey7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyRoundHour1321",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zg6m19khf(){try{__CLR4_4_1kedkedle6qsey7.R.inc(26547); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26548);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26549);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26550);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26551);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26552);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26553);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26554);test = new LocalDateTime(2005, 6, 9, 10, 40); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26555);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26556);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26557);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26558);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26559);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26560);test = new LocalDateTime(2005, 6, 9, 10, 30); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26561);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26562);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26563);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26564);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26565);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26566);test = new LocalDateTime(2005, 6, 9, 11, 30); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26567);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26568);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26569);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26570);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kedkedle6qsey7.R.inc(26571);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 12, 0, 0, 0); 
 }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1kedkedle6qsey7.R.inc(26572);
        __CLR4_4_1kedkedle6qsey7.R.inc(26573);assertEquals(year, test.getYear());
        __CLR4_4_1kedkedle6qsey7.R.inc(26574);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1kedkedle6qsey7.R.inc(26575);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1kedkedle6qsey7.R.inc(26576);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1kedkedle6qsey7.R.inc(26577);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1kedkedle6qsey7.R.inc(26578);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1kedkedle6qsey7.R.inc(26579);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1kedkedle6qsey7.R.flushNeeded();}}
}
