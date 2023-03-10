/*
 * Copyright (C) 2009 Google Inc.
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

import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.stream.JsonReader;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.StringReader;
import junit.framework.TestCase;

/**
 * Unit test for {@link JsonParser}
 * 
 * @author Inderjeet Singh
 */
public class JsonParserTest extends TestCase {
  
  private JsonParser parser;
  
  @Override
  protected void setUp() throws Exception {
    super.setUp();
    parser = new JsonParser();
  }
  

public void testParseEmptyWhitespaceInput144() { 
     JsonElement e = parser.parse("     "); 
     assertTrue(e.isJsonNull()); 
 } 


public void testReadWriteTwoObjects164() throws Exception { 
     Gson gson = new Gson(); 
     CharArrayWriter writer = new CharArrayWriter(); 
     BagOfPrimitives expectedOne = new BagOfPrimitives(1, 1, true, "one"); 
     writer.write(gson.toJson(expectedOne).toCharArray()); 
     BagOfPrimitives expectedTwo = new BagOfPrimitives(2, 2, false, "two"); 
     writer.write(gson.toJson(expectedTwo).toCharArray()); 
     CharArrayReader reader = new CharArrayReader(writer.toCharArray()); 
     JsonReader parser = new JsonReader(reader); 
     parser.setLenient(true); 
     JsonElement element1 = Streams.parse(parser); 
     JsonElement element2 = Streams.parse(parser); 
     BagOfPrimitives actualOne = gson.fromJson(element1, BagOfPrimitives.class); 
     assertEquals("one", actualOne.stringValue); 
     BagOfPrimitives actualTwo = gson.fromJson(element2, BagOfPrimitives.class); 
     assertEquals("two", actualTwo.stringValue); 
 } 


public void testParseMixedArray214() { 
     String json = "[{},13,\"stringValue\"]"; 
     JsonElement e = parser.parse(json); 
     assertTrue(e.isJsonArray()); 
     JsonArray array = e.getAsJsonArray(); 
     assertEquals("{}", array.get(0).toString()); 
     assertEquals(13, array.get(1).getAsInt()); 
     assertEquals("stringValue", array.get(2).getAsString()); 
 } 

  
  
  

  
  
  

  
  
  
}
