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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Constructors extends TestCase {static class __CLR4_4_1mqsmqsle6qe9xl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,29638,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29476);
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29477);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29478);
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29479);return new TestSuite(TestMutablePeriod_Constructors.class);
    }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}}

    public TestMutablePeriod_Constructors(String name) {
        super(name);__CLR4_4_1mqsmqsle6qe9xl.R.inc(29481);try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29480);
    }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29482);
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29483);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29484);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29485);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29486);originalLocale = Locale.getDefault();
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29487);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29488);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29489);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29490);
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29491);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29492);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29493);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29494);Locale.setDefault(originalLocale);
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29495);originalDateTimeZone = null;
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29496);originalTimeZone = null;
        __CLR4_4_1mqsmqsle6qe9xl.R.inc(29497);originalLocale = null;
    }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_long_long_Chronology1295() throws Throwable {__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceStart(getClass().getName(),29498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ab7yszmre();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqsmqsle6qe9xl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_Chronology1295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ab7yszmre() throws Throwable{try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29498); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29499);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29500);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29501);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), CopticChronology.getInstance()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29502);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29503);assertEquals(1, test.getYears()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29504);assertEquals(1, test.getMonths()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29505);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29506);assertEquals(1, test.getDays()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29507);assertEquals(1, test.getHours()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29508);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29509);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29510);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}} 


public void testConstructor_long_long1502() throws Throwable {__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceStart(getClass().getName(),29511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uopawbmrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqsmqsle6qe9xl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long1502",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uopawbmrr() throws Throwable{try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29511); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29512);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29513);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29514);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29515);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29516);assertEquals(1, test.getYears()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29517);assertEquals(1, test.getMonths()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29518);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29519);assertEquals(1, test.getDays()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29520);assertEquals(1, test.getHours()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29521);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29522);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29523);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}} 


public void testConstructor_RI_RI5824() throws Throwable {__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceStart(getClass().getName(),29524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emdwx8ms4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqsmqsle6qe9xl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI5824",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emdwx8ms4() throws Throwable{try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29524); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29525);DateTime dt1 = null; 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29526);DateTime dt2 = null; 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29527);MutablePeriod test = new MutablePeriod(dt1, dt2); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29528);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29529);assertEquals(0, test.getYears()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29530);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29531);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29532);assertEquals(0, test.getDays()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29533);assertEquals(0, test.getHours()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29534);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29535);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29536);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}} 


public void testConstructor_RI_RD_PeriodType1828() throws Throwable {__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceStart(getClass().getName(),29537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n13yl1msh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqsmqsle6qe9xl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD_PeriodType1828",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n13yl1msh() throws Throwable{try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29537); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29538);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29539);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29540);Duration dur = new Interval(dt1, dt2).toDuration(); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29541);MutablePeriod test = new MutablePeriod(dt1, dur, PeriodType.yearDayTime()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29542);assertEquals(PeriodType.yearDayTime(), test.getPeriodType()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29543);assertEquals(1, test.getYears()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29544);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29545);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29546);assertEquals(31, test.getDays()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29547);assertEquals(1, test.getHours()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29548);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29549);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29550);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}} 


public void testParse_noFormatter1177() throws Throwable {__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceStart(getClass().getName(),29551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwc776msv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqsmqsle6qe9xl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testParse_noFormatter1177",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwc776msv() throws Throwable{try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29551); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29552);assertEquals(new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 890), MutablePeriod.parse("P1Y2M3W4DT5H6M7.890S")); 
 }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}} 


public void testConstructor_4int11181() throws Throwable {__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceStart(getClass().getName(),29553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qib0fmsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqsmqsle6qe9xl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_4int11181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qib0fmsx() throws Throwable{try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29553); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29554);MutablePeriod test = new MutablePeriod(5, 6, 7, 8); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29555);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29556);assertEquals(0, test.getYears()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29557);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29558);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29559);assertEquals(0, test.getDays()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29560);assertEquals(5, test.getHours()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29561);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29562);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29563);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}} 


public void testConstructor_long_Chronology21184() throws Throwable {__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceStart(getClass().getName(),29564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmpv5mt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqsmqsle6qe9xl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_Chronology21184",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmpv5mt8() throws Throwable{try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29564); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29565);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29566);MutablePeriod test = new MutablePeriod(length, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29567);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29568);assertEquals(0, test.getYears()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29569);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29570);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29571);assertEquals(4, test.getDays()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29572);assertEquals(5, test.getHours()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29573);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29574);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29575);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}} 


public void testConstructor_long_PeriodType_Chronology21185() throws Throwable {__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceStart(getClass().getName(),29576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ho3pgmmtk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqsmqsle6qe9xl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType_Chronology21185",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ho3pgmmtk() throws Throwable{try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29576); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29577);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29578);MutablePeriod test = new MutablePeriod(length, PeriodType.standard(), ISOChronology.getInstanceUTC()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29579);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29580);assertEquals(0, test.getYears()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29581);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29582);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29583);assertEquals(4, test.getDays()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29584);assertEquals(5, test.getHours()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29585);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29586);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29587);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}} 


public void testConstructor_long_long_PeriodType21186() throws Throwable {__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceStart(getClass().getName(),29588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdlvvpmtw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqsmqsle6qe9xl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType21186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdlvvpmtw() throws Throwable{try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29588); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29589);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29590);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29591);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29592);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29593);assertEquals(0, test.getYears()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29594);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29595);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29596);assertEquals(31, test.getDays()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29597);assertEquals(1, test.getHours()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29598);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29599);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29600);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}} 


public void testConstructor_long_long_PeriodType_Chronology11187() throws Throwable {__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceStart(getClass().getName(),29601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gdraxamu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqsmqsle6qe9xl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType_Chronology11187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gdraxamu9() throws Throwable{try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29601); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29602);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29603);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29604);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, CopticChronology.getInstance()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29605);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29606);assertEquals(1, test.getYears()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29607);assertEquals(1, test.getMonths()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29608);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29609);assertEquals(1, test.getDays()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29610);assertEquals(1, test.getHours()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29611);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29612);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29613);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}} 


public void testConstructor_RI_RI31188() throws Throwable {__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceStart(getClass().getName(),29614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yhj04ymum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqsmqsle6qe9xl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI31188",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yhj04ymum() throws Throwable{try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29614); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29615);DateTime dt1 = null; 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29616);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29617);MutablePeriod test = new MutablePeriod(dt1, dt2); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29618);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29619);assertEquals(3, test.getYears()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29620);assertEquals(1, test.getMonths()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29621);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29622);assertEquals(1, test.getDays()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29623);assertEquals(0, test.getHours()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29624);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29625);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29626);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType41190() throws Throwable {__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceStart(getClass().getName(),29627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k5gfrmmuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqsmqsle6qe9xl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqsmqsle6qe9xl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_PeriodType41190",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k5gfrmmuz() throws Throwable{try{__CLR4_4_1mqsmqsle6qe9xl.R.inc(29627); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29628);MutablePeriod test = new MutablePeriod(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), (PeriodType) null); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29629);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29630);assertEquals(0, test.getYears()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29631);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29632);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29633);assertEquals(0, test.getDays()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29634);assertEquals(1, test.getHours()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29635);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29636);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1mqsmqsle6qe9xl.R.inc(29637);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1mqsmqsle6qe9xl.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (PeriodType)
     */
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (4ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object,PeriodType)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    

    

}
