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
package org.apache.commons.lang3.tuple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * Test the Triple class.
 * @version $Id$
 */
public class ImmutableTripleTest {

@Test
public void testEquals381() throws Exception { 
     assertEquals(ImmutableTriple.of(null, "foo", 42), ImmutableTriple.of(null, "foo", 42)); 
     assertFalse(ImmutableTriple.of("foo", 0, Boolean.TRUE).equals(ImmutableTriple.of("foo", null, null))); 
     assertFalse(ImmutableTriple.of("foo", "bar", "baz").equals(ImmutableTriple.of("xyz", "bar", "blo"))); 
     final ImmutableTriple<String, String, String> p = ImmutableTriple.of("foo", "bar", "baz"); 
     assertTrue(p.equals(p)); 
     assertFalse(p.equals(new Object())); 
 }
@Test
public void testHashCode382() throws Exception { 
     assertEquals(ImmutableTriple.of(null, "foo", Boolean.TRUE).hashCode(), ImmutableTriple.of(null, "foo", Boolean.TRUE).hashCode()); 
 }
    

    

    

    

    

    
}

