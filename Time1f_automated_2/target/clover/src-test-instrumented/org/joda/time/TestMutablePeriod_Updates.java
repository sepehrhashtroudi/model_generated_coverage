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
public class TestMutablePeriod_Updates extends TestCase {static class __CLR4_4_1j3fj3fle6nl8ec{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,24838,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1j3fj3fle6nl8ec.R.inc(24747);
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24748);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j3fj3fle6nl8ec.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j3fj3fle6nl8ec.R.inc(24749);
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24750);return new TestSuite(TestMutablePeriod_Updates.class);
    }finally{__CLR4_4_1j3fj3fle6nl8ec.R.flushNeeded();}}

    public TestMutablePeriod_Updates(String name) {
        super(name);__CLR4_4_1j3fj3fle6nl8ec.R.inc(24752);try{__CLR4_4_1j3fj3fle6nl8ec.R.inc(24751);
    }finally{__CLR4_4_1j3fj3fle6nl8ec.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j3fj3fle6nl8ec.R.inc(24753);
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24754);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24755);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24756);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24757);originalLocale = Locale.getDefault();
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24758);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24759);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24760);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j3fj3fle6nl8ec.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j3fj3fle6nl8ec.R.inc(24761);
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24762);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24763);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24764);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24765);Locale.setDefault(originalLocale);
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24766);originalDateTimeZone = null;
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24767);originalTimeZone = null;
        __CLR4_4_1j3fj3fle6nl8ec.R.inc(24768);originalLocale = null;
    }finally{__CLR4_4_1j3fj3fle6nl8ec.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSetWeeks365() {__CLR4_4_1j3fj3fle6nl8ec.R.globalSliceStart(getClass().getName(),24769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p77hoqj41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3fj3fle6nl8ec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3fj3fle6nl8ec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetWeeks365",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p77hoqj41(){try{__CLR4_4_1j3fj3fle6nl8ec.R.inc(24769); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24770);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24771);test.setWeeks(10); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24772);assertEquals(10, test.getWeeks()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24773);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24774);test.setWeeks(-10); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24775);assertEquals(-10, test.getWeeks()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24776);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24777);test.setWeeks(0); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24778);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24779);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24780);test.setWeeks(3); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24781);assertEquals(3, test.getWeeks()); 
 }finally{__CLR4_4_1j3fj3fle6nl8ec.R.flushNeeded();}}
public void testConstructor_long_PeriodType2492() throws Throwable {__CLR4_4_1j3fj3fle6nl8ec.R.globalSliceStart(getClass().getName(),24782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5yevj4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3fj3fle6nl8ec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3fj3fle6nl8ec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testConstructor_long_PeriodType2492",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5yevj4e() throws Throwable{try{__CLR4_4_1j3fj3fle6nl8ec.R.inc(24782); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24783);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24784);MutablePeriod test = new MutablePeriod(length, PeriodType.dayTime()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24785);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24786);assertEquals(0, test.getYears()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24787);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24788);assertEquals(64, test.getWeeks()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24789);assertEquals(2, test.getDays()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24790);assertEquals(5, test.getHours()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24791);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24792);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24793);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1j3fj3fle6nl8ec.R.flushNeeded();}}
public void testSetPeriod_8ints1500() {__CLR4_4_1j3fj3fle6nl8ec.R.globalSliceStart(getClass().getName(),24794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m2vty1j4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3fj3fle6nl8ec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3fj3fle6nl8ec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints1500",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m2vty1j4q(){try{__CLR4_4_1j3fj3fle6nl8ec.R.inc(24794); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24795);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24796);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24797);assertEquals(11, test.getYears()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24798);assertEquals(12, test.getMonths()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24799);assertEquals(13, test.getWeeks()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24800);assertEquals(14, test.getDays()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24801);assertEquals(15, test.getHours()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24802);assertEquals(16, test.getMinutes()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24803);assertEquals(15, test.getSeconds()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24804);assertEquals(16, test.getMillis()); 
 }finally{__CLR4_4_1j3fj3fle6nl8ec.R.flushNeeded();}}
public void testSetPeriod_RI_RI2501() {__CLR4_4_1j3fj3fle6nl8ec.R.globalSliceStart(getClass().getName(),24805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hokcxwj51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3fj3fle6nl8ec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3fj3fle6nl8ec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI2501",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hokcxwj51(){try{__CLR4_4_1j3fj3fle6nl8ec.R.inc(24805); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24806);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24807);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24808);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24809);test.setPeriod(dt2, dt1); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24810);assertEquals(-1, test.getYears()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24811);assertEquals(-1, test.getMonths()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24812);assertEquals(-1, test.getWeeks()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24813);assertEquals(-1, test.getDays()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24814);assertEquals(-1, test.getHours()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24815);assertEquals(-1, test.getMinutes()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24816);assertEquals(-1, test.getSeconds()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24817);assertEquals(-1, test.getMillis()); 
 }finally{__CLR4_4_1j3fj3fle6nl8ec.R.flushNeeded();}}
public void testAddDays504() {__CLR4_4_1j3fj3fle6nl8ec.R.globalSliceStart(getClass().getName(),24818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7sbjuj5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3fj3fle6nl8ec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3fj3fle6nl8ec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddDays504",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7sbjuj5e(){try{__CLR4_4_1j3fj3fle6nl8ec.R.inc(24818); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24819);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24820);test.addDays(10); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24821);assertEquals(15, test.getDays()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24822);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24823);test.addDays(-10); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24824);assertEquals(-5, test.getDays()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24825);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24826);test.addDays(0); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24827);assertEquals(5, test.getDays()); 
 }finally{__CLR4_4_1j3fj3fle6nl8ec.R.flushNeeded();}}
public void testAddMinutes506() {__CLR4_4_1j3fj3fle6nl8ec.R.globalSliceStart(getClass().getName(),24828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uqlv0uj5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3fj3fle6nl8ec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3fj3fle6nl8ec.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMinutes506",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uqlv0uj5o(){try{__CLR4_4_1j3fj3fle6nl8ec.R.inc(24828); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24829);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24830);test.addMinutes(10); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24831);assertEquals(15, test.getMinutes()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24832);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24833);test.addMinutes(-10); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24834);assertEquals(-5, test.getMinutes()); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24835);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24836);test.addMinutes(0); 
     __CLR4_4_1j3fj3fle6nl8ec.R.inc(24837);assertEquals(5, test.getMinutes()); 
 }finally{__CLR4_4_1j3fj3fle6nl8ec.R.flushNeeded();}}
    

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
