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
public class TestMonthDay_Basics extends TestCase {static class __CLR4_4_1ik3ik3le6o79v8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,24108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24051);
        __CLR4_4_1ik3ik3le6o79v8.R.inc(24052);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24053);
        __CLR4_4_1ik3ik3le6o79v8.R.inc(24054);return new TestSuite(TestMonthDay_Basics.class);
    }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}

    public TestMonthDay_Basics(String name) {
        super(name);__CLR4_4_1ik3ik3le6o79v8.R.inc(24056);try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24055);
    }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24057);
        __CLR4_4_1ik3ik3le6o79v8.R.inc(24058);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ik3ik3le6o79v8.R.inc(24059);zone = DateTimeZone.getDefault();
        __CLR4_4_1ik3ik3le6o79v8.R.inc(24060);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24061);
        __CLR4_4_1ik3ik3le6o79v8.R.inc(24062);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ik3ik3le6o79v8.R.inc(24063);DateTimeZone.setDefault(zone);
        __CLR4_4_1ik3ik3le6o79v8.R.inc(24064);zone = null;
    }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSerialization517() throws Exception {__CLR4_4_1ik3ik3le6o79v8.R.globalSliceStart(getClass().getName(),24065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g1vp1gikh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik3ik3le6o79v8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik3ik3le6o79v8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSerialization517",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g1vp1gikh() throws Exception{try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24065); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24066);MonthDay test = new MonthDay(6, 6, COPTIC_PARIS); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24067);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24068);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24069);oos.writeObject(test); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24070);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24071);oos.close(); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24072);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24073);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24074);MonthDay result = (MonthDay) ois.readObject(); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24075);ois.close(); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24076);assertEquals(test, result); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24077);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24078);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24079);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}
public void testWithChronologyRetainFields_sameChrono518() {__CLR4_4_1ik3ik3le6o79v8.R.globalSliceStart(getClass().getName(),24080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b0a3ntikw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik3ik3le6o79v8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik3ik3le6o79v8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_sameChrono518",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b0a3ntikw(){try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24080); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24081);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24082);MonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24083);assertSame(base, test); 
 }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}
public void testWithField519() {__CLR4_4_1ik3ik3le6o79v8.R.globalSliceStart(getClass().getName(),24084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxaw6ail0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik3ik3le6o79v8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik3ik3le6o79v8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField519",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxaw6ail0(){try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24084); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24085);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24086);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 10); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24087);assertEquals(new MonthDay(9, 6), test); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24088);assertEquals(new MonthDay(10, 6), result); 
 }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}
public void testMinus_RP520() {__CLR4_4_1ik3ik3le6o79v8.R.globalSliceStart(getClass().getName(),24089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3oby3il5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik3ik3le6o79v8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik3ik3le6o79v8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinus_RP520",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3oby3il5(){try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24089); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24090);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24091);MonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24092);MonthDay expected = new MonthDay(5, 11, BuddhistChronology.getInstance()); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24093);assertEquals(expected, result); 
 }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}
public void testPlus_RP521() {__CLR4_4_1ik3ik3le6o79v8.R.globalSliceStart(getClass().getName(),24094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdrudyila();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik3ik3le6o79v8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik3ik3le6o79v8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlus_RP521",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdrudyila(){try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24094); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24095);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24096);MonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24097);MonthDay expected = new MonthDay(5, 11, BuddhistChronology.getInstance()); 
     __CLR4_4_1ik3ik3le6o79v8.R.inc(24098);assertEquals(expected, result); 
 }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    
    
    class MockMD extends MockPartial {
        
        @Override
        public Chronology getChronology() {try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24099);
            __CLR4_4_1ik3ik3le6o79v8.R.inc(24100);return COPTIC_UTC;
        }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}
        
        @Override
        public DateTimeField[] getFields() {try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24101);
            __CLR4_4_1ik3ik3le6o79v8.R.inc(24102);return new DateTimeField[] {
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth()
            };
        }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}
        
        @Override
        public int[] getValues() {try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24103);
            __CLR4_4_1ik3ik3le6o79v8.R.inc(24104);return new int[] {10, 6};
        }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}
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
    private void check(MonthDay test, int month, int day) {try{__CLR4_4_1ik3ik3le6o79v8.R.inc(24105);
        __CLR4_4_1ik3ik3le6o79v8.R.inc(24106);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1ik3ik3le6o79v8.R.inc(24107);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1ik3ik3le6o79v8.R.flushNeeded();}}
}
