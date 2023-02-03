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

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.ClassUtils;

/**
 * <p> Utility methods focusing on type inspection, particularly with regard to
 * generics. </p>
 *
 * @since 3.0
 * @version $Id$
 */
public class TypeUtils {public static class __CLR4_4_1amxamxldni845z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,14293,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p> TypeUtils instances should NOT be constructed in standard
     * programming. Instead, the class should be used as
     * <code>TypeUtils.isAssignable(cls, toClass)</code>. </p> <p> This
     * constructor is public to permit tools that require a JavaBean instance to
     * operate. </p>
     */
    public TypeUtils() {
        super();__CLR4_4_1amxamxldni845z.R.inc(13786);try{__CLR4_4_1amxamxldni845z.R.inc(13785);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Checks if the subject type may be implicitly cast to the target type
     * following the Java generics rules. If both types are {@link Class}
     * objects, the method returns the result of
     * {@link ClassUtils#isAssignable(Class, Class)}. </p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toType the target type
     * @return <code>true</code> if <code>type</code> is assignable to <code>toType</code>.
     */
    public static boolean isAssignable(final Type type, final Type toType) {try{__CLR4_4_1amxamxldni845z.R.inc(13787);
        __CLR4_4_1amxamxldni845z.R.inc(13788);return isAssignable(type, toType, null);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Checks if the subject type may be implicitly cast to the target type
     * following the Java generics rules. </p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toType the target type
     * @param typeVarAssigns optional map of type variable assignments
     * @return <code>true</code> if <code>type</code> is assignable to <code>toType</code>.
     */
    private static boolean isAssignable(final Type type, final Type toType,
            final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_4_1amxamxldni845z.R.inc(13789);
        __CLR4_4_1amxamxldni845z.R.inc(13790);if ((((toType == null || toType instanceof Class<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(13791)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13792)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13793);return isAssignable(type, (Class<?>) toType);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13794);if ((((toType instanceof ParameterizedType)&&(__CLR4_4_1amxamxldni845z.R.iget(13795)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13796)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13797);return isAssignable(type, (ParameterizedType) toType, typeVarAssigns);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13798);if ((((toType instanceof GenericArrayType)&&(__CLR4_4_1amxamxldni845z.R.iget(13799)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13800)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13801);return isAssignable(type, (GenericArrayType) toType, typeVarAssigns);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13802);if ((((toType instanceof WildcardType)&&(__CLR4_4_1amxamxldni845z.R.iget(13803)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13804)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13805);return isAssignable(type, (WildcardType) toType, typeVarAssigns);
        }

        // *
        }__CLR4_4_1amxamxldni845z.R.inc(13806);if ((((toType instanceof TypeVariable<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(13807)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13808)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13809);return isAssignable(type, (TypeVariable<?>) toType, typeVarAssigns);
        }
        // */

        }__CLR4_4_1amxamxldni845z.R.inc(13810);throw new IllegalStateException("found an unhandled type: " + toType);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Checks if the subject type may be implicitly cast to the target class
     * following the Java generics rules. </p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toClass the target class
     * @return true if <code>type</code> is assignable to <code>toClass</code>.
     */
    private static boolean isAssignable(final Type type, final Class<?> toClass) {try{__CLR4_4_1amxamxldni845z.R.inc(13811);
        __CLR4_4_1amxamxldni845z.R.inc(13812);if ((((type == null)&&(__CLR4_4_1amxamxldni845z.R.iget(13813)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13814)==0&false))) {{
            // consistency with ClassUtils.isAssignable() behavior
            __CLR4_4_1amxamxldni845z.R.inc(13815);return toClass == null || !toClass.isPrimitive();
        }

        // only a null type can be assigned to null type which
        // would have cause the previous to return true
        }__CLR4_4_1amxamxldni845z.R.inc(13816);if ((((toClass == null)&&(__CLR4_4_1amxamxldni845z.R.iget(13817)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13818)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13819);return false;
        }

        // all types are assignable to themselves
        }__CLR4_4_1amxamxldni845z.R.inc(13820);if ((((toClass.equals(type))&&(__CLR4_4_1amxamxldni845z.R.iget(13821)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13822)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13823);return true;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13824);if ((((type instanceof Class<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(13825)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13826)==0&false))) {{
            // just comparing two classes
            __CLR4_4_1amxamxldni845z.R.inc(13827);return ClassUtils.isAssignable((Class<?>) type, toClass);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13828);if ((((type instanceof ParameterizedType)&&(__CLR4_4_1amxamxldni845z.R.iget(13829)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13830)==0&false))) {{
            // only have to compare the raw type to the class
            __CLR4_4_1amxamxldni845z.R.inc(13831);return isAssignable(getRawType((ParameterizedType) type), toClass);
        }

        // *
        }__CLR4_4_1amxamxldni845z.R.inc(13832);if ((((type instanceof TypeVariable<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(13833)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13834)==0&false))) {{
            // if any of the bounds are assignable to the class, then the
            // type is assignable to the class.
            __CLR4_4_1amxamxldni845z.R.inc(13835);for (final Type bound : ((TypeVariable<?>) type).getBounds()) {{
                __CLR4_4_1amxamxldni845z.R.inc(13836);if ((((isAssignable(bound, toClass))&&(__CLR4_4_1amxamxldni845z.R.iget(13837)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13838)==0&false))) {{
                    __CLR4_4_1amxamxldni845z.R.inc(13839);return true;
                }
            }}

            }__CLR4_4_1amxamxldni845z.R.inc(13840);return false;
        }

        // the only classes to which a generic array type can be assigned
        // are class Object and array classes
        }__CLR4_4_1amxamxldni845z.R.inc(13841);if ((((type instanceof GenericArrayType)&&(__CLR4_4_1amxamxldni845z.R.iget(13842)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13843)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13844);return toClass.equals(Object.class)
                    || toClass.isArray()
                    && isAssignable(((GenericArrayType) type).getGenericComponentType(), toClass
                            .getComponentType());
        }

        // wildcard types are not assignable to a class (though one would think
        // "? super Object" would be assignable to Object)
        }__CLR4_4_1amxamxldni845z.R.inc(13845);if ((((type instanceof WildcardType)&&(__CLR4_4_1amxamxldni845z.R.iget(13846)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13847)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13848);return false;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13849);throw new IllegalStateException("found an unhandled type: " + type);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Checks if the subject type may be implicitly cast to the target
     * parameterized type following the Java generics rules. </p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toParameterizedType the target parameterized type
     * @param typeVarAssigns a map with type variables
     * @return true if <code>type</code> is assignable to <code>toType</code>.
     */
    private static boolean isAssignable(final Type type, final ParameterizedType toParameterizedType,
            final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_4_1amxamxldni845z.R.inc(13850);
        __CLR4_4_1amxamxldni845z.R.inc(13851);if ((((type == null)&&(__CLR4_4_1amxamxldni845z.R.iget(13852)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13853)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13854);return true;
        }

        // only a null type can be assigned to null type which
        // would have cause the previous to return true
        }__CLR4_4_1amxamxldni845z.R.inc(13855);if ((((toParameterizedType == null)&&(__CLR4_4_1amxamxldni845z.R.iget(13856)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13857)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13858);return false;
        }

        // all types are assignable to themselves
        }__CLR4_4_1amxamxldni845z.R.inc(13859);if ((((toParameterizedType.equals(type))&&(__CLR4_4_1amxamxldni845z.R.iget(13860)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13861)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13862);return true;
        }

        // get the target type's raw type
        }__CLR4_4_1amxamxldni845z.R.inc(13863);final Class<?> toClass = getRawType(toParameterizedType);
        // get the subject type's type arguments including owner type arguments
        // and supertype arguments up to and including the target class.
        __CLR4_4_1amxamxldni845z.R.inc(13864);final Map<TypeVariable<?>, Type> fromTypeVarAssigns = getTypeArguments(type, toClass, null);

        // null means the two types are not compatible
        __CLR4_4_1amxamxldni845z.R.inc(13865);if ((((fromTypeVarAssigns == null)&&(__CLR4_4_1amxamxldni845z.R.iget(13866)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13867)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13868);return false;
        }

        // compatible types, but there's no type arguments. this is equivalent
        // to comparing Map< ?, ? > to Map, and raw types are always assignable
        // to parameterized types.
        }__CLR4_4_1amxamxldni845z.R.inc(13869);if ((((fromTypeVarAssigns.isEmpty())&&(__CLR4_4_1amxamxldni845z.R.iget(13870)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13871)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13872);return true;
        }

        // get the target type's type arguments including owner type arguments
        }__CLR4_4_1amxamxldni845z.R.inc(13873);final Map<TypeVariable<?>, Type> toTypeVarAssigns = getTypeArguments(toParameterizedType,
                toClass, typeVarAssigns);

        // now to check each type argument
        __CLR4_4_1amxamxldni845z.R.inc(13874);for (final TypeVariable<?> var : toTypeVarAssigns.keySet()) {{
            __CLR4_4_1amxamxldni845z.R.inc(13875);final Type toTypeArg = unrollVariableAssignments(var, toTypeVarAssigns);
            __CLR4_4_1amxamxldni845z.R.inc(13876);final Type fromTypeArg = unrollVariableAssignments(var, fromTypeVarAssigns);

            // parameters must either be absent from the subject type, within
            // the bounds of the wildcard type, or be an exact match to the
            // parameters of the target type.
            __CLR4_4_1amxamxldni845z.R.inc(13877);if ((((fromTypeArg != null
                    && !toTypeArg.equals(fromTypeArg)
                    && !(toTypeArg instanceof WildcardType && isAssignable(fromTypeArg, toTypeArg,
                            typeVarAssigns)))&&(__CLR4_4_1amxamxldni845z.R.iget(13878)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13879)==0&false))) {{
                __CLR4_4_1amxamxldni845z.R.inc(13880);return false;
            }
        }}

        }__CLR4_4_1amxamxldni845z.R.inc(13881);return true;
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    private static Type unrollVariableAssignments(TypeVariable<?> var, final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_4_1amxamxldni845z.R.inc(13882);
        __CLR4_4_1amxamxldni845z.R.inc(13883);Type result;
        __CLR4_4_1amxamxldni845z.R.inc(13884);do {{
            __CLR4_4_1amxamxldni845z.R.inc(13885);result = typeVarAssigns.get(var);
            __CLR4_4_1amxamxldni845z.R.inc(13886);if ((((result instanceof TypeVariable<?> && !result.equals(var))&&(__CLR4_4_1amxamxldni845z.R.iget(13887)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13888)==0&false))) {{
                __CLR4_4_1amxamxldni845z.R.inc(13889);var = (TypeVariable<?>) result;
                __CLR4_4_1amxamxldni845z.R.inc(13890);continue;
            }
            }__CLR4_4_1amxamxldni845z.R.inc(13891);break;
        } }while (true);
        __CLR4_4_1amxamxldni845z.R.inc(13892);return result;
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Checks if the subject type may be implicitly cast to the target
     * generic array type following the Java generics rules. </p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toGenericArrayType the target generic array type
     * @param typeVarAssigns a map with type variables
     * @return true if <code>type</code> is assignable to
     * <code>toGenericArrayType</code>.
     */
    private static boolean isAssignable(final Type type, final GenericArrayType toGenericArrayType,
            final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_4_1amxamxldni845z.R.inc(13893);
        __CLR4_4_1amxamxldni845z.R.inc(13894);if ((((type == null)&&(__CLR4_4_1amxamxldni845z.R.iget(13895)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13896)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13897);return true;
        }

        // only a null type can be assigned to null type which
        // would have cause the previous to return true
        }__CLR4_4_1amxamxldni845z.R.inc(13898);if ((((toGenericArrayType == null)&&(__CLR4_4_1amxamxldni845z.R.iget(13899)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13900)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13901);return false;
        }

        // all types are assignable to themselves
        }__CLR4_4_1amxamxldni845z.R.inc(13902);if ((((toGenericArrayType.equals(type))&&(__CLR4_4_1amxamxldni845z.R.iget(13903)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13904)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13905);return true;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13906);final Type toComponentType = toGenericArrayType.getGenericComponentType();

        __CLR4_4_1amxamxldni845z.R.inc(13907);if ((((type instanceof Class<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(13908)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13909)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13910);final Class<?> cls = (Class<?>) type;

            // compare the component types
            __CLR4_4_1amxamxldni845z.R.inc(13911);return cls.isArray()
                    && isAssignable(cls.getComponentType(), toComponentType, typeVarAssigns);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13912);if ((((type instanceof GenericArrayType)&&(__CLR4_4_1amxamxldni845z.R.iget(13913)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13914)==0&false))) {{
            // compare the component types
            __CLR4_4_1amxamxldni845z.R.inc(13915);return isAssignable(((GenericArrayType) type).getGenericComponentType(),
                    toComponentType, typeVarAssigns);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13916);if ((((type instanceof WildcardType)&&(__CLR4_4_1amxamxldni845z.R.iget(13917)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13918)==0&false))) {{
            // so long as one of the upper bounds is assignable, it's good
            __CLR4_4_1amxamxldni845z.R.inc(13919);for (final Type bound : getImplicitUpperBounds((WildcardType) type)) {{
                __CLR4_4_1amxamxldni845z.R.inc(13920);if ((((isAssignable(bound, toGenericArrayType))&&(__CLR4_4_1amxamxldni845z.R.iget(13921)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13922)==0&false))) {{
                    __CLR4_4_1amxamxldni845z.R.inc(13923);return true;
                }
            }}

            }__CLR4_4_1amxamxldni845z.R.inc(13924);return false;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13925);if ((((type instanceof TypeVariable<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(13926)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13927)==0&false))) {{
            // probably should remove the following logic and just return false.
            // type variables cannot specify arrays as bounds.
            __CLR4_4_1amxamxldni845z.R.inc(13928);for (final Type bound : getImplicitBounds((TypeVariable<?>) type)) {{
                __CLR4_4_1amxamxldni845z.R.inc(13929);if ((((isAssignable(bound, toGenericArrayType))&&(__CLR4_4_1amxamxldni845z.R.iget(13930)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13931)==0&false))) {{
                    __CLR4_4_1amxamxldni845z.R.inc(13932);return true;
                }
            }}

            }__CLR4_4_1amxamxldni845z.R.inc(13933);return false;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13934);if ((((type instanceof ParameterizedType)&&(__CLR4_4_1amxamxldni845z.R.iget(13935)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13936)==0&false))) {{
            // the raw type of a parameterized type is never an array or
            // generic array, otherwise the declaration would look like this:
            // Collection[]< ? extends String > collection;
            __CLR4_4_1amxamxldni845z.R.inc(13937);return false;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13938);throw new IllegalStateException("found an unhandled type: " + type);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Checks if the subject type may be implicitly cast to the target
     * wildcard type following the Java generics rules. </p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toWildcardType the target wildcard type
     * @param typeVarAssigns a map with type variables
     * @return true if <code>type</code> is assignable to
     * <code>toWildcardType</code>.
     */
    private static boolean isAssignable(final Type type, final WildcardType toWildcardType,
            final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_4_1amxamxldni845z.R.inc(13939);
        __CLR4_4_1amxamxldni845z.R.inc(13940);if ((((type == null)&&(__CLR4_4_1amxamxldni845z.R.iget(13941)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13942)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13943);return true;
        }

        // only a null type can be assigned to null type which
        // would have cause the previous to return true
        }__CLR4_4_1amxamxldni845z.R.inc(13944);if ((((toWildcardType == null)&&(__CLR4_4_1amxamxldni845z.R.iget(13945)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13946)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13947);return false;
        }

        // all types are assignable to themselves
        }__CLR4_4_1amxamxldni845z.R.inc(13948);if ((((toWildcardType.equals(type))&&(__CLR4_4_1amxamxldni845z.R.iget(13949)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13950)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13951);return true;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13952);final Type[] toUpperBounds = getImplicitUpperBounds(toWildcardType);
        __CLR4_4_1amxamxldni845z.R.inc(13953);final Type[] toLowerBounds = getImplicitLowerBounds(toWildcardType);

        __CLR4_4_1amxamxldni845z.R.inc(13954);if ((((type instanceof WildcardType)&&(__CLR4_4_1amxamxldni845z.R.iget(13955)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13956)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13957);final WildcardType wildcardType = (WildcardType) type;
            __CLR4_4_1amxamxldni845z.R.inc(13958);final Type[] upperBounds = getImplicitUpperBounds(wildcardType);
            __CLR4_4_1amxamxldni845z.R.inc(13959);final Type[] lowerBounds = getImplicitLowerBounds(wildcardType);

            __CLR4_4_1amxamxldni845z.R.inc(13960);for (Type toBound : toUpperBounds) {{
                // if there are assignments for unresolved type variables,
                // now's the time to substitute them.
                __CLR4_4_1amxamxldni845z.R.inc(13961);toBound = substituteTypeVariables(toBound, typeVarAssigns);

                // each upper bound of the subject type has to be assignable to
                // each
                // upper bound of the target type
                __CLR4_4_1amxamxldni845z.R.inc(13962);for (final Type bound : upperBounds) {{
                    __CLR4_4_1amxamxldni845z.R.inc(13963);if ((((!isAssignable(bound, toBound, typeVarAssigns))&&(__CLR4_4_1amxamxldni845z.R.iget(13964)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13965)==0&false))) {{
                        __CLR4_4_1amxamxldni845z.R.inc(13966);return false;
                    }
                }}
            }}

            }__CLR4_4_1amxamxldni845z.R.inc(13967);for (Type toBound : toLowerBounds) {{
                // if there are assignments for unresolved type variables,
                // now's the time to substitute them.
                __CLR4_4_1amxamxldni845z.R.inc(13968);toBound = substituteTypeVariables(toBound, typeVarAssigns);

                // each lower bound of the target type has to be assignable to
                // each
                // lower bound of the subject type
                __CLR4_4_1amxamxldni845z.R.inc(13969);for (final Type bound : lowerBounds) {{
                    __CLR4_4_1amxamxldni845z.R.inc(13970);if ((((!isAssignable(toBound, bound, typeVarAssigns))&&(__CLR4_4_1amxamxldni845z.R.iget(13971)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13972)==0&false))) {{
                        __CLR4_4_1amxamxldni845z.R.inc(13973);return false;
                    }
                }}
            }}

            }__CLR4_4_1amxamxldni845z.R.inc(13974);return true;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13975);for (final Type toBound : toUpperBounds) {{
            // if there are assignments for unresolved type variables,
            // now's the time to substitute them.
            __CLR4_4_1amxamxldni845z.R.inc(13976);if ((((!isAssignable(type, substituteTypeVariables(toBound, typeVarAssigns),
                    typeVarAssigns))&&(__CLR4_4_1amxamxldni845z.R.iget(13977)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13978)==0&false))) {{
                __CLR4_4_1amxamxldni845z.R.inc(13979);return false;
            }
        }}

        }__CLR4_4_1amxamxldni845z.R.inc(13980);for (final Type toBound : toLowerBounds) {{
            // if there are assignments for unresolved type variables,
            // now's the time to substitute them.
            __CLR4_4_1amxamxldni845z.R.inc(13981);if ((((!isAssignable(substituteTypeVariables(toBound, typeVarAssigns), type,
                    typeVarAssigns))&&(__CLR4_4_1amxamxldni845z.R.iget(13982)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13983)==0&false))) {{
                __CLR4_4_1amxamxldni845z.R.inc(13984);return false;
            }
        }}

        }__CLR4_4_1amxamxldni845z.R.inc(13985);return true;
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Checks if the subject type may be implicitly cast to the target type
     * variable following the Java generics rules. </p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toTypeVariable the target type variable
     * @param typeVarAssigns a map with type variables
     * @return true if <code>type</code> is assignable to
     * <code>toTypeVariable</code>.
     */
    private static boolean isAssignable(final Type type, final TypeVariable<?> toTypeVariable,
            final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_4_1amxamxldni845z.R.inc(13986);
        __CLR4_4_1amxamxldni845z.R.inc(13987);if ((((type == null)&&(__CLR4_4_1amxamxldni845z.R.iget(13988)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13989)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13990);return true;
        }

        // only a null type can be assigned to null type which
        // would have cause the previous to return true
        }__CLR4_4_1amxamxldni845z.R.inc(13991);if ((((toTypeVariable == null)&&(__CLR4_4_1amxamxldni845z.R.iget(13992)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13993)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13994);return false;
        }

        // all types are assignable to themselves
        }__CLR4_4_1amxamxldni845z.R.inc(13995);if ((((toTypeVariable.equals(type))&&(__CLR4_4_1amxamxldni845z.R.iget(13996)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(13997)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(13998);return true;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(13999);if ((((type instanceof TypeVariable<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(14000)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14001)==0&false))) {{
            // a type variable is assignable to another type variable, if
            // and only if the former is the latter, extends the latter, or
            // is otherwise a descendant of the latter.
            __CLR4_4_1amxamxldni845z.R.inc(14002);final Type[] bounds = getImplicitBounds((TypeVariable<?>) type);

            __CLR4_4_1amxamxldni845z.R.inc(14003);for (final Type bound : bounds) {{
                __CLR4_4_1amxamxldni845z.R.inc(14004);if ((((isAssignable(bound, toTypeVariable, typeVarAssigns))&&(__CLR4_4_1amxamxldni845z.R.iget(14005)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14006)==0&false))) {{
                    __CLR4_4_1amxamxldni845z.R.inc(14007);return true;
                }
            }}
        }}

        }__CLR4_4_1amxamxldni845z.R.inc(14008);if ((((type instanceof Class<?> || type instanceof ParameterizedType
                || type instanceof GenericArrayType || type instanceof WildcardType)&&(__CLR4_4_1amxamxldni845z.R.iget(14009)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14010)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14011);return false;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14012);throw new IllegalStateException("found an unhandled type: " + type);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> </p>
     *
     * @param type the type to be replaced
     * @param typeVarAssigns the map with type variables
     * @return the replaced type
     * @throws IllegalArgumentException if the type cannot be substituted
     */
    private static Type substituteTypeVariables(final Type type, final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_4_1amxamxldni845z.R.inc(14013);
        __CLR4_4_1amxamxldni845z.R.inc(14014);if ((((type instanceof TypeVariable<?> && typeVarAssigns != null)&&(__CLR4_4_1amxamxldni845z.R.iget(14015)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14016)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14017);final Type replacementType = typeVarAssigns.get(type);

            __CLR4_4_1amxamxldni845z.R.inc(14018);if ((((replacementType == null)&&(__CLR4_4_1amxamxldni845z.R.iget(14019)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14020)==0&false))) {{
                __CLR4_4_1amxamxldni845z.R.inc(14021);throw new IllegalArgumentException("missing assignment type for type variable "
                        + type);
            }

            }__CLR4_4_1amxamxldni845z.R.inc(14022);return replacementType;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14023);return type;
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Retrieves all the type arguments for this parameterized type
     * including owner hierarchy arguments such as <code>
     * Outer<K,V>.Inner<T>.DeepInner<E></code> . The arguments are returned in a
     * {@link Map} specifying the argument type for each {@link TypeVariable}.
     * </p>
     *
     * @param type specifies the subject parameterized type from which to
     * harvest the parameters.
     * @return a map of the type arguments to their respective type variables.
     */
    public static Map<TypeVariable<?>, Type> getTypeArguments(final ParameterizedType type) {try{__CLR4_4_1amxamxldni845z.R.inc(14024);
        __CLR4_4_1amxamxldni845z.R.inc(14025);return getTypeArguments(type, getRawType(type), null);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Gets the type arguments of a class/interface based on a subtype. For
     * instance, this method will determine that both of the parameters for the
     * interface {@link Map} are {@link Object} for the subtype
     * {@link java.util.Properties Properties} even though the subtype does not
     * directly implement the <code>Map</code> interface. <p> </p> This method
     * returns <code>null</code> if <code>type</code> is not assignable to
     * <code>toClass</code>. It returns an empty map if none of the classes or
     * interfaces in its inheritance hierarchy specify any type arguments. </p>
     * <p> A side-effect of this method is that it also retrieves the type
     * arguments for the classes and interfaces that are part of the hierarchy
     * between <code>type</code> and <code>toClass</code>. So with the above
     * example, this method will also determine that the type arguments for
     * {@link java.util.Hashtable Hashtable} are also both <code>Object</code>.
     * In cases where the interface specified by <code>toClass</code> is
     * (indirectly) implemented more than once (e.g. where <code>toClass</code>
     * specifies the interface {@link java.lang.Iterable Iterable} and
     * <code>type</code> specifies a parameterized type that implements both
     * {@link java.util.Set Set} and {@link java.util.Collection Collection}),
     * this method will look at the inheritance hierarchy of only one of the
     * implementations/subclasses; the first interface encountered that isn't a
     * subinterface to one of the others in the <code>type</code> to
     * <code>toClass</code> hierarchy. </p>
     *
     * @param type the type from which to determine the type parameters of
     * <code>toClass</code>
     * @param toClass the class whose type parameters are to be determined based
     * on the subtype <code>type</code>
     * @return a map of the type assignments for the type variables in each type
     * in the inheritance hierarchy from <code>type</code> to
     * <code>toClass</code> inclusive.
     */
    public static Map<TypeVariable<?>, Type> getTypeArguments(final Type type, final Class<?> toClass) {try{__CLR4_4_1amxamxldni845z.R.inc(14026);
        __CLR4_4_1amxamxldni845z.R.inc(14027);return getTypeArguments(type, toClass, null);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Return a map of the type arguments of <code>type</code> in the context of <code>toClass</code>. </p>
     *
     * @param type the type in question
     * @param toClass the class
     * @param subtypeVarAssigns a map with type variables
     * @return the map with type arguments
     */
    private static Map<TypeVariable<?>, Type> getTypeArguments(final Type type, final Class<?> toClass,
            final Map<TypeVariable<?>, Type> subtypeVarAssigns) {try{__CLR4_4_1amxamxldni845z.R.inc(14028);
        __CLR4_4_1amxamxldni845z.R.inc(14029);if ((((type instanceof Class<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(14030)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14031)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14032);return getTypeArguments((Class<?>) type, toClass, subtypeVarAssigns);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14033);if ((((type instanceof ParameterizedType)&&(__CLR4_4_1amxamxldni845z.R.iget(14034)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14035)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14036);return getTypeArguments((ParameterizedType) type, toClass, subtypeVarAssigns);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14037);if ((((type instanceof GenericArrayType)&&(__CLR4_4_1amxamxldni845z.R.iget(14038)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14039)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14040);return getTypeArguments(((GenericArrayType) type).getGenericComponentType(), (((toClass
                    .isArray() )&&(__CLR4_4_1amxamxldni845z.R.iget(14041)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14042)==0&false))? toClass.getComponentType() : toClass, subtypeVarAssigns);
        }

        // since wildcard types are not assignable to classes, should this just
        // return null?
        }__CLR4_4_1amxamxldni845z.R.inc(14043);if ((((type instanceof WildcardType)&&(__CLR4_4_1amxamxldni845z.R.iget(14044)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14045)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14046);for (final Type bound : getImplicitUpperBounds((WildcardType) type)) {{
                // find the first bound that is assignable to the target class
                __CLR4_4_1amxamxldni845z.R.inc(14047);if ((((isAssignable(bound, toClass))&&(__CLR4_4_1amxamxldni845z.R.iget(14048)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14049)==0&false))) {{
                    __CLR4_4_1amxamxldni845z.R.inc(14050);return getTypeArguments(bound, toClass, subtypeVarAssigns);
                }
            }}

            }__CLR4_4_1amxamxldni845z.R.inc(14051);return null;
        }

        // *
        }__CLR4_4_1amxamxldni845z.R.inc(14052);if ((((type instanceof TypeVariable<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(14053)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14054)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14055);for (final Type bound : getImplicitBounds((TypeVariable<?>) type)) {{
                // find the first bound that is assignable to the target class
                __CLR4_4_1amxamxldni845z.R.inc(14056);if ((((isAssignable(bound, toClass))&&(__CLR4_4_1amxamxldni845z.R.iget(14057)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14058)==0&false))) {{
                    __CLR4_4_1amxamxldni845z.R.inc(14059);return getTypeArguments(bound, toClass, subtypeVarAssigns);
                }
            }}

            }__CLR4_4_1amxamxldni845z.R.inc(14060);return null;
        }
        // */

        }__CLR4_4_1amxamxldni845z.R.inc(14061);throw new IllegalStateException("found an unhandled type: " + type);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Return a map of the type arguments of a parameterized type in the context of <code>toClass</code>. </p>
     *
     * @param parameterizedType the parameterized type
     * @param toClass the class
     * @param subtypeVarAssigns a map with type variables
     * @return the map with type arguments
     */
    private static Map<TypeVariable<?>, Type> getTypeArguments(
            final ParameterizedType parameterizedType, final Class<?> toClass,
            final Map<TypeVariable<?>, Type> subtypeVarAssigns) {try{__CLR4_4_1amxamxldni845z.R.inc(14062);
        __CLR4_4_1amxamxldni845z.R.inc(14063);final Class<?> cls = getRawType(parameterizedType);

        // make sure they're assignable
        __CLR4_4_1amxamxldni845z.R.inc(14064);if ((((!isAssignable(cls, toClass))&&(__CLR4_4_1amxamxldni845z.R.iget(14065)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14066)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14067);return null;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14068);final Type ownerType = parameterizedType.getOwnerType();
        __CLR4_4_1amxamxldni845z.R.inc(14069);Map<TypeVariable<?>, Type> typeVarAssigns;

        __CLR4_4_1amxamxldni845z.R.inc(14070);if ((((ownerType instanceof ParameterizedType)&&(__CLR4_4_1amxamxldni845z.R.iget(14071)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14072)==0&false))) {{
            // get the owner type arguments first
            __CLR4_4_1amxamxldni845z.R.inc(14073);final ParameterizedType parameterizedOwnerType = (ParameterizedType) ownerType;
            __CLR4_4_1amxamxldni845z.R.inc(14074);typeVarAssigns = getTypeArguments(parameterizedOwnerType,
                    getRawType(parameterizedOwnerType), subtypeVarAssigns);
        } }else {{
            // no owner, prep the type variable assignments map
            __CLR4_4_1amxamxldni845z.R.inc(14075);typeVarAssigns = (((subtypeVarAssigns == null )&&(__CLR4_4_1amxamxldni845z.R.iget(14076)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14077)==0&false))? new HashMap<TypeVariable<?>, Type>()
                    : new HashMap<TypeVariable<?>, Type>(subtypeVarAssigns);
        }

        // get the subject parameterized type's arguments
        }__CLR4_4_1amxamxldni845z.R.inc(14078);final Type[] typeArgs = parameterizedType.getActualTypeArguments();
        // and get the corresponding type variables from the raw class
        __CLR4_4_1amxamxldni845z.R.inc(14079);final TypeVariable<?>[] typeParams = cls.getTypeParameters();

        // map the arguments to their respective type variables
        __CLR4_4_1amxamxldni845z.R.inc(14080);for (int i = 0; (((i < typeParams.length)&&(__CLR4_4_1amxamxldni845z.R.iget(14081)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14082)==0&false)); i++) {{
            __CLR4_4_1amxamxldni845z.R.inc(14083);final Type typeArg = typeArgs[i];
            __CLR4_4_1amxamxldni845z.R.inc(14084);typeVarAssigns.put(typeParams[i], (((typeVarAssigns.containsKey(typeArg) )&&(__CLR4_4_1amxamxldni845z.R.iget(14085)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14086)==0&false))? typeVarAssigns
                    .get(typeArg) : typeArg);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14087);if ((((toClass.equals(cls))&&(__CLR4_4_1amxamxldni845z.R.iget(14088)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14089)==0&false))) {{
            // target class has been reached. Done.
            __CLR4_4_1amxamxldni845z.R.inc(14090);return typeVarAssigns;
        }

        // walk the inheritance hierarchy until the target class is reached
        }__CLR4_4_1amxamxldni845z.R.inc(14091);return getTypeArguments(getClosestParentType(cls, toClass), toClass, typeVarAssigns);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Return a map of the type arguments of a class in the context of <code>toClass</code>. </p>
     *
     * @param cls the class in question
     * @param toClass the context class
     * @param subtypeVarAssigns a map with type variables
     * @return the map with type arguments
     */
    private static Map<TypeVariable<?>, Type> getTypeArguments(Class<?> cls, final Class<?> toClass,
            final Map<TypeVariable<?>, Type> subtypeVarAssigns) {try{__CLR4_4_1amxamxldni845z.R.inc(14092);
        // make sure they're assignable
        __CLR4_4_1amxamxldni845z.R.inc(14093);if ((((!isAssignable(cls, toClass))&&(__CLR4_4_1amxamxldni845z.R.iget(14094)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14095)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14096);return null;
        }

        // can't work with primitives
        }__CLR4_4_1amxamxldni845z.R.inc(14097);if ((((cls.isPrimitive())&&(__CLR4_4_1amxamxldni845z.R.iget(14098)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14099)==0&false))) {{
            // both classes are primitives?
            __CLR4_4_1amxamxldni845z.R.inc(14100);if ((((toClass.isPrimitive())&&(__CLR4_4_1amxamxldni845z.R.iget(14101)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14102)==0&false))) {{
                // dealing with widening here. No type arguments to be
                // harvested with these two types.
                __CLR4_4_1amxamxldni845z.R.inc(14103);return new HashMap<TypeVariable<?>, Type>();
            }

            // work with wrapper the wrapper class instead of the primitive
            }__CLR4_4_1amxamxldni845z.R.inc(14104);cls = ClassUtils.primitiveToWrapper(cls);
        }

        // create a copy of the incoming map, or an empty one if it's null
        }__CLR4_4_1amxamxldni845z.R.inc(14105);final HashMap<TypeVariable<?>, Type> typeVarAssigns = (((subtypeVarAssigns == null )&&(__CLR4_4_1amxamxldni845z.R.iget(14106)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14107)==0&false))? new HashMap<TypeVariable<?>, Type>()
                : new HashMap<TypeVariable<?>, Type>(subtypeVarAssigns);

        // has target class been reached?
        __CLR4_4_1amxamxldni845z.R.inc(14108);if ((((toClass.equals(cls))&&(__CLR4_4_1amxamxldni845z.R.iget(14109)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14110)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14111);return typeVarAssigns;
        }

        // walk the inheritance hierarchy until the target class is reached
        }__CLR4_4_1amxamxldni845z.R.inc(14112);return getTypeArguments(getClosestParentType(cls, toClass), toClass, typeVarAssigns);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Tries to determine the type arguments of a class/interface based on a
     * super parameterized type's type arguments. This method is the inverse of
     * {@link #getTypeArguments(Type, Class)} which gets a class/interface's
     * type arguments based on a subtype. It is far more limited in determining
     * the type arguments for the subject class's type variables in that it can
     * only determine those parameters that map from the subject {@link Class}
     * object to the supertype. </p> <p> Example: {@link java.util.TreeSet
     * TreeSet} sets its parameter as the parameter for
     * {@link java.util.NavigableSet NavigableSet}, which in turn sets the
     * parameter of {@link java.util.SortedSet}, which in turn sets the
     * parameter of {@link Set}, which in turn sets the parameter of
     * {@link java.util.Collection}, which in turn sets the parameter of
     * {@link java.lang.Iterable}. Since <code>TreeSet</code>'s parameter maps
     * (indirectly) to <code>Iterable</code>'s parameter, it will be able to
     * determine that based on the super type <code>Iterable<? extends
     * Map<Integer,? extends Collection<?>>></code>, the parameter of
     * <code>TreeSet</code> is <code>? extends Map<Integer,? extends
     * Collection<?>></code>. </p>
     *
     * @param cls the class whose type parameters are to be determined
     * @param superType the super type from which <code>cls</code>'s type
     * arguments are to be determined
     * @return a map of the type assignments that could be determined for the
     * type variables in each type in the inheritance hierarchy from
     * <code>type</code> to <code>toClass</code> inclusive.
     */
    public static Map<TypeVariable<?>, Type> determineTypeArguments(final Class<?> cls,
            final ParameterizedType superType) {try{__CLR4_4_1amxamxldni845z.R.inc(14113);
        __CLR4_4_1amxamxldni845z.R.inc(14114);final Class<?> superClass = getRawType(superType);

        // compatibility check
        __CLR4_4_1amxamxldni845z.R.inc(14115);if ((((!isAssignable(cls, superClass))&&(__CLR4_4_1amxamxldni845z.R.iget(14116)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14117)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14118);return null;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14119);if ((((cls.equals(superClass))&&(__CLR4_4_1amxamxldni845z.R.iget(14120)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14121)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14122);return getTypeArguments(superType, superClass, null);
        }

        // get the next class in the inheritance hierarchy
        }__CLR4_4_1amxamxldni845z.R.inc(14123);final Type midType = getClosestParentType(cls, superClass);

        // can only be a class or a parameterized type
        __CLR4_4_1amxamxldni845z.R.inc(14124);if ((((midType instanceof Class<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(14125)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14126)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14127);return determineTypeArguments((Class<?>) midType, superType);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14128);final ParameterizedType midParameterizedType = (ParameterizedType) midType;
        __CLR4_4_1amxamxldni845z.R.inc(14129);final Class<?> midClass = getRawType(midParameterizedType);
        // get the type variables of the mid class that map to the type
        // arguments of the super class
        __CLR4_4_1amxamxldni845z.R.inc(14130);final Map<TypeVariable<?>, Type> typeVarAssigns = determineTypeArguments(midClass, superType);
        // map the arguments of the mid type to the class type variables
        __CLR4_4_1amxamxldni845z.R.inc(14131);mapTypeVariablesToArguments(cls, midParameterizedType, typeVarAssigns);

        __CLR4_4_1amxamxldni845z.R.inc(14132);return typeVarAssigns;
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p>Performs a mapping of type variables.</p>
     *
     * @param <T> the generic type of the class in question
     * @param cls the class in question
     * @param parameterizedType the parameterized type
     * @param typeVarAssigns the map to be filled
     */
    private static <T> void mapTypeVariablesToArguments(final Class<T> cls,
            final ParameterizedType parameterizedType, final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_4_1amxamxldni845z.R.inc(14133);
        // capture the type variables from the owner type that have assignments
        __CLR4_4_1amxamxldni845z.R.inc(14134);final Type ownerType = parameterizedType.getOwnerType();

        __CLR4_4_1amxamxldni845z.R.inc(14135);if ((((ownerType instanceof ParameterizedType)&&(__CLR4_4_1amxamxldni845z.R.iget(14136)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14137)==0&false))) {{
            // recursion to make sure the owner's owner type gets processed
            __CLR4_4_1amxamxldni845z.R.inc(14138);mapTypeVariablesToArguments(cls, (ParameterizedType) ownerType, typeVarAssigns);
        }

        // parameterizedType is a generic interface/class (or it's in the owner
        // hierarchy of said interface/class) implemented/extended by the class
        // cls. Find out which type variables of cls are type arguments of
        // parameterizedType:
        }__CLR4_4_1amxamxldni845z.R.inc(14139);final Type[] typeArgs = parameterizedType.getActualTypeArguments();

        // of the cls's type variables that are arguments of parameterizedType,
        // find out which ones can be determined from the super type's arguments
        __CLR4_4_1amxamxldni845z.R.inc(14140);final TypeVariable<?>[] typeVars = getRawType(parameterizedType).getTypeParameters();

        // use List view of type parameters of cls so the contains() method can be used:
        __CLR4_4_1amxamxldni845z.R.inc(14141);final List<TypeVariable<Class<T>>> typeVarList = Arrays.asList(cls
                .getTypeParameters());

        __CLR4_4_1amxamxldni845z.R.inc(14142);for (int i = 0; (((i < typeArgs.length)&&(__CLR4_4_1amxamxldni845z.R.iget(14143)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14144)==0&false)); i++) {{
            __CLR4_4_1amxamxldni845z.R.inc(14145);final TypeVariable<?> typeVar = typeVars[i];
            __CLR4_4_1amxamxldni845z.R.inc(14146);final Type typeArg = typeArgs[i];

            // argument of parameterizedType is a type variable of cls
            __CLR4_4_1amxamxldni845z.R.inc(14147);if ((((typeVarList.contains(typeArg)
            // type variable of parameterizedType has an assignment in
                    // the super type.
                    && typeVarAssigns.containsKey(typeVar))&&(__CLR4_4_1amxamxldni845z.R.iget(14148)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14149)==0&false))) {{
                // map the assignment to the cls's type variable
                __CLR4_4_1amxamxldni845z.R.inc(14150);typeVarAssigns.put((TypeVariable<?>) typeArg, typeVarAssigns.get(typeVar));
            }
        }}
    }}finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Closest parent type? Closest to what? The closest parent type to the
     * super class specified by <code>superClass</code>. </p>
     *
     * @param cls the class in question
     * @param superClass the super class
     * @return the closes parent type
     */
    private static Type getClosestParentType(final Class<?> cls, final Class<?> superClass) {try{__CLR4_4_1amxamxldni845z.R.inc(14151);
        // only look at the interfaces if the super class is also an interface
        __CLR4_4_1amxamxldni845z.R.inc(14152);if ((((superClass.isInterface())&&(__CLR4_4_1amxamxldni845z.R.iget(14153)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14154)==0&false))) {{
            // get the generic interfaces of the subject class
            __CLR4_4_1amxamxldni845z.R.inc(14155);final Type[] interfaceTypes = cls.getGenericInterfaces();
            // will hold the best generic interface match found
            __CLR4_4_1amxamxldni845z.R.inc(14156);Type genericInterface = null;

            // find the interface closest to the super class
            __CLR4_4_1amxamxldni845z.R.inc(14157);for (final Type midType : interfaceTypes) {{
                __CLR4_4_1amxamxldni845z.R.inc(14158);Class<?> midClass = null;

                __CLR4_4_1amxamxldni845z.R.inc(14159);if ((((midType instanceof ParameterizedType)&&(__CLR4_4_1amxamxldni845z.R.iget(14160)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14161)==0&false))) {{
                    __CLR4_4_1amxamxldni845z.R.inc(14162);midClass = getRawType((ParameterizedType) midType);
                } }else {__CLR4_4_1amxamxldni845z.R.inc(14163);if ((((midType instanceof Class<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(14164)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14165)==0&false))) {{
                    __CLR4_4_1amxamxldni845z.R.inc(14166);midClass = (Class<?>) midType;
                } }else {{
                    __CLR4_4_1amxamxldni845z.R.inc(14167);throw new IllegalStateException("Unexpected generic"
                            + " interface type found: " + midType);
                }

                // check if this interface is further up the inheritance chain
                // than the previously found match
                }}__CLR4_4_1amxamxldni845z.R.inc(14168);if ((((isAssignable(midClass, superClass)
                        && isAssignable(genericInterface, (Type) midClass))&&(__CLR4_4_1amxamxldni845z.R.iget(14169)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14170)==0&false))) {{
                    __CLR4_4_1amxamxldni845z.R.inc(14171);genericInterface = midType;
                }
            }}

            // found a match?
            }__CLR4_4_1amxamxldni845z.R.inc(14172);if ((((genericInterface != null)&&(__CLR4_4_1amxamxldni845z.R.iget(14173)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14174)==0&false))) {{
                __CLR4_4_1amxamxldni845z.R.inc(14175);return genericInterface;
            }
        }}

        // none of the interfaces were descendants of the target class, so the
        // super class has to be one, instead
        }__CLR4_4_1amxamxldni845z.R.inc(14176);return cls.getGenericSuperclass();
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Checks if the given value can be assigned to the target type
     * following the Java generics rules. </p>
     *
     * @param value the value to be checked
     * @param type the target type
     * @return true of <code>value</code> is an instance of <code>type</code>.
     */
    public static boolean isInstance(final Object value, final Type type) {try{__CLR4_4_1amxamxldni845z.R.inc(14177);
        __CLR4_4_1amxamxldni845z.R.inc(14178);if ((((type == null)&&(__CLR4_4_1amxamxldni845z.R.iget(14179)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14180)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14181);return false;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14182);return (((value == null )&&(__CLR4_4_1amxamxldni845z.R.iget(14183)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14184)==0&false))? !(type instanceof Class<?>) || !((Class<?>) type).isPrimitive()
                : isAssignable(value.getClass(), type, null);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> This method strips out the redundant upper bound types in type
     * variable types and wildcard types (or it would with wildcard types if
     * multiple upper bounds were allowed). </p> <p> Example: with the variable
     * type declaration:
     *
     * <pre> &lt;K extends java.util.Collection&lt;String&gt; &amp;
     * java.util.List&lt;String&gt;&gt; </pre>
     *
     * since <code>List</code> is a subinterface of <code>Collection</code>,
     * this method will return the bounds as if the declaration had been:
     *
     * <pre> &lt;K extends java.util.List&lt;String&gt;&gt; </pre>
     *
     * </p>
     *
     * @param bounds an array of types representing the upper bounds of either
     * <code>WildcardType</code> or <code>TypeVariable</code>.
     * @return an array containing the values from <code>bounds</code> minus the
     * redundant types.
     */
    public static Type[] normalizeUpperBounds(final Type[] bounds) {try{__CLR4_4_1amxamxldni845z.R.inc(14185);
        // don't bother if there's only one (or none) type
        __CLR4_4_1amxamxldni845z.R.inc(14186);if ((((bounds.length < 2)&&(__CLR4_4_1amxamxldni845z.R.iget(14187)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14188)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14189);return bounds;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14190);final Set<Type> types = new HashSet<Type>(bounds.length);

        __CLR4_4_1amxamxldni845z.R.inc(14191);for (final Type type1 : bounds) {{
            __CLR4_4_1amxamxldni845z.R.inc(14192);boolean subtypeFound = false;

            __CLR4_4_1amxamxldni845z.R.inc(14193);for (final Type type2 : bounds) {{
                __CLR4_4_1amxamxldni845z.R.inc(14194);if ((((type1 != type2 && isAssignable(type2, type1, null))&&(__CLR4_4_1amxamxldni845z.R.iget(14195)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14196)==0&false))) {{
                    __CLR4_4_1amxamxldni845z.R.inc(14197);subtypeFound = true;
                    __CLR4_4_1amxamxldni845z.R.inc(14198);break;
                }
            }}

            }__CLR4_4_1amxamxldni845z.R.inc(14199);if ((((!subtypeFound)&&(__CLR4_4_1amxamxldni845z.R.iget(14200)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14201)==0&false))) {{
                __CLR4_4_1amxamxldni845z.R.inc(14202);types.add(type1);
            }
        }}

        }__CLR4_4_1amxamxldni845z.R.inc(14203);return types.toArray(new Type[types.size()]);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Returns an array containing the sole type of {@link Object} if
     * {@link TypeVariable#getBounds()} returns an empty array. Otherwise, it
     * returns the result of <code>TypeVariable.getBounds()</code> passed into
     * {@link #normalizeUpperBounds}. </p>
     *
     * @param typeVariable the subject type variable
     * @return a non-empty array containing the bounds of the type variable.
     */
    public static Type[] getImplicitBounds(final TypeVariable<?> typeVariable) {try{__CLR4_4_1amxamxldni845z.R.inc(14204);
        __CLR4_4_1amxamxldni845z.R.inc(14205);final Type[] bounds = typeVariable.getBounds();

        __CLR4_4_1amxamxldni845z.R.inc(14206);return (((bounds.length == 0 )&&(__CLR4_4_1amxamxldni845z.R.iget(14207)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14208)==0&false))? new Type[] { Object.class } : normalizeUpperBounds(bounds);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Returns an array containing the sole value of {@link Object} if
     * {@link WildcardType#getUpperBounds()} returns an empty array. Otherwise,
     * it returns the result of <code>WildcardType.getUpperBounds()</code>
     * passed into {@link #normalizeUpperBounds}. </p>
     *
     * @param wildcardType the subject wildcard type
     * @return a non-empty array containing the upper bounds of the wildcard
     * type.
     */
    public static Type[] getImplicitUpperBounds(final WildcardType wildcardType) {try{__CLR4_4_1amxamxldni845z.R.inc(14209);
        __CLR4_4_1amxamxldni845z.R.inc(14210);final Type[] bounds = wildcardType.getUpperBounds();

        __CLR4_4_1amxamxldni845z.R.inc(14211);return (((bounds.length == 0 )&&(__CLR4_4_1amxamxldni845z.R.iget(14212)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14213)==0&false))? new Type[] { Object.class } : normalizeUpperBounds(bounds);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Returns an array containing a single value of <code>null</code> if
     * {@link WildcardType#getLowerBounds()} returns an empty array. Otherwise,
     * it returns the result of <code>WildcardType.getLowerBounds()</code>. </p>
     *
     * @param wildcardType the subject wildcard type
     * @return a non-empty array containing the lower bounds of the wildcard
     * type.
     */
    public static Type[] getImplicitLowerBounds(final WildcardType wildcardType) {try{__CLR4_4_1amxamxldni845z.R.inc(14214);
        __CLR4_4_1amxamxldni845z.R.inc(14215);final Type[] bounds = wildcardType.getLowerBounds();

        __CLR4_4_1amxamxldni845z.R.inc(14216);return (((bounds.length == 0 )&&(__CLR4_4_1amxamxldni845z.R.iget(14217)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14218)==0&false))? new Type[] { null } : bounds;
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Determines whether or not specified types satisfy the bounds of their
     * mapped type variables. When a type parameter extends another (such as
     * <code><T, S extends T></code>), uses another as a type parameter (such as
     * <code><T, S extends Comparable<T></code>), or otherwise depends on
     * another type variable to be specified, the dependencies must be included
     * in <code>typeVarAssigns</code>. </p>
     *
     * @param typeVarAssigns specifies the potential types to be assigned to the
     * type variables.
     * @return whether or not the types can be assigned to their respective type
     * variables.
     */
    public static boolean typesSatisfyVariables(final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_4_1amxamxldni845z.R.inc(14219);
        // all types must be assignable to all the bounds of the their mapped
        // type variable.
        __CLR4_4_1amxamxldni845z.R.inc(14220);for (final Map.Entry<TypeVariable<?>, Type> entry : typeVarAssigns.entrySet()) {{
            __CLR4_4_1amxamxldni845z.R.inc(14221);final TypeVariable<?> typeVar = entry.getKey();
            __CLR4_4_1amxamxldni845z.R.inc(14222);final Type type = entry.getValue();

            __CLR4_4_1amxamxldni845z.R.inc(14223);for (final Type bound : getImplicitBounds(typeVar)) {{
                __CLR4_4_1amxamxldni845z.R.inc(14224);if ((((!isAssignable(type, substituteTypeVariables(bound, typeVarAssigns),
                        typeVarAssigns))&&(__CLR4_4_1amxamxldni845z.R.iget(14225)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14226)==0&false))) {{
                    __CLR4_4_1amxamxldni845z.R.inc(14227);return false;
                }
            }}
        }}

        }__CLR4_4_1amxamxldni845z.R.inc(14228);return true;
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Transforms the passed in type to a {@code Class} object. Type-checking method of convenience. </p>
     *
     * @param parameterizedType the type to be converted
     * @return the corresponding {@code Class} object
     * @throws IllegalStateException if the conversion fails
     */
    private static Class<?> getRawType(final ParameterizedType parameterizedType) {try{__CLR4_4_1amxamxldni845z.R.inc(14229);
        __CLR4_4_1amxamxldni845z.R.inc(14230);final Type rawType = parameterizedType.getRawType();

        // check if raw type is a Class object
        // not currently necessary, but since the return type is Type instead of
        // Class, there's enough reason to believe that future versions of Java
        // may return other Type implementations. And type-safety checking is
        // rarely a bad idea.
        __CLR4_4_1amxamxldni845z.R.inc(14231);if ((((!(rawType instanceof Class<?>))&&(__CLR4_4_1amxamxldni845z.R.iget(14232)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14233)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14234);throw new IllegalStateException("Wait... What!? Type of rawType: " + rawType);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14235);return (Class<?>) rawType;
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * <p> Get the raw type of a Java type, given its context. Primarily for use
     * with {@link TypeVariable}s and {@link GenericArrayType}s, or when you do
     * not know the runtime type of <code>type</code>: if you know you have a
     * {@link Class} instance, it is already raw; if you know you have a
     * {@link ParameterizedType}, its raw type is only a method call away. </p>
     *
     * @param type to resolve
     * @param assigningType type to be resolved against
     * @return the resolved <code>Class</code> object or <code>null</code> if
     * the type could not be resolved
     */
    public static Class<?> getRawType(final Type type, final Type assigningType) {try{__CLR4_4_1amxamxldni845z.R.inc(14236);
        __CLR4_4_1amxamxldni845z.R.inc(14237);if ((((type instanceof Class<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(14238)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14239)==0&false))) {{
            // it is raw, no problem
            __CLR4_4_1amxamxldni845z.R.inc(14240);return (Class<?>) type;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14241);if ((((type instanceof ParameterizedType)&&(__CLR4_4_1amxamxldni845z.R.iget(14242)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14243)==0&false))) {{
            // simple enough to get the raw type of a ParameterizedType
            __CLR4_4_1amxamxldni845z.R.inc(14244);return getRawType((ParameterizedType) type);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14245);if ((((type instanceof TypeVariable<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(14246)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14247)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14248);if ((((assigningType == null)&&(__CLR4_4_1amxamxldni845z.R.iget(14249)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14250)==0&false))) {{
                __CLR4_4_1amxamxldni845z.R.inc(14251);return null;
            }

            // get the entity declaring this type variable
            }__CLR4_4_1amxamxldni845z.R.inc(14252);final Object genericDeclaration = ((TypeVariable<?>) type).getGenericDeclaration();

            // can't get the raw type of a method- or constructor-declared type
            // variable
            __CLR4_4_1amxamxldni845z.R.inc(14253);if ((((!(genericDeclaration instanceof Class<?>))&&(__CLR4_4_1amxamxldni845z.R.iget(14254)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14255)==0&false))) {{
                __CLR4_4_1amxamxldni845z.R.inc(14256);return null;
            }

            // get the type arguments for the declaring class/interface based
            // on the enclosing type
            }__CLR4_4_1amxamxldni845z.R.inc(14257);final Map<TypeVariable<?>, Type> typeVarAssigns = getTypeArguments(assigningType,
                    (Class<?>) genericDeclaration);

            // enclosingType has to be a subclass (or subinterface) of the
            // declaring type
            __CLR4_4_1amxamxldni845z.R.inc(14258);if ((((typeVarAssigns == null)&&(__CLR4_4_1amxamxldni845z.R.iget(14259)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14260)==0&false))) {{
                __CLR4_4_1amxamxldni845z.R.inc(14261);return null;
            }

            // get the argument assigned to this type variable
            }__CLR4_4_1amxamxldni845z.R.inc(14262);final Type typeArgument = typeVarAssigns.get(type);

            __CLR4_4_1amxamxldni845z.R.inc(14263);if ((((typeArgument == null)&&(__CLR4_4_1amxamxldni845z.R.iget(14264)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14265)==0&false))) {{
                __CLR4_4_1amxamxldni845z.R.inc(14266);return null;
            }

            // get the argument for this type variable
            }__CLR4_4_1amxamxldni845z.R.inc(14267);return getRawType(typeArgument, assigningType);
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14268);if ((((type instanceof GenericArrayType)&&(__CLR4_4_1amxamxldni845z.R.iget(14269)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14270)==0&false))) {{
            // get raw component type
            __CLR4_4_1amxamxldni845z.R.inc(14271);final Class<?> rawComponentType = getRawType(((GenericArrayType) type)
                    .getGenericComponentType(), assigningType);

            // create array type from raw component type and return its class
            __CLR4_4_1amxamxldni845z.R.inc(14272);return Array.newInstance(rawComponentType, 0).getClass();
        }

        // (hand-waving) this is not the method you're looking for
        }__CLR4_4_1amxamxldni845z.R.inc(14273);if ((((type instanceof WildcardType)&&(__CLR4_4_1amxamxldni845z.R.iget(14274)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14275)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14276);return null;
        }

        }__CLR4_4_1amxamxldni845z.R.inc(14277);throw new IllegalArgumentException("unknown type: " + type);
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * Learn whether the specified type denotes an array type.
     * @param type the type to be checked
     * @return <code>true</code> if <code>type</code> is an array class or a {@link GenericArrayType}.
     */
    public static boolean isArrayType(final Type type) {try{__CLR4_4_1amxamxldni845z.R.inc(14278);
        __CLR4_4_1amxamxldni845z.R.inc(14279);return type instanceof GenericArrayType || type instanceof Class<?> && ((Class<?>) type).isArray();
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

    /**
     * Get the array component type of <code>type</code>.
     * @param type the type to be checked
     * @return component type or null if type is not an array type
     */
    public static Type getArrayComponentType(final Type type) {try{__CLR4_4_1amxamxldni845z.R.inc(14280);
        __CLR4_4_1amxamxldni845z.R.inc(14281);if ((((type instanceof Class<?>)&&(__CLR4_4_1amxamxldni845z.R.iget(14282)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14283)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14284);final Class<?> clazz = (Class<?>) type;
            __CLR4_4_1amxamxldni845z.R.inc(14285);return (((clazz.isArray() )&&(__CLR4_4_1amxamxldni845z.R.iget(14286)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14287)==0&false))? clazz.getComponentType() : null;
        }
        }__CLR4_4_1amxamxldni845z.R.inc(14288);if ((((type instanceof GenericArrayType)&&(__CLR4_4_1amxamxldni845z.R.iget(14289)!=0|true))||(__CLR4_4_1amxamxldni845z.R.iget(14290)==0&false))) {{
            __CLR4_4_1amxamxldni845z.R.inc(14291);return ((GenericArrayType) type).getGenericComponentType();
        }
        }__CLR4_4_1amxamxldni845z.R.inc(14292);return null;
    }finally{__CLR4_4_1amxamxldni845z.R.flushNeeded();}}

}
