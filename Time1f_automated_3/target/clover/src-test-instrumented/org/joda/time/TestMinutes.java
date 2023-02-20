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
 * This class is a Junit unit test for Minutes.
 *
 * @author Stephen Colebourne
 */
public class TestMinutes extends TestCase {static class __CLR4_4_1ip1ip1le6np4ho{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,24283,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1ip1ip1le6np4ho.R.inc(24229);
        __CLR4_4_1ip1ip1le6np4ho.R.inc(24230);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ip1ip1le6np4ho.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ip1ip1le6np4ho.R.inc(24231);
        __CLR4_4_1ip1ip1le6np4ho.R.inc(24232);return new TestSuite(TestMinutes.class);
    }finally{__CLR4_4_1ip1ip1le6np4ho.R.flushNeeded();}}

    public TestMinutes(String name) {
        super(name);__CLR4_4_1ip1ip1le6np4ho.R.inc(24234);try{__CLR4_4_1ip1ip1le6np4ho.R.inc(24233);
    }finally{__CLR4_4_1ip1ip1le6np4ho.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ip1ip1le6np4ho.R.inc(24235);
    }finally{__CLR4_4_1ip1ip1le6np4ho.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ip1ip1le6np4ho.R.inc(24236);
    }finally{__CLR4_4_1ip1ip1le6np4ho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_parseMinutes_String377() {__CLR4_4_1ip1ip1le6np4ho.R.globalSliceStart(getClass().getName(),24237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhjfwdip9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6np4ho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6np4ho.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_parseMinutes_String377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhjfwdip9(){try{__CLR4_4_1ip1ip1le6np4ho.R.inc(24237); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24238);assertEquals(0, Minutes.parseMinutes((String) null).getMinutes()); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24239);assertEquals(0, Minutes.parseMinutes("PT0M").getMinutes()); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24240);assertEquals(1, Minutes.parseMinutes("PT1M").getMinutes()); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24241);assertEquals(-3, Minutes.parseMinutes("PT-3M").getMinutes()); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24242);assertEquals(2, Minutes.parseMinutes("P0Y0M0DT2M").getMinutes()); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24243);assertEquals(2, Minutes.parseMinutes("PT0H2M").getMinutes()); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24244);try { 
         __CLR4_4_1ip1ip1le6np4ho.R.inc(24245);Minutes.parseMinutes("P1Y1D"); 
         __CLR4_4_1ip1ip1le6np4ho.R.inc(24246);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24247);try { 
         __CLR4_4_1ip1ip1le6np4ho.R.inc(24248);Minutes.parseMinutes("P1DT1M"); 
         __CLR4_4_1ip1ip1le6np4ho.R.inc(24249);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ip1ip1le6np4ho.R.flushNeeded();}}
public void testToStandardMinutes378() {__CLR4_4_1ip1ip1le6np4ho.R.globalSliceStart(getClass().getName(),24250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gyuqfuipm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6np4ho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6np4ho.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardMinutes378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gyuqfuipm(){try{__CLR4_4_1ip1ip1le6np4ho.R.inc(24250); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24251);Seconds test = Seconds.seconds(60 * 2); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24252);Minutes expected = Minutes.minutes(2); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24253);assertEquals(expected, test.toStandardMinutes()); 
 }finally{__CLR4_4_1ip1ip1le6np4ho.R.flushNeeded();}}
public void testFactory_minutesBetween_RInstant379() {__CLR4_4_1ip1ip1le6np4ho.R.globalSliceStart(getClass().getName(),24254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iatfoeipq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6np4ho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6np4ho.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RInstant379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iatfoeipq(){try{__CLR4_4_1ip1ip1le6np4ho.R.inc(24254); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24255);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24256);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24257);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24258);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24259);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24260);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24261);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24262);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1ip1ip1le6np4ho.R.flushNeeded();}}
public void testToStandardSeconds380() {__CLR4_4_1ip1ip1le6np4ho.R.globalSliceStart(getClass().getName(),24263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dsu66bipz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6np4ho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6np4ho.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardSeconds380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dsu66bipz(){try{__CLR4_4_1ip1ip1le6np4ho.R.inc(24263); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24264);Minutes test = Minutes.minutes(2); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24265);Seconds expected = Seconds.seconds(2 * 60 * 60); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24266);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24267);try { 
         __CLR4_4_1ip1ip1le6np4ho.R.inc(24268);Minutes.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1ip1ip1le6np4ho.R.inc(24269);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ip1ip1le6np4ho.R.flushNeeded();}}
public void testToStandardSeconds381() {__CLR4_4_1ip1ip1le6np4ho.R.globalSliceStart(getClass().getName(),24270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aju7duiq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6np4ho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6np4ho.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardSeconds381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aju7duiq6(){try{__CLR4_4_1ip1ip1le6np4ho.R.inc(24270); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24271);Minutes test = Minutes.minutes(2); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24272);Seconds expected = Seconds.seconds(2 * 60); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24273);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24274);try { 
         __CLR4_4_1ip1ip1le6np4ho.R.inc(24275);Minutes.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1ip1ip1le6np4ho.R.inc(24276);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ip1ip1le6np4ho.R.flushNeeded();}}
public void testIsLessThan382() {__CLR4_4_1ip1ip1le6np4ho.R.globalSliceStart(getClass().getName(),24277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z10abmiqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6np4ho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6np4ho.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsLessThan382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z10abmiqd(){try{__CLR4_4_1ip1ip1le6np4ho.R.inc(24277); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24278);assertEquals(false, Minutes.THREE.isLessThan(Minutes.TWO)); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24279);assertEquals(false, Minutes.THREE.isLessThan(Minutes.THREE)); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24280);assertEquals(true, Minutes.TWO.isLessThan(Minutes.THREE)); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24281);assertEquals(false, Minutes.ONE.isLessThan(null)); 
     __CLR4_4_1ip1ip1le6np4ho.R.inc(24282);assertEquals(true, Minutes.minutes(-1).isLessThan(null)); 
 }finally{__CLR4_4_1ip1ip1le6np4ho.R.flushNeeded();}}
    

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
