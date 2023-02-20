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
public class TestMinutes extends TestCase {static class __CLR4_4_1lb8lb8le6rcl91{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,27782,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27620);
        __CLR4_4_1lb8lb8le6rcl91.R.inc(27621);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27622);
        __CLR4_4_1lb8lb8le6rcl91.R.inc(27623);return new TestSuite(TestMinutes.class);
    }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}}

    public TestMinutes(String name) {
        super(name);__CLR4_4_1lb8lb8le6rcl91.R.inc(27625);try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27624);
    }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27626);
    }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27627);
    }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetPeriodType769() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14cz8v6lbg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testGetPeriodType769",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14cz8v6lbg(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27628); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27629);Minutes test = Minutes.minutes(20); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27630);assertEquals(PeriodType.minutes(), test.getPeriodType()); 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testFactory_parseMinutes_String885() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzz3fllbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_parseMinutes_String885",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzz3fllbj(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27631); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27632);assertEquals(0, Minutes.parseMinutes((String) null).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27633);assertEquals(0, Minutes.parseMinutes("PT0M").getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27634);assertEquals(1, Minutes.parseMinutes("PT1M").getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27635);assertEquals(-3, Minutes.parseMinutes("PT-3M").getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27636);assertEquals(2, Minutes.parseMinutes("P0Y0M0DT2M").getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27637);assertEquals(2, Minutes.parseMinutes("PT0H2M").getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27638);try { 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27639);Minutes.parseMinutes("P1Y1D"); 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27640);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27641);try { 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27642);Minutes.parseMinutes("P1DT1M"); 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27643);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testMinus_Minutes886() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcij0hlbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_Minutes886",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcij0hlbw(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27644); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27645);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27646);Minutes test3 = Minutes.minutes(3); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27647);Minutes result = test2.minus(test3); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27648);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27649);assertEquals(3, test3.getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27650);assertEquals(-1, result.getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27651);assertEquals(1, Minutes.ONE.minus(Minutes.ZERO).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27652);assertEquals(1, Minutes.ONE.minus((Minutes) null).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27653);try { 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27654);Minutes.MIN_VALUE.minus(Minutes.ONE); 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27655);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testFactory_minutes_int887() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12pppkmlc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutes_int887",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12pppkmlc8(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27656); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27657);assertSame(Minutes.ZERO, Minutes.minutes(0)); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27658);assertSame(Minutes.ONE, Minutes.minutes(1)); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27659);assertSame(Minutes.TWO, Minutes.minutes(2)); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27660);assertSame(Minutes.THREE, Minutes.minutes(3)); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27661);assertSame(Minutes.MAX_VALUE, Minutes.minutes(Integer.MAX_VALUE)); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27662);assertSame(Minutes.MIN_VALUE, Minutes.minutes(Integer.MIN_VALUE)); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27663);assertEquals(-1, Minutes.minutes(-1).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27664);assertEquals(4, Minutes.minutes(4).getMinutes()); 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testFactory_minutesBetween_RPartial888() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j35nr5lch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RPartial888",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j35nr5lch(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27665); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27666);LocalTime start = new LocalTime(12, 3); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27667);LocalTime end1 = new LocalTime(12, 6); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27668);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 9); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27669);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27670);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27671);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27672);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27673);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testFactory_minutesIn_RInterval889() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lo7mdlcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesIn_RInterval889",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lo7mdlcq(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27674); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27675);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27676);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27677);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27678);assertEquals(0, Minutes.minutesIn((ReadableInterval) null).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27679);assertEquals(3, Minutes.minutesIn(new Interval(start, end1)).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27680);assertEquals(0, Minutes.minutesIn(new Interval(start, start)).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27681);assertEquals(0, Minutes.minutesIn(new Interval(end1, end1)).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27682);assertEquals(6, Minutes.minutesIn(new Interval(start, end2)).getMinutes()); 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testFactory_standardMinutesIn_RPeriod890() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vr8rr6lcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_standardMinutesIn_RPeriod890",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vr8rr6lcz(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27683); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27684);assertEquals(0, Minutes.standardMinutesIn((ReadablePeriod) null).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27685);assertEquals(0, Minutes.standardMinutesIn(Period.ZERO).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27686);assertEquals(1, Minutes.standardMinutesIn(new Period(0, 0, 0, 0, 0, 1, 0, 0)).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27687);assertEquals(123, Minutes.standardMinutesIn(Period.minutes(123)).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27688);assertEquals(-987, Minutes.standardMinutesIn(Period.minutes(-987)).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27689);assertEquals(1, Minutes.standardMinutesIn(Period.seconds(119)).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27690);assertEquals(2, Minutes.standardMinutesIn(Period.seconds(120)).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27691);assertEquals(2, Minutes.standardMinutesIn(Period.seconds(121)).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27692);assertEquals(120, Minutes.standardMinutesIn(Period.hours(2)).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27693);try { 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27694);Minutes.standardMinutesIn(Period.months(1)); 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27695);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testSerialization891() throws Exception {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esuw49ldc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testSerialization891",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esuw49ldc() throws Exception{try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27696); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27697);Minutes test = Minutes.THREE; 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27698);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27699);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27700);oos.writeObject(test); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27701);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27702);oos.close(); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27703);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27704);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27705);Minutes result = (Minutes) ois.readObject(); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27706);ois.close(); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27707);assertSame(test, result); 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testToStandardWeeks892() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d5fombldo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardWeeks892",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d5fombldo(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27708); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27709);Minutes test = Minutes.minutes(60 * 24 * 7 * 2); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27710);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27711);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testToStandardDays893() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119sunclds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDays893",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119sunclds(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27712); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27713);Minutes test = Minutes.minutes(60 * 24 * 2); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27714);Days expected = Days.days(2); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27715);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testToStandardHours894() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sdunthldw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardHours894",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sdunthldw(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27716); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27717);Minutes test = Minutes.minutes(3 * 60); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27718);Hours expected = Hours.hours(3); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27719);assertEquals(expected, test.toStandardHours()); 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testToStandardDuration895() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlo7qble0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDuration895",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlo7qble0(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27720); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27721);Minutes test = Minutes.minutes(20); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27722);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_MINUTE); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27723);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27724);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_MINUTE); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27725);assertEquals(expected, Minutes.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testMinus_int896() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ke36j2le6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_int896",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ke36j2le6(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27726); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27727);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27728);Minutes result = test2.minus(3); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27729);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27730);assertEquals(-1, result.getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27731);assertEquals(1, Minutes.ONE.minus(0).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27732);try { 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27733);Minutes.MIN_VALUE.minus(1); 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27734);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testPlus_Minutes897() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13l30uplef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testPlus_Minutes897",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13l30uplef(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27735); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27736);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27737);Minutes test3 = Minutes.minutes(3); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27738);Minutes result = test2.plus(test3); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27739);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27740);assertEquals(3, test3.getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27741);assertEquals(5, result.getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27742);assertEquals(1, Minutes.ONE.plus(Minutes.ZERO).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27743);assertEquals(1, Minutes.ONE.plus((Minutes) null).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27744);try { 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27745);Minutes.MAX_VALUE.plus(Minutes.ONE); 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27746);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testMultipliedBy_int898() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njwplaler();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMultipliedBy_int898",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njwplaler(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27747); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27748);Minutes test = Minutes.minutes(2); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27749);assertEquals(6, test.multipliedBy(3).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27750);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27751);assertEquals(-6, test.multipliedBy(-3).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27752);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27753);Minutes halfMax = Minutes.minutes(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27754);try { 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27755);halfMax.multipliedBy(2); 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27756);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testDividedBy_int899() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o743q9lf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testDividedBy_int899",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o743q9lf1(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27757); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27758);Minutes test = Minutes.minutes(12); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27759);assertEquals(6, test.dividedBy(2).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27760);assertEquals(12, test.getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27761);assertEquals(4, test.dividedBy(3).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27762);assertEquals(3, test.dividedBy(4).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27763);assertEquals(2, test.dividedBy(5).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27764);assertEquals(2, test.dividedBy(6).getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27765);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27766);try { 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27767);Minutes.ONE.dividedBy(0); 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27768);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testNegated900() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lvife8lfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testNegated900",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lvife8lfd(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27769); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27770);Minutes test = Minutes.minutes(12); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27771);assertEquals(-12, test.negated().getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27772);assertEquals(12, test.getMinutes()); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27773);try { 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27774);Minutes.MIN_VALUE.negated(); 
         __CLR4_4_1lb8lb8le6rcl91.R.inc(27775);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 


public void testIsGreaterThan901() {__CLR4_4_1lb8lb8le6rcl91.R.globalSliceStart(getClass().getName(),27776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184e6rmlfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb8lb8le6rcl91.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb8lb8le6rcl91.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsGreaterThan901",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184e6rmlfk(){try{__CLR4_4_1lb8lb8le6rcl91.R.inc(27776); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27777);assertEquals(true, Minutes.THREE.isGreaterThan(Minutes.TWO)); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27778);assertEquals(false, Minutes.THREE.isGreaterThan(Minutes.THREE)); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27779);assertEquals(false, Minutes.TWO.isGreaterThan(Minutes.THREE)); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27780);assertEquals(true, Minutes.ONE.isGreaterThan(null)); 
     __CLR4_4_1lb8lb8le6rcl91.R.inc(27781);assertEquals(false, Minutes.minutes(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1lb8lb8le6rcl91.R.flushNeeded();}} 

    

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
