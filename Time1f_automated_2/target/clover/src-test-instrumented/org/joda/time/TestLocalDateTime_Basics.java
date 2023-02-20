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
public class TestLocalDateTime_Basics extends TestCase {static class __CLR4_4_1htthttle6nl89f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,23264,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1htthttle6nl89f.R.inc(23105);
        __CLR4_4_1htthttle6nl89f.R.inc(23106);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1htthttle6nl89f.R.inc(23107);
        __CLR4_4_1htthttle6nl89f.R.inc(23108);return new TestSuite(TestLocalDateTime_Basics.class);
    }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}

    public TestLocalDateTime_Basics(String name) {
        super(name);__CLR4_4_1htthttle6nl89f.R.inc(23110);try{__CLR4_4_1htthttle6nl89f.R.inc(23109);
    }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1htthttle6nl89f.R.inc(23111);
        __CLR4_4_1htthttle6nl89f.R.inc(23112);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1htthttle6nl89f.R.inc(23113);zone = DateTimeZone.getDefault();
        __CLR4_4_1htthttle6nl89f.R.inc(23114);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1htthttle6nl89f.R.inc(23115);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1htthttle6nl89f.R.inc(23116);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1htthttle6nl89f.R.inc(23117);
        __CLR4_4_1htthttle6nl89f.R.inc(23118);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1htthttle6nl89f.R.inc(23119);DateTimeZone.setDefault(zone);
        __CLR4_4_1htthttle6nl89f.R.inc(23120);zone = null;
        __CLR4_4_1htthttle6nl89f.R.inc(23121);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1htthttle6nl89f.R.inc(23122);systemDefaultLocale = null;
    }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testGetValue_int539() {__CLR4_4_1htthttle6nl89f.R.globalSliceStart(getClass().getName(),23123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b4450bhub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttle6nl89f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttle6nl89f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetValue_int539",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b4450bhub(){try{__CLR4_4_1htthttle6nl89f.R.inc(23123); 
     __CLR4_4_1htthttle6nl89f.R.inc(23124);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1htthttle6nl89f.R.inc(23125);assertEquals(1970, test.getValue(0)); 
     __CLR4_4_1htthttle6nl89f.R.inc(23126);assertEquals(6, test.getValue(1)); 
     __CLR4_4_1htthttle6nl89f.R.inc(23127);assertEquals(9, test.getValue(2)); 
     __CLR4_4_1htthttle6nl89f.R.inc(23128);try { 
         __CLR4_4_1htthttle6nl89f.R.inc(23129);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1htthttle6nl89f.R.inc(23130);try { 
         __CLR4_4_1htthttle6nl89f.R.inc(23131);test.getValue(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
public void testToString_DTFormatter541() {__CLR4_4_1htthttle6nl89f.R.globalSliceStart(getClass().getName(),23132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dn4owhuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttle6nl89f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttle6nl89f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_DTFormatter541",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dn4owhuk(){try{__CLR4_4_1htthttle6nl89f.R.inc(23132); 
     __CLR4_4_1htthttle6nl89f.R.inc(23133);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1htthttle6nl89f.R.inc(23134);assertEquals("2002 10", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1htthttle6nl89f.R.inc(23135);assertEquals("2002-06-09T10:20:30.040", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
public void testIsSupported_DurationFieldType542() {__CLR4_4_1htthttle6nl89f.R.globalSliceStart(getClass().getName(),23136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_164boyvhuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttle6nl89f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttle6nl89f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsSupported_DurationFieldType542",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_164boyvhuo(){try{__CLR4_4_1htthttle6nl89f.R.inc(23136); 
     __CLR4_4_1htthttle6nl89f.R.inc(23137);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1htthttle6nl89f.R.inc(23138);assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23139);assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23140);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23141);assertEquals(true, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23142);assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23143);assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23144);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23145);assertEquals(false, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23146);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
public void testPlus_RP544() {__CLR4_4_1htthttle6nl89f.R.globalSliceStart(getClass().getName(),23147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e866wlhuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttle6nl89f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttle6nl89f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlus_RP544",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e866wlhuz(){try{__CLR4_4_1htthttle6nl89f.R.inc(23147); 
     __CLR4_4_1htthttle6nl89f.R.inc(23148);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1htthttle6nl89f.R.inc(23149);LocalDateTime result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8)); 
     __CLR4_4_1htthttle6nl89f.R.inc(23150);LocalDateTime expected = new LocalDateTime(2003, 7, 28, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1htthttle6nl89f.R.inc(23151);assertEquals(expected, result); 
     __CLR4_4_1htthttle6nl89f.R.inc(23152);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1htthttle6nl89f.R.inc(23153);assertSame(test, result); 
 }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
public void testPlusDays_int545() {__CLR4_4_1htthttle6nl89f.R.globalSliceStart(getClass().getName(),23154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxaneehv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttle6nl89f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttle6nl89f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusDays_int545",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxaneehv6(){try{__CLR4_4_1htthttle6nl89f.R.inc(23154); 
     __CLR4_4_1htthttle6nl89f.R.inc(23155);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1htthttle6nl89f.R.inc(23156);LocalDateTime result = test.plusDays(1); 
     __CLR4_4_1htthttle6nl89f.R.inc(23157);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1htthttle6nl89f.R.inc(23158);assertEquals(expected, result); 
     __CLR4_4_1htthttle6nl89f.R.inc(23159);result = test.plusDays(0); 
     __CLR4_4_1htthttle6nl89f.R.inc(23160);assertSame(test, result); 
 }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
public void testPlusDays_int546() {__CLR4_4_1htthttle6nl89f.R.globalSliceStart(getClass().getName(),23161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18oaolxhvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttle6nl89f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttle6nl89f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusDays_int546",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18oaolxhvd(){try{__CLR4_4_1htthttle6nl89f.R.inc(23161); 
     __CLR4_4_1htthttle6nl89f.R.inc(23162);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1htthttle6nl89f.R.inc(23163);LocalDateTime result = test.plusDays(1); 
     __CLR4_4_1htthttle6nl89f.R.inc(23164);LocalDateTime expected = new LocalDateTime(2002, 5, 4, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1htthttle6nl89f.R.inc(23165);assertEquals(expected, result); 
     __CLR4_4_1htthttle6nl89f.R.inc(23166);result = test.plusDays(0); 
     __CLR4_4_1htthttle6nl89f.R.inc(23167);assertSame(test, result); 
 }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
public void testMinusYears_int547() {__CLR4_4_1htthttle6nl89f.R.globalSliceStart(getClass().getName(),23168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v41tyhhvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttle6nl89f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttle6nl89f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusYears_int547",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v41tyhhvk(){try{__CLR4_4_1htthttle6nl89f.R.inc(23168); 
     __CLR4_4_1htthttle6nl89f.R.inc(23169);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1htthttle6nl89f.R.inc(23170);LocalDateTime result = test.minusYears(1); 
     __CLR4_4_1htthttle6nl89f.R.inc(23171);LocalDateTime expected = new LocalDateTime(2001, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1htthttle6nl89f.R.inc(23172);assertEquals(expected, result); 
     __CLR4_4_1htthttle6nl89f.R.inc(23173);result = test.minusYears(0); 
     __CLR4_4_1htthttle6nl89f.R.inc(23174);assertSame(test, result); 
 }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
public void testMinusMinutes_int548() {__CLR4_4_1htthttle6nl89f.R.globalSliceStart(getClass().getName(),23175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19r2xrjhvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttle6nl89f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttle6nl89f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMinutes_int548",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19r2xrjhvr(){try{__CLR4_4_1htthttle6nl89f.R.inc(23175); 
     __CLR4_4_1htthttle6nl89f.R.inc(23176);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1htthttle6nl89f.R.inc(23177);LocalDateTime result = test.minusMinutes(1); 
     __CLR4_4_1htthttle6nl89f.R.inc(23178);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1htthttle6nl89f.R.inc(23179);assertEquals(expected, result); 
     __CLR4_4_1htthttle6nl89f.R.inc(23180);result = test.minusMinutes(0); 
     __CLR4_4_1htthttle6nl89f.R.inc(23181);assertSame(test, result); 
 }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
public void testGetters549() {__CLR4_4_1htthttle6nl89f.R.globalSliceStart(getClass().getName(),23182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18hhpd7hvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttle6nl89f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttle6nl89f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetters549",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18hhpd7hvy(){try{__CLR4_4_1htthttle6nl89f.R.inc(23182); 
     __CLR4_4_1htthttle6nl89f.R.inc(23183);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC); 
     __CLR4_4_1htthttle6nl89f.R.inc(23184);assertEquals(1970, test.getYear()); 
     __CLR4_4_1htthttle6nl89f.R.inc(23185);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1htthttle6nl89f.R.inc(23186);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1htthttle6nl89f.R.inc(23187);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1htthttle6nl89f.R.inc(23188);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1htthttle6nl89f.R.inc(23189);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1htthttle6nl89f.R.inc(23190);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1htthttle6nl89f.R.inc(23191);assertEquals(GJ_UTC, test.getChronology()); 
     __CLR4_4_1htthttle6nl89f.R.inc(23192);assertEquals(1970, test.getYearOfCentury()); 
     __CLR4_4_1htthttle6nl89f.R.inc(23193);assertEquals(20, test.getCenturyOfEra()); 
     __CLR4_4_1htthttle6nl89f.R.inc(23194);assertEquals(1970, test.getYearOfEra()); 
     __CLR4_4_1htthttle6nl89f.R.inc(23195);assertEquals(DateTimeConstants.AD, test.getEra()); 
 }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
public void testToString_String_Locale553() {__CLR4_4_1htthttle6nl89f.R.globalSliceStart(getClass().getName(),23196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y9bap9hwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttle6nl89f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttle6nl89f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_String_Locale553",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y9bap9hwc(){try{__CLR4_4_1htthttle6nl89f.R.inc(23196); 
     __CLR4_4_1htthttle6nl89f.R.inc(23197);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1htthttle6nl89f.R.inc(23198);assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     __CLR4_4_1htthttle6nl89f.R.inc(23199);assertEquals("10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1htthttle6nl89f.R.inc(23200);assertEquals("10 20", test.toString("H m", null)); 
     __CLR4_4_1htthttle6nl89f.R.inc(23201);assertEquals("10:20:30.040", test.toString(null, null)); 
 }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
public void testIsSupported_DateTimeFieldType595() {__CLR4_4_1htthttle6nl89f.R.globalSliceStart(getClass().getName(),23202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yg6e98hwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttle6nl89f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttle6nl89f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsSupported_DateTimeFieldType595",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yg6e98hwi(){try{__CLR4_4_1htthttle6nl89f.R.inc(23202); 
     __CLR4_4_1htthttle6nl89f.R.inc(23203);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1htthttle6nl89f.R.inc(23204);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23205);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23206);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23207);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23208);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23209);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23210);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23211);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23212);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23213);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23214);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23215);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23216);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23217);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23218);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23219);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23220);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23221);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23222);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23223);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23224);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23225);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday()));
}finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}

public void testIsSupported_DateTimeFieldType596() {__CLR4_4_1htthttle6nl89f.R.globalSliceStart(getClass().getName(),23226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xbxoxfhx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttle6nl89f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttle6nl89f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsSupported_DateTimeFieldType596",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xbxoxfhx6(){try{__CLR4_4_1htthttle6nl89f.R.inc(23226); 
     __CLR4_4_1htthttle6nl89f.R.inc(23227);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1htthttle6nl89f.R.inc(23228);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23229);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23230);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23231);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23232);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23233);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23234);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23235);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23236);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23237);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23238);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23239);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23240);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23241);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23242);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23243);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23244);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23245);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23246);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23247);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23248);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1htthttle6nl89f.R.inc(23249);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday()));
}finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1htthttle6nl89f.R.inc(23250);
            __CLR4_4_1htthttle6nl89f.R.inc(23251);return COPTIC_UTC;
        }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1htthttle6nl89f.R.inc(23252);
            __CLR4_4_1htthttle6nl89f.R.inc(23253);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
                COPTIC_UTC.millisOfDay(),
            };
        }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1htthttle6nl89f.R.inc(23254);
            __CLR4_4_1htthttle6nl89f.R.inc(23255);return new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC};
        }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
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
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1htthttle6nl89f.R.inc(23256);
        __CLR4_4_1htthttle6nl89f.R.inc(23257);assertEquals(year, test.getYear());
        __CLR4_4_1htthttle6nl89f.R.inc(23258);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1htthttle6nl89f.R.inc(23259);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1htthttle6nl89f.R.inc(23260);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1htthttle6nl89f.R.inc(23261);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1htthttle6nl89f.R.inc(23262);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1htthttle6nl89f.R.inc(23263);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1htthttle6nl89f.R.flushNeeded();}}
}
