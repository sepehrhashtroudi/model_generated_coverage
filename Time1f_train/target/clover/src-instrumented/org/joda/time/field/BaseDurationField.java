/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.field;

import java.io.Serializable;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/**
 * BaseDurationField provides the common behaviour for DurationField
 * implementations.
 * <p>
 * This class should generally not be used directly by API users. The
 * DurationField class should be used when different kinds of DurationField
 * objects are to be referenced.
 * <p>
 * BaseDurationField is thread-safe and immutable, and its subclasses must
 * be as well.
 *
 * @author Brian S O'Neill
 * @see DecoratedDurationField
 * @since 1.0
 */
public abstract class BaseDurationField extends DurationField implements Serializable {public static class __CLR4_4_1afwafwlc8axcy8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270913799L,8589935092L,13571,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock. */
    private static final long serialVersionUID = -2554245107589433218L;

    /** A desriptive name for the field. */
    private final DurationFieldType iType;

    protected BaseDurationField(DurationFieldType type) {
        super();__CLR4_4_1afwafwlc8axcy8.R.inc(13533);try{__CLR4_4_1afwafwlc8axcy8.R.inc(13532);
        __CLR4_4_1afwafwlc8axcy8.R.inc(13534);if ((((type == null)&&(__CLR4_4_1afwafwlc8axcy8.R.iget(13535)!=0|true))||(__CLR4_4_1afwafwlc8axcy8.R.iget(13536)==0&false))) {{
            __CLR4_4_1afwafwlc8axcy8.R.inc(13537);throw new IllegalArgumentException("The type must not be null");
        }
        }__CLR4_4_1afwafwlc8axcy8.R.inc(13538);iType = type;
    }finally{__CLR4_4_1afwafwlc8axcy8.R.flushNeeded();}}

    public final DurationFieldType getType() {try{__CLR4_4_1afwafwlc8axcy8.R.inc(13539);
        __CLR4_4_1afwafwlc8axcy8.R.inc(13540);return iType;
    }finally{__CLR4_4_1afwafwlc8axcy8.R.flushNeeded();}}

    public final String getName() {try{__CLR4_4_1afwafwlc8axcy8.R.inc(13541);
        __CLR4_4_1afwafwlc8axcy8.R.inc(13542);return iType.getName();
    }finally{__CLR4_4_1afwafwlc8axcy8.R.flushNeeded();}}

    /**
     * @return true always
     */
    public final boolean isSupported() {try{__CLR4_4_1afwafwlc8axcy8.R.inc(13543);
        __CLR4_4_1afwafwlc8axcy8.R.inc(13544);return true;
    }finally{__CLR4_4_1afwafwlc8axcy8.R.flushNeeded();}}

    //------------------------------------------------------------------------
    /**
     * Get the value of this field from the milliseconds, which is approximate
     * if this field is imprecise.
     *
     * @param duration  the milliseconds to query, which may be negative
     * @return the value of the field, in the units of the field, which may be
     * negative
     */
    public int getValue(long duration) {try{__CLR4_4_1afwafwlc8axcy8.R.inc(13545);
        __CLR4_4_1afwafwlc8axcy8.R.inc(13546);return FieldUtils.safeToInt(getValueAsLong(duration));
    }finally{__CLR4_4_1afwafwlc8axcy8.R.flushNeeded();}}

    /**
     * Get the value of this field from the milliseconds, which is approximate
     * if this field is imprecise.
     *
     * @param duration  the milliseconds to query, which may be negative
     * @return the value of the field, in the units of the field, which may be
     * negative
     */
    public long getValueAsLong(long duration) {try{__CLR4_4_1afwafwlc8axcy8.R.inc(13547);
        __CLR4_4_1afwafwlc8axcy8.R.inc(13548);return duration / getUnitMillis();
    }finally{__CLR4_4_1afwafwlc8axcy8.R.flushNeeded();}}

    /**
     * Get the value of this field from the milliseconds relative to an
     * instant.
     *
     * <p>If the milliseconds is positive, then the instant is treated as a
     * "start instant". If negative, the instant is treated as an "end
     * instant".
     *
     * <p>The default implementation returns
     * <code>Utils.safeToInt(getAsLong(millisDuration, instant))</code>.
     * 
     * @param duration  the milliseconds to query, which may be negative
     * @param instant  the start instant to calculate relative to
     * @return the value of the field, in the units of the field, which may be
     * negative
     */
    public int getValue(long duration, long instant) {try{__CLR4_4_1afwafwlc8axcy8.R.inc(13549);
        __CLR4_4_1afwafwlc8axcy8.R.inc(13550);return FieldUtils.safeToInt(getValueAsLong(duration, instant));
    }finally{__CLR4_4_1afwafwlc8axcy8.R.flushNeeded();}}

    /**
     * Get the millisecond duration of this field from its value, which is
     * approximate if this field is imprecise.
     * 
     * @param value  the value of the field, which may be negative
     * @return the milliseconds that the field represents, which may be
     * negative
     */
    public long getMillis(int value) {try{__CLR4_4_1afwafwlc8axcy8.R.inc(13551);
        __CLR4_4_1afwafwlc8axcy8.R.inc(13552);return value * getUnitMillis();  // safe
    }finally{__CLR4_4_1afwafwlc8axcy8.R.flushNeeded();}}

    /**
     * Get the millisecond duration of this field from its value, which is
     * approximate if this field is imprecise.
     * 
     * @param value  the value of the field, which may be negative
     * @return the milliseconds that the field represents, which may be
     * negative
     */
    public long getMillis(long value) {try{__CLR4_4_1afwafwlc8axcy8.R.inc(13553);
        __CLR4_4_1afwafwlc8axcy8.R.inc(13554);return FieldUtils.safeMultiply(value, getUnitMillis());
    }finally{__CLR4_4_1afwafwlc8axcy8.R.flushNeeded();}}

    // Calculation API
    //------------------------------------------------------------------------
    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1afwafwlc8axcy8.R.inc(13555);
        __CLR4_4_1afwafwlc8axcy8.R.inc(13556);return FieldUtils.safeToInt(getDifferenceAsLong(minuendInstant, subtrahendInstant));
    }finally{__CLR4_4_1afwafwlc8axcy8.R.flushNeeded();}}

    //------------------------------------------------------------------------
    public int compareTo(DurationField otherField) {try{__CLR4_4_1afwafwlc8axcy8.R.inc(13557);
        __CLR4_4_1afwafwlc8axcy8.R.inc(13558);long otherMillis = otherField.getUnitMillis();
        __CLR4_4_1afwafwlc8axcy8.R.inc(13559);long thisMillis = getUnitMillis();
        // cannot do (thisMillis - otherMillis) as can overflow
        __CLR4_4_1afwafwlc8axcy8.R.inc(13560);if ((((thisMillis == otherMillis)&&(__CLR4_4_1afwafwlc8axcy8.R.iget(13561)!=0|true))||(__CLR4_4_1afwafwlc8axcy8.R.iget(13562)==0&false))) {{
            __CLR4_4_1afwafwlc8axcy8.R.inc(13563);return 0;
        }
        }__CLR4_4_1afwafwlc8axcy8.R.inc(13564);if ((((thisMillis < otherMillis)&&(__CLR4_4_1afwafwlc8axcy8.R.iget(13565)!=0|true))||(__CLR4_4_1afwafwlc8axcy8.R.iget(13566)==0&false))) {{
            __CLR4_4_1afwafwlc8axcy8.R.inc(13567);return -1;
        } }else {{
            __CLR4_4_1afwafwlc8axcy8.R.inc(13568);return 1;
        }
    }}finally{__CLR4_4_1afwafwlc8axcy8.R.flushNeeded();}}

    /**
     * Get a suitable debug string.
     * 
     * @return debug string
     */
    public String toString() {try{__CLR4_4_1afwafwlc8axcy8.R.inc(13569);
        __CLR4_4_1afwafwlc8axcy8.R.inc(13570);return "DurationField[" + getName() + ']';
    }finally{__CLR4_4_1afwafwlc8axcy8.R.flushNeeded();}}

}
