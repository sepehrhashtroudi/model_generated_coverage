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
public class TestDateMidnight_Basics extends TestCase {static class __CLR4_4_1h1yh1ylc8axdma{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,22408,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22102);
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22103);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22104);
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22105);return new TestSuite(TestDateMidnight_Basics.class);
    }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}}

    public TestDateMidnight_Basics(String name) {
        super(name);__CLR4_4_1h1yh1ylc8axdma.R.inc(22107);try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22106);
    }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22108);
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22109);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22110);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22111);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22112);originalLocale = Locale.getDefault();
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22113);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22114);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22115);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22116);
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22117);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22118);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22119);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22120);Locale.setDefault(originalLocale);
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22121);originalDateTimeZone = null;
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22122);originalTimeZone = null;
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22123);originalLocale = null;
    }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlusDays_int44() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1frb3zah2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusDays_int44",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1frb3zah2k(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22124); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22125);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22126);DateMidnight result = test.plusDays(1); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22127);DateMidnight expected = new DateMidnight(2002, 5, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22128);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22129);result = test.plusDays(0); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22130);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testWithers76() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18aq9kkh2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithers76",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18aq9kkh2r(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22131); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22132);DateMidnight test = new DateMidnight(1970, 6, 9, GJ_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22133);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22134);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22135);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22136);check(test.withDayOfYear(6), 1970, 1, 6); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22137);check(test.withDayOfWeek(6), 1970, 6, 13); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22138);check(test.withWeekOfWeekyear(6), 1970, 2, 3); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22139);check(test.withWeekyear(1971), 1971, 6, 15); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22140);check(test.withYearOfCentury(60), 1960, 6, 9); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22141);check(test.withCenturyOfEra(21), 2070, 6, 9); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22142);check(test.withYearOfEra(1066), 1066, 6, 9); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22143);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22144);try { 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22145);test.withMonthOfYear(0); 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22146);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22147);try { 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22148);test.withMonthOfYear(13); 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22149);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testEqualsHashCode93() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_168smodh3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testEqualsHashCode93",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_168smodh3a(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22150); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22151);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22152);DateMidnight test2 = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22153);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22154);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22155);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22156);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22157);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22158);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22159);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22160);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22161);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22162);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22163);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22164);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22165);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22166);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22167);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22168);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22169);assertEquals(false, test1.equals(new DateMidnight(TEST_TIME1_UTC, GREGORIAN_DEFAULT))); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testMinus_RP135() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12f682th3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RP135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12f682th3u(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22170); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22171);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22172);DateMidnight result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22173);DateMidnight expected = new DateMidnight(2001, 3, 25, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22174);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22175);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22176);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testWithZoneRetainFields_DateTimeZone181() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19hg8cth41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithZoneRetainFields_DateTimeZone181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19hg8cth41(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22177); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22178);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22179);DateMidnight result = test.withZoneRetainFields(PARIS); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22180);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22181);assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22182);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22183);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22184);result = test.withZoneRetainFields(null); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22185);assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22186);assertEquals(TEST_TIME1_LONDON, result.getMillis()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22187);assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22188);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22189);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22190);assertSame(test, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22191);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22192);result = test.withZoneRetainFields(null); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22193);assertSame(test, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22194);test = new DateMidnight(TEST_TIME1_UTC, new MockNullZoneChronology()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22195);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22196);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testPlusYears_int205() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gx1qt8h4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusYears_int205",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gx1qt8h4l(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22197); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22198);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22199);DateMidnight result = test.plusYears(1); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22200);DateMidnight expected = new DateMidnight(2003, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22201);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22202);result = test.plusYears(0); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22203);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testPlusMonths_int280() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw1usih4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusMonths_int280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw1usih4s(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22204); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22205);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22206);DateMidnight result = test.plusMonths(1); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22207);DateMidnight expected = new DateMidnight(2002, 6, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22208);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22209);result = test.plusMonths(0); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22210);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testWithFieldAdded2451() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ciy7mlh4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded2451",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ciy7mlh4z(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22211); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22212);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22213);try { 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22214);test.withFieldAdded(null, 0); 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22215);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testMinus_RD477() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpmjegh54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RD477",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpmjegh54(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22216); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22217);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22218);DateMidnight result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22219);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22220);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22221);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22222);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testWithFieldAdded4490() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9dds4h5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded4490",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9dds4h5b(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22223); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22224);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22225);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22226);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testMinusWeeks_int541() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5kswoh5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusWeeks_int541",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5kswoh5f(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22227); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22228);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22229);DateMidnight result = test.minusWeeks(1); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22230);DateMidnight expected = new DateMidnight(2002, 4, 26, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22231);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22232);result = test.minusWeeks(0); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22233);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testMinusDays_int543() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e19iih5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusDays_int543",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e19iih5m(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22234); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22235);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22236);DateMidnight result = test.minusDays(1); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22237);DateMidnight expected = new DateMidnight(2002, 5, 2, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22238);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22239);result = test.minusDays(0); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22240);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testWithFieldAdded1552() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9hkwqh5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded1552",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9hkwqh5t(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22241); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22242);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22243);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22244);assertEquals(new DateMidnight(2004, 6, 9), test); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22245);assertEquals(new DateMidnight(2010, 6, 9), result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testPlus_RP573() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nahyfh5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RP573",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nahyfh5y(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22246); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22247);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22248);DateMidnight result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22249);DateMidnight expected = new DateMidnight(2003, 7, 28, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22250);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22251);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22252);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testPlusWeeks_int579() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_132j1ffh65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusWeeks_int579",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_132j1ffh65(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22253); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22254);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22255);DateMidnight result = test.plusWeeks(1); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22256);DateMidnight expected = new DateMidnight(2002, 5, 10, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22257);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22258);result = test.plusWeeks(0); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22259);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testWithDurationAdded_long_int698() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csjeslh6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_long_int698",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csjeslh6c(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22260); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22261);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22262);DateMidnight result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22263);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22264);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22265);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22266);assertSame(test, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22267);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22268);expected = new DateMidnight(test.getMillis() + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22269);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22270);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22271);expected = new DateMidnight(test.getMillis() - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22272);assertEquals(expected, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testProperty728() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkz8v7h6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testProperty728",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkz8v7h6p(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22273); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22274);DateMidnight test = new DateMidnight(); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22275);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22276);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22277);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22278);assertEquals(test.property(DateTimeFieldType.millisOfSecond()), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22279);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22280); 
             __CLR4_4_1h1yh1ylc8axdma.R.inc(22281);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22282); 
             __CLR4_4_1h1yh1ylc8axdma.R.inc(22283);return null; 
         }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22284); 
             __CLR4_4_1h1yh1ylc8axdma.R.inc(22285);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 
     }; 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22286);try { 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22287);test.property(bad); 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22288);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22289);try { 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22290);test.property(null); 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22291);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testToInterval840() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osn313h78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToInterval840",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osn313h78(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22292); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22293);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22294);Interval test = base.toInterval(); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22295);DateMidnight end = base.plus(Period.days(1)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22296);assertEquals(new Interval(base, end), test); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testWithField2917() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iul8qyh7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField2917",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iul8qyh7d(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22297); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22298);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22299);try { 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22300);test.withField(null, 6); 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22301);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testWithChronology_Chronology1045() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13hddleh7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithChronology_Chronology1045",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13hddleh7i(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22302); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22303);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22304);DateMidnight result = test.withChronology(GREGORIAN_PARIS); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22305);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22306);assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22307);assertEquals(GREGORIAN_PARIS, result.getChronology()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22308);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22309);result = test.withChronology(null); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22310);assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22311);assertEquals(TEST_TIME1_LONDON - DateTimeConstants.MILLIS_PER_DAY, result.getMillis()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22312);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22313);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22314);result = test.withChronology(null); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22315);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22316);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22317);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22318);result = test.withChronology(ISO_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22319);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testMinusMonths_int1122() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1olt29kh80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusMonths_int1122",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1olt29kh80(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22320); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22321);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22322);DateMidnight result = test.minusMonths(1); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22323);DateMidnight expected = new DateMidnight(2002, 4, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22324);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22325);result = test.minusMonths(0); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22326);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testWithFields_RPartial1197() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcmzih87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFields_RPartial1197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcmzih87(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22327); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22328);DateMidnight test = new DateMidnight(2004, 5, 6); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22329);DateMidnight result = test.withFields(new YearMonthDay(2003, 4, 5)); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22330);DateMidnight expected = new DateMidnight(2003, 4, 5); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22331);assertEquals(expected, result); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22332);test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22333);result = test.withFields(null); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22334);assertSame(test, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testToYearMonthDay1224() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpsjkgh8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToYearMonthDay1224",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpsjkgh8f(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22335); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22336);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22337);YearMonthDay test = base.toYearMonthDay(); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22338);assertEquals(new YearMonthDay(TEST_TIME1_UTC, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testGet_DateTimeFieldType1332() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xrekt6h8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testGet_DateTimeFieldType1332",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xrekt6h8j(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22339); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22340);DateMidnight test = new DateMidnight(); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22341);assertEquals(1, test.get(DateTimeFieldType.era())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22342);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22343);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22344);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22345);assertEquals(2002, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22346);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22347);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22348);assertEquals(2002, test.get(DateTimeFieldType.weekyear())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22349);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22350);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22351);assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22352);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22353);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22354);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22355);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22356);assertEquals(0, test.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22357);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22358);assertEquals(0, test.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22359);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22360);assertEquals(0, test.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22361);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22362);assertEquals(0, test.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22363);try { 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22364);test.get((DateTimeFieldType) null); 
         __CLR4_4_1h1yh1ylc8axdma.R.inc(22365);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testToCalendar_Locale1346() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6q6cnh9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToCalendar_Locale1346",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6q6cnh9a(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22366); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22367);DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22368);Calendar result = test.toCalendar(null); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22369);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22370);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22371);test = new DateMidnight(TEST_TIME1_UTC, PARIS); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22372);result = test.toCalendar(null); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22373);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22374);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22375);test = new DateMidnight(TEST_TIME1_UTC, PARIS); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22376);result = test.toCalendar(Locale.UK); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22377);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22378);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testMinus_long1349() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nd0golh9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_long1349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nd0golh9n(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22379); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22380);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22381);DateMidnight result = test.minus(123456789L); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22382);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22383);assertEquals(expected, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testToLocalDate1655() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1preevch9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToLocalDate1655",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1preevch9s(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22384); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22385);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22386);LocalDate test = base.toLocalDate(); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22387);assertEquals(new LocalDate(TEST_TIME1_UTC, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testPlus_long1680() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aitgzxh9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_long1680",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aitgzxh9w(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22388); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22389);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22390);DateMidnight result = test.plus(123456789L); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22391);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22392);assertEquals(expected, result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 


public void testWithField11682() {__CLR4_4_1h1yh1ylc8axdma.R.globalSliceStart(getClass().getName(),22393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ftfrfha1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1ylc8axdma.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1ylc8axdma.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField11682",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ftfrfha1(){try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22393); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22394);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22395);DateMidnight result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22396);assertEquals(new DateMidnight(2004, 6, 9), test); 
     __CLR4_4_1h1yh1ylc8axdma.R.inc(22397);assertEquals(new DateMidnight(2006, 6, 9), result); 
 }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22398);
            __CLR4_4_1h1yh1ylc8axdma.R.inc(22399);return null;
        }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22400);
            __CLR4_4_1h1yh1ylc8axdma.R.inc(22401);return TEST_TIME1_LONDON;
        }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22402);
            __CLR4_4_1h1yh1ylc8axdma.R.inc(22403);return ISO_DEFAULT;
        }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}}
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
    private void check(DateMidnight test, int year, int month, int day) {try{__CLR4_4_1h1yh1ylc8axdma.R.inc(22404);
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22405);assertEquals(year, test.getYear());
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22406);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1h1yh1ylc8axdma.R.inc(22407);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1h1yh1ylc8axdma.R.flushNeeded();}}

}
