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
public class TestHours extends TestCase {static class __CLR4_4_1jbyjbyle6qseuq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,25238,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25054);
        __CLR4_4_1jbyjbyle6qseuq.R.inc(25055);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25056);
        __CLR4_4_1jbyjbyle6qseuq.R.inc(25057);return new TestSuite(TestHours.class);
    }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}}

    public TestHours(String name) {
        super(name);__CLR4_4_1jbyjbyle6qseuq.R.inc(25059);try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25058);
    }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25060);
    }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25061);
    }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_standardHoursIn_RPeriod270() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ktczymjc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ktczymjc6(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25062); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25063);assertEquals(0, Hours.standardHoursIn((ReadablePeriod) null).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25064);assertEquals(0, Hours.standardHoursIn(Period.ZERO).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25065);assertEquals(1, Hours.standardHoursIn(new Period(0, 0, 0, 0, 1, 0, 0, 0)).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25066);assertEquals(123, Hours.standardHoursIn(Period.hours(123)).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25067);assertEquals(-987, Hours.standardHoursIn(Period.hours(-987)).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25068);assertEquals(1, Hours.standardHoursIn(Period.minutes(119)).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25069);assertEquals(2, Hours.standardHoursIn(Period.minutes(120)).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25070);assertEquals(2, Hours.standardHoursIn(Period.minutes(121)).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25071);assertEquals(48, Hours.standardHoursIn(Period.days(2)).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25072);try { 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25073);Hours.standardHoursIn(Period.months(1)); 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25074);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testMultipliedBy_int422() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tg5wr5jcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMultipliedBy_int422",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tg5wr5jcj(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25075); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25076);Hours test = Hours.hours(2); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25077);assertEquals(6, test.multipliedBy(3).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25078);assertEquals(2, test.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25079);assertEquals(-6, test.multipliedBy(-3).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25080);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25081);Hours halfMax = Hours.hours(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25082);try { 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25083);halfMax.multipliedBy(2); 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25084);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testToStandardSeconds1066() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqem0rjct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardSeconds1066",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqem0rjct(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25085); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25086);Hours test = Hours.hours(3); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25087);Seconds expected = Seconds.seconds(3 * 60 * 60); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25088);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25089);try { 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25090);Hours.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25091);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testFactory_hours_int1067() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mimibljd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hours_int1067",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mimibljd0(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25092); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25093);assertSame(Hours.ZERO, Hours.hours(0)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25094);assertSame(Hours.ONE, Hours.hours(1)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25095);assertSame(Hours.TWO, Hours.hours(2)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25096);assertSame(Hours.THREE, Hours.hours(3)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25097);assertSame(Hours.FOUR, Hours.hours(4)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25098);assertSame(Hours.FIVE, Hours.hours(5)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25099);assertSame(Hours.SIX, Hours.hours(6)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25100);assertSame(Hours.SEVEN, Hours.hours(7)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25101);assertSame(Hours.EIGHT, Hours.hours(8)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25102);assertSame(Hours.MAX_VALUE, Hours.hours(Integer.MAX_VALUE)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25103);assertSame(Hours.MIN_VALUE, Hours.hours(Integer.MIN_VALUE)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25104);assertEquals(-1, Hours.hours(-1).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25105);assertEquals(9, Hours.hours(9).getHours()); 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testFactory_hoursBetween_RInstant1068() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gwoluyjde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RInstant1068",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gwoluyjde(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25106); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25107);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25108);DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25109);DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25110);assertEquals(3, Hours.hoursBetween(start, end1).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25111);assertEquals(0, Hours.hoursBetween(start, start).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25112);assertEquals(0, Hours.hoursBetween(end1, end1).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25113);assertEquals(-3, Hours.hoursBetween(end1, start).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25114);assertEquals(6, Hours.hoursBetween(start, end2).getHours()); 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testFactory_hoursIn_RInterval1069() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o04ljmjdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursIn_RInterval1069",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o04ljmjdn(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25115); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25116);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25117);DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25118);DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25119);assertEquals(0, Hours.hoursIn((ReadableInterval) null).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25120);assertEquals(3, Hours.hoursIn(new Interval(start, end1)).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25121);assertEquals(0, Hours.hoursIn(new Interval(start, start)).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25122);assertEquals(0, Hours.hoursIn(new Interval(end1, end1)).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25123);assertEquals(6, Hours.hoursIn(new Interval(start, end2)).getHours()); 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testFactory_parseHours_String1071() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekjhpvjdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_parseHours_String1071",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekjhpvjdw(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25124); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25125);assertEquals(0, Hours.parseHours((String) null).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25126);assertEquals(0, Hours.parseHours("PT0H").getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25127);assertEquals(1, Hours.parseHours("PT1H").getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25128);assertEquals(-3, Hours.parseHours("PT-3H").getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25129);assertEquals(2, Hours.parseHours("P0Y0M0DT2H").getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25130);assertEquals(2, Hours.parseHours("PT2H0M").getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25131);try { 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25132);Hours.parseHours("P1Y1D"); 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25133);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25134);try { 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25135);Hours.parseHours("P1DT1H"); 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25136);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testSerialization1072() throws Exception {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1px2j27je9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testSerialization1072",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1px2j27je9() throws Exception{try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25137); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25138);Hours test = Hours.SEVEN; 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25139);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25140);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25141);oos.writeObject(test); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25142);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25143);oos.close(); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25144);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25145);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25146);Hours result = (Hours) ois.readObject(); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25147);ois.close(); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25148);assertSame(test, result); 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testGetFieldType1073() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11p3v5ejel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetFieldType1073",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11p3v5ejel(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25149); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25150);Hours test = Hours.hours(20); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25151);assertEquals(DurationFieldType.hours(), test.getFieldType()); 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testToStandardWeeks1074() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mk85mgjeo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardWeeks1074",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mk85mgjeo(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25152); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25153);Hours test = Hours.hours(24 * 7 * 2); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25154);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25155);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testToStandardMinutes1075() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qhlqfjes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardMinutes1075",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qhlqfjes(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25156); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25157);Hours test = Hours.hours(3); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25158);Minutes expected = Minutes.minutes(3 * 60); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25159);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25160);try { 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25161);Hours.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25162);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testGetMethods1076() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15hs1fxjez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetMethods1076",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15hs1fxjez(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25163); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25164);Hours test = Hours.hours(20); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25165);assertEquals(20, test.getHours()); 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testPlus_int1077() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ortzz2jf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_int1077",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ortzz2jf2(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25166); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25167);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25168);Hours result = test2.plus(3); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25169);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25170);assertEquals(5, result.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25171);assertEquals(1, Hours.ONE.plus(0).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25172);try { 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25173);Hours.MAX_VALUE.plus(1); 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25174);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testPlus_Hours1078() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4o20zjfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_Hours1078",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4o20zjfb(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25175); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25176);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25177);Hours test3 = Hours.hours(3); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25178);Hours result = test2.plus(test3); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25179);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25180);assertEquals(3, test3.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25181);assertEquals(5, result.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25182);assertEquals(1, Hours.ONE.plus(Hours.ZERO).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25183);assertEquals(1, Hours.ONE.plus((Hours) null).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25184);try { 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25185);Hours.MAX_VALUE.plus(Hours.ONE); 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25186);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testMinus_int1079() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bsonqjfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_int1079",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bsonqjfn(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25187); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25188);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25189);Hours result = test2.minus(3); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25190);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25191);assertEquals(-1, result.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25192);assertEquals(1, Hours.ONE.minus(0).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25193);try { 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25194);Hours.MIN_VALUE.minus(1); 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25195);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testMinus_Hours1080() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iog12kjfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_Hours1080",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iog12kjfw(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25196); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25197);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25198);Hours test3 = Hours.hours(3); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25199);Hours result = test2.minus(test3); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25200);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25201);assertEquals(3, test3.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25202);assertEquals(-1, result.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25203);assertEquals(1, Hours.ONE.minus(Hours.ZERO).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25204);assertEquals(1, Hours.ONE.minus((Hours) null).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25205);try { 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25206);Hours.MIN_VALUE.minus(Hours.ONE); 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25207);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testDividedBy_int1081() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qa6gprjg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testDividedBy_int1081",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qa6gprjg8(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25208); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25209);Hours test = Hours.hours(12); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25210);assertEquals(6, test.dividedBy(2).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25211);assertEquals(12, test.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25212);assertEquals(4, test.dividedBy(3).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25213);assertEquals(3, test.dividedBy(4).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25214);assertEquals(2, test.dividedBy(5).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25215);assertEquals(2, test.dividedBy(6).getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25216);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25217);try { 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25218);Hours.ONE.dividedBy(0); 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25219);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testNegated1082() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jr55cjgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testNegated1082",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jr55cjgk(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25220); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25221);Hours test = Hours.hours(12); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25222);assertEquals(-12, test.negated().getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25223);assertEquals(12, test.getHours()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25224);try { 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25225);Hours.MIN_VALUE.negated(); 
         __CLR4_4_1jbyjbyle6qseuq.R.inc(25226);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testIsLessThan1083() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rud55jgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsLessThan1083",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rud55jgr(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25227); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25228);assertEquals(false, Hours.THREE.isLessThan(Hours.TWO)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25229);assertEquals(false, Hours.THREE.isLessThan(Hours.THREE)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25230);assertEquals(true, Hours.TWO.isLessThan(Hours.THREE)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25231);assertEquals(false, Hours.ONE.isLessThan(null)); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25232);assertEquals(true, Hours.hours(-1).isLessThan(null)); 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 


public void testToString1084() {__CLR4_4_1jbyjbyle6qseuq.R.globalSliceStart(getClass().getName(),25233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mynj4jgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbyjbyle6qseuq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbyjbyle6qseuq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToString1084",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mynj4jgx(){try{__CLR4_4_1jbyjbyle6qseuq.R.inc(25233); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25234);Hours test = Hours.hours(20); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25235);assertEquals("PT20H", test.toString()); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25236);test = Hours.hours(-20); 
     __CLR4_4_1jbyjbyle6qseuq.R.inc(25237);assertEquals("PT-20H", test.toString()); 
 }finally{__CLR4_4_1jbyjbyle6qseuq.R.flushNeeded();}} 

    

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
