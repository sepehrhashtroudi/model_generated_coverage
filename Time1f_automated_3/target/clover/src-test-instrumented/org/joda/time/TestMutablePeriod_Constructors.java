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
public class TestMutablePeriod_Constructors extends TestCase {static class __CLR4_4_1j8hj8hle6np4k6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,24983,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1j8hj8hle6np4k6.R.inc(24929);
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24930);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j8hj8hle6np4k6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j8hj8hle6np4k6.R.inc(24931);
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24932);return new TestSuite(TestMutablePeriod_Constructors.class);
    }finally{__CLR4_4_1j8hj8hle6np4k6.R.flushNeeded();}}

    public TestMutablePeriod_Constructors(String name) {
        super(name);__CLR4_4_1j8hj8hle6np4k6.R.inc(24934);try{__CLR4_4_1j8hj8hle6np4k6.R.inc(24933);
    }finally{__CLR4_4_1j8hj8hle6np4k6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j8hj8hle6np4k6.R.inc(24935);
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24936);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24937);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24938);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24939);originalLocale = Locale.getDefault();
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24940);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24941);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24942);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j8hj8hle6np4k6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j8hj8hle6np4k6.R.inc(24943);
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24944);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24945);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24946);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24947);Locale.setDefault(originalLocale);
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24948);originalDateTimeZone = null;
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24949);originalTimeZone = null;
        __CLR4_4_1j8hj8hle6np4k6.R.inc(24950);originalLocale = null;
    }finally{__CLR4_4_1j8hj8hle6np4k6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_RI_RI4195() throws Throwable {__CLR4_4_1j8hj8hle6np4k6.R.globalSliceStart(getClass().getName(),24951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cflfcj93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j8hj8hle6np4k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j8hj8hle6np4k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI4195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cflfcj93() throws Throwable{try{__CLR4_4_1j8hj8hle6np4k6.R.inc(24951); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24952);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24953);DateTime dt2 = null; 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24954);Period test = new Period(dt1, dt2); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24955);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24956);assertEquals(-3, test.getYears()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24957);assertEquals(-1, test.getMonths()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24958);assertEquals(-1, test.getWeeks()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24959);assertEquals(-1, test.getDays()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24960);assertEquals(0, test.getHours()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24961);assertEquals(-1, test.getMinutes()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24962);assertEquals(-1, test.getSeconds()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24963);assertEquals(-1, test.getMillis()); 
 }finally{__CLR4_4_1j8hj8hle6np4k6.R.flushNeeded();}}
public void testParse_noFormatter500() throws Throwable {__CLR4_4_1j8hj8hle6np4k6.R.globalSliceStart(getClass().getName(),24964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1459c0hj9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j8hj8hle6np4k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j8hj8hle6np4k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testParse_noFormatter500",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1459c0hj9g() throws Throwable{try{__CLR4_4_1j8hj8hle6np4k6.R.inc(24964); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24965);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24966);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24967);assertEquals(new MutablePeriod(start, end), MutablePeriod.parse("2010-06-30T12:30/2010-07-01T14:30")); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24968);assertEquals(new MutablePeriod(start, end), MutablePeriod.parse("2010-06-30T12:30/P1DT2H")); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24969);assertEquals(new MutablePeriod(start, end), MutablePeriod.parse("P1DT2H/2010-07-01T14:30")); 
 }finally{__CLR4_4_1j8hj8hle6np4k6.R.flushNeeded();}}
public void testConstructor_long_long2502() throws Throwable {__CLR4_4_1j8hj8hle6np4k6.R.globalSliceStart(getClass().getName(),24970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pu0nosj9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j8hj8hle6np4k6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j8hj8hle6np4k6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long2502",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pu0nosj9m() throws Throwable{try{__CLR4_4_1j8hj8hle6np4k6.R.inc(24970); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24971);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24972);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24973);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24974);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24975);assertEquals(0, test.getYears()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24976);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24977);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24978);assertEquals(31, test.getDays()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24979);assertEquals(1, test.getHours()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24980);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24981);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1j8hj8hle6np4k6.R.inc(24982);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1j8hj8hle6np4k6.R.flushNeeded();}}
    

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
