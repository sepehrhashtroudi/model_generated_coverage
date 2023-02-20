/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Constructors extends TestCase {static class __CLR4_4_1jxvjxvle6qsewi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,25985,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
//    // 2002-04-05
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25843);
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25844);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25845);
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25846);return new TestSuite(TestInterval_Constructors.class);
    }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}

    public TestInterval_Constructors(String name) {
        super(name);__CLR4_4_1jxvjxvle6qsewi.R.inc(25848);try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25847);
    }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25849);
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25850);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25851);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25852);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25853);originalLocale = Locale.getDefault();
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25854);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25855);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25856);Locale.setDefault(Locale.FRANCE);
    }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25857);
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25858);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25859);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25860);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25861);Locale.setDefault(originalLocale);
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25862);originalDateTimeZone = null;
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25863);originalTimeZone = null;
        __CLR4_4_1jxvjxvle6qsewi.R.inc(25864);originalLocale = null;
    }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testParse_noFormatter296() throws Throwable {__CLR4_4_1jxvjxvle6qsewi.R.globalSliceStart(getClass().getName(),25865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de34bvjyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxvjxvle6qsewi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxvjxvle6qsewi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testParse_noFormatter296",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de34bvjyh() throws Throwable{try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25865); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25866);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25867);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25868);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/2010-07-01T14:30")); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25869);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/P1DT2H")); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25870);assertEquals(new Interval(start, end), Interval.parse("P1DT2H/2010-07-01T14:30")); 
 }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 


public void testConstructor_long_long2297() throws Throwable {__CLR4_4_1jxvjxvle6qsewi.R.globalSliceStart(getClass().getName(),25871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ju6u5vjyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxvjxvle6qsewi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxvjxvle6qsewi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long2297",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ju6u5vjyn() throws Throwable{try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25871); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25872);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25873);Interval test = new Interval(dt1.getMillis(), dt1.getMillis()); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25874);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25875);assertEquals(dt1.getMillis(), test.getEndMillis()); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25876);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 


public void testConstructor_long_long_nullZone298() throws Throwable {__CLR4_4_1jxvjxvle6qsewi.R.globalSliceStart(getClass().getName(),25877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yf945ujyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxvjxvle6qsewi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxvjxvle6qsewi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_nullZone298",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yf945ujyt() throws Throwable{try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25877); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25878);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25879);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25880);Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), (DateTimeZone) null); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25881);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25882);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25883);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 


public void testConstructor_RI_RD4301() throws Throwable {__CLR4_4_1jxvjxvle6qsewi.R.globalSliceStart(getClass().getName(),25884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9px0qjz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxvjxvle6qsewi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxvjxvle6qsewi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD4301",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9px0qjz0() throws Throwable{try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25884); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25885);long result = TEST_TIME_NOW; 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25886);result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25887);result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25888);Duration dur = new Duration(result - TEST_TIME_NOW); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25889);Interval test = new Interval((ReadableInstant) null, dur); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25890);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25891);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 


public void testConstructor_RD_RI3302() throws Throwable {__CLR4_4_1jxvjxvle6qsewi.R.globalSliceStart(getClass().getName(),25892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbf4jajz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxvjxvle6qsewi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxvjxvle6qsewi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI3302",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbf4jajz8() throws Throwable{try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25892); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25893);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25894);Interval test = new Interval((ReadableDuration) null, dt); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25895);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25896);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 


public void testConstructor_RI_RP7303() throws Throwable {__CLR4_4_1jxvjxvle6qsewi.R.globalSliceStart(getClass().getName(),25897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11li6npjzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxvjxvle6qsewi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxvjxvle6qsewi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP7303",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11li6npjzd() throws Throwable{try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25897); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25898);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25899);long result = TEST_TIME_NOW; 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25900);result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25901);result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25902);Interval test = new Interval((ReadableInstant) null, dur); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25903);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25904);assertEquals(result, test.getEndMillis()); 
 }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 


public void testConstructor_Object_Chronology2304() throws Throwable {__CLR4_4_1jxvjxvle6qsewi.R.globalSliceStart(getClass().getName(),25905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135mb1pjzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxvjxvle6qsewi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxvjxvle6qsewi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object_Chronology2304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135mb1pjzl() throws Throwable{try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25905); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25906);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25907);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25908);Interval base = new Interval(dt1, dt2); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25909);Interval test = new Interval(base, null); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25910);assertEquals(dt1.getMillis(), test.getStartMillis()); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25911);assertEquals(dt2.getMillis(), test.getEndMillis()); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25912);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 


public void testConstructor_RI_RI3783() throws Throwable {__CLR4_4_1jxvjxvle6qsewi.R.globalSliceStart(getClass().getName(),25913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1at0u1ajzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxvjxvle6qsewi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxvjxvle6qsewi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI3783",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1at0u1ajzt() throws Throwable{try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25913); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25914);Interval test = new Interval((ReadableInstant) null, (ReadableInstant) null); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25915);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25916);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 


public void testConstructor_RI_RP6785() throws Throwable {__CLR4_4_1jxvjxvle6qsewi.R.globalSliceStart(getClass().getName(),25917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jcxrzojzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxvjxvle6qsewi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxvjxvle6qsewi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP6785",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jcxrzojzx() throws Throwable{try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25917); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25918);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25919);Interval test = new Interval(dt, (ReadablePeriod) null); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25920);assertEquals(dt.getMillis(), test.getStartMillis()); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25921);assertEquals(dt.getMillis(), test.getEndMillis()); 
 }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 


public void testConstructor_RP_RI8786() throws Throwable {__CLR4_4_1jxvjxvle6qsewi.R.globalSliceStart(getClass().getName(),25922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7l7adk02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxvjxvle6qsewi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxvjxvle6qsewi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI8786",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7l7adk02() throws Throwable{try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25922); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25923);DateTime dt = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25924);Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25925);try { 
         __CLR4_4_1jxvjxvle6qsewi.R.inc(25926);new Interval(dur, dt); 
         __CLR4_4_1jxvjxvle6qsewi.R.inc(25927);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 


public void testConstructor_Object6789() throws Throwable {__CLR4_4_1jxvjxvle6qsewi.R.globalSliceStart(getClass().getName(),25928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwgpj3k08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxvjxvle6qsewi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxvjxvle6qsewi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object6789",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwgpj3k08() throws Throwable{try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25928); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25929);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 0L)); 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25930);IntervalConverter conv = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25931); 
             __CLR4_4_1jxvjxvle6qsewi.R.inc(25932);return false; 
         }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25933); 
             __CLR4_4_1jxvjxvle6qsewi.R.inc(25934);interval.setChronology(chrono); 
             __CLR4_4_1jxvjxvle6qsewi.R.inc(25935);interval.setInterval(1234L, 5678L); 
         }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 
  
         public Class<?> getSupportedType() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25936); 
             __CLR4_4_1jxvjxvle6qsewi.R.inc(25937);return ReadableInterval.class; 
         }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 
     }; 
     __CLR4_4_1jxvjxvle6qsewi.R.inc(25938);try { 
         __CLR4_4_1jxvjxvle6qsewi.R.inc(25939);ConverterManager.getInstance().addIntervalConverter(conv); 
         __CLR4_4_1jxvjxvle6qsewi.R.inc(25940);Interval base = new Interval(-1000L, 1000L); 
         __CLR4_4_1jxvjxvle6qsewi.R.inc(25941);Interval test = new Interval(base); 
         __CLR4_4_1jxvjxvle6qsewi.R.inc(25942);assertEquals(1234L, test.getStartMillis()); 
         __CLR4_4_1jxvjxvle6qsewi.R.inc(25943);assertEquals(5678L, test.getEndMillis()); 
     } finally { 
         __CLR4_4_1jxvjxvle6qsewi.R.inc(25944);ConverterManager.getInstance().addIntervalConverter(oldConv); 
     } 
 }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    class MockInterval implements ReadableInterval {
        public Chronology getChronology() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25945);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25946);return ISOChronology.getInstance();
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25947);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25948);return 1234L;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25949);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25950);return new DateTime(1234L);
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25951);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25952);return 5678L;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25953);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25954);return new DateTime(5678L);
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25955);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25956);return (5678L - 1234L);
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25957);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25958);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25959);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25960);return false;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25961);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25962);return false;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25963);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25964);return false;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25965);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25966);return false;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25967);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25968);return false;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25969);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25970);return false;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25971);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25972);return false;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25973);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25974);return false;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25975);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25976);return false;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25977);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25978);return null;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25979);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25980);return null;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25981);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25982);return null;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1jxvjxvle6qsewi.R.inc(25983);
            __CLR4_4_1jxvjxvle6qsewi.R.inc(25984);return null;
        }finally{__CLR4_4_1jxvjxvle6qsewi.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

}
