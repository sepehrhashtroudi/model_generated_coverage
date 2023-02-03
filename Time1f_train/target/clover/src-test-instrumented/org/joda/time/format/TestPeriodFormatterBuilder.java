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
public class TestPeriodFormatterBuilder extends TestCase {static class __CLR4_4_1w7zw7zlc8axf80{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,42112,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
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

    public static void main(String[] args) {try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41759);
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41760);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41761);
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41762);return new TestSuite(TestPeriodFormatterBuilder.class);
    }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}}

    public TestPeriodFormatterBuilder(String name) {
        super(name);__CLR4_4_1w7zw7zlc8axf80.R.inc(41764);try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41763);
    }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41765);
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41766);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41767);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41768);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41769);originalLocale = Locale.getDefault();
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41770);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41771);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41772);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41773);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41774);
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41775);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41776);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41777);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41778);Locale.setDefault(originalLocale);
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41779);originalDateTimeZone = null;
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41780);originalTimeZone = null;
        __CLR4_4_1w7zw7zlc8axf80.R.inc(41781);originalLocale = null;
    }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormatSuffixPlural2103() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ls3ljbw8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural2103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ls3ljbw8m(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41782); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41783);PeriodFormatter f = builder.appendHours().appendSuffix(" hour", " hours").toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41784);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41785);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41786);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41787);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41788);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41789);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41790);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatPrintZeroAlways129() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd5n24w8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroAlways129",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd5n24w8v(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41791); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41792);PeriodFormatter f = new PeriodFormatterBuilder().printZeroAlways().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41793);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41794);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41795);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41796);assertEquals("0-0-0-0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41797);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41798);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41799);assertEquals("1-0-0-4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41800);assertEquals(7, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41801);assertEquals(4, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41802);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41803);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41804);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_PrinterParser140() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h360sjw99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_PrinterParser140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h360sjw99(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41805); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41806);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41807);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41808);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, parser).appendMonths(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41809);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41810);assertNotNull(bld.toParser()); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41811);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41812);assertEquals("1-2", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41813);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatSuffixSimple3177() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11k3tanw9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple3177",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11k3tanw9i(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41814); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41815);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(41816);builder.appendSuffix(null); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(41817);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_Printer_null_null_Parser183() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18v7e99w9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null_null_Parser183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18v7e99w9m(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41818); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41819);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41820);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41821);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41822);assertNull(bld.toPrinter()); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41823);assertNull(bld.toParser()); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41824);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(41825);bld.toFormatter(); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(41826);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatSeparatorIfFieldsAfter185() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1wz9nw9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsAfter185",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1wz9nw9v(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41827); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41828);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsAfter("T").appendHours().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41829);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41830);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41831);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41832);assertEquals("T5", f.print(TIME_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41833);assertEquals(2, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41834);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41835);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41836);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41837);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirstSeconds196() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bb8t63wa6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstSeconds196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bb8t63wa6(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41838); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41839);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendSeconds().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41840);assertEquals("0", f.print(EMPTY_PERIOD)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatSeparatorSimple309() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15v1rnvwa9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorSimple309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15v1rnvwa9(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41841); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41842);PeriodFormatter f = builder.appendYears().appendSeparator("T").appendHours().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41843);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41844);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41845);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41846);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41847);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41848);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41849);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41850);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41851);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatSuffixSimple2326() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kgk7s8wak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple2326",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kgk7s8wak(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41852); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41853);PeriodFormatter f = builder.appendHours().appendSuffix(" hours").toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41854);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41855);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41856);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41857);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41858);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41859);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41860);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatSeparatorComplex331() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pg1gv8wat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorComplex331",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pg1gv8wat(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41861); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41862);PeriodFormatter f = builder.appendYears().appendSeparator(", ", " and ").appendHours().appendSeparator(", ", " and ").appendMinutes().appendSeparator(", ", " and ").toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41863);assertEquals("1, 5 and 6", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41864);assertEquals(10, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41865);assertEquals(3, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41866);assertEquals("5 and 6", f.print(TIME_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41867);assertEquals(7, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41868);assertEquals(2, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41869);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41870);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41871);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatSecondsWithMillis537() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpnkf2wb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSecondsWithMillis537",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpnkf2wb4(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41872); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41873);PeriodFormatter f = builder.appendSecondsWithMillis().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41874);Period p = new Period(0, 0, 0, 0, 0, 0, 7, 0); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41875);assertEquals("7.000", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41876);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41877);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41878);p = new Period(0, 0, 0, 0, 0, 0, 7, 1); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41879);assertEquals("7.001", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41880);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41881);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41882);p = new Period(0, 0, 0, 0, 0, 0, 7, 999); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41883);assertEquals("7.999", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41884);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41885);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41886);p = new Period(0, 0, 0, 0, 0, 0, 7, 1000); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41887);assertEquals("8.000", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41888);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41889);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41890);p = new Period(0, 0, 0, 0, 0, 0, 7, 1001); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41891);assertEquals("8.001", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41892);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41893);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41894);p = new Period(0, 0, 0, 0, 0, 0, 7, -1); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41895);assertEquals("6.999", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41896);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41897);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41898);p = new Period(0, 0, 0, 0, 0, 0, -7, 1); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41899);assertEquals("-6.999", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41900);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41901);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41902);p = new Period(0, 0, 0, 0, 0, 0, -7, -1); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41903);assertEquals("-7.001", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41904);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41905);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41906);p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41907);assertEquals("0.000", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41908);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41909);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirst621() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1hd8nwc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirst621",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1hd8nwc6(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41910); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41911);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41912);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41913);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41914);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41915);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41916);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41917);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41918);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41919);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41920);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41921);assertEquals("0---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41922);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41923);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_null_Parser662() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15sslb0wck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_Parser662",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15sslb0wck(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41924); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41925);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41926);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(null, parser).appendMonths(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41927);assertNull(bld.toPrinter()); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41928);assertNotNull(bld.toParser()); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41929);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41930);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(41931);f.print(PERIOD); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(41932);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41933);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatPrefixSimple3722() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j47jzswcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple3722",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j47jzswcu(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41934); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41935);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(41936);builder.appendPrefix(null); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(41937);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyLast864() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cycjiswcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyLast864",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cycjiswcy(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41938); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41939);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyLast().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41940);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41941);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41942);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41943);assertEquals("---0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41944);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41945);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41946);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41947);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41948);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41949);assertEquals("---0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41950);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41951);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatMinDigits946() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rusdvwdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMinDigits946",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rusdvwdc(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41952); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41953);PeriodFormatter f = new PeriodFormatterBuilder().minimumPrintedDigits(4).appendYears().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41954);assertEquals("0001", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41955);assertEquals(4, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41956);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatPrintZeroIfSupported966() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ykmxmjwdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroIfSupported966",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ykmxmjwdh(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41957); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41958);PeriodFormatter f = new PeriodFormatterBuilder().printZeroIfSupported().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41959);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41960);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41961);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41962);assertEquals("0---0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41963);assertEquals(5, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41964);assertEquals(2, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41965);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41966);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41967);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41968);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41969);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41970);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirstMinutes974() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14bsh9wdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstMinutes974",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14bsh9wdv(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41971); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41972);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendMinutes().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41973);assertEquals("0", f.print(EMPTY_PERIOD)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatSeparatorIfFieldsBefore1018() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v5mlwiwdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsBefore1018",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v5mlwiwdy(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41974); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41975);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsBefore("T").appendHours().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41976);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41977);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41978);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41979);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41980);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41981);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41982);assertEquals("1T", f.print(DATE_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41983);assertEquals(2, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41984);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatMillis3Digit1121() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1admh67we9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis3Digit1121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1admh67we9(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41985); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41986);PeriodFormatter f = builder.appendMillis3Digit().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41987);assertEquals("008", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41988);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41989);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41990);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41991);assertEquals("000", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41992);assertEquals(3, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41993);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatMillis1247() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),41994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x29yzqwei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis1247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x29yzqwei(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(41994); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41995);PeriodFormatter f = builder.appendMillis().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41996);assertEquals("8", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41997);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41998);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(41999);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42000);assertEquals("0", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42001);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42002);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatPrintZeroNever1412() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),42003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xpjsbwer();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroNever1412",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xpjsbwer(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(42003); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42004);PeriodFormatter f = new PeriodFormatterBuilder().printZeroNever().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42005);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42006);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42007);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42008);assertEquals("---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42009);assertEquals(3, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42010);assertEquals(0, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42011);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42012);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42013);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42014);assertEquals("---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42015);assertEquals(3, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42016);assertEquals(0, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatSuffixPlural31414() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),42017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plej1ewf5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural31414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plej1ewf5(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(42017); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42018);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42019);builder.appendSuffix(null, ""); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42020);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42021);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42022);builder.appendSuffix("", null); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42023);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42024);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42025);builder.appendSuffix(null, null); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42026);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_Printer_null1465() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),42027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mle29jwff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null1465",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mle29jwff(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(42027); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42028);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42029);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).appendMonths(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42030);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42031);assertNull(bld.toParser()); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42032);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42033);assertEquals("1-2", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42034);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42035);f.parsePeriod("1-2"); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42036);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatSuffixPlural41505() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),42037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15coryewfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural41505",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15coryewfp(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(42037); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42038);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42039);builder.appendSuffix(" hour", " hours"); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42040);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatPrefixPlural21507() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),42041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yka1txwft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural21507",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yka1txwft(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(42041); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42042);PeriodFormatter f = builder.appendPrefix("Hour:", "Hours:").appendHours().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42043);assertEquals("Hours:5", f.print(PERIOD)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42044);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42045);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42046);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42047);assertEquals("Hours:0", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42048);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42049);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatSecondsWithOptionalMillis1734() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),42050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_185c0swwg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSecondsWithOptionalMillis1734",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_185c0swwg2(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(42050); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42051);PeriodFormatter f = builder.appendSecondsWithOptionalMillis().toFormatter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42052);Period p = new Period(0, 0, 0, 0, 0, 0, 7, 0); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42053);assertEquals("7", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42054);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42055);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42056);p = new Period(0, 0, 0, 0, 0, 0, 7, 1); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42057);assertEquals("7.001", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42058);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42059);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42060);p = new Period(0, 0, 0, 0, 0, 0, 7, 999); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42061);assertEquals("7.999", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42062);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42063);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42064);p = new Period(0, 0, 0, 0, 0, 0, 7, 1000); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42065);assertEquals("8", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42066);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42067);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42068);p = new Period(0, 0, 0, 0, 0, 0, 7, 1001); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42069);assertEquals("8.001", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42070);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42071);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42072);p = new Period(0, 0, 0, 0, 0, 0, 7, -1); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42073);assertEquals("6.999", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42074);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42075);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42076);p = new Period(0, 0, 0, 0, 0, 0, -7, 1); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42077);assertEquals("-6.999", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42078);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42079);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42080);p = new Period(0, 0, 0, 0, 0, 0, -7, -1); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42081);assertEquals("-7.001", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42082);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42083);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42084);p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42085);assertEquals("0", f.print(p)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42086);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42087);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatPrefixPlural31741() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),42088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1417qw2wh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural31741",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1417qw2wh4(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(42088); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42089);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42090);builder.appendPrefix(null, ""); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42091);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42092);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42093);builder.appendPrefix("", null); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42094);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42095);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42096);builder.appendPrefix(null, null); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42097);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatAppend_PrinterParserThenClear1756() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),42098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5lcxwhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParserThenClear1756",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5lcxwhe(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(42098); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42099);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42100);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42101);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42102);assertNull(bld.toPrinter()); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42103);assertNull(bld.toParser()); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42104);bld.clear(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42105);bld.appendMonths(); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42106);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42107);assertNotNull(bld.toParser()); 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_null_null1769() {__CLR4_4_1w7zw7zlc8axf80.R.globalSliceStart(getClass().getName(),42108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18rlzbhwho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7zw7zlc8axf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7zw7zlc8axf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_null1769",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18rlzbhwho(){try{__CLR4_4_1w7zw7zlc8axf80.R.inc(42108); 
     __CLR4_4_1w7zw7zlc8axf80.R.inc(42109);try { 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42110);new PeriodFormatterBuilder().append(null, null); 
         __CLR4_4_1w7zw7zlc8axf80.R.inc(42111);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1w7zw7zlc8axf80.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

}
