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
public class TestLocalDateTime_Basics extends TestCase {static class __CLR4_4_1i1si1sle6np4ft{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,23638,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1i1si1sle6np4ft.R.inc(23392);
        __CLR4_4_1i1si1sle6np4ft.R.inc(23393);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i1si1sle6np4ft.R.inc(23394);
        __CLR4_4_1i1si1sle6np4ft.R.inc(23395);return new TestSuite(TestLocalDateTime_Basics.class);
    }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}

    public TestLocalDateTime_Basics(String name) {
        super(name);__CLR4_4_1i1si1sle6np4ft.R.inc(23397);try{__CLR4_4_1i1si1sle6np4ft.R.inc(23396);
    }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i1si1sle6np4ft.R.inc(23398);
        __CLR4_4_1i1si1sle6np4ft.R.inc(23399);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1i1si1sle6np4ft.R.inc(23400);zone = DateTimeZone.getDefault();
        __CLR4_4_1i1si1sle6np4ft.R.inc(23401);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1i1si1sle6np4ft.R.inc(23402);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1i1si1sle6np4ft.R.inc(23403);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i1si1sle6np4ft.R.inc(23404);
        __CLR4_4_1i1si1sle6np4ft.R.inc(23405);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i1si1sle6np4ft.R.inc(23406);DateTimeZone.setDefault(zone);
        __CLR4_4_1i1si1sle6np4ft.R.inc(23407);zone = null;
        __CLR4_4_1i1si1sle6np4ft.R.inc(23408);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1i1si1sle6np4ft.R.inc(23409);systemDefaultLocale = null;
    }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testEqualsHashCode_ISO104() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ka7rcmi2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testEqualsHashCode_ISO104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ka7rcmi2a(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23410); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23411);Chronology chrono1 = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23412);Chronology chrono2 = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23413);Chronology chrono3 = ISOChronology.getInstance(); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23414);assertEquals(true, chrono1.equals(chrono2)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23415);assertEquals(false, chrono1.equals(chrono3)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23416);DateTime dt1 = new DateTime(0L, chrono1); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23417);DateTime dt2 = new DateTime(0L, chrono2); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23418);DateTime dt3 = new DateTime(0L, chrono3); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23419);assertEquals(true, dt1.equals(dt2)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23420);assertEquals(false, dt1.equals(dt3)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23421);assertEquals(true, chrono1.hashCode() == chrono2.hashCode()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23422);assertEquals(false, chrono1.hashCode() == chrono3.hashCode()); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testParse_noFormatter151() throws Throwable {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mgqh0pi2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testParse_noFormatter151",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mgqh0pi2n() throws Throwable{try{__CLR4_4_1i1si1sle6np4ft.R.inc(23423); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23424);assertEquals(new LocalDate(2010, 6, 30), LocalDate.parse("2010-06-30")); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23425);assertEquals(new LocalDate(2010, 1, 2), LocalDate.parse("2010-002")); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testGet_DateTimeFieldType512() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rv9vs1i2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGet_DateTimeFieldType512",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rv9vs1i2q(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23426); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23427);LocalDate test = new LocalDate(); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23428);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23429);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23430);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23431);assertEquals(2, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23432);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23433);assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23434);assertEquals(1970, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23435);try { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23436);test.get(null); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23437);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23438);try { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23439);test.get(DateTimeFieldType.hourOfDay()); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23440);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testMinusMinutes_int517() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmdoofi35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMinutes_int517",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmdoofi35(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23441); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23442);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23443);LocalTime result = test.minusMinutes(1); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23444);LocalTime expected = new LocalTime(1, 1, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23445);assertEquals(expected, result); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23446);result = test.minusMinutes(0); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23447);assertSame(test, result); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testFactory_fromCalendarFields546() throws Exception {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oabedmi3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testFactory_fromCalendarFields546",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oabedmi3c() throws Exception{try{__CLR4_4_1i1si1sle6np4ft.R.inc(23448); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23449);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23450);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23451);LocalDateTime expected = new LocalDateTime(1970, 2, 3, 4, 5, 6, 7); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23452);assertEquals(expected, LocalDateTime.fromCalendarFields(cal)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23453);try { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23454);LocalDateTime.fromCalendarFields((Calendar) null); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23455);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testPropertyWithMaxMinValueHour552() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hnlybli3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPropertyWithMaxMinValueHour552",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hnlybli3k(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23456); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23457);LocalDateTime test = new LocalDateTime(2005, 6, 9, 0, 20, 30, 40); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23458);check(test.hourOfDay().withMaximumValue(), 2005, 6, 9, 23, 20, 30, 40); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23459);check(test.hourOfDay().withMinimumValue(), 2005, 6, 9, 0, 20, 30, 40); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testPropertyHashCode553() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19t42tki3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPropertyHashCode553",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19t42tki3o(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23460); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23461);LocalDateTime test1 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23462);LocalDateTime test2 = new LocalDateTime(2005, 11, 9, 10, 20, 30, 40); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23463);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23464);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23465);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23466);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testProperty554() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_126t2ngi3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testProperty554",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_126t2ngi3v(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23467); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23468);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, GJ_UTC); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23469);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23470);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23471);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23472);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23473);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23474);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23475);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23476);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23477);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23478);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23479);assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23480);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23481);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23482);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23483);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23484);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23485);try { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23486);test.property(null); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23487);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23488);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalDateTime()); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testIsAfter_LocalDateTime555() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1296dyji4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsAfter_LocalDateTime555",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1296dyji4h(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23489); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23490);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23491);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23492);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23493);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23494);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23495);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23496);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23497);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23498);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23499);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23500);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23501);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23502);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23503);try { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23504);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isAfter(null); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23505);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testToDate_springDST_2Hour40Savings556() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wm8oz9i4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST_2Hour40Savings556",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wm8oz9i4y(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23506); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23507);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 30, 0); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23508);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23509);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23510);try { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23511);TimeZone.setDefault(testZone); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23512);Date test = base.toDate(); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23513);check(base, 2007, 4, 2, 0, 20, 30, 0); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23514);assertEquals("Mon Apr 02 01:40:00 GMT+03:40 2007", test.toString()); 
     } finally { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23515);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testToDate_autumnDST557() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmda0ji58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST557",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmda0ji58(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23516); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23517);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23518);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23519);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23520);try { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23521);TimeZone.setDefault(testZone); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23522);Date test = base.toDate(); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23523);check(base, 2007, 10, 2, 0, 20, 30, 0); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23524);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23525);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testToDate_autumnDST_Zone558() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vo7tpdi5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST_Zone558",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vo7tpdi5i(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23526); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23527);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23528);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23529);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23530);try { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23531);TimeZone.setDefault(testZone); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23532);Date test = base.toDate(); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23533);check(base, 2007, 10, 2, 0, 20, 30, 0); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23534);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23535);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testToDate_springDST559() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqn5v8i5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST559",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqn5v8i5s(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23536); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23537);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23538);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23539);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23540);try { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23541);TimeZone.setDefault(testZone); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23542);Date test = base.toDate(); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23543);check(base, 2007, 4, 2, 0, 20, 0, 0); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23544);assertEquals("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23545);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testToDate_autumnDST560() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jl8f0ri62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST560",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jl8f0ri62(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23546); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23547);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 0, 0); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23548);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23549);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23550);try { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23551);TimeZone.setDefault(testZone); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23552);Date test = base.toDate(); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23553);check(base, 2007, 10, 2, 0, 20, 0, 0); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23554);assertEquals("Tue Oct 02 00:20:00 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23555);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testWithField_DateTimeFieldType_int_1561() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k4ucyvi6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_1561",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k4ucyvi6c(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23556); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23557);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23558);LocalDateTime result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23559);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23560);assertEquals(new LocalDateTime(2006, 6, 9, 10, 20, 30, 40), result); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testWithField_DateTimeFieldType_int_2562() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c15qyvi6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_2562",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c15qyvi6h(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23561); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23562);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23563);try { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23564);test.withField(null, 6); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23565);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_2563() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hl6m3bi6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_2563",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hl6m3bi6m(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23566); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23567);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23568);try { 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23569);test.withFieldAdded(null, 0); 
         __CLR4_4_1i1si1sle6np4ft.R.inc(23570);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testPlusHours_int564() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5mlkpi6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusHours_int564",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5mlkpi6r(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23571); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23572);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23573);LocalDateTime result = test.plusHours(1); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23574);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23575);assertEquals(expected, result); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23576);result = test.plusHours(0); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23577);assertSame(test, result); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testPlusMillis_int565() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oklsihi6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMillis_int565",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oklsihi6y(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23578); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23579);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23580);LocalDateTime result = test.plusMillis(1); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23581);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 39, BUDDHIST_LONDON); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23582);assertEquals(expected, result); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23583);result = test.plusMillis(0); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23584);assertSame(test, result); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testMinusMonths_int566() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ypvj39i75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMonths_int566",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ypvj39i75(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23585); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23586);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23587);LocalDateTime result = test.minusMonths(1); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23588);LocalDateTime expected = new LocalDateTime(2002, 4, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23589);assertEquals(expected, result); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23590);result = test.minusMonths(0); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23591);assertSame(test, result); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testMinusWeeks_int567() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o8z91wi7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusWeeks_int567",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o8z91wi7c(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23592); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23593);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23594);LocalDateTime result = test.minusWeeks(1); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23595);LocalDateTime expected = new LocalDateTime(2002, 4, 26, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23596);assertEquals(expected, result); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23597);result = test.minusWeeks(0); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23598);assertSame(test, result); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testMinusHours_int568() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bqpt8di7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusHours_int568",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bqpt8di7j(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23599); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23600);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23601);LocalDateTime result = test.minusHours(1); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23602);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23603);assertEquals(expected, result); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23604);result = test.minusHours(0); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23605);assertSame(test, result); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
public void testGetters569() {__CLR4_4_1i1si1sle6np4ft.R.globalSliceStart(getClass().getName(),23606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133wjivi7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1si1sle6np4ft.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1si1sle6np4ft.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetters569",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133wjivi7q(){try{__CLR4_4_1i1si1sle6np4ft.R.inc(23606); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23607);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23608);assertEquals(1970, test.getYear()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23609);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23610);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23611);assertEquals(160, test.getDayOfYear()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23612);assertEquals(2, test.getDayOfWeek()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23613);assertEquals(24, test.getWeekOfWeekyear()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23614);assertEquals(1970, test.getWeekyear()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23615);assertEquals(70, test.getYearOfCentury()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23616);assertEquals(20, test.getCenturyOfEra()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23617);assertEquals(1970, test.getYearOfEra()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23618);assertEquals(DateTimeConstants.AD, test.getEra()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23619);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23620);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23621);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23622);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1i1si1sle6np4ft.R.inc(23623);assertEquals(MILLIS_OF_DAY_UTC, test.getMillisOfDay()); 
 }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1i1si1sle6np4ft.R.inc(23624);
            __CLR4_4_1i1si1sle6np4ft.R.inc(23625);return COPTIC_UTC;
        }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1i1si1sle6np4ft.R.inc(23626);
            __CLR4_4_1i1si1sle6np4ft.R.inc(23627);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
                COPTIC_UTC.millisOfDay(),
            };
        }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1i1si1sle6np4ft.R.inc(23628);
            __CLR4_4_1i1si1sle6np4ft.R.inc(23629);return new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC};
        }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
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
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1i1si1sle6np4ft.R.inc(23630);
        __CLR4_4_1i1si1sle6np4ft.R.inc(23631);assertEquals(year, test.getYear());
        __CLR4_4_1i1si1sle6np4ft.R.inc(23632);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1i1si1sle6np4ft.R.inc(23633);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1i1si1sle6np4ft.R.inc(23634);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1i1si1sle6np4ft.R.inc(23635);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1i1si1sle6np4ft.R.inc(23636);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1i1si1sle6np4ft.R.inc(23637);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1i1si1sle6np4ft.R.flushNeeded();}}
}
