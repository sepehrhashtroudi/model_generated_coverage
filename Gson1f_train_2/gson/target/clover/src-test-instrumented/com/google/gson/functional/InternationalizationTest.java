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
public class InternationalizationTest extends TestCase {static class __CLR4_4_146x46xld3ms42x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,5454,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_146x46xld3ms42x.R.inc(5433);
    __CLR4_4_146x46xld3ms42x.R.inc(5434);super.setUp();
    __CLR4_4_146x46xld3ms42x.R.inc(5435);gson = new Gson();
  }finally{__CLR4_4_146x46xld3ms42x.R.flushNeeded();}}

  /*
  public void testStringsWithRawChineseCharactersSerialization() throws Exception {
    String target = "\u597d\u597d\u597d";
    String json = gson.toJson(target);
    String expected = "\"\\u597d\\u597d\\u597d\"";
    assertEquals(expected, json);
  }
  */

  public void testStringsWithRawChineseCharactersDeserialization() throws Exception {__CLR4_4_146x46xld3ms42x.R.globalSliceStart(getClass().getName(),5436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4bigf470();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_146x46xld3ms42x.R.rethrow($CLV_t2$);}finally{__CLR4_4_146x46xld3ms42x.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InternationalizationTest.testStringsWithRawChineseCharactersDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4bigf470() throws Exception{try{__CLR4_4_146x46xld3ms42x.R.inc(5436);
    __CLR4_4_146x46xld3ms42x.R.inc(5437);String expected = "\u597d\u597d\u597d";
    __CLR4_4_146x46xld3ms42x.R.inc(5438);String json = "\"" + expected + "\"";
    __CLR4_4_146x46xld3ms42x.R.inc(5439);String actual = gson.fromJson(json, String.class);
    __CLR4_4_146x46xld3ms42x.R.inc(5440);assertEquals(expected, actual);
  }finally{__CLR4_4_146x46xld3ms42x.R.flushNeeded();}}

  public void testStringsWithUnicodeChineseCharactersSerialization() throws Exception {__CLR4_4_146x46xld3ms42x.R.globalSliceStart(getClass().getName(),5441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ek3a6x475();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_146x46xld3ms42x.R.rethrow($CLV_t2$);}finally{__CLR4_4_146x46xld3ms42x.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InternationalizationTest.testStringsWithUnicodeChineseCharactersSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ek3a6x475() throws Exception{try{__CLR4_4_146x46xld3ms42x.R.inc(5441);
    __CLR4_4_146x46xld3ms42x.R.inc(5442);String target = "\u597d\u597d\u597d";
    __CLR4_4_146x46xld3ms42x.R.inc(5443);String json = gson.toJson(target);
    __CLR4_4_146x46xld3ms42x.R.inc(5444);String expected = "\"\u597d\u597d\u597d\"";
    __CLR4_4_146x46xld3ms42x.R.inc(5445);assertEquals(expected, json);
  }finally{__CLR4_4_146x46xld3ms42x.R.flushNeeded();}}

  public void testStringsWithUnicodeChineseCharactersDeserialization() throws Exception {__CLR4_4_146x46xld3ms42x.R.globalSliceStart(getClass().getName(),5446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15c3yy47a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_146x46xld3ms42x.R.rethrow($CLV_t2$);}finally{__CLR4_4_146x46xld3ms42x.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InternationalizationTest.testStringsWithUnicodeChineseCharactersDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15c3yy47a() throws Exception{try{__CLR4_4_146x46xld3ms42x.R.inc(5446);
    __CLR4_4_146x46xld3ms42x.R.inc(5447);String expected = "\u597d\u597d\u597d";
    __CLR4_4_146x46xld3ms42x.R.inc(5448);String json = "\"" + expected + "\"";
    __CLR4_4_146x46xld3ms42x.R.inc(5449);String actual = gson.fromJson(json, String.class);
    __CLR4_4_146x46xld3ms42x.R.inc(5450);assertEquals(expected, actual);
  }finally{__CLR4_4_146x46xld3ms42x.R.flushNeeded();}}

  public void testStringsWithUnicodeChineseCharactersEscapedDeserialization() throws Exception {__CLR4_4_146x46xld3ms42x.R.globalSliceStart(getClass().getName(),5451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17mpg6547f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_146x46xld3ms42x.R.rethrow($CLV_t2$);}finally{__CLR4_4_146x46xld3ms42x.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InternationalizationTest.testStringsWithUnicodeChineseCharactersEscapedDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17mpg6547f() throws Exception{try{__CLR4_4_146x46xld3ms42x.R.inc(5451);
    __CLR4_4_146x46xld3ms42x.R.inc(5452);String actual = gson.fromJson("'\\u597d\\u597d\\u597d'", String.class);
    __CLR4_4_146x46xld3ms42x.R.inc(5453);assertEquals("\u597d\u597d\u597d", actual);
  }finally{__CLR4_4_146x46xld3ms42x.R.flushNeeded();}}
}
