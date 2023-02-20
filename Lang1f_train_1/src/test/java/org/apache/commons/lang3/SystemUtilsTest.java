/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Locale;

import org.junit.Assert;

/**
 * Unit tests {@link org.apache.commons.lang3.SystemUtils}.
 * 
 * Only limited testing can be performed.
 * 
 * @version $Id$
 */
public class SystemUtilsTest {

@Test
public void testGetJavaHome721() { 
     final File dir = SystemUtils.getJavaHome(); 
     Assert.assertNotNull(dir); 
     Assert.assertTrue(dir.exists()); 
 }
@Test
public void testGetJavaIoTmpDir722() { 
     final File dir = SystemUtils.getJavaIoTmpDir(); 
     Assert.assertNotNull(dir); 
     Assert.assertTrue(dir.exists()); 
 }
@Test
public void testGetUserDir723() { 
     final File dir = SystemUtils.getUserDir(); 
     Assert.assertNotNull(dir); 
     Assert.assertTrue(dir.exists()); 
 }
@Test
public void testGetUserHome724() { 
     final File dir = SystemUtils.getUserHome(); 
     Assert.assertNotNull(dir); 
     Assert.assertTrue(dir.exists()); 
 }
@Test
public void testOSMatchesNameAndVersion725() { 
     String osName = null; 
     String osVersion = null; 
     assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
     osName = ""; 
     osVersion = ""; 
     assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
     osName = "Windows 95"; 
     osVersion = "4.0"; 
     assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
     osName = "Windows 95"; 
     osVersion = "4.1"; 
     assertTrue(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
     osName = "Windows 98"; 
     osVersion = "4.1"; 
     assertTrue(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
     osName = "Windows NT"; 
     osVersion = "4.0"; 
     assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
     osName = "OS/2"; 
     osVersion = "4.0"; 
     assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
 }
@Test
public void testOSMatchesName726() { 
     String osName = null; 
     assertFalse(SystemUtils.isOSNameMatch(osName, "Windows")); 
     osName = ""; 
     assertFalse(SystemUtils.isOSNameMatch(osName, "Windows")); 
     osName = "Windows 95"; 
     assertTrue(SystemUtils.isOSNameMatch(osName, "Windows")); 
     osName = "Windows NT"; 
     assertTrue(SystemUtils.isOSNameMatch(osName, "Windows")); 
     osName = "OS/2"; 
     assertFalse(SystemUtils.isOSNameMatch(osName, "Windows")); 
 }
@Test
public void testConstructor727() { 
     assertNotNull(new SystemUtils()); 
     final Constructor<?>[] cons = SystemUtils.class.getDeclaredConstructors(); 
     assertEquals(1, cons.length); 
     assertTrue(Modifier.isPublic(cons[0].getModifiers())); 
     assertTrue(Modifier.isPublic(SystemUtils.class.getModifiers())); 
     assertFalse(Modifier.isFinal(SystemUtils.class.getModifiers())); 
 }
    

    /**
     * Assums no security manager exists.
     */
    

    /**
     * Assums no security manager exists.
     */
    

    /**
     * Assums no security manager exists.
     */
    

    /**
     * Assums no security manager exists.
     */
    

    

    

    

    

    

    
}
