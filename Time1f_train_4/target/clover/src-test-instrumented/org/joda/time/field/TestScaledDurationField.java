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
public class TestScaledDurationField extends TestCase {static class __CLR4_4_1sj6sj6le6rjdlt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,37110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private ScaledDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(36978);
        __CLR4_4_1sj6sj6le6rjdlt.R.inc(36979);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(36980);
        __CLR4_4_1sj6sj6le6rjdlt.R.inc(36981);return new TestSuite(TestScaledDurationField.class);
    }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}}

    public TestScaledDurationField(String name) {
        super(name);__CLR4_4_1sj6sj6le6rjdlt.R.inc(36983);try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(36982);
    }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(36984);
        __CLR4_4_1sj6sj6le6rjdlt.R.inc(36985);DurationField base = MillisDurationField.INSTANCE;
        __CLR4_4_1sj6sj6le6rjdlt.R.inc(36986);iField = new ScaledDurationField(base, DurationFieldType.minutes(), 90);
    }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(36987);
        __CLR4_4_1sj6sj6le6rjdlt.R.inc(36988);iField = null;
    }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_constructor278() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),36989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ilvzhsjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_constructor278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ilvzhsjh(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(36989); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(36990);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(36991);new ScaledDurationField(null, DurationFieldType.minutes(), 10); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(36992);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(36993);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(36994);new ScaledDurationField(MillisDurationField.INSTANCE, null, 10); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(36995);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(36996);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(36997);new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 0); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(36998);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(36999);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37000);new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 1); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37001);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_getValue_long279() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfma14sju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfma14sju(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37002); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37003);assertEquals(0, iField.getValue(0L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37004);assertEquals(12345678 / 90, iField.getValue(12345678L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37005);assertEquals(-1234 / 90, iField.getValue(-1234L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37006);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37007);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37008);iField.getValue(LONG_INTEGER_MAX + 1L); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37009);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_getValueAsLong_long280() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uqa4sssk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uqa4sssk2(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37010); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37011);assertEquals(0L, iField.getValueAsLong(0L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37012);assertEquals(12345678L / 90, iField.getValueAsLong(12345678L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37013);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37014);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L)); 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_getValue_long_long281() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzkmqesk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long_long281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzkmqesk7(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37015); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37016);assertEquals(0, iField.getValue(0L, 567L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37017);assertEquals(12345678 / 90, iField.getValue(12345678L, 567L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37018);assertEquals(-1234 / 90, iField.getValue(-1234L, 567L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37019);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX, 567L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37020);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37021);iField.getValue(LONG_INTEGER_MAX + 1L, 567L); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37022);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_getValueAsLong_long_long282() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnt93xskf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long_long282",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnt93xskf(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37023); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37024);assertEquals(0L, iField.getValueAsLong(0L, 567L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37025);assertEquals(12345678 / 90L, iField.getValueAsLong(12345678L, 567L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37026);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L, 567L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37027);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L, 567L)); 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_getMillis_long283() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1toa7ooskk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1toa7ooskk(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37028); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37029);assertEquals(0L, iField.getMillis(0L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37030);assertEquals(1234L * 90L, iField.getMillis(1234L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37031);assertEquals(-1234L * 90L, iField.getMillis(-1234L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37032);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37033);iField.getMillis(LONG_MAX); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37034);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_getMillis_long_long284() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vk2gg6skr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long_long284",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vk2gg6skr(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37035); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37036);assertEquals(0L, iField.getMillis(0L, 567L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37037);assertEquals(1234L * 90L, iField.getMillis(1234L, 567L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37038);assertEquals(-1234L * 90L, iField.getMillis(-1234L, 567L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37039);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37040);iField.getMillis(LONG_MAX, 567L); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37041);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_add_long_int285() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mc4u9sky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_int285",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mc4u9sky(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37042); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37043);assertEquals(567L, iField.add(567L, 0)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37044);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37045);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37046);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37047);iField.add(LONG_MAX, 1); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37048);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_add_long_long286() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1usuz6rsl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_long286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1usuz6rsl5(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37049); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37050);assertEquals(567L, iField.add(567L, 0L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37051);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37052);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37053);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37054);iField.add(LONG_MAX, 1L); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37055);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37056);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37057);iField.add(1L, LONG_MAX); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37058);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_getDifference_long_int287() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xss0k3slf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifference_long_int287",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xss0k3slf(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37059); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37060);assertEquals(0, iField.getDifference(1L, 0L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37061);assertEquals(567, iField.getDifference(567L * 90L, 0L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37062);assertEquals(567 - 1234, iField.getDifference(567L * 90L, 1234L * 90L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37063);assertEquals(567 + 1234, iField.getDifference(567L * 90L, -1234L * 90L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37064);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37065);iField.getDifference(LONG_MAX, -1L); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37066);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long288() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mp132zsln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifferenceAsLong_long_long288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mp132zsln(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37067); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37068);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37069);assertEquals(567L, iField.getDifferenceAsLong(567L * 90L, 0L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37070);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567L * 90L, 1234L * 90L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37071);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567L * 90L, -1234L * 90L)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37072);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37073);iField.getDifferenceAsLong(LONG_MAX, -1L); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37074);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_compareTo289() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18l2a87slv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_compareTo289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18l2a87slv(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37075); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37076);assertEquals(0, iField.compareTo(iField)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37077);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37078);DurationField dummy = new PreciseDurationField(DurationFieldType.minutes(), 0); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37079);assertEquals(1, iField.compareTo(dummy)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37080);try { 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37081);iField.compareTo(null); 
         __CLR4_4_1sj6sj6le6rjdlt.R.inc(37082);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_getScalar290() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hr6hvfsm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getScalar290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hr6hvfsm3(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37083); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37084);assertEquals(90, iField.getScalar()); 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void testSerialization291() throws Exception {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlz1arsm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.testSerialization291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlz1arsm5() throws Exception{try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37085); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37086);DurationField test = iField; 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37087);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37088);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37089);oos.writeObject(test); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37090);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37091);oos.close(); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37092);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37093);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37094);DurationField result = (DurationField) ois.readObject(); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37095);ois.close(); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37096);assertEquals(test, result); 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_equals292() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wth3tysmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_equals292",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wth3tysmh(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37097); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37098);assertEquals(true, iField.equals(iField)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37099);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37100);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37101);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37102);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37103);assertEquals(true, iField.equals(dummy)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37104);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37105);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37106);assertEquals(false, iField.equals("")); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37107);assertEquals(false, iField.equals(null)); 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 


public void test_toString307() {__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceStart(getClass().getName(),37108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gw3v60sms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sj6sj6le6rjdlt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sj6sj6le6rjdlt.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_toString307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gw3v60sms(){try{__CLR4_4_1sj6sj6le6rjdlt.R.inc(37108); 
     __CLR4_4_1sj6sj6le6rjdlt.R.inc(37109);assertEquals("DurationField[minutes]", iField.toString()); 
 }finally{__CLR4_4_1sj6sj6le6rjdlt.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
