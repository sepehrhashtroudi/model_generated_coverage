/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonObject;
import com.google.gson.common.TestTypes.ArrayOfObjects;
import com.google.gson.common.TestTypes.BagOfPrimitiveWrappers;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.ClassWithArray;
import com.google.gson.common.TestTypes.ClassWithNoFields;
import com.google.gson.common.TestTypes.ClassWithObjects;
import com.google.gson.common.TestTypes.ClassWithTransientFields;
import com.google.gson.common.TestTypes.Nested;
import com.google.gson.common.TestTypes.PrimitiveArray;

import java.util.List;
import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Functional tests for Json serialization and deserialization of regular classes.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ObjectTest extends TestCase {static class __CLR4_4_13q33q3le6id5pl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u006e\u006f\u0070\u0074\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676516042564L,8589935092L,4863,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13q33q3le6id5pl.R.inc(4827);
    __CLR4_4_13q33q3le6id5pl.R.inc(4828);super.setUp();
    __CLR4_4_13q33q3le6id5pl.R.inc(4829);gson = new Gson();
  }finally{__CLR4_4_13q33q3le6id5pl.R.flushNeeded();}}

  
  
  
  
  

  

  

  

  

  

  

  

  

  

  
  

  

  

  

  

  

  

  

  

  

  /**
   * Created in response to Issue 14: http://code.google.com/p/google-gson/issues/detail?id=14
   */
  

  /**
   * Created in response to Issue 14: http://code.google.com/p/google-gson/issues/detail?id=14
   */
  

  

  private static class ClassWithCollectionField {
    Collection<String> children = new ArrayList<String>();
  }

  

  /**
   * Created in response to Issue 14: http://code.google.com/p/google-gson/issues/detail?id=14
   */
  

  

  

  

  

  /**
   * Tests that a class field with type Object can be serialized properly. 
   * See issue 54
   */
  

  private static class ClassWithObjectField {
    @SuppressWarnings("unused")
    Object member;
  }
  
  
   
  
   
  private static class Parent {
    @SuppressWarnings("unused")
    int value1 = 1;
    private class Child {
      int value2 = 2;
    }
  }

  private static class ArrayOfArrays {
    private final BagOfPrimitives[][] elements;
    public ArrayOfArrays() {try{__CLR4_4_13q33q3le6id5pl.R.inc(4830);
      __CLR4_4_13q33q3le6id5pl.R.inc(4831);elements = new BagOfPrimitives[3][2];
      __CLR4_4_13q33q3le6id5pl.R.inc(4832);for (int i = 0; (((i < elements.length)&&(__CLR4_4_13q33q3le6id5pl.R.iget(4833)!=0|true))||(__CLR4_4_13q33q3le6id5pl.R.iget(4834)==0&false)); ++i) {{
        __CLR4_4_13q33q3le6id5pl.R.inc(4835);BagOfPrimitives[] row = elements[i];
        __CLR4_4_13q33q3le6id5pl.R.inc(4836);for (int j = 0; (((j < row.length)&&(__CLR4_4_13q33q3le6id5pl.R.iget(4837)!=0|true))||(__CLR4_4_13q33q3le6id5pl.R.iget(4838)==0&false)); ++j) {{
          __CLR4_4_13q33q3le6id5pl.R.inc(4839);row[j] = new BagOfPrimitives(i+j, i*j, false, i+"_"+j);
        }
      }}
    }}finally{__CLR4_4_13q33q3le6id5pl.R.flushNeeded();}}
    public String getExpectedJson() {try{__CLR4_4_13q33q3le6id5pl.R.inc(4840);
      __CLR4_4_13q33q3le6id5pl.R.inc(4841);StringBuilder sb = new StringBuilder("{\"elements\":[");
      __CLR4_4_13q33q3le6id5pl.R.inc(4842);boolean first = true;
      __CLR4_4_13q33q3le6id5pl.R.inc(4843);for (BagOfPrimitives[] row : elements) {{
        __CLR4_4_13q33q3le6id5pl.R.inc(4844);if ((((first)&&(__CLR4_4_13q33q3le6id5pl.R.iget(4845)!=0|true))||(__CLR4_4_13q33q3le6id5pl.R.iget(4846)==0&false))) {{
          __CLR4_4_13q33q3le6id5pl.R.inc(4847);first = false;
        } }else {{
          __CLR4_4_13q33q3le6id5pl.R.inc(4848);sb.append(",");
        }
        }__CLR4_4_13q33q3le6id5pl.R.inc(4849);boolean firstOfRow = true;
        __CLR4_4_13q33q3le6id5pl.R.inc(4850);sb.append("[");
        __CLR4_4_13q33q3le6id5pl.R.inc(4851);for (BagOfPrimitives element : row) {{
          __CLR4_4_13q33q3le6id5pl.R.inc(4852);if ((((firstOfRow)&&(__CLR4_4_13q33q3le6id5pl.R.iget(4853)!=0|true))||(__CLR4_4_13q33q3le6id5pl.R.iget(4854)==0&false))) {{
            __CLR4_4_13q33q3le6id5pl.R.inc(4855);firstOfRow = false;
          } }else {{
            __CLR4_4_13q33q3le6id5pl.R.inc(4856);sb.append(",");
          }
          }__CLR4_4_13q33q3le6id5pl.R.inc(4857);sb.append(element.getExpectedJson());
        }
        }__CLR4_4_13q33q3le6id5pl.R.inc(4858);sb.append("]");
      }
      }__CLR4_4_13q33q3le6id5pl.R.inc(4859);sb.append("]}");
      __CLR4_4_13q33q3le6id5pl.R.inc(4860);return sb.toString();
    }finally{__CLR4_4_13q33q3le6id5pl.R.flushNeeded();}}
  }

  private static class ClassWithPrivateNoArgsConstructor {
    public int a;
    private ClassWithPrivateNoArgsConstructor() {try{__CLR4_4_13q33q3le6id5pl.R.inc(4861);
      __CLR4_4_13q33q3le6id5pl.R.inc(4862);a = 10;
    }finally{__CLR4_4_13q33q3le6id5pl.R.flushNeeded();}}
  }
  
  /**
   * In response to Issue 41 http://code.google.com/p/google-gson/issues/detail?id=41
   */
  
  
  

  /**
   * Created to reproduce issue 140
   */
  

  /**
   * Created to reproduce issue 140
   */
  

  private static class ClassWithEmptyStringFields {
    String a = "";
    String b = "";
    String c = "";
  }
  
  

  /**
   * Test for issue 215.
   */
  

  static final class Department {
    public String name = "abc";
    public String code = "123";
  }

  static final class Product {
    private List<String> attributes = new ArrayList<String>();
    private List<Department> departments = new ArrayList<Department>();
  }

}
