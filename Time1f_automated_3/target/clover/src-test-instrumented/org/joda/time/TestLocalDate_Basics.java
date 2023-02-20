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
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Basics extends TestCase {static class __CLR4_4_1ibdibdle6np4gm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,23881,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
//    private static final int OFFSET = 1;
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
//    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
//    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    /** Mock zone simulating Asia/Gaza cutover at midnight 2007-04-01 */
    private static long CUTOVER_GAZA = 1175378400000L;
    private static int OFFSET_GAZA = 7200000;  // +02:00
    private static final DateTimeZone MOCK_GAZA = new MockZone(CUTOVER_GAZA, OFFSET_GAZA, 3600);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1ibdibdle6np4gm.R.inc(23737);
        __CLR4_4_1ibdibdle6np4gm.R.inc(23738);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ibdibdle6np4gm.R.inc(23739);
        __CLR4_4_1ibdibdle6np4gm.R.inc(23740);return new TestSuite(TestLocalDate_Basics.class);
    }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}

    public TestLocalDate_Basics(String name) {
        super(name);__CLR4_4_1ibdibdle6np4gm.R.inc(23742);try{__CLR4_4_1ibdibdle6np4gm.R.inc(23741);
    }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ibdibdle6np4gm.R.inc(23743);
        __CLR4_4_1ibdibdle6np4gm.R.inc(23744);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ibdibdle6np4gm.R.inc(23745);zone = DateTimeZone.getDefault();
        __CLR4_4_1ibdibdle6np4gm.R.inc(23746);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ibdibdle6np4gm.R.inc(23747);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1ibdibdle6np4gm.R.inc(23748);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ibdibdle6np4gm.R.inc(23749);
        __CLR4_4_1ibdibdle6np4gm.R.inc(23750);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ibdibdle6np4gm.R.inc(23751);DateTimeZone.setDefault(zone);
        __CLR4_4_1ibdibdle6np4gm.R.inc(23752);zone = null;
        __CLR4_4_1ibdibdle6np4gm.R.inc(23753);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1ibdibdle6np4gm.R.inc(23754);systemDefaultLocale = null;
    }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testIsSupported_DurationFieldType300() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r2tmw7ibv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DurationFieldType300",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r2tmw7ibv(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23755); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23756);LocalDate test = new LocalDate(); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23757);assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23758);assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23759);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23760);assertEquals(true, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23761);assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23762);assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23763);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23764);assertEquals(true, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23765);assertEquals(true, test.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23766);assertEquals(true, test.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23767);assertEquals(true, test.isSupported(DurationFieldType.millis())); 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
public void testParseLocalDate_year_month_week_2010301() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1edwqdpic8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testParseLocalDate_year_month_week_2010301",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1edwqdpic8(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23768); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23769);Chronology chrono = GJChronology.getInstanceUTC(); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23770);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23771);assertEquals(new LocalDate(2010, 1, 4, chrono), f.parseLocalDate("2010-01-01")); 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
public void testEqualsHashCode302() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyf374icc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCode302",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyf374icc(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23772); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23773);LocalDate test1 = new LocalDate(1970, 6, 9, GJ_UTC); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23774);LocalDate test2 = new LocalDate(1970, 6, 9, GJ_UTC); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23775);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23776);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23777);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23778);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23779);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23780);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23781);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23782);LocalDate test3 = new LocalDate(1971, 6, 9); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23783);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23784);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23785);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23786);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23787);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23788);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23789);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23790);assertEquals(true, test1.equals(new LocalDate(1970, 6, 9, GJ_UTC))); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23791);assertEquals(false, test1.equals(new LocalDate(1971, 6, 9, GJ_UTC))); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23792);assertEquals(false, test1.equals(new LocalDate(1971, 6, 9, GJ_UTC))); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23793);assertEquals(false, test1.equals(new LocalDate(1971, 6, 9, GJ_UTC))); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23794);assertEquals(false, test1.equals(new LocalDate(1971, 6, 9, GJ_UTC))); 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
public void testWithers303() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18jwbn5icz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithers303",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18jwbn5icz(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23795); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23796);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23797);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23798);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23799);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23800);check(test.withDayOfYear(6), 1970, 1, 6); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23801);check(test.withDayOfWeek(6), 1970, 6, 13); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23802);check(test.withWeekOfWeekyear(6), 1970, 2, 3); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23803);check(test.withWeekyear(1971), 1971, 6, 15); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23804);check(test.withYearOfCentury(60), 1960, 6, 9); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23805);check(test.withCenturyOfEra(21), 2070, 6, 9); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23806);check(test.withYearOfEra(1066), 1066, 6, 9); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23807);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23808);try { 
         __CLR4_4_1ibdibdle6np4gm.R.inc(23809);test.withMonthOfYear(0); 
         __CLR4_4_1ibdibdle6np4gm.R.inc(23810);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23811);try { 
         __CLR4_4_1ibdibdle6np4gm.R.inc(23812);test.withMonthOfYear(13); 
         __CLR4_4_1ibdibdle6np4gm.R.inc(23813);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
public void testToLocalDateTime_wrongChronologyLocalTime305() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3dccaidi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_wrongChronologyLocalTime305",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3dccaidi(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23814); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23815);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23816);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_PARIS); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23817);try { 
         __CLR4_4_1ibdibdle6np4gm.R.inc(23818);base.toLocalDateTime(tod); 
         __CLR4_4_1ibdibdle6np4gm.R.inc(23819);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
public void testWithField_DateTimeFieldType_int_2307() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrdulaido();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_2307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrdulaido(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23820); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23821);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23822);try { 
         __CLR4_4_1ibdibdle6np4gm.R.inc(23823);test.withField(null, 6); 
         __CLR4_4_1ibdibdle6np4gm.R.inc(23824);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_1308() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12zq4qnidt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_1308",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12zq4qnidt(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23825); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23826);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23827);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23828);assertEquals(new LocalDate(2004, 6, 9), test); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23829);assertEquals(new LocalDate(2010, 6, 9), result); 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_3309() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19yn4gwidy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_3309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19yn4gwidy(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23830); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23831);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23832);try { 
         __CLR4_4_1ibdibdle6np4gm.R.inc(23833);test.withFieldAdded(null, 0); 
         __CLR4_4_1ibdibdle6np4gm.R.inc(23834);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
public void testPlusDays_int310() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t02ap2ie3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusDays_int310",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t02ap2ie3(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23835); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23836);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23837);LocalDate result = test.plusDays(1); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23838);LocalDate expected = new LocalDate(2002, 5, 4, BUDDHIST_LONDON); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23839);assertEquals(expected, result); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23840);result = test.plusDays(0); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23841);assertSame(test, result); 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
public void testMinusDays_int312() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lhsi8aiea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusDays_int312",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lhsi8aiea(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23842); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23843);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23844);LocalDate result = test.minusDays(1); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23845);LocalDate expected = new LocalDate(2002, 5, 2, BUDDHIST_LONDON); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23846);assertEquals(expected, result); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23847);result = test.minusDays(0); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23848);assertSame(test, result); 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_8440() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kckj8xieh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_8440",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kckj8xieh(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23849); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23850);LocalTime test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23851);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23852);assertEquals(new LocalTime(23, 59, 59, 999), result); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23853);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23854);result = test.withFieldAdded(DurationFieldType.seconds(), -1); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23855);assertEquals(new LocalTime(23, 59, 59, 0), result); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23856);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23857);result = test.withFieldAdded(DurationFieldType.minutes(), -1); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23858);assertEquals(new LocalTime(23, 59, 0, 0), result); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23859);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23860);result = test.withFieldAdded(DurationFieldType.hours(), -1); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23861);assertEquals(new LocalTime(23, 0, 0, 0), result); 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_4442() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x9b6i3ieu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_4442",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x9b6i3ieu(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23862); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23863);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23864);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23865);assertSame(test, result); 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
public void testToDateTimeAtStartOfDay590() {__CLR4_4_1ibdibdle6np4gm.R.globalSliceStart(getClass().getName(),23866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_195plcbiey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibdibdle6np4gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibdibdle6np4gm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay590",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_195plcbiey(){try{__CLR4_4_1ibdibdle6np4gm.R.inc(23866); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23867);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23868);DateTime test = base.toDateTimeAtStartOfDay(); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23869);check(base, 2005, 6, 9); 
     __CLR4_4_1ibdibdle6np4gm.R.inc(23870);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1ibdibdle6np4gm.R.inc(23871);
            __CLR4_4_1ibdibdle6np4gm.R.inc(23872);return COPTIC_UTC;
        }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1ibdibdle6np4gm.R.inc(23873);
            __CLR4_4_1ibdibdle6np4gm.R.inc(23874);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1ibdibdle6np4gm.R.inc(23875);
            __CLR4_4_1ibdibdle6np4gm.R.inc(23876);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
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
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int hour, int min, int sec) {try{__CLR4_4_1ibdibdle6np4gm.R.inc(23877);
        __CLR4_4_1ibdibdle6np4gm.R.inc(23878);assertEquals(hour, test.getYear());
        __CLR4_4_1ibdibdle6np4gm.R.inc(23879);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1ibdibdle6np4gm.R.inc(23880);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1ibdibdle6np4gm.R.flushNeeded();}}
}
