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
public class TestConverterSet extends TestCase {static class __CLR4_4_1r92r92le6qsfid{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,35389,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Converter c1 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1r92r92le6qsfid.R.inc(35318);__CLR4_4_1r92r92le6qsfid.R.inc(35319);return Boolean.class;}finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}}
    };
    private static final Converter c2 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1r92r92le6qsfid.R.inc(35320);__CLR4_4_1r92r92le6qsfid.R.inc(35321);return Character.class;}finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}}
    };
    private static final Converter c3 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1r92r92le6qsfid.R.inc(35322);__CLR4_4_1r92r92le6qsfid.R.inc(35323);return Byte.class;}finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}}
    };
    private static final Converter c4 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1r92r92le6qsfid.R.inc(35324);__CLR4_4_1r92r92le6qsfid.R.inc(35325);return Short.class;}finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}}
    };
    private static final Converter c4a = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1r92r92le6qsfid.R.inc(35326);__CLR4_4_1r92r92le6qsfid.R.inc(35327);return Short.class;}finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}}
    };
    private static final Converter c5 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1r92r92le6qsfid.R.inc(35328);__CLR4_4_1r92r92le6qsfid.R.inc(35329);return Integer.class;}finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}}
    };
    
    public static void main(String[] args) {try{__CLR4_4_1r92r92le6qsfid.R.inc(35330);
        __CLR4_4_1r92r92le6qsfid.R.inc(35331);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1r92r92le6qsfid.R.inc(35332);
        __CLR4_4_1r92r92le6qsfid.R.inc(35333);return new TestSuite(TestConverterSet.class);
    }finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}}

    public TestConverterSet(String name) {
        super(name);__CLR4_4_1r92r92le6qsfid.R.inc(35335);try{__CLR4_4_1r92r92le6qsfid.R.inc(35334);
    }finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testRemoveBadIndex11085() {__CLR4_4_1r92r92le6qsfid.R.globalSliceStart(getClass().getName(),35336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fnebanr9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r92r92le6qsfid.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r92r92le6qsfid.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testRemoveBadIndex11085",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fnebanr9k(){try{__CLR4_4_1r92r92le6qsfid.R.inc(35336); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35337);Converter[] array = new Converter[] { c1, c2, c3, c4 }; 
     __CLR4_4_1r92r92le6qsfid.R.inc(35338);ConverterSet set = new ConverterSet(array); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35339);try { 
         __CLR4_4_1r92r92le6qsfid.R.inc(35340);set.remove(200, null); 
         __CLR4_4_1r92r92le6qsfid.R.inc(35341);fail(); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1r92r92le6qsfid.R.inc(35342);assertEquals(4, set.size()); 
 }finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}} 


public void testBigHashtable1086() {__CLR4_4_1r92r92le6qsfid.R.globalSliceStart(getClass().getName(),35343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1byw72ur9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r92r92le6qsfid.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r92r92le6qsfid.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testBigHashtable1086",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1byw72ur9r(){try{__CLR4_4_1r92r92le6qsfid.R.inc(35343); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35344);Converter[] array = new Converter[] { c1, c2, c3, c4 }; 
     __CLR4_4_1r92r92le6qsfid.R.inc(35345);ConverterSet set = new ConverterSet(array); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35346);set.select(Boolean.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35347);set.select(Character.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35348);set.select(Byte.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35349);set.select(Short.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35350);set.select(Integer.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35351);set.select(Long.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35352);set.select(Float.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35353);set.select(Double.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35354);set.select(null); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35355);set.select(Calendar.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35356);set.select(GregorianCalendar.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35357);set.select(DateTime.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35358);set.select(DateMidnight.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35359);set.select(ReadableInstant.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35360);set.select(ReadableDateTime.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35361);set.select(ReadWritableInstant.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35362);set.select(ReadWritableDateTime.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35363);set.select(DateTime.class); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35364);assertEquals(4, set.size()); 
 }finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}} 


public void testAddNullRemoved31087() {__CLR4_4_1r92r92le6qsfid.R.globalSliceStart(getClass().getName(),35365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dut62arad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r92r92le6qsfid.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r92r92le6qsfid.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testAddNullRemoved31087",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dut62arad(){try{__CLR4_4_1r92r92le6qsfid.R.inc(35365); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35366);Converter[] array = new Converter[] { c1, c2, c3, c4 }; 
     __CLR4_4_1r92r92le6qsfid.R.inc(35367);ConverterSet set = new ConverterSet(array); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35368);ConverterSet result = set.add(c4a, null); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35369);assertTrue(set != result); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35370);assertEquals(4, set.size()); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35371);assertEquals(4, result.size()); 
 }finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}} 


public void testAddNullRemoved21088() {__CLR4_4_1r92r92le6qsfid.R.globalSliceStart(getClass().getName(),35372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyt2syrak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r92r92le6qsfid.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r92r92le6qsfid.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testAddNullRemoved21088",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyt2syrak(){try{__CLR4_4_1r92r92le6qsfid.R.inc(35372); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35373);Converter[] array = new Converter[] { c1, c2, c3, c4 }; 
     __CLR4_4_1r92r92le6qsfid.R.inc(35374);ConverterSet set = new ConverterSet(array); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35375);ConverterSet result = set.add(c4, null); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35376);assertSame(set, result); 
 }finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}} 


public void testAddNullRemoved11090() {__CLR4_4_1r92r92le6qsfid.R.globalSliceStart(getClass().getName(),35377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nlxs4crap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r92r92le6qsfid.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r92r92le6qsfid.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testAddNullRemoved11090",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nlxs4crap(){try{__CLR4_4_1r92r92le6qsfid.R.inc(35377); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35378);Converter[] array = new Converter[] { c1, c2, c3, c4 }; 
     __CLR4_4_1r92r92le6qsfid.R.inc(35379);ConverterSet set = new ConverterSet(array); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35380);ConverterSet result = set.add(c5, null); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35381);assertEquals(4, set.size()); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35382);assertEquals(5, result.size()); 
 }finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}} 


public void testRemoveNullRemoved11092() {__CLR4_4_1r92r92le6qsfid.R.globalSliceStart(getClass().getName(),35383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15p1eibrav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r92r92le6qsfid.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r92r92le6qsfid.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testRemoveNullRemoved11092",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15p1eibrav(){try{__CLR4_4_1r92r92le6qsfid.R.inc(35383); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35384);Converter[] array = new Converter[] { c1, c2, c3, c4 }; 
     __CLR4_4_1r92r92le6qsfid.R.inc(35385);ConverterSet set = new ConverterSet(array); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35386);ConverterSet result = set.remove(c3, null); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35387);assertEquals(4, set.size()); 
     __CLR4_4_1r92r92le6qsfid.R.inc(35388);assertEquals(3, result.size()); 
 }finally{__CLR4_4_1r92r92le6qsfid.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

}
