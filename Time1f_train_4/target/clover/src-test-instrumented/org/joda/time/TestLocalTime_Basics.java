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
public class TestLocalTime_Basics extends TestCase {static class __CLR4_4_1l2tl2tle6rjclc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,27597,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27317);
        __CLR4_4_1l2tl2tle6rjclc.R.inc(27318);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27319);
        __CLR4_4_1l2tl2tle6rjclc.R.inc(27320);return new TestSuite(TestLocalTime_Basics.class);
    }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}}

    public TestLocalTime_Basics(String name) {
        super(name);__CLR4_4_1l2tl2tle6rjclc.R.inc(27322);try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27321);
    }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27323);
        __CLR4_4_1l2tl2tle6rjclc.R.inc(27324);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1l2tl2tle6rjclc.R.inc(27325);zone = DateTimeZone.getDefault();
        __CLR4_4_1l2tl2tle6rjclc.R.inc(27326);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27327);
        __CLR4_4_1l2tl2tle6rjclc.R.inc(27328);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1l2tl2tle6rjclc.R.inc(27329);DateTimeZone.setDefault(zone);
        __CLR4_4_1l2tl2tle6rjclc.R.inc(27330);zone = null;
    }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlusMinutes_int429() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1131y2pl37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMinutes_int429",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1131y2pl37(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27331); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27332);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27333);LocalTime result = test.plusMinutes(1); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27334);LocalTime expected = new LocalTime(1, 3, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27335);assertEquals(expected, result); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27336);result = test.plusMinutes(0); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27337);assertSame(test, result); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testSerialization983() throws Exception {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ajurpfl3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testSerialization983",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ajurpfl3e() throws Exception{try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27338); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27339);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27340);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27341);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27342);oos.writeObject(test); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27343);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27344);oos.close(); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27345);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27346);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27347);LocalTime result = (LocalTime) ois.readObject(); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27348);ois.close(); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27349);assertEquals(test, result); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27350);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27351);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27352);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testGetField_int984() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1132emil3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetField_int984",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1132emil3t(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27353); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27354);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27355);assertSame(COPTIC_UTC.hourOfDay(), test.getField(0)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27356);assertSame(COPTIC_UTC.minuteOfHour(), test.getField(1)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27357);assertSame(COPTIC_UTC.secondOfMinute(), test.getField(2)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27358);assertSame(COPTIC_UTC.millisOfSecond(), test.getField(3)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27359);try { 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27360);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27361);try { 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27362);test.getField(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testGetValue_int985() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q4gcv4l43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetValue_int985",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q4gcv4l43(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27363); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27364);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27365);assertEquals(10, test.getValue(0)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27366);assertEquals(20, test.getValue(1)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27367);assertEquals(30, test.getValue(2)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27368);assertEquals(40, test.getValue(3)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27369);try { 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27370);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27371);try { 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27372);test.getValue(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testGet_DateTimeFieldType986() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sh0m74l4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGet_DateTimeFieldType986",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sh0m74l4d(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27373); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27374);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27375);assertEquals(10, test.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27376);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27377);assertEquals(30, test.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27378);assertEquals(40, test.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27379);assertEquals(TEST_TIME_NOW / 60000, test.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27380);assertEquals(TEST_TIME_NOW / 1000, test.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27381);assertEquals(TEST_TIME_NOW, test.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27382);assertEquals(10, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27383);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27384);test = new LocalTime(12, 30); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27385);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27386);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27387);assertEquals(12, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27388);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27389);test = new LocalTime(14, 30); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27390);assertEquals(2, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27391);assertEquals(2, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27392);assertEquals(14, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27393);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27394);test = new LocalTime(0, 30); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27395);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27396);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27397);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27398);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27399);try { 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27400);test.get(null); 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27401);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27402);try { 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27403);test.get(DateTimeFieldType.dayOfMonth()); 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27404);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType987() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ownubl59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DateTimeFieldType987",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ownubl59(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27405); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27406);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27407);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27408);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27409);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27410);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27411);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27412);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27413);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27414);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27415);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27416);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27417);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27418);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27419);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27420);DateTimeFieldType d = new DateTimeFieldType("hours") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27421); 
             __CLR4_4_1l2tl2tle6rjclc.R.inc(27422);return DurationFieldType.hours(); 
         }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27423); 
             __CLR4_4_1l2tl2tle6rjclc.R.inc(27424);return null; 
         }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27425); 
             __CLR4_4_1l2tl2tle6rjclc.R.inc(27426);return chronology.hourOfDay(); 
         }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 
     }; 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27427);assertEquals(false, test.isSupported(d)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27428);d = new DateTimeFieldType("hourOfYear") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27429); 
             __CLR4_4_1l2tl2tle6rjclc.R.inc(27430);return DurationFieldType.hours(); 
         }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27431); 
             __CLR4_4_1l2tl2tle6rjclc.R.inc(27432);return DurationFieldType.years(); 
         }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27433); 
             __CLR4_4_1l2tl2tle6rjclc.R.inc(27434);return chronology.hourOfDay(); 
         }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 
     }; 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27435);assertEquals(false, test.isSupported(d)); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testEqualsHashCode988() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqa8ssl64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testEqualsHashCode988",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqa8ssl64(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27436); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27437);LocalTime test1 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27438);LocalTime test2 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27439);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27440);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27441);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27442);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27443);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27444);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27445);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27446);LocalTime test3 = new LocalTime(15, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27447);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27448);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27449);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27450);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27451);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27452);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27453);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27454);assertEquals(true, test1.equals(new TimeOfDay(10, 20, 30, 40, COPTIC_UTC))); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27455);assertEquals(true, test1.hashCode() == new TimeOfDay(10, 20, 30, 40, COPTIC_UTC).hashCode()); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27456);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27457);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_1989() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e9nmzhl6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_1989",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e9nmzhl6q(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27458); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27459);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27460);LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27461);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27462);assertEquals(new LocalTime(15, 20, 30, 40), result); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_3990() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143f555l6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_3990",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143f555l6v(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27463); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27464);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27465);try { 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27466);test.withField(DateTimeFieldType.dayOfMonth(), 6); 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27467);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_3991() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pix7x1l70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_3991",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pix7x1l70(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27468); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27469);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27470);try { 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27471);test.withFieldAdded(null, 6); 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27472);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_1992() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j2jwagl75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_1992",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j2jwagl75(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27473); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27474);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27475);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27476);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27477);assertEquals(new LocalTime(16, 20, 30, 40), result); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_5993() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tatm23l7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_5993",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tatm23l7a(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27478); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27479);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27480);try { 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27481);test.withFieldAdded(DurationFieldType.days(), 6); 
         __CLR4_4_1l2tl2tle6rjclc.R.inc(27482);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_4994() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uwiah5l7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_4994",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uwiah5l7f(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27483); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27484);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27485);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 0); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27486);assertSame(test, result); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testPlusSeconds_int995() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zeuupzl7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusSeconds_int995",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zeuupzl7j(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27487); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27488);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27489);LocalTime result = test.plusSeconds(1); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27490);LocalTime expected = new LocalTime(1, 2, 4, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27491);assertEquals(expected, result); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27492);result = test.plusSeconds(0); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27493);assertSame(test, result); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testPlusMillis_int996() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmgeh1l7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMillis_int996",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmgeh1l7q(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27494); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27495);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27496);LocalTime result = test.plusMillis(1); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27497);LocalTime expected = new LocalTime(1, 2, 3, 5, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27498);assertEquals(expected, result); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27499);result = test.plusMillis(0); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27500);assertSame(test, result); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testMinus_RP997() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8xhwfl7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinus_RP997",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8xhwfl7x(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27501); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27502);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27503);LocalTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27504);LocalTime expected = new LocalTime(9, 19, 29, 39, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27505);assertEquals(expected, result); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27506);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27507);assertSame(test, result); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testMinusHours_int998() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbrpfil84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusHours_int998",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbrpfil84(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27508); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27509);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27510);LocalTime result = test.minusHours(1); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27511);LocalTime expected = new LocalTime(0, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27512);assertEquals(expected, result); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27513);result = test.minusHours(0); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27514);assertSame(test, result); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testMinusMinutes_int999() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azqjv3l8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMinutes_int999",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azqjv3l8b(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27515); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27516);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27517);LocalTime result = test.minusMinutes(1); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27518);LocalTime expected = new LocalTime(1, 1, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27519);assertEquals(expected, result); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27520);result = test.minusMinutes(0); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27521);assertSame(test, result); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testMinusSeconds_int1000() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c8rw5ll8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusSeconds_int1000",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c8rw5ll8i(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27522); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27523);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27524);LocalTime result = test.minusSeconds(1); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27525);LocalTime expected = new LocalTime(1, 2, 2, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27526);assertEquals(expected, result); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27527);result = test.minusSeconds(0); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27528);assertSame(test, result); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testMinusMillis_int1001() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ymo5yzl8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMillis_int1001",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ymo5yzl8p(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27529); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27530);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27531);LocalTime result = test.minusMillis(1); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27532);LocalTime expected = new LocalTime(1, 2, 3, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27533);assertEquals(expected, result); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27534);result = test.minusMillis(0); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27535);assertSame(test, result); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testGetters1002() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rin4pql8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetters1002",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rin4pql8w(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27536); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27537);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27538);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27539);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27540);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27541);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27542);assertEquals(TEST_TIME_NOW, test.getMillisOfDay()); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testToDateTimeTodayDefaultZone1006() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12g2opsl93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeTodayDefaultZone1006",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12g2opsl93(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27543); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27544);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27545);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27546);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27547);DateTime test = base.toDateTimeToday(); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27548);check(base, 10, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27549);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27550);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27551);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27552);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27553);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27554);assertEquals(expected, test); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testToDateTimeToday_nullZone1007() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dh7xuil9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeToday_nullZone1007",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dh7xuil9f(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27555); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27556);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27557);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27558);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27559);DateTime test = base.toDateTimeToday((DateTimeZone) null); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27560);check(base, 10, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27561);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27562);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27563);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27564);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27565);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27566);assertEquals(expected, test); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testToString_String_Locale1008() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5n6wbl9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String_Locale1008",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5n6wbl9r(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27567); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27568);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27569);assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27570);assertEquals("10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27571);assertEquals("10 20", test.toString("H m", null)); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27572);assertEquals("10:20:30.040", test.toString(null, null)); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_81015() {__CLR4_4_1l2tl2tle6rjclc.R.globalSliceStart(getClass().getName(),27573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dnvqhel9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2tl2tle6rjclc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2tl2tle6rjclc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_81015",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dnvqhel9x(){try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27573); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27574);LocalTime test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27575);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27576);assertEquals(new LocalTime(23, 59, 59, 999), result); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27577);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27578);result = test.withFieldAdded(DurationFieldType.seconds(), -1); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27579);assertEquals(new LocalTime(23, 59, 59, 0), result); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27580);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27581);result = test.withFieldAdded(DurationFieldType.minutes(), -1); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27582);assertEquals(new LocalTime(23, 59, 0, 0), result); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27583);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27584);result = test.withFieldAdded(DurationFieldType.hours(), -1); 
     __CLR4_4_1l2tl2tle6rjclc.R.inc(27585);assertEquals(new LocalTime(23, 0, 0, 0), result); 
 }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27586);
            __CLR4_4_1l2tl2tle6rjclc.R.inc(27587);return COPTIC_UTC;
        }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27588);
            __CLR4_4_1l2tl2tle6rjclc.R.inc(27589);return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27590);
            __CLR4_4_1l2tl2tle6rjclc.R.inc(27591);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}}
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
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1l2tl2tle6rjclc.R.inc(27592);
        __CLR4_4_1l2tl2tle6rjclc.R.inc(27593);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1l2tl2tle6rjclc.R.inc(27594);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1l2tl2tle6rjclc.R.inc(27595);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1l2tl2tle6rjclc.R.inc(27596);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1l2tl2tle6rjclc.R.flushNeeded();}}
}
