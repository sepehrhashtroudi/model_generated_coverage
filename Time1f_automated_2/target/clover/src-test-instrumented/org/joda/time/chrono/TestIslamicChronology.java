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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for IslamicChronology.
 *
 * @author Stephen Colebourne
 */
public class TestIslamicChronology extends TestCase {static class __CLR4_4_1kj4kj4le6nl8k4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,26655,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static long SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology ISLAMIC_UTC = IslamicChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1kj4kj4le6nl8k4.R.inc(26608);
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26609);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kj4kj4le6nl8k4.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kj4kj4le6nl8k4.R.inc(26610);
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26611);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26612);return new TestSuite(TestIslamicChronology.class);
    }finally{__CLR4_4_1kj4kj4le6nl8k4.R.flushNeeded();}}

    public TestIslamicChronology(String name) {
        super(name);__CLR4_4_1kj4kj4le6nl8k4.R.inc(26614);try{__CLR4_4_1kj4kj4le6nl8k4.R.inc(26613);
    }finally{__CLR4_4_1kj4kj4le6nl8k4.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kj4kj4le6nl8k4.R.inc(26615);
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26616);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26617);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26618);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26619);originalLocale = Locale.getDefault();
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26620);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26621);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26622);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1kj4kj4le6nl8k4.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kj4kj4le6nl8k4.R.inc(26623);
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26624);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26625);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26626);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26627);Locale.setDefault(originalLocale);
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26628);originalDateTimeZone = null;
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26629);originalTimeZone = null;
        __CLR4_4_1kj4kj4le6nl8k4.R.inc(26630);originalLocale = null;
    }finally{__CLR4_4_1kj4kj4le6nl8k4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithUTC54() {__CLR4_4_1kj4kj4le6nl8k4.R.globalSliceStart(getClass().getName(),26631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lf7ii6kjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kj4kj4le6nl8k4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kj4kj4le6nl8k4.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithUTC54",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lf7ii6kjr(){try{__CLR4_4_1kj4kj4le6nl8k4.R.inc(26631); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26632);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26633);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26634);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26635);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance().withUTC()); 
 }finally{__CLR4_4_1kj4kj4le6nl8k4.R.flushNeeded();}}
public void testToString55() {__CLR4_4_1kj4kj4le6nl8k4.R.globalSliceStart(getClass().getName(),26636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmjlc5kjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kj4kj4le6nl8k4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kj4kj4le6nl8k4.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testToString55",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmjlc5kjw(){try{__CLR4_4_1kj4kj4le6nl8k4.R.inc(26636); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26637);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26638);assertEquals("IslamicChronology[Asia/Tokyo]", IslamicChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26639);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance().toString()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26640);assertEquals("IslamicChronology[UTC]", IslamicChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1kj4kj4le6nl8k4.R.flushNeeded();}}
public void testSampleDateWithZone56() {__CLR4_4_1kj4kj4le6nl8k4.R.globalSliceStart(getClass().getName(),26641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de9z6kkk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kj4kj4le6nl8k4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kj4kj4le6nl8k4.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDateWithZone56",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de9z6kkk1(){try{__CLR4_4_1kj4kj4le6nl8k4.R.inc(26641); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26642);DateTime dt = new DateTime(2005, 11, 26, 12, 0, 0, 0, PARIS).withChronology(ISLAMIC_UTC); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26643);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26644);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26645);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26646);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26647);assertEquals(11, dt.getHourOfDay()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26648);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26649);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26650);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1kj4kj4le6nl8k4.R.flushNeeded();}}
public void testEpoch58() {__CLR4_4_1kj4kj4le6nl8k4.R.globalSliceStart(getClass().getName(),26651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvga9rkkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kj4kj4le6nl8k4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kj4kj4le6nl8k4.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testEpoch58",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvga9rkkb(){try{__CLR4_4_1kj4kj4le6nl8k4.R.inc(26651); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26652);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26653);DateTime expectedEpoch = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC); 
     __CLR4_4_1kj4kj4le6nl8k4.R.inc(26654);assertEquals(expectedEpoch.getMillis(), epoch.getMillis()); 
 }finally{__CLR4_4_1kj4kj4le6nl8k4.R.flushNeeded();}}
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

    

    

    

    

}
