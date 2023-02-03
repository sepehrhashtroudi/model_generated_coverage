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

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;
import junit.framework.TestCase;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 * Inline function tests.
 * @author johnlenz@google.com (John Lenz)
 */
public class FunctionArgumentInjectorTest extends TestCase {

  // TODO(johnlenz): Add unit tests for:
  //    inject
  //    getFunctionCallParameterMap

  private static final Set<String> EMPTY_STRING_SET = Collections.emptySet();


public void testMaybeAddTempsForCallArguments1461() { 
     testNeededTemps("function foo(a,b){goo();for(;;){a;b;}}; foo(x,y);", "foo", Sets.newHashSet("a", "b")); 
 } 


public void testMaybeAddTempsForCallArguments21649() { 
     testNeededTemps("function foo(a){a;a;}; foo(\"\");", "foo", EMPTY_STRING_SET); 
 } 


public void testFindModifiedParameters6714() { 
     assertEquals(Sets.newHashSet("a", "b"), FunctionArgumentInjector.findModifiedParameters(parseFunction("function f(a,b){ function f(){ a;b; } }"))); 
 } 


public void testFindModifiedParameters31364() { 
     assertEquals(Sets.newHashSet("a"), FunctionArgumentInjector.findModifiedParameters(parseFunction("function f(a){ a=0 }"))); 
 } 


public void testMaybeAddTempsForCallArguments71539() { 
     testNeededTemps("function foo(a){var c; c=0; a;}; foo(x);", "foo", EMPTY_STRING_SET); 
 } 


public void testMaybeAddTempsForCallArgumentsInLoops1870() { 
     testNeededTemps("function foo(a){for(;;)a;}; foo(new Bar());", "foo", Sets.newHashSet("a")); 
     testNeededTemps("function foo(a){while(true)a;}; foo(new Bar());", "foo", Sets.newHashSet("a")); 
     testNeededTemps("function foo(a){do{a;}while(true)}; foo(new Bar());", "foo", Sets.newHashSet("a")); 
 } 


public void testMaybeAddTempsForCallArguments291910() { 
     testNeededTemps("function foo(a){a;a;}; foo(false);", "foo", EMPTY_STRING_SET); 
 } 


public void testMaybeAddTempsForCallArguments272091() { 
     testNeededTemps("function foo(a,b,c){}; foo.call(this,1,goo(),2);", "foo", Sets.newHashSet("b")); 
 } 


public void testMaybeAddTempsForCallArguments92093() { 
     testNeededTemps("function foo(a,b){while(true){a;goo();b;}}; foo(x,y);", "foo", Sets.newHashSet("a", "b")); 
 } 


public void testMaybeAddTempsForCallArguments82290() { 
     testNeededTemps("function foo(a){var c = {}; c.goo=0; a;}; foo(x);", "foo", Sets.newHashSet("a")); 
 } 


public void testMaybeAddTempsForCallArguments62422() { 
     testNeededTemps("function foo(a){x++;a;}; foo(x);", "foo", Sets.newHashSet("a")); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testNeededTemps(
      String code, String fnName, Set<String> expectedTemps) {
    Node n = parse(code);
    Node fn = findFunction(n, fnName);
    assertNotNull(fn);
    Node call = findCall(n, fnName);
    assertNotNull(call);
    Map<String, Node> args =
      FunctionArgumentInjector.getFunctionCallParameterMap(
          fn, call, getNameSupplier());

    Set<String> actualTemps = Sets.newHashSet();
    FunctionArgumentInjector.maybeAddTempsForCallArguments(
        fn, args, actualTemps, new ClosureCodingConvention());

    assertEquals(expectedTemps, actualTemps);
  }

  private static Supplier<String> getNameSupplier() {
    return new Supplier<String>() {
      int i = 0;
      @Override
      public String get() {
        return String.valueOf(i++);
      }
    };
  }

  private static Node findCall(Node n, String name) {
    if (n.isCall()) {
      Node callee;
      if (NodeUtil.isGet(n.getFirstChild())) {
        callee = n.getFirstChild().getFirstChild();
        Node prop = callee.getNext();
        // Only "call" is support at this point.
        Preconditions.checkArgument(prop.isString() &&
            prop.getString().equals("call"));
      } else {
        callee = n.getFirstChild();
      }

      if (callee.isName()
          && callee.getString().equals(name)) {
        return n;
      }
    }

    for (Node c : n.children()) {
      Node result = findCall(c, name);
      if (result != null) {
        return result;
      }
    }

    return null;
  }

  private static Node findFunction(Node n, String name) {
    if (n.isFunction()) {
      if (n.getFirstChild().getString().equals(name)) {
        return n;
      }
    }

    for (Node c : n.children()) {
      Node result = findFunction(c, name);
      if (result != null) {
        return result;
      }
    }

    return null;
  }

  private static Node parseFunction(String js) {
    return parse(js).getFirstChild();
  }

  private static Node parse(String js) {
    Compiler compiler = new Compiler();
    Node n = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    return n;
  }
}
