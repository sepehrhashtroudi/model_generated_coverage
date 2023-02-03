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
 * This class is a Junit unit test for PeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormatParsing extends TestCase {static class __CLR4_4_1kmokmolccieu3s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,26795,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Period PERIOD = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    private static final Period EMPTY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0);
    private static final Period YEAR_DAY_PERIOD = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
    private static final Period EMPTY_YEAR_DAY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime());
    private static final Period TIME_PERIOD = new Period(0, 0, 0, 0, 5, 6, 7, 8);
    private static final Period DATE_PERIOD = new Period(1, 2, 3, 4, 0, 0, 0, 0);

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW = (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1kmokmolccieu3s.R.inc(26736);
        __CLR4_4_1kmokmolccieu3s.R.inc(26737);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kmokmolccieu3s.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kmokmolccieu3s.R.inc(26738);
        __CLR4_4_1kmokmolccieu3s.R.inc(26739);return new TestSuite(TestPeriodFormatParsing.class);
    }finally{__CLR4_4_1kmokmolccieu3s.R.flushNeeded();}}

    public TestPeriodFormatParsing(String name) {
        super(name);__CLR4_4_1kmokmolccieu3s.R.inc(26741);try{__CLR4_4_1kmokmolccieu3s.R.inc(26740);
    }finally{__CLR4_4_1kmokmolccieu3s.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kmokmolccieu3s.R.inc(26742);
        __CLR4_4_1kmokmolccieu3s.R.inc(26743);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kmokmolccieu3s.R.inc(26744);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1kmokmolccieu3s.R.inc(26745);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1kmokmolccieu3s.R.inc(26746);originalLocale = Locale.getDefault();
        __CLR4_4_1kmokmolccieu3s.R.inc(26747);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kmokmolccieu3s.R.inc(26748);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1kmokmolccieu3s.R.inc(26749);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1kmokmolccieu3s.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kmokmolccieu3s.R.inc(26750);
        __CLR4_4_1kmokmolccieu3s.R.inc(26751);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kmokmolccieu3s.R.inc(26752);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1kmokmolccieu3s.R.inc(26753);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1kmokmolccieu3s.R.inc(26754);Locale.setDefault(originalLocale);
        __CLR4_4_1kmokmolccieu3s.R.inc(26755);originalDateTimeZone = null;
        __CLR4_4_1kmokmolccieu3s.R.inc(26756);originalTimeZone = null;
        __CLR4_4_1kmokmolccieu3s.R.inc(26757);originalLocale = null;
    }finally{__CLR4_4_1kmokmolccieu3s.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToPeriod40() {__CLR4_4_1kmokmolccieu3s.R.globalSliceStart(getClass().getName(),26758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bk5sfjkna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmokmolccieu3s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmokmolccieu3s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatParsing.testToPeriod40",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bk5sfjkna(){try{__CLR4_4_1kmokmolccieu3s.R.inc(26758); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26759);Period test = new Period(123L); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26760);Period result = test.toPeriod(); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26761);assertSame(test, result); 
 }finally{__CLR4_4_1kmokmolccieu3s.R.flushNeeded();}}
public void testConstructor_4int1257() throws Throwable {__CLR4_4_1kmokmolccieu3s.R.globalSliceStart(getClass().getName(),26762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fry4kne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmokmolccieu3s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmokmolccieu3s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatParsing.testConstructor_4int1257",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fry4kne() throws Throwable{try{__CLR4_4_1kmokmolccieu3s.R.inc(26762); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26763);Period test = new Period(5, 6, 7, 8); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26764);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26765);assertEquals(0, test.getYears()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26766);assertEquals(0, test.getMonths()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26767);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26768);assertEquals(0, test.getDays()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26769);assertEquals(5, test.getHours()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26770);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26771);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26772);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1kmokmolccieu3s.R.flushNeeded();}}
public void testConstructor_Object3260() throws Throwable {__CLR4_4_1kmokmolccieu3s.R.globalSliceStart(getClass().getName(),26773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mx80aknp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmokmolccieu3s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmokmolccieu3s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatParsing.testConstructor_Object3260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mx80aknp() throws Throwable{try{__CLR4_4_1kmokmolccieu3s.R.inc(26773); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26774);Period test = new Period((Object) null); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26775);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26776);assertEquals(0, test.getYears()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26777);assertEquals(0, test.getMonths()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26778);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26779);assertEquals(0, test.getDays()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26780);assertEquals(0, test.getHours()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26781);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26782);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26783);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1kmokmolccieu3s.R.flushNeeded();}}
public void testConstructor_Object_PeriodType2261() throws Throwable {__CLR4_4_1kmokmolccieu3s.R.globalSliceStart(getClass().getName(),26784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uu7dyyko0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmokmolccieu3s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmokmolccieu3s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatParsing.testConstructor_Object_PeriodType2261",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uu7dyyko0() throws Throwable{try{__CLR4_4_1kmokmolccieu3s.R.inc(26784); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26785);Period test = new Period((Object) null, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26786);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26787);assertEquals(0, test.getYears()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26788);assertEquals(0, test.getMonths()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26789);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26790);assertEquals(0, test.getDays()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26791);assertEquals(0, test.getHours()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26792);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26793);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1kmokmolccieu3s.R.inc(26794);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1kmokmolccieu3s.R.flushNeeded();}}
    
// Defects4J: flaky method
//     public void testParseStandard1() {
//         PeriodFormatter parser = PeriodFormat.getDefault();
//         Period p = parser.parsePeriod("6 years, 3 months and 2 days");
//         assertEquals(new Period(6, 3, 0, 2, 0, 0, 0, 0), p);
//     }

    

}
