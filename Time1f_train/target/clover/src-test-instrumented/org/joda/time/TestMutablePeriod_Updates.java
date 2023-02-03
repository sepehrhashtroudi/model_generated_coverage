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
public class TestMutablePeriod_Updates extends TestCase {static class __CLR4_4_1ns2ns2lc8axeac{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,31203,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30818);
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30819);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30820);
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30821);return new TestSuite(TestMutablePeriod_Updates.class);
    }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}}

    public TestMutablePeriod_Updates(String name) {
        super(name);__CLR4_4_1ns2ns2lc8axeac.R.inc(30823);try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30822);
    }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30824);
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30825);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30826);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30827);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30828);originalLocale = Locale.getDefault();
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30829);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30830);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30831);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30832);
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30833);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30834);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30835);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30836);Locale.setDefault(originalLocale);
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30837);originalDateTimeZone = null;
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30838);originalTimeZone = null;
        __CLR4_4_1ns2ns2lc8axeac.R.inc(30839);originalLocale = null;
    }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetPeriod_long245() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1in8ghcnso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1in8ghcnso(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30840); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30841);MutablePeriod test = new MutablePeriod(); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30842);test.setPeriod((4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30843);assertEquals(0, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30844);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30845);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30846);assertEquals(0, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30847);assertEquals((450 * 24) + 5, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30848);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30849);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30850);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSetPeriod_RInterval269() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oagsh9nsz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oagsh9nsz(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30851); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30852);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30853);test.setPeriod((ReadableInterval) null); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30854);assertEquals(0, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30855);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30856);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30857);assertEquals(0, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30858);assertEquals(0, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30859);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30860);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30861);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAdd_RInterval1138() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13vosctnta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval1138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13vosctnta(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30862); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30863);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30864);test.add(new Interval(100L, 200L)); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30865);assertEquals(0, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30866);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30867);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30868);assertEquals(0, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30869);assertEquals(0, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30870);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30871);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30872);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testMergePeriod_RP3176() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v60p2yntl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP3176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v60p2yntl(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30873); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30874);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30875);test.mergePeriod(new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 18)); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30876);assertEquals(0, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30877);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30878);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30879);assertEquals(0, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30880);assertEquals(0, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30881);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30882);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30883);assertEquals(18, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSetPeriod_RD3226() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rym72untw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RD3226",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rym72untw(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30884); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30885);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30886);test.setPeriod((ReadableDuration) null); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30887);assertEquals(0, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30888);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30889);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30890);assertEquals(0, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30891);assertEquals(0, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30892);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30893);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30894);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAddYears233() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1to2lunu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddYears233",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1to2lunu7(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30895); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30896);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30897);test.addYears(10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30898);assertEquals(11, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30899);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30900);test.addYears(-10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30901);assertEquals(-9, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30902);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30903);test.addYears(0); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30904);assertEquals(1, test.getYears()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSetWeeks277() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17h71aunuh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetWeeks277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17h71aunuh(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30905); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30906);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30907);test.setWeeks(10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30908);assertEquals(10, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30909);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30910);test.setWeeks(-10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30911);assertEquals(-10, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30912);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30913);test.setWeeks(0); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30914);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30915);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30916);test.setWeeks(3); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30917);assertEquals(3, test.getWeeks()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSetYears338() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bqq813nuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetYears338",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bqq813nuu(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30918); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30919);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30920);test.setYears(10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30921);assertEquals(10, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30922);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30923);test.setYears(-10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30924);assertEquals(-10, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30925);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30926);test.setYears(0); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30927);assertEquals(0, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30928);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30929);test.setYears(1); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30930);assertEquals(1, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30931);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30932);try { 
         __CLR4_4_1ns2ns2lc8axeac.R.inc(30933);test.setYears(1); 
         __CLR4_4_1ns2ns2lc8axeac.R.inc(30934);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSetPeriod_long_long_NoMinutes427() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iouekwnvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoMinutes427",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iouekwnvb(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30935); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30936);MutablePeriod test = new MutablePeriod(PeriodType.standard().withMinutesRemoved()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30937);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30938);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30939);test.setPeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30940);assertEquals(1, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30941);assertEquals(1, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30942);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30943);assertEquals(1, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30944);assertEquals(1, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30945);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30946);assertEquals(61, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30947);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSetHours442() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xn66yinvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetHours442",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xn66yinvo(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30948); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30949);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30950);test.setHours(10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30951);assertEquals(10, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30952);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30953);test.setHours(-10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30954);assertEquals(-10, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30955);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30956);test.setHours(0); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30957);assertEquals(0, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30958);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30959);test.setHours(5); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30960);assertEquals(5, test.getHours()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAddMinutes531() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sv51bqnw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMinutes531",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sv51bqnw1(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30961); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30962);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30963);test.addMinutes(10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30964);assertEquals(16, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30965);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30966);test.addMinutes(-10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30967);assertEquals(-4, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30968);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30969);test.addMinutes(0); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30970);assertEquals(6, test.getMinutes()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAdd_long_Chronology1550() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bku01bnwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long_Chronology1550",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bku01bnwb(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30971); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30972);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30973);test.add(100L, ISOChronology.getInstance()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30974);assertEquals(0, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30975);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30976);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30977);assertEquals(0, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30978);assertEquals(0, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30979);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30980);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30981);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAdd_long1554() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s2fh6ynwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long1554",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s2fh6ynwm(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30982); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30983);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30984);test.add(100L); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30985);assertEquals(0, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30986);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30987);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30988);assertEquals(0, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30989);assertEquals(0, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30990);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30991);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30992);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAddDays556() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),30993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vs9e2xnwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddDays556",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vs9e2xnwx(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(30993); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30994);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30995);test.addDays(10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30996);assertEquals(14, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30997);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30998);test.addDays(-10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(30999);assertEquals(-6, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31000);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31001);test.addDays(0); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31002);assertEquals(4, test.getDays()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSetPeriod_RInterval1577() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p7oe0knx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval1577",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p7oe0knx7(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31003); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31004);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31005);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31006);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31007);test.setPeriod(new Interval(dt1, dt2)); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31008);assertEquals(1, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31009);assertEquals(1, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31010);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31011);assertEquals(1, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31012);assertEquals(1, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31013);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31014);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31015);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSet_Field853() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mgc1w2nxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSet_Field853",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mgc1w2nxk(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31016); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31017);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31018);test.set(DurationFieldType.years(), 10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31019);assertEquals(10, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31020);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31021);try { 
         __CLR4_4_1ns2ns2lc8axeac.R.inc(31022);test.set(null, 10); 
         __CLR4_4_1ns2ns2lc8axeac.R.inc(31023);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAddHours888() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxlvs1nxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddHours888",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxlvs1nxs(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31024); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31025);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31026);test.addHours(10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31027);assertEquals(15, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31028);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31029);test.addHours(-10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31030);assertEquals(-5, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31031);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31032);test.addHours(0); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31033);assertEquals(5, test.getHours()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAddSeconds970() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16mx6o9ny2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddSeconds970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16mx6o9ny2(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31034); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31035);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31036);test.addSeconds(10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31037);assertEquals(17, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31038);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31039);test.addSeconds(-10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31040);assertEquals(-3, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31041);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31042);test.addSeconds(0); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31043);assertEquals(7, test.getSeconds()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAdd_RD31087() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4qo6unyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD31087",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31044,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4qo6unyc(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31044); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31045);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31046);test.add((ReadableDuration) null); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31047);assertEquals(1, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31048);assertEquals(2, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31049);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31050);assertEquals(4, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31051);assertEquals(5, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31052);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31053);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31054);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAdd_8ints11109() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19kd8lxnyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_8ints11109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19kd8lxnyn(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31055); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31056);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31057);test.add(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31058);assertEquals(1, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31059);assertEquals(2, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31060);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31061);assertEquals(4, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31062);assertEquals(5, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31063);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31064);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31065);assertEquals(108, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSetPeriod_RI_RI21127() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9yy25nyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI21127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9yy25nyy(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31066); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31067);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31068);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31069);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31070);test.setPeriod(dt2, dt1); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31071);assertEquals(-1, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31072);assertEquals(-1, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31073);assertEquals(-1, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31074);assertEquals(-1, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31075);assertEquals(-1, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31076);assertEquals(-1, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31077);assertEquals(-1, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31078);assertEquals(-1, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSetPeriod_8ints21391() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1keacjfnzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints21391",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1keacjfnzb(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31079); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31080);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31081);try { 
         __CLR4_4_1ns2ns2lc8axeac.R.inc(31082);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
         __CLR4_4_1ns2ns2lc8axeac.R.inc(31083);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31084);assertEquals(0, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31085);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31086);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31087);assertEquals(0, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31088);assertEquals(0, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31089);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31090);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31091);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testClear1408() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1orm91pnzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testClear1408",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1orm91pnzo(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31092); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31093);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31094);test.clear(); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31095);assertEquals(new MutablePeriod(), test); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31096);test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31097);test.clear(); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31098);assertEquals(new MutablePeriod(PeriodType.yearMonthDayTime()), test); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSetPeriod_8ints11449() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bf7ldanzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints11449",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bf7ldanzv(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31099); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31100);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31101);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31102);assertEquals(11, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31103);assertEquals(12, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31104);assertEquals(13, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31105);assertEquals(14, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31106);assertEquals(15, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31107);assertEquals(16, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31108);assertEquals(17, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31109);assertEquals(18, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSetPeriod_RI_RI31511() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x4an5fo06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI31511",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x4an5fo06(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31110); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31111);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31112);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31113);test.setPeriod(dt1, dt1); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31114);assertEquals(0, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31115);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31116);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31117);assertEquals(0, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31118);assertEquals(0, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31119);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31120);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31121);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAddWeeks1542() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jvbr2fo0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddWeeks1542",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jvbr2fo0i(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31122); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31123);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31124);test.addWeeks(10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31125);assertEquals(13, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31126);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31127);test.addWeeks(-10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31128);assertEquals(-7, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31129);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31130);test.addWeeks(0); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31131);assertEquals(3, test.getWeeks()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAdd_Field1557() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11uakrto0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_Field1557",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11uakrto0s(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31132); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31133);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31134);test.add(DurationFieldType.years(), 10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31135);assertEquals(11, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31136);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31137);test.add(DurationFieldType.years(), 0); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31138);assertEquals(0, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31139);assertEquals(1, test.getMillis()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31140);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31141);try { 
         __CLR4_4_1ns2ns2lc8axeac.R.inc(31142);test.add(null, 0); 
         __CLR4_4_1ns2ns2lc8axeac.R.inc(31143);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31144);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31145);try { 
         __CLR4_4_1ns2ns2lc8axeac.R.inc(31146);test.add(null, 10); 
         __CLR4_4_1ns2ns2lc8axeac.R.inc(31147);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAddMillis1591() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ntlr2go18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMillis1591",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ntlr2go18(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31148); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31149);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31150);test.addMillis(10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31151);assertEquals(18, test.getMillis()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31152);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31153);test.addMillis(-10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31154);assertEquals(-2, test.getMillis()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31155);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31156);test.addMillis(0); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31157);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testSetPeriod_long11593() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfb2ngo1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long11593",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfb2ngo1i(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31158); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31159);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31160);test.setPeriod(100L); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31161);assertEquals(0, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31162);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31163);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31164);assertEquals(0, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31165);assertEquals(0, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31166);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31167);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31168);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAddMonths1699() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14mvh7yo1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMonths1699",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14mvh7yo1t(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31169); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31170);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31171);test.addMonths(10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31172);assertEquals(12, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31173);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31174);test.addMonths(-10); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31175);assertEquals(-8, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31176);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31177);test.addMonths(0); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31178);assertEquals(2, test.getMonths()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testMergePeriod_RP51704() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ijfu8o23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP51704",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ijfu8o23(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31179); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31180);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31181);test.mergePeriod((ReadablePeriod) null); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31182);assertEquals(1, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31183);assertEquals(2, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31184);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31185);assertEquals(4, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31186);assertEquals(5, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31187);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31188);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31189);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 


public void testAdd_RP41710() {__CLR4_4_1ns2ns2lc8axeac.R.globalSliceStart(getClass().getName(),31190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1774svio2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ns2ns2lc8axeac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ns2ns2lc8axeac.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP41710",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1774svio2e(){try{__CLR4_4_1ns2ns2lc8axeac.R.inc(31190); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31191);MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31192);try { 
         __CLR4_4_1ns2ns2lc8axeac.R.inc(31193);test.add(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
         __CLR4_4_1ns2ns2lc8axeac.R.inc(31194);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31195);assertEquals(1, test.getYears()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31196);assertEquals(2, test.getMonths()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31197);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31198);assertEquals(4, test.getDays()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31199);assertEquals(5, test.getHours()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31200);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31201);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1ns2ns2lc8axeac.R.inc(31202);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1ns2ns2lc8axeac.R.flushNeeded();}} 

    

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
