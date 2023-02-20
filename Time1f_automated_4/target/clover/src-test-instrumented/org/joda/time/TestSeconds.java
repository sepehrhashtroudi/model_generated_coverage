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
public class TestSeconds extends TestCase {static class __CLR4_4_1jk7jk7le6o7a10{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,25478,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25351);
        __CLR4_4_1jk7jk7le6o7a10.R.inc(25352);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25353);
        __CLR4_4_1jk7jk7le6o7a10.R.inc(25354);return new TestSuite(TestSeconds.class);
    }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}

    public TestSeconds(String name) {
        super(name);__CLR4_4_1jk7jk7le6o7a10.R.inc(25356);try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25355);
    }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25357);
    }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25358);
    }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToStandardSeconds194() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6pz9ajkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardSeconds194",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6pz9ajkf(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25359); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25360);Period test = new Period(0, 0, 0, 0, 0, 0, 7, 8); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25361);assertEquals(7, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25362);test = new Period(0, 0, 0, 0, 0, 1, 3, 0); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25363);assertEquals(63, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25364);test = new Period(0, 0, 0, 0, 0, 0, 0, 1000); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25365);assertEquals(1, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25366);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 0); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25367);assertEquals(Integer.MAX_VALUE, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25368);test = new Period(0, 0, 0, 0, 0, 0, 20, Integer.MAX_VALUE); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25369);long expected = 20; 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25370);expected += ((long) Integer.MAX_VALUE) / DateTimeConstants.MILLIS_PER_SECOND; 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25371);assertEquals(expected, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25372);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 1000); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25373);try { 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25374);test.toStandardSeconds(); 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25375);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testToStandardSeconds195() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yle3xdjkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardSeconds195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yle3xdjkw(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25376); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25377);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25378);Seconds expected = Seconds.seconds(2 * 7 * 24 * 60 * 60); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25379);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25380);try { 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25381);Weeks.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25382);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testSerialization196() throws Exception {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p1ahuxjl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testSerialization196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p1ahuxjl3() throws Exception{try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25383); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25384);Seconds test = Seconds.THREE; 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25385);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25386);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25387);oos.writeObject(test); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25388);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25389);oos.close(); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25390);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25391);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25392);Seconds result = (Seconds) ois.readObject(); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25393);ois.close(); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25394);assertSame(test, result); 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testToStandardDays197() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qo5uk5jlf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDays197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qo5uk5jlf(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25395); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25396);Seconds test = Seconds.seconds(60 * 60 * 24 * 2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25397);Days expected = Days.days(2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25398);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testToStandardHours198() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1epaoy6jlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardHours198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1epaoy6jlj(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25399); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25400);Seconds test = Seconds.seconds(60 * 60 * 24 * 2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25401);Hours expected = Hours.hours(2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25402);assertEquals(expected, test.toStandardHours()); 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testToStandardHours199() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bgaq5pjln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardHours199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bgaq5pjln(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25403); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25404);Seconds test = Seconds.seconds(60 * 60 * 24 * 7 * 2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25405);Hours expected = Hours.hours(2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25406);assertEquals(expected, test.toStandardHours()); 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testToStandardMinutes200() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z9g478jlr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardMinutes200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z9g478jlr(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25407); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25408);Seconds test = Seconds.seconds(60 * 60 * 24 * 2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25409);Minutes expected = Minutes.minutes(2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25410);assertEquals(expected, test.toStandardMinutes()); 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testToStandardMinutes201() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1winyzfjlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardMinutes201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1winyzfjlv(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25411); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25412);Seconds test = Seconds.seconds(60 * 60 * 24 * 2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25413);Minutes expected = Minutes.minutes(2 * 24 * 60); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25414);assertEquals(expected, test.toStandardMinutes()); 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testToStandardDuration202() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vtvwjjlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDuration202",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vtvwjjlz(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25415); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25416);Seconds test = Seconds.seconds(20); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25417);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_SECOND); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25418);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25419);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_SECOND); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25420);assertEquals(expected, Seconds.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testPlus_Seconds203() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ji2rxsjm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_Seconds203",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ji2rxsjm5(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25421); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25422);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25423);Seconds test3 = Seconds.seconds(3); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25424);Seconds result = test2.plus(test3); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25425);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25426);assertEquals(3, test3.getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25427);assertEquals(5, result.getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25428);assertEquals(1, Seconds.ONE.plus(Seconds.ZERO).getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25429);assertEquals(1, Seconds.ONE.plus((Seconds) null).getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25430);try { 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25431);Seconds.MAX_VALUE.plus(Seconds.ONE); 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25432);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testMultipliedBy_int204() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1732cjzjmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMultipliedBy_int204",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1732cjzjmh(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25433); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25434);Seconds test = Seconds.seconds(2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25435);assertEquals(6, test.multipliedBy(3).getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25436);assertEquals(2, test.getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25437);assertEquals(-6, test.multipliedBy(-3).getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25438);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25439);Seconds halfMax = Seconds.seconds(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25440);try { 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25441);halfMax.multipliedBy(2); 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25442);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testDividedBy_int205() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17q9qoyjmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testDividedBy_int205",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17q9qoyjmr(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25443); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25444);Seconds test = Seconds.seconds(12); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25445);assertEquals(6, test.dividedBy(2).getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25446);assertEquals(12, test.getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25447);assertEquals(4, test.dividedBy(3).getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25448);assertEquals(3, test.dividedBy(4).getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25449);assertEquals(2, test.dividedBy(5).getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25450);assertEquals(2, test.dividedBy(6).getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25451);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25452);try { 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25453);Seconds.ONE.dividedBy(0); 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25454);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testNegated206() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1epmzshjn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testNegated206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1epmzshjn3(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25455); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25456);Seconds test = Seconds.seconds(12); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25457);assertEquals(-12, test.negated().getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25458);assertEquals(12, test.getSeconds()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25459);try { 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25460);Seconds.MIN_VALUE.negated(); 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25461);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testIsGreaterThan207() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sgr8f3jna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsGreaterThan207",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sgr8f3jna(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25462); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25463);assertEquals(true, Seconds.THREE.isGreaterThan(Seconds.TWO)); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25464);assertEquals(false, Seconds.THREE.isGreaterThan(Seconds.THREE)); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25465);assertEquals(false, Seconds.TWO.isGreaterThan(Seconds.THREE)); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25466);assertEquals(true, Seconds.ONE.isGreaterThan(null)); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25467);assertEquals(false, Seconds.seconds(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
public void testMultipliedBy_int332() {__CLR4_4_1jk7jk7le6o7a10.R.globalSliceStart(getClass().getName(),25468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ejonhjng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jk7jk7le6o7a10.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jk7jk7le6o7a10.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMultipliedBy_int332",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ejonhjng(){try{__CLR4_4_1jk7jk7le6o7a10.R.inc(25468); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25469);Minutes test = Minutes.minutes(2); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25470);assertEquals(6, test.multipliedBy(3).getMinutes()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25471);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25472);assertEquals(-6, test.multipliedBy(-3).getMinutes()); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25473);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25474);Minutes halfMax = Minutes.minutes(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1jk7jk7le6o7a10.R.inc(25475);try { 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25476);halfMax.multipliedBy(2); 
         __CLR4_4_1jk7jk7le6o7a10.R.inc(25477);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jk7jk7le6o7a10.R.flushNeeded();}}
    

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
