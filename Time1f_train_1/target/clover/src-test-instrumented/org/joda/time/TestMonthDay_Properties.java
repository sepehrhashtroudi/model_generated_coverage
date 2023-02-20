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
public class TestMonthDay_Properties extends TestCase {static class __CLR4_4_1lodlodle6qe9rq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,28209,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lodlodle6qe9rq.R.inc(28093);
        __CLR4_4_1lodlodle6qe9rq.R.inc(28094);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lodlodle6qe9rq.R.inc(28095);
        __CLR4_4_1lodlodle6qe9rq.R.inc(28096);return new TestSuite(TestMonthDay_Properties.class);
    }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}}

    public TestMonthDay_Properties(String name) {
        super(name);__CLR4_4_1lodlodle6qe9rq.R.inc(28098);try{__CLR4_4_1lodlodle6qe9rq.R.inc(28097);
    }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lodlodle6qe9rq.R.inc(28099);
        __CLR4_4_1lodlodle6qe9rq.R.inc(28100);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lodlodle6qe9rq.R.inc(28101);zone = DateTimeZone.getDefault();
        __CLR4_4_1lodlodle6qe9rq.R.inc(28102);locale = Locale.getDefault();
        __CLR4_4_1lodlodle6qe9rq.R.inc(28103);Locale.setDefault(Locale.UK);
        __CLR4_4_1lodlodle6qe9rq.R.inc(28104);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lodlodle6qe9rq.R.inc(28105);
        __CLR4_4_1lodlodle6qe9rq.R.inc(28106);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lodlodle6qe9rq.R.inc(28107);DateTimeZone.setDefault(zone);
        __CLR4_4_1lodlodle6qe9rq.R.inc(28108);zone = null;
        __CLR4_4_1lodlodle6qe9rq.R.inc(28109);Locale.setDefault(locale);
        __CLR4_4_1lodlodle6qe9rq.R.inc(28110);locale = null;
    }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyAddWrapFieldDayOfMonth401() {__CLR4_4_1lodlodle6qe9rq.R.globalSliceStart(getClass().getName(),28111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yp5jyflov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lodlodle6qe9rq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lodlodle6qe9rq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddWrapFieldDayOfMonth401",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yp5jyflov(){try{__CLR4_4_1lodlodle6qe9rq.R.inc(28111); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28112);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28113);MonthDay copy = test.dayOfMonth().addWrapFieldToCopy(4); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28114);check(test, 4, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28115);check(copy, 4, 10); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28116);copy = test.dayOfMonth().addWrapFieldToCopy(8); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28117);check(copy, 4, 14); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28118);copy = test.dayOfMonth().addWrapFieldToCopy(-8); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28119);check(copy, 4, 28); 
 }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}} 


public void testPropertyAddMonthOfYear436() {__CLR4_4_1lodlodle6qe9rq.R.globalSliceStart(getClass().getName(),28120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12dlqaklp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lodlodle6qe9rq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lodlodle6qe9rq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddMonthOfYear436",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12dlqaklp4(){try{__CLR4_4_1lodlodle6qe9rq.R.inc(28120); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28121);MonthDay test = new MonthDay(3, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28122);MonthDay copy = test.monthOfYear().addToCopy(9); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28123);check(test, 3, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28124);check(copy, 12, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28125);copy = test.monthOfYear().addToCopy(0); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28126);check(copy, 3, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28127);check(test, 3, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28128);copy = test.monthOfYear().addToCopy(-3); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28129);check(copy, 12, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28130);check(test, 3, 6); 
 }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}} 


public void testPropertyAddDayOfMonth437() {__CLR4_4_1lodlodle6qe9rq.R.globalSliceStart(getClass().getName(),28131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tl5gu0lpf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lodlodle6qe9rq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lodlodle6qe9rq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddDayOfMonth437",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tl5gu0lpf(){try{__CLR4_4_1lodlodle6qe9rq.R.inc(28131); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28132);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28133);MonthDay copy = test.dayOfMonth().addToCopy(6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28134);check(test, 4, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28135);check(copy, 4, 12); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28136);copy = test.dayOfMonth().addToCopy(7); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28137);check(copy, 4, 13); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28138);copy = test.dayOfMonth().addToCopy(-5); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28139);check(copy, 4, 1); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28140);copy = test.dayOfMonth().addToCopy(-6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28141);check(copy, 3, 31); 
 }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}} 


public void testPropertyCompareToMonthOfYear1259() {__CLR4_4_1lodlodle6qe9rq.R.globalSliceStart(getClass().getName(),28142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1quuxk7lpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lodlodle6qe9rq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lodlodle6qe9rq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyCompareToMonthOfYear1259",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1quuxk7lpq(){try{__CLR4_4_1lodlodle6qe9rq.R.inc(28142); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28143);MonthDay test1 = new MonthDay(TEST_TIME1); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28144);MonthDay test2 = new MonthDay(TEST_TIME2); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28145);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28146);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28147);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28148);try { 
         __CLR4_4_1lodlodle6qe9rq.R.inc(28149);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1lodlodle6qe9rq.R.inc(28150);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28151);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28152);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28153);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28154);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28155);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28156);try { 
         __CLR4_4_1lodlodle6qe9rq.R.inc(28157);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1lodlodle6qe9rq.R.inc(28158);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}} 


public void testPropertyGetDayOfMonth1277() {__CLR4_4_1lodlodle6qe9rq.R.globalSliceStart(getClass().getName(),28159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iel6mclq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lodlodle6qe9rq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lodlodle6qe9rq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyGetDayOfMonth1277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iel6mclq7(){try{__CLR4_4_1lodlodle6qe9rq.R.inc(28159); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28160);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28161);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28162);assertEquals("dayOfMonth", test.dayOfMonth().getName()); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28163);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28164);assertSame(test, test.dayOfMonth().getReadablePartial()); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28165);assertSame(test, test.dayOfMonth().getMonthDay()); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28166);assertEquals(6, test.dayOfMonth().get()); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28167);assertEquals("6", test.dayOfMonth().getAsString()); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28168);assertEquals("6", test.dayOfMonth().getAsText()); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28169);assertEquals("6", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28170);assertEquals("6", test.dayOfMonth().getAsShortText()); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28171);assertEquals("6", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28172);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28173);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28174);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28175);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28176);test = new MonthDay(4, 7); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28177);assertEquals("7", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28178);assertEquals("7", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonthOfYear1278() {__CLR4_4_1lodlodle6qe9rq.R.globalSliceStart(getClass().getName(),28179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pe3ig7lqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lodlodle6qe9rq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lodlodle6qe9rq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddWrapFieldMonthOfYear1278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pe3ig7lqr(){try{__CLR4_4_1lodlodle6qe9rq.R.inc(28179); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28180);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28181);MonthDay copy = test.monthOfYear().addWrapFieldToCopy(2); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28182);check(test, 5, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28183);check(copy, 7, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28184);copy = test.monthOfYear().addWrapFieldToCopy(2); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28185);check(copy, 7, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28186);copy = test.monthOfYear().addWrapFieldToCopy(292278993 - 4 + 1); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28187);check(copy, 11, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28188);copy = test.monthOfYear().addWrapFieldToCopy(-292275054 - 4 - 1); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28189);check(copy, 6, 6); 
 }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}} 


public void testPropertySetMonthOfYear1279() {__CLR4_4_1lodlodle6qe9rq.R.globalSliceStart(getClass().getName(),28190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4f8jhlr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lodlodle6qe9rq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lodlodle6qe9rq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetMonthOfYear1279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4f8jhlr2(){try{__CLR4_4_1lodlodle6qe9rq.R.inc(28190); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28191);MonthDay test = new MonthDay(10, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28192);MonthDay copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28193);check(test, 10, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28194);check(copy, 12, 6); 
 }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}} 


public void testPropertySetTextDayOfMonth1280() {__CLR4_4_1lodlodle6qe9rq.R.globalSliceStart(getClass().getName(),28195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tfw89hlr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lodlodle6qe9rq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lodlodle6qe9rq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetTextDayOfMonth1280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tfw89hlr7(){try{__CLR4_4_1lodlodle6qe9rq.R.inc(28195); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28196);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28197);MonthDay copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28198);check(test, 4, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28199);check(copy, 4, 12); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28200);copy = test.dayOfMonth().setCopy("2"); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28201);check(test, 4, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28202);check(copy, 4, 2); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28203);copy = test.dayOfMonth().setCopy("4"); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28204);check(test, 4, 6); 
     __CLR4_4_1lodlodle6qe9rq.R.inc(28205);check(copy, 4, 4); 
 }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1lodlodle6qe9rq.R.inc(28206);
        __CLR4_4_1lodlodle6qe9rq.R.inc(28207);assertEquals(monthOfYear, test.getMonthOfYear());
        __CLR4_4_1lodlodle6qe9rq.R.inc(28208);assertEquals(dayOfMonth, test.getDayOfMonth());
    }finally{__CLR4_4_1lodlodle6qe9rq.R.flushNeeded();}}
}
