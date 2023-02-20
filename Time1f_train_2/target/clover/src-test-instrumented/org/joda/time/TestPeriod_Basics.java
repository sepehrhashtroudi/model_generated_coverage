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
public class TestPeriod_Basics extends TestCase {static class __CLR4_4_1nlfnlfle6qsf97{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,31008,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30579);
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30580);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30581);
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30582);return new TestSuite(TestPeriod_Basics.class);
    }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}}

    public TestPeriod_Basics(String name) {
        super(name);__CLR4_4_1nlfnlfle6qsf97.R.inc(30584);try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30583);
    }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30585);
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30586);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30587);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30588);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30589);originalLocale = Locale.getDefault();
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30590);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30591);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30592);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30593);
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30594);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30595);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30596);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30597);Locale.setDefault(originalLocale);
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30598);originalDateTimeZone = null;
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30599);originalTimeZone = null;
        __CLR4_4_1nlfnlfle6qsf97.R.inc(30600);originalLocale = null;
    }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlusFields51() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gb4x4nm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFields51",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gb4x4nm1(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30601); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30602);Period test; 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30603);test = Period.years(1).plusYears(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30604);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30605);test = Period.months(1).plusMonths(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30606);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30607);test = Period.weeks(1).plusWeeks(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30608);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30609);test = Period.days(1).plusDays(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30610);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30611);test = Period.hours(1).plusHours(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30612);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30613);test = Period.minutes(1).plusMinutes(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30614);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30615);test = Period.seconds(1).plusSeconds(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30616);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30617);test = Period.millis(1).plusMillis(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30618);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30619);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30620);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30621);test.plusYears(1); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30622);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testToPeriod67() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ek9sanmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToPeriod67",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ek9sanmn(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30623); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30624);Period test = new Period(123L); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30625);Period result = test.toPeriod(); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30626);assertSame(test, result); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testWithPeriodType168() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k252avnmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k252avnmr(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30627); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30628);Period test = new Period(123L); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30629);Period result = test.withPeriodType(PeriodType.standard()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30630);assertSame(test, result); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testWithPeriodType369() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j1fnd6nmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType369",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j1fnd6nmv(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30631); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30632);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30633);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30634);test.withPeriodType(PeriodType.dayTime()); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30635);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testWithFields270() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5r87znn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5r87znn0(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30636); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30637);Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30638);Period test2 = null; 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30639);Period result = test1.withFields(test2); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30640);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30641);assertSame(test1, result); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testWithField471() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wb360jnn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wb360jnn6(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30642); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30643);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30644);Period result = test.withField(DurationFieldType.years(), 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30645);assertEquals(test, result); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testWithField272() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7bjfynna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7bjfynna(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30646); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30647);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30648);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30649);test.withField(null, 6); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30650);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testWithFieldAdded373() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eolyignnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded373",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eolyignnf(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30651); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30652);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30653);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30654);test.withFieldAdded(DurationFieldType.years(), 6); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30655);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testWithFieldAdded474() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fsr8funnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded474",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fsr8funnk(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30656); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30657);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30658);Period result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30659);assertEquals(test, result); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testWithFieldAdded175() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pgb9tknno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pgb9tknno(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30660); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30661);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30662);Period result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30663);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30664);assertEquals(new Period(7, 2, 3, 4, 5, 6, 7, 8), result); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testNormalizedStandard_yearMonth176() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19dk91pnnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_yearMonth176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19dk91pnnt(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30665); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30666);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30667);Period result = test.normalizedStandard(); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30668);assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30669);assertEquals(new Period(2, 3, 0, 0, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testPlus78() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ihwzzgnny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlus78",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ihwzzgnny(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30670); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30671);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30672);Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30673);Period test = base.plus((ReadablePeriod) null); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30674);assertSame(base, test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30675);test = base.plus(Period.years(10)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30676);assertEquals(11, test.getYears()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30677);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30678);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30679);assertEquals(4, test.getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30680);assertEquals(5, test.getHours()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30681);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30682);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30683);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30684);test = base.plus(Years.years(10)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30685);assertEquals(11, test.getYears()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30686);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30687);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30688);assertEquals(4, test.getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30689);assertEquals(5, test.getHours()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30690);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30691);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30692);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30693);test = base.plus(Period.days(10)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30694);assertEquals(1, test.getYears()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30695);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30696);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30697);assertEquals(14, test.getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30698);assertEquals(5, test.getHours()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30699);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30700);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30701);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30702);test = baseDaysOnly.plus(Period.years(0)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30703);assertEquals(0, test.getYears()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30704);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30705);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30706);assertEquals(10, test.getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30707);assertEquals(0, test.getHours()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30708);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30709);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30710);assertEquals(0, test.getMillis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30711);test = baseDaysOnly.plus(baseDaysOnly); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30712);assertEquals(0, test.getYears()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30713);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30714);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30715);assertEquals(20, test.getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30716);assertEquals(0, test.getHours()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30717);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30718);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30719);assertEquals(0, test.getMillis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30720);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30721);baseDaysOnly.plus(Period.years(1)); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30722);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30723);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30724);Period.days(Integer.MAX_VALUE).plus(Period.days(1)); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30725);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30726);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30727);Period.days(Integer.MIN_VALUE).plus(Period.days(-1)); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30728);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testPlusFieldsZero79() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15io0p6npl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFieldsZero79",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15io0p6npl(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30729); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30730);Period test, result; 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30731);test = Period.years(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30732);result = test.plusYears(0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30733);assertSame(test, result); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30734);test = Period.months(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30735);result = test.plusMonths(0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30736);assertSame(test, result); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30737);test = Period.weeks(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30738);result = test.plusWeeks(0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30739);assertSame(test, result); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30740);test = Period.days(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30741);result = test.plusDays(0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30742);assertSame(test, result); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30743);test = Period.hours(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30744);result = test.plusHours(0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30745);assertSame(test, result); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30746);test = Period.minutes(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30747);result = test.plusMinutes(0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30748);assertSame(test, result); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30749);test = Period.seconds(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30750);result = test.plusSeconds(0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30751);assertSame(test, result); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30752);test = Period.millis(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30753);result = test.plusMillis(0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30754);assertSame(test, result); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testMinus80() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pawtmrnqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMinus80",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pawtmrnqb(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30755); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30756);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30757);Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30758);Period test = base.minus((ReadablePeriod) null); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30759);assertSame(base, test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30760);test = base.minus(Period.years(10)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30761);assertEquals(-9, test.getYears()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30762);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30763);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30764);assertEquals(4, test.getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30765);assertEquals(5, test.getHours()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30766);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30767);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30768);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30769);test = base.minus(Years.years(10)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30770);assertEquals(-9, test.getYears()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30771);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30772);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30773);assertEquals(4, test.getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30774);assertEquals(5, test.getHours()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30775);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30776);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30777);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30778);test = base.minus(Period.days(10)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30779);assertEquals(1, test.getYears()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30780);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30781);assertEquals(3, test.getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30782);assertEquals(-6, test.getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30783);assertEquals(5, test.getHours()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30784);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30785);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30786);assertEquals(8, test.getMillis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30787);test = baseDaysOnly.minus(Period.years(0)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30788);assertEquals(0, test.getYears()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30789);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30790);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30791);assertEquals(10, test.getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30792);assertEquals(0, test.getHours()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30793);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30794);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30795);assertEquals(0, test.getMillis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30796);test = baseDaysOnly.minus(baseDaysOnly); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30797);assertEquals(0, test.getYears()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30798);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30799);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30800);assertEquals(0, test.getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30801);assertEquals(0, test.getHours()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30802);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30803);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30804);assertEquals(0, test.getMillis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30805);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30806);baseDaysOnly.minus(Period.years(1)); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30807);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30808);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30809);Period.days(Integer.MAX_VALUE).minus(Period.days(-1)); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30810);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30811);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30812);Period.days(Integer.MIN_VALUE).minus(Period.days(1)); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30813);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testMinusFields81() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oupicpnry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMinusFields81",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oupicpnry(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30814); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30815);Period test; 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30816);test = Period.years(3).minusYears(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30817);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30818);test = Period.months(3).minusMonths(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30819);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30820);test = Period.weeks(3).minusWeeks(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30821);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30822);test = Period.days(3).minusDays(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30823);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30824);test = Period.hours(3).minusHours(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30825);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30826);test = Period.minutes(3).minusMinutes(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30827);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30828);test = Period.seconds(3).minusSeconds(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30829);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30830);test = Period.millis(3).minusMillis(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30831);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30832);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30833);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30834);test.minusYears(1); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30835);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testNegated82() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gt4ymnnsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNegated82",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gt4ymnnsk(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30836); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30837);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30838);Period test = Period.ZERO.negated(); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30839);assertEquals(Period.ZERO, test); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30840);test = base.negated(); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30841);assertEquals(-1, test.getYears()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30842);assertEquals(-2, test.getMonths()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30843);assertEquals(-3, test.getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30844);assertEquals(-4, test.getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30845);assertEquals(-5, test.getHours()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30846);assertEquals(-6, test.getMinutes()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30847);assertEquals(-7, test.getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30848);assertEquals(-8, test.getMillis()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30849);test = Period.days(Integer.MAX_VALUE).negated(); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30850);assertEquals(-Integer.MAX_VALUE, test.getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30851);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30852);Period.days(Integer.MIN_VALUE).negated(); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30853);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testToStandardDays_months83() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19vndsdnt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays_months83",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19vndsdnt2(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30854); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30855);Period test = Period.months(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30856);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30857);test.toStandardDays(); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30858);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30859);test = Period.months(-1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30860);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30861);test.toStandardDays(); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30862);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30863);test = Period.months(0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30864);assertEquals(0, test.toStandardDays().getDays()); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testToStandardHours_years84() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rhvbwfntd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours_years84",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rhvbwfntd(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30865); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30866);Period test = Period.years(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30867);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30868);test.toStandardHours(); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30869);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30870);test = Period.years(-1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30871);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30872);test.toStandardHours(); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30873);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30874);test = Period.years(0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30875);assertEquals(0, test.toStandardHours().getHours()); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testToStandardSeconds_months85() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xddrxdnto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds_months85",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xddrxdnto(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30876); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30877);Period test = Period.months(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30878);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30879);test.toStandardSeconds(); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30880);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30881);test = Period.months(-1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30882);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30883);test.toStandardSeconds(); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30884);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30885);test = Period.months(0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30886);assertEquals(0, test.toStandardSeconds().getSeconds()); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testToStandardDuration_months86() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ssycrdntz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDuration_months86",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ssycrdntz(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30887); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30888);Period test = Period.months(1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30889);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30890);test.toStandardDuration(); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30891);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30892);test = Period.months(-1); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30893);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30894);test.toStandardDuration(); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30895);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30896);test = Period.months(0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30897);assertEquals(0, test.toStandardDuration().getMillis()); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testNormalizedStandard_periodType_yearMonth387() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16zywn3nua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonth387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16zywn3nua(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30898); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30899);Period test = new Period(1, 15, 3, 4, 0, 0, 0, 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30900);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30901);test.normalizedStandard(PeriodType.dayTime()); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30902);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testToDurationTo208() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oc05c5nuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToDurationTo208",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oc05c5nuf(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30903); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30904);Period test = new Period(123L); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30905);assertEquals(new Duration(123L), test.toDurationTo(new Instant(123L))); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testToStandardSeconds425() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z3hpl5nui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds425",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z3hpl5nui(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30906); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30907);Period test = new Period(0, 0, 0, 0, 0, 0, 7, 8); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30908);assertEquals(7, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30909);test = new Period(0, 0, 0, 0, 0, 1, 3, 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30910);assertEquals(63, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30911);test = new Period(0, 0, 0, 0, 0, 0, 0, 1000); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30912);assertEquals(1, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30913);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30914);assertEquals(Integer.MAX_VALUE, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30915);test = new Period(0, 0, 0, 0, 0, 0, 20, Integer.MAX_VALUE); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30916);long expected = 20; 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30917);expected += ((long) Integer.MAX_VALUE) / DateTimeConstants.MILLIS_PER_SECOND; 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30918);assertEquals(expected, test.toStandardSeconds().getSeconds()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30919);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 1000); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30920);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30921);test.toStandardSeconds(); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30922);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testToStandardWeeks511() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18cj9ztnuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks511",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18cj9ztnuz(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30923); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30924);Period test = new Period(0, 0, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30925);assertEquals(3, test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30926);test = new Period(0, 0, 3, 7, 0, 0, 0, 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30927);assertEquals(4, test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30928);test = new Period(0, 0, 0, 6, 23, 59, 59, 1000); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30929);assertEquals(1, test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30930);test = new Period(0, 0, Integer.MAX_VALUE, 0, 0, 0, 0, 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30931);assertEquals(Integer.MAX_VALUE, test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30932);test = new Period(0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30933);long intMax = Integer.MAX_VALUE; 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30934);BigInteger expected = BigInteger.valueOf(intMax); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30935);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30936);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30937);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_HOUR)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30938);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30939);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_WEEK)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30940);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30941);assertEquals(expected.longValue(), test.toStandardWeeks().getWeeks()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30942);test = new Period(0, 0, Integer.MAX_VALUE, 7, 0, 0, 0, 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30943);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30944);test.toStandardWeeks(); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(30945);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testTypeIndexMethods1168() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qsmeiznvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testTypeIndexMethods1168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qsmeiznvm(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30946); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30947);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30948);assertEquals(6, test.size()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30949);assertEquals(DurationFieldType.years(), test.getFieldType(0)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30950);assertEquals(DurationFieldType.days(), test.getFieldType(1)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30951);assertEquals(DurationFieldType.hours(), test.getFieldType(2)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30952);assertEquals(DurationFieldType.minutes(), test.getFieldType(3)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30953);assertEquals(DurationFieldType.seconds(), test.getFieldType(4)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30954);assertEquals(DurationFieldType.millis(), test.getFieldType(5)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30955);assertEquals(true, Arrays.equals(new DurationFieldType[] { DurationFieldType.years(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis() }, test.getFieldTypes())); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testEqualsHashCode1170() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jde1u4nvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testEqualsHashCode1170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jde1u4nvw(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30956); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30957);Period test1 = new Period(123L); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30958);Period test2 = new Period(123L); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30959);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30960);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30961);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30962);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30963);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30964);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30965);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30966);Period test3 = new Period(321L); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30967);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30968);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30969);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30970);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30971);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30972);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30973);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30974);assertEquals(true, test1.equals(new MockPeriod(123L))); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30975);assertEquals(false, test1.equals(new Period(123L, PeriodType.dayTime()))); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testToString_nullPeriodFormatter1171() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jnlk8unwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString_nullPeriodFormatter1171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jnlk8unwg(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30976); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30977);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30978);assertEquals("P1Y2M3W4DT5H6M7.008S", test.toString((PeriodFormatter) null)); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testToString_PeriodFormatter1172() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171zwyynwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString_PeriodFormatter1172",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171zwyynwj(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30979); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30980);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30981);assertEquals("1 year, 2 months, 3 weeks, 4 days, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", test.toString(PeriodFormat.getDefault())); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30982);test = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30983);assertEquals("0 milliseconds", test.toString(PeriodFormat.getDefault())); 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 


public void testToStandardDays1231() {__CLR4_4_1nlfnlfle6qsf97.R.globalSliceStart(getClass().getName(),30984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ix7sopnwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nlfnlfle6qsf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nlfnlfle6qsf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays1231",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ix7sopnwo(){try{__CLR4_4_1nlfnlfle6qsf97.R.inc(30984); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30985);Period test = new Period(0, 0, 0, 4, 5, 6, 7, 8); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30986);assertEquals(4, test.toStandardDays().getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30987);test = new Period(0, 0, 1, 4, 0, 0, 0, 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30988);assertEquals(11, test.toStandardDays().getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30989);test = new Period(0, 0, 0, 0, 23, 59, 59, 1000); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30990);assertEquals(1, test.toStandardDays().getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30991);test = new Period(0, 0, 0, Integer.MAX_VALUE, 0, 0, 0, 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30992);assertEquals(Integer.MAX_VALUE, test.toStandardDays().getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30993);test = new Period(0, 0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30994);long intMax = Integer.MAX_VALUE; 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30995);BigInteger expected = BigInteger.valueOf(intMax); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30996);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30997);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30998);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_HOUR)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(30999);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(31000);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(31001);assertEquals(expected.longValue(), test.toStandardDays().getDays()); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(31002);test = new Period(0, 0, 0, Integer.MAX_VALUE, 24, 0, 0, 0); 
     __CLR4_4_1nlfnlfle6qsf97.R.inc(31003);try { 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(31004);test.toStandardDays(); 
         __CLR4_4_1nlfnlfle6qsf97.R.inc(31005);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

            

    

    

    
    
    class MockPeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;
        public MockPeriod(long value) {
            super(value, null, null);__CLR4_4_1nlfnlfle6qsf97.R.inc(31007);try{__CLR4_4_1nlfnlfle6qsf97.R.inc(31006);
        }finally{__CLR4_4_1nlfnlfle6qsf97.R.flushNeeded();}}
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
