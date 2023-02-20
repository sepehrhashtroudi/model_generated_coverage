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
public class TestMillisDurationField extends TestCase {static class __CLR4_4_1s4qs4qle6rjdk7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,36531,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36458);
        __CLR4_4_1s4qs4qle6rjdk7.R.inc(36459);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36460);
        __CLR4_4_1s4qs4qle6rjdk7.R.inc(36461);return new TestSuite(TestMillisDurationField.class);
    }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}}

    public TestMillisDurationField(String name) {
        super(name);__CLR4_4_1s4qs4qle6rjdk7.R.inc(36463);try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36462);
    }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36464);
    }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36465);
    }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getType1356() {__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceStart(getClass().getName(),36466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w16nv1s4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4qs4qle6rjdk7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getType1356",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w16nv1s4y(){try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36466); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36467);assertEquals(DurationFieldType.millis(), MillisDurationField.INSTANCE.getType()); 
 }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}} 


public void test_isSupported1357() {__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceStart(getClass().getName(),36468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170mxums50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4qs4qle6rjdk7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_isSupported1357",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170mxums50(){try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36468); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36469);assertEquals(true, MillisDurationField.INSTANCE.isSupported()); 
 }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}} 


public void test_compareTo1358() {__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceStart(getClass().getName(),36470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12a7vfjs52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4qs4qle6rjdk7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_compareTo1358",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12a7vfjs52(){try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36470); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36471);assertEquals(0, MillisDurationField.INSTANCE.compareTo(MillisDurationField.INSTANCE)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36472);assertEquals(-1, MillisDurationField.INSTANCE.compareTo(ISOChronology.getInstance().seconds())); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36473);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36474);assertEquals(1, MillisDurationField.INSTANCE.compareTo(dummy)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36475);try { 
         __CLR4_4_1s4qs4qle6rjdk7.R.inc(36476);MillisDurationField.INSTANCE.compareTo(null); 
         __CLR4_4_1s4qs4qle6rjdk7.R.inc(36477);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}} 


public void test_getValueAsLong_long1359() {__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceStart(getClass().getName(),36478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxvgtqs5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4qs4qle6rjdk7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValueAsLong_long1359",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxvgtqs5a(){try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36478); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36479);assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36480);assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36481);assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36482);assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L)); 
 }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}} 


public void test_getValue_long_long1360() {__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceStart(getClass().getName(),36483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1smbe45s5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4qs4qle6rjdk7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long_long1360",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1smbe45s5f(){try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36483); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36484);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L, 567L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36485);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L, 567L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36486);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L, 567L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36487);try { 
         __CLR4_4_1s4qs4qle6rjdk7.R.inc(36488);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L, 567L); 
         __CLR4_4_1s4qs4qle6rjdk7.R.inc(36489);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}} 


public void test_getValueAsLong_long_long1361() {__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceStart(getClass().getName(),36490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bi8wbqs5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4qs4qle6rjdk7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValueAsLong_long_long1361",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bi8wbqs5m(){try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36490); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36491);assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L, 567L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36492);assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L, 567L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36493);assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L, 567L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36494);assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L, 567L)); 
 }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}} 


public void test_getMillis_int_long1362() {__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceStart(getClass().getName(),36495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vpysfs5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4qs4qle6rjdk7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_int_long1362",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vpysfs5r(){try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36495); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36496);assertEquals(0, MillisDurationField.INSTANCE.getMillis(0, 567L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36497);assertEquals(1234, MillisDurationField.INSTANCE.getMillis(1234, 567L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36498);assertEquals(-1234, MillisDurationField.INSTANCE.getMillis(-1234, 567L)); 
 }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}} 


public void test_getMillis_long_long1363() {__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceStart(getClass().getName(),36499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o465w5s5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4qs4qle6rjdk7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_long_long1363",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o465w5s5v(){try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36499); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36500);assertEquals(0L, MillisDurationField.INSTANCE.getMillis(0L, 567L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36501);assertEquals(1234L, MillisDurationField.INSTANCE.getMillis(1234L, 567L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36502);assertEquals(-1234L, MillisDurationField.INSTANCE.getMillis(-1234L, 567L)); 
 }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}} 


public void test_add_long_long1364() {__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceStart(getClass().getName(),36503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fj4igrs5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4qs4qle6rjdk7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_long1364",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fj4igrs5z(){try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36503); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36504);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36505);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36506);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36507);try { 
         __CLR4_4_1s4qs4qle6rjdk7.R.inc(36508);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1L); 
         __CLR4_4_1s4qs4qle6rjdk7.R.inc(36509);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}} 


public void test_getDifference_long_int1365() {__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceStart(getClass().getName(),36510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aylp7xs66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4qs4qle6rjdk7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getDifference_long_int1365",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aylp7xs66(){try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36510); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36511);assertEquals(567, MillisDurationField.INSTANCE.getDifference(567L, 0L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36512);assertEquals(567 - 1234, MillisDurationField.INSTANCE.getDifference(567L, 1234L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36513);assertEquals(567 + 1234, MillisDurationField.INSTANCE.getDifference(567L, -1234L)); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36514);try { 
         __CLR4_4_1s4qs4qle6rjdk7.R.inc(36515);MillisDurationField.INSTANCE.getDifference(Long.MAX_VALUE, 1L); 
         __CLR4_4_1s4qs4qle6rjdk7.R.inc(36516);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}} 


public void test_toString1367() {__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceStart(getClass().getName(),36517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdwsm5s6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4qs4qle6rjdk7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_toString1367",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdwsm5s6d(){try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36517); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36518);assertEquals("DurationField[millis]", MillisDurationField.INSTANCE.toString()); 
 }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}} 


public void testSerialization1368() throws Exception {__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceStart(getClass().getName(),36519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19anco9s6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4qs4qle6rjdk7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4qs4qle6rjdk7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.testSerialization1368",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19anco9s6f() throws Exception{try{__CLR4_4_1s4qs4qle6rjdk7.R.inc(36519); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36520);DurationField test = MillisDurationField.INSTANCE; 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36521);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36522);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36523);oos.writeObject(test); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36524);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36525);oos.close(); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36526);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36527);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36528);DurationField result = (DurationField) ois.readObject(); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36529);ois.close(); 
     __CLR4_4_1s4qs4qle6rjdk7.R.inc(36530);assertSame(test, result); 
 }finally{__CLR4_4_1s4qs4qle6rjdk7.R.flushNeeded();}} 

    

    
    
    

    

    

    
    
    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
