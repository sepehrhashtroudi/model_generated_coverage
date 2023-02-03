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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

import org.apache.commons.lang3.text.WordUtils;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils}.
 *
 * @version $Id$
 */
public class StringUtilsTest {static class __CLR4_4_1fcqfcqldni84tz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,20074,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    static final String WHITESPACE;
    static final String NON_WHITESPACE;
    static final String TRIMMABLE;
    static final String NON_TRIMMABLE;
    static {try{__CLR4_4_1fcqfcqldni84tz.R.inc(19898);
        __CLR4_4_1fcqfcqldni84tz.R.inc(19899);String ws = "";
        __CLR4_4_1fcqfcqldni84tz.R.inc(19900);String nws = "";
        __CLR4_4_1fcqfcqldni84tz.R.inc(19901);String tr = "";
        __CLR4_4_1fcqfcqldni84tz.R.inc(19902);String ntr = "";
        __CLR4_4_1fcqfcqldni84tz.R.inc(19903);for (int i = 0; (((i < Character.MAX_VALUE)&&(__CLR4_4_1fcqfcqldni84tz.R.iget(19904)!=0|true))||(__CLR4_4_1fcqfcqldni84tz.R.iget(19905)==0&false)); i++) {{
            __CLR4_4_1fcqfcqldni84tz.R.inc(19906);if ((((Character.isWhitespace((char) i))&&(__CLR4_4_1fcqfcqldni84tz.R.iget(19907)!=0|true))||(__CLR4_4_1fcqfcqldni84tz.R.iget(19908)==0&false))) {{
                __CLR4_4_1fcqfcqldni84tz.R.inc(19909);ws += String.valueOf((char) i);
                __CLR4_4_1fcqfcqldni84tz.R.inc(19910);if ((((i > 32)&&(__CLR4_4_1fcqfcqldni84tz.R.iget(19911)!=0|true))||(__CLR4_4_1fcqfcqldni84tz.R.iget(19912)==0&false))) {{
                    __CLR4_4_1fcqfcqldni84tz.R.inc(19913);ntr += String.valueOf((char) i);
                }
            }} }else {__CLR4_4_1fcqfcqldni84tz.R.inc(19914);if ((((i < 40)&&(__CLR4_4_1fcqfcqldni84tz.R.iget(19915)!=0|true))||(__CLR4_4_1fcqfcqldni84tz.R.iget(19916)==0&false))) {{
                __CLR4_4_1fcqfcqldni84tz.R.inc(19917);nws += String.valueOf((char) i);
            }
        }}}
        }__CLR4_4_1fcqfcqldni84tz.R.inc(19918);for (int i = 0; (((i <= 32)&&(__CLR4_4_1fcqfcqldni84tz.R.iget(19919)!=0|true))||(__CLR4_4_1fcqfcqldni84tz.R.iget(19920)==0&false)); i++) {{
            __CLR4_4_1fcqfcqldni84tz.R.inc(19921);tr += String.valueOf((char) i);
        }
        }__CLR4_4_1fcqfcqldni84tz.R.inc(19922);WHITESPACE = ws;
        __CLR4_4_1fcqfcqldni84tz.R.inc(19923);NON_WHITESPACE = nws;
        __CLR4_4_1fcqfcqldni84tz.R.inc(19924);TRIMMABLE = tr;
        __CLR4_4_1fcqfcqldni84tz.R.inc(19925);NON_TRIMMABLE = ntr;
    }finally{__CLR4_4_1fcqfcqldni84tz.R.flushNeeded();}}

    private static final String[] ARRAY_LIST = { "foo", "bar", "baz" };
    private static final String[] EMPTY_ARRAY_LIST = {};
    private static final String[] NULL_ARRAY_LIST = {null};
    private static final Object[] NULL_TO_STRING_LIST = {
        new Object(){
            @Override
            public String toString() {try{__CLR4_4_1fcqfcqldni84tz.R.inc(19926);
                __CLR4_4_1fcqfcqldni84tz.R.inc(19927);return null;
            }finally{__CLR4_4_1fcqfcqldni84tz.R.flushNeeded();}}
        }
    };
    private static final String[] MIXED_ARRAY_LIST = {null, "", "foo"};
    private static final Object[] MIXED_TYPE_LIST = {"foo", Long.valueOf(2L)};
    private static final long[] LONG_PRIM_LIST = {1, 2};
    private static final int[] INT_PRIM_LIST = {1, 2};
    private static final byte[] BYTE_PRIM_LIST = {1, 2};
    private static final short[] SHORT_PRIM_LIST = {1, 2};
    private static final char[] CHAR_PRIM_LIST = {'1', '2'};
    private static final float[] FLOAT_PRIM_LIST = {1, 2};
    private static final double[] DOUBLE_PRIM_LIST = {1, 2};

    private static final String SEPARATOR = ",";
    private static final char   SEPARATOR_CHAR = ';';

    private static final String TEXT_LIST = "foo,bar,baz";
    private static final String TEXT_LIST_CHAR = "foo;bar;baz";
    private static final String TEXT_LIST_NOSEP = "foobarbaz";

    private static final String FOO_UNCAP = "foo";
    private static final String FOO_CAP = "Foo";

    private static final String SENTENCE_UNCAP = "foo bar baz";
    private static final String SENTENCE_CAP = "Foo Bar Baz";

    //-----------------------------------------------------------------------
@Test(expected = IllegalArgumentException.class) public void testSwapCaseNull13() {__CLR4_4_1fcqfcqldni84tz.R.globalSliceStart(getClass().getName(),19928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sj205fdk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,119,97,112,67,97,115,101,78,117,108,108,49,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fcqfcqldni84tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fcqfcqldni84tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSwapCaseNull13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sj205fdk(){try{__CLR4_4_1fcqfcqldni84tz.R.inc(19928); __CLR4_4_1fcqfcqldni84tz.R.inc(19929);StringUtils.swapCase(null); }finally{__CLR4_4_1fcqfcqldni84tz.R.flushNeeded();}}
@Test
public void testSplitWorker144() {__CLR4_4_1fcqfcqldni84tz.R.globalSliceStart(getClass().getName(),19930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13k0ymqfdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fcqfcqldni84tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fcqfcqldni84tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitWorker144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13k0ymqfdm(){try{__CLR4_4_1fcqfcqldni84tz.R.inc(19930); __CLR4_4_1fcqfcqldni84tz.R.inc(19931);final String[] data1 = new String[1]; __CLR4_4_1fcqfcqldni84tz.R.inc(19932);final String[] data2 = new String[1]; __CLR4_4_1fcqfcqldni84tz.R.inc(19933);final String[] data3 = new String[1]; __CLR4_4_1fcqfcqldni84tz.R.inc(19934);final String[] data4 = new String[1]; __CLR4_4_1fcqfcqldni84tz.R.inc(19935);assertNull(data1[0]); __CLR4_4_1fcqfcqldni84tz.R.inc(19936);assertNull(data2[0]); __CLR4_4_1fcqfcqldni84tz.R.inc(19937);assertNull(data3[0]); __CLR4_4_1fcqfcqldni84tz.R.inc(19938);assertNull(data4[0]); __CLR4_4_1fcqfcqldni84tz.R.inc(19939);assertArrayEquals(data1, data2); __CLR4_4_1fcqfcqldni84tz.R.inc(19940);assertArrayEquals(data1, data3); __CLR4_4_1fcqfcqldni84tz.R.inc(19941);assertArrayEquals(data1, data4); __CLR4_4_1fcqfcqldni84tz.R.inc(19942);final String[] data5 = new String[1]; __CLR4_4_1fcqfcqldni84tz.R.inc(19943);final String[] data6 = new String[1]; __CLR4_4_1fcqfcqldni84tz.R.inc(19944);final String[] data7 = new String[1];
}finally{__CLR4_4_1fcqfcqldni84tz.R.flushNeeded();}}

@Test
public void testDifference166() {__CLR4_4_1fcqfcqldni84tz.R.globalSliceStart(getClass().getName(),19945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmo1rdfe1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fcqfcqldni84tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fcqfcqldni84tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDifference166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmo1rdfe1(){try{__CLR4_4_1fcqfcqldni84tz.R.inc(19945); __CLR4_4_1fcqfcqldni84tz.R.inc(19946);assertEquals(null, StringUtils.difference(null, null)); __CLR4_4_1fcqfcqldni84tz.R.inc(19947);assertEquals(null, StringUtils.difference(null, "")); __CLR4_4_1fcqfcqldni84tz.R.inc(19948);assertEquals("", StringUtils.difference("", null)); __CLR4_4_1fcqfcqldni84tz.R.inc(19949);assertEquals("", StringUtils.difference("", "")); __CLR4_4_1fcqfcqldni84tz.R.inc(19950);assertEquals("", StringUtils.difference("", " ")); __CLR4_4_1fcqfcqldni84tz.R.inc(19951);assertEquals("", StringUtils.difference("", " ")); __CLR4_4_1fcqfcqldni84tz.R.inc(19952);assertEquals("", StringUtils.difference("", null)); __CLR4_4_1fcqfcqldni84tz.R.inc(19953);assertEquals("", StringUtils.difference("", " ")); __CLR4_4_1fcqfcqldni84tz.R.inc(19954);assertEquals("", StringUtils.difference("", null)); __CLR4_4_1fcqfcqldni84tz.R.inc(19955);assertEquals("", StringUtils.difference("", "")); __CLR4_4_1fcqfcqldni84tz.R.inc(19956);assertEquals("", StringUtils.difference(null, null)); __CLR4_4_1fcqfcqldni84tz.R.inc(19957);assertEquals("", StringUtils.difference("", ""));
}finally{__CLR4_4_1fcqfcqldni84tz.R.flushNeeded();}}

@Test
public void testDifference173() {__CLR4_4_1fcqfcqldni84tz.R.globalSliceStart(getClass().getName(),19958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tfl01nfee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fcqfcqldni84tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fcqfcqldni84tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDifference173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tfl01nfee(){try{__CLR4_4_1fcqfcqldni84tz.R.inc(19958); __CLR4_4_1fcqfcqldni84tz.R.inc(19959);String path1 = "/test/path1"; __CLR4_4_1fcqfcqldni84tz.R.inc(19960);String path2 = "/test/path2"; __CLR4_4_1fcqfcqldni84tz.R.inc(19961);String path3 = "/test/path3"; __CLR4_4_1fcqfcqldni84tz.R.inc(19962);String path4 = "/test/path4"; __CLR4_4_1fcqfcqldni84tz.R.inc(19963);String path5 = "/test/path5"; __CLR4_4_1fcqfcqldni84tz.R.inc(19964);String path6 = "/test/path6"; __CLR4_4_1fcqfcqldni84tz.R.inc(19965);String path7 = "/test/path7"; __CLR4_4_1fcqfcqldni84tz.R.inc(19966);String path8 = "/test/path8"; __CLR4_4_1fcqfcqldni84tz.R.inc(19967);String path9 = "/test/path9"; __CLR4_4_1fcqfcqldni84tz.R.inc(19968);String path10 = "/test/path10"; __CLR4_4_1fcqfcqldni84tz.R.inc(19969);String path11 = "/test/path11"; __CLR4_4_1fcqfcqldni84tz.R.inc(19970);String path12 = "/test/path12"; __CLR4_4_1fcqfcqldni84tz.R.inc(19971);String path13 = "/test/path13"; __CLR4_4_1fcqfcqldni84tz.R.inc(19972);String path14 = "/test/path14";
}finally{__CLR4_4_1fcqfcqldni84tz.R.flushNeeded();}}

@Test
public void testSplit429() {__CLR4_4_1fcqfcqldni84tz.R.globalSliceStart(getClass().getName(),19973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19nqtoafet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fcqfcqldni84tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fcqfcqldni84tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplit429",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19nqtoafet(){try{__CLR4_4_1fcqfcqldni84tz.R.inc(19973); __CLR4_4_1fcqfcqldni84tz.R.inc(19974);String[] lines = StringUtils.split("1,2,3", ",", 3); __CLR4_4_1fcqfcqldni84tz.R.inc(19975);assertEquals(3, lines.length); __CLR4_4_1fcqfcqldni84tz.R.inc(19976);assertEquals("1", lines[0]); __CLR4_4_1fcqfcqldni84tz.R.inc(19977);assertEquals("2", lines[1]); __CLR4_4_1fcqfcqldni84tz.R.inc(19978);assertEquals("3", lines[2]); __CLR4_4_1fcqfcqldni84tz.R.inc(19979);lines = StringUtils.split("1,2,3", ",", 3); __CLR4_4_1fcqfcqldni84tz.R.inc(19980);assertEquals(3, lines.length); __CLR4_4_1fcqfcqldni84tz.R.inc(19981);assertEquals("1", lines[0]); __CLR4_4_1fcqfcqldni84tz.R.inc(19982);assertEquals("2", lines[1]); __CLR4_4_1fcqfcqldni84tz.R.inc(19983);assertEquals("3", lines[2]); __CLR4_4_1fcqfcqldni84tz.R.inc(19984);lines = StringUtils.split("1,2,3", ",", 3); __CLR4_4_1fcqfcqldni84tz.R.inc(19985);assertEquals(3, lines.length); __CLR4_4_1fcqfcqldni84tz.R.inc(19986);assertEquals("1", lines[0]);
}finally{__CLR4_4_1fcqfcqldni84tz.R.flushNeeded();}}

@Test
public void testSplitByWholeSeparatorPreserveAllTokens1082() {__CLR4_4_1fcqfcqldni84tz.R.globalSliceStart(getClass().getName(),19987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r57a82ff7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fcqfcqldni84tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fcqfcqldni84tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitByWholeSeparatorPreserveAllTokens1082",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r57a82ff7(){try{__CLR4_4_1fcqfcqldni84tz.R.inc(19987); __CLR4_4_1fcqfcqldni84tz.R.inc(19988);String[] lines = StringUtils.splitByWholeSeparatorPreserveAllTokens("#", "#", 1); __CLR4_4_1fcqfcqldni84tz.R.inc(19989);assertEquals(1, lines.length); __CLR4_4_1fcqfcqldni84tz.R.inc(19990);assertEquals("#", lines[0]); __CLR4_4_1fcqfcqldni84tz.R.inc(19991);lines = StringUtils.splitByWholeSeparatorPreserveAllTokens("#", "#", 2); __CLR4_4_1fcqfcqldni84tz.R.inc(19992);assertEquals(2, lines.length); __CLR4_4_1fcqfcqldni84tz.R.inc(19993);assertEquals("#", lines[0]); __CLR4_4_1fcqfcqldni84tz.R.inc(19994);assertEquals("", lines[1]); __CLR4_4_1fcqfcqldni84tz.R.inc(19995);lines = StringUtils.splitByWholeSeparatorPreserveAllTokens("#", "#", 3); __CLR4_4_1fcqfcqldni84tz.R.inc(19996);assertEquals(3, lines.length); __CLR4_4_1fcqfcqldni84tz.R.inc(19997);assertEquals("#", lines[0]); __CLR4_4_1fcqfcqldni84tz.R.inc(19998);assertEquals("", lines[1]);
}finally{__CLR4_4_1fcqfcqldni84tz.R.flushNeeded();}}

    
    
    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    

    
    
    
    
    
    
    private void innerTestSplit(final char separator, final String sepStr, final char noMatch) {try{__CLR4_4_1fcqfcqldni84tz.R.inc(19999);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20000);final String msg = "Failed on separator hex(" + Integer.toHexString(separator) +
            "), noMatch hex(" + Integer.toHexString(noMatch) + "), sepStr(" + sepStr + ")";
        
        __CLR4_4_1fcqfcqldni84tz.R.inc(20001);final String str = "a" + separator + "b" + separator + separator + noMatch + "c";
        __CLR4_4_1fcqfcqldni84tz.R.inc(20002);String[] res;
        // (str, sepStr)
        __CLR4_4_1fcqfcqldni84tz.R.inc(20003);res = StringUtils.split(str, sepStr);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20004);assertEquals(msg, 3, res.length);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20005);assertEquals(msg, "a", res[0]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20006);assertEquals(msg, "b", res[1]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20007);assertEquals(msg, noMatch + "c", res[2]);
        
        __CLR4_4_1fcqfcqldni84tz.R.inc(20008);final String str2 = separator + "a" + separator;
        __CLR4_4_1fcqfcqldni84tz.R.inc(20009);res = StringUtils.split(str2, sepStr);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20010);assertEquals(msg, 1, res.length);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20011);assertEquals(msg, "a", res[0]);

        __CLR4_4_1fcqfcqldni84tz.R.inc(20012);res = StringUtils.split(str, sepStr, -1);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20013);assertEquals(msg, 3, res.length);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20014);assertEquals(msg, "a", res[0]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20015);assertEquals(msg, "b", res[1]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20016);assertEquals(msg, noMatch + "c", res[2]);
        
        __CLR4_4_1fcqfcqldni84tz.R.inc(20017);res = StringUtils.split(str, sepStr, 0);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20018);assertEquals(msg, 3, res.length);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20019);assertEquals(msg, "a", res[0]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20020);assertEquals(msg, "b", res[1]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20021);assertEquals(msg, noMatch + "c", res[2]);
        
        __CLR4_4_1fcqfcqldni84tz.R.inc(20022);res = StringUtils.split(str, sepStr, 1);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20023);assertEquals(msg, 1, res.length);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20024);assertEquals(msg, str, res[0]);
        
        __CLR4_4_1fcqfcqldni84tz.R.inc(20025);res = StringUtils.split(str, sepStr, 2);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20026);assertEquals(msg, 2, res.length);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20027);assertEquals(msg, "a", res[0]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20028);assertEquals(msg, str.substring(2), res[1]);
    }finally{__CLR4_4_1fcqfcqldni84tz.R.flushNeeded();}}

    

    

    
    
    
    
    
    
    
    
    private void innerTestSplitPreserveAllTokens(final char separator, final String sepStr, final char noMatch) {try{__CLR4_4_1fcqfcqldni84tz.R.inc(20029);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20030);final String msg = "Failed on separator hex(" + Integer.toHexString(separator) +
            "), noMatch hex(" + Integer.toHexString(noMatch) + "), sepStr(" + sepStr + ")";
        
        __CLR4_4_1fcqfcqldni84tz.R.inc(20031);final String str = "a" + separator + "b" + separator + separator + noMatch + "c";
        __CLR4_4_1fcqfcqldni84tz.R.inc(20032);String[] res;
        // (str, sepStr)
        __CLR4_4_1fcqfcqldni84tz.R.inc(20033);res = StringUtils.splitPreserveAllTokens(str, sepStr);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20034);assertEquals(msg, 4, res.length);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20035);assertEquals(msg, "a", res[0]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20036);assertEquals(msg, "b", res[1]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20037);assertEquals(msg, "", res[2]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20038);assertEquals(msg, noMatch + "c", res[3]);
        
        __CLR4_4_1fcqfcqldni84tz.R.inc(20039);final String str2 = separator + "a" + separator;
        __CLR4_4_1fcqfcqldni84tz.R.inc(20040);res = StringUtils.splitPreserveAllTokens(str2, sepStr);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20041);assertEquals(msg, 3, res.length);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20042);assertEquals(msg, "", res[0]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20043);assertEquals(msg, "a", res[1]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20044);assertEquals(msg, "", res[2]);

        __CLR4_4_1fcqfcqldni84tz.R.inc(20045);res = StringUtils.splitPreserveAllTokens(str, sepStr, -1);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20046);assertEquals(msg, 4, res.length);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20047);assertEquals(msg, "a", res[0]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20048);assertEquals(msg, "b", res[1]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20049);assertEquals(msg, "", res[2]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20050);assertEquals(msg, noMatch + "c", res[3]);
        
        __CLR4_4_1fcqfcqldni84tz.R.inc(20051);res = StringUtils.splitPreserveAllTokens(str, sepStr, 0);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20052);assertEquals(msg, 4, res.length);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20053);assertEquals(msg, "a", res[0]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20054);assertEquals(msg, "b", res[1]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20055);assertEquals(msg, "", res[2]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20056);assertEquals(msg, noMatch + "c", res[3]);
        
        __CLR4_4_1fcqfcqldni84tz.R.inc(20057);res = StringUtils.splitPreserveAllTokens(str, sepStr, 1);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20058);assertEquals(msg, 1, res.length);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20059);assertEquals(msg, str, res[0]);
        
        __CLR4_4_1fcqfcqldni84tz.R.inc(20060);res = StringUtils.splitPreserveAllTokens(str, sepStr, 2);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20061);assertEquals(msg, 2, res.length);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20062);assertEquals(msg, "a", res[0]);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20063);assertEquals(msg, str.substring(2), res[1]);
    }finally{__CLR4_4_1fcqfcqldni84tz.R.flushNeeded();}}

    
    
    

    

    

    
    
    
    
    
    
    
    
    

    /**
     * Test method for 'StringUtils.replaceEach(String, String[], String[])'
     */
    

    /**
     * Test method for 'StringUtils.replaceEachRepeatedly(String, String[], String[])'
     */
    
    
    
    
    
    
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    
        
    //-----------------------------------------------------------------------
    
        
    
        
    

    

    

    
    
    

    //-----------------------------------------------------------------------
    
    
    
    
    

    //-----------------------------------------------------------------------
    
        
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    
    
    

    private void assertAbbreviateWithOffset(final String expected, final int offset, final int maxWidth) {try{__CLR4_4_1fcqfcqldni84tz.R.inc(20064);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20065);final String abcdefghijklmno = "abcdefghijklmno";
        __CLR4_4_1fcqfcqldni84tz.R.inc(20066);final String message = "abbreviate(String,int,int) failed";
        __CLR4_4_1fcqfcqldni84tz.R.inc(20067);final String actual = StringUtils.abbreviate(abcdefghijklmno, offset, maxWidth);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20068);if ((((offset >= 0 && offset < abcdefghijklmno.length())&&(__CLR4_4_1fcqfcqldni84tz.R.iget(20069)!=0|true))||(__CLR4_4_1fcqfcqldni84tz.R.iget(20070)==0&false))) {{
            __CLR4_4_1fcqfcqldni84tz.R.inc(20071);assertTrue(message + " -- should contain offset character",
                    actual.indexOf((char)('a'+offset)) != -1);
        }
        }__CLR4_4_1fcqfcqldni84tz.R.inc(20072);assertTrue(message + " -- should not be greater than maxWidth",
                actual.length() <= maxWidth);
        __CLR4_4_1fcqfcqldni84tz.R.inc(20073);assertEquals(message, expected, actual);
    }finally{__CLR4_4_1fcqfcqldni84tz.R.flushNeeded();}}

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    /**
     * A sanity check for {@link StringUtils#EMPTY}.
     */
    

    /**
     * Test for {@link StringUtils#isAllLowerCase(CharSequence)}.
     */
    

    /**
     * Test for {@link StringUtils#isAllUpperCase(CharSequence)}.
     */
    

    
    
    

    

    

    

    
    
    
    
    
        
    

    

    // Methods on StringUtils that are immutable in spirit (i.e. calculate the length) 
    // should take a CharSequence parameter. Methods that are mutable in spirit (i.e. capitalize) 
    // should take a String or String[] parameter and return String or String[].
    // This test enforces that this is done.
    

    /**
     * Tests {@link StringUtils#toString(byte[], String)}
     * 
     * @throws UnsupportedEncodingException
     * @see StringUtils#toString(byte[], String)
     */
    
    
    
    
    /**
     * Tests LANG-858.
     * 
     * @throws Exception
     */
    
    
    

    /**
     * Tests {@code appendIfMissing}.
     */
    

    /**
     * Tests {@code appendIfMissingIgnoreCase}.
     */
    

    /**
     * Tests {@code prependIfMissing}.
     */
    

    /**
     * Tests {@code prependIfMissingIgnoreCase}.
     */
    
}
