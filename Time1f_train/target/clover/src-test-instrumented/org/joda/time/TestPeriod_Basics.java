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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.BasePeriod;
import org.joda.time.format.PeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Basics extends TestCase {static class __CLR4_4_1opnopnlc8axefy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,32507,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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

    public static void main(String[] args) {try{__CLR4_4_1opnopnlc8axefy.R.inc(32027);
        __CLR4_4_1opnopnlc8axefy.R.inc(32028);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1opnopnlc8axefy.R.inc(32029);
        __CLR4_4_1opnopnlc8axefy.R.inc(32030);return new TestSuite(TestPeriod_Basics.class);
    }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}}

    public TestPeriod_Basics(String name) {
        super(name);__CLR4_4_1opnopnlc8axefy.R.inc(32032);try{__CLR4_4_1opnopnlc8axefy.R.inc(32031);
    }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1opnopnlc8axefy.R.inc(32033);
        __CLR4_4_1opnopnlc8axefy.R.inc(32034);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1opnopnlc8axefy.R.inc(32035);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1opnopnlc8axefy.R.inc(32036);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1opnopnlc8axefy.R.inc(32037);originalLocale = Locale.getDefault();
        __CLR4_4_1opnopnlc8axefy.R.inc(32038);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1opnopnlc8axefy.R.inc(32039);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1opnopnlc8axefy.R.inc(32040);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1opnopnlc8axefy.R.inc(32041);
        __CLR4_4_1opnopnlc8axefy.R.inc(32042);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1opnopnlc8axefy.R.inc(32043);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1opnopnlc8axefy.R.inc(32044);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1opnopnlc8axefy.R.inc(32045);Locale.setDefault(originalLocale);
        __CLR4_4_1opnopnlc8axefy.R.inc(32046);originalDateTimeZone = null;
        __CLR4_4_1opnopnlc8axefy.R.inc(32047);originalTimeZone = null;
        __CLR4_4_1opnopnlc8axefy.R.inc(32048);originalLocale = null;
    }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlus12() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_137q224oq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlus12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_137q224oq9(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32049); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32050);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32051);Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32052);Period test = base.plus((ReadablePeriod) null); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32053);assertSame(base, test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32054);test = base.plus(Period.years(10)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32055);assertEquals(11, test.getYears()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32056);assertEquals(2, test.getMonths()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32057);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32058);assertEquals(4, test.getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32059);assertEquals(5, test.getHours()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32060);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32061);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32062);assertEquals(8, test.getMillis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32063);test = base.plus(Years.years(10)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32064);assertEquals(11, test.getYears()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32065);assertEquals(2, test.getMonths()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32066);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32067);assertEquals(4, test.getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32068);assertEquals(5, test.getHours()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32069);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32070);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32071);assertEquals(8, test.getMillis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32072);test = base.plus(Period.days(10)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32073);assertEquals(1, test.getYears()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32074);assertEquals(2, test.getMonths()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32075);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32076);assertEquals(14, test.getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32077);assertEquals(5, test.getHours()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32078);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32079);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32080);assertEquals(8, test.getMillis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32081);test = baseDaysOnly.plus(Period.years(0)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32082);assertEquals(0, test.getYears()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32083);assertEquals(0, test.getMonths()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32084);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32085);assertEquals(10, test.getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32086);assertEquals(0, test.getHours()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32087);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32088);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32089);assertEquals(0, test.getMillis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32090);test = baseDaysOnly.plus(baseDaysOnly); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32091);assertEquals(0, test.getYears()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32092);assertEquals(0, test.getMonths()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32093);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32094);assertEquals(20, test.getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32095);assertEquals(0, test.getHours()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32096);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32097);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32098);assertEquals(0, test.getMillis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32099);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32100);baseDaysOnly.plus(Period.years(1)); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32101);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32102);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32103);Period.days(Integer.MAX_VALUE).plus(Period.days(1)); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32104);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32105);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32106);Period.days(Integer.MIN_VALUE).plus(Period.days(-1)); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32107);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testGetPeriodType26() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ho2b92orw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testGetPeriodType26",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ho2b92orw(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32108); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32109);Period test = new Period(0L); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32110);assertEquals(PeriodType.standard(), test.getPeriodType()); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToDurationTo48() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s2994porz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToDurationTo48",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s2994porz(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32111); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32112);Period test = new Period(123L); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32113);assertEquals(new Duration(123L), test.toDurationTo(new Instant(123L))); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testWithFieldAdded453() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o55ijfos2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o55ijfos2(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32114); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32115);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32116);Period result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32117);assertEquals(test, result); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testMinus56() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxdojeos6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMinus56",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxdojeos6(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32118); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32119);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32120);Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32121);Period test = base.minus((ReadablePeriod) null); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32122);assertSame(base, test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32123);test = base.minus(Period.years(10)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32124);assertEquals(-9, test.getYears()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32125);assertEquals(2, test.getMonths()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32126);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32127);assertEquals(4, test.getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32128);assertEquals(5, test.getHours()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32129);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32130);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32131);assertEquals(8, test.getMillis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32132);test = base.minus(Years.years(10)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32133);assertEquals(-9, test.getYears()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32134);assertEquals(2, test.getMonths()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32135);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32136);assertEquals(4, test.getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32137);assertEquals(5, test.getHours()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32138);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32139);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32140);assertEquals(8, test.getMillis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32141);test = base.minus(Period.days(10)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32142);assertEquals(1, test.getYears()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32143);assertEquals(2, test.getMonths()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32144);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32145);assertEquals(-6, test.getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32146);assertEquals(5, test.getHours()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32147);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32148);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32149);assertEquals(8, test.getMillis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32150);test = baseDaysOnly.minus(Period.years(0)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32151);assertEquals(0, test.getYears()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32152);assertEquals(0, test.getMonths()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32153);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32154);assertEquals(10, test.getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32155);assertEquals(0, test.getHours()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32156);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32157);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32158);assertEquals(0, test.getMillis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32159);test = baseDaysOnly.minus(baseDaysOnly); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32160);assertEquals(0, test.getYears()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32161);assertEquals(0, test.getMonths()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32162);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32163);assertEquals(0, test.getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32164);assertEquals(0, test.getHours()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32165);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32166);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32167);assertEquals(0, test.getMillis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32168);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32169);baseDaysOnly.minus(Period.years(1)); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32170);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32171);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32172);Period.days(Integer.MAX_VALUE).minus(Period.days(-1)); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32173);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32174);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32175);Period.days(Integer.MIN_VALUE).minus(Period.days(1)); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32176);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testWith169() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev2ltvott();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWith169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev2ltvott(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32177); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32178);Period test; 
     __CLR4_4_1opnopnlc8axefy.R.inc(32179);test = Period.years(5).withYears(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32180);assertEquals(test, new Period(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32181);test = Period.months(5).withMonths(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32182);assertEquals(test, new Period(0, 1, 0, 0, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32183);test = Period.weeks(5).withWeeks(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32184);assertEquals(test, new Period(0, 0, 1, 0, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32185);test = Period.days(5).withDays(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32186);assertEquals(test, new Period(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32187);test = Period.hours(5).withHours(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32188);assertEquals(test, new Period(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32189);test = Period.minutes(5).withMinutes(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32190);assertEquals(test, new Period(0, 0, 0, 0, 0, 1, 0, 0, PeriodType.standard())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32191);test = Period.seconds(5).withSeconds(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32192);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 1, 0, PeriodType.standard())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32193);test = Period.millis(5).withMillis(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32194);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.standard())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32195);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32196);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32197);test.withYears(1); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32198);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToStandardMinutes_years191() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1to4e90ouf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardMinutes_years191",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1to4e90ouf(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32199); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32200);Period test = Period.years(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32201);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32202);test.toStandardMinutes(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32203);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32204);test = Period.years(-1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32205);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32206);test.toStandardMinutes(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32207);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32208);test = Period.years(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32209);assertEquals(0, test.toStandardMinutes().getMinutes()); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testTypeIndexMethods223() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1833briouq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testTypeIndexMethods223",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1833briouq(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32210); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32211);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32212);assertEquals(6, test.size()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32213);assertEquals(DurationFieldType.years(), test.getFieldType(0)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32214);assertEquals(DurationFieldType.days(), test.getFieldType(1)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32215);assertEquals(DurationFieldType.hours(), test.getFieldType(2)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32216);assertEquals(DurationFieldType.minutes(), test.getFieldType(3)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32217);assertEquals(DurationFieldType.seconds(), test.getFieldType(4)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32218);assertEquals(DurationFieldType.millis(), test.getFieldType(5)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32219);assertEquals(true, Arrays.equals(new DurationFieldType[] { DurationFieldType.years(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis() }, test.getFieldTypes())); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToString_nullPeriodFormatter241() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sy6ng5ov0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString_nullPeriodFormatter241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sy6ng5ov0(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32220); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32221);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32222);assertEquals("P1Y2M3W4DT5H6M7.008S", test.toString((PeriodFormatter) null)); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testNegated330() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i80tqxov3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNegated330",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i80tqxov3(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32223); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32224);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32225);Period test = Period.ZERO.negated(); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32226);assertEquals(Period.ZERO, test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32227);test = base.negated(); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32228);assertEquals(-1, test.getYears()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32229);assertEquals(-2, test.getMonths()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32230);assertEquals(-3, test.getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32231);assertEquals(-4, test.getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32232);assertEquals(-5, test.getHours()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32233);assertEquals(-6, test.getMinutes()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32234);assertEquals(-7, test.getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32235);assertEquals(-8, test.getMillis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32236);test = Period.days(Integer.MAX_VALUE).negated(); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32237);assertEquals(-Integer.MAX_VALUE, test.getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32238);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32239);Period.days(Integer.MIN_VALUE).negated(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32240);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToStandardDuration_months404() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18vy3rpovl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDuration_months404",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18vy3rpovl(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32241); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32242);Period test = Period.months(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32243);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32244);test.toStandardDuration(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32245);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32246);test = Period.months(-1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32247);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32248);test.toStandardDuration(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32249);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32250);test = Period.months(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32251);assertEquals(0, test.toStandardDuration().getMillis()); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testNormalizedStandard_yearMonth1407() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1za1nk5ovw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_yearMonth1407",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1za1nk5ovw(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32252); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32253);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32254);Period result = test.normalizedStandard(); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32255);assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32256);assertEquals(new Period(2, 3, 0, 0, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testWithFieldAdded3434() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1do4kufow1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded3434",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1do4kufow1(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32257); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32258);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32259);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32260);test.withFieldAdded(DurationFieldType.years(), 6); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32261);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToStandardSeconds_months492() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sr9m1ow6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds_months492",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sr9m1ow6(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32262); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32263);Period test = Period.months(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32264);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32265);test.toStandardSeconds(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32266);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32267);test = Period.months(-1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32268);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32269);test.toStandardSeconds(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32270);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32271);test = Period.months(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32272);assertEquals(0, test.toStandardSeconds().getSeconds()); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testMinusFields493() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j3js3iowh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMinusFields493",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j3js3iowh(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32273); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32274);Period test; 
     __CLR4_4_1opnopnlc8axefy.R.inc(32275);test = Period.years(3).minusYears(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32276);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32277);test = Period.months(3).minusMonths(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32278);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32279);test = Period.weeks(3).minusWeeks(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32280);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32281);test = Period.days(3).minusDays(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32282);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32283);test = Period.hours(3).minusHours(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32284);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32285);test = Period.minutes(3).minusMinutes(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32286);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32287);test = Period.seconds(3).minusSeconds(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32288);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32289);test = Period.millis(3).minusMillis(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32290);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32291);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32292);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32293);test.minusYears(1); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32294);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToStandardDays_months512() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wde5ecox3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays_months512",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wde5ecox3(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32295); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32296);Period test = Period.months(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32297);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32298);test.toStandardDays(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32299);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32300);test = Period.months(-1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32301);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32302);test.toStandardDays(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32303);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32304);test = Period.months(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32305);assertEquals(0, test.toStandardDays().getDays()); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testIsSupported518() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8bi29oxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testIsSupported518",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8bi29oxe(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32306); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32307);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32308);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32309);assertEquals(false, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32310);assertEquals(false, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32311);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32312);assertEquals(true, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32313);assertEquals(true, test.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32314);assertEquals(true, test.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32315);assertEquals(true, test.isSupported(DurationFieldType.millis())); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testWithFields2572() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufuf12oxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields2572",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufuf12oxo(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32316); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32317);Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32318);Period test2 = null; 
     __CLR4_4_1opnopnlc8axefy.R.inc(32319);Period result = test1.withFields(test2); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32320);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32321);assertSame(test1, result); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testEqualsHashCode606() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ojuvrroxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testEqualsHashCode606",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ojuvrroxu(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32322); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32323);Period test1 = new Period(123L); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32324);Period test2 = new Period(123L); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32325);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32326);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32327);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32328);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32329);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32330);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32331);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32332);Period test3 = new Period(321L); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32333);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32334);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32335);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32336);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32337);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32338);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32339);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32340);assertEquals(true, test1.equals(new MockPeriod(123L))); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32341);assertEquals(false, test1.equals(new Period(123L, PeriodType.dayTime()))); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testWithField2666() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_195yq6roye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField2666",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_195yq6roye(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32342); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32343);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32344);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32345);test.withField(null, 6); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32346);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testWithField4746() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19zy49aoyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField4746",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19zy49aoyj(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32347); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32348);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32349);Period result = test.withField(DurationFieldType.years(), 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32350);assertEquals(test, result); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToString_PeriodFormatter778() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wx8lzoyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString_PeriodFormatter778",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wx8lzoyn(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32351); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32352);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32353);assertEquals("1 year, 2 months, 3 weeks, 4 days, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", test.toString(PeriodFormat.getDefault())); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32354);test = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32355);assertEquals("0 milliseconds", test.toString(PeriodFormat.getDefault())); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testWithPeriodType3873() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14blp4roys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType3873",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14blp4roys(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32356); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32357);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32358);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32359);test.withPeriodType(PeriodType.dayTime()); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32360);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testWithPeriodType1935() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6657ooyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType1935",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6657ooyx(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32361); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32362);Period test = new Period(123L); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32363);Period result = test.withPeriodType(PeriodType.standard()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32364);assertSame(test, result); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToStandardWeeks_years983() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrdngvoz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks_years983",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrdngvoz1(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32365); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32366);Period test = Period.years(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32367);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32368);test.toStandardWeeks(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32369);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32370);test = Period.years(-1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32371);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32372);test.toStandardWeeks(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32373);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32374);test = Period.years(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32375);assertEquals(0, test.toStandardWeeks().getWeeks()); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testWithFields11007() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170ove5ozc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields11007",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170ove5ozc(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32376); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32377);Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32378);Period test2 = new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32379);Period result = test1.withFields(test2); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32380);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32381);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()), test2); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32382);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 9), result); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToStandardHours_years1029() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hkcwa1ozj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours_years1029",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hkcwa1ozj(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32383); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32384);Period test = Period.years(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32385);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32386);test.toStandardHours(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32387);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32388);test = Period.years(-1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32389);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32390);test.toStandardHours(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32391);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1opnopnlc8axefy.R.inc(32392);test = Period.years(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32393);assertEquals(0, test.toStandardHours().getHours()); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToStandardDays1063() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19yy69wozu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays1063",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19yy69wozu(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32394); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32395);Period test = new Period(0, 0, 0, 4, 5, 6, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32396);assertEquals(4, test.toStandardDays().getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32397);test = new Period(0, 0, 1, 4, 0, 0, 0, 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32398);assertEquals(11, test.toStandardDays().getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32399);test = new Period(0, 0, 0, 0, 23, 59, 59, 1000); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32400);assertEquals(1, test.toStandardDays().getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32401);test = new Period(0, 0, 0, Integer.MAX_VALUE, 0, 0, 0, 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32402);assertEquals(Integer.MAX_VALUE, test.toStandardDays().getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32403);test = new Period(0, 0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32404);long intMax = Integer.MAX_VALUE; 
     __CLR4_4_1opnopnlc8axefy.R.inc(32405);BigInteger expected = BigInteger.valueOf(intMax); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32406);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32407);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32408);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_HOUR)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32409);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32410);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32411);assertEquals(expected.longValue(), test.toStandardDays().getDays()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32412);test = new Period(0, 0, 0, Integer.MAX_VALUE, 24, 0, 0, 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32413);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32414);test.toStandardDays(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32415);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testPlusFieldsZero1103() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oig42xp0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFieldsZero1103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oig42xp0g(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32416); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32417);Period test, result; 
     __CLR4_4_1opnopnlc8axefy.R.inc(32418);test = Period.years(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32419);result = test.plusYears(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32420);assertSame(test, result); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32421);test = Period.months(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32422);result = test.plusMonths(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32423);assertSame(test, result); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32424);test = Period.weeks(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32425);result = test.plusWeeks(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32426);assertSame(test, result); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32427);test = Period.days(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32428);result = test.plusDays(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32429);assertSame(test, result); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32430);test = Period.hours(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32431);result = test.plusHours(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32432);assertSame(test, result); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32433);test = Period.minutes(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32434);result = test.plusMinutes(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32435);assertSame(test, result); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32436);test = Period.seconds(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32437);result = test.plusSeconds(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32438);assertSame(test, result); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32439);test = Period.millis(1); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32440);result = test.plusMillis(0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32441);assertSame(test, result); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToStandardSeconds1262() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gpd4pp16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds1262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gpd4pp16(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32442); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32443);Period test = new Period(0, 0, 0, 0, 0, 0, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32444);assertEquals(7, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32445);test = new Period(0, 0, 0, 0, 0, 1, 3, 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32446);assertEquals(63, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32447);test = new Period(0, 0, 0, 0, 0, 0, 0, 1000); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32448);assertEquals(1, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32449);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32450);assertEquals(Integer.MAX_VALUE, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32451);test = new Period(0, 0, 0, 0, 0, 0, 20, Integer.MAX_VALUE); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32452);long expected = 20; 
     __CLR4_4_1opnopnlc8axefy.R.inc(32453);expected += ((long) Integer.MAX_VALUE) / DateTimeConstants.MILLIS_PER_SECOND; 
     __CLR4_4_1opnopnlc8axefy.R.inc(32454);assertEquals(expected, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32455);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 1000); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32456);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32457);test.toStandardSeconds(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32458);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToPeriod1326() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmax6tp1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToPeriod1326",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmax6tp1n(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32459); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32460);Period test = new Period(123L); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32461);Period result = test.toPeriod(); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32462);assertSame(test, result); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToMutablePeriod1426() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tak4ewp1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToMutablePeriod1426",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tak4ewp1r(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32463); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32464);Period test = new Period(123L); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32465);MutablePeriod result = test.toMutablePeriod(); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32466);assertEquals(test, result); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testWithFieldAdded21534() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0waw0p1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded21534",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0waw0p1v(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32467); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32468);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32469);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32470);test.withFieldAdded(null, 0); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32471);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testToStandardWeeks1545() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12zhzjzp20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks1545",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12zhzjzp20(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32472); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32473);Period test = new Period(0, 0, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32474);assertEquals(3, test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32475);test = new Period(0, 0, 3, 7, 0, 0, 0, 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32476);assertEquals(4, test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32477);test = new Period(0, 0, 0, 6, 23, 59, 59, 1000); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32478);assertEquals(1, test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32479);test = new Period(0, 0, Integer.MAX_VALUE, 0, 0, 0, 0, 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32480);assertEquals(Integer.MAX_VALUE, test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32481);test = new Period(0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32482);long intMax = Integer.MAX_VALUE; 
     __CLR4_4_1opnopnlc8axefy.R.inc(32483);BigInteger expected = BigInteger.valueOf(intMax); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32484);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32485);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32486);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_HOUR)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32487);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32488);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_WEEK)); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32489);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32490);assertEquals(expected.longValue(), test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32491);test = new Period(0, 0, Integer.MAX_VALUE, 7, 0, 0, 0, 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32492);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32493);test.toStandardWeeks(); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32494);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testWithFieldAdded11691() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15z6jnbp2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded11691",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15z6jnbp2n(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32495); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32496);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32497);Period result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32498);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32499);assertEquals(new Period(7, 2, 3, 4, 5, 6, 7, 8), result); 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 


public void testNormalizedStandard_periodType_yearMonth31698() {__CLR4_4_1opnopnlc8axefy.R.globalSliceStart(getClass().getName(),32500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o1wmp2p2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1opnopnlc8axefy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1opnopnlc8axefy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonth31698",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o1wmp2p2s(){try{__CLR4_4_1opnopnlc8axefy.R.inc(32500); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32501);Period test = new Period(1, 15, 3, 4, 0, 0, 0, 0); 
     __CLR4_4_1opnopnlc8axefy.R.inc(32502);try { 
         __CLR4_4_1opnopnlc8axefy.R.inc(32503);test.normalizedStandard(PeriodType.dayTime()); 
         __CLR4_4_1opnopnlc8axefy.R.inc(32504);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

            

    

    

    
    
    class MockPeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;
        public MockPeriod(long value) {
            super(value, null, null);__CLR4_4_1opnopnlc8axefy.R.inc(32506);try{__CLR4_4_1opnopnlc8axefy.R.inc(32505);
        }finally{__CLR4_4_1opnopnlc8axefy.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

//    //-----------------------------------------------------------------------
//    public void testAddTo1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, -2);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo3() {
//        long expected = TEST_TIME_NOW;
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 0);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo4() {
//        long expected = TEST_TIME_NOW + 100L;
//        Period test = new Period(100L);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddToWithChronology1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1, ISOChronology.getInstance());
//        assertEquals(expected, added);
//    }
//    
//    public void testAddToWithChronology2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, ISOChronology.getInstanceUTC());  // local specified so use it
//        assertEquals(expected, added);
//    }
//    
//    public void testAddToWithChronology3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, null);  // no chrono specified so use default
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddToRI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        DateTime added = test.addTo(new Instant(), 1);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    public void testAddToRI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new Instant(), -2);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    public void testAddToRI3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(ISOChronology.getInstanceUTC()), -2);  // DateTime has UTC time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstanceUTC(), added.getChronology());
//    }
//    
//    public void testAddToRI4() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance(PARIS).years().add(expected, -2);
//        expected = ISOChronology.getInstance(PARIS).months().add(expected, -4);
//        expected = ISOChronology.getInstance(PARIS).weeks().add(expected, -6);
//        expected = ISOChronology.getInstance(PARIS).days().add(expected, -8);
//        expected = ISOChronology.getInstance(PARIS).hours().add(expected, -10);
//        expected = ISOChronology.getInstance(PARIS).minutes().add(expected, -12);
//        expected = ISOChronology.getInstance(PARIS).seconds().add(expected, -14);
//        expected = ISOChronology.getInstance(PARIS).millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(PARIS), -2);  // DateTime has PARIS time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(PARIS), added.getChronology());
//    }
//    
//    public void testAddToRI5() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(null, -2);  // null has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddIntoRWI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, 1);
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    public void testAddIntoRWI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, -2);  // MutableDateTime has a chronology, use it
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    public void testAddIntoRWI3() {
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        try {
//            test.addInto(null, 1);
//            fail();
//        } catch (IllegalArgumentException ex) {}
//    }
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
//    public void testToDurationMillisFrom() {
//        Period test = new Period(123L);
//        assertEquals(123L, test.toDurationMillisFrom(0L, null));
//    }

    

    

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
    

    

    

    

    

    

    

    

    

    

    

    

    

}
