/*
 * Copyright 2010 The Closure Compiler Authors.
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

import com.google.common.collect.Maps;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 * @author agrieve@google.com (Andrew Grieve)
 */
public class ProcessTweaksTest extends CompilerTestCase {

  Map<String, Node> defaultValueOverrides;
  boolean stripTweaks;

  public ProcessTweaksTest() {
    super("function alert(arg) {}");
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    defaultValueOverrides = Maps.newHashMap();
    stripTweaks = false;
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        ProcessTweaks processTweak =
            new ProcessTweaks(compiler, stripTweaks, defaultValueOverrides);
        processTweak.process(externs, root);

        if (stripTweaks) {
          Set<String> emptySet = Collections.emptySet();
          final StripCode stripCode = new StripCode(compiler, emptySet,
              emptySet, emptySet, emptySet);
          stripCode.enableTweakStripping();
          stripCode.process(externs, root);
        }
      }
    };
  }

  @Override
  protected int getNumRepetitions() {
    // Only do one repetition, so that we can make sure the first pass keeps
    // GlobalNamespace up to date.
    return 1;
  }


public void testWrongGetter3379() { 
     testSame("goog.tweak.registerNumber('TweakA', 'desc');" + "goog.tweak.getBoolean('TweakA')", ProcessTweaks.TWEAK_WRONG_GETTER_TYPE_WARNING); 
 } 


public void testStrippingOfManuallyRegistered1396() { 
     stripTweaks = true; 
     test("var reg = goog.tweak.getRegistry();" + "if (reg) {" + "  reg.register(new goog.tweak.BooleanSetting('foo', 'desc'));" + "  reg.getEntry('foo').setDefaultValue(1);" + "}", "if (null);"); 
 } 


public void testStrippingWithImplicitDefaultValues622() { 
     stripTweaks = true; 
     test("goog.tweak.registerNumber('TweakA', 'desc');" + "goog.tweak.registerBoolean('TweakB', 'desc');" + "goog.tweak.registerString('TweakC', 'desc');" + "alert(goog.tweak.getNumber('TweakA'));" + "alert(goog.tweak.getBoolean('TweakB'));" + "alert(goog.tweak.getString('TweakC'));", "void 0; void 0; void 0; alert(0); alert(false); alert('')"); 
 } 


public void testUnknownOverride727() { 
     testSame("goog.tweak.overrideDefaultValue('huh', 'val')", ProcessTweaks.UNKNOWN_TWEAK_WARNING); 
 } 


public void testCompilerOverridesNoStripping2795() { 
     defaultValueOverrides.put("TweakA", Node.newNumber(1)); 
     defaultValueOverrides.put("TweakB", new Node(Token.FALSE)); 
     defaultValueOverrides.put("TweakC", Node.newString("!")); 
     test("goog.tweak.registerNumber('TweakA', 'desc');" + "goog.tweak.registerBoolean('TweakB', 'desc', true);" + "goog.tweak.registerString('TweakC', 'desc', 'foo');" + "var a = goog.tweak.getCompilerOverrides_();" + "var b = goog.tweak.getCompilerOverrides_()", "goog.tweak.registerNumber('TweakA', 'desc');" + "goog.tweak.registerBoolean('TweakB', 'desc', true);" + "goog.tweak.registerString('TweakC', 'desc', 'foo');" + "var a = { TweakA: 1, TweakB: false, TweakC: '!' };" + "var b = { TweakA: 1, TweakB: false, TweakC: '!' };"); 
 } 


public void testUnknownCompilerOverride819() { 
     allowSourcelessWarnings(); 
     defaultValueOverrides.put("TweakA", Node.newString("!")); 
     testSame("var a", ProcessTweaks.UNKNOWN_TWEAK_WARNING); 
 } 


public void testBasicTweak2840() { 
     testSame("goog.tweak.registerString('Foo', 'Description');" + "goog.tweak.getString('Foo')"); 
 } 


public void testCompilerOverrideWithWrongType1006() { 
     allowSourcelessWarnings(); 
     defaultValueOverrides.put("TweakA", Node.newString("!")); 
     testSame("goog.tweak.registerBoolean('TweakA', 'desc')", ProcessTweaks.INVALID_TWEAK_DEFAULT_VALUE_WARNING); 
 } 


public void testOverrideAfterRegister1295() { 
     test("goog.tweak.registerBoolean('TweakA', 'desc');" + "goog.tweak.overrideDefaultValue('TweakA', 'val')", null, ProcessTweaks.TWEAK_OVERRIDE_AFTER_REGISTERED_ERROR); 
 } 


public void testNonLiteralId31309() { 
     test("var CONST = 'foo'; goog.tweak.overrideDefaultValue(CONST, 3)", null, ProcessTweaks.NON_LITERAL_TWEAK_ID_ERROR); 
 } 


public void testInvalidId1373() { 
     test("goog.tweak.registerBoolean('Some ID', 'a')", null, ProcessTweaks.INVALID_TWEAK_ID_ERROR); 
 } 


public void testInvalidDefaultValue11834() { 
     testSame("var val = true; goog.tweak.registerBoolean('Foo', 'desc', val)", ProcessTweaks.INVALID_TWEAK_DEFAULT_VALUE_WARNING); 
 } 


public void testDuplicateTweak1896() { 
     test("goog.tweak.registerBoolean('TweakA', 'desc');" + "goog.tweak.registerBoolean('TweakA', 'desc')", null, ProcessTweaks.TWEAK_MULTIPLY_REGISTERED_ERROR); 
 } 


public void testRegisterInNonGlobalScope2008() { 
     test("function foo() {goog.tweak.registerBoolean('TweakA', 'desc');};", null, ProcessTweaks.NON_GLOBAL_TWEAK_INIT_ERROR); 
 } 


public void testStrippingWithExplicitDefaultValues2025() { 
     stripTweaks = true; 
     test("goog.tweak.registerNumber('TweakA', 'desc', 5);" + "goog.tweak.registerBoolean('TweakB', 'desc', true);" + "goog.tweak.registerString('TweakC', 'desc', '!');" + "alert(goog.tweak.getNumber('TweakA'));" + "alert(goog.tweak.getBoolean('TweakB'));" + "alert(goog.tweak.getString('TweakC'));", "void 0; void 0; void 0; alert(5); alert(true); alert('!')"); 
 } 


public void testStrippingWithUnregisteredTweak12160() { 
     stripTweaks = true; 
     test("alert(goog.tweak.getNumber('TweakA'));", "alert(0)", null, ProcessTweaks.UNKNOWN_TWEAK_WARNING); 
 } 


public void testStrippingWithInCodeOverrides2226() { 
     stripTweaks = true; 
     test("goog.tweak.overrideDefaultValue('TweakA', 5);" + "goog.tweak.overrideDefaultValue('TweakB', true);" + "goog.tweak.overrideDefaultValue('TweakC', 'bar');" + "goog.tweak.registerNumber('TweakA', 'desc');" + "goog.tweak.registerBoolean('TweakB', 'desc');" + "goog.tweak.registerString('TweakC', 'desc', 'foo');" + "alert(goog.tweak.getNumber('TweakA'));" + "alert(goog.tweak.getBoolean('TweakB'));" + "alert(goog.tweak.getString('TweakC'));", "void 0; void 0; void 0; void 0; void 0; void 0;" + "alert(5); alert(true); alert('bar');"); 
 } 


public void testOverridesWithStripping2453() { 
     stripTweaks = true; 
     defaultValueOverrides.put("TweakA", Node.newNumber(1)); 
     defaultValueOverrides.put("TweakB", new Node(Token.FALSE)); 
     defaultValueOverrides.put("TweakC", Node.newString("!")); 
     test("goog.tweak.overrideDefaultValue('TweakA', 5);" + "goog.tweak.overrideDefaultValue('TweakC', 'bar');" + "goog.tweak.registerNumber('TweakA', 'desc');" + "goog.tweak.registerBoolean('TweakB', 'desc', true);" + "goog.tweak.registerString('TweakC', 'desc', 'foo');" + "alert(goog.tweak.getNumber('TweakA'));" + "alert(goog.tweak.getBoolean('TweakB'));" + "alert(goog.tweak.getString('TweakC'));", "void 0; void 0; void 0; void 0; void 0; " + "alert(1); alert(false); alert('!')"); 
 } 


public void testBasicTweak32464() { 
     testSame("goog.tweak.registerNumber('Foo', 'Description');" + "goog.tweak.getNumber('Foo')"); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
