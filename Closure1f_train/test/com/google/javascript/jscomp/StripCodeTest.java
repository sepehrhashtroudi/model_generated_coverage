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

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Tests for {@link StripCode}.
 *
 */
public class StripCodeTest extends CompilerTestCase {

  private static final String EXTERNS = "";

  public StripCodeTest() {
    super(EXTERNS, true);
  }

  /**
   * Creates an instance for removing logging code.
   *
   * @param compiler The Compiler
   * @return A new {@link StripCode} instance
   */
  private static StripCode createLoggerInstance(Compiler compiler) {
    Set<String> stripTypes = Sets.newHashSet(
        "goog.debug.DebugWindow",
        "goog.debug.FancyWindow",
        "goog.debug.Formatter",
        "goog.debug.HtmlFormatter",
        "goog.debug.TextFormatter",
        "goog.debug.Logger",
        "goog.debug.LogManager",
        "goog.debug.LogRecord",
        "goog.net.BrowserChannel.LogSaver",
        "GA_GoogleDebugger");

    Set<String> stripNames = Sets.newHashSet(
        "logger",
        "logger_",
        "debugWindow",
        "debugWindow_",
        "logFormatter_",
        "logBuffer_");

    Set<String> stripNamePrefixes = Sets.newHashSet("trace");
    Set<String> stripTypePrefixes = Sets.newHashSet("e.f.Trace");

    return new StripCode(compiler, stripTypes, stripNames, stripTypePrefixes,
        stripNamePrefixes);
  }

  @Override public CompilerPass getProcessor(Compiler compiler) {
    return createLoggerInstance(compiler);
  }


public void testNewOperatior2108() { 
     test("function foo() {} foo.bar = (new goog.debug.Logger()).foo();", "function foo() {} foo.bar = null;"); 
 } 


public void testCrazyNesting4123() { 
     test("var x = function() {}; x(goog.debug.Logger.getLogger());", "var x = function() {}; x(null);"); 
 } 


public void testLoggerDefinedInObjectLiteral4289() { 
     test("a.b.c = {" + "  x: null," + "  get y() {return this.x}," + "  set y(a) {this.x  = goog.debug.Logger.getLogger(a)}" + "};", "a.b.c = {" + "  x: null," + "  get y() {return this.x}," + "  set y(a) {this.x  = null}" + "};"); 
 } 


public void testTypePrefix401() { 
     test("e.f.TraceXXX = function() {}; " + "e.f.TraceXXX.prototype.yyy = 2;", ""); 
 } 


public void testSubPropertyAccessByVariableName951() { 
     test("var x, y = goog.debug.Logger.getLogger('a.b.c');" + "var logger = x;" + "var curlevel = logger.level_ ? logger.getLevel().name : 3;", "var x;var curlevel=null?null:3"); 
 } 


public void testReportErrorOnStripInNestedAssignment995() { 
     test("(foo.logger_ = 7) + 8", "(foo.logger_ = 7) + 8", StripCode.STRIP_ASSIGNMENT_ERROR); 
     test("(goog.debug.Logger.foo = 7) + 8", "(goog.debug.Logger.foo = 7) + 8", StripCode.STRIP_ASSIGNMENT_ERROR); 
     test("(GA_GoogleDebugger.foo = 7) + 8", "(GA_GoogleDebugger.foo = 7) + 8", StripCode.STRIP_ASSIGNMENT_ERROR); 
 } 


public void testClassDefiningCallWithStripType41077() { 
     test("goog.formatter=function(){};" + "goog.formatter.inherits(goog.debug.Formatter)", null, StripCode.STRIP_TYPE_INHERIT_ERROR); 
 } 


public void testLoggerDefinedInObjectLiteral21261() { 
     test("a.b.c = {" + "  x: 0," + "  get logger() {return goog.debug.Logger.getLogger('a.b.c')}" + "};", "a.b.c={x:0}"); 
 } 


public void testLoggerClassDefinition1480() { 
     test("goog.debug.Logger=function(name){this.name_=name}", ""); 
 } 


public void testLoggerDefinedInPrototypeAndUsedInConstructor1482() { 
     test("a.b.c = function(level) {" + "  if (!this.logger.isLoggable(level)) {" + "    this.logger.setLevel(level);" + "  }" + "  this.logger.log(level, 'hi');" + "};" + "a.b.c.prototype.logger = goog.debug.Logger.getLogger('a.b.c');" + "a.b.c.prototype.go = function() { this.logger.finer('x'); };", "a.b.c=function(level){if(!null);};" + "a.b.c.prototype.go=function(){}"); 
 } 


public void testAssignInIf1585() { 
     test("var logger=null;if(x)logger=1;else foo()", "if(x);else foo()"); 
 } 


public void testNamePrefix1661() { 
     test("a = function(traceZZZ) {}; a.prototype.traceXXX = {x: 1};" + "a.prototype.z = function() { this.traceXXX.f(); };" + "var traceYYY = 0;", "a=function(traceZZZ){};a.prototype.z=function(){}"); 
 } 


public void testClassDefiningCallWithStripType81907() { 
     test("goog.debug.DebugWindow = function(){}", ""); 
     test("goog.inherits(goog.debug.DebugWindow,Base)", ""); 
     testSame("goog.debug.DebugWindowFoo=function(){}"); 
     testSame("goog.inherits(goog.debug.DebugWindowFoo,Base)"); 
     testSame("goog.debug.DebugWindowFoo"); 
     testSame("goog.debug.DebugWindowFoo=1"); 
     test("goog.debug.DebugWindow.Foo=function(){}", ""); 
     test("goog.inherits(goog.debug.DebugWindow.Foo,Base)", ""); 
     test("goog.debug.DebugWindow.Foo", ""); 
     test("goog.debug.DebugWindow.Foo=1", ""); 
 } 


public void testStripVarsInitializedFromStrippedNames2014() { 
     test("a = function() { this.logger_ = function() { return 1; }; };" + "a.prototype.b = function() { " + "  var one = this.logger_(); if (one) foo() }", "a=function(){};a.prototype.b=function(){if(null)foo()}"); 
 } 


public void testCrazyNesting12329() { 
     test("var x = {}; x[new goog.debug.Logger()] = 3;", "var x = {}; x[null] = 3;"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
