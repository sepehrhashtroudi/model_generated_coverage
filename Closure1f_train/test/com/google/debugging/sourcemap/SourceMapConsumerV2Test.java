/*
 * Copyright 2009 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.debugging.sourcemap;

import com.google.debugging.sourcemap.SourceMapConsumerV2;
import com.google.debugging.sourcemap.SourceMapParseException;
import com.google.debugging.sourcemap.proto.Mapping.OriginalMapping;

import junit.framework.TestCase;

public class SourceMapConsumerV2Test extends TestCase {

  public SourceMapConsumerV2Test() {
  }

  public SourceMapConsumerV2Test(String name) {
    super(name);
  }


public void testGetMappingForLineWithNameIndex16() throws Exception { 
     String mapData = "{\n" + "\"version\":2,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":1,\n" + "\"lineMaps\":" + "[\"cAEBABIBA/ICA+ADICA/ICA+IDA9AEYBMBA5\"],\n" + "\"sources\":[\"testcode\"],\n" + "\"names\": [\"f\"],\n" + "\"mappings\":[[0,1,9,0],\n" + "[0,1,9,0]\n" + "]\n" + "}\n"; 
     SourceMapConsumerV2 sourceMap = new SourceMapConsumerV2(); 
     sourceMap.parse(mapData); 
     OriginalMapping mapping = sourceMap.getMappingForLine(1, 10); 
     assertNotNull(mapping); 
     assertEquals("testcode", mapping.getOriginalFile()); 
     assertEquals(1, mapping.getLineNumber()); 
     assertEquals(9, mapping.getColumnPosition()); 
     assertEquals("f", mapping.getIdentifier()); 
 } 


public void testInvalidJSONFailure1298() throws Exception { 
     StringBuilder sb = new StringBuilder(); 
     sb.append("notjson"); 
     assertExceptionStartsWith("JSON parse exception: org.json.JSONException: " + "A JSONObject text must begin " + "with '{' at character 1", sb); 
 } 


public void testMissingFile1593() throws Exception { 
     StringBuilder sb = new StringBuilder(); 
     sb.append("{\"version\": 2, \"file\": \"\"}"); 
     assertException("File entry is missing or empty", sb); 
 } 


public void testGetMappingForLine2392() throws Exception { 
     String mapData = "{\n" + "\"version\":2,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":1,\n" + "\"lineMaps\":" + "[\"cAEBABIBA/ICA+ADICA/ICA+IDA9AEYBMBA5\"],\n" + "\"sources\":[\"testcode\"],\n" + "\"mappings\":[[0,1,9,\"f\"],\n" + "[0,1,9,\"f\"],\n" + "[0,1,10],\n" + "[0,1,11,\"foo\"],\n" + "[0,1,16,\"bar\"],\n" + "[0,1,21],\n" + "[0,1,23],\n" + "[0,1,23,\"foo\"],\n" + "[0,1,29,\"foo\"],\n" + "[0,1,35,\"bar\"],\n" + "[0,1,41],\n" + "[0,1,44],\n" + "[0,1,51,\"foo\"],\n" + "]\n" + "}\n"; 
     SourceMapConsumerV2 sourceMap = new SourceMapConsumerV2(); 
     sourceMap.parse(mapData); 
     OriginalMapping mapping = sourceMap.getMappingForLine(1, 10); 
     assertNotNull(mapping); 
     assertEquals("testcode", mapping.getOriginalFile()); 
     assertEquals(1, mapping.getLineNumber()); 
     assertEquals(9, mapping.getColumnPosition()); 
     assertEquals("f", mapping.getIdentifier()); 
     mapping = sourceMap.getMappingForLine(1, 40); 
     assertNotNull(mapping); 
     assertEquals("testcode", mapping.getOriginalFile()); 
     assertEquals(1, mapping.getLineNumber()); 
     assertEquals(44, mapping.getColumnPosition()); 
     assertEquals("", mapping.getIdentifier()); 
     mapping = sourceMap.getMappingForLine(1, 42); 
     assertNotNull(mapping); 
     assertEquals("testcode", mapping.getOriginalFile()); 
     assertEquals(1, mapping.getLineNumber()); 
     assertEquals(51, mapping.getColumnPosition()); 
     assertEquals("foo", mapping.getIdentifier()); 
     assertNull(sourceMap.getMappingForLine(Integer.MAX_VALUE, 1)); 
     assertNull(sourceMap.getMappingForLine(1, Integer.MAX_VALUE)); 
 } 


public void testUnknownVersion2419() throws Exception { 
     StringBuilder sb = new StringBuilder(); 
     sb.append("{\"version\": 3}"); 
     assertException("Unknown version: 3", sb); 
 } 

  

  

  

  

  

  

  private void assertException(String exception, StringBuilder sb) {
    boolean exceptionRaised = false;

    try {
      SourceMapConsumerV2 sourceMap = new SourceMapConsumerV2();
      sourceMap.parse(sb.toString());

    } catch (SourceMapParseException pe) {
      assertEquals(exception, pe.getMessage());
      exceptionRaised = true;
    }

    assertTrue(exceptionRaised);
  }

  private void assertExceptionStartsWith(String exception, StringBuilder sb) {
    boolean exceptionRaised = false;

    try {
      SourceMapConsumerV2 sourceMap = new SourceMapConsumerV2();
      sourceMap.parse(sb.toString());

    } catch (SourceMapParseException pe) {
      assertTrue(
        "expected <" + exception +"> but was <"+ pe.getMessage() +">",
        pe.getMessage().startsWith(exception));
      exceptionRaised = true;
    }

    assertTrue(exceptionRaised);
  }
}
