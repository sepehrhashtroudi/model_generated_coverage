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
public class TestLocalDateTime_Basics extends TestCase {static class __CLR4_4_1hk6hk6lccietn3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,22870,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1hk6hk6lccietn3.R.inc(22758);
        __CLR4_4_1hk6hk6lccietn3.R.inc(22759);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hk6hk6lccietn3.R.inc(22760);
        __CLR4_4_1hk6hk6lccietn3.R.inc(22761);return new TestSuite(TestLocalDateTime_Basics.class);
    }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}

    public TestLocalDateTime_Basics(String name) {
        super(name);__CLR4_4_1hk6hk6lccietn3.R.inc(22763);try{__CLR4_4_1hk6hk6lccietn3.R.inc(22762);
    }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hk6hk6lccietn3.R.inc(22764);
        __CLR4_4_1hk6hk6lccietn3.R.inc(22765);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1hk6hk6lccietn3.R.inc(22766);zone = DateTimeZone.getDefault();
        __CLR4_4_1hk6hk6lccietn3.R.inc(22767);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hk6hk6lccietn3.R.inc(22768);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1hk6hk6lccietn3.R.inc(22769);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hk6hk6lccietn3.R.inc(22770);
        __CLR4_4_1hk6hk6lccietn3.R.inc(22771);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hk6hk6lccietn3.R.inc(22772);DateTimeZone.setDefault(zone);
        __CLR4_4_1hk6hk6lccietn3.R.inc(22773);zone = null;
        __CLR4_4_1hk6hk6lccietn3.R.inc(22774);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1hk6hk6lccietn3.R.inc(22775);systemDefaultLocale = null;
    }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToDate_autumnDST28() {__CLR4_4_1hk6hk6lccietn3.R.globalSliceStart(getClass().getName(),22776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xnw37chko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk6hk6lccietn3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk6hk6lccietn3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST28",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xnw37chko(){try{__CLR4_4_1hk6hk6lccietn3.R.inc(22776); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22777);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22778);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22779);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22780);try { 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22781);TimeZone.setDefault(testZone); 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22782);Date test = base.toDate(); 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22783);check(base, 2007, 10, 2, 0, 20, 30, 0); 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22784);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22785);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}
public void testPropertyAddToCopyMonth215() {__CLR4_4_1hk6hk6lccietn3.R.globalSliceStart(getClass().getName(),22786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gmrg9hky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk6hk6lccietn3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk6hk6lccietn3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPropertyAddToCopyMonth215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gmrg9hky(){try{__CLR4_4_1hk6hk6lccietn3.R.inc(22786); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22787);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22788);LocalDateTime copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22789);check(test, 1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22790);check(copy, 1972, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22791);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22792);check(copy, 1973, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22793);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22794);check(copy, 1972, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22795);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22796);check(copy, 1971, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22797);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22798);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22799);check(copy, 1972, 2, 29, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22800);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22801);check(copy, 1972, 3, 31, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22802);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22803);check(copy, 1972, 4, 30, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22804);test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22805);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22806);check(copy, 1971, 2, 28, 10, 20, 30, 40); 
 }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}
public void testIsEqual_LocalDateTime216() {__CLR4_4_1hk6hk6lccietn3.R.globalSliceStart(getClass().getName(),22807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ebw5bhlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk6hk6lccietn3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk6hk6lccietn3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsEqual_LocalDateTime216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ebw5bhlj(){try{__CLR4_4_1hk6hk6lccietn3.R.inc(22807); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22808);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22809);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22810);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22811);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22812);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22813);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22814);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22815);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22816);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22817);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22818);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22819);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22820);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22821);try { 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22822);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isEqual(null); 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22823);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}
public void testIsEqual_LocalDateTime217() {__CLR4_4_1hk6hk6lccietn3.R.globalSliceStart(getClass().getName(),22824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nbuxshm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk6hk6lccietn3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk6hk6lccietn3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsEqual_LocalDateTime217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nbuxshm0(){try{__CLR4_4_1hk6hk6lccietn3.R.inc(22824); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22825);LocalDateTime test1 = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22826);LocalDateTime test1a = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22827);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22828);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22829);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22830);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22831);LocalDateTime test2 = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22832);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22833);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22834);LocalDateTime test3 = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40, GREGORIAN_UTC); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22835);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22836);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22837);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22838);try { 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22839);new LocalDateTime(2005, 7, 9, 10, 20, 30, 40).isEqual(null); 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22840);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}
public void testGet_DateTimeFieldType239() {__CLR4_4_1hk6hk6lccietn3.R.globalSliceStart(getClass().getName(),22841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ab4ajjhmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk6hk6lccietn3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk6hk6lccietn3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGet_DateTimeFieldType239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ab4ajjhmh(){try{__CLR4_4_1hk6hk6lccietn3.R.inc(22841); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22842);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22843);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22844);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22845);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22846);assertEquals(2, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22847);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22848);assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22849);assertEquals(1970, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22850);try { 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22851);test.get(null); 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22852);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hk6hk6lccietn3.R.inc(22853);try { 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22854);test.get(DateTimeFieldType.hourOfDay()); 
         __CLR4_4_1hk6hk6lccietn3.R.inc(22855);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1hk6hk6lccietn3.R.inc(22856);
            __CLR4_4_1hk6hk6lccietn3.R.inc(22857);return COPTIC_UTC;
        }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1hk6hk6lccietn3.R.inc(22858);
            __CLR4_4_1hk6hk6lccietn3.R.inc(22859);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
                COPTIC_UTC.millisOfDay(),
            };
        }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1hk6hk6lccietn3.R.inc(22860);
            __CLR4_4_1hk6hk6lccietn3.R.inc(22861);return new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC};
        }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}
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
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1hk6hk6lccietn3.R.inc(22862);
        __CLR4_4_1hk6hk6lccietn3.R.inc(22863);assertEquals(year, test.getYear());
        __CLR4_4_1hk6hk6lccietn3.R.inc(22864);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1hk6hk6lccietn3.R.inc(22865);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1hk6hk6lccietn3.R.inc(22866);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1hk6hk6lccietn3.R.inc(22867);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1hk6hk6lccietn3.R.inc(22868);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1hk6hk6lccietn3.R.inc(22869);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1hk6hk6lccietn3.R.flushNeeded();}}
}
