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
public class TestPeriod_Basics extends TestCase {static class __CLR4_4_1nkknkkle6rclyf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,30909,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1nkknkkle6rclyf.R.inc(30548);
        __CLR4_4_1nkknkkle6rclyf.R.inc(30549);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nkknkkle6rclyf.R.inc(30550);
        __CLR4_4_1nkknkkle6rclyf.R.inc(30551);return new TestSuite(TestPeriod_Basics.class);
    }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}}

    public TestPeriod_Basics(String name) {
        super(name);__CLR4_4_1nkknkkle6rclyf.R.inc(30553);try{__CLR4_4_1nkknkkle6rclyf.R.inc(30552);
    }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nkknkkle6rclyf.R.inc(30554);
        __CLR4_4_1nkknkkle6rclyf.R.inc(30555);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nkknkkle6rclyf.R.inc(30556);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nkknkkle6rclyf.R.inc(30557);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nkknkkle6rclyf.R.inc(30558);originalLocale = Locale.getDefault();
        __CLR4_4_1nkknkkle6rclyf.R.inc(30559);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1nkknkkle6rclyf.R.inc(30560);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nkknkkle6rclyf.R.inc(30561);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nkknkkle6rclyf.R.inc(30562);
        __CLR4_4_1nkknkkle6rclyf.R.inc(30563);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nkknkkle6rclyf.R.inc(30564);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nkknkkle6rclyf.R.inc(30565);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nkknkkle6rclyf.R.inc(30566);Locale.setDefault(originalLocale);
        __CLR4_4_1nkknkkle6rclyf.R.inc(30567);originalDateTimeZone = null;
        __CLR4_4_1nkknkkle6rclyf.R.inc(30568);originalTimeZone = null;
        __CLR4_4_1nkknkkle6rclyf.R.inc(30569);originalLocale = null;
    }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlusFields56() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1npayvhnl6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFields56",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1npayvhnl6(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30570); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30571);Period test; 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30572);test = Period.years(1).plusYears(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30573);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30574);test = Period.months(1).plusMonths(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30575);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30576);test = Period.weeks(1).plusWeeks(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30577);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30578);test = Period.days(1).plusDays(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30579);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30580);test = Period.hours(1).plusHours(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30581);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30582);test = Period.minutes(1).plusMinutes(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30583);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30584);test = Period.seconds(1).plusSeconds(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30585);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30586);test = Period.millis(1).plusMillis(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30587);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30588);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30589);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30590);test.plusYears(1); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30591);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testGetPeriodType63() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kf9ckjnls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testGetPeriodType63",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kf9ckjnls(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30592); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30593);Period test = new Period(0L); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30594);assertEquals(PeriodType.standard(), test.getPeriodType()); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testToPeriod78() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wkaljqnlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToPeriod78",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wkaljqnlv(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30595); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30596);Period test = new Period(123L); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30597);Period result = test.toPeriod(); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30598);assertSame(test, result); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testWithPeriodType179() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i044c9nlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType179",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i044c9nlz(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30599); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30600);Period test = new Period(123L); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30601);Period result = test.withPeriodType(PeriodType.standard()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30602);assertSame(test, result); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testWithPeriodType380() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsyan5nm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsyan5nm3(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30603); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30604);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30605);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30606);test.withPeriodType(PeriodType.dayTime()); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30607);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testWithFields281() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12t3n41nm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12t3n41nm8(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30608); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30609);Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30610);Period test2 = null; 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30611);Period result = test1.withFields(test2); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30612);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30613);assertSame(test1, result); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testWithFields182() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186yarlnme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186yarlnme(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30614); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30615);Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30616);Period test2 = new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30617);Period result = test1.withFields(test2); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30618);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30619);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()), test2); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30620);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 9), result); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testWithField483() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12i61u4nml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField483",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12i61u4nml(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30621); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30622);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30623);Period result = test.withField(DurationFieldType.years(), 0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30624);assertEquals(test, result); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testWithFieldAdded384() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ndn84onmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded384",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ndn84onmp(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30625); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30626);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30627);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30628);test.withFieldAdded(DurationFieldType.years(), 6); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30629);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testWithFieldAdded285() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzskh4nmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded285",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzskh4nmu(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30630); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30631);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30632);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30633);test.withFieldAdded(null, 0); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30634);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testWithFieldAdded486() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0hzetnmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded486",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0hzetnmz(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30635); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30636);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30637);Period result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30638);assertEquals(test, result); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testNormalizedStandard_yearMonth187() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sooxlfnn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_yearMonth187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sooxlfnn3(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30639); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30640);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30641);Period result = test.normalizedStandard(); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30642);assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30643);assertEquals(new Period(2, 3, 0, 0, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testWith88() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rp14qpnn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWith88",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rp14qpnn8(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30644); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30645);Period test; 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30646);test = Period.years(5).withYears(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30647);assertEquals(test, new Period(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30648);test = Period.months(5).withMonths(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30649);assertEquals(test, new Period(0, 1, 0, 0, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30650);test = Period.weeks(5).withWeeks(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30651);assertEquals(test, new Period(0, 0, 1, 0, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30652);test = Period.days(5).withDays(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30653);assertEquals(test, new Period(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30654);test = Period.hours(5).withHours(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30655);assertEquals(test, new Period(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30656);test = Period.minutes(5).withMinutes(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30657);assertEquals(test, new Period(0, 0, 0, 0, 0, 1, 0, 0, PeriodType.standard())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30658);test = Period.seconds(5).withSeconds(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30659);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 1, 0, PeriodType.standard())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30660);test = Period.millis(5).withMillis(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30661);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.standard())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30662);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30663);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30664);test.withYears(1); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30665);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testPlus90() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ext2runnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlus90",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ext2runnu(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30666); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30667);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30668);Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30669);Period test = base.plus((ReadablePeriod) null); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30670);assertSame(base, test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30671);test = base.plus(Period.years(10)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30672);assertEquals(11, test.getYears()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30673);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30674);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30675);assertEquals(4, test.getDays()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30676);assertEquals(5, test.getHours()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30677);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30678);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30679);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30680);test = base.plus(Years.years(10)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30681);assertEquals(11, test.getYears()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30682);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30683);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30684);assertEquals(4, test.getDays()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30685);assertEquals(5, test.getHours()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30686);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30687);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30688);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30689);test = base.plus(Period.days(10)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30690);assertEquals(1, test.getYears()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30691);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30692);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30693);assertEquals(14, test.getDays()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30694);assertEquals(5, test.getHours()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30695);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30696);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30697);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30698);test = baseDaysOnly.plus(Period.years(0)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30699);assertEquals(0, test.getYears()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30700);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30701);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30702);assertEquals(10, test.getDays()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30703);assertEquals(0, test.getHours()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30704);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30705);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30706);assertEquals(0, test.getMillis()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30707);test = baseDaysOnly.plus(baseDaysOnly); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30708);assertEquals(0, test.getYears()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30709);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30710);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30711);assertEquals(20, test.getDays()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30712);assertEquals(0, test.getHours()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30713);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30714);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30715);assertEquals(0, test.getMillis()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30716);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30717);baseDaysOnly.plus(Period.years(1)); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30718);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30719);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30720);Period.days(Integer.MAX_VALUE).plus(Period.days(1)); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30721);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30722);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30723);Period.days(Integer.MIN_VALUE).plus(Period.days(-1)); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30724);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testPlusFieldsZero91() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rx2224nph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFieldsZero91",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rx2224nph(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30725); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30726);Period test, result; 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30727);test = Period.years(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30728);result = test.plusYears(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30729);assertSame(test, result); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30730);test = Period.months(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30731);result = test.plusMonths(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30732);assertSame(test, result); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30733);test = Period.weeks(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30734);result = test.plusWeeks(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30735);assertSame(test, result); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30736);test = Period.days(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30737);result = test.plusDays(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30738);assertSame(test, result); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30739);test = Period.hours(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30740);result = test.plusHours(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30741);assertSame(test, result); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30742);test = Period.minutes(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30743);result = test.plusMinutes(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30744);assertSame(test, result); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30745);test = Period.seconds(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30746);result = test.plusSeconds(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30747);assertSame(test, result); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30748);test = Period.millis(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30749);result = test.plusMillis(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30750);assertSame(test, result); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testMinusFields92() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1845czbnq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMinusFields92",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1845czbnq7(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30751); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30752);Period test; 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30753);test = Period.years(3).minusYears(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30754);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30755);test = Period.months(3).minusMonths(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30756);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30757);test = Period.weeks(3).minusWeeks(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30758);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30759);test = Period.days(3).minusDays(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30760);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30761);test = Period.hours(3).minusHours(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30762);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30763);test = Period.minutes(3).minusMinutes(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30764);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30765);test = Period.seconds(3).minusSeconds(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30766);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30767);test = Period.millis(3).minusMillis(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30768);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30769);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30770);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30771);test.minusYears(1); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30772);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testToStandardWeeks_years93() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xep0zxnqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks_years93",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xep0zxnqt(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30773); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30774);Period test = Period.years(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30775);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30776);test.toStandardWeeks(); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30777);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30778);test = Period.years(-1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30779);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30780);test.toStandardWeeks(); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30781);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30782);test = Period.years(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30783);assertEquals(0, test.toStandardWeeks().getWeeks()); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testToStandardDays_months94() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n37hjnnr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays_months94",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n37hjnnr4(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30784); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30785);Period test = Period.months(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30786);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30787);test.toStandardDays(); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30788);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30789);test = Period.months(-1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30790);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30791);test.toStandardDays(); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30792);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30793);test = Period.months(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30794);assertEquals(0, test.toStandardDays().getDays()); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testToStandardMinutes_years95() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bksxw1nrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardMinutes_years95",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bksxw1nrf(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30795); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30796);Period test = Period.years(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30797);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30798);test.toStandardMinutes(); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30799);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30800);test = Period.years(-1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30801);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30802);test.toStandardMinutes(); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30803);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30804);test = Period.years(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30805);assertEquals(0, test.toStandardMinutes().getMinutes()); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testToStandardSeconds_months96() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14oveprnrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds_months96",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14oveprnrq(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30806); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30807);Period test = Period.months(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30808);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30809);test.toStandardSeconds(); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30810);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30811);test = Period.months(-1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30812);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30813);test.toStandardSeconds(); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30814);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30815);test = Period.months(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30816);assertEquals(0, test.toStandardSeconds().getSeconds()); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testToStandardDuration_months97() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199atvrns1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDuration_months97",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199atvrns1(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30817); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30818);Period test = Period.months(1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30819);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30820);test.toStandardDuration(); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30821);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30822);test = Period.months(-1); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30823);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30824);test.toStandardDuration(); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30825);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30826);test = Period.months(0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30827);assertEquals(0, test.toStandardDuration().getMillis()); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testNormalizedStandard_periodType_yearMonth398() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyvyoxnsc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonth398",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyvyoxnsc(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30828); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30829);Period test = new Period(1, 15, 3, 4, 0, 0, 0, 0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30830);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30831);test.normalizedStandard(PeriodType.dayTime()); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30832);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testTypeIndexMethods1169() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njmfqinsh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testTypeIndexMethods1169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njmfqinsh(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30833); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30834);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30835);assertEquals(6, test.size()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30836);assertEquals(DurationFieldType.years(), test.getFieldType(0)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30837);assertEquals(DurationFieldType.days(), test.getFieldType(1)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30838);assertEquals(DurationFieldType.hours(), test.getFieldType(2)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30839);assertEquals(DurationFieldType.minutes(), test.getFieldType(3)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30840);assertEquals(DurationFieldType.seconds(), test.getFieldType(4)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30841);assertEquals(DurationFieldType.millis(), test.getFieldType(5)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30842);assertEquals(true, Arrays.equals(new DurationFieldType[] { DurationFieldType.years(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis() }, test.getFieldTypes())); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testIsSupported1170() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_183te26nsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testIsSupported1170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_183te26nsr(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30843); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30844);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30845);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30846);assertEquals(false, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30847);assertEquals(false, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30848);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30849);assertEquals(true, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30850);assertEquals(true, test.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30851);assertEquals(true, test.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30852);assertEquals(true, test.isSupported(DurationFieldType.millis())); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testEqualsHashCode1171() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mme0mlnt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testEqualsHashCode1171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mme0mlnt1(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30853); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30854);Period test1 = new Period(123L); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30855);Period test2 = new Period(123L); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30856);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30857);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30858);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30859);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30860);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30861);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30862);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30863);Period test3 = new Period(321L); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30864);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30865);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30866);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30867);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30868);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30869);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30870);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30871);assertEquals(true, test1.equals(new MockPeriod(123L))); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30872);assertEquals(false, test1.equals(new Period(123L, PeriodType.dayTime()))); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testToString_nullPeriodFormatter1172() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gellgdntl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString_nullPeriodFormatter1172",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gellgdntl(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30873); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30874);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30875);assertEquals("P1Y2M3W4DT5H6M7.008S", test.toString((PeriodFormatter) null)); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testToString_PeriodFormatter1173() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aazvrfnto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString_PeriodFormatter1173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aazvrfnto(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30876); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30877);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30878);assertEquals("1 year, 2 months, 3 weeks, 4 days, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", test.toString(PeriodFormat.getDefault())); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30879);test = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30880);assertEquals("0 milliseconds", test.toString(PeriodFormat.getDefault())); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testToMutablePeriod1186() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dcx9hbntt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToMutablePeriod1186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dcx9hbntt(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30881); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30882);Period test = new Period(123L); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30883);MutablePeriod result = test.toMutablePeriod(); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30884);assertEquals(test, result); 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 


public void testToStandardDays1237() {__CLR4_4_1nkknkkle6rclyf.R.globalSliceStart(getClass().getName(),30885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ks025ntx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nkknkkle6rclyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nkknkkle6rclyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays1237",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ks025ntx(){try{__CLR4_4_1nkknkkle6rclyf.R.inc(30885); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30886);Period test = new Period(0, 0, 0, 4, 5, 6, 7, 8); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30887);assertEquals(4, test.toStandardDays().getDays()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30888);test = new Period(0, 0, 1, 4, 0, 0, 0, 0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30889);assertEquals(11, test.toStandardDays().getDays()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30890);test = new Period(0, 0, 0, 0, 23, 59, 59, 1000); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30891);assertEquals(1, test.toStandardDays().getDays()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30892);test = new Period(0, 0, 0, Integer.MAX_VALUE, 0, 0, 0, 0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30893);assertEquals(Integer.MAX_VALUE, test.toStandardDays().getDays()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30894);test = new Period(0, 0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30895);long intMax = Integer.MAX_VALUE; 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30896);BigInteger expected = BigInteger.valueOf(intMax); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30897);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30898);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30899);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_HOUR)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30900);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30901);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30902);assertEquals(expected.longValue(), test.toStandardDays().getDays()); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30903);test = new Period(0, 0, 0, Integer.MAX_VALUE, 24, 0, 0, 0); 
     __CLR4_4_1nkknkkle6rclyf.R.inc(30904);try { 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30905);test.toStandardDays(); 
         __CLR4_4_1nkknkkle6rclyf.R.inc(30906);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

            

    

    

    
    
    class MockPeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;
        public MockPeriod(long value) {
            super(value, null, null);__CLR4_4_1nkknkkle6rclyf.R.inc(30908);try{__CLR4_4_1nkknkkle6rclyf.R.inc(30907);
        }finally{__CLR4_4_1nkknkkle6rclyf.R.flushNeeded();}}
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
