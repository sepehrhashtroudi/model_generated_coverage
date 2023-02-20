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
public class TestInterval_Basics extends TestCase {static class __CLR4_4_1hwrhwrle6np4f0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,23318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23211);
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23212);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23213);
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23214);return new TestSuite(TestInterval_Basics.class);
    }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}

    public TestInterval_Basics(String name) {
        super(name);__CLR4_4_1hwrhwrle6np4f0.R.inc(23216);try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23215);
    }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23217);
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23218);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23219);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23220);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23221);originalLocale = Locale.getDefault();
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23222);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23223);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23224);Locale.setDefault(Locale.FRANCE);
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23225);interval37 = new Interval(3, 7);
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23226);interval33 = new Interval(3, 3);
    }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23227);
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23228);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23229);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23230);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23231);Locale.setDefault(originalLocale);
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23232);originalDateTimeZone = null;
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23233);originalTimeZone = null;
        __CLR4_4_1hwrhwrle6np4f0.R.inc(23234);originalLocale = null;
    }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testOverlap_RInterval_null125() {__CLR4_4_1hwrhwrle6np4f0.R.globalSliceStart(getClass().getName(),23235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u0abemhxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwrhwrle6np4f0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwrhwrle6np4f0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval_null125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u0abemhxf(){try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23235); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23236);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23237);assertEquals(new Interval(2, 3), interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23238);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23239);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23240);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23241);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23242);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23243);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23244);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23245);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23246);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23247);assertEquals(new Interval(7, 8), interval37.overlap((ReadableInterval) null)); 
 }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
public void testWithChronology2126() {__CLR4_4_1hwrhwrle6np4f0.R.globalSliceStart(getClass().getName(),23248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198b4eyhxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwrhwrle6np4f0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwrhwrle6np4f0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology2126",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198b4eyhxs(){try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23248); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23249);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23250);Interval test = base.withChronology(null); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23251);assertEquals(new Interval(TEST_TIME1, TEST_TIME2, ISOChronology.getInstance()), test); 
 }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
public void testWithChronology2127() {__CLR4_4_1hwrhwrle6np4f0.R.globalSliceStart(getClass().getName(),23252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1chb37fhxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwrhwrle6np4f0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwrhwrle6np4f0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology2127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1chb37fhxw(){try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23252); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23253);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23254);Interval test = base.withChronology(null); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23255);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, ISOChronology.getInstance()), test); 
 }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
public void testWithChronology2128() {__CLR4_4_1hwrhwrle6np4f0.R.globalSliceStart(getClass().getName(),23256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqb1zwhy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwrhwrle6np4f0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwrhwrle6np4f0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology2128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqb1zwhy0(){try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23256); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23257);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23258);Interval test = base.withChronology(null); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23259);assertSame(base, test); 
 }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
public void testWithEndMillis_long3129() {__CLR4_4_1hwrhwrle6np4f0.R.globalSliceStart(getClass().getName(),23260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_156j8ihy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwrhwrle6np4f0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwrhwrle6np4f0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndMillis_long3129",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_156j8ihy4(){try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23260); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23261);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23262);Interval test = base.withEndMillis(TEST_TIME2); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23263);assertSame(base, test); 
 }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
public void testWithEndMillis_long3130() {__CLR4_4_1hwrhwrle6np4f0.R.globalSliceStart(getClass().getName(),23264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1boo6shy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwrhwrle6np4f0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwrhwrle6np4f0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndMillis_long3130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1boo6shy8(){try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23264); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23265);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23266);Interval test = base.withEndMillis(TEST_TIME2); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23267);assertSame(base, test); 
 }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
public void testWithEndInstant_RI3131() {__CLR4_4_1hwrhwrle6np4f0.R.globalSliceStart(getClass().getName(),23268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13hl0qjhyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwrhwrle6np4f0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwrhwrle6np4f0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndInstant_RI3131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13hl0qjhyc(){try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23268); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23269);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23270);Interval test = base.withEnd(null); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23271);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
public void testContains_RInterval_null493() {__CLR4_4_1hwrhwrle6np4f0.R.globalSliceStart(getClass().getName(),23272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17myyqwhyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwrhwrle6np4f0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwrhwrle6np4f0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RInterval_null493",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17myyqwhyg(){try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23272); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23273);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23274);assertEquals(false, interval37.contains((ReadableInterval) null)); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23275);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23276);assertEquals(true, interval37.contains((ReadableInterval) null)); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23277);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23278);assertEquals(true, interval37.contains((ReadableInterval) null)); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23279);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23280);assertEquals(true, interval37.contains((ReadableInterval) null)); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23281);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23282);assertEquals(false, interval37.contains((ReadableInterval) null)); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23283);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23284);assertEquals(false, interval37.contains((ReadableInterval) null)); 
 }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
public void testContains_RInterval495() {__CLR4_4_1hwrhwrle6np4f0.R.globalSliceStart(getClass().getName(),23285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yl1yoehyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwrhwrle6np4f0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwrhwrle6np4f0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RInterval495",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yl1yoehyt(){try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23285); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23286);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23287);assertEquals(false, test.contains(new Interval(TEST_TIME1, TEST_TIME1))); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23288);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME1))); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23289);assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME1 + 1))); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23290);assertEquals(true, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23291);assertEquals(true, test.contains(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1))); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23292);assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME2))); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23293);assertEquals(true, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME2))); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23294);assertEquals(true, test.contains(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2))); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23295);assertEquals(false, test.contains((ReadableInterval) null)); 
 }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
public void testConstructor_RD_RI_PeriodType1498() throws Throwable {__CLR4_4_1hwrhwrle6np4f0.R.globalSliceStart(getClass().getName(),23296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1awzk5mhz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hwrhwrle6np4f0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hwrhwrle6np4f0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testConstructor_RD_RI_PeriodType1498",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1awzk5mhz4() throws Throwable{try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23296); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23297);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23298);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23299);Duration dur = new Interval(dt1, dt2).toDuration(); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23300);Period test = new Period(dur, dt2, PeriodType.yearDayTime()); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23301);assertEquals(PeriodType.yearDayTime(), test.getPeriodType()); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23302);assertEquals(1, test.getYears()); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23303);assertEquals(0, test.getMonths()); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23304);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23305);assertEquals(31, test.getDays()); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23306);assertEquals(1, test.getHours()); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23307);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23308);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1hwrhwrle6np4f0.R.inc(23309);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1hwrhwrle6np4f0.R.inc(23311);try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23310);
        }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23312);
            __CLR4_4_1hwrhwrle6np4f0.R.inc(23313);return ISOChronology.getInstance();
        }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23314);
            __CLR4_4_1hwrhwrle6np4f0.R.inc(23315);return TEST_TIME1;
        }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1hwrhwrle6np4f0.R.inc(23316);
            __CLR4_4_1hwrhwrle6np4f0.R.inc(23317);return TEST_TIME2;
        }finally{__CLR4_4_1hwrhwrle6np4f0.R.flushNeeded();}}
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
