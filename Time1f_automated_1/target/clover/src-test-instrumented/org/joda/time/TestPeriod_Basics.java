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
public class TestPeriod_Basics extends TestCase {static class __CLR4_4_1jr9jr9le6ndpsa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,25734,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25605);
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25606);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25607);
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25608);return new TestSuite(TestPeriod_Basics.class);
    }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}

    public TestPeriod_Basics(String name) {
        super(name);__CLR4_4_1jr9jr9le6ndpsa.R.inc(25610);try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25609);
    }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25611);
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25612);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25613);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25614);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25615);originalLocale = Locale.getDefault();
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25616);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25617);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25618);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25619);
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25620);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25621);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25622);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25623);Locale.setDefault(originalLocale);
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25624);originalDateTimeZone = null;
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25625);originalTimeZone = null;
        __CLR4_4_1jr9jr9le6ndpsa.R.inc(25626);originalLocale = null;
    }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithPeriodType121() {__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceStart(getClass().getName(),25627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1khxsjojrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr9jr9le6ndpsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1khxsjojrv(){try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25627); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25628);Period test = new Period(123L); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25629);Period result = test.withPeriodType(PeriodType.standard()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25630);assertSame(test, result); 
 }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}
public void testWithFields122() {__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceStart(getClass().getName(),25631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1z0jdjrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr9jr9le6ndpsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields122",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1z0jdjrz(){try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25631); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25632);Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25633);Period test2 = new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25634);Period result = test1.withFields(test2); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25635);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25636);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()), test2); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25637);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 9), result); 
 }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}
public void testWithFieldAdded123() {__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceStart(getClass().getName(),25638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cf8xh7js6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr9jr9le6ndpsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cf8xh7js6(){try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25638); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25639);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25640);Period result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25641);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25642);assertEquals(new Period(7, 2, 3, 4, 5, 6, 7, 8), result); 
 }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}
public void testWithFieldAdded424() {__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceStart(getClass().getName(),25643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199otofjsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr9jr9le6ndpsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded424",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199otofjsb(){try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25643); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25644);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25645);Period result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25646);assertSame(test, result); 
 }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}
public void testPlusFields25() {__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceStart(getClass().getName(),25647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bucfjjsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr9jr9le6ndpsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFields25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bucfjjsf(){try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25647); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25648);Period test; 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25649);test = Period.years(1).plusYears(1); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25650);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25651);test = Period.months(1).plusMonths(1); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25652);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25653);test = Period.weeks(1).plusWeeks(1); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25654);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25655);test = Period.days(1).plusDays(1); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25656);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25657);test = Period.hours(1).plusHours(1); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25658);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25659);test = Period.minutes(1).plusMinutes(1); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25660);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25661);test = Period.seconds(1).plusSeconds(1); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25662);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25663);test = Period.millis(1).plusMillis(1); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25664);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25665);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25666);try { 
         __CLR4_4_1jr9jr9le6ndpsa.R.inc(25667);test.plusYears(1); 
         __CLR4_4_1jr9jr9le6ndpsa.R.inc(25668);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}
public void testToStandardDays_years26() {__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceStart(getClass().getName(),25669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ag8onxjt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr9jr9le6ndpsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays_years26",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ag8onxjt1(){try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25669); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25670);Period test = Period.years(1); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25671);try { 
         __CLR4_4_1jr9jr9le6ndpsa.R.inc(25672);test.toStandardDays(); 
         __CLR4_4_1jr9jr9le6ndpsa.R.inc(25673);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25674);test = Period.years(-1); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25675);try { 
         __CLR4_4_1jr9jr9le6ndpsa.R.inc(25676);test.toStandardDays(); 
         __CLR4_4_1jr9jr9le6ndpsa.R.inc(25677);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25678);test = Period.years(0); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25679);assertEquals(0, test.toStandardDays().getDays()); 
 }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}
public void testConstructor_long_PeriodType_Chronology4320() throws Throwable {__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceStart(getClass().getName(),25680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18119dgjtc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr9jr9le6ndpsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testConstructor_long_PeriodType_Chronology4320",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18119dgjtc() throws Throwable{try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25680); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25681);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25682);Period test = new Period(length, (PeriodType) null, (Chronology) null); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25683);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25684);assertEquals(0, test.getYears()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25685);assertEquals(0, test.getMonths()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25686);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25687);assertEquals(0, test.getDays()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25688);assertEquals((4 * 24) + 5, test.getHours()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25689);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25690);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25691);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}
public void testAddDays338() {__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceStart(getClass().getName(),25692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19f5tvrjto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr9jr9le6ndpsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testAddDays338",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19f5tvrjto(){try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25692); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25693);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25694);test.addDays(10); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25695);assertEquals(14, test.getDays()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25696);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25697);test.addDays(-10); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25698);assertEquals(-6, test.getDays()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25699);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25700);test.addDays(0); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25701);assertEquals(4, test.getDays()); 
 }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}
public void testToString_PeriodFormatter589() {__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceStart(getClass().getName(),25702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svmkazjty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr9jr9le6ndpsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString_PeriodFormatter589",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svmkazjty(){try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25702); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25703);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25704);assertEquals("1 year, 2 months, 3 weeks, 4 days, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", test.toString(PeriodFormat.getDefault())); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25705);test = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25706);assertEquals("0 milliseconds", test.toString(PeriodFormat.getDefault())); 
 }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}
public void testSerialization616() throws Exception {__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceStart(getClass().getName(),25707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ao11dwju3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr9jr9le6ndpsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testSerialization616",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ao11dwju3() throws Exception{try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25707); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25708);Days test = Days.SEVEN; 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25709);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25710);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25711);oos.writeObject(test); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25712);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25713);oos.close(); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25714);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25715);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25716);Days result = (Days) ois.readObject(); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25717);ois.close(); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25718);assertSame(test, result); 
 }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}
public void testFactory_days_int618() {__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceStart(getClass().getName(),25719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obcwy2juf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr9jr9le6ndpsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr9jr9le6ndpsa.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testFactory_days_int618",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obcwy2juf(){try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25719); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25720);assertSame(Days.ZERO, Days.days(0)); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25721);assertSame(Days.ONE, Days.days(1)); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25722);assertSame(Days.TWO, Days.days(2)); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25723);assertSame(Days.THREE, Days.days(3)); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25724);assertSame(Days.FOUR, Days.days(4)); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25725);assertSame(Days.FIVE, Days.days(5)); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25726);assertSame(Days.SIX, Days.days(6)); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25727);assertSame(Days.SEVEN, Days.days(7)); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25728);assertSame(Days.MAX_VALUE, Days.days(Integer.MAX_VALUE)); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25729);assertSame(Days.MIN_VALUE, Days.days(Integer.MIN_VALUE)); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25730);assertEquals(-1, Days.days(-1).getDays()); 
     __CLR4_4_1jr9jr9le6ndpsa.R.inc(25731);assertEquals(8, Days.days(8).getDays()); 
 }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

            

    

    

    
    
    class MockPeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;
        public MockPeriod(long value) {
            super(value, null, null);__CLR4_4_1jr9jr9le6ndpsa.R.inc(25733);try{__CLR4_4_1jr9jr9le6ndpsa.R.inc(25732);
        }finally{__CLR4_4_1jr9jr9le6ndpsa.R.flushNeeded();}}
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
