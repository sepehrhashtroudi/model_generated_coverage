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
public class TestMillisDurationField extends TestCase {static class __CLR4_4_1tpctpclc8axeyd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,38602,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1tpctpclc8axeyd.R.inc(38496);
        __CLR4_4_1tpctpclc8axeyd.R.inc(38497);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tpctpclc8axeyd.R.inc(38498);
        __CLR4_4_1tpctpclc8axeyd.R.inc(38499);return new TestSuite(TestMillisDurationField.class);
    }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}}

    public TestMillisDurationField(String name) {
        super(name);__CLR4_4_1tpctpclc8axeyd.R.inc(38501);try{__CLR4_4_1tpctpclc8axeyd.R.inc(38500);
    }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tpctpclc8axeyd.R.inc(38502);
    }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tpctpclc8axeyd.R.inc(38503);
    }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getDifference_long_int388() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywxahhtpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getDifference_long_int388",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywxahhtpk(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38504); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38505);assertEquals(567, MillisDurationField.INSTANCE.getDifference(567L, 0L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38506);assertEquals(567 - 1234, MillisDurationField.INSTANCE.getDifference(567L, 1234L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38507);assertEquals(567 + 1234, MillisDurationField.INSTANCE.getDifference(567L, -1234L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38508);try { 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38509);MillisDurationField.INSTANCE.getDifference(Long.MAX_VALUE, 1L); 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38510);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_getValueAsLong_long_long439() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1om185ntpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValueAsLong_long_long439",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1om185ntpr(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38511); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38512);assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L, 567L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38513);assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L, 567L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38514);assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L, 567L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38515);assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L, 567L)); 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_add_long_int551() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vvrbq9tpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_int551",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vvrbq9tpw(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38516); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38517);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38518);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38519);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38520);try { 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38521);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1); 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38522);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_getName629() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pnqppstq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getName629",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pnqppstq3(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38523); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38524);assertEquals("millis", MillisDurationField.INSTANCE.getName()); 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long706() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16iaikwtq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getDifferenceAsLong_long_long706",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16iaikwtq5(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38525); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38526);assertEquals(567L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 0L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38527);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 1234L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38528);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, -1234L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38529);try { 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38530);MillisDurationField.INSTANCE.getDifferenceAsLong(Long.MAX_VALUE, -1L); 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38531);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_add_long_long707() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119xkr3tqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_long707",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119xkr3tqc(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38532); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38533);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38534);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38535);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38536);try { 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38537);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1L); 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38538);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_toString910() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1uuzqtqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_toString910",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1uuzqtqj(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38539); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38540);assertEquals("DurationField[millis]", MillisDurationField.INSTANCE.toString()); 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_getValue_long_long952() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b83wc5tql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long_long952",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b83wc5tql(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38541); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38542);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L, 567L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38543);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L, 567L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38544);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L, 567L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38545);try { 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38546);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L, 567L); 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38547);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_getValue_long1030() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9v9rqtqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long1030",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9v9rqtqs(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38548); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38549);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38550);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38551);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38552);try { 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38553);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L); 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38554);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_isPrecise1040() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsftjutqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_isPrecise1040",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsftjutqz(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38555); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38556);assertEquals(true, MillisDurationField.INSTANCE.isPrecise()); 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_getValueAsLong_long1375() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhuh3gtr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValueAsLong_long1375",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhuh3gtr1(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38557); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38558);assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38559);assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38560);assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38561);assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L)); 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_getMillis_long_long1411() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18y94optr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_long_long1411",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18y94optr6(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38562); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38563);assertEquals(0L, MillisDurationField.INSTANCE.getMillis(0L, 567L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38564);assertEquals(1234L, MillisDurationField.INSTANCE.getMillis(1234L, 567L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38565);assertEquals(-1234L, MillisDurationField.INSTANCE.getMillis(-1234L, 567L)); 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_compareTo1413() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1735ue7tra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_compareTo1413",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1735ue7tra(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38566); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38567);assertEquals(0, MillisDurationField.INSTANCE.compareTo(MillisDurationField.INSTANCE)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38568);assertEquals(-1, MillisDurationField.INSTANCE.compareTo(ISOChronology.getInstance().seconds())); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38569);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38570);assertEquals(1, MillisDurationField.INSTANCE.compareTo(dummy)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38571);try { 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38572);MillisDurationField.INSTANCE.compareTo(null); 
         __CLR4_4_1tpctpclc8axeyd.R.inc(38573);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_getMillis_int_long1454() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s8fmm3tri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_int_long1454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s8fmm3tri(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38574); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38575);assertEquals(0, MillisDurationField.INSTANCE.getMillis(0, 567L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38576);assertEquals(1234, MillisDurationField.INSTANCE.getMillis(1234, 567L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38577);assertEquals(-1234, MillisDurationField.INSTANCE.getMillis(-1234, 567L)); 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_getMillis_long1513() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fc29qftrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_long1513",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fc29qftrm(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38578); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38579);assertEquals(0L, MillisDurationField.INSTANCE.getMillis(0L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38580);assertEquals(1234L, MillisDurationField.INSTANCE.getMillis(1234L)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38581);assertEquals(-1234L, MillisDurationField.INSTANCE.getMillis(-1234L)); 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_getMillis_int1582() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kurah0trq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_int1582",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kurah0trq(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38582); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38583);assertEquals(0, MillisDurationField.INSTANCE.getMillis(0)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38584);assertEquals(1234, MillisDurationField.INSTANCE.getMillis(1234)); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38585);assertEquals(-1234, MillisDurationField.INSTANCE.getMillis(-1234)); 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_getType1597() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17tor58tru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getType1597",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17tor58tru(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38586); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38587);assertEquals(DurationFieldType.millis(), MillisDurationField.INSTANCE.getType()); 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void test_isSupported1602() {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ytusthtrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_isSupported1602",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ytusthtrw(){try{__CLR4_4_1tpctpclc8axeyd.R.inc(38588); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38589);assertEquals(true, MillisDurationField.INSTANCE.isSupported()); 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 


public void testSerialization1701() throws Exception {__CLR4_4_1tpctpclc8axeyd.R.globalSliceStart(getClass().getName(),38590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csfkcstry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tpctpclc8axeyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tpctpclc8axeyd.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.testSerialization1701",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csfkcstry() throws Exception{try{__CLR4_4_1tpctpclc8axeyd.R.inc(38590); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38591);DurationField test = MillisDurationField.INSTANCE; 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38592);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38593);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38594);oos.writeObject(test); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38595);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38596);oos.close(); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38597);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38598);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38599);DurationField result = (DurationField) ois.readObject(); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38600);ois.close(); 
     __CLR4_4_1tpctpclc8axeyd.R.inc(38601);assertSame(test, result); 
 }finally{__CLR4_4_1tpctpclc8axeyd.R.flushNeeded();}} 

    

    
    
    

    

    

    
    
    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
