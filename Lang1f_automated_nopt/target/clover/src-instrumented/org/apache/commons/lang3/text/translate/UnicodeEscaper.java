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
import java.io.Writer;

/**
 * Translates codepoints to their Unicode escaped value.
 *
 * @since 3.0
 * @version $Id$
 */
public class UnicodeEscaper extends CodePointTranslator {public static class __CLR4_4_1d9cd9cldni84dl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,17230,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final int below;
    private final int above;
    private final boolean between;

    /**
     * <p>Constructs a <code>UnicodeEscaper</code> for all characters. </p>
     */
    public UnicodeEscaper(){
        this(0, Integer.MAX_VALUE, true);__CLR4_4_1d9cd9cldni84dl.R.inc(17185);try{__CLR4_4_1d9cd9cldni84dl.R.inc(17184);
    }finally{__CLR4_4_1d9cd9cldni84dl.R.flushNeeded();}}

    /**
     * <p>Constructs a <code>UnicodeEscaper</code> for the specified range. This is
     * the underlying method for the other constructors/builders. The <code>below</code>
     * and <code>above</code> boundaries are inclusive when <code>between</code> is
     * <code>true</code> and exclusive when it is <code>false</code>. </p>
     *
     * @param below int value representing the lowest codepoint boundary
     * @param above int value representing the highest codepoint boundary
     * @param between whether to escape between the boundaries or outside them
     */
    protected UnicodeEscaper(final int below, final int above, final boolean between) {try{__CLR4_4_1d9cd9cldni84dl.R.inc(17186);
        __CLR4_4_1d9cd9cldni84dl.R.inc(17187);this.below = below;
        __CLR4_4_1d9cd9cldni84dl.R.inc(17188);this.above = above;
        __CLR4_4_1d9cd9cldni84dl.R.inc(17189);this.between = between;
    }finally{__CLR4_4_1d9cd9cldni84dl.R.flushNeeded();}}

    /**
     * <p>Constructs a <code>UnicodeEscaper</code> below the specified value (exclusive). </p>
     *
     * @param codepoint below which to escape
     * @return the newly created {@code UnicodeEscaper} instance
     */
    public static UnicodeEscaper below(final int codepoint) {try{__CLR4_4_1d9cd9cldni84dl.R.inc(17190);
        __CLR4_4_1d9cd9cldni84dl.R.inc(17191);return outsideOf(codepoint, Integer.MAX_VALUE);
    }finally{__CLR4_4_1d9cd9cldni84dl.R.flushNeeded();}}

    /**
     * <p>Constructs a <code>UnicodeEscaper</code> above the specified value (exclusive). </p>
     *
     * @param codepoint above which to escape
     * @return the newly created {@code UnicodeEscaper} instance
     */
    public static UnicodeEscaper above(final int codepoint) {try{__CLR4_4_1d9cd9cldni84dl.R.inc(17192);
        __CLR4_4_1d9cd9cldni84dl.R.inc(17193);return outsideOf(0, codepoint);
    }finally{__CLR4_4_1d9cd9cldni84dl.R.flushNeeded();}}

    /**
     * <p>Constructs a <code>UnicodeEscaper</code> outside of the specified values (exclusive). </p>
     *
     * @param codepointLow below which to escape
     * @param codepointHigh above which to escape
     * @return the newly created {@code UnicodeEscaper} instance
     */
    public static UnicodeEscaper outsideOf(final int codepointLow, final int codepointHigh) {try{__CLR4_4_1d9cd9cldni84dl.R.inc(17194);
        __CLR4_4_1d9cd9cldni84dl.R.inc(17195);return new UnicodeEscaper(codepointLow, codepointHigh, false);
    }finally{__CLR4_4_1d9cd9cldni84dl.R.flushNeeded();}}

    /**
     * <p>Constructs a <code>UnicodeEscaper</code> between the specified values (inclusive). </p>
     *
     * @param codepointLow above which to escape
     * @param codepointHigh below which to escape
     * @return the newly created {@code UnicodeEscaper} instance
     */
    public static UnicodeEscaper between(final int codepointLow, final int codepointHigh) {try{__CLR4_4_1d9cd9cldni84dl.R.inc(17196);
        __CLR4_4_1d9cd9cldni84dl.R.inc(17197);return new UnicodeEscaper(codepointLow, codepointHigh, true);
    }finally{__CLR4_4_1d9cd9cldni84dl.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean translate(final int codepoint, final Writer out) throws IOException {try{__CLR4_4_1d9cd9cldni84dl.R.inc(17198);
        __CLR4_4_1d9cd9cldni84dl.R.inc(17199);if ((((between)&&(__CLR4_4_1d9cd9cldni84dl.R.iget(17200)!=0|true))||(__CLR4_4_1d9cd9cldni84dl.R.iget(17201)==0&false))) {{
            __CLR4_4_1d9cd9cldni84dl.R.inc(17202);if ((((codepoint < below || codepoint > above)&&(__CLR4_4_1d9cd9cldni84dl.R.iget(17203)!=0|true))||(__CLR4_4_1d9cd9cldni84dl.R.iget(17204)==0&false))) {{
                __CLR4_4_1d9cd9cldni84dl.R.inc(17205);return false;
            }
        }} }else {{
            __CLR4_4_1d9cd9cldni84dl.R.inc(17206);if ((((codepoint >= below && codepoint <= above)&&(__CLR4_4_1d9cd9cldni84dl.R.iget(17207)!=0|true))||(__CLR4_4_1d9cd9cldni84dl.R.iget(17208)==0&false))) {{
                __CLR4_4_1d9cd9cldni84dl.R.inc(17209);return false;
            }
        }}

        // TODO: Handle potential + sign per various Unicode escape implementations
        }__CLR4_4_1d9cd9cldni84dl.R.inc(17210);if ((((codepoint > 0xffff)&&(__CLR4_4_1d9cd9cldni84dl.R.iget(17211)!=0|true))||(__CLR4_4_1d9cd9cldni84dl.R.iget(17212)==0&false))) {{
            __CLR4_4_1d9cd9cldni84dl.R.inc(17213);out.write(toUtf16Escape(codepoint));
        } }else {__CLR4_4_1d9cd9cldni84dl.R.inc(17214);if ((((codepoint > 0xfff)&&(__CLR4_4_1d9cd9cldni84dl.R.iget(17215)!=0|true))||(__CLR4_4_1d9cd9cldni84dl.R.iget(17216)==0&false))) {{
            __CLR4_4_1d9cd9cldni84dl.R.inc(17217);out.write("\\u" + hex(codepoint));
        } }else {__CLR4_4_1d9cd9cldni84dl.R.inc(17218);if ((((codepoint > 0xff)&&(__CLR4_4_1d9cd9cldni84dl.R.iget(17219)!=0|true))||(__CLR4_4_1d9cd9cldni84dl.R.iget(17220)==0&false))) {{
            __CLR4_4_1d9cd9cldni84dl.R.inc(17221);out.write("\\u0" + hex(codepoint));
        } }else {__CLR4_4_1d9cd9cldni84dl.R.inc(17222);if ((((codepoint > 0xf)&&(__CLR4_4_1d9cd9cldni84dl.R.iget(17223)!=0|true))||(__CLR4_4_1d9cd9cldni84dl.R.iget(17224)==0&false))) {{
            __CLR4_4_1d9cd9cldni84dl.R.inc(17225);out.write("\\u00" + hex(codepoint));
        } }else {{
            __CLR4_4_1d9cd9cldni84dl.R.inc(17226);out.write("\\u000" + hex(codepoint));
        }
        }}}}__CLR4_4_1d9cd9cldni84dl.R.inc(17227);return true;
    }finally{__CLR4_4_1d9cd9cldni84dl.R.flushNeeded();}}

    /**
     * Converts the given codepoint to a hex string of the form {@code "\\uXXXX"}
     * 
     * @param codepoint
     *            a Unicode code point
     * @return the hex string for the given codepoint
     */
    protected String toUtf16Escape(final int codepoint) {try{__CLR4_4_1d9cd9cldni84dl.R.inc(17228);
        __CLR4_4_1d9cd9cldni84dl.R.inc(17229);return "\\u" + hex(codepoint);
    }finally{__CLR4_4_1d9cd9cldni84dl.R.flushNeeded();}}
}
