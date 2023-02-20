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
public class TestDateMidnight_Basics extends TestCase {static class __CLR4_4_1h0mh0mle6qe96k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,22317,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22054);
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22055);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22056);
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22057);return new TestSuite(TestDateMidnight_Basics.class);
    }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}}

    public TestDateMidnight_Basics(String name) {
        super(name);__CLR4_4_1h0mh0mle6qe96k.R.inc(22059);try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22058);
    }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22060);
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22061);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22062);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22063);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22064);originalLocale = Locale.getDefault();
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22065);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22066);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22067);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22068);
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22069);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22070);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22071);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22072);Locale.setDefault(originalLocale);
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22073);originalDateTimeZone = null;
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22074);originalTimeZone = null;
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22075);originalLocale = null;
    }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToYearMonthDay26() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pivt69h18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToYearMonthDay26",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pivt69h18(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22076); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22077);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22078);YearMonthDay test = base.toYearMonthDay(); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22079);assertEquals(new YearMonthDay(TEST_TIME1_UTC, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testGet_DateTimeFieldType253() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmlpsph1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testGet_DateTimeFieldType253",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmlpsph1c(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22080); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22081);DateMidnight test = new DateMidnight(); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22082);assertEquals(1, test.get(DateTimeFieldType.era())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22083);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22084);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22085);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22086);assertEquals(2002, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22087);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22088);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22089);assertEquals(2002, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22090);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22091);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22092);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22093);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22094);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22095);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22096);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22097);assertEquals(0, test.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22098);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22099);assertEquals(0, test.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22100);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22101);assertEquals(0, test.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22102);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22103);assertEquals(0, test.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22104);try { 
         __CLR4_4_1h0mh0mle6qe96k.R.inc(22105);test.get((DateTimeFieldType) null); 
         __CLR4_4_1h0mh0mle6qe96k.R.inc(22106);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testWithZoneRetainFields_DateTimeZone269() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q34j9kh23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithZoneRetainFields_DateTimeZone269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q34j9kh23(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22107); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22108);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22109);DateMidnight result = test.withZoneRetainFields(PARIS); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22110);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22111);assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22112);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22113);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22114);result = test.withZoneRetainFields(null); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22115);assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22116);assertEquals(TEST_TIME1_LONDON, result.getMillis()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22117);assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22118);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22119);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22120);assertSame(test, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22121);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22122);result = test.withZoneRetainFields(null); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22123);assertSame(test, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22124);test = new DateMidnight(TEST_TIME1_UTC, new MockNullZoneChronology()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22125);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22126);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testEqualsHashCode290() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_132g8jgh2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testEqualsHashCode290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_132g8jgh2n(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22127); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22128);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22129);DateMidnight test2 = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22130);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22131);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22132);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22133);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22134);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22135);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22136);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22137);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22138);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22139);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22140);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22141);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22142);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22143);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22144);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22145);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22146);assertEquals(false, test1.equals(new DateMidnight(TEST_TIME1_UTC, GREGORIAN_DEFAULT))); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testMinusWeeks_int458() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mg4k19h37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusWeeks_int458",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mg4k19h37(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22147); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22148);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22149);DateMidnight result = test.minusWeeks(1); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22150);DateMidnight expected = new DateMidnight(2002, 4, 26, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22151);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22152);result = test.minusWeeks(0); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22153);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testToCalendar_Locale525() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_138zt7zh3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToCalendar_Locale525",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_138zt7zh3e(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22154); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22155);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22156);Calendar result = test.toCalendar(null); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22157);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22158);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22159);test = new DateMidnight(TEST_TIME1_UTC, PARIS); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22160);result = test.toCalendar(null); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22161);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22162);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22163);test = new DateMidnight(TEST_TIME1_UTC, PARIS); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22164);result = test.toCalendar(Locale.UK); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22165);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22166);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testWithers756() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t8rynh3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithers756",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t8rynh3r(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22167); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22168);DateMidnight test = new DateMidnight(1970, 6, 9, GJ_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22169);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22170);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22171);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22172);check(test.withDayOfYear(6), 1970, 1, 6); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22173);check(test.withDayOfWeek(6), 1970, 6, 13); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22174);check(test.withWeekOfWeekyear(6), 1970, 2, 3); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22175);check(test.withWeekyear(1971), 1971, 6, 15); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22176);check(test.withYearOfCentury(60), 1960, 6, 9); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22177);check(test.withCenturyOfEra(21), 2070, 6, 9); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22178);check(test.withYearOfEra(1066), 1066, 6, 9); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22179);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22180);try { 
         __CLR4_4_1h0mh0mle6qe96k.R.inc(22181);test.withMonthOfYear(0); 
         __CLR4_4_1h0mh0mle6qe96k.R.inc(22182);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22183);try { 
         __CLR4_4_1h0mh0mle6qe96k.R.inc(22184);test.withMonthOfYear(13); 
         __CLR4_4_1h0mh0mle6qe96k.R.inc(22185);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testWithChronology_Chronology1442() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrs1f5h4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithChronology_Chronology1442",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrs1f5h4a(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22186); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22187);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22188);DateMidnight result = test.withChronology(GREGORIAN_PARIS); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22189);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22190);assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22191);assertEquals(GREGORIAN_PARIS, result.getChronology()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22192);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22193);result = test.withChronology(null); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22194);assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22195);assertEquals(TEST_TIME1_LONDON - DateTimeConstants.MILLIS_PER_DAY, result.getMillis()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22196);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22197);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22198);result = test.withChronology(null); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22199);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22200);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22201);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22202);result = test.withChronology(ISO_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22203);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testWithFields_RPartial1443() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnyzi2h4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFields_RPartial1443",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnyzi2h4s(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22204); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22205);DateMidnight test = new DateMidnight(2004, 5, 6); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22206);DateMidnight result = test.withFields(new YearMonthDay(2003, 4, 5)); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22207);DateMidnight expected = new DateMidnight(2003, 4, 5); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22208);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22209);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22210);result = test.withFields(null); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22211);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testWithField21444() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5ft46h50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField21444",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5ft46h50(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22212); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22213);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22214);try { 
         __CLR4_4_1h0mh0mle6qe96k.R.inc(22215);test.withField(null, 6); 
         __CLR4_4_1h0mh0mle6qe96k.R.inc(22216);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testWithFieldAdded41445() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t8b1lrh55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded41445",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t8b1lrh55(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22217); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22218);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22219);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22220);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testWithFieldAdded11446() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jytckfh59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded11446",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jytckfh59(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22221); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22222);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22223);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22224);assertEquals(new DateMidnight(2004, 6, 9), test); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22225);assertEquals(new DateMidnight(2010, 6, 9), result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testWithDurationAdded_long_int1447() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzzul8h5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_long_int1447",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzzul8h5e(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22226); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22227);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22228);DateMidnight result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22229);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22230);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22231);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22232);assertSame(test, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22233);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22234);expected = new DateMidnight(test.getMillis() + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22235);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22236);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22237);expected = new DateMidnight(test.getMillis() - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22238);assertEquals(expected, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testPlus_RP1448() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s11ubjh5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RP1448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s11ubjh5r(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22239); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22240);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22241);DateMidnight result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22242);DateMidnight expected = new DateMidnight(2003, 7, 28, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22243);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22244);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22245);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testPlusYears_int1449() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14t80dzh5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusYears_int1449",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14t80dzh5y(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22246); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22247);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22248);DateMidnight result = test.plusYears(1); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22249);DateMidnight expected = new DateMidnight(2003, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22250);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22251);result = test.plusYears(0); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22252);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testPlusMonths_int1450() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nttut0h65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusMonths_int1450",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nttut0h65(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22253); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22254);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22255);DateMidnight result = test.plusMonths(1); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22256);DateMidnight expected = new DateMidnight(2002, 6, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22257);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22258);result = test.plusMonths(0); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22259);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testPlusWeeks_int1451() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12u8doph6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusWeeks_int1451",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12u8doph6c(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22260); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22261);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22262);DateMidnight result = test.plusWeeks(1); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22263);DateMidnight expected = new DateMidnight(2002, 5, 10, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22264);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22265);result = test.plusWeeks(0); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22266);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testPlusDays_int1452() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18v3s9mh6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusDays_int1452",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18v3s9mh6j(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22267); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22268);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22269);DateMidnight result = test.plusDays(1); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22270);DateMidnight expected = new DateMidnight(2002, 5, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22271);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22272);result = test.plusDays(0); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22273);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testMinus_long1453() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fa01qzh6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_long1453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fa01qzh6q(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22274); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22275);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22276);DateMidnight result = test.minus(123456789L); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22277);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22278);assertEquals(expected, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testMinus_RD1454() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dti4hoh6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RD1454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dti4hoh6v(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22279); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22280);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22281);DateMidnight result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22282);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22283);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22284);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22285);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testMinus_RP1455() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1onriafh72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RP1455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1onriafh72(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22286); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22287);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22288);DateMidnight result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22289);DateMidnight expected = new DateMidnight(2001, 3, 25, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22290);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22291);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22292);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testMinusMonths_int1456() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143dykh79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusMonths_int1456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143dykh79(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22293); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22294);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22295);DateMidnight result = test.minusMonths(1); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22296);DateMidnight expected = new DateMidnight(2002, 4, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22297);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22298);result = test.minusMonths(0); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22299);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 


public void testMinusDays_int1457() {__CLR4_4_1h0mh0mle6qe96k.R.globalSliceStart(getClass().getName(),22300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y0g5v5h7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0mh0mle6qe96k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0mh0mle6qe96k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusDays_int1457",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y0g5v5h7g(){try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22300); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22301);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22302);DateMidnight result = test.minusDays(1); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22303);DateMidnight expected = new DateMidnight(2002, 5, 2, BUDDHIST_DEFAULT); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22304);assertEquals(expected, result); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22305);result = test.minusDays(0); 
     __CLR4_4_1h0mh0mle6qe96k.R.inc(22306);assertSame(test, result); 
 }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22307);
            __CLR4_4_1h0mh0mle6qe96k.R.inc(22308);return null;
        }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22309);
            __CLR4_4_1h0mh0mle6qe96k.R.inc(22310);return TEST_TIME1_LONDON;
        }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22311);
            __CLR4_4_1h0mh0mle6qe96k.R.inc(22312);return ISO_DEFAULT;
        }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}}
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
    private void check(DateMidnight test, int year, int month, int day) {try{__CLR4_4_1h0mh0mle6qe96k.R.inc(22313);
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22314);assertEquals(year, test.getYear());
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22315);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1h0mh0mle6qe96k.R.inc(22316);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1h0mh0mle6qe96k.R.flushNeeded();}}

}
