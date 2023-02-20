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
public class TestDateTimeComparator extends TestCase {static class __CLR4_4_1gzvgzvle6o79li{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,22096,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Chronology ISO = ISOChronology.getInstance();
    
    public static void main(String[] args) {try{__CLR4_4_1gzvgzvle6o79li.R.inc(22027);
        __CLR4_4_1gzvgzvle6o79li.R.inc(22028);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gzvgzvle6o79li.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gzvgzvle6o79li.R.inc(22029);
        __CLR4_4_1gzvgzvle6o79li.R.inc(22030);return new TestSuite(TestDateTimeComparator.class);
    }finally{__CLR4_4_1gzvgzvle6o79li.R.flushNeeded();}}

    public TestDateTimeComparator(String name) {
        super(name);__CLR4_4_1gzvgzvle6o79li.R.inc(22032);try{__CLR4_4_1gzvgzvle6o79li.R.inc(22031);
    }finally{__CLR4_4_1gzvgzvle6o79li.R.flushNeeded();}}

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
    public void setUp() /* throws Exception */ {try{__CLR4_4_1gzvgzvle6o79li.R.inc(22033);
        __CLR4_4_1gzvgzvle6o79li.R.inc(22034);Chronology chrono = ISOChronology.getInstanceUTC();

        // super.setUp();
        // Obtain comparator's
        __CLR4_4_1gzvgzvle6o79li.R.inc(22035);cMillis = DateTimeComparator.getInstance(null, DateTimeFieldType.secondOfMinute());
        __CLR4_4_1gzvgzvle6o79li.R.inc(22036);cSecond = DateTimeComparator.getInstance(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.minuteOfHour());
        __CLR4_4_1gzvgzvle6o79li.R.inc(22037);cMinute = DateTimeComparator.getInstance(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1gzvgzvle6o79li.R.inc(22038);cHour = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1gzvgzvle6o79li.R.inc(22039);cDayOfWeek = DateTimeComparator.getInstance(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.weekOfWeekyear());
        __CLR4_4_1gzvgzvle6o79li.R.inc(22040);cDayOfMonth = DateTimeComparator.getInstance(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear());
        __CLR4_4_1gzvgzvle6o79li.R.inc(22041);cDayOfYear = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), DateTimeFieldType.year());
        __CLR4_4_1gzvgzvle6o79li.R.inc(22042);cWeekOfWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekyear());
        __CLR4_4_1gzvgzvle6o79li.R.inc(22043);cWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekyear());
        __CLR4_4_1gzvgzvle6o79li.R.inc(22044);cMonth = DateTimeComparator.getInstance(DateTimeFieldType.monthOfYear(), DateTimeFieldType.year());
        __CLR4_4_1gzvgzvle6o79li.R.inc(22045);cYear = DateTimeComparator.getInstance(DateTimeFieldType.year());
        __CLR4_4_1gzvgzvle6o79li.R.inc(22046);cDate = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1gzvgzvle6o79li.R.inc(22047);cTime = DateTimeComparator.getTimeOnlyInstance();
    }finally{__CLR4_4_1gzvgzvle6o79li.R.flushNeeded();}}

    /**
     * Junit <code>tearDown()</code> method.
     */
    protected void tearDown() /* throws Exception */ {try{__CLR4_4_1gzvgzvle6o79li.R.inc(22048);
        // super.tearDown();
        __CLR4_4_1gzvgzvle6o79li.R.inc(22049);aDateTime = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22050);bDateTime = null;
        //
        __CLR4_4_1gzvgzvle6o79li.R.inc(22051);cMillis = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22052);cSecond = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22053);cMinute = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22054);cHour = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22055);cDayOfWeek = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22056);cDayOfMonth = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22057);cDayOfYear = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22058);cWeekOfWeekyear = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22059);cWeekyear = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22060);cMonth = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22061);cYear = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22062);cDate = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22063);cTime = null;
    }finally{__CLR4_4_1gzvgzvle6o79li.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    
    
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
    private DateTime getADate(String s) {try{__CLR4_4_1gzvgzvle6o79li.R.inc(22064);
        __CLR4_4_1gzvgzvle6o79li.R.inc(22065);DateTime retDT = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22066);try {
            __CLR4_4_1gzvgzvle6o79li.R.inc(22067);retDT = new DateTime(s, DateTimeZone.UTC);
        } catch (IllegalArgumentException pe) {
            __CLR4_4_1gzvgzvle6o79li.R.inc(22068);pe.printStackTrace();
        }
        __CLR4_4_1gzvgzvle6o79li.R.inc(22069);return retDT;
    }finally{__CLR4_4_1gzvgzvle6o79li.R.flushNeeded();}}

    /**
     * Load a string array.
     */
    private List loadAList(String[] someStrs) {try{__CLR4_4_1gzvgzvle6o79li.R.inc(22070);
        __CLR4_4_1gzvgzvle6o79li.R.inc(22071);List newList = new ArrayList();
        __CLR4_4_1gzvgzvle6o79li.R.inc(22072);try {
            __CLR4_4_1gzvgzvle6o79li.R.inc(22073);for (int i = 0; (((i < someStrs.length)&&(__CLR4_4_1gzvgzvle6o79li.R.iget(22074)!=0|true))||(__CLR4_4_1gzvgzvle6o79li.R.iget(22075)==0&false)); ++i) {{
                __CLR4_4_1gzvgzvle6o79li.R.inc(22076);newList.add(new DateTime(someStrs[i], DateTimeZone.UTC));
            } // end of the for
        }} catch (IllegalArgumentException pe) {
            __CLR4_4_1gzvgzvle6o79li.R.inc(22077);pe.printStackTrace();
        }
        __CLR4_4_1gzvgzvle6o79li.R.inc(22078);return newList;
    }finally{__CLR4_4_1gzvgzvle6o79li.R.flushNeeded();}}

    /**
     * Check if the list is sorted.
     */
    private boolean isListSorted(List tl) {try{__CLR4_4_1gzvgzvle6o79li.R.inc(22079);
        // tl must be populated with DateTime objects.
        __CLR4_4_1gzvgzvle6o79li.R.inc(22080);DateTime lhDT = (DateTime)tl.get(0);
        __CLR4_4_1gzvgzvle6o79li.R.inc(22081);DateTime rhDT = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22082);Long lhVal = new Long( lhDT.getMillis() );
        __CLR4_4_1gzvgzvle6o79li.R.inc(22083);Long rhVal = null;
        __CLR4_4_1gzvgzvle6o79li.R.inc(22084);for (int i = 1; (((i < tl.size())&&(__CLR4_4_1gzvgzvle6o79li.R.iget(22085)!=0|true))||(__CLR4_4_1gzvgzvle6o79li.R.iget(22086)==0&false)); ++i) {{
            __CLR4_4_1gzvgzvle6o79li.R.inc(22087);rhDT = (DateTime)tl.get(i);
            __CLR4_4_1gzvgzvle6o79li.R.inc(22088);rhVal = new Long( rhDT.getMillis() );
            __CLR4_4_1gzvgzvle6o79li.R.inc(22089);if ( (((lhVal.compareTo( rhVal) > 0 )&&(__CLR4_4_1gzvgzvle6o79li.R.iget(22090)!=0|true))||(__CLR4_4_1gzvgzvle6o79li.R.iget(22091)==0&false))) {__CLR4_4_1gzvgzvle6o79li.R.inc(22092);return false;
            //
            }__CLR4_4_1gzvgzvle6o79li.R.inc(22093);lhVal = rhVal;  // swap for next iteration
            __CLR4_4_1gzvgzvle6o79li.R.inc(22094);lhDT = rhDT;    // swap for next iteration
        }
        }__CLR4_4_1gzvgzvle6o79li.R.inc(22095);return true;
    }finally{__CLR4_4_1gzvgzvle6o79li.R.flushNeeded();}}

}
