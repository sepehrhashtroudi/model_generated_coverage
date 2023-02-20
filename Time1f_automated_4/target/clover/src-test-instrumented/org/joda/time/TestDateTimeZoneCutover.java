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
public class TestDateTimeZoneCutover extends TestCase {static class __CLR4_4_1h8bh8ble6o79mx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,22396,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22331);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22332);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22333);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22334);return new TestSuite(TestDateTimeZoneCutover.class);
    }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}

    public TestDateTimeZoneCutover(String name) {
        super(name);__CLR4_4_1h8bh8ble6o79mx.R.inc(22336);try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22335);
    }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22337);
    }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22338);
    }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}

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
public void test_DateTime_roundCeiling_day_NewYork_Spring_postCutover245() {__CLR4_4_1h8bh8ble6o79mx.R.globalSliceStart(getClass().getName(),22339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oudmd2h8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h8bh8ble6o79mx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h8bh8ble6o79mx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Spring_postCutover245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oudmd2h8j(){try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22339); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22340);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22341);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString()); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22342);DateTime rounded = dt.dayOfMonth().roundCeilingCopy(); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22343);assertEquals("2007-03-12T00:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}
public void testPropertyRoundHalfFloorHourOfDay246() {__CLR4_4_1h8bh8ble6o79mx.R.globalSliceStart(getClass().getName(),22344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewofcch8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h8bh8ble6o79mx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h8bh8ble6o79mx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPropertyRoundHalfFloorHourOfDay246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewofcch8o(){try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22344); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22345);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22346);DateTime copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22347);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22348);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22349);copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22350);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22351);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22352);copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22353);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}
public void test_DateTime_roundFloor_hour_NewYork_Spring_postCutover309() {__CLR4_4_1h8bh8ble6o79mx.R.globalSliceStart(getClass().getName(),22354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14936mah8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h8bh8ble6o79mx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h8bh8ble6o79mx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hour_NewYork_Spring_postCutover309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14936mah8y(){try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22354); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22355);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22356);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString()); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22357);DateTime rounded = dt.hourOfDay().roundFloorCopy(); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22358);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}
public void testWithMinuteOfHourInDstChange_mockZone310() {__CLR4_4_1h8bh8ble6o79mx.R.globalSliceStart(getClass().getName(),22359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wmdkfnh93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h8bh8ble6o79mx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h8bh8ble6o79mx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMinuteOfHourInDstChange_mockZone310",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wmdkfnh93(){try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22359); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22360);DateTime cutover = new DateTime(2010, 10, 31, 1, 15, DateTimeZone.forOffsetHoursMinutes(0, 30)); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22361);assertEquals("2010-10-31T01:15:00.000+00:30", cutover.toString()); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22362);DateTimeZone halfHourZone = new MockZone(cutover.getMillis(), 3600000, -1800); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22363);DateTime pre = new DateTime(2010, 10, 31, 1, 0, halfHourZone); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22364);assertEquals("2010-10-31T01:00:00.000+01:00", pre.toString()); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22365);DateTime post = new DateTime(2010, 10, 31, 1, 59, halfHourZone); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22366);assertEquals("2010-10-31T01:59:00.000+00:30", post.toString()); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22367);DateTime testPre1 = pre.withMinuteOfHour(30); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22368);assertEquals("2010-10-31T01:30:00.000+01:00", testPre1.toString()); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22369);DateTime testPre2 = pre.withMinuteOfHour(50); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22370);assertEquals("2010-10-31T01:50:00.000+00:30", testPre2.toString()); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22371);DateTime testPost1 = post.withMinuteOfHour(30); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22372);assertEquals("2010-10-31T01:30:00.000+00:30", testPost1.toString()); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22373);DateTime testPost2 = post.withMinuteOfHour(10); 
     __CLR4_4_1h8bh8ble6o79mx.R.inc(22374);assertEquals("2010-10-31T01:10:00.000+01:00", testPost2.toString()); 
 }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}
    

    

    private void doTest_getOffsetFromLocal_Gaza(int days, int hour, int min, String expected) {try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22375);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22376);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22377);int offset = MOCK_GAZA.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22378);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_GAZA);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22379);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    

    

    private void doTest_getOffsetFromLocal_Turk(int days, int hour, int min, String expected) {try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22380);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22381);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22382);int offset = MOCK_TURK.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22383);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_TURK);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22384);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

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
    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22385);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22386);doTest_getOffsetFromLocal(2007, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22387);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22388);doTest_getOffsetFromLocal(2007, month, day, hour, min, sec, milli, expected, zone);
    }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22389);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22390);doTest_getOffsetFromLocal(year, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1h8bh8ble6o79mx.R.inc(22391);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22392);DateTime dt = new DateTime(year, month, day, hour, min, sec, milli, DateTimeZone.UTC);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22393);int offset = zone.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22394);DateTime res = new DateTime(dt.getMillis() - offset, zone);
        __CLR4_4_1h8bh8ble6o79mx.R.inc(22395);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1h8bh8ble6o79mx.R.flushNeeded();}}

}
