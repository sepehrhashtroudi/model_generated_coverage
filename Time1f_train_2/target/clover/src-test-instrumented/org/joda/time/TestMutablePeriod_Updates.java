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
public class TestMutablePeriod_Updates extends TestCase {static class __CLR4_4_1mrrmrrle6qsf66{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,29862,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29511);
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29512);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29513);
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29514);return new TestSuite(TestMutablePeriod_Updates.class);
    }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}}

    public TestMutablePeriod_Updates(String name) {
        super(name);__CLR4_4_1mrrmrrle6qsf66.R.inc(29516);try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29515);
    }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29517);
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29518);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29519);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29520);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29521);originalLocale = Locale.getDefault();
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29522);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29523);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29524);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29525);
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29526);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29527);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29528);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29529);Locale.setDefault(originalLocale);
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29530);originalDateTimeZone = null;
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29531);originalTimeZone = null;
        __CLR4_4_1mrrmrrle6qsf66.R.inc(29532);originalLocale = null;
    }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testAdd_RInterval160() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19xqxslmsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19xqxslmsd(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29533); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29534);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29535);test.add(new Interval(100L, 200L)); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29536);assertEquals(0, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29537);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29538);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29539);assertEquals(0, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29540);assertEquals(0, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29541);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29542);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29543);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testSetPeriod_8ints1820() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_142xigqmso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints1820",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_142xigqmso(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29544); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29545);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29546);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29547);assertEquals(11, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29548);assertEquals(12, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29549);assertEquals(13, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29550);assertEquals(14, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29551);assertEquals(15, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29552);assertEquals(16, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29553);assertEquals(17, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29554);assertEquals(18, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testSetWeeks821() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opqnzjmsz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetWeeks821",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opqnzjmsz(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29555); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29556);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29557);test.setWeeks(10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29558);assertEquals(10, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29559);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29560);test.setWeeks(-10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29561);assertEquals(-10, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29562);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29563);test.setWeeks(0); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29564);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29565);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29566);test.setWeeks(3); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29567);assertEquals(3, test.getWeeks()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testMergePeriod_RP3822() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13b0evymtc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP3822",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13b0evymtc(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29568); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29569);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29570);test.mergePeriod(new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 18)); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29571);assertEquals(0, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29572);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29573);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29574);assertEquals(0, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29575);assertEquals(0, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29576);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29577);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29578);assertEquals(18, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAdd_RP4823() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tg7la2mtn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP4823",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tg7la2mtn(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29579); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29580);MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29581);try { 
         __CLR4_4_1mrrmrrle6qsf66.R.inc(29582);test.add(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
         __CLR4_4_1mrrmrrle6qsf66.R.inc(29583);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29584);assertEquals(1, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29585);assertEquals(2, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29586);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29587);assertEquals(4, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29588);assertEquals(5, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29589);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29590);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29591);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testSetPeriod_long1930() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swtugamu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long1930",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swtugamu0(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29592); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29593);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29594);test.setPeriod(100L); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29595);assertEquals(0, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29596);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29597);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29598);assertEquals(0, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29599);assertEquals(0, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29600);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29601);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29602);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testSetPeriod_long21173() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t403g5mub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long21173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t403g5mub(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29603); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29604);MutablePeriod test = new MutablePeriod(); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29605);test.setPeriod((4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29606);assertEquals(0, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29607);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29608);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29609);assertEquals(0, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29610);assertEquals((450 * 24) + 5, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29611);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29612);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29613);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testSetPeriod_long_long_NoMinutes1174() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppyt90mum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoMinutes1174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppyt90mum(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29614); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29615);MutablePeriod test = new MutablePeriod(PeriodType.standard().withMinutesRemoved()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29616);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29617);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29618);test.setPeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29619);assertEquals(1, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29620);assertEquals(1, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29621);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29622);assertEquals(1, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29623);assertEquals(1, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29624);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29625);assertEquals(61, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29626);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testSetHours1176() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnntl1muz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetHours1176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnntl1muz(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29627); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29628);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29629);test.setHours(10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29630);assertEquals(10, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29631);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29632);test.setHours(-10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29633);assertEquals(-10, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29634);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29635);test.setHours(0); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29636);assertEquals(0, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29637);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29638);test.setHours(5); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29639);assertEquals(5, test.getHours()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testSetYears1177() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0wma5mvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetYears1177",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0wma5mvc(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29640); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29641);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29642);test.setYears(10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29643);assertEquals(10, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29644);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29645);test.setYears(-10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29646);assertEquals(-10, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29647);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29648);test.setYears(0); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29649);assertEquals(0, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29650);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29651);test.setYears(1); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29652);assertEquals(1, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29653);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29654);try { 
         __CLR4_4_1mrrmrrle6qsf66.R.inc(29655);test.setYears(1); 
         __CLR4_4_1mrrmrrle6qsf66.R.inc(29656);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testClear1185() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oyekapmvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testClear1185",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oyekapmvt(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29657); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29658);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29659);test.clear(); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29660);assertEquals(new MutablePeriod(), test); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29661);test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29662);test.clear(); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29663);assertEquals(new MutablePeriod(PeriodType.yearMonthDayTime()), test); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testSet_Field1186() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mndudsmw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSet_Field1186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mndudsmw0(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29664); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29665);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29666);test.set(DurationFieldType.years(), 10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29667);assertEquals(10, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29668);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29669);try { 
         __CLR4_4_1mrrmrrle6qsf66.R.inc(29670);test.set(null, 10); 
         __CLR4_4_1mrrmrrle6qsf66.R.inc(29671);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testSetPeriod_RInterval11187() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1beby8emw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval11187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1beby8emw8(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29672); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29673);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29674);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29675);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29676);test.setPeriod(new Interval(dt1, dt2)); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29677);assertEquals(1, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29678);assertEquals(1, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29679);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29680);assertEquals(1, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29681);assertEquals(1, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29682);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29683);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29684);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testSetPeriod_RInterval21188() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0bsk0mwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval21188",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0bsk0mwl(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29685); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29686);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29687);test.setPeriod((ReadableInterval) null); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29688);assertEquals(0, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29689);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29690);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29691);assertEquals(0, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29692);assertEquals(0, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29693);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29694);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29695);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testSetPeriod_RI_RI21189() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c07v13mww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI21189",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c07v13mww(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29696); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29697);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29698);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29699);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29700);test.setPeriod(dt2, dt1); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29701);assertEquals(-1, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29702);assertEquals(-1, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29703);assertEquals(-1, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29704);assertEquals(-1, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29705);assertEquals(-1, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29706);assertEquals(-1, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29707);assertEquals(-1, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29708);assertEquals(-1, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testSetPeriod_RD31190() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xrshdbmx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RD31190",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xrshdbmx9(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29709); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29710);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29711);test.setPeriod((ReadableDuration) null); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29712);assertEquals(0, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29713);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29714);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29715);assertEquals(0, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29716);assertEquals(0, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29717);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29718);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29719);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAdd_Field1191() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1fy4pmxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_Field1191",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1fy4pmxk(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29720); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29721);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29722);test.add(DurationFieldType.years(), 10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29723);assertEquals(11, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29724);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29725);test.add(DurationFieldType.years(), 0); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29726);assertEquals(0, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29727);assertEquals(1, test.getMillis()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29728);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29729);try { 
         __CLR4_4_1mrrmrrle6qsf66.R.inc(29730);test.add(null, 0); 
         __CLR4_4_1mrrmrrle6qsf66.R.inc(29731);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29732);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29733);try { 
         __CLR4_4_1mrrmrrle6qsf66.R.inc(29734);test.add(null, 10); 
         __CLR4_4_1mrrmrrle6qsf66.R.inc(29735);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAdd_8ints11192() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tucly3my0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_8ints11192",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tucly3my0(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29736); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29737);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29738);test.add(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29739);assertEquals(1, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29740);assertEquals(2, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29741);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29742);assertEquals(4, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29743);assertEquals(5, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29744);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29745);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29746);assertEquals(108, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAdd_RD31193() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obd19qmyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD31193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obd19qmyb(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29747); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29748);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29749);test.add((ReadableDuration) null); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29750);assertEquals(1, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29751);assertEquals(2, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29752);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29753);assertEquals(4, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29754);assertEquals(5, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29755);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29756);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29757);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAdd_RD11194() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x8r8flmym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD11194",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x8r8flmym(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29758); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29759);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29760);test.add(new Duration(100L)); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29761);assertEquals(0, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29762);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29763);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29764);assertEquals(0, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29765);assertEquals(0, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29766);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29767);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29768);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAdd_long11195() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uh7l3cmyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long11195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uh7l3cmyx(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29769); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29770);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29771);test.add(100L); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29772);assertEquals(0, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29773);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29774);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29775);assertEquals(0, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29776);assertEquals(0, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29777);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29778);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29779);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAdd_long_Chronology11196() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oh4g4qmz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long_Chronology11196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oh4g4qmz8(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29780); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29781);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29782);test.add(100L, ISOChronology.getInstance()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29783);assertEquals(0, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29784);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29785);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29786);assertEquals(0, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29787);assertEquals(0, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29788);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29789);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29790);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testMergePeriod_RP51197() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17exedgmzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP51197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17exedgmzj(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29791); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29792);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29793);test.mergePeriod((ReadablePeriod) null); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29794);assertEquals(1, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29795);assertEquals(2, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29796);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29797);assertEquals(4, test.getDays()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29798);assertEquals(5, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29799);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29800);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29801);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAddYears1198() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ik3ryrmzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddYears1198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ik3ryrmzu(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29802); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29803);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29804);test.addYears(10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29805);assertEquals(11, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29806);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29807);test.addYears(-10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29808);assertEquals(-9, test.getYears()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29809);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29810);test.addYears(0); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29811);assertEquals(1, test.getYears()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAddMonths1200() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0mkqn04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMonths1200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0mkqn04(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29812); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29813);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29814);test.addMonths(10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29815);assertEquals(12, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29816);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29817);test.addMonths(-10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29818);assertEquals(-8, test.getMonths()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29819);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29820);test.addMonths(0); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29821);assertEquals(2, test.getMonths()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAddWeeks1201() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16h0uihn0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddWeeks1201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16h0uihn0e(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29822); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29823);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29824);test.addWeeks(10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29825);assertEquals(13, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29826);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29827);test.addWeeks(-10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29828);assertEquals(-7, test.getWeeks()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29829);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29830);test.addWeeks(0); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29831);assertEquals(3, test.getWeeks()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAddHours1202() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13nh0gmn0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddHours1202",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13nh0gmn0o(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29832); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29833);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29834);test.addHours(10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29835);assertEquals(15, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29836);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29837);test.addHours(-10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29838);assertEquals(-5, test.getHours()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29839);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29840);test.addHours(0); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29841);assertEquals(5, test.getHours()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAddSeconds1203() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ajh30bn0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddSeconds1203",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ajh30bn0y(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29842); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29843);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29844);test.addSeconds(10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29845);assertEquals(17, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29846);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29847);test.addSeconds(-10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29848);assertEquals(-3, test.getSeconds()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29849);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29850);test.addSeconds(0); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29851);assertEquals(7, test.getSeconds()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 


public void testAddMillis1204() {__CLR4_4_1mrrmrrle6qsf66.R.globalSliceStart(getClass().getName(),29852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18zoawxn18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrle6qsf66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrle6qsf66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMillis1204",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18zoawxn18(){try{__CLR4_4_1mrrmrrle6qsf66.R.inc(29852); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29853);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29854);test.addMillis(10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29855);assertEquals(18, test.getMillis()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29856);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29857);test.addMillis(-10); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29858);assertEquals(-2, test.getMillis()); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29859);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29860);test.addMillis(0); 
     __CLR4_4_1mrrmrrle6qsf66.R.inc(29861);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mrrmrrle6qsf66.R.flushNeeded();}} 

    

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
