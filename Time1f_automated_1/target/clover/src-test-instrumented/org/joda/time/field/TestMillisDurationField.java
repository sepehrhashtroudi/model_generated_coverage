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
public class TestMillisDurationField extends TestCase {static class __CLR4_4_1lzslzsle6ndq3r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,28543,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1lzslzsle6ndq3r.R.inc(28504);
        __CLR4_4_1lzslzsle6ndq3r.R.inc(28505);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lzslzsle6ndq3r.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lzslzsle6ndq3r.R.inc(28506);
        __CLR4_4_1lzslzsle6ndq3r.R.inc(28507);return new TestSuite(TestMillisDurationField.class);
    }finally{__CLR4_4_1lzslzsle6ndq3r.R.flushNeeded();}}

    public TestMillisDurationField(String name) {
        super(name);__CLR4_4_1lzslzsle6ndq3r.R.inc(28509);try{__CLR4_4_1lzslzsle6ndq3r.R.inc(28508);
    }finally{__CLR4_4_1lzslzsle6ndq3r.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lzslzsle6ndq3r.R.inc(28510);
    }finally{__CLR4_4_1lzslzsle6ndq3r.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lzslzsle6ndq3r.R.inc(28511);
    }finally{__CLR4_4_1lzslzsle6ndq3r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSerialization677() throws Exception {__CLR4_4_1lzslzsle6ndq3r.R.globalSliceStart(getClass().getName(),28512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kv5qhtm00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzslzsle6ndq3r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzslzsle6ndq3r.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.testSerialization677",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kv5qhtm00() throws Exception{try{__CLR4_4_1lzslzsle6ndq3r.R.inc(28512); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28513);DurationField test = MillisDurationField.INSTANCE; 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28514);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28515);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28516);oos.writeObject(test); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28517);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28518);oos.close(); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28519);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28520);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28521);DurationField result = (DurationField) ois.readObject(); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28522);ois.close(); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28523);assertSame(test, result); 
 }finally{__CLR4_4_1lzslzsle6ndq3r.R.flushNeeded();}}
public void test_getValue_long_long678() {__CLR4_4_1lzslzsle6ndq3r.R.globalSliceStart(getClass().getName(),28524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pj9is6m0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzslzsle6ndq3r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzslzsle6ndq3r.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long_long678",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pj9is6m0c(){try{__CLR4_4_1lzslzsle6ndq3r.R.inc(28524); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28525);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L, 567L)); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28526);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L, 567L)); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28527);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L, 567L)); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28528);try { 
         __CLR4_4_1lzslzsle6ndq3r.R.inc(28529);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L, 567L); 
         __CLR4_4_1lzslzsle6ndq3r.R.inc(28530);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lzslzsle6ndq3r.R.flushNeeded();}}
public void test_getValueAsLong_long_long679() {__CLR4_4_1lzslzsle6ndq3r.R.globalSliceStart(getClass().getName(),28531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ugncnm0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzslzsle6ndq3r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzslzsle6ndq3r.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValueAsLong_long_long679",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ugncnm0j(){try{__CLR4_4_1lzslzsle6ndq3r.R.inc(28531); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28532);assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L, 567L)); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28533);assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L, 567L)); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28534);assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L, 567L)); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28535);assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L, 567L)); 
 }finally{__CLR4_4_1lzslzsle6ndq3r.R.flushNeeded();}}
public void test_add_long_long680() {__CLR4_4_1lzslzsle6ndq3r.R.globalSliceStart(getClass().getName(),28536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12rgezlm0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzslzsle6ndq3r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzslzsle6ndq3r.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_long680",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12rgezlm0o(){try{__CLR4_4_1lzslzsle6ndq3r.R.inc(28536); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28537);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0L)); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28538);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234L)); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28539);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234L)); 
     __CLR4_4_1lzslzsle6ndq3r.R.inc(28540);try { 
         __CLR4_4_1lzslzsle6ndq3r.R.inc(28541);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1L); 
         __CLR4_4_1lzslzsle6ndq3r.R.inc(28542);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lzslzsle6ndq3r.R.flushNeeded();}}
    

    
    
    

    

    

    
    
    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
