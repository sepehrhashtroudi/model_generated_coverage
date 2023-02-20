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
public class TestBuddhistChronology extends TestCase {static class __CLR4_4_1pe7pe7le6qsfdj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,33084,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(32911);
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32912);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32913);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(32914);
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32915);return new TestSuite(TestBuddhistChronology.class);
    }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}}

    public TestBuddhistChronology(String name) {
        super(name);__CLR4_4_1pe7pe7le6qsfdj.R.inc(32917);try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(32916);
    }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(32918);
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32919);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32920);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32921);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32922);originalLocale = Locale.getDefault();
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32923);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32924);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32925);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(32926);
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32927);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32928);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32929);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32930);Locale.setDefault(originalLocale);
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32931);originalDateTimeZone = null;
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32932);originalTimeZone = null;
        __CLR4_4_1pe7pe7le6qsfdj.R.inc(32933);originalLocale = null;
    }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testKeyYears135() {__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceStart(getClass().getName(),32934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b4wor5peu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pe7pe7le6qsfdj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testKeyYears135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b4wor5peu(){try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(32934); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32935);DateTime bd = new DateTime(2513, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32936);DateTime jd = new DateTime(1970, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32937);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32938);assertEquals(2513, bd.getYear()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32939);assertEquals(2513, bd.getYearOfEra()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32940);assertEquals(2513, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32941);bd = new DateTime(2126, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32942);jd = new DateTime(1583, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32943);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32944);assertEquals(2126, bd.getYear()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32945);assertEquals(2126, bd.getYearOfEra()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32946);assertEquals(2126, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32947);bd = new DateTime(2125, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32948);jd = new DateTime(1582, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32949);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32950);assertEquals(2125, bd.getYear()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32951);assertEquals(2125, bd.getYearOfEra()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32952);assertEquals(2125, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32953);bd = new DateTime(544, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32954);jd = new DateTime(1, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32955);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32956);assertEquals(544, bd.getYear()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32957);assertEquals(544, bd.getYearOfEra()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32958);assertEquals(544, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32959);bd = new DateTime(543, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32960);jd = new DateTime(-1, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32961);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32962);assertEquals(543, bd.getYear()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32963);assertEquals(543, bd.getYearOfEra()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32964);assertEquals(543, bd.plus(Period.weeks(1)).getWeekyear()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32965);bd = new DateTime(1, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32966);jd = new DateTime(-543, 1, 1, 0, 0, 0, 0, GJ_UTC); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32967);assertEquals(jd, bd.withChronology(GJ_UTC)); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32968);assertEquals(1, bd.getYear()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32969);assertEquals(1, bd.getYearOfEra()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32970);assertEquals(1, bd.plus(Period.weeks(1)).getWeekyear()); 
 }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}} 


public void testEra386() {__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceStart(getClass().getName(),32971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dkczzqpfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pe7pe7le6qsfdj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testEra386",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dkczzqpfv(){try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(32971); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32972);assertEquals(1, BuddhistChronology.BE); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32973);try { 
         __CLR4_4_1pe7pe7le6qsfdj.R.inc(32974);new DateTime(-1, 13, 5, 0, 0, 0, 0, BUDDHIST_UTC); 
         __CLR4_4_1pe7pe7le6qsfdj.R.inc(32975);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}} 


public void testWithUTC395() {__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceStart(getClass().getName(),32976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wickd2pg0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pe7pe7le6qsfdj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testWithUTC395",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wickd2pg0(){try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(32976); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32977);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32978);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32979);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32980);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance().withUTC()); 
 }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}} 


public void testTimeFields396() {__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceStart(getClass().getName(),32981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n1lq9pg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pe7pe7le6qsfdj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testTimeFields396",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n1lq9pg5(){try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(32981); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32982);final BuddhistChronology buddhist = BuddhistChronology.getInstance(); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32983);assertEquals("halfdayOfDay", buddhist.halfdayOfDay().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32984);assertEquals("clockhourOfHalfday", buddhist.clockhourOfHalfday().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32985);assertEquals("hourOfHalfday", buddhist.hourOfHalfday().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32986);assertEquals("clockhourOfDay", buddhist.clockhourOfDay().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32987);assertEquals("hourOfDay", buddhist.hourOfDay().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32988);assertEquals("minuteOfDay", buddhist.minuteOfDay().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32989);assertEquals("minuteOfHour", buddhist.minuteOfHour().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32990);assertEquals("secondOfDay", buddhist.secondOfDay().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32991);assertEquals("secondOfMinute", buddhist.secondOfMinute().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32992);assertEquals("millisOfDay", buddhist.millisOfDay().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32993);assertEquals("millisOfSecond", buddhist.millisOfSecond().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32994);assertEquals(true, buddhist.halfdayOfDay().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32995);assertEquals(true, buddhist.clockhourOfHalfday().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32996);assertEquals(true, buddhist.hourOfHalfday().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32997);assertEquals(true, buddhist.clockhourOfDay().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32998);assertEquals(true, buddhist.hourOfDay().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(32999);assertEquals(true, buddhist.minuteOfDay().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33000);assertEquals(true, buddhist.minuteOfHour().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33001);assertEquals(true, buddhist.secondOfDay().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33002);assertEquals(true, buddhist.secondOfMinute().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33003);assertEquals(true, buddhist.millisOfDay().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33004);assertEquals(true, buddhist.millisOfSecond().isSupported()); 
 }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}} 


public void testFactory_Zone397() {__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceStart(getClass().getName(),33005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfeqmzpgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pe7pe7le6qsfdj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testFactory_Zone397",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfeqmzpgt(){try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(33005); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33006);assertEquals(TOKYO, BuddhistChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33007);assertEquals(PARIS, BuddhistChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33008);assertEquals(LONDON, BuddhistChronology.getInstance(null).getZone()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33009);assertSame(BuddhistChronology.class, BuddhistChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}} 


public void testDurationFields398() {__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceStart(getClass().getName(),33010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12dkvaypgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pe7pe7le6qsfdj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testDurationFields398",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12dkvaypgy(){try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(33010); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33011);final BuddhistChronology buddhist = BuddhistChronology.getInstance(); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33012);assertEquals("eras", buddhist.eras().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33013);assertEquals("centuries", buddhist.centuries().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33014);assertEquals("years", buddhist.years().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33015);assertEquals("weekyears", buddhist.weekyears().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33016);assertEquals("months", buddhist.months().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33017);assertEquals("weeks", buddhist.weeks().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33018);assertEquals("days", buddhist.days().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33019);assertEquals("halfdays", GregorianChronology.getInstance().halfdays().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33020);assertEquals("hours", buddhist.hours().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33021);assertEquals("minutes", buddhist.minutes().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33022);assertEquals("seconds", buddhist.seconds().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33023);assertEquals("millis", buddhist.millis().getName()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33024);assertEquals(false, buddhist.eras().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33025);assertEquals(true, buddhist.centuries().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33026);assertEquals(true, buddhist.years().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33027);assertEquals(true, buddhist.weekyears().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33028);assertEquals(true, buddhist.months().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33029);assertEquals(true, buddhist.weeks().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33030);assertEquals(true, buddhist.days().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33031);assertEquals(true, buddhist.halfdays().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33032);assertEquals(true, buddhist.hours().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33033);assertEquals(true, buddhist.minutes().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33034);assertEquals(true, buddhist.seconds().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33035);assertEquals(true, buddhist.millis().isSupported()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33036);assertEquals(false, buddhist.centuries().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33037);assertEquals(false, buddhist.years().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33038);assertEquals(false, buddhist.weekyears().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33039);assertEquals(false, buddhist.months().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33040);assertEquals(false, buddhist.weeks().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33041);assertEquals(false, buddhist.days().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33042);assertEquals(false, buddhist.halfdays().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33043);assertEquals(true, buddhist.hours().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33044);assertEquals(true, buddhist.minutes().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33045);assertEquals(true, buddhist.seconds().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33046);assertEquals(true, buddhist.millis().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33047);final BuddhistChronology buddhistUTC = BuddhistChronology.getInstanceUTC(); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33048);assertEquals(false, buddhistUTC.centuries().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33049);assertEquals(false, buddhistUTC.years().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33050);assertEquals(false, buddhistUTC.weekyears().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33051);assertEquals(false, buddhistUTC.months().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33052);assertEquals(true, buddhistUTC.weeks().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33053);assertEquals(true, buddhistUTC.days().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33054);assertEquals(true, buddhistUTC.halfdays().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33055);assertEquals(true, buddhistUTC.hours().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33056);assertEquals(true, buddhistUTC.minutes().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33057);assertEquals(true, buddhistUTC.seconds().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33058);assertEquals(true, buddhistUTC.millis().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33059);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33060);final BuddhistChronology buddhistGMT = BuddhistChronology.getInstance(gmt); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33061);assertEquals(false, buddhistGMT.centuries().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33062);assertEquals(false, buddhistGMT.years().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33063);assertEquals(false, buddhistGMT.weekyears().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33064);assertEquals(false, buddhistGMT.months().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33065);assertEquals(true, buddhistGMT.weeks().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33066);assertEquals(true, buddhistGMT.days().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33067);assertEquals(true, buddhistGMT.halfdays().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33068);assertEquals(true, buddhistGMT.hours().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33069);assertEquals(true, buddhistGMT.minutes().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33070);assertEquals(true, buddhistGMT.seconds().isPrecise()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33071);assertEquals(true, buddhistGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}} 


public void testWithZone400() {__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceStart(getClass().getName(),33072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qrqkppio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pe7pe7le6qsfdj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testWithZone400",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qrqkppio(){try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(33072); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33073);assertSame(BuddhistChronology.getInstance(TOKYO), BuddhistChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33074);assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33075);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33076);assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33077);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33078);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}} 


public void testToString401() {__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceStart(getClass().getName(),33079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1umkegypiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pe7pe7le6qsfdj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pe7pe7le6qsfdj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testToString401",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1umkegypiv(){try{__CLR4_4_1pe7pe7le6qsfdj.R.inc(33079); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33080);assertEquals("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33081);assertEquals("BuddhistChronology[Asia/Tokyo]", BuddhistChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33082);assertEquals("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance().toString()); 
     __CLR4_4_1pe7pe7le6qsfdj.R.inc(33083);assertEquals("BuddhistChronology[UTC]", BuddhistChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1pe7pe7le6qsfdj.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

}
