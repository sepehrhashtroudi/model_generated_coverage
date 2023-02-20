/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Constructors extends TestCase {static class __CLR4_4_1owrowrle6qsfbz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,32326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1owrowrle6qsfbz.R.inc(32283);
        __CLR4_4_1owrowrle6qsfbz.R.inc(32284);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1owrowrle6qsfbz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1owrowrle6qsfbz.R.inc(32285);
        __CLR4_4_1owrowrle6qsfbz.R.inc(32286);return new TestSuite(TestYearMonthDay_Constructors.class);
    }finally{__CLR4_4_1owrowrle6qsfbz.R.flushNeeded();}}

    public TestYearMonthDay_Constructors(String name) {
        super(name);__CLR4_4_1owrowrle6qsfbz.R.inc(32288);try{__CLR4_4_1owrowrle6qsfbz.R.inc(32287);
    }finally{__CLR4_4_1owrowrle6qsfbz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1owrowrle6qsfbz.R.inc(32289);
        __CLR4_4_1owrowrle6qsfbz.R.inc(32290);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1owrowrle6qsfbz.R.inc(32291);zone = DateTimeZone.getDefault();
        __CLR4_4_1owrowrle6qsfbz.R.inc(32292);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1owrowrle6qsfbz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1owrowrle6qsfbz.R.inc(32293);
        __CLR4_4_1owrowrle6qsfbz.R.inc(32294);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1owrowrle6qsfbz.R.inc(32295);DateTimeZone.setDefault(zone);
        __CLR4_4_1owrowrle6qsfbz.R.inc(32296);zone = null;
    }finally{__CLR4_4_1owrowrle6qsfbz.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_FromCalendarFields16() throws Exception {__CLR4_4_1owrowrle6qsfbz.R.globalSliceStart(getClass().getName(),32297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ykesa4ox5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1owrowrle6qsfbz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1owrowrle6qsfbz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testFactory_FromCalendarFields16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ykesa4ox5() throws Exception{try{__CLR4_4_1owrowrle6qsfbz.R.inc(32297); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32298);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32299);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32300);YearMonthDay expected = new YearMonthDay(1970, 2, 3); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32301);assertEquals(expected, YearMonthDay.fromCalendarFields(cal)); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32302);try { 
         __CLR4_4_1owrowrle6qsfbz.R.inc(32303);YearMonthDay.fromCalendarFields(null); 
         __CLR4_4_1owrowrle6qsfbz.R.inc(32304);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1owrowrle6qsfbz.R.flushNeeded();}} 


public void testFactory_FromDateFields17() throws Exception {__CLR4_4_1owrowrle6qsfbz.R.globalSliceStart(getClass().getName(),32305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1spfqhnoxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1owrowrle6qsfbz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1owrowrle6qsfbz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testFactory_FromDateFields17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1spfqhnoxd() throws Exception{try{__CLR4_4_1owrowrle6qsfbz.R.inc(32305); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32306);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32307);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32308);YearMonthDay expected = new YearMonthDay(1970, 2, 3); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32309);assertEquals(expected, YearMonthDay.fromDateFields(cal.getTime())); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32310);try { 
         __CLR4_4_1owrowrle6qsfbz.R.inc(32311);YearMonthDay.fromDateFields(null); 
         __CLR4_4_1owrowrle6qsfbz.R.inc(32312);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1owrowrle6qsfbz.R.flushNeeded();}} 


public void testConstructor_ObjectString320() throws Throwable {__CLR4_4_1owrowrle6qsfbz.R.globalSliceStart(getClass().getName(),32313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1df7xgxoxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1owrowrle6qsfbz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1owrowrle6qsfbz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectString320",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1df7xgxoxl() throws Throwable{try{__CLR4_4_1owrowrle6qsfbz.R.inc(32313); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32314);YearMonthDay test = new YearMonthDay("1972-12-03T10:20:30.040"); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32315);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32316);assertEquals(1972, test.getYear()); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32317);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32318);assertEquals(3, test.getDayOfMonth()); 
 }finally{__CLR4_4_1owrowrle6qsfbz.R.flushNeeded();}} 


public void testConstructor_Object_Chronology21() throws Throwable {__CLR4_4_1owrowrle6qsfbz.R.globalSliceStart(getClass().getName(),32319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7bezroxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1owrowrle6qsfbz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1owrowrle6qsfbz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_Object_Chronology21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7bezroxr() throws Throwable{try{__CLR4_4_1owrowrle6qsfbz.R.inc(32319); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32320);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32321);YearMonthDay test = new YearMonthDay(date, GREGORIAN_PARIS); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32322);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32323);assertEquals(1970, test.getYear()); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32324);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1owrowrle6qsfbz.R.inc(32325);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1owrowrle6qsfbz.R.flushNeeded();}} 

    

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
     * Test constructor (int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

}
