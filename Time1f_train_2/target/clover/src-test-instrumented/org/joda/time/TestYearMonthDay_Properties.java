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
public class TestYearMonthDay_Properties extends TestCase {static class __CLR4_4_1oxyoxyle6qsfc7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,32467,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32326);
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32327);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32328);
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32329);return new TestSuite(TestYearMonthDay_Properties.class);
    }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}}

    public TestYearMonthDay_Properties(String name) {
        super(name);__CLR4_4_1oxyoxyle6qsfc7.R.inc(32331);try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32330);
    }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32332);
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32333);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32334);zone = DateTimeZone.getDefault();
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32335);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32336);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32337);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32338);
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32339);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32340);DateTimeZone.setDefault(zone);
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32341);zone = null;
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32342);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32343);systemDefaultLocale = null;
    }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertySetMonth23() {__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceStart(getClass().getName(),32344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z192mroyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxyoxyle6qsfc7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetMonth23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z192mroyg(){try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32344); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32345);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32346);YearMonthDay copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32347);check(test, 1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32348);check(copy, 1972, 12, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32349);test = new YearMonthDay(1972, 1, 31); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32350);copy = test.monthOfYear().setCopy(2); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32351);check(copy, 1972, 2, 29); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32352);try { 
         __CLR4_4_1oxyoxyle6qsfc7.R.inc(32353);test.monthOfYear().setCopy(13); 
         __CLR4_4_1oxyoxyle6qsfc7.R.inc(32354);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32355);try { 
         __CLR4_4_1oxyoxyle6qsfc7.R.inc(32356);test.monthOfYear().setCopy(0); 
         __CLR4_4_1oxyoxyle6qsfc7.R.inc(32357);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}} 


public void testPropertyGetMaxMinValuesDay38() {__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceStart(getClass().getName(),32358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5xpvtoyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxyoxyle6qsfc7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMaxMinValuesDay38",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5xpvtoyu(){try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32358); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32359);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32360);assertEquals(1, test.dayOfMonth().getMinimumValue()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32361);assertEquals(1, test.dayOfMonth().getMinimumValueOverall()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32362);assertEquals(30, test.dayOfMonth().getMaximumValue()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32363);assertEquals(31, test.dayOfMonth().getMaximumValueOverall()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32364);test = new YearMonthDay(1972, 7, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32365);assertEquals(31, test.dayOfMonth().getMaximumValue()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32366);test = new YearMonthDay(1972, 2, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32367);assertEquals(29, test.dayOfMonth().getMaximumValue()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32368);test = new YearMonthDay(1971, 2, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32369);assertEquals(28, test.dayOfMonth().getMaximumValue()); 
 }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}} 


public void testPropertyGetMonth39() {__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceStart(getClass().getName(),32370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bchtduoz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxyoxyle6qsfc7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMonth39",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32370,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bchtduoz6(){try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32370); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32371);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32372);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32373);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32374);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32375);assertSame(test, test.monthOfYear().getReadablePartial()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32376);assertSame(test, test.monthOfYear().getYearMonthDay()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32377);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32378);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32379);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32380);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32381);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32382);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32383);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32384);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32385);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32386);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32387);test = new YearMonthDay(1972, 7, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32388);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32389);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}} 


public void testPropertyAddYear40() {__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceStart(getClass().getName(),32390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mmlyliozq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxyoxyle6qsfc7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddYear40",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mmlyliozq(){try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32390); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32391);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32392);YearMonthDay copy = test.year().addToCopy(9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32393);check(test, 1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32394);check(copy, 1981, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32395);copy = test.year().addToCopy(0); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32396);check(copy, 1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32397);copy = test.year().addToCopy(292277023 - 1972); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32398);check(copy, 292277023, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32399);try { 
         __CLR4_4_1oxyoxyle6qsfc7.R.inc(32400);test.year().addToCopy(292278993 - 1972 + 1); 
         __CLR4_4_1oxyoxyle6qsfc7.R.inc(32401);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32402);check(test, 1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32403);copy = test.year().addToCopy(-1972); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32404);check(copy, 0, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32405);copy = test.year().addToCopy(-1973); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32406);check(copy, -1, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32407);try { 
         __CLR4_4_1oxyoxyle6qsfc7.R.inc(32408);test.year().addToCopy(-292275054 - 1972 - 1); 
         __CLR4_4_1oxyoxyle6qsfc7.R.inc(32409);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32410);check(test, 1972, 6, 9); 
 }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}} 


public void testPropertyAddWrapFieldYear41() {__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceStart(getClass().getName(),32411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hgdvtp0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxyoxyle6qsfc7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddWrapFieldYear41",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hgdvtp0b(){try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32411); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32412);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32413);YearMonthDay copy = test.year().addWrapFieldToCopy(9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32414);check(test, 1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32415);check(copy, 1981, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32416);copy = test.year().addWrapFieldToCopy(0); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32417);check(copy, 1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32418);copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32419);check(copy, -292275054, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32420);copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32421);check(copy, 292278993, 6, 9); 
 }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}} 


public void testPropertySetTextDay42() {__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceStart(getClass().getName(),32422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13gd5bbp0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxyoxyle6qsfc7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetTextDay42",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13gd5bbp0m(){try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32422); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32423);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32424);YearMonthDay copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32425);check(test, 1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32426);check(copy, 1972, 6, 12); 
 }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}} 


public void testPropertyWithMinimumValueDayOfMonth43() {__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceStart(getClass().getName(),32427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ht4m1pp0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxyoxyle6qsfc7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyWithMinimumValueDayOfMonth43",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ht4m1pp0r(){try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32427); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32428);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32429);YearMonthDay copy = test.dayOfMonth().withMinimumValue(); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32430);check(test, 1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32431);check(copy, 1972, 6, 1); 
 }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}} 


public void testPropertyAddMonth411() {__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceStart(getClass().getName(),32432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i3jx7vp0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxyoxyle6qsfc7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddMonth411",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i3jx7vp0w(){try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32432); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32433);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32434);YearMonthDay copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32435);check(test, 1972, 6, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32436);check(copy, 1972, 12, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32437);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32438);check(copy, 1973, 1, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32439);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32440);check(copy, 1972, 1, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32441);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32442);check(copy, 1971, 12, 9); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32443);test = new YearMonthDay(1972, 1, 31); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32444);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32445);check(copy, 1972, 2, 29); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32446);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32447);check(copy, 1972, 3, 31); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32448);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32449);check(copy, 1972, 4, 30); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32450);test = new YearMonthDay(1971, 1, 31); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32451);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32452);check(copy, 1971, 2, 28); 
 }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict477() {__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceStart(getClass().getName(),32453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xi2pu9p1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxyoxyle6qsfc7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxyoxyle6qsfc7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyEqualsHashCodeStrict477",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xi2pu9p1h(){try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32453); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32454);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32455);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32456);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32457);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32458);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32459);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32460);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32461);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1oxyoxyle6qsfc7.R.inc(32462);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int year, int month, int day) {try{__CLR4_4_1oxyoxyle6qsfc7.R.inc(32463);
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32464);assertEquals(year, test.getYear());
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32465);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1oxyoxyle6qsfc7.R.inc(32466);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1oxyoxyle6qsfc7.R.flushNeeded();}}
}
