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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for Days.
 *
 * @author Stephen Colebourne
 */
public class TestDays extends TestCase {static class __CLR4_4_1hkxhkxle6np4di{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,22842,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1hkxhkxle6np4di.R.inc(22785);
        __CLR4_4_1hkxhkxle6np4di.R.inc(22786);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hkxhkxle6np4di.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hkxhkxle6np4di.R.inc(22787);
        __CLR4_4_1hkxhkxle6np4di.R.inc(22788);return new TestSuite(TestDays.class);
    }finally{__CLR4_4_1hkxhkxle6np4di.R.flushNeeded();}}

    public TestDays(String name) {
        super(name);__CLR4_4_1hkxhkxle6np4di.R.inc(22790);try{__CLR4_4_1hkxhkxle6np4di.R.inc(22789);
    }finally{__CLR4_4_1hkxhkxle6np4di.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hkxhkxle6np4di.R.inc(22791);
    }finally{__CLR4_4_1hkxhkxle6np4di.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hkxhkxle6np4di.R.inc(22792);
    }finally{__CLR4_4_1hkxhkxle6np4di.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_standardDaysIn_RPeriod531() {__CLR4_4_1hkxhkxle6np4di.R.globalSliceStart(getClass().getName(),22793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox6omyhl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkxhkxle6np4di.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkxhkxle6np4di.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_standardDaysIn_RPeriod531",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox6omyhl5(){try{__CLR4_4_1hkxhkxle6np4di.R.inc(22793); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22794);assertEquals(0, Days.standardDaysIn((ReadablePeriod) null).getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22795);assertEquals(0, Days.standardDaysIn(Period.ZERO).getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22796);assertEquals(1, Days.standardDaysIn(new Period(0, 0, 0, 0, 1, 0, 0, 0)).getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22797);assertEquals(123, Days.standardDaysIn(Period.days(123)).getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22798);assertEquals(-987, Days.standardDaysIn(Period.days(-987)).getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22799);assertEquals(1, Days.standardDaysIn(Period.seconds(119)).getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22800);assertEquals(2, Days.standardDaysIn(Period.seconds(120)).getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22801);assertEquals(2, Days.standardDaysIn(Period.seconds(121)).getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22802);assertEquals(120, Days.standardDaysIn(Period.hours(2)).getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22803);try { 
         __CLR4_4_1hkxhkxle6np4di.R.inc(22804);Days.standardDaysIn(Period.months(1)); 
         __CLR4_4_1hkxhkxle6np4di.R.inc(22805);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hkxhkxle6np4di.R.flushNeeded();}}
public void testFactory_parseDays_String532() {__CLR4_4_1hkxhkxle6np4di.R.globalSliceStart(getClass().getName(),22806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ifylqhli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkxhkxle6np4di.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkxhkxle6np4di.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_parseDays_String532",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ifylqhli(){try{__CLR4_4_1hkxhkxle6np4di.R.inc(22806); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22807);assertEquals(0, Days.parseDays((String) null).getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22808);assertEquals(0, Days.parseDays("PT0D").getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22809);assertEquals(1, Days.parseDays("PT1D").getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22810);assertEquals(-3, Days.parseDays("PT-3D").getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22811);assertEquals(2, Days.parseDays("P0Y0M0DT2M").getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22812);assertEquals(2, Days.parseDays("PT0H2M").getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22813);try { 
         __CLR4_4_1hkxhkxle6np4di.R.inc(22814);Days.parseDays("P1Y1D"); 
         __CLR4_4_1hkxhkxle6np4di.R.inc(22815);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22816);try { 
         __CLR4_4_1hkxhkxle6np4di.R.inc(22817);Days.parseDays("P1DT1M"); 
         __CLR4_4_1hkxhkxle6np4di.R.inc(22818);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hkxhkxle6np4di.R.flushNeeded();}}
public void testToStandardDuration534() {__CLR4_4_1hkxhkxle6np4di.R.globalSliceStart(getClass().getName(),22819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ac2mqnhlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkxhkxle6np4di.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkxhkxle6np4di.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardDuration534",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ac2mqnhlv(){try{__CLR4_4_1hkxhkxle6np4di.R.inc(22819); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22820);Days test = Days.days(20); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22821);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_DAY); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22822);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22823);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_DAY); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22824);assertEquals(expected, Days.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1hkxhkxle6np4di.R.flushNeeded();}}
public void testMultipliedBy_int535() {__CLR4_4_1hkxhkxle6np4di.R.globalSliceStart(getClass().getName(),22825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vu7aqhm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkxhkxle6np4di.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkxhkxle6np4di.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMultipliedBy_int535",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vu7aqhm1(){try{__CLR4_4_1hkxhkxle6np4di.R.inc(22825); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22826);Days test = Days.days(2); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22827);assertEquals(6, test.multipliedBy(3).getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22828);assertEquals(2, test.getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22829);assertEquals(-6, test.multipliedBy(-3).getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22830);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22831);Days halfMax = Days.days(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22832);try { 
         __CLR4_4_1hkxhkxle6np4di.R.inc(22833);halfMax.multipliedBy(2); 
         __CLR4_4_1hkxhkxle6np4di.R.inc(22834);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hkxhkxle6np4di.R.flushNeeded();}}
public void testNegated536() {__CLR4_4_1hkxhkxle6np4di.R.globalSliceStart(getClass().getName(),22835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12zqeq9hmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkxhkxle6np4di.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkxhkxle6np4di.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testNegated536",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12zqeq9hmb(){try{__CLR4_4_1hkxhkxle6np4di.R.inc(22835); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22836);Days test = Days.days(12); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22837);assertEquals(-12, test.negated().getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22838);assertEquals(12, test.getDays()); 
     __CLR4_4_1hkxhkxle6np4di.R.inc(22839);try { 
         __CLR4_4_1hkxhkxle6np4di.R.inc(22840);Days.MIN_VALUE.negated(); 
         __CLR4_4_1hkxhkxle6np4di.R.inc(22841);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hkxhkxle6np4di.R.flushNeeded();}}
    

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
