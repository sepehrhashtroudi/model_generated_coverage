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
public class TestMinutes extends TestCase {static class __CLR4_4_1leclecle6qe9qt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,27879,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1leclecle6qe9qt.R.inc(27732);
        __CLR4_4_1leclecle6qe9qt.R.inc(27733);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1leclecle6qe9qt.R.inc(27734);
        __CLR4_4_1leclecle6qe9qt.R.inc(27735);return new TestSuite(TestMinutes.class);
    }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}}

    public TestMinutes(String name) {
        super(name);__CLR4_4_1leclecle6qe9qt.R.inc(27737);try{__CLR4_4_1leclecle6qe9qt.R.inc(27736);
    }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1leclecle6qe9qt.R.inc(27738);
    }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1leclecle6qe9qt.R.inc(27739);
    }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsLessThan890() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mheroglek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsLessThan890",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mheroglek(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27740); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27741);assertEquals(false, Minutes.THREE.isLessThan(Minutes.TWO)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27742);assertEquals(false, Minutes.THREE.isLessThan(Minutes.THREE)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27743);assertEquals(true, Minutes.TWO.isLessThan(Minutes.THREE)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27744);assertEquals(false, Minutes.ONE.isLessThan(null)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27745);assertEquals(true, Minutes.minutes(-1).isLessThan(null)); 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testFactory_parseMinutes_String891() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ia421yleq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_parseMinutes_String891",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ia421yleq(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27746); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27747);assertEquals(0, Minutes.parseMinutes((String) null).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27748);assertEquals(0, Minutes.parseMinutes("PT0M").getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27749);assertEquals(1, Minutes.parseMinutes("PT1M").getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27750);assertEquals(-3, Minutes.parseMinutes("PT-3M").getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27751);assertEquals(2, Minutes.parseMinutes("P0Y0M0DT2M").getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27752);assertEquals(2, Minutes.parseMinutes("PT0H2M").getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27753);try { 
         __CLR4_4_1leclecle6qe9qt.R.inc(27754);Minutes.parseMinutes("P1Y1D"); 
         __CLR4_4_1leclecle6qe9qt.R.inc(27755);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1leclecle6qe9qt.R.inc(27756);try { 
         __CLR4_4_1leclecle6qe9qt.R.inc(27757);Minutes.parseMinutes("P1DT1M"); 
         __CLR4_4_1leclecle6qe9qt.R.inc(27758);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testMinus_Minutes892() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11dcid6lf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_Minutes892",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11dcid6lf3(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27759); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27760);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27761);Minutes test3 = Minutes.minutes(3); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27762);Minutes result = test2.minus(test3); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27763);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27764);assertEquals(3, test3.getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27765);assertEquals(-1, result.getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27766);assertEquals(1, Minutes.ONE.minus(Minutes.ZERO).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27767);assertEquals(1, Minutes.ONE.minus((Minutes) null).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27768);try { 
         __CLR4_4_1leclecle6qe9qt.R.inc(27769);Minutes.MIN_VALUE.minus(Minutes.ONE); 
         __CLR4_4_1leclecle6qe9qt.R.inc(27770);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testFactory_minutes_int893() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfkqy9lff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutes_int893",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfkqy9lff(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27771); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27772);assertSame(Minutes.ZERO, Minutes.minutes(0)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27773);assertSame(Minutes.ONE, Minutes.minutes(1)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27774);assertSame(Minutes.TWO, Minutes.minutes(2)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27775);assertSame(Minutes.THREE, Minutes.minutes(3)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27776);assertSame(Minutes.MAX_VALUE, Minutes.minutes(Integer.MAX_VALUE)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27777);assertSame(Minutes.MIN_VALUE, Minutes.minutes(Integer.MIN_VALUE)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27778);assertEquals(-1, Minutes.minutes(-1).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27779);assertEquals(4, Minutes.minutes(4).getMinutes()); 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testFactory_minutesBetween_RInstant894() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7u3hglfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RInstant894",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7u3hglfo(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27780); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27781);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27782);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27783);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27784);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27785);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27786);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27787);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27788);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testFactory_minutesBetween_RPartial895() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vz3e1vlfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RPartial895",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vz3e1vlfx(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27789); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27790);LocalTime start = new LocalTime(12, 3); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27791);LocalTime end1 = new LocalTime(12, 6); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27792);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 9); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27793);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27794);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27795);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27796);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27797);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testFactory_standardMinutesIn_RPeriod896() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrvhh4lg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_standardMinutesIn_RPeriod896",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrvhh4lg6(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27798); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27799);assertEquals(0, Minutes.standardMinutesIn((ReadablePeriod) null).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27800);assertEquals(0, Minutes.standardMinutesIn(Period.ZERO).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27801);assertEquals(1, Minutes.standardMinutesIn(new Period(0, 0, 0, 0, 0, 1, 0, 0)).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27802);assertEquals(123, Minutes.standardMinutesIn(Period.minutes(123)).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27803);assertEquals(-987, Minutes.standardMinutesIn(Period.minutes(-987)).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27804);assertEquals(1, Minutes.standardMinutesIn(Period.seconds(119)).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27805);assertEquals(2, Minutes.standardMinutesIn(Period.seconds(120)).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27806);assertEquals(2, Minutes.standardMinutesIn(Period.seconds(121)).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27807);assertEquals(120, Minutes.standardMinutesIn(Period.hours(2)).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27808);try { 
         __CLR4_4_1leclecle6qe9qt.R.inc(27809);Minutes.standardMinutesIn(Period.months(1)); 
         __CLR4_4_1leclecle6qe9qt.R.inc(27810);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testSerialization897() throws Exception {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yauov3lgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testSerialization897",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yauov3lgj() throws Exception{try{__CLR4_4_1leclecle6qe9qt.R.inc(27811); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27812);Minutes test = Minutes.THREE; 
     __CLR4_4_1leclecle6qe9qt.R.inc(27813);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27814);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27815);oos.writeObject(test); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27816);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27817);oos.close(); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27818);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27819);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27820);Minutes result = (Minutes) ois.readObject(); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27821);ois.close(); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27822);assertSame(test, result); 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testToStandardWeeks898() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnfhd5lgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardWeeks898",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnfhd5lgv(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27823); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27824);Minutes test = Minutes.minutes(60 * 24 * 7 * 2); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27825);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27826);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testToStandardDays899() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i86y3ilgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDays899",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i86y3ilgz(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27827); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27828);Minutes test = Minutes.minutes(60 * 24 * 2); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27829);Days expected = Days.days(2); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27830);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testToStandardHours900() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1twq6t7lh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardHours900",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1twq6t7lh3(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27831); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27832);Minutes test = Minutes.minutes(3 * 60); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27833);Hours expected = Hours.hours(3); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27834);assertEquals(expected, test.toStandardHours()); 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testToStandardSeconds901() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0mmzwlh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardSeconds901",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0mmzwlh7(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27835); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27836);Minutes test = Minutes.minutes(3); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27837);Seconds expected = Seconds.seconds(3 * 60); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27838);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27839);try { 
         __CLR4_4_1leclecle6qe9qt.R.inc(27840);Minutes.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1leclecle6qe9qt.R.inc(27841);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testMinus_int902() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwypislhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_int902",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwypislhe(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27842); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27843);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27844);Minutes result = test2.minus(3); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27845);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27846);assertEquals(-1, result.getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27847);assertEquals(1, Minutes.ONE.minus(0).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27848);try { 
         __CLR4_4_1leclecle6qe9qt.R.inc(27849);Minutes.MIN_VALUE.minus(1); 
         __CLR4_4_1leclecle6qe9qt.R.inc(27850);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testPlus_Minutes903() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_153yjuflhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testPlus_Minutes903",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_153yjuflhn(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27851); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27852);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27853);Minutes test3 = Minutes.minutes(3); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27854);Minutes result = test2.plus(test3); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27855);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27856);assertEquals(3, test3.getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27857);assertEquals(5, result.getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27858);assertEquals(1, Minutes.ONE.plus(Minutes.ZERO).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27859);assertEquals(1, Minutes.ONE.plus((Minutes) null).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27860);try { 
         __CLR4_4_1leclecle6qe9qt.R.inc(27861);Minutes.MAX_VALUE.plus(Minutes.ONE); 
         __CLR4_4_1leclecle6qe9qt.R.inc(27862);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testMultipliedBy_int904() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m116lklhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMultipliedBy_int904",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m116lklhz(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27863); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27864);Minutes test = Minutes.minutes(2); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27865);assertEquals(6, test.multipliedBy(3).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27866);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27867);assertEquals(-6, test.multipliedBy(-3).getMinutes()); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27868);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27869);Minutes halfMax = Minutes.minutes(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27870);try { 
         __CLR4_4_1leclecle6qe9qt.R.inc(27871);halfMax.multipliedBy(2); 
         __CLR4_4_1leclecle6qe9qt.R.inc(27872);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 


public void testIsGreaterThan905() {__CLR4_4_1leclecle6qe9qt.R.globalSliceStart(getClass().getName(),27873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l4e1xili9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1leclecle6qe9qt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1leclecle6qe9qt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsGreaterThan905",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l4e1xili9(){try{__CLR4_4_1leclecle6qe9qt.R.inc(27873); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27874);assertEquals(true, Minutes.THREE.isGreaterThan(Minutes.TWO)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27875);assertEquals(false, Minutes.THREE.isGreaterThan(Minutes.THREE)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27876);assertEquals(false, Minutes.TWO.isGreaterThan(Minutes.THREE)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27877);assertEquals(true, Minutes.ONE.isGreaterThan(null)); 
     __CLR4_4_1leclecle6qe9qt.R.inc(27878);assertEquals(false, Minutes.minutes(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1leclecle6qe9qt.R.flushNeeded();}} 

    

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
