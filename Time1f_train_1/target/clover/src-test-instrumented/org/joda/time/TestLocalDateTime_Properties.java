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
public class TestLocalDateTime_Properties extends TestCase {static class __CLR4_4_1kgykgyle6qe9mq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,26675,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26530);
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26531);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26532);
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26533);return new TestSuite(TestLocalDateTime_Properties.class);
    }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}}

    public TestLocalDateTime_Properties(String name) {
        super(name);__CLR4_4_1kgykgyle6qe9mq.R.inc(26535);try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26534);
    }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26536);
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26537);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26538);zone = DateTimeZone.getDefault();
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26539);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26540);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26541);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26542);
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26543);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26544);DateTimeZone.setDefault(zone);
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26545);zone = null;
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26546);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26547);systemDefaultLocale = null;
    }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyAddWrapFieldToCopyMilli454() {__CLR4_4_1kgykgyle6qe9mq.R.globalSliceStart(getClass().getName(),26548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v37f7khg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgykgyle6qe9mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgykgyle6qe9mq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyMilli454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v37f7khg(){try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26548); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26549);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26550);LocalDateTime copy = test.millisOfSecond().addWrapFieldToCopy(9); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26551);check(test, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26552);check(copy, 2005, 6, 9, 10, 20, 30, 49); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26553);copy = test.millisOfSecond().addWrapFieldToCopy(995); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26554);check(copy, 2005, 6, 9, 10, 20, 30, 35); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26555);copy = test.millisOfSecond().addWrapFieldToCopy(-47); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26556);check(copy, 2005, 6, 9, 10, 20, 30, 993); 
 }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}} 


public void testPropertyGetMonth552() {__CLR4_4_1kgykgyle6qe9mq.R.globalSliceStart(getClass().getName(),26557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15xcqc8khp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgykgyle6qe9mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgykgyle6qe9mq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMonth552",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15xcqc8khp(){try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26557); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26558);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26559);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26560);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26561);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26562);assertSame(test, test.monthOfYear().getLocalDateTime()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26563);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26564);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26565);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26566);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26567);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26568);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26569);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26570);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26571);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26572);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26573);test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26574);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26575);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}} 


public void testPropertyCompareToDay923() {__CLR4_4_1kgykgyle6qe9mq.R.globalSliceStart(getClass().getName(),26576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q02g0yki8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgykgyle6qe9mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgykgyle6qe9mq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToDay923",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q02g0yki8(){try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26576); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26577);LocalDateTime test1 = new LocalDateTime(TEST_TIME1); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26578);LocalDateTime test2 = new LocalDateTime(TEST_TIME2); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26579);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26580);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26581);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26582);try { 
         __CLR4_4_1kgykgyle6qe9mq.R.inc(26583);test1.dayOfMonth().compareTo((ReadablePartial) null); 
         __CLR4_4_1kgykgyle6qe9mq.R.inc(26584);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26585);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26586);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26587);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26588);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26589);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26590);try { 
         __CLR4_4_1kgykgyle6qe9mq.R.inc(26591);test1.dayOfMonth().compareTo((ReadableInstant) null); 
         __CLR4_4_1kgykgyle6qe9mq.R.inc(26592);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}} 


public void testPropertyHashCode928() {__CLR4_4_1kgykgyle6qe9mq.R.globalSliceStart(getClass().getName(),26593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7znz0kip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgykgyle6qe9mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgykgyle6qe9mq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyHashCode928",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7znz0kip(){try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26593); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26594);LocalDateTime test1 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26595);LocalDateTime test2 = new LocalDateTime(2005, 11, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26596);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26597);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26598);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26599);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}} 


public void testPropertyAddToCopyMonth1289() {__CLR4_4_1kgykgyle6qe9mq.R.globalSliceStart(getClass().getName(),26600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1croqnkiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgykgyle6qe9mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgykgyle6qe9mq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyMonth1289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1croqnkiw(){try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26600); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26601);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26602);LocalDateTime copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26603);check(test, 1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26604);check(copy, 1972, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26605);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26606);check(copy, 1973, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26607);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26608);check(copy, 1972, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26609);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26610);check(copy, 1971, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26611);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26612);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26613);check(copy, 1972, 2, 29, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26614);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26615);check(copy, 1972, 3, 31, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26616);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26617);check(copy, 1972, 4, 30, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26618);test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26619);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26620);check(copy, 1971, 2, 28, 10, 20, 30, 40); 
 }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}} 


public void testPropertySetCopyYear1328() {__CLR4_4_1kgykgyle6qe9mq.R.globalSliceStart(getClass().getName(),26621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vuvyzgkjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgykgyle6qe9mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgykgyle6qe9mq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyYear1328",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vuvyzgkjh(){try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26621); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26622);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26623);LocalDateTime copy = test.year().setCopy(12); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26624);check(test, 1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26625);check(copy, 12, 6, 9, 10, 20, 30, 40); 
 }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}} 


public void testPropertyWithMaxMinValueHour1329() {__CLR4_4_1kgykgyle6qe9mq.R.globalSliceStart(getClass().getName(),26626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aamwakjm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgykgyle6qe9mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgykgyle6qe9mq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueHour1329",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aamwakjm(){try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26626); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26627);LocalDateTime test = new LocalDateTime(2005, 6, 9, 0, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26628);check(test.hourOfDay().withMaximumValue(), 2005, 6, 9, 23, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26629);check(test.hourOfDay().withMinimumValue(), 2005, 6, 9, 0, 20, 30, 40); 
 }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}} 


public void testPropertyGetMinute1330() {__CLR4_4_1kgykgyle6qe9mq.R.globalSliceStart(getClass().getName(),26630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k510p5kjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgykgyle6qe9mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgykgyle6qe9mq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMinute1330",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k510p5kjq(){try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26630); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26631);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26632);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26633);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26634);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26635);assertSame(test, test.minuteOfHour().getLocalDateTime()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26636);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26637);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26638);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26639);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26640);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26641);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26642);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26643);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26644);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26645);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}} 


public void testPropertySetTextSecond1331() {__CLR4_4_1kgykgyle6qe9mq.R.globalSliceStart(getClass().getName(),26646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s874arkk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgykgyle6qe9mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgykgyle6qe9mq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetTextSecond1331",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s874arkk6(){try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26646); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26647);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26648);LocalDateTime copy = test.secondOfMinute().setCopy("12"); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26649);check(test, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26650);check(copy, 2005, 6, 9, 10, 20, 12, 40); 
 }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}} 


public void testPropertyGetMilli1368() {__CLR4_4_1kgykgyle6qe9mq.R.globalSliceStart(getClass().getName(),26651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nebo6hkkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgykgyle6qe9mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgykgyle6qe9mq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMilli1368",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nebo6hkkb(){try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26651); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26652);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26653);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26654);assertEquals("millisOfSecond", test.millisOfSecond().getName()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26655);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26656);assertSame(test, test.millisOfSecond().getLocalDateTime()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26657);assertEquals(40, test.millisOfSecond().get()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26658);assertEquals("40", test.millisOfSecond().getAsString()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26659);assertEquals("40", test.millisOfSecond().getAsText()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26660);assertEquals("40", test.millisOfSecond().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26661);assertEquals("40", test.millisOfSecond().getAsShortText()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26662);assertEquals("40", test.millisOfSecond().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26663);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26664);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField()); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26665);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null)); 
     __CLR4_4_1kgykgyle6qe9mq.R.inc(26666);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1kgykgyle6qe9mq.R.inc(26667);
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26668);assertEquals(year, test.getYear());
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26669);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26670);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26671);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26672);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26673);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1kgykgyle6qe9mq.R.inc(26674);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1kgykgyle6qe9mq.R.flushNeeded();}}
}
