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
public class TestMonthDay_Basics extends TestCase {static class __CLR4_4_1liflifle6qe9r7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,28027,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1liflifle6qe9r7.R.inc(27879);
        __CLR4_4_1liflifle6qe9r7.R.inc(27880);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1liflifle6qe9r7.R.inc(27881);
        __CLR4_4_1liflifle6qe9r7.R.inc(27882);return new TestSuite(TestMonthDay_Basics.class);
    }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}}

    public TestMonthDay_Basics(String name) {
        super(name);__CLR4_4_1liflifle6qe9r7.R.inc(27884);try{__CLR4_4_1liflifle6qe9r7.R.inc(27883);
    }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1liflifle6qe9r7.R.inc(27885);
        __CLR4_4_1liflifle6qe9r7.R.inc(27886);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1liflifle6qe9r7.R.inc(27887);zone = DateTimeZone.getDefault();
        __CLR4_4_1liflifle6qe9r7.R.inc(27888);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1liflifle6qe9r7.R.inc(27889);
        __CLR4_4_1liflifle6qe9r7.R.inc(27890);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1liflifle6qe9r7.R.inc(27891);DateTimeZone.setDefault(zone);
        __CLR4_4_1liflifle6qe9r7.R.inc(27892);zone = null;
    }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlusDays_int10() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o5cf6hlit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o5cf6hlit(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27893); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27894);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27895);MonthDay result = test.plusDays(1); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27896);MonthDay expected = new MonthDay(5, 11, BuddhistChronology.getInstance()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27897);assertEquals(expected, result); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testEqualsHashCode459() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pxhhcdliy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testEqualsHashCode459",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pxhhcdliy(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27898); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27899);MonthDay test1 = new MonthDay(10, 6, COPTIC_PARIS); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27900);MonthDay test2 = new MonthDay(10, 6, COPTIC_PARIS); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27901);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27902);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27903);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27904);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27905);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27906);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27907);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27908);MonthDay test3 = new MonthDay(10, 6); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27909);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27910);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27911);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27912);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27913);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27914);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27915);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27916);assertEquals(true, test1.equals(new MockMD())); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27917);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testSize1257() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uubsn7lji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSize1257",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uubsn7lji(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27918); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27919);MonthDay test = new MonthDay(); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27920);assertEquals(2, test.size()); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testIsSupported1258() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rcpwalljl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testIsSupported1258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rcpwalljl(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27921); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27922);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27923);assertEquals(false, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27924);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27925);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27926);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono1263() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3pucnljr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_Chrono1263",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3pucnljr(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27927); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27928);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27929);MonthDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27930);check(base, 6, 6); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27931);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27932);check(test, 6, 6); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27933);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testSerialization1264() throws Exception {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11khtmkljy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSerialization1264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11khtmkljy() throws Exception{try{__CLR4_4_1liflifle6qe9r7.R.inc(27934); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27935);MonthDay test = new MonthDay(5, 6, COPTIC_PARIS); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27936);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27937);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27938);oos.writeObject(test); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27939);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27940);oos.close(); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27941);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27942);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27943);MonthDay result = (MonthDay) ois.readObject(); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27944);ois.close(); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27945);assertEquals(test, result); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27946);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27947);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27948);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testGetField1265() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sw3bj1lkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetField1265",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sw3bj1lkd(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27949); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27950);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27951);assertSame(COPTIC_UTC.monthOfYear(), test.getField(0)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27952);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(1)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27953);try { 
         __CLR4_4_1liflifle6qe9r7.R.inc(27954);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1liflifle6qe9r7.R.inc(27955);try { 
         __CLR4_4_1liflifle6qe9r7.R.inc(27956);test.getField(2); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testGetFieldTypes1266() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gf622dlkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetFieldTypes1266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gf622dlkl(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27957); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27958);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27959);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27960);assertEquals(2, fields.length); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27961);assertSame(DateTimeFieldType.monthOfYear(), fields[0]); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27962);assertSame(DateTimeFieldType.dayOfMonth(), fields[1]); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27963);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono1267() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z6dxdvlks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_sameChrono1267",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z6dxdvlks(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27964); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27965);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27966);MonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27967);assertSame(base, test); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testWithField_same1268() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i3d92rlkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField_same1268",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i3d92rlkw(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27968); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27969);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27970);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 9); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27971);assertEquals(new MonthDay(9, 6), test); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27972);assertSame(test, result); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testWithField1269() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149rafhll1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField1269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149rafhll1(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27973); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27974);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27975);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 10); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27976);assertEquals(new MonthDay(9, 6), test); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27977);assertEquals(new MonthDay(10, 6), result); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testWithFieldAdded_unknownField1270() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19uxknmll6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_unknownField1270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19uxknmll6(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27978); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27979);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27980);try { 
         __CLR4_4_1liflifle6qe9r7.R.inc(27981);test.withFieldAdded(DurationFieldType.hours(), 6); 
         __CLR4_4_1liflifle6qe9r7.R.inc(27982);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testPlusDays_same1271() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6dr5wllb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_same1271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6dr5wllb(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27983); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27984);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27985);MonthDay result = test.plusDays(0); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27986);assertSame(test, result); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testMinus_RP1272() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tans5ellf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinus_RP1272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tans5ellf(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27987); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27988);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27989);MonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27990);MonthDay expected = new MonthDay(5, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27991);assertEquals(expected, result); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27992);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27993);assertSame(test, result); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testPlus_RP1273() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),27994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y681qtllm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlus_RP1273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y681qtllm(){try{__CLR4_4_1liflifle6qe9r7.R.inc(27994); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27995);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27996);MonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27997);MonthDay expected = new MonthDay(8, 9, BuddhistChronology.getInstance()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27998);assertEquals(expected, result); 
     __CLR4_4_1liflifle6qe9r7.R.inc(27999);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28000);assertSame(test, result); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testMinusMonths_int1274() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),28001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dplesallt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int1274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dplesallt(){try{__CLR4_4_1liflifle6qe9r7.R.inc(28001); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28002);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28003);MonthDay result = test.minusMonths(1); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28004);MonthDay expected = new MonthDay(5, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28005);assertEquals(expected, result); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testMinusDays_int_negativeFromLeap1275() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),28006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnzppjlly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_negativeFromLeap1275",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnzppjlly(){try{__CLR4_4_1liflifle6qe9r7.R.inc(28006); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28007);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28008);MonthDay result = test.minusDays(-1); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28009);MonthDay expected = new MonthDay(3, 1, ISOChronology.getInstance()); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28010);assertEquals(expected, result); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 


public void testToString_String_Locale1276() {__CLR4_4_1liflifle6qe9r7.R.globalSliceStart(getClass().getName(),28011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n1fpn2lm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liflifle6qe9r7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liflifle6qe9r7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String_Locale1276",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n1fpn2lm3(){try{__CLR4_4_1liflifle6qe9r7.R.inc(28011); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28012);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28013);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28014);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28015);assertEquals("--05-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28016);assertEquals("\ufffd 6/5", test.toString("EEE d/M", null)); 
     __CLR4_4_1liflifle6qe9r7.R.inc(28017);assertEquals("--05-06", test.toString(null, null)); 
 }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockMD extends MockPartial {
        
        @Override
        public Chronology getChronology() {try{__CLR4_4_1liflifle6qe9r7.R.inc(28018);
            __CLR4_4_1liflifle6qe9r7.R.inc(28019);return COPTIC_UTC;
        }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}}
        
        @Override
        public DateTimeField[] getFields() {try{__CLR4_4_1liflifle6qe9r7.R.inc(28020);
            __CLR4_4_1liflifle6qe9r7.R.inc(28021);return new DateTimeField[] {
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth()
            };
        }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}}
        
        @Override
        public int[] getValues() {try{__CLR4_4_1liflifle6qe9r7.R.inc(28022);
            __CLR4_4_1liflifle6qe9r7.R.inc(28023);return new int[] {10, 6};
        }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}}
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
    private void check(MonthDay test, int month, int day) {try{__CLR4_4_1liflifle6qe9r7.R.inc(28024);
        __CLR4_4_1liflifle6qe9r7.R.inc(28025);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1liflifle6qe9r7.R.inc(28026);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1liflifle6qe9r7.R.flushNeeded();}}
}
