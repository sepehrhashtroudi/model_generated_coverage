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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for DateMidnight.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Basics extends TestCase {static class __CLR4_4_1h0oh0ole6qsen4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,22280,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

    // the default time zone is set to LONDON in setUp()
    // we have to hard code LONDON here (instead of ISOChronology.getInstance() etc.)
    // as TestAll sets up a different time zone for better all-round testing
    private static final ISOChronology ISO_DEFAULT = ISOChronology.getInstance(LONDON);
    private static final ISOChronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final GJChronology GJ_DEFAULT = GJChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_DEFAULT = GregorianChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final BuddhistChronology BUDDHIST_DEFAULT = BuddhistChronology.getInstance(LONDON);
    private static final CopticChronology COPTIC_DEFAULT = CopticChronology.getInstance(LONDON);

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW_UTC =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME_NOW_LONDON =
            TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR;
//    private long TEST_TIME_NOW_PARIS =
//            TEST_TIME_NOW_UTC - 2*DateTimeConstants.MILLIS_PER_HOUR;
            
    // 2002-04-05
    private long TEST_TIME1_UTC =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_LONDON =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME1_PARIS =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - 2*DateTimeConstants.MILLIS_PER_HOUR;
        
    // 2003-05-06
    private long TEST_TIME2_UTC =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2_LONDON =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME2_PARIS =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22056);
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22057);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22058);
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22059);return new TestSuite(TestDateMidnight_Basics.class);
    }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}}

    public TestDateMidnight_Basics(String name) {
        super(name);__CLR4_4_1h0oh0ole6qsen4.R.inc(22061);try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22060);
    }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22062);
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22063);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22064);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22065);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22066);originalLocale = Locale.getDefault();
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22067);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22068);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22069);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22070);
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22071);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22072);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22073);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22074);Locale.setDefault(originalLocale);
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22075);originalDateTimeZone = null;
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22076);originalTimeZone = null;
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22077);originalLocale = null;
    }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToYearMonthDay19() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15k0t05h1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToYearMonthDay19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15k0t05h1a(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22078); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22079);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22080);YearMonthDay test = base.toYearMonthDay(); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22081);assertEquals(new YearMonthDay(TEST_TIME1_UTC, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testWithZoneRetainFields_DateTimeZone247() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzq7ygh1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithZoneRetainFields_DateTimeZone247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzq7ygh1e(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22082); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22083);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22084);DateMidnight result = test.withZoneRetainFields(PARIS); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22085);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22086);assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22087);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22088);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22089);result = test.withZoneRetainFields(null); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22090);assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22091);assertEquals(TEST_TIME1_LONDON, result.getMillis()); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22092);assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22093);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22094);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22095);assertSame(test, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22096);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22097);result = test.withZoneRetainFields(null); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22098);assertSame(test, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22099);test = new DateMidnight(TEST_TIME1_UTC, new MockNullZoneChronology()); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22100);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22101);assertSame(test, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testPlus_RD432() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zia0p7h1y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RD432",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zia0p7h1y(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22102); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22103);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22104);DateMidnight result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22105);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22106);assertEquals(expected, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22107);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22108);assertSame(test, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testMinusWeeks_int434() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l1ixrfh25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusWeeks_int434",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l1ixrfh25(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22109); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22110);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22111);DateMidnight result = test.minusWeeks(1); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22112);DateMidnight expected = new DateMidnight(2002, 4, 26, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22113);assertEquals(expected, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22114);result = test.minusWeeks(0); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22115);assertSame(test, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testToCalendar_Locale505() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18cefo3h2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToCalendar_Locale505",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18cefo3h2c(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22116); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22117);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22118);Calendar result = test.toCalendar(null); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22119);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22120);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone()); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22121);test = new DateMidnight(TEST_TIME1_UTC, PARIS); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22122);result = test.toCalendar(null); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22123);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22124);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22125);test = new DateMidnight(TEST_TIME1_UTC, PARIS); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22126);result = test.toCalendar(Locale.UK); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22127);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22128);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testWithers743() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ur0h3jh2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithers743",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ur0h3jh2p(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22129); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22130);DateMidnight test = new DateMidnight(1970, 6, 9, GJ_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22131);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22132);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22133);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22134);check(test.withDayOfYear(6), 1970, 1, 6); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22135);check(test.withDayOfWeek(6), 1970, 6, 13); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22136);check(test.withWeekOfWeekyear(6), 1970, 2, 3); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22137);check(test.withWeekyear(1971), 1971, 6, 15); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22138);check(test.withYearOfCentury(60), 1960, 6, 9); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22139);check(test.withCenturyOfEra(21), 2070, 6, 9); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22140);check(test.withYearOfEra(1066), 1066, 6, 9); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22141);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22142);try { 
         __CLR4_4_1h0oh0ole6qsen4.R.inc(22143);test.withMonthOfYear(0); 
         __CLR4_4_1h0oh0ole6qsen4.R.inc(22144);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22145);try { 
         __CLR4_4_1h0oh0ole6qsen4.R.inc(22146);test.withMonthOfYear(13); 
         __CLR4_4_1h0oh0ole6qsen4.R.inc(22147);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testWithFields_RPartial1435() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g5a3ihh38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFields_RPartial1435",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g5a3ihh38(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22148); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22149);DateMidnight test = new DateMidnight(2004, 5, 6); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22150);DateMidnight result = test.withFields(new YearMonthDay(2003, 4, 5)); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22151);DateMidnight expected = new DateMidnight(2003, 4, 5); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22152);assertEquals(expected, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22153);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22154);result = test.withFields(null); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22155);assertSame(test, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testWithField11436() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ated8h3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField11436",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ated8h3g(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22156); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22157);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22158);DateMidnight result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22159);assertEquals(new DateMidnight(2004, 6, 9), test); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22160);assertEquals(new DateMidnight(2006, 6, 9), result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testWithFieldAdded41437() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iky1esh3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded41437",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iky1esh3l(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22161); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22162);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22163);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22164);assertSame(test, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testWithFieldAdded21438() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_153y94zh3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded21438",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_153y94zh3p(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22165); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22166);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22167);try { 
         __CLR4_4_1h0oh0ole6qsen4.R.inc(22168);test.withFieldAdded(null, 0); 
         __CLR4_4_1h0oh0ole6qsen4.R.inc(22169);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testWithDurationAdded_long_int1439() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft98fbh3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_long_int1439",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft98fbh3u(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22170); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22171);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22172);DateMidnight result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22173);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22174);assertEquals(expected, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22175);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22176);assertSame(test, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22177);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22178);expected = new DateMidnight(test.getMillis() + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22179);assertEquals(expected, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22180);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22181);expected = new DateMidnight(test.getMillis() - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22182);assertEquals(expected, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testPlus_RP1440() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12123zrh47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RP1440",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12123zrh47(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22183); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22184);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22185);DateMidnight result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22186);DateMidnight expected = new DateMidnight(2003, 7, 28, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22187);assertEquals(expected, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22188);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22189);assertSame(test, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testPlus_long1441() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6odauh4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_long1441",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6odauh4e(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22190); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22191);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22192);DateMidnight result = test.plus(123456789L); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22193);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22194);assertEquals(expected, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testPlusYears_int1442() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rk7rxah4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusYears_int1442",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rk7rxah4j(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22195); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22196);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22197);DateMidnight result = test.plusYears(1); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22198);DateMidnight expected = new DateMidnight(2003, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22199);assertEquals(expected, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22200);result = test.plusYears(0); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22201);assertSame(test, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testPlusMonths_int1443() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13uyumwh4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusMonths_int1443",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13uyumwh4q(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22202); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22203);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22204);DateMidnight result = test.plusMonths(1); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22205);DateMidnight expected = new DateMidnight(2002, 6, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22206);assertEquals(expected, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22207);result = test.plusMonths(0); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22208);assertSame(test, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testPlusDays_int1444() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecr6ozh4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusDays_int1444",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecr6ozh4x(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22209); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22210);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22211);DateMidnight result = test.plusDays(1); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22212);DateMidnight expected = new DateMidnight(2002, 5, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22213);assertEquals(expected, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22214);result = test.plusDays(0); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22215);assertSame(test, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testMinus_long1445() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wj919kh54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_long1445",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wj919kh54(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22216); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22217);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22218);DateMidnight result = test.minus(123456789L); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22219);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22220);assertEquals(expected, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testMinusYears_int1446() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mtv7poh59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusYears_int1446",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mtv7poh59(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22221); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22222);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22223);DateMidnight result = test.minusYears(1); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22224);DateMidnight expected = new DateMidnight(2001, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22225);assertEquals(expected, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22226);result = test.minusYears(0); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22227);assertSame(test, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testMinusMonths_int1447() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcrjsih5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusMonths_int1447",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcrjsih5g(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22228); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22229);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22230);DateMidnight result = test.minusMonths(1); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22231);DateMidnight expected = new DateMidnight(2002, 4, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22232);assertEquals(expected, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22233);result = test.minusMonths(0); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22234);assertSame(test, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testMinusDays_int1448() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17jl843h5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusDays_int1448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17jl843h5n(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22235); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22236);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22237);DateMidnight result = test.minusDays(1); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22238);DateMidnight expected = new DateMidnight(2002, 5, 2, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22239);assertEquals(expected, result); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22240);result = test.minusDays(0); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22241);assertSame(test, result); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testProperty1449() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jlh60ah5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testProperty1449",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jlh60ah5u(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22242); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22243);DateMidnight test = new DateMidnight(); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22244);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22245);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22246);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22247);assertEquals(test.property(DateTimeFieldType.millisOfSecond()), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22248);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22249); 
             __CLR4_4_1h0oh0ole6qsen4.R.inc(22250);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22251); 
             __CLR4_4_1h0oh0ole6qsen4.R.inc(22252);return null; 
         }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22253); 
             __CLR4_4_1h0oh0ole6qsen4.R.inc(22254);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 
     }; 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22255);try { 
         __CLR4_4_1h0oh0ole6qsen4.R.inc(22256);test.property(bad); 
         __CLR4_4_1h0oh0ole6qsen4.R.inc(22257);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22258);try { 
         __CLR4_4_1h0oh0ole6qsen4.R.inc(22259);test.property(null); 
         __CLR4_4_1h0oh0ole6qsen4.R.inc(22260);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testToLocalDate1450() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xaf6vlh6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToLocalDate1450",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xaf6vlh6d(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22261); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22262);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22263);LocalDate test = base.toLocalDate(); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22264);assertEquals(new LocalDate(TEST_TIME1_UTC, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 


public void testToInterval1451() {__CLR4_4_1h0oh0ole6qsen4.R.globalSliceStart(getClass().getName(),22265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1os35x4h6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0oh0ole6qsen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0oh0ole6qsen4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToInterval1451",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1os35x4h6h(){try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22265); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22266);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22267);Interval test = base.toInterval(); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22268);DateMidnight end = base.plus(Period.days(1)); 
     __CLR4_4_1h0oh0ole6qsen4.R.inc(22269);assertEquals(new Interval(base, end), test); 
 }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22270);
            __CLR4_4_1h0oh0ole6qsen4.R.inc(22271);return null;
        }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22272);
            __CLR4_4_1h0oh0ole6qsen4.R.inc(22273);return TEST_TIME1_LONDON;
        }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22274);
            __CLR4_4_1h0oh0ole6qsen4.R.inc(22275);return ISO_DEFAULT;
        }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}}
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
    private void check(DateMidnight test, int year, int month, int day) {try{__CLR4_4_1h0oh0ole6qsen4.R.inc(22276);
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22277);assertEquals(year, test.getYear());
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22278);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1h0oh0ole6qsen4.R.inc(22279);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1h0oh0ole6qsen4.R.flushNeeded();}}

}
