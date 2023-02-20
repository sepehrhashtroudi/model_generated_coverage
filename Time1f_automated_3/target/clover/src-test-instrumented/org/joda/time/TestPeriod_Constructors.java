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
public class TestPeriod_Constructors extends TestCase {static class __CLR4_4_1jmqjmqle6np4lt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,25489,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jmqjmqle6np4lt.R.inc(25442);
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25443);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jmqjmqle6np4lt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jmqjmqle6np4lt.R.inc(25444);
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25445);return new TestSuite(TestPeriod_Constructors.class);
    }finally{__CLR4_4_1jmqjmqle6np4lt.R.flushNeeded();}}

    public TestPeriod_Constructors(String name) {
        super(name);__CLR4_4_1jmqjmqle6np4lt.R.inc(25447);try{__CLR4_4_1jmqjmqle6np4lt.R.inc(25446);
    }finally{__CLR4_4_1jmqjmqle6np4lt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jmqjmqle6np4lt.R.inc(25448);
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25449);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25450);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25451);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25452);originalLocale = Locale.getDefault();
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25453);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25454);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25455);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jmqjmqle6np4lt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jmqjmqle6np4lt.R.inc(25456);
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25457);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25458);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25459);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25460);Locale.setDefault(originalLocale);
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25461);originalDateTimeZone = null;
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25462);originalTimeZone = null;
        __CLR4_4_1jmqjmqle6np4lt.R.inc(25463);originalLocale = null;
    }finally{__CLR4_4_1jmqjmqle6np4lt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference421() throws Throwable {__CLR4_4_1jmqjmqle6np4lt.R.globalSliceStart(getClass().getName(),25464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3dzutjnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmqjmqle6np4lt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmqjmqle6np4lt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference421",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3dzutjnc() throws Throwable{try{__CLR4_4_1jmqjmqle6np4lt.R.inc(25464); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25465);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25466);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25467);Partial end = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25468);try { 
         __CLR4_4_1jmqjmqle6np4lt.R.inc(25469);Period.fieldDifference(start, end); 
         __CLR4_4_1jmqjmqle6np4lt.R.inc(25470);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jmqjmqle6np4lt.R.flushNeeded();}}
public void testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths23() throws Throwable {__CLR4_4_1jmqjmqle6np4lt.R.globalSliceStart(getClass().getName(),25471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q3qqfxjnj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmqjmqle6np4lt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmqjmqle6np4lt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q3qqfxjnj() throws Throwable{try{__CLR4_4_1jmqjmqle6np4lt.R.inc(25471); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25472);DateTime dt1 = new DateTime(2004, 12, 28, 0, 0); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25473);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25474);Period test = new Period(dt1, dt2); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25475);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25476);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1jmqjmqle6np4lt.R.flushNeeded();}}
public void testConstructor_RP_RP_PeriodType8349() throws Throwable {__CLR4_4_1jmqjmqle6np4lt.R.globalSliceStart(getClass().getName(),25477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1st49x5jnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmqjmqle6np4lt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmqjmqle6np4lt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType8349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1st49x5jnp() throws Throwable{try{__CLR4_4_1jmqjmqle6np4lt.R.inc(25477); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25478);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25479);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25480);try { 
         __CLR4_4_1jmqjmqle6np4lt.R.inc(25481);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1jmqjmqle6np4lt.R.inc(25482);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jmqjmqle6np4lt.R.flushNeeded();}}
public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths350() throws Throwable {__CLR4_4_1jmqjmqle6np4lt.R.globalSliceStart(getClass().getName(),25483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161xr8gjnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmqjmqle6np4lt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmqjmqle6np4lt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161xr8gjnv() throws Throwable{try{__CLR4_4_1jmqjmqle6np4lt.R.inc(25483); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25484);LocalDate dt1 = new LocalDate(2004, 12, 28); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25485);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25486);Period test = new Period(dt1, dt2); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25487);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1jmqjmqle6np4lt.R.inc(25488);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1jmqjmqle6np4lt.R.flushNeeded();}}
    

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
