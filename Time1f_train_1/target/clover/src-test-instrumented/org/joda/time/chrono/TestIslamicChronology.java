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
@java.lang.SuppressWarnings({"fallthrough"}) public class TestIslamicChronology extends TestCase {static class __CLR4_4_1q6hq6hle6qeaf1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,34225,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(33929);
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33930);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(33931);
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33932);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33933);return new TestSuite(TestIslamicChronology.class);
    }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}}

    public TestIslamicChronology(String name) {
        super(name);__CLR4_4_1q6hq6hle6qeaf1.R.inc(33935);try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(33934);
    }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(33936);
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33937);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33938);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33939);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33940);originalLocale = Locale.getDefault();
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33941);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33942);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33943);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(33944);
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33945);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33946);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33947);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33948);Locale.setDefault(originalLocale);
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33949);originalDateTimeZone = null;
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33950);originalTimeZone = null;
        __CLR4_4_1q6hq6hle6qeaf1.R.inc(33951);originalLocale = null;
    }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactoryUTC106() {__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceStart(getClass().getName(),33952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdqmmq74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6hq6hle6qeaf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactoryUTC106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdqmmq74(){try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(33952); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33953);assertEquals(DateTimeZone.UTC, IslamicChronology.getInstanceUTC().getZone()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33954);assertSame(IslamicChronology.class, IslamicChronology.getInstanceUTC().getClass()); 
 }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}} 


public void testFactory107() {__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceStart(getClass().getName(),33955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzyms9q77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6hq6hle6qeaf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzyms9q77(){try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(33955); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33956);assertEquals(LONDON, IslamicChronology.getInstance().getZone()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33957);assertSame(IslamicChronology.class, IslamicChronology.getInstance().getClass()); 
 }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}} 


public void testFactory_Zone108() {__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceStart(getClass().getName(),33958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198zb3nq7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6hq6hle6qeaf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory_Zone108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198zb3nq7a(){try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(33958); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33959);assertEquals(TOKYO, IslamicChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33960);assertEquals(PARIS, IslamicChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33961);assertEquals(LONDON, IslamicChronology.getInstance(null).getZone()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33962);assertSame(IslamicChronology.class, IslamicChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}} 


public void testSampleDateWithZone109() {__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceStart(getClass().getName(),33963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mb3kgrq7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6hq6hle6qeaf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDateWithZone109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mb3kgrq7f(){try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(33963); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33964);DateTime dt = new DateTime(2005, 11, 26, 12, 0, 0, 0, PARIS).withChronology(ISLAMIC_UTC); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33965);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33966);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33967);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33968);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33969);assertEquals(11, dt.getHourOfDay()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33970);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33971);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33972);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}} 


public void testSampleDate1110() {__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceStart(getClass().getName(),33973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k3erjkq7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6hq6hle6qeaf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate1110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k3erjkq7p(){try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(33973); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33974);DateTime dt = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33975);dt = dt.withChronology(ISLAMIC_UTC); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33976);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33977);assertEquals(14, dt.getCenturyOfEra()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33978);assertEquals(64, dt.getYearOfCentury()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33979);assertEquals(1364, dt.getYearOfEra()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33980);assertEquals(1364, dt.getYear()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33981);Property fld = dt.year(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33982);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33983);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33984);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33985);assertEquals(new DateTime(1365, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33986);assertEquals(12, dt.getMonthOfYear()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33987);fld = dt.monthOfYear(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33988);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33989);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33990);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33991);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33992);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33993);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33994);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33995);assertEquals(new DateTime(1365, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33996);assertEquals(new DateTime(1364, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addWrapFieldToCopy(1)); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33997);assertEquals(6, dt.getDayOfMonth()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33998);fld = dt.dayOfMonth(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(33999);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34000);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34001);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34002);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34003);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34004);assertEquals(29, fld.getMaximumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34005);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34006);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34007);assertEquals(DateTimeConstants.MONDAY, dt.getDayOfWeek()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34008);fld = dt.dayOfWeek(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34009);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34010);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34011);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34012);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34013);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34014);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34015);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34016);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34017);assertEquals(6 * 30 + 5 * 29 + 6, dt.getDayOfYear()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34018);fld = dt.dayOfYear(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34019);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34020);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34021);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34022);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34023);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34024);assertEquals(354, fld.getMaximumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34025);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34026);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34027);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34028);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34029);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34030);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}} 


public void testFieldConstructor111() {__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceStart(getClass().getName(),34031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k4krmuq9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6hq6hle6qeaf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFieldConstructor111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k4krmuq9b(){try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(34031); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34032);DateTime date = new DateTime(1364, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34033);DateTime expectedDate = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34034);assertEquals(expectedDate.getMillis(), date.getMillis()); 
 }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}} 


public void testEpoch112() {__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceStart(getClass().getName(),34035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpmpheq9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6hq6hle6qeaf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testEpoch112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpmpheq9f(){try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(34035); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34036);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34037);DateTime expectedEpoch = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34038);assertEquals(expectedEpoch.getMillis(), epoch.getMillis()); 
 }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}} 


public void testCalendar113() {__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceStart(getClass().getName(),34039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5he5yq9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6hq6hle6qeaf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testCalendar113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5he5yq9j(){try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(34039); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34040);if ((((TestAll.FAST)&&(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34041)!=0|true))||(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34042)==0&false))) {{ 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34043);return; 
     } 
     }__CLR4_4_1q6hq6hle6qeaf1.R.inc(34044);System.out.println("\nTestIslamicChronology.testCalendar"); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34045);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34046);long millis = epoch.getMillis(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34047);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34048);DateTimeField dayOfWeek = ISLAMIC_UTC.dayOfWeek(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34049);DateTimeField dayOfYear = ISLAMIC_UTC.dayOfYear(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34050);DateTimeField dayOfMonth = ISLAMIC_UTC.dayOfMonth(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34051);DateTimeField monthOfYear = ISLAMIC_UTC.monthOfYear(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34052);DateTimeField year = ISLAMIC_UTC.year(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34053);DateTimeField yearOfEra = ISLAMIC_UTC.yearOfEra(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34054);DateTimeField era = ISLAMIC_UTC.era(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34055);int expectedDOW = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34056);int expectedDOY = 1; 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34057);int expectedDay = 1; 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34058);int expectedMonth = 1; 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34059);int expectedYear = 1; 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34060);while ((((millis < end)&&(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34061)!=0|true))||(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34062)==0&false))) {{ 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34063);int dowValue = dayOfWeek.get(millis); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34064);int doyValue = dayOfYear.get(millis); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34065);int dayValue = dayOfMonth.get(millis); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34066);int monthValue = monthOfYear.get(millis); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34067);int yearValue = year.get(millis); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34068);int yearOfEraValue = yearOfEra.get(millis); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34069);int dayOfYearLen = dayOfYear.getMaximumValue(millis); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34070);int monthLen = dayOfMonth.getMaximumValue(millis); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34071);if ((((monthValue < 1 || monthValue > 12)&&(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34072)!=0|true))||(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34073)==0&false))) {{ 
             __CLR4_4_1q6hq6hle6qeaf1.R.inc(34074);fail("Bad month: " + millis); 
         } 
         }__CLR4_4_1q6hq6hle6qeaf1.R.inc(34075);assertEquals(1, era.get(millis)); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34076);assertEquals("AH", era.getAsText(millis)); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34077);assertEquals("AH", era.getAsShortText(millis)); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34078);assertEquals(expectedDOY, doyValue); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34079);assertEquals(expectedMonth, monthValue); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34080);assertEquals(expectedDay, dayValue); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34081);assertEquals(expectedDOW, dowValue); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34082);assertEquals(expectedYear, yearValue); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34083);assertEquals(expectedYear, yearOfEraValue); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34084);boolean leap = ((11 * yearValue + 14) % 30) < 11; 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34085);assertEquals(leap, year.isLeap(millis)); 
         boolean __CLB4_4_1_bool0=false;__CLR4_4_1q6hq6hle6qeaf1.R.inc(34086);switch(monthValue) { 
             case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1q6hq6hle6qeaf1.R.inc(34087);__CLB4_4_1_bool0=true;} 
             case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_1q6hq6hle6qeaf1.R.inc(34088);__CLB4_4_1_bool0=true;} 
             case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_1q6hq6hle6qeaf1.R.inc(34089);__CLB4_4_1_bool0=true;} 
             case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_1q6hq6hle6qeaf1.R.inc(34090);__CLB4_4_1_bool0=true;} 
             case 9:if (!__CLB4_4_1_bool0) {__CLR4_4_1q6hq6hle6qeaf1.R.inc(34091);__CLB4_4_1_bool0=true;} 
             case 11:if (!__CLB4_4_1_bool0) {__CLR4_4_1q6hq6hle6qeaf1.R.inc(34092);__CLB4_4_1_bool0=true;} 
                 __CLR4_4_1q6hq6hle6qeaf1.R.inc(34093);assertEquals(30, monthLen); 
                 __CLR4_4_1q6hq6hle6qeaf1.R.inc(34094);break; 
             case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_1q6hq6hle6qeaf1.R.inc(34095);__CLB4_4_1_bool0=true;} 
             case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_1q6hq6hle6qeaf1.R.inc(34096);__CLB4_4_1_bool0=true;} 
             case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_1q6hq6hle6qeaf1.R.inc(34097);__CLB4_4_1_bool0=true;} 
             case 8:if (!__CLB4_4_1_bool0) {__CLR4_4_1q6hq6hle6qeaf1.R.inc(34098);__CLB4_4_1_bool0=true;} 
             case 10:if (!__CLB4_4_1_bool0) {__CLR4_4_1q6hq6hle6qeaf1.R.inc(34099);__CLB4_4_1_bool0=true;} 
                 __CLR4_4_1q6hq6hle6qeaf1.R.inc(34100);assertEquals(29, monthLen); 
                 __CLR4_4_1q6hq6hle6qeaf1.R.inc(34101);break; 
             case 12:if (!__CLB4_4_1_bool0) {__CLR4_4_1q6hq6hle6qeaf1.R.inc(34102);__CLB4_4_1_bool0=true;} 
                 __CLR4_4_1q6hq6hle6qeaf1.R.inc(34103);assertEquals(((((leap )&&(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34104)!=0|true))||(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34105)==0&false))? 30 : 29), monthLen); 
                 __CLR4_4_1q6hq6hle6qeaf1.R.inc(34106);break; 
         } 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34107);assertEquals(((((leap )&&(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34108)!=0|true))||(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34109)==0&false))? 355 : 354), dayOfYearLen); 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34110);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1; 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34111);expectedDay++; 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34112);expectedDOY++; 
         __CLR4_4_1q6hq6hle6qeaf1.R.inc(34113);if ((((expectedDay > monthLen)&&(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34114)!=0|true))||(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34115)==0&false))) {{ 
             __CLR4_4_1q6hq6hle6qeaf1.R.inc(34116);expectedDay = 1; 
             __CLR4_4_1q6hq6hle6qeaf1.R.inc(34117);expectedMonth++; 
             __CLR4_4_1q6hq6hle6qeaf1.R.inc(34118);if ((((expectedMonth == 13)&&(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34119)!=0|true))||(__CLR4_4_1q6hq6hle6qeaf1.R.iget(34120)==0&false))) {{ 
                 __CLR4_4_1q6hq6hle6qeaf1.R.inc(34121);expectedMonth = 1; 
                 __CLR4_4_1q6hq6hle6qeaf1.R.inc(34122);expectedDOY = 1; 
                 __CLR4_4_1q6hq6hle6qeaf1.R.inc(34123);expectedYear++; 
             } 
         }} 
         }__CLR4_4_1q6hq6hle6qeaf1.R.inc(34124);millis += SKIP; 
     } 
 }}finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}} 


public void testSampleDate2114() {__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceStart(getClass().getName(),34125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_128q965qbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6hq6hle6qeaf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate2114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_128q965qbx(){try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(34125); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34126);DateTime dt = new DateTime(2005, 11, 26, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34127);dt = dt.withChronology(ISLAMIC_UTC); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34128);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34129);assertEquals(15, dt.getCenturyOfEra()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34130);assertEquals(26, dt.getYearOfCentury()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34131);assertEquals(1426, dt.getYearOfEra()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34132);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34133);Property fld = dt.year(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34134);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34135);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34136);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34137);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34138);fld = dt.monthOfYear(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34139);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34140);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34141);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34142);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34143);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34144);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34145);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34146);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34147);fld = dt.dayOfMonth(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34148);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34149);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34150);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34151);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34152);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34153);assertEquals(29, fld.getMaximumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34154);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34155);assertEquals(DateTimeConstants.SATURDAY, dt.getDayOfWeek()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34156);fld = dt.dayOfWeek(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34157);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34158);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34159);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34160);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34161);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34162);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34163);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34164);assertEquals(5 * 30 + 4 * 29 + 24, dt.getDayOfYear()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34165);fld = dt.dayOfYear(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34166);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34167);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34168);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34169);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34170);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34171);assertEquals(355, fld.getMaximumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34172);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34173);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34174);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34175);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34176);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}} 


public void testSampleDate3444() {__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceStart(getClass().getName(),34177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ebuz3mqdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6hq6hle6qeaf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6hq6hle6qeaf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate3444",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ebuz3mqdd(){try{__CLR4_4_1q6hq6hle6qeaf1.R.inc(34177); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34178);DateTime dt = new DateTime(1426, 12, 24, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34179);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34180);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34181);Property fld = dt.year(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34182);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34183);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34184);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34185);assertEquals(12, dt.getMonthOfYear()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34186);fld = dt.monthOfYear(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34187);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34188);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34189);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34190);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34191);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34192);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34193);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34194);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34195);fld = dt.dayOfMonth(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34196);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34197);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34198);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34199);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34200);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34201);assertEquals(30, fld.getMaximumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34202);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34203);assertEquals(DateTimeConstants.TUESDAY, dt.getDayOfWeek()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34204);fld = dt.dayOfWeek(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34205);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34206);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34207);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34208);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34209);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34210);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34211);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34212);assertEquals(6 * 30 + 5 * 29 + 24, dt.getDayOfYear()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34213);fld = dt.dayOfYear(); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34214);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34215);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34216);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34217);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34218);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34219);assertEquals(355, fld.getMaximumValue()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34220);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34221);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34222);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34223);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q6hq6hle6qeaf1.R.inc(34224);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q6hq6hle6qeaf1.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

    

    

    

    

}
