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
public class TestPeriodFormatter extends TestCase {static class __CLR4_4_1ub9ub9le6rjdt6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,39365,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ub9ub9le6rjdt6.R.inc(39285);
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39286);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ub9ub9le6rjdt6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ub9ub9le6rjdt6.R.inc(39287);
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39288);return new TestSuite(TestPeriodFormatter.class);
    }finally{__CLR4_4_1ub9ub9le6rjdt6.R.flushNeeded();}}

    public TestPeriodFormatter(String name) {
        super(name);__CLR4_4_1ub9ub9le6rjdt6.R.inc(39290);try{__CLR4_4_1ub9ub9le6rjdt6.R.inc(39289);
    }finally{__CLR4_4_1ub9ub9le6rjdt6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ub9ub9le6rjdt6.R.inc(39291);
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39292);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39293);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39294);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39295);originalLocale = Locale.getDefault();
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39296);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39297);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39298);Locale.setDefault(Locale.UK);
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39299);f = ISOPeriodFormat.standard();
    }finally{__CLR4_4_1ub9ub9le6rjdt6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ub9ub9le6rjdt6.R.inc(39300);
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39301);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39302);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39303);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39304);Locale.setDefault(originalLocale);
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39305);originalDateTimeZone = null;
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39306);originalTimeZone = null;
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39307);originalLocale = null;
        __CLR4_4_1ub9ub9le6rjdt6.R.inc(39308);f = null;
    }finally{__CLR4_4_1ub9ub9le6rjdt6.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testWithGetLocaleMethods644() {__CLR4_4_1ub9ub9le6rjdt6.R.globalSliceStart(getClass().getName(),39309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12279r1ubx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ub9ub9le6rjdt6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ub9ub9le6rjdt6.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testWithGetLocaleMethods644",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12279r1ubx(){try{__CLR4_4_1ub9ub9le6rjdt6.R.inc(39309); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39310);PeriodFormatter f2 = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39311);assertEquals(Locale.FRENCH, f2.getLocale()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39312);assertSame(f2, f2.withLocale(Locale.FRENCH)); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39313);f2 = f.withLocale(null); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39314);assertEquals(null, f2.getLocale()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39315);assertSame(f2, f2.withLocale(null)); 
 }finally{__CLR4_4_1ub9ub9le6rjdt6.R.flushNeeded();}} 


public void testPrinterParserMethods645() {__CLR4_4_1ub9ub9le6rjdt6.R.globalSliceStart(getClass().getName(),39316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h6dh3nuc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ub9ub9le6rjdt6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ub9ub9le6rjdt6.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrinterParserMethods645",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h6dh3nuc4(){try{__CLR4_4_1ub9ub9le6rjdt6.R.inc(39316); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39317);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39318);PeriodFormatter f2 = new PeriodFormatter(f.getPrinter(), f.getParser()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39319);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39320);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39321);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39322);assertEquals(true, f2.isParser()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39323);assertNotNull(f2.print(p)); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39324);assertNotNull(f2.parsePeriod("P1Y2M3W4DT5H6M7.008S")); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39325);f2 = new PeriodFormatter(f.getPrinter(), null); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39326);assertEquals(f.getPrinter(), f2.getPrinter()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39327);assertEquals(null, f2.getParser()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39328);assertEquals(true, f2.isPrinter()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39329);assertEquals(false, f2.isParser()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39330);assertNotNull(f2.print(p)); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39331);try { 
         __CLR4_4_1ub9ub9le6rjdt6.R.inc(39332);assertNotNull(f2.parsePeriod("P1Y2M3W4DT5H6M7.008S")); 
         __CLR4_4_1ub9ub9le6rjdt6.R.inc(39333);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39334);f2 = new PeriodFormatter(null, f.getParser()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39335);assertEquals(null, f2.getPrinter()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39336);assertEquals(f.getParser(), f2.getParser()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39337);assertEquals(false, f2.isPrinter()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39338);assertEquals(true, f2.isParser()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39339);try { 
         __CLR4_4_1ub9ub9le6rjdt6.R.inc(39340);f2.print(p); 
         __CLR4_4_1ub9ub9le6rjdt6.R.inc(39341);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39342);assertNotNull(f2.parsePeriod("P1Y2M3W4DT5H6M7.008S")); 
 }finally{__CLR4_4_1ub9ub9le6rjdt6.R.flushNeeded();}} 


public void testWithGetParseTypeMethods646() {__CLR4_4_1ub9ub9le6rjdt6.R.globalSliceStart(getClass().getName(),39343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ktola4ucv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ub9ub9le6rjdt6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ub9ub9le6rjdt6.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testWithGetParseTypeMethods646",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ktola4ucv(){try{__CLR4_4_1ub9ub9le6rjdt6.R.inc(39343); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39344);PeriodFormatter f2 = f.withParseType(PeriodType.dayTime()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39345);assertEquals(PeriodType.dayTime(), f2.getParseType()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39346);assertSame(f2, f2.withParseType(PeriodType.dayTime())); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39347);f2 = f.withParseType(null); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39348);assertEquals(null, f2.getParseType()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39349);assertSame(f2, f2.withParseType(null)); 
 }finally{__CLR4_4_1ub9ub9le6rjdt6.R.flushNeeded();}} 


public void testPrint_bufferMethods647() throws Exception {__CLR4_4_1ub9ub9le6rjdt6.R.globalSliceStart(getClass().getName(),39350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ucg6mud2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ub9ub9le6rjdt6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ub9ub9le6rjdt6.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrint_bufferMethods647",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ucg6mud2() throws Exception{try{__CLR4_4_1ub9ub9le6rjdt6.R.inc(39350); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39351);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39352);StringBuffer buf = new StringBuffer(); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39353);f.printTo(buf, p); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39354);assertEquals("P1Y2M3W4DT5H6M7.008S", buf.toString()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39355);buf = new StringBuffer(); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39356);try { 
         __CLR4_4_1ub9ub9le6rjdt6.R.inc(39357);f.printTo(buf, null); 
         __CLR4_4_1ub9ub9le6rjdt6.R.inc(39358);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ub9ub9le6rjdt6.R.flushNeeded();}} 


public void testParsePeriod_parseType847() {__CLR4_4_1ub9ub9le6rjdt6.R.globalSliceStart(getClass().getName(),39359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eigrpqudb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ub9ub9le6rjdt6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ub9ub9le6rjdt6.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParsePeriod_parseType847",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eigrpqudb(){try{__CLR4_4_1ub9ub9le6rjdt6.R.inc(39359); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39360);Period expect = new Period(0, 0, 0, 4, 5, 6, 7, 8, PeriodType.dayTime()); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39361);assertEquals(expect, f.withParseType(PeriodType.dayTime()).parsePeriod("P4DT5H6M7.008S")); 
     __CLR4_4_1ub9ub9le6rjdt6.R.inc(39362);try { 
         __CLR4_4_1ub9ub9le6rjdt6.R.inc(39363);f.withParseType(PeriodType.dayTime()).parsePeriod("P3W4DT5H6M7.008S"); 
         __CLR4_4_1ub9ub9le6rjdt6.R.inc(39364);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ub9ub9le6rjdt6.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
