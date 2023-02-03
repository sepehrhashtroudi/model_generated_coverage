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
public class TestPreciseDurationField extends TestCase {static class __CLR4_4_1u4du4dlc8axezh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,39135,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private PreciseDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1u4du4dlc8axezh.R.inc(39037);
        __CLR4_4_1u4du4dlc8axezh.R.inc(39038);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1u4du4dlc8axezh.R.inc(39039);
        __CLR4_4_1u4du4dlc8axezh.R.inc(39040);return new TestSuite(TestPreciseDurationField.class);
    }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}}

    public TestPreciseDurationField(String name) {
        super(name);__CLR4_4_1u4du4dlc8axezh.R.inc(39042);try{__CLR4_4_1u4du4dlc8axezh.R.inc(39041);
    }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1u4du4dlc8axezh.R.inc(39043);
        __CLR4_4_1u4du4dlc8axezh.R.inc(39044);iField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
    }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1u4du4dlc8axezh.R.inc(39045);
        __CLR4_4_1u4du4dlc8axezh.R.inc(39046);iField = null;
    }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_compareTo570() {__CLR4_4_1u4du4dlc8axezh.R.globalSliceStart(getClass().getName(),39047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e8rnyau4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u4du4dlc8axezh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u4du4dlc8axezh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_compareTo570",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e8rnyau4n(){try{__CLR4_4_1u4du4dlc8axezh.R.inc(39047); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39048);assertEquals(0, iField.compareTo(iField)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39049);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39050);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39051);assertEquals(1, iField.compareTo(dummy)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39052);try { 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39053);iField.compareTo(null); 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39054);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}} 


public void test_getValueAsLong_long908() {__CLR4_4_1u4du4dlc8axezh.R.globalSliceStart(getClass().getName(),39055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4ryo3u4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u4du4dlc8axezh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u4du4dlc8axezh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValueAsLong_long908",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4ryo3u4v(){try{__CLR4_4_1u4du4dlc8axezh.R.inc(39055); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39056);assertEquals(0L, iField.getValueAsLong(0L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39057);assertEquals(12345L, iField.getValueAsLong(12345678L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39058);assertEquals(-1L, iField.getValueAsLong(-1234L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39059);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 1000L + 1000L)); 
 }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}} 


public void test_hashCode944() {__CLR4_4_1u4du4dlc8axezh.R.globalSliceStart(getClass().getName(),39060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16y4m14u50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u4du4dlc8axezh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u4du4dlc8axezh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_hashCode944",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16y4m14u50(){try{__CLR4_4_1u4du4dlc8axezh.R.inc(39060); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39061);assertEquals(true, iField.hashCode() == iField.hashCode()); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39062);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode()); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39063);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39064);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39065);dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39066);assertEquals(true, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39067);dummy = new PreciseDurationField(DurationFieldType.millis(), 1000); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39068);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
 }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}} 


public void test_equals954() {__CLR4_4_1u4du4dlc8axezh.R.globalSliceStart(getClass().getName(),39069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngtctpu59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u4du4dlc8axezh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u4du4dlc8axezh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_equals954",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngtctpu59(){try{__CLR4_4_1u4du4dlc8axezh.R.inc(39069); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39070);assertEquals(true, iField.equals(iField)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39071);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39072);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39073);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39074);dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39075);assertEquals(true, iField.equals(dummy)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39076);dummy = new PreciseDurationField(DurationFieldType.millis(), 1000); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39077);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39078);assertEquals(false, iField.equals("")); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39079);assertEquals(false, iField.equals(null)); 
 }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}} 


public void test_getMillis_long_long1015() {__CLR4_4_1u4du4dlc8axezh.R.globalSliceStart(getClass().getName(),39080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uhnraxu5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u4du4dlc8axezh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u4du4dlc8axezh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_long_long1015",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uhnraxu5k(){try{__CLR4_4_1u4du4dlc8axezh.R.inc(39080); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39081);assertEquals(0L, iField.getMillis(0L, 567L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39082);assertEquals(1234000L, iField.getMillis(1234L, 567L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39083);assertEquals(-1234000L, iField.getMillis(-1234L, 567L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39084);try { 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39085);iField.getMillis(LONG_MAX, 567L); 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39086);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}} 


public void test_getValue_long1198() {__CLR4_4_1u4du4dlc8axezh.R.globalSliceStart(getClass().getName(),39087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fctkk9u5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u4du4dlc8axezh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u4du4dlc8axezh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long1198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fctkk9u5r(){try{__CLR4_4_1u4du4dlc8axezh.R.inc(39087); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39088);assertEquals(0, iField.getValue(0L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39089);assertEquals(12345, iField.getValue(12345678L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39090);assertEquals(-1, iField.getValue(-1234L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39091);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39092);try { 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39093);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L); 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39094);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}} 


public void test_add_long_long1261() {__CLR4_4_1u4du4dlc8axezh.R.globalSliceStart(getClass().getName(),39095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17wzayfu5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u4du4dlc8axezh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u4du4dlc8axezh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_long1261",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17wzayfu5z(){try{__CLR4_4_1u4du4dlc8axezh.R.inc(39095); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39096);assertEquals(567L, iField.add(567L, 0L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39097);assertEquals(567L + 1234000L, iField.add(567L, 1234L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39098);assertEquals(567L - 1234000L, iField.add(567L, -1234L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39099);try { 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39100);iField.add(LONG_MAX, 1L); 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39101);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39102);try { 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39103);iField.add(1L, LONG_MAX); 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39104);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}} 


public void test_getValue_long_long1405() {__CLR4_4_1u4du4dlc8axezh.R.globalSliceStart(getClass().getName(),39105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ka0hnbu69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u4du4dlc8axezh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u4du4dlc8axezh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long_long1405",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ka0hnbu69(){try{__CLR4_4_1u4du4dlc8axezh.R.inc(39105); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39106);assertEquals(0, iField.getValue(0L, 567L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39107);assertEquals(12345, iField.getValue(12345678L, 567L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39108);assertEquals(-1, iField.getValue(-1234L, 567L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39109);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L, 567L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39110);try { 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39111);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L, 567L); 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39112);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}} 


public void test_getMillis_int_long1459() {__CLR4_4_1u4du4dlc8axezh.R.globalSliceStart(getClass().getName(),39113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzfsnqu6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u4du4dlc8axezh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u4du4dlc8axezh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_int_long1459",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39113,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzfsnqu6h(){try{__CLR4_4_1u4du4dlc8axezh.R.inc(39113); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39114);assertEquals(0L, iField.getMillis(0, 567L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39115);assertEquals(1234000L, iField.getMillis(1234, 567L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39116);assertEquals(-1234000L, iField.getMillis(-1234, 567L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39117);assertEquals(LONG_INTEGER_MAX * 1000L, iField.getMillis(INTEGER_MAX, 567L)); 
 }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}} 


public void test_add_long_int1493() {__CLR4_4_1u4du4dlc8axezh.R.globalSliceStart(getClass().getName(),39118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1np2c6du6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u4du4dlc8axezh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u4du4dlc8axezh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_int1493",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1np2c6du6m(){try{__CLR4_4_1u4du4dlc8axezh.R.inc(39118); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39119);assertEquals(567L, iField.add(567L, 0)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39120);assertEquals(567L + 1234000L, iField.add(567L, 1234)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39121);assertEquals(567L - 1234000L, iField.add(567L, -1234)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39122);try { 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39123);iField.add(LONG_MAX, 1); 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39124);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long1538() {__CLR4_4_1u4du4dlc8axezh.R.globalSliceStart(getClass().getName(),39125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16yo3ssu6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u4du4dlc8axezh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u4du4dlc8axezh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getDifferenceAsLong_long_long1538",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16yo3ssu6t(){try{__CLR4_4_1u4du4dlc8axezh.R.inc(39125); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39126);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39127);assertEquals(567L, iField.getDifferenceAsLong(567000L, 0L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39128);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567000L, 1234000L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39129);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567000L, -1234000L)); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39130);try { 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39131);iField.getDifferenceAsLong(LONG_MAX, -1L); 
         __CLR4_4_1u4du4dlc8axezh.R.inc(39132);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}} 


public void test_isPrecise1546() {__CLR4_4_1u4du4dlc8axezh.R.globalSliceStart(getClass().getName(),39133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyph4fu71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u4du4dlc8axezh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u4du4dlc8axezh.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_isPrecise1546",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyph4fu71(){try{__CLR4_4_1u4du4dlc8axezh.R.inc(39133); 
     __CLR4_4_1u4du4dlc8axezh.R.inc(39134);assertEquals(true, iField.isPrecise()); 
 }finally{__CLR4_4_1u4du4dlc8axezh.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
