/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInterval;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Basics extends TestCase {static class __CLR4_4_1hoshosle6nl88t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,23035,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private Interval interval37;
    private Interval interval33;

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1hoshosle6nl88t.R.inc(22924);
        __CLR4_4_1hoshosle6nl88t.R.inc(22925);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hoshosle6nl88t.R.inc(22926);
        __CLR4_4_1hoshosle6nl88t.R.inc(22927);return new TestSuite(TestInterval_Basics.class);
    }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}

    public TestInterval_Basics(String name) {
        super(name);__CLR4_4_1hoshosle6nl88t.R.inc(22929);try{__CLR4_4_1hoshosle6nl88t.R.inc(22928);
    }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hoshosle6nl88t.R.inc(22930);
        __CLR4_4_1hoshosle6nl88t.R.inc(22931);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hoshosle6nl88t.R.inc(22932);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hoshosle6nl88t.R.inc(22933);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hoshosle6nl88t.R.inc(22934);originalLocale = Locale.getDefault();
        __CLR4_4_1hoshosle6nl88t.R.inc(22935);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1hoshosle6nl88t.R.inc(22936);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1hoshosle6nl88t.R.inc(22937);Locale.setDefault(Locale.FRANCE);
        __CLR4_4_1hoshosle6nl88t.R.inc(22938);interval37 = new Interval(3, 7);
        __CLR4_4_1hoshosle6nl88t.R.inc(22939);interval33 = new Interval(3, 3);
    }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hoshosle6nl88t.R.inc(22940);
        __CLR4_4_1hoshosle6nl88t.R.inc(22941);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hoshosle6nl88t.R.inc(22942);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hoshosle6nl88t.R.inc(22943);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hoshosle6nl88t.R.inc(22944);Locale.setDefault(originalLocale);
        __CLR4_4_1hoshosle6nl88t.R.inc(22945);originalDateTimeZone = null;
        __CLR4_4_1hoshosle6nl88t.R.inc(22946);originalTimeZone = null;
        __CLR4_4_1hoshosle6nl88t.R.inc(22947);originalLocale = null;
    }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_long_long_Chronology143() throws Throwable {__CLR4_4_1hoshosle6nl88t.R.globalSliceStart(getClass().getName(),22948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgfgxkhpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoshosle6nl88t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoshosle6nl88t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testConstructor_long_long_Chronology143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgfgxkhpg() throws Throwable{try{__CLR4_4_1hoshosle6nl88t.R.inc(22948); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22949);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22950);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22951);Period test = new Period(dt1.getMillis(), dt2.getMillis(), ISOChronology.getInstanceUTC()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22952);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22953);assertEquals(1, test.getYears()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22954);assertEquals(1, test.getMonths()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22955);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22956);assertEquals(1, test.getDays()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22957);assertEquals(1, test.getHours()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22958);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22959);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22960);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
public void testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths44() throws Throwable {__CLR4_4_1hoshosle6nl88t.R.globalSliceStart(getClass().getName(),22961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrcgcchpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoshosle6nl88t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoshosle6nl88t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths44",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrcgcchpt() throws Throwable{try{__CLR4_4_1hoshosle6nl88t.R.inc(22961); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22962);DateTime dt1 = new DateTime(2004, 12, 28, 0, 0); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22963);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22964);Period test = new Period(dt1, dt2); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22965);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22966);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
public void testGap_RInterval_zone147() {__CLR4_4_1hoshosle6nl88t.R.globalSliceStart(getClass().getName(),22967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5zq6khpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoshosle6nl88t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoshosle6nl88t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_zone147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5zq6khpz(){try{__CLR4_4_1hoshosle6nl88t.R.inc(22967); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22968);Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22969);assertEquals(ISOChronology.getInstance(LONDON), testA.getChronology()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22970);Interval testB = new Interval(new DateTime(1, MOSCOW), new DateTime(2, MOSCOW)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22971);assertEquals(ISOChronology.getInstance(MOSCOW), testB.getChronology()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22972);Interval resultAB = testA.gap(testB); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22973);assertEquals(ISOChronology.getInstance(LONDON), resultAB.getChronology()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22974);Interval resultBA = testB.gap(testA); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22975);assertEquals(ISOChronology.getInstance(MOSCOW), resultBA.getChronology()); 
 }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
public void testAbuts_RInterval_null148() {__CLR4_4_1hoshosle6nl88t.R.globalSliceStart(getClass().getName(),22976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169pchdhq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoshosle6nl88t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoshosle6nl88t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval_null148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169pchdhq8(){try{__CLR4_4_1hoshosle6nl88t.R.inc(22976); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22977);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22978);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22979);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22980);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22981);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22982);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22983);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22984);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22985);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22986);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22987);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22988);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
 }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
public void testWithDurationAfterStart4149() throws Throwable {__CLR4_4_1hoshosle6nl88t.R.globalSliceStart(getClass().getName(),22989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcichnhql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoshosle6nl88t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoshosle6nl88t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart4149",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcichnhql() throws Throwable{try{__CLR4_4_1hoshosle6nl88t.R.inc(22989); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22990);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22991);Interval test = base.withDurationAfterStart(base.toDuration()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22992);assertSame(base, test); 
 }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
public void testWithDurationBeforeEnd4150() throws Throwable {__CLR4_4_1hoshosle6nl88t.R.globalSliceStart(getClass().getName(),22993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12hi52nhqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoshosle6nl88t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoshosle6nl88t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd4150",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12hi52nhqp() throws Throwable{try{__CLR4_4_1hoshosle6nl88t.R.inc(22993); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22994);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22995);Interval test = base.withDurationBeforeEnd(base.toDuration()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22996);assertSame(base, test); 
 }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
public void testWithPeriodAfterStart1151() throws Throwable {__CLR4_4_1hoshosle6nl88t.R.globalSliceStart(getClass().getName(),22997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxyhj6hqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoshosle6nl88t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoshosle6nl88t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart1151",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxyhj6hqt() throws Throwable{try{__CLR4_4_1hoshosle6nl88t.R.inc(22997); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22998);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1hoshosle6nl88t.R.inc(22999);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23000);Interval base = new Interval(dt, dt); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23001);Interval test = base.withPeriodAfterStart(dur); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23002);assertEquals(new Interval(dt, dur), test); 
 }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
public void testIsBefore_RInterval_null484() {__CLR4_4_1hoshosle6nl88t.R.globalSliceStart(getClass().getName(),23003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19pmkpohqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoshosle6nl88t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoshosle6nl88t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RInterval_null484",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19pmkpohqz(){try{__CLR4_4_1hoshosle6nl88t.R.inc(23003); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23004);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23005);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23006);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23007);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23008);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23009);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23010);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23011);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23012);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23013);assertEquals(true, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23014);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23015);assertEquals(true, interval37.isBefore((ReadableInterval) null)); 
 }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
public void testAdd_RInterval1489() {__CLR4_4_1hoshosle6nl88t.R.globalSliceStart(getClass().getName(),23016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6he6hrc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hoshosle6nl88t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hoshosle6nl88t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAdd_RInterval1489",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6he6hrc(){try{__CLR4_4_1hoshosle6nl88t.R.inc(23016); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23017);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23018);test.add(new Interval(100L, 200L)); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23019);assertEquals(0, test.getYears()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23020);assertEquals(0, test.getMonths()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23021);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23022);assertEquals(0, test.getDays()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23023);assertEquals(0, test.getHours()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23024);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23025);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1hoshosle6nl88t.R.inc(23026);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1hoshosle6nl88t.R.inc(23028);try{__CLR4_4_1hoshosle6nl88t.R.inc(23027);
        }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1hoshosle6nl88t.R.inc(23029);
            __CLR4_4_1hoshosle6nl88t.R.inc(23030);return ISOChronology.getInstance();
        }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1hoshosle6nl88t.R.inc(23031);
            __CLR4_4_1hoshosle6nl88t.R.inc(23032);return TEST_TIME1;
        }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1hoshosle6nl88t.R.inc(23033);
            __CLR4_4_1hoshosle6nl88t.R.inc(23034);return TEST_TIME2;
        }finally{__CLR4_4_1hoshosle6nl88t.R.flushNeeded();}}
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
    

    

    

}
