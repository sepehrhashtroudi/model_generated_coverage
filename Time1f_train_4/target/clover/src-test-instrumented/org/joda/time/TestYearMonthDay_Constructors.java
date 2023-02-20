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
public class TestYearMonthDay_Constructors extends TestCase {static class __CLR4_4_1ozoozole6rjd7b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,32448,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ozoozole6rjd7b.R.inc(32388);
        __CLR4_4_1ozoozole6rjd7b.R.inc(32389);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ozoozole6rjd7b.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ozoozole6rjd7b.R.inc(32390);
        __CLR4_4_1ozoozole6rjd7b.R.inc(32391);return new TestSuite(TestYearMonthDay_Constructors.class);
    }finally{__CLR4_4_1ozoozole6rjd7b.R.flushNeeded();}}

    public TestYearMonthDay_Constructors(String name) {
        super(name);__CLR4_4_1ozoozole6rjd7b.R.inc(32393);try{__CLR4_4_1ozoozole6rjd7b.R.inc(32392);
    }finally{__CLR4_4_1ozoozole6rjd7b.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ozoozole6rjd7b.R.inc(32394);
        __CLR4_4_1ozoozole6rjd7b.R.inc(32395);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ozoozole6rjd7b.R.inc(32396);zone = DateTimeZone.getDefault();
        __CLR4_4_1ozoozole6rjd7b.R.inc(32397);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1ozoozole6rjd7b.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ozoozole6rjd7b.R.inc(32398);
        __CLR4_4_1ozoozole6rjd7b.R.inc(32399);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ozoozole6rjd7b.R.inc(32400);DateTimeZone.setDefault(zone);
        __CLR4_4_1ozoozole6rjd7b.R.inc(32401);zone = null;
    }finally{__CLR4_4_1ozoozole6rjd7b.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_FromCalendarFields17() throws Exception {__CLR4_4_1ozoozole6rjd7b.R.globalSliceStart(getClass().getName(),32402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vbethnp02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ozoozole6rjd7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ozoozole6rjd7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testFactory_FromCalendarFields17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vbethnp02() throws Exception{try{__CLR4_4_1ozoozole6rjd7b.R.inc(32402); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32403);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32404);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32405);YearMonthDay expected = new YearMonthDay(1970, 2, 3); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32406);assertEquals(expected, YearMonthDay.fromCalendarFields(cal)); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32407);try { 
         __CLR4_4_1ozoozole6rjd7b.R.inc(32408);YearMonthDay.fromCalendarFields(null); 
         __CLR4_4_1ozoozole6rjd7b.R.inc(32409);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ozoozole6rjd7b.R.flushNeeded();}} 


public void testFactory_FromDateFields18() throws Exception {__CLR4_4_1ozoozole6rjd7b.R.globalSliceStart(getClass().getName(),32410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pgfrp6p0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ozoozole6rjd7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ozoozole6rjd7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testFactory_FromDateFields18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pgfrp6p0a() throws Exception{try{__CLR4_4_1ozoozole6rjd7b.R.inc(32410); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32411);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32412);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32413);YearMonthDay expected = new YearMonthDay(1970, 2, 3); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32414);assertEquals(expected, YearMonthDay.fromDateFields(cal.getTime())); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32415);try { 
         __CLR4_4_1ozoozole6rjd7b.R.inc(32416);YearMonthDay.fromDateFields(null); 
         __CLR4_4_1ozoozole6rjd7b.R.inc(32417);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ozoozole6rjd7b.R.flushNeeded();}} 


public void testConstructor_DateTimeZone20() throws Throwable {__CLR4_4_1ozoozole6rjd7b.R.globalSliceStart(getClass().getName(),32418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vn88yrp0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ozoozole6rjd7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ozoozole6rjd7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_DateTimeZone20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vn88yrp0i() throws Throwable{try{__CLR4_4_1ozoozole6rjd7b.R.inc(32418); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32419);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32420);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32421);YearMonthDay test = new YearMonthDay(LONDON); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32422);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32423);assertEquals(2005, test.getYear()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32424);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32425);assertEquals(8, test.getDayOfMonth()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32426);test = new YearMonthDay(PARIS); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32427);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32428);assertEquals(2005, test.getYear()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32429);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32430);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1ozoozole6rjd7b.R.flushNeeded();}} 


public void testConstructor_ObjectString323() throws Throwable {__CLR4_4_1ozoozole6rjd7b.R.globalSliceStart(getClass().getName(),32431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n67tucp0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ozoozole6rjd7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ozoozole6rjd7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectString323",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n67tucp0v() throws Throwable{try{__CLR4_4_1ozoozole6rjd7b.R.inc(32431); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32432);YearMonthDay test = new YearMonthDay("1972-12-03T10:20:30.040"); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32433);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32434);assertEquals(1972, test.getYear()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32435);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32436);assertEquals(3, test.getDayOfMonth()); 
 }finally{__CLR4_4_1ozoozole6rjd7b.R.flushNeeded();}} 


public void testConstructor_Object_Chronology24() throws Throwable {__CLR4_4_1ozoozole6rjd7b.R.globalSliceStart(getClass().getName(),32437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kybbd6p11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ozoozole6rjd7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ozoozole6rjd7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_Object_Chronology24",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kybbd6p11() throws Throwable{try{__CLR4_4_1ozoozole6rjd7b.R.inc(32437); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32438);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32439);YearMonthDay test = new YearMonthDay(date, GREGORIAN_PARIS); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32440);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32441);assertEquals(1970, test.getYear()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32442);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32443);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1ozoozole6rjd7b.R.flushNeeded();}} 


public void testConstructor_ObjectStringEx2142() throws Throwable {__CLR4_4_1ozoozole6rjd7b.R.globalSliceStart(getClass().getName(),32444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gu615up18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ozoozole6rjd7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ozoozole6rjd7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectStringEx2142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gu615up18() throws Throwable{try{__CLR4_4_1ozoozole6rjd7b.R.inc(32444); 
     __CLR4_4_1ozoozole6rjd7b.R.inc(32445);try { 
         __CLR4_4_1ozoozole6rjd7b.R.inc(32446);new YearMonthDay("T10:20:30.040+14:00"); 
         __CLR4_4_1ozoozole6rjd7b.R.inc(32447);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ozoozole6rjd7b.R.flushNeeded();}} 

    

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
