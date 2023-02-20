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
public class TestPreciseDurationField extends TestCase {static class __CLR4_4_1sdhsdhle6rcmyf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,36862,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private PreciseDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36773);
        __CLR4_4_1sdhsdhle6rcmyf.R.inc(36774);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36775);
        __CLR4_4_1sdhsdhle6rcmyf.R.inc(36776);return new TestSuite(TestPreciseDurationField.class);
    }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}}

    public TestPreciseDurationField(String name) {
        super(name);__CLR4_4_1sdhsdhle6rcmyf.R.inc(36778);try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36777);
    }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36779);
        __CLR4_4_1sdhsdhle6rcmyf.R.inc(36780);iField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
    }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36781);
        __CLR4_4_1sdhsdhle6rcmyf.R.inc(36782);iField = null;
    }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getValue_long304() {__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceStart(getClass().getName(),36783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a43lcbsdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sdhsdhle6rcmyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a43lcbsdr(){try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36783); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36784);assertEquals(0, iField.getValue(0L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36785);assertEquals(12345, iField.getValue(12345678L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36786);assertEquals(-1, iField.getValue(-1234L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36787);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36788);try { 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36789);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L); 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36790);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}} 


public void test_getValueAsLong_long305() {__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceStart(getClass().getName(),36791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6w7h6sdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sdhsdhle6rcmyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValueAsLong_long305",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6w7h6sdz(){try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36791); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36792);assertEquals(0L, iField.getValueAsLong(0L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36793);assertEquals(12345L, iField.getValueAsLong(12345678L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36794);assertEquals(-1L, iField.getValueAsLong(-1234L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36795);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 1000L + 1000L)); 
 }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}} 


public void test_getValue_long_long306() {__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceStart(getClass().getName(),36796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ui5hx4se4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sdhsdhle6rcmyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long_long306",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ui5hx4se4(){try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36796); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36797);assertEquals(0, iField.getValue(0L, 567L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36798);assertEquals(12345, iField.getValue(12345678L, 567L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36799);assertEquals(-1, iField.getValue(-1234L, 567L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36800);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L, 567L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36801);try { 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36802);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L, 567L); 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36803);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}} 


public void test_compareTo434() {__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceStart(getClass().getName(),36804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igpc7rsec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sdhsdhle6rcmyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_compareTo434",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igpc7rsec(){try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36804); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36805);assertEquals(0, iField.compareTo(iField)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36806);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36807);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36808);assertEquals(1, iField.compareTo(dummy)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36809);try { 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36810);iField.compareTo(null); 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36811);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}} 


public void test_isPrecise435() {__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceStart(getClass().getName(),36812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1asyv95sek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sdhsdhle6rcmyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_isPrecise435",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1asyv95sek(){try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36812); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36813);assertEquals(true, iField.isPrecise()); 
 }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}} 


public void test_getMillis_int_long436() {__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceStart(getClass().getName(),36814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vlflqsem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sdhsdhle6rcmyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_int_long436",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vlflqsem(){try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36814); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36815);assertEquals(0L, iField.getMillis(0, 567L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36816);assertEquals(1234000L, iField.getMillis(1234, 567L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36817);assertEquals(-1234000L, iField.getMillis(-1234, 567L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36818);assertEquals(LONG_INTEGER_MAX * 1000L, iField.getMillis(INTEGER_MAX, 567L)); 
 }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}} 


public void test_getMillis_long_long437() {__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceStart(getClass().getName(),36819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uiakc0ser();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sdhsdhle6rcmyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_long_long437",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uiakc0ser(){try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36819); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36820);assertEquals(0L, iField.getMillis(0L, 567L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36821);assertEquals(1234000L, iField.getMillis(1234L, 567L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36822);assertEquals(-1234000L, iField.getMillis(-1234L, 567L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36823);try { 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36824);iField.getMillis(LONG_MAX, 567L); 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36825);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}} 


public void test_add_long_int438() {__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceStart(getClass().getName(),36826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12o40yfsey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sdhsdhle6rcmyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_int438",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12o40yfsey(){try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36826); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36827);assertEquals(567L, iField.add(567L, 0)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36828);assertEquals(567L + 1234000L, iField.add(567L, 1234)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36829);assertEquals(567L - 1234000L, iField.add(567L, -1234)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36830);try { 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36831);iField.add(LONG_MAX, 1); 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36832);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}} 


public void test_add_long_long439() {__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceStart(getClass().getName(),36833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tr332lsf5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sdhsdhle6rcmyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_long439",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tr332lsf5(){try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36833); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36834);assertEquals(567L, iField.add(567L, 0L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36835);assertEquals(567L + 1234000L, iField.add(567L, 1234L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36836);assertEquals(567L - 1234000L, iField.add(567L, -1234L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36837);try { 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36838);iField.add(LONG_MAX, 1L); 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36839);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36840);try { 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36841);iField.add(1L, LONG_MAX); 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36842);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long440() {__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceStart(getClass().getName(),36843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1trxpctsff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sdhsdhle6rcmyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getDifferenceAsLong_long_long440",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1trxpctsff(){try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36843); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36844);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36845);assertEquals(567L, iField.getDifferenceAsLong(567000L, 0L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36846);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567000L, 1234000L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36847);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567000L, -1234000L)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36848);try { 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36849);iField.getDifferenceAsLong(LONG_MAX, -1L); 
         __CLR4_4_1sdhsdhle6rcmyf.R.inc(36850);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}} 


public void test_equals441() {__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceStart(getClass().getName(),36851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1irpcjwsfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sdhsdhle6rcmyf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sdhsdhle6rcmyf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_equals441",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1irpcjwsfn(){try{__CLR4_4_1sdhsdhle6rcmyf.R.inc(36851); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36852);assertEquals(true, iField.equals(iField)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36853);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36854);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36855);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36856);dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36857);assertEquals(true, iField.equals(dummy)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36858);dummy = new PreciseDurationField(DurationFieldType.millis(), 1000); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36859);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36860);assertEquals(false, iField.equals("")); 
     __CLR4_4_1sdhsdhle6rcmyf.R.inc(36861);assertEquals(false, iField.equals(null)); 
 }finally{__CLR4_4_1sdhsdhle6rcmyf.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
