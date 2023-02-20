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
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Assert;

import org.junit.Test;

/**
 * Tests CharSequenceUtils
 *
 * @version $Id: CharSequenceUtilsTest.java 1066341 2011-02-02 06:21:53Z bayard $
 */
public class CharSequenceUtilsTest {

    //-----------------------------------------------------------------------
@Test
public void testConstructor138() { 
     assertNotNull(new CharSequenceUtils()); 
     final Constructor<?>[] cons = CharSequenceUtils.class.getDeclaredConstructors(); 
     assertEquals(1, cons.length); 
     assertTrue(Modifier.isPublic(cons[0].getModifiers())); 
     assertTrue(Modifier.isPublic(StringUtils.class.getModifiers())); 
     assertFalse(Modifier.isFinal(StringUtils.class.getModifiers())); 
 }
    
    
    //-----------------------------------------------------------------------
    

}
