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
public class TestInterval_Basics extends TestCase {static class __CLR4_4_1jrojrole6rckxg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,25887,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jrojrole6rckxg.R.inc(25620);
        __CLR4_4_1jrojrole6rckxg.R.inc(25621);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jrojrole6rckxg.R.inc(25622);
        __CLR4_4_1jrojrole6rckxg.R.inc(25623);return new TestSuite(TestInterval_Basics.class);
    }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}}

    public TestInterval_Basics(String name) {
        super(name);__CLR4_4_1jrojrole6rckxg.R.inc(25625);try{__CLR4_4_1jrojrole6rckxg.R.inc(25624);
    }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jrojrole6rckxg.R.inc(25626);
        __CLR4_4_1jrojrole6rckxg.R.inc(25627);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jrojrole6rckxg.R.inc(25628);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jrojrole6rckxg.R.inc(25629);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jrojrole6rckxg.R.inc(25630);originalLocale = Locale.getDefault();
        __CLR4_4_1jrojrole6rckxg.R.inc(25631);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1jrojrole6rckxg.R.inc(25632);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1jrojrole6rckxg.R.inc(25633);Locale.setDefault(Locale.FRANCE);
        __CLR4_4_1jrojrole6rckxg.R.inc(25634);interval37 = new Interval(3, 7);
        __CLR4_4_1jrojrole6rckxg.R.inc(25635);interval33 = new Interval(3, 3);
    }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jrojrole6rckxg.R.inc(25636);
        __CLR4_4_1jrojrole6rckxg.R.inc(25637);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jrojrole6rckxg.R.inc(25638);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jrojrole6rckxg.R.inc(25639);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jrojrole6rckxg.R.inc(25640);Locale.setDefault(originalLocale);
        __CLR4_4_1jrojrole6rckxg.R.inc(25641);originalDateTimeZone = null;
        __CLR4_4_1jrojrole6rckxg.R.inc(25642);originalTimeZone = null;
        __CLR4_4_1jrojrole6rckxg.R.inc(25643);originalLocale = null;
    }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToPeriod68() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ufp07jsc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod68",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ufp07jsc(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25644); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25645);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25646);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25647);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25648);Period test = base.toPeriod(); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25649);Period expected = new Period(dt1, dt2, PeriodType.standard()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25650);assertEquals(expected, test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testToPeriod_PeriodType171() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kjwn4qjsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod_PeriodType171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kjwn4qjsj(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25651); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25652);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25653);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25654);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25655);Period test = base.toPeriod(null); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25656);Period expected = new Period(dt1, dt2, PeriodType.standard()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25657);assertEquals(expected, test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithPeriodBeforeEnd1332() throws Throwable {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0mek5jsq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd1332",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0mek5jsq() throws Throwable{try{__CLR4_4_1jrojrole6rckxg.R.inc(25658); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25659);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25660);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25661);Interval base = new Interval(dt, dt); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25662);Interval test = base.withPeriodBeforeEnd(dur); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25663);assertEquals(new Interval(dur, dt), test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testToInterval1338() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19rs6rkjsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToInterval1338",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19rs6rkjsw(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25664); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25665);Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25666);Interval result = test.toInterval(); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25667);assertSame(test, result); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testGap_RInterval_zone339() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ofdhtjt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_zone339",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ofdhtjt0(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25668); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25669);Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25670);assertEquals(ISOChronology.getInstance(LONDON), testA.getChronology()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25671);Interval testB = new Interval(new DateTime(1, MOSCOW), new DateTime(2, MOSCOW)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25672);assertEquals(ISOChronology.getInstance(MOSCOW), testB.getChronology()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25673);Interval resultAB = testA.gap(testB); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25674);assertEquals(ISOChronology.getInstance(LONDON), resultAB.getChronology()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25675);Interval resultBA = testB.gap(testA); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25676);assertEquals(ISOChronology.getInstance(MOSCOW), resultBA.getChronology()); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testGap_RInterval_null340() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dff4l0jt9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_null340",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dff4l0jt9(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25677); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25678);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25679);assertEquals(new Interval(2, 3), interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25680);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25681);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25682);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25683);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25684);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25685);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25686);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25687);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25688);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25689);assertEquals(new Interval(7, 8), interval37.gap((ReadableInterval) null)); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testAbuts_RInterval341() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmjwhujtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval341",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmjwhujtm(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25690); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25691);assertEquals(false, interval37.abuts(new Interval(1, 2))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25692);assertEquals(false, interval37.abuts(new Interval(2, 2))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25693);assertEquals(true, interval37.abuts(new Interval(2, 3))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25694);assertEquals(true, interval37.abuts(new Interval(3, 3))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25695);assertEquals(false, interval37.abuts(new Interval(2, 4))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25696);assertEquals(false, interval37.abuts(new Interval(3, 4))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25697);assertEquals(false, interval37.abuts(new Interval(4, 4))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25698);assertEquals(false, interval37.abuts(new Interval(2, 6))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25699);assertEquals(false, interval37.abuts(new Interval(3, 6))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25700);assertEquals(false, interval37.abuts(new Interval(4, 6))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25701);assertEquals(false, interval37.abuts(new Interval(5, 6))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25702);assertEquals(false, interval37.abuts(new Interval(6, 6))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25703);assertEquals(false, interval37.abuts(new Interval(2, 7))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25704);assertEquals(false, interval37.abuts(new Interval(3, 7))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25705);assertEquals(false, interval37.abuts(new Interval(4, 7))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25706);assertEquals(false, interval37.abuts(new Interval(5, 7))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25707);assertEquals(false, interval37.abuts(new Interval(6, 7))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25708);assertEquals(true, interval37.abuts(new Interval(7, 7))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25709);assertEquals(false, interval37.abuts(new Interval(2, 8))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25710);assertEquals(false, interval37.abuts(new Interval(3, 8))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25711);assertEquals(false, interval37.abuts(new Interval(4, 8))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25712);assertEquals(false, interval37.abuts(new Interval(5, 8))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25713);assertEquals(false, interval37.abuts(new Interval(6, 8))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25714);assertEquals(true, interval37.abuts(new Interval(7, 8))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25715);assertEquals(false, interval37.abuts(new Interval(8, 8))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25716);assertEquals(false, interval37.abuts(new Interval(8, 9))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25717);assertEquals(false, interval37.abuts(new Interval(9, 9))); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testAbuts_RInterval_null342() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1eiydjue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval_null342",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1eiydjue(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25718); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25719);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25720);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25721);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25722);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25723);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25724);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25725);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25726);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25727);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25728);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25729);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25730);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithChronology2343() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gdsekpjur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology2343",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gdsekpjur(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25731); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25732);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25733);Interval test = base.withChronology(null); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25734);assertEquals(new Interval(TEST_TIME1, TEST_TIME2, ISOChronology.getInstance()), test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithStartMillis_long2344() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5ovozjuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long2344",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5ovozjuv(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25735); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25736);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25737);try { 
         __CLR4_4_1jrojrole6rckxg.R.inc(25738);test.withStartMillis(TEST_TIME2 + 1); 
         __CLR4_4_1jrojrole6rckxg.R.inc(25739);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithStartMillis_long3345() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9dhozjv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long3345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9dhozjv0(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25740); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25741);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25742);Interval test = base.withStartMillis(TEST_TIME1); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25743);assertSame(base, test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithStartInstant_RI2346() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sdazt5jv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartInstant_RI2346",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sdazt5jv4(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25744); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25745);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25746);try { 
         __CLR4_4_1jrojrole6rckxg.R.inc(25747);test.withStart(new Instant(TEST_TIME2 + 1)); 
         __CLR4_4_1jrojrole6rckxg.R.inc(25748);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithEndMillis_long3347() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mia3fojv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndMillis_long3347",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mia3fojv9(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25749); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25750);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25751);Interval test = base.withEndMillis(TEST_TIME2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25752);assertSame(base, test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithDurationAfterStart2348() throws Throwable {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vkag2jvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart2348",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vkag2jvd() throws Throwable{try{__CLR4_4_1jrojrole6rckxg.R.inc(25753); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25754);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25755);Interval test = base.withDurationAfterStart(null); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25756);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithDurationAfterStart4349() throws Throwable {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b2syrhjvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart4349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b2syrhjvh() throws Throwable{try{__CLR4_4_1jrojrole6rckxg.R.inc(25757); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25758);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25759);Interval test = base.withDurationAfterStart(base.toDuration()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25760);assertSame(base, test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithDurationBeforeEnd1350() throws Throwable {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gc96a4jvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd1350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gc96a4jvl() throws Throwable{try{__CLR4_4_1jrojrole6rckxg.R.inc(25761); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25762);Duration dur = new Duration(TEST_TIME_NOW - TEST_TIME1); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25763);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25764);Interval test = base.withDurationBeforeEnd(dur); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25765);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithDurationBeforeEnd4351() throws Throwable {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gsq4yjvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd4351",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gsq4yjvq() throws Throwable{try{__CLR4_4_1jrojrole6rckxg.R.inc(25766); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25767);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25768);Interval test = base.withDurationBeforeEnd(base.toDuration()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25769);assertSame(base, test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithPeriodAfterStart1352() throws Throwable {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gx92lhjvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart1352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gx92lhjvu() throws Throwable{try{__CLR4_4_1jrojrole6rckxg.R.inc(25770); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25771);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25772);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25773);Interval base = new Interval(dt, dt); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25774);Interval test = base.withPeriodAfterStart(dur); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25775);assertEquals(new Interval(dt, dur), test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithPeriodAfterStart2353() throws Throwable {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p0xolhjw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart2353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p0xolhjw0() throws Throwable{try{__CLR4_4_1jrojrole6rckxg.R.inc(25776); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25777);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25778);Interval test = base.withPeriodAfterStart(null); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25779);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testWithPeriodBeforeEnd2354() throws Throwable {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9c2nqjw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd2354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9c2nqjw4() throws Throwable{try{__CLR4_4_1jrojrole6rckxg.R.inc(25780); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25781);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25782);Interval test = base.withPeriodBeforeEnd(null); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25783);assertEquals(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testContains_RI_null1153() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6wqmejw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_null1153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6wqmejw8(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25784); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25785);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25786);assertEquals(false, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25787);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25788);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25789);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25790);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25791);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25792);assertEquals(true, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25793);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25794);assertEquals(false, interval37.contains((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25795);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25796);assertEquals(false, interval37.contains((ReadableInstant) null)); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testContains_RI_zeroDuration1154() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fs3ty4jwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_zeroDuration1154",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fs3ty4jwl(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25797); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25798);assertEquals(false, interval33.contains(new Instant(2))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25799);assertEquals(false, interval33.contains(new Instant(3))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25800);assertEquals(false, interval33.contains(new Instant(4))); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testIsEqual_RI1156() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drq796jwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsEqual_RI1156",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drq796jwp(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25801); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25802);assertEquals(false, interval37.isEqual(interval33)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25803);assertEquals(true, interval37.isEqual(interval37)); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testIsBefore_RI_null1157() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qryc6sjws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RI_null1157",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qryc6sjws(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25804); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25805);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25806);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25807);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25808);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25809);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25810);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25811);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25812);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25813);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25814);assertEquals(true, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25815);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25816);assertEquals(true, interval37.isBefore((ReadableInstant) null)); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testIsBefore_RInterval_null1159() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17o44xqjx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RInterval_null1159",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17o44xqjx5(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25817); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25818);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25819);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25820);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25821);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25822);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25823);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25824);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25825);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25826);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25827);assertEquals(true, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25828);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25829);assertEquals(true, interval37.isBefore((ReadableInterval) null)); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testIsAfterNow1161() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ebt908jxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfterNow1161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ebt908jxi(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25830); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25831);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25832);assertEquals(true, interval37.isAfterNow()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25833);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25834);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25835);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25836);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25837);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25838);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25839);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25840);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25841);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25842);assertEquals(false, interval37.isAfterNow()); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testIsAfter_RI1162() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bnbh5jxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI1162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bnbh5jxv(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25843); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25844);assertEquals(true, interval37.isAfter(new Instant(2))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25845);assertEquals(false, interval37.isAfter(new Instant(3))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25846);assertEquals(false, interval37.isAfter(new Instant(4))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25847);assertEquals(false, interval37.isAfter(new Instant(5))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25848);assertEquals(false, interval37.isAfter(new Instant(6))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25849);assertEquals(false, interval37.isAfter(new Instant(7))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25850);assertEquals(false, interval37.isAfter(new Instant(8))); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testIsAfter_RI_null1163() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3zl1ojy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI_null1163",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3zl1ojy3(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25851); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25852);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25853);assertEquals(true, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25854);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25855);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25856);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25857);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25858);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25859);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25860);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25861);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25862);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25863);assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testEqualsHashCodeStrict1167() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ljf25jyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testEqualsHashCodeStrict1167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ljf25jyg(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25864); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25865);Interval test1 = new Interval(new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)), new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25866);Interval test2 = new Interval(new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)), new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS))); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25867);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25868);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25869);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25870);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25871);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25872);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25873);assertEquals(true, test2.hashCode() == test2.hashCode()); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 


public void testToString1168() {__CLR4_4_1jrojrole6rckxg.R.globalSliceStart(getClass().getName(),25874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q3i2pzjyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jrojrole6rckxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jrojrole6rckxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToString1168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q3i2pzjyq(){try{__CLR4_4_1jrojrole6rckxg.R.inc(25874); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25875);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.UTC); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25876);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.UTC); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25877);Interval test = new Interval(dt1, dt2); 
     __CLR4_4_1jrojrole6rckxg.R.inc(25878);assertEquals("2004-06-09T07:08:09.010Z/2005-08-13T12:14:16.018Z", test.toString()); 
 }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1jrojrole6rckxg.R.inc(25880);try{__CLR4_4_1jrojrole6rckxg.R.inc(25879);
        }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1jrojrole6rckxg.R.inc(25881);
            __CLR4_4_1jrojrole6rckxg.R.inc(25882);return ISOChronology.getInstance();
        }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1jrojrole6rckxg.R.inc(25883);
            __CLR4_4_1jrojrole6rckxg.R.inc(25884);return TEST_TIME1;
        }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1jrojrole6rckxg.R.inc(25885);
            __CLR4_4_1jrojrole6rckxg.R.inc(25886);return TEST_TIME2;
        }finally{__CLR4_4_1jrojrole6rckxg.R.flushNeeded();}}
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
