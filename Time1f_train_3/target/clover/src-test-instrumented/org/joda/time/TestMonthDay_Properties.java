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
public class TestMonthDay_Properties extends TestCase {static class __CLR4_4_1llnllnle6rclb0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,28102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1llnllnle6rclb0.R.inc(27995);
        __CLR4_4_1llnllnle6rclb0.R.inc(27996);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1llnllnle6rclb0.R.inc(27997);
        __CLR4_4_1llnllnle6rclb0.R.inc(27998);return new TestSuite(TestMonthDay_Properties.class);
    }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}}

    public TestMonthDay_Properties(String name) {
        super(name);__CLR4_4_1llnllnle6rclb0.R.inc(28000);try{__CLR4_4_1llnllnle6rclb0.R.inc(27999);
    }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1llnllnle6rclb0.R.inc(28001);
        __CLR4_4_1llnllnle6rclb0.R.inc(28002);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1llnllnle6rclb0.R.inc(28003);zone = DateTimeZone.getDefault();
        __CLR4_4_1llnllnle6rclb0.R.inc(28004);locale = Locale.getDefault();
        __CLR4_4_1llnllnle6rclb0.R.inc(28005);Locale.setDefault(Locale.UK);
        __CLR4_4_1llnllnle6rclb0.R.inc(28006);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1llnllnle6rclb0.R.inc(28007);
        __CLR4_4_1llnllnle6rclb0.R.inc(28008);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1llnllnle6rclb0.R.inc(28009);DateTimeZone.setDefault(zone);
        __CLR4_4_1llnllnle6rclb0.R.inc(28010);zone = null;
        __CLR4_4_1llnllnle6rclb0.R.inc(28011);Locale.setDefault(locale);
        __CLR4_4_1llnllnle6rclb0.R.inc(28012);locale = null;
    }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyAddMonthOfYear443() {__CLR4_4_1llnllnle6rclb0.R.globalSliceStart(getClass().getName(),28013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hl99vklm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llnllnle6rclb0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llnllnle6rclb0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddMonthOfYear443",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hl99vklm5(){try{__CLR4_4_1llnllnle6rclb0.R.inc(28013); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28014);MonthDay test = new MonthDay(3, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28015);MonthDay copy = test.monthOfYear().addToCopy(9); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28016);check(test, 3, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28017);check(copy, 12, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28018);copy = test.monthOfYear().addToCopy(0); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28019);check(copy, 3, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28020);check(test, 3, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28021);copy = test.monthOfYear().addToCopy(-3); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28022);check(copy, 12, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28023);check(test, 3, 6); 
 }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}} 


public void testPropertyAddDayOfMonth444() {__CLR4_4_1llnllnle6rclb0.R.globalSliceStart(getClass().getName(),28024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lh3kz0lmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llnllnle6rclb0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llnllnle6rclb0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddDayOfMonth444",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lh3kz0lmg(){try{__CLR4_4_1llnllnle6rclb0.R.inc(28024); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28025);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28026);MonthDay copy = test.dayOfMonth().addToCopy(6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28027);check(test, 4, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28028);check(copy, 4, 12); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28029);copy = test.dayOfMonth().addToCopy(7); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28030);check(copy, 4, 13); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28031);copy = test.dayOfMonth().addToCopy(-5); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28032);check(copy, 4, 1); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28033);copy = test.dayOfMonth().addToCopy(-6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28034);check(copy, 3, 31); 
 }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}} 


public void testPropertyCompareToMonthOfYear1260() {__CLR4_4_1llnllnle6rclb0.R.globalSliceStart(getClass().getName(),28035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbq4zhlmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llnllnle6rclb0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llnllnle6rclb0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyCompareToMonthOfYear1260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbq4zhlmr(){try{__CLR4_4_1llnllnle6rclb0.R.inc(28035); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28036);MonthDay test1 = new MonthDay(TEST_TIME1); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28037);MonthDay test2 = new MonthDay(TEST_TIME2); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28038);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28039);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28040);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28041);try { 
         __CLR4_4_1llnllnle6rclb0.R.inc(28042);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1llnllnle6rclb0.R.inc(28043);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1llnllnle6rclb0.R.inc(28044);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28045);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28046);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28047);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28048);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28049);try { 
         __CLR4_4_1llnllnle6rclb0.R.inc(28050);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1llnllnle6rclb0.R.inc(28051);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}} 


public void testPropertyGetDayOfMonth1278() {__CLR4_4_1llnllnle6rclb0.R.globalSliceStart(getClass().getName(),28052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lnl5etln8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llnllnle6rclb0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llnllnle6rclb0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyGetDayOfMonth1278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lnl5etln8(){try{__CLR4_4_1llnllnle6rclb0.R.inc(28052); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28053);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28054);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28055);assertEquals("dayOfMonth", test.dayOfMonth().getName()); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28056);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28057);assertSame(test, test.dayOfMonth().getReadablePartial()); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28058);assertSame(test, test.dayOfMonth().getMonthDay()); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28059);assertEquals(6, test.dayOfMonth().get()); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28060);assertEquals("6", test.dayOfMonth().getAsString()); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28061);assertEquals("6", test.dayOfMonth().getAsText()); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28062);assertEquals("6", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28063);assertEquals("6", test.dayOfMonth().getAsShortText()); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28064);assertEquals("6", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28065);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28066);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28067);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28068);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28069);test = new MonthDay(4, 7); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28070);assertEquals("7", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28071);assertEquals("7", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonthOfYear1279() {__CLR4_4_1llnllnle6rclb0.R.globalSliceStart(getClass().getName(),28072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn3h8olns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llnllnle6rclb0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llnllnle6rclb0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddWrapFieldMonthOfYear1279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn3h8olns(){try{__CLR4_4_1llnllnle6rclb0.R.inc(28072); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28073);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28074);MonthDay copy = test.monthOfYear().addWrapFieldToCopy(2); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28075);check(test, 5, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28076);check(copy, 7, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28077);copy = test.monthOfYear().addWrapFieldToCopy(2); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28078);check(copy, 7, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28079);copy = test.monthOfYear().addWrapFieldToCopy(292278993 - 4 + 1); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28080);check(copy, 11, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28081);copy = test.monthOfYear().addWrapFieldToCopy(-292275054 - 4 - 1); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28082);check(copy, 6, 6); 
 }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}} 


public void testPropertySetMonthOfYear1280() {__CLR4_4_1llnllnle6rclb0.R.globalSliceStart(getClass().getName(),28083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bnk147lo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llnllnle6rclb0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llnllnle6rclb0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetMonthOfYear1280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bnk147lo3(){try{__CLR4_4_1llnllnle6rclb0.R.inc(28083); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28084);MonthDay test = new MonthDay(10, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28085);MonthDay copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28086);check(test, 10, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28087);check(copy, 12, 6); 
 }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}} 


public void testPropertySetTextDayOfMonth1281() {__CLR4_4_1llnllnle6rclb0.R.globalSliceStart(getClass().getName(),28088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wow71ylo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llnllnle6rclb0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llnllnle6rclb0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetTextDayOfMonth1281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wow71ylo8(){try{__CLR4_4_1llnllnle6rclb0.R.inc(28088); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28089);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28090);MonthDay copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28091);check(test, 4, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28092);check(copy, 4, 12); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28093);copy = test.dayOfMonth().setCopy("2"); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28094);check(test, 4, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28095);check(copy, 4, 2); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28096);copy = test.dayOfMonth().setCopy("4"); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28097);check(test, 4, 6); 
     __CLR4_4_1llnllnle6rclb0.R.inc(28098);check(copy, 4, 4); 
 }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1llnllnle6rclb0.R.inc(28099);
        __CLR4_4_1llnllnle6rclb0.R.inc(28100);assertEquals(monthOfYear, test.getMonthOfYear());
        __CLR4_4_1llnllnle6rclb0.R.inc(28101);assertEquals(dayOfMonth, test.getDayOfMonth());
    }finally{__CLR4_4_1llnllnle6rclb0.R.flushNeeded();}}
}
