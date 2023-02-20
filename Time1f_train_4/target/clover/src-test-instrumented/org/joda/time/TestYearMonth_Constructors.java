/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Constructors extends TestCase {static class __CLR4_4_1pajpajle6rjd8k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,32862,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1pajpajle6rjd8k.R.inc(32779);
        __CLR4_4_1pajpajle6rjd8k.R.inc(32780);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pajpajle6rjd8k.R.inc(32781);
        __CLR4_4_1pajpajle6rjd8k.R.inc(32782);return new TestSuite(TestYearMonth_Constructors.class);
    }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}}

    public TestYearMonth_Constructors(String name) {
        super(name);__CLR4_4_1pajpajle6rjd8k.R.inc(32784);try{__CLR4_4_1pajpajle6rjd8k.R.inc(32783);
    }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pajpajle6rjd8k.R.inc(32785);
        __CLR4_4_1pajpajle6rjd8k.R.inc(32786);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pajpajle6rjd8k.R.inc(32787);zone = DateTimeZone.getDefault();
        __CLR4_4_1pajpajle6rjd8k.R.inc(32788);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pajpajle6rjd8k.R.inc(32789);
        __CLR4_4_1pajpajle6rjd8k.R.inc(32790);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pajpajle6rjd8k.R.inc(32791);DateTimeZone.setDefault(zone);
        __CLR4_4_1pajpajle6rjd8k.R.inc(32792);zone = null;
    }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor350() throws Throwable {__CLR4_4_1pajpajle6rjd8k.R.globalSliceStart(getClass().getName(),32793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ado0vnpax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pajpajle6rjd8k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pajpajle6rjd8k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ado0vnpax() throws Throwable{try{__CLR4_4_1pajpajle6rjd8k.R.inc(32793); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32794);YearMonth test = new YearMonth(); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32795);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32796);assertEquals(1970, test.getYear()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32797);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32798);assertEquals(test, YearMonth.now()); 
 }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}} 


public void testConstructor_DateTimeZone351() throws Throwable {__CLR4_4_1pajpajle6rjd8k.R.globalSliceStart(getClass().getName(),32799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ui6xzspb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pajpajle6rjd8k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pajpajle6rjd8k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_DateTimeZone351",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ui6xzspb3() throws Throwable{try{__CLR4_4_1pajpajle6rjd8k.R.inc(32799); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32800);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32801);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32802);YearMonth test = new YearMonth(LONDON); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32803);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32804);assertEquals(2005, test.getYear()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32805);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32806);assertEquals(test, YearMonth.now(LONDON)); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32807);test = new YearMonth(PARIS); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32808);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32809);assertEquals(2005, test.getYear()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32810);assertEquals(7, test.getMonthOfYear()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32811);assertEquals(test, YearMonth.now(PARIS)); 
 }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}} 


public void testConstructor_Chronology352() throws Throwable {__CLR4_4_1pajpajle6rjd8k.R.globalSliceStart(getClass().getName(),32812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m2glzcpbg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pajpajle6rjd8k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pajpajle6rjd8k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Chronology352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m2glzcpbg() throws Throwable{try{__CLR4_4_1pajpajle6rjd8k.R.inc(32812); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32813);YearMonth test = new YearMonth(GREGORIAN_PARIS); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32814);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32815);assertEquals(1970, test.getYear()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32816);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32817);assertEquals(test, YearMonth.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}} 


public void testParse_noFormatter353() throws Throwable {__CLR4_4_1pajpajle6rjd8k.R.globalSliceStart(getClass().getName(),32818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op10vhpbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pajpajle6rjd8k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pajpajle6rjd8k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_noFormatter353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op10vhpbm() throws Throwable{try{__CLR4_4_1pajpajle6rjd8k.R.inc(32818); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32819);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010-06-30")); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32820);assertEquals(new YearMonth(2010, 1), YearMonth.parse("2010-002")); 
 }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}} 


public void testFactory_FromCalendarFields354() throws Exception {__CLR4_4_1pajpajle6rjd8k.R.globalSliceStart(getClass().getName(),32821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196ucuppbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pajpajle6rjd8k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pajpajle6rjd8k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromCalendarFields354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196ucuppbp() throws Exception{try{__CLR4_4_1pajpajle6rjd8k.R.inc(32821); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32822);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32823);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32824);YearMonth expected = new YearMonth(1970, 2); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32825);assertEquals(expected, YearMonth.fromCalendarFields(cal)); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32826);try { 
         __CLR4_4_1pajpajle6rjd8k.R.inc(32827);YearMonth.fromCalendarFields(null); 
         __CLR4_4_1pajpajle6rjd8k.R.inc(32828);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}} 


public void testFactory_FromDateFields355() throws Exception {__CLR4_4_1pajpajle6rjd8k.R.globalSliceStart(getClass().getName(),32829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mbxuo2pbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pajpajle6rjd8k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pajpajle6rjd8k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromDateFields355",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mbxuo2pbx() throws Exception{try{__CLR4_4_1pajpajle6rjd8k.R.inc(32829); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32830);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32831);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32832);YearMonth expected = new YearMonth(1970, 2); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32833);assertEquals(expected, YearMonth.fromDateFields(cal.getTime())); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32834);try { 
         __CLR4_4_1pajpajle6rjd8k.R.inc(32835);YearMonth.fromDateFields(null); 
         __CLR4_4_1pajpajle6rjd8k.R.inc(32836);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}} 


public void testConstructor_nullChronology356() throws Throwable {__CLR4_4_1pajpajle6rjd8k.R.globalSliceStart(getClass().getName(),32837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5negrpc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pajpajle6rjd8k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pajpajle6rjd8k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullChronology356",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5negrpc5() throws Throwable{try{__CLR4_4_1pajpajle6rjd8k.R.inc(32837); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32838);YearMonth test = new YearMonth((Chronology) null); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32839);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32840);assertEquals(1970, test.getYear()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32841);assertEquals(6, test.getMonthOfYear()); 
 }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}} 


public void testConstructor_long1_Chronology357() throws Throwable {__CLR4_4_1pajpajle6rjd8k.R.globalSliceStart(getClass().getName(),32842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ulvi5fpca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pajpajle6rjd8k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pajpajle6rjd8k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long1_Chronology357",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ulvi5fpca() throws Throwable{try{__CLR4_4_1pajpajle6rjd8k.R.inc(32842); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32843);YearMonth test = new YearMonth(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32844);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32845);assertEquals(1970, test.getYear()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32846);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}} 


public void testConstructor_Object358() throws Throwable {__CLR4_4_1pajpajle6rjd8k.R.globalSliceStart(getClass().getName(),32847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de11axpcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pajpajle6rjd8k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pajpajle6rjd8k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object358",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de11axpcf() throws Throwable{try{__CLR4_4_1pajpajle6rjd8k.R.inc(32847); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32848);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32849);YearMonth test = new YearMonth(date); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32850);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32851);assertEquals(1970, test.getYear()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32852);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology359() throws Throwable {__CLR4_4_1pajpajle6rjd8k.R.globalSliceStart(getClass().getName(),32853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5h6p6pcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pajpajle6rjd8k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pajpajle6rjd8k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object_nullChronology359",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5h6p6pcl() throws Throwable{try{__CLR4_4_1pajpajle6rjd8k.R.inc(32853); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32854);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32855);YearMonth test = new YearMonth(date, null); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32856);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32857);assertEquals(1970, test.getYear()); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32858);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}} 


public void testParse_formatter1133() throws Throwable {__CLR4_4_1pajpajle6rjd8k.R.globalSliceStart(getClass().getName(),32859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uzamwdpcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pajpajle6rjd8k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pajpajle6rjd8k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_formatter1133",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uzamwdpcr() throws Throwable{try{__CLR4_4_1pajpajle6rjd8k.R.inc(32859); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32860);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--MM").withChronology(ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1pajpajle6rjd8k.R.inc(32861);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010--06", f)); 
 }finally{__CLR4_4_1pajpajle6rjd8k.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    /**
     * Test constructor (DateTimeZone)
     */
    

    /**
     * Test constructor (DateTimeZone=null)
     */
    

    /**
     * Test constructor (Chronology)
     */
    

    /**
     * Test constructor (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object=null, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology=null)
     */
    

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int)
     */
    

    /**
     * Test constructor (int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, Chronology=null)
     */
    

}
