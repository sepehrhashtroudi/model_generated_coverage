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
public class TestLocalDateTime_Basics extends TestCase {static class __CLR4_4_1k1tk1tle6qsexg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,26315,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1k1tk1tle6qsexg.R.inc(25985);
        __CLR4_4_1k1tk1tle6qsexg.R.inc(25986);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k1tk1tle6qsexg.R.inc(25987);
        __CLR4_4_1k1tk1tle6qsexg.R.inc(25988);return new TestSuite(TestLocalDateTime_Basics.class);
    }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}}

    public TestLocalDateTime_Basics(String name) {
        super(name);__CLR4_4_1k1tk1tle6qsexg.R.inc(25990);try{__CLR4_4_1k1tk1tle6qsexg.R.inc(25989);
    }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k1tk1tle6qsexg.R.inc(25991);
        __CLR4_4_1k1tk1tle6qsexg.R.inc(25992);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1k1tk1tle6qsexg.R.inc(25993);zone = DateTimeZone.getDefault();
        __CLR4_4_1k1tk1tle6qsexg.R.inc(25994);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1k1tk1tle6qsexg.R.inc(25995);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1k1tk1tle6qsexg.R.inc(25996);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k1tk1tle6qsexg.R.inc(25997);
        __CLR4_4_1k1tk1tle6qsexg.R.inc(25998);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k1tk1tle6qsexg.R.inc(25999);DateTimeZone.setDefault(zone);
        __CLR4_4_1k1tk1tle6qsexg.R.inc(26000);zone = null;
        __CLR4_4_1k1tk1tle6qsexg.R.inc(26001);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1k1tk1tle6qsexg.R.inc(26002);systemDefaultLocale = null;
    }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsBefore_LocalDateTime8() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19hagubk2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsBefore_LocalDateTime8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19hagubk2b(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26003); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26004);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26005);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26006);assertEquals(false, test1.isBefore(test1a)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26007);assertEquals(false, test1a.isBefore(test1)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26008);assertEquals(false, test1.isBefore(test1)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26009);assertEquals(false, test1a.isBefore(test1a)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26010);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26011);assertEquals(true, test1.isBefore(test2)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26012);assertEquals(false, test2.isBefore(test1)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26013);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26014);assertEquals(true, test1.isBefore(test3)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26015);assertEquals(false, test3.isBefore(test1)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26016);assertEquals(false, test3.isBefore(test2)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26017);try { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26018);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isBefore(null); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26019);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testToDate_autumnDST13() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1caynakk2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1caynakk2s(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26020); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26021);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26022);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26023);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26024);try { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26025);TimeZone.setDefault(testZone); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26026);Date test = base.toDate(); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26027);check(base, 2007, 10, 2, 0, 20, 30, 0); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26028);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26029);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testGetFieldTypes1280() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nijy9vk32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetFieldTypes1280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nijy9vk32(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26030); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26031);LocalDateTime test = new LocalDateTime(COPTIC_PARIS); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26032);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26033);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26034);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26035);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26036);assertSame(DateTimeFieldType.millisOfDay(), fields[3]); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26037);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testIsAfter_LocalDateTime1285() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c8rqc4k3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsAfter_LocalDateTime1285",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c8rqc4k3a(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26038); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26039);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26040);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26041);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26042);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26043);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26044);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26045);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26046);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26047);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26048);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26049);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26050);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26051);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26052);try { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26053);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isAfter(null); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26054);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testGetField_int1286() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1rzv8k3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetField_int1286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1rzv8k3r(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26055); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26056);LocalDateTime test = new LocalDateTime(COPTIC_PARIS); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26057);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26058);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26059);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26060);assertSame(COPTIC_UTC.millisOfDay(), test.getField(3)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26061);try { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26062);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26063);try { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26064);test.getField(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testToString_DTFormatter1287() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gjg54wk41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_DTFormatter1287",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gjg54wk41(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26065); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26066);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26067);assertEquals("2002 10", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26068);assertEquals("2002-06-09T10:20:30.040", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType1288() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17duck4k45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsSupported_DateTimeFieldType1288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17duck4k45(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26069); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26070);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26071);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26072);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26073);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26074);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26075);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26076);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26077);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26078);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26079);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26080);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26081);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26082);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26083);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26084);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26085);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26086);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26087);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26088);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26089);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26090);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26091);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26092);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26093);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26094);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testProperty1289() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wijrwwk4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testProperty1289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wijrwwk4v(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26095); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26096);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, GJ_UTC); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26097);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26098);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26099);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26100);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26101);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26102);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26103);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26104);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26105);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26106);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26107);assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26108);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26109);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26110);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26111);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26112);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26113);try { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26114);test.property(null); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26115);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26116);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalDateTime()); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testToDate_summer_Zone1290() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1umv6mvk5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_summer_Zone1290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1umv6mvk5h(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26117); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26118);LocalDateTime base = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26119);Date test = base.toDate(TimeZone.getDefault()); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26120);check(base, 2005, 7, 9, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26121);GregorianCalendar gcal = new GregorianCalendar(); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26122);gcal.clear(); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26123);gcal.set(Calendar.YEAR, 2005); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26124);gcal.set(Calendar.MONTH, Calendar.JULY); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26125);gcal.set(Calendar.DAY_OF_MONTH, 9); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26126);gcal.set(Calendar.HOUR_OF_DAY, 10); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26127);gcal.set(Calendar.MINUTE, 20); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26128);gcal.set(Calendar.SECOND, 30); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26129);gcal.set(Calendar.MILLISECOND, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26130);assertEquals(gcal.getTime(), test); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testToDateTime1291() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12nnwqgk5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime1291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12nnwqgk5v(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26131); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26132);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26133);DateTime test = base.toDateTime(); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26134);check(base, 2005, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26135);DateTime expected = new DateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26136);assertEquals(expected, test); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testToLocalDate1292() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvc0elk61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToLocalDate1292",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvc0elk61(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26137); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26138);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26139);LocalDate expected = new LocalDate(2005, 6, 9, COPTIC_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26140);assertEquals(expected, base.toLocalDate()); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testToLocalTime1293() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvlbgzk65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToLocalTime1293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvlbgzk65(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26141); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26142);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26143);LocalTime expected = new LocalTime(6, 7, 8, 9, COPTIC_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26144);assertEquals(expected, base.toLocalTime()); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testToDate_autumnDST_Zone1294() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17jupc3k69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST_Zone1294",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17jupc3k69(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26145); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26146);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26147);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26148);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26149);try { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26150);TimeZone.setDefault(testZone); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26151);Date test = base.toDate(TimeZone.getDefault()); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26152);check(base, 2007, 10, 2, 0, 20, 30, 0); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26153);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26154);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testToDate_springDST1295() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1brfsk6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST1295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1brfsk6j(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26155); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26156);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26157);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26158);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26159);try { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26160);TimeZone.setDefault(testZone); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26161);Date test = base.toDate(); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26162);check(base, 2007, 4, 2, 0, 20, 0, 0); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26163);assertEquals("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26164);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testWithDate1296() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m92ar9k6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithDate1296",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m92ar9k6t(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26165); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26166);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26167);LocalDateTime result = test.withDate(2006, 2, 1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26168);check(test, 2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26169);check(result, 2006, 2, 1, 10, 20, 30, 40); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testWithTime1297() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1714fcbk6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithTime1297",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1714fcbk6y(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26170); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26171);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26172);LocalDateTime result = test.withTime(9, 8, 7, 6); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26173);check(test, 2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26174);check(result, 2004, 6, 9, 9, 8, 7, 6); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_31298() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5pqqhk73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_31298",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5pqqhk73(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26175); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26176);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26177);LocalDateTime result = test.withField(DateTimeFieldType.year(), 2004); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26178);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26179);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_21299() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vreehzk78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_21299",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vreehzk78(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26180); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26181);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26182);try { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26183);test.withField(null, 6); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26184);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_11300() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7e5cmk7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_11300",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7e5cmk7d(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26185); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26186);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26187);LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26188);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26189);assertEquals(new LocalDateTime(2010, 6, 9, 10, 20, 30, 40), result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_21301() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eleb10k7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_21301",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eleb10k7i(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26190); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26191);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26192);try { 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26193);test.withFieldAdded(null, 0); 
         __CLR4_4_1k1tk1tle6qsexg.R.inc(26194);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_41302() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15dletrk7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_41302",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15dletrk7n(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26195); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26196);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26197);LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26198);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testMinus_RP1303() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zh4w7fk7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinus_RP1303",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zh4w7fk7r(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26199); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26200);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26201);LocalDateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26202);LocalDateTime expected = new LocalDateTime(2001, 3, 26, 9, 19, 29, 39, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26203);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26204);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26205);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testPlusYears_int1304() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149fcavk7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusYears_int1304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149fcavk7y(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26206); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26207);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26208);LocalDateTime result = test.plusYears(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26209);LocalDateTime expected = new LocalDateTime(2003, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26210);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26211);result = test.plusYears(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26212);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testPlusMonths_int1305() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zci343k85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMonths_int1305",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zci343k85(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26213); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26214);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26215);LocalDateTime result = test.plusMonths(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26216);LocalDateTime expected = new LocalDateTime(2002, 6, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26217);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26218);result = test.plusMonths(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26219);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testPlusWeeks_int1306() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ep0hqqk8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusWeeks_int1306",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ep0hqqk8c(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26220); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26221);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26222);LocalDateTime result = test.plusWeeks(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26223);LocalDateTime expected = new LocalDateTime(2002, 5, 10, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26224);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26225);result = test.plusWeeks(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26226);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testPlusHours_int1307() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wj2csdk8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusHours_int1307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wj2csdk8j(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26227); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26228);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26229);LocalDateTime result = test.plusHours(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26230);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 11, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26231);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26232);result = test.plusHours(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26233);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testPlusMinutes_int1308() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sml5kkk8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMinutes_int1308",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sml5kkk8q(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26234); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26235);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26236);LocalDateTime result = test.plusMinutes(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26237);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 21, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26238);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26239);result = test.plusMinutes(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26240);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testPlusSeconds_int1309() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4y5xk8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusSeconds_int1309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4y5xk8x(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26241); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26242);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26243);LocalDateTime result = test.plusSeconds(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26244);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 31, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26245);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26246);result = test.plusSeconds(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26247);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testPlusMillis_int1310() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qvl8qyk94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMillis_int1310",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qvl8qyk94(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26248); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26249);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26250);LocalDateTime result = test.plusMillis(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26251);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 41, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26252);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26253);result = test.plusMillis(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26254);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testMinusMonths_int1311() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196qqnek9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMonths_int1311",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196qqnek9b(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26255); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26256);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26257);LocalDateTime result = test.minusMonths(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26258);LocalDateTime expected = new LocalDateTime(2002, 4, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26259);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26260);result = test.minusMonths(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26261);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testMinusWeeks_int1312() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n58863k9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusWeeks_int1312",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n58863k9i(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26262); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26263);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26264);LocalDateTime result = test.minusWeeks(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26265);LocalDateTime expected = new LocalDateTime(2002, 4, 26, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26266);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26267);result = test.minusWeeks(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26268);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testMinusDays_int1313() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op0kmok9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusDays_int1313",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op0kmok9p(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26269); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26270);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26271);LocalDateTime result = test.minusDays(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26272);LocalDateTime expected = new LocalDateTime(2002, 5, 2, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26273);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26274);result = test.minusDays(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26275);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testMinusHours_int1314() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ktunkjk9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusHours_int1314",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ktunkjk9w(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26276); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26277);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26278);LocalDateTime result = test.minusHours(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26279);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 9, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26280);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26281);result = test.minusHours(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26282);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testMinusSeconds_int1315() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbirr2ka3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusSeconds_int1315",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbirr2ka3(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26283); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26284);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26285);LocalDateTime result = test.minusSeconds(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26286);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 29, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26287);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26288);result = test.minusSeconds(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26289);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testMinusMillis_int1316() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135urwikaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMillis_int1316",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135urwikaa(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26290); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26291);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26292);LocalDateTime result = test.minusMillis(1); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26293);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 39, BUDDHIST_LONDON); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26294);assertEquals(expected, result); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26295);result = test.minusMillis(0); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26296);assertSame(test, result); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 


public void testToString_String1320() {__CLR4_4_1k1tk1tle6qsexg.R.globalSliceStart(getClass().getName(),26297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rknc13kah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1tk1tle6qsexg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1tk1tle6qsexg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_String1320",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rknc13kah(){try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26297); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26298);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26299);assertEquals("2002 10", test.toString("yyyy HH")); 
     __CLR4_4_1k1tk1tle6qsexg.R.inc(26300);assertEquals("2002-06-09T10:20:30.040", test.toString((String) null)); 
 }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26301);
            __CLR4_4_1k1tk1tle6qsexg.R.inc(26302);return COPTIC_UTC;
        }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26303);
            __CLR4_4_1k1tk1tle6qsexg.R.inc(26304);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
                COPTIC_UTC.millisOfDay(),
            };
        }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26305);
            __CLR4_4_1k1tk1tle6qsexg.R.inc(26306);return new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC};
        }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}}
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
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1k1tk1tle6qsexg.R.inc(26307);
        __CLR4_4_1k1tk1tle6qsexg.R.inc(26308);assertEquals(year, test.getYear());
        __CLR4_4_1k1tk1tle6qsexg.R.inc(26309);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1k1tk1tle6qsexg.R.inc(26310);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1k1tk1tle6qsexg.R.inc(26311);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1k1tk1tle6qsexg.R.inc(26312);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1k1tk1tle6qsexg.R.inc(26313);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1k1tk1tle6qsexg.R.inc(26314);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1k1tk1tle6qsexg.R.flushNeeded();}}
}
