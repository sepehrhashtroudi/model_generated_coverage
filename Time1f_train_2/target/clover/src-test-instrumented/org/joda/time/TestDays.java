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
public class TestDays extends TestCase {static class __CLR4_4_1itpitple6qset8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,24577,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1itpitple6qset8.R.inc(24397);
        __CLR4_4_1itpitple6qset8.R.inc(24398);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1itpitple6qset8.R.inc(24399);
        __CLR4_4_1itpitple6qset8.R.inc(24400);return new TestSuite(TestDays.class);
    }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}}

    public TestDays(String name) {
        super(name);__CLR4_4_1itpitple6qset8.R.inc(24402);try{__CLR4_4_1itpitple6qset8.R.inc(24401);
    }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1itpitple6qset8.R.inc(24403);
    }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1itpitple6qset8.R.inc(24404);
    }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetMethods1229() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jjxk3itx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testGetMethods1229",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jjxk3itx(){try{__CLR4_4_1itpitple6qset8.R.inc(24405); 
     __CLR4_4_1itpitple6qset8.R.inc(24406);Days test = Days.days(20); 
     __CLR4_4_1itpitple6qset8.R.inc(24407);assertEquals(20, test.getDays()); 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_daysBetween_RPartial_LocalDate1230() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xb4otiu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RPartial_LocalDate1230",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xb4otiu0(){try{__CLR4_4_1itpitple6qset8.R.inc(24408); 
     __CLR4_4_1itpitple6qset8.R.inc(24409);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1itpitple6qset8.R.inc(24410);LocalDate end1 = new LocalDate(2006, 6, 12); 
     __CLR4_4_1itpitple6qset8.R.inc(24411);YearMonthDay end2 = new YearMonthDay(2006, 6, 15); 
     __CLR4_4_1itpitple6qset8.R.inc(24412);assertEquals(3, Days.daysBetween(start, end1).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24413);assertEquals(0, Days.daysBetween(start, start).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24414);assertEquals(0, Days.daysBetween(end1, end1).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24415);assertEquals(-3, Days.daysBetween(end1, start).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24416);assertEquals(6, Days.daysBetween(start, end2).getDays()); 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testPlus_int1232() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m3qpvhiu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_int1232",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m3qpvhiu9(){try{__CLR4_4_1itpitple6qset8.R.inc(24417); 
     __CLR4_4_1itpitple6qset8.R.inc(24418);Days test2 = Days.days(2); 
     __CLR4_4_1itpitple6qset8.R.inc(24419);Days result = test2.plus(3); 
     __CLR4_4_1itpitple6qset8.R.inc(24420);assertEquals(2, test2.getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24421);assertEquals(5, result.getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24422);assertEquals(1, Days.ONE.plus(0).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24423);try { 
         __CLR4_4_1itpitple6qset8.R.inc(24424);Days.MAX_VALUE.plus(1); 
         __CLR4_4_1itpitple6qset8.R.inc(24425);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testSerialization1233() throws Exception {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxyg2iiui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testSerialization1233",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxyg2iiui() throws Exception{try{__CLR4_4_1itpitple6qset8.R.inc(24426); 
     __CLR4_4_1itpitple6qset8.R.inc(24427);Days test = Days.SEVEN; 
     __CLR4_4_1itpitple6qset8.R.inc(24428);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1itpitple6qset8.R.inc(24429);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1itpitple6qset8.R.inc(24430);oos.writeObject(test); 
     __CLR4_4_1itpitple6qset8.R.inc(24431);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1itpitple6qset8.R.inc(24432);oos.close(); 
     __CLR4_4_1itpitple6qset8.R.inc(24433);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1itpitple6qset8.R.inc(24434);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1itpitple6qset8.R.inc(24435);Days result = (Days) ois.readObject(); 
     __CLR4_4_1itpitple6qset8.R.inc(24436);ois.close(); 
     __CLR4_4_1itpitple6qset8.R.inc(24437);assertSame(test, result); 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testFactory_days_int1234() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3vz1liuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_days_int1234",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3vz1liuu(){try{__CLR4_4_1itpitple6qset8.R.inc(24438); 
     __CLR4_4_1itpitple6qset8.R.inc(24439);assertSame(Days.ZERO, Days.days(0)); 
     __CLR4_4_1itpitple6qset8.R.inc(24440);assertSame(Days.ONE, Days.days(1)); 
     __CLR4_4_1itpitple6qset8.R.inc(24441);assertSame(Days.TWO, Days.days(2)); 
     __CLR4_4_1itpitple6qset8.R.inc(24442);assertSame(Days.THREE, Days.days(3)); 
     __CLR4_4_1itpitple6qset8.R.inc(24443);assertSame(Days.FOUR, Days.days(4)); 
     __CLR4_4_1itpitple6qset8.R.inc(24444);assertSame(Days.FIVE, Days.days(5)); 
     __CLR4_4_1itpitple6qset8.R.inc(24445);assertSame(Days.SIX, Days.days(6)); 
     __CLR4_4_1itpitple6qset8.R.inc(24446);assertSame(Days.SEVEN, Days.days(7)); 
     __CLR4_4_1itpitple6qset8.R.inc(24447);assertSame(Days.MAX_VALUE, Days.days(Integer.MAX_VALUE)); 
     __CLR4_4_1itpitple6qset8.R.inc(24448);assertSame(Days.MIN_VALUE, Days.days(Integer.MIN_VALUE)); 
     __CLR4_4_1itpitple6qset8.R.inc(24449);assertEquals(-1, Days.days(-1).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24450);assertEquals(8, Days.days(8).getDays()); 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testFactory_daysBetween_RInstant1235() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fzs6miv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RInstant1235",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fzs6miv7(){try{__CLR4_4_1itpitple6qset8.R.inc(24451); 
     __CLR4_4_1itpitple6qset8.R.inc(24452);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1itpitple6qset8.R.inc(24453);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1itpitple6qset8.R.inc(24454);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1itpitple6qset8.R.inc(24455);assertEquals(3, Days.daysBetween(start, end1).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24456);assertEquals(0, Days.daysBetween(start, start).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24457);assertEquals(0, Days.daysBetween(end1, end1).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24458);assertEquals(-3, Days.daysBetween(end1, start).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24459);assertEquals(6, Days.daysBetween(start, end2).getDays()); 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testFactory_daysIn_RInterval1236() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ip0quivg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysIn_RInterval1236",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ip0quivg(){try{__CLR4_4_1itpitple6qset8.R.inc(24460); 
     __CLR4_4_1itpitple6qset8.R.inc(24461);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1itpitple6qset8.R.inc(24462);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1itpitple6qset8.R.inc(24463);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1itpitple6qset8.R.inc(24464);assertEquals(0, Days.daysIn((ReadableInterval) null).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24465);assertEquals(3, Days.daysIn(new Interval(start, end1)).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24466);assertEquals(0, Days.daysIn(new Interval(start, start)).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24467);assertEquals(0, Days.daysIn(new Interval(end1, end1)).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24468);assertEquals(6, Days.daysIn(new Interval(start, end2)).getDays()); 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testFactory_standardDaysIn_RPeriod1237() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3gqaoivp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_standardDaysIn_RPeriod1237",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w3gqaoivp(){try{__CLR4_4_1itpitple6qset8.R.inc(24469); 
     __CLR4_4_1itpitple6qset8.R.inc(24470);assertEquals(0, Days.standardDaysIn((ReadablePeriod) null).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24471);assertEquals(0, Days.standardDaysIn(Period.ZERO).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24472);assertEquals(1, Days.standardDaysIn(new Period(0, 0, 0, 1, 0, 0, 0, 0)).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24473);assertEquals(123, Days.standardDaysIn(Period.days(123)).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24474);assertEquals(-987, Days.standardDaysIn(Period.days(-987)).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24475);assertEquals(1, Days.standardDaysIn(Period.hours(47)).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24476);assertEquals(2, Days.standardDaysIn(Period.hours(48)).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24477);assertEquals(2, Days.standardDaysIn(Period.hours(49)).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24478);assertEquals(14, Days.standardDaysIn(Period.weeks(2)).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24479);try { 
         __CLR4_4_1itpitple6qset8.R.inc(24480);Days.standardDaysIn(Period.months(1)); 
         __CLR4_4_1itpitple6qset8.R.inc(24481);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testFactory_parseDays_String1238() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1witopmiw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_parseDays_String1238",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1witopmiw2(){try{__CLR4_4_1itpitple6qset8.R.inc(24482); 
     __CLR4_4_1itpitple6qset8.R.inc(24483);assertEquals(0, Days.parseDays((String) null).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24484);assertEquals(0, Days.parseDays("P0D").getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24485);assertEquals(1, Days.parseDays("P1D").getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24486);assertEquals(-3, Days.parseDays("P-3D").getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24487);assertEquals(2, Days.parseDays("P0Y0M2D").getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24488);assertEquals(2, Days.parseDays("P2DT0H0M").getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24489);try { 
         __CLR4_4_1itpitple6qset8.R.inc(24490);Days.parseDays("P1Y1D"); 
         __CLR4_4_1itpitple6qset8.R.inc(24491);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1itpitple6qset8.R.inc(24492);try { 
         __CLR4_4_1itpitple6qset8.R.inc(24493);Days.parseDays("P1DT1H"); 
         __CLR4_4_1itpitple6qset8.R.inc(24494);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testToStandardWeeks1239() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dasycdiwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardWeeks1239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dasycdiwf(){try{__CLR4_4_1itpitple6qset8.R.inc(24495); 
     __CLR4_4_1itpitple6qset8.R.inc(24496);Days test = Days.days(14); 
     __CLR4_4_1itpitple6qset8.R.inc(24497);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1itpitple6qset8.R.inc(24498);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testToStandardMinutes1240() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vngkwpiwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardMinutes1240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vngkwpiwj(){try{__CLR4_4_1itpitple6qset8.R.inc(24499); 
     __CLR4_4_1itpitple6qset8.R.inc(24500);Days test = Days.days(2); 
     __CLR4_4_1itpitple6qset8.R.inc(24501);Minutes expected = Minutes.minutes(2 * 24 * 60); 
     __CLR4_4_1itpitple6qset8.R.inc(24502);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1itpitple6qset8.R.inc(24503);try { 
         __CLR4_4_1itpitple6qset8.R.inc(24504);Days.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1itpitple6qset8.R.inc(24505);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testToStandardSeconds1241() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ht3n8aiwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardSeconds1241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ht3n8aiwq(){try{__CLR4_4_1itpitple6qset8.R.inc(24506); 
     __CLR4_4_1itpitple6qset8.R.inc(24507);Days test = Days.days(2); 
     __CLR4_4_1itpitple6qset8.R.inc(24508);Seconds expected = Seconds.seconds(2 * 24 * 60 * 60); 
     __CLR4_4_1itpitple6qset8.R.inc(24509);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1itpitple6qset8.R.inc(24510);try { 
         __CLR4_4_1itpitple6qset8.R.inc(24511);Days.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1itpitple6qset8.R.inc(24512);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testToStandardDuration1242() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198qcakiwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardDuration1242",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198qcakiwx(){try{__CLR4_4_1itpitple6qset8.R.inc(24513); 
     __CLR4_4_1itpitple6qset8.R.inc(24514);Days test = Days.days(20); 
     __CLR4_4_1itpitple6qset8.R.inc(24515);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_DAY); 
     __CLR4_4_1itpitple6qset8.R.inc(24516);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1itpitple6qset8.R.inc(24517);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_DAY); 
     __CLR4_4_1itpitple6qset8.R.inc(24518);assertEquals(expected, Days.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testMinus_Days1243() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15umkhtix3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMinus_Days1243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15umkhtix3(){try{__CLR4_4_1itpitple6qset8.R.inc(24519); 
     __CLR4_4_1itpitple6qset8.R.inc(24520);Days test2 = Days.days(2); 
     __CLR4_4_1itpitple6qset8.R.inc(24521);Days test3 = Days.days(3); 
     __CLR4_4_1itpitple6qset8.R.inc(24522);Days result = test2.minus(test3); 
     __CLR4_4_1itpitple6qset8.R.inc(24523);assertEquals(2, test2.getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24524);assertEquals(3, test3.getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24525);assertEquals(-1, result.getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24526);assertEquals(1, Days.ONE.minus(Days.ZERO).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24527);assertEquals(1, Days.ONE.minus((Days) null).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24528);try { 
         __CLR4_4_1itpitple6qset8.R.inc(24529);Days.MIN_VALUE.minus(Days.ONE); 
         __CLR4_4_1itpitple6qset8.R.inc(24530);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testMultipliedBy_int1244() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmdhzoixf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMultipliedBy_int1244",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmdhzoixf(){try{__CLR4_4_1itpitple6qset8.R.inc(24531); 
     __CLR4_4_1itpitple6qset8.R.inc(24532);Days test = Days.days(2); 
     __CLR4_4_1itpitple6qset8.R.inc(24533);assertEquals(6, test.multipliedBy(3).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24534);assertEquals(2, test.getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24535);assertEquals(-6, test.multipliedBy(-3).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24536);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1itpitple6qset8.R.inc(24537);Days halfMax = Days.days(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1itpitple6qset8.R.inc(24538);try { 
         __CLR4_4_1itpitple6qset8.R.inc(24539);halfMax.multipliedBy(2); 
         __CLR4_4_1itpitple6qset8.R.inc(24540);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testDividedBy_int1245() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ctum1jixp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testDividedBy_int1245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ctum1jixp(){try{__CLR4_4_1itpitple6qset8.R.inc(24541); 
     __CLR4_4_1itpitple6qset8.R.inc(24542);Days test = Days.days(12); 
     __CLR4_4_1itpitple6qset8.R.inc(24543);assertEquals(6, test.dividedBy(2).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24544);assertEquals(12, test.getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24545);assertEquals(4, test.dividedBy(3).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24546);assertEquals(3, test.dividedBy(4).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24547);assertEquals(2, test.dividedBy(5).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24548);assertEquals(2, test.dividedBy(6).getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24549);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1itpitple6qset8.R.inc(24550);try { 
         __CLR4_4_1itpitple6qset8.R.inc(24551);Days.ONE.dividedBy(0); 
         __CLR4_4_1itpitple6qset8.R.inc(24552);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testNegated1246() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sdbu2iiy1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testNegated1246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sdbu2iiy1(){try{__CLR4_4_1itpitple6qset8.R.inc(24553); 
     __CLR4_4_1itpitple6qset8.R.inc(24554);Days test = Days.days(12); 
     __CLR4_4_1itpitple6qset8.R.inc(24555);assertEquals(-12, test.negated().getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24556);assertEquals(12, test.getDays()); 
     __CLR4_4_1itpitple6qset8.R.inc(24557);try { 
         __CLR4_4_1itpitple6qset8.R.inc(24558);Days.MIN_VALUE.negated(); 
         __CLR4_4_1itpitple6qset8.R.inc(24559);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testIsGreaterThan1247() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qhsp6iy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsGreaterThan1247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qhsp6iy8(){try{__CLR4_4_1itpitple6qset8.R.inc(24560); 
     __CLR4_4_1itpitple6qset8.R.inc(24561);assertEquals(true, Days.THREE.isGreaterThan(Days.TWO)); 
     __CLR4_4_1itpitple6qset8.R.inc(24562);assertEquals(false, Days.THREE.isGreaterThan(Days.THREE)); 
     __CLR4_4_1itpitple6qset8.R.inc(24563);assertEquals(false, Days.TWO.isGreaterThan(Days.THREE)); 
     __CLR4_4_1itpitple6qset8.R.inc(24564);assertEquals(true, Days.ONE.isGreaterThan(null)); 
     __CLR4_4_1itpitple6qset8.R.inc(24565);assertEquals(false, Days.days(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testIsLessThan1248() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xe8kv6iye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsLessThan1248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xe8kv6iye(){try{__CLR4_4_1itpitple6qset8.R.inc(24566); 
     __CLR4_4_1itpitple6qset8.R.inc(24567);assertEquals(false, Days.THREE.isLessThan(Days.TWO)); 
     __CLR4_4_1itpitple6qset8.R.inc(24568);assertEquals(false, Days.THREE.isLessThan(Days.THREE)); 
     __CLR4_4_1itpitple6qset8.R.inc(24569);assertEquals(true, Days.TWO.isLessThan(Days.THREE)); 
     __CLR4_4_1itpitple6qset8.R.inc(24570);assertEquals(false, Days.ONE.isLessThan(null)); 
     __CLR4_4_1itpitple6qset8.R.inc(24571);assertEquals(true, Days.days(-1).isLessThan(null)); 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 


public void testToString1249() {__CLR4_4_1itpitple6qset8.R.globalSliceStart(getClass().getName(),24572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w82gfpiyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1itpitple6qset8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1itpitple6qset8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToString1249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w82gfpiyk(){try{__CLR4_4_1itpitple6qset8.R.inc(24572); 
     __CLR4_4_1itpitple6qset8.R.inc(24573);Days test = Days.days(20); 
     __CLR4_4_1itpitple6qset8.R.inc(24574);assertEquals("P20D", test.toString()); 
     __CLR4_4_1itpitple6qset8.R.inc(24575);test = Days.days(-20); 
     __CLR4_4_1itpitple6qset8.R.inc(24576);assertEquals("P-20D", test.toString()); 
 }finally{__CLR4_4_1itpitple6qset8.R.flushNeeded();}} 

    

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
