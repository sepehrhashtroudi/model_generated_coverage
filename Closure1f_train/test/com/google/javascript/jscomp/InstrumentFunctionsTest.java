/*
 * Copyright 2008 The Closure Compiler Authors.
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

package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;

import java.io.StringReader;
import java.util.List;

/**
 * Tests for {@link InstrumentFunctions}
 *
 */
public class InstrumentFunctionsTest extends CompilerTestCase {
  private String instrumentationPb;

  public InstrumentFunctionsTest() {
    this.instrumentationPb = null;
  }

  @Override
  protected void setUp() {
    super.enableLineNumberCheck(false);
    this.instrumentationPb = null;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new NameAndInstrumentFunctions(compiler);
  }

  @Override
  protected int getNumRepetitions() {
    // This pass is not idempotent.
    return 1;
  }


public void testInstrument375() { 
     final String kPreamble = "var $$toRemoveDefinition1, $$notToRemove;\n" + "var $$toRemoveDefinition2, $$toRemoveDefinition3;\n"; 
     List<String> initCodeList = ImmutableList.of("var $$Table = [];", "function $$TestDefine(id) {", "  $$Table[id] = 0;", "};", "function $$TestInstrument(id) {", "  $$Table[id]++;", "};"); 
     StringBuilder initCodeBuilder = new StringBuilder(); 
     StringBuilder pbBuilder = new StringBuilder(); 
     for (String line : initCodeList) { 
         initCodeBuilder.append(line).append("\n"); 
         pbBuilder.append("init: \"").append(line).append("\"\n"); 
     } 
     pbBuilder.append("report_call: \"$$testInstrument\"").append("report_defined: \"$$testDefine\"").append("declaration_to_remove: \"$$toRemoveDefinition1\"").append("declaration_to_remove: \"$$toRemoveDefinition2\"").append("declaration_to_remove: \"$$toRemoveDefinition3\""); 
     final String initCode = initCodeBuilder.toString(); 
     this.instrumentationPb = pbBuilder.toString(); 
     test("function a(){b}", initCode + "$$testDefine(0);" + "function a(){$$testInstrument(0);b}"); 
     test(kPreamble + "function a(){b}", initCode + "$$testDefine(0);" + "var $$notToRemove;" + "function a(){$$testInstrument(0);b}"); 
     test(kPreamble + "var a = { b: function(){c} }", initCode + "var $$notToRemove;" + "$$testDefine(0);" + "var a = { b: function(){$$testInstrument(0);c} }"); 
     test(kPreamble + "var a = { b: function(){c}, d: function(){e} }", initCode + "var $$notToRemove;" + "$$testDefine(0);" + "$$testDefine(1);" + "var a={b:function(){$$testInstrument(0);c}," + "d:function(){$$testInstrument(1);e}}"); 
     test(kPreamble + "var a = { b: { f: function(){c} }, d: function(){e} }", initCode + "var $$notToRemove;" + "$$testDefine(0);" + "$$testDefine(1);" + "var a={b:{f:function(){$$testInstrument(0);c}}," + "d:function(){$$testInstrument(1);e}}"); 
 } 


public void testExitPaths467() { 
     this.instrumentationPb = "report_exit: \"$$testExit\""; 
     test("function a(){return}", "function a(){return $$testExit(0)}"); 
     test("function b(){return 5}", "function b(){return $$testExit(0, 5)}"); 
     test("function a(){if(2 != 3){return}else{return 5}}", "function a(){if(2!=3){return $$testExit(0)}" + "else{return $$testExit(0,5)}}"); 
     test("function a(){if(2 != 3){return}else{return 5}}b()", "function a(){if(2!=3){return $$testExit(0)}" + "else{return $$testExit(0,5)}}b()"); 
     test("function a(){if(2 != 3){return}else{return 5}}", "function a(){if(2!=3){return $$testExit(0)}" + "else{return $$testExit(0,5)}}"); 
 } 


public void testInit504() { 
     this.instrumentationPb = "init: \"var foo = 0;\"\n" + "init: \"function f(){g();}\"\n"; 
     test("function a(){b}", "var foo = 0;function f(){g()}function a(){b}"); 
 } 


public void testProtobuffParseFail938() { 
     this.instrumentationPb = "not an ascii pb\n"; 
     test("function a(){b}", "", RhinoErrorReporter.PARSE_ERROR); 
 } 


public void testAppNameSetter1212() { 
     this.instrumentationPb = "app_name_setter: \"setAppName\""; 
     test("function a(){b}", "setAppName(\"testfile.js\");function a(){b}"); 
 } 


public void testPartialExitPaths1218() { 
     this.instrumentationPb = "report_exit: \"$$testExit\""; 
     test("function a(){if (2 != 3) {return}}", "function a(){if (2 != 3){return $$testExit(0)}$$testExit(0)}"); 
 } 


public void testInitJsParseFail2435() { 
     this.instrumentationPb = "init: \"= assignWithNoLhs();\""; 
     test("function a(){b}", "", RhinoErrorReporter.PARSE_ERROR); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private class NameAndInstrumentFunctions implements CompilerPass {
    private final Compiler compiler;
    NameAndInstrumentFunctions(Compiler compiler) {
      this.compiler = compiler;
    }
      @Override
      public void process(Node externs, Node root) {
          FunctionNames functionNames = new FunctionNames(compiler);
          functionNames.process(externs, root);

          InstrumentFunctions instrumentation =
                  new InstrumentFunctions(compiler, functionNames,
                          "test init code", "testfile.js",
                          new StringReader(instrumentationPb));
          instrumentation.process(externs, root);
      }
    
  }
}
