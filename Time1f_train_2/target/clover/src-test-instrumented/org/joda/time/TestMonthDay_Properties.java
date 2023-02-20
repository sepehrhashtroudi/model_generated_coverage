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
public class TestMonthDay_Properties extends TestCase {static class __CLR4_4_1lohlohle6qsf1x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,28174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lohlohle6qsf1x.R.inc(28097);
        __CLR4_4_1lohlohle6qsf1x.R.inc(28098);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lohlohle6qsf1x.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lohlohle6qsf1x.R.inc(28099);
        __CLR4_4_1lohlohle6qsf1x.R.inc(28100);return new TestSuite(TestMonthDay_Properties.class);
    }finally{__CLR4_4_1lohlohle6qsf1x.R.flushNeeded();}}

    public TestMonthDay_Properties(String name) {
        super(name);__CLR4_4_1lohlohle6qsf1x.R.inc(28102);try{__CLR4_4_1lohlohle6qsf1x.R.inc(28101);
    }finally{__CLR4_4_1lohlohle6qsf1x.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lohlohle6qsf1x.R.inc(28103);
        __CLR4_4_1lohlohle6qsf1x.R.inc(28104);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lohlohle6qsf1x.R.inc(28105);zone = DateTimeZone.getDefault();
        __CLR4_4_1lohlohle6qsf1x.R.inc(28106);locale = Locale.getDefault();
        __CLR4_4_1lohlohle6qsf1x.R.inc(28107);Locale.setDefault(Locale.UK);
        __CLR4_4_1lohlohle6qsf1x.R.inc(28108);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1lohlohle6qsf1x.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lohlohle6qsf1x.R.inc(28109);
        __CLR4_4_1lohlohle6qsf1x.R.inc(28110);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lohlohle6qsf1x.R.inc(28111);DateTimeZone.setDefault(zone);
        __CLR4_4_1lohlohle6qsf1x.R.inc(28112);zone = null;
        __CLR4_4_1lohlohle6qsf1x.R.inc(28113);Locale.setDefault(locale);
        __CLR4_4_1lohlohle6qsf1x.R.inc(28114);locale = null;
    }finally{__CLR4_4_1lohlohle6qsf1x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyAddWrapFieldDayOfMonth380() {__CLR4_4_1lohlohle6qsf1x.R.globalSliceStart(getClass().getName(),28115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5rrgxloz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lohlohle6qsf1x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lohlohle6qsf1x.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddWrapFieldDayOfMonth380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5rrgxloz(){try{__CLR4_4_1lohlohle6qsf1x.R.inc(28115); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28116);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28117);MonthDay copy = test.dayOfMonth().addWrapFieldToCopy(4); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28118);check(test, 4, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28119);check(copy, 4, 10); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28120);copy = test.dayOfMonth().addWrapFieldToCopy(8); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28121);check(copy, 4, 14); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28122);copy = test.dayOfMonth().addWrapFieldToCopy(-8); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28123);check(copy, 4, 28); 
 }finally{__CLR4_4_1lohlohle6qsf1x.R.flushNeeded();}} 


public void testPropertyAddMonthOfYear413() {__CLR4_4_1lohlohle6qsf1x.R.globalSliceStart(getClass().getName(),28124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7drxlp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lohlohle6qsf1x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lohlohle6qsf1x.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddMonthOfYear413",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7drxlp8(){try{__CLR4_4_1lohlohle6qsf1x.R.inc(28124); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28125);MonthDay test = new MonthDay(3, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28126);MonthDay copy = test.monthOfYear().addToCopy(9); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28127);check(test, 3, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28128);check(copy, 12, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28129);copy = test.monthOfYear().addToCopy(0); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28130);check(copy, 3, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28131);check(test, 3, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28132);copy = test.monthOfYear().addToCopy(-3); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28133);check(copy, 12, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28134);check(test, 3, 6); 
 }finally{__CLR4_4_1lohlohle6qsf1x.R.flushNeeded();}} 


public void testPropertyGetDayOfMonth1269() {__CLR4_4_1lohlohle6qsf1x.R.globalSliceStart(getClass().getName(),28135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14t9sc9lpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lohlohle6qsf1x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lohlohle6qsf1x.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyGetDayOfMonth1269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14t9sc9lpj(){try{__CLR4_4_1lohlohle6qsf1x.R.inc(28135); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28136);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28137);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28138);assertEquals("dayOfMonth", test.dayOfMonth().getName()); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28139);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28140);assertSame(test, test.dayOfMonth().getReadablePartial()); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28141);assertSame(test, test.dayOfMonth().getMonthDay()); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28142);assertEquals(6, test.dayOfMonth().get()); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28143);assertEquals("6", test.dayOfMonth().getAsString()); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28144);assertEquals("6", test.dayOfMonth().getAsText()); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28145);assertEquals("6", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28146);assertEquals("6", test.dayOfMonth().getAsShortText()); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28147);assertEquals("6", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28148);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28149);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28150);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28151);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28152);test = new MonthDay(4, 7); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28153);assertEquals("7", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28154);assertEquals("7", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1lohlohle6qsf1x.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonthOfYear1270() {__CLR4_4_1lohlohle6qsf1x.R.globalSliceStart(getClass().getName(),28155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lw7vllq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lohlohle6qsf1x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lohlohle6qsf1x.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddWrapFieldMonthOfYear1270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lw7vllq3(){try{__CLR4_4_1lohlohle6qsf1x.R.inc(28155); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28156);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28157);MonthDay copy = test.monthOfYear().addWrapFieldToCopy(2); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28158);check(test, 5, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28159);check(copy, 7, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28160);copy = test.monthOfYear().addWrapFieldToCopy(2); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28161);check(copy, 7, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28162);copy = test.monthOfYear().addWrapFieldToCopy(292278993 - 4 + 1); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28163);check(copy, 11, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28164);copy = test.monthOfYear().addWrapFieldToCopy(-292275054 - 4 - 1); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28165);check(copy, 6, 6); 
 }finally{__CLR4_4_1lohlohle6qsf1x.R.flushNeeded();}} 


public void testPropertySetMonthOfYear1271() {__CLR4_4_1lohlohle6qsf1x.R.globalSliceStart(getClass().getName(),28166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwp33vlqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lohlohle6qsf1x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lohlohle6qsf1x.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetMonthOfYear1271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwp33vlqe(){try{__CLR4_4_1lohlohle6qsf1x.R.inc(28166); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28167);MonthDay test = new MonthDay(10, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28168);MonthDay copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28169);check(test, 10, 6); 
     __CLR4_4_1lohlohle6qsf1x.R.inc(28170);check(copy, 12, 6); 
 }finally{__CLR4_4_1lohlohle6qsf1x.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1lohlohle6qsf1x.R.inc(28171);
        __CLR4_4_1lohlohle6qsf1x.R.inc(28172);assertEquals(monthOfYear, test.getMonthOfYear());
        __CLR4_4_1lohlohle6qsf1x.R.inc(28173);assertEquals(dayOfMonth, test.getDayOfMonth());
    }finally{__CLR4_4_1lohlohle6qsf1x.R.flushNeeded();}}
}
