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
public class TestPeriodFormatterBuilder extends TestCase {static class __CLR4_4_1udhudhle6rjdtu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,39636,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
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

    public static void main(String[] args) {try{__CLR4_4_1udhudhle6rjdtu.R.inc(39365);
        __CLR4_4_1udhudhle6rjdtu.R.inc(39366);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1udhudhle6rjdtu.R.inc(39367);
        __CLR4_4_1udhudhle6rjdtu.R.inc(39368);return new TestSuite(TestPeriodFormatterBuilder.class);
    }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}}

    public TestPeriodFormatterBuilder(String name) {
        super(name);__CLR4_4_1udhudhle6rjdtu.R.inc(39370);try{__CLR4_4_1udhudhle6rjdtu.R.inc(39369);
    }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1udhudhle6rjdtu.R.inc(39371);
        __CLR4_4_1udhudhle6rjdtu.R.inc(39372);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1udhudhle6rjdtu.R.inc(39373);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1udhudhle6rjdtu.R.inc(39374);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1udhudhle6rjdtu.R.inc(39375);originalLocale = Locale.getDefault();
        __CLR4_4_1udhudhle6rjdtu.R.inc(39376);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1udhudhle6rjdtu.R.inc(39377);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1udhudhle6rjdtu.R.inc(39378);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1udhudhle6rjdtu.R.inc(39379);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1udhudhle6rjdtu.R.inc(39380);
        __CLR4_4_1udhudhle6rjdtu.R.inc(39381);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1udhudhle6rjdtu.R.inc(39382);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1udhudhle6rjdtu.R.inc(39383);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1udhudhle6rjdtu.R.inc(39384);Locale.setDefault(originalLocale);
        __CLR4_4_1udhudhle6rjdtu.R.inc(39385);originalDateTimeZone = null;
        __CLR4_4_1udhudhle6rjdtu.R.inc(39386);originalTimeZone = null;
        __CLR4_4_1udhudhle6rjdtu.R.inc(39387);originalLocale = null;
    }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormatSuffixPlural268() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jivjxue4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural268",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jivjxue4(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39388); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39389);PeriodFormatter f = builder.appendHours().appendSuffix(" hour", " hours").toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39390);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39391);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39392);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39393);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39394);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39395);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39396);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatPrefixSimple2158() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16c0jm2ued();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple2158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16c0jm2ued(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39397); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39398);PeriodFormatter f = builder.appendPrefix("Hours:").appendHours().toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39399);assertEquals("Hours:5", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39400);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39401);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39402);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39403);assertEquals("Hours:0", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39404);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39405);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatAppend_PrinterParserThenClear159() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1if8bmfuem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParserThenClear159",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1if8bmfuem(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39406); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39407);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39408);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39409);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39410);assertNull(bld.toPrinter()); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39411);assertNull(bld.toParser()); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39412);bld.clear(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39413);bld.appendMonths(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39414);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39415);assertNotNull(bld.toParser()); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testBug2495455160() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16q6xuquew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testBug2495455160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16q6xuquew(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39416); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39417);PeriodFormatter pfmt1 = new PeriodFormatterBuilder().appendLiteral("P").appendYears().appendSuffix("Y").appendMonths().appendSuffix("M").appendWeeks().appendSuffix("W").appendDays().appendSuffix("D").appendSeparatorIfFieldsAfter("T").appendHours().appendSuffix("H").appendMinutes().appendSuffix("M").appendSecondsWithOptionalMillis().appendSuffix("S").toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39418);PeriodFormatter pfmt2 = new PeriodFormatterBuilder().append(ISOPeriodFormat.standard()).toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39419);pfmt1.parsePeriod("PT1003199059S"); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39420);pfmt2.parsePeriod("PT1003199059S"); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_null_null161() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u3shg6uf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_null161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u3shg6uf1(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39421); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39422);try { 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39423);new PeriodFormatterBuilder().append(null, null); 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39424);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatMinDigits162() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qpsrfuf5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMinDigits162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qpsrfuf5(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39425); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39426);PeriodFormatter f = new PeriodFormatterBuilder().minimumPrintedDigits(4).appendYears().toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39427);assertEquals("0001", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39428);assertEquals(4, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39429);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyLast163() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119do9oufa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyLast163",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119do9oufa(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39430); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39431);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyLast().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39432);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39433);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39434);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39435);assertEquals("---0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39436);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39437);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39438);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39439);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39440);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39441);assertEquals("---0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39442);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39443);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirst164() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e9y85dufo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirst164",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e9y85dufo(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39444); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39445);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39446);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39447);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39448);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39449);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39450);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39451);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39452);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39453);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39454);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39455);assertEquals("0---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39456);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39457);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatPrintZeroAlways165() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13h61z0ug2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroAlways165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13h61z0ug2(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39458); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39459);PeriodFormatter f = new PeriodFormatterBuilder().printZeroAlways().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39460);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39461);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39462);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39463);assertEquals("0-0-0-0", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39464);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39465);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39466);assertEquals("1-0-0-4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39467);assertEquals(7, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39468);assertEquals(4, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39469);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39470);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39471);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatPrintZeroNever166() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13hynqwugg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroNever166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13hynqwugg(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39472); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39473);PeriodFormatter f = new PeriodFormatterBuilder().printZeroNever().appendYears().appendLiteral("-").appendMonths().appendLiteral("-").appendWeeks().appendLiteral("-").appendDays().toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39474);assertEquals("1-2-3-4", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39475);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39476);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39477);assertEquals("---", f.print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39478);assertEquals(3, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39479);assertEquals(0, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39480);assertEquals("1---4", f.print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39481);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39482);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39483);assertEquals("---", f.print(EMPTY_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39484);assertEquals(3, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39485);assertEquals(0, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatSuffixPlural1167() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14urx6iugu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural1167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14urx6iugu(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39486); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39487);PeriodFormatter f = builder.appendYears().appendSuffix(" year", " years").toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39488);assertEquals("1 year", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39489);assertEquals(6, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39490);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39491);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39492);assertEquals("0 years", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39493);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39494);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatPrintZeroRarelyFirstSeconds168() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7wwguh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstSeconds168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7wwguh3(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39495); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39496);PeriodFormatter f = new PeriodFormatterBuilder().printZeroRarelyFirst().appendSeconds().toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39497);assertEquals("0", f.print(EMPTY_PERIOD)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatSuffixSimple2169() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmnfgruh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple2169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmnfgruh6(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39498); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39499);PeriodFormatter f = builder.appendHours().appendSuffix(" hours").toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39500);assertEquals("5 hours", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39501);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39502);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39503);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39504);assertEquals("0 hours", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39505);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39506);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatSuffixSimple3170() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ob3ktyuhf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple3170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ob3ktyuhf(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39507); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39508);try { 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39509);builder.appendSuffix(null); 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39510);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatSuffixPlural3171() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2gh19uhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural3171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2gh19uhj(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39511); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39512);try { 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39513);builder.appendSuffix(null, ""); 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39514);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39515);try { 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39516);builder.appendSuffix("", null); 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39517);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39518);try { 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39519);builder.appendSuffix(null, null); 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39520);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatSuffixPlural4172() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n65319uht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural4172",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n65319uht(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39521); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39522);try { 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39523);builder.appendSuffix(" hour", " hours"); 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39524);fail(); 
     } catch (IllegalStateException ex) { 
     } 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatSeparatorSimple173() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5o0t6uhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorSimple173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5o0t6uhx(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39525); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39526);PeriodFormatter f = builder.appendYears().appendSeparator("T").appendHours().toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39527);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39528);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39529);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39530);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39531);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39532);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39533);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39534);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39535);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatSeparatorIfFieldsAfter174() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13wxw2dui8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsAfter174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13wxw2dui8(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39536); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39537);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsAfter("T").appendHours().toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39538);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39539);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39540);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39541);assertEquals("T5", f.print(TIME_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39542);assertEquals(2, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39543);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39544);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39545);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39546);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatSeparatorIfFieldsBefore175() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ru0v45uij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsBefore175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ru0v45uij(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39547); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39548);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsBefore("T").appendHours().toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39549);assertEquals("1T5", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39550);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39551);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39552);assertEquals("5", f.print(TIME_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39553);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39554);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39555);assertEquals("1T", f.print(DATE_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39556);assertEquals(2, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39557);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatSeparatorComplex176() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mry6rnuiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorComplex176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mry6rnuiu(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39558); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39559);PeriodFormatter f = builder.appendYears().appendSeparator(", ", " and ").appendHours().appendSeparator(", ", " and ").appendMinutes().appendSeparator(", ", " and ").toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39560);assertEquals("1, 5 and 6", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39561);assertEquals(10, f.getPrinter().calculatePrintedLength(PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39562);assertEquals(3, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39563);assertEquals("5 and 6", f.print(TIME_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39564);assertEquals(7, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39565);assertEquals(2, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39566);assertEquals("1", f.print(DATE_PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39567);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39568);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_null_Parser177() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6sggtuj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_Parser177",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6sggtuj5(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39569); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39570);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39571);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(null, parser).appendMonths(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39572);assertNull(bld.toPrinter()); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39573);assertNotNull(bld.toParser()); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39574);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39575);try { 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39576);f.print(PERIOD); 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39577);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39578);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_Printer_null178() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ld73nvujf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null178",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ld73nvujf(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39579); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39580);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39581);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).appendMonths(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39582);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39583);assertNull(bld.toParser()); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39584);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39585);assertEquals("1-2", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39586);try { 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39587);f.parsePeriod("1-2"); 
         __CLR4_4_1udhudhle6rjdtu.R.inc(39588);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatSecondsWithOptionalMillis181() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0mbdbujp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSecondsWithOptionalMillis181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0mbdbujp(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39589); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39590);PeriodFormatter f = builder.appendSecondsWithOptionalMillis().toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39591);Period p = new Period(0, 0, 0, 0, 0, 0, 7, 0); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39592);assertEquals("7", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39593);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39594);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39595);p = new Period(0, 0, 0, 0, 0, 0, 7, 1); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39596);assertEquals("7.001", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39597);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39598);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39599);p = new Period(0, 0, 0, 0, 0, 0, 7, 999); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39600);assertEquals("7.999", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39601);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39602);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39603);p = new Period(0, 0, 0, 0, 0, 0, 7, 1000); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39604);assertEquals("8", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39605);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39606);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39607);p = new Period(0, 0, 0, 0, 0, 0, 7, 1001); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39608);assertEquals("8.001", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39609);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39610);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39611);p = new Period(0, 0, 0, 0, 0, 0, 7, -1); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39612);assertEquals("6.999", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39613);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39614);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39615);p = new Period(0, 0, 0, 0, 0, 0, -7, 1); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39616);assertEquals("-6.999", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39617);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39618);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39619);p = new Period(0, 0, 0, 0, 0, 0, -7, -1); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39620);assertEquals("-7.001", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39621);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39622);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39623);p = new Period(0, 0, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39624);assertEquals("0", f.print(p)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39625);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39626);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null)); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 


public void testFormatAppend_PrinterParser_PrinterParser183() {__CLR4_4_1udhudhle6rjdtu.R.globalSliceStart(getClass().getName(),39627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uiym78ukr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhle6rjdtu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhle6rjdtu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_PrinterParser183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uiym78ukr(){try{__CLR4_4_1udhudhle6rjdtu.R.inc(39627); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39628);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39629);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39630);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, parser).appendMonths(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39631);assertNotNull(bld.toPrinter()); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39632);assertNotNull(bld.toParser()); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39633);PeriodFormatter f = bld.toFormatter(); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39634);assertEquals("1-2", f.print(PERIOD)); 
     __CLR4_4_1udhudhle6rjdtu.R.inc(39635);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2")); 
 }finally{__CLR4_4_1udhudhle6rjdtu.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

}
