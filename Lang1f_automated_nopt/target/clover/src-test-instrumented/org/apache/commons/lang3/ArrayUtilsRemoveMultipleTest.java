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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tests ArrayUtils remove and removeElement methods.
 * 
 * @version $Id$
 */
public class ArrayUtilsRemoveMultipleTest {static class __CLR4_4_1ey6ey6ldni84px{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,19394,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

@Test
public void removeElementsTest() {__CLR4_4_1ey6ey6ldni84px.R.globalSliceStart(getClass().getName(),19374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1paa0s4ey6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ey6ey6ldni84px.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ey6ey6ldni84px.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.removeElementsTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1paa0s4ey6(){try{__CLR4_4_1ey6ey6ldni84px.R.inc(19374); __CLR4_4_1ey6ey6ldni84px.R.inc(19375);final short[] data = new short[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; __CLR4_4_1ey6ey6ldni84px.R.inc(19376);final short[] data2 = new short[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; __CLR4_4_1ey6ey6ldni84px.R.inc(19377);final short[] data3 = new short[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; __CLR4_4_1ey6ey6ldni84px.R.inc(19378);final short[] data4 = new short[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; __CLR4_4_1ey6ey6ldni84px.R.inc(19379);final short[] data5 = new short[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
}finally{__CLR4_4_1ey6ey6ldni84px.R.flushNeeded();}}

@Test
public void removeElements() {__CLR4_4_1ey6ey6ldni84px.R.globalSliceStart(getClass().getName(),19380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewaglaeyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ey6ey6ldni84px.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ey6ey6ldni84px.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.removeElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewaglaeyc(){try{__CLR4_4_1ey6ey6ldni84px.R.inc(19380); __CLR4_4_1ey6ey6ldni84px.R.inc(19381);final byte[] a = new byte[] { 1, 2, 3, 4, 5 }; __CLR4_4_1ey6ey6ldni84px.R.inc(19382);final byte[] b = new byte[] { 1, 2, 3, 4, 5 }; __CLR4_4_1ey6ey6ldni84px.R.inc(19383);final byte[] c = new byte[] { 1, 2, 3, 4, 5 }; __CLR4_4_1ey6ey6ldni84px.R.inc(19384);final byte[] d = new byte[] { 1, 2, 3, 4, 5 }; __CLR4_4_1ey6ey6ldni84px.R.inc(19385);final byte[] e = new byte[] { 1, 2, 3, 4, 5 }; __CLR4_4_1ey6ey6ldni84px.R.inc(19386);final byte[] f = new byte[] { 1, 2, 3, 4, 5 }; __CLR4_4_1ey6ey6ldni84px.R.inc(19387);final byte[] g = new byte[] { 1, 2, 3, 4, 5 };
}finally{__CLR4_4_1ey6ey6ldni84px.R.flushNeeded();}}

@Test
public void testRemoveElements420() {__CLR4_4_1ey6ey6ldni84px.R.globalSliceStart(getClass().getName(),19388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rystskeyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ey6ey6ldni84px.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ey6ey6ldni84px.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElements420",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rystskeyk(){try{__CLR4_4_1ey6ey6ldni84px.R.inc(19388); __CLR4_4_1ey6ey6ldni84px.R.inc(19389);final short[] data = new short[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; __CLR4_4_1ey6ey6ldni84px.R.inc(19390);final short[] data2 = new short[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; __CLR4_4_1ey6ey6ldni84px.R.inc(19391);final short[] data3 = new short[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; __CLR4_4_1ey6ey6ldni84px.R.inc(19392);final short[] data4 = new short[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; __CLR4_4_1ey6ey6ldni84px.R.inc(19393);final short[] data5 = new short[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
}finally{__CLR4_4_1ey6ey6ldni84px.R.flushNeeded();}}

//@Test
//public void removeElementsTest() { final byte[] data = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; final byte[] data2 = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; final byte[] data3 = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; final byte[] data4 = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; final byte[] data5 = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
//}

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

}
