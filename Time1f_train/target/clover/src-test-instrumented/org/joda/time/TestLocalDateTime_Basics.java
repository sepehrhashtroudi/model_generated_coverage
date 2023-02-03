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
public class TestLocalDateTime_Basics extends TestCase {static class __CLR4_4_1kmmkmmlc8axdxz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,27139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26734);
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(26735);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26736);
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(26737);return new TestSuite(TestLocalDateTime_Basics.class);
    }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}}

    public TestLocalDateTime_Basics(String name) {
        super(name);__CLR4_4_1kmmkmmlc8axdxz.R.inc(26739);try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26738);
    }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26740);
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(26741);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(26742);zone = DateTimeZone.getDefault();
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(26743);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(26744);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(26745);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26746);
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(26747);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(26748);DateTimeZone.setDefault(zone);
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(26749);zone = null;
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(26750);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(26751);systemDefaultLocale = null;
    }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToDate_autumnDST88() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_114angukn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST88",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_114angukn4(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26752); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26753);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26754);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26755);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26756);try { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26757);TimeZone.setDefault(testZone); 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26758);Date test = base.toDate(); 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26759);check(base, 2007, 10, 2, 0, 20, 30, 0); 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26760);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26761);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testMinusMonths_int98() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jlwf4pkne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMonths_int98",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jlwf4pkne(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26762); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26763);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26764);LocalDateTime result = test.minusMonths(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26765);LocalDateTime expected = new LocalDateTime(2002, 4, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26766);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26767);result = test.minusMonths(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26768);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testIsBefore_LocalDateTime101() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odn67rknl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsBefore_LocalDateTime101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odn67rknl(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26769); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26770);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26771);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26772);assertEquals(false, test1.isBefore(test1a)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26773);assertEquals(false, test1a.isBefore(test1)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26774);assertEquals(false, test1.isBefore(test1)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26775);assertEquals(false, test1a.isBefore(test1a)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26776);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26777);assertEquals(true, test1.isBefore(test2)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26778);assertEquals(false, test2.isBefore(test1)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26779);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26780);assertEquals(true, test1.isBefore(test3)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26781);assertEquals(false, test3.isBefore(test1)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26782);assertEquals(false, test3.isBefore(test2)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26783);try { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26784);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isBefore(null); 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26785);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testMinusSeconds_int128() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oao72lko2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusSeconds_int128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oao72lko2(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26786); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26787);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26788);LocalDateTime result = test.minusSeconds(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26789);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 29, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26790);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26791);result = test.minusSeconds(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26792);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testMinusDays_int130() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zbhaz4ko9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusDays_int130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zbhaz4ko9(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26793); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26794);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26795);LocalDateTime result = test.minusDays(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26796);LocalDateTime expected = new LocalDateTime(2002, 5, 2, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26797);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26798);result = test.minusDays(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26799);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testPlusWeeks_int149() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16iiurqkog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusWeeks_int149",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16iiurqkog(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26800); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26801);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26802);LocalDateTime result = test.plusWeeks(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26803);LocalDateTime expected = new LocalDateTime(2002, 5, 10, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26804);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26805);result = test.plusWeeks(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26806);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testProperty220() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qwpivkkon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testProperty220",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qwpivkkon(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26807); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26808);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, GJ_UTC); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26809);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26810);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26811);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26812);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26813);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26814);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26815);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26816);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26817);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26818);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26819);assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26820);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26821);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26822);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26823);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26824);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26825);try { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26826);test.property(null); 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26827);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26828);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalDateTime()); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testWithers246() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juu86rkp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithers246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juu86rkp9(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26829); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26830);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26831);check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26832);check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26833);check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26834);check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26835);check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26836);check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26837);check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26838);check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26839);check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26840);check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26841);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26842);check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26843);check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26844);check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26845);check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26846);check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26847);try { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26848);test.withMonthOfYear(0); 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26849);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26850);try { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26851);test.withMonthOfYear(13); 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26852);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testMinus_RP295() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vowed2kpx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinus_RP295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vowed2kpx(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26853); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26854);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26855);LocalDateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26856);LocalDateTime expected = new LocalDateTime(2001, 3, 26, 9, 19, 29, 39, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26857);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26858);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26859);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testToString_String_Locale311() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1datcrxkq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_String_Locale311",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1datcrxkq4(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26860); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26861);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26862);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26863);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26864);assertEquals("1970-06-09T10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26865);assertEquals("Tue 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26866);assertEquals("1970-06-09T10:20:30.040", test.toString(null, null)); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testMinusMinutes_int369() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15oe1e4kqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMinutes_int369",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15oe1e4kqb(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26867); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26868);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26869);LocalDateTime result = test.minusMinutes(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26870);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 19, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26871);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26872);result = test.minusMinutes(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26873);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testToLocalTime375() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6tzg3kqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToLocalTime375",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6tzg3kqi(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26874); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26875);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26876);LocalTime expected = new LocalTime(6, 7, 8, 9, COPTIC_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26877);assertEquals(expected, base.toLocalTime()); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testGetters379() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvnqqukqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetters379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvnqqukqm(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26878); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26879);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26880);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26881);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26882);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26883);assertEquals(160, test.getDayOfYear()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26884);assertEquals(2, test.getDayOfWeek()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26885);assertEquals(24, test.getWeekOfWeekyear()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26886);assertEquals(1970, test.getWeekyear()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26887);assertEquals(70, test.getYearOfCentury()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26888);assertEquals(20, test.getCenturyOfEra()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26889);assertEquals(1970, test.getYearOfEra()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26890);assertEquals(DateTimeConstants.AD, test.getEra()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26891);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26892);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26893);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26894);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26895);assertEquals(MILLIS_OF_DAY_UTC, test.getMillisOfDay()); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testPlusDays_int386() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rldsnvkr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusDays_int386",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rldsnvkr4(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26896); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26897);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26898);LocalDateTime result = test.plusDays(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26899);LocalDateTime expected = new LocalDateTime(2002, 5, 4, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26900);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26901);result = test.plusDays(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26902);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testToString_String423() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140pf3ekrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_String423",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140pf3ekrb(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26903); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26904);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26905);assertEquals("2002 10", test.toString("yyyy HH")); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26906);assertEquals("2002-06-09T10:20:30.040", test.toString((String) null)); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testToDate_springDST445() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pgt9kkrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST445",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pgt9kkrf(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26907); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26908);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26909);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26910);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26911);try { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26912);TimeZone.setDefault(testZone); 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26913);Date test = base.toDate(); 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26914);check(base, 2007, 4, 2, 0, 20, 0, 0); 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26915);assertEquals("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26916);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testMinusWeeks_int581() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1foqrackrp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusWeeks_int581",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1foqrackrp(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26917); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26918);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26919);LocalDateTime result = test.minusWeeks(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26920);LocalDateTime expected = new LocalDateTime(2002, 4, 26, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26921);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26922);result = test.minusWeeks(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26923);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_1610() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15of145krw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_1610",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15of145krw(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26924); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26925);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26926);LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26927);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26928);assertEquals(new LocalDateTime(2010, 6, 9, 10, 20, 30, 40), result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testIsSupported_DurationFieldType661() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aux7krks1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsSupported_DurationFieldType661",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aux7krks1(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26929); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26930);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26931);assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26932);assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26933);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26934);assertEquals(true, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26935);assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26936);assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26937);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26938);assertEquals(true, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26939);assertEquals(true, test.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26940);assertEquals(true, test.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26941);assertEquals(true, test.isSupported(DurationFieldType.millis())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26942);assertEquals(true, test.isSupported(DurationFieldType.halfdays())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26943);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testPlusMonths_int679() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avrvwwksg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMonths_int679",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avrvwwksg(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26944); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26945);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26946);LocalDateTime result = test.plusMonths(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26947);LocalDateTime expected = new LocalDateTime(2002, 6, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26948);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26949);result = test.plusMonths(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26950);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testMinusYears_int732() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abhw7fksn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusYears_int732",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abhw7fksn(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26951); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26952);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26953);LocalDateTime result = test.minusYears(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26954);LocalDateTime expected = new LocalDateTime(2001, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26955);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26956);result = test.minusYears(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26957);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testPlusMillis_int739() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6fmaqksu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMillis_int739",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6fmaqksu(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26958); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26959);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26960);LocalDateTime result = test.plusMillis(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26961);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 41, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26962);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26963);result = test.plusMillis(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26964);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testMinusMillis_int847() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzslfykt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMillis_int847",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzslfykt1(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26965); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26966);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26967);LocalDateTime result = test.minusMillis(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26968);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 39, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26969);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26970);result = test.minusMillis(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26971);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testWithDate866() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p70u13kt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithDate866",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p70u13kt8(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26972); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26973);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26974);LocalDateTime result = test.withDate(2006, 2, 1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26975);check(test, 2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26976);check(result, 2006, 2, 1, 10, 20, 30, 40); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_2932() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wc2vwgktd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_2932",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wc2vwgktd(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26977); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26978);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26979);try { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26980);test.withField(null, 6); 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(26981);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testPlusYears_int991() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19idixqkti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusYears_int991",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19idixqkti(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26982); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26983);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26984);LocalDateTime result = test.plusYears(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26985);LocalDateTime expected = new LocalDateTime(2003, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26986);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26987);result = test.plusYears(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26988);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testWithTime1041() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eq8efsktp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithTime1041",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eq8efsktp(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26989); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26990);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26991);LocalDateTime result = test.withTime(9, 8, 7, 6); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26992);check(test, 2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26993);check(result, 2004, 6, 9, 9, 8, 7, 6); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testPlusHours_int1046() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),26994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igtb7fktu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusHours_int1046",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igtb7fktu(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(26994); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26995);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26996);LocalDateTime result = test.plusHours(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26997);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 11, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26998);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(26999);result = test.plusHours(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27000);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_31078() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iam449ku1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_31078",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iam449ku1(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27001); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27002);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27003);LocalDateTime result = test.withField(DateTimeFieldType.year(), 2004); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27004);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27005);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testGetFieldTypes1113() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukdoc4ku6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetFieldTypes1113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukdoc4ku6(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27006); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27007);LocalDateTime test = new LocalDateTime(COPTIC_PARIS); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27008);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27009);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27010);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27011);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27012);assertSame(DateTimeFieldType.millisOfDay(), fields[3]); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27013);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testPlus_RP1131() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i18r62kue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlus_RP1131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i18r62kue(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27014); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27015);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27016);LocalDateTime result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27017);LocalDateTime expected = new LocalDateTime(2003, 7, 29, 15, 26, 37, 48, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27018);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27019);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27020);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testGetField_int1167() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2j3bmkul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetField_int1167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2j3bmkul(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27021); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27022);LocalDateTime test = new LocalDateTime(COPTIC_PARIS); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27023);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27024);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27025);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27026);assertSame(COPTIC_UTC.millisOfDay(), test.getField(3)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27027);try { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(27028);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27029);try { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(27030);test.getField(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType1186() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130p3u9kuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsSupported_DateTimeFieldType1186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130p3u9kuv(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27031); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27032);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27033);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27034);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27035);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27036);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27037);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27038);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27039);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27040);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27041);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27042);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27043);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27044);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27045);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27046);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27047);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27048);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27049);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27050);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27051);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27052);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27053);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27054);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27055);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27056);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testPlusSeconds_int1283() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17yiwp2kvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusSeconds_int1283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17yiwp2kvl(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27057); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27058);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27059);LocalDateTime result = test.plusSeconds(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27060);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 31, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27061);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27062);result = test.plusSeconds(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27063);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testToString_DTFormatter1342() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bqi668kvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_DTFormatter1342",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bqi668kvs(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27064); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27065);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27066);assertEquals("2002 10", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27067);assertEquals("2002-06-09T10:20:30.040", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testPlusMinutes_int1429() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5c6lwkvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMinutes_int1429",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5c6lwkvw(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27068); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27069);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27070);LocalDateTime result = test.plusMinutes(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27071);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 21, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27072);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27073);result = test.plusMinutes(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27074);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testGetValue_int1443() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skshk6kw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetValue_int1443",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skshk6kw3(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27075); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27076);LocalDateTime test = new LocalDateTime(ISO_UTC); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27077);assertEquals(1970, test.getValue(0)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27078);assertEquals(6, test.getValue(1)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27079);assertEquals(9, test.getValue(2)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27080);assertEquals(MILLIS_OF_DAY_UTC, test.getValue(3)); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27081);try { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(27082);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27083);try { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(27084);test.getValue(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testMinusHours_int1525() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vau1bkwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusHours_int1525",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vau1bkwd(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27085); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27086);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27087);LocalDateTime result = test.minusHours(1); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27088);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 9, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27089);assertEquals(expected, result); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27090);result = test.minusHours(0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27091);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testToDateTime1528() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ir3mc9kwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime1528",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ir3mc9kwk(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27092); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27093);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27094);DateTime test = base.toDateTime(); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27095);check(base, 2005, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27096);DateTime expected = new DateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27097);assertEquals(expected, test); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_21590() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9abeskwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_21590",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9abeskwq(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27098); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27099);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27100);try { 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(27101);test.withFieldAdded(null, 0); 
         __CLR4_4_1kmmkmmlc8axdxz.R.inc(27102);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testToLocalDate1646() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1isupcqkwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToLocalDate1646",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1isupcqkwv(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27103); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27104);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27105);LocalDate expected = new LocalDate(2005, 6, 9, COPTIC_LONDON); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27106);assertEquals(expected, base.toLocalDate()); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testToDate_summer_Zone1653() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzv8n2kwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_summer_Zone1653",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzv8n2kwz(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27107); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27108);LocalDateTime base = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27109);Date test = base.toDate(TimeZone.getDefault()); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27110);check(base, 2005, 7, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27111);GregorianCalendar gcal = new GregorianCalendar(); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27112);gcal.clear(); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27113);gcal.set(Calendar.YEAR, 2005); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27114);gcal.set(Calendar.MONTH, Calendar.JULY); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27115);gcal.set(Calendar.DAY_OF_MONTH, 9); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27116);gcal.set(Calendar.HOUR_OF_DAY, 10); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27117);gcal.set(Calendar.MINUTE, 20); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27118);gcal.set(Calendar.SECOND, 30); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27119);gcal.set(Calendar.MILLISECOND, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27120);assertEquals(gcal.getTime(), test); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_41726() {__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceStart(getClass().getName(),27121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r7qcrkxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmmkmmlc8axdxz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmmkmmlc8axdxz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_41726",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r7qcrkxd(){try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27121); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27122);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27123);LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1kmmkmmlc8axdxz.R.inc(27124);assertSame(test, result); 
 }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27125);
            __CLR4_4_1kmmkmmlc8axdxz.R.inc(27126);return COPTIC_UTC;
        }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27127);
            __CLR4_4_1kmmkmmlc8axdxz.R.inc(27128);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
                COPTIC_UTC.millisOfDay(),
            };
        }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27129);
            __CLR4_4_1kmmkmmlc8axdxz.R.inc(27130);return new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC};
        }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}}
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
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1kmmkmmlc8axdxz.R.inc(27131);
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(27132);assertEquals(year, test.getYear());
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(27133);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(27134);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(27135);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(27136);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(27137);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1kmmkmmlc8axdxz.R.inc(27138);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1kmmkmmlc8axdxz.R.flushNeeded();}}
}
