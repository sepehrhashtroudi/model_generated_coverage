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
package org.apache.commons.lang3.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

import org.apache.commons.lang3.ClassUtils;

/**
 * Contains common code for working with Methods/Constructors, extracted and
 * refactored from <code>MethodUtils</code> when it was imported from Commons
 * BeanUtils.
 *
 * @since 2.5
 * @version $Id$
 */
abstract class MemberUtils {public static class __CLR4_4_1ag4ag4ldnigg6f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,13614,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // TODO extract an interface to implement compareParameterSets(...)?

    private static final int ACCESS_TEST = Modifier.PUBLIC | Modifier.PROTECTED | Modifier.PRIVATE;

    /** Array of primitive number types ordered by "promotability" */
    private static final Class<?>[] ORDERED_PRIMITIVE_TYPES = { Byte.TYPE, Short.TYPE,
            Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE };

    /**
     * XXX Default access superclass workaround
     *
     * When a public class has a default access superclass with public members,
     * these members are accessible. Calling them from compiled code works fine.
     * Unfortunately, on some JVMs, using reflection to invoke these members
     * seems to (wrongly) prevent access even when the modifier is public.
     * Calling setAccessible(true) solves the problem but will only work from
     * sufficiently privileged code. Better workarounds would be gratefully
     * accepted.
     * @param o the AccessibleObject to set as accessible
     */
    static void setAccessibleWorkaround(final AccessibleObject o) {try{__CLR4_4_1ag4ag4ldnigg6f.R.inc(13540);
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13541);if ((((o == null || o.isAccessible())&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13542)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13543)==0&false))) {{
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13544);return;
        }
        }__CLR4_4_1ag4ag4ldnigg6f.R.inc(13545);final Member m = (Member) o;
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13546);if ((((Modifier.isPublic(m.getModifiers())
                && isPackageAccess(m.getDeclaringClass().getModifiers()))&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13547)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13548)==0&false))) {{
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13549);try {
                __CLR4_4_1ag4ag4ldnigg6f.R.inc(13550);o.setAccessible(true);
            } catch (final SecurityException e) { // NOPMD
                // ignore in favor of subsequent IllegalAccessException
            }
        }
    }}finally{__CLR4_4_1ag4ag4ldnigg6f.R.flushNeeded();}}

    /**
     * Returns whether a given set of modifiers implies package access.
     * @param modifiers to test
     * @return true unless package/protected/private modifier detected
     */
    static boolean isPackageAccess(final int modifiers) {try{__CLR4_4_1ag4ag4ldnigg6f.R.inc(13551);
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13552);return (modifiers & ACCESS_TEST) == 0;
    }finally{__CLR4_4_1ag4ag4ldnigg6f.R.flushNeeded();}}

    /**
     * Returns whether a Member is accessible.
     * @param m Member to check
     * @return true if <code>m</code> is accessible
     */
    static boolean isAccessible(final Member m) {try{__CLR4_4_1ag4ag4ldnigg6f.R.inc(13553);
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13554);return m != null && Modifier.isPublic(m.getModifiers()) && !m.isSynthetic();
    }finally{__CLR4_4_1ag4ag4ldnigg6f.R.flushNeeded();}}

    /**
     * Compares the relative fitness of two sets of parameter types in terms of
     * matching a third set of runtime parameter types, such that a list ordered
     * by the results of the comparison would return the best match first
     * (least).
     *
     * @param left the "left" parameter set
     * @param right the "right" parameter set
     * @param actual the runtime parameter types to match against
     * <code>left</code>/<code>right</code>
     * @return int consistent with <code>compare</code> semantics
     */
    static int compareParameterTypes(final Class<?>[] left, final Class<?>[] right, final Class<?>[] actual) {try{__CLR4_4_1ag4ag4ldnigg6f.R.inc(13555);
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13556);final float leftCost = getTotalTransformationCost(actual, left);
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13557);final float rightCost = getTotalTransformationCost(actual, right);
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13558);return (((leftCost < rightCost )&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13559)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13560)==0&false))? -1 : (((rightCost < leftCost )&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13561)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13562)==0&false))? 1 : 0;
    }finally{__CLR4_4_1ag4ag4ldnigg6f.R.flushNeeded();}}

    /**
     * Returns the sum of the object transformation cost for each class in the
     * source argument list.
     * @param srcArgs The source arguments
     * @param destArgs The destination arguments
     * @return The total transformation cost
     */
    private static float getTotalTransformationCost(final Class<?>[] srcArgs, final Class<?>[] destArgs) {try{__CLR4_4_1ag4ag4ldnigg6f.R.inc(13563);
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13564);float totalCost = 0.0f;
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13565);for (int i = 0; (((i < srcArgs.length)&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13566)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13567)==0&false)); i++) {{
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13568);Class<?> srcClass, destClass;
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13569);srcClass = srcArgs[i];
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13570);destClass = destArgs[i];
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13571);totalCost += getObjectTransformationCost(srcClass, destClass);
        }
        }__CLR4_4_1ag4ag4ldnigg6f.R.inc(13572);return totalCost;
    }finally{__CLR4_4_1ag4ag4ldnigg6f.R.flushNeeded();}}

    /**
     * Gets the number of steps required needed to turn the source class into
     * the destination class. This represents the number of steps in the object
     * hierarchy graph.
     * @param srcClass The source class
     * @param destClass The destination class
     * @return The cost of transforming an object
     */
    private static float getObjectTransformationCost(Class<?> srcClass, final Class<?> destClass) {try{__CLR4_4_1ag4ag4ldnigg6f.R.inc(13573);
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13574);if ((((destClass.isPrimitive())&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13575)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13576)==0&false))) {{
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13577);return getPrimitivePromotionCost(srcClass, destClass);
        }
        }__CLR4_4_1ag4ag4ldnigg6f.R.inc(13578);float cost = 0.0f;
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13579);while ((((srcClass != null && !destClass.equals(srcClass))&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13580)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13581)==0&false))) {{
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13582);if ((((destClass.isInterface() && ClassUtils.isAssignable(srcClass, destClass))&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13583)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13584)==0&false))) {{
                // slight penalty for interface match.
                // we still want an exact match to override an interface match,
                // but
                // an interface match should override anything where we have to
                // get a superclass.
                __CLR4_4_1ag4ag4ldnigg6f.R.inc(13585);cost += 0.25f;
                __CLR4_4_1ag4ag4ldnigg6f.R.inc(13586);break;
            }
            }__CLR4_4_1ag4ag4ldnigg6f.R.inc(13587);cost++;
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13588);srcClass = srcClass.getSuperclass();
        }
        /*
         * If the destination class is null, we've travelled all the way up to
         * an Object match. We'll penalize this by adding 1.5 to the cost.
         */
        }__CLR4_4_1ag4ag4ldnigg6f.R.inc(13589);if ((((srcClass == null)&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13590)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13591)==0&false))) {{
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13592);cost += 1.5f;
        }
        }__CLR4_4_1ag4ag4ldnigg6f.R.inc(13593);return cost;
    }finally{__CLR4_4_1ag4ag4ldnigg6f.R.flushNeeded();}}

    /**
     * Gets the number of steps required to promote a primitive number to another
     * type.
     * @param srcClass the (primitive) source class
     * @param destClass the (primitive) destination class
     * @return The cost of promoting the primitive
     */
    private static float getPrimitivePromotionCost(final Class<?> srcClass, final Class<?> destClass) {try{__CLR4_4_1ag4ag4ldnigg6f.R.inc(13594);
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13595);float cost = 0.0f;
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13596);Class<?> cls = srcClass;
        __CLR4_4_1ag4ag4ldnigg6f.R.inc(13597);if ((((!cls.isPrimitive())&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13598)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13599)==0&false))) {{
            // slight unwrapping penalty
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13600);cost += 0.1f;
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13601);cls = ClassUtils.wrapperToPrimitive(cls);
        }
        }__CLR4_4_1ag4ag4ldnigg6f.R.inc(13602);for (int i = 0; (((cls != destClass && i < ORDERED_PRIMITIVE_TYPES.length)&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13603)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13604)==0&false)); i++) {{
            __CLR4_4_1ag4ag4ldnigg6f.R.inc(13605);if ((((cls == ORDERED_PRIMITIVE_TYPES[i])&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13606)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13607)==0&false))) {{
                __CLR4_4_1ag4ag4ldnigg6f.R.inc(13608);cost += 0.1f;
                __CLR4_4_1ag4ag4ldnigg6f.R.inc(13609);if ((((i < ORDERED_PRIMITIVE_TYPES.length - 1)&&(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13610)!=0|true))||(__CLR4_4_1ag4ag4ldnigg6f.R.iget(13611)==0&false))) {{
                    __CLR4_4_1ag4ag4ldnigg6f.R.inc(13612);cls = ORDERED_PRIMITIVE_TYPES[i + 1];
                }
            }}
        }}
        }__CLR4_4_1ag4ag4ldnigg6f.R.inc(13613);return cost;
    }finally{__CLR4_4_1ag4ag4ldnigg6f.R.flushNeeded();}}

}
