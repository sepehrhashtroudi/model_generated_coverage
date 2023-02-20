/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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

import org.joda.time.base.AbstractDuration;
import org.joda.time.base.BaseDuration;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestDuration_Basics extends TestCase {static class __CLR4_4_1hghhghle6nl87q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,22783,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
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

    public static void main(String[] args) {try{__CLR4_4_1hghhghle6nl87q.R.inc(22625);
        __CLR4_4_1hghhghle6nl87q.R.inc(22626);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hghhghle6nl87q.R.inc(22627);
        __CLR4_4_1hghhghle6nl87q.R.inc(22628);return new TestSuite(TestDuration_Basics.class);
    }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}

    public TestDuration_Basics(String name) {
        super(name);__CLR4_4_1hghhghle6nl87q.R.inc(22630);try{__CLR4_4_1hghhghle6nl87q.R.inc(22629);
    }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hghhghle6nl87q.R.inc(22631);
        __CLR4_4_1hghhghle6nl87q.R.inc(22632);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hghhghle6nl87q.R.inc(22633);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hghhghle6nl87q.R.inc(22634);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hghhghle6nl87q.R.inc(22635);originalLocale = Locale.getDefault();
        __CLR4_4_1hghhghle6nl87q.R.inc(22636);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hghhghle6nl87q.R.inc(22637);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1hghhghle6nl87q.R.inc(22638);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hghhghle6nl87q.R.inc(22639);
        __CLR4_4_1hghhghle6nl87q.R.inc(22640);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hghhghle6nl87q.R.inc(22641);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hghhghle6nl87q.R.inc(22642);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hghhghle6nl87q.R.inc(22643);Locale.setDefault(originalLocale);
        __CLR4_4_1hghhghle6nl87q.R.inc(22644);originalDateTimeZone = null;
        __CLR4_4_1hghhghle6nl87q.R.inc(22645);originalTimeZone = null;
        __CLR4_4_1hghhghle6nl87q.R.inc(22646);originalLocale = null;
    }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_RI_RD245() throws Throwable {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eh5aqxhh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testConstructor_RI_RD245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eh5aqxhh3() throws Throwable{try{__CLR4_4_1hghhghle6nl87q.R.inc(22647); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22648);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22649);Duration dur = null; 
     __CLR4_4_1hghhghle6nl87q.R.inc(22650);Period test = new Period(dt1, dur, PeriodType.dayTime()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22651);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22652);assertEquals(0, test.getYears()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22653);assertEquals(0, test.getMonths()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22654);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22655);assertEquals(0, test.getDays()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22656);assertEquals(0, test.getHours()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22657);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22658);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22659);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
public void testToDuration117() {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esi2e5hhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esi2e5hhg(){try{__CLR4_4_1hghhghle6nl87q.R.inc(22660); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22661);Duration test = new Duration(123L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22662);Duration result = test.toDuration(); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22663);assertSame(test, result); 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
public void testMinus_long1118() {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukcckrhhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_long1118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukcckrhhk(){try{__CLR4_4_1hghhghle6nl87q.R.inc(22664); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22665);Duration test = new Duration(123L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22666);Duration result = test.minus(8000L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22667);assertEquals(123L - 8000L, result.getMillis()); 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
public void testPlus_RD3119() {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11bxxqhho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD3119",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11bxxqhho(){try{__CLR4_4_1hghhghle6nl87q.R.inc(22668); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22669);Duration test = new Duration(123L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22670);Duration result = test.plus(null); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22671);assertSame(test, result); 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
public void testMultipliedBy_long2120() {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_158dpdvhhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long2120",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_158dpdvhhs(){try{__CLR4_4_1hghhghle6nl87q.R.inc(22672); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22673);Duration test = new Duration(123L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22674);Duration result = test.multipliedBy(1L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22675);assertSame(test, result); 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
public void testToPeriod_Chronology277() {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewyl0whhw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_Chronology277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewyl0whhw(){try{__CLR4_4_1hghhghle6nl87q.R.inc(22676); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22677);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1hghhghle6nl87q.R.inc(22678);Duration test = new Duration(length); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22679);Period result = test.toPeriod(ISOChronology.getInstanceUTC()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22680);assertEquals(new Period(test, ISOChronology.getInstanceUTC()), result); 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
public void testToPeriod_PeriodType278() {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_128fjihi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_128fjihi1(){try{__CLR4_4_1hghhghle6nl87q.R.inc(22681); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22682);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1hghhghle6nl87q.R.inc(22683);Duration test = new Duration(length); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22684);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22685);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result); 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
public void testToPeriodFrom280() {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vh95nrhi6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vh95nrhi6(){try{__CLR4_4_1hghhghle6nl87q.R.inc(22686); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22687);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1hghhghle6nl87q.R.inc(22688);Duration test = new Duration(length); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22689);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22690);Period result = test.toPeriodFrom(dt, PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22691);assertEquals(new Period(dt, test, PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
public void testToDuration600() {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mohzz0hic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration600",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mohzz0hic(){try{__CLR4_4_1hghhghle6nl87q.R.inc(22692); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22693);DateTimeZone zone = DateTimeZone.getDefault(); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22694);try { 
         __CLR4_4_1hghhghle6nl87q.R.inc(22695);DateTimeZone.setDefault(DateTimeZone.forID("Europe/Paris")); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22696);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
         __CLR4_4_1hghhghle6nl87q.R.inc(22697);Duration test = new Duration(length); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22698);Duration result = test.toDuration(); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22699);assertEquals(length, result.getMillis()); 
     } finally { 
         __CLR4_4_1hghhghle6nl87q.R.inc(22700);DateTimeZone.setDefault(zone); 
     } 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
public void testToDuration601() {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pxhyrhhil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration601",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pxhyrhhil(){try{__CLR4_4_1hghhghle6nl87q.R.inc(22701); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22702);DateTimeZone zone = DateTimeZone.getDefault(); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22703);try { 
         __CLR4_4_1hghhghle6nl87q.R.inc(22704);DateTimeZone.setDefault(DateTimeZone.forID("Europe/Paris")); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22705);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
         __CLR4_4_1hghhghle6nl87q.R.inc(22706);Duration dur = new Duration(length); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22707);Period test = dur.toPeriod(); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22708);assertEquals(0, test.getYears()); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22709);assertEquals(0, test.getMonths()); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22710);assertEquals(0, test.getWeeks()); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22711);assertEquals(0, test.getDays()); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22712);assertEquals((450 * 24) + 5, test.getHours()); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22713);assertEquals(6, test.getMinutes()); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22714);assertEquals(7, test.getSeconds()); 
         __CLR4_4_1hghhghle6nl87q.R.inc(22715);assertEquals(8, test.getMillis()); 
     } finally { 
         __CLR4_4_1hghhghle6nl87q.R.inc(22716);DateTimeZone.setDefault(zone); 
     } 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
public void testToString602() {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vn9tenhj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToString602",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vn9tenhj1(){try{__CLR4_4_1hghhghle6nl87q.R.inc(22717); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22718);Duration test = new Duration(123L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22719);assertEquals("PT12.6S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22720);test = new Duration(12345L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22721);assertEquals("PT12.345S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22722);test = new Duration(60000L - 1); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22723);assertEquals("PT-6S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22724);test = new Duration(60000L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22725);assertEquals("PT-6S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22726);test = new Duration(60000L + 1); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22727);assertEquals("PT-6S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22728);test = new Duration(2 * 60000L - 1); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22729);assertEquals("PT-2S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22730);test = new Duration(2 * 60000L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22731);assertEquals("PT-6S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22732);test = new Duration(-1L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22733);assertEquals("PT-0S", test.toString()); 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
public void testToString603() {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1se9um6hji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToString603",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1se9um6hji(){try{__CLR4_4_1hghhghle6nl87q.R.inc(22734); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22735);Duration test = new Duration(123L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22736);assertEquals("PT123L", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22737);test = new Duration(0L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22738);assertEquals("PT0S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22739);test = new Duration(1L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22740);assertEquals("PT1M", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22741);test = new Duration(3600000L - 1); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22742);assertEquals("PT3600000S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22743);test = new Duration(3600000L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22744);assertEquals("PT3600000S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22745);test = new Duration(3600000L + 1); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22746);assertEquals("PT3600000S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22747);test = new Duration(2 * 3600000L - 1); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22748);assertEquals("PT2S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22749);test = new Duration(2 * 3600000L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22750);assertEquals("PT3S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22751);test = new Duration(-1L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22752);assertEquals("PT-0S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22753);test = new Duration(-3600000L + 1); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22754);assertEquals("PT-0S", test.toString()); 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
public void testToString604() {__CLR4_4_1hghhghle6nl87q.R.globalSliceStart(getClass().getName(),22755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p59vtphk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hghhghle6nl87q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hghhghle6nl87q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToString604",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p59vtphk3(){try{__CLR4_4_1hghhghle6nl87q.R.inc(22755); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22756);Duration test = new Duration(123L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22757);assertEquals("PT12.6S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22758);test = new Duration(12345L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22759);assertEquals("PT12.345S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22760);test = new Duration(60000L - 1); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22761);assertEquals("PT12.345S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22762);test = new Duration(60000L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22763);assertEquals("PT12.345S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22764);test = new Duration(60000L + 1); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22765);assertEquals("PT12.345S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22766);test = new Duration(2 * 60000L - 1); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22767);assertEquals("PT2.6S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22768);test = new Duration(2 * 60000L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22769);assertEquals("PT-2.6S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22770);test = new Duration(-1L); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22771);assertEquals("PT-1.6S", test.toString()); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22772);test = new Duration(-24 * 60 * 60000L + 1); 
     __CLR4_4_1hghhghle6nl87q.R.inc(22773);assertEquals("PT-24.6S", test.toString()); 
 }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    
    
    class MockDuration extends AbstractDuration {
        private final long iValue;
        public MockDuration(long value) {
            super();__CLR4_4_1hghhghle6nl87q.R.inc(22775);try{__CLR4_4_1hghhghle6nl87q.R.inc(22774);
            __CLR4_4_1hghhghle6nl87q.R.inc(22776);iValue = value;
        }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1hghhghle6nl87q.R.inc(22777);
            __CLR4_4_1hghhghle6nl87q.R.inc(22778);return iValue;
        }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
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
    

    static class MockMutableDuration extends BaseDuration {
        public MockMutableDuration(long duration) {
            super(duration);__CLR4_4_1hghhghle6nl87q.R.inc(22780);try{__CLR4_4_1hghhghle6nl87q.R.inc(22779);
        }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
        public void setMillis(long duration) {try{__CLR4_4_1hghhghle6nl87q.R.inc(22781);
            __CLR4_4_1hghhghle6nl87q.R.inc(22782);super.setMillis(duration);
        }finally{__CLR4_4_1hghhghle6nl87q.R.flushNeeded();}}
    }

}
