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
public class TestMutablePeriod_Updates extends TestCase {static class __CLR4_4_1msemsele6rclot{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,29863,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1msemsele6rclot.R.inc(29534);
        __CLR4_4_1msemsele6rclot.R.inc(29535);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1msemsele6rclot.R.inc(29536);
        __CLR4_4_1msemsele6rclot.R.inc(29537);return new TestSuite(TestMutablePeriod_Updates.class);
    }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}}

    public TestMutablePeriod_Updates(String name) {
        super(name);__CLR4_4_1msemsele6rclot.R.inc(29539);try{__CLR4_4_1msemsele6rclot.R.inc(29538);
    }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1msemsele6rclot.R.inc(29540);
        __CLR4_4_1msemsele6rclot.R.inc(29541);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1msemsele6rclot.R.inc(29542);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1msemsele6rclot.R.inc(29543);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1msemsele6rclot.R.inc(29544);originalLocale = Locale.getDefault();
        __CLR4_4_1msemsele6rclot.R.inc(29545);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1msemsele6rclot.R.inc(29546);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1msemsele6rclot.R.inc(29547);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1msemsele6rclot.R.inc(29548);
        __CLR4_4_1msemsele6rclot.R.inc(29549);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1msemsele6rclot.R.inc(29550);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1msemsele6rclot.R.inc(29551);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1msemsele6rclot.R.inc(29552);Locale.setDefault(originalLocale);
        __CLR4_4_1msemsele6rclot.R.inc(29553);originalDateTimeZone = null;
        __CLR4_4_1msemsele6rclot.R.inc(29554);originalTimeZone = null;
        __CLR4_4_1msemsele6rclot.R.inc(29555);originalLocale = null;
    }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testAdd_RInterval169() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jb8rbomt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jb8rbomt0(){try{__CLR4_4_1msemsele6rclot.R.inc(29556); 
     __CLR4_4_1msemsele6rclot.R.inc(29557);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1msemsele6rclot.R.inc(29558);test.add(new Interval(100L, 200L)); 
     __CLR4_4_1msemsele6rclot.R.inc(29559);assertEquals(0, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29560);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29561);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29562);assertEquals(0, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29563);assertEquals(0, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29564);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29565);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29566);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testSetPeriod_8ints1827() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qtxa01mtb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints1827",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qtxa01mtb(){try{__CLR4_4_1msemsele6rclot.R.inc(29567); 
     __CLR4_4_1msemsele6rclot.R.inc(29568);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29569);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
     __CLR4_4_1msemsele6rclot.R.inc(29570);assertEquals(11, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29571);assertEquals(12, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29572);assertEquals(13, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29573);assertEquals(14, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29574);assertEquals(15, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29575);assertEquals(16, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29576);assertEquals(17, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29577);assertEquals(18, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testAddDays828() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7tv8fmtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddDays828",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7tv8fmtm(){try{__CLR4_4_1msemsele6rclot.R.inc(29578); 
     __CLR4_4_1msemsele6rclot.R.inc(29579);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29580);test.addDays(10); 
     __CLR4_4_1msemsele6rclot.R.inc(29581);assertEquals(14, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29582);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29583);test.addDays(-10); 
     __CLR4_4_1msemsele6rclot.R.inc(29584);assertEquals(-6, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29585);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29586);test.addDays(0); 
     __CLR4_4_1msemsele6rclot.R.inc(29587);assertEquals(4, test.getDays()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testMergePeriod_RP3829() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfzcndmtw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP3829",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfzcndmtw(){try{__CLR4_4_1msemsele6rclot.R.inc(29588); 
     __CLR4_4_1msemsele6rclot.R.inc(29589);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     __CLR4_4_1msemsele6rclot.R.inc(29590);test.mergePeriod(new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 18)); 
     __CLR4_4_1msemsele6rclot.R.inc(29591);assertEquals(0, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29592);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29593);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29594);assertEquals(0, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29595);assertEquals(0, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29596);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29597);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29598);assertEquals(18, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testAdd_RP4830() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lm1giymu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP4830",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lm1giymu7(){try{__CLR4_4_1msemsele6rclot.R.inc(29599); 
     __CLR4_4_1msemsele6rclot.R.inc(29600);MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1msemsele6rclot.R.inc(29601);try { 
         __CLR4_4_1msemsele6rclot.R.inc(29602);test.add(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
         __CLR4_4_1msemsele6rclot.R.inc(29603);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1msemsele6rclot.R.inc(29604);assertEquals(1, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29605);assertEquals(2, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29606);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29607);assertEquals(4, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29608);assertEquals(5, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29609);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29610);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29611);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testSetPeriod_long1934() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwtzaemuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long1934",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwtzaemuk(){try{__CLR4_4_1msemsele6rclot.R.inc(29612); 
     __CLR4_4_1msemsele6rclot.R.inc(29613);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29614);test.setPeriod(100L); 
     __CLR4_4_1msemsele6rclot.R.inc(29615);assertEquals(0, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29616);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29617);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29618);assertEquals(0, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29619);assertEquals(0, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29620);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29621);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29622);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testSetPeriod_long_long_NoMinutes1174() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppyt90muv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoMinutes1174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppyt90muv(){try{__CLR4_4_1msemsele6rclot.R.inc(29623); 
     __CLR4_4_1msemsele6rclot.R.inc(29624);MutablePeriod test = new MutablePeriod(PeriodType.standard().withMinutesRemoved()); 
     __CLR4_4_1msemsele6rclot.R.inc(29625);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1msemsele6rclot.R.inc(29626);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1msemsele6rclot.R.inc(29627);test.setPeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1msemsele6rclot.R.inc(29628);assertEquals(1, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29629);assertEquals(1, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29630);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29631);assertEquals(1, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29632);assertEquals(1, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29633);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29634);assertEquals(61, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29635);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testSetHours1176() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnntl1mv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetHours1176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnntl1mv8(){try{__CLR4_4_1msemsele6rclot.R.inc(29636); 
     __CLR4_4_1msemsele6rclot.R.inc(29637);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29638);test.setHours(10); 
     __CLR4_4_1msemsele6rclot.R.inc(29639);assertEquals(10, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29640);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29641);test.setHours(-10); 
     __CLR4_4_1msemsele6rclot.R.inc(29642);assertEquals(-10, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29643);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29644);test.setHours(0); 
     __CLR4_4_1msemsele6rclot.R.inc(29645);assertEquals(0, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29646);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29647);test.setHours(5); 
     __CLR4_4_1msemsele6rclot.R.inc(29648);assertEquals(5, test.getHours()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testSetYears1177() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0wma5mvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetYears1177",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0wma5mvl(){try{__CLR4_4_1msemsele6rclot.R.inc(29649); 
     __CLR4_4_1msemsele6rclot.R.inc(29650);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29651);test.setYears(10); 
     __CLR4_4_1msemsele6rclot.R.inc(29652);assertEquals(10, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29653);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29654);test.setYears(-10); 
     __CLR4_4_1msemsele6rclot.R.inc(29655);assertEquals(-10, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29656);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29657);test.setYears(0); 
     __CLR4_4_1msemsele6rclot.R.inc(29658);assertEquals(0, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29659);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29660);test.setYears(1); 
     __CLR4_4_1msemsele6rclot.R.inc(29661);assertEquals(1, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29662);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1msemsele6rclot.R.inc(29663);try { 
         __CLR4_4_1msemsele6rclot.R.inc(29664);test.setYears(1); 
         __CLR4_4_1msemsele6rclot.R.inc(29665);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testSetPeriod_8ints21178() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7t1m4mw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints21178",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7t1m4mw2(){try{__CLR4_4_1msemsele6rclot.R.inc(29666); 
     __CLR4_4_1msemsele6rclot.R.inc(29667);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     __CLR4_4_1msemsele6rclot.R.inc(29668);try { 
         __CLR4_4_1msemsele6rclot.R.inc(29669);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
         __CLR4_4_1msemsele6rclot.R.inc(29670);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1msemsele6rclot.R.inc(29671);assertEquals(0, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29672);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29673);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29674);assertEquals(0, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29675);assertEquals(0, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29676);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29677);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29678);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testClear1190() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhjhpjmwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testClear1190",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhjhpjmwf(){try{__CLR4_4_1msemsele6rclot.R.inc(29679); 
     __CLR4_4_1msemsele6rclot.R.inc(29680);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29681);test.clear(); 
     __CLR4_4_1msemsele6rclot.R.inc(29682);assertEquals(new MutablePeriod(), test); 
     __CLR4_4_1msemsele6rclot.R.inc(29683);test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1msemsele6rclot.R.inc(29684);test.clear(); 
     __CLR4_4_1msemsele6rclot.R.inc(29685);assertEquals(new MutablePeriod(PeriodType.yearMonthDayTime()), test); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testSet_Field1191() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywv506mwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSet_Field1191",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywv506mwm(){try{__CLR4_4_1msemsele6rclot.R.inc(29686); 
     __CLR4_4_1msemsele6rclot.R.inc(29687);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29688);test.set(DurationFieldType.years(), 10); 
     __CLR4_4_1msemsele6rclot.R.inc(29689);assertEquals(10, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29690);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29691);try { 
         __CLR4_4_1msemsele6rclot.R.inc(29692);test.set(null, 10); 
         __CLR4_4_1msemsele6rclot.R.inc(29693);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testSetPeriod_RInterval11192() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ov70tkmwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval11192",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ov70tkmwu(){try{__CLR4_4_1msemsele6rclot.R.inc(29694); 
     __CLR4_4_1msemsele6rclot.R.inc(29695);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29696);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1msemsele6rclot.R.inc(29697);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1msemsele6rclot.R.inc(29698);test.setPeriod(new Interval(dt1, dt2)); 
     __CLR4_4_1msemsele6rclot.R.inc(29699);assertEquals(1, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29700);assertEquals(1, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29701);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29702);assertEquals(1, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29703);assertEquals(1, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29704);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29705);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29706);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testSetPeriod_RInterval21193() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yjx6tymx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval21193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yjx6tymx7(){try{__CLR4_4_1msemsele6rclot.R.inc(29707); 
     __CLR4_4_1msemsele6rclot.R.inc(29708);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29709);test.setPeriod((ReadableInterval) null); 
     __CLR4_4_1msemsele6rclot.R.inc(29710);assertEquals(0, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29711);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29712);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29713);assertEquals(0, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29714);assertEquals(0, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29715);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29716);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29717);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testSetPeriod_RI_RI21194() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gn7k3mxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI21194",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gn7k3mxi(){try{__CLR4_4_1msemsele6rclot.R.inc(29718); 
     __CLR4_4_1msemsele6rclot.R.inc(29719);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29720);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1msemsele6rclot.R.inc(29721);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1msemsele6rclot.R.inc(29722);test.setPeriod(dt2, dt1); 
     __CLR4_4_1msemsele6rclot.R.inc(29723);assertEquals(-1, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29724);assertEquals(-1, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29725);assertEquals(-1, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29726);assertEquals(-1, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29727);assertEquals(-1, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29728);assertEquals(-1, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29729);assertEquals(-1, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29730);assertEquals(-1, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testSetPeriod_RI_RI31195() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2n1vpmxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI31195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2n1vpmxv(){try{__CLR4_4_1msemsele6rclot.R.inc(29731); 
     __CLR4_4_1msemsele6rclot.R.inc(29732);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29733);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1msemsele6rclot.R.inc(29734);test.setPeriod(dt1, dt1); 
     __CLR4_4_1msemsele6rclot.R.inc(29735);assertEquals(0, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29736);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29737);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29738);assertEquals(0, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29739);assertEquals(0, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29740);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29741);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29742);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testSetPeriod_RD31196() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e9somhmy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RD31196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e9somhmy7(){try{__CLR4_4_1msemsele6rclot.R.inc(29743); 
     __CLR4_4_1msemsele6rclot.R.inc(29744);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29745);test.setPeriod((ReadableDuration) null); 
     __CLR4_4_1msemsele6rclot.R.inc(29746);assertEquals(0, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29747);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29748);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29749);assertEquals(0, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29750);assertEquals(0, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29751);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29752);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29753);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testAdd_Field1197() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghob3lmyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_Field1197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghob3lmyi(){try{__CLR4_4_1msemsele6rclot.R.inc(29754); 
     __CLR4_4_1msemsele6rclot.R.inc(29755);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29756);test.add(DurationFieldType.years(), 10); 
     __CLR4_4_1msemsele6rclot.R.inc(29757);assertEquals(11, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29758);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1msemsele6rclot.R.inc(29759);test.add(DurationFieldType.years(), 0); 
     __CLR4_4_1msemsele6rclot.R.inc(29760);assertEquals(0, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29761);assertEquals(1, test.getMillis()); 
     __CLR4_4_1msemsele6rclot.R.inc(29762);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29763);try { 
         __CLR4_4_1msemsele6rclot.R.inc(29764);test.add(null, 0); 
         __CLR4_4_1msemsele6rclot.R.inc(29765);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1msemsele6rclot.R.inc(29766);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29767);try { 
         __CLR4_4_1msemsele6rclot.R.inc(29768);test.add(null, 10); 
         __CLR4_4_1msemsele6rclot.R.inc(29769);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testAdd_RD31198() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182d7bdmyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD31198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182d7bdmyy(){try{__CLR4_4_1msemsele6rclot.R.inc(29770); 
     __CLR4_4_1msemsele6rclot.R.inc(29771);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29772);test.add((ReadableDuration) null); 
     __CLR4_4_1msemsele6rclot.R.inc(29773);assertEquals(1, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29774);assertEquals(2, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29775);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29776);assertEquals(4, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29777);assertEquals(5, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29778);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29779);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29780);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testAdd_RD11199() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljczl6mz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD11199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljczl6mz9(){try{__CLR4_4_1msemsele6rclot.R.inc(29781); 
     __CLR4_4_1msemsele6rclot.R.inc(29782);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1msemsele6rclot.R.inc(29783);test.add(new Duration(100L)); 
     __CLR4_4_1msemsele6rclot.R.inc(29784);assertEquals(0, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29785);assertEquals(0, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29786);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29787);assertEquals(0, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29788);assertEquals(0, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29789);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29790);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29791);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testMergePeriod_RP51200() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6z09mzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP51200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6z09mzk(){try{__CLR4_4_1msemsele6rclot.R.inc(29792); 
     __CLR4_4_1msemsele6rclot.R.inc(29793);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29794);test.mergePeriod((ReadablePeriod) null); 
     __CLR4_4_1msemsele6rclot.R.inc(29795);assertEquals(1, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29796);assertEquals(2, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29797);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29798);assertEquals(4, test.getDays()); 
     __CLR4_4_1msemsele6rclot.R.inc(29799);assertEquals(5, test.getHours()); 
     __CLR4_4_1msemsele6rclot.R.inc(29800);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29801);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29802);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testAddYears1201() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qs85cgmzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddYears1201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qs85cgmzv(){try{__CLR4_4_1msemsele6rclot.R.inc(29803); 
     __CLR4_4_1msemsele6rclot.R.inc(29804);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29805);test.addYears(10); 
     __CLR4_4_1msemsele6rclot.R.inc(29806);assertEquals(11, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29807);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29808);test.addYears(-10); 
     __CLR4_4_1msemsele6rclot.R.inc(29809);assertEquals(-9, test.getYears()); 
     __CLR4_4_1msemsele6rclot.R.inc(29810);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29811);test.addYears(0); 
     __CLR4_4_1msemsele6rclot.R.inc(29812);assertEquals(1, test.getYears()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testAddMonths1203() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ac0iy5n05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMonths1203",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ac0iy5n05(){try{__CLR4_4_1msemsele6rclot.R.inc(29813); 
     __CLR4_4_1msemsele6rclot.R.inc(29814);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29815);test.addMonths(10); 
     __CLR4_4_1msemsele6rclot.R.inc(29816);assertEquals(12, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29817);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29818);test.addMonths(-10); 
     __CLR4_4_1msemsele6rclot.R.inc(29819);assertEquals(-8, test.getMonths()); 
     __CLR4_4_1msemsele6rclot.R.inc(29820);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29821);test.addMonths(0); 
     __CLR4_4_1msemsele6rclot.R.inc(29822);assertEquals(2, test.getMonths()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testAddWeeks1204() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g80qvwn0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddWeeks1204",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g80qvwn0f(){try{__CLR4_4_1msemsele6rclot.R.inc(29823); 
     __CLR4_4_1msemsele6rclot.R.inc(29824);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29825);test.addWeeks(10); 
     __CLR4_4_1msemsele6rclot.R.inc(29826);assertEquals(13, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29827);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29828);test.addWeeks(-10); 
     __CLR4_4_1msemsele6rclot.R.inc(29829);assertEquals(-7, test.getWeeks()); 
     __CLR4_4_1msemsele6rclot.R.inc(29830);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29831);test.addWeeks(0); 
     __CLR4_4_1msemsele6rclot.R.inc(29832);assertEquals(3, test.getWeeks()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testAddMinutes1205() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y4tx25n0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMinutes1205",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y4tx25n0p(){try{__CLR4_4_1msemsele6rclot.R.inc(29833); 
     __CLR4_4_1msemsele6rclot.R.inc(29834);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29835);test.addMinutes(10); 
     __CLR4_4_1msemsele6rclot.R.inc(29836);assertEquals(16, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29837);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29838);test.addMinutes(-10); 
     __CLR4_4_1msemsele6rclot.R.inc(29839);assertEquals(-4, test.getMinutes()); 
     __CLR4_4_1msemsele6rclot.R.inc(29840);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29841);test.addMinutes(0); 
     __CLR4_4_1msemsele6rclot.R.inc(29842);assertEquals(6, test.getMinutes()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testAddSeconds1206() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kagzdqn0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddSeconds1206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kagzdqn0z(){try{__CLR4_4_1msemsele6rclot.R.inc(29843); 
     __CLR4_4_1msemsele6rclot.R.inc(29844);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29845);test.addSeconds(10); 
     __CLR4_4_1msemsele6rclot.R.inc(29846);assertEquals(17, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29847);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29848);test.addSeconds(-10); 
     __CLR4_4_1msemsele6rclot.R.inc(29849);assertEquals(-3, test.getSeconds()); 
     __CLR4_4_1msemsele6rclot.R.inc(29850);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29851);test.addSeconds(0); 
     __CLR4_4_1msemsele6rclot.R.inc(29852);assertEquals(7, test.getSeconds()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 


public void testAddMillis1207() {__CLR4_4_1msemsele6rclot.R.globalSliceStart(getClass().getName(),29853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iqo7acn19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1msemsele6rclot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1msemsele6rclot.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMillis1207",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iqo7acn19(){try{__CLR4_4_1msemsele6rclot.R.inc(29853); 
     __CLR4_4_1msemsele6rclot.R.inc(29854);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29855);test.addMillis(10); 
     __CLR4_4_1msemsele6rclot.R.inc(29856);assertEquals(18, test.getMillis()); 
     __CLR4_4_1msemsele6rclot.R.inc(29857);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29858);test.addMillis(-10); 
     __CLR4_4_1msemsele6rclot.R.inc(29859);assertEquals(-2, test.getMillis()); 
     __CLR4_4_1msemsele6rclot.R.inc(29860);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1msemsele6rclot.R.inc(29861);test.addMillis(0); 
     __CLR4_4_1msemsele6rclot.R.inc(29862);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1msemsele6rclot.R.flushNeeded();}} 

    

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
