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
public class TestLocalDateTime_Basics extends TestCase {static class __CLR4_4_1i0ii0ile6o79s4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,23472,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23346);
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23347);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23348);
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23349);return new TestSuite(TestLocalDateTime_Basics.class);
    }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}

    public TestLocalDateTime_Basics(String name) {
        super(name);__CLR4_4_1i0ii0ile6o79s4.R.inc(23351);try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23350);
    }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23352);
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23353);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23354);zone = DateTimeZone.getDefault();
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23355);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23356);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23357);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23358);
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23359);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23360);DateTimeZone.setDefault(zone);
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23361);zone = null;
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23362);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23363);systemDefaultLocale = null;
    }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToDate_autumnDST7() {__CLR4_4_1i0ii0ile6o79s4.R.globalSliceStart(getClass().getName(),23364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nmjajxi10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ii0ile6o79s4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ii0ile6o79s4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nmjajxi10(){try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23364); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23365);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23366);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23367);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23368);try { 
         __CLR4_4_1i0ii0ile6o79s4.R.inc(23369);TimeZone.setDefault(testZone); 
         __CLR4_4_1i0ii0ile6o79s4.R.inc(23370);Date test = base.toDate(); 
         __CLR4_4_1i0ii0ile6o79s4.R.inc(23371);check(base, 2007, 10, 2, 0, 20, 30, 0); 
         __CLR4_4_1i0ii0ile6o79s4.R.inc(23372);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1i0ii0ile6o79s4.R.inc(23373);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
public void testIsBefore_YMD8() {__CLR4_4_1i0ii0ile6o79s4.R.globalSliceStart(getClass().getName(),23374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iheknni1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ii0ile6o79s4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ii0ile6o79s4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsBefore_YMD8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iheknni1a(){try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23374); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23375);YearMonthDay test1 = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23376);YearMonthDay test1a = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23377);assertEquals(false, test1.isBefore(test1a)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23378);assertEquals(false, test1a.isBefore(test1)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23379);assertEquals(false, test1.isBefore(test1)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23380);assertEquals(false, test1a.isBefore(test1a)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23381);YearMonthDay test2 = new YearMonthDay(2005, 7, 2); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23382);assertEquals(true, test1.isBefore(test2)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23383);assertEquals(false, test2.isBefore(test1)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23384);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23385);assertEquals(true, test1.isBefore(test3)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23386);assertEquals(false, test3.isBefore(test1)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23387);assertEquals(false, test3.isBefore(test2)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23388);try { 
         __CLR4_4_1i0ii0ile6o79s4.R.inc(23389);new YearMonthDay(2005, 7, 2).isBefore(null); 
         __CLR4_4_1i0ii0ile6o79s4.R.inc(23390);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
public void testEqualsHashCode_ISO126() {__CLR4_4_1i0ii0ile6o79s4.R.globalSliceStart(getClass().getName(),23391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdm2nqi1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ii0ile6o79s4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ii0ile6o79s4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testEqualsHashCode_ISO126",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdm2nqi1r(){try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23391); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23392);Chronology chrono1 = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23393);Chronology chrono2 = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23394);Chronology chrono3 = ISOChronology.getInstance(); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23395);assertEquals(true, chrono1.equals(chrono2)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23396);assertEquals(false, chrono1.equals(chrono3)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23397);DateTime dt1 = new DateTime(0L, chrono1); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23398);DateTime dt2 = new DateTime(0L, chrono2); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23399);DateTime dt3 = new DateTime(0L, chrono3); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23400);assertEquals(true, dt1.equals(dt2)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23401);assertEquals(false, dt1.equals(dt3)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23402);assertEquals(true, chrono1.hashCode() == chrono2.hashCode()); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23403);assertEquals(false, chrono1.hashCode() == chrono3.hashCode()); 
 }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
public void testGetFieldType_int529() {__CLR4_4_1i0ii0ile6o79s4.R.globalSliceStart(getClass().getName(),23404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jpkynxi24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ii0ile6o79s4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ii0ile6o79s4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetFieldType_int529",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jpkynxi24(){try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23404); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23405);LocalDateTime test = new LocalDateTime(COPTIC_PARIS); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23406);assertSame(DateTimeFieldType.year(), test.getFieldType(0)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23407);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23408);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23409);assertSame(DateTimeFieldType.millisOfDay(), test.getFieldType(3)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23410);try { 
         __CLR4_4_1i0ii0ile6o79s4.R.inc(23411);test.getFieldType(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23412);try { 
         __CLR4_4_1i0ii0ile6o79s4.R.inc(23413);test.getFieldType(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
public void testIsAfter_LocalDateTime530() {__CLR4_4_1i0ii0ile6o79s4.R.globalSliceStart(getClass().getName(),23414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wrz0ui2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ii0ile6o79s4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ii0ile6o79s4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsAfter_LocalDateTime530",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wrz0ui2e(){try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23414); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23415);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23416);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23417);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23418);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23419);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23420);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23421);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23422);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23423);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23424);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23425);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23426);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23427);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23428);try { 
         __CLR4_4_1i0ii0ile6o79s4.R.inc(23429);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isAfter(null); 
         __CLR4_4_1i0ii0ile6o79s4.R.inc(23430);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
public void testWithTime_int_int_int532() {__CLR4_4_1i0ii0ile6o79s4.R.globalSliceStart(getClass().getName(),23431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sf72sai2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ii0ile6o79s4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ii0ile6o79s4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithTime_int_int_int532",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sf72sai2v(){try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23431); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23432);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23433);LocalDateTime result = test.withTime(12, 24, 0, 0); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23434);assertEquals(new LocalDateTime(2002, 6, 9, 10, 20, 30), test); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23435);assertEquals(new LocalDateTime(2002, 6, 9, 10, 20, 30), result); 
 }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_3533() {__CLR4_4_1i0ii0ile6o79s4.R.globalSliceStart(getClass().getName(),23436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14belndi30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ii0ile6o79s4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ii0ile6o79s4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_3533",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14belndi30(){try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23436); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23437);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23438);LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23439);assertSame(test, result); 
 }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_4534() {__CLR4_4_1i0ii0ile6o79s4.R.globalSliceStart(getClass().getName(),23440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cf37ndi34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ii0ile6o79s4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ii0ile6o79s4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_4534",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cf37ndi34(){try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23440); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23441);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23442);LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23443);assertSame(test, result); 
 }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
public void testMinusDays_int535() {__CLR4_4_1i0ii0ile6o79s4.R.globalSliceStart(getClass().getName(),23444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlw8h3i38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ii0ile6o79s4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ii0ile6o79s4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusDays_int535",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlw8h3i38(){try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23444); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23445);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23446);LocalDateTime result = test.minusDays(1); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23447);LocalDateTime expected = new LocalDateTime(2002, 5, 2, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23448);assertEquals(expected, result); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23449);result = test.minusDays(0); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23450);assertSame(test, result); 
 }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
public void testToString_String539() {__CLR4_4_1i0ii0ile6o79s4.R.globalSliceStart(getClass().getName(),23451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxemggi3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i0ii0ile6o79s4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i0ii0ile6o79s4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_String539",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxemggi3f(){try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23451); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23452);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23453);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23454);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23455);assertEquals("1970-06-09T10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23456);assertEquals("Tue 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1i0ii0ile6o79s4.R.inc(23457);assertEquals("1970-06-09T10:20:30.040", test.toString(null, null)); 
 }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23458);
            __CLR4_4_1i0ii0ile6o79s4.R.inc(23459);return COPTIC_UTC;
        }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23460);
            __CLR4_4_1i0ii0ile6o79s4.R.inc(23461);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
                COPTIC_UTC.millisOfDay(),
            };
        }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23462);
            __CLR4_4_1i0ii0ile6o79s4.R.inc(23463);return new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC};
        }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
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
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1i0ii0ile6o79s4.R.inc(23464);
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23465);assertEquals(year, test.getYear());
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23466);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23467);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23468);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23469);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23470);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1i0ii0ile6o79s4.R.inc(23471);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1i0ii0ile6o79s4.R.flushNeeded();}}
}
