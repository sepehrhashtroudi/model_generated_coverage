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

import java.io.Serializable;

/**
 * A mutable <code>Object</code> wrapper.
 * 
 * @param <T> the type to set and get 
 * @since 2.1
 * @version $Id$
 */
public class MutableObject<T> implements Mutable<T>, Serializable {public static class __CLR4_4_1a5ca5cldni842v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,13184,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 86241875189L;

    /** The mutable value. */
    private T value;

    /**
     * Constructs a new MutableObject with the default value of <code>null</code>.
     */
    public MutableObject() {
        super();__CLR4_4_1a5ca5cldni842v.R.inc(13153);try{__CLR4_4_1a5ca5cldni842v.R.inc(13152);
    }finally{__CLR4_4_1a5ca5cldni842v.R.flushNeeded();}}

    /**
     * Constructs a new MutableObject with the specified value.
     * 
     * @param value  the initial value to store
     */
    public MutableObject(final T value) {
        super();__CLR4_4_1a5ca5cldni842v.R.inc(13155);try{__CLR4_4_1a5ca5cldni842v.R.inc(13154);
        __CLR4_4_1a5ca5cldni842v.R.inc(13156);this.value = value;
    }finally{__CLR4_4_1a5ca5cldni842v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value.
     * 
     * @return the value, may be null
     */
    @Override
    public T getValue() {try{__CLR4_4_1a5ca5cldni842v.R.inc(13157);
        __CLR4_4_1a5ca5cldni842v.R.inc(13158);return this.value;
    }finally{__CLR4_4_1a5ca5cldni842v.R.flushNeeded();}}

    /**
     * Sets the value.
     * 
     * @param value  the value to set
     */
    @Override
    public void setValue(final T value) {try{__CLR4_4_1a5ca5cldni842v.R.inc(13159);
        __CLR4_4_1a5ca5cldni842v.R.inc(13160);this.value = value;
    }finally{__CLR4_4_1a5ca5cldni842v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>
     * Compares this object against the specified object. The result is <code>true</code> if and only if the argument
     * is not <code>null</code> and is a <code>MutableObject</code> object that contains the same <code>T</code>
     * value as this object.
     * </p>
     * 
     * @param obj  the object to compare with, <code>null</code> returns <code>false</code>
     * @return  <code>true</code> if the objects are the same;
     *          <code>true</code> if the objects have equivalent <code>value</code> fields;
     *          <code>false</code> otherwise.
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_1a5ca5cldni842v.R.inc(13161);
        __CLR4_4_1a5ca5cldni842v.R.inc(13162);if ((((obj == null)&&(__CLR4_4_1a5ca5cldni842v.R.iget(13163)!=0|true))||(__CLR4_4_1a5ca5cldni842v.R.iget(13164)==0&false))) {{
            __CLR4_4_1a5ca5cldni842v.R.inc(13165);return false;
        }
        }__CLR4_4_1a5ca5cldni842v.R.inc(13166);if ((((this == obj)&&(__CLR4_4_1a5ca5cldni842v.R.iget(13167)!=0|true))||(__CLR4_4_1a5ca5cldni842v.R.iget(13168)==0&false))) {{
            __CLR4_4_1a5ca5cldni842v.R.inc(13169);return true;
        }
        }__CLR4_4_1a5ca5cldni842v.R.inc(13170);if ((((this.getClass() == obj.getClass())&&(__CLR4_4_1a5ca5cldni842v.R.iget(13171)!=0|true))||(__CLR4_4_1a5ca5cldni842v.R.iget(13172)==0&false))) {{
            __CLR4_4_1a5ca5cldni842v.R.inc(13173);final MutableObject<?> that = (MutableObject<?>) obj;
            __CLR4_4_1a5ca5cldni842v.R.inc(13174);return this.value.equals(that.value);
        } }else {{
            __CLR4_4_1a5ca5cldni842v.R.inc(13175);return false;
        }
    }}finally{__CLR4_4_1a5ca5cldni842v.R.flushNeeded();}}

    /**
     * Returns the value's hash code or <code>0</code> if the value is <code>null</code>.
     * 
     * @return the value's hash code or <code>0</code> if the value is <code>null</code>.
     */
    @Override
    public int hashCode() {try{__CLR4_4_1a5ca5cldni842v.R.inc(13176);
        __CLR4_4_1a5ca5cldni842v.R.inc(13177);return (((value == null )&&(__CLR4_4_1a5ca5cldni842v.R.iget(13178)!=0|true))||(__CLR4_4_1a5ca5cldni842v.R.iget(13179)==0&false))? 0 : value.hashCode();
    }finally{__CLR4_4_1a5ca5cldni842v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    @Override
    public String toString() {try{__CLR4_4_1a5ca5cldni842v.R.inc(13180);
        __CLR4_4_1a5ca5cldni842v.R.inc(13181);return (((value == null )&&(__CLR4_4_1a5ca5cldni842v.R.iget(13182)!=0|true))||(__CLR4_4_1a5ca5cldni842v.R.iget(13183)==0&false))? "null" : value.toString();
    }finally{__CLR4_4_1a5ca5cldni842v.R.flushNeeded();}}

}
