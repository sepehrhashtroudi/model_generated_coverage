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
package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <p>
 * A specialized implementation of the {@code ConcurrentInitializer} interface
 * based on an {@link AtomicReference} variable.
 * </p>
 * <p>
 * This class maintains a member field of type {@code AtomicReference}. It
 * implements the following algorithm to create and initialize an object in its
 * {@link #get()} method:
 * <ul>
 * <li>First it is checked whether the {@code AtomicReference} variable contains
 * already a value. If this is the case, the value is directly returned.</li>
 * <li>Otherwise the {@link #initialize()} method is called. This method must be
 * defined in concrete subclasses to actually create the managed object.</li>
 * <li>After the object was created by {@link #initialize()} it is checked
 * whether the {@code AtomicReference} variable is still undefined. This has to
 * be done because in the meantime another thread may have initialized the
 * object. If the reference is still empty, the newly created object is stored
 * in it and returned by this method.</li>
 * <li>Otherwise the value stored in the {@code AtomicReference} is returned.</li>
 * </ul>
 * </p>
 * <p>
 * Because atomic variables are used this class does not need any
 * synchronization. So there is no danger of deadlock, and access to the managed
 * object is efficient. However, if multiple threads access the {@code
 * AtomicInitializer} object before it has been initialized almost at the same
 * time, it can happen that {@link #initialize()} is called multiple times. The
 * algorithm outlined above guarantees that {@link #get()} always returns the
 * same object though.
 * </p>
 * <p>
 * Compared with the {@link LazyInitializer} class, this class can be more
 * efficient because it does not need synchronization. The drawback is that the
 * {@link #initialize()} method can be called multiple times which may be
 * problematic if the creation of the managed object is expensive. As a rule of
 * thumb this initializer implementation is preferable if there are not too many
 * threads involved and the probability that multiple threads access an
 * uninitialized object is small. If there is high parallelism,
 * {@link LazyInitializer} is more appropriate.
 * </p>
 *
 * @since 3.0
 * @version $Id$
 * @param <T> the type of the object managed by this initializer class
 */
public abstract class AtomicInitializer<T> implements ConcurrentInitializer<T> {public static class __CLR4_4_189w89wldnigfwx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367336873L,8589935092L,10735,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Holds the reference to the managed object. */
    private final AtomicReference<T> reference = new AtomicReference<T>();

    /**
     * Returns the object managed by this initializer. The object is created if
     * it is not available yet and stored internally. This method always returns
     * the same object.
     *
     * @return the object created by this {@code AtomicInitializer}
     * @throws ConcurrentException if an error occurred during initialization of
     * the object
     */
    @Override
    public T get() throws ConcurrentException {try{__CLR4_4_189w89wldnigfwx.R.inc(10724);
        __CLR4_4_189w89wldnigfwx.R.inc(10725);T result = reference.get();

        __CLR4_4_189w89wldnigfwx.R.inc(10726);if ((((result == null)&&(__CLR4_4_189w89wldnigfwx.R.iget(10727)!=0|true))||(__CLR4_4_189w89wldnigfwx.R.iget(10728)==0&false))) {{
            __CLR4_4_189w89wldnigfwx.R.inc(10729);result = initialize();
            __CLR4_4_189w89wldnigfwx.R.inc(10730);if ((((!reference.compareAndSet(null, result))&&(__CLR4_4_189w89wldnigfwx.R.iget(10731)!=0|true))||(__CLR4_4_189w89wldnigfwx.R.iget(10732)==0&false))) {{
                // another thread has initialized the reference
                __CLR4_4_189w89wldnigfwx.R.inc(10733);result = reference.get();
            }
        }}

        }__CLR4_4_189w89wldnigfwx.R.inc(10734);return result;
    }finally{__CLR4_4_189w89wldnigfwx.R.flushNeeded();}}

    /**
     * Creates and initializes the object managed by this {@code
     * AtomicInitializer}. This method is called by {@link #get()} when the
     * managed object is not available yet. An implementation can focus on the
     * creation of the object. No synchronization is needed, as this is already
     * handled by {@code get()}. As stated by the class comment, it is possible
     * that this method is called multiple times.
     *
     * @return the managed data object
     * @throws ConcurrentException if an error occurs during object creation
     */
    protected abstract T initialize() throws ConcurrentException;
}
