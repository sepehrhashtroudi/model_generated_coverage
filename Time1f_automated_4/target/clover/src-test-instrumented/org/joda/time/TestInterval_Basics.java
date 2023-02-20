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
public class TestInterval_Basics extends TestCase {static class __CLR4_4_1hv8hv8le6o79r1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,23241,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23156);
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23157);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23158);
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23159);return new TestSuite(TestInterval_Basics.class);
    }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}

    public TestInterval_Basics(String name) {
        super(name);__CLR4_4_1hv8hv8le6o79r1.R.inc(23161);try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23160);
    }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23162);
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23163);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23164);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23165);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23166);originalLocale = Locale.getDefault();
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23167);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23168);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23169);Locale.setDefault(Locale.FRANCE);
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23170);interval37 = new Interval(3, 7);
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23171);interval33 = new Interval(3, 3);
    }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23172);
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23173);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23174);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23175);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23176);Locale.setDefault(originalLocale);
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23177);originalDateTimeZone = null;
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23178);originalTimeZone = null;
        __CLR4_4_1hv8hv8le6o79r1.R.inc(23179);originalLocale = null;
    }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_RI_RI1138() throws Throwable {__CLR4_4_1hv8hv8le6o79r1.R.globalSliceStart(getClass().getName(),23180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nmp3zohvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hv8hv8le6o79r1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hv8hv8le6o79r1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testConstructor_RI_RI1138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nmp3zohvw() throws Throwable{try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23180); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23181);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23182);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23183);Interval test = new Interval(dt1, dt2); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23184);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23185);assertEquals(dt2.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
public void testConstructor_RP_RI5142() throws Throwable {__CLR4_4_1hv8hv8le6o79r1.R.globalSliceStart(getClass().getName(),23186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdo0imhw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hv8hv8le6o79r1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hv8hv8le6o79r1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testConstructor_RP_RI5142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdo0imhw2() throws Throwable{try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23186); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23187);MutableInterval test = new MutableInterval((ReadablePeriod) null, (ReadableInstant) null); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23188);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23189);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
public void testToInterval1143() {__CLR4_4_1hv8hv8le6o79r1.R.globalSliceStart(getClass().getName(),23190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ys9jshw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hv8hv8le6o79r1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hv8hv8le6o79r1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToInterval1143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ys9jshw6(){try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23190); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23191);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23192);Interval test = base.toInterval(); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23193);assertSame(base, test); 
 }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
public void testToInterval4144() {__CLR4_4_1hv8hv8le6o79r1.R.globalSliceStart(getClass().getName(),23194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pru5yuhwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hv8hv8le6o79r1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hv8hv8le6o79r1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToInterval4144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pru5yuhwa(){try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23194); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23195);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23196);Interval test = base.toInterval(); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23197);assertSame(base, test); 
 }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
public void testWithEndInstant_long3145() {__CLR4_4_1hv8hv8le6o79r1.R.globalSliceStart(getClass().getName(),23198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ts976rhwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hv8hv8le6o79r1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hv8hv8le6o79r1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndInstant_long3145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ts976rhwe(){try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23198); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23199);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23200);Interval test = base.withEnd(null); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23201);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
public void testWithPeriodBeforeEnd1146() throws Throwable {__CLR4_4_1hv8hv8le6o79r1.R.globalSliceStart(getClass().getName(),23202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nyxqvghwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hv8hv8le6o79r1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hv8hv8le6o79r1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd1146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nyxqvghwi() throws Throwable{try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23202); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23203);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23204);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23205);Interval base = new Interval(dt, dt); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23206);Interval test = base.withPeriodBeforeEnd(dur); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23207);assertEquals(new Interval(dt, dur), test); 
 }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
public void testContains_RI_zeroDuration468() {__CLR4_4_1hv8hv8le6o79r1.R.globalSliceStart(getClass().getName(),23208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178tj09hwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hv8hv8le6o79r1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hv8hv8le6o79r1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_zeroDuration468",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178tj09hwo(){try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23208); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23209);assertEquals(false, interval33.contains(new Instant(2))); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23210);assertEquals(false, interval33.contains(new Instant(3))); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23211);assertEquals(false, interval33.contains(new Instant(4))); 
 }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
public void testContainsNow469() {__CLR4_4_1hv8hv8le6o79r1.R.globalSliceStart(getClass().getName(),23212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ki54yvhws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hv8hv8le6o79r1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hv8hv8le6o79r1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContainsNow469",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ki54yvhws(){try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23212); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23213);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23214);assertEquals(false, interval37.containsNow()); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23215);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23216);assertEquals(false, interval37.containsNow()); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23217);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23218);assertEquals(false, interval37.containsNow()); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23219);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23220);assertEquals(false, interval37.containsNow()); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23221);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23222);assertEquals(false, interval37.containsNow()); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23223);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23224);assertEquals(false, interval37.containsNow()); 
 }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
public void testIsAfter_RI471() {__CLR4_4_1hv8hv8le6o79r1.R.globalSliceStart(getClass().getName(),23225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gvcqlbhx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hv8hv8le6o79r1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hv8hv8le6o79r1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gvcqlbhx5(){try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23225); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23226);assertEquals(true, interval37.isAfter(new Instant(2))); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23227);assertEquals(false, interval37.isAfter(new Instant(3))); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23228);assertEquals(false, interval37.isAfter(new Instant(4))); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23229);assertEquals(false, interval37.isAfter(new Instant(5))); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23230);assertEquals(false, interval37.isAfter(new Instant(6))); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23231);assertEquals(false, interval37.isAfter(new Instant(7))); 
     __CLR4_4_1hv8hv8le6o79r1.R.inc(23232);assertEquals(false, interval37.isAfter(new Instant(8))); 
 }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1hv8hv8le6o79r1.R.inc(23234);try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23233);
        }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23235);
            __CLR4_4_1hv8hv8le6o79r1.R.inc(23236);return ISOChronology.getInstance();
        }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23237);
            __CLR4_4_1hv8hv8le6o79r1.R.inc(23238);return TEST_TIME1;
        }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1hv8hv8le6o79r1.R.inc(23239);
            __CLR4_4_1hv8hv8le6o79r1.R.inc(23240);return TEST_TIME2;
        }finally{__CLR4_4_1hv8hv8le6o79r1.R.flushNeeded();}}
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
