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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Basics extends TestCase {static class __CLR4_4_1q44q44lc8axel9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,34112,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1q44q44lc8axel9.R.inc(33844);
        __CLR4_4_1q44q44lc8axel9.R.inc(33845);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1q44q44lc8axel9.R.inc(33846);
        __CLR4_4_1q44q44lc8axel9.R.inc(33847);return new TestSuite(TestYearMonthDay_Basics.class);
    }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}}

    public TestYearMonthDay_Basics(String name) {
        super(name);__CLR4_4_1q44q44lc8axel9.R.inc(33849);try{__CLR4_4_1q44q44lc8axel9.R.inc(33848);
    }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1q44q44lc8axel9.R.inc(33850);
        __CLR4_4_1q44q44lc8axel9.R.inc(33851);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1q44q44lc8axel9.R.inc(33852);zone = DateTimeZone.getDefault();
        __CLR4_4_1q44q44lc8axel9.R.inc(33853);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1q44q44lc8axel9.R.inc(33854);
        __CLR4_4_1q44q44lc8axel9.R.inc(33855);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1q44q44lc8axel9.R.inc(33856);DateTimeZone.setDefault(zone);
        __CLR4_4_1q44q44lc8axel9.R.inc(33857);zone = null;
    }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToInterval259() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o1se5xq4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToInterval259",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o1se5xq4i(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33858); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33859);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33860);Interval test = base.toInterval(); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33861);check(base, 2005, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33862);DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33863);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33864);Interval expected = new Interval(start, end); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33865);assertEquals(expected, test); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testMinusYears_int279() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13164tq4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusYears_int279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13164tq4q(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33866); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33867);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33868);YearMonthDay result = test.minusYears(1); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33869);YearMonthDay expected = new YearMonthDay(2001, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33870);assertEquals(expected, result); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33871);result = test.minusYears(0); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33872);assertSame(test, result); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testPlusMonths_int413() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo7keq4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusMonths_int413",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo7keq4x(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33873); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33874);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33875);YearMonthDay result = test.plusMonths(1); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33876);YearMonthDay expected = new YearMonthDay(2002, 6, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33877);assertEquals(expected, result); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33878);result = test.plusMonths(0); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33879);assertSame(test, result); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testEqualsHashCode415() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqouq5q54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testEqualsHashCode415",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqouq5q54(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33880); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33881);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33882);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33883);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33884);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33885);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33886);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33887);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33888);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33889);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33890);YearMonthDay test3 = new YearMonthDay(1971, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33891);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33892);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33893);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33894);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33895);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33896);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33897);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33898);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33899);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testPlus_RP484() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1za3ztmq5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlus_RP484",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1za3ztmq5o(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33900); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33901);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33902);YearMonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33903);YearMonthDay expected = new YearMonthDay(2003, 7, 7, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33904);assertEquals(expected, result); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33905);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33906);assertSame(test, result); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testPlusDays_int600() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174cofqq5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusDays_int600",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174cofqq5v(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33907); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33908);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33909);YearMonthDay result = test.plusDays(1); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33910);YearMonthDay expected = new YearMonthDay(2002, 5, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33911);assertEquals(expected, result); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33912);result = test.plusDays(0); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33913);assertSame(test, result); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testToString_String_Locale663() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ob30tq62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString_String_Locale663",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ob30tq62(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33914); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33915);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33916);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33917);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33918);assertEquals("2002-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33919);assertEquals("\ufffd 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33920);assertEquals("2002-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testGetField665() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13d9bfqq69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetField665",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13d9bfqq69(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33921); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33922);YearMonthDay test = new YearMonthDay(COPTIC_PARIS); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33923);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33924);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33925);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33926);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(33927);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1q44q44lc8axel9.R.inc(33928);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(33929);test.getField(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testWithField3702() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fc23nzq6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField3702",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fc23nzq6i(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33930); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33931);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33932);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(33933);test.withField(DateTimeFieldType.hourOfDay(), 6); 
         __CLR4_4_1q44q44lc8axel9.R.inc(33934);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testWithChronologyRetainFields_nullChrono709() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3pnn8q6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_nullChrono709",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3pnn8q6n(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33935); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33936);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33937);YearMonthDay test = base.withChronologyRetainFields(null); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33938);check(base, 2005, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33939);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33940);check(test, 2005, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33941);assertEquals(ISO_UTC, test.getChronology()); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testGet718() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9bsg1q6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGet718",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9bsg1q6u(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33942); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33943);YearMonthDay test = new YearMonthDay(); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33944);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33945);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33946);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33947);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(33948);test.get(null); 
         __CLR4_4_1q44q44lc8axel9.R.inc(33949);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1q44q44lc8axel9.R.inc(33950);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(33951);test.get(DateTimeFieldType.hourOfDay()); 
         __CLR4_4_1q44q44lc8axel9.R.inc(33952);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testToDateTimeAtMidnight_nullZone747() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4h21mq75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight_nullZone747",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4h21mq75(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33953); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33954);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33955);DateTime test = base.toDateTimeAtMidnight((DateTimeZone) null); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33956);check(base, 2005, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33957);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono755() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q77o7wq7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_sameChrono755",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q77o7wq7a(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33958); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33959);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33960);YearMonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33961);assertSame(base, test); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testWithers892() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vw887eq7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithers892",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vw887eq7e(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33962); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33963);YearMonthDay test = new YearMonthDay(1970, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33964);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33965);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33966);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33967);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(33968);test.withMonthOfYear(0); 
         __CLR4_4_1q44q44lc8axel9.R.inc(33969);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1q44q44lc8axel9.R.inc(33970);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(33971);test.withMonthOfYear(13); 
         __CLR4_4_1q44q44lc8axel9.R.inc(33972);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testToDateMidnight971() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w9wsvq7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateMidnight971",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w9wsvq7p(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33973); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33974);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33975);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33976);check(base, 2005, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33977);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testPlusYears_int997() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t0dbokq7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusYears_int997",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t0dbokq7u(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33978); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33979);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33980);YearMonthDay result = test.plusYears(1); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33981);YearMonthDay expected = new YearMonthDay(2003, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33982);assertEquals(expected, result); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33983);result = test.plusYears(0); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33984);assertSame(test, result); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testGetFieldTypes1022() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11yo1pzq81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetFieldTypes1022",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11yo1pzq81(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33985); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33986);YearMonthDay test = new YearMonthDay(COPTIC_PARIS); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33987);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33988);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33989);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33990);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33991);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testWithField11058() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqtuigq88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField11058",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqtuigq88(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33992); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33993);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33994);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33995);assertEquals(new YearMonthDay(2004, 6, 9), test); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33996);assertEquals(new YearMonthDay(2006, 6, 9), result); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testToString1294() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),33997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t346chq8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString1294",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t346chq8d(){try{__CLR4_4_1q44q44lc8axel9.R.inc(33997); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33998);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(33999);assertEquals("2002-06-09", test.toString()); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testToDateTime_TOD_nullZone1466() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),34000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzf1kaq8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_TOD_nullZone1466",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzf1kaq8g(){try{__CLR4_4_1q44q44lc8axel9.R.inc(34000); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34001);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34002);TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34003);DateTime test = base.toDateTime(tod, null); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34004);check(base, 2005, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34005);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34006);assertEquals(expected, test); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testToDateTimeAtCurrentTime1467() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),34007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cu0yx6q8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtCurrentTime1467",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cu0yx6q8n(){try{__CLR4_4_1q44q44lc8axel9.R.inc(34007); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34008);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34009);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34010);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34011);DateTime test = base.toDateTimeAtCurrentTime(); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34012);check(base, 2005, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34013);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34014);expected = expected.year().setCopy(2005); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34015);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34016);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34017);assertEquals(expected, test); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testMinusMonths_int1483() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),34018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18hk58mq8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusMonths_int1483",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18hk58mq8y(){try{__CLR4_4_1q44q44lc8axel9.R.inc(34018); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34019);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34020);YearMonthDay result = test.minusMonths(1); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34021);YearMonthDay expected = new YearMonthDay(2002, 4, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34022);assertEquals(expected, result); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34023);result = test.minusMonths(0); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34024);assertSame(test, result); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testToLocalDate1497() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),34025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wumgmsq95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToLocalDate1497",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wumgmsq95(){try{__CLR4_4_1q44q44lc8axel9.R.inc(34025); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34026);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_UTC); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34027);LocalDate test = base.toLocalDate(); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34028);assertEquals(new LocalDate(2005, 6, 9, COPTIC_UTC), test); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testCompareTo1498() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),34029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y76qonq99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testCompareTo1498",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y76qonq99(){try{__CLR4_4_1q44q44lc8axel9.R.inc(34029); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34030);YearMonthDay test1 = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34031);YearMonthDay test1a = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34032);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34033);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34034);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34035);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34036);YearMonthDay test2 = new YearMonthDay(2005, 7, 2); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34037);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34038);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34039);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34040);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34041);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34042);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34043);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1q44q44lc8axel9.R.inc(34044);int[] values = new int[] { 2005, 6, 2 }; 
     __CLR4_4_1q44q44lc8axel9.R.inc(34045);Partial p = new Partial(types, values); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34046);assertEquals(0, test1.compareTo(p)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34047);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(34048);test1.compareTo(null); 
         __CLR4_4_1q44q44lc8axel9.R.inc(34049);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1q44q44lc8axel9.R.inc(34050);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(34051);test1.compareTo(new TimeOfDay()); 
         __CLR4_4_1q44q44lc8axel9.R.inc(34052);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1q44q44lc8axel9.R.inc(34053);Partial partial = new Partial().with(DateTimeFieldType.centuryOfEra(), 1).with(DateTimeFieldType.halfdayOfDay(), 0).with(DateTimeFieldType.dayOfMonth(), 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34054);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(34055);new YearMonthDay(1970, 6, 9).compareTo(partial); 
         __CLR4_4_1q44q44lc8axel9.R.inc(34056);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testWithField41524() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),34057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ywi0xqa1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField41524",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ywi0xqa1(){try{__CLR4_4_1q44q44lc8axel9.R.inc(34057); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34058);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34059);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2004); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34060);assertEquals(new YearMonthDay(2004, 6, 9), test); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34061);assertSame(test, result); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testToDateTimeAtMidnight1553() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),34062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w123ccqa6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight1553",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w123ccqa6(){try{__CLR4_4_1q44q44lc8axel9.R.inc(34062); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34063);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34064);DateTime test = base.toDateTimeAtMidnight(); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34065);check(base, 2005, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34066);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testProperty1587() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),34067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jlzrqpqab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testProperty1587",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jlzrqpqab(){try{__CLR4_4_1q44q44lc8axel9.R.inc(34067); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34068);YearMonthDay test = new YearMonthDay(2005, 6, 9); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34069);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34070);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34071);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34072);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(34073);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1q44q44lc8axel9.R.inc(34074);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1q44q44lc8axel9.R.inc(34075);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(34076);test.property(null); 
         __CLR4_4_1q44q44lc8axel9.R.inc(34077);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testIsBefore_YMD1598() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),34078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12915gqqam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testIsBefore_YMD1598",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12915gqqam(){try{__CLR4_4_1q44q44lc8axel9.R.inc(34078); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34079);YearMonthDay test1 = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34080);YearMonthDay test1a = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34081);assertEquals(false, test1.isBefore(test1a)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34082);assertEquals(false, test1a.isBefore(test1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34083);assertEquals(false, test1.isBefore(test1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34084);assertEquals(false, test1a.isBefore(test1a)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34085);YearMonthDay test2 = new YearMonthDay(2005, 7, 2); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34086);assertEquals(true, test1.isBefore(test2)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34087);assertEquals(false, test2.isBefore(test1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34088);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34089);assertEquals(true, test1.isBefore(test3)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34090);assertEquals(false, test3.isBefore(test1)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34091);assertEquals(false, test3.isBefore(test2)); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34092);try { 
         __CLR4_4_1q44q44lc8axel9.R.inc(34093);new YearMonthDay(2005, 7, 2).isBefore(null); 
         __CLR4_4_1q44q44lc8axel9.R.inc(34094);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 


public void testMinusDays_int1624() {__CLR4_4_1q44q44lc8axel9.R.globalSliceStart(getClass().getName(),34095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11va843qb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q44q44lc8axel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q44q44lc8axel9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusDays_int1624",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11va843qb3(){try{__CLR4_4_1q44q44lc8axel9.R.inc(34095); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34096);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34097);YearMonthDay result = test.minusDays(1); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34098);YearMonthDay expected = new YearMonthDay(2002, 5, 2, BuddhistChronology.getInstance()); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34099);assertEquals(expected, result); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34100);result = test.minusDays(0); 
     __CLR4_4_1q44q44lc8axel9.R.inc(34101);assertSame(test, result); 
 }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1q44q44lc8axel9.R.inc(34102);
            __CLR4_4_1q44q44lc8axel9.R.inc(34103);return COPTIC_UTC;
        }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1q44q44lc8axel9.R.inc(34104);
            __CLR4_4_1q44q44lc8axel9.R.inc(34105);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1q44q44lc8axel9.R.inc(34106);
            __CLR4_4_1q44q44lc8axel9.R.inc(34107);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}}
    }

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
    private void check(YearMonthDay test, int hour, int min, int sec) {try{__CLR4_4_1q44q44lc8axel9.R.inc(34108);
        __CLR4_4_1q44q44lc8axel9.R.inc(34109);assertEquals(hour, test.getYear());
        __CLR4_4_1q44q44lc8axel9.R.inc(34110);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1q44q44lc8axel9.R.inc(34111);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1q44q44lc8axel9.R.flushNeeded();}}
}
