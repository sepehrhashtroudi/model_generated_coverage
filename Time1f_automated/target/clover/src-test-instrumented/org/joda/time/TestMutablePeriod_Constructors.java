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
public class TestMutablePeriod_Constructors extends TestCase {static class __CLR4_4_1ibhibhlccietrr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,23878,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1ibhibhlccietrr.R.inc(23741);
        __CLR4_4_1ibhibhlccietrr.R.inc(23742);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ibhibhlccietrr.R.inc(23743);
        __CLR4_4_1ibhibhlccietrr.R.inc(23744);return new TestSuite(TestMutablePeriod_Constructors.class);
    }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}

    public TestMutablePeriod_Constructors(String name) {
        super(name);__CLR4_4_1ibhibhlccietrr.R.inc(23746);try{__CLR4_4_1ibhibhlccietrr.R.inc(23745);
    }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ibhibhlccietrr.R.inc(23747);
        __CLR4_4_1ibhibhlccietrr.R.inc(23748);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ibhibhlccietrr.R.inc(23749);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ibhibhlccietrr.R.inc(23750);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ibhibhlccietrr.R.inc(23751);originalLocale = Locale.getDefault();
        __CLR4_4_1ibhibhlccietrr.R.inc(23752);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ibhibhlccietrr.R.inc(23753);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ibhibhlccietrr.R.inc(23754);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ibhibhlccietrr.R.inc(23755);
        __CLR4_4_1ibhibhlccietrr.R.inc(23756);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ibhibhlccietrr.R.inc(23757);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ibhibhlccietrr.R.inc(23758);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ibhibhlccietrr.R.inc(23759);Locale.setDefault(originalLocale);
        __CLR4_4_1ibhibhlccietrr.R.inc(23760);originalDateTimeZone = null;
        __CLR4_4_1ibhibhlccietrr.R.inc(23761);originalTimeZone = null;
        __CLR4_4_1ibhibhlccietrr.R.inc(23762);originalLocale = null;
    }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testMutablePeriod56() {__CLR4_4_1ibhibhlccietrr.R.globalSliceStart(getClass().getName(),23763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nmbj7nic3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhlccietrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhlccietrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testMutablePeriod56",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nmbj7nic3(){try{__CLR4_4_1ibhibhlccietrr.R.inc(23763); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23764);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23765);MutablePeriod result = test.toMutablePeriod(); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23766);assertEquals(test, result); 
 }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}
public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth166() throws Throwable {__CLR4_4_1ibhibhlccietrr.R.globalSliceStart(getClass().getName(),23767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apk619ic7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhlccietrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhlccietrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apk619ic7() throws Throwable{try{__CLR4_4_1ibhibhlccietrr.R.inc(23767); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23768);LocalDate dt1 = new LocalDate(2004, 12, 29); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23769);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23770);Period test = new Period(dt1, dt2); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23771);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23772);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}
public void testConstructor_RI_RI4266() throws Throwable {__CLR4_4_1ibhibhlccietrr.R.globalSliceStart(getClass().getName(),23773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ncqz5ficd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhlccietrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhlccietrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI4266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ncqz5ficd() throws Throwable{try{__CLR4_4_1ibhibhlccietrr.R.inc(23773); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23774);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23775);DateTime dt2 = null; 
     __CLR4_4_1ibhibhlccietrr.R.inc(23776);Period test = new Period(dt1, dt2); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23777);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23778);assertEquals(-3, test.getYears()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23779);assertEquals(-1, test.getMonths()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23780);assertEquals(-1, test.getWeeks()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23781);assertEquals(-1, test.getDays()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23782);assertEquals(-1, test.getHours()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23783);assertEquals(-1, test.getMinutes()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23784);assertEquals(-1, test.getSeconds()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23785);assertEquals(-1, test.getMillis()); 
 }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}
public void testSetDays267() {__CLR4_4_1ibhibhlccietrr.R.globalSliceStart(getClass().getName(),23786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1blqbd9icq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhlccietrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhlccietrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testSetDays267",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1blqbd9icq(){try{__CLR4_4_1ibhibhlccietrr.R.inc(23786); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23787);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23788);test.setDays(10); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23789);assertEquals(10, test.getDays()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23790);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23791);test.setDays(-10); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23792);assertEquals(-10, test.getDays()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23793);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23794);test.setDays(0); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23795);assertEquals(0, test.getDays()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23796);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23797);test.setDays(5); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23798);assertEquals(5, test.getDays()); 
 }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}
public void testSetYears269() {__CLR4_4_1ibhibhlccietrr.R.globalSliceStart(getClass().getName(),23799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1brl39yid3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhlccietrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhlccietrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testSetYears269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1brl39yid3(){try{__CLR4_4_1ibhibhlccietrr.R.inc(23799); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23800);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23801);test.setYears(10); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23802);assertEquals(10, test.getYears()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23803);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23804);test.setYears(-10); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23805);assertEquals(-10, test.getYears()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23806);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23807);test.setYears(0); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23808);assertEquals(0, test.getYears()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23809);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23810);test.setYears(1); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23811);assertEquals(1, test.getYears()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23812);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23813);try { 
         __CLR4_4_1ibhibhlccietrr.R.inc(23814);test.setYears(1); 
         __CLR4_4_1ibhibhlccietrr.R.inc(23815);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}
public void testConstructor_long_long_Chronology2270() throws Throwable {__CLR4_4_1ibhibhlccietrr.R.globalSliceStart(getClass().getName(),23816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aib0y7idk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhlccietrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhlccietrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_Chronology2270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aib0y7idk() throws Throwable{try{__CLR4_4_1ibhibhlccietrr.R.inc(23816); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23817);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23818);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23819);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (Chronology) null); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23820);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23821);assertEquals(1, test.getYears()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23822);assertEquals(1, test.getMonths()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23823);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23824);assertEquals(1, test.getDays()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23825);assertEquals(1, test.getHours()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23826);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23827);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23828);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}
public void testSetHours271() {__CLR4_4_1ibhibhlccietrr.R.globalSliceStart(getClass().getName(),23829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i8rsfgidx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhlccietrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhlccietrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testSetHours271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i8rsfgidx(){try{__CLR4_4_1ibhibhlccietrr.R.inc(23829); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23830);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23831);test.setHours(10); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23832);assertEquals(10, test.getHours()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23833);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23834);test.setHours(-10); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23835);assertEquals(-10, test.getHours()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23836);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23837);test.setHours(0); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23838);assertEquals(0, test.getHours()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23839);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23840);test.setHours(5); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23841);assertEquals(5, test.getHours()); 
 }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}
public void testSetSeconds272() {__CLR4_4_1ibhibhlccietrr.R.globalSliceStart(getClass().getName(),23842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5ox51iea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhlccietrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhlccietrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testSetSeconds272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5ox51iea(){try{__CLR4_4_1ibhibhlccietrr.R.inc(23842); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23843);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23844);test.setSeconds(10); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23845);assertEquals(10, test.getSeconds()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23846);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23847);test.setSeconds(-10); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23848);assertEquals(-10, test.getSeconds()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23849);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23850);test.setSeconds(0); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23851);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23852);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23853);test.setSeconds(5); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23854);assertEquals(5, test.getSeconds()); 
 }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}
public void testSetMinutes274() {__CLR4_4_1ibhibhlccietrr.R.globalSliceStart(getClass().getName(),23855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ytklaxien();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhlccietrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhlccietrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testSetMinutes274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ytklaxien(){try{__CLR4_4_1ibhibhlccietrr.R.inc(23855); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23856);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23857);test.setMinutes(10); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23858);assertEquals(10, test.getMinutes()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23859);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23860);test.setMinutes(-10); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23861);assertEquals(-10, test.getMinutes()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23862);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23863);test.setMinutes(0); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23864);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23865);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23866);test.setMinutes(5); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23867);assertEquals(5, test.getMinutes()); 
 }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}
public void testParse_noFormatter293() throws Throwable {__CLR4_4_1ibhibhlccietrr.R.globalSliceStart(getClass().getName(),23868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n37ygif0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhlccietrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhlccietrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testParse_noFormatter293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n37ygif0() throws Throwable{try{__CLR4_4_1ibhibhlccietrr.R.inc(23868); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23869);assertEquals(new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8), MutablePeriod.parse("P1Y2M3W4DT5H6M7.008S")); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23870);assertEquals(new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8), MutablePeriod.parse("P1DT5H6M7.008S")); 
 }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}
public void testToMutablePeriod294() {__CLR4_4_1ibhibhlccietrr.R.globalSliceStart(getClass().getName(),23871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119xymyif3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhlccietrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhlccietrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testToMutablePeriod294",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119xymyif3(){try{__CLR4_4_1ibhibhlccietrr.R.inc(23871); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23872);Period test = new Period(123L); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23873);MutablePeriod result = test.toMutablePeriod(); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23874);assertEquals(test, result); 
 }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}
public void testParse_noFormatter295() throws Throwable {__CLR4_4_1ibhibhlccietrr.R.globalSliceStart(getClass().getName(),23875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a535jeif7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibhibhlccietrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibhibhlccietrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testParse_noFormatter295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a535jeif7() throws Throwable{try{__CLR4_4_1ibhibhlccietrr.R.inc(23875); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23876);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), MutablePeriod.parse("P1Y2M3W4DT5H6M7.008S")); 
     __CLR4_4_1ibhibhlccietrr.R.inc(23877);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), MutablePeriod.parse("P1DT5H6M7.008S")); 
 }finally{__CLR4_4_1ibhibhlccietrr.R.flushNeeded();}}
    

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
