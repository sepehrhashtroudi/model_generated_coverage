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
public class TestLocalDate_Basics extends TestCase {static class __CLR4_4_1howhowlccietnq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,22979,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1howhowlccietnq.R.inc(22928);
        __CLR4_4_1howhowlccietnq.R.inc(22929);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1howhowlccietnq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1howhowlccietnq.R.inc(22930);
        __CLR4_4_1howhowlccietnq.R.inc(22931);return new TestSuite(TestLocalDate_Basics.class);
    }finally{__CLR4_4_1howhowlccietnq.R.flushNeeded();}}

    public TestLocalDate_Basics(String name) {
        super(name);__CLR4_4_1howhowlccietnq.R.inc(22933);try{__CLR4_4_1howhowlccietnq.R.inc(22932);
    }finally{__CLR4_4_1howhowlccietnq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1howhowlccietnq.R.inc(22934);
        __CLR4_4_1howhowlccietnq.R.inc(22935);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1howhowlccietnq.R.inc(22936);zone = DateTimeZone.getDefault();
        __CLR4_4_1howhowlccietnq.R.inc(22937);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1howhowlccietnq.R.inc(22938);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1howhowlccietnq.R.inc(22939);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1howhowlccietnq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1howhowlccietnq.R.inc(22940);
        __CLR4_4_1howhowlccietnq.R.inc(22941);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1howhowlccietnq.R.inc(22942);DateTimeZone.setDefault(zone);
        __CLR4_4_1howhowlccietnq.R.inc(22943);zone = null;
        __CLR4_4_1howhowlccietnq.R.inc(22944);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1howhowlccietnq.R.inc(22945);systemDefaultLocale = null;
    }finally{__CLR4_4_1howhowlccietnq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testMinusYears_int4() {__CLR4_4_1howhowlccietnq.R.globalSliceStart(getClass().getName(),22946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1td19hvhpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1howhowlccietnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1howhowlccietnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusYears_int4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1td19hvhpe(){try{__CLR4_4_1howhowlccietnq.R.inc(22946); 
     __CLR4_4_1howhowlccietnq.R.inc(22947);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1howhowlccietnq.R.inc(22948);LocalDate result = test.minusYears(1); 
     __CLR4_4_1howhowlccietnq.R.inc(22949);LocalDate expected = new LocalDate(2001, 5, 3, BUDDHIST_LONDON); 
     __CLR4_4_1howhowlccietnq.R.inc(22950);assertEquals(expected, result); 
     __CLR4_4_1howhowlccietnq.R.inc(22951);result = test.minusYears(0); 
     __CLR4_4_1howhowlccietnq.R.inc(22952);assertSame(test, result); 
 }finally{__CLR4_4_1howhowlccietnq.R.flushNeeded();}}
public void testIsSupported_DurationFieldType65() {__CLR4_4_1howhowlccietnq.R.globalSliceStart(getClass().getName(),22953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mmbmbdhpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1howhowlccietnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1howhowlccietnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DurationFieldType65",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mmbmbdhpl(){try{__CLR4_4_1howhowlccietnq.R.inc(22953); 
     __CLR4_4_1howhowlccietnq.R.inc(22954);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1howhowlccietnq.R.inc(22955);assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     __CLR4_4_1howhowlccietnq.R.inc(22956);assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     __CLR4_4_1howhowlccietnq.R.inc(22957);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1howhowlccietnq.R.inc(22958);assertEquals(true, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1howhowlccietnq.R.inc(22959);assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     __CLR4_4_1howhowlccietnq.R.inc(22960);assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1howhowlccietnq.R.inc(22961);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1howhowlccietnq.R.inc(22962);assertEquals(false, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1howhowlccietnq.R.inc(22963);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1howhowlccietnq.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_1321() {__CLR4_4_1howhowlccietnq.R.globalSliceStart(getClass().getName(),22964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xozwt4hpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1howhowlccietnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1howhowlccietnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_1321",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xozwt4hpw(){try{__CLR4_4_1howhowlccietnq.R.inc(22964); 
     __CLR4_4_1howhowlccietnq.R.inc(22965);LocalDate test = new LocalDate(2004, 6, 9); 
     __CLR4_4_1howhowlccietnq.R.inc(22966);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1howhowlccietnq.R.inc(22967);assertEquals(new LocalDate(2004, 6, 9), test); 
     __CLR4_4_1howhowlccietnq.R.inc(22968);assertEquals(new LocalDate(2010, 6, 9), result); 
 }finally{__CLR4_4_1howhowlccietnq.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1howhowlccietnq.R.inc(22969);
            __CLR4_4_1howhowlccietnq.R.inc(22970);return COPTIC_UTC;
        }finally{__CLR4_4_1howhowlccietnq.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1howhowlccietnq.R.inc(22971);
            __CLR4_4_1howhowlccietnq.R.inc(22972);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1howhowlccietnq.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1howhowlccietnq.R.inc(22973);
            __CLR4_4_1howhowlccietnq.R.inc(22974);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1howhowlccietnq.R.flushNeeded();}}
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
    private void check(LocalDate test, int hour, int min, int sec) {try{__CLR4_4_1howhowlccietnq.R.inc(22975);
        __CLR4_4_1howhowlccietnq.R.inc(22976);assertEquals(hour, test.getYear());
        __CLR4_4_1howhowlccietnq.R.inc(22977);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1howhowlccietnq.R.inc(22978);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1howhowlccietnq.R.flushNeeded();}}
}
