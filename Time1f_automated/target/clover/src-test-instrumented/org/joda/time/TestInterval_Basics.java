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
public class TestInterval_Basics extends TestCase {static class __CLR4_4_1hh2hh2lccietm8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,22696,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1hh2hh2lccietm8.R.inc(22646);
        __CLR4_4_1hh2hh2lccietm8.R.inc(22647);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hh2hh2lccietm8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hh2hh2lccietm8.R.inc(22648);
        __CLR4_4_1hh2hh2lccietm8.R.inc(22649);return new TestSuite(TestInterval_Basics.class);
    }finally{__CLR4_4_1hh2hh2lccietm8.R.flushNeeded();}}

    public TestInterval_Basics(String name) {
        super(name);__CLR4_4_1hh2hh2lccietm8.R.inc(22651);try{__CLR4_4_1hh2hh2lccietm8.R.inc(22650);
    }finally{__CLR4_4_1hh2hh2lccietm8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hh2hh2lccietm8.R.inc(22652);
        __CLR4_4_1hh2hh2lccietm8.R.inc(22653);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hh2hh2lccietm8.R.inc(22654);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hh2hh2lccietm8.R.inc(22655);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hh2hh2lccietm8.R.inc(22656);originalLocale = Locale.getDefault();
        __CLR4_4_1hh2hh2lccietm8.R.inc(22657);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1hh2hh2lccietm8.R.inc(22658);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1hh2hh2lccietm8.R.inc(22659);Locale.setDefault(Locale.FRANCE);
        __CLR4_4_1hh2hh2lccietm8.R.inc(22660);interval37 = new Interval(3, 7);
        __CLR4_4_1hh2hh2lccietm8.R.inc(22661);interval33 = new Interval(3, 3);
    }finally{__CLR4_4_1hh2hh2lccietm8.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hh2hh2lccietm8.R.inc(22662);
        __CLR4_4_1hh2hh2lccietm8.R.inc(22663);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hh2hh2lccietm8.R.inc(22664);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hh2hh2lccietm8.R.inc(22665);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hh2hh2lccietm8.R.inc(22666);Locale.setDefault(originalLocale);
        __CLR4_4_1hh2hh2lccietm8.R.inc(22667);originalDateTimeZone = null;
        __CLR4_4_1hh2hh2lccietm8.R.inc(22668);originalTimeZone = null;
        __CLR4_4_1hh2hh2lccietm8.R.inc(22669);originalLocale = null;
    }finally{__CLR4_4_1hh2hh2lccietm8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithDurationBeforeEnd15() throws Throwable {__CLR4_4_1hh2hh2lccietm8.R.globalSliceStart(getClass().getName(),22670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u29khxhhq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hh2hh2lccietm8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hh2hh2lccietm8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u29khxhhq() throws Throwable{try{__CLR4_4_1hh2hh2lccietm8.R.inc(22670); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22671);Duration dur = new Duration(TEST_TIME_NOW - TEST_TIME1); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22672);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22673);Interval test = base.withDurationBeforeEnd(dur); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22674);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test); 
 }finally{__CLR4_4_1hh2hh2lccietm8.R.flushNeeded();}}
public void testAbuts_RInterval_null37() {__CLR4_4_1hh2hh2lccietm8.R.globalSliceStart(getClass().getName(),22675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e9vtcohhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hh2hh2lccietm8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hh2hh2lccietm8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval_null37",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e9vtcohhv(){try{__CLR4_4_1hh2hh2lccietm8.R.inc(22675); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22676);DateTimeUtils.setCurrentMillisFixed(2); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22677);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22678);DateTimeUtils.setCurrentMillisFixed(3); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22679);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22680);DateTimeUtils.setCurrentMillisFixed(4); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22681);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22682);DateTimeUtils.setCurrentMillisFixed(6); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22683);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22684);DateTimeUtils.setCurrentMillisFixed(7); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22685);assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22686);DateTimeUtils.setCurrentMillisFixed(8); 
     __CLR4_4_1hh2hh2lccietm8.R.inc(22687);assertEquals(false, interval37.abuts((ReadableInterval) null)); 
 }finally{__CLR4_4_1hh2hh2lccietm8.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1hh2hh2lccietm8.R.inc(22689);try{__CLR4_4_1hh2hh2lccietm8.R.inc(22688);
        }finally{__CLR4_4_1hh2hh2lccietm8.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1hh2hh2lccietm8.R.inc(22690);
            __CLR4_4_1hh2hh2lccietm8.R.inc(22691);return ISOChronology.getInstance();
        }finally{__CLR4_4_1hh2hh2lccietm8.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1hh2hh2lccietm8.R.inc(22692);
            __CLR4_4_1hh2hh2lccietm8.R.inc(22693);return TEST_TIME1;
        }finally{__CLR4_4_1hh2hh2lccietm8.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1hh2hh2lccietm8.R.inc(22694);
            __CLR4_4_1hh2hh2lccietm8.R.inc(22695);return TEST_TIME2;
        }finally{__CLR4_4_1hh2hh2lccietm8.R.flushNeeded();}}
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
