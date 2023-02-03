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
public class TestYearMonth_Constructors extends TestCase {static class __CLR4_4_1qmvqmvlc8axemx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,34619,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34519);
        __CLR4_4_1qmvqmvlc8axemx.R.inc(34520);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34521);
        __CLR4_4_1qmvqmvlc8axemx.R.inc(34522);return new TestSuite(TestYearMonth_Constructors.class);
    }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}}

    public TestYearMonth_Constructors(String name) {
        super(name);__CLR4_4_1qmvqmvlc8axemx.R.inc(34524);try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34523);
    }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34525);
        __CLR4_4_1qmvqmvlc8axemx.R.inc(34526);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1qmvqmvlc8axemx.R.inc(34527);zone = DateTimeZone.getDefault();
        __CLR4_4_1qmvqmvlc8axemx.R.inc(34528);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34529);
        __CLR4_4_1qmvqmvlc8axemx.R.inc(34530);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1qmvqmvlc8axemx.R.inc(34531);DateTimeZone.setDefault(zone);
        __CLR4_4_1qmvqmvlc8axemx.R.inc(34532);zone = null;
    }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_FromDateFields137() throws Exception {__CLR4_4_1qmvqmvlc8axemx.R.globalSliceStart(getClass().getName(),34533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qc2n3wqn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qmvqmvlc8axemx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qmvqmvlc8axemx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromDateFields137",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qc2n3wqn9() throws Exception{try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34533); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34534);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34535);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34536);YearMonth expected = new YearMonth(1970, 2); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34537);assertEquals(expected, YearMonth.fromDateFields(cal.getTime())); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34538);try { 
         __CLR4_4_1qmvqmvlc8axemx.R.inc(34539);YearMonth.fromDateFields(null); 
         __CLR4_4_1qmvqmvlc8axemx.R.inc(34540);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}} 


public void testParse_formatter214() throws Throwable {__CLR4_4_1qmvqmvlc8axemx.R.globalSliceStart(getClass().getName(),34541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jp7368qnh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qmvqmvlc8axemx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qmvqmvlc8axemx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_formatter214",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jp7368qnh() throws Throwable{try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34541); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34542);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--MM").withChronology(ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34543);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010--06", f)); 
 }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}} 


public void testConstructor_Object624() throws Throwable {__CLR4_4_1qmvqmvlc8axemx.R.globalSliceStart(getClass().getName(),34544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k42f9lqnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qmvqmvlc8axemx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qmvqmvlc8axemx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object624",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k42f9lqnk() throws Throwable{try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34544); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34545);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34546);YearMonth test = new YearMonth(date); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34547);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34548);assertEquals(1970, test.getYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34549);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}} 


public void testConstructor_Chronology772() throws Throwable {__CLR4_4_1qmvqmvlc8axemx.R.globalSliceStart(getClass().getName(),34550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xnlmyqnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qmvqmvlc8axemx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qmvqmvlc8axemx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Chronology772",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xnlmyqnq() throws Throwable{try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34550); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34551);YearMonth test = new YearMonth(GREGORIAN_PARIS); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34552);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34553);assertEquals(1970, test.getYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34554);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34555);assertEquals(test, YearMonth.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}} 


public void testConstructor_nullChronology815() throws Throwable {__CLR4_4_1qmvqmvlc8axemx.R.globalSliceStart(getClass().getName(),34556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dw4bsjqnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qmvqmvlc8axemx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qmvqmvlc8axemx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullChronology815",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dw4bsjqnw() throws Throwable{try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34556); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34557);YearMonth test = new YearMonth((Chronology) null); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34558);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34559);assertEquals(1970, test.getYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34560);assertEquals(6, test.getMonthOfYear()); 
 }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}} 


public void testConstructor885() throws Throwable {__CLR4_4_1qmvqmvlc8axemx.R.globalSliceStart(getClass().getName(),34561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbj0esqo1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qmvqmvlc8axemx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qmvqmvlc8axemx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor885",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbj0esqo1() throws Throwable{try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34561); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34562);YearMonth test = new YearMonth(); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34563);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34564);assertEquals(1970, test.getYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34565);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34566);assertEquals(test, YearMonth.now()); 
 }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}} 


public void testParse_noFormatter964() throws Throwable {__CLR4_4_1qmvqmvlc8axemx.R.globalSliceStart(getClass().getName(),34567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6cay5qo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qmvqmvlc8axemx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qmvqmvlc8axemx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_noFormatter964",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6cay5qo7() throws Throwable{try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34567); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34568);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010-06-30")); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34569);assertEquals(new YearMonth(2010, 1), YearMonth.parse("2010-002")); 
 }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology990() throws Throwable {__CLR4_4_1qmvqmvlc8axemx.R.globalSliceStart(getClass().getName(),34570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1td9gsxqoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qmvqmvlc8axemx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qmvqmvlc8axemx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object_nullChronology990",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1td9gsxqoa() throws Throwable{try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34570); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34571);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34572);YearMonth test = new YearMonth(date, null); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34573);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34574);assertEquals(1970, test.getYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34575);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}} 


public void testFactory_FromCalendarFields1116() throws Exception {__CLR4_4_1qmvqmvlc8axemx.R.globalSliceStart(getClass().getName(),34576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xreaa4qog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qmvqmvlc8axemx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qmvqmvlc8axemx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromCalendarFields1116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xreaa4qog() throws Exception{try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34576); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34577);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34578);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34579);YearMonth expected = new YearMonth(1970, 2); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34580);assertEquals(expected, YearMonth.fromCalendarFields(cal)); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34581);try { 
         __CLR4_4_1qmvqmvlc8axemx.R.inc(34582);YearMonth.fromCalendarFields(null); 
         __CLR4_4_1qmvqmvlc8axemx.R.inc(34583);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}} 


public void testConstructor_long1_Chronology1303() throws Throwable {__CLR4_4_1qmvqmvlc8axemx.R.globalSliceStart(getClass().getName(),34584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12nzutqoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qmvqmvlc8axemx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qmvqmvlc8axemx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long1_Chronology1303",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12nzutqoo() throws Throwable{try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34584); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34585);YearMonth test = new YearMonth(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34586);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34587);assertEquals(1970, test.getYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34588);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1359() throws Throwable {__CLR4_4_1qmvqmvlc8axemx.R.globalSliceStart(getClass().getName(),34589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bulw5xqot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qmvqmvlc8axemx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qmvqmvlc8axemx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_DateTimeZone1359",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bulw5xqot() throws Throwable{try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34589); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34590);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34591);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34592);YearMonth test = new YearMonth(LONDON); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34593);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34594);assertEquals(2005, test.getYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34595);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34596);assertEquals(test, YearMonth.now(LONDON)); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34597);test = new YearMonth(PARIS); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34598);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34599);assertEquals(2005, test.getYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34600);assertEquals(7, test.getMonthOfYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34601);assertEquals(test, YearMonth.now(PARIS)); 
 }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}} 


public void testConstructor_int_int_Chronology1463() throws Throwable {__CLR4_4_1qmvqmvlc8axemx.R.globalSliceStart(getClass().getName(),34602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9gogaqp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qmvqmvlc8axemx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qmvqmvlc8axemx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_int_int_Chronology1463",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9gogaqp6() throws Throwable{try{__CLR4_4_1qmvqmvlc8axemx.R.inc(34602); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34603);YearMonth test = new YearMonth(1970, 6, GREGORIAN_PARIS); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34604);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34605);assertEquals(1970, test.getYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34606);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34607);try { 
         __CLR4_4_1qmvqmvlc8axemx.R.inc(34608);new YearMonth(Integer.MIN_VALUE, 6, GREGORIAN_PARIS); 
         __CLR4_4_1qmvqmvlc8axemx.R.inc(34609);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34610);try { 
         __CLR4_4_1qmvqmvlc8axemx.R.inc(34611);new YearMonth(Integer.MAX_VALUE, 6, GREGORIAN_PARIS); 
         __CLR4_4_1qmvqmvlc8axemx.R.inc(34612);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34613);try { 
         __CLR4_4_1qmvqmvlc8axemx.R.inc(34614);new YearMonth(1970, 0, GREGORIAN_PARIS); 
         __CLR4_4_1qmvqmvlc8axemx.R.inc(34615);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qmvqmvlc8axemx.R.inc(34616);try { 
         __CLR4_4_1qmvqmvlc8axemx.R.inc(34617);new YearMonth(1970, 13, GREGORIAN_PARIS); 
         __CLR4_4_1qmvqmvlc8axemx.R.inc(34618);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qmvqmvlc8axemx.R.flushNeeded();}} 

    

    

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
