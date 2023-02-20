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
public class TestMutableDateTime_Adds extends TestCase {static class __CLR4_4_1lw6lw6le6rjcod{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,28471,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28374);
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28375);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28376);
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28377);return new TestSuite(TestMutableDateTime_Adds.class);
    }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}}

    public TestMutableDateTime_Adds(String name) {
        super(name);__CLR4_4_1lw6lw6le6rjcod.R.inc(28379);try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28378);
    }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28380);
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28381);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28382);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28383);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28384);originalLocale = Locale.getDefault();
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28385);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28386);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28387);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28388);
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28389);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28390);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28391);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28392);Locale.setDefault(originalLocale);
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28393);originalDateTimeZone = null;
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28394);originalTimeZone = null;
        __CLR4_4_1lw6lw6le6rjcod.R.inc(28395);originalLocale = null;
    }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testAdd_long11039() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19d4ttdlws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_long11039",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19d4ttdlws(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28396); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28397);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28398);test.add(123456L); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28399);assertEquals(TEST_TIME1 + 123456L, test.getMillis()); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28400);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAdd_RD21040() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o7jiwilwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD21040",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o7jiwilwx(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28401); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28402);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28403);test.add((ReadableDuration) null); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28404);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAdd_RP21041() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ceawjrlx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP21041",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ceawjrlx1(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28405); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28406);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28407);test.add((ReadablePeriod) null); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28408);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAdd_RP_int11042() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ape3blx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP_int11042",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ape3blx5(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28409); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28410);Period d = new Period(0, 0, 0, 0, 0, 0, 1, 2); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28411);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28412);test.add(d, -2); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28413);assertEquals(TEST_TIME1 - (2L * 1002L), test.getMillis()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAdd_DurationFieldType_int11047() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odww86lxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int11047",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odww86lxa(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28414); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28415);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28416);test.add(DurationFieldType.years(), 8); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28417);assertEquals(2010, test.getYear()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAdd_DurationFieldType_int31048() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ex6dflxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int31048",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ex6dflxe(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28418); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28419);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28420);try { 
         __CLR4_4_1lw6lw6le6rjcod.R.inc(28421);test.add((DurationFieldType) null, 6); 
         __CLR4_4_1lw6lw6le6rjcod.R.inc(28422);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28423);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAddYears_int11049() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15d7n1hlxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddYears_int11049",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15d7n1hlxk(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28424); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28425);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28426);test.addYears(8); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28427);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAddMonths_int_dstOverlapSummer_addZero1052() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18i7dsllxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int_dstOverlapSummer_addZero1052",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18i7dsllxo(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28428); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28429);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28430);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28431);test.addMonths(0); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28432);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAddWeeks_int_dstOverlapSummer_addZero1054() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g39rvllxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int_dstOverlapSummer_addZero1054",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g39rvllxt(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28433); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28434);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28435);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28436);test.addWeeks(0); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28437);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAddDays_int_dstOverlapSummer_addZero1058() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g2lg8jlxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int_dstOverlapSummer_addZero1058",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g2lg8jlxy(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28438); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28439);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28440);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28441);test.addDays(0); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28442);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAddDays_int11059() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0mlnply3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int11059",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0mlnply3(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28443); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28444);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28445);test.addDays(17); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28446);assertEquals("2002-06-26T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAddMinutes_int11062() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19hs43xly7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMinutes_int11062",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19hs43xly7(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28447); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28448);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28449);test.addMinutes(13); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28450);assertEquals("2002-06-09T05:19:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAddSeconds_int_dstOverlapWinter_addZero1065() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112m7kllyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int_dstOverlapWinter_addZero1065",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112m7kllyb(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28451); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28452);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28453);test.addHours(1); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28454);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28455);test.addSeconds(0); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28456);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAddSeconds_int11066() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uiv6l3lyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int11066",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uiv6l3lyh(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28457); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28458);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28459);test.addSeconds(13); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28460);assertEquals("2002-06-09T05:06:20.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAddMillis_int_dstOverlapWinter_addZero1069() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0rm98lyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int_dstOverlapWinter_addZero1069",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0rm98lyl(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28461); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28462);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28463);test.addHours(1); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28464);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28465);test.addMillis(0); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28466);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 


public void testAddMillis_int11070() {__CLR4_4_1lw6lw6le6rjcod.R.globalSliceStart(getClass().getName(),28467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qt9fezlyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lw6lw6le6rjcod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lw6lw6le6rjcod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int11070",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qt9fezlyr(){try{__CLR4_4_1lw6lw6le6rjcod.R.inc(28467); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28468);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28469);test.addMillis(13); 
     __CLR4_4_1lw6lw6le6rjcod.R.inc(28470);assertEquals("2002-06-09T05:06:07.021+01:00", test.toString()); 
 }finally{__CLR4_4_1lw6lw6le6rjcod.R.flushNeeded();}} 

    

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
