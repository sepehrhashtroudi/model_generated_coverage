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
public class TestGJChronology extends TestCase {static class __CLR4_4_1pszpszle6qsfej{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,33563,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1pszpszle6qsfej.R.inc(33443);
        __CLR4_4_1pszpszle6qsfej.R.inc(33444);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pszpszle6qsfej.R.inc(33445);
        __CLR4_4_1pszpszle6qsfej.R.inc(33446);return new TestSuite(TestGJChronology.class);
    }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}}

    public TestGJChronology(String name) {
        super(name);__CLR4_4_1pszpszle6qsfej.R.inc(33448);try{__CLR4_4_1pszpszle6qsfej.R.inc(33447);
    }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pszpszle6qsfej.R.inc(33449);
        __CLR4_4_1pszpszle6qsfej.R.inc(33450);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pszpszle6qsfej.R.inc(33451);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pszpszle6qsfej.R.inc(33452);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pszpszle6qsfej.R.inc(33453);originalLocale = Locale.getDefault();
        __CLR4_4_1pszpszle6qsfej.R.inc(33454);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pszpszle6qsfej.R.inc(33455);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pszpszle6qsfej.R.inc(33456);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pszpszle6qsfej.R.inc(33457);
        __CLR4_4_1pszpszle6qsfej.R.inc(33458);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pszpszle6qsfej.R.inc(33459);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pszpszle6qsfej.R.inc(33460);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pszpszle6qsfej.R.inc(33461);Locale.setDefault(originalLocale);
        __CLR4_4_1pszpszle6qsfej.R.inc(33462);originalDateTimeZone = null;
        __CLR4_4_1pszpszle6qsfej.R.inc(33463);originalTimeZone = null;
        __CLR4_4_1pszpszle6qsfej.R.inc(33464);originalLocale = null;
    }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_Zone_RI97() {__CLR4_4_1pszpszle6qsfej.R.globalSliceStart(getClass().getName(),33465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xxru3cptl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pszpszle6qsfej.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pszpszle6qsfej.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone_RI97",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xxru3cptl(){try{__CLR4_4_1pszpszle6qsfej.R.inc(33465); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33466);GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L)); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33467);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33468);assertEquals(new Instant(0L), chrono.getGregorianCutover()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33469);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, new Instant(0L)).getClass()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33470);DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33471);chrono = GJChronology.getInstance(TOKYO, null); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33472);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33473);assertEquals(cutover.toInstant(), chrono.getGregorianCutover()); 
 }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}} 


public void testLeapYearRulesConstructionInvalid100() {__CLR4_4_1pszpszle6qsfej.R.globalSliceStart(getClass().getName(),33474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1if7htaptu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pszpszle6qsfej.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pszpszle6qsfej.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstructionInvalid100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1if7htaptu(){try{__CLR4_4_1pszpszle6qsfej.R.inc(33474); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33475);try { 
         __CLR4_4_1pszpszle6qsfej.R.inc(33476);new DateMidnight(1500, 2, 30, GJChronology.getInstanceUTC()); 
         __CLR4_4_1pszpszle6qsfej.R.inc(33477);fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}} 


public void testLeapYearRulesConstruction101() {__CLR4_4_1pszpszle6qsfej.R.globalSliceStart(getClass().getName(),33478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1etlfpkpty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pszpszle6qsfej.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pszpszle6qsfej.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstruction101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1etlfpkpty(){try{__CLR4_4_1pszpszle6qsfej.R.inc(33478); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33479);DateMidnight dt = new DateMidnight(1500, 2, 29, GJChronology.getInstanceUTC()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33480);assertEquals(dt.getYear(), 1500); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33481);assertEquals(dt.getMonthOfYear(), 2); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33482);assertEquals(dt.getDayOfMonth(), 29); 
 }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}} 


public void testIllegalDates102() {__CLR4_4_1pszpszle6qsfej.R.globalSliceStart(getClass().getName(),33483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1clzbifpu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pszpszle6qsfej.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pszpszle6qsfej.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testIllegalDates102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1clzbifpu3(){try{__CLR4_4_1pszpszle6qsfej.R.inc(33483); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33484);try { 
         __CLR4_4_1pszpszle6qsfej.R.inc(33485);new DateTime(1582, 10, 5, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC)); 
         __CLR4_4_1pszpszle6qsfej.R.inc(33486);fail("Constructed illegal date"); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1pszpszle6qsfej.R.inc(33487);try { 
         __CLR4_4_1pszpszle6qsfej.R.inc(33488);new DateTime(1582, 10, 14, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC)); 
         __CLR4_4_1pszpszle6qsfej.R.inc(33489);fail("Constructed illegal date"); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}} 


public void testToString104() {__CLR4_4_1pszpszle6qsfej.R.globalSliceStart(getClass().getName(),33490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eh0fiapua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pszpszle6qsfej.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pszpszle6qsfej.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testToString104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eh0fiapua(){try{__CLR4_4_1pszpszle6qsfej.R.inc(33490); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33491);assertEquals("GJChronology[Europe/London]", GJChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33492);assertEquals("GJChronology[Asia/Tokyo]", GJChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33493);assertEquals("GJChronology[Europe/London]", GJChronology.getInstance().toString()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33494);assertEquals("GJChronology[UTC]", GJChronology.getInstanceUTC().toString()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33495);assertEquals("GJChronology[UTC,cutover=1970-01-01]", GJChronology.getInstance(DateTimeZone.UTC, 0L, 4).toString()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33496);assertEquals("GJChronology[UTC,cutover=1970-01-01T00:00:00.001Z,mdfw=2]", GJChronology.getInstance(DateTimeZone.UTC, 1L, 2).toString()); 
 }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}} 


public void testCutoverAddWeekyears106() {__CLR4_4_1pszpszle6qsfej.R.globalSliceStart(getClass().getName(),33497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wqu1puh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pszpszle6qsfej.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pszpszle6qsfej.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddWeekyears106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wqu1puh(){try{__CLR4_4_1pszpszle6qsfej.R.inc(33497); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33498);testAdd("1582-W01-1", DurationFieldType.weekyears(), 1, "1583-W01-1"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33499);testAdd("1582-W39-1", DurationFieldType.weekyears(), 1, "1583-W39-1"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33500);testAdd("1583-W45-1", DurationFieldType.weekyears(), 1, "1584-W45-1"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33501);testAdd("1580-W01-1", DurationFieldType.weekyears(), 4, "1584-W01-1"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33502);testAdd("1580-W30-7", DurationFieldType.weekyears(), 4, "1584-W30-7"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33503);testAdd("1580-W50-7", DurationFieldType.weekyears(), 4, "1584-W50-7"); 
 }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}} 


public void testPartialGetAsText107() {__CLR4_4_1pszpszle6qsfej.R.globalSliceStart(getClass().getName(),33504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqx5rbpuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pszpszle6qsfej.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pszpszle6qsfej.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testPartialGetAsText107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqx5rbpuo(){try{__CLR4_4_1pszpszle6qsfej.R.inc(33504); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33505);GJChronology chrono = GJChronology.getInstance(TOKYO); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33506);assertEquals("January", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsText()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33507);assertEquals("Jan", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsShortText()); 
 }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}} 


public void testTimeOfDayAdd110() {__CLR4_4_1pszpszle6qsfej.R.globalSliceStart(getClass().getName(),33508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vupp0kpus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pszpszle6qsfej.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pszpszle6qsfej.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testTimeOfDayAdd110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vupp0kpus(){try{__CLR4_4_1pszpszle6qsfej.R.inc(33508); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33509);TimeOfDay start = new TimeOfDay(12, 30, GJChronology.getInstance()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33510);TimeOfDay end = new TimeOfDay(10, 30, GJChronology.getInstance()); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33511);assertEquals(end, start.plusHours(22)); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33512);assertEquals(start, end.minusHours(22)); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33513);assertEquals(end, start.plusMinutes(22 * 60)); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33514);assertEquals(start, end.minusMinutes(22 * 60)); 
 }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}} 


public void testCutoverAddYears111() {__CLR4_4_1pszpszle6qsfej.R.globalSliceStart(getClass().getName(),33515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sh6lz3puz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pszpszle6qsfej.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pszpszle6qsfej.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddYears111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sh6lz3puz(){try{__CLR4_4_1pszpszle6qsfej.R.inc(33515); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33516);testAdd("1582-01-01", DurationFieldType.years(), 1, "1583-01-01"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33517);testAdd("1582-02-15", DurationFieldType.years(), 1, "1583-02-15"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33518);testAdd("1582-02-28", DurationFieldType.years(), 1, "1583-02-28"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33519);testAdd("1582-03-01", DurationFieldType.years(), 1, "1583-03-01"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33520);testAdd("1582-09-30", DurationFieldType.years(), 1, "1583-09-30"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33521);testAdd("1582-10-01", DurationFieldType.years(), 1, "1583-10-01"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33522);testAdd("1582-10-04", DurationFieldType.years(), 1, "1583-10-04"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33523);testAdd("1582-10-15", DurationFieldType.years(), 1, "1583-10-15"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33524);testAdd("1582-10-16", DurationFieldType.years(), 1, "1583-10-16"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33525);testAdd("1580-01-01", DurationFieldType.years(), 4, "1584-01-01"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33526);testAdd("1580-02-29", DurationFieldType.years(), 4, "1584-02-29"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33527);testAdd("1580-10-01", DurationFieldType.years(), 4, "1584-10-01"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33528);testAdd("1580-10-10", DurationFieldType.years(), 4, "1584-10-10"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33529);testAdd("1580-10-15", DurationFieldType.years(), 4, "1584-10-15"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33530);testAdd("1580-12-31", DurationFieldType.years(), 4, "1584-12-31"); 
 }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}} 


public void testCutoverAddMonths116() {__CLR4_4_1pszpszle6qsfej.R.globalSliceStart(getClass().getName(),33531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqn2i5pvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pszpszle6qsfej.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pszpszle6qsfej.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddMonths116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqn2i5pvf(){try{__CLR4_4_1pszpszle6qsfej.R.inc(33531); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33532);testAdd("1582-01-01", DurationFieldType.months(), 1, "1582-02-01"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33533);testAdd("1582-01-01", DurationFieldType.months(), 6, "1582-07-01"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33534);testAdd("1582-01-01", DurationFieldType.months(), 12, "1583-01-01"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33535);testAdd("1582-11-15", DurationFieldType.months(), 1, "1582-12-15"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33536);testAdd("1582-09-04", DurationFieldType.months(), 2, "1582-11-04"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33537);testAdd("1582-09-05", DurationFieldType.months(), 2, "1582-11-05"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33538);testAdd("1582-09-10", DurationFieldType.months(), 2, "1582-11-10"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33539);testAdd("1582-09-15", DurationFieldType.months(), 2, "1582-11-15"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33540);testAdd("1580-01-01", DurationFieldType.months(), 48, "1584-01-01"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33541);testAdd("1580-02-29", DurationFieldType.months(), 48, "1584-02-29"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33542);testAdd("1580-10-01", DurationFieldType.months(), 48, "1584-10-01"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33543);testAdd("1580-10-10", DurationFieldType.months(), 48, "1584-10-10"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33544);testAdd("1580-10-15", DurationFieldType.months(), 48, "1584-10-15"); 
     __CLR4_4_1pszpszle6qsfej.R.inc(33545);testAdd("1580-12-31", DurationFieldType.months(), 48, "1584-12-31"); 
 }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}} 

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {try{__CLR4_4_1pszpszle6qsfej.R.inc(33546);
        __CLR4_4_1pszpszle6qsfej.R.inc(33547);assertEquals(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                     new DateTime(year, month, day, hour, minute, second, millis,
                                  GJChronology.getInstance(DateTimeZone.UTC)));
    }finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}}

    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1pszpszle6qsfej.R.inc(33548);
        __CLR4_4_1pszpszle6qsfej.R.inc(33549);DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1pszpszle6qsfej.R.inc(33550);DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1pszpszle6qsfej.R.inc(33551);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1pszpszle6qsfej.R.inc(33552);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1pszpszle6qsfej.R.inc(33553);DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1pszpszle6qsfej.R.inc(33554);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1pszpszle6qsfej.R.inc(33555);assertEquals(amt, diff);
        
        __CLR4_4_1pszpszle6qsfej.R.inc(33556);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1pszpszle6qsfej.R.iget(33557)!=0|true))||(__CLR4_4_1pszpszle6qsfej.R.iget(33558)==0&false))) {{
            __CLR4_4_1pszpszle6qsfej.R.inc(33559);YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1pszpszle6qsfej.R.inc(33560);YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1pszpszle6qsfej.R.inc(33561);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1pszpszle6qsfej.R.inc(33562);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1pszpszle6qsfej.R.flushNeeded();}}

    

    

    

    

    

}
