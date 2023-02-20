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
public class TestHours extends TestCase {static class __CLR4_4_1jc8jc8le6qe9hg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,25231,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25064);
        __CLR4_4_1jc8jc8le6qe9hg.R.inc(25065);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25066);
        __CLR4_4_1jc8jc8le6qe9hg.R.inc(25067);return new TestSuite(TestHours.class);
    }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}}

    public TestHours(String name) {
        super(name);__CLR4_4_1jc8jc8le6qe9hg.R.inc(25069);try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25068);
    }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25070);
    }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25071);
    }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testMultipliedBy_int449() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iake3wjcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMultipliedBy_int449",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iake3wjcg(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25072); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25073);Hours test = Hours.hours(2); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25074);assertEquals(6, test.multipliedBy(3).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25075);assertEquals(2, test.getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25076);assertEquals(-6, test.multipliedBy(-3).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25077);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25078);Hours halfMax = Hours.hours(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25079);try { 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25080);halfMax.multipliedBy(2); 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25081);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testFactory_hours_int1077() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1778e7yjcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hours_int1077",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1778e7yjcq(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25082); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25083);assertSame(Hours.ZERO, Hours.hours(0)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25084);assertSame(Hours.ONE, Hours.hours(1)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25085);assertSame(Hours.TWO, Hours.hours(2)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25086);assertSame(Hours.THREE, Hours.hours(3)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25087);assertSame(Hours.FOUR, Hours.hours(4)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25088);assertSame(Hours.FIVE, Hours.hours(5)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25089);assertSame(Hours.SIX, Hours.hours(6)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25090);assertSame(Hours.SEVEN, Hours.hours(7)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25091);assertSame(Hours.EIGHT, Hours.hours(8)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25092);assertSame(Hours.MAX_VALUE, Hours.hours(Integer.MAX_VALUE)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25093);assertSame(Hours.MIN_VALUE, Hours.hours(Integer.MIN_VALUE)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25094);assertEquals(-1, Hours.hours(-1).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25095);assertEquals(9, Hours.hours(9).getHours()); 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testFactory_hoursBetween_RInstant1078() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ct6aoljd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RInstant1078",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ct6aoljd4(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25096); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25097);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25098);DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25099);DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25100);assertEquals(3, Hours.hoursBetween(start, end1).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25101);assertEquals(0, Hours.hoursBetween(start, start).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25102);assertEquals(0, Hours.hoursBetween(end1, end1).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25103);assertEquals(-3, Hours.hoursBetween(end1, start).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25104);assertEquals(6, Hours.hoursBetween(start, end2).getHours()); 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testFactory_hoursBetween_RPartial1079() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mz4grujdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RPartial1079",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mz4grujdd(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25105); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25106);LocalTime start = new LocalTime(12, 0); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25107);LocalTime end1 = new LocalTime(15, 0); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25108);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(18, 0); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25109);assertEquals(3, Hours.hoursBetween(start, end1).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25110);assertEquals(0, Hours.hoursBetween(start, start).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25111);assertEquals(0, Hours.hoursBetween(end1, end1).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25112);assertEquals(-3, Hours.hoursBetween(end1, start).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25113);assertEquals(6, Hours.hoursBetween(start, end2).getHours()); 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testFactory_hoursIn_RInterval1080() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166lif7jdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursIn_RInterval1080",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166lif7jdm(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25114); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25115);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25116);DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25117);DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25118);assertEquals(0, Hours.hoursIn((ReadableInterval) null).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25119);assertEquals(3, Hours.hoursIn(new Interval(start, end1)).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25120);assertEquals(0, Hours.hoursIn(new Interval(start, start)).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25121);assertEquals(0, Hours.hoursIn(new Interval(end1, end1)).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25122);assertEquals(6, Hours.hoursIn(new Interval(start, end2)).getHours()); 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testFactory_parseHours_String1082() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iebdm5jdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_parseHours_String1082",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iebdm5jdv(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25123); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25124);assertEquals(0, Hours.parseHours((String) null).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25125);assertEquals(0, Hours.parseHours("PT0H").getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25126);assertEquals(1, Hours.parseHours("PT1H").getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25127);assertEquals(-3, Hours.parseHours("PT-3H").getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25128);assertEquals(2, Hours.parseHours("P0Y0M0DT2H").getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25129);assertEquals(2, Hours.parseHours("PT2H0M").getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25130);try { 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25131);Hours.parseHours("P1Y1D"); 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25132);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25133);try { 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25134);Hours.parseHours("P1DT1H"); 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25135);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testSerialization1083() throws Exception {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c56nkxje8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testSerialization1083",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c56nkxje8() throws Exception{try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25136); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25137);Hours test = Hours.SEVEN; 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25138);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25139);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25140);oos.writeObject(test); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25141);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25142);oos.close(); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25143);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25144);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25145);Hours result = (Hours) ois.readObject(); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25146);ois.close(); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25147);assertSame(test, result); 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testToStandardDays1084() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mjw6bjek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDays1084",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mjw6bjek(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25148); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25149);Hours test = Hours.hours(24 * 2); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25150);Days expected = Days.days(2); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25151);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testToStandardMinutes1085() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szdat4jeo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardMinutes1085",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szdat4jeo(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25152); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25153);Hours test = Hours.hours(3); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25154);Minutes expected = Minutes.minutes(3 * 60); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25155);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25156);try { 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25157);Hours.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25158);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testToStandardDuration1086() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5tl6mjev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDuration1086",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5tl6mjev(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25159); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25160);Hours test = Hours.hours(20); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25161);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_HOUR); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25162);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25163);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_HOUR); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25164);assertEquals(expected, Hours.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testPlus_int1087() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14y0wkhjf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_int1087",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14y0wkhjf1(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25165); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25166);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25167);Hours result = test2.plus(3); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25168);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25169);assertEquals(5, result.getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25170);assertEquals(1, Hours.ONE.plus(0).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25171);try { 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25172);Hours.MAX_VALUE.plus(1); 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25173);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testPlus_Hours1088() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166l3emjfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_Hours1088",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166l3emjfa(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25174); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25175);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25176);Hours test3 = Hours.hours(3); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25177);Hours result = test2.plus(test3); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25178);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25179);assertEquals(3, test3.getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25180);assertEquals(5, result.getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25181);assertEquals(1, Hours.ONE.plus(Hours.ZERO).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25182);assertEquals(1, Hours.ONE.plus((Hours) null).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25183);try { 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25184);Hours.MAX_VALUE.plus(Hours.ONE); 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25185);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testMinus_int1089() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1nl79jfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_int1089",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1nl79jfm(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25186); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25187);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25188);Hours result = test2.minus(3); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25189);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25190);assertEquals(-1, result.getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25191);assertEquals(1, Hours.ONE.minus(0).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25192);try { 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25193);Hours.MIN_VALUE.minus(1); 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25194);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testMinus_Hours1090() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mmt4d1jfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_Hours1090",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mmt4d1jfv(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25195); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25196);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25197);Hours test3 = Hours.hours(3); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25198);Hours result = test2.minus(test3); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25199);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25200);assertEquals(3, test3.getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25201);assertEquals(-1, result.getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25202);assertEquals(1, Hours.ONE.minus(Hours.ZERO).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25203);assertEquals(1, Hours.ONE.minus((Hours) null).getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25204);try { 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25205);Hours.MIN_VALUE.minus(Hours.ONE); 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25206);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testNegated1091() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx3slqjg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testNegated1091",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx3slqjg7(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25207); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25208);Hours test = Hours.hours(12); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25209);assertEquals(-12, test.negated().getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25210);assertEquals(12, test.getHours()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25211);try { 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25212);Hours.MIN_VALUE.negated(); 
         __CLR4_4_1jc8jc8le6qe9hg.R.inc(25213);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testIsGreaterThan1092() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13pq8rmjge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsGreaterThan1092",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13pq8rmjge(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25214); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25215);assertEquals(true, Hours.THREE.isGreaterThan(Hours.TWO)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25216);assertEquals(false, Hours.THREE.isGreaterThan(Hours.THREE)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25217);assertEquals(false, Hours.TWO.isGreaterThan(Hours.THREE)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25218);assertEquals(true, Hours.ONE.isGreaterThan(null)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25219);assertEquals(false, Hours.hours(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testIsLessThan1093() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ry0jeejgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsLessThan1093",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ry0jeejgk(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25220); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25221);assertEquals(false, Hours.THREE.isLessThan(Hours.TWO)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25222);assertEquals(false, Hours.THREE.isLessThan(Hours.THREE)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25223);assertEquals(true, Hours.TWO.isLessThan(Hours.THREE)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25224);assertEquals(false, Hours.ONE.isLessThan(null)); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25225);assertEquals(true, Hours.hours(-1).isLessThan(null)); 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 


public void testToString1094() {__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceStart(getClass().getName(),25226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xctk2njgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc8jc8le6qe9hg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc8jc8le6qe9hg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToString1094",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xctk2njgq(){try{__CLR4_4_1jc8jc8le6qe9hg.R.inc(25226); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25227);Hours test = Hours.hours(20); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25228);assertEquals("PT20H", test.toString()); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25229);test = Hours.hours(-20); 
     __CLR4_4_1jc8jc8le6qe9hg.R.inc(25230);assertEquals("PT-20H", test.toString()); 
 }finally{__CLR4_4_1jc8jc8le6qe9hg.R.flushNeeded();}} 

    

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
