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
public class TestScaledDurationField extends TestCase {static class __CLR4_4_1lltlltle6o7adl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,28050,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private ScaledDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1lltlltle6o7adl.R.inc(28001);
        __CLR4_4_1lltlltle6o7adl.R.inc(28002);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lltlltle6o7adl.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lltlltle6o7adl.R.inc(28003);
        __CLR4_4_1lltlltle6o7adl.R.inc(28004);return new TestSuite(TestScaledDurationField.class);
    }finally{__CLR4_4_1lltlltle6o7adl.R.flushNeeded();}}

    public TestScaledDurationField(String name) {
        super(name);__CLR4_4_1lltlltle6o7adl.R.inc(28006);try{__CLR4_4_1lltlltle6o7adl.R.inc(28005);
    }finally{__CLR4_4_1lltlltle6o7adl.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lltlltle6o7adl.R.inc(28007);
        __CLR4_4_1lltlltle6o7adl.R.inc(28008);DurationField base = MillisDurationField.INSTANCE;
        __CLR4_4_1lltlltle6o7adl.R.inc(28009);iField = new ScaledDurationField(base, DurationFieldType.minutes(), 90);
    }finally{__CLR4_4_1lltlltle6o7adl.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lltlltle6o7adl.R.inc(28010);
        __CLR4_4_1lltlltle6o7adl.R.inc(28011);iField = null;
    }finally{__CLR4_4_1lltlltle6o7adl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_compareTo121() {__CLR4_4_1lltlltle6o7adl.R.globalSliceStart(getClass().getName(),28012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ji3zfolm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lltlltle6o7adl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lltlltle6o7adl.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_compareTo121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ji3zfolm4(){try{__CLR4_4_1lltlltle6o7adl.R.inc(28012); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28013);assertEquals(0, iField.compareTo(iField)); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28014);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28015);DurationField dummy = new PreciseDurationField(DurationFieldType.minutes(), 0); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28016);assertEquals(1, iField.compareTo(dummy)); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28017);try { 
         __CLR4_4_1lltlltle6o7adl.R.inc(28018);iField.compareTo(null); 
         __CLR4_4_1lltlltle6o7adl.R.inc(28019);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1lltlltle6o7adl.R.flushNeeded();}}
public void test_getMillis_int122() {__CLR4_4_1lltlltle6o7adl.R.globalSliceStart(getClass().getName(),28020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5zbfrlmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lltlltle6o7adl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lltlltle6o7adl.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int122",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5zbfrlmc(){try{__CLR4_4_1lltlltle6o7adl.R.inc(28020); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28021);assertEquals(0L, iField.getMillis(0)); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28022);assertEquals(1234L * 90L, iField.getMillis(1234)); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28023);assertEquals(-1234L * 90L, iField.getMillis(-1234)); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28024);try { 
         __CLR4_4_1lltlltle6o7adl.R.inc(28025);iField.getMillis(999999); 
         __CLR4_4_1lltlltle6o7adl.R.inc(28026);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lltlltle6o7adl.R.flushNeeded();}}
public void test_getMillis_int123() {__CLR4_4_1lltlltle6o7adl.R.globalSliceStart(getClass().getName(),28027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwzcnalmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lltlltle6o7adl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lltlltle6o7adl.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwzcnalmj(){try{__CLR4_4_1lltlltle6o7adl.R.inc(28027); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28028);assertEquals(0L, iField.getMillis(0)); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28029);assertEquals(1234L * 90L, iField.getMillis(1234)); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28030);assertEquals(-1234L * 90L, iField.getMillis(-1234)); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28031);try { 
         __CLR4_4_1lltlltle6o7adl.R.inc(28032);iField.getMillis(LONG_MAX); 
         __CLR4_4_1lltlltle6o7adl.R.inc(28033);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lltlltle6o7adl.R.flushNeeded();}}
public void test_getMillis_int_long124() {__CLR4_4_1lltlltle6o7adl.R.globalSliceStart(getClass().getName(),28034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xc7uu6lmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lltlltle6o7adl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lltlltle6o7adl.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int_long124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xc7uu6lmq(){try{__CLR4_4_1lltlltle6o7adl.R.inc(28034); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28035);assertEquals(0L, iField.getMillis(0, 567L)); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28036);assertEquals(1234L * 90L, iField.getMillis(1234, 567L)); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28037);assertEquals(-1234L * 90L, iField.getMillis(-1234, 567L)); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28038);try { 
         __CLR4_4_1lltlltle6o7adl.R.inc(28039);iField.getMillis(LONG_MAX, 567L); 
         __CLR4_4_1lltlltle6o7adl.R.inc(28040);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lltlltle6o7adl.R.flushNeeded();}}
public void test_hashCode125() {__CLR4_4_1lltlltle6o7adl.R.globalSliceStart(getClass().getName(),28041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oz34k3lmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lltlltle6o7adl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lltlltle6o7adl.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_hashCode125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oz34k3lmx(){try{__CLR4_4_1lltlltle6o7adl.R.inc(28041); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28042);assertEquals(true, iField.hashCode() == iField.hashCode()); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28043);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode()); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28044);DurationField dummy = new PreciseDurationField(DurationFieldType.minutes(), 0); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28045);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28046);dummy = new PreciseDurationField(DurationFieldType.minutes(), 90); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28047);assertEquals(true, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28048);dummy = new PreciseDurationField(DurationFieldType.millis(), 90); 
     __CLR4_4_1lltlltle6o7adl.R.inc(28049);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
 }finally{__CLR4_4_1lltlltle6o7adl.R.flushNeeded();}}
    

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
