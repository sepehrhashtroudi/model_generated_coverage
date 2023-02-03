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
public class MultiBackgroundInitializerTest {static class __CLR4_4_1g0cg0cldni84xv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,20786,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the names of the child initializers. */
    private static final String CHILD_INIT = "childInitializer";

    /** The initializer to be tested. */
    private MultiBackgroundInitializer initializer;

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1g0cg0cldni84xv.R.inc(20748);
        __CLR4_4_1g0cg0cldni84xv.R.inc(20749);initializer = new MultiBackgroundInitializer();
    }finally{__CLR4_4_1g0cg0cldni84xv.R.flushNeeded();}}

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
            final ExecutorService expExec) throws ConcurrentException {try{__CLR4_4_1g0cg0cldni84xv.R.inc(20750);
        __CLR4_4_1g0cg0cldni84xv.R.inc(20751);final ChildBackgroundInitializer cinit = (ChildBackgroundInitializer) child;
        __CLR4_4_1g0cg0cldni84xv.R.inc(20752);final Integer result = cinit.get();
        __CLR4_4_1g0cg0cldni84xv.R.inc(20753);assertEquals("Wrong result", 1, result.intValue());
        __CLR4_4_1g0cg0cldni84xv.R.inc(20754);assertEquals("Wrong number of executions", 1, cinit.initializeCalls);
        __CLR4_4_1g0cg0cldni84xv.R.inc(20755);if ((((expExec != null)&&(__CLR4_4_1g0cg0cldni84xv.R.iget(20756)!=0|true))||(__CLR4_4_1g0cg0cldni84xv.R.iget(20757)==0&false))) {{
            __CLR4_4_1g0cg0cldni84xv.R.inc(20758);assertEquals("Wrong executor service", expExec,
                    cinit.currentExecutor);
        }
    }}finally{__CLR4_4_1g0cg0cldni84xv.R.flushNeeded();}}

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
@Test
public void testInitialize86() throws Exception { final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final ExecutorService exec = Executors.newSingleThreadExecutor(); inits.put("test", init); final MultiBackgroundInitializerResults mh = new MultiBackgroundInitializerResults(inits, results, new HashMap<String, ConcurrentException>()); mh.setActiveExecutor(exec); final MultiBackgroundInitializerResults mh2 = new MultiBackgroundInitializerResults(inits, results, new HashMap<String, ConcurrentException>()); mh2.setActiveExecutor(exec); final MultiBackgroundInitializerResults mh
@Test
public void testInitializerNames1182() { Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); Map<String, Object> results = new HashMap<String, Object>(); results.put("test1", new Object()); results.put("test2", new Object()); inits.put("test1", init1); Map<String, Object> results2 = new HashMap<String, Object>(); results2.put("test1", new Object()); results2.put("test2", new Object()); Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); excepts.put("test1", new ConcurrentException("test
@Test
public void testCheckName1183() { Map<String, Map<String, Object>> results = new HashMap<String, Map<String, Object>>(); results.put("test1", new HashMap<String, Object>()); results.put("test2", new HashMap<String, Object>()); results.put("test3", new HashMap<String, Object>()); results.put("test4", new HashMap<String, Object>()); results.put("test5", new HashMap<String, Object>()); results.put("test6", new HashMap<String, Object>()); results.put("test7", new HashMap<String, Object>()); results.put("test8", new HashMap<
@Test
public void testGetInitializer1184() { Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); for (Map.Entry<String, BackgroundInitializer<?>> entry : inits.entrySet()) { BackgroundInitializer<?> init = entry.getValue(); Assert.assertNotNull(init); Assert.assertEquals(entry.getKey(), init.getName()); } for (Map.Entry<String, BackgroundInitializer<?>> entry : inits.entrySet()) { BackgroundInitializer<?> init = entry.getValue(); Assert.assertNotNull(init); Assert.assertEquals(entry.getKey(), init.getName()); } }
@Test
public void testInitialize1185() throws Exception { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final ExecutorService exec = Executors.newSingleThreadExecutor(); for (int i = 0; i < 10; i++) { final BackgroundInitializer<Object> bi = new BackgroundInitializer<Object>() { @Override public Object execute(Object obj) { if (obj instanceof MultiBackgroundInitializer) { results.put("test", obj); } else { excepts.put("test",
@Test
public void testInitialize1186() throws Exception { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, BackgroundInitializer<?>> results = new HashMap<String, BackgroundInitializer<?>>(); final ExecutorService exec = Executors.newCachedThreadPool(); for (int i = 0; i < 10; i++) { for (int j = 0; j < 10; j++) { final BackgroundInitializer<Object> i = new BackgroundInitializer<Object>() { @Override public Object getResultObject(String name) { return new Object(); } @Override public boolean isSuccessful() { return true; } }; } @Override public Map<String, BackgroundInitializer<?
@Test
public void testMultiBackgroundInitializerResults1187() { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final Map<String, String> childInitializers = new HashMap<String, String>(); childInitializers.put("child1", new BackgroundInitializer<Object>() { @Override public Object getResultObject(String name) { return "child1"; } @Override public boolean isSuccessful() { return true; } }); childInitializers.put("child2", new BackgroundInitializer<
@Test
public void testInitialize1188() throws Exception { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results1 = new HashMap<String, Object>(); final Map<String, Object> results2 = new HashMap<String, Object>(); final Map<String, Object> results3 = new HashMap<String, Object>(); inits.put("test1", init1); inits.put("test2", init2); inits.put("test3", init3); final MultiBackgroundInitializerResults results = new MultiBackgroundInitializerResults(inits, results1, new HashMap<String, ConcurrentException>()); results
@Test(expected=NullPointerException.class) public void testCheckNameNull1189() { final MultiBackgroundInitializer results = new MultiBackgroundInitializer(); results.getResultObject(null); }
@Test
public void testInitialize1190() throws Exception { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final ExecutorService exec = Executors.newSingleThreadExecutor(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final MultiBackgroundInitializerResults i = new MultiBackgroundInitializerResults(inits, results, excepts); for (final Map.Entry<String, BackgroundInitializer<?>> entry : inits.entrySet()) { if (entry.getKey().equals("init1")) { i.setObject(entry.getValue()); }
@Test
public void testGetResultObject1191() { Map<String, Object> results = new HashMap<String, Object>(); results.put("test1", "1"); results.put("test2", "2"); results.put("test3", "3"); results.put("test4", "4"); results.put("test5", "5"); results.put("test6", "6"); results.put("test7", "7"); results.put("test8", "8"); results.put("test9", "9"); results.put("test10", "10"); results.put("test11", "11"); results.put("test12", "12"); results.
@Test(expected = IllegalArgumentException.class) public void testAddInitializerWithNullName () { final MultiBackgroundInitializer m = new MultiBackgroundInitializer(); m.addInitializer(null, new BackgroundInitializer<Object>() { @Override public Object getResultObject(final String name) { return null; } }); }
@Test(expected=NoSuchElementException.class) public void checkName() { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final BackgroundInitializer<Object> childInitializer = new BackgroundInitializer<Object>() { private static final long serialVersionUID = 1L; @Override public Object getResultObject(String name) { return null; } @Override public boolean isSuccessful() { return true; } }; inits.put("child1", childInitializer); final BackgroundInitializer<Object> child2
@Test
public void testIsException1192() { Map<String, ConcurrentException> results = new HashMap<String, ConcurrentException>(); results.put("test1", new ConcurrentException("test1")); results.put("test2", new ConcurrentException("test2")); results.put("test3", new ConcurrentException("test3")); results.put("test4", new ConcurrentException("test4")); results.put("test5", new ConcurrentException("test5")); results.put("test6", new ConcurrentException("test6")); results.put("test7", new ConcurrentException("test7")); results.put("test8", new ConcurrentException("test8")); results
@Test
public void testMultiBackgroundInitializerResults1193() throws Exception { Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); Map<String, Object> results = new HashMap<String, Object>(); results.put("test1", new Object()); results.put("test2", new Object()); results.put("test3", new Object()); results.put("test4", new Object()); Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); excepts.put("test1", new ConcurrentException("test1")); excepts.put("test2", new ConcurrentException("test2")); excepts.put("test3
@Test(expected=IllegalArgumentException.class) public void testAddInitializerWithNullName1194() { final MultiBackgroundInitializer m = new MultiBackgroundInitializer(); m.addInitializer(null, new BackgroundInitializer<Object>() { @Override public Object getResultObject(final String name) { return null; } }); }
@Test
public void testGetActiveExecutor1195() throws Exception { ExecutorService exec = this.executorService.getActiveExecutor(); assertTrue(exec == this.executorService); }
@Test
public void testInitialize1196() throws Exception { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final ExecutorService exec = Executors.newSingleThreadExecutor(); final MultiBackgroundInitializerResults i = new MultiBackgroundInitializerResults(inits, results, excepts); i.execute(new Runnable() { @Override public void run() { for (int i = 0; i < 10; i++) { results.put("test", i); } } }); }
@Test
public void testCheckName1197() { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final BackgroundInitializer<Object> childInitializer = new BackgroundInitializer<Object>() { private static final long serialVersionUID = 1L; @Override public Object getResultObject(String name) { return null; } @Override public boolean isSuccessful() { return true; } @Override public Map<String, BackgroundInitializer<?>> childInitializers() { return Optional.of(new HashMap<String, BackgroundInitializer
@Test
public void testMultiBackgroundInitializerResults1198() throws Exception { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final Map<String, Object> resultObjects = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts1 = new HashMap<String, ConcurrentException>(); final Map<String, ConcurrentException> excepts2 = new HashMap<String, ConcurrentException>(); final ConcurrentException exception1 = new ConcurrentException("test1"); final ConcurrentException
@Test(expected=IllegalArgumentException.class) public void testAddInitializerWithNullName1199() { final MultiBackgroundInitializer m = new MultiBackgroundInitializer(); m.addInitializer(null, new BackgroundInitializer<Object>() { @Override public Object getResultObject(final String name) { throw new IllegalArgumentException(); } }); }
@Test(expected=UnsupportedOperationException.class) public void testInitializerNames1200() { Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); Map<String, Object> results = new HashMap<String, Object>(); results.put("test1", null); results.put("test2", null); results.put("test3", null); MultiBackgroundInitializer sut = new MultiBackgroundInitializer(Executors.newCachedThreadPool()); sut.addInitializer("test1", sut); sut.addInitializer("test2", sut); sut.addInitializer("test3", sut); sut.initializerNames(); }
@Test
public void testTaskCount1201() { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final BackgroundInitializer<TestBackgroundInitializer> i = new BackgroundInitializer<TestBackgroundInitializer>() { @Override public Object init(final String name) { return new TestBackgroundInitializer(); } @Override public Object getResultObject(final String name) { return new TestBackgroundInitializer(); } @Override public Map<String, Object> results(final String name) { return results; } @Override public
@Test
public void testIsException1202() { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, ConcurrentException> exception = new HashMap<String, ConcurrentException>(); exception.put("test1", new ConcurrentException("test1")); exception.put("test2", new ConcurrentException("test2")); initializers.put("test1", inits); initializers.put("test2", exception); assertTrue(initializer.isException("test1")); assertTrue(initializer.isException("test2")); }
@Test
public void testMultiBackgroundInitializerResults1203() { Map<String, Map<String, Object>> results = new HashMap<String, Map<String, Object>>(); results.put("test1", new HashMap<String, Object>()); results.put("test2", new HashMap<String, Object>()); results.put("test3", new HashMap<String, Object>()); results.put("test4", new HashMap<String, Object>()); results.put("test5", new HashMap<String, Object>()); results.put("test6", new HashMap<String, Object>()); results.put("test7", new HashMap<String, Object>()); results.put("test8", new
@Test
public void testInitialize1204() throws Exception { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final MultiBackgroundInitializerResults results = new MultiBackgroundInitializerResults(inits, results, excepts); final MultiBackgroundInitializerResults spy = spy(results); doReturn(spy).when(spy).initialize(); doReturn(true).when(spy).isSuccessful(); doReturn(true).when(spy).isException(anyString()); doReturn(false).when(spy).
@Test
public void testGetTaskCount1205() { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); for (int i = 0; i < 10; i++) { final BackgroundInitializer<Object> i = new BackgroundInitializer<Object>() { @Override public Object getResultObject(String name) { return new Object(); } @Override public boolean isSuccessful() { return true; } }; excepts.put(name, i); } @Override public Map<String, BackgroundInitializer<?
@Test
public void testInitialize1206() throws Exception { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final MultiBackgroundInitializerResults results = new MultiBackgroundInitializerResults(inits, results, excepts); final ExecutorService exec = Executors.newCachedThreadPool(); exec.execute(new Runnable() { @Override public void run() { try { results.put("test", new Object()); } catch (final ConcurrentException e) { excepts.put("test", e); } } });
}

@Test
public void testGetInitializer1207() { Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); for (Map.Entry<String, BackgroundInitializer<?>> entry : inits.entrySet()) { BackgroundInitializer<?> init = entry.getValue(); Assert.assertNotNull(init); Assert.assertEquals(entry.getKey(), init.getName()); Assert.assertEquals(entry.getValue(), init.getResultObject(entry.getKey())); } for (Map.Entry<String, BackgroundInitializer<?>> entry : inits.entrySet()) { BackgroundInitializer<?> init = entry.getValue(); Assert.assertNotNull(init); Assert.assertEquals(entry
@Test
public void testGetResultObject1208() throws Exception { Map<String, Object> results = new HashMap<String, Object>(); results.put("test1", "1"); results.put("test2", "2"); results.put("test3", "3"); results.put("test4", "4"); results.put("test5", "5"); results.put("test6", "6"); results.put("test7", "7"); results.put("test8", "8"); results.put("test9", "9"); results.put("test10", "10"); results.put("test11", "11"); results.put("test12", "12");
}

@Test(expected=NoSuchElementException.class) public void checkName() { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final BackgroundInitializer<Object> childInitializer = new BackgroundInitializer<Object>() { private static final long serialVersionUID = 1L; @Override public Object getResultObject(final String name) { return null; } @Override public boolean isSuccessful() { return false; } @Override public Map<String, BackgroundInitializer<?>> childInitializers() { return Optional.of
@Test
public void testInitialize1209() throws Exception { final CountDownLatch latch = new CountDownLatch(1); final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final MultiBackgroundInitializerResults bi = new MultiBackgroundInitializerResults(inits, results, excepts); final ExecutorService exec = Executors.newCachedThreadPool(); exec.execute(new Runnable() { @Override public void run() { try { latch.await(); } catch (final InterruptedException e) { e.printStackTrace();
}

@Test
public void testGetTaskCount1210() { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); for (int i = 0; i < 10; i++) { final BackgroundInitializer<Object> bi = new BackgroundInitializer<Object>() { @Override public Object getResultObject(String name) { return new Object(); } @Override public int getTaskCount() { return i; } @Override public boolean isSuccessful() { return true; } @Override public boolean isException(String name
@Test
public void testGetTaskCount1211() { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final Map<String, BackgroundInitializer<?>> childInitializers = new HashMap<String, BackgroundInitializer<?>>(); final ExecutorService exec = Executors.newFixedThreadPool(2); for (int i = 0; i < 10; i++) { final BackgroundInitializer<Object> bi = new BackgroundInitializer<Object>() { @Override public Object execute(final Object obj) throws Exception {
@Test
public void testGetException1212() { Map<String, Map<String, Object>> results = new HashMap<String, Map<String, Object>>(); results.put("test1", new HashMap<String, Object>()); results.put("test2", new HashMap<String, Object>()); results.put("test3", new HashMap<String, Object>()); results.put("test4", new HashMap<String, Object>()); results.put("test5", new HashMap<String, Object>()); results.put("test6", new HashMap<String, Object>()); results.put("test7", new HashMap<String, Object>()); results.put("test8", new HashMap<
@Test
public void testGetActiveExecutor1213() throws Exception { final Semaphore semaphore = new Semaphore(0); ExecutorService exec = Executors.newCachedThreadPool(); Runnable task = new Runnable() { @Override public void run() { try { semaphore.acquire(); } catch (InterruptedException | BrokenBarrierException e) { throw new RuntimeException(e); } } }; exec.execute(task); assertTrue(semaphore.availablePermits() == 1); assertTrue(semaphore.tryAcquire(1, TimeUnit.SECONDS)); assertTrue(semaphore.tryAcquire(1, TimeUnit.SECONDS)); assertTrue(semaphore.tryAcquire(1, TimeUnit.
@Test(expected=NoSuchElementException.class) public void checkName() { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final BackgroundInitializer<Object> childInitializer = new BackgroundInitializer<Object>() { private static final long serialVersionUID = 1L; @Override public Object getResultObject(String name) { return null; } @Override public boolean isSuccessful() { return false; } @Override public Map<String, BackgroundInitializer<?>> childInitializers() { return Optional.of(
@Test
public void testInitialize1214() throws Exception { final Semaphore s = new Semaphore(0); final Semaphore s2 = new Semaphore(0); final Semaphore s3 = new Semaphore(0); final Semaphore s4 = new Semaphore(0); final Semaphore s5 = new Semaphore(0); final Semaphore s6 = new Semaphore(0); final Semaphore s7 = new Semaphore(0); final Semaphore s8 = new Semaphore(0); final Semaphore s9 = new Semaphore(0); final Semaphore s10 = new Semaphore(0); final Semaphore s11 = new Semaphore(0); final Semaphore s12 = new
@Test
public void testCheckName1215() { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final BackgroundInitializer<Object> childInitializer = new BackgroundInitializer<Object>() { private static final long serialVersionUID = 1L; @Override public Object getResultObject(final String name) { return null; } @Override public boolean isSuccessful() { return true; } }; inits.put("child1", childInitializer); final BackgroundInitializer<Object> child2 = new BackgroundInitializer<Object>() { private static final long serialVersionUID = 1L; @Override public Object getResultObject(final
@Test(expected = IllegalArgumentException.class) public void testAddInitializerWithNullName1216() { final MultiBackgroundInitializer<TestBackgroundInitializer> con = new MultiBackgroundInitializer<TestBackgroundInitializer>(); con.addInitializer(null, new TestBackgroundInitializer()); }
@Test
public void testInitialize1217() throws Exception { final CountDownLatch latch = new CountDownLatch(1); final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final MultiBackgroundInitializerResults exec = new MultiBackgroundInitializerResults(inits, results, excepts); for (int i = 0; i < 10; i++) { exec.execute(new Runnable() { @Override public void run() { try { latch.await(); } catch (final InterruptedException e) { e.
@Test
public void testInitialize1218() throws Exception { final MultiBackgroundInitializerResults results = new MultiBackgroundInitializerResults(); final Map<String, Object> results1 = results.getResults(); final Map<String, Object> results2 = results.getResults(); final Map<String, Object> results3 = results.getResults(); final Map<String, Object> results4 = results.getResults(); results1.put("test1", "test1"); results2.put("test2", "test2"); results3.put("test3", "test3"); results4.put("test4", "test4"); results1.put("test5", "test5"); results2.put("
@Test
public void testInitialize1219() throws Exception { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results1 = new HashMap<String, Object>(); final Map<String, Object> results2 = new HashMap<String, Object>(); final Map<String, Object> excepts1 = new HashMap<String, Object>(); final Map<String, Object> excepts2 = new HashMap<String, Object>(); final Semaphore s1 = new Semaphore(0); final Semaphore s2 = new Semaphore(0); final Semaphore s3 = new Semaphore(0); inits.put("test
@Test
public void testInitialize1220() throws Exception { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>(); final ExecutorService exec = Executors.newCachedThreadPool(); for (int i = 0; i < 10; i++) { final BackgroundInitializer<Object> bi = new BackgroundInitializer<Object>() { @Override public Object execute(final Object obj) { if (obj instanceof MultiBackgroundInitializer) { results.put("test", obj); } else { excepts.put("test",
@Test
public void testTaskCount1221() { final Map<String, BackgroundInitializer<?>> inits = new HashMap<String, BackgroundInitializer<?>>(); final Map<String, Object> results = new HashMap<String, Object>(); final BackgroundInitializer<Object> i = new BackgroundInitializer<Object>() { public Object init(final String name) { results.put(name, i); return null; } }; final BackgroundInitializer<Object> j = new BackgroundInitializer<Object>() { public Object init(final String name) { results.put(name, j); return null; } }; final BackgroundInitializer<Object> k = new BackgroundInitializer<Object>() { public Object init(final String
     * @return the result object produced by the initializer
     */
    private MultiBackgroundInitializer.MultiBackgroundInitializerResults checkInitialize()
            throws ConcurrentException {try{__CLR4_4_1g0cg0cldni84xv.R.inc(20759);
        __CLR4_4_1g0cg0cldni84xv.R.inc(20760);final int count = 5;
        __CLR4_4_1g0cg0cldni84xv.R.inc(20761);for (int i = 0; (((i < count)&&(__CLR4_4_1g0cg0cldni84xv.R.iget(20762)!=0|true))||(__CLR4_4_1g0cg0cldni84xv.R.iget(20763)==0&false)); i++) {{
            __CLR4_4_1g0cg0cldni84xv.R.inc(20764);initializer.addInitializer(CHILD_INIT + i,
                    new ChildBackgroundInitializer());
        }
        }__CLR4_4_1g0cg0cldni84xv.R.inc(20765);initializer.start();
        __CLR4_4_1g0cg0cldni84xv.R.inc(20766);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_4_1g0cg0cldni84xv.R.inc(20767);assertEquals("Wrong number of child initializers", count, res
                .initializerNames().size());
        __CLR4_4_1g0cg0cldni84xv.R.inc(20768);for (int i = 0; (((i < count)&&(__CLR4_4_1g0cg0cldni84xv.R.iget(20769)!=0|true))||(__CLR4_4_1g0cg0cldni84xv.R.iget(20770)==0&false)); i++) {{
            __CLR4_4_1g0cg0cldni84xv.R.inc(20771);final String key = CHILD_INIT + i;
            __CLR4_4_1g0cg0cldni84xv.R.inc(20772);assertTrue("Name not found: " + key, res.initializerNames()
                    .contains(key));
            __CLR4_4_1g0cg0cldni84xv.R.inc(20773);assertEquals("Wrong result object", Integer.valueOf(1), res
                    .getResultObject(key));
            __CLR4_4_1g0cg0cldni84xv.R.inc(20774);assertFalse("Exception flag", res.isException(key));
            __CLR4_4_1g0cg0cldni84xv.R.inc(20775);assertNull("Got an exception", res.getException(key));
            __CLR4_4_1g0cg0cldni84xv.R.inc(20776);checkChild(res.getInitializer(key), initializer.getActiveExecutor());
        }
        }__CLR4_4_1g0cg0cldni84xv.R.inc(20777);return res;
    }finally{__CLR4_4_1g0cg0cldni84xv.R.flushNeeded();}}

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
        protected Integer initialize() throws Exception {try{__CLR4_4_1g0cg0cldni84xv.R.inc(20778);
            __CLR4_4_1g0cg0cldni84xv.R.inc(20779);currentExecutor = getActiveExecutor();
            __CLR4_4_1g0cg0cldni84xv.R.inc(20780);initializeCalls++;

            __CLR4_4_1g0cg0cldni84xv.R.inc(20781);if ((((ex != null)&&(__CLR4_4_1g0cg0cldni84xv.R.iget(20782)!=0|true))||(__CLR4_4_1g0cg0cldni84xv.R.iget(20783)==0&false))) {{
                __CLR4_4_1g0cg0cldni84xv.R.inc(20784);throw ex;
            }

            }__CLR4_4_1g0cg0cldni84xv.R.inc(20785);return Integer.valueOf(initializeCalls);
        }finally{__CLR4_4_1g0cg0cldni84xv.R.flushNeeded();}}
    }
}
