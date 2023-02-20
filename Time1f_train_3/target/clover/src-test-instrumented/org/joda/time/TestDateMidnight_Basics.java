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
public class TestDateMidnight_Basics extends TestCase {static class __CLR4_4_1h23h23le6rckbj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,22320,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1h23h23le6rckbj.R.inc(22107);
        __CLR4_4_1h23h23le6rckbj.R.inc(22108);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h23h23le6rckbj.R.inc(22109);
        __CLR4_4_1h23h23le6rckbj.R.inc(22110);return new TestSuite(TestDateMidnight_Basics.class);
    }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}}

    public TestDateMidnight_Basics(String name) {
        super(name);__CLR4_4_1h23h23le6rckbj.R.inc(22112);try{__CLR4_4_1h23h23le6rckbj.R.inc(22111);
    }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h23h23le6rckbj.R.inc(22113);
        __CLR4_4_1h23h23le6rckbj.R.inc(22114);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1h23h23le6rckbj.R.inc(22115);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1h23h23le6rckbj.R.inc(22116);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1h23h23le6rckbj.R.inc(22117);originalLocale = Locale.getDefault();
        __CLR4_4_1h23h23le6rckbj.R.inc(22118);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h23h23le6rckbj.R.inc(22119);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1h23h23le6rckbj.R.inc(22120);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h23h23le6rckbj.R.inc(22121);
        __CLR4_4_1h23h23le6rckbj.R.inc(22122);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h23h23le6rckbj.R.inc(22123);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1h23h23le6rckbj.R.inc(22124);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1h23h23le6rckbj.R.inc(22125);Locale.setDefault(originalLocale);
        __CLR4_4_1h23h23le6rckbj.R.inc(22126);originalDateTimeZone = null;
        __CLR4_4_1h23h23le6rckbj.R.inc(22127);originalTimeZone = null;
        __CLR4_4_1h23h23le6rckbj.R.inc(22128);originalLocale = null;
    }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGet_DateTimeFieldType261() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6nd7uh2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testGet_DateTimeFieldType261",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6nd7uh2p(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22129); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22130);DateMidnight test = new DateMidnight(); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22131);assertEquals(1, test.get(DateTimeFieldType.era())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22132);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22133);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22134);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22135);assertEquals(2002, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22136);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22137);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22138);assertEquals(2002, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22139);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22140);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22141);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22142);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22143);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22144);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22145);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22146);assertEquals(0, test.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22147);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22148);assertEquals(0, test.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22149);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22150);assertEquals(0, test.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22151);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22152);assertEquals(0, test.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22153);try { 
         __CLR4_4_1h23h23le6rckbj.R.inc(22154);test.get((DateTimeFieldType) null); 
         __CLR4_4_1h23h23le6rckbj.R.inc(22155);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testEqualsHashCode302() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyf374h3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testEqualsHashCode302",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyf374h3g(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22156); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22157);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22158);DateMidnight test2 = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22159);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22160);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22161);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22162);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22163);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22164);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22165);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22166);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22167);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22168);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22169);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22170);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22171);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22172);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22173);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22174);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22175);assertEquals(false, test1.equals(new DateMidnight(TEST_TIME1_UTC, GREGORIAN_DEFAULT))); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testPlus_RD467() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_114tj3dh40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RD467",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_114tj3dh40(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22176); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22177);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22178);DateMidnight result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22179);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22180);assertEquals(expected, result); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22181);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22182);assertSame(test, result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testWithChronology_Chronology1440() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9rz03h47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithChronology_Chronology1440",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9rz03h47(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22183); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22184);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22185);DateMidnight result = test.withChronology(GREGORIAN_PARIS); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22186);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22187);assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22188);assertEquals(GREGORIAN_PARIS, result.getChronology()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22189);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22190);result = test.withChronology(null); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22191);assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22192);assertEquals(TEST_TIME1_LONDON - DateTimeConstants.MILLIS_PER_DAY, result.getMillis()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22193);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22194);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22195);result = test.withChronology(null); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22196);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22197);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22198);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22199);result = test.withChronology(ISO_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22200);assertSame(test, result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testWithField21441() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v4ochjh4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField21441",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v4ochjh4p(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22201); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22202);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22203);try { 
         __CLR4_4_1h23h23le6rckbj.R.inc(22204);test.withField(null, 6); 
         __CLR4_4_1h23h23le6rckbj.R.inc(22205);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testWithField11442() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0ofqvh4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField11442",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0ofqvh4u(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22206); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22207);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22208);DateMidnight result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22209);assertEquals(new DateMidnight(2004, 6, 9), test); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22210);assertEquals(new DateMidnight(2006, 6, 9), result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testWithFieldAdded21443() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iktbq5h4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded21443",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iktbq5h4z(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22211); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22212);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22213);try { 
         __CLR4_4_1h23h23le6rckbj.R.inc(22214);test.withFieldAdded(null, 0); 
         __CLR4_4_1h23h23le6rckbj.R.inc(22215);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testWithFieldAdded11444() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgtezhh54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded11444",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgtezhh54(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22216); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22217);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22218);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22219);assertEquals(new DateMidnight(2004, 6, 9), test); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22220);assertEquals(new DateMidnight(2010, 6, 9), result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testPlus_RP1445() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ia1xy4h59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RP1445",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ia1xy4h59(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22221); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22222);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22223);DateMidnight result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22224);DateMidnight expected = new DateMidnight(2003, 7, 28, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22225);assertEquals(expected, result); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22226);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22227);assertSame(test, result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testPlus_long1446() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylfupxh5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_long1446",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ylfupxh5g(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22228); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22229);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22230);DateMidnight result = test.plus(123456789L); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22231);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22232);assertEquals(expected, result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testPlusYears_int1447() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bb7xyxh5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusYears_int1447",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bb7xyxh5l(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22233); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22234);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22235);DateMidnight result = test.plusYears(1); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22236);DateMidnight expected = new DateMidnight(2003, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22237);assertEquals(expected, result); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22238);result = test.plusYears(0); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22239);assertSame(test, result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testPlusWeeks_int1448() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144mrbjh5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusWeeks_int1448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144mrbjh5s(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22240); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22241);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22242);DateMidnight result = test.plusWeeks(1); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22243);DateMidnight expected = new DateMidnight(2002, 5, 10, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22244);assertEquals(expected, result); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22245);result = test.plusWeeks(0); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22246);assertSame(test, result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testPlusDays_int1449() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11w8n9eh5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusDays_int1449",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11w8n9eh5z(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22247); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22248);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22249);DateMidnight result = test.plusDays(1); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22250);DateMidnight expected = new DateMidnight(2002, 5, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22251);assertEquals(expected, result); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22252);result = test.plusDays(0); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22253);assertSame(test, result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testMinus_RD1450() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ti9bsh66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RD1450",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ti9bsh66(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22254); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22255);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22256);DateMidnight result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22257);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22258);assertEquals(expected, result); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22259);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22260);assertSame(test, result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testMinus_RP1451() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xdcoith6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RP1451",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xdcoith6d(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22261); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22262);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22263);DateMidnight result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22264);DateMidnight expected = new DateMidnight(2001, 3, 25, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22265);assertEquals(expected, result); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22266);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22267);assertSame(test, result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testMinusYears_int1452() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16406c1h6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusYears_int1452",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16406c1h6k(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22268); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22269);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22270);DateMidnight result = test.minusYears(1); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22271);DateMidnight expected = new DateMidnight(2001, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22272);assertEquals(expected, result); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22273);result = test.minusYears(0); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22274);assertSame(test, result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testMinusDays_int1453() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0gap9h6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusDays_int1453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0gap9h6r(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22275); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22276);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22277);DateMidnight result = test.minusDays(1); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22278);DateMidnight expected = new DateMidnight(2002, 5, 2, BUDDHIST_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22279);assertEquals(expected, result); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22280);result = test.minusDays(0); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22281);assertSame(test, result); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testProperty1454() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_164m3f4h6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testProperty1454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_164m3f4h6y(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22282); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22283);DateMidnight test = new DateMidnight(); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22284);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22285);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22286);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22287);assertEquals(test.property(DateTimeFieldType.millisOfSecond()), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22288);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1h23h23le6rckbj.R.inc(22289); 
             __CLR4_4_1h23h23le6rckbj.R.inc(22290);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1h23h23le6rckbj.R.inc(22291); 
             __CLR4_4_1h23h23le6rckbj.R.inc(22292);return null; 
         }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1h23h23le6rckbj.R.inc(22293); 
             __CLR4_4_1h23h23le6rckbj.R.inc(22294);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 
     }; 
     __CLR4_4_1h23h23le6rckbj.R.inc(22295);try { 
         __CLR4_4_1h23h23le6rckbj.R.inc(22296);test.property(bad); 
         __CLR4_4_1h23h23le6rckbj.R.inc(22297);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h23h23le6rckbj.R.inc(22298);try { 
         __CLR4_4_1h23h23le6rckbj.R.inc(22299);test.property(null); 
         __CLR4_4_1h23h23le6rckbj.R.inc(22300);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testToLocalDate1455() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lhp156h7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToLocalDate1455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lhp156h7h(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22301); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22302);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22303);LocalDate test = base.toLocalDate(); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22304);assertEquals(new LocalDate(TEST_TIME1_UTC, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 


public void testToInterval1456() {__CLR4_4_1h23h23le6rckbj.R.globalSliceStart(getClass().getName(),22305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u0123nh7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h23h23le6rckbj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h23h23le6rckbj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToInterval1456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u0123nh7l(){try{__CLR4_4_1h23h23le6rckbj.R.inc(22305); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22306);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22307);Interval test = base.toInterval(); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22308);DateMidnight end = base.plus(Period.days(1)); 
     __CLR4_4_1h23h23le6rckbj.R.inc(22309);assertEquals(new Interval(base, end), test); 
 }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1h23h23le6rckbj.R.inc(22310);
            __CLR4_4_1h23h23le6rckbj.R.inc(22311);return null;
        }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1h23h23le6rckbj.R.inc(22312);
            __CLR4_4_1h23h23le6rckbj.R.inc(22313);return TEST_TIME1_LONDON;
        }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1h23h23le6rckbj.R.inc(22314);
            __CLR4_4_1h23h23le6rckbj.R.inc(22315);return ISO_DEFAULT;
        }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}}
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
    private void check(DateMidnight test, int year, int month, int day) {try{__CLR4_4_1h23h23le6rckbj.R.inc(22316);
        __CLR4_4_1h23h23le6rckbj.R.inc(22317);assertEquals(year, test.getYear());
        __CLR4_4_1h23h23le6rckbj.R.inc(22318);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1h23h23le6rckbj.R.inc(22319);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1h23h23le6rckbj.R.flushNeeded();}}

}
