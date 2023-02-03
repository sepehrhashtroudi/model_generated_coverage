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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for EthiopicChronology.
 *
 * @author Stephen Colebourne
 */
public class TestEthiopicChronology extends TestCase {static class __CLR4_4_1r7mr7mlc8axepi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,35499,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology ETHIOPIC_UTC = EthiopicChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1r7mr7mlc8axepi.R.inc(35266);
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35267);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1r7mr7mlc8axepi.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1r7mr7mlc8axepi.R.inc(35268);
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35269);SKIP = 1 * MILLIS_PER_DAY;
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35270);return new TestSuite(TestEthiopicChronology.class);
    }finally{__CLR4_4_1r7mr7mlc8axepi.R.flushNeeded();}}

    public TestEthiopicChronology(String name) {
        super(name);__CLR4_4_1r7mr7mlc8axepi.R.inc(35272);try{__CLR4_4_1r7mr7mlc8axepi.R.inc(35271);
    }finally{__CLR4_4_1r7mr7mlc8axepi.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1r7mr7mlc8axepi.R.inc(35273);
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35274);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35275);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35276);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35277);originalLocale = Locale.getDefault();
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35278);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35279);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35280);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1r7mr7mlc8axepi.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1r7mr7mlc8axepi.R.inc(35281);
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35282);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35283);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35284);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35285);Locale.setDefault(originalLocale);
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35286);originalDateTimeZone = null;
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35287);originalTimeZone = null;
        __CLR4_4_1r7mr7mlc8axepi.R.inc(35288);originalLocale = null;
    }finally{__CLR4_4_1r7mr7mlc8axepi.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testDurationFields228() {__CLR4_4_1r7mr7mlc8axepi.R.globalSliceStart(getClass().getName(),35289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19kreaor89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r7mr7mlc8axepi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r7mr7mlc8axepi.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationFields228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19kreaor89(){try{__CLR4_4_1r7mr7mlc8axepi.R.inc(35289); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35290);final EthiopicChronology ethiopic = EthiopicChronology.getInstance(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35291);assertEquals("eras", ethiopic.eras().getName()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35292);assertEquals("centuries", ethiopic.centuries().getName()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35293);assertEquals("years", ethiopic.years().getName()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35294);assertEquals("weekyears", ethiopic.weekyears().getName()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35295);assertEquals("months", ethiopic.months().getName()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35296);assertEquals("weeks", ethiopic.weeks().getName()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35297);assertEquals("days", ethiopic.days().getName()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35298);assertEquals("halfdays", ethiopic.halfdays().getName()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35299);assertEquals("hours", ethiopic.hours().getName()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35300);assertEquals("minutes", ethiopic.minutes().getName()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35301);assertEquals("seconds", ethiopic.seconds().getName()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35302);assertEquals("millis", ethiopic.millis().getName()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35303);assertEquals(false, ethiopic.eras().isSupported()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35304);assertEquals(true, ethiopic.centuries().isSupported()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35305);assertEquals(true, ethiopic.years().isSupported()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35306);assertEquals(true, ethiopic.weekyears().isSupported()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35307);assertEquals(true, ethiopic.months().isSupported()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35308);assertEquals(true, ethiopic.weeks().isSupported()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35309);assertEquals(true, ethiopic.days().isSupported()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35310);assertEquals(true, ethiopic.halfdays().isSupported()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35311);assertEquals(true, ethiopic.hours().isSupported()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35312);assertEquals(true, ethiopic.minutes().isSupported()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35313);assertEquals(true, ethiopic.seconds().isSupported()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35314);assertEquals(true, ethiopic.millis().isSupported()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35315);assertEquals(false, ethiopic.centuries().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35316);assertEquals(false, ethiopic.years().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35317);assertEquals(false, ethiopic.weekyears().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35318);assertEquals(false, ethiopic.months().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35319);assertEquals(false, ethiopic.weeks().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35320);assertEquals(false, ethiopic.days().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35321);assertEquals(false, ethiopic.halfdays().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35322);assertEquals(true, ethiopic.hours().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35323);assertEquals(true, ethiopic.minutes().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35324);assertEquals(true, ethiopic.seconds().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35325);assertEquals(true, ethiopic.millis().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35326);final EthiopicChronology ethiopicUTC = EthiopicChronology.getInstanceUTC(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35327);assertEquals(false, ethiopicUTC.centuries().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35328);assertEquals(false, ethiopicUTC.years().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35329);assertEquals(false, ethiopicUTC.weekyears().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35330);assertEquals(false, ethiopicUTC.months().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35331);assertEquals(true, ethiopicUTC.weeks().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35332);assertEquals(true, ethiopicUTC.days().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35333);assertEquals(true, ethiopicUTC.halfdays().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35334);assertEquals(true, ethiopicUTC.hours().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35335);assertEquals(true, ethiopicUTC.minutes().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35336);assertEquals(true, ethiopicUTC.seconds().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35337);assertEquals(true, ethiopicUTC.millis().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35338);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35339);final EthiopicChronology ethiopicGMT = EthiopicChronology.getInstance(gmt); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35340);assertEquals(false, ethiopicGMT.centuries().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35341);assertEquals(false, ethiopicGMT.years().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35342);assertEquals(false, ethiopicGMT.weekyears().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35343);assertEquals(false, ethiopicGMT.months().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35344);assertEquals(true, ethiopicGMT.weeks().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35345);assertEquals(true, ethiopicGMT.days().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35346);assertEquals(true, ethiopicGMT.halfdays().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35347);assertEquals(true, ethiopicGMT.hours().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35348);assertEquals(true, ethiopicGMT.minutes().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35349);assertEquals(true, ethiopicGMT.seconds().isPrecise()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35350);assertEquals(true, ethiopicGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1r7mr7mlc8axepi.R.flushNeeded();}} 


public void testWithUTC569() {__CLR4_4_1r7mr7mlc8axepi.R.globalSliceStart(getClass().getName(),35351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4lbebr9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r7mr7mlc8axepi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r7mr7mlc8axepi.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testWithUTC569",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4lbebr9z(){try{__CLR4_4_1r7mr7mlc8axepi.R.inc(35351); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35352);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35353);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35354);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35355);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance().withUTC()); 
 }finally{__CLR4_4_1r7mr7mlc8axepi.R.flushNeeded();}} 


public void testWithZone790() {__CLR4_4_1r7mr7mlc8axepi.R.globalSliceStart(getClass().getName(),35356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ot1w6nra4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r7mr7mlc8axepi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r7mr7mlc8axepi.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testWithZone790",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ot1w6nra4(){try{__CLR4_4_1r7mr7mlc8axepi.R.inc(35356); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35357);assertSame(EthiopicChronology.getInstance(TOKYO), EthiopicChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35358);assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35359);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35360);assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35361);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35362);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1r7mr7mlc8axepi.R.flushNeeded();}} 


public void testCalendar800() {__CLR4_4_1r7mr7mlc8axepi.R.globalSliceStart(getClass().getName(),35363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gt0unrab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r7mr7mlc8axepi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r7mr7mlc8axepi.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testCalendar800",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gt0unrab(){try{__CLR4_4_1r7mr7mlc8axepi.R.inc(35363); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35364);if ((((TestAll.FAST)&&(__CLR4_4_1r7mr7mlc8axepi.R.iget(35365)!=0|true))||(__CLR4_4_1r7mr7mlc8axepi.R.iget(35366)==0&false))) {{ 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35367);return; 
     } 
     }__CLR4_4_1r7mr7mlc8axepi.R.inc(35368);System.out.println("\nTestEthiopicChronology.testCalendar"); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35369);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35370);long millis = epoch.getMillis(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35371);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35372);DateTimeField dayOfWeek = ETHIOPIC_UTC.dayOfWeek(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35373);DateTimeField dayOfYear = ETHIOPIC_UTC.dayOfYear(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35374);DateTimeField dayOfMonth = ETHIOPIC_UTC.dayOfMonth(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35375);DateTimeField monthOfYear = ETHIOPIC_UTC.monthOfYear(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35376);DateTimeField year = ETHIOPIC_UTC.year(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35377);DateTimeField yearOfEra = ETHIOPIC_UTC.yearOfEra(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35378);DateTimeField era = ETHIOPIC_UTC.era(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35379);int expectedDOW = new DateTime(8, 8, 29, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35380);int expectedDOY = 1; 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35381);int expectedDay = 1; 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35382);int expectedMonth = 1; 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35383);int expectedYear = 1; 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35384);while ((((millis < end)&&(__CLR4_4_1r7mr7mlc8axepi.R.iget(35385)!=0|true))||(__CLR4_4_1r7mr7mlc8axepi.R.iget(35386)==0&false))) {{ 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35387);int dowValue = dayOfWeek.get(millis); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35388);int doyValue = dayOfYear.get(millis); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35389);int dayValue = dayOfMonth.get(millis); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35390);int monthValue = monthOfYear.get(millis); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35391);int yearValue = year.get(millis); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35392);int yearOfEraValue = yearOfEra.get(millis); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35393);int monthLen = dayOfMonth.getMaximumValue(millis); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35394);if ((((monthValue < 1 || monthValue > 13)&&(__CLR4_4_1r7mr7mlc8axepi.R.iget(35395)!=0|true))||(__CLR4_4_1r7mr7mlc8axepi.R.iget(35396)==0&false))) {{ 
             __CLR4_4_1r7mr7mlc8axepi.R.inc(35397);fail("Bad month: " + millis); 
         } 
         }__CLR4_4_1r7mr7mlc8axepi.R.inc(35398);assertEquals(1, era.get(millis)); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35399);assertEquals("EE", era.getAsText(millis)); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35400);assertEquals("EE", era.getAsShortText(millis)); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35401);assertEquals(expectedYear, yearValue); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35402);assertEquals(expectedYear, yearOfEraValue); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35403);assertEquals(expectedMonth, monthValue); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35404);assertEquals(expectedDay, dayValue); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35405);assertEquals(expectedDOW, dowValue); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35406);assertEquals(expectedDOY, doyValue); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35407);assertEquals(yearValue % 4 == 3, year.isLeap(millis)); 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35408);if ((((monthValue == 13)&&(__CLR4_4_1r7mr7mlc8axepi.R.iget(35409)!=0|true))||(__CLR4_4_1r7mr7mlc8axepi.R.iget(35410)==0&false))) {{ 
             __CLR4_4_1r7mr7mlc8axepi.R.inc(35411);assertEquals(yearValue % 4 == 3, monthOfYear.isLeap(millis)); 
             __CLR4_4_1r7mr7mlc8axepi.R.inc(35412);if ((((yearValue % 4 == 3)&&(__CLR4_4_1r7mr7mlc8axepi.R.iget(35413)!=0|true))||(__CLR4_4_1r7mr7mlc8axepi.R.iget(35414)==0&false))) {{ 
                 __CLR4_4_1r7mr7mlc8axepi.R.inc(35415);assertEquals(6, monthLen); 
             } }else {{ 
                 __CLR4_4_1r7mr7mlc8axepi.R.inc(35416);assertEquals(5, monthLen); 
             } 
         }} }else {{ 
             __CLR4_4_1r7mr7mlc8axepi.R.inc(35417);assertEquals(30, monthLen); 
         } 
         }__CLR4_4_1r7mr7mlc8axepi.R.inc(35418);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1; 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35419);expectedDay++; 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35420);expectedDOY++; 
         __CLR4_4_1r7mr7mlc8axepi.R.inc(35421);if ((((expectedDay == 31 && expectedMonth < 13)&&(__CLR4_4_1r7mr7mlc8axepi.R.iget(35422)!=0|true))||(__CLR4_4_1r7mr7mlc8axepi.R.iget(35423)==0&false))) {{ 
             __CLR4_4_1r7mr7mlc8axepi.R.inc(35424);expectedDay = 1; 
             __CLR4_4_1r7mr7mlc8axepi.R.inc(35425);expectedMonth++; 
         } }else {__CLR4_4_1r7mr7mlc8axepi.R.inc(35426);if ((((expectedMonth == 13)&&(__CLR4_4_1r7mr7mlc8axepi.R.iget(35427)!=0|true))||(__CLR4_4_1r7mr7mlc8axepi.R.iget(35428)==0&false))) {{ 
             __CLR4_4_1r7mr7mlc8axepi.R.inc(35429);if ((((expectedYear % 4 == 3 && expectedDay == 7)&&(__CLR4_4_1r7mr7mlc8axepi.R.iget(35430)!=0|true))||(__CLR4_4_1r7mr7mlc8axepi.R.iget(35431)==0&false))) {{ 
                 __CLR4_4_1r7mr7mlc8axepi.R.inc(35432);expectedDay = 1; 
                 __CLR4_4_1r7mr7mlc8axepi.R.inc(35433);expectedMonth = 1; 
                 __CLR4_4_1r7mr7mlc8axepi.R.inc(35434);expectedYear++; 
                 __CLR4_4_1r7mr7mlc8axepi.R.inc(35435);expectedDOY = 1; 
             } }else {__CLR4_4_1r7mr7mlc8axepi.R.inc(35436);if ((((expectedYear % 4 != 3 && expectedDay == 6)&&(__CLR4_4_1r7mr7mlc8axepi.R.iget(35437)!=0|true))||(__CLR4_4_1r7mr7mlc8axepi.R.iget(35438)==0&false))) {{ 
                 __CLR4_4_1r7mr7mlc8axepi.R.inc(35439);expectedDay = 1; 
                 __CLR4_4_1r7mr7mlc8axepi.R.inc(35440);expectedMonth = 1; 
                 __CLR4_4_1r7mr7mlc8axepi.R.inc(35441);expectedYear++; 
                 __CLR4_4_1r7mr7mlc8axepi.R.inc(35442);expectedDOY = 1; 
             } 
         }}} 
         }}__CLR4_4_1r7mr7mlc8axepi.R.inc(35443);millis += SKIP; 
     } 
 }}finally{__CLR4_4_1r7mr7mlc8axepi.R.flushNeeded();}} 


public void testSampleDateWithZone938() {__CLR4_4_1r7mr7mlc8axepi.R.globalSliceStart(getClass().getName(),35444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oigeifrck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r7mr7mlc8axepi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r7mr7mlc8axepi.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testSampleDateWithZone938",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oigeifrck(){try{__CLR4_4_1r7mr7mlc8axepi.R.inc(35444); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35445);DateTime dt = new DateTime(2004, 6, 9, 12, 0, 0, 0, PARIS).withChronology(ETHIOPIC_UTC); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35446);assertEquals(EthiopicChronology.EE, dt.getEra()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35447);assertEquals(1996, dt.getYear()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35448);assertEquals(1996, dt.getYearOfEra()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35449);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35450);assertEquals(2, dt.getDayOfMonth()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35451);assertEquals(10, dt.getHourOfDay()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35452);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35453);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35454);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1r7mr7mlc8axepi.R.flushNeeded();}} 


public void testDurationMonth1427() {__CLR4_4_1r7mr7mlc8axepi.R.globalSliceStart(getClass().getName(),35455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w886vrcv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r7mr7mlc8axepi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r7mr7mlc8axepi.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationMonth1427",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w886vrcv(){try{__CLR4_4_1r7mr7mlc8axepi.R.inc(35455); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35456);DateTime dt11 = new DateTime(1999, 11, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35457);DateTime dt12 = new DateTime(1999, 12, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35458);DateTime dt13 = new DateTime(1999, 13, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35459);DateTime dt01 = new DateTime(2000, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35460);DurationField fld = dt11.monthOfYear().getDurationField(); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35461);assertEquals(ETHIOPIC_UTC.months(), fld); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35462);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35463);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35464);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35465);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35466);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35467);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35468);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35469);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35470);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35471);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35472);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35473);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35474);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35475);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35476);assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35477);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35478);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35479);assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35480);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35481);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35482);assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35483);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35484);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35485);assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35486);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35487);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35488);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35489);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35490);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35491);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35492);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L)); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35493);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L)); 
 }finally{__CLR4_4_1r7mr7mlc8axepi.R.flushNeeded();}} 


public void testFactory_Zone1447() {__CLR4_4_1r7mr7mlc8axepi.R.globalSliceStart(getClass().getName(),35494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11reowrdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r7mr7mlc8axepi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r7mr7mlc8axepi.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testFactory_Zone1447",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11reowrdy(){try{__CLR4_4_1r7mr7mlc8axepi.R.inc(35494); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35495);assertEquals(TOKYO, EthiopicChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35496);assertEquals(PARIS, EthiopicChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35497);assertEquals(LONDON, EthiopicChronology.getInstance(null).getZone()); 
     __CLR4_4_1r7mr7mlc8axepi.R.inc(35498);assertSame(EthiopicChronology.class, EthiopicChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1r7mr7mlc8axepi.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

}
