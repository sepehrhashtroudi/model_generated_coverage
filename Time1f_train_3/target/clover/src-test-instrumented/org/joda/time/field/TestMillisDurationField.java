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
public class TestMillisDurationField extends TestCase {static class __CLR4_4_1rz6rz6le6rcmx6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,36360,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36258);
        __CLR4_4_1rz6rz6le6rcmx6.R.inc(36259);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36260);
        __CLR4_4_1rz6rz6le6rcmx6.R.inc(36261);return new TestSuite(TestMillisDurationField.class);
    }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}}

    public TestMillisDurationField(String name) {
        super(name);__CLR4_4_1rz6rz6le6rcmx6.R.inc(36263);try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36262);
    }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36264);
    }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36265);
    }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getType1351() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fs6tworze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getType1351",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fs6tworze(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36266); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36267);assertEquals(DurationFieldType.millis(), MillisDurationField.INSTANCE.getType()); 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_getName1352() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ph7a0qrzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getName1352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ph7a0qrzg(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36268); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36269);assertEquals("millis", MillisDurationField.INSTANCE.getName()); 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_isSupported1353() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0mt0irzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_isSupported1353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0mt0irzi(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36270); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36271);assertEquals(true, MillisDurationField.INSTANCE.isSupported()); 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_isPrecise1354() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eiuvkcrzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_isPrecise1354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eiuvkcrzk(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36272); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36273);assertEquals(true, MillisDurationField.INSTANCE.isPrecise()); 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_compareTo1355() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gs0xwrzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_compareTo1355",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gs0xwrzm(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36274); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36275);assertEquals(0, MillisDurationField.INSTANCE.compareTo(MillisDurationField.INSTANCE)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36276);assertEquals(-1, MillisDurationField.INSTANCE.compareTo(ISOChronology.getInstance().seconds())); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36277);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36278);assertEquals(1, MillisDurationField.INSTANCE.compareTo(dummy)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36279);try { 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36280);MillisDurationField.INSTANCE.compareTo(null); 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36281);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_getValue_long1356() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrwr19rzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long1356",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrwr19rzu(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36282); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36283);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36284);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36285);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36286);try { 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36287);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L); 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36288);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_getValueAsLong_long1357() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tl8nkgs01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValueAsLong_long1357",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tl8nkgs01(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36289); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36290);assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36291);assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36292);assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36293);assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L)); 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_getValue_long_long1358() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wc6kbws06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long_long1358",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wc6kbws06(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36294); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36295);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L, 567L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36296);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L, 567L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36297);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L, 567L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36298);try { 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36299);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L, 567L); 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36300);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_getValueAsLong_long_long1359() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f842jhs0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValueAsLong_long_long1359",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f842jhs0d(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36301); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36302);assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L, 567L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36303);assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L, 567L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36304);assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L, 567L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36305);assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L, 567L)); 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_getMillis_int1360() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7uzias0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_int1360",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7uzias0i(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36306); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36307);assertEquals(0, MillisDurationField.INSTANCE.getMillis(0)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36308);assertEquals(1234, MillisDurationField.INSTANCE.getMillis(1234)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36309);assertEquals(-1234, MillisDurationField.INSTANCE.getMillis(-1234)); 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_getMillis_long1361() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1aetss0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_long1361",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1aetss0m(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36310); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36311);assertEquals(0L, MillisDurationField.INSTANCE.getMillis(0L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36312);assertEquals(1234L, MillisDurationField.INSTANCE.getMillis(1234L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36313);assertEquals(-1234L, MillisDurationField.INSTANCE.getMillis(-1234L)); 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_getMillis_long_long1362() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kv673os0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_long_long1362",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kv673os0q(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36314); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36315);assertEquals(0L, MillisDurationField.INSTANCE.getMillis(0L, 567L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36316);assertEquals(1234L, MillisDurationField.INSTANCE.getMillis(1234L, 567L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36317);assertEquals(-1234L, MillisDurationField.INSTANCE.getMillis(-1234L, 567L)); 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_add_long_int1363() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcfr0ds0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_int1363",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcfr0ds0u(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36318); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36319);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36320);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36321);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36322);try { 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36323);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1); 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36324);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_add_long_long1364() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fj4igrs11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_long1364",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fj4igrs11(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36325); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36326);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36327);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36328);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36329);try { 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36330);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1L); 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36331);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_getDifference_long_int1365() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aylp7xs18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getDifference_long_int1365",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aylp7xs18(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36332); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36333);assertEquals(567, MillisDurationField.INSTANCE.getDifference(567L, 0L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36334);assertEquals(567 - 1234, MillisDurationField.INSTANCE.getDifference(567L, 1234L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36335);assertEquals(567 + 1234, MillisDurationField.INSTANCE.getDifference(567L, -1234L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36336);try { 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36337);MillisDurationField.INSTANCE.getDifference(Long.MAX_VALUE, 1L); 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36338);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long1366() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18xhzzxs1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getDifferenceAsLong_long_long1366",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18xhzzxs1f(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36339); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36340);assertEquals(567L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 0L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36341);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 1234L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36342);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, -1234L)); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36343);try { 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36344);MillisDurationField.INSTANCE.getDifferenceAsLong(Long.MAX_VALUE, -1L); 
         __CLR4_4_1rz6rz6le6rcmx6.R.inc(36345);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void test_toString1368() {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4wttos1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_toString1368",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4wttos1m(){try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36346); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36347);assertEquals("DurationField[millis]", MillisDurationField.INSTANCE.toString()); 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 


public void testSerialization1369() throws Exception {__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceStart(getClass().getName(),36348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cjnbgqs1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz6rz6le6rcmx6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz6rz6le6rcmx6.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.testSerialization1369",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cjnbgqs1o() throws Exception{try{__CLR4_4_1rz6rz6le6rcmx6.R.inc(36348); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36349);DurationField test = MillisDurationField.INSTANCE; 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36350);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36351);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36352);oos.writeObject(test); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36353);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36354);oos.close(); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36355);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36356);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36357);DurationField result = (DurationField) ois.readObject(); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36358);ois.close(); 
     __CLR4_4_1rz6rz6le6rcmx6.R.inc(36359);assertSame(test, result); 
 }finally{__CLR4_4_1rz6rz6le6rcmx6.R.flushNeeded();}} 

    

    
    
    

    

    

    
    
    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
