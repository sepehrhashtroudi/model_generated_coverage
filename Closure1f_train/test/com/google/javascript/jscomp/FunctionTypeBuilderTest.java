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

package com.google.javascript.jscomp;

import static com.google.javascript.rhino.testing.BaseJSTypeTestCase.ALL_NATIVE_EXTERN_TYPES;

import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.ObjectType;

import java.util.List;

/**
 * Unit tests for {@link FunctionTypeBuilder}.
 *
 */
public class FunctionTypeBuilderTest extends CompilerTestCase {

  public FunctionTypeBuilderTest() {
    parseTypeInfo = true;
    enableTypeCheck(CheckLevel.WARNING);
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    // By turning on type checking, the FunctionTypeBuilder will be invoked.
    return new CompilerPass() {
          @Override
          public void process(Node externs, Node js) {}
        };
  }

  @Override
  public int getNumRepetitions() {
    return 1;
  }


public void testExternSubTypes212() throws Exception { 
     testSame(ALL_NATIVE_EXTERN_TYPES, "", null); 
     List<FunctionType> subtypes = ((ObjectType) getLastCompiler().getTypeRegistry().getType("Error")).getConstructor().getSubTypes(); 
     for (FunctionType type : subtypes) { 
         String typeName = type.getInstanceType().toString(); 
         FunctionType typeInRegistry = ((ObjectType) getLastCompiler().getTypeRegistry().getType(typeName)).getConstructor(); 
         assertTrue(typeInRegistry == type); 
     } 
 } 


public void testBadFunctionTypeDefinition1289() throws Exception { 
     testSame("/** @constructor */function Function(opt_str) {}\n", "", FunctionTypeBuilder.TYPE_REDEFINITION, "attempted re-definition of type Function\n" + "found   : function (new:Function, ?=): ?\n" + "expected: function (new:Function, ...[*]): ?"); 
 } 

  

  

  

  

  

  

  
}
