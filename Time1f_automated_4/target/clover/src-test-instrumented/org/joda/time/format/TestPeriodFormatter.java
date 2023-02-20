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
public class TestPeriodFormatter extends TestCase {static class __CLR4_4_1m5gm5gle6o7aho{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,28844,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28708);
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28709);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28710);
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28711);return new TestSuite(TestPeriodFormatter.class);
    }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}

    public TestPeriodFormatter(String name) {
        super(name);__CLR4_4_1m5gm5gle6o7aho.R.inc(28713);try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28712);
    }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28714);
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28715);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28716);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28717);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28718);originalLocale = Locale.getDefault();
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28719);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28720);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28721);Locale.setDefault(Locale.UK);
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28722);f = ISOPeriodFormat.standard();
    }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28723);
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28724);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28725);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28726);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28727);Locale.setDefault(originalLocale);
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28728);originalDateTimeZone = null;
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28729);originalTimeZone = null;
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28730);originalLocale = null;
        __CLR4_4_1m5gm5gle6o7aho.R.inc(28731);f = null;
    }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testParseStandardFail378() {__CLR4_4_1m5gm5gle6o7aho.R.globalSliceStart(getClass().getName(),28732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ljiv5m64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5gm5gle6o7aho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5gm5gle6o7aho.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParseStandardFail378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ljiv5m64(){try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28732); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28733);PeriodFormatter parser = ISOPeriodFormat.standard(); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28734);try { 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28735);parser.parsePeriod("PTS"); 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28736);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}
public void testPrint_bufferMethods247() throws Exception {__CLR4_4_1m5gm5gle6o7aho.R.globalSliceStart(getClass().getName(),28737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16p2b9qm69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5gm5gle6o7aho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5gm5gle6o7aho.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrint_bufferMethods247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16p2b9qm69() throws Exception{try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28737); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28738);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28739);StringBuffer buf = new StringBuffer(); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28740);f.printTo(buf, p); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28741);assertEquals("P1Y2M3W4DT5H6M7.008S", buf.toString()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28742);buf = new StringBuffer(); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28743);try { 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28744);f.printTo(buf, null); 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28745);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}
public void testSetMonths484() {__CLR4_4_1m5gm5gle6o7aho.R.globalSliceStart(getClass().getName(),28746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xvxqx8m6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5gm5gle6o7aho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5gm5gle6o7aho.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testSetMonths484",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xvxqx8m6i(){try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28746); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28747);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28748);test.setMonths(10); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28749);assertEquals(10, test.getMonths()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28750);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28751);test.setMonths(-10); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28752);assertEquals(-10, test.getMonths()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28753);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28754);test.setMonths(0); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28755);assertEquals(0, test.getMonths()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28756);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28757);test.setMonths(1); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28758);assertEquals(1, test.getMonths()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28759);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28760);try { 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28761);test.setMonths(1); 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28762);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}
public void testSetDays485() {__CLR4_4_1m5gm5gle6o7aho.R.globalSliceStart(getClass().getName(),28763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xytvkfm6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5gm5gle6o7aho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5gm5gle6o7aho.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testSetDays485",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xytvkfm6z(){try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28763); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28764);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28765);test.setDays(10); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28766);assertEquals(10, test.getDays()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28767);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28768);test.setDays(-10); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28769);assertEquals(-10, test.getDays()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28770);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28771);test.setDays(0); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28772);assertEquals(0, test.getDays()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28773);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28774);test.setDays(1); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28775);assertEquals(1, test.getDays()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28776);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28777);try { 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28778);test.setDays(1); 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28779);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}
public void testSetMinutes487() {__CLR4_4_1m5gm5gle6o7aho.R.globalSliceStart(getClass().getName(),28780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dktvvm7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5gm5gle6o7aho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5gm5gle6o7aho.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testSetMinutes487",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dktvvm7g(){try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28780); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28781);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28782);test.setMinutes(10); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28783);assertEquals(10, test.getMinutes()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28784);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28785);test.setMinutes(-10); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28786);assertEquals(-10, test.getMinutes()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28787);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28788);test.setMinutes(0); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28789);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28790);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28791);test.setMinutes(13); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28792);assertEquals(13, test.getMinutes()); 
 }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}
public void testSetMinutes488() {__CLR4_4_1m5gm5gle6o7aho.R.globalSliceStart(getClass().getName(),28793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mksocm7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5gm5gle6o7aho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5gm5gle6o7aho.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testSetMinutes488",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mksocm7t(){try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28793); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28794);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28795);test.setMinutes(10); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28796);assertEquals(10, test.getMinutes()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28797);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28798);test.setMinutes(-10); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28799);assertEquals(-10, test.getMinutes()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28800);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28801);test.setMinutes(0); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28802);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28803);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28804);test.setMinutes(1); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28805);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28806);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28807);try { 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28808);test.setMinutes(1); 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28809);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}
public void testSetSeconds489() {__CLR4_4_1m5gm5gle6o7aho.R.globalSliceStart(getClass().getName(),28810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16bq5ilm8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5gm5gle6o7aho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5gm5gle6o7aho.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testSetSeconds489",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16bq5ilm8a(){try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28810); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28811);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28812);test.setSeconds(10); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28813);assertEquals(10, test.getSeconds()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28814);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28815);test.setSeconds(-10); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28816);assertEquals(-10, test.getSeconds()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28817);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28818);test.setSeconds(0); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28819);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28820);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28821);test.setSeconds(1); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28822);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28823);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28824);try { 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28825);test.setSeconds(1); 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28826);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}
public void testSetMillis491() {__CLR4_4_1m5gm5gle6o7aho.R.globalSliceStart(getClass().getName(),28827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6d5j1m8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5gm5gle6o7aho.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5gm5gle6o7aho.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testSetMillis491",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6d5j1m8r(){try{__CLR4_4_1m5gm5gle6o7aho.R.inc(28827); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28828);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28829);test.setMillis(10); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28830);assertEquals(10, test.getMillis()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28831);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28832);test.setMillis(-10); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28833);assertEquals(-10, test.getMillis()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28834);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28835);test.setMillis(0); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28836);assertEquals(0, test.getMillis()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28837);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28838);test.setMillis(1); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28839);assertEquals(1, test.getMillis()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28840);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1m5gm5gle6o7aho.R.inc(28841);try { 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28842);test.setMillis(1); 
         __CLR4_4_1m5gm5gle6o7aho.R.inc(28843);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m5gm5gle6o7aho.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
