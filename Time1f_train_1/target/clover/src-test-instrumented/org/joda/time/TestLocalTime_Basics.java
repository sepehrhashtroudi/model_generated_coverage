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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Basics extends TestCase {static class __CLR4_4_1l0bl0ble6qe9ph{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,27525,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

//    private long TEST_TIME1 =
//        1L * DateTimeConstants.MILLIS_PER_HOUR
//        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
//        + 3L * DateTimeConstants.MILLIS_PER_SECOND
//        + 4L;

    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27227);
        __CLR4_4_1l0bl0ble6qe9ph.R.inc(27228);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27229);
        __CLR4_4_1l0bl0ble6qe9ph.R.inc(27230);return new TestSuite(TestLocalTime_Basics.class);
    }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}}

    public TestLocalTime_Basics(String name) {
        super(name);__CLR4_4_1l0bl0ble6qe9ph.R.inc(27232);try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27231);
    }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27233);
        __CLR4_4_1l0bl0ble6qe9ph.R.inc(27234);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1l0bl0ble6qe9ph.R.inc(27235);zone = DateTimeZone.getDefault();
        __CLR4_4_1l0bl0ble6qe9ph.R.inc(27236);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27237);
        __CLR4_4_1l0bl0ble6qe9ph.R.inc(27238);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1l0bl0ble6qe9ph.R.inc(27239);DateTimeZone.setDefault(zone);
        __CLR4_4_1l0bl0ble6qe9ph.R.inc(27240);zone = null;
    }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsEqual_LocalTime18() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17mg4tdl0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsEqual_LocalTime18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17mg4tdl0p(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27241); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27242);LocalTime test1 = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27243);LocalTime test1a = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27244);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27245);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27246);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27247);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27248);LocalTime test2 = new LocalTime(10, 20, 35, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27249);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27250);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27251);LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27252);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27253);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27254);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27255);try { 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27256);new LocalTime(10, 20, 35, 40).isEqual(null); 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27257);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testToString_DTFormatter19() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1onigzsl16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_DTFormatter19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1onigzsl16(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27258); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27259);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27260);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27261);assertEquals("10:20:30.040", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testPlus_RP134() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zembzsl1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlus_RP134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zembzsl1a(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27262); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27263);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27264);LocalTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27265);LocalTime expected = new LocalTime(15, 26, 37, 48, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27266);assertEquals(expected, result); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27267);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27268);assertSame(test, result); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testPlusMinutes_int422() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nu1pm0l1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMinutes_int422",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nu1pm0l1h(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27269); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27270);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27271);LocalTime result = test.plusMinutes(1); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27272);LocalTime expected = new LocalTime(1, 3, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27273);assertEquals(expected, result); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27274);result = test.plusMinutes(0); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27275);assertSame(test, result); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testWithers966() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1omwquql1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithers966",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1omwquql1o(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27276); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27277);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27278);check(test.withHourOfDay(6), 6, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27279);check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27280);check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27281);check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27282);check(test.withMillisOfDay(61234), 0, 1, 1, 234); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27283);try { 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27284);test.withHourOfDay(-1); 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27285);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27286);try { 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27287);test.withHourOfDay(24); 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27288);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testGetValue_int969() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11j28t6l21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetValue_int969",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11j28t6l21(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27289); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27290);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27291);assertEquals(10, test.getValue(0)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27292);assertEquals(20, test.getValue(1)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27293);assertEquals(30, test.getValue(2)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27294);assertEquals(40, test.getValue(3)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27295);try { 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27296);test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27297);try { 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27298);test.getValue(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testGet_DateTimeFieldType970() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16nr9idl2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGet_DateTimeFieldType970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16nr9idl2b(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27299); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27300);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27301);assertEquals(10, test.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27302);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27303);assertEquals(30, test.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27304);assertEquals(40, test.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27305);assertEquals(TEST_TIME_NOW / 60000, test.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27306);assertEquals(TEST_TIME_NOW / 1000, test.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27307);assertEquals(TEST_TIME_NOW, test.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27308);assertEquals(10, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27309);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27310);test = new LocalTime(12, 30); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27311);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27312);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27313);assertEquals(12, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27314);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27315);test = new LocalTime(14, 30); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27316);assertEquals(2, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27317);assertEquals(2, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27318);assertEquals(14, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27319);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27320);test = new LocalTime(0, 30); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27321);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27322);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27323);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27324);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27325);try { 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27326);test.get(null); 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27327);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27328);try { 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27329);test.get(DateTimeFieldType.dayOfMonth()); 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27330);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType971() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oi60j2l37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DateTimeFieldType971",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oi60j2l37(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27331); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27332);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27333);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27334);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27335);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27336);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27337);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27338);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27339);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27340);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27341);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27342);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27343);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27344);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27345);assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27346);DateTimeFieldType d = new DateTimeFieldType("hours") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27347); 
             __CLR4_4_1l0bl0ble6qe9ph.R.inc(27348);return DurationFieldType.hours(); 
         }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27349); 
             __CLR4_4_1l0bl0ble6qe9ph.R.inc(27350);return null; 
         }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27351); 
             __CLR4_4_1l0bl0ble6qe9ph.R.inc(27352);return chronology.hourOfDay(); 
         }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 
     }; 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27353);assertEquals(false, test.isSupported(d)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27354);d = new DateTimeFieldType("hourOfYear") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27355); 
             __CLR4_4_1l0bl0ble6qe9ph.R.inc(27356);return DurationFieldType.hours(); 
         }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27357); 
             __CLR4_4_1l0bl0ble6qe9ph.R.inc(27358);return DurationFieldType.years(); 
         }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27359); 
             __CLR4_4_1l0bl0ble6qe9ph.R.inc(27360);return chronology.hourOfDay(); 
         }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 
     }; 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27361);assertEquals(false, test.isSupported(d)); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testProperty972() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1stm0ksl42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testProperty972",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1stm0ksl42(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27362); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27363);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27364);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27365);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27366);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27367);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27368);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27369);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalTime()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27370);assertEquals(test, test.property(DateTimeFieldType.secondOfDay()).getLocalTime()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27371);assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalTime()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27372);assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalTime()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27373);assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalTime()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27374);assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalTime()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27375);assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalTime()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27376);try { 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27377);test.property(DateTimeFieldType.dayOfWeek()); 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27378);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27379);try { 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27380);test.property(null); 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27381);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testEqualsHashCode973() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13bz2ogl4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testEqualsHashCode973",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13bz2ogl4m(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27382); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27383);LocalTime test1 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27384);LocalTime test2 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27385);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27386);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27387);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27388);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27389);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27390);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27391);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27392);LocalTime test3 = new LocalTime(15, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27393);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27394);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27395);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27396);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27397);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27398);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27399);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27400);assertEquals(true, test1.equals(new TimeOfDay(10, 20, 30, 40, COPTIC_UTC))); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27401);assertEquals(true, test1.hashCode() == new TimeOfDay(10, 20, 30, 40, COPTIC_UTC).hashCode()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27402);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27403);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_2974() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fnabpal58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_2974",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fnabpal58(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27404); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27405);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27406);try { 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27407);test.withField(null, 6); 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27408);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testWithField_DateTimeFieldType_int_3975() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqyxpal5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_3975",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqyxpal5d(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27409); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27410);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27411);try { 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27412);test.withField(DateTimeFieldType.dayOfMonth(), 6); 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27413);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_3976() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hnsr7ol5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_3976",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hnsr7ol5i(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27414); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27415);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27416);try { 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27417);test.withFieldAdded(null, 6); 
         __CLR4_4_1l0bl0ble6qe9ph.R.inc(27418);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_1977() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o462u9l5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_1977",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o462u9l5n(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27419); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27420);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27421);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27422);assertEquals(new LocalTime(10, 20, 30, 40), test); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27423);assertEquals(new LocalTime(16, 20, 30, 40), result); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_4978() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16b46f7l5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_4978",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16b46f7l5s(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27424); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27425);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27426);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 0); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27427);assertSame(test, result); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testPlusHours_int979() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9tdgvl5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusHours_int979",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9tdgvl5w(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27428); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27429);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27430);LocalTime result = test.plusHours(1); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27431);LocalTime expected = new LocalTime(2, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27432);assertEquals(expected, result); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27433);result = test.plusHours(0); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27434);assertSame(test, result); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testPlusSeconds_int980() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aclj8rl63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusSeconds_int980",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aclj8rl63(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27435); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27436);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27437);LocalTime result = test.plusSeconds(1); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27438);LocalTime expected = new LocalTime(1, 2, 4, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27439);assertEquals(expected, result); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27440);result = test.plusSeconds(0); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27441);assertSame(test, result); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testMinus_RP981() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyx7dyl6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinus_RP981",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyx7dyl6a(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27442); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27443);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27444);LocalTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27445);LocalTime expected = new LocalTime(9, 19, 29, 39, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27446);assertEquals(expected, result); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27447);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27448);assertSame(test, result); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testMinusMinutes_int982() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tjzxrdl6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMinutes_int982",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tjzxrdl6h(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27449); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27450);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27451);LocalTime result = test.minusMinutes(1); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27452);LocalTime expected = new LocalTime(1, 1, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27453);assertEquals(expected, result); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27454);result = test.minusMinutes(0); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27455);assertSame(test, result); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testMinusSeconds_int983() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7s5iil6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusSeconds_int983",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7s5iil6o(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27456); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27457);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27458);LocalTime result = test.minusSeconds(1); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27459);LocalTime expected = new LocalTime(1, 2, 2, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27460);assertEquals(expected, result); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27461);result = test.minusSeconds(0); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27462);assertSame(test, result); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testMinusMillis_int984() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_172uhkol6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMillis_int984",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_172uhkol6v(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27463); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27464);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27465);LocalTime result = test.minusMillis(1); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27466);LocalTime expected = new LocalTime(1, 2, 3, 3, BUDDHIST_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27467);assertEquals(expected, result); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27468);result = test.minusMillis(0); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27469);assertSame(test, result); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testToDateTimeToday_nullZone987() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wkgnxil72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeToday_nullZone987",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wkgnxil72(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27470); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27471);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27472);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27473);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27474);DateTime test = base.toDateTimeToday((DateTimeZone) null); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27475);check(base, 10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27476);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27477);expected = expected.hourOfDay().setCopy(10); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27478);expected = expected.minuteOfHour().setCopy(20); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27479);expected = expected.secondOfMinute().setCopy(30); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27480);expected = expected.millisOfSecond().setCopy(40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27481);assertEquals(expected, test); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testToString_String988() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6qxxul7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String988",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6qxxul7e(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27482); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27483);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27484);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27485);assertEquals("10:20:30.040", test.toString((String) null)); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testToString_String_Locale989() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1569lral7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String_Locale989",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1569lral7i(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27486); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27487);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27488);assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27489);assertEquals("10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27490);assertEquals("10 20", test.toString("H m", null)); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27491);assertEquals("10:20:30.040", test.toString(null, null)); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testWithFieldAdded_DurationFieldType_int_8996() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14zrs23l7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_8996",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14zrs23l7o(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27492); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27493);LocalTime test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27494);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27495);assertEquals(new LocalTime(23, 59, 59, 999), result); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27496);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27497);result = test.withFieldAdded(DurationFieldType.seconds(), -1); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27498);assertEquals(new LocalTime(23, 59, 59, 0), result); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27499);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27500);result = test.withFieldAdded(DurationFieldType.minutes(), -1); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27501);assertEquals(new LocalTime(23, 59, 0, 0), result); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27502);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27503);result = test.withFieldAdded(DurationFieldType.hours(), -1); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27504);assertEquals(new LocalTime(23, 0, 0, 0), result); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 


public void testIsSupported_DurationFieldType997() {__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceStart(getClass().getName(),27505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kcz68bl81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l0bl0ble6qe9ph.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l0bl0ble6qe9ph.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DurationFieldType997",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kcz68bl81(){try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27505); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27506);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27507);assertEquals(true, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27508);assertEquals(true, test.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27509);assertEquals(true, test.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27510);assertEquals(true, test.isSupported(DurationFieldType.millis())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27511);assertEquals(true, test.isSupported(DurationFieldType.halfdays())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27512);assertEquals(false, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1l0bl0ble6qe9ph.R.inc(27513);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27514);
            __CLR4_4_1l0bl0ble6qe9ph.R.inc(27515);return COPTIC_UTC;
        }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27516);
            __CLR4_4_1l0bl0ble6qe9ph.R.inc(27517);return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27518);
            __CLR4_4_1l0bl0ble6qe9ph.R.inc(27519);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1l0bl0ble6qe9ph.R.inc(27520);
        __CLR4_4_1l0bl0ble6qe9ph.R.inc(27521);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1l0bl0ble6qe9ph.R.inc(27522);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1l0bl0ble6qe9ph.R.inc(27523);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1l0bl0ble6qe9ph.R.inc(27524);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1l0bl0ble6qe9ph.R.flushNeeded();}}
}
