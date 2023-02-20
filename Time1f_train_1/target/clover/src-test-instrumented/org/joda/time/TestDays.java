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
 * This class is a Junit unit test for Days.
 *
 * @author Stephen Colebourne
 */
public class TestDays extends TestCase {static class __CLR4_4_1iueiuele6qe9fc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,24590,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1iueiuele6qe9fc.R.inc(24422);
        __CLR4_4_1iueiuele6qe9fc.R.inc(24423);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iueiuele6qe9fc.R.inc(24424);
        __CLR4_4_1iueiuele6qe9fc.R.inc(24425);return new TestSuite(TestDays.class);
    }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}}

    public TestDays(String name) {
        super(name);__CLR4_4_1iueiuele6qe9fc.R.inc(24427);try{__CLR4_4_1iueiuele6qe9fc.R.inc(24426);
    }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iueiuele6qe9fc.R.inc(24428);
    }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iueiuele6qe9fc.R.inc(24429);
    }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetMethods1235() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a6b3tkium();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testGetMethods1235",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a6b3tkium(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24430); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24431);Days test = Days.days(20); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24432);assertEquals(20, test.getDays()); 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testSerialization1236() throws Exception {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6yjp3iup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testSerialization1236",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6yjp3iup() throws Exception{try{__CLR4_4_1iueiuele6qe9fc.R.inc(24433); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24434);Days test = Days.SEVEN; 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24435);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24436);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24437);oos.writeObject(test); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24438);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24439);oos.close(); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24440);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24441);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24442);Days result = (Days) ois.readObject(); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24443);ois.close(); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24444);assertSame(test, result); 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testFactory_days_int1237() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hcw2o6iv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_days_int1237",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hcw2o6iv1(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24445); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24446);assertSame(Days.ZERO, Days.days(0)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24447);assertSame(Days.ONE, Days.days(1)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24448);assertSame(Days.TWO, Days.days(2)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24449);assertSame(Days.THREE, Days.days(3)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24450);assertSame(Days.FOUR, Days.days(4)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24451);assertSame(Days.FIVE, Days.days(5)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24452);assertSame(Days.SIX, Days.days(6)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24453);assertSame(Days.SEVEN, Days.days(7)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24454);assertSame(Days.MAX_VALUE, Days.days(Integer.MAX_VALUE)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24455);assertSame(Days.MIN_VALUE, Days.days(Integer.MIN_VALUE)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24456);assertEquals(-1, Days.days(-1).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24457);assertEquals(8, Days.days(8).getDays()); 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testFactory_daysBetween_RInstant1238() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6zok1ive();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RInstant1238",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6zok1ive(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24458); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24459);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24460);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24461);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24462);assertEquals(3, Days.daysBetween(start, end1).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24463);assertEquals(0, Days.daysBetween(start, start).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24464);assertEquals(0, Days.daysBetween(end1, end1).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24465);assertEquals(-3, Days.daysBetween(end1, start).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24466);assertEquals(6, Days.daysBetween(start, end2).getDays()); 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testFactory_daysIn_RInterval1239() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9ox49ivn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysIn_RInterval1239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9ox49ivn(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24467); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24468);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24469);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24470);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24471);assertEquals(0, Days.daysIn((ReadableInterval) null).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24472);assertEquals(3, Days.daysIn(new Interval(start, end1)).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24473);assertEquals(0, Days.daysIn(new Interval(start, start)).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24474);assertEquals(0, Days.daysIn(new Interval(end1, end1)).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24475);assertEquals(6, Days.daysIn(new Interval(start, end2)).getDays()); 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testFactory_standardDaysIn_RPeriod1240() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p4llagivw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_standardDaysIn_RPeriod1240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p4llagivw(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24476); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24477);assertEquals(0, Days.standardDaysIn((ReadablePeriod) null).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24478);assertEquals(0, Days.standardDaysIn(Period.ZERO).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24479);assertEquals(1, Days.standardDaysIn(new Period(0, 0, 0, 1, 0, 0, 0, 0)).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24480);assertEquals(123, Days.standardDaysIn(Period.days(123)).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24481);assertEquals(-987, Days.standardDaysIn(Period.days(-987)).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24482);assertEquals(1, Days.standardDaysIn(Period.hours(47)).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24483);assertEquals(2, Days.standardDaysIn(Period.hours(48)).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24484);assertEquals(2, Days.standardDaysIn(Period.hours(49)).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24485);assertEquals(14, Days.standardDaysIn(Period.weeks(2)).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24486);try { 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24487);Days.standardDaysIn(Period.months(1)); 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24488);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testFactory_parseDays_String1241() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjf89aiw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_parseDays_String1241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjf89aiw9(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24489); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24490);assertEquals(0, Days.parseDays((String) null).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24491);assertEquals(0, Days.parseDays("P0D").getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24492);assertEquals(1, Days.parseDays("P1D").getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24493);assertEquals(-3, Days.parseDays("P-3D").getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24494);assertEquals(2, Days.parseDays("P0Y0M2D").getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24495);assertEquals(2, Days.parseDays("P2DT0H0M").getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24496);try { 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24497);Days.parseDays("P1Y1D"); 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24498);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24499);try { 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24500);Days.parseDays("P1DT1H"); 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24501);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testToStandardWeeks1242() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16bxtc5iwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardWeeks1242",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16bxtc5iwm(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24502); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24503);Days test = Days.days(14); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24504);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24505);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testToStandardHours1243() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggfob8iwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardHours1243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggfob8iwq(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24506); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24507);Days test = Days.days(2); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24508);Hours expected = Hours.hours(2 * 24); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24509);assertEquals(expected, test.toStandardHours()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24510);try { 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24511);Days.MAX_VALUE.toStandardHours(); 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24512);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testToStandardMinutes1244() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdnlwjiwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardMinutes1244",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdnlwjiwx(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24513); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24514);Days test = Days.days(2); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24515);Minutes expected = Minutes.minutes(2 * 24 * 60); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24516);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24517);try { 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24518);Days.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24519);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testToStandardDuration1245() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9k2vix4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardDuration1245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9k2vix4(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24520); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24521);Days test = Days.days(20); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24522);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_DAY); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24523);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24524);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_DAY); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24525);assertEquals(expected, Days.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testConstants1246() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18gjyfbixa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testConstants1246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18gjyfbixa(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24526); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24527);assertEquals(0, Days.ZERO.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24528);assertEquals(1, Days.ONE.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24529);assertEquals(2, Days.TWO.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24530);assertEquals(3, Days.THREE.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24531);assertEquals(4, Days.FOUR.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24532);assertEquals(5, Days.FIVE.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24533);assertEquals(6, Days.SIX.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24534);assertEquals(7, Days.SEVEN.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24535);assertEquals(Integer.MAX_VALUE, Days.MAX_VALUE.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24536);assertEquals(Integer.MIN_VALUE, Days.MIN_VALUE.getDays()); 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testPlus_Days1247() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17sshv9ixl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_Days1247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17sshv9ixl(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24537); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24538);Days test2 = Days.days(2); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24539);Days test3 = Days.days(3); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24540);Days result = test2.plus(test3); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24541);assertEquals(2, test2.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24542);assertEquals(3, test3.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24543);assertEquals(5, result.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24544);assertEquals(1, Days.ONE.plus(Days.ZERO).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24545);assertEquals(1, Days.ONE.plus((Days) null).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24546);try { 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24547);Days.MAX_VALUE.plus(Days.ONE); 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24548);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testMinus_Days1248() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aed9gkixx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMinus_Days1248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aed9gkixx(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24549); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24550);Days test2 = Days.days(2); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24551);Days test3 = Days.days(3); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24552);Days result = test2.minus(test3); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24553);assertEquals(2, test2.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24554);assertEquals(3, test3.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24555);assertEquals(-1, result.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24556);assertEquals(1, Days.ONE.minus(Days.ZERO).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24557);assertEquals(1, Days.ONE.minus((Days) null).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24558);try { 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24559);Days.MIN_VALUE.minus(Days.ONE); 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24560);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testMultipliedBy_int1249() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l5qq13iy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMultipliedBy_int1249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l5qq13iy9(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24561); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24562);Days test = Days.days(2); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24563);assertEquals(6, test.multipliedBy(3).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24564);assertEquals(2, test.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24565);assertEquals(-6, test.multipliedBy(-3).getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24566);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24567);Days halfMax = Days.days(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24568);try { 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24569);halfMax.multipliedBy(2); 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24570);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testNegated1250() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wfx43xiyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testNegated1250",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wfx43xiyj(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24571); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24572);Days test = Days.days(12); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24573);assertEquals(-12, test.negated().getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24574);assertEquals(12, test.getDays()); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24575);try { 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24576);Days.MIN_VALUE.negated(); 
         __CLR4_4_1iueiuele6qe9fc.R.inc(24577);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testIsGreaterThan1251() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bycwhviyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsGreaterThan1251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bycwhviyq(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24578); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24579);assertEquals(true, Days.THREE.isGreaterThan(Days.TWO)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24580);assertEquals(false, Days.THREE.isGreaterThan(Days.THREE)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24581);assertEquals(false, Days.TWO.isGreaterThan(Days.THREE)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24582);assertEquals(true, Days.ONE.isGreaterThan(null)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24583);assertEquals(false, Days.days(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 


public void testIsLessThan1252() {__CLR4_4_1iueiuele6qe9fc.R.globalSliceStart(getClass().getName(),24584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rf0db9iyw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iueiuele6qe9fc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iueiuele6qe9fc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsLessThan1252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rf0db9iyw(){try{__CLR4_4_1iueiuele6qe9fc.R.inc(24584); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24585);assertEquals(false, Days.THREE.isLessThan(Days.TWO)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24586);assertEquals(false, Days.THREE.isLessThan(Days.THREE)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24587);assertEquals(true, Days.TWO.isLessThan(Days.THREE)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24588);assertEquals(false, Days.ONE.isLessThan(null)); 
     __CLR4_4_1iueiuele6qe9fc.R.inc(24589);assertEquals(true, Days.days(-1).isLessThan(null)); 
 }finally{__CLR4_4_1iueiuele6qe9fc.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

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
