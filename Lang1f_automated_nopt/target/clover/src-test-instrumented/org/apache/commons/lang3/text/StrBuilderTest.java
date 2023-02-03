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

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.StrBuilder}.
 * 
 * @version $Id$
 */
public class StrBuilderTest {static class __CLR4_4_1gg9gg9ldni850w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,21395,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
@Test
public void testReplaceImpl241() {__CLR4_4_1gg9gg9ldni850w.R.globalSliceStart(getClass().getName(),21321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vu0vakgg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gg9gg9ldni850w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gg9gg9ldni850w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceImpl241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vu0vakgg9(){try{__CLR4_4_1gg9gg9ldni850w.R.inc(21321); __CLR4_4_1gg9gg9ldni850w.R.inc(21322);StrBuilder builder = new StrBuilder(); __CLR4_4_1gg9gg9ldni850w.R.inc(21323);builder.setLength(4); __CLR4_4_1gg9gg9ldni850w.R.inc(21324);builder.append("ab"); __CLR4_4_1gg9gg9ldni850w.R.inc(21325);builder.append("cd"); __CLR4_4_1gg9gg9ldni850w.R.inc(21326);builder.append("e"); __CLR4_4_1gg9gg9ldni850w.R.inc(21327);builder.append("f"); __CLR4_4_1gg9gg9ldni850w.R.inc(21328);builder.append("g"); __CLR4_4_1gg9gg9ldni850w.R.inc(21329);builder.append("h"); __CLR4_4_1gg9gg9ldni850w.R.inc(21330);builder.append("i"); __CLR4_4_1gg9gg9ldni850w.R.inc(21331);builder.append("j"); __CLR4_4_1gg9gg9ldni850w.R.inc(21332);builder.append("k"); __CLR4_4_1gg9gg9ldni850w.R.inc(21333);builder.append("l"); __CLR4_4_1gg9gg9ldni850w.R.inc(21334);String str = builder.toString(); __CLR4_4_1gg9gg9ldni850w.R.inc(21335);System.out.println(str); __CLR4_4_1gg9gg9ldni850w.R.inc(21336);assertEquals("ab", str); __CLR4_4_1gg9gg9ldni850w.R.inc(21337);assertEquals("cd", str); __CLR4_4_1gg9gg9ldni850w.R.inc(21338);assertEquals("e", str); __CLR4_4_1gg9gg9ldni850w.R.inc(21339);assertEquals("f", str); __CLR4_4_1gg9gg9ldni850w.R.inc(21340);assertEquals("g", str); __CLR4_4_1gg9gg9ldni850w.R.inc(21341);assertEquals("h", str); }finally{__CLR4_4_1gg9gg9ldni850w.R.flushNeeded();}}
@Test
public void replaceImpl() {__CLR4_4_1gg9gg9ldni850w.R.globalSliceStart(getClass().getName(),21342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mlpkrggu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gg9gg9ldni850w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gg9gg9ldni850w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.replaceImpl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mlpkrggu(){try{__CLR4_4_1gg9gg9ldni850w.R.inc(21342); __CLR4_4_1gg9gg9ldni850w.R.inc(21343);StrBuilder builder = new StrBuilder(); __CLR4_4_1gg9gg9ldni850w.R.inc(21344);StringBuilder sb = new StringBuilder(); __CLR4_4_1gg9gg9ldni850w.R.inc(21345);StringBuilder sb1 = new StringBuilder(); __CLR4_4_1gg9gg9ldni850w.R.inc(21346);sb1.append("Hello"); __CLR4_4_1gg9gg9ldni850w.R.inc(21347);sb1.append("World"); __CLR4_4_1gg9gg9ldni850w.R.inc(21348);sb1.append("!"); __CLR4_4_1gg9gg9ldni850w.R.inc(21349);sb1.append("!"); __CLR4_4_1gg9gg9ldni850w.R.inc(21350);StringBuilder sb2 = new StringBuilder(); __CLR4_4_1gg9gg9ldni850w.R.inc(21351);sb2.append("Hello"); __CLR4_4_1gg9gg9ldni850w.R.inc(21352);sb2.append("World"); __CLR4_4_1gg9gg9ldni850w.R.inc(21353);sb2.append("!"); __CLR4_4_1gg9gg9ldni850w.R.inc(21354);sb2.append("!"); __CLR4_4_1gg9gg9ldni850w.R.inc(21355);sb2.append("!"); __CLR4_4_1gg9gg9ldni850w.R.inc(21356);sb2.append("!"); __CLR4_4_1gg9gg9ldni850w.R.inc(21357);StringBuilder sb3 = new StringBuilder(); __CLR4_4_1gg9gg9ldni850w.R.inc(21358);sb3.append("Hello"); __CLR4_4_1gg9gg9ldni850w.R.inc(21359);sb3.append("World"); __CLR4_4_1gg9gg9ldni850w.R.inc(21360);sb3.append("!"); __CLR4_4_1gg9gg9ldni850w.R.inc(21361);sb3.append("!"); __CLR4_4_1gg9gg9ldni850w.R.inc(21362);sb3.append("!");
}finally{__CLR4_4_1gg9gg9ldni850w.R.flushNeeded();}}

@Test
public void deleteImpl() {__CLR4_4_1gg9gg9ldni850w.R.globalSliceStart(getClass().getName(),21363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12zlpkeghf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gg9gg9ldni850w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gg9gg9ldni850w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.deleteImpl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12zlpkeghf(){try{__CLR4_4_1gg9gg9ldni850w.R.inc(21363); __CLR4_4_1gg9gg9ldni850w.R.inc(21364);StringBuilder sb = new StringBuilder(); __CLR4_4_1gg9gg9ldni850w.R.inc(21365);StringBuilder sb1 = new StringBuilder(); __CLR4_4_1gg9gg9ldni850w.R.inc(21366);for (int i = 0; (((i < 10)&&(__CLR4_4_1gg9gg9ldni850w.R.iget(21367)!=0|true))||(__CLR4_4_1gg9gg9ldni850w.R.iget(21368)==0&false)); i++) {{ __CLR4_4_1gg9gg9ldni850w.R.inc(21369);sb1.append("a"); } }__CLR4_4_1gg9gg9ldni850w.R.inc(21370);sb1.append("b"); __CLR4_4_1gg9gg9ldni850w.R.inc(21371);sb1.append("c"); __CLR4_4_1gg9gg9ldni850w.R.inc(21372);sb1.append("d"); __CLR4_4_1gg9gg9ldni850w.R.inc(21373);sb1.append("e"); __CLR4_4_1gg9gg9ldni850w.R.inc(21374);sb1.append("f"); __CLR4_4_1gg9gg9ldni850w.R.inc(21375);sb1.append("g"); __CLR4_4_1gg9gg9ldni850w.R.inc(21376);sb1.append("h"); __CLR4_4_1gg9gg9ldni850w.R.inc(21377);sb1.append("i"); __CLR4_4_1gg9gg9ldni850w.R.inc(21378);sb1.append("j"); __CLR4_4_1gg9gg9ldni850w.R.inc(21379);sb1.append("k"); __CLR4_4_1gg9gg9ldni850w.R.inc(21380);sb1.append("l"); __CLR4_4_1gg9gg9ldni850w.R.inc(21381);sb1.append("m"); __CLR4_4_1gg9gg9ldni850w.R.inc(21382);sb1.append("n"); __CLR4_4_1gg9gg9ldni850w.R.inc(21383);sb1.append("o"); __CLR4_4_1gg9gg9ldni850w.R.inc(21384);sb1.append("o");
}finally{__CLR4_4_1gg9gg9ldni850w.R.flushNeeded();}}

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    // -----------------------------------------------------------------------
    

    

    // -----------------------------------------------------------------------
    

    

    // -----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    
    
    

    // -----------------------------------------------------------------------
    

    

    

    // -----------------------------------------------------------------------
    

    

    

    // -----------------------------------------------------------------------
    

    

    

    

    // -----------------------------------------------------------------------
    

    

    

    

    // -----------------------------------------------------------------------
    

    

    

    

    static final StrMatcher A_NUMBER_MATCHER = new StrMatcher() {
        @Override
        public int isMatch(final char[] buffer, int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_4_1gg9gg9ldni850w.R.inc(21385);
            __CLR4_4_1gg9gg9ldni850w.R.inc(21386);if ((((buffer[pos] == 'A')&&(__CLR4_4_1gg9gg9ldni850w.R.iget(21387)!=0|true))||(__CLR4_4_1gg9gg9ldni850w.R.iget(21388)==0&false))) {{
                __CLR4_4_1gg9gg9ldni850w.R.inc(21389);pos++;
                __CLR4_4_1gg9gg9ldni850w.R.inc(21390);if ((((pos < bufferEnd && buffer[pos] >= '0' && buffer[pos] <= '9')&&(__CLR4_4_1gg9gg9ldni850w.R.iget(21391)!=0|true))||(__CLR4_4_1gg9gg9ldni850w.R.iget(21392)==0&false))) {{
                    __CLR4_4_1gg9gg9ldni850w.R.inc(21393);return 2;
                }
            }}
            }__CLR4_4_1gg9gg9ldni850w.R.inc(21394);return 0;
        }finally{__CLR4_4_1gg9gg9ldni850w.R.flushNeeded();}}
    };

    //-----------------------------------------------------------------------
    

    // -----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

}
