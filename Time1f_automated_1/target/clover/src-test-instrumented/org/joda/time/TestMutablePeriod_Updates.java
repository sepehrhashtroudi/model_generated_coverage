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
public class TestMutablePeriod_Updates extends TestCase {static class __CLR4_4_1jcyjcyle6ndpqf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,25357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25090);
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25091);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25092);
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25093);return new TestSuite(TestMutablePeriod_Updates.class);
    }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}

    public TestMutablePeriod_Updates(String name) {
        super(name);__CLR4_4_1jcyjcyle6ndpqf.R.inc(25095);try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25094);
    }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25096);
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25097);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25098);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25099);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25100);originalLocale = Locale.getDefault();
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25101);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25102);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25103);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25104);
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25105);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25106);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25107);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25108);Locale.setDefault(originalLocale);
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25109);originalDateTimeZone = null;
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25110);originalTimeZone = null;
        __CLR4_4_1jcyjcyle6ndpqf.R.inc(25111);originalLocale = null;
    }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToPeriod_PeriodType_Chronology20() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ha69zkjdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testToPeriod_PeriodType_Chronology20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ha69zkjdk(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25112); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25113);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25114);Duration test = new Duration(length); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25115);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25116);assertEquals(new Period(test, ISOChronology.getInstanceUTC()), result); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25117);assertEquals(new Period(test.getMillis(), ISOChronology.getInstanceUTC()), result); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testPropertyRemainderHourOfDay95() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6j58ajdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testPropertyRemainderHourOfDay95",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6j58ajdq(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25118); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25119);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25120);assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testAdd_RP3339() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgj1p7jdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP3339",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgj1p7jdt(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25121); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25122);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25123);test.add(new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25124);assertEquals(14, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25125);assertEquals(5, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25126);assertEquals(6, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25127);assertEquals(7, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25128);assertEquals(8, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25129);assertEquals(9, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25130);assertEquals(8, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25131);assertEquals(9, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testAdd_RP3340() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dxe94hje4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP3340",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dxe94hje4(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25132); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25133);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25134);test.add(new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25135);assertEquals(1, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25136);assertEquals(2, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25137);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25138);assertEquals(4, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25139);assertEquals(5, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25140);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25141);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25142);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testAdd_RP4341() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m12v4hjef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP4341",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m12v4hjef(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25143); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25144);MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25145);test.add(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25146);assertEquals(14, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25147);assertEquals(5, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25148);assertEquals(6, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25149);assertEquals(7, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25150);assertEquals(8, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25151);assertEquals(9, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25152);assertEquals(8, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25153);assertEquals(9, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testAdd_RP4342() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pa2twyjeq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP4342",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pa2twyjeq(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25154); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25155);MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25156);test.add(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25157);assertEquals(14, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25158);assertEquals(1, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25159);assertEquals(2, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25160);assertEquals(4, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25161);assertEquals(5, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25162);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25163);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25164);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testSetMethods343() throws Throwable {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w30edzjf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetMethods343",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w30edzjf1() throws Throwable{try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25165); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25166);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25167);test.setDays(10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25168);assertEquals(10, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25169);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25170);test.setDays(-10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25171);assertEquals(-10, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25172);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25173);test.setDays(0); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25174);assertEquals(0, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25175);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25176);test.setDays(5); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25177);assertEquals(5, test.getDays()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testGetValues586() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ix3jrgjfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testGetValues586",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ix3jrgjfe(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25178); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25179);Period test = new Period(0L); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25180);int[] vals = test.getValues(); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25181);assertEquals(2, vals.length); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25182);assertEquals(0, vals[0]); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25183);assertEquals(0, vals[1]); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testSetPeriod_8ints2590() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9ue4vjfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints2590",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9ue4vjfk(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25184); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25185);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25186);try { 
         __CLR4_4_1jcyjcyle6ndpqf.R.inc(25187);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
         __CLR4_4_1jcyjcyle6ndpqf.R.inc(25188);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25189);assertEquals(0, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25190);assertEquals(0, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25191);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25192);assertEquals(0, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25193);assertEquals(0, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25194);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25195);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25196);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testSetPeriod_long2591() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nz6ub0jfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long2591",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nz6ub0jfx(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25197); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25198);MutablePeriod test = new MutablePeriod(); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25199);test.setPeriod((4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25200);assertEquals(0, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25201);assertEquals(0, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25202);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25203);assertEquals(0, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25204);assertEquals((450 * 24) + 5, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25205);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25206);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25207);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testSetHours592() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzq54ajg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetHours592",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzq54ajg8(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25208); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25209);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25210);test.setHours(10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25211);assertEquals(10, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25212);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25213);test.setHours(-10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25214);assertEquals(-10, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25215);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25216);test.setHours(0); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25217);assertEquals(0, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25218);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25219);test.setHours(5); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25220);assertEquals(5, test.getHours()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testSetPeriod_8ints2593() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0uaiajgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints2593",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0uaiajgl(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25221); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25222);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25223);try { 
         __CLR4_4_1jcyjcyle6ndpqf.R.inc(25224);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
         __CLR4_4_1jcyjcyle6ndpqf.R.inc(25225);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25226);assertEquals(0, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25227);assertEquals(0, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25228);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25229);assertEquals(0, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25230);assertEquals(0, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25231);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25232);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25233);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testSet598() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4bnfvjgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSet598",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4bnfvjgy(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25234); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25235);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25236);test.set(DurationFieldType.years(), 10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25237);assertEquals(10, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25238);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25239);test.set(DurationFieldType.years(), 0); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25240);assertEquals(0, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25241);assertEquals(0, test.getMillis()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25242);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25243);try { 
         __CLR4_4_1jcyjcyle6ndpqf.R.inc(25244);test.set(null, 0); 
         __CLR4_4_1jcyjcyle6ndpqf.R.inc(25245);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25246);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25247);try { 
         __CLR4_4_1jcyjcyle6ndpqf.R.inc(25248);test.set(null, 10); 
         __CLR4_4_1jcyjcyle6ndpqf.R.inc(25249);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testSetPeriod_RI_RI3599() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13hm2fajhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI3599",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13hm2fajhe(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25250); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25251);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25252);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25253);test.setPeriod(dt1, dt1); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25254);assertEquals(0, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25255);assertEquals(0, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25256);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25257);assertEquals(0, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25258);assertEquals(0, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25259);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25260);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25261);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testSetPeriod_RInterval1600() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15e5rqtjhq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval1600",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15e5rqtjhq(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25262); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25263);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25264);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25265);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25266);test.setPeriod(new Interval(dt1, dt2)); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25267);assertEquals(1, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25268);assertEquals(1, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25269);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25270);assertEquals(1, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25271);assertEquals(1, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25272);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25273);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25274);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testAdd_RP2601() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t3xzwaji3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP2601",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t3xzwaji3(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25275); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25276);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25277);test.add((ReadablePeriod) null); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25278);assertEquals(1, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25279);assertEquals(2, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25280);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25281);assertEquals(4, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25282);assertEquals(5, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25283);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25284);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25285);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testAdd_RInterval1602() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iupcwljie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval1602",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iupcwljie(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25286); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25287);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25288);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25289);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25290);test.add(new Interval(dt1, dt2)); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25291);assertEquals(1, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25292);assertEquals(1, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25293);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25294);assertEquals(1, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25295);assertEquals(1, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25296);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25297);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25298);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testAdd_RD3603() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5s4a7jir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD3603",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5s4a7jir(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25299); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25300);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25301);test.add((ReadableDuration) null); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25302);assertEquals(1, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25303);assertEquals(2, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25304);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25305);assertEquals(4, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25306);assertEquals(5, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25307);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25308);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25309);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testAddMonths605() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1droag0jj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMonths605",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1droag0jj2(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25310); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25311);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25312);test.addMonths(10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25313);assertEquals(11, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25314);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25315);test.addMonths(-10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25316);assertEquals(-9, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25317);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25318);test.addMonths(0); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25319);assertEquals(1, test.getMonths()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testAddWeeks606() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ch9ib7jjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddWeeks606",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ch9ib7jjc(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25320); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25321);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25322);test.addWeeks(10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25323);assertEquals(14, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25324);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25325);test.addWeeks(-10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25326);assertEquals(-6, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25327);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25328);test.addWeeks(0); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25329);assertEquals(4, test.getWeeks()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testAddWeeks607() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fq9h3ojjm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddWeeks607",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fq9h3ojjm(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25330); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25331);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25332);test.addWeeks(10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25333);assertEquals(11, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25334);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25335);test.addWeeks(-10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25336);assertEquals(-9, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25337);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25338);test.addWeeks(0); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25339);assertEquals(1, test.getWeeks()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
public void testAddMillis608() {__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceStart(getClass().getName(),25340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xycjrkjjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcyjcyle6ndpqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcyjcyle6ndpqf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMillis608",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xycjrkjjw(){try{__CLR4_4_1jcyjcyle6ndpqf.R.inc(25340); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25341);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25342);test.addMillis(10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25343);assertEquals(11, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25344);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25345);test.addMillis(-10); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25346);assertEquals(-9, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25347);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25348);test.addMillis(0); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25349);assertEquals(1, test.getYears()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25350);assertEquals(2, test.getMonths()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25351);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25352);assertEquals(4, test.getDays()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25353);assertEquals(5, test.getHours()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25354);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25355);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1jcyjcyle6ndpqf.R.inc(25356);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1jcyjcyle6ndpqf.R.flushNeeded();}}
    

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
