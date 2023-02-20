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
public class TestDateTimeComparator extends TestCase {static class __CLR4_4_1gz5gz5le6nl85a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,22092,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Chronology ISO = ISOChronology.getInstance();
    
    public static void main(String[] args) {try{__CLR4_4_1gz5gz5le6nl85a.R.inc(22001);
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22002);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gz5gz5le6nl85a.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gz5gz5le6nl85a.R.inc(22003);
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22004);return new TestSuite(TestDateTimeComparator.class);
    }finally{__CLR4_4_1gz5gz5le6nl85a.R.flushNeeded();}}

    public TestDateTimeComparator(String name) {
        super(name);__CLR4_4_1gz5gz5le6nl85a.R.inc(22006);try{__CLR4_4_1gz5gz5le6nl85a.R.inc(22005);
    }finally{__CLR4_4_1gz5gz5le6nl85a.R.flushNeeded();}}

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
    public void setUp() /* throws Exception */ {try{__CLR4_4_1gz5gz5le6nl85a.R.inc(22007);
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22008);Chronology chrono = ISOChronology.getInstanceUTC();

        // super.setUp();
        // Obtain comparator's
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22009);cMillis = DateTimeComparator.getInstance(null, DateTimeFieldType.secondOfMinute());
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22010);cSecond = DateTimeComparator.getInstance(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.minuteOfHour());
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22011);cMinute = DateTimeComparator.getInstance(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22012);cHour = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22013);cDayOfWeek = DateTimeComparator.getInstance(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.weekOfWeekyear());
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22014);cDayOfMonth = DateTimeComparator.getInstance(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear());
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22015);cDayOfYear = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), DateTimeFieldType.year());
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22016);cWeekOfWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekyear());
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22017);cWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekyear());
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22018);cMonth = DateTimeComparator.getInstance(DateTimeFieldType.monthOfYear(), DateTimeFieldType.year());
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22019);cYear = DateTimeComparator.getInstance(DateTimeFieldType.year());
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22020);cDate = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22021);cTime = DateTimeComparator.getTimeOnlyInstance();
    }finally{__CLR4_4_1gz5gz5le6nl85a.R.flushNeeded();}}

    /**
     * Junit <code>tearDown()</code> method.
     */
    protected void tearDown() /* throws Exception */ {try{__CLR4_4_1gz5gz5le6nl85a.R.inc(22022);
        // super.tearDown();
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22023);aDateTime = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22024);bDateTime = null;
        //
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22025);cMillis = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22026);cSecond = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22027);cMinute = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22028);cHour = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22029);cDayOfWeek = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22030);cDayOfMonth = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22031);cDayOfYear = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22032);cWeekOfWeekyear = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22033);cWeekyear = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22034);cMonth = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22035);cYear = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22036);cDate = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22037);cTime = null;
    }finally{__CLR4_4_1gz5gz5le6nl85a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyRemainderHourOfDay125() {__CLR4_4_1gz5gz5le6nl85a.R.globalSliceStart(getClass().getName(),22038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7k3ugh06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gz5gz5le6nl85a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gz5gz5le6nl85a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testPropertyRemainderHourOfDay125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7k3ugh06(){try{__CLR4_4_1gz5gz5le6nl85a.R.inc(22038); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22039);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22040);assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder()); 
 }finally{__CLR4_4_1gz5gz5le6nl85a.R.flushNeeded();}}
public void testStaticGetInstanceLower219() {__CLR4_4_1gz5gz5le6nl85a.R.globalSliceStart(getClass().getName(),22041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ew9d2jh09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gz5gz5le6nl85a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gz5gz5le6nl85a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstanceLower219",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ew9d2jh09(){try{__CLR4_4_1gz5gz5le6nl85a.R.inc(22041); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22042);DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay()); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22043);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit()); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22044);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22045);assertEquals("DateTimeComparator[hourOfDay-]", c.toString()); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22046);c = DateTimeComparator.getInstance(null, DateTimeFieldType.hourOfDay()); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22047);assertSame(DateTimeComparator.getInstance(), c); 
 }finally{__CLR4_4_1gz5gz5le6nl85a.R.flushNeeded();}}
public void testStaticGetDateOnlyInstance220() {__CLR4_4_1gz5gz5le6nl85a.R.globalSliceStart(getClass().getName(),22048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzk2zyh0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gz5gz5le6nl85a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gz5gz5le6nl85a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetDateOnlyInstance220",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzk2zyh0g(){try{__CLR4_4_1gz5gz5le6nl85a.R.inc(22048); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22049);DateTimeComparator c = DateTimeComparator.getDateOnlyInstance(); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22050);assertEquals(DateTimeFieldType.dayOfYear(), c.getLowerLimit()); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22051);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22052);assertEquals("DateTimeComparator[dayOfYear-]", c.toString()); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22053);assertSame(DateTimeComparator.getDateOnlyInstance(), DateTimeComparator.getDateOnlyInstance()); 
 }finally{__CLR4_4_1gz5gz5le6nl85a.R.flushNeeded();}}
public void testStaticGetTimeOnlyInstance221() {__CLR4_4_1gz5gz5le6nl85a.R.globalSliceStart(getClass().getName(),22054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12xpmcsh0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gz5gz5le6nl85a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gz5gz5le6nl85a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetTimeOnlyInstance221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12xpmcsh0m(){try{__CLR4_4_1gz5gz5le6nl85a.R.inc(22054); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22055);DateTimeComparator c = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22056);assertEquals(DateTimeFieldType.dayOfYear(), c.getLowerLimit()); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22057);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22058);assertEquals("DateTimeComparator[dayOfYear-]", c.toString()); 
     __CLR4_4_1gz5gz5le6nl85a.R.inc(22059);assertSame(DateTimeComparator.getTimeOnlyInstance(), DateTimeComparator.getTimeOnlyInstance()); 
 }finally{__CLR4_4_1gz5gz5le6nl85a.R.flushNeeded();}}
    
    
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
    private DateTime getADate(String s) {try{__CLR4_4_1gz5gz5le6nl85a.R.inc(22060);
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22061);DateTime retDT = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22062);try {
            __CLR4_4_1gz5gz5le6nl85a.R.inc(22063);retDT = new DateTime(s, DateTimeZone.UTC);
        } catch (IllegalArgumentException pe) {
            __CLR4_4_1gz5gz5le6nl85a.R.inc(22064);pe.printStackTrace();
        }
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22065);return retDT;
    }finally{__CLR4_4_1gz5gz5le6nl85a.R.flushNeeded();}}

    /**
     * Load a string array.
     */
    private List loadAList(String[] someStrs) {try{__CLR4_4_1gz5gz5le6nl85a.R.inc(22066);
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22067);List newList = new ArrayList();
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22068);try {
            __CLR4_4_1gz5gz5le6nl85a.R.inc(22069);for (int i = 0; (((i < someStrs.length)&&(__CLR4_4_1gz5gz5le6nl85a.R.iget(22070)!=0|true))||(__CLR4_4_1gz5gz5le6nl85a.R.iget(22071)==0&false)); ++i) {{
                __CLR4_4_1gz5gz5le6nl85a.R.inc(22072);newList.add(new DateTime(someStrs[i], DateTimeZone.UTC));
            } // end of the for
        }} catch (IllegalArgumentException pe) {
            __CLR4_4_1gz5gz5le6nl85a.R.inc(22073);pe.printStackTrace();
        }
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22074);return newList;
    }finally{__CLR4_4_1gz5gz5le6nl85a.R.flushNeeded();}}

    /**
     * Check if the list is sorted.
     */
    private boolean isListSorted(List tl) {try{__CLR4_4_1gz5gz5le6nl85a.R.inc(22075);
        // tl must be populated with DateTime objects.
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22076);DateTime lhDT = (DateTime)tl.get(0);
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22077);DateTime rhDT = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22078);Long lhVal = new Long( lhDT.getMillis() );
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22079);Long rhVal = null;
        __CLR4_4_1gz5gz5le6nl85a.R.inc(22080);for (int i = 1; (((i < tl.size())&&(__CLR4_4_1gz5gz5le6nl85a.R.iget(22081)!=0|true))||(__CLR4_4_1gz5gz5le6nl85a.R.iget(22082)==0&false)); ++i) {{
            __CLR4_4_1gz5gz5le6nl85a.R.inc(22083);rhDT = (DateTime)tl.get(i);
            __CLR4_4_1gz5gz5le6nl85a.R.inc(22084);rhVal = new Long( rhDT.getMillis() );
            __CLR4_4_1gz5gz5le6nl85a.R.inc(22085);if ( (((lhVal.compareTo( rhVal) > 0 )&&(__CLR4_4_1gz5gz5le6nl85a.R.iget(22086)!=0|true))||(__CLR4_4_1gz5gz5le6nl85a.R.iget(22087)==0&false))) {__CLR4_4_1gz5gz5le6nl85a.R.inc(22088);return false;
            //
            }__CLR4_4_1gz5gz5le6nl85a.R.inc(22089);lhVal = rhVal;  // swap for next iteration
            __CLR4_4_1gz5gz5le6nl85a.R.inc(22090);lhDT = rhDT;    // swap for next iteration
        }
        }__CLR4_4_1gz5gz5le6nl85a.R.inc(22091);return true;
    }finally{__CLR4_4_1gz5gz5le6nl85a.R.flushNeeded();}}

}
