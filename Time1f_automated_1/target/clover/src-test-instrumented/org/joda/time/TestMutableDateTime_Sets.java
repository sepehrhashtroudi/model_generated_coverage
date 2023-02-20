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
public class TestMutableDateTime_Sets extends TestCase {static class __CLR4_4_1j54j54le6ndpoc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,24875,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1j54j54le6ndpoc.R.inc(24808);
        __CLR4_4_1j54j54le6ndpoc.R.inc(24809);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j54j54le6ndpoc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j54j54le6ndpoc.R.inc(24810);
        __CLR4_4_1j54j54le6ndpoc.R.inc(24811);return new TestSuite(TestMutableDateTime_Sets.class);
    }finally{__CLR4_4_1j54j54le6ndpoc.R.flushNeeded();}}

    public TestMutableDateTime_Sets(String name) {
        super(name);__CLR4_4_1j54j54le6ndpoc.R.inc(24813);try{__CLR4_4_1j54j54le6ndpoc.R.inc(24812);
    }finally{__CLR4_4_1j54j54le6ndpoc.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j54j54le6ndpoc.R.inc(24814);
        __CLR4_4_1j54j54le6ndpoc.R.inc(24815);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j54j54le6ndpoc.R.inc(24816);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j54j54le6ndpoc.R.inc(24817);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j54j54le6ndpoc.R.inc(24818);originalLocale = Locale.getDefault();
        __CLR4_4_1j54j54le6ndpoc.R.inc(24819);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j54j54le6ndpoc.R.inc(24820);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j54j54le6ndpoc.R.inc(24821);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j54j54le6ndpoc.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j54j54le6ndpoc.R.inc(24822);
        __CLR4_4_1j54j54le6ndpoc.R.inc(24823);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j54j54le6ndpoc.R.inc(24824);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j54j54le6ndpoc.R.inc(24825);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j54j54le6ndpoc.R.inc(24826);Locale.setDefault(originalLocale);
        __CLR4_4_1j54j54le6ndpoc.R.inc(24827);originalDateTimeZone = null;
        __CLR4_4_1j54j54le6ndpoc.R.inc(24828);originalTimeZone = null;
        __CLR4_4_1j54j54le6ndpoc.R.inc(24829);originalLocale = null;
    }finally{__CLR4_4_1j54j54le6ndpoc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToDateTime_Chronology486() {__CLR4_4_1j54j54le6ndpoc.R.globalSliceStart(getClass().getName(),24830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oydz0qj5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j54j54le6ndpoc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j54j54le6ndpoc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testToDateTime_Chronology486",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oydz0qj5q(){try{__CLR4_4_1j54j54le6ndpoc.R.inc(24830); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24831);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24832);MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24833);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24834);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24835);test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24836);result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24837);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24838);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24839);test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24840);result = test.toMutableDateTime((Chronology) null); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24841);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24842);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1j54j54le6ndpoc.R.flushNeeded();}}
public void testSet_DateTimeFieldType_int3490() {__CLR4_4_1j54j54le6ndpoc.R.globalSliceStart(getClass().getName(),24843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8afqxj63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j54j54le6ndpoc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j54j54le6ndpoc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int3490",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8afqxj63(){try{__CLR4_4_1j54j54le6ndpoc.R.inc(24843); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24844);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24845);try { 
         __CLR4_4_1j54j54le6ndpoc.R.inc(24846);test.set(DateTimeFieldType.monthOfYear(), 13); 
         __CLR4_4_1j54j54le6ndpoc.R.inc(24847);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24848);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1j54j54le6ndpoc.R.flushNeeded();}}
public void testSet_DateTimeFieldType_int3491() {__CLR4_4_1j54j54le6ndpoc.R.globalSliceStart(getClass().getName(),24849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ihaejej69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j54j54le6ndpoc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j54j54le6ndpoc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int3491",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ihaejej69(){try{__CLR4_4_1j54j54le6ndpoc.R.inc(24849); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24850);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24851);try { 
         __CLR4_4_1j54j54le6ndpoc.R.inc(24852);test.set(null, 6); 
         __CLR4_4_1j54j54le6ndpoc.R.inc(24853);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24854);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1j54j54le6ndpoc.R.flushNeeded();}}
public void testSetSecondOfDay_int1498() {__CLR4_4_1j54j54le6ndpoc.R.globalSliceStart(getClass().getName(),24855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q206yij6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j54j54le6ndpoc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j54j54le6ndpoc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfDay_int1498",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q206yij6f(){try{__CLR4_4_1j54j54le6ndpoc.R.inc(24855); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24856);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24857);test.setSecondOfDay(13); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24858);assertEquals("2002-06-09T00:13:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1j54j54le6ndpoc.R.flushNeeded();}}
public void testSetTime_RI_same500() {__CLR4_4_1j54j54le6ndpoc.R.globalSliceStart(getClass().getName(),24859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t2h79sj6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j54j54le6ndpoc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j54j54le6ndpoc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_RI_same500",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t2h79sj6j(){try{__CLR4_4_1j54j54le6ndpoc.R.inc(24859); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24860);MutableDateTime setter = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24861);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24862);test.setTime(setter); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24863);assertEquals(2010, test.getYear()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24864);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24865);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24866);assertEquals(2, test.getHourOfDay()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24867);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24868);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24869);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1j54j54le6ndpoc.R.flushNeeded();}}
public void testSetTime_RI1501() {__CLR4_4_1j54j54le6ndpoc.R.globalSliceStart(getClass().getName(),24870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r627b9j6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j54j54le6ndpoc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j54j54le6ndpoc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_RI1501",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r627b9j6u(){try{__CLR4_4_1j54j54le6ndpoc.R.inc(24870); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24871);MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24872);test.setTime(new Instant(TEST_TIME2)); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24873);assertEquals(TEST_TIME2, test.getMillis()); 
     __CLR4_4_1j54j54le6ndpoc.R.inc(24874);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1j54j54le6ndpoc.R.flushNeeded();}}
    

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
