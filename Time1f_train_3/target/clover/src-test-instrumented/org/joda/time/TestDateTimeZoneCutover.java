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
public class TestDateTimeZoneCutover extends TestCase {static class __CLR4_4_1i4fi4fle6rckll{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,23665,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1i4fi4fle6rckll.R.inc(23487);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23488);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i4fi4fle6rckll.R.inc(23489);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23490);return new TestSuite(TestDateTimeZoneCutover.class);
    }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}}

    public TestDateTimeZoneCutover(String name) {
        super(name);__CLR4_4_1i4fi4fle6rckll.R.inc(23492);try{__CLR4_4_1i4fi4fle6rckll.R.inc(23491);
    }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i4fi4fle6rckll.R.inc(23493);
    }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i4fi4fle6rckll.R.inc(23494);
    }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}}

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

public void testBug2182444_usCentral196() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ioiyki4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug2182444_usCentral196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ioiyki4n(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23495); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23496);Chronology chronUSCentral = GregorianChronology.getInstance(DateTimeZone.forID("US/Central")); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23497);Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23498);DateTime usCentralStandardInUTC = new DateTime(2008, 11, 2, 7, 0, 0, 0, chronUTC); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23499);DateTime usCentralDaylightInUTC = new DateTime(2008, 11, 2, 6, 0, 0, 0, chronUTC); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23500);assertTrue("Should be standard time", chronUSCentral.getZone().isStandardOffset(usCentralStandardInUTC.getMillis())); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23501);assertFalse("Should be daylight time", chronUSCentral.getZone().isStandardOffset(usCentralDaylightInUTC.getMillis())); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23502);DateTime usCentralStandardInUSCentral = usCentralStandardInUTC.toDateTime(chronUSCentral); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23503);DateTime usCentralDaylightInUSCentral = usCentralDaylightInUTC.toDateTime(chronUSCentral); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23504);assertEquals(1, usCentralStandardInUSCentral.getHourOfDay()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23505);assertEquals(usCentralStandardInUSCentral.getHourOfDay(), usCentralDaylightInUSCentral.getHourOfDay()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23506);assertTrue(usCentralStandardInUSCentral.getMillis() != usCentralDaylightInUSCentral.getMillis()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23507);assertEquals(usCentralStandardInUSCentral, usCentralStandardInUSCentral.withHourOfDay(1)); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23508);assertEquals(usCentralStandardInUSCentral.getMillis() + 3, usCentralStandardInUSCentral.withMillisOfSecond(3).getMillis()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23509);assertEquals(usCentralDaylightInUSCentral, usCentralDaylightInUSCentral.withHourOfDay(1)); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23510);assertEquals(usCentralDaylightInUSCentral.getMillis() + 3, usCentralDaylightInUSCentral.withMillisOfSecond(3).getMillis()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_DateTime_JustAfterLastEverOverlap268() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d64nq9i53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_JustAfterLastEverOverlap268",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d64nq9i53(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23511); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23512);DateTimeZone zone = new DateTimeZoneBuilder().setStandardOffset(-3 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("SUMMER", 1 * DateTimeConstants.MILLIS_PER_HOUR, 2000, 2008, 'w', 4, 10, 0, true, 23 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("WINTER", 0, 2000, 2008, 'w', 8, 10, 0, true, 0 * DateTimeConstants.MILLIS_PER_HOUR).toDateTimeZone("Zone", false); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23513);LocalDate date = new LocalDate(2008, 8, 10); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23514);assertEquals("2008-08-10", date.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23515);DateTime dt = date.toDateTimeAtStartOfDay(zone); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23516);assertEquals("2008-08-10T00:00:00.000-03:00", dt.toString()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void testBug3476684_adjustOffset_springGap274() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jk9u85i59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3476684_adjustOffset_springGap274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jk9u85i59(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23517); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23518);final DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo"); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23519);DateTime base = new DateTime(2011, 10, 15, 22, 15, zone); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23520);DateTime baseBefore = base.plusHours(1); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23521);DateTime baseAfter = base.plusHours(2); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23522);assertSame(base, base.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23523);assertSame(base, base.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23524);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23525);assertEquals(baseBefore, baseBefore.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23526);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23527);assertEquals(baseAfter, baseAfter.withEarlierOffsetAtOverlap()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_DateTime_roundFloor_hour_NewYork_Spring_postCutover277() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dok9gsi5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hour_NewYork_Spring_postCutover277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dok9gsi5k(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23528); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23529);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23530);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23531);DateTime rounded = dt.hourOfDay().roundFloorCopy(); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23532);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_getOffsetFromLocal_Moscow_Autumn_overlap_mins278() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrymvxi5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Moscow_Autumn_overlap_mins278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrymvxi5p(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23533); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23534);for (int min = 0; (((min < 60)&&(__CLR4_4_1i4fi4fle6rckll.R.iget(23535)!=0|true))||(__CLR4_4_1i4fi4fle6rckll.R.iget(23536)==0&false)); min++) {{ 
         __CLR4_4_1i4fi4fle6rckll.R.inc(23537);if ((((min < 10)&&(__CLR4_4_1i4fi4fle6rckll.R.iget(23538)!=0|true))||(__CLR4_4_1i4fi4fle6rckll.R.iget(23539)==0&false))) {{ 
             __CLR4_4_1i4fi4fle6rckll.R.inc(23540);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:0" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } }else {{ 
             __CLR4_4_1i4fi4fle6rckll.R.inc(23541);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } 
     }} 
 }}finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_DateTime_plusDayMidGap_Turk595() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ks89d4i5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusDayMidGap_Turk595",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ks89d4i5y(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23542); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23543);DateTime dt = new DateTime(2007, 3, 31, 0, 30, 0, 0, MOCK_TURK); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23544);assertEquals("2007-03-31T00:30:00.000-05:00", dt.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23545);DateTime plus1 = dt.plusDays(1); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23546);assertEquals("2007-04-01T01:30:00.000-04:00", plus1.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23547);DateTime plus2 = dt.plusDays(2); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23548);assertEquals("2007-04-02T00:30:00.000-04:00", plus2.toString()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void testPlusSecondsInDstChange597() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi9p7hi65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusSecondsInDstChange597",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi9p7hi65(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23549); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23550);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23551);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23552);DateTime test = dateTime.plusSeconds(1); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23553);assertEquals("2010-10-31T02:30:11.123+02:00", test.toString()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_DateTime_minusHour_NewYork_Autumn603() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_194myagi6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_NewYork_Autumn603",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_194myagi6a(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23554); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23555);DateTime dt = new DateTime(2007, 11, 4, 8, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23556);assertEquals("2007-11-04T08:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23557);DateTime minus6 = dt.minusHours(6); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23558);assertEquals("2007-11-04T02:00:00.000-05:00", minus6.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23559);DateTime minus7 = dt.minusHours(7); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23560);assertEquals("2007-11-04T01:00:00.000-05:00", minus7.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23561);DateTime minus8 = dt.minusHours(8); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23562);assertEquals("2007-11-04T01:00:00.000-04:00", minus8.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23563);DateTime minus9 = dt.minusHours(9); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23564);assertEquals("2007-11-04T00:00:00.000-04:00", minus9.toString()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_DateTime_withDay_Turk614() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi9gh2i6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withDay_Turk614",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi9gh2i6l(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23565); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23566);DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_TURK); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23567);assertEquals("2007-04-02T00:00:00.000-04:00", dt.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23568);DateTime res = dt.withDayOfMonth(1); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23569);assertEquals("2007-04-01T01:00:00.000-04:00", res.toString()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void testWithMinuteOfHourInDstChange_mockZone615() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrxt2ji6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMinuteOfHourInDstChange_mockZone615",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrxt2ji6q(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23570); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23571);DateTime cutover = new DateTime(2010, 10, 31, 1, 15, DateTimeZone.forOffsetHoursMinutes(0, 30)); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23572);assertEquals("2010-10-31T01:15:00.000+00:30", cutover.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23573);DateTimeZone halfHourZone = new MockZone(cutover.getMillis(), 3600000, -1800); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23574);DateTime pre = new DateTime(2010, 10, 31, 1, 0, halfHourZone); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23575);assertEquals("2010-10-31T01:00:00.000+01:00", pre.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23576);DateTime post = new DateTime(2010, 10, 31, 1, 59, halfHourZone); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23577);assertEquals("2010-10-31T01:59:00.000+00:30", post.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23578);DateTime testPre1 = pre.withMinuteOfHour(30); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23579);assertEquals("2010-10-31T01:30:00.000+01:00", testPre1.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23580);DateTime testPre2 = pre.withMinuteOfHour(50); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23581);assertEquals("2010-10-31T01:50:00.000+00:30", testPre2.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23582);DateTime testPost1 = post.withMinuteOfHour(30); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23583);assertEquals("2010-10-31T01:30:00.000+00:30", testPost1.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23584);DateTime testPost2 = post.withMinuteOfHour(10); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23585);assertEquals("2010-10-31T01:10:00.000+01:00", testPost2.toString()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover631() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wu9vsi76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover631",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wu9vsi76(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23586); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23587);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23588);assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23589);DateTime rounded = dt.hourOfDay().roundCeilingCopy(); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23590);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_LocalDate_toDateMidnight_Gaza712() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e0jb3pi7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_toDateMidnight_Gaza712",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e0jb3pi7b(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23591); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23592);LocalDate date = new LocalDate(2007, 4, 1); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23593);try { 
         __CLR4_4_1i4fi4fle6rckll.R.inc(23594);date.toDateMidnight(MOCK_GAZA); 
         __CLR4_4_1i4fi4fle6rckll.R.inc(23595);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1i4fi4fle6rckll.R.inc(23596);assertEquals(true, ex.getMessage().startsWith("Illegal instant due to time zone offset transition")); 
     } 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void testPeriod810() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qghz63i7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPeriod810",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qghz63i7h(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23597); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23598);DateTime a = new DateTime("2010-10-31T02:00:00.000+02:00", ZONE_PARIS); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23599);DateTime b = new DateTime("2010-10-31T02:01:00.000+02:00", ZONE_PARIS); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23600);Period period = new Period(a, b, PeriodType.standard()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23601);assertEquals("PT1M", period.toString()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_DateTime_setHourAcross_NewYork_Spring811() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hlf2j5i7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourAcross_NewYork_Spring811",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hlf2j5i7m(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23602); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23603);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23604);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23605);DateTime res = dt.hourOfDay().setCopy(4); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23606);assertEquals("2007-03-11T04:00:00.000-04:00", res.toString()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_DateTime_setHourForward_NewYork_Spring812() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csvtomi7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_NewYork_Spring812",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csvtomi7r(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23607); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23608);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23609);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23610);try { 
         __CLR4_4_1i4fi4fle6rckll.R.inc(23611);dt.hourOfDay().setCopy(2); 
         __CLR4_4_1i4fi4fle6rckll.R.inc(23612);fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void testBug3192457_adjustOffset814() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nx6e4ei7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3192457_adjustOffset814",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nx6e4ei7x(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23613); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23614);final DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23615);DateTime base = new DateTime(2007, 10, 28, 3, 15, zone); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23616);DateTime baseBefore = base.minusHours(2); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23617);DateTime baseAfter = base.minusHours(1); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23618);assertSame(base, base.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23619);assertSame(base, base.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23620);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23621);assertEquals(baseAfter, baseBefore.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23622);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23623);assertEquals(baseBefore, baseAfter.withEarlierOffsetAtOverlap()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_DateTime_parse_Turk815() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbgli2i88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Turk815",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbgli2i88(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23624); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23625);try { 
         __CLR4_4_1i4fi4fle6rckll.R.inc(23626);new DateTime("2007-04-01T00:00", MOCK_TURK); 
         __CLR4_4_1i4fi4fle6rckll.R.inc(23627);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1i4fi4fle6rckll.R.inc(23628);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0); 
     } 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_DateTime_roundCeiling_day_NewYork_Spring_postCutover938() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9wledi8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Spring_postCutover938",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9wledi8d(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23629); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23630);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23631);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23632);DateTime rounded = dt.dayOfMonth().roundCeilingCopy(); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23633);assertEquals("2007-03-12T00:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_DateTime_parse_Gaza940() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wipmy0i8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Gaza940",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wipmy0i8i(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23634); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23635);try { 
         __CLR4_4_1i4fi4fle6rckll.R.inc(23636);new DateTime("2007-04-01T00:00", MOCK_GAZA); 
         __CLR4_4_1i4fi4fle6rckll.R.inc(23637);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1i4fi4fle6rckll.R.inc(23638);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0); 
     } 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 


public void test_MutableDateTime_withZoneRetainFields_Gaza1007() {__CLR4_4_1i4fi4fle6rckll.R.globalSliceStart(getClass().getName(),23639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13j5amqi8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4fi4fle6rckll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4fi4fle6rckll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MutableDateTime_withZoneRetainFields_Gaza1007",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13j5amqi8n(){try{__CLR4_4_1i4fi4fle6rckll.R.inc(23639); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23640);MutableDateTime dt = new MutableDateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23641);assertEquals("2007-04-01T00:00:00.000Z", dt.toString()); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23642);dt.setZoneRetainFields(MOCK_GAZA); 
     __CLR4_4_1i4fi4fle6rckll.R.inc(23643);assertEquals("2007-04-01T01:00:00.000+03:00", dt.toString()); 
 }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}} 

    

    

    private void doTest_getOffsetFromLocal_Gaza(int days, int hour, int min, String expected) {try{__CLR4_4_1i4fi4fle6rckll.R.inc(23644);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23645);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23646);int offset = MOCK_GAZA.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1i4fi4fle6rckll.R.inc(23647);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_GAZA);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23648);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    

    

    private void doTest_getOffsetFromLocal_Turk(int days, int hour, int min, String expected) {try{__CLR4_4_1i4fi4fle6rckll.R.inc(23649);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23650);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23651);int offset = MOCK_TURK.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1i4fi4fle6rckll.R.inc(23652);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_TURK);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23653);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

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
    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1i4fi4fle6rckll.R.inc(23654);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23655);doTest_getOffsetFromLocal(2007, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1i4fi4fle6rckll.R.inc(23656);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23657);doTest_getOffsetFromLocal(2007, month, day, hour, min, sec, milli, expected, zone);
    }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1i4fi4fle6rckll.R.inc(23658);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23659);doTest_getOffsetFromLocal(year, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1i4fi4fle6rckll.R.inc(23660);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23661);DateTime dt = new DateTime(year, month, day, hour, min, sec, milli, DateTimeZone.UTC);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23662);int offset = zone.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1i4fi4fle6rckll.R.inc(23663);DateTime res = new DateTime(dt.getMillis() - offset, zone);
        __CLR4_4_1i4fi4fle6rckll.R.inc(23664);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1i4fi4fle6rckll.R.flushNeeded();}}

}
