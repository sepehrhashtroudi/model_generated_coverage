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

package com.google.javascript.jscomp.parsing;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.jscomp.testing.TestErrorReporter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.Token.CommentType;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class JsDocInfoParserTest extends BaseJSTypeTestCase {

  private Set<String> extraAnnotations;
  private Set<String> extraSuppressions;
  private Node.FileLevelJsDocBuilder fileLevelJsDocBuilder = null;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    extraAnnotations =
        Sets.newHashSet(
            ParserRunner.createConfig(true, LanguageMode.ECMASCRIPT3, false)
                .annotationNames.keySet());
    extraSuppressions =
        Sets.newHashSet(
            ParserRunner.createConfig(true, LanguageMode.ECMASCRIPT3, false)
                .suppressionNames);

    extraSuppressions.add("x");
    extraSuppressions.add("y");
    extraSuppressions.add("z");
  }


public void testParseDesc968() throws Exception { 
     String comment = "@desc\n.\n,\n{\n)\n}\n|\n.<\n>\n<\n?\n~\n+\n-\n;\n:\n*/"; 
     assertEquals(". , { ) } | .< > < ? ~ + - ; :", parse(comment).getDescription()); 
 } 


public void testParseRecordType784() throws Exception { 
     parseFull("/** @param {{'x' : !hello}} n\n*/"); 
 } 


public void testTypeTagConflict290() throws Exception { 
     parse("@interface \n * @interface */", "Bad type annotation. " + "type annotation incompatible with other annotations"); 
 } 


public void testTypeTagConflict18151() throws Exception { 
     parse("/**\n" + " * @dict\n" + " * @dict\n" + " */\n" + "function DictDict() {}", "Bad type annotation. " + "type annotation incompatible with other annotations"); 
 } 


public void testParseNewline3158() throws Exception { 
     JSDocInfo info = parse("@type !Array.<(number,\n* null)>*/"); 
     assertTypeEquals(parameterize(ARRAY_TYPE, createUnionType(NUMBER_TYPE, NULL_TYPE)), info.getType()); 
 } 


public void testSourceName177() throws Exception { 
     JSDocInfo jsdoc = parse("@deprecated */", true); 
     assertEquals("testcode", jsdoc.getAssociatedNode().getSourceFileName()); 
 } 


public void testParseParam7215() throws Exception { 
     JSDocInfo info = parse("@param {number=} index */"); 
     assertTypeEquals(registry.createOptionalType(NUMBER_TYPE), info.getParameterType("index")); 
 } 


public void testParserWithTwoTemplates250() { 
     parse("@template T,V */"); 
 } 


public void testParseNoCheck2300() throws Exception { 
     parse("@notypecheck\n@notypecheck*/", "extra @notypecheck tag"); 
 } 


public void testParseOptionalModifier310() throws Exception { 
     JSDocInfo info = parse("@type {function(number=)}*/"); 
     assertTypeEquals(registry.createFunctionType(UNKNOWN_TYPE, registry.createOptionalParameters(NUMBER_TYPE)), info.getType()); 
 } 


public void testParseWithMarkerNames2316() throws Exception { 
     JSDocInfo jsdoc = parse("@param {SomeType} name somedescription \n" + "* @param {AnotherType} anothername des */", true); 
     assertTypeInMarker(assertNameInMarker(assertAnnotationMarker(jsdoc, "param", 0, 0, 0), "name", 0, 18), "SomeType", 0, 7, 0, 16, true); 
     assertTypeInMarker(assertNameInMarker(assertAnnotationMarker(jsdoc, "param", 1, 2, 1), "anothername", 1, 23), "AnotherType", 1, 9, 1, 21, true); 
 } 


public void testParseLends3336() throws Exception { 
     parse("@lends {name */", "Bad type annotation. expected closing }"); 
 } 


public void testGetOriginalCommentString391() throws Exception { 
     String comment = "* @desc This is a comment */"; 
     JSDocInfo info = parse(comment); 
     assertNull(info.getOriginalCommentString()); 
     info = parse(comment, true); 
     assertEquals(comment, info.getOriginalCommentString()); 
 } 


public void testParseExterns2405() throws Exception { 
     parseFileOverview("@externs\n@externs*/", "extra @externs tag"); 
 } 


public void testTypeTagConflict22432() throws Exception { 
     parse("/**\n" + " * @protected {string}\n" + " * @param {string} x\n" + " */\n" + "function DictDict(x) {}", "Bad type annotation. " + "type annotation incompatible with other annotations"); 
 } 


public void testParseParamError2456() throws Exception { 
     parseFull("/** @param {Number}*/", "Bad type annotation. expecting a variable name in a @param tag"); 
 } 


public void testWhitelistedAnnotations466() { 
     parse("* @addon \n" + "* @augments \n" + "* @base \n" + "* @borrows \n" + "* @bug \n" + "* @class \n" + "* @config \n" + "* @constructs \n" + "* @default \n" + "* @description \n" + "* @event \n" + "* @example \n" + "* @exception \n" + "* @exec \n" + "* @externs \n" + "* @field \n" + "* @function \n" + "* @id \n" + "* @ignore \n" + "* @inner \n" + "* @lends {string} \n" + "* @link \n" + "* @member \n" + "* @memberOf \n" + "* @modName \n" + "* @mods \n" + "* @name \n" + "* @namespace \n" + "* @nocompile \n" + "* @property \n" + "* @requires \n" + "* @since \n" + "* @static \n" + "* @supported */"); 
 } 


public void testParseExpose1478() throws Exception { 
     assertTrue(parse("@expose*/").isExpose()); 
 } 


public void testBadModifies4483() throws Exception { 
     parse("@modifies {this|arguments */", "malformed @modifies tag"); 
 } 


public void testParseFunctionalType10516() throws Exception { 
     testParseType("function(...[Object?]):boolean?", "function (...[(Object|null)]): (boolean|null)"); 
 } 


public void testParseExport2553() throws Exception { 
     parse("@export\n@export*/", "extra @export tag"); 
 } 


public void testParseBlockComment2555() throws Exception { 
     JSDocInfo jsdoc = parse("this is a nice comment\n " + "* that is *** multiline \n" + "* @author abc@google.com */", true); 
     assertEquals("this is a nice comment\nthat is *** multiline", jsdoc.getBlockDescription()); 
     assertDocumentationInMarker(assertAnnotationMarker(jsdoc, "author", 2, 2), "abc@google.com", 9, 2, 23); 
 } 


public void testParseNoCheck1569() throws Exception { 
     assertTrue(parse("@notypecheck*/").isNoTypeCheck()); 
 } 


public void testRegression1615() throws Exception { 
     String comment = " * @param {number} index the index of blah\n" + " * @return {boolean} whatever\n" + " * @private\n" + " */"; 
     JSDocInfo info = parse(comment); 
     assertEquals(1, info.getParameterCount()); 
     assertTypeEquals(NUMBER_TYPE, info.getParameterType("index")); 
     assertTypeEquals(BOOLEAN_TYPE, info.getReturnType()); 
     assertEquals(Visibility.PRIVATE, info.getVisibility()); 
 } 


public void testParseArrayType3656() throws Exception { 
     testParseType("[[number],[string]]?", "(Array|null)"); 
 } 


public void testParseWithMarkers5672() throws Exception { 
     JSDocInfo jsdoc = parse("@return some long \n * multiline" + " \n * description */", true); 
     assertDocumentationInMarker(assertAnnotationMarker(jsdoc, "return", 0, 0), "some long multiline description", 8, 2, 15); 
 } 


public void testParseOverride2678() throws Exception { 
     parse("@override\n@override*/", "Bad type annotation. extra @override/@inheritDoc tag"); 
 } 


public void testAuthorMissing697() throws Exception { 
     parse("* @author */", true, "@author tag missing author"); 
 } 


public void testBug909468785() throws Exception { 
     parse("@extends {(x)}*/", "Bad type annotation. expecting a type name"); 
 } 


public void testParseRecordType12881() throws Exception { 
     parseFull("/** @param {{!hello : hey}} n\n*/", "Bad type annotation. type not recognized due to syntax error"); 
 } 


public void testParseLicenseWithAnnotation908() throws Exception { 
     Node node = new Node(1); 
     this.fileLevelJsDocBuilder = node.getJsDocBuilderForNode(); 
     String comment = "@license Foo \n * @author Charlie Brown */"; 
     parse(comment); 
     assertEquals(" Foo \n @author Charlie Brown ", node.getJSDocInfo().getLicense()); 
 } 


public void testMalformedThisAnnotation913() throws Exception { 
     parse("@this */", "Bad type annotation. type not recognized due to syntax error"); 
 } 


public void testParseDefine4916() throws Exception { 
     assertTypeEquals(NUMBER_TYPE, parse("@define {number}*/").getType()); 
 } 


public void testBadClassMultiExtends945() throws Exception { 
     parse(" * @extends {Extended1} \n" + " * @constructor \n" + " * @extends {Extended2} */", "Bad type annotation. type annotation incompatible with other " + "annotations"); 
 } 


public void testRegression8955() throws Exception { 
     String comment = " * @name random tag here\n" + " * @desc description here\n" + " *\n" + " * @param {boolean} flag and some more description\n" + " *     nicely formatted\n" + " */"; 
     JSDocInfo info = parse(comment); 
     assertEquals(1, info.getParameterCount()); 
     assertTypeEquals(BOOLEAN_TYPE, info.getParameterType("flag")); 
     assertEquals("description here", info.getDescription()); 
 } 


public void testParseRecordType21973() throws Exception { 
     parseFull("/** @param {{x : hello, 'y'}|boolean} n\n*/"); 
 } 


public void testParseNoCompile2984() throws Exception { 
     parseFileOverview("@nocompile\n@nocompile*/", "extra @nocompile tag"); 
 } 


public void testParseDuplicateImplicitCast1001() throws Exception { 
     parse("@type {string} \n * @implicitCast \n * @implicitCast*/", "Bad type annotation. extra @implicitCast tag"); 
 } 


public void testSuppress11007() throws Exception { 
     JSDocInfo info = parse("@suppress {x} */"); 
     assertEquals(Sets.newHashSet("x"), info.getSuppressions()); 
 } 


public void testModifies61020() throws Exception { 
     JSDocInfo info = parse("@param {*} x\n" + " * @param {*} y\n" + " * @modifies {x|y} */"); 
     assertEquals(Sets.newHashSet("x", "y"), info.getModifies()); 
 } 


public void testParseUndefinedType31025() throws Exception { 
     assertTypeEquals(VOID_TYPE, parse("@type {void}*/").getType()); 
 } 


public void testParseUnionType91053() throws Exception { 
     JSDocInfo info = parse("@type {Array.<boolean>||null}*/"); 
     assertTypeEquals(createUnionType(parameterize(ARRAY_TYPE, BOOLEAN_TYPE), NULL_TYPE), info.getType()); 
 } 


public void testBadSuppress41054() throws Exception { 
     parse("@suppress {x|y */", "malformed @suppress tag"); 
 } 


public void testTypeTagConflict31070() throws Exception { 
     parse("@constructor \n * @interface */", "Bad type annotation. cannot be both an interface and a constructor"); 
 } 


public void testParseReturnType21073() throws Exception { 
     JSDocInfo info = parse("@returns {null|(string,Array.<boolean>)}*/"); 
     assertTypeEquals(createUnionType(parameterize(ARRAY_TYPE, BOOLEAN_TYPE), NULL_TYPE, STRING_TYPE), info.getReturnType()); 
 } 


public void testBadTypeDefInterfaceAndConstructor11086() throws Exception { 
     JSDocInfo jsdoc = parse("@interface\n@constructor*/", "Bad type annotation. cannot be both an interface and a constructor"); 
     assertTrue(jsdoc.isInterface()); 
 } 


public void testFileOverviewSingleLine1087() throws Exception { 
     JSDocInfo jsdoc = parseFileOverview("@fileoverview Hi mom! */"); 
     assertEquals("Hi mom!", jsdoc.getFileOverview()); 
 } 


public void testParseExtendsGenerics1098() throws Exception { 
     JSDocInfo info = parse("@extends com.google.Foo.Bar.Hello.World.<Boolean,number>*/"); 
     assertTypeEquals(registry.createNamedType("com.google.Foo.Bar.Hello.World", null, -1, -1), info.getBaseType()); 
 } 


public void testBadModifies71101() throws Exception { 
     parse("@modifies {impossible} */", "unknown @modifies parameter: impossible"); 
 } 


public void testParseThrows21129() throws Exception { 
     JSDocInfo info = parse("@throws {number} Some number\n " + "*@throws {String} A string */"); 
     assertEquals(2, info.getThrownTypes().size()); 
     assertTypeEquals(NUMBER_TYPE, info.getThrownTypes().get(0)); 
 } 


public void testParseImplementsSameTwice1142() throws Exception { 
     parse("* @implements {Smth}\n" + "* @implements {Smth}\n" + "*/", "Bad type annotation. duplicate @implements tag"); 
 } 


public void testParseWithMarkerNames31159() throws Exception { 
     JSDocInfo jsdoc = parse("@param {Some.Long.Type.\n *  Name} name somedescription */", true); 
     assertTypeInMarker(assertNameInMarker(assertAnnotationMarker(jsdoc, "param", 0, 0, 0), "name", 1, 10), "Some.Long.Type.Name", 0, 7, 1, 8, true); 
 } 


public void testParseWithMarkers11165() throws Exception { 
     JSDocInfo jsdoc = parse("@author abc@google.com */", true); 
     assertDocumentationInMarker(assertAnnotationMarker(jsdoc, "author", 0, 0), "abc@google.com", 7, 0, 21); 
 } 


public void testParseRecordType191167() throws Exception { 
     parseFull("/** @param {?{x : hello, 'y'}} n\n*/"); 
 } 


public void testParseJavaDispatch31173() throws Exception { 
     assertNull(parseFileOverview("@javadispatch*/")); 
 } 


public void testParseFunctionalType81213() throws Exception { 
     testParseType("function(this:Array,...[boolean])", "function (this:Array, ...[boolean]): ?"); 
 } 


public void testParseInvalidTypeViaStatic21225() throws Exception { 
     Node typeNode = parseType(""); 
     assertNull(typeNode); 
 } 


public void testVersionDuplication1249() throws Exception { 
     parse("* @version Some old version" + "\n* @version Another version*/", true, "conflicting @version tag"); 
 } 


public void testAuthors1283() throws Exception { 
     JSDocInfo jsdoc = parse("@param {Number} number42 This is a description." + "\n* @param {Integer} number87 This is another description." + "\n* @author a@google.com (A Person)" + "\n* @author b@google.com (B Person)" + "\n* @author c@google.com (C Person)*/", true); 
     Collection<String> authors = jsdoc.getAuthors(); 
     assertTrue(authors != null); 
     assertTrue(authors.size() == 3); 
     assertContains(authors, "a@google.com (A Person)"); 
     assertContains(authors, "b@google.com (B Person)"); 
     assertContains(authors, "c@google.com (C Person)"); 
 } 


public void testBadSuppress11297() throws Exception { 
     parse("@suppress {} */", "malformed @suppress tag"); 
 } 


public void testRegression51312() throws Exception { 
     String comment = "@const\n@enum {string}\n@public*/"; 
     JSDocInfo info = parse(comment); 
     assertTrue(info.isConstant()); 
     assertFalse(info.isDefine()); 
     assertTypeEquals(STRING_TYPE, info.getEnumParameterType()); 
     assertEquals(Visibility.PUBLIC, info.getVisibility()); 
 } 


public void testParseFunctionalTypeError51345() throws Exception { 
     parse("@type {function (thi:Array)}*/", "Bad type annotation. missing closing )"); 
 } 


public void testRegression41352() throws Exception { 
     String comment = " * @const\n" + " * @hidden\n" + " * @preserveTry\n" + " * @constructor\n" + " */"; 
     JSDocInfo info = parse(comment); 
     assertTrue(info.isConstant()); 
     assertFalse(info.isDefine()); 
     assertTrue(info.isConstructor()); 
     assertTrue(info.isHidden()); 
     assertTrue(info.shouldPreserveTry()); 
 } 


public void testTypeTagConflict171366() throws Exception { 
     parse("/**\n" + " * @interface\n" + " * @struct\n" + " */\n" + "function StrIntf() {}", "Bad type annotation. " + "type annotation incompatible with other annotations"); 
 } 


public void testInterfaceExtends1367() throws Exception { 
     JSDocInfo jsdoc = parse(" * @interface \n" + " * @extends {Extended} */"); 
     assertTrue(jsdoc.isInterface()); 
     assertEquals(1, jsdoc.getExtendedInterfacesCount()); 
     List<JSTypeExpression> types = jsdoc.getExtendedInterfaces(); 
     assertTypeEquals(registry.createNamedType("Extended", null, -1, -1), types.get(0)); 
 } 


public void testParseExtendsNullable21396() throws Exception { 
     parse("@extends Base? */", "Bad type annotation. expected end of line or comment"); 
 } 


public void testParseDesc121411() throws Exception { 
     String comment = "@desc\n:\n[\n]\n...*/"; 
     assertEquals(": [ ] ...", parse(comment).getDescription()); 
 } 


public void testParseFunctionalType191418() throws Exception { 
     testParseType("function(...[?]): void", "function (...[?]): undefined"); 
 } 


public void testBadModifies81425() throws Exception { 
     parse("@modifies {this}\n" + "@nosideeffects */", "conflicting @nosideeffects tag"); 
 } 


public void testParseParam151434() throws Exception { 
     JSDocInfo info = parse("@param {string} [index */", "Bad type annotation. missing closing ]"); 
     assertEquals(1, info.getParameterCount()); 
     assertTypeEquals(STRING_TYPE, info.getParameterType("index")); 
 } 


public void testParseUnionType131438() throws Exception { 
     testParseType("(function(this:Date),function(this:String):number)", "Function"); 
 } 


public void testBadSuppress71441() throws Exception { 
     parse("@suppress {impossible} */", "unknown @suppress parameter: impossible"); 
 } 


public void testParseFunctionalType131459() throws Exception { 
     testParseType("function(...): void", "function (...[?]): undefined"); 
 } 


public void testTypeTagConflict91472() throws Exception { 
     parse("@enum {string} \n * @return {boolean} */", "Bad type annotation. " + "type annotation incompatible with other annotations"); 
 } 


public void testParseMeaning31479() throws Exception { 
     JSDocInfo info = parse("@meaning  tigers\n * and lions\n * @desc  and bears */"); 
     assertEquals("tigers and lions", info.getMeaning()); 
     assertEquals("and bears", info.getDescription()); 
 } 


public void testParseTypeViaStatic31500() throws Exception { 
     Node typeNode = parseType("!Date"); 
     assertTypeEquals(DATE_TYPE, typeNode); 
 } 


public void testParseParam141514() throws Exception { 
     JSDocInfo info = parse("@param {string} [index] */"); 
     assertEquals(1, info.getParameterCount()); 
     assertTypeEquals(registry.createOptionalType(STRING_TYPE), info.getParameterType("index")); 
 } 


public void testTypeTagConflict81544() throws Exception { 
     parse("@typedef {string} \n * @return {boolean} */", "Bad type annotation. " + "type annotation incompatible with other annotations"); 
 } 


public void testReferences1553() throws Exception { 
     JSDocInfo jsdoc = parse("@see A cool place!" + "\n* @see The world." + "\n* @see SomeClass#SomeMember" + "\n* @see A boring test case*/", true); 
     Collection<String> references = jsdoc.getReferences(); 
     assertTrue(references != null); 
     assertTrue(references.size() == 4); 
     assertContains(references, "A cool place!"); 
     assertContains(references, "The world."); 
     assertContains(references, "SomeClass#SomeMember"); 
     assertContains(references, "A boring test case"); 
 } 


public void testParserWithTemplateTypeNameMissing1566() { 
     parse("@template */", "Bad type annotation. @template tag missing type name"); 
 } 


public void testParseDefine21577() throws Exception { 
     assertTypeEquals(STRING_TYPE, parse("@define {string*/", "Bad type annotation. expected closing }").getType()); 
 } 


public void testTypeTagConflict101578() throws Exception { 
     parse("@this {Object} \n * @enum {boolean} */", "Bad type annotation. " + "type annotation incompatible with other annotations"); 
 } 


public void testParseFunctionalType51623() throws Exception { 
     testParseType("function (number, ...[string]): boolean"); 
 } 


public void testSingleTagsReordered1641() throws Exception { 
     JSDocInfo jsdoc = parse("@deprecated In favor of the new one!" + "\n * @return {SomeType} The most important object :-)" + "\n * @version Some old version*/", true); 
     assertTrue(jsdoc.isDeprecated()); 
     assertEquals("In favor of the new one!", jsdoc.getDeprecationReason()); 
     assertEquals("Some old version", jsdoc.getVersion()); 
     assertEquals("The most important object :-)", jsdoc.getReturnDescription()); 
 } 


public void testParseNullableModifiers41660() throws Exception { 
     JSDocInfo info = parse("@type {(string,boolean)?}*/"); 
     assertTypeEquals(createNullableType(createUnionType(STRING_TYPE, BOOLEAN_TYPE)), info.getType()); 
 } 


public void testParseFunctionalTypeError61662() throws Exception { 
     resolve(parse("@type {function (this:number)}*/").getType(), "this type must be an object type"); 
 } 


public void testParsePreserve1670() throws Exception { 
     Node node = new Node(1); 
     this.fileLevelJsDocBuilder = node.getJsDocBuilderForNode(); 
     String comment = "@preserve Foo\nBar\n\nBaz*/"; 
     parse(comment); 
     assertEquals(" Foo\nBar\n\nBaz", node.getJSDocInfo().getLicense()); 
 } 


public void testParseFunctionalTypeError41680() throws Exception { 
     parse("@type {function(string, ...[number], boolean):string}*/", "Bad type annotation. variable length argument must be last"); 
 } 


public void testParseFunctionalTypeError71689() throws Exception { 
     parse("@type {function(...[number)}*/", "Bad type annotation. missing closing ]"); 
 } 


public void testParseDeprecated21702() throws Exception { 
     parse("@deprecated\n@deprecated*/", "extra @deprecated tag"); 
 } 


public void testParseInvalidTypeViaStatic1732() throws Exception { 
     Node typeNode = parseType("sometype.<anothertype"); 
     assertNull(typeNode); 
 } 


public void testSeeMissing1737() throws Exception { 
     parse("* @see */", true, "@see tag missing description"); 
 } 


public void testFullRegression31746() throws Exception { 
     parseFull("/**..\n*/"); 
 } 


public void testParseLends61752() throws Exception { 
     parse("@lends {string} \n * @lends {string} */", "Bad type annotation. @lends tag incompatible with other annotations"); 
 } 


public void testParseParamError51806() throws Exception { 
     parse("@param {number} x \n * @param {string} x */", "Bad type annotation. duplicate variable name \"x\""); 
 } 


public void testParseDefineErrors51830() throws Exception { 
     parse("@return {string}\n @define {string} */", "conflicting @define tag"); 
 } 


public void testWhitelistedNewAnnotations1837() { 
     parse("@foobar */", "illegal use of unknown JSDoc tag \"foobar\"; ignoring it"); 
     extraAnnotations.add("foobar"); 
     parse("@foobar */"); 
 } 


public void testBadImplementsWithNullable1848() throws Exception { 
     JSDocInfo jsdoc = parse("@implements {Disposable?}\n * @constructor */", "Bad type annotation. expected closing }"); 
     assertTrue(jsdoc.isConstructor()); 
     assertTypeEquals(registry.createNamedType("Disposable", null, -1, -1), jsdoc.getImplementedInterfaces().get(0)); 
 } 


public void testUnsupportedJsDocSyntax21851() { 
     JSDocInfo info = parse("@param userInfo The user info. \n" + " * @param userInfo.name The name of the user */", true); 
     assertEquals(1, info.getParameterCount()); 
     assertEquals("The user info.", info.getDescriptionForParameter("userInfo")); 
 } 


public void testStableIdGeneratorConflict1857() throws Exception { 
     parse("/**\n" + " * @stableIdGenerator\n" + " * @stableIdGenerator\n" + " */\n" + "function getId() {}", "extra @stableIdGenerator tag"); 
 } 


public void testDocumentationMultipleParameter21882() throws Exception { 
     JSDocInfo jsdoc = parse("@param {number} delta = 0 results in a redraw\n" + "  != 0 ..... */", true); 
     assertTrue(jsdoc.hasDescriptionForParameter("delta")); 
     assertEquals("= 0 results in a redraw != 0 .....", jsdoc.getDescriptionForParameter("delta")); 
 } 


public void testParseNamedType11887() throws Exception { 
     assertNull(parse("@type null", "Unexpected end of file")); 
 } 


public void testBadSuppress61921() throws Exception { 
     parse("@suppress {x} \n * @suppress {y} */", "duplicate @suppress tag"); 
 } 


public void testParseParam181931() throws Exception { 
     JSDocInfo info = parse("@param {...string} [index] */"); 
     assertEquals(1, info.getParameterCount()); 
     assertTypeEquals(registry.createOptionalType(STRING_TYPE), info.getParameterType("index")); 
 } 


public void testParseFunctionalType181952() throws Exception { 
     testParseType("function (?): (?|number)", "function (?): ?"); 
 } 


public void testParseFunctionalTypeError11957() throws Exception { 
     parse("@type {function number):string}*/", "Bad type annotation. missing opening ("); 
 } 


public void testParseJavaDispatch21960() throws Exception { 
     parse("@javadispatch\n@javadispatch*/", "extra @javadispatch tag"); 
 } 


public void testFileOverviewDuplicate2047() throws Exception { 
     JSDocInfo jsdoc = parseFileOverview("@fileoverview Pie \n * @fileoverview Cake */", "extra @fileoverview tag"); 
 } 


public void testParseArrayTypeError32077() throws Exception { 
     parse("@type {[(number,boolean,Object?])]}*/", "Bad type annotation. missing closing )"); 
 } 


public void testUnsupportedJsDocSyntax12079() { 
     JSDocInfo info = parse("@param {string} [accessLevel=\"author\"] The user level */", true); 
     assertEquals(1, info.getParameterCount()); 
     assertTypeEquals(registry.createOptionalType(STRING_TYPE), info.getParameterType("accessLevel")); 
     assertEquals("The user level", info.getDescriptionForParameter("accessLevel")); 
 } 


public void testParseInheritDoc32090() throws Exception { 
     parse("@inheritDoc\n@inheritDoc*/", "Bad type annotation. extra @override/@inheritDoc tag"); 
 } 


public void testTypeTagConflict12103() throws Exception { 
     parse("@constructor \n * @constructor */", "Bad type annotation. " + "type annotation incompatible with other annotations"); 
 } 


public void testParseExtends52110() throws Exception { 
     assertTypeEquals(STRING_OBJECT_TYPE, parse("@extends {String*/", "Bad type annotation. expected closing }").getBaseType()); 
 } 


public void testParseExpose22121() throws Exception { 
     parse("@expose\n@expose*/", "extra @expose tag"); 
 } 


public void testParseParam112163() throws Exception { 
     parse("@param {number= index */", "Bad type annotation. expected closing }"); 
 } 


public void testParseNoAlias22166() throws Exception { 
     parse("@noalias\n@noalias*/", "extra @noalias tag"); 
 } 


public void testParseArrayTypeError42186() throws Exception { 
     parse("@type {(number,boolean,[Object?)]}*/", "Bad type annotation. missing closing ]"); 
 } 


public void testVersionMissing2214() throws Exception { 
     parse("* @version */", true, "@version tag missing version information"); 
 } 


public void testParserWithTemplateDuplicated2222() { 
     parse("@template T\n@template V */", "Bad type annotation. @template tag at most once"); 
 } 


public void testParseFunctionalTypeError82237() throws Exception { 
     parse("@type {function(...number])}*/", "Bad type annotation. missing opening ["); 
 } 


public void testParseMeaning42257() throws Exception { 
     parse("@meaning  tigers\n * @meaning and lions  */", "extra @meaning tag"); 
 } 


public void testParseArrayTypeError12297() throws Exception { 
     parse("@type {[number}*/", "Bad type annotation. missing closing ]"); 
 } 


public void testBadModifies32299() throws Exception { 
     parse("@modifies {|this} */", "malformed @modifies tag"); 
 } 


public void testParseThisType32320() throws Exception { 
     parse("@type {number}\n@this goog.foo.Bar*/", "Bad type annotation. type annotation incompatible " + "with other annotations"); 
 } 


public void testParseEnum12362() throws Exception { 
     assertTypeEquals(NUMBER_TYPE, parse("@enum*/").getEnumParameterType()); 
 } 


public void testBadModifies62372() throws Exception { 
     parse("@modifies {this} \n * @modifies {this} */", "conflicting @modifies tag"); 
 } 


public void testParseDesc82400() throws Exception { 
     assertEquals("a b c d", parse("@desc a\n      *b\n\n  *c\n\nd*/").getDescription()); 
 } 


public void testTypeTagConflict112409() throws Exception { 
     parse("@param {Object} x \n * @type {boolean} */", "Bad type annotation. " + "type annotation incompatible with other annotations"); 
 } 


public void testParseLends52413() throws Exception { 
     parse("@lends } */", "Bad type annotation. missing object name in @lends tag"); 
 } 


public void testParseDefineErrors72429() throws Exception { 
     parse("@define {string}\n @const */", "conflicting @const tag"); 
 } 


public void testSuppress22452() throws Exception { 
     JSDocInfo info = parse("@suppress {x|y|x|z} */"); 
     assertEquals(Sets.newHashSet("x", "y", "z"), info.getSuppressions()); 
 } 


public void testParseParam192459() throws Exception { 
     JSDocInfo info = parse("@param {...} [index] */"); 
     assertEquals(1, info.getParameterCount()); 
     assertTypeEquals(registry.createOptionalType(UNKNOWN_TYPE), info.getParameterType("index")); 
     assertTrue(info.getParameterType("index").isVarArgs()); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private JSType testParseType(String type) throws Exception {
    return testParseType(type, type);
  }

  private JSType testParseType(
      String type, String typeExpected) throws Exception {
    JSDocInfo info = parse("@type {" + type + "}*/");

    assertNotNull(info);
    assertTrue(info.hasType());

    JSType actual = resolve(info.getType());
    assertEquals(typeExpected, actual.toString());
    return actual;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  //public void testNoParseFileOverview() throws Exception {
  //  JSDocInfo jsdoc = parseFileOverviewWithoutDoc("@fileoverview Hi mom! */");
  //  assertNull(jsdoc.getFileOverview());
  //  assertTrue(jsdoc.hasFileOverview());
  //}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Asserts that a documentation field exists on the given marker.
   *
   * @param description The text of the documentation field expected.
   * @param startCharno The starting character of the text.
   * @param endLineno The ending line of the text.
   * @param endCharno The ending character of the text.
   * @return The marker, for chaining purposes.
   */
  private JSDocInfo.Marker assertDocumentationInMarker(JSDocInfo.Marker marker,
                                                       String description,
                                                       int startCharno,
                                                       int endLineno,
                                                       int endCharno) {
    assertTrue(marker.getDescription() != null);
    assertEquals(description, marker.getDescription().getItem());

    // Match positional information.
    assertEquals(marker.getAnnotation().getStartLine(),
                 marker.getDescription().getStartLine());
    assertEquals(startCharno, marker.getDescription().getPositionOnStartLine());
    assertEquals(endLineno, marker.getDescription().getEndLine());
    assertEquals(endCharno, marker.getDescription().getPositionOnEndLine());

    return marker;
  }

  /**
   * Asserts that a type field exists on the given marker.
   *
   * @param typeName The name of the type expected in the type field.
   * @param startCharno The starting character of the type declaration.
   * @param hasBrackets Whether the type in the type field is expected
   *     to have brackets.
   * @return The marker, for chaining purposes.
   */
  private JSDocInfo.Marker assertTypeInMarker(
      JSDocInfo.Marker marker, String typeName,
      int startLineno, int startCharno, int endLineno, int endCharno,
      boolean hasBrackets) {

    assertTrue(marker.getType() != null);
    assertTrue(marker.getType().getItem().isString());

    // Match the name and brackets information.
    String foundName = marker.getType().getItem().getString();

    assertEquals(typeName, foundName);
    assertEquals(hasBrackets, marker.getType().hasBrackets());

    // Match position information.
    assertEquals(startCharno, marker.getType().getPositionOnStartLine());
    assertEquals(endCharno, marker.getType().getPositionOnEndLine());
    assertEquals(startLineno, marker.getType().getStartLine());
    assertEquals(endLineno, marker.getType().getEndLine());

    return marker;
  }

  /**
   * Asserts that a name field exists on the given marker.
   *
   * @param name The name expected in the name field.
   * @param startCharno The starting character of the text.
   * @return The marker, for chaining purposes.
   */
  @SuppressWarnings("deprecation")
  private JSDocInfo.Marker assertNameInMarker(JSDocInfo.Marker marker,
      String name, int startLine, int startCharno) {
    assertTrue(marker.getName() != null);
    assertEquals(name, marker.getName().getItem());

    assertEquals(startCharno, marker.getName().getPositionOnStartLine());
    assertEquals(startCharno + name.length(),
                 marker.getName().getPositionOnEndLine());

    assertEquals(startLine, marker.getName().getStartLine());
    assertEquals(startLine, marker.getName().getEndLine());

    return marker;
  }

  /**
   * Asserts that an annotation marker of a given annotation name
   * is found in the given JSDocInfo.
   *
   * @param jsdoc The JSDocInfo in which to search for the annotation marker.
   * @param annotationName The name/type of the annotation for which to
   *   search. Example: "author" for an "@author" annotation.
   * @param startLineno The expected starting line number of the marker.
   * @param startCharno The expected character on the starting line.
   * @return The marker found, for further testing.
   */
  private JSDocInfo.Marker assertAnnotationMarker(JSDocInfo jsdoc,
                                                  String annotationName,
                                                  int startLineno,
                                                  int startCharno) {
    return assertAnnotationMarker(jsdoc, annotationName, startLineno,
                                  startCharno, 0);
  }

  /**
   * Asserts that the index-th annotation marker of a given annotation name
   * is found in the given JSDocInfo.
   *
   * @param jsdoc The JSDocInfo in which to search for the annotation marker.
   * @param annotationName The name/type of the annotation for which to
   *   search. Example: "author" for an "@author" annotation.
   * @param startLineno The expected starting line number of the marker.
   * @param startCharno The expected character on the starting line.
   * @param index The index of the marker.
   * @return The marker found, for further testing.
   */
  private JSDocInfo.Marker assertAnnotationMarker(JSDocInfo jsdoc,
                                                  String annotationName,
                                                  int startLineno,
                                                  int startCharno,
                                                  int index) {

    Collection<JSDocInfo.Marker> markers = jsdoc.getMarkers();

    assertTrue(markers.size() > 0);

    int counter = 0;

    for (JSDocInfo.Marker marker : markers) {
      if (marker.getAnnotation() != null) {
        if (annotationName.equals(marker.getAnnotation().getItem())) {

          if (counter == index) {
            assertEquals(startLineno, marker.getAnnotation().getStartLine());
            assertEquals(startCharno,
                         marker.getAnnotation().getPositionOnStartLine());
            assertEquals(startLineno, marker.getAnnotation().getEndLine());
            assertEquals(startCharno + annotationName.length(),
                         marker.getAnnotation().getPositionOnEndLine());

            return marker;
          }

          counter++;
        }
      }
    }

    fail("No marker found");
    return null;
  }

  private <T> void assertContains(Collection<T> collection, T item) {
    assertTrue(collection.contains(item));
  }

  private void parseFull(String code, String... warnings) {
    CompilerEnvirons environment = new CompilerEnvirons();

    TestErrorReporter testErrorReporter = new TestErrorReporter(null, warnings);
    environment.setErrorReporter(testErrorReporter);

    environment.setRecordingComments(true);
    environment.setRecordingLocalJsDocComments(true);

    Parser p = new Parser(environment, testErrorReporter);
    AstRoot script = p.parse(code, null, 0);

    Config config =
        new Config(extraAnnotations, extraSuppressions,
            true, LanguageMode.ECMASCRIPT3, false);
    StaticSourceFile file = new SimpleSourceFile(script.getSourceName(), false);
    for (Comment comment : script.getComments()) {
      JsDocInfoParser jsdocParser =
        new JsDocInfoParser(
            new JsDocTokenStream(comment.getValue().substring(3),
                comment.getLineno()),
            comment,
            null,
            config,
            testErrorReporter);
      jsdocParser.parse();
      jsdocParser.retrieveAndResetParsedJSDocInfo();
    }

    assertTrue("some expected warnings were not reported",
        testErrorReporter.hasEncounteredAllWarnings());
  }

  @SuppressWarnings("unused")
  private JSDocInfo parseFileOverviewWithoutDoc(String comment,
                                                String... warnings) {
    return parse(comment, false, true, warnings);
  }

  private JSDocInfo parseFileOverview(String comment, String... warnings) {
    return parse(comment, true, true, warnings);
  }

  private JSDocInfo parse(String comment, String... warnings) {
    return parse(comment, false, warnings);
  }

  private JSDocInfo parse(String comment, boolean parseDocumentation,
                          String... warnings) {
    return parse(comment, parseDocumentation, false, warnings);
  }

  private JSDocInfo parse(String comment, boolean parseDocumentation,
      boolean parseFileOverview, String... warnings) {
    TestErrorReporter errorReporter = new TestErrorReporter(null, warnings);

    Config config = new Config(extraAnnotations, extraSuppressions,
        parseDocumentation, LanguageMode.ECMASCRIPT3, false);
    StaticSourceFile file = new SimpleSourceFile("testcode", false);
    Node associatedNode = new Node(Token.SCRIPT);
    associatedNode.setInputId(new InputId(file.getName()));
    associatedNode.setStaticSourceFile(file);
    JsDocInfoParser jsdocParser = new JsDocInfoParser(
        stream(comment),
        new Comment(0, 0, CommentType.JSDOC, comment),
        associatedNode,
        config, errorReporter);

    if (fileLevelJsDocBuilder != null) {
      jsdocParser.setFileLevelJsDocBuilder(fileLevelJsDocBuilder);
    }

    jsdocParser.parse();

    assertTrue("expected warnings were not reported",
        errorReporter.hasEncounteredAllWarnings());

    if (parseFileOverview) {
      return jsdocParser.getFileOverviewJSDocInfo();
    } else {
      return jsdocParser.retrieveAndResetParsedJSDocInfo();
    }
  }

  private Node parseType(String typeComment) {
    return JsDocInfoParser.parseTypeString(typeComment);
  }

  private JsDocTokenStream stream(String source) {
    return new JsDocTokenStream(source, 0);
  }

  private void assertParameterTypeEquals(JSType expected, JSTypeExpression te) {
    assertEquals(expected, ((ObjectType) resolve(te)).getParameterType());
  }

  private void assertIndexTypeEquals(JSType expected, JSTypeExpression te) {
    assertEquals(expected, ((ObjectType) resolve(te)).getIndexType());
  }
}
