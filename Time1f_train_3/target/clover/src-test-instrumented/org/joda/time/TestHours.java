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
public class TestHours extends TestCase {static class __CLR4_4_1jd0jd0le6rckuf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,25259,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25092);
        __CLR4_4_1jd0jd0le6rckuf.R.inc(25093);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25094);
        __CLR4_4_1jd0jd0le6rckuf.R.inc(25095);return new TestSuite(TestHours.class);
    }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}}

    public TestHours(String name) {
        super(name);__CLR4_4_1jd0jd0le6rckuf.R.inc(25097);try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25096);
    }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25098);
    }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25099);
    }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_standardHoursIn_RPeriod303() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhu1lljd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod303",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhu1lljd8(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25100); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25101);assertEquals(0, Hours.standardHoursIn((ReadablePeriod) null).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25102);assertEquals(0, Hours.standardHoursIn(Period.ZERO).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25103);assertEquals(1, Hours.standardHoursIn(new Period(0, 0, 0, 0, 1, 0, 0, 0)).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25104);assertEquals(123, Hours.standardHoursIn(Period.hours(123)).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25105);assertEquals(-987, Hours.standardHoursIn(Period.hours(-987)).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25106);assertEquals(1, Hours.standardHoursIn(Period.minutes(119)).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25107);assertEquals(2, Hours.standardHoursIn(Period.minutes(120)).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25108);assertEquals(2, Hours.standardHoursIn(Period.minutes(121)).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25109);assertEquals(48, Hours.standardHoursIn(Period.days(2)).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25110);try { 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25111);Hours.standardHoursIn(Period.months(1)); 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25112);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testMultipliedBy_int457() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14xakupjdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMultipliedBy_int457",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25113,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14xakupjdl(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25113); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25114);Hours test = Hours.hours(2); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25115);assertEquals(6, test.multipliedBy(3).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25116);assertEquals(2, test.getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25117);assertEquals(-6, test.multipliedBy(-3).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25118);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25119);Hours halfMax = Hours.hours(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25120);try { 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25121);halfMax.multipliedBy(2); 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25122);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testToStandardSeconds1068() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x8ejlpjdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardSeconds1068",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x8ejlpjdv(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25123); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25124);Hours test = Hours.hours(3); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25125);Seconds expected = Seconds.seconds(3 * 60 * 60); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25126);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25127);try { 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25128);Hours.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25129);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testFactory_hours_int1069() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g0mkqnje2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hours_int1069",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g0mkqnje2(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25130); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25131);assertSame(Hours.ZERO, Hours.hours(0)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25132);assertSame(Hours.ONE, Hours.hours(1)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25133);assertSame(Hours.TWO, Hours.hours(2)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25134);assertSame(Hours.THREE, Hours.hours(3)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25135);assertSame(Hours.FOUR, Hours.hours(4)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25136);assertSame(Hours.FIVE, Hours.hours(5)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25137);assertSame(Hours.SIX, Hours.hours(6)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25138);assertSame(Hours.SEVEN, Hours.hours(7)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25139);assertSame(Hours.EIGHT, Hours.hours(8)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25140);assertSame(Hours.MAX_VALUE, Hours.hours(Integer.MAX_VALUE)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25141);assertSame(Hours.MIN_VALUE, Hours.hours(Integer.MIN_VALUE)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25142);assertEquals(-1, Hours.hours(-1).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25143);assertEquals(9, Hours.hours(9).getHours()); 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testFactory_hoursBetween_RPartial1070() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iszw31jeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RPartial1070",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iszw31jeg(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25144); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25145);LocalTime start = new LocalTime(12, 0); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25146);LocalTime end1 = new LocalTime(15, 0); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25147);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(18, 0); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25148);assertEquals(3, Hours.hoursBetween(start, end1).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25149);assertEquals(0, Hours.hoursBetween(start, start).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25150);assertEquals(0, Hours.hoursBetween(end1, end1).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25151);assertEquals(-3, Hours.hoursBetween(end1, start).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25152);assertEquals(6, Hours.hoursBetween(start, end2).getHours()); 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testFactory_parseHours_String1071() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekjhpvjep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_parseHours_String1071",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekjhpvjep(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25153); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25154);assertEquals(0, Hours.parseHours((String) null).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25155);assertEquals(0, Hours.parseHours("PT0H").getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25156);assertEquals(1, Hours.parseHours("PT1H").getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25157);assertEquals(-3, Hours.parseHours("PT-3H").getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25158);assertEquals(2, Hours.parseHours("P0Y0M0DT2H").getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25159);assertEquals(2, Hours.parseHours("PT2H0M").getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25160);try { 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25161);Hours.parseHours("P1Y1D"); 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25162);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25163);try { 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25164);Hours.parseHours("P1DT1H"); 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25165);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testSerialization1072() throws Exception {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1px2j27jf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testSerialization1072",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1px2j27jf2() throws Exception{try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25166); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25167);Hours test = Hours.SEVEN; 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25168);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25169);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25170);oos.writeObject(test); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25171);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25172);oos.close(); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25173);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25174);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25175);Hours result = (Hours) ois.readObject(); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25176);ois.close(); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25177);assertSame(test, result); 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testGetFieldType1073() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11p3v5ejfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetFieldType1073",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11p3v5ejfe(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25178); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25179);Hours test = Hours.hours(20); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25180);assertEquals(DurationFieldType.hours(), test.getFieldType()); 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testToStandardWeeks1074() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mk85mgjfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardWeeks1074",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mk85mgjfh(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25181); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25182);Hours test = Hours.hours(24 * 7 * 2); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25183);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25184);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testToStandardDays1075() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oub1krjfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDays1075",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oub1krjfl(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25185); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25186);Hours test = Hours.hours(24 * 2); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25187);Days expected = Days.days(2); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25188);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testToStandardDuration1076() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5fk8zjfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDuration1076",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5fk8zjfp(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25189); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25190);Hours test = Hours.hours(20); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25191);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_HOUR); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25192);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25193);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_HOUR); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25194);assertEquals(expected, Hours.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testGetMethods1077() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_128s2ngjfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetMethods1077",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_128s2ngjfv(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25195); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25196);Hours test = Hours.hours(20); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25197);assertEquals(20, test.getHours()); 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testPlus_int1078() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1liu16ljfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_int1078",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1liu16ljfy(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25198); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25199);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25200);Hours result = test2.plus(3); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25201);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25202);assertEquals(5, result.getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25203);assertEquals(1, Hours.ONE.plus(0).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25204);try { 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25205);Hours.MAX_VALUE.plus(1); 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25206);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testPlus_Hours1079() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wng15ojg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_Hours1079",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wng15ojg7(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25207); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25208);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25209);Hours test3 = Hours.hours(3); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25210);Hours result = test2.plus(test3); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25211);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25212);assertEquals(3, test3.getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25213);assertEquals(5, result.getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25214);assertEquals(1, Hours.ONE.plus(Hours.ZERO).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25215);assertEquals(1, Hours.ONE.plus((Hours) null).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25216);try { 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25217);Hours.MAX_VALUE.plus(Hours.ONE); 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25218);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testMinus_int1080() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12snw30jgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_int1080",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12snw30jgj(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25219); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25220);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25221);Hours result = test2.minus(3); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25222);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25223);assertEquals(-1, result.getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25224);assertEquals(1, Hours.ONE.minus(0).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25225);try { 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25226);Hours.MIN_VALUE.minus(1); 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25227);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testDividedBy_int1081() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qa6gprjgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testDividedBy_int1081",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qa6gprjgs(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25228); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25229);Hours test = Hours.hours(12); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25230);assertEquals(6, test.dividedBy(2).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25231);assertEquals(12, test.getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25232);assertEquals(4, test.dividedBy(3).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25233);assertEquals(3, test.dividedBy(4).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25234);assertEquals(2, test.dividedBy(5).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25235);assertEquals(2, test.dividedBy(6).getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25236);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25237);try { 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25238);Hours.ONE.dividedBy(0); 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25239);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testNegated1082() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jr55cjh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testNegated1082",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jr55cjh4(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25240); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25241);Hours test = Hours.hours(12); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25242);assertEquals(-12, test.negated().getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25243);assertEquals(12, test.getHours()); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25244);try { 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25245);Hours.MIN_VALUE.negated(); 
         __CLR4_4_1jd0jd0le6rckuf.R.inc(25246);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testIsGreaterThan1083() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6l6iojhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsGreaterThan1083",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6l6iojhb(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25247); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25248);assertEquals(true, Hours.THREE.isGreaterThan(Hours.TWO)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25249);assertEquals(false, Hours.THREE.isGreaterThan(Hours.THREE)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25250);assertEquals(false, Hours.TWO.isGreaterThan(Hours.THREE)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25251);assertEquals(true, Hours.ONE.isGreaterThan(null)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25252);assertEquals(false, Hours.hours(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 


public void testIsLessThan1084() {__CLR4_4_1jd0jd0le6rckuf.R.globalSliceStart(getClass().getName(),25253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11h5lncjhh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jd0jd0le6rckuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jd0jd0le6rckuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsLessThan1084",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11h5lncjhh(){try{__CLR4_4_1jd0jd0le6rckuf.R.inc(25253); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25254);assertEquals(false, Hours.THREE.isLessThan(Hours.TWO)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25255);assertEquals(false, Hours.THREE.isLessThan(Hours.THREE)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25256);assertEquals(true, Hours.TWO.isLessThan(Hours.THREE)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25257);assertEquals(false, Hours.ONE.isLessThan(null)); 
     __CLR4_4_1jd0jd0le6rckuf.R.inc(25258);assertEquals(true, Hours.hours(-1).isLessThan(null)); 
 }finally{__CLR4_4_1jd0jd0le6rckuf.R.flushNeeded();}} 

    

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
