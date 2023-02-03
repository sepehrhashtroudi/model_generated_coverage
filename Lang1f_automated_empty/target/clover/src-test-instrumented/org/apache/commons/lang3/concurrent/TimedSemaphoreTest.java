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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * Test class for TimedSemaphore.
 *
 * @version $Id$
 */
public class TimedSemaphoreTest {static class __CLR4_4_1ftpftpldniggx5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,20548,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the time period. */
    private static final long PERIOD = 500;

    /** Constant for the time unit. */
    private static final TimeUnit UNIT = TimeUnit.MILLISECONDS;

    /** Constant for the default limit. */
    private static final int LIMIT = 10;

    /**
     * Tests creating a new instance.
     */
    

    /**
     * Tries to create an instance with a negative period. This should cause an
     * exception.
     */
    

    /**
     * Tests whether a default executor service is created if no service is
     * provided.
     */
    

    /**
     * Tests starting the timer.
     */
    

    /**
     * Tests the shutdown() method if the executor belongs to the semaphore. In
     * this case it has to be shut down.
     */
    

    /**
     * Tests the shutdown() method for a shared executor service before a task
     * was started. This should do pretty much nothing.
     */
    

    /**
     * Prepares an executor service mock to expect the start of the timer.
     *
     * @param service the mock
     * @param future the future
     */
    private void prepareStartTimer(final ScheduledExecutorService service,
            final ScheduledFuture<?> future) {try{__CLR4_4_1ftpftpldniggx5.R.inc(20509);
        __CLR4_4_1ftpftpldniggx5.R.inc(20510);service.scheduleAtFixedRate((Runnable) EasyMock.anyObject(), EasyMock
                .eq(PERIOD), EasyMock.eq(PERIOD), EasyMock.eq(UNIT));
        __CLR4_4_1ftpftpldniggx5.R.inc(20511);EasyMock.expectLastCall().andReturn(future);
    }finally{__CLR4_4_1ftpftpldniggx5.R.flushNeeded();}}

    /**
     * Tests the shutdown() method for a shared executor after the task was
     * started. In this case the task must be canceled.
     */
    

    /**
     * Tests multiple invocations of the shutdown() method.
     */
    

    /**
     * Tests the acquire() method if a limit is set.
     */
    

    /**
     * Tests the acquire() method if more threads are involved than the limit.
     * This method starts a number of threads that all invoke the semaphore. The
     * semaphore's limit is set to 1, so in each period only a single thread can
     * acquire the semaphore.
     */
    

    /**
     * Tests the acquire() method if no limit is set. A test thread is started
     * that calls the semaphore a large number of times. Even if the semaphore's
     * period does not end, the thread should never block.
     */
    

    /**
     * Tries to call acquire() after shutdown(). This should cause an exception.
     */
    

    /**
     * Tests a bigger number of invocations that span multiple periods. The
     * period is set to a very short time. A background thread calls the
     * semaphore a large number of times. While it runs at last one end of a
     * period should be reached.
     */
    

    /**
     * Tests the methods for statistics.
     */
    

    /**
     * Tests whether the available non-blocking calls can be queried.
     */
    

    /**
     * A specialized implementation of {@code TimedSemaphore} that is easier to
     * test.
     */
    private static class TimedSemaphoreTestImpl extends TimedSemaphore {
        /** A mock scheduled future. */
        ScheduledFuture<?> schedFuture;

        /** A latch for synchronizing with the main thread. */
        volatile CountDownLatch latch;

        /** Counter for the endOfPeriod() invocations. */
        private int periodEnds;

        public TimedSemaphoreTestImpl(final long timePeriod, final TimeUnit timeUnit,
                final int limit) {
            super(timePeriod, timeUnit, limit);__CLR4_4_1ftpftpldniggx5.R.inc(20513);try{__CLR4_4_1ftpftpldniggx5.R.inc(20512);
        }finally{__CLR4_4_1ftpftpldniggx5.R.flushNeeded();}}

        public TimedSemaphoreTestImpl(final ScheduledExecutorService service,
                final long timePeriod, final TimeUnit timeUnit, final int limit) {
            super(service, timePeriod, timeUnit, limit);__CLR4_4_1ftpftpldniggx5.R.inc(20515);try{__CLR4_4_1ftpftpldniggx5.R.inc(20514);
        }finally{__CLR4_4_1ftpftpldniggx5.R.flushNeeded();}}

        /**
         * Returns the number of invocations of the endOfPeriod() method.
         *
         * @return the endOfPeriod() invocations
         */
        public int getPeriodEnds() {try{__CLR4_4_1ftpftpldniggx5.R.inc(20516);
            __CLR4_4_1ftpftpldniggx5.R.inc(20517);synchronized (this) {
                __CLR4_4_1ftpftpldniggx5.R.inc(20518);return periodEnds;
            }
        }finally{__CLR4_4_1ftpftpldniggx5.R.flushNeeded();}}

        /**
         * Invokes the latch if one is set.
         */
        @Override
        public synchronized void acquire() throws InterruptedException {try{__CLR4_4_1ftpftpldniggx5.R.inc(20519);
            __CLR4_4_1ftpftpldniggx5.R.inc(20520);super.acquire();
            __CLR4_4_1ftpftpldniggx5.R.inc(20521);if ((((latch != null)&&(__CLR4_4_1ftpftpldniggx5.R.iget(20522)!=0|true))||(__CLR4_4_1ftpftpldniggx5.R.iget(20523)==0&false))) {{
                __CLR4_4_1ftpftpldniggx5.R.inc(20524);latch.countDown();
            }
        }}finally{__CLR4_4_1ftpftpldniggx5.R.flushNeeded();}}

        /**
         * Counts the number of invocations.
         */
        @Override
        protected synchronized void endOfPeriod() {try{__CLR4_4_1ftpftpldniggx5.R.inc(20525);
            __CLR4_4_1ftpftpldniggx5.R.inc(20526);super.endOfPeriod();
            __CLR4_4_1ftpftpldniggx5.R.inc(20527);periodEnds++;
        }finally{__CLR4_4_1ftpftpldniggx5.R.flushNeeded();}}

        /**
         * Either returns the mock future or calls the super method.
         */
        @Override
        protected ScheduledFuture<?> startTimer() {try{__CLR4_4_1ftpftpldniggx5.R.inc(20528);
            __CLR4_4_1ftpftpldniggx5.R.inc(20529);return (((schedFuture != null )&&(__CLR4_4_1ftpftpldniggx5.R.iget(20530)!=0|true))||(__CLR4_4_1ftpftpldniggx5.R.iget(20531)==0&false))? schedFuture : super.startTimer();
        }finally{__CLR4_4_1ftpftpldniggx5.R.flushNeeded();}}
    }

    /**
     * A test thread class that will be used by tests for triggering the
     * semaphore. The thread calls the semaphore a configurable number of times.
     * When this is done, it can notify the main thread.
     */
    private static class SemaphoreThread extends Thread {
        /** The semaphore. */
        private final TimedSemaphore semaphore;

        /** A latch for communication with the main thread. */
        private final CountDownLatch latch;

        /** The number of acquire() calls. */
        private final int count;

        /** The number of invocations of the latch. */
        private final int latchCount;

        public SemaphoreThread(final TimedSemaphore b, final CountDownLatch l, final int c, final int lc) {try{__CLR4_4_1ftpftpldniggx5.R.inc(20532);
            __CLR4_4_1ftpftpldniggx5.R.inc(20533);semaphore = b;
            __CLR4_4_1ftpftpldniggx5.R.inc(20534);latch = l;
            __CLR4_4_1ftpftpldniggx5.R.inc(20535);count = c;
            __CLR4_4_1ftpftpldniggx5.R.inc(20536);latchCount = lc;
        }finally{__CLR4_4_1ftpftpldniggx5.R.flushNeeded();}}

        /**
         * Calls acquire() on the semaphore for the specified number of times.
         * Optionally the latch will also be triggered to synchronize with the
         * main test thread.
         */
        @Override
        public void run() {try{__CLR4_4_1ftpftpldniggx5.R.inc(20537);
            __CLR4_4_1ftpftpldniggx5.R.inc(20538);try {
                __CLR4_4_1ftpftpldniggx5.R.inc(20539);for (int i = 0; (((i < count)&&(__CLR4_4_1ftpftpldniggx5.R.iget(20540)!=0|true))||(__CLR4_4_1ftpftpldniggx5.R.iget(20541)==0&false)); i++) {{
                    __CLR4_4_1ftpftpldniggx5.R.inc(20542);semaphore.acquire();

                    __CLR4_4_1ftpftpldniggx5.R.inc(20543);if ((((i < latchCount)&&(__CLR4_4_1ftpftpldniggx5.R.iget(20544)!=0|true))||(__CLR4_4_1ftpftpldniggx5.R.iget(20545)==0&false))) {{
                        __CLR4_4_1ftpftpldniggx5.R.inc(20546);latch.countDown();
                    }
                }}
            }} catch (final InterruptedException iex) {
                __CLR4_4_1ftpftpldniggx5.R.inc(20547);Thread.currentThread().interrupt();
            }
        }finally{__CLR4_4_1ftpftpldniggx5.R.flushNeeded();}}
    }
}
