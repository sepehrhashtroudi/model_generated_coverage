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
public class StringUtilsTest {static class __CLR4_4_1f9qf9qldniggu2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,19895,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    static final String WHITESPACE;
    static final String NON_WHITESPACE;
    static final String TRIMMABLE;
    static final String NON_TRIMMABLE;
    static {try{__CLR4_4_1f9qf9qldniggu2.R.inc(19790);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19791);String ws = "";
        __CLR4_4_1f9qf9qldniggu2.R.inc(19792);String nws = "";
        __CLR4_4_1f9qf9qldniggu2.R.inc(19793);String tr = "";
        __CLR4_4_1f9qf9qldniggu2.R.inc(19794);String ntr = "";
        __CLR4_4_1f9qf9qldniggu2.R.inc(19795);for (int i = 0; (((i < Character.MAX_VALUE)&&(__CLR4_4_1f9qf9qldniggu2.R.iget(19796)!=0|true))||(__CLR4_4_1f9qf9qldniggu2.R.iget(19797)==0&false)); i++) {{
            __CLR4_4_1f9qf9qldniggu2.R.inc(19798);if ((((Character.isWhitespace((char) i))&&(__CLR4_4_1f9qf9qldniggu2.R.iget(19799)!=0|true))||(__CLR4_4_1f9qf9qldniggu2.R.iget(19800)==0&false))) {{
                __CLR4_4_1f9qf9qldniggu2.R.inc(19801);ws += String.valueOf((char) i);
                __CLR4_4_1f9qf9qldniggu2.R.inc(19802);if ((((i > 32)&&(__CLR4_4_1f9qf9qldniggu2.R.iget(19803)!=0|true))||(__CLR4_4_1f9qf9qldniggu2.R.iget(19804)==0&false))) {{
                    __CLR4_4_1f9qf9qldniggu2.R.inc(19805);ntr += String.valueOf((char) i);
                }
            }} }else {__CLR4_4_1f9qf9qldniggu2.R.inc(19806);if ((((i < 40)&&(__CLR4_4_1f9qf9qldniggu2.R.iget(19807)!=0|true))||(__CLR4_4_1f9qf9qldniggu2.R.iget(19808)==0&false))) {{
                __CLR4_4_1f9qf9qldniggu2.R.inc(19809);nws += String.valueOf((char) i);
            }
        }}}
        }__CLR4_4_1f9qf9qldniggu2.R.inc(19810);for (int i = 0; (((i <= 32)&&(__CLR4_4_1f9qf9qldniggu2.R.iget(19811)!=0|true))||(__CLR4_4_1f9qf9qldniggu2.R.iget(19812)==0&false)); i++) {{
            __CLR4_4_1f9qf9qldniggu2.R.inc(19813);tr += String.valueOf((char) i);
        }
        }__CLR4_4_1f9qf9qldniggu2.R.inc(19814);WHITESPACE = ws;
        __CLR4_4_1f9qf9qldniggu2.R.inc(19815);NON_WHITESPACE = nws;
        __CLR4_4_1f9qf9qldniggu2.R.inc(19816);TRIMMABLE = tr;
        __CLR4_4_1f9qf9qldniggu2.R.inc(19817);NON_TRIMMABLE = ntr;
    }finally{__CLR4_4_1f9qf9qldniggu2.R.flushNeeded();}}

    private static final String[] ARRAY_LIST = { "foo", "bar", "baz" };
    private static final String[] EMPTY_ARRAY_LIST = {};
    private static final String[] NULL_ARRAY_LIST = {null};
    private static final Object[] NULL_TO_STRING_LIST = {
        new Object(){
            @Override
            public String toString() {try{__CLR4_4_1f9qf9qldniggu2.R.inc(19818);
                __CLR4_4_1f9qf9qldniggu2.R.inc(19819);return null;
            }finally{__CLR4_4_1f9qf9qldniggu2.R.flushNeeded();}}
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
    
    
    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    

    
    
    
    
    
    
    private void innerTestSplit(final char separator, final String sepStr, final char noMatch) {try{__CLR4_4_1f9qf9qldniggu2.R.inc(19820);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19821);final String msg = "Failed on separator hex(" + Integer.toHexString(separator) +
            "), noMatch hex(" + Integer.toHexString(noMatch) + "), sepStr(" + sepStr + ")";
        
        __CLR4_4_1f9qf9qldniggu2.R.inc(19822);final String str = "a" + separator + "b" + separator + separator + noMatch + "c";
        __CLR4_4_1f9qf9qldniggu2.R.inc(19823);String[] res;
        // (str, sepStr)
        __CLR4_4_1f9qf9qldniggu2.R.inc(19824);res = StringUtils.split(str, sepStr);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19825);assertEquals(msg, 3, res.length);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19826);assertEquals(msg, "a", res[0]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19827);assertEquals(msg, "b", res[1]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19828);assertEquals(msg, noMatch + "c", res[2]);
        
        __CLR4_4_1f9qf9qldniggu2.R.inc(19829);final String str2 = separator + "a" + separator;
        __CLR4_4_1f9qf9qldniggu2.R.inc(19830);res = StringUtils.split(str2, sepStr);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19831);assertEquals(msg, 1, res.length);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19832);assertEquals(msg, "a", res[0]);

        __CLR4_4_1f9qf9qldniggu2.R.inc(19833);res = StringUtils.split(str, sepStr, -1);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19834);assertEquals(msg, 3, res.length);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19835);assertEquals(msg, "a", res[0]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19836);assertEquals(msg, "b", res[1]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19837);assertEquals(msg, noMatch + "c", res[2]);
        
        __CLR4_4_1f9qf9qldniggu2.R.inc(19838);res = StringUtils.split(str, sepStr, 0);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19839);assertEquals(msg, 3, res.length);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19840);assertEquals(msg, "a", res[0]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19841);assertEquals(msg, "b", res[1]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19842);assertEquals(msg, noMatch + "c", res[2]);
        
        __CLR4_4_1f9qf9qldniggu2.R.inc(19843);res = StringUtils.split(str, sepStr, 1);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19844);assertEquals(msg, 1, res.length);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19845);assertEquals(msg, str, res[0]);
        
        __CLR4_4_1f9qf9qldniggu2.R.inc(19846);res = StringUtils.split(str, sepStr, 2);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19847);assertEquals(msg, 2, res.length);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19848);assertEquals(msg, "a", res[0]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19849);assertEquals(msg, str.substring(2), res[1]);
    }finally{__CLR4_4_1f9qf9qldniggu2.R.flushNeeded();}}

    

    

    
    
    
    
    
    
    
    
    private void innerTestSplitPreserveAllTokens(final char separator, final String sepStr, final char noMatch) {try{__CLR4_4_1f9qf9qldniggu2.R.inc(19850);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19851);final String msg = "Failed on separator hex(" + Integer.toHexString(separator) +
            "), noMatch hex(" + Integer.toHexString(noMatch) + "), sepStr(" + sepStr + ")";
        
        __CLR4_4_1f9qf9qldniggu2.R.inc(19852);final String str = "a" + separator + "b" + separator + separator + noMatch + "c";
        __CLR4_4_1f9qf9qldniggu2.R.inc(19853);String[] res;
        // (str, sepStr)
        __CLR4_4_1f9qf9qldniggu2.R.inc(19854);res = StringUtils.splitPreserveAllTokens(str, sepStr);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19855);assertEquals(msg, 4, res.length);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19856);assertEquals(msg, "a", res[0]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19857);assertEquals(msg, "b", res[1]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19858);assertEquals(msg, "", res[2]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19859);assertEquals(msg, noMatch + "c", res[3]);
        
        __CLR4_4_1f9qf9qldniggu2.R.inc(19860);final String str2 = separator + "a" + separator;
        __CLR4_4_1f9qf9qldniggu2.R.inc(19861);res = StringUtils.splitPreserveAllTokens(str2, sepStr);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19862);assertEquals(msg, 3, res.length);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19863);assertEquals(msg, "", res[0]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19864);assertEquals(msg, "a", res[1]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19865);assertEquals(msg, "", res[2]);

        __CLR4_4_1f9qf9qldniggu2.R.inc(19866);res = StringUtils.splitPreserveAllTokens(str, sepStr, -1);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19867);assertEquals(msg, 4, res.length);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19868);assertEquals(msg, "a", res[0]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19869);assertEquals(msg, "b", res[1]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19870);assertEquals(msg, "", res[2]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19871);assertEquals(msg, noMatch + "c", res[3]);
        
        __CLR4_4_1f9qf9qldniggu2.R.inc(19872);res = StringUtils.splitPreserveAllTokens(str, sepStr, 0);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19873);assertEquals(msg, 4, res.length);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19874);assertEquals(msg, "a", res[0]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19875);assertEquals(msg, "b", res[1]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19876);assertEquals(msg, "", res[2]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19877);assertEquals(msg, noMatch + "c", res[3]);
        
        __CLR4_4_1f9qf9qldniggu2.R.inc(19878);res = StringUtils.splitPreserveAllTokens(str, sepStr, 1);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19879);assertEquals(msg, 1, res.length);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19880);assertEquals(msg, str, res[0]);
        
        __CLR4_4_1f9qf9qldniggu2.R.inc(19881);res = StringUtils.splitPreserveAllTokens(str, sepStr, 2);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19882);assertEquals(msg, 2, res.length);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19883);assertEquals(msg, "a", res[0]);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19884);assertEquals(msg, str.substring(2), res[1]);
    }finally{__CLR4_4_1f9qf9qldniggu2.R.flushNeeded();}}

    
    
    

    

    

    
    
    
    
    
    
    
    
    

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
    
    
    

    private void assertAbbreviateWithOffset(final String expected, final int offset, final int maxWidth) {try{__CLR4_4_1f9qf9qldniggu2.R.inc(19885);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19886);final String abcdefghijklmno = "abcdefghijklmno";
        __CLR4_4_1f9qf9qldniggu2.R.inc(19887);final String message = "abbreviate(String,int,int) failed";
        __CLR4_4_1f9qf9qldniggu2.R.inc(19888);final String actual = StringUtils.abbreviate(abcdefghijklmno, offset, maxWidth);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19889);if ((((offset >= 0 && offset < abcdefghijklmno.length())&&(__CLR4_4_1f9qf9qldniggu2.R.iget(19890)!=0|true))||(__CLR4_4_1f9qf9qldniggu2.R.iget(19891)==0&false))) {{
            __CLR4_4_1f9qf9qldniggu2.R.inc(19892);assertTrue(message + " -- should contain offset character",
                    actual.indexOf((char)('a'+offset)) != -1);
        }
        }__CLR4_4_1f9qf9qldniggu2.R.inc(19893);assertTrue(message + " -- should not be greater than maxWidth",
                actual.length() <= maxWidth);
        __CLR4_4_1f9qf9qldniggu2.R.inc(19894);assertEquals(message, expected, actual);
    }finally{__CLR4_4_1f9qf9qldniggu2.R.flushNeeded();}}

    

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
