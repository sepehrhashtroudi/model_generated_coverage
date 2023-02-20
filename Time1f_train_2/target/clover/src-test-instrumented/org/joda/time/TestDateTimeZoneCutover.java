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
public class TestDateTimeZoneCutover extends TestCase {static class __CLR4_4_1i1li1lle6qseqs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,23573,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1i1li1lle6qseqs.R.inc(23385);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23386);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i1li1lle6qseqs.R.inc(23387);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23388);return new TestSuite(TestDateTimeZoneCutover.class);
    }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}}

    public TestDateTimeZoneCutover(String name) {
        super(name);__CLR4_4_1i1li1lle6qseqs.R.inc(23390);try{__CLR4_4_1i1li1lle6qseqs.R.inc(23389);
    }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i1li1lle6qseqs.R.inc(23391);
    }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i1li1lle6qseqs.R.inc(23392);
    }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}}

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

public void test_DateTime_JustAfterLastEverOverlap237() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_187byppi1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_JustAfterLastEverOverlap237",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_187byppi1t(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23393); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23394);DateTimeZone zone = new DateTimeZoneBuilder().setStandardOffset(-3 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("SUMMER", 1 * DateTimeConstants.MILLIS_PER_HOUR, 2000, 2008, 'w', 4, 10, 0, true, 23 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("WINTER", 0, 2000, 2008, 'w', 8, 10, 0, true, 0 * DateTimeConstants.MILLIS_PER_HOUR).toDateTimeZone("Zone", false); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23395);LocalDate date = new LocalDate(2008, 8, 10); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23396);assertEquals("2008-08-10", date.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23397);DateTime dt = date.toDateTimeAtStartOfDay(zone); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23398);assertEquals("2008-08-10T00:00:00.000-03:00", dt.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_DateTime_roundFloor_hour_NewYork_Spring_postCutover244() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th38hgi1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hour_NewYork_Spring_postCutover244",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th38hgi1z(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23399); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23400);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23401);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23402);DateTime rounded = dt.hourOfDay().roundFloorCopy(); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23403);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_getOffsetFromLocal_Moscow_Autumn_overlap_mins245() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gdov2bi24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Moscow_Autumn_overlap_mins245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gdov2bi24(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23404); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23405);for (int min = 0; (((min < 60)&&(__CLR4_4_1i1li1lle6qseqs.R.iget(23406)!=0|true))||(__CLR4_4_1i1li1lle6qseqs.R.iget(23407)==0&false)); min++) {{ 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23408);if ((((min < 10)&&(__CLR4_4_1i1li1lle6qseqs.R.iget(23409)!=0|true))||(__CLR4_4_1i1li1lle6qseqs.R.iget(23410)==0&false))) {{ 
             __CLR4_4_1i1li1lle6qseqs.R.inc(23411);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:0" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } }else {{ 
             __CLR4_4_1i1li1lle6qseqs.R.inc(23412);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } 
     }} 
 }}finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_DateTime_plusDayMidGap_Turk563() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmf7dli2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusDayMidGap_Turk563",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmf7dli2d(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23413); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23414);DateTime dt = new DateTime(2007, 3, 31, 0, 30, 0, 0, MOCK_TURK); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23415);assertEquals("2007-03-31T00:30:00.000-05:00", dt.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23416);DateTime plus1 = dt.plusDays(1); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23417);assertEquals("2007-04-01T01:30:00.000-04:00", plus1.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23418);DateTime plus2 = dt.plusDays(2); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23419);assertEquals("2007-04-02T00:30:00.000-04:00", plus2.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void testPlusSecondsInDstChange567() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdt1k0i2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusSecondsInDstChange567",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdt1k0i2k(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23420); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23421);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23422);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23423);DateTime test = dateTime.plusSeconds(1); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23424);assertEquals("2010-10-31T02:30:11.123+02:00", test.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void testPlusMillisInDstChange569() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160r081i2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusMillisInDstChange569",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160r081i2p(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23425); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23426);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23427);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23428);DateTime test = dateTime.plusMillis(1); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23429);assertEquals("2010-10-31T02:30:10.124+02:00", test.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_DateTime_minusHour_NewYork_Autumn577() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j75o6si2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_NewYork_Autumn577",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j75o6si2u(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23430); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23431);DateTime dt = new DateTime(2007, 11, 4, 8, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23432);assertEquals("2007-11-04T08:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23433);DateTime minus6 = dt.minusHours(6); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23434);assertEquals("2007-11-04T02:00:00.000-05:00", minus6.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23435);DateTime minus7 = dt.minusHours(7); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23436);assertEquals("2007-11-04T01:00:00.000-05:00", minus7.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23437);DateTime minus8 = dt.minusHours(8); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23438);assertEquals("2007-11-04T01:00:00.000-04:00", minus8.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23439);DateTime minus9 = dt.minusHours(9); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23440);assertEquals("2007-11-04T00:00:00.000-04:00", minus9.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_DateTime_withDay_Turk590() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqgpdzi35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withDay_Turk590",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqgpdzi35(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23441); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23442);DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_TURK); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23443);assertEquals("2007-04-02T00:00:00.000-04:00", dt.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23444);DateTime res = dt.withDayOfMonth(1); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23445);assertEquals("2007-04-01T01:00:00.000-04:00", res.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void testBug2182444_ausNSW591() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tihuyti3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug2182444_ausNSW591",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tihuyti3a(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23446); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23447);Chronology chronAusNSW = GregorianChronology.getInstance(DateTimeZone.forID("Australia/NSW")); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23448);Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23449);DateTime australiaNSWStandardInUTC = new DateTime(2008, 4, 5, 16, 0, 0, 0, chronUTC); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23450);DateTime australiaNSWDaylightInUTC = new DateTime(2008, 4, 5, 15, 0, 0, 0, chronUTC); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23451);assertTrue("Should be standard time", chronAusNSW.getZone().isStandardOffset(australiaNSWStandardInUTC.getMillis())); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23452);assertFalse("Should be daylight time", chronAusNSW.getZone().isStandardOffset(australiaNSWDaylightInUTC.getMillis())); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23453);DateTime australiaNSWStandardInAustraliaNSW = australiaNSWStandardInUTC.toDateTime(chronAusNSW); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23454);DateTime australiaNSWDaylightInAusraliaNSW = australiaNSWDaylightInUTC.toDateTime(chronAusNSW); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23455);assertEquals(2, australiaNSWStandardInAustraliaNSW.getHourOfDay()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23456);assertEquals(australiaNSWStandardInAustraliaNSW.getHourOfDay(), australiaNSWDaylightInAusraliaNSW.getHourOfDay()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23457);assertTrue(australiaNSWStandardInAustraliaNSW.getMillis() != australiaNSWDaylightInAusraliaNSW.getMillis()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23458);assertEquals(australiaNSWStandardInAustraliaNSW, australiaNSWStandardInAustraliaNSW.withHourOfDay(2)); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23459);assertEquals(australiaNSWStandardInAustraliaNSW.getMillis() + 3, australiaNSWStandardInAustraliaNSW.withMillisOfSecond(3).getMillis()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23460);assertEquals(australiaNSWDaylightInAusraliaNSW, australiaNSWDaylightInAusraliaNSW.withHourOfDay(2)); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23461);assertEquals(australiaNSWDaylightInAusraliaNSW.getMillis() + 3, australiaNSWDaylightInAusraliaNSW.withMillisOfSecond(3).getMillis()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void testWithMinuteOfHourInDstChange_mockZone592() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qjy5zi3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMinuteOfHourInDstChange_mockZone592",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qjy5zi3q(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23462); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23463);DateTime cutover = new DateTime(2010, 10, 31, 1, 15, DateTimeZone.forOffsetHoursMinutes(0, 30)); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23464);assertEquals("2010-10-31T01:15:00.000+00:30", cutover.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23465);DateTimeZone halfHourZone = new MockZone(cutover.getMillis(), 3600000, -1800); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23466);DateTime pre = new DateTime(2010, 10, 31, 1, 0, halfHourZone); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23467);assertEquals("2010-10-31T01:00:00.000+01:00", pre.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23468);DateTime post = new DateTime(2010, 10, 31, 1, 59, halfHourZone); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23469);assertEquals("2010-10-31T01:59:00.000+00:30", post.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23470);DateTime testPre1 = pre.withMinuteOfHour(30); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23471);assertEquals("2010-10-31T01:30:00.000+01:00", testPre1.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23472);DateTime testPre2 = pre.withMinuteOfHour(50); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23473);assertEquals("2010-10-31T01:50:00.000+00:30", testPre2.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23474);DateTime testPost1 = post.withMinuteOfHour(30); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23475);assertEquals("2010-10-31T01:30:00.000+00:30", testPost1.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23476);DateTime testPost2 = post.withMinuteOfHour(10); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23477);assertEquals("2010-10-31T01:10:00.000+01:00", testPost2.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void testWithMillisOfSecondInDstChange_NewYork_summer593() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mazblti46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMillisOfSecondInDstChange_NewYork_summer593",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mazblti46(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23478); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23479);DateTime dateTime = new DateTime("2007-11-04T01:30:00.123-04:00", ZONE_NEW_YORK); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23480);assertEquals("2007-11-04T01:30:00.123-04:00", dateTime.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23481);DateTime test = dateTime.withMillisOfSecond(0); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23482);assertEquals("2007-11-04T01:30:00.000-04:00", test.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover609() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esdck3i4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover609",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esdck3i4b(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23483); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23484);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23485);assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23486);DateTime rounded = dt.hourOfDay().roundCeilingCopy(); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23487);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_LocalDate_new_Turk692() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13vhufqi4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_new_Turk692",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13vhufqi4g(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23488); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23489);LocalDate date1 = new LocalDate(CUTOVER_TURK, MOCK_TURK); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23490);assertEquals("2007-04-01", date1.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23491);LocalDate date2 = new LocalDate(CUTOVER_TURK - 1, MOCK_TURK); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23492);assertEquals("2007-03-31", date2.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_LocalDate_toDateMidnight_Gaza694() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j9udr8i4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_toDateMidnight_Gaza694",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j9udr8i4l(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23493); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23494);LocalDate date = new LocalDate(2007, 4, 1); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23495);try { 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23496);date.toDateMidnight(MOCK_GAZA); 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23497);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23498);assertEquals(true, ex.getMessage().startsWith("Illegal instant due to time zone offset transition")); 
     } 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void testPeriod802() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_138n07ii4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPeriod802",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_138n07ii4r(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23499); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23500);DateTime a = new DateTime("2010-10-31T02:00:00.000+02:00", ZONE_PARIS); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23501);DateTime b = new DateTime("2010-10-31T02:01:00.000+02:00", ZONE_PARIS); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23502);Period period = new Period(a, b, PeriodType.standard()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23503);assertEquals("PT1M", period.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_DateTime_setHourAcross_NewYork_Spring803() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mfwfgi4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourAcross_NewYork_Spring803",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mfwfgi4w(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23504); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23505);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23506);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23507);DateTime res = dt.hourOfDay().setCopy(4); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23508);assertEquals("2007-03-11T04:00:00.000-04:00", res.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_DateTime_setHourForward_NewYork_Spring804() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z0d9bxi51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_NewYork_Spring804",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z0d9bxi51(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23509); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23510);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23511);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23512);try { 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23513);dt.hourOfDay().setCopy(2); 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23514);fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void testBug3192457_adjustOffset806() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pbf5ti57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3192457_adjustOffset806",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pbf5ti57(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23515); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23516);final DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23517);DateTime base = new DateTime(2007, 10, 28, 3, 15, zone); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23518);DateTime baseBefore = base.minusHours(2); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23519);DateTime baseAfter = base.minusHours(1); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23520);assertSame(base, base.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23521);assertSame(base, base.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23522);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23523);assertEquals(baseAfter, baseBefore.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23524);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23525);assertEquals(baseBefore, baseAfter.withEarlierOffsetAtOverlap()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_DateTime_parse_Turk808() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xablo6i5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Turk808",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xablo6i5i(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23526); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23527);try { 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23528);new DateTime("2007-04-01T00:00", MOCK_TURK); 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23529);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23530);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0); 
     } 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_DateTime_roundCeiling_day_NewYork_Spring_postCutover935() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11iwp0yi5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Spring_postCutover935",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11iwp0yi5n(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23531); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23532);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23533);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23534);DateTime rounded = dt.dayOfMonth().roundCeilingCopy(); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23535);assertEquals("2007-03-12T00:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_DateTime_parse_Gaza937() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjja0wi5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Gaza937",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjja0wi5s(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23536); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23537);try { 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23538);new DateTime("2007-04-01T00:00", MOCK_GAZA); 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23539);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23540);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0); 
     } 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_DateTime_setHourForward_Moscow_Spring938() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vhl5a4i5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_Moscow_Spring938",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vhl5a4i5x(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23541); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23542);DateTime dt = new DateTime(2007, 3, 25, 0, 0, 0, 0, ZONE_MOSCOW); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23543);assertEquals("2007-03-25T00:00:00.000+03:00", dt.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23544);try { 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23545);dt.hourOfDay().setCopy(2); 
         __CLR4_4_1i1li1lle6qseqs.R.inc(23546);fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 


public void test_MutableDateTime_withZoneRetainFields_Gaza1010() {__CLR4_4_1i1li1lle6qseqs.R.globalSliceStart(getClass().getName(),23547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ai0fmyi63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1li1lle6qseqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1li1lle6qseqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MutableDateTime_withZoneRetainFields_Gaza1010",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ai0fmyi63(){try{__CLR4_4_1i1li1lle6qseqs.R.inc(23547); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23548);MutableDateTime dt = new MutableDateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23549);assertEquals("2007-04-01T00:00:00.000Z", dt.toString()); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23550);dt.setZoneRetainFields(MOCK_GAZA); 
     __CLR4_4_1i1li1lle6qseqs.R.inc(23551);assertEquals("2007-04-01T01:00:00.000+03:00", dt.toString()); 
 }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}} 

    

    

    private void doTest_getOffsetFromLocal_Gaza(int days, int hour, int min, String expected) {try{__CLR4_4_1i1li1lle6qseqs.R.inc(23552);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23553);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23554);int offset = MOCK_GAZA.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1i1li1lle6qseqs.R.inc(23555);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_GAZA);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23556);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    

    

    private void doTest_getOffsetFromLocal_Turk(int days, int hour, int min, String expected) {try{__CLR4_4_1i1li1lle6qseqs.R.inc(23557);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23558);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23559);int offset = MOCK_TURK.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1i1li1lle6qseqs.R.inc(23560);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_TURK);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23561);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

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
    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1i1li1lle6qseqs.R.inc(23562);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23563);doTest_getOffsetFromLocal(2007, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1i1li1lle6qseqs.R.inc(23564);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23565);doTest_getOffsetFromLocal(2007, month, day, hour, min, sec, milli, expected, zone);
    }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1i1li1lle6qseqs.R.inc(23566);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23567);doTest_getOffsetFromLocal(year, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1i1li1lle6qseqs.R.inc(23568);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23569);DateTime dt = new DateTime(year, month, day, hour, min, sec, milli, DateTimeZone.UTC);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23570);int offset = zone.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1i1li1lle6qseqs.R.inc(23571);DateTime res = new DateTime(dt.getMillis() - offset, zone);
        __CLR4_4_1i1li1lle6qseqs.R.inc(23572);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1i1li1lle6qseqs.R.flushNeeded();}}

}
