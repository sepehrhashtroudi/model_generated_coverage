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
public class TestPeriodFormatterBuilder extends TestCase {static class __CLR4_4_1m5um5ule6np4wx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,28960,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
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

    public static void main(String[] args) {try{__CLR4_4_1m5um5ule6np4wx.R.inc(28722);
        __CLR4_4_1m5um5ule6np4wx.R.inc(28723);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m5um5ule6np4wx.R.inc(28724);
        __CLR4_4_1m5um5ule6np4wx.R.inc(28725);return new TestSuite(TestPeriodFormatterBuilder.class);
    }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}

    public TestPeriodFormatterBuilder(String name) {
        super(name);__CLR4_4_1m5um5ule6np4wx.R.inc(28727);try{__CLR4_4_1m5um5ule6np4wx.R.inc(28726);
    }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m5um5ule6np4wx.R.inc(28728);
        __CLR4_4_1m5um5ule6np4wx.R.inc(28729);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m5um5ule6np4wx.R.inc(28730);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1m5um5ule6np4wx.R.inc(28731);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1m5um5ule6np4wx.R.inc(28732);originalLocale = Locale.getDefault();
        __CLR4_4_1m5um5ule6np4wx.R.inc(28733);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m5um5ule6np4wx.R.inc(28734);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1m5um5ule6np4wx.R.inc(28735);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1m5um5ule6np4wx.R.inc(28736);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m5um5ule6np4wx.R.inc(28737);
        __CLR4_4_1m5um5ule6np4wx.R.inc(28738);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m5um5ule6np4wx.R.inc(28739);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1m5um5ule6np4wx.R.inc(28740);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1m5um5ule6np4wx.R.inc(28741);Locale.setDefault(originalLocale);
        __CLR4_4_1m5um5ule6np4wx.R.inc(28742);originalDateTimeZone = null;
        __CLR4_4_1m5um5ule6np4wx.R.inc(28743);originalTimeZone = null;
        __CLR4_4_1m5um5ule6np4wx.R.inc(28744);originalLocale = null;
    }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPlusFields22() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17f5jxwm6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testPlusFields22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17f5jxwm6h(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28745); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28746);Period test; 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28747);test = Period.years(1).plusYears(1); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28748);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28749);test = Period.months(1).plusMonths(1); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28750);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28751);test = Period.weeks(1).plusWeeks(1); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28752);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28753);test = Period.days(1).plusDays(1); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28754);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28755);test = Period.hours(1).plusHours(1); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28756);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28757);test = Period.minutes(1).plusMinutes(1); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28758);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28759);test = Period.seconds(1).plusSeconds(1); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28760);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28761);test = Period.millis(1).plusMillis(1); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28762);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28763);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28764);try { 
         __CLR4_4_1m5um5ule6np4wx.R.inc(28765);test.plusYears(1); 
         __CLR4_4_1m5um5ule6np4wx.R.inc(28766);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatAppend_PrinterParser_Printer_null_null_Parser59() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17e1bf3m73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null_null_Parser59",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17e1bf3m73(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28767); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28768);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28769);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28770);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28771);assertNull(bld.toPrinter()); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28772);assertNull(bld.toParser()); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28773);try { 
         __CLR4_4_1m5um5ule6np4wx.R.inc(28774);bld.toFormatter(); 
         __CLR4_4_1m5um5ule6np4wx.R.inc(28775);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatPrefixSimple260() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k57cw6m7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k57cw6m7c(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28776); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28777);PeriodFormatter f = builder.appendPrefix(" hours").appendHours().toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28778);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28779);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28780);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28781);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28782);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28783);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28784);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatPrintZeroAlways61() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txvbelm7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroAlways61",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txvbelm7l(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28785); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28786);PeriodFormatter f = new PeriodFormatterBuilder().printZeroAlways().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28787);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28788);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28789);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28790);assertEquals("0-0-0-0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28791);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28792);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28793);assertEquals("1-0-0-4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28794);assertEquals(7, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28795);assertEquals(4, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28796);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28797);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28798);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatSuffixSimple262() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wzlqhm7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wzlqhm7z(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28799); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28800);PeriodFormatter f = builder.appendHours().appendSuffix(" hours").toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28801);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28802);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28803);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28804);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28805);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28806);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28807);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatSeparatorIfFieldsAfter63() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186ps36m88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsAfter63",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186ps36m88(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28808); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28809);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsAfter("T").appendHours().toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28810);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28811);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28812);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28813);assertEquals("T5", f.print(TIME_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28814);assertEquals(2, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28815);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28816);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28817);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28818);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatSuffixPlural264() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ggzlzm8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ggzlzm8j(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28819); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28820);PeriodFormatter f = builder.appendHours().appendSuffix(" hours").toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28821);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28822);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28823);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28824);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28825);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28826);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28827);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatSeparatorComplex65() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utlv5ym8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorComplex65",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utlv5ym8s(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28828); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28829);PeriodFormatter f = builder.appendYears().appendSeparator(", ", " and ").appendHours().appendSeparator(", ", " and ").appendMinutes().appendSeparator(", ", " and ").toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28830);assertEquals("1, 5 and 6", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28831);assertEquals(10, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28832);assertEquals(3, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28833);assertEquals("5 and 6", f.print(TIME_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28834);assertEquals(7, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28835);assertEquals(2, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28836);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28837);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28838);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatPlural266() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7dsdom93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPlural266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7dsdom93(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28839); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28840);PeriodFormatter f = builder.appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28841);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28842);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28843);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28844);assertEquals("0---0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28845);assertEquals(5, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28846);assertEquals(2, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28847);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28848);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28849);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28850);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28851);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28852);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatSeparatorSimple68() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhmwbbm9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorSimple68",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhmwbbm9h(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28853); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28854);PeriodFormatter f = builder.appendYears().appendSeparator("T").appendHours().toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28855);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28856);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28857);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28858);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28859);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28860);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28861);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28862);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28863);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatAppend_PrinterParser_PrinterParser69() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vn4yxrm9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_PrinterParser69",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vn4yxrm9s(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28864); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28865);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28866);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28867);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, parser).appendMonths(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28868);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28869);assertNotNull(bld.toParser()); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28870);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28871);assertEquals("1-2", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28872);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatPrintZeroRarelyFirst71() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t8yvjema1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirst71",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t8yvjema1(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28873); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28874);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28875);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28876);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28877);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28878);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28879);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28880);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28881);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28882);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28883);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28884);assertEquals("0---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28885);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28886);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatPrintZeroRarelyLast72() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h50v8zmaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyLast72",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h50v8zmaf(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28887); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28888);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyLast().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28889);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28890);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28891);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28892);assertEquals("---0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28893);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28894);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28895);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28896);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28897);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28898);assertEquals("---0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28899);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28900);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatSuffixPlural173() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m58n06mat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m58n06mat(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28901); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28902);PeriodFormatter f = builder.appendYears().appendSuffix(" year", " years").toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28903);assertEquals("1 year", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28904);assertEquals(6, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28905);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28906);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28907);assertEquals("0 years", f.print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28908);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28909);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatMillis3Digit74() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rjvyj7mb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis3Digit74",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rjvyj7mb2(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28910); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28911);PeriodFormatter f = builder.appendMillis3Digit().toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28912);assertEquals("008", f.print(PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28913);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28914);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28915);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28916);assertEquals("000", f.print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28917);assertEquals(3, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28918);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testParseCustom1155() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9y7yxmbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testParseCustom1155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9y7yxmbb(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28919); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28920);PeriodFormatter formatter = new PeriodFormatterBuilder().printZeroAlways().appendHours().appendSuffix(":").minimumPrintedDigits(2).appendMinutes().toFormatter(); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28921);Period p; 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28922);p = new Period(47, 55, 0, 0); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28923);assertEquals("47:55", formatter.print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28924);assertEquals(p, formatter.parsePeriod("47:55")); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28925);assertEquals(p, formatter.parsePeriod("047:055")); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28926);p = new Period(7, 5, 0, 0); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28927);assertEquals("7:05", formatter.print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28928);assertEquals(p, formatter.parsePeriod("7:05")); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28929);assertEquals(p, formatter.parsePeriod("7:5")); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28930);assertEquals(p, formatter.parsePeriod("07:05")); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28931);p = new Period(0, 5, 0, 0); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28932);assertEquals("0:05", formatter.print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28933);assertEquals(p, formatter.parsePeriod("0:05")); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28934);assertEquals(p, formatter.parsePeriod("0:5")); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28935);assertEquals(p, formatter.parsePeriod("00:005")); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28936);assertEquals(p, formatter.parsePeriod("0:005")); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28937);p = new Period(0, 0, 0, 0); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28938);assertEquals("0:00", formatter.print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28939);assertEquals(p, formatter.parsePeriod("0:00")); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28940);assertEquals(p, formatter.parsePeriod("0:0")); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28941);assertEquals(p, formatter.parsePeriod("00:00")); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testWithPeriodType3353() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ql9ec8mby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testWithPeriodType3353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ql9ec8mby(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28942); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28943);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard()); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28944);try { 
         __CLR4_4_1m5um5ule6np4wx.R.inc(28945);test.withPeriodType(PeriodType.dayTime()); 
         __CLR4_4_1m5um5ule6np4wx.R.inc(28946);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
public void testFormatAlternate499() {__CLR4_4_1m5um5ule6np4wx.R.globalSliceStart(getClass().getName(),28947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13770zamc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5um5ule6np4wx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5um5ule6np4wx.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAlternate499",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13770zamc3(){try{__CLR4_4_1m5um5ule6np4wx.R.inc(28947); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28948);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28949);assertEquals("P00010204T050607.008", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28950);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28951);assertEquals("P00010204T050607", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28952);p = new Period(0); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28953);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28954);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28955);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(p)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28956);assertEquals("P00010004T050607.008", ISOPeriodFormat.alternate().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28957);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28958);assertEquals("P00010204T000000", ISOPeriodFormat.alternate().print(DATE_PERIOD)); 
     __CLR4_4_1m5um5ule6np4wx.R.inc(28959);assertEquals("P00000000T050607.008", ISOPeriodFormat.alternate().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1m5um5ule6np4wx.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

}
