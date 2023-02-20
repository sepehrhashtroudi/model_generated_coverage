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
 * This class is a Junit unit test for Hours.
 *
 * @author Stephen Colebourne
 */
public class TestHours extends TestCase {static class __CLR4_4_1hq9hq9le6np4e9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,23036,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1hq9hq9le6np4e9.R.inc(22977);
        __CLR4_4_1hq9hq9le6np4e9.R.inc(22978);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hq9hq9le6np4e9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hq9hq9le6np4e9.R.inc(22979);
        __CLR4_4_1hq9hq9le6np4e9.R.inc(22980);return new TestSuite(TestHours.class);
    }finally{__CLR4_4_1hq9hq9le6np4e9.R.flushNeeded();}}

    public TestHours(String name) {
        super(name);__CLR4_4_1hq9hq9le6np4e9.R.inc(22982);try{__CLR4_4_1hq9hq9le6np4e9.R.inc(22981);
    }finally{__CLR4_4_1hq9hq9le6np4e9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hq9hq9le6np4e9.R.inc(22983);
    }finally{__CLR4_4_1hq9hq9le6np4e9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hq9hq9le6np4e9.R.inc(22984);
    }finally{__CLR4_4_1hq9hq9le6np4e9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_hoursBetween_RInstant467() {__CLR4_4_1hq9hq9le6np4e9.R.globalSliceStart(getClass().getName(),22985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ew4s2hqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hq9hq9le6np4e9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hq9hq9le6np4e9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RInstant467",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ew4s2hqh(){try{__CLR4_4_1hq9hq9le6np4e9.R.inc(22985); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22986);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, PARIS); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22987);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, PARIS); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22988);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, PARIS); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22989);assertEquals(3, Hours.hoursBetween(start, end1).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22990);assertEquals(0, Hours.hoursBetween(start, start).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22991);assertEquals(0, Hours.hoursBetween(end1, end1).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22992);assertEquals(-3, Hours.hoursBetween(end1, start).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22993);assertEquals(6, Hours.hoursBetween(start, end2).getHours()); 
 }finally{__CLR4_4_1hq9hq9le6np4e9.R.flushNeeded();}}
public void testFactory_hoursIn_RInterval468() {__CLR4_4_1hq9hq9le6np4e9.R.globalSliceStart(getClass().getName(),22994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qkx0rchqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hq9hq9le6np4e9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hq9hq9le6np4e9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursIn_RInterval468",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qkx0rchqq(){try{__CLR4_4_1hq9hq9le6np4e9.R.inc(22994); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22995);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, PARIS); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22996);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 0, PARIS); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22997);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 0, PARIS); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22998);assertEquals(0, Hours.hoursIn((ReadableInterval) null).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(22999);assertEquals(3, Hours.hoursIn(new Interval(start, end1)).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23000);assertEquals(0, Hours.hoursIn(new Interval(start, start)).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23001);assertEquals(0, Hours.hoursIn(new Interval(end1, end1)).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23002);assertEquals(6, Hours.hoursIn(new Interval(start, end2)).getHours()); 
 }finally{__CLR4_4_1hq9hq9le6np4e9.R.flushNeeded();}}
public void testFactory_hoursIn_RInterval469() {__CLR4_4_1hq9hq9le6np4e9.R.globalSliceStart(getClass().getName(),23003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttwzjthqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hq9hq9le6np4e9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hq9hq9le6np4e9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursIn_RInterval469",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttwzjthqz(){try{__CLR4_4_1hq9hq9le6np4e9.R.inc(23003); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23004);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, PARIS); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23005);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, PARIS); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23006);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, PARIS); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23007);assertEquals(0, Hours.hoursIn((ReadableInterval) null).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23008);assertEquals(3, Hours.hoursIn(new Interval(start, end1)).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23009);assertEquals(0, Hours.hoursIn(new Interval(start, start)).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23010);assertEquals(0, Hours.hoursIn(new Interval(end1, end1)).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23011);assertEquals(6, Hours.hoursIn(new Interval(start, end2)).getHours()); 
 }finally{__CLR4_4_1hq9hq9le6np4e9.R.flushNeeded();}}
public void testToStandardMinutes471() {__CLR4_4_1hq9hq9le6np4e9.R.globalSliceStart(getClass().getName(),23012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6ev4whr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hq9hq9le6np4e9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hq9hq9le6np4e9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardMinutes471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6ev4whr8(){try{__CLR4_4_1hq9hq9le6np4e9.R.inc(23012); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23013);Hours test = Hours.hours(3); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23014);Minutes expected = Minutes.minutes(3 * 60); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23015);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23016);try { 
         __CLR4_4_1hq9hq9le6np4e9.R.inc(23017);Hours.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1hq9hq9le6np4e9.R.inc(23018);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hq9hq9le6np4e9.R.flushNeeded();}}
public void testMinus_Hours472() {__CLR4_4_1hq9hq9le6np4e9.R.globalSliceStart(getClass().getName(),23019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ive4nchrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hq9hq9le6np4e9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hq9hq9le6np4e9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_Hours472",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ive4nchrf(){try{__CLR4_4_1hq9hq9le6np4e9.R.inc(23019); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23020);Hours test2 = Hours.hours(2); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23021);Hours test3 = Hours.hours(3); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23022);Hours result = test2.minus(test3); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23023);assertEquals(2, test2.getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23024);assertEquals(3, test3.getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23025);assertEquals(-1, result.getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23026);assertEquals(1, Hours.ONE.minus(Hours.ZERO).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23027);assertEquals(1, Hours.ONE.minus((Hours) null).getHours()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23028);try { 
         __CLR4_4_1hq9hq9le6np4e9.R.inc(23029);Hours.MIN_VALUE.minus(Hours.ONE); 
         __CLR4_4_1hq9hq9le6np4e9.R.inc(23030);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hq9hq9le6np4e9.R.flushNeeded();}}
public void testToString473() {__CLR4_4_1hq9hq9le6np4e9.R.globalSliceStart(getClass().getName(),23031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6wb0nhrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hq9hq9le6np4e9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hq9hq9le6np4e9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToString473",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6wb0nhrr(){try{__CLR4_4_1hq9hq9le6np4e9.R.inc(23031); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23032);Hours test = Hours.hours(20); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23033);assertEquals("PT20H", test.toString()); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23034);test = Hours.hours(-20); 
     __CLR4_4_1hq9hq9le6np4e9.R.inc(23035);assertEquals("PT-20H", test.toString()); 
 }finally{__CLR4_4_1hq9hq9le6np4e9.R.flushNeeded();}}
    

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
