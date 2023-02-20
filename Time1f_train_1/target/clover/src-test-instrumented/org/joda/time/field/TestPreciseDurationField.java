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
public class TestPreciseDurationField extends TestCase {static class __CLR4_4_1seksekle6qeamv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,36910,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private PreciseDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1seksekle6qeamv.R.inc(36812);
        __CLR4_4_1seksekle6qeamv.R.inc(36813);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1seksekle6qeamv.R.inc(36814);
        __CLR4_4_1seksekle6qeamv.R.inc(36815);return new TestSuite(TestPreciseDurationField.class);
    }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}}

    public TestPreciseDurationField(String name) {
        super(name);__CLR4_4_1seksekle6qeamv.R.inc(36817);try{__CLR4_4_1seksekle6qeamv.R.inc(36816);
    }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1seksekle6qeamv.R.inc(36818);
        __CLR4_4_1seksekle6qeamv.R.inc(36819);iField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
    }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1seksekle6qeamv.R.inc(36820);
        __CLR4_4_1seksekle6qeamv.R.inc(36821);iField = null;
    }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getValue_long291() {__CLR4_4_1seksekle6qeamv.R.globalSliceStart(getClass().getName(),36822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5rp6qseu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1seksekle6qeamv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1seksekle6qeamv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5rp6qseu(){try{__CLR4_4_1seksekle6qeamv.R.inc(36822); 
     __CLR4_4_1seksekle6qeamv.R.inc(36823);assertEquals(0, iField.getValue(0L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36824);assertEquals(12345, iField.getValue(12345678L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36825);assertEquals(-1, iField.getValue(-1234L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36826);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36827);try { 
         __CLR4_4_1seksekle6qeamv.R.inc(36828);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L); 
         __CLR4_4_1seksekle6qeamv.R.inc(36829);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}} 


public void test_getValueAsLong_long292() {__CLR4_4_1seksekle6qeamv.R.globalSliceStart(getClass().getName(),36830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_142z31vsf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1seksekle6qeamv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1seksekle6qeamv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValueAsLong_long292",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_142z31vsf2(){try{__CLR4_4_1seksekle6qeamv.R.inc(36830); 
     __CLR4_4_1seksekle6qeamv.R.inc(36831);assertEquals(0L, iField.getValueAsLong(0L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36832);assertEquals(12345L, iField.getValueAsLong(12345678L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36833);assertEquals(-1L, iField.getValueAsLong(-1234L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36834);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 1000L + 1000L)); 
 }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}} 


public void test_getValue_long_long293() {__CLR4_4_1seksekle6qeamv.R.globalSliceStart(getClass().getName(),36835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_168a7e3sf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1seksekle6qeamv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1seksekle6qeamv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long_long293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_168a7e3sf7(){try{__CLR4_4_1seksekle6qeamv.R.inc(36835); 
     __CLR4_4_1seksekle6qeamv.R.inc(36836);assertEquals(0, iField.getValue(0L, 567L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36837);assertEquals(12345, iField.getValue(12345678L, 567L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36838);assertEquals(-1, iField.getValue(-1234L, 567L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36839);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L, 567L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36840);try { 
         __CLR4_4_1seksekle6qeamv.R.inc(36841);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L, 567L); 
         __CLR4_4_1seksekle6qeamv.R.inc(36842);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}} 


public void test_compareTo426() {__CLR4_4_1seksekle6qeamv.R.globalSliceStart(getClass().getName(),36843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tcjqsssff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1seksekle6qeamv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1seksekle6qeamv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_compareTo426",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tcjqsssff(){try{__CLR4_4_1seksekle6qeamv.R.inc(36843); 
     __CLR4_4_1seksekle6qeamv.R.inc(36844);assertEquals(0, iField.compareTo(iField)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36845);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1seksekle6qeamv.R.inc(36846);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1seksekle6qeamv.R.inc(36847);assertEquals(1, iField.compareTo(dummy)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36848);try { 
         __CLR4_4_1seksekle6qeamv.R.inc(36849);iField.compareTo(null); 
         __CLR4_4_1seksekle6qeamv.R.inc(36850);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}} 


public void test_isPrecise427() {__CLR4_4_1seksekle6qeamv.R.globalSliceStart(getClass().getName(),36851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cew3pgsfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1seksekle6qeamv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1seksekle6qeamv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_isPrecise427",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cew3pgsfn(){try{__CLR4_4_1seksekle6qeamv.R.inc(36851); 
     __CLR4_4_1seksekle6qeamv.R.inc(36852);assertEquals(true, iField.isPrecise()); 
 }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}} 


public void test_getMillis_int_long428() {__CLR4_4_1seksekle6qeamv.R.globalSliceStart(getClass().getName(),36853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v3gekbsfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1seksekle6qeamv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1seksekle6qeamv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_int_long428",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v3gekbsfp(){try{__CLR4_4_1seksekle6qeamv.R.inc(36853); 
     __CLR4_4_1seksekle6qeamv.R.inc(36854);assertEquals(0L, iField.getMillis(0, 567L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36855);assertEquals(1234000L, iField.getMillis(1234, 567L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36856);assertEquals(-1234000L, iField.getMillis(-1234, 567L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36857);assertEquals(LONG_INTEGER_MAX * 1000L, iField.getMillis(INTEGER_MAX, 567L)); 
 }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}} 


public void test_getMillis_long_long429() {__CLR4_4_1seksekle6qeamv.R.globalSliceStart(getClass().getName(),36858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17afldfsfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1seksekle6qeamv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1seksekle6qeamv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_long_long429",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17afldfsfu(){try{__CLR4_4_1seksekle6qeamv.R.inc(36858); 
     __CLR4_4_1seksekle6qeamv.R.inc(36859);assertEquals(0L, iField.getMillis(0L, 567L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36860);assertEquals(1234000L, iField.getMillis(1234L, 567L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36861);assertEquals(-1234000L, iField.getMillis(-1234L, 567L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36862);try { 
         __CLR4_4_1seksekle6qeamv.R.inc(36863);iField.getMillis(LONG_MAX, 567L); 
         __CLR4_4_1seksekle6qeamv.R.inc(36864);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}} 


public void test_add_long_int430() {__CLR4_4_1seksekle6qeamv.R.globalSliceStart(getClass().getName(),36865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1so3ra7sg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1seksekle6qeamv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1seksekle6qeamv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_int430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1so3ra7sg1(){try{__CLR4_4_1seksekle6qeamv.R.inc(36865); 
     __CLR4_4_1seksekle6qeamv.R.inc(36866);assertEquals(567L, iField.add(567L, 0)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36867);assertEquals(567L + 1234000L, iField.add(567L, 1234)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36868);assertEquals(567L - 1234000L, iField.add(567L, -1234)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36869);try { 
         __CLR4_4_1seksekle6qeamv.R.inc(36870);iField.add(LONG_MAX, 1); 
         __CLR4_4_1seksekle6qeamv.R.inc(36871);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}} 


public void test_add_long_long431() {__CLR4_4_1seksekle6qeamv.R.globalSliceStart(getClass().getName(),36872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13r3cqtsg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1seksekle6qeamv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1seksekle6qeamv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_long431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13r3cqtsg8(){try{__CLR4_4_1seksekle6qeamv.R.inc(36872); 
     __CLR4_4_1seksekle6qeamv.R.inc(36873);assertEquals(567L, iField.add(567L, 0L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36874);assertEquals(567L + 1234000L, iField.add(567L, 1234L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36875);assertEquals(567L - 1234000L, iField.add(567L, -1234L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36876);try { 
         __CLR4_4_1seksekle6qeamv.R.inc(36877);iField.add(LONG_MAX, 1L); 
         __CLR4_4_1seksekle6qeamv.R.inc(36878);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1seksekle6qeamv.R.inc(36879);try { 
         __CLR4_4_1seksekle6qeamv.R.inc(36880);iField.add(1L, LONG_MAX); 
         __CLR4_4_1seksekle6qeamv.R.inc(36881);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long432() {__CLR4_4_1seksekle6qeamv.R.globalSliceStart(getClass().getName(),36882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1bdnqsgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1seksekle6qeamv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1seksekle6qeamv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getDifferenceAsLong_long_long432",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1bdnqsgi(){try{__CLR4_4_1seksekle6qeamv.R.inc(36882); 
     __CLR4_4_1seksekle6qeamv.R.inc(36883);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36884);assertEquals(567L, iField.getDifferenceAsLong(567000L, 0L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36885);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567000L, 1234000L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36886);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567000L, -1234000L)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36887);try { 
         __CLR4_4_1seksekle6qeamv.R.inc(36888);iField.getDifferenceAsLong(LONG_MAX, -1L); 
         __CLR4_4_1seksekle6qeamv.R.inc(36889);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}} 


public void test_equals433() {__CLR4_4_1seksekle6qeamv.R.globalSliceStart(getClass().getName(),36890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14g5mepsgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1seksekle6qeamv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1seksekle6qeamv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_equals433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14g5mepsgq(){try{__CLR4_4_1seksekle6qeamv.R.inc(36890); 
     __CLR4_4_1seksekle6qeamv.R.inc(36891);assertEquals(true, iField.equals(iField)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36892);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1seksekle6qeamv.R.inc(36893);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1seksekle6qeamv.R.inc(36894);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36895);dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000); 
     __CLR4_4_1seksekle6qeamv.R.inc(36896);assertEquals(true, iField.equals(dummy)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36897);dummy = new PreciseDurationField(DurationFieldType.millis(), 1000); 
     __CLR4_4_1seksekle6qeamv.R.inc(36898);assertEquals(false, iField.equals(dummy)); 
     __CLR4_4_1seksekle6qeamv.R.inc(36899);assertEquals(false, iField.equals("")); 
     __CLR4_4_1seksekle6qeamv.R.inc(36900);assertEquals(false, iField.equals(null)); 
 }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}} 


public void test_hashCode434() {__CLR4_4_1seksekle6qeamv.R.globalSliceStart(getClass().getName(),36901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pzq298sh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1seksekle6qeamv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1seksekle6qeamv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_hashCode434",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pzq298sh1(){try{__CLR4_4_1seksekle6qeamv.R.inc(36901); 
     __CLR4_4_1seksekle6qeamv.R.inc(36902);assertEquals(true, iField.hashCode() == iField.hashCode()); 
     __CLR4_4_1seksekle6qeamv.R.inc(36903);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode()); 
     __CLR4_4_1seksekle6qeamv.R.inc(36904);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1seksekle6qeamv.R.inc(36905);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1seksekle6qeamv.R.inc(36906);dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000); 
     __CLR4_4_1seksekle6qeamv.R.inc(36907);assertEquals(true, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1seksekle6qeamv.R.inc(36908);dummy = new PreciseDurationField(DurationFieldType.millis(), 1000); 
     __CLR4_4_1seksekle6qeamv.R.inc(36909);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
 }finally{__CLR4_4_1seksekle6qeamv.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
