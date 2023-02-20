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
public class TestHours extends TestCase {static class __CLR4_4_1jd2jd2le6rjcdk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,25251,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25094);
        __CLR4_4_1jd2jd2le6rjcdk.R.inc(25095);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25096);
        __CLR4_4_1jd2jd2le6rjcdk.R.inc(25097);return new TestSuite(TestHours.class);
    }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}}

    public TestHours(String name) {
        super(name);__CLR4_4_1jd2jd2le6rjcdk.R.inc(25099);try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25098);
    }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25100);
    }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25101);
    }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_standardHoursIn_RPeriod301() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qzu40njda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod301",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qzu40njda(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25102); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25103);assertEquals(0, Hours.standardHoursIn((ReadablePeriod) null).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25104);assertEquals(0, Hours.standardHoursIn(Period.ZERO).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25105);assertEquals(1, Hours.standardHoursIn(new Period(0, 0, 0, 0, 1, 0, 0, 0)).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25106);assertEquals(123, Hours.standardHoursIn(Period.hours(123)).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25107);assertEquals(-987, Hours.standardHoursIn(Period.hours(-987)).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25108);assertEquals(1, Hours.standardHoursIn(Period.minutes(119)).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25109);assertEquals(2, Hours.standardHoursIn(Period.minutes(120)).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25110);assertEquals(2, Hours.standardHoursIn(Period.minutes(121)).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25111);assertEquals(48, Hours.standardHoursIn(Period.days(2)).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25112);try { 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25113);Hours.standardHoursIn(Period.months(1)); 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25114);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testMultipliedBy_int458() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186ajn6jdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMultipliedBy_int458",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186ajn6jdn(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25115); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25116);Hours test = Hours.hours(2); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25117);assertEquals(6, test.multipliedBy(3).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25118);assertEquals(2, test.getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25119);assertEquals(-6, test.multipliedBy(-3).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25120);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25121);Hours halfMax = Hours.hours(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25122);try { 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25123);halfMax.multipliedBy(2); 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25124);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testToStandardSeconds1097() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx8tifjdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardSeconds1097",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx8tifjdx(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25125); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25126);Hours test = Hours.hours(3); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25127);Seconds expected = Seconds.seconds(3 * 60 * 60); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25128);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25129);try { 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25130);Hours.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25131);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testFactory_hoursBetween_RInstant1098() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_117s1sjje4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RInstant1098",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_117s1sjje4(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25132); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25133);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25134);DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25135);DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25136);assertEquals(3, Hours.hoursBetween(start, end1).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25137);assertEquals(0, Hours.hoursBetween(start, start).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25138);assertEquals(0, Hours.hoursBetween(end1, end1).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25139);assertEquals(-3, Hours.hoursBetween(end1, start).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25140);assertEquals(6, Hours.hoursBetween(start, end2).getHours()); 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testFactory_hoursBetween_RPartial1099() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ykipnwjed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RPartial1099",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ykipnwjed(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25141); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25142);LocalTime start = new LocalTime(12, 0); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25143);LocalTime end1 = new LocalTime(15, 0); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25144);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(18, 0); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25145);assertEquals(3, Hours.hoursBetween(start, end1).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25146);assertEquals(0, Hours.hoursBetween(start, start).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25147);assertEquals(0, Hours.hoursBetween(end1, end1).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25148);assertEquals(-3, Hours.hoursBetween(end1, start).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25149);assertEquals(6, Hours.hoursBetween(start, end2).getHours()); 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testFactory_hoursIn_RInterval1100() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kls8usjem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursIn_RInterval1100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kls8usjem(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25150); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25151);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25152);DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25153);DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25154);assertEquals(0, Hours.hoursIn((ReadableInterval) null).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25155);assertEquals(3, Hours.hoursIn(new Interval(start, end1)).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25156);assertEquals(0, Hours.hoursIn(new Interval(start, start)).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25157);assertEquals(0, Hours.hoursIn(new Interval(end1, end1)).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25158);assertEquals(6, Hours.hoursIn(new Interval(start, end2)).getHours()); 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testSerialization1102() throws Exception {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sujobrjev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testSerialization1102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sujobrjev() throws Exception{try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25159); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25160);Hours test = Hours.SEVEN; 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25161);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25162);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25163);oos.writeObject(test); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25164);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25165);oos.close(); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25166);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25167);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25168);Hours result = (Hours) ois.readObject(); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25169);ois.close(); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25170);assertSame(test, result); 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testGetFieldType1103() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ml0eyjf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetFieldType1103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ml0eyjf7(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25171); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25172);Hours test = Hours.hours(20); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25173);assertEquals(DurationFieldType.hours(), test.getFieldType()); 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testToStandardWeeks1104() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phpaw0jfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardWeeks1104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phpaw0jfa(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25174); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25175);Hours test = Hours.hours(24 * 7 * 2); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25176);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25177);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testToStandardDays1105() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwtwb7jfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDays1105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwtwb7jfe(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25178); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25179);Hours test = Hours.hours(24 * 2); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25180);Days expected = Days.days(2); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25181);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testToStandardMinutes1106() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15fzibmjfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardMinutes1106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15fzibmjfi(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25182); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25183);Hours test = Hours.hours(3); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25184);Minutes expected = Minutes.minutes(3 * 60); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25185);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25186);try { 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25187);Hours.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25188);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testToStandardDuration1107() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbwob0jfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDuration1107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbwob0jfp(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25189); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25190);Hours test = Hours.hours(20); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25191);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_HOUR); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25192);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25193);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_HOUR); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25194);assertEquals(expected, Hours.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testGetMethods1108() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xp1eljfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetMethods1108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xp1eljfv(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25195); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25196);Hours test = Hours.hours(20); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25197);assertEquals(20, test.getHours()); 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testPlus_int1109() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fccx4kjfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_int1109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fccx4kjfy(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25198); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25199);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25200);Hours result = test2.plus(3); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25201);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25202);assertEquals(5, result.getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25203);assertEquals(1, Hours.ONE.plus(0).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25204);try { 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25205);Hours.MAX_VALUE.plus(1); 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25206);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testMinus_int1110() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15q51ckjg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_int1110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15q51ckjg7(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25207); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25208);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25209);Hours result = test2.minus(3); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25210);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25211);assertEquals(-1, result.getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25212);assertEquals(1, Hours.ONE.minus(0).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25213);try { 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25214);Hours.MIN_VALUE.minus(1); 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25215);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testMinus_Hours1111() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oux54ljgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_Hours1111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oux54ljgg(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25216); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25217);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25218);Hours test3 = Hours.hours(3); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25219);Hours result = test2.minus(test3); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25220);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25221);assertEquals(3, test3.getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25222);assertEquals(-1, result.getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25223);assertEquals(1, Hours.ONE.minus(Hours.ZERO).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25224);assertEquals(1, Hours.ONE.minus((Hours) null).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25225);try { 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25226);Hours.MIN_VALUE.minus(Hours.ONE); 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25227);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testDividedBy_int1112() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgnkrsjgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testDividedBy_int1112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgnkrsjgs(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25228); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25229);Hours test = Hours.hours(12); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25230);assertEquals(6, test.dividedBy(2).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25231);assertEquals(12, test.getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25232);assertEquals(4, test.dividedBy(3).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25233);assertEquals(3, test.dividedBy(4).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25234);assertEquals(2, test.dividedBy(5).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25235);assertEquals(2, test.dividedBy(6).getHours()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25236);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25237);try { 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25238);Hours.ONE.dividedBy(0); 
         __CLR4_4_1jd2jd2le6rjcdk.R.inc(25239);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testIsGreaterThan1113() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r94194jh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsGreaterThan1113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r94194jh4(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25240); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25241);assertEquals(true, Hours.THREE.isGreaterThan(Hours.TWO)); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25242);assertEquals(false, Hours.THREE.isGreaterThan(Hours.THREE)); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25243);assertEquals(false, Hours.TWO.isGreaterThan(Hours.THREE)); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25244);assertEquals(true, Hours.ONE.isGreaterThan(null)); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25245);assertEquals(false, Hours.hours(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 


public void testToString1114() {__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceStart(getClass().getName(),25246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16kfssojha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd2jd2le6rjcdk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd2jd2le6rjcdk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToString1114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16kfssojha(){try{__CLR4_4_1jd2jd2le6rjcdk.R.inc(25246); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25247);Hours test = Hours.hours(20); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25248);assertEquals("PT20H", test.toString()); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25249);test = Hours.hours(-20); 
     __CLR4_4_1jd2jd2le6rjcdk.R.inc(25250);assertEquals("PT-20H", test.toString()); 
 }finally{__CLR4_4_1jd2jd2le6rjcdk.R.flushNeeded();}} 

    

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
