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
public class TestDateTimeComparator extends TestCase {static class __CLR4_4_1hf4hf4le6rckf5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,22750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Chronology ISO = ISOChronology.getInstance();
    
    public static void main(String[] args) {try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22576);
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22577);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22578);
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22579);return new TestSuite(TestDateTimeComparator.class);
    }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}}

    public TestDateTimeComparator(String name) {
        super(name);__CLR4_4_1hf4hf4le6rckf5.R.inc(22581);try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22580);
    }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}}

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
    public void setUp() /* throws Exception */ {try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22582);
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22583);Chronology chrono = ISOChronology.getInstanceUTC();

        // super.setUp();
        // Obtain comparator's
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22584);cMillis = DateTimeComparator.getInstance(null, DateTimeFieldType.secondOfMinute());
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22585);cSecond = DateTimeComparator.getInstance(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.minuteOfHour());
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22586);cMinute = DateTimeComparator.getInstance(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22587);cHour = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22588);cDayOfWeek = DateTimeComparator.getInstance(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.weekOfWeekyear());
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22589);cDayOfMonth = DateTimeComparator.getInstance(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear());
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22590);cDayOfYear = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), DateTimeFieldType.year());
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22591);cWeekOfWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekyear());
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22592);cWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekyear());
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22593);cMonth = DateTimeComparator.getInstance(DateTimeFieldType.monthOfYear(), DateTimeFieldType.year());
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22594);cYear = DateTimeComparator.getInstance(DateTimeFieldType.year());
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22595);cDate = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22596);cTime = DateTimeComparator.getTimeOnlyInstance();
    }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}}

    /**
     * Junit <code>tearDown()</code> method.
     */
    protected void tearDown() /* throws Exception */ {try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22597);
        // super.tearDown();
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22598);aDateTime = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22599);bDateTime = null;
        //
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22600);cMillis = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22601);cSecond = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22602);cMinute = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22603);cHour = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22604);cDayOfWeek = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22605);cDayOfMonth = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22606);cDayOfYear = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22607);cWeekOfWeekyear = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22608);cWeekyear = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22609);cMonth = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22610);cYear = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22611);cDate = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22612);cTime = null;
    }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testBasicComps3271() {__CLR4_4_1hf4hf4le6rckf5.R.globalSliceStart(getClass().getName(),22613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rkgt4ohg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hf4hf4le6rckf5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hf4hf4le6rckf5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps3271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rkgt4ohg5(){try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22613); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22614);Date aDateTime = new Date(System.currentTimeMillis()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22615);Date bDateTime = new Date(aDateTime.getTime()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22616);assertEquals("MILLIS", 0, cMillis.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22617);assertEquals("SECOND", 0, cSecond.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22618);assertEquals("MINUTE", 0, cMinute.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22619);assertEquals("HOUR", 0, cHour.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22620);assertEquals("DOW", 0, cDayOfWeek.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22621);assertEquals("DOM", 0, cDayOfMonth.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22622);assertEquals("DOY", 0, cDayOfYear.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22623);assertEquals("WOW", 0, cWeekOfWeekyear.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22624);assertEquals("WY", 0, cWeekyear.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22625);assertEquals("MONTH", 0, cMonth.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22626);assertEquals("YEAR", 0, cYear.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22627);assertEquals("DATE", 0, cDate.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22628);assertEquals("TIME", 0, cTime.compare(aDateTime, bDateTime)); 
 }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}} 


public void testStaticGetInstance496() {__CLR4_4_1hf4hf4le6rckf5.R.globalSliceStart(getClass().getName(),22629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9x64zhgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hf4hf4le6rckf5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hf4hf4le6rckf5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstance496",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9x64zhgl(){try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22629); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22630);DateTimeComparator c = DateTimeComparator.getInstance(); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22631);assertEquals(null, c.getLowerLimit()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22632);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22633);assertEquals("DateTimeComparator[]", c.toString()); 
 }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}} 


public void testStaticGetInstanceLower497() {__CLR4_4_1hf4hf4le6rckf5.R.globalSliceStart(getClass().getName(),22634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ss346bhgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hf4hf4le6rckf5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hf4hf4le6rckf5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstanceLower497",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ss346bhgq(){try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22634); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22635);DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22636);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22637);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22638);assertEquals("DateTimeComparator[hourOfDay-]", c.toString()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22639);c = DateTimeComparator.getInstance(null); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22640);assertSame(DateTimeComparator.getInstance(), c); 
 }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}} 


public void testStaticGetInstanceLowerUpper498() {__CLR4_4_1hf4hf4le6rckf5.R.globalSliceStart(getClass().getName(),22641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wcei6hgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hf4hf4le6rckf5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hf4hf4le6rckf5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstanceLowerUpper498",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wcei6hgx(){try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22641); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22642);DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22643);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22644);assertEquals(DateTimeFieldType.dayOfYear(), c.getUpperLimit()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22645);assertEquals("DateTimeComparator[hourOfDay-dayOfYear]", c.toString()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22646);c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22647);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22648);assertEquals(DateTimeFieldType.hourOfDay(), c.getUpperLimit()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22649);assertEquals("DateTimeComparator[hourOfDay]", c.toString()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22650);c = DateTimeComparator.getInstance(null, null); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22651);assertSame(DateTimeComparator.getInstance(), c); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22652);c = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), null); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22653);assertSame(DateTimeComparator.getDateOnlyInstance(), c); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22654);c = DateTimeComparator.getInstance(null, DateTimeFieldType.dayOfYear()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22655);assertSame(DateTimeComparator.getTimeOnlyInstance(), c); 
 }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}} 


public void testEqualsHashCode499() {__CLR4_4_1hf4hf4le6rckf5.R.globalSliceStart(getClass().getName(),22656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwu2unhhc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hf4hf4le6rckf5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hf4hf4le6rckf5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testEqualsHashCode499",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwu2unhhc(){try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22656); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22657);DateTimeComparator c1 = DateTimeComparator.getInstance(); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22658);assertEquals(true, c1.equals(c1)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22659);assertEquals(false, c1.equals(null)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22660);assertEquals(true, c1.hashCode() == c1.hashCode()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22661);DateTimeComparator c2 = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22662);assertEquals(true, c2.equals(c2)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22663);assertEquals(false, c2.equals(c1)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22664);assertEquals(false, c1.equals(c2)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22665);assertEquals(false, c2.equals(null)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22666);assertEquals(false, c1.hashCode() == c2.hashCode()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22667);DateTimeComparator c3 = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22668);assertEquals(true, c3.equals(c3)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22669);assertEquals(false, c3.equals(c1)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22670);assertEquals(true, c3.equals(c2)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22671);assertEquals(false, c1.equals(c3)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22672);assertEquals(true, c2.equals(c3)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22673);assertEquals(false, c1.hashCode() == c3.hashCode()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22674);assertEquals(true, c2.hashCode() == c3.hashCode()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22675);DateTimeComparator c4 = DateTimeComparator.getDateOnlyInstance(); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22676);assertEquals(false, c4.hashCode() == c3.hashCode()); 
 }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}} 


public void testListWOW500() {__CLR4_4_1hf4hf4le6rckf5.R.globalSliceStart(getClass().getName(),22677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a42i25hhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hf4hf4le6rckf5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hf4hf4le6rckf5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListWOW500",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a42i25hhx(){try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22677); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22678);String[] dtStrs = { "2002-04-01T10:00:00", "2002-01-01T10:00:00", "2002-12-01T10:00:00", "2002-09-01T10:00:00", "2002-09-01T10:00:00", "2002-02-01T10:00:00", "2002-10-01T10:00:00" }; 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22679);List sl = loadAList(dtStrs); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22680);boolean isSorted1 = isListSorted(sl); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22681);Collections.sort(sl, cWeekOfWeekyear); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22682);boolean isSorted2 = isListSorted(sl); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22683);assertEquals("ListWOW", !isSorted1, isSorted2); 
 }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}} 


public void testSerialization2501() throws Exception {__CLR4_4_1hf4hf4le6rckf5.R.globalSliceStart(getClass().getName(),22684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwtlahhi4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hf4hf4le6rckf5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hf4hf4le6rckf5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testSerialization2501",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwtlahhi4() throws Exception{try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22684); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22685);DateTimeComparator c = DateTimeComparator.getInstance(); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22686);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22687);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22688);oos.writeObject(c); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22689);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22690);oos.close(); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22691);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22692);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22693);DateTimeComparator result = (DateTimeComparator) ois.readObject(); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22694);ois.close(); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22695);assertSame(c, result); 
 }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}} 


public void testStaticGetTimeOnlyInstance502() {__CLR4_4_1hf4hf4le6rckf5.R.globalSliceStart(getClass().getName(),22696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15i4iqihig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hf4hf4le6rckf5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hf4hf4le6rckf5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetTimeOnlyInstance502",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15i4iqihig(){try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22696); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22697);DateTimeComparator c = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22698);assertEquals(null, c.getLowerLimit()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22699);assertEquals(DateTimeFieldType.dayOfYear(), c.getUpperLimit()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22700);assertEquals("DateTimeComparator[-dayOfYear]", c.toString()); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22701);assertSame(DateTimeComparator.getTimeOnlyInstance(), DateTimeComparator.getTimeOnlyInstance()); 
 }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}} 


public void testListYOYY573() {__CLR4_4_1hf4hf4le6rckf5.R.globalSliceStart(getClass().getName(),22702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g5bz0uhim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hf4hf4le6rckf5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hf4hf4le6rckf5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListYOYY573",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g5bz0uhim(){try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22702); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22703);String[] dtStrs = { "2010-04-01T10:00:00", "2002-01-01T10:00:00" }; 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22704);List sl = loadAList(dtStrs); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22705);boolean isSorted1 = isListSorted(sl); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22706);Collections.sort(sl, cWeekyear); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22707);boolean isSorted2 = isListSorted(sl); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22708);assertEquals("ListYOYY", !isSorted1, isSorted2); 
 }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}} 


public void testMonth1218() {__CLR4_4_1hf4hf4le6rckf5.R.globalSliceStart(getClass().getName(),22709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ubyaalhit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hf4hf4le6rckf5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hf4hf4le6rckf5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testMonth1218",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ubyaalhit(){try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22709); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22710);aDateTime = getADate("2002-04-30T00:00:00"); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22711);bDateTime = getADate("2002-05-01T00:00:00"); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22712);assertEquals("MONTHM1a", -1, cMonth.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22713);assertEquals("MONTHP1a", 1, cMonth.compare(bDateTime, aDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22714);aDateTime = getADate("1900-01-01T00:00:00"); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22715);bDateTime = getADate("1899-12-31T00:00:00"); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22716);assertEquals("MONTHM1b", -1, cMonth.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hf4hf4le6rckf5.R.inc(22717);assertEquals("MONTHP1b", 1, cMonth.compare(bDateTime, aDateTime)); 
 }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}} 

    
    
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
    private DateTime getADate(String s) {try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22718);
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22719);DateTime retDT = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22720);try {
            __CLR4_4_1hf4hf4le6rckf5.R.inc(22721);retDT = new DateTime(s, DateTimeZone.UTC);
        } catch (IllegalArgumentException pe) {
            __CLR4_4_1hf4hf4le6rckf5.R.inc(22722);pe.printStackTrace();
        }
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22723);return retDT;
    }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}}

    /**
     * Load a string array.
     */
    private List loadAList(String[] someStrs) {try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22724);
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22725);List newList = new ArrayList();
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22726);try {
            __CLR4_4_1hf4hf4le6rckf5.R.inc(22727);for (int i = 0; (((i < someStrs.length)&&(__CLR4_4_1hf4hf4le6rckf5.R.iget(22728)!=0|true))||(__CLR4_4_1hf4hf4le6rckf5.R.iget(22729)==0&false)); ++i) {{
                __CLR4_4_1hf4hf4le6rckf5.R.inc(22730);newList.add(new DateTime(someStrs[i], DateTimeZone.UTC));
            } // end of the for
        }} catch (IllegalArgumentException pe) {
            __CLR4_4_1hf4hf4le6rckf5.R.inc(22731);pe.printStackTrace();
        }
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22732);return newList;
    }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}}

    /**
     * Check if the list is sorted.
     */
    private boolean isListSorted(List tl) {try{__CLR4_4_1hf4hf4le6rckf5.R.inc(22733);
        // tl must be populated with DateTime objects.
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22734);DateTime lhDT = (DateTime)tl.get(0);
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22735);DateTime rhDT = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22736);Long lhVal = new Long( lhDT.getMillis() );
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22737);Long rhVal = null;
        __CLR4_4_1hf4hf4le6rckf5.R.inc(22738);for (int i = 1; (((i < tl.size())&&(__CLR4_4_1hf4hf4le6rckf5.R.iget(22739)!=0|true))||(__CLR4_4_1hf4hf4le6rckf5.R.iget(22740)==0&false)); ++i) {{
            __CLR4_4_1hf4hf4le6rckf5.R.inc(22741);rhDT = (DateTime)tl.get(i);
            __CLR4_4_1hf4hf4le6rckf5.R.inc(22742);rhVal = new Long( rhDT.getMillis() );
            __CLR4_4_1hf4hf4le6rckf5.R.inc(22743);if ( (((lhVal.compareTo( rhVal) > 0 )&&(__CLR4_4_1hf4hf4le6rckf5.R.iget(22744)!=0|true))||(__CLR4_4_1hf4hf4le6rckf5.R.iget(22745)==0&false))) {__CLR4_4_1hf4hf4le6rckf5.R.inc(22746);return false;
            //
            }__CLR4_4_1hf4hf4le6rckf5.R.inc(22747);lhVal = rhVal;  // swap for next iteration
            __CLR4_4_1hf4hf4le6rckf5.R.inc(22748);lhDT = rhDT;    // swap for next iteration
        }
        }__CLR4_4_1hf4hf4le6rckf5.R.inc(22749);return true;
    }finally{__CLR4_4_1hf4hf4le6rckf5.R.flushNeeded();}}

}
