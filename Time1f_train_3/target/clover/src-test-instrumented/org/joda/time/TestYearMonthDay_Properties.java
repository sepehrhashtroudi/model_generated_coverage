/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Properties extends TestCase {static class __CLR4_4_1oz5oz5le6rcmba{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,32506,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32369);
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32370);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32371);
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32372);return new TestSuite(TestYearMonthDay_Properties.class);
    }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}}

    public TestYearMonthDay_Properties(String name) {
        super(name);__CLR4_4_1oz5oz5le6rcmba.R.inc(32374);try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32373);
    }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32375);
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32376);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32377);zone = DateTimeZone.getDefault();
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32378);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32379);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32380);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32381);
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32382);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32383);DateTimeZone.setDefault(zone);
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32384);zone = null;
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32385);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32386);systemDefaultLocale = null;
    }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyCompareToYear21() {__CLR4_4_1oz5oz5le6rcmba.R.globalSliceStart(getClass().getName(),32387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kkfh6kozn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oz5oz5le6rcmba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oz5oz5le6rcmba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyCompareToYear21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kkfh6kozn(){try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32387); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32388);YearMonthDay test1 = new YearMonthDay(TEST_TIME1); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32389);YearMonthDay test2 = new YearMonthDay(TEST_TIME2); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32390);assertEquals(true, test1.year().compareTo(test2) < 0); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32391);assertEquals(true, test2.year().compareTo(test1) > 0); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32392);assertEquals(true, test1.year().compareTo(test1) == 0); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32393);try { 
         __CLR4_4_1oz5oz5le6rcmba.R.inc(32394);test1.year().compareTo((ReadablePartial) null); 
         __CLR4_4_1oz5oz5le6rcmba.R.inc(32395);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32396);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32397);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32398);assertEquals(true, test1.year().compareTo(dt2) < 0); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32399);assertEquals(true, test2.year().compareTo(dt1) > 0); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32400);assertEquals(true, test1.year().compareTo(dt1) == 0); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32401);try { 
         __CLR4_4_1oz5oz5le6rcmba.R.inc(32402);test1.year().compareTo((ReadableInstant) null); 
         __CLR4_4_1oz5oz5le6rcmba.R.inc(32403);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}} 


public void testPropertySetMonth25() {__CLR4_4_1oz5oz5le6rcmba.R.globalSliceStart(getClass().getName(),32404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sj951tp04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oz5oz5le6rcmba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oz5oz5le6rcmba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetMonth25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sj951tp04(){try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32404); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32405);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32406);YearMonthDay copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32407);check(test, 1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32408);check(copy, 1972, 12, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32409);test = new YearMonthDay(1972, 1, 31); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32410);copy = test.monthOfYear().setCopy(2); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32411);check(copy, 1972, 2, 29); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32412);try { 
         __CLR4_4_1oz5oz5le6rcmba.R.inc(32413);test.monthOfYear().setCopy(13); 
         __CLR4_4_1oz5oz5le6rcmba.R.inc(32414);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32415);try { 
         __CLR4_4_1oz5oz5le6rcmba.R.inc(32416);test.monthOfYear().setCopy(0); 
         __CLR4_4_1oz5oz5le6rcmba.R.inc(32417);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}} 


public void testPropertyGetMaxMinValuesDay42() {__CLR4_4_1oz5oz5le6rcmba.R.globalSliceStart(getClass().getName(),32418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sdstoip0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oz5oz5le6rcmba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oz5oz5le6rcmba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMaxMinValuesDay42",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sdstoip0i(){try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32418); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32419);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32420);assertEquals(1, test.dayOfMonth().getMinimumValue()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32421);assertEquals(1, test.dayOfMonth().getMinimumValueOverall()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32422);assertEquals(30, test.dayOfMonth().getMaximumValue()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32423);assertEquals(31, test.dayOfMonth().getMaximumValueOverall()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32424);test = new YearMonthDay(1972, 7, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32425);assertEquals(31, test.dayOfMonth().getMaximumValue()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32426);test = new YearMonthDay(1972, 2, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32427);assertEquals(29, test.dayOfMonth().getMaximumValue()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32428);test = new YearMonthDay(1971, 2, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32429);assertEquals(28, test.dayOfMonth().getMaximumValue()); 
 }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}} 


public void testPropertyGetMonth44() {__CLR4_4_1oz5oz5le6rcmba.R.globalSliceStart(getClass().getName(),32430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124d97cp0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oz5oz5le6rcmba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oz5oz5le6rcmba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMonth44",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124d97cp0u(){try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32430); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32431);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32432);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32433);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32434);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32435);assertSame(test, test.monthOfYear().getReadablePartial()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32436);assertSame(test, test.monthOfYear().getYearMonthDay()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32437);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32438);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32439);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32440);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32441);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32442);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32443);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32444);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32445);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32446);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32447);test = new YearMonthDay(1972, 7, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32448);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32449);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}} 


public void testPropertyAddWrapFieldYear45() {__CLR4_4_1oz5oz5le6rcmba.R.globalSliceStart(getClass().getName(),32450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cijha3p1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oz5oz5le6rcmba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oz5oz5le6rcmba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddWrapFieldYear45",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cijha3p1e(){try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32450); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32451);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32452);YearMonthDay copy = test.year().addWrapFieldToCopy(9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32453);check(test, 1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32454);check(copy, 1981, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32455);copy = test.year().addWrapFieldToCopy(0); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32456);check(copy, 1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32457);copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32458);check(copy, -292275054, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32459);copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32460);check(copy, 292278993, 6, 9); 
 }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}} 


public void testPropertySetTextDay46() {__CLR4_4_1oz5oz5le6rcmba.R.globalSliceStart(getClass().getName(),32461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19jmpulp1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oz5oz5le6rcmba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oz5oz5le6rcmba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetTextDay46",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19jmpulp1p(){try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32461); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32462);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32463);YearMonthDay copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32464);check(test, 1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32465);check(copy, 1972, 6, 12); 
 }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth47() {__CLR4_4_1oz5oz5le6rcmba.R.globalSliceStart(getClass().getName(),32466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdqwydp1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oz5oz5le6rcmba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oz5oz5le6rcmba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyWithMaximumValueDayOfMonth47",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdqwydp1u(){try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32466); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32467);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32468);YearMonthDay copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32469);check(test, 1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32470);check(copy, 1972, 6, 30); 
 }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}} 


public void testPropertyAddMonth442() {__CLR4_4_1oz5oz5le6rcmba.R.globalSliceStart(getClass().getName(),32471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_139wp83p1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oz5oz5le6rcmba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oz5oz5le6rcmba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddMonth442",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_139wp83p1z(){try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32471); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32472);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32473);YearMonthDay copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32474);check(test, 1972, 6, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32475);check(copy, 1972, 12, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32476);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32477);check(copy, 1973, 1, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32478);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32479);check(copy, 1972, 1, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32480);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32481);check(copy, 1971, 12, 9); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32482);test = new YearMonthDay(1972, 1, 31); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32483);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32484);check(copy, 1972, 2, 29); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32485);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32486);check(copy, 1972, 3, 31); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32487);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32488);check(copy, 1972, 4, 30); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32489);test = new YearMonthDay(1971, 1, 31); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32490);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32491);check(copy, 1971, 2, 28); 
 }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict515() {__CLR4_4_1oz5oz5le6rcmba.R.globalSliceStart(getClass().getName(),32492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdp7wqp2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oz5oz5le6rcmba.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oz5oz5le6rcmba.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyEqualsHashCodeStrict515",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdp7wqp2k(){try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32492); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32493);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32494);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32495);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32496);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32497);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32498);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32499);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32500);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1oz5oz5le6rcmba.R.inc(32501);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int year, int month, int day) {try{__CLR4_4_1oz5oz5le6rcmba.R.inc(32502);
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32503);assertEquals(year, test.getYear());
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32504);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1oz5oz5le6rcmba.R.inc(32505);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1oz5oz5le6rcmba.R.flushNeeded();}}
}
