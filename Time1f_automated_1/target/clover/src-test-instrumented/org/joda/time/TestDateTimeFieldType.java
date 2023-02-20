/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
import java.lang.reflect.Constructor;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;

/**
 * This class is a Junit unit test for Chronology.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFieldType extends TestCase {static class __CLR4_4_1h7nh7nle6ndpdu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,22369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1h7nh7nle6ndpdu.R.inc(22307);
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22308);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h7nh7nle6ndpdu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h7nh7nle6ndpdu.R.inc(22309);
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22310);return new TestSuite(TestDateTimeFieldType.class);
    }finally{__CLR4_4_1h7nh7nle6ndpdu.R.flushNeeded();}}

    public TestDateTimeFieldType(String name) {
        super(name);__CLR4_4_1h7nh7nle6ndpdu.R.inc(22312);try{__CLR4_4_1h7nh7nle6ndpdu.R.inc(22311);
    }finally{__CLR4_4_1h7nh7nle6ndpdu.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h7nh7nle6ndpdu.R.inc(22313);
    }finally{__CLR4_4_1h7nh7nle6ndpdu.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h7nh7nle6ndpdu.R.inc(22314);
    }finally{__CLR4_4_1h7nh7nle6ndpdu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_yearOfCentury683() throws Exception {__CLR4_4_1h7nh7nle6ndpdu.R.globalSliceStart(getClass().getName(),22315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b05ybph7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7nh7nle6ndpdu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7nh7nle6ndpdu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_yearOfCentury683",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b05ybph7v() throws Exception{try{__CLR4_4_1h7nh7nle6ndpdu.R.inc(22315); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22316);assertEquals(DateTimeFieldType.yearOfCentury(), DateTimeFieldType.yearOfCentury()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22317);assertEquals("yearOfCentury", DateTimeFieldType.yearOfCentury().getName()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22318);assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfCentury().getDurationType()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22319);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.yearOfCentury().getRangeDurationType()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22320);assertEquals(CopticChronology.getInstanceUTC().yearOfCentury(), DateTimeFieldType.yearOfCentury().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22321);assertEquals(CopticChronology.getInstanceUTC().yearOfCentury().isSupported(), DateTimeFieldType.yearOfCentury().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22322);assertSerialization(DateTimeFieldType.yearOfCentury()); 
 }finally{__CLR4_4_1h7nh7nle6ndpdu.R.flushNeeded();}}
public void test_dayOfMonth684() throws Exception {__CLR4_4_1h7nh7nle6ndpdu.R.globalSliceStart(getClass().getName(),22323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146kncvh83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7nh7nle6ndpdu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7nh7nle6ndpdu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfMonth684",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146kncvh83() throws Exception{try{__CLR4_4_1h7nh7nle6ndpdu.R.inc(22323); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22324);assertEquals(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22325);assertEquals("dayOfMonth", DateTimeFieldType.dayOfMonth().getName()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22326);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfMonth().getDurationType()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22327);assertEquals(DurationFieldType.years(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22328);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth(), DateTimeFieldType.dayOfMonth().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22329);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth().isSupported(), DateTimeFieldType.dayOfMonth().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22330);assertSerialization(DateTimeFieldType.dayOfMonth()); 
 }finally{__CLR4_4_1h7nh7nle6ndpdu.R.flushNeeded();}}
public void test_monthOfYear685() throws Exception {__CLR4_4_1h7nh7nle6ndpdu.R.globalSliceStart(getClass().getName(),22331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ifdgzh8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7nh7nle6ndpdu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7nh7nle6ndpdu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_monthOfYear685",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ifdgzh8b() throws Exception{try{__CLR4_4_1h7nh7nle6ndpdu.R.inc(22331); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22332);assertEquals(DateTimeFieldType.monthOfYear(), DateTimeFieldType.monthOfYear()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22333);assertEquals("monthOfYear", DateTimeFieldType.monthOfYear().getName()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22334);assertEquals(DurationFieldType.months(), DateTimeFieldType.monthOfYear().getDurationType()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22335);assertEquals(null, DateTimeFieldType.monthOfYear().getRangeDurationType()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22336);assertEquals(CopticChronology.getInstanceUTC().monthOfYear(), DateTimeFieldType.monthOfYear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22337);assertEquals(CopticChronology.getInstanceUTC().monthOfYear().isSupported(), DateTimeFieldType.monthOfYear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22338);assertSerialization(DateTimeFieldType.monthOfYear()); 
 }finally{__CLR4_4_1h7nh7nle6ndpdu.R.flushNeeded();}}
public void test_weekyearOfCentury686() throws Exception {__CLR4_4_1h7nh7nle6ndpdu.R.globalSliceStart(getClass().getName(),22339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184vfc4h8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7nh7nle6ndpdu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7nh7nle6ndpdu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekyearOfCentury686",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184vfc4h8j() throws Exception{try{__CLR4_4_1h7nh7nle6ndpdu.R.inc(22339); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22340);assertEquals(DateTimeFieldType.weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22341);assertEquals("weekyearOfCentury", DateTimeFieldType.weekyearOfCentury().getName()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22342);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyearOfCentury().getDurationType()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22343);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.weekyearOfCentury().getRangeDurationType()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22344);assertEquals(CopticChronology.getInstanceUTC().weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22345);assertEquals(CopticChronology.getInstanceUTC().weekyearOfCentury().isSupported(), DateTimeFieldType.weekyearOfCentury().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22346);assertSerialization(DateTimeFieldType.weekyearOfCentury()); 
 }finally{__CLR4_4_1h7nh7nle6ndpdu.R.flushNeeded();}}
public void test_dayOfWeek687() throws Exception {__CLR4_4_1h7nh7nle6ndpdu.R.globalSliceStart(getClass().getName(),22347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzhacih8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7nh7nle6ndpdu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7nh7nle6ndpdu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfWeek687",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzhacih8r() throws Exception{try{__CLR4_4_1h7nh7nle6ndpdu.R.inc(22347); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22348);assertEquals(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.dayOfWeek()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22349);assertEquals("dayOfWeek", DateTimeFieldType.dayOfWeek().getName()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22350);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfWeek().getDurationType()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22351);assertEquals(DurationFieldType.weeks(), DateTimeFieldType.dayOfWeek().getRangeDurationType()); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22352);assertEquals(CopticChronology.getInstanceUTC().dayOfWeek(), DateTimeFieldType.dayOfWeek().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22353);assertEquals(CopticChronology.getInstanceUTC().dayOfWeek().isSupported(), DateTimeFieldType.dayOfWeek().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h7nh7nle6ndpdu.R.inc(22354);assertSerialization(DateTimeFieldType.dayOfWeek()); 
 }finally{__CLR4_4_1h7nh7nle6ndpdu.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1h7nh7nle6ndpdu.R.inc(22355);
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22356);DateTimeFieldType result = doSerialization(type);
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22357);assertSame(type, result);
    }finally{__CLR4_4_1h7nh7nle6ndpdu.R.flushNeeded();}}

    private DateTimeFieldType doSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1h7nh7nle6ndpdu.R.inc(22358);
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22359);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22360);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22361);oos.writeObject(type);
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22362);byte[] bytes = baos.toByteArray();
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22363);oos.close();
        
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22364);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22365);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22366);DateTimeFieldType result = (DateTimeFieldType) ois.readObject();
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22367);ois.close();
        __CLR4_4_1h7nh7nle6ndpdu.R.inc(22368);return result;
    }finally{__CLR4_4_1h7nh7nle6ndpdu.R.flushNeeded();}}

}
