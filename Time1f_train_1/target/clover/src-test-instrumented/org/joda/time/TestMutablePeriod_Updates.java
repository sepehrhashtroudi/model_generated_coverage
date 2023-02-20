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
package org.joda.time;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Updates extends TestCase {static class __CLR4_4_1mvamvale6qe9yn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,29931,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1mvamvale6qe9yn.R.inc(29638);
        __CLR4_4_1mvamvale6qe9yn.R.inc(29639);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mvamvale6qe9yn.R.inc(29640);
        __CLR4_4_1mvamvale6qe9yn.R.inc(29641);return new TestSuite(TestMutablePeriod_Updates.class);
    }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}}

    public TestMutablePeriod_Updates(String name) {
        super(name);__CLR4_4_1mvamvale6qe9yn.R.inc(29643);try{__CLR4_4_1mvamvale6qe9yn.R.inc(29642);
    }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mvamvale6qe9yn.R.inc(29644);
        __CLR4_4_1mvamvale6qe9yn.R.inc(29645);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mvamvale6qe9yn.R.inc(29646);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mvamvale6qe9yn.R.inc(29647);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mvamvale6qe9yn.R.inc(29648);originalLocale = Locale.getDefault();
        __CLR4_4_1mvamvale6qe9yn.R.inc(29649);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mvamvale6qe9yn.R.inc(29650);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mvamvale6qe9yn.R.inc(29651);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mvamvale6qe9yn.R.inc(29652);
        __CLR4_4_1mvamvale6qe9yn.R.inc(29653);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mvamvale6qe9yn.R.inc(29654);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mvamvale6qe9yn.R.inc(29655);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mvamvale6qe9yn.R.inc(29656);Locale.setDefault(originalLocale);
        __CLR4_4_1mvamvale6qe9yn.R.inc(29657);originalDateTimeZone = null;
        __CLR4_4_1mvamvale6qe9yn.R.inc(29658);originalTimeZone = null;
        __CLR4_4_1mvamvale6qe9yn.R.inc(29659);originalLocale = null;
    }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetPeriod_8ints1832() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uqbpdxmvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints1832",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uqbpdxmvw(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29660); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29661);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29662);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29663);assertEquals(11, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29664);assertEquals(12, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29665);assertEquals(13, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29666);assertEquals(14, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29667);assertEquals(15, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29668);assertEquals(16, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29669);assertEquals(17, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29670);assertEquals(18, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testSetWeeks833() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3ijv4mw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetWeeks833",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3ijv4mw7(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29671); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29672);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29673);test.setWeeks(10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29674);assertEquals(10, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29675);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29676);test.setWeeks(-10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29677);assertEquals(-10, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29678);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29679);test.setWeeks(0); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29680);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29681);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29682);test.setWeeks(3); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29683);assertEquals(3, test.getWeeks()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testAddDays834() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3f5d2mwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddDays834",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3f5d2mwk(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29684); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29685);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29686);test.addDays(10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29687);assertEquals(14, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29688);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29689);test.addDays(-10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29690);assertEquals(-6, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29691);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29692);test.addDays(0); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29693);assertEquals(4, test.getDays()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testMergePeriod_RP3835() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yv9ny4mwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP3835",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yv9ny4mwu(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29694); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29695);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29696);test.mergePeriod(new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 18)); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29697);assertEquals(0, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29698);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29699);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29700);assertEquals(0, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29701);assertEquals(0, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29702);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29703);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29704);assertEquals(18, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testAdd_RP4836() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1241ns4mx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP4836",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1241ns4mx5(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29705); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29706);MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29707);try { 
         __CLR4_4_1mvamvale6qe9yn.R.inc(29708);test.add(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
         __CLR4_4_1mvamvale6qe9yn.R.inc(29709);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29710);assertEquals(1, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29711);assertEquals(2, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29712);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29713);assertEquals(4, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29714);assertEquals(5, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29715);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29716);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29717);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testSetPeriod_long1945() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h20w1mmxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long1945",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h20w1mmxi(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29718); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29719);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29720);test.setPeriod(100L); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29721);assertEquals(0, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29722);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29723);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29724);assertEquals(0, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29725);assertEquals(0, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29726);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29727);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29728);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testSetPeriod_long21180() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19553a1mxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long21180",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19553a1mxt(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29729); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29730);MutablePeriod test = new MutablePeriod(); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29731);test.setPeriod((4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29732);assertEquals(0, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29733);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29734);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29735);assertEquals(0, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29736);assertEquals((450 * 24) + 5, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29737);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29738);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29739);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testSetHours1182() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mnl70gmy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetHours1182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mnl70gmy4(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29740); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29741);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29742);test.setHours(10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29743);assertEquals(10, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29744);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29745);test.setHours(-10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29746);assertEquals(-10, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29747);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29748);test.setHours(0); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29749);assertEquals(0, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29750);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29751);test.setHours(5); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29752);assertEquals(5, test.getHours()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testSetPeriod_8ints21183() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1voo47amyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints21183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1voo47amyh(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29753); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29754);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29755);try { 
         __CLR4_4_1mvamvale6qe9yn.R.inc(29756);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
         __CLR4_4_1mvamvale6qe9yn.R.inc(29757);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29758);assertEquals(0, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29759);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29760);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29761);assertEquals(0, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29762);assertEquals(0, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29763);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29764);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29765);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testClear1192() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14zjk4lmyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testClear1192",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14zjk4lmyu(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29766); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29767);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29768);test.clear(); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29769);assertEquals(new MutablePeriod(), test); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29770);test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29771);test.clear(); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29772);assertEquals(new MutablePeriod(PeriodType.yearMonthDayTime()), test); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testSetPeriod_RInterval11193() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s46zm1mz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval11193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s46zm1mz1(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29773); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29774);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29775);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29776);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29777);test.setPeriod(new Interval(dt1, dt2)); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29778);assertEquals(1, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29779);assertEquals(1, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29780);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29781);assertEquals(1, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29782);assertEquals(1, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29783);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29784);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29785);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testSetPeriod_RInterval21194() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vax81hmze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval21194",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vax81hmze(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29786); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29787);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29788);test.setPeriod((ReadableInterval) null); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29789);assertEquals(0, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29790);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29791);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29792);assertEquals(0, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29793);assertEquals(0, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29794);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29795);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29796);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testSetPeriod_RI_RI31195() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2n1vpmzp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI31195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2n1vpmzp(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29797); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29798);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29799);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29800);test.setPeriod(dt1, dt1); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29801);assertEquals(0, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29802);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29803);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29804);assertEquals(0, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29805);assertEquals(0, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29806);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29807);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29808);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testSetPeriod_RD31196() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e9somhn01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RD31196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e9somhn01(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29809); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29810);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29811);test.setPeriod((ReadableDuration) null); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29812);assertEquals(0, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29813);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29814);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29815);assertEquals(0, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29816);assertEquals(0, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29817);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29818);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29819);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testAdd_Field1197() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghob3ln0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_Field1197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghob3ln0c(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29820); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29821);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29822);test.add(DurationFieldType.years(), 10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29823);assertEquals(11, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29824);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29825);test.add(DurationFieldType.years(), 0); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29826);assertEquals(0, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29827);assertEquals(1, test.getMillis()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29828);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29829);try { 
         __CLR4_4_1mvamvale6qe9yn.R.inc(29830);test.add(null, 0); 
         __CLR4_4_1mvamvale6qe9yn.R.inc(29831);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29832);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29833);try { 
         __CLR4_4_1mvamvale6qe9yn.R.inc(29834);test.add(null, 10); 
         __CLR4_4_1mvamvale6qe9yn.R.inc(29835);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testAdd_8ints11198() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1acct79n0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_8ints11198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1acct79n0s(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29836); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29837);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29838);test.add(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29839);assertEquals(1, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29840);assertEquals(2, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29841);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29842);assertEquals(4, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29843);assertEquals(5, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29844);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29845);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29846);assertEquals(108, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testAdd_RD31199() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14td8iwn13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD31199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14td8iwn13(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29847); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29848);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29849);test.add((ReadableDuration) null); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29850);assertEquals(1, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29851);assertEquals(2, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29852);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29853);assertEquals(4, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29854);assertEquals(5, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29855);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29856);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29857);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testAdd_long11200() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sr35aln1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long11200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sr35aln1e(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29858); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29859);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29860);test.add(100L); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29861);assertEquals(0, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29862);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29863);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29864);assertEquals(0, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29865);assertEquals(0, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29866);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29867);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29868);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testAdd_long_Chronology11201() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mr00bzn1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long_Chronology11201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mr00bzn1p(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29869); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29870);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29871);test.add(100L, ISOChronology.getInstance()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29872);assertEquals(0, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29873);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29874);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29875);assertEquals(0, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29876);assertEquals(0, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29877);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29878);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29879);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testMergePeriod_RP51202() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15osykpn20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP51202",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15osykpn20(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29880); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29881);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29882);test.mergePeriod((ReadablePeriod) null); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29883);assertEquals(1, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29884);assertEquals(2, test.getMonths()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29885);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29886);assertEquals(4, test.getDays()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29887);assertEquals(5, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29888);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29889);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29890);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testAddYears1203() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ka87rin2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddYears1203",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ka87rin2b(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29891); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29892);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29893);test.addYears(10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29894);assertEquals(11, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29895);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29896);test.addYears(-10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29897);assertEquals(-9, test.getYears()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29898);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29899);test.addYears(0); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29900);assertEquals(1, test.getYears()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testAddHours1205() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163ivwtn2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddHours1205",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163ivwtn2l(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29901); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29902);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29903);test.addHours(10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29904);assertEquals(15, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29905);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29906);test.addHours(-10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29907);assertEquals(-5, test.getHours()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29908);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29909);test.addHours(0); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29910);assertEquals(5, test.getHours()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testAddMinutes1206() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xna64in2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMinutes1206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xna64in2v(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29911); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29912);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29913);test.addMinutes(10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29914);assertEquals(16, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29915);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29916);test.addMinutes(-10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29917);assertEquals(-4, test.getMinutes()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29918);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29919);test.addMinutes(0); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29920);assertEquals(6, test.getMinutes()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 


public void testAddSeconds1207() {__CLR4_4_1mvamvale6qe9yn.R.globalSliceStart(getClass().getName(),29921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njgy67n35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mvamvale6qe9yn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mvamvale6qe9yn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddSeconds1207",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njgy67n35(){try{__CLR4_4_1mvamvale6qe9yn.R.inc(29921); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29922);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29923);test.addSeconds(10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29924);assertEquals(17, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29925);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29926);test.addSeconds(-10); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29927);assertEquals(-3, test.getSeconds()); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29928);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29929);test.addSeconds(0); 
     __CLR4_4_1mvamvale6qe9yn.R.inc(29930);assertEquals(7, test.getSeconds()); 
 }finally{__CLR4_4_1mvamvale6qe9yn.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

//    public void testSetPeriod_long3() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    public void testSetPeriod_long4() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(12, test.getWeeks());
//        assertEquals(1, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    public void testSetPeriod_long_NoYears() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withYearsRemoved());
//        test.setPeriod(ms);
//        assertEquals(0, test.getYears());
//        assertEquals(15, test.getMonths()); // totalDays=365+85=450=15*30
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMonths() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMonthsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoWeeks() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType().withWeeksRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoDays() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withDaysRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5 + 25 * 24, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoHours() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withHoursRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(0, test.getHours());
//        assertEquals(6 + 5 * 60, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMinutes() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMinutesRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(0, test.getMinutes());
//        assertEquals(7 + 6 * 60, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoSeconds() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withSecondsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(0, test.getSeconds());
//        assertEquals(8 + 7 * 1000, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMillis() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMillisRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(0, test.getMillis());
//        assertEquals(ms - 8, test.toDurationMillis());
//    }

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}
