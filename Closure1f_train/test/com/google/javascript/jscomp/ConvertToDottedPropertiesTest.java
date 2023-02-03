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

/**
 * Tests for {@link ConvertToDottedProperties}.
 *
 */
public class ConvertToDottedPropertiesTest extends CompilerTestCase {
  @Override public CompilerPass getProcessor(Compiler compiler) {
    return new ConvertToDottedProperties(compiler);
  }


public void testDoNotConvert118() { 
     testSame("a[0]"); 
     testSame("a['']"); 
     testSame("a[' ']"); 
     testSame("a[',']"); 
     testSame("a[';']"); 
     testSame("a[':']"); 
     testSame("a['.']"); 
     testSame("a['0']"); 
     testSame("a['p ']"); 
     testSame("a['p' + '']"); 
     testSame("a[p]"); 
     testSame("a[P]"); 
     testSame("a[$]"); 
     testSame("a[p()]"); 
     testSame("a['default']"); 
     test("a['\u1d17A']", "a['\u1d17A']"); 
     test("a['\u00d1StuffAfter']", "a['\u00d1StuffAfter']"); 
 } 


public void test5746867648() { 
     testSame("var a = { '$\\\\' : 5 };"); 
     testSame("var a = { 'x\\\\u0041$\\\\' : 5 };"); 
 } 

  

  


  

  
}
