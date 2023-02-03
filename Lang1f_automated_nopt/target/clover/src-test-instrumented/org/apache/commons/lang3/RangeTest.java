/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Tests the methods in the {@link org.apache.commons.lang3.Range} class.
 * </p>
 * 
 * @version $Id$
 */
@SuppressWarnings("boxing")
public class RangeTest {static class __CLR4_4_1f9of9oldni84sw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,19820,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Range<Byte> byteRange;
    private Range<Byte> byteRange2;
    private Range<Byte> byteRange3;

    private Range<Integer> intRange;
    private Range<Long> longRange;
    private Range<Float> floatRange;
    private Range<Double> doubleRange;

    @SuppressWarnings("cast") // intRange
    @Before
    public void setUp() {try{__CLR4_4_1f9of9oldni84sw.R.inc(19788);
        __CLR4_4_1f9of9oldni84sw.R.inc(19789);byteRange   = Range.between((byte) 0, (byte) 5);
        __CLR4_4_1f9of9oldni84sw.R.inc(19790);byteRange2  = Range.between((byte) 0, (byte) 5);
        __CLR4_4_1f9of9oldni84sw.R.inc(19791);byteRange3  = Range.between((byte) 0, (byte) 10);

        __CLR4_4_1f9of9oldni84sw.R.inc(19792);intRange    = Range.between((int) 10, (int) 20);
        __CLR4_4_1f9of9oldni84sw.R.inc(19793);longRange   = Range.between((long) 10, (long) 20);
        __CLR4_4_1f9of9oldni84sw.R.inc(19794);floatRange  = Range.between((float) 10, (float) 20);
        __CLR4_4_1f9of9oldni84sw.R.inc(19795);doubleRange = Range.between((double) 10, (double) 20);
    }finally{__CLR4_4_1f9of9oldni84sw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
@Test
public void testGetters955() {__CLR4_4_1f9of9oldni84sw.R.globalSliceStart(getClass().getName(),19796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gnxzaif9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f9of9oldni84sw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f9of9oldni84sw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testGetters955",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gnxzaif9w(){try{__CLR4_4_1f9of9oldni84sw.R.inc(19796); __CLR4_4_1f9of9oldni84sw.R.inc(19797);Range<Integer> range = Range.between(0, 10); __CLR4_4_1f9of9oldni84sw.R.inc(19798);assertEquals(0, range.getMinimum().intValue()); __CLR4_4_1f9of9oldni84sw.R.inc(19799);assertEquals(10, range.getMaximum().intValue()); __CLR4_4_1f9of9oldni84sw.R.inc(19800);assertTrue(range.contains(0)); __CLR4_4_1f9of9oldni84sw.R.inc(19801);assertTrue(range.contains(10)); __CLR4_4_1f9of9oldni84sw.R.inc(19802);assertFalse(range.contains(0)); __CLR4_4_1f9of9oldni84sw.R.inc(19803);assertFalse(range.contains(10)); __CLR4_4_1f9of9oldni84sw.R.inc(19804);assertFalse(range.contains(10)); __CLR4_4_1f9of9oldni84sw.R.inc(19805);assertFalse(range.contains(10)); __CLR4_4_1f9of9oldni84sw.R.inc(19806);assertFalse(range.contains(10)); __CLR4_4_1f9of9oldni84sw.R.inc(19807);assertFalse(range.contains(10)); __CLR4_4_1f9of9oldni84sw.R.inc(19808);assertFalse(range.contains(10)); __CLR4_4_1f9of9oldni84sw.R.inc(19809);assertFalse(range.contains(10)); __CLR4_4_1f9of9oldni84sw.R.inc(19810);assertFalse(range.contains(10));
}finally{__CLR4_4_1f9of9oldni84sw.R.flushNeeded();}}

@Test(expected = IllegalArgumentException.class) public void nullElement() {__CLR4_4_1f9of9oldni84sw.R.globalSliceStart(getClass().getName(),19811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qc089wfab();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,110,117,108,108,69,108,101,109,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f9of9oldni84sw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f9of9oldni84sw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.nullElement",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qc089wfab(){try{__CLR4_4_1f9of9oldni84sw.R.inc(19811); __CLR4_4_1f9of9oldni84sw.R.inc(19812);Range<Integer> range = Range.between(Integer.valueOf(0), Integer.valueOf(10)); __CLR4_4_1f9of9oldni84sw.R.inc(19813);assertEquals(Integer.valueOf(0), range.getMinimum()); __CLR4_4_1f9of9oldni84sw.R.inc(19814);assertEquals(Integer.valueOf(10), range.getMaximum()); __CLR4_4_1f9of9oldni84sw.R.inc(19815);assertTrue(range.contains(Integer.valueOf(0))); __CLR4_4_1f9of9oldni84sw.R.inc(19816);assertTrue(range.contains(Integer.valueOf(10))); __CLR4_4_1f9of9oldni84sw.R.inc(19817);assertFalse(range.contains(Integer.valueOf(10))); __CLR4_4_1f9of9oldni84sw.R.inc(19818);assertFalse(range.contains(Integer.valueOf(10))); __CLR4_4_1f9of9oldni84sw.R.inc(19819);assertFalse(range.contains(Integer.valueOf(10))); }finally{__CLR4_4_1f9of9oldni84sw.R.flushNeeded();}}
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
