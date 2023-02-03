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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@link MultiBackgroundInitializer}.
 *
 * @version $Id$
 */
public class MultiBackgroundInitializerTest {static class __CLR4_4_1fsnfsnldniggx0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,20509,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the names of the child initializers. */
    private static final String CHILD_INIT = "childInitializer";

    /** The initializer to be tested. */
    private MultiBackgroundInitializer initializer;

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1fsnfsnldniggx0.R.inc(20471);
        __CLR4_4_1fsnfsnldniggx0.R.inc(20472);initializer = new MultiBackgroundInitializer();
    }finally{__CLR4_4_1fsnfsnldniggx0.R.flushNeeded();}}

    /**
     * Tests whether a child initializer has been executed. Optionally the
     * expected executor service can be checked, too.
     *
     * @param child the child initializer
     * @param expExec the expected executor service (null if the executor should
     * not be checked)
     * @throws ConcurrentException if an error occurs
     */
    private void checkChild(final BackgroundInitializer<?> child,
            final ExecutorService expExec) throws ConcurrentException {try{__CLR4_4_1fsnfsnldniggx0.R.inc(20473);
        __CLR4_4_1fsnfsnldniggx0.R.inc(20474);final ChildBackgroundInitializer cinit = (ChildBackgroundInitializer) child;
        __CLR4_4_1fsnfsnldniggx0.R.inc(20475);final Integer result = cinit.get();
        __CLR4_4_1fsnfsnldniggx0.R.inc(20476);assertEquals("Wrong result", 1, result.intValue());
        __CLR4_4_1fsnfsnldniggx0.R.inc(20477);assertEquals("Wrong number of executions", 1, cinit.initializeCalls);
        __CLR4_4_1fsnfsnldniggx0.R.inc(20478);if ((((expExec != null)&&(__CLR4_4_1fsnfsnldniggx0.R.iget(20479)!=0|true))||(__CLR4_4_1fsnfsnldniggx0.R.iget(20480)==0&false))) {{
            __CLR4_4_1fsnfsnldniggx0.R.inc(20481);assertEquals("Wrong executor service", expExec,
                    cinit.currentExecutor);
        }
    }}finally{__CLR4_4_1fsnfsnldniggx0.R.flushNeeded();}}

    /**
     * Tests addInitializer() if a null name is passed in. This should cause an
     * exception.
     */
    

    /**
     * Tests addInitializer() if a null initializer is passed in. This should
     * cause an exception.
     */
    

    /**
     * Tests the background processing if there are no child initializers.
     */
    

    /**
     * Helper method for testing the initialize() method. This method can
     * operate with both an external and a temporary executor service.
     *
     * @return the result object produced by the initializer
     */
    private MultiBackgroundInitializer.MultiBackgroundInitializerResults checkInitialize()
            throws ConcurrentException {try{__CLR4_4_1fsnfsnldniggx0.R.inc(20482);
        __CLR4_4_1fsnfsnldniggx0.R.inc(20483);final int count = 5;
        __CLR4_4_1fsnfsnldniggx0.R.inc(20484);for (int i = 0; (((i < count)&&(__CLR4_4_1fsnfsnldniggx0.R.iget(20485)!=0|true))||(__CLR4_4_1fsnfsnldniggx0.R.iget(20486)==0&false)); i++) {{
            __CLR4_4_1fsnfsnldniggx0.R.inc(20487);initializer.addInitializer(CHILD_INIT + i,
                    new ChildBackgroundInitializer());
        }
        }__CLR4_4_1fsnfsnldniggx0.R.inc(20488);initializer.start();
        __CLR4_4_1fsnfsnldniggx0.R.inc(20489);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_4_1fsnfsnldniggx0.R.inc(20490);assertEquals("Wrong number of child initializers", count, res
                .initializerNames().size());
        __CLR4_4_1fsnfsnldniggx0.R.inc(20491);for (int i = 0; (((i < count)&&(__CLR4_4_1fsnfsnldniggx0.R.iget(20492)!=0|true))||(__CLR4_4_1fsnfsnldniggx0.R.iget(20493)==0&false)); i++) {{
            __CLR4_4_1fsnfsnldniggx0.R.inc(20494);final String key = CHILD_INIT + i;
            __CLR4_4_1fsnfsnldniggx0.R.inc(20495);assertTrue("Name not found: " + key, res.initializerNames()
                    .contains(key));
            __CLR4_4_1fsnfsnldniggx0.R.inc(20496);assertEquals("Wrong result object", Integer.valueOf(1), res
                    .getResultObject(key));
            __CLR4_4_1fsnfsnldniggx0.R.inc(20497);assertFalse("Exception flag", res.isException(key));
            __CLR4_4_1fsnfsnldniggx0.R.inc(20498);assertNull("Got an exception", res.getException(key));
            __CLR4_4_1fsnfsnldniggx0.R.inc(20499);checkChild(res.getInitializer(key), initializer.getActiveExecutor());
        }
        }__CLR4_4_1fsnfsnldniggx0.R.inc(20500);return res;
    }finally{__CLR4_4_1fsnfsnldniggx0.R.flushNeeded();}}

    /**
     * Tests background processing if a temporary executor is used.
     */
    

    /**
     * Tests background processing if an external executor service is provided.
     */
    

    /**
     * Tests the behavior of initialize() if a child initializer has a specific
     * executor service. Then this service should not be overridden.
     */
    

    /**
     * Tries to add another child initializer after the start() method has been
     * called. This should not be allowed.
     */
    

    /**
     * Tries to query an unknown child initializer from the results object. This
     * should cause an exception.
     */
    

    /**
     * Tries to query the results of an unknown child initializer from the
     * results object. This should cause an exception.
     */
    

    /**
     * Tries to query the exception of an unknown child initializer from the
     * results object. This should cause an exception.
     */
    

    /**
     * Tries to query the exception flag of an unknown child initializer from
     * the results object. This should cause an exception.
     */
    

    /**
     * Tests that the set with the names of the initializers cannot be modified.
     */
    

    /**
     * Tests the behavior of the initializer if one of the child initializers
     * throws a runtime exception.
     */
    

    /**
     * Tests the behavior of the initializer if one of the child initializers
     * throws a checked exception.
     */
    

    /**
     * Tests the isSuccessful() method of the result object if no child
     * initializer has thrown an exception.
     */
    

    /**
     * Tests the isSuccessful() method of the result object if at least one
     * child initializer has thrown an exception.
     */
    

    /**
     * Tests whether MultiBackgroundInitializers can be combined in a nested
     * way.
     */
    

    /**
     * A concrete implementation of {@code BackgroundInitializer} used for
     * defining background tasks for {@code MultiBackgroundInitializer}.
     */
    private static class ChildBackgroundInitializer extends
            BackgroundInitializer<Integer> {
        /** Stores the current executor service. */
        volatile ExecutorService currentExecutor;

        /** A counter for the invocations of initialize(). */
        volatile int initializeCalls;

        /** An exception to be thrown by initialize(). */
        Exception ex;

        /**
         * Records this invocation. Optionally throws an exception.
         */
        @Override
        protected Integer initialize() throws Exception {try{__CLR4_4_1fsnfsnldniggx0.R.inc(20501);
            __CLR4_4_1fsnfsnldniggx0.R.inc(20502);currentExecutor = getActiveExecutor();
            __CLR4_4_1fsnfsnldniggx0.R.inc(20503);initializeCalls++;

            __CLR4_4_1fsnfsnldniggx0.R.inc(20504);if ((((ex != null)&&(__CLR4_4_1fsnfsnldniggx0.R.iget(20505)!=0|true))||(__CLR4_4_1fsnfsnldniggx0.R.iget(20506)==0&false))) {{
                __CLR4_4_1fsnfsnldniggx0.R.inc(20507);throw ex;
            }

            }__CLR4_4_1fsnfsnldniggx0.R.inc(20508);return Integer.valueOf(initializeCalls);
        }finally{__CLR4_4_1fsnfsnldniggx0.R.flushNeeded();}}
    }
}
