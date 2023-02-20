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
import com.google.gson.ParamterizedTypeFixtures.MyParameterizedType;
import com.google.gson.ParamterizedTypeFixtures.MyParameterizedTypeAdapter;
import com.google.gson.ParamterizedTypeFixtures.MyParameterizedTypeInstanceCreator;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Functional tests for the serialization and deserialization of parameterized types in Gson.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ParameterizedTypesTest extends TestCase {static class __CLR4_4_14d84d8le6rvqsa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532025874L,8589935092L,5882,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14d84d8le6rvqsa.R.inc(5660);
    __CLR4_4_14d84d8le6rvqsa.R.inc(5661);super.setUp();
    __CLR4_4_14d84d8le6rvqsa.R.inc(5662);gson = new Gson();
  }finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}}


public void testTypesWithMultipleParametersDeserialization112() throws Exception {__CLR4_4_14d84d8le6rvqsa.R.globalSliceStart(getClass().getName(),5663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19r0t5b4db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14d84d8le6rvqsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_14d84d8le6rvqsa.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testTypesWithMultipleParametersDeserialization112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19r0t5b4db() throws Exception{try{__CLR4_4_14d84d8le6rvqsa.R.inc(5663); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5664);Type typeOfTarget = new TypeToken<MultiParameters<Integer, Float, Double, String, BagOfPrimitives>>() { 
     }.getType(); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5665);String json = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}"; 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5666);MultiParameters<Integer, Float, Double, String, BagOfPrimitives> target = gson.fromJson(json, typeOfTarget); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5667);MultiParameters<Integer, Float, Double, String, BagOfPrimitives> expected = new MultiParameters<Integer, Float, Double, String, BagOfPrimitives>(10, 1.0F, 2.1D, "abc", new BagOfPrimitives()); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5668);assertEquals(expected, target); 
 }finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}} 


@SuppressWarnings("unchecked") 
 public void testParameterizedTypeGenericArraysSerialization150() throws Exception {__CLR4_4_14d84d8le6rvqsa.R.globalSliceStart(getClass().getName(),5669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19yvwh94dh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14d84d8le6rvqsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_14d84d8le6rvqsa.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testParameterizedTypeGenericArraysSerialization150",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19yvwh94dh() throws Exception{try{__CLR4_4_14d84d8le6rvqsa.R.inc(5669); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5670);List<Integer> list = new ArrayList<Integer>(); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5671);list.add(1); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5672);list.add(2); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5673);List<Integer>[] arrayOfLists = new List[] { list, list }; 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5674);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() { 
     }.getType(); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5675);ObjectWithTypeVariables<Integer> objToSerialize = new ObjectWithTypeVariables<Integer>(null, null, null, arrayOfLists, null, null); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5676);String json = gson.toJson(objToSerialize, typeOfSrc); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5677);assertEquals("{\"arrayOfListOfTypeParameters\":[[1,2],[1,2]]}", json); 
 }finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}} 


public void testVariableTypeArrayDeserialization174() throws Exception {__CLR4_4_14d84d8le6rvqsa.R.globalSliceStart(getClass().getName(),5678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ildhvt4dq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14d84d8le6rvqsa.R.rethrow($CLV_t2$);}finally{__CLR4_4_14d84d8le6rvqsa.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testVariableTypeArrayDeserialization174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ildhvt4dq() throws Exception{try{__CLR4_4_14d84d8le6rvqsa.R.inc(5678); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5679);Integer[] array = { 1, 2, 3 }; 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5680);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() { 
     }.getType(); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5681);ObjectWithTypeVariables<Integer> objToSerialize = new ObjectWithTypeVariables<Integer>(null, array, null, null, null, null); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5682);String json = gson.toJson(objToSerialize, typeOfSrc); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5683);ObjectWithTypeVariables<Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc); 
     __CLR4_4_14d84d8le6rvqsa.R.inc(5684);assertEquals(objAfterDeserialization.getExpectedJson(), json); 
 }finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * An test object that has fields that are type variables.
   *
   * @param <T> Enforce T to be a string to make writing the "toExpectedJson" method easier.
   */
  private static class ObjectWithTypeVariables<T extends Number> {
    private final T typeParameterObj;
    private final T[] typeParameterArray;
    private final List<T> listOfTypeParameters;
    private final List<T>[] arrayOfListOfTypeParameters;
    private final List<? extends T> listOfWildcardTypeParameters;
    private final List<? extends T>[] arrayOfListOfWildcardTypeParameters;

    // For use by Gson
    @SuppressWarnings("unused")
    private ObjectWithTypeVariables() {
      this(null, null, null, null, null, null);__CLR4_4_14d84d8le6rvqsa.R.inc(5686);try{__CLR4_4_14d84d8le6rvqsa.R.inc(5685);
    }finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}}

    public ObjectWithTypeVariables(T obj, T[] array, List<T> list, List<T>[] arrayOfList,
        List<? extends T> wildcardList, List<? extends T>[] arrayOfWildcardList) {try{__CLR4_4_14d84d8le6rvqsa.R.inc(5687);
      __CLR4_4_14d84d8le6rvqsa.R.inc(5688);this.typeParameterObj = obj;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5689);this.typeParameterArray = array;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5690);this.listOfTypeParameters = list;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5691);this.arrayOfListOfTypeParameters = arrayOfList;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5692);this.listOfWildcardTypeParameters = wildcardList;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5693);this.arrayOfListOfWildcardTypeParameters = arrayOfWildcardList;
    }finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_14d84d8le6rvqsa.R.inc(5694);
      __CLR4_4_14d84d8le6rvqsa.R.inc(5695);StringBuilder sb = new StringBuilder().append("{");

      __CLR4_4_14d84d8le6rvqsa.R.inc(5696);boolean needsComma = false;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5697);if ((((typeParameterObj != null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5698)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5699)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5700);sb.append("\"typeParameterObj\":").append(toString(typeParameterObj));
        __CLR4_4_14d84d8le6rvqsa.R.inc(5701);needsComma = true;
      }

      }__CLR4_4_14d84d8le6rvqsa.R.inc(5702);if ((((typeParameterArray != null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5703)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5704)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5705);if ((((needsComma)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5706)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5707)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5708);sb.append(',');
        }
        }__CLR4_4_14d84d8le6rvqsa.R.inc(5709);sb.append("\"typeParameterArray\":[");
        __CLR4_4_14d84d8le6rvqsa.R.inc(5710);appendObjectsToBuilder(sb, Arrays.asList(typeParameterArray));
        __CLR4_4_14d84d8le6rvqsa.R.inc(5711);sb.append(']');
        __CLR4_4_14d84d8le6rvqsa.R.inc(5712);needsComma = true;
      }

      }__CLR4_4_14d84d8le6rvqsa.R.inc(5713);if ((((listOfTypeParameters != null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5714)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5715)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5716);if ((((needsComma)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5717)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5718)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5719);sb.append(',');
        }
        }__CLR4_4_14d84d8le6rvqsa.R.inc(5720);sb.append("\"listOfTypeParameters\":[");
        __CLR4_4_14d84d8le6rvqsa.R.inc(5721);appendObjectsToBuilder(sb, listOfTypeParameters);
        __CLR4_4_14d84d8le6rvqsa.R.inc(5722);sb.append(']');
        __CLR4_4_14d84d8le6rvqsa.R.inc(5723);needsComma = true;
      }

      }__CLR4_4_14d84d8le6rvqsa.R.inc(5724);if ((((arrayOfListOfTypeParameters != null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5725)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5726)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5727);if ((((needsComma)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5728)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5729)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5730);sb.append(',');
        }
        }__CLR4_4_14d84d8le6rvqsa.R.inc(5731);sb.append("\"arrayOfListOfTypeParameters\":[");
        __CLR4_4_14d84d8le6rvqsa.R.inc(5732);appendObjectsToBuilder(sb, arrayOfListOfTypeParameters);
        __CLR4_4_14d84d8le6rvqsa.R.inc(5733);sb.append(']');
        __CLR4_4_14d84d8le6rvqsa.R.inc(5734);needsComma = true;
      }

      }__CLR4_4_14d84d8le6rvqsa.R.inc(5735);if ((((listOfWildcardTypeParameters != null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5736)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5737)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5738);if ((((needsComma)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5739)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5740)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5741);sb.append(',');
        }
        }__CLR4_4_14d84d8le6rvqsa.R.inc(5742);sb.append("\"listOfWildcardTypeParameters\":[");
        __CLR4_4_14d84d8le6rvqsa.R.inc(5743);appendObjectsToBuilder(sb, listOfWildcardTypeParameters);
        __CLR4_4_14d84d8le6rvqsa.R.inc(5744);sb.append(']');
        __CLR4_4_14d84d8le6rvqsa.R.inc(5745);needsComma = true;
      }

      }__CLR4_4_14d84d8le6rvqsa.R.inc(5746);if ((((arrayOfListOfWildcardTypeParameters != null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5747)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5748)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5749);if ((((needsComma)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5750)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5751)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5752);sb.append(',');
        }
        }__CLR4_4_14d84d8le6rvqsa.R.inc(5753);sb.append("\"arrayOfListOfWildcardTypeParameters\":[");
        __CLR4_4_14d84d8le6rvqsa.R.inc(5754);appendObjectsToBuilder(sb, arrayOfListOfWildcardTypeParameters);
        __CLR4_4_14d84d8le6rvqsa.R.inc(5755);sb.append(']');
        __CLR4_4_14d84d8le6rvqsa.R.inc(5756);needsComma = true;
      }
      }__CLR4_4_14d84d8le6rvqsa.R.inc(5757);sb.append('}');
      __CLR4_4_14d84d8le6rvqsa.R.inc(5758);return sb.toString();
    }finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, Iterable<? extends T> iterable) {try{__CLR4_4_14d84d8le6rvqsa.R.inc(5759);
      __CLR4_4_14d84d8le6rvqsa.R.inc(5760);boolean isFirst = true;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5761);for (T obj : iterable) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5762);if ((((!isFirst)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5763)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5764)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5765);sb.append(',');
        }
        }__CLR4_4_14d84d8le6rvqsa.R.inc(5766);isFirst = false;
        __CLR4_4_14d84d8le6rvqsa.R.inc(5767);sb.append(toString(obj));
      }
    }}finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, List<? extends T>[] arrayOfList) {try{__CLR4_4_14d84d8le6rvqsa.R.inc(5768);
      __CLR4_4_14d84d8le6rvqsa.R.inc(5769);boolean isFirst = true;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5770);for (List<? extends T> list : arrayOfList) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5771);if ((((!isFirst)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5772)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5773)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5774);sb.append(',');
        }
        }__CLR4_4_14d84d8le6rvqsa.R.inc(5775);isFirst = false;
        __CLR4_4_14d84d8le6rvqsa.R.inc(5776);if ((((list != null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5777)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5778)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5779);sb.append('[');
          __CLR4_4_14d84d8le6rvqsa.R.inc(5780);appendObjectsToBuilder(sb, list);
          __CLR4_4_14d84d8le6rvqsa.R.inc(5781);sb.append(']');
        } }else {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5782);sb.append("null");
        }
      }}
    }}finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}}

    public String toString(T obj) {try{__CLR4_4_14d84d8le6rvqsa.R.inc(5783);
      __CLR4_4_14d84d8le6rvqsa.R.inc(5784);return obj.toString();
    }finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}}
  }

  private static class MultiParameters<A, B, C, D, E> {
    A a;
    B b;
    C c;
    D d;
    E e;
    // For use by Gson
    @SuppressWarnings("unused")
    private MultiParameters() {try{__CLR4_4_14d84d8le6rvqsa.R.inc(5785);
    }finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}}
    MultiParameters(A a, B b, C c, D d, E e) {
      super();__CLR4_4_14d84d8le6rvqsa.R.inc(5787);try{__CLR4_4_14d84d8le6rvqsa.R.inc(5786);
      __CLR4_4_14d84d8le6rvqsa.R.inc(5788);this.a = a;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5789);this.b = b;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5790);this.c = c;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5791);this.d = d;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5792);this.e = e;
    }finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}}
    @Override
    public int hashCode() {try{__CLR4_4_14d84d8le6rvqsa.R.inc(5793);
      __CLR4_4_14d84d8le6rvqsa.R.inc(5794);final int prime = 31;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5795);int result = 1;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5796);result = prime * result + (((((a == null) )&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5797)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5798)==0&false))? 0 : a.hashCode());
      __CLR4_4_14d84d8le6rvqsa.R.inc(5799);result = prime * result + (((((b == null) )&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5800)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5801)==0&false))? 0 : b.hashCode());
      __CLR4_4_14d84d8le6rvqsa.R.inc(5802);result = prime * result + (((((c == null) )&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5803)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5804)==0&false))? 0 : c.hashCode());
      __CLR4_4_14d84d8le6rvqsa.R.inc(5805);result = prime * result + (((((d == null) )&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5806)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5807)==0&false))? 0 : d.hashCode());
      __CLR4_4_14d84d8le6rvqsa.R.inc(5808);result = prime * result + (((((e == null) )&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5809)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5810)==0&false))? 0 : e.hashCode());
      __CLR4_4_14d84d8le6rvqsa.R.inc(5811);return result;
    }finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}}
    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {try{__CLR4_4_14d84d8le6rvqsa.R.inc(5812);
      __CLR4_4_14d84d8le6rvqsa.R.inc(5813);if ((((this == obj)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5814)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5815)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5816);return true;
      }
      }__CLR4_4_14d84d8le6rvqsa.R.inc(5817);if ((((obj == null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5818)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5819)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5820);return false;
      }
      }__CLR4_4_14d84d8le6rvqsa.R.inc(5821);if ((((getClass() != obj.getClass())&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5822)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5823)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5824);return false;
      }
      }__CLR4_4_14d84d8le6rvqsa.R.inc(5825);MultiParameters<A, B, C, D, E> other = (MultiParameters<A, B, C, D, E>) obj;
      __CLR4_4_14d84d8le6rvqsa.R.inc(5826);if ((((a == null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5827)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5828)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5829);if ((((other.a != null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5830)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5831)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5832);return false;
        }
      }} }else {__CLR4_4_14d84d8le6rvqsa.R.inc(5833);if ((((!a.equals(other.a))&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5834)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5835)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5836);return false;
      }
      }}__CLR4_4_14d84d8le6rvqsa.R.inc(5837);if ((((b == null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5838)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5839)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5840);if ((((other.b != null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5841)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5842)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5843);return false;
        }
      }} }else {__CLR4_4_14d84d8le6rvqsa.R.inc(5844);if ((((!b.equals(other.b))&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5845)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5846)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5847);return false;
      }
      }}__CLR4_4_14d84d8le6rvqsa.R.inc(5848);if ((((c == null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5849)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5850)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5851);if ((((other.c != null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5852)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5853)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5854);return false;
        }
      }} }else {__CLR4_4_14d84d8le6rvqsa.R.inc(5855);if ((((!c.equals(other.c))&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5856)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5857)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5858);return false;
      }
      }}__CLR4_4_14d84d8le6rvqsa.R.inc(5859);if ((((d == null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5860)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5861)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5862);if ((((other.d != null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5863)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5864)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5865);return false;
        }
      }} }else {__CLR4_4_14d84d8le6rvqsa.R.inc(5866);if ((((!d.equals(other.d))&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5867)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5868)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5869);return false;
      }
      }}__CLR4_4_14d84d8le6rvqsa.R.inc(5870);if ((((e == null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5871)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5872)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5873);if ((((other.e != null)&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5874)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5875)==0&false))) {{
          __CLR4_4_14d84d8le6rvqsa.R.inc(5876);return false;
        }
      }} }else {__CLR4_4_14d84d8le6rvqsa.R.inc(5877);if ((((!e.equals(other.e))&&(__CLR4_4_14d84d8le6rvqsa.R.iget(5878)!=0|true))||(__CLR4_4_14d84d8le6rvqsa.R.iget(5879)==0&false))) {{
        __CLR4_4_14d84d8le6rvqsa.R.inc(5880);return false;
      }
      }}__CLR4_4_14d84d8le6rvqsa.R.inc(5881);return true;
    }finally{__CLR4_4_14d84d8le6rvqsa.R.flushNeeded();}}
  }
  
  // Begin: tests to reproduce issue 103
  private static class Quantity {
    @SuppressWarnings("unused")
    int q = 10;
  }
  private static class MyQuantity extends Quantity {
    @SuppressWarnings("unused")
    int q2 = 20;
  }
  private interface Measurable<T> {    
  }
  private interface Field<T> {    
  }
  private interface Immutable {    
  }
  
  public static final class Amount<Q extends Quantity> 
      implements Measurable<Q>, Field<Amount<?>>, Serializable, Immutable {
    private static final long serialVersionUID = -7560491093120970437L;

    int value = 30;
  }
  
  
  
  
  // End: tests to reproduce issue 103
}
