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
public class TestPeriodFormatterBuilder extends TestCase {static class __CLR4_4_1kp6kp6lccieu6f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,27023,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
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

    public static void main(String[] args) {try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26826);
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26827);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26828);
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26829);return new TestSuite(TestPeriodFormatterBuilder.class);
    }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}

    public TestPeriodFormatterBuilder(String name) {
        super(name);__CLR4_4_1kp6kp6lccieu6f.R.inc(26831);try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26830);
    }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26832);
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26833);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26834);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26835);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26836);originalLocale = Locale.getDefault();
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26837);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26838);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26839);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26840);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26841);
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26842);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26843);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26844);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26845);Locale.setDefault(originalLocale);
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26846);originalDateTimeZone = null;
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26847);originalTimeZone = null;
        __CLR4_4_1kp6kp6lccieu6f.R.inc(26848);originalLocale = null;
    }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFormatAppend_PrinterParser_PrinterParser2() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ifcaamkpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_PrinterParser2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ifcaamkpt(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26849); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26850);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26851);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26852);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, parser).appendMonths(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26853);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26854);assertNotNull(bld.toParser()); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26855);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26856);assertEquals("1-2", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26857);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatPrintZeroAlways10() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k5sxupkq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroAlways10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k5sxupkq2(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26858); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26859);PeriodFormatter f = new PeriodFormatterBuilder().printZeroAlways().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26860);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26861);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26862);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26863);assertEquals("0-0-0-0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26864);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26865);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26866);assertEquals("1-0-0-4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26867);assertEquals(7, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26868);assertEquals(4, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26869);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26870);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26871);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatSuffixSimple219() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4wyidkqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple219",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4wyidkqg(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26872); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26873);PeriodFormatter f = builder.appendHours().appendSuffix(" hours").toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26874);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26875);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26876);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26877);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26878);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26879);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26880);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatAppend_PrinterParser_Printer_null_null_Parser85() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129kixikqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null_null_Parser85",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129kixikqp(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26881); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26882);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26883);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26884);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26885);assertNull(bld.toPrinter()); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26886);assertNull(bld.toParser()); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26887);try { 
         __CLR4_4_1kp6kp6lccieu6f.R.inc(26888);bld.toFormatter(); 
         __CLR4_4_1kp6kp6lccieu6f.R.inc(26889);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatMinutes88() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m2u6wtkqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMinutes88",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m2u6wtkqy(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26890); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26891);PeriodFormatter f = builder.appendMinutes().toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26892);assertEquals("0", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26893);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26894);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26895);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26896);assertEquals("0", f.print(p)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26897);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26898);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatMillis3Digit89() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ieyrypkr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis3Digit89",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ieyrypkr7(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26899); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26900);PeriodFormatter f = builder.appendMillis3Digit().toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26901);assertEquals("008", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26902);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26903);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26904);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26905);assertEquals("000", f.print(p)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26906);assertEquals(3, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26907);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatDefault90() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0nxhykrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatDefault90",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0nxhykrg(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26908); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26909);PeriodFormatter f = builder.appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26910);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26911);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26912);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26913);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26914);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26915);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26916);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26917);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26918);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26919);assertEquals("0---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26920);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26921);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatWeeks98() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txg42kkru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatWeeks98",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txg42kkru(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26922); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26923);PeriodFormatter f = builder.appendWeeks().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26924);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26925);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26926);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26927);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26928);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26929);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26930);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26931);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26932);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26933);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26934);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26935);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatWeeks99() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6g2v1ks8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatWeeks99",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6g2v1ks8(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26936); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26937);PeriodFormatter f = builder.appendWeeks().toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26938);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26939);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26940);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26941);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26942);assertEquals("0-0-0-0", f.print(p)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26943);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26944);assertEquals(4, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatSeparatorComplex156() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ydcfnpksh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorComplex156",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ydcfnpksh(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26945); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26946);PeriodFormatter f = builder.appendYears().appendSeparator(", ", " and ").appendHours().appendSeparator(", ", " and ").appendMinutes().appendSeparator(", ", " and ").toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26947);assertEquals("1, 5 and 6", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26948);assertEquals(10, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26949);assertEquals(3, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26950);assertEquals("5 and 6", f.print(TIME_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26951);assertEquals(7, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26952);assertEquals(2, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26953);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26954);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26955);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatSeparatorIfFieldsAfter158() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kog7zlkss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsAfter158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kog7zlkss(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26956); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26957);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsAfter("T").appendHours().toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26958);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26959);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26960);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26961);assertEquals("T5", f.print(TIME_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26962);assertEquals(2, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26963);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26964);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26965);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26966);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatPrintZeroRarelyLast160() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b0dkn3kt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyLast160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b0dkn3kt3(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26967); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26968);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyLast().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26969);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26970);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26971);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26972);assertEquals("---0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26973);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26974);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26975);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26976);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26977);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26978);assertEquals("---0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26979);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26980);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatAppend_PrinterParser_Printer_null161() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v3nkezkth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v3nkezkth(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26981); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26982);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26983);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).appendMonths(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26984);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26985);assertNotNull(bld.toParser()); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26986);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26987);try { 
         __CLR4_4_1kp6kp6lccieu6f.R.inc(26988);f.print(PERIOD); 
         __CLR4_4_1kp6kp6lccieu6f.R.inc(26989);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26990);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatMinutes162() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),26991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rkfbxektr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMinutes162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rkfbxektr(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(26991); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26992);PeriodFormatter f = builder.appendMinutes().toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26993);assertEquals("1 minute", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26994);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26995);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26996);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26997);assertEquals("0 minutes", f.print(p)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26998);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(26999);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatPrefixSimple2163() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),27000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174uiz4ku0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple2163",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174uiz4ku0(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(27000); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27001);PeriodFormatter f = builder.appendPrefix("Hour:").appendHours().toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27002);assertEquals("Hours:5", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27003);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27004);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27005);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27006);assertEquals("Hours:0", f.print(p)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27007);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27008);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
public void testFormatPrintZeroRarelyFirst165() {__CLR4_4_1kp6kp6lccieu6f.R.globalSliceStart(getClass().getName(),27009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hiy6xuku9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kp6kp6lccieu6f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kp6kp6lccieu6f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirst165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hiy6xuku9(){try{__CLR4_4_1kp6kp6lccieu6f.R.inc(27009); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27010);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27011);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27012);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27013);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27014);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27015);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27016);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27017);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27018);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27019);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27020);assertEquals("0---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27021);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1kp6kp6lccieu6f.R.inc(27022);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1kp6kp6lccieu6f.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

}
