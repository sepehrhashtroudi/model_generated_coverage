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
public class TestScaledDurationField extends TestCase {static class __CLR4_4_1shashale6qeana{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,37034,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private ScaledDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1shashale6qeana.R.inc(36910);
        __CLR4_4_1shashale6qeana.R.inc(36911);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1shashale6qeana.R.inc(36912);
        __CLR4_4_1shashale6qeana.R.inc(36913);return new TestSuite(TestScaledDurationField.class);
    }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}}

    public TestScaledDurationField(String name) {
        super(name);__CLR4_4_1shashale6qeana.R.inc(36915);try{__CLR4_4_1shashale6qeana.R.inc(36914);
    }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1shashale6qeana.R.inc(36916);
        __CLR4_4_1shashale6qeana.R.inc(36917);DurationField base = MillisDurationField.INSTANCE;
        __CLR4_4_1shashale6qeana.R.inc(36918);iField = new ScaledDurationField(base, DurationFieldType.minutes(), 90);
    }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1shashale6qeana.R.inc(36919);
        __CLR4_4_1shashale6qeana.R.inc(36920);iField = null;
    }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_hashCode271() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),36921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gdazajshl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_hashCode271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gdazajshl(){try{__CLR4_4_1shashale6qeana.R.inc(36921); 
     __CLR4_4_1shashale6qeana.R.inc(36922);assertEquals(iField.hashCode(), iField.hashCode()); 
     __CLR4_4_1shashale6qeana.R.inc(36923);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode()); 
     __CLR4_4_1shashale6qeana.R.inc(36924);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2); 
     __CLR4_4_1shashale6qeana.R.inc(36925);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1shashale6qeana.R.inc(36926);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90); 
     __CLR4_4_1shashale6qeana.R.inc(36927);assertEquals(true, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1shashale6qeana.R.inc(36928);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90); 
     __CLR4_4_1shashale6qeana.R.inc(36929);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_constructor272() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),36930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzdwrdshu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_constructor272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzdwrdshu(){try{__CLR4_4_1shashale6qeana.R.inc(36930); 
     __CLR4_4_1shashale6qeana.R.inc(36931);try { 
         __CLR4_4_1shashale6qeana.R.inc(36932);new ScaledDurationField(null, DurationFieldType.minutes(), 10); 
         __CLR4_4_1shashale6qeana.R.inc(36933);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1shashale6qeana.R.inc(36934);try { 
         __CLR4_4_1shashale6qeana.R.inc(36935);new ScaledDurationField(MillisDurationField.INSTANCE, null, 10); 
         __CLR4_4_1shashale6qeana.R.inc(36936);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1shashale6qeana.R.inc(36937);try { 
         __CLR4_4_1shashale6qeana.R.inc(36938);new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 0); 
         __CLR4_4_1shashale6qeana.R.inc(36939);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1shashale6qeana.R.inc(36940);try { 
         __CLR4_4_1shashale6qeana.R.inc(36941);new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 1); 
         __CLR4_4_1shashale6qeana.R.inc(36942);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_getValue_long273() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),36943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xmhaasi7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xmhaasi7(){try{__CLR4_4_1shashale6qeana.R.inc(36943); 
     __CLR4_4_1shashale6qeana.R.inc(36944);assertEquals(0, iField.getValue(0L)); 
     __CLR4_4_1shashale6qeana.R.inc(36945);assertEquals(12345678 / 90, iField.getValue(12345678L)); 
     __CLR4_4_1shashale6qeana.R.inc(36946);assertEquals(-1234 / 90, iField.getValue(-1234L)); 
     __CLR4_4_1shashale6qeana.R.inc(36947);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX)); 
     __CLR4_4_1shashale6qeana.R.inc(36948);try { 
         __CLR4_4_1shashale6qeana.R.inc(36949);iField.getValue(LONG_INTEGER_MAX + 1L); 
         __CLR4_4_1shashale6qeana.R.inc(36950);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_getValueAsLong_long274() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),36951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e0f3f5sif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e0f3f5sif(){try{__CLR4_4_1shashale6qeana.R.inc(36951); 
     __CLR4_4_1shashale6qeana.R.inc(36952);assertEquals(0L, iField.getValueAsLong(0L)); 
     __CLR4_4_1shashale6qeana.R.inc(36953);assertEquals(12345678L / 90, iField.getValueAsLong(12345678L)); 
     __CLR4_4_1shashale6qeana.R.inc(36954);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L)); 
     __CLR4_4_1shashale6qeana.R.inc(36955);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L)); 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_getValueAsLong_long_long275() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),36956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17b1r27sik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long_long275",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17b1r27sik(){try{__CLR4_4_1shashale6qeana.R.inc(36956); 
     __CLR4_4_1shashale6qeana.R.inc(36957);assertEquals(0L, iField.getValueAsLong(0L, 567L)); 
     __CLR4_4_1shashale6qeana.R.inc(36958);assertEquals(12345678 / 90L, iField.getValueAsLong(12345678L, 567L)); 
     __CLR4_4_1shashale6qeana.R.inc(36959);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L, 567L)); 
     __CLR4_4_1shashale6qeana.R.inc(36960);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L, 567L)); 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_getMillis_int276() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),36961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1brrqdjsip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int276",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1brrqdjsip(){try{__CLR4_4_1shashale6qeana.R.inc(36961); 
     __CLR4_4_1shashale6qeana.R.inc(36962);assertEquals(0, iField.getMillis(0)); 
     __CLR4_4_1shashale6qeana.R.inc(36963);assertEquals(1234L * 90L, iField.getMillis(1234)); 
     __CLR4_4_1shashale6qeana.R.inc(36964);assertEquals(-1234L * 90L, iField.getMillis(-1234)); 
     __CLR4_4_1shashale6qeana.R.inc(36965);assertEquals(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX)); 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_getMillis_long277() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),36966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyf6b1siu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyf6b1siu(){try{__CLR4_4_1shashale6qeana.R.inc(36966); 
     __CLR4_4_1shashale6qeana.R.inc(36967);assertEquals(0L, iField.getMillis(0L)); 
     __CLR4_4_1shashale6qeana.R.inc(36968);assertEquals(1234L * 90L, iField.getMillis(1234L)); 
     __CLR4_4_1shashale6qeana.R.inc(36969);assertEquals(-1234L * 90L, iField.getMillis(-1234L)); 
     __CLR4_4_1shashale6qeana.R.inc(36970);try { 
         __CLR4_4_1shashale6qeana.R.inc(36971);iField.getMillis(LONG_MAX); 
         __CLR4_4_1shashale6qeana.R.inc(36972);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_getMillis_int_long278() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),36973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kaom2qsj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int_long278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kaom2qsj1(){try{__CLR4_4_1shashale6qeana.R.inc(36973); 
     __CLR4_4_1shashale6qeana.R.inc(36974);assertEquals(0L, iField.getMillis(0, 567L)); 
     __CLR4_4_1shashale6qeana.R.inc(36975);assertEquals(1234L * 90L, iField.getMillis(1234, 567L)); 
     __CLR4_4_1shashale6qeana.R.inc(36976);assertEquals(-1234L * 90L, iField.getMillis(-1234, 567L)); 
     __CLR4_4_1shashale6qeana.R.inc(36977);assertEquals(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX, 567L)); 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_add_long_int279() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),36978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ic767wsj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_int279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ic767wsj6(){try{__CLR4_4_1shashale6qeana.R.inc(36978); 
     __CLR4_4_1shashale6qeana.R.inc(36979);assertEquals(567L, iField.add(567L, 0)); 
     __CLR4_4_1shashale6qeana.R.inc(36980);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234)); 
     __CLR4_4_1shashale6qeana.R.inc(36981);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234)); 
     __CLR4_4_1shashale6qeana.R.inc(36982);try { 
         __CLR4_4_1shashale6qeana.R.inc(36983);iField.add(LONG_MAX, 1); 
         __CLR4_4_1shashale6qeana.R.inc(36984);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_add_long_long280() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),36985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bav6fxsjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_long280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bav6fxsjd(){try{__CLR4_4_1shashale6qeana.R.inc(36985); 
     __CLR4_4_1shashale6qeana.R.inc(36986);assertEquals(567L, iField.add(567L, 0L)); 
     __CLR4_4_1shashale6qeana.R.inc(36987);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234L)); 
     __CLR4_4_1shashale6qeana.R.inc(36988);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234L)); 
     __CLR4_4_1shashale6qeana.R.inc(36989);try { 
         __CLR4_4_1shashale6qeana.R.inc(36990);iField.add(LONG_MAX, 1L); 
         __CLR4_4_1shashale6qeana.R.inc(36991);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1shashale6qeana.R.inc(36992);try { 
         __CLR4_4_1shashale6qeana.R.inc(36993);iField.add(1L, LONG_MAX); 
         __CLR4_4_1shashale6qeana.R.inc(36994);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_getDifference_long_int281() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),36995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eas7t9sjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifference_long_int281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eas7t9sjn(){try{__CLR4_4_1shashale6qeana.R.inc(36995); 
     __CLR4_4_1shashale6qeana.R.inc(36996);assertEquals(0, iField.getDifference(1L, 0L)); 
     __CLR4_4_1shashale6qeana.R.inc(36997);assertEquals(567, iField.getDifference(567L * 90L, 0L)); 
     __CLR4_4_1shashale6qeana.R.inc(36998);assertEquals(567 - 1234, iField.getDifference(567L * 90L, 1234L * 90L)); 
     __CLR4_4_1shashale6qeana.R.inc(36999);assertEquals(567 + 1234, iField.getDifference(567L * 90L, -1234L * 90L)); 
     __CLR4_4_1shashale6qeana.R.inc(37000);try { 
         __CLR4_4_1shashale6qeana.R.inc(37001);iField.getDifference(LONG_MAX, -1L); 
         __CLR4_4_1shashale6qeana.R.inc(37002);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long282() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),37003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1su365bsjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifferenceAsLong_long_long282",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1su365bsjv(){try{__CLR4_4_1shashale6qeana.R.inc(37003); 
     __CLR4_4_1shashale6qeana.R.inc(37004);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L)); 
     __CLR4_4_1shashale6qeana.R.inc(37005);assertEquals(567L, iField.getDifferenceAsLong(567L * 90L, 0L)); 
     __CLR4_4_1shashale6qeana.R.inc(37006);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567L * 90L, 1234L * 90L)); 
     __CLR4_4_1shashale6qeana.R.inc(37007);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567L * 90L, -1234L * 90L)); 
     __CLR4_4_1shashale6qeana.R.inc(37008);try { 
         __CLR4_4_1shashale6qeana.R.inc(37009);iField.getDifferenceAsLong(LONG_MAX, -1L); 
         __CLR4_4_1shashale6qeana.R.inc(37010);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_compareTo283() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),37011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1awxiinsk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_compareTo283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1awxiinsk3(){try{__CLR4_4_1shashale6qeana.R.inc(37011); 
     __CLR4_4_1shashale6qeana.R.inc(37012);assertEquals(0, iField.compareTo(iField)); 
     __CLR4_4_1shashale6qeana.R.inc(37013);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1shashale6qeana.R.inc(37014);DurationField dummy = new PreciseDurationField(DurationFieldType.minutes(), 0); 
     __CLR4_4_1shashale6qeana.R.inc(37015);assertEquals(1, iField.compareTo(dummy)); 
     __CLR4_4_1shashale6qeana.R.inc(37016);try { 
         __CLR4_4_1shashale6qeana.R.inc(37017);iField.compareTo(null); 
         __CLR4_4_1shashale6qeana.R.inc(37018);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_getScalar284() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),37019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111bghsskb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getScalar284",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111bghsskb(){try{__CLR4_4_1shashale6qeana.R.inc(37019); 
     __CLR4_4_1shashale6qeana.R.inc(37020);assertEquals(90, iField.getScalar()); 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_equals285() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),37021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cum3nuskd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_equals285",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cum3nuskd(){try{__CLR4_4_1shashale6qeana.R.inc(37021); 
     __CLR4_4_1shashale6qeana.R.inc(37022);assertEquals(true, iField.equals(iField)); 
     __CLR4_4_1shashale6qeana.R.inc(37023);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1shashale6qeana.R.inc(37024);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2); 
     __CLR4_4_1shashale6qeana.R.inc(37025);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1shashale6qeana.R.inc(37026);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90); 
     __CLR4_4_1shashale6qeana.R.inc(37027);assertEquals(true, iField.equals(dummy)); 
     __CLR4_4_1shashale6qeana.R.inc(37028);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90); 
     __CLR4_4_1shashale6qeana.R.inc(37029);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1shashale6qeana.R.inc(37030);assertEquals(false, iField.equals("")); 
     __CLR4_4_1shashale6qeana.R.inc(37031);assertEquals(false, iField.equals(null)); 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 


public void test_toString296() {__CLR4_4_1shashale6qeana.R.globalSliceStart(getClass().getName(),37032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrhs3sko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shashale6qeana.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shashale6qeana.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_toString296",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrhs3sko(){try{__CLR4_4_1shashale6qeana.R.inc(37032); 
     __CLR4_4_1shashale6qeana.R.inc(37033);assertEquals("DurationField[minutes]", iField.toString()); 
 }finally{__CLR4_4_1shashale6qeana.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
