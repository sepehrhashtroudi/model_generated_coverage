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
public class TestYears extends TestCase {static class __CLR4_4_1k3ak3ale6np4o0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,26102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1k3ak3ale6np4o0.R.inc(26038);
        __CLR4_4_1k3ak3ale6np4o0.R.inc(26039);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k3ak3ale6np4o0.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k3ak3ale6np4o0.R.inc(26040);
        __CLR4_4_1k3ak3ale6np4o0.R.inc(26041);return new TestSuite(TestYears.class);
    }finally{__CLR4_4_1k3ak3ale6np4o0.R.flushNeeded();}}

    public TestYears(String name) {
        super(name);__CLR4_4_1k3ak3ale6np4o0.R.inc(26043);try{__CLR4_4_1k3ak3ale6np4o0.R.inc(26042);
    }finally{__CLR4_4_1k3ak3ale6np4o0.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k3ak3ale6np4o0.R.inc(26044);
    }finally{__CLR4_4_1k3ak3ale6np4o0.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k3ak3ale6np4o0.R.inc(26045);
    }finally{__CLR4_4_1k3ak3ale6np4o0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_yearsIn_RInterval274() {__CLR4_4_1k3ak3ale6np4o0.R.globalSliceStart(getClass().getName(),26046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1df3t4mk3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k3ak3ale6np4o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k3ak3ale6np4o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsIn_RInterval274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1df3t4mk3i(){try{__CLR4_4_1k3ak3ale6np4o0.R.inc(26046); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26047);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, PARIS); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26048);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, PARIS); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26049);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, PARIS); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26050);assertEquals(0, Years.yearsIn((ReadableInterval) null).getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26051);assertEquals(3, Years.yearsIn(new Interval(start, end1)).getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26052);assertEquals(0, Years.yearsIn(new Interval(start, start)).getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26053);assertEquals(0, Years.yearsIn(new Interval(end1, end1)).getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26054);assertEquals(6, Years.yearsIn(new Interval(start, end2)).getYears()); 
 }finally{__CLR4_4_1k3ak3ale6np4o0.R.flushNeeded();}}
public void testSerialization275() throws Exception {__CLR4_4_1k3ak3ale6np4o0.R.globalSliceStart(getClass().getName(),26055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1itqwmfk3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k3ak3ale6np4o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k3ak3ale6np4o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testSerialization275",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1itqwmfk3r() throws Exception{try{__CLR4_4_1k3ak3ale6np4o0.R.inc(26055); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26056);Years test = Years.THREE; 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26057);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26058);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26059);oos.writeObject(test); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26060);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26061);oos.close(); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26062);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26063);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26064);Years result = (Years) ois.readObject(); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26065);ois.close(); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26066);assertSame(test, result); 
 }finally{__CLR4_4_1k3ak3ale6np4o0.R.flushNeeded();}}
public void testFactory_yearsBetween_RInstant276() {__CLR4_4_1k3ak3ale6np4o0.R.globalSliceStart(getClass().getName(),26067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16bps2lk43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k3ak3ale6np4o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k3ak3ale6np4o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RInstant276",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16bps2lk43(){try{__CLR4_4_1k3ak3ale6np4o0.R.inc(26067); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26068);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26069);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26070);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26071);assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26072);assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26073);assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26074);assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26075);assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 }finally{__CLR4_4_1k3ak3ale6np4o0.R.flushNeeded();}}
public void testToString277() {__CLR4_4_1k3ak3ale6np4o0.R.globalSliceStart(getClass().getName(),26076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bx724lk4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k3ak3ale6np4o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k3ak3ale6np4o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testToString277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bx724lk4c(){try{__CLR4_4_1k3ak3ale6np4o0.R.inc(26076); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26077);Years test = Years.years(20); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26078);assertEquals("P20Y", test.toString()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26079);test = Years.years(-20); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26080);assertEquals("P-20Y", test.toString()); 
 }finally{__CLR4_4_1k3ak3ale6np4o0.R.flushNeeded();}}
public void testMinus_int278() {__CLR4_4_1k3ak3ale6np4o0.R.globalSliceStart(getClass().getName(),26081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jqijskk4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k3ak3ale6np4o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k3ak3ale6np4o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_int278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jqijskk4h(){try{__CLR4_4_1k3ak3ale6np4o0.R.inc(26081); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26082);Years test2 = Years.years(2); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26083);Years result = test2.minus(3); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26084);assertEquals(2, test2.getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26085);assertEquals(-1, result.getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26086);assertEquals(1, Years.ONE.minus(0).getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26087);try { 
         __CLR4_4_1k3ak3ale6np4o0.R.inc(26088);Years.MIN_VALUE.minus(1); 
         __CLR4_4_1k3ak3ale6np4o0.R.inc(26089);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1k3ak3ale6np4o0.R.flushNeeded();}}
public void testPlus_Years279() {__CLR4_4_1k3ak3ale6np4o0.R.globalSliceStart(getClass().getName(),26090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198mh20k4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k3ak3ale6np4o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k3ak3ale6np4o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testPlus_Years279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198mh20k4q(){try{__CLR4_4_1k3ak3ale6np4o0.R.inc(26090); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26091);Years test2 = Years.years(2); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26092);Years test3 = Years.years(3); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26093);Years result = test2.plus(test3); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26094);assertEquals(2, test2.getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26095);assertEquals(3, test3.getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26096);assertEquals(5, result.getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26097);assertEquals(1, Years.ONE.plus(Years.ZERO).getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26098);assertEquals(1, Years.ONE.plus((Years) null).getYears()); 
     __CLR4_4_1k3ak3ale6np4o0.R.inc(26099);try { 
         __CLR4_4_1k3ak3ale6np4o0.R.inc(26100);Years.MAX_VALUE.plus(Years.ONE); 
         __CLR4_4_1k3ak3ale6np4o0.R.inc(26101);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1k3ak3ale6np4o0.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
