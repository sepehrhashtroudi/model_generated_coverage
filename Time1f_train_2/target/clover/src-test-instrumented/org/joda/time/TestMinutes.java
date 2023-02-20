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
public class TestMinutes extends TestCase {static class __CLR4_4_1lerlerle6qsf19{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,27884,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1lerlerle6qsf19.R.inc(27747);
        __CLR4_4_1lerlerle6qsf19.R.inc(27748);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lerlerle6qsf19.R.inc(27749);
        __CLR4_4_1lerlerle6qsf19.R.inc(27750);return new TestSuite(TestMinutes.class);
    }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}}

    public TestMinutes(String name) {
        super(name);__CLR4_4_1lerlerle6qsf19.R.inc(27752);try{__CLR4_4_1lerlerle6qsf19.R.inc(27751);
    }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lerlerle6qsf19.R.inc(27753);
    }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lerlerle6qsf19.R.inc(27754);
    }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetPeriodType759() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcvnodlez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testGetPeriodType759",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcvnodlez(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27755); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27756);Minutes test = Minutes.minutes(20); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27757);assertEquals(PeriodType.minutes(), test.getPeriodType()); 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testIsLessThan877() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1buz8qxlf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsLessThan877",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1buz8qxlf2(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27758); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27759);assertEquals(false, Minutes.THREE.isLessThan(Minutes.TWO)); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27760);assertEquals(false, Minutes.THREE.isLessThan(Minutes.THREE)); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27761);assertEquals(true, Minutes.TWO.isLessThan(Minutes.THREE)); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27762);assertEquals(false, Minutes.ONE.isLessThan(null)); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27763);assertEquals(true, Minutes.minutes(-1).isLessThan(null)); 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testFactory_minutesBetween_RInstant878() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dk0kilf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RInstant878",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dk0kilf8(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27764); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27765);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27766);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27767);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27768);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27769);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27770);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27771);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27772);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testFactory_minutesIn_RInterval879() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ubj45wlfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesIn_RInterval879",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ubj45wlfh(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27773); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27774);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27775);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27776);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27777);assertEquals(0, Minutes.minutesIn((ReadableInterval) null).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27778);assertEquals(3, Minutes.minutesIn(new Interval(start, end1)).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27779);assertEquals(0, Minutes.minutesIn(new Interval(start, start)).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27780);assertEquals(0, Minutes.minutesIn(new Interval(end1, end1)).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27781);assertEquals(6, Minutes.minutesIn(new Interval(start, end2)).getMinutes()); 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testFactory_standardMinutesIn_RPeriod880() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121dv7nlfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_standardMinutesIn_RPeriod880",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121dv7nlfq(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27782); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27783);assertEquals(0, Minutes.standardMinutesIn((ReadablePeriod) null).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27784);assertEquals(0, Minutes.standardMinutesIn(Period.ZERO).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27785);assertEquals(1, Minutes.standardMinutesIn(new Period(0, 0, 0, 0, 0, 1, 0, 0)).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27786);assertEquals(123, Minutes.standardMinutesIn(Period.minutes(123)).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27787);assertEquals(-987, Minutes.standardMinutesIn(Period.minutes(-987)).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27788);assertEquals(1, Minutes.standardMinutesIn(Period.seconds(119)).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27789);assertEquals(2, Minutes.standardMinutesIn(Period.seconds(120)).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27790);assertEquals(2, Minutes.standardMinutesIn(Period.seconds(121)).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27791);assertEquals(120, Minutes.standardMinutesIn(Period.hours(2)).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27792);try { 
         __CLR4_4_1lerlerle6qsf19.R.inc(27793);Minutes.standardMinutesIn(Period.months(1)); 
         __CLR4_4_1lerlerle6qsf19.R.inc(27794);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testSerialization881() throws Exception {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ex00falg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testSerialization881",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ex00falg3() throws Exception{try{__CLR4_4_1lerlerle6qsf19.R.inc(27795); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27796);Minutes test = Minutes.THREE; 
     __CLR4_4_1lerlerle6qsf19.R.inc(27797);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27798);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27799);oos.writeObject(test); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27800);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27801);oos.close(); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27802);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27803);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27804);Minutes result = (Minutes) ois.readObject(); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27805);ois.close(); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27806);assertSame(test, result); 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testToStandardDays882() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8npzclgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDays882",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8npzclgf(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27807); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27808);Minutes test = Minutes.minutes(60 * 24 * 2); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27809);Days expected = Days.days(2); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27810);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testToStandardHours883() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l07ijlgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardHours883",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l07ijlgj(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27811); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27812);Minutes test = Minutes.minutes(3 * 60); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27813);Hours expected = Hours.hours(3); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27814);assertEquals(expected, test.toStandardHours()); 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testToStandardSeconds884() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bh3rbulgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardSeconds884",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bh3rbulgn(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27815); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27816);Minutes test = Minutes.minutes(3); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27817);Seconds expected = Seconds.seconds(3 * 60); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27818);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27819);try { 
         __CLR4_4_1lerlerle6qsf19.R.inc(27820);Minutes.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1lerlerle6qsf19.R.inc(27821);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testToStandardDuration885() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpkxpalgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDuration885",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpkxpalgu(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27822); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27823);Minutes test = Minutes.minutes(20); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27824);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_MINUTE); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27825);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27826);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_MINUTE); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27827);assertEquals(expected, Minutes.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testMinus_int886() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19brq0hlh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_int886",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19brq0hlh0(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27828); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27829);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27830);Minutes result = test2.minus(3); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27831);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27832);assertEquals(-1, result.getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27833);assertEquals(1, Minutes.ONE.minus(0).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27834);try { 
         __CLR4_4_1lerlerle6qsf19.R.inc(27835);Minutes.MIN_VALUE.minus(1); 
         __CLR4_4_1lerlerle6qsf19.R.inc(27836);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testPlus_Minutes887() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q4rvoulh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testPlus_Minutes887",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q4rvoulh9(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27837); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27838);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27839);Minutes test3 = Minutes.minutes(3); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27840);Minutes result = test2.plus(test3); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27841);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27842);assertEquals(3, test3.getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27843);assertEquals(5, result.getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27844);assertEquals(1, Minutes.ONE.plus(Minutes.ZERO).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27845);assertEquals(1, Minutes.ONE.plus((Minutes) null).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27846);try { 
         __CLR4_4_1lerlerle6qsf19.R.inc(27847);Minutes.MAX_VALUE.plus(Minutes.ONE); 
         __CLR4_4_1lerlerle6qsf19.R.inc(27848);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testMultipliedBy_int888() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrcfublhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMultipliedBy_int888",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrcfublhl(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27849); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27850);Minutes test = Minutes.minutes(2); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27851);assertEquals(6, test.multipliedBy(3).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27852);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27853);assertEquals(-6, test.multipliedBy(-3).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27854);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27855);Minutes halfMax = Minutes.minutes(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27856);try { 
         __CLR4_4_1lerlerle6qsf19.R.inc(27857);halfMax.multipliedBy(2); 
         __CLR4_4_1lerlerle6qsf19.R.inc(27858);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testDividedBy_int889() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h451pclhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testDividedBy_int889",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h451pclhv(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27859); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27860);Minutes test = Minutes.minutes(12); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27861);assertEquals(6, test.dividedBy(2).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27862);assertEquals(12, test.getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27863);assertEquals(4, test.dividedBy(3).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27864);assertEquals(3, test.dividedBy(4).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27865);assertEquals(2, test.dividedBy(5).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27866);assertEquals(2, test.dividedBy(6).getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27867);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27868);try { 
         __CLR4_4_1lerlerle6qsf19.R.inc(27869);Minutes.ONE.dividedBy(0); 
         __CLR4_4_1lerlerle6qsf19.R.inc(27870);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testNegated890() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17cn18mli7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testNegated890",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17cn18mli7(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27871); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27872);Minutes test = Minutes.minutes(12); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27873);assertEquals(-12, test.negated().getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27874);assertEquals(12, test.getMinutes()); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27875);try { 
         __CLR4_4_1lerlerle6qsf19.R.inc(27876);Minutes.MIN_VALUE.negated(); 
         __CLR4_4_1lerlerle6qsf19.R.inc(27877);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 


public void testIsGreaterThan891() {__CLR4_4_1lerlerle6qsf19.R.globalSliceStart(getClass().getName(),27878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16eh7e0lie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lerlerle6qsf19.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lerlerle6qsf19.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsGreaterThan891",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16eh7e0lie(){try{__CLR4_4_1lerlerle6qsf19.R.inc(27878); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27879);assertEquals(true, Minutes.THREE.isGreaterThan(Minutes.TWO)); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27880);assertEquals(false, Minutes.THREE.isGreaterThan(Minutes.THREE)); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27881);assertEquals(false, Minutes.TWO.isGreaterThan(Minutes.THREE)); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27882);assertEquals(true, Minutes.ONE.isGreaterThan(null)); 
     __CLR4_4_1lerlerle6qsf19.R.inc(27883);assertEquals(false, Minutes.minutes(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1lerlerle6qsf19.R.flushNeeded();}} 

    

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
