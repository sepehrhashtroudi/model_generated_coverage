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
public class TestMutableInterval_Basics extends TestCase {static class __CLR4_4_1mhrmhrle6rjcsj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,29271,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29151);
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29152);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29153);
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29154);return new TestSuite(TestMutableInterval_Basics.class);
    }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}}

    public TestMutableInterval_Basics(String name) {
        super(name);__CLR4_4_1mhrmhrle6rjcsj.R.inc(29156);try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29155);
    }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29157);
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29158);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29159);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29160);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29161);originalLocale = Locale.getDefault();
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29162);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29163);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29164);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29165);
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29166);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29167);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29168);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29169);Locale.setDefault(originalLocale);
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29170);originalDateTimeZone = null;
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29171);originalTimeZone = null;
        __CLR4_4_1mhrmhrle6rjcsj.R.inc(29172);originalLocale = null;
    }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testEqualsHashCode125() {__CLR4_4_1mhrmhrle6rjcsj.R.globalSliceStart(getClass().getName(),29173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdq4enmid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhrmhrle6rjcsj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhrmhrle6rjcsj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testEqualsHashCode125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdq4enmid(){try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29173); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29174);MutableInterval test1 = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29175);MutableInterval test2 = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29176);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29177);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29178);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29179);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29180);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29181);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29182);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29183);MutableInterval test3 = new MutableInterval(TEST_TIME_NOW, TEST_TIME2); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29184);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29185);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29186);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29187);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29188);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29189);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29190);MutableInterval test4 = new MutableInterval(TEST_TIME1, TEST_TIME2, GJChronology.getInstance()); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29191);assertEquals(true, test4.equals(test4)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29192);assertEquals(false, test1.equals(test4)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29193);assertEquals(false, test2.equals(test4)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29194);assertEquals(false, test4.equals(test1)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29195);assertEquals(false, test4.equals(test2)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29196);assertEquals(false, test1.hashCode() == test4.hashCode()); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29197);assertEquals(false, test2.hashCode() == test4.hashCode()); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29198);MutableInterval test5 = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29199);assertEquals(true, test1.equals(test5)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29200);assertEquals(true, test2.equals(test5)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29201);assertEquals(false, test3.equals(test5)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29202);assertEquals(true, test5.equals(test1)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29203);assertEquals(true, test5.equals(test2)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29204);assertEquals(false, test5.equals(test3)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29205);assertEquals(true, test1.hashCode() == test5.hashCode()); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29206);assertEquals(true, test2.hashCode() == test5.hashCode()); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29207);assertEquals(false, test3.hashCode() == test5.hashCode()); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29208);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29209);assertEquals(true, test1.equals(new MockInterval())); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29210);assertEquals(false, test1.equals(new DateTime(TEST_TIME1))); 
 }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}} 


public void testOverlaps_RInterval1174() {__CLR4_4_1mhrmhrle6rjcsj.R.globalSliceStart(getClass().getName(),29211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vflnhimjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhrmhrle6rjcsj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhrmhrle6rjcsj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testOverlaps_RInterval1174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vflnhimjf(){try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29211); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29212);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29213);assertEquals(false, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29214);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29215);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1 + 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29216);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29217);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29218);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29219);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29220);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29221);assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29222);assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29223);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2 + 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29224);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29225);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 + 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29226);assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2 + 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29227);assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2 + 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29228);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 - 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29229);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29230);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29231);assertEquals(true, test.overlaps((ReadableInterval) null)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29232);MutableInterval empty = new MutableInterval(TEST_TIME1, TEST_TIME1); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29233);assertEquals(false, empty.overlaps(empty)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29234);assertEquals(false, empty.overlaps(test)); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29235);assertEquals(false, test.overlaps(empty)); 
 }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}} 


public void testIsBefore_RI1177() {__CLR4_4_1mhrmhrle6rjcsj.R.globalSliceStart(getClass().getName(),29236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv3zxamk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhrmhrle6rjcsj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhrmhrle6rjcsj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_RI1177",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv3zxamk4(){try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29236); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29237);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29238);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 - 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29239);assertEquals(false, test.isBefore(new Instant(TEST_TIME1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29240);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 + 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29241);assertEquals(false, test.isBefore(new Instant(TEST_TIME2 - 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29242);assertEquals(true, test.isBefore(new Instant(TEST_TIME2))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29243);assertEquals(true, test.isBefore(new Instant(TEST_TIME2 + 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29244);assertEquals(false, test.isBefore((ReadableInstant) null)); 
 }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}} 


public void testIsAfter_RInterval1182() {__CLR4_4_1mhrmhrle6rjcsj.R.globalSliceStart(getClass().getName(),29245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18kz0s9mkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhrmhrle6rjcsj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhrmhrle6rjcsj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsAfter_RInterval1182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18kz0s9mkd(){try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29245); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29246);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29247);assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29248);assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29249);assertEquals(false, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29250);assertEquals(false, test.isAfter(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29251);assertEquals(false, test.isAfter(new Interval(TEST_TIME2, Long.MAX_VALUE))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29252);assertEquals(false, test.isAfter(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE))); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29253);assertEquals(false, test.isAfter((ReadableInterval) null)); 
 }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}} 


public void testToInterval11183() {__CLR4_4_1mhrmhrle6rjcsj.R.globalSliceStart(getClass().getName(),29254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsyow1mkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhrmhrle6rjcsj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhrmhrle6rjcsj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToInterval11183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsyow1mkm(){try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29254); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29255);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29256);Interval result = test.toInterval(); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29257);assertEquals(test, result); 
 }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}} 


public void testToMutableInterval11184() {__CLR4_4_1mhrmhrle6rjcsj.R.globalSliceStart(getClass().getName(),29258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3cuommkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhrmhrle6rjcsj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhrmhrle6rjcsj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToMutableInterval11184",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3cuommkq(){try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29258); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29259);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29260);MutableInterval result = test.toMutableInterval(); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29261);assertEquals(test, result); 
     __CLR4_4_1mhrmhrle6rjcsj.R.inc(29262);assertNotSame(test, result); 
 }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1mhrmhrle6rjcsj.R.inc(29264);try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29263);
        }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29265);
            __CLR4_4_1mhrmhrle6rjcsj.R.inc(29266);return ISOChronology.getInstance();
        }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29267);
            __CLR4_4_1mhrmhrle6rjcsj.R.inc(29268);return TEST_TIME1;
        }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1mhrmhrle6rjcsj.R.inc(29269);
            __CLR4_4_1mhrmhrle6rjcsj.R.inc(29270);return TEST_TIME2;
        }finally{__CLR4_4_1mhrmhrle6rjcsj.R.flushNeeded();}}
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
