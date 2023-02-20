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
public class TestMonthDay_Basics extends TestCase {static class __CLR4_4_1lfqlfqle6rcl9t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,27932,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27782);
        __CLR4_4_1lfqlfqle6rcl9t.R.inc(27783);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27784);
        __CLR4_4_1lfqlfqle6rcl9t.R.inc(27785);return new TestSuite(TestMonthDay_Basics.class);
    }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}}

    public TestMonthDay_Basics(String name) {
        super(name);__CLR4_4_1lfqlfqle6rcl9t.R.inc(27787);try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27786);
    }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27788);
        __CLR4_4_1lfqlfqle6rcl9t.R.inc(27789);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lfqlfqle6rcl9t.R.inc(27790);zone = DateTimeZone.getDefault();
        __CLR4_4_1lfqlfqle6rcl9t.R.inc(27791);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27792);
        __CLR4_4_1lfqlfqle6rcl9t.R.inc(27793);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lfqlfqle6rcl9t.R.inc(27794);DateTimeZone.setDefault(zone);
        __CLR4_4_1lfqlfqle6rcl9t.R.inc(27795);zone = null;
    }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testWithers411() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj3ygdlg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithers411",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj3ygdlg4(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27796); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27797);MonthDay test = new MonthDay(10, 6); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27798);check(test.withMonthOfYear(5), 5, 6); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27799);check(test.withDayOfMonth(2), 10, 2); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27800);try { 
         __CLR4_4_1lfqlfqle6rcl9t.R.inc(27801);test.withMonthOfYear(0); 
         __CLR4_4_1lfqlfqle6rcl9t.R.inc(27802);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27803);try { 
         __CLR4_4_1lfqlfqle6rcl9t.R.inc(27804);test.withMonthOfYear(13); 
         __CLR4_4_1lfqlfqle6rcl9t.R.inc(27805);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testProperty432() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151fxirlge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testProperty432",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151fxirlge(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27806); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27807);MonthDay test = new MonthDay(6, 6); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27808);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27809);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27810);try { 
         __CLR4_4_1lfqlfqle6rcl9t.R.inc(27811);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1lfqlfqle6rcl9t.R.inc(27812);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27813);try { 
         __CLR4_4_1lfqlfqle6rcl9t.R.inc(27814);test.property(null); 
         __CLR4_4_1lfqlfqle6rcl9t.R.inc(27815);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testToString_String517() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eu0b5clgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String517",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eu0b5clgo(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27816); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27817);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27818);assertEquals("05 \ufffd\ufffd", test.toString("MM HH")); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27819);assertEquals("--05-06", test.toString((String) null)); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testSize1258() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlbtuqlgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSize1258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlbtuqlgs(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27820); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27821);MonthDay test = new MonthDay(); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27822);assertEquals(2, test.size()); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testIsSupported1259() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ulpv32lgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testIsSupported1259",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ulpv32lgv(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27823); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27824);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27825);assertEquals(false, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27826);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27827);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27828);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono1263() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3pucnlh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_Chrono1263",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3pucnlh1(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27829); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27830);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27831);MonthDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27832);check(base, 6, 6); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27833);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27834);check(test, 6, 6); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27835);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testSerialization1264() throws Exception {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11khtmklh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSerialization1264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11khtmklh8() throws Exception{try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27836); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27837);MonthDay test = new MonthDay(5, 6, COPTIC_PARIS); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27838);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27839);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27840);oos.writeObject(test); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27841);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27842);oos.close(); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27843);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27844);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27845);MonthDay result = (MonthDay) ois.readObject(); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27846);ois.close(); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27847);assertEquals(test, result); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27848);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27849);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27850);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testGetField1265() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sw3bj1lhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetField1265",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sw3bj1lhn(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27851); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27852);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27853);assertSame(COPTIC_UTC.monthOfYear(), test.getField(0)); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27854);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(1)); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27855);try { 
         __CLR4_4_1lfqlfqle6rcl9t.R.inc(27856);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27857);try { 
         __CLR4_4_1lfqlfqle6rcl9t.R.inc(27858);test.getField(2); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testGetFieldTypes1266() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gf622dlhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetFieldTypes1266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gf622dlhv(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27859); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27860);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27861);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27862);assertEquals(2, fields.length); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27863);assertSame(DateTimeFieldType.monthOfYear(), fields[0]); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27864);assertSame(DateTimeFieldType.dayOfMonth(), fields[1]); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27865);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono1267() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z6dxdvli2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_sameChrono1267",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z6dxdvli2(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27866); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27867);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27868);MonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27869);assertSame(base, test); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testWithField_same1268() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i3d92rli6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField_same1268",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i3d92rli6(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27870); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27871);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27872);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 9); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27873);assertEquals(new MonthDay(9, 6), test); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27874);assertSame(test, result); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testWithField1269() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149rafhlib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField1269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149rafhlib(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27875); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27876);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27877);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 10); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27878);assertEquals(new MonthDay(9, 6), test); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27879);assertEquals(new MonthDay(10, 6), result); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testMinus_RP1270() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1msnukglig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinus_RP1270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1msnukglig(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27880); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27881);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27882);MonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27883);MonthDay expected = new MonthDay(5, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27884);assertEquals(expected, result); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27885);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27886);assertSame(test, result); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testPlus_RP1271() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ro845vlin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlus_RP1271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ro845vlin(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27887); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27888);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27889);MonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27890);MonthDay expected = new MonthDay(8, 9, BuddhistChronology.getInstance()); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27891);assertEquals(expected, result); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27892);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27893);assertSame(test, result); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testPlusMonths_int_wrap1272() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17m7x6lliu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_wrap1272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17m7x6lliu(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27894); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27895);MonthDay test = new MonthDay(6, 5, ISO_UTC); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27896);MonthDay result = test.plusMonths(10); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27897);MonthDay expected = new MonthDay(4, 5, ISO_UTC); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27898);assertEquals(expected, result); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testMinusMonths_int1273() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gyldkrliz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int1273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gyldkrliz(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27899); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27900);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27901);MonthDay result = test.minusMonths(1); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27902);MonthDay expected = new MonthDay(5, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27903);assertEquals(expected, result); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testMinusDays_int_negativeFromLeap1274() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sezqx2lj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_negativeFromLeap1274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sezqx2lj4(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27904); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27905);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27906);MonthDay result = test.minusDays(-1); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27907);MonthDay expected = new MonthDay(3, 1, ISOChronology.getInstance()); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27908);assertEquals(expected, result); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testToLocalDate1275() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1stdwb2lj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToLocalDate1275",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1stdwb2lj9(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27909); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27910);MonthDay base = new MonthDay(6, 6, COPTIC_UTC); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27911);LocalDate test = base.toLocalDate(2009); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27912);assertEquals(new LocalDate(2009, 6, 6, COPTIC_UTC), test); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27913);try { 
         __CLR4_4_1lfqlfqle6rcl9t.R.inc(27914);base.toLocalDate(0); 
         __CLR4_4_1lfqlfqle6rcl9t.R.inc(27915);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 


public void testToString_String_Locale1277() {__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceStart(getClass().getName(),27916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qafofjljg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lfqlfqle6rcl9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lfqlfqle6rcl9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String_Locale1277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qafofjljg(){try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27916); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27917);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27918);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27919);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27920);assertEquals("--05-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27921);assertEquals("\ufffd 6/5", test.toString("EEE d/M", null)); 
     __CLR4_4_1lfqlfqle6rcl9t.R.inc(27922);assertEquals("--05-06", test.toString(null, null)); 
 }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockMD extends MockPartial {
        
        @Override
        public Chronology getChronology() {try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27923);
            __CLR4_4_1lfqlfqle6rcl9t.R.inc(27924);return COPTIC_UTC;
        }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}}
        
        @Override
        public DateTimeField[] getFields() {try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27925);
            __CLR4_4_1lfqlfqle6rcl9t.R.inc(27926);return new DateTimeField[] {
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth()
            };
        }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}}
        
        @Override
        public int[] getValues() {try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27927);
            __CLR4_4_1lfqlfqle6rcl9t.R.inc(27928);return new int[] {10, 6};
        }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}}
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
    private void check(MonthDay test, int month, int day) {try{__CLR4_4_1lfqlfqle6rcl9t.R.inc(27929);
        __CLR4_4_1lfqlfqle6rcl9t.R.inc(27930);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1lfqlfqle6rcl9t.R.inc(27931);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1lfqlfqle6rcl9t.R.flushNeeded();}}
}
