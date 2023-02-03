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

import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.builder.Builder;

/**
 * Builds a string from constituent parts providing a more flexible and powerful API
 * than StringBuffer.
 * <p>
 * The main differences from StringBuffer/StringBuilder are:
 * <ul>
 * <li>Not synchronized</li>
 * <li>Not final</li>
 * <li>Subclasses have direct access to character array</li>
 * <li>Additional methods
 *  <ul>
 *   <li>appendWithSeparators - adds an array of values, with a separator</li>
 *   <li>appendPadding - adds a length padding characters</li>
 *   <li>appendFixedLength - adds a fixed width field to the builder</li>
 *   <li>toCharArray/getChars - simpler ways to get a range of the character array</li>
 *   <li>delete - delete char or string</li>
 *   <li>replace - search and replace for a char or string</li>
 *   <li>leftString/rightString/midString - substring without exceptions</li>
 *   <li>contains - whether the builder contains a char or string</li>
 *   <li>size/clear/isEmpty - collections style API methods</li>
 *  </ul>
 * </li>
 * </ul>
 * <li>Views
 *  <ul>
 *   <li>asTokenizer - uses the internal buffer as the source of a StrTokenizer</li>
 *   <li>asReader - uses the internal buffer as the source of a Reader</li>
 *   <li>asWriter - allows a Writer to write directly to the internal buffer</li>
 *  </ul>
 * </li>
 * </ul>
 * <p>
 * The aim has been to provide an API that mimics very closely what StringBuffer
 * provides, but with additional methods. It should be noted that some edge cases,
 * with invalid indices or null input, have been altered - see individual methods.
 * The biggest of these changes is that by default, null will not output the text
 * 'null'. This can be controlled by a property, {@link #setNullText(String)}.
 * <p>
 * Prior to 3.0, this class implemented Cloneable but did not implement the 
 * clone method so could not be used. From 3.0 onwards it no longer implements 
 * the interface. 
 *
 * @since 2.2
 * @version $Id$
 */
public class StrBuilder implements CharSequence, Appendable, Serializable, Builder<String> {public static class __CLR4_4_1b9zb9zldni8492{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,15931,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The extra capacity for new builders.
     */
    static final int CAPACITY = 32;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 7628716375283629643L;

    /** Internal data storage. */
    protected char[] buffer; // TODO make private?
    /** Current size of the buffer. */
    protected int size; // TODO make private?
    /** The new line. */
    private String newLine;
    /** The null text. */
    private String nullText;

    //-----------------------------------------------------------------------
    /**
     * Constructor that creates an empty builder initial capacity 32 characters.
     */
    public StrBuilder() {
        this(CAPACITY);__CLR4_4_1b9zb9zldni8492.R.inc(14616);try{__CLR4_4_1b9zb9zldni8492.R.inc(14615);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Constructor that creates an empty builder the specified initial capacity.
     *
     * @param initialCapacity  the initial capacity, zero or less will be converted to 32
     */
    public StrBuilder(int initialCapacity) {
        super();__CLR4_4_1b9zb9zldni8492.R.inc(14618);try{__CLR4_4_1b9zb9zldni8492.R.inc(14617);
        __CLR4_4_1b9zb9zldni8492.R.inc(14619);if ((((initialCapacity <= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14620)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14621)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14622);initialCapacity = CAPACITY;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14623);buffer = new char[initialCapacity];
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Constructor that creates a builder from the string, allocating
     * 32 extra characters for growth.
     *
     * @param str  the string to copy, null treated as blank string
     */
    public StrBuilder(final String str) {
        super();__CLR4_4_1b9zb9zldni8492.R.inc(14625);try{__CLR4_4_1b9zb9zldni8492.R.inc(14624);
        __CLR4_4_1b9zb9zldni8492.R.inc(14626);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14627)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14628)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14629);buffer = new char[CAPACITY];
        } }else {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14630);buffer = new char[str.length() + CAPACITY];
            __CLR4_4_1b9zb9zldni8492.R.inc(14631);append(str);
        }
    }}finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the text to be appended when a new line is added.
     *
     * @return the new line text, null means use system default
     */
    public String getNewLineText() {try{__CLR4_4_1b9zb9zldni8492.R.inc(14632);
        __CLR4_4_1b9zb9zldni8492.R.inc(14633);return newLine;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Sets the text to be appended when a new line is added.
     *
     * @param newLine  the new line text, null means use system default
     * @return this, to enable chaining
     */
    public StrBuilder setNewLineText(final String newLine) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14634);
        __CLR4_4_1b9zb9zldni8492.R.inc(14635);this.newLine = newLine;
        __CLR4_4_1b9zb9zldni8492.R.inc(14636);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the text to be appended when null is added.
     *
     * @return the null text, null means no append
     */
    public String getNullText() {try{__CLR4_4_1b9zb9zldni8492.R.inc(14637);
        __CLR4_4_1b9zb9zldni8492.R.inc(14638);return nullText;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Sets the text to be appended when null is added.
     *
     * @param nullText  the null text, null means no append
     * @return this, to enable chaining
     */
    public StrBuilder setNullText(String nullText) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14639);
        __CLR4_4_1b9zb9zldni8492.R.inc(14640);if ((((nullText != null && nullText.isEmpty())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14641)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14642)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14643);nullText = null;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14644);this.nullText = nullText;
        __CLR4_4_1b9zb9zldni8492.R.inc(14645);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the length of the string builder.
     *
     * @return the length
     */
    @Override
    public int length() {try{__CLR4_4_1b9zb9zldni8492.R.inc(14646);
        __CLR4_4_1b9zb9zldni8492.R.inc(14647);return size;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Updates the length of the builder by either dropping the last characters
     * or adding filler of Unicode zero.
     *
     * @param length  the length to set to, must be zero or positive
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the length is negative
     */
    public StrBuilder setLength(final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14648);
        __CLR4_4_1b9zb9zldni8492.R.inc(14649);if ((((length < 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14650)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14651)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14652);throw new StringIndexOutOfBoundsException(length);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14653);if ((((length < size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14654)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14655)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14656);size = length;
        } }else {__CLR4_4_1b9zb9zldni8492.R.inc(14657);if ((((length > size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14658)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14659)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14660);ensureCapacity(length);
            __CLR4_4_1b9zb9zldni8492.R.inc(14661);final int oldEnd = size;
            __CLR4_4_1b9zb9zldni8492.R.inc(14662);final int newEnd = length;
            __CLR4_4_1b9zb9zldni8492.R.inc(14663);size = length;
            __CLR4_4_1b9zb9zldni8492.R.inc(14664);for (int i = oldEnd; (((i < newEnd)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14665)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14666)==0&false)); i++) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(14667);buffer[i] = '\0';
            }
        }}
        }}__CLR4_4_1b9zb9zldni8492.R.inc(14668);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the current size of the internal character array buffer.
     *
     * @return the capacity
     */
    public int capacity() {try{__CLR4_4_1b9zb9zldni8492.R.inc(14669);
        __CLR4_4_1b9zb9zldni8492.R.inc(14670);return buffer.length;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Checks the capacity and ensures that it is at least the size specified.
     *
     * @param capacity  the capacity to ensure
     * @return this, to enable chaining
     */
    public StrBuilder ensureCapacity(final int capacity) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14671);
        __CLR4_4_1b9zb9zldni8492.R.inc(14672);if ((((capacity > buffer.length)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14673)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14674)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14675);final char[] old = buffer;
            __CLR4_4_1b9zb9zldni8492.R.inc(14676);buffer = new char[capacity * 2];
            __CLR4_4_1b9zb9zldni8492.R.inc(14677);System.arraycopy(old, 0, buffer, 0, size);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14678);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Minimizes the capacity to the actual length of the string.
     *
     * @return this, to enable chaining
     */
    public StrBuilder minimizeCapacity() {try{__CLR4_4_1b9zb9zldni8492.R.inc(14679);
        __CLR4_4_1b9zb9zldni8492.R.inc(14680);if ((((buffer.length > length())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14681)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14682)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14683);final char[] old = buffer;
            __CLR4_4_1b9zb9zldni8492.R.inc(14684);buffer = new char[length()];
            __CLR4_4_1b9zb9zldni8492.R.inc(14685);System.arraycopy(old, 0, buffer, 0, size);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14686);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the length of the string builder.
     * <p>
     * This method is the same as {@link #length()} and is provided to match the
     * API of Collections.
     *
     * @return the length
     */
    public int size() {try{__CLR4_4_1b9zb9zldni8492.R.inc(14687);
        __CLR4_4_1b9zb9zldni8492.R.inc(14688);return size;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Checks is the string builder is empty (convenience Collections API style method).
     * <p>
     * This method is the same as checking {@link #length()} and is provided to match the
     * API of Collections.
     *
     * @return <code>true</code> if the size is <code>0</code>.
     */
    public boolean isEmpty() {try{__CLR4_4_1b9zb9zldni8492.R.inc(14689);
        __CLR4_4_1b9zb9zldni8492.R.inc(14690);return size == 0;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Clears the string builder (convenience Collections API style method).
     * <p>
     * This method does not reduce the size of the internal character buffer.
     * To do that, call <code>clear()</code> followed by {@link #minimizeCapacity()}.
     * <p>
     * This method is the same as {@link #setLength(int)} called with zero
     * and is provided to match the API of Collections.
     *
     * @return this, to enable chaining
     */
    public StrBuilder clear() {try{__CLR4_4_1b9zb9zldni8492.R.inc(14691);
        __CLR4_4_1b9zb9zldni8492.R.inc(14692);size = 0;
        __CLR4_4_1b9zb9zldni8492.R.inc(14693);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the character at the specified index.
     *
     * @see #setCharAt(int, char)
     * @see #deleteCharAt(int)
     * @param index  the index to retrieve, must be valid
     * @return the character at the index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    @Override
    public char charAt(final int index) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14694);
        __CLR4_4_1b9zb9zldni8492.R.inc(14695);if ((((index < 0 || index >= length())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14696)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14697)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14698);throw new StringIndexOutOfBoundsException(index);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14699);return buffer[index];
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Sets the character at the specified index.
     *
     * @see #charAt(int)
     * @see #deleteCharAt(int)
     * @param index  the index to set
     * @param ch  the new character
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder setCharAt(final int index, final char ch) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14700);
        __CLR4_4_1b9zb9zldni8492.R.inc(14701);if ((((index < 0 || index >= length())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14702)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14703)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14704);throw new StringIndexOutOfBoundsException(index);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14705);buffer[index] = ch;
        __CLR4_4_1b9zb9zldni8492.R.inc(14706);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Deletes the character at the specified index.
     *
     * @see #charAt(int)
     * @see #setCharAt(int, char)
     * @param index  the index to delete
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder deleteCharAt(final int index) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14707);
        __CLR4_4_1b9zb9zldni8492.R.inc(14708);if ((((index < 0 || index >= size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14709)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14710)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14711);throw new StringIndexOutOfBoundsException(index);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14712);deleteImpl(index, index + 1, 1);
        __CLR4_4_1b9zb9zldni8492.R.inc(14713);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Copies the builder's character array into a new character array.
     * 
     * @return a new array that represents the contents of the builder
     */
    public char[] toCharArray() {try{__CLR4_4_1b9zb9zldni8492.R.inc(14714);
        __CLR4_4_1b9zb9zldni8492.R.inc(14715);if ((((size == 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14716)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14717)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14718);return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14719);final char chars[] = new char[size];
        __CLR4_4_1b9zb9zldni8492.R.inc(14720);System.arraycopy(buffer, 0, chars, 0, size);
        __CLR4_4_1b9zb9zldni8492.R.inc(14721);return chars;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Copies part of the builder's character array into a new character array.
     * 
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except that
     *  if too large it is treated as end of string
     * @return a new array that holds part of the contents of the builder
     * @throws IndexOutOfBoundsException if startIndex is invalid,
     *  or if endIndex is invalid (but endIndex greater than size is valid)
     */
    public char[] toCharArray(final int startIndex, int endIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14722);
        __CLR4_4_1b9zb9zldni8492.R.inc(14723);endIndex = validateRange(startIndex, endIndex);
        __CLR4_4_1b9zb9zldni8492.R.inc(14724);final int len = endIndex - startIndex;
        __CLR4_4_1b9zb9zldni8492.R.inc(14725);if ((((len == 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14726)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14727)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14728);return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14729);final char chars[] = new char[len];
        __CLR4_4_1b9zb9zldni8492.R.inc(14730);System.arraycopy(buffer, startIndex, chars, 0, len);
        __CLR4_4_1b9zb9zldni8492.R.inc(14731);return chars;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Copies the character array into the specified array.
     * 
     * @param destination  the destination array, null will cause an array to be created
     * @return the input array, unless that was null or too small
     */
    public char[] getChars(char[] destination) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14732);
        __CLR4_4_1b9zb9zldni8492.R.inc(14733);final int len = length();
        __CLR4_4_1b9zb9zldni8492.R.inc(14734);if ((((destination == null || destination.length < len)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14735)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14736)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14737);destination = new char[len];
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14738);System.arraycopy(buffer, 0, destination, 0, len);
        __CLR4_4_1b9zb9zldni8492.R.inc(14739);return destination;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Copies the character array into the specified array.
     *
     * @param startIndex  first index to copy, inclusive, must be valid
     * @param endIndex  last index, exclusive, must be valid
     * @param destination  the destination array, must not be null or too small
     * @param destinationIndex  the index to start copying in destination
     * @throws NullPointerException if the array is null
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    public void getChars(final int startIndex, final int endIndex, final char destination[], final int destinationIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14740);
        __CLR4_4_1b9zb9zldni8492.R.inc(14741);if ((((startIndex < 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14742)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14743)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14744);throw new StringIndexOutOfBoundsException(startIndex);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14745);if ((((endIndex < 0 || endIndex > length())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14746)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14747)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14748);throw new StringIndexOutOfBoundsException(endIndex);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14749);if ((((startIndex > endIndex)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14750)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14751)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14752);throw new StringIndexOutOfBoundsException("end < start");
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14753);System.arraycopy(buffer, startIndex, destination, destinationIndex, endIndex - startIndex);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends the new line string to this string builder.
     * <p>
     * The new line string can be altered using {@link #setNewLineText(String)}.
     * This might be used to force the output to always use Unix line endings
     * even when on Windows.
     *
     * @return this, to enable chaining
     */
    public StrBuilder appendNewLine() {try{__CLR4_4_1b9zb9zldni8492.R.inc(14754);
        __CLR4_4_1b9zb9zldni8492.R.inc(14755);if ((((newLine == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14756)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14757)==0&false)))  {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14758);append(SystemUtils.LINE_SEPARATOR);
            __CLR4_4_1b9zb9zldni8492.R.inc(14759);return this;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14760);return append(newLine);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends the text representing <code>null</code> to this string builder.
     *
     * @return this, to enable chaining
     */
    public StrBuilder appendNull() {try{__CLR4_4_1b9zb9zldni8492.R.inc(14761);
        __CLR4_4_1b9zb9zldni8492.R.inc(14762);if ((((nullText == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14763)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14764)==0&false)))  {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14765);return this;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14766);return append(nullText);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends an object to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param obj  the object to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final Object obj) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14767);
        __CLR4_4_1b9zb9zldni8492.R.inc(14768);if ((((obj == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14769)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14770)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14771);return appendNull();
        } 
        }__CLR4_4_1b9zb9zldni8492.R.inc(14772);return append(obj.toString());        
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a CharSequence to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param seq  the CharSequence to append
     * @return this, to enable chaining
     * @since 3.0
     */
    @Override
    public StrBuilder append(final CharSequence seq) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14773);
        __CLR4_4_1b9zb9zldni8492.R.inc(14774);if ((((seq == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14775)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14776)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14777);return appendNull();
        } 
        }__CLR4_4_1b9zb9zldni8492.R.inc(14778);return append(seq.toString());        
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends part of a CharSequence to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param seq  the CharSequence to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 3.0
     */
    @Override
    public StrBuilder append(final CharSequence seq, final int startIndex, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14779);
        __CLR4_4_1b9zb9zldni8492.R.inc(14780);if ((((seq == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14781)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14782)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14783);return appendNull();
        } 
        }__CLR4_4_1b9zb9zldni8492.R.inc(14784);return append(seq.toString(), startIndex, length);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}
    
    /**
     * Appends a string to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final String str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14785);
        __CLR4_4_1b9zb9zldni8492.R.inc(14786);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14787)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14788)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14789);return appendNull();
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14790);final int strLen = str.length();
        __CLR4_4_1b9zb9zldni8492.R.inc(14791);if ((((strLen > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14792)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14793)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14794);final int len = length();
            __CLR4_4_1b9zb9zldni8492.R.inc(14795);ensureCapacity(len + strLen);
            __CLR4_4_1b9zb9zldni8492.R.inc(14796);str.getChars(0, strLen, buffer, len);
            __CLR4_4_1b9zb9zldni8492.R.inc(14797);size += strLen;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14798);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}
   

    /**
     * Appends part of a string to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     */
    public StrBuilder append(final String str, final int startIndex, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14799);
        __CLR4_4_1b9zb9zldni8492.R.inc(14800);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14801)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14802)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14803);return appendNull();
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14804);if ((((startIndex < 0 || startIndex > str.length())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14805)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14806)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14807);throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14808);if ((((length < 0 || (startIndex + length) > str.length())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14809)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14810)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14811);throw new StringIndexOutOfBoundsException("length must be valid");
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14812);if ((((length > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14813)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14814)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14815);final int len = length();
            __CLR4_4_1b9zb9zldni8492.R.inc(14816);ensureCapacity(len + length);
            __CLR4_4_1b9zb9zldni8492.R.inc(14817);str.getChars(startIndex, startIndex + length, buffer, len);
            __CLR4_4_1b9zb9zldni8492.R.inc(14818);size += length;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14819);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Calls {@link String#format(String, Object...)} and appends the result.
     *
     * @param format the format string
     * @param objs the objects to use in the format string
     * @return {@code this} to enable chaining
     * @see String#format(String, Object...)
     * @since 3.2
     */
    public StrBuilder append(final String format, final Object... objs) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14820);
        __CLR4_4_1b9zb9zldni8492.R.inc(14821);return append(String.format(format, objs));
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a string buffer to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string buffer to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final StringBuffer str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14822);
        __CLR4_4_1b9zb9zldni8492.R.inc(14823);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14824)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14825)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14826);return appendNull();
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14827);final int strLen = str.length();
        __CLR4_4_1b9zb9zldni8492.R.inc(14828);if ((((strLen > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14829)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14830)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14831);final int len = length();
            __CLR4_4_1b9zb9zldni8492.R.inc(14832);ensureCapacity(len + strLen);
            __CLR4_4_1b9zb9zldni8492.R.inc(14833);str.getChars(0, strLen, buffer, len);
            __CLR4_4_1b9zb9zldni8492.R.inc(14834);size += strLen;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14835);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends part of a string buffer to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     */
    public StrBuilder append(final StringBuffer str, final int startIndex, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14836);
        __CLR4_4_1b9zb9zldni8492.R.inc(14837);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14838)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14839)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14840);return appendNull();
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14841);if ((((startIndex < 0 || startIndex > str.length())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14842)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14843)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14844);throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14845);if ((((length < 0 || (startIndex + length) > str.length())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14846)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14847)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14848);throw new StringIndexOutOfBoundsException("length must be valid");
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14849);if ((((length > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14850)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14851)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14852);final int len = length();
            __CLR4_4_1b9zb9zldni8492.R.inc(14853);ensureCapacity(len + length);
            __CLR4_4_1b9zb9zldni8492.R.inc(14854);str.getChars(startIndex, startIndex + length, buffer, len);
            __CLR4_4_1b9zb9zldni8492.R.inc(14855);size += length;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14856);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a StringBuilder to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str the StringBuilder to append
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrBuilder append(final StringBuilder str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14857);
        __CLR4_4_1b9zb9zldni8492.R.inc(14858);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14859)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14860)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14861);return appendNull();
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14862);final int strLen = str.length();
        __CLR4_4_1b9zb9zldni8492.R.inc(14863);if ((((strLen > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14864)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14865)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14866);final int len = length();
            __CLR4_4_1b9zb9zldni8492.R.inc(14867);ensureCapacity(len + strLen);
            __CLR4_4_1b9zb9zldni8492.R.inc(14868);str.getChars(0, strLen, buffer, len);
            __CLR4_4_1b9zb9zldni8492.R.inc(14869);size += strLen;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14870);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}
    
    /**
     * Appends part of a StringBuilder to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str the StringBuilder to append
     * @param startIndex the start index, inclusive, must be valid
     * @param length the length to append, must be valid
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrBuilder append(final StringBuilder str, final int startIndex, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14871);
        __CLR4_4_1b9zb9zldni8492.R.inc(14872);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14873)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14874)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14875);return appendNull();
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14876);if ((((startIndex < 0 || startIndex > str.length())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14877)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14878)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14879);throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14880);if ((((length < 0 || (startIndex + length) > str.length())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14881)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14882)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14883);throw new StringIndexOutOfBoundsException("length must be valid");
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14884);if ((((length > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14885)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14886)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14887);final int len = length();
            __CLR4_4_1b9zb9zldni8492.R.inc(14888);ensureCapacity(len + length);
            __CLR4_4_1b9zb9zldni8492.R.inc(14889);str.getChars(startIndex, startIndex + length, buffer, len);
            __CLR4_4_1b9zb9zldni8492.R.inc(14890);size += length;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14891);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends another string builder to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string builder to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final StrBuilder str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14892);
        __CLR4_4_1b9zb9zldni8492.R.inc(14893);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14894)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14895)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14896);return appendNull();
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14897);final int strLen = str.length();
        __CLR4_4_1b9zb9zldni8492.R.inc(14898);if ((((strLen > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14899)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14900)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14901);final int len = length();
            __CLR4_4_1b9zb9zldni8492.R.inc(14902);ensureCapacity(len + strLen);
            __CLR4_4_1b9zb9zldni8492.R.inc(14903);System.arraycopy(str.buffer, 0, buffer, len, strLen);
            __CLR4_4_1b9zb9zldni8492.R.inc(14904);size += strLen;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14905);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends part of a string builder to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     */
    public StrBuilder append(final StrBuilder str, final int startIndex, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14906);
        __CLR4_4_1b9zb9zldni8492.R.inc(14907);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14908)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14909)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14910);return appendNull();
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14911);if ((((startIndex < 0 || startIndex > str.length())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14912)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14913)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14914);throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14915);if ((((length < 0 || (startIndex + length) > str.length())&&(__CLR4_4_1b9zb9zldni8492.R.iget(14916)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14917)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14918);throw new StringIndexOutOfBoundsException("length must be valid");
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14919);if ((((length > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14920)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14921)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14922);final int len = length();
            __CLR4_4_1b9zb9zldni8492.R.inc(14923);ensureCapacity(len + length);
            __CLR4_4_1b9zb9zldni8492.R.inc(14924);str.getChars(startIndex, startIndex + length, buffer, len);
            __CLR4_4_1b9zb9zldni8492.R.inc(14925);size += length;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14926);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a char array to the string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param chars  the char array to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final char[] chars) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14927);
        __CLR4_4_1b9zb9zldni8492.R.inc(14928);if ((((chars == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14929)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14930)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14931);return appendNull();
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14932);final int strLen = chars.length;
        __CLR4_4_1b9zb9zldni8492.R.inc(14933);if ((((strLen > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14934)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14935)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14936);final int len = length();
            __CLR4_4_1b9zb9zldni8492.R.inc(14937);ensureCapacity(len + strLen);
            __CLR4_4_1b9zb9zldni8492.R.inc(14938);System.arraycopy(chars, 0, buffer, len, strLen);
            __CLR4_4_1b9zb9zldni8492.R.inc(14939);size += strLen;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14940);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a char array to the string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param chars  the char array to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     */
    public StrBuilder append(final char[] chars, final int startIndex, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14941);
        __CLR4_4_1b9zb9zldni8492.R.inc(14942);if ((((chars == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14943)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14944)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14945);return appendNull();
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14946);if ((((startIndex < 0 || startIndex > chars.length)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14947)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14948)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14949);throw new StringIndexOutOfBoundsException("Invalid startIndex: " + length);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14950);if ((((length < 0 || (startIndex + length) > chars.length)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14951)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14952)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14953);throw new StringIndexOutOfBoundsException("Invalid length: " + length);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14954);if ((((length > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14955)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14956)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14957);final int len = length();
            __CLR4_4_1b9zb9zldni8492.R.inc(14958);ensureCapacity(len + length);
            __CLR4_4_1b9zb9zldni8492.R.inc(14959);System.arraycopy(chars, startIndex, buffer, len, length);
            __CLR4_4_1b9zb9zldni8492.R.inc(14960);size += length;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14961);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a boolean value to the string builder.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final boolean value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14962);
        __CLR4_4_1b9zb9zldni8492.R.inc(14963);if ((((value)&&(__CLR4_4_1b9zb9zldni8492.R.iget(14964)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(14965)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14966);ensureCapacity(size + 4);
            __CLR4_4_1b9zb9zldni8492.R.inc(14967);buffer[size++] = 't';
            __CLR4_4_1b9zb9zldni8492.R.inc(14968);buffer[size++] = 'r';
            __CLR4_4_1b9zb9zldni8492.R.inc(14969);buffer[size++] = 'u';
            __CLR4_4_1b9zb9zldni8492.R.inc(14970);buffer[size++] = 'e';
        } }else {{
            __CLR4_4_1b9zb9zldni8492.R.inc(14971);ensureCapacity(size + 5);
            __CLR4_4_1b9zb9zldni8492.R.inc(14972);buffer[size++] = 'f';
            __CLR4_4_1b9zb9zldni8492.R.inc(14973);buffer[size++] = 'a';
            __CLR4_4_1b9zb9zldni8492.R.inc(14974);buffer[size++] = 'l';
            __CLR4_4_1b9zb9zldni8492.R.inc(14975);buffer[size++] = 's';
            __CLR4_4_1b9zb9zldni8492.R.inc(14976);buffer[size++] = 'e';
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(14977);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a char value to the string builder.
     *
     * @param ch  the value to append
     * @return this, to enable chaining
     * @since 3.0
     */
    @Override
    public StrBuilder append(final char ch) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14978);
        __CLR4_4_1b9zb9zldni8492.R.inc(14979);final int len = length();
        __CLR4_4_1b9zb9zldni8492.R.inc(14980);ensureCapacity(len + 1);
        __CLR4_4_1b9zb9zldni8492.R.inc(14981);buffer[size++] = ch;
        __CLR4_4_1b9zb9zldni8492.R.inc(14982);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends an int value to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final int value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14983);
        __CLR4_4_1b9zb9zldni8492.R.inc(14984);return append(String.valueOf(value));
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a long value to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final long value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14985);
        __CLR4_4_1b9zb9zldni8492.R.inc(14986);return append(String.valueOf(value));
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a float value to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final float value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14987);
        __CLR4_4_1b9zb9zldni8492.R.inc(14988);return append(String.valueOf(value));
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a double value to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final double value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14989);
        __CLR4_4_1b9zb9zldni8492.R.inc(14990);return append(String.valueOf(value));
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends an object followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param obj  the object to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final Object obj) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14991);
        __CLR4_4_1b9zb9zldni8492.R.inc(14992);return append(obj).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a string followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final String str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14993);
        __CLR4_4_1b9zb9zldni8492.R.inc(14994);return append(str).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends part of a string followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final String str, final int startIndex, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14995);
        __CLR4_4_1b9zb9zldni8492.R.inc(14996);return append(str, startIndex, length).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Calls {@link String#format(String, Object...)} and appends the result.
     *
     * @param format the format string
     * @param objs the objects to use in the format string
     * @return {@code this} to enable chaining
     * @see String#format(String, Object...)
     * @since 3.2
     */
    public StrBuilder appendln(final String format, final Object... objs) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14997);
        __CLR4_4_1b9zb9zldni8492.R.inc(14998);return append(format, objs).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a string buffer followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string buffer to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final StringBuffer str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(14999);
        __CLR4_4_1b9zb9zldni8492.R.inc(15000);return append(str).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a string builder followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string builder to append
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrBuilder appendln(final StringBuilder str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15001);
        __CLR4_4_1b9zb9zldni8492.R.inc(15002);return append(str).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends part of a string builder followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string builder to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrBuilder appendln(final StringBuilder str, final int startIndex, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15003);
        __CLR4_4_1b9zb9zldni8492.R.inc(15004);return append(str, startIndex, length).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends part of a string buffer followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final StringBuffer str, final int startIndex, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15005);
        __CLR4_4_1b9zb9zldni8492.R.inc(15006);return append(str, startIndex, length).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends another string builder followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string builder to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final StrBuilder str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15007);
        __CLR4_4_1b9zb9zldni8492.R.inc(15008);return append(str).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends part of a string builder followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final StrBuilder str, final int startIndex, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15009);
        __CLR4_4_1b9zb9zldni8492.R.inc(15010);return append(str, startIndex, length).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a char array followed by a new line to the string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param chars  the char array to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final char[] chars) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15011);
        __CLR4_4_1b9zb9zldni8492.R.inc(15012);return append(chars).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a char array followed by a new line to the string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param chars  the char array to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final char[] chars, final int startIndex, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15013);
        __CLR4_4_1b9zb9zldni8492.R.inc(15014);return append(chars, startIndex, length).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a boolean value followed by a new line to the string builder.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final boolean value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15015);
        __CLR4_4_1b9zb9zldni8492.R.inc(15016);return append(value).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a char value followed by a new line to the string builder.
     *
     * @param ch  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final char ch) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15017);
        __CLR4_4_1b9zb9zldni8492.R.inc(15018);return append(ch).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends an int value followed by a new line to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final int value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15019);
        __CLR4_4_1b9zb9zldni8492.R.inc(15020);return append(value).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a long value followed by a new line to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final long value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15021);
        __CLR4_4_1b9zb9zldni8492.R.inc(15022);return append(value).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a float value followed by a new line to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final float value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15023);
        __CLR4_4_1b9zb9zldni8492.R.inc(15024);return append(value).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a double value followed by a new line to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final double value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15025);
        __CLR4_4_1b9zb9zldni8492.R.inc(15026);return append(value).appendNewLine();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends each item in an array to the builder without any separators.
     * Appending a null array will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param <T>  the element type
     * @param array  the array to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public <T> StrBuilder appendAll(final T... array) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15027);
        __CLR4_4_1b9zb9zldni8492.R.inc(15028);if ((((array != null && array.length > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15029)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15030)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15031);for (final Object element : array) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15032);append(element);
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15033);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends each item in a iterable to the builder without any separators.
     * Appending a null iterable will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param iterable  the iterable to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendAll(final Iterable<?> iterable) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15034);
        __CLR4_4_1b9zb9zldni8492.R.inc(15035);if ((((iterable != null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15036)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15037)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15038);for (final Object o : iterable) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15039);append(o);
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15040);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends each item in an iterator to the builder without any separators.
     * Appending a null iterator will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param it  the iterator to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendAll(final Iterator<?> it) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15041);
        __CLR4_4_1b9zb9zldni8492.R.inc(15042);if ((((it != null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15043)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15044)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15045);while ((((it.hasNext())&&(__CLR4_4_1b9zb9zldni8492.R.iget(15046)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15047)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15048);append(it.next());
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15049);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends an array placing separators between each value, but
     * not before the first or after the last.
     * Appending a null array will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param array  the array to append
     * @param separator  the separator to use, null means no separator
     * @return this, to enable chaining
     */
    public StrBuilder appendWithSeparators(final Object[] array, String separator) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15050);
        __CLR4_4_1b9zb9zldni8492.R.inc(15051);if ((((array != null && array.length > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15052)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15053)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15054);separator = ObjectUtils.toString(separator);
            __CLR4_4_1b9zb9zldni8492.R.inc(15055);append(array[0]);
            __CLR4_4_1b9zb9zldni8492.R.inc(15056);for (int i = 1; (((i < array.length)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15057)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15058)==0&false)); i++) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15059);append(separator);
                __CLR4_4_1b9zb9zldni8492.R.inc(15060);append(array[i]);
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15061);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a iterable placing separators between each value, but
     * not before the first or after the last.
     * Appending a null iterable will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param iterable  the iterable to append
     * @param separator  the separator to use, null means no separator
     * @return this, to enable chaining
     */
    public StrBuilder appendWithSeparators(final Iterable<?> iterable, String separator) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15062);
        __CLR4_4_1b9zb9zldni8492.R.inc(15063);if ((((iterable != null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15064)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15065)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15066);separator = ObjectUtils.toString(separator);
            __CLR4_4_1b9zb9zldni8492.R.inc(15067);final Iterator<?> it = iterable.iterator();
            __CLR4_4_1b9zb9zldni8492.R.inc(15068);while ((((it.hasNext())&&(__CLR4_4_1b9zb9zldni8492.R.iget(15069)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15070)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15071);append(it.next());
                __CLR4_4_1b9zb9zldni8492.R.inc(15072);if ((((it.hasNext())&&(__CLR4_4_1b9zb9zldni8492.R.iget(15073)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15074)==0&false))) {{
                    __CLR4_4_1b9zb9zldni8492.R.inc(15075);append(separator);
                }
            }}
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15076);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends an iterator placing separators between each value, but
     * not before the first or after the last.
     * Appending a null iterator will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param it  the iterator to append
     * @param separator  the separator to use, null means no separator
     * @return this, to enable chaining
     */
    public StrBuilder appendWithSeparators(final Iterator<?> it, String separator) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15077);
        __CLR4_4_1b9zb9zldni8492.R.inc(15078);if ((((it != null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15079)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15080)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15081);separator = ObjectUtils.toString(separator);
            __CLR4_4_1b9zb9zldni8492.R.inc(15082);while ((((it.hasNext())&&(__CLR4_4_1b9zb9zldni8492.R.iget(15083)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15084)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15085);append(it.next());
                __CLR4_4_1b9zb9zldni8492.R.inc(15086);if ((((it.hasNext())&&(__CLR4_4_1b9zb9zldni8492.R.iget(15087)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15088)==0&false))) {{
                    __CLR4_4_1b9zb9zldni8492.R.inc(15089);append(separator);
                }
            }}
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15090);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends a separator if the builder is currently non-empty.
     * Appending a null separator will have no effect.
     * The separator is appended using {@link #append(String)}.
     * <p>
     * This method is useful for adding a separator each time around the
     * loop except the first.
     * <pre>
     * for (Iterator it = list.iterator(); it.hasNext(); ) {
     *   appendSeparator(",");
     *   append(it.next());
     * }
     * </pre>
     * Note that for this simple example, you should use
     * {@link #appendWithSeparators(Iterable, String)}.
     * 
     * @param separator  the separator to use, null means no separator
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendSeparator(final String separator) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15091);
        __CLR4_4_1b9zb9zldni8492.R.inc(15092);return appendSeparator(separator, null);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends one of both separators to the StrBuilder.
     * If the builder is currently empty it will append the defaultIfEmpty-separator
     * Otherwise it will append the standard-separator
     * 
     * Appending a null separator will have no effect.
     * The separator is appended using {@link #append(String)}.
     * <p>
     * This method is for example useful for constructing queries
     * <pre>
     * StrBuilder whereClause = new StrBuilder();
     * if(searchCommand.getPriority() != null) {
     *  whereClause.appendSeparator(" and", " where");
     *  whereClause.append(" priority = ?")
     * }
     * if(searchCommand.getComponent() != null) {
     *  whereClause.appendSeparator(" and", " where");
     *  whereClause.append(" component = ?")
     * }
     * selectClause.append(whereClause)
     * </pre>
     * 
     * @param standard the separator if builder is not empty, null means no separator
     * @param defaultIfEmpty the separator if builder is empty, null means no separator
     * @return this, to enable chaining
     * @since 2.5
     */
    public StrBuilder appendSeparator(final String standard, final String defaultIfEmpty) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15093);
        __CLR4_4_1b9zb9zldni8492.R.inc(15094);final String str = (((isEmpty() )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15095)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15096)==0&false))? defaultIfEmpty : standard;
        __CLR4_4_1b9zb9zldni8492.R.inc(15097);if ((((str != null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15098)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15099)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15100);append(str);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15101);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a separator if the builder is currently non-empty.
     * The separator is appended using {@link #append(char)}.
     * <p>
     * This method is useful for adding a separator each time around the
     * loop except the first.
     * <pre>
     * for (Iterator it = list.iterator(); it.hasNext(); ) {
     *   appendSeparator(',');
     *   append(it.next());
     * }
     * </pre>
     * Note that for this simple example, you should use
     * {@link #appendWithSeparators(Iterable, String)}.
     * 
     * @param separator  the separator to use
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendSeparator(final char separator) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15102);
        __CLR4_4_1b9zb9zldni8492.R.inc(15103);if ((((size() > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15104)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15105)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15106);append(separator);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15107);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Append one of both separators to the builder
     * If the builder is currently empty it will append the defaultIfEmpty-separator
     * Otherwise it will append the standard-separator
     *
     * The separator is appended using {@link #append(char)}.
     * @param standard the separator if builder is not empty
     * @param defaultIfEmpty the separator if builder is empty
     * @return this, to enable chaining
     * @since 2.5
     */
    public StrBuilder appendSeparator(final char standard, final char defaultIfEmpty) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15108);
        __CLR4_4_1b9zb9zldni8492.R.inc(15109);if ((((size() > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15110)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15111)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15112);append(standard);
        } }else {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15113);append(defaultIfEmpty);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15114);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}
    /**
     * Appends a separator to the builder if the loop index is greater than zero.
     * Appending a null separator will have no effect.
     * The separator is appended using {@link #append(String)}.
     * <p>
     * This method is useful for adding a separator each time around the
     * loop except the first.
     * <pre>
     * for (int i = 0; i < list.size(); i++) {
     *   appendSeparator(",", i);
     *   append(list.get(i));
     * }
     * </pre>
     * Note that for this simple example, you should use
     * {@link #appendWithSeparators(Iterable, String)}.
     * 
     * @param separator  the separator to use, null means no separator
     * @param loopIndex  the loop index
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendSeparator(final String separator, final int loopIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15115);
        __CLR4_4_1b9zb9zldni8492.R.inc(15116);if ((((separator != null && loopIndex > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15117)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15118)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15119);append(separator);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15120);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends a separator to the builder if the loop index is greater than zero.
     * The separator is appended using {@link #append(char)}.
     * <p>
     * This method is useful for adding a separator each time around the
     * loop except the first.
     * <pre>
     * for (int i = 0; i < list.size(); i++) {
     *   appendSeparator(",", i);
     *   append(list.get(i));
     * }
     * </pre>
     * Note that for this simple example, you should use
     * {@link #appendWithSeparators(Iterable, String)}.
     * 
     * @param separator  the separator to use
     * @param loopIndex  the loop index
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendSeparator(final char separator, final int loopIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15121);
        __CLR4_4_1b9zb9zldni8492.R.inc(15122);if ((((loopIndex > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15123)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15124)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15125);append(separator);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15126);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends the pad character to the builder the specified number of times.
     * 
     * @param length  the length to append, negative means no append
     * @param padChar  the character to append
     * @return this, to enable chaining
     */
    public StrBuilder appendPadding(final int length, final char padChar) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15127);
        __CLR4_4_1b9zb9zldni8492.R.inc(15128);if ((((length >= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15129)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15130)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15131);ensureCapacity(size + length);
            __CLR4_4_1b9zb9zldni8492.R.inc(15132);for (int i = 0; (((i < length)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15133)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15134)==0&false)); i++) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15135);buffer[size++] = padChar;
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15136);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends an object to the builder padding on the left to a fixed width.
     * The <code>toString</code> of the object is used.
     * If the object is larger than the length, the left hand side is lost.
     * If the object is null, the null text value is used.
     * 
     * @param obj  the object to append, null uses null text
     * @param width  the fixed field width, zero or negative has no effect
     * @param padChar  the pad character to use
     * @return this, to enable chaining
     */
    public StrBuilder appendFixedWidthPadLeft(final Object obj, final int width, final char padChar) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15137);
        __CLR4_4_1b9zb9zldni8492.R.inc(15138);if ((((width > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15139)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15140)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15141);ensureCapacity(size + width);
            __CLR4_4_1b9zb9zldni8492.R.inc(15142);String str = ((((obj == null )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15143)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15144)==0&false))? getNullText() : obj.toString());
            __CLR4_4_1b9zb9zldni8492.R.inc(15145);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15146)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15147)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15148);str = "";
            }
            }__CLR4_4_1b9zb9zldni8492.R.inc(15149);final int strLen = str.length();
            __CLR4_4_1b9zb9zldni8492.R.inc(15150);if ((((strLen >= width)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15151)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15152)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15153);str.getChars(strLen - width, strLen, buffer, size);
            } }else {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15154);final int padLen = width - strLen;
                __CLR4_4_1b9zb9zldni8492.R.inc(15155);for (int i = 0; (((i < padLen)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15156)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15157)==0&false)); i++) {{
                    __CLR4_4_1b9zb9zldni8492.R.inc(15158);buffer[size + i] = padChar;
                }
                }__CLR4_4_1b9zb9zldni8492.R.inc(15159);str.getChars(0, strLen, buffer, size + padLen);
            }
            }__CLR4_4_1b9zb9zldni8492.R.inc(15160);size += width;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15161);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends an object to the builder padding on the left to a fixed width.
     * The <code>String.valueOf</code> of the <code>int</code> value is used.
     * If the formatted value is larger than the length, the left hand side is lost.
     * 
     * @param value  the value to append
     * @param width  the fixed field width, zero or negative has no effect
     * @param padChar  the pad character to use
     * @return this, to enable chaining
     */
    public StrBuilder appendFixedWidthPadLeft(final int value, final int width, final char padChar) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15162);
        __CLR4_4_1b9zb9zldni8492.R.inc(15163);return appendFixedWidthPadLeft(String.valueOf(value), width, padChar);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends an object to the builder padding on the right to a fixed length.
     * The <code>toString</code> of the object is used.
     * If the object is larger than the length, the right hand side is lost.
     * If the object is null, null text value is used.
     * 
     * @param obj  the object to append, null uses null text
     * @param width  the fixed field width, zero or negative has no effect
     * @param padChar  the pad character to use
     * @return this, to enable chaining
     */
    public StrBuilder appendFixedWidthPadRight(final Object obj, final int width, final char padChar) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15164);
        __CLR4_4_1b9zb9zldni8492.R.inc(15165);if ((((width > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15166)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15167)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15168);ensureCapacity(size + width);
            __CLR4_4_1b9zb9zldni8492.R.inc(15169);String str = ((((obj == null )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15170)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15171)==0&false))? getNullText() : obj.toString());
            __CLR4_4_1b9zb9zldni8492.R.inc(15172);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15173)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15174)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15175);str = "";
            }
            }__CLR4_4_1b9zb9zldni8492.R.inc(15176);final int strLen = str.length();
            __CLR4_4_1b9zb9zldni8492.R.inc(15177);if ((((strLen >= width)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15178)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15179)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15180);str.getChars(0, width, buffer, size);
            } }else {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15181);final int padLen = width - strLen;
                __CLR4_4_1b9zb9zldni8492.R.inc(15182);str.getChars(0, strLen, buffer, size);
                __CLR4_4_1b9zb9zldni8492.R.inc(15183);for (int i = 0; (((i < padLen)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15184)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15185)==0&false)); i++) {{
                    __CLR4_4_1b9zb9zldni8492.R.inc(15186);buffer[size + strLen + i] = padChar;
                }
            }}
            }__CLR4_4_1b9zb9zldni8492.R.inc(15187);size += width;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15188);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Appends an object to the builder padding on the right to a fixed length.
     * The <code>String.valueOf</code> of the <code>int</code> value is used.
     * If the object is larger than the length, the right hand side is lost.
     * 
     * @param value  the value to append
     * @param width  the fixed field width, zero or negative has no effect
     * @param padChar  the pad character to use
     * @return this, to enable chaining
     */
    public StrBuilder appendFixedWidthPadRight(final int value, final int width, final char padChar) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15189);
        __CLR4_4_1b9zb9zldni8492.R.inc(15190);return appendFixedWidthPadRight(String.valueOf(value), width, padChar);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Inserts the string representation of an object into this builder.
     * Inserting null will use the stored null text value.
     *
     * @param index  the index to add at, must be valid
     * @param obj  the object to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final Object obj) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15191);
        __CLR4_4_1b9zb9zldni8492.R.inc(15192);if ((((obj == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15193)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15194)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15195);return insert(index, nullText);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15196);return insert(index, obj.toString());
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Inserts the string into this builder.
     * Inserting null will use the stored null text value.
     *
     * @param index  the index to add at, must be valid
     * @param str  the string to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, String str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15197);
        __CLR4_4_1b9zb9zldni8492.R.inc(15198);validateIndex(index);
        __CLR4_4_1b9zb9zldni8492.R.inc(15199);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15200)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15201)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15202);str = nullText;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15203);if ((((str != null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15204)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15205)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15206);final int strLen = str.length();
            __CLR4_4_1b9zb9zldni8492.R.inc(15207);if ((((strLen > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15208)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15209)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15210);final int newSize = size + strLen;
                __CLR4_4_1b9zb9zldni8492.R.inc(15211);ensureCapacity(newSize);
                __CLR4_4_1b9zb9zldni8492.R.inc(15212);System.arraycopy(buffer, index, buffer, index + strLen, size - index);
                __CLR4_4_1b9zb9zldni8492.R.inc(15213);size = newSize;
                __CLR4_4_1b9zb9zldni8492.R.inc(15214);str.getChars(0, strLen, buffer, index);
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15215);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Inserts the character array into this builder.
     * Inserting null will use the stored null text value.
     *
     * @param index  the index to add at, must be valid
     * @param chars  the char array to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final char chars[]) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15216);
        __CLR4_4_1b9zb9zldni8492.R.inc(15217);validateIndex(index);
        __CLR4_4_1b9zb9zldni8492.R.inc(15218);if ((((chars == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15219)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15220)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15221);return insert(index, nullText);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15222);final int len = chars.length;
        __CLR4_4_1b9zb9zldni8492.R.inc(15223);if ((((len > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15224)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15225)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15226);ensureCapacity(size + len);
            __CLR4_4_1b9zb9zldni8492.R.inc(15227);System.arraycopy(buffer, index, buffer, index + len, size - index);
            __CLR4_4_1b9zb9zldni8492.R.inc(15228);System.arraycopy(chars, 0, buffer, index, len);
            __CLR4_4_1b9zb9zldni8492.R.inc(15229);size += len;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15230);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Inserts part of the character array into this builder.
     * Inserting null will use the stored null text value.
     *
     * @param index  the index to add at, must be valid
     * @param chars  the char array to insert
     * @param offset  the offset into the character array to start at, must be valid
     * @param length  the length of the character array part to copy, must be positive
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    public StrBuilder insert(final int index, final char chars[], final int offset, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15231);
        __CLR4_4_1b9zb9zldni8492.R.inc(15232);validateIndex(index);
        __CLR4_4_1b9zb9zldni8492.R.inc(15233);if ((((chars == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15234)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15235)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15236);return insert(index, nullText);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15237);if ((((offset < 0 || offset > chars.length)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15238)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15239)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15240);throw new StringIndexOutOfBoundsException("Invalid offset: " + offset);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15241);if ((((length < 0 || offset + length > chars.length)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15242)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15243)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15244);throw new StringIndexOutOfBoundsException("Invalid length: " + length);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15245);if ((((length > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15246)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15247)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15248);ensureCapacity(size + length);
            __CLR4_4_1b9zb9zldni8492.R.inc(15249);System.arraycopy(buffer, index, buffer, index + length, size - index);
            __CLR4_4_1b9zb9zldni8492.R.inc(15250);System.arraycopy(chars, offset, buffer, index, length);
            __CLR4_4_1b9zb9zldni8492.R.inc(15251);size += length;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15252);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(int index, final boolean value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15253);
        __CLR4_4_1b9zb9zldni8492.R.inc(15254);validateIndex(index);
        __CLR4_4_1b9zb9zldni8492.R.inc(15255);if ((((value)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15256)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15257)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15258);ensureCapacity(size + 4);
            __CLR4_4_1b9zb9zldni8492.R.inc(15259);System.arraycopy(buffer, index, buffer, index + 4, size - index);
            __CLR4_4_1b9zb9zldni8492.R.inc(15260);buffer[index++] = 't';
            __CLR4_4_1b9zb9zldni8492.R.inc(15261);buffer[index++] = 'r';
            __CLR4_4_1b9zb9zldni8492.R.inc(15262);buffer[index++] = 'u';
            __CLR4_4_1b9zb9zldni8492.R.inc(15263);buffer[index] = 'e';
            __CLR4_4_1b9zb9zldni8492.R.inc(15264);size += 4;
        } }else {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15265);ensureCapacity(size + 5);
            __CLR4_4_1b9zb9zldni8492.R.inc(15266);System.arraycopy(buffer, index, buffer, index + 5, size - index);
            __CLR4_4_1b9zb9zldni8492.R.inc(15267);buffer[index++] = 'f';
            __CLR4_4_1b9zb9zldni8492.R.inc(15268);buffer[index++] = 'a';
            __CLR4_4_1b9zb9zldni8492.R.inc(15269);buffer[index++] = 'l';
            __CLR4_4_1b9zb9zldni8492.R.inc(15270);buffer[index++] = 's';
            __CLR4_4_1b9zb9zldni8492.R.inc(15271);buffer[index] = 'e';
            __CLR4_4_1b9zb9zldni8492.R.inc(15272);size += 5;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15273);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final char value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15274);
        __CLR4_4_1b9zb9zldni8492.R.inc(15275);validateIndex(index);
        __CLR4_4_1b9zb9zldni8492.R.inc(15276);ensureCapacity(size + 1);
        __CLR4_4_1b9zb9zldni8492.R.inc(15277);System.arraycopy(buffer, index, buffer, index + 1, size - index);
        __CLR4_4_1b9zb9zldni8492.R.inc(15278);buffer[index] = value;
        __CLR4_4_1b9zb9zldni8492.R.inc(15279);size++;
        __CLR4_4_1b9zb9zldni8492.R.inc(15280);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final int value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15281);
        __CLR4_4_1b9zb9zldni8492.R.inc(15282);return insert(index, String.valueOf(value));
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final long value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15283);
        __CLR4_4_1b9zb9zldni8492.R.inc(15284);return insert(index, String.valueOf(value));
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final float value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15285);
        __CLR4_4_1b9zb9zldni8492.R.inc(15286);return insert(index, String.valueOf(value));
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final double value) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15287);
        __CLR4_4_1b9zb9zldni8492.R.inc(15288);return insert(index, String.valueOf(value));
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Internal method to delete a range without validation.
     *
     * @param startIndex  the start index, must be valid
     * @param endIndex  the end index (exclusive), must be valid
     * @param len  the length, must be valid
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    private void deleteImpl(final int startIndex, final int endIndex, final int len) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15289);
        __CLR4_4_1b9zb9zldni8492.R.inc(15290);System.arraycopy(buffer, endIndex, buffer, startIndex, size - endIndex);
        __CLR4_4_1b9zb9zldni8492.R.inc(15291);size -= len;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Deletes the characters between the two specified indices.
     *
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder delete(final int startIndex, int endIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15292);
        __CLR4_4_1b9zb9zldni8492.R.inc(15293);endIndex = validateRange(startIndex, endIndex);
        __CLR4_4_1b9zb9zldni8492.R.inc(15294);final int len = endIndex - startIndex;
        __CLR4_4_1b9zb9zldni8492.R.inc(15295);if ((((len > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15296)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15297)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15298);deleteImpl(startIndex, endIndex, len);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15299);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Deletes the character wherever it occurs in the builder.
     *
     * @param ch  the character to delete
     * @return this, to enable chaining
     */
    public StrBuilder deleteAll(final char ch) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15300);
        __CLR4_4_1b9zb9zldni8492.R.inc(15301);for (int i = 0; (((i < size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15302)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15303)==0&false)); i++) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15304);if ((((buffer[i] == ch)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15305)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15306)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15307);final int start = i;
                __CLR4_4_1b9zb9zldni8492.R.inc(15308);while ((((++i < size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15309)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15310)==0&false))) {{
                    __CLR4_4_1b9zb9zldni8492.R.inc(15311);if ((((buffer[i] != ch)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15312)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15313)==0&false))) {{
                        __CLR4_4_1b9zb9zldni8492.R.inc(15314);break;
                    }
                }}
                }__CLR4_4_1b9zb9zldni8492.R.inc(15315);final int len = i - start;
                __CLR4_4_1b9zb9zldni8492.R.inc(15316);deleteImpl(start, i, len);
                __CLR4_4_1b9zb9zldni8492.R.inc(15317);i -= len;
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15318);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Deletes the character wherever it occurs in the builder.
     *
     * @param ch  the character to delete
     * @return this, to enable chaining
     */
    public StrBuilder deleteFirst(final char ch) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15319);
        __CLR4_4_1b9zb9zldni8492.R.inc(15320);for (int i = 0; (((i < size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15321)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15322)==0&false)); i++) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15323);if ((((buffer[i] == ch)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15324)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15325)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15326);deleteImpl(i, i + 1, 1);
                __CLR4_4_1b9zb9zldni8492.R.inc(15327);break;
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15328);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Deletes the string wherever it occurs in the builder.
     *
     * @param str  the string to delete, null causes no action
     * @return this, to enable chaining
     */
    public StrBuilder deleteAll(final String str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15329);
        __CLR4_4_1b9zb9zldni8492.R.inc(15330);final int len = ((((str == null )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15331)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15332)==0&false))? 0 : str.length());
        __CLR4_4_1b9zb9zldni8492.R.inc(15333);if ((((len > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15334)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15335)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15336);int index = indexOf(str, 0);
            __CLR4_4_1b9zb9zldni8492.R.inc(15337);while ((((index >= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15338)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15339)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15340);deleteImpl(index, index + len, len);
                __CLR4_4_1b9zb9zldni8492.R.inc(15341);index = indexOf(str, index);
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15342);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Deletes the string wherever it occurs in the builder.
     *
     * @param str  the string to delete, null causes no action
     * @return this, to enable chaining
     */
    public StrBuilder deleteFirst(final String str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15343);
        __CLR4_4_1b9zb9zldni8492.R.inc(15344);final int len = ((((str == null )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15345)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15346)==0&false))? 0 : str.length());
        __CLR4_4_1b9zb9zldni8492.R.inc(15347);if ((((len > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15348)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15349)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15350);final int index = indexOf(str, 0);
            __CLR4_4_1b9zb9zldni8492.R.inc(15351);if ((((index >= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15352)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15353)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15354);deleteImpl(index, index + len, len);
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15355);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Deletes all parts of the builder that the matcher matches.
     * <p>
     * Matchers can be used to perform advanced deletion behaviour.
     * For example you could write a matcher to delete all occurrences
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @return this, to enable chaining
     */
    public StrBuilder deleteAll(final StrMatcher matcher) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15356);
        __CLR4_4_1b9zb9zldni8492.R.inc(15357);return replace(matcher, null, 0, size, -1);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Deletes the first match within the builder using the specified matcher.
     * <p>
     * Matchers can be used to perform advanced deletion behaviour.
     * For example you could write a matcher to delete
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @return this, to enable chaining
     */
    public StrBuilder deleteFirst(final StrMatcher matcher) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15358);
        __CLR4_4_1b9zb9zldni8492.R.inc(15359);return replace(matcher, null, 0, size, 1);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Internal method to delete a range without validation.
     *
     * @param startIndex  the start index, must be valid
     * @param endIndex  the end index (exclusive), must be valid
     * @param removeLen  the length to remove (endIndex - startIndex), must be valid
     * @param insertStr  the string to replace with, null means delete range
     * @param insertLen  the length of the insert string, must be valid
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    private void replaceImpl(final int startIndex, final int endIndex, final int removeLen, final String insertStr, final int insertLen) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15360);
        __CLR4_4_1b9zb9zldni8492.R.inc(15361);final int newSize = size - removeLen + insertLen;
        __CLR4_4_1b9zb9zldni8492.R.inc(15362);if ((((insertLen != removeLen)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15363)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15364)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15365);ensureCapacity(newSize);
            __CLR4_4_1b9zb9zldni8492.R.inc(15366);System.arraycopy(buffer, endIndex, buffer, startIndex + insertLen, size - endIndex);
            __CLR4_4_1b9zb9zldni8492.R.inc(15367);size = newSize;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15368);if ((((insertLen > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15369)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15370)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15371);insertStr.getChars(0, insertLen, buffer, startIndex);
        }
    }}finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Replaces a portion of the string builder with another string.
     * The length of the inserted string does not have to match the removed length.
     *
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @param replaceStr  the string to replace with, null means delete range
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder replace(final int startIndex, int endIndex, final String replaceStr) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15372);
        __CLR4_4_1b9zb9zldni8492.R.inc(15373);endIndex = validateRange(startIndex, endIndex);
        __CLR4_4_1b9zb9zldni8492.R.inc(15374);final int insertLen = ((((replaceStr == null )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15375)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15376)==0&false))? 0 : replaceStr.length());
        __CLR4_4_1b9zb9zldni8492.R.inc(15377);replaceImpl(startIndex, endIndex, endIndex - startIndex, replaceStr, insertLen);
        __CLR4_4_1b9zb9zldni8492.R.inc(15378);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces the search character with the replace character
     * throughout the builder.
     *
     * @param search  the search character
     * @param replace  the replace character
     * @return this, to enable chaining
     */
    public StrBuilder replaceAll(final char search, final char replace) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15379);
        __CLR4_4_1b9zb9zldni8492.R.inc(15380);if ((((search != replace)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15381)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15382)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15383);for (int i = 0; (((i < size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15384)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15385)==0&false)); i++) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15386);if ((((buffer[i] == search)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15387)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15388)==0&false))) {{
                    __CLR4_4_1b9zb9zldni8492.R.inc(15389);buffer[i] = replace;
                }
            }}
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15390);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Replaces the first instance of the search character with the
     * replace character in the builder.
     *
     * @param search  the search character
     * @param replace  the replace character
     * @return this, to enable chaining
     */
    public StrBuilder replaceFirst(final char search, final char replace) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15391);
        __CLR4_4_1b9zb9zldni8492.R.inc(15392);if ((((search != replace)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15393)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15394)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15395);for (int i = 0; (((i < size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15396)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15397)==0&false)); i++) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15398);if ((((buffer[i] == search)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15399)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15400)==0&false))) {{
                    __CLR4_4_1b9zb9zldni8492.R.inc(15401);buffer[i] = replace;
                    __CLR4_4_1b9zb9zldni8492.R.inc(15402);break;
                }
            }}
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15403);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces the search string with the replace string throughout the builder.
     *
     * @param searchStr  the search string, null causes no action to occur
     * @param replaceStr  the replace string, null is equivalent to an empty string
     * @return this, to enable chaining
     */
    public StrBuilder replaceAll(final String searchStr, final String replaceStr) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15404);
        __CLR4_4_1b9zb9zldni8492.R.inc(15405);final int searchLen = ((((searchStr == null )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15406)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15407)==0&false))? 0 : searchStr.length());
        __CLR4_4_1b9zb9zldni8492.R.inc(15408);if ((((searchLen > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15409)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15410)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15411);final int replaceLen = ((((replaceStr == null )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15412)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15413)==0&false))? 0 : replaceStr.length());
            __CLR4_4_1b9zb9zldni8492.R.inc(15414);int index = indexOf(searchStr, 0);
            __CLR4_4_1b9zb9zldni8492.R.inc(15415);while ((((index >= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15416)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15417)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15418);replaceImpl(index, index + searchLen, searchLen, replaceStr, replaceLen);
                __CLR4_4_1b9zb9zldni8492.R.inc(15419);index = indexOf(searchStr, index + replaceLen);
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15420);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Replaces the first instance of the search string with the replace string.
     *
     * @param searchStr  the search string, null causes no action to occur
     * @param replaceStr  the replace string, null is equivalent to an empty string
     * @return this, to enable chaining
     */
    public StrBuilder replaceFirst(final String searchStr, final String replaceStr) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15421);
        __CLR4_4_1b9zb9zldni8492.R.inc(15422);final int searchLen = ((((searchStr == null )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15423)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15424)==0&false))? 0 : searchStr.length());
        __CLR4_4_1b9zb9zldni8492.R.inc(15425);if ((((searchLen > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15426)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15427)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15428);final int index = indexOf(searchStr, 0);
            __CLR4_4_1b9zb9zldni8492.R.inc(15429);if ((((index >= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15430)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15431)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15432);final int replaceLen = ((((replaceStr == null )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15433)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15434)==0&false))? 0 : replaceStr.length());
                __CLR4_4_1b9zb9zldni8492.R.inc(15435);replaceImpl(index, index + searchLen, searchLen, replaceStr, replaceLen);
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15436);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all matches within the builder with the replace string.
     * <p>
     * Matchers can be used to perform advanced replace behaviour.
     * For example you could write a matcher to replace all occurrences
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @param replaceStr  the replace string, null is equivalent to an empty string
     * @return this, to enable chaining
     */
    public StrBuilder replaceAll(final StrMatcher matcher, final String replaceStr) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15437);
        __CLR4_4_1b9zb9zldni8492.R.inc(15438);return replace(matcher, replaceStr, 0, size, -1);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Replaces the first match within the builder with the replace string.
     * <p>
     * Matchers can be used to perform advanced replace behaviour.
     * For example you could write a matcher to replace
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @param replaceStr  the replace string, null is equivalent to an empty string
     * @return this, to enable chaining
     */
    public StrBuilder replaceFirst(final StrMatcher matcher, final String replaceStr) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15439);
        __CLR4_4_1b9zb9zldni8492.R.inc(15440);return replace(matcher, replaceStr, 0, size, 1);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    /**
     * Advanced search and replaces within the builder using a matcher.
     * <p>
     * Matchers can be used to perform advanced behaviour.
     * For example you could write a matcher to delete all occurrences
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @param replaceStr  the string to replace the match with, null is a delete
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @param replaceCount  the number of times to replace, -1 for replace all
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if start index is invalid
     */
    public StrBuilder replace(
            final StrMatcher matcher, final String replaceStr,
            final int startIndex, int endIndex, final int replaceCount) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15441);
        __CLR4_4_1b9zb9zldni8492.R.inc(15442);endIndex = validateRange(startIndex, endIndex);
        __CLR4_4_1b9zb9zldni8492.R.inc(15443);return replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Replaces within the builder using a matcher.
     * <p>
     * Matchers can be used to perform advanced behaviour.
     * For example you could write a matcher to delete all occurrences
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @param replaceStr  the string to replace the match with, null is a delete
     * @param from  the start index, must be valid
     * @param to  the end index (exclusive), must be valid
     * @param replaceCount  the number of times to replace, -1 for replace all
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    private StrBuilder replaceImpl(
            final StrMatcher matcher, final String replaceStr,
            final int from, int to, int replaceCount) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15444);
        __CLR4_4_1b9zb9zldni8492.R.inc(15445);if ((((matcher == null || size == 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15446)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15447)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15448);return this;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15449);final int replaceLen = ((((replaceStr == null )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15450)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15451)==0&false))? 0 : replaceStr.length());
        __CLR4_4_1b9zb9zldni8492.R.inc(15452);final char[] buf = buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15453);for (int i = from; (((i < to && replaceCount != 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15454)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15455)==0&false)); i++) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15456);final int removeLen = matcher.isMatch(buf, i, from, to);
            __CLR4_4_1b9zb9zldni8492.R.inc(15457);if ((((removeLen > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15458)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15459)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15460);replaceImpl(i, i + removeLen, removeLen, replaceStr, replaceLen);
                __CLR4_4_1b9zb9zldni8492.R.inc(15461);to = to - removeLen + replaceLen;
                __CLR4_4_1b9zb9zldni8492.R.inc(15462);i = i + replaceLen - 1;
                __CLR4_4_1b9zb9zldni8492.R.inc(15463);if ((((replaceCount > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15464)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15465)==0&false))) {{
                    __CLR4_4_1b9zb9zldni8492.R.inc(15466);replaceCount--;
                }
            }}
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15467);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Reverses the string builder placing each character in the opposite index.
     * 
     * @return this, to enable chaining
     */
    public StrBuilder reverse() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15468);
        __CLR4_4_1b9zb9zldni8492.R.inc(15469);if ((((size == 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15470)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15471)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15472);return this;
        }
        
        }__CLR4_4_1b9zb9zldni8492.R.inc(15473);final int half = size / 2;
        __CLR4_4_1b9zb9zldni8492.R.inc(15474);final char[] buf = buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15475);for (int leftIdx = 0, rightIdx = size - 1; (((leftIdx < half)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15476)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15477)==0&false)); leftIdx++,rightIdx--) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15478);final char swap = buf[leftIdx];
            __CLR4_4_1b9zb9zldni8492.R.inc(15479);buf[leftIdx] = buf[rightIdx];
            __CLR4_4_1b9zb9zldni8492.R.inc(15480);buf[rightIdx] = swap;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15481);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Trims the builder by removing characters less than or equal to a space
     * from the beginning and end.
     *
     * @return this, to enable chaining
     */
    public StrBuilder trim() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15482);
        __CLR4_4_1b9zb9zldni8492.R.inc(15483);if ((((size == 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15484)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15485)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15486);return this;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15487);int len = size;
        __CLR4_4_1b9zb9zldni8492.R.inc(15488);final char[] buf = buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15489);int pos = 0;
        __CLR4_4_1b9zb9zldni8492.R.inc(15490);while ((((pos < len && buf[pos] <= ' ')&&(__CLR4_4_1b9zb9zldni8492.R.iget(15491)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15492)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15493);pos++;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15494);while ((((pos < len && buf[len - 1] <= ' ')&&(__CLR4_4_1b9zb9zldni8492.R.iget(15495)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15496)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15497);len--;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15498);if ((((len < size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15499)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15500)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15501);delete(len, size);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15502);if ((((pos > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15503)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15504)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15505);delete(0, pos);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15506);return this;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks whether this builder starts with the specified string.
     * <p>
     * Note that this method handles null input quietly, unlike String.
     * 
     * @param str  the string to search for, null returns false
     * @return true if the builder starts with the string
     */
    public boolean startsWith(final String str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15507);
        __CLR4_4_1b9zb9zldni8492.R.inc(15508);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15509)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15510)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15511);return false;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15512);final int len = str.length();
        __CLR4_4_1b9zb9zldni8492.R.inc(15513);if ((((len == 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15514)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15515)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15516);return true;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15517);if ((((len > size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15518)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15519)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15520);return false;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15521);for (int i = 0; (((i < len)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15522)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15523)==0&false)); i++) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15524);if ((((buffer[i] != str.charAt(i))&&(__CLR4_4_1b9zb9zldni8492.R.iget(15525)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15526)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15527);return false;
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15528);return true;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Checks whether this builder ends with the specified string.
     * <p>
     * Note that this method handles null input quietly, unlike String.
     * 
     * @param str  the string to search for, null returns false
     * @return true if the builder ends with the string
     */
    public boolean endsWith(final String str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15529);
        __CLR4_4_1b9zb9zldni8492.R.inc(15530);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15531)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15532)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15533);return false;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15534);final int len = str.length();
        __CLR4_4_1b9zb9zldni8492.R.inc(15535);if ((((len == 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15536)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15537)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15538);return true;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15539);if ((((len > size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15540)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15541)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15542);return false;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15543);int pos = size - len;
        __CLR4_4_1b9zb9zldni8492.R.inc(15544);for (int i = 0; (((i < len)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15545)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15546)==0&false)); i++,pos++) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15547);if ((((buffer[pos] != str.charAt(i))&&(__CLR4_4_1b9zb9zldni8492.R.iget(15548)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15549)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15550);return false;
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15551);return true;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * {@inheritDoc}
     * @since 3.0
     */
    @Override
    public CharSequence subSequence(final int startIndex, final int endIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15552);
      __CLR4_4_1b9zb9zldni8492.R.inc(15553);if ((((startIndex < 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15554)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15555)==0&false))) {{
          __CLR4_4_1b9zb9zldni8492.R.inc(15556);throw new StringIndexOutOfBoundsException(startIndex);
      }
      }__CLR4_4_1b9zb9zldni8492.R.inc(15557);if ((((endIndex > size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15558)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15559)==0&false))) {{
          __CLR4_4_1b9zb9zldni8492.R.inc(15560);throw new StringIndexOutOfBoundsException(endIndex);
      }
      }__CLR4_4_1b9zb9zldni8492.R.inc(15561);if ((((startIndex > endIndex)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15562)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15563)==0&false))) {{
          __CLR4_4_1b9zb9zldni8492.R.inc(15564);throw new StringIndexOutOfBoundsException(endIndex - startIndex);
      }
      }__CLR4_4_1b9zb9zldni8492.R.inc(15565);return substring(startIndex, endIndex);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Extracts a portion of this string builder as a string.
     * 
     * @param start  the start index, inclusive, must be valid
     * @return the new string
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public String substring(final int start) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15566);
        __CLR4_4_1b9zb9zldni8492.R.inc(15567);return substring(start, size);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Extracts a portion of this string builder as a string.
     * <p>
     * Note: This method treats an endIndex greater than the length of the
     * builder as equal to the length of the builder, and continues
     * without error, unlike StringBuffer or String.
     * 
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @return the new string
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public String substring(final int startIndex, int endIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15568);
        __CLR4_4_1b9zb9zldni8492.R.inc(15569);endIndex = validateRange(startIndex, endIndex);
        __CLR4_4_1b9zb9zldni8492.R.inc(15570);return new String(buffer, startIndex, endIndex - startIndex);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Extracts the leftmost characters from the string builder without
     * throwing an exception.
     * <p>
     * This method extracts the left <code>length</code> characters from
     * the builder. If this many characters are not available, the whole
     * builder is returned. Thus the returned string may be shorter than the
     * length requested.
     * 
     * @param length  the number of characters to extract, negative returns empty string
     * @return the new string
     */
    public String leftString(final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15571);
        __CLR4_4_1b9zb9zldni8492.R.inc(15572);if ((((length <= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15573)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15574)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15575);return "";
        } }else {__CLR4_4_1b9zb9zldni8492.R.inc(15576);if ((((length >= size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15577)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15578)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15579);return new String(buffer, 0, size);
        } }else {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15580);return new String(buffer, 0, length);
        }
    }}}finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Extracts the rightmost characters from the string builder without
     * throwing an exception.
     * <p>
     * This method extracts the right <code>length</code> characters from
     * the builder. If this many characters are not available, the whole
     * builder is returned. Thus the returned string may be shorter than the
     * length requested.
     * 
     * @param length  the number of characters to extract, negative returns empty string
     * @return the new string
     */
    public String rightString(final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15581);
        __CLR4_4_1b9zb9zldni8492.R.inc(15582);if ((((length <= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15583)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15584)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15585);return "";
        } }else {__CLR4_4_1b9zb9zldni8492.R.inc(15586);if ((((length >= size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15587)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15588)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15589);return new String(buffer, 0, size);
        } }else {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15590);return new String(buffer, size - length, length);
        }
    }}}finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Extracts some characters from the middle of the string builder without
     * throwing an exception.
     * <p>
     * This method extracts <code>length</code> characters from the builder
     * at the specified index.
     * If the index is negative it is treated as zero.
     * If the index is greater than the builder size, it is treated as the builder size.
     * If the length is negative, the empty string is returned.
     * If insufficient characters are available in the builder, as much as possible is returned.
     * Thus the returned string may be shorter than the length requested.
     * 
     * @param index  the index to start at, negative means zero
     * @param length  the number of characters to extract, negative returns empty string
     * @return the new string
     */
    public String midString(int index, final int length) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15591);
        __CLR4_4_1b9zb9zldni8492.R.inc(15592);if ((((index < 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15593)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15594)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15595);index = 0;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15596);if ((((length <= 0 || index >= size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15597)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15598)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15599);return "";
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15600);if ((((size <= index + length)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15601)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15602)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15603);return new String(buffer, index, size - index);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15604);return new String(buffer, index, length);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks if the string builder contains the specified char.
     *
     * @param ch  the character to find
     * @return true if the builder contains the character
     */
    public boolean contains(final char ch) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15605);
        __CLR4_4_1b9zb9zldni8492.R.inc(15606);final char[] thisBuf = buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15607);for (int i = 0; (((i < this.size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15608)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15609)==0&false)); i++) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15610);if ((((thisBuf[i] == ch)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15611)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15612)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15613);return true;
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15614);return false;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Checks if the string builder contains the specified string.
     *
     * @param str  the string to find
     * @return true if the builder contains the string
     */
    public boolean contains(final String str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15615);
        __CLR4_4_1b9zb9zldni8492.R.inc(15616);return indexOf(str, 0) >= 0;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Checks if the string builder contains a string matched using the
     * specified matcher.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to search for the character
     * 'a' followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @return true if the matcher finds a match in the builder
     */
    public boolean contains(final StrMatcher matcher) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15617);
        __CLR4_4_1b9zb9zldni8492.R.inc(15618);return indexOf(matcher, 0) >= 0;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Searches the string builder to find the first reference to the specified char.
     * 
     * @param ch  the character to find
     * @return the first index of the character, or -1 if not found
     */
    public int indexOf(final char ch) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15619);
        __CLR4_4_1b9zb9zldni8492.R.inc(15620);return indexOf(ch, 0);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Searches the string builder to find the first reference to the specified char.
     * 
     * @param ch  the character to find
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the first index of the character, or -1 if not found
     */
    public int indexOf(final char ch, int startIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15621);
        __CLR4_4_1b9zb9zldni8492.R.inc(15622);startIndex = ((((startIndex < 0 )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15623)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15624)==0&false))? 0 : startIndex);
        __CLR4_4_1b9zb9zldni8492.R.inc(15625);if ((((startIndex >= size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15626)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15627)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15628);return -1;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15629);final char[] thisBuf = buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15630);for (int i = startIndex; (((i < size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15631)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15632)==0&false)); i++) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15633);if ((((thisBuf[i] == ch)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15634)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15635)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15636);return i;
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15637);return -1;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Searches the string builder to find the first reference to the specified string.
     * <p>
     * Note that a null input string will return -1, whereas the JDK throws an exception.
     * 
     * @param str  the string to find, null returns -1
     * @return the first index of the string, or -1 if not found
     */
    public int indexOf(final String str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15638);
        __CLR4_4_1b9zb9zldni8492.R.inc(15639);return indexOf(str, 0);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Searches the string builder to find the first reference to the specified
     * string starting searching from the given index.
     * <p>
     * Note that a null input string will return -1, whereas the JDK throws an exception.
     * 
     * @param str  the string to find, null returns -1
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the first index of the string, or -1 if not found
     */
    public int indexOf(final String str, int startIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15640);
        __CLR4_4_1b9zb9zldni8492.R.inc(15641);startIndex = ((((startIndex < 0 )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15642)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15643)==0&false))? 0 : startIndex);
        __CLR4_4_1b9zb9zldni8492.R.inc(15644);if ((((str == null || startIndex >= size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15645)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15646)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15647);return -1;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15648);final int strLen = str.length();
        __CLR4_4_1b9zb9zldni8492.R.inc(15649);if ((((strLen == 1)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15650)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15651)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15652);return indexOf(str.charAt(0), startIndex);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15653);if ((((strLen == 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15654)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15655)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15656);return startIndex;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15657);if ((((strLen > size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15658)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15659)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15660);return -1;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15661);final char[] thisBuf = buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15662);final int len = size - strLen + 1;
        __CLR4_4_1b9zb9zldni8492.R.inc(15663);outer:
        for (int i = startIndex; (((i < len)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15664)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15665)==0&false)); i++) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15666);for (int j = 0; (((j < strLen)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15667)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15668)==0&false)); j++) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15669);if ((((str.charAt(j) != thisBuf[i + j])&&(__CLR4_4_1b9zb9zldni8492.R.iget(15670)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15671)==0&false))) {{
                    __CLR4_4_1b9zb9zldni8492.R.inc(15672);continue outer;
                }
            }}
            }__CLR4_4_1b9zb9zldni8492.R.inc(15673);return i;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15674);return -1;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Searches the string builder using the matcher to find the first match.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to find the character 'a'
     * followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @return the first index matched, or -1 if not found
     */
    public int indexOf(final StrMatcher matcher) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15675);
        __CLR4_4_1b9zb9zldni8492.R.inc(15676);return indexOf(matcher, 0);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Searches the string builder using the matcher to find the first
     * match searching from the given index.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to find the character 'a'
     * followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the first index matched, or -1 if not found
     */
    public int indexOf(final StrMatcher matcher, int startIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15677);
        __CLR4_4_1b9zb9zldni8492.R.inc(15678);startIndex = ((((startIndex < 0 )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15679)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15680)==0&false))? 0 : startIndex);
        __CLR4_4_1b9zb9zldni8492.R.inc(15681);if ((((matcher == null || startIndex >= size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15682)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15683)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15684);return -1;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15685);final int len = size;
        __CLR4_4_1b9zb9zldni8492.R.inc(15686);final char[] buf = buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15687);for (int i = startIndex; (((i < len)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15688)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15689)==0&false)); i++) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15690);if ((((matcher.isMatch(buf, i, startIndex, len) > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15691)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15692)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15693);return i;
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15694);return -1;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Searches the string builder to find the last reference to the specified char.
     * 
     * @param ch  the character to find
     * @return the last index of the character, or -1 if not found
     */
    public int lastIndexOf(final char ch) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15695);
        __CLR4_4_1b9zb9zldni8492.R.inc(15696);return lastIndexOf(ch, size - 1);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Searches the string builder to find the last reference to the specified char.
     * 
     * @param ch  the character to find
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the last index of the character, or -1 if not found
     */
    public int lastIndexOf(final char ch, int startIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15697);
        __CLR4_4_1b9zb9zldni8492.R.inc(15698);startIndex = ((((startIndex >= size )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15699)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15700)==0&false))? size - 1 : startIndex);
        __CLR4_4_1b9zb9zldni8492.R.inc(15701);if ((((startIndex < 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15702)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15703)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15704);return -1;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15705);for (int i = startIndex; (((i >= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15706)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15707)==0&false)); i--) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15708);if ((((buffer[i] == ch)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15709)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15710)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15711);return i;
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15712);return -1;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Searches the string builder to find the last reference to the specified string.
     * <p>
     * Note that a null input string will return -1, whereas the JDK throws an exception.
     * 
     * @param str  the string to find, null returns -1
     * @return the last index of the string, or -1 if not found
     */
    public int lastIndexOf(final String str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15713);
        __CLR4_4_1b9zb9zldni8492.R.inc(15714);return lastIndexOf(str, size - 1);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Searches the string builder to find the last reference to the specified
     * string starting searching from the given index.
     * <p>
     * Note that a null input string will return -1, whereas the JDK throws an exception.
     * 
     * @param str  the string to find, null returns -1
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the last index of the string, or -1 if not found
     */
    public int lastIndexOf(final String str, int startIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15715);
        __CLR4_4_1b9zb9zldni8492.R.inc(15716);startIndex = ((((startIndex >= size )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15717)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15718)==0&false))? size - 1 : startIndex);
        __CLR4_4_1b9zb9zldni8492.R.inc(15719);if ((((str == null || startIndex < 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15720)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15721)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15722);return -1;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15723);final int strLen = str.length();
        __CLR4_4_1b9zb9zldni8492.R.inc(15724);if ((((strLen > 0 && strLen <= size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15725)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15726)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15727);if ((((strLen == 1)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15728)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15729)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15730);return lastIndexOf(str.charAt(0), startIndex);
            }

            }__CLR4_4_1b9zb9zldni8492.R.inc(15731);outer:
            for (int i = startIndex - strLen + 1; (((i >= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15732)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15733)==0&false)); i--) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15734);for (int j = 0; (((j < strLen)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15735)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15736)==0&false)); j++) {{
                    __CLR4_4_1b9zb9zldni8492.R.inc(15737);if ((((str.charAt(j) != buffer[i + j])&&(__CLR4_4_1b9zb9zldni8492.R.iget(15738)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15739)==0&false))) {{
                        __CLR4_4_1b9zb9zldni8492.R.inc(15740);continue outer;
                    }
                }}
                }__CLR4_4_1b9zb9zldni8492.R.inc(15741);return i;
            }
            
        }} }else {__CLR4_4_1b9zb9zldni8492.R.inc(15742);if ((((strLen == 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15743)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15744)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15745);return startIndex;
        }
        }}__CLR4_4_1b9zb9zldni8492.R.inc(15746);return -1;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Searches the string builder using the matcher to find the last match.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to find the character 'a'
     * followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @return the last index matched, or -1 if not found
     */
    public int lastIndexOf(final StrMatcher matcher) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15747);
        __CLR4_4_1b9zb9zldni8492.R.inc(15748);return lastIndexOf(matcher, size);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Searches the string builder using the matcher to find the last
     * match searching from the given index.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to find the character 'a'
     * followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the last index matched, or -1 if not found
     */
    public int lastIndexOf(final StrMatcher matcher, int startIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15749);
        __CLR4_4_1b9zb9zldni8492.R.inc(15750);startIndex = ((((startIndex >= size )&&(__CLR4_4_1b9zb9zldni8492.R.iget(15751)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15752)==0&false))? size - 1 : startIndex);
        __CLR4_4_1b9zb9zldni8492.R.inc(15753);if ((((matcher == null || startIndex < 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15754)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15755)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15756);return -1;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15757);final char[] buf = buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15758);final int endIndex = startIndex + 1;
        __CLR4_4_1b9zb9zldni8492.R.inc(15759);for (int i = startIndex; (((i >= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15760)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15761)==0&false)); i--) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15762);if ((((matcher.isMatch(buf, i, 0, endIndex) > 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15763)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15764)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15765);return i;
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15766);return -1;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a tokenizer that can tokenize the contents of this builder.
     * <p>
     * This method allows the contents of this builder to be tokenized.
     * The tokenizer will be setup by default to tokenize on space, tab,
     * newline and formfeed (as per StringTokenizer). These values can be
     * changed on the tokenizer class, before retrieving the tokens.
     * <p>
     * The returned tokenizer is linked to this builder. You may intermix
     * calls to the buider and tokenizer within certain limits, however
     * there is no synchronization. Once the tokenizer has been used once,
     * it must be {@link StrTokenizer#reset() reset} to pickup the latest
     * changes in the builder. For example:
     * <pre>
     * StrBuilder b = new StrBuilder();
     * b.append("a b ");
     * StrTokenizer t = b.asTokenizer();
     * String[] tokens1 = t.getTokenArray();  // returns a,b
     * b.append("c d ");
     * String[] tokens2 = t.getTokenArray();  // returns a,b (c and d ignored)
     * t.reset();              // reset causes builder changes to be picked up
     * String[] tokens3 = t.getTokenArray();  // returns a,b,c,d
     * </pre>
     * In addition to simply intermixing appends and tokenization, you can also
     * call the set methods on the tokenizer to alter how it tokenizes. Just
     * remember to call reset when you want to pickup builder changes.
     * <p>
     * Calling {@link StrTokenizer#reset(String)} or {@link StrTokenizer#reset(char[])}
     * with a non-null value will break the link with the builder.
     *
     * @return a tokenizer that is linked to this builder
     */
    public StrTokenizer asTokenizer() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15767);
        __CLR4_4_1b9zb9zldni8492.R.inc(15768);return new StrBuilderTokenizer();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the contents of this builder as a Reader.
     * <p>
     * This method allows the contents of the builder to be read
     * using any standard method that expects a Reader.
     * <p>
     * To use, simply create a <code>StrBuilder</code>, populate it with
     * data, call <code>asReader</code>, and then read away.
     * <p>
     * The internal character array is shared between the builder and the reader.
     * This allows you to append to the builder after creating the reader,
     * and the changes will be picked up.
     * Note however, that no synchronization occurs, so you must perform
     * all operations with the builder and the reader in one thread.
     * <p>
     * The returned reader supports marking, and ignores the flush method.
     *
     * @return a reader that reads from this builder
     */
    public Reader asReader() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15769);
        __CLR4_4_1b9zb9zldni8492.R.inc(15770);return new StrBuilderReader();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this builder as a Writer that can be written to.
     * <p>
     * This method allows you to populate the contents of the builder
     * using any standard method that takes a Writer.
     * <p>
     * To use, simply create a <code>StrBuilder</code>,
     * call <code>asWriter</code>, and populate away. The data is available
     * at any time using the methods of the <code>StrBuilder</code>.
     * <p>
     * The internal character array is shared between the builder and the writer.
     * This allows you to intermix calls that append to the builder and
     * write using the writer and the changes will be occur correctly.
     * Note however, that no synchronization occurs, so you must perform
     * all operations with the builder and the writer in one thread.
     * <p>
     * The returned writer ignores the close and flush methods.
     *
     * @return a writer that populates this builder
     */
    public Writer asWriter() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15771);
        __CLR4_4_1b9zb9zldni8492.R.inc(15772);return new StrBuilderWriter();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
//    /**
//     * Gets a String version of the string builder by calling the internal
//     * constructor of String by reflection.
//     * <p>
//     * WARNING: You must not use the StrBuilder after calling this method
//     * as the buffer is now shared with the String object. To ensure this,
//     * the internal character array is set to null, so you will get
//     * NullPointerExceptions on all method calls.
//     *
//     * @return the builder as a String
//     */
//    public String toSharedString() {
//        try {
//            Constructor con = String.class.getDeclaredConstructor(
//                new Class[] {int.class, int.class, char[].class});
//            con.setAccessible(true);
//            char[] buffer = buf;
//            buf = null;
//            size = -1;
//            nullText = null;
//            return (String) con.newInstance(
//                new Object[] {Integer.valueOf(0), Integer.valueOf(size), buffer});
//            
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            throw new UnsupportedOperationException("StrBuilder.toSharedString is unsupported: " + ex.getMessage());
//        }
//    }

    //-----------------------------------------------------------------------
    /**
     * Checks the contents of this builder against another to see if they
     * contain the same character content ignoring case.
     *
     * @param other  the object to check, null returns false
     * @return true if the builders contain the same characters in the same order
     */
    public boolean equalsIgnoreCase(final StrBuilder other) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15773);
        __CLR4_4_1b9zb9zldni8492.R.inc(15774);if ((((this == other)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15775)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15776)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15777);return true;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15778);if ((((this.size != other.size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15779)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15780)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15781);return false;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15782);final char thisBuf[] = this.buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15783);final char otherBuf[] = other.buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15784);for (int i = size - 1; (((i >= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15785)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15786)==0&false)); i--) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15787);final char c1 = thisBuf[i];
            __CLR4_4_1b9zb9zldni8492.R.inc(15788);final char c2 = otherBuf[i];
            __CLR4_4_1b9zb9zldni8492.R.inc(15789);if ((((c1 != c2 && Character.toUpperCase(c1) != Character.toUpperCase(c2))&&(__CLR4_4_1b9zb9zldni8492.R.iget(15790)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15791)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15792);return false;
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15793);return true;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Checks the contents of this builder against another to see if they
     * contain the same character content.
     *
     * @param other  the object to check, null returns false
     * @return true if the builders contain the same characters in the same order
     */
    public boolean equals(final StrBuilder other) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15794);
        __CLR4_4_1b9zb9zldni8492.R.inc(15795);if ((((this == other)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15796)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15797)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15798);return true;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15799);if ((((this.size != other.size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15800)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15801)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15802);return false;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15803);final char thisBuf[] = this.buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15804);final char otherBuf[] = other.buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15805);for (int i = size - 1; (((i >= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15806)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15807)==0&false)); i--) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15808);if ((((thisBuf[i] != otherBuf[i])&&(__CLR4_4_1b9zb9zldni8492.R.iget(15809)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15810)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15811);return false;
            }
        }}
        }__CLR4_4_1b9zb9zldni8492.R.inc(15812);return true;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Checks the contents of this builder against another to see if they
     * contain the same character content.
     *
     * @param obj  the object to check, null returns false
     * @return true if the builders contain the same characters in the same order
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15813);
        __CLR4_4_1b9zb9zldni8492.R.inc(15814);if ((((obj instanceof StrBuilder)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15815)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15816)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15817);return equals((StrBuilder) obj);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15818);return false;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Gets a suitable hash code for this builder.
     *
     * @return a hash code
     */
    @Override
    public int hashCode() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15819);
        __CLR4_4_1b9zb9zldni8492.R.inc(15820);final char buf[] = buffer;
        __CLR4_4_1b9zb9zldni8492.R.inc(15821);int hash = 0;
        __CLR4_4_1b9zb9zldni8492.R.inc(15822);for (int i = size - 1; (((i >= 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15823)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15824)==0&false)); i--) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15825);hash = 31 * hash + buf[i];
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15826);return hash;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets a String version of the string builder, creating a new instance
     * each time the method is called.
     * <p>
     * Note that unlike StringBuffer, the string version returned is
     * independent of the string builder.
     *
     * @return the builder as a String
     */
    @Override
    public String toString() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15827);
        __CLR4_4_1b9zb9zldni8492.R.inc(15828);return new String(buffer, 0, size);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Gets a StringBuffer version of the string builder, creating a
     * new instance each time the method is called.
     *
     * @return the builder as a StringBuffer
     */
    public StringBuffer toStringBuffer() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15829);
        __CLR4_4_1b9zb9zldni8492.R.inc(15830);return new StringBuffer(size).append(buffer, 0, size);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Gets a StringBuilder version of the string builder, creating a
     * new instance each time the method is called.
     *
     * @return the builder as a StringBuilder
     * @since Apache Commons Lang 3.2
     */
    public StringBuilder toStringBuilder() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15831);
        __CLR4_4_1b9zb9zldni8492.R.inc(15832);return new StringBuilder(size).append(buffer, 0, size);
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Implement the {@link Builder} interface.
     * @return the builder as a String
     * @since Apache Commons Lang 3.2
     * @see #toString()
     */
    @Override
    public String build() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15833);
        __CLR4_4_1b9zb9zldni8492.R.inc(15834);return toString();
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Validates parameters defining a range of the builder.
     * 
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @return the new string
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    protected int validateRange(final int startIndex, int endIndex) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15835);
        __CLR4_4_1b9zb9zldni8492.R.inc(15836);if ((((startIndex < 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15837)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15838)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15839);throw new StringIndexOutOfBoundsException(startIndex);
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15840);if ((((endIndex > size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15841)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15842)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15843);endIndex = size;
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15844);if ((((startIndex > endIndex)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15845)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15846)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15847);throw new StringIndexOutOfBoundsException("end < start");
        }
        }__CLR4_4_1b9zb9zldni8492.R.inc(15848);return endIndex;
    }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    /**
     * Validates parameters defining a single index in the builder.
     * 
     * @param index  the index, must be valid
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    protected void validateIndex(final int index) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15849);
        __CLR4_4_1b9zb9zldni8492.R.inc(15850);if ((((index < 0 || index > size)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15851)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15852)==0&false))) {{
            __CLR4_4_1b9zb9zldni8492.R.inc(15853);throw new StringIndexOutOfBoundsException(index);
        }
    }}finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Inner class to allow StrBuilder to operate as a tokenizer.
     */
    class StrBuilderTokenizer extends StrTokenizer {

        /**
         * Default constructor.
         */
        StrBuilderTokenizer() {
            super();__CLR4_4_1b9zb9zldni8492.R.inc(15855);try{__CLR4_4_1b9zb9zldni8492.R.inc(15854);
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        protected List<String> tokenize(final char[] chars, final int offset, final int count) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15856);
            __CLR4_4_1b9zb9zldni8492.R.inc(15857);if ((((chars == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15858)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15859)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15860);return super.tokenize(StrBuilder.this.buffer, 0, StrBuilder.this.size());
            }
            }__CLR4_4_1b9zb9zldni8492.R.inc(15861);return super.tokenize(chars, offset, count);
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public String getContent() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15862);
            __CLR4_4_1b9zb9zldni8492.R.inc(15863);final String str = super.getContent();
            __CLR4_4_1b9zb9zldni8492.R.inc(15864);if ((((str == null)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15865)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15866)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15867);return StrBuilder.this.toString();
            }
            }__CLR4_4_1b9zb9zldni8492.R.inc(15868);return str;
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Inner class to allow StrBuilder to operate as a writer.
     */
    class StrBuilderReader extends Reader {
        /** The current stream position. */
        private int pos;
        /** The last mark position. */
        private int mark;

        /**
         * Default constructor.
         */
        StrBuilderReader() {
            super();__CLR4_4_1b9zb9zldni8492.R.inc(15870);try{__CLR4_4_1b9zb9zldni8492.R.inc(15869);
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void close() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15871);
            // do nothing
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int read() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15872);
            __CLR4_4_1b9zb9zldni8492.R.inc(15873);if ((((ready() == false)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15874)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15875)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15876);return -1;
            }
            }__CLR4_4_1b9zb9zldni8492.R.inc(15877);return StrBuilder.this.charAt(pos++);
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int read(final char b[], final int off, int len) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15878);
            __CLR4_4_1b9zb9zldni8492.R.inc(15879);if ((((off < 0 || len < 0 || off > b.length ||
                    (off + len) > b.length || (off + len) < 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15880)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15881)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15882);throw new IndexOutOfBoundsException();
            }
            }__CLR4_4_1b9zb9zldni8492.R.inc(15883);if ((((len == 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15884)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15885)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15886);return 0;
            }
            }__CLR4_4_1b9zb9zldni8492.R.inc(15887);if ((((pos >= StrBuilder.this.size())&&(__CLR4_4_1b9zb9zldni8492.R.iget(15888)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15889)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15890);return -1;
            }
            }__CLR4_4_1b9zb9zldni8492.R.inc(15891);if ((((pos + len > size())&&(__CLR4_4_1b9zb9zldni8492.R.iget(15892)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15893)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15894);len = StrBuilder.this.size() - pos;
            }
            }__CLR4_4_1b9zb9zldni8492.R.inc(15895);StrBuilder.this.getChars(pos, pos + len, b, off);
            __CLR4_4_1b9zb9zldni8492.R.inc(15896);pos += len;
            __CLR4_4_1b9zb9zldni8492.R.inc(15897);return len;
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public long skip(long n) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15898);
            __CLR4_4_1b9zb9zldni8492.R.inc(15899);if ((((pos + n > StrBuilder.this.size())&&(__CLR4_4_1b9zb9zldni8492.R.iget(15900)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15901)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15902);n = StrBuilder.this.size() - pos;
            }
            }__CLR4_4_1b9zb9zldni8492.R.inc(15903);if ((((n < 0)&&(__CLR4_4_1b9zb9zldni8492.R.iget(15904)!=0|true))||(__CLR4_4_1b9zb9zldni8492.R.iget(15905)==0&false))) {{
                __CLR4_4_1b9zb9zldni8492.R.inc(15906);return 0;
            }
            }__CLR4_4_1b9zb9zldni8492.R.inc(15907);pos += n;
            __CLR4_4_1b9zb9zldni8492.R.inc(15908);return n;
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public boolean ready() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15909);
            __CLR4_4_1b9zb9zldni8492.R.inc(15910);return pos < StrBuilder.this.size();
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public boolean markSupported() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15911);
            __CLR4_4_1b9zb9zldni8492.R.inc(15912);return true;
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void mark(final int readAheadLimit) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15913);
            __CLR4_4_1b9zb9zldni8492.R.inc(15914);mark = pos;
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void reset() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15915);
            __CLR4_4_1b9zb9zldni8492.R.inc(15916);pos = mark;
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Inner class to allow StrBuilder to operate as a writer.
     */
    class StrBuilderWriter extends Writer {

        /**
         * Default constructor.
         */
        StrBuilderWriter() {
            super();__CLR4_4_1b9zb9zldni8492.R.inc(15918);try{__CLR4_4_1b9zb9zldni8492.R.inc(15917);
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void close() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15919);
            // do nothing
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void flush() {try{__CLR4_4_1b9zb9zldni8492.R.inc(15920);
            // do nothing
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final int c) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15921);
            __CLR4_4_1b9zb9zldni8492.R.inc(15922);StrBuilder.this.append((char) c);
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final char[] cbuf) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15923);
            __CLR4_4_1b9zb9zldni8492.R.inc(15924);StrBuilder.this.append(cbuf);
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final char[] cbuf, final int off, final int len) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15925);
            __CLR4_4_1b9zb9zldni8492.R.inc(15926);StrBuilder.this.append(cbuf, off, len);
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final String str) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15927);
            __CLR4_4_1b9zb9zldni8492.R.inc(15928);StrBuilder.this.append(str);
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final String str, final int off, final int len) {try{__CLR4_4_1b9zb9zldni8492.R.inc(15929);
            __CLR4_4_1b9zb9zldni8492.R.inc(15930);StrBuilder.this.append(str, off, len);
        }finally{__CLR4_4_1b9zb9zldni8492.R.flushNeeded();}}
    }

}
