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
import org.joda.time.Period;

/**
 * This class is a Junit unit test for BuddhistChronology.
 *
 * @author Stephen Colebourne
 */
public class TestBuddhistChronology extends TestCase {static class __CLR4_4_1qxnqxnlc8axeo3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,35018,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static int SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
    
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology GJ_UTC = GJChronology.getInstanceUTC();
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

    public static void main(String[] args) {try{__CLR4_4_1qxnqxnlc8axeo3.R.inc(34907);
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34908);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34909);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1qxnqxnlc8axeo3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1qxnqxnlc8axeo3.R.inc(34910);
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34911);return new TestSuite(TestBuddhistChronology.class);
    }finally{__CLR4_4_1qxnqxnlc8axeo3.R.flushNeeded();}}

    public TestBuddhistChronology(String name) {
        super(name);__CLR4_4_1qxnqxnlc8axeo3.R.inc(34913);try{__CLR4_4_1qxnqxnlc8axeo3.R.inc(34912);
    }finally{__CLR4_4_1qxnqxnlc8axeo3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1qxnqxnlc8axeo3.R.inc(34914);
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34915);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34916);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34917);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34918);originalLocale = Locale.getDefault();
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34919);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34920);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34921);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1qxnqxnlc8axeo3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1qxnqxnlc8axeo3.R.inc(34922);
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34923);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34924);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34925);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34926);Locale.setDefault(originalLocale);
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34927);originalDateTimeZone = null;
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34928);originalTimeZone = null;
        __CLR4_4_1qxnqxnlc8axeo3.R.inc(34929);originalLocale = null;
    }finally{__CLR4_4_1qxnqxnlc8axeo3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testKeyYears314() {__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceStart(getClass().getName(),34930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7ll4kqya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qxnqxnlc8axeo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testKeyYears314",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7ll4kqya(){try{__CLR4_4_1qxnqxnlc8axeo3.R.inc(34930); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34931);DateTime bd = new DateTime(2513, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34932);DateTime jd = new DateTime(1970, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34933);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34934);assertEquals(2513, bd.getYear()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34935);assertEquals(2513, bd.getYearOfEra()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34936);assertEquals(2513, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34937);bd = new DateTime(2126, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34938);jd = new DateTime(1583, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34939);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34940);assertEquals(2126, bd.getYear()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34941);assertEquals(2126, bd.getYearOfEra()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34942);assertEquals(2126, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34943);bd = new DateTime(2125, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34944);jd = new DateTime(1582, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34945);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34946);assertEquals(2125, bd.getYear()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34947);assertEquals(2125, bd.getYearOfEra()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34948);assertEquals(2125, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34949);bd = new DateTime(544, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34950);jd = new DateTime(1, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34951);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34952);assertEquals(544, bd.getYear()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34953);assertEquals(544, bd.getYearOfEra()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34954);assertEquals(544, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34955);bd = new DateTime(543, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34956);jd = new DateTime(-1, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34957);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34958);assertEquals(543, bd.getYear()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34959);assertEquals(543, bd.getYearOfEra()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34960);assertEquals(543, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34961);bd = new DateTime(1, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34962);jd = new DateTime(-543, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34963);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34964);assertEquals(1, bd.getYear()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34965);assertEquals(1, bd.getYearOfEra()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34966);assertEquals(1, bd.plus(Period.weeks(1)).getWeekyear()); 
 }finally{__CLR4_4_1qxnqxnlc8axeo3.R.flushNeeded();}} 


public void testEra777() {__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceStart(getClass().getName(),34967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lfwp7oqzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qxnqxnlc8axeo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testEra777",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lfwp7oqzb(){try{__CLR4_4_1qxnqxnlc8axeo3.R.inc(34967); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34968);assertEquals(1, BuddhistChronology.BE); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34969);try { 
         __CLR4_4_1qxnqxnlc8axeo3.R.inc(34970);new DateTime(-1, 13, 5, 0, 0, 0, 0, BUDDHIST_UTC); 
         __CLR4_4_1qxnqxnlc8axeo3.R.inc(34971);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qxnqxnlc8axeo3.R.flushNeeded();}} 


public void testTimeFields799() {__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceStart(getClass().getName(),34972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fggt6qzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qxnqxnlc8axeo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testTimeFields799",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fggt6qzg(){try{__CLR4_4_1qxnqxnlc8axeo3.R.inc(34972); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34973);final BuddhistChronology buddhist = BuddhistChronology.getInstance(); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34974);assertEquals("halfdayOfDay", buddhist.halfdayOfDay().getName()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34975);assertEquals("clockhourOfHalfday", buddhist.clockhourOfHalfday().getName()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34976);assertEquals("hourOfHalfday", buddhist.hourOfHalfday().getName()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34977);assertEquals("clockhourOfDay", buddhist.clockhourOfDay().getName()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34978);assertEquals("hourOfDay", buddhist.hourOfDay().getName()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34979);assertEquals("minuteOfDay", buddhist.minuteOfDay().getName()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34980);assertEquals("minuteOfHour", buddhist.minuteOfHour().getName()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34981);assertEquals("secondOfDay", buddhist.secondOfDay().getName()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34982);assertEquals("secondOfMinute", buddhist.secondOfMinute().getName()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34983);assertEquals("millisOfDay", buddhist.millisOfDay().getName()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34984);assertEquals("millisOfSecond", buddhist.millisOfSecond().getName()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34985);assertEquals(true, buddhist.halfdayOfDay().isSupported()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34986);assertEquals(true, buddhist.clockhourOfHalfday().isSupported()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34987);assertEquals(true, buddhist.hourOfHalfday().isSupported()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34988);assertEquals(true, buddhist.clockhourOfDay().isSupported()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34989);assertEquals(true, buddhist.hourOfDay().isSupported()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34990);assertEquals(true, buddhist.minuteOfDay().isSupported()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34991);assertEquals(true, buddhist.minuteOfHour().isSupported()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34992);assertEquals(true, buddhist.secondOfDay().isSupported()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34993);assertEquals(true, buddhist.secondOfMinute().isSupported()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34994);assertEquals(true, buddhist.millisOfDay().isSupported()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34995);assertEquals(true, buddhist.millisOfSecond().isSupported()); 
 }finally{__CLR4_4_1qxnqxnlc8axeo3.R.flushNeeded();}} 


public void testWithUTC826() {__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceStart(getClass().getName(),34996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yva7rdr04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qxnqxnlc8axeo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testWithUTC826",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yva7rdr04(){try{__CLR4_4_1qxnqxnlc8axeo3.R.inc(34996); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34997);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34998);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(34999);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35000);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance().withUTC()); 
 }finally{__CLR4_4_1qxnqxnlc8axeo3.R.flushNeeded();}} 


public void testToString943() {__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceStart(getClass().getName(),35001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d1hmzlr09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qxnqxnlc8axeo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testToString943",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d1hmzlr09(){try{__CLR4_4_1qxnqxnlc8axeo3.R.inc(35001); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35002);assertEquals("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35003);assertEquals("BuddhistChronology[Asia/Tokyo]", BuddhistChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35004);assertEquals("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance().toString()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35005);assertEquals("BuddhistChronology[UTC]", BuddhistChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1qxnqxnlc8axeo3.R.flushNeeded();}} 


public void testWithZone1028() {__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceStart(getClass().getName(),35006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hww0z4r0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qxnqxnlc8axeo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testWithZone1028",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hww0z4r0e(){try{__CLR4_4_1qxnqxnlc8axeo3.R.inc(35006); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35007);assertSame(BuddhistChronology.getInstance(TOKYO), BuddhistChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35008);assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35009);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35010);assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35011);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35012);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1qxnqxnlc8axeo3.R.flushNeeded();}} 


public void testFactory_Zone1625() {__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceStart(getClass().getName(),35013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vgc9ur0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qxnqxnlc8axeo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qxnqxnlc8axeo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testFactory_Zone1625",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vgc9ur0l(){try{__CLR4_4_1qxnqxnlc8axeo3.R.inc(35013); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35014);assertEquals(TOKYO, BuddhistChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35015);assertEquals(PARIS, BuddhistChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35016);assertEquals(LONDON, BuddhistChronology.getInstance(null).getZone()); 
     __CLR4_4_1qxnqxnlc8axeo3.R.inc(35017);assertSame(BuddhistChronology.class, BuddhistChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1qxnqxnlc8axeo3.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

}
