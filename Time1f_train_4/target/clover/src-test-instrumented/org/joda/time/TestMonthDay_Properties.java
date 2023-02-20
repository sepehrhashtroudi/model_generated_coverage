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
public class TestMonthDay_Properties extends TestCase {static class __CLR4_4_1lqxlqxle6rjcnn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,28254,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lqxlqxle6rjcnn.R.inc(28185);
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28186);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lqxlqxle6rjcnn.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lqxlqxle6rjcnn.R.inc(28187);
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28188);return new TestSuite(TestMonthDay_Properties.class);
    }finally{__CLR4_4_1lqxlqxle6rjcnn.R.flushNeeded();}}

    public TestMonthDay_Properties(String name) {
        super(name);__CLR4_4_1lqxlqxle6rjcnn.R.inc(28190);try{__CLR4_4_1lqxlqxle6rjcnn.R.inc(28189);
    }finally{__CLR4_4_1lqxlqxle6rjcnn.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lqxlqxle6rjcnn.R.inc(28191);
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28192);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28193);zone = DateTimeZone.getDefault();
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28194);locale = Locale.getDefault();
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28195);Locale.setDefault(Locale.UK);
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28196);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1lqxlqxle6rjcnn.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lqxlqxle6rjcnn.R.inc(28197);
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28198);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28199);DateTimeZone.setDefault(zone);
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28200);zone = null;
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28201);Locale.setDefault(locale);
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28202);locale = null;
    }finally{__CLR4_4_1lqxlqxle6rjcnn.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyAddWrapFieldDayOfMonth409() {__CLR4_4_1lqxlqxle6rjcnn.R.globalSliceStart(getClass().getName(),28203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18p5tmnlrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqxlqxle6rjcnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqxlqxle6rjcnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddWrapFieldDayOfMonth409",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18p5tmnlrf(){try{__CLR4_4_1lqxlqxle6rjcnn.R.inc(28203); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28204);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28205);MonthDay copy = test.dayOfMonth().addWrapFieldToCopy(4); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28206);check(test, 4, 6); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28207);check(copy, 4, 10); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28208);copy = test.dayOfMonth().addWrapFieldToCopy(8); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28209);check(copy, 4, 14); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28210);copy = test.dayOfMonth().addWrapFieldToCopy(-8); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28211);check(copy, 4, 28); 
 }finally{__CLR4_4_1lqxlqxle6rjcnn.R.flushNeeded();}} 


public void testPropertyAddDayOfMonth445() {__CLR4_4_1lqxlqxle6rjcnn.R.globalSliceStart(getClass().getName(),28212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i83m6jlro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqxlqxle6rjcnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqxlqxle6rjcnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddDayOfMonth445",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i83m6jlro(){try{__CLR4_4_1lqxlqxle6rjcnn.R.inc(28212); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28213);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28214);MonthDay copy = test.dayOfMonth().addToCopy(6); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28215);check(test, 4, 6); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28216);check(copy, 4, 12); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28217);copy = test.dayOfMonth().addToCopy(7); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28218);check(copy, 4, 13); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28219);copy = test.dayOfMonth().addToCopy(-5); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28220);check(copy, 4, 1); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28221);copy = test.dayOfMonth().addToCopy(-6); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28222);check(copy, 3, 31); 
 }finally{__CLR4_4_1lqxlqxle6rjcnn.R.flushNeeded();}} 


public void testPropertyCompareToMonthOfYear1269() {__CLR4_4_1lqxlqxle6rjcnn.R.globalSliceStart(getClass().getName(),28223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ege7velrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqxlqxle6rjcnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqxlqxle6rjcnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyCompareToMonthOfYear1269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ege7velrz(){try{__CLR4_4_1lqxlqxle6rjcnn.R.inc(28223); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28224);MonthDay test1 = new MonthDay(TEST_TIME1); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28225);MonthDay test2 = new MonthDay(TEST_TIME2); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28226);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28227);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28228);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28229);try { 
         __CLR4_4_1lqxlqxle6rjcnn.R.inc(28230);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1lqxlqxle6rjcnn.R.inc(28231);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28232);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28233);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28234);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28235);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28236);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28237);try { 
         __CLR4_4_1lqxlqxle6rjcnn.R.inc(28238);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1lqxlqxle6rjcnn.R.inc(28239);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lqxlqxle6rjcnn.R.flushNeeded();}} 


public void testPropertySetTextDayOfMonth1283() {__CLR4_4_1lqxlqxle6rjcnn.R.globalSliceStart(getClass().getName(),28240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vu7xc8lsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqxlqxle6rjcnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqxlqxle6rjcnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetTextDayOfMonth1283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vu7xc8lsg(){try{__CLR4_4_1lqxlqxle6rjcnn.R.inc(28240); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28241);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28242);MonthDay copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28243);check(test, 4, 6); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28244);check(copy, 4, 12); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28245);copy = test.dayOfMonth().setCopy("2"); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28246);check(test, 4, 6); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28247);check(copy, 4, 2); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28248);copy = test.dayOfMonth().setCopy("4"); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28249);check(test, 4, 6); 
     __CLR4_4_1lqxlqxle6rjcnn.R.inc(28250);check(copy, 4, 4); 
 }finally{__CLR4_4_1lqxlqxle6rjcnn.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1lqxlqxle6rjcnn.R.inc(28251);
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28252);assertEquals(monthOfYear, test.getMonthOfYear());
        __CLR4_4_1lqxlqxle6rjcnn.R.inc(28253);assertEquals(dayOfMonth, test.getDayOfMonth());
    }finally{__CLR4_4_1lqxlqxle6rjcnn.R.flushNeeded();}}
}
