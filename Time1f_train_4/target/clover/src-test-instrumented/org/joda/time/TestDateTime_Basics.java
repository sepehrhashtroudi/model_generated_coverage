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
public class TestDateTime_Basics extends TestCase {static class __CLR4_4_1iauiaule6rjc8z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,24157,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1iauiaule6rjc8z.R.inc(23718);
        __CLR4_4_1iauiaule6rjc8z.R.inc(23719);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iauiaule6rjc8z.R.inc(23720);
        __CLR4_4_1iauiaule6rjc8z.R.inc(23721);return new TestSuite(TestDateTime_Basics.class);
    }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}

    public TestDateTime_Basics(String name) {
        super(name);__CLR4_4_1iauiaule6rjc8z.R.inc(23723);try{__CLR4_4_1iauiaule6rjc8z.R.inc(23722);
    }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iauiaule6rjc8z.R.inc(23724);
        __CLR4_4_1iauiaule6rjc8z.R.inc(23725);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iauiaule6rjc8z.R.inc(23726);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1iauiaule6rjc8z.R.inc(23727);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1iauiaule6rjc8z.R.inc(23728);originalLocale = Locale.getDefault();
        __CLR4_4_1iauiaule6rjc8z.R.inc(23729);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1iauiaule6rjc8z.R.inc(23730);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1iauiaule6rjc8z.R.inc(23731);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iauiaule6rjc8z.R.inc(23732);
        __CLR4_4_1iauiaule6rjc8z.R.inc(23733);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iauiaule6rjc8z.R.inc(23734);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1iauiaule6rjc8z.R.inc(23735);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1iauiaule6rjc8z.R.inc(23736);Locale.setDefault(originalLocale);
        __CLR4_4_1iauiaule6rjc8z.R.inc(23737);originalDateTimeZone = null;
        __CLR4_4_1iauiaule6rjc8z.R.inc(23738);originalTimeZone = null;
        __CLR4_4_1iauiaule6rjc8z.R.inc(23739);originalLocale = null;
    }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlusYears_int157() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r4plsibg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusYears_int157",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r4plsibg(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23740); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23741);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23742);DateTime result = test.plusYears(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23743);DateTime expected = new DateTime(2003, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23744);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23745);result = test.plusYears(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23746);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testWithers406() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xr44tibn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithers406",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xr44tibn(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23747); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23748);DateTime test = new DateTime(1970, 6, 9, 10, 20, 30, 40, GJ_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23749);check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23750);check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23751);check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23752);check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23753);check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23754);check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23755);check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23756);check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23757);check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23758);check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23759);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23760);check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23761);check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23762);check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23763);check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23764);check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23765);try { 
         __CLR4_4_1iauiaule6rjc8z.R.inc(23766);test.withMonthOfYear(0); 
         __CLR4_4_1iauiaule6rjc8z.R.inc(23767);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23768);try { 
         __CLR4_4_1iauiaule6rjc8z.R.inc(23769);test.withMonthOfYear(13); 
         __CLR4_4_1iauiaule6rjc8z.R.inc(23770);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testToDateTimeISO581() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q2l2iwicb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTimeISO581",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q2l2iwicb(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23771); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23772);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23773);DateTime result = test.toDateTimeISO(); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23774);assertSame(test, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23775);test = new DateTime(TEST_TIME1, ISO_PARIS); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23776);result = test.toDateTimeISO(); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23777);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23778);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23779);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23780);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23781);assertNotSame(test, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23782);test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23783);result = test.toDateTimeISO(); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23784);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23785);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23786);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23787);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23788);assertNotSame(test, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23789);test = new DateTime(TEST_TIME1, new MockNullZoneChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23790);result = test.toDateTimeISO(); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23791);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23792);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23793);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23794);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23795);assertNotSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testToDateTime_DateTimeZone582() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xqlzxkid0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_DateTimeZone582",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xqlzxkid0(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23796); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23797);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23798);DateTime result = test.toDateTime(LONDON); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23799);assertSame(test, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23800);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23801);result = test.toDateTime(PARIS); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23802);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23803);assertEquals(PARIS, result.getZone()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23804);test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23805);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23806);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23807);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23808);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23809);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23810);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testToDateTime_Chronology583() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2jds8idf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_Chronology583",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2jds8idf(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23811); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23812);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23813);DateTime result = test.toDateTime(ISO_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23814);assertSame(test, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23815);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23816);result = test.toDateTime(GREGORIAN_PARIS); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23817);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23818);assertEquals(GREGORIAN_PARIS, result.getChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23819);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23820);result = test.toDateTime((Chronology) null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23821);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23822);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23823);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23824);result = test.toDateTime((Chronology) null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23825);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testWithZoneRetainFields_DateTimeZone584() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ap1d9widu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithZoneRetainFields_DateTimeZone584",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ap1d9widu(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23826); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23827);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23828);DateTime result = test.withZoneRetainFields(PARIS); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23829);assertEquals(test.getMillis() - DateTimeConstants.MILLIS_PER_HOUR, result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23830);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23831);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23832);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23833);assertSame(test, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23834);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23835);result = test.withZoneRetainFields(null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23836);assertSame(test, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23837);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23838);result = test.withZoneRetainFields(null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23839);assertEquals(test.getMillis() + DateTimeConstants.MILLIS_PER_HOUR, result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23840);assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23841);test = new DateTime(TEST_TIME1, new MockNullZoneChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23842);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23843);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testWithDate_int_int_int585() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qxz9i5iec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDate_int_int_int585",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qxz9i5iec(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23844); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23845);DateTime test = new DateTime(2002, 4, 5, 1, 2, 3, 4, ISO_UTC); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23846);DateTime result = test.withDate(2003, 5, 6); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23847);DateTime expected = new DateTime(2003, 5, 6, 1, 2, 3, 4, ISO_UTC); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23848);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23849);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23850);try { 
         __CLR4_4_1iauiaule6rjc8z.R.inc(23851);test.withDate(2003, 13, 1); 
         __CLR4_4_1iauiaule6rjc8z.R.inc(23852);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testWithTime_int_int_int586() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18w4suziel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithTime_int_int_int586",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18w4suziel(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23853); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23854);DateTime test = new DateTime(TEST_TIME1 - 12345L, BUDDHIST_UTC); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23855);DateTime result = test.withTime(12, 24, 0, 0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23856);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23857);assertEquals(BUDDHIST_UTC, result.getChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23858);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23859);try { 
         __CLR4_4_1iauiaule6rjc8z.R.inc(23860);test.withTime(25, 1, 1, 1); 
         __CLR4_4_1iauiaule6rjc8z.R.inc(23861);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testWithFields_RPartial587() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xne6deieu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFields_RPartial587",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xne6deieu(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23862); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23863);DateTime test = new DateTime(2004, 5, 6, 7, 8, 9, 0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23864);DateTime result = test.withFields(new YearMonthDay(2003, 4, 5)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23865);DateTime expected = new DateTime(2003, 4, 5, 7, 8, 9, 0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23866);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23867);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23868);result = test.withFields(null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23869);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testWithField1588() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gz6zubif2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField1588",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gz6zubif2(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23870); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23871);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23872);DateTime result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23873);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23874);assertEquals(new DateTime(2006, 6, 9, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testWithField2589() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18vidubif7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField2589",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18vidubif7(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23875); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23876);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23877);try { 
         __CLR4_4_1iauiaule6rjc8z.R.inc(23878);test.withField(null, 6); 
         __CLR4_4_1iauiaule6rjc8z.R.inc(23879);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testWithFieldAdded4590() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ve82n7ifc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded4590",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ve82n7ifc(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23880); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23881);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23882);DateTime result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23883);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testWithFieldAdded1591() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sbu0htifg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded1591",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sbu0htifg(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23884); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23885);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23886);DateTime result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23887);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23888);assertEquals(new DateTime(2010, 6, 9, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testWithDurationAdded_RD_int592() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wyv1rsifl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_RD_int592",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wyv1rsifl(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23889); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23890);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23891);DateTime result = test.withDurationAdded(new Duration(123456789L), 1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23892);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23893);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23894);result = test.withDurationAdded(null, 1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23895);assertSame(test, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23896);result = test.withDurationAdded(new Duration(123456789L), 0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23897);assertSame(test, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23898);result = test.withDurationAdded(new Duration(123456789L), 2); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23899);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23900);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23901);result = test.withDurationAdded(new Duration(123456789L), -3); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23902);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23903);assertEquals(expected, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testWithDurationAdded_long_int593() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11blqapig0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_long_int593",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11blqapig0(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23904); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23905);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23906);DateTime result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23907);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23908);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23909);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23910);assertSame(test, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23911);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23912);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23913);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23914);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23915);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23916);assertEquals(expected, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testPlus_RP594() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17p3s56igd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RP594",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17p3s56igd(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23917); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23918);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23919);DateTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23920);DateTime expected = new DateTime(2003, 7, 28, 6, 8, 10, 12, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23921);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23922);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23923);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testPlus_RD595() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18csi43igk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RD595",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18csi43igk(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23924); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23925);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23926);DateTime result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23927);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23928);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23929);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23930);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testPlusMonths_int596() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18brkhiigr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMonths_int596",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18brkhiigr(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23931); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23932);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23933);DateTime result = test.plusMonths(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23934);DateTime expected = new DateTime(2002, 6, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23935);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23936);result = test.plusMonths(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23937);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testPlusWeeks_int597() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0v51ligy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusWeeks_int597",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0v51ligy(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23938); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23939);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23940);DateTime result = test.plusWeeks(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23941);DateTime expected = new DateTime(2002, 5, 10, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23942);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23943);result = test.plusWeeks(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23944);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testPlusDays_int598() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14crnqgih5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusDays_int598",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14crnqgih5(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23945); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23946);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23947);DateTime result = test.plusDays(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23948);DateTime expected = new DateTime(2002, 5, 4, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23949);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23950);result = test.plusDays(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23951);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testPlusHours_int599() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o7tw15ihc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusHours_int599",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o7tw15ihc(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23952); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23953);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23954);DateTime result = test.plusHours(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23955);DateTime expected = new DateTime(2002, 5, 3, 2, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23956);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23957);result = test.plusHours(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23958);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testPlusMinutes_int600() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0cs12ihj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMinutes_int600",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0cs12ihj(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23959); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23960);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23961);DateTime result = test.plusMinutes(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23962);DateTime expected = new DateTime(2002, 5, 3, 1, 3, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23963);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23964);result = test.plusMinutes(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23965);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testPlusSeconds_int602() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m3klhgihq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusSeconds_int602",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m3klhgihq(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23966); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23967);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23968);DateTime result = test.plusSeconds(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23969);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 4, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23970);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23971);result = test.plusSeconds(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23972);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testPlusMillis_int604() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h266g1ihx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMillis_int604",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h266g1ihx(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23973); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23974);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23975);DateTime result = test.plusMillis(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23976);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 5, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23977);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23978);result = test.plusMillis(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23979);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testMinus_long605() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j90lq3ii4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_long605",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j90lq3ii4(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23980); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23981);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23982);DateTime result = test.minus(123456789L); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23983);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23984);assertEquals(expected, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testMinus_RD606() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f601sgii9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RD606",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f601sgii9(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23985); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23986);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23987);DateTime result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23988);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23989);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23990);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23991);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testMinus_RP607() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opwegriig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RP607",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opwegriig(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23992); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23993);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23994);DateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23995);DateTime expected = new DateTime(2001, 3, 26, 0, 1, 2, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23996);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23997);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(23998);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testMinusYears_int608() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),23999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16t428ziin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusYears_int608",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16t428ziin(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(23999); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24000);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24001);DateTime result = test.minusYears(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24002);DateTime expected = new DateTime(2001, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24003);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24004);result = test.minusYears(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24005);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testMinusMonths_int609() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ogf39iiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMonths_int609",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ogf39iiu(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24006); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24007);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24008);DateTime result = test.minusMonths(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24009);DateTime expected = new DateTime(2002, 4, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24010);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24011);result = test.minusMonths(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24012);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testMinusDays_int610() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yeciehij1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusDays_int610",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yeciehij1(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24013); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24014);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24015);DateTime result = test.minusDays(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24016);DateTime expected = new DateTime(2002, 5, 2, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24017);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24018);result = test.minusDays(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24019);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testMinusHours_int612() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gf734zij8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusHours_int612",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gf734zij8(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24020); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24021);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24022);DateTime result = test.minusHours(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24023);DateTime expected = new DateTime(2002, 5, 3, 0, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24024);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24025);result = test.minusHours(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24026);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testMinusMinutes_int613() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qr88peijf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMinutes_int613",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qr88peijf(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24027); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24028);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24029);DateTime result = test.minusMinutes(1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24030);DateTime expected = new DateTime(2002, 5, 3, 1, 1, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24031);assertEquals(expected, result); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24032);result = test.minusMinutes(0); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24033);assertSame(test, result); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToDateMidnight614() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d73fjfijm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateMidnight614",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d73fjfijm(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24034); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24035);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24036);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24037);assertEquals(new DateMidnight(base, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testToLocalDateTime615() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yedalkijq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalDateTime615",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yedalkijq(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24038); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24039);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24040);LocalDateTime test = base.toLocalDateTime(); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24041);assertEquals(new LocalDateTime(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testToLocalTime617() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1josm7siju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalTime617",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1josm7siju(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24042); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24043);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24044);LocalTime test = base.toLocalTime(); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24045);assertEquals(new LocalTime(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testToString_String_Locale1394() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12t6uazijy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_String_Locale1394",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12t6uazijy(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24046); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24047);DateTime test = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24048);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24049);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24050);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24051);assertEquals("Sun 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24052);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null)); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType1396() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sgumnmik5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsSupported_DateTimeFieldType1396",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sgumnmik5(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24053); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24054);DateTime test = new DateTime(); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24055);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24056);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24057);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24058);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24059);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24060);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24061);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24062);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24063);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24064);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24065);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24066);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24067);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24068);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24069);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24070);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24071);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24072);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24073);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24074);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24075);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24076);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24077);assertEquals(false, test.isSupported(null)); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testToInstant1398() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvjkykiku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToInstant1398",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvjkykiku(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24078); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24079);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24080);Instant result = test.toInstant(); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24081);assertEquals(TEST_TIME1, result.getMillis()); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testToMutableDateTimeISO1401() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bjio04iky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTimeISO1401",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bjio04iky(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24082); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24083);DateTime test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24084);MutableDateTime result = test.toMutableDateTimeISO(); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24085);assertSame(MutableDateTime.class, result.getClass()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24086);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24087);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24088);assertEquals(ISO_PARIS, result.getChronology()); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testToMutableDateTime_DateTimeZone1402() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du5ynyil5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTime_DateTimeZone1402",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du5ynyil5(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24089); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24090);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24091);MutableDateTime result = test.toMutableDateTime(LONDON); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24092);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24093);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24094);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24095);result = test.toMutableDateTime(PARIS); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24096);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24097);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24098);test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24099);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24100);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24101);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24102);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24103);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24104);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24105);assertEquals(ISO_DEFAULT, result.getChronology()); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testIsAfter_RI1404() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xtu4u4ilm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfter_RI1404",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xtu4u4ilm(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24106); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24107);DateTime test1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24108);DateTime test1a = new DateTime(TEST_TIME1); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24109);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24110);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24111);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24112);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24113);DateTime test2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24114);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24115);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24116);DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24117);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24118);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24119);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24120);assertEquals(true, test2.isAfter(new MockInstant())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24121);assertEquals(false, test1.isAfter(new MockInstant())); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24122);assertEquals(true, new DateTime(TEST_TIME_NOW + 1).isAfter(null)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24123);assertEquals(false, new DateTime(TEST_TIME_NOW).isAfter(null)); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24124);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isAfter(null)); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


public void testIsAfterNow1405() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbo9q3im5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfterNow1405",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbo9q3im5(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24125); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24126);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isAfterNow()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24127);assertEquals(false, new DateTime(TEST_TIME_NOW).isAfterNow()); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24128);assertEquals(true, new DateTime(TEST_TIME_NOW + 1).isAfterNow()); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToString_DTFormatter1409() {__CLR4_4_1iauiaule6rjc8z.R.globalSliceStart(getClass().getName(),24129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2fea4im9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iauiaule6rjc8z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iauiaule6rjc8z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_DTFormatter1409",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2fea4im9(){try{__CLR4_4_1iauiaule6rjc8z.R.inc(24129); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24130);DateMidnight test = new DateMidnight(TEST_TIME_NOW); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24131);assertEquals("2002 00", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1iauiaule6rjc8z.R.inc(24132);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1iauiaule6rjc8z.R.inc(24133);
            __CLR4_4_1iauiaule6rjc8z.R.inc(24134);return null;
        }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1iauiaule6rjc8z.R.inc(24135);
            __CLR4_4_1iauiaule6rjc8z.R.inc(24136);return TEST_TIME1;
        }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1iauiaule6rjc8z.R.inc(24137);
            __CLR4_4_1iauiaule6rjc8z.R.inc(24138);return ISO_DEFAULT;
        }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1iauiaule6rjc8z.R.inc(24139);
            __CLR4_4_1iauiaule6rjc8z.R.inc(24140);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1iauiaule6rjc8z.R.inc(24141);
            __CLR4_4_1iauiaule6rjc8z.R.inc(24142);return null;
        }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1iauiaule6rjc8z.R.inc(24143);
            __CLR4_4_1iauiaule6rjc8z.R.inc(24144);return this;
        }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1iauiaule6rjc8z.R.inc(24145);
            __CLR4_4_1iauiaule6rjc8z.R.inc(24146);return this;
        }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1iauiaule6rjc8z.R.inc(24147);
            __CLR4_4_1iauiaule6rjc8z.R.inc(24148);return "";
        }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}
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
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1iauiaule6rjc8z.R.inc(24149);
        __CLR4_4_1iauiaule6rjc8z.R.inc(24150);assertEquals(year, test.getYear());
        __CLR4_4_1iauiaule6rjc8z.R.inc(24151);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1iauiaule6rjc8z.R.inc(24152);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1iauiaule6rjc8z.R.inc(24153);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1iauiaule6rjc8z.R.inc(24154);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1iauiaule6rjc8z.R.inc(24155);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1iauiaule6rjc8z.R.inc(24156);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1iauiaule6rjc8z.R.flushNeeded();}}

}
