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
 * This class is a Junit unit test for Weeks.
 *
 * @author Stephen Colebourne
 */
public class TestWeeks extends TestCase {static class __CLR4_4_1jvzjvzle6o7a2g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,25813,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1jvzjvzle6o7a2g.R.inc(25775);
        __CLR4_4_1jvzjvzle6o7a2g.R.inc(25776);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jvzjvzle6o7a2g.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jvzjvzle6o7a2g.R.inc(25777);
        __CLR4_4_1jvzjvzle6o7a2g.R.inc(25778);return new TestSuite(TestWeeks.class);
    }finally{__CLR4_4_1jvzjvzle6o7a2g.R.flushNeeded();}}

    public TestWeeks(String name) {
        super(name);__CLR4_4_1jvzjvzle6o7a2g.R.inc(25780);try{__CLR4_4_1jvzjvzle6o7a2g.R.inc(25779);
    }finally{__CLR4_4_1jvzjvzle6o7a2g.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jvzjvzle6o7a2g.R.inc(25781);
    }finally{__CLR4_4_1jvzjvzle6o7a2g.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jvzjvzle6o7a2g.R.inc(25782);
    }finally{__CLR4_4_1jvzjvzle6o7a2g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testMinus_Weeks216() {__CLR4_4_1jvzjvzle6o7a2g.R.globalSliceStart(getClass().getName(),25783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18u8zdsjw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvzjvzle6o7a2g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvzjvzle6o7a2g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_Weeks216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18u8zdsjw7(){try{__CLR4_4_1jvzjvzle6o7a2g.R.inc(25783); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25784);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25785);Weeks test3 = Weeks.weeks(3); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25786);Weeks result = test2.minus(test3); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25787);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25788);assertEquals(3, test3.getWeeks()); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25789);assertEquals(-1, result.getWeeks()); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25790);assertEquals(1, Weeks.ONE.minus(Weeks.ZERO).getWeeks()); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25791);assertEquals(1, Weeks.ONE.minus((Weeks) null).getWeeks()); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25792);try { 
         __CLR4_4_1jvzjvzle6o7a2g.R.inc(25793);Weeks.MIN_VALUE.minus(Weeks.ONE); 
         __CLR4_4_1jvzjvzle6o7a2g.R.inc(25794);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jvzjvzle6o7a2g.R.flushNeeded();}}
public void testDividedBy_int217() {__CLR4_4_1jvzjvzle6o7a2g.R.globalSliceStart(getClass().getName(),25795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1shl3fjjwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvzjvzle6o7a2g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvzjvzle6o7a2g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testDividedBy_int217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1shl3fjjwj(){try{__CLR4_4_1jvzjvzle6o7a2g.R.inc(25795); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25796);Weeks test = Weeks.weeks(12); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25797);assertEquals(6, test.dividedBy(2).getWeeks()); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25798);assertEquals(12, test.getWeeks()); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25799);assertEquals(4, test.dividedBy(3).getWeeks()); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25800);assertEquals(3, test.dividedBy(4).getWeeks()); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25801);assertEquals(2, test.dividedBy(5).getWeeks()); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25802);assertEquals(2, test.dividedBy(6).getWeeks()); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25803);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25804);try { 
         __CLR4_4_1jvzjvzle6o7a2g.R.inc(25805);Weeks.ONE.dividedBy(0); 
         __CLR4_4_1jvzjvzle6o7a2g.R.inc(25806);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jvzjvzle6o7a2g.R.flushNeeded();}}
public void testIsLessThan218() {__CLR4_4_1jvzjvzle6o7a2g.R.globalSliceStart(getClass().getName(),25807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18btyl2jwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvzjvzle6o7a2g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvzjvzle6o7a2g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsLessThan218",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18btyl2jwv(){try{__CLR4_4_1jvzjvzle6o7a2g.R.inc(25807); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25808);assertEquals(false, Weeks.THREE.isLessThan(Weeks.TWO)); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25809);assertEquals(false, Weeks.THREE.isLessThan(Weeks.THREE)); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25810);assertEquals(true, Weeks.TWO.isLessThan(Weeks.THREE)); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25811);assertEquals(false, Weeks.ONE.isLessThan(null)); 
     __CLR4_4_1jvzjvzle6o7a2g.R.inc(25812);assertEquals(true, Weeks.weeks(-1).isLessThan(null)); 
 }finally{__CLR4_4_1jvzjvzle6o7a2g.R.flushNeeded();}}
    

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
