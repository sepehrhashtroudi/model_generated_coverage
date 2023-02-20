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
public class TestLocalTime_Basics extends TestCase {static class __CLR4_4_1i75i75le6nl8ar{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,23680,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1i75i75le6nl8ar.R.inc(23585);
        __CLR4_4_1i75i75le6nl8ar.R.inc(23586);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i75i75le6nl8ar.R.inc(23587);
        __CLR4_4_1i75i75le6nl8ar.R.inc(23588);return new TestSuite(TestLocalTime_Basics.class);
    }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}

    public TestLocalTime_Basics(String name) {
        super(name);__CLR4_4_1i75i75le6nl8ar.R.inc(23590);try{__CLR4_4_1i75i75le6nl8ar.R.inc(23589);
    }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i75i75le6nl8ar.R.inc(23591);
        __CLR4_4_1i75i75le6nl8ar.R.inc(23592);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i75i75le6nl8ar.R.inc(23593);zone = DateTimeZone.getDefault();
        __CLR4_4_1i75i75le6nl8ar.R.inc(23594);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i75i75le6nl8ar.R.inc(23595);
        __CLR4_4_1i75i75le6nl8ar.R.inc(23596);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i75i75le6nl8ar.R.inc(23597);DateTimeZone.setDefault(zone);
        __CLR4_4_1i75i75le6nl8ar.R.inc(23598);zone = null;
    }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testProperty408() {__CLR4_4_1i75i75le6nl8ar.R.globalSliceStart(getClass().getName(),23599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ez2m4i7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i75i75le6nl8ar.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i75i75le6nl8ar.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testProperty408",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ez2m4i7j(){try{__CLR4_4_1i75i75le6nl8ar.R.inc(23599); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23600);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23601);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23602);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23603);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23604);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23605);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23606);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalTime()); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23607);assertEquals(test, test.property(DateTimeFieldType.secondOfDay()).getLocalTime()); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23608);assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalTime()); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23609);assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalTime()); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23610);assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalTime()); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23611);assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalTime()); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23612);assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalTime()); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23613);try { 
         __CLR4_4_1i75i75le6nl8ar.R.inc(23614);test.property(DateTimeFieldType.dayOfWeek()); 
         __CLR4_4_1i75i75le6nl8ar.R.inc(23615);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23616);try { 
         __CLR4_4_1i75i75le6nl8ar.R.inc(23617);test.property(null); 
         __CLR4_4_1i75i75le6nl8ar.R.inc(23618);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_1409() {__CLR4_4_1i75i75le6nl8ar.R.globalSliceStart(getClass().getName(),23619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vkut9i83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i75i75le6nl8ar.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i75i75le6nl8ar.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_1409",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vkut9i83(){try{__CLR4_4_1i75i75le6nl8ar.R.inc(23619); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23620);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23621);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23622);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23623);assertEquals(new LocalTime(12, 20, 30, 40), result); 
 }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_1410() {__CLR4_4_1i75i75le6nl8ar.R.globalSliceStart(getClass().getName(),23624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11epndzi88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i75i75le6nl8ar.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i75i75le6nl8ar.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_1410",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11epndzi88(){try{__CLR4_4_1i75i75le6nl8ar.R.inc(23624); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23625);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23626);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23627);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23628);assertEquals(new LocalTime(15, 20, 30, 40), result); 
 }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_2411() {__CLR4_4_1i75i75le6nl8ar.R.globalSliceStart(getClass().getName(),23629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16oyym1i8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i75i75le6nl8ar.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i75i75le6nl8ar.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_2411",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16oyym1i8d(){try{__CLR4_4_1i75i75le6nl8ar.R.inc(23629); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23630);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23631);try { 
         __CLR4_4_1i75i75le6nl8ar.R.inc(23632);test.withFieldAdded(null, 0); 
         __CLR4_4_1i75i75le6nl8ar.R.inc(23633);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
public void testPlusMinutes_int412() {__CLR4_4_1i75i75le6nl8ar.R.globalSliceStart(getClass().getName(),23634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hh7ftli8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i75i75le6nl8ar.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i75i75le6nl8ar.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMinutes_int412",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hh7ftli8i(){try{__CLR4_4_1i75i75le6nl8ar.R.inc(23634); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23635);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23636);LocalTime result = test.plusMinutes(1); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23637);LocalTime expected = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23638);assertEquals(expected, result); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23639);result = test.plusMinutes(0); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23640);assertSame(test, result); 
 }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
public void testPlusSeconds_int413() {__CLR4_4_1i75i75le6nl8ar.R.globalSliceStart(getClass().getName(),23641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f4znkqi8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i75i75le6nl8ar.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i75i75le6nl8ar.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusSeconds_int413",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f4znkqi8p(){try{__CLR4_4_1i75i75le6nl8ar.R.inc(23641); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23642);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23643);LocalTime result = test.plusSeconds(1); __CLR4_4_1i75i75le6nl8ar.R.inc(23644);LocalTime expected = new LocalTime(2, 2, 4, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23645);assertEquals(expected, result); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23646);result = test.plusSeconds(0); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23647);assertSame(test, result); 
 }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
public void testPlusSeconds_int414() {__CLR4_4_1i75i75le6nl8ar.R.globalSliceStart(getClass().getName(),23648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1idzmd7i8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i75i75le6nl8ar.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i75i75le6nl8ar.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusSeconds_int414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1idzmd7i8w(){try{__CLR4_4_1i75i75le6nl8ar.R.inc(23648); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23649);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23650);LocalTime result = test.plusSeconds(1); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23651);LocalTime expected = new LocalTime(2, 2, 4, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23652);assertEquals(expected, result); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23653);result = test.plusSeconds(0); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23654);assertSame(test, result); 
 }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
public void testMinusMinutes_int415() {__CLR4_4_1i75i75le6nl8ar.R.globalSliceStart(getClass().getName(),23655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzixeai93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i75i75le6nl8ar.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i75i75le6nl8ar.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMinutes_int415",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzixeai93(){try{__CLR4_4_1i75i75le6nl8ar.R.inc(23655); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23656);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23657);LocalTime result = test.minusMinutes(1); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23658);LocalTime expected = new LocalTime(1, 1, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23659);assertEquals(expected, result); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23660);result = test.minusMinutes(0); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23661);assertSame(test, result); 
 }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
public void testMinusSeconds_int416() {__CLR4_4_1i75i75le6nl8ar.R.globalSliceStart(getClass().getName(),23662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibqpn5i9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i75i75le6nl8ar.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i75i75le6nl8ar.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusSeconds_int416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibqpn5i9a(){try{__CLR4_4_1i75i75le6nl8ar.R.inc(23662); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23663);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23664);LocalTime result = test.minusSeconds(1); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23665);LocalTime expected = new LocalTime(1, 2, 2, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23666);assertEquals(expected, result); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23667);result = test.minusSeconds(0); 
     __CLR4_4_1i75i75le6nl8ar.R.inc(23668);assertSame(test, result); 
 }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1i75i75le6nl8ar.R.inc(23669);
            __CLR4_4_1i75i75le6nl8ar.R.inc(23670);return COPTIC_UTC;
        }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1i75i75le6nl8ar.R.inc(23671);
            __CLR4_4_1i75i75le6nl8ar.R.inc(23672);return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1i75i75le6nl8ar.R.inc(23673);
            __CLR4_4_1i75i75le6nl8ar.R.inc(23674);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
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
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1i75i75le6nl8ar.R.inc(23675);
        __CLR4_4_1i75i75le6nl8ar.R.inc(23676);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1i75i75le6nl8ar.R.inc(23677);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1i75i75le6nl8ar.R.inc(23678);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1i75i75le6nl8ar.R.inc(23679);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1i75i75le6nl8ar.R.flushNeeded();}}
}
