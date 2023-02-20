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
public class TestPeriod_Constructors extends TestCase {static class __CLR4_4_1ji7ji7le6o7a0o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,25351,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1ji7ji7le6o7a0o.R.inc(25279);
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25280);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ji7ji7le6o7a0o.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ji7ji7le6o7a0o.R.inc(25281);
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25282);return new TestSuite(TestPeriod_Constructors.class);
    }finally{__CLR4_4_1ji7ji7le6o7a0o.R.flushNeeded();}}

    public TestPeriod_Constructors(String name) {
        super(name);__CLR4_4_1ji7ji7le6o7a0o.R.inc(25284);try{__CLR4_4_1ji7ji7le6o7a0o.R.inc(25283);
    }finally{__CLR4_4_1ji7ji7le6o7a0o.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ji7ji7le6o7a0o.R.inc(25285);
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25286);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25287);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25288);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25289);originalLocale = Locale.getDefault();
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25290);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25291);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25292);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ji7ji7le6o7a0o.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ji7ji7le6o7a0o.R.inc(25293);
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25294);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25295);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25296);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25297);Locale.setDefault(originalLocale);
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25298);originalDateTimeZone = null;
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25299);originalTimeZone = null;
        __CLR4_4_1ji7ji7le6o7a0o.R.inc(25300);originalLocale = null;
    }finally{__CLR4_4_1ji7ji7le6o7a0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_RI_RI327() throws Throwable {__CLR4_4_1ji7ji7le6o7a0o.R.globalSliceStart(getClass().getName(),25301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqtewnjit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ji7ji7le6o7a0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ji7ji7le6o7a0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI327",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqtewnjit() throws Throwable{try{__CLR4_4_1ji7ji7le6o7a0o.R.inc(25301); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25302);DateTime dt1 = null; 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25303);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25304);Period test = new Period(dt1, dt2); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25305);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25306);assertEquals(3, test.getYears()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25307);assertEquals(1, test.getMonths()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25308);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25309);assertEquals(1, test.getDays()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25310);assertEquals(0, test.getHours()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25311);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25312);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25313);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1ji7ji7le6o7a0o.R.flushNeeded();}}
public void testConstructor_RI_RD228() throws Throwable {__CLR4_4_1ji7ji7le6o7a0o.R.globalSliceStart(getClass().getName(),25314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16v8uikjj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ji7ji7le6o7a0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ji7ji7le6o7a0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16v8uikjj6() throws Throwable{try{__CLR4_4_1ji7ji7le6o7a0o.R.inc(25314); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25315);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25316);Duration dur = null; 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25317);Period test = new Period(dt1, dur); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25318);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25319);assertEquals(0, test.getYears()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25320);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25321);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25322);assertEquals(0, test.getDays()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25323);assertEquals(0, test.getHours()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25324);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25325);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25326);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1ji7ji7le6o7a0o.R.flushNeeded();}}
public void testConstructor_Object_PeriodType3287() throws Throwable {__CLR4_4_1ji7ji7le6o7a0o.R.globalSliceStart(getClass().getName(),25327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i2x6wnjjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ji7ji7le6o7a0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ji7ji7le6o7a0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType3287",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i2x6wnjjj() throws Throwable{try{__CLR4_4_1ji7ji7le6o7a0o.R.inc(25327); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25328);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.yearMonthDayTime()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25329);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25330);assertEquals(0, test.getYears()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25331);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25332);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25333);assertEquals(0, test.getDays()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25334);assertEquals(1, test.getHours()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25335);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25336);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25337);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1ji7ji7le6o7a0o.R.flushNeeded();}}
public void testConstructor_RI_RI5313() throws Throwable {__CLR4_4_1ji7ji7le6o7a0o.R.globalSliceStart(getClass().getName(),25338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y44q1bjju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ji7ji7le6o7a0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ji7ji7le6o7a0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI5313",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y44q1bjju() throws Throwable{try{__CLR4_4_1ji7ji7le6o7a0o.R.inc(25338); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25339);DateTime dt1 = null; 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25340);DateTime dt2 = null; 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25341);MutablePeriod test = new MutablePeriod(dt1, dt2); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25342);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25343);assertEquals(0, test.getYears()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25344);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25345);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25346);assertEquals(0, test.getDays()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25347);assertEquals(0, test.getHours()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25348);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25349);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ji7ji7le6o7a0o.R.inc(25350);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1ji7ji7le6o7a0o.R.flushNeeded();}}
    

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
