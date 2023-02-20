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

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.Period;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for GJChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGJChronology extends TestCase {static class __CLR4_4_1k91k91le6np4ow{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,26352,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1k91k91le6np4ow.R.inc(26245);
        __CLR4_4_1k91k91le6np4ow.R.inc(26246);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k91k91le6np4ow.R.inc(26247);
        __CLR4_4_1k91k91le6np4ow.R.inc(26248);return new TestSuite(TestGJChronology.class);
    }finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}

    public TestGJChronology(String name) {
        super(name);__CLR4_4_1k91k91le6np4ow.R.inc(26250);try{__CLR4_4_1k91k91le6np4ow.R.inc(26249);
    }finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k91k91le6np4ow.R.inc(26251);
        __CLR4_4_1k91k91le6np4ow.R.inc(26252);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1k91k91le6np4ow.R.inc(26253);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1k91k91le6np4ow.R.inc(26254);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1k91k91le6np4ow.R.inc(26255);originalLocale = Locale.getDefault();
        __CLR4_4_1k91k91le6np4ow.R.inc(26256);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1k91k91le6np4ow.R.inc(26257);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1k91k91le6np4ow.R.inc(26258);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k91k91le6np4ow.R.inc(26259);
        __CLR4_4_1k91k91le6np4ow.R.inc(26260);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k91k91le6np4ow.R.inc(26261);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1k91k91le6np4ow.R.inc(26262);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1k91k91le6np4ow.R.inc(26263);Locale.setDefault(originalLocale);
        __CLR4_4_1k91k91le6np4ow.R.inc(26264);originalDateTimeZone = null;
        __CLR4_4_1k91k91le6np4ow.R.inc(26265);originalTimeZone = null;
        __CLR4_4_1k91k91le6np4ow.R.inc(26266);originalLocale = null;
    }finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testLeapYearRulesConstruction39() {__CLR4_4_1k91k91le6np4ow.R.globalSliceStart(getClass().getName(),26267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1syuxmqk9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k91k91le6np4ow.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k91k91le6np4ow.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstruction39",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1syuxmqk9n(){try{__CLR4_4_1k91k91le6np4ow.R.inc(26267); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26268);DateMidnight dt = new DateMidnight(1500, 2, 29, GJChronology.getInstanceUTC()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26269);assertEquals(dt.getYear(), 1500); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26270);assertEquals(dt.getMonthOfYear(), 2); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26271);assertEquals(dt.getDayOfMonth(), 29); 
 }finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}
public void testIllegalDates40() {__CLR4_4_1k91k91le6np4ow.R.globalSliceStart(getClass().getName(),26272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gnw3ok9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k91k91le6np4ow.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k91k91le6np4ow.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testIllegalDates40",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gnw3ok9s(){try{__CLR4_4_1k91k91le6np4ow.R.inc(26272); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26273);try { 
         __CLR4_4_1k91k91le6np4ow.R.inc(26274);new DateTime(1582, 10, 5, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC)); 
         __CLR4_4_1k91k91le6np4ow.R.inc(26275);fail("Constructed illegal date"); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1k91k91le6np4ow.R.inc(26276);try { 
         __CLR4_4_1k91k91le6np4ow.R.inc(26277);new DateTime(1582, 10, 14, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC)); 
         __CLR4_4_1k91k91le6np4ow.R.inc(26278);fail("Constructed illegal date"); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}
public void testToString41() {__CLR4_4_1k91k91le6np4ow.R.globalSliceStart(getClass().getName(),26279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v3b6dak9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k91k91le6np4ow.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k91k91le6np4ow.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testToString41",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v3b6dak9z(){try{__CLR4_4_1k91k91le6np4ow.R.inc(26279); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26280);DateTimeZone paris = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26281);ISOChronology isoParis = ISOChronology.getInstance(paris); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26282);assertEquals("GJChronology[Europe/Paris]", isoParis.toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26283);assertEquals("GJChronology[Europe/Paris]", GJChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26284);assertEquals("GJChronology[Europe/Paris]", GJChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26285);assertEquals("JulianChronology[Europe/Paris]", JulianChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26286);assertEquals("BuddhistChronology[Europe/Paris]", BuddhistChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26287);assertEquals("CopticChronology[Europe/Paris]", CopticChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26288);assertEquals("EthiopicChronology[Europe/Paris]", EthiopicChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26289);assertEquals("IslamicChronology[Europe/Paris]", IslamicChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26290);assertEquals("LenientChronology[ISOChronology[Europe/Paris]]", LenientChronology.getInstance(isoParis).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26291);assertEquals("StrictChronology[ISOChronology[Europe/Paris]]", StrictChronology.getInstance(isoParis).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26292);assertEquals("LimitChronology[ISOChronology[Europe/Paris], NoLimit, NoLimit]", LimitChronology.getInstance(isoParis, null, null).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26293);assertEquals("ZonedChronology[ISOChronology[UTC], Europe/Paris]", ZonedChronology.getInstance(isoParis, paris).toString()); 
 }finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}
public void testToString42() {__CLR4_4_1k91k91le6np4ow.R.globalSliceStart(getClass().getName(),26294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rub7ktkae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k91k91le6np4ow.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k91k91le6np4ow.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testToString42",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rub7ktkae(){try{__CLR4_4_1k91k91le6np4ow.R.inc(26294); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26295);assertEquals("GJChronology[Europe/London]", GJChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26296);assertEquals("GJChronology[Asia/Tokyo]", GJChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26297);assertEquals("GJChronology[Europe/London]", GJChronology.getInstance().toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26298);assertEquals("GJChronology[UTC]", GJChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}
public void testToString43() {__CLR4_4_1k91k91le6np4ow.R.globalSliceStart(getClass().getName(),26299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1olb8sckaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k91k91le6np4ow.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k91k91le6np4ow.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testToString43",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1olb8sckaj(){try{__CLR4_4_1k91k91le6np4ow.R.inc(26299); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26300);DateTimeZone paris = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26301);ISOChronology isoParis = ISOChronology.getInstance(paris); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26302);assertEquals("ISOChronology[Europe/Paris]", isoParis.toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26303);assertEquals("GJChronology[Europe/Paris]", GJChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26304);assertEquals("GregorianChronology[Europe/Paris]", GregorianChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26305);assertEquals("JulianChronology[Europe/Paris]", JulianChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26306);assertEquals("BuddhistChronology[Europe/Paris]", BuddhistChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26307);assertEquals("CopticChronology[Europe/Paris]", CopticChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26308);assertEquals("EthiopicChronology[Europe/Paris]", EthiopicChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26309);assertEquals("IslamicChronology[Europe/Paris]", IslamicChronology.getInstance(paris).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26310);assertEquals("LenientChronology[ISOChronology[Europe/Paris]]", LenientChronology.getInstance(isoParis).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26311);assertEquals("StrictChronology[ISOChronology[Europe/Paris]]", StrictChronology.getInstance(isoParis).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26312);assertEquals("LimitChronology[ISOChronology[Europe/Paris], NoLimit, NoLimit]", LimitChronology.getInstance(isoParis, null, null).toString()); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26313);assertEquals("ZonedChronology[ISOChronology[UTC], Europe/Paris]", ZonedChronology.getInstance(isoParis, paris).toString()); 
 }finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}
public void testSubtractDays44() {__CLR4_4_1k91k91le6np4ow.R.globalSliceStart(getClass().getName(),26314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1quzpwckay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k91k91le6np4ow.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k91k91le6np4ow.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testSubtractDays44",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1quzpwckay(){try{__CLR4_4_1k91k91le6np4ow.R.inc(26314); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26315);DateTime dt = new DateTime(1112306400000L, GJChronology.getInstance(DateTimeZone.forID("Europe/Berlin"))); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26316);YearMonthDay ymd = dt.toYearMonthDay(); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26317);while ((((ymd.toDateTimeAtMidnight().getDayOfWeek() != DateTimeConstants.MONDAY)&&(__CLR4_4_1k91k91le6np4ow.R.iget(26318)!=0|true))||(__CLR4_4_1k91k91le6np4ow.R.iget(26319)==0&false))) {{ 
         __CLR4_4_1k91k91le6np4ow.R.inc(26320);ymd = ymd.minus(Period.days(1)); 
     } 
 }}finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}
public void testCutoverAddMonths50() {__CLR4_4_1k91k91le6np4ow.R.globalSliceStart(getClass().getName(),26321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14k4v2mkb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k91k91le6np4ow.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k91k91le6np4ow.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddMonths50",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14k4v2mkb5(){try{__CLR4_4_1k91k91le6np4ow.R.inc(26321); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26322);testAdd("1582-01-01", DurationFieldType.months(), 1, "1582-02-01"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26323);testAdd("1582-01-01", DurationFieldType.months(), 6, "1582-07-01"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26324);testAdd("1582-01-01", DurationFieldType.months(), 12, "1583-01-01"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26325);testAdd("1582-11-15", DurationFieldType.months(), 1, "1582-12-15"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26326);testAdd("1582-09-04", DurationFieldType.months(), 2, "1582-11-04"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26327);testAdd("1582-09-05", DurationFieldType.months(), 2, "1582-11-05"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26328);testAdd("1582-09-15", DurationFieldType.months(), 2, "1582-11-15"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26329);testAdd("1582-09-15", DurationFieldType.months(), 2, "1582-11-15"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26330);testAdd("1580-01-01", DurationFieldType.months(), 48, "1584-01-01"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26331);testAdd("1580-02-29", DurationFieldType.months(), 48, "1584-02-29"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26332);testAdd("1580-10-01", DurationFieldType.months(), 48, "1584-10-01"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26333);testAdd("1580-10-10", DurationFieldType.months(), 48, "1584-10-10"); 
     __CLR4_4_1k91k91le6np4ow.R.inc(26334);testAdd("1580-12-31", DurationFieldType.months(), 48, "1584-12-31"); 
 }finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {try{__CLR4_4_1k91k91le6np4ow.R.inc(26335);
        __CLR4_4_1k91k91le6np4ow.R.inc(26336);assertEquals(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                     new DateTime(year, month, day, hour, minute, second, millis,
                                  GJChronology.getInstance(DateTimeZone.UTC)));
    }finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}

    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1k91k91le6np4ow.R.inc(26337);
        __CLR4_4_1k91k91le6np4ow.R.inc(26338);DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1k91k91le6np4ow.R.inc(26339);DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1k91k91le6np4ow.R.inc(26340);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1k91k91le6np4ow.R.inc(26341);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1k91k91le6np4ow.R.inc(26342);DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1k91k91le6np4ow.R.inc(26343);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1k91k91le6np4ow.R.inc(26344);assertEquals(amt, diff);
        
        __CLR4_4_1k91k91le6np4ow.R.inc(26345);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1k91k91le6np4ow.R.iget(26346)!=0|true))||(__CLR4_4_1k91k91le6np4ow.R.iget(26347)==0&false))) {{
            __CLR4_4_1k91k91le6np4ow.R.inc(26348);YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1k91k91le6np4ow.R.inc(26349);YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1k91k91le6np4ow.R.inc(26350);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1k91k91le6np4ow.R.inc(26351);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1k91k91le6np4ow.R.flushNeeded();}}

    

    

    

    

    

}
