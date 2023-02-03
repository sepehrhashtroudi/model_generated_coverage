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
package org.apache.commons.lang3.mutable;

/**
 * A mutable <code>long</code> wrapper.
 * <p>
 * Note that as MutableLong does not extend Long, it is not treated by String.format as a Long parameter. 
 * 
 * @see Long
 * @since 2.1
 * @version $Id$
 */
public class MutableLong extends Number implements Comparable<MutableLong>, Mutable<Number> {public static class __CLR4_4_1a3sa3sldnigg52{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,13152,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 62986528375L;

    /** The mutable value. */
    private long value;

    /**
     * Constructs a new MutableLong with the default value of zero.
     */
    public MutableLong() {
        super();__CLR4_4_1a3sa3sldnigg52.R.inc(13097);try{__CLR4_4_1a3sa3sldnigg52.R.inc(13096);
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Constructs a new MutableLong with the specified value.
     * 
     * @param value  the initial value to store
     */
    public MutableLong(final long value) {
        super();__CLR4_4_1a3sa3sldnigg52.R.inc(13099);try{__CLR4_4_1a3sa3sldnigg52.R.inc(13098);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13100);this.value = value;
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Constructs a new MutableLong with the specified value.
     * 
     * @param value  the initial value to store, not null
     * @throws NullPointerException if the object is null
     */
    public MutableLong(final Number value) {
        super();__CLR4_4_1a3sa3sldnigg52.R.inc(13102);try{__CLR4_4_1a3sa3sldnigg52.R.inc(13101);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13103);this.value = value.longValue();
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Constructs a new MutableLong parsing the given string.
     * 
     * @param value  the string to parse, not null
     * @throws NumberFormatException if the string cannot be parsed into a long
     * @since 2.5
     */
    public MutableLong(final String value) throws NumberFormatException {
        super();__CLR4_4_1a3sa3sldnigg52.R.inc(13105);try{__CLR4_4_1a3sa3sldnigg52.R.inc(13104);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13106);this.value = Long.parseLong(value);
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a Long instance.
     * 
     * @return the value as a Long, never null
     */
    @Override
    public Long getValue() {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13107);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13108);return Long.valueOf(this.value);
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Sets the value.
     * 
     * @param value  the value to set
     */
    public void setValue(final long value) {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13109);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13110);this.value = value;
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Sets the value from any Number instance.
     * 
     * @param value  the value to set, not null
     * @throws NullPointerException if the object is null
     */
    @Override
    public void setValue(final Number value) {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13111);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13112);this.value = value.longValue();
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Increments the value.
     *
     * @since Commons Lang 2.2
     */
    public void increment() {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13113);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13114);value++;
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Decrements the value.
     *
     * @since Commons Lang 2.2
     */
    public void decrement() {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13115);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13116);value--;
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @since Commons Lang 2.2
     */
    public void add(final long operand) {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13117);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13118);this.value += operand;
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void add(final Number operand) {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13119);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13120);this.value += operand.longValue();
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @since Commons Lang 2.2
     */
    public void subtract(final long operand) {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13121);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13122);this.value -= operand;
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void subtract(final Number operand) {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13123);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13124);this.value -= operand.longValue();
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // shortValue and byteValue rely on Number implementation
    /**
     * Returns the value of this MutableLong as an int.
     *
     * @return the numeric value represented by this object after conversion to type int.
     */
    @Override
    public int intValue() {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13125);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13126);return (int) value;
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Returns the value of this MutableLong as a long.
     *
     * @return the numeric value represented by this object after conversion to type long.
     */
    @Override
    public long longValue() {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13127);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13128);return value;
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Returns the value of this MutableLong as a float.
     *
     * @return the numeric value represented by this object after conversion to type float.
     */
    @Override
    public float floatValue() {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13129);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13130);return value;
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Returns the value of this MutableLong as a double.
     *
     * @return the numeric value represented by this object after conversion to type double.
     */
    @Override
    public double doubleValue() {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13131);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13132);return value;
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this mutable as an instance of Long.
     *
     * @return a Long instance containing the value from this mutable, never null
     */
    public Long toLong() {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13133);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13134);return Long.valueOf(longValue());
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object to the specified object. The result is <code>true</code> if and only if the argument
     * is not <code>null</code> and is a <code>MutableLong</code> object that contains the same <code>long</code>
     * value as this object.
     * 
     * @param obj  the object to compare with, null returns false
     * @return <code>true</code> if the objects are the same; <code>false</code> otherwise.
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13135);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13136);if ((((obj instanceof MutableLong)&&(__CLR4_4_1a3sa3sldnigg52.R.iget(13137)!=0|true))||(__CLR4_4_1a3sa3sldnigg52.R.iget(13138)==0&false))) {{
            __CLR4_4_1a3sa3sldnigg52.R.inc(13139);return value == ((MutableLong) obj).longValue();
        }
        }__CLR4_4_1a3sa3sldnigg52.R.inc(13140);return false;
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    /**
     * Returns a suitable hash code for this mutable.
     * 
     * @return a suitable hash code
     */
    @Override
    public int hashCode() {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13141);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13142);return (int) (value ^ (value >>> 32));
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this mutable to another in ascending order.
     * 
     * @param other  the other mutable to compare to, not null
     * @return negative if this is less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(final MutableLong other) {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13143);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13144);final long anotherVal = other.value;
        __CLR4_4_1a3sa3sldnigg52.R.inc(13145);return (((value < anotherVal )&&(__CLR4_4_1a3sa3sldnigg52.R.iget(13146)!=0|true))||(__CLR4_4_1a3sa3sldnigg52.R.iget(13147)==0&false))? -1 : ((((value == anotherVal )&&(__CLR4_4_1a3sa3sldnigg52.R.iget(13148)!=0|true))||(__CLR4_4_1a3sa3sldnigg52.R.iget(13149)==0&false))? 0 : 1);
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    @Override
    public String toString() {try{__CLR4_4_1a3sa3sldnigg52.R.inc(13150);
        __CLR4_4_1a3sa3sldnigg52.R.inc(13151);return String.valueOf(value);
    }finally{__CLR4_4_1a3sa3sldnigg52.R.flushNeeded();}}

}
