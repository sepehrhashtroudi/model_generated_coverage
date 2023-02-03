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

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ClassUtils;

/**
 * Utilities for working with fields by reflection. Adapted and refactored from the dormant [reflect] Commons sandbox
 * component.
 * <p>
 * The ability is provided to break the scoping restrictions coded by the programmer. This can allow fields to be
 * changed that shouldn't be. This facility should be used with care.
 * 
 * @since 2.5
 * @version $Id$
 */
public class FieldUtils {public static class __CLR4_4_1a9ya9yldnigg68{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,13540,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * FieldUtils instances should NOT be constructed in standard programming.
     * <p>
     * This constructor is public to permit tools that require a JavaBean instance to operate.
     */
    public FieldUtils() {
        super();__CLR4_4_1a9ya9yldnigg68.R.inc(13319);try{__CLR4_4_1a9ya9yldnigg68.R.inc(13318);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Gets an accessible <code>Field</code> by name respecting scope. Superclasses/interfaces will be considered.
     * 
     * @param cls
     *            the class to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @return the Field object
     * @throws IllegalArgumentException
     *             if the class or field name is null
     */
    public static Field getField(final Class<?> cls, final String fieldName) {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13320);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13321);final Field field = getField(cls, fieldName, false);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13322);MemberUtils.setAccessibleWorkaround(field);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13323);return field;
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Gets an accessible <code>Field</code> by name breaking scope if requested. Superclasses/interfaces will be
     * considered.
     * 
     * @param cls
     *            the class to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method. <code>False</code>
     *            will only match public fields.
     * @return the Field object
     * @throws IllegalArgumentException
     *             if the class or field name is null
     */
    public static Field getField(final Class<?> cls, final String fieldName, final boolean forceAccess) {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13324);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13325);if ((((cls == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13326)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13327)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13328);throw new IllegalArgumentException("The class must not be null");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13329);if ((((fieldName == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13330)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13331)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13332);throw new IllegalArgumentException("The field name must not be null");
        }
        // Sun Java 1.3 has a bugged implementation of getField hence we write the
        // code ourselves

        // getField() will return the Field object with the declaring class
        // set correctly to the class that declares the field. Thus requesting the
        // field on a subclass will return the field from the superclass.
        //
        // priority order for lookup:
        // searchclass private/protected/package/public
        // superclass protected/package/public
        // private/different package blocks access to further superclasses
        // implementedinterface public

        // check up the superclass hierarchy
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13333);for (Class<?> acls = cls; (((acls != null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13334)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13335)==0&false)); acls = acls.getSuperclass()) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13336);try {
                __CLR4_4_1a9ya9yldnigg68.R.inc(13337);final Field field = acls.getDeclaredField(fieldName);
                // getDeclaredField checks for non-public scopes as well
                // and it returns accurate results
                __CLR4_4_1a9ya9yldnigg68.R.inc(13338);if ((((!Modifier.isPublic(field.getModifiers()))&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13339)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13340)==0&false))) {{
                    __CLR4_4_1a9ya9yldnigg68.R.inc(13341);if ((((forceAccess)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13342)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13343)==0&false))) {{
                        __CLR4_4_1a9ya9yldnigg68.R.inc(13344);field.setAccessible(true);
                    } }else {{
                        __CLR4_4_1a9ya9yldnigg68.R.inc(13345);continue;
                    }
                }}
                }__CLR4_4_1a9ya9yldnigg68.R.inc(13346);return field;
            } catch (final NoSuchFieldException ex) { // NOPMD
                // ignore
            }
        }
        // check the public interface case. This must be manually searched for
        // incase there is a public supersuperclass field hidden by a private/package
        // superclass field.
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13347);Field match = null;
        __CLR4_4_1a9ya9yldnigg68.R.inc(13348);for (final Class<?> class1 : ClassUtils.getAllInterfaces(cls)) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13349);try {
                __CLR4_4_1a9ya9yldnigg68.R.inc(13350);final Field test = ((Class<?>) class1).getField(fieldName);
                __CLR4_4_1a9ya9yldnigg68.R.inc(13351);if ((((match != null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13352)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13353)==0&false))) {{
                    __CLR4_4_1a9ya9yldnigg68.R.inc(13354);throw new IllegalArgumentException("Reference to field " + fieldName + " is ambiguous relative to " + cls +
                            "; a matching field exists on two or more implemented interfaces.");
                }
                }__CLR4_4_1a9ya9yldnigg68.R.inc(13355);match = test;
            } catch (final NoSuchFieldException ex) { // NOPMD
                // ignore
            }
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13356);return match;
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Gets an accessible <code>Field</code> by name respecting scope. Only the specified class will be considered.
     * 
     * @param cls
     *            the class to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @return the Field object
     * @throws IllegalArgumentException
     *             if the class or field name is null
     */
    public static Field getDeclaredField(final Class<?> cls, final String fieldName) {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13357);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13358);return getDeclaredField(cls, fieldName, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Gets an accessible <code>Field</code> by name breaking scope if requested. Only the specified class will be
     * considered.
     * 
     * @param cls
     *            the class to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method. False will only
     *            match public fields.
     * @return the Field object
     * @throws IllegalArgumentException
     *             if the class or field name is null
     */
    public static Field getDeclaredField(final Class<?> cls, final String fieldName, final boolean forceAccess) {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13359);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13360);if ((((cls == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13361)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13362)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13363);throw new IllegalArgumentException("The class must not be null");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13364);if ((((fieldName == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13365)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13366)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13367);throw new IllegalArgumentException("The field name must not be null");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13368);try {
            // only consider the specified class by using getDeclaredField()
            __CLR4_4_1a9ya9yldnigg68.R.inc(13369);final Field field = cls.getDeclaredField(fieldName);
            __CLR4_4_1a9ya9yldnigg68.R.inc(13370);if ((((!MemberUtils.isAccessible(field))&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13371)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13372)==0&false))) {{
                __CLR4_4_1a9ya9yldnigg68.R.inc(13373);if ((((forceAccess)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13374)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13375)==0&false))) {{
                    __CLR4_4_1a9ya9yldnigg68.R.inc(13376);field.setAccessible(true);
                } }else {{
                    __CLR4_4_1a9ya9yldnigg68.R.inc(13377);return null;
                }
            }}
            }__CLR4_4_1a9ya9yldnigg68.R.inc(13378);return field;
        } catch (final NoSuchFieldException e) { // NOPMD
            // ignore
        }
        __CLR4_4_1a9ya9yldnigg68.R.inc(13379);return null;
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Gets all fields of the given class and its parents (if any).
     * 
     * @param cls
     *            the class to query
     * @return an array of Fields (maybe an empty array).
     * @since 3.2
     */
    public static Field[] getAllFields(Class<?> cls) {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13380);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13381);final List<Field> allFieldsList = getAllFieldsList(cls);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13382);return allFieldsList.toArray(new Field[allFieldsList.size()]);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Gets all fields of the given class and its parents (if any).
     * 
     * @param cls
     *            the class to query
     * @return an array of Fields (maybe an empty array).
     * @since 3.2
     */
    public static List<Field> getAllFieldsList(Class<?> cls) {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13383);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13384);if ((((cls == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13385)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13386)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13387);throw new IllegalArgumentException("The class must not be null");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13388);List<Field> allFields = new ArrayList<Field>();
        __CLR4_4_1a9ya9yldnigg68.R.inc(13389);Class<?> currentClass = cls;
        __CLR4_4_1a9ya9yldnigg68.R.inc(13390);while ((((currentClass != null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13391)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13392)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13393);final Field[] declaredFields = currentClass.getDeclaredFields();
            __CLR4_4_1a9ya9yldnigg68.R.inc(13394);for (Field field : declaredFields) {{
                __CLR4_4_1a9ya9yldnigg68.R.inc(13395);allFields.add(field);
            }
            }__CLR4_4_1a9ya9yldnigg68.R.inc(13396);currentClass = currentClass.getSuperclass();
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13397);return allFields;
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Reads an accessible static Field.
     * 
     * @param field
     *            to read
     * @return the field value
     * @throws IllegalArgumentException
     *             if the field is null or not static
     * @throws IllegalAccessException
     *             if the field is not accessible
     */
    public static Object readStaticField(final Field field) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13398);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13399);return readStaticField(field, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Reads a static Field.
     * 
     * @param field
     *            to read
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method.
     * @return the field value
     * @throws IllegalArgumentException
     *             if the field is null or not static
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static Object readStaticField(final Field field, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13400);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13401);if ((((field == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13402)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13403)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13404);throw new IllegalArgumentException("The field must not be null");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13405);if ((((!Modifier.isStatic(field.getModifiers()))&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13406)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13407)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13408);throw new IllegalArgumentException("The field '" + field.getName() + "' is not static");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13409);return readField(field, (Object) null, forceAccess);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Reads the named public static field. Superclasses will be considered.
     * 
     * @param cls
     *            the class to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @return the value of the field
     * @throws IllegalArgumentException
     *             if the class is null, the field name is null or if the field could not be found
     * @throws IllegalAccessException
     *             if the field is not accessible
     */
    public static Object readStaticField(final Class<?> cls, final String fieldName) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13410);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13411);return readStaticField(cls, fieldName, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Reads the named static field. Superclasses will be considered.
     * 
     * @param cls
     *            the class to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method. <code>False</code>
     *            will only match public fields.
     * @return the Field object
     * @throws IllegalArgumentException
     *             if the class is null, the field name is null or if the field could not be found
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static Object readStaticField(final Class<?> cls, final String fieldName, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13412);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13413);final Field field = getField(cls, fieldName, forceAccess);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13414);if ((((field == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13415)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13416)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13417);throw new IllegalArgumentException("Cannot locate field " + fieldName + " on " + cls);
        }
        // already forced access above, don't repeat it here:
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13418);return readStaticField(field, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Gets a static Field value by name. The field must be public. Only the specified class will be considered.
     * 
     * @param cls
     *            the class to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @return the value of the field
     * @throws IllegalArgumentException
     *             if the class is null, the field name is null or if the field could not be found
     * @throws IllegalAccessException
     *             if the field is not accessible
     */
    public static Object readDeclaredStaticField(final Class<?> cls, final String fieldName) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13419);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13420);return readDeclaredStaticField(cls, fieldName, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Gets a static Field value by name. Only the specified class will be considered.
     * 
     * @param cls
     *            the class to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method. <code>False</code>
     *            will only match public fields.
     * @return the Field object
     * @throws IllegalArgumentException
     *             if the class is null, the field name is null or if the field could not be found
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static Object readDeclaredStaticField(final Class<?> cls, final String fieldName, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13421);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13422);final Field field = getDeclaredField(cls, fieldName, forceAccess);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13423);if ((((field == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13424)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13425)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13426);throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + "." + fieldName);
        }
        // already forced access above, don't repeat it here:
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13427);return readStaticField(field, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Reads an accessible Field.
     * 
     * @param field
     *            the field to use
     * @param target
     *            the object to call on, may be null for static fields
     * @return the field value
     * @throws IllegalArgumentException
     *             if the field is null
     * @throws IllegalAccessException
     *             if the field is not accessible
     */
    public static Object readField(final Field field, final Object target) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13428);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13429);return readField(field, target, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Reads a Field.
     * 
     * @param field
     *            the field to use
     * @param target
     *            the object to call on, may be null for static fields
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method.
     * @return the field value
     * @throws IllegalArgumentException
     *             if the field is null
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static Object readField(final Field field, final Object target, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13430);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13431);if ((((field == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13432)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13433)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13434);throw new IllegalArgumentException("The field must not be null");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13435);if ((((forceAccess && !field.isAccessible())&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13436)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13437)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13438);field.setAccessible(true);
        } }else {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13439);MemberUtils.setAccessibleWorkaround(field);
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13440);return field.get(target);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Reads the named public field. Superclasses will be considered.
     * 
     * @param target
     *            the object to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @return the value of the field
     * @throws IllegalArgumentException
     *             if the class or field name is null
     * @throws IllegalAccessException
     *             if the named field is not public
     */
    public static Object readField(final Object target, final String fieldName) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13441);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13442);return readField(target, fieldName, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Reads the named field. Superclasses will be considered.
     * 
     * @param target
     *            the object to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method. <code>False</code>
     *            will only match public fields.
     * @return the field value
     * @throws IllegalArgumentException
     *             if the class or field name is null
     * @throws IllegalAccessException
     *             if the named field is not made accessible
     */
    public static Object readField(final Object target, final String fieldName, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13443);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13444);if ((((target == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13445)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13446)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13447);throw new IllegalArgumentException("target object must not be null");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13448);final Class<?> cls = target.getClass();
        __CLR4_4_1a9ya9yldnigg68.R.inc(13449);final Field field = getField(cls, fieldName, forceAccess);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13450);if ((((field == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13451)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13452)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13453);throw new IllegalArgumentException("Cannot locate field " + fieldName + " on " + cls);
        }
        // already forced access above, don't repeat it here:
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13454);return readField(field, target);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Reads the named public field. Only the class of the specified object will be considered.
     * 
     * @param target
     *            the object to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @return the value of the field
     * @throws IllegalArgumentException
     *             if the class or field name is null
     * @throws IllegalAccessException
     *             if the named field is not public
     */
    public static Object readDeclaredField(final Object target, final String fieldName) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13455);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13456);return readDeclaredField(target, fieldName, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * <p<>Gets a Field value by name. Only the class of the specified object will be considered.
     * 
     * @param target
     *            the object to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method. <code>False</code>
     *            will only match public fields.
     * @return the Field object
     * @throws IllegalArgumentException
     *             if <code>target</code> or <code>fieldName</code> is null
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static Object readDeclaredField(final Object target, final String fieldName, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13457);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13458);if ((((target == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13459)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13460)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13461);throw new IllegalArgumentException("target object must not be null");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13462);final Class<?> cls = target.getClass();
        __CLR4_4_1a9ya9yldnigg68.R.inc(13463);final Field field = getDeclaredField(cls, fieldName, forceAccess);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13464);if ((((field == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13465)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13466)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13467);throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + "." + fieldName);
        }
        // already forced access above, don't repeat it here:
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13468);return readField(field, target);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Writes a public static Field.
     * 
     * @param field
     *            to write
     * @param value
     *            to set
     * @throws IllegalArgumentException
     *             if the field is null or not static
     * @throws IllegalAccessException
     *             if the field is not public or is final
     */
    public static void writeStaticField(final Field field, final Object value) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13469);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13470);writeStaticField(field, value, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Writes a static Field.
     * 
     * @param field
     *            to write
     * @param value
     *            to set
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method. <code>False</code>
     *            will only match public fields.
     * @throws IllegalArgumentException
     *             if the field is null or not static
     * @throws IllegalAccessException
     *             if the field is not made accessible or is final
     */
    public static void writeStaticField(final Field field, final Object value, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13471);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13472);if ((((field == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13473)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13474)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13475);throw new IllegalArgumentException("The field must not be null");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13476);if ((((!Modifier.isStatic(field.getModifiers()))&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13477)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13478)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13479);throw new IllegalArgumentException("The field '" + field.getName() + "' is not static");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13480);writeField(field, (Object) null, value, forceAccess);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Writes a named public static Field. Superclasses will be considered.
     * 
     * @param cls
     *            Class on which the Field is to be found
     * @param fieldName
     *            to write
     * @param value
     *            to set
     * @throws IllegalArgumentException
     *             if the field cannot be located or is not static
     * @throws IllegalAccessException
     *             if the field is not public or is final
     */
    public static void writeStaticField(final Class<?> cls, final String fieldName, final Object value) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13481);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13482);writeStaticField(cls, fieldName, value, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Writes a named static Field. Superclasses will be considered.
     * 
     * @param cls
     *            Class on which the Field is to be found
     * @param fieldName
     *            to write
     * @param value
     *            to set
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method. <code>False</code>
     *            will only match public fields.
     * @throws IllegalArgumentException
     *             if the field cannot be located or is not static
     * @throws IllegalAccessException
     *             if the field is not made accessible or is final
     */
    public static void writeStaticField(final Class<?> cls, final String fieldName, final Object value, final boolean forceAccess)
            throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13483);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13484);final Field field = getField(cls, fieldName, forceAccess);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13485);if ((((field == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13486)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13487)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13488);throw new IllegalArgumentException("Cannot locate field " + fieldName + " on " + cls);
        }
        // already forced access above, don't repeat it here:
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13489);writeStaticField(field, value);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Writes a named public static Field. Only the specified class will be considered.
     * 
     * @param cls
     *            Class on which the Field is to be found
     * @param fieldName
     *            to write
     * @param value
     *            to set
     * @throws IllegalArgumentException
     *             if the field cannot be located or is not static
     * @throws IllegalAccessException
     *             if the field is not public or is final
     */
    public static void writeDeclaredStaticField(final Class<?> cls, final String fieldName, final Object value) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13490);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13491);writeDeclaredStaticField(cls, fieldName, value, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Writes a named static Field. Only the specified class will be considered.
     * 
     * @param cls
     *            Class on which the Field is to be found
     * @param fieldName
     *            to write
     * @param value
     *            to set
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method. <code>False</code>
     *            will only match public fields.
     * @throws IllegalArgumentException
     *             if the field cannot be located or is not static
     * @throws IllegalAccessException
     *             if the field is not made accessible or is final
     */
    public static void writeDeclaredStaticField(final Class<?> cls, final String fieldName, final Object value, final boolean forceAccess)
            throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13492);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13493);final Field field = getDeclaredField(cls, fieldName, forceAccess);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13494);if ((((field == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13495)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13496)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13497);throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + "." + fieldName);
        }
        // already forced access above, don't repeat it here:
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13498);writeField(field, (Object) null, value);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Writes an accessible field.
     * 
     * @param field
     *            to write
     * @param target
     *            the object to call on, may be null for static fields
     * @param value
     *            to set
     * @throws IllegalArgumentException
     *             if the field is null
     * @throws IllegalAccessException
     *             if the field is not accessible or is final
     */
    public static void writeField(final Field field, final Object target, final Object value) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13499);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13500);writeField(field, target, value, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Writes a field.
     * 
     * @param field
     *            to write
     * @param target
     *            the object to call on, may be null for static fields
     * @param value
     *            to set
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method. <code>False</code>
     *            will only match public fields.
     * @throws IllegalArgumentException
     *             if the field is null
     * @throws IllegalAccessException
     *             if the field is not made accessible or is final
     */
    public static void writeField(final Field field, final Object target, final Object value, final boolean forceAccess)
            throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13501);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13502);if ((((field == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13503)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13504)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13505);throw new IllegalArgumentException("The field must not be null");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13506);if ((((forceAccess && !field.isAccessible())&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13507)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13508)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13509);field.setAccessible(true);
        } }else {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13510);MemberUtils.setAccessibleWorkaround(field);
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13511);field.set(target, value);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Writes a public field. Superclasses will be considered.
     * 
     * @param target
     *            the object to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @param value
     *            to set
     * @throws IllegalArgumentException
     *             if <code>target</code> or <code>fieldName</code> is null
     * @throws IllegalAccessException
     *             if the field is not accessible
     */
    public static void writeField(final Object target, final String fieldName, final Object value) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13512);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13513);writeField(target, fieldName, value, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Writes a field. Superclasses will be considered.
     * 
     * @param target
     *            the object to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @param value
     *            to set
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method. <code>False</code>
     *            will only match public fields.
     * @throws IllegalArgumentException
     *             if <code>target</code> or <code>fieldName</code> is null
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static void writeField(final Object target, final String fieldName, final Object value, final boolean forceAccess)
            throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13514);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13515);if ((((target == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13516)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13517)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13518);throw new IllegalArgumentException("target object must not be null");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13519);final Class<?> cls = target.getClass();
        __CLR4_4_1a9ya9yldnigg68.R.inc(13520);final Field field = getField(cls, fieldName, forceAccess);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13521);if ((((field == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13522)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13523)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13524);throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + "." + fieldName);
        }
        // already forced access above, don't repeat it here:
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13525);writeField(field, target, value);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Writes a public field. Only the specified class will be considered.
     * 
     * @param target
     *            the object to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @param value
     *            to set
     * @throws IllegalArgumentException
     *             if <code>target</code> or <code>fieldName</code> is null
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static void writeDeclaredField(final Object target, final String fieldName, final Object value) throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13526);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13527);writeDeclaredField(target, fieldName, value, false);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}

    /**
     * Writes a public field. Only the specified class will be considered.
     * 
     * @param target
     *            the object to reflect, must not be null
     * @param fieldName
     *            the field name to obtain
     * @param value
     *            to set
     * @param forceAccess
     *            whether to break scope restrictions using the <code>setAccessible</code> method. <code>False</code>
     *            will only match public fields.
     * @throws IllegalArgumentException
     *             if <code>target</code> or <code>fieldName</code> is null
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static void writeDeclaredField(final Object target, final String fieldName, final Object value, final boolean forceAccess)
            throws IllegalAccessException {try{__CLR4_4_1a9ya9yldnigg68.R.inc(13528);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13529);if ((((target == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13530)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13531)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13532);throw new IllegalArgumentException("target object must not be null");
        }
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13533);final Class<?> cls = target.getClass();
        __CLR4_4_1a9ya9yldnigg68.R.inc(13534);final Field field = getDeclaredField(cls, fieldName, forceAccess);
        __CLR4_4_1a9ya9yldnigg68.R.inc(13535);if ((((field == null)&&(__CLR4_4_1a9ya9yldnigg68.R.iget(13536)!=0|true))||(__CLR4_4_1a9ya9yldnigg68.R.iget(13537)==0&false))) {{
            __CLR4_4_1a9ya9yldnigg68.R.inc(13538);throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + "." + fieldName);
        }
        // already forced access above, don't repeat it here:
        }__CLR4_4_1a9ya9yldnigg68.R.inc(13539);writeField(field, target, value);
    }finally{__CLR4_4_1a9ya9yldnigg68.R.flushNeeded();}}
}
