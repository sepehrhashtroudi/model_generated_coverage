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
public class TestPeriodFormatterBuilder extends TestCase {static class __CLR4_4_1m98m98le6o7ai5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,29000,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
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

    public static void main(String[] args) {try{__CLR4_4_1m98m98le6o7ai5.R.inc(28844);
        __CLR4_4_1m98m98le6o7ai5.R.inc(28845);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m98m98le6o7ai5.R.inc(28846);
        __CLR4_4_1m98m98le6o7ai5.R.inc(28847);return new TestSuite(TestPeriodFormatterBuilder.class);
    }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}

    public TestPeriodFormatterBuilder(String name) {
        super(name);__CLR4_4_1m98m98le6o7ai5.R.inc(28849);try{__CLR4_4_1m98m98le6o7ai5.R.inc(28848);
    }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m98m98le6o7ai5.R.inc(28850);
        __CLR4_4_1m98m98le6o7ai5.R.inc(28851);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m98m98le6o7ai5.R.inc(28852);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1m98m98le6o7ai5.R.inc(28853);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1m98m98le6o7ai5.R.inc(28854);originalLocale = Locale.getDefault();
        __CLR4_4_1m98m98le6o7ai5.R.inc(28855);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m98m98le6o7ai5.R.inc(28856);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1m98m98le6o7ai5.R.inc(28857);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1m98m98le6o7ai5.R.inc(28858);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m98m98le6o7ai5.R.inc(28859);
        __CLR4_4_1m98m98le6o7ai5.R.inc(28860);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m98m98le6o7ai5.R.inc(28861);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1m98m98le6o7ai5.R.inc(28862);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1m98m98le6o7ai5.R.inc(28863);Locale.setDefault(originalLocale);
        __CLR4_4_1m98m98le6o7ai5.R.inc(28864);originalDateTimeZone = null;
        __CLR4_4_1m98m98le6o7ai5.R.inc(28865);originalTimeZone = null;
        __CLR4_4_1m98m98le6o7ai5.R.inc(28866);originalLocale = null;
    }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFormatSuffixSimple258() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18avi28m9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18avi28m9v(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28867); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28868);PeriodFormatter f = builder.appendHours().appendSuffix(" hours").toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28869);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28870);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28871);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28872);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28873);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28874);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28875);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testFormatAppend_PrinterParser_null_Parser59() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jphilcma4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_Parser59",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jphilcma4(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28876); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28877);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28878);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(null, parser).appendMonths(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28879);assertNull(bld.toPrinter()); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28880);assertNotNull(bld.toParser()); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28881);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28882);try { 
         __CLR4_4_1m98m98le6o7ai5.R.inc(28883);f.print(PERIOD); 
         __CLR4_4_1m98m98le6o7ai5.R.inc(28884);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28885);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testFormatPrefixSimple260() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k57cw6mae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k57cw6mae(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28886); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28887);PeriodFormatter f = builder.appendPrefix("Hours:").appendHours().toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28888);assertEquals("Hours:5", f.print(PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28889);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28890);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28891);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28892);assertEquals("Hours:0", f.print(p)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28893);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28894);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testFormatSeparatorIfFieldsAfter61() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eoppo4man();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsAfter61",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eoppo4man(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28895); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28896);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsAfter("T").appendHours().toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28897);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28898);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28899);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28900);assertEquals("T5", f.print(TIME_PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28901);assertEquals(2, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28902);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28903);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28904);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28905);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testFormatAppend_PrinterParser_PrinterParser62() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmzbi2may();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_PrinterParser62",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmzbi2may(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28906); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28907);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28908);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28909);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, parser).appendMonths(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28910);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28911);assertNotNull(bld.toParser()); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28912);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28913);assertEquals("1-2", f.print(PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28914);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testFormatAppend_PrinterParserThenClear63() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16hih1zmb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParserThenClear63",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16hih1zmb7(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28915); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28916);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28917);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28918);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28919);assertNull(bld.toPrinter()); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28920);assertNull(bld.toParser()); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28921);bld.clear(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28922);bld.appendMonths(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28923);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28924);assertNotNull(bld.toParser()); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testBug249545564() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gz0g8pmbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testBug249545564",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gz0g8pmbh(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28925); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28926);PeriodFormatter pfmt1 = new PeriodFormatterBuilder().appendLiteral("P").appendYears().appendSuffix("Y").appendMonths().appendSuffix("M").appendWeeks().appendSuffix("W").appendDays().appendSuffix("D").appendSeparatorIfFieldsAfter("T").appendHours().appendSuffix("H").appendMinutes().appendSuffix("M").appendSecondsWithOptionalMillis().appendSuffix("S").toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28927);PeriodFormatter pfmt2 = new PeriodFormatterBuilder().append(ISOPeriodFormat.standard()).toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28928);pfmt1.parsePeriod("PT1003199059S"); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28929);pfmt2.parsePeriod("PT1003199059S"); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testFormatLiteral67() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4u48embm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatLiteral67",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4u48embm(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28930); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28931);PeriodFormatter f = builder.appendLiteral("P").appendYears().toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28932);assertEquals("P1Y2M", f.print(PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28933);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28934);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28935);assertEquals("PT1003199059S", f.print(TIME_PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28936);assertEquals(2001, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28937);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28938);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28939);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28940);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testFormatPrintZeroIfSupported68() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxo68embx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroIfSupported68",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxo68embx(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28941); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28942);PeriodFormatter f = new PeriodFormatterBuilder().printZeroIfSupported().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28943);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28944);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28945);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28946);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28947);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28948);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28949);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28950);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28951);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28952);assertEquals("0---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28953);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28954);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testFormatSuffixPlural269() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19siucemcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19siucemcb(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28955); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28956);PeriodFormatter f = builder.appendHours().appendSuffix(" hour", " hours").toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28957);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28958);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28959);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28960);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28961);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28962);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28963);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testFormatSuffixPlural370() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184jcwlmck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural370",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184jcwlmck(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28964); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28965);try { 
         __CLR4_4_1m98m98le6o7ai5.R.inc(28966);builder.appendSuffix(" hour", " hours"); 
         __CLR4_4_1m98m98le6o7ai5.R.inc(28967);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28968);try { 
         __CLR4_4_1m98m98le6o7ai5.R.inc(28969);builder.appendSuffix(" hours", null); 
         __CLR4_4_1m98m98le6o7ai5.R.inc(28970);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28971);try { 
         __CLR4_4_1m98m98le6o7ai5.R.inc(28972);builder.appendSuffix(" hours", null); 
         __CLR4_4_1m98m98le6o7ai5.R.inc(28973);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testFormatPrintZeroAlways71() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bddu10mcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroAlways71",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bddu10mcu(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28974); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28975);PeriodFormatter f = new PeriodFormatterBuilder().printZeroAlways().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28976);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28977);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28978);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28979);assertEquals("0-0-0-0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28980);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28981);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28982);assertEquals("1-0-0-4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28983);assertEquals(7, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28984);assertEquals(4, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28985);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28986);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28987);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testFormatMillis3Digit72() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1vw45md8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis3Digit72",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1vw45md8(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28988); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28989);PeriodFormatter f = builder.appendMillis3Digit().toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28990);assertEquals("123", f.print(PERIOD)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28991);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28992);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28993);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28994);assertEquals("0", f.print(p)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28995);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28996);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
public void testFormatPrintZeroRarelyFirstSeconds75() {__CLR4_4_1m98m98le6o7ai5.R.globalSliceStart(getClass().getName(),28997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15rv4wfmdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m98m98le6o7ai5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m98m98le6o7ai5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstSeconds75",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15rv4wfmdh(){try{__CLR4_4_1m98m98le6o7ai5.R.inc(28997); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28998);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendSeconds().toFormatter(); 
     __CLR4_4_1m98m98le6o7ai5.R.inc(28999);assertEquals("0", f.print(EMPTY_PERIOD)); 
 }finally{__CLR4_4_1m98m98le6o7ai5.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

}
