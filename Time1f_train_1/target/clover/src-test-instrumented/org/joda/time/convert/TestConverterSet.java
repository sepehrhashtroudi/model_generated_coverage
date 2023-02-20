/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.convert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Calendar;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.ReadWritableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;

/**
 * This class is a JUnit test for ConverterSet.
 * Mostly for coverage.
 *
 * @author Stephen Colebourne
 */
public class TestConverterSet extends TestCase {static class __CLR4_4_1rffrffle6qeaix{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,35617,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Converter c1 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1rffrffle6qeaix.R.inc(35547);__CLR4_4_1rffrffle6qeaix.R.inc(35548);return Boolean.class;}finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}}
    };
    private static final Converter c2 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1rffrffle6qeaix.R.inc(35549);__CLR4_4_1rffrffle6qeaix.R.inc(35550);return Character.class;}finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}}
    };
    private static final Converter c3 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1rffrffle6qeaix.R.inc(35551);__CLR4_4_1rffrffle6qeaix.R.inc(35552);return Byte.class;}finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}}
    };
    private static final Converter c4 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1rffrffle6qeaix.R.inc(35553);__CLR4_4_1rffrffle6qeaix.R.inc(35554);return Short.class;}finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}}
    };
    private static final Converter c4a = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1rffrffle6qeaix.R.inc(35555);__CLR4_4_1rffrffle6qeaix.R.inc(35556);return Short.class;}finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}}
    };
    private static final Converter c5 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1rffrffle6qeaix.R.inc(35557);__CLR4_4_1rffrffle6qeaix.R.inc(35558);return Integer.class;}finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}}
    };
    
    public static void main(String[] args) {try{__CLR4_4_1rffrffle6qeaix.R.inc(35559);
        __CLR4_4_1rffrffle6qeaix.R.inc(35560);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rffrffle6qeaix.R.inc(35561);
        __CLR4_4_1rffrffle6qeaix.R.inc(35562);return new TestSuite(TestConverterSet.class);
    }finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}}

    public TestConverterSet(String name) {
        super(name);__CLR4_4_1rffrffle6qeaix.R.inc(35564);try{__CLR4_4_1rffrffle6qeaix.R.inc(35563);
    }finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testRemoveBadIndex11095() {__CLR4_4_1rffrffle6qeaix.R.globalSliceStart(getClass().getName(),35565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e2gl8wrfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rffrffle6qeaix.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rffrffle6qeaix.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testRemoveBadIndex11095",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e2gl8wrfx(){try{__CLR4_4_1rffrffle6qeaix.R.inc(35565); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35566);Converter[] array = new Converter[] { c1, c2, c3, c4 }; 
     __CLR4_4_1rffrffle6qeaix.R.inc(35567);ConverterSet set = new ConverterSet(array); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35568);try { 
         __CLR4_4_1rffrffle6qeaix.R.inc(35569);set.remove(200, null); 
         __CLR4_4_1rffrffle6qeaix.R.inc(35570);fail(); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1rffrffle6qeaix.R.inc(35571);assertEquals(4, set.size()); 
 }finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}} 


public void testBigHashtable1096() {__CLR4_4_1rffrffle6qeaix.R.globalSliceStart(getClass().getName(),35572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tccycrrg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rffrffle6qeaix.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rffrffle6qeaix.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testBigHashtable1096",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tccycrrg4(){try{__CLR4_4_1rffrffle6qeaix.R.inc(35572); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35573);Converter[] array = new Converter[] { c1, c2, c3, c4 }; 
     __CLR4_4_1rffrffle6qeaix.R.inc(35574);ConverterSet set = new ConverterSet(array); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35575);set.select(Boolean.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35576);set.select(Character.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35577);set.select(Byte.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35578);set.select(Short.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35579);set.select(Integer.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35580);set.select(Long.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35581);set.select(Float.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35582);set.select(Double.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35583);set.select(null); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35584);set.select(Calendar.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35585);set.select(GregorianCalendar.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35586);set.select(DateTime.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35587);set.select(DateMidnight.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35588);set.select(ReadableInstant.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35589);set.select(ReadableDateTime.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35590);set.select(ReadWritableInstant.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35591);set.select(ReadWritableDateTime.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35592);set.select(DateTime.class); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35593);assertEquals(4, set.size()); 
 }finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}} 


public void testAddNullRemoved31097() {__CLR4_4_1rffrffle6qeaix.R.globalSliceStart(getClass().getName(),35594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fv1qh9rgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rffrffle6qeaix.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rffrffle6qeaix.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testAddNullRemoved31097",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fv1qh9rgq(){try{__CLR4_4_1rffrffle6qeaix.R.inc(35594); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35595);Converter[] array = new Converter[] { c1, c2, c3, c4 }; 
     __CLR4_4_1rffrffle6qeaix.R.inc(35596);ConverterSet set = new ConverterSet(array); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35597);ConverterSet result = set.add(c4a, null); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35598);assertTrue(set != result); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35599);assertEquals(4, set.size()); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35600);assertEquals(4, result.size()); 
 }finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}} 


public void testAddNullRemoved21098() {__CLR4_4_1rffrffle6qeaix.R.globalSliceStart(getClass().getName(),35601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ar1tqlrgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rffrffle6qeaix.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rffrffle6qeaix.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testAddNullRemoved21098",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ar1tqlrgx(){try{__CLR4_4_1rffrffle6qeaix.R.inc(35601); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35602);Converter[] array = new Converter[] { c1, c2, c3, c4 }; 
     __CLR4_4_1rffrffle6qeaix.R.inc(35603);ConverterSet set = new ConverterSet(array); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35604);ConverterSet result = set.add(c4, null); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35605);assertSame(set, result); 
 }finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}} 


public void testAddNullRemoved11099() {__CLR4_4_1rffrffle6qeaix.R.globalSliceStart(getClass().getName(),35606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15n1wzxrh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rffrffle6qeaix.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rffrffle6qeaix.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testAddNullRemoved11099",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15n1wzxrh2(){try{__CLR4_4_1rffrffle6qeaix.R.inc(35606); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35607);Converter[] array = new Converter[] { c1, c2, c3, c4 }; 
     __CLR4_4_1rffrffle6qeaix.R.inc(35608);ConverterSet set = new ConverterSet(array); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35609);ConverterSet result = set.add(c5, null); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35610);assertEquals(4, set.size()); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35611);assertEquals(5, result.size()); 
 }finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}} 


public void testRemoveNullRemoved21101() {__CLR4_4_1rffrffle6qeaix.R.globalSliceStart(getClass().getName(),35612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dxtwdzrh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rffrffle6qeaix.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rffrffle6qeaix.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testRemoveNullRemoved21101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dxtwdzrh8(){try{__CLR4_4_1rffrffle6qeaix.R.inc(35612); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35613);Converter[] array = new Converter[] { c1, c2, c3, c4 }; 
     __CLR4_4_1rffrffle6qeaix.R.inc(35614);ConverterSet set = new ConverterSet(array); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35615);ConverterSet result = set.remove(c5, null); 
     __CLR4_4_1rffrffle6qeaix.R.inc(35616);assertSame(set, result); 
 }finally{__CLR4_4_1rffrffle6qeaix.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

}
