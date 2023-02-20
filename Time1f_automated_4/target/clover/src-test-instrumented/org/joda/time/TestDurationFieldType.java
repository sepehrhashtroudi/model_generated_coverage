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
 * This class is a Junit unit test for DurationFieldType.
 *
 * @author Stephen Colebourne
 */
public class TestDurationFieldType extends TestCase {static class __CLR4_4_1hinhinle6o79oo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,22749,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1hinhinle6o79oo.R.inc(22703);
        __CLR4_4_1hinhinle6o79oo.R.inc(22704);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hinhinle6o79oo.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hinhinle6o79oo.R.inc(22705);
        __CLR4_4_1hinhinle6o79oo.R.inc(22706);return new TestSuite(TestDurationFieldType.class);
    }finally{__CLR4_4_1hinhinle6o79oo.R.flushNeeded();}}

    public TestDurationFieldType(String name) {
        super(name);__CLR4_4_1hinhinle6o79oo.R.inc(22708);try{__CLR4_4_1hinhinle6o79oo.R.inc(22707);
    }finally{__CLR4_4_1hinhinle6o79oo.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hinhinle6o79oo.R.inc(22709);
    }finally{__CLR4_4_1hinhinle6o79oo.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hinhinle6o79oo.R.inc(22710);
    }finally{__CLR4_4_1hinhinle6o79oo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_centuries393() throws Exception {__CLR4_4_1hinhinle6o79oo.R.globalSliceStart(getClass().getName(),22711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11o5o41hiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hinhinle6o79oo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hinhinle6o79oo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_centuries393",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11o5o41hiv() throws Exception{try{__CLR4_4_1hinhinle6o79oo.R.inc(22711); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22712);assertEquals(DurationFieldType.centuries(), DurationFieldType.centuries()); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22713);assertEquals("centuries", DurationFieldType.centuries().getName()); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22714);assertEquals(CopticChronology.getInstanceUTC().centuries(), DurationFieldType.centuries().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22715);assertEquals(CopticChronology.getInstanceUTC().centuries().isSupported(), DurationFieldType.centuries().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22716);assertSerialization(DurationFieldType.centuries()); 
 }finally{__CLR4_4_1hinhinle6o79oo.R.flushNeeded();}}
public void test_months395() throws Exception {__CLR4_4_1hinhinle6o79oo.R.globalSliceStart(getClass().getName(),22717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160e6rahj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hinhinle6o79oo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hinhinle6o79oo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_months395",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160e6rahj1() throws Exception{try{__CLR4_4_1hinhinle6o79oo.R.inc(22717); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22718);assertEquals(DurationFieldType.months(), DurationFieldType.months()); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22719);assertEquals("months", DurationFieldType.months().getName()); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22720);assertEquals(CopticChronology.getInstanceUTC().months(), DurationFieldType.months().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22721);assertEquals(CopticChronology.getInstanceUTC().months().isSupported(), DurationFieldType.months().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22722);assertSerialization(DurationFieldType.months()); 
 }finally{__CLR4_4_1hinhinle6o79oo.R.flushNeeded();}}
public void test_halfdays396() throws Exception {__CLR4_4_1hinhinle6o79oo.R.globalSliceStart(getClass().getName(),22723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wyb35shj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hinhinle6o79oo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hinhinle6o79oo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_halfdays396",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wyb35shj7() throws Exception{try{__CLR4_4_1hinhinle6o79oo.R.inc(22723); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22724);assertEquals(DurationFieldType.halfdays(), DurationFieldType.halfdays()); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22725);assertEquals("halfdays", DurationFieldType.halfdays().getName()); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22726);assertEquals(CopticChronology.getInstanceUTC().halfdays(), DurationFieldType.halfdays().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22727);assertEquals(CopticChronology.getInstanceUTC().halfdays().isSupported(), DurationFieldType.halfdays().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22728);assertSerialization(DurationFieldType.halfdays()); 
 }finally{__CLR4_4_1hinhinle6o79oo.R.flushNeeded();}}
public void test_hours397() throws Exception {__CLR4_4_1hinhinle6o79oo.R.globalSliceStart(getClass().getName(),22729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxuezuhjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hinhinle6o79oo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hinhinle6o79oo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_hours397",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxuezuhjd() throws Exception{try{__CLR4_4_1hinhinle6o79oo.R.inc(22729); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22730);assertEquals(DurationFieldType.hours(), DurationFieldType.hours()); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22731);assertEquals("hours", DurationFieldType.hours().getName()); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22732);assertEquals(CopticChronology.getInstanceUTC().hours(), DurationFieldType.hours().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22733);assertEquals(CopticChronology.getInstanceUTC().hours().isSupported(), DurationFieldType.hours().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hinhinle6o79oo.R.inc(22734);assertSerialization(DurationFieldType.hours()); 
 }finally{__CLR4_4_1hinhinle6o79oo.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1hinhinle6o79oo.R.inc(22735);
        __CLR4_4_1hinhinle6o79oo.R.inc(22736);DurationFieldType result = doSerialization(type);
        __CLR4_4_1hinhinle6o79oo.R.inc(22737);assertSame(type, result);
    }finally{__CLR4_4_1hinhinle6o79oo.R.flushNeeded();}}

    private DurationFieldType doSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1hinhinle6o79oo.R.inc(22738);
        __CLR4_4_1hinhinle6o79oo.R.inc(22739);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1hinhinle6o79oo.R.inc(22740);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1hinhinle6o79oo.R.inc(22741);oos.writeObject(type);
        __CLR4_4_1hinhinle6o79oo.R.inc(22742);byte[] bytes = baos.toByteArray();
        __CLR4_4_1hinhinle6o79oo.R.inc(22743);oos.close();
        
        __CLR4_4_1hinhinle6o79oo.R.inc(22744);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1hinhinle6o79oo.R.inc(22745);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1hinhinle6o79oo.R.inc(22746);DurationFieldType result = (DurationFieldType) ois.readObject();
        __CLR4_4_1hinhinle6o79oo.R.inc(22747);ois.close();
        __CLR4_4_1hinhinle6o79oo.R.inc(22748);return result;
    }finally{__CLR4_4_1hinhinle6o79oo.R.flushNeeded();}}

}
