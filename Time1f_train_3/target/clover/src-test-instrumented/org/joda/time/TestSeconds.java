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
public class TestSeconds extends TestCase {static class __CLR4_4_1o0wo0wle6rcm0v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,31303,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31136);
        __CLR4_4_1o0wo0wle6rcm0v.R.inc(31137);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31138);
        __CLR4_4_1o0wo0wle6rcm0v.R.inc(31139);return new TestSuite(TestSeconds.class);
    }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}}

    public TestSeconds(String name) {
        super(name);__CLR4_4_1o0wo0wle6rcm0v.R.inc(31141);try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31140);
    }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31142);
    }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31143);
    }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSerialization518() throws Exception {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1javntxo14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testSerialization518",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1javntxo14() throws Exception{try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31144); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31145);Seconds test = Seconds.THREE; 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31146);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31147);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31148);oos.writeObject(test); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31149);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31150);oos.close(); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31151);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31152);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31153);Seconds result = (Seconds) ois.readObject(); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31154);ois.close(); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31155);assertSame(test, result); 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testFactory_secondsBetween_RInstant519() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mztltyo1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RInstant519",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mztltyo1g(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31156); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31157);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31158);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31159);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31160);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31161);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31162);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31163);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31164);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testFactory_standardSecondsIn_RPeriod520() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l04oqo1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_standardSecondsIn_RPeriod520",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l04oqo1p(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31165); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31166);assertEquals(0, Seconds.standardSecondsIn((ReadablePeriod) null).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31167);assertEquals(0, Seconds.standardSecondsIn(Period.ZERO).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31168);assertEquals(1, Seconds.standardSecondsIn(new Period(0, 0, 0, 0, 0, 0, 1, 0)).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31169);assertEquals(123, Seconds.standardSecondsIn(Period.seconds(123)).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31170);assertEquals(-987, Seconds.standardSecondsIn(Period.seconds(-987)).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31171);assertEquals(2 * 24 * 60 * 60, Seconds.standardSecondsIn(Period.days(2)).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31172);try { 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31173);Seconds.standardSecondsIn(Period.months(1)); 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31174);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testPlus_int521() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h8jk3jo1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_int521",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h8jk3jo1z(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31175); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31176);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31177);Seconds result = test2.plus(3); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31178);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31179);assertEquals(5, result.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31180);assertEquals(1, Seconds.ONE.plus(0).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31181);try { 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31182);Seconds.MAX_VALUE.plus(1); 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31183);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testFactory_seconds_int522() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m28xuco28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_seconds_int522",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m28xuco28(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31184); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31185);assertSame(Seconds.ZERO, Seconds.seconds(0)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31186);assertSame(Seconds.ONE, Seconds.seconds(1)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31187);assertSame(Seconds.TWO, Seconds.seconds(2)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31188);assertSame(Seconds.THREE, Seconds.seconds(3)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31189);assertSame(Seconds.MAX_VALUE, Seconds.seconds(Integer.MAX_VALUE)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31190);assertSame(Seconds.MIN_VALUE, Seconds.seconds(Integer.MIN_VALUE)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31191);assertEquals(-1, Seconds.seconds(-1).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31192);assertEquals(4, Seconds.seconds(4).getSeconds()); 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testToStandardMinutes523() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0hp3co2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardMinutes523",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0hp3co2h(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31193); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31194);Seconds test = Seconds.seconds(60 * 2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31195);Minutes expected = Minutes.minutes(2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31196);assertEquals(expected, test.toStandardMinutes()); 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testFactory_secondsIn_RInterval524() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q2n65zo2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsIn_RInterval524",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q2n65zo2l(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31197); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31198);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31199);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31200);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31201);assertEquals(0, Seconds.secondsIn((ReadableInterval) null).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31202);assertEquals(3, Seconds.secondsIn(new Interval(start, end1)).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31203);assertEquals(0, Seconds.secondsIn(new Interval(start, start)).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31204);assertEquals(0, Seconds.secondsIn(new Interval(end1, end1)).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31205);assertEquals(6, Seconds.secondsIn(new Interval(start, end2)).getSeconds()); 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testAddToLocalDate525() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nvqfg0o2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testAddToLocalDate525",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nvqfg0o2u(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31206); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31207);Seconds test = Seconds.seconds(26); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31208);LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31209);LocalDateTime expected = new LocalDateTime(2006, 6, 1, 0, 0, 26, 0); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31210);assertEquals(expected, date.plus(test)); 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testToStandardWeeks527() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5smoko2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardWeeks527",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5smoko2z(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31211); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31212);Seconds test = Seconds.seconds(60 * 60 * 24 * 7 * 2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31213);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31214);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testToStandardDays528() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qg2w0xo33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDays528",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qg2w0xo33(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31215); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31216);Seconds test = Seconds.seconds(60 * 60 * 24 * 2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31217);Days expected = Days.days(2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31218);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testToStandardHours529() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1exdnheo37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardHours529",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1exdnheo37(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31219); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31220);Seconds test = Seconds.seconds(60 * 60 * 2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31221);Hours expected = Hours.hours(2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31222);assertEquals(expected, test.toStandardHours()); 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testToStandardDuration530() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12nx8f9o3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDuration530",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12nx8f9o3b(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31223); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31224);Seconds test = Seconds.seconds(20); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31225);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_SECOND); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31226);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31227);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_SECOND); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31228);assertEquals(expected, Seconds.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testPlus_Seconds531() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opzff2o3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_Seconds531",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opzff2o3h(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31229); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31230);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31231);Seconds test3 = Seconds.seconds(3); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31232);Seconds result = test2.plus(test3); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31233);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31234);assertEquals(3, test3.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31235);assertEquals(5, result.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31236);assertEquals(1, Seconds.ONE.plus(Seconds.ZERO).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31237);assertEquals(1, Seconds.ONE.plus((Seconds) null).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31238);try { 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31239);Seconds.MAX_VALUE.plus(Seconds.ONE); 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31240);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testMinus_int532() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mg9xcjo3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_int532",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mg9xcjo3t(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31241); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31242);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31243);Seconds result = test2.minus(3); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31244);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31245);assertEquals(-1, result.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31246);assertEquals(1, Seconds.ONE.minus(0).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31247);try { 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31248);Seconds.MIN_VALUE.minus(1); 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31249);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testMinus_Seconds533() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1prvdiao42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_Seconds533",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1prvdiao42(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31250); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31251);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31252);Seconds test3 = Seconds.seconds(3); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31253);Seconds result = test2.minus(test3); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31254);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31255);assertEquals(3, test3.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31256);assertEquals(-1, result.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31257);assertEquals(1, Seconds.ONE.minus(Seconds.ZERO).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31258);assertEquals(1, Seconds.ONE.minus((Seconds) null).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31259);try { 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31260);Seconds.MIN_VALUE.minus(Seconds.ONE); 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31261);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testMultipliedBy_int534() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14mu8i9o4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMultipliedBy_int534",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14mu8i9o4e(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31262); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31263);Seconds test = Seconds.seconds(2); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31264);assertEquals(6, test.multipliedBy(3).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31265);assertEquals(2, test.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31266);assertEquals(-6, test.multipliedBy(-3).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31267);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31268);Seconds halfMax = Seconds.seconds(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31269);try { 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31270);halfMax.multipliedBy(2); 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31271);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testDividedBy_int535() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zmudao4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testDividedBy_int535",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zmudao4o(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31272); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31273);Seconds test = Seconds.seconds(12); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31274);assertEquals(6, test.dividedBy(2).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31275);assertEquals(12, test.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31276);assertEquals(4, test.dividedBy(3).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31277);assertEquals(3, test.dividedBy(4).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31278);assertEquals(2, test.dividedBy(5).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31279);assertEquals(2, test.dividedBy(6).getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31280);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31281);try { 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31282);Seconds.ONE.dividedBy(0); 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31283);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testNegated536() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12zqeq9o50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testNegated536",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12zqeq9o50(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31284); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31285);Seconds test = Seconds.seconds(12); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31286);assertEquals(-12, test.negated().getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31287);assertEquals(12, test.getSeconds()); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31288);try { 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31289);Seconds.MIN_VALUE.negated(); 
         __CLR4_4_1o0wo0wle6rcm0v.R.inc(31290);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testIsGreaterThan537() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gquncvo57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsGreaterThan537",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gquncvo57(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31291); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31292);assertEquals(true, Seconds.THREE.isGreaterThan(Seconds.TWO)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31293);assertEquals(false, Seconds.THREE.isGreaterThan(Seconds.THREE)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31294);assertEquals(false, Seconds.TWO.isGreaterThan(Seconds.THREE)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31295);assertEquals(true, Seconds.ONE.isGreaterThan(null)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31296);assertEquals(false, Seconds.seconds(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 


public void testIsLessThan538() {__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceStart(getClass().getName(),31297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qbsa2do5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o0wo0wle6rcm0v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o0wo0wle6rcm0v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsLessThan538",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qbsa2do5d(){try{__CLR4_4_1o0wo0wle6rcm0v.R.inc(31297); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31298);assertEquals(false, Seconds.THREE.isLessThan(Seconds.TWO)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31299);assertEquals(false, Seconds.THREE.isLessThan(Seconds.THREE)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31300);assertEquals(true, Seconds.TWO.isLessThan(Seconds.THREE)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31301);assertEquals(false, Seconds.ONE.isLessThan(null)); 
     __CLR4_4_1o0wo0wle6rcm0v.R.inc(31302);assertEquals(true, Seconds.seconds(-1).isLessThan(null)); 
 }finally{__CLR4_4_1o0wo0wle6rcm0v.R.flushNeeded();}} 

    

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
