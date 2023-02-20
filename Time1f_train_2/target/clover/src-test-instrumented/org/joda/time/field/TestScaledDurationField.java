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
public class TestScaledDurationField extends TestCase {static class __CLR4_4_1sbgsbgle6qsfle{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,36833,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private ScaledDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36700);
        __CLR4_4_1sbgsbgle6qsfle.R.inc(36701);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36702);
        __CLR4_4_1sbgsbgle6qsfle.R.inc(36703);return new TestSuite(TestScaledDurationField.class);
    }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}}

    public TestScaledDurationField(String name) {
        super(name);__CLR4_4_1sbgsbgle6qsfle.R.inc(36705);try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36704);
    }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36706);
        __CLR4_4_1sbgsbgle6qsfle.R.inc(36707);DurationField base = MillisDurationField.INSTANCE;
        __CLR4_4_1sbgsbgle6qsfle.R.inc(36708);iField = new ScaledDurationField(base, DurationFieldType.minutes(), 90);
    }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36709);
        __CLR4_4_1sbgsbgle6qsfle.R.inc(36710);iField = null;
    }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_hashCode248() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzu36dsbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_hashCode248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzu36dsbr(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36711); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36712);assertEquals(iField.hashCode(), iField.hashCode()); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36713);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode()); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36714);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36715);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36716);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36717);assertEquals(true, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36718);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36719);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_constructor249() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17cusvjsc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_constructor249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17cusvjsc0(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36720); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36721);try { 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36722);new ScaledDurationField(null, DurationFieldType.minutes(), 10); 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36723);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36724);try { 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36725);new ScaledDurationField(MillisDurationField.INSTANCE, null, 10); 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36726);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36727);try { 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36728);new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 0); 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36729);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36730);try { 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36731);new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 1); 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36732);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_getValue_long250() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15s0tsxscd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long250",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15s0tsxscd(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36733); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36734);assertEquals(0, iField.getValue(0L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36735);assertEquals(12345678 / 90, iField.getValue(12345678L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36736);assertEquals(-1234 / 90, iField.getValue(-1234L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36737);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36738);try { 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36739);iField.getValue(LONG_INTEGER_MAX + 1L); 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36740);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_getValueAsLong_long251() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1futfxsscl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1futfxsscl(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36741); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36742);assertEquals(0L, iField.getValueAsLong(0L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36743);assertEquals(12345678L / 90, iField.getValueAsLong(12345678L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36744);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36745);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L)); 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_getValue_long_long252() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q62qdqscq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long_long252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q62qdqscq(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36746); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36747);assertEquals(0, iField.getValue(0L, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36748);assertEquals(12345678 / 90, iField.getValue(12345678L, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36749);assertEquals(-1234 / 90, iField.getValue(-1234L, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36750);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36751);try { 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36752);iField.getValue(LONG_INTEGER_MAX + 1L, 567L); 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36753);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_getValueAsLong_long_long253() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_127nfr3scy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long_long253",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_127nfr3scy(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36754); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36755);assertEquals(0L, iField.getValueAsLong(0L, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36756);assertEquals(12345678 / 90L, iField.getValueAsLong(12345678L, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36757);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36758);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L, 567L)); 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_getMillis_int254() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16odf2fsd3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int254",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16odf2fsd3(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36759); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36760);assertEquals(0, iField.getMillis(0)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36761);assertEquals(1234L * 90L, iField.getMillis(1234)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36762);assertEquals(-1234L * 90L, iField.getMillis(-1234)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36763);assertEquals(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX)); 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_getMillis_long255() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1thm5sd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long255",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1thm5sd8(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36764); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36765);assertEquals(0L, iField.getMillis(0L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36766);assertEquals(1234L * 90L, iField.getMillis(1234L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36767);assertEquals(-1234L * 90L, iField.getMillis(-1234L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36768);try { 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36769);iField.getMillis(LONG_MAX); 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36770);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_getMillis_int_long256() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7aarmsdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int_long256",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7aarmsdf(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36771); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36772);assertEquals(0L, iField.getMillis(0, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36773);assertEquals(1234L * 90L, iField.getMillis(1234, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36774);assertEquals(-1234L * 90L, iField.getMillis(-1234, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36775);assertEquals(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX, 567L)); 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_getMillis_long_long257() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6lp64sdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long_long257",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6lp64sdk(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36776); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36777);assertEquals(0L, iField.getMillis(0L, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36778);assertEquals(1234L * 90L, iField.getMillis(1234L, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36779);assertEquals(-1234L * 90L, iField.getMillis(-1234L, 567L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36780);try { 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36781);iField.getMillis(LONG_MAX, 567L); 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36782);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_add_long_int258() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19zsw4bsdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_int258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19zsw4bsdr(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36783); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36784);assertEquals(567L, iField.add(567L, 0)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36785);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36786);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36787);try { 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36788);iField.add(LONG_MAX, 1); 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36789);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long259() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xgma15sdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifferenceAsLong_long_long259",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xgma15sdy(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36790); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36791);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36792);assertEquals(567L, iField.getDifferenceAsLong(567L * 90L, 0L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36793);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567L * 90L, 1234L * 90L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36794);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567L * 90L, -1234L * 90L)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36795);try { 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36796);iField.getDifferenceAsLong(LONG_MAX, -1L); 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36797);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_compareTo260() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_192j600se6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_compareTo260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_192j600se6(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36798); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36799);assertEquals(0, iField.compareTo(iField)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36800);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36801);DurationField dummy = new PreciseDurationField(DurationFieldType.minutes(), 0); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36802);assertEquals(1, iField.compareTo(dummy)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36803);try { 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36804);iField.compareTo(null); 
         __CLR4_4_1sbgsbgle6qsfle.R.inc(36805);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_getScalar261() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vpt0fsee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getScalar261",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vpt0fsee(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36806); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36807);assertEquals(90, iField.getScalar()); 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void testSerialization262() throws Exception {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqicfrseg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.testSerialization262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqicfrseg() throws Exception{try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36808); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36809);DurationField test = iField; 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36810);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36811);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36812);oos.writeObject(test); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36813);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36814);oos.close(); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36815);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36816);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36817);DurationField result = (DurationField) ois.readObject(); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36818);ois.close(); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36819);assertEquals(test, result); 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_equals263() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hy0eyyses();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_equals263",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hy0eyyses(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36820); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36821);assertEquals(true, iField.equals(iField)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36822);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36823);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36824);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36825);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36826);assertEquals(true, iField.equals(dummy)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36827);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36828);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36829);assertEquals(false, iField.equals("")); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36830);assertEquals(false, iField.equals(null)); 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 


public void test_toString274() {__CLR4_4_1sbgsbgle6qsfle.R.globalSliceStart(getClass().getName(),36831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147mtj1sf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sbgsbgle6qsfle.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sbgsbgle6qsfle.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_toString274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147mtj1sf3(){try{__CLR4_4_1sbgsbgle6qsfle.R.inc(36831); 
     __CLR4_4_1sbgsbgle6qsfle.R.inc(36832);assertEquals("DurationField[minutes]", iField.toString()); 
 }finally{__CLR4_4_1sbgsbgle6qsfle.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
