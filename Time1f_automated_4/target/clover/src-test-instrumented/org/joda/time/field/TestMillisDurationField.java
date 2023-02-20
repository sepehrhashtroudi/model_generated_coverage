/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
package org.joda.time.field;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PeriodFormatterBuilder.
 *
 * @author Stephen Colebourne
 */
public class TestMillisDurationField extends TestCase {static class __CLR4_4_1lellelle6o7acc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,27782,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1lellelle6o7acc.R.inc(27741);
        __CLR4_4_1lellelle6o7acc.R.inc(27742);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lellelle6o7acc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lellelle6o7acc.R.inc(27743);
        __CLR4_4_1lellelle6o7acc.R.inc(27744);return new TestSuite(TestMillisDurationField.class);
    }finally{__CLR4_4_1lellelle6o7acc.R.flushNeeded();}}

    public TestMillisDurationField(String name) {
        super(name);__CLR4_4_1lellelle6o7acc.R.inc(27746);try{__CLR4_4_1lellelle6o7acc.R.inc(27745);
    }finally{__CLR4_4_1lellelle6o7acc.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lellelle6o7acc.R.inc(27747);
    }finally{__CLR4_4_1lellelle6o7acc.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lellelle6o7acc.R.inc(27748);
    }finally{__CLR4_4_1lellelle6o7acc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_toString548() {__CLR4_4_1lellelle6o7acc.R.globalSliceStart(getClass().getName(),27749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17be1jtlet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lellelle6o7acc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lellelle6o7acc.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_toString548",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17be1jtlet(){try{__CLR4_4_1lellelle6o7acc.R.inc(27749); 
     __CLR4_4_1lellelle6o7acc.R.inc(27750);assertEquals("millis", MillisDurationField.INSTANCE.toString()); 
 }finally{__CLR4_4_1lellelle6o7acc.R.flushNeeded();}}
public void test_isPrecise549() {__CLR4_4_1lellelle6o7acc.R.globalSliceStart(getClass().getName(),27751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jn53vnlev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lellelle6o7acc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lellelle6o7acc.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_isPrecise549",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jn53vnlev(){try{__CLR4_4_1lellelle6o7acc.R.inc(27751); 
     __CLR4_4_1lellelle6o7acc.R.inc(27752);assertEquals(true, MillisDurationField.INSTANCE.isPrecise()); 
 }finally{__CLR4_4_1lellelle6o7acc.R.flushNeeded();}}
public void test_getValue_long550() {__CLR4_4_1lellelle6o7acc.R.globalSliceStart(getClass().getName(),27753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mj8sclex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lellelle6o7acc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lellelle6o7acc.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long550",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mj8sclex(){try{__CLR4_4_1lellelle6o7acc.R.inc(27753); 
     __CLR4_4_1lellelle6o7acc.R.inc(27754);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27755);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27756);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27757);try { 
         __CLR4_4_1lellelle6o7acc.R.inc(27758);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L); 
         __CLR4_4_1lellelle6o7acc.R.inc(27759);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lellelle6o7acc.R.flushNeeded();}}
public void test_getMillis_int551() {__CLR4_4_1lellelle6o7acc.R.globalSliceStart(getClass().getName(),27760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mtxe13lf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lellelle6o7acc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lellelle6o7acc.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_int551",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mtxe13lf4(){try{__CLR4_4_1lellelle6o7acc.R.inc(27760); 
     __CLR4_4_1lellelle6o7acc.R.inc(27761);assertEquals(0, MillisDurationField.INSTANCE.getMillis(0)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27762);assertEquals(1234, MillisDurationField.INSTANCE.getMillis(1234)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27763);assertEquals(-1234, MillisDurationField.INSTANCE.getMillis(-1234)); 
 }finally{__CLR4_4_1lellelle6o7acc.R.flushNeeded();}}
public void test_getMillis_long552() {__CLR4_4_1lellelle6o7acc.R.globalSliceStart(getClass().getName(),27764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11w9inhlf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lellelle6o7acc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lellelle6o7acc.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_long552",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11w9inhlf8(){try{__CLR4_4_1lellelle6o7acc.R.inc(27764); 
     __CLR4_4_1lellelle6o7acc.R.inc(27765);assertEquals(0L, MillisDurationField.INSTANCE.getMillis(0L)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27766);assertEquals(1234L, MillisDurationField.INSTANCE.getMillis(1234L)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27767);assertEquals(-1234L, MillisDurationField.INSTANCE.getMillis(-1234L)); 
 }finally{__CLR4_4_1lellelle6o7acc.R.flushNeeded();}}
public void test_add_long_int553() {__CLR4_4_1lellelle6o7acc.R.globalSliceStart(getClass().getName(),27768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wncsnxlfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lellelle6o7acc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lellelle6o7acc.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_int553",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wncsnxlfc(){try{__CLR4_4_1lellelle6o7acc.R.inc(27768); 
     __CLR4_4_1lellelle6o7acc.R.inc(27769);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27770);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27771);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27772);try { 
         __CLR4_4_1lellelle6o7acc.R.inc(27773);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1); 
         __CLR4_4_1lellelle6o7acc.R.inc(27774);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lellelle6o7acc.R.flushNeeded();}}
public void test_getDifferenceAsLong_long_long554() {__CLR4_4_1lellelle6o7acc.R.globalSliceStart(getClass().getName(),27775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1at2dhjlfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lellelle6o7acc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lellelle6o7acc.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getDifferenceAsLong_long_long554",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1at2dhjlfj(){try{__CLR4_4_1lellelle6o7acc.R.inc(27775); 
     __CLR4_4_1lellelle6o7acc.R.inc(27776);assertEquals(567L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 0L)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27777);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 1234L)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27778);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, -1234L)); 
     __CLR4_4_1lellelle6o7acc.R.inc(27779);try { 
         __CLR4_4_1lellelle6o7acc.R.inc(27780);MillisDurationField.INSTANCE.getDifferenceAsLong(Long.MAX_VALUE, 1L); 
         __CLR4_4_1lellelle6o7acc.R.inc(27781);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lellelle6o7acc.R.flushNeeded();}}
    

    
    
    

    

    

    
    
    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
