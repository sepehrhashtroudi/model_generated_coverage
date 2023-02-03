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
package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

/**
 * An API for translating text. 
 * Its core use is to escape and unescape text. Because escaping and unescaping 
 * is completely contextual, the API does not present two separate signatures.
 * 
 * @since 3.0
 * @version $Id$
 */
public abstract class CharSequenceTranslator {public static class __CLR4_4_1d2md2mldni84bz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,16985,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Translate a set of codepoints, represented by an int index into a CharSequence, 
     * into another set of codepoints. The number of codepoints consumed must be returned, 
     * and the only IOExceptions thrown must be from interacting with the Writer so that 
     * the top level API may reliably ignore StringWriter IOExceptions. 
     *
     * @param input CharSequence that is being translated
     * @param index int representing the current point of translation
     * @param out Writer to translate the text to
     * @return int count of codepoints consumed
     * @throws IOException if and only if the Writer produces an IOException
     */
    public abstract int translate(CharSequence input, int index, Writer out) throws IOException;

    /**
     * Helper for non-Writer usage. 
     * @param input CharSequence to be translated
     * @return String output of translation
     */
    public final String translate(final CharSequence input) {try{__CLR4_4_1d2md2mldni84bz.R.inc(16942);
        __CLR4_4_1d2md2mldni84bz.R.inc(16943);if ((((input == null)&&(__CLR4_4_1d2md2mldni84bz.R.iget(16944)!=0|true))||(__CLR4_4_1d2md2mldni84bz.R.iget(16945)==0&false))) {{
            __CLR4_4_1d2md2mldni84bz.R.inc(16946);return null;
        }
        }__CLR4_4_1d2md2mldni84bz.R.inc(16947);try {
            __CLR4_4_1d2md2mldni84bz.R.inc(16948);final StringWriter writer = new StringWriter(input.length() * 2);
            __CLR4_4_1d2md2mldni84bz.R.inc(16949);translate(input, writer);
            __CLR4_4_1d2md2mldni84bz.R.inc(16950);return writer.toString();
        } catch (final IOException ioe) {
            // this should never ever happen while writing to a StringWriter
            __CLR4_4_1d2md2mldni84bz.R.inc(16951);throw new RuntimeException(ioe);
        }
    }finally{__CLR4_4_1d2md2mldni84bz.R.flushNeeded();}}

    /**
     * Translate an input onto a Writer. This is intentionally final as its algorithm is 
     * tightly coupled with the abstract method of this class. 
     *
     * @param input CharSequence that is being translated
     * @param out Writer to translate the text to
     * @throws IOException if and only if the Writer produces an IOException
     */
    public final void translate(final CharSequence input, final Writer out) throws IOException {try{__CLR4_4_1d2md2mldni84bz.R.inc(16952);
        __CLR4_4_1d2md2mldni84bz.R.inc(16953);if ((((out == null)&&(__CLR4_4_1d2md2mldni84bz.R.iget(16954)!=0|true))||(__CLR4_4_1d2md2mldni84bz.R.iget(16955)==0&false))) {{
            __CLR4_4_1d2md2mldni84bz.R.inc(16956);throw new IllegalArgumentException("The Writer must not be null");
        }
        }__CLR4_4_1d2md2mldni84bz.R.inc(16957);if ((((input == null)&&(__CLR4_4_1d2md2mldni84bz.R.iget(16958)!=0|true))||(__CLR4_4_1d2md2mldni84bz.R.iget(16959)==0&false))) {{
            __CLR4_4_1d2md2mldni84bz.R.inc(16960);return;
        }
        }__CLR4_4_1d2md2mldni84bz.R.inc(16961);int pos = 0;
        __CLR4_4_1d2md2mldni84bz.R.inc(16962);final int len = input.length();
        __CLR4_4_1d2md2mldni84bz.R.inc(16963);while ((((pos < len)&&(__CLR4_4_1d2md2mldni84bz.R.iget(16964)!=0|true))||(__CLR4_4_1d2md2mldni84bz.R.iget(16965)==0&false))) {{
            __CLR4_4_1d2md2mldni84bz.R.inc(16966);final int consumed = translate(input, pos, out);
            __CLR4_4_1d2md2mldni84bz.R.inc(16967);if ((((consumed == 0)&&(__CLR4_4_1d2md2mldni84bz.R.iget(16968)!=0|true))||(__CLR4_4_1d2md2mldni84bz.R.iget(16969)==0&false))) {{
                __CLR4_4_1d2md2mldni84bz.R.inc(16970);final char[] c = Character.toChars(Character.codePointAt(input, pos));
                __CLR4_4_1d2md2mldni84bz.R.inc(16971);out.write(c);
                __CLR4_4_1d2md2mldni84bz.R.inc(16972);pos+= c.length;
                __CLR4_4_1d2md2mldni84bz.R.inc(16973);continue;
            }
//          // contract with translators is that they have to understand codepoints 
//          // and they just took care of a surrogate pair
            }__CLR4_4_1d2md2mldni84bz.R.inc(16974);for (int pt = 0; (((pt < consumed)&&(__CLR4_4_1d2md2mldni84bz.R.iget(16975)!=0|true))||(__CLR4_4_1d2md2mldni84bz.R.iget(16976)==0&false)); pt++) {{
                __CLR4_4_1d2md2mldni84bz.R.inc(16977);pos += Character.charCount(Character.codePointAt(input, pt));
            }
        }}
    }}finally{__CLR4_4_1d2md2mldni84bz.R.flushNeeded();}}

    /**
     * Helper method to create a merger of this translator with another set of 
     * translators. Useful in customizing the standard functionality.
     *
     * @param translators CharSequenceTranslator array of translators to merge with this one
     * @return CharSequenceTranslator merging this translator with the others
     */
    public final CharSequenceTranslator with(final CharSequenceTranslator... translators) {try{__CLR4_4_1d2md2mldni84bz.R.inc(16978);
        __CLR4_4_1d2md2mldni84bz.R.inc(16979);final CharSequenceTranslator[] newArray = new CharSequenceTranslator[translators.length + 1];
        __CLR4_4_1d2md2mldni84bz.R.inc(16980);newArray[0] = this;
        __CLR4_4_1d2md2mldni84bz.R.inc(16981);System.arraycopy(translators, 0, newArray, 1, translators.length);
        __CLR4_4_1d2md2mldni84bz.R.inc(16982);return new AggregateTranslator(newArray);
    }finally{__CLR4_4_1d2md2mldni84bz.R.flushNeeded();}}

    /**
     * <p>Returns an upper case hexadecimal <code>String</code> for the given
     * character.</p>
     *
     * @param codepoint The codepoint to convert.
     * @return An upper case hexadecimal <code>String</code>
     */
    public static String hex(final int codepoint) {try{__CLR4_4_1d2md2mldni84bz.R.inc(16983);
        __CLR4_4_1d2md2mldni84bz.R.inc(16984);return Integer.toHexString(codepoint).toUpperCase(Locale.ENGLISH);
    }finally{__CLR4_4_1d2md2mldni84bz.R.flushNeeded();}}

}
