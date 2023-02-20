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
 * This class is a Junit unit test for Seconds.
 *
 * @author Stephen Colebourne
 */
public class TestSeconds extends TestCase {static class __CLR4_4_1o6eo6ele6rjd3l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,31446,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31334);
        __CLR4_4_1o6eo6ele6rjd3l.R.inc(31335);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31336);
        __CLR4_4_1o6eo6ele6rjd3l.R.inc(31337);return new TestSuite(TestSeconds.class);
    }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}}

    public TestSeconds(String name) {
        super(name);__CLR4_4_1o6eo6ele6rjd3l.R.inc(31339);try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31338);
    }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31340);
    }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31341);
    }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_secondsBetween_RInstant518() {__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceStart(getClass().getName(),31342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jqtn1ho6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o6eo6ele6rjd3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RInstant518",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jqtn1ho6m(){try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31342); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31343);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31344);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31345);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31346);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31347);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31348);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31349);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31350);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}} 


public void testFactory_standardSecondsIn_RPeriod519() {__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceStart(getClass().getName(),31351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111vc40o6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o6eo6ele6rjd3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_standardSecondsIn_RPeriod519",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111vc40o6v(){try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31351); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31352);assertEquals(0, Seconds.standardSecondsIn((ReadablePeriod) null).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31353);assertEquals(0, Seconds.standardSecondsIn(Period.ZERO).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31354);assertEquals(1, Seconds.standardSecondsIn(new Period(0, 0, 0, 0, 0, 0, 1, 0)).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31355);assertEquals(123, Seconds.standardSecondsIn(Period.seconds(123)).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31356);assertEquals(-987, Seconds.standardSecondsIn(Period.seconds(-987)).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31357);assertEquals(2 * 24 * 60 * 60, Seconds.standardSecondsIn(Period.days(2)).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31358);try { 
         __CLR4_4_1o6eo6ele6rjd3l.R.inc(31359);Seconds.standardSecondsIn(Period.months(1)); 
         __CLR4_4_1o6eo6ele6rjd3l.R.inc(31360);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}} 


public void testPlus_int520() {__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceStart(getClass().getName(),31361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dzjlb2o75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o6eo6ele6rjd3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_int520",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dzjlb2o75(){try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31361); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31362);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31363);Seconds result = test2.plus(3); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31364);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31365);assertEquals(5, result.getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31366);assertEquals(1, Seconds.ONE.plus(0).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31367);try { 
         __CLR4_4_1o6eo6ele6rjd3l.R.inc(31368);Seconds.MAX_VALUE.plus(1); 
         __CLR4_4_1o6eo6ele6rjd3l.R.inc(31369);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}} 


public void testFactory_seconds_int521() {__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceStart(getClass().getName(),31370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1it8z1vo7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o6eo6ele6rjd3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_seconds_int521",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31370,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1it8z1vo7e(){try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31370); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31371);assertSame(Seconds.ZERO, Seconds.seconds(0)); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31372);assertSame(Seconds.ONE, Seconds.seconds(1)); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31373);assertSame(Seconds.TWO, Seconds.seconds(2)); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31374);assertSame(Seconds.THREE, Seconds.seconds(3)); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31375);assertSame(Seconds.MAX_VALUE, Seconds.seconds(Integer.MAX_VALUE)); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31376);assertSame(Seconds.MIN_VALUE, Seconds.seconds(Integer.MIN_VALUE)); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31377);assertEquals(-1, Seconds.seconds(-1).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31378);assertEquals(4, Seconds.seconds(4).getSeconds()); 
 }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}} 


public void testFactory_secondsBetween_RPartial522() {__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceStart(getClass().getName(),31379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eyfhhao7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o6eo6ele6rjd3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RPartial522",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eyfhhao7n(){try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31379); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31380);LocalTime start = new LocalTime(12, 0, 3); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31381);LocalTime end1 = new LocalTime(12, 0, 6); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31382);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 0, 9); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31383);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31384);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31385);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31386);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31387);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}} 


public void testFactory_secondsIn_RInterval523() {__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceStart(getClass().getName(),31388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tbn4ygo7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o6eo6ele6rjd3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsIn_RInterval523",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tbn4ygo7w(){try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31388); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31389);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31390);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31391);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31392);assertEquals(0, Seconds.secondsIn((ReadableInterval) null).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31393);assertEquals(3, Seconds.secondsIn(new Interval(start, end1)).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31394);assertEquals(0, Seconds.secondsIn(new Interval(start, start)).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31395);assertEquals(0, Seconds.secondsIn(new Interval(end1, end1)).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31396);assertEquals(6, Seconds.secondsIn(new Interval(start, end2)).getSeconds()); 
 }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}} 


public void testFactory_parseSeconds_String524() {__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceStart(getClass().getName(),31397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bvej7jo85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o6eo6ele6rjd3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_parseSeconds_String524",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bvej7jo85(){try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31397); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31398);assertEquals(0, Seconds.parseSeconds((String) null).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31399);assertEquals(0, Seconds.parseSeconds("PT0S").getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31400);assertEquals(1, Seconds.parseSeconds("PT1S").getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31401);assertEquals(-3, Seconds.parseSeconds("PT-3S").getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31402);assertEquals(2, Seconds.parseSeconds("P0Y0M0DT2S").getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31403);assertEquals(2, Seconds.parseSeconds("PT0H2S").getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31404);try { 
         __CLR4_4_1o6eo6ele6rjd3l.R.inc(31405);Seconds.parseSeconds("P1Y1D"); 
         __CLR4_4_1o6eo6ele6rjd3l.R.inc(31406);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31407);try { 
         __CLR4_4_1o6eo6ele6rjd3l.R.inc(31408);Seconds.parseSeconds("P1DT1S"); 
         __CLR4_4_1o6eo6ele6rjd3l.R.inc(31409);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}} 


public void testAddToLocalDate525() {__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceStart(getClass().getName(),31410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nvqfg0o8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o6eo6ele6rjd3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testAddToLocalDate525",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nvqfg0o8i(){try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31410); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31411);Seconds test = Seconds.seconds(26); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31412);LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31413);LocalDateTime expected = new LocalDateTime(2006, 6, 1, 0, 0, 26, 0); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31414);assertEquals(expected, date.plus(test)); 
 }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}} 


public void testToStandardWeeks527() {__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceStart(getClass().getName(),31415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5smoko8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o6eo6ele6rjd3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardWeeks527",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5smoko8n(){try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31415); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31416);Seconds test = Seconds.seconds(60 * 60 * 24 * 7 * 2); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31417);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31418);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}} 


public void testMinus_int528() {__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceStart(getClass().getName(),31419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wo5158o8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o6eo6ele6rjd3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_int528",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wo5158o8r(){try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31419); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31420);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31421);Seconds result = test2.minus(3); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31422);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31423);assertEquals(-1, result.getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31424);assertEquals(1, Seconds.ONE.minus(0).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31425);try { 
         __CLR4_4_1o6eo6ele6rjd3l.R.inc(31426);Seconds.MIN_VALUE.minus(1); 
         __CLR4_4_1o6eo6ele6rjd3l.R.inc(31427);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}} 


public void testMinus_Seconds529() {__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceStart(getClass().getName(),31428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1dko5o90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o6eo6ele6rjd3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_Seconds529",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1dko5o90(){try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31428); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31429);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31430);Seconds test3 = Seconds.seconds(3); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31431);Seconds result = test2.minus(test3); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31432);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31433);assertEquals(3, test3.getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31434);assertEquals(-1, result.getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31435);assertEquals(1, Seconds.ONE.minus(Seconds.ZERO).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31436);assertEquals(1, Seconds.ONE.minus((Seconds) null).getSeconds()); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31437);try { 
         __CLR4_4_1o6eo6ele6rjd3l.R.inc(31438);Seconds.MIN_VALUE.minus(Seconds.ONE); 
         __CLR4_4_1o6eo6ele6rjd3l.R.inc(31439);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}} 


public void testIsLessThan530() {__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceStart(getClass().getName(),31440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ipc1kzo9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o6eo6ele6rjd3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o6eo6ele6rjd3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsLessThan530",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ipc1kzo9c(){try{__CLR4_4_1o6eo6ele6rjd3l.R.inc(31440); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31441);assertEquals(false, Seconds.THREE.isLessThan(Seconds.TWO)); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31442);assertEquals(false, Seconds.THREE.isLessThan(Seconds.THREE)); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31443);assertEquals(true, Seconds.TWO.isLessThan(Seconds.THREE)); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31444);assertEquals(false, Seconds.ONE.isLessThan(null)); 
     __CLR4_4_1o6eo6ele6rjd3l.R.inc(31445);assertEquals(true, Seconds.seconds(-1).isLessThan(null)); 
 }finally{__CLR4_4_1o6eo6ele6rjd3l.R.flushNeeded();}} 

    

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
