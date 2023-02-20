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
public class TestDateTimeComparator extends TestCase {static class __CLR4_4_1hebheble6qe97w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,22704,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Chronology ISO = ISOChronology.getInstance();
    
    public static void main(String[] args) {try{__CLR4_4_1hebheble6qe97w.R.inc(22547);
        __CLR4_4_1hebheble6qe97w.R.inc(22548);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hebheble6qe97w.R.inc(22549);
        __CLR4_4_1hebheble6qe97w.R.inc(22550);return new TestSuite(TestDateTimeComparator.class);
    }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}}

    public TestDateTimeComparator(String name) {
        super(name);__CLR4_4_1hebheble6qe97w.R.inc(22552);try{__CLR4_4_1hebheble6qe97w.R.inc(22551);
    }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}}

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
    public void setUp() /* throws Exception */ {try{__CLR4_4_1hebheble6qe97w.R.inc(22553);
        __CLR4_4_1hebheble6qe97w.R.inc(22554);Chronology chrono = ISOChronology.getInstanceUTC();

        // super.setUp();
        // Obtain comparator's
        __CLR4_4_1hebheble6qe97w.R.inc(22555);cMillis = DateTimeComparator.getInstance(null, DateTimeFieldType.secondOfMinute());
        __CLR4_4_1hebheble6qe97w.R.inc(22556);cSecond = DateTimeComparator.getInstance(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.minuteOfHour());
        __CLR4_4_1hebheble6qe97w.R.inc(22557);cMinute = DateTimeComparator.getInstance(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1hebheble6qe97w.R.inc(22558);cHour = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1hebheble6qe97w.R.inc(22559);cDayOfWeek = DateTimeComparator.getInstance(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.weekOfWeekyear());
        __CLR4_4_1hebheble6qe97w.R.inc(22560);cDayOfMonth = DateTimeComparator.getInstance(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear());
        __CLR4_4_1hebheble6qe97w.R.inc(22561);cDayOfYear = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), DateTimeFieldType.year());
        __CLR4_4_1hebheble6qe97w.R.inc(22562);cWeekOfWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekyear());
        __CLR4_4_1hebheble6qe97w.R.inc(22563);cWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekyear());
        __CLR4_4_1hebheble6qe97w.R.inc(22564);cMonth = DateTimeComparator.getInstance(DateTimeFieldType.monthOfYear(), DateTimeFieldType.year());
        __CLR4_4_1hebheble6qe97w.R.inc(22565);cYear = DateTimeComparator.getInstance(DateTimeFieldType.year());
        __CLR4_4_1hebheble6qe97w.R.inc(22566);cDate = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1hebheble6qe97w.R.inc(22567);cTime = DateTimeComparator.getTimeOnlyInstance();
    }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}}

    /**
     * Junit <code>tearDown()</code> method.
     */
    protected void tearDown() /* throws Exception */ {try{__CLR4_4_1hebheble6qe97w.R.inc(22568);
        // super.tearDown();
        __CLR4_4_1hebheble6qe97w.R.inc(22569);aDateTime = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22570);bDateTime = null;
        //
        __CLR4_4_1hebheble6qe97w.R.inc(22571);cMillis = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22572);cSecond = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22573);cMinute = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22574);cHour = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22575);cDayOfWeek = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22576);cDayOfMonth = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22577);cDayOfYear = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22578);cWeekOfWeekyear = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22579);cWeekyear = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22580);cMonth = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22581);cYear = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22582);cDate = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22583);cTime = null;
    }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testBasicComps3263() {__CLR4_4_1hebheble6qe97w.R.globalSliceStart(getClass().getName(),22584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8s9vvhfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hebheble6qe97w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hebheble6qe97w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps3263",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8s9vvhfc(){try{__CLR4_4_1hebheble6qe97w.R.inc(22584); 
     __CLR4_4_1hebheble6qe97w.R.inc(22585);Date aDateTime = new Date(System.currentTimeMillis()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22586);Date bDateTime = new Date(aDateTime.getTime()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22587);assertEquals("MILLIS", 0, cMillis.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22588);assertEquals("SECOND", 0, cSecond.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22589);assertEquals("MINUTE", 0, cMinute.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22590);assertEquals("HOUR", 0, cHour.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22591);assertEquals("DOW", 0, cDayOfWeek.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22592);assertEquals("DOM", 0, cDayOfMonth.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22593);assertEquals("DOY", 0, cDayOfYear.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22594);assertEquals("WOW", 0, cWeekOfWeekyear.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22595);assertEquals("WY", 0, cWeekyear.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22596);assertEquals("MONTH", 0, cMonth.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22597);assertEquals("YEAR", 0, cYear.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22598);assertEquals("DATE", 0, cDate.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22599);assertEquals("TIME", 0, cTime.compare(aDateTime, bDateTime)); 
 }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}} 


public void testStaticGetInstanceLowerUpper484() {__CLR4_4_1hebheble6qe97w.R.globalSliceStart(getClass().getName(),22600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z7lorvhfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hebheble6qe97w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hebheble6qe97w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstanceLowerUpper484",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z7lorvhfs(){try{__CLR4_4_1hebheble6qe97w.R.inc(22600); 
     __CLR4_4_1hebheble6qe97w.R.inc(22601);DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22602);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22603);assertEquals(DateTimeFieldType.dayOfYear(), c.getUpperLimit()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22604);assertEquals("DateTimeComparator[hourOfDay-dayOfYear]", c.toString()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22605);c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22606);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22607);assertEquals(DateTimeFieldType.hourOfDay(), c.getUpperLimit()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22608);assertEquals("DateTimeComparator[hourOfDay]", c.toString()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22609);c = DateTimeComparator.getInstance(null, null); 
     __CLR4_4_1hebheble6qe97w.R.inc(22610);assertSame(DateTimeComparator.getInstance(), c); 
     __CLR4_4_1hebheble6qe97w.R.inc(22611);c = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), null); 
     __CLR4_4_1hebheble6qe97w.R.inc(22612);assertSame(DateTimeComparator.getDateOnlyInstance(), c); 
     __CLR4_4_1hebheble6qe97w.R.inc(22613);c = DateTimeComparator.getInstance(null, DateTimeFieldType.dayOfYear()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22614);assertSame(DateTimeComparator.getTimeOnlyInstance(), c); 
 }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}} 


public void testStaticGetDateOnlyInstance485() {__CLR4_4_1hebheble6qe97w.R.globalSliceStart(getClass().getName(),22615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r8noj7hg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hebheble6qe97w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hebheble6qe97w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetDateOnlyInstance485",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r8noj7hg7(){try{__CLR4_4_1hebheble6qe97w.R.inc(22615); 
     __CLR4_4_1hebheble6qe97w.R.inc(22616);DateTimeComparator c = DateTimeComparator.getDateOnlyInstance(); 
     __CLR4_4_1hebheble6qe97w.R.inc(22617);assertEquals(DateTimeFieldType.dayOfYear(), c.getLowerLimit()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22618);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22619);assertEquals("DateTimeComparator[dayOfYear-]", c.toString()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22620);assertSame(DateTimeComparator.getDateOnlyInstance(), DateTimeComparator.getDateOnlyInstance()); 
 }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}} 


public void testEqualsHashCode486() {__CLR4_4_1hebheble6qe97w.R.globalSliceStart(getClass().getName(),22621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hk0q2bhgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hebheble6qe97w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hebheble6qe97w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testEqualsHashCode486",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hk0q2bhgd(){try{__CLR4_4_1hebheble6qe97w.R.inc(22621); 
     __CLR4_4_1hebheble6qe97w.R.inc(22622);DateTimeComparator c1 = DateTimeComparator.getInstance(); 
     __CLR4_4_1hebheble6qe97w.R.inc(22623);assertEquals(true, c1.equals(c1)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22624);assertEquals(false, c1.equals(null)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22625);assertEquals(true, c1.hashCode() == c1.hashCode()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22626);DateTimeComparator c2 = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1hebheble6qe97w.R.inc(22627);assertEquals(true, c2.equals(c2)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22628);assertEquals(false, c2.equals(c1)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22629);assertEquals(false, c1.equals(c2)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22630);assertEquals(false, c2.equals(null)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22631);assertEquals(false, c1.hashCode() == c2.hashCode()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22632);DateTimeComparator c3 = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1hebheble6qe97w.R.inc(22633);assertEquals(true, c3.equals(c3)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22634);assertEquals(false, c3.equals(c1)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22635);assertEquals(true, c3.equals(c2)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22636);assertEquals(false, c1.equals(c3)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22637);assertEquals(true, c2.equals(c3)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22638);assertEquals(false, c1.hashCode() == c3.hashCode()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22639);assertEquals(true, c2.hashCode() == c3.hashCode()); 
     __CLR4_4_1hebheble6qe97w.R.inc(22640);DateTimeComparator c4 = DateTimeComparator.getDateOnlyInstance(); 
     __CLR4_4_1hebheble6qe97w.R.inc(22641);assertEquals(false, c4.hashCode() == c3.hashCode()); 
 }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}} 


public void testMinute487() {__CLR4_4_1hebheble6qe97w.R.globalSliceStart(getClass().getName(),22642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hgikochgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hebheble6qe97w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hebheble6qe97w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testMinute487",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hgikochgy(){try{__CLR4_4_1hebheble6qe97w.R.inc(22642); 
     __CLR4_4_1hebheble6qe97w.R.inc(22643);aDateTime = getADate("1969-12-31T23:58:00"); 
     __CLR4_4_1hebheble6qe97w.R.inc(22644);bDateTime = getADate("1969-12-31T23:59:00"); 
     __CLR4_4_1hebheble6qe97w.R.inc(22645);assertEquals("MinuteM1a", -1, cMinute.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22646);assertEquals("MinuteP1a", 1, cMinute.compare(bDateTime, aDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22647);aDateTime = getADate("1970-01-01T00:00:00"); 
     __CLR4_4_1hebheble6qe97w.R.inc(22648);bDateTime = getADate("1970-01-01T00:01:00"); 
     __CLR4_4_1hebheble6qe97w.R.inc(22649);assertEquals("MinuteM1b", -1, cMinute.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22650);assertEquals("MinuteP1b", 1, cMinute.compare(bDateTime, aDateTime)); 
 }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}} 


public void testSerialization2488() throws Exception {__CLR4_4_1hebheble6qe97w.R.globalSliceStart(getClass().getName(),22651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f324nhh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hebheble6qe97w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hebheble6qe97w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testSerialization2488",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f324nhh7() throws Exception{try{__CLR4_4_1hebheble6qe97w.R.inc(22651); 
     __CLR4_4_1hebheble6qe97w.R.inc(22652);DateTimeComparator c = DateTimeComparator.getInstance(); 
     __CLR4_4_1hebheble6qe97w.R.inc(22653);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1hebheble6qe97w.R.inc(22654);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1hebheble6qe97w.R.inc(22655);oos.writeObject(c); 
     __CLR4_4_1hebheble6qe97w.R.inc(22656);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1hebheble6qe97w.R.inc(22657);oos.close(); 
     __CLR4_4_1hebheble6qe97w.R.inc(22658);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1hebheble6qe97w.R.inc(22659);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1hebheble6qe97w.R.inc(22660);DateTimeComparator result = (DateTimeComparator) ois.readObject(); 
     __CLR4_4_1hebheble6qe97w.R.inc(22661);ois.close(); 
     __CLR4_4_1hebheble6qe97w.R.inc(22662);assertSame(c, result); 
 }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}} 


public void testMonth1215() {__CLR4_4_1hebheble6qe97w.R.globalSliceStart(getClass().getName(),22663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kkydx6hhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hebheble6qe97w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hebheble6qe97w.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testMonth1215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kkydx6hhj(){try{__CLR4_4_1hebheble6qe97w.R.inc(22663); 
     __CLR4_4_1hebheble6qe97w.R.inc(22664);aDateTime = getADate("2002-04-30T00:00:00"); 
     __CLR4_4_1hebheble6qe97w.R.inc(22665);bDateTime = getADate("2002-05-01T00:00:00"); 
     __CLR4_4_1hebheble6qe97w.R.inc(22666);assertEquals("MONTHM1a", -1, cMonth.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22667);assertEquals("MONTHP1a", 1, cMonth.compare(bDateTime, aDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22668);aDateTime = getADate("1900-01-01T00:00:00"); 
     __CLR4_4_1hebheble6qe97w.R.inc(22669);bDateTime = getADate("1899-12-31T00:00:00"); 
     __CLR4_4_1hebheble6qe97w.R.inc(22670);assertEquals("MONTHM1b", -1, cMonth.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hebheble6qe97w.R.inc(22671);assertEquals("MONTHP1b", 1, cMonth.compare(bDateTime, aDateTime)); 
 }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}} 

    
    
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
    private DateTime getADate(String s) {try{__CLR4_4_1hebheble6qe97w.R.inc(22672);
        __CLR4_4_1hebheble6qe97w.R.inc(22673);DateTime retDT = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22674);try {
            __CLR4_4_1hebheble6qe97w.R.inc(22675);retDT = new DateTime(s, DateTimeZone.UTC);
        } catch (IllegalArgumentException pe) {
            __CLR4_4_1hebheble6qe97w.R.inc(22676);pe.printStackTrace();
        }
        __CLR4_4_1hebheble6qe97w.R.inc(22677);return retDT;
    }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}}

    /**
     * Load a string array.
     */
    private List loadAList(String[] someStrs) {try{__CLR4_4_1hebheble6qe97w.R.inc(22678);
        __CLR4_4_1hebheble6qe97w.R.inc(22679);List newList = new ArrayList();
        __CLR4_4_1hebheble6qe97w.R.inc(22680);try {
            __CLR4_4_1hebheble6qe97w.R.inc(22681);for (int i = 0; (((i < someStrs.length)&&(__CLR4_4_1hebheble6qe97w.R.iget(22682)!=0|true))||(__CLR4_4_1hebheble6qe97w.R.iget(22683)==0&false)); ++i) {{
                __CLR4_4_1hebheble6qe97w.R.inc(22684);newList.add(new DateTime(someStrs[i], DateTimeZone.UTC));
            } // end of the for
        }} catch (IllegalArgumentException pe) {
            __CLR4_4_1hebheble6qe97w.R.inc(22685);pe.printStackTrace();
        }
        __CLR4_4_1hebheble6qe97w.R.inc(22686);return newList;
    }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}}

    /**
     * Check if the list is sorted.
     */
    private boolean isListSorted(List tl) {try{__CLR4_4_1hebheble6qe97w.R.inc(22687);
        // tl must be populated with DateTime objects.
        __CLR4_4_1hebheble6qe97w.R.inc(22688);DateTime lhDT = (DateTime)tl.get(0);
        __CLR4_4_1hebheble6qe97w.R.inc(22689);DateTime rhDT = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22690);Long lhVal = new Long( lhDT.getMillis() );
        __CLR4_4_1hebheble6qe97w.R.inc(22691);Long rhVal = null;
        __CLR4_4_1hebheble6qe97w.R.inc(22692);for (int i = 1; (((i < tl.size())&&(__CLR4_4_1hebheble6qe97w.R.iget(22693)!=0|true))||(__CLR4_4_1hebheble6qe97w.R.iget(22694)==0&false)); ++i) {{
            __CLR4_4_1hebheble6qe97w.R.inc(22695);rhDT = (DateTime)tl.get(i);
            __CLR4_4_1hebheble6qe97w.R.inc(22696);rhVal = new Long( rhDT.getMillis() );
            __CLR4_4_1hebheble6qe97w.R.inc(22697);if ( (((lhVal.compareTo( rhVal) > 0 )&&(__CLR4_4_1hebheble6qe97w.R.iget(22698)!=0|true))||(__CLR4_4_1hebheble6qe97w.R.iget(22699)==0&false))) {__CLR4_4_1hebheble6qe97w.R.inc(22700);return false;
            //
            }__CLR4_4_1hebheble6qe97w.R.inc(22701);lhVal = rhVal;  // swap for next iteration
            __CLR4_4_1hebheble6qe97w.R.inc(22702);lhDT = rhDT;    // swap for next iteration
        }
        }__CLR4_4_1hebheble6qe97w.R.inc(22703);return true;
    }finally{__CLR4_4_1hebheble6qe97w.R.flushNeeded();}}

}
