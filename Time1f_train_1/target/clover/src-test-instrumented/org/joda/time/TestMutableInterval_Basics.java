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
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Basics extends TestCase {static class __CLR4_4_1mgvmgvle6qe9vt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,29202,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    
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

    public static void main(String[] args) {try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29119);
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29120);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29121);
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29122);return new TestSuite(TestMutableInterval_Basics.class);
    }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}}

    public TestMutableInterval_Basics(String name) {
        super(name);__CLR4_4_1mgvmgvle6qe9vt.R.inc(29124);try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29123);
    }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29125);
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29126);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29127);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29128);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29129);originalLocale = Locale.getDefault();
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29130);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29131);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29132);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29133);
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29134);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29135);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29136);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29137);Locale.setDefault(originalLocale);
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29138);originalDateTimeZone = null;
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29139);originalTimeZone = null;
        __CLR4_4_1mgvmgvle6qe9vt.R.inc(29140);originalLocale = null;
    }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testOverlaps_RInterval1166() {__CLR4_4_1mgvmgvle6qe9vt.R.globalSliceStart(getClass().getName(),29141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gdnfj1mhh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgvmgvle6qe9vt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgvmgvle6qe9vt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testOverlaps_RInterval1166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gdnfj1mhh(){try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29141); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29142);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29143);assertEquals(false, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29144);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29145);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1 + 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29146);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29147);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29148);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29149);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29150);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29151);assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29152);assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29153);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2 + 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29154);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29155);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 + 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29156);assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2 + 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29157);assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2 + 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29158);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 - 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29159);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29160);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29161);assertEquals(true, test.overlaps((ReadableInterval) null)); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29162);MutableInterval empty = new MutableInterval(TEST_TIME1, TEST_TIME1); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29163);assertEquals(false, empty.overlaps(empty)); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29164);assertEquals(false, empty.overlaps(test)); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29165);assertEquals(false, test.overlaps(empty)); 
 }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}} 


public void testIsBefore_RI1167() {__CLR4_4_1mgvmgvle6qe9vt.R.globalSliceStart(getClass().getName(),29166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ag55ibmi6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgvmgvle6qe9vt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgvmgvle6qe9vt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_RI1167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ag55ibmi6(){try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29166); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29167);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29168);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 - 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29169);assertEquals(false, test.isBefore(new Instant(TEST_TIME1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29170);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 + 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29171);assertEquals(false, test.isBefore(new Instant(TEST_TIME2 - 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29172);assertEquals(true, test.isBefore(new Instant(TEST_TIME2))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29173);assertEquals(true, test.isBefore(new Instant(TEST_TIME2 + 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29174);assertEquals(false, test.isBefore((ReadableInstant) null)); 
 }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}} 


public void testIsBefore_RInterval1169() {__CLR4_4_1mgvmgvle6qe9vt.R.globalSliceStart(getClass().getName(),29175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iw4h0jmif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgvmgvle6qe9vt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgvmgvle6qe9vt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_RInterval1169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iw4h0jmif(){try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29175); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29176);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29177);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29178);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29179);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29180);assertEquals(false, test.isBefore(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29181);assertEquals(true, test.isBefore(new Interval(TEST_TIME2, Long.MAX_VALUE))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29182);assertEquals(true, test.isBefore(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE))); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29183);assertEquals(false, test.isBefore((ReadableInterval) null)); 
 }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}} 


public void testToMutableInterval11172() {__CLR4_4_1mgvmgvle6qe9vt.R.globalSliceStart(getClass().getName(),29184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l4hzfvmio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgvmgvle6qe9vt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgvmgvle6qe9vt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToMutableInterval11172",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l4hzfvmio(){try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29184); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29185);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29186);MutableInterval result = test.toMutableInterval(); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29187);assertEquals(test, result); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29188);assertNotSame(test, result); 
 }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}} 


public void testCopy1430() {__CLR4_4_1mgvmgvle6qe9vt.R.globalSliceStart(getClass().getName(),29189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12b00mqmit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mgvmgvle6qe9vt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mgvmgvle6qe9vt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testCopy1430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12b00mqmit(){try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29189); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29190);MutableInterval test = new MutableInterval(123L, 456L, COPTIC_PARIS); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29191);MutableInterval cloned = test.copy(); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29192);assertEquals(test, cloned); 
     __CLR4_4_1mgvmgvle6qe9vt.R.inc(29193);assertNotSame(test, cloned); 
 }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1mgvmgvle6qe9vt.R.inc(29195);try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29194);
        }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29196);
            __CLR4_4_1mgvmgvle6qe9vt.R.inc(29197);return ISOChronology.getInstance();
        }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29198);
            __CLR4_4_1mgvmgvle6qe9vt.R.inc(29199);return TEST_TIME1;
        }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1mgvmgvle6qe9vt.R.inc(29200);
            __CLR4_4_1mgvmgvle6qe9vt.R.inc(29201);return TEST_TIME2;
        }finally{__CLR4_4_1mgvmgvle6qe9vt.R.flushNeeded();}}
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
    
    


}
