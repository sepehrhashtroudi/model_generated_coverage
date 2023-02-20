/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Constructors extends TestCase {static class __CLR4_4_1mnymnyle6qsf5m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,29511,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29374);
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29375);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29376);
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29377);return new TestSuite(TestMutablePeriod_Constructors.class);
    }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}}

    public TestMutablePeriod_Constructors(String name) {
        super(name);__CLR4_4_1mnymnyle6qsf5m.R.inc(29379);try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29378);
    }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29380);
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29381);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29382);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29383);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29384);originalLocale = Locale.getDefault();
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29385);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29386);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29387);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29388);
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29389);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29390);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29391);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29392);Locale.setDefault(originalLocale);
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29393);originalDateTimeZone = null;
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29394);originalTimeZone = null;
        __CLR4_4_1mnymnyle6qsf5m.R.inc(29395);originalLocale = null;
    }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_long_long1478() throws Throwable {__CLR4_4_1mnymnyle6qsf5m.R.globalSliceStart(getClass().getName(),29396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e46nf1mok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mnymnyle6qsf5m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mnymnyle6qsf5m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long1478",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e46nf1mok() throws Throwable{try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29396); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29397);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29398);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29399);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29400);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29401);assertEquals(1, test.getYears()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29402);assertEquals(1, test.getMonths()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29403);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29404);assertEquals(1, test.getDays()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29405);assertEquals(1, test.getHours()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29406);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29407);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29408);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}} 


public void testConstructor_RI_RI5814() throws Throwable {__CLR4_4_1mnymnyle6qsf5m.R.globalSliceStart(getClass().getName(),29409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qov8idmox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mnymnyle6qsf5m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mnymnyle6qsf5m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI5814",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qov8idmox() throws Throwable{try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29409); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29410);DateTime dt1 = null; 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29411);DateTime dt2 = null; 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29412);MutablePeriod test = new MutablePeriod(dt1, dt2); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29413);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29414);assertEquals(0, test.getYears()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29415);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29416);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29417);assertEquals(0, test.getDays()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29418);assertEquals(0, test.getHours()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29419);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29420);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29421);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}} 


public void testParse_noFormatter1169() throws Throwable {__CLR4_4_1mnymnyle6qsf5m.R.globalSliceStart(getClass().getName(),29422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14birrfmpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mnymnyle6qsf5m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mnymnyle6qsf5m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testParse_noFormatter1169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14birrfmpa() throws Throwable{try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29422); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29423);assertEquals(new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 890), MutablePeriod.parse("P1Y2M3W4DT5H6M7.890S")); 
 }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}} 


public void testConstructor_4int11175() throws Throwable {__CLR4_4_1mnymnyle6qsf5m.R.globalSliceStart(getClass().getName(),29424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azcqd8mpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mnymnyle6qsf5m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mnymnyle6qsf5m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_4int11175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azcqd8mpc() throws Throwable{try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29424); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29425);MutablePeriod test = new MutablePeriod(5, 6, 7, 8); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29426);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29427);assertEquals(0, test.getYears()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29428);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29429);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29430);assertEquals(0, test.getDays()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29431);assertEquals(5, test.getHours()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29432);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29433);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29434);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}} 


public void testConstructor_long_Chronology21178() throws Throwable {__CLR4_4_1mnymnyle6qsf5m.R.globalSliceStart(getClass().getName(),29435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129rohimpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mnymnyle6qsf5m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mnymnyle6qsf5m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_Chronology21178",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129rohimpn() throws Throwable{try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29435); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29436);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29437);MutablePeriod test = new MutablePeriod(length, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29438);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29439);assertEquals(0, test.getYears()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29440);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29441);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29442);assertEquals(4, test.getDays()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29443);assertEquals(5, test.getHours()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29444);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29445);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29446);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}} 


public void testConstructor_long_long_PeriodType21179() throws Throwable {__CLR4_4_1mnymnyle6qsf5m.R.globalSliceStart(getClass().getName(),29447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1feqvplmpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mnymnyle6qsf5m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mnymnyle6qsf5m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType21179",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1feqvplmpz() throws Throwable{try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29447); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29448);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29449);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29450);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29451);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29452);assertEquals(0, test.getYears()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29453);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29454);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29455);assertEquals(31, test.getDays()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29456);assertEquals(1, test.getHours()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29457);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29458);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29459);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}} 


public void testConstructor_long_long_PeriodType_Chronology11180() throws Throwable {__CLR4_4_1mnymnyle6qsf5m.R.globalSliceStart(getClass().getName(),29460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vwczijmqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mnymnyle6qsf5m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mnymnyle6qsf5m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType_Chronology11180",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vwczijmqc() throws Throwable{try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29460); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29461);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29462);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29463);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, CopticChronology.getInstance()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29464);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29465);assertEquals(1, test.getYears()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29466);assertEquals(1, test.getMonths()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29467);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29468);assertEquals(1, test.getDays()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29469);assertEquals(1, test.getHours()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29470);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29471);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29472);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}} 


public void testConstructor_RI_RI_PeriodType21181() throws Throwable {__CLR4_4_1mnymnyle6qsf5m.R.globalSliceStart(getClass().getName(),29473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19uvs80mqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mnymnyle6qsf5m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mnymnyle6qsf5m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType21181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19uvs80mqp() throws Throwable{try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29473); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29474);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29475);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29476);MutablePeriod test = new MutablePeriod(dt1, dt2, PeriodType.dayTime()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29477);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29478);assertEquals(0, test.getYears()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29479);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29480);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29481);assertEquals(31, test.getDays()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29482);assertEquals(1, test.getHours()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29483);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29484);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29485);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}} 


public void testConstructor_RI_RD21182() throws Throwable {__CLR4_4_1mnymnyle6qsf5m.R.globalSliceStart(getClass().getName(),29486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1arwfzkmr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mnymnyle6qsf5m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mnymnyle6qsf5m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD21182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1arwfzkmr2() throws Throwable{try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29486); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29487);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29488);Duration dur = null; 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29489);MutablePeriod test = new MutablePeriod(dt1, dur); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29490);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29491);assertEquals(0, test.getYears()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29492);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29493);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29494);assertEquals(0, test.getDays()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29495);assertEquals(0, test.getHours()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29496);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29497);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29498);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}} 


public void testConstructor_Object_Chronology21183() throws Throwable {__CLR4_4_1mnymnyle6qsf5m.R.globalSliceStart(getClass().getName(),29499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7kv59mrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mnymnyle6qsf5m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mnymnyle6qsf5m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_Chronology21183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7kv59mrf() throws Throwable{try{__CLR4_4_1mnymnyle6qsf5m.R.inc(29499); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29500);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29501);MutablePeriod test = new MutablePeriod(new Duration(length), ISOChronology.getInstanceUTC()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29502);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29503);assertEquals(0, test.getYears()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29504);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29505);assertEquals(64, test.getWeeks()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29506);assertEquals(2, test.getDays()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29507);assertEquals(5, test.getHours()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29508);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29509);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mnymnyle6qsf5m.R.inc(29510);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mnymnyle6qsf5m.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (PeriodType)
     */
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (4ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object,PeriodType)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    

    

}
