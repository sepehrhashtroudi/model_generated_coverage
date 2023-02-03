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
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for CopticChronology.
 *
 * @author Stephen Colebourne
 */
public class TestCopticChronology extends TestCase {static class __CLR4_4_1r0qr0qlc8axeot{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,35266,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35018);
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35019);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35020);
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35021);SKIP = 1 * MILLIS_PER_DAY;
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35022);return new TestSuite(TestCopticChronology.class);
    }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}}

    public TestCopticChronology(String name) {
        super(name);__CLR4_4_1r0qr0qlc8axeot.R.inc(35024);try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35023);
    }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35025);
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35026);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35027);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35028);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35029);originalLocale = Locale.getDefault();
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35030);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35031);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35032);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35033);
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35034);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35035);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35036);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35037);Locale.setDefault(originalLocale);
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35038);originalDateTimeZone = null;
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35039);originalTimeZone = null;
        __CLR4_4_1r0qr0qlc8axeot.R.inc(35040);originalLocale = null;
    }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testDurationMonth198() {__CLR4_4_1r0qr0qlc8axeot.R.globalSliceStart(getClass().getName(),35041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h7zvctr1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r0qr0qlc8axeot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r0qr0qlc8axeot.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationMonth198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h7zvctr1d(){try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35041); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35042);DateTime dt11 = new DateTime(1723, 11, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35043);DateTime dt12 = new DateTime(1723, 12, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35044);DateTime dt13 = new DateTime(1723, 13, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35045);DateTime dt01 = new DateTime(1724, 1, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35046);DurationField fld = dt11.monthOfYear().getDurationField(); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35047);assertEquals(COPTIC_UTC.months(), fld); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35048);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35049);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35050);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35051);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35052);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35053);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35054);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35055);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35056);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35057);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35058);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35059);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35060);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35061);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35062);assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35063);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35064);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35065);assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35066);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35067);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35068);assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35069);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35070);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35071);assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35072);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35073);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35074);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35075);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35076);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35077);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35078);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35079);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L)); 
 }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}} 


public void testSampleDate236() {__CLR4_4_1r0qr0qlc8axeot.R.globalSliceStart(getClass().getName(),35080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xo1m9ar2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r0qr0qlc8axeot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r0qr0qlc8axeot.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testSampleDate236",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xo1m9ar2g(){try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35080); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35081);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISO_UTC).withChronology(COPTIC_UTC); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35082);assertEquals(CopticChronology.AM, dt.getEra()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35083);assertEquals(18, dt.getCenturyOfEra()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35084);assertEquals(20, dt.getYearOfCentury()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35085);assertEquals(1720, dt.getYearOfEra()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35086);assertEquals(1720, dt.getYear()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35087);Property fld = dt.year(); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35088);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35089);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35090);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35091);assertEquals(new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35092);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35093);fld = dt.monthOfYear(); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35094);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35095);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35096);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35097);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35098);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35099);assertEquals(13, fld.getMaximumValue()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35100);assertEquals(13, fld.getMaximumValueOverall()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35101);assertEquals(new DateTime(1721, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(4)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35102);assertEquals(new DateTime(1720, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addWrapFieldToCopy(4)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35103);assertEquals(2, dt.getDayOfMonth()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35104);fld = dt.dayOfMonth(); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35105);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35106);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35107);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35108);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35109);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35110);assertEquals(30, fld.getMaximumValue()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35111);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35112);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35113);assertEquals(DateTimeConstants.WEDNESDAY, dt.getDayOfWeek()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35114);fld = dt.dayOfWeek(); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35115);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35116);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35117);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35118);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35119);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35120);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35121);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35122);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35123);assertEquals(9 * 30 + 2, dt.getDayOfYear()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35124);fld = dt.dayOfYear(); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35125);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35126);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35127);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35128);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35129);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35130);assertEquals(365, fld.getMaximumValue()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35131);assertEquals(366, fld.getMaximumValueOverall()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35132);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35133);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35134);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35135);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35136);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}} 


public void testWithZone409() {__CLR4_4_1r0qr0qlc8axeot.R.globalSliceStart(getClass().getName(),35137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ri7yjkr41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r0qr0qlc8axeot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r0qr0qlc8axeot.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testWithZone409",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ri7yjkr41(){try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35137); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35138);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35139);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35140);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35141);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35142);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35143);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}} 


public void testEquality465() {__CLR4_4_1r0qr0qlc8axeot.R.globalSliceStart(getClass().getName(),35144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ng2pf2r48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r0qr0qlc8axeot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r0qr0qlc8axeot.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEquality465",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ng2pf2r48(){try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35144); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35145);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35146);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(LONDON)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35147);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(PARIS)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35148);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstanceUTC()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35149);assertSame(CopticChronology.getInstance(), CopticChronology.getInstance(LONDON)); 
 }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}} 


public void testDurationYear689() {__CLR4_4_1r0qr0qlc8axeot.R.globalSliceStart(getClass().getName(),35150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i3vdvpr4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r0qr0qlc8axeot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r0qr0qlc8axeot.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationYear689",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i3vdvpr4e(){try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35150); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35151);DateTime dt20 = new DateTime(1720, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35152);DateTime dt21 = new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35153);DateTime dt22 = new DateTime(1722, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35154);DateTime dt23 = new DateTime(1723, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35155);DateTime dt24 = new DateTime(1724, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35156);DurationField fld = dt20.year().getDurationField(); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35157);assertEquals(COPTIC_UTC.years(), fld); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35158);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35159);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35160);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35161);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35162);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35163);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35164);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1L, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35165);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2L, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35166);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3L, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35167);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4L, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35168);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1L)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35169);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2L)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35170);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getUnitMillis()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35171);assertEquals(0, fld.getValue(1L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35172);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35173);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35174);assertEquals(1, fld.getValue(2L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35175);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35176);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35177);assertEquals(2, fld.getValue(3L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35178);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35179);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35180);assertEquals(3, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35181);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35182);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35183);assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35184);assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35185);assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35186);assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35187);assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1L)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35188);assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2L)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35189);assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3L)); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35190);assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4L)); 
 }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}} 


public void testEra736() {__CLR4_4_1r0qr0qlc8axeot.R.globalSliceStart(getClass().getName(),35191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11i4681r5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r0qr0qlc8axeot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r0qr0qlc8axeot.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEra736",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11i4681r5j(){try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35191); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35192);assertEquals(1, CopticChronology.AM); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35193);try { 
         __CLR4_4_1r0qr0qlc8axeot.R.inc(35194);new DateTime(-1, 13, 5, 0, 0, 0, 0, COPTIC_UTC); 
         __CLR4_4_1r0qr0qlc8axeot.R.inc(35195);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}} 


public void testDurationFields837() {__CLR4_4_1r0qr0qlc8axeot.R.globalSliceStart(getClass().getName(),35196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8i6v8r5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r0qr0qlc8axeot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r0qr0qlc8axeot.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationFields837",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8i6v8r5o(){try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35196); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35197);final CopticChronology coptic = CopticChronology.getInstance(); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35198);assertEquals("eras", coptic.eras().getName()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35199);assertEquals("centuries", coptic.centuries().getName()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35200);assertEquals("years", coptic.years().getName()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35201);assertEquals("weekyears", coptic.weekyears().getName()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35202);assertEquals("months", coptic.months().getName()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35203);assertEquals("weeks", coptic.weeks().getName()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35204);assertEquals("days", coptic.days().getName()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35205);assertEquals("halfdays", coptic.halfdays().getName()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35206);assertEquals("hours", coptic.hours().getName()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35207);assertEquals("minutes", coptic.minutes().getName()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35208);assertEquals("seconds", coptic.seconds().getName()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35209);assertEquals("millis", coptic.millis().getName()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35210);assertEquals(false, coptic.eras().isSupported()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35211);assertEquals(true, coptic.centuries().isSupported()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35212);assertEquals(true, coptic.years().isSupported()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35213);assertEquals(true, coptic.weekyears().isSupported()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35214);assertEquals(true, coptic.months().isSupported()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35215);assertEquals(true, coptic.weeks().isSupported()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35216);assertEquals(true, coptic.days().isSupported()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35217);assertEquals(true, coptic.halfdays().isSupported()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35218);assertEquals(true, coptic.hours().isSupported()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35219);assertEquals(true, coptic.minutes().isSupported()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35220);assertEquals(true, coptic.seconds().isSupported()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35221);assertEquals(true, coptic.millis().isSupported()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35222);assertEquals(false, coptic.centuries().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35223);assertEquals(false, coptic.years().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35224);assertEquals(false, coptic.weekyears().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35225);assertEquals(false, coptic.months().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35226);assertEquals(false, coptic.weeks().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35227);assertEquals(false, coptic.days().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35228);assertEquals(false, coptic.halfdays().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35229);assertEquals(true, coptic.hours().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35230);assertEquals(true, coptic.minutes().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35231);assertEquals(true, coptic.seconds().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35232);assertEquals(true, coptic.millis().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35233);final CopticChronology copticUTC = CopticChronology.getInstanceUTC(); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35234);assertEquals(false, copticUTC.centuries().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35235);assertEquals(false, copticUTC.years().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35236);assertEquals(false, copticUTC.weekyears().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35237);assertEquals(false, copticUTC.months().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35238);assertEquals(true, copticUTC.weeks().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35239);assertEquals(true, copticUTC.days().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35240);assertEquals(true, copticUTC.halfdays().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35241);assertEquals(true, copticUTC.hours().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35242);assertEquals(true, copticUTC.minutes().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35243);assertEquals(true, copticUTC.seconds().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35244);assertEquals(true, copticUTC.millis().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35245);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35246);final CopticChronology copticGMT = CopticChronology.getInstance(gmt); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35247);assertEquals(false, copticGMT.centuries().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35248);assertEquals(false, copticGMT.years().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35249);assertEquals(false, copticGMT.weekyears().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35250);assertEquals(false, copticGMT.months().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35251);assertEquals(true, copticGMT.weeks().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35252);assertEquals(true, copticGMT.days().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35253);assertEquals(true, copticGMT.halfdays().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35254);assertEquals(true, copticGMT.hours().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35255);assertEquals(true, copticGMT.minutes().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35256);assertEquals(true, copticGMT.seconds().isPrecise()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35257);assertEquals(true, copticGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}} 


public void testFactory_Zone1721() {__CLR4_4_1r0qr0qlc8axeot.R.globalSliceStart(getClass().getName(),35258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e9e7r5r7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r0qr0qlc8axeot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r0qr0qlc8axeot.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactory_Zone1721",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e9e7r5r7e(){try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35258); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35259);assertEquals(TOKYO, CopticChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35260);assertEquals(PARIS, CopticChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35261);assertEquals(LONDON, CopticChronology.getInstance(null).getZone()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35262);assertSame(CopticChronology.class, CopticChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}} 


public void testFactoryUTC1733() {__CLR4_4_1r0qr0qlc8axeot.R.globalSliceStart(getClass().getName(),35263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qt7rbr7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r0qr0qlc8axeot.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r0qr0qlc8axeot.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactoryUTC1733",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qt7rbr7j(){try{__CLR4_4_1r0qr0qlc8axeot.R.inc(35263); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35264);assertEquals(DateTimeZone.UTC, CopticChronology.getInstanceUTC().getZone()); 
     __CLR4_4_1r0qr0qlc8axeot.R.inc(35265);assertSame(CopticChronology.class, CopticChronology.getInstanceUTC().getClass()); 
 }finally{__CLR4_4_1r0qr0qlc8axeot.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

}
