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
public class TestMutablePeriod_Constructors extends TestCase {static class __CLR4_4_1jbejbele6ndppn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,25090,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jbejbele6ndppn.R.inc(25034);
        __CLR4_4_1jbejbele6ndppn.R.inc(25035);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jbejbele6ndppn.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jbejbele6ndppn.R.inc(25036);
        __CLR4_4_1jbejbele6ndppn.R.inc(25037);return new TestSuite(TestMutablePeriod_Constructors.class);
    }finally{__CLR4_4_1jbejbele6ndppn.R.flushNeeded();}}

    public TestMutablePeriod_Constructors(String name) {
        super(name);__CLR4_4_1jbejbele6ndppn.R.inc(25039);try{__CLR4_4_1jbejbele6ndppn.R.inc(25038);
    }finally{__CLR4_4_1jbejbele6ndppn.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jbejbele6ndppn.R.inc(25040);
        __CLR4_4_1jbejbele6ndppn.R.inc(25041);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jbejbele6ndppn.R.inc(25042);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jbejbele6ndppn.R.inc(25043);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jbejbele6ndppn.R.inc(25044);originalLocale = Locale.getDefault();
        __CLR4_4_1jbejbele6ndppn.R.inc(25045);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jbejbele6ndppn.R.inc(25046);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jbejbele6ndppn.R.inc(25047);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jbejbele6ndppn.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jbejbele6ndppn.R.inc(25048);
        __CLR4_4_1jbejbele6ndppn.R.inc(25049);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jbejbele6ndppn.R.inc(25050);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jbejbele6ndppn.R.inc(25051);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jbejbele6ndppn.R.inc(25052);Locale.setDefault(originalLocale);
        __CLR4_4_1jbejbele6ndppn.R.inc(25053);originalDateTimeZone = null;
        __CLR4_4_1jbejbele6ndppn.R.inc(25054);originalTimeZone = null;
        __CLR4_4_1jbejbele6ndppn.R.inc(25055);originalLocale = null;
    }finally{__CLR4_4_1jbejbele6ndppn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_RI_RI_PeriodType1594() throws Throwable {__CLR4_4_1jbejbele6ndppn.R.globalSliceStart(getClass().getName(),25056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14zioawjc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbele6ndppn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbele6ndppn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType1594",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14zioawjc0() throws Throwable{try{__CLR4_4_1jbejbele6ndppn.R.inc(25056); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25057);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25058);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25059);MutablePeriod test = new MutablePeriod(dt1, dt2, PeriodType.yearDayTime()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25060);assertEquals(PeriodType.yearDayTime(), test.getPeriodType()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25061);assertEquals(1, test.getYears()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25062);assertEquals(1, test.getMonths()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25063);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25064);assertEquals(1, test.getDays()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25065);assertEquals(1, test.getHours()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25066);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25067);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25068);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1jbejbele6ndppn.R.flushNeeded();}}
public void testConstructor_RI_RD2595() throws Throwable {__CLR4_4_1jbejbele6ndppn.R.globalSliceStart(getClass().getName(),25069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14mx10pjcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbele6ndppn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbele6ndppn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD2595",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14mx10pjcd() throws Throwable{try{__CLR4_4_1jbejbele6ndppn.R.inc(25069); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25070);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25071);Duration dur = null; 
     __CLR4_4_1jbejbele6ndppn.R.inc(25072);MutablePeriod test = new MutablePeriod(dt1, dur); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25073);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25074);assertEquals(0, test.getYears()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25075);assertEquals(0, test.getMonths()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25076);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25077);assertEquals(0, test.getDays()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25078);assertEquals(0, test.getHours()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25079);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25080);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25081);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1jbejbele6ndppn.R.flushNeeded();}}
public void testToPeriod596() {__CLR4_4_1jbejbele6ndppn.R.globalSliceStart(getClass().getName(),25082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xsg4ejjcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbele6ndppn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbele6ndppn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testToPeriod596",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xsg4ejjcq(){try{__CLR4_4_1jbejbele6ndppn.R.inc(25082); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25083);MutablePeriod test = new MutablePeriod(123L); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25084);Period result = test.toPeriod(); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25085);assertEquals(test, result); 
 }finally{__CLR4_4_1jbejbele6ndppn.R.flushNeeded();}}
public void testToMutablePeriod597() {__CLR4_4_1jbejbele6ndppn.R.globalSliceStart(getClass().getName(),25086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14mdsf4jcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbele6ndppn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbele6ndppn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testToMutablePeriod597",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14mdsf4jcu(){try{__CLR4_4_1jbejbele6ndppn.R.inc(25086); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25087);Period test = new Period(123L); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25088);MutablePeriod result = test.toMutablePeriod(); 
     __CLR4_4_1jbejbele6ndppn.R.inc(25089);assertEquals(test, result); 
 }finally{__CLR4_4_1jbejbele6ndppn.R.flushNeeded();}}
    

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
