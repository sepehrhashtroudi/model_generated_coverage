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
public class TestSeconds extends TestCase {static class __CLR4_4_1jx0jx0le6ndpsv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,25882,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1jx0jx0le6ndpsv.R.inc(25812);
        __CLR4_4_1jx0jx0le6ndpsv.R.inc(25813);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jx0jx0le6ndpsv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jx0jx0le6ndpsv.R.inc(25814);
        __CLR4_4_1jx0jx0le6ndpsv.R.inc(25815);return new TestSuite(TestSeconds.class);
    }finally{__CLR4_4_1jx0jx0le6ndpsv.R.flushNeeded();}}

    public TestSeconds(String name) {
        super(name);__CLR4_4_1jx0jx0le6ndpsv.R.inc(25817);try{__CLR4_4_1jx0jx0le6ndpsv.R.inc(25816);
    }finally{__CLR4_4_1jx0jx0le6ndpsv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jx0jx0le6ndpsv.R.inc(25818);
    }finally{__CLR4_4_1jx0jx0le6ndpsv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jx0jx0le6ndpsv.R.inc(25819);
    }finally{__CLR4_4_1jx0jx0le6ndpsv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToStandardMinutes201() {__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceStart(getClass().getName(),25820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1winyzfjx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx0jx0le6ndpsv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardMinutes201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1winyzfjx8(){try{__CLR4_4_1jx0jx0le6ndpsv.R.inc(25820); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25821);Seconds test = Seconds.seconds(60 * 2); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25822);Minutes expected = Minutes.minutes(2); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25823);assertEquals(expected, test.toStandardMinutes()); 
 }finally{__CLR4_4_1jx0jx0le6ndpsv.R.flushNeeded();}}
public void testPlus_int202() {__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceStart(getClass().getName(),25824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wjm7ltjxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx0jx0le6ndpsv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_int202",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wjm7ltjxc(){try{__CLR4_4_1jx0jx0le6ndpsv.R.inc(25824); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25825);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25826);Seconds result = test2.plus(3); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25827);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25828);assertEquals(5, result.getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25829);assertEquals(1, Seconds.ONE.plus(0).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25830);try { 
         __CLR4_4_1jx0jx0le6ndpsv.R.inc(25831);Seconds.MAX_VALUE.plus(1); 
         __CLR4_4_1jx0jx0le6ndpsv.R.inc(25832);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jx0jx0le6ndpsv.R.flushNeeded();}}
public void testFactory_seconds_int203() {__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceStart(getClass().getName(),25833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rpwtv0jxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx0jx0le6ndpsv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_seconds_int203",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rpwtv0jxl(){try{__CLR4_4_1jx0jx0le6ndpsv.R.inc(25833); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25834);assertSame(Seconds.ZERO, Seconds.seconds(0)); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25835);assertSame(Seconds.ONE, Seconds.seconds(1)); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25836);assertSame(Seconds.TWO, Seconds.seconds(2)); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25837);assertSame(Seconds.THREE, Seconds.seconds(3)); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25838);assertSame(Seconds.MAX_VALUE, Seconds.seconds(Integer.MAX_VALUE)); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25839);assertSame(Seconds.MIN_VALUE, Seconds.seconds(Integer.MIN_VALUE)); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25840);assertEquals(-1, Seconds.seconds(-1).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25841);assertEquals(4, Seconds.seconds(4).getSeconds()); 
 }finally{__CLR4_4_1jx0jx0le6ndpsv.R.flushNeeded();}}
public void testFactory_secondsBetween_RInstant204() {__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceStart(getClass().getName(),25842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkh22pjxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx0jx0le6ndpsv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RInstant204",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkh22pjxu(){try{__CLR4_4_1jx0jx0le6ndpsv.R.inc(25842); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25843);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25844);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25845);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25846);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25847);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25848);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25849);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25850);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 }finally{__CLR4_4_1jx0jx0le6ndpsv.R.flushNeeded();}}
public void testFactory_secondsIn_RInterval205() {__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceStart(getClass().getName(),25851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14tovw7jy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx0jx0le6ndpsv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsIn_RInterval205",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14tovw7jy3(){try{__CLR4_4_1jx0jx0le6ndpsv.R.inc(25851); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25852);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25853);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25854);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25855);assertEquals(0, Seconds.secondsIn((ReadableInterval) null).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25856);assertEquals(3, Seconds.secondsIn(new Interval(start, end1)).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25857);assertEquals(0, Seconds.secondsIn(new Interval(start, start)).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25858);assertEquals(0, Seconds.secondsIn(new Interval(end1, end1)).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25859);assertEquals(6, Seconds.secondsIn(new Interval(start, end2)).getSeconds()); 
 }finally{__CLR4_4_1jx0jx0le6ndpsv.R.flushNeeded();}}
public void testFactory_standardSecondsIn_RPeriod206() {__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceStart(getClass().getName(),25860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y462fpjyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx0jx0le6ndpsv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_standardSecondsIn_RPeriod206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y462fpjyc(){try{__CLR4_4_1jx0jx0le6ndpsv.R.inc(25860); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25861);assertEquals(0, Seconds.standardSecondsIn((ReadablePeriod) null).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25862);assertEquals(0, Seconds.standardSecondsIn(Period.ZERO).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25863);assertEquals(1, Seconds.standardSecondsIn(new Period(0, 0, 0, 0, 0, 1, 0, 0)).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25864);assertEquals(123, Seconds.standardSecondsIn(Period.seconds(123)).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25865);assertEquals(-987, Seconds.standardSecondsIn(Period.seconds(-987)).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25866);assertEquals(1, Seconds.standardSecondsIn(Period.seconds(120)).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25867);assertEquals(2, Seconds.standardSecondsIn(Period.seconds(121)).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25868);assertEquals(2, Seconds.standardSecondsIn(Period.seconds(121)).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25869);assertEquals(120, Seconds.standardSecondsIn(Period.hours(2)).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25870);try { 
         __CLR4_4_1jx0jx0le6ndpsv.R.inc(25871);Seconds.standardSecondsIn(Period.months(1)); 
         __CLR4_4_1jx0jx0le6ndpsv.R.inc(25872);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jx0jx0le6ndpsv.R.flushNeeded();}}
public void testMinus_int208() {__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceStart(getClass().getName(),25873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eo6pnxjyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jx0jx0le6ndpsv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jx0jx0le6ndpsv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_int208",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eo6pnxjyp(){try{__CLR4_4_1jx0jx0le6ndpsv.R.inc(25873); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25874);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25875);Seconds result = test2.minus(3); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25876);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25877);assertEquals(-1, result.getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25878);assertEquals(1, Seconds.ONE.minus(0).getSeconds()); 
     __CLR4_4_1jx0jx0le6ndpsv.R.inc(25879);try { 
         __CLR4_4_1jx0jx0le6ndpsv.R.inc(25880);Seconds.MIN_VALUE.minus(1); 
         __CLR4_4_1jx0jx0le6ndpsv.R.inc(25881);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jx0jx0le6ndpsv.R.flushNeeded();}}
    

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
