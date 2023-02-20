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
public class TestDays extends TestCase {static class __CLR4_4_1iufiufle6rckqj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,24584,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1iufiufle6rckqj.R.inc(24423);
        __CLR4_4_1iufiufle6rckqj.R.inc(24424);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iufiufle6rckqj.R.inc(24425);
        __CLR4_4_1iufiufle6rckqj.R.inc(24426);return new TestSuite(TestDays.class);
    }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}}

    public TestDays(String name) {
        super(name);__CLR4_4_1iufiufle6rckqj.R.inc(24428);try{__CLR4_4_1iufiufle6rckqj.R.inc(24427);
    }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iufiufle6rckqj.R.inc(24429);
    }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iufiufle6rckqj.R.inc(24430);
    }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetMethods1235() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a6b3tkiun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testGetMethods1235",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a6b3tkiun(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24431); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24432);Days test = Days.days(20); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24433);assertEquals(20, test.getDays()); 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_daysBetween_RPartial_LocalDate1236() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkoo21iuq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RPartial_LocalDate1236",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkoo21iuq(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24434); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24435);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24436);LocalDate end1 = new LocalDate(2006, 6, 12); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24437);YearMonthDay end2 = new YearMonthDay(2006, 6, 15); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24438);assertEquals(3, Days.daysBetween(start, end1).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24439);assertEquals(0, Days.daysBetween(start, start).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24440);assertEquals(0, Days.daysBetween(end1, end1).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24441);assertEquals(-3, Days.daysBetween(end1, start).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24442);assertEquals(6, Days.daysBetween(start, end2).getDays()); 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testPlus_int1238() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12lqx4niuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_int1238",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12lqx4niuz(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24443); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24444);Days test2 = Days.days(2); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24445);Days result = test2.plus(3); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24446);assertEquals(2, test2.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24447);assertEquals(5, result.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24448);assertEquals(1, Days.ONE.plus(0).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24449);try { 
         __CLR4_4_1iufiufle6rckqj.R.inc(24450);Days.MAX_VALUE.plus(1); 
         __CLR4_4_1iufiufle6rckqj.R.inc(24451);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testSerialization1239() throws Exception {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fynboiv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testSerialization1239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fynboiv8() throws Exception{try{__CLR4_4_1iufiufle6rckqj.R.inc(24452); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24453);Days test = Days.SEVEN; 
     __CLR4_4_1iufiufle6rckqj.R.inc(24454);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24455);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24456);oos.writeObject(test); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24457);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24458);oos.close(); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24459);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24460);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24461);Days result = (Days) ois.readObject(); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24462);ois.close(); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24463);assertSame(test, result); 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testFactory_days_int1240() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ae0xnyivk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_days_int1240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ae0xnyivk(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24464); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24465);assertSame(Days.ZERO, Days.days(0)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24466);assertSame(Days.ONE, Days.days(1)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24467);assertSame(Days.TWO, Days.days(2)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24468);assertSame(Days.THREE, Days.days(3)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24469);assertSame(Days.FOUR, Days.days(4)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24470);assertSame(Days.FIVE, Days.days(5)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24471);assertSame(Days.SIX, Days.days(6)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24472);assertSame(Days.SEVEN, Days.days(7)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24473);assertSame(Days.MAX_VALUE, Days.days(Integer.MAX_VALUE)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24474);assertSame(Days.MIN_VALUE, Days.days(Integer.MIN_VALUE)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24475);assertEquals(-1, Days.days(-1).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24476);assertEquals(8, Days.days(8).getDays()); 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testFactory_daysBetween_RInstant1241() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l5utk9ivx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RInstant1241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l5utk9ivx(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24477); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24478);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24479);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24480);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24481);assertEquals(3, Days.daysBetween(start, end1).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24482);assertEquals(0, Days.daysBetween(start, start).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24483);assertEquals(0, Days.daysBetween(end1, end1).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24484);assertEquals(-3, Days.daysBetween(end1, start).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24485);assertEquals(6, Days.daysBetween(start, end2).getDays()); 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testFactory_daysIn_RInterval1242() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8k24hiw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysIn_RInterval1242",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8k24hiw6(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24486); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24487);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24488);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24489);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24490);assertEquals(0, Days.daysIn((ReadableInterval) null).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24491);assertEquals(3, Days.daysIn(new Interval(start, end1)).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24492);assertEquals(0, Days.daysIn(new Interval(start, start)).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24493);assertEquals(0, Days.daysIn(new Interval(end1, end1)).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24494);assertEquals(6, Days.daysIn(new Interval(start, end2)).getDays()); 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testToStandardWeeks1243() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_132xujoiwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardWeeks1243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_132xujoiwf(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24495); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24496);Days test = Days.days(14); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24497);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24498);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testToStandardHours1244() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d7fpiriwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardHours1244",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d7fpiriwj(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24499); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24500);Days test = Days.days(2); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24501);Hours expected = Hours.hours(2 * 24); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24502);assertEquals(expected, test.toStandardHours()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24503);try { 
         __CLR4_4_1iufiufle6rckqj.R.inc(24504);Days.MAX_VALUE.toStandardHours(); 
         __CLR4_4_1iufiufle6rckqj.R.inc(24505);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testToStandardMinutes1245() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4nn42iwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardMinutes1245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4nn42iwq(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24506); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24507);Days test = Days.days(2); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24508);Minutes expected = Minutes.minutes(2 * 24 * 60); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24509);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24510);try { 
         __CLR4_4_1iufiufle6rckqj.R.inc(24511);Days.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1iufiufle6rckqj.R.inc(24512);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testToStandardSeconds1246() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y23h6niwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardSeconds1246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y23h6niwx(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24513); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24514);Days test = Days.days(2); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24515);Seconds expected = Seconds.seconds(2 * 24 * 60 * 60); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24516);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24517);try { 
         __CLR4_4_1iufiufle6rckqj.R.inc(24518);Days.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1iufiufle6rckqj.R.inc(24519);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testConstants1247() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bpjx7six4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testConstants1247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bpjx7six4(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24520); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24521);assertEquals(0, Days.ZERO.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24522);assertEquals(1, Days.ONE.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24523);assertEquals(2, Days.TWO.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24524);assertEquals(3, Days.THREE.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24525);assertEquals(4, Days.FOUR.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24526);assertEquals(5, Days.FIVE.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24527);assertEquals(6, Days.SIX.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24528);assertEquals(7, Days.SEVEN.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24529);assertEquals(Integer.MAX_VALUE, Days.MAX_VALUE.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24530);assertEquals(Integer.MIN_VALUE, Days.MIN_VALUE.getDays()); 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testPlus_Days1248() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1sgnqixf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_Days1248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1sgnqixf(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24531); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24532);Days test2 = Days.days(2); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24533);Days test3 = Days.days(3); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24534);Days result = test2.plus(test3); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24535);assertEquals(2, test2.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24536);assertEquals(3, test3.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24537);assertEquals(5, result.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24538);assertEquals(1, Days.ONE.plus(Days.ZERO).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24539);assertEquals(1, Days.ONE.plus((Days) null).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24540);try { 
         __CLR4_4_1iufiufle6rckqj.R.inc(24541);Days.MAX_VALUE.plus(Days.ONE); 
         __CLR4_4_1iufiufle6rckqj.R.inc(24542);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testMinus_Days1249() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dnd891ixr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMinus_Days1249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dnd891ixr(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24543); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24544);Days test2 = Days.days(2); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24545);Days test3 = Days.days(3); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24546);Days result = test2.minus(test3); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24547);assertEquals(2, test2.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24548);assertEquals(3, test3.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24549);assertEquals(-1, result.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24550);assertEquals(1, Days.ONE.minus(Days.ZERO).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24551);assertEquals(1, Days.ONE.minus((Days) null).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24552);try { 
         __CLR4_4_1iufiufle6rckqj.R.inc(24553);Days.MIN_VALUE.minus(Days.ONE); 
         __CLR4_4_1iufiufle6rckqj.R.inc(24554);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testDividedBy_int1250() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0gjniy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testDividedBy_int1250",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0gjniy3(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24555); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24556);Days test = Days.days(12); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24557);assertEquals(6, test.dividedBy(2).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24558);assertEquals(12, test.getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24559);assertEquals(4, test.dividedBy(3).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24560);assertEquals(3, test.dividedBy(4).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24561);assertEquals(2, test.dividedBy(5).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24562);assertEquals(2, test.dividedBy(6).getDays()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24563);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24564);try { 
         __CLR4_4_1iufiufle6rckqj.R.inc(24565);Days.ONE.dividedBy(0); 
         __CLR4_4_1iufiufle6rckqj.R.inc(24566);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testIsGreaterThan1251() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bycwhviyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsGreaterThan1251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bycwhviyf(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24567); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24568);assertEquals(true, Days.THREE.isGreaterThan(Days.TWO)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24569);assertEquals(false, Days.THREE.isGreaterThan(Days.THREE)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24570);assertEquals(false, Days.TWO.isGreaterThan(Days.THREE)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24571);assertEquals(true, Days.ONE.isGreaterThan(null)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24572);assertEquals(false, Days.days(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testIsLessThan1252() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rf0db9iyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsLessThan1252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rf0db9iyl(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24573); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24574);assertEquals(false, Days.THREE.isLessThan(Days.TWO)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24575);assertEquals(false, Days.THREE.isLessThan(Days.THREE)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24576);assertEquals(true, Days.TWO.isLessThan(Days.THREE)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24577);assertEquals(false, Days.ONE.isLessThan(null)); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24578);assertEquals(true, Days.days(-1).isLessThan(null)); 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 


public void testToString1253() {__CLR4_4_1iufiufle6rckqj.R.globalSliceStart(getClass().getName(),24579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m07cn0iyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iufiufle6rckqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iufiufle6rckqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToString1253",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m07cn0iyr(){try{__CLR4_4_1iufiufle6rckqj.R.inc(24579); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24580);Days test = Days.days(20); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24581);assertEquals("P20D", test.toString()); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24582);test = Days.days(-20); 
     __CLR4_4_1iufiufle6rckqj.R.inc(24583);assertEquals("P-20D", test.toString()); 
 }finally{__CLR4_4_1iufiufle6rckqj.R.flushNeeded();}} 

    

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
