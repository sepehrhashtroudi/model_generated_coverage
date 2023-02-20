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
public class TestYearMonth_Constructors extends TestCase {static class __CLR4_4_1kdikdile6ndpv6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,26463,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kdikdile6ndpv6.R.inc(26406);
        __CLR4_4_1kdikdile6ndpv6.R.inc(26407);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kdikdile6ndpv6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kdikdile6ndpv6.R.inc(26408);
        __CLR4_4_1kdikdile6ndpv6.R.inc(26409);return new TestSuite(TestYearMonth_Constructors.class);
    }finally{__CLR4_4_1kdikdile6ndpv6.R.flushNeeded();}}

    public TestYearMonth_Constructors(String name) {
        super(name);__CLR4_4_1kdikdile6ndpv6.R.inc(26411);try{__CLR4_4_1kdikdile6ndpv6.R.inc(26410);
    }finally{__CLR4_4_1kdikdile6ndpv6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kdikdile6ndpv6.R.inc(26412);
        __CLR4_4_1kdikdile6ndpv6.R.inc(26413);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kdikdile6ndpv6.R.inc(26414);zone = DateTimeZone.getDefault();
        __CLR4_4_1kdikdile6ndpv6.R.inc(26415);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1kdikdile6ndpv6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kdikdile6ndpv6.R.inc(26416);
        __CLR4_4_1kdikdile6ndpv6.R.inc(26417);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kdikdile6ndpv6.R.inc(26418);DateTimeZone.setDefault(zone);
        __CLR4_4_1kdikdile6ndpv6.R.inc(26419);zone = null;
    }finally{__CLR4_4_1kdikdile6ndpv6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor117() throws Throwable {__CLR4_4_1kdikdile6ndpv6.R.globalSliceStart(getClass().getName(),26420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7aft6kdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdikdile6ndpv6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdikdile6ndpv6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7aft6kdw() throws Throwable{try{__CLR4_4_1kdikdile6ndpv6.R.inc(26420); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26421);YearMonth test = new YearMonth(); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26422);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26423);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26424);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26425);assertEquals(test, YearMonth.now()); 
 }finally{__CLR4_4_1kdikdile6ndpv6.R.flushNeeded();}}
public void testConstructor_Chronology118() throws Throwable {__CLR4_4_1kdikdile6ndpv6.R.globalSliceStart(getClass().getName(),26426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1205rqoke2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdikdile6ndpv6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdikdile6ndpv6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Chronology118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1205rqoke2() throws Throwable{try{__CLR4_4_1kdikdile6ndpv6.R.inc(26426); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26427);YearMonth test = new YearMonth(GREGORIAN_PARIS); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26428);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26429);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26430);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26431);assertEquals(test, YearMonth.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1kdikdile6ndpv6.R.flushNeeded();}}
public void testFactory_FromCalendarFields119() throws Exception {__CLR4_4_1kdikdile6ndpv6.R.globalSliceStart(getClass().getName(),26432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4rznske8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdikdile6ndpv6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdikdile6ndpv6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromCalendarFields119",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4rznske8() throws Exception{try{__CLR4_4_1kdikdile6ndpv6.R.inc(26432); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26433);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26434);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26435);YearMonth expected = new YearMonth(1970, 2); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26436);assertEquals(expected, YearMonth.fromCalendarFields(cal)); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26437);try { 
         __CLR4_4_1kdikdile6ndpv6.R.inc(26438);YearMonth.fromCalendarFields(null); 
         __CLR4_4_1kdikdile6ndpv6.R.inc(26439);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kdikdile6ndpv6.R.flushNeeded();}}
public void testConstructor120() throws Throwable {__CLR4_4_1kdikdile6ndpv6.R.globalSliceStart(getClass().getName(),26440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o8fasykeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdikdile6ndpv6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdikdile6ndpv6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor120",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o8fasykeg() throws Throwable{try{__CLR4_4_1kdikdile6ndpv6.R.inc(26440); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26441);YearMonth test = new YearMonth(); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26442);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26443);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26444);assertEquals(6, test.getMonthOfYear()); 
 }finally{__CLR4_4_1kdikdile6ndpv6.R.flushNeeded();}}
public void testConstructor_Object_Chronology121() throws Throwable {__CLR4_4_1kdikdile6ndpv6.R.globalSliceStart(getClass().getName(),26445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17hoju2kel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdikdile6ndpv6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdikdile6ndpv6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object_Chronology121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17hoju2kel() throws Throwable{try{__CLR4_4_1kdikdile6ndpv6.R.inc(26445); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26446);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26447);YearMonth test = new YearMonth(date, GREGORIAN_PARIS); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26448);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26449);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26450);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1kdikdile6ndpv6.R.flushNeeded();}}
public void testParse_noFormatter545() throws Throwable {__CLR4_4_1kdikdile6ndpv6.R.globalSliceStart(getClass().getName(),26451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjbtaker();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdikdile6ndpv6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdikdile6ndpv6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_noFormatter545",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjbtaker() throws Throwable{try{__CLR4_4_1kdikdile6ndpv6.R.inc(26451); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26452);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26453);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26454);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/2010-07-01T14:30")); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26455);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/P1DT2H")); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26456);assertEquals(new MutableInterval(start, end), MutableInterval.parse("P1DT2H/2010-07-01T14:30")); 
 }finally{__CLR4_4_1kdikdile6ndpv6.R.flushNeeded();}}
public void testConstructor_Chronology738() throws Throwable {__CLR4_4_1kdikdile6ndpv6.R.globalSliceStart(getClass().getName(),26457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qeo5t8kex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdikdile6ndpv6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdikdile6ndpv6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Chronology738",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qeo5t8kex() throws Throwable{try{__CLR4_4_1kdikdile6ndpv6.R.inc(26457); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26458);YearMonthDay test = new YearMonthDay(GregorianChronology.getInstance()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26459);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26460);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26461);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kdikdile6ndpv6.R.inc(26462);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1kdikdile6ndpv6.R.flushNeeded();}}
    

    

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
