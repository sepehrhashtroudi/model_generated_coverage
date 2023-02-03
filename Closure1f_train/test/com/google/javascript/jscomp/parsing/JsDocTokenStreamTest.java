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

package com.google.javascript.jscomp.parsing;

import static com.google.javascript.jscomp.parsing.JsDocToken.ANNOTATION;
import static com.google.javascript.jscomp.parsing.JsDocToken.BANG;
import static com.google.javascript.jscomp.parsing.JsDocToken.COLON;
import static com.google.javascript.jscomp.parsing.JsDocToken.COMMA;
import static com.google.javascript.jscomp.parsing.JsDocToken.ELLIPSIS;
import static com.google.javascript.jscomp.parsing.JsDocToken.EOC;
import static com.google.javascript.jscomp.parsing.JsDocToken.EOF;
import static com.google.javascript.jscomp.parsing.JsDocToken.EOL;
import static com.google.javascript.jscomp.parsing.JsDocToken.EQUALS;
import static com.google.javascript.jscomp.parsing.JsDocToken.GT;
import static com.google.javascript.jscomp.parsing.JsDocToken.LB;
import static com.google.javascript.jscomp.parsing.JsDocToken.LC;
import static com.google.javascript.jscomp.parsing.JsDocToken.LP;
import static com.google.javascript.jscomp.parsing.JsDocToken.LT;
import static com.google.javascript.jscomp.parsing.JsDocToken.PIPE;
import static com.google.javascript.jscomp.parsing.JsDocToken.QMARK;
import static com.google.javascript.jscomp.parsing.JsDocToken.RB;
import static com.google.javascript.jscomp.parsing.JsDocToken.RC;
import static com.google.javascript.jscomp.parsing.JsDocToken.RP;
import static com.google.javascript.jscomp.parsing.JsDocToken.STAR;
import static com.google.javascript.jscomp.parsing.JsDocToken.STRING;

import com.google.common.collect.ImmutableList;

import junit.framework.TestCase;

import java.util.List;

/**
 * Tests for {@link JsDocTokenStream}.
 */
public class JsDocTokenStreamTest extends TestCase {


public void testJsDocTokenization1125() throws Exception { 
     List<JsDocToken> tokens = ImmutableList.of(ANNOTATION, LC, STRING, QMARK, RC, EOC, EOF); 
     List<String> strings = ImmutableList.of("param", "string"); 
     testJSDocTokenStream("@param {string?}*/", tokens, strings); 
     testJSDocTokenStream(" @param {string?}*/", tokens, strings); 
     testJSDocTokenStream("@param { string?}*/", tokens, strings); 
     testJSDocTokenStream("@param {string ?}*/", tokens, strings); 
     testJSDocTokenStream("@param  {string ?  } */", tokens, strings); 
     testJSDocTokenStream("@param { string  ?  }*/", tokens, strings); 
     testJSDocTokenStream("@param {string?  }*/", tokens, strings); 
 } 


public void testJsDocTokenization966() throws Exception { 
     List<JsDocToken> tokens = ImmutableList.of(STAR, ANNOTATION, STRING, STRING, STRING, STRING, STRING, ANNOTATION, STRING, EOL, EOC); 
     List<String> strings = ImmutableList.of("param", "foo.Bar", "opt_name", "this", "parameter", "does", "media", "blah"); 
     testJSDocTokenStream(" * @param foo.Bar opt_name this parameter does @media blah\n" + " */", tokens, strings); 
 } 


public void testJsDocTokenization16147() throws Exception { 
     List<JsDocToken> tokens = ImmutableList.of(STRING, COLON, COLON, COLON, ELLIPSIS, STRING, COLON, STRING, EOC); 
     List<String> strings = ImmutableList.of("foo", "bar", "bar2"); 
     testJSDocTokenStream("foo:::...bar:bar2*/", tokens, strings); 
 } 


public void testJsDocTokenization3241() throws Exception { 
     List<JsDocToken> tokens = ImmutableList.of(ANNOTATION, LC, STRING, LT, STRING, PIPE, STRING, GT, RC); 
     List<String> strings = ImmutableList.of("param", "Array", "string", "null"); 
     testJSDocTokenStream("@param {Array.<string||null>}", tokens, strings); 
     testJSDocTokenStream("@param {Array.< string || null> }", tokens, strings); 
     testJSDocTokenStream("@param {Array.<string || null >  } ", tokens, strings); 
     testJSDocTokenStream("@param {Array .<string   ||null>}", tokens, strings); 
     testJSDocTokenStream("@param {Array.< string||null>}", tokens, strings); 
     testJSDocTokenStream("@param {  Array.<string||null>}", tokens, strings); 
     testJSDocTokenStream(" @param   {Array.<string||null>}", tokens, strings); 
     testJSDocTokenStream("@param   {   Array.<string|| null> }", tokens, strings); 
 } 


public void testJsDocTokenization21480() throws Exception { 
     List<JsDocToken> tokens = ImmutableList.of(ANNOTATION, LC, STRING, EQUALS, RC, EOC, EOF); 
     List<String> strings = ImmutableList.of("param", "Object"); 
     testJSDocTokenStream("@param {Object=}*/", tokens, strings); 
     testJSDocTokenStream(" @param {Object=}*/", tokens, strings); 
     testJSDocTokenStream("@param { Object =}*/", tokens, strings); 
     testJSDocTokenStream("@param { Object=}*/", tokens, strings); 
     testJSDocTokenStream("@param  {Object=  } */", tokens, strings); 
     testJSDocTokenStream("@param { Object = }*/", tokens, strings); 
     testJSDocTokenStream("@param {Object=  }*/", tokens, strings); 
 } 


public void testJsDocTokenization20666() throws Exception { 
     List<JsDocToken> tokens = ImmutableList.of(ANNOTATION, LC, BANG, STRING, RC, EOC, EOF); 
     List<String> strings = ImmutableList.of("param", "Object"); 
     testJSDocTokenStream("@param {!Object}*/", tokens, strings); 
     testJSDocTokenStream(" @param {!Object}*/", tokens, strings); 
     testJSDocTokenStream("@param {! Object}*/", tokens, strings); 
     testJSDocTokenStream("@param { !Object}*/", tokens, strings); 
     testJSDocTokenStream("@param  {!Object  } */", tokens, strings); 
     testJSDocTokenStream("@param {  ! Object  }*/", tokens, strings); 
     testJSDocTokenStream("@param {!Object  }*/", tokens, strings); 
 } 


public void testJsDocTokenization4842() throws Exception { 
     List<JsDocToken> tokens = ImmutableList.of(ANNOTATION, LC, STRING, LT, LP, STRING, COMMA, STRING, RP, GT, RC, EOF); 
     List<String> strings = ImmutableList.of("param", "Array", "string", "null"); 
     testJSDocTokenStream("@param {Array.<(string,null)>}", tokens, strings); 
     testJSDocTokenStream("@param {Array  .<(string,null)> } ", tokens, strings); 
     testJSDocTokenStream(" @param {Array.<  (  string,null)>}", tokens, strings); 
     testJSDocTokenStream("@param {Array.<(string  , null)>}", tokens, strings); 
     testJSDocTokenStream("@param {Array.<(string,   null)  > }  ", tokens, strings); 
     testJSDocTokenStream("@param {  Array  .<  (string,null)>}   ", tokens, strings); 
 } 


public void testJsDocTokenization15966() throws Exception { 
     List<JsDocToken> tokens = ImmutableList.of(STRING, LB, STRING, COMMA, ELLIPSIS, EOC); 
     List<String> strings = ImmutableList.of("foo", "bar"); 
     testJSDocTokenStream("foo[ bar,...*/", tokens, strings); 
     testJSDocTokenStream("foo[ bar ,...*/", tokens, strings); 
     testJSDocTokenStream("foo[bar, ...*/", tokens, strings); 
     testJSDocTokenStream("foo[ bar  ,   ...  */", tokens, strings); 
     testJSDocTokenStream("foo [bar,... */", tokens, strings); 
 } 


public void testJsDocTokenization13979() throws Exception { 
     List<JsDocToken> tokens = ImmutableList.of(ELLIPSIS, LB, STRING, RB, EOC); 
     List<String> strings = ImmutableList.of("number"); 
     testJSDocTokenStream("...[number]*/", tokens, strings); 
 } 


public void testJsDocTokenization171049() throws Exception { 
     List<JsDocToken> tokens = ImmutableList.of(STRING, EOL, EOC); 
     List<String> strings = ImmutableList.of(".."); 
     testJSDocTokenStream("..\n*/", tokens, strings); 
 } 


public void testJsDocTokenization71614() throws Exception { 
     List<JsDocToken> tokens = ImmutableList.of(ELLIPSIS, ELLIPSIS, ELLIPSIS, ELLIPSIS, ELLIPSIS, LT, EOC); 
     List<String> strings = ImmutableList.of(); 
     testJSDocTokenStream("................<*/", tokens, strings); 
     testJSDocTokenStream("............... .<*/", tokens, strings); 
     testJSDocTokenStream("................< */", tokens, strings); 
     testJSDocTokenStream("............... .< */", tokens, strings); 
     testJSDocTokenStream("............... .< */ ", tokens, strings); 
     testJSDocTokenStream(" ............... .< */ ", tokens, strings); 
 } 


public void testJsDocTokenization142428() throws Exception { 
     List<JsDocToken> tokens = ImmutableList.of(STRING, LB, STRING, EOC); 
     List<String> strings = ImmutableList.of("foo", "bar..."); 
     testJSDocTokenStream("foo[ bar...*/", tokens, strings); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testJSDocTokenStream(String comment, List<JsDocToken> tokens,
      List<String> strings) {
    JsDocTokenStream stream = new JsDocTokenStream(comment, 0);
    int stringsIndex = 0;
    for (JsDocToken token : tokens) {
      JsDocToken readToken = stream.getJsDocToken();

      // token equality
      if (token != readToken) {
        assertEquals(token, readToken);
      }

      // string equality
      if (token == ANNOTATION || token == STRING) {
        assertEquals(strings.get(stringsIndex++), stream.getString());
      }
    }
  }
}
