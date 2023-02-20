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
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Basics} 
 */
public class TestMonthDay_Basics extends TestCase {static class __CLR4_4_1llpllple6rjcn5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,28140,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
//    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
//    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
//    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
//    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1llpllple6rjcn5.R.inc(27997);
        __CLR4_4_1llpllple6rjcn5.R.inc(27998);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1llpllple6rjcn5.R.inc(27999);
        __CLR4_4_1llpllple6rjcn5.R.inc(28000);return new TestSuite(TestMonthDay_Basics.class);
    }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}}

    public TestMonthDay_Basics(String name) {
        super(name);__CLR4_4_1llpllple6rjcn5.R.inc(28002);try{__CLR4_4_1llpllple6rjcn5.R.inc(28001);
    }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1llpllple6rjcn5.R.inc(28003);
        __CLR4_4_1llpllple6rjcn5.R.inc(28004);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1llpllple6rjcn5.R.inc(28005);zone = DateTimeZone.getDefault();
        __CLR4_4_1llpllple6rjcn5.R.inc(28006);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1llpllple6rjcn5.R.inc(28007);
        __CLR4_4_1llpllple6rjcn5.R.inc(28008);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1llpllple6rjcn5.R.inc(28009);DateTimeZone.setDefault(zone);
        __CLR4_4_1llpllple6rjcn5.R.inc(28010);zone = null;
    }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlusDays_int8() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1awgekslm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1awgekslm3(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28011); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28012);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28013);MonthDay result = test.plusDays(1); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28014);MonthDay expected = new MonthDay(5, 11, BuddhistChronology.getInstance()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28015);assertEquals(expected, result); 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testWithers408() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15k8tg5lm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithers408",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15k8tg5lm8(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28016); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28017);MonthDay test = new MonthDay(10, 6); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28018);check(test.withMonthOfYear(5), 5, 6); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28019);check(test.withDayOfMonth(2), 10, 2); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28020);try { 
         __CLR4_4_1llpllple6rjcn5.R.inc(28021);test.withMonthOfYear(0); 
         __CLR4_4_1llpllple6rjcn5.R.inc(28022);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1llpllple6rjcn5.R.inc(28023);try { 
         __CLR4_4_1llpllple6rjcn5.R.inc(28024);test.withMonthOfYear(13); 
         __CLR4_4_1llpllple6rjcn5.R.inc(28025);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testProperty432() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151fxirlmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testProperty432",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151fxirlmi(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28026); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28027);MonthDay test = new MonthDay(6, 6); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28028);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28029);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28030);try { 
         __CLR4_4_1llpllple6rjcn5.R.inc(28031);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1llpllple6rjcn5.R.inc(28032);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1llpllple6rjcn5.R.inc(28033);try { 
         __CLR4_4_1llpllple6rjcn5.R.inc(28034);test.property(null); 
         __CLR4_4_1llpllple6rjcn5.R.inc(28035);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testEqualsHashCode467() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12pmidslms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testEqualsHashCode467",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12pmidslms(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28036); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28037);MonthDay test1 = new MonthDay(10, 6, COPTIC_PARIS); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28038);MonthDay test2 = new MonthDay(10, 6, COPTIC_PARIS); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28039);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28040);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28041);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28042);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28043);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28044);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28045);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28046);MonthDay test3 = new MonthDay(10, 6); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28047);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28048);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28049);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28050);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28051);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28052);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28053);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28054);assertEquals(true, test1.equals(new MockMD())); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28055);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testToString_String517() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eu0b5clnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String517",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eu0b5clnc(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28056); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28057);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28058);assertEquals("05 \ufffd\ufffd", test.toString("MM HH")); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28059);assertEquals("--05-06", test.toString((String) null)); 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testIsSupported1268() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyj950lng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testIsSupported1268",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyj950lng(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28060); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28061);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28062);assertEquals(false, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28063);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28064);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28065);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono1271() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1454lylnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_Chrono1271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1454lylnm(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28066); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28067);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28068);MonthDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28069);check(base, 6, 6); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28070);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28071);check(test, 6, 6); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28072);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testGetField1272() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m65q9zlnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetField1272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m65q9zlnt(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28073); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28074);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28075);assertSame(COPTIC_UTC.monthOfYear(), test.getField(0)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28076);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(1)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28077);try { 
         __CLR4_4_1llpllple6rjcn5.R.inc(28078);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1llpllple6rjcn5.R.inc(28079);try { 
         __CLR4_4_1llpllple6rjcn5.R.inc(28080);test.getField(2); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testGetFieldTypes1273() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13joy3rlo1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetFieldTypes1273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13joy3rlo1(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28081); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28082);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28083);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28084);assertEquals(2, fields.length); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28085);assertSame(DateTimeFieldType.monthOfYear(), fields[0]); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28086);assertSame(DateTimeFieldType.dayOfMonth(), fields[1]); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28087);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testWithField1274() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqmd0nlo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField1274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqmd0nlo8(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28088); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28089);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28090);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 10); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28091);assertEquals(new MonthDay(9, 6), test); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28092);assertEquals(new MonthDay(10, 6), result); 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testWithFieldAdded_unknownField1275() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q3xelzlod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_unknownField1275",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q3xelzlod(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28093); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28094);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28095);try { 
         __CLR4_4_1llpllple6rjcn5.R.inc(28096);test.withFieldAdded(DurationFieldType.hours(), 6); 
         __CLR4_4_1llpllple6rjcn5.R.inc(28097);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testPlusDays_same1276() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylqguvloi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_same1276",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ylqguvloi(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28098); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28099);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28100);MonthDay result = test.plusDays(0); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28101);assertSame(test, result); 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testPlusMonths_int_wrap1277() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nv7r4ylom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_wrap1277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nv7r4ylom(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28102); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28103);MonthDay test = new MonthDay(6, 5, ISO_UTC); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28104);MonthDay result = test.plusMonths(10); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28105);MonthDay expected = new MonthDay(4, 5, ISO_UTC); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28106);assertEquals(expected, result); 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testMinusMonths_int1278() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pljmelor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int1278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pljmelor(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28107); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28108);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28109);MonthDay result = test.minusMonths(1); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28110);MonthDay expected = new MonthDay(5, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28111);assertEquals(expected, result); 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testMinusDays_int_negativeFromLeap1279() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qd4h3plow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_negativeFromLeap1279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qd4h3plow(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28112); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28113);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28114);MonthDay result = test.minusDays(-1); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28115);MonthDay expected = new MonthDay(3, 1, ISOChronology.getInstance()); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28116);assertEquals(expected, result); 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testToLocalDate1280() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcitpwlp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToLocalDate1280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcitpwlp1(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28117); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28118);MonthDay base = new MonthDay(6, 6, COPTIC_UTC); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28119);LocalDate test = base.toLocalDate(2009); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28120);assertEquals(new LocalDate(2009, 6, 6, COPTIC_UTC), test); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28121);try { 
         __CLR4_4_1llpllple6rjcn5.R.inc(28122);base.toLocalDate(0); 
         __CLR4_4_1llpllple6rjcn5.R.inc(28123);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 


public void testToString_String_Locale1282() {__CLR4_4_1llpllple6rjcn5.R.globalSliceStart(getClass().getName(),28124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v9tayflp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1llpllple6rjcn5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1llpllple6rjcn5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String_Locale1282",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v9tayflp8(){try{__CLR4_4_1llpllple6rjcn5.R.inc(28124); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28125);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28126);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28127);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28128);assertEquals("--05-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28129);assertEquals("\ufffd 6/5", test.toString("EEE d/M", null)); 
     __CLR4_4_1llpllple6rjcn5.R.inc(28130);assertEquals("--05-06", test.toString(null, null)); 
 }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockMD extends MockPartial {
        
        @Override
        public Chronology getChronology() {try{__CLR4_4_1llpllple6rjcn5.R.inc(28131);
            __CLR4_4_1llpllple6rjcn5.R.inc(28132);return COPTIC_UTC;
        }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}}
        
        @Override
        public DateTimeField[] getFields() {try{__CLR4_4_1llpllple6rjcn5.R.inc(28133);
            __CLR4_4_1llpllple6rjcn5.R.inc(28134);return new DateTimeField[] {
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth()
            };
        }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}}
        
        @Override
        public int[] getValues() {try{__CLR4_4_1llpllple6rjcn5.R.inc(28135);
            __CLR4_4_1llpllple6rjcn5.R.inc(28136);return new int[] {10, 6};
        }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    
    
    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    
    
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
    private void check(MonthDay test, int month, int day) {try{__CLR4_4_1llpllple6rjcn5.R.inc(28137);
        __CLR4_4_1llpllple6rjcn5.R.inc(28138);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1llpllple6rjcn5.R.inc(28139);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1llpllple6rjcn5.R.flushNeeded();}}
}
