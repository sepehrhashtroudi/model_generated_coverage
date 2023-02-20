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
public class TestSeconds extends TestCase {static class __CLR4_4_1o65o65le6qea54{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,31468,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1o65o65le6qea54.R.inc(31325);
        __CLR4_4_1o65o65le6qea54.R.inc(31326);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1o65o65le6qea54.R.inc(31327);
        __CLR4_4_1o65o65le6qea54.R.inc(31328);return new TestSuite(TestSeconds.class);
    }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}}

    public TestSeconds(String name) {
        super(name);__CLR4_4_1o65o65le6qea54.R.inc(31330);try{__CLR4_4_1o65o65le6qea54.R.inc(31329);
    }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1o65o65le6qea54.R.inc(31331);
    }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1o65o65le6qea54.R.inc(31332);
    }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSerialization503() throws Exception {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnz2nzo6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testSerialization503",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnz2nzo6d() throws Exception{try{__CLR4_4_1o65o65le6qea54.R.inc(31333); 
     __CLR4_4_1o65o65le6qea54.R.inc(31334);Seconds test = Seconds.THREE; 
     __CLR4_4_1o65o65le6qea54.R.inc(31335);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1o65o65le6qea54.R.inc(31336);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1o65o65le6qea54.R.inc(31337);oos.writeObject(test); 
     __CLR4_4_1o65o65le6qea54.R.inc(31338);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1o65o65le6qea54.R.inc(31339);oos.close(); 
     __CLR4_4_1o65o65le6qea54.R.inc(31340);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1o65o65le6qea54.R.inc(31341);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1o65o65le6qea54.R.inc(31342);Seconds result = (Seconds) ois.readObject(); 
     __CLR4_4_1o65o65le6qea54.R.inc(31343);ois.close(); 
     __CLR4_4_1o65o65le6qea54.R.inc(31344);assertSame(test, result); 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testPlus_int504() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wg6cm4o6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_int504",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wg6cm4o6p(){try{__CLR4_4_1o65o65le6qea54.R.inc(31345); 
     __CLR4_4_1o65o65le6qea54.R.inc(31346);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1o65o65le6qea54.R.inc(31347);Seconds result = test2.plus(3); 
     __CLR4_4_1o65o65le6qea54.R.inc(31348);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31349);assertEquals(5, result.getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31350);assertEquals(1, Seconds.ONE.plus(0).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31351);try { 
         __CLR4_4_1o65o65le6qea54.R.inc(31352);Seconds.MAX_VALUE.plus(1); 
         __CLR4_4_1o65o65le6qea54.R.inc(31353);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testToStandardMinutes505() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1px86eso6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardMinutes505",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1px86eso6y(){try{__CLR4_4_1o65o65le6qea54.R.inc(31354); 
     __CLR4_4_1o65o65le6qea54.R.inc(31355);Seconds test = Seconds.seconds(60 * 2); 
     __CLR4_4_1o65o65le6qea54.R.inc(31356);Minutes expected = Minutes.minutes(2); 
     __CLR4_4_1o65o65le6qea54.R.inc(31357);assertEquals(expected, test.toStandardMinutes()); 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testFactory_secondsBetween_RPartial506() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vhagfwo72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RPartial506",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vhagfwo72(){try{__CLR4_4_1o65o65le6qea54.R.inc(31358); 
     __CLR4_4_1o65o65le6qea54.R.inc(31359);LocalTime start = new LocalTime(12, 0, 3); 
     __CLR4_4_1o65o65le6qea54.R.inc(31360);LocalTime end1 = new LocalTime(12, 0, 6); 
     __CLR4_4_1o65o65le6qea54.R.inc(31361);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 0, 9); 
     __CLR4_4_1o65o65le6qea54.R.inc(31362);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31363);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31364);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31365);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31366);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testFactory_parseSeconds_String507() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gzm1yo7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_parseSeconds_String507",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gzm1yo7b(){try{__CLR4_4_1o65o65le6qea54.R.inc(31367); 
     __CLR4_4_1o65o65le6qea54.R.inc(31368);assertEquals(0, Seconds.parseSeconds((String) null).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31369);assertEquals(0, Seconds.parseSeconds("PT0S").getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31370);assertEquals(1, Seconds.parseSeconds("PT1S").getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31371);assertEquals(-3, Seconds.parseSeconds("PT-3S").getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31372);assertEquals(2, Seconds.parseSeconds("P0Y0M0DT2S").getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31373);assertEquals(2, Seconds.parseSeconds("PT0H2S").getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31374);try { 
         __CLR4_4_1o65o65le6qea54.R.inc(31375);Seconds.parseSeconds("P1Y1D"); 
         __CLR4_4_1o65o65le6qea54.R.inc(31376);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1o65o65le6qea54.R.inc(31377);try { 
         __CLR4_4_1o65o65le6qea54.R.inc(31378);Seconds.parseSeconds("P1DT1S"); 
         __CLR4_4_1o65o65le6qea54.R.inc(31379);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testAddToLocalDate508() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pszh9no7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testAddToLocalDate508",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pszh9no7o(){try{__CLR4_4_1o65o65le6qea54.R.inc(31380); 
     __CLR4_4_1o65o65le6qea54.R.inc(31381);Seconds test = Seconds.seconds(26); 
     __CLR4_4_1o65o65le6qea54.R.inc(31382);LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0); 
     __CLR4_4_1o65o65le6qea54.R.inc(31383);LocalDateTime expected = new LocalDateTime(2006, 6, 1, 0, 0, 26, 0); 
     __CLR4_4_1o65o65le6qea54.R.inc(31384);assertEquals(expected, date.plus(test)); 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testToStandardWeeks509() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2eg7ko7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardWeeks509",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2eg7ko7t(){try{__CLR4_4_1o65o65le6qea54.R.inc(31385); 
     __CLR4_4_1o65o65le6qea54.R.inc(31386);Seconds test = Seconds.seconds(60 * 60 * 24 * 7 * 2); 
     __CLR4_4_1o65o65le6qea54.R.inc(31387);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1o65o65le6qea54.R.inc(31388);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testToStandardDays510() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9rqueo7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDays510",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9rqueo7x(){try{__CLR4_4_1o65o65le6qea54.R.inc(31389); 
     __CLR4_4_1o65o65le6qea54.R.inc(31390);Seconds test = Seconds.seconds(60 * 60 * 24 * 2); 
     __CLR4_4_1o65o65le6qea54.R.inc(31391);Days expected = Days.days(2); 
     __CLR4_4_1o65o65le6qea54.R.inc(31392);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testToStandardHours511() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dvrmfo81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardHours511",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dvrmfo81(){try{__CLR4_4_1o65o65le6qea54.R.inc(31393); 
     __CLR4_4_1o65o65le6qea54.R.inc(31394);Seconds test = Seconds.seconds(60 * 60 * 2); 
     __CLR4_4_1o65o65le6qea54.R.inc(31395);Hours expected = Hours.hours(2); 
     __CLR4_4_1o65o65le6qea54.R.inc(31396);assertEquals(expected, test.toStandardHours()); 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testToStandardDuration512() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffgy1ro85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDuration512",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffgy1ro85(){try{__CLR4_4_1o65o65le6qea54.R.inc(31397); 
     __CLR4_4_1o65o65le6qea54.R.inc(31398);Seconds test = Seconds.seconds(20); 
     __CLR4_4_1o65o65le6qea54.R.inc(31399);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_SECOND); 
     __CLR4_4_1o65o65le6qea54.R.inc(31400);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31401);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_SECOND); 
     __CLR4_4_1o65o65le6qea54.R.inc(31402);assertEquals(expected, Seconds.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testPlus_Seconds513() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7qg32o8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_Seconds513",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7qg32o8b(){try{__CLR4_4_1o65o65le6qea54.R.inc(31403); 
     __CLR4_4_1o65o65le6qea54.R.inc(31404);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1o65o65le6qea54.R.inc(31405);Seconds test3 = Seconds.seconds(3); 
     __CLR4_4_1o65o65le6qea54.R.inc(31406);Seconds result = test2.plus(test3); 
     __CLR4_4_1o65o65le6qea54.R.inc(31407);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31408);assertEquals(3, test3.getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31409);assertEquals(5, result.getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31410);assertEquals(1, Seconds.ONE.plus(Seconds.ZERO).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31411);assertEquals(1, Seconds.ONE.plus((Seconds) null).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31412);try { 
         __CLR4_4_1o65o65le6qea54.R.inc(31413);Seconds.MAX_VALUE.plus(Seconds.ONE); 
         __CLR4_4_1o65o65le6qea54.R.inc(31414);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testMinus_Seconds514() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1axh5tro8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_Seconds514",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1axh5tro8n(){try{__CLR4_4_1o65o65le6qea54.R.inc(31415); 
     __CLR4_4_1o65o65le6qea54.R.inc(31416);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1o65o65le6qea54.R.inc(31417);Seconds test3 = Seconds.seconds(3); 
     __CLR4_4_1o65o65le6qea54.R.inc(31418);Seconds result = test2.minus(test3); 
     __CLR4_4_1o65o65le6qea54.R.inc(31419);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31420);assertEquals(3, test3.getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31421);assertEquals(-1, result.getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31422);assertEquals(1, Seconds.ONE.minus(Seconds.ZERO).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31423);assertEquals(1, Seconds.ONE.minus((Seconds) null).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31424);try { 
         __CLR4_4_1o65o65le6qea54.R.inc(31425);Seconds.MIN_VALUE.minus(Seconds.ONE); 
         __CLR4_4_1o65o65le6qea54.R.inc(31426);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testMultipliedBy_int515() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jh8g6so8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMultipliedBy_int515",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jh8g6so8z(){try{__CLR4_4_1o65o65le6qea54.R.inc(31427); 
     __CLR4_4_1o65o65le6qea54.R.inc(31428);Seconds test = Seconds.seconds(2); 
     __CLR4_4_1o65o65le6qea54.R.inc(31429);assertEquals(6, test.multipliedBy(3).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31430);assertEquals(2, test.getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31431);assertEquals(-6, test.multipliedBy(-3).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31432);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1o65o65le6qea54.R.inc(31433);Seconds halfMax = Seconds.seconds(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1o65o65le6qea54.R.inc(31434);try { 
         __CLR4_4_1o65o65le6qea54.R.inc(31435);halfMax.multipliedBy(2); 
         __CLR4_4_1o65o65le6qea54.R.inc(31436);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testDividedBy_int516() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iu121to99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testDividedBy_int516",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iu121to99(){try{__CLR4_4_1o65o65le6qea54.R.inc(31437); 
     __CLR4_4_1o65o65le6qea54.R.inc(31438);Seconds test = Seconds.seconds(12); 
     __CLR4_4_1o65o65le6qea54.R.inc(31439);assertEquals(6, test.dividedBy(2).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31440);assertEquals(12, test.getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31441);assertEquals(4, test.dividedBy(3).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31442);assertEquals(3, test.dividedBy(4).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31443);assertEquals(2, test.dividedBy(5).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31444);assertEquals(2, test.dividedBy(6).getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31445);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1o65o65le6qea54.R.inc(31446);try { 
         __CLR4_4_1o65o65le6qea54.R.inc(31447);Seconds.ONE.dividedBy(0); 
         __CLR4_4_1o65o65le6qea54.R.inc(31448);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testNegated517() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bunsyao9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testNegated517",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bunsyao9l(){try{__CLR4_4_1o65o65le6qea54.R.inc(31449); 
     __CLR4_4_1o65o65le6qea54.R.inc(31450);Seconds test = Seconds.seconds(12); 
     __CLR4_4_1o65o65le6qea54.R.inc(31451);assertEquals(-12, test.negated().getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31452);assertEquals(12, test.getSeconds()); 
     __CLR4_4_1o65o65le6qea54.R.inc(31453);try { 
         __CLR4_4_1o65o65le6qea54.R.inc(31454);Seconds.MIN_VALUE.negated(); 
         __CLR4_4_1o65o65le6qea54.R.inc(31455);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testIsGreaterThan518() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wgfoco9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsGreaterThan518",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wgfoco9s(){try{__CLR4_4_1o65o65le6qea54.R.inc(31456); 
     __CLR4_4_1o65o65le6qea54.R.inc(31457);assertEquals(true, Seconds.THREE.isGreaterThan(Seconds.TWO)); 
     __CLR4_4_1o65o65le6qea54.R.inc(31458);assertEquals(false, Seconds.THREE.isGreaterThan(Seconds.THREE)); 
     __CLR4_4_1o65o65le6qea54.R.inc(31459);assertEquals(false, Seconds.TWO.isGreaterThan(Seconds.THREE)); 
     __CLR4_4_1o65o65le6qea54.R.inc(31460);assertEquals(true, Seconds.ONE.isGreaterThan(null)); 
     __CLR4_4_1o65o65le6qea54.R.inc(31461);assertEquals(false, Seconds.seconds(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 


public void testIsLessThan519() {__CLR4_4_1o65o65le6qea54.R.globalSliceStart(getClass().getName(),31462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhe2duo9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o65o65le6qea54.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o65o65le6qea54.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsLessThan519",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhe2duo9y(){try{__CLR4_4_1o65o65le6qea54.R.inc(31462); 
     __CLR4_4_1o65o65le6qea54.R.inc(31463);assertEquals(false, Seconds.THREE.isLessThan(Seconds.TWO)); 
     __CLR4_4_1o65o65le6qea54.R.inc(31464);assertEquals(false, Seconds.THREE.isLessThan(Seconds.THREE)); 
     __CLR4_4_1o65o65le6qea54.R.inc(31465);assertEquals(true, Seconds.TWO.isLessThan(Seconds.THREE)); 
     __CLR4_4_1o65o65le6qea54.R.inc(31466);assertEquals(false, Seconds.ONE.isLessThan(null)); 
     __CLR4_4_1o65o65le6qea54.R.inc(31467);assertEquals(true, Seconds.seconds(-1).isLessThan(null)); 
 }finally{__CLR4_4_1o65o65le6qea54.R.flushNeeded();}} 

    

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
