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

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import junit.framework.TestCase;

/**
 * Test class for the default {@link CodingConvention}.
 */
public class DefaultCodingConventionTest extends TestCase {
  private CodingConvention conv = CodingConventions.getDefault();


public void testFunctionBind320() { 
     assertNotFunctionBind("goog.bind(f)"); 
     assertNotFunctionBind("goog$bind(f)"); 
     assertNotFunctionBind("goog.partial(f)"); 
     assertNotFunctionBind("goog$partial(f)"); 
     assertFunctionBind("(function(){}).bind()"); 
     assertFunctionBind("(function(){}).bind(obj)"); 
     assertFunctionBind("(function(){}).bind(obj, p1)"); 
     assertNotFunctionBind("Function.prototype.bind.call()"); 
     assertFunctionBind("Function.prototype.bind.call(obj)"); 
     assertFunctionBind("Function.prototype.bind.call(obj, p1)"); 
 } 


public void testPrivateName444() { 
     assertFalse(conv.isPrivate("a_")); 
     assertFalse(conv.isPrivate("a")); 
     assertFalse(conv.isPrivate("_a_")); 
 } 


public void testVarAndOptionalParams1521() { 
     Node args = new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b")); 
     Node optArgs = new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "opt_a"), Node.newString(Token.NAME, "opt_b")); 
     assertFalse(conv.isVarArgsParameter(args.getFirstChild())); 
     assertTrue(conv.isVarArgsParameter(args.getLastChild())); 
     assertFalse(conv.isVarArgsParameter(optArgs.getFirstChild())); 
     assertTrue(conv.isVarArgsParameter(optArgs.getLastChild())); 
     assertTrue(conv.isOptionalParameter(args.getFirstChild())); 
     assertFalse(conv.isOptionalParameter(args.getLastChild())); 
     assertTrue(conv.isOptionalParameter(optArgs.getFirstChild())); 
     assertFalse(conv.isOptionalParameter(optArgs.getLastChild())); 
 } 


public void testExportedName1598() { 
     assertFalse(conv.isExported("_a")); 
     assertFalse(conv.isExported("_a_")); 
     assertFalse(conv.isExported("a")); 
     assertFalse(conv.isExported("$super", false)); 
     assertTrue(conv.isExported("$super", true)); 
     assertTrue(conv.isExported("$super")); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertFunctionBind(String code) {
    Node n = parseTestCode(code);
    assertNotNull(conv.describeFunctionBind(n.getFirstChild()));
  }

  private void assertNotFunctionBind(String code) {
    Node n = parseTestCode(code);
    assertNull(conv.describeFunctionBind(n.getFirstChild()));
  }

  private void assertNotClassDefining(String code) {
    Node n = parseTestCode(code);
    assertNull(conv.getClassesDefinedByCall(n.getFirstChild()));
  }

  private Node parseTestCode(String code) {
    Compiler compiler = new Compiler();
    return compiler.parseTestCode(code).getFirstChild();
  }
}
