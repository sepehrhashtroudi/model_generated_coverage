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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

/**
 * Performs some functional test involving JSON output escaping.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class EscapingTest extends TestCase {
  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new Gson();
  }


public void testEscapingObjectFields24() throws Exception { 
     BagOfPrimitives objWithPrimitives = new BagOfPrimitives(1L, 1, true, "test with\" <script>"); 
     String jsonRepresentation = gson.toJson(objWithPrimitives); 
     assertFalse(jsonRepresentation.contains("<")); 
     assertFalse(jsonRepresentation.contains(">")); 
     assertTrue(jsonRepresentation.contains("\\\"")); 
     BagOfPrimitives expectedObject = gson.fromJson(jsonRepresentation, BagOfPrimitives.class); 
     assertEquals(objWithPrimitives.getExpectedJson(), expectedObject.getExpectedJson()); 
 } 


public void testGsonAcceptsEscapedAndNonEscapedJsonDeserialization26() throws Exception { 
     Gson escapeHtmlGson = new GsonBuilder().create(); 
     Gson noEscapeHtmlGson = new GsonBuilder().disableHtmlEscaping().create(); 
     BagOfPrimitives target = new BagOfPrimitives(1L, 1, true, "test' / w'ith\" / \\ <script>"); 
     String escapedJsonForm = escapeHtmlGson.toJson(target); 
     String nonEscapedJsonForm = noEscapeHtmlGson.toJson(target); 
     assertFalse(escapedJsonForm.equals(nonEscapedJsonForm)); 
     assertEquals(target, noEscapeHtmlGson.fromJson(escapedJsonForm, BagOfPrimitives.class)); 
     assertEquals(target, escapeHtmlGson.fromJson(nonEscapedJsonForm, BagOfPrimitives.class)); 
 } 

  

  

  
  
  
}
