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
public class TestDateTimeFieldType extends TestCase {static class __CLR4_4_1h1yh1yle6o79lq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,22164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1h1yh1yle6o79lq.R.inc(22102);
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22103);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h1yh1yle6o79lq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h1yh1yle6o79lq.R.inc(22104);
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22105);return new TestSuite(TestDateTimeFieldType.class);
    }finally{__CLR4_4_1h1yh1yle6o79lq.R.flushNeeded();}}

    public TestDateTimeFieldType(String name) {
        super(name);__CLR4_4_1h1yh1yle6o79lq.R.inc(22107);try{__CLR4_4_1h1yh1yle6o79lq.R.inc(22106);
    }finally{__CLR4_4_1h1yh1yle6o79lq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h1yh1yle6o79lq.R.inc(22108);
    }finally{__CLR4_4_1h1yh1yle6o79lq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h1yh1yle6o79lq.R.inc(22109);
    }finally{__CLR4_4_1h1yh1yle6o79lq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_year556() throws Exception {__CLR4_4_1h1yh1yle6o79lq.R.globalSliceStart(getClass().getName(),22110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17q1orxh26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1yle6o79lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1yle6o79lq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_year556",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17q1orxh26() throws Exception{try{__CLR4_4_1h1yh1yle6o79lq.R.inc(22110); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22111);assertEquals(DateTimeFieldType.year(), DateTimeFieldType.year()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22112);assertEquals("year", DateTimeFieldType.year().getName()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22113);assertEquals(DurationFieldType.years(), DateTimeFieldType.year().getDurationType()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22114);assertEquals(DurationFieldType.eras(), DateTimeFieldType.year().getRangeDurationType()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22115);assertEquals(CopticChronology.getInstanceUTC().year(), DateTimeFieldType.year().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22116);assertEquals(CopticChronology.getInstanceUTC().year().isSupported(), DateTimeFieldType.year().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22117);assertSerialization(DateTimeFieldType.year()); 
 }finally{__CLR4_4_1h1yh1yle6o79lq.R.flushNeeded();}}
public void test_hourOfDay558() throws Exception {__CLR4_4_1h1yh1yle6o79lq.R.globalSliceStart(getClass().getName(),22118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v258j9h2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1yle6o79lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1yle6o79lq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_hourOfDay558",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v258j9h2e() throws Exception{try{__CLR4_4_1h1yh1yle6o79lq.R.inc(22118); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22119);assertEquals(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22120);assertEquals("hourOfDay", DateTimeFieldType.hourOfDay().getName()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22121);assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfDay().getDurationType()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22122);assertEquals(DurationFieldType.days(), DateTimeFieldType.hourOfDay().getRangeDurationType()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22123);assertEquals(CopticChronology.getInstanceUTC().hourOfDay(), DateTimeFieldType.hourOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22124);assertEquals(CopticChronology.getInstanceUTC().hourOfDay().isSupported(), DateTimeFieldType.hourOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22125);assertSerialization(DateTimeFieldType.hourOfDay()); 
 }finally{__CLR4_4_1h1yh1yle6o79lq.R.flushNeeded();}}
public void test_secondOfDay559() throws Exception {__CLR4_4_1h1yh1yle6o79lq.R.globalSliceStart(getClass().getName(),22126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tptd1gh2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1yle6o79lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1yle6o79lq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_secondOfDay559",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tptd1gh2m() throws Exception{try{__CLR4_4_1h1yh1yle6o79lq.R.inc(22126); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22127);assertEquals(DateTimeFieldType.secondOfDay(), DateTimeFieldType.secondOfDay()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22128);assertEquals("secondOfDay", DateTimeFieldType.secondOfDay().getName()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22129);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfDay().getDurationType()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22130);assertEquals(DurationFieldType.days(), DateTimeFieldType.secondOfDay().getRangeDurationType()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22131);assertEquals(CopticChronology.getInstanceUTC().secondOfDay(), DateTimeFieldType.secondOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22132);assertEquals(CopticChronology.getInstanceUTC().secondOfDay().isSupported(), DateTimeFieldType.secondOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22133);assertSerialization(DateTimeFieldType.secondOfDay()); 
 }finally{__CLR4_4_1h1yh1yle6o79lq.R.flushNeeded();}}
public void test_secondOfMinute560() throws Exception {__CLR4_4_1h1yh1yle6o79lq.R.globalSliceStart(getClass().getName(),22134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ks70iyh2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1yle6o79lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1yle6o79lq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_secondOfMinute560",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ks70iyh2u() throws Exception{try{__CLR4_4_1h1yh1yle6o79lq.R.inc(22134); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22135);assertEquals(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.secondOfMinute()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22136);assertEquals("secondOfMinute", DateTimeFieldType.secondOfMinute().getName()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22137);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfMinute().getDurationType()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22138);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.secondOfMinute().getRangeDurationType()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22139);assertEquals(CopticChronology.getInstanceUTC().secondOfMinute(), DateTimeFieldType.secondOfMinute().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22140);assertEquals(CopticChronology.getInstanceUTC().secondOfMinute().isSupported(), DateTimeFieldType.secondOfMinute().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22141);assertSerialization(DateTimeFieldType.secondOfMinute()); 
 }finally{__CLR4_4_1h1yh1yle6o79lq.R.flushNeeded();}}
public void test_millisOfDay562() throws Exception {__CLR4_4_1h1yh1yle6o79lq.R.globalSliceStart(getClass().getName(),22142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_167lap2h32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h1yh1yle6o79lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h1yh1yle6o79lq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_millisOfDay562",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_167lap2h32() throws Exception{try{__CLR4_4_1h1yh1yle6o79lq.R.inc(22142); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22143);assertEquals(DateTimeFieldType.millisOfDay(), DateTimeFieldType.millisOfDay()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22144);assertEquals("millisOfDay", DateTimeFieldType.millisOfDay().getName()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22145);assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfDay().getDurationType()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22146);assertEquals(DurationFieldType.days(), DateTimeFieldType.millisOfDay().getRangeDurationType()); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22147);assertEquals(CopticChronology.getInstanceUTC().millisOfDay(), DateTimeFieldType.millisOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22148);assertEquals(CopticChronology.getInstanceUTC().millisOfDay().isSupported(), DateTimeFieldType.millisOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1h1yh1yle6o79lq.R.inc(22149);assertSerialization(DateTimeFieldType.millisOfDay()); 
 }finally{__CLR4_4_1h1yh1yle6o79lq.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1h1yh1yle6o79lq.R.inc(22150);
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22151);DateTimeFieldType result = doSerialization(type);
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22152);assertSame(type, result);
    }finally{__CLR4_4_1h1yh1yle6o79lq.R.flushNeeded();}}

    private DateTimeFieldType doSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1h1yh1yle6o79lq.R.inc(22153);
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22154);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22155);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22156);oos.writeObject(type);
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22157);byte[] bytes = baos.toByteArray();
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22158);oos.close();
        
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22159);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22160);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22161);DateTimeFieldType result = (DateTimeFieldType) ois.readObject();
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22162);ois.close();
        __CLR4_4_1h1yh1yle6o79lq.R.inc(22163);return result;
    }finally{__CLR4_4_1h1yh1yle6o79lq.R.flushNeeded();}}

}
