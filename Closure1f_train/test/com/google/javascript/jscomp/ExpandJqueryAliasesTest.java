/*
 * Copyright 2011 The Closure Compiler Authors.
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
 * Tests for {@link ExpandJqueryAliases}
 */
public class ExpandJqueryAliasesTest extends CompilerTestCase {
  private JqueryCodingConvention conv = new JqueryCodingConvention();

  final DiagnosticType NAME_ERROR =
      ExpandJqueryAliases.JQUERY_UNABLE_TO_EXPAND_INVALID_NAME_ERROR;

  final DiagnosticType INVALID_LIT_ERROR =
      ExpandJqueryAliases.JQUERY_UNABLE_TO_EXPAND_INVALID_LIT_ERROR;

  final DiagnosticType USELESS_EACH_ERROR =
      ExpandJqueryAliases.JQUERY_USELESS_EACH_EXPANSION;

  public ExpandJqueryAliasesTest() {}

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    compiler.options.setCodingConvention(conv);
    return new ExpandJqueryAliases(compiler);
  }


public void testJqueryExtendExpansion46() { 
     String setupCode = "var jQuery={},obj2={};"; 
     testSame(setupCode + "jQuery.extend()"); 
     testSame(setupCode + "jQuery.extend({})"); 
     test(setupCode + "jQuery.extend({a:'test'})", setupCode + "{jQuery.a = 'test';}"); 
     test(setupCode + "jQuery.fn=jQuery.prototype;" + "jQuery.fn.extend({a:'test', b:'test2'});", setupCode + "jQuery.fn=jQuery.prototype;" + "{jQuery.prototype.a = 'test'; jQuery.prototype.b = 'test2';}"); 
     test(setupCode + "jQuery.extend(obj2, {a:'test', b:'test2'});", setupCode + "{obj2=obj2||{}; obj2.a='test'; obj2.b='test2';}"); 
     test(setupCode + "jQuery.extend(jQuery,{a:'test', b:'test2'});", setupCode + "{jQuery = jQuery || {}; jQuery.a = 'test';" + "jQuery.b = 'test2';}"); 
     testSame(setupCode + "obj2.meth=function() { return { a:{} }; };" + "jQuery.extend(obj2.meth().a, {a: 'test'});"); 
 } 


public void testJqueryExpandedEachExpansion291() { 
     String setupCode = "var jQuery={};" + "jQuery.expandedEach=function(vals, callback){};"; 
     testSame(setupCode); 
     test(setupCode + "jQuery.expandedEach({'a': 1, 'b': 2, 'c': 8}," + "function(key, val) { var a = key; jQuery[key] = val; });", setupCode + "(function(){ var a = 'a'; jQuery.a = 1 })();" + "(function(){ var a = 'b'; jQuery.b = 2 })();" + "(function(){ var a = 'c'; jQuery.c = 8 })();"); 
     test(setupCode + "jQuery.expandedEach(['a', 'b', 'c']," + "function(key, val){ jQuery[val] = key; });", setupCode + "(function(){ jQuery.a = 0; })();" + "(function(){ jQuery.b = 1; })();" + "(function(){ jQuery.c = 2 })();"); 
     test(setupCode + "jQuery.expandedEach({'a': 1, 'b': 2, 'c': 8}," + "function(key, val) { var a = key; jQuery[key] = this; });", setupCode + "(function(){ var a = 'a'; jQuery.a = 1 })();" + "(function(){ var a = 'b'; jQuery.b = 2 })();" + "(function(){ var a = 'c'; jQuery.c = 8 })();"); 
     test(setupCode + "jQuery.expandedEach(['a', 'b', 'c']," + "function(key, val){ jQuery[this] = key; });", setupCode + "(function(){ jQuery.a = 0; })();" + "(function(){ jQuery.b = 1; })();" + "(function(){ jQuery.c = 2 })();"); 
     test(setupCode + "jQuery.expandedEach(['a'], function(key,val) {" + "jQuery[val] = key; (function(key) { jQuery[key] = 1;})('test'); })", setupCode + "(function(){ jQuery.a = 0;" + "(function(key){ jQuery[key] = 1})('test') })()"); 
     test(setupCode + "jQuery.expandedEach(['a'], function(key,val) {" + "jQuery[val] = key; (function(key) { var val = 2;" + "jQuery[key] = val;})('test');})", setupCode + "(function(){" + "jQuery.a=0;" + "(function(key){var val = 2; jQuery[key] = val;})('test')})()"); 
     test(setupCode + "jQuery.expandedEach(['a'], function(key,val) {" + "jQuery[val] = key; (function(key1) {" + "function key() {}; key();" + "})('test');})", setupCode + "(function(){" + "jQuery.a=0;(function(key1) {" + "function key() {}; key(); })('test')})()"); 
     test(setupCode + "alert(jQuery.expandedEach(['a']," + "function(key,val) { jQuery[val] = key;})[0])", setupCode + "alert((function(){" + "(function(){ jQuery.a = 0;})(); return ['a']})()[0]);"); 
     testSame(setupCode + "var a = ['a'];" + "jQuery.expandedEach(a, function(key,val){ jQuery[key]=val; })", INVALID_LIT_ERROR); 
     testSame(setupCode + "var obj2={};" + "jQuery.expandedEach(['foo','bar'], function(i, name) {" + "obj2[ '[object ' + name + ']' ] = 'a';});", NAME_ERROR, true); 
     testSame(setupCode + "var obj2={};" + "jQuery.expandedEach(['foo','bar'], function(i, name) {" + "obj2[i] = 1;});", USELESS_EACH_ERROR, false); 
 } 


public void testJqueryFnAliasExpansion436() { 
     String setupCode = "var jQuery={};jQuery.fn=jQuery.prototype;"; 
     testSame(setupCode); 
     test(setupCode + "jQuery.fn.foo='bar';", setupCode + "jQuery.prototype.foo='bar';"); 
     test(setupCode + "jQuerySub.fn.foo='bar';", setupCode + "jQuerySub.prototype.foo='bar';"); 
 } 

  

  

  
}
