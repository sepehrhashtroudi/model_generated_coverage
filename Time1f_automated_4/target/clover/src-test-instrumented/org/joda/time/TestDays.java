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
public class TestDays extends TestCase {static class __CLR4_4_1hhdhhdle6o79oh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,22695,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1hhdhhdle6o79oh.R.inc(22657);
        __CLR4_4_1hhdhhdle6o79oh.R.inc(22658);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hhdhhdle6o79oh.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hhdhhdle6o79oh.R.inc(22659);
        __CLR4_4_1hhdhhdle6o79oh.R.inc(22660);return new TestSuite(TestDays.class);
    }finally{__CLR4_4_1hhdhhdle6o79oh.R.flushNeeded();}}

    public TestDays(String name) {
        super(name);__CLR4_4_1hhdhhdle6o79oh.R.inc(22662);try{__CLR4_4_1hhdhhdle6o79oh.R.inc(22661);
    }finally{__CLR4_4_1hhdhhdle6o79oh.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hhdhhdle6o79oh.R.inc(22663);
    }finally{__CLR4_4_1hhdhhdle6o79oh.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hhdhhdle6o79oh.R.inc(22664);
    }finally{__CLR4_4_1hhdhhdle6o79oh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_daysIn_RInterval508() {__CLR4_4_1hhdhhdle6o79oh.R.globalSliceStart(getClass().getName(),22665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2kmyxhhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hhdhhdle6o79oh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hhdhhdle6o79oh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysIn_RInterval508",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2kmyxhhl(){try{__CLR4_4_1hhdhhdle6o79oh.R.inc(22665); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22666);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22667);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22668);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22669);assertEquals(0, Days.daysIn((ReadableInterval) null).getDays()); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22670);assertEquals(3, Days.daysIn(new Interval(start, end1)).getDays()); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22671);assertEquals(0, Days.daysIn(new Interval(start, start)).getDays()); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22672);assertEquals(0, Days.daysIn(new Interval(end1, end1)).getDays()); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22673);assertEquals(6, Days.daysIn(new Interval(start, end2)).getDays()); 
 }finally{__CLR4_4_1hhdhhdle6o79oh.R.flushNeeded();}}
public void testMinus_int509() {__CLR4_4_1hhdhhdle6o79oh.R.globalSliceStart(getClass().getName(),22674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1htqtgphhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hhdhhdle6o79oh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hhdhhdle6o79oh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMinus_int509",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1htqtgphhu(){try{__CLR4_4_1hhdhhdle6o79oh.R.inc(22674); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22675);Days test2 = Days.days(2); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22676);Days result = test2.minus(3); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22677);assertEquals(2, test2.getDays()); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22678);assertEquals(-1, result.getDays()); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22679);assertEquals(1, Days.ONE.minus(0).getDays()); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22680);try { 
         __CLR4_4_1hhdhhdle6o79oh.R.inc(22681);Days.MIN_VALUE.minus(1); 
         __CLR4_4_1hhdhhdle6o79oh.R.inc(22682);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hhdhhdle6o79oh.R.flushNeeded();}}
public void testMinus_Days510() {__CLR4_4_1hhdhhdle6o79oh.R.globalSliceStart(getClass().getName(),22683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft3lc3hi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hhdhhdle6o79oh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hhdhhdle6o79oh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMinus_Days510",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft3lc3hi3(){try{__CLR4_4_1hhdhhdle6o79oh.R.inc(22683); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22684);Days test2 = Days.days(2); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22685);Days test3 = Days.days(3); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22686);Days result = test2.minus(test3); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22687);assertEquals(2, test2.getDays()); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22688);assertEquals(3, test3.getDays()); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22689);assertEquals(-1, result.getDays()); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22690);assertEquals(1, Days.ONE.minus(Days.ZERO).getDays()); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22691);assertEquals(1, Days.ONE.minus((Days) null).getDays()); 
     __CLR4_4_1hhdhhdle6o79oh.R.inc(22692);try { 
         __CLR4_4_1hhdhhdle6o79oh.R.inc(22693);Days.MIN_VALUE.minus(Days.ONE); 
         __CLR4_4_1hhdhhdle6o79oh.R.inc(22694);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hhdhhdle6o79oh.R.flushNeeded();}}
    

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
