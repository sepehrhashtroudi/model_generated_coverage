/*
 * Copyright 2012 The Closure Compiler Authors.
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
 * Tests for CheckSuspiciousCode
 */
public class CheckSuspiciousCodeTest extends CompilerTestCase {
  public CheckSuspiciousCodeTest() {
    this.parseTypeInfo = true;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new CombinedCompilerPass(compiler,
        new CheckSuspiciousCode());
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  public void test(String js, DiagnosticType error) {
    test(js, js, null, error);
  }

  

  private void testReportNaN(String js) {
    testSame(js, CheckSuspiciousCode.SUSPICIOUS_COMPARISON_WITH_NAN);
  }

  

  

  

  
}
