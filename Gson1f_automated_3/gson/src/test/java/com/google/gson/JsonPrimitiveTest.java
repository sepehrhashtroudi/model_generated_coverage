/*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;

/**
 * Unit test for the {@link JsonPrimitive} class.
 * 
 * @author Joel Leitch
 */
public class JsonPrimitiveTest extends TestCase {

public void testExponential44() throws Exception { 
     JsonPrimitive json = new JsonPrimitive("1E+7"); 
     assertEquals(new BigDecimal("1E+7"), json.getAsBigDecimal()); 
     assertEquals(new Double("1E+7"), json.getAsDouble(), 0.00001); 
     assertEquals(new Float("1E+7"), json.getAsDouble(), 0.00001); 
     try { 
         json.getAsInt(); 
         fail("Integers can not handle exponents like this."); 
     } catch (NumberFormatException expected) { 
     } 
 }
public void testParsingStringAsNumber45() throws Exception { 
     JsonPrimitive json = new JsonPrimitive("1"); 
     assertFalse(json.isNumber()); 
     assertEquals(1D, json.getAsDouble(), 0.00001); 
     assertEquals(1F, json.getAsFloat(), 0.00001); 
     assertEquals(1, json.getAsInt()); 
     assertEquals(1L, json.getAsLong()); 
     assertEquals((short) 1, json.getAsShort()); 
     assertEquals((byte) 1, json.getAsByte()); 
     assertEquals(new BigInteger("1"), json.getAsBigInteger()); 
 }
  
  
  
  
  
  
  
  
  
  
  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
}
