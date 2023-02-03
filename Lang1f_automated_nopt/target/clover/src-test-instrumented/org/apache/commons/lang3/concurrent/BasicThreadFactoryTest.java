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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.ThreadFactory;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@code BasicThreadFactory}.
 *
 * @version $Id$
 */
public class BasicThreadFactoryTest {static class __CLR4_4_1fz9fz9ldni84xc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,20727,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the test naming pattern. */
    private static final String PATTERN = "testThread-%d";

    /** The builder for creating a thread factory. */
    private BasicThreadFactory.Builder builder;

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1fz9fz9ldni84xc.R.inc(20709);
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20710);builder = new BasicThreadFactory.Builder();
    }finally{__CLR4_4_1fz9fz9ldni84xc.R.flushNeeded();}}

    /**
     * Tests the default options of a thread factory.
     *
     * @param factory the factory to be checked
     */
    private void checkFactoryDefaults(final BasicThreadFactory factory) {try{__CLR4_4_1fz9fz9ldni84xc.R.inc(20711);
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20712);assertNull("Got a naming pattern", factory.getNamingPattern());
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20713);assertNull("Got an exception handler", factory
                .getUncaughtExceptionHandler());
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20714);assertNull("Got a priority", factory.getPriority());
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20715);assertNull("Got a daemon flag", factory.getDaemonFlag());
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20716);assertNotNull("No wrapped factory", factory.getWrappedFactory());
    }finally{__CLR4_4_1fz9fz9ldni84xc.R.flushNeeded();}}

    /**
     * Tests the default values used by the builder.
     */
    

    /**
     * Tries to set a null naming pattern.
     */
    

    /**
     * Tries to set a null wrapped factory.
     */
    

    /**
     * Tries to set a null exception handler.
     */
    

    /**
     * Tests the reset() method of the builder.
     */
    

    /**
     * Tests whether reset() is automatically called after build().
     */
    

    /**
     * Tests whether the naming pattern is applied to new threads.
     */
    

    /**
     * Tests whether the thread name is not modified if no naming pattern is
     * set.
     */
    

    /**
     * Helper method for testing whether the daemon flag is taken into account.
     *
     * @param flag the value of the flag
     */
    private void checkDaemonFlag(final boolean flag) {try{__CLR4_4_1fz9fz9ldni84xc.R.inc(20717);
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20718);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20719);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20720);final Thread t = new Thread();
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20721);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20722);EasyMock.replay(wrapped, r);
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20723);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).daemon(
                flag).build();
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20724);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20725);assertTrue("Wrong daemon flag", flag == t.isDaemon());
        __CLR4_4_1fz9fz9ldni84xc.R.inc(20726);EasyMock.verify(wrapped, r);
    }finally{__CLR4_4_1fz9fz9ldni84xc.R.flushNeeded();}}

    /**
     * Tests whether daemon threads can be created.
     */
    

    /**
     * Tests whether the daemon status of new threads can be turned off.
     */
    

    /**
     * Tests whether the daemon flag is not touched on newly created threads if
     * it is not specified.
     */
    

    /**
     * Tests whether the priority is set on newly created threads.
     */
    

    /**
     * Tests whether the original priority is not changed if no priority is
     * specified.
     */
    

    /**
     * Tests whether the exception handler is set if one is provided.
     */
    

    /**
     * Tests whether the original exception hander is not touched if none is
     * specified.
     */
    
}
