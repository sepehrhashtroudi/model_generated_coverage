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
public class TestYearMonthDay_Properties extends TestCase {static class __CLR4_4_1kamkamle6ndpus{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,26383,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kamkamle6ndpus.R.inc(26302);
        __CLR4_4_1kamkamle6ndpus.R.inc(26303);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kamkamle6ndpus.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kamkamle6ndpus.R.inc(26304);
        __CLR4_4_1kamkamle6ndpus.R.inc(26305);return new TestSuite(TestYearMonthDay_Properties.class);
    }finally{__CLR4_4_1kamkamle6ndpus.R.flushNeeded();}}

    public TestYearMonthDay_Properties(String name) {
        super(name);__CLR4_4_1kamkamle6ndpus.R.inc(26307);try{__CLR4_4_1kamkamle6ndpus.R.inc(26306);
    }finally{__CLR4_4_1kamkamle6ndpus.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kamkamle6ndpus.R.inc(26308);
        __CLR4_4_1kamkamle6ndpus.R.inc(26309);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kamkamle6ndpus.R.inc(26310);zone = DateTimeZone.getDefault();
        __CLR4_4_1kamkamle6ndpus.R.inc(26311);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1kamkamle6ndpus.R.inc(26312);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kamkamle6ndpus.R.inc(26313);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kamkamle6ndpus.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kamkamle6ndpus.R.inc(26314);
        __CLR4_4_1kamkamle6ndpus.R.inc(26315);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kamkamle6ndpus.R.inc(26316);DateTimeZone.setDefault(zone);
        __CLR4_4_1kamkamle6ndpus.R.inc(26317);zone = null;
        __CLR4_4_1kamkamle6ndpus.R.inc(26318);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kamkamle6ndpus.R.inc(26319);systemDefaultLocale = null;
    }finally{__CLR4_4_1kamkamle6ndpus.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertySetCopyTextDay11() {__CLR4_4_1kamkamle6ndpus.R.globalSliceStart(getClass().getName(),26320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p05cbekb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kamkamle6ndpus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kamkamle6ndpus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetCopyTextDay11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p05cbekb4(){try{__CLR4_4_1kamkamle6ndpus.R.inc(26320); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26321);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26322);YearMonthDay copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26323);check(test, 1972, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26324);check(copy, 1972, 6, 12); 
 }finally{__CLR4_4_1kamkamle6ndpus.R.flushNeeded();}}
public void testPropertySetTextDay12() {__CLR4_4_1kamkamle6ndpus.R.globalSliceStart(getClass().getName(),26325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lktsyskb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kamkamle6ndpus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kamkamle6ndpus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetTextDay12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lktsyskb9(){try{__CLR4_4_1kamkamle6ndpus.R.inc(26325); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26326);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26327);YearMonthDay copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26328);check(test, 1972, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26329);check(copy, 1972, 6, 12); 
 }finally{__CLR4_4_1kamkamle6ndpus.R.flushNeeded();}}
public void testPropertyGetYear13() {__CLR4_4_1kamkamle6ndpus.R.globalSliceStart(getClass().getName(),26330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wg0dgrkbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kamkamle6ndpus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kamkamle6ndpus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetYear13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wg0dgrkbe(){try{__CLR4_4_1kamkamle6ndpus.R.inc(26330); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26331);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26332);assertSame(test.getChronology().year(), test.year().getField()); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26333);assertEquals("year", test.year().getName()); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26334);assertEquals("Property[year]", test.year().toString()); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26335);assertSame(test, test.year().getReadablePartial()); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26336);assertSame(test, test.year().getYearMonthDay()); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26337);assertEquals(1972, test.year().get()); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26338);assertEquals("1972", test.year().getAsString()); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26339);assertEquals("1972", test.year().getAsText()); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26340);assertEquals("1972", test.year().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26341);assertEquals("1972", test.year().getAsShortText()); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26342);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26343);assertEquals(test.getChronology().years(), test.year().getDurationField()); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26344);assertEquals(null, test.year().getRangeDurationField()); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26345);assertEquals(9, test.year().getMaximumTextLength(null)); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26346);assertEquals(9, test.year().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1kamkamle6ndpus.R.flushNeeded();}}
public void testPropertyAddWrapFieldDay14() {__CLR4_4_1kamkamle6ndpus.R.globalSliceStart(getClass().getName(),26347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vx1a9ckbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kamkamle6ndpus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kamkamle6ndpus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddWrapFieldDay14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vx1a9ckbv(){try{__CLR4_4_1kamkamle6ndpus.R.inc(26347); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26348);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26349);YearMonthDay copy = test.dayOfMonth().addWrapFieldToCopy(9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26350);check(test, 1972, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26351);check(copy, 1981, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26352);copy = test.dayOfMonth().addWrapFieldToCopy(0); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26353);check(copy, 1972, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26354);copy = test.dayOfMonth().addWrapFieldToCopy(292277023 - 1972); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26355);check(copy, 292277023, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26356);try { 
         __CLR4_4_1kamkamle6ndpus.R.inc(26357);test.dayOfMonth().addWrapFieldToCopy(292278993 - 1972 + 1); 
         __CLR4_4_1kamkamle6ndpus.R.inc(26358);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kamkamle6ndpus.R.inc(26359);check(test, 1972, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26360);copy = test.dayOfMonth().addWrapFieldToCopy(-1972); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26361);check(copy, 0, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26362);copy = test.dayOfMonth().addWrapFieldToCopy(-1973); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26363);check(copy, -1, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26364);try { 
         __CLR4_4_1kamkamle6ndpus.R.inc(26365);test.dayOfMonth().addWrapFieldToCopy(-292275054 - 1972 - 1); 
         __CLR4_4_1kamkamle6ndpus.R.inc(26366);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kamkamle6ndpus.R.inc(26367);check(test, 1972, 6, 9); 
 }finally{__CLR4_4_1kamkamle6ndpus.R.flushNeeded();}}
public void testPropertyAddWrapFieldMonth15() {__CLR4_4_1kamkamle6ndpus.R.globalSliceStart(getClass().getName(),26368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmaqkrkcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kamkamle6ndpus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kamkamle6ndpus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddWrapFieldMonth15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmaqkrkcg(){try{__CLR4_4_1kamkamle6ndpus.R.inc(26368); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26369);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26370);YearMonthDay copy = test.monthOfYear().addWrapFieldToCopy(4); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26371);check(test, 1972, 6, 9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26372);check(copy, 1972, 10, 30); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26373);copy = test.monthOfYear().addWrapFieldToCopy(8); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26374);check(copy, 1972, 2, 29); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26375);copy = test.monthOfYear().addWrapFieldToCopy(-8); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26376);check(copy, 1972, 10, 30); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26377);copy = test.monthOfYear().addWrapFieldToCopy(-9); 
     __CLR4_4_1kamkamle6ndpus.R.inc(26378);check(copy, 1972, 10, 31); 
 }finally{__CLR4_4_1kamkamle6ndpus.R.flushNeeded();}}
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int year, int month, int day) {try{__CLR4_4_1kamkamle6ndpus.R.inc(26379);
        __CLR4_4_1kamkamle6ndpus.R.inc(26380);assertEquals(year, test.getYear());
        __CLR4_4_1kamkamle6ndpus.R.inc(26381);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1kamkamle6ndpus.R.inc(26382);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1kamkamle6ndpus.R.flushNeeded();}}
}
