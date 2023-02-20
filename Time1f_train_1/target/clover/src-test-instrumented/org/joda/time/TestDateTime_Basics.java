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
public class TestDateTime_Basics extends TestCase {static class __CLR4_4_1i7hi7hle6qe9cm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,24015,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23597);
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23598);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23599);
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23600);return new TestSuite(TestDateTime_Basics.class);
    }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}

    public TestDateTime_Basics(String name) {
        super(name);__CLR4_4_1i7hi7hle6qe9cm.R.inc(23602);try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23601);
    }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23603);
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23604);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23605);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23606);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23607);originalLocale = Locale.getDefault();
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23608);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23609);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23610);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23611);
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23612);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23613);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23614);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23615);Locale.setDefault(originalLocale);
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23616);originalDateTimeZone = null;
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23617);originalTimeZone = null;
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(23618);originalLocale = null;
    }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlusYears_int154() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bi4lz7i83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusYears_int154",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bi4lz7i83(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23619); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23620);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23621);DateTime result = test.plusYears(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23622);DateTime expected = new DateTime(2003, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23623);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23624);result = test.plusYears(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23625);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testWithers399() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15pmlx0i8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithers399",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15pmlx0i8a(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23626); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23627);DateTime test = new DateTime(1970, 6, 9, 10, 20, 30, 40, GJ_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23628);check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23629);check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23630);check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23631);check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23632);check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23633);check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23634);check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23635);check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23636);check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23637);check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23638);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23639);check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23640);check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23641);check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23642);check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23643);check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23644);try { 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23645);test.withMonthOfYear(0); 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23646);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23647);try { 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23648);test.withMonthOfYear(13); 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23649);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testToDateTimeISO570() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzo448i8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTimeISO570",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzo448i8y(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23650); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23651);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23652);DateTime result = test.toDateTimeISO(); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23653);assertSame(test, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23654);test = new DateTime(TEST_TIME1, ISO_PARIS); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23655);result = test.toDateTimeISO(); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23656);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23657);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23658);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23659);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23660);assertNotSame(test, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23661);test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23662);result = test.toDateTimeISO(); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23663);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23664);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23665);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23666);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23667);assertNotSame(test, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23668);test = new DateTime(TEST_TIME1, new MockNullZoneChronology()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23669);result = test.toDateTimeISO(); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23670);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23671);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23672);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23673);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23674);assertNotSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testToDateTime_DateTimeZone571() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14bn6pki9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_DateTimeZone571",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14bn6pki9n(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23675); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23676);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23677);DateTime result = test.toDateTime(LONDON); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23678);assertSame(test, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23679);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23680);result = test.toDateTime(PARIS); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23681);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23682);assertEquals(PARIS, result.getZone()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23683);test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23684);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23685);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23686);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23687);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23688);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23689);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testToDateTime_Chronology572() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jwbhjsia2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_Chronology572",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jwbhjsia2(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23690); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23691);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23692);DateTime result = test.toDateTime(ISO_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23693);assertSame(test, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23694);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23695);result = test.toDateTime(GREGORIAN_PARIS); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23696);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23697);assertEquals(GREGORIAN_PARIS, result.getChronology()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23698);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23699);result = test.toDateTime((Chronology) null); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23700);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23701);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23702);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23703);result = test.toDateTime((Chronology) null); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23704);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testWithZoneRetainFields_DateTimeZone573() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9ti24iah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithZoneRetainFields_DateTimeZone573",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9ti24iah(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23705); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23706);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23707);DateTime result = test.withZoneRetainFields(PARIS); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23708);assertEquals(test.getMillis() - DateTimeConstants.MILLIS_PER_HOUR, result.getMillis()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23709);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23710);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23711);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23712);assertSame(test, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23713);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23714);result = test.withZoneRetainFields(null); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23715);assertSame(test, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23716);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23717);result = test.withZoneRetainFields(null); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23718);assertEquals(test.getMillis() + DateTimeConstants.MILLIS_PER_HOUR, result.getMillis()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23719);assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23720);test = new DateTime(TEST_TIME1, new MockNullZoneChronology()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23721);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23722);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testWithDate_int_int_int574() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b49x4ziaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDate_int_int_int574",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b49x4ziaz(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23723); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23724);DateTime test = new DateTime(2002, 4, 5, 1, 2, 3, 4, ISO_UTC); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23725);DateTime result = test.withDate(2003, 5, 6); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23726);DateTime expected = new DateTime(2003, 5, 6, 1, 2, 3, 4, ISO_UTC); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23727);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23728);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23729);try { 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23730);test.withDate(2003, 13, 1); 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23731);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testWithFields_RPartial575() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115v1h9ib8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFields_RPartial575",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115v1h9ib8(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23732); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23733);DateTime test = new DateTime(2004, 5, 6, 7, 8, 9, 0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23734);DateTime result = test.withFields(new YearMonthDay(2003, 4, 5)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23735);DateTime expected = new DateTime(2003, 4, 5, 7, 8, 9, 0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23736);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23737);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23738);result = test.withFields(null); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23739);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testWithField1576() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hu280cibg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField1576",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hu280cibg(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23740); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23741);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23742);DateTime result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23743);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23744);assertEquals(new DateTime(2006, 6, 9, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testWithField2577() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pxqu0cibl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField2577",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pxqu0cibl(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23745); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23746);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23747);try { 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23748);test.withField(null, 6); 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23749);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testWithFieldAdded2578() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13i7dufibq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded2578",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13i7dufibq(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23750); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23751);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23752);try { 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23753);test.withFieldAdded(null, 0); 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23754);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testWithFieldAdded4579() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19g5vd4ibv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded4579",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19g5vd4ibv(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23755); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23756);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23757);DateTime result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23758);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testWithDurationAdded_long_int580() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8nirhibz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_long_int580",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8nirhibz(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23759); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23760);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23761);DateTime result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23762);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23763);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23764);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23765);assertSame(test, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23766);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23767);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23768);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23769);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23770);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23771);assertEquals(expected, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testPlus_RP581() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nv5gx0icc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RP581",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nv5gx0icc(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23772); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23773);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23774);DateTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23775);DateTime expected = new DateTime(2003, 7, 28, 6, 8, 10, 12, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23776);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23777);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23778);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testPlus_long582() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mt9hvdicj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_long582",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mt9hvdicj(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23779); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23780);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23781);DateTime result = test.plus(123456789L); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23782);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23783);assertEquals(expected, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testPlus_RD583() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rv2c0eico();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RD583",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rv2c0eico(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23784); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23785);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23786);DateTime result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23787);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23788);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23789);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23790);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testPlusMonths_int584() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qhhnd5icv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMonths_int584",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qhhnd5icv(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23791); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23792);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23793);DateTime result = test.plusMonths(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23794);DateTime expected = new DateTime(2002, 6, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23795);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23796);result = test.plusMonths(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23797);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testPlusWeeks_int585() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jse2t2id2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusWeeks_int585",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jse2t2id2(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23798); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23799);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23800);DateTime result = test.plusWeeks(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23801);DateTime expected = new DateTime(2002, 5, 10, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23802);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23803);result = test.plusWeeks(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23804);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testPlusDays_int587() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sm37lkid9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusDays_int587",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sm37lkid9(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23805); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23806);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23807);DateTime result = test.plusDays(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23808);DateTime expected = new DateTime(2002, 5, 4, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23809);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23810);result = test.plusDays(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23811);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testPlusHours_int588() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18r0zavidg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusHours_int588",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18r0zavidg(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23812); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23813);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23814);DateTime result = test.plusHours(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23815);DateTime expected = new DateTime(2002, 5, 3, 2, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23816);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23817);result = test.plusHours(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23818);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testPlusMinutes_int589() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x10od6idn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMinutes_int589",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x10od6idn(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23819); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23820);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23821);DateTime result = test.plusMinutes(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23822);DateTime expected = new DateTime(2002, 5, 3, 1, 3, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23823);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23824);result = test.plusMinutes(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23825);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testPlusSeconds_int590() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rwo4r4idu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusSeconds_int590",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rwo4r4idu(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23826); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23827);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23828);DateTime result = test.plusSeconds(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23829);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 4, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23830);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23831);result = test.plusSeconds(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23832);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testPlusMillis_int592() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wy2jsjie1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMillis_int592",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wy2jsjie1(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23833); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23834);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23835);DateTime result = test.plusMillis(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23836);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 5, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23837);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23838);result = test.plusMillis(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23839);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testMinus_long593() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ur84ihie8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_long593",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ur84ihie8(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23840); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23841);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23842);DateTime result = test.minus(123456789L); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23843);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23844);assertEquals(expected, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testMinus_RD594() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yu8og4ied();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RD594",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yu8og4ied(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23845); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23846);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23847);DateTime result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23848);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23849);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23850);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23851);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testMinus_RP595() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pacbrtiek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RP595",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pacbrtiek(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23852); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23853);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23854);DateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23855);DateTime expected = new DateTime(2001, 3, 26, 0, 1, 2, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23856);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23857);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23858);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testMinusYears_int596() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rtzdzjier();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusYears_int596",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rtzdzjier(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23859); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23860);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23861);DateTime result = test.minusYears(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23862);DateTime expected = new DateTime(2001, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23863);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23864);result = test.minusYears(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23865);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testMinusWeeks_int597() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_164ilefiey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusWeeks_int597",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_164ilefiey(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23866); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23867);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23868);DateTime result = test.minusWeeks(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23869);DateTime expected = new DateTime(2002, 4, 26, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23870);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23871);result = test.minusWeeks(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23872);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testMinusDays_int598() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ie0z7aif5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusDays_int598",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ie0z7aif5(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23873); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23874);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23875);DateTime result = test.minusDays(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23876);DateTime expected = new DateTime(2002, 5, 2, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23877);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23878);result = test.minusDays(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23879);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testMinusSeconds_int600() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s6qokifc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusSeconds_int600",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s6qokifc(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23880); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23881);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23882);DateTime result = test.minusSeconds(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23883);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 2, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23884);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23885);result = test.minusSeconds(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23886);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testMinusMillis_int601() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z2tdrqifj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMillis_int601",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z2tdrqifj(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23887); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23888);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23889);DateTime result = test.minusMillis(1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23890);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23891);assertEquals(expected, result); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23892);result = test.minusMillis(0); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23893);assertSame(test, result); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testProperty602() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hcq3uwifq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testProperty602",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hcq3uwifq(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23894); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23895);DateTime test = new DateTime(); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23896);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23897);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23898);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23899);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23900);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23901); 
             __CLR4_4_1i7hi7hle6qe9cm.R.inc(23902);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23903); 
             __CLR4_4_1i7hi7hle6qe9cm.R.inc(23904);return null; 
         }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23905); 
             __CLR4_4_1i7hi7hle6qe9cm.R.inc(23906);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 
     }; 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23907);try { 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23908);test.property(bad); 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23909);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23910);try { 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23911);test.property(null); 
         __CLR4_4_1i7hi7hle6qe9cm.R.inc(23912);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToDateMidnight603() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ov5r3pig9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateMidnight603",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ov5r3pig9(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23913); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23914);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23915);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23916);assertEquals(new DateMidnight(base, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToTimeOfDay604() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1994aveigd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToTimeOfDay604",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1994aveigd(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23917); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23918);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23919);TimeOfDay test = base.toTimeOfDay(); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23920);assertEquals(new TimeOfDay(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testToString_String_Locale1400() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14c2dapigh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_String_Locale1400",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14c2dapigh(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23921); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23922);DateTime test = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23923);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23924);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23925);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23926);assertEquals("Sun 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23927);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null)); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType1402() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzq5ncigo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsSupported_DateTimeFieldType1402",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzq5ncigo(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23928); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23929);DateTime test = new DateTime(); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23930);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23931);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23932);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23933);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23934);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23935);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23936);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23937);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23938);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23939);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23940);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23941);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23942);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23943);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23944);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23945);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23946);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23947);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23948);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23949);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23950);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23951);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23952);assertEquals(false, test.isSupported(null)); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testToInstant1404() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mef3yaihd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToInstant1404",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mef3yaihd(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23953); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23954);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23955);Instant result = test.toInstant(); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23956);assertEquals(TEST_TIME1, result.getMillis()); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testToMutableDateTimeISO1406() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ph5y9ihh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTimeISO1406",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ph5y9ihh(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23957); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23958);DateTime test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23959);MutableDateTime result = test.toMutableDateTimeISO(); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23960);assertSame(MutableDateTime.class, result.getClass()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23961);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23962);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23963);assertEquals(ISO_PARIS, result.getChronology()); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testIsAfter_RI1409() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hkuavriho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfter_RI1409",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hkuavriho(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23964); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23965);DateTime test1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23966);DateTime test1a = new DateTime(TEST_TIME1); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23967);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23968);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23969);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23970);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23971);DateTime test2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23972);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23973);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23974);DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23975);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23976);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23977);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23978);assertEquals(true, test2.isAfter(new MockInstant())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23979);assertEquals(false, test1.isAfter(new MockInstant())); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23980);assertEquals(true, new DateTime(TEST_TIME_NOW + 1).isAfter(null)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23981);assertEquals(false, new DateTime(TEST_TIME_NOW).isAfter(null)); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23982);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isAfter(null)); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


public void testIsAfterNow1410() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ut74xii7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfterNow1410",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ut74xii7(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23983); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23984);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isAfterNow()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23985);assertEquals(false, new DateTime(TEST_TIME_NOW).isAfterNow()); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23986);assertEquals(true, new DateTime(TEST_TIME_NOW + 1).isAfterNow()); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToString_DTFormatter1413() {__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceStart(getClass().getName(),23987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sqtjwbiib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i7hi7hle6qe9cm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i7hi7hle6qe9cm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_DTFormatter1413",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sqtjwbiib(){try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23987); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23988);DateMidnight test = new DateMidnight(TEST_TIME_NOW); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23989);assertEquals("2002 00", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1i7hi7hle6qe9cm.R.inc(23990);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23991);
            __CLR4_4_1i7hi7hle6qe9cm.R.inc(23992);return null;
        }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23993);
            __CLR4_4_1i7hi7hle6qe9cm.R.inc(23994);return TEST_TIME1;
        }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23995);
            __CLR4_4_1i7hi7hle6qe9cm.R.inc(23996);return ISO_DEFAULT;
        }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23997);
            __CLR4_4_1i7hi7hle6qe9cm.R.inc(23998);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(23999);
            __CLR4_4_1i7hi7hle6qe9cm.R.inc(24000);return null;
        }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(24001);
            __CLR4_4_1i7hi7hle6qe9cm.R.inc(24002);return this;
        }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(24003);
            __CLR4_4_1i7hi7hle6qe9cm.R.inc(24004);return this;
        }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(24005);
            __CLR4_4_1i7hi7hle6qe9cm.R.inc(24006);return "";
        }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}
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
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1i7hi7hle6qe9cm.R.inc(24007);
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(24008);assertEquals(year, test.getYear());
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(24009);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(24010);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(24011);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(24012);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(24013);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1i7hi7hle6qe9cm.R.inc(24014);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1i7hi7hle6qe9cm.R.flushNeeded();}}

}
