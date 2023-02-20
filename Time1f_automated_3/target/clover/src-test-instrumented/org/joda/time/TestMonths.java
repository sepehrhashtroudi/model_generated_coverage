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
 * This class is a Junit unit test for Months.
 *
 * @author Stephen Colebourne
 */
public class TestMonths extends TestCase {static class __CLR4_4_1iuhiuhle6np4i8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,24465,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1iuhiuhle6np4i8.R.inc(24425);
        __CLR4_4_1iuhiuhle6np4i8.R.inc(24426);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iuhiuhle6np4i8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iuhiuhle6np4i8.R.inc(24427);
        __CLR4_4_1iuhiuhle6np4i8.R.inc(24428);return new TestSuite(TestMonths.class);
    }finally{__CLR4_4_1iuhiuhle6np4i8.R.flushNeeded();}}

    public TestMonths(String name) {
        super(name);__CLR4_4_1iuhiuhle6np4i8.R.inc(24430);try{__CLR4_4_1iuhiuhle6np4i8.R.inc(24429);
    }finally{__CLR4_4_1iuhiuhle6np4i8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iuhiuhle6np4i8.R.inc(24431);
    }finally{__CLR4_4_1iuhiuhle6np4i8.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iuhiuhle6np4i8.R.inc(24432);
    }finally{__CLR4_4_1iuhiuhle6np4i8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
@SuppressWarnings("deprecation") 
 public void testFactory_monthsBetween_RPartial_LocalDate116() {__CLR4_4_1iuhiuhle6np4i8.R.globalSliceStart(getClass().getName(),24433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mynmppiup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iuhiuhle6np4i8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iuhiuhle6np4i8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_LocalDate116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mynmppiup(){try{__CLR4_4_1iuhiuhle6np4i8.R.inc(24433); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24434);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24435);LocalDate end1 = new LocalDate(2006, 9, 9); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24436);YearMonthDay end2 = new YearMonthDay(2006, 12, 9); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24437);assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24438);assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24439);assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24440);assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24441);assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 }finally{__CLR4_4_1iuhiuhle6np4i8.R.flushNeeded();}}
public void testFactory_parseMonths_String117() {__CLR4_4_1iuhiuhle6np4i8.R.globalSliceStart(getClass().getName(),24442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwlu37iuy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iuhiuhle6np4i8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iuhiuhle6np4i8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_parseMonths_String117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwlu37iuy(){try{__CLR4_4_1iuhiuhle6np4i8.R.inc(24442); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24443);assertEquals(0, Months.parseMonths((String) null).getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24444);assertEquals(0, Months.parseMonths("P0M").getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24445);assertEquals(1, Months.parseMonths("P1M").getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24446);assertEquals(-3, Months.parseMonths("P-3M").getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24447);assertEquals(2, Months.parseMonths("P0Y2M").getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24448);assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24449);try { 
         __CLR4_4_1iuhiuhle6np4i8.R.inc(24450);Months.parseMonths("P1Y1D"); 
         __CLR4_4_1iuhiuhle6np4i8.R.inc(24451);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24452);try { 
         __CLR4_4_1iuhiuhle6np4i8.R.inc(24453);Months.parseMonths("P1MT1H"); 
         __CLR4_4_1iuhiuhle6np4i8.R.inc(24454);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iuhiuhle6np4i8.R.flushNeeded();}}
public void testMultipliedBy_int118() {__CLR4_4_1iuhiuhle6np4i8.R.globalSliceStart(getClass().getName(),24455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x9gxylivb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iuhiuhle6np4i8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iuhiuhle6np4i8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMultipliedBy_int118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x9gxylivb(){try{__CLR4_4_1iuhiuhle6np4i8.R.inc(24455); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24456);Months test = Months.months(2); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24457);assertEquals(6, test.multipliedBy(3).getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24458);assertEquals(2, test.getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24459);assertEquals(-6, test.multipliedBy(-3).getMonths()); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24460);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24461);Months halfMax = Months.months(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1iuhiuhle6np4i8.R.inc(24462);try { 
         __CLR4_4_1iuhiuhle6np4i8.R.inc(24463);halfMax.multipliedBy(2); 
         __CLR4_4_1iuhiuhle6np4i8.R.inc(24464);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iuhiuhle6np4i8.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-------------------------------------------------------------------------
    

    

    

    //-------------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
