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
public class TestScaledDurationField extends TestCase {static class __CLR4_4_1u73u73lc8axezv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,39286,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private ScaledDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1u73u73lc8axezv.R.inc(39135);
        __CLR4_4_1u73u73lc8axezv.R.inc(39136);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1u73u73lc8axezv.R.inc(39137);
        __CLR4_4_1u73u73lc8axezv.R.inc(39138);return new TestSuite(TestScaledDurationField.class);
    }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}}

    public TestScaledDurationField(String name) {
        super(name);__CLR4_4_1u73u73lc8axezv.R.inc(39140);try{__CLR4_4_1u73u73lc8axezv.R.inc(39139);
    }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1u73u73lc8axezv.R.inc(39141);
        __CLR4_4_1u73u73lc8axezv.R.inc(39142);DurationField base = MillisDurationField.INSTANCE;
        __CLR4_4_1u73u73lc8axezv.R.inc(39143);iField = new ScaledDurationField(base, DurationFieldType.minutes(), 90);
    }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1u73u73lc8axezv.R.inc(39144);
        __CLR4_4_1u73u73lc8axezv.R.inc(39145);iField = null;
    }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_add_long_int90() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogyx2tu7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_int90",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogyx2tu7e(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39146); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39147);assertEquals(567L, iField.add(567L, 0)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39148);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39149);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39150);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39151);iField.add(LONG_MAX, 1); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39152);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_getMillis_int_long363() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mq0jfu7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int_long363",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mq0jfu7l(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39153); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39154);assertEquals(0L, iField.getMillis(0, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39155);assertEquals(1234L * 90L, iField.getMillis(1234, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39156);assertEquals(-1234L * 90L, iField.getMillis(-1234, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39157);assertEquals(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX, 567L)); 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_constructor476() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1393fbnu7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_constructor476",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1393fbnu7q(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39158); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39159);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39160);new ScaledDurationField(null, DurationFieldType.minutes(), 10); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39161);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1u73u73lc8axezv.R.inc(39162);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39163);new ScaledDurationField(MillisDurationField.INSTANCE, null, 10); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39164);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1u73u73lc8axezv.R.inc(39165);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39166);new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 0); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39167);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1u73u73lc8axezv.R.inc(39168);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39169);new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 1); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39170);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_getValue_long486() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vwc5i2u83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long486",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vwc5i2u83(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39171); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39172);assertEquals(0, iField.getValue(0L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39173);assertEquals(12345678 / 90, iField.getValue(12345678L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39174);assertEquals(-1234 / 90, iField.getValue(-1234L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39175);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39176);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39177);iField.getValue(LONG_INTEGER_MAX + 1L); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39178);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_getMillis_int491() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r58v10u8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int491",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r58v10u8b(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39179); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39180);assertEquals(0, iField.getMillis(0)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39181);assertEquals(1234L * 90L, iField.getMillis(1234)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39182);assertEquals(-1234L * 90L, iField.getMillis(-1234)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39183);assertEquals(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX)); 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_getValue_long_long527() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hw1u3du8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long_long527",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hw1u3du8g(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39184); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39185);assertEquals(0, iField.getValue(0L, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39186);assertEquals(12345678 / 90, iField.getValue(12345678L, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39187);assertEquals(-1234 / 90, iField.getValue(-1234L, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39188);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39189);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39190);iField.getValue(LONG_INTEGER_MAX + 1L, 567L); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39191);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_hashCode645() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12pffcmu8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_hashCode645",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12pffcmu8o(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39192); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39193);assertEquals(iField.hashCode(), iField.hashCode()); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39194);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode()); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39195);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39196);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39197);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39198);assertEquals(true, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39199);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39200);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void testSerialization729() throws Exception {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n12wjdu8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.testSerialization729",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n12wjdu8x() throws Exception{try{__CLR4_4_1u73u73lc8axezv.R.inc(39201); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39202);DurationField test = iField; 
     __CLR4_4_1u73u73lc8axezv.R.inc(39203);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39204);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39205);oos.writeObject(test); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39206);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39207);oos.close(); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39208);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39209);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39210);DurationField result = (DurationField) ois.readObject(); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39211);ois.close(); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39212);assertEquals(test, result); 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_equals1021() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15thbjlu99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_equals1021",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15thbjlu99(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39213); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39214);assertEquals(true, iField.equals(iField)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39215);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39216);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39217);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39218);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39219);assertEquals(true, iField.equals(dummy)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39220);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39221);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39222);assertEquals(false, iField.equals("")); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39223);assertEquals(false, iField.equals(null)); 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_add_long_long1084() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1acac5yu9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_long1084",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1acac5yu9k(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39224); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39225);assertEquals(567L, iField.add(567L, 0L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39226);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39227);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39228);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39229);iField.add(LONG_MAX, 1L); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39230);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1u73u73lc8axezv.R.inc(39231);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39232);iField.add(1L, LONG_MAX); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39233);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_getDifference_long_int1179() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2y7bmu9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifference_long_int1179",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2y7bmu9u(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39234); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39235);assertEquals(0, iField.getDifference(1L, 0L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39236);assertEquals(567, iField.getDifference(567L * 90L, 0L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39237);assertEquals(567 - 1234, iField.getDifference(567L * 90L, 1234L * 90L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39238);assertEquals(567 + 1234, iField.getDifference(567L * 90L, -1234L * 90L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39239);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39240);iField.getDifference(LONG_MAX, -1L); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39241);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_getMillis_long1211() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffi4q4ua2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long1211",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffi4q4ua2(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39242); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39243);assertEquals(0L, iField.getMillis(0L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39244);assertEquals(1234L * 90L, iField.getMillis(1234L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39245);assertEquals(-1234L * 90L, iField.getMillis(-1234L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39246);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39247);iField.getMillis(LONG_MAX); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39248);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_getScalar1265() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a08jekua9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getScalar1265",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a08jekua9(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39249); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39250);assertEquals(90, iField.getScalar()); 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_getMillis_long_long1319() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xy0i3kuab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long_long1319",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xy0i3kuab(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39251); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39252);assertEquals(0L, iField.getMillis(0L, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39253);assertEquals(1234L * 90L, iField.getMillis(1234L, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39254);assertEquals(-1234L * 90L, iField.getMillis(-1234L, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39255);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39256);iField.getMillis(LONG_MAX, 567L); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39257);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_getValueAsLong_long_long1608() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1veqiomuai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long_long1608",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1veqiomuai(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39258); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39259);assertEquals(0L, iField.getValueAsLong(0L, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39260);assertEquals(12345678 / 90L, iField.getValueAsLong(12345678L, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39261);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L, 567L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39262);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L, 567L)); 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_compareTo1622() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tabef3uan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_compareTo1622",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tabef3uan(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39263); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39264);assertEquals(0, iField.compareTo(iField)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39265);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39266);DurationField dummy = new PreciseDurationField(DurationFieldType.minutes(), 0); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39267);assertEquals(1, iField.compareTo(dummy)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39268);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39269);iField.compareTo(null); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39270);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long1626() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppqf6suav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifferenceAsLong_long_long1626",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppqf6suav(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39271); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39272);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39273);assertEquals(567L, iField.getDifferenceAsLong(567L * 90L, 0L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39274);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567L * 90L, 1234L * 90L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39275);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567L * 90L, -1234L * 90L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39276);try { 
         __CLR4_4_1u73u73lc8axezv.R.inc(39277);iField.getDifferenceAsLong(LONG_MAX, -1L); 
         __CLR4_4_1u73u73lc8axezv.R.inc(39278);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_toString1666() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzn7z9ub3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_toString1666",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzn7z9ub3(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39279); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39280);assertEquals("DurationField[minutes]", iField.toString()); 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 


public void test_getValueAsLong_long1667() {__CLR4_4_1u73u73lc8axezv.R.globalSliceStart(getClass().getName(),39281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4kkgeub5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u73u73lc8axezv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u73u73lc8axezv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long1667",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4kkgeub5(){try{__CLR4_4_1u73u73lc8axezv.R.inc(39281); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39282);assertEquals(0L, iField.getValueAsLong(0L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39283);assertEquals(12345678L / 90, iField.getValueAsLong(12345678L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39284);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L)); 
     __CLR4_4_1u73u73lc8axezv.R.inc(39285);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L)); 
 }finally{__CLR4_4_1u73u73lc8axezv.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
