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
public class EscaperTest extends TestCase {static class __CLR4_4_130v30vld3ms3v4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,3958,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private Escaper escapeHtmlChar;
  private Escaper noEscapeHtmlChar;
  
  @Override
  protected void setUp() throws Exception {try{__CLR4_4_130v30vld3ms3v4.R.inc(3919);
    __CLR4_4_130v30vld3ms3v4.R.inc(3920);super.setUp();
    __CLR4_4_130v30vld3ms3v4.R.inc(3921);escapeHtmlChar = new Escaper(true);
    __CLR4_4_130v30vld3ms3v4.R.inc(3922);noEscapeHtmlChar = new Escaper(false);
  }finally{__CLR4_4_130v30vld3ms3v4.R.flushNeeded();}}


public void testUnicodeCharacterStringNoEscaping34() throws Exception {__CLR4_4_130v30vld3ms3v4.R.globalSliceStart(getClass().getName(),3923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nawb7a30z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_130v30vld3ms3v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_130v30vld3ms3v4.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testUnicodeCharacterStringNoEscaping34",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nawb7a30z() throws Exception{try{__CLR4_4_130v30vld3ms3v4.R.inc(3923); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3924);String unicodeString = "ef"; 
     __CLR4_4_130v30vld3ms3v4.R.inc(3925);String escapedString = escapeHtmlChar.escapeJsonString(unicodeString); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3926);assertEquals(unicodeString, escapedString); 
 }finally{__CLR4_4_130v30vld3ms3v4.R.flushNeeded();}} 


public void testRequiredEscapingUnicodeCharacter35() throws Exception {__CLR4_4_130v30vld3ms3v4.R.globalSliceStart(getClass().getName(),3927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esk90k313();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_130v30vld3ms3v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_130v30vld3ms3v4.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testRequiredEscapingUnicodeCharacter35",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esk90k313() throws Exception{try{__CLR4_4_130v30vld3ms3v4.R.inc(3927); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3928);char unicodeChar = '\u2028'; 
     __CLR4_4_130v30vld3ms3v4.R.inc(3929);String unicodeString = "Testing" + unicodeChar; 
     __CLR4_4_130v30vld3ms3v4.R.inc(3930);String escapedString = escapeHtmlChar.escapeJsonString(unicodeString); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3931);assertFalse(unicodeString.equals(escapedString)); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3932);assertEquals("Testing\\u2028", escapedString); 
 }finally{__CLR4_4_130v30vld3ms3v4.R.flushNeeded();}} 


public void testTabEscaping36() throws Exception {__CLR4_4_130v30vld3ms3v4.R.globalSliceStart(getClass().getName(),3933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwwmz9319();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_130v30vld3ms3v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_130v30vld3ms3v4.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testTabEscaping36",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwwmz9319() throws Exception{try{__CLR4_4_130v30vld3ms3v4.R.inc(3933); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3934);String containsTab = "123\t456"; 
     __CLR4_4_130v30vld3ms3v4.R.inc(3935);String escapedString = escapeHtmlChar.escapeJsonString(containsTab); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3936);assertEquals("123\\t456", escapedString); 
 }finally{__CLR4_4_130v30vld3ms3v4.R.flushNeeded();}} 


public void testNewlineEscaping37() throws Exception {__CLR4_4_130v30vld3ms3v4.R.globalSliceStart(getClass().getName(),3937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fm6qy331d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_130v30vld3ms3v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_130v30vld3ms3v4.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testNewlineEscaping37",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fm6qy331d() throws Exception{try{__CLR4_4_130v30vld3ms3v4.R.inc(3937); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3938);String containsNewline = "123\n456"; 
     __CLR4_4_130v30vld3ms3v4.R.inc(3939);String escapedString = escapeHtmlChar.escapeJsonString(containsNewline); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3940);assertEquals("123\\n456", escapedString); 
 }finally{__CLR4_4_130v30vld3ms3v4.R.flushNeeded();}} 


public void testSlashEscaping38() throws Exception {__CLR4_4_130v30vld3ms3v4.R.globalSliceStart(getClass().getName(),3941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1328i0b31h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_130v30vld3ms3v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_130v30vld3ms3v4.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testSlashEscaping38",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1328i0b31h() throws Exception{try{__CLR4_4_130v30vld3ms3v4.R.inc(3941); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3942);String containsSlash = "123\\456"; 
     __CLR4_4_130v30vld3ms3v4.R.inc(3943);String escapedString = escapeHtmlChar.escapeJsonString(containsSlash); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3944);assertEquals("123\\\\456", escapedString); 
 }finally{__CLR4_4_130v30vld3ms3v4.R.flushNeeded();}} 


public void testDoubleQuoteEscaping39() throws Exception {__CLR4_4_130v30vld3ms3v4.R.globalSliceStart(getClass().getName(),3945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17odjfo31l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_130v30vld3ms3v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_130v30vld3ms3v4.R.globalSliceEnd(getClass().getName(),"com.google.gson.EscaperTest.testDoubleQuoteEscaping39",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17odjfo31l() throws Exception{try{__CLR4_4_130v30vld3ms3v4.R.inc(3945); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3946);String containsQuote = "123\"456"; 
     __CLR4_4_130v30vld3ms3v4.R.inc(3947);String escapedString = escapeHtmlChar.escapeJsonString(containsQuote); 
     __CLR4_4_130v30vld3ms3v4.R.inc(3948);assertEquals("123\\\"456", escapedString); 
 }finally{__CLR4_4_130v30vld3ms3v4.R.flushNeeded();}} 

  

  

  

  

  
  
  

  

  

  

  

  

  

  

  

  

  

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

  private String convertToUnicodeString(int codepoint) {try{__CLR4_4_130v30vld3ms3v4.R.inc(3949);
    __CLR4_4_130v30vld3ms3v4.R.inc(3950);String hexValue = Integer.toHexString(codepoint);
    __CLR4_4_130v30vld3ms3v4.R.inc(3951);StringBuilder sb = new StringBuilder("\\u");
    __CLR4_4_130v30vld3ms3v4.R.inc(3952);for (int i = 0; (((i < 4 - hexValue.length())&&(__CLR4_4_130v30vld3ms3v4.R.iget(3953)!=0|true))||(__CLR4_4_130v30vld3ms3v4.R.iget(3954)==0&false)); i++) {{
      __CLR4_4_130v30vld3ms3v4.R.inc(3955);sb.append(0);
    }
    }__CLR4_4_130v30vld3ms3v4.R.inc(3956);sb.append(hexValue);

    __CLR4_4_130v30vld3ms3v4.R.inc(3957);return sb.toString().toLowerCase();
  }finally{__CLR4_4_130v30vld3ms3v4.R.flushNeeded();}}
}
