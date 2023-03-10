/*
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
import static org.junit.Assert.assertNotNull;

import java.util.concurrent.CountDownLatch;

import org.junit.Test;

/**
 * <p>
 * An abstract base class for tests of concrete {@code ConcurrentInitializer}
 * implementations.
 * </p>
 * <p>
 * This class provides some basic tests for initializer implementations. Derived
 * class have to create a {@link ConcurrentInitializer} object on which the
 * tests are executed.
 * </p>
 *
 * @version $Id$
 */
public abstract class AbstractConcurrentInitializerTest {
    /**
     * Tests a simple invocation of the get() method.
     */
@Test
public void testGetConcurrent896() throws ConcurrentException, InterruptedException { 
     final ConcurrentInitializer<Object> initializer = createInitializer(); 
     final int threadCount = 20; 
     final CountDownLatch startLatch = new CountDownLatch(1); 
     class GetThread extends Thread { 
  
         Object object; 
  
         @Override 
         public void run() { 
             try { 
                 startLatch.await(); 
                 object = initializer.get(); 
             } catch (final InterruptedException iex) { 
             } catch (final ConcurrentException cex) { 
                 object = cex; 
             } 
         } 
     } 
     final GetThread[] threads = new GetThread[threadCount]; 
     for (int i = 0; i < threadCount; i++) { 
         threads[i] = new GetThread(); 
         threads[i].start(); 
     } 
     startLatch.countDown(); 
     for (final Thread t : threads) { 
         t.join(); 
     } 
     final Object managedObject = initializer.get(); 
     for (final GetThread t : threads) { 
         assertEquals("Wrong object", managedObject, t.object); 
     } 
 }
@Test
public void testGetMultipleTimes1135() throws ConcurrentException { 
     final ConcurrentInitializer<Object> initializer = createInitializer(); 
     final Object obj = initializer.get(); 
     for (int i = 0; i < 10; i++) { 
         assertEquals("Got different object at " + i, obj, initializer.get()); 
     } 
 }
    

    /**
     * Tests whether sequential get() invocations always return the same
     * instance.
     */
    

    /**
     * Tests whether get() can be invoked from multiple threads concurrently.
     * Always the same object should be returned.
     */
    

    /**
     * Creates the {@link ConcurrentInitializer} object to be tested. This
     * method is called whenever the test fixture needs to be obtained.
     *
     * @return the initializer object to be tested
     */
    protected abstract ConcurrentInitializer<Object> createInitializer();
}
