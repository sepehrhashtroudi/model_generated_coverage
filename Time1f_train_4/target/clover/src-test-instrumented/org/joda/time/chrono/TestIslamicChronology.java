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
public class TestIslamicChronology extends TestCase {static class __CLR4_4_1q9oq9ole6rjddf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,34261,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34044);
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34045);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34046);
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34047);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34048);return new TestSuite(TestIslamicChronology.class);
    }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}}

    public TestIslamicChronology(String name) {
        super(name);__CLR4_4_1q9oq9ole6rjddf.R.inc(34050);try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34049);
    }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34051);
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34052);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34053);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34054);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34055);originalLocale = Locale.getDefault();
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34056);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34057);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34058);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34059);
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34060);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34061);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34062);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34063);Locale.setDefault(originalLocale);
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34064);originalDateTimeZone = null;
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34065);originalTimeZone = null;
        __CLR4_4_1q9oq9ole6rjddf.R.inc(34066);originalLocale = null;
    }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactoryUTC105() {__CLR4_4_1q9oq9ole6rjddf.R.globalSliceStart(getClass().getName(),34067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zdpf3qab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6rjddf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6rjddf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactoryUTC105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zdpf3qab(){try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34067); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34068);assertEquals(DateTimeZone.UTC, IslamicChronology.getInstanceUTC().getZone()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34069);assertSame(IslamicChronology.class, IslamicChronology.getInstanceUTC().getClass()); 
 }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}} 


public void testFactory106() {__CLR4_4_1q9oq9ole6rjddf.R.globalSliceStart(getClass().getName(),34070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8ylkqqae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6rjddf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6rjddf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8ylkqqae(){try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34070); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34071);assertEquals(LONDON, IslamicChronology.getInstance().getZone()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34072);assertSame(IslamicChronology.class, IslamicChronology.getInstance().getClass()); 
 }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}} 


public void testWithUTC107() {__CLR4_4_1q9oq9ole6rjddf.R.globalSliceStart(getClass().getName(),34073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152x619qah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6rjddf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6rjddf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithUTC107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152x619qah(){try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34073); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34074);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34075);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34076);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34077);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance().withUTC()); 
 }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}} 


public void testFactory_Zone108() {__CLR4_4_1q9oq9ole6rjddf.R.globalSliceStart(getClass().getName(),34078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198zb3nqam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6rjddf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6rjddf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory_Zone108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198zb3nqam(){try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34078); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34079);assertEquals(TOKYO, IslamicChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34080);assertEquals(PARIS, IslamicChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34081);assertEquals(LONDON, IslamicChronology.getInstance(null).getZone()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34082);assertSame(IslamicChronology.class, IslamicChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}} 


public void testToString109() {__CLR4_4_1q9oq9ole6rjddf.R.globalSliceStart(getClass().getName(),34083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rzeg3qar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6rjddf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6rjddf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testToString109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rzeg3qar(){try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34083); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34084);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34085);assertEquals("IslamicChronology[Asia/Tokyo]", IslamicChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34086);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance().toString()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34087);assertEquals("IslamicChronology[UTC]", IslamicChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}} 


public void testWithZone110() {__CLR4_4_1q9oq9ole6rjddf.R.globalSliceStart(getClass().getName(),34088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ydn8k3qaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6rjddf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6rjddf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithZone110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ydn8k3qaw(){try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34088); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34089);assertSame(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34090);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34091);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34092);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34093);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34094);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}} 


public void testSampleDate1111() {__CLR4_4_1q9oq9ole6rjddf.R.globalSliceStart(getClass().getName(),34095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1guesr3qb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6rjddf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6rjddf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate1111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1guesr3qb3(){try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34095); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34096);DateTime dt = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34097);dt = dt.withChronology(ISLAMIC_UTC); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34098);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34099);assertEquals(14, dt.getCenturyOfEra()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34100);assertEquals(64, dt.getYearOfCentury()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34101);assertEquals(1364, dt.getYearOfEra()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34102);assertEquals(1364, dt.getYear()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34103);Property fld = dt.year(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34104);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34105);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34106);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34107);assertEquals(new DateTime(1365, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34108);assertEquals(12, dt.getMonthOfYear()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34109);fld = dt.monthOfYear(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34110);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34111);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34112);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34113);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34114);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34115);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34116);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34117);assertEquals(new DateTime(1365, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34118);assertEquals(new DateTime(1364, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addWrapFieldToCopy(1)); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34119);assertEquals(6, dt.getDayOfMonth()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34120);fld = dt.dayOfMonth(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34121);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34122);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34123);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34124);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34125);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34126);assertEquals(29, fld.getMaximumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34127);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34128);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34129);assertEquals(DateTimeConstants.MONDAY, dt.getDayOfWeek()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34130);fld = dt.dayOfWeek(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34131);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34132);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34133);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34134);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34135);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34136);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34137);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34138);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34139);assertEquals(6 * 30 + 5 * 29 + 6, dt.getDayOfYear()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34140);fld = dt.dayOfYear(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34141);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34142);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34143);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34144);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34145);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34146);assertEquals(354, fld.getMaximumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34147);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34148);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34149);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34150);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34151);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34152);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}} 


public void testFieldConstructor112() {__CLR4_4_1q9oq9ole6rjddf.R.globalSliceStart(getClass().getName(),34153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ndkqfbqcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6rjddf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6rjddf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFieldConstructor112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ndkqfbqcp(){try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34153); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34154);DateTime date = new DateTime(1364, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34155);DateTime expectedDate = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34156);assertEquals(expectedDate.getMillis(), date.getMillis()); 
 }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}} 


public void testEpoch113() {__CLR4_4_1q9oq9ole6rjddf.R.globalSliceStart(getClass().getName(),34157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pymo9vqct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6rjddf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6rjddf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testEpoch113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pymo9vqct(){try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34157); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34158);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34159);DateTime expectedEpoch = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34160);assertEquals(expectedEpoch.getMillis(), epoch.getMillis()); 
 }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}} 


public void testSampleDate2114() {__CLR4_4_1q9oq9ole6rjddf.R.globalSliceStart(getClass().getName(),34161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_128q965qcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6rjddf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6rjddf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate2114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_128q965qcx(){try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34161); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34162);DateTime dt = new DateTime(2005, 11, 26, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34163);dt = dt.withChronology(ISLAMIC_UTC); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34164);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34165);assertEquals(15, dt.getCenturyOfEra()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34166);assertEquals(26, dt.getYearOfCentury()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34167);assertEquals(1426, dt.getYearOfEra()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34168);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34169);Property fld = dt.year(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34170);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34171);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34172);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34173);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34174);fld = dt.monthOfYear(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34175);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34176);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34177);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34178);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34179);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34180);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34181);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34182);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34183);fld = dt.dayOfMonth(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34184);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34185);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34186);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34187);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34188);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34189);assertEquals(29, fld.getMaximumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34190);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34191);assertEquals(DateTimeConstants.SATURDAY, dt.getDayOfWeek()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34192);fld = dt.dayOfWeek(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34193);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34194);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34195);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34196);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34197);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34198);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34199);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34200);assertEquals(5 * 30 + 4 * 29 + 24, dt.getDayOfYear()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34201);fld = dt.dayOfYear(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34202);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34203);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34204);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34205);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34206);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34207);assertEquals(355, fld.getMaximumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34208);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34209);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34210);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34211);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34212);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}} 


public void testSampleDate3452() {__CLR4_4_1q9oq9ole6rjddf.R.globalSliceStart(getClass().getName(),34213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhe3wxqed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6rjddf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6rjddf.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate3452",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhe3wxqed(){try{__CLR4_4_1q9oq9ole6rjddf.R.inc(34213); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34214);DateTime dt = new DateTime(1426, 12, 24, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34215);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34216);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34217);Property fld = dt.year(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34218);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34219);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34220);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34221);assertEquals(12, dt.getMonthOfYear()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34222);fld = dt.monthOfYear(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34223);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34224);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34225);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34226);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34227);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34228);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34229);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34230);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34231);fld = dt.dayOfMonth(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34232);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34233);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34234);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34235);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34236);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34237);assertEquals(30, fld.getMaximumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34238);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34239);assertEquals(DateTimeConstants.TUESDAY, dt.getDayOfWeek()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34240);fld = dt.dayOfWeek(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34241);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34242);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34243);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34244);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34245);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34246);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34247);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34248);assertEquals(6 * 30 + 5 * 29 + 24, dt.getDayOfYear()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34249);fld = dt.dayOfYear(); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34250);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34251);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34252);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34253);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34254);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34255);assertEquals(355, fld.getMaximumValue()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34256);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34257);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34258);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34259);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q9oq9ole6rjddf.R.inc(34260);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q9oq9ole6rjddf.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

    

    

    

    

}
