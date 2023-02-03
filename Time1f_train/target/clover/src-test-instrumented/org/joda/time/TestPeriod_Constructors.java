/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
 * This class is a JUnit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Constructors extends TestCase {static class __CLR4_4_1p2zp2zlc8axegs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,32797,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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
            
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32507);
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32508);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32509);
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32510);return new TestSuite(TestPeriod_Constructors.class);
    }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}}

    public TestPeriod_Constructors(String name) {
        super(name);__CLR4_4_1p2zp2zlc8axegs.R.inc(32512);try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32511);
    }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32513);
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32514);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32515);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32516);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32517);originalLocale = Locale.getDefault();
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32518);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32519);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32520);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32521);
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32522);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32523);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32524);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32525);Locale.setDefault(originalLocale);
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32526);originalDateTimeZone = null;
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32527);originalTimeZone = null;
        __CLR4_4_1p2zp2zlc8axegs.R.inc(32528);originalLocale = null;
    }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP251() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mhkzyrp3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mhkzyrp3l() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32529); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32530);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32531);YearMonthDay dt2 = new YearMonthDay(2005, 5, 17); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32532);Period test = new Period(dt1, dt2); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32533);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32534);assertEquals(0, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32535);assertEquals(11, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32536);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32537);assertEquals(1, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32538);assertEquals(0, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32539);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32540);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32541);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference152() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16bdatmp3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference152",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16bdatmp3y() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32542); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32543);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32544);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32545);Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32546);Period test = Period.fieldDifference(start, end); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32547);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32548);assertEquals(-1, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32549);assertEquals(2, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32550);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32551);assertEquals(-2, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32552);assertEquals(0, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32553);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32554);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32555);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_RD_RI2115() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166lzrp4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI2115",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166lzrp4c() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32556); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32557);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32558);Duration dur = null; 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32559);Period test = new Period(dur, dt1); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32560);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32561);assertEquals(0, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32562);assertEquals(0, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32563);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32564);assertEquals(0, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32565);assertEquals(0, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32566);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32567);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32568);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_Object3120() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jopymxp4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object3120",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jopymxp4p() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32569); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32570);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime())); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32571);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32572);assertEquals(0, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32573);assertEquals(0, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32574);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32575);assertEquals(0, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32576);assertEquals(1, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32577);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32578);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32579);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor1157() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrbf0xp50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor1157",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrbf0xp50() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32580); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32581);Period test = new Period(); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32582);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32583);assertEquals(0, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32584);assertEquals(0, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32585);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32586);assertEquals(0, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32587);assertEquals(0, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32588);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32589);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32590);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_long_PeriodType_Chronology4190() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178esyzp5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType_Chronology4190",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178esyzp5b() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32591); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32592);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32593);Period test = new Period(length, (PeriodType) null, (Chronology) null); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32594);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32595);assertEquals(0, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32596);assertEquals(0, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32597);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32598);assertEquals(0, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32599);assertEquals((4 * 24) + 5, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32600);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32601);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32602);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths216() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o8igo9p5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o8igo9p5n() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32603); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32604);DateTime dt1 = new DateTime(2004, 12, 28, 0, 0); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32605);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32606);Period test = new Period(dt1, dt2); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32607);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32608);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths290() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3vk5hp5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3vk5hp5t() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32609); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32610);LocalDate dt1 = new LocalDate(2004, 12, 28); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32611);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32612);Period test = new Period(dt1, dt2); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32613);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32614);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference3396() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ayyq8zp5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference3396",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ayyq8zp5z() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32615); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32616);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32617);TimeOfDay endTime = new TimeOfDay(12, 30, 40, 0); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32618);try { 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32619);Period.fieldDifference(start, endTime); 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32620);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_RP_RP_PeriodType8469() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2vc60p65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType8469",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2vc60p65() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32621); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32622);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32623);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32624);try { 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32625);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32626);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_RD_RI_PeriodType1560() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dutez6p6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI_PeriodType1560",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dutez6p6b() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32627); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32628);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32629);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32630);Duration dur = new Interval(dt1, dt2).toDuration(); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32631);Period test = new Period(dur, dt2, PeriodType.yearDayTime()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32632);assertEquals(PeriodType.yearDayTime(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32633);assertEquals(1, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32634);assertEquals(0, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32635);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32636);assertEquals(31, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32637);assertEquals(1, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32638);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32639);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32640);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_RI_RI4691() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u0owwnp6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI4691",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u0owwnp6p() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32641); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32642);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32643);DateTime dt2 = null; 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32644);Period test = new Period(dt1, dt2); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32645);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32646);assertEquals(-3, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32647);assertEquals(-1, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32648);assertEquals(-1, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32649);assertEquals(-1, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32650);assertEquals(0, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32651);assertEquals(-1, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32652);assertEquals(-1, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32653);assertEquals(-1, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType1700() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1etypm7p72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType1700",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1etypm7p72() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32654); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32655);Period test = new Period("P1Y2M3D", PeriodType.yearMonthDayTime()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32656);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32657);assertEquals(1, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32658);assertEquals(2, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32659);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32660);assertEquals(3, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32661);assertEquals(0, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32662);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32663);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32664);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference4867() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19q2rpxp7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference4867",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19q2rpxp7d() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32665); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32666);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32667);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32668);Partial end = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32669);try { 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32670);Period.fieldDifference(start, end); 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32671);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_long_long2940() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16yw7gyp7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long2940",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16yw7gyp7k() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32672); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32673);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32674);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32675);Period test = new Period(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32676);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32677);assertEquals(1, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32678);assertEquals(1, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32679);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32680);assertEquals(1, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32681);assertEquals(1, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32682);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32683);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32684);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP_PeriodType21088() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lxz8hyp7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType21088",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lxz8hyp7x() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32685); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32686);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32687);YearMonthDay dt2 = new YearMonthDay(2005, 5, 17); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32688);Period test = new Period(dt1, dt2, PeriodType.yearMonthDay()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32689);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32690);assertEquals(0, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32691);assertEquals(11, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32692);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32693);assertEquals(8, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32694);assertEquals(0, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32695);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32696);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32697);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType31120() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ng4h64p8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType31120",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ng4h64p8a() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32698); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32699);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.yearMonthDayTime()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32700);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32701);assertEquals(0, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32702);assertEquals(0, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32703);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32704);assertEquals(0, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32705);assertEquals(1, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32706);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32707);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32708);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_RP_RP_PeriodType71166() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14bltdgp8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType71166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14bltdgp8l() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32709); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32710);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.monthOfYear(), 12); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32711);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32712);try { 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32713);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32714);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_long_long_PeriodType21336() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oku3e4p8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType21336",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oku3e4p8r() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32715); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32716);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32717);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32718);Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32719);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32720);assertEquals(0, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32721);assertEquals(0, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32722);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32723);assertEquals(31, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32724);assertEquals(1, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32725);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32726);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32727);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testFactoryFieldDifference51339() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iu1rsrp94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference51339",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iu1rsrp94() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32728); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32729);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32730);Partial start = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32731);Partial end = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32732);try { 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32733);Period.fieldDifference(start, end); 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32734);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference21360() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzjm46p9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference21360",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzjm46p9b() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32735); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32736);YearMonthDay ymd = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32737);try { 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32738);Period.fieldDifference(ymd, (ReadablePartial) null); 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32739);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32740);try { 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32741);Period.fieldDifference((ReadablePartial) null, ymd); 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32742);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP41444() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgpzl6p9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP41444",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgpzl6p9j() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32743); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32744);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32745);YearMonthDay dt2 = null; 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32746);try { 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32747);new Period(dt1, dt2); 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32748);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP_PeriodType61475() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dp698p9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType61475",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dp698p9p() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32749); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32750);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32751);TimeOfDay dt2 = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32752);try { 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32753);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1p2zp2zlc8axegs.R.inc(32754);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_long_Chronology21520() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8etx3p9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_Chronology21520",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8etx3p9v() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32755); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32756);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32757);Period test = new Period(length, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32758);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32759);assertEquals(0, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32760);assertEquals(0, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32761);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32762);assertEquals(4, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32763);assertEquals(5, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32764);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32765);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32766);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType21570() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xtgpe6pa7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType21570",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xtgpe6pa7() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32767); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32768);Period test = new Period((Object) null, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32769);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32770);assertEquals(0, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32771);assertEquals(0, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32772);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32773);assertEquals(0, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32774);assertEquals(0, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32775);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32776);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32777);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth11578() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gftfhupai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth11578",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gftfhupai() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32778); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32779);LocalDate dt1 = new LocalDate(2004, 12, 29); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32780);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32781);Period test = new Period(dt1, dt2); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32782);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32783);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 


public void testConstructor_RI_RD21634() throws Throwable {__CLR4_4_1p2zp2zlc8axegs.R.globalSliceStart(getClass().getName(),32784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lh8dhgpao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2zp2zlc8axegs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2zp2zlc8axegs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD21634",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lh8dhgpao() throws Throwable{try{__CLR4_4_1p2zp2zlc8axegs.R.inc(32784); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32785);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32786);Duration dur = null; 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32787);Period test = new Period(dt1, dur); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32788);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32789);assertEquals(0, test.getYears()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32790);assertEquals(0, test.getMonths()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32791);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32792);assertEquals(0, test.getDays()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32793);assertEquals(0, test.getHours()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32794);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32795);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1p2zp2zlc8axegs.R.inc(32796);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1p2zp2zlc8axegs.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

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
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}
