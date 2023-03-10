/*
 * Copyright 2007 The Closure Compiler Authors.
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

import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import junit.framework.TestCase;

/**
 * Test class for {@link GoogleCodingConvention}.
 */
public class GoogleCodingConventionTest extends TestCase {
  private GoogleCodingConvention conv = new GoogleCodingConvention();


public void testInlineName54() { 
     assertFalse(conv.isConstant("a")); 
     assertTrue(conv.isConstant("XYZ123_")); 
     assertTrue(conv.isConstant("ABC")); 
     assertFalse(conv.isConstant("ABCdef")); 
     assertFalse(conv.isConstant("aBC")); 
     assertFalse(conv.isConstant("A")); 
     assertFalse(conv.isConstant("_XYZ123")); 
     assertTrue(conv.isConstant("a$b$XYZ123_")); 
     assertTrue(conv.isConstant("a$b$ABC_DEF")); 
     assertTrue(conv.isConstant("a$b$A")); 
     assertFalse(conv.isConstant("a$b$a")); 
     assertFalse(conv.isConstant("a$b$ABCdef")); 
     assertFalse(conv.isConstant("a$b$aBC")); 
     assertFalse(conv.isConstant("a$b$")); 
     assertFalse(conv.isConstant("$")); 
 } 


public void testPrivateName777() { 
     assertTrue(conv.isPrivate("a_")); 
     assertFalse(conv.isPrivate("a")); 
     assertFalse(conv.isPrivate("_a_")); 
 } 


public void testEnumKey1636() { 
     assertTrue(conv.isValidEnumKey("A")); 
     assertTrue(conv.isValidEnumKey("123")); 
     assertTrue(conv.isValidEnumKey("FOO_BAR")); 
     assertFalse(conv.isValidEnumKey("a")); 
     assertFalse(conv.isValidEnumKey("someKeyInCamelCase")); 
     assertFalse(conv.isValidEnumKey("_FOO_BAR")); 
 } 


public void testVarAndOptionalParams2051() { 
     Node args = new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b")); 
     Node optArgs = new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "opt_a"), Node.newString(Token.NAME, "opt_b")); 
     assertFalse(conv.isVarArgsParameter(args.getFirstChild())); 
     assertFalse(conv.isVarArgsParameter(args.getLastChild())); 
     assertFalse(conv.isVarArgsParameter(optArgs.getFirstChild())); 
     assertFalse(conv.isVarArgsParameter(optArgs.getLastChild())); 
     assertFalse(conv.isOptionalParameter(args.getFirstChild())); 
     assertFalse(conv.isOptionalParameter(args.getLastChild())); 
     assertTrue(conv.isOptionalParameter(optArgs.getFirstChild())); 
     assertTrue(conv.isOptionalParameter(optArgs.getLastChild())); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertNotClassDefining(String code) {
    Node n = parseTestCode(code);
    assertNull(conv.getClassesDefinedByCall(n.getFirstChild()));
  }

  private void assertDefinesClasses(String code, String subclassName,
      String superclassName) {
    Node n = parseTestCode(code);
    SubclassRelationship classes =
        conv.getClassesDefinedByCall(n.getFirstChild());
    assertNotNull(classes);
    assertEquals(subclassName, classes.subclassName);
    assertEquals(superclassName, classes.superclassName);
  }

  private Node parseTestCode(String code) {
    Compiler compiler = new Compiler();
    return compiler.parseTestCode(code).getFirstChild();
  }
}
