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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.junit.Test;

/**
 * Unit tests for {@link StringEscapeUtils}.
 *
 * @version $Id$
 */
public class StringEscapeUtilsTest {static class __CLR4_4_1f89f89ldniggth{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,19771,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static String FOO = "foo";

    
    
    

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-421
     */
    
    
    private void assertEscapeJava(final String escaped, final String original) throws IOException {try{__CLR4_4_1f89f89ldniggth.R.inc(19737);
        __CLR4_4_1f89f89ldniggth.R.inc(19738);assertEscapeJava(null, escaped, original);
    }finally{__CLR4_4_1f89f89ldniggth.R.flushNeeded();}}

    private void assertEscapeJava(String message, final String expected, final String original) throws IOException {try{__CLR4_4_1f89f89ldniggth.R.inc(19739);
        __CLR4_4_1f89f89ldniggth.R.inc(19740);final String converted = StringEscapeUtils.escapeJava(original);
        __CLR4_4_1f89f89ldniggth.R.inc(19741);message = "escapeJava(String) failed" + ((((message == null )&&(__CLR4_4_1f89f89ldniggth.R.iget(19742)!=0|true))||(__CLR4_4_1f89f89ldniggth.R.iget(19743)==0&false))? "" : (": " + message));
        __CLR4_4_1f89f89ldniggth.R.inc(19744);assertEquals(message, expected, converted);

        __CLR4_4_1f89f89ldniggth.R.inc(19745);final StringWriter writer = new StringWriter();
        __CLR4_4_1f89f89ldniggth.R.inc(19746);StringEscapeUtils.ESCAPE_JAVA.translate(original, writer);
        __CLR4_4_1f89f89ldniggth.R.inc(19747);assertEquals(expected, writer.toString());
    }finally{__CLR4_4_1f89f89ldniggth.R.flushNeeded();}}

    

    private void assertUnescapeJava(final String unescaped, final String original) throws IOException {try{__CLR4_4_1f89f89ldniggth.R.inc(19748);
        __CLR4_4_1f89f89ldniggth.R.inc(19749);assertUnescapeJava(null, unescaped, original);
    }finally{__CLR4_4_1f89f89ldniggth.R.flushNeeded();}}

    private void assertUnescapeJava(final String message, final String unescaped, final String original) throws IOException {try{__CLR4_4_1f89f89ldniggth.R.inc(19750);
        __CLR4_4_1f89f89ldniggth.R.inc(19751);final String expected = unescaped;
        __CLR4_4_1f89f89ldniggth.R.inc(19752);final String actual = StringEscapeUtils.unescapeJava(original);

        __CLR4_4_1f89f89ldniggth.R.inc(19753);assertEquals("unescape(String) failed" +
                ((((message == null )&&(__CLR4_4_1f89f89ldniggth.R.iget(19754)!=0|true))||(__CLR4_4_1f89f89ldniggth.R.iget(19755)==0&false))? "" : (": " + message)) +
                ": expected '" + StringEscapeUtils.escapeJava(expected) +
                // we escape this so we can see it in the error message
                "' actual '" + StringEscapeUtils.escapeJava(actual) + "'",
                expected, actual);

        __CLR4_4_1f89f89ldniggth.R.inc(19756);final StringWriter writer = new StringWriter();
        __CLR4_4_1f89f89ldniggth.R.inc(19757);StringEscapeUtils.UNESCAPE_JAVA.translate(original, writer);
        __CLR4_4_1f89f89ldniggth.R.inc(19758);assertEquals(unescaped, writer.toString());

    }finally{__CLR4_4_1f89f89ldniggth.R.flushNeeded();}}

    


    // HTML and XML
    //--------------------------------------------------------------

    private static final String[][] HTML_ESCAPES = {
        {"no escaping", "plain text", "plain text"},
        {"no escaping", "plain text", "plain text"},
        {"empty string", "", ""},
        {"null", null, null},
        {"ampersand", "bread &amp; butter", "bread & butter"},
        {"quotes", "&quot;bread&quot; &amp; butter", "\"bread\" & butter"},
        {"final character only", "greater than &gt;", "greater than >"},
        {"first character only", "&lt; less than", "< less than"},
        {"apostrophe", "Huntington's chorea", "Huntington's chorea"},
        {"languages", "English,Fran&ccedil;ais,\u65e5\u672c\u8a9e (nihongo)", "English,Fran\u00e7ais,\u65e5\u672c\u8a9e (nihongo)"},
        {"8-bit ascii shouldn't number-escape", "\u0080\u009f", "\u0080\u009f"},
    };

    

    

    

    

    

    

    /**
     * Tests Supplementary characters. 
     * <p>
     * From http://www.w3.org/International/questions/qa-escapes
     * </p>
     * <blockquote>
     * Supplementary characters are those Unicode characters that have code points higher than the characters in
     * the Basic Multilingual Plane (BMP). In UTF-16 a supplementary character is encoded using two 16-bit surrogate code points from the
     * BMP. Because of this, some people think that supplementary characters need to be represented using two escapes, but this is incorrect
     * - you must use the single, code point value for that character. For example, use &#x233B4; rather than &#xD84C;&#xDFB4;.
     * </blockquote>
     * @see <a href="http://www.w3.org/International/questions/qa-escapes">Using character escapes in markup and CSS</a>
     * @see <a href="https://issues.apache.org/jira/browse/LANG-728">LANG-728</a>
     */
    
    
    
    
    /**
     * Reverse of the above.
     *
     * @see <a href="https://issues.apache.org/jira/browse/LANG-729">LANG-729</a>
     */
    
        
    // Tests issue #38569
    // http://issues.apache.org/bugzilla/show_bug.cgi?id=38569
    

    

    

    

    private void checkCsvEscapeWriter(final String expected, final String value) {try{__CLR4_4_1f89f89ldniggth.R.inc(19759);
        __CLR4_4_1f89f89ldniggth.R.inc(19760);try {
            __CLR4_4_1f89f89ldniggth.R.inc(19761);final StringWriter writer = new StringWriter();
            __CLR4_4_1f89f89ldniggth.R.inc(19762);StringEscapeUtils.ESCAPE_CSV.translate(value, writer);
            __CLR4_4_1f89f89ldniggth.R.inc(19763);assertEquals(expected, writer.toString());
        } catch (final IOException e) {
            __CLR4_4_1f89f89ldniggth.R.inc(19764);fail("Threw: " + e);
        }
    }finally{__CLR4_4_1f89f89ldniggth.R.flushNeeded();}}

    

    

    private void checkCsvUnescapeWriter(final String expected, final String value) {try{__CLR4_4_1f89f89ldniggth.R.inc(19765);
        __CLR4_4_1f89f89ldniggth.R.inc(19766);try {
            __CLR4_4_1f89f89ldniggth.R.inc(19767);final StringWriter writer = new StringWriter();
            __CLR4_4_1f89f89ldniggth.R.inc(19768);StringEscapeUtils.UNESCAPE_CSV.translate(value, writer);
            __CLR4_4_1f89f89ldniggth.R.inc(19769);assertEquals(expected, writer.toString());
        } catch (final IOException e) {
            __CLR4_4_1f89f89ldniggth.R.inc(19770);fail("Threw: " + e);
        }
    }finally{__CLR4_4_1f89f89ldniggth.R.flushNeeded();}}

    /**
     * Tests // https://issues.apache.org/jira/browse/LANG-480
     * 
     * @throws java.io.UnsupportedEncodingException
     */
    

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-339
     */
    

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-708
     * 
     * @throws IOException
     *             if an I/O error occurs
     */
    

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-720
     */
    

    

}
