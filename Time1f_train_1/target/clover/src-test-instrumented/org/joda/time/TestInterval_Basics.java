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
public class TestInterval_Basics extends TestCase {static class __CLR4_4_1jr7jr7le6qe9jo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,25873,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25603);
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25604);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25605);
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25606);return new TestSuite(TestInterval_Basics.class);
    }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}}

    public TestInterval_Basics(String name) {
        super(name);__CLR4_4_1jr7jr7le6qe9jo.R.inc(25608);try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25607);
    }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25609);
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25610);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25611);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25612);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25613);originalLocale = Locale.getDefault();
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25614);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25615);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25616);Locale.setDefault(Locale.FRANCE);
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25617);interval37 = new Interval(3, 7);
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25618);interval33 = new Interval(3, 3);
    }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25619);
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25620);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25621);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25622);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25623);Locale.setDefault(originalLocale);
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25624);originalDateTimeZone = null;
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25625);originalTimeZone = null;
        __CLR4_4_1jr7jr7le6qe9jo.R.inc(25626);originalLocale = null;
    }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToPeriod74() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jkaqdujrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod74",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jkaqdujrv(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25627); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25628);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25629);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25630);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25631);Period test = base.toPeriod(); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25632);Period expected = new Period(dt1, dt2, PeriodType.standard()); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25633);assertEquals(expected, test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testToPeriod_PeriodType176() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14awt6djs2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod_PeriodType176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14awt6djs2(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25634); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25635);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25636);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25637);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25638);Period test = base.toPeriod(null); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25639);Period expected = new Period(dt1, dt2, PeriodType.standard()); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25640);assertEquals(expected, test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithPeriodBeforeEnd1323() throws Throwable {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljmpnxjs9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd1323",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljmpnxjs9() throws Throwable{try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25641); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25642);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25643);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25644);Interval base = new Interval(dt, dt); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25645);Interval test = base.withPeriodBeforeEnd(dur); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25646);assertEquals(new Interval(dur, dt), test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testToInterval1328() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjgyo1jsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToInterval1328",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjgyo1jsf(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25647); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25648);Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25649);Interval result = test.toInterval(); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25650);assertSame(test, result); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testOverlap_RInterval_null329() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9ztywjsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval_null329",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9ztywjsj(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25651); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25652);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25653);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25654);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25655);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25656);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25657);assertEquals(new Interval(4, 4), interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25658);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25659);assertEquals(new Interval(6, 6), interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25660);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25661);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25662);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25663);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25664);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25665);assertEquals(null, interval33.overlap((ReadableInterval) null)); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testGap_RInterval_zone330() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mkkbmgjsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_zone330",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mkkbmgjsy(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25666); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25667);Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25668);assertEquals(ISOChronology.getInstance(LONDON), testA.getChronology()); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25669);Interval testB = new Interval(new DateTime(1, MOSCOW), new DateTime(2, MOSCOW)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25670);assertEquals(ISOChronology.getInstance(MOSCOW), testB.getChronology()); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25671);Interval resultAB = testA.gap(testB); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25672);assertEquals(ISOChronology.getInstance(LONDON), resultAB.getChronology()); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25673);Interval resultBA = testB.gap(testA); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25674);assertEquals(ISOChronology.getInstance(MOSCOW), resultBA.getChronology()); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testGap_RInterval_null331() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v4tzn2jt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_null331",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v4tzn2jt7(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25675); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25676);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25677);assertEquals(new Interval(2, 3), interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25678);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25679);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25680);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25681);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25682);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25683);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25684);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25685);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25686);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25687);assertEquals(new Interval(7, 8), interval37.gap((ReadableInterval) null)); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testAbuts_RInterval332() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxp7q8jtk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval332",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxp7q8jtk(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25688); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25689);assertEquals(false, interval37.abuts(new Interval(1, 2))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25690);assertEquals(false, interval37.abuts(new Interval(2, 2))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25691);assertEquals(true, interval37.abuts(new Interval(2, 3))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25692);assertEquals(true, interval37.abuts(new Interval(3, 3))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25693);assertEquals(false, interval37.abuts(new Interval(2, 4))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25694);assertEquals(false, interval37.abuts(new Interval(3, 4))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25695);assertEquals(false, interval37.abuts(new Interval(4, 4))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25696);assertEquals(false, interval37.abuts(new Interval(2, 6))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25697);assertEquals(false, interval37.abuts(new Interval(3, 6))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25698);assertEquals(false, interval37.abuts(new Interval(4, 6))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25699);assertEquals(false, interval37.abuts(new Interval(5, 6))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25700);assertEquals(false, interval37.abuts(new Interval(6, 6))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25701);assertEquals(false, interval37.abuts(new Interval(2, 7))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25702);assertEquals(false, interval37.abuts(new Interval(3, 7))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25703);assertEquals(false, interval37.abuts(new Interval(4, 7))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25704);assertEquals(false, interval37.abuts(new Interval(5, 7))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25705);assertEquals(false, interval37.abuts(new Interval(6, 7))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25706);assertEquals(true, interval37.abuts(new Interval(7, 7))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25707);assertEquals(false, interval37.abuts(new Interval(2, 8))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25708);assertEquals(false, interval37.abuts(new Interval(3, 8))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25709);assertEquals(false, interval37.abuts(new Interval(4, 8))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25710);assertEquals(false, interval37.abuts(new Interval(5, 8))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25711);assertEquals(false, interval37.abuts(new Interval(6, 8))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25712);assertEquals(true, interval37.abuts(new Interval(7, 8))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25713);assertEquals(false, interval37.abuts(new Interval(8, 8))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25714);assertEquals(false, interval37.abuts(new Interval(8, 9))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25715);assertEquals(false, interval37.abuts(new Interval(9, 9))); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testAbuts_RInterval_null333() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eiul9pjuc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval_null333",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eiul9pjuc(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25716); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25717);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25718);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25719);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25720);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25721);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25722);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25723);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25724);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25725);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25726);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25727);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25728);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithChronology3334() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x15cuwjup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology3334",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x15cuwjup(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25729); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25730);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25731);Interval test = base.withChronology(COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25732);assertSame(base, test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithChronology2335() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfgofujut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology2335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfgofujut(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25733); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25734);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25735);Interval test = base.withChronology(null); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25736);assertEquals(new Interval(TEST_TIME1, TEST_TIME2, ISOChronology.getInstance()), test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithStartMillis_long2336() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152639mjux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long2336",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152639mjux(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25737); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25738);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25739);try { 
         __CLR4_4_1jr7jr7le6qe9jo.R.inc(25740);test.withStartMillis(TEST_TIME2 + 1); 
         __CLR4_4_1jr7jr7le6qe9jo.R.inc(25741);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithStartMillis_long3337() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131iiqejv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long3337",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131iiqejv2(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25742); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25743);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25744);Interval test = base.withStartMillis(TEST_TIME1); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25745);assertSame(base, test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithStartInstant_RI2338() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_155g0ukjv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartInstant_RI2338",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_155g0ukjv6(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25746); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25747);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25748);try { 
         __CLR4_4_1jr7jr7le6qe9jo.R.inc(25749);test.withStart(new Instant(TEST_TIME2 + 1)); 
         __CLR4_4_1jr7jr7le6qe9jo.R.inc(25750);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithEndInstant_RI3339() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p7vdc5jvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndInstant_RI3339",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p7vdc5jvb(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25751); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25752);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25753);Interval test = base.withEnd(null); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25754);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithEndMillis_long3340() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pru705jvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndMillis_long3340",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pru705jvf(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25755); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25756);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25757);Interval test = base.withEndMillis(TEST_TIME2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25758);assertSame(base, test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithDurationAfterStart2341() throws Throwable {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1omk1zdjvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart2341",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1omk1zdjvj() throws Throwable{try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25759); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25760);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25761);Interval test = base.withDurationAfterStart(null); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25762);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithDurationAfterStart4342() throws Throwable {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bo6srujvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart4342",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bo6srujvn() throws Throwable{try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25763); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25764);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25765);Interval test = base.withDurationAfterStart(base.toDuration()); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25766);assertSame(base, test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithDurationBeforeEnd1343() throws Throwable {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ypzviwjvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd1343",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ypzviwjvr() throws Throwable{try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25767); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25768);Duration dur = new Duration(TEST_TIME_NOW - TEST_TIME1); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25769);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25770);Interval test = base.withDurationBeforeEnd(dur); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25771);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithPeriodAfterStart2344() throws Throwable {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fx95ljvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart2344",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fx95ljvw() throws Throwable{try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25772); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25773);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25774);Interval test = base.withPeriodAfterStart(null); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25775);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testWithPeriodBeforeEnd2345() throws Throwable {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lax1kcjw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd2345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lax1kcjw0() throws Throwable{try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25776); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25777);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25778);Interval test = base.withPeriodBeforeEnd(null); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25779);assertEquals(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testToPeriod_PeriodType2761() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hz05gtjw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod_PeriodType2761",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hz05gtjw4(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25780); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25781);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25782);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25783);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25784);Period test = base.toPeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25785);Period expected = new Period(dt1, dt2, PeriodType.yearWeekDayTime()); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25786);assertEquals(expected, test); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testContains_RI_null1164() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jvcg0qjwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_null1164",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jvcg0qjwb(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25787); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25788);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25789);assertEquals(false, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25790);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25791);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25792);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25793);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25794);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25795);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25796);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25797);assertEquals(false, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25798);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25799);assertEquals(false, interval37.contains((ReadableInstant) null)); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testContains_RInterval_zeroDuration1165() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sdx8bsjwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RInterval_zeroDuration1165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sdx8bsjwo(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25800); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25801);assertEquals(false, interval33.contains(interval33)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25802);assertEquals(false, interval33.contains(interval37)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25803);assertEquals(true, interval37.contains(interval33)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25804);assertEquals(false, interval33.contains(new Interval(1, 2))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25805);assertEquals(false, interval33.contains(new Interval(8, 9))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25806);assertEquals(false, interval33.contains(new Interval(1, 9))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25807);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25808);assertEquals(false, interval33.contains((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25809);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25810);assertEquals(false, interval33.contains((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25811);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25812);assertEquals(false, interval33.contains((ReadableInterval) null)); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testIsBefore_RInterval_null1168() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y4z2osjx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RInterval_null1168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y4z2osjx1(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25813); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25814);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25815);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25816);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25817);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25818);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25819);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25820);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25821);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25822);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25823);assertEquals(true, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25824);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25825);assertEquals(true, interval37.isBefore((ReadableInterval) null)); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testIsAfter_RI_null1170() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1354kvkjxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI_null1170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1354kvkjxe(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25826); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25827);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25828);assertEquals(true, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25829);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25830);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25831);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25832);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25833);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25834);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25835);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25836);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25837);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25838);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testIsAfter_RInterval_null1171() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4pjhtjxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RInterval_null1171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4pjhtjxr(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25839); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25840);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25841);assertEquals(true, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25842);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25843);assertEquals(true, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25844);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25845);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25846);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25847);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25848);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25849);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25850);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25851);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testGetDuration21173() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19p274tjy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGetDuration21173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19p274tjy4(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25852); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25853);Interval test = new Interval(TEST_TIME1, TEST_TIME1); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25854);assertSame(Duration.ZERO, test.toDuration()); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 


public void testEqualsHashCodeStrict1174() {__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceStart(getClass().getName(),25855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tkef89jy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr7jr7le6qe9jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr7jr7le6qe9jo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testEqualsHashCodeStrict1174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tkef89jy7(){try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25855); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25856);Interval test1 = new Interval(new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)), new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25857);Interval test2 = new Interval(new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)), new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS))); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25858);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25859);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25860);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25861);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25862);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25863);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1jr7jr7le6qe9jo.R.inc(25864);assertEquals(true, test2.hashCode() == test2.hashCode()); 
 }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1jr7jr7le6qe9jo.R.inc(25866);try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25865);
        }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25867);
            __CLR4_4_1jr7jr7le6qe9jo.R.inc(25868);return ISOChronology.getInstance();
        }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25869);
            __CLR4_4_1jr7jr7le6qe9jo.R.inc(25870);return TEST_TIME1;
        }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1jr7jr7le6qe9jo.R.inc(25871);
            __CLR4_4_1jr7jr7le6qe9jo.R.inc(25872);return TEST_TIME2;
        }finally{__CLR4_4_1jr7jr7le6qe9jo.R.flushNeeded();}}
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
