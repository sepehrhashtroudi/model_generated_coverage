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
public class TestMutablePeriod_Constructors extends TestCase {static class __CLR4_4_1iyqiyqle6nl8e2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,24747,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24578);
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24579);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24580);
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24581);return new TestSuite(TestMutablePeriod_Constructors.class);
    }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}

    public TestMutablePeriod_Constructors(String name) {
        super(name);__CLR4_4_1iyqiyqle6nl8e2.R.inc(24583);try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24582);
    }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24584);
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24585);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24586);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24587);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24588);originalLocale = Locale.getDefault();
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24589);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24590);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24591);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24592);
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24593);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24594);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24595);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24596);Locale.setDefault(originalLocale);
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24597);originalDateTimeZone = null;
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24598);originalTimeZone = null;
        __CLR4_4_1iyqiyqle6nl8e2.R.inc(24599);originalLocale = null;
    }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_RI_RD2363() throws Throwable {__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceStart(getClass().getName(),24600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fpu6hkizc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyqiyqle6nl8e2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD2363",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fpu6hkizc() throws Throwable{try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24600); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24601);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24602);Duration dur = null; 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24603);Period test = new Period(dt1, dur); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24604);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24605);assertEquals(0, test.getYears()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24606);assertEquals(0, test.getMonths()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24607);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24608);assertEquals(0, test.getDays()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24609);assertEquals(0, test.getHours()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24610);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24611);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24612);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}
public void testConstructor_RI_RD4364() throws Throwable {__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceStart(getClass().getName(),24613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12rgxa1izp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyqiyqle6nl8e2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD4364",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12rgxa1izp() throws Throwable{try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24613); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24614);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24615);Duration dur = null; 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24616);Period test = new Period(dt1, dur); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24617);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24618);assertEquals(0, test.getYears()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24619);assertEquals(0, test.getMonths()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24620);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24621);assertEquals(0, test.getDays()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24622);assertEquals(0, test.getHours()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24623);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24624);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24625);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}
public void testPropertyToIntervalMillisOfSecond397() {__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceStart(getClass().getName(),24626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynnif4j02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyqiyqle6nl8e2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testPropertyToIntervalMillisOfSecond397",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynnif4j02(){try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24626); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24627);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24628);Interval testInterval = test.millisOfSecond().toInterval(); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24629);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24630);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd()); 
 }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}
public void testConstructor_long_PeriodType_Chronology1493() throws Throwable {__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceStart(getClass().getName(),24631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13z7avgj07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyqiyqle6nl8e2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType_Chronology1493",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13z7avgj07() throws Throwable{try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24631); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24632);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24633);MutablePeriod test = new MutablePeriod(length, PeriodType.dayTime()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24634);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24635);assertEquals(0, test.getYears()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24636);assertEquals(0, test.getMonths()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24637);assertEquals(64, test.getWeeks()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24638);assertEquals(2, test.getDays()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24639);assertEquals(5, test.getHours()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24640);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24641);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24642);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}
public void testConstructor_long_Chronology2494() throws Throwable {__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceStart(getClass().getName(),24643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12lo9zsj0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyqiyqle6nl8e2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_Chronology2494",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12lo9zsj0j() throws Throwable{try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24643); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24644);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24645);MutablePeriod test = new MutablePeriod(length, PeriodType.dayTime()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24646);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24647);assertEquals(0, test.getYears()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24648);assertEquals(0, test.getMonths()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24649);assertEquals(64, test.getWeeks()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24650);assertEquals(2, test.getDays()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24651);assertEquals(5, test.getHours()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24652);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24653);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24654);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}
public void testConstructor_long_long_Chronology1495() throws Throwable {__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceStart(getClass().getName(),24655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161il2tj0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyqiyqle6nl8e2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_Chronology1495",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161il2tj0v() throws Throwable{try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24655); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24656);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24657);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, CopticChronology.getInstance()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24658);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), CopticChronology.getInstance()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24659);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24660);assertEquals(1, test.getYears()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24661);assertEquals(1, test.getMonths()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24662);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24663);assertEquals(1, test.getDays()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24664);assertEquals(1, test.getHours()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24665);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24666);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24667);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}
public void testConstructor_RI_RI2496() throws Throwable {__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceStart(getClass().getName(),24668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7czn6j18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyqiyqle6nl8e2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI2496",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7czn6j18() throws Throwable{try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24668); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24669);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24670);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24671);MutablePeriod test = new MutablePeriod(dt1, dt2); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24672);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24673);assertEquals(0, test.getYears()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24674);assertEquals(0, test.getMonths()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24675);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24676);assertEquals(31, test.getDays()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24677);assertEquals(1, test.getHours()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24678);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24679);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24680);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}
public void testConstructor_RI_RD2497() throws Throwable {__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceStart(getClass().getName(),24681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9rngqj1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyqiyqle6nl8e2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD2497",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9rngqj1l() throws Throwable{try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24681); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24682);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24683);Duration dur = null; 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24684);MutablePeriod test = new MutablePeriod(dt1, dur, PeriodType.dayTime()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24685);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24686);assertEquals(0, test.getYears()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24687);assertEquals(0, test.getMonths()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24688);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24689);assertEquals(0, test.getDays()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24690);assertEquals(0, test.getHours()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24691);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24692);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24693);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}
public void testSetYears502() {__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceStart(getClass().getName(),24694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he7ztkj1y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyqiyqle6nl8e2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testSetYears502",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he7ztkj1y(){try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24694); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24695);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24696);test.setYears(10); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24697);assertEquals(10, test.getYears()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24698);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24699);test.setYears(-10); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24700);assertEquals(-10, test.getYears()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24701);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24702);test.setYears(0); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24703);assertEquals(0, test.getYears()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24704);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24705);test.setYears(1); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24706);assertEquals(1, test.getYears()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24707);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24708);try { 
         __CLR4_4_1iyqiyqle6nl8e2.R.inc(24709);test.setYears(1); 
         __CLR4_4_1iyqiyqle6nl8e2.R.inc(24710);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}
public void testSetDays503() {__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceStart(getClass().getName(),24711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rwhjsj2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyqiyqle6nl8e2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testSetDays503",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rwhjsj2f(){try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24711); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24712);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24713);test.setDays(10); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24714);assertEquals(10, test.getDays()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24715);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24716);test.setDays(-10); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24717);assertEquals(-10, test.getDays()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24718);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24719);test.setDays(0); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24720);assertEquals(0, test.getDays()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24721);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24722);test.setDays(5); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24723);assertEquals(5, test.getDays()); 
 }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}
public void testConstructor_long_long1514() throws Throwable {__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceStart(getClass().getName(),24724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15j5j86j2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyqiyqle6nl8e2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long1514",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15j5j86j2s() throws Throwable{try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24724); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24725);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24726);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24727);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24728);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24729);assertEquals(1, test.getYears()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24730);assertEquals(1, test.getMonths()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24731);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24732);assertEquals(1, test.getDays()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24733);assertEquals(1, test.getHours()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24734);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24735);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24736);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}
public void testConstructor_RI_RP3570() throws Throwable {__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceStart(getClass().getName(),24737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y4ujkhj35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyqiyqle6nl8e2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyqiyqle6nl8e2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RP3570",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y4ujkhj35() throws Throwable{try{__CLR4_4_1iyqiyqle6nl8e2.R.inc(24737); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24738);DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24739);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24740);long result = TEST_TIME_NOW; 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24741);result = ISOChronology.getInstanceUTC().months().add(result, 6); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24742);result = ISOChronology.getInstanceUTC().days().add(result, 3); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24743);result = ISOChronology.getInstanceUTC().hours().add(result, 1); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24744);MutableInterval test = new MutableInterval(dt, dur); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24745);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1iyqiyqle6nl8e2.R.inc(24746);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1iyqiyqle6nl8e2.R.flushNeeded();}}
    

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
