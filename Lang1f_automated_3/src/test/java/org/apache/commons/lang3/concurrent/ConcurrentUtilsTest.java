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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * Test class for {@link ConcurrentUtils}.
 *
 * @version $Id$
 */
public class ConcurrentUtilsTest {
    /**
     * Tests creating a ConcurrentException with a runtime exception as cause.
     */
    

    /**
     * Tests creating a ConcurrentException with an error as cause.
     */
    

    /**
     * Tests creating a ConcurrentException with null as cause.
     */
    

    /**
     * Tries to create a ConcurrentRuntimeException with a runtime as cause.
     */
    

    /**
     * Tries to create a ConcurrentRuntimeException with an error as cause.
     */
    

    /**
     * Tries to create a ConcurrentRuntimeException with null as cause.
     */
    

    /**
     * Tests extractCause() for a null exception.
     */
    

    /**
     * Tests extractCause() if the cause of the passed in exception is null.
     */
    

    /**
     * Tests extractCause() if the cause is an error.
     */
    

    /**
     * Tests extractCause() if the cause is an unchecked exception.
     */
    

    /**
@Test
public void testHandleCauseUncheckedChecked40() { 
     final Exception ex = new Exception("Test"); 
     try { 
         ConcurrentUtils.handleCauseUnchecked(new ExecutionException(ex)); 
         fail("ConcurrentException not thrown!"); 
     } catch (final ConcurrentException crex) { 
         assertEquals("Wrong cause", ex, crex.getCause()); 
     } 
 }
@Test
public void testHandleCauseUncheckedChecked41() { 
     final Exception ex = new Exception("Test"); 
     try { 
         ConcurrentUtils.handleCauseUnchecked(new ExecutionException(ex)); 
         fail("ConcurrentException not thrown!"); 
     } catch (final ConcurrentException cex) { 
         assertEquals("Wrong cause", ex, cex.getCause()); 
     } 
 }
@Test
public void testHandleCauseUncheckedChecked95() { 
     final Exception ex = new Exception("Test"); 
     try { 
         ConcurrentUtils.handleCauseUnchecked(new ExecutionException(ex)); 
         fail("ConcurrentRuntimeException not thrown!"); 
     } catch (final ConcurrentRuntimeException crex) { 
         assertEquals("Wrong cause", ex, crex.getCause()); 
     } 
 }
@Test
public void testHandleCauseChecked98() { 
     final Exception ex = new Exception("Test"); 
     try { 
         ConcurrentUtils.handleCause(new ExecutionException(ex)); 
         fail("ConcurrentException not thrown!"); 
     } catch (final ConcurrentException crex) { 
         assertEquals("Wrong cause", ex, crex.getCause()); 
     } 
 }
@Test
public void testConcurrentExceptionCauseError99() { 
     final Exception ex = new Exception("Test"); 
     try { 
         ConcurrentUtils.checkedException(new Error()); 
         fail("ConcurrentException not thrown!"); 
     } catch (final IllegalArgumentException iae) { 
         assertEquals("Wrong cause", ex, iae.getCause()); 
     } 
 }
@Test
public void testExtractCauseUncheckedException100() { 
     final RuntimeException rex = new RuntimeException("Test"); 
     try { 
         ConcurrentUtils.extractCause(new ExecutionException(rex)); 
         fail("Runtime exception not thrown!"); 
     } catch (final RuntimeException r) { 
         assertEquals("Wrong exception", rex, r); 
     } 
 }
@Test
public void testInitializeUncheckedSuccess101() { 
     final String value = "test"; 
     final ConcurrentInitializer<Object> init = EasyMock.createMock(ConcurrentInitializer.class); 
     EasyMock.expect(init.get()).andReturn(value); 
     EasyMock.replay(init); 
     final Object result = ConcurrentUtils.initializeUnchecked(init); 
     assertSame("Wrong result object", value, result); 
     EasyMock.verify(init); 
 }
@Test
public void testInitializeUncheckedSuccess102() { 
     final String key = "testKey"; 
     final Integer value = 42; 
     final ConcurrentInitializer<Integer> init = EasyMock.createMock(ConcurrentInitializer.class); 
     final Exception ex = new Exception(); 
     EasyMock.expect(init.get()).andThrow(new ConcurrentException(ex)); 
     EasyMock.replay(init); 
     try { 
         ConcurrentUtils.initializeUnchecked(init); 
         fail("Exception not thrown!"); 
     } catch (final ConcurrentRuntimeException crex) { 
         assertEquals("Wrong cause", ex, crex.getCause()); 
     } 
     EasyMock.verify(init); 
 }
@Test
public void testInitializeUncheckedChecked103() { 
     @SuppressWarnings("unchecked") 
     final ConcurrentInitializer<Object> init = EasyMock.createMock(ConcurrentInitializer.class); 
     final Exception ex = new Exception(); 
     EasyMock.expect(init.get()).andThrow(new ConcurrentException(ex)); 
     EasyMock.replay(init); 
     try { 
         ConcurrentUtils.initializeUnchecked(init); 
         fail("Exception not thrown!"); 
     } catch (final ConcurrentRuntimeException crex) { 
         assertEquals("Wrong cause", ex, crex.getCause()); 
     } 
     EasyMock.verify(init); 
 }
@Test
public void testInitializeUncheckedException104() throws ConcurrentException { 
     @SuppressWarnings("unchecked") 
     final ConcurrentInitializer<Object> init = EasyMock.createMock(ConcurrentInitializer.class); 
     final Exception ex = new Exception(); 
     EasyMock.expect(init.get()).andThrow(new ConcurrentException(ex)); 
     EasyMock.replay(init); 
     try { 
         ConcurrentUtils.initializeUnchecked(init); 
         fail("Exception not thrown!"); 
     } catch (final ConcurrentRuntimeException crex) { 
         assertEquals("Wrong cause", ex, crex.getCause()); 
     } 
     EasyMock.verify(init); 
 }
@Test
public void testCreateIfAbsentNullInit105() throws ConcurrentException { 
     final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<String, Integer>(); 
     final String key = "testKey"; 
     final Integer value = 42; 
     map.put(key, value); 
     assertNull("Wrong result", ConcurrentUtils.createIfAbsent(map, key, null)); 
     assertEquals("Map was changed", value, map.get(key)); 
 }
@Test
public void testCreateIfAbsentKeyNotPresent106() throws ConcurrentException { 
     @SuppressWarnings("unchecked") 
     final ConcurrentInitializer<Integer> init = EasyMock.createMock(ConcurrentInitializer.class); 
     final String key = "testKey"; 
     final Integer value = 42; 
     EasyMock.expect(init.get()).andReturn(value); 
     EasyMock.replay(init); 
     final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<String, Integer>(); 
     assertEquals("Wrong result", value, ConcurrentUtils.createIfAbsent(map, key, init)); 
     assertEquals("Wrong value in map", value, map.get(key)); 
     EasyMock.verify(init); 
 }
     * Tests extractCause() if the cause is a checked exception.
     */
    

    /**
     * Tests extractCauseUnchecked() for a null exception.
     */
    

    /**
     * Tests extractCauseUnchecked() if the cause of the passed in exception is null.
     */
    

    /**
     * Tests extractCauseUnchecked() if the cause is an error.
     */
    

    /**
     * Tests extractCauseUnchecked() if the cause is an unchecked exception.
     */
    

    /**
     * Tests extractCauseUnchecked() if the cause is a checked exception.
     */
    

    /**
     * Tests handleCause() if the cause is an error.
     */
    

    /**
     * Tests handleCause() if the cause is an unchecked exception.
     */
    

    /**
     * Tests handleCause() if the cause is a checked exception.
     */
    

    /**
     * Tests handleCause() for a null parameter or a null cause. In this case
     * the method should do nothing. We can only test that no exception is
     * thrown.
     */
    

    /**
     * Tests handleCauseUnchecked() if the cause is an error.
     */
    

    /**
     * Tests handleCauseUnchecked() if the cause is an unchecked exception.
     */
    

    /**
     * Tests handleCauseUnchecked() if the cause is a checked exception.
     */
    

    /**
     * Tests handleCauseUnchecked() for a null parameter or a null cause. In
     * this case the method should do nothing. We can only test that no
     * exception is thrown.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests initialize() for a null argument.
     */
    

    /**
     * Tests a successful initialize() operation.
     */
    

    /**
     * Tests initializeUnchecked() for a null argument.
     */
    

    /**
     * Tests a successful initializeUnchecked() operation.
     */
    

    /**
     * Tests whether exceptions are correctly handled by initializeUnchecked().
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests constant future.
     */
    

    /**
     * Tests constant future.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests putIfAbsent() if the map contains the key in question.
     */
    

    /**
     * Tests putIfAbsent() if the map does not contain the key in question.
     */
    

    /**
     * Tests putIfAbsent() if a null map is passed in.
     */
    

    /**
     * Tests createIfAbsent() if the key is found in the map.
     */
    

    /**
     * Tests createIfAbsent() if the map does not contain the key in question.
     */
    

    /**
     * Tests createIfAbsent() if a null map is passed in.
     */
    

    /**
     * Tests createIfAbsent() if a null initializer is passed in.
     */
    

    /**
     * Tests createIfAbsentUnchecked() if no exception is thrown.
     */
    

    /**
     * Tests createIfAbsentUnchecked() if an exception is thrown.
     */
    
}
