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
public class TestDays extends TestCase {static class __CLR4_4_1iwxiwxle6rjcbl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,24702,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24513);
        __CLR4_4_1iwxiwxle6rjcbl.R.inc(24514);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24515);
        __CLR4_4_1iwxiwxle6rjcbl.R.inc(24516);return new TestSuite(TestDays.class);
    }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}}

    public TestDays(String name) {
        super(name);__CLR4_4_1iwxiwxle6rjcbl.R.inc(24518);try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24517);
    }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24519);
    }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24520);
    }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetMethods1243() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xe62s5ix5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testGetMethods1243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xe62s5ix5(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24521); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24522);Days test = Days.days(20); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24523);assertEquals(20, test.getDays()); 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_daysBetween_RPartial_LocalDate1244() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ysjn0mix8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RPartial_LocalDate1244",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ysjn0mix8(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24524); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24525);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24526);LocalDate end1 = new LocalDate(2006, 6, 12); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24527);YearMonthDay end2 = new YearMonthDay(2006, 6, 15); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24528);assertEquals(3, Days.daysBetween(start, end1).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24529);assertEquals(0, Days.daysBetween(start, start).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24530);assertEquals(0, Days.daysBetween(end1, end1).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24531);assertEquals(-3, Days.daysBetween(end1, start).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24532);assertEquals(6, Days.daysBetween(start, end2).getDays()); 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testPlus_int1246() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1km41tyixh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_int1246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1km41tyixh(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24533); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24534);Days test2 = Days.days(2); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24535);Days result = test2.plus(3); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24536);assertEquals(2, test2.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24537);assertEquals(5, result.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24538);assertEquals(1, Days.ONE.plus(0).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24539);try { 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24540);Days.MAX_VALUE.plus(1); 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24541);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testSerialization1247() throws Exception {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrwbmxixq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testSerialization1247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrwbmxixq() throws Exception{try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24542); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24543);Days test = Days.SEVEN; 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24544);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24545);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24546);oos.writeObject(test); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24547);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24548);oos.close(); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24549);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24550);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24551);Days result = (Days) ois.readObject(); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24552);ois.close(); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24553);assertSame(test, result); 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testFactory_days_int1248() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1flysnuiy2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_days_int1248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1flysnuiy2(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24554); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24555);assertSame(Days.ZERO, Days.days(0)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24556);assertSame(Days.ONE, Days.days(1)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24557);assertSame(Days.TWO, Days.days(2)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24558);assertSame(Days.THREE, Days.days(3)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24559);assertSame(Days.FOUR, Days.days(4)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24560);assertSame(Days.FIVE, Days.days(5)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24561);assertSame(Days.SIX, Days.days(6)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24562);assertSame(Days.SEVEN, Days.days(7)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24563);assertSame(Days.MAX_VALUE, Days.days(Integer.MAX_VALUE)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24564);assertSame(Days.MIN_VALUE, Days.days(Integer.MIN_VALUE)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24565);assertEquals(-1, Days.days(-1).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24566);assertEquals(8, Days.days(8).getDays()); 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testFactory_daysBetween_RInstant1249() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nv9i33iyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RInstant1249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nv9i33iyf(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24567); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24568);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24569);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24570);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24571);assertEquals(3, Days.daysBetween(start, end1).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24572);assertEquals(0, Days.daysBetween(start, start).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24573);assertEquals(0, Days.daysBetween(end1, end1).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24574);assertEquals(-3, Days.daysBetween(end1, start).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24575);assertEquals(6, Days.daysBetween(start, end2).getDays()); 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testFactory_standardDaysIn_RPeriod1250() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l9b93iyo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_standardDaysIn_RPeriod1250",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l9b93iyo(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24576); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24577);assertEquals(0, Days.standardDaysIn((ReadablePeriod) null).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24578);assertEquals(0, Days.standardDaysIn(Period.ZERO).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24579);assertEquals(1, Days.standardDaysIn(new Period(0, 0, 0, 1, 0, 0, 0, 0)).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24580);assertEquals(123, Days.standardDaysIn(Period.days(123)).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24581);assertEquals(-987, Days.standardDaysIn(Period.days(-987)).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24582);assertEquals(1, Days.standardDaysIn(Period.hours(47)).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24583);assertEquals(2, Days.standardDaysIn(Period.hours(48)).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24584);assertEquals(2, Days.standardDaysIn(Period.hours(49)).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24585);assertEquals(14, Days.standardDaysIn(Period.weeks(2)).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24586);try { 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24587);Days.standardDaysIn(Period.months(1)); 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24588);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testFactory_parseDays_String1251() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11tkbpriz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_parseDays_String1251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11tkbpriz1(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24589); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24590);assertEquals(0, Days.parseDays((String) null).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24591);assertEquals(0, Days.parseDays("P0D").getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24592);assertEquals(1, Days.parseDays("P1D").getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24593);assertEquals(-3, Days.parseDays("P-3D").getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24594);assertEquals(2, Days.parseDays("P0Y0M2D").getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24595);assertEquals(2, Days.parseDays("P2DT0H0M").getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24596);try { 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24597);Days.parseDays("P1Y1D"); 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24598);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24599);try { 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24600);Days.parseDays("P1DT1H"); 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24601);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testToStandardWeeks1252() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ndx37eize();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardWeeks1252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ndx37eize(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24602); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24603);Days test = Days.days(14); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24604);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24605);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testToStandardHours1253() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9f88bizi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardHours1253",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9f88bizi(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24606); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24607);Days test = Days.days(2); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24608);Hours expected = Hours.hours(2 * 24); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24609);assertEquals(expected, test.toStandardHours()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24610);try { 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24611);Days.MAX_VALUE.toStandardHours(); 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24612);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testToStandardMinutes1254() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13c7an0izp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardMinutes1254",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13c7an0izp(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24613); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24614);Days test = Days.days(2); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24615);Minutes expected = Minutes.minutes(2 * 24 * 60); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24616);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24617);try { 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24618);Days.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24619);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testToStandardSeconds1255() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ai5n1fizw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardSeconds1255",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ai5n1fizw(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24620); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24621);Days test = Days.days(2); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24622);Seconds expected = Seconds.seconds(2 * 24 * 60 * 60); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24623);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24624);try { 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24625);Days.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24626);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testToStandardDuration1256() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xh4fevj03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardDuration1256",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xh4fevj03(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24627); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24628);Days test = Days.days(20); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24629);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_DAY); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24630);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24631);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_DAY); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24632);assertEquals(expected, Days.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testConstants1257() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlp87tj09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testConstants1257",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlp87tj09(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24633); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24634);assertEquals(0, Days.ZERO.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24635);assertEquals(1, Days.ONE.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24636);assertEquals(2, Days.TWO.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24637);assertEquals(3, Days.THREE.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24638);assertEquals(4, Days.FOUR.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24639);assertEquals(5, Days.FIVE.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24640);assertEquals(6, Days.SIX.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24641);assertEquals(7, Days.SEVEN.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24642);assertEquals(Integer.MAX_VALUE, Days.MAX_VALUE.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24643);assertEquals(Integer.MIN_VALUE, Days.MIN_VALUE.getDays()); 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testPlus_Days1258() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9gorvj0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_Days1258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9gorvj0k(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24644); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24645);Days test2 = Days.days(2); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24646);Days test3 = Days.days(3); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24647);Days result = test2.plus(test3); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24648);assertEquals(2, test2.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24649);assertEquals(3, test3.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24650);assertEquals(5, result.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24651);assertEquals(1, Days.ONE.plus(Days.ZERO).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24652);assertEquals(1, Days.ONE.plus((Days) null).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24653);try { 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24654);Days.MAX_VALUE.plus(Days.ONE); 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24655);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testMultipliedBy_int1259() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18k46igj0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMultipliedBy_int1259",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18k46igj0w(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24656); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24657);Days test = Days.days(2); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24658);assertEquals(6, test.multipliedBy(3).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24659);assertEquals(2, test.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24660);assertEquals(-6, test.multipliedBy(-3).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24661);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24662);Days halfMax = Days.days(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24663);try { 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24664);halfMax.multipliedBy(2); 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24665);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testDividedBy_int1260() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ucvd36j16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testDividedBy_int1260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ucvd36j16(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24666); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24667);Days test = Days.days(12); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24668);assertEquals(6, test.dividedBy(2).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24669);assertEquals(12, test.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24670);assertEquals(4, test.dividedBy(3).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24671);assertEquals(3, test.dividedBy(4).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24672);assertEquals(2, test.dividedBy(5).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24673);assertEquals(2, test.dividedBy(6).getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24674);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24675);try { 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24676);Days.ONE.dividedBy(0); 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24677);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testNegated1261() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ixr83j1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testNegated1261",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ixr83j1i(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24678); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24679);Days test = Days.days(12); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24680);assertEquals(-12, test.negated().getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24681);assertEquals(12, test.getDays()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24682);try { 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24683);Days.MIN_VALUE.negated(); 
         __CLR4_4_1iwxiwxle6rjcbl.R.inc(24684);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testIsGreaterThan1262() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q3wa59j1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsGreaterThan1262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q3wa59j1p(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24685); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24686);assertEquals(true, Days.THREE.isGreaterThan(Days.TWO)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24687);assertEquals(false, Days.THREE.isGreaterThan(Days.THREE)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24688);assertEquals(false, Days.TWO.isGreaterThan(Days.THREE)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24689);assertEquals(true, Days.ONE.isGreaterThan(null)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24690);assertEquals(false, Days.days(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testIsLessThan1263() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15jui0rj1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsLessThan1263",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15jui0rj1v(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24691); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24692);assertEquals(false, Days.THREE.isLessThan(Days.TWO)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24693);assertEquals(false, Days.THREE.isLessThan(Days.THREE)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24694);assertEquals(true, Days.TWO.isLessThan(Days.THREE)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24695);assertEquals(false, Days.ONE.isLessThan(null)); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24696);assertEquals(true, Days.days(-1).isLessThan(null)); 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 


public void testToString1264() {__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceStart(getClass().getName(),24697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aynip0j21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwxiwxle6rjcbl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwxiwxle6rjcbl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToString1264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aynip0j21(){try{__CLR4_4_1iwxiwxle6rjcbl.R.inc(24697); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24698);Days test = Days.days(20); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24699);assertEquals("P20D", test.toString()); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24700);test = Days.days(-20); 
     __CLR4_4_1iwxiwxle6rjcbl.R.inc(24701);assertEquals("P-20D", test.toString()); 
 }finally{__CLR4_4_1iwxiwxle6rjcbl.R.flushNeeded();}} 

    

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
