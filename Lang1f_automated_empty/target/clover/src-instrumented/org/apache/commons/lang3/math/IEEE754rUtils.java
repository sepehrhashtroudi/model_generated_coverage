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
package org.apache.commons.lang3.math;

/**
 * <p>Provides IEEE-754r variants of NumberUtils methods. </p>
 *
 * <p>See: <a href="http://en.wikipedia.org/wiki/IEEE_754r">http://en.wikipedia.org/wiki/IEEE_754r</a></p>
 *
 * @since 2.4
 * @version $Id$
 */
public class IEEE754rUtils {public static class __CLR4_4_19bk9bkldnigg26{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,12188,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
     /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static double min(final double[] array) {try{__CLR4_4_19bk9bkldnigg26.R.inc(12080);
        // Validates input
        __CLR4_4_19bk9bkldnigg26.R.inc(12081);if ((((array == null)&&(__CLR4_4_19bk9bkldnigg26.R.iget(12082)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12083)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12084);throw new IllegalArgumentException("The Array must not be null");
        } }else {__CLR4_4_19bk9bkldnigg26.R.inc(12085);if ((((array.length == 0)&&(__CLR4_4_19bk9bkldnigg26.R.iget(12086)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12087)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12088);throw new IllegalArgumentException("Array cannot be empty.");
        }
    
        // Finds and returns min
        }}__CLR4_4_19bk9bkldnigg26.R.inc(12089);double min = array[0];
        __CLR4_4_19bk9bkldnigg26.R.inc(12090);for (int i = 1; (((i < array.length)&&(__CLR4_4_19bk9bkldnigg26.R.iget(12091)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12092)==0&false)); i++) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12093);min = min(array[i], min);
        }
    
        }__CLR4_4_19bk9bkldnigg26.R.inc(12094);return min;
    }finally{__CLR4_4_19bk9bkldnigg26.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static float min(final float[] array) {try{__CLR4_4_19bk9bkldnigg26.R.inc(12095);
        // Validates input
        __CLR4_4_19bk9bkldnigg26.R.inc(12096);if ((((array == null)&&(__CLR4_4_19bk9bkldnigg26.R.iget(12097)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12098)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12099);throw new IllegalArgumentException("The Array must not be null");
        } }else {__CLR4_4_19bk9bkldnigg26.R.inc(12100);if ((((array.length == 0)&&(__CLR4_4_19bk9bkldnigg26.R.iget(12101)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12102)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12103);throw new IllegalArgumentException("Array cannot be empty.");
        }
    
        // Finds and returns min
        }}__CLR4_4_19bk9bkldnigg26.R.inc(12104);float min = array[0];
        __CLR4_4_19bk9bkldnigg26.R.inc(12105);for (int i = 1; (((i < array.length)&&(__CLR4_4_19bk9bkldnigg26.R.iget(12106)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12107)==0&false)); i++) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12108);min = min(array[i], min);
        }
    
        }__CLR4_4_19bk9bkldnigg26.R.inc(12109);return min;
    }finally{__CLR4_4_19bk9bkldnigg26.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>double</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static double min(final double a, final double b, final double c) {try{__CLR4_4_19bk9bkldnigg26.R.inc(12110);
        __CLR4_4_19bk9bkldnigg26.R.inc(12111);return min(min(a, b), c);
    }finally{__CLR4_4_19bk9bkldnigg26.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of two <code>double</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @return  the smallest of the values
     */
    public static double min(final double a, final double b) {try{__CLR4_4_19bk9bkldnigg26.R.inc(12112);
        __CLR4_4_19bk9bkldnigg26.R.inc(12113);if((((Double.isNaN(a))&&(__CLR4_4_19bk9bkldnigg26.R.iget(12114)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12115)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12116);return b;
        } }else
        {__CLR4_4_19bk9bkldnigg26.R.inc(12117);if((((Double.isNaN(b))&&(__CLR4_4_19bk9bkldnigg26.R.iget(12118)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12119)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12120);return a;
        } }else {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12121);return Math.min(a, b);
        }
    }}}finally{__CLR4_4_19bk9bkldnigg26.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>float</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static float min(final float a, final float b, final float c) {try{__CLR4_4_19bk9bkldnigg26.R.inc(12122);
        __CLR4_4_19bk9bkldnigg26.R.inc(12123);return min(min(a, b), c);
    }finally{__CLR4_4_19bk9bkldnigg26.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of two <code>float</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @return  the smallest of the values
     */
    public static float min(final float a, final float b) {try{__CLR4_4_19bk9bkldnigg26.R.inc(12124);
        __CLR4_4_19bk9bkldnigg26.R.inc(12125);if((((Float.isNaN(a))&&(__CLR4_4_19bk9bkldnigg26.R.iget(12126)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12127)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12128);return b;
        } }else
        {__CLR4_4_19bk9bkldnigg26.R.inc(12129);if((((Float.isNaN(b))&&(__CLR4_4_19bk9bkldnigg26.R.iget(12130)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12131)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12132);return a;
        } }else {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12133);return Math.min(a, b);
        }
    }}}finally{__CLR4_4_19bk9bkldnigg26.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static double max(final double[] array) {try{__CLR4_4_19bk9bkldnigg26.R.inc(12134);
        // Validates input
        __CLR4_4_19bk9bkldnigg26.R.inc(12135);if ((((array== null)&&(__CLR4_4_19bk9bkldnigg26.R.iget(12136)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12137)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12138);throw new IllegalArgumentException("The Array must not be null");
        } }else {__CLR4_4_19bk9bkldnigg26.R.inc(12139);if ((((array.length == 0)&&(__CLR4_4_19bk9bkldnigg26.R.iget(12140)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12141)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12142);throw new IllegalArgumentException("Array cannot be empty.");
        }
    
        // Finds and returns max
        }}__CLR4_4_19bk9bkldnigg26.R.inc(12143);double max = array[0];
        __CLR4_4_19bk9bkldnigg26.R.inc(12144);for (int j = 1; (((j < array.length)&&(__CLR4_4_19bk9bkldnigg26.R.iget(12145)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12146)==0&false)); j++) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12147);max = max(array[j], max);
        }
    
        }__CLR4_4_19bk9bkldnigg26.R.inc(12148);return max;
    }finally{__CLR4_4_19bk9bkldnigg26.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static float max(final float[] array) {try{__CLR4_4_19bk9bkldnigg26.R.inc(12149);
        // Validates input
        __CLR4_4_19bk9bkldnigg26.R.inc(12150);if ((((array == null)&&(__CLR4_4_19bk9bkldnigg26.R.iget(12151)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12152)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12153);throw new IllegalArgumentException("The Array must not be null");
        } }else {__CLR4_4_19bk9bkldnigg26.R.inc(12154);if ((((array.length == 0)&&(__CLR4_4_19bk9bkldnigg26.R.iget(12155)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12156)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12157);throw new IllegalArgumentException("Array cannot be empty.");
        }

        // Finds and returns max
        }}__CLR4_4_19bk9bkldnigg26.R.inc(12158);float max = array[0];
        __CLR4_4_19bk9bkldnigg26.R.inc(12159);for (int j = 1; (((j < array.length)&&(__CLR4_4_19bk9bkldnigg26.R.iget(12160)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12161)==0&false)); j++) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12162);max = max(array[j], max);
        }

        }__CLR4_4_19bk9bkldnigg26.R.inc(12163);return max;
    }finally{__CLR4_4_19bk9bkldnigg26.R.flushNeeded();}}
     
    /**
     * <p>Gets the maximum of three <code>double</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static double max(final double a, final double b, final double c) {try{__CLR4_4_19bk9bkldnigg26.R.inc(12164);
        __CLR4_4_19bk9bkldnigg26.R.inc(12165);return max(max(a, b), c);
    }finally{__CLR4_4_19bk9bkldnigg26.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of two <code>double</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @return  the largest of the values
     */
    public static double max(final double a, final double b) {try{__CLR4_4_19bk9bkldnigg26.R.inc(12166);
        __CLR4_4_19bk9bkldnigg26.R.inc(12167);if((((Double.isNaN(a))&&(__CLR4_4_19bk9bkldnigg26.R.iget(12168)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12169)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12170);return b;
        } }else
        {__CLR4_4_19bk9bkldnigg26.R.inc(12171);if((((Double.isNaN(b))&&(__CLR4_4_19bk9bkldnigg26.R.iget(12172)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12173)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12174);return a;
        } }else {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12175);return Math.max(a, b);
        }
    }}}finally{__CLR4_4_19bk9bkldnigg26.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>float</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static float max(final float a, final float b, final float c) {try{__CLR4_4_19bk9bkldnigg26.R.inc(12176);
        __CLR4_4_19bk9bkldnigg26.R.inc(12177);return max(max(a, b), c);
    }finally{__CLR4_4_19bk9bkldnigg26.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of two <code>float</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @return  the largest of the values
     */
    public static float max(final float a, final float b) {try{__CLR4_4_19bk9bkldnigg26.R.inc(12178);
        __CLR4_4_19bk9bkldnigg26.R.inc(12179);if((((Float.isNaN(a))&&(__CLR4_4_19bk9bkldnigg26.R.iget(12180)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12181)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12182);return b;
        } }else
        {__CLR4_4_19bk9bkldnigg26.R.inc(12183);if((((Float.isNaN(b))&&(__CLR4_4_19bk9bkldnigg26.R.iget(12184)!=0|true))||(__CLR4_4_19bk9bkldnigg26.R.iget(12185)==0&false))) {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12186);return a;
        } }else {{
            __CLR4_4_19bk9bkldnigg26.R.inc(12187);return Math.max(a, b);
        }
    }}}finally{__CLR4_4_19bk9bkldnigg26.R.flushNeeded();}}

}
