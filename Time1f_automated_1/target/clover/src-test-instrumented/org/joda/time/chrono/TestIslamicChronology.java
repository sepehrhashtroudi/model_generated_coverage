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
public class TestIslamicChronology extends TestCase {static class __CLR4_4_1krpkrple6ndpxg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,26963,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1krpkrple6ndpxg.R.inc(26917);
        __CLR4_4_1krpkrple6ndpxg.R.inc(26918);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1krpkrple6ndpxg.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1krpkrple6ndpxg.R.inc(26919);
        __CLR4_4_1krpkrple6ndpxg.R.inc(26920);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1krpkrple6ndpxg.R.inc(26921);return new TestSuite(TestIslamicChronology.class);
    }finally{__CLR4_4_1krpkrple6ndpxg.R.flushNeeded();}}

    public TestIslamicChronology(String name) {
        super(name);__CLR4_4_1krpkrple6ndpxg.R.inc(26923);try{__CLR4_4_1krpkrple6ndpxg.R.inc(26922);
    }finally{__CLR4_4_1krpkrple6ndpxg.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1krpkrple6ndpxg.R.inc(26924);
        __CLR4_4_1krpkrple6ndpxg.R.inc(26925);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1krpkrple6ndpxg.R.inc(26926);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1krpkrple6ndpxg.R.inc(26927);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1krpkrple6ndpxg.R.inc(26928);originalLocale = Locale.getDefault();
        __CLR4_4_1krpkrple6ndpxg.R.inc(26929);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1krpkrple6ndpxg.R.inc(26930);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1krpkrple6ndpxg.R.inc(26931);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1krpkrple6ndpxg.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1krpkrple6ndpxg.R.inc(26932);
        __CLR4_4_1krpkrple6ndpxg.R.inc(26933);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1krpkrple6ndpxg.R.inc(26934);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1krpkrple6ndpxg.R.inc(26935);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1krpkrple6ndpxg.R.inc(26936);Locale.setDefault(originalLocale);
        __CLR4_4_1krpkrple6ndpxg.R.inc(26937);originalDateTimeZone = null;
        __CLR4_4_1krpkrple6ndpxg.R.inc(26938);originalTimeZone = null;
        __CLR4_4_1krpkrple6ndpxg.R.inc(26939);originalLocale = null;
    }finally{__CLR4_4_1krpkrple6ndpxg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory27() {__CLR4_4_1krpkrple6ndpxg.R.globalSliceStart(getClass().getName(),26940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1dx50ksc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1krpkrple6ndpxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1krpkrple6ndpxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory27",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1dx50ksc(){try{__CLR4_4_1krpkrple6ndpxg.R.inc(26940); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26941);assertEquals(LONDON, IslamicChronology.getInstance().getZone()); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26942);assertSame(IslamicChronology.class, IslamicChronology.getInstance().getClass()); 
 }finally{__CLR4_4_1krpkrple6ndpxg.R.flushNeeded();}}
public void testSampleDateWithZone28() {__CLR4_4_1krpkrple6ndpxg.R.globalSliceStart(getClass().getName(),26943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p0qp93ksf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1krpkrple6ndpxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1krpkrple6ndpxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDateWithZone28",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p0qp93ksf(){try{__CLR4_4_1krpkrple6ndpxg.R.inc(26943); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26944);DateTime dt = new DateTime(2005, 11, 26, 12, 0, 0, 0, PARIS).withChronology(ISLAMIC_UTC); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26945);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26946);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26947);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26948);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26949);assertEquals(11, dt.getHourOfDay()); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26950);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26951);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26952);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1krpkrple6ndpxg.R.flushNeeded();}}
public void testFactoryUTC29() {__CLR4_4_1krpkrple6ndpxg.R.globalSliceStart(getClass().getName(),26953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_190z0reksp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1krpkrple6ndpxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1krpkrple6ndpxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactoryUTC29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_190z0reksp(){try{__CLR4_4_1krpkrple6ndpxg.R.inc(26953); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26954);assertEquals(DateTimeZone.UTC, IslamicChronology.getInstanceUTC().getZone()); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26955);assertSame(IslamicChronology.class, IslamicChronology.getInstanceUTC().getClass()); 
 }finally{__CLR4_4_1krpkrple6ndpxg.R.flushNeeded();}}
public void testWithZone30() {__CLR4_4_1krpkrple6ndpxg.R.globalSliceStart(getClass().getName(),26956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2kbi0kss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1krpkrple6ndpxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1krpkrple6ndpxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithZone30",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2kbi0kss(){try{__CLR4_4_1krpkrple6ndpxg.R.inc(26956); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26957);assertSame(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26958);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26959);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26960);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26961);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1krpkrple6ndpxg.R.inc(26962);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1krpkrple6ndpxg.R.flushNeeded();}}
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

    

    

    

    

}
