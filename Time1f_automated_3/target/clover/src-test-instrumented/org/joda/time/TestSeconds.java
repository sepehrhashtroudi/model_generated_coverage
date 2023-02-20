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
public class TestSeconds extends TestCase {static class __CLR4_4_1jo1jo1le6np4lx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,25519,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1jo1jo1le6np4lx.R.inc(25489);
        __CLR4_4_1jo1jo1le6np4lx.R.inc(25490);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jo1jo1le6np4lx.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jo1jo1le6np4lx.R.inc(25491);
        __CLR4_4_1jo1jo1le6np4lx.R.inc(25492);return new TestSuite(TestSeconds.class);
    }finally{__CLR4_4_1jo1jo1le6np4lx.R.flushNeeded();}}

    public TestSeconds(String name) {
        super(name);__CLR4_4_1jo1jo1le6np4lx.R.inc(25494);try{__CLR4_4_1jo1jo1le6np4lx.R.inc(25493);
    }finally{__CLR4_4_1jo1jo1le6np4lx.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jo1jo1le6np4lx.R.inc(25495);
    }finally{__CLR4_4_1jo1jo1le6np4lx.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jo1jo1le6np4lx.R.inc(25496);
    }finally{__CLR4_4_1jo1jo1le6np4lx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_secondsBetween_RPartial197() {__CLR4_4_1jo1jo1le6np4lx.R.globalSliceStart(getClass().getName(),25497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yoi8rcjo9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo1jo1le6np4lx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo1jo1le6np4lx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RPartial197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yoi8rcjo9(){try{__CLR4_4_1jo1jo1le6np4lx.R.inc(25497); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25498);LocalTime start = new LocalTime(12, 3); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25499);LocalTime end1 = new LocalTime(12, 6); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25500);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 9); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25501);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25502);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25503);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25504);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25505);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 }finally{__CLR4_4_1jo1jo1le6np4lx.R.flushNeeded();}}
public void testFactory_parseSeconds_String198() {__CLR4_4_1jo1jo1le6np4lx.R.globalSliceStart(getClass().getName(),25506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14lo9a2joi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo1jo1le6np4lx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo1jo1le6np4lx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_parseSeconds_String198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14lo9a2joi(){try{__CLR4_4_1jo1jo1le6np4lx.R.inc(25506); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25507);assertEquals(0, Seconds.parseSeconds((String) null).getSeconds()); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25508);assertEquals(0, Seconds.parseSeconds("PT0H").getSeconds()); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25509);assertEquals(1, Seconds.parseSeconds("PT1H").getSeconds()); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25510);assertEquals(-3, Seconds.parseSeconds("PT-3H").getSeconds()); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25511);assertEquals(2, Seconds.parseSeconds("P0Y0M0DT2H").getSeconds()); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25512);assertEquals(2, Seconds.parseSeconds("PT0H2M").getSeconds()); 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25513);try { 
         __CLR4_4_1jo1jo1le6np4lx.R.inc(25514);Seconds.parseSeconds("P1Y1D"); 
         __CLR4_4_1jo1jo1le6np4lx.R.inc(25515);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jo1jo1le6np4lx.R.inc(25516);try { 
         __CLR4_4_1jo1jo1le6np4lx.R.inc(25517);Seconds.parseSeconds("P1DT1H"); 
         __CLR4_4_1jo1jo1le6np4lx.R.inc(25518);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jo1jo1le6np4lx.R.flushNeeded();}}
    

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
