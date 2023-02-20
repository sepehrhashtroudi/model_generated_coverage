/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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
package org.joda.time;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Properties extends TestCase {static class __CLR4_4_1kf3kf3le6ndpve{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,26508,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1kf3kf3le6ndpve.R.inc(26463);
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26464);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kf3kf3le6ndpve.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kf3kf3le6ndpve.R.inc(26465);
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26466);return new TestSuite(TestYearMonth_Properties.class);
    }finally{__CLR4_4_1kf3kf3le6ndpve.R.flushNeeded();}}

    public TestYearMonth_Properties(String name) {
        super(name);__CLR4_4_1kf3kf3le6ndpve.R.inc(26468);try{__CLR4_4_1kf3kf3le6ndpve.R.inc(26467);
    }finally{__CLR4_4_1kf3kf3le6ndpve.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kf3kf3le6ndpve.R.inc(26469);
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26470);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26471);zone = DateTimeZone.getDefault();
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26472);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26473);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26474);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kf3kf3le6ndpve.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kf3kf3le6ndpve.R.inc(26475);
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26476);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26477);DateTimeZone.setDefault(zone);
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26478);zone = null;
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26479);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26480);systemDefaultLocale = null;
    }finally{__CLR4_4_1kf3kf3le6ndpve.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyCompareToMonth124() {__CLR4_4_1kf3kf3le6ndpve.R.globalSliceStart(getClass().getName(),26481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jey25kfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kf3kf3le6ndpve.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kf3kf3le6ndpve.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyCompareToMonth124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jey25kfl(){try{__CLR4_4_1kf3kf3le6ndpve.R.inc(26481); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26482);YearMonth test1 = new YearMonth(TEST_TIME1); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26483);YearMonth test2 = new YearMonth(TEST_TIME2); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26484);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26485);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26486);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26487);try { 
         __CLR4_4_1kf3kf3le6ndpve.R.inc(26488);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1kf3kf3le6ndpve.R.inc(26489);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26490);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26491);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26492);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26493);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26494);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26495);try { 
         __CLR4_4_1kf3kf3le6ndpve.R.inc(26496);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1kf3kf3le6ndpve.R.inc(26497);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kf3kf3le6ndpve.R.flushNeeded();}}
public void testPropertyHashCode161() {__CLR4_4_1kf3kf3le6ndpve.R.globalSliceStart(getClass().getName(),26498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ly5nldkg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kf3kf3le6ndpve.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kf3kf3le6ndpve.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyHashCode161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ly5nldkg2(){try{__CLR4_4_1kf3kf3le6ndpve.R.inc(26498); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26499);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26500);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26501);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26502);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26503);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     __CLR4_4_1kf3kf3le6ndpve.R.inc(26504);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 }finally{__CLR4_4_1kf3kf3le6ndpve.R.flushNeeded();}}
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1kf3kf3le6ndpve.R.inc(26505);
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26506);assertEquals(year, test.getYear());
        __CLR4_4_1kf3kf3le6ndpve.R.inc(26507);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1kf3kf3le6ndpve.R.flushNeeded();}}
}
