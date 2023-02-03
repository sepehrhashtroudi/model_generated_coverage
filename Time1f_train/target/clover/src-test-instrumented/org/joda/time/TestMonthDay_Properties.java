/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Propeties} 
 */
public class TestMonthDay_Properties extends TestCase {static class __CLR4_4_1mhpmhplc8axe3l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,29265,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29149);
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29150);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29151);
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29152);return new TestSuite(TestMonthDay_Properties.class);
    }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}}

    public TestMonthDay_Properties(String name) {
        super(name);__CLR4_4_1mhpmhplc8axe3l.R.inc(29154);try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29153);
    }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29155);
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29156);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29157);zone = DateTimeZone.getDefault();
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29158);locale = Locale.getDefault();
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29159);Locale.setDefault(Locale.UK);
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29160);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29161);
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29162);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29163);DateTimeZone.setDefault(zone);
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29164);zone = null;
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29165);Locale.setDefault(locale);
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29166);locale = null;
    }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyGetDayOfMonth62() {__CLR4_4_1mhpmhplc8axe3l.R.globalSliceStart(getClass().getName(),29167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13p1cipmi7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhpmhplc8axe3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhpmhplc8axe3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyGetDayOfMonth62",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13p1cipmi7(){try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29167); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29168);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29169);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29170);assertEquals("dayOfMonth", test.dayOfMonth().getName()); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29171);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29172);assertSame(test, test.dayOfMonth().getReadablePartial()); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29173);assertSame(test, test.dayOfMonth().getMonthDay()); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29174);assertEquals(6, test.dayOfMonth().get()); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29175);assertEquals("6", test.dayOfMonth().getAsString()); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29176);assertEquals("6", test.dayOfMonth().getAsText()); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29177);assertEquals("6", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29178);assertEquals("6", test.dayOfMonth().getAsShortText()); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29179);assertEquals("6", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29180);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29181);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29182);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29183);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29184);test = new MonthDay(4, 7); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29185);assertEquals("7", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29186);assertEquals("7", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}} 


public void testPropertyCompareToMonthOfYear345() {__CLR4_4_1mhpmhplc8axe3l.R.globalSliceStart(getClass().getName(),29187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1spq6g0mir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhpmhplc8axe3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhpmhplc8axe3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyCompareToMonthOfYear345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1spq6g0mir(){try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29187); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29188);MonthDay test1 = new MonthDay(TEST_TIME1); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29189);MonthDay test2 = new MonthDay(TEST_TIME2); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29190);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29191);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29192);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29193);try { 
         __CLR4_4_1mhpmhplc8axe3l.R.inc(29194);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1mhpmhplc8axe3l.R.inc(29195);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29196);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29197);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29198);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29199);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29200);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29201);try { 
         __CLR4_4_1mhpmhplc8axe3l.R.inc(29202);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1mhpmhplc8axe3l.R.inc(29203);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}} 


public void testPropertyAddMonthOfYear473() {__CLR4_4_1mhpmhplc8axe3l.R.globalSliceStart(getClass().getName(),29204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zbe4g3mj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhpmhplc8axe3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhpmhplc8axe3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddMonthOfYear473",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zbe4g3mj8(){try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29204); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29205);MonthDay test = new MonthDay(3, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29206);MonthDay copy = test.monthOfYear().addToCopy(9); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29207);check(test, 3, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29208);check(copy, 12, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29209);copy = test.monthOfYear().addToCopy(0); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29210);check(copy, 3, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29211);check(test, 3, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29212);copy = test.monthOfYear().addToCopy(-3); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29213);check(copy, 12, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29214);check(test, 3, 6); 
 }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}} 


public void testPropertySetMonthOfYear498() {__CLR4_4_1mhpmhplc8axe3l.R.globalSliceStart(getClass().getName(),29215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6sqtdmjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhpmhplc8axe3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhpmhplc8axe3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetMonthOfYear498",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6sqtdmjj(){try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29215); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29216);MonthDay test = new MonthDay(10, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29217);MonthDay copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29218);check(test, 10, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29219);check(copy, 12, 6); 
 }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}} 


public void testPropertyAddDayOfMonth675() {__CLR4_4_1mhpmhplc8axe3l.R.globalSliceStart(getClass().getName(),29220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dcc98mjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhpmhplc8axe3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhpmhplc8axe3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddDayOfMonth675",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dcc98mjo(){try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29220); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29221);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29222);MonthDay copy = test.dayOfMonth().addToCopy(6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29223);check(test, 4, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29224);check(copy, 4, 12); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29225);copy = test.dayOfMonth().addToCopy(7); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29226);check(copy, 4, 13); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29227);copy = test.dayOfMonth().addToCopy(-5); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29228);check(copy, 4, 1); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29229);copy = test.dayOfMonth().addToCopy(-6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29230);check(copy, 3, 31); 
 }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonthOfYear904() {__CLR4_4_1mhpmhplc8axe3l.R.globalSliceStart(getClass().getName(),29231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1buaoaimjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhpmhplc8axe3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhpmhplc8axe3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddWrapFieldMonthOfYear904",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1buaoaimjz(){try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29231); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29232);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29233);MonthDay copy = test.monthOfYear().addWrapFieldToCopy(2); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29234);check(test, 5, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29235);check(copy, 7, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29236);copy = test.monthOfYear().addWrapFieldToCopy(2); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29237);check(copy, 7, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29238);copy = test.monthOfYear().addWrapFieldToCopy(292278993 - 4 + 1); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29239);check(copy, 11, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29240);copy = test.monthOfYear().addWrapFieldToCopy(-292275054 - 4 - 1); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29241);check(copy, 6, 6); 
 }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}} 


public void testPropertySetTextDayOfMonth1331() {__CLR4_4_1mhpmhplc8axe3l.R.globalSliceStart(getClass().getName(),29242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o0z3fgmka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhpmhplc8axe3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhpmhplc8axe3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetTextDayOfMonth1331",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o0z3fgmka(){try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29242); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29243);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29244);MonthDay copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29245);check(test, 4, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29246);check(copy, 4, 12); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29247);copy = test.dayOfMonth().setCopy("2"); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29248);check(test, 4, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29249);check(copy, 4, 2); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29250);copy = test.dayOfMonth().setCopy("4"); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29251);check(test, 4, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29252);check(copy, 4, 4); 
 }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}} 


public void testPropertyAddWrapFieldDayOfMonth1445() {__CLR4_4_1mhpmhplc8axe3l.R.globalSliceStart(getClass().getName(),29253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xnrbf6mkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhpmhplc8axe3l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhpmhplc8axe3l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddWrapFieldDayOfMonth1445",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xnrbf6mkl(){try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29253); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29254);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29255);MonthDay copy = test.dayOfMonth().addWrapFieldToCopy(4); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29256);check(test, 4, 6); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29257);check(copy, 4, 10); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29258);copy = test.dayOfMonth().addWrapFieldToCopy(8); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29259);check(copy, 4, 14); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29260);copy = test.dayOfMonth().addWrapFieldToCopy(-8); 
     __CLR4_4_1mhpmhplc8axe3l.R.inc(29261);check(copy, 4, 28); 
 }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1mhpmhplc8axe3l.R.inc(29262);
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29263);assertEquals(monthOfYear, test.getMonthOfYear());
        __CLR4_4_1mhpmhplc8axe3l.R.inc(29264);assertEquals(dayOfMonth, test.getDayOfMonth());
    }finally{__CLR4_4_1mhpmhplc8axe3l.R.flushNeeded();}}
}
