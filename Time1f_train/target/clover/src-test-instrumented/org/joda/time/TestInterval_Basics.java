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
public class TestInterval_Basics extends TestCase {static class __CLR4_4_1kadkadlc8axdwi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,26587,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1kadkadlc8axdwi.R.inc(26293);
        __CLR4_4_1kadkadlc8axdwi.R.inc(26294);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kadkadlc8axdwi.R.inc(26295);
        __CLR4_4_1kadkadlc8axdwi.R.inc(26296);return new TestSuite(TestInterval_Basics.class);
    }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}}

    public TestInterval_Basics(String name) {
        super(name);__CLR4_4_1kadkadlc8axdwi.R.inc(26298);try{__CLR4_4_1kadkadlc8axdwi.R.inc(26297);
    }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kadkadlc8axdwi.R.inc(26299);
        __CLR4_4_1kadkadlc8axdwi.R.inc(26300);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kadkadlc8axdwi.R.inc(26301);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1kadkadlc8axdwi.R.inc(26302);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1kadkadlc8axdwi.R.inc(26303);originalLocale = Locale.getDefault();
        __CLR4_4_1kadkadlc8axdwi.R.inc(26304);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1kadkadlc8axdwi.R.inc(26305);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1kadkadlc8axdwi.R.inc(26306);Locale.setDefault(Locale.FRANCE);
        __CLR4_4_1kadkadlc8axdwi.R.inc(26307);interval37 = new Interval(3, 7);
        __CLR4_4_1kadkadlc8axdwi.R.inc(26308);interval33 = new Interval(3, 3);
    }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kadkadlc8axdwi.R.inc(26309);
        __CLR4_4_1kadkadlc8axdwi.R.inc(26310);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kadkadlc8axdwi.R.inc(26311);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1kadkadlc8axdwi.R.inc(26312);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1kadkadlc8axdwi.R.inc(26313);Locale.setDefault(originalLocale);
        __CLR4_4_1kadkadlc8axdwi.R.inc(26314);originalDateTimeZone = null;
        __CLR4_4_1kadkadlc8axdwi.R.inc(26315);originalTimeZone = null;
        __CLR4_4_1kadkadlc8axdwi.R.inc(26316);originalLocale = null;
    }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testContains_RInterval_zeroDuration84() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuy9nvkb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RInterval_zeroDuration84",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuy9nvkb1(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26317); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26318);assertEquals(false, interval33.contains(interval33)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26319);assertEquals(false, interval33.contains(interval37)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26320);assertEquals(true, interval37.contains(interval33)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26321);assertEquals(false, interval33.contains(new Interval(1, 2))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26322);assertEquals(false, interval33.contains(new Interval(8, 9))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26323);assertEquals(false, interval33.contains(new Interval(1, 9))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26324);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26325);assertEquals(false, interval33.contains((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26326);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26327);assertEquals(false, interval33.contains((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26328);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26329);assertEquals(false, interval33.contains((ReadableInterval) null)); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithPeriodBeforeEnd1168() throws Throwable {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivjfkckbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd1168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivjfkckbe() throws Throwable{try{__CLR4_4_1kadkadlc8axdwi.R.inc(26330); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26331);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26332);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26333);Interval base = new Interval(dt, dt); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26334);Interval test = base.withPeriodBeforeEnd(dur); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26335);assertEquals(new Interval(dur, dt), test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithDurationAfterStart2224() throws Throwable {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115b7utkbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart2224",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115b7utkbk() throws Throwable{try{__CLR4_4_1kadkadlc8axdwi.R.inc(26336); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26337);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26338);Interval test = base.withDurationAfterStart(null); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26339);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithDurationAfterStart4227() throws Throwable {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ib1yxokbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart4227",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ib1yxokbo() throws Throwable{try{__CLR4_4_1kadkadlc8axdwi.R.inc(26340); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26341);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26342);Interval test = base.withDurationAfterStart(base.toDuration()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26343);assertSame(base, test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testEqualsHashCodeStrict255() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147941wkbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testEqualsHashCodeStrict255",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147941wkbs(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26344); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26345);Interval test1 = new Interval(new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)), new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26346);Interval test2 = new Interval(new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)), new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26347);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26348);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26349);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26350);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26351);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26352);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26353);assertEquals(true, test2.hashCode() == test2.hashCode()); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithEndInstant_RI3357() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174h6v5kc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndInstant_RI3357",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174h6v5kc2(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26354); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26355);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26356);Interval test = base.withEnd(null); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26357);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testIsBefore_RI_null365() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xapwfikc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RI_null365",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xapwfikc6(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26358); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26359);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26360);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26361);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26362);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26363);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26364);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26365);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26366);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26367);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26368);assertEquals(true, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26369);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26370);assertEquals(true, interval37.isBefore((ReadableInstant) null)); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testToString565() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghi34tkcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToString565",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghi34tkcj(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26371); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26372);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.UTC); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26373);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.UTC); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26374);Interval test = new Interval(dt1, dt2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26375);assertEquals("2004-06-09T07:08:09.010Z/2005-08-13T12:14:16.018Z", test.toString()); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithChronology3605() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1br4lenkco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology3605",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1br4lenkco(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26376); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26377);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26378);Interval test = base.withChronology(COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26379);assertSame(base, test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testOverlap_RInterval_null652() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wb30fzkcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval_null652",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wb30fzkcs(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26380); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26381);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26382);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26383);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26384);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26385);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26386);assertEquals(new Interval(4, 4), interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26387);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26388);assertEquals(new Interval(6, 6), interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26389);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26390);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26391);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26392);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26393);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26394);assertEquals(null, interval33.overlap((ReadableInterval) null)); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testAbuts_RInterval_null686() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oecttakd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval_null686",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oecttakd7(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26395); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26396);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26397);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26398);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26399);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26400);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26401);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26402);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26403);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26404);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26405);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26406);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26407);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testContains_RI_null720() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18lb9hkdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_null720",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18lb9hkdk(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26408); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26409);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26410);assertEquals(false, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26411);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26412);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26413);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26414);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26415);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26416);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26417);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26418);assertEquals(false, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26419);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26420);assertEquals(false, interval37.contains((ReadableInstant) null)); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithPeriodAfterStart1760() throws Throwable {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlpa3qkdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart1760",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlpa3qkdx() throws Throwable{try{__CLR4_4_1kadkadlc8axdwi.R.inc(26421); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26422);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26423);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26424);Interval base = new Interval(dt, dt); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26425);Interval test = base.withPeriodAfterStart(dur); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26426);assertEquals(new Interval(dt, dur), test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithStartInstant_RI2762() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14rhvp5ke3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartInstant_RI2762",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14rhvp5ke3(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26427); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26428);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26429);try { 
         __CLR4_4_1kadkadlc8axdwi.R.inc(26430);test.withStart(new Instant(TEST_TIME2 + 1)); 
         __CLR4_4_1kadkadlc8axdwi.R.inc(26431);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithChronology2768() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9lkyqke8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology2768",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9lkyqke8(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26432); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26433);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26434);Interval test = base.withChronology(null); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26435);assertEquals(new Interval(TEST_TIME1, TEST_TIME2, ISOChronology.getInstance()), test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testGap_RInterval_zone893() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cr3fqikec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_zone893",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cr3fqikec(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26436); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26437);Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26438);assertEquals(ISOChronology.getInstance(LONDON), testA.getChronology()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26439);Interval testB = new Interval(new DateTime(1, MOSCOW), new DateTime(2, MOSCOW)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26440);assertEquals(ISOChronology.getInstance(MOSCOW), testB.getChronology()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26441);Interval resultAB = testA.gap(testB); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26442);assertEquals(ISOChronology.getInstance(LONDON), resultAB.getChronology()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26443);Interval resultBA = testB.gap(testA); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26444);assertEquals(ISOChronology.getInstance(MOSCOW), resultBA.getChronology()); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithDurationBeforeEnd1934() throws Throwable {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14jz7eokel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd1934",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14jz7eokel() throws Throwable{try{__CLR4_4_1kadkadlc8axdwi.R.inc(26445); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26446);Duration dur = new Duration(TEST_TIME_NOW - TEST_TIME1); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26447);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26448);Interval test = base.withDurationBeforeEnd(dur); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26449);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithEndMillis_long3942() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgpzelkeq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndMillis_long3942",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgpzelkeq(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26450); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26451);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26452);Interval test = base.withEndMillis(TEST_TIME2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26453);assertSame(base, test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testIsBefore_RInterval_null987() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1amw4nokeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RInterval_null987",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1amw4nokeu(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26454); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26455);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26456);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26457);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26458);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26459);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26460);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26461);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26462);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26463);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26464);assertEquals(true, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26465);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26466);assertEquals(true, interval37.isBefore((ReadableInterval) null)); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithPeriodBeforeEnd2995() throws Throwable {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0vb59kf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd2995",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0vb59kf7() throws Throwable{try{__CLR4_4_1kadkadlc8axdwi.R.inc(26467); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26468);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26469);Interval test = base.withPeriodBeforeEnd(null); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26470);assertEquals(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testToInterval11080() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6thdpkfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToInterval11080",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6thdpkfb(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26471); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26472);Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26473);Interval result = test.toInterval(); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26474);assertSame(test, result); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testIsAfter_RInterval_null1112() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wh5yukff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RInterval_null1112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wh5yukff(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26475); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26476);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26477);assertEquals(true, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26478);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26479);assertEquals(true, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26480);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26481);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26482);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26483);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26484);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26485);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26486);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26487);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testIsAfterNow1139() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m7cbojkfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfterNow1139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m7cbojkfs(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26488); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26489);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26490);assertEquals(true, interval37.isAfterNow()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26491);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26492);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26493);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26494);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26495);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26496);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26497);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26498);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26499);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26500);assertEquals(false, interval37.isAfterNow()); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testToPeriod_PeriodType11146() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ct9uoikg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod_PeriodType11146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ct9uoikg5(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26501); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26502);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26503);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26504);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26505);Period test = base.toPeriod(null); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26506);Period expected = new Period(dt1, dt2, PeriodType.standard()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26507);assertEquals(expected, test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithStartMillis_long21235() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c1g6ghkgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long21235",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c1g6ghkgc(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26508); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26509);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26510);try { 
         __CLR4_4_1kadkadlc8axdwi.R.inc(26511);test.withStartMillis(TEST_TIME2 + 1); 
         __CLR4_4_1kadkadlc8axdwi.R.inc(26512);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testContains_RI_zeroDuration1299() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16pgh9akgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_zeroDuration1299",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16pgh9akgh(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26513); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26514);assertEquals(false, interval33.contains(new Instant(2))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26515);assertEquals(false, interval33.contains(new Instant(3))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26516);assertEquals(false, interval33.contains(new Instant(4))); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testGap_RInterval_null1428() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k4s65ikgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_null1428",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k4s65ikgl(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26517); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26518);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26519);assertEquals(new Interval(2, 3), interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26520);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26521);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26522);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26523);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26524);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26525);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26526);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26527);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26528);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26529);assertEquals(new Interval(7, 8), interval37.gap((ReadableInterval) null)); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testIsEqual_RI1434() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2vyjbkgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsEqual_RI1434",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2vyjbkgy(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26530); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26531);assertEquals(false, interval37.isEqual(interval33)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26532);assertEquals(true, interval37.isEqual(interval37)); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testIsAfter_RI1495() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nsjswskh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI1495",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nsjswskh1(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26533); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26534);assertEquals(true, interval37.isAfter(new Instant(2))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26535);assertEquals(false, interval37.isAfter(new Instant(3))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26536);assertEquals(false, interval37.isAfter(new Instant(4))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26537);assertEquals(false, interval37.isAfter(new Instant(5))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26538);assertEquals(false, interval37.isAfter(new Instant(6))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26539);assertEquals(false, interval37.isAfter(new Instant(7))); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26540);assertEquals(false, interval37.isAfter(new Instant(8))); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testGetDuration21535() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uufv1jkh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGetDuration21535",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uufv1jkh9(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26541); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26542);Interval test = new Interval(TEST_TIME1, TEST_TIME1); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26543);assertSame(Duration.ZERO, test.toDuration()); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithPeriodAfterStart21537() throws Throwable {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r89p26khc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart21537",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r89p26khc() throws Throwable{try{__CLR4_4_1kadkadlc8axdwi.R.inc(26544); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26545);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26546);Interval test = base.withPeriodAfterStart(null); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26547);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testToPeriod1584() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ux2t1khg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod1584",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ux2t1khg(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26548); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26549);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26550);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26551);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26552);Period test = base.toPeriod(); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26553);Period expected = new Period(dt1, dt2, PeriodType.standard()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26554);assertEquals(expected, test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testToPeriod_PeriodType21707() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196ec8qkhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod_PeriodType21707",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196ec8qkhn(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26555); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26556);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26557);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26558);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26559);Period test = base.toPeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26560);Period expected = new Period(dt1, dt2, PeriodType.yearWeekDayTime()); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26561);assertEquals(expected, test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testWithStartMillis_long31751() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev7idrkhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long31751",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev7idrkhu(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26562); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26563);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26564);Interval test = base.withStartMillis(TEST_TIME1); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26565);assertSame(base, test); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 


public void testIsAfter_RI_null1765() {__CLR4_4_1kadkadlc8axdwi.R.globalSliceStart(getClass().getName(),26566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tf3sn8khy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kadkadlc8axdwi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kadkadlc8axdwi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI_null1765",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tf3sn8khy(){try{__CLR4_4_1kadkadlc8axdwi.R.inc(26566); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26567);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26568);assertEquals(true, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26569);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26570);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26571);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26572);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26573);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26574);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26575);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26576);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26577);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1kadkadlc8axdwi.R.inc(26578);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
 }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1kadkadlc8axdwi.R.inc(26580);try{__CLR4_4_1kadkadlc8axdwi.R.inc(26579);
        }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1kadkadlc8axdwi.R.inc(26581);
            __CLR4_4_1kadkadlc8axdwi.R.inc(26582);return ISOChronology.getInstance();
        }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1kadkadlc8axdwi.R.inc(26583);
            __CLR4_4_1kadkadlc8axdwi.R.inc(26584);return TEST_TIME1;
        }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1kadkadlc8axdwi.R.inc(26585);
            __CLR4_4_1kadkadlc8axdwi.R.inc(26586);return TEST_TIME2;
        }finally{__CLR4_4_1kadkadlc8axdwi.R.flushNeeded();}}
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
