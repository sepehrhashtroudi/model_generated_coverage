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
public class TestPeriodFormatterBuilder extends TestCase {static class __CLR4_4_1u6iu6ile6qsfqp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,39396,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
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

    public static void main(String[] args) {try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39114);
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39115);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39116);
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39117);return new TestSuite(TestPeriodFormatterBuilder.class);
    }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}}

    public TestPeriodFormatterBuilder(String name) {
        super(name);__CLR4_4_1u6iu6ile6qsfqp.R.inc(39119);try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39118);
    }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39120);
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39121);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39122);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39123);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39124);originalLocale = Locale.getDefault();
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39125);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39126);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39127);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39128);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39129);
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39130);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39131);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39132);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39133);Locale.setDefault(originalLocale);
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39134);originalDateTimeZone = null;
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39135);originalTimeZone = null;
        __CLR4_4_1u6iu6ile6qsfqp.R.inc(39136);originalLocale = null;
    }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormatSuffixPlural256() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tobykku75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural256",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tobykku75(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39137); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39138);PeriodFormatter f = builder.appendHours().appendSuffix(" hour", " hours").toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39139);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39140);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39141);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39142);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39143);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39144);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39145);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_Printer_null_null_Parser137() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fc4unqu7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null_null_Parser137",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fc4unqu7e(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39146); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39147);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39148);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39149);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39150);assertNull(bld.toPrinter()); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39151);assertNull(bld.toParser()); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39152);try { 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39153);bld.toFormatter(); 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39154);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatPrefixSimple2138() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_159dpa0u7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple2138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_159dpa0u7n(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39155); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39156);PeriodFormatter f = builder.appendPrefix("Hours:").appendHours().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39157);assertEquals("Hours:5", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39158);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39159);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39160);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39161);assertEquals("Hours:0", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39162);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39163);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatAppend_PrinterParserThenClear139() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16tu2qdu7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParserThenClear139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16tu2qdu7w(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39164); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39165);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39166);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39167);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39168);assertNull(bld.toPrinter()); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39169);assertNull(bld.toParser()); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39170);bld.clear(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39171);bld.appendMonths(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39172);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39173);assertNotNull(bld.toParser()); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testBug2495455140() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14v7b1cu86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testBug2495455140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14v7b1cu86(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39174); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39175);PeriodFormatter pfmt1 = new PeriodFormatterBuilder().appendLiteral("P").appendYears().appendSuffix("Y").appendMonths().appendSuffix("M").appendWeeks().appendSuffix("W").appendDays().appendSuffix("D").appendSeparatorIfFieldsAfter("T").appendHours().appendSuffix("H").appendMinutes().appendSuffix("M").appendSecondsWithOptionalMillis().appendSuffix("S").toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39176);PeriodFormatter pfmt2 = new PeriodFormatterBuilder().append(ISOPeriodFormat.standard()).toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39177);pfmt1.parsePeriod("PT1003199059S"); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39178);pfmt2.parsePeriod("PT1003199059S"); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatMinDigits141() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11lohc6u8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMinDigits141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11lohc6u8b(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39179); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39180);PeriodFormatter f = new PeriodFormatterBuilder().minimumPrintedDigits(4).appendYears().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39181);assertEquals("0001", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39182);assertEquals(4, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39183);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirst142() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdcjghu8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirst142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdcjghu8g(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39184); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39185);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39186);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39187);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39188);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39189);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39190);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39191);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39192);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39193);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39194);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39195);assertEquals("0---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39196);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39197);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatPrintZeroIfSupported143() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hj98xau8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroIfSupported143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hj98xau8u(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39198); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39199);PeriodFormatter f = new PeriodFormatterBuilder().printZeroIfSupported().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39200);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39201);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39202);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39203);assertEquals("0---0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39204);assertEquals(5, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39205);assertEquals(2, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39206);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39207);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39208);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39209);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39210);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39211);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatPrintZeroAlways144() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1btkc2lu98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroAlways144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1btkc2lu98(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39212); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39213);PeriodFormatter f = new PeriodFormatterBuilder().printZeroAlways().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39214);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39215);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39216);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39217);assertEquals("0-0-0-0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39218);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39219);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39220);assertEquals("1-0-0-4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39221);assertEquals(7, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39222);assertEquals(4, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39223);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39224);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39225);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatPrintZeroNever145() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bucxuhu9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroNever145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bucxuhu9m(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39226); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39227);PeriodFormatter f = new PeriodFormatterBuilder().printZeroNever().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39228);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39229);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39230);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39231);assertEquals("---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39232);assertEquals(3, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39233);assertEquals(0, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39234);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39235);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39236);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39237);assertEquals("---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39238);assertEquals(3, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39239);assertEquals(0, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatPrefixSimple3146() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xbxbg4ua0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple3146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xbxbg4ua0(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39240); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39241);try { 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39242);builder.appendPrefix(null); 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39243);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatPrefixPlural2147() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136bbvcua4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural2147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136bbvcua4(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39244); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39245);PeriodFormatter f = builder.appendPrefix("Hour:", "Hours:").appendHours().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39246);assertEquals("Hours:5", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39247);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39248);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39249);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39250);assertEquals("Hours:0", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39251);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39252);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatPrefixPlural3148() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14xda4ouad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural3148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14xda4ouad(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39253); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39254);try { 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39255);builder.appendPrefix(null, ""); 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39256);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39257);try { 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39258);builder.appendPrefix("", null); 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39259);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39260);try { 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39261);builder.appendPrefix(null, null); 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39262);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatSuffixPlural1149() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8m9aiuan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural1149",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8m9aiuan(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39263); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39264);PeriodFormatter f = builder.appendYears().appendSuffix(" year", " years").toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39265);assertEquals("1 year", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39266);assertEquals(6, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39267);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39268);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39269);assertEquals("0 years", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39270);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39271);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatSecondsWithMillis150() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3bojzuaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSecondsWithMillis150",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3bojzuaw(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39272); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39273);PeriodFormatter f = builder.appendSecondsWithMillis().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39274);Period p = new Period(0, 0, 0, 0, 0, 0, 7, 0); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39275);assertEquals("7.000", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39276);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39277);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39278);p = new Period(0, 0, 0, 0, 0, 0, 7, 1); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39279);assertEquals("7.001", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39280);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39281);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39282);p = new Period(0, 0, 0, 0, 0, 0, 7, 999); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39283);assertEquals("7.999", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39284);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39285);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39286);p = new Period(0, 0, 0, 0, 0, 0, 7, 1000); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39287);assertEquals("8.000", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39288);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39289);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39290);p = new Period(0, 0, 0, 0, 0, 0, 7, 1001); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39291);assertEquals("8.001", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39292);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39293);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39294);p = new Period(0, 0, 0, 0, 0, 0, 7, -1); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39295);assertEquals("6.999", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39296);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39297);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39298);p = new Period(0, 0, 0, 0, 0, 0, -7, 1); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39299);assertEquals("-6.999", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39300);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39301);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39302);p = new Period(0, 0, 0, 0, 0, 0, -7, -1); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39303);assertEquals("-7.001", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39304);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39305);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39306);p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39307);assertEquals("0.000", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39308);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39309);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatMillis151() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lfx3aduby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis151",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lfx3aduby(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39310); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39311);PeriodFormatter f = builder.appendMillis().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39312);assertEquals("8", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39313);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39314);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39315);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39316);assertEquals("0", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39317);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39318);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatMillis3Digit152() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj55jguc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis3Digit152",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj55jguc7(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39319); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39320);PeriodFormatter f = builder.appendMillis3Digit().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39321);assertEquals("008", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39322);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39323);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39324);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39325);assertEquals("000", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39326);assertEquals(3, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39327);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatSuffixSimple2153() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17te2s0ucg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple2153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17te2s0ucg(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39328); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39329);PeriodFormatter f = builder.appendHours().appendSuffix(" hours").toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39330);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39331);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39332);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39333);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39334);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39335);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39336);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatSuffixSimple3154() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aaj80ucp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple3154",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aaj80ucp(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39337); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39338);try { 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39339);builder.appendSuffix(null); 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39340);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatSuffixPlural3155() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd9gvxuct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural3155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd9gvxuct(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39341); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39342);try { 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39343);builder.appendSuffix(null, ""); 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39344);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39345);try { 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39346);builder.appendSuffix("", null); 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39347);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39348);try { 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39349);builder.appendSuffix(null, null); 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39350);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatSeparatorSimple156() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14t9vjpud3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorSimple156",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14t9vjpud3(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39351); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39352);PeriodFormatter f = builder.appendYears().appendSeparator("T").appendHours().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39353);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39354);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39355);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39356);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39357);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39358);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39359);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39360);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39361);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatSeparatorIfFieldsBefore157() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3p0dzude();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsBefore157",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3p0dzude(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39362); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39363);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsBefore("T").appendHours().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39364);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39365);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39366);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39367);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39368);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39369);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39370);assertEquals("1T", f.print(DATE_PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39371);assertEquals(2, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39372);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_null_Parser159() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_123e9ztudp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_Parser159",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_123e9ztudp(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39373); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39374);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39375);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(null, parser).appendMonths(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39376);assertNull(bld.toPrinter()); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39377);assertNotNull(bld.toParser()); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39378);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39379);try { 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39380);f.print(PERIOD); 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39381);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39382);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_Printer_null160() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ycnj7gudz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ycnj7gudz(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39383); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39384);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39385);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).appendMonths(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39386);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39387);assertNull(bld.toParser()); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39388);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39389);assertEquals("1-2", f.print(PERIOD)); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39390);try { 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39391);f.parsePeriod("1-2"); 
         __CLR4_4_1u6iu6ile6qsfqp.R.inc(39392);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirstMinutes167() {__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceStart(getClass().getName(),39393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130d9qpue9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u6iu6ile6qsfqp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u6iu6ile6qsfqp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstMinutes167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130d9qpue9(){try{__CLR4_4_1u6iu6ile6qsfqp.R.inc(39393); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39394);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendMinutes().toFormatter(); 
     __CLR4_4_1u6iu6ile6qsfqp.R.inc(39395);assertEquals("0", f.print(EMPTY_PERIOD)); 
 }finally{__CLR4_4_1u6iu6ile6qsfqp.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

}
