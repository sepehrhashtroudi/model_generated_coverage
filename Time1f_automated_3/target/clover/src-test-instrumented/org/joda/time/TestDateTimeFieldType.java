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
public class TestDateTimeFieldType extends TestCase {static class __CLR4_4_1h56h56le6np4bk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,22264,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1h56h56le6np4bk.R.inc(22218);
        __CLR4_4_1h56h56le6np4bk.R.inc(22219);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h56h56le6np4bk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h56h56le6np4bk.R.inc(22220);
        __CLR4_4_1h56h56le6np4bk.R.inc(22221);return new TestSuite(TestDateTimeFieldType.class);
    }finally{__CLR4_4_1h56h56le6np4bk.R.flushNeeded();}}

    public TestDateTimeFieldType(String name) {
        super(name);__CLR4_4_1h56h56le6np4bk.R.inc(22223);try{__CLR4_4_1h56h56le6np4bk.R.inc(22222);
    }finally{__CLR4_4_1h56h56le6np4bk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h56h56le6np4bk.R.inc(22224);
    }finally{__CLR4_4_1h56h56le6np4bk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h56h56le6np4bk.R.inc(22225);
    }finally{__CLR4_4_1h56h56le6np4bk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_dayOfMonth593() throws Exception {__CLR4_4_1h56h56le6np4bk.R.globalSliceStart(getClass().getName(),22226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wsa9z0h5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h56h56le6np4bk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h56h56le6np4bk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfMonth593",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wsa9z0h5e() throws Exception{try{__CLR4_4_1h56h56le6np4bk.R.inc(22226); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22227);assertEquals(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22228);assertEquals("dayOfMonth", DateTimeFieldType.dayOfMonth().getName()); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22229);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfMonth().getDurationType()); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22230);assertEquals(DurationFieldType.months(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22231);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth(), DateTimeFieldType.dayOfMonth().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22232);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth().isSupported(), DateTimeFieldType.dayOfMonth().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22233);assertSerialization(DateTimeFieldType.dayOfMonth()); 
 }finally{__CLR4_4_1h56h56le6np4bk.R.flushNeeded();}}
public void test_minuteOfDay596() throws Exception {__CLR4_4_1h56h56le6np4bk.R.globalSliceStart(getClass().getName(),22234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyq1thh5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h56h56le6np4bk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h56h56le6np4bk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_minuteOfDay596",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyq1thh5m() throws Exception{try{__CLR4_4_1h56h56le6np4bk.R.inc(22234); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22235);assertEquals(DateTimeFieldType.minuteOfDay(), DateTimeFieldType.minuteOfDay()); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22236);assertEquals("minuteOfDay", DateTimeFieldType.minuteOfDay().getName()); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22237);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfDay().getDurationType()); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22238);assertEquals(DurationFieldType.days(), DateTimeFieldType.minuteOfDay().getRangeDurationType()); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22239);assertEquals(CopticChronology.getInstanceUTC().minuteOfDay(), DateTimeFieldType.minuteOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22240);assertEquals(CopticChronology.getInstanceUTC().minuteOfDay().isSupported(), DateTimeFieldType.minuteOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22241);assertSerialization(DateTimeFieldType.minuteOfDay()); 
 }finally{__CLR4_4_1h56h56le6np4bk.R.flushNeeded();}}
public void test_minuteOfHour597() throws Exception {__CLR4_4_1h56h56le6np4bk.R.globalSliceStart(getClass().getName(),22242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vc8d9eh5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h56h56le6np4bk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h56h56le6np4bk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_minuteOfHour597",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vc8d9eh5u() throws Exception{try{__CLR4_4_1h56h56le6np4bk.R.inc(22242); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22243);assertEquals(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.minuteOfHour()); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22244);assertEquals("minuteOfHour", DateTimeFieldType.minuteOfHour().getName()); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22245);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfHour().getDurationType()); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22246);assertEquals(DurationFieldType.hours(), DateTimeFieldType.minuteOfHour().getRangeDurationType()); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22247);assertEquals(CopticChronology.getInstanceUTC().minuteOfHour(), DateTimeFieldType.minuteOfHour().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22248);assertEquals(CopticChronology.getInstanceUTC().minuteOfHour().isSupported(), DateTimeFieldType.minuteOfHour().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h56h56le6np4bk.R.inc(22249);assertSerialization(DateTimeFieldType.minuteOfHour()); 
 }finally{__CLR4_4_1h56h56le6np4bk.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1h56h56le6np4bk.R.inc(22250);
        __CLR4_4_1h56h56le6np4bk.R.inc(22251);DateTimeFieldType result = doSerialization(type);
        __CLR4_4_1h56h56le6np4bk.R.inc(22252);assertSame(type, result);
    }finally{__CLR4_4_1h56h56le6np4bk.R.flushNeeded();}}

    private DateTimeFieldType doSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1h56h56le6np4bk.R.inc(22253);
        __CLR4_4_1h56h56le6np4bk.R.inc(22254);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1h56h56le6np4bk.R.inc(22255);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1h56h56le6np4bk.R.inc(22256);oos.writeObject(type);
        __CLR4_4_1h56h56le6np4bk.R.inc(22257);byte[] bytes = baos.toByteArray();
        __CLR4_4_1h56h56le6np4bk.R.inc(22258);oos.close();
        
        __CLR4_4_1h56h56le6np4bk.R.inc(22259);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1h56h56le6np4bk.R.inc(22260);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1h56h56le6np4bk.R.inc(22261);DateTimeFieldType result = (DateTimeFieldType) ois.readObject();
        __CLR4_4_1h56h56le6np4bk.R.inc(22262);ois.close();
        __CLR4_4_1h56h56le6np4bk.R.inc(22263);return result;
    }finally{__CLR4_4_1h56h56le6np4bk.R.flushNeeded();}}

}
