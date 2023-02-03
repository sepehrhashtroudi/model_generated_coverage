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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a JUnit test for PeriodType.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodType extends TestCase {static class __CLR4_4_1oghoghlc8axeeb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,32027,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1oghoghlc8axeeb.R.inc(31697);
        __CLR4_4_1oghoghlc8axeeb.R.inc(31698);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1oghoghlc8axeeb.R.inc(31699);
        __CLR4_4_1oghoghlc8axeeb.R.inc(31700);return new TestSuite(TestPeriodType.class);
    }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}}

    public TestPeriodType(String name) {
        super(name);__CLR4_4_1oghoghlc8axeeb.R.inc(31702);try{__CLR4_4_1oghoghlc8axeeb.R.inc(31701);
    }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1oghoghlc8axeeb.R.inc(31703);
        __CLR4_4_1oghoghlc8axeeb.R.inc(31704);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1oghoghlc8axeeb.R.inc(31705);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1oghoghlc8axeeb.R.inc(31706);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1oghoghlc8axeeb.R.inc(31707);originalLocale = Locale.getDefault();
        __CLR4_4_1oghoghlc8axeeb.R.inc(31708);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1oghoghlc8axeeb.R.inc(31709);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1oghoghlc8axeeb.R.inc(31710);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1oghoghlc8axeeb.R.inc(31711);
        __CLR4_4_1oghoghlc8axeeb.R.inc(31712);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1oghoghlc8axeeb.R.inc(31713);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1oghoghlc8axeeb.R.inc(31714);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1oghoghlc8axeeb.R.inc(31715);Locale.setDefault(originalLocale);
        __CLR4_4_1oghoghlc8axeeb.R.inc(31716);originalDateTimeZone = null;
        __CLR4_4_1oghoghlc8axeeb.R.inc(31717);originalTimeZone = null;
        __CLR4_4_1oghoghlc8axeeb.R.inc(31718);originalLocale = null;
    }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForFields471() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lexivvoh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lexivvoh3() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31719); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31720);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.months() }; 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31721);DurationFieldType[] types2 = new DurationFieldType[] { DurationFieldType.months(), DurationFieldType.days(), DurationFieldType.weeks() }; 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31722);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31723);PeriodType type2 = PeriodType.forFields(types2); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31724);assertEquals(true, type == type2); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testYears438() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bjw6e4oh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYears438",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bjw6e4oh9() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31725); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31726);PeriodType type = PeriodType.years(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31727);assertEquals(1, type.size()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31728);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31729);assertEquals("Years", type.getName()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31730);assertEquals("PeriodType[Years]", type.toString()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31731);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31732);assertEquals(true, type == PeriodType.years()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31733);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31734);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31735);assertEquals(true, type.hashCode() == PeriodType.years().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31736);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31737);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testYearDayTime582() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z4a4kohm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDayTime582",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z4a4kohm() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31738); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31739);PeriodType type = PeriodType.yearDayTime(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31740);assertEquals(6, type.size()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31741);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31742);assertEquals(DurationFieldType.days(), type.getFieldType(1)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31743);assertEquals(DurationFieldType.hours(), type.getFieldType(2)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31744);assertEquals(DurationFieldType.minutes(), type.getFieldType(3)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31745);assertEquals(DurationFieldType.seconds(), type.getFieldType(4)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31746);assertEquals(DurationFieldType.millis(), type.getFieldType(5)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31747);assertEquals("YearDayTime", type.getName()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31748);assertEquals("PeriodType[YearDayTime]", type.toString()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31749);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31750);assertEquals(true, type == PeriodType.yearDayTime()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31751);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31752);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31753);assertEquals(true, type.hashCode() == PeriodType.yearDayTime().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31754);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31755);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testYearMonthDay594() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fa4898oi4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearMonthDay594",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fa4898oi4() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31756); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31757);PeriodType type = PeriodType.yearMonthDay(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31758);assertEquals(3, type.size()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31759);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31760);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31761);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31762);assertEquals("YearMonthDay", type.getName()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31763);assertEquals("PeriodType[YearMonthDay]", type.toString()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31764);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31765);assertEquals(true, type == PeriodType.yearMonthDay()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31766);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31767);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31768);assertEquals(true, type.hashCode() == PeriodType.yearMonthDay().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31769);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31770);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testDays894() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161wdanoij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testDays894",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161wdanoij() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31771); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31772);PeriodType type = PeriodType.days(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31773);assertEquals(1, type.size()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31774);assertEquals(DurationFieldType.days(), type.getFieldType(0)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31775);assertEquals("Days", type.getName()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31776);assertEquals("PeriodType[Days]", type.toString()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31777);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31778);assertEquals(true, type == PeriodType.days()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31779);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31780);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31781);assertEquals(true, type.hashCode() == PeriodType.days().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31782);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31783);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testMaskTwice2915() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qsowakoiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskTwice2915",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qsowakoiw() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31784); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31785);PeriodType type = PeriodType.dayTime(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31786);PeriodType type2 = type.withYearsRemoved(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31787);assertEquals(true, type == type2); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31788);type = PeriodType.dayTime(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31789);type2 = type.withMonthsRemoved(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31790);assertEquals(true, type == type2); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31791);type = PeriodType.dayTime(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31792);type2 = type.withWeeksRemoved(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31793);assertEquals(true, type == type2); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31794);type = PeriodType.millis(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31795);type2 = type.withDaysRemoved(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31796);assertEquals(true, type == type2); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31797);type = PeriodType.millis(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31798);type2 = type.withHoursRemoved(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31799);assertEquals(true, type == type2); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31800);type = PeriodType.millis(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31801);type2 = type.withMinutesRemoved(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31802);assertEquals(true, type == type2); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31803);type = PeriodType.millis(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31804);type2 = type.withSecondsRemoved(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31805);assertEquals(true, type == type2); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testForFields71025() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3cauooji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields71025",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3cauooji() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31806); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31807);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.weeks(), DurationFieldType.months() }; 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31808);DurationFieldType[] types2 = new DurationFieldType[] { DurationFieldType.seconds() }; 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31809);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31810);PeriodType type2 = PeriodType.forFields(types2); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31811);assertEquals(false, type == type2); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31812);assertEquals(false, type.equals(type2)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31813);assertEquals(false, type.hashCode() == type2.hashCode()); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testForFields61154() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jpq6dwojq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields61154",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jpq6dwojq() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31814); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31815);DurationFieldType[] types = null; 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31816);try { 
         __CLR4_4_1oghoghlc8axeeb.R.inc(31817);PeriodType.forFields(types); 
         __CLR4_4_1oghoghlc8axeeb.R.inc(31818);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31819);types = new DurationFieldType[0]; 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31820);try { 
         __CLR4_4_1oghoghlc8axeeb.R.inc(31821);PeriodType.forFields(types); 
         __CLR4_4_1oghoghlc8axeeb.R.inc(31822);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31823);types = new DurationFieldType[] { null, DurationFieldType.months() }; 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31824);try { 
         __CLR4_4_1oghoghlc8axeeb.R.inc(31825);PeriodType.forFields(types); 
         __CLR4_4_1oghoghlc8axeeb.R.inc(31826);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31827);types = new DurationFieldType[] { DurationFieldType.months(), null }; 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31828);try { 
         __CLR4_4_1oghoghlc8axeeb.R.inc(31829);PeriodType.forFields(types); 
         __CLR4_4_1oghoghlc8axeeb.R.inc(31830);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testEquals1204() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrmevxok7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testEquals1204",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrmevxok7() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31831); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31832);PeriodType type = PeriodType.dayTime().withMillisRemoved(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31833);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31834);assertEquals(true, type.equals(PeriodType.dayTime().withMillisRemoved())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31835);assertEquals(false, type.equals(null)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31836);assertEquals(false, type.equals("")); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testIsSupported1213() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yaik4cokd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testIsSupported1213",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yaik4cokd() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31837); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31838);PeriodType type = PeriodType.dayTime().withMillisRemoved(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31839);assertEquals(false, type.isSupported(DurationFieldType.years())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31840);assertEquals(false, type.isSupported(DurationFieldType.months())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31841);assertEquals(false, type.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31842);assertEquals(true, type.isSupported(DurationFieldType.days())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31843);assertEquals(true, type.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31844);assertEquals(true, type.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31845);assertEquals(true, type.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31846);assertEquals(false, type.isSupported(DurationFieldType.millis())); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testForFields21264() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pkpgu0okn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields21264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pkpgu0okn() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31847); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31848);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.years(), DurationFieldType.hours() }; 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31849);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31850);assertEquals(2, type.size()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31851);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31852);assertEquals(DurationFieldType.hours(), type.getFieldType(1)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31853);assertEquals("StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis", type.getName()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31854);assertEquals("PeriodType[StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis]", type.toString()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31855);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31856);assertEquals(true, type == PeriodType.forFields(types)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31857);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31858);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31859);assertEquals(true, type.hashCode() == PeriodType.forFields(types).hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31860);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31861);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testMaskMinutes1267() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1su5i1iol2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMinutes1267",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1su5i1iol2() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31862); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31863);PeriodType type = PeriodType.standard().withMinutesRemoved(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31864);assertEquals(7, type.size()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31865);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31866);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31867);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31868);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31869);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31870);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31871);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31872);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31873);assertEquals(true, type.equals(PeriodType.standard().withMinutesRemoved())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31874);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31875);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31876);assertEquals(true, type.hashCode() == PeriodType.standard().withMinutesRemoved().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31877);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31878);assertEquals("StandardNoMinutes", type.getName()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31879);assertEquals("PeriodType[StandardNoMinutes]", type.toString()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31880);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testYearWeekDayTime1333() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d0j2gholl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDayTime1333",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d0j2gholl() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31881); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31882);PeriodType type = PeriodType.yearWeekDayTime(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31883);assertEquals(7, type.size()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31884);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31885);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31886);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31887);assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31888);assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31889);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31890);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31891);assertEquals("YearWeekDayTime", type.getName()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31892);assertEquals("PeriodType[YearWeekDayTime]", type.toString()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31893);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31894);assertEquals(true, type == PeriodType.yearWeekDayTime()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31895);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31896);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31897);assertEquals(true, type.hashCode() == PeriodType.yearWeekDayTime().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31898);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31899);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testSeconds1335() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vl5kxkom4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testSeconds1335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vl5kxkom4() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31900); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31901);PeriodType type = PeriodType.seconds(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31902);assertEquals(1, type.size()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31903);assertEquals(DurationFieldType.seconds(), type.getFieldType(0)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31904);assertEquals("Seconds", type.getName()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31905);assertEquals("PeriodType[Seconds]", type.toString()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31906);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31907);assertEquals(true, type == PeriodType.seconds()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31908);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31909);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31910);assertEquals(true, type.hashCode() == PeriodType.seconds().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31911);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31912);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testForFields11366() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tkk3naomh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields11366",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tkk3naomh() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31913); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31914);PeriodType type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.years() }); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31915);assertSame(PeriodType.years(), type); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31916);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.months() }); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31917);assertSame(PeriodType.months(), type); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31918);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.weeks() }); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31919);assertSame(PeriodType.weeks(), type); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31920);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.days() }); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31921);assertSame(PeriodType.days(), type); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31922);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.hours() }); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31923);assertSame(PeriodType.hours(), type); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31924);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.minutes() }); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31925);assertSame(PeriodType.minutes(), type); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31926);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.seconds() }); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31927);assertSame(PeriodType.seconds(), type); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31928);type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.millis() }); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31929);assertSame(PeriodType.millis(), type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testMaskMillis1481() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbj4k9omy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMillis1481",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbj4k9omy() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31930); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31931);PeriodType type = PeriodType.standard().withMillisRemoved(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31932);assertEquals(7, type.size()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31933);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31934);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31935);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31936);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31937);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31938);assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31939);assertEquals(DurationFieldType.seconds(), type.getFieldType(6)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31940);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31941);assertEquals(true, type.equals(PeriodType.standard().withMillisRemoved())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31942);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31943);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31944);assertEquals(true, type.hashCode() == PeriodType.standard().withMillisRemoved().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31945);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31946);assertEquals("StandardNoMillis", type.getName()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31947);assertEquals("PeriodType[StandardNoMillis]", type.toString()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31948);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testYearDay1583() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9bv6bonh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDay1583",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9bv6bonh() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31949); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31950);PeriodType type = PeriodType.yearDay(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31951);assertEquals(2, type.size()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31952);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31953);assertEquals(DurationFieldType.days(), type.getFieldType(1)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31954);assertEquals("YearDay", type.getName()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31955);assertEquals("PeriodType[YearDay]", type.toString()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31956);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31957);assertEquals(true, type == PeriodType.yearDay()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31958);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31959);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31960);assertEquals(true, type.hashCode() == PeriodType.yearDay().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31961);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31962);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testYearWeekDay1656() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fe2zcqonv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDay1656",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fe2zcqonv() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31963); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31964);PeriodType type = PeriodType.yearWeekDay(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31965);assertEquals(3, type.size()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31966);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31967);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31968);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31969);assertEquals("YearWeekDay", type.getName()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31970);assertEquals("PeriodType[YearWeekDay]", type.toString()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31971);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31972);assertEquals(true, type == PeriodType.yearWeekDay()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31973);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31974);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31975);assertEquals(true, type.hashCode() == PeriodType.yearWeekDay().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31976);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31977);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testMaskYears1671() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1npgqqooa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskYears1671",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1npgqqooa() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31978); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31979);PeriodType type = PeriodType.standard().withYearsRemoved(); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31980);assertEquals(7, type.size()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31981);assertEquals(DurationFieldType.months(), type.getFieldType(0)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31982);assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31983);assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31984);assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31985);assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31986);assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31987);assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31988);assertEquals(true, type.equals(type)); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31989);assertEquals(true, type.equals(PeriodType.standard().withYearsRemoved())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31990);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31991);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31992);assertEquals(true, type.hashCode() == PeriodType.standard().withYearsRemoved().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31993);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31994);assertEquals("StandardNoYears", type.getName()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31995);assertEquals("PeriodType[StandardNoYears]", type.toString()); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31996);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 


public void testForFields51679() throws Exception {__CLR4_4_1oghoghlc8axeeb.R.globalSliceStart(getClass().getName(),31997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3dx65oot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oghoghlc8axeeb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oghoghlc8axeeb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields51679",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3dx65oot() throws Exception{try{__CLR4_4_1oghoghlc8axeeb.R.inc(31997); 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31998);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.centuries(), DurationFieldType.months() }; 
     __CLR4_4_1oghoghlc8axeeb.R.inc(31999);try { 
         __CLR4_4_1oghoghlc8axeeb.R.inc(32000);PeriodType.forFields(types); 
         __CLR4_4_1oghoghlc8axeeb.R.inc(32001);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oghoghlc8axeeb.R.inc(32002);try { 
         __CLR4_4_1oghoghlc8axeeb.R.inc(32003);PeriodType.forFields(types); 
         __CLR4_4_1oghoghlc8axeeb.R.inc(32004);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1oghoghlc8axeeb.R.inc(32005);
        __CLR4_4_1oghoghlc8axeeb.R.inc(32006);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1oghoghlc8axeeb.R.inc(32007);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1oghoghlc8axeeb.R.inc(32008);oos.writeObject(type);
        __CLR4_4_1oghoghlc8axeeb.R.inc(32009);byte[] bytes = baos.toByteArray();
        __CLR4_4_1oghoghlc8axeeb.R.inc(32010);oos.close();
        
        __CLR4_4_1oghoghlc8axeeb.R.inc(32011);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1oghoghlc8axeeb.R.inc(32012);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1oghoghlc8axeeb.R.inc(32013);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1oghoghlc8axeeb.R.inc(32014);ois.close();
        
        __CLR4_4_1oghoghlc8axeeb.R.inc(32015);assertEquals(type, result);
    }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}}

    private void assertSameAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1oghoghlc8axeeb.R.inc(32016);
        __CLR4_4_1oghoghlc8axeeb.R.inc(32017);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1oghoghlc8axeeb.R.inc(32018);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1oghoghlc8axeeb.R.inc(32019);oos.writeObject(type);
        __CLR4_4_1oghoghlc8axeeb.R.inc(32020);byte[] bytes = baos.toByteArray();
        __CLR4_4_1oghoghlc8axeeb.R.inc(32021);oos.close();
        
        __CLR4_4_1oghoghlc8axeeb.R.inc(32022);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1oghoghlc8axeeb.R.inc(32023);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1oghoghlc8axeeb.R.inc(32024);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1oghoghlc8axeeb.R.inc(32025);ois.close();
        
        __CLR4_4_1oghoghlc8axeeb.R.inc(32026);assertEquals(type, result);
    }finally{__CLR4_4_1oghoghlc8axeeb.R.flushNeeded();}}

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
    

    

    

    

    

    

    // ensure hash key distribution
    

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
    

}
