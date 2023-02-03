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

import com.google.javascript.rhino.Node.NodeMismatch;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.TestErrorReporter;

import junit.framework.TestCase;

public class NodeTest extends TestCase {

public void testCheckTreeEqualsImplDifferentIncProp529() { 
     Node node1 = new Node(Token.INC); 
     node1.putIntProp(Node.INCRDECR_PROP, 1); 
     Node node2 = new Node(Token.INC); 
     assertNotNull(node1.checkTreeEqualsImpl(node2)); 
 } 


public void testUseSourceInfoIfMissingFrom989() { 
     Node assign = getAssignExpr("b", "c"); 
     assign.setSourceEncodedPosition(99); 
     assign.setSourceFileForTesting("foo.js"); 
     Node lhs = assign.getFirstChild(); 
     lhs.useSourceInfoIfMissingFrom(assign); 
     assertEquals(99, lhs.getSourcePosition()); 
     assertEquals("foo.js", lhs.getSourceFileName()); 
     assign.setSourceEncodedPosition(101); 
     assign.setSourceFileForTesting("bar.js"); 
     lhs.useSourceInfoIfMissingFrom(assign); 
     assertEquals(99, lhs.getSourcePosition()); 
     assertEquals("foo.js", lhs.getSourceFileName()); 
 } 


public void testInvalidSourceOffset1136() { 
     Node string = Node.newString("a"); 
     string.setSourceEncodedPosition(-1); 
     assertTrue(string.getSourceOffset() < 0); 
     string.setSourceFileForTesting("foo.js"); 
     assertTrue(string.getSourceOffset() < 0); 
 } 


public void testGetIndexOfChild1210() { 
     Node assign = getAssignExpr("b", "c"); 
     assertEquals(2, assign.getChildCount()); 
     Node firstChild = assign.getFirstChild(); 
     Node secondChild = firstChild.getNext(); 
     assertNotNull(secondChild); 
     assertEquals(0, assign.getIndexOfChild(firstChild)); 
     assertEquals(1, assign.getIndexOfChild(secondChild)); 
     assertEquals(-1, assign.getIndexOfChild(assign)); 
 } 


public void testQualifiedName1257() { 
     assertNull(IR.name("").getQualifiedName()); 
     assertEquals("a", IR.name("a").getQualifiedName()); 
     assertEquals("a.b", IR.getprop(IR.name("a"), IR.string("b")).getQualifiedName()); 
     assertEquals("this.b", IR.getprop(IR.thisNode(), IR.string("b")).getQualifiedName()); 
     assertNull(IR.getprop(IR.call(IR.name("a")), IR.string("b")).getQualifiedName()); 
 } 


public void testFileLevelJSDocAppender1313() { 
     Node n = new Node(1); 
     Node.FileLevelJsDocBuilder builder = n.getJsDocBuilderForNode(); 
     builder.append("foo"); 
     builder.append("bar"); 
     assertEquals("foobar", n.getJSDocInfo().getLicense()); 
 } 


public void testCheckTreeEqualsImplDifferentChild1437() { 
     Node child1 = new Node(1); 
     Node child2 = new Node(2); 
     Node node1 = new Node(1, child1); 
     Node node2 = new Node(1, child2); 
     assertEquals(new NodeMismatch(child1, child2), node1.checkTreeEqualsImpl(node2)); 
 } 


public void testCheckTreeEqualsImplDifferentChildCount1575() { 
     Node node1 = new Node(1, new Node(2)); 
     Node node2 = new Node(1); 
     assertEquals(new NodeMismatch(node1, node2), node1.checkTreeEqualsImpl(node2)); 
 } 


public void testVarArgs11726() { 
     assertFalse(new Node(1).isVarArgs()); 
 } 


public void testCopyInformationFrom1833() { 
     Node assign = getAssignExpr("b", "c"); 
     assign.setSourceEncodedPosition(99); 
     assign.setSourceFileForTesting("foo.js"); 
     Node lhs = assign.getFirstChild(); 
     lhs.copyInformationFrom(assign); 
     assertEquals(99, lhs.getSourcePosition()); 
     assertEquals("foo.js", lhs.getSourceFileName()); 
     assign.setSourceEncodedPosition(101); 
     assign.setSourceFileForTesting("bar.js"); 
     lhs.copyInformationFrom(assign); 
     assertEquals(99, lhs.getSourcePosition()); 
     assertEquals("foo.js", lhs.getSourceFileName()); 
 } 


public void testCheckTreeEqualsSlashVDifferent1852() { 
     Node node1 = Node.newString("\u000B"); 
     node1.putBooleanProp(Node.SLASH_V, true); 
     Node node2 = Node.newString("\u000B"); 
     assertEquals(false, node1.isEquivalentTo(node2)); 
 } 


public void testCheckTreeTypeAwareEqualsSameNull1859() { 
     TestErrorReporter testErrorReporter = new TestErrorReporter(null, null); 
     JSTypeRegistry registry = new JSTypeRegistry(testErrorReporter); 
     Node node1 = Node.newString(Token.NAME, "f"); 
     Node node2 = Node.newString(Token.NAME, "f"); 
     assertTrue(node1.isEquivalentToTyped(node2)); 
 } 


public void testSharedProps11966() { 
     Node n = getVarRef("A"); 
     n.putIntProp(Node.SIDE_EFFECT_FLAGS, 5); 
     Node m = new Node(Token.TRUE); 
     m.clonePropsFrom(n); 
     assertEquals(m.getPropListHeadForTesting(), n.getPropListHeadForTesting()); 
     assertEquals(5, n.getIntProp(Node.SIDE_EFFECT_FLAGS)); 
     assertEquals(5, m.getIntProp(Node.SIDE_EFFECT_FLAGS)); 
 } 


public void testMergeOverflowGraciously2207() throws Exception { 
     int linecharno = Node.mergeLineCharNo(89, 4096); 
     assertEquals(89, Node.extractLineno(linecharno)); 
     assertEquals(4095, Node.extractCharno(linecharno)); 
 } 


public void testCheckTreeTypeAwareEqualsDifferent2279() { 
     TestErrorReporter testErrorReporter = new TestErrorReporter(null, null); 
     JSTypeRegistry registry = new JSTypeRegistry(testErrorReporter); 
     Node node1 = Node.newString(Token.NAME, "f"); 
     node1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); 
     Node node2 = Node.newString(Token.NAME, "f"); 
     node2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE)); 
     assertFalse(node1.isEquivalentToTyped(node2)); 
 } 


public void testCheckTreeEqualsStringDifferent2434() { 
     Node node1 = new Node(Token.ADD); 
     Node node2 = new Node(Token.SUB); 
     assertNotNull(node1.checkTreeEquals(node2)); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testMergeExtract(int lineno, int charno) {
    int linecharno = Node.mergeLineCharNo(lineno, charno);
    assertEquals(lineno, Node.extractLineno(linecharno));
    assertEquals(charno, Node.extractCharno(linecharno));
  }

  

  // TODO(johnlenz): reenable this test.
  

  

  

  

  

  

  // Verify that annotations on cloned nodes are properly handled.
  

  

  

  

  

  

  

  private static Node getVarRef(String name) {
    return Node.newString(Token.NAME, name);
  }

  private static Node getAssignExpr(String name1, String name2) {
    return new Node(Token.ASSIGN, getVarRef(name1), getVarRef(name2));
  }

  private static Node getNode(String js) {
    /*
    Node root = parse("var a=(" + js + ");");
    Node expr = root.getFirstChild();
    Node var = expr.getFirstChild();
    return var.getFirstChild();
    */
    return null;
  }

  private static Node parse(String string) {
    /*
    CompilerEnvirons environment = new CompilerEnvirons();
    TestErrorReporter testErrorReporter = new TestErrorReporter(null, null);
    environment.setErrorReporter(testErrorReporter);
    environment.setParseJSDoc(true);
    Parser p = new Parser(environment, testErrorReporter);
    return p.parse(string, null, 0);
    */
    return null;
  }
}
