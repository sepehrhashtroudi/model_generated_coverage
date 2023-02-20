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
import org.joda.time.chrono.BaseChronology;
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
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 */
public class TestDateTime_Basics extends TestCase {static class __CLR4_4_1i6ti6tle6qsert{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,24012,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    // the default time zone is set to LONDON in setUp()
    // we have to hard code LONDON here (instead of ISOChronology.getInstance() etc.)
    // as TestAll sets up a different time zone for better all-round testing
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final ISOChronology ISO_DEFAULT = ISOChronology.getInstance(LONDON);
    private static final ISOChronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final GJChronology GJ_DEFAULT = GJChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_DEFAULT = GregorianChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final BuddhistChronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
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

    public static void main(String[] args) {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23573);
        __CLR4_4_1i6ti6tle6qsert.R.inc(23574);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23575);
        __CLR4_4_1i6ti6tle6qsert.R.inc(23576);return new TestSuite(TestDateTime_Basics.class);
    }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}

    public TestDateTime_Basics(String name) {
        super(name);__CLR4_4_1i6ti6tle6qsert.R.inc(23578);try{__CLR4_4_1i6ti6tle6qsert.R.inc(23577);
    }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23579);
        __CLR4_4_1i6ti6tle6qsert.R.inc(23580);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i6ti6tle6qsert.R.inc(23581);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1i6ti6tle6qsert.R.inc(23582);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1i6ti6tle6qsert.R.inc(23583);originalLocale = Locale.getDefault();
        __CLR4_4_1i6ti6tle6qsert.R.inc(23584);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1i6ti6tle6qsert.R.inc(23585);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1i6ti6tle6qsert.R.inc(23586);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23587);
        __CLR4_4_1i6ti6tle6qsert.R.inc(23588);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i6ti6tle6qsert.R.inc(23589);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1i6ti6tle6qsert.R.inc(23590);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1i6ti6tle6qsert.R.inc(23591);Locale.setDefault(originalLocale);
        __CLR4_4_1i6ti6tle6qsert.R.inc(23592);originalDateTimeZone = null;
        __CLR4_4_1i6ti6tle6qsert.R.inc(23593);originalTimeZone = null;
        __CLR4_4_1i6ti6tle6qsert.R.inc(23594);originalLocale = null;
    }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlusYears_int136() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16l9khti7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusYears_int136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16l9khti7f(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23595); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23596);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23597);DateTime result = test.plusYears(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23598);DateTime expected = new DateTime(2003, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23599);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23600);result = test.plusYears(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23601);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testWithers377() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m8alwi7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithers377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m8alwi7m(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23602); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23603);DateTime test = new DateTime(1970, 6, 9, 10, 20, 30, 40, GJ_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23604);check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23605);check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23606);check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23607);check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23608);check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23609);check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23610);check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23611);check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23612);check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23613);check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23614);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23615);check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23616);check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23617);check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23618);check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23619);check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23620);try { 
         __CLR4_4_1i6ti6tle6qsert.R.inc(23621);test.withMonthOfYear(0); 
         __CLR4_4_1i6ti6tle6qsert.R.inc(23622);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23623);try { 
         __CLR4_4_1i6ti6tle6qsert.R.inc(23624);test.withMonthOfYear(13); 
         __CLR4_4_1i6ti6tle6qsert.R.inc(23625);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testToDateTimeISO549() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n475l0i8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTimeISO549",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n475l0i8a(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23626); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23627);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23628);DateTime result = test.toDateTimeISO(); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23629);assertSame(test, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23630);test = new DateTime(TEST_TIME1, ISO_PARIS); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23631);result = test.toDateTimeISO(); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23632);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23633);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23634);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23635);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23636);assertNotSame(test, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23637);test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23638);result = test.toDateTimeISO(); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23639);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23640);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23641);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23642);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23643);assertNotSame(test, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23644);test = new DateTime(TEST_TIME1, new MockNullZoneChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23645);result = test.toDateTimeISO(); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23646);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23647);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23648);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23649);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23650);assertNotSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testToDateTime_DateTimeZone550() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1co1gt5i8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_DateTimeZone550",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1co1gt5i8z(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23651); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23652);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23653);DateTime result = test.toDateTime(LONDON); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23654);assertSame(test, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23655);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23656);result = test.toDateTime(PARIS); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23657);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23658);assertEquals(PARIS, result.getZone()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23659);test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23660);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23661);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23662);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23663);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23664);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23665);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testToDateTime_Chronology551() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bjx7g7i9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_Chronology551",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bjx7g7i9e(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23666); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23667);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23668);DateTime result = test.toDateTime(ISO_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23669);assertSame(test, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23670);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23671);result = test.toDateTime(GREGORIAN_PARIS); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23672);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23673);assertEquals(GREGORIAN_PARIS, result.getChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23674);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23675);result = test.toDateTime((Chronology) null); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23676);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23677);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23678);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23679);result = test.toDateTime((Chronology) null); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23680);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testWithZoneRetainFields_DateTimeZone552() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dxf7yji9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithZoneRetainFields_DateTimeZone552",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dxf7yji9t(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23681); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23682);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23683);DateTime result = test.withZoneRetainFields(PARIS); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23684);assertEquals(test.getMillis() - DateTimeConstants.MILLIS_PER_HOUR, result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23685);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23686);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23687);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23688);assertSame(test, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23689);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23690);result = test.withZoneRetainFields(null); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23691);assertSame(test, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23692);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23693);result = test.withZoneRetainFields(null); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23694);assertEquals(test.getMillis() + DateTimeConstants.MILLIS_PER_HOUR, result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23695);assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23696);test = new DateTime(TEST_TIME1, new MockNullZoneChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23697);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23698);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testWithTime_int_int_int553() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y9ip39iab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithTime_int_int_int553",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y9ip39iab(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23699); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23700);DateTime test = new DateTime(TEST_TIME1 - 12345L, BUDDHIST_UTC); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23701);DateTime result = test.withTime(12, 24, 0, 0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23702);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23703);assertEquals(BUDDHIST_UTC, result.getChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23704);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23705);try { 
         __CLR4_4_1i6ti6tle6qsert.R.inc(23706);test.withTime(25, 1, 1, 1); 
         __CLR4_4_1i6ti6tle6qsert.R.inc(23707);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testWithField1554() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxgjbgiak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField1554",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxgjbgiak(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23708); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23709);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23710);DateTime result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23711);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23712);assertEquals(new DateTime(2006, 6, 9, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testWithFieldAdded2555() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11nt1bsiap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded2555",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11nt1bsiap(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23713); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23714);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23715);try { 
         __CLR4_4_1i6ti6tle6qsert.R.inc(23716);test.withFieldAdded(null, 0); 
         __CLR4_4_1i6ti6tle6qsert.R.inc(23717);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testWithFieldAdded4556() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bak7vriau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded4556",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bak7vriau(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23718); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23719);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23720);DateTime result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23721);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testWithFieldAdded1557() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqydiay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded1557",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqydiay(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23722); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23723);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23724);DateTime result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23725);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23726);assertEquals(new DateTime(2010, 6, 9, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testWithDurationAdded_RD_int558() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19px8r6ib3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_RD_int558",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19px8r6ib3(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23727); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23728);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23729);DateTime result = test.withDurationAdded(new Duration(123456789L), 1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23730);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23731);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23732);result = test.withDurationAdded(null, 1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23733);assertSame(test, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23734);result = test.withDurationAdded(new Duration(123456789L), 0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23735);assertSame(test, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23736);result = test.withDurationAdded(new Duration(123456789L), 2); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23737);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23738);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23739);result = test.withDurationAdded(new Duration(123456789L), -3); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23740);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23741);assertEquals(expected, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testPlus_long559() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6qdzjibi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_long559",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6qdzjibi(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23742); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23743);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23744);DateTime result = test.plus(123456789L); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23745);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23746);assertEquals(expected, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testPlus_RD560() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0nzhribn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RD560",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0nzhribn(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23747); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23748);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23749);DateTime result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23750);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23751);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23752);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23753);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testPlusMonths_int561() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sbvzvsibu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMonths_int561",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sbvzvsibu(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23754); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23755);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23756);DateTime result = test.plusMonths(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23757);DateTime expected = new DateTime(2002, 6, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23758);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23759);result = test.plusMonths(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23760);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testPlusWeeks_int562() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmsfbpic1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusWeeks_int562",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmsfbpic1(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23761); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23762);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23763);DateTime result = test.plusWeeks(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23764);DateTime expected = new DateTime(2002, 5, 10, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23765);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23766);result = test.plusWeeks(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23767);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testPlusDays_int564() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrov2xic8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusDays_int564",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrov2xic8(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23768); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23769);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23770);DateTime result = test.plusDays(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23771);DateTime expected = new DateTime(2002, 5, 4, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23772);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23773);result = test.plusDays(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23774);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testPlusHours_int565() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wmms8icf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusHours_int565",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wmms8icf(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23775); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23776);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23777);DateTime result = test.plusHours(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23778);DateTime expected = new DateTime(2002, 5, 3, 2, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23779);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23780);result = test.plusHours(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23781);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testPlusMinutes_int566() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yvf0vticm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMinutes_int566",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yvf0vticm(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23782); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23783);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23784);DateTime result = test.plusMinutes(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23785);DateTime expected = new DateTime(2002, 5, 3, 1, 3, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23786);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23787);result = test.plusMinutes(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23788);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testPlusSeconds_int568() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z8wujpict();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusSeconds_int568",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z8wujpict(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23789); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23790);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23791);DateTime result = test.plusSeconds(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23792);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 4, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23793);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23794);result = test.plusSeconds(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23795);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testPlusMillis_int570() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzn6vhid0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMillis_int570",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzn6vhid0(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23796); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23797);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23798);DateTime result = test.plusMillis(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23799);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 5, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23800);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23801);result = test.plusMillis(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23802);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testMinus_RD571() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ych10did7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RD571",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ych10did7(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23803); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23804);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23805);DateTime result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23806);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23807);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23808);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23809);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testMinus_RP572() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4qoagide();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RP572",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4qoagide(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23810); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23811);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23812);DateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23813);DateTime expected = new DateTime(2001, 3, 26, 0, 1, 2, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23814);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23815);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23816);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testMinusYears_int573() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pzl1gwidl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusYears_int573",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pzl1gwidl(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23817); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23818);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23819);DateTime result = test.minusYears(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23820);DateTime expected = new DateTime(2001, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23821);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23822);result = test.minusYears(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23823);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testMinusMonths_int574() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bi0k4oids();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMonths_int574",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bi0k4oids(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23824); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23825);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23826);DateTime result = test.minusMonths(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23827);DateTime expected = new DateTime(2002, 4, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23828);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23829);result = test.minusMonths(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23830);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testMinusWeeks_int575() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1114a3bidz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusWeeks_int575",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1114a3bidz(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23831); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23832);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23833);DateTime result = test.minusWeeks(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23834);DateTime expected = new DateTime(2002, 4, 26, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23835);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23836);result = test.minusWeeks(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23837);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testMinusDays_int576() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhfaieie6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusDays_int576",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhfaieie6(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23838); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23839);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23840);DateTime result = test.minusDays(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23841);DateTime expected = new DateTime(2002, 5, 2, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23842);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23843);result = test.minusDays(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23844);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testMinusHours_int578() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tkjc78ied();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusHours_int578",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tkjc78ied(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23845); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23846);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23847);DateTime result = test.minusHours(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23848);DateTime expected = new DateTime(2002, 5, 3, 0, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23849);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23850);result = test.minusHours(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23851);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testMinusMinutes_int579() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v4jk7hiek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMinutes_int579",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v4jk7hiek(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23852); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23853);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23854);DateTime result = test.minusMinutes(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23855);DateTime expected = new DateTime(2002, 5, 3, 1, 1, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23856);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23857);result = test.minusMinutes(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23858);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testMinusSeconds_int580() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q070lfier();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusSeconds_int580",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q070lfier(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23859); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23860);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23861);DateTime result = test.minusSeconds(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23862);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 2, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23863);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23864);result = test.minusSeconds(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23865);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testMinusMillis_int581() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18afmhriey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMillis_int581",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18afmhriey(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23866); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23867);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23868);DateTime result = test.minusMillis(1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23869);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23870);assertEquals(expected, result); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23871);result = test.minusMillis(0); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23872);assertSame(test, result); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testProperty582() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19fnnf3if5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testProperty582",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19fnnf3if5(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23873); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23874);DateTime test = new DateTime(); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23875);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23876);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23877);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23878);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23879);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23880); 
             __CLR4_4_1i6ti6tle6qsert.R.inc(23881);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23882); 
             __CLR4_4_1i6ti6tle6qsert.R.inc(23883);return null; 
         }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23884); 
             __CLR4_4_1i6ti6tle6qsert.R.inc(23885);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 
     }; 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23886);try { 
         __CLR4_4_1i6ti6tle6qsert.R.inc(23887);test.property(bad); 
         __CLR4_4_1i6ti6tle6qsert.R.inc(23888);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23889);try { 
         __CLR4_4_1i6ti6tle6qsert.R.inc(23890);test.property(null); 
         __CLR4_4_1i6ti6tle6qsert.R.inc(23891);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToDateMidnight583() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdkjlgifo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateMidnight583",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdkjlgifo(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23892); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23893);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23894);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23895);assertEquals(new DateMidnight(base, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToTimeOfDay584() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hj9gelifs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToTimeOfDay584",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hj9gelifs(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23896); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23897);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23898);TimeOfDay test = base.toTimeOfDay(); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23899);assertEquals(new TimeOfDay(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testToLocalDateTime585() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vgw5c0ifw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalDateTime585",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vgw5c0ifw(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23900); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23901);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23902);LocalDateTime test = base.toLocalDateTime(); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23903);assertEquals(new LocalDateTime(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testToLocalTime587() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grbgy8ig0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalTime587",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grbgy8ig0(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23904); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23905);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23906);LocalTime test = base.toLocalTime(); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23907);assertEquals(new LocalTime(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType1391() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7usp9ig4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsSupported_DateTimeFieldType1391",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7usp9ig4(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23908); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23909);DateTime test = new DateTime(); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23910);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23911);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23912);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23913);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23914);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23915);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23916);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23917);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23918);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23919);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23920);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23921);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23922);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23923);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23924);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23925);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23926);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23927);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23928);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23929);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23930);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23931);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23932);assertEquals(false, test.isSupported(null)); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testToInstant1393() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14mjr07igt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToInstant1393",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14mjr07igt(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23933); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23934);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23935);Instant result = test.toInstant(); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23936);assertEquals(TEST_TIME1, result.getMillis()); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testToMutableDateTimeISO1396() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19te87digx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTimeISO1396",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19te87digx(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23937); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23938);DateTime test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23939);MutableDateTime result = test.toMutableDateTimeISO(); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23940);assertSame(MutableDateTime.class, result.getClass()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23941);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23942);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23943);assertEquals(ISO_PARIS, result.getChronology()); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testToMutableDateTime_DateTimeZone1397() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkaegpih4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTime_DateTimeZone1397",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkaegpih4(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23944); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23945);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23946);MutableDateTime result = test.toMutableDateTime(LONDON); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23947);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23948);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23949);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23950);result = test.toMutableDateTime(PARIS); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23951);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23952);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23953);test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23954);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23955);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23956);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23957);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23958);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23959);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23960);assertEquals(ISO_DEFAULT, result.getChronology()); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testIsAfter_RI1400() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o7a1z4ihl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfter_RI1400",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o7a1z4ihl(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23961); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23962);DateTime test1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23963);DateTime test1a = new DateTime(TEST_TIME1); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23964);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23965);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23966);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23967);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23968);DateTime test2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23969);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23970);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23971);DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23972);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23973);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23974);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23975);assertEquals(true, test2.isAfter(new MockInstant())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23976);assertEquals(false, test1.isAfter(new MockInstant())); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23977);assertEquals(true, new DateTime(TEST_TIME_NOW + 1).isAfter(null)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23978);assertEquals(false, new DateTime(TEST_TIME_NOW).isAfter(null)); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23979);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isAfter(null)); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


public void testIsAfterNow1401() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sbo4vzii4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfterNow1401",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sbo4vzii4(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23980); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23981);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isAfterNow()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23982);assertEquals(false, new DateTime(TEST_TIME_NOW).isAfterNow()); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23983);assertEquals(true, new DateTime(TEST_TIME_NOW + 1).isAfterNow()); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToString_DTFormatter1405() {__CLR4_4_1i6ti6tle6qsert.R.globalSliceStart(getClass().getName(),23984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j2fj48ii8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i6ti6tle6qsert.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i6ti6tle6qsert.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_DTFormatter1405",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j2fj48ii8(){try{__CLR4_4_1i6ti6tle6qsert.R.inc(23984); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23985);DateMidnight test = new DateMidnight(TEST_TIME_NOW); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23986);assertEquals("2002 00", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1i6ti6tle6qsert.R.inc(23987);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23988);
            __CLR4_4_1i6ti6tle6qsert.R.inc(23989);return null;
        }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23990);
            __CLR4_4_1i6ti6tle6qsert.R.inc(23991);return TEST_TIME1;
        }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23992);
            __CLR4_4_1i6ti6tle6qsert.R.inc(23993);return ISO_DEFAULT;
        }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23994);
            __CLR4_4_1i6ti6tle6qsert.R.inc(23995);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23996);
            __CLR4_4_1i6ti6tle6qsert.R.inc(23997);return null;
        }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1i6ti6tle6qsert.R.inc(23998);
            __CLR4_4_1i6ti6tle6qsert.R.inc(23999);return this;
        }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1i6ti6tle6qsert.R.inc(24000);
            __CLR4_4_1i6ti6tle6qsert.R.inc(24001);return this;
        }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1i6ti6tle6qsert.R.inc(24002);
            __CLR4_4_1i6ti6tle6qsert.R.inc(24003);return "";
        }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}
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
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1i6ti6tle6qsert.R.inc(24004);
        __CLR4_4_1i6ti6tle6qsert.R.inc(24005);assertEquals(year, test.getYear());
        __CLR4_4_1i6ti6tle6qsert.R.inc(24006);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1i6ti6tle6qsert.R.inc(24007);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1i6ti6tle6qsert.R.inc(24008);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1i6ti6tle6qsert.R.inc(24009);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1i6ti6tle6qsert.R.inc(24010);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1i6ti6tle6qsert.R.inc(24011);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1i6ti6tle6qsert.R.flushNeeded();}}

}
