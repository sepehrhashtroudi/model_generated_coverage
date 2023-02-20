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
public class TestScaledDurationField extends TestCase {static class __CLR4_4_1lnblnble6np4uh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,28100,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private ScaledDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1lnblnble6np4uh.R.inc(28055);
        __CLR4_4_1lnblnble6np4uh.R.inc(28056);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lnblnble6np4uh.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lnblnble6np4uh.R.inc(28057);
        __CLR4_4_1lnblnble6np4uh.R.inc(28058);return new TestSuite(TestScaledDurationField.class);
    }finally{__CLR4_4_1lnblnble6np4uh.R.flushNeeded();}}

    public TestScaledDurationField(String name) {
        super(name);__CLR4_4_1lnblnble6np4uh.R.inc(28060);try{__CLR4_4_1lnblnble6np4uh.R.inc(28059);
    }finally{__CLR4_4_1lnblnble6np4uh.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lnblnble6np4uh.R.inc(28061);
        __CLR4_4_1lnblnble6np4uh.R.inc(28062);DurationField base = MillisDurationField.INSTANCE;
        __CLR4_4_1lnblnble6np4uh.R.inc(28063);iField = new ScaledDurationField(base, DurationFieldType.minutes(), 90);
    }finally{__CLR4_4_1lnblnble6np4uh.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lnblnble6np4uh.R.inc(28064);
        __CLR4_4_1lnblnble6np4uh.R.inc(28065);iField = null;
    }finally{__CLR4_4_1lnblnble6np4uh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_constructor99() {__CLR4_4_1lnblnble6np4uh.R.globalSliceStart(getClass().getName(),28066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgedeclnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lnblnble6np4uh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lnblnble6np4uh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_constructor99",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgedeclnm(){try{__CLR4_4_1lnblnble6np4uh.R.inc(28066); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28067);DurationField field = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28068);assertEquals(DurationFieldType.minutes(), field.getType()); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28069);try { 
         __CLR4_4_1lnblnble6np4uh.R.inc(28070);field = new ScaledDurationField(null, DurationFieldType.minutes(), 0); 
         __CLR4_4_1lnblnble6np4uh.R.inc(28071);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lnblnble6np4uh.R.inc(28072);try { 
         __CLR4_4_1lnblnble6np4uh.R.inc(28073);field = new ScaledDurationField(MillisDurationField.INSTANCE, null, 90); 
         __CLR4_4_1lnblnble6np4uh.R.inc(28074);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lnblnble6np4uh.R.inc(28075);try { 
         __CLR4_4_1lnblnble6np4uh.R.inc(28076);field = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90); 
         __CLR4_4_1lnblnble6np4uh.R.inc(28077);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lnblnble6np4uh.R.flushNeeded();}}
public void test_getValueAsLong_long100() {__CLR4_4_1lnblnble6np4uh.R.globalSliceStart(getClass().getName(),28078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_187lr8zlny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lnblnble6np4uh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lnblnble6np4uh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_187lr8zlny(){try{__CLR4_4_1lnblnble6np4uh.R.inc(28078); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28079);assertEquals(0L, iField.getValueAsLong(0L)); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28080);assertEquals(12345678 / 90L, iField.getValueAsLong(12345678L)); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28081);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L)); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28082);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L)); 
 }finally{__CLR4_4_1lnblnble6np4uh.R.flushNeeded();}}
public void test_add_long_int101() {__CLR4_4_1lnblnble6np4uh.R.globalSliceStart(getClass().getName(),28083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xw3of6lo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lnblnble6np4uh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lnblnble6np4uh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_int101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xw3of6lo3(){try{__CLR4_4_1lnblnble6np4uh.R.inc(28083); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28084);assertEquals(567L, iField.add(567L, 0)); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28085);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234)); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28086);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234)); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28087);try { 
         __CLR4_4_1lnblnble6np4uh.R.inc(28088);iField.add(LONG_MAX, 1); 
         __CLR4_4_1lnblnble6np4uh.R.inc(28089);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1lnblnble6np4uh.R.inc(28090);try { 
         __CLR4_4_1lnblnble6np4uh.R.inc(28091);iField.add(1L, LONG_MAX); 
         __CLR4_4_1lnblnble6np4uh.R.inc(28092);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lnblnble6np4uh.R.flushNeeded();}}
public void test_add_long_int102() {__CLR4_4_1lnblnble6np4uh.R.globalSliceStart(getClass().getName(),28093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xw0erhlod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lnblnble6np4uh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lnblnble6np4uh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_int102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xw0erhlod(){try{__CLR4_4_1lnblnble6np4uh.R.inc(28093); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28094);assertEquals(567L, iField.add(567L, 0)); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28095);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234)); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28096);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234)); 
     __CLR4_4_1lnblnble6np4uh.R.inc(28097);try { 
         __CLR4_4_1lnblnble6np4uh.R.inc(28098);iField.add(LONG_MAX, 1); 
         __CLR4_4_1lnblnble6np4uh.R.inc(28099);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lnblnble6np4uh.R.flushNeeded();}}
    

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
