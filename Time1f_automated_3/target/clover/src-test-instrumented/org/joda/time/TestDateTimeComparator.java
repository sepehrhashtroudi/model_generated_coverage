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
public class TestDateTimeComparator extends TestCase {static class __CLR4_4_1h2dh2dle6np4bf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,22212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Chronology ISO = ISOChronology.getInstance();
    
    public static void main(String[] args) {try{__CLR4_4_1h2dh2dle6np4bf.R.inc(22117);
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22118);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h2dh2dle6np4bf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h2dh2dle6np4bf.R.inc(22119);
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22120);return new TestSuite(TestDateTimeComparator.class);
    }finally{__CLR4_4_1h2dh2dle6np4bf.R.flushNeeded();}}

    public TestDateTimeComparator(String name) {
        super(name);__CLR4_4_1h2dh2dle6np4bf.R.inc(22122);try{__CLR4_4_1h2dh2dle6np4bf.R.inc(22121);
    }finally{__CLR4_4_1h2dh2dle6np4bf.R.flushNeeded();}}

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
    public void setUp() /* throws Exception */ {try{__CLR4_4_1h2dh2dle6np4bf.R.inc(22123);
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22124);Chronology chrono = ISOChronology.getInstanceUTC();

        // super.setUp();
        // Obtain comparator's
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22125);cMillis = DateTimeComparator.getInstance(null, DateTimeFieldType.secondOfMinute());
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22126);cSecond = DateTimeComparator.getInstance(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.minuteOfHour());
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22127);cMinute = DateTimeComparator.getInstance(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22128);cHour = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22129);cDayOfWeek = DateTimeComparator.getInstance(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.weekOfWeekyear());
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22130);cDayOfMonth = DateTimeComparator.getInstance(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear());
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22131);cDayOfYear = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), DateTimeFieldType.year());
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22132);cWeekOfWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekyear());
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22133);cWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekyear());
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22134);cMonth = DateTimeComparator.getInstance(DateTimeFieldType.monthOfYear(), DateTimeFieldType.year());
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22135);cYear = DateTimeComparator.getInstance(DateTimeFieldType.year());
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22136);cDate = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22137);cTime = DateTimeComparator.getTimeOnlyInstance();
    }finally{__CLR4_4_1h2dh2dle6np4bf.R.flushNeeded();}}

    /**
     * Junit <code>tearDown()</code> method.
     */
    protected void tearDown() /* throws Exception */ {try{__CLR4_4_1h2dh2dle6np4bf.R.inc(22138);
        // super.tearDown();
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22139);aDateTime = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22140);bDateTime = null;
        //
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22141);cMillis = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22142);cSecond = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22143);cMinute = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22144);cHour = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22145);cDayOfWeek = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22146);cDayOfMonth = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22147);cDayOfYear = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22148);cWeekOfWeekyear = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22149);cWeekyear = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22150);cMonth = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22151);cYear = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22152);cDate = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22153);cTime = null;
    }finally{__CLR4_4_1h2dh2dle6np4bf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testEqualsHashCode186() {__CLR4_4_1h2dh2dle6np4bf.R.globalSliceStart(getClass().getName(),22154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5gnh2h3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h2dh2dle6np4bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h2dh2dle6np4bf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testEqualsHashCode186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5gnh2h3e(){try{__CLR4_4_1h2dh2dle6np4bf.R.inc(22154); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22155);DateTimeComparator c1 = DateTimeComparator.getInstance(); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22156);assertEquals(true, c1.equals(c1)); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22157);assertEquals(false, c1.equals(null)); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22158);assertEquals(true, c1.hashCode() == c1.hashCode()); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22159);DateTimeComparator c2 = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22160);assertEquals(true, c2.equals(c2)); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22161);assertEquals(false, c2.equals(c1)); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22162);assertEquals(false, c1.equals(c2)); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22163);assertEquals(false, c2.equals(null)); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22164);assertEquals(false, c1.hashCode() == c2.hashCode()); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22165);DateTimeComparator c3 = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22166);assertEquals(true, c3.equals(c3)); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22167);assertEquals(false, c3.equals(c1)); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22168);assertEquals(true, c3.equals(c2)); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22169);assertEquals(false, c1.equals(c3)); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22170);assertEquals(true, c2.equals(c3)); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22171);assertEquals(false, c1.hashCode() == c3.hashCode()); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22172);assertEquals(true, c2.hashCode() == c3.hashCode()); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22173);DateTimeComparator c4 = DateTimeComparator.getDateOnlyInstance(); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22174);assertEquals(false, c4.hashCode() == c3.hashCode()); 
 }finally{__CLR4_4_1h2dh2dle6np4bf.R.flushNeeded();}}
public void testStaticGetInstance190() {__CLR4_4_1h2dh2dle6np4bf.R.globalSliceStart(getClass().getName(),22175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1snr5okh3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h2dh2dle6np4bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h2dh2dle6np4bf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstance190",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1snr5okh3z(){try{__CLR4_4_1h2dh2dle6np4bf.R.inc(22175); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22176);DateTimeComparator c = DateTimeComparator.getInstance(); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22177);assertEquals(null, c.getLowerLimit()); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22178);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1h2dh2dle6np4bf.R.inc(22179);assertEquals("DateTimeComparator[]", c.toString()); 
 }finally{__CLR4_4_1h2dh2dle6np4bf.R.flushNeeded();}}
    
    
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
    private DateTime getADate(String s) {try{__CLR4_4_1h2dh2dle6np4bf.R.inc(22180);
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22181);DateTime retDT = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22182);try {
            __CLR4_4_1h2dh2dle6np4bf.R.inc(22183);retDT = new DateTime(s, DateTimeZone.UTC);
        } catch (IllegalArgumentException pe) {
            __CLR4_4_1h2dh2dle6np4bf.R.inc(22184);pe.printStackTrace();
        }
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22185);return retDT;
    }finally{__CLR4_4_1h2dh2dle6np4bf.R.flushNeeded();}}

    /**
     * Load a string array.
     */
    private List loadAList(String[] someStrs) {try{__CLR4_4_1h2dh2dle6np4bf.R.inc(22186);
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22187);List newList = new ArrayList();
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22188);try {
            __CLR4_4_1h2dh2dle6np4bf.R.inc(22189);for (int i = 0; (((i < someStrs.length)&&(__CLR4_4_1h2dh2dle6np4bf.R.iget(22190)!=0|true))||(__CLR4_4_1h2dh2dle6np4bf.R.iget(22191)==0&false)); ++i) {{
                __CLR4_4_1h2dh2dle6np4bf.R.inc(22192);newList.add(new DateTime(someStrs[i], DateTimeZone.UTC));
            } // end of the for
        }} catch (IllegalArgumentException pe) {
            __CLR4_4_1h2dh2dle6np4bf.R.inc(22193);pe.printStackTrace();
        }
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22194);return newList;
    }finally{__CLR4_4_1h2dh2dle6np4bf.R.flushNeeded();}}

    /**
     * Check if the list is sorted.
     */
    private boolean isListSorted(List tl) {try{__CLR4_4_1h2dh2dle6np4bf.R.inc(22195);
        // tl must be populated with DateTime objects.
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22196);DateTime lhDT = (DateTime)tl.get(0);
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22197);DateTime rhDT = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22198);Long lhVal = new Long( lhDT.getMillis() );
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22199);Long rhVal = null;
        __CLR4_4_1h2dh2dle6np4bf.R.inc(22200);for (int i = 1; (((i < tl.size())&&(__CLR4_4_1h2dh2dle6np4bf.R.iget(22201)!=0|true))||(__CLR4_4_1h2dh2dle6np4bf.R.iget(22202)==0&false)); ++i) {{
            __CLR4_4_1h2dh2dle6np4bf.R.inc(22203);rhDT = (DateTime)tl.get(i);
            __CLR4_4_1h2dh2dle6np4bf.R.inc(22204);rhVal = new Long( rhDT.getMillis() );
            __CLR4_4_1h2dh2dle6np4bf.R.inc(22205);if ( (((lhVal.compareTo( rhVal) > 0 )&&(__CLR4_4_1h2dh2dle6np4bf.R.iget(22206)!=0|true))||(__CLR4_4_1h2dh2dle6np4bf.R.iget(22207)==0&false))) {__CLR4_4_1h2dh2dle6np4bf.R.inc(22208);return false;
            //
            }__CLR4_4_1h2dh2dle6np4bf.R.inc(22209);lhVal = rhVal;  // swap for next iteration
            __CLR4_4_1h2dh2dle6np4bf.R.inc(22210);lhDT = rhDT;    // swap for next iteration
        }
        }__CLR4_4_1h2dh2dle6np4bf.R.inc(22211);return true;
    }finally{__CLR4_4_1h2dh2dle6np4bf.R.flushNeeded();}}

}
