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
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Basics extends TestCase {static class __CLR4_4_1kx5kx5le6rcl5u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,27415,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

//    private long TEST_TIME1 =
//        1L * DateTimeConstants.MILLIS_PER_HOUR
//        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
//        + 3L * DateTimeConstants.MILLIS_PER_SECOND
//        + 4L;

    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27113);
        __CLR4_4_1kx5kx5le6rcl5u.R.inc(27114);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27115);
        __CLR4_4_1kx5kx5le6rcl5u.R.inc(27116);return new TestSuite(TestLocalTime_Basics.class);
    }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}}

    public TestLocalTime_Basics(String name) {
        super(name);__CLR4_4_1kx5kx5le6rcl5u.R.inc(27118);try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27117);
    }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27119);
        __CLR4_4_1kx5kx5le6rcl5u.R.inc(27120);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kx5kx5le6rcl5u.R.inc(27121);zone = DateTimeZone.getDefault();
        __CLR4_4_1kx5kx5le6rcl5u.R.inc(27122);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27123);
        __CLR4_4_1kx5kx5le6rcl5u.R.inc(27124);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kx5kx5le6rcl5u.R.inc(27125);DateTimeZone.setDefault(zone);
        __CLR4_4_1kx5kx5le6rcl5u.R.inc(27126);zone = null;
    }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsEqual_LocalTime15() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdg16skxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsEqual_LocalTime15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdg16skxj(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27127); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27128);LocalTime test1 = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27129);LocalTime test1a = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27130);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27131);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27132);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27133);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27134);LocalTime test2 = new LocalTime(10, 20, 35, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27135);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27136);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27137);LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27138);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27139);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27140);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27141);try { 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27142);new LocalTime(10, 20, 35, 40).isEqual(null); 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27143);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testToString_DTFormatter16() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewikmdky0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_DTFormatter16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewikmdky0(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27144); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27145);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27146);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27147);assertEquals("10:20:30.040", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testPlus_RP127() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fnmpt8ky4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlus_RP127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fnmpt8ky4(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27148); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27149);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27150);LocalTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27151);LocalTime expected = new LocalTime(15, 26, 37, 48, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27152);assertEquals(expected, result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27153);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27154);assertSame(test, result); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testPlusMinutes_int428() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14c1wv6kyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMinutes_int428",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14c1wv6kyb(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27155); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27156);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27157);LocalTime result = test.plusMinutes(1); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27158);LocalTime expected = new LocalTime(1, 3, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27159);assertEquals(expected, result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27160);result = test.plusMinutes(0); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27161);assertSame(test, result); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testWithers953() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ety228kyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithers953",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ety228kyi(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27162); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27163);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27164);check(test.withHourOfDay(6), 6, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27165);check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27166);check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27167);check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27168);check(test.withMillisOfDay(61234), 0, 1, 1, 234); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27169);try { 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27170);test.withHourOfDay(-1); 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27171);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27172);try { 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27173);test.withHourOfDay(24); 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27174);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testSerialization955() throws Exception {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6bhrykyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testSerialization955",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6bhrykyv() throws Exception{try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27175); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27176);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27177);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27178);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27179);oos.writeObject(test); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27180);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27181);oos.close(); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27182);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27183);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27184);LocalTime result = (LocalTime) ois.readObject(); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27185);ois.close(); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27186);assertEquals(test, result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27187);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27188);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27189);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testGetField_int956() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpj4p1kza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetField_int956",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpj4p1kza(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27190); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27191);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27192);assertSame(COPTIC_UTC.hourOfDay(), test.getField(0)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27193);assertSame(COPTIC_UTC.minuteOfHour(), test.getField(1)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27194);assertSame(COPTIC_UTC.secondOfMinute(), test.getField(2)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27195);assertSame(COPTIC_UTC.millisOfSecond(), test.getField(3)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27196);try { 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27197);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27198);try { 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27199);test.getField(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType957() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffjzt6kzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DateTimeFieldType957",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffjzt6kzk(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27200); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27201);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27202);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27203);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27204);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27205);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27206);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27207);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27208);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27209);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27210);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27211);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27212);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27213);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27214);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27215);DateTimeFieldType d = new DateTimeFieldType("hours") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27216); 
             __CLR4_4_1kx5kx5le6rcl5u.R.inc(27217);return DurationFieldType.hours(); 
         }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27218); 
             __CLR4_4_1kx5kx5le6rcl5u.R.inc(27219);return null; 
         }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27220); 
             __CLR4_4_1kx5kx5le6rcl5u.R.inc(27221);return chronology.hourOfDay(); 
         }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 
     }; 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27222);assertEquals(false, test.isSupported(d)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27223);d = new DateTimeFieldType("hourOfYear") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27224); 
             __CLR4_4_1kx5kx5le6rcl5u.R.inc(27225);return DurationFieldType.hours(); 
         }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27226); 
             __CLR4_4_1kx5kx5le6rcl5u.R.inc(27227);return DurationFieldType.years(); 
         }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27228); 
             __CLR4_4_1kx5kx5le6rcl5u.R.inc(27229);return chronology.hourOfDay(); 
         }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 
     }; 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27230);assertEquals(false, test.isSupported(d)); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testProperty958() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129s124l0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testProperty958",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129s124l0f(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27231); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27232);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27233);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27234);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27235);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27236);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27237);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27238);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalTime()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27239);assertEquals(test, test.property(DateTimeFieldType.secondOfDay()).getLocalTime()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27240);assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalTime()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27241);assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalTime()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27242);assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalTime()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27243);assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalTime()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27244);assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalTime()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27245);try { 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27246);test.property(DateTimeFieldType.dayOfWeek()); 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27247);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27248);try { 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27249);test.property(null); 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27250);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testEqualsHashCode959() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yfd4bcl0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testEqualsHashCode959",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yfd4bcl0z(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27251); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27252);LocalTime test1 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27253);LocalTime test2 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27254);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27255);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27256);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27257);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27258);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27259);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27260);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27261);LocalTime test3 = new LocalTime(15, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27262);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27263);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27264);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27265);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27266);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27267);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27268);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27269);assertEquals(true, test1.equals(new TimeOfDay(10, 20, 30, 40, COPTIC_UTC))); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27270);assertEquals(true, test1.hashCode() == new TimeOfDay(10, 20, 30, 40, COPTIC_UTC).hashCode()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27271);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27272);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_1960() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vx937ol1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_1960",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vx937ol1l(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27273); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27274);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27275);LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27276);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27277);assertEquals(new LocalTime(15, 20, 30, 40), result); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_2961() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ntkh7ol1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_2961",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ntkh7ol1q(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27278); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27279);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27280);try { 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27281);test.withField(null, 6); 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27282);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_3962() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1angj21l1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_3962",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1angj21l1v(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27283); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27284);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27285);try { 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27286);test.withFieldAdded(null, 6); 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27287);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_1963() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14737fgl20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_1963",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14737fgl20(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27288); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27289);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27290);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27291);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27292);assertEquals(new LocalTime(16, 20, 30, 40), result); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_5964() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qutr21l25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_5964",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qutr21l25(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27293); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27294);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27295);try { 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27296);test.withFieldAdded(DurationFieldType.days(), 6); 
         __CLR4_4_1kx5kx5le6rcl5u.R.inc(27297);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testPlusHours_int965() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fg1e8kl2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusHours_int965",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fg1e8kl2a(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27298); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27299);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27300);LocalTime result = test.plusHours(1); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27301);LocalTime expected = new LocalTime(2, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27302);assertEquals(expected, result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27303);result = test.plusHours(0); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27304);assertSame(test, result); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testPlusSeconds_int966() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kqsie5l2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusSeconds_int966",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kqsie5l2h(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27305); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27306);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27307);LocalTime result = test.plusSeconds(1); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27308);LocalTime expected = new LocalTime(1, 2, 4, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27309);assertEquals(expected, result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27310);result = test.plusSeconds(0); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27311);assertSame(test, result); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testPlusMillis_int967() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mj6yn3l2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMillis_int967",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mj6yn3l2o(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27312); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27313);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27314);LocalTime result = test.plusMillis(1); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27315);LocalTime expected = new LocalTime(1, 2, 3, 5, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27316);assertEquals(expected, result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27317);result = test.plusMillis(0); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27318);assertSame(test, result); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testMinusHours_int968() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_137b1s1l2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusHours_int968",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_137b1s1l2v(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27319); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27320);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27321);LocalTime result = test.minusHours(1); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27322);LocalTime expected = new LocalTime(0, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27323);assertEquals(expected, result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27324);result = test.minusHours(0); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27325);assertSame(test, result); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testMinusMinutes_int969() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174q3sel32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMinutes_int969",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174q3sel32(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27326); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27327);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27328);LocalTime result = test.minusMinutes(1); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27329);LocalTime expected = new LocalTime(1, 1, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27330);assertEquals(expected, result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27331);result = test.minusMinutes(0); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27332);assertSame(test, result); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testMinusSeconds_int970() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c92negl39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusSeconds_int970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c92negl39(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27333); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27334);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27335);LocalTime result = test.minusSeconds(1); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27336);LocalTime expected = new LocalTime(1, 2, 2, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27337);assertEquals(expected, result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27338);result = test.minusSeconds(0); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27339);assertSame(test, result); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testMinusMillis_int971() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oherhil3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMillis_int971",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oherhil3g(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27340); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27341);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27342);LocalTime result = test.minusMillis(1); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27343);LocalTime expected = new LocalTime(1, 2, 3, 3, BUDDHIST_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27344);assertEquals(expected, result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27345);result = test.minusMillis(0); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27346);assertSame(test, result); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testGetters972() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14og5yzl3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetters972",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14og5yzl3n(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27347); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27348);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27349);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27350);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27351);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27352);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27353);assertEquals(TEST_TIME_NOW, test.getMillisOfDay()); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testToDateTimeTodayDefaultZone976() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bob6dnl3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeTodayDefaultZone976",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bob6dnl3u(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27354); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27355);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27356);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27357);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27358);DateTime test = base.toDateTimeToday(); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27359);check(base, 10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27360);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27361);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27362);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27363);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27364);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27365);assertEquals(expected, test); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testToDateTimeToday_nullZone977() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ulrdzl46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeToday_nullZone977",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ulrdzl46(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27366); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27367);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27368);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27369);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27370);DateTime test = base.toDateTimeToday((DateTimeZone) null); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27371);check(base, 10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27372);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27373);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27374);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27375);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27376);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27377);assertEquals(expected, test); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testToString_String978() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4i7hrl4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String978",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4i7hrl4i(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27378); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27379);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27380);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27381);assertEquals("10:20:30.040", test.toString((String) null)); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_8983() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qkhh03l4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_8983",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qkhh03l4m(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27382); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27383);LocalTime test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27384);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27385);assertEquals(new LocalTime(23, 59, 59, 999), result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27386);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27387);result = test.withFieldAdded(DurationFieldType.seconds(), -1); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27388);assertEquals(new LocalTime(23, 59, 59, 0), result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27389);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27390);result = test.withFieldAdded(DurationFieldType.minutes(), -1); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27391);assertEquals(new LocalTime(23, 59, 0, 0), result); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27392);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27393);result = test.withFieldAdded(DurationFieldType.hours(), -1); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27394);assertEquals(new LocalTime(23, 0, 0, 0), result); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 


public void testIsSupported_DurationFieldType984() {__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceStart(getClass().getName(),27395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j3vmonl4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kx5kx5le6rcl5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kx5kx5le6rcl5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DurationFieldType984",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j3vmonl4z(){try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27395); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27396);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27397);assertEquals(true, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27398);assertEquals(true, test.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27399);assertEquals(true, test.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27400);assertEquals(true, test.isSupported(DurationFieldType.millis())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27401);assertEquals(true, test.isSupported(DurationFieldType.halfdays())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27402);assertEquals(false, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1kx5kx5le6rcl5u.R.inc(27403);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27404);
            __CLR4_4_1kx5kx5le6rcl5u.R.inc(27405);return COPTIC_UTC;
        }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27406);
            __CLR4_4_1kx5kx5le6rcl5u.R.inc(27407);return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27408);
            __CLR4_4_1kx5kx5le6rcl5u.R.inc(27409);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}}
    }

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
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1kx5kx5le6rcl5u.R.inc(27410);
        __CLR4_4_1kx5kx5le6rcl5u.R.inc(27411);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1kx5kx5le6rcl5u.R.inc(27412);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1kx5kx5le6rcl5u.R.inc(27413);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1kx5kx5le6rcl5u.R.inc(27414);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1kx5kx5le6rcl5u.R.flushNeeded();}}
}
