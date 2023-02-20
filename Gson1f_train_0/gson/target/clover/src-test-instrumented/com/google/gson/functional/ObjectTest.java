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
public class ObjectTest extends TestCase {static class __CLR4_4_14bn4bnle6rvqru{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532025874L,8589935092L,5660,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14bn4bnle6rvqru.R.inc(5603);
    __CLR4_4_14bn4bnle6rvqru.R.inc(5604);super.setUp();
    __CLR4_4_14bn4bnle6rvqru.R.inc(5605);gson = new Gson();
  }finally{__CLR4_4_14bn4bnle6rvqru.R.flushNeeded();}}


public void testJsonObjectSerialization17() {__CLR4_4_14bn4bnle6rvqru.R.globalSliceStart(getClass().getName(),5606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19rd91g4bq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bn4bnle6rvqru.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bn4bnle6rvqru.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testJsonObjectSerialization17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19rd91g4bq(){try{__CLR4_4_14bn4bnle6rvqru.R.inc(5606); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5607);Gson gson = new GsonBuilder().serializeNulls().create(); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5608);JsonObject obj = new JsonObject(); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5609);String json = gson.toJson(obj); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5610);assertEquals("{}", json); 
 }finally{__CLR4_4_14bn4bnle6rvqru.R.flushNeeded();}} 


public void testArrayOfObjectsDeserialization125() throws Exception {__CLR4_4_14bn4bnle6rvqru.R.globalSliceStart(getClass().getName(),5611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o6t4rm4bv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bn4bnle6rvqru.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bn4bnle6rvqru.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testArrayOfObjectsDeserialization125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o6t4rm4bv() throws Exception{try{__CLR4_4_14bn4bnle6rvqru.R.inc(5611); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5612);String json = new ArrayOfObjects().getExpectedJson(); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5613);ArrayOfObjects target = gson.fromJson(json, ArrayOfObjects.class); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5614);assertEquals(json, target.getExpectedJson()); 
 }finally{__CLR4_4_14bn4bnle6rvqru.R.flushNeeded();}} 


public void testEmptyStringDeserialization127() throws Exception {__CLR4_4_14bn4bnle6rvqru.R.globalSliceStart(getClass().getName(),5615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19sgrja4bz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bn4bnle6rvqru.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bn4bnle6rvqru.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testEmptyStringDeserialization127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19sgrja4bz() throws Exception{try{__CLR4_4_14bn4bnle6rvqru.R.inc(5615); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5616);Object object = gson.fromJson("", Object.class); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5617);assertNull(object); 
 }finally{__CLR4_4_14bn4bnle6rvqru.R.flushNeeded();}} 


public void testBagOfPrimitiveWrappersDeserialization155() throws Exception {__CLR4_4_14bn4bnle6rvqru.R.globalSliceStart(getClass().getName(),5618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12y0dod4c2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bn4bnle6rvqru.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bn4bnle6rvqru.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testBagOfPrimitiveWrappersDeserialization155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12y0dod4c2() throws Exception{try{__CLR4_4_14bn4bnle6rvqru.R.inc(5618); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5619);BagOfPrimitiveWrappers target = new BagOfPrimitiveWrappers(10L, 20, false); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5620);String jsonString = target.getExpectedJson(); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5621);target = gson.fromJson(jsonString, BagOfPrimitiveWrappers.class); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5622);assertEquals(jsonString, target.getExpectedJson()); 
 }finally{__CLR4_4_14bn4bnle6rvqru.R.flushNeeded();}} 


public void testNullDeserialization160() throws Exception {__CLR4_4_14bn4bnle6rvqru.R.globalSliceStart(getClass().getName(),5623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kutmv04c7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bn4bnle6rvqru.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bn4bnle6rvqru.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ObjectTest.testNullDeserialization160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kutmv04c7() throws Exception{try{__CLR4_4_14bn4bnle6rvqru.R.inc(5623); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5624);String myNullObject = null; 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5625);Object object = gson.fromJson(myNullObject, Object.class); 
     __CLR4_4_14bn4bnle6rvqru.R.inc(5626);assertNull(object); 
 }finally{__CLR4_4_14bn4bnle6rvqru.R.flushNeeded();}} 

  
  
  
  
  

  

  

  

  

  

  

  

  

  

  
  

  

  

  

  

  

  

  

  

  

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
    public ArrayOfArrays() {try{__CLR4_4_14bn4bnle6rvqru.R.inc(5627);
      __CLR4_4_14bn4bnle6rvqru.R.inc(5628);elements = new BagOfPrimitives[3][2];
      __CLR4_4_14bn4bnle6rvqru.R.inc(5629);for (int i = 0; (((i < elements.length)&&(__CLR4_4_14bn4bnle6rvqru.R.iget(5630)!=0|true))||(__CLR4_4_14bn4bnle6rvqru.R.iget(5631)==0&false)); ++i) {{
        __CLR4_4_14bn4bnle6rvqru.R.inc(5632);BagOfPrimitives[] row = elements[i];
        __CLR4_4_14bn4bnle6rvqru.R.inc(5633);for (int j = 0; (((j < row.length)&&(__CLR4_4_14bn4bnle6rvqru.R.iget(5634)!=0|true))||(__CLR4_4_14bn4bnle6rvqru.R.iget(5635)==0&false)); ++j) {{
          __CLR4_4_14bn4bnle6rvqru.R.inc(5636);row[j] = new BagOfPrimitives(i+j, i*j, false, i+"_"+j);
        }
      }}
    }}finally{__CLR4_4_14bn4bnle6rvqru.R.flushNeeded();}}
    public String getExpectedJson() {try{__CLR4_4_14bn4bnle6rvqru.R.inc(5637);
      __CLR4_4_14bn4bnle6rvqru.R.inc(5638);StringBuilder sb = new StringBuilder("{\"elements\":[");
      __CLR4_4_14bn4bnle6rvqru.R.inc(5639);boolean first = true;
      __CLR4_4_14bn4bnle6rvqru.R.inc(5640);for (BagOfPrimitives[] row : elements) {{
        __CLR4_4_14bn4bnle6rvqru.R.inc(5641);if ((((first)&&(__CLR4_4_14bn4bnle6rvqru.R.iget(5642)!=0|true))||(__CLR4_4_14bn4bnle6rvqru.R.iget(5643)==0&false))) {{
          __CLR4_4_14bn4bnle6rvqru.R.inc(5644);first = false;
        } }else {{
          __CLR4_4_14bn4bnle6rvqru.R.inc(5645);sb.append(",");
        }
        }__CLR4_4_14bn4bnle6rvqru.R.inc(5646);boolean firstOfRow = true;
        __CLR4_4_14bn4bnle6rvqru.R.inc(5647);sb.append("[");
        __CLR4_4_14bn4bnle6rvqru.R.inc(5648);for (BagOfPrimitives element : row) {{
          __CLR4_4_14bn4bnle6rvqru.R.inc(5649);if ((((firstOfRow)&&(__CLR4_4_14bn4bnle6rvqru.R.iget(5650)!=0|true))||(__CLR4_4_14bn4bnle6rvqru.R.iget(5651)==0&false))) {{
            __CLR4_4_14bn4bnle6rvqru.R.inc(5652);firstOfRow = false;
          } }else {{
            __CLR4_4_14bn4bnle6rvqru.R.inc(5653);sb.append(",");
          }
          }__CLR4_4_14bn4bnle6rvqru.R.inc(5654);sb.append(element.getExpectedJson());
        }
        }__CLR4_4_14bn4bnle6rvqru.R.inc(5655);sb.append("]");
      }
      }__CLR4_4_14bn4bnle6rvqru.R.inc(5656);sb.append("]}");
      __CLR4_4_14bn4bnle6rvqru.R.inc(5657);return sb.toString();
    }finally{__CLR4_4_14bn4bnle6rvqru.R.flushNeeded();}}
  }

  private static class ClassWithPrivateNoArgsConstructor {
    public int a;
    private ClassWithPrivateNoArgsConstructor() {try{__CLR4_4_14bn4bnle6rvqru.R.inc(5658);
      __CLR4_4_14bn4bnle6rvqru.R.inc(5659);a = 10;
    }finally{__CLR4_4_14bn4bnle6rvqru.R.flushNeeded();}}
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
