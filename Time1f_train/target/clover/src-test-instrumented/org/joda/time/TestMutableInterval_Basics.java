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
public class TestMutableInterval_Basics extends TestCase {static class __CLR4_4_1nbbnbblc8axe7t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,30349,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30215);
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30216);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30217);
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30218);return new TestSuite(TestMutableInterval_Basics.class);
    }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}}

    public TestMutableInterval_Basics(String name) {
        super(name);__CLR4_4_1nbbnbblc8axe7t.R.inc(30220);try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30219);
    }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30221);
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30222);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30223);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30224);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30225);originalLocale = Locale.getDefault();
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30226);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30227);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30228);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30229);
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30230);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30231);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30232);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30233);Locale.setDefault(originalLocale);
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30234);originalDateTimeZone = null;
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30235);originalTimeZone = null;
        __CLR4_4_1nbbnbblc8axe7t.R.inc(30236);originalLocale = null;
    }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testCopy139() {__CLR4_4_1nbbnbblc8axe7t.R.globalSliceStart(getClass().getName(),30237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bg6u53nbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nbbnbblc8axe7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nbbnbblc8axe7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testCopy139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bg6u53nbx(){try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30237); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30238);MutableInterval test = new MutableInterval(123L, 456L, COPTIC_PARIS); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30239);MutableInterval cloned = test.copy(); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30240);assertEquals(test, cloned); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30241);assertNotSame(test, cloned); 
 }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}} 


public void testOverlaps_RInterval329() {__CLR4_4_1nbbnbblc8axe7t.R.globalSliceStart(getClass().getName(),30242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxs2etnc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nbbnbblc8axe7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nbbnbblc8axe7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testOverlaps_RInterval329",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxs2etnc2(){try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30242); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30243);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30244);assertEquals(false, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30245);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30246);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30247);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30248);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30249);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30250);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30251);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30252);assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30253);assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30254);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30255);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30256);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30257);assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30258);assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30259);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 - 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30260);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30261);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30262);assertEquals(true, test.overlaps((ReadableInterval) null)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30263);MutableInterval empty = new MutableInterval(TEST_TIME1, TEST_TIME1); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30264);assertEquals(false, empty.overlaps(empty)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30265);assertEquals(false, empty.overlaps(test)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30266);assertEquals(false, test.overlaps(empty)); 
 }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}} 


public void testToMutableInterval11191() {__CLR4_4_1nbbnbblc8axe7t.R.globalSliceStart(getClass().getName(),30267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z27uuqncr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nbbnbblc8axe7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nbbnbblc8axe7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToMutableInterval11191",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z27uuqncr(){try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30267); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30268);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30269);MutableInterval result = test.toMutableInterval(); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30270);assertEquals(test, result); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30271);assertNotSame(test, result); 
 }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}} 


public void testToInterval11233() {__CLR4_4_1nbbnbblc8axe7t.R.globalSliceStart(getClass().getName(),30272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d51l9jncw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nbbnbblc8axe7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nbbnbblc8axe7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToInterval11233",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d51l9jncw(){try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30272); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30273);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30274);Interval result = test.toInterval(); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30275);assertEquals(test, result); 
 }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}} 


public void testEqualsHashCode1368() {__CLR4_4_1nbbnbblc8axe7t.R.globalSliceStart(getClass().getName(),30276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdthw7nd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nbbnbblc8axe7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nbbnbblc8axe7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testEqualsHashCode1368",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdthw7nd0(){try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30276); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30277);MutableInterval test1 = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30278);MutableInterval test2 = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30279);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30280);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30281);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30282);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30283);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30284);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30285);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30286);MutableInterval test3 = new MutableInterval(TEST_TIME_NOW, TEST_TIME2); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30287);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30288);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30289);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30290);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30291);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30292);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30293);MutableInterval test4 = new MutableInterval(TEST_TIME1, TEST_TIME2, GJChronology.getInstance()); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30294);assertEquals(true, test4.equals(test4)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30295);assertEquals(false, test1.equals(test4)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30296);assertEquals(false, test2.equals(test4)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30297);assertEquals(false, test4.equals(test1)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30298);assertEquals(false, test4.equals(test2)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30299);assertEquals(false, test1.hashCode() == test4.hashCode()); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30300);assertEquals(false, test2.hashCode() == test4.hashCode()); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30301);MutableInterval test5 = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30302);assertEquals(true, test1.equals(test5)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30303);assertEquals(true, test2.equals(test5)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30304);assertEquals(false, test3.equals(test5)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30305);assertEquals(true, test5.equals(test1)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30306);assertEquals(true, test5.equals(test2)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30307);assertEquals(false, test5.equals(test3)); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30308);assertEquals(true, test1.hashCode() == test5.hashCode()); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30309);assertEquals(true, test2.hashCode() == test5.hashCode()); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30310);assertEquals(false, test3.hashCode() == test5.hashCode()); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30311);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30312);assertEquals(true, test1.equals(new MockInterval())); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30313);assertEquals(false, test1.equals(new DateTime(TEST_TIME1))); 
 }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}} 


public void testIsBefore_RI1401() {__CLR4_4_1nbbnbblc8axe7t.R.globalSliceStart(getClass().getName(),30314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jbs0uene2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nbbnbblc8axe7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nbbnbblc8axe7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_RI1401",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jbs0uene2(){try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30314); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30315);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30316);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 - 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30317);assertEquals(false, test.isBefore(new Instant(TEST_TIME1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30318);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30319);assertEquals(false, test.isBefore(new Instant(TEST_TIME2 - 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30320);assertEquals(true, test.isBefore(new Instant(TEST_TIME2))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30321);assertEquals(true, test.isBefore(new Instant(TEST_TIME2 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30322);assertEquals(false, test.isBefore((ReadableInstant) null)); 
 }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}} 


public void testIsBefore_RInterval1487() {__CLR4_4_1nbbnbblc8axe7t.R.globalSliceStart(getClass().getName(),30323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rn1bwcneb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nbbnbblc8axe7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nbbnbblc8axe7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_RInterval1487",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rn1bwcneb(){try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30323); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30324);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30325);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30326);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30327);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30328);assertEquals(false, test.isBefore(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30329);assertEquals(true, test.isBefore(new Interval(TEST_TIME2, Long.MAX_VALUE))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30330);assertEquals(true, test.isBefore(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30331);assertEquals(false, test.isBefore((ReadableInterval) null)); 
 }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}} 


public void testIsAfter_RInterval1554() {__CLR4_4_1nbbnbblc8axe7t.R.globalSliceStart(getClass().getName(),30332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkwgqmnek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nbbnbblc8axe7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nbbnbblc8axe7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsAfter_RInterval1554",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkwgqmnek(){try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30332); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30333);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30334);assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30335);assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30336);assertEquals(false, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30337);assertEquals(false, test.isAfter(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30338);assertEquals(false, test.isAfter(new Interval(TEST_TIME2, Long.MAX_VALUE))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30339);assertEquals(false, test.isAfter(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE))); 
     __CLR4_4_1nbbnbblc8axe7t.R.inc(30340);assertEquals(false, test.isAfter((ReadableInterval) null)); 
 }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1nbbnbblc8axe7t.R.inc(30342);try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30341);
        }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30343);
            __CLR4_4_1nbbnbblc8axe7t.R.inc(30344);return ISOChronology.getInstance();
        }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30345);
            __CLR4_4_1nbbnbblc8axe7t.R.inc(30346);return TEST_TIME1;
        }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1nbbnbblc8axe7t.R.inc(30347);
            __CLR4_4_1nbbnbblc8axe7t.R.inc(30348);return TEST_TIME2;
        }finally{__CLR4_4_1nbbnbblc8axe7t.R.flushNeeded();}}
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
