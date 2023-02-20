/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * This class is a Junit unit test for PeriodFormatterBuilder.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormatterBuilder extends TestCase {static class __CLR4_4_1mqhmqhle6ndq7t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,29582,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final Period PERIOD = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    private static final Period EMPTY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0);
    private static final Period YEAR_DAY_PERIOD = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
    private static final Period EMPTY_YEAR_DAY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime());
    private static final Period TIME_PERIOD = new Period(0, 0, 0, 0, 5, 6, 7, 8);
    private static final Period DATE_PERIOD = new Period(1, 2, 3, 4, 0, 0, 0, 0);

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    //private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

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
    
    private PeriodFormatterBuilder builder;

    public static void main(String[] args) {try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29465);
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29466);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29467);
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29468);return new TestSuite(TestPeriodFormatterBuilder.class);
    }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}

    public TestPeriodFormatterBuilder(String name) {
        super(name);__CLR4_4_1mqhmqhle6ndq7t.R.inc(29470);try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29469);
    }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29471);
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29472);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29473);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29474);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29475);originalLocale = Locale.getDefault();
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29476);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29477);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29478);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29479);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29480);
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29481);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29482);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29483);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29484);Locale.setDefault(originalLocale);
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29485);originalDateTimeZone = null;
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29486);originalTimeZone = null;
        __CLR4_4_1mqhmqhle6ndq7t.R.inc(29487);originalLocale = null;
    }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFormatPrintZeroRarelyFirst49() {__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceStart(getClass().getName(),29488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ldfsv3mr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqhmqhle6ndq7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirst49",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ldfsv3mr4(){try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29488); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29489);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29490);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29491);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29492);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29493);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29494);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29495);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29496);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29497);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29498);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29499);assertEquals("0---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29500);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29501);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}
public void testFormatPrintZeroAlways50() {__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceStart(getClass().getName(),29502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130zjxfmri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqhmqhle6ndq7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroAlways50",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130zjxfmri(){try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29502); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29503);PeriodFormatter f = new PeriodFormatterBuilder().printZeroAlways().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29504);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29505);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29506);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29507);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29508);assertEquals(5, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29509);assertEquals(2, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29510);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29511);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29512);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29513);assertEquals("0---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29514);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29515);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}
public void testFormatAppend_PrinterParser_Printer_null_null_Parser51() {__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceStart(getClass().getName(),29516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xe11qvmrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqhmqhle6ndq7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null_null_Parser51",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xe11qvmrw(){try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29516); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29517);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29518);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29519);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29520);assertNull(bld.toPrinter()); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29521);assertNull(bld.toParser()); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29522);try { 
         __CLR4_4_1mqhmqhle6ndq7t.R.inc(29523);bld.toFormatter(); 
         __CLR4_4_1mqhmqhle6ndq7t.R.inc(29524);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}
public void testFormatSuffixPlural252() {__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceStart(getClass().getName(),29525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scs88oms5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqhmqhle6ndq7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scs88oms5(){try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29525); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29526);PeriodFormatter f = builder.appendHours().appendSuffix(" hour", " hours").toFormatter(); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29527);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29528);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29529);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29530);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29531);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29532);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29533);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}
public void testFormatSuffixPlural353() {__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceStart(getClass().getName(),29534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgxi62mse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqhmqhle6ndq7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgxi62mse(){try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29534); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29535);try { 
         __CLR4_4_1mqhmqhle6ndq7t.R.inc(29536);builder.appendSuffix(null); 
         __CLR4_4_1mqhmqhle6ndq7t.R.inc(29537);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}
public void testFormatSuffixPlural454() {__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceStart(getClass().getName(),29538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ul2s3gmsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqhmqhle6ndq7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ul2s3gmsi(){try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29538); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29539);try { 
         __CLR4_4_1mqhmqhle6ndq7t.R.inc(29540);builder.appendSuffix(" hour", " hours"); 
         __CLR4_4_1mqhmqhle6ndq7t.R.inc(29541);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}
public void testFormatSeparatorIfFieldsAfter55() {__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceStart(getClass().getName(),29542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vekr1rmsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqhmqhle6ndq7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsAfter55",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vekr1rmsm(){try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29542); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29543);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsAfter("T").appendHours().toFormatter(); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29544);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29545);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29546);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29547);assertEquals("T5", f.print(TIME_PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29548);assertEquals(2, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29549);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29550);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29551);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29552);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}
public void testFormatSeparatorIfFieldsBefore56() {__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceStart(getClass().getName(),29553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvr7o9msx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqhmqhle6ndq7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsBefore56",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvr7o9msx(){try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29553); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29554);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsBefore("T").appendHours().toFormatter(); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29555);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29556);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29557);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29558);assertEquals("T5", f.print(TIME_PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29559);assertEquals(2, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29560);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29561);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29562);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29563);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}
public void testFormatPrefixSimple258() {__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceStart(getClass().getName(),29564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gfc6ofmt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqhmqhle6ndq7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gfc6ofmt8(){try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29564); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29565);PeriodFormatter f = builder.appendPrefix("Hours:").appendHours().toFormatter(); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29566);assertEquals("Hours:5", f.print(PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29567);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29568);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29569);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29570);assertEquals("Hours:0", f.print(p)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29571);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29572);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}
public void testFormatSuffixPlural160() {__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceStart(getClass().getName(),29573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hbm5wsmth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mqhmqhle6ndq7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mqhmqhle6ndq7t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hbm5wsmth(){try{__CLR4_4_1mqhmqhle6ndq7t.R.inc(29573); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29574);PeriodFormatter f = builder.appendYears().appendSuffix(" year", " years").toFormatter(); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29575);assertEquals("1 year", f.print(PERIOD)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29576);assertEquals(6, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29577);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29578);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29579);assertEquals("0 years", f.print(p)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29580);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1mqhmqhle6ndq7t.R.inc(29581);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1mqhmqhle6ndq7t.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

}
