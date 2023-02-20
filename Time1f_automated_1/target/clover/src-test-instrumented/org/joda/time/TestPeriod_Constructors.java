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
public class TestPeriod_Constructors extends TestCase {static class __CLR4_4_1juujuule6ndpsl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,25812,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1juujuule6ndpsl.R.inc(25734);
        __CLR4_4_1juujuule6ndpsl.R.inc(25735);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1juujuule6ndpsl.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1juujuule6ndpsl.R.inc(25736);
        __CLR4_4_1juujuule6ndpsl.R.inc(25737);return new TestSuite(TestPeriod_Constructors.class);
    }finally{__CLR4_4_1juujuule6ndpsl.R.flushNeeded();}}

    public TestPeriod_Constructors(String name) {
        super(name);__CLR4_4_1juujuule6ndpsl.R.inc(25739);try{__CLR4_4_1juujuule6ndpsl.R.inc(25738);
    }finally{__CLR4_4_1juujuule6ndpsl.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1juujuule6ndpsl.R.inc(25740);
        __CLR4_4_1juujuule6ndpsl.R.inc(25741);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1juujuule6ndpsl.R.inc(25742);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1juujuule6ndpsl.R.inc(25743);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1juujuule6ndpsl.R.inc(25744);originalLocale = Locale.getDefault();
        __CLR4_4_1juujuule6ndpsl.R.inc(25745);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1juujuule6ndpsl.R.inc(25746);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1juujuule6ndpsl.R.inc(25747);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1juujuule6ndpsl.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1juujuule6ndpsl.R.inc(25748);
        __CLR4_4_1juujuule6ndpsl.R.inc(25749);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1juujuule6ndpsl.R.inc(25750);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1juujuule6ndpsl.R.inc(25751);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1juujuule6ndpsl.R.inc(25752);Locale.setDefault(originalLocale);
        __CLR4_4_1juujuule6ndpsl.R.inc(25753);originalDateTimeZone = null;
        __CLR4_4_1juujuule6ndpsl.R.inc(25754);originalTimeZone = null;
        __CLR4_4_1juujuule6ndpsl.R.inc(25755);originalLocale = null;
    }finally{__CLR4_4_1juujuule6ndpsl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_long_Chronology416() throws Throwable {__CLR4_4_1juujuule6ndpsl.R.globalSliceStart(getClass().getName(),25756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qxypycjvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1juujuule6ndpsl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1juujuule6ndpsl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_Chronology416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qxypycjvg() throws Throwable{try{__CLR4_4_1juujuule6ndpsl.R.inc(25756); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25757);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1juujuule6ndpsl.R.inc(25758);Period test = new Period(length, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25759);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25760);assertEquals(0, test.getYears()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25761);assertEquals(0, test.getMonths()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25762);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25763);assertEquals(0, test.getDays()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25764);assertEquals((4 * 24) + 5, test.getHours()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25765);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25766);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25767);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1juujuule6ndpsl.R.flushNeeded();}}
public void testConstructor_long_Chronology217() throws Throwable {__CLR4_4_1juujuule6ndpsl.R.globalSliceStart(getClass().getName(),25768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jf9dfpjvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1juujuule6ndpsl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1juujuule6ndpsl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_Chronology217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jf9dfpjvs() throws Throwable{try{__CLR4_4_1juujuule6ndpsl.R.inc(25768); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25769);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1juujuule6ndpsl.R.inc(25770);Period test = new Period(length, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25771);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25772);assertEquals(0, test.getYears()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25773);assertEquals(0, test.getMonths()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25774);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25775);assertEquals(0, test.getDays()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25776);assertEquals((4 * 24) + 5, test.getHours()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25777);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25778);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25779);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1juujuule6ndpsl.R.flushNeeded();}}
public void testConstructor_long_long118() throws Throwable {__CLR4_4_1juujuule6ndpsl.R.globalSliceStart(getClass().getName(),25780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v349s9jw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1juujuule6ndpsl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1juujuule6ndpsl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v349s9jw4() throws Throwable{try{__CLR4_4_1juujuule6ndpsl.R.inc(25780); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25781);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25782);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25783);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25784);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25785);assertEquals(1, test.getYears()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25786);assertEquals(1, test.getMonths()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25787);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25788);assertEquals(1, test.getDays()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25789);assertEquals(1, test.getHours()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25790);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25791);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25792);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1juujuule6ndpsl.R.flushNeeded();}}
public void testConstructor_long_long_PeriodType119() throws Throwable {__CLR4_4_1juujuule6ndpsl.R.globalSliceStart(getClass().getName(),25793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jcpa2ajwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1juujuule6ndpsl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1juujuule6ndpsl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType119",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jcpa2ajwh() throws Throwable{try{__CLR4_4_1juujuule6ndpsl.R.inc(25793); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25794);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25795);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25796);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), PeriodType.yearDayTime()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25797);assertEquals(PeriodType.yearDayTime(), test.getPeriodType()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25798);assertEquals(1, test.getYears()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25799);assertEquals(0, test.getMonths()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25800);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25801);assertEquals(31, test.getDays()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25802);assertEquals(1, test.getHours()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25803);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25804);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25805);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1juujuule6ndpsl.R.flushNeeded();}}
@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP_PeriodType6337() throws Throwable {__CLR4_4_1juujuule6ndpsl.R.globalSliceStart(getClass().getName(),25806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h43umejwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1juujuule6ndpsl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1juujuule6ndpsl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType6337",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h43umejwu() throws Throwable{try{__CLR4_4_1juujuule6ndpsl.R.inc(25806); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25807);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25808);TimeOfDay dt2 = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1juujuule6ndpsl.R.inc(25809);try { 
         __CLR4_4_1juujuule6ndpsl.R.inc(25810);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1juujuule6ndpsl.R.inc(25811);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1juujuule6ndpsl.R.flushNeeded();}}
    

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
