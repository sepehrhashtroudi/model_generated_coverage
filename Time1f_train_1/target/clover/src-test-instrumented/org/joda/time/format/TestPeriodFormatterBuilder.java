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
public class TestPeriodFormatterBuilder extends TestCase {static class __CLR4_4_1uebueble6qeavi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,39719,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
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

    public static void main(String[] args) {try{__CLR4_4_1uebueble6qeavi.R.inc(39395);
        __CLR4_4_1uebueble6qeavi.R.inc(39396);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1uebueble6qeavi.R.inc(39397);
        __CLR4_4_1uebueble6qeavi.R.inc(39398);return new TestSuite(TestPeriodFormatterBuilder.class);
    }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}}

    public TestPeriodFormatterBuilder(String name) {
        super(name);__CLR4_4_1uebueble6qeavi.R.inc(39400);try{__CLR4_4_1uebueble6qeavi.R.inc(39399);
    }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1uebueble6qeavi.R.inc(39401);
        __CLR4_4_1uebueble6qeavi.R.inc(39402);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1uebueble6qeavi.R.inc(39403);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1uebueble6qeavi.R.inc(39404);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1uebueble6qeavi.R.inc(39405);originalLocale = Locale.getDefault();
        __CLR4_4_1uebueble6qeavi.R.inc(39406);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1uebueble6qeavi.R.inc(39407);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1uebueble6qeavi.R.inc(39408);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1uebueble6qeavi.R.inc(39409);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1uebueble6qeavi.R.inc(39410);
        __CLR4_4_1uebueble6qeavi.R.inc(39411);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1uebueble6qeavi.R.inc(39412);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1uebueble6qeavi.R.inc(39413);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1uebueble6qeavi.R.inc(39414);Locale.setDefault(originalLocale);
        __CLR4_4_1uebueble6qeavi.R.inc(39415);originalDateTimeZone = null;
        __CLR4_4_1uebueble6qeavi.R.inc(39416);originalTimeZone = null;
        __CLR4_4_1uebueble6qeavi.R.inc(39417);originalLocale = null;
    }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormatSuffixPlural271() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1die0k5uey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1die0k5uey(){try{__CLR4_4_1uebueble6qeavi.R.inc(39418); 
     __CLR4_4_1uebueble6qeavi.R.inc(39419);PeriodFormatter f = builder.appendHours().appendSuffix(" hour", " hours").toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39420);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39421);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39422);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39423);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1uebueble6qeavi.R.inc(39424);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39425);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39426);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_Printer_null_null_Parser155() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12r9btauf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null_null_Parser155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12r9btauf7(){try{__CLR4_4_1uebueble6qeavi.R.inc(39427); 
     __CLR4_4_1uebueble6qeavi.R.inc(39428);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39429);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39430);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1uebueble6qeavi.R.inc(39431);assertNull(bld.toPrinter()); 
     __CLR4_4_1uebueble6qeavi.R.inc(39432);assertNull(bld.toParser()); 
     __CLR4_4_1uebueble6qeavi.R.inc(39433);try { 
         __CLR4_4_1uebueble6qeavi.R.inc(39434);bld.toFormatter(); 
         __CLR4_4_1uebueble6qeavi.R.inc(39435);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatPrefixSimple2156() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cu0h70ufg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple2156",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cu0h70ufg(){try{__CLR4_4_1uebueble6qeavi.R.inc(39436); 
     __CLR4_4_1uebueble6qeavi.R.inc(39437);PeriodFormatter f = builder.appendPrefix("Hours:").appendHours().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39438);assertEquals("Hours:5", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39439);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39440);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39441);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1uebueble6qeavi.R.inc(39442);assertEquals("Hours:0", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39443);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39444);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatAppend_PrinterParserThenClear157() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox897dufp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParserThenClear157",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox897dufp(){try{__CLR4_4_1uebueble6qeavi.R.inc(39445); 
     __CLR4_4_1uebueble6qeavi.R.inc(39446);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39447);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39448);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1uebueble6qeavi.R.inc(39449);assertNull(bld.toPrinter()); 
     __CLR4_4_1uebueble6qeavi.R.inc(39450);assertNull(bld.toParser()); 
     __CLR4_4_1uebueble6qeavi.R.inc(39451);bld.clear(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39452);bld.appendMonths(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39453);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1uebueble6qeavi.R.inc(39454);assertNotNull(bld.toParser()); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testBug2495455158() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ag242hufz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testBug2495455158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ag242hufz(){try{__CLR4_4_1uebueble6qeavi.R.inc(39455); 
     __CLR4_4_1uebueble6qeavi.R.inc(39456);PeriodFormatter pfmt1 = new PeriodFormatterBuilder().appendLiteral("P").appendYears().appendSuffix("Y").appendMonths().appendSuffix("M").appendWeeks().appendSuffix("W").appendDays().appendSuffix("D").appendSeparatorIfFieldsAfter("T").appendHours().appendSuffix("H").appendMinutes().appendSuffix("M").appendSecondsWithOptionalMillis().appendSuffix("S").toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39457);PeriodFormatter pfmt2 = new PeriodFormatterBuilder().append(ISOPeriodFormat.standard()).toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39458);pfmt1.parsePeriod("PT1003199059S"); 
     __CLR4_4_1uebueble6qeavi.R.inc(39459);pfmt2.parsePeriod("PT1003199059S"); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_null_null159() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdxb8fug4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_null159",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdxb8fug4(){try{__CLR4_4_1uebueble6qeavi.R.inc(39460); 
     __CLR4_4_1uebueble6qeavi.R.inc(39461);try { 
         __CLR4_4_1uebueble6qeavi.R.inc(39462);new PeriodFormatterBuilder().append(null, null); 
         __CLR4_4_1uebueble6qeavi.R.inc(39463);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatMinDigits160() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8pqcdug8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMinDigits160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8pqcdug8(){try{__CLR4_4_1uebueble6qeavi.R.inc(39464); 
     __CLR4_4_1uebueble6qeavi.R.inc(39465);PeriodFormatter f = new PeriodFormatterBuilder().minimumPrintedDigits(4).appendYears().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39466);assertEquals("0001", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39467);assertEquals(4, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39468);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyLast161() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17rdlumugd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyLast161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17rdlumugd(){try{__CLR4_4_1uebueble6qeavi.R.inc(39469); 
     __CLR4_4_1uebueble6qeavi.R.inc(39470);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyLast().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39471);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39472);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39473);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39474);assertEquals("---0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39475);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39476);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39477);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39478);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39479);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39480);assertEquals("---0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39481);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39482);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirst162() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ryakfugr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirst162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ryakfugr(){try{__CLR4_4_1uebueble6qeavi.R.inc(39483); 
     __CLR4_4_1uebueble6qeavi.R.inc(39484);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39485);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39486);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39487);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39488);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39489);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39490);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39491);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39492);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39493);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39494);assertEquals("0---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39495);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39496);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatPrintZeroIfSupported163() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4nhtcuh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroIfSupported163",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4nhtcuh5(){try{__CLR4_4_1uebueble6qeavi.R.inc(39497); 
     __CLR4_4_1uebueble6qeavi.R.inc(39498);PeriodFormatter f = new PeriodFormatterBuilder().printZeroIfSupported().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39499);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39500);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39501);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39502);assertEquals("0---0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39503);assertEquals(5, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39504);assertEquals(2, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39505);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39506);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39507);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39508);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39509);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39510);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatPrefixSimple3164() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8j4z4uhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple3164",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8j4z4uhj(){try{__CLR4_4_1uebueble6qeavi.R.inc(39511); 
     __CLR4_4_1uebueble6qeavi.R.inc(39512);try { 
         __CLR4_4_1uebueble6qeavi.R.inc(39513);builder.appendPrefix(null); 
         __CLR4_4_1uebueble6qeavi.R.inc(39514);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatPrefixPlural2165() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9piccuhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural2165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9piccuhn(){try{__CLR4_4_1uebueble6qeavi.R.inc(39515); 
     __CLR4_4_1uebueble6qeavi.R.inc(39516);PeriodFormatter f = builder.appendPrefix("Hour:", "Hours:").appendHours().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39517);assertEquals("Hours:5", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39518);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39519);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39520);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1uebueble6qeavi.R.inc(39521);assertEquals("Hours:0", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39522);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39523);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatPrefixPlural3166() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d60wccuhw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural3166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d60wccuhw(){try{__CLR4_4_1uebueble6qeavi.R.inc(39524); 
     __CLR4_4_1uebueble6qeavi.R.inc(39525);try { 
         __CLR4_4_1uebueble6qeavi.R.inc(39526);builder.appendPrefix(null, ""); 
         __CLR4_4_1uebueble6qeavi.R.inc(39527);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1uebueble6qeavi.R.inc(39528);try { 
         __CLR4_4_1uebueble6qeavi.R.inc(39529);builder.appendPrefix("", null); 
         __CLR4_4_1uebueble6qeavi.R.inc(39530);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1uebueble6qeavi.R.inc(39531);try { 
         __CLR4_4_1uebueble6qeavi.R.inc(39532);builder.appendPrefix(null, null); 
         __CLR4_4_1uebueble6qeavi.R.inc(39533);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatSuffixPlural1167() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14urx6iui6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural1167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14urx6iui6(){try{__CLR4_4_1uebueble6qeavi.R.inc(39534); 
     __CLR4_4_1uebueble6qeavi.R.inc(39535);PeriodFormatter f = builder.appendYears().appendSuffix(" year", " years").toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39536);assertEquals("1 year", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39537);assertEquals(6, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39538);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39539);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1uebueble6qeavi.R.inc(39540);assertEquals("0 years", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39541);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39542);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirstSeconds168() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7wwguif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstSeconds168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7wwguif(){try{__CLR4_4_1uebueble6qeavi.R.inc(39543); 
     __CLR4_4_1uebueble6qeavi.R.inc(39544);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendSeconds().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39545);assertEquals("0", f.print(EMPTY_PERIOD)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatSecondsWithMillis169() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o5l4vbuii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSecondsWithMillis169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o5l4vbuii(){try{__CLR4_4_1uebueble6qeavi.R.inc(39546); 
     __CLR4_4_1uebueble6qeavi.R.inc(39547);PeriodFormatter f = builder.appendSecondsWithMillis().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39548);Period p = new Period(0, 0, 0, 0, 0, 0, 7, 0); 
     __CLR4_4_1uebueble6qeavi.R.inc(39549);assertEquals("7.000", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39550);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39551);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39552);p = new Period(0, 0, 0, 0, 0, 0, 7, 1); 
     __CLR4_4_1uebueble6qeavi.R.inc(39553);assertEquals("7.001", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39554);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39555);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39556);p = new Period(0, 0, 0, 0, 0, 0, 7, 999); 
     __CLR4_4_1uebueble6qeavi.R.inc(39557);assertEquals("7.999", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39558);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39559);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39560);p = new Period(0, 0, 0, 0, 0, 0, 7, 1000); 
     __CLR4_4_1uebueble6qeavi.R.inc(39561);assertEquals("8.000", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39562);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39563);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39564);p = new Period(0, 0, 0, 0, 0, 0, 7, 1001); 
     __CLR4_4_1uebueble6qeavi.R.inc(39565);assertEquals("8.001", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39566);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39567);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39568);p = new Period(0, 0, 0, 0, 0, 0, 7, -1); 
     __CLR4_4_1uebueble6qeavi.R.inc(39569);assertEquals("6.999", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39570);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39571);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39572);p = new Period(0, 0, 0, 0, 0, 0, -7, 1); 
     __CLR4_4_1uebueble6qeavi.R.inc(39573);assertEquals("-6.999", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39574);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39575);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39576);p = new Period(0, 0, 0, 0, 0, 0, -7, -1); 
     __CLR4_4_1uebueble6qeavi.R.inc(39577);assertEquals("-7.001", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39578);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39579);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39580);p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1uebueble6qeavi.R.inc(39581);assertEquals("0.000", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39582);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39583);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatMillis170() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16livluujk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16livluujk(){try{__CLR4_4_1uebueble6qeavi.R.inc(39584); 
     __CLR4_4_1uebueble6qeavi.R.inc(39585);PeriodFormatter f = builder.appendMillis().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39586);assertEquals("8", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39587);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39588);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39589);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1uebueble6qeavi.R.inc(39590);assertEquals("0", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39591);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39592);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatMillis3Digit171() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12b9253ujt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis3Digit171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12b9253ujt(){try{__CLR4_4_1uebueble6qeavi.R.inc(39593); 
     __CLR4_4_1uebueble6qeavi.R.inc(39594);PeriodFormatter f = builder.appendMillis3Digit().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39595);assertEquals("008", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39596);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39597);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39598);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1uebueble6qeavi.R.inc(39599);assertEquals("000", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39600);assertEquals(3, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39601);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatSuffixPlural3172() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibgftquk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural3172",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibgftquk2(){try{__CLR4_4_1uebueble6qeavi.R.inc(39602); 
     __CLR4_4_1uebueble6qeavi.R.inc(39603);try { 
         __CLR4_4_1uebueble6qeavi.R.inc(39604);builder.appendSuffix(null, ""); 
         __CLR4_4_1uebueble6qeavi.R.inc(39605);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1uebueble6qeavi.R.inc(39606);try { 
         __CLR4_4_1uebueble6qeavi.R.inc(39607);builder.appendSuffix("", null); 
         __CLR4_4_1uebueble6qeavi.R.inc(39608);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1uebueble6qeavi.R.inc(39609);try { 
         __CLR4_4_1uebueble6qeavi.R.inc(39610);builder.appendSuffix(null, null); 
         __CLR4_4_1uebueble6qeavi.R.inc(39611);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatSuffixPlural4173() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qf51tqukc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural4173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qf51tqukc(){try{__CLR4_4_1uebueble6qeavi.R.inc(39612); 
     __CLR4_4_1uebueble6qeavi.R.inc(39613);try { 
         __CLR4_4_1uebueble6qeavi.R.inc(39614);builder.appendSuffix(" hour", " hours"); 
         __CLR4_4_1uebueble6qeavi.R.inc(39615);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatSeparatorSimple174() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mwo20pukg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorSimple174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mwo20pukg(){try{__CLR4_4_1uebueble6qeavi.R.inc(39616); 
     __CLR4_4_1uebueble6qeavi.R.inc(39617);PeriodFormatter f = builder.appendYears().appendSeparator("T").appendHours().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39618);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39619);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39620);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39621);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39622);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39623);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39624);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39625);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39626);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatSeparatorIfFieldsAfter175() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxx9wukr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsAfter175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxx9wukr(){try{__CLR4_4_1uebueble6qeavi.R.inc(39627); 
     __CLR4_4_1uebueble6qeavi.R.inc(39628);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsAfter("T").appendHours().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39629);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39630);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39631);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39632);assertEquals("T5", f.print(TIME_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39633);assertEquals(2, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39634);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39635);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39636);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39637);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatSeparatorComplex176() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mry6rnul2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorComplex176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mry6rnul2(){try{__CLR4_4_1uebueble6qeavi.R.inc(39638); 
     __CLR4_4_1uebueble6qeavi.R.inc(39639);PeriodFormatter f = builder.appendYears().appendSeparator(", ", " and ").appendHours().appendSeparator(", ", " and ").appendMinutes().appendSeparator(", ", " and ").toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39640);assertEquals("1, 5 and 6", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39641);assertEquals(10, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39642);assertEquals(3, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39643);assertEquals("5 and 6", f.print(TIME_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39644);assertEquals(7, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39645);assertEquals(2, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39646);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39647);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39648);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_null_Parser178() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gxshoculd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_Parser178",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gxshoculd(){try{__CLR4_4_1uebueble6qeavi.R.inc(39649); 
     __CLR4_4_1uebueble6qeavi.R.inc(39650);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39651);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(null, parser).appendMonths(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39652);assertNull(bld.toPrinter()); 
     __CLR4_4_1uebueble6qeavi.R.inc(39653);assertNotNull(bld.toParser()); 
     __CLR4_4_1uebueble6qeavi.R.inc(39654);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39655);try { 
         __CLR4_4_1uebueble6qeavi.R.inc(39656);f.print(PERIOD); 
         __CLR4_4_1uebueble6qeavi.R.inc(39657);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1uebueble6qeavi.R.inc(39658);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_Printer_null179() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1om72gculn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null179",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1om72gculn(){try{__CLR4_4_1uebueble6qeavi.R.inc(39659); 
     __CLR4_4_1uebueble6qeavi.R.inc(39660);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39661);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).appendMonths(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39662);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1uebueble6qeavi.R.inc(39663);assertNull(bld.toParser()); 
     __CLR4_4_1uebueble6qeavi.R.inc(39664);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39665);assertEquals("1-2", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39666);try { 
         __CLR4_4_1uebueble6qeavi.R.inc(39667);f.parsePeriod("1-2"); 
         __CLR4_4_1uebueble6qeavi.R.inc(39668);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatSecondsWithOptionalMillis182() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9ma5sulx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSecondsWithOptionalMillis182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9ma5sulx(){try{__CLR4_4_1uebueble6qeavi.R.inc(39669); 
     __CLR4_4_1uebueble6qeavi.R.inc(39670);PeriodFormatter f = builder.appendSecondsWithOptionalMillis().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39671);Period p = new Period(0, 0, 0, 0, 0, 0, 7, 0); 
     __CLR4_4_1uebueble6qeavi.R.inc(39672);assertEquals("7", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39673);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39674);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39675);p = new Period(0, 0, 0, 0, 0, 0, 7, 1); 
     __CLR4_4_1uebueble6qeavi.R.inc(39676);assertEquals("7.001", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39677);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39678);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39679);p = new Period(0, 0, 0, 0, 0, 0, 7, 999); 
     __CLR4_4_1uebueble6qeavi.R.inc(39680);assertEquals("7.999", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39681);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39682);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39683);p = new Period(0, 0, 0, 0, 0, 0, 7, 1000); 
     __CLR4_4_1uebueble6qeavi.R.inc(39684);assertEquals("8", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39685);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39686);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39687);p = new Period(0, 0, 0, 0, 0, 0, 7, 1001); 
     __CLR4_4_1uebueble6qeavi.R.inc(39688);assertEquals("8.001", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39689);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39690);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39691);p = new Period(0, 0, 0, 0, 0, 0, 7, -1); 
     __CLR4_4_1uebueble6qeavi.R.inc(39692);assertEquals("6.999", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39693);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39694);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39695);p = new Period(0, 0, 0, 0, 0, 0, -7, 1); 
     __CLR4_4_1uebueble6qeavi.R.inc(39696);assertEquals("-6.999", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39697);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39698);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39699);p = new Period(0, 0, 0, 0, 0, 0, -7, -1); 
     __CLR4_4_1uebueble6qeavi.R.inc(39700);assertEquals("-7.001", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39701);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39702);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39703);p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1uebueble6qeavi.R.inc(39704);assertEquals("0", f.print(p)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39705);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39706);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_PrinterParser184() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9ynerumz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_PrinterParser184",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9ynerumz(){try{__CLR4_4_1uebueble6qeavi.R.inc(39707); 
     __CLR4_4_1uebueble6qeavi.R.inc(39708);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39709);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39710);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, parser).appendMonths(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39711);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1uebueble6qeavi.R.inc(39712);assertNotNull(bld.toParser()); 
     __CLR4_4_1uebueble6qeavi.R.inc(39713);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39714);assertEquals("1-2", f.print(PERIOD)); 
     __CLR4_4_1uebueble6qeavi.R.inc(39715);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirstMinutes188() {__CLR4_4_1uebueble6qeavi.R.globalSliceStart(getClass().getName(),39716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcrjuaun8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uebueble6qeavi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uebueble6qeavi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstMinutes188",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcrjuaun8(){try{__CLR4_4_1uebueble6qeavi.R.inc(39716); 
     __CLR4_4_1uebueble6qeavi.R.inc(39717);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendMinutes().toFormatter(); 
     __CLR4_4_1uebueble6qeavi.R.inc(39718);assertEquals("0", f.print(EMPTY_PERIOD)); 
 }finally{__CLR4_4_1uebueble6qeavi.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

}
