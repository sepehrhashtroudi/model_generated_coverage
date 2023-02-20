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
public class TestDateTimeZoneCutover extends TestCase {static class __CLR4_4_1i5si5sle6rjc7h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,23718,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23536);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23537);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23538);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23539);return new TestSuite(TestDateTimeZoneCutover.class);
    }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}}

    public TestDateTimeZoneCutover(String name) {
        super(name);__CLR4_4_1i5si5sle6rjc7h.R.inc(23541);try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23540);
    }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23542);
    }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23543);
    }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}}

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

public void testBug2182444_usCentral194() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170ogjii60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug2182444_usCentral194",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170ogjii60(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23544); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23545);Chronology chronUSCentral = GregorianChronology.getInstance(DateTimeZone.forID("US/Central")); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23546);Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23547);DateTime usCentralStandardInUTC = new DateTime(2008, 11, 2, 7, 0, 0, 0, chronUTC); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23548);DateTime usCentralDaylightInUTC = new DateTime(2008, 11, 2, 6, 0, 0, 0, chronUTC); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23549);assertTrue("Should be standard time", chronUSCentral.getZone().isStandardOffset(usCentralStandardInUTC.getMillis())); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23550);assertFalse("Should be daylight time", chronUSCentral.getZone().isStandardOffset(usCentralDaylightInUTC.getMillis())); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23551);DateTime usCentralStandardInUSCentral = usCentralStandardInUTC.toDateTime(chronUSCentral); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23552);DateTime usCentralDaylightInUSCentral = usCentralDaylightInUTC.toDateTime(chronUSCentral); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23553);assertEquals(1, usCentralStandardInUSCentral.getHourOfDay()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23554);assertEquals(usCentralStandardInUSCentral.getHourOfDay(), usCentralDaylightInUSCentral.getHourOfDay()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23555);assertTrue(usCentralStandardInUSCentral.getMillis() != usCentralDaylightInUSCentral.getMillis()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23556);assertEquals(usCentralStandardInUSCentral, usCentralStandardInUSCentral.withHourOfDay(1)); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23557);assertEquals(usCentralStandardInUSCentral.getMillis() + 3, usCentralStandardInUSCentral.withMillisOfSecond(3).getMillis()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23558);assertEquals(usCentralDaylightInUSCentral, usCentralDaylightInUSCentral.withHourOfDay(1)); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23559);assertEquals(usCentralDaylightInUSCentral.getMillis() + 3, usCentralDaylightInUSCentral.withMillisOfSecond(3).getMillis()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void test_DateTime_JustAfterLastEverOverlap264() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_164skdi6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_JustAfterLastEverOverlap264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_164skdi6g(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23560); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23561);DateTimeZone zone = new DateTimeZoneBuilder().setStandardOffset(-3 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("SUMMER", 1 * DateTimeConstants.MILLIS_PER_HOUR, 2000, 2008, 'w', 4, 10, 0, true, 23 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("WINTER", 0, 2000, 2008, 'w', 8, 10, 0, true, 0 * DateTimeConstants.MILLIS_PER_HOUR).toDateTimeZone("Zone", false); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23562);LocalDate date = new LocalDate(2008, 8, 10); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23563);assertEquals("2008-08-10", date.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23564);DateTime dt = date.toDateTimeAtStartOfDay(zone); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23565);assertEquals("2008-08-10T00:00:00.000-03:00", dt.toString()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void testBug3476684_adjustOffset_springGap270() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wk9pe1i6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3476684_adjustOffset_springGap270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wk9pe1i6m(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23566); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23567);final DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo"); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23568);DateTime base = new DateTime(2011, 10, 15, 22, 15, zone); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23569);DateTime baseBefore = base.plusHours(1); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23570);DateTime baseAfter = base.plusHours(2); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23571);assertSame(base, base.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23572);assertSame(base, base.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23573);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23574);assertEquals(baseBefore, baseBefore.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23575);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23576);assertEquals(baseAfter, baseAfter.withEarlierOffsetAtOverlap()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void test_DateTime_roundFloor_hour_NewYork_Spring_postCutover272() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txk3f5i6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hour_NewYork_Spring_postCutover272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txk3f5i6x(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23577); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23578);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23579);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23580);DateTime rounded = dt.hourOfDay().roundFloorCopy(); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23581);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void test_getOffsetFromLocal_Moscow_Autumn_overlap_mins273() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s05l4ui72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Moscow_Autumn_overlap_mins273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s05l4ui72(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23582); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23583);for (int min = 0; (((min < 60)&&(__CLR4_4_1i5si5sle6rjc7h.R.iget(23584)!=0|true))||(__CLR4_4_1i5si5sle6rjc7h.R.iget(23585)==0&false)); min++) {{ 
         __CLR4_4_1i5si5sle6rjc7h.R.inc(23586);if ((((min < 10)&&(__CLR4_4_1i5si5sle6rjc7h.R.iget(23587)!=0|true))||(__CLR4_4_1i5si5sle6rjc7h.R.iget(23588)==0&false))) {{ 
             __CLR4_4_1i5si5sle6rjc7h.R.inc(23589);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:0" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } }else {{ 
             __CLR4_4_1i5si5sle6rjc7h.R.inc(23590);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } 
     }} 
 }}finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void testPlusSecondsInDstChange601() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uj5am9i7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusSecondsInDstChange601",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uj5am9i7b(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23591); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23592);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23593);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23594);DateTime test = dateTime.plusSeconds(1); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23595);assertEquals("2010-10-31T02:30:11.123+02:00", test.toString()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void testPlusMillisInDstChange603() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j639aai7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusMillisInDstChange603",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j639aai7g(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23596); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23597);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23598);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23599);DateTime test = dateTime.plusMillis(1); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23600);assertEquals("2010-10-31T02:30:10.124+02:00", test.toString()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void test_DateTime_minusHour_NewYork_Autumn611() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wchx91i7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_NewYork_Autumn611",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wchx91i7l(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23601); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23602);DateTime dt = new DateTime(2007, 11, 4, 8, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23603);assertEquals("2007-11-04T08:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23604);DateTime minus6 = dt.minusHours(6); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23605);assertEquals("2007-11-04T02:00:00.000-05:00", minus6.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23606);DateTime minus7 = dt.minusHours(7); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23607);assertEquals("2007-11-04T01:00:00.000-05:00", minus7.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23608);DateTime minus8 = dt.minusHours(8); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23609);assertEquals("2007-11-04T01:00:00.000-04:00", minus8.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23610);DateTime minus9 = dt.minusHours(9); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23611);assertEquals("2007-11-04T00:00:00.000-04:00", minus9.toString()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void test_DateTime_withDay_Turk620() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iszk4fi7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withDay_Turk620",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iszk4fi7w(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23612); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23613);DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_TURK); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23614);assertEquals("2007-04-02T00:00:00.000-04:00", dt.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23615);DateTime res = dt.withDayOfMonth(1); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23616);assertEquals("2007-04-01T01:00:00.000-04:00", res.toString()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void testBug2182444_ausNSW621() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ql0pp9i81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug2182444_ausNSW621",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ql0pp9i81(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23617); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23618);Chronology chronAusNSW = GregorianChronology.getInstance(DateTimeZone.forID("Australia/NSW")); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23619);Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23620);DateTime australiaNSWStandardInUTC = new DateTime(2008, 4, 5, 16, 0, 0, 0, chronUTC); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23621);DateTime australiaNSWDaylightInUTC = new DateTime(2008, 4, 5, 15, 0, 0, 0, chronUTC); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23622);assertTrue("Should be standard time", chronAusNSW.getZone().isStandardOffset(australiaNSWStandardInUTC.getMillis())); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23623);assertFalse("Should be daylight time", chronAusNSW.getZone().isStandardOffset(australiaNSWDaylightInUTC.getMillis())); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23624);DateTime australiaNSWStandardInAustraliaNSW = australiaNSWStandardInUTC.toDateTime(chronAusNSW); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23625);DateTime australiaNSWDaylightInAusraliaNSW = australiaNSWDaylightInUTC.toDateTime(chronAusNSW); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23626);assertEquals(2, australiaNSWStandardInAustraliaNSW.getHourOfDay()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23627);assertEquals(australiaNSWStandardInAustraliaNSW.getHourOfDay(), australiaNSWDaylightInAusraliaNSW.getHourOfDay()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23628);assertTrue(australiaNSWStandardInAustraliaNSW.getMillis() != australiaNSWDaylightInAusraliaNSW.getMillis()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23629);assertEquals(australiaNSWStandardInAustraliaNSW, australiaNSWStandardInAustraliaNSW.withHourOfDay(2)); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23630);assertEquals(australiaNSWStandardInAustraliaNSW.getMillis() + 3, australiaNSWStandardInAustraliaNSW.withMillisOfSecond(3).getMillis()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23631);assertEquals(australiaNSWDaylightInAusraliaNSW, australiaNSWDaylightInAusraliaNSW.withHourOfDay(2)); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23632);assertEquals(australiaNSWDaylightInAusraliaNSW.getMillis() + 3, australiaNSWDaylightInAusraliaNSW.withMillisOfSecond(3).getMillis()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void testWithMinuteOfHourInDstChange_mockZone622() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12t2swfi8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMinuteOfHourInDstChange_mockZone622",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12t2swfi8h(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23633); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23634);DateTime cutover = new DateTime(2010, 10, 31, 1, 15, DateTimeZone.forOffsetHoursMinutes(0, 30)); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23635);assertEquals("2010-10-31T01:15:00.000+00:30", cutover.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23636);DateTimeZone halfHourZone = new MockZone(cutover.getMillis(), 3600000, -1800); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23637);DateTime pre = new DateTime(2010, 10, 31, 1, 0, halfHourZone); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23638);assertEquals("2010-10-31T01:00:00.000+01:00", pre.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23639);DateTime post = new DateTime(2010, 10, 31, 1, 59, halfHourZone); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23640);assertEquals("2010-10-31T01:59:00.000+00:30", post.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23641);DateTime testPre1 = pre.withMinuteOfHour(30); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23642);assertEquals("2010-10-31T01:30:00.000+01:00", testPre1.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23643);DateTime testPre2 = pre.withMinuteOfHour(50); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23644);assertEquals("2010-10-31T01:50:00.000+00:30", testPre2.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23645);DateTime testPost1 = post.withMinuteOfHour(30); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23646);assertEquals("2010-10-31T01:30:00.000+00:30", testPost1.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23647);DateTime testPost2 = post.withMinuteOfHour(10); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23648);assertEquals("2010-10-31T01:10:00.000+01:00", testPost2.toString()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void testWithMillisOfSecondInDstChange_NewYork_summer623() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdi6c9i8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMillisOfSecondInDstChange_NewYork_summer623",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdi6c9i8x(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23649); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23650);DateTime dateTime = new DateTime("2007-11-04T01:30:00.123-04:00", ZONE_NEW_YORK); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23651);assertEquals("2007-11-04T01:30:00.123-04:00", dateTime.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23652);DateTime test = dateTime.withMillisOfSecond(0); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23653);assertEquals("2007-11-04T01:30:00.000-04:00", test.toString()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void test_LocalDate_new_Turk720() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17g0mr4i92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_new_Turk720",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17g0mr4i92(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23654); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23655);LocalDate date1 = new LocalDate(CUTOVER_TURK, MOCK_TURK); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23656);assertEquals("2007-04-01", date1.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23657);LocalDate date2 = new LocalDate(CUTOVER_TURK - 1, MOCK_TURK); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23658);assertEquals("2007-03-31", date2.toString()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void test_LocalDate_toDateMidnight_Gaza723() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iybk8bi97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_toDateMidnight_Gaza723",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iybk8bi97(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23659); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23660);LocalDate date = new LocalDate(2007, 4, 1); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23661);try { 
         __CLR4_4_1i5si5sle6rjc7h.R.inc(23662);date.toDateMidnight(MOCK_GAZA); 
         __CLR4_4_1i5si5sle6rjc7h.R.inc(23663);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1i5si5sle6rjc7h.R.inc(23664);assertEquals(true, ex.getMessage().startsWith("Illegal instant due to time zone offset transition")); 
     } 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void testBug3192457_adjustOffset834() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cbs58ci9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3192457_adjustOffset834",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cbs58ci9d(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23665); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23666);final DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23667);DateTime base = new DateTime(2007, 10, 28, 3, 15, zone); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23668);DateTime baseBefore = base.minusHours(2); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23669);DateTime baseAfter = base.minusHours(1); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23670);assertSame(base, base.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23671);assertSame(base, base.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23672);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23673);assertEquals(baseAfter, baseBefore.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23674);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23675);assertEquals(baseBefore, baseAfter.withEarlierOffsetAtOverlap()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void test_DateTime_roundCeiling_day_NewYork_Spring_postCutover961() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ndhiji9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Spring_postCutover961",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ndhiji9o(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23676); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23677);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23678);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23679);DateTime rounded = dt.dayOfMonth().roundCeilingCopy(); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23680);assertEquals("2007-03-12T00:00:00.000-04:00", rounded.toString()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void test_DateTime_parse_Gaza962() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xf03q0i9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Gaza962",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xf03q0i9t(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23681); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23682);try { 
         __CLR4_4_1i5si5sle6rjc7h.R.inc(23683);new DateTime("2007-04-01T00:00", MOCK_GAZA); 
         __CLR4_4_1i5si5sle6rjc7h.R.inc(23684);fail(); 
     } catch (IllegalInstantException ex) { 
         __CLR4_4_1i5si5sle6rjc7h.R.inc(23685);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0); 
     } 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void test_DateTime_setHourForward_Moscow_Spring963() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xd1yz8i9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_Moscow_Spring963",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xd1yz8i9y(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23686); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23687);DateTime dt = new DateTime(2007, 3, 25, 0, 0, 0, 0, ZONE_MOSCOW); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23688);assertEquals("2007-03-25T00:00:00.000+03:00", dt.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23689);try { 
         __CLR4_4_1i5si5sle6rjc7h.R.inc(23690);dt.hourOfDay().setCopy(2); 
         __CLR4_4_1i5si5sle6rjc7h.R.inc(23691);fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 


public void test_MutableDateTime_withZoneRetainFields_Gaza1034() {__CLR4_4_1i5si5sle6rjc7h.R.globalSliceStart(getClass().getName(),23692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bwm1wsia4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5si5sle6rjc7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5si5sle6rjc7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MutableDateTime_withZoneRetainFields_Gaza1034",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bwm1wsia4(){try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23692); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23693);MutableDateTime dt = new MutableDateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23694);assertEquals("2007-04-01T00:00:00.000Z", dt.toString()); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23695);dt.setZoneRetainFields(MOCK_GAZA); 
     __CLR4_4_1i5si5sle6rjc7h.R.inc(23696);assertEquals("2007-04-01T01:00:00.000+03:00", dt.toString()); 
 }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}} 

    

    

    private void doTest_getOffsetFromLocal_Gaza(int days, int hour, int min, String expected) {try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23697);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23698);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23699);int offset = MOCK_GAZA.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23700);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_GAZA);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23701);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    

    

    private void doTest_getOffsetFromLocal_Turk(int days, int hour, int min, String expected) {try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23702);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23703);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23704);int offset = MOCK_TURK.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23705);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_TURK);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23706);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

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
    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23707);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23708);doTest_getOffsetFromLocal(2007, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23709);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23710);doTest_getOffsetFromLocal(2007, month, day, hour, min, sec, milli, expected, zone);
    }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23711);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23712);doTest_getOffsetFromLocal(year, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1i5si5sle6rjc7h.R.inc(23713);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23714);DateTime dt = new DateTime(year, month, day, hour, min, sec, milli, DateTimeZone.UTC);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23715);int offset = zone.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23716);DateTime res = new DateTime(dt.getMillis() - offset, zone);
        __CLR4_4_1i5si5sle6rjc7h.R.inc(23717);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1i5si5sle6rjc7h.R.flushNeeded();}}

}
