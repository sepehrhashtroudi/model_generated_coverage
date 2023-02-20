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
public class TestPeriod_Basics extends TestCase {static class __CLR4_4_1jjwjjwle6np4lm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,25442,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25340);
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25341);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25342);
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25343);return new TestSuite(TestPeriod_Basics.class);
    }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}

    public TestPeriod_Basics(String name) {
        super(name);__CLR4_4_1jjwjjwle6np4lm.R.inc(25345);try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25344);
    }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25346);
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25347);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25348);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25349);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25350);originalLocale = Locale.getDefault();
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25351);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25352);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25353);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25354);
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25355);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25356);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25357);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25358);Locale.setDefault(originalLocale);
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25359);originalDateTimeZone = null;
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25360);originalTimeZone = null;
        __CLR4_4_1jjwjjwle6np4lm.R.inc(25361);originalLocale = null;
    }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithField225() {__CLR4_4_1jjwjjwle6np4lm.R.globalSliceStart(getClass().getName(),25362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rze1tyjki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjwjjwle6np4lm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjwjjwle6np4lm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField225",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rze1tyjki(){try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25362); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25363);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25364);try { 
         __CLR4_4_1jjwjjwle6np4lm.R.inc(25365);test.withField(null, 0); 
         __CLR4_4_1jjwjjwle6np4lm.R.inc(25366);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}
public void testWithFieldAdded326() {__CLR4_4_1jjwjjwle6np4lm.R.globalSliceStart(getClass().getName(),25367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hwjg4gjkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjwjjwle6np4lm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjwjjwle6np4lm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded326",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hwjg4gjkn(){try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25367); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25368);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25369);try { 
         __CLR4_4_1jjwjjwle6np4lm.R.inc(25370);test.withFieldAdded(DurationFieldType.years(), 6); 
         __CLR4_4_1jjwjjwle6np4lm.R.inc(25371);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}
public void testMultipliedBy_int28() {__CLR4_4_1jjwjjwle6np4lm.R.globalSliceStart(getClass().getName(),25372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lw1bq1jks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjwjjwle6np4lm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjwjjwle6np4lm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMultipliedBy_int28",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lw1bq1jks(){try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25372); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25373);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25374);Period result = test.multipliedBy(3); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25375);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25376);assertEquals(new Period(2, 2, 3, 4, 5, 6, 7, 8), result); 
 }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}
public void testNegated_long31() {__CLR4_4_1jjwjjwle6np4lm.R.globalSliceStart(getClass().getName(),25377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1spic9cjkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjwjjwle6np4lm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjwjjwle6np4lm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNegated_long31",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1spic9cjkx(){try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25377); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25378);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25379);Period result = test.negated(); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25380);assertEquals(1, test.getYears()); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25381);assertEquals(2, test.getMonths()); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25382);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25383);assertEquals(4, test.getDays()); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25384);assertEquals(5, result.getHours()); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25385);assertEquals(6, result.getMinutes()); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25386);assertEquals(7, result.getSeconds()); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25387);assertEquals(8, result.getMillis()); 
 }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}
public void testNegatedPeriod32() {__CLR4_4_1jjwjjwle6np4lm.R.globalSliceStart(getClass().getName(),25388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gspzp3jl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjwjjwle6np4lm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjwjjwle6np4lm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNegatedPeriod32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gspzp3jl8(){try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25388); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25389);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25390);Period result = test.negated(); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25391);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25392);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), result); 
 }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}
public void testToStandardHours_months33() {__CLR4_4_1jjwjjwle6np4lm.R.globalSliceStart(getClass().getName(),25393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oonpn8jld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjwjjwle6np4lm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjwjjwle6np4lm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours_months33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oonpn8jld(){try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25393); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25394);Period test = Period.months(1); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25395);try { 
         __CLR4_4_1jjwjjwle6np4lm.R.inc(25396);test.toStandardHours(); 
         __CLR4_4_1jjwjjwle6np4lm.R.inc(25397);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25398);test = Period.months(-1); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25399);try { 
         __CLR4_4_1jjwjjwle6np4lm.R.inc(25400);test.toStandardHours(); 
         __CLR4_4_1jjwjjwle6np4lm.R.inc(25401);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25402);test = Period.months(0); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25403);assertEquals(0, test.toStandardHours().getHours()); 
 }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}
public void testToStandardHours_years34() {__CLR4_4_1jjwjjwle6np4lm.R.globalSliceStart(getClass().getName(),25404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kysx50jlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjwjjwle6np4lm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjwjjwle6np4lm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours_years34",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kysx50jlo(){try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25404); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25405);Period test = Period.years(1); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25406);try { 
         __CLR4_4_1jjwjjwle6np4lm.R.inc(25407);test.toStandardHours(); 
         __CLR4_4_1jjwjjwle6np4lm.R.inc(25408);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25409);test = Period.years(-1); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25410);try { 
         __CLR4_4_1jjwjjwle6np4lm.R.inc(25411);test.toStandardHours(); 
         __CLR4_4_1jjwjjwle6np4lm.R.inc(25412);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25413);test = Period.years(0); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25414);assertEquals(0, test.toStandardHours().getHours()); 
 }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}
public void testConstructor_long_long286() throws Throwable {__CLR4_4_1jjwjjwle6np4lm.R.globalSliceStart(getClass().getName(),25415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8tbm7jlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjwjjwle6np4lm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjwjjwle6np4lm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testConstructor_long_long286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8tbm7jlz() throws Throwable{try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25415); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25416);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25417);Duration test = new Duration(dt1.getMillis(), dt1.getMillis()); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25418);assertEquals(dt1.getMillis(), test.getMillis()); 
 }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}
public void testFactory_seconds_int196() {__CLR4_4_1jjwjjwle6np4lm.R.globalSliceStart(getClass().getName(),25419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1whsbn7jm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjwjjwle6np4lm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjwjjwle6np4lm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testFactory_seconds_int196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1whsbn7jm3(){try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25419); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25420);assertSame(Seconds.ZERO, Seconds.seconds(0)); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25421);assertSame(Seconds.ONE, Seconds.seconds(1)); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25422);assertSame(Seconds.TWO, Seconds.seconds(2)); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25423);assertSame(Seconds.THREE, Seconds.seconds(3)); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25424);assertSame(Seconds.MAX_VALUE, Seconds.seconds(Integer.MAX_VALUE)); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25425);assertSame(Seconds.MIN_VALUE, Seconds.seconds(Integer.MIN_VALUE)); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25426);assertEquals(-1, Seconds.seconds(-1).getSeconds()); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25427);assertEquals(4, Seconds.seconds(4).getSeconds()); 
 }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}
public void testFactory_weeks_int215() {__CLR4_4_1jjwjjwle6np4lm.R.globalSliceStart(getClass().getName(),25428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r2tbzfjmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjwjjwle6np4lm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjwjjwle6np4lm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testFactory_weeks_int215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r2tbzfjmc(){try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25428); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25429);assertSame(Weeks.ZERO, Weeks.weeks(0)); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25430);assertSame(Weeks.ONE, Weeks.weeks(1)); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25431);assertSame(Weeks.TWO, Weeks.weeks(2)); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25432);assertSame(Weeks.THREE, Weeks.weeks(3)); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25433);assertSame(Weeks.MAX_VALUE, Weeks.weeks(Integer.MAX_VALUE)); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25434);assertSame(Weeks.MIN_VALUE, Weeks.weeks(Integer.MIN_VALUE)); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25435);assertEquals(-1, Weeks.weeks(-1).getWeeks()); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25436);assertEquals(4, Weeks.weeks(4).getWeeks()); 
 }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}
public void testToDurationTo352() {__CLR4_4_1jjwjjwle6np4lm.R.globalSliceStart(getClass().getName(),25437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19882hnjml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjwjjwle6np4lm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjwjjwle6np4lm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToDurationTo352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19882hnjml(){try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25437); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25438);MutablePeriod test = new MutablePeriod(123L); 
     __CLR4_4_1jjwjjwle6np4lm.R.inc(25439);assertEquals(new Duration(123L), test.toDurationTo(new Instant(0L))); 
 }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

            

    

    

    
    
    class MockPeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;
        public MockPeriod(long value) {
            super(value, null, null);__CLR4_4_1jjwjjwle6np4lm.R.inc(25441);try{__CLR4_4_1jjwjjwle6np4lm.R.inc(25440);
        }finally{__CLR4_4_1jjwjjwle6np4lm.R.flushNeeded();}}
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
