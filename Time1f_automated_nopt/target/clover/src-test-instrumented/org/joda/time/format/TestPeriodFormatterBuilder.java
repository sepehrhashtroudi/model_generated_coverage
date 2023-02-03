/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * This class is a Junit unit test for PeriodFormatterBuilder.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormatterBuilder extends TestCase {static class __CLR4_4_1jrbjrbldl911nq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675230570616L,8589935092L,25655,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final Period PERIOD = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    private static final Period EMPTY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0);
    private static final Period YEAR_DAY_PERIOD = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
    private static final Period EMPTY_YEAR_DAY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime());
    private static final Period TIME_PERIOD = new Period(0, 0, 0, 0, 5, 6, 7, 8);
    private static final Period DATE_PERIOD = new Period(1, 2, 3, 4, 0, 0, 0, 0);

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    //private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;
    
    private PeriodFormatterBuilder builder;

    public static void main(String[] args) {try{__CLR4_4_1jrbjrbldl911nq.R.inc(25607);
        __CLR4_4_1jrbjrbldl911nq.R.inc(25608);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jrbjrbldl911nq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jrbjrbldl911nq.R.inc(25609);
        __CLR4_4_1jrbjrbldl911nq.R.inc(25610);return new TestSuite(TestPeriodFormatterBuilder.class);
    }finally{__CLR4_4_1jrbjrbldl911nq.R.flushNeeded();}}

    public TestPeriodFormatterBuilder(String name) {
        super(name);__CLR4_4_1jrbjrbldl911nq.R.inc(25612);try{__CLR4_4_1jrbjrbldl911nq.R.inc(25611);
    }finally{__CLR4_4_1jrbjrbldl911nq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jrbjrbldl911nq.R.inc(25613);
        __CLR4_4_1jrbjrbldl911nq.R.inc(25614);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jrbjrbldl911nq.R.inc(25615);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jrbjrbldl911nq.R.inc(25616);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jrbjrbldl911nq.R.inc(25617);originalLocale = Locale.getDefault();
        __CLR4_4_1jrbjrbldl911nq.R.inc(25618);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jrbjrbldl911nq.R.inc(25619);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jrbjrbldl911nq.R.inc(25620);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1jrbjrbldl911nq.R.inc(25621);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_1jrbjrbldl911nq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jrbjrbldl911nq.R.inc(25622);
        __CLR4_4_1jrbjrbldl911nq.R.inc(25623);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jrbjrbldl911nq.R.inc(25624);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jrbjrbldl911nq.R.inc(25625);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jrbjrbldl911nq.R.inc(25626);Locale.setDefault(originalLocale);
        __CLR4_4_1jrbjrbldl911nq.R.inc(25627);originalDateTimeZone = null;
        __CLR4_4_1jrbjrbldl911nq.R.inc(25628);originalTimeZone = null;
        __CLR4_4_1jrbjrbldl911nq.R.inc(25629);originalLocale = null;
    }finally{__CLR4_4_1jrbjrbldl911nq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testAppendYears10() {__CLR4_4_1jrbjrbldl911nq.R.globalSliceStart(getClass().getName(),25630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c8vc5sjry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrbjrbldl911nq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrbjrbldl911nq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testAppendYears10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c8vc5sjry(){try{__CLR4_4_1jrbjrbldl911nq.R.inc(25630); __CLR4_4_1jrbjrbldl911nq.R.inc(25631);PeriodFormatterBuilder builder = new PeriodFormatterBuilder().appendYears(); __CLR4_4_1jrbjrbldl911nq.R.inc(25632);assertEquals("Years", builder.toString()); }finally{__CLR4_4_1jrbjrbldl911nq.R.flushNeeded();}}
public void testAppendMinutes116() {__CLR4_4_1jrbjrbldl911nq.R.globalSliceStart(getClass().getName(),25633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15lm4eujs1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrbjrbldl911nq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrbjrbldl911nq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testAppendMinutes116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15lm4eujs1(){try{__CLR4_4_1jrbjrbldl911nq.R.inc(25633); __CLR4_4_1jrbjrbldl911nq.R.inc(25634);PeriodFormatterBuilder builder = new PeriodFormatterBuilder().appendMinutes(); __CLR4_4_1jrbjrbldl911nq.R.inc(25635);assertEquals("1 minute", builder.toString()); }finally{__CLR4_4_1jrbjrbldl911nq.R.flushNeeded();}}
public void testAppendMinutes135() {__CLR4_4_1jrbjrbldl911nq.R.globalSliceStart(getClass().getName(),25636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kg0c3djs4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrbjrbldl911nq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrbjrbldl911nq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testAppendMinutes135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kg0c3djs4(){try{__CLR4_4_1jrbjrbldl911nq.R.inc(25636); __CLR4_4_1jrbjrbldl911nq.R.inc(25637);PeriodFormatterBuilder builder = new PeriodFormatterBuilder().appendMinutes(); __CLR4_4_1jrbjrbldl911nq.R.inc(25638);assertEquals("00:00:00", builder.toString()); }finally{__CLR4_4_1jrbjrbldl911nq.R.flushNeeded();}}
public void testAppendHours624() {__CLR4_4_1jrbjrbldl911nq.R.globalSliceStart(getClass().getName(),25639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6us10js7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrbjrbldl911nq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrbjrbldl911nq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testAppendHours624",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6us10js7(){try{__CLR4_4_1jrbjrbldl911nq.R.inc(25639); __CLR4_4_1jrbjrbldl911nq.R.inc(25640);PeriodFormatterBuilder builder = new PeriodFormatterBuilder().appendHours(); __CLR4_4_1jrbjrbldl911nq.R.inc(25641);assertEquals("1 hour", builder.toString()); }finally{__CLR4_4_1jrbjrbldl911nq.R.flushNeeded();}}
public void testPeriodFormatter631() {__CLR4_4_1jrbjrbldl911nq.R.globalSliceStart(getClass().getName(),25642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bsv0w4jsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrbjrbldl911nq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrbjrbldl911nq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testPeriodFormatter631",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bsv0w4jsa(){try{__CLR4_4_1jrbjrbldl911nq.R.inc(25642); __CLR4_4_1jrbjrbldl911nq.R.inc(25643);PeriodFormatter formatter = new PeriodFormatter(null, null); __CLR4_4_1jrbjrbldl911nq.R.inc(25644);Period p1 = formatter.parsePeriod("P1Y"); __CLR4_4_1jrbjrbldl911nq.R.inc(25645);Period p2 = formatter.parsePeriod("P2Y"); __CLR4_4_1jrbjrbldl911nq.R.inc(25646);Period p3 = formatter.parsePeriod("P3Y"); __CLR4_4_1jrbjrbldl911nq.R.inc(25647);Period p4 = formatter.parsePeriod("P4Y"); __CLR4_4_1jrbjrbldl911nq.R.inc(25648);Period p5 = formatter.parsePeriod("P5Y"); __CLR4_4_1jrbjrbldl911nq.R.inc(25649);Period p6 = formatter.parsePeriod("P6Y"); __CLR4_4_1jrbjrbldl911nq.R.inc(25650);Period p7 = formatter.parsePeriod("P7Y"); __CLR4_4_1jrbjrbldl911nq.R.inc(25651);assertEquals(p1, p2); __CLR4_4_1jrbjrbldl911nq.R.inc(25652);assertEquals(p2, p3); __CLR4_4_1jrbjrbldl911nq.R.inc(25653);assertEquals(p3, p4); __CLR4_4_1jrbjrbldl911nq.R.inc(25654);assertEquals(p4, p5);
}finally{__CLR4_4_1jrbjrbldl911nq.R.flushNeeded();}}

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

}
