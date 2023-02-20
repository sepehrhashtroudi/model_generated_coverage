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
public class ParameterizedTypesTest extends TestCase {static class __CLR4_4_14ec4ecle6rzh0k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,5913,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5700);
    __CLR4_4_14ec4ecle6rzh0k.R.inc(5701);super.setUp();
    __CLR4_4_14ec4ecle6rzh0k.R.inc(5702);gson = new Gson();
  }finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}}


public void testTypesWithMultipleParametersDeserialization113() throws Exception {__CLR4_4_14ec4ecle6rzh0k.R.globalSliceStart(getClass().getName(),5703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16i0ucu4ef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ec4ecle6rzh0k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ec4ecle6rzh0k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testTypesWithMultipleParametersDeserialization113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16i0ucu4ef() throws Exception{try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5703); 
     __CLR4_4_14ec4ecle6rzh0k.R.inc(5704);Type typeOfTarget = new TypeToken<MultiParameters<Integer, Float, Double, String, BagOfPrimitives>>() { 
     }.getType(); 
     __CLR4_4_14ec4ecle6rzh0k.R.inc(5705);String json = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}"; 
     __CLR4_4_14ec4ecle6rzh0k.R.inc(5706);MultiParameters<Integer, Float, Double, String, BagOfPrimitives> target = gson.fromJson(json, typeOfTarget); 
     __CLR4_4_14ec4ecle6rzh0k.R.inc(5707);MultiParameters<Integer, Float, Double, String, BagOfPrimitives> expected = new MultiParameters<Integer, Float, Double, String, BagOfPrimitives>(10, 1.0F, 2.1D, "abc", new BagOfPrimitives()); 
     __CLR4_4_14ec4ecle6rzh0k.R.inc(5708);assertEquals(expected, target); 
 }finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}} 


public void testVariableTypeArrayDeserialization172() throws Exception {__CLR4_4_14ec4ecle6rzh0k.R.globalSliceStart(getClass().getName(),5709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3dfgr4el();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ec4ecle6rzh0k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ec4ecle6rzh0k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testVariableTypeArrayDeserialization172",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3dfgr4el() throws Exception{try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5709); 
     __CLR4_4_14ec4ecle6rzh0k.R.inc(5710);Integer[] array = { 1, 2, 3 }; 
     __CLR4_4_14ec4ecle6rzh0k.R.inc(5711);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() { 
     }.getType(); 
     __CLR4_4_14ec4ecle6rzh0k.R.inc(5712);ObjectWithTypeVariables<Integer> objToSerialize = new ObjectWithTypeVariables<Integer>(null, array, null, null, null, null); 
     __CLR4_4_14ec4ecle6rzh0k.R.inc(5713);String json = gson.toJson(objToSerialize, typeOfSrc); 
     __CLR4_4_14ec4ecle6rzh0k.R.inc(5714);ObjectWithTypeVariables<Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc); 
     __CLR4_4_14ec4ecle6rzh0k.R.inc(5715);assertEquals(objAfterDeserialization.getExpectedJson(), json); 
 }finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

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
      this(null, null, null, null, null, null);__CLR4_4_14ec4ecle6rzh0k.R.inc(5717);try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5716);
    }finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}}

    public ObjectWithTypeVariables(T obj, T[] array, List<T> list, List<T>[] arrayOfList,
        List<? extends T> wildcardList, List<? extends T>[] arrayOfWildcardList) {try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5718);
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5719);this.typeParameterObj = obj;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5720);this.typeParameterArray = array;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5721);this.listOfTypeParameters = list;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5722);this.arrayOfListOfTypeParameters = arrayOfList;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5723);this.listOfWildcardTypeParameters = wildcardList;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5724);this.arrayOfListOfWildcardTypeParameters = arrayOfWildcardList;
    }finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5725);
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5726);StringBuilder sb = new StringBuilder().append("{");

      __CLR4_4_14ec4ecle6rzh0k.R.inc(5727);boolean needsComma = false;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5728);if ((((typeParameterObj != null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5729)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5730)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5731);sb.append("\"typeParameterObj\":").append(toString(typeParameterObj));
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5732);needsComma = true;
      }

      }__CLR4_4_14ec4ecle6rzh0k.R.inc(5733);if ((((typeParameterArray != null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5734)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5735)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5736);if ((((needsComma)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5737)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5738)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5739);sb.append(',');
        }
        }__CLR4_4_14ec4ecle6rzh0k.R.inc(5740);sb.append("\"typeParameterArray\":[");
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5741);appendObjectsToBuilder(sb, Arrays.asList(typeParameterArray));
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5742);sb.append(']');
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5743);needsComma = true;
      }

      }__CLR4_4_14ec4ecle6rzh0k.R.inc(5744);if ((((listOfTypeParameters != null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5745)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5746)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5747);if ((((needsComma)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5748)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5749)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5750);sb.append(',');
        }
        }__CLR4_4_14ec4ecle6rzh0k.R.inc(5751);sb.append("\"listOfTypeParameters\":[");
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5752);appendObjectsToBuilder(sb, listOfTypeParameters);
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5753);sb.append(']');
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5754);needsComma = true;
      }

      }__CLR4_4_14ec4ecle6rzh0k.R.inc(5755);if ((((arrayOfListOfTypeParameters != null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5756)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5757)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5758);if ((((needsComma)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5759)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5760)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5761);sb.append(',');
        }
        }__CLR4_4_14ec4ecle6rzh0k.R.inc(5762);sb.append("\"arrayOfListOfTypeParameters\":[");
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5763);appendObjectsToBuilder(sb, arrayOfListOfTypeParameters);
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5764);sb.append(']');
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5765);needsComma = true;
      }

      }__CLR4_4_14ec4ecle6rzh0k.R.inc(5766);if ((((listOfWildcardTypeParameters != null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5767)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5768)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5769);if ((((needsComma)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5770)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5771)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5772);sb.append(',');
        }
        }__CLR4_4_14ec4ecle6rzh0k.R.inc(5773);sb.append("\"listOfWildcardTypeParameters\":[");
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5774);appendObjectsToBuilder(sb, listOfWildcardTypeParameters);
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5775);sb.append(']');
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5776);needsComma = true;
      }

      }__CLR4_4_14ec4ecle6rzh0k.R.inc(5777);if ((((arrayOfListOfWildcardTypeParameters != null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5778)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5779)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5780);if ((((needsComma)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5781)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5782)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5783);sb.append(',');
        }
        }__CLR4_4_14ec4ecle6rzh0k.R.inc(5784);sb.append("\"arrayOfListOfWildcardTypeParameters\":[");
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5785);appendObjectsToBuilder(sb, arrayOfListOfWildcardTypeParameters);
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5786);sb.append(']');
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5787);needsComma = true;
      }
      }__CLR4_4_14ec4ecle6rzh0k.R.inc(5788);sb.append('}');
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5789);return sb.toString();
    }finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, Iterable<? extends T> iterable) {try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5790);
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5791);boolean isFirst = true;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5792);for (T obj : iterable) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5793);if ((((!isFirst)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5794)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5795)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5796);sb.append(',');
        }
        }__CLR4_4_14ec4ecle6rzh0k.R.inc(5797);isFirst = false;
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5798);sb.append(toString(obj));
      }
    }}finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, List<? extends T>[] arrayOfList) {try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5799);
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5800);boolean isFirst = true;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5801);for (List<? extends T> list : arrayOfList) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5802);if ((((!isFirst)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5803)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5804)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5805);sb.append(',');
        }
        }__CLR4_4_14ec4ecle6rzh0k.R.inc(5806);isFirst = false;
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5807);if ((((list != null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5808)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5809)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5810);sb.append('[');
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5811);appendObjectsToBuilder(sb, list);
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5812);sb.append(']');
        } }else {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5813);sb.append("null");
        }
      }}
    }}finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}}

    public String toString(T obj) {try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5814);
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5815);return obj.toString();
    }finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}}
  }

  private static class MultiParameters<A, B, C, D, E> {
    A a;
    B b;
    C c;
    D d;
    E e;
    // For use by Gson
    @SuppressWarnings("unused")
    private MultiParameters() {try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5816);
    }finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}}
    MultiParameters(A a, B b, C c, D d, E e) {
      super();__CLR4_4_14ec4ecle6rzh0k.R.inc(5818);try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5817);
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5819);this.a = a;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5820);this.b = b;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5821);this.c = c;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5822);this.d = d;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5823);this.e = e;
    }finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}}
    @Override
    public int hashCode() {try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5824);
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5825);final int prime = 31;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5826);int result = 1;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5827);result = prime * result + (((((a == null) )&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5828)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5829)==0&false))? 0 : a.hashCode());
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5830);result = prime * result + (((((b == null) )&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5831)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5832)==0&false))? 0 : b.hashCode());
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5833);result = prime * result + (((((c == null) )&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5834)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5835)==0&false))? 0 : c.hashCode());
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5836);result = prime * result + (((((d == null) )&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5837)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5838)==0&false))? 0 : d.hashCode());
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5839);result = prime * result + (((((e == null) )&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5840)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5841)==0&false))? 0 : e.hashCode());
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5842);return result;
    }finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}}
    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {try{__CLR4_4_14ec4ecle6rzh0k.R.inc(5843);
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5844);if ((((this == obj)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5845)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5846)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5847);return true;
      }
      }__CLR4_4_14ec4ecle6rzh0k.R.inc(5848);if ((((obj == null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5849)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5850)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5851);return false;
      }
      }__CLR4_4_14ec4ecle6rzh0k.R.inc(5852);if ((((getClass() != obj.getClass())&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5853)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5854)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5855);return false;
      }
      }__CLR4_4_14ec4ecle6rzh0k.R.inc(5856);MultiParameters<A, B, C, D, E> other = (MultiParameters<A, B, C, D, E>) obj;
      __CLR4_4_14ec4ecle6rzh0k.R.inc(5857);if ((((a == null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5858)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5859)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5860);if ((((other.a != null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5861)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5862)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5863);return false;
        }
      }} }else {__CLR4_4_14ec4ecle6rzh0k.R.inc(5864);if ((((!a.equals(other.a))&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5865)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5866)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5867);return false;
      }
      }}__CLR4_4_14ec4ecle6rzh0k.R.inc(5868);if ((((b == null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5869)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5870)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5871);if ((((other.b != null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5872)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5873)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5874);return false;
        }
      }} }else {__CLR4_4_14ec4ecle6rzh0k.R.inc(5875);if ((((!b.equals(other.b))&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5876)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5877)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5878);return false;
      }
      }}__CLR4_4_14ec4ecle6rzh0k.R.inc(5879);if ((((c == null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5880)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5881)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5882);if ((((other.c != null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5883)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5884)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5885);return false;
        }
      }} }else {__CLR4_4_14ec4ecle6rzh0k.R.inc(5886);if ((((!c.equals(other.c))&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5887)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5888)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5889);return false;
      }
      }}__CLR4_4_14ec4ecle6rzh0k.R.inc(5890);if ((((d == null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5891)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5892)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5893);if ((((other.d != null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5894)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5895)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5896);return false;
        }
      }} }else {__CLR4_4_14ec4ecle6rzh0k.R.inc(5897);if ((((!d.equals(other.d))&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5898)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5899)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5900);return false;
      }
      }}__CLR4_4_14ec4ecle6rzh0k.R.inc(5901);if ((((e == null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5902)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5903)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5904);if ((((other.e != null)&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5905)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5906)==0&false))) {{
          __CLR4_4_14ec4ecle6rzh0k.R.inc(5907);return false;
        }
      }} }else {__CLR4_4_14ec4ecle6rzh0k.R.inc(5908);if ((((!e.equals(other.e))&&(__CLR4_4_14ec4ecle6rzh0k.R.iget(5909)!=0|true))||(__CLR4_4_14ec4ecle6rzh0k.R.iget(5910)==0&false))) {{
        __CLR4_4_14ec4ecle6rzh0k.R.inc(5911);return false;
      }
      }}__CLR4_4_14ec4ecle6rzh0k.R.inc(5912);return true;
    }finally{__CLR4_4_14ec4ecle6rzh0k.R.flushNeeded();}}
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
