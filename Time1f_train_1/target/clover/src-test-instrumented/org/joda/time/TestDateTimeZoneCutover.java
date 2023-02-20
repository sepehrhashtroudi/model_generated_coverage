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
public class TestDateTimeZoneCutover extends TestCase {static class __CLR4_4_1i28i28le6qe9az{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,23597,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1i28i28le6qe9az.R.inc(23408);
        __CLR4_4_1i28i28le6qe9az.R.inc(23409);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i28i28le6qe9az.R.inc(23410);
        __CLR4_4_1i28i28le6qe9az.R.inc(23411);return new TestSuite(TestDateTimeZoneCutover.class);
    }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}}

    public TestDateTimeZoneCutover(String name) {
        super(name);__CLR4_4_1i28i28le6qe9az.R.inc(23413);try{__CLR4_4_1i28i28le6qe9az.R.inc(23412);
    }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i28i28le6qe9az.R.inc(23414);
    }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i28i28le6qe9az.R.inc(23415);
    }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}}

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

public void testBug2182444_usCentral195() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rohr1i2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug2182444_usCentral195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rohr1i2g(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23416); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23417);Chronology chronUSCentral = GregorianChronology.getInstance(DateTimeZone.forID("US/Central")); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23418);Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23419);DateTime usCentralStandardInUTC = new DateTime(2008, 11, 2, 7, 0, 0, 0, chronUTC); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23420);DateTime usCentralDaylightInUTC = new DateTime(2008, 11, 2, 6, 0, 0, 0, chronUTC); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23421);assertTrue("Should be standard time", chronUSCentral.getZone().isStandardOffset(usCentralStandardInUTC.getMillis())); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23422);assertFalse("Should be daylight time", chronUSCentral.getZone().isStandardOffset(usCentralDaylightInUTC.getMillis())); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23423);DateTime usCentralStandardInUSCentral = usCentralStandardInUTC.toDateTime(chronUSCentral); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23424);DateTime usCentralDaylightInUSCentral = usCentralDaylightInUTC.toDateTime(chronUSCentral); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23425);assertEquals(1, usCentralStandardInUSCentral.getHourOfDay()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23426);assertEquals(usCentralStandardInUSCentral.getHourOfDay(), usCentralDaylightInUSCentral.getHourOfDay()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23427);assertTrue(usCentralStandardInUSCentral.getMillis() != usCentralDaylightInUSCentral.getMillis()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23428);assertEquals(usCentralStandardInUSCentral, usCentralStandardInUSCentral.withHourOfDay(1)); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23429);assertEquals(usCentralStandardInUSCentral.getMillis() + 3, usCentralStandardInUSCentral.withMillisOfSecond(3).getMillis()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23430);assertEquals(usCentralDaylightInUSCentral, usCentralDaylightInUSCentral.withHourOfDay(1)); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23431);assertEquals(usCentralDaylightInUSCentral.getMillis() + 3, usCentralDaylightInUSCentral.withMillisOfSecond(3).getMillis()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_DateTime_JustAfterLastEverOverlap261() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19kv3t2i2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_JustAfterLastEverOverlap261",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19kv3t2i2w(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23432); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23433);DateTimeZone zone = new DateTimeZoneBuilder().setStandardOffset(-3 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("SUMMER", 1 * DateTimeConstants.MILLIS_PER_HOUR, 2000, 2008, 'w', 4, 10, 0, true, 23 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("WINTER", 0, 2000, 2008, 'w', 8, 10, 0, true, 0 * DateTimeConstants.MILLIS_PER_HOUR).toDateTimeZone("Zone", false); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23434);LocalDate date = new LocalDate(2008, 8, 10); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23435);assertEquals("2008-08-10", date.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23436);DateTime dt = date.toDateTimeAtStartOfDay(zone); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23437);assertEquals("2008-08-10T00:00:00.000-03:00", dt.toString()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void testBug3476684_adjustOffset_springGap264() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqzb7gi32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3476684_adjustOffset_springGap264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqzb7gi32(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23438); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23439);final DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo"); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23440);DateTime base = new DateTime(2011, 10, 15, 22, 15, zone); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23441);DateTime baseBefore = base.plusHours(1); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23442);DateTime baseAfter = base.plusHours(2); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23443);assertSame(base, base.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23444);assertSame(base, base.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23445);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23446);assertEquals(baseBefore, baseBefore.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23447);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23448);assertEquals(baseAfter, baseAfter.withEarlierOffsetAtOverlap()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_DateTime_roundFloor_hour_NewYork_Spring_postCutover266() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odox6ci3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hour_NewYork_Spring_postCutover266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odox6ci3d(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23449); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23450);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23451);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23452);DateTime rounded = dt.hourOfDay().roundFloorCopy(); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23453);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_getOffsetFromLocal_Moscow_Autumn_overlap_mins267() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1baajr7i3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Moscow_Autumn_overlap_mins267",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1baajr7i3i(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23454); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23455);for (int min = 0; (((min < 60)&&(__CLR4_4_1i28i28le6qe9az.R.iget(23456)!=0|true))||(__CLR4_4_1i28i28le6qe9az.R.iget(23457)==0&false)); min++) {{ 
         __CLR4_4_1i28i28le6qe9az.R.inc(23458);if ((((min < 10)&&(__CLR4_4_1i28i28le6qe9az.R.iget(23459)!=0|true))||(__CLR4_4_1i28i28le6qe9az.R.iget(23460)==0&false))) {{ 
             __CLR4_4_1i28i28le6qe9az.R.inc(23461);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:0" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } }else {{ 
             __CLR4_4_1i28i28le6qe9az.R.inc(23462);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } 
     }} 
 }}finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_DateTime_plusDayMidGap_Turk586() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ns0uuyi3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusDayMidGap_Turk586",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ns0uuyi3r(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23463); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23464);DateTime dt = new DateTime(2007, 3, 31, 0, 30, 0, 0, MOCK_TURK); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23465);assertEquals("2007-03-31T00:30:00.000-05:00", dt.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23466);DateTime plus1 = dt.plusDays(1); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23467);assertEquals("2007-04-01T01:30:00.000-04:00", plus1.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23468);DateTime plus2 = dt.plusDays(2); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23469);assertEquals("2007-04-02T00:30:00.000-04:00", plus2.toString()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void testPlusMillisInDstChange591() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11us2gai3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusMillisInDstChange591",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11us2gai3y(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23470); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23471);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23472);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23473);DateTime test = dateTime.plusMillis(1); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23474);assertEquals("2010-10-31T02:30:10.124+02:00", test.toString()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_DateTime_minusHour_NewYork_Autumn599() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3rcvoi43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_NewYork_Autumn599",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3rcvoi43(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23475); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23476);DateTime dt = new DateTime(2007, 11, 4, 8, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23477);assertEquals("2007-11-04T08:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23478);DateTime minus6 = dt.minusHours(6); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23479);assertEquals("2007-11-04T02:00:00.000-05:00", minus6.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23480);DateTime minus7 = dt.minusHours(7); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23481);assertEquals("2007-11-04T01:00:00.000-05:00", minus7.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23482);DateTime minus8 = dt.minusHours(8); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23483);assertEquals("2007-11-04T01:00:00.000-04:00", minus8.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23484);DateTime minus9 = dt.minusHours(9); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23485);assertEquals("2007-11-04T00:00:00.000-04:00", minus9.toString()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void testBug2182444_ausNSW607() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14idbxni4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug2182444_ausNSW607",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14idbxni4e(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23486); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23487);Chronology chronAusNSW = GregorianChronology.getInstance(DateTimeZone.forID("Australia/NSW")); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23488);Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23489);DateTime australiaNSWStandardInUTC = new DateTime(2008, 4, 5, 16, 0, 0, 0, chronUTC); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23490);DateTime australiaNSWDaylightInUTC = new DateTime(2008, 4, 5, 15, 0, 0, 0, chronUTC); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23491);assertTrue("Should be standard time", chronAusNSW.getZone().isStandardOffset(australiaNSWStandardInUTC.getMillis())); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23492);assertFalse("Should be daylight time", chronAusNSW.getZone().isStandardOffset(australiaNSWDaylightInUTC.getMillis())); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23493);DateTime australiaNSWStandardInAustraliaNSW = australiaNSWStandardInUTC.toDateTime(chronAusNSW); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23494);DateTime australiaNSWDaylightInAusraliaNSW = australiaNSWDaylightInUTC.toDateTime(chronAusNSW); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23495);assertEquals(2, australiaNSWStandardInAustraliaNSW.getHourOfDay()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23496);assertEquals(australiaNSWStandardInAustraliaNSW.getHourOfDay(), australiaNSWDaylightInAusraliaNSW.getHourOfDay()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23497);assertTrue(australiaNSWStandardInAustraliaNSW.getMillis() != australiaNSWDaylightInAusraliaNSW.getMillis()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23498);assertEquals(australiaNSWStandardInAustraliaNSW, australiaNSWStandardInAustraliaNSW.withHourOfDay(2)); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23499);assertEquals(australiaNSWStandardInAustraliaNSW.getMillis() + 3, australiaNSWStandardInAustraliaNSW.withMillisOfSecond(3).getMillis()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23500);assertEquals(australiaNSWDaylightInAusraliaNSW, australiaNSWDaylightInAusraliaNSW.withHourOfDay(2)); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23501);assertEquals(australiaNSWDaylightInAusraliaNSW.getMillis() + 3, australiaNSWDaylightInAusraliaNSW.withMillisOfSecond(3).getMillis()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void testWithMillisOfSecondInDstChange_NewYork_summer608() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18gvwi6i4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMillisOfSecondInDstChange_NewYork_summer608",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18gvwi6i4u(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23502); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23503);DateTime dateTime = new DateTime("2007-11-04T01:30:00.123-04:00", ZONE_NEW_YORK); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23504);assertEquals("2007-11-04T01:30:00.123-04:00", dateTime.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23505);DateTime test = dateTime.withMillisOfSecond(0); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23506);assertEquals("2007-11-04T01:30:00.000-04:00", test.toString()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover622() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jk0nvai4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover622",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jk0nvai4z(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23507); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23508);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23509);assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23510);DateTime rounded = dt.hourOfDay().roundCeilingCopy(); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23511);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_LocalDate_new_Turk709() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xedb97i54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_new_Turk709",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xedb97i54(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23512); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23513);LocalDate date1 = new LocalDate(CUTOVER_TURK, MOCK_TURK); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23514);assertEquals("2007-04-01", date1.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23515);LocalDate date2 = new LocalDate(CUTOVER_TURK - 1, MOCK_TURK); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23516);assertEquals("2007-03-31", date2.toString()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_LocalDate_toDateMidnight_Gaza711() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9j9w6i59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_toDateMidnight_Gaza711",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9j9w6i59(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23517); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23518);LocalDate date = new LocalDate(2007, 4, 1); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23519);try { 
         __CLR4_4_1i28i28le6qe9az.R.inc(23520);date.toDateMidnight(MOCK_GAZA); 
         __CLR4_4_1i28i28le6qe9az.R.inc(23521);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1i28i28le6qe9az.R.inc(23522);assertEquals(true, ex.getMessage().startsWith("Illegal instant due to time zone offset transition")); 
     } 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void testPeriod815() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sbm8uoi5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPeriod815",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sbm8uoi5f(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23523); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23524);DateTime a = new DateTime("2010-10-31T02:00:00.000+02:00", ZONE_PARIS); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23525);DateTime b = new DateTime("2010-10-31T02:01:00.000+02:00", ZONE_PARIS); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23526);Period period = new Period(a, b, PeriodType.standard()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23527);assertEquals("PT1M", period.toString()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_DateTime_setHourAcross_NewYork_Spring816() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuewhii5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourAcross_NewYork_Spring816",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuewhii5k(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23528); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23529);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23530);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23531);DateTime res = dt.hourOfDay().setCopy(4); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23532);assertEquals("2007-03-11T04:00:00.000-04:00", res.toString()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_DateTime_setHourForward_NewYork_Spring817() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13g409ri5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_NewYork_Spring817",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13g409ri5p(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23533); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23534);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23535);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23536);try { 
         __CLR4_4_1i28i28le6qe9az.R.inc(23537);dt.hourOfDay().setCopy(2); 
         __CLR4_4_1i28i28le6qe9az.R.inc(23538);fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void testBug3192457_adjustOffset818() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3xsoui5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3192457_adjustOffset818",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3xsoui5v(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23539); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23540);final DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23541);DateTime base = new DateTime(2007, 10, 28, 3, 15, zone); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23542);DateTime baseBefore = base.minusHours(2); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23543);DateTime baseAfter = base.minusHours(1); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23544);assertSame(base, base.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23545);assertSame(base, base.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23546);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23547);assertEquals(baseAfter, baseBefore.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23548);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23549);assertEquals(baseBefore, baseAfter.withEarlierOffsetAtOverlap()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_DateTime_parse_Turk820() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15eh34i66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Turk820",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15eh34i66(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23550); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23551);try { 
         __CLR4_4_1i28i28le6qe9az.R.inc(23552);new DateTime("2007-04-01T00:00", MOCK_TURK); 
         __CLR4_4_1i28i28le6qe9az.R.inc(23553);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1i28i28le6qe9az.R.inc(23554);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0); 
     } 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_DateTime_roundCeiling_day_NewYork_Spring_postCutover950() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qbhdthi6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Spring_postCutover950",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qbhdthi6b(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23555); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23556);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23557);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23558);DateTime rounded = dt.dayOfMonth().roundCeilingCopy(); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23559);assertEquals("2007-03-12T00:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_DateTime_parse_Gaza952() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13p576hi6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Gaza952",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13p576hi6g(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23560); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23561);try { 
         __CLR4_4_1i28i28le6qe9az.R.inc(23562);new DateTime("2007-04-01T00:00", MOCK_GAZA); 
         __CLR4_4_1i28i28le6qe9az.R.inc(23563);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1i28i28le6qe9az.R.inc(23564);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0); 
     } 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_DateTime_setHourForward_Moscow_Spring953() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n72fpi6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_Moscow_Spring953",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n72fpi6l(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23565); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23566);DateTime dt = new DateTime(2007, 3, 25, 0, 0, 0, 0, ZONE_MOSCOW); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23567);assertEquals("2007-03-25T00:00:00.000+03:00", dt.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23568);try { 
         __CLR4_4_1i28i28le6qe9az.R.inc(23569);dt.hourOfDay().setCopy(2); 
         __CLR4_4_1i28i28le6qe9az.R.inc(23570);fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 


public void test_MutableDateTime_withZoneRetainFields_Gaza1016() {__CLR4_4_1i28i28le6qe9az.R.globalSliceStart(getClass().getName(),23571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u008dsi6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i28i28le6qe9az.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i28i28le6qe9az.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MutableDateTime_withZoneRetainFields_Gaza1016",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u008dsi6r(){try{__CLR4_4_1i28i28le6qe9az.R.inc(23571); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23572);MutableDateTime dt = new MutableDateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23573);assertEquals("2007-04-01T00:00:00.000Z", dt.toString()); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23574);dt.setZoneRetainFields(MOCK_GAZA); 
     __CLR4_4_1i28i28le6qe9az.R.inc(23575);assertEquals("2007-04-01T01:00:00.000+03:00", dt.toString()); 
 }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}} 

    

    

    private void doTest_getOffsetFromLocal_Gaza(int days, int hour, int min, String expected) {try{__CLR4_4_1i28i28le6qe9az.R.inc(23576);
        __CLR4_4_1i28i28le6qe9az.R.inc(23577);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1i28i28le6qe9az.R.inc(23578);int offset = MOCK_GAZA.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1i28i28le6qe9az.R.inc(23579);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_GAZA);
        __CLR4_4_1i28i28le6qe9az.R.inc(23580);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    

    

    private void doTest_getOffsetFromLocal_Turk(int days, int hour, int min, String expected) {try{__CLR4_4_1i28i28le6qe9az.R.inc(23581);
        __CLR4_4_1i28i28le6qe9az.R.inc(23582);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1i28i28le6qe9az.R.inc(23583);int offset = MOCK_TURK.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1i28i28le6qe9az.R.inc(23584);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_TURK);
        __CLR4_4_1i28i28le6qe9az.R.inc(23585);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

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
    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1i28i28le6qe9az.R.inc(23586);
        __CLR4_4_1i28i28le6qe9az.R.inc(23587);doTest_getOffsetFromLocal(2007, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1i28i28le6qe9az.R.inc(23588);
        __CLR4_4_1i28i28le6qe9az.R.inc(23589);doTest_getOffsetFromLocal(2007, month, day, hour, min, sec, milli, expected, zone);
    }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1i28i28le6qe9az.R.inc(23590);
        __CLR4_4_1i28i28le6qe9az.R.inc(23591);doTest_getOffsetFromLocal(year, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1i28i28le6qe9az.R.inc(23592);
        __CLR4_4_1i28i28le6qe9az.R.inc(23593);DateTime dt = new DateTime(year, month, day, hour, min, sec, milli, DateTimeZone.UTC);
        __CLR4_4_1i28i28le6qe9az.R.inc(23594);int offset = zone.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1i28i28le6qe9az.R.inc(23595);DateTime res = new DateTime(dt.getMillis() - offset, zone);
        __CLR4_4_1i28i28le6qe9az.R.inc(23596);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1i28i28le6qe9az.R.flushNeeded();}}

}
