/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson.functional;

import com.google.gson.Gson;

import junit.framework.TestCase;

/**
 * Functional tests for internationalized strings.
 *
 * @author Inderjeet Singh
 */
public class InternationalizationTest extends TestCase {static class __CLR4_4_13p93p9le6or9yq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676526778980L,8589935092L,4818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13p93p9le6or9yq.R.inc(4797);
    __CLR4_4_13p93p9le6or9yq.R.inc(4798);super.setUp();
    __CLR4_4_13p93p9le6or9yq.R.inc(4799);gson = new Gson();
  }finally{__CLR4_4_13p93p9le6or9yq.R.flushNeeded();}}

  /*
  public void testStringsWithRawChineseCharactersSerialization() throws Exception {
    String target = "\u597d\u597d\u597d";
    String json = gson.toJson(target);
    String expected = "\"\\u597d\\u597d\\u597d\"";
    assertEquals(expected, json);
  }
  */

  public void testStringsWithRawChineseCharactersDeserialization() throws Exception {__CLR4_4_13p93p9le6or9yq.R.globalSliceStart(getClass().getName(),4800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4bigf3pc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13p93p9le6or9yq.R.rethrow($CLV_t2$);}finally{__CLR4_4_13p93p9le6or9yq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InternationalizationTest.testStringsWithRawChineseCharactersDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4bigf3pc() throws Exception{try{__CLR4_4_13p93p9le6or9yq.R.inc(4800);
    __CLR4_4_13p93p9le6or9yq.R.inc(4801);String expected = "\u597d\u597d\u597d";
    __CLR4_4_13p93p9le6or9yq.R.inc(4802);String json = "\"" + expected + "\"";
    __CLR4_4_13p93p9le6or9yq.R.inc(4803);String actual = gson.fromJson(json, String.class);
    __CLR4_4_13p93p9le6or9yq.R.inc(4804);assertEquals(expected, actual);
  }finally{__CLR4_4_13p93p9le6or9yq.R.flushNeeded();}}

  public void testStringsWithUnicodeChineseCharactersSerialization() throws Exception {__CLR4_4_13p93p9le6or9yq.R.globalSliceStart(getClass().getName(),4805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ek3a6x3ph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13p93p9le6or9yq.R.rethrow($CLV_t2$);}finally{__CLR4_4_13p93p9le6or9yq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InternationalizationTest.testStringsWithUnicodeChineseCharactersSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ek3a6x3ph() throws Exception{try{__CLR4_4_13p93p9le6or9yq.R.inc(4805);
    __CLR4_4_13p93p9le6or9yq.R.inc(4806);String target = "\u597d\u597d\u597d";
    __CLR4_4_13p93p9le6or9yq.R.inc(4807);String json = gson.toJson(target);
    __CLR4_4_13p93p9le6or9yq.R.inc(4808);String expected = "\"\u597d\u597d\u597d\"";
    __CLR4_4_13p93p9le6or9yq.R.inc(4809);assertEquals(expected, json);
  }finally{__CLR4_4_13p93p9le6or9yq.R.flushNeeded();}}

  public void testStringsWithUnicodeChineseCharactersDeserialization() throws Exception {__CLR4_4_13p93p9le6or9yq.R.globalSliceStart(getClass().getName(),4810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15c3yy3pm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13p93p9le6or9yq.R.rethrow($CLV_t2$);}finally{__CLR4_4_13p93p9le6or9yq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InternationalizationTest.testStringsWithUnicodeChineseCharactersDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15c3yy3pm() throws Exception{try{__CLR4_4_13p93p9le6or9yq.R.inc(4810);
    __CLR4_4_13p93p9le6or9yq.R.inc(4811);String expected = "\u597d\u597d\u597d";
    __CLR4_4_13p93p9le6or9yq.R.inc(4812);String json = "\"" + expected + "\"";
    __CLR4_4_13p93p9le6or9yq.R.inc(4813);String actual = gson.fromJson(json, String.class);
    __CLR4_4_13p93p9le6or9yq.R.inc(4814);assertEquals(expected, actual);
  }finally{__CLR4_4_13p93p9le6or9yq.R.flushNeeded();}}

  public void testStringsWithUnicodeChineseCharactersEscapedDeserialization() throws Exception {__CLR4_4_13p93p9le6or9yq.R.globalSliceStart(getClass().getName(),4815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17mpg653pr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13p93p9le6or9yq.R.rethrow($CLV_t2$);}finally{__CLR4_4_13p93p9le6or9yq.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InternationalizationTest.testStringsWithUnicodeChineseCharactersEscapedDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17mpg653pr() throws Exception{try{__CLR4_4_13p93p9le6or9yq.R.inc(4815);
    __CLR4_4_13p93p9le6or9yq.R.inc(4816);String actual = gson.fromJson("'\\u597d\\u597d\\u597d'", String.class);
    __CLR4_4_13p93p9le6or9yq.R.inc(4817);assertEquals("\u597d\u597d\u597d", actual);
  }finally{__CLR4_4_13p93p9le6or9yq.R.flushNeeded();}}
}
