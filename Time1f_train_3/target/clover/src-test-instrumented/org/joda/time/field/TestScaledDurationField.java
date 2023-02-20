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
public class TestScaledDurationField extends TestCase {static class __CLR4_4_1sfysfyle6rcmyu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,36986,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private ScaledDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36862);
        __CLR4_4_1sfysfyle6rcmyu.R.inc(36863);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36864);
        __CLR4_4_1sfysfyle6rcmyu.R.inc(36865);return new TestSuite(TestScaledDurationField.class);
    }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}}

    public TestScaledDurationField(String name) {
        super(name);__CLR4_4_1sfysfyle6rcmyu.R.inc(36867);try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36866);
    }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36868);
        __CLR4_4_1sfysfyle6rcmyu.R.inc(36869);DurationField base = MillisDurationField.INSTANCE;
        __CLR4_4_1sfysfyle6rcmyu.R.inc(36870);iField = new ScaledDurationField(base, DurationFieldType.minutes(), 90);
    }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36871);
        __CLR4_4_1sfysfyle6rcmyu.R.inc(36872);iField = null;
    }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_hashCode282() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loy7clsg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_hashCode282",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loy7clsg9(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36873); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36874);assertEquals(iField.hashCode(), iField.hashCode()); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36875);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode()); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36876);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36877);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36878);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36879);assertEquals(true, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36880);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36881);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_getValue_long283() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xnhdttsgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xnhdttsgi(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36882); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36883);assertEquals(0, iField.getValue(0L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36884);assertEquals(12345678 / 90, iField.getValue(12345678L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36885);assertEquals(-1234 / 90, iField.getValue(-1234L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36886);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36887);try { 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36888);iField.getValue(LONG_INTEGER_MAX + 1L); 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36889);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_getValue_long_long284() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8kqczsgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long_long284",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8kqczsgq(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36890); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36891);assertEquals(0, iField.getValue(0L, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36892);assertEquals(12345678 / 90, iField.getValue(12345678L, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36893);assertEquals(-1234 / 90, iField.getValue(-1234L, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36894);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36895);try { 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36896);iField.getValue(LONG_INTEGER_MAX + 1L, 567L); 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36897);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_getValueAsLong_long_long285() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1met5hcsgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long_long285",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1met5hcsgy(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36898); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36899);assertEquals(0L, iField.getValueAsLong(0L, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36900);assertEquals(12345678 / 90L, iField.getValueAsLong(12345678L, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36901);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36902);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L, 567L)); 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_getMillis_int286() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hy3660sh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hy3660sh3(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36903); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36904);assertEquals(0, iField.getMillis(0)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36905);assertEquals(1234L * 90L, iField.getMillis(1234)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36906);assertEquals(-1234L * 90L, iField.getMillis(-1234)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36907);assertEquals(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX)); 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_getMillis_long287() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sctz4ksh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long287",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sctz4ksh8(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36908); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36909);assertEquals(0L, iField.getMillis(0L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36910);assertEquals(1234L * 90L, iField.getMillis(1234L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36911);assertEquals(-1234L * 90L, iField.getMillis(-1234L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36912);try { 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36913);iField.getMillis(LONG_MAX); 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36914);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_getMillis_int_long288() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19f6agtshf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int_long288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19f6agtshf(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36915); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36916);assertEquals(0L, iField.getMillis(0, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36917);assertEquals(1234L * 90L, iField.getMillis(1234, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36918);assertEquals(-1234L * 90L, iField.getMillis(-1234, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36919);assertEquals(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX, 567L)); 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_getMillis_long_long289() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n81rklshk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long_long289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n81rklshk(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36920); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36921);assertEquals(0L, iField.getMillis(0L, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36922);assertEquals(1234L * 90L, iField.getMillis(1234L, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36923);assertEquals(-1234L * 90L, iField.getMillis(-1234L, 567L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36924);try { 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36925);iField.getMillis(LONG_MAX, 567L); 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36926);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_add_long_long290() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u0dyzoshr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_long290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u0dyzoshr(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36927); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36928);assertEquals(567L, iField.add(567L, 0L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36929);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36930);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36931);try { 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36932);iField.add(LONG_MAX, 1L); 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36933);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36934);try { 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36935);iField.add(1L, LONG_MAX); 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36936);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_getDifference_long_int291() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0gxmcsi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifference_long_int291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0gxmcsi1(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36937); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36938);assertEquals(0, iField.getDifference(1L, 0L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36939);assertEquals(567, iField.getDifference(567L * 90L, 0L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36940);assertEquals(567 - 1234, iField.getDifference(567L * 90L, 1234L * 90L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36941);assertEquals(567 + 1234, iField.getDifference(567L * 90L, -1234L * 90L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36942);try { 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36943);iField.getDifference(LONG_MAX, -1L); 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36944);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long292() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ch5zaasi9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifferenceAsLong_long_long292",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ch5zaasi9(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36945); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36946);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36947);assertEquals(567L, iField.getDifferenceAsLong(567L * 90L, 0L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36948);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567L * 90L, 1234L * 90L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36949);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567L * 90L, -1234L * 90L)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36950);try { 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36951);iField.getDifferenceAsLong(LONG_MAX, -1L); 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36952);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_compareTo293() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1isxe0wsih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_compareTo293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1isxe0wsih(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36953); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36954);assertEquals(0, iField.compareTo(iField)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36955);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36956);DurationField dummy = new PreciseDurationField(DurationFieldType.minutes(), 0); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36957);assertEquals(1, iField.compareTo(dummy)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36958);try { 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36959);iField.compareTo(null); 
         __CLR4_4_1sfysfyle6rcmyu.R.inc(36960);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_getScalar294() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ur6d1bsip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getScalar294",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ur6d1bsip(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36961); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36962);assertEquals(90, iField.getScalar()); 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void testSerialization295() throws Exception {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uf55ihsir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.testSerialization295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uf55ihsir() throws Exception{try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36963); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36964);DurationField test = iField; 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36965);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36966);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36967);oos.writeObject(test); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36968);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36969);oos.close(); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36970);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36971);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36972);DurationField result = (DurationField) ois.readObject(); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36973);ois.close(); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36974);assertEquals(test, result); 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 


public void test_equals296() {__CLR4_4_1sfysfyle6rcmyu.R.globalSliceStart(getClass().getName(),36975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p7n2zasj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sfysfyle6rcmyu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sfysfyle6rcmyu.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_equals296",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p7n2zasj3(){try{__CLR4_4_1sfysfyle6rcmyu.R.inc(36975); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36976);assertEquals(true, iField.equals(iField)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36977);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36978);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36979);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36980);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36981);assertEquals(true, iField.equals(dummy)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36982);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36983);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36984);assertEquals(false, iField.equals("")); 
     __CLR4_4_1sfysfyle6rcmyu.R.inc(36985);assertEquals(false, iField.equals(null)); 
 }finally{__CLR4_4_1sfysfyle6rcmyu.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
