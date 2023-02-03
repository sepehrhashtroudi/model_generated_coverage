/*
 * Copyright 2011 The Closure Compiler Authors.
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

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.SourceMap.Format;

import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.List;


/**
 * @author johnlenz@google.com (John Lenz)
 */
public class SourceMapGeneratorV3Test extends SourceMapTestCase {

  public SourceMapGeneratorV3Test() {
  }

  @Override
  protected SourceMapConsumer getSourceMapConsumer() {
    return new SourceMapConsumerV3();
  }

  @Override
  protected Format getSourceMapFormat() {
    return SourceMap.Format.V3;
  }


public void testMultilineMapping198() throws Exception { 
     compileAndCheck("function __BASIC__(__PARAM1__, __PARAM2__) {\n" + "var __VAR__ = '__STR__';\n" + "var __ANO__ = \"__STR2__\";\n" + "}"); 
 } 


public void testWriteMetaMap2312() throws IOException { 
     StringWriter out = new StringWriter(); 
     String name = "./app.js"; 
     List<SourceMapSection> appSections = Lists.newArrayList(SourceMapSection.forMap(getEmptyMapFor("./part.js"), 0, 0), SourceMapSection.forURL("src2", 100, 10)); 
     SourceMapGeneratorV3 generator = new SourceMapGeneratorV3(); 
     generator.appendIndexMapTo(out, name, appSections); 
     assertEquals("{\n" + "\"version\":3,\n" + "\"file\":\"./app.js\",\n" + "\"sections\":[\n" + "{\n" + "\"offset\":{\n" + "\"line\":0,\n" + "\"column\":0\n" + "},\n" + "\"map\":{\n" + "\"version\":3,\n" + "\"file\":\"./part.js\",\n" + "\"lineCount\":1,\n" + "\"mappings\":\";\",\n" + "\"sources\":[],\n" + "\"names\":[]\n" + "}\n" + "\n" + "},\n" + "{\n" + "\"offset\":{\n" + "\"line\":100,\n" + "\"column\":10\n" + "},\n" + "\"url\":\"src2\"\n" + "}\n" + "]\n" + "}\n", out.toString()); 
 } 


public void testParseSourceMetaMap458() throws Exception { 
     final String INPUT1 = "file1"; 
     final String INPUT2 = "file2"; 
     LinkedHashMap<String, String> inputs = Maps.newLinkedHashMap(); 
     inputs.put(INPUT1, "var __FOO__ = 1;"); 
     inputs.put(INPUT2, "var __BAR__ = 2;"); 
     RunResult result1 = compile(inputs.get(INPUT1), INPUT1); 
     RunResult result2 = compile(inputs.get(INPUT2), INPUT2); 
     final String MAP1 = "map1"; 
     final String MAP2 = "map2"; 
     final LinkedHashMap<String, String> maps = Maps.newLinkedHashMap(); 
     maps.put(MAP1, result1.sourceMapFileContent); 
     maps.put(MAP2, result2.sourceMapFileContent); 
     List<SourceMapSection> sections = Lists.newArrayList(); 
     StringBuilder output = new StringBuilder(); 
     FilePosition offset = appendAndCount(output, result1.generatedSource); 
     sections.add(SourceMapSection.forURL(MAP1, 0, 0)); 
     output.append(result2.generatedSource); 
     sections.add(SourceMapSection.forURL(MAP2, offset.getLine(), offset.getColumn())); 
     SourceMapGeneratorV3 generator = new SourceMapGeneratorV3(); 
     StringBuilder mapContents = new StringBuilder(); 
     generator.appendIndexMapTo(mapContents, "out.js", sections); 
     check(inputs, output.toString(), mapContents.toString(), new SourceMapSupplier() { 
  
         @Override 
         public String getSourceMap(String url) { 
             return maps.get(url); 
         } 
     }); 
 } 


public void testGoldenOutput0a493() throws Exception { 
     checkSourceMap("a;", "{\n" + "\"version\":3,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":1,\n" + "\"mappings\":\"AAAAA;\",\n" + "\"sources\":[\"testcode\"],\n" + "\"names\":[\"a\"]\n" + "}\n"); 
 } 


public void testGoldenOutput51203() throws Exception { 
     detailLevel = SourceMap.DetailLevel.ALL; 
     checkSourceMap("c:\\myfile.js", "/** @preserve\n" + " * this is a test.\n" + " */\n" + "var foo=a + 'this is a really long line that will force the" + " mapping to span multiple lines 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + "' + c + d + e;", "{\n" + "\"version\":3,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":6,\n" + "\"mappings\":\"A;;;;AAGA,IAAIA,IAAIC,CAAJD,CAAQ,mxCAARA;AAA8xCE," + "CAA9xCF,CAAkyCG,CAAlyCH,CAAsyCI;\",\n" + "\"sources\":[\"c:\\\\myfile.js\"],\n" + "\"names\":[\"foo\",\"a\",\"c\",\"d\",\"e\"]\n" + "}\n"); 
     detailLevel = SourceMap.DetailLevel.SYMBOLS; 
     checkSourceMap("c:\\myfile.js", "/** @preserve\n" + " * this is a test.\n" + " */\n" + "var foo=a + 'this is a really long line that will force the" + " mapping to span multiple lines 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + " 123456789 123456789 123456789 123456789 123456789" + "' + c + d + e;", "{\n" + "\"version\":3,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":6,\n" + "\"mappings\":\"A;;;;IAGIA,IAAIC,CAAJD;AAA8xCE,CAA9xCF,CAAkyCG," + "CAAlyCH,CAAsyCI;\",\n" + "\"sources\":[\"c:\\\\myfile.js\"],\n" + "\"names\":[\"foo\",\"a\",\"c\",\"d\",\"e\"]\n" + "}\n"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private String getEmptyMapFor(String name) throws IOException {
    StringWriter out = new StringWriter();
    SourceMapGeneratorV3 generator = new SourceMapGeneratorV3();
    generator.appendTo(out, name);
    return out.toString();
  }

  

  

  

  FilePosition count(String js) {
    int line = 0, column = 0;
    for (int i = 0; i < js.length(); i++) {
      if (js.charAt(i) == '\n') {
        line++;
        column = 0;
      } else {
        column++;
      }
    }
    return new FilePosition(line, column);
  }

  FilePosition appendAndCount(Appendable out, String js) throws IOException {
    out.append(js);
    return count(js);
  }
}
