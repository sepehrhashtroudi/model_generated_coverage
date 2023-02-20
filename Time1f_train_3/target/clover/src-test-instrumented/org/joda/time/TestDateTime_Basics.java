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
public class TestDateTime_Basics extends TestCase {static class __CLR4_4_1i9di9dle6rckn9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,24020,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1i9di9dle6rckn9.R.inc(23665);
        __CLR4_4_1i9di9dle6rckn9.R.inc(23666);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i9di9dle6rckn9.R.inc(23667);
        __CLR4_4_1i9di9dle6rckn9.R.inc(23668);return new TestSuite(TestDateTime_Basics.class);
    }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}

    public TestDateTime_Basics(String name) {
        super(name);__CLR4_4_1i9di9dle6rckn9.R.inc(23670);try{__CLR4_4_1i9di9dle6rckn9.R.inc(23669);
    }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i9di9dle6rckn9.R.inc(23671);
        __CLR4_4_1i9di9dle6rckn9.R.inc(23672);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i9di9dle6rckn9.R.inc(23673);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1i9di9dle6rckn9.R.inc(23674);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1i9di9dle6rckn9.R.inc(23675);originalLocale = Locale.getDefault();
        __CLR4_4_1i9di9dle6rckn9.R.inc(23676);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1i9di9dle6rckn9.R.inc(23677);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1i9di9dle6rckn9.R.inc(23678);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i9di9dle6rckn9.R.inc(23679);
        __CLR4_4_1i9di9dle6rckn9.R.inc(23680);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i9di9dle6rckn9.R.inc(23681);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1i9di9dle6rckn9.R.inc(23682);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1i9di9dle6rckn9.R.inc(23683);Locale.setDefault(originalLocale);
        __CLR4_4_1i9di9dle6rckn9.R.inc(23684);originalDateTimeZone = null;
        __CLR4_4_1i9di9dle6rckn9.R.inc(23685);originalTimeZone = null;
        __CLR4_4_1i9di9dle6rckn9.R.inc(23686);originalLocale = null;
    }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlusYears_int151() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l94icmi9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusYears_int151",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l94icmi9z(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23687); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23688);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23689);DateTime result = test.plusYears(1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23690);DateTime expected = new DateTime(2003, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23691);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23692);result = test.plusYears(0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23693);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testWithers410() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19a3znwia6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithers410",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19a3znwia6(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23694); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23695);DateTime test = new DateTime(1970, 6, 9, 10, 20, 30, 40, GJ_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23696);check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23697);check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23698);check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23699);check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23700);check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23701);check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23702);check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23703);check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23704);check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23705);check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23706);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23707);check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23708);check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23709);check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23710);check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23711);check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23712);try { 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23713);test.withMonthOfYear(0); 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23714);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23715);try { 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23716);test.withMonthOfYear(13); 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23717);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testToDateTimeISO580() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tbl1bdiau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTimeISO580",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tbl1bdiau(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23718); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23719);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23720);DateTime result = test.toDateTimeISO(); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23721);assertSame(test, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23722);test = new DateTime(TEST_TIME1, ISO_PARIS); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23723);result = test.toDateTimeISO(); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23724);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23725);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23726);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23727);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23728);assertNotSame(test, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23729);test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23730);result = test.toDateTimeISO(); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23731);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23732);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23733);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23734);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23735);assertNotSame(test, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23736);test = new DateTime(TEST_TIME1, new MockNullZoneChronology()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23737);result = test.toDateTimeISO(); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23738);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23739);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23740);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23741);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23742);assertNotSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testToDateTime_DateTimeZone581() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1i393ibj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_DateTimeZone581",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1i393ibj(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23743); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23744);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23745);DateTime result = test.toDateTime(LONDON); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23746);assertSame(test, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23747);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23748);result = test.toDateTime(PARIS); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23749);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23750);assertEquals(PARIS, result.getZone()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23751);test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23752);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23753);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23754);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23755);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23756);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23757);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testToDateTime_Chronology582() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19tjezriby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_Chronology582",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19tjezriby(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23758); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23759);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23760);DateTime result = test.toDateTime(ISO_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23761);assertSame(test, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23762);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23763);result = test.toDateTime(GREGORIAN_PARIS); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23764);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23765);assertEquals(GREGORIAN_PARIS, result.getChronology()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23766);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23767);result = test.toDateTime((Chronology) null); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23768);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23769);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23770);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23771);result = test.toDateTime((Chronology) null); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23772);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testWithDate_int_int_int583() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfz733icd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDate_int_int_int583",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfz733icd(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23773); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23774);DateTime test = new DateTime(2002, 4, 5, 1, 2, 3, 4, ISO_UTC); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23775);DateTime result = test.withDate(2003, 5, 6); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23776);DateTime expected = new DateTime(2003, 5, 6, 1, 2, 3, 4, ISO_UTC); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23777);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23778);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23779);try { 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23780);test.withDate(2003, 13, 1); 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23781);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testWithTime_int_int_int584() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fe4qfxicm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithTime_int_int_int584",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fe4qfxicm(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23782); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23783);DateTime test = new DateTime(TEST_TIME1 - 12345L, BUDDHIST_UTC); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23784);DateTime result = test.withTime(12, 24, 0, 0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23785);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23786);assertEquals(BUDDHIST_UTC, result.getChronology()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23787);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23788);try { 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23789);test.withTime(25, 1, 1, 1); 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23790);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testWithFields_RPartial585() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvpy0sicv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFields_RPartial585",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvpy0sicv(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23791); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23792);DateTime test = new DateTime(2004, 5, 6, 7, 8, 9, 0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23793);DateTime result = test.withFields(new YearMonthDay(2003, 4, 5)); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23794);DateTime expected = new DateTime(2003, 4, 5, 7, 8, 9, 0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23795);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23796);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23797);result = test.withFields(null); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23798);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testWithField2586() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1imia7qid3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField2586",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1imia7qid3(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23799); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23800);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23801);try { 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23802);test.withField(null, 6); 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23803);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testWithFieldAdded2587() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mynjwnid8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded2587",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mynjwnid8(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23804); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23805);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23806);try { 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23807);test.withFieldAdded(null, 0); 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23808);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testWithFieldAdded4588() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z438uyidd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded4588",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z438uyidd(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23809); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23810);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23811);DateTime result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23812);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testWithFieldAdded1589() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1olyua2idh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded1589",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1olyua2idh(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23813); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23814);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23815);DateTime result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23816);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23817);assertEquals(new DateTime(2010, 6, 9, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testWithDurationAdded_RD_int590() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vk92meidm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_RD_int590",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vk92meidm(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23818); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23819);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23820);DateTime result = test.withDurationAdded(new Duration(123456789L), 1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23821);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23822);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23823);result = test.withDurationAdded(null, 1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23824);assertSame(test, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23825);result = test.withDurationAdded(new Duration(123456789L), 0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23826);assertSame(test, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23827);result = test.withDurationAdded(new Duration(123456789L), 2); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23828);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23829);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23830);result = test.withDurationAdded(new Duration(123456789L), -3); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23831);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23832);assertEquals(expected, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testWithDurationAdded_long_int591() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17tlnvnie1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_long_int591",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17tlnvnie1(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23833); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23834);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23835);DateTime result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23836);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23837);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23838);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23839);assertSame(test, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23840);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23841);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23842);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23843);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23844);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23845);assertEquals(expected, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testPlus_RP592() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e73pq4iee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RP592",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e73pq4iee(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23846); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23847);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23848);DateTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23849);DateTime expected = new DateTime(2003, 7, 28, 6, 8, 10, 12, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23850);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23851);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23852);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testPlus_long593() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5ldgniel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_long593",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5ldgniel(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23853); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23854);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23855);DateTime result = test.plus(123456789L); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23856);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23857);assertEquals(expected, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testPlusMonths_int594() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1etri2gieq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMonths_int594",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1etri2gieq(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23858); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23859);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23860);DateTime result = test.plusMonths(1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23861);DateTime expected = new DateTime(2002, 6, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23862);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23863);result = test.plusMonths(0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23864);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testPlusDays_int596() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12589uiiex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusDays_int596",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12589uiiex(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23865); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23866);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23867);DateTime result = test.plusDays(1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23868);DateTime expected = new DateTime(2002, 5, 4, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23869);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23870);result = test.plusDays(0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23871);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testPlusMillis_int598() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1il1pfrif4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMillis_int598",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1il1pfrif4(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23872); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23873);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23874);DateTime result = test.plusMillis(1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23875);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 5, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23876);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23877);result = test.plusMillis(0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23878);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testMinus_long599() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1krw4ptifb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_long599",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1krw4ptifb(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23879); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23880);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23881);DateTime result = test.minus(123456789L); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23882);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23883);assertEquals(expected, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testMinusMonths_int600() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lkja10ifg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMonths_int600",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lkja10ifg(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23884); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23885);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23886);DateTime result = test.minusMonths(1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23887);DateTime expected = new DateTime(2002, 4, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23888);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23889);result = test.minusMonths(0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23890);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testMinusWeeks_int601() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3mzznifn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusWeeks_int601",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3mzznifn(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23891); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23892);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23893);DateTime result = test.minusWeeks(1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23894);DateTime expected = new DateTime(2002, 4, 26, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23895);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23896);result = test.minusWeeks(0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23897);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testMinusDays_int602() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dewkm2ifu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusDays_int602",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dewkm2ifu(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23898); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23899);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23900);DateTime result = test.minusDays(1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23901);DateTime expected = new DateTime(2002, 5, 2, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23902);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23903);result = test.minusDays(0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23904);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testMinusHours_int604() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ve1zvkig1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusHours_int604",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ve1zvkig1(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23905); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23906);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23907);DateTime result = test.minusHours(1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23908);DateTime expected = new DateTime(2002, 5, 3, 0, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23909);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23910);result = test.minusHours(0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23911);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testMinusMinutes_int605() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l20ub5ig8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMinutes_int605",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l20ub5ig8(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23912); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23913);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23914);DateTime result = test.minusMinutes(1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23915);DateTime expected = new DateTime(2002, 5, 3, 1, 1, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23916);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23917);result = test.minusMinutes(0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23918);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testMinusSeconds_int606() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ipt22aigf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusSeconds_int606",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ipt22aigf(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23919); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23920);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23921);DateTime result = test.minusSeconds(1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23922);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 2, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23923);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23924);result = test.minusSeconds(0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23925);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testMinusMillis_int607() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fktl0wigm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMillis_int607",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fktl0wigm(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23926); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23927);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23928);DateTime result = test.minusMillis(1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23929);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23930);assertEquals(expected, result); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23931);result = test.minusMillis(0); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23932);assertSame(test, result); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testProperty608() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1259ovyigt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testProperty608",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1259ovyigt(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23933); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23934);DateTime test = new DateTime(); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23935);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23936);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23937);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23938);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23939);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1i9di9dle6rckn9.R.inc(23940); 
             __CLR4_4_1i9di9dle6rckn9.R.inc(23941);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1i9di9dle6rckn9.R.inc(23942); 
             __CLR4_4_1i9di9dle6rckn9.R.inc(23943);return null; 
         }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1i9di9dle6rckn9.R.inc(23944); 
             __CLR4_4_1i9di9dle6rckn9.R.inc(23945);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 
     }; 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23946);try { 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23947);test.property(bad); 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23948);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23949);try { 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23950);test.property(null); 
         __CLR4_4_1i9di9dle6rckn9.R.inc(23951);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToTimeOfDay609() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16zvj2zihc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToTimeOfDay609",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16zvj2zihc(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23952); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23953);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23954);TimeOfDay test = base.toTimeOfDay(); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23955);assertEquals(new TimeOfDay(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testToLocalDateTime610() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5dgn7ihg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalDateTime610",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5dgn7ihg(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23956); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23957);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23958);LocalDateTime test = base.toLocalDateTime(); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23959);assertEquals(new LocalDateTime(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testToLocalTime611() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16stgyihk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalTime611",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16stgyihk(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23960); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23961);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23962);LocalTime test = base.toLocalTime(); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23963);assertEquals(new LocalTime(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testToString_String_Locale1402() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1au2avniho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_String_Locale1402",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1au2avniho(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23964); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23965);DateTime test = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23966);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23967);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23968);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23969);assertEquals("Sun 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23970);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null)); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testToInstant1405() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pnf2qrihv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToInstant1405",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pnf2qrihv(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23971); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23972);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23973);Instant result = test.toInstant(); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23974);assertEquals(TEST_TIME1, result.getMillis()); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


public void testToMutableDateTime_DateTimeZone1407() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u35smbihz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTime_DateTimeZone1407",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u35smbihz(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23975); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23976);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23977);MutableDateTime result = test.toMutableDateTime(LONDON); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23978);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23979);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23980);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23981);result = test.toMutableDateTime(PARIS); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23982);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23983);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23984);test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23985);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23986);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23987);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23988);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23989);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23990);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23991);assertEquals(ISO_DEFAULT, result.getChronology()); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToString_DTFormatter1413() {__CLR4_4_1i9di9dle6rckn9.R.globalSliceStart(getClass().getName(),23992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sqtjwbiig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i9di9dle6rckn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i9di9dle6rckn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_DTFormatter1413",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sqtjwbiig(){try{__CLR4_4_1i9di9dle6rckn9.R.inc(23992); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23993);DateMidnight test = new DateMidnight(TEST_TIME_NOW); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23994);assertEquals("2002 00", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1i9di9dle6rckn9.R.inc(23995);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1i9di9dle6rckn9.R.inc(23996);
            __CLR4_4_1i9di9dle6rckn9.R.inc(23997);return null;
        }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1i9di9dle6rckn9.R.inc(23998);
            __CLR4_4_1i9di9dle6rckn9.R.inc(23999);return TEST_TIME1;
        }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1i9di9dle6rckn9.R.inc(24000);
            __CLR4_4_1i9di9dle6rckn9.R.inc(24001);return ISO_DEFAULT;
        }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1i9di9dle6rckn9.R.inc(24002);
            __CLR4_4_1i9di9dle6rckn9.R.inc(24003);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1i9di9dle6rckn9.R.inc(24004);
            __CLR4_4_1i9di9dle6rckn9.R.inc(24005);return null;
        }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1i9di9dle6rckn9.R.inc(24006);
            __CLR4_4_1i9di9dle6rckn9.R.inc(24007);return this;
        }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1i9di9dle6rckn9.R.inc(24008);
            __CLR4_4_1i9di9dle6rckn9.R.inc(24009);return this;
        }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1i9di9dle6rckn9.R.inc(24010);
            __CLR4_4_1i9di9dle6rckn9.R.inc(24011);return "";
        }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}
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
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1i9di9dle6rckn9.R.inc(24012);
        __CLR4_4_1i9di9dle6rckn9.R.inc(24013);assertEquals(year, test.getYear());
        __CLR4_4_1i9di9dle6rckn9.R.inc(24014);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1i9di9dle6rckn9.R.inc(24015);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1i9di9dle6rckn9.R.inc(24016);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1i9di9dle6rckn9.R.inc(24017);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1i9di9dle6rckn9.R.inc(24018);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1i9di9dle6rckn9.R.inc(24019);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1i9di9dle6rckn9.R.flushNeeded();}}

}
