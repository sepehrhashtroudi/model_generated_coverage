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

package com.google.javascript.jscomp.jsonml;

import com.google.javascript.jscomp.jsonml.JsonML;
import com.google.javascript.jscomp.jsonml.JsonMLUtil;
import com.google.javascript.jscomp.jsonml.TagAttr;
import com.google.javascript.jscomp.jsonml.TagType;
import com.google.javascript.jscomp.jsonml.Validator;

import junit.framework.TestCase;

/**
 * Tests validation of particular JsonML elements.
 *
 * @author dhans@google.com (Daniel Hans)
 */
public class JsonMLValidationTest extends TestCase {

  // Used for correct statements - error message should be null
  private void testValidation(String jsonml) throws Exception {
    JsonML jsonMLRoot = JsonMLUtil.parseString(jsonml);
    String msg = Validator.validate(jsonMLRoot);
    if (msg != null) {
      String errorMsg = String.format(
          "Validation error for %s.\n Received: %s\n", jsonml, msg);
    }
  }

  private void testValidation(String jsonml, String expected)
      throws Exception {
    JsonML jsonMLRoot = JsonMLUtil.parseString(jsonml);
    String msg = Validator.validate(jsonMLRoot);
    if (!msg.equals(expected)) {
      String errorMsg = String.format(
          "Validation error for %s.\n Received: %s\n Expected: %s\n",
          jsonml, msg, expected);
      assertEquals(errorMsg, expected, msg);
    }
  }

  private void testNotEnoughChildrenValidation(String jsonml, TagType type,
      int expected, int actual) throws Exception {
    testValidation(jsonml,
        String.format(Validator.NOT_ENOUGH_CHILDREN_FMT,
        type, expected, actual));
  }

  private void testTooManyChildrenValidation(String jsonml, TagType type,
      int expected, int actual) throws Exception {
    testValidation(jsonml,
        String.format(Validator.TOO_MANY_CHILDREN_FMT,
        type, expected, actual));
  }

  private void testWrongChildTypeValidation(String jsonml, TagType type,
      TagType expected, TagType actual, int index) throws Exception {
    testWrongChildTypeValidation(jsonml, type, new TagType[] { expected },
        actual, index);
  }

  private void testWrongChildTypeValidation(String jsonml, TagType type,
      TagType[] expected, TagType actual, int index) throws Exception {
    testValidation(jsonml,
        String.format(Validator.WRONG_CHILD_TYPE_FMT,
        index, type, Validator.printList(expected), actual));
  }

  private void testMissingArgument(String jsonml, TagAttr attr, TagType type)
      throws Exception {
    testValidation(jsonml,
        String.format(Validator.MISSING_ARGUMENT, attr, type));
  }


public void testInvokeExprValidation192() throws Exception { 
     testValidation("" + "['InvokeExpr',{'op':'.'}," + "['IdExpr',{'name':'x'}]," + "['LiteralExpr',{'type':'string','value':'foo'}]]"); 
     testNotEnoughChildrenValidation("" + "['InvokeExpr',{'op':'[]'}," + "['IdExpr',{'name':'x'}]]", TagType.InvokeExpr, 2, 1); 
     testMissingArgument("" + "['InvokeExpr',{}," + "['IdExpr',{'name':'x'}]," + "['LiteralExpr',{'type':'string','value':'foo'}]]", TagAttr.OP, TagType.InvokeExpr); 
 } 


public void testTryStmtValidation363() throws Exception { 
     testValidation("" + "['TryStmt',{}," + "['BlockStmt',{}]," + "['CatchClause',{}," + "['IdPatt',{'name':'e'}]," + "['BlockStmt',{}]]]"); 
     testValidation("" + "['TryStmt',{}," + "['BlockStmt',{}]," + "['CatchClause',{}," + "['IdPatt',{'name':'e'}]," + "['BlockStmt',{}]]," + "['BlockStmt',{}]]"); 
     testNotEnoughChildrenValidation("" + "['TryStmt',{}," + "['CatchClause',{}," + "['IdPatt',{'name':'e'}]," + "['BlockStmt',{}]]]", TagType.TryStmt, 2, 1); 
     testTooManyChildrenValidation("" + "['TryStmt',{}," + "['BlockStmt',{}]," + "['CatchClause',{}," + "['IdPatt',{'name':'e'}]," + "['BlockStmt',{}]]," + "['BlockStmt',{}]," + "['BlockStmt',{}]]", TagType.TryStmt, 3, 4); 
     testWrongChildTypeValidation("" + "['TryStmt',{}," + "['BlockStmt',{}]," + "['BlockStmt',{}," + "['IdPatt',{'name':'e'}]," + "['BlockStmt',{}]]," + "['BlockStmt',{}]]", TagType.TryStmt, new TagType[] { TagType.CatchClause, TagType.Empty }, TagType.BlockStmt, 1); 
     testWrongChildTypeValidation("" + "['TryStmt',{}," + "['BlockStmt',{}]," + "['CatchClause',{}," + "['IdPatt',{'name':'e'}]," + "['BlockStmt',{}]]," + "['IdExpr',{'name': 'x'}]]", TagType.TryStmt, TagType.BlockStmt, TagType.IdExpr, 2); 
 } 


public void testCatchValidation694() throws Exception { 
     testValidation("" + "['CatchClause',{}," + "['IdPatt',{'name':'e'}]," + "['BlockStmt',{}]]"); 
     testNotEnoughChildrenValidation("" + "['CatchClause',{}," + "['IdPatt',{'name':'e'}]]", TagType.CatchClause, 2, 1); 
     testWrongChildTypeValidation("" + "['CatchClause',{}," + "['IdExpr',{'name':'e'}]," + "['BlockStmt',{}]]", TagType.CatchClause, TagType.IdPatt, TagType.IdExpr, 0); 
 } 


public void testFunctionDeclValidation904() throws Exception { 
     testValidation("" + "['FunctionDecl',{}," + "['IdPatt',{'name':'f'}]," + "['ParamDecl',{}]]"); 
     testValidation("" + "['FunctionDecl',{}," + "['IdPatt',{'name':'f'}]," + "['ParamDecl',{}]," + "['IdExpr',{'name':'foo'}]]"); 
     testNotEnoughChildrenValidation("" + "['FunctionDecl',{}," + "['IdPatt',{'name':'f'}]]", TagType.FunctionDecl, 2, 1); 
     testWrongChildTypeValidation("" + "['FunctionDecl',{}," + "['Empty', {}]," + "['ParamDecl',{}]]", TagType.FunctionDecl, TagType.IdPatt, TagType.Empty, 0); 
     testWrongChildTypeValidation("" + "['FunctionDecl',{}," + "['IdPatt',{'name':'f'}]," + "['Empty',{}]]", TagType.FunctionDecl, TagType.ParamDecl, TagType.Empty, 1); 
 } 


public void testRegExpExprValidation1158() throws Exception { 
     testValidation("" + "['RegExpExpr',{'body':'abc','flags':''}]"); 
     testValidation("" + "['RegExpExpr',{'body':'abc','flags':'g'}]"); 
     testTooManyChildrenValidation("" + "['RegExpExpr',{'body':'abc','flags':'g'}," + "['IdExpr',{'name':'a'}]]", TagType.RegExpExpr, 0, 1); 
     testMissingArgument("" + "['RegExpExpr',{'body':'abc'}]", TagAttr.FLAGS, TagType.RegExpExpr); 
     testMissingArgument("" + "['RegExpExpr',{'flags':'g'}]", TagAttr.BODY, TagType.RegExpExpr); 
 } 


public void testDoWhileStmtValidation1321() throws Exception { 
     testValidation("" + "['DoWhileStmt',{}," + "['BlockStmt',{}]," + "['LiteralExpr',{'type':'boolean','value':true}]]"); 
     testNotEnoughChildrenValidation("" + "['DoWhileStmt',{}]", TagType.DoWhileStmt, 2, 0); 
     testTooManyChildrenValidation("" + "['DoWhileStmt',{}," + "['BlockStmt',{}]," + "['BlockStmt',{}]," + "['LiteralExpr',{'type':'boolean','value':true}]]", TagType.DoWhileStmt, 2, 3); 
 } 


public void testForInStmtValidation1323() throws Exception { 
     testValidation("" + "['ForInStmt',{}," + "['IdExpr',{'name':'x'}]," + "['ObjectExpr',{}]," + "['BlockStmt',{}]]"); 
     testNotEnoughChildrenValidation("" + "['ForInStmt',{}," + "['IdExpr',{'name':'x'}]," + "['ObjectExpr',{}]],", TagType.ForInStmt, 3, 2); 
     testTooManyChildrenValidation("" + "['ForInStmt',{}," + "['IdExpr',{'name':'x'}]," + "['ObjectExpr',{}]," + "['BlockStmt',{}]," + "['BlockStmt',{}]]", TagType.ForInStmt, 3, 4); 
 } 


public void testNewExprValidation1330() throws Exception { 
     testValidation("" + "['NewExpr',{}," + "['IdExpr',{'name':'A'}]," + "['IdExpr',{'name':'x'}]]"); 
     testNotEnoughChildrenValidation("" + "['NewExpr',{}]", TagType.NewExpr, 1, 0); 
 } 


public void testDataProp1397() throws Exception { 
     testValidation("" + "['DataProp',{'name':'x'}," + "['LiteralExpr',{'type':'number','value':1}]]"); 
     testNotEnoughChildrenValidation("" + "['DataProp',{'name':'x'}]", TagType.DataProp, 1, 0); 
     testMissingArgument("" + "['DataProp', {}," + "['LiteralExpr',{'type':'number','value':1}]]", TagAttr.NAME, TagType.DataProp); 
 } 


public void testWithStmtValidation1639() throws Exception { 
     testValidation("" + "['WithStmt',{}," + "['IdExpr',{'name':'x'}]," + "['BlockStmt',{}]]"); 
     testNotEnoughChildrenValidation("" + "['WithStmt',{}," + "['BlockStmt',{}]]", TagType.WithStmt, 2, 1); 
     testTooManyChildrenValidation("" + "['WithStmt',{}," + "['IdExpr',{'name':'A'}]," + "['IdExpr',{'name':'x'}]," + "['IdExpr',{'name':'y'}]]", TagType.WithStmt, 2, 3); 
 } 


public void testSwitchStmtValidation2112() throws Exception { 
     testValidation("" + "['SwitchStmt',{}," + "['IdExpr',{'name':'x'}]," + "['Case',{}," + "['LiteralExpr',{'type':'number','value':1}]," + "['CallExpr',{}," + "['IdExpr',{'name':'foo'}]]]," + "['DefaultCase',{}," + "['CallExpr',{}," + "['IdExpr',{'name':'bar'}]]]]"); 
     testValidation("" + "['SwitchStmt',{}," + "['IdExpr',{'name':'x'}]]"); 
     testNotEnoughChildrenValidation("" + "['SwitchStmt',{}]", TagType.SwitchStmt, 1, 0); 
     testWrongChildTypeValidation("" + "['SwitchStmt',{}," + "['IdExpr',{'name':'x'}]," + "['AssignExpr',{'op': '='}," + "['LiteralExpr',{'type':'number','value':1}]," + "['CallExpr',{}," + "['IdExpr',{'name':'foo'}]]]," + "['DefaultCase',{}," + "['CallExpr',{}," + "['IdExpr',{'name':'bar'}]]]]", TagType.SwitchStmt, new TagType[] { TagType.Case, TagType.DefaultCase }, TagType.AssignExpr, 1); 
     testWrongChildTypeValidation("" + "['SwitchStmt',{}," + "['IdExpr',{'name':'x'}]," + "['DefaultCase',{}," + "['CallExpr',{}," + "['IdExpr',{'name':'foo'}]]]," + "['DefaultCase',{}," + "['CallExpr',{}," + "['IdExpr',{'name':'bar'}]]]]", TagType.SwitchStmt, TagType.Case, TagType.DefaultCase, 2); 
 } 


public void testCountExprValidation2317() throws Exception { 
     testValidation("" + "['CountExpr',{'isPrefix':false,'op':'++'}," + "['IdExpr',{'name':'x'}]]"); 
     testTooManyChildrenValidation("" + "['CountExpr',{'isPrefix':false,'op':'++'}," + "['IdExpr',{'name':'x'}]," + "['IdExpr',{'name':'y'}]]", TagType.CountExpr, 1, 2); 
     testMissingArgument("" + "['CountExpr',{'op':'++'}," + "['IdExpr',{'name':'x'}]]", TagAttr.IS_PREFIX, TagType.CountExpr); 
     testMissingArgument("" + "['CountExpr',{'isPrefix':false}," + "['IdExpr',{'name':'x'}]]", TagAttr.OP, TagType.CountExpr); 
 } 


public void testJmpStmtValidation2351() throws Exception { 
     testValidation("" + "['BreakStmt',{}]"); 
     testValidation("" + "['BreakStmt',{'label':'s'}]"); 
     testValidation("" + "['ContinueStmt',{}]"); 
     testValidation("" + "['ContinueStmt',{'label':'s'}]"); 
     testTooManyChildrenValidation("" + "['BreakStmt',{}," + "['IdExpr',{'name':'s'}]]", TagType.BreakStmt, 0, 1); 
     testTooManyChildrenValidation("" + "['ContinueStmt',{}," + "['IdExpr',{'name':'s'}]]", TagType.ContinueStmt, 0, 1); 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
