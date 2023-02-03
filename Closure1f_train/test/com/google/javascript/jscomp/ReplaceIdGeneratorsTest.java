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

import com.google.common.collect.ImmutableSet;


/**
 * Tests for {@link ReplaceIdGenerators}.
 *
 */
public class ReplaceIdGeneratorsTest extends CompilerTestCase {

  private boolean generatePseudoNames = false;
  private ReplaceIdGenerators lastPass = null;
  private String previousMappings = null;

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    lastPass = new ReplaceIdGenerators(
        compiler,
        new ImmutableSet.Builder<String>()
            .add("goog.events.getUniqueId")
            .add("goog.place.getUniqueId")
            .build(),
        generatePseudoNames,
        previousMappings);
    return lastPass;
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    generatePseudoNames = false;
    previousMappings = null;
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }


public void testReusePreviousSerializationConsistent185() { 
     previousMappings = "[id]\n" + "\n" + "a:f1\n" + "\n"; 
     testMap("/** @consistentIdGenerator */ id = function() {};" + "f1 = id('f1');" + "f1 = id('f1')", "id = function() {};" + "f1 = 'a';" + "f1 = 'a'", "[id]\n" + "\n" + "a:f1\n" + "\n"); 
 } 


public void testObjLit191() { 
     test("/** @consistentIdGenerator */ get.id = function() {};" + "foo.bar = {a: get.id('foo_bar')}", "get.id = function() {};" + "foo.bar = {a: 'a'}", "get.id = function() {};" + "foo.bar = {a: 'foo_bar$0'}"); 
     testNonPseudoSupportingGenerator("/** @stableIdGenerator */ get.id = function() {};" + "foo.bar = {a: get.id('foo_bar')}", "get.id = function() {};" + "foo.bar = {a: '125lGg'}"); 
 } 


public void testSimpleStable347() { 
     testNonPseudoSupportingGenerator("/** @stableIdGenerator */ id = function() {};" + "foo.bar = id('foo_bar')", "id = function() {};" + "foo.bar = '125lGg'"); 
     testNonPseudoSupportingGenerator("/** @stableIdGenerator */ id = function() {};" + "f1 = id('f1');" + "f1 = id('f1')", "id = function() {};" + "f1 = 'AAAMiw';" + "f1 = 'AAAMiw'"); 
 } 


public void testVar644() { 
     test("/** @consistentIdGenerator */ var id = function() {};" + "foo.bar = id('foo_bar')", "var id = function() {};" + "foo.bar = 'a'", "var id = function() {};" + "foo.bar = 'foo_bar$0'"); 
     testNonPseudoSupportingGenerator("/** @stableIdGenerator */ var id = function() {};" + "foo.bar = id('foo_bar')", "var id = function() {};" + "foo.bar = '125lGg'"); 
 } 


public void testTwoGenerators1031() { 
     test("/** @idGenerator */ var id1 = function() {};" + "/** @idGenerator */ var id2 = function() {};" + "f1 = id1('1');" + "f2 = id1('1');" + "f3 = id2('1');" + "f4 = id2('1');", "var id1 = function() {};" + "var id2 = function() {};" + "f1 = 'a';" + "f2 = 'b';" + "f3 = 'a';" + "f4 = 'b';", "var id1 = function() {};" + "var id2 = function() {};" + "f1 = '1$0';" + "f2 = '1$1';" + "f3 = '1$0';" + "f4 = '1$1';"); 
 } 


public void testConditionalCall1219() { 
     testSame(new String[] { "/** @idGenerator */ var id = function() {}; " + "if(x) id('foo');" }, ReplaceIdGenerators.CONDITIONAL_ID_GENERATOR_CALL); 
     test("/** @consistentIdGenerator */ var id = function() {};" + "function fb() {foo.bar = id('foo_bar')}", "var id = function() {};" + "function fb() {foo.bar = 'a'}", "var id = function() {};" + "function fb() {foo.bar = 'foo_bar$0'}"); 
     testNonPseudoSupportingGenerator("/** @stableIdGenerator */ var id = function() {};" + "function fb() {foo.bar = id('foo_bar')}", "var id = function() {};" + "function fb() {foo.bar = '125lGg'}"); 
 } 


public void testLocalCall1625() { 
     testSame(new String[] { "/** @idGenerator */ var id = function() {}; " + "function Foo() { id('foo'); }" }, ReplaceIdGenerators.NON_GLOBAL_ID_GENERATOR_CALL); 
 } 


public void testConflictingIdGenerator1911() { 
     testSame(new String[] { "/** @idGenerator \n @consistentIdGenerator \n*/" + "var id = function() {}; " }, ReplaceIdGenerators.CONFLICTING_GENERATOR_TYPE); 
     testSame(new String[] { "/** @stableIdGenerator \n @idGenerator \n*/" + "var id = function() {}; " }, ReplaceIdGenerators.CONFLICTING_GENERATOR_TYPE); 
     testSame(new String[] { "/** @stableIdGenerator \n @consistentIdGenerator \n*/" + "var id = function() {}; " }, ReplaceIdGenerators.CONFLICTING_GENERATOR_TYPE); 
     test("/** @consistentIdGenerator */ var id = function() {};" + "if (x) {foo.bar = id('foo_bar')}", "var id = function() {};" + "if (x) {foo.bar = 'a'}", "var id = function() {};" + "if (x) {foo.bar = 'foo_bar$0'}"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testMap(String code, String expected, String expectedMap) {
    test(code, expected);
    assertEquals(expectedMap, lastPass.getSerializedIdMappings());
  }

  private void test(String code, String expected, String expectedPseudo) {
    generatePseudoNames = false;
    test(code, expected);
    generatePseudoNames = true;
    test(code, expectedPseudo);
  }

  private void testNonPseudoSupportingGenerator(String code, String expected) {
    generatePseudoNames = false;
    test(code, expected);
    generatePseudoNames = true;
    test(code, expected);
  }
}
