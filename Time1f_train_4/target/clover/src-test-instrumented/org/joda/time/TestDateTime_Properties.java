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
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestDateTime_Properties extends TestCase {static class __CLR4_4_1ip1ip1le6rjcb3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,24513,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24229);
        __CLR4_4_1ip1ip1le6rjcb3.R.inc(24230);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24231);
        __CLR4_4_1ip1ip1le6rjcb3.R.inc(24232);return new TestSuite(TestDateTime_Properties.class);
    }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}}

    public TestDateTime_Properties(String name) {
        super(name);__CLR4_4_1ip1ip1le6rjcb3.R.inc(24234);try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24233);
    }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24235);
        __CLR4_4_1ip1ip1le6rjcb3.R.inc(24236);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ip1ip1le6rjcb3.R.inc(24237);zone = DateTimeZone.getDefault();
        __CLR4_4_1ip1ip1le6rjcb3.R.inc(24238);locale = Locale.getDefault();
        __CLR4_4_1ip1ip1le6rjcb3.R.inc(24239);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ip1ip1le6rjcb3.R.inc(24240);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24241);
        __CLR4_4_1ip1ip1le6rjcb3.R.inc(24242);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ip1ip1le6rjcb3.R.inc(24243);DateTimeZone.setDefault(zone);
        __CLR4_4_1ip1ip1le6rjcb3.R.inc(24244);Locale.setDefault(locale);
        __CLR4_4_1ip1ip1le6rjcb3.R.inc(24245);zone = null;
    }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyEqualsHashCodeLenient190() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yggk1zipi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeLenient190",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yggk1zipi(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24246); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24247);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24248);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24249);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24250);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24251);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24252);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24253);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24254);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24255);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyAddWrapFieldYear269() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19q07pzips();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldYear269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19q07pzips(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24256); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24257);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24258);DateTime copy = test.year().addWrapFieldToCopy(9); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24259);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24260);assertEquals("2013-06-09T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24261);copy = test.year().addWrapFieldToCopy(0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24262);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24263);copy = test.year().addWrapFieldToCopy(292278993 - 2004 + 1); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24264);assertEquals(-292275054, copy.getYear()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24265);copy = test.year().addWrapFieldToCopy(-292275054 - 2004 - 1); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24266);assertEquals(292278993, copy.getYear()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfCentury407() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11eaz55iq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfCentury407",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11eaz55iq3(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24267); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24268);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24269);Interval testInterval = test.yearOfCentury().toInterval(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24270);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24271);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyGetMonthOfYear515() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6ykediq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMonthOfYear515",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6ykediq8(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24272); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24273);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24274);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24275);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24276);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24277);assertSame(test, test.monthOfYear().getDateTime()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24278);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24279);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24280);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24281);assertEquals("June", test.monthOfYear().getField().getAsText(6, Locale.ENGLISH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24282);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24283);assertEquals("juin", test.monthOfYear().getField().getAsText(6, Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24284);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24285);assertEquals("Jun", test.monthOfYear().getField().getAsShortText(6, Locale.ENGLISH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24286);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24287);assertEquals("juin", test.monthOfYear().getField().getAsShortText(6, Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24288);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24289);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24290);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24291);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24292);test = new DateTime(2004, 7, 9, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24293);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24294);assertEquals("juillet", test.monthOfYear().getField().getAsText(7, Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24295);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24296);assertEquals("juil.", test.monthOfYear().getField().getAsShortText(7, Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24297);assertEquals(1, test.monthOfYear().getMinimumValue()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24298);assertEquals(1, test.monthOfYear().getMinimumValueOverall()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24299);assertEquals(12, test.monthOfYear().getMaximumValue()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24300);assertEquals(12, test.monthOfYear().getMaximumValueOverall()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24301);assertEquals(1, test.monthOfYear().getMinimumValue()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24302);assertEquals(1, test.monthOfYear().getMinimumValueOverall()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24303);assertEquals(12, test.monthOfYear().getMaximumValue()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24304);assertEquals(12, test.monthOfYear().getMaximumValueOverall()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict580() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wp0vzqir5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeStrict580",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wp0vzqir5(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24305); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24306);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24307);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24308);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24309);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24310);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24311);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24312);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24313);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24314);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyGetEra624() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmz48qirf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetEra624",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmz48qirf(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24315); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24316);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24317);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24318);assertEquals("era", test.era().getName()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24319);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24320);assertSame(test, test.era().getDateTime()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24321);assertEquals(1, test.era().get()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24322);assertEquals("1", test.era().getAsString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24323);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24324);assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24325);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24326);assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24327);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24328);assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24329);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24330);assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24331);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24332);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24333);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24334);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24335);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24336);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyGetCenturyOfEra625() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gcbb6gis1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetCenturyOfEra625",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gcbb6gis1(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24337); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24338);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24339);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24340);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24341);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24342);assertSame(test, test.centuryOfEra().getDateTime()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24343);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24344);assertEquals("20", test.centuryOfEra().getAsString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24345);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24346);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24347);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24348);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24349);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24350);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24351);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24352);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfEra626() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0ed2wish();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfEra626",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0ed2wish(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24353); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24354);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24355);Interval testInterval = test.yearOfEra().toInterval(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24356);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24357);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertySetYear627() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtobzeism();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetYear627",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtobzeism(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24358); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24359);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24360);DateTime copy = test.year().setCopy(1960); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24361);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24362);assertEquals("1960-06-09T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertySetWeekOfWeekyear629() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bh1sx9isr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetWeekOfWeekyear629",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bh1sx9isr(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24363); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24364);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24365);DateTime copy = test.weekOfWeekyear().setCopy(4); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24366);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24367);assertEquals("2004-01-19T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24368);try { 
         __CLR4_4_1ip1ip1le6rjcb3.R.inc(24369);test.weekOfWeekyear().setCopy(54); 
         __CLR4_4_1ip1ip1le6rjcb3.R.inc(24370);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24371);try { 
         __CLR4_4_1ip1ip1le6rjcb3.R.inc(24372);test.weekOfWeekyear().setCopy(0); 
         __CLR4_4_1ip1ip1le6rjcb3.R.inc(24373);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyAddLongDayOfWeek630() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nm8gyxit2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddLongDayOfWeek630",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nm8gyxit2(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24374); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24375);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24376);DateTime copy = test.dayOfWeek().addToCopy(1L); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24377);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24378);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyGetMinuteOfDay631() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ji76vit7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMinuteOfDay631",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ji76vit7(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24379); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24380);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24381);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24382);assertEquals("minuteOfDay", test.minuteOfDay().getName()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24383);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24384);assertSame(test, test.minuteOfDay().getDateTime()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24385);assertEquals(803, test.minuteOfDay().get()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24386);assertEquals("803", test.minuteOfDay().getAsString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24387);assertEquals("803", test.minuteOfDay().getAsText()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24388);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24389);assertEquals("803", test.minuteOfDay().getAsShortText()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24390);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24391);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24392);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24393);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24394);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyGetSecondOfDay632() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vpzfqitn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetSecondOfDay632",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vpzfqitn(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24395); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24396);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24397);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24398);assertEquals("secondOfDay", test.secondOfDay().getName()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24399);assertEquals("Property[secondOfDay]", test.secondOfDay().toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24400);assertSame(test, test.secondOfDay().getDateTime()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24401);assertEquals(48223, test.secondOfDay().get()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24402);assertEquals("48223", test.secondOfDay().getAsString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24403);assertEquals("48223", test.secondOfDay().getAsText()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24404);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24405);assertEquals("48223", test.secondOfDay().getAsShortText()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24406);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24407);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24408);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24409);assertEquals(5, test.secondOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24410);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyWithMinimumValueMillisOfDayDSTGap633() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0h3wdiu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMinimumValueMillisOfDayDSTGap633",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0h3wdiu3(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24411); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24412);DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza"); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24413);DateTime dt = new DateTime(2001, 4, 20, 18, 0, 0, 0, gaza); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24414);DateTime test = dt.millisOfDay().withMinimumValue(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24415);assertEquals("2001-04-20T01:00:00.000+03:00", test.toString()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertySetTextDayOfMonth635() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14oa2omiu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextDayOfMonth635",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14oa2omiu8(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24416); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24417);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24418);DateTime copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24419);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24420);assertEquals("2004-06-12T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyWithMaximumValueMillisOfDayDSTGap636() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fktp8uiud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueMillisOfDayDSTGap636",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fktp8uiud(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24421); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24422);DateTimeZone paris = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24423);DateTime dt = new DateTime(1926, 4, 17, 18, 0, 0, 0, paris); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24424);DateTime test = dt.millisOfDay().withMaximumValue(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24425);assertEquals("1926-04-17T22:59:59.999Z", test.toString()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyRoundHalfFloorHourOfDay637() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k3l9v2iui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfFloorHourOfDay637",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k3l9v2iui(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24426); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24427);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24428);DateTime copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24429);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24430);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24431);copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24432);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24433);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24434);copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24435);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyRoundHalfCeilingHourOfDay638() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4a9j0ius();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay638",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4a9j0ius(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24436); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24437);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24438);DateTime copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24439);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24440);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24441);copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24442);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24443);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24444);copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24445);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenHourOfDay639() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ebmmxiiv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfEvenHourOfDay639",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ebmmxiiv2(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24446); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24447);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24448);DateTime copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24449);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24450);test = new DateTime(2004, 6, 9, 14, 30, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24451);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24452);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24453);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24454);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24455);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24456);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24457);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24458);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyAddDayOfMonth838() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oaqo65ivf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddDayOfMonth838",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oaqo65ivf(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24459); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24460);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24461);DateTime copy = test.dayOfMonth().addToCopy(9); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24462);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24463);assertEquals("2004-06-18T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24464);copy = test.dayOfMonth().addToCopy(21); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24465);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24466);copy = test.dayOfMonth().addToCopy(22); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24467);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24468);copy = test.dayOfMonth().addToCopy(22 + 30); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24469);assertEquals("2004-07-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24470);copy = test.dayOfMonth().addToCopy(22 + 31); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24471);assertEquals("2004-08-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24472);copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24473);assertEquals("2004-12-31T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24474);copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24475);assertEquals("2005-01-01T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24476);copy = test.dayOfMonth().addToCopy(-8); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24477);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24478);copy = test.dayOfMonth().addToCopy(-9); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24479);assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24480);copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24481);assertEquals("2004-01-01T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24482);copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24483);assertEquals("2003-12-31T00:00:00.000Z", copy.toString()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyGetDifferenceHourOfDay939() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5nh1tiw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDifferenceHourOfDay939",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5nh1tiw4(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24484); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24485);DateTime test1 = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24486);DateTime test2 = new DateTime(2004, 6, 9, 15, 30, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24487);assertEquals(-2, test1.hourOfDay().getDifference(test2)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24488);assertEquals(2, test2.hourOfDay().getDifference(test1)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24489);assertEquals(-2L, test1.hourOfDay().getDifferenceAsLong(test2)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24490);assertEquals(2L, test2.hourOfDay().getDifferenceAsLong(test1)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24491);DateTime test = new DateTime(TEST_TIME_NOW + (13L * DateTimeConstants.MILLIS_PER_HOUR)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24492);assertEquals(13, test.hourOfDay().getDifference(null)); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24493);assertEquals(13L, test.hourOfDay().getDifferenceAsLong(null)); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyGetMaxMinValuesDayOfYear940() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j78l1xiwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMaxMinValuesDayOfYear940",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j78l1xiwe(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24494); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24495);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24496);assertEquals(1, test.dayOfYear().getMinimumValue()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24497);assertEquals(1, test.dayOfYear().getMinimumValueOverall()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24498);assertEquals(366, test.dayOfYear().getMaximumValue()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24499);assertEquals(366, test.dayOfYear().getMaximumValueOverall()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24500);test = new DateTime(2002, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24501);assertEquals(365, test.dayOfYear().getMaximumValue()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24502);assertEquals(366, test.dayOfYear().getMaximumValueOverall()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth941() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nsg49aiwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueDayOfMonth941",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nsg49aiwn(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24503); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24504);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24505);DateTime copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24506);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24507);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 


public void testPropertyToIntervalMillisOfSecond960() {__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceStart(getClass().getName(),24508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hb40taiws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ip1ip1le6rjcb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ip1ip1le6rjcb3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMillisOfSecond960",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hb40taiws(){try{__CLR4_4_1ip1ip1le6rjcb3.R.inc(24508); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24509);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24510);Interval testInterval = test.millisOfSecond().toInterval(); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24511);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart()); 
     __CLR4_4_1ip1ip1le6rjcb3.R.inc(24512);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd()); 
 }finally{__CLR4_4_1ip1ip1le6rjcb3.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

            

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

}
