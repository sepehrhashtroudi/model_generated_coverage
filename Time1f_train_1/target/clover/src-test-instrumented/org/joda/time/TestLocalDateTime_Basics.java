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
public class TestLocalDateTime_Basics extends TestCase {static class __CLR4_4_1k2fk2fle6qe9lp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,26398,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26007);
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26008);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26009);
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26010);return new TestSuite(TestLocalDateTime_Basics.class);
    }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}}

    public TestLocalDateTime_Basics(String name) {
        super(name);__CLR4_4_1k2fk2fle6qe9lp.R.inc(26012);try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26011);
    }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26013);
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26014);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26015);zone = DateTimeZone.getDefault();
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26016);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26017);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26018);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26019);
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26020);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26021);DateTimeZone.setDefault(zone);
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26022);zone = null;
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26023);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26024);systemDefaultLocale = null;
    }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsBefore_LocalDateTime14() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qfwbuck2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsBefore_LocalDateTime14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qfwbuck2x(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26025); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26026);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26027);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26028);assertEquals(false, test1.isBefore(test1a)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26029);assertEquals(false, test1a.isBefore(test1)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26030);assertEquals(false, test1.isBefore(test1)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26031);assertEquals(false, test1a.isBefore(test1a)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26032);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26033);assertEquals(true, test1.isBefore(test2)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26034);assertEquals(false, test2.isBefore(test1)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26035);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26036);assertEquals(true, test1.isBefore(test3)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26037);assertEquals(false, test3.isBefore(test1)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26038);assertEquals(false, test3.isBefore(test2)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26039);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26040);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isBefore(null); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26041);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testToDate_autumnDST17() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p17vck3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p17vck3e(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26042); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26043);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26044);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26045);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26046);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26047);TimeZone.setDefault(testZone); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26048);Date test = base.toDate(); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26049);check(base, 2007, 10, 2, 0, 20, 30, 0); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26050);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26051);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testGetFieldTypes1287() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1orkc5yk3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetFieldTypes1287",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1orkc5yk3o(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26052); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26053);LocalDateTime test = new LocalDateTime(COPTIC_PARIS); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26054);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26055);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26056);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26057);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26058);assertSame(DateTimeFieldType.millisOfDay(), fields[3]); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26059);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testIsAfter_LocalDateTime1294() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e837eyk3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsAfter_LocalDateTime1294",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e837eyk3w(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26060); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26061);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26062);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26063);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26064);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26065);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26066);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26067);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26068);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26069);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26070);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26071);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26072);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26073);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26074);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26075);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isAfter(null); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26076);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testGetField_int1295() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kx246k4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetField_int1295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kx246k4d(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26077); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26078);LocalDateTime test = new LocalDateTime(COPTIC_PARIS); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26079);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26080);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26081);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26082);assertSame(COPTIC_UTC.millisOfDay(), test.getField(3)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26083);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26084);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26085);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26086);test.getField(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testGetValue_int1296() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwjvjyk4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetValue_int1296",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwjvjyk4n(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26087); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26088);LocalDateTime test = new LocalDateTime(ISO_UTC); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26089);assertEquals(1970, test.getValue(0)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26090);assertEquals(6, test.getValue(1)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26091);assertEquals(9, test.getValue(2)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26092);assertEquals(MILLIS_OF_DAY_UTC, test.getValue(3)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26093);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26094);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26095);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26096);test.getValue(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testGet_DateTimeFieldType1297() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvd9b8k4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGet_DateTimeFieldType1297",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvd9b8k4x(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26097); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26098);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26099);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26100);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26101);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26102);assertEquals(2, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26103);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26104);assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26105);assertEquals(1970, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26106);assertEquals(10, test.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26107);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26108);assertEquals(30, test.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26109);assertEquals(40, test.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26110);assertEquals(MILLIS_OF_DAY_UTC / 60000, test.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26111);assertEquals(MILLIS_OF_DAY_UTC / 1000, test.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26112);assertEquals(MILLIS_OF_DAY_UTC, test.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26113);assertEquals(10, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26114);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26115);test = new LocalDateTime(1970, 6, 9, 12, 30); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26116);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26117);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26118);assertEquals(12, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26119);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26120);test = new LocalDateTime(1970, 6, 9, 14, 30); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26121);assertEquals(2, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26122);assertEquals(2, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26123);assertEquals(14, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26124);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26125);test = new LocalDateTime(1970, 6, 9, 0, 30); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26126);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26127);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26128);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26129);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26130);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26131);test.get(null); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26132);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testIsSupported_DurationFieldType1298() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iptc7uk5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsSupported_DurationFieldType1298",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iptc7uk5x(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26133); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26134);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26135);assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26136);assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26137);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26138);assertEquals(true, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26139);assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26140);assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26141);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26142);assertEquals(true, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26143);assertEquals(true, test.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26144);assertEquals(true, test.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26145);assertEquals(true, test.isSupported(DurationFieldType.millis())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26146);assertEquals(true, test.isSupported(DurationFieldType.halfdays())); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26147);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testToDate_summer_Zone1299() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b59680k6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_summer_Zone1299",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b59680k6c(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26148); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26149);LocalDateTime base = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26150);Date test = base.toDate(TimeZone.getDefault()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26151);check(base, 2005, 7, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26152);GregorianCalendar gcal = new GregorianCalendar(); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26153);gcal.clear(); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26154);gcal.set(Calendar.YEAR, 2005); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26155);gcal.set(Calendar.MONTH, Calendar.JULY); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26156);gcal.set(Calendar.DAY_OF_MONTH, 9); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26157);gcal.set(Calendar.HOUR_OF_DAY, 10); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26158);gcal.set(Calendar.MINUTE, 20); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26159);gcal.set(Calendar.SECOND, 30); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26160);gcal.set(Calendar.MILLISECOND, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26161);assertEquals(gcal.getTime(), test); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testToLocalDate1300() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sw7gz9k6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToLocalDate1300",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sw7gz9k6q(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26162); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26163);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26164);LocalDate expected = new LocalDate(2005, 6, 9, COPTIC_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26165);assertEquals(expected, base.toLocalDate()); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testToLocalTime1301() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cupuwbk6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToLocalTime1301",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cupuwbk6u(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26166); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26167);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26168);LocalTime expected = new LocalTime(6, 7, 8, 9, COPTIC_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26169);assertEquals(expected, base.toLocalTime()); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testToDate_autumnDST_Zone1302() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkq5wrk6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST_Zone1302",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkq5wrk6y(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26170); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26171);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26172);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26173);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26174);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26175);TimeZone.setDefault(testZone); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26176);Date test = base.toDate(TimeZone.getDefault()); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26177);check(base, 2007, 10, 2, 0, 20, 30, 0); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26178);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26179);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testToDate_springDST1303() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m0gav4k78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST1303",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m0gav4k78(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26180); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26181);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26182);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26183);TimeZone currentZone = TimeZone.getDefault(); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26184);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26185);TimeZone.setDefault(testZone); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26186);Date test = base.toDate(); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26187);check(base, 2007, 4, 2, 0, 20, 0, 0); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26188);assertEquals("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString()); 
     } finally { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26189);TimeZone.setDefault(currentZone); 
     } 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testWithTime1304() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bszx4ik7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithTime1304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bszx4ik7i(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26190); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26191);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26192);LocalDateTime result = test.withTime(9, 8, 7, 6); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26193);check(test, 2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26194);check(result, 2004, 6, 9, 9, 8, 7, 6); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_31305() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdu8yak7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_31305",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdu8yak7n(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26195); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26196);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26197);LocalDateTime result = test.withField(DateTimeFieldType.year(), 2004); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26198);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26199);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_21306() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yhu5oyk7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_21306",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yhu5oyk7s(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26200); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26201);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26202);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26203);test.withField(null, 6); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26204);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_11307() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13gedtbk7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_11307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13gedtbk7x(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26205); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26206);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26207);LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26208);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26209);assertEquals(new LocalDateTime(2010, 6, 9, 10, 20, 30, 40), result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_21308() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_185lgibk82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_21308",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_185lgibk82(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26210); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26211);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26212);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26213);test.withFieldAdded(null, 0); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26214);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_41309() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4l6d2k87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_41309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4l6d2k87(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26215); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26216);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26217);LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26218);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testMinus_RP1310() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fl45llk8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinus_RP1310",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fl45llk8b(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26219); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26220);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26221);LocalDateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26222);LocalDateTime expected = new LocalDateTime(2001, 3, 26, 9, 19, 29, 39, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26223);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26224);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26225);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testPlus_RP1311() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apjw06k8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlus_RP1311",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apjw06k8i(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26226); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26227);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26228);LocalDateTime result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26229);LocalDateTime expected = new LocalDateTime(2003, 7, 29, 15, 26, 37, 48, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26230);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26231);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26232);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testPlusYears_int1312() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rhab9gk8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusYears_int1312",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rhab9gk8p(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26233); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26234);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26235);LocalDateTime result = test.plusYears(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26236);LocalDateTime expected = new LocalDateTime(2003, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26237);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26238);result = test.plusYears(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26239);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testPlusMonths_int1313() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4n45ik8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMonths_int1313",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4n45ik8w(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26240); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26241);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26242);LocalDateTime result = test.plusMonths(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26243);LocalDateTime expected = new LocalDateTime(2002, 6, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26244);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26245);result = test.plusMonths(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26246);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testPlusDays_int1314() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ucd5hdk93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusDays_int1314",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ucd5hdk93(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26247); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26248);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26249);LocalDateTime result = test.plusDays(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26250);LocalDateTime expected = new LocalDateTime(2002, 5, 4, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26251);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26252);result = test.plusDays(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26253);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testPlusHours_int1315() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19b7dtsk9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusHours_int1315",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19b7dtsk9a(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26254); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26255);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26256);LocalDateTime result = test.plusHours(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26257);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 11, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26258);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26259);result = test.plusHours(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26260);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testPlusMinutes_int1316() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6nxfzk9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMinutes_int1316",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6nxfzk9h(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26261); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26262);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26263);LocalDateTime result = test.plusMinutes(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26264);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 21, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26265);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26266);result = test.plusMinutes(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26267);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testPlusSeconds_int1317() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nvzx4ik9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusSeconds_int1317",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nvzx4ik9o(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26268); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26269);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26270);LocalDateTime result = test.plusSeconds(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26271);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 31, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26272);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26273);result = test.plusSeconds(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26274);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testPlusMillis_int1318() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5j2wek9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMillis_int1318",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5j2wek9v(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26275); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26276);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26277);LocalDateTime result = test.plusMillis(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26278);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 41, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26279);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26280);result = test.plusMillis(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26281);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testMinusYears_int1319() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t2ha4nka2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusYears_int1319",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t2ha4nka2(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26282); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26283);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26284);LocalDateTime result = test.minusYears(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26285);LocalDateTime expected = new LocalDateTime(2001, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26286);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26287);result = test.minusYears(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26288);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testMinusMonths_int1320() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdidkoka9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMonths_int1320",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdidkoka9(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26289); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26290);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26291);LocalDateTime result = test.minusMonths(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26292);LocalDateTime expected = new LocalDateTime(2002, 4, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26293);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26294);result = test.minusMonths(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26295);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testMinusWeeks_int1321() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lf0w1zkag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusWeeks_int1321",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lf0w1zkag(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26296); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26297);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26298);LocalDateTime result = test.minusWeeks(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26299);LocalDateTime expected = new LocalDateTime(2002, 4, 26, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26300);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26301);result = test.minusWeeks(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26302);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testMinusDays_int1322() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rud4ekan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusDays_int1322",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rud4ekan(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26303); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26304);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26305);LocalDateTime result = test.minusDays(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26306);LocalDateTime expected = new LocalDateTime(2002, 5, 2, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26307);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26308);result = test.minusDays(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26309);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testMinusHours_int1323() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15n0a6jkau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusHours_int1323",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15n0a6jkau(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26310); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26311);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26312);LocalDateTime result = test.minusHours(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26313);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 9, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26314);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26315);result = test.minusHours(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26316);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testMinusMinutes_int1324() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyptq4kb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMinutes_int1324",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyptq4kb1(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26317); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26318);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26319);LocalDateTime result = test.minusMinutes(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26320);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 19, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26321);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26322);result = test.minusMinutes(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26323);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testMinusSeconds_int1325() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dzqdojkb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusSeconds_int1325",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dzqdojkb8(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26324); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26325);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26326);LocalDateTime result = test.minusSeconds(1); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26327);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 29, 40, BUDDHIST_LONDON); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26328);assertEquals(expected, result); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26329);result = test.minusSeconds(0); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26330);assertSame(test, result); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testGetters1326() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1miooebkbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetters1326",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1miooebkbf(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26331); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26332);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26333);assertEquals(1970, test.getYear()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26334);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26335);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26336);assertEquals(160, test.getDayOfYear()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26337);assertEquals(2, test.getDayOfWeek()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26338);assertEquals(24, test.getWeekOfWeekyear()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26339);assertEquals(1970, test.getWeekyear()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26340);assertEquals(70, test.getYearOfCentury()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26341);assertEquals(20, test.getCenturyOfEra()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26342);assertEquals(1970, test.getYearOfEra()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26343);assertEquals(DateTimeConstants.AD, test.getEra()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26344);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26345);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26346);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26347);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26348);assertEquals(MILLIS_OF_DAY_UTC, test.getMillisOfDay()); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testWithers1327() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w79zzwkbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithers1327",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w79zzwkbx(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26349); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26350);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26351);check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26352);check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26353);check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26354);check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26355);check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26356);check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26357);check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26358);check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26359);check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26360);check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26361);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26362);check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26363);check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26364);check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26365);check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26366);check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26367);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26368);test.withMonthOfYear(0); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26369);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26370);try { 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26371);test.withMonthOfYear(13); 
         __CLR4_4_1k2fk2fle6qe9lp.R.inc(26372);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testToString_String1332() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18n7i3ekcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_String1332",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18n7i3ekcl(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26373); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26374);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26375);assertEquals("2002 10", test.toString("yyyy HH")); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26376);assertEquals("2002-06-09T10:20:30.040", test.toString((String) null)); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 


public void testToString_String_Locale1333() {__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceStart(getClass().getName(),26377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ycdm6okcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k2fk2fle6qe9lp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k2fk2fle6qe9lp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_String_Locale1333",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ycdm6okcp(){try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26377); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26378);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26379);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26380);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26381);assertEquals("1970-06-09T10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26382);assertEquals("Tue 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1k2fk2fle6qe9lp.R.inc(26383);assertEquals("1970-06-09T10:20:30.040", test.toString(null, null)); 
 }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26384);
            __CLR4_4_1k2fk2fle6qe9lp.R.inc(26385);return COPTIC_UTC;
        }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26386);
            __CLR4_4_1k2fk2fle6qe9lp.R.inc(26387);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
                COPTIC_UTC.millisOfDay(),
            };
        }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26388);
            __CLR4_4_1k2fk2fle6qe9lp.R.inc(26389);return new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC};
        }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}}
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
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1k2fk2fle6qe9lp.R.inc(26390);
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26391);assertEquals(year, test.getYear());
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26392);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26393);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26394);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26395);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26396);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1k2fk2fle6qe9lp.R.inc(26397);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1k2fk2fle6qe9lp.R.flushNeeded();}}
}
