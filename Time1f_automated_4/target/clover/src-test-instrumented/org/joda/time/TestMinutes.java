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
 * This class is a Junit unit test for Minutes.
 *
 * @author Stephen Colebourne
 */
public class TestMinutes extends TestCase {static class __CLR4_4_1ihwihwle6o79uy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,24051,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1ihwihwle6o79uy.R.inc(23972);
        __CLR4_4_1ihwihwle6o79uy.R.inc(23973);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ihwihwle6o79uy.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ihwihwle6o79uy.R.inc(23974);
        __CLR4_4_1ihwihwle6o79uy.R.inc(23975);return new TestSuite(TestMinutes.class);
    }finally{__CLR4_4_1ihwihwle6o79uy.R.flushNeeded();}}

    public TestMinutes(String name) {
        super(name);__CLR4_4_1ihwihwle6o79uy.R.inc(23977);try{__CLR4_4_1ihwihwle6o79uy.R.inc(23976);
    }finally{__CLR4_4_1ihwihwle6o79uy.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ihwihwle6o79uy.R.inc(23978);
    }finally{__CLR4_4_1ihwihwle6o79uy.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ihwihwle6o79uy.R.inc(23979);
    }finally{__CLR4_4_1ihwihwle6o79uy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_standardMinutesIn_RPeriod333() {__CLR4_4_1ihwihwle6o79uy.R.globalSliceStart(getClass().getName(),23980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fxkt52ii4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ihwihwle6o79uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ihwihwle6o79uy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_standardMinutesIn_RPeriod333",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fxkt52ii4(){try{__CLR4_4_1ihwihwle6o79uy.R.inc(23980); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23981);assertEquals(0, Minutes.standardMinutesIn((ReadablePeriod) null).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23982);assertEquals(0, Minutes.standardMinutesIn(Period.ZERO).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23983);assertEquals(1, Minutes.standardMinutesIn(new Period(0, 0, 0, 0, 1, 0, 0, 0)).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23984);assertEquals(123, Minutes.standardMinutesIn(Period.minutes(123)).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23985);assertEquals(-987, Minutes.standardMinutesIn(Period.minutes(-987)).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23986);assertEquals(1, Minutes.standardMinutesIn(Period.hours(47)).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23987);assertEquals(2, Minutes.standardMinutesIn(Period.hours(48)).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23988);assertEquals(2, Minutes.standardMinutesIn(Period.hours(49)).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23989);assertEquals(14, Minutes.standardMinutesIn(Period.weeks(2)).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23990);try { 
         __CLR4_4_1ihwihwle6o79uy.R.inc(23991);Minutes.standardMinutesIn(Period.months(1)); 
         __CLR4_4_1ihwihwle6o79uy.R.inc(23992);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ihwihwle6o79uy.R.flushNeeded();}}
public void testSerialization334() throws Exception {__CLR4_4_1ihwihwle6o79uy.R.globalSliceStart(getClass().getName(),23993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110t2hviih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ihwihwle6o79uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ihwihwle6o79uy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testSerialization334",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110t2hviih() throws Exception{try{__CLR4_4_1ihwihwle6o79uy.R.inc(23993); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23994);Minutes test = Minutes.THREE; 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23995);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23996);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23997);oos.writeObject(test); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23998);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(23999);oos.close(); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24000);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24001);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24002);Minutes result = (Minutes) ois.readObject(); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24003);ois.close(); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24004);assertSame(test, result); 
 }finally{__CLR4_4_1ihwihwle6o79uy.R.flushNeeded();}}
public void testToStandardHours335() {__CLR4_4_1ihwihwle6o79uy.R.globalSliceStart(getClass().getName(),24005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1626rmfiit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ihwihwle6o79uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ihwihwle6o79uy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardHours335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1626rmfiit(){try{__CLR4_4_1ihwihwle6o79uy.R.inc(24005); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24006);Minutes test = Minutes.minutes(60 * 24 * 2); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24007);Hours expected = Hours.hours(2); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24008);assertEquals(expected, test.toStandardHours()); 
 }finally{__CLR4_4_1ihwihwle6o79uy.R.flushNeeded();}}
public void testFactory_minutesBetween_RPartial336() {__CLR4_4_1ihwihwle6o79uy.R.globalSliceStart(getClass().getName(),24009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqcrq7iix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ihwihwle6o79uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ihwihwle6o79uy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RPartial336",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqcrq7iix(){try{__CLR4_4_1ihwihwle6o79uy.R.inc(24009); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24010);LocalTime start = new LocalTime(12, 3); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24011);LocalTime end1 = new LocalTime(12, 6); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24012);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 9); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24013);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24014);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24015);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24016);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24017);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1ihwihwle6o79uy.R.flushNeeded();}}
public void testPlus_Minutes337() {__CLR4_4_1ihwihwle6o79uy.R.globalSliceStart(getClass().getName(),24018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lzku4uij6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ihwihwle6o79uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ihwihwle6o79uy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testPlus_Minutes337",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lzku4uij6(){try{__CLR4_4_1ihwihwle6o79uy.R.inc(24018); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24019);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24020);Minutes test3 = Minutes.minutes(3); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24021);Minutes result = test2.plus(test3); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24022);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24023);assertEquals(3, test3.getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24024);assertEquals(5, result.getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24025);assertEquals(1, Minutes.ONE.plus(Minutes.ZERO).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24026);assertEquals(1, Minutes.ONE.plus((Minutes) null).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24027);try { 
         __CLR4_4_1ihwihwle6o79uy.R.inc(24028);Minutes.MAX_VALUE.plus(Minutes.ONE); 
         __CLR4_4_1ihwihwle6o79uy.R.inc(24029);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ihwihwle6o79uy.R.flushNeeded();}}
public void testPlus_int338() {__CLR4_4_1ihwihwle6o79uy.R.globalSliceStart(getClass().getName(),24030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12xzjxfiji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ihwihwle6o79uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ihwihwle6o79uy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testPlus_int338",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12xzjxfiji(){try{__CLR4_4_1ihwihwle6o79uy.R.inc(24030); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24031);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24032);Minutes result = test2.plus(3); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24033);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24034);assertEquals(5, result.getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24035);assertEquals(1, Minutes.ONE.plus(0).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24036);try { 
         __CLR4_4_1ihwihwle6o79uy.R.inc(24037);Minutes.MAX_VALUE.plus(1); 
         __CLR4_4_1ihwihwle6o79uy.R.inc(24038);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ihwihwle6o79uy.R.flushNeeded();}}
public void testMinus_Minutes339() {__CLR4_4_1ihwihwle6o79uy.R.globalSliceStart(getClass().getName(),24039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gbl32ijr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ihwihwle6o79uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ihwihwle6o79uy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_Minutes339",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gbl32ijr(){try{__CLR4_4_1ihwihwle6o79uy.R.inc(24039); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24040);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24041);Minutes test3 = Minutes.minutes(3); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24042);Minutes result = test2.minus(test3); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24043);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24044);assertEquals(3, test3.getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24045);assertEquals(-1, result.getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24046);assertEquals(1, Minutes.ONE.minus(Minutes.ZERO).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24047);assertEquals(1, Minutes.ONE.minus((Minutes) null).getMinutes()); 
     __CLR4_4_1ihwihwle6o79uy.R.inc(24048);try { 
         __CLR4_4_1ihwihwle6o79uy.R.inc(24049);Minutes.MIN_VALUE.minus(Minutes.ONE); 
         __CLR4_4_1ihwihwle6o79uy.R.inc(24050);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ihwihwle6o79uy.R.flushNeeded();}}
    

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
