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
public class TestEthiopicChronology extends TestCase {static class __CLR4_4_1pofpofle6qsfea{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,33443,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1pofpofle6qsfea.R.inc(33279);
        __CLR4_4_1pofpofle6qsfea.R.inc(33280);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pofpofle6qsfea.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pofpofle6qsfea.R.inc(33281);
        __CLR4_4_1pofpofle6qsfea.R.inc(33282);SKIP = 1 * MILLIS_PER_DAY;
        __CLR4_4_1pofpofle6qsfea.R.inc(33283);return new TestSuite(TestEthiopicChronology.class);
    }finally{__CLR4_4_1pofpofle6qsfea.R.flushNeeded();}}

    public TestEthiopicChronology(String name) {
        super(name);__CLR4_4_1pofpofle6qsfea.R.inc(33285);try{__CLR4_4_1pofpofle6qsfea.R.inc(33284);
    }finally{__CLR4_4_1pofpofle6qsfea.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pofpofle6qsfea.R.inc(33286);
        __CLR4_4_1pofpofle6qsfea.R.inc(33287);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pofpofle6qsfea.R.inc(33288);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pofpofle6qsfea.R.inc(33289);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pofpofle6qsfea.R.inc(33290);originalLocale = Locale.getDefault();
        __CLR4_4_1pofpofle6qsfea.R.inc(33291);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pofpofle6qsfea.R.inc(33292);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pofpofle6qsfea.R.inc(33293);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pofpofle6qsfea.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pofpofle6qsfea.R.inc(33294);
        __CLR4_4_1pofpofle6qsfea.R.inc(33295);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pofpofle6qsfea.R.inc(33296);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pofpofle6qsfea.R.inc(33297);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pofpofle6qsfea.R.inc(33298);Locale.setDefault(originalLocale);
        __CLR4_4_1pofpofle6qsfea.R.inc(33299);originalDateTimeZone = null;
        __CLR4_4_1pofpofle6qsfea.R.inc(33300);originalTimeZone = null;
        __CLR4_4_1pofpofle6qsfea.R.inc(33301);originalLocale = null;
    }finally{__CLR4_4_1pofpofle6qsfea.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testDurationMonth273() {__CLR4_4_1pofpofle6qsfea.R.globalSliceStart(getClass().getName(),33302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afjlffpp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pofpofle6qsfea.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pofpofle6qsfea.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationMonth273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afjlffpp2(){try{__CLR4_4_1pofpofle6qsfea.R.inc(33302); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33303);DateTime dt11 = new DateTime(1999, 11, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33304);DateTime dt12 = new DateTime(1999, 12, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33305);DateTime dt13 = new DateTime(1999, 13, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33306);DateTime dt01 = new DateTime(2000, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33307);DurationField fld = dt11.monthOfYear().getDurationField(); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33308);assertEquals(ETHIOPIC_UTC.months(), fld); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33309);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33310);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33311);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33312);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33313);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1)); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33314);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2)); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33315);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13)); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33316);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33317);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33318);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33319);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33320);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L)); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33321);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L)); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33322);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L)); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33323);assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33324);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33325);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33326);assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33327);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33328);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33329);assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33330);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33331);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33332);assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33333);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33334);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33335);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1)); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33336);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2)); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33337);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3)); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33338);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L)); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33339);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L)); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33340);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L)); 
 }finally{__CLR4_4_1pofpofle6qsfea.R.flushNeeded();}} 


public void testWithUTC739() {__CLR4_4_1pofpofle6qsfea.R.globalSliceStart(getClass().getName(),33341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qfa0opq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pofpofle6qsfea.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pofpofle6qsfea.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testWithUTC739",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qfa0opq5(){try{__CLR4_4_1pofpofle6qsfea.R.inc(33341); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33342);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33343);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33344);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33345);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance().withUTC()); 
 }finally{__CLR4_4_1pofpofle6qsfea.R.flushNeeded();}} 


public void testFactory_Zone740() {__CLR4_4_1pofpofle6qsfea.R.globalSliceStart(getClass().getName(),33346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17rmexpqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pofpofle6qsfea.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pofpofle6qsfea.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testFactory_Zone740",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17rmexpqa(){try{__CLR4_4_1pofpofle6qsfea.R.inc(33346); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33347);assertEquals(TOKYO, EthiopicChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33348);assertEquals(PARIS, EthiopicChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33349);assertEquals(LONDON, EthiopicChronology.getInstance(null).getZone()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33350);assertSame(EthiopicChronology.class, EthiopicChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1pofpofle6qsfea.R.flushNeeded();}} 


public void testCalendar741() {__CLR4_4_1pofpofle6qsfea.R.globalSliceStart(getClass().getName(),33351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dc4t9xpqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pofpofle6qsfea.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pofpofle6qsfea.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testCalendar741",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dc4t9xpqf(){try{__CLR4_4_1pofpofle6qsfea.R.inc(33351); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33352);if ((((TestAll.FAST)&&(__CLR4_4_1pofpofle6qsfea.R.iget(33353)!=0|true))||(__CLR4_4_1pofpofle6qsfea.R.iget(33354)==0&false))) {{ 
         __CLR4_4_1pofpofle6qsfea.R.inc(33355);return; 
     } 
     }__CLR4_4_1pofpofle6qsfea.R.inc(33356);System.out.println("\nTestEthiopicChronology.testCalendar"); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33357);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ETHIOPIC_UTC); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33358);long millis = epoch.getMillis(); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33359);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis(); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33360);DateTimeField dayOfWeek = ETHIOPIC_UTC.dayOfWeek(); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33361);DateTimeField dayOfYear = ETHIOPIC_UTC.dayOfYear(); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33362);DateTimeField dayOfMonth = ETHIOPIC_UTC.dayOfMonth(); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33363);DateTimeField monthOfYear = ETHIOPIC_UTC.monthOfYear(); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33364);DateTimeField year = ETHIOPIC_UTC.year(); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33365);DateTimeField yearOfEra = ETHIOPIC_UTC.yearOfEra(); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33366);DateTimeField era = ETHIOPIC_UTC.era(); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33367);int expectedDOW = new DateTime(8, 8, 29, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek(); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33368);int expectedDOY = 1; 
     __CLR4_4_1pofpofle6qsfea.R.inc(33369);int expectedDay = 1; 
     __CLR4_4_1pofpofle6qsfea.R.inc(33370);int expectedMonth = 1; 
     __CLR4_4_1pofpofle6qsfea.R.inc(33371);int expectedYear = 1; 
     __CLR4_4_1pofpofle6qsfea.R.inc(33372);while ((((millis < end)&&(__CLR4_4_1pofpofle6qsfea.R.iget(33373)!=0|true))||(__CLR4_4_1pofpofle6qsfea.R.iget(33374)==0&false))) {{ 
         __CLR4_4_1pofpofle6qsfea.R.inc(33375);int dowValue = dayOfWeek.get(millis); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33376);int doyValue = dayOfYear.get(millis); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33377);int dayValue = dayOfMonth.get(millis); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33378);int monthValue = monthOfYear.get(millis); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33379);int yearValue = year.get(millis); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33380);int yearOfEraValue = yearOfEra.get(millis); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33381);int monthLen = dayOfMonth.getMaximumValue(millis); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33382);if ((((monthValue < 1 || monthValue > 13)&&(__CLR4_4_1pofpofle6qsfea.R.iget(33383)!=0|true))||(__CLR4_4_1pofpofle6qsfea.R.iget(33384)==0&false))) {{ 
             __CLR4_4_1pofpofle6qsfea.R.inc(33385);fail("Bad month: " + millis); 
         } 
         }__CLR4_4_1pofpofle6qsfea.R.inc(33386);assertEquals(1, era.get(millis)); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33387);assertEquals("EE", era.getAsText(millis)); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33388);assertEquals("EE", era.getAsShortText(millis)); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33389);assertEquals(expectedYear, yearValue); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33390);assertEquals(expectedYear, yearOfEraValue); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33391);assertEquals(expectedMonth, monthValue); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33392);assertEquals(expectedDay, dayValue); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33393);assertEquals(expectedDOW, dowValue); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33394);assertEquals(expectedDOY, doyValue); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33395);assertEquals(yearValue % 4 == 3, year.isLeap(millis)); 
         __CLR4_4_1pofpofle6qsfea.R.inc(33396);if ((((monthValue == 13)&&(__CLR4_4_1pofpofle6qsfea.R.iget(33397)!=0|true))||(__CLR4_4_1pofpofle6qsfea.R.iget(33398)==0&false))) {{ 
             __CLR4_4_1pofpofle6qsfea.R.inc(33399);assertEquals(yearValue % 4 == 3, monthOfYear.isLeap(millis)); 
             __CLR4_4_1pofpofle6qsfea.R.inc(33400);if ((((yearValue % 4 == 3)&&(__CLR4_4_1pofpofle6qsfea.R.iget(33401)!=0|true))||(__CLR4_4_1pofpofle6qsfea.R.iget(33402)==0&false))) {{ 
                 __CLR4_4_1pofpofle6qsfea.R.inc(33403);assertEquals(6, monthLen); 
             } }else {{ 
                 __CLR4_4_1pofpofle6qsfea.R.inc(33404);assertEquals(5, monthLen); 
             } 
         }} }else {{ 
             __CLR4_4_1pofpofle6qsfea.R.inc(33405);assertEquals(30, monthLen); 
         } 
         }__CLR4_4_1pofpofle6qsfea.R.inc(33406);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1; 
         __CLR4_4_1pofpofle6qsfea.R.inc(33407);expectedDay++; 
         __CLR4_4_1pofpofle6qsfea.R.inc(33408);expectedDOY++; 
         __CLR4_4_1pofpofle6qsfea.R.inc(33409);if ((((expectedDay == 31 && expectedMonth < 13)&&(__CLR4_4_1pofpofle6qsfea.R.iget(33410)!=0|true))||(__CLR4_4_1pofpofle6qsfea.R.iget(33411)==0&false))) {{ 
             __CLR4_4_1pofpofle6qsfea.R.inc(33412);expectedDay = 1; 
             __CLR4_4_1pofpofle6qsfea.R.inc(33413);expectedMonth++; 
         } }else {__CLR4_4_1pofpofle6qsfea.R.inc(33414);if ((((expectedMonth == 13)&&(__CLR4_4_1pofpofle6qsfea.R.iget(33415)!=0|true))||(__CLR4_4_1pofpofle6qsfea.R.iget(33416)==0&false))) {{ 
             __CLR4_4_1pofpofle6qsfea.R.inc(33417);if ((((expectedYear % 4 == 3 && expectedDay == 7)&&(__CLR4_4_1pofpofle6qsfea.R.iget(33418)!=0|true))||(__CLR4_4_1pofpofle6qsfea.R.iget(33419)==0&false))) {{ 
                 __CLR4_4_1pofpofle6qsfea.R.inc(33420);expectedDay = 1; 
                 __CLR4_4_1pofpofle6qsfea.R.inc(33421);expectedMonth = 1; 
                 __CLR4_4_1pofpofle6qsfea.R.inc(33422);expectedYear++; 
                 __CLR4_4_1pofpofle6qsfea.R.inc(33423);expectedDOY = 1; 
             } }else {__CLR4_4_1pofpofle6qsfea.R.inc(33424);if ((((expectedYear % 4 != 3 && expectedDay == 6)&&(__CLR4_4_1pofpofle6qsfea.R.iget(33425)!=0|true))||(__CLR4_4_1pofpofle6qsfea.R.iget(33426)==0&false))) {{ 
                 __CLR4_4_1pofpofle6qsfea.R.inc(33427);expectedDay = 1; 
                 __CLR4_4_1pofpofle6qsfea.R.inc(33428);expectedMonth = 1; 
                 __CLR4_4_1pofpofle6qsfea.R.inc(33429);expectedYear++; 
                 __CLR4_4_1pofpofle6qsfea.R.inc(33430);expectedDOY = 1; 
             } 
         }}} 
         }}__CLR4_4_1pofpofle6qsfea.R.inc(33431);millis += SKIP; 
     } 
 }}finally{__CLR4_4_1pofpofle6qsfea.R.flushNeeded();}} 


public void testSampleDateWithZone742() {__CLR4_4_1pofpofle6qsfea.R.globalSliceStart(getClass().getName(),33432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0vwzkpso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pofpofle6qsfea.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pofpofle6qsfea.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testSampleDateWithZone742",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0vwzkpso(){try{__CLR4_4_1pofpofle6qsfea.R.inc(33432); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33433);DateTime dt = new DateTime(2004, 6, 9, 12, 0, 0, 0, PARIS).withChronology(ETHIOPIC_UTC); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33434);assertEquals(EthiopicChronology.EE, dt.getEra()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33435);assertEquals(1996, dt.getYear()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33436);assertEquals(1996, dt.getYearOfEra()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33437);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33438);assertEquals(2, dt.getDayOfMonth()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33439);assertEquals(10, dt.getHourOfDay()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33440);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33441);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1pofpofle6qsfea.R.inc(33442);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1pofpofle6qsfea.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

}
