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
 * This class is a Junit unit test for Seconds.
 *
 * @author Stephen Colebourne
 */
public class TestSeconds extends TestCase {static class __CLR4_4_1o32o32le6qsfa0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,31367,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1o32o32le6qsfa0.R.inc(31214);
        __CLR4_4_1o32o32le6qsfa0.R.inc(31215);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1o32o32le6qsfa0.R.inc(31216);
        __CLR4_4_1o32o32le6qsfa0.R.inc(31217);return new TestSuite(TestSeconds.class);
    }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}}

    public TestSeconds(String name) {
        super(name);__CLR4_4_1o32o32le6qsfa0.R.inc(31219);try{__CLR4_4_1o32o32le6qsfa0.R.inc(31218);
    }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1o32o32le6qsfa0.R.inc(31220);
    }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1o32o32le6qsfa0.R.inc(31221);
    }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSerialization480() throws Exception {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ml7rfo3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testSerialization480",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ml7rfo3a() throws Exception{try{__CLR4_4_1o32o32le6qsfa0.R.inc(31222); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31223);Seconds test = Seconds.THREE; 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31224);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31225);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31226);oos.writeObject(test); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31227);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31228);oos.close(); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31229);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31230);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31231);Seconds result = (Seconds) ois.readObject(); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31232);ois.close(); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31233);assertSame(test, result); 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testFactory_secondsBetween_RInstant481() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15xn9reo3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RInstant481",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15xn9reo3m(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31234); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31235);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31236);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31237);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31238);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31239);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31240);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31241);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31242);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testFactory_standardSecondsIn_RPeriod482() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqc8wvo3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_standardSecondsIn_RPeriod482",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqc8wvo3v(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31243); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31244);assertEquals(0, Seconds.standardSecondsIn((ReadablePeriod) null).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31245);assertEquals(0, Seconds.standardSecondsIn(Period.ZERO).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31246);assertEquals(1, Seconds.standardSecondsIn(new Period(0, 0, 0, 0, 0, 0, 1, 0)).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31247);assertEquals(123, Seconds.standardSecondsIn(Period.seconds(123)).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31248);assertEquals(-987, Seconds.standardSecondsIn(Period.seconds(-987)).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31249);assertEquals(2 * 24 * 60 * 60, Seconds.standardSecondsIn(Period.days(2)).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31250);try { 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31251);Seconds.standardSecondsIn(Period.months(1)); 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31252);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testFactory_seconds_int483() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c356ao45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_seconds_int483",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c356ao45(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31253); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31254);assertSame(Seconds.ZERO, Seconds.seconds(0)); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31255);assertSame(Seconds.ONE, Seconds.seconds(1)); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31256);assertSame(Seconds.TWO, Seconds.seconds(2)); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31257);assertSame(Seconds.THREE, Seconds.seconds(3)); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31258);assertSame(Seconds.MAX_VALUE, Seconds.seconds(Integer.MAX_VALUE)); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31259);assertSame(Seconds.MIN_VALUE, Seconds.seconds(Integer.MIN_VALUE)); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31260);assertEquals(-1, Seconds.seconds(-1).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31261);assertEquals(4, Seconds.seconds(4).getSeconds()); 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testToStandardMinutes484() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12dudxao4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardMinutes484",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12dudxao4e(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31262); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31263);Seconds test = Seconds.seconds(60 * 2); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31264);Minutes expected = Minutes.minutes(2); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31265);assertEquals(expected, test.toStandardMinutes()); 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testFactory_secondsBetween_RPartial485() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xwnyeo4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RPartial485",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xwnyeo4i(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31266); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31267);LocalTime start = new LocalTime(12, 0, 3); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31268);LocalTime end1 = new LocalTime(12, 0, 6); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31269);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 0, 9); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31270);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31271);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31272);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31273);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31274);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testFactory_secondsIn_RInterval486() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1it4rl0o4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsIn_RInterval486",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1it4rl0o4r(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31275); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31276);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31277);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31278);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31279);assertEquals(0, Seconds.secondsIn((ReadableInterval) null).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31280);assertEquals(3, Seconds.secondsIn(new Interval(start, end1)).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31281);assertEquals(0, Seconds.secondsIn(new Interval(start, start)).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31282);assertEquals(0, Seconds.secondsIn(new Interval(end1, end1)).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31283);assertEquals(6, Seconds.secondsIn(new Interval(start, end2)).getSeconds()); 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testFactory_parseSeconds_String487() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrqon7o50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_parseSeconds_String487",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrqon7o50(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31284); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31285);assertEquals(0, Seconds.parseSeconds((String) null).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31286);assertEquals(0, Seconds.parseSeconds("PT0S").getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31287);assertEquals(1, Seconds.parseSeconds("PT1S").getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31288);assertEquals(-3, Seconds.parseSeconds("PT-3S").getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31289);assertEquals(2, Seconds.parseSeconds("P0Y0M0DT2S").getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31290);assertEquals(2, Seconds.parseSeconds("PT0H2S").getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31291);try { 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31292);Seconds.parseSeconds("P1Y1D"); 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31293);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31294);try { 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31295);Seconds.parseSeconds("P1DT1S"); 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31296);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testToStandardDays489() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12y96zpo5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDays489",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12y96zpo5d(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31297); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31298);Seconds test = Seconds.seconds(60 * 60 * 24 * 2); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31299);Days expected = Days.days(2); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31300);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testToStandardHours490() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nx9k3xo5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardHours490",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nx9k3xo5h(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31301); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31302);Seconds test = Seconds.seconds(60 * 60 * 2); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31303);Hours expected = Hours.hours(2); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31304);assertEquals(expected, test.toStandardHours()); 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testToStandardDuration491() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w29bfvo5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDuration491",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w29bfvo5l(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31305); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31306);Seconds test = Seconds.seconds(20); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31307);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_SECOND); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31308);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31309);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_SECOND); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31310);assertEquals(expected, Seconds.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testPlus_Seconds492() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ocnlko5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_Seconds492",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ocnlko5r(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31311); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31312);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31313);Seconds test3 = Seconds.seconds(3); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31314);Seconds result = test2.plus(test3); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31315);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31316);assertEquals(3, test3.getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31317);assertEquals(5, result.getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31318);assertEquals(1, Seconds.ONE.plus(Seconds.ZERO).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31319);assertEquals(1, Seconds.ONE.plus((Seconds) null).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31320);try { 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31321);Seconds.MAX_VALUE.plus(Seconds.ONE); 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31322);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testMinus_int493() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6i1lzo63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_int493",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6i1lzo63(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31323); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31324);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31325);Seconds result = test2.minus(3); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31326);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31327);assertEquals(-1, result.getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31328);assertEquals(1, Seconds.ONE.minus(0).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31329);try { 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31330);Seconds.MIN_VALUE.minus(1); 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31331);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testMultipliedBy_int494() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0htauo6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMultipliedBy_int494",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0htauo6c(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31332); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31333);Seconds test = Seconds.seconds(2); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31334);assertEquals(6, test.multipliedBy(3).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31335);assertEquals(2, test.getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31336);assertEquals(-6, test.multipliedBy(-3).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31337);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31338);Seconds halfMax = Seconds.seconds(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31339);try { 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31340);halfMax.multipliedBy(2); 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31341);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testDividedBy_int495() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1snp7fto6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testDividedBy_int495",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1snp7fto6m(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31342); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31343);Seconds test = Seconds.seconds(12); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31344);assertEquals(6, test.dividedBy(2).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31345);assertEquals(12, test.getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31346);assertEquals(4, test.dividedBy(3).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31347);assertEquals(3, test.dividedBy(4).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31348);assertEquals(2, test.dividedBy(5).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31349);assertEquals(2, test.dividedBy(6).getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31350);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31351);try { 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31352);Seconds.ONE.dividedBy(0); 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31353);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testNegated496() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ze1lfso6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testNegated496",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ze1lfso6y(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31354); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31355);Seconds test = Seconds.seconds(12); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31356);assertEquals(-12, test.negated().getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31357);assertEquals(12, test.getSeconds()); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31358);try { 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31359);Seconds.MIN_VALUE.negated(); 
         __CLR4_4_1o32o32le6qsfa0.R.inc(31360);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 


public void testIsGreaterThan497() {__CLR4_4_1o32o32le6qsfa0.R.globalSliceStart(getClass().getName(),31361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmxct6o75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o32o32le6qsfa0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o32o32le6qsfa0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsGreaterThan497",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmxct6o75(){try{__CLR4_4_1o32o32le6qsfa0.R.inc(31361); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31362);assertEquals(true, Seconds.THREE.isGreaterThan(Seconds.TWO)); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31363);assertEquals(false, Seconds.THREE.isGreaterThan(Seconds.THREE)); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31364);assertEquals(false, Seconds.TWO.isGreaterThan(Seconds.THREE)); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31365);assertEquals(true, Seconds.ONE.isGreaterThan(null)); 
     __CLR4_4_1o32o32le6qsfa0.R.inc(31366);assertEquals(false, Seconds.seconds(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1o32o32le6qsfa0.R.flushNeeded();}} 

    

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
