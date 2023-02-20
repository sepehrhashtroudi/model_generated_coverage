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
public class TestDateMidnight_Basics extends TestCase {static class __CLR4_4_1h1qh1qle6rjc2w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,22400,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22094);
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22095);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22096);
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22097);return new TestSuite(TestDateMidnight_Basics.class);
    }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}}

    public TestDateMidnight_Basics(String name) {
        super(name);__CLR4_4_1h1qh1qle6rjc2w.R.inc(22099);try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22098);
    }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22100);
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22101);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22102);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22103);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22104);originalLocale = Locale.getDefault();
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22105);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22106);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22107);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22108);
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22109);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22110);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22111);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22112);Locale.setDefault(originalLocale);
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22113);originalDateTimeZone = null;
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22114);originalTimeZone = null;
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22115);originalLocale = null;
    }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToYearMonthDay22() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1civy0dh2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToYearMonthDay22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1civy0dh2c(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22116); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22117);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22118);YearMonthDay test = base.toYearMonthDay(); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22119);assertEquals(new YearMonthDay(TEST_TIME1_UTC, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testGet_DateTimeFieldType258() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5ii82h2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testGet_DateTimeFieldType258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5ii82h2g(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22120); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22121);DateMidnight test = new DateMidnight(); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22122);assertEquals(1, test.get(DateTimeFieldType.era())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22123);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22124);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22125);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22126);assertEquals(2002, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22127);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22128);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22129);assertEquals(2002, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22130);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22131);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22132);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22133);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22134);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22135);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22136);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22137);assertEquals(0, test.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22138);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22139);assertEquals(0, test.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22140);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22141);assertEquals(0, test.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22142);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22143);assertEquals(0, test.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22144);try { 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22145);test.get((DateTimeFieldType) null); 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22146);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testWithZoneRetainFields_DateTimeZone276() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1649j3gh37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithZoneRetainFields_DateTimeZone276",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1649j3gh37(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22147); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22148);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22149);DateMidnight result = test.withZoneRetainFields(PARIS); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22150);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22151);assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22152);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22153);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22154);result = test.withZoneRetainFields(null); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22155);assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22156);assertEquals(TEST_TIME1_LONDON, result.getMillis()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22157);assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22158);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22159);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22160);assertSame(test, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22161);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22162);result = test.withZoneRetainFields(null); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22163);assertSame(test, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22164);test = new DateMidnight(TEST_TIME1_UTC, new MockNullZoneChronology()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22165);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22166);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testEqualsHashCode300() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bgf5m6h3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testEqualsHashCode300",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bgf5m6h3r(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22167); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22168);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22169);DateMidnight test2 = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22170);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22171);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22172);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22173);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22174);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22175);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22176);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22177);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22178);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22179);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22180);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22181);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22182);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22183);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22184);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22185);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22186);assertEquals(false, test1.equals(new DateMidnight(TEST_TIME1_UTC, GREGORIAN_DEFAULT))); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testPlus_RD464() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avtfgsh4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RD464",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avtfgsh4b(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22187); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22188);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22189);DateMidnight result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22190);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22191);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22192);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22193);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testMinusWeeks_int466() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pd4izah4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusWeeks_int466",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pd4izah4i(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22194); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22195);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22196);DateMidnight result = test.minusWeeks(1); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22197);DateMidnight expected = new DateMidnight(2002, 4, 26, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22198);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22199);result = test.minusWeeks(0); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22200);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testToCalendar_Locale538() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yt92a5h4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToCalendar_Locale538",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yt92a5h4p(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22201); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22202);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22203);Calendar result = test.toCalendar(null); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22204);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22205);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22206);test = new DateMidnight(TEST_TIME1_UTC, PARIS); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22207);result = test.toCalendar(null); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22208);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22209);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22210);test = new DateMidnight(TEST_TIME1_UTC, PARIS); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22211);result = test.toCalendar(Locale.UK); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22212);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22213);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testWithers776() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cen0uph52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithers776",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cen0uph52(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22214); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22215);DateMidnight test = new DateMidnight(1970, 6, 9, GJ_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22216);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22217);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22218);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22219);check(test.withDayOfYear(6), 1970, 1, 6); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22220);check(test.withDayOfWeek(6), 1970, 6, 13); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22221);check(test.withWeekOfWeekyear(6), 1970, 2, 3); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22222);check(test.withWeekyear(1971), 1971, 6, 15); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22223);check(test.withYearOfCentury(60), 1960, 6, 9); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22224);check(test.withCenturyOfEra(21), 2070, 6, 9); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22225);check(test.withYearOfEra(1066), 1066, 6, 9); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22226);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22227);try { 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22228);test.withMonthOfYear(0); 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22229);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22230);try { 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22231);test.withMonthOfYear(13); 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22232);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testWithChronology_Chronology1434() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q1h1leh5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithChronology_Chronology1434",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q1h1leh5l(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22233); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22234);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22235);DateMidnight result = test.withChronology(GREGORIAN_PARIS); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22236);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22237);assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22238);assertEquals(GREGORIAN_PARIS, result.getChronology()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22239);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22240);result = test.withChronology(null); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22241);assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22242);assertEquals(TEST_TIME1_LONDON - DateTimeConstants.MILLIS_PER_DAY, result.getMillis()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22243);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22244);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22245);result = test.withChronology(null); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22246);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22247);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22248);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22249);result = test.withChronology(ISO_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22250);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testWithFields_RPartial1435() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g5a3ihh63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFields_RPartial1435",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g5a3ihh63(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22251); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22252);DateMidnight test = new DateMidnight(2004, 5, 6); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22253);DateMidnight result = test.withFields(new YearMonthDay(2003, 4, 5)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22254);DateMidnight expected = new DateMidnight(2003, 4, 5); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22255);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22256);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22257);result = test.withFields(null); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22258);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testWithField21436() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hnt9wdh6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField21436",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hnt9wdh6b(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22259); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22260);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22261);try { 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22262);test.withField(null, 6); 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22263);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testWithField11437() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cjtd5ph6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField11437",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cjtd5ph6g(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22264); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22265);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22266);DateMidnight result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22267);assertEquals(new DateMidnight(2004, 6, 9), test); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22268);assertEquals(new DateMidnight(2006, 6, 9), result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testWithFieldAdded41438() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lty079h6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded41438",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lty079h6l(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22269); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22270);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22271);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22272);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testWithFieldAdded21439() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18cy7xgh6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded21439",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18cy7xgh6p(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22273); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22274);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22275);try { 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22276);test.withFieldAdded(null, 0); 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22277);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testWithFieldAdded11440() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtjtlh6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded11440",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtjtlh6u(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22278); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22279);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22280);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22281);assertEquals(new DateMidnight(2004, 6, 9), test); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22282);assertEquals(new DateMidnight(2010, 6, 9), result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testWithDurationAdded_long_int1441() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jj4en2h6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_long_int1441",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jj4en2h6z(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22283); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22284);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22285);DateMidnight result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22286);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22287);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22288);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22289);assertSame(test, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22290);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22291);expected = new DateMidnight(test.getMillis() + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22292);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22293);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22294);expected = new DateMidnight(test.getMillis() - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22295);assertEquals(expected, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testPlus_RP1442() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18j21kph7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RP1442",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18j21kph7c(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22296); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22297);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22298);DateMidnight result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22299);DateMidnight expected = new DateMidnight(2003, 7, 28, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22300);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22301);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22302);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testPlus_long1443() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qooavsh7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_long1443",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qooavsh7j(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22303); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22304);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22305);DateMidnight result = test.plus(123456789L); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22306);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22307);assertEquals(expected, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testPlusMonths_int1444() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_173ytfdh7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusMonths_int1444",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_173ytfdh7o(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22308); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22309);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22310);DateMidnight result = test.plusMonths(1); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22311);DateMidnight expected = new DateMidnight(2002, 6, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22312);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22313);result = test.plusMonths(0); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22314);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testPlusWeeks_int1445() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dvmnoyh7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusWeeks_int1445",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dvmnoyh7v(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22315); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22316);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22317);DateMidnight result = test.plusWeeks(1); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22318);DateMidnight expected = new DateMidnight(2002, 5, 10, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22319);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22320);result = test.plusWeeks(0); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22321);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testMinus_long1446() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z8v1x3h82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_long1446",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z8v1x3h82(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22322); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22323);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22324);DateMidnight result = test.minus(123456789L); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22325);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22326);assertEquals(expected, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testMinus_RD1447() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165cvogh87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RD1447",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165cvogh87(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22327); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22328);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22329);DateMidnight result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22330);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22331);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22332);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22333);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testMinus_RP1448() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qehjilh8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RP1448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qehjilh8e(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22334); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22335);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22336);DateMidnight result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22337);DateMidnight expected = new DateMidnight(2001, 3, 25, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22338);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22339);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22340);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testMinusYears_int1449() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2vbc9h8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusYears_int1449",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2vbc9h8l(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22341); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22342);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22343);DateMidnight result = test.minusYears(1); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22344);DateMidnight expected = new DateMidnight(2001, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22345);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22346);result = test.minusYears(0); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22347);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testMinusMonths_int1450() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdwesah8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusMonths_int1450",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdwesah8s(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22348); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22349);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22350);DateMidnight result = test.minusMonths(1); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22351);DateMidnight expected = new DateMidnight(2002, 4, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22352);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22353);result = test.minusMonths(0); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22354);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testMinusDays_int1451() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eigd4bh8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusDays_int1451",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eigd4bh8z(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22355); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22356);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22357);DateMidnight result = test.minusDays(1); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22358);DateMidnight expected = new DateMidnight(2002, 5, 2, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22359);assertEquals(expected, result); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22360);result = test.minusDays(0); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22361);assertSame(test, result); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testProperty1452() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmm102h96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testProperty1452",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmm102h96(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22362); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22363);DateMidnight test = new DateMidnight(); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22364);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22365);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22366);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22367);assertEquals(test.property(DateTimeFieldType.millisOfSecond()), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22368);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22369); 
             __CLR4_4_1h1qh1qle6rjc2w.R.inc(22370);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22371); 
             __CLR4_4_1h1qh1qle6rjc2w.R.inc(22372);return null; 
         }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22373); 
             __CLR4_4_1h1qh1qle6rjc2w.R.inc(22374);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 
     }; 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22375);try { 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22376);test.property(bad); 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22377);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22378);try { 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22379);test.property(null); 
         __CLR4_4_1h1qh1qle6rjc2w.R.inc(22380);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testToLocalDate1453() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzoyq4h9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToLocalDate1453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzoyq4h9p(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22381); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22382);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22383);LocalDate test = base.toLocalDate(); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22384);assertEquals(new LocalDate(TEST_TIME1_UTC, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 


public void testToInterval1454() {__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceStart(getClass().getName(),22385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yj32ajh9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1qh1qle6rjc2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1qh1qle6rjc2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToInterval1454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yj32ajh9t(){try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22385); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22386);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22387);Interval test = base.toInterval(); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22388);DateMidnight end = base.plus(Period.days(1)); 
     __CLR4_4_1h1qh1qle6rjc2w.R.inc(22389);assertEquals(new Interval(base, end), test); 
 }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22390);
            __CLR4_4_1h1qh1qle6rjc2w.R.inc(22391);return null;
        }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22392);
            __CLR4_4_1h1qh1qle6rjc2w.R.inc(22393);return TEST_TIME1_LONDON;
        }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22394);
            __CLR4_4_1h1qh1qle6rjc2w.R.inc(22395);return ISO_DEFAULT;
        }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}}
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
    private void check(DateMidnight test, int year, int month, int day) {try{__CLR4_4_1h1qh1qle6rjc2w.R.inc(22396);
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22397);assertEquals(year, test.getYear());
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22398);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1h1qh1qle6rjc2w.R.inc(22399);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1h1qh1qle6rjc2w.R.flushNeeded();}}

}
