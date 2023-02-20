/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Adds extends TestCase {static class __CLR4_4_1lu8lu8le6qsf2j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,28411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28304);
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28305);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28306);
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28307);return new TestSuite(TestMutableDateTime_Adds.class);
    }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}}

    public TestMutableDateTime_Adds(String name) {
        super(name);__CLR4_4_1lu8lu8le6qsf2j.R.inc(28309);try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28308);
    }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28310);
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28311);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28312);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28313);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28314);originalLocale = Locale.getDefault();
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28315);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28316);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28317);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28318);
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28319);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28320);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28321);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28322);Locale.setDefault(originalLocale);
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28323);originalDateTimeZone = null;
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28324);originalTimeZone = null;
        __CLR4_4_1lu8lu8le6qsf2j.R.inc(28325);originalLocale = null;
    }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testAdd_long11016() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7j6c0luu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_long11016",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7j6c0luu(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28326); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28327);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28328);test.add(123456L); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28329);assertEquals(TEST_TIME1 + 123456L, test.getMillis()); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28330);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAdd_RD21017() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1su2mscluz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD21017",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1su2mscluz(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28331); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28332);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28333);test.add((ReadableDuration) null); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28334);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAdd_RD_int11018() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fuuwuslv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD_int11018",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fuuwuslv3(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28335); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28336);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28337);test.add(new Duration(123456L), -2); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28338);assertEquals(TEST_TIME1 - (2L * 123456L), test.getMillis()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAdd_RP21019() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9tz82lv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP21019",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9tz82lv7(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28339); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28340);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28341);test.add((ReadablePeriod) null); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28342);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAdd_RP_int11020() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3peflvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP_int11020",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3peflvb(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28343); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28344);Period d = new Period(0, 0, 0, 0, 0, 0, 1, 2); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28345);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28346);test.add(d, -2); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28347);assertEquals(TEST_TIME1 - (2L * 1002L), test.getMillis()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAdd_DurationFieldType_int11024() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjijpjlvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int11024",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjijpjlvg(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28348); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28349);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28350);test.add(DurationFieldType.years(), 8); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28351);assertEquals(2010, test.getYear()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddYears_int11026() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177lzk4lvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddYears_int11026",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177lzk4lvk(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28352); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28353);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28354);test.addYears(8); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28355);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddWeekyears_int11027() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17jlue1lvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeekyears_int11027",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17jlue1lvo(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28356); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28357);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28358);test.addWeekyears(-1); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28359);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddMonths_int_dstOverlapSummer_addZero1029() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13vo9wrlvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int_dstOverlapSummer_addZero1029",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13vo9wrlvs(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28360); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28361);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28362);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28363);test.addMonths(0); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28364);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddMonths_int11030() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7b36qlvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int11030",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7b36qlvx(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28365); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28366);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28367);test.addMonths(6); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28368);assertEquals("2002-12-09T05:06:07.008Z", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddWeeks_int_dstOverlapSummer_addZero1032() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azvgkhlw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int_dstOverlapSummer_addZero1032",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azvgkhlw1(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28369); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28370);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28371);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28372);test.addWeeks(0); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28373);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddWeeks_int11033() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171ineflw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int11033",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171ineflw6(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28374); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28375);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28376);test.addWeeks(-21); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28377);assertEquals("2002-01-13T05:06:07.008Z", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddDays_int_dstOverlapSummer_addZero1036() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1az74xflwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int_dstOverlapSummer_addZero1036",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1az74xflwa(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28378); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28379);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28380);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28381);test.addDays(0); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28382);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddDays_int11037() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q40wytlwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int11037",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q40wytlwf(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28383); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28384);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28385);test.addDays(17); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28386);assertEquals("2002-06-26T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddMinutes_int11040() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14edsstlwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMinutes_int11040",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14edsstlwj(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28387); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28388);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28389);test.addMinutes(13); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28390);assertEquals("2002-06-09T05:19:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddSeconds_int_dstOverlapWinter_addZero1043() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1660ivplwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int_dstOverlapWinter_addZero1043",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1660ivplwn(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28391); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28392);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28393);test.addHours(1); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28394);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28395);test.addSeconds(0); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28396);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddSeconds_int11044() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zeuk2xlwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int11044",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zeuk2xlwt(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28397); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28398);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28399);test.addSeconds(13); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28400);assertEquals("2002-06-09T05:06:20.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddMillis_int_dstOverlapWinter_addZero1045() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofd8j2lwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int_dstOverlapWinter_addZero1045",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofd8j2lwx(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28401); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28402);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28403);test.addHours(1); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28404);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28405);test.addMillis(0); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28406);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 


public void testAddMillis_int11046() {__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceStart(getClass().getName(),28407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s6skiclx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lu8lu8le6qsf2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lu8lu8le6qsf2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int11046",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s6skiclx3(){try{__CLR4_4_1lu8lu8le6qsf2j.R.inc(28407); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28408);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28409);test.addMillis(13); 
     __CLR4_4_1lu8lu8le6qsf2j.R.inc(28410);assertEquals("2002-06-09T05:06:07.021+01:00", test.toString()); 
 }finally{__CLR4_4_1lu8lu8le6qsf2j.R.flushNeeded();}} 

    

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
