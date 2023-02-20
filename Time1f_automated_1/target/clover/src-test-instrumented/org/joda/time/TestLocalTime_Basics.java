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
public class TestLocalTime_Basics extends TestCase {static class __CLR4_4_1ilwilwle6ndplk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,24205,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ilwilwle6ndplk.R.inc(24116);
        __CLR4_4_1ilwilwle6ndplk.R.inc(24117);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ilwilwle6ndplk.R.inc(24118);
        __CLR4_4_1ilwilwle6ndplk.R.inc(24119);return new TestSuite(TestLocalTime_Basics.class);
    }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}

    public TestLocalTime_Basics(String name) {
        super(name);__CLR4_4_1ilwilwle6ndplk.R.inc(24121);try{__CLR4_4_1ilwilwle6ndplk.R.inc(24120);
    }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ilwilwle6ndplk.R.inc(24122);
        __CLR4_4_1ilwilwle6ndplk.R.inc(24123);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ilwilwle6ndplk.R.inc(24124);zone = DateTimeZone.getDefault();
        __CLR4_4_1ilwilwle6ndplk.R.inc(24125);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ilwilwle6ndplk.R.inc(24126);
        __CLR4_4_1ilwilwle6ndplk.R.inc(24127);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ilwilwle6ndplk.R.inc(24128);DateTimeZone.setDefault(zone);
        __CLR4_4_1ilwilwle6ndplk.R.inc(24129);zone = null;
    }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testGetField_int464() {__CLR4_4_1ilwilwle6ndplk.R.globalSliceStart(getClass().getName(),24130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l6lakzima();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ilwilwle6ndplk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ilwilwle6ndplk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetField_int464",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l6lakzima(){try{__CLR4_4_1ilwilwle6ndplk.R.inc(24130); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24131);LocalTime test = new LocalTime(COPTIC_PARIS); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24132);assertSame(COPTIC_UTC.hourOfDay(), test.getField(0)); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24133);assertSame(COPTIC_UTC.minuteOfHour(), test.getField(1)); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24134);assertSame(COPTIC_UTC.secondOfMinute(), test.getField(2)); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24135);assertSame(COPTIC_UTC.millisOfSecond(), test.getField(3)); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24136);try { 
         __CLR4_4_1ilwilwle6ndplk.R.inc(24137);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24138);try { 
         __CLR4_4_1ilwilwle6ndplk.R.inc(24139);test.getField(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}
public void testWithField_DateTimeFieldType_int_3469() {__CLR4_4_1ilwilwle6ndplk.R.globalSliceStart(getClass().getName(),24140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpdcn2imk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ilwilwle6ndplk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ilwilwle6ndplk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_3469",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpdcn2imk(){try{__CLR4_4_1ilwilwle6ndplk.R.inc(24140); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24141);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24142);try { 
         __CLR4_4_1ilwilwle6ndplk.R.inc(24143);test.withField(DateTimeFieldType.dayOfMonth(), 6); 
         __CLR4_4_1ilwilwle6ndplk.R.inc(24144);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}
public void testWithField_DateTimeFieldType_int_1470() {__CLR4_4_1ilwilwle6ndplk.R.globalSliceStart(getClass().getName(),24145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18gv9naimp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ilwilwle6ndplk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ilwilwle6ndplk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_1470",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18gv9naimp(){try{__CLR4_4_1ilwilwle6ndplk.R.inc(24145); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24146);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24147);LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24148);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24149);assertEquals(new LocalTime(15, 20, 30, 40), result); 
 }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_3471() {__CLR4_4_1ilwilwle6ndplk.R.globalSliceStart(getClass().getName(),24150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8j4umimu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ilwilwle6ndplk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ilwilwle6ndplk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_3471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8j4umimu(){try{__CLR4_4_1ilwilwle6ndplk.R.inc(24150); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24151);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24152);try { 
         __CLR4_4_1ilwilwle6ndplk.R.inc(24153);test.withFieldAdded(null, 6); 
         __CLR4_4_1ilwilwle6ndplk.R.inc(24154);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}
public void testPlusMillis_int472() {__CLR4_4_1ilwilwle6ndplk.R.globalSliceStart(getClass().getName(),24155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocskfgimz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ilwilwle6ndplk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ilwilwle6ndplk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMillis_int472",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocskfgimz(){try{__CLR4_4_1ilwilwle6ndplk.R.inc(24155); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24156);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24157);LocalTime result = test.plusMillis(1); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24158);LocalTime expected = new LocalTime(1, 2, 3, 5, BUDDHIST_LONDON); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24159);assertEquals(expected, result); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24160);result = test.plusMillis(0); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24161);assertSame(test, result); 
 }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}
public void testMinusHours_int473() {__CLR4_4_1ilwilwle6ndplk.R.globalSliceStart(getClass().getName(),24162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rcfkomin6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ilwilwle6ndplk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ilwilwle6ndplk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusHours_int473",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rcfkomin6(){try{__CLR4_4_1ilwilwle6ndplk.R.inc(24162); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24163);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24164);LocalTime result = test.minusHours(1); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24165);LocalTime expected = new LocalTime(2, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24166);assertEquals(expected, result); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24167);result = test.minusHours(0); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24168);assertSame(test, result); 
 }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}
public void testWithers474() {__CLR4_4_1ilwilwle6ndplk.R.globalSliceStart(getClass().getName(),24169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ci2vueind();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ilwilwle6ndplk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ilwilwle6ndplk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithers474",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ci2vueind(){try{__CLR4_4_1ilwilwle6ndplk.R.inc(24169); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24170);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24171);check(test.withHourOfDay(6), 6, 20, 30, 40); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24172);check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24173);check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24174);check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24175);check(test.withMillisOfDay(61234), 0, 1, 1, 234); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24176);try { 
         __CLR4_4_1ilwilwle6ndplk.R.inc(24177);test.withHourOfDay(-1); 
         __CLR4_4_1ilwilwle6ndplk.R.inc(24178);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24179);try { 
         __CLR4_4_1ilwilwle6ndplk.R.inc(24180);test.withHourOfDay(24); 
         __CLR4_4_1ilwilwle6ndplk.R.inc(24181);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}
public void testToDateTimeToday477() {__CLR4_4_1ilwilwle6ndplk.R.globalSliceStart(getClass().getName(),24182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186q6vyinq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ilwilwle6ndplk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ilwilwle6ndplk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeToday477",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186q6vyinq(){try{__CLR4_4_1ilwilwle6ndplk.R.inc(24182); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24183);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24184);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24185);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24186);DateTime test = base.toDateTimeToday(); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24187);check(base, 10, 20, 30, 40); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24188);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24189);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24190);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24191);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24192);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1ilwilwle6ndplk.R.inc(24193);assertEquals(expected, test); 
 }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1ilwilwle6ndplk.R.inc(24194);
            __CLR4_4_1ilwilwle6ndplk.R.inc(24195);return COPTIC_UTC;
        }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1ilwilwle6ndplk.R.inc(24196);
            __CLR4_4_1ilwilwle6ndplk.R.inc(24197);return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1ilwilwle6ndplk.R.inc(24198);
            __CLR4_4_1ilwilwle6ndplk.R.inc(24199);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}
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
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1ilwilwle6ndplk.R.inc(24200);
        __CLR4_4_1ilwilwle6ndplk.R.inc(24201);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1ilwilwle6ndplk.R.inc(24202);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1ilwilwle6ndplk.R.inc(24203);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1ilwilwle6ndplk.R.inc(24204);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1ilwilwle6ndplk.R.flushNeeded();}}
}
