/*
 *
 * ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is Rhino code, released
 * May 6, 1999.
 *
 * The Initial Developer of the Original Code is
 * Netscape Communications Corporation.
 * Portions created by the Initial Developer are Copyright (C) 1997-1999
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Nick Santos
 *
 * Alternatively, the contents of this file may be used under the terms of
 * the GNU General Public License Version 2 or later (the "GPL"), in which
 * case the provisions of the GPL are applicable instead of those above. If
 * you wish to allow use of your version of this file only under the terms of
 * the GPL and not to allow others to use your version of this file under the
 * MPL, indicate your decision by deleting the provisions above and replacing
 * them with the notice and other provisions required by the GPL. If you do
 * not delete the provisions above, a recipient may use your version of this
 * file under either the MPL or the GPL.
 *
 * ***** END LICENSE BLOCK ***** */

package com.google.javascript.rhino;

import static com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
import static com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
import static com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;

import com.google.common.collect.Sets;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.Asserts;
import com.google.javascript.rhino.testing.TestErrorReporter;

import junit.framework.TestCase;

public class JSDocInfoTest extends TestCase {
  private TestErrorReporter errorReporter = new TestErrorReporter(null, null);
  private JSTypeRegistry registry = new JSTypeRegistry(errorReporter);

  private JSType getNativeType(JSTypeNative typeId) {
    return registry.getNativeType(typeId);
  }

  /**
   * Tests the assigned ordinal of the elements of the
   * {@link JSDocInfo.Visibility} enum.
   */

public void testSetReturnTypeAndBaseType256() { 
     JSDocInfo info = new JSDocInfo(); 
     info.setBaseType(new JSTypeExpression(new Node(Token.BANG, Node.newString("Number")), "")); 
     info.setReturnType(fromString("string")); 
     assertTypeEquals(NUMBER_OBJECT_TYPE, resolve(info.getBaseType())); 
     assertNull(info.getDescription()); 
     assertNull(info.getEnumParameterType()); 
     assertEquals(0, info.getParameterCount()); 
     assertTypeEquals(STRING_TYPE, resolve(info.getReturnType())); 
     assertNull(info.getType()); 
     assertNull(info.getVisibility()); 
     assertFalse(info.hasType()); 
     assertFalse(info.isConstant()); 
     assertFalse(info.isConstructor()); 
     assertFalse(info.isHidden()); 
     assertFalse(info.shouldPreserveTry()); 
 } 


public void testMultipleSetFlags1487() { 
     JSDocInfo info = new JSDocInfo(); 
     info.setConstant(true); 
     info.setConstructor(true); 
     info.setHidden(true); 
     info.setShouldPreserveTry(true); 
     assertFalse(info.hasType()); 
     assertTrue(info.isConstant()); 
     assertTrue(info.isConstructor()); 
     assertFalse(info.isDefine()); 
     assertTrue(info.isHidden()); 
     assertTrue(info.shouldPreserveTry()); 
     info.setHidden(false); 
     assertTrue(info.isConstant()); 
     assertTrue(info.isConstructor()); 
     assertFalse(info.isDefine()); 
     assertFalse(info.isHidden()); 
     assertTrue(info.shouldPreserveTry()); 
     info.setConstant(false); 
     info.setConstructor(false); 
     assertFalse(info.isConstant()); 
     assertFalse(info.isConstructor()); 
     assertFalse(info.isDefine()); 
     assertFalse(info.isHidden()); 
     assertTrue(info.shouldPreserveTry()); 
     info.setConstructor(true); 
     assertFalse(info.isConstant()); 
     assertTrue(info.isConstructor()); 
     assertFalse(info.isDefine()); 
     assertFalse(info.isHidden()); 
     assertTrue(info.shouldPreserveTry()); 
 } 


public void testSetNoAlias770() { 
     JSDocInfo info = new JSDocInfo(); 
     info.setNoAlias(true); 
     assertFalse(info.isDeprecated()); 
     assertFalse(info.isOverride()); 
     assertTrue(info.isNoAlias()); 
 } 


public void testSetModifies935() { 
     JSDocInfo info = new JSDocInfo(true); 
     info.setModifies(Sets.newHashSet("this")); 
     assertEquals(Sets.newHashSet("this"), info.getModifies()); 
     info = new JSDocInfo(true); 
     info.setModifies(Sets.newHashSet("arguments")); 
     assertEquals(Sets.newHashSet("arguments"), info.getModifies()); 
 } 


public void testSetFileOverviewWithDocumentationOff1186() { 
     JSDocInfo info = new JSDocInfo(); 
     info.documentFileOverview("hi bob"); 
     assertNull(info.getFileOverview()); 
 } 


public void testMultipleSetType1326() { 
     JSDocInfo info = new JSDocInfo(); 
     info.setType(fromString("number")); 
     try { 
         info.setReturnType(fromString("boolean")); 
         fail("Expected exception"); 
     } catch (IllegalStateException e) { 
     } 
     try { 
         info.setEnumParameterType(fromString("string")); 
         fail("Expected exception"); 
     } catch (IllegalStateException e) { 
     } 
     try { 
         info.setTypedefType(fromString("string")); 
         fail("Expected exception"); 
     } catch (IllegalStateException e) { 
     } 
     assertTypeEquals(NUMBER_TYPE, resolve(info.getType())); 
     assertNull(info.getReturnType()); 
     assertNull(info.getEnumParameterType()); 
     assertNull(info.getTypedefType()); 
     assertTrue(info.hasType()); 
 } 


public void testSetExport1336() { 
     JSDocInfo info = new JSDocInfo(); 
     info.setExport(true); 
     assertTrue(info.isExport()); 
 } 


public void testSetFileOverviewWithDocumentationOn1362() { 
     JSDocInfo info = new JSDocInfo(true); 
     info.documentFileOverview("hi bob"); 
     assertEquals("hi bob", info.getFileOverview()); 
 } 


public void testSetOverride1399() { 
     JSDocInfo info = new JSDocInfo(); 
     info.setOverride(true); 
     assertFalse(info.isDeprecated()); 
     assertFalse(info.isNoAlias()); 
     assertTrue(info.isOverride()); 
 } 


public void testSetNoTypeCheck1540() { 
     JSDocInfo info = new JSDocInfo(); 
     info.setNoCheck(true); 
     assertFalse(info.isDeprecated()); 
     assertFalse(info.isNoAlias()); 
     assertFalse(info.isOverride()); 
     assertTrue(info.isNoTypeCheck()); 
 } 


public void testSetSuppressions1576() { 
     JSDocInfo info = new JSDocInfo(true); 
     info.setSuppressions(Sets.newHashSet("sam", "bob")); 
     assertEquals(Sets.newHashSet("bob", "sam"), info.getSuppressions()); 
 } 


public void testSetDefine1779() { 
     JSDocInfo info = new JSDocInfo(); 
     info.setDefine(true); 
     assertTrue(info.isConstant()); 
     assertFalse(info.isConstructor()); 
     assertTrue(info.isDefine()); 
     assertFalse(info.isHidden()); 
     assertFalse(info.shouldPreserveTry()); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /** Gets the type expression for a simple type name. */
  private JSTypeExpression fromString(String s) {
    return new JSTypeExpression(Node.newString(s), "");
  }

  private JSType resolve(JSTypeExpression n, String... warnings) {
    errorReporter.setWarnings(warnings);
    return n.evaluate(null, registry);
  }

  private void assertTypeEquals(JSTypeNative a, JSType b) {
    assertTypeEquals(getNativeType(a), b);
  }

  private void assertTypeEquals(JSType a, JSType b) {
    Asserts.assertTypeEquals(a, b);
  }
}
