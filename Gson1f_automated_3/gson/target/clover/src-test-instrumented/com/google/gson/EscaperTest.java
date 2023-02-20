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

package com.google.gson;

import junit.framework.TestCase;

/**
 * Performs some unit testing for the {@link Escaper} class.
 *
 * @author Joel Leitch
 */
public class EscaperTest extends TestCase {static class __CLR4_4_130i30ile6p1zwd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676527279339L,8589935092L,3929,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private Escaper escapeHtmlChar;
  private Escaper noEscapeHtmlChar;
  
  @Override
  protected void setUp() throws Exception {try{__CLR4_4_130i30ile6p1zwd.R.inc(3906);
    __CLR4_4_130i30ile6p1zwd.R.inc(3907);super.setUp();
    __CLR4_4_130i30ile6p1zwd.R.inc(3908);escapeHtmlChar = new Escaper(true);
    __CLR4_4_130i30ile6p1zwd.R.inc(3909);noEscapeHtmlChar = new Escaper(false);
  }finally{__CLR4_4_130i30ile6p1zwd.R.flushNeeded();}}

public void testRequiredEscapingUnicodeCharacter11() throws Exception {__CLR4_4_130i30ile6p1zwd.R.globalSliceStart(getClass().getName(),3910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ddymqq30m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_130i30ile6p1zwd.R.rethrow($CLV_t2$);}finally{__CLR4_4_130i30ile6p1zwd.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testRequiredEscapingUnicodeCharacter11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ddymqq30m() throws Exception{try{__CLR4_4_130i30ile6p1zwd.R.inc(3910); 
     __CLR4_4_130i30ile6p1zwd.R.inc(3911);char unicodeChar = '\u2028'; 
     __CLR4_4_130i30ile6p1zwd.R.inc(3912);String unicodeString = "Testing" + unicodeChar; 
     __CLR4_4_130i30ile6p1zwd.R.inc(3913);String escapedString = escapeHtmlChar.escapeJsonString(unicodeString); 
     __CLR4_4_130i30ile6p1zwd.R.inc(3914);assertFalse(unicodeString.equals(escapedString)); 
     __CLR4_4_130i30ile6p1zwd.R.inc(3915);assertEquals("Testing\\u2028", escapedString); 
 }finally{__CLR4_4_130i30ile6p1zwd.R.flushNeeded();}}
public void testCarrageReturnEscaping12() throws Exception {__CLR4_4_130i30ile6p1zwd.R.globalSliceStart(getClass().getName(),3916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ime9x30s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_130i30ile6p1zwd.R.rethrow($CLV_t2$);}finally{__CLR4_4_130i30ile6p1zwd.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testCarrageReturnEscaping12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ime9x30s() throws Exception{try{__CLR4_4_130i30ile6p1zwd.R.inc(3916); 
     __CLR4_4_130i30ile6p1zwd.R.inc(3917);String containsCarrageReturn = "123\r456"; 
     __CLR4_4_130i30ile6p1zwd.R.inc(3918);String escapedString = escapeHtmlChar.escapeJsonString(containsCarrageReturn); 
     __CLR4_4_130i30ile6p1zwd.R.inc(3919);assertEquals("123\\r456", escapedString); 
 }finally{__CLR4_4_130i30ile6p1zwd.R.flushNeeded();}}
  

  

  

  

  
  
  

  

  

  

  

  

  

  

  

  

  

  /*
  public void testChineseCharacterEscaping() throws Exception {
    String unicodeString = "\u597d\u597d\u597d";
    String chineseString = "\u597d\u597d\u597d";
    assertEquals(unicodeString, chineseString);

    String expectedEscapedString = "\\u597d\\u597d\\u597d";
    String escapedString = Escaper.escapeJsonString(chineseString);
    assertEquals(expectedEscapedString, escapedString);
  }
   */

  private String convertToUnicodeString(int codepoint) {try{__CLR4_4_130i30ile6p1zwd.R.inc(3920);
    __CLR4_4_130i30ile6p1zwd.R.inc(3921);String hexValue = Integer.toHexString(codepoint);
    __CLR4_4_130i30ile6p1zwd.R.inc(3922);StringBuilder sb = new StringBuilder("\\u");
    __CLR4_4_130i30ile6p1zwd.R.inc(3923);for (int i = 0; (((i < 4 - hexValue.length())&&(__CLR4_4_130i30ile6p1zwd.R.iget(3924)!=0|true))||(__CLR4_4_130i30ile6p1zwd.R.iget(3925)==0&false)); i++) {{
      __CLR4_4_130i30ile6p1zwd.R.inc(3926);sb.append(0);
    }
    }__CLR4_4_130i30ile6p1zwd.R.inc(3927);sb.append(hexValue);

    __CLR4_4_130i30ile6p1zwd.R.inc(3928);return sb.toString().toLowerCase();
  }finally{__CLR4_4_130i30ile6p1zwd.R.flushNeeded();}}
}
