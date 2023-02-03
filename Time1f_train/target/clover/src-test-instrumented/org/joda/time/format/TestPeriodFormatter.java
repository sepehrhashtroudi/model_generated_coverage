/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

import java.io.CharArrayWriter;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Period Formating.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormatter extends TestCase {static class __CLR4_4_1w54w54lc8axf7b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,41759,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);

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
    private PeriodFormatter f = null;

    public static void main(String[] args) {try{__CLR4_4_1w54w54lc8axf7b.R.inc(41656);
        __CLR4_4_1w54w54lc8axf7b.R.inc(41657);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1w54w54lc8axf7b.R.inc(41658);
        __CLR4_4_1w54w54lc8axf7b.R.inc(41659);return new TestSuite(TestPeriodFormatter.class);
    }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}}

    public TestPeriodFormatter(String name) {
        super(name);__CLR4_4_1w54w54lc8axf7b.R.inc(41661);try{__CLR4_4_1w54w54lc8axf7b.R.inc(41660);
    }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1w54w54lc8axf7b.R.inc(41662);
        __CLR4_4_1w54w54lc8axf7b.R.inc(41663);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1w54w54lc8axf7b.R.inc(41664);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1w54w54lc8axf7b.R.inc(41665);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1w54w54lc8axf7b.R.inc(41666);originalLocale = Locale.getDefault();
        __CLR4_4_1w54w54lc8axf7b.R.inc(41667);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1w54w54lc8axf7b.R.inc(41668);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1w54w54lc8axf7b.R.inc(41669);Locale.setDefault(Locale.UK);
        __CLR4_4_1w54w54lc8axf7b.R.inc(41670);f = ISOPeriodFormat.standard();
    }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1w54w54lc8axf7b.R.inc(41671);
        __CLR4_4_1w54w54lc8axf7b.R.inc(41672);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1w54w54lc8axf7b.R.inc(41673);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1w54w54lc8axf7b.R.inc(41674);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1w54w54lc8axf7b.R.inc(41675);Locale.setDefault(originalLocale);
        __CLR4_4_1w54w54lc8axf7b.R.inc(41676);originalDateTimeZone = null;
        __CLR4_4_1w54w54lc8axf7b.R.inc(41677);originalTimeZone = null;
        __CLR4_4_1w54w54lc8axf7b.R.inc(41678);originalLocale = null;
        __CLR4_4_1w54w54lc8axf7b.R.inc(41679);f = null;
    }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPrint_writerMethods75() throws Exception {__CLR4_4_1w54w54lc8axf7b.R.globalSliceStart(getClass().getName(),41680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x10zr4w5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w54w54lc8axf7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w54w54lc8axf7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrint_writerMethods75",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x10zr4w5s() throws Exception{try{__CLR4_4_1w54w54lc8axf7b.R.inc(41680); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41681);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41682);CharArrayWriter out = new CharArrayWriter(); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41683);f.printTo(out, p); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41684);assertEquals("P1Y2M3W4DT5H6M7.008S", out.toString()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41685);out = new CharArrayWriter(); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41686);try { 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41687);f.printTo(out, null); 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41688);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}} 


public void testPrinterParserMethods380() {__CLR4_4_1w54w54lc8axf7b.R.globalSliceStart(getClass().getName(),41689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fuus1lw61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w54w54lc8axf7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w54w54lc8axf7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrinterParserMethods380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fuus1lw61(){try{__CLR4_4_1w54w54lc8axf7b.R.inc(41689); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41690);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41691);PeriodFormatter f2 = new PeriodFormatter(f.getPrinter(), f.getParser()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41692);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41693);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41694);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41695);assertEquals(true, f2.isParser()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41696);assertNotNull(f2.print(p)); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41697);assertNotNull(f2.parsePeriod("P1Y2M3W4DT5H6M7.008S")); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41698);f2 = new PeriodFormatter(f.getPrinter(), null); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41699);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41700);assertEquals(null, f2.getParser()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41701);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41702);assertEquals(false, f2.isParser()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41703);assertNotNull(f2.print(p)); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41704);try { 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41705);assertNotNull(f2.parsePeriod("P1Y2M3W4DT5H6M7.008S")); 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41706);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41707);f2 = new PeriodFormatter(null, f.getParser()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41708);assertEquals(null, f2.getPrinter()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41709);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41710);assertEquals(false, f2.isPrinter()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41711);assertEquals(true, f2.isParser()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41712);try { 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41713);f2.print(p); 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41714);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41715);assertNotNull(f2.parsePeriod("P1Y2M3W4DT5H6M7.008S")); 
 }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}} 


public void testParseInto_simple422() {__CLR4_4_1w54w54lc8axf7b.R.globalSliceStart(getClass().getName(),41716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lnqbedw6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w54w54lc8axf7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w54w54lc8axf7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParseInto_simple422",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lnqbedw6s(){try{__CLR4_4_1w54w54lc8axf7b.R.inc(41716); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41717);MutablePeriod expect = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41718);MutablePeriod result = new MutablePeriod(); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41719);assertEquals(20, f.parseInto(result, "P1Y2M3W4DT5H6M7.008S", 0)); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41720);assertEquals(expect, result); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41721);try { 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41722);f.parseInto(null, "P1Y2M3W4DT5H6M7.008S", 0); 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41723);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41724);assertEquals(~0, f.parseInto(result, "ABC", 0)); 
 }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}} 


public void testParsePeriod_simple482() {__CLR4_4_1w54w54lc8axf7b.R.globalSliceStart(getClass().getName(),41725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ty84xyw71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w54w54lc8axf7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w54w54lc8axf7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParsePeriod_simple482",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ty84xyw71(){try{__CLR4_4_1w54w54lc8axf7b.R.inc(41725); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41726);Period expect = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41727);assertEquals(expect, f.parsePeriod("P1Y2M3W4DT5H6M7.008S")); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41728);try { 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41729);f.parsePeriod("ABC"); 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41730);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}} 


public void testWithGetParseTypeMethods660() {__CLR4_4_1w54w54lc8axf7b.R.globalSliceStart(getClass().getName(),41731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9pgcsw77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w54w54lc8axf7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w54w54lc8axf7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testWithGetParseTypeMethods660",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9pgcsw77(){try{__CLR4_4_1w54w54lc8axf7b.R.inc(41731); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41732);PeriodFormatter f2 = f.withParseType(PeriodType.dayTime()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41733);assertEquals(PeriodType.dayTime(), f2.getParseType()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41734);assertSame(f2, f2.withParseType(PeriodType.dayTime())); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41735);f2 = f.withParseType(null); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41736);assertEquals(null, f2.getParseType()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41737);assertSame(f2, f2.withParseType(null)); 
 }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}} 


public void testParseMutablePeriod_simple798() {__CLR4_4_1w54w54lc8axf7b.R.globalSliceStart(getClass().getName(),41738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vr6a8iw7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w54w54lc8axf7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w54w54lc8axf7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParseMutablePeriod_simple798",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vr6a8iw7e(){try{__CLR4_4_1w54w54lc8axf7b.R.inc(41738); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41739);MutablePeriod expect = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41740);assertEquals(expect, f.parseMutablePeriod("P1Y2M3W4DT5H6M7.008S")); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41741);try { 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41742);f.parseMutablePeriod("ABC"); 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41743);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}} 


public void testPrint_bufferMethods1076() throws Exception {__CLR4_4_1w54w54lc8axf7b.R.globalSliceStart(getClass().getName(),41744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h2aai5w7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w54w54lc8axf7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w54w54lc8axf7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrint_bufferMethods1076",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h2aai5w7k() throws Exception{try{__CLR4_4_1w54w54lc8axf7b.R.inc(41744); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41745);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41746);StringBuffer buf = new StringBuffer(); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41747);f.printTo(buf, p); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41748);assertEquals("P1Y2M3W4DT5H6M7.008S", buf.toString()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41749);buf = new StringBuffer(); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41750);try { 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41751);f.printTo(buf, null); 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41752);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}} 


public void testParsePeriod_parseType1502() {__CLR4_4_1w54w54lc8axf7b.R.globalSliceStart(getClass().getName(),41753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bymnvnw7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w54w54lc8axf7b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w54w54lc8axf7b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParsePeriod_parseType1502",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bymnvnw7t(){try{__CLR4_4_1w54w54lc8axf7b.R.inc(41753); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41754);Period expect = new Period(0, 0, 0, 4, 5, 6, 7, 8, PeriodType.dayTime()); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41755);assertEquals(expect, f.withParseType(PeriodType.dayTime()).parsePeriod("P4DT5H6M7.008S")); 
     __CLR4_4_1w54w54lc8axf7b.R.inc(41756);try { 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41757);f.withParseType(PeriodType.dayTime()).parsePeriod("P3W4DT5H6M7.008S"); 
         __CLR4_4_1w54w54lc8axf7b.R.inc(41758);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1w54w54lc8axf7b.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
