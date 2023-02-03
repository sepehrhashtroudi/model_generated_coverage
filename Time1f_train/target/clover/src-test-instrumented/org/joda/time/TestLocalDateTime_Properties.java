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

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Properties extends TestCase {static class __CLR4_4_1l1nl1nlc8axdz3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,27445,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final CopticChronology COPTIC_UTC = CopticChronology.getInstanceUTC();

    private int MILLIS_OF_DAY =
        (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L);
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 4L * DateTimeConstants.MILLIS_PER_HOUR
        + 5L * DateTimeConstants.MILLIS_PER_MINUTE
        + 6L * DateTimeConstants.MILLIS_PER_SECOND
        + 7L;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27275);
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27276);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27277);
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27278);return new TestSuite(TestLocalDateTime_Properties.class);
    }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}}

    public TestLocalDateTime_Properties(String name) {
        super(name);__CLR4_4_1l1nl1nlc8axdz3.R.inc(27280);try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27279);
    }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27281);
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27282);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27283);zone = DateTimeZone.getDefault();
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27284);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27285);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27286);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27287);
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27288);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27289);DateTimeZone.setDefault(zone);
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27290);zone = null;
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27291);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27292);systemDefaultLocale = null;
    }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyRoundHour82() {__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceStart(getClass().getName(),27293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ydwk7ol25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l1nl1nlc8axdz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyRoundHour82",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ydwk7ol25(){try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27293); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27294);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27295);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27296);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27297);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27298);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27299);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27300);test = new LocalDateTime(2005, 6, 9, 10, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27301);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27302);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27303);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27304);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27305);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27306);test = new LocalDateTime(2005, 6, 9, 10, 30); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27307);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27308);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27309);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27310);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27311);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27312);test = new LocalDateTime(2005, 6, 9, 11, 30); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27313);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27314);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27315);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27316);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27317);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 12, 0, 0, 0); 
 }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}} 


public void testPropertySetTextSecond291() {__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceStart(getClass().getName(),27318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pg9wizl2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l1nl1nlc8axdz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetTextSecond291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pg9wizl2u(){try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27318); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27319);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27320);LocalDateTime copy = test.secondOfMinute().setCopy("12"); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27321);check(test, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27322);check(copy, 2005, 6, 9, 10, 20, 12, 40); 
 }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}} 


public void testPropertyAddToCopyMonth366() {__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceStart(getClass().getName(),27323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_156kx8kl2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l1nl1nlc8axdz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyMonth366",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_156kx8kl2z(){try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27323); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27324);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27325);LocalDateTime copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27326);check(test, 1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27327);check(copy, 1972, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27328);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27329);check(copy, 1973, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27330);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27331);check(copy, 1972, 1, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27332);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27333);check(copy, 1971, 12, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27334);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27335);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27336);check(copy, 1972, 2, 29, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27337);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27338);check(copy, 1972, 3, 31, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27339);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27340);check(copy, 1972, 4, 30, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27341);test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27342);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27343);check(copy, 1971, 2, 28, 10, 20, 30, 40); 
 }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}} 


public void testPropertyGetMonth367() {__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceStart(getClass().getName(),27344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpwo3al3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l1nl1nlc8axdz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMonth367",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpwo3al3k(){try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27344); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27345);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27346);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27347);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27348);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27349);assertSame(test, test.monthOfYear().getLocalDateTime()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27350);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27351);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27352);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27353);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27354);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27355);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27356);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27357);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27358);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27359);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27360);test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27361);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27362);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}} 


public void testPropertyWithMaxMinValueHour515() {__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceStart(getClass().getName(),27363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fa6ftyl43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l1nl1nlc8axdz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueHour515",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fa6ftyl43(){try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27363); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27364);LocalDateTime test = new LocalDateTime(2005, 6, 9, 0, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27365);check(test.hourOfDay().withMaximumValue(), 2005, 6, 9, 23, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27366);check(test.hourOfDay().withMinimumValue(), 2005, 6, 9, 0, 20, 30, 40); 
 }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}} 


public void testPropertyAddWrapFieldToCopyMilli568() {__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceStart(getClass().getName(),27367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tl0rpll47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l1nl1nlc8axdz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyMilli568",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tl0rpll47(){try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27367); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27368);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27369);LocalDateTime copy = test.millisOfSecond().addWrapFieldToCopy(9); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27370);check(test, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27371);check(copy, 2005, 6, 9, 10, 20, 30, 49); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27372);copy = test.millisOfSecond().addWrapFieldToCopy(995); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27373);check(copy, 2005, 6, 9, 10, 20, 30, 35); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27374);copy = test.millisOfSecond().addWrapFieldToCopy(-47); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27375);check(copy, 2005, 6, 9, 10, 20, 30, 993); 
 }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}} 


public void testPropertyCompareToDay730() {__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceStart(getClass().getName(),27376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ri24ol4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l1nl1nlc8axdz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToDay730",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ri24ol4g(){try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27376); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27377);LocalDateTime test1 = new LocalDateTime(TEST_TIME1); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27378);LocalDateTime test2 = new LocalDateTime(TEST_TIME2); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27379);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27380);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27381);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27382);try { 
         __CLR4_4_1l1nl1nlc8axdz3.R.inc(27383);test1.dayOfMonth().compareTo((ReadablePartial) null); 
         __CLR4_4_1l1nl1nlc8axdz3.R.inc(27384);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27385);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27386);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27387);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27388);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27389);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27390);try { 
         __CLR4_4_1l1nl1nlc8axdz3.R.inc(27391);test1.dayOfMonth().compareTo((ReadableInstant) null); 
         __CLR4_4_1l1nl1nlc8axdz3.R.inc(27392);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}} 


public void testPropertyGetMinute766() {__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceStart(getClass().getName(),27393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1335gijl4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l1nl1nlc8axdz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMinute766",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1335gijl4x(){try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27393); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27394);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27395);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27396);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27397);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27398);assertSame(test, test.minuteOfHour().getLocalDateTime()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27399);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27400);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27401);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27402);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27403);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27404);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27405);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27406);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27407);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27408);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}} 


public void testPropertyHashCode1249() {__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceStart(getClass().getName(),27409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18q1v2pl5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l1nl1nlc8axdz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyHashCode1249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18q1v2pl5d(){try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27409); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27410);LocalDateTime test1 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27411);LocalDateTime test2 = new LocalDateTime(2005, 11, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27412);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27413);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27414);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27415);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}} 


public void testPropertyGetMilli1422() {__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceStart(getClass().getName(),27416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oy9ocol5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l1nl1nlc8axdz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMilli1422",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oy9ocol5k(){try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27416); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27417);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27418);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27419);assertEquals("millisOfSecond", test.millisOfSecond().getName()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27420);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27421);assertSame(test, test.millisOfSecond().getLocalDateTime()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27422);assertEquals(40, test.millisOfSecond().get()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27423);assertEquals("40", test.millisOfSecond().getAsString()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27424);assertEquals("40", test.millisOfSecond().getAsText()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27425);assertEquals("40", test.millisOfSecond().getAsText(Locale.FRENCH)); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27426);assertEquals("40", test.millisOfSecond().getAsShortText()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27427);assertEquals("40", test.millisOfSecond().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27428);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27429);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField()); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27430);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null)); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27431);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}} 


public void testPropertySetCopyYear1536() {__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceStart(getClass().getName(),27432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k82hr9l60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l1nl1nlc8axdz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l1nl1nlc8axdz3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyYear1536",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k82hr9l60(){try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27432); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27433);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27434);LocalDateTime copy = test.year().setCopy(12); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27435);check(test, 1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1l1nl1nlc8axdz3.R.inc(27436);check(copy, 12, 6, 9, 10, 20, 30, 40); 
 }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1l1nl1nlc8axdz3.R.inc(27437);
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27438);assertEquals(year, test.getYear());
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27439);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27440);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27441);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27442);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27443);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1l1nl1nlc8axdz3.R.inc(27444);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1l1nl1nlc8axdz3.R.flushNeeded();}}
}
