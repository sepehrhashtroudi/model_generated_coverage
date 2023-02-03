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
public class ParameterizedTypesTest extends TestCase {static class __CLR4_4_14dk4dkld3ms44f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,5887,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14dk4dkld3ms44f.R.inc(5672);
    __CLR4_4_14dk4dkld3ms44f.R.inc(5673);super.setUp();
    __CLR4_4_14dk4dkld3ms44f.R.inc(5674);gson = new Gson();
  }finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}}


public void testTypesWithMultipleParametersDeserialization114() throws Exception {__CLR4_4_14dk4dkld3ms44f.R.globalSliceStart(getClass().getName(),5675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1390vkd4dn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dk4dkld3ms44f.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dk4dkld3ms44f.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testTypesWithMultipleParametersDeserialization114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1390vkd4dn() throws Exception{try{__CLR4_4_14dk4dkld3ms44f.R.inc(5675); 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5676);Type typeOfTarget = new TypeToken<MultiParameters<Integer, Float, Double, String, BagOfPrimitives>>() { 
     }.getType(); 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5677);String json = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}"; 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5678);MultiParameters<Integer, Float, Double, String, BagOfPrimitives> target = gson.fromJson(json, typeOfTarget); 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5679);MultiParameters<Integer, Float, Double, String, BagOfPrimitives> expected = new MultiParameters<Integer, Float, Double, String, BagOfPrimitives>(10, 1.0F, 2.1D, "abc", new BagOfPrimitives()); 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5680);assertEquals(expected, target); 
 }finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}} 


@SuppressWarnings("unchecked") 
 public void testParameterizedTypeGenericArraysSerialization148() throws Exception {__CLR4_4_14dk4dkld3ms44f.R.globalSliceStart(getClass().getName(),5681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dor2p04dt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dk4dkld3ms44f.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dk4dkld3ms44f.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testParameterizedTypeGenericArraysSerialization148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dor2p04dt() throws Exception{try{__CLR4_4_14dk4dkld3ms44f.R.inc(5681); 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5682);List<Integer> list = new ArrayList<Integer>(); 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5683);list.add(1); 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5684);list.add(2); 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5685);List<Integer>[] arrayOfLists = new List[] { list, list }; 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5686);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() { 
     }.getType(); 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5687);ObjectWithTypeVariables<Integer> objToSerialize = new ObjectWithTypeVariables<Integer>(null, null, null, arrayOfLists, null, null); 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5688);String json = gson.toJson(objToSerialize, typeOfSrc); 
     __CLR4_4_14dk4dkld3ms44f.R.inc(5689);assertEquals("{\"arrayOfListOfTypeParameters\":[[1,2],[1,2]]}", json); 
 }finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

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
      this(null, null, null, null, null, null);__CLR4_4_14dk4dkld3ms44f.R.inc(5691);try{__CLR4_4_14dk4dkld3ms44f.R.inc(5690);
    }finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}}

    public ObjectWithTypeVariables(T obj, T[] array, List<T> list, List<T>[] arrayOfList,
        List<? extends T> wildcardList, List<? extends T>[] arrayOfWildcardList) {try{__CLR4_4_14dk4dkld3ms44f.R.inc(5692);
      __CLR4_4_14dk4dkld3ms44f.R.inc(5693);this.typeParameterObj = obj;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5694);this.typeParameterArray = array;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5695);this.listOfTypeParameters = list;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5696);this.arrayOfListOfTypeParameters = arrayOfList;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5697);this.listOfWildcardTypeParameters = wildcardList;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5698);this.arrayOfListOfWildcardTypeParameters = arrayOfWildcardList;
    }finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_14dk4dkld3ms44f.R.inc(5699);
      __CLR4_4_14dk4dkld3ms44f.R.inc(5700);StringBuilder sb = new StringBuilder().append("{");

      __CLR4_4_14dk4dkld3ms44f.R.inc(5701);boolean needsComma = false;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5702);if ((((typeParameterObj != null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5703)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5704)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5705);sb.append("\"typeParameterObj\":").append(toString(typeParameterObj));
        __CLR4_4_14dk4dkld3ms44f.R.inc(5706);needsComma = true;
      }

      }__CLR4_4_14dk4dkld3ms44f.R.inc(5707);if ((((typeParameterArray != null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5708)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5709)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5710);if ((((needsComma)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5711)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5712)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5713);sb.append(',');
        }
        }__CLR4_4_14dk4dkld3ms44f.R.inc(5714);sb.append("\"typeParameterArray\":[");
        __CLR4_4_14dk4dkld3ms44f.R.inc(5715);appendObjectsToBuilder(sb, Arrays.asList(typeParameterArray));
        __CLR4_4_14dk4dkld3ms44f.R.inc(5716);sb.append(']');
        __CLR4_4_14dk4dkld3ms44f.R.inc(5717);needsComma = true;
      }

      }__CLR4_4_14dk4dkld3ms44f.R.inc(5718);if ((((listOfTypeParameters != null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5719)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5720)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5721);if ((((needsComma)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5722)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5723)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5724);sb.append(',');
        }
        }__CLR4_4_14dk4dkld3ms44f.R.inc(5725);sb.append("\"listOfTypeParameters\":[");
        __CLR4_4_14dk4dkld3ms44f.R.inc(5726);appendObjectsToBuilder(sb, listOfTypeParameters);
        __CLR4_4_14dk4dkld3ms44f.R.inc(5727);sb.append(']');
        __CLR4_4_14dk4dkld3ms44f.R.inc(5728);needsComma = true;
      }

      }__CLR4_4_14dk4dkld3ms44f.R.inc(5729);if ((((arrayOfListOfTypeParameters != null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5730)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5731)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5732);if ((((needsComma)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5733)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5734)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5735);sb.append(',');
        }
        }__CLR4_4_14dk4dkld3ms44f.R.inc(5736);sb.append("\"arrayOfListOfTypeParameters\":[");
        __CLR4_4_14dk4dkld3ms44f.R.inc(5737);appendObjectsToBuilder(sb, arrayOfListOfTypeParameters);
        __CLR4_4_14dk4dkld3ms44f.R.inc(5738);sb.append(']');
        __CLR4_4_14dk4dkld3ms44f.R.inc(5739);needsComma = true;
      }

      }__CLR4_4_14dk4dkld3ms44f.R.inc(5740);if ((((listOfWildcardTypeParameters != null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5741)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5742)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5743);if ((((needsComma)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5744)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5745)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5746);sb.append(',');
        }
        }__CLR4_4_14dk4dkld3ms44f.R.inc(5747);sb.append("\"listOfWildcardTypeParameters\":[");
        __CLR4_4_14dk4dkld3ms44f.R.inc(5748);appendObjectsToBuilder(sb, listOfWildcardTypeParameters);
        __CLR4_4_14dk4dkld3ms44f.R.inc(5749);sb.append(']');
        __CLR4_4_14dk4dkld3ms44f.R.inc(5750);needsComma = true;
      }

      }__CLR4_4_14dk4dkld3ms44f.R.inc(5751);if ((((arrayOfListOfWildcardTypeParameters != null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5752)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5753)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5754);if ((((needsComma)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5755)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5756)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5757);sb.append(',');
        }
        }__CLR4_4_14dk4dkld3ms44f.R.inc(5758);sb.append("\"arrayOfListOfWildcardTypeParameters\":[");
        __CLR4_4_14dk4dkld3ms44f.R.inc(5759);appendObjectsToBuilder(sb, arrayOfListOfWildcardTypeParameters);
        __CLR4_4_14dk4dkld3ms44f.R.inc(5760);sb.append(']');
        __CLR4_4_14dk4dkld3ms44f.R.inc(5761);needsComma = true;
      }
      }__CLR4_4_14dk4dkld3ms44f.R.inc(5762);sb.append('}');
      __CLR4_4_14dk4dkld3ms44f.R.inc(5763);return sb.toString();
    }finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, Iterable<? extends T> iterable) {try{__CLR4_4_14dk4dkld3ms44f.R.inc(5764);
      __CLR4_4_14dk4dkld3ms44f.R.inc(5765);boolean isFirst = true;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5766);for (T obj : iterable) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5767);if ((((!isFirst)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5768)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5769)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5770);sb.append(',');
        }
        }__CLR4_4_14dk4dkld3ms44f.R.inc(5771);isFirst = false;
        __CLR4_4_14dk4dkld3ms44f.R.inc(5772);sb.append(toString(obj));
      }
    }}finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, List<? extends T>[] arrayOfList) {try{__CLR4_4_14dk4dkld3ms44f.R.inc(5773);
      __CLR4_4_14dk4dkld3ms44f.R.inc(5774);boolean isFirst = true;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5775);for (List<? extends T> list : arrayOfList) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5776);if ((((!isFirst)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5777)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5778)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5779);sb.append(',');
        }
        }__CLR4_4_14dk4dkld3ms44f.R.inc(5780);isFirst = false;
        __CLR4_4_14dk4dkld3ms44f.R.inc(5781);if ((((list != null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5782)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5783)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5784);sb.append('[');
          __CLR4_4_14dk4dkld3ms44f.R.inc(5785);appendObjectsToBuilder(sb, list);
          __CLR4_4_14dk4dkld3ms44f.R.inc(5786);sb.append(']');
        } }else {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5787);sb.append("null");
        }
      }}
    }}finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}}

    public String toString(T obj) {try{__CLR4_4_14dk4dkld3ms44f.R.inc(5788);
      __CLR4_4_14dk4dkld3ms44f.R.inc(5789);return obj.toString();
    }finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}}
  }

  private static class MultiParameters<A, B, C, D, E> {
    A a;
    B b;
    C c;
    D d;
    E e;
    // For use by Gson
    @SuppressWarnings("unused")
    private MultiParameters() {try{__CLR4_4_14dk4dkld3ms44f.R.inc(5790);
    }finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}}
    MultiParameters(A a, B b, C c, D d, E e) {
      super();__CLR4_4_14dk4dkld3ms44f.R.inc(5792);try{__CLR4_4_14dk4dkld3ms44f.R.inc(5791);
      __CLR4_4_14dk4dkld3ms44f.R.inc(5793);this.a = a;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5794);this.b = b;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5795);this.c = c;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5796);this.d = d;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5797);this.e = e;
    }finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}}
    @Override
    public int hashCode() {try{__CLR4_4_14dk4dkld3ms44f.R.inc(5798);
      __CLR4_4_14dk4dkld3ms44f.R.inc(5799);final int prime = 31;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5800);int result = 1;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5801);result = prime * result + (((((a == null) )&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5802)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5803)==0&false))? 0 : a.hashCode());
      __CLR4_4_14dk4dkld3ms44f.R.inc(5804);result = prime * result + (((((b == null) )&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5805)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5806)==0&false))? 0 : b.hashCode());
      __CLR4_4_14dk4dkld3ms44f.R.inc(5807);result = prime * result + (((((c == null) )&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5808)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5809)==0&false))? 0 : c.hashCode());
      __CLR4_4_14dk4dkld3ms44f.R.inc(5810);result = prime * result + (((((d == null) )&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5811)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5812)==0&false))? 0 : d.hashCode());
      __CLR4_4_14dk4dkld3ms44f.R.inc(5813);result = prime * result + (((((e == null) )&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5814)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5815)==0&false))? 0 : e.hashCode());
      __CLR4_4_14dk4dkld3ms44f.R.inc(5816);return result;
    }finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}}
    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {try{__CLR4_4_14dk4dkld3ms44f.R.inc(5817);
      __CLR4_4_14dk4dkld3ms44f.R.inc(5818);if ((((this == obj)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5819)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5820)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5821);return true;
      }
      }__CLR4_4_14dk4dkld3ms44f.R.inc(5822);if ((((obj == null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5823)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5824)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5825);return false;
      }
      }__CLR4_4_14dk4dkld3ms44f.R.inc(5826);if ((((getClass() != obj.getClass())&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5827)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5828)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5829);return false;
      }
      }__CLR4_4_14dk4dkld3ms44f.R.inc(5830);MultiParameters<A, B, C, D, E> other = (MultiParameters<A, B, C, D, E>) obj;
      __CLR4_4_14dk4dkld3ms44f.R.inc(5831);if ((((a == null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5832)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5833)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5834);if ((((other.a != null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5835)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5836)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5837);return false;
        }
      }} }else {__CLR4_4_14dk4dkld3ms44f.R.inc(5838);if ((((!a.equals(other.a))&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5839)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5840)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5841);return false;
      }
      }}__CLR4_4_14dk4dkld3ms44f.R.inc(5842);if ((((b == null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5843)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5844)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5845);if ((((other.b != null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5846)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5847)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5848);return false;
        }
      }} }else {__CLR4_4_14dk4dkld3ms44f.R.inc(5849);if ((((!b.equals(other.b))&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5850)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5851)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5852);return false;
      }
      }}__CLR4_4_14dk4dkld3ms44f.R.inc(5853);if ((((c == null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5854)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5855)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5856);if ((((other.c != null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5857)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5858)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5859);return false;
        }
      }} }else {__CLR4_4_14dk4dkld3ms44f.R.inc(5860);if ((((!c.equals(other.c))&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5861)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5862)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5863);return false;
      }
      }}__CLR4_4_14dk4dkld3ms44f.R.inc(5864);if ((((d == null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5865)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5866)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5867);if ((((other.d != null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5868)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5869)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5870);return false;
        }
      }} }else {__CLR4_4_14dk4dkld3ms44f.R.inc(5871);if ((((!d.equals(other.d))&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5872)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5873)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5874);return false;
      }
      }}__CLR4_4_14dk4dkld3ms44f.R.inc(5875);if ((((e == null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5876)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5877)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5878);if ((((other.e != null)&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5879)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5880)==0&false))) {{
          __CLR4_4_14dk4dkld3ms44f.R.inc(5881);return false;
        }
      }} }else {__CLR4_4_14dk4dkld3ms44f.R.inc(5882);if ((((!e.equals(other.e))&&(__CLR4_4_14dk4dkld3ms44f.R.iget(5883)!=0|true))||(__CLR4_4_14dk4dkld3ms44f.R.iget(5884)==0&false))) {{
        __CLR4_4_14dk4dkld3ms44f.R.inc(5885);return false;
      }
      }}__CLR4_4_14dk4dkld3ms44f.R.inc(5886);return true;
    }finally{__CLR4_4_14dk4dkld3ms44f.R.flushNeeded();}}
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
