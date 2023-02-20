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
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Basics extends TestCase {static class __CLR4_4_1i77i77le6o79t8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,23673,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
//    private static final int OFFSET = 1;
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
//    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
//    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    /** Mock zone simulating Asia/Gaza cutover at midnight 2007-04-01 */
    private static long CUTOVER_GAZA = 1175378400000L;
    private static int OFFSET_GAZA = 7200000;  // +02:00
    private static final DateTimeZone MOCK_GAZA = new MockZone(CUTOVER_GAZA, OFFSET_GAZA, 3600);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1i77i77le6o79t8.R.inc(23587);
        __CLR4_4_1i77i77le6o79t8.R.inc(23588);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i77i77le6o79t8.R.inc(23589);
        __CLR4_4_1i77i77le6o79t8.R.inc(23590);return new TestSuite(TestLocalDate_Basics.class);
    }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}

    public TestLocalDate_Basics(String name) {
        super(name);__CLR4_4_1i77i77le6o79t8.R.inc(23592);try{__CLR4_4_1i77i77le6o79t8.R.inc(23591);
    }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i77i77le6o79t8.R.inc(23593);
        __CLR4_4_1i77i77le6o79t8.R.inc(23594);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i77i77le6o79t8.R.inc(23595);zone = DateTimeZone.getDefault();
        __CLR4_4_1i77i77le6o79t8.R.inc(23596);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1i77i77le6o79t8.R.inc(23597);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1i77i77le6o79t8.R.inc(23598);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i77i77le6o79t8.R.inc(23599);
        __CLR4_4_1i77i77le6o79t8.R.inc(23600);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i77i77le6o79t8.R.inc(23601);DateTimeZone.setDefault(zone);
        __CLR4_4_1i77i77le6o79t8.R.inc(23602);zone = null;
        __CLR4_4_1i77i77le6o79t8.R.inc(23603);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1i77i77le6o79t8.R.inc(23604);systemDefaultLocale = null;
    }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testIsSupported_DurationFieldType277() {__CLR4_4_1i77i77le6o79t8.R.globalSliceStart(getClass().getName(),23605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4rst6i7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i77i77le6o79t8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i77i77le6o79t8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DurationFieldType277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4rst6i7p(){try{__CLR4_4_1i77i77le6o79t8.R.inc(23605); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23606);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23607);assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23608);assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23609);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23610);assertEquals(true, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23611);assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23612);assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23613);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23614);assertEquals(false, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23615);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}
public void testIsAfter_LocalDate279() {__CLR4_4_1i77i77le6o79t8.R.globalSliceStart(getClass().getName(),23616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lvco7zi80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i77i77le6o79t8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i77i77le6o79t8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsAfter_LocalDate279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lvco7zi80(){try{__CLR4_4_1i77i77le6o79t8.R.inc(23616); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23617);LocalDate test1 = new LocalDate(2005, 6, 2); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23618);LocalDate test1a = new LocalDate(2005, 6, 2); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23619);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23620);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23621);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23622);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23623);LocalDate test2 = new LocalDate(2005, 7, 2); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23624);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23625);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23626);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23627);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23628);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23629);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23630);try { 
         __CLR4_4_1i77i77le6o79t8.R.inc(23631);new LocalDate(2005, 7, 2).isAfter(null); 
         __CLR4_4_1i77i77le6o79t8.R.inc(23632);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_2280() {__CLR4_4_1i77i77le6o79t8.R.globalSliceStart(getClass().getName(),23633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ncjf3i8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i77i77le6o79t8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i77i77le6o79t8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_2280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ncjf3i8h(){try{__CLR4_4_1i77i77le6o79t8.R.inc(23633); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23634);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23635);try { 
         __CLR4_4_1i77i77le6o79t8.R.inc(23636);test.withFieldAdded(null, 0); 
         __CLR4_4_1i77i77le6o79t8.R.inc(23637);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_4281() {__CLR4_4_1i77i77le6o79t8.R.globalSliceStart(getClass().getName(),23638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1flpsmmi8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i77i77le6o79t8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i77i77le6o79t8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_4281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1flpsmmi8m(){try{__CLR4_4_1i77i77le6o79t8.R.inc(23638); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23639);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23640);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23641);assertSame(test, result); 
 }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}
public void testMinus_RP282() {__CLR4_4_1i77i77le6o79t8.R.globalSliceStart(getClass().getName(),23642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ryejwi8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i77i77le6o79t8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i77i77le6o79t8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinus_RP282",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ryejwi8q(){try{__CLR4_4_1i77i77le6o79t8.R.inc(23642); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23643);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23644);LocalDate result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23645);LocalDate expected = new LocalDate(2001, 3, 26, BUDDHIST_LONDON); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23646);assertEquals(expected, result); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23647);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23648);assertSame(test, result); 
 }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}
public void testPlus_RP283() {__CLR4_4_1i77i77le6o79t8.R.globalSliceStart(getClass().getName(),23649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y9ekvxi8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i77i77le6o79t8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i77i77le6o79t8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlus_RP283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y9ekvxi8x(){try{__CLR4_4_1i77i77le6o79t8.R.inc(23649); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23650);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23651);LocalDate result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23652);LocalDate expected = new LocalDate(2003, 7, 28, BUDDHIST_LONDON); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23653);assertEquals(expected, result); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23654);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23655);assertSame(test, result); 
 }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}
public void testToString_String284() {__CLR4_4_1i77i77le6o79t8.R.globalSliceStart(getClass().getName(),23656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8rz25i94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i77i77le6o79t8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i77i77le6o79t8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String284",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8rz25i94(){try{__CLR4_4_1i77i77le6o79t8.R.inc(23656); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23657);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23658);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23659);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23660);assertEquals("1970-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23661);assertEquals("Tue 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1i77i77le6o79t8.R.inc(23662);assertEquals("1970-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1i77i77le6o79t8.R.inc(23663);
            __CLR4_4_1i77i77le6o79t8.R.inc(23664);return COPTIC_UTC;
        }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1i77i77le6o79t8.R.inc(23665);
            __CLR4_4_1i77i77le6o79t8.R.inc(23666);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1i77i77le6o79t8.R.inc(23667);
            __CLR4_4_1i77i77le6o79t8.R.inc(23668);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}
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
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int hour, int min, int sec) {try{__CLR4_4_1i77i77le6o79t8.R.inc(23669);
        __CLR4_4_1i77i77le6o79t8.R.inc(23670);assertEquals(hour, test.getYear());
        __CLR4_4_1i77i77le6o79t8.R.inc(23671);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1i77i77le6o79t8.R.inc(23672);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1i77i77le6o79t8.R.flushNeeded();}}
}
