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
public class TestPeriodFormatterBuilder extends TestCase {static class __CLR4_4_1u6hu6hle6rcn6z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,39451,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
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

    public static void main(String[] args) {try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39113);
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39114);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39115);
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39116);return new TestSuite(TestPeriodFormatterBuilder.class);
    }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}}

    public TestPeriodFormatterBuilder(String name) {
        super(name);__CLR4_4_1u6hu6hle6rcn6z.R.inc(39118);try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39117);
    }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39119);
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39120);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39121);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39122);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39123);originalLocale = Locale.getDefault();
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39124);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39125);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39126);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39127);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39128);
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39129);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39130);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39131);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39132);Locale.setDefault(originalLocale);
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39133);originalDateTimeZone = null;
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39134);originalTimeZone = null;
        __CLR4_4_1u6hu6hle6rcn6z.R.inc(39135);originalLocale = null;
    }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormatAppend_PrinterParser_Printer_null_null_Parser152() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ci986pu74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null_null_Parser152",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ci986pu74(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39136); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39137);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39138);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39139);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39140);assertNull(bld.toPrinter()); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39141);assertNull(bld.toParser()); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39142);try { 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39143);bld.toFormatter(); 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39144);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testBug2495455153() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qp1y0uu7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testBug2495455153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qp1y0uu7d(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39145); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39146);PeriodFormatter pfmt1 = new PeriodFormatterBuilder().appendLiteral("P").appendYears().appendSuffix("Y").appendMonths().appendSuffix("M").appendWeeks().appendSuffix("W").appendDays().appendSuffix("D").appendSeparatorIfFieldsAfter("T").appendHours().appendSuffix("H").appendMinutes().appendSuffix("M").appendSecondsWithOptionalMillis().appendSuffix("S").toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39147);PeriodFormatter pfmt2 = new PeriodFormatterBuilder().append(ISOPeriodFormat.standard()).toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39148);pfmt1.parsePeriod("PT1003199059S"); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39149);pfmt2.parsePeriod("PT1003199059S"); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_null_null154() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4xha2u7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_null154",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4xha2u7i(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39150); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39151);try { 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39152);new PeriodFormatterBuilder().append(null, null); 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39153);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatMinDigits155() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpksxju7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMinDigits155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpksxju7m(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39154); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39155);PeriodFormatter f = new PeriodFormatterBuilder().minimumPrintedDigits(4).appendYears().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39156);assertEquals("0001", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39157);assertEquals(4, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39158);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyLast156() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l88ofsu7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyLast156",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l88ofsu7r(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39159); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39160);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyLast().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39161);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39162);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39163);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39164);assertEquals("---0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39165);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39166);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39167);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39168);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39169);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39170);assertEquals("---0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39171);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39172);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirst157() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ows0ru85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirst157",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ows0ru85(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39173); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39174);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39175);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39176);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39177);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39178);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39179);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39180);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39181);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39182);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39183);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39184);assertEquals("0---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39185);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39186);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatPrintZeroIfSupported158() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sflhkmu8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroIfSupported158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sflhkmu8j(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39187); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39188);PeriodFormatter f = new PeriodFormatterBuilder().printZeroIfSupported().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39189);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39190);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39191);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39192);assertEquals("0---0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39193);assertEquals(5, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39194);assertEquals(2, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39195);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39196);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39197);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39198);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39199);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39200);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatPrintZeroAlways159() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8ozenu8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroAlways159",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8ozenu8x(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39201); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39202);PeriodFormatter f = new PeriodFormatterBuilder().printZeroAlways().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39203);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39204);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39205);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39206);assertEquals("0-0-0-0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39207);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39208);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39209);assertEquals("1-0-0-4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39210);assertEquals(7, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39211);assertEquals(4, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39212);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39213);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39214);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatPrintZeroNever160() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g014zyu9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroNever160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g014zyu9b(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39215); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39216);PeriodFormatter f = new PeriodFormatterBuilder().printZeroNever().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39217);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39218);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39219);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39220);assertEquals("---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39221);assertEquals(3, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39222);assertEquals(0, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39223);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39224);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39225);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39226);assertEquals("---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39227);assertEquals(3, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39228);assertEquals(0, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatPrefixSimple3161() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15hj8lpu9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple3161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15hj8lpu9p(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39229); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39230);try { 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39231);builder.appendPrefix(null); 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39232);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatPrefixPlural2162() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v0pepru9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural2162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v0pepru9t(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39233); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39234);PeriodFormatter f = builder.appendPrefix("Hour:", "Hours:").appendHours().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39235);assertEquals("Hours:5", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39236);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39237);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39238);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39239);assertEquals("Hours:0", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39240);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39241);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatPrefixPlural3163() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx0sprua2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural3163",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx0sprua2(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39242); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39243);try { 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39244);builder.appendPrefix(null, ""); 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39245);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39246);try { 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39247);builder.appendPrefix("", null); 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39248);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39249);try { 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39250);builder.appendPrefix(null, null); 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39251);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatSuffixPlural1164() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elrtjxuac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural1164",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elrtjxuac(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39252); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39253);PeriodFormatter f = builder.appendYears().appendSuffix(" year", " years").toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39254);assertEquals("1 year", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39255);assertEquals(6, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39256);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39257);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39258);assertEquals("0 years", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39259);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39260);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirstSeconds165() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a27t9vual();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstSeconds165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a27t9vual(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39261); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39262);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendSeconds().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39263);assertEquals("0", f.print(EMPTY_PERIOD)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatSecondsWithMillis166() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xwl18quao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSecondsWithMillis166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xwl18quao(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39264); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39265);PeriodFormatter f = builder.appendSecondsWithMillis().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39266);Period p = new Period(0, 0, 0, 0, 0, 0, 7, 0); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39267);assertEquals("7.000", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39268);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39269);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39270);p = new Period(0, 0, 0, 0, 0, 0, 7, 1); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39271);assertEquals("7.001", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39272);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39273);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39274);p = new Period(0, 0, 0, 0, 0, 0, 7, 999); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39275);assertEquals("7.999", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39276);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39277);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39278);p = new Period(0, 0, 0, 0, 0, 0, 7, 1000); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39279);assertEquals("8.000", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39280);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39281);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39282);p = new Period(0, 0, 0, 0, 0, 0, 7, 1001); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39283);assertEquals("8.001", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39284);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39285);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39286);p = new Period(0, 0, 0, 0, 0, 0, 7, -1); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39287);assertEquals("6.999", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39288);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39289);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39290);p = new Period(0, 0, 0, 0, 0, 0, -7, 1); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39291);assertEquals("-6.999", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39292);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39293);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39294);p = new Period(0, 0, 0, 0, 0, 0, -7, -1); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39295);assertEquals("-7.001", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39296);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39297);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39298);p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39299);assertEquals("0.000", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39300);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39301);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatMillis167() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dc9eeubq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dc9eeubq(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39302); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39303);PeriodFormatter f = builder.appendMillis().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39304);assertEquals("8", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39305);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39306);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39307);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39308);assertEquals("0", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39309);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39310);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatMillis3Digit168() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19a475bubz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis3Digit168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19a475bubz(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39311); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39312);PeriodFormatter f = builder.appendMillis3Digit().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39313);assertEquals("008", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39314);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39315);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39316);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39317);assertEquals("000", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39318);assertEquals(3, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39319);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatSuffixSimple2169() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmnfgruc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple2169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmnfgruc8(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39320); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39321);PeriodFormatter f = builder.appendHours().appendSuffix(" hours").toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39322);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39323);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39324);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39325);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39326);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39327);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39328);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatSuffixSimple3170() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ob3ktyuch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple3170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ob3ktyuch(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39329); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39330);try { 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39331);builder.appendSuffix(null); 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39332);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatSuffixPlural3171() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2gh19ucl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural3171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2gh19ucl(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39333); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39334);try { 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39335);builder.appendSuffix(null, ""); 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39336);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39337);try { 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39338);builder.appendSuffix("", null); 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39339);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39340);try { 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39341);builder.appendSuffix(null, null); 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39342);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatSuffixPlural4172() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n65319ucv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural4172",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n65319ucv(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39343); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39344);try { 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39345);builder.appendSuffix(" hour", " hours"); 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39346);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatSeparatorSimple173() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5o0t6ucz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorSimple173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5o0t6ucz(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39347); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39348);PeriodFormatter f = builder.appendYears().appendSeparator("T").appendHours().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39349);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39350);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39351);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39352);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39353);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39354);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39355);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39356);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39357);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatSeparatorIfFieldsAfter174() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13wxw2duda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsAfter174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13wxw2duda(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39358); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39359);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsAfter("T").appendHours().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39360);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39361);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39362);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39363);assertEquals("T5", f.print(TIME_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39364);assertEquals(2, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39365);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39366);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39367);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39368);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatSeparatorIfFieldsBefore175() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ru0v45udl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsBefore175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ru0v45udl(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39369); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39370);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsBefore("T").appendHours().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39371);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39372);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39373);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39374);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39375);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39376);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39377);assertEquals("1T", f.print(DATE_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39378);assertEquals(2, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39379);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatSeparatorComplex176() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mry6rnudw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorComplex176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mry6rnudw(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39380); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39381);PeriodFormatter f = builder.appendYears().appendSeparator(", ", " and ").appendHours().appendSeparator(", ", " and ").appendMinutes().appendSeparator(", ", " and ").toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39382);assertEquals("1, 5 and 6", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39383);assertEquals(10, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39384);assertEquals(3, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39385);assertEquals("5 and 6", f.print(TIME_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39386);assertEquals(7, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39387);assertEquals(2, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39388);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39389);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39390);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_Printer_null178() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ld73nvue7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null178",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ld73nvue7(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39391); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39392);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39393);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).appendMonths(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39394);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39395);assertNull(bld.toParser()); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39396);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39397);assertEquals("1-2", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39398);try { 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39399);f.parsePeriod("1-2"); 
         __CLR4_4_1u6hu6hle6rcn6z.R.inc(39400);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatSecondsWithOptionalMillis182() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9ma5sueh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSecondsWithOptionalMillis182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9ma5sueh(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39401); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39402);PeriodFormatter f = builder.appendSecondsWithOptionalMillis().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39403);Period p = new Period(0, 0, 0, 0, 0, 0, 7, 0); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39404);assertEquals("7", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39405);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39406);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39407);p = new Period(0, 0, 0, 0, 0, 0, 7, 1); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39408);assertEquals("7.001", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39409);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39410);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39411);p = new Period(0, 0, 0, 0, 0, 0, 7, 999); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39412);assertEquals("7.999", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39413);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39414);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39415);p = new Period(0, 0, 0, 0, 0, 0, 7, 1000); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39416);assertEquals("8", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39417);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39418);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39419);p = new Period(0, 0, 0, 0, 0, 0, 7, 1001); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39420);assertEquals("8.001", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39421);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39422);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39423);p = new Period(0, 0, 0, 0, 0, 0, 7, -1); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39424);assertEquals("6.999", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39425);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39426);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39427);p = new Period(0, 0, 0, 0, 0, 0, -7, 1); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39428);assertEquals("-6.999", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39429);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39430);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39431);p = new Period(0, 0, 0, 0, 0, 0, -7, -1); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39432);assertEquals("-7.001", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39433);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39434);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39435);p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39436);assertEquals("0", f.print(p)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39437);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39438);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_PrinterParser183() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uiym78ufj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_PrinterParser183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uiym78ufj(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39439); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39440);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39441);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39442);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, parser).appendMonths(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39443);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39444);assertNotNull(bld.toParser()); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39445);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39446);assertEquals("1-2", f.print(PERIOD)); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39447);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirstMinutes188() {__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceStart(getClass().getName(),39448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcrjuaufs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6hu6hle6rcn6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6hu6hle6rcn6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstMinutes188",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcrjuaufs(){try{__CLR4_4_1u6hu6hle6rcn6z.R.inc(39448); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39449);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendMinutes().toFormatter(); 
     __CLR4_4_1u6hu6hle6rcn6z.R.inc(39450);assertEquals("0", f.print(EMPTY_PERIOD)); 
 }finally{__CLR4_4_1u6hu6hle6rcn6z.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

}
