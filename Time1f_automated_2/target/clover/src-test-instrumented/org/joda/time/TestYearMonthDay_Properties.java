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
public class TestYearMonthDay_Properties extends TestCase {static class __CLR4_4_1k1hk1hle6nl8i5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,26070,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1k1hk1hle6nl8i5.R.inc(25973);
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(25974);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k1hk1hle6nl8i5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k1hk1hle6nl8i5.R.inc(25975);
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(25976);return new TestSuite(TestYearMonthDay_Properties.class);
    }finally{__CLR4_4_1k1hk1hle6nl8i5.R.flushNeeded();}}

    public TestYearMonthDay_Properties(String name) {
        super(name);__CLR4_4_1k1hk1hle6nl8i5.R.inc(25978);try{__CLR4_4_1k1hk1hle6nl8i5.R.inc(25977);
    }finally{__CLR4_4_1k1hk1hle6nl8i5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k1hk1hle6nl8i5.R.inc(25979);
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(25980);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(25981);zone = DateTimeZone.getDefault();
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(25982);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(25983);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(25984);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1k1hk1hle6nl8i5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k1hk1hle6nl8i5.R.inc(25985);
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(25986);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(25987);DateTimeZone.setDefault(zone);
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(25988);zone = null;
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(25989);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(25990);systemDefaultLocale = null;
    }finally{__CLR4_4_1k1hk1hle6nl8i5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertySetMonth13() {__CLR4_4_1k1hk1hle6nl8i5.R.globalSliceStart(getClass().getName(),25991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16a02suk1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1hk1hle6nl8i5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1hk1hle6nl8i5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetMonth13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16a02suk1z(){try{__CLR4_4_1k1hk1hle6nl8i5.R.inc(25991); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(25992);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(25993);YearMonthDay copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(25994);check(test, 1972, 6, 9); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(25995);check(copy, 1972, 12, 9); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(25996);test = new YearMonthDay(1972, 1, 31); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(25997);copy = test.monthOfYear().setCopy(2); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(25998);check(copy, 1972, 2, 29); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(25999);try { 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26000);test.monthOfYear().setCopy(13); 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26001);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26002);try { 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26003);test.monthOfYear().setCopy(0); 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26004);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k1hk1hle6nl8i5.R.flushNeeded();}}
public void testGetFieldType17() {__CLR4_4_1k1hk1hle6nl8i5.R.globalSliceStart(getClass().getName(),26005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v5u137k2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1hk1hle6nl8i5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1hk1hle6nl8i5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testGetFieldType17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v5u137k2d(){try{__CLR4_4_1k1hk1hle6nl8i5.R.inc(26005); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26006);YearMonthDay test = new YearMonthDay(COPTIC_PARIS); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26007);assertEquals(DateTimeFieldType.year(), test.getFieldType(0)); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26008);assertEquals(DateTimeFieldType.monthOfYear(), test.getFieldType(1)); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26009);assertEquals(DateTimeFieldType.dayOfMonth(), test.getFieldType(2)); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26010);try { 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26011);test.getFieldType(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26012);try { 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26013);test.getFieldType(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1k1hk1hle6nl8i5.R.flushNeeded();}}
public void testPropertyGetMonth32() {__CLR4_4_1k1hk1hle6nl8i5.R.globalSliceStart(getClass().getName(),26014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3hkx5k2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1hk1hle6nl8i5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1hk1hle6nl8i5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMonth32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3hkx5k2m(){try{__CLR4_4_1k1hk1hle6nl8i5.R.inc(26014); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26015);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26016);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26017);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26018);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26019);assertSame(test, test.monthOfYear().getReadablePartial()); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26020);assertSame(test, test.monthOfYear().getYearMonthDay()); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26021);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26022);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26023);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26024);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26025);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26026);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26027);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26028);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26029);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26030);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26031);test = new YearMonthDay(1972, 7, 9); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26032);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26033);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1k1hk1hle6nl8i5.R.flushNeeded();}}
public void testPropertyWithMaximumValueDayOfMonth33() {__CLR4_4_1k1hk1hle6nl8i5.R.globalSliceStart(getClass().getName(),26034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gc3ur2k36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1hk1hle6nl8i5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1hk1hle6nl8i5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyWithMaximumValueDayOfMonth33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gc3ur2k36(){try{__CLR4_4_1k1hk1hle6nl8i5.R.inc(26034); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26035);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26036);YearMonthDay copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26037);check(test, 1972, 6, 9); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26038);check(copy, 1972, 6, 30); 
 }finally{__CLR4_4_1k1hk1hle6nl8i5.R.flushNeeded();}}
public void testProperty191() {__CLR4_4_1k1hk1hle6nl8i5.R.globalSliceStart(getClass().getName(),26039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ql6pcnk3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1hk1hle6nl8i5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1hk1hle6nl8i5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testProperty191",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ql6pcnk3b(){try{__CLR4_4_1k1hk1hle6nl8i5.R.inc(26039); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26040);MonthDay test = new MonthDay(6, 6); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26041);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26042);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26043);try { 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26044);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26045);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26046);try { 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26047);test.property(null); 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26048);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k1hk1hle6nl8i5.R.flushNeeded();}}
public void testPropertyCompareToDay192() {__CLR4_4_1k1hk1hle6nl8i5.R.globalSliceStart(getClass().getName(),26049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h8kq1ek3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k1hk1hle6nl8i5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k1hk1hle6nl8i5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyCompareToDay192",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h8kq1ek3l(){try{__CLR4_4_1k1hk1hle6nl8i5.R.inc(26049); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26050);LocalDateTime test1 = new LocalDateTime(TEST_TIME1); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26051);LocalDateTime test2 = new LocalDateTime(TEST_TIME2); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26052);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26053);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26054);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26055);try { 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26056);test1.dayOfMonth().compareTo((ReadablePartial) null); 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26057);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26058);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26059);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26060);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26061);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26062);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0); 
     __CLR4_4_1k1hk1hle6nl8i5.R.inc(26063);try { 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26064);test1.dayOfMonth().compareTo((ReadableInstant) null); 
         __CLR4_4_1k1hk1hle6nl8i5.R.inc(26065);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k1hk1hle6nl8i5.R.flushNeeded();}}
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int year, int month, int day) {try{__CLR4_4_1k1hk1hle6nl8i5.R.inc(26066);
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(26067);assertEquals(year, test.getYear());
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(26068);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1k1hk1hle6nl8i5.R.inc(26069);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1k1hk1hle6nl8i5.R.flushNeeded();}}
}
