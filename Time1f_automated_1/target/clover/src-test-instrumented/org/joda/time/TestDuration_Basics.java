/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractDuration;
import org.joda.time.base.BaseDuration;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestDuration_Basics extends TestCase {static class __CLR4_4_1hruhrule6ndph6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,23140,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1hruhrule6ndph6.R.inc(23034);
        __CLR4_4_1hruhrule6ndph6.R.inc(23035);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hruhrule6ndph6.R.inc(23036);
        __CLR4_4_1hruhrule6ndph6.R.inc(23037);return new TestSuite(TestDuration_Basics.class);
    }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}

    public TestDuration_Basics(String name) {
        super(name);__CLR4_4_1hruhrule6ndph6.R.inc(23039);try{__CLR4_4_1hruhrule6ndph6.R.inc(23038);
    }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hruhrule6ndph6.R.inc(23040);
        __CLR4_4_1hruhrule6ndph6.R.inc(23041);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hruhrule6ndph6.R.inc(23042);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hruhrule6ndph6.R.inc(23043);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hruhrule6ndph6.R.inc(23044);originalLocale = Locale.getDefault();
        __CLR4_4_1hruhrule6ndph6.R.inc(23045);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hruhrule6ndph6.R.inc(23046);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1hruhrule6ndph6.R.inc(23047);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hruhrule6ndph6.R.inc(23048);
        __CLR4_4_1hruhrule6ndph6.R.inc(23049);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hruhrule6ndph6.R.inc(23050);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hruhrule6ndph6.R.inc(23051);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hruhrule6ndph6.R.inc(23052);Locale.setDefault(originalLocale);
        __CLR4_4_1hruhrule6ndph6.R.inc(23053);originalDateTimeZone = null;
        __CLR4_4_1hruhrule6ndph6.R.inc(23054);originalTimeZone = null;
        __CLR4_4_1hruhrule6ndph6.R.inc(23055);originalLocale = null;
    }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToStandardDays80() {__CLR4_4_1hruhrule6ndph6.R.globalSliceStart(getClass().getName(),23056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ldl28hsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hruhrule6ndph6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hruhrule6ndph6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardDays80",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ldl28hsg(){try{__CLR4_4_1hruhrule6ndph6.R.inc(23056); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23057);Duration test = new Duration(0L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23058);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23059);test = new Duration(1L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23060);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23061);test = new Duration(3600000L - 1); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23062);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23063);test = new Duration(3600000L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23064);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23065);test = new Duration(3600000L + 1); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23066);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23067);test = new Duration(2 * 3600000L - 1); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23068);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23069);test = new Duration(2 * 3600000L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23070);assertEquals(Days.days(2), test.toStandardDays()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23071);test = new Duration(-1L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23072);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23073);test = new Duration(-3600000L + 1); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23074);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23075);test = new Duration(-3600000L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23076);assertEquals(Days.days(-1), test.toStandardDays()); 
 }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
public void testWithMillis_long181() {__CLR4_4_1hruhrule6ndph6.R.globalSliceStart(getClass().getName(),23077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e8de0kht1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hruhrule6ndph6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hruhrule6ndph6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis_long181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e8de0kht1(){try{__CLR4_4_1hruhrule6ndph6.R.inc(23077); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23078);Duration test = new Duration(123L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23079);Duration result = test.withMillis(8000L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23080);assertEquals(123L, result.getMillis()); 
 }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
public void testWithMillis_long182() {__CLR4_4_1hruhrule6ndph6.R.globalSliceStart(getClass().getName(),23081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hhdct1ht5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hruhrule6ndph6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hruhrule6ndph6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis_long182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hhdct1ht5(){try{__CLR4_4_1hruhrule6ndph6.R.inc(23081); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23082);Duration test = new Duration(123L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23083);Duration result = test.withMillis(8000L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23084);assertEquals(8123L, result.getMillis()); 
 }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
public void testWithMillis_long283() {__CLR4_4_1hruhrule6ndph6.R.globalSliceStart(getClass().getName(),23085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilimqfht9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hruhrule6ndph6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hruhrule6ndph6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis_long283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilimqfht9(){try{__CLR4_4_1hruhrule6ndph6.R.inc(23085); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23086);Duration test = new Duration(123L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23087);Duration result = test.withMillis(123L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23088);assertSame(test, result); 
 }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
public void testWithMillis_long284() {__CLR4_4_1hruhrule6ndph6.R.globalSliceStart(getClass().getName(),23089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1luiliwhtd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hruhrule6ndph6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hruhrule6ndph6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis_long284",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1luiliwhtd(){try{__CLR4_4_1hruhrule6ndph6.R.inc(23089); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23090);Duration test = new Duration(123L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23091);Duration result = test.withMillis(0L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23092);assertSame(test, result); 
 }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
public void testWithDurationAdded_RD_int385() {__CLR4_4_1hruhrule6ndph6.R.globalSliceStart(getClass().getName(),23093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1md3drehth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hruhrule6ndph6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hruhrule6ndph6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int385",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1md3drehth(){try{__CLR4_4_1hruhrule6ndph6.R.inc(23093); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23094);Duration test = new Duration(123L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23095);Duration result = test.withDurationAdded(new Duration(8000L), -1); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23096);assertEquals((123L - 8000L), result.getMillis()); 
 }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
public void testMinus_RD186() {__CLR4_4_1hruhrule6ndph6.R.globalSliceStart(getClass().getName(),23097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k5sgxvhtl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hruhrule6ndph6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hruhrule6ndph6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k5sgxvhtl(){try{__CLR4_4_1hruhrule6ndph6.R.inc(23097); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23098);Duration test = new Duration(123L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23099);Duration result = test.minus(new Duration(8000L)); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23100);assertEquals(123L - 8000L, result.getMillis()); 
 }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
public void testMinus_RD387() {__CLR4_4_1hruhrule6ndph6.R.globalSliceStart(getClass().getName(),23101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j53206htp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hruhrule6ndph6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hruhrule6ndph6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j53206htp(){try{__CLR4_4_1hruhrule6ndph6.R.inc(23101); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23102);Duration test = new Duration(123L); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23103);Duration result = test.minus(null); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23104);assertSame(test, result); 
 }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
public void testToPeriodTo279() {__CLR4_4_1hruhrule6ndph6.R.globalSliceStart(getClass().getName(),23105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrmk1ehtt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hruhrule6ndph6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hruhrule6ndph6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrmk1ehtt(){try{__CLR4_4_1hruhrule6ndph6.R.inc(23105); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23106);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1hruhrule6ndph6.R.inc(23107);Duration test = new Duration(length); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23108);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23109);Period result = test.toPeriodTo(dt); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23110);assertEquals(new Period(test, dt), result); 
 }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
public void testToIntervalTo280() {__CLR4_4_1hruhrule6ndph6.R.globalSliceStart(getClass().getName(),23111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5jaf8htz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hruhrule6ndph6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hruhrule6ndph6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalTo280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5jaf8htz(){try{__CLR4_4_1hruhrule6ndph6.R.inc(23111); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23112);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1hruhrule6ndph6.R.inc(23113);Duration test = new Duration(length); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23114);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23115);Interval result = test.toIntervalTo(dt); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23116);assertEquals(new Interval(test, dt), result); 
 }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference1318() throws Throwable {__CLR4_4_1hruhrule6ndph6.R.globalSliceStart(getClass().getName(),23117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gvxp01hu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hruhrule6ndph6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hruhrule6ndph6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testFactoryFieldDifference1318",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gvxp01hu5() throws Throwable{try{__CLR4_4_1hruhrule6ndph6.R.inc(23117); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23118);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23119);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1hruhrule6ndph6.R.inc(23120);Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23121);Period test = Period.fieldDifference(start, end); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23122);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23123);assertEquals(-1, test.getYears()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23124);assertEquals(2, test.getMonths()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23125);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23126);assertEquals(-2, test.getDays()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23127);assertEquals(0, test.getHours()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23128);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23129);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1hruhrule6ndph6.R.inc(23130);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    
    
    class MockDuration extends AbstractDuration {
        private final long iValue;
        public MockDuration(long value) {
            super();__CLR4_4_1hruhrule6ndph6.R.inc(23132);try{__CLR4_4_1hruhrule6ndph6.R.inc(23131);
            __CLR4_4_1hruhrule6ndph6.R.inc(23133);iValue = value;
        }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1hruhrule6ndph6.R.inc(23134);
            __CLR4_4_1hruhrule6ndph6.R.inc(23135);return iValue;
        }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
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
    

    static class MockMutableDuration extends BaseDuration {
        public MockMutableDuration(long duration) {
            super(duration);__CLR4_4_1hruhrule6ndph6.R.inc(23137);try{__CLR4_4_1hruhrule6ndph6.R.inc(23136);
        }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
        public void setMillis(long duration) {try{__CLR4_4_1hruhrule6ndph6.R.inc(23138);
            __CLR4_4_1hruhrule6ndph6.R.inc(23139);super.setMillis(duration);
        }finally{__CLR4_4_1hruhrule6ndph6.R.flushNeeded();}}
    }

}
