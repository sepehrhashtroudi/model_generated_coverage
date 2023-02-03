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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;

/**
 * <p>Utility reflection methods focused on methods, originally from Commons BeanUtils.
 * Differences from the BeanUtils version may be noted, especially where similar functionality
 * already existed within Lang.
 * </p>
 *
 * <h3>Known Limitations</h3>
 * <h4>Accessing Public Methods In A Default Access Superclass</h4>
 * <p>There is an issue when invoking public methods contained in a default access superclass on JREs prior to 1.4.
 * Reflection locates these methods fine and correctly assigns them as public.
 * However, an <code>IllegalAccessException</code> is thrown if the method is invoked.</p>
 *
 * <p><code>MethodUtils</code> contains a workaround for this situation. 
 * It will attempt to call <code>setAccessible</code> on this method.
 * If this call succeeds, then the method can be invoked as normal.
 * This call will only succeed when the application has sufficient security privileges. 
 * If this call fails then the method may fail.</p>
 *
 * @since 2.5
 * @version $Id$
 */
public class MethodUtils {public static class __CLR4_4_1ai6ai6ldni844x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,13785,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>MethodUtils instances should NOT be constructed in standard programming.
     * Instead, the class should be used as
     * <code>MethodUtils.getAccessibleMethod(method)</code>.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public MethodUtils() {
        super();__CLR4_4_1ai6ai6ldni844x.R.inc(13615);try{__CLR4_4_1ai6ai6ldni844x.R.inc(13614);
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Invokes a named method whose parameter type matches the object type.</p>
     *
     * <p>This method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.</p>
     *
     * <p>This method supports calls to methods taking primitive parameters 
     * via passing in wrapping classes. So, for example, a <code>Boolean</code> object
     * would match a <code>boolean</code> primitive.</p>
     *
     * <p>This is a convenient wrapper for
     * {@link #invokeMethod(Object object,String methodName, Object[] args, Class[] parameterTypes)}.
     * </p>
     *
     * @param object invoke method on this object
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the method invoked
     * @throws IllegalAccessException if the requested method is not accessible via reflection
     */
    public static Object invokeMethod(final Object object, final String methodName,
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13616);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13617);if ((((args == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13618)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13619)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13620);args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13621);final Class<?>[] parameterTypes = ClassUtils.toClass(args);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13622);return invokeMethod(object, methodName, args, parameterTypes);
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Invokes a named method whose parameter type matches the object type.</p>
     *
     * <p>This method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.</p>
     *
     * <p>This method supports calls to methods taking primitive parameters 
     * via passing in wrapping classes. So, for example, a <code>Boolean</code> object
     * would match a <code>boolean</code> primitive.</p>
     *
     * @param object invoke method on this object
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @param parameterTypes match these parameters - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the method invoked
     * @throws IllegalAccessException if the requested method is not accessible via reflection
     */
    public static Object invokeMethod(final Object object, final String methodName,
            Object[] args, Class<?>[] parameterTypes)
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13623);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13624);if ((((parameterTypes == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13625)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13626)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13627);parameterTypes = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13628);if ((((args == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13629)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13630)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13631);args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13632);final Method method = getMatchingAccessibleMethod(object.getClass(),
                methodName, parameterTypes);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13633);if ((((method == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13634)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13635)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13636);throw new NoSuchMethodException("No such accessible method: "
                    + methodName + "() on object: "
                    + object.getClass().getName());
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13637);return method.invoke(object, args);
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Invokes a method whose parameter types match exactly the object
     * types.</p>
     *
     * <p>This uses reflection to invoke the method obtained from a call to
     * <code>getAccessibleMethod()</code>.</p>
     *
     * @param object invoke method on this object
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     */
    public static Object invokeExactMethod(final Object object, final String methodName,
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13638);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13639);if ((((args == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13640)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13641)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13642);args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13643);final Class<?>[] parameterTypes = ClassUtils.toClass(args);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13644);return invokeExactMethod(object, methodName, args, parameterTypes);
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Invokes a method whose parameter types match exactly the parameter
     * types given.</p>
     *
     * <p>This uses reflection to invoke the method obtained from a call to
     * <code>getAccessibleMethod()</code>.</p>
     *
     * @param object invoke method on this object
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @param parameterTypes match these parameters - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     */
    public static Object invokeExactMethod(final Object object, final String methodName,
            Object[] args, Class<?>[] parameterTypes)
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13645);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13646);if ((((args == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13647)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13648)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13649);args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13650);if ((((parameterTypes == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13651)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13652)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13653);parameterTypes = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13654);final Method method = getAccessibleMethod(object.getClass(), methodName,
                parameterTypes);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13655);if ((((method == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13656)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13657)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13658);throw new NoSuchMethodException("No such accessible method: "
                    + methodName + "() on object: "
                    + object.getClass().getName());
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13659);return method.invoke(object, args);
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Invokes a static method whose parameter types match exactly the parameter
     * types given.</p>
     *
     * <p>This uses reflection to invoke the method obtained from a call to
     * {@link #getAccessibleMethod(Class, String, Class[])}.</p>
     *
     * @param cls invoke static method on this class
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @param parameterTypes match these parameters - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     */
    public static Object invokeExactStaticMethod(final Class<?> cls, final String methodName,
            Object[] args, Class<?>[] parameterTypes)
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13660);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13661);if ((((args == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13662)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13663)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13664);args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13665);if ((((parameterTypes == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13666)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13667)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13668);parameterTypes = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13669);final Method method = getAccessibleMethod(cls, methodName, parameterTypes);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13670);if ((((method == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13671)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13672)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13673);throw new NoSuchMethodException("No such accessible method: "
                    + methodName + "() on class: " + cls.getName());
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13674);return method.invoke(null, args);
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Invokes a named static method whose parameter type matches the object type.</p>
     *
     * <p>This method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.</p>
     *
     * <p>This method supports calls to methods taking primitive parameters 
     * via passing in wrapping classes. So, for example, a <code>Boolean</code> class
     * would match a <code>boolean</code> primitive.</p>
     *
     * <p>This is a convenient wrapper for
     * {@link #invokeStaticMethod(Class objectClass,String methodName,Object [] args,Class[] parameterTypes)}.
     * </p>
     *
     * @param cls invoke static method on this class
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     */
    public static Object invokeStaticMethod(final Class<?> cls, final String methodName,
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13675);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13676);if ((((args == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13677)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13678)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13679);args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13680);final Class<?>[] parameterTypes = ClassUtils.toClass(args);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13681);return invokeStaticMethod(cls, methodName, args, parameterTypes);
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Invokes a named static method whose parameter type matches the object type.</p>
     *
     * <p>This method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.</p>
     *
     * <p>This method supports calls to methods taking primitive parameters 
     * via passing in wrapping classes. So, for example, a <code>Boolean</code> class
     * would match a <code>boolean</code> primitive.</p>
     *
     *
     * @param cls invoke static method on this class
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @param parameterTypes match these parameters - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     */
    public static Object invokeStaticMethod(final Class<?> cls, final String methodName,
            Object[] args, Class<?>[] parameterTypes)
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13682);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13683);if ((((parameterTypes == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13684)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13685)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13686);parameterTypes = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13687);if ((((args == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13688)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13689)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13690);args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13691);final Method method = getMatchingAccessibleMethod(cls, methodName,
                parameterTypes);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13692);if ((((method == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13693)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13694)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13695);throw new NoSuchMethodException("No such accessible method: "
                    + methodName + "() on class: " + cls.getName());
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13696);return method.invoke(null, args);
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Invokes a static method whose parameter types match exactly the object
     * types.</p>
     *
     * <p>This uses reflection to invoke the method obtained from a call to
     * {@link #getAccessibleMethod(Class, String, Class[])}.</p>
     *
     * @param cls invoke static method on this class
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     */
    public static Object invokeExactStaticMethod(final Class<?> cls, final String methodName,
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13697);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13698);if ((((args == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13699)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13700)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13701);args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13702);final Class<?>[] parameterTypes = ClassUtils.toClass(args);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13703);return invokeExactStaticMethod(cls, methodName, args, parameterTypes);
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Returns an accessible method (that is, one that can be invoked via
     * reflection) with given name and parameters.  If no such method
     * can be found, return <code>null</code>.
     * This is just a convenient wrapper for
     * {@link #getAccessibleMethod(Method method)}.</p>
     *
     * @param cls get method from this class
     * @param methodName get method with this name
     * @param parameterTypes with these parameters types
     * @return The accessible method
     */
    public static Method getAccessibleMethod(final Class<?> cls, final String methodName,
            final Class<?>... parameterTypes) {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13704);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13705);try {
            __CLR4_4_1ai6ai6ldni844x.R.inc(13706);return getAccessibleMethod(cls.getMethod(methodName,
                    parameterTypes));
        } catch (final NoSuchMethodException e) {
            __CLR4_4_1ai6ai6ldni844x.R.inc(13707);return null;
        }
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Returns an accessible method (that is, one that can be invoked via
     * reflection) that implements the specified Method.  If no such method
     * can be found, return <code>null</code>.</p>
     *
     * @param method The method that we wish to call
     * @return The accessible method
     */
    public static Method getAccessibleMethod(Method method) {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13708);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13709);if ((((!MemberUtils.isAccessible(method))&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13710)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13711)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13712);return null;
        }
        // If the declaring class is public, we are done
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13713);final Class<?> cls = method.getDeclaringClass();
        __CLR4_4_1ai6ai6ldni844x.R.inc(13714);if ((((Modifier.isPublic(cls.getModifiers()))&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13715)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13716)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13717);return method;
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13718);final String methodName = method.getName();
        __CLR4_4_1ai6ai6ldni844x.R.inc(13719);final Class<?>[] parameterTypes = method.getParameterTypes();

        // Check the implemented interfaces and subinterfaces
        __CLR4_4_1ai6ai6ldni844x.R.inc(13720);method = getAccessibleMethodFromInterfaceNest(cls, methodName,
                parameterTypes);

        // Check the superclass chain
        __CLR4_4_1ai6ai6ldni844x.R.inc(13721);if ((((method == null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13722)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13723)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13724);method = getAccessibleMethodFromSuperclass(cls, methodName,
                    parameterTypes);
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13725);return method;
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Returns an accessible method (that is, one that can be invoked via
     * reflection) by scanning through the superclasses. If no such method
     * can be found, return <code>null</code>.</p>
     *
     * @param cls Class to be checked
     * @param methodName Method name of the method we wish to call
     * @param parameterTypes The parameter type signatures
     * @return the accessible method or <code>null</code> if not found
     */
    private static Method getAccessibleMethodFromSuperclass(final Class<?> cls,
            final String methodName, final Class<?>... parameterTypes) {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13726);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13727);Class<?> parentClass = cls.getSuperclass();
        __CLR4_4_1ai6ai6ldni844x.R.inc(13728);while ((((parentClass != null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13729)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13730)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13731);if ((((Modifier.isPublic(parentClass.getModifiers()))&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13732)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13733)==0&false))) {{
                __CLR4_4_1ai6ai6ldni844x.R.inc(13734);try {
                    __CLR4_4_1ai6ai6ldni844x.R.inc(13735);return parentClass.getMethod(methodName, parameterTypes);
                } catch (final NoSuchMethodException e) {
                    __CLR4_4_1ai6ai6ldni844x.R.inc(13736);return null;
                }
            }
            }__CLR4_4_1ai6ai6ldni844x.R.inc(13737);parentClass = parentClass.getSuperclass();
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13738);return null;
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Returns an accessible method (that is, one that can be invoked via
     * reflection) that implements the specified method, by scanning through
     * all implemented interfaces and subinterfaces.  If no such method
     * can be found, return <code>null</code>.</p>
     *
     * <p>There isn't any good reason why this method must be private.
     * It is because there doesn't seem any reason why other classes should
     * call this rather than the higher level methods.</p>
     *
     * @param cls Parent class for the interfaces to be checked
     * @param methodName Method name of the method we wish to call
     * @param parameterTypes The parameter type signatures
     * @return the accessible method or <code>null</code> if not found
     */
    private static Method getAccessibleMethodFromInterfaceNest(Class<?> cls,
            final String methodName, final Class<?>... parameterTypes) {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13739);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13740);Method method = null;

        // Search up the superclass chain
        __CLR4_4_1ai6ai6ldni844x.R.inc(13741);for (; (((cls != null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13742)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13743)==0&false)); cls = cls.getSuperclass()) {{

            // Check the implemented interfaces of the parent class
            __CLR4_4_1ai6ai6ldni844x.R.inc(13744);final Class<?>[] interfaces = cls.getInterfaces();
            __CLR4_4_1ai6ai6ldni844x.R.inc(13745);for (int i = 0; (((i < interfaces.length)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13746)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13747)==0&false)); i++) {{
                // Is this interface public?
                __CLR4_4_1ai6ai6ldni844x.R.inc(13748);if ((((!Modifier.isPublic(interfaces[i].getModifiers()))&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13749)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13750)==0&false))) {{
                    __CLR4_4_1ai6ai6ldni844x.R.inc(13751);continue;
                }
                // Does the method exist on this interface?
                }__CLR4_4_1ai6ai6ldni844x.R.inc(13752);try {
                    __CLR4_4_1ai6ai6ldni844x.R.inc(13753);method = interfaces[i].getDeclaredMethod(methodName,
                            parameterTypes);
                } catch (final NoSuchMethodException e) { // NOPMD
                    /*
                     * Swallow, if no method is found after the loop then this
                     * method returns null.
                     */
                }
                __CLR4_4_1ai6ai6ldni844x.R.inc(13754);if ((((method != null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13755)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13756)==0&false))) {{
                    __CLR4_4_1ai6ai6ldni844x.R.inc(13757);break;
                }
                // Recursively check our parent interfaces
                }__CLR4_4_1ai6ai6ldni844x.R.inc(13758);method = getAccessibleMethodFromInterfaceNest(interfaces[i],
                        methodName, parameterTypes);
                __CLR4_4_1ai6ai6ldni844x.R.inc(13759);if ((((method != null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13760)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13761)==0&false))) {{
                    __CLR4_4_1ai6ai6ldni844x.R.inc(13762);break;
                }
            }}
        }}
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13763);return method;
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}

    /**
     * <p>Finds an accessible method that matches the given name and has compatible parameters.
     * Compatible parameters mean that every method parameter is assignable from 
     * the given parameters.
     * In other words, it finds a method with the given name 
     * that will take the parameters given.<p>
     *
     * <p>This method is used by 
     * {@link 
     * #invokeMethod(Object object, String methodName, Object[] args, Class[] parameterTypes)}.
     *
     * <p>This method can match primitive parameter by passing in wrapper classes.
     * For example, a <code>Boolean</code> will match a primitive <code>boolean</code>
     * parameter.
     *
     * @param cls find method in this class
     * @param methodName find method with this name
     * @param parameterTypes find method with most compatible parameters 
     * @return The accessible method
     */
    public static Method getMatchingAccessibleMethod(final Class<?> cls,
            final String methodName, final Class<?>... parameterTypes) {try{__CLR4_4_1ai6ai6ldni844x.R.inc(13764);
        __CLR4_4_1ai6ai6ldni844x.R.inc(13765);try {
            __CLR4_4_1ai6ai6ldni844x.R.inc(13766);final Method method = cls.getMethod(methodName, parameterTypes);
            __CLR4_4_1ai6ai6ldni844x.R.inc(13767);MemberUtils.setAccessibleWorkaround(method);
            __CLR4_4_1ai6ai6ldni844x.R.inc(13768);return method;
        } catch (final NoSuchMethodException e) { // NOPMD - Swallow the exception
        }
        // search through all methods
        __CLR4_4_1ai6ai6ldni844x.R.inc(13769);Method bestMatch = null;
        __CLR4_4_1ai6ai6ldni844x.R.inc(13770);final Method[] methods = cls.getMethods();
        __CLR4_4_1ai6ai6ldni844x.R.inc(13771);for (final Method method : methods) {{
            // compare name and parameters
            __CLR4_4_1ai6ai6ldni844x.R.inc(13772);if ((((method.getName().equals(methodName) && ClassUtils.isAssignable(parameterTypes, method.getParameterTypes(), true))&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13773)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13774)==0&false))) {{
                // get accessible version of method
                __CLR4_4_1ai6ai6ldni844x.R.inc(13775);final Method accessibleMethod = getAccessibleMethod(method);
                __CLR4_4_1ai6ai6ldni844x.R.inc(13776);if ((((accessibleMethod != null && (bestMatch == null || MemberUtils.compareParameterTypes(
                            accessibleMethod.getParameterTypes(),
                            bestMatch.getParameterTypes(),
                            parameterTypes) < 0))&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13777)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13778)==0&false))) {{
                        __CLR4_4_1ai6ai6ldni844x.R.inc(13779);bestMatch = accessibleMethod;
                 }
            }}
        }}
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13780);if ((((bestMatch != null)&&(__CLR4_4_1ai6ai6ldni844x.R.iget(13781)!=0|true))||(__CLR4_4_1ai6ai6ldni844x.R.iget(13782)==0&false))) {{
            __CLR4_4_1ai6ai6ldni844x.R.inc(13783);MemberUtils.setAccessibleWorkaround(bestMatch);
        }
        }__CLR4_4_1ai6ai6ldni844x.R.inc(13784);return bestMatch;
    }finally{__CLR4_4_1ai6ai6ldni844x.R.flushNeeded();}}
}
