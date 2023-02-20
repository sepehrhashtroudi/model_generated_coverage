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
public class TestInterval_Basics extends TestCase {static class __CLR4_4_1jrcjrcle6qsew5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,25843,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25608);
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25609);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25610);
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25611);return new TestSuite(TestInterval_Basics.class);
    }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}}

    public TestInterval_Basics(String name) {
        super(name);__CLR4_4_1jrcjrcle6qsew5.R.inc(25613);try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25612);
    }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25614);
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25615);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25616);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25617);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25618);originalLocale = Locale.getDefault();
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25619);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25620);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25621);Locale.setDefault(Locale.FRANCE);
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25622);interval37 = new Interval(3, 7);
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25623);interval33 = new Interval(3, 3);
    }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25624);
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25625);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25626);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25627);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25628);Locale.setDefault(originalLocale);
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25629);originalDateTimeZone = null;
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25630);originalTimeZone = null;
        __CLR4_4_1jrcjrcle6qsew5.R.inc(25631);originalLocale = null;
    }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testWithPeriodBeforeEnd1300() throws Throwable {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ne126kjs0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd1300",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ne126kjs0() throws Throwable{try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25632); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25633);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25634);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25635);Interval base = new Interval(dt, dt); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25636);Interval test = base.withPeriodBeforeEnd(dur); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25637);assertEquals(new Interval(dur, dt), test); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testToInterval1305() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xdvb6ojs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToInterval1305",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xdvb6ojs6(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25638); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25639);Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25640);Interval result = test.toInterval(); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25641);assertSame(test, result); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testOverlap_RInterval_null306() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jflhg9jsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval_null306",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jflhg9jsa(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25642); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25643);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25644);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25645);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25646);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25647);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25648);assertEquals(new Interval(4, 4), interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25649);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25650);assertEquals(new Interval(6, 6), interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25651);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25652);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25653);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25654);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25655);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25656);assertEquals(null, interval33.overlap((ReadableInterval) null)); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testGap_RInterval_zone307() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hy17qmjsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_zone307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hy17qmjsp(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25657); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25658);Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25659);assertEquals(ISOChronology.getInstance(LONDON), testA.getChronology()); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25660);Interval testB = new Interval(new DateTime(1, MOSCOW), new DateTime(2, MOSCOW)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25661);assertEquals(ISOChronology.getInstance(MOSCOW), testB.getChronology()); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25662);Interval resultAB = testA.gap(testB); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25663);assertEquals(ISOChronology.getInstance(LONDON), resultAB.getChronology()); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25664);Interval resultBA = testB.gap(testA); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25665);assertEquals(ISOChronology.getInstance(MOSCOW), resultBA.getChronology()); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testAbuts_RInterval_null308() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cndrkljsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval_null308",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cndrkljsy(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25666); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25667);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25668);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25669);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25670);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25671);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25672);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25673);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25674);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25675);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25676);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25677);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25678);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testWithChronology3309() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v5oj5sjtb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology3309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v5oj5sjtb(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25679); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25680);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25681);Interval test = base.withChronology(COPTIC_PARIS); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25682);assertSame(base, test); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testWithChronology2310() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrv3djjtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology2310",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrv3djjtf(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25683); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25684);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25685);Interval test = base.withChronology(null); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25686);assertEquals(new Interval(TEST_TIME1, TEST_TIME2, ISOChronology.getInstance()), test); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testWithStartMillis_long2311() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19probxjtj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long2311",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19probxjtj(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25687); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25688);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25689);try { 
         __CLR4_4_1jrcjrcle6qsew5.R.inc(25690);test.withStartMillis(TEST_TIME2 + 1); 
         __CLR4_4_1jrcjrcle6qsew5.R.inc(25691);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testWithStartMillis_long3312() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11m32bxjto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long3312",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11m32bxjto(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25692); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25693);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25694);Interval test = base.withStartMillis(TEST_TIME1); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25695);assertSame(base, test); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testWithStartInstant_RI2313() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hufs9jts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartInstant_RI2313",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hufs9jts(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25696); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25697);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25698);try { 
         __CLR4_4_1jrcjrcle6qsew5.R.inc(25699);test.withStart(new Instant(TEST_TIME2 + 1)); 
         __CLR4_4_1jrcjrcle6qsew5.R.inc(25700);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testWithEndInstant_RI3314() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kk9s9ujtx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndInstant_RI3314",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kk9s9ujtx(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25701); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25702);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25703);Interval test = base.withEnd(null); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25704);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testWithEndMillis_long3315() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwddb1ju1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndMillis_long3315",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwddb1ju1(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25705); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25706);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25707);Interval test = base.withEndMillis(TEST_TIME2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25708);assertSame(base, test); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testWithDurationAfterStart4316() throws Throwable {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gsnl9fju5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart4316",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gsnl9fju5() throws Throwable{try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25709); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25710);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25711);Interval test = base.withDurationAfterStart(base.toDuration()); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25712);assertSame(base, test); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testWithDurationBeforeEnd4317() throws Throwable {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qvj1b8ju9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd4317",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qvj1b8ju9() throws Throwable{try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25713); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25714);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25715);Interval test = base.withDurationBeforeEnd(base.toDuration()); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25716);assertSame(base, test); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testWithPeriodAfterStart1318() throws Throwable {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bf2oupjud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart1318",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bf2oupjud() throws Throwable{try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25717); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25718);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25719);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25720);Interval base = new Interval(dt, dt); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25721);Interval test = base.withPeriodAfterStart(dur); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25722);assertEquals(new Interval(dt, dur), test); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testWithPeriodBeforeEnd2319() throws Throwable {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6g92rjuj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd2319",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6g92rjuj() throws Throwable{try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25723); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25724);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25725);Interval test = base.withPeriodBeforeEnd(null); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25726);assertEquals(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testToPeriod_PeriodType2748() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gdduykjun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod_PeriodType2748",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gdduykjun(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25727); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25728);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25729);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25730);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25731);Period test = base.toPeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25732);Period expected = new Period(dt1, dt2, PeriodType.yearWeekDayTime()); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25733);assertEquals(expected, test); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testContains_RI_null1151() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bowt1gjuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_null1151",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bowt1gjuu(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25734); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25735);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25736);assertEquals(false, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25737);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25738);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25739);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25740);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25741);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25742);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25743);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25744);assertEquals(false, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25745);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25746);assertEquals(false, interval37.contains((ReadableInstant) null)); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testContains_RI_zeroDuration1152() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19a3wd6jv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_zeroDuration1152",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19a3wd6jv7(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25747); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25748);assertEquals(false, interval33.contains(new Instant(2))); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25749);assertEquals(false, interval33.contains(new Instant(3))); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25750);assertEquals(false, interval33.contains(new Instant(4))); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testContains_RInterval_zeroDuration1153() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16fbzivjvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RInterval_zeroDuration1153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16fbzivjvb(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25751); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25752);assertEquals(false, interval33.contains(interval33)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25753);assertEquals(false, interval33.contains(interval37)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25754);assertEquals(true, interval37.contains(interval33)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25755);assertEquals(false, interval33.contains(new Interval(1, 2))); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25756);assertEquals(false, interval33.contains(new Interval(8, 9))); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25757);assertEquals(false, interval33.contains(new Interval(1, 9))); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25758);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25759);assertEquals(false, interval33.contains((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25760);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25761);assertEquals(false, interval33.contains((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25762);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25763);assertEquals(false, interval33.contains((ReadableInterval) null)); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testIsEqual_RI1155() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h0q61njvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsEqual_RI1155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h0q61njvo(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25764); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25765);assertEquals(false, interval37.isEqual(interval33)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25766);assertEquals(true, interval37.isEqual(interval37)); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testIsBefore_RI_null1156() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1niydebjvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RI_null1156",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1niydebjvr(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25767); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25768);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25769);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25770);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25771);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25772);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25773);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25774);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25775);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25776);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25777);assertEquals(true, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25778);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25779);assertEquals(true, interval37.isBefore((ReadableInstant) null)); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testIsAfterNow1159() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aly2shjw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfterNow1159",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aly2shjw4(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25780); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25781);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25782);assertEquals(true, interval37.isAfterNow()); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25783);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25784);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25785);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25786);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25787);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25788);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25789);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25790);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25791);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25792);assertEquals(false, interval37.isAfterNow()); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testIsAfter_RI1160() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146cm3tjwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI1160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146cm3tjwh(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25793); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25794);assertEquals(true, interval37.isAfter(new Instant(2))); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25795);assertEquals(false, interval37.isAfter(new Instant(3))); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25796);assertEquals(false, interval37.isAfter(new Instant(4))); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25797);assertEquals(false, interval37.isAfter(new Instant(5))); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25798);assertEquals(false, interval37.isAfter(new Instant(6))); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25799);assertEquals(false, interval37.isAfter(new Instant(7))); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25800);assertEquals(false, interval37.isAfter(new Instant(8))); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testIsAfter_RI_null1161() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlzimmjwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI_null1161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlzimmjwp(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25801); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25802);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25803);assertEquals(true, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25804);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25805);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25806);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25807);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25808);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25809);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25810);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25811);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25812);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25813);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testIsAfter_RInterval_null1162() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfjkq9jx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RInterval_null1162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfjkq9jx2(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25814); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25815);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25816);assertEquals(true, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25817);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25818);assertEquals(true, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25819);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25820);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25821);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25822);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25823);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25824);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25825);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25826);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testGetDuration21166() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9st1bjxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGetDuration21166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9st1bjxf(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25827); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25828);Interval test = new Interval(TEST_TIME1, TEST_TIME1); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25829);assertSame(Duration.ZERO, test.toDuration()); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 


public void testToString1167() {__CLR4_4_1jrcjrcle6qsew5.R.globalSliceStart(getClass().getName(),25830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mui3xijxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrcjrcle6qsew5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrcjrcle6qsew5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToString1167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mui3xijxi(){try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25830); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25831);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.UTC); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25832);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.UTC); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25833);Interval test = new Interval(dt1, dt2); 
     __CLR4_4_1jrcjrcle6qsew5.R.inc(25834);assertEquals("2004-06-09T07:08:09.010Z/2005-08-13T12:14:16.018Z", test.toString()); 
 }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1jrcjrcle6qsew5.R.inc(25836);try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25835);
        }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25837);
            __CLR4_4_1jrcjrcle6qsew5.R.inc(25838);return ISOChronology.getInstance();
        }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25839);
            __CLR4_4_1jrcjrcle6qsew5.R.inc(25840);return TEST_TIME1;
        }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1jrcjrcle6qsew5.R.inc(25841);
            __CLR4_4_1jrcjrcle6qsew5.R.inc(25842);return TEST_TIME2;
        }finally{__CLR4_4_1jrcjrcle6qsew5.R.flushNeeded();}}
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
