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
 * This class is a Junit unit test for PreciseDurationField.
 *
 * @author Stephen Colebourne
 */
public class TestPreciseDurationField extends TestCase {static class __CLR4_4_1lsqlsqle6nl8pe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,28303,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private PreciseDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1lsqlsqle6nl8pe.R.inc(28250);
        __CLR4_4_1lsqlsqle6nl8pe.R.inc(28251);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lsqlsqle6nl8pe.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lsqlsqle6nl8pe.R.inc(28252);
        __CLR4_4_1lsqlsqle6nl8pe.R.inc(28253);return new TestSuite(TestPreciseDurationField.class);
    }finally{__CLR4_4_1lsqlsqle6nl8pe.R.flushNeeded();}}

    public TestPreciseDurationField(String name) {
        super(name);__CLR4_4_1lsqlsqle6nl8pe.R.inc(28255);try{__CLR4_4_1lsqlsqle6nl8pe.R.inc(28254);
    }finally{__CLR4_4_1lsqlsqle6nl8pe.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lsqlsqle6nl8pe.R.inc(28256);
        __CLR4_4_1lsqlsqle6nl8pe.R.inc(28257);iField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
    }finally{__CLR4_4_1lsqlsqle6nl8pe.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lsqlsqle6nl8pe.R.inc(28258);
        __CLR4_4_1lsqlsqle6nl8pe.R.inc(28259);iField = null;
    }finally{__CLR4_4_1lsqlsqle6nl8pe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_getValue_long136() {__CLR4_4_1lsqlsqle6nl8pe.R.globalSliceStart(getClass().getName(),28260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w0uho8lt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsqlsqle6nl8pe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsqlsqle6nl8pe.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w0uho8lt0(){try{__CLR4_4_1lsqlsqle6nl8pe.R.inc(28260); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28261);assertEquals(0, iField.getValue(0L)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28262);assertEquals(12345, iField.getValue(123456L)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28263);assertEquals(-1, iField.getValue(-1234L)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28264);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28265);try { 
         __CLR4_4_1lsqlsqle6nl8pe.R.inc(28266);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L); 
         __CLR4_4_1lsqlsqle6nl8pe.R.inc(28267);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lsqlsqle6nl8pe.R.flushNeeded();}}
public void test_getValue_long137() {__CLR4_4_1lsqlsqle6nl8pe.R.globalSliceStart(getClass().getName(),28268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sruivrlt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsqlsqle6nl8pe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsqlsqle6nl8pe.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long137",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sruivrlt8(){try{__CLR4_4_1lsqlsqle6nl8pe.R.inc(28268); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28269);assertEquals(0, iField.getValue(0L)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28270);assertEquals(12345, iField.getValue(123456L)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28271);assertEquals(-1, iField.getValue(-1234L)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28272);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28273);try { 
         __CLR4_4_1lsqlsqle6nl8pe.R.inc(28274);iField.getValue(LONG_INTEGER_MAX + 1L); 
         __CLR4_4_1lsqlsqle6nl8pe.R.inc(28275);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lsqlsqle6nl8pe.R.flushNeeded();}}
public void test_getMillis_int_long195() {__CLR4_4_1lsqlsqle6nl8pe.R.globalSliceStart(getClass().getName(),28276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vivzi0ltg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsqlsqle6nl8pe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsqlsqle6nl8pe.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_int_long195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vivzi0ltg(){try{__CLR4_4_1lsqlsqle6nl8pe.R.inc(28276); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28277);assertEquals(0, iField.getMillis(0, 567L)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28278);assertEquals(1234, iField.getMillis(1234, 567L)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28279);assertEquals(-1234, iField.getMillis(-1234, 567L)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28280);assertEquals(LONG_INTEGER_MAX * 1000L, iField.getMillis(INTEGER_MAX, 567L)); 
 }finally{__CLR4_4_1lsqlsqle6nl8pe.R.flushNeeded();}}
public void test_add_long_int196() {__CLR4_4_1lsqlsqle6nl8pe.R.globalSliceStart(getClass().getName(),28281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhdfcultl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsqlsqle6nl8pe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsqlsqle6nl8pe.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_int196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhdfcultl(){try{__CLR4_4_1lsqlsqle6nl8pe.R.inc(28281); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28282);assertEquals(567L, iField.add(567L, 0)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28283);assertEquals(567L + 1234000L, iField.add(567L, 1234)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28284);assertEquals(567L - 1234000L, iField.add(567L, -1234)); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28285);try { 
         __CLR4_4_1lsqlsqle6nl8pe.R.inc(28286);iField.add(LONG_MAX, 1); 
         __CLR4_4_1lsqlsqle6nl8pe.R.inc(28287);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28288);try { 
         __CLR4_4_1lsqlsqle6nl8pe.R.inc(28289);iField.add(1L, LONG_MAX); 
         __CLR4_4_1lsqlsqle6nl8pe.R.inc(28290);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lsqlsqle6nl8pe.R.flushNeeded();}}
public void testSerialization197() throws Exception {__CLR4_4_1lsqlsqle6nl8pe.R.globalSliceStart(getClass().getName(),28291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsaj2gltv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsqlsqle6nl8pe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsqlsqle6nl8pe.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.testSerialization197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsaj2gltv() throws Exception{try{__CLR4_4_1lsqlsqle6nl8pe.R.inc(28291); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28292);DurationField test = iField; 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28293);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28294);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28295);oos.writeObject(test); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28296);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28297);oos.close(); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28298);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28299);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28300);DurationField result = (DurationField) ois.readObject(); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28301);ois.close(); 
     __CLR4_4_1lsqlsqle6nl8pe.R.inc(28302);assertEquals(test, result); 
 }finally{__CLR4_4_1lsqlsqle6nl8pe.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
