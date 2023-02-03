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

import com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.SourceMap.Format;

import java.io.IOException;

/**
 * Tests for {@link SourceMap}.
 *
 */
public class SourceMapGeneratorV2Test extends SourceMapTestCase {

  public SourceMapGeneratorV2Test() {
    disableColumnValidation();
  }

  @Override
  protected SourceMapConsumer getSourceMapConsumer() {
    return new SourceMapConsumerV2();
  }

  @Override
  protected Format getSourceMapFormat() {
    return SourceMap.Format.V2;
  }

  @Override
  public void setUp() {
    detailLevel = SourceMap.DetailLevel.ALL;
  }


public void testGoldenOutput264() throws Exception { 
     checkSourceMap("function f(foo, bar) {\r\n\n\n\nfoo = foo + bar + foo;" + "\nreturn foo;\n}", "{\n" + "\"version\":2,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":1,\n" + "\"lineMaps\":[" + "\"cAEBABIBA/ICA+ADICA/ICA+IDA9IEYBMBA5\"],\n" + "\"mappings\":[[0,1,0,0],\n" + "[0,1,9,0],\n" + "[0,1,10],\n" + "[0,1,11,1],\n" + "[0,1,16,2],\n" + "[0,1,21],\n" + "[0,5,0],\n" + "[0,5,0,1],\n" + "[0,5,6,1],\n" + "[0,5,12,2],\n" + "[0,5,18,1],\n" + "[0,6,0],\n" + "[0,6,7,1],\n" + "],\n" + "\"sources\":[\"testcode\"],\n" + "\"names\":[\"f\",\"foo\",\"bar\"]\n" + "}\n"); 
 } 


public void testEncoding382() throws IOException { 
     assertEquals("AA", getEntry(0, 0, 1)); 
     assertEquals("EA", getEntry(0, 0, 2)); 
     assertEquals("8A", getEntry(0, 0, 16)); 
     assertEquals("!AQA", getEntry(0, 0, 17)); 
     assertEquals("!ARA", getEntry(0, 0, 18)); 
     assertEquals("!A+A", getEntry(0, 0, 63)); 
     assertEquals("!A/A", getEntry(0, 0, 64)); 
     assertEquals("!!ABAA", getEntry(0, 0, 65)); 
     assertEquals("!!A//A", getEntry(0, 0, 4096)); 
     assertEquals("!!!ABAAA", getEntry(0, 0, 4097)); 
     assertEquals("Af", getEntry(31, 0, 1)); 
     assertEquals("BAg", getEntry(32, 0, 1)); 
     assertEquals("AB", getEntry(32, 31, 1)); 
     assertEquals("!AQf", getEntry(31, 0, 17)); 
     assertEquals("!BQAg", getEntry(32, 0, 17)); 
     assertEquals("!AQB", getEntry(32, 31, 17)); 
     assertEquals("!A/B", getEntry(32, 31, 64)); 
     assertEquals("!!ABAB", getEntry(32, 31, 65)); 
 } 


public void testBasicDeterminism638() throws Exception { 
     RunResult result1 = compile("file1", "foo;", "file2", "bar;"); 
     RunResult result2 = compile("file2", "foo;", "file1", "bar;"); 
     String map1 = getSourceMap(result1); 
     String map2 = getSourceMap(result2); 
     String files1 = map1.split("\n")[4]; 
     String files2 = map2.split("\n")[4]; 
     assertEquals(files1, files2); 
 } 


public void testGoldenOutput51074() throws Exception { 
     detailLevel = SourceMap.DetailLevel.ALL; 
     checkSourceMap("c:\\myfile.js", "/** @preserve\n" + " * this is a test.\n" + " */\n" + "var foo=a + 'this is a really long line that will force the" + " mapping to span multiple lines 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + "' + c + d + e;", "{\n" + "\"version\":2,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":6,\n" + "\"lineMaps\":[\"\",\n" + "\"\",\n" + "\"\",\n" + "\"\",\n" + "\"MAMBABA/!!AUSC\",\n" + "\"AEA9AEA8AF\"],\n" + "\"mappings\":[[0,4,0],\n" + "[0,4,4,0],\n" + "[0,4,8,1],\n" + "[0,4,12],\n" + "[0,4,1314,2],\n" + "[0,4,1318,3],\n" + "[0,4,1322,4],\n" + "],\n" + "\"sources\":[\"c:\\\\myfile.js\"],\n" + "\"names\":[\"foo\",\"a\",\"c\",\"d\",\"e\"]\n" + "}\n"); 
     detailLevel = SourceMap.DetailLevel.SYMBOLS; 
     checkSourceMap("c:\\myfile.js", "/** @preserve\n" + " * this is a test.\n" + " */\n" + "var foo=a + 'this is a really long line that will force the" + " mapping to span multiple lines 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + "' + c + d + e;", "{\n" + "\"version\":2,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":6,\n" + "\"lineMaps\":[\"\",\n" + "\"\",\n" + "\"\",\n" + "\"\",\n" + "\"M/MBAB\",\n" + "\"ACA+ADA9AE\"],\n" + "\"mappings\":[[0,4,4,0],\n" + "[0,4,8,1],\n" + "[0,4,1314,2],\n" + "[0,4,1318,3],\n" + "[0,4,1322,4],\n" + "],\n" + "\"sources\":[\"c:\\\\myfile.js\"],\n" + "\"names\":[\"foo\",\"a\",\"c\",\"d\",\"e\"]\n" + "}\n"); 
 } 


public void testGoldenOutput31591() throws Exception { 
     checkSourceMap("c:\\myfile.js", "foo;", "{\n" + "\"version\":2,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":1,\n" + "\"lineMaps\":[\"IA\"],\n" + "\"mappings\":[[0,1,0,0],\n" + "],\n" + "\"sources\":[\"c:\\\\myfile.js\"],\n" + "\"names\":[\"foo\"]\n" + "}\n"); 
 } 


public void testGoldenOutput11727() throws Exception { 
     detailLevel = SourceMap.DetailLevel.ALL; 
     checkSourceMap("function f(foo, bar) { foo = foo + bar + 2; return foo; }", "{\n" + "\"version\":2,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":1,\n" + "\"lineMaps\":[\"cAEBABIBA/ICA+ADICA/ICA+IDA9AEYBMBA5\"],\n" + "\"mappings\":[[0,1,0,0],\n" + "[0,1,9,0],\n" + "[0,1,10],\n" + "[0,1,11,1],\n" + "[0,1,16,2],\n" + "[0,1,21],\n" + "[0,1,23],\n" + "[0,1,23,1],\n" + "[0,1,29,1],\n" + "[0,1,35,2],\n" + "[0,1,41],\n" + "[0,1,44],\n" + "[0,1,51,1],\n" + "],\n" + "\"sources\":[\"testcode\"],\n" + "\"names\":[\"f\",\"foo\",\"bar\"]\n" + "}\n"); 
     detailLevel = SourceMap.DetailLevel.SYMBOLS; 
     checkSourceMap("function f(foo, bar) { foo = foo + bar + 2; return foo; }", "{\n" + "\"version\":2,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":1,\n" + "\"lineMaps\":[\"cAEBA/ICA+IDE9IEA8IFA7IGg6MHA5\"],\n" + "\"mappings\":[[0,1,0,0],\n" + "[0,1,9,0],\n" + "[0,1,11,1],\n" + "[0,1,16,2],\n" + "[0,1,23,1],\n" + "[0,1,29,1],\n" + "[0,1,35,2],\n" + "[0,1,51,1],\n" + "],\n" + "\"sources\":[\"testcode\"],\n" + "\"names\":[\"f\",\"foo\",\"bar\"]\n" + "}\n"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  private int getRelativeId(int id, int lastId) {
    int length = LineMapEncoder.getRelativeMappingIdLength(id, lastId);
    int result = LineMapEncoder.getRelativeMappingId(id, length, lastId);
    int inverse = SourceMapLineDecoder.getIdFromRelativeId(
                      result, length, lastId);
    assertEquals(id, inverse);
    return result;
  }

  

  

  private String getEntry(int id, int lastId, int reps) throws IOException {
    StringBuilder sb = new StringBuilder();
    LineMapEncoder.encodeEntry(sb, id, lastId, reps);
    return sb.toString();
  }

  
}
