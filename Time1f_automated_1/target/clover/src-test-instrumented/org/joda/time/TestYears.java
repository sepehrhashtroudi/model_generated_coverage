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
 * This class is a Junit unit test for Years.
 *
 * @author Stephen Colebourne
 */
public class TestYears extends TestCase {static class __CLR4_4_1kgckgcle6ndpvk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,26561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1kgckgcle6ndpvk.R.inc(26508);
        __CLR4_4_1kgckgcle6ndpvk.R.inc(26509);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kgckgcle6ndpvk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kgckgcle6ndpvk.R.inc(26510);
        __CLR4_4_1kgckgcle6ndpvk.R.inc(26511);return new TestSuite(TestYears.class);
    }finally{__CLR4_4_1kgckgcle6ndpvk.R.flushNeeded();}}

    public TestYears(String name) {
        super(name);__CLR4_4_1kgckgcle6ndpvk.R.inc(26513);try{__CLR4_4_1kgckgcle6ndpvk.R.inc(26512);
    }finally{__CLR4_4_1kgckgcle6ndpvk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kgckgcle6ndpvk.R.inc(26514);
    }finally{__CLR4_4_1kgckgcle6ndpvk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kgckgcle6ndpvk.R.inc(26515);
    }finally{__CLR4_4_1kgckgcle6ndpvk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_parseYears_String281() {__CLR4_4_1kgckgcle6ndpvk.R.globalSliceStart(getClass().getName(),26516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5uar0kgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgckgcle6ndpvk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgckgcle6ndpvk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_parseYears_String281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5uar0kgk(){try{__CLR4_4_1kgckgcle6ndpvk.R.inc(26516); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26517);assertEquals(0, Years.parseYears((String) null).getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26518);assertEquals(0, Years.parseYears("P0M").getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26519);assertEquals(1, Years.parseYears("P1M").getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26520);assertEquals(-3, Years.parseYears("P-3M").getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26521);assertEquals(2, Years.parseYears("P0Y2M").getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26522);assertEquals(2, Years.parseYears("P2MT0H0M").getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26523);try { 
         __CLR4_4_1kgckgcle6ndpvk.R.inc(26524);Years.parseYears("P1Y1D"); 
         __CLR4_4_1kgckgcle6ndpvk.R.inc(26525);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26526);try { 
         __CLR4_4_1kgckgcle6ndpvk.R.inc(26527);Years.parseYears("P1MT1H"); 
         __CLR4_4_1kgckgcle6ndpvk.R.inc(26528);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kgckgcle6ndpvk.R.flushNeeded();}}
public void testFactory_yearsBetween_RInstant282() {__CLR4_4_1kgckgcle6ndpvk.R.globalSliceStart(getClass().getName(),26529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ae59b2kgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgckgcle6ndpvk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgckgcle6ndpvk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RInstant282",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ae59b2kgx(){try{__CLR4_4_1kgckgcle6ndpvk.R.inc(26529); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26530);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26531);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26532);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26533);assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26534);assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26535);assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26536);assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26537);assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 }finally{__CLR4_4_1kgckgcle6ndpvk.R.flushNeeded();}}
public void testFactory_parseYears_String283() {__CLR4_4_1kgckgcle6ndpvk.R.globalSliceStart(getClass().getName(),26538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnu8bykh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgckgcle6ndpvk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgckgcle6ndpvk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_parseYears_String283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnu8bykh6(){try{__CLR4_4_1kgckgcle6ndpvk.R.inc(26538); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26539);assertEquals(0, Years.parseYears((String) null).getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26540);assertEquals(0, Years.parseYears("P0Y0M").getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26541);assertEquals(1, Years.parseYears("P1Y1M").getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26542);assertEquals(-3, Years.parseYears("P-3M").getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26543);assertEquals(2, Years.parseYears("P0Y2M").getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26544);assertEquals(2, Years.parseYears("P2MT0H0M").getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26545);try { 
         __CLR4_4_1kgckgcle6ndpvk.R.inc(26546);Years.parseYears("P1Y1D"); 
         __CLR4_4_1kgckgcle6ndpvk.R.inc(26547);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26548);try { 
         __CLR4_4_1kgckgcle6ndpvk.R.inc(26549);Years.parseYears("P1MT1H"); 
         __CLR4_4_1kgckgcle6ndpvk.R.inc(26550);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kgckgcle6ndpvk.R.flushNeeded();}}
public void testMultipliedBy_int284() {__CLR4_4_1kgckgcle6ndpvk.R.globalSliceStart(getClass().getName(),26551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hkgpuxkhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kgckgcle6ndpvk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kgckgcle6ndpvk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMultipliedBy_int284",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hkgpuxkhj(){try{__CLR4_4_1kgckgcle6ndpvk.R.inc(26551); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26552);Years test = Years.years(2); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26553);assertEquals(6, test.multipliedBy(3).getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26554);assertEquals(2, test.getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26555);assertEquals(-6, test.multipliedBy(-3).getYears()); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26556);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26557);Years halfMax = Years.years(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1kgckgcle6ndpvk.R.inc(26558);try { 
         __CLR4_4_1kgckgcle6ndpvk.R.inc(26559);halfMax.multipliedBy(2); 
         __CLR4_4_1kgckgcle6ndpvk.R.inc(26560);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1kgckgcle6ndpvk.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
