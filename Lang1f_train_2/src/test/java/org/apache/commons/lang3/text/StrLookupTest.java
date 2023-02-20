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

package org.apache.commons.lang3.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Test class for StrLookup.
 *
 * @version $Id$
 */
public class StrLookupTest  {

    //-----------------------------------------------------------------------
@Test
public void testSystemProperiesLookup191() { 
     assertEquals(System.getProperty("os.name"), StrLookup.systemPropertiesLookup().lookup("os.name")); 
     assertEquals(null, StrLookup.systemPropertiesLookup().lookup("")); 
     assertEquals(null, StrLookup.systemPropertiesLookup().lookup("other")); 
     try { 
         StrLookup.systemPropertiesLookup().lookup(null); 
         fail(); 
     } catch (final NullPointerException ex) { 
     } 
 }
    

    

    

    

}
