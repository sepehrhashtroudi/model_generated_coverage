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
@java.lang.SuppressWarnings({"fallthrough"}) public class TestIslamicChronology extends TestCase {static class __CLR4_4_1q1wq1wle6rcmkq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,34068,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33764);
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33765);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33766);
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33767);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33768);return new TestSuite(TestIslamicChronology.class);
    }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}}

    public TestIslamicChronology(String name) {
        super(name);__CLR4_4_1q1wq1wle6rcmkq.R.inc(33770);try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33769);
    }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33771);
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33772);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33773);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33774);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33775);originalLocale = Locale.getDefault();
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33776);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33777);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33778);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33779);
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33780);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33781);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33782);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33783);Locale.setDefault(originalLocale);
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33784);originalDateTimeZone = null;
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33785);originalTimeZone = null;
        __CLR4_4_1q1wq1wle6rcmkq.R.inc(33786);originalLocale = null;
    }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactoryUTC99() {__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceStart(getClass().getName(),33787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yn6mrq2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q1wq1wle6rcmkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactoryUTC99",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yn6mrq2j(){try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33787); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33788);assertEquals(DateTimeZone.UTC, IslamicChronology.getInstanceUTC().getZone()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33789);assertSame(IslamicChronology.class, IslamicChronology.getInstanceUTC().getClass()); 
 }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}} 


public void testFactory100() {__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceStart(getClass().getName(),33790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ka5nnkq2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q1wq1wle6rcmkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ka5nnkq2m(){try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33790); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33791);assertEquals(LONDON, IslamicChronology.getInstance().getZone()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33792);assertSame(IslamicChronology.class, IslamicChronology.getInstance().getClass()); 
 }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}} 


public void testWithUTC101() {__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceStart(getClass().getName(),33793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1okwys3q2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q1wq1wle6rcmkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithUTC101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1okwys3q2p(){try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33793); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33794);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33795);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33796);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33797);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance().withUTC()); 
 }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}} 


public void testToString102() {__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceStart(getClass().getName(),33798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kz0d38q2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q1wq1wle6rcmkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testToString102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kz0d38q2u(){try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33798); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33799);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33800);assertEquals("IslamicChronology[Asia/Tokyo]", IslamicChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33801);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance().toString()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33802);assertEquals("IslamicChronology[UTC]", IslamicChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}} 


public void testWithZone103() {__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceStart(getClass().getName(),33803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ees8dzq2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q1wq1wle6rcmkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithZone103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ees8dzq2z(){try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33803); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33804);assertSame(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33805);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33806);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33807);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33808);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33809);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}} 


public void testSampleDateWithZone104() {__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceStart(getClass().getName(),33810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wh0nk0q36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q1wq1wle6rcmkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDateWithZone104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wh0nk0q36(){try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33810); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33811);DateTime dt = new DateTime(2005, 11, 26, 12, 0, 0, 0, PARIS).withChronology(ISLAMIC_UTC); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33812);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33813);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33814);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33815);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33816);assertEquals(11, dt.getHourOfDay()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33817);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33818);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33819);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}} 


public void testSampleDate1105() {__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceStart(getClass().getName(),33820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xk9u4qq3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q1wq1wle6rcmkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate1105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xk9u4qq3g(){try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33820); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33821);DateTime dt = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33822);dt = dt.withChronology(ISLAMIC_UTC); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33823);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33824);assertEquals(14, dt.getCenturyOfEra()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33825);assertEquals(64, dt.getYearOfCentury()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33826);assertEquals(1364, dt.getYearOfEra()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33827);assertEquals(1364, dt.getYear()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33828);Property fld = dt.year(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33829);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33830);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33831);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33832);assertEquals(new DateTime(1365, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33833);assertEquals(12, dt.getMonthOfYear()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33834);fld = dt.monthOfYear(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33835);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33836);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33837);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33838);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33839);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33840);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33841);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33842);assertEquals(new DateTime(1365, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33843);assertEquals(new DateTime(1364, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addWrapFieldToCopy(1)); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33844);assertEquals(6, dt.getDayOfMonth()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33845);fld = dt.dayOfMonth(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33846);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33847);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33848);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33849);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33850);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33851);assertEquals(29, fld.getMaximumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33852);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33853);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33854);assertEquals(DateTimeConstants.MONDAY, dt.getDayOfWeek()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33855);fld = dt.dayOfWeek(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33856);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33857);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33858);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33859);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33860);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33861);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33862);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33863);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33864);assertEquals(6 * 30 + 5 * 29 + 6, dt.getDayOfYear()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33865);fld = dt.dayOfYear(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33866);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33867);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33868);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33869);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33870);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33871);assertEquals(354, fld.getMaximumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33872);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33873);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33874);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33875);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33876);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33877);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}} 


public void testFieldConstructor106() {__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceStart(getClass().getName(),33878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16npp1oq52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q1wq1wle6rcmkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFieldConstructor106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16npp1oq52(){try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33878); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33879);DateTime date = new DateTime(1364, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33880);DateTime expectedDate = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33881);assertEquals(expectedDate.getMillis(), date.getMillis()); 
 }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}} 


public void testCalendar107() {__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceStart(getClass().getName(),33882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svcfjlq56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q1wq1wle6rcmkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testCalendar107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svcfjlq56(){try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33882); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33883);if ((((TestAll.FAST)&&(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33884)!=0|true))||(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33885)==0&false))) {{ 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33886);return; 
     } 
     }__CLR4_4_1q1wq1wle6rcmkq.R.inc(33887);System.out.println("\nTestIslamicChronology.testCalendar"); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33888);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33889);long millis = epoch.getMillis(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33890);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33891);DateTimeField dayOfWeek = ISLAMIC_UTC.dayOfWeek(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33892);DateTimeField dayOfYear = ISLAMIC_UTC.dayOfYear(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33893);DateTimeField dayOfMonth = ISLAMIC_UTC.dayOfMonth(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33894);DateTimeField monthOfYear = ISLAMIC_UTC.monthOfYear(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33895);DateTimeField year = ISLAMIC_UTC.year(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33896);DateTimeField yearOfEra = ISLAMIC_UTC.yearOfEra(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33897);DateTimeField era = ISLAMIC_UTC.era(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33898);int expectedDOW = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33899);int expectedDOY = 1; 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33900);int expectedDay = 1; 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33901);int expectedMonth = 1; 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33902);int expectedYear = 1; 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33903);while ((((millis < end)&&(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33904)!=0|true))||(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33905)==0&false))) {{ 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33906);int dowValue = dayOfWeek.get(millis); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33907);int doyValue = dayOfYear.get(millis); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33908);int dayValue = dayOfMonth.get(millis); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33909);int monthValue = monthOfYear.get(millis); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33910);int yearValue = year.get(millis); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33911);int yearOfEraValue = yearOfEra.get(millis); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33912);int dayOfYearLen = dayOfYear.getMaximumValue(millis); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33913);int monthLen = dayOfMonth.getMaximumValue(millis); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33914);if ((((monthValue < 1 || monthValue > 12)&&(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33915)!=0|true))||(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33916)==0&false))) {{ 
             __CLR4_4_1q1wq1wle6rcmkq.R.inc(33917);fail("Bad month: " + millis); 
         } 
         }__CLR4_4_1q1wq1wle6rcmkq.R.inc(33918);assertEquals(1, era.get(millis)); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33919);assertEquals("AH", era.getAsText(millis)); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33920);assertEquals("AH", era.getAsShortText(millis)); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33921);assertEquals(expectedDOY, doyValue); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33922);assertEquals(expectedMonth, monthValue); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33923);assertEquals(expectedDay, dayValue); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33924);assertEquals(expectedDOW, dowValue); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33925);assertEquals(expectedYear, yearValue); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33926);assertEquals(expectedYear, yearOfEraValue); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33927);boolean leap = ((11 * yearValue + 14) % 30) < 11; 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33928);assertEquals(leap, year.isLeap(millis)); 
         boolean __CLB4_4_1_bool0=false;__CLR4_4_1q1wq1wle6rcmkq.R.inc(33929);switch(monthValue) { 
             case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1q1wq1wle6rcmkq.R.inc(33930);__CLB4_4_1_bool0=true;} 
             case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_1q1wq1wle6rcmkq.R.inc(33931);__CLB4_4_1_bool0=true;} 
             case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_1q1wq1wle6rcmkq.R.inc(33932);__CLB4_4_1_bool0=true;} 
             case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_1q1wq1wle6rcmkq.R.inc(33933);__CLB4_4_1_bool0=true;} 
             case 9:if (!__CLB4_4_1_bool0) {__CLR4_4_1q1wq1wle6rcmkq.R.inc(33934);__CLB4_4_1_bool0=true;} 
             case 11:if (!__CLB4_4_1_bool0) {__CLR4_4_1q1wq1wle6rcmkq.R.inc(33935);__CLB4_4_1_bool0=true;} 
                 __CLR4_4_1q1wq1wle6rcmkq.R.inc(33936);assertEquals(30, monthLen); 
                 __CLR4_4_1q1wq1wle6rcmkq.R.inc(33937);break; 
             case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_1q1wq1wle6rcmkq.R.inc(33938);__CLB4_4_1_bool0=true;} 
             case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_1q1wq1wle6rcmkq.R.inc(33939);__CLB4_4_1_bool0=true;} 
             case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_1q1wq1wle6rcmkq.R.inc(33940);__CLB4_4_1_bool0=true;} 
             case 8:if (!__CLB4_4_1_bool0) {__CLR4_4_1q1wq1wle6rcmkq.R.inc(33941);__CLB4_4_1_bool0=true;} 
             case 10:if (!__CLB4_4_1_bool0) {__CLR4_4_1q1wq1wle6rcmkq.R.inc(33942);__CLB4_4_1_bool0=true;} 
                 __CLR4_4_1q1wq1wle6rcmkq.R.inc(33943);assertEquals(29, monthLen); 
                 __CLR4_4_1q1wq1wle6rcmkq.R.inc(33944);break; 
             case 12:if (!__CLB4_4_1_bool0) {__CLR4_4_1q1wq1wle6rcmkq.R.inc(33945);__CLB4_4_1_bool0=true;} 
                 __CLR4_4_1q1wq1wle6rcmkq.R.inc(33946);assertEquals(((((leap )&&(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33947)!=0|true))||(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33948)==0&false))? 30 : 29), monthLen); 
                 __CLR4_4_1q1wq1wle6rcmkq.R.inc(33949);break; 
         } 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33950);assertEquals(((((leap )&&(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33951)!=0|true))||(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33952)==0&false))? 355 : 354), dayOfYearLen); 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33953);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1; 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33954);expectedDay++; 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33955);expectedDOY++; 
         __CLR4_4_1q1wq1wle6rcmkq.R.inc(33956);if ((((expectedDay > monthLen)&&(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33957)!=0|true))||(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33958)==0&false))) {{ 
             __CLR4_4_1q1wq1wle6rcmkq.R.inc(33959);expectedDay = 1; 
             __CLR4_4_1q1wq1wle6rcmkq.R.inc(33960);expectedMonth++; 
             __CLR4_4_1q1wq1wle6rcmkq.R.inc(33961);if ((((expectedMonth == 13)&&(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33962)!=0|true))||(__CLR4_4_1q1wq1wle6rcmkq.R.iget(33963)==0&false))) {{ 
                 __CLR4_4_1q1wq1wle6rcmkq.R.inc(33964);expectedMonth = 1; 
                 __CLR4_4_1q1wq1wle6rcmkq.R.inc(33965);expectedDOY = 1; 
                 __CLR4_4_1q1wq1wle6rcmkq.R.inc(33966);expectedYear++; 
             } 
         }} 
         }__CLR4_4_1q1wq1wle6rcmkq.R.inc(33967);millis += SKIP; 
     } 
 }}finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}} 


public void testSampleDate2108() {__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceStart(getClass().getName(),33968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iylajsq7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q1wq1wle6rcmkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate2108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iylajsq7k(){try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(33968); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33969);DateTime dt = new DateTime(2005, 11, 26, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33970);dt = dt.withChronology(ISLAMIC_UTC); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33971);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33972);assertEquals(15, dt.getCenturyOfEra()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33973);assertEquals(26, dt.getYearOfCentury()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33974);assertEquals(1426, dt.getYearOfEra()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33975);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33976);Property fld = dt.year(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33977);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33978);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33979);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33980);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33981);fld = dt.monthOfYear(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33982);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33983);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33984);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33985);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33986);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33987);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33988);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33989);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33990);fld = dt.dayOfMonth(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33991);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33992);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33993);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33994);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33995);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33996);assertEquals(29, fld.getMaximumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33997);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33998);assertEquals(DateTimeConstants.SATURDAY, dt.getDayOfWeek()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(33999);fld = dt.dayOfWeek(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34000);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34001);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34002);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34003);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34004);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34005);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34006);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34007);assertEquals(5 * 30 + 4 * 29 + 24, dt.getDayOfYear()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34008);fld = dt.dayOfYear(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34009);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34010);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34011);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34012);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34013);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34014);assertEquals(355, fld.getMaximumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34015);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34016);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34017);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34018);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34019);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}} 


public void testSampleDate3450() {__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceStart(getClass().getName(),34020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1q0h9q90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q1wq1wle6rcmkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q1wq1wle6rcmkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate3450",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1q0h9q90(){try{__CLR4_4_1q1wq1wle6rcmkq.R.inc(34020); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34021);DateTime dt = new DateTime(1426, 12, 24, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34022);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34023);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34024);Property fld = dt.year(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34025);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34026);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34027);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34028);assertEquals(12, dt.getMonthOfYear()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34029);fld = dt.monthOfYear(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34030);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34031);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34032);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34033);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34034);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34035);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34036);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34037);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34038);fld = dt.dayOfMonth(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34039);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34040);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34041);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34042);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34043);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34044);assertEquals(30, fld.getMaximumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34045);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34046);assertEquals(DateTimeConstants.TUESDAY, dt.getDayOfWeek()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34047);fld = dt.dayOfWeek(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34048);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34049);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34050);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34051);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34052);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34053);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34054);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34055);assertEquals(6 * 30 + 5 * 29 + 24, dt.getDayOfYear()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34056);fld = dt.dayOfYear(); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34057);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34058);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34059);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34060);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34061);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34062);assertEquals(355, fld.getMaximumValue()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34063);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34064);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34065);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34066);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q1wq1wle6rcmkq.R.inc(34067);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q1wq1wle6rcmkq.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

    

    

    

    

}
