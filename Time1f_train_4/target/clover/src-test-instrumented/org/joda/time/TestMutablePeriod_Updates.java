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

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Updates extends TestCase {static class __CLR4_4_1mwhmwhle6rjcw7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,29968,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29681);
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29682);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29683);
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29684);return new TestSuite(TestMutablePeriod_Updates.class);
    }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}}

    public TestMutablePeriod_Updates(String name) {
        super(name);__CLR4_4_1mwhmwhle6rjcw7.R.inc(29686);try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29685);
    }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29687);
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29688);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29689);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29690);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29691);originalLocale = Locale.getDefault();
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29692);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29693);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29694);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29695);
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29696);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29697);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29698);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29699);Locale.setDefault(originalLocale);
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29700);originalDateTimeZone = null;
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29701);originalTimeZone = null;
        __CLR4_4_1mwhmwhle6rjcw7.R.inc(29702);originalLocale = null;
    }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testAdd_RInterval175() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z0099tmx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z0099tmx3(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29703); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29704);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29705);test.add(new Interval(100L, 200L)); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29706);assertEquals(0, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29707);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29708);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29709);assertEquals(0, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29710);assertEquals(0, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29711);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29712);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29713);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testSetPeriod_8ints1849() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqiyoxmxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints1849",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqiyoxmxe(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29714); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29715);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29716);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29717);assertEquals(11, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29718);assertEquals(12, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29719);assertEquals(13, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29720);assertEquals(14, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29721);assertEquals(15, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29722);assertEquals(16, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29723);assertEquals(17, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29724);assertEquals(18, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testSetWeeks850() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfwp4lmxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetWeeks850",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfwp4lmxp(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29725); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29726);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29727);test.setWeeks(10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29728);assertEquals(10, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29729);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29730);test.setWeeks(-10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29731);assertEquals(-10, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29732);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29733);test.setWeeks(0); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29734);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29735);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29736);test.setWeeks(3); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29737);assertEquals(3, test.getWeeks()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testAddDays851() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1glarclmy2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddDays851",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1glarclmy2(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29738); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29739);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29740);test.addDays(10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29741);assertEquals(14, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29742);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29743);test.addDays(-10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29744);assertEquals(-6, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29745);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29746);test.addDays(0); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29747);assertEquals(4, test.getDays()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testSetPeriod_long21194() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkpofemyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long21194",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkpofemyc(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29748); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29749);MutablePeriod test = new MutablePeriod(); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29750);test.setPeriod((4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29751);assertEquals(0, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29752);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29753);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29754);assertEquals(0, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29755);assertEquals((450 * 24) + 5, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29756);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29757);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29758);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testSetPeriod_long_long_NoMinutes1195() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdkj5fmyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoMinutes1195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdkj5fmyn(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29759); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29760);MutablePeriod test = new MutablePeriod(PeriodType.standard().withMinutesRemoved()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29761);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29762);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29763);test.setPeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29764);assertEquals(1, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29765);assertEquals(1, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29766);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29767);assertEquals(1, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29768);assertEquals(1, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29769);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29770);assertEquals(61, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29771);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testSetYears1196() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ielmmz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetYears1196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ielmmz0(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29772); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29773);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29774);test.setYears(10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29775);assertEquals(10, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29776);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29777);test.setYears(-10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29778);assertEquals(-10, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29779);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29780);test.setYears(0); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29781);assertEquals(0, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29782);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29783);test.setYears(1); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29784);assertEquals(1, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29785);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29786);try { 
         __CLR4_4_1mwhmwhle6rjcw7.R.inc(29787);test.setYears(1); 
         __CLR4_4_1mwhmwhle6rjcw7.R.inc(29788);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testSetPeriod_8ints21197() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13detxlmzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints21197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13detxlmzh(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29789); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29790);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29791);try { 
         __CLR4_4_1mwhmwhle6rjcw7.R.inc(29792);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
         __CLR4_4_1mwhmwhle6rjcw7.R.inc(29793);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29794);assertEquals(0, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29795);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29796);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29797);assertEquals(0, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29798);assertEquals(0, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29799);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29800);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29801);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testClear1206() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjbp6xmzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testClear1206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjbp6xmzu(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29802); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29803);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29804);test.clear(); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29805);assertEquals(new MutablePeriod(), test); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29806);test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29807);test.clear(); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29808);assertEquals(new MutablePeriod(PeriodType.yearMonthDayTime()), test); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testSet_Field1207() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzy3qn01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSet_Field1207",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzy3qn01(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29809); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29810);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29811);test.set(DurationFieldType.years(), 10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29812);assertEquals(10, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29813);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29814);try { 
         __CLR4_4_1mwhmwhle6rjcw7.R.inc(29815);test.set(null, 10); 
         __CLR4_4_1mwhmwhle6rjcw7.R.inc(29816);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testSetPeriod_RI_RI21208() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szigvln09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI21208",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szigvln09(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29817); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29818);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29819);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29820);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29821);test.setPeriod(dt2, dt1); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29822);assertEquals(-1, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29823);assertEquals(-1, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29824);assertEquals(-1, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29825);assertEquals(-1, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29826);assertEquals(-1, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29827);assertEquals(-1, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29828);assertEquals(-1, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29829);assertEquals(-1, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testSetPeriod_RI_RI31209() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uflqrxn0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI31209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uflqrxn0m(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29830); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29831);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29832);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29833);test.setPeriod(dt1, dt1); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29834);assertEquals(0, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29835);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29836);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29837);assertEquals(0, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29838);assertEquals(0, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29839);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29840);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29841);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testAdd_8ints11210() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17wdr64n0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_8ints11210",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17wdr64n0y(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29842); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29843);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29844);test.add(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29845);assertEquals(1, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29846);assertEquals(2, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29847);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29848);assertEquals(4, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29849);assertEquals(5, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29850);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29851);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29852);assertEquals(108, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testAdd_RD31211() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfdbuhn19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD31211",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfdbuhn19(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29853); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29854);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29855);test.add((ReadableDuration) null); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29856);assertEquals(1, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29857);assertEquals(2, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29858);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29859);assertEquals(4, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29860);assertEquals(5, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29861);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29862);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29863);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testAdd_RD11212() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mgfcn1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD11212",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mgfcn1k(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29864); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29865);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29866);test.add(new Duration(100L)); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29867);assertEquals(0, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29868);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29869);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29870);assertEquals(0, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29871);assertEquals(0, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29872);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29873);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29874);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testAdd_long11213() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12t63rln1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long11213",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12t63rln1v(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29875); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29876);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29877);test.add(100L); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29878);assertEquals(0, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29879);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29880);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29881);assertEquals(0, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29882);assertEquals(0, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29883);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29884);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29885);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testAdd_long_Chronology11214() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18t98q7n26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long_Chronology11214",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18t98q7n26(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29886); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29887);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29888);test.add(100L, ISOChronology.getInstance()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29889);assertEquals(0, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29890);assertEquals(0, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29891);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29892);assertEquals(0, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29893);assertEquals(0, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29894);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29895);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29896);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testMergePeriod_RP51215() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pvgahhn2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP51215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pvgahhn2h(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29897); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29898);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29899);test.mergePeriod((ReadablePeriod) null); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29900);assertEquals(1, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29901);assertEquals(2, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29902);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29903);assertEquals(4, test.getDays()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29904);assertEquals(5, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29905);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29906);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29907);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testAddYears1216() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6ml5gn2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddYears1216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6ml5gn2s(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29908); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29909);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29910);test.addYears(10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29911);assertEquals(11, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29912);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29913);test.addYears(-10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29914);assertEquals(-9, test.getYears()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29915);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29916);test.addYears(0); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29917);assertEquals(1, test.getYears()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testAddMonths1217() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hz8rbkn32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMonths1217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hz8rbkn32(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29918); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29919);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29920);test.addMonths(10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29921);assertEquals(12, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29922);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29923);test.addMonths(-10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29924);assertEquals(-8, test.getMonths()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29925);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29926);test.addMonths(0); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29927);assertEquals(2, test.getMonths()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testAddWeeks1218() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c38jdtn3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddWeeks1218",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c38jdtn3c(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29928); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29929);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29930);test.addWeeks(10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29931);assertEquals(13, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29932);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29933);test.addWeeks(-10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29934);assertEquals(-7, test.getWeeks()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29935);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29936);test.addWeeks(0); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29937);assertEquals(3, test.getWeeks()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testAddHours1219() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m7qecwn3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddHours1219",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m7qecwn3m(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29938); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29939);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29940);test.addHours(10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29941);assertEquals(15, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29942);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29943);test.addHours(-10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29944);assertEquals(-5, test.getHours()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29945);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29946);test.addHours(0); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29947);assertEquals(5, test.getHours()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testAddMinutes1220() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16afu7qn3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMinutes1220",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16afu7qn3w(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29948); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29949);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29950);test.addMinutes(10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29951);assertEquals(16, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29952);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29953);test.addMinutes(-10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29954);assertEquals(-4, test.getMinutes()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29955);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29956);test.addMinutes(0); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29957);assertEquals(6, test.getMinutes()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 


public void testAddMillis1221() {__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceStart(getClass().getName(),29958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccpuckn46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwhmwhle6rjcw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwhmwhle6rjcw7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMillis1221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccpuckn46(){try{__CLR4_4_1mwhmwhle6rjcw7.R.inc(29958); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29959);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29960);test.addMillis(10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29961);assertEquals(18, test.getMillis()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29962);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29963);test.addMillis(-10); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29964);assertEquals(-2, test.getMillis()); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29965);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29966);test.addMillis(0); 
     __CLR4_4_1mwhmwhle6rjcw7.R.inc(29967);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1mwhmwhle6rjcw7.R.flushNeeded();}} 

    

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
    

    

//    public void testSetPeriod_long3() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    public void testSetPeriod_long4() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(12, test.getWeeks());
//        assertEquals(1, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    public void testSetPeriod_long_NoYears() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withYearsRemoved());
//        test.setPeriod(ms);
//        assertEquals(0, test.getYears());
//        assertEquals(15, test.getMonths()); // totalDays=365+85=450=15*30
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMonths() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMonthsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoWeeks() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType().withWeeksRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoDays() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withDaysRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5 + 25 * 24, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoHours() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withHoursRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(0, test.getHours());
//        assertEquals(6 + 5 * 60, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMinutes() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMinutesRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(0, test.getMinutes());
//        assertEquals(7 + 6 * 60, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoSeconds() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withSecondsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(0, test.getSeconds());
//        assertEquals(8 + 7 * 1000, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMillis() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMillisRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(0, test.getMillis());
//        assertEquals(ms - 8, test.toDurationMillis());
//    }

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}
