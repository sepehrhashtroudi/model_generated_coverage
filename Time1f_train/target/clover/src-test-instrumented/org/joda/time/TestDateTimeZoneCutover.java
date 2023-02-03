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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.tz.DateTimeZoneBuilder;

/**
 * This class is a JUnit test for DateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeZoneCutover extends TestCase {static class __CLR4_4_1iaxiaxlc8axdq7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,23931,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23721);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23722);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23723);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23724);return new TestSuite(TestDateTimeZoneCutover.class);
    }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}}

    public TestDateTimeZoneCutover(String name) {
        super(name);__CLR4_4_1iaxiaxlc8axdq7.R.inc(23726);try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23725);
    }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23727);
    }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23728);
    }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    // The behaviour of getOffsetFromLocal is defined in its javadoc
    // However, this definition doesn't work for all DateTimeField operations
    
    /** Mock zone simulating Asia/Gaza cutover at midnight 2007-04-01 */
    private static long CUTOVER_GAZA = 1175378400000L;
    private static int OFFSET_GAZA = 7200000;  // +02:00
    private static final DateTimeZone MOCK_GAZA = new MockZone(CUTOVER_GAZA, OFFSET_GAZA, 3600);

    //-----------------------------------------------------------------------

public void test_MutableDateTime_withZoneRetainFields_Gaza77() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzzpoib5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MutableDateTime_withZoneRetainFields_Gaza77",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzzpoib5(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23729); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23730);MutableDateTime dt = new MutableDateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23731);assertEquals("2007-04-01T00:00:00.000Z", dt.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23732);dt.setZoneRetainFields(MOCK_GAZA); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23733);assertEquals("2007-04-01T01:00:00.000+03:00", dt.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void testBug2182444_usCentral95() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nl2f10iba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug2182444_usCentral95",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nl2f10iba(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23734); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23735);Chronology chronUSCentral = GregorianChronology.getInstance(DateTimeZone.forID("US/Central")); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23736);Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23737);DateTime usCentralStandardInUTC = new DateTime(2008, 11, 2, 7, 0, 0, 0, chronUTC); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23738);DateTime usCentralDaylightInUTC = new DateTime(2008, 11, 2, 6, 0, 0, 0, chronUTC); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23739);assertTrue("Should be standard time", chronUSCentral.getZone().isStandardOffset(usCentralStandardInUTC.getMillis())); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23740);assertFalse("Should be daylight time", chronUSCentral.getZone().isStandardOffset(usCentralDaylightInUTC.getMillis())); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23741);DateTime usCentralStandardInUSCentral = usCentralStandardInUTC.toDateTime(chronUSCentral); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23742);DateTime usCentralDaylightInUSCentral = usCentralDaylightInUTC.toDateTime(chronUSCentral); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23743);assertEquals(1, usCentralStandardInUSCentral.getHourOfDay()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23744);assertEquals(usCentralStandardInUSCentral.getHourOfDay(), usCentralDaylightInUSCentral.getHourOfDay()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23745);assertTrue(usCentralStandardInUSCentral.getMillis() != usCentralDaylightInUSCentral.getMillis()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23746);assertEquals(usCentralStandardInUSCentral, usCentralStandardInUSCentral.withHourOfDay(1)); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23747);assertEquals(usCentralStandardInUSCentral.getMillis() + 3, usCentralStandardInUSCentral.withMillisOfSecond(3).getMillis()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23748);assertEquals(usCentralDaylightInUSCentral, usCentralDaylightInUSCentral.withHourOfDay(1)); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23749);assertEquals(usCentralDaylightInUSCentral.getMillis() + 3, usCentralDaylightInUSCentral.withMillisOfSecond(3).getMillis()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_DateTime_JustAfterLastEverOverlap165() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15jzg7xibq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_JustAfterLastEverOverlap165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15jzg7xibq(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23750); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23751);DateTimeZone zone = new DateTimeZoneBuilder().setStandardOffset(-3 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("SUMMER", 1 * DateTimeConstants.MILLIS_PER_HOUR, 2000, 2008, 'w', 4, 10, 0, true, 23 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("WINTER", 0, 2000, 2008, 'w', 8, 10, 0, true, 0 * DateTimeConstants.MILLIS_PER_HOUR).toDateTimeZone("Zone", false); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23752);LocalDate date = new LocalDate(2008, 8, 10); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23753);assertEquals("2008-08-10", date.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23754);DateTime dt = date.toDateTimeAtStartOfDay(zone); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23755);assertEquals("2008-08-10T00:00:00.000-03:00", dt.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void testBug3476684_adjustOffset_springGap201() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o8xwgxibw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3476684_adjustOffset_springGap201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o8xwgxibw(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23756); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23757);final DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo"); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23758);DateTime base = new DateTime(2011, 10, 15, 22, 15, zone); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23759);DateTime baseBefore = base.plusHours(1); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23760);DateTime baseAfter = base.plusHours(2); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23761);assertSame(base, base.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23762);assertSame(base, base.withLaterOffsetAtOverlap()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23763);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23764);assertEquals(baseBefore, baseBefore.withLaterOffsetAtOverlap()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23765);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23766);assertEquals(baseAfter, baseAfter.withEarlierOffsetAtOverlap()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_DateTime_minusHour_NewYork_Autumn261() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nm4yicic7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_NewYork_Autumn261",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nm4yicic7(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23767); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23768);DateTime dt = new DateTime(2007, 11, 4, 8, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23769);assertEquals("2007-11-04T08:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23770);DateTime minus6 = dt.minusHours(6); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23771);assertEquals("2007-11-04T02:00:00.000-05:00", minus6.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23772);DateTime minus7 = dt.minusHours(7); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23773);assertEquals("2007-11-04T01:00:00.000-05:00", minus7.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23774);DateTime minus8 = dt.minusHours(8); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23775);assertEquals("2007-11-04T01:00:00.000-04:00", minus8.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23776);DateTime minus9 = dt.minusHours(9); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23777);assertEquals("2007-11-04T00:00:00.000-04:00", minus9.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void testWithMinuteOfHourInDstChange_mockZone275() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m0e9orici();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMinuteOfHourInDstChange_mockZone275",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m0e9orici(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23778); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23779);DateTime cutover = new DateTime(2010, 10, 31, 1, 15, DateTimeZone.forOffsetHoursMinutes(0, 30)); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23780);assertEquals("2010-10-31T01:15:00.000+00:30", cutover.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23781);DateTimeZone halfHourZone = new MockZone(cutover.getMillis(), 3600000, -1800); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23782);DateTime pre = new DateTime(2010, 10, 31, 1, 0, halfHourZone); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23783);assertEquals("2010-10-31T01:00:00.000+01:00", pre.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23784);DateTime post = new DateTime(2010, 10, 31, 1, 59, halfHourZone); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23785);assertEquals("2010-10-31T01:59:00.000+00:30", post.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23786);DateTime testPre1 = pre.withMinuteOfHour(30); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23787);assertEquals("2010-10-31T01:30:00.000+01:00", testPre1.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23788);DateTime testPre2 = pre.withMinuteOfHour(50); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23789);assertEquals("2010-10-31T01:50:00.000+00:30", testPre2.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23790);DateTime testPost1 = post.withMinuteOfHour(30); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23791);assertEquals("2010-10-31T01:30:00.000+00:30", testPost1.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23792);DateTime testPost2 = post.withMinuteOfHour(10); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23793);assertEquals("2010-10-31T01:10:00.000+01:00", testPost2.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_DateTime_withDay_Turk420() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eja6e9icy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withDay_Turk420",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eja6e9icy(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23794); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23795);DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_TURK); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23796);assertEquals("2007-04-02T00:00:00.000-04:00", dt.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23797);DateTime res = dt.withDayOfMonth(1); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23798);assertEquals("2007-04-01T01:00:00.000-04:00", res.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void testBug2182444_ausNSW446() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hnpqwsid3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug2182444_ausNSW446",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hnpqwsid3(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23799); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23800);Chronology chronAusNSW = GregorianChronology.getInstance(DateTimeZone.forID("Australia/NSW")); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23801);Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23802);DateTime australiaNSWStandardInUTC = new DateTime(2008, 4, 5, 16, 0, 0, 0, chronUTC); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23803);DateTime australiaNSWDaylightInUTC = new DateTime(2008, 4, 5, 15, 0, 0, 0, chronUTC); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23804);assertTrue("Should be standard time", chronAusNSW.getZone().isStandardOffset(australiaNSWStandardInUTC.getMillis())); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23805);assertFalse("Should be daylight time", chronAusNSW.getZone().isStandardOffset(australiaNSWDaylightInUTC.getMillis())); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23806);DateTime australiaNSWStandardInAustraliaNSW = australiaNSWStandardInUTC.toDateTime(chronAusNSW); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23807);DateTime australiaNSWDaylightInAusraliaNSW = australiaNSWDaylightInUTC.toDateTime(chronAusNSW); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23808);assertEquals(2, australiaNSWStandardInAustraliaNSW.getHourOfDay()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23809);assertEquals(australiaNSWStandardInAustraliaNSW.getHourOfDay(), australiaNSWDaylightInAusraliaNSW.getHourOfDay()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23810);assertTrue(australiaNSWStandardInAustraliaNSW.getMillis() != australiaNSWDaylightInAusraliaNSW.getMillis()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23811);assertEquals(australiaNSWStandardInAustraliaNSW, australiaNSWStandardInAustraliaNSW.withHourOfDay(2)); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23812);assertEquals(australiaNSWStandardInAustraliaNSW.getMillis() + 3, australiaNSWStandardInAustraliaNSW.withMillisOfSecond(3).getMillis()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23813);assertEquals(australiaNSWDaylightInAusraliaNSW, australiaNSWDaylightInAusraliaNSW.withHourOfDay(2)); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23814);assertEquals(australiaNSWDaylightInAusraliaNSW.getMillis() + 3, australiaNSWDaylightInAusraliaNSW.withMillisOfSecond(3).getMillis()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void testPlusMillisInDstChange533() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlpg6aidj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusMillisInDstChange533",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlpg6aidj(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23815); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23816);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23817);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23818);DateTime test = dateTime.plusMillis(1); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23819);assertEquals("2010-10-31T02:30:10.124+02:00", test.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void testPlusSecondsInDstChange583() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177l2hyido();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusSecondsInDstChange583",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177l2hyido(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23820); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23821);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23822);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23823);DateTime test = dateTime.plusSeconds(1); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23824);assertEquals("2010-10-31T02:30:11.123+02:00", test.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void testWithMillisOfSecondInDstChange_NewYork_summer628() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_134icdwidt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMillisOfSecondInDstChange_NewYork_summer628",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_134icdwidt(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23825); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23826);DateTime dateTime = new DateTime("2007-11-04T01:30:00.123-04:00", ZONE_NEW_YORK); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23827);assertEquals("2007-11-04T01:30:00.123-04:00", dateTime.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23828);DateTime test = dateTime.withMillisOfSecond(0); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23829);assertEquals("2007-11-04T01:30:00.000-04:00", test.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_DateTime_roundCeiling_day_NewYork_Spring_postCutover674() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iiboyeidy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Spring_postCutover674",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iiboyeidy(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23830); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23831);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23832);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23833);DateTime rounded = dt.dayOfMonth().roundCeilingCopy(); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23834);assertEquals("2007-03-12T00:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void testBug3192457_adjustOffset692() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oop5amie3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3192457_adjustOffset692",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oop5amie3(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23835); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23836);final DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23837);DateTime base = new DateTime(2007, 10, 28, 3, 15, zone); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23838);DateTime baseBefore = base.minusHours(2); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23839);DateTime baseAfter = base.minusHours(1); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23840);assertSame(base, base.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23841);assertSame(base, base.withLaterOffsetAtOverlap()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23842);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23843);assertEquals(baseAfter, baseBefore.withLaterOffsetAtOverlap()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23844);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23845);assertEquals(baseBefore, baseAfter.withEarlierOffsetAtOverlap()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_DateTime_parse_Turk832() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynuqrjiee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Turk832",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynuqrjiee(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23846); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23847);try { 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23848);new DateTime("2007-04-01T00:00", MOCK_TURK); 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23849);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23850);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0); 
     } 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_DateTime_setHourForward_Moscow_Spring911() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kbzmmviej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_Moscow_Spring911",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kbzmmviej(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23851); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23852);DateTime dt = new DateTime(2007, 3, 25, 0, 0, 0, 0, ZONE_MOSCOW); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23853);assertEquals("2007-03-25T00:00:00.000+03:00", dt.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23854);try { 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23855);dt.hourOfDay().setCopy(2); 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23856);fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_DateTime_plusDayMidGap_Turk1003() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ya7v2hiep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusDayMidGap_Turk1003",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ya7v2hiep(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23857); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23858);DateTime dt = new DateTime(2007, 3, 31, 0, 30, 0, 0, MOCK_TURK); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23859);assertEquals("2007-03-31T00:30:00.000-05:00", dt.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23860);DateTime plus1 = dt.plusDays(1); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23861);assertEquals("2007-04-01T01:30:00.000-04:00", plus1.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23862);DateTime plus2 = dt.plusDays(2); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23863);assertEquals("2007-04-02T00:30:00.000-04:00", plus2.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_DateTime_setHourAcross_NewYork_Spring1043() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19j1s4ziew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourAcross_NewYork_Spring1043",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19j1s4ziew(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23864); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23865);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23866);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23867);DateTime res = dt.hourOfDay().setCopy(4); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23868);assertEquals("2007-03-11T04:00:00.000-04:00", res.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_DateTime_parse_Gaza1140() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzr9g9if1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Gaza1140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzr9g9if1(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23869); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23870);try { 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23871);new DateTime("2007-04-01T00:00", MOCK_GAZA); 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23872);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23873);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0); 
     } 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_LocalDate_toDateMidnight_Gaza1169() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yleseif6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_toDateMidnight_Gaza1169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yleseif6(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23874); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23875);LocalDate date = new LocalDate(2007, 4, 1); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23876);try { 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23877);date.toDateMidnight(MOCK_GAZA); 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23878);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23879);assertEquals(true, ex.getMessage().startsWith("Illegal instant due to time zone offset transition")); 
     } 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover1370() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lkfb8rifc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover1370",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lkfb8rifc(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23880); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23881);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23882);assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23883);DateTime rounded = dt.hourOfDay().roundCeilingCopy(); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23884);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_LocalDate_new_Turk1442() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vhcxkcifh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_new_Turk1442",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vhcxkcifh(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23885); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23886);LocalDate date1 = new LocalDate(CUTOVER_TURK, MOCK_TURK); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23887);assertEquals("2007-04-01", date1.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23888);LocalDate date2 = new LocalDate(CUTOVER_TURK - 1, MOCK_TURK); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23889);assertEquals("2007-03-31", date2.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_DateTime_setHourForward_NewYork_Spring1482() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131tbg6ifm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_NewYork_Spring1482",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131tbg6ifm(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23890); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23891);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23892);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23893);try { 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23894);dt.hourOfDay().setCopy(2); 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23895);fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void test_getOffsetFromLocal_Moscow_Autumn_overlap_mins1589() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7vmwzifs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Moscow_Autumn_overlap_mins1589",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7vmwzifs(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23896); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23897);for (int min = 0; (((min < 60)&&(__CLR4_4_1iaxiaxlc8axdq7.R.iget(23898)!=0|true))||(__CLR4_4_1iaxiaxlc8axdq7.R.iget(23899)==0&false)); min++) {{ 
         __CLR4_4_1iaxiaxlc8axdq7.R.inc(23900);if ((((min < 10)&&(__CLR4_4_1iaxiaxlc8axdq7.R.iget(23901)!=0|true))||(__CLR4_4_1iaxiaxlc8axdq7.R.iget(23902)==0&false))) {{ 
             __CLR4_4_1iaxiaxlc8axdq7.R.inc(23903);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:0" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } }else {{ 
             __CLR4_4_1iaxiaxlc8axdq7.R.inc(23904);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } 
     }} 
 }}finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 


public void testPeriod1718() {__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceStart(getClass().getName(),23905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2iwsnig1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iaxiaxlc8axdq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iaxiaxlc8axdq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPeriod1718",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2iwsnig1(){try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23905); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23906);DateTime a = new DateTime("2010-10-31T02:00:00.000+02:00", ZONE_PARIS); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23907);DateTime b = new DateTime("2010-10-31T02:01:00.000+02:00", ZONE_PARIS); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23908);Period period = new Period(a, b, PeriodType.standard()); 
     __CLR4_4_1iaxiaxlc8axdq7.R.inc(23909);assertEquals("PT1M", period.toString()); 
 }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}} 

    

    

    private void doTest_getOffsetFromLocal_Gaza(int days, int hour, int min, String expected) {try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23910);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23911);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23912);int offset = MOCK_GAZA.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23913);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_GAZA);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23914);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    

    

    private void doTest_getOffsetFromLocal_Turk(int days, int hour, int min, String expected) {try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23915);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23916);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23917);int offset = MOCK_TURK.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23918);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_TURK);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23919);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    /** America/New_York cutover from 01:59 to 03:00 on 2007-03-11 */
    private static long CUTOVER_NEW_YORK_SPRING = 1173596400000L;  // 2007-03-11T03:00:00.000-04:00
    private static final DateTimeZone ZONE_NEW_YORK = DateTimeZone.forID("America/New_York");
//  DateTime x = new DateTime(2007, 1, 1, 0, 0, 0, 0, ZONE_NEW_YORK);
//  System.out.println(ZONE_NEW_YORK.nextTransition(x.getMillis()));
//  DateTime y = new DateTime(ZONE_NEW_YORK.nextTransition(x.getMillis()), ZONE_NEW_YORK);
//  System.out.println(y);

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    /** America/New_York cutover from 01:59 to 01:00 on 2007-11-04 */
    private static long CUTOVER_NEW_YORK_AUTUMN = 1194156000000L;  // 2007-11-04T01:00:00.000-05:00

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    /** Europe/Moscow cutover from 01:59 to 03:00 on 2007-03-25 */
    private static long CUTOVER_MOSCOW_SPRING = 1174777200000L;  // 2007-03-25T03:00:00.000+04:00
    private static final DateTimeZone ZONE_MOSCOW = DateTimeZone.forID("Europe/Moscow");

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    /** America/New_York cutover from 02:59 to 02:00 on 2007-10-28 */
    private static long CUTOVER_MOSCOW_AUTUMN = 1193526000000L;  // 2007-10-28T02:00:00.000+03:00

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    /** America/Guatemala cutover from 23:59 to 23:00 on 2006-09-30 */
    private static long CUTOVER_GUATEMALA_AUTUMN = 1159678800000L; // 2006-09-30T23:00:00.000-06:00
    private static final DateTimeZone ZONE_GUATEMALA = DateTimeZone.forID("America/Guatemala");

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------

    

//    public void test_toDateMidnight_SaoPaolo() {
//        // RFE: 1684259
//        DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo");
//        LocalDate baseDate = new LocalDate(2006, 11, 5);
//        DateMidnight dm = baseDate.toDateMidnight(zone);
//        assertEquals("2006-11-05T00:00:00.000-03:00", dm.toString());
//        DateTime dt = baseDate.toDateTimeAtMidnight(zone);
//        assertEquals("2006-11-05T00:00:00.000-03:00", dt.toString());
//    }

    //-----------------------------------------------------------------------
    private static final DateTimeZone ZONE_PARIS = DateTimeZone.forID("Europe/Paris");

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    // ensure Summer time picked
    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23920);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23921);doTest_getOffsetFromLocal(2007, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23922);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23923);doTest_getOffsetFromLocal(2007, month, day, hour, min, sec, milli, expected, zone);
    }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23924);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23925);doTest_getOffsetFromLocal(year, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1iaxiaxlc8axdq7.R.inc(23926);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23927);DateTime dt = new DateTime(year, month, day, hour, min, sec, milli, DateTimeZone.UTC);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23928);int offset = zone.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23929);DateTime res = new DateTime(dt.getMillis() - offset, zone);
        __CLR4_4_1iaxiaxlc8axdq7.R.inc(23930);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1iaxiaxlc8axdq7.R.flushNeeded();}}

}
