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
public class TestPeriodFormatterBuilder extends TestCase {static class __CLR4_4_1magmagle6nl8rk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,28999,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
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

    public static void main(String[] args) {try{__CLR4_4_1magmagle6nl8rk.R.inc(28888);
        __CLR4_4_1magmagle6nl8rk.R.inc(28889);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1magmagle6nl8rk.R.inc(28890);
        __CLR4_4_1magmagle6nl8rk.R.inc(28891);return new TestSuite(TestPeriodFormatterBuilder.class);
    }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}

    public TestPeriodFormatterBuilder(String name) {
        super(name);__CLR4_4_1magmagle6nl8rk.R.inc(28893);try{__CLR4_4_1magmagle6nl8rk.R.inc(28892);
    }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1magmagle6nl8rk.R.inc(28894);
        __CLR4_4_1magmagle6nl8rk.R.inc(28895);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1magmagle6nl8rk.R.inc(28896);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1magmagle6nl8rk.R.inc(28897);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1magmagle6nl8rk.R.inc(28898);originalLocale = Locale.getDefault();
        __CLR4_4_1magmagle6nl8rk.R.inc(28899);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1magmagle6nl8rk.R.inc(28900);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1magmagle6nl8rk.R.inc(28901);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1magmagle6nl8rk.R.inc(28902);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1magmagle6nl8rk.R.inc(28903);
        __CLR4_4_1magmagle6nl8rk.R.inc(28904);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1magmagle6nl8rk.R.inc(28905);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1magmagle6nl8rk.R.inc(28906);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1magmagle6nl8rk.R.inc(28907);Locale.setDefault(originalLocale);
        __CLR4_4_1magmagle6nl8rk.R.inc(28908);originalDateTimeZone = null;
        __CLR4_4_1magmagle6nl8rk.R.inc(28909);originalTimeZone = null;
        __CLR4_4_1magmagle6nl8rk.R.inc(28910);originalLocale = null;
    }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testAppend_PrinterParser_Printer_null_null_Parser86() {__CLR4_4_1magmagle6nl8rk.R.globalSliceStart(getClass().getName(),28911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17yqvrymb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1magmagle6nl8rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1magmagle6nl8rk.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testAppend_PrinterParser_Printer_null_null_Parser86",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17yqvrymb3(){try{__CLR4_4_1magmagle6nl8rk.R.inc(28911); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28912);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28913);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28914);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28915);assertNull(bld.toPrinter()); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28916);assertNull(bld.toParser()); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28917);try { 
         __CLR4_4_1magmagle6nl8rk.R.inc(28918);bld.toFormatter(); 
         __CLR4_4_1magmagle6nl8rk.R.inc(28919);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}
public void testFormatPrintZeroRarelyLast87() {__CLR4_4_1magmagle6nl8rk.R.globalSliceStart(getClass().getName(),28920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17x8g89mbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1magmagle6nl8rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1magmagle6nl8rk.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyLast87",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17x8g89mbc(){try{__CLR4_4_1magmagle6nl8rk.R.inc(28920); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28921);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyLast().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28922);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28923);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28924);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28925);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28926);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28927);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28928);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28929);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28930);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28931);assertEquals("0---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28932);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28933);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}
public void testFormatSuffixSimple289() {__CLR4_4_1magmagle6nl8rk.R.globalSliceStart(getClass().getName(),28934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2l4dqmbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1magmagle6nl8rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1magmagle6nl8rk.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2l4dqmbq(){try{__CLR4_4_1magmagle6nl8rk.R.inc(28934); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28935);PeriodFormatter f = builder.appendHours().appendSuffix(" hours").toFormatter(); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28936);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28937);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28938);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28939);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28940);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28941);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28942);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}
public void testFormatSeparatorIfFieldsAfter90() {__CLR4_4_1magmagle6nl8rk.R.globalSliceStart(getClass().getName(),28943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qz6wmbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1magmagle6nl8rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1magmagle6nl8rk.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsAfter90",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qz6wmbz(){try{__CLR4_4_1magmagle6nl8rk.R.inc(28943); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28944);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsAfter("T").appendHours().toFormatter(); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28945);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28946);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28947);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28948);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28949);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28950);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28951);assertEquals("1T", f.print(DATE_PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28952);assertEquals(2, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28953);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}
public void testFormatSeparatorSimple91() {__CLR4_4_1magmagle6nl8rk.R.globalSliceStart(getClass().getName(),28954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iv3sfhmca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1magmagle6nl8rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1magmagle6nl8rk.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorSimple91",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iv3sfhmca(){try{__CLR4_4_1magmagle6nl8rk.R.inc(28954); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28955);PeriodFormatter f = builder.appendYears().appendSeparator("T").appendHours().toFormatter(); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28956);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28957);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28958);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28959);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28960);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28961);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28962);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28963);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28964);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}
public void testFormatPrefixSimple293() {__CLR4_4_1magmagle6nl8rk.R.globalSliceStart(getClass().getName(),28965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0g522mcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1magmagle6nl8rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1magmagle6nl8rk.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0g522mcl(){try{__CLR4_4_1magmagle6nl8rk.R.inc(28965); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28966);PeriodFormatter f = builder.appendPrefix("Hours:").appendHours().toFormatter(); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28967);assertEquals("Hours:5", f.print(PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28968);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28969);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28970);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28971);assertEquals("Hours:0", f.print(p)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28972);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28973);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}
public void testBug249545595() {__CLR4_4_1magmagle6nl8rk.R.globalSliceStart(getClass().getName(),28974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1womzahmcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1magmagle6nl8rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1magmagle6nl8rk.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testBug249545595",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1womzahmcu(){try{__CLR4_4_1magmagle6nl8rk.R.inc(28974); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28975);PeriodFormatter pfmt1 = new PeriodFormatterBuilder().appendLiteral("P").appendYears().appendSuffix("Y").appendMonths().appendSuffix("M").appendWeeks().appendSuffix("W").appendDays().appendSuffix("D").appendSeparatorIfFieldsAfter("T").appendHours().appendSuffix("H").appendMinutes().appendSuffix("M").appendSecondsWithOptionalMillis().appendSuffix("S").toFormatter(); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28976);PeriodFormatter pfmt2 = new PeriodFormatterBuilder().append(ISOPeriodFormat.standard()).toFormatter(); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28977);pfmt1.parsePeriod("PT1003199059S"); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28978);pfmt2.parsePeriod("PT1003199059S"); 
 }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}
public void testFormatSeparatorIfFieldsBefore98() {__CLR4_4_1magmagle6nl8rk.R.globalSliceStart(getClass().getName(),28979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146ynh3mcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1magmagle6nl8rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1magmagle6nl8rk.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsBefore98",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146ynh3mcz(){try{__CLR4_4_1magmagle6nl8rk.R.inc(28979); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28980);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsBefore("T").appendHours().toFormatter(); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28981);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28982);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28983);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28984);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28985);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28986);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28987);assertEquals("1T", f.print(DATE_PERIOD)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28988);assertEquals(2, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28989);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}
public void testFormatAppend_PrinterParser_Printer_null_null_Parser99() {__CLR4_4_1magmagle6nl8rk.R.globalSliceStart(getClass().getName(),28990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uktt77mda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1magmagle6nl8rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1magmagle6nl8rk.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null_null_Parser99",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uktt77mda(){try{__CLR4_4_1magmagle6nl8rk.R.inc(28990); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28991);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28992);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28993);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28994);assertNull(bld.toPrinter()); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28995);assertNull(bld.toParser()); 
     __CLR4_4_1magmagle6nl8rk.R.inc(28996);try { 
         __CLR4_4_1magmagle6nl8rk.R.inc(28997);bld.toFormatter(); 
         __CLR4_4_1magmagle6nl8rk.R.inc(28998);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1magmagle6nl8rk.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

}
