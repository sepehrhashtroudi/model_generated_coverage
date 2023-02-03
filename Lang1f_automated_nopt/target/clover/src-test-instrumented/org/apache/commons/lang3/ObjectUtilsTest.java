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
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.exception.CloneFailedException;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.commons.lang3.text.StrBuilder;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ObjectUtils}.
 *
 * @version $Id$
 */
public class ObjectUtilsTest {static class __CLR4_4_1f8vf8vldni84sl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,19779,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String FOO = "foo";
    private static final String BAR = "bar";

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

//    /**
//     * Show that java.util.Date and java.sql.Timestamp are apples and oranges.
//     * Prompted by an email discussion. 
//     * 
//     * The behavior is different b/w Sun Java 1.3.1_10 and 1.4.2_03.
//     */
//    public void testDateEqualsJava() {
//        long now = 1076957313284L; // Feb 16, 2004 10:49... PST
//        java.util.Date date = new java.util.Date(now);
//        java.sql.Timestamp realTimestamp = new java.sql.Timestamp(now);
//        java.util.Date timestamp = realTimestamp;
//        // sanity check 1:
//        assertEquals(284000000, realTimestamp.getNanos());
//        assertEquals(1076957313284L, date.getTime());
//        //
//        // On Sun 1.3.1_10:
//        //junit.framework.AssertionFailedError: expected:<1076957313284> but was:<1076957313000>
//        //
//        //assertEquals(1076957313284L, timestamp.getTime());
//        //
//        //junit.framework.AssertionFailedError: expected:<1076957313284> but was:<1076957313000>
//        //
//        //assertEquals(1076957313284L, realTimestamp.getTime());
//        // sanity check 2:        
//        assertEquals(date.getDay(), realTimestamp.getDay());
//        assertEquals(date.getHours(), realTimestamp.getHours());
//        assertEquals(date.getMinutes(), realTimestamp.getMinutes());
//        assertEquals(date.getMonth(), realTimestamp.getMonth());
//        assertEquals(date.getSeconds(), realTimestamp.getSeconds());
//        assertEquals(date.getTimezoneOffset(), realTimestamp.getTimezoneOffset());
//        assertEquals(date.getYear(), realTimestamp.getYear());
//        //
//        // Time values are == and equals() on Sun 1.4.2_03 but NOT on Sun 1.3.1_10:
//        //
//        //assertFalse("Sanity check failed: date.getTime() == timestamp.getTime()", date.getTime() == timestamp.getTime());
//        //assertFalse("Sanity check failed: timestamp.equals(date)", timestamp.equals(date));
//        //assertFalse("Sanity check failed: date.equals(timestamp)", date.equals(timestamp));
//        // real test:
//        //assertFalse("java.util.Date and java.sql.Timestamp should be equal", ObjectUtils.equals(date, timestamp));
//    }
    
    
    
    
    
    
    
    

    
            
    

    

    

    

    /**
     * Tests {@link ObjectUtils#compare(Comparable, Comparable, boolean)}.
     */
    

    

    

    

    

    

    

    

    

    /**
     * Tests {@link ObjectUtils#clone(Object)} with a cloneable object.
     */
    

    /**
     * Tests {@link ObjectUtils#clone(Object)} with a not cloneable object.
     */
    

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an uncloneable object.
     */
    

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an object array.
     */
    

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an array of primitives.
     */
    

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with a cloneable object.
     */
    

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with a not cloneable object.
     */
    

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with an uncloneable object.
     */
    

    

    /**
     * String that is cloneable.
     */
    static final class CloneableString extends MutableObject<String> implements Cloneable {
        private static final long serialVersionUID = 1L;
        CloneableString(final String s) {
            super(s);__CLR4_4_1f8vf8vldni84sl.R.inc(19760);try{__CLR4_4_1f8vf8vldni84sl.R.inc(19759);
        }finally{__CLR4_4_1f8vf8vldni84sl.R.flushNeeded();}}

        @Override
        public CloneableString clone() throws CloneNotSupportedException {try{__CLR4_4_1f8vf8vldni84sl.R.inc(19761);
            __CLR4_4_1f8vf8vldni84sl.R.inc(19762);return (CloneableString)super.clone();
        }finally{__CLR4_4_1f8vf8vldni84sl.R.flushNeeded();}}
    }

    /**
     * String that is not cloneable.
     */
    static final class UncloneableString extends MutableObject<String> implements Cloneable {
        private static final long serialVersionUID = 1L;
        UncloneableString(final String s) {
            super(s);__CLR4_4_1f8vf8vldni84sl.R.inc(19764);try{__CLR4_4_1f8vf8vldni84sl.R.inc(19763);
        }finally{__CLR4_4_1f8vf8vldni84sl.R.flushNeeded();}}
    }

    static final class NonComparableCharSequence implements CharSequence {
        final String value;

        /**
         * Create a new NonComparableCharSequence instance.
         *
         * @param value
         */
        public NonComparableCharSequence(final String value) {
            super();__CLR4_4_1f8vf8vldni84sl.R.inc(19766);try{__CLR4_4_1f8vf8vldni84sl.R.inc(19765);
            __CLR4_4_1f8vf8vldni84sl.R.inc(19767);Validate.notNull(value);
            __CLR4_4_1f8vf8vldni84sl.R.inc(19768);this.value = value;
        }finally{__CLR4_4_1f8vf8vldni84sl.R.flushNeeded();}}

        @Override
        public char charAt(final int arg0) {try{__CLR4_4_1f8vf8vldni84sl.R.inc(19769);
            __CLR4_4_1f8vf8vldni84sl.R.inc(19770);return value.charAt(arg0);
        }finally{__CLR4_4_1f8vf8vldni84sl.R.flushNeeded();}}

        @Override
        public int length() {try{__CLR4_4_1f8vf8vldni84sl.R.inc(19771);
            __CLR4_4_1f8vf8vldni84sl.R.inc(19772);return value.length();
        }finally{__CLR4_4_1f8vf8vldni84sl.R.flushNeeded();}}

        @Override
        public CharSequence subSequence(final int arg0, final int arg1) {try{__CLR4_4_1f8vf8vldni84sl.R.inc(19773);
            __CLR4_4_1f8vf8vldni84sl.R.inc(19774);return value.subSequence(arg0, arg1);
        }finally{__CLR4_4_1f8vf8vldni84sl.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_1f8vf8vldni84sl.R.inc(19775);
            __CLR4_4_1f8vf8vldni84sl.R.inc(19776);return value;
        }finally{__CLR4_4_1f8vf8vldni84sl.R.flushNeeded();}}
    }

    static final class CharSequenceComparator implements Comparator<CharSequence> {

        @Override
        public int compare(final CharSequence o1, final CharSequence o2) {try{__CLR4_4_1f8vf8vldni84sl.R.inc(19777);
            __CLR4_4_1f8vf8vldni84sl.R.inc(19778);return o1.toString().compareTo(o2.toString());
        }finally{__CLR4_4_1f8vf8vldni84sl.R.flushNeeded();}}

    }
}
