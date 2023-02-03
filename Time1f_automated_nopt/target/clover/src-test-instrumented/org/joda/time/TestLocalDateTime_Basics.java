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
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Basics extends TestCase {static class __CLR4_4_1hdghdgldl9117d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675230570616L,8589935092L,22559,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);

//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private int MILLIS_OF_DAY_UTC =
        (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L);

    private long TEST_TIME_NOW_UTC =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY + MILLIS_OF_DAY_UTC;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1hdghdgldl9117d.R.inc(22516);
        __CLR4_4_1hdghdgldl9117d.R.inc(22517);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hdghdgldl9117d.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hdghdgldl9117d.R.inc(22518);
        __CLR4_4_1hdghdgldl9117d.R.inc(22519);return new TestSuite(TestLocalDateTime_Basics.class);
    }finally{__CLR4_4_1hdghdgldl9117d.R.flushNeeded();}}

    public TestLocalDateTime_Basics(String name) {
        super(name);__CLR4_4_1hdghdgldl9117d.R.inc(22521);try{__CLR4_4_1hdghdgldl9117d.R.inc(22520);
    }finally{__CLR4_4_1hdghdgldl9117d.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hdghdgldl9117d.R.inc(22522);
        __CLR4_4_1hdghdgldl9117d.R.inc(22523);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1hdghdgldl9117d.R.inc(22524);zone = DateTimeZone.getDefault();
        __CLR4_4_1hdghdgldl9117d.R.inc(22525);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hdghdgldl9117d.R.inc(22526);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1hdghdgldl9117d.R.inc(22527);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1hdghdgldl9117d.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hdghdgldl9117d.R.inc(22528);
        __CLR4_4_1hdghdgldl9117d.R.inc(22529);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hdghdgldl9117d.R.inc(22530);DateTimeZone.setDefault(zone);
        __CLR4_4_1hdghdgldl9117d.R.inc(22531);zone = null;
        __CLR4_4_1hdghdgldl9117d.R.inc(22532);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1hdghdgldl9117d.R.inc(22533);systemDefaultLocale = null;
    }finally{__CLR4_4_1hdghdgldl9117d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testCompareTo1133() {__CLR4_4_1hdghdgldl9117d.R.globalSliceStart(getClass().getName(),22534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bw6bzfhdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdghdgldl9117d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdghdgldl9117d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testCompareTo1133",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bw6bzfhdy(){try{__CLR4_4_1hdghdgldl9117d.R.inc(22534); __CLR4_4_1hdghdgldl9117d.R.inc(22535);final DateTime dt = DateTime.now(DateTimeZone.UTC); __CLR4_4_1hdghdgldl9117d.R.inc(22536);final DateTime dt2 = DateTime.now(DateTimeZone.UTC); __CLR4_4_1hdghdgldl9117d.R.inc(22537);final DateTime dt3 = DateTime.now(DateTimeZone.UTC); __CLR4_4_1hdghdgldl9117d.R.inc(22538);final DateTime dt4 = DateTime.now(DateTimeZone.UTC); __CLR4_4_1hdghdgldl9117d.R.inc(22539);final DateTime dt5 = DateTime.now(DateTimeZone.UTC); __CLR4_4_1hdghdgldl9117d.R.inc(22540);final DateTime dt6 = DateTime.now(DateTimeZone.UTC); __CLR4_4_1hdghdgldl9117d.R.inc(22541);final DateTime dt7 = DateTime.now(DateTimeZone.UTC); __CLR4_4_1hdghdgldl9117d.R.inc(22542);final DateTime dt8 = DateTime.now(DateTimeZone.UTC); __CLR4_4_1hdghdgldl9117d.R.inc(22543);final DateTime dt9 = DateTime.now(DateTimeZone.UTC); __CLR4_4_1hdghdgldl9117d.R.inc(22544);final DateTime dt10 = DateTime.now(DateTimeZone.UTC);
}finally{__CLR4_4_1hdghdgldl9117d.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1hdghdgldl9117d.R.inc(22545);
            __CLR4_4_1hdghdgldl9117d.R.inc(22546);return COPTIC_UTC;
        }finally{__CLR4_4_1hdghdgldl9117d.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1hdghdgldl9117d.R.inc(22547);
            __CLR4_4_1hdghdgldl9117d.R.inc(22548);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
                COPTIC_UTC.millisOfDay(),
            };
        }finally{__CLR4_4_1hdghdgldl9117d.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1hdghdgldl9117d.R.inc(22549);
            __CLR4_4_1hdghdgldl9117d.R.inc(22550);return new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC};
        }finally{__CLR4_4_1hdghdgldl9117d.R.flushNeeded();}}
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
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1hdghdgldl9117d.R.inc(22551);
        __CLR4_4_1hdghdgldl9117d.R.inc(22552);assertEquals(year, test.getYear());
        __CLR4_4_1hdghdgldl9117d.R.inc(22553);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1hdghdgldl9117d.R.inc(22554);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1hdghdgldl9117d.R.inc(22555);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1hdghdgldl9117d.R.inc(22556);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1hdghdgldl9117d.R.inc(22557);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1hdghdgldl9117d.R.inc(22558);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1hdghdgldl9117d.R.flushNeeded();}}
}
