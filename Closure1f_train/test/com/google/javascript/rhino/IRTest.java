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
 *   John Lenz
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

import com.google.common.collect.Lists;

import junit.framework.TestCase;

/**
 * @author johnlenz@google.com (John Lenz)
 */
public class IRTest extends TestCase {


public void testReturn368() { 
     testIR(IR.returnNode(), "RETURN\n"); 
     testIR(IR.returnNode(IR.name("a")), "RETURN\n" + "    NAME a\n"); 
 } 


public void testFunction745() { 
     testIR(IR.function(IR.name("hi"), IR.paramList(), IR.block()), "FUNCTION hi\n" + "    NAME hi\n" + "    PARAM_LIST\n" + "    BLOCK\n"); 
 } 


public void testBlock771() { 
     testIR(IR.block(), "BLOCK\n"); 
     testIR(IR.block(IR.empty(), IR.empty()), "BLOCK\n" + "    EMPTY\n" + "    EMPTY\n"); 
     testIR(IR.block(Lists.newArrayList(IR.empty(), IR.empty())), "BLOCK\n" + "    EMPTY\n" + "    EMPTY\n"); 
 } 


public void testScript787() { 
     testIR(IR.script(), "SCRIPT\n"); 
     testIR(IR.script(IR.empty(), IR.empty()), "SCRIPT\n" + "    EMPTY\n" + "    EMPTY\n"); 
     testIR(IR.script(Lists.newArrayList(IR.empty(), IR.empty())), "SCRIPT\n" + "    EMPTY\n" + "    EMPTY\n"); 
 } 


public void testThrow821() { 
     testIR(IR.throwNode(IR.name("a")), "THROW\n" + "    NAME a\n"); 
 } 


public void testIssue727_1838() { 
     testIR(IR.tryFinally(IR.block(), IR.block()), "TRY\n" + "    BLOCK\n" + "    BLOCK\n" + "    BLOCK\n"); 
 } 


public void testVar983() { 
     testIR(IR.var(IR.name("a")), "VAR\n" + "    NAME a\n"); 
     testIR(IR.var(IR.name("a"), IR.trueNode()), "VAR\n" + "    NAME a\n" + "        TRUE\n"); 
 } 


public void testIssue727_31000() { 
     testIR(IR.tryCatchFinally(IR.block(), IR.catchNode(IR.name("e"), IR.block()), IR.block()), "TRY\n" + "    BLOCK\n" + "    BLOCK\n" + "        CATCH\n" + "            NAME e\n" + "            BLOCK\n" + "    BLOCK\n"); 
 } 


public void testParamList1013() { 
     testIR(IR.paramList(), "PARAM_LIST\n"); 
     testIR(IR.paramList(IR.name("a"), IR.name("b")), "PARAM_LIST\n" + "    NAME a\n" + "    NAME b\n"); 
     testIR(IR.paramList(Lists.newArrayList(IR.name("a"), IR.name("b"))), "PARAM_LIST\n" + "    NAME a\n" + "    NAME b\n"); 
 } 


public void testIssue727_21217() { 
     testIR(IR.tryCatch(IR.block(), IR.catchNode(IR.name("e"), IR.block())), "TRY\n" + "    BLOCK\n" + "    BLOCK\n" + "        CATCH\n" + "            NAME e\n" + "            BLOCK\n"); 
 } 


public void testScriptThrows1488() { 
     boolean caught = false; 
     try { 
         IR.script(IR.returnNode()); 
     } catch (IllegalStateException e) { 
         caught = true; 
     } 
     assertTrue("expected exception was not seen", caught); 
 } 


public void testIf1604() { 
     testIR(IR.ifNode(IR.name("a"), IR.block()), "IF\n" + "    NAME a\n" + "    BLOCK\n"); 
     testIR(IR.ifNode(IR.name("a"), IR.block(), IR.block()), "IF\n" + "    NAME a\n" + "    BLOCK\n" + "    BLOCK\n"); 
 } 


public void testExprResult1646() { 
     testIR(IR.exprResult(IR.name("a")), "EXPR_RESULT\n" + "    NAME a\n"); 
 } 


public void testEmpty2238() { 
     testIR(IR.empty(), "EMPTY\n"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testIR(Node node, String expectedStructure) {
    assertEquals(expectedStructure, node.toStringTree());
  }
}
