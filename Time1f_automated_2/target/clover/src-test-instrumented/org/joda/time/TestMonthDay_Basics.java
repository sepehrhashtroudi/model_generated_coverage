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
public class TestMonthDay_Basics extends TestCase {static class __CLR4_4_1ie6ie6le6nl8bf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,23936,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23838);
        __CLR4_4_1ie6ie6le6nl8bf.R.inc(23839);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23840);
        __CLR4_4_1ie6ie6le6nl8bf.R.inc(23841);return new TestSuite(TestMonthDay_Basics.class);
    }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}

    public TestMonthDay_Basics(String name) {
        super(name);__CLR4_4_1ie6ie6le6nl8bf.R.inc(23843);try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23842);
    }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23844);
        __CLR4_4_1ie6ie6le6nl8bf.R.inc(23845);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ie6ie6le6nl8bf.R.inc(23846);zone = DateTimeZone.getDefault();
        __CLR4_4_1ie6ie6le6nl8bf.R.inc(23847);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23848);
        __CLR4_4_1ie6ie6le6nl8bf.R.inc(23849);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ie6ie6le6nl8bf.R.inc(23850);DateTimeZone.setDefault(zone);
        __CLR4_4_1ie6ie6le6nl8bf.R.inc(23851);zone = null;
    }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testEqualsHashCode521() {__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceStart(getClass().getName(),23852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115oi7liek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ie6ie6le6nl8bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testEqualsHashCode521",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115oi7liek(){try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23852); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23853);MonthDay test1 = new MonthDay(10, 6, COPTIC_PARIS); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23854);MonthDay test2 = new MonthDay(10, 6, COPTIC_PARIS); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23855);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23856);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23857);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23858);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23859);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23860);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23861);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23862);MonthDay test3 = new MonthDay(10, 6); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23863);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23864);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23865);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23866);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23867);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23868);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23869);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23870);assertEquals(true, test1.equals(new MockMD())); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23871);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
public void testWithChronologyRetainFields_sameChrono524() {__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceStart(getClass().getName(),23872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rq551gif4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ie6ie6le6nl8bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_sameChrono524",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rq551gif4(){try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23872); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23873);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23874);MonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23875);assertSame(base, test); 
 }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
public void testGetFieldTypes525() {__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceStart(getClass().getName(),23876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4i9jwif8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ie6ie6le6nl8bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetFieldTypes525",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4i9jwif8(){try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23876); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23877);MonthDay test = new MonthDay(6, 6); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23878);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23879);assertSame(DateTimeFieldType.monthOfYear(), fields[0]); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23880);assertSame(DateTimeFieldType.dayOfMonth(), fields[1]); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23881);assertSame(DateTimeFieldType.dayOfWeek(), fields[2]); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23882);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
public void testGetFieldTypes526() {__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceStart(getClass().getName(),23883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udi8cdiff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ie6ie6le6nl8bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetFieldTypes526",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udi8cdiff(){try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23883); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23884);MonthDay test = new MonthDay(6, 6); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23885);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23886);assertSame(DateTimeFieldType.monthOfYear(), fields[0]); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23887);assertSame(DateTimeFieldType.dayOfMonth(), fields[1]); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23888);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
public void testWithField_same527() {__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceStart(getClass().getName(),23889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7nr6qifl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ie6ie6le6nl8bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField_same527",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7nr6qifl(){try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23889); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23890);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23891);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 9); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23892);assertEquals(new MonthDay(9, 6), test); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23893);assertSame(test, result); 
 }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
public void testMinusMonths_int528() {__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceStart(getClass().getName(),23894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15133q7ifq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ie6ie6le6nl8bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int528",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15133q7ifq(){try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23894); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23895);MonthDay test = new MonthDay(2, 3, ISO_UTC); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23896);MonthDay result = test.minusMonths(1); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23897);MonthDay expected = new MonthDay(2, 3, ISO_UTC); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23898);assertEquals(expected, result); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23899);result = test.minusMonths(0); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23900);assertSame(test, result); 
 }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
public void testMinusDays_int529() {__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceStart(getClass().getName(),23901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpcs4eifx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ie6ie6le6nl8bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int529",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpcs4eifx(){try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23901); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23902);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23903);MonthDay result = test.minusDays(1); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23904);MonthDay expected = new MonthDay(5, 11, BuddhistChronology.getInstance()); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23905);assertEquals(expected, result); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23906);result = test.minusDays(0); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23907);assertSame(test, result); 
 }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
public void testMinusDays_int530() {__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceStart(getClass().getName(),23908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r67zjoig4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ie6ie6le6nl8bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int530",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r67zjoig4(){try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23908); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23909);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23910);MonthDay result = test.minusDays(1); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23911);MonthDay expected = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23912);assertEquals(expected, result); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23913);result = test.minusDays(0); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23914);assertSame(test, result); 
 }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
public void testToString_String_Locale531() {__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceStart(getClass().getName(),23915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5wze5igb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ie6ie6le6nl8bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String_Locale531",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5wze5igb(){try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23915); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23916);MonthDay test = new MonthDay(6, 6); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23917);assertEquals("--06-06", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23918);assertEquals("--06-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23919);assertEquals("--06-06", test.toString("EEE d/M", null)); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23920);assertEquals("--06-06", test.toString(null, null)); 
 }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
public void testToString_String_Locale532() {__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceStart(getClass().getName(),23921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwx0loigh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ie6ie6le6nl8bf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ie6ie6le6nl8bf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String_Locale532",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwx0loigh(){try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23921); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23922);MonthDay test = new MonthDay(6, 6); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23923);assertEquals("--06-06", test.toString("MM HH")); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23924);assertEquals("--06-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23925);assertEquals("--06-06", test.toString("MM HH")); 
     __CLR4_4_1ie6ie6le6nl8bf.R.inc(23926);assertEquals("--06-06", test.toString(null, null)); 
 }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    
    
    class MockMD extends MockPartial {
        
        @Override
        public Chronology getChronology() {try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23927);
            __CLR4_4_1ie6ie6le6nl8bf.R.inc(23928);return COPTIC_UTC;
        }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
        
        @Override
        public DateTimeField[] getFields() {try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23929);
            __CLR4_4_1ie6ie6le6nl8bf.R.inc(23930);return new DateTimeField[] {
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth()
            };
        }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
        
        @Override
        public int[] getValues() {try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23931);
            __CLR4_4_1ie6ie6le6nl8bf.R.inc(23932);return new int[] {10, 6};
        }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
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
    private void check(MonthDay test, int month, int day) {try{__CLR4_4_1ie6ie6le6nl8bf.R.inc(23933);
        __CLR4_4_1ie6ie6le6nl8bf.R.inc(23934);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1ie6ie6le6nl8bf.R.inc(23935);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1ie6ie6le6nl8bf.R.flushNeeded();}}
}
