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
public class TestMutableDateTime_Adds extends TestCase {static class __CLR4_4_1mommomlc8axe4a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,29511,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mommomlc8axe4a.R.inc(29398);
        __CLR4_4_1mommomlc8axe4a.R.inc(29399);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mommomlc8axe4a.R.inc(29400);
        __CLR4_4_1mommomlc8axe4a.R.inc(29401);return new TestSuite(TestMutableDateTime_Adds.class);
    }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}}

    public TestMutableDateTime_Adds(String name) {
        super(name);__CLR4_4_1mommomlc8axe4a.R.inc(29403);try{__CLR4_4_1mommomlc8axe4a.R.inc(29402);
    }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mommomlc8axe4a.R.inc(29404);
        __CLR4_4_1mommomlc8axe4a.R.inc(29405);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mommomlc8axe4a.R.inc(29406);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mommomlc8axe4a.R.inc(29407);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mommomlc8axe4a.R.inc(29408);originalLocale = Locale.getDefault();
        __CLR4_4_1mommomlc8axe4a.R.inc(29409);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mommomlc8axe4a.R.inc(29410);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mommomlc8axe4a.R.inc(29411);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mommomlc8axe4a.R.inc(29412);
        __CLR4_4_1mommomlc8axe4a.R.inc(29413);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mommomlc8axe4a.R.inc(29414);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mommomlc8axe4a.R.inc(29415);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mommomlc8axe4a.R.inc(29416);Locale.setDefault(originalLocale);
        __CLR4_4_1mommomlc8axe4a.R.inc(29417);originalDateTimeZone = null;
        __CLR4_4_1mommomlc8axe4a.R.inc(29418);originalTimeZone = null;
        __CLR4_4_1mommomlc8axe4a.R.inc(29419);originalLocale = null;
    }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testAdd_DurationFieldType_int354() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162zgqvmp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162zgqvmp8(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29420); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29421);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29422);try { 
         __CLR4_4_1mommomlc8axe4a.R.inc(29423);test.add((DurationFieldType) null, 6); 
         __CLR4_4_1mommomlc8axe4a.R.inc(29424);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mommomlc8axe4a.R.inc(29425);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAdd_RD2373() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17nbpjampe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD2373",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17nbpjampe(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29426); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29427);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29428);test.add((ReadableDuration) null); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29429);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddSeconds_int_dstOverlapWinter_addZero862() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1227u6jmpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int_dstOverlapWinter_addZero862",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1227u6jmpi(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29430); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29431);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29432);test.addHours(1); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29433);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29434);test.addSeconds(0); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29435);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAdd_long1882() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1muitpompo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_long1882",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1muitpompo(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29436); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29437);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29438);test.add(123456L); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29439);assertEquals(TEST_TIME1 + 123456L, test.getMillis()); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29440);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddWeekyears_int1909() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k1s8t7mpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeekyears_int1909",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k1s8t7mpt(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29441); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29442);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29443);test.addWeekyears(-1); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29444);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAdd_DurationFieldType_int11000() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ny45zdmpx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int11000",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ny45zdmpx(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29445); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29446);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29447);test.add(DurationFieldType.years(), 8); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29448);assertEquals(2010, test.getYear()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAdd_RP_int11042() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ape3bmq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP_int11042",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ape3bmq1(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29449); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29450);Period d = new Period(0, 0, 0, 0, 0, 0, 1, 2); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29451);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29452);test.add(d, -2); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29453);assertEquals(TEST_TIME1 - (2L * 1002L), test.getMillis()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddYears_int11210() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1or5yipmq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddYears_int11210",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1or5yipmq6(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29454); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29455);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29456);test.addYears(8); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29457);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddDays_int11254() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxdz6mqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int11254",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxdz6mqa(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29458); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29459);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29460);test.addDays(17); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29461);assertEquals("2002-06-26T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddMonths_int_dstOverlapSummer_addZero1311() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15112ltmqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int_dstOverlapSummer_addZero1311",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15112ltmqe(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29462); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29463);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29464);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29465);test.addMonths(0); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29466);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddMillis_int_dstOverlapWinter_addZero1382() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_179ecpamqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int_dstOverlapWinter_addZero1382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_179ecpamqj(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29467); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29468);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29469);test.addHours(1); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29470);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29471);test.addMillis(0); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29472);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddMinutes_int11416() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bk9f5smqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMinutes_int11416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bk9f5smqp(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29473); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29474);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29475);test.addMinutes(13); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29476);assertEquals("2002-06-09T05:19:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAdd_RD_int11480() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkit7lmqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD_int11480",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkit7lmqt(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29477); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29478);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29479);test.add(new Duration(123456L), -2); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29480);assertEquals(TEST_TIME1 - (2L * 123456L), test.getMillis()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddWeeks_int_dstOverlapSummer_addZero1491() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgn4homqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int_dstOverlapSummer_addZero1491",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgn4homqx(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29481); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29482);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29483);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29484);test.addWeeks(0); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29485);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddWeeks_int11564() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqptiymr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int11564",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqptiymr2(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29486); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29487);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29488);test.addWeeks(-21); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29489);assertEquals("2002-01-13T05:06:07.008Z", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddDays_int_dstOverlapSummer_addZero1572() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6v3samr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int_dstOverlapSummer_addZero1572",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6v3samr6(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29490); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29491);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29492);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29493);test.addDays(0); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29494);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddSeconds_int11621() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1onjp8cmrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int11621",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1onjp8cmrb(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29495); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29496);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29497);test.addSeconds(13); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29498);assertEquals("2002-06-09T05:06:20.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddMonths_int11647() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1162fw2mrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int11647",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1162fw2mrf(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29499); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29500);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29501);test.addMonths(6); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29502);assertEquals("2002-12-09T05:06:07.008Z", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAdd_RP21678() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukgvf3mrj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP21678",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukgvf3mrj(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29503); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29504);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29505);test.add((ReadablePeriod) null); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29506);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 


public void testAddMillis_int11743() {__CLR4_4_1mommomlc8axe4a.R.globalSliceStart(getClass().getName(),29507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13htu3cmrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mommomlc8axe4a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mommomlc8axe4a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int11743",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13htu3cmrn(){try{__CLR4_4_1mommomlc8axe4a.R.inc(29507); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29508);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29509);test.addMillis(13); 
     __CLR4_4_1mommomlc8axe4a.R.inc(29510);assertEquals("2002-06-09T05:06:07.021+01:00", test.toString()); 
 }finally{__CLR4_4_1mommomlc8axe4a.R.flushNeeded();}} 

    

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
