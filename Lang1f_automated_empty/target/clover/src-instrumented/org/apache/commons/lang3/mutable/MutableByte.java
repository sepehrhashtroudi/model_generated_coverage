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
 * A mutable <code>byte</code> wrapper.
 * <p>
 * Note that as MutableByte does not extend Byte, it is not treated by String.format as a Byte parameter. 
 * 
 * @see Byte
 * @since 2.1
 * @version $Id$
 */
public class MutableByte extends Number implements Comparable<MutableByte>, Mutable<Number> {public static class __CLR4_4_19xp9xpldnigg46{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,12935,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = -1585823265L;

    /** The mutable value. */
    private byte value;

    /**
     * Constructs a new MutableByte with the default value of zero.
     */
    public MutableByte() {
        super();__CLR4_4_19xp9xpldnigg46.R.inc(12878);try{__CLR4_4_19xp9xpldnigg46.R.inc(12877);
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Constructs a new MutableByte with the specified value.
     * 
     * @param value  the initial value to store
     */
    public MutableByte(final byte value) {
        super();__CLR4_4_19xp9xpldnigg46.R.inc(12880);try{__CLR4_4_19xp9xpldnigg46.R.inc(12879);
        __CLR4_4_19xp9xpldnigg46.R.inc(12881);this.value = value;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Constructs a new MutableByte with the specified value.
     * 
     * @param value  the initial value to store, not null
     * @throws NullPointerException if the object is null
     */
    public MutableByte(final Number value) {
        super();__CLR4_4_19xp9xpldnigg46.R.inc(12883);try{__CLR4_4_19xp9xpldnigg46.R.inc(12882);
        __CLR4_4_19xp9xpldnigg46.R.inc(12884);this.value = value.byteValue();
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Constructs a new MutableByte parsing the given string.
     * 
     * @param value  the string to parse, not null
     * @throws NumberFormatException if the string cannot be parsed into a byte
     * @since 2.5
     */
    public MutableByte(final String value) throws NumberFormatException {
        super();__CLR4_4_19xp9xpldnigg46.R.inc(12886);try{__CLR4_4_19xp9xpldnigg46.R.inc(12885);
        __CLR4_4_19xp9xpldnigg46.R.inc(12887);this.value = Byte.parseByte(value);
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a Byte instance.
     * 
     * @return the value as a Byte, never null
     */
    @Override
    public Byte getValue() {try{__CLR4_4_19xp9xpldnigg46.R.inc(12888);
        __CLR4_4_19xp9xpldnigg46.R.inc(12889);return Byte.valueOf(this.value);
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Sets the value.
     * 
     * @param value  the value to set
     */
    public void setValue(final byte value) {try{__CLR4_4_19xp9xpldnigg46.R.inc(12890);
        __CLR4_4_19xp9xpldnigg46.R.inc(12891);this.value = value;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Sets the value from any Number instance.
     * 
     * @param value  the value to set, not null
     * @throws NullPointerException if the object is null
     */
    @Override
    public void setValue(final Number value) {try{__CLR4_4_19xp9xpldnigg46.R.inc(12892);
        __CLR4_4_19xp9xpldnigg46.R.inc(12893);this.value = value.byteValue();
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Increments the value.
     *
     * @since Commons Lang 2.2
     */
    public void increment() {try{__CLR4_4_19xp9xpldnigg46.R.inc(12894);
        __CLR4_4_19xp9xpldnigg46.R.inc(12895);value++;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Decrements the value.
     *
     * @since Commons Lang 2.2
     */
    public void decrement() {try{__CLR4_4_19xp9xpldnigg46.R.inc(12896);
        __CLR4_4_19xp9xpldnigg46.R.inc(12897);value--;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @since Commons Lang 2.2
     */
    public void add(final byte operand) {try{__CLR4_4_19xp9xpldnigg46.R.inc(12898);
        __CLR4_4_19xp9xpldnigg46.R.inc(12899);this.value += operand;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void add(final Number operand) {try{__CLR4_4_19xp9xpldnigg46.R.inc(12900);
        __CLR4_4_19xp9xpldnigg46.R.inc(12901);this.value += operand.byteValue();
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @since Commons Lang 2.2
     */
    public void subtract(final byte operand) {try{__CLR4_4_19xp9xpldnigg46.R.inc(12902);
        __CLR4_4_19xp9xpldnigg46.R.inc(12903);this.value -= operand;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void subtract(final Number operand) {try{__CLR4_4_19xp9xpldnigg46.R.inc(12904);
        __CLR4_4_19xp9xpldnigg46.R.inc(12905);this.value -= operand.byteValue();
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // shortValue relies on Number implementation
    /**
     * Returns the value of this MutableByte as a byte.
     *
     * @return the numeric value represented by this object after conversion to type byte.
     */
    @Override
    public byte byteValue() {try{__CLR4_4_19xp9xpldnigg46.R.inc(12906);
        __CLR4_4_19xp9xpldnigg46.R.inc(12907);return value;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Returns the value of this MutableByte as an int.
     *
     * @return the numeric value represented by this object after conversion to type int.
     */
    @Override
    public int intValue() {try{__CLR4_4_19xp9xpldnigg46.R.inc(12908);
        __CLR4_4_19xp9xpldnigg46.R.inc(12909);return value;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Returns the value of this MutableByte as a long.
     *
     * @return the numeric value represented by this object after conversion to type long.
     */
    @Override
    public long longValue() {try{__CLR4_4_19xp9xpldnigg46.R.inc(12910);
        __CLR4_4_19xp9xpldnigg46.R.inc(12911);return value;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Returns the value of this MutableByte as a float.
     *
     * @return the numeric value represented by this object after conversion to type float.
     */
    @Override
    public float floatValue() {try{__CLR4_4_19xp9xpldnigg46.R.inc(12912);
        __CLR4_4_19xp9xpldnigg46.R.inc(12913);return value;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Returns the value of this MutableByte as a double.
     *
     * @return the numeric value represented by this object after conversion to type double.
     */
    @Override
    public double doubleValue() {try{__CLR4_4_19xp9xpldnigg46.R.inc(12914);
        __CLR4_4_19xp9xpldnigg46.R.inc(12915);return value;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this mutable as an instance of Byte.
     *
     * @return a Byte instance containing the value from this mutable
     */
    public Byte toByte() {try{__CLR4_4_19xp9xpldnigg46.R.inc(12916);
        __CLR4_4_19xp9xpldnigg46.R.inc(12917);return Byte.valueOf(byteValue());
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object to the specified object. The result is <code>true</code> if and only if the argument is
     * not <code>null</code> and is a <code>MutableByte</code> object that contains the same <code>byte</code> value
     * as this object.
     * 
     * @param obj  the object to compare with, null returns false
     * @return <code>true</code> if the objects are the same; <code>false</code> otherwise.
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_19xp9xpldnigg46.R.inc(12918);
        __CLR4_4_19xp9xpldnigg46.R.inc(12919);if ((((obj instanceof MutableByte)&&(__CLR4_4_19xp9xpldnigg46.R.iget(12920)!=0|true))||(__CLR4_4_19xp9xpldnigg46.R.iget(12921)==0&false))) {{
            __CLR4_4_19xp9xpldnigg46.R.inc(12922);return value == ((MutableByte) obj).byteValue();
        }
        }__CLR4_4_19xp9xpldnigg46.R.inc(12923);return false;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    /**
     * Returns a suitable hash code for this mutable.
     * 
     * @return a suitable hash code
     */
    @Override
    public int hashCode() {try{__CLR4_4_19xp9xpldnigg46.R.inc(12924);
        __CLR4_4_19xp9xpldnigg46.R.inc(12925);return value;
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this mutable to another in ascending order.
     * 
     * @param other  the other mutable to compare to, not null
     * @return negative if this is less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(final MutableByte other) {try{__CLR4_4_19xp9xpldnigg46.R.inc(12926);
        __CLR4_4_19xp9xpldnigg46.R.inc(12927);final byte anotherVal = other.value;
        __CLR4_4_19xp9xpldnigg46.R.inc(12928);return (((value < anotherVal )&&(__CLR4_4_19xp9xpldnigg46.R.iget(12929)!=0|true))||(__CLR4_4_19xp9xpldnigg46.R.iget(12930)==0&false))? -1 : ((((value == anotherVal )&&(__CLR4_4_19xp9xpldnigg46.R.iget(12931)!=0|true))||(__CLR4_4_19xp9xpldnigg46.R.iget(12932)==0&false))? 0 : 1);
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    @Override
    public String toString() {try{__CLR4_4_19xp9xpldnigg46.R.inc(12933);
        __CLR4_4_19xp9xpldnigg46.R.inc(12934);return String.valueOf(value);
    }finally{__CLR4_4_19xp9xpldnigg46.R.flushNeeded();}}

}
