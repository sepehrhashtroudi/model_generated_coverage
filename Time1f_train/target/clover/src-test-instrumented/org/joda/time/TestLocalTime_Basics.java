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
public class TestLocalTime_Basics extends TestCase {static class __CLR4_4_1lo0lo0lc8axe1h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,28439,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28080);
        __CLR4_4_1lo0lo0lc8axe1h.R.inc(28081);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28082);
        __CLR4_4_1lo0lo0lc8axe1h.R.inc(28083);return new TestSuite(TestLocalTime_Basics.class);
    }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}}

    public TestLocalTime_Basics(String name) {
        super(name);__CLR4_4_1lo0lo0lc8axe1h.R.inc(28085);try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28084);
    }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28086);
        __CLR4_4_1lo0lo0lc8axe1h.R.inc(28087);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lo0lo0lc8axe1h.R.inc(28088);zone = DateTimeZone.getDefault();
        __CLR4_4_1lo0lo0lc8axe1h.R.inc(28089);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28090);
        __CLR4_4_1lo0lo0lc8axe1h.R.inc(28091);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lo0lo0lc8axe1h.R.inc(28092);DateTimeZone.setDefault(zone);
        __CLR4_4_1lo0lo0lc8axe1h.R.inc(28093);zone = null;
    }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testEqualsHashCode31() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yizfrlloe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testEqualsHashCode31",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yizfrlloe(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28094); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28095);LocalTime test1 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28096);LocalTime test2 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28097);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28098);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28099);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28100);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28101);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28102);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28103);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28104);LocalTime test3 = new LocalTime(15, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28105);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28106);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28107);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28108);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28109);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28110);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28111);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28112);assertEquals(true, test1.equals(new TimeOfDay(10, 20, 30, 40, COPTIC_UTC))); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28113);assertEquals(true, test1.hashCode() == new TimeOfDay(10, 20, 30, 40, COPTIC_UTC).hashCode()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28114);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28115);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testWithers79() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1q5xzlp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithers79",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1q5xzlp0(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28116); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28117);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28118);check(test.withHourOfDay(6), 6, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28119);check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28120);check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28121);check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28122);check(test.withMillisOfDay(61234), 0, 1, 1, 234); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28123);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28124);test.withHourOfDay(-1); 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28125);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28126);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28127);test.withHourOfDay(24); 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28128);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_8148() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c1z9o4lpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_8148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c1z9o4lpd(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28129); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28130);LocalTime test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28131);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28132);assertEquals(new LocalTime(23, 59, 59, 999), result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28133);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28134);result = test.withFieldAdded(DurationFieldType.seconds(), -1); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28135);assertEquals(new LocalTime(23, 59, 59, 0), result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28136);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28137);result = test.withFieldAdded(DurationFieldType.minutes(), -1); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28138);assertEquals(new LocalTime(23, 59, 0, 0), result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28139);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28140);result = test.withFieldAdded(DurationFieldType.hours(), -1); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28141);assertEquals(new LocalTime(23, 0, 0, 0), result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testToString_String154() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vsq44llpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String154",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vsq44llpq(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28142); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28143);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28144);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28145);assertEquals("10:20:30.040", test.toString((String) null)); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testMinusSeconds_int271() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15xw5fmlpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusSeconds_int271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15xw5fmlpu(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28146); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28147);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28148);LocalTime result = test.minusSeconds(1); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28149);LocalTime expected = new LocalTime(1, 2, 2, 4, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28150);assertEquals(expected, result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28151);result = test.minusSeconds(0); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28152);assertSame(test, result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_1301() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqpw9ylq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_1301",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqpw9ylq1(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28153); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28154);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28155);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28156);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28157);assertEquals(new LocalTime(16, 20, 30, 40), result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testProperty391() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uuw32tlq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testProperty391",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uuw32tlq6(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28158); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28159);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28160);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28161);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28162);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28163);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28164);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28165);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalTime()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28166);assertEquals(test, test.property(DateTimeFieldType.secondOfDay()).getLocalTime()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28167);assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalTime()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28168);assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalTime()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28169);assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalTime()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28170);assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalTime()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28171);assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalTime()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28172);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28173);test.property(DateTimeFieldType.dayOfWeek()); 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28174);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28175);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28176);test.property(null); 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28177);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testToString_String_Locale401() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pvl3sllqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String_Locale401",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pvl3sllqq(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28178); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28179);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28180);assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28181);assertEquals("10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28182);assertEquals("10 20", test.toString("H m", null)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28183);assertEquals("10:20:30.040", test.toString(null, null)); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testIsEqual_LocalTime523() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lzfupglqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsEqual_LocalTime523",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lzfupglqw(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28184); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28185);LocalTime test1 = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28186);LocalTime test1a = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28187);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28188);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28189);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28190);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28191);LocalTime test2 = new LocalTime(10, 20, 35, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28192);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28193);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28194);LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28195);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28196);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28197);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28198);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28199);new LocalTime(10, 20, 35, 40).isEqual(null); 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28200);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testMinusMillis_int559() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewjtglrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMillis_int559",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewjtglrd(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28201); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28202);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28203);LocalTime result = test.minusMillis(1); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28204);LocalTime expected = new LocalTime(1, 2, 3, 3, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28205);assertEquals(expected, result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28206);result = test.minusMillis(0); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28207);assertSame(test, result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testMinusMinutes_int564() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eub6aflrk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMinutes_int564",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eub6aflrk(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28208); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28209);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28210);LocalTime result = test.minusMinutes(1); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28211);LocalTime expected = new LocalTime(1, 1, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28212);assertEquals(expected, result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28213);result = test.minusMinutes(0); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28214);assertSame(test, result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testToDateTimeToday_nullZone694() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c38ba9lrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeToday_nullZone694",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c38ba9lrr(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28215); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28216);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28217);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28218);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28219);DateTime test = base.toDateTimeToday((DateTimeZone) null); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28220);check(base, 10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28221);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28222);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28223);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28224);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28225);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28226);assertEquals(expected, test); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testPlusMillis_int731() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1atk412ls3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMillis_int731",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1atk412ls3(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28227); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28228);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28229);LocalTime result = test.plusMillis(1); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28230);LocalTime expected = new LocalTime(1, 2, 3, 5, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28231);assertEquals(expected, result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28232);result = test.plusMillis(0); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28233);assertSame(test, result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testToString_DTFormatter744() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cuxnc5lsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_DTFormatter744",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cuxnc5lsa(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28234); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28235);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28236);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28237);assertEquals("10:20:30.040", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testMinusHours_int761() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f9zc14lse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusHours_int761",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f9zc14lse(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28238); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28239);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28240);LocalTime result = test.minusHours(1); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28241);LocalTime expected = new LocalTime(0, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28242);assertEquals(expected, result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28243);result = test.minusHours(0); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28244);assertSame(test, result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_1806() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ohs52flsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_1806",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ohs52flsl(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28245); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28246);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28247);LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28248);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28249);assertEquals(new LocalTime(15, 20, 30, 40), result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testSerialization921() throws Exception {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqc1dtlsq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testSerialization921",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqc1dtlsq() throws Exception{try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28250); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28251);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28252);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28253);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28254);oos.writeObject(test); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28255);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28256);oos.close(); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28257);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28258);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28259);LocalTime result = (LocalTime) ois.readObject(); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28260);ois.close(); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28261);assertEquals(test, result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28262);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28263);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28264);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testPlus_RP931() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18soap9lt5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlus_RP931",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18soap9lt5(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28265); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28266);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28267);LocalTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28268);LocalTime expected = new LocalTime(15, 26, 37, 48, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28269);assertEquals(expected, result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28270);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28271);assertSame(test, result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testPlusSeconds_int981() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_173lkgaltc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusSeconds_int981",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_173lkgaltc(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28272); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28273);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28274);LocalTime result = test.plusSeconds(1); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28275);LocalTime expected = new LocalTime(1, 2, 4, 4, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28276);assertEquals(expected, result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28277);result = test.plusSeconds(0); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28278);assertSame(test, result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType992() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g5rqfhltj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DateTimeFieldType992",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g5rqfhltj(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28279); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28280);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28281);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28282);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28283);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28284);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28285);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28286);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28287);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28288);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28289);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28290);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28291);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28292);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28293);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28294);DateTimeFieldType d = new DateTimeFieldType("hours") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28295); 
             __CLR4_4_1lo0lo0lc8axe1h.R.inc(28296);return DurationFieldType.hours(); 
         }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28297); 
             __CLR4_4_1lo0lo0lc8axe1h.R.inc(28298);return null; 
         }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28299); 
             __CLR4_4_1lo0lo0lc8axe1h.R.inc(28300);return chronology.hourOfDay(); 
         }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28301);assertEquals(false, test.isSupported(d)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28302);d = new DateTimeFieldType("hourOfYear") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28303); 
             __CLR4_4_1lo0lo0lc8axe1h.R.inc(28304);return DurationFieldType.hours(); 
         }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28305); 
             __CLR4_4_1lo0lo0lc8axe1h.R.inc(28306);return DurationFieldType.years(); 
         }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28307); 
             __CLR4_4_1lo0lo0lc8axe1h.R.inc(28308);return chronology.hourOfDay(); 
         }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28309);assertEquals(false, test.isSupported(d)); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testToDateTimeTodayDefaultZone1023() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwbgjplue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeTodayDefaultZone1023",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwbgjplue(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28310); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28311);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28312);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28313);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28314);DateTime test = base.toDateTimeToday(); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28315);check(base, 10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28316);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28317);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28318);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28319);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28320);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28321);assertEquals(expected, test); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testGetValue_int1074() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cjg6ioluq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetValue_int1074",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cjg6ioluq(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28322); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28323);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28324);assertEquals(10, test.getValue(0)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28325);assertEquals(20, test.getValue(1)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28326);assertEquals(30, test.getValue(2)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28327);assertEquals(40, test.getValue(3)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28328);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28329);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28330);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28331);test.getValue(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testGet_DateTimeFieldType1228() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6p28clv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGet_DateTimeFieldType1228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6p28clv0(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28332); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28333);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28334);assertEquals(10, test.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28335);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28336);assertEquals(30, test.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28337);assertEquals(40, test.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28338);assertEquals(TEST_TIME_NOW / 60000, test.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28339);assertEquals(TEST_TIME_NOW / 1000, test.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28340);assertEquals(TEST_TIME_NOW, test.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28341);assertEquals(10, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28342);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28343);test = new LocalTime(12, 30); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28344);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28345);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28346);assertEquals(12, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28347);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28348);test = new LocalTime(14, 30); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28349);assertEquals(2, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28350);assertEquals(2, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28351);assertEquals(14, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28352);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28353);test = new LocalTime(0, 30); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28354);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28355);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28356);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28357);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28358);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28359);test.get(null); 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28360);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28361);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28362);test.get(DateTimeFieldType.dayOfMonth()); 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28363);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testIsSupported_DurationFieldType1286() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hi1hwnlvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DurationFieldType1286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hi1hwnlvw(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28364); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28365);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28366);assertEquals(true, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28367);assertEquals(true, test.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28368);assertEquals(true, test.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28369);assertEquals(true, test.isSupported(DurationFieldType.millis())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28370);assertEquals(true, test.isSupported(DurationFieldType.halfdays())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28371);assertEquals(false, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28372);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testGetField_int1343() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqu3bmlw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetField_int1343",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqu3bmlw5(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28373); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28374);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28375);assertSame(COPTIC_UTC.hourOfDay(), test.getField(0)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28376);assertSame(COPTIC_UTC.minuteOfHour(), test.getField(1)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28377);assertSame(COPTIC_UTC.secondOfMinute(), test.getField(2)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28378);assertSame(COPTIC_UTC.millisOfSecond(), test.getField(3)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28379);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28380);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28381);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28382);test.getField(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testPlusHours_int1344() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15k9b18lwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusHours_int1344",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15k9b18lwf(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28383); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28384);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28385);LocalTime result = test.plusHours(1); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28386);LocalTime expected = new LocalTime(2, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28387);assertEquals(expected, result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28388);result = test.plusHours(0); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28389);assertSame(test, result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_51390() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19f4q8rlwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_51390",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19f4q8rlwm(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28390); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28391);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28392);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28393);test.withFieldAdded(DurationFieldType.days(), 6); 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28394);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testGetters1448() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fafo84lwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetters1448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fafo84lwr(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28395); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28396);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28397);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28398);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28399);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28400);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28401);assertEquals(TEST_TIME_NOW, test.getMillisOfDay()); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testMinus_RP1532() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oy7umvlwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinus_RP1532",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oy7umvlwy(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28402); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28403);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28404);LocalTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28405);LocalTime expected = new LocalTime(9, 19, 29, 39, BUDDHIST_LONDON); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28406);assertEquals(expected, result); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28407);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28408);assertSame(test, result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_31540() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1227wftlx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_31540",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1227wftlx5(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28409); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28410);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28411);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28412);test.withField(DateTimeFieldType.dayOfMonth(), 6); 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28413);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_41603() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1281b0zlxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_41603",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1281b0zlxa(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28414); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28415);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28416);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 0); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28417);assertSame(test, result); 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_31609() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dd188olxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_31609",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dd188olxe(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28418); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28419);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28420);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28421);test.withFieldAdded(null, 6); 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28422);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_21719() {__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceStart(getClass().getName(),28423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ke48clxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo0lo0lc8axe1h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo0lo0lc8axe1h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_21719",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ke48clxj(){try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28423); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28424);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1lo0lo0lc8axe1h.R.inc(28425);try { 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28426);test.withField(null, 6); 
         __CLR4_4_1lo0lo0lc8axe1h.R.inc(28427);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28428);
            __CLR4_4_1lo0lo0lc8axe1h.R.inc(28429);return COPTIC_UTC;
        }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28430);
            __CLR4_4_1lo0lo0lc8axe1h.R.inc(28431);return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28432);
            __CLR4_4_1lo0lo0lc8axe1h.R.inc(28433);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}}
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
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1lo0lo0lc8axe1h.R.inc(28434);
        __CLR4_4_1lo0lo0lc8axe1h.R.inc(28435);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1lo0lo0lc8axe1h.R.inc(28436);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1lo0lo0lc8axe1h.R.inc(28437);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1lo0lo0lc8axe1h.R.inc(28438);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1lo0lo0lc8axe1h.R.flushNeeded();}}
}
