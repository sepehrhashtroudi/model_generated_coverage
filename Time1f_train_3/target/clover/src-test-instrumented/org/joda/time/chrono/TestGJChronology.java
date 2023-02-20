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
public class TestGJChronology extends TestCase {static class __CLR4_4_1pt2pt2le6rcmi2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,33567,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33446);
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33447);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33448);
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33449);return new TestSuite(TestGJChronology.class);
    }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}}

    public TestGJChronology(String name) {
        super(name);__CLR4_4_1pt2pt2le6rcmi2.R.inc(33451);try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33450);
    }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33452);
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33453);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33454);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33455);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33456);originalLocale = Locale.getDefault();
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33457);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33458);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33459);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33460);
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33461);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33462);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33463);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33464);Locale.setDefault(originalLocale);
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33465);originalDateTimeZone = null;
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33466);originalTimeZone = null;
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33467);originalLocale = null;
    }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testCutoverAddWeeks110() {__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceStart(getClass().getName(),33468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h8ggcrpto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2le6rcmi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddWeeks110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h8ggcrpto(){try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33468); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33469);testAdd("1582-01-01", DurationFieldType.weeks(), 1, "1582-01-08"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33470);testAdd("1583-01-01", DurationFieldType.weeks(), 1, "1583-01-08"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33471);testAdd("1582-10-01", DurationFieldType.weeks(), 2, "1582-10-25"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33472);testAdd("1582-W01-1", DurationFieldType.weeks(), 51, "1583-W01-1"); 
 }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}} 


public void testEquality111() {__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceStart(getClass().getName(),33473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abki30ptt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2le6rcmi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testEquality111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abki30ptt(){try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33473); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33474);assertSame(GJChronology.getInstance(TOKYO), GJChronology.getInstance(TOKYO)); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33475);assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(LONDON)); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33476);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance(PARIS)); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33477);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstanceUTC()); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33478);assertSame(GJChronology.getInstance(), GJChronology.getInstance(LONDON)); 
 }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}} 


public void testSubtractDays112() {__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceStart(getClass().getName(),33479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9z1k4ptz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2le6rcmi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testSubtractDays112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9z1k4ptz(){try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33479); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33480);DateTime dt = new DateTime(1112306400000L, GJChronology.getInstance(DateTimeZone.forID("Europe/Berlin"))); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33481);YearMonthDay ymd = dt.toYearMonthDay(); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33482);while ((((ymd.toDateTimeAtMidnight().getDayOfWeek() != DateTimeConstants.MONDAY)&&(__CLR4_4_1pt2pt2le6rcmi2.R.iget(33483)!=0|true))||(__CLR4_4_1pt2pt2le6rcmi2.R.iget(33484)==0&false))) {{ 
         __CLR4_4_1pt2pt2le6rcmi2.R.inc(33485);ymd = ymd.minus(Period.days(1)); 
     } 
 }}finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}} 


public void testFactory_Zone_RI113() {__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceStart(getClass().getName(),33486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1us1q7dpu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2le6rcmi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone_RI113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1us1q7dpu6(){try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33486); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33487);GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L)); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33488);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33489);assertEquals(new Instant(0L), chrono.getGregorianCutover()); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33490);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, new Instant(0L)).getClass()); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33491);DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33492);chrono = GJChronology.getInstance(TOKYO, null); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33493);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33494);assertEquals(cutover.toInstant(), chrono.getGregorianCutover()); 
 }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}} 


public void testLeapYearRulesConstruction118() {__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceStart(getClass().getName(),33495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qny6qpuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2le6rcmi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstruction118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qny6qpuf(){try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33495); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33496);DateMidnight dt = new DateMidnight(1500, 2, 29, GJChronology.getInstanceUTC()); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33497);assertEquals(dt.getYear(), 1500); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33498);assertEquals(dt.getMonthOfYear(), 2); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33499);assertEquals(dt.getDayOfMonth(), 29); 
 }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}} 


public void testIllegalDates119() {__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceStart(getClass().getName(),33500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v68peppuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2le6rcmi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testIllegalDates119",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v68peppuk(){try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33500); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33501);try { 
         __CLR4_4_1pt2pt2le6rcmi2.R.inc(33502);new DateTime(1582, 10, 5, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC)); 
         __CLR4_4_1pt2pt2le6rcmi2.R.inc(33503);fail("Constructed illegal date"); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33504);try { 
         __CLR4_4_1pt2pt2le6rcmi2.R.inc(33505);new DateTime(1582, 10, 14, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC)); 
         __CLR4_4_1pt2pt2le6rcmi2.R.inc(33506);fail("Constructed illegal date"); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}} 


public void testCutoverAddWeekyears122() {__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceStart(getClass().getName(),33507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oehd7xpur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2le6rcmi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddWeekyears122",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oehd7xpur(){try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33507); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33508);testAdd("1582-W01-1", DurationFieldType.weekyears(), 1, "1583-W01-1"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33509);testAdd("1582-W39-1", DurationFieldType.weekyears(), 1, "1583-W39-1"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33510);testAdd("1583-W45-1", DurationFieldType.weekyears(), 1, "1584-W45-1"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33511);testAdd("1580-W01-1", DurationFieldType.weekyears(), 4, "1584-W01-1"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33512);testAdd("1580-W30-7", DurationFieldType.weekyears(), 4, "1584-W30-7"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33513);testAdd("1580-W50-7", DurationFieldType.weekyears(), 4, "1584-W50-7"); 
 }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}} 


public void testPartialGetAsText123() {__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceStart(getClass().getName(),33514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uoss5vpuy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2le6rcmi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testPartialGetAsText123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uoss5vpuy(){try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33514); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33515);GJChronology chrono = GJChronology.getInstance(TOKYO); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33516);assertEquals("January", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsText()); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33517);assertEquals("Jan", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsShortText()); 
 }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}} 


public void testTimeOfDayAdd124() {__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceStart(getClass().getName(),33518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av52ovpv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2le6rcmi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testTimeOfDayAdd124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av52ovpv2(){try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33518); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33519);TimeOfDay start = new TimeOfDay(12, 30, GJChronology.getInstance()); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33520);TimeOfDay end = new TimeOfDay(10, 30, GJChronology.getInstance()); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33521);assertEquals(end, start.plusHours(22)); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33522);assertEquals(start, end.minusHours(22)); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33523);assertEquals(end, start.plusMinutes(22 * 60)); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33524);assertEquals(start, end.minusMinutes(22 * 60)); 
 }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}} 


public void testMaximumValue125() {__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceStart(getClass().getName(),33525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ody8pkpv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2le6rcmi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testMaximumValue125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ody8pkpv9(){try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33525); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33526);DateMidnight dt = new DateMidnight(1570, 1, 1, GJChronology.getInstance()); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33527);while ((((dt.getYear() < 1590)&&(__CLR4_4_1pt2pt2le6rcmi2.R.iget(33528)!=0|true))||(__CLR4_4_1pt2pt2le6rcmi2.R.iget(33529)==0&false))) {{ 
         __CLR4_4_1pt2pt2le6rcmi2.R.inc(33530);dt = dt.plusDays(1); 
         __CLR4_4_1pt2pt2le6rcmi2.R.inc(33531);YearMonthDay ymd = dt.toYearMonthDay(); 
         __CLR4_4_1pt2pt2le6rcmi2.R.inc(33532);assertEquals(dt.year().getMaximumValue(), ymd.year().getMaximumValue()); 
         __CLR4_4_1pt2pt2le6rcmi2.R.inc(33533);assertEquals(dt.monthOfYear().getMaximumValue(), ymd.monthOfYear().getMaximumValue()); 
         __CLR4_4_1pt2pt2le6rcmi2.R.inc(33534);assertEquals(dt.dayOfMonth().getMaximumValue(), ymd.dayOfMonth().getMaximumValue()); 
     } 
 }}finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}} 


public void testCutoverAddMonths129() {__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceStart(getClass().getName(),33535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17tm6k1pvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2le6rcmi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2le6rcmi2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddMonths129",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17tm6k1pvj(){try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33535); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33536);testAdd("1582-01-01", DurationFieldType.months(), 1, "1582-02-01"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33537);testAdd("1582-01-01", DurationFieldType.months(), 6, "1582-07-01"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33538);testAdd("1582-01-01", DurationFieldType.months(), 12, "1583-01-01"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33539);testAdd("1582-11-15", DurationFieldType.months(), 1, "1582-12-15"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33540);testAdd("1582-09-04", DurationFieldType.months(), 2, "1582-11-04"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33541);testAdd("1582-09-05", DurationFieldType.months(), 2, "1582-11-05"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33542);testAdd("1582-09-10", DurationFieldType.months(), 2, "1582-11-10"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33543);testAdd("1582-09-15", DurationFieldType.months(), 2, "1582-11-15"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33544);testAdd("1580-01-01", DurationFieldType.months(), 48, "1584-01-01"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33545);testAdd("1580-02-29", DurationFieldType.months(), 48, "1584-02-29"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33546);testAdd("1580-10-01", DurationFieldType.months(), 48, "1584-10-01"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33547);testAdd("1580-10-10", DurationFieldType.months(), 48, "1584-10-10"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33548);testAdd("1580-10-15", DurationFieldType.months(), 48, "1584-10-15"); 
     __CLR4_4_1pt2pt2le6rcmi2.R.inc(33549);testAdd("1580-12-31", DurationFieldType.months(), 48, "1584-12-31"); 
 }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}} 

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33550);
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33551);assertEquals(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                     new DateTime(year, month, day, hour, minute, second, millis,
                                  GJChronology.getInstance(DateTimeZone.UTC)));
    }finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}}

    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1pt2pt2le6rcmi2.R.inc(33552);
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33553);DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33554);DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33555);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33556);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33557);DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33558);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33559);assertEquals(amt, diff);
        
        __CLR4_4_1pt2pt2le6rcmi2.R.inc(33560);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1pt2pt2le6rcmi2.R.iget(33561)!=0|true))||(__CLR4_4_1pt2pt2le6rcmi2.R.iget(33562)==0&false))) {{
            __CLR4_4_1pt2pt2le6rcmi2.R.inc(33563);YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1pt2pt2le6rcmi2.R.inc(33564);YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1pt2pt2le6rcmi2.R.inc(33565);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1pt2pt2le6rcmi2.R.inc(33566);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1pt2pt2le6rcmi2.R.flushNeeded();}}

    

    

    

    

    

}
