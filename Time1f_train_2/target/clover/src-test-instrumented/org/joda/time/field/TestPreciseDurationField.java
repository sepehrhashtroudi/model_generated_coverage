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
public class TestPreciseDurationField extends TestCase {static class __CLR4_4_1s9ls9lle6qsfl5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,36700,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private PreciseDurationField iField;

    public static void main(String[] args) {try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36633);
        __CLR4_4_1s9ls9lle6qsfl5.R.inc(36634);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36635);
        __CLR4_4_1s9ls9lle6qsfl5.R.inc(36636);return new TestSuite(TestPreciseDurationField.class);
    }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}}

    public TestPreciseDurationField(String name) {
        super(name);__CLR4_4_1s9ls9lle6qsfl5.R.inc(36638);try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36637);
    }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36639);
        __CLR4_4_1s9ls9lle6qsfl5.R.inc(36640);iField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
    }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36641);
        __CLR4_4_1s9ls9lle6qsfl5.R.inc(36642);iField = null;
    }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getValueAsLong_long271() {__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceStart(getClass().getName(),36643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149f71qs9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s9ls9lle6qsfl5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValueAsLong_long271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149f71qs9v(){try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36643); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36644);assertEquals(0L, iField.getValueAsLong(0L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36645);assertEquals(12345L, iField.getValueAsLong(12345678L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36646);assertEquals(-1L, iField.getValueAsLong(-1234L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36647);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 1000L + 1000L)); 
 }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}} 


public void test_getValue_long_long272() {__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceStart(getClass().getName(),36648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekohhosa0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s9ls9lle6qsfl5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long_long272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekohhosa0(){try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36648); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36649);assertEquals(0, iField.getValue(0L, 567L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36650);assertEquals(12345, iField.getValue(12345678L, 567L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36651);assertEquals(-1, iField.getValue(-1234L, 567L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36652);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L, 567L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36653);try { 
         __CLR4_4_1s9ls9lle6qsfl5.R.inc(36654);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L, 567L); 
         __CLR4_4_1s9ls9lle6qsfl5.R.inc(36655);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}} 


public void test_compareTo405() {__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceStart(getClass().getName(),36656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xc612rsa8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s9ls9lle6qsfl5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_compareTo405",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xc612rsa8(){try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36656); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36657);assertEquals(0, iField.compareTo(iField)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36658);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36659);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36660);assertEquals(1, iField.compareTo(dummy)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36661);try { 
         __CLR4_4_1s9ls9lle6qsfl5.R.inc(36662);iField.compareTo(null); 
         __CLR4_4_1s9ls9lle6qsfl5.R.inc(36663);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}} 


public void test_isPrecise406() {__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceStart(getClass().getName(),36664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_142htlvsag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s9ls9lle6qsfl5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_isPrecise406",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_142htlvsag(){try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36664); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36665);assertEquals(true, iField.isPrecise()); 
 }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}} 


public void test_getMillis_long_long407() {__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceStart(getClass().getName(),36666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdtwojsai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s9ls9lle6qsfl5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_long_long407",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdtwojsai(){try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36666); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36667);assertEquals(0L, iField.getMillis(0L, 567L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36668);assertEquals(1234000L, iField.getMillis(1234L, 567L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36669);assertEquals(-1234000L, iField.getMillis(-1234L, 567L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36670);try { 
         __CLR4_4_1s9ls9lle6qsfl5.R.inc(36671);iField.getMillis(LONG_MAX, 567L); 
         __CLR4_4_1s9ls9lle6qsfl5.R.inc(36672);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}} 


public void test_add_long_long408() {__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceStart(getClass().getName(),36673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dmgmnsap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s9ls9lle6qsfl5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_long408",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dmgmnsap(){try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36673); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36674);assertEquals(567L, iField.add(567L, 0L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36675);assertEquals(567L + 1234000L, iField.add(567L, 1234L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36676);assertEquals(567L - 1234000L, iField.add(567L, -1234L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36677);try { 
         __CLR4_4_1s9ls9lle6qsfl5.R.inc(36678);iField.add(LONG_MAX, 1L); 
         __CLR4_4_1s9ls9lle6qsfl5.R.inc(36679);fail(); 
     } catch (ArithmeticException ex) { 
     } 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36680);try { 
         __CLR4_4_1s9ls9lle6qsfl5.R.inc(36681);iField.add(1L, LONG_MAX); 
         __CLR4_4_1s9ls9lle6qsfl5.R.inc(36682);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long409() {__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceStart(getClass().getName(),36683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mnuhjksaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s9ls9lle6qsfl5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getDifferenceAsLong_long_long409",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mnuhjksaz(){try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36683); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36684);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36685);assertEquals(567L, iField.getDifferenceAsLong(567000L, 0L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36686);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567000L, 1234000L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36687);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567000L, -1234000L)); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36688);try { 
         __CLR4_4_1s9ls9lle6qsfl5.R.inc(36689);iField.getDifferenceAsLong(LONG_MAX, -1L); 
         __CLR4_4_1s9ls9lle6qsfl5.R.inc(36690);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}} 


public void test_hashCode410() {__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceStart(getClass().getName(),36691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1reboj2sb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s9ls9lle6qsfl5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s9ls9lle6qsfl5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_hashCode410",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1reboj2sb7(){try{__CLR4_4_1s9ls9lle6qsfl5.R.inc(36691); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36692);assertEquals(true, iField.hashCode() == iField.hashCode()); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36693);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode()); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36694);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36695);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36696);dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36697);assertEquals(true, iField.hashCode() == dummy.hashCode()); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36698);dummy = new PreciseDurationField(DurationFieldType.millis(), 1000); 
     __CLR4_4_1s9ls9lle6qsfl5.R.inc(36699);assertEquals(false, iField.hashCode() == dummy.hashCode()); 
 }finally{__CLR4_4_1s9ls9lle6qsfl5.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
