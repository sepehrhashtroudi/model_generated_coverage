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
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Class to test BitField functionality
 *
 * @version $Id$
 */
public class BitFieldTest  {static class __CLR4_4_1ezaezaldni84qa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,19431,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final BitField bf_multi  = new BitField(0x3F80);
    private static final BitField bf_single = new BitField(0x4000);
    private static final BitField bf_zero = new BitField(0);

    /**
     * test the getValue() method
     */
@Test(expected = IllegalArgumentException.class) public void testBitField1029() throws Exception {__CLR4_4_1ezaezaldni84qa.R.globalSliceStart(getClass().getName(),19414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s6v1joeza();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,105,116,70,105,101,108,100,49,48,50,57,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ezaezaldni84qa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ezaezaldni84qa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testBitField1029",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s6v1joeza() throws Exception{try{__CLR4_4_1ezaezaldni84qa.R.inc(19414); __CLR4_4_1ezaezaldni84qa.R.inc(19415);final BitField bf = new BitField(0); __CLR4_4_1ezaezaldni84qa.R.inc(19416);bf.setValue(1, 1); __CLR4_4_1ezaezaldni84qa.R.inc(19417);bf.setValue(2, 2); __CLR4_4_1ezaezaldni84qa.R.inc(19418);bf.setValue(3, 3); __CLR4_4_1ezaezaldni84qa.R.inc(19419);bf.setValue(4, 4); }finally{__CLR4_4_1ezaezaldni84qa.R.flushNeeded();}}
@Test(expected = IllegalArgumentException.class) public void testBitField1032() {__CLR4_4_1ezaezaldni84qa.R.globalSliceStart(getClass().getName(),19420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7zwjgezg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,105,116,70,105,101,108,100,49,48,51,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ezaezaldni84qa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ezaezaldni84qa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testBitField1032",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7zwjgezg(){try{__CLR4_4_1ezaezaldni84qa.R.inc(19420); __CLR4_4_1ezaezaldni84qa.R.inc(19421);final BitField bf = new BitField(1); __CLR4_4_1ezaezaldni84qa.R.inc(19422);bf.setValue(1, 1); __CLR4_4_1ezaezaldni84qa.R.inc(19423);bf.setValue(2, 2); __CLR4_4_1ezaezaldni84qa.R.inc(19424);bf.setValue(3, 3); }finally{__CLR4_4_1ezaezaldni84qa.R.flushNeeded();}}
@Test(expected = IllegalArgumentException.class) public void testBitField1035() throws Exception {__CLR4_4_1ezaezaldni84qa.R.globalSliceStart(getClass().getName(),19425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bh0061ezl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,105,116,70,105,101,108,100,49,48,51,53,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ezaezaldni84qa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ezaezaldni84qa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testBitField1035",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bh0061ezl() throws Exception{try{__CLR4_4_1ezaezaldni84qa.R.inc(19425); __CLR4_4_1ezaezaldni84qa.R.inc(19426);final BitField bf = new BitField(8); __CLR4_4_1ezaezaldni84qa.R.inc(19427);bf.setValue(0, 1); __CLR4_4_1ezaezaldni84qa.R.inc(19428);bf.setValue(1, 2); __CLR4_4_1ezaezaldni84qa.R.inc(19429);bf.setValue(2, 3); __CLR4_4_1ezaezaldni84qa.R.inc(19430);bf.setValue(3, 4); }finally{__CLR4_4_1ezaezaldni84qa.R.flushNeeded();}}
    

    /**
     * test the getShortValue() method
     */
    

    /**
     * test the getRawValue() method
     */
    

    /**
     * test the getShortRawValue() method
     */
    

    /**
     * test the isSet() method
     */
    

    /**
     * test the isAllSet() method
     */
    

    /**
     * test the setValue() method
     */
    

    /**
     * test the setShortValue() method
     */
    

    

    /**
     * test the clear() method
     */
    

    /**
     * test the clearShort() method
     */
    

    /**
     * test the set() method
     */
    

    /**
     * test the setShort() method
     */
    

    /**
     * test the setBoolean() method
     */
    

    /**
     * test the setShortBoolean() method
     */
    

}
