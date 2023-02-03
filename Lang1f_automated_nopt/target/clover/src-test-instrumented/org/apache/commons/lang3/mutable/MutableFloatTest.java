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
package org.apache.commons.lang3.mutable;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit tests.
 * 
 * @version $Id$
 * @see MutableFloat
 */
public class MutableFloatTest {static class __CLR4_4_1g8cg8cldni84z6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,21070,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
@Test
public void testToFloat96() {__CLR4_4_1g8cg8cldni84z6.R.globalSliceStart(getClass().getName(),21036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y4cmabg8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g8cg8cldni84z6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g8cg8cldni84z6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testToFloat96",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y4cmabg8c(){try{__CLR4_4_1g8cg8cldni84z6.R.inc(21036); __CLR4_4_1g8cg8cldni84z6.R.inc(21037);final MutableFloat float1 = new MutableFloat(1.0f); __CLR4_4_1g8cg8cldni84z6.R.inc(21038);assertEquals(Float.valueOf(1.0f), float1.toFloat()); __CLR4_4_1g8cg8cldni84z6.R.inc(21039);final MutableFloat float2 = new MutableFloat(-1.0f); __CLR4_4_1g8cg8cldni84z6.R.inc(21040);assertEquals(Float.valueOf(-1.0f), float2.toFloat()); __CLR4_4_1g8cg8cldni84z6.R.inc(21041);final MutableFloat float3 = new MutableFloat(0.0f); __CLR4_4_1g8cg8cldni84z6.R.inc(21042);assertEquals(Float.valueOf(0.0f), float3.toFloat()); __CLR4_4_1g8cg8cldni84z6.R.inc(21043);final MutableFloat float4 = new MutableFloat(1.0f); __CLR4_4_1g8cg8cldni84z6.R.inc(21044);assertEquals(Float.valueOf(1.0f), float4.toFloat()); }finally{__CLR4_4_1g8cg8cldni84z6.R.flushNeeded();}}
@Test
public void testLongValue1061() {__CLR4_4_1g8cg8cldni84z6.R.globalSliceStart(getClass().getName(),21045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zbqq04g8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g8cg8cldni84z6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g8cg8cldni84z6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testLongValue1061",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zbqq04g8l(){try{__CLR4_4_1g8cg8cldni84z6.R.inc(21045); __CLR4_4_1g8cg8cldni84z6.R.inc(21046);final MutableFloat f1 = new MutableFloat(1f); __CLR4_4_1g8cg8cldni84z6.R.inc(21047);assertEquals(1, f1.longValue()); __CLR4_4_1g8cg8cldni84z6.R.inc(21048);final MutableFloat f2 = new MutableFloat(-1f); __CLR4_4_1g8cg8cldni84z6.R.inc(21049);assertEquals(-1, f2.longValue()); __CLR4_4_1g8cg8cldni84z6.R.inc(21050);final MutableFloat f3 = new MutableFloat(Float.NEGATIVE_INFINITY); __CLR4_4_1g8cg8cldni84z6.R.inc(21051);assertEquals(Float.NEGATIVE_INFINITY, f3.longValue()); __CLR4_4_1g8cg8cldni84z6.R.inc(21052);final MutableFloat f4 = new MutableFloat(Float.NEGATIVE_INFINITY); __CLR4_4_1g8cg8cldni84z6.R.inc(21053);assertEquals(Float.NEGATIVE_INFINITY, f4.longValue()); }finally{__CLR4_4_1g8cg8cldni84z6.R.flushNeeded();}}
@Test
public void testDecrement1062() {__CLR4_4_1g8cg8cldni84z6.R.globalSliceStart(getClass().getName(),21054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vppo5fg8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g8cg8cldni84z6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g8cg8cldni84z6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testDecrement1062",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vppo5fg8u(){try{__CLR4_4_1g8cg8cldni84z6.R.inc(21054); __CLR4_4_1g8cg8cldni84z6.R.inc(21055);final MutableFloat float1 = new MutableFloat(); __CLR4_4_1g8cg8cldni84z6.R.inc(21056);float1.setValue(1.0f); __CLR4_4_1g8cg8cldni84z6.R.inc(21057);float1.decrement(); __CLR4_4_1g8cg8cldni84z6.R.inc(21058);assertEquals(Float.valueOf(1.0f), float1.getValue()); __CLR4_4_1g8cg8cldni84z6.R.inc(21059);final MutableFloat float2 = new MutableFloat(); __CLR4_4_1g8cg8cldni84z6.R.inc(21060);float2.setValue(-1.0f); __CLR4_4_1g8cg8cldni84z6.R.inc(21061);float2.decrement(); __CLR4_4_1g8cg8cldni84z6.R.inc(21062);assertEquals(Float.valueOf(-1.0f), float2.getValue()); }finally{__CLR4_4_1g8cg8cldni84z6.R.flushNeeded();}}
@Test
public void testDecrement1063() {__CLR4_4_1g8cg8cldni84z6.R.globalSliceStart(getClass().getName(),21063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yypmxwg93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g8cg8cldni84z6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g8cg8cldni84z6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testDecrement1063",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yypmxwg93(){try{__CLR4_4_1g8cg8cldni84z6.R.inc(21063); __CLR4_4_1g8cg8cldni84z6.R.inc(21064);final MutableFloat float1 = new MutableFloat(1.0f); __CLR4_4_1g8cg8cldni84z6.R.inc(21065);float1.decrement(); __CLR4_4_1g8cg8cldni84z6.R.inc(21066);assertEquals(Float.valueOf(1.0f), float1.getValue()); __CLR4_4_1g8cg8cldni84z6.R.inc(21067);final MutableFloat float2 = new MutableFloat(-1.0f); __CLR4_4_1g8cg8cldni84z6.R.inc(21068);float2.decrement(); __CLR4_4_1g8cg8cldni84z6.R.inc(21069);assertEquals(Float.valueOf(-1.0f), float2.getValue()); }finally{__CLR4_4_1g8cg8cldni84z6.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

}
