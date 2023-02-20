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
public class TestScaledDurationField extends TestCase {static class __CLR4_4_1m6jm6jle6ndq4e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,28784,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private ScaledDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1m6jm6jle6ndq4e.R.inc(28747);
        __CLR4_4_1m6jm6jle6ndq4e.R.inc(28748);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m6jm6jle6ndq4e.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m6jm6jle6ndq4e.R.inc(28749);
        __CLR4_4_1m6jm6jle6ndq4e.R.inc(28750);return new TestSuite(TestScaledDurationField.class);
    }finally{__CLR4_4_1m6jm6jle6ndq4e.R.flushNeeded();}}

    public TestScaledDurationField(String name) {
        super(name);__CLR4_4_1m6jm6jle6ndq4e.R.inc(28752);try{__CLR4_4_1m6jm6jle6ndq4e.R.inc(28751);
    }finally{__CLR4_4_1m6jm6jle6ndq4e.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m6jm6jle6ndq4e.R.inc(28753);
        __CLR4_4_1m6jm6jle6ndq4e.R.inc(28754);DurationField base = MillisDurationField.INSTANCE;
        __CLR4_4_1m6jm6jle6ndq4e.R.inc(28755);iField = new ScaledDurationField(base, DurationFieldType.minutes(), 90);
    }finally{__CLR4_4_1m6jm6jle6ndq4e.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m6jm6jle6ndq4e.R.inc(28756);
        __CLR4_4_1m6jm6jle6ndq4e.R.inc(28757);iField = null;
    }finally{__CLR4_4_1m6jm6jle6ndq4e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_getValue_long_long101() {__CLR4_4_1m6jm6jle6ndq4e.R.globalSliceStart(getClass().getName(),28758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iiv1oxm6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m6jm6jle6ndq4e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m6jm6jle6ndq4e.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long_long101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iiv1oxm6u(){try{__CLR4_4_1m6jm6jle6ndq4e.R.inc(28758); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28759);assertEquals(0, iField.getValue(0L, 567L)); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28760);assertEquals(12345678 / 90, iField.getValue(12345678L, 567L)); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28761);assertEquals(-1234 / 90, iField.getValue(-1234L, 567L)); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28762);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX * 90L + 999L, 567L)); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28763);try { 
         __CLR4_4_1m6jm6jle6ndq4e.R.inc(28764);iField.getValue(LONG_INTEGER_MAX * 90L + 1000L, 567L); 
         __CLR4_4_1m6jm6jle6ndq4e.R.inc(28765);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1m6jm6jle6ndq4e.R.flushNeeded();}}
public void test_getMillis_long_long102() {__CLR4_4_1m6jm6jle6ndq4e.R.globalSliceStart(getClass().getName(),28766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12je5bfm72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m6jm6jle6ndq4e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m6jm6jle6ndq4e.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long_long102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12je5bfm72(){try{__CLR4_4_1m6jm6jle6ndq4e.R.inc(28766); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28767);assertEquals(0L, iField.getMillis(0L, 567L)); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28768);assertEquals(1234L * 90L, iField.getMillis(1234L, 567L)); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28769);assertEquals(-1234L * 90L, iField.getMillis(-1234L, 567L)); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28770);try { 
         __CLR4_4_1m6jm6jle6ndq4e.R.inc(28771);iField.getMillis(LONG_MAX, 567L); 
         __CLR4_4_1m6jm6jle6ndq4e.R.inc(28772);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1m6jm6jle6ndq4e.R.flushNeeded();}}
public void test_equals103() {__CLR4_4_1m6jm6jle6ndq4e.R.globalSliceStart(getClass().getName(),28773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g627gxm79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m6jm6jle6ndq4e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m6jm6jle6ndq4e.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_equals103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g627gxm79(){try{__CLR4_4_1m6jm6jle6ndq4e.R.inc(28773); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28774);assertEquals(true, iField.equals(iField)); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28775);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28776);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28777);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28778);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28779);assertEquals(true, iField.equals(dummy)); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28780);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28781);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28782);assertEquals(false, iField.equals("")); 
     __CLR4_4_1m6jm6jle6ndq4e.R.inc(28783);assertEquals(false, iField.equals(null)); 
 }finally{__CLR4_4_1m6jm6jle6ndq4e.R.flushNeeded();}}
    

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
