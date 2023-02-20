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
public class TestLocalDateTime_Properties extends TestCase {static class __CLR4_4_1kibkible6rjcio{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,26719,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kibkible6rjcio.R.inc(26579);
        __CLR4_4_1kibkible6rjcio.R.inc(26580);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kibkible6rjcio.R.inc(26581);
        __CLR4_4_1kibkible6rjcio.R.inc(26582);return new TestSuite(TestLocalDateTime_Properties.class);
    }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}}

    public TestLocalDateTime_Properties(String name) {
        super(name);__CLR4_4_1kibkible6rjcio.R.inc(26584);try{__CLR4_4_1kibkible6rjcio.R.inc(26583);
    }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kibkible6rjcio.R.inc(26585);
        __CLR4_4_1kibkible6rjcio.R.inc(26586);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kibkible6rjcio.R.inc(26587);zone = DateTimeZone.getDefault();
        __CLR4_4_1kibkible6rjcio.R.inc(26588);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1kibkible6rjcio.R.inc(26589);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kibkible6rjcio.R.inc(26590);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kibkible6rjcio.R.inc(26591);
        __CLR4_4_1kibkible6rjcio.R.inc(26592);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kibkible6rjcio.R.inc(26593);DateTimeZone.setDefault(zone);
        __CLR4_4_1kibkible6rjcio.R.inc(26594);zone = null;
        __CLR4_4_1kibkible6rjcio.R.inc(26595);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kibkible6rjcio.R.inc(26596);systemDefaultLocale = null;
    }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyGetMonth563() {__CLR4_4_1kibkible6rjcio.R.globalSliceStart(getClass().getName(),26597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1i4zskit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kibkible6rjcio.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kibkible6rjcio.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMonth563",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1i4zskit(){try{__CLR4_4_1kibkible6rjcio.R.inc(26597); 
     __CLR4_4_1kibkible6rjcio.R.inc(26598);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26599);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26600);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26601);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26602);assertSame(test, test.monthOfYear().getLocalDateTime()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26603);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26604);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26605);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26606);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kibkible6rjcio.R.inc(26607);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26608);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kibkible6rjcio.R.inc(26609);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26610);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26611);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1kibkible6rjcio.R.inc(26612);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1kibkible6rjcio.R.inc(26613);test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26614);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kibkible6rjcio.R.inc(26615);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}} 


public void testPropertyCompareToDay937() {__CLR4_4_1kibkible6rjcio.R.globalSliceStart(getClass().getName(),26616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpsbohkjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kibkible6rjcio.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kibkible6rjcio.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToDay937",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpsbohkjc(){try{__CLR4_4_1kibkible6rjcio.R.inc(26616); 
     __CLR4_4_1kibkible6rjcio.R.inc(26617);LocalDateTime test1 = new LocalDateTime(TEST_TIME1); 
     __CLR4_4_1kibkible6rjcio.R.inc(26618);LocalDateTime test2 = new LocalDateTime(TEST_TIME2); 
     __CLR4_4_1kibkible6rjcio.R.inc(26619);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26620);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26621);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26622);try { 
         __CLR4_4_1kibkible6rjcio.R.inc(26623);test1.dayOfMonth().compareTo((ReadablePartial) null); 
         __CLR4_4_1kibkible6rjcio.R.inc(26624);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kibkible6rjcio.R.inc(26625);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1kibkible6rjcio.R.inc(26626);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1kibkible6rjcio.R.inc(26627);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26628);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26629);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26630);try { 
         __CLR4_4_1kibkible6rjcio.R.inc(26631);test1.dayOfMonth().compareTo((ReadableInstant) null); 
         __CLR4_4_1kibkible6rjcio.R.inc(26632);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}} 


public void testPropertyHashCode942() {__CLR4_4_1kibkible6rjcio.R.globalSliceStart(getClass().getName(),26633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jpqcd8kjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kibkible6rjcio.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kibkible6rjcio.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyHashCode942",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jpqcd8kjt(){try{__CLR4_4_1kibkible6rjcio.R.inc(26633); 
     __CLR4_4_1kibkible6rjcio.R.inc(26634);LocalDateTime test1 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26635);LocalDateTime test2 = new LocalDateTime(2005, 11, 9, 10, 20, 30, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26636);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26637);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26638);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26639);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}} 


public void testPropertySetCopyYear1333() {__CLR4_4_1kibkible6rjcio.R.globalSliceStart(getClass().getName(),26640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppd0eikk0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kibkible6rjcio.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kibkible6rjcio.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyYear1333",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppd0eikk0(){try{__CLR4_4_1kibkible6rjcio.R.inc(26640); 
     __CLR4_4_1kibkible6rjcio.R.inc(26641);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26642);LocalDateTime copy = test.year().setCopy(12); 
     __CLR4_4_1kibkible6rjcio.R.inc(26643);check(test, 1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26644);check(copy, 12, 6, 9, 10, 20, 30, 40); 
 }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}} 


public void testPropertyWithMaxMinValueHour1334() {__CLR4_4_1kibkible6rjcio.R.globalSliceStart(getClass().getName(),26645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dr5phgkk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kibkible6rjcio.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kibkible6rjcio.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueHour1334",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dr5phgkk5(){try{__CLR4_4_1kibkible6rjcio.R.inc(26645); 
     __CLR4_4_1kibkible6rjcio.R.inc(26646);LocalDateTime test = new LocalDateTime(2005, 6, 9, 0, 20, 30, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26647);check(test.hourOfDay().withMaximumValue(), 2005, 6, 9, 23, 20, 30, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26648);check(test.hourOfDay().withMinimumValue(), 2005, 6, 9, 0, 20, 30, 40); 
 }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}} 


public void testPropertyGetMinute1335() {__CLR4_4_1kibkible6rjcio.R.globalSliceStart(getClass().getName(),26649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yn37bmkk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kibkible6rjcio.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kibkible6rjcio.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMinute1335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yn37bmkk9(){try{__CLR4_4_1kibkible6rjcio.R.inc(26649); 
     __CLR4_4_1kibkible6rjcio.R.inc(26650);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26651);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26652);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26653);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26654);assertSame(test, test.minuteOfHour().getLocalDateTime()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26655);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26656);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26657);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26658);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kibkible6rjcio.R.inc(26659);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26660);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kibkible6rjcio.R.inc(26661);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26662);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26663);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1kibkible6rjcio.R.inc(26664);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}} 


public void testPropertySetTextSecond1336() {__CLR4_4_1kibkible6rjcio.R.globalSliceStart(getClass().getName(),26665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjx3q0kkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kibkible6rjcio.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kibkible6rjcio.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetTextSecond1336",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjx3q0kkp(){try{__CLR4_4_1kibkible6rjcio.R.inc(26665); 
     __CLR4_4_1kibkible6rjcio.R.inc(26666);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26667);LocalDateTime copy = test.secondOfMinute().setCopy("12"); 
     __CLR4_4_1kibkible6rjcio.R.inc(26668);check(test, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26669);check(copy, 2005, 6, 9, 10, 20, 12, 40); 
 }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}} 


public void testPropertyRoundHour1338() {__CLR4_4_1kibkible6rjcio.R.globalSliceStart(getClass().getName(),26670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h0o21lkku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kibkible6rjcio.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kibkible6rjcio.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyRoundHour1338",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h0o21lkku(){try{__CLR4_4_1kibkible6rjcio.R.inc(26670); 
     __CLR4_4_1kibkible6rjcio.R.inc(26671);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20); 
     __CLR4_4_1kibkible6rjcio.R.inc(26672);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26673);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26674);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26675);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26676);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26677);test = new LocalDateTime(2005, 6, 9, 10, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26678);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26679);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26680);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26681);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26682);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26683);test = new LocalDateTime(2005, 6, 9, 10, 30); 
     __CLR4_4_1kibkible6rjcio.R.inc(26684);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26685);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26686);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26687);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26688);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26689);test = new LocalDateTime(2005, 6, 9, 11, 30); 
     __CLR4_4_1kibkible6rjcio.R.inc(26690);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26691);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26692);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26693);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1kibkible6rjcio.R.inc(26694);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 12, 0, 0, 0); 
 }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}} 


public void testPropertyGetMilli1366() {__CLR4_4_1kibkible6rjcio.R.globalSliceStart(getClass().getName(),26695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gwbqljklj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kibkible6rjcio.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kibkible6rjcio.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMilli1366",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gwbqljklj(){try{__CLR4_4_1kibkible6rjcio.R.inc(26695); 
     __CLR4_4_1kibkible6rjcio.R.inc(26696);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kibkible6rjcio.R.inc(26697);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26698);assertEquals("millisOfSecond", test.millisOfSecond().getName()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26699);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26700);assertSame(test, test.millisOfSecond().getLocalDateTime()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26701);assertEquals(40, test.millisOfSecond().get()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26702);assertEquals("40", test.millisOfSecond().getAsString()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26703);assertEquals("40", test.millisOfSecond().getAsText()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26704);assertEquals("40", test.millisOfSecond().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kibkible6rjcio.R.inc(26705);assertEquals("40", test.millisOfSecond().getAsShortText()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26706);assertEquals("40", test.millisOfSecond().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kibkible6rjcio.R.inc(26707);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26708);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField()); 
     __CLR4_4_1kibkible6rjcio.R.inc(26709);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null)); 
     __CLR4_4_1kibkible6rjcio.R.inc(26710);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1kibkible6rjcio.R.inc(26711);
        __CLR4_4_1kibkible6rjcio.R.inc(26712);assertEquals(year, test.getYear());
        __CLR4_4_1kibkible6rjcio.R.inc(26713);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1kibkible6rjcio.R.inc(26714);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1kibkible6rjcio.R.inc(26715);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1kibkible6rjcio.R.inc(26716);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1kibkible6rjcio.R.inc(26717);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1kibkible6rjcio.R.inc(26718);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1kibkible6rjcio.R.flushNeeded();}}
}
