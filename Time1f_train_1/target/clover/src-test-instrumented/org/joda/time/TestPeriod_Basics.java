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
public class TestPeriod_Basics extends TestCase {static class __CLR4_4_1nnnnnnle6qea32{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,31079,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1nnnnnnle6qea32.R.inc(30659);
        __CLR4_4_1nnnnnnle6qea32.R.inc(30660);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nnnnnnle6qea32.R.inc(30661);
        __CLR4_4_1nnnnnnle6qea32.R.inc(30662);return new TestSuite(TestPeriod_Basics.class);
    }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}}

    public TestPeriod_Basics(String name) {
        super(name);__CLR4_4_1nnnnnnle6qea32.R.inc(30664);try{__CLR4_4_1nnnnnnle6qea32.R.inc(30663);
    }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nnnnnnle6qea32.R.inc(30665);
        __CLR4_4_1nnnnnnle6qea32.R.inc(30666);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nnnnnnle6qea32.R.inc(30667);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nnnnnnle6qea32.R.inc(30668);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nnnnnnle6qea32.R.inc(30669);originalLocale = Locale.getDefault();
        __CLR4_4_1nnnnnnle6qea32.R.inc(30670);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1nnnnnnle6qea32.R.inc(30671);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nnnnnnle6qea32.R.inc(30672);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nnnnnnle6qea32.R.inc(30673);
        __CLR4_4_1nnnnnnle6qea32.R.inc(30674);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nnnnnnle6qea32.R.inc(30675);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nnnnnnle6qea32.R.inc(30676);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nnnnnnle6qea32.R.inc(30677);Locale.setDefault(originalLocale);
        __CLR4_4_1nnnnnnle6qea32.R.inc(30678);originalDateTimeZone = null;
        __CLR4_4_1nnnnnnle6qea32.R.inc(30679);originalTimeZone = null;
        __CLR4_4_1nnnnnnle6qea32.R.inc(30680);originalLocale = null;
    }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlusFields63() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rcy2xjno9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFields63",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rcy2xjno9(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30681); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30682);Period test; 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30683);test = Period.years(1).plusYears(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30684);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30685);test = Period.months(1).plusMonths(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30686);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30687);test = Period.weeks(1).plusWeeks(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30688);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30689);test = Period.days(1).plusDays(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30690);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30691);test = Period.hours(1).plusHours(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30692);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30693);test = Period.minutes(1).plusMinutes(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30694);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30695);test = Period.seconds(1).plusSeconds(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30696);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30697);test = Period.millis(1).plusMillis(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30698);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30699);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30700);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30701);test.plusYears(1); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30702);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testGetPeriodType72() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4zrnjnov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testGetPeriodType72",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4zrnjnov(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30703); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30704);Period test = new Period(0L); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30705);assertEquals(PeriodType.standard(), test.getPeriodType()); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testToPeriod86() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8yhgtnoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToPeriod86",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8yhgtnoy(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30706); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30707);Period test = new Period(123L); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30708);Period result = test.toPeriod(); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30709);assertSame(test, result); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testWithPeriodType187() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157qumcnp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157qumcnp2(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30710); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30711);Period test = new Period(123L); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30712);Period result = test.withPeriodType(PeriodType.standard()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30713);assertSame(test, result); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testWithFields188() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1roy3ifnp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields188",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1roy3ifnp6(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30714); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30715);Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30716);Period test2 = new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30717);Period result = test1.withFields(test2); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30718);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30719);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()), test2); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30720);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 9), result); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testWithField489() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gztqwqnpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField489",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gztqwqnpd(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30721); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30722);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30723);Period result = test.withField(DurationFieldType.years(), 0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30724);assertEquals(test, result); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testWithField290() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqec26nph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqec26nph(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30725); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30726);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30727);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30728);test.withField(null, 6); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30729);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testWithFieldAdded291() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119xj3hnpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119xj3hnpm(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30730); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30731);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30732);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30733);test.withFieldAdded(null, 0); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30734);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testWithFieldAdded192() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143x4k3npr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded192",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143x4k3npr(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30735); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30736);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30737);Period result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30738);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30739);assertEquals(new Period(7, 2, 3, 4, 5, 6, 7, 8), result); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testNormalizedStandard_yearMonth193() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bytw7snpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_yearMonth193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bytw7snpw(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30740); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30741);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30742);Period result = test.normalizedStandard(); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30743);assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30744);assertEquals(new Period(2, 3, 0, 0, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testWith94() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1az63d2nq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWith94",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1az63d2nq1(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30745); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30746);Period test; 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30747);test = Period.years(5).withYears(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30748);assertEquals(test, new Period(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30749);test = Period.months(5).withMonths(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30750);assertEquals(test, new Period(0, 1, 0, 0, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30751);test = Period.weeks(5).withWeeks(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30752);assertEquals(test, new Period(0, 0, 1, 0, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30753);test = Period.days(5).withDays(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30754);assertEquals(test, new Period(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30755);test = Period.hours(5).withHours(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30756);assertEquals(test, new Period(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30757);test = Period.minutes(5).withMinutes(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30758);assertEquals(test, new Period(0, 0, 0, 0, 0, 1, 0, 0, PeriodType.standard())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30759);test = Period.seconds(5).withSeconds(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30760);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 1, 0, PeriodType.standard())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30761);test = Period.millis(5).withMillis(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30762);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.standard())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30763);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30764);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30765);test.withYears(1); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30766);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testPlus96() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yfsvionqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlus96",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yfsvionqn(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30767); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30768);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30769);Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30770);Period test = base.plus((ReadablePeriod) null); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30771);assertSame(base, test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30772);test = base.plus(Period.years(10)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30773);assertEquals(11, test.getYears()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30774);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30775);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30776);assertEquals(4, test.getDays()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30777);assertEquals(5, test.getHours()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30778);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30779);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30780);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30781);test = base.plus(Years.years(10)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30782);assertEquals(11, test.getYears()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30783);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30784);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30785);assertEquals(4, test.getDays()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30786);assertEquals(5, test.getHours()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30787);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30788);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30789);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30790);test = base.plus(Period.days(10)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30791);assertEquals(1, test.getYears()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30792);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30793);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30794);assertEquals(14, test.getDays()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30795);assertEquals(5, test.getHours()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30796);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30797);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30798);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30799);test = baseDaysOnly.plus(Period.years(0)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30800);assertEquals(0, test.getYears()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30801);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30802);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30803);assertEquals(10, test.getDays()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30804);assertEquals(0, test.getHours()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30805);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30806);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30807);assertEquals(0, test.getMillis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30808);test = baseDaysOnly.plus(baseDaysOnly); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30809);assertEquals(0, test.getYears()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30810);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30811);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30812);assertEquals(20, test.getDays()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30813);assertEquals(0, test.getHours()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30814);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30815);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30816);assertEquals(0, test.getMillis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30817);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30818);baseDaysOnly.plus(Period.years(1)); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30819);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30820);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30821);Period.days(Integer.MAX_VALUE).plus(Period.days(1)); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30822);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30823);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30824);Period.days(Integer.MIN_VALUE).plus(Period.days(-1)); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30825);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testMinus97() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r5xug3nsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMinus97",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r5xug3nsa(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30826); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30827);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30828);Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30829);Period test = base.minus((ReadablePeriod) null); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30830);assertSame(base, test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30831);test = base.minus(Period.years(10)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30832);assertEquals(-9, test.getYears()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30833);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30834);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30835);assertEquals(4, test.getDays()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30836);assertEquals(5, test.getHours()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30837);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30838);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30839);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30840);test = base.minus(Years.years(10)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30841);assertEquals(-9, test.getYears()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30842);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30843);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30844);assertEquals(4, test.getDays()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30845);assertEquals(5, test.getHours()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30846);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30847);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30848);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30849);test = base.minus(Period.days(10)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30850);assertEquals(1, test.getYears()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30851);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30852);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30853);assertEquals(-6, test.getDays()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30854);assertEquals(5, test.getHours()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30855);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30856);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30857);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30858);test = baseDaysOnly.minus(Period.years(0)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30859);assertEquals(0, test.getYears()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30860);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30861);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30862);assertEquals(10, test.getDays()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30863);assertEquals(0, test.getHours()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30864);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30865);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30866);assertEquals(0, test.getMillis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30867);test = baseDaysOnly.minus(baseDaysOnly); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30868);assertEquals(0, test.getYears()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30869);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30870);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30871);assertEquals(0, test.getDays()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30872);assertEquals(0, test.getHours()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30873);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30874);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30875);assertEquals(0, test.getMillis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30876);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30877);baseDaysOnly.minus(Period.years(1)); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30878);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30879);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30880);Period.days(Integer.MAX_VALUE).minus(Period.days(-1)); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30881);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30882);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30883);Period.days(Integer.MIN_VALUE).minus(Period.days(1)); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30884);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testMinusFields98() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rm55q5ntx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMinusFields98",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rm55q5ntx(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30885); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30886);Period test; 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30887);test = Period.years(3).minusYears(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30888);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30889);test = Period.months(3).minusMonths(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30890);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30891);test = Period.weeks(3).minusWeeks(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30892);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30893);test = Period.days(3).minusDays(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30894);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30895);test = Period.hours(3).minusHours(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30896);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30897);test = Period.minutes(3).minusMinutes(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30898);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30899);test = Period.seconds(3).minusSeconds(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30900);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30901);test = Period.millis(3).minusMillis(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30902);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30903);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30904);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30905);test.minusYears(1); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30906);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testNegated99() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdecixnuj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNegated99",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdecixnuj(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30907); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30908);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30909);Period test = Period.ZERO.negated(); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30910);assertEquals(Period.ZERO, test); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30911);test = base.negated(); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30912);assertEquals(-1, test.getYears()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30913);assertEquals(-2, test.getMonths()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30914);assertEquals(-3, test.getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30915);assertEquals(-4, test.getDays()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30916);assertEquals(-5, test.getHours()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30917);assertEquals(-6, test.getMinutes()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30918);assertEquals(-7, test.getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30919);assertEquals(-8, test.getMillis()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30920);test = Period.days(Integer.MAX_VALUE).negated(); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30921);assertEquals(-Integer.MAX_VALUE, test.getDays()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30922);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30923);Period.days(Integer.MIN_VALUE).negated(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30924);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testToStandardWeeks_years100() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15fo7l8nv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks_years100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15fo7l8nv1(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30925); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30926);Period test = Period.years(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30927);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30928);test.toStandardWeeks(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30929);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30930);test = Period.years(-1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30931);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30932);test.toStandardWeeks(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30933);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30934);test = Period.years(0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30935);assertEquals(0, test.toStandardWeeks().getWeeks()); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testToStandardHours_years101() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16nq4vxnvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours_years101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16nq4vxnvc(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30936); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30937);Period test = Period.years(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30938);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30939);test.toStandardHours(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30940);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30941);test = Period.years(-1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30942);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30943);test.toStandardHours(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30944);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30945);test = Period.years(0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30946);assertEquals(0, test.toStandardHours().getHours()); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testToStandardMinutes_years102() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lg9lwynvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardMinutes_years102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lg9lwynvn(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30947); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30948);Period test = Period.years(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30949);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30950);test.toStandardMinutes(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30951);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30952);test = Period.years(-1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30953);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30954);test.toStandardMinutes(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30955);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30956);test = Period.years(0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30957);assertEquals(0, test.toStandardMinutes().getMinutes()); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testToStandardSeconds_months103() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1niiusenvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds_months103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1niiusenvy(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30958); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30959);Period test = Period.months(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30960);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30961);test.toStandardSeconds(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30962);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30963);test = Period.months(-1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30964);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30965);test.toStandardSeconds(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30966);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30967);test = Period.months(0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30968);assertEquals(0, test.toStandardSeconds().getSeconds()); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testToStandardDuration_months104() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12he16gnw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDuration_months104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12he16gnw9(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30969); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30970);Period test = Period.months(1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30971);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30972);test.toStandardDuration(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30973);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30974);test = Period.months(-1); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30975);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30976);test.toStandardDuration(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30977);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30978);test = Period.months(0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30979);assertEquals(0, test.toStandardDuration().getMillis()); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testNormalizedStandard_periodType_yearMonth3105() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12d36rinwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonth3105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12d36rinwk(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30980); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30981);Period test = new Period(1, 15, 3, 4, 0, 0, 0, 0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30982);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30983);test.normalizedStandard(PeriodType.dayTime()); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(30984);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testToDurationTo234() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tggxtqnwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToDurationTo234",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tggxtqnwp(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30985); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30986);Period test = new Period(123L); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30987);assertEquals(new Duration(123L), test.toDurationTo(new Instant(123L))); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testToStandardSeconds453() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),30988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ob5mbgnws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ob5mbgnws(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(30988); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30989);Period test = new Period(0, 0, 0, 0, 0, 0, 7, 8); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30990);assertEquals(7, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30991);test = new Period(0, 0, 0, 0, 0, 1, 3, 0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30992);assertEquals(63, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30993);test = new Period(0, 0, 0, 0, 0, 0, 0, 1000); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30994);assertEquals(1, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30995);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30996);assertEquals(Integer.MAX_VALUE, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30997);test = new Period(0, 0, 0, 0, 0, 0, 20, Integer.MAX_VALUE); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30998);long expected = 20; 
     __CLR4_4_1nnnnnnle6qea32.R.inc(30999);expected += ((long) Integer.MAX_VALUE) / DateTimeConstants.MILLIS_PER_SECOND; 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31000);assertEquals(expected, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31001);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 1000); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31002);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(31003);test.toStandardSeconds(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(31004);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testToStandardWeeks534() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),31005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a6xmignx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks534",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a6xmignx9(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(31005); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31006);Period test = new Period(0, 0, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31007);assertEquals(3, test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31008);test = new Period(0, 0, 3, 7, 0, 0, 0, 0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31009);assertEquals(4, test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31010);test = new Period(0, 0, 0, 6, 23, 59, 59, 1000); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31011);assertEquals(1, test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31012);test = new Period(0, 0, Integer.MAX_VALUE, 0, 0, 0, 0, 0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31013);assertEquals(Integer.MAX_VALUE, test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31014);test = new Period(0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31015);long intMax = Integer.MAX_VALUE; 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31016);BigInteger expected = BigInteger.valueOf(intMax); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31017);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31018);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31019);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_HOUR)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31020);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31021);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_WEEK)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31022);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31023);assertEquals(expected.longValue(), test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31024);test = new Period(0, 0, Integer.MAX_VALUE, 7, 0, 0, 0, 0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31025);try { 
         __CLR4_4_1nnnnnnle6qea32.R.inc(31026);test.toStandardWeeks(); 
         __CLR4_4_1nnnnnnle6qea32.R.inc(31027);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testTypeIndexMethods1175() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),31028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16trecvnxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testTypeIndexMethods1175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16trecvnxw(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(31028); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31029);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31030);assertEquals(6, test.size()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31031);assertEquals(DurationFieldType.years(), test.getFieldType(0)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31032);assertEquals(DurationFieldType.days(), test.getFieldType(1)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31033);assertEquals(DurationFieldType.hours(), test.getFieldType(2)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31034);assertEquals(DurationFieldType.minutes(), test.getFieldType(3)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31035);assertEquals(DurationFieldType.seconds(), test.getFieldType(4)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31036);assertEquals(DurationFieldType.millis(), test.getFieldType(5)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31037);assertEquals(true, Arrays.equals(new DurationFieldType[] { DurationFieldType.years(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis() }, test.getFieldTypes())); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testIsSupported1176() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),31038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1be6eoony6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testIsSupported1176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1be6eoony6(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(31038); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31039);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31040);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31041);assertEquals(false, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31042);assertEquals(false, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31043);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31044);assertEquals(true, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31045);assertEquals(true, test.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31046);assertEquals(true, test.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31047);assertEquals(true, test.isSupported(DurationFieldType.millis())); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testEqualsHashCode1178() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),31048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pnq9t8nyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testEqualsHashCode1178",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pnq9t8nyg(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(31048); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31049);Period test1 = new Period(123L); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31050);Period test2 = new Period(123L); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31051);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31052);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31053);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31054);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31055);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31056);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31057);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31058);Period test3 = new Period(321L); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31059);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31060);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31061);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31062);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31063);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31064);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31065);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31066);assertEquals(true, test1.equals(new MockPeriod(123L))); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31067);assertEquals(false, test1.equals(new Period(123L, PeriodType.dayTime()))); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testToString_PeriodFormatter1179() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),31068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tszoi9nz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString_PeriodFormatter1179",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tszoi9nz0(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(31068); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31069);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31070);assertEquals("1 year, 2 months, 3 weeks, 4 days, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", test.toString(PeriodFormat.getDefault())); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31071);test = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31072);assertEquals("0 milliseconds", test.toString(PeriodFormat.getDefault())); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 


public void testToMutablePeriod1189() {__CLR4_4_1nnnnnnle6qea32.R.globalSliceStart(getClass().getName(),31073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3x5uqnz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nnnnnnle6qea32.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nnnnnnle6qea32.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToMutablePeriod1189",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3x5uqnz5(){try{__CLR4_4_1nnnnnnle6qea32.R.inc(31073); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31074);Period test = new Period(123L); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31075);MutablePeriod result = test.toMutablePeriod(); 
     __CLR4_4_1nnnnnnle6qea32.R.inc(31076);assertEquals(test, result); 
 }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

            

    

    

    
    
    class MockPeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;
        public MockPeriod(long value) {
            super(value, null, null);__CLR4_4_1nnnnnnle6qea32.R.inc(31078);try{__CLR4_4_1nnnnnnle6qea32.R.inc(31077);
        }finally{__CLR4_4_1nnnnnnle6qea32.R.flushNeeded();}}
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
