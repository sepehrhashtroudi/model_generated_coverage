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
public class TestMutablePeriod_Updates extends TestCase {static class __CLR4_4_1j5qj5qle6o79yu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,24932,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1j5qj5qle6o79yu.R.inc(24830);
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24831);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j5qj5qle6o79yu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j5qj5qle6o79yu.R.inc(24832);
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24833);return new TestSuite(TestMutablePeriod_Updates.class);
    }finally{__CLR4_4_1j5qj5qle6o79yu.R.flushNeeded();}}

    public TestMutablePeriod_Updates(String name) {
        super(name);__CLR4_4_1j5qj5qle6o79yu.R.inc(24835);try{__CLR4_4_1j5qj5qle6o79yu.R.inc(24834);
    }finally{__CLR4_4_1j5qj5qle6o79yu.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j5qj5qle6o79yu.R.inc(24836);
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24837);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24838);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24839);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24840);originalLocale = Locale.getDefault();
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24841);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24842);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24843);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j5qj5qle6o79yu.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j5qj5qle6o79yu.R.inc(24844);
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24845);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24846);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24847);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24848);Locale.setDefault(originalLocale);
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24849);originalDateTimeZone = null;
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24850);originalTimeZone = null;
        __CLR4_4_1j5qj5qle6o79yu.R.inc(24851);originalLocale = null;
    }finally{__CLR4_4_1j5qj5qle6o79yu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testMergePeriod_RP5315() {__CLR4_4_1j5qj5qle6o79yu.R.globalSliceStart(getClass().getName(),24852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12w8oblj6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j5qj5qle6o79yu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j5qj5qle6o79yu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP5315",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12w8oblj6c(){try{__CLR4_4_1j5qj5qle6o79yu.R.inc(24852); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24853);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24854);test.mergePeriod((ReadablePeriod) null); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24855);assertEquals(1, test.getYears()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24856);assertEquals(2, test.getMonths()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24857);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24858);assertEquals(4, test.getDays()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24859);assertEquals(5, test.getHours()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24860);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24861);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24862);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1j5qj5qle6o79yu.R.flushNeeded();}}
public void testAdd_RInterval1316() {__CLR4_4_1j5qj5qle6o79yu.R.globalSliceStart(getClass().getName(),24863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131zurvj6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j5qj5qle6o79yu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j5qj5qle6o79yu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval1316",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131zurvj6n(){try{__CLR4_4_1j5qj5qle6o79yu.R.inc(24863); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24864);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24865);test.add(new Interval(100L, 200L)); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24866);assertEquals(0, test.getYears()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24867);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24868);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24869);assertEquals(0, test.getDays()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24870);assertEquals(0, test.getHours()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24871);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24872);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24873);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1j5qj5qle6o79yu.R.flushNeeded();}}
public void testSetPeriod_RInterval1477() {__CLR4_4_1j5qj5qle6o79yu.R.globalSliceStart(getClass().getName(),24874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rcj2vnj6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j5qj5qle6o79yu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j5qj5qle6o79yu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval1477",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rcj2vnj6y(){try{__CLR4_4_1j5qj5qle6o79yu.R.inc(24874); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24875);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24876);test.setPeriod(new Interval(100L, 200L)); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24877);assertEquals(0, test.getYears()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24878);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24879);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24880);assertEquals(0, test.getDays()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24881);assertEquals(0, test.getHours()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24882);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24883);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24884);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1j5qj5qle6o79yu.R.flushNeeded();}}
public void testSetPeriod_long_long_NoMinutes479() {__CLR4_4_1j5qj5qle6o79yu.R.globalSliceStart(getClass().getName(),24885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ns28jj79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j5qj5qle6o79yu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j5qj5qle6o79yu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoMinutes479",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ns28jj79(){try{__CLR4_4_1j5qj5qle6o79yu.R.inc(24885); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24886);MutablePeriod test = new MutablePeriod(PeriodType.standard().withMinutesRemoved()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24887);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24888);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24889);test.setPeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24890);assertEquals(1, test.getYears()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24891);assertEquals(1, test.getMonths()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24892);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24893);assertEquals(1, test.getDays()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24894);assertEquals(1, test.getHours()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24895);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24896);assertEquals(61, test.getSeconds()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24897);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1j5qj5qle6o79yu.R.flushNeeded();}}
public void testSetPeriod_RD2481() {__CLR4_4_1j5qj5qle6o79yu.R.globalSliceStart(getClass().getName(),24898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h32qnyj7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j5qj5qle6o79yu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j5qj5qle6o79yu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RD2481",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h32qnyj7m(){try{__CLR4_4_1j5qj5qle6o79yu.R.inc(24898); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24899);MutablePeriod test = new MutablePeriod(); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24900);test.setPeriod((ReadableDuration) null); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24901);assertEquals(0, test.getYears()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24902);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24903);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24904);assertEquals(0, test.getDays()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24905);assertEquals(0, test.getHours()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24906);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24907);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24908);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1j5qj5qle6o79yu.R.flushNeeded();}}
public void testSetHours486() {__CLR4_4_1j5qj5qle6o79yu.R.globalSliceStart(getClass().getName(),24909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngdkcaj7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j5qj5qle6o79yu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j5qj5qle6o79yu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetHours486",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngdkcaj7x(){try{__CLR4_4_1j5qj5qle6o79yu.R.inc(24909); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24910);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24911);test.setHours(10); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24912);assertEquals(10, test.getHours()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24913);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24914);test.setHours(-10); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24915);assertEquals(-10, test.getHours()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24916);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24917);test.setHours(0); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24918);assertEquals(0, test.getHours()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24919);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24920);test.setHours(13); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24921);assertEquals(13, test.getHours()); 
 }finally{__CLR4_4_1j5qj5qle6o79yu.R.flushNeeded();}}
public void testAddSeconds490() {__CLR4_4_1j5qj5qle6o79yu.R.globalSliceStart(getClass().getName(),24922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15pse3mj8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j5qj5qle6o79yu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j5qj5qle6o79yu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddSeconds490",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15pse3mj8a(){try{__CLR4_4_1j5qj5qle6o79yu.R.inc(24922); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24923);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24924);test.addSeconds(10); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24925);assertEquals(16, test.getSeconds()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24926);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24927);test.addSeconds(-10); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24928);assertEquals(-4, test.getSeconds()); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24929);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24930);test.addSeconds(0); 
     __CLR4_4_1j5qj5qle6o79yu.R.inc(24931);assertEquals(3, test.getSeconds()); 
 }finally{__CLR4_4_1j5qj5qle6o79yu.R.flushNeeded();}}
    

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
