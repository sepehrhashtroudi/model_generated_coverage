


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

import com.google.javascript.rhino.Node;

  public class PeepholeSimplifyRegExpTest extends CompilerTestCase {

    public final void testWaysOfMatchingEmptyString() {
      testSame("/(?:)/");
      test("/(?:)/i", "/(?:)/");  // We can get rid of i flag when no letters.
      test("/.{0}/i", "/(?:)/");
      test("/[^\\0-\\uffff]{0}/", "/(?:)/");
      // Cannot get rid of capturing groups.
      testSame("/(){0}/");
    }

    public final void testGroups3() {
      testSame("/foo(bar)baz/");
    }


    public final void testCharsetFixup87() {
      testSame("/[a-z]/i");
      test("/[^\\0-`{-\\uffff]/i", "/(?!)/");
      test("/[^a-z]/i", "/[\\W\\d_]/");
    }


    public final void testBackReferences109() {
      testSame("/foo(bar)baz(?:\\1|\\x01)boo/");
      test("/foo(?:bar)baz(?:\\1|\\x01)boo/", "/foobarbaz\\x01boo/");
      test("/foo(?:bar)baz(?:\\8|8)boo/", "/foobarbaz8boo/");
      test("/(1?)(2?)(3?)(4?)(5?)(6?)(7?)(8?)(9?)(A?)(B?)" + "\\12\\11\\10\\9\\8\\7\\6\\5\\4\\3\\2\\1\\0/", "/(1?)(2?)(3?)(4?)(5?)(6?)(7?)(8?)(9?)(A?)(B?)" + "\\1(?:2)\\11\\10\\9\\8\\7\\6\\5\\4\\3\\2\\1\\0/");
      test("/(1?)(2?)(3?)(4?)(5?)(6?)(7?)(8?)(9?)(A?)(B?)(?:\\1)0/", "/(1?)(2?)(3?)(4?)(5?)(6?)(7?)(8?)(9?)(A?)(B?)\\1(?:0)/");
      test("/(1?)(2?)(3?)(4?)(5?)(6?)(7?)(8?)(9?)(A?)(B?)(C?)" + "\\012\\11\\10\\9\\8\\7\\6\\5\\4\\3\\2\\1\\0/", "/(1?)(2?)(3?)(4?)(5?)(6?)(7?)(8?)(9?)(A?)(B?)(C?)" + "\\n\\11\\10\\9\\8\\7\\6\\5\\4\\3\\2\\1\\0/");
    }


    public final void testMalformedRegularExpressions301() {
      test("/(?<!foo)/", "/(?<!foo)/", null, CheckRegExp.MALFORMED_REGEXP);
      test("/(/", "/(/", null, CheckRegExp.MALFORMED_REGEXP);
      test("/)/", "/)/", null, CheckRegExp.MALFORMED_REGEXP);
      test("/\\uabc/", "/\\uabc/", null, CheckRegExp.MALFORMED_REGEXP);
      test("/\\uabcg/", "/\\uabcg/", null, CheckRegExp.MALFORMED_REGEXP);
    }


    public final void testRepetitions430() {
      testSame("/a*/");
      testSame("/a+/");
      testSame("/a+?/");
      testSame("/a?/");
      testSame("/a{6}/");
      testSame("/a{4,}/");
      test("/a{3,}/", "/aaa+/");
      testSame("/a{4,6}/");
      testSame("/a{4,6}?/");
      test("/(?:a?)?/", "/a?/");
      test("/(?:a?)*/", "/a*/");
      test("/(?:a*)?/", "/a*/");
      test("/a(?:a*)?/", "/a+/");
      test("/(?:a{2,3}){3,4}/", "/a{6,12}/");
      test("/a{2,3}a{3,4}/", "/a{5,7}/");
      testSame("/a{5,7}b{5,6}/");
      test("/a{2,3}b{3,4}/", "/aaa?bbbb?/");
      test("/a{3}b{3,4}/", "/aaabbbb?/");
      testSame("/[a-z]{1,2}/");
      test("/\\d{1,2}/", "/\\d\\d?/");
      test("/a*a*/", "/a*/");
      test("/a+a+/", "/aa+/");
      test("/a+a*/", "/a+/");
      testSame("/a\\{3,1}/");
      test("/a(?:{3,1})/", "/a\\{3,1}/");
      test("/a{3\\,1}/", "/a\\{3,1}/");
      testSame("/a\\{3}/");
      testSame("/a\\{3,}/");
      testSame("/a\\{1,3}/");
      testSame("/a{/");
      testSame("/a{}/");
      testSame("/a{x}/");
      testSame("/a{-1}/");
      testSame("/a{,3}/");
      testSame("/{{[a-z]+}}/");
      testSame("/{\\{0}}/");
      testSame("/{\\{0?}}/");
    }


    public final void testCharsetOptimizations572() {
      testSame("/./");
      test("/[\\0-\\uffff]/", "/[\\S\\s]/");
      test("/[^\\0-\\uffff]/", "/(?!)/");
      test("/[^\\0-\\x40\\x42-\\uffff]/", "/A/");
      test("/[0-9a-fA-F]/i", "/[\\da-f]/i");
      test("/[0-9a-zA-Z_$]/i", "/[\\w$]/");
      test("/[()*+\\-,]/g", "/[(--]/g");
      test("/[()*+\\-,z]/g", "/[(--z]/g");
      test("/[\\-\\.\\/0]/g", "/[--0]/g");
      test("/[\\-\\.\\/0\\n]/g", "/[\\n\\--0]/g");
      test("/[\\[\\\\\\]]/g", "/[[-\\]]/g");
      test("/[\\[\\\\\\]\\^]/g", "/[[-^]/g");
      test("/[\\^`_]/g", "/[\\^-`]/g");
      test("/[^\\^`_]/g", "/[^^-`]/g");
      test("/^(?=[^a-z])/i", "/^(?=[\\W\\d_])/");
      test("/^[^a-z0-9]/i", "/^[\\W_]/");
      test("/[0-FA-Z]/", "/[0-Z]/");
      test("/[0-9]/", "/\\d/");
      test("/[^0-9]/", "/\\D/");
      testSame("/\\D/");
      test("/[_a-z0-9]/i", "/\\w/");
      test("/[0-9_a-z]/i", "/\\w/");
      test("/[_a-z0-9]/", "/[\\d_a-z]/");
      test("/[_E-Za-f0-9]/i", "/\\w/");
      test("/[E-Za-f]/i", "/[a-z]/i");
      test("/[_E-Za-f0-9]/", "/[\\dE-Z_a-f]/");
      test("/[\\u00ca\\u00ea]/", "/[\\xca\\xea]/");
      test("/[\\u00ca\\u00ea]/i", "/\\xca/i");
      testSame("/^[\\s\\xa0]*$/");
      test("/^(?:\\s|\\xA0)*$/", "/^[\\s\\xa0]*$/");
    }


    public final void testSingleCharAlterations710() {
      test("/a|B|c|D/i", "/[a-d]/i");
      test("/a|B|c|D/", "/[BDac]/");
      test("/a|[Bc]|D/", "/[BDac]/");
      test("/[aB]|[cD]/", "/[BDac]/");
      test("/a|B|c|D|a|B/i", "/[a-d]/i");
      test("/a|A|/i", "/a?/i");
    }


    public final void testMoreCharsets730() {
      test("var a = /[\\x00\\x22\\x26\\x27\\x3c\\x3e]/g", "var a = /[\\0\"&'<>]/g");
      test("var b = /[\\x00\\x22\\x27\\x3c\\x3e]/g", "var b = /[\\0\"'<>]/g");
      test("var c = /[\\x00\\x09-\\x0d \\x22\\x26\\x27\\x2d\\/\\x3c-\\x3e`" + "\\x85\\xa0\\u2028\\u2029]/g", "var c = /[\\0\\t-\\r \"&'/<->`\\x85\\xa0\\u2028\\u2029-]/g");
      test("var d = /[\\x00\\x09-\\x0d \\x22\\x27\\x2d\\/\\x3c-\\x3e`" + "\\x85\\xa0\\u2028\\u2029]/g", "var d = /[\\0\\t-\\r \"'/<->`\\x85\\xa0\\u2028\\u2029-]/g");
      test("var e = /[\\x00\\x08-\\x0d\\x22\\x26\\x27\\/\\x3c-\\x3e\\\\" + "\\x85\\u2028\\u2029]/g", "var e = /[\\0\\b-\\r\"&'/<->\\\\\\x85\\u2028\\u2029]/g");
      test("var f = /[\\x00\\x08-\\x0d\\x22\\x24\\x26-\\/\\x3a\\x3c-\\x3f" + "\\x5b-\\x5e\\x7b-\\x7d\\x85\\u2028\\u2029]/g", "var f = /[\\0\\b-\\r\"$&-/:<-?[-^{-}\\x85\\u2028\\u2029]/g");
      test("var g = /[\\x00\\x08-\\x0d\\x22\\x26-\\x2a\\/\\x3a-\\x3e@\\\\" + "\\x7b\\x7d\\x85\\xa0\\u2028\\u2029]/g", "var g = /[\\0\\b-\\r\"&-*/:->@\\\\{}\\x85\\xa0\\u2028\\u2029]/g");
      test("var h = /^(?!-*(?:expression|(?:moz-)?binding))(?:[.#]?-?" + "(?:[_a-z0-9][_a-z0-9-]*)(?:-[_a-z][_a-z0-9-]*)*-?|-?" + "(?:[0-9]+(?:\\.[0-9]*)?|\\.[0-9])(?:[a-z]{1,2}|%)?|!important|)$/i", "var h = /^(?!-*(?:expression|(?:moz-)?binding))(?:[#.]?-?" + "\\w[\\w-]*(?:-[_a-z][\\w-]*)*-?|-?" + "(?:\\d+(?:\\.\\d*)?|\\.\\d)(?:[a-z]{1,2}|%)?|!important|)$/i");
      test("var i = /^(?:(?:https?|mailto):|[^&:\\/?#]*(?:[\\/?#]|$))/i", "var i = /^(?:(?:https?|mailto):|[^#&/:?]*(?:[#/?]|$))/i");
      test("var j = /^(?!style|on|action|archive|background|cite|classid" + "|codebase|data|dsync|href|longdesc|src|usemap)(?:[a-z0-9_$:-]*" + "|dir=(?:ltr|rtl))$/i", "var j = /^(?!style|on|action|archive|background|cite|classid" + "|codebase|data|dsync|href|longdesc|src|usemap)(?:[\\w$:-]*" + "|dir=(?:ltr|rtl))$/i");
      test("var k = /^(?!script|style|title|textarea|xmp|no)[a-z0-9_$:-]*$/i", "var k = /^(?!script|style|title|textarea|xmp|no)[\\w$:-]*$/i");
      test("var l = /<(?:!|\\/?[a-z])(?:[^>'\"]|\"[^\"]*\"|'[^']*')*>/gi", "var l = /<(?:!|\\/?[a-z])(?:[^\"'>]|\"[^\"]*\"|'[^']*')*>/gi");
    }


    public final void testAlterations808() {
      testSame("/foo|bar/");
      test("/Foo|BAR/i", "/foo|bar/i");
      test("/Foo||BAR/", "/Foo||BAR/");
      test("/Foo|BAR|/", "/Foo|BAR|/");
    }


    public final void testWaysOfMatchingEmptyString858() {
      testSame("/(?:)/");
      test("/(?:)/i", "/(?:)/");
      test("/.{0}/i", "/(?:)/");
      test("/[^\\0-\\uffff]{0}/", "/(?:)/");
      testSame("/(){0}/");
    }


    public final void testAnchors878() {
      testSame("/foo(?!$)/gm");
      test("/./m", "/./");
      test("/\\^/m", "/\\^/");
      test("/[\\^]/m", "/\\^/");
      testSame("/(^|foo)bar/");
      testSame("/^.|.$/gm");
      test("/foo(?=)$/m", "/foo$/m");
      test("/^foo$/g", "/^foo$/");
    }


    public final void testNestedAlterations996() {
      test("/foo|bar|(?:baz|boo)|far/", "/foo|bar|baz|boo|far/");
    }



    @Override
    protected CompilerPass getProcessor(Compiler compiler) {
      final CompilerPass simplifier = new PeepholeOptimizationsPass(
              compiler, new PeepholeSimplifyRegExp());
      final CompilerPass checker = new CheckRegExp(compiler);

      return new CompilerPass() {
        @Override
        public void process(Node externs, Node root) {
          checker.process(externs, root);
          simplifier.process(externs, root);
        }
      };
    }
  }
