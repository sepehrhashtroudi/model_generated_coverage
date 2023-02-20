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
public class TestLocalDateTime_Properties extends TestCase {static class __CLR4_4_1i9li9lle6np4g9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,23737,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1i9li9lle6np4g9.R.inc(23673);
        __CLR4_4_1i9li9lle6np4g9.R.inc(23674);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i9li9lle6np4g9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i9li9lle6np4g9.R.inc(23675);
        __CLR4_4_1i9li9lle6np4g9.R.inc(23676);return new TestSuite(TestLocalDateTime_Properties.class);
    }finally{__CLR4_4_1i9li9lle6np4g9.R.flushNeeded();}}

    public TestLocalDateTime_Properties(String name) {
        super(name);__CLR4_4_1i9li9lle6np4g9.R.inc(23678);try{__CLR4_4_1i9li9lle6np4g9.R.inc(23677);
    }finally{__CLR4_4_1i9li9lle6np4g9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i9li9lle6np4g9.R.inc(23679);
        __CLR4_4_1i9li9lle6np4g9.R.inc(23680);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i9li9lle6np4g9.R.inc(23681);zone = DateTimeZone.getDefault();
        __CLR4_4_1i9li9lle6np4g9.R.inc(23682);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1i9li9lle6np4g9.R.inc(23683);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1i9li9lle6np4g9.R.inc(23684);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1i9li9lle6np4g9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i9li9lle6np4g9.R.inc(23685);
        __CLR4_4_1i9li9lle6np4g9.R.inc(23686);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i9li9lle6np4g9.R.inc(23687);DateTimeZone.setDefault(zone);
        __CLR4_4_1i9li9lle6np4g9.R.inc(23688);zone = null;
        __CLR4_4_1i9li9lle6np4g9.R.inc(23689);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1i9li9lle6np4g9.R.inc(23690);systemDefaultLocale = null;
    }finally{__CLR4_4_1i9li9lle6np4g9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyCompareToYear400() {__CLR4_4_1i9li9lle6np4g9.R.globalSliceStart(getClass().getName(),23691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m7bmtia3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9li9lle6np4g9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9li9lle6np4g9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToYear400",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m7bmtia3(){try{__CLR4_4_1i9li9lle6np4g9.R.inc(23691); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23692);DateTime test1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23693);DateTime test2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23694);assertEquals(true, test1.year().compareTo(test2) < 0); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23695);assertEquals(true, test2.year().compareTo(test1) > 0); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23696);assertEquals(true, test1.year().compareTo(test1) == 0); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23697);try { 
         __CLR4_4_1i9li9lle6np4g9.R.inc(23698);test1.year().compareTo((ReadableInstant) null); 
         __CLR4_4_1i9li9lle6np4g9.R.inc(23699);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23700);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23701);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23702);assertEquals(true, test1.year().compareTo(dt2) < 0); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23703);assertEquals(true, test2.year().compareTo(dt1) > 0); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23704);assertEquals(true, test1.year().compareTo(dt1) == 0); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23705);try { 
         __CLR4_4_1i9li9lle6np4g9.R.inc(23706);test1.year().compareTo((ReadableInstant) null); 
         __CLR4_4_1i9li9lle6np4g9.R.inc(23707);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i9li9lle6np4g9.R.flushNeeded();}}
public void testPropertyAddToCopyMonth551() {__CLR4_4_1i9li9lle6np4g9.R.globalSliceStart(getClass().getName(),23708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz4uzmiak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9li9lle6np4g9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9li9lle6np4g9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyMonth551",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz4uzmiak(){try{__CLR4_4_1i9li9lle6np4g9.R.inc(23708); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23709);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23710);LocalDateTime copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23711);check(test, 1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23712);check(copy, 1972, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23713);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23714);check(copy, 1973, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23715);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23716);check(copy, 1972, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23717);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23718);check(copy, 1971, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23719);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23720);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23721);check(copy, 1972, 2, 29, 10, 20, 30, 40); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23722);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23723);check(copy, 1972, 3, 31, 10, 20, 30, 40); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23724);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23725);check(copy, 1972, 4, 30, 10, 20, 30, 40); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23726);test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23727);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1i9li9lle6np4g9.R.inc(23728);check(copy, 1971, 2, 28, 10, 20, 30, 40); 
 }finally{__CLR4_4_1i9li9lle6np4g9.R.flushNeeded();}}
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1i9li9lle6np4g9.R.inc(23729);
        __CLR4_4_1i9li9lle6np4g9.R.inc(23730);assertEquals(year, test.getYear());
        __CLR4_4_1i9li9lle6np4g9.R.inc(23731);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1i9li9lle6np4g9.R.inc(23732);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1i9li9lle6np4g9.R.inc(23733);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1i9li9lle6np4g9.R.inc(23734);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1i9li9lle6np4g9.R.inc(23735);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1i9li9lle6np4g9.R.inc(23736);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1i9li9lle6np4g9.R.flushNeeded();}}
}
