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

import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

/**
 * Extends <code>java.text.MessageFormat</code> to allow pluggable/additional formatting
 * options for embedded format elements.  Client code should specify a registry
 * of <code>FormatFactory</code> instances associated with <code>String</code>
 * format names.  This registry will be consulted when the format elements are
 * parsed from the message pattern.  In this way custom patterns can be specified,
 * and the formats supported by <code>java.text.MessageFormat</code> can be overridden
 * at the format and/or format style level (see MessageFormat).  A "format element"
 * embedded in the message pattern is specified (<b>()?</b> signifies optionality):<br />
 * <code>{</code><i>argument-number</i><b>(</b><code>,</code><i>format-name</i><b>
 * (</b><code>,</code><i>format-style</i><b>)?)?</b><code>}</code>
 *
 * <p>
 * <i>format-name</i> and <i>format-style</i> values are trimmed of surrounding whitespace
 * in the manner of <code>java.text.MessageFormat</code>.  If <i>format-name</i> denotes
 * <code>FormatFactory formatFactoryInstance</code> in <code>registry</code>, a <code>Format</code>
 * matching <i>format-name</i> and <i>format-style</i> is requested from
 * <code>formatFactoryInstance</code>.  If this is successful, the <code>Format</code>
 * found is used for this format element.
 * </p>
 *
 * <p><b>NOTICE:</b> The various subformat mutator methods are considered unnecessary; they exist on the parent
 * class to allow the type of customization which it is the job of this class to provide in
 * a configurable fashion.  These methods have thus been disabled and will throw
 * <code>UnsupportedOperationException</code> if called.
 * </p>
 *
 * <p>Limitations inherited from <code>java.text.MessageFormat</code>:
 * <ul>
 * <li>When using "choice" subformats, support for nested formatting instructions is limited
 *     to that provided by the base class.</li>
 * <li>Thread-safety of <code>Format</code>s, including <code>MessageFormat</code> and thus
 *     <code>ExtendedMessageFormat</code>, is not guaranteed.</li>
 * </ul>
 * </p>
 *
 * @since 2.4
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ExtendedMessageFormat extends MessageFormat {public static class __CLR4_4_1b1eb1eldni846w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,14588,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final long serialVersionUID = -2362048321261811743L;
    private static final int HASH_SEED = 31;

    private static final String DUMMY_PATTERN = "";
    private static final String ESCAPED_QUOTE = "''";
    private static final char START_FMT = ',';
    private static final char END_FE = '}';
    private static final char START_FE = '{';
    private static final char QUOTE = '\'';

    private String toPattern;
    private final Map<String, ? extends FormatFactory> registry;

    /**
     * Create a new ExtendedMessageFormat for the default locale.
     *
     * @param pattern  the pattern to use, not null
     * @throws IllegalArgumentException in case of a bad pattern.
     */
    public ExtendedMessageFormat(final String pattern) {
        this(pattern, Locale.getDefault());__CLR4_4_1b1eb1eldni846w.R.inc(14307);try{__CLR4_4_1b1eb1eldni846w.R.inc(14306);
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Create a new ExtendedMessageFormat.
     *
     * @param pattern  the pattern to use, not null
     * @param locale  the locale to use, not null
     * @throws IllegalArgumentException in case of a bad pattern.
     */
    public ExtendedMessageFormat(final String pattern, final Locale locale) {
        this(pattern, locale, null);__CLR4_4_1b1eb1eldni846w.R.inc(14309);try{__CLR4_4_1b1eb1eldni846w.R.inc(14308);
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Create a new ExtendedMessageFormat for the default locale.
     *
     * @param pattern  the pattern to use, not null
     * @param registry  the registry of format factories, may be null
     * @throws IllegalArgumentException in case of a bad pattern.
     */
    public ExtendedMessageFormat(final String pattern, final Map<String, ? extends FormatFactory> registry) {
        this(pattern, Locale.getDefault(), registry);__CLR4_4_1b1eb1eldni846w.R.inc(14311);try{__CLR4_4_1b1eb1eldni846w.R.inc(14310);
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Create a new ExtendedMessageFormat.
     *
     * @param pattern  the pattern to use, not null
     * @param locale  the locale to use, not null
     * @param registry  the registry of format factories, may be null
     * @throws IllegalArgumentException in case of a bad pattern.
     */
    public ExtendedMessageFormat(final String pattern, final Locale locale, final Map<String, ? extends FormatFactory> registry) {
        super(DUMMY_PATTERN);__CLR4_4_1b1eb1eldni846w.R.inc(14313);try{__CLR4_4_1b1eb1eldni846w.R.inc(14312);
        __CLR4_4_1b1eb1eldni846w.R.inc(14314);setLocale(locale);
        __CLR4_4_1b1eb1eldni846w.R.inc(14315);this.registry = registry;
        __CLR4_4_1b1eb1eldni846w.R.inc(14316);applyPattern(pattern);
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toPattern() {try{__CLR4_4_1b1eb1eldni846w.R.inc(14317);
        __CLR4_4_1b1eb1eldni846w.R.inc(14318);return toPattern;
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Apply the specified pattern.
     *
     * @param pattern String
     */
    @Override
    public final void applyPattern(final String pattern) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14319);
        __CLR4_4_1b1eb1eldni846w.R.inc(14320);if ((((registry == null)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14321)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14322)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14323);super.applyPattern(pattern);
            __CLR4_4_1b1eb1eldni846w.R.inc(14324);toPattern = super.toPattern();
            __CLR4_4_1b1eb1eldni846w.R.inc(14325);return;
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14326);final ArrayList<Format> foundFormats = new ArrayList<Format>();
        __CLR4_4_1b1eb1eldni846w.R.inc(14327);final ArrayList<String> foundDescriptions = new ArrayList<String>();
        __CLR4_4_1b1eb1eldni846w.R.inc(14328);final StringBuilder stripCustom = new StringBuilder(pattern.length());

        __CLR4_4_1b1eb1eldni846w.R.inc(14329);final ParsePosition pos = new ParsePosition(0);
        __CLR4_4_1b1eb1eldni846w.R.inc(14330);final char[] c = pattern.toCharArray();
        __CLR4_4_1b1eb1eldni846w.R.inc(14331);int fmtCount = 0;
        __CLR4_4_1b1eb1eldni846w.R.inc(14332);while ((((pos.getIndex() < pattern.length())&&(__CLR4_4_1b1eb1eldni846w.R.iget(14333)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14334)==0&false))) {{
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1b1eb1eldni846w.R.inc(14335);switch (c[pos.getIndex()]) {
            case QUOTE:if (!__CLB4_4_1_bool0) {__CLR4_4_1b1eb1eldni846w.R.inc(14336);__CLB4_4_1_bool0=true;}
                __CLR4_4_1b1eb1eldni846w.R.inc(14337);appendQuotedString(pattern, pos, stripCustom, true);
                __CLR4_4_1b1eb1eldni846w.R.inc(14338);break;
            case START_FE:if (!__CLB4_4_1_bool0) {__CLR4_4_1b1eb1eldni846w.R.inc(14339);__CLB4_4_1_bool0=true;}
                __CLR4_4_1b1eb1eldni846w.R.inc(14340);fmtCount++;
                __CLR4_4_1b1eb1eldni846w.R.inc(14341);seekNonWs(pattern, pos);
                __CLR4_4_1b1eb1eldni846w.R.inc(14342);final int start = pos.getIndex();
                __CLR4_4_1b1eb1eldni846w.R.inc(14343);final int index = readArgumentIndex(pattern, next(pos));
                __CLR4_4_1b1eb1eldni846w.R.inc(14344);stripCustom.append(START_FE).append(index);
                __CLR4_4_1b1eb1eldni846w.R.inc(14345);seekNonWs(pattern, pos);
                __CLR4_4_1b1eb1eldni846w.R.inc(14346);Format format = null;
                __CLR4_4_1b1eb1eldni846w.R.inc(14347);String formatDescription = null;
                __CLR4_4_1b1eb1eldni846w.R.inc(14348);if ((((c[pos.getIndex()] == START_FMT)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14349)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14350)==0&false))) {{
                    __CLR4_4_1b1eb1eldni846w.R.inc(14351);formatDescription = parseFormatDescription(pattern,
                            next(pos));
                    __CLR4_4_1b1eb1eldni846w.R.inc(14352);format = getFormat(formatDescription);
                    __CLR4_4_1b1eb1eldni846w.R.inc(14353);if ((((format == null)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14354)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14355)==0&false))) {{
                        __CLR4_4_1b1eb1eldni846w.R.inc(14356);stripCustom.append(START_FMT).append(formatDescription);
                    }
                }}
                }__CLR4_4_1b1eb1eldni846w.R.inc(14357);foundFormats.add(format);
                __CLR4_4_1b1eb1eldni846w.R.inc(14358);foundDescriptions.add((((format == null )&&(__CLR4_4_1b1eb1eldni846w.R.iget(14359)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14360)==0&false))? null : formatDescription);
                __CLR4_4_1b1eb1eldni846w.R.inc(14361);Validate.isTrue(foundFormats.size() == fmtCount);
                __CLR4_4_1b1eb1eldni846w.R.inc(14362);Validate.isTrue(foundDescriptions.size() == fmtCount);
                __CLR4_4_1b1eb1eldni846w.R.inc(14363);if ((((c[pos.getIndex()] != END_FE)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14364)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14365)==0&false))) {{
                    __CLR4_4_1b1eb1eldni846w.R.inc(14366);throw new IllegalArgumentException(
                            "Unreadable format element at position " + start);
                }
                //$FALL-THROUGH$
            }default:if (!__CLB4_4_1_bool0) {__CLR4_4_1b1eb1eldni846w.R.inc(14367);__CLB4_4_1_bool0=true;}
                __CLR4_4_1b1eb1eldni846w.R.inc(14368);stripCustom.append(c[pos.getIndex()]);
                __CLR4_4_1b1eb1eldni846w.R.inc(14369);next(pos);
            }
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14370);super.applyPattern(stripCustom.toString());
        __CLR4_4_1b1eb1eldni846w.R.inc(14371);toPattern = insertFormats(super.toPattern(), foundDescriptions);
        __CLR4_4_1b1eb1eldni846w.R.inc(14372);if ((((containsElements(foundFormats))&&(__CLR4_4_1b1eb1eldni846w.R.iget(14373)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14374)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14375);final Format[] origFormats = getFormats();
            // only loop over what we know we have, as MessageFormat on Java 1.3
            // seems to provide an extra format element:
            __CLR4_4_1b1eb1eldni846w.R.inc(14376);int i = 0;
            __CLR4_4_1b1eb1eldni846w.R.inc(14377);for (final Iterator<Format> it = foundFormats.iterator(); (((it.hasNext())&&(__CLR4_4_1b1eb1eldni846w.R.iget(14378)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14379)==0&false)); i++) {{
                __CLR4_4_1b1eb1eldni846w.R.inc(14380);final Format f = it.next();
                __CLR4_4_1b1eb1eldni846w.R.inc(14381);if ((((f != null)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14382)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14383)==0&false))) {{
                    __CLR4_4_1b1eb1eldni846w.R.inc(14384);origFormats[i] = f;
                }
            }}
            }__CLR4_4_1b1eb1eldni846w.R.inc(14385);super.setFormats(origFormats);
        }
    }}finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Throws UnsupportedOperationException - see class Javadoc for details.
     *
     * @param formatElementIndex format element index
     * @param newFormat the new format
     * @throws UnsupportedOperationException
     */
    @Override
    public void setFormat(final int formatElementIndex, final Format newFormat) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14386);
        __CLR4_4_1b1eb1eldni846w.R.inc(14387);throw new UnsupportedOperationException();
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Throws UnsupportedOperationException - see class Javadoc for details.
     *
     * @param argumentIndex argument index
     * @param newFormat the new format
     * @throws UnsupportedOperationException
     */
    @Override
    public void setFormatByArgumentIndex(final int argumentIndex, final Format newFormat) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14388);
        __CLR4_4_1b1eb1eldni846w.R.inc(14389);throw new UnsupportedOperationException();
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Throws UnsupportedOperationException - see class Javadoc for details.
     *
     * @param newFormats new formats
     * @throws UnsupportedOperationException
     */
    @Override
    public void setFormats(final Format[] newFormats) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14390);
        __CLR4_4_1b1eb1eldni846w.R.inc(14391);throw new UnsupportedOperationException();
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Throws UnsupportedOperationException - see class Javadoc for details.
     *
     * @param newFormats new formats
     * @throws UnsupportedOperationException
     */
    @Override
    public void setFormatsByArgumentIndex(final Format[] newFormats) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14392);
        __CLR4_4_1b1eb1eldni846w.R.inc(14393);throw new UnsupportedOperationException();
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Check if this extended message format is equal to another object.
     *
     * @param obj the object to compare to
     * @return true if this object equals the other, otherwise false
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14394);
        __CLR4_4_1b1eb1eldni846w.R.inc(14395);if ((((obj == this)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14396)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14397)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14398);return true;
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14399);if ((((obj == null)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14400)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14401)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14402);return false;
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14403);if ((((!super.equals(obj))&&(__CLR4_4_1b1eb1eldni846w.R.iget(14404)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14405)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14406);return false;
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14407);if ((((ObjectUtils.notEqual(getClass(), obj.getClass()))&&(__CLR4_4_1b1eb1eldni846w.R.iget(14408)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14409)==0&false))) {{
          __CLR4_4_1b1eb1eldni846w.R.inc(14410);return false;
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14411);final ExtendedMessageFormat rhs = (ExtendedMessageFormat)obj;
        __CLR4_4_1b1eb1eldni846w.R.inc(14412);if ((((ObjectUtils.notEqual(toPattern, rhs.toPattern))&&(__CLR4_4_1b1eb1eldni846w.R.iget(14413)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14414)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14415);return false;
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14416);if ((((ObjectUtils.notEqual(registry, rhs.registry))&&(__CLR4_4_1b1eb1eldni846w.R.iget(14417)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14418)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14419);return false;
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14420);return true;
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Return the hashcode.
     *
     * @return the hashcode
     */
    @Override
    public int hashCode() {try{__CLR4_4_1b1eb1eldni846w.R.inc(14421);
        __CLR4_4_1b1eb1eldni846w.R.inc(14422);int result = super.hashCode();
        __CLR4_4_1b1eb1eldni846w.R.inc(14423);result = HASH_SEED * result + ObjectUtils.hashCode(registry);
        __CLR4_4_1b1eb1eldni846w.R.inc(14424);result = HASH_SEED * result + ObjectUtils.hashCode(toPattern);
        __CLR4_4_1b1eb1eldni846w.R.inc(14425);return result;
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Get a custom format from a format description.
     *
     * @param desc String
     * @return Format
     */
    private Format getFormat(final String desc) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14426);
        __CLR4_4_1b1eb1eldni846w.R.inc(14427);if ((((registry != null)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14428)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14429)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14430);String name = desc;
            __CLR4_4_1b1eb1eldni846w.R.inc(14431);String args = null;
            __CLR4_4_1b1eb1eldni846w.R.inc(14432);final int i = desc.indexOf(START_FMT);
            __CLR4_4_1b1eb1eldni846w.R.inc(14433);if ((((i > 0)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14434)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14435)==0&false))) {{
                __CLR4_4_1b1eb1eldni846w.R.inc(14436);name = desc.substring(0, i).trim();
                __CLR4_4_1b1eb1eldni846w.R.inc(14437);args = desc.substring(i + 1).trim();
            }
            }__CLR4_4_1b1eb1eldni846w.R.inc(14438);final FormatFactory factory = registry.get(name);
            __CLR4_4_1b1eb1eldni846w.R.inc(14439);if ((((factory != null)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14440)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14441)==0&false))) {{
                __CLR4_4_1b1eb1eldni846w.R.inc(14442);return factory.getFormat(name, args, getLocale());
            }
        }}
        }__CLR4_4_1b1eb1eldni846w.R.inc(14443);return null;
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Read the argument index from the current format element
     *
     * @param pattern pattern to parse
     * @param pos current parse position
     * @return argument index
     */
    private int readArgumentIndex(final String pattern, final ParsePosition pos) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14444);
        __CLR4_4_1b1eb1eldni846w.R.inc(14445);final int start = pos.getIndex();
        __CLR4_4_1b1eb1eldni846w.R.inc(14446);seekNonWs(pattern, pos);
        __CLR4_4_1b1eb1eldni846w.R.inc(14447);final StringBuilder result = new StringBuilder();
        __CLR4_4_1b1eb1eldni846w.R.inc(14448);boolean error = false;
        __CLR4_4_1b1eb1eldni846w.R.inc(14449);for (; (((!error && pos.getIndex() < pattern.length())&&(__CLR4_4_1b1eb1eldni846w.R.iget(14450)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14451)==0&false)); next(pos)) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14452);char c = pattern.charAt(pos.getIndex());
            __CLR4_4_1b1eb1eldni846w.R.inc(14453);if ((((Character.isWhitespace(c))&&(__CLR4_4_1b1eb1eldni846w.R.iget(14454)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14455)==0&false))) {{
                __CLR4_4_1b1eb1eldni846w.R.inc(14456);seekNonWs(pattern, pos);
                __CLR4_4_1b1eb1eldni846w.R.inc(14457);c = pattern.charAt(pos.getIndex());
                __CLR4_4_1b1eb1eldni846w.R.inc(14458);if ((((c != START_FMT && c != END_FE)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14459)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14460)==0&false))) {{
                    __CLR4_4_1b1eb1eldni846w.R.inc(14461);error = true;
                    __CLR4_4_1b1eb1eldni846w.R.inc(14462);continue;
                }
            }}
            }__CLR4_4_1b1eb1eldni846w.R.inc(14463);if (((((c == START_FMT || c == END_FE) && result.length() > 0)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14464)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14465)==0&false))) {{
                __CLR4_4_1b1eb1eldni846w.R.inc(14466);try {
                    __CLR4_4_1b1eb1eldni846w.R.inc(14467);return Integer.parseInt(result.toString());
                } catch (final NumberFormatException e) { // NOPMD
                    // we've already ensured only digits, so unless something
                    // outlandishly large was specified we should be okay.
                }
            }
            }__CLR4_4_1b1eb1eldni846w.R.inc(14468);error = !Character.isDigit(c);
            __CLR4_4_1b1eb1eldni846w.R.inc(14469);result.append(c);
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14470);if ((((error)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14471)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14472)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14473);throw new IllegalArgumentException(
                    "Invalid format argument index at position " + start + ": "
                            + pattern.substring(start, pos.getIndex()));
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14474);throw new IllegalArgumentException(
                "Unterminated format element at position " + start);
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Parse the format component of a format element.
     *
     * @param pattern string to parse
     * @param pos current parse position
     * @return Format description String
     */
    private String parseFormatDescription(final String pattern, final ParsePosition pos) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14475);
        __CLR4_4_1b1eb1eldni846w.R.inc(14476);final int start = pos.getIndex();
        __CLR4_4_1b1eb1eldni846w.R.inc(14477);seekNonWs(pattern, pos);
        __CLR4_4_1b1eb1eldni846w.R.inc(14478);final int text = pos.getIndex();
        __CLR4_4_1b1eb1eldni846w.R.inc(14479);int depth = 1;
        __CLR4_4_1b1eb1eldni846w.R.inc(14480);for (; (((pos.getIndex() < pattern.length())&&(__CLR4_4_1b1eb1eldni846w.R.iget(14481)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14482)==0&false)); next(pos)) {{
            boolean __CLB4_4_1_bool1=false;__CLR4_4_1b1eb1eldni846w.R.inc(14483);switch (pattern.charAt(pos.getIndex())) {
            case START_FE:if (!__CLB4_4_1_bool1) {__CLR4_4_1b1eb1eldni846w.R.inc(14484);__CLB4_4_1_bool1=true;}
                __CLR4_4_1b1eb1eldni846w.R.inc(14485);depth++;
                __CLR4_4_1b1eb1eldni846w.R.inc(14486);break;
            case END_FE:if (!__CLB4_4_1_bool1) {__CLR4_4_1b1eb1eldni846w.R.inc(14487);__CLB4_4_1_bool1=true;}
                __CLR4_4_1b1eb1eldni846w.R.inc(14488);depth--;
                __CLR4_4_1b1eb1eldni846w.R.inc(14489);if ((((depth == 0)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14490)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14491)==0&false))) {{
                    __CLR4_4_1b1eb1eldni846w.R.inc(14492);return pattern.substring(text, pos.getIndex());
                }
                }__CLR4_4_1b1eb1eldni846w.R.inc(14493);break;
            case QUOTE:if (!__CLB4_4_1_bool1) {__CLR4_4_1b1eb1eldni846w.R.inc(14494);__CLB4_4_1_bool1=true;}
                __CLR4_4_1b1eb1eldni846w.R.inc(14495);getQuotedString(pattern, pos, false);
                __CLR4_4_1b1eb1eldni846w.R.inc(14496);break;
            }
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14497);throw new IllegalArgumentException(
                "Unterminated format element at position " + start);
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Insert formats back into the pattern for toPattern() support.
     *
     * @param pattern source
     * @param customPatterns The custom patterns to re-insert, if any
     * @return full pattern
     */
    private String insertFormats(final String pattern, final ArrayList<String> customPatterns) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14498);
        __CLR4_4_1b1eb1eldni846w.R.inc(14499);if ((((!containsElements(customPatterns))&&(__CLR4_4_1b1eb1eldni846w.R.iget(14500)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14501)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14502);return pattern;
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14503);final StringBuilder sb = new StringBuilder(pattern.length() * 2);
        __CLR4_4_1b1eb1eldni846w.R.inc(14504);final ParsePosition pos = new ParsePosition(0);
        __CLR4_4_1b1eb1eldni846w.R.inc(14505);int fe = -1;
        __CLR4_4_1b1eb1eldni846w.R.inc(14506);int depth = 0;
        __CLR4_4_1b1eb1eldni846w.R.inc(14507);while ((((pos.getIndex() < pattern.length())&&(__CLR4_4_1b1eb1eldni846w.R.iget(14508)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14509)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14510);final char c = pattern.charAt(pos.getIndex());
            boolean __CLB4_4_1_bool2=false;__CLR4_4_1b1eb1eldni846w.R.inc(14511);switch (c) {
            case QUOTE:if (!__CLB4_4_1_bool2) {__CLR4_4_1b1eb1eldni846w.R.inc(14512);__CLB4_4_1_bool2=true;}
                __CLR4_4_1b1eb1eldni846w.R.inc(14513);appendQuotedString(pattern, pos, sb, false);
                __CLR4_4_1b1eb1eldni846w.R.inc(14514);break;
            case START_FE:if (!__CLB4_4_1_bool2) {__CLR4_4_1b1eb1eldni846w.R.inc(14515);__CLB4_4_1_bool2=true;}
                __CLR4_4_1b1eb1eldni846w.R.inc(14516);depth++;
                __CLR4_4_1b1eb1eldni846w.R.inc(14517);if ((((depth == 1)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14518)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14519)==0&false))) {{
                    __CLR4_4_1b1eb1eldni846w.R.inc(14520);fe++;
                    __CLR4_4_1b1eb1eldni846w.R.inc(14521);sb.append(START_FE).append(
                            readArgumentIndex(pattern, next(pos)));
                    __CLR4_4_1b1eb1eldni846w.R.inc(14522);final String customPattern = customPatterns.get(fe);
                    __CLR4_4_1b1eb1eldni846w.R.inc(14523);if ((((customPattern != null)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14524)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14525)==0&false))) {{
                        __CLR4_4_1b1eb1eldni846w.R.inc(14526);sb.append(START_FMT).append(customPattern);
                    }
                }}
                }__CLR4_4_1b1eb1eldni846w.R.inc(14527);break;
            case END_FE:if (!__CLB4_4_1_bool2) {__CLR4_4_1b1eb1eldni846w.R.inc(14528);__CLB4_4_1_bool2=true;}
                __CLR4_4_1b1eb1eldni846w.R.inc(14529);depth--;
                //$FALL-THROUGH$
            default:if (!__CLB4_4_1_bool2) {__CLR4_4_1b1eb1eldni846w.R.inc(14530);__CLB4_4_1_bool2=true;}
                __CLR4_4_1b1eb1eldni846w.R.inc(14531);sb.append(c);
                __CLR4_4_1b1eb1eldni846w.R.inc(14532);next(pos);
            }
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14533);return sb.toString();
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Consume whitespace from the current parse position.
     *
     * @param pattern String to read
     * @param pos current position
     */
    private void seekNonWs(final String pattern, final ParsePosition pos) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14534);
        __CLR4_4_1b1eb1eldni846w.R.inc(14535);int len = 0;
        __CLR4_4_1b1eb1eldni846w.R.inc(14536);final char[] buffer = pattern.toCharArray();
        __CLR4_4_1b1eb1eldni846w.R.inc(14537);do {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14538);len = StrMatcher.splitMatcher().isMatch(buffer, pos.getIndex());
            __CLR4_4_1b1eb1eldni846w.R.inc(14539);pos.setIndex(pos.getIndex() + len);
        } }while ((((len > 0 && pos.getIndex() < pattern.length())&&(__CLR4_4_1b1eb1eldni846w.R.iget(14540)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14541)==0&false)));
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Convenience method to advance parse position by 1
     *
     * @param pos ParsePosition
     * @return <code>pos</code>
     */
    private ParsePosition next(final ParsePosition pos) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14542);
        __CLR4_4_1b1eb1eldni846w.R.inc(14543);pos.setIndex(pos.getIndex() + 1);
        __CLR4_4_1b1eb1eldni846w.R.inc(14544);return pos;
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Consume a quoted string, adding it to <code>appendTo</code> if
     * specified.
     *
     * @param pattern pattern to parse
     * @param pos current parse position
     * @param appendTo optional StringBuilder to append
     * @param escapingOn whether to process escaped quotes
     * @return <code>appendTo</code>
     */
    private StringBuilder appendQuotedString(final String pattern, final ParsePosition pos,
            final StringBuilder appendTo, final boolean escapingOn) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14545);
        __CLR4_4_1b1eb1eldni846w.R.inc(14546);final int start = pos.getIndex();
        __CLR4_4_1b1eb1eldni846w.R.inc(14547);final char[] c = pattern.toCharArray();
        __CLR4_4_1b1eb1eldni846w.R.inc(14548);if ((((escapingOn && c[start] == QUOTE)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14549)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14550)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14551);next(pos);
            __CLR4_4_1b1eb1eldni846w.R.inc(14552);return (((appendTo == null )&&(__CLR4_4_1b1eb1eldni846w.R.iget(14553)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14554)==0&false))? null : appendTo.append(QUOTE);
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14555);int lastHold = start;
        __CLR4_4_1b1eb1eldni846w.R.inc(14556);for (int i = pos.getIndex(); (((i < pattern.length())&&(__CLR4_4_1b1eb1eldni846w.R.iget(14557)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14558)==0&false)); i++) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14559);if ((((escapingOn && pattern.substring(i).startsWith(ESCAPED_QUOTE))&&(__CLR4_4_1b1eb1eldni846w.R.iget(14560)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14561)==0&false))) {{
                __CLR4_4_1b1eb1eldni846w.R.inc(14562);appendTo.append(c, lastHold, pos.getIndex() - lastHold).append(
                        QUOTE);
                __CLR4_4_1b1eb1eldni846w.R.inc(14563);pos.setIndex(i + ESCAPED_QUOTE.length());
                __CLR4_4_1b1eb1eldni846w.R.inc(14564);lastHold = pos.getIndex();
                __CLR4_4_1b1eb1eldni846w.R.inc(14565);continue;
            }
            }boolean __CLB4_4_1_bool3=false;__CLR4_4_1b1eb1eldni846w.R.inc(14566);switch (c[pos.getIndex()]) {
            case QUOTE:if (!__CLB4_4_1_bool3) {__CLR4_4_1b1eb1eldni846w.R.inc(14567);__CLB4_4_1_bool3=true;}
                __CLR4_4_1b1eb1eldni846w.R.inc(14568);next(pos);
                __CLR4_4_1b1eb1eldni846w.R.inc(14569);return (((appendTo == null )&&(__CLR4_4_1b1eb1eldni846w.R.iget(14570)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14571)==0&false))? null : appendTo.append(c, lastHold,
                        pos.getIndex() - lastHold);
            default:if (!__CLB4_4_1_bool3) {__CLR4_4_1b1eb1eldni846w.R.inc(14572);__CLB4_4_1_bool3=true;}
                __CLR4_4_1b1eb1eldni846w.R.inc(14573);next(pos);
            }
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14574);throw new IllegalArgumentException(
                "Unterminated quoted string at position " + start);
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Consume quoted string only
     *
     * @param pattern pattern to parse
     * @param pos current parse position
     * @param escapingOn whether to process escaped quotes
     */
    private void getQuotedString(final String pattern, final ParsePosition pos,
            final boolean escapingOn) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14575);
        __CLR4_4_1b1eb1eldni846w.R.inc(14576);appendQuotedString(pattern, pos, null, escapingOn);
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}

    /**
     * Learn whether the specified Collection contains non-null elements.
     * @param coll to check
     * @return <code>true</code> if some Object was found, <code>false</code> otherwise.
     */
    private boolean containsElements(final Collection<?> coll) {try{__CLR4_4_1b1eb1eldni846w.R.inc(14577);
        __CLR4_4_1b1eb1eldni846w.R.inc(14578);if ((((coll == null || coll.isEmpty())&&(__CLR4_4_1b1eb1eldni846w.R.iget(14579)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14580)==0&false))) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14581);return false;
        }
        }__CLR4_4_1b1eb1eldni846w.R.inc(14582);for (final Object name : coll) {{
            __CLR4_4_1b1eb1eldni846w.R.inc(14583);if ((((name != null)&&(__CLR4_4_1b1eb1eldni846w.R.iget(14584)!=0|true))||(__CLR4_4_1b1eb1eldni846w.R.iget(14585)==0&false))) {{
                __CLR4_4_1b1eb1eldni846w.R.inc(14586);return true;
            }
        }}
        }__CLR4_4_1b1eb1eldni846w.R.inc(14587);return false;
    }finally{__CLR4_4_1b1eb1eldni846w.R.flushNeeded();}}
}
