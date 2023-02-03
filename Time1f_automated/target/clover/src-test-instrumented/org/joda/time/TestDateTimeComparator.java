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
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.ISOChronology;
/**
 * This class is a Junit unit test for the
 * org.joda.time.DateTimeComparator class.
 *
 * @author Guy Allard
 */
public class TestDateTimeComparator extends TestCase {static class __CLR4_4_1gzwgzwlccietik{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,22136,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Chronology ISO = ISOChronology.getInstance();
    
    public static void main(String[] args) {try{__CLR4_4_1gzwgzwlccietik.R.inc(22028);
        __CLR4_4_1gzwgzwlccietik.R.inc(22029);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gzwgzwlccietik.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gzwgzwlccietik.R.inc(22030);
        __CLR4_4_1gzwgzwlccietik.R.inc(22031);return new TestSuite(TestDateTimeComparator.class);
    }finally{__CLR4_4_1gzwgzwlccietik.R.flushNeeded();}}

    public TestDateTimeComparator(String name) {
        super(name);__CLR4_4_1gzwgzwlccietik.R.inc(22033);try{__CLR4_4_1gzwgzwlccietik.R.inc(22032);
    }finally{__CLR4_4_1gzwgzwlccietik.R.flushNeeded();}}

    /**
     * A reference to a DateTime object.
     */
    DateTime aDateTime = null;
    /**
     * A reference to a DateTime object.
     */
    DateTime bDateTime = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for millis of seconds.
     */
    Comparator cMillis = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for seconds.
     */
    Comparator cSecond = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for minutes.
     */
    Comparator cMinute = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for hours.
     */
    Comparator cHour = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for day of the week.
     */
    Comparator cDayOfWeek = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for day of the month.
     */
    Comparator cDayOfMonth = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for day of the year.
     */
    Comparator cDayOfYear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for week of the weekyear.
     */
    Comparator cWeekOfWeekyear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for year given a week of the year.
     */
    Comparator cWeekyear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for months.
     */
    Comparator cMonth = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for year.
     */
    Comparator cYear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for the date portion of an
     * object.
     */
    Comparator cDate = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for the time portion of an
     * object.
     */
    Comparator cTime = null;
    /**
     * Junit <code>setUp()</code> method.
     */
    public void setUp() /* throws Exception */ {try{__CLR4_4_1gzwgzwlccietik.R.inc(22034);
        __CLR4_4_1gzwgzwlccietik.R.inc(22035);Chronology chrono = ISOChronology.getInstanceUTC();

        // super.setUp();
        // Obtain comparator's
        __CLR4_4_1gzwgzwlccietik.R.inc(22036);cMillis = DateTimeComparator.getInstance(null, DateTimeFieldType.secondOfMinute());
        __CLR4_4_1gzwgzwlccietik.R.inc(22037);cSecond = DateTimeComparator.getInstance(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.minuteOfHour());
        __CLR4_4_1gzwgzwlccietik.R.inc(22038);cMinute = DateTimeComparator.getInstance(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1gzwgzwlccietik.R.inc(22039);cHour = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1gzwgzwlccietik.R.inc(22040);cDayOfWeek = DateTimeComparator.getInstance(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.weekOfWeekyear());
        __CLR4_4_1gzwgzwlccietik.R.inc(22041);cDayOfMonth = DateTimeComparator.getInstance(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear());
        __CLR4_4_1gzwgzwlccietik.R.inc(22042);cDayOfYear = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), DateTimeFieldType.year());
        __CLR4_4_1gzwgzwlccietik.R.inc(22043);cWeekOfWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekyear());
        __CLR4_4_1gzwgzwlccietik.R.inc(22044);cWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekyear());
        __CLR4_4_1gzwgzwlccietik.R.inc(22045);cMonth = DateTimeComparator.getInstance(DateTimeFieldType.monthOfYear(), DateTimeFieldType.year());
        __CLR4_4_1gzwgzwlccietik.R.inc(22046);cYear = DateTimeComparator.getInstance(DateTimeFieldType.year());
        __CLR4_4_1gzwgzwlccietik.R.inc(22047);cDate = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1gzwgzwlccietik.R.inc(22048);cTime = DateTimeComparator.getTimeOnlyInstance();
    }finally{__CLR4_4_1gzwgzwlccietik.R.flushNeeded();}}

    /**
     * Junit <code>tearDown()</code> method.
     */
    protected void tearDown() /* throws Exception */ {try{__CLR4_4_1gzwgzwlccietik.R.inc(22049);
        // super.tearDown();
        __CLR4_4_1gzwgzwlccietik.R.inc(22050);aDateTime = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22051);bDateTime = null;
        //
        __CLR4_4_1gzwgzwlccietik.R.inc(22052);cMillis = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22053);cSecond = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22054);cMinute = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22055);cHour = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22056);cDayOfWeek = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22057);cDayOfMonth = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22058);cDayOfYear = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22059);cWeekOfWeekyear = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22060);cWeekyear = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22061);cMonth = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22062);cYear = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22063);cDate = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22064);cTime = null;
    }finally{__CLR4_4_1gzwgzwlccietik.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testStaticGetDateOnlyInstance25() {__CLR4_4_1gzwgzwlccietik.R.globalSliceStart(getClass().getName(),22065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utct2nh0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gzwgzwlccietik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gzwgzwlccietik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetDateOnlyInstance25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utct2nh0x(){try{__CLR4_4_1gzwgzwlccietik.R.inc(22065); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22066);DateTimeComparator c = DateTimeComparator.getDateOnlyInstance(); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22067);assertEquals(DateTimeFieldType.dayOfYear(), c.getLowerLimit()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22068);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22069);assertEquals("DateTimeComparator[dayOfYear-]", c.toString()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22070);assertSame(DateTimeComparator.getDateOnlyInstance(), DateTimeComparator.getDateOnlyInstance()); 
 }finally{__CLR4_4_1gzwgzwlccietik.R.flushNeeded();}}
public void testStaticGetInstanceLower186() {__CLR4_4_1gzwgzwlccietik.R.globalSliceStart(getClass().getName(),22071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_127sbfkh13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gzwgzwlccietik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gzwgzwlccietik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstanceLower186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_127sbfkh13(){try{__CLR4_4_1gzwgzwlccietik.R.inc(22071); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22072);DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22073);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22074);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22075);assertEquals("DateTimeComparator[hourOfDay-]", c.toString()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22076);c = DateTimeComparator.getInstance(null); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22077);assertSame(DateTimeComparator.getInstance(), c); 
 }finally{__CLR4_4_1gzwgzwlccietik.R.flushNeeded();}}
public void testStaticGetInstance187() {__CLR4_4_1gzwgzwlccietik.R.globalSliceStart(getClass().getName(),22078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1low0och1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gzwgzwlccietik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gzwgzwlccietik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstance187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1low0och1a(){try{__CLR4_4_1gzwgzwlccietik.R.inc(22078); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22079);DateTimeComparator c = DateTimeComparator.getInstance(); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22080);assertEquals(null, c.getLowerLimit()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22081);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22082);assertEquals("DateTimeComparator[]", c.toString()); 
 }finally{__CLR4_4_1gzwgzwlccietik.R.flushNeeded();}}
public void testEqualsHashCode188() {__CLR4_4_1gzwgzwlccietik.R.globalSliceStart(getClass().getName(),22083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ngpw4h1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gzwgzwlccietik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gzwgzwlccietik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testEqualsHashCode188",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ngpw4h1f(){try{__CLR4_4_1gzwgzwlccietik.R.inc(22083); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22084);DateTimeComparator c1 = DateTimeComparator.getInstance(); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22085);assertEquals(true, c1.equals(c1)); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22086);assertEquals(false, c1.equals(null)); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22087);assertEquals(true, c1.hashCode() == c1.hashCode()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22088);DateTimeComparator c2 = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22089);assertEquals(true, c2.equals(c2)); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22090);assertEquals(false, c2.equals(c1)); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22091);assertEquals(false, c1.equals(c2)); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22092);assertEquals(false, c2.equals(null)); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22093);assertEquals(false, c1.hashCode() == c2.hashCode()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22094);DateTimeComparator c3 = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22095);assertEquals(true, c3.equals(c3)); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22096);assertEquals(false, c3.equals(c1)); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22097);assertEquals(true, c3.equals(c2)); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22098);assertEquals(false, c1.equals(c3)); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22099);assertEquals(true, c2.equals(c3)); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22100);assertEquals(false, c1.hashCode() == c3.hashCode()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22101);assertEquals(true, c2.hashCode() == c3.hashCode()); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22102);DateTimeComparator c4 = DateTimeComparator.getDateOnlyInstance(); 
     __CLR4_4_1gzwgzwlccietik.R.inc(22103);assertEquals(false, c4.hashCode() == c3.hashCode()); 
 }finally{__CLR4_4_1gzwgzwlccietik.R.flushNeeded();}}
    
    
    //-----------------------------------------------------------------------
            
    
    
    
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Test all basic comparator operation with DateTime objects.
     */
       // end of testBasicComps


    /**
     * Test all basic comparator operation with ReadableInstant objects.
     */
       // end of testBasicComps

    /**
     * Test all basic comparator operation with java Date objects.
     */
       // end of testBasicComps

    /**
     * Test all basic comparator operation with Long objects.
     */
       // end of testBasicComps

    /**
     * Test all basic comparator operation with Calendar objects.
     */
       // end of testBasicComps


    /**
     * Test unequal comparisons with millis of second comparators.
     */
    
// Defects4J: flaky method
//     public void testMillis() {
//         aDateTime = new DateTime( System.currentTimeMillis(), DateTimeZone.UTC );
//         bDateTime = new DateTime( aDateTime.getMillis() + 1, DateTimeZone.UTC );
//         assertEquals( "MillisM1", -1, cMillis.compare( aDateTime, bDateTime ) );
//         assertEquals( "MillisP1", 1, cMillis.compare( bDateTime, aDateTime ) );
//     }   // end of testMillis

    /**
     * Test unequal comparisons with second comparators.
     */
       // end of testSecond

    /**
     * Test unequal comparisons with minute comparators.
     */
       // end of testMinute

    /**
     * Test unequal comparisons with hour comparators.
     */
       // end of testHour

    /**
     * Test unequal comparisons with day of week comparators.
     */
       // end of testDOW

    /**
     * Test unequal comparisons with day of month comparators.
     */
       // end of testDOM

    /**
     * Test unequal comparisons with day of year comparators.
     */
       // end of testDOY

    /**
     * Test unequal comparisons with week of weekyear comparators.
     */
       // end of testMillis

    /**
     * Test unequal comparisons with year given the week comparators.
     */
       // end of testWOYY

    /**
     * Test unequal comparisons with month comparators.
     */
       // end of testMonth

    /**
     * Test unequal comparisons with year comparators.
     */
       // end of testYear

    /*
     * 'List' processing tests follow.
     */

     /**
      * Test sorting with full default comparator.
      */
      // end of testListBasic

     /**
      * Test sorting with millis of second comparator.
      */
     // end of testListSecond


     /**
      * Test sorting with second comparator.
      */
     // end of testListSecond

     /**
      * Test sorting with minute comparator.
      */
     // end of testListMinute

     /**
      * Test sorting with hour comparator.
      */
     // end of testListHour


     /**
      * Test sorting with day of week comparator.
      */
     // end of testListDOW

     /**
      * Test sorting with day of month comparator.
      */
     // end of testListDOM

     /**
      * Test sorting with day of year comparator.
      */
     // end of testListDOY

     /**
      * Test sorting with week of weekyear comparator.
      */
     // end of testListWOW

     /**
      * Test sorting with year (given week) comparator.
      */
     // end of testListYOYY


     /**
      * Test sorting with month comparator.
      */
     // end of testListMonth

     /**
      * Test sorting with year comparator.
      */
      // end of testListYear

     /**
      * Test sorting with date only comparator.
      */
     // end of testListDate

     /**
      * Test sorting with time only comparator.
      */
     // end of testListTime


    /**
     * Test comparator operation with null object(s).
     */
    

    /**
     * Test comparator operation with an invalid object type.
     */
    

    // private convenience methods
    //-----------------------------------------------------------------------
    /**
     * Creates a date to test with.
     */
    private DateTime getADate(String s) {try{__CLR4_4_1gzwgzwlccietik.R.inc(22104);
        __CLR4_4_1gzwgzwlccietik.R.inc(22105);DateTime retDT = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22106);try {
            __CLR4_4_1gzwgzwlccietik.R.inc(22107);retDT = new DateTime(s, DateTimeZone.UTC);
        } catch (IllegalArgumentException pe) {
            __CLR4_4_1gzwgzwlccietik.R.inc(22108);pe.printStackTrace();
        }
        __CLR4_4_1gzwgzwlccietik.R.inc(22109);return retDT;
    }finally{__CLR4_4_1gzwgzwlccietik.R.flushNeeded();}}

    /**
     * Load a string array.
     */
    private List loadAList(String[] someStrs) {try{__CLR4_4_1gzwgzwlccietik.R.inc(22110);
        __CLR4_4_1gzwgzwlccietik.R.inc(22111);List newList = new ArrayList();
        __CLR4_4_1gzwgzwlccietik.R.inc(22112);try {
            __CLR4_4_1gzwgzwlccietik.R.inc(22113);for (int i = 0; (((i < someStrs.length)&&(__CLR4_4_1gzwgzwlccietik.R.iget(22114)!=0|true))||(__CLR4_4_1gzwgzwlccietik.R.iget(22115)==0&false)); ++i) {{
                __CLR4_4_1gzwgzwlccietik.R.inc(22116);newList.add(new DateTime(someStrs[i], DateTimeZone.UTC));
            } // end of the for
        }} catch (IllegalArgumentException pe) {
            __CLR4_4_1gzwgzwlccietik.R.inc(22117);pe.printStackTrace();
        }
        __CLR4_4_1gzwgzwlccietik.R.inc(22118);return newList;
    }finally{__CLR4_4_1gzwgzwlccietik.R.flushNeeded();}}

    /**
     * Check if the list is sorted.
     */
    private boolean isListSorted(List tl) {try{__CLR4_4_1gzwgzwlccietik.R.inc(22119);
        // tl must be populated with DateTime objects.
        __CLR4_4_1gzwgzwlccietik.R.inc(22120);DateTime lhDT = (DateTime)tl.get(0);
        __CLR4_4_1gzwgzwlccietik.R.inc(22121);DateTime rhDT = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22122);Long lhVal = new Long( lhDT.getMillis() );
        __CLR4_4_1gzwgzwlccietik.R.inc(22123);Long rhVal = null;
        __CLR4_4_1gzwgzwlccietik.R.inc(22124);for (int i = 1; (((i < tl.size())&&(__CLR4_4_1gzwgzwlccietik.R.iget(22125)!=0|true))||(__CLR4_4_1gzwgzwlccietik.R.iget(22126)==0&false)); ++i) {{
            __CLR4_4_1gzwgzwlccietik.R.inc(22127);rhDT = (DateTime)tl.get(i);
            __CLR4_4_1gzwgzwlccietik.R.inc(22128);rhVal = new Long( rhDT.getMillis() );
            __CLR4_4_1gzwgzwlccietik.R.inc(22129);if ( (((lhVal.compareTo( rhVal) > 0 )&&(__CLR4_4_1gzwgzwlccietik.R.iget(22130)!=0|true))||(__CLR4_4_1gzwgzwlccietik.R.iget(22131)==0&false))) {__CLR4_4_1gzwgzwlccietik.R.inc(22132);return false;
            //
            }__CLR4_4_1gzwgzwlccietik.R.inc(22133);lhVal = rhVal;  // swap for next iteration
            __CLR4_4_1gzwgzwlccietik.R.inc(22134);lhDT = rhDT;    // swap for next iteration
        }
        }__CLR4_4_1gzwgzwlccietik.R.inc(22135);return true;
    }finally{__CLR4_4_1gzwgzwlccietik.R.flushNeeded();}}

}
