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
public class TestMonthDay_Basics extends TestCase {static class __CLR4_4_1iqjiqjle6np4hw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,24366,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24283);
        __CLR4_4_1iqjiqjle6np4hw.R.inc(24284);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24285);
        __CLR4_4_1iqjiqjle6np4hw.R.inc(24286);return new TestSuite(TestMonthDay_Basics.class);
    }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}

    public TestMonthDay_Basics(String name) {
        super(name);__CLR4_4_1iqjiqjle6np4hw.R.inc(24288);try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24287);
    }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24289);
        __CLR4_4_1iqjiqjle6np4hw.R.inc(24290);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iqjiqjle6np4hw.R.inc(24291);zone = DateTimeZone.getDefault();
        __CLR4_4_1iqjiqjle6np4hw.R.inc(24292);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24293);
        __CLR4_4_1iqjiqjle6np4hw.R.inc(24294);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iqjiqjle6np4hw.R.inc(24295);DateTimeZone.setDefault(zone);
        __CLR4_4_1iqjiqjle6np4hw.R.inc(24296);zone = null;
    }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPlus_RP2() {__CLR4_4_1iqjiqjle6np4hw.R.globalSliceStart(getClass().getName(),24297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y664k8iqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqjiqjle6np4hw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqjiqjle6np4hw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlus_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y664k8iqx(){try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24297); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24298);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance()); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24299);TimeOfDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24300);TimeOfDay expected = new TimeOfDay(15, 26, 37, 48, BuddhistChronology.getInstance()); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24301);assertEquals(expected, result); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24302);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24303);assertSame(test, result); 
 }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}
public void testSerialization173() throws Exception {__CLR4_4_1iqjiqjle6np4hw.R.globalSliceStart(getClass().getName(),24304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6w5cair4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqjiqjle6np4hw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqjiqjle6np4hw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSerialization173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6w5cair4() throws Exception{try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24304); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24305);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24306);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24307);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24308);oos.writeObject(test); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24309);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24310);oos.close(); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24311);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24312);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24313);TimeOfDay result = (TimeOfDay) ois.readObject(); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24314);ois.close(); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24315);assertEquals(test, result); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24316);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24317);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24318);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}
public void testProperty539() {__CLR4_4_1iqjiqjle6np4hw.R.globalSliceStart(getClass().getName(),24319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pnl06zirj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqjiqjle6np4hw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqjiqjle6np4hw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testProperty539",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pnl06zirj(){try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24319); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24320);MonthDay test = new MonthDay(6, 6); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24321);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24322);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24323);try { 
         __CLR4_4_1iqjiqjle6np4hw.R.inc(24324);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1iqjiqjle6np4hw.R.inc(24325);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24326);try { 
         __CLR4_4_1iqjiqjle6np4hw.R.inc(24327);test.property(null); 
         __CLR4_4_1iqjiqjle6np4hw.R.inc(24328);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}
public void testGetField540() {__CLR4_4_1iqjiqjle6np4hw.R.globalSliceStart(getClass().getName(),24329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uif8iirt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqjiqjle6np4hw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqjiqjle6np4hw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetField540",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uif8iirt(){try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24329); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24330);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24331);assertSame(COPTIC_UTC.monthOfYear(), test.getField(0)); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24332);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(1)); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24333);try { 
         __CLR4_4_1iqjiqjle6np4hw.R.inc(24334);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24335);try { 
         __CLR4_4_1iqjiqjle6np4hw.R.inc(24336);test.getField(2); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}
public void testConstructor_nullChronology541() throws Throwable {__CLR4_4_1iqjiqjle6np4hw.R.globalSliceStart(getClass().getName(),24337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12d3gppis1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqjiqjle6np4hw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqjiqjle6np4hw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testConstructor_nullChronology541",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12d3gppis1() throws Throwable{try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24337); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24338);MonthDay test = new MonthDay((Chronology) null); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24339);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24340);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24341);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_1542() {__CLR4_4_1iqjiqjle6np4hw.R.globalSliceStart(getClass().getName(),24342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l2w8zdis6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqjiqjle6np4hw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqjiqjle6np4hw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_DurationFieldType_int_1542",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l2w8zdis6(){try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24342); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24343);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24344);MonthDay result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24345);assertEquals(new MonthDay(9, 6), test); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24346);assertEquals(new MonthDay(12, 6), result); 
 }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}
public void testWithFieldAdded_same543() {__CLR4_4_1iqjiqjle6np4hw.R.globalSliceStart(getClass().getName(),24347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw8uq4isb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqjiqjle6np4hw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqjiqjle6np4hw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_same543",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw8uq4isb(){try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24347); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24348);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24349);MonthDay result = test.withFieldAdded(DurationFieldType.months(), 6); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24350);assertEquals(new MonthDay(9, 6), test); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24351);assertSame(test, result); 
 }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}
public void testPlusDays_int_wrap544() {__CLR4_4_1iqjiqjle6np4hw.R.globalSliceStart(getClass().getName(),24352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ej2pveisg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqjiqjle6np4hw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqjiqjle6np4hw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int_wrap544",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ej2pveisg(){try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24352); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24353);MonthDay test = new MonthDay(6, 5, ISO_UTC); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24354);MonthDay result = test.plusDays(10); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24355);MonthDay expected = new MonthDay(4, 5, ISO_UTC); 
     __CLR4_4_1iqjiqjle6np4hw.R.inc(24356);assertEquals(expected, result); 
 }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    
    
    class MockMD extends MockPartial {
        
        @Override
        public Chronology getChronology() {try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24357);
            __CLR4_4_1iqjiqjle6np4hw.R.inc(24358);return COPTIC_UTC;
        }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}
        
        @Override
        public DateTimeField[] getFields() {try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24359);
            __CLR4_4_1iqjiqjle6np4hw.R.inc(24360);return new DateTimeField[] {
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth()
            };
        }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}
        
        @Override
        public int[] getValues() {try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24361);
            __CLR4_4_1iqjiqjle6np4hw.R.inc(24362);return new int[] {10, 6};
        }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}
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
    private void check(MonthDay test, int month, int day) {try{__CLR4_4_1iqjiqjle6np4hw.R.inc(24363);
        __CLR4_4_1iqjiqjle6np4hw.R.inc(24364);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1iqjiqjle6np4hw.R.inc(24365);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1iqjiqjle6np4hw.R.flushNeeded();}}
}
