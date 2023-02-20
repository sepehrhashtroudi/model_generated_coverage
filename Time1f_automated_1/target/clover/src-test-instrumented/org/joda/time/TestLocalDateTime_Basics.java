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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Basics extends TestCase {static class __CLR4_4_1i6hi6hle6ndpjv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,23808,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);

//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private int MILLIS_OF_DAY_UTC =
        (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L);

    private long TEST_TIME_NOW_UTC =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY + MILLIS_OF_DAY_UTC;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23561);
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23562);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23563);
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23564);return new TestSuite(TestLocalDateTime_Basics.class);
    }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}

    public TestLocalDateTime_Basics(String name) {
        super(name);__CLR4_4_1i6hi6hle6ndpjv.R.inc(23566);try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23565);
    }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23567);
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23568);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23569);zone = DateTimeZone.getDefault();
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23570);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23571);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23572);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23573);
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23574);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23575);DateTimeZone.setDefault(zone);
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23576);zone = null;
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23577);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23578);systemDefaultLocale = null;
    }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testIsSupported_DateTimeFieldType647() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wa987oi6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsSupported_DateTimeFieldType647",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wa987oi6z(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23579); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23580);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23581);assertEquals(false, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23582);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23583);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23584);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23585);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23586);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23587);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23588);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23589);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23590);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23591);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23592);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23593);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23594);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23595);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23596);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23597);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23598);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23599);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23600);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23601);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23602);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay()));
}finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}

public void testToDateTime648() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11oaqzri7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime648",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11oaqzri7n(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23603); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23604);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23605);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9, COPTIC_LONDON); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23606);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23607);DateTime test = base.toDateTime(); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23608);check(base, 2005, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23609);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23610);expected = expected.year().setCopy(2005); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23611);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23612);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23613);assertEquals(expected, test); 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testWithDate_int_int_int650() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ktm02i7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithDate_int_int_int650",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ktm02i7y(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23614); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23615);LocalDateTime test = new LocalDateTime(2002, 4, 5, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23616);LocalDateTime result = test.withDate(2003, 5, 6); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23617);check(test, 2003, 5, 6, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23618);check(result, 2003, 5, 6, 10, 20, 30, 40); 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testMinusMillis_int653() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1r1fdi83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMillis_int653",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1r1fdi83(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23619); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23620);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23621);LocalDateTime result = test.minusMillis(1); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23622);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 41, BUDDHIST_LONDON); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23623);assertEquals(expected, result); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23624);result = test.minusMillis(0); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23625);assertSame(test, result); 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testProperty655() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112nsq2i8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testProperty655",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112nsq2i8a(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23626); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23627);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23628);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23629);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23630);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23631);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23632);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23633);assertEquals(test, test.property(DateTimeFieldType.minuteOfHour()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23634);assertEquals(test, test.property(DateTimeFieldType.secondOfMinute()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23635);assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23636);assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23637);assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23638);assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23639);assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23640);try { 
         __CLR4_4_1i6hi6hle6ndpjv.R.inc(23641);test.property(DateTimeFieldType.dayOfWeek()); 
         __CLR4_4_1i6hi6hle6ndpjv.R.inc(23642);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23643);try { 
         __CLR4_4_1i6hi6hle6ndpjv.R.inc(23644);test.property(null); 
         __CLR4_4_1i6hi6hle6ndpjv.R.inc(23645);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testProperty656() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_126c62fi8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testProperty656",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_126c62fi8u(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23646); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23647);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23648);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23649);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23650);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23651);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23652);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23653);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23654);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23655);assertEquals(test, test.property(DateTimeFieldType.minuteOfHour()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23656);assertEquals(test, test.property(DateTimeFieldType.secondOfDay()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23657);assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23658);assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23659);assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23660);assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23661);assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23662);try { 
         __CLR4_4_1i6hi6hle6ndpjv.R.inc(23663);test.property(DateTimeFieldType.dayOfWeek()); 
         __CLR4_4_1i6hi6hle6ndpjv.R.inc(23664);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23665);try { 
         __CLR4_4_1i6hi6hle6ndpjv.R.inc(23666);test.property(null); 
         __CLR4_4_1i6hi6hle6ndpjv.R.inc(23667);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testPropertyGetEra657() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hiodpii9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPropertyGetEra657",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hiodpii9g(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23668); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23669);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23670);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23671);assertEquals("era", test.era().getName()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23672);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23673);assertSame(test, test.era().getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23674);assertEquals(20, test.era().get()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23675);assertEquals("20", test.era().getAsString()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23676);assertEquals("20", test.era().getAsText()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23677);assertEquals("20", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23678);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23679);assertEquals("20", test.era().getField().getAsText(1, Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23680);assertEquals("20", test.era().getAsShortText()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23681);assertEquals("20", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23682);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23683);assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23684);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23685);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23686);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23687);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23688);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23689);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testPropertyGetCenturyOfEra658() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bj58ugia2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPropertyGetCenturyOfEra658",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bj58ugia2(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23690); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23691);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23692);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23693);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23694);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23695);assertSame(test, test.centuryOfEra().getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23696);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23697);assertEquals("20", test.centuryOfEra().getAsString()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23698);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23699);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23700);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23701);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23702);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23703);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23704);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23705);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testPropertyGetYearOfCentury659() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fj58wiai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPropertyGetYearOfCentury659",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fj58wiai(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23706); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23707);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23708);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23709);assertEquals("yearOfCentury", test.yearOfCentury().getName()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23710);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23711);assertSame(test, test.yearOfCentury().getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23712);assertEquals(4, test.yearOfCentury().get()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23713);assertEquals("4", test.yearOfCentury().getAsString()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23714);assertEquals("4", test.yearOfCentury().getAsText()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23715);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23716);assertEquals("4", test.yearOfCentury().getAsShortText()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23717);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23718);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23719);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23720);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23721);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testPropertyGetYearOfEra660() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hj2612iay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPropertyGetYearOfEra660",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hj2612iay(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23722); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23723);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23724);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23725);assertEquals("yearOfEra", test.yearOfEra().getName()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23726);assertEquals("Property[yearOfEra]", test.yearOfEra().toString()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23727);assertSame(test, test.yearOfEra().getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23728);assertEquals(2005, test.yearOfEra().get()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23729);assertEquals("2005", test.yearOfEra().getAsString()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23730);assertEquals("2005", test.yearOfEra().getAsText()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23731);assertEquals("2005", test.yearOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23732);assertEquals("2005", test.yearOfEra().getAsShortText()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23733);assertEquals("2005", test.yearOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23734);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23735);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23736);assertEquals(9, test.yearOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23737);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testPropertyGetWeekyear661() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wkipzcibe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPropertyGetWeekyear661",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wkipzcibe(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23738); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23739);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23740);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23741);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23742);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23743);assertSame(test, test.weekyear().getLocalDateTime()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23744);assertEquals(2005, test.weekyear().get()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23745);assertEquals("2005", test.weekyear().getAsString()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23746);assertEquals("2005", test.weekyear().getAsText()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23747);assertEquals("2005", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23748);assertEquals("2005", test.weekyear().getAsShortText()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23749);assertEquals("2005", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23750);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23751);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23752);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23753);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testPropertySetWeekOfWeekyear662() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ygqge6ibu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPropertySetWeekOfWeekyear662",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ygqge6ibu(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23754); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23755);LocalDateTime test = new LocalDateTime(2005, 6, 7, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23756);LocalDateTime copy = test.weekOfWeekyear().setCopy(4); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23757);check(test, 2005, 6, 7, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23758);check(copy, 2005, 6, 7, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23759);try { 
         __CLR4_4_1i6hi6hle6ndpjv.R.inc(23760);test.weekOfWeekyear().setCopy(54); 
         __CLR4_4_1i6hi6hle6ndpjv.R.inc(23761);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23762);try { 
         __CLR4_4_1i6hi6hle6ndpjv.R.inc(23763);test.weekOfWeekyear().setCopy(0); 
         __CLR4_4_1i6hi6hle6ndpjv.R.inc(23764);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testPropertyAddToCopyMonth664() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17pz2xnic5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPropertyAddToCopyMonth664",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17pz2xnic5(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23765); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23766);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23767);LocalDateTime copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23768);check(test, 1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23769);check(copy, 1972, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23770);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23771);check(copy, 1973, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23772);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23773);check(copy, 1972, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23774);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23775);check(copy, 1971, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23776);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23777);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23778);check(copy, 1972, 2, 29, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23779);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23780);check(copy, 1972, 3, 31, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23781);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23782);check(copy, 1972, 4, 30, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23783);test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23784);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23785);check(copy, 1971, 2, 28, 10, 20, 30, 40); 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testPropertyWithMaxMinValueHour665() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1joe5qaicq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPropertyWithMaxMinValueHour665",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1joe5qaicq(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23786); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23787);LocalDateTime test = new LocalDateTime(2005, 6, 9, 0, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23788);check(test.hourOfDay().withMaximumValue(), 2005, 6, 9, 23, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23789);check(test.hourOfDay().withMinimumValue(), 2005, 6, 9, 0, 20, 30, 40); 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
public void testToString_DTFormatter666() {__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceStart(getClass().getName(),23790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19we0w4icu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6hi6hle6ndpjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6hi6hle6ndpjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_DTFormatter666",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19we0w4icu(){try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23790); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23791);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23792);assertEquals("2002 10", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1i6hi6hle6ndpjv.R.inc(23793);assertEquals("2002-06-09T10:20:30.040", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23794);
            __CLR4_4_1i6hi6hle6ndpjv.R.inc(23795);return COPTIC_UTC;
        }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23796);
            __CLR4_4_1i6hi6hle6ndpjv.R.inc(23797);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
                COPTIC_UTC.millisOfDay(),
            };
        }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23798);
            __CLR4_4_1i6hi6hle6ndpjv.R.inc(23799);return new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC};
        }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
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
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1i6hi6hle6ndpjv.R.inc(23800);
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23801);assertEquals(year, test.getYear());
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23802);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23803);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23804);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23805);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23806);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1i6hi6hle6ndpjv.R.inc(23807);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1i6hi6hle6ndpjv.R.flushNeeded();}}
}
