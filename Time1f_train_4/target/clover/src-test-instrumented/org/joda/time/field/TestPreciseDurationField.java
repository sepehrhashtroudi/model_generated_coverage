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
public class TestPreciseDurationField extends TestCase {static class __CLR4_4_1sggsggle6rjdle{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,36978,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private PreciseDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1sggsggle6rjdle.R.inc(36880);
        __CLR4_4_1sggsggle6rjdle.R.inc(36881);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1sggsggle6rjdle.R.inc(36882);
        __CLR4_4_1sggsggle6rjdle.R.inc(36883);return new TestSuite(TestPreciseDurationField.class);
    }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}}

    public TestPreciseDurationField(String name) {
        super(name);__CLR4_4_1sggsggle6rjdle.R.inc(36885);try{__CLR4_4_1sggsggle6rjdle.R.inc(36884);
    }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1sggsggle6rjdle.R.inc(36886);
        __CLR4_4_1sggsggle6rjdle.R.inc(36887);iField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
    }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1sggsggle6rjdle.R.inc(36888);
        __CLR4_4_1sggsggle6rjdle.R.inc(36889);iField = null;
    }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getValue_long302() {__CLR4_4_1sggsggle6rjdle.R.globalSliceStart(getClass().getName(),36890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13m3nrdsgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sggsggle6rjdle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sggsggle6rjdle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long302",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13m3nrdsgq(){try{__CLR4_4_1sggsggle6rjdle.R.inc(36890); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36891);assertEquals(0, iField.getValue(0L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36892);assertEquals(12345, iField.getValue(12345678L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36893);assertEquals(-1, iField.getValue(-1234L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36894);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36895);try { 
         __CLR4_4_1sggsggle6rjdle.R.inc(36896);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L); 
         __CLR4_4_1sggsggle6rjdle.R.inc(36897);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}} 


public void test_getValueAsLong_long303() {__CLR4_4_1sggsggle6rjdle.R.globalSliceStart(getClass().getName(),36898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dow9w8sgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sggsggle6rjdle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sggsggle6rjdle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValueAsLong_long303",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dow9w8sgy(){try{__CLR4_4_1sggsggle6rjdle.R.inc(36898); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36899);assertEquals(0L, iField.getValueAsLong(0L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36900);assertEquals(12345L, iField.getValueAsLong(12345678L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36901);assertEquals(-1L, iField.getValueAsLong(-1234L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36902);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 1000L + 1000L)); 
 }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}} 


public void test_getValue_long_long304() {__CLR4_4_1sggsggle6rjdle.R.globalSliceStart(getClass().getName(),36903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o05kc6sh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sggsggle6rjdle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sggsggle6rjdle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long_long304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o05kc6sh3(){try{__CLR4_4_1sggsggle6rjdle.R.inc(36903); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36904);assertEquals(0, iField.getValue(0L, 567L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36905);assertEquals(12345, iField.getValue(12345678L, 567L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36906);assertEquals(-1, iField.getValue(-1234L, 567L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36907);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L, 567L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36908);try { 
         __CLR4_4_1sggsggle6rjdle.R.inc(36909);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L, 567L); 
         __CLR4_4_1sggsggle6rjdle.R.inc(36910);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}} 


public void test_compareTo434() {__CLR4_4_1sggsggle6rjdle.R.globalSliceStart(getClass().getName(),36911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igpc7rshb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sggsggle6rjdle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sggsggle6rjdle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_compareTo434",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igpc7rshb(){try{__CLR4_4_1sggsggle6rjdle.R.inc(36911); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36912);assertEquals(0, iField.compareTo(iField)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36913);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36914);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36915);assertEquals(1, iField.compareTo(dummy)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36916);try { 
         __CLR4_4_1sggsggle6rjdle.R.inc(36917);iField.compareTo(null); 
         __CLR4_4_1sggsggle6rjdle.R.inc(36918);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}} 


public void test_isPrecise435() {__CLR4_4_1sggsggle6rjdle.R.globalSliceStart(getClass().getName(),36919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1asyv95shj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sggsggle6rjdle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sggsggle6rjdle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_isPrecise435",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1asyv95shj(){try{__CLR4_4_1sggsggle6rjdle.R.inc(36919); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36920);assertEquals(true, iField.isPrecise()); 
 }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}} 


public void test_getMillis_int_long436() {__CLR4_4_1sggsggle6rjdle.R.globalSliceStart(getClass().getName(),36921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vlflqshl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sggsggle6rjdle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sggsggle6rjdle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_int_long436",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vlflqshl(){try{__CLR4_4_1sggsggle6rjdle.R.inc(36921); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36922);assertEquals(0L, iField.getMillis(0, 567L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36923);assertEquals(1234000L, iField.getMillis(1234, 567L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36924);assertEquals(-1234000L, iField.getMillis(-1234, 567L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36925);assertEquals(LONG_INTEGER_MAX * 1000L, iField.getMillis(INTEGER_MAX, 567L)); 
 }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}} 


public void test_getMillis_long_long437() {__CLR4_4_1sggsggle6rjdle.R.globalSliceStart(getClass().getName(),36926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uiakc0shq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sggsggle6rjdle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sggsggle6rjdle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_long_long437",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uiakc0shq(){try{__CLR4_4_1sggsggle6rjdle.R.inc(36926); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36927);assertEquals(0L, iField.getMillis(0L, 567L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36928);assertEquals(1234000L, iField.getMillis(1234L, 567L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36929);assertEquals(-1234000L, iField.getMillis(-1234L, 567L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36930);try { 
         __CLR4_4_1sggsggle6rjdle.R.inc(36931);iField.getMillis(LONG_MAX, 567L); 
         __CLR4_4_1sggsggle6rjdle.R.inc(36932);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}} 


public void test_add_long_int438() {__CLR4_4_1sggsggle6rjdle.R.globalSliceStart(getClass().getName(),36933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12o40yfshx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sggsggle6rjdle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sggsggle6rjdle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_int438",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12o40yfshx(){try{__CLR4_4_1sggsggle6rjdle.R.inc(36933); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36934);assertEquals(567L, iField.add(567L, 0)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36935);assertEquals(567L + 1234000L, iField.add(567L, 1234)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36936);assertEquals(567L - 1234000L, iField.add(567L, -1234)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36937);try { 
         __CLR4_4_1sggsggle6rjdle.R.inc(36938);iField.add(LONG_MAX, 1); 
         __CLR4_4_1sggsggle6rjdle.R.inc(36939);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}} 


public void test_add_long_long439() {__CLR4_4_1sggsggle6rjdle.R.globalSliceStart(getClass().getName(),36940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tr332lsi4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sggsggle6rjdle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sggsggle6rjdle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_long439",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tr332lsi4(){try{__CLR4_4_1sggsggle6rjdle.R.inc(36940); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36941);assertEquals(567L, iField.add(567L, 0L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36942);assertEquals(567L + 1234000L, iField.add(567L, 1234L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36943);assertEquals(567L - 1234000L, iField.add(567L, -1234L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36944);try { 
         __CLR4_4_1sggsggle6rjdle.R.inc(36945);iField.add(LONG_MAX, 1L); 
         __CLR4_4_1sggsggle6rjdle.R.inc(36946);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1sggsggle6rjdle.R.inc(36947);try { 
         __CLR4_4_1sggsggle6rjdle.R.inc(36948);iField.add(1L, LONG_MAX); 
         __CLR4_4_1sggsggle6rjdle.R.inc(36949);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long440() {__CLR4_4_1sggsggle6rjdle.R.globalSliceStart(getClass().getName(),36950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1trxpctsie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sggsggle6rjdle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sggsggle6rjdle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getDifferenceAsLong_long_long440",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1trxpctsie(){try{__CLR4_4_1sggsggle6rjdle.R.inc(36950); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36951);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36952);assertEquals(567L, iField.getDifferenceAsLong(567000L, 0L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36953);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567000L, 1234000L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36954);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567000L, -1234000L)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36955);try { 
         __CLR4_4_1sggsggle6rjdle.R.inc(36956);iField.getDifferenceAsLong(LONG_MAX, -1L); 
         __CLR4_4_1sggsggle6rjdle.R.inc(36957);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}} 


public void test_equals441() {__CLR4_4_1sggsggle6rjdle.R.globalSliceStart(getClass().getName(),36958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1irpcjwsim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sggsggle6rjdle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sggsggle6rjdle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_equals441",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1irpcjwsim(){try{__CLR4_4_1sggsggle6rjdle.R.inc(36958); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36959);assertEquals(true, iField.equals(iField)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36960);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36961);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36962);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36963);dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36964);assertEquals(true, iField.equals(dummy)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36965);dummy = new PreciseDurationField(DurationFieldType.millis(), 1000); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36966);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36967);assertEquals(false, iField.equals("")); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36968);assertEquals(false, iField.equals(null)); 
 }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}} 


public void test_hashCode442() {__CLR4_4_1sggsggle6rjdle.R.globalSliceStart(getClass().getName(),36969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12rv3ansix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sggsggle6rjdle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sggsggle6rjdle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_hashCode442",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12rv3ansix(){try{__CLR4_4_1sggsggle6rjdle.R.inc(36969); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36970);assertEquals(true, iField.hashCode() == iField.hashCode()); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36971);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode()); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36972);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36973);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36974);dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36975);assertEquals(true, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36976);dummy = new PreciseDurationField(DurationFieldType.millis(), 1000); 
     __CLR4_4_1sggsggle6rjdle.R.inc(36977);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
 }finally{__CLR4_4_1sggsggle6rjdle.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
