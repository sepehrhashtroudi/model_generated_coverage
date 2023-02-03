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
public class TestDateTimeComparator extends TestCase {static class __CLR4_4_1hjhhjhlc8axdnj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,22907,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Chronology ISO = ISOChronology.getInstance();
    
    public static void main(String[] args) {try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22733);
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22734);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22735);
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22736);return new TestSuite(TestDateTimeComparator.class);
    }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}}

    public TestDateTimeComparator(String name) {
        super(name);__CLR4_4_1hjhhjhlc8axdnj.R.inc(22738);try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22737);
    }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}}

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
    public void setUp() /* throws Exception */ {try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22739);
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22740);Chronology chrono = ISOChronology.getInstanceUTC();

        // super.setUp();
        // Obtain comparator's
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22741);cMillis = DateTimeComparator.getInstance(null, DateTimeFieldType.secondOfMinute());
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22742);cSecond = DateTimeComparator.getInstance(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.minuteOfHour());
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22743);cMinute = DateTimeComparator.getInstance(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22744);cHour = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22745);cDayOfWeek = DateTimeComparator.getInstance(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.weekOfWeekyear());
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22746);cDayOfMonth = DateTimeComparator.getInstance(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear());
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22747);cDayOfYear = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), DateTimeFieldType.year());
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22748);cWeekOfWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekyear());
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22749);cWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekyear());
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22750);cMonth = DateTimeComparator.getInstance(DateTimeFieldType.monthOfYear(), DateTimeFieldType.year());
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22751);cYear = DateTimeComparator.getInstance(DateTimeFieldType.year());
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22752);cDate = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22753);cTime = DateTimeComparator.getTimeOnlyInstance();
    }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}}

    /**
     * Junit <code>tearDown()</code> method.
     */
    protected void tearDown() /* throws Exception */ {try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22754);
        // super.tearDown();
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22755);aDateTime = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22756);bDateTime = null;
        //
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22757);cMillis = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22758);cSecond = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22759);cMinute = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22760);cHour = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22761);cDayOfWeek = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22762);cDayOfMonth = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22763);cDayOfYear = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22764);cWeekOfWeekyear = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22765);cWeekyear = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22766);cMonth = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22767);cYear = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22768);cDate = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22769);cTime = null;
    }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testStaticGetDateOnlyInstance507() {__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceStart(getClass().getName(),22770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16y9uu6hki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjhhjhlc8axdnj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetDateOnlyInstance507",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16y9uu6hki(){try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22770); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22771);DateTimeComparator c = DateTimeComparator.getDateOnlyInstance(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22772);assertEquals(DateTimeFieldType.dayOfYear(), c.getLowerLimit()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22773);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22774);assertEquals("DateTimeComparator[dayOfYear-]", c.toString()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22775);assertSame(DateTimeComparator.getDateOnlyInstance(), DateTimeComparator.getDateOnlyInstance()); 
 }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}} 


public void testStaticGetInstance596() {__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceStart(getClass().getName(),22776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1verv02hko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjhhjhlc8axdnj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstance596",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1verv02hko(){try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22776); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22777);DateTimeComparator c = DateTimeComparator.getInstance(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22778);assertEquals(null, c.getLowerLimit()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22779);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22780);assertEquals("DateTimeComparator[]", c.toString()); 
 }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}} 


public void testMinute714() {__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceStart(getClass().getName(),22781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjqpidhkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjhhjhlc8axdnj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testMinute714",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjqpidhkt(){try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22781); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22782);aDateTime = getADate("1969-12-31T23:58:00"); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22783);bDateTime = getADate("1969-12-31T23:59:00"); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22784);assertEquals("MinuteM1a", -1, cMinute.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22785);assertEquals("MinuteP1a", 1, cMinute.compare(bDateTime, aDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22786);aDateTime = getADate("1970-01-01T00:00:00"); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22787);bDateTime = getADate("1970-01-01T00:01:00"); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22788);assertEquals("MinuteM1b", -1, cMinute.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22789);assertEquals("MinuteP1b", 1, cMinute.compare(bDateTime, aDateTime)); 
 }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}} 


public void testEqualsHashCode785() {__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceStart(getClass().getName(),22790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7krg1hl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjhhjhlc8axdnj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testEqualsHashCode785",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7krg1hl2(){try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22790); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22791);DateTimeComparator c1 = DateTimeComparator.getInstance(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22792);assertEquals(true, c1.equals(c1)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22793);assertEquals(false, c1.equals(null)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22794);assertEquals(true, c1.hashCode() == c1.hashCode()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22795);DateTimeComparator c2 = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22796);assertEquals(true, c2.equals(c2)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22797);assertEquals(false, c2.equals(c1)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22798);assertEquals(false, c1.equals(c2)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22799);assertEquals(false, c2.equals(null)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22800);assertEquals(false, c1.hashCode() == c2.hashCode()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22801);DateTimeComparator c3 = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22802);assertEquals(true, c3.equals(c3)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22803);assertEquals(false, c3.equals(c1)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22804);assertEquals(true, c3.equals(c2)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22805);assertEquals(false, c1.equals(c3)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22806);assertEquals(true, c2.equals(c3)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22807);assertEquals(false, c1.hashCode() == c3.hashCode()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22808);assertEquals(true, c2.hashCode() == c3.hashCode()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22809);DateTimeComparator c4 = DateTimeComparator.getDateOnlyInstance(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22810);assertEquals(false, c4.hashCode() == c3.hashCode()); 
 }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}} 


public void testBasicComps3979() {__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceStart(getClass().getName(),22811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gifwuhhln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjhhjhlc8axdnj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps3979",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gifwuhhln(){try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22811); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22812);Date aDateTime = new Date(System.currentTimeMillis()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22813);Date bDateTime = new Date(aDateTime.getTime()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22814);assertEquals("MILLIS", 0, cMillis.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22815);assertEquals("SECOND", 0, cSecond.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22816);assertEquals("MINUTE", 0, cMinute.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22817);assertEquals("HOUR", 0, cHour.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22818);assertEquals("DOW", 0, cDayOfWeek.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22819);assertEquals("DOM", 0, cDayOfMonth.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22820);assertEquals("DOY", 0, cDayOfYear.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22821);assertEquals("WOW", 0, cWeekOfWeekyear.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22822);assertEquals("WY", 0, cWeekyear.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22823);assertEquals("MONTH", 0, cMonth.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22824);assertEquals("YEAR", 0, cYear.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22825);assertEquals("DATE", 0, cDate.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22826);assertEquals("TIME", 0, cTime.compare(aDateTime, bDateTime)); 
 }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}} 


public void testSerialization21093() throws Exception {__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceStart(getClass().getName(),22827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8lh90hm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjhhjhlc8axdnj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testSerialization21093",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8lh90hm3() throws Exception{try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22827); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22828);DateTimeComparator c = DateTimeComparator.getInstance(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22829);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22830);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22831);oos.writeObject(c); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22832);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22833);oos.close(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22834);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22835);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22836);DateTimeComparator result = (DateTimeComparator) ois.readObject(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22837);ois.close(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22838);assertSame(c, result); 
 }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}} 


public void testStaticGetInstanceLower1168() {__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceStart(getClass().getName(),22839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13vklunhmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjhhjhlc8axdnj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstanceLower1168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13vklunhmf(){try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22839); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22840);DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22841);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22842);assertEquals(null, c.getUpperLimit()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22843);assertEquals("DateTimeComparator[hourOfDay-]", c.toString()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22844);c = DateTimeComparator.getInstance(null); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22845);assertSame(DateTimeComparator.getInstance(), c); 
 }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}} 


public void testMonth1341() {__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceStart(getClass().getName(),22846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nkkhjohmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjhhjhlc8axdnj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testMonth1341",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nkkhjohmm(){try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22846); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22847);aDateTime = getADate("2002-04-30T00:00:00"); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22848);bDateTime = getADate("2002-05-01T00:00:00"); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22849);assertEquals("MONTHM1a", -1, cMonth.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22850);assertEquals("MONTHP1a", 1, cMonth.compare(bDateTime, aDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22851);aDateTime = getADate("1900-01-01T00:00:00"); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22852);bDateTime = getADate("1899-12-31T00:00:00"); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22853);assertEquals("MONTHM1b", -1, cMonth.compare(aDateTime, bDateTime)); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22854);assertEquals("MONTHP1b", 1, cMonth.compare(bDateTime, aDateTime)); 
 }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}} 


public void testListYOYY1351() {__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceStart(getClass().getName(),22855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dp7fnvhmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjhhjhlc8axdnj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListYOYY1351",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dp7fnvhmv(){try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22855); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22856);String[] dtStrs = { "2010-04-01T10:00:00", "2002-01-01T10:00:00" }; 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22857);List sl = loadAList(dtStrs); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22858);boolean isSorted1 = isListSorted(sl); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22859);Collections.sort(sl, cWeekyear); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22860);boolean isSorted2 = isListSorted(sl); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22861);assertEquals("ListYOYY", !isSorted1, isSorted2); 
 }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}} 


public void testListWOW1737() {__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceStart(getClass().getName(),22862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115slb4hn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjhhjhlc8axdnj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListWOW1737",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115slb4hn2(){try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22862); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22863);String[] dtStrs = { "2002-04-01T10:00:00", "2002-01-01T10:00:00", "2002-12-01T10:00:00", "2002-09-01T10:00:00", "2002-09-01T10:00:00", "2002-02-01T10:00:00", "2002-10-01T10:00:00" }; 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22864);List sl = loadAList(dtStrs); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22865);boolean isSorted1 = isListSorted(sl); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22866);Collections.sort(sl, cWeekOfWeekyear); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22867);boolean isSorted2 = isListSorted(sl); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22868);assertEquals("ListWOW", !isSorted1, isSorted2); 
 }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}} 


public void testStaticGetTimeOnlyInstance1755() {__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceStart(getClass().getName(),22869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1668ncfhn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hjhhjhlc8axdnj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hjhhjhlc8axdnj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetTimeOnlyInstance1755",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1668ncfhn9(){try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22869); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22870);DateTimeComparator c = DateTimeComparator.getTimeOnlyInstance(); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22871);assertEquals(null, c.getLowerLimit()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22872);assertEquals(DateTimeFieldType.dayOfYear(), c.getUpperLimit()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22873);assertEquals("DateTimeComparator[-dayOfYear]", c.toString()); 
     __CLR4_4_1hjhhjhlc8axdnj.R.inc(22874);assertSame(DateTimeComparator.getTimeOnlyInstance(), DateTimeComparator.getTimeOnlyInstance()); 
 }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}} 

    
    
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
    private DateTime getADate(String s) {try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22875);
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22876);DateTime retDT = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22877);try {
            __CLR4_4_1hjhhjhlc8axdnj.R.inc(22878);retDT = new DateTime(s, DateTimeZone.UTC);
        } catch (IllegalArgumentException pe) {
            __CLR4_4_1hjhhjhlc8axdnj.R.inc(22879);pe.printStackTrace();
        }
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22880);return retDT;
    }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}}

    /**
     * Load a string array.
     */
    private List loadAList(String[] someStrs) {try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22881);
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22882);List newList = new ArrayList();
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22883);try {
            __CLR4_4_1hjhhjhlc8axdnj.R.inc(22884);for (int i = 0; (((i < someStrs.length)&&(__CLR4_4_1hjhhjhlc8axdnj.R.iget(22885)!=0|true))||(__CLR4_4_1hjhhjhlc8axdnj.R.iget(22886)==0&false)); ++i) {{
                __CLR4_4_1hjhhjhlc8axdnj.R.inc(22887);newList.add(new DateTime(someStrs[i], DateTimeZone.UTC));
            } // end of the for
        }} catch (IllegalArgumentException pe) {
            __CLR4_4_1hjhhjhlc8axdnj.R.inc(22888);pe.printStackTrace();
        }
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22889);return newList;
    }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}}

    /**
     * Check if the list is sorted.
     */
    private boolean isListSorted(List tl) {try{__CLR4_4_1hjhhjhlc8axdnj.R.inc(22890);
        // tl must be populated with DateTime objects.
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22891);DateTime lhDT = (DateTime)tl.get(0);
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22892);DateTime rhDT = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22893);Long lhVal = new Long( lhDT.getMillis() );
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22894);Long rhVal = null;
        __CLR4_4_1hjhhjhlc8axdnj.R.inc(22895);for (int i = 1; (((i < tl.size())&&(__CLR4_4_1hjhhjhlc8axdnj.R.iget(22896)!=0|true))||(__CLR4_4_1hjhhjhlc8axdnj.R.iget(22897)==0&false)); ++i) {{
            __CLR4_4_1hjhhjhlc8axdnj.R.inc(22898);rhDT = (DateTime)tl.get(i);
            __CLR4_4_1hjhhjhlc8axdnj.R.inc(22899);rhVal = new Long( rhDT.getMillis() );
            __CLR4_4_1hjhhjhlc8axdnj.R.inc(22900);if ( (((lhVal.compareTo( rhVal) > 0 )&&(__CLR4_4_1hjhhjhlc8axdnj.R.iget(22901)!=0|true))||(__CLR4_4_1hjhhjhlc8axdnj.R.iget(22902)==0&false))) {__CLR4_4_1hjhhjhlc8axdnj.R.inc(22903);return false;
            //
            }__CLR4_4_1hjhhjhlc8axdnj.R.inc(22904);lhVal = rhVal;  // swap for next iteration
            __CLR4_4_1hjhhjhlc8axdnj.R.inc(22905);lhDT = rhDT;    // swap for next iteration
        }
        }__CLR4_4_1hjhhjhlc8axdnj.R.inc(22906);return true;
    }finally{__CLR4_4_1hjhhjhlc8axdnj.R.flushNeeded();}}

}
