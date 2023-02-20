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
public class TestDateTimeZoneCutover extends TestCase {static class __CLR4_4_1heuheule6ndpex{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,22620,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1heuheule6ndpex.R.inc(22566);
        __CLR4_4_1heuheule6ndpex.R.inc(22567);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1heuheule6ndpex.R.inc(22568);
        __CLR4_4_1heuheule6ndpex.R.inc(22569);return new TestSuite(TestDateTimeZoneCutover.class);
    }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}

    public TestDateTimeZoneCutover(String name) {
        super(name);__CLR4_4_1heuheule6ndpex.R.inc(22571);try{__CLR4_4_1heuheule6ndpex.R.inc(22570);
    }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1heuheule6ndpex.R.inc(22572);
    }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1heuheule6ndpex.R.inc(22573);
    }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}

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
public void testForOffsetHours_int327() {__CLR4_4_1heuheule6ndpex.R.globalSliceStart(getClass().getName(),22574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ed2k2ehf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1heuheule6ndpex.R.rethrow($CLV_t2$);}finally{__CLR4_4_1heuheule6ndpex.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testForOffsetHours_int327",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ed2k2ehf2(){try{__CLR4_4_1heuheule6ndpex.R.inc(22574); 
     __CLR4_4_1heuheule6ndpex.R.inc(22575);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0)); 
     __CLR4_4_1heuheule6ndpex.R.inc(22576);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetHours(3)); 
     __CLR4_4_1heuheule6ndpex.R.inc(22577);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHours(-2)); 
     __CLR4_4_1heuheule6ndpex.R.inc(22578);try { 
         __CLR4_4_1heuheule6ndpex.R.inc(22579);DateTimeZone.forOffsetHours(999999); 
         __CLR4_4_1heuheule6ndpex.R.inc(22580);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}
public void testForOffsetMillis_int328() {__CLR4_4_1heuheule6ndpex.R.globalSliceStart(getClass().getName(),22581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ek17k0hf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1heuheule6ndpex.R.rethrow($CLV_t2$);}finally{__CLR4_4_1heuheule6ndpex.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testForOffsetMillis_int328",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ek17k0hf9(){try{__CLR4_4_1heuheule6ndpex.R.inc(22581); 
     __CLR4_4_1heuheule6ndpex.R.inc(22582);assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0)); 
     __CLR4_4_1heuheule6ndpex.R.inc(22583);assertEquals(DateTimeZone.forID("+23:59:59.999"), DateTimeZone.forOffsetMillis((24 * 60 * 60 * 1000) - 1)); 
     __CLR4_4_1heuheule6ndpex.R.inc(22584);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetMillis(3 * 60 * 60 * 1000)); 
     __CLR4_4_1heuheule6ndpex.R.inc(22585);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetMillis(-2 * 60 * 60 * 1000)); 
     __CLR4_4_1heuheule6ndpex.R.inc(22586);assertEquals(DateTimeZone.forID("-23:59:59.999"), DateTimeZone.forOffsetMillis((-24 * 60 * 60 * 1000) + 1)); 
     __CLR4_4_1heuheule6ndpex.R.inc(22587);assertEquals(DateTimeZone.forID("+04:45:17.045"), DateTimeZone.forOffsetMillis(4 * 60 * 60 * 1000 + 45 * 60 * 1000 + 17 * 1000 + 45)); 
 }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}
public void testPeriod332() {__CLR4_4_1heuheule6ndpex.R.globalSliceStart(getClass().getName(),22588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1d46ehfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1heuheule6ndpex.R.rethrow($CLV_t2$);}finally{__CLR4_4_1heuheule6ndpex.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPeriod332",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1d46ehfg(){try{__CLR4_4_1heuheule6ndpex.R.inc(22588); 
     __CLR4_4_1heuheule6ndpex.R.inc(22589);DateTime a = new DateTime("2010-10-31T02:00:00.000+02:00", ZONE_PARIS); 
     __CLR4_4_1heuheule6ndpex.R.inc(22590);DateTime b = new DateTime("2010-10-31T02:01:00.000+02:00", ZONE_PARIS); 
     __CLR4_4_1heuheule6ndpex.R.inc(22591);Period period = new Period(a, b, PeriodType.standard()); 
     __CLR4_4_1heuheule6ndpex.R.inc(22592);assertEquals("PT1M", period.toString()); 
 }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}
public void test_DateTime_setHourForward_NewYork_Spring333() {__CLR4_4_1heuheule6ndpex.R.globalSliceStart(getClass().getName(),22593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ah0ngshfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1heuheule6ndpex.R.rethrow($CLV_t2$);}finally{__CLR4_4_1heuheule6ndpex.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_NewYork_Spring333",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ah0ngshfl(){try{__CLR4_4_1heuheule6ndpex.R.inc(22593); 
     __CLR4_4_1heuheule6ndpex.R.inc(22594);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK); 
     __CLR4_4_1heuheule6ndpex.R.inc(22595);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString()); 
     __CLR4_4_1heuheule6ndpex.R.inc(22596);try { 
         __CLR4_4_1heuheule6ndpex.R.inc(22597);dt.hourOfDay().setCopy(2); 
         __CLR4_4_1heuheule6ndpex.R.inc(22598);fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}
    

    

    private void doTest_getOffsetFromLocal_Gaza(int days, int hour, int min, String expected) {try{__CLR4_4_1heuheule6ndpex.R.inc(22599);
        __CLR4_4_1heuheule6ndpex.R.inc(22600);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1heuheule6ndpex.R.inc(22601);int offset = MOCK_GAZA.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1heuheule6ndpex.R.inc(22602);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_GAZA);
        __CLR4_4_1heuheule6ndpex.R.inc(22603);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    

    

    private void doTest_getOffsetFromLocal_Turk(int days, int hour, int min, String expected) {try{__CLR4_4_1heuheule6ndpex.R.inc(22604);
        __CLR4_4_1heuheule6ndpex.R.inc(22605);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1heuheule6ndpex.R.inc(22606);int offset = MOCK_TURK.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1heuheule6ndpex.R.inc(22607);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_TURK);
        __CLR4_4_1heuheule6ndpex.R.inc(22608);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

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
    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1heuheule6ndpex.R.inc(22609);
        __CLR4_4_1heuheule6ndpex.R.inc(22610);doTest_getOffsetFromLocal(2007, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1heuheule6ndpex.R.inc(22611);
        __CLR4_4_1heuheule6ndpex.R.inc(22612);doTest_getOffsetFromLocal(2007, month, day, hour, min, sec, milli, expected, zone);
    }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1heuheule6ndpex.R.inc(22613);
        __CLR4_4_1heuheule6ndpex.R.inc(22614);doTest_getOffsetFromLocal(year, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1heuheule6ndpex.R.inc(22615);
        __CLR4_4_1heuheule6ndpex.R.inc(22616);DateTime dt = new DateTime(year, month, day, hour, min, sec, milli, DateTimeZone.UTC);
        __CLR4_4_1heuheule6ndpex.R.inc(22617);int offset = zone.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1heuheule6ndpex.R.inc(22618);DateTime res = new DateTime(dt.getMillis() - offset, zone);
        __CLR4_4_1heuheule6ndpex.R.inc(22619);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1heuheule6ndpex.R.flushNeeded();}}

}
