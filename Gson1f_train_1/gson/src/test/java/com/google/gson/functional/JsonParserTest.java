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

package com.google.gson.functional;

import java.io.StringReader;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.Nested;

/**
 * Functional tests for that use JsonParser and related Gson methods
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class JsonParserTest extends TestCase {
  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new Gson();
  }
  

public void testBadFieldTypeForCustomDeserializerCustomTree110() { 
     JsonArray array = new JsonArray(); 
     array.add(new JsonPrimitive("blah")); 
     JsonObject obj = new JsonObject(); 
     obj.addProperty("stringValue", "foo"); 
     obj.addProperty("intValue", 11); 
     obj.add("longValue", array); 
     try { 
         gson.fromJson(obj, BagOfPrimitives.class); 
         fail("BagOfPrimitives is not an array"); 
     } catch (JsonParseException expected) { 
     } 
 } 


public void testBadTypeForDeserializingCustomTree123() { 
     JsonObject obj = new JsonObject(); 
     obj.addProperty("stringValue", "foo"); 
     obj.addProperty("intValue", 11); 
     JsonArray array = new JsonArray(); 
     array.add(obj); 
     try { 
         gson.fromJson(array, BagOfPrimitives.class); 
         fail("BagOfPrimitives is not an array"); 
     } catch (JsonParseException expected) { 
     } 
 } 

  
  
  
  
  

  

  
}
