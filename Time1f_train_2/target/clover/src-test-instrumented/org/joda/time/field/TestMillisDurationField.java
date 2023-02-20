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
public class TestMillisDurationField extends TestCase {static class __CLR4_4_1rwurwule6qsfkg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,36254,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1rwurwule6qsfkg.R.inc(36174);
        __CLR4_4_1rwurwule6qsfkg.R.inc(36175);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rwurwule6qsfkg.R.inc(36176);
        __CLR4_4_1rwurwule6qsfkg.R.inc(36177);return new TestSuite(TestMillisDurationField.class);
    }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}}

    public TestMillisDurationField(String name) {
        super(name);__CLR4_4_1rwurwule6qsfkg.R.inc(36179);try{__CLR4_4_1rwurwule6qsfkg.R.inc(36178);
    }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rwurwule6qsfkg.R.inc(36180);
    }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rwurwule6qsfkg.R.inc(36181);
    }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getName1341() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17hnlbarx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getName1341",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17hnlbarx2(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36182); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36183);assertEquals("millis", MillisDurationField.INSTANCE.getName()); 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_isSupported1342() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1mdmmrx4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_isSupported1342",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1mdmmrx4(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36184); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36185);assertEquals(true, MillisDurationField.INSTANCE.isSupported()); 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_isPrecise1343() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ifzzrorx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_isPrecise1343",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ifzzrorx6(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36186); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36187);assertEquals(true, MillisDurationField.INSTANCE.isPrecise()); 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_compareTo1344() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ulh5p8rx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_compareTo1344",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ulh5p8rx8(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36188); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36189);assertEquals(0, MillisDurationField.INSTANCE.compareTo(MillisDurationField.INSTANCE)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36190);assertEquals(-1, MillisDurationField.INSTANCE.compareTo(ISOChronology.getInstance().seconds())); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36191);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36192);assertEquals(1, MillisDurationField.INSTANCE.compareTo(dummy)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36193);try { 
         __CLR4_4_1rwurwule6qsfkg.R.inc(36194);MillisDurationField.INSTANCE.compareTo(null); 
         __CLR4_4_1rwurwule6qsfkg.R.inc(36195);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_getValue_long1345() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_156y4arrxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long1345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_156y4arrxg(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36196); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36197);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36198);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36199);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36200);try { 
         __CLR4_4_1rwurwule6qsfkg.R.inc(36201);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L); 
         __CLR4_4_1rwurwule6qsfkg.R.inc(36202);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_getValue_long_long1346() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12h2nirrxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long_long1346",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12h2nirrxn(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36203); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36204);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L, 567L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36205);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L, 567L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36206);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L, 567L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36207);try { 
         __CLR4_4_1rwurwule6qsfkg.R.inc(36208);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L, 567L); 
         __CLR4_4_1rwurwule6qsfkg.R.inc(36209);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_getValueAsLong_long_long1347() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jl55b6rxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValueAsLong_long_long1347",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jl55b6rxu(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36210); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36211);assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L, 567L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36212);assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L, 567L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36213);assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L, 567L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36214);assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L, 567L)); 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_getMillis_int1348() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_137v390rxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_int1348",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_137v390rxz(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36215); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36216);assertEquals(0, MillisDurationField.INSTANCE.getMillis(0)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36217);assertEquals(1234, MillisDurationField.INSTANCE.getMillis(1234)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36218);assertEquals(-1234, MillisDurationField.INSTANCE.getMillis(-1234)); 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_getMillis_long1349() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qk3ke2ry3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_long1349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qk3ke2ry3(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36219); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36220);assertEquals(0L, MillisDurationField.INSTANCE.getMillis(0L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36221);assertEquals(1234L, MillisDurationField.INSTANCE.getMillis(1234L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36222);assertEquals(-1234L, MillisDurationField.INSTANCE.getMillis(-1234L)); 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_getMillis_int_long1350() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vxj928ry7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_int_long1350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vxj928ry7(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36223); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36224);assertEquals(0, MillisDurationField.INSTANCE.getMillis(0, 567L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36225);assertEquals(1234, MillisDurationField.INSTANCE.getMillis(1234, 567L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36226);assertEquals(-1234, MillisDurationField.INSTANCE.getMillis(-1234, 567L)); 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_getMillis_long_long1351() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oo8cryb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_long_long1351",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oo8cryb(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36227); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36228);assertEquals(0L, MillisDurationField.INSTANCE.getMillis(0L, 567L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36229);assertEquals(1234L, MillisDurationField.INSTANCE.getMillis(1234L, 567L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36230);assertEquals(-1234L, MillisDurationField.INSTANCE.getMillis(-1234L, 567L)); 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_add_long_int1352() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mf4bnryf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_int1352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mf4bnryf(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36231); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36232);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36233);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36234);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36235);try { 
         __CLR4_4_1rwurwule6qsfkg.R.inc(36236);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1); 
         __CLR4_4_1rwurwule6qsfkg.R.inc(36237);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_add_long_long1353() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hfqcv9rym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_long1353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hfqcv9rym(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36238); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36239);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36240);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36241);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36242);try { 
         __CLR4_4_1rwurwule6qsfkg.R.inc(36243);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1L); 
         __CLR4_4_1rwurwule6qsfkg.R.inc(36244);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long1354() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1racu4kryt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getDifferenceAsLong_long_long1354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1racu4kryt(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36245); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36246);assertEquals(567L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 0L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36247);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 1234L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36248);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, -1234L)); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36249);try { 
         __CLR4_4_1rwurwule6qsfkg.R.inc(36250);MillisDurationField.INSTANCE.getDifferenceAsLong(Long.MAX_VALUE, -1L); 
         __CLR4_4_1rwurwule6qsfkg.R.inc(36251);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 


public void test_toString1355() {__CLR4_4_1rwurwule6qsfkg.R.globalSliceStart(getClass().getName(),36252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fcf8irz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rwurwule6qsfkg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rwurwule6qsfkg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_toString1355",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fcf8irz0(){try{__CLR4_4_1rwurwule6qsfkg.R.inc(36252); 
     __CLR4_4_1rwurwule6qsfkg.R.inc(36253);assertEquals("DurationField[millis]", MillisDurationField.INSTANCE.toString()); 
 }finally{__CLR4_4_1rwurwule6qsfkg.R.flushNeeded();}} 

    

    
    
    

    

    

    
    
    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
