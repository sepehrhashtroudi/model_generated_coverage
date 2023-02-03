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

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Sets extends TestCase {static class __CLR4_4_1i60i60lccietqt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,23597,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1i60i60lccietqt.R.inc(23544);
        __CLR4_4_1i60i60lccietqt.R.inc(23545);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i60i60lccietqt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i60i60lccietqt.R.inc(23546);
        __CLR4_4_1i60i60lccietqt.R.inc(23547);return new TestSuite(TestMutableDateTime_Sets.class);
    }finally{__CLR4_4_1i60i60lccietqt.R.flushNeeded();}}

    public TestMutableDateTime_Sets(String name) {
        super(name);__CLR4_4_1i60i60lccietqt.R.inc(23549);try{__CLR4_4_1i60i60lccietqt.R.inc(23548);
    }finally{__CLR4_4_1i60i60lccietqt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i60i60lccietqt.R.inc(23550);
        __CLR4_4_1i60i60lccietqt.R.inc(23551);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i60i60lccietqt.R.inc(23552);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1i60i60lccietqt.R.inc(23553);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1i60i60lccietqt.R.inc(23554);originalLocale = Locale.getDefault();
        __CLR4_4_1i60i60lccietqt.R.inc(23555);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1i60i60lccietqt.R.inc(23556);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1i60i60lccietqt.R.inc(23557);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1i60i60lccietqt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i60i60lccietqt.R.inc(23558);
        __CLR4_4_1i60i60lccietqt.R.inc(23559);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i60i60lccietqt.R.inc(23560);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1i60i60lccietqt.R.inc(23561);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1i60i60lccietqt.R.inc(23562);Locale.setDefault(originalLocale);
        __CLR4_4_1i60i60lccietqt.R.inc(23563);originalDateTimeZone = null;
        __CLR4_4_1i60i60lccietqt.R.inc(23564);originalTimeZone = null;
        __CLR4_4_1i60i60lccietqt.R.inc(23565);originalLocale = null;
    }finally{__CLR4_4_1i60i60lccietqt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSetWeekOfWeekyear_int131() {__CLR4_4_1i60i60lccietqt.R.globalSliceStart(getClass().getName(),23566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15nr96ui6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i60i60lccietqt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i60i60lccietqt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekOfWeekyear_int131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15nr96ui6m(){try{__CLR4_4_1i60i60lccietqt.R.inc(23566); 
     __CLR4_4_1i60i60lccietqt.R.inc(23567);MutableDateTime test = new MutableDateTime(2002, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1i60i60lccietqt.R.inc(23568);test.setWeekOfWeekyear(2001); 
     __CLR4_4_1i60i60lccietqt.R.inc(23569);assertEquals("2001-06-07T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1i60i60lccietqt.R.flushNeeded();}}
public void testSetTime_RI162() {__CLR4_4_1i60i60lccietqt.R.globalSliceStart(getClass().getName(),23570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1615gfvi6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i60i60lccietqt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i60i60lccietqt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_RI162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1615gfvi6q(){try{__CLR4_4_1i60i60lccietqt.R.inc(23570); 
     __CLR4_4_1i60i60lccietqt.R.inc(23571);MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23572);test.setTime(new Instant(TEST_TIME2)); 
     __CLR4_4_1i60i60lccietqt.R.inc(23573);assertEquals(TEST_TIME2, test.getMillis()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23574);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1i60i60lccietqt.R.flushNeeded();}}
public void testSetTime_RI_same318() {__CLR4_4_1i60i60lccietqt.R.globalSliceStart(getClass().getName(),23575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0x5w5i6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i60i60lccietqt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i60i60lccietqt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_RI_same318",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0x5w5i6v(){try{__CLR4_4_1i60i60lccietqt.R.inc(23575); 
     __CLR4_4_1i60i60lccietqt.R.inc(23576);MutableDateTime setter = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1i60i60lccietqt.R.inc(23577);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1i60i60lccietqt.R.inc(23578);test.setTime(setter.getMillis()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23579);assertEquals(2010, test.getYear()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23580);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23581);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23582);assertEquals(2, test.getHourOfDay()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23583);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23584);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23585);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1i60i60lccietqt.R.flushNeeded();}}
public void testSetTime_RI_same319() {__CLR4_4_1i60i60lccietqt.R.globalSliceStart(getClass().getName(),23586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9x4omi76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i60i60lccietqt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i60i60lccietqt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_RI_same319",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9x4omi76(){try{__CLR4_4_1i60i60lccietqt.R.inc(23586); 
     __CLR4_4_1i60i60lccietqt.R.inc(23587);MutableDateTime setter = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1i60i60lccietqt.R.inc(23588);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1i60i60lccietqt.R.inc(23589);test.setTime(setter); 
     __CLR4_4_1i60i60lccietqt.R.inc(23590);assertEquals(2010, test.getYear()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23591);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23592);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23593);assertEquals(2, test.getHourOfDay()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23594);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23595);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1i60i60lccietqt.R.inc(23596);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1i60i60lccietqt.R.flushNeeded();}}
    

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
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

}
