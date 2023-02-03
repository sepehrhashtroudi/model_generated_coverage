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
@java.lang.SuppressWarnings({"fallthrough"}) public class TestIslamicChronology extends TestCase {static class __CLR4_4_1rotrotlc8axerc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,36198,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1rotrotlc8axerc.R.inc(35885);
        __CLR4_4_1rotrotlc8axerc.R.inc(35886);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rotrotlc8axerc.R.inc(35887);
        __CLR4_4_1rotrotlc8axerc.R.inc(35888);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1rotrotlc8axerc.R.inc(35889);return new TestSuite(TestIslamicChronology.class);
    }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}}

    public TestIslamicChronology(String name) {
        super(name);__CLR4_4_1rotrotlc8axerc.R.inc(35891);try{__CLR4_4_1rotrotlc8axerc.R.inc(35890);
    }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rotrotlc8axerc.R.inc(35892);
        __CLR4_4_1rotrotlc8axerc.R.inc(35893);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1rotrotlc8axerc.R.inc(35894);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1rotrotlc8axerc.R.inc(35895);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1rotrotlc8axerc.R.inc(35896);originalLocale = Locale.getDefault();
        __CLR4_4_1rotrotlc8axerc.R.inc(35897);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1rotrotlc8axerc.R.inc(35898);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1rotrotlc8axerc.R.inc(35899);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rotrotlc8axerc.R.inc(35900);
        __CLR4_4_1rotrotlc8axerc.R.inc(35901);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1rotrotlc8axerc.R.inc(35902);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1rotrotlc8axerc.R.inc(35903);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1rotrotlc8axerc.R.inc(35904);Locale.setDefault(originalLocale);
        __CLR4_4_1rotrotlc8axerc.R.inc(35905);originalDateTimeZone = null;
        __CLR4_4_1rotrotlc8axerc.R.inc(35906);originalTimeZone = null;
        __CLR4_4_1rotrotlc8axerc.R.inc(35907);originalLocale = null;
    }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSampleDate2156() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),35908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ixitdbrpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate2156",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ixitdbrpg(){try{__CLR4_4_1rotrotlc8axerc.R.inc(35908); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35909);DateTime dt = new DateTime(2005, 11, 26, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35910);dt = dt.withChronology(ISLAMIC_UTC); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35911);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35912);assertEquals(15, dt.getCenturyOfEra()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35913);assertEquals(26, dt.getYearOfCentury()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35914);assertEquals(1426, dt.getYearOfEra()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35915);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35916);Property fld = dt.year(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35917);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35918);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35919);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35920);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35921);fld = dt.monthOfYear(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35922);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35923);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35924);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35925);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35926);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35927);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35928);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35929);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35930);fld = dt.dayOfMonth(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35931);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35932);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35933);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35934);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35935);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35936);assertEquals(29, fld.getMaximumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35937);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35938);assertEquals(DateTimeConstants.SATURDAY, dt.getDayOfWeek()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35939);fld = dt.dayOfWeek(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35940);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35941);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35942);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35943);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35944);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35945);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35946);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35947);assertEquals(5 * 30 + 4 * 29 + 24, dt.getDayOfYear()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35948);fld = dt.dayOfYear(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35949);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35950);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35951);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35952);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35953);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35954);assertEquals(355, fld.getMaximumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35955);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35956);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35957);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35958);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35959);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 


public void testSampleDateWithZone351() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),35960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ozds7urqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDateWithZone351",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ozds7urqw(){try{__CLR4_4_1rotrotlc8axerc.R.inc(35960); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35961);DateTime dt = new DateTime(2005, 11, 26, 12, 0, 0, 0, PARIS).withChronology(ISLAMIC_UTC); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35962);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35963);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35964);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35965);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35966);assertEquals(11, dt.getHourOfDay()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35967);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35968);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35969);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 


public void testCalendar364() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),35970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n4ec8rr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testCalendar364",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n4ec8rr6(){try{__CLR4_4_1rotrotlc8axerc.R.inc(35970); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35971);if ((((TestAll.FAST)&&(__CLR4_4_1rotrotlc8axerc.R.iget(35972)!=0|true))||(__CLR4_4_1rotrotlc8axerc.R.iget(35973)==0&false))) {{ 
         __CLR4_4_1rotrotlc8axerc.R.inc(35974);return; 
     } 
     }__CLR4_4_1rotrotlc8axerc.R.inc(35975);System.out.println("\nTestIslamicChronology.testCalendar"); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35976);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35977);long millis = epoch.getMillis(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35978);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35979);DateTimeField dayOfWeek = ISLAMIC_UTC.dayOfWeek(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35980);DateTimeField dayOfYear = ISLAMIC_UTC.dayOfYear(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35981);DateTimeField dayOfMonth = ISLAMIC_UTC.dayOfMonth(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35982);DateTimeField monthOfYear = ISLAMIC_UTC.monthOfYear(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35983);DateTimeField year = ISLAMIC_UTC.year(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35984);DateTimeField yearOfEra = ISLAMIC_UTC.yearOfEra(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35985);DateTimeField era = ISLAMIC_UTC.era(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35986);int expectedDOW = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(35987);int expectedDOY = 1; 
     __CLR4_4_1rotrotlc8axerc.R.inc(35988);int expectedDay = 1; 
     __CLR4_4_1rotrotlc8axerc.R.inc(35989);int expectedMonth = 1; 
     __CLR4_4_1rotrotlc8axerc.R.inc(35990);int expectedYear = 1; 
     __CLR4_4_1rotrotlc8axerc.R.inc(35991);while ((((millis < end)&&(__CLR4_4_1rotrotlc8axerc.R.iget(35992)!=0|true))||(__CLR4_4_1rotrotlc8axerc.R.iget(35993)==0&false))) {{ 
         __CLR4_4_1rotrotlc8axerc.R.inc(35994);int dowValue = dayOfWeek.get(millis); 
         __CLR4_4_1rotrotlc8axerc.R.inc(35995);int doyValue = dayOfYear.get(millis); 
         __CLR4_4_1rotrotlc8axerc.R.inc(35996);int dayValue = dayOfMonth.get(millis); 
         __CLR4_4_1rotrotlc8axerc.R.inc(35997);int monthValue = monthOfYear.get(millis); 
         __CLR4_4_1rotrotlc8axerc.R.inc(35998);int yearValue = year.get(millis); 
         __CLR4_4_1rotrotlc8axerc.R.inc(35999);int yearOfEraValue = yearOfEra.get(millis); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36000);int dayOfYearLen = dayOfYear.getMaximumValue(millis); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36001);int monthLen = dayOfMonth.getMaximumValue(millis); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36002);if ((((monthValue < 1 || monthValue > 12)&&(__CLR4_4_1rotrotlc8axerc.R.iget(36003)!=0|true))||(__CLR4_4_1rotrotlc8axerc.R.iget(36004)==0&false))) {{ 
             __CLR4_4_1rotrotlc8axerc.R.inc(36005);fail("Bad month: " + millis); 
         } 
         }__CLR4_4_1rotrotlc8axerc.R.inc(36006);assertEquals(1, era.get(millis)); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36007);assertEquals("AH", era.getAsText(millis)); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36008);assertEquals("AH", era.getAsShortText(millis)); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36009);assertEquals(expectedDOY, doyValue); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36010);assertEquals(expectedMonth, monthValue); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36011);assertEquals(expectedDay, dayValue); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36012);assertEquals(expectedDOW, dowValue); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36013);assertEquals(expectedYear, yearValue); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36014);assertEquals(expectedYear, yearOfEraValue); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36015);boolean leap = ((11 * yearValue + 14) % 30) < 11; 
         __CLR4_4_1rotrotlc8axerc.R.inc(36016);assertEquals(leap, year.isLeap(millis)); 
         boolean __CLB4_4_1_bool0=false;__CLR4_4_1rotrotlc8axerc.R.inc(36017);switch(monthValue) { 
             case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1rotrotlc8axerc.R.inc(36018);__CLB4_4_1_bool0=true;} 
             case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_1rotrotlc8axerc.R.inc(36019);__CLB4_4_1_bool0=true;} 
             case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_1rotrotlc8axerc.R.inc(36020);__CLB4_4_1_bool0=true;} 
             case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_1rotrotlc8axerc.R.inc(36021);__CLB4_4_1_bool0=true;} 
             case 9:if (!__CLB4_4_1_bool0) {__CLR4_4_1rotrotlc8axerc.R.inc(36022);__CLB4_4_1_bool0=true;} 
             case 11:if (!__CLB4_4_1_bool0) {__CLR4_4_1rotrotlc8axerc.R.inc(36023);__CLB4_4_1_bool0=true;} 
                 __CLR4_4_1rotrotlc8axerc.R.inc(36024);assertEquals(30, monthLen); 
                 __CLR4_4_1rotrotlc8axerc.R.inc(36025);break; 
             case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_1rotrotlc8axerc.R.inc(36026);__CLB4_4_1_bool0=true;} 
             case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_1rotrotlc8axerc.R.inc(36027);__CLB4_4_1_bool0=true;} 
             case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_1rotrotlc8axerc.R.inc(36028);__CLB4_4_1_bool0=true;} 
             case 8:if (!__CLB4_4_1_bool0) {__CLR4_4_1rotrotlc8axerc.R.inc(36029);__CLB4_4_1_bool0=true;} 
             case 10:if (!__CLB4_4_1_bool0) {__CLR4_4_1rotrotlc8axerc.R.inc(36030);__CLB4_4_1_bool0=true;} 
                 __CLR4_4_1rotrotlc8axerc.R.inc(36031);assertEquals(29, monthLen); 
                 __CLR4_4_1rotrotlc8axerc.R.inc(36032);break; 
             case 12:if (!__CLB4_4_1_bool0) {__CLR4_4_1rotrotlc8axerc.R.inc(36033);__CLB4_4_1_bool0=true;} 
                 __CLR4_4_1rotrotlc8axerc.R.inc(36034);assertEquals(((((leap )&&(__CLR4_4_1rotrotlc8axerc.R.iget(36035)!=0|true))||(__CLR4_4_1rotrotlc8axerc.R.iget(36036)==0&false))? 30 : 29), monthLen); 
                 __CLR4_4_1rotrotlc8axerc.R.inc(36037);break; 
         } 
         __CLR4_4_1rotrotlc8axerc.R.inc(36038);assertEquals(((((leap )&&(__CLR4_4_1rotrotlc8axerc.R.iget(36039)!=0|true))||(__CLR4_4_1rotrotlc8axerc.R.iget(36040)==0&false))? 355 : 354), dayOfYearLen); 
         __CLR4_4_1rotrotlc8axerc.R.inc(36041);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1; 
         __CLR4_4_1rotrotlc8axerc.R.inc(36042);expectedDay++; 
         __CLR4_4_1rotrotlc8axerc.R.inc(36043);expectedDOY++; 
         __CLR4_4_1rotrotlc8axerc.R.inc(36044);if ((((expectedDay > monthLen)&&(__CLR4_4_1rotrotlc8axerc.R.iget(36045)!=0|true))||(__CLR4_4_1rotrotlc8axerc.R.iget(36046)==0&false))) {{ 
             __CLR4_4_1rotrotlc8axerc.R.inc(36047);expectedDay = 1; 
             __CLR4_4_1rotrotlc8axerc.R.inc(36048);expectedMonth++; 
             __CLR4_4_1rotrotlc8axerc.R.inc(36049);if ((((expectedMonth == 13)&&(__CLR4_4_1rotrotlc8axerc.R.iget(36050)!=0|true))||(__CLR4_4_1rotrotlc8axerc.R.iget(36051)==0&false))) {{ 
                 __CLR4_4_1rotrotlc8axerc.R.inc(36052);expectedMonth = 1; 
                 __CLR4_4_1rotrotlc8axerc.R.inc(36053);expectedDOY = 1; 
                 __CLR4_4_1rotrotlc8axerc.R.inc(36054);expectedYear++; 
             } 
         }} 
         }__CLR4_4_1rotrotlc8axerc.R.inc(36055);millis += SKIP; 
     } 
 }}finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 


public void testSampleDate1429() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),36056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgvrizrtk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate1429",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgvrizrtk(){try{__CLR4_4_1rotrotlc8axerc.R.inc(36056); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36057);DateTime dt = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36058);dt = dt.withChronology(ISLAMIC_UTC); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36059);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36060);assertEquals(14, dt.getCenturyOfEra()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36061);assertEquals(64, dt.getYearOfCentury()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36062);assertEquals(1364, dt.getYearOfEra()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36063);assertEquals(1364, dt.getYear()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36064);Property fld = dt.year(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36065);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36066);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36067);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36068);assertEquals(new DateTime(1365, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36069);assertEquals(12, dt.getMonthOfYear()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36070);fld = dt.monthOfYear(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36071);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36072);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36073);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36074);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36075);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36076);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36077);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36078);assertEquals(new DateTime(1365, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36079);assertEquals(new DateTime(1364, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addWrapFieldToCopy(1)); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36080);assertEquals(6, dt.getDayOfMonth()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36081);fld = dt.dayOfMonth(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36082);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36083);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36084);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36085);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36086);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36087);assertEquals(29, fld.getMaximumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36088);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36089);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36090);assertEquals(DateTimeConstants.MONDAY, dt.getDayOfWeek()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36091);fld = dt.dayOfWeek(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36092);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36093);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36094);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36095);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36096);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36097);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36098);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36099);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36100);assertEquals(6 * 30 + 5 * 29 + 6, dt.getDayOfYear()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36101);fld = dt.dayOfYear(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36102);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36103);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36104);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36105);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36106);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36107);assertEquals(354, fld.getMaximumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36108);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36109);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36110);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36111);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36112);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36113);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 


public void testFactory509() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),36114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1dgnnrv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory509",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1dgnnrv6(){try{__CLR4_4_1rotrotlc8axerc.R.inc(36114); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36115);assertEquals(LONDON, IslamicChronology.getInstance().getZone()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36116);assertSame(IslamicChronology.class, IslamicChronology.getInstance().getClass()); 
 }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 


public void testEpoch511() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),36117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ax7z8lrv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testEpoch511",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ax7z8lrv9(){try{__CLR4_4_1rotrotlc8axerc.R.inc(36117); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36118);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36119);DateTime expectedEpoch = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36120);assertEquals(expectedEpoch.getMillis(), epoch.getMillis()); 
 }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 


public void testFieldConstructor782() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),36121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15i4r46rvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFieldConstructor782",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15i4r46rvd(){try{__CLR4_4_1rotrotlc8axerc.R.inc(36121); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36122);DateTime date = new DateTime(1364, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36123);DateTime expectedDate = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36124);assertEquals(expectedDate.getMillis(), date.getMillis()); 
 }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 


public void testToString812() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),36125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1674alarvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testToString812",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1674alarvh(){try{__CLR4_4_1rotrotlc8axerc.R.inc(36125); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36126);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36127);assertEquals("IslamicChronology[Asia/Tokyo]", IslamicChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36128);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance().toString()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36129);assertEquals("IslamicChronology[UTC]", IslamicChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 


public void testWithZone1143() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),36130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4z9airvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithZone1143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4z9airvm(){try{__CLR4_4_1rotrotlc8axerc.R.inc(36130); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36131);assertSame(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36132);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36133);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36134);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36135);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36136);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 


public void testSampleDate31150() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),36137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14up6tnrvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate31150",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14up6tnrvt(){try{__CLR4_4_1rotrotlc8axerc.R.inc(36137); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36138);DateTime dt = new DateTime(1426, 12, 24, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36139);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36140);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36141);Property fld = dt.year(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36142);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36143);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36144);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36145);assertEquals(12, dt.getMonthOfYear()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36146);fld = dt.monthOfYear(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36147);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36148);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36149);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36150);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36151);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36152);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36153);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36154);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36155);fld = dt.dayOfMonth(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36156);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36157);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36158);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36159);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36160);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36161);assertEquals(30, fld.getMaximumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36162);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36163);assertEquals(DateTimeConstants.TUESDAY, dt.getDayOfWeek()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36164);fld = dt.dayOfWeek(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36165);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36166);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36167);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36168);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36169);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36170);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36171);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36172);assertEquals(6 * 30 + 5 * 29 + 24, dt.getDayOfYear()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36173);fld = dt.dayOfYear(); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36174);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36175);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36176);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36177);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36178);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36179);assertEquals(355, fld.getMaximumValue()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36180);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36181);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36182);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36183);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36184);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 


public void testFactoryUTC1585() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),36185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17jyib8rx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactoryUTC1585",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17jyib8rx5(){try{__CLR4_4_1rotrotlc8axerc.R.inc(36185); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36186);assertEquals(DateTimeZone.UTC, IslamicChronology.getInstanceUTC().getZone()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36187);assertSame(IslamicChronology.class, IslamicChronology.getInstanceUTC().getClass()); 
 }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 


public void testFactory_Zone1638() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),36188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uoswscrx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory_Zone1638",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uoswscrx8(){try{__CLR4_4_1rotrotlc8axerc.R.inc(36188); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36189);assertEquals(TOKYO, IslamicChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36190);assertEquals(PARIS, IslamicChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36191);assertEquals(LONDON, IslamicChronology.getInstance(null).getZone()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36192);assertSame(IslamicChronology.class, IslamicChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 


public void testWithUTC1705() {__CLR4_4_1rotrotlc8axerc.R.globalSliceStart(getClass().getName(),36193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7h1y6rxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rotrotlc8axerc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rotrotlc8axerc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithUTC1705",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7h1y6rxd(){try{__CLR4_4_1rotrotlc8axerc.R.inc(36193); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36194);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36195);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36196);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1rotrotlc8axerc.R.inc(36197);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance().withUTC()); 
 }finally{__CLR4_4_1rotrotlc8axerc.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

    

    

    

    

}
