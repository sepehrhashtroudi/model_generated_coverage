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
public class TestInterval_Basics extends TestCase {static class __CLR4_4_1js3js3le6rjcfs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,25921,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1js3js3le6rjcfs.R.inc(25635);
        __CLR4_4_1js3js3le6rjcfs.R.inc(25636);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1js3js3le6rjcfs.R.inc(25637);
        __CLR4_4_1js3js3le6rjcfs.R.inc(25638);return new TestSuite(TestInterval_Basics.class);
    }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}}

    public TestInterval_Basics(String name) {
        super(name);__CLR4_4_1js3js3le6rjcfs.R.inc(25640);try{__CLR4_4_1js3js3le6rjcfs.R.inc(25639);
    }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1js3js3le6rjcfs.R.inc(25641);
        __CLR4_4_1js3js3le6rjcfs.R.inc(25642);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1js3js3le6rjcfs.R.inc(25643);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1js3js3le6rjcfs.R.inc(25644);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1js3js3le6rjcfs.R.inc(25645);originalLocale = Locale.getDefault();
        __CLR4_4_1js3js3le6rjcfs.R.inc(25646);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1js3js3le6rjcfs.R.inc(25647);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1js3js3le6rjcfs.R.inc(25648);Locale.setDefault(Locale.FRANCE);
        __CLR4_4_1js3js3le6rjcfs.R.inc(25649);interval37 = new Interval(3, 7);
        __CLR4_4_1js3js3le6rjcfs.R.inc(25650);interval33 = new Interval(3, 3);
    }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1js3js3le6rjcfs.R.inc(25651);
        __CLR4_4_1js3js3le6rjcfs.R.inc(25652);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1js3js3le6rjcfs.R.inc(25653);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1js3js3le6rjcfs.R.inc(25654);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1js3js3le6rjcfs.R.inc(25655);Locale.setDefault(originalLocale);
        __CLR4_4_1js3js3le6rjcfs.R.inc(25656);originalDateTimeZone = null;
        __CLR4_4_1js3js3le6rjcfs.R.inc(25657);originalTimeZone = null;
        __CLR4_4_1js3js3le6rjcfs.R.inc(25658);originalLocale = null;
    }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToPeriod74() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jkaqdujsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod74",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jkaqdujsr(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25659); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25660);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25661);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25662);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25663);Period test = base.toPeriod(); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25664);Period expected = new Period(dt1, dt2, PeriodType.standard()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25665);assertEquals(expected, test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testToPeriod_PeriodType176() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14awt6djsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod_PeriodType176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14awt6djsy(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25666); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25667);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25668);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25669);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25670);Period test = base.toPeriod(null); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25671);Period expected = new Period(dt1, dt2, PeriodType.standard()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25672);assertEquals(expected, test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testOverlap_RInterval_null332() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eb4oyojt5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval_null332",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eb4oyojt5(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25673); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25674);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25675);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25676);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25677);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25678);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25679);assertEquals(new Interval(4, 4), interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25680);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25681);assertEquals(new Interval(6, 6), interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25682);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25683);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25684);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25685);assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25686);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25687);assertEquals(null, interval33.overlap((ReadableInterval) null)); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testGap_RInterval_zone333() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ctkf91jtk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_zone333",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ctkf91jtk(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25688); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25689);Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25690);assertEquals(ISOChronology.getInstance(LONDON), testA.getChronology()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25691);Interval testB = new Interval(new DateTime(1, MOSCOW), new DateTime(2, MOSCOW)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25692);assertEquals(ISOChronology.getInstance(MOSCOW), testB.getChronology()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25693);Interval resultAB = testA.gap(testB); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25694);assertEquals(ISOChronology.getInstance(LONDON), resultAB.getChronology()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25695);Interval resultBA = testB.gap(testA); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25696);assertEquals(ISOChronology.getInstance(MOSCOW), resultBA.getChronology()); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testGap_RInterval_null334() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5a5ynjtt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_null334",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5a5ynjtt(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25697); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25698);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25699);assertEquals(new Interval(2, 3), interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25700);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25701);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25702);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25703);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25704);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25705);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25706);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25707);assertEquals(null, interval37.gap((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25708);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25709);assertEquals(new Interval(7, 8), interval37.gap((ReadableInterval) null)); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testAbuts_RInterval335() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wop43nju6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wop43nju6(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25710); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25711);assertEquals(false, interval37.abuts(new Interval(1, 2))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25712);assertEquals(false, interval37.abuts(new Interval(2, 2))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25713);assertEquals(true, interval37.abuts(new Interval(2, 3))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25714);assertEquals(true, interval37.abuts(new Interval(3, 3))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25715);assertEquals(false, interval37.abuts(new Interval(2, 4))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25716);assertEquals(false, interval37.abuts(new Interval(3, 4))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25717);assertEquals(false, interval37.abuts(new Interval(4, 4))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25718);assertEquals(false, interval37.abuts(new Interval(2, 6))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25719);assertEquals(false, interval37.abuts(new Interval(3, 6))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25720);assertEquals(false, interval37.abuts(new Interval(4, 6))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25721);assertEquals(false, interval37.abuts(new Interval(5, 6))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25722);assertEquals(false, interval37.abuts(new Interval(6, 6))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25723);assertEquals(false, interval37.abuts(new Interval(2, 7))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25724);assertEquals(false, interval37.abuts(new Interval(3, 7))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25725);assertEquals(false, interval37.abuts(new Interval(4, 7))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25726);assertEquals(false, interval37.abuts(new Interval(5, 7))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25727);assertEquals(false, interval37.abuts(new Interval(6, 7))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25728);assertEquals(true, interval37.abuts(new Interval(7, 7))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25729);assertEquals(false, interval37.abuts(new Interval(2, 8))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25730);assertEquals(false, interval37.abuts(new Interval(3, 8))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25731);assertEquals(false, interval37.abuts(new Interval(4, 8))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25732);assertEquals(false, interval37.abuts(new Interval(5, 8))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25733);assertEquals(false, interval37.abuts(new Interval(6, 8))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25734);assertEquals(true, interval37.abuts(new Interval(7, 8))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25735);assertEquals(false, interval37.abuts(new Interval(8, 8))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25736);assertEquals(false, interval37.abuts(new Interval(8, 9))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25737);assertEquals(false, interval37.abuts(new Interval(9, 9))); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testAbuts_RInterval_null336() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9uhn4juy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval_null336",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9uhn4juy(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25738); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25739);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25740);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25741);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25742);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25743);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25744);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25745);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25746);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25747);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25748);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25749);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25750);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithChronology3337() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s8ysqtjvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology3337",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s8ysqtjvb(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25751); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25752);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25753);Interval test = base.withChronology(COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25754);assertSame(base, test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithChronology2338() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tunh5vjvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology2338",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tunh5vjvf(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25755); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25756);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25757);Interval test = base.withChronology(null); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25758);assertEquals(new Interval(TEST_TIME1, TEST_TIME2, ISOChronology.getInstance()), test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithStartMillis_long2339() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ott3tjvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long2339",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ott3tjvj(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25759); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25760);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25761);try { 
         __CLR4_4_1js3js3le6rjcfs.R.inc(25762);test.withStartMillis(TEST_TIME2 + 1); 
         __CLR4_4_1js3js3le6rjcfs.R.inc(25763);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithStartMillis_long3340() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0dnqmjvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long3340",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0dnqmjvo(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25764); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25765);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25766);Interval test = base.withStartMillis(TEST_TIME1); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25767);assertSame(base, test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithStartInstant_RI2341() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4b5usjvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartInstant_RI2341",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4b5usjvs(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25768); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25769);Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25770);try { 
         __CLR4_4_1js3js3le6rjcfs.R.inc(25771);test.withStart(new Instant(TEST_TIME2 + 1)); 
         __CLR4_4_1js3js3le6rjcfs.R.inc(25772);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithEndInstant_RI3342() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w6qicdjvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndInstant_RI3342",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w6qicdjvx(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25773); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25774);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25775);Interval test = base.withEnd(null); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25776);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithDurationAfterStart2343() throws Throwable {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4k4efjw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart2343",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4k4efjw1() throws Throwable{try{__CLR4_4_1js3js3le6rjcfs.R.inc(25777); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25778);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25779);Interval test = base.withDurationAfterStart(null); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25780);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithDurationAfterStart4344() throws Throwable {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1566v6wjw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart4344",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1566v6wjw5() throws Throwable{try{__CLR4_4_1js3js3le6rjcfs.R.inc(25781); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25782);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25783);Interval test = base.withDurationAfterStart(base.toDuration()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25784);assertSame(base, test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithDurationBeforeEnd1345() throws Throwable {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tt48vajw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd1345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tt48vajw9() throws Throwable{try{__CLR4_4_1js3js3le6rjcfs.R.inc(25785); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25786);Duration dur = new Duration(TEST_TIME_NOW - TEST_TIME1); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25787);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25788);Interval test = base.withDurationBeforeEnd(dur); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25789);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithDurationBeforeEnd4346() throws Throwable {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c02cg8jwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd4346",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c02cg8jwe() throws Throwable{try{__CLR4_4_1js3js3le6rjcfs.R.inc(25790); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25791);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25792);Interval test = base.withDurationBeforeEnd(base.toDuration()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25793);assertSame(base, test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithPeriodAfterStart1347() throws Throwable {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ge00bjwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart1347",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ge00bjwi() throws Throwable{try{__CLR4_4_1js3js3le6rjcfs.R.inc(25794); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25795);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25796);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25797);Interval base = new Interval(dt, dt); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25798);Interval test = base.withPeriodAfterStart(dur); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25799);assertEquals(new Interval(dt, dur), test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithPeriodAfterStart2348() throws Throwable {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bk2m0bjwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart2348",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bk2m0bjwo() throws Throwable{try{__CLR4_4_1js3js3le6rjcfs.R.inc(25800); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25801);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25802);Interval test = base.withPeriodAfterStart(null); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25803);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testWithPeriodBeforeEnd2349() throws Throwable {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yawwq8jws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd2349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yawwq8jws() throws Throwable{try{__CLR4_4_1js3js3le6rjcfs.R.inc(25804); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25805);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25806);Interval test = base.withPeriodBeforeEnd(null); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25807);assertEquals(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testToPeriod_PeriodType2781() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tkeecvjww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod_PeriodType2781",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tkeecvjww(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25808); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25809);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25810);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25811);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25812);Period test = base.toPeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25813);Period expected = new Period(dt1, dt2, PeriodType.yearWeekDayTime()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25814);assertEquals(expected, test); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testContains_RI_zeroDuration1172() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12baciwjx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_zeroDuration1172",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12baciwjx3(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25815); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25816);assertEquals(false, interval33.contains(new Instant(2))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25817);assertEquals(false, interval33.contains(new Instant(3))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25818);assertEquals(false, interval33.contains(new Instant(4))); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testContains_RInterval_zeroDuration1173() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15629d7jx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RInterval_zeroDuration1173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15629d7jx7(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25819); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25820);assertEquals(false, interval33.contains(interval33)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25821);assertEquals(false, interval33.contains(interval37)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25822);assertEquals(true, interval37.contains(interval33)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25823);assertEquals(false, interval33.contains(new Interval(1, 2))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25824);assertEquals(false, interval33.contains(new Interval(8, 9))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25825);assertEquals(false, interval33.contains(new Interval(1, 9))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25826);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25827);assertEquals(false, interval33.contains((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25828);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25829);assertEquals(false, interval33.contains((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25830);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25831);assertEquals(false, interval33.contains((ReadableInterval) null)); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testIsEqual_RI1175() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sm4expjxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsEqual_RI1175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sm4expjxk(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25832); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25833);assertEquals(false, interval37.isEqual(interval33)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25834);assertEquals(true, interval37.isEqual(interval37)); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testIsBefore_RI_null1176() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxk4i9jxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RI_null1176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxk4i9jxn(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25835); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25836);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25837);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25838);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25839);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25840);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25841);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25842);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25843);assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25844);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25845);assertEquals(true, interval37.isBefore((ReadableInstant) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25846);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25847);assertEquals(true, interval37.isBefore((ReadableInstant) null)); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testIsBefore_RInterval_null1178() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_176a2qtjy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RInterval_null1178",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_176a2qtjy0(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25848); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25849);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25850);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25851);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25852);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25853);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25854);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25855);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25856);assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25857);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25858);assertEquals(true, interval37.isBefore((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25859);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25860);assertEquals(true, interval37.isBefore((ReadableInterval) null)); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testIsAfterNow1179() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zg63ljyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfterNow1179",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zg63ljyd(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25861); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25862);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25863);assertEquals(true, interval37.isAfterNow()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25864);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25865);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25866);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25867);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25868);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25869);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25870);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25871);assertEquals(false, interval37.isAfterNow()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25872);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25873);assertEquals(false, interval37.isAfterNow()); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testIsAfter_RI1180() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1frquzvjyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI1180",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1frquzvjyq(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25874); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25875);assertEquals(true, interval37.isAfter(new Instant(2))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25876);assertEquals(false, interval37.isAfter(new Instant(3))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25877);assertEquals(false, interval37.isAfter(new Instant(4))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25878);assertEquals(false, interval37.isAfter(new Instant(5))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25879);assertEquals(false, interval37.isAfter(new Instant(6))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25880);assertEquals(false, interval37.isAfter(new Instant(7))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25881);assertEquals(false, interval37.isAfter(new Instant(8))); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testIsAfter_RInterval_null1181() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12eumyajyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RInterval_null1181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12eumyajyy(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25882); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25883);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25884);assertEquals(true, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25885);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25886);assertEquals(true, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25887);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25888);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25889);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25890);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25891);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25892);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25893);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25894);assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testGetDuration21185() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p470pujzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGetDuration21185",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p470pujzb(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25895); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25896);Interval test = new Interval(TEST_TIME1, TEST_TIME1); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25897);assertSame(Duration.ZERO, test.toDuration()); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testEqualsHashCodeStrict1186() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_158usmejze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testEqualsHashCodeStrict1186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_158usmejze(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25898); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25899);Interval test1 = new Interval(new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)), new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25900);Interval test2 = new Interval(new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)), new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS))); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25901);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25902);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25903);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25904);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25905);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25906);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25907);assertEquals(true, test2.hashCode() == test2.hashCode()); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 


public void testToString1187() {__CLR4_4_1js3js3le6rjcfs.R.globalSliceStart(getClass().getName(),25908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b93v1gjzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1js3js3le6rjcfs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1js3js3le6rjcfs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToString1187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b93v1gjzo(){try{__CLR4_4_1js3js3le6rjcfs.R.inc(25908); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25909);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.UTC); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25910);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.UTC); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25911);Interval test = new Interval(dt1, dt2); 
     __CLR4_4_1js3js3le6rjcfs.R.inc(25912);assertEquals("2004-06-09T07:08:09.010Z/2005-08-13T12:14:16.018Z", test.toString()); 
 }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1js3js3le6rjcfs.R.inc(25914);try{__CLR4_4_1js3js3le6rjcfs.R.inc(25913);
        }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1js3js3le6rjcfs.R.inc(25915);
            __CLR4_4_1js3js3le6rjcfs.R.inc(25916);return ISOChronology.getInstance();
        }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1js3js3le6rjcfs.R.inc(25917);
            __CLR4_4_1js3js3le6rjcfs.R.inc(25918);return TEST_TIME1;
        }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1js3js3le6rjcfs.R.inc(25919);
            __CLR4_4_1js3js3le6rjcfs.R.inc(25920);return TEST_TIME2;
        }finally{__CLR4_4_1js3js3le6rjcfs.R.flushNeeded();}}
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
